package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.FieldReference
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

// swh0: Read receipt purchase dialog — references p_purchase_read_receipt_confirm_popup
private val readReceiptPurchaseDialogClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_purchase_read_receipt_confirm_popup"),
        string("read_receipt"),
    ),
)

private const val BLIVE_COMMON_CONFIG_CLASS = "Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;"
private const val PERMISSION_HELPER_CLASS = "Lcom/p1/mobile/putong/ui/permission/PermissionHelper;"

private val privacyMembershipHideLocationClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/core/data/PrivacyMembershipSetting;",
            name = "hideLocation",
        ),
        string("hideLocation"),
    ),
)

private val svipPrivacyHideLocationClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/SvipPrivacySettings;",
            name = "hideLocation",
        ),
        string("hideLocation"),
    ),
)

private val userPrivacyHideContactsClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/UserPrivacySettings;",
            name = "hideContacts",
        ),
        string("hideContacts"),
    ),
)

private val userPrivacyHideMutualContactsClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/UserPrivacySettings;",
            name = "hideMutualContacts",
        ),
        string("hideMutualContacts"),
    ),
)

private val userPrivacyHideSchoolClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/UserPrivacySettings;",
            name = "hideSchool",
        ),
        string("hideSchool"),
    ),
)

private val settingsMomentClassFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(
            definingClass = "Lcom/p1/mobile/putong/data/SettingsMoment;",
            name = "hidePublicMoments",
        ),
        string("hidePublicMoments"),
    ),
)

private fun com.android.tools.smali.dexlib2.iface.Method.accessesField(definingClass: String, fieldName: String): Boolean =
    this.implementation?.instructions?.any { instr ->
        instr is ReferenceInstruction &&
            instr.reference is FieldReference &&
            (instr.reference as FieldReference).definingClass == definingClass &&
            (instr.reference as FieldReference).name == fieldName
    } ?: false

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
    description = "Unlocks privacy features: hide from nearby, visitor footprint hiding, mysterious mode, nearby people access, read receipt unlock, read receipt dialog suppression, contact access block, location privacy, privacy settings force enable",
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

        // Read receipt purchase dialog (swh0)
        // The D1() method shows p_purchase_read_receipt_confirm_popup dialog.
        // Patch to RETURN_VOID to suppress the purchase dialog.
        readReceiptPurchaseDialogClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.containsString("p_purchase_read_receipt_confirm_popup") &&
                    method.returnType == "V"
                ) {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        // ── Pass 3: Read receipt UI enhancements (stable CamelCase classes) ──
        classDefForEach { classDef ->
            // IntlMessageReadReceiptsView: stable class for read receipt display
            // V() method shows the bubble guide promoting read receipts.
            // Patch to RETURN_VOID to suppress the guide bubble.
            if (classDef.type == "Lcom/p046p1/mobile/putong/core/p053ui/messages/view/IntlMessageReadReceiptsView;") {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.containsString("bubble_key_intl_read_receipts") &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, RETURN_VOID)
                    }
                }
            }

            // BLiveCommonConfig: stable class for live stealth privilege
            // nullCheck() method initializes default values.
            // Patch to set on = true, enabling all stealth features.
            if (classDef.type == BLIVE_COMMON_CONFIG_CLASS) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "nullCheck" &&
                        method.parameterTypes.isEmpty() &&
                        method.returnType == "V"
                    ) {
                        method.addInstructions(0, """
                            const/4 v0, 0x1
                            iput-boolean v0, p0, Lcom/p1/mobile/putong/live/base/data/BLiveCommonConfig;->on:Z
                        """)
                    }
                }
            }
        }

        // ── Pass 4: Moment privacy and block harassing words ──
        settingsMomentClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/SettingsMoment;", "hidePublicMoments") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        // ── Pass 5: Contact Access Block ──
        classDefForEach { classDef ->
            if (classDef.type == PERMISSION_HELPER_CLASS) {
                mutableClassDefBy(classDef).methods.forEach { method ->
                    if (method.name == "b" &&
                        method.parameterTypes.size == 1 &&
                        method.parameterTypes[0] == "[Ljava/lang/String;" &&
                        method.returnType == "Z" &&
                        AccessFlags.STATIC.isSet(method.accessFlags)
                    ) {
                        method.addInstructions(0, """
                            array-length v0, p0
                            if-eqz v0, :cont
                            const/4 v1, 0x0
                            aget-object v1, p0, v1
                            const-string v2, "android.permission.READ_CONTACTS"
                            invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
                            move-result v1
                            if-eqz v1, :cont
                            const/4 v0, 0x0
                            return v0
                            :cont
                        """)
                    }
                }
            }
        }

        // ── Pass 6: Location Privacy (Profile) ──
        privacyMembershipHideLocationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/core/data/PrivacyMembershipSetting;", "hideLocation") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        svipPrivacyHideLocationClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/SvipPrivacySettings;", "hideLocation") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        // ── Pass 7: Privacy Settings Force Enable ──
        userPrivacyHideContactsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/UserPrivacySettings;", "hideContacts") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        userPrivacyHideMutualContactsClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/UserPrivacySettings;", "hideMutualContacts") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }

        userPrivacyHideSchoolClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter { method ->
                    method.accessesField("Lcom/p1/mobile/putong/data/UserPrivacySettings;", "hideSchool") &&
                        (method.returnType == "Ljava/lang/Boolean;" || method.returnType == "Z") &&
                        method.parameterTypes.isEmpty()
                }
                .forEach { it.addInstructions(0, RETURN_TRUE) }
        }
    }
}
