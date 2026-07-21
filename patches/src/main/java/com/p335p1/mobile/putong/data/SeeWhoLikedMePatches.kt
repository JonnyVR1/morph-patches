package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Direct patches for the "see who liked me" feature.
 * These patches target the specific methods that check if the feature is available.
 */

/**
 * Patches CoreProduct.A4() to always return true.
 * This method checks if "see who liked me" feature is available.
 */
@Suppress("unused")
@JvmField
val seeWhoLikedMeAvailabilityPatch = bytecodePatch(
    name = "See Who Liked Me Availability",
    description = "Unlocks the 'see who liked me' feature in the Discover tab",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lcom/p1/mobile/putong/core/api/CoreProduct;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "A4" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC),
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

/**
 * Patches CoreProduct.R4() to always return false.
 * This method checks if there are remaining likers (free trial usage).
 * Making it return false means the feature is always available.
 */
@Suppress("unused")
@JvmField
val seeWhoLikedMeLikersLimitPatch = bytecodePatch(
    name = "See Who Liked Me Limit Bypass",
    description = "Removes the limit on seeing who liked you",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lcom/p1/mobile/putong/core/api/CoreProduct;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "R4" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC),
                        returnType = "Z",
                        parameters = emptyList(),
                    ).matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            const/4 v0, 0x0
                            return v0
                        """)
                    }
                }
            }
        }
    }
}

/**
 * Patches CoreProduct.u4() to always return true.
 * This method checks if a promotion is active for a given product type.
 */
@Suppress("unused")
@JvmField
val seeWhoLikedMePromotionPatch = bytecodePatch(
    name = "See Who Liked Me Promotion Bypass",
    description = "Bypasses promotion checks for premium features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lcom/p1/mobile/putong/core/api/CoreProduct;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "u4" && method.parameterTypes.size == 1 && 
                    method.parameterTypes[0] == "Ljava/lang/String;" && method.returnType == "Z") {
                    Fingerprint(
                        accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
                        returnType = "Z",
                        parameters = listOf("Ljava/lang/String;"),
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
