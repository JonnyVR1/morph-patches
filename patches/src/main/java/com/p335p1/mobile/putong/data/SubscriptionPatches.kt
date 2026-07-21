package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Patches to bypass subscription validation and feature gating.
 * These patches target methods that check if premium features are available/active.
 */

@Suppress("unused")
@JvmField
val membershipPricingBypassPatch = bytecodePatch(
    name = "Membership Pricing Bypass",
    description = "Removes membership pricing restrictions to enable all subscription tiers",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/h6a;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "c" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = emptyList(),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
            }
        }
    }
}

@Suppress("unused")
@JvmField
val ultraPremiumUnlockPatch = bytecodePatch(
    name = "Ultra Premium Unlock",
    description = "Unlocks all Ultra Premium features, availability, and access validation",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/u59;") return@classDefForEach
            classDef.methods.forEach { method ->
                // Patch U() - Ultra Premium availability check
                if (method.name == "U" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = emptyList(),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
                // Patch V(User) - Ultra Premium user validation
                if (method.name == "V" && method.parameterTypes.size == 1 && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = listOf("Lcom/p1/mobile/putong/data/User;"),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
            }
        }
    }
}

@Suppress("unused")
@JvmField
val svipAvailabilityUnlockPatch = bytecodePatch(
    name = "SVIP Availability",
    description = "Enables SVIP (Super VIP) feature availability and removes regional restrictions",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/u59;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "S" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = emptyList(),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
            }
        }
    }
}

@Suppress("unused")
@JvmField
val vipAvailabilityUnlockPatch = bytecodePatch(
    name = "VIP Availability",
    description = "Enables VIP feature availability and removes regional restrictions",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/u59;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "O" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
                        returnType = "Z",
                        parameters = emptyList(),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x1
                            return v0
                        """)
                    }
                }
            }
        }
    }
}
