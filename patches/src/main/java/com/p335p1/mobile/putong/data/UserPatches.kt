package com.p335p1.mobile.putong.data

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import com.android.tools.smali.dexlib2.AccessFlags

private fun returnTrueFingerprint() = Fingerprint(
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
)

@Suppress("unused")
@JvmField
val userIsVipPatch = bytecodePatch(
    name = "UserIsVip",
    description = "Unlocks VIP status, granting access to VIP-only features and the profile badge",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isVIP") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks SVIP (Super VIP) status, granting access to the highest VIP-only features and profile badge",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isSVIP") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks Ultra Premium status on the user profile, granting access to Ultra Premium-only features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isUltraPremium") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks Supreme Partner status on the user profile (mirrors the Settings check), enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isSupremePartner") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks Platinum tier status on the user profile (mirrors the Settings check), enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isPlatinum") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks O Diamond tier status on the user profile (mirrors the Settings check), enabling its exclusive features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isODiamond") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Unlocks an active membership for the user, granting access to membership-only features",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = listOf("Lcom/p1/mobile/putong/data/MembershipType;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isMembership") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Marks the membership as already used/claimed, bypassing membership consumption checks",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        val fingerprint = Fingerprint(
            accessFlags = listOf(AccessFlags.PUBLIC),
            returnType = "Z",
            parameters = listOf("Lcom/p1/mobile/putong/data/MembershipType;"),
        )

        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isMembershipUsed") {
                    fingerprint.matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x1
                            return v0
                            :cond_0
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
    description = "Prevents VIP status from ever expiring",
    default = true,
) {
    compatibleWith(tantanCompatibility)
    execute {
        classDefForEach { classDef ->
            if (classDef.type != TANTAN_USER_CLASS) return@classDefForEach
            classDef.methods.forEach { method ->
                if (method.name == "isVIPExpired") {
                    returnTrueFingerprint().matchOrNull(method)?.let { match ->
                        match.method.addInstructions(0, """
                            invoke-virtual {p0}, Lcom/p1/mobile/putong/data/User;->isMe()Z
                            move-result v0
                            if-eqz v0, :cond_0
                            const/4 v0, 0x0
                            return v0
                            :cond_0
                        """)
                    }
                }
            }
        }
    }
}
