package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.iface.Method
import com.android.tools.smali.dexlib2.iface.instruction.Instruction
import com.android.tools.smali.dexlib2.iface.instruction.ReferenceInstruction
import com.android.tools.smali.dexlib2.iface.reference.MethodReference
import com.android.tools.smali.dexlib2.iface.reference.StringReference

private val instructionCache = java.util.WeakHashMap<Method, List<com.android.tools.smali.dexlib2.iface.instruction.Instruction>>()
private fun Method.cachedInstructions(): List<com.android.tools.smali.dexlib2.iface.instruction.Instruction> =
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

private const val RETURN_EMPTY_LIST = """
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    move-result-object v0
    return-object v0
"""

private fun isConstructor(method: Method): Boolean =
    method.name == "<init>" || method.name == "<clinit>"

private val jmd0Fingerprint = Fingerprint(
    filters = listOf(
        string("/system/app/Superuser.apk"),
        string("/system/xbin/daemonsu"),
    ),
)

private val mmd0Fingerprint = Fingerprint(
    filters = listOf(
        string("/system/bin/cufsdosck"),
        string("/system/bin/conbb"),
    ),
)

private val ert0Fingerprint = Fingerprint(
    filters = listOf(
        string("ranchu"),
        string("generic"),
        string("emulator"),
    ),
)

private val facebookEmulatorFingerprint = Fingerprint(
    filters = listOf(
        string("google_sdk"),
        string("Genymotion"),
        string("vbox86p"),
    ),
)

private val additionalRootFingerprint = Fingerprint(
    filters = listOf(
        string("/data/local/su"),
        string("/system/xbin/su"),
        string("/su/bin/su"),
    ),
)

private val shuMengSdkFingerprint = Fingerprint(
    filters = listOf(string("shumeng_init"), string("shuzilm")),
)

private val packageEnumerationFingerprint = Fingerprint(
    filters = listOf(string("getInstalledPackages"), string("firstInstallTime")),
)

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
    description = "Advanced privacy protections: root/emulator detection bypass, ShuMeng SDK blocking, Facebook SDK emulator detection bypass, APK signature verification bypass, package enumeration prevention",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val suPathStrings = setOf("/data/local/su", "/system/xbin/su", "/su/bin/su")
        val fbEmulatorStrings = setOf("google_sdk", "Genymotion", "generic", "Emulator")

        listOf(jmd0Fingerprint, mmd0Fingerprint).forEach { fingerprint ->
            fingerprint.matchOrNull()?.classDef?.let { classDef ->
                mutableClassDefBy(classDef).methods.forEach { method ->
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

        ert0Fingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                if (method.returnType == "Z" && method.parameterTypes.size == 1 && method.parameterTypes[0] == "Z") {
                    method.addInstructions(0, RETURN_FALSE)
                }
            }
        }

        facebookEmulatorFingerprint.matchOrNull()?.classDef?.let { classDef ->
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

        shuMengSdkFingerprint.matchOrNull()?.classDef?.let { classDef ->
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

        packageEnumerationFingerprint.matchOrNull()?.classDef?.let { classDef ->
            mutableClassDefBy(classDef).methods.forEach { method ->
                if (method.implementation == null) return@forEach
                if (isConstructor(method)) return@forEach
                val callsGetInstalledPackages = method.cachedInstructions().any { instr ->
                    instr is ReferenceInstruction && instr.reference is MethodReference &&
                        (instr.reference as MethodReference).name == "getInstalledPackages"
                }
                if (callsGetInstalledPackages && method.returnType.startsWith("L") && method.returnType.endsWith(";")) {
                    method.addInstructions(0, RETURN_EMPTY_LIST)
                }
            }
        }

        additionalRootFingerprint.matchOrNull()?.classDef?.let { classDef ->
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
    }
}
