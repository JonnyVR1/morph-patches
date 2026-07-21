package app.morphe

import app.morphe.patcher.patch.Patch
import com.p1.mobile.putong.data.*

/**
 * Registry of every patch shipped by this bundle.
 *
 * Categories:
 *  1. Google Maps Compatibility  - GMS availability + Maps signature bypass
 *  2. Premium Unlock             - Tier statuses, privilege gates, subscription
 *                                  validation, regional gates, feature gates, display
 *  3. Signature Spoof            - GMS signature spoofing
 */
object PatchRegistry {
    val allPatches: Set<Patch<*>> = setOf(
        googleMapsPatch,
        premiumUnlockPatch,
        signatureSpoofPatch,
    )
}
