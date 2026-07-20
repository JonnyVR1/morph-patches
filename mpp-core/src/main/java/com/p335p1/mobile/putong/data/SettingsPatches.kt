package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstructions
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

private val tantanCompatibility = Compatibility(
    name = "Tantan",
    packageName = "com.p335p1.mobile.putong",
    description = "Tantan Chinese dating app",
    targets = listOf(
        AppTarget(
            version = "7.2.9",
            description = "Tested version"
        )
    )
)

@Suppress("unused")
val settingsSupremePartnerPatch = bytecodePatch(
    name = "SettingsSupremePartner",
    description = "Patch Settings.isSupremePartner to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val targetClass = "Lcom/p335p1/mobile/putong/data/Settings;"

        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != targetClass) return@classDefForEach
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
val settingsPlatinumPatch = bytecodePatch(
    name = "SettingsPlatinum",
    description = "Patch Settings.isPlatinum to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val targetClass = "Lcom/p335p1/mobile/putong/data/Settings;"

        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != targetClass) return@classDefForEach
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
val settingsODiamondPatch = bytecodePatch(
    name = "SettingsODiamond",
    description = "Patch Settings.userIsODiamond to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val targetClass = "Lcom/p335p1/mobile/putong/data/Settings;"

        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != targetClass) return@classDefForEach
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
val settingsDisableAdsPatch = bytecodePatch(
    name = "SettingsDisableAds",
    description = "Patch Settings.personalizeAdsSuggest to always return false",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val targetClass = "Lcom/p335p1/mobile/putong/data/Settings;"

        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = emptyList(),
        )

        classDefForEach { classDef ->
            if (classDef.type != targetClass) return@classDefForEach
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
