package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

@Suppress("unused")
@JvmField
val settingsSupremePartnerPatch = bytecodePatch(
    name = "SettingsSupremePartner",
    description = "Unlocks Supreme Partner status in app settings, enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_SETTINGS_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isSupremePartner") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.replaceInstructions(0, """
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
val settingsPlatinumPatch = bytecodePatch(
    name = "SettingsPlatinum",
    description = "Unlocks Platinum tier status in app settings, enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_SETTINGS_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isPlatinum") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.replaceInstructions(0, """
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
val settingsODiamondPatch = bytecodePatch(
    name = "SettingsODiamond",
    description = "Unlocks O Diamond tier status in app settings, enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_SETTINGS_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "userIsODiamond") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.replaceInstructions(0, """
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
val settingsDisableAdsPatch = bytecodePatch(
    name = "SettingsDisableAds",
    description = "Disables personalized ad tracking and suggestions",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_SETTINGS_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "personalizeAdsSuggest") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.replaceInstructions(0, """
                            const/4 v0, 0x0
                            return v0
                        """)
                    }
                }
            }
        }
    }
}
