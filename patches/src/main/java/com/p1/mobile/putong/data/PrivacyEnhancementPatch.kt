package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstruction
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode
import com.android.tools.smali.dexlib2.builder.instruction.BuilderInstruction21s
import com.android.tools.smali.dexlib2.iface.ClassDef
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.NarrowLiteralInstruction
import com.android.tools.smali.dexlib2.iface.instruction.OneRegisterInstruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private val instructionCache = java.util.WeakHashMap<Method, List<Instruction>>()
private fun Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) { implementation?.instructions?.toList() ?: emptyList() }

private const val RETURN_VOID = "return-void"

private const val RETURN_FALSE = """
    const/4 v0, 0x0
    return v0
"""

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private val apkSignatureVerificationFingerprint = Fingerprint(
    filters = listOf(
        fieldAccess(type = "Ljavax/security/auth/x500/X500Principal;"),
        methodCall(name = "getSubjectX500Principal"),
    ),
)

@Suppress("unused")
@JvmField
val privacyEnhancementPatch = bytecodePatch(
    name = "Privacy Enhancement",
    description = "Advanced privacy protections: root/emulator detection bypass, ShuMeng SDK blocking, Facebook SDK emulator detection bypass, APK signature verification bypass, package enumeration prevention, VPN/proxy detection bypass, overlay detection bypass, screenshot-warning nag suppression, telepathy private-photo screenshot enable",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val resolver = getSharedResolver()
        
        val suPathStrings = setOf("/data/local/su", "/system/xbin/su", "/su/bin/su")
        val fbEmulatorStrings = setOf("google_sdk", "Genymotion", "generic", "Emulator")

        val jmd0Class = resolver.getPrivacyClass("jmd0")
        val mmd0Class = resolver.getPrivacyClass("mmd0")
        val ert0Class = resolver.getPrivacyClass("ert0")
        val fbEmulatorClass = resolver.getPrivacyClass("fbEmulator")
        val additionalRootClass = resolver.getPrivacyClass("additionalRoot")
        val shuMengClass = resolver.getPrivacyClass("shuMeng")
        val adClickSubstitutionClass = resolver.getPrivacyClass("adClickSubstitution")

        listOf(jmd0Class, mmd0Class).forEach { classDef ->
            classDef?.let {
                mutableClassDefBy(it).methods.forEach { method ->
                    if (method.implementation == null) return@forEach
                    if (isConstructor(method)) return@forEach
                    if (method.returnType == "Z" && method.parameterTypes.isEmpty()) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        classDefByOrNull("Lcom/tantanapp/beatles/utils/DeviceUtil;")?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Ljava/lang/Boolean;" && method.parameterTypes.isEmpty()) {
                    method.addInstructions(0, """
                        const/4 v0, 0x0
                        invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
                        move-result-object v0
                        return-object v0
                    """)
                }
            }
        }

        ert0Class?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Z") {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        fbEmulatorClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty() && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    val hasEmulatorStrings = method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string in fbEmulatorStrings
                    }
                    if (hasEmulatorStrings) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        shuMengClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "V" && method.parameterTypes.isNotEmpty() && method.parameterTypes[0] == "Landroid/content/Context;") {
                    method.addInstructions(0, RETURN_VOID)
                }
            }
        }

        apkSignatureVerificationFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Landroid/content/Context;" && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    method.addInstructions(0, RETURN_TRUE)
                }
            }
        }

        adClickSubstitutionClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (AccessFlags.STATIC.isSet(method.accessFlags) &&
                    method.returnType == "Ljava/lang/String;" &&
                    method.parameterTypes.size == 1 &&
                    method.parameterTypes[0] == "Ljava/lang/String;" &&
                    method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string == "\\[(.*?)]"
                    }) {
                    method.addInstructions(0, """
                        move-object/from16 v0, p0
                        return-object v0
                    """)
                }
            }
        }

        additionalRootClass?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.isEmpty() && AccessFlags.STATIC.isSet(method.accessFlags)) {
                    val hasSuPaths = method.cachedInstructions().any { instr ->
                        instr is ReferenceInstruction && instr.reference is StringReference &&
                            (instr.reference as StringReference).string in suPathStrings
                    }
                    if (hasSuPaths) {
                        method.addInstructions(0, RETURN_FALSE)
                    }
                }
            }
        }

        // Screenshot-warning detector nag (pnf0): the static ()Z activation gate u() controls
        // ContentObserver registration at the CoreBusinessModule call site and the per-event
        // re-check. Local dialog + Fox analytics only — no server report, no notification to
        // the other party. Only static no-arg ()Z in the class is the gate (7.5.4).
        resolver.getMiscClass("screenshotWarning")?.let { classDef ->
            mutableClassDefBy(classDef).methods
                .filter {
                    AccessFlags.STATIC.isSet(it.accessFlags) &&
                        it.returnType == "Z" && it.parameterTypes.isEmpty()
                }
                .forEach {
                    it.preflightSmali(RETURN_FALSE, 2)
                    it.addInstructions(0, RETURN_FALSE)
                }
        }

        // FLAG_SECURE removal — Telepathy private-photo preview. Replace the const loading
        // 0x2000 (8192) that feeds Window.addFlags(I)V with 0 in place (same const/16 format,
        // zero offset shift). addFlags(0) is a no-op; status-bar/swipe-back setup stays intact.
        // Does NOT bypass payment or the server burn timer. Only app-code FLAG_SECURE site.
        classDefByOrNull("Lcom/p1/mobile/putong/core/ui/telepathy/photo/TelepathyPrivatePhotoPreviewAct;")?.let { classDef ->
            val mutable = mutableClassDefBy(classDef)
            val methodMap = classDef.methods.zip(mutable.methods).toMap()
            classDef.methods.forEach { method ->
                if (method.name != "preCreateView" ||
                    method.parameterTypes != listOf("Landroid/os/Bundle;") ||
                    method.returnType != "V") return@forEach
                val instrs = method.cachedInstructions()
                val mutableMethod = methodMap[method] ?: return@forEach
                for (i in 0 until instrs.size - 1) {
                    val cur = instrs[i]
                    val next = instrs[i + 1]
                    if (cur.opcode == Opcode.CONST_16 && cur is NarrowLiteralInstruction && cur.narrowLiteral == 8192 &&
                        next is ReferenceInstruction &&
                        (next.reference as? MethodReference)?.let {
                            it.definingClass == "Landroid/view/Window;" && it.name == "addFlags"
                        } == true
                    ) {
                        val reg = (cur as OneRegisterInstruction).registerA
                        mutableMethod.replaceInstruction(i, BuilderInstruction21s(Opcode.CONST_16, reg, 0))
                    }
                }
            }
        }

        // VPN/proxy detection (ebi0) and overlay detection (j21.b) are intentionally NOT patched:
        // they are anti-fraud/risk-scoring adjacent (kept per the tracking-only decision), and ebi0
        // has no direct app callers in 7.5.4. The old resolver anchors ("http.proxyHost"/"canDrawOverlays")
        // were method/property names, never const-strings, so those blocks were silent no-ops anyway.
        // Real package enumeration is momosec hje.t (kept) and rm60.a (already dead via bn60 void);
        // the ad-click URL device-id substitution is handled by adClickSubstitution (qm60.F) above.
    }
}
