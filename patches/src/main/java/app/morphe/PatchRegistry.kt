package app.morphe

import app.morphe.patcher.patch.Patch
import com.p1.mobile.putong.data.*

/**
 * Registry of every patch shipped by this bundle.
 *
 * Patches are grouped by *concern* (one patch per concern) rather than one
 * patch per method, so the user-facing list in Morphe Manager stays minimal
 * and each individual patch covers everything you need for that area.
 *
 * Categories:
 *  1. Google Maps Compatibility  - GMS availability + Maps signature bypass
 *  2. Premium Membership Status  - All tier statuses on the current user
 *  3. Subscription Validation    - Regional / pricing / tier-availability gates
 *  4. Premium Features           - Privilege expiration, feature gates, promotion
 *                                  checks, contract-upgrade checks
 *  5. Subscription Display       - Subscription management UI text/expiration
 */
object PatchRegistry {
    val allPatches: Set<Patch<*>> = setOf(
        googleMapsPatch,
        premiumStatusPatch,
        subscriptionValidationPatch,
        premiumFeaturesPatch,
        subscriptionDisplayPatch,
    )
}
