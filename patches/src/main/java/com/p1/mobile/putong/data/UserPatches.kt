package com.p1.mobile.putong.data

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
    name = "VIP Status",
    description = "Grants VIP membership with unlimited likes, super likes, and premium features",
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
    name = "SVIP Status",
    description = "Grants Super VIP membership with enhanced features and exclusive benefits",
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
    name = "Ultra Premium Status",
    description = "Grants Ultra Premium membership with all premium features unlocked",
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
    name = "Supreme Partner Status",
    description = "Grants Supreme Partner tier with exclusive partner benefits",
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
    name = "Platinum Status",
    description = "Grants Platinum tier membership with premium features",
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
    name = "O Diamond Status",
    description = "Grants O Diamond tier membership with exclusive diamond features",
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
    name = "Active Membership",
    description = "Activates membership subscription for all membership types",
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
    name = "Membership Consumed",
    description = "Marks membership benefits as consumed to prevent double-charging",
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
    name = "VIP Never Expires",
    description = "Prevents VIP membership from expiring",
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
