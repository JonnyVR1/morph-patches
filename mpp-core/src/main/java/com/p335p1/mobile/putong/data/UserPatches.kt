package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.replaceInstructions
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

private val userClass = "Lcom/p335p1/mobile/putong/data/User;"

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

private fun returnTrueFingerprint() = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

@Suppress("unused")
@JvmField
val userIsVipPatch = bytecodePatch(
    name = "UserIsVip",
    description = "Patch User.isVIP to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isVIP") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsSvipPatch = bytecodePatch(
    name = "UserIsSVIP",
    description = "Patch User.isSVIP to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isSVIP") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsUltraPremiumPatch = bytecodePatch(
    name = "UserIsUltraPremium",
    description = "Patch User.isUltraPremium to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isUltraPremium") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsSupremePartnerPatch = bytecodePatch(
    name = "UserIsSupremePartner",
    description = "Patch User.isSupremePartner to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isSupremePartner") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsPlatinumPatch = bytecodePatch(
    name = "UserIsPlatinum",
    description = "Patch User.isPlatinum to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isPlatinum") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsODiamondPatch = bytecodePatch(
    name = "UserIsODiamond",
    description = "Patch User.isODiamond to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isODiamond") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
val userIsMembershipPatch = bytecodePatch(
    name = "UserIsMembership",
    description = "Patch User.isMembership to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = listOf("Lcom/p335p1/mobile/putong/data/MembershipType;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isMembership") {
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
val userIsMembershipUsedPatch = bytecodePatch(
    name = "UserIsMembershipUsed",
    description = "Patch User.isMembershipUsed to always return true",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = listOf("Lcom/p335p1/mobile/putong/data/MembershipType;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isMembershipUsed") {
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
val userIsVipExpiredPatch = bytecodePatch(
    name = "UserIsVipExpired",
    description = "Patch User.isVIPExpired to always return false",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != userClass) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isVIPExpired") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
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
