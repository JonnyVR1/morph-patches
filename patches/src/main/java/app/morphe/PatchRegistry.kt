package app.morphe

import app.morphe.patcher.patch.Patch
import com.p335p1.mobile.putong.data.*

object PatchRegistry {
    val allPatches: Set<Patch<*>> = setOf(
        gmsAvailabilityBypassPatch,
        dynamiteModulePackageBypassPatch,
        mapsApiKeyBypassPatch,
        userIsVipPatch,
        userIsSvipPatch,
        userIsUltraPremiumPatch,
        userIsSupremePartnerPatch,
        userIsPlatinumPatch,
        userIsODiamondPatch,
        userIsMembershipPatch,
        userIsMembershipUsedPatch,
        userIsVipExpiredPatch,
        membershipPricingBypassPatch,
        ultraPremiumUnlockPatch,
        svipAvailabilityUnlockPatch,
        vipAvailabilityUnlockPatch,
        privilegeExpirationBypassPatch,
        privilegeAvailabilityBypassPatch,
        allPremiumFeaturesPatch,
        subscriptionContractUpgradedPatch,
    )
}
