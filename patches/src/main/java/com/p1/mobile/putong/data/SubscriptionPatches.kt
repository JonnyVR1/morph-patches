package com.p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Consolidated subscription validation bypass.
 *
 * The subscription validation classes (`p001l.h6a` and `p001l.u59`) gate which
 * subscription tiers and features the UI offers in a given region / configuration.
 * Patching these methods removes those restrictions so every tier appears
 * available regardless of region.
 *
 * Methods patched:
 * - p001l/h6a::c()                  → Membership pricing restriction
 * - p001l/u59::U()                  → Ultra Premium availability (regional gate)
 * - p001l/u59::V(User)              → Ultra Premium user validation
 * - p001l/u59::S()                  → SVIP availability
 * - p001l/u59::O()                  → VIP availability
 */

private val noArgReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = emptyList(),
)

private val oneUserArgReturnBoolFingerprint = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    returnType = "Z",
    parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
)

private const val RETURN_TRUE = """
    const/4 v0, 0x1
    return v0
"""

@Suppress("unused")
@JvmField
val subscriptionValidationPatch = bytecodePatch(
    name = "Subscription Validation",
    description = "Bypasses all regional subscription restrictions - VIP, SVIP, Ultra Premium all unlocked in any region",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val noArgMethods = setOf("c", "U", "S", "O")
        val userArgMethods = setOf("V")

        classDefForEach { classDef ->
            // h6a membership pricing check
            if (classDef.type == "Lp001l/h6a;") {
                classDef.methods.forEach { method ->
                    if (method.name in noArgMethods && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                        noArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                            match.method.addInstructions(0, RETURN_TRUE)
                        }
                    }
                }
            }
            // u59 tier availability checks (one class, multiple methods)
            if (classDef.type == "Lp001l/u59;") {
                classDef.methods.forEach { method ->
                    when {
                        method.name in noArgMethods && method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
                            noArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                        method.name in userArgMethods && method.parameterTypes.size == 1 &&
                            method.parameterTypes[0] == "Lcom/p1/mobile/putong/data/User;" &&
                            method.returnType == "Z" -> {
                            oneUserArgReturnBoolFingerprint.matchOrNull(method)?.let { match ->
                                match.method.addInstructions(0, RETURN_TRUE)
                            }
                        }
                    }
                }
            }
        }
    }
}
