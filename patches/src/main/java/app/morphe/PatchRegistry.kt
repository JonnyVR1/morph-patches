package app.morphe

import app.morphe.patcher.patch.Patch
import com.p1.mobile.putong.data.*

/**
 * Registry of every patch shipped by this bundle.
 *
 * Categories:
 *  1. Google Maps Compatibility  - GMS availability + Maps signature bypass + HTTP header interception
 *  2. Premium Unlock             - Tier statuses, privilege gates, subscription
 *                                  validation, regional gates, feature gates, display
 *  3. Signature Spoof            - GMS signature spoofing
 *  4. Messaging Enhancement      - Message limits, pin chat, voice/video calls, quick chat
 *  5. Privacy Controls           - Hide from nearby, visitor footprint, mysterious mode
 *  6. Analytics Disable          - Disable all analytics, telemetry, device fingerprinting
 *  7. Dialog Cleanup             - Remove annoying promotional dialogs
 */
object PatchRegistry {
    val allPatches: Set<Patch<*>> = setOf(
        googleMapsPatch,
        premiumUnlockPatch,
        signatureSpoofPatch,
        microGSupportPatch,
        mapsAuthHeadersPatch,
        analyticsDisablePatch,
        privacyControlsPatch,
        dialogCleanupPatch,
        messagingPatch,
    )
}
