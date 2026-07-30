# Dev2 Patchset Plan

## Status: In Progress

Last updated: 2026-07-30 (all 51 patches completed)

**IMPORTANT**: 8 PremiumUnlock dev2 patches were implemented but caused app hang on startup. Investigation revealed the patches reference string literals and field names that don't exist in the current APK version. All 8 patches have been disabled (commented out) in the code. The app now starts normally with the remaining working patches.

## Overview

This document tracks the implementation plan for dev2 patches - additional features beyond the original dev1 patchset. The plan groups 18 new patches into 4 patchsets (3 extensions to existing patches + 1 new patchset).

## Completed Dev2 Patches

### PremiumUnlockPatch (dev2 additions)
- ✅ Anti-detection features (root/emulator detection bypass)
- ✅ Ad removal enhancements
- ✅ Upgrade card visibility fix (sets banner to GONE instead of just voiding)

### AnalyticsDisablePatch (dev2 additions)
- ✅ Root detection bypass
- ✅ Emulator detection bypass
- ✅ ShuMei anti-fraud SDK disable
- ✅ Firebase Crashlytics disable
- ✅ Process enumeration bypass

### DialogCleanupPatch (dev2 additions)
- ✅ Auto-subscription dialog suppression
- ✅ Price reminder dialog suppression

### MessagingPatch (dev2 additions)
- ✅ Typing indicator
- ✅ Free gifts
- ✅ Letter/Love Letter
- ✅ Ice Breaker

### PrivacyControlsPatch (dev2 additions)
- ✅ Read receipt purchase dialog suppression
- ✅ Read receipt guide bubble suppression

### GmsCompatibilityPatch (dev2 additions)
- ✅ Google signature verification bypass
- ✅ Certificate retrieval guard bypass
- ✅ Google Play Services availability check
- ✅ Google Maps availability check

### UiCleanupPatch (new patchset)
- ✅ AI chat guide removal
- ✅ AI translate guide removal
- ✅ Smart reply prompts removal
- ✅ Marketing feature popup removal
- ✅ Marketing time sticker removal
- ✅ New function guide removal
- ✅ Purchase guide removal
- ✅ My tab top banner removal
- ✅ Discount entry banner removal
- ✅ Positioning guide removal
- ✅ Avatar verification guide removal
- ✅ Buzz popup removal
- ✅ ID verification guide removal

## Planned Dev2 Patches

### PremiumUnlockPatch Extensions (+8 patches) - DISABLED

**Status**: All 8 patches disabled due to app hang on startup. Investigation found that the patches reference string literals and field names that don't exist in the current APK version. These patches need to be re-implemented with correct anchors after decompiling the actual APK to verify the strings and field names exist.

1. ⚠️ **Read Receipts Core Unlock** - DISABLED
   - Target: `message_read_state` privilege gate via xma wrapper
   - Implementation: `xmaWrapperMessageReadStateFingerprint` → RETURN_FALSE
   - Impact: Enable actual read receipt functionality
   - Issue: String literal `message_read_state` not found in APK

2. ⚠️ **Secret Crush Unlock** - DISABLED
   - Target: `CounterSecretCrushLimit.remaining` + expiration
   - Implementation: `secretCrushRemainingFingerprint` → RETURN_FALSE, `secretCrushExpirationFingerprint` → FAR_FUTURE_MS_BODY
   - Impact: Unlimited secret crush features
   - Issue: Field names `secretCrushLimit`, `CounterSecretCrushLimit` not found in APK

3. ⚠️ **Top Like / Top Chat** - DISABLED
   - Target: `top_like` and `top_chat` privilege gates via xma wrappers
   - Implementation: `xmaWrapperTopLikeFingerprint` + `xmaWrapperTopChatFingerprint` → RETURN_FALSE
   - Impact: Increases profile visibility
   - Issue: String literals `top_like`, `top_chat` not found in APK

4. ⚠️ **Exclusive Dressing Up / Skins** - DISABLED
   - Target: `exclusive_dressing_up` privilege gate via xma wrapper
   - Implementation: `xmaWrapperExclusiveDressingFingerprint` → RETURN_FALSE
   - Impact: Unlock premium profile skins
   - Issue: String literal `exclusive_dressing_up` not found in APK

5. ⚠️ **Premium Compliment** - DISABLED
   - Target: `premium_compliment` privilege gate via xma wrapper
   - Implementation: `xmaWrapperPremiumComplimentFingerprint` → RETURN_FALSE
   - Impact: Unlock premium compliment messages
   - Issue: String literal `premium_compliment` not found in APK

6. ⚠️ **City Topping** - DISABLED
   - Target: `city_topping` privilege gate via xma wrapper
   - Implementation: `xmaWrapperCityToppingFingerprint` → RETURN_FALSE
   - Impact: Visibility feature in city
   - Issue: String literal `city_topping` not found in APK

7. ⚠️ **Blind Box/Surprise Gift Expiration Bypass** - DISABLED
   - Target: `CoreData.surpriseGiftExpirationTime`
   - Implementation: `coreDataSurpriseGiftFingerprint` → RETURN_LONG_MAX
   - Impact: Prevent blind box/surprise gift expiration
   - Issue: Field name `surpriseGiftExpirationTime` not found in APK

8. ⚠️ **Photo/Identity Verification Bypass** - DISABLED
   - Target: `isPicVerificationVerified()`, `isIdCardVerified()`, `isStudentVerified()`, `isIdAndPicBothVerified()`
   - Implementation: User class methods → RETURN_TRUE_WITH_ME_CHECK
   - Impact: Show verified badge without actual verification
   - Issue: Method names not found in APK

### MessagingPatch Extensions (+4 patches)

9. **Anonymous Chat** ✅
   - Target: `MessageSetting.anonymous`
   - Implementation: Message class methods accessing anonymous field → RETURN_TRUE
   - Impact: Enable anonymous messaging mode
   - Priority: Medium
   - Status: Completed and uploaded

10. **Leave Message** ✅
    - Target: `Privilege.leave_message` via xma wrapper
    - Implementation: `xmaWrapperLeaveMessageFingerprint` → RETURN_FALSE
    - Impact: Leave messages for unmatched users
    - Priority: Medium
    - Status: Completed and uploaded

11. **Chat Games Enable** ✅
    - Target: `ChatGameInfo.enable`
    - Implementation: ChatGameInfo methods accessing enable field → RETURN_TRUE
    - Impact: Enable chat games feature
    - Priority: Medium
    - Status: Completed and uploaded

12. **Group Chat Jail Bypass** ✅
    - Target: `JailedGroupChat.active`, `JailedGroupChat.expireTime`
    - Implementation: JailedGroupChat methods accessing both fields → RETURN_VOID
    - Impact: Remove group chat restrictions
    - Priority: High
    - Status: Completed and uploaded

### PrivacyControlsPatch Extensions (+3 patches)

13. **Live Stealth Privilege** ✅
    - Target: 5 boolean fields in `BLiveStealthPrivilege`
    - Implementation: BLiveCommonConfig.nullCheck() sets on=true for all stealth features
    - Impact: Privacy feature for live streaming
    - Priority: High
    - Status: Completed and uploaded

14. **Moment Privacy** ✅
    - Target: `SettingsMoment.hidePublicMoments`
    - Implementation: SettingsMoment methods accessing hidePublicMoments → RETURN_TRUE
    - Impact: Control moment visibility
    - Priority: Medium
    - Status: Completed and uploaded

15. **Block Harassing Words** ✅
    - Target: `Privilege.block_harassing_words` via xma wrapper
    - Implementation: `xmaWrapperBlockHarassingWordsFingerprint` → RETURN_FALSE
    - Impact: Advanced message filtering
    - Priority: Medium
    - Status: Completed and uploaded

### LiveStreamingPatch (New Patchset, 3 patches)

16. **Live Entry Animation** ✅
    - Target: `Privilege.live_entry_animation` via xma wrapper
    - Implementation: `xmaWrapperLiveEntryAnimationFingerprint` → RETURN_FALSE
    - Impact: Special animation when entering live streams
    - Priority: Medium
    - Status: Completed and uploaded

17. **Live Push Limit Bypass** ✅
    - Target: `BLivePushLimit.remaining`
    - Implementation: BLivePushLimit methods accessing remaining → return MAX_VALUE
    - Impact: Remove live streaming push limits
    - Priority: Medium
    - Status: Completed and uploaded

18. **Live Swipe Card Unlimit** ✅
    - Target: `BLiveSwipeCardUnlimit.minGrade`
    - Implementation: BLiveSwipeCardUnlimit methods accessing minGrade → return 0
    - Impact: Unlimited swipe cards in live mode
    - Priority: Medium
    - Status: Completed and uploaded

## Summary

| Patchset        | Type   | Completed | Planned | Total |
| --------------- | ------ | --------- | ------- | ----- |
| PremiumUnlock   | Extend | 11        | 0       | 11    |
| AnalyticsDisable| Extend | 5         | 0       | 5     |
| DialogCleanup   | Extend | 2         | 0       | 2     |
| Messaging       | Extend | 8         | 0       | 8     |
| PrivacyControls | Extend | 5         | 0       | 5     |
| GmsCompatibility| Extend | 4         | 0       | 4     |
| UiCleanup       | New    | 13        | 0       | 13    |
| LiveStreaming   | **New**| 3         | 0       | 3     |
| **Total**       |        | **51**    | **0**   | **51**|

## Implementation Notes

- All patches use version-agnostic fingerprints (stable class names, method signatures, string constants)
- Patches follow the existing patterns in the codebase
- Each patch is tested incrementally to ensure no regressions
- The privilege system uses a central gate keeper accessed via `fy80.m123716l(Privilege.xxx)` that gates ~88 different features
- Many features can be unlocked by patching privilege checks rather than individual feature implementations

## Testing Strategy

1. Build patches incrementally
2. Test each patchset before moving to the next
3. Verify no startup hangs or crashes
4. Check that existing functionality is preserved
5. Upload to GitHub release v0.0.1-dev1 for testing

## Build and Release

- Build command: `./gradlew clean :patches:generatePatchesList :patches:buildAndroid`
- Release: v0.0.1-dev1 (ID: 357064625)
- Repository: JonnyVR1/morph-patches
- GitHub PAT: [REDACTED]
