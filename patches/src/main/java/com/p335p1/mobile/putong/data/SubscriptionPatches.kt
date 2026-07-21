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
val ultraPremiumRegionUnlockPatch = bytecodePatch(
    name = "Ultra Premium Availability",
    description = "Enables Ultra Premium feature availability in your region",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/u59;") return@classDefForEach
            classDef.methods.forEach { method ->
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
            }
        }
    }
}

@Suppress("unused")
@JvmField
val ultraPremiumAccessUnlockPatch = bytecodePatch(
    name = "Ultra Premium Access",
    description = "Grants access to Ultra Premium features and removes activation restrictions",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/u59;") return@classDefForEach
            classDef.methods.forEach { method ->
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
