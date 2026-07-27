package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_VOID = "return-void"

// ── Class fingerprints anchored on stable privilege-name strings ──

// vo50: OnlineZone view — references nearby_people + "p_home_nearby,online"
private val nearbyPeopleOnlineClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_home_nearby,online"),
    ),
)

// k7y: NearbyPresenter — references nearby_people + "p_meet_nearby,default"
private val nearbyPeopleMeetClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_meet_nearby,default"),
    ),
)

// l920: NearbyPresenter view — references nearby_people + D9/bg gate pattern
private val nearbyPeoplePresenterClassFingerprint = Fingerprint(
    filters = listOf(
        string("nearby_people"),
        string("p_suggest_nearby"),
    ),
)

// c220/h120: visitor footprint purchase dialog triggers
private val visitorFootprintGateClassFingerprint = Fingerprint(
    filters = listOf(
        string("visitor_hide_footprint"),
        string("p_navigation_visit,isee"),
    ),
)

// ── Helpers ──

private fun com.android.tools.smali.dexlib2.iface.Method.callsMethodNamed(name: String): Boolean =
    this.implementation?.instructions?.any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is MethodReference &&
            (instr.reference as MethodReference).name == name
    } ?: false

private fun com.android.tools.smali.dexlib2.iface.Method.containsString(str: String): Boolean =
    this.implementation?.instructions?.any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is StringReference &&
            (instr.reference as StringReference).string == str
    } ?: false

@Suppress("unused")
@JvmField
val privacyControlsPatch = bytecodePatch(
    name = "Privacy Controls",
    description = "Unlocks privacy features: hide from nearby, visitor footprint hiding, mysterious mode, nearby people access",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        // ── Pass 1: Stable classes ──
        classDefForEach { classDef ->
            // HiddenNearByView: stable CamelCase class
            // The m(View) click handler checks xj()/L3()/f3() before toggling.
            // xma.L3() is already patched TRUE in PremiumUnlockPatch, so the toggle
            // always happens. As a safeguard, patch s() (the purchase dialog path)
            // to RETURN_VOID so even if the gate logic changes, no dialog appears.
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/settings/filter/newui/HiddenNearByView;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "s" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // MyVisitorsItemView: stable class for visitor footprint
            // Patches the click handler that calls wh() with visitor_hide_footprint
            // to RETURN_VOID, preventing the purchase dialog from appearing.
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/visitor/myvisitors/MyVisitorsItemView;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.containsString("p_navigation_visit,isee") &&
                        method.containsString("visitor_hide_footprint") &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // PrivilegeContentDlgItemView: displays privilege details
            // Patch the Hm() calls for our target privileges to prevent
            // purchase dialog redirects from the privilege detail UI.
            if (classDef.type == "Lcom/p1/mobile/putong/core/ui/vip/privilege/dlg/PrivilegeContentDlgItemView;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    val targetsPrivacyPrivilege = method.containsString("mysterious_mode") ||
                        method.containsString("visitor_hide_footprint") ||
                        method.containsString("nearby_people") ||
                        method.containsString("hide_me_from_nearby")
                    if (targetsPrivacyPrivilege &&
                        method.callsMethodNamed("Hm") &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }
        }

        // ── Pass 2: Obfuscated classes resolved via fingerprints ──

        // vo50: OnlineZone view — nearby_people gate
        // The f() method checks D9()/bg() before showing purchase dialog.
        // D9()=FALSE and bg()=FALSE already cause fallthrough to direct access.
        // Patch as safeguard: neutralize the gate method so it always loads directly.
        nearbyPeopleOnlineClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.containsString("p_home_nearby,online") &&
                    method.containsString("nearby_people") &&
                    (method.callsMethodNamed("D9") || method.callsMethodNamed("bg")) &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // k7y: NearbyPresenter — nearby_people gate via Fs()
        // The method checks !Fs() before showing purchase dialog.
        // Fs()=TRUE (via zb90.h()→xma.L3()→TRUE) already prevents the dialog.
        // Patch as safeguard: neutralize the gate method.
        nearbyPeopleMeetClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.containsString("p_meet_nearby,default") &&
                    method.containsString("nearby_people") &&
                    method.callsMethodNamed("Fs") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // l920: NearbyPresenter view — nearby_people gate via D9()/bg()
        // Same pattern as vo50. The a() method checks D9()/bg() before purchase dialog.
        nearbyPeoplePresenterClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.containsString("p_suggest_nearby") &&
                    method.containsString("nearby_people") &&
                    (method.callsMethodNamed("D9") || method.callsMethodNamed("bg")) &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // Visitor footprint gate classes (c220/h120)
        // These call wh() with visitor_hide_footprint to show purchase dialogs.
        // Patch to RETURN_VOID to suppress the dialogs.
        visitorFootprintGateClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.containsString("visitor_hide_footprint") &&
                    method.containsString("p_navigation_visit,isee") &&
                    method.callsMethodNamed("wh") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }
    }
}
