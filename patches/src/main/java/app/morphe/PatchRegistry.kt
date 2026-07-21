package app.morphe

import app.morphe.patcher.patch.Patch
import com.p335p1.mobile.putong.data.*

object PatchRegistry {
    val allPatches: Set<Patch<*>> = setOf(
        userIsVipPatch,
        userIsSvipPatch,
        userIsUltraPremiumPatch,
        userIsSupremePartnerPatch,
        userIsPlatinumPatch,
        userIsODiamondPatch,
        userIsMembershipPatch,
        userIsMembershipUsedPatch,
        userIsVipExpiredPatch,
    )
}
