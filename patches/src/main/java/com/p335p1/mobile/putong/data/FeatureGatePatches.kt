package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

/**
 * Feature-level patches for "see who liked me" functionality.
 * 
 * The "see who liked me" feature has two separate validation layers:
 * 1. Display layer (subscription status UI) - already patched via xma.S3()
 * 2. Feature gate layer (actual functionality) - THIS is what's blocking the feature
 * 
 * xma.L3() is the critical gate that controls whether the feature actually works.
 * It currently returns false unless in test mode, which blocks:
 * - The like action when viewing visitors
 * - Hides real profiles and shows fake/blurred placeholders
 * - Keeps the "Get Privilege" CTA visible
 * 
 * This patch makes L3() always return true, unlocking the actual feature functionality.
 */
@Suppress("unused")
@JvmField
val seeWhoLikedMeFeatureGatePatch = bytecodePatch(
    name = "See Who Liked Me Feature Gate",
    description = "Unlocks the actual functionality of 'see who liked me' feature - allows viewing and liking profiles, removes fake placeholder data",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != "Lp001l/xma;") return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "L3" && method.parameterTypes.isEmpty() && method.returnType == "Z") {
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
