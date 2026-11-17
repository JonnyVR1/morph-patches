# Morph - Tantan Android Patch Project

## Overview
This repository contains patches and tools for the Tantan Android APK (international version, v7.5.4). The project includes 11 patchsets covering premium feature unlocking, privacy protection, analytics disabling, messaging enhancements, dialog cleanup, ad removal, root/emulator detection bypass, live streaming features, UI cleanup, Google Maps compatibility, and remote config overrides.

**Target:** International version only. China-specific features (WeChat Pay, Alipay, QQ login, Huawei services) are dead code in the international APK and should NOT be patched.

## Workspace Configuration
```json
{
  "name": "Morph",
  "path": "/Users/jonathon/RiderProjects/Morph"
}
```

## Files
- `patches/` - Individual bypass patch implementations
- `patches-list.json` - Auto-generated patch metadata
- `patches-bundle.json` - Bundle configuration
- `tantan-tribe-decompiled/` - Decompiled Tantan APK source for reverse engineering
- `tantan-decompiled-7.5.4/` - Decompiled Tantan 7.5.4 APK source (52,187 Java files)

## Build and Release Commands

### Build Patches
```bash
# Build the patch bundle with DEX bytecode and metadata (RECOMMENDED)
./gradlew :patches:repackMppWithPatchList

# This command chains:
# 1. buildAndroid - compiles Kotlin to DEX bytecode
# 2. generatePatchesList - generates patches-list.json metadata
# 3. repacks both into the .mpp file
```

**Important:** Always use `:patches:repackMppWithPatchList` to build the .mpp file. This ensures the .mpp contains both `classes.dex` (patch bytecode) and `patches-list.json` (patch metadata). Using individual tasks like `:patches:buildAndroid` or `:patches:build` alone will produce an incomplete .mpp file that Morph Manager cannot read correctly (shows "0 patches found").

**Verification:** After building, verify the .mpp contains both files:
```bash
unzip -l patches/build/libs/patches-0.0.1-dev2.mpp | grep -E "classes.dex|patches-list.json"
```
Expected output:
```
   209000  01-01-1970 01:00   classes.dex
     8633  08-05-2026 19:30   patches-list.json
```

### Local Patch Test (End-to-End Pipeline)

To produce an actual patched APK from the local source APK (useful for verifying patches before publishing):

```bash
./gradlew :patches:patchApk
```

Output: `tantan-premium-unlocked.apk` in repo root (~55 MB, signed, installable).

The pipeline is:
1. `Patcher` runs all patches from `PatchRegistry.allPatches`
2. `PatcherResult.applyTo(rebuiltApk)` overlays patched dex/resources onto the APK in-place (via `ZFile.openReadWrite`)
3. `ApkUtils.signApk(...)` signs with the dev keystore

**Do NOT call `ApkMerger.merge()` after `applyTo()`** — see "Morphe Patcher Gotchas" below.

### Upload to GitHub Release
```bash
# List current release assets
curl -s -H "Authorization: token $GITHUB_TOKEN" \
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/362723625/assets" | \
  python3 -c "import json, sys; data = json.load(sys.stdin); [print(f'{a[\"id\"]} {a[\"name\"]}') for a in data]"

# Delete old assets (replace ASSET_ID with actual IDs from above)
curl -s -X DELETE -H "Authorization: token $GITHUB_TOKEN" \
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/assets/ASSET_ID"

# Upload new .mpp file
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/octet-stream" \
  --data-binary @patches/build/libs/patches-0.0.1-dev2.mpp \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/362723625/assets?name=patches-0.0.1-dev2.mpp" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'mpp: {d.get(\"name\", \"ERR\")}')"

# Upload patches-list.json
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  --data-binary @patches-list.json \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/362723625/assets?name=patches-list.json" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'json: {d.get(\"name\", \"ERR\")}')"

# Upload patches-bundle.json
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  --data-binary @patches-bundle.json \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/362723625/assets?name=patches-bundle.json" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'bundle: {d.get(\"name\", \"ERR\")}')"
```

### Verify Upload
```bash
# Check uploaded file sizes
curl -s -H "Authorization: token $GITHUB_TOKEN" \
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/362723625/assets" | \
  python3 -c "import json, sys; assets = json.load(sys.stdin); [print(f'{a[\"name\"]}: {a[\"size\"]} bytes') for a in assets]"
```

Expected file size for `patches-0.0.1-dev2.mpp`: ~880 KB (includes DEX bytecode for all 10 patches). If it's significantly smaller (~40 KB), the buildAndroid task was not run.

## Patch Architecture

The project uses 10 patches registered in `PatchRegistry.kt`. All patch files are in `patches/src/main/java/com/p1/mobile/putong/data/`:

### Premium Unlock (`PremiumUnlockPatch.kt`)
The largest and most complex patch. Handles:
- User tier status methods (isUltraPremium, isVIP, isSVIP, isPlatinum, isSupremePartner)
- Privilege gates and expiration checks (xma class)
- Subscription validation and regional gates (u59 class)
- Feature gates and display timestamps (CounterSuperlikeAndUndoLimit, CoreProduct, etc.)
- Auto-subscription dialog suppression (src0 class)
- Mystery/blur gating (sb90 Companion class)
- Daily like limit bypass (h0.b, l1.b, m1.b)
- Ad removal (NavigationBarAdmobHelper, NavigationBarAdView, NativeAdViewCard)
- Boost remaining count (n3b0.d, BoostRemainingCountView)
- Search filter expansion (Settings radius/age limits)
- Server refresh prevention (pib.W9 → Observable.just)
- VIP badge override (zva0, tm90)
- Spotlight/boost activation (gqf0, CoreBusinessServiceIml)
- Counter limits (likeLimit, superLikeLimit, undoLimit, boostLimits)
- Privacy features (hide_me_from_nearby, visitor_hide_footprint, nearby_people)
- Read receipts (intl_message_read, message_read_state)
- Ultra premium O-Diamond (isODiamond field, d79.W method)
- Purchase gate bypass (CoreProduct.S4)
- Swipe rate limit bypass (gra class)

**Note:** nullCheck() methods in these classes are NOT patched (see Gotcha #8).

### Privacy Controls (`PrivacyControlsPatch.kt`)
Unlocks privacy features:
- Hide from nearby (`hide_me_from_nearby` privilege)
- Visitor hide footprint (`visitor_hide_footprint` privilege)
- Mysterious mode (`mysterious_mode` privilege)
- Nearby people access (`nearby_people` privilege)

**Note:** nullCheck() methods in these classes are NOT patched (see Gotcha #8).

### Messaging Enhancement (`MessagingPatch.kt`)
Enhances messaging features:
- Message limits removal (ChatPartnerConfig limits)
- Pin chat unlimited (PlatinumPinChat expiration)
- Voice/video calls (LoveBuzzData remaining counts - consolidated single-pass scan)
- Quick chat features (quickchat privileges)
- Typing indicator control (conversation view model X2 method)
- Visitor message limits (ODiamondVisitorMessageGuideConfig)
- Conversation entry limits (PrologueConfig)
- Buzz call toggles (voiceBuzz, videoBuzz, textBuzz, memojiBuzz)
- Secret crush limits (CounterSecretCrushLimit)
- Boost limits (BoostLimit remaining/duration)
- Live chat limits (LiveChatLimit)

**Note:** nullCheck() methods in these classes are NOT patched (see Gotcha #8).

### Analytics Disable (`AnalyticsDisablePatch.kt`)
Disables all tracking and telemetry:
- FoxStatistics (custom analytics)
- AppsFlyer (attribution tracking)
- CleverTap (engagement analytics)
- Facebook AppEvents
- Beatles APM (crash reporting)
- OAID device fingerprinting
- Central device fingerprint collector (dk50 - IMEI, MAC, IP, LBS, UA)
- Device info collector (vrq0 - ANDROIDID, IMEI, MAC, IP)
- Device fingerprint hash generator (nuq0)

### Dialog Cleanup (`DialogCleanupPatch.kt`)
Removes annoying promotional dialogs:
- 5-star rating dialog (`p_intl_5star_dialog_view`)
- Appstore rating filter (`p_appstore_rating_filter_popup`)
- Version upgrade prompt (`p_alert_version_upgrade_popup`)
- Offline popup (`p_offline_popup`)
- Notification permission prompt (`p_prompt_notification_auth_popup_view`)
- Phone auth popups (`p_second_prompt_phone_auth_popup_view`, `p_sys_phone_auth_popup_view`, `p_prompt_phone_auth_popup_view`)
- VIP upgrade popup (`p_vip_upgrade_popup`)
- Purchase pages (`p_purchase_guide_page`, `p_purchase_expire_page`, `p_purchase_page`)
- Welcome back popup (`p_welcomeback_popup`)

### GMS Compatibility (`GmsCompatibilityPatch.kt`)
Consolidated patch that makes Google Maps and GMS-dependent features work in re-signed APKs. Includes:
- Signature spoofing via ContentProvider (hooks PackageManager to return original Tantan certificate)
- Maps auth header injection (replaces X-Android-Cert and X-Android-Package with original Tantan values)
- MicroG support (rewrites `com.google.android.gms` → `app.revanced.android.gms`, adds manifest metadata)
- GMS availability bypass (forces `isGooglePlayServicesAvailable` to return SUCCESS)

### Ad Removal (`AdRemovalPatch.kt`)
Removes all ad displays:
- Navigation bar bottom banner ads (NavigationBarAdView, NavigationBarAdmobHelper)
- Native feed ad cards disguised as user profiles (NativeAdViewCard)
- Live streaming banner ads (LiveVideoBannerAdCardView)
- Live square native ads (IntlLiveSquareFeedNativeAdView)
- Live square banner ads (IntlLiveSquareFeedBannerAdView)

### Privacy Enhancement (`PrivacyEnhancementPatch.kt`)
Advanced privacy protections:
- Root detection bypass (jmd0, mmd0 classes)
- Emulator detection bypass (ert0, DeviceUtil classes)
- ShuMeng SDK blocking (r8f0 - Chinese data collection SDK)
- Package enumeration prevention (o0e - installed app list collection)

### Shared Constants (`Constants.kt`)

### Remote Config Override (`RemoteConfigOverridePatch.kt`)
Overrides remote configuration values for beneficial defaults:
- `F()` (string getter): returns `{}` for `popup_schedule_config` (disables popup scheduling), returns `""` for `ttt_tab_bar_bottom_banner` (disables nav bar ads)
- `s()` (boolean exists): returns false for `bad_token_exprie_control` (prevents aggressive token expiry)
- `z()` (int with default): returns 9999 for `showQuickChatCardSwipedCount` (removes quick chat limit)
- `B()` (long with default): returns 0L for `intl_text_buzz_auto_delete_interval` (disables text buzz auto-delete)

### Shared Constants (`Constants.kt`)
Shared constants: `TANTAN_PACKAGE_NAME`, `TANTAN_USER_CLASS`, `tantanCompatibility`.

All tier overrides MUST use `isMe()` guards to ensure they only affect the current user, not other users' profiles.

### Region Detection & China vs International Features

The international APK has a critical region detection mechanism that determines which features are active:

**Master Switch:** `IntlCountryCodeController.m29114k()` (HMS check)
- Returns `TextUtils.equals("hms", "gms")` which is **ALWAYS FALSE** in the international APK
- This means ALL China-only code paths are dead code and never execute
- All features gated behind `!m29114k()` (i.e., "not China") are always enabled

**China-Only Features (DO NOT PATCH - Dead Code):**
- WeChat Pay, Alipay, Huabei, JD Pay payment flows
- WeChat Login, QQ Login flows
- Weibo sharing integration
- Huawei push/services (HWPushEngine, Huawei AppGallery)
- `nightclub_config` (international uses `intl_nightclub_config`)
- `LiveRegionTag.mainland` specific features
- Chinese locale-specific features (`zh`+`CN` checks)

**International-Only Features (SAFE TO PATCH):**
- All features with `intl_` prefix
- Google Play Billing (`IntlPayMethod.nativeMethod`)
- Facebook/Google social login
- Firebase push notifications
- All premium features (VIP, SVIP, Ultra Premium)
- All feature flags in `d79` class (gated by `!m29114k()`)
- All region-specific UI for non-China regions

**Risk Assessment:**
- Patching China-only code is harmless but pointless (never executed)
- The real risk is patching a method used by international users but misidentified as China-only
- Always verify the gating condition before patching
- Our existing patches all target international features and are safe

### Version-Agnostic Fingerprints

Patches MUST survive obfuscation churn between app versions. **Never match obfuscated names like `Lp001l/xma;` or `Lp1/...`**. Use `string()`, `methodCall()`, `fieldAccess()`, `opcode()` filters anchored against stable product strings and behavioral signatures:

| Class | Anchor |
|-------|--------|
| `User` | CamelCase stable (`com/p1/mobile/putong/data/User`) |
| `xma` | `string("/summarized-privileges?with=diamond")` |
| `sb90` Companion | `fieldAccess(localRelationship)` + `string("matched")` + `methodCall(isSupremePartnerOpenMystery)` |
| `u59` | `methodCall("Lcom/.../IntlCountryCodeController;", "k")` + `string("intl_instantmatch_open_user")` |
| `src0` | `string("recall_dlg_show")` + `string("reauto_duration")` + `string("reauto_product")` + `string("if_auto_order")` |
| `th5` | `string("vas_commercial_card_right_slide_strategy")` |
| `h6a` | `string("ttt_membership_price_diff")` |
| `qgl0` | `string("暂未激活黑金会员")` |
| `pib` | `string("users/{userId}")` (server refresh) |
| `n3b0` | `fieldAccess(likersLimit)` + `fieldAccess(boostLimits)` |
| `sja` | `string("picks")` + `string("seeWhoLikedMe")` |
| `h0/l1/m1` | Stable CamelCase (`com/p1/mobile/putong/core/newui/home/base/impl/swipe/`) |
| `NavigationBarAdmobHelper` | `string("intl_ad_show_bottom_banner")` + `string("ttt_tab_bar_bottom_banner")` |
| `NavigationBarAdView` | `string("ca-app-pub-6567608331519569/1242795139")` |
| `NativeAdViewCard` | `string("ca-app-pub-6567608331519569/7831936718")` |
| `Settings` | CamelCase stable (`com/p1/mobile/putong/data/Settings`) |
| `BoostRemainingCountView` | CamelCase stable (`com/p1/mobile/putong/core/newui/home/BoostRemainingCountView`) |
| `HiddenNearByView` | CamelCase stable + `string("hide_me_from_nearby")` |
| `MyVisitorsItemView` | CamelCase stable + `string("visitor_hide_footprint")` |
| `PrivilegeContentDlgItemView` | CamelCase stable + `string("mysterious_mode")` |
| `ChatPartnerConfig` | `fieldAccess(messageLimit)` + `fieldAccess(perday)` |
| `PlatinumPinChat` | `fieldAccess(expireTime)` |
| `LoveBuzzData` | Consolidated single-pass: `fieldAccess(LoveBuzzData.remainingVoiceBuzz/TextBuzz/VideoBuzz/MemojiBuzz)` via `classDefForEach` pre-filter |
| Typing indicator | `fieldAccess(KeepConnection.chatTypingOpen)` + `fieldAccess(KeepConnection.chatTypingInterval)` + `methodCall(interval)` |
| FoxStatistics (`zvf0`) | `string("e_request_none_oaid")` |
| AppsFlyer | `string("dmfeSDkpVxP8m6Ys6yJCpn")` (dev key) |
| CleverTap | `string("CleverTap SDK initialized with accountId")` |
| Facebook AppEvents | `string("facebook-core_release")` |
| Beatles APM | `string("com.tantanapp.beatles")` |
| OAID (`k200`) | `string("miit_oaid")` |
| Device fingerprint collector (`dk50`) | `string("[IMEI]")` + `string("[OAID]")` + `string("[MAC]")` |
| Device fingerprint hash (`nuq0`) | `string("device_fingerprint")` + device ID collection |
| Device info collector (`vrq0`) | `string("ANDROIDID")` + `string("IMEI")` + `string("MAC")` |
| Root detection (`jmd0`) | `string("/system/app/Superuser.apk")` + `string("/system/xbin/daemonsu")` |
| Root detection (`mmd0`) | `string("/system/bin/cufsdosck")` + `string("/system/bin/conbb")` |
| Emulator detection (`ert0`) | `string("ranchu")` + `string("generic")` + `string("emulator")` |
| Emulator detection (`DeviceUtil`) | `string("goldfish")` + `string("Genymotion")` + `string("vbox86p")` |
| ShuMeng SDK (`r8f0`) | `string("shumeng_init")` + `string("shuzilm")` |
| Package enumeration (`o0e`) | `string("getInstalledPackages")` + `string("firstInstallTime")` |
| Live streaming banner ad | CamelCase stable (`LiveVideoBannerAdCardView`) |
| Live square native ad | CamelCase stable (`IntlLiveSquareFeedNativeAdView`) |
| Live square banner ad | CamelCase stable (`IntlLiveSquareFeedBannerAdView`) |
| CounterSecretCrushLimit | `fieldAccess(remaining)` + `fieldAccess(total)` |
| BoostLimit | `fieldAccess(remaining)` + `fieldAccess(duration)` |
| LiveChatLimit | `fieldAccess(remaining)` + `fieldAccess(total)` |
| ODiamondVisitorMessageGuideConfig | `fieldAccess(total_limit_daily)` + `fieldAccess(user_limit_daily)` |
| PrologueConfig | `fieldAccess(enter_conv_limit)` + `fieldAccess(untalked_daily_show_count)` |
| RemoteConfig | CamelCase stable (`com/p1/mobile/putong/remote_config/RemoteConfig`) — override `s()` (boolean), `y()`/`z()` (int), `A()`/`B()` (long), `F()` (string) for specific config keys |

For groups of byte-identical overloaded methods (e.g. u59's U/S/O/F/Z/a0/D all return `!IntlCountryCodeController.k()`), fingerprint them as one cluster — they cannot be reliably separated.

Use **bounded** `matchAll(classDef, expectedRange)` to assert expected cardinalities (e.g. `1..2` not `0..N`).

## Morphe Patcher Gotchas

Critical non-obvious behaviors of Morphe v2.4.0 + plugin v2.1.0 (upgraded from v1.6.0/v1.3.3 in Nov 2026 — see gotcha #16). **Read before touching patches or PatcherMain.**

### 1. Fingerprint caching: never resolve inside `classDefForEach`

`Fingerprint.matchOrNull(classDef)` caches its result per `classDef` **per Fingerprint instance** for the lifetime of the patcher. If you call it inside `classDefForEach { classDef -> ... matchOrNull(classDef) ... }`, it returns whatever the first classDef cached — usually the wrong class — and silently applies to every iteration, including non-matching classes. Prepending `addInstructions(0, ...)` to a loop function produces an **infinite hang at compile time** ("Stripping 275 modified classes" never finishes).

**Solution:** Restructure `execute { }` into 2 passes:
- **Pass 1** (`classDefForEach`): only iterate classes with stable identifiers (e.g. `User`, `CoreProduct` — known CamelCase names)
- **Pass 2** (top-level): resolve obfuscated class fingerprints once via `classFingerprint.matchOrNull()?.classDef?.let { ... }`

### 1b. `matchOrNull(method)` cache: same trap at method granularity

The `matchOrNull(method)` and `matchOrNull(method, classDef)` overloads share the same `_matchOrNull` cache as the class-level variants. The first call matches a method and caches it; every subsequent call returns the **cached Match** — even if you pass a different method. Consequence: in a loop like

```kotlin
classDef.methods.forEach { method ->
    if (someCondition(method)) {
        someFingerprint.matchOrNull(method)?.let { match ->
            match.method.addInstructions(0, REPLACEMENT)
        }
    }
}
```

only the FIRST method that satisfies `someCondition` is patched. Subsequent methods silently get the cached first match's `match.method`, so `addInstructions` writes the same replacement into the same first method (a no-op). Symptoms: one method patched, the rest of the set silently left original.

**Real-world case:** `CoreProduct` has 10 public no-arg boolean methods (`A4/B4/y4/T4/Q4/z4/R4/L4/O4/P4`) all sharing `accessFlags={PUBLIC}, returnType=Z, parameters=[]`. The original loop only patched `A4` (the first one in dex declaration order). `B4` and `y4` kept calling `u4("vip")`, which a sibling patch forces to `RETURN_TRUE` — so the "send message" / "see who liked me" purchase dialog gates opened and crashed with `NullPointerException` on `FreeTrialData.titleText` (`r0` was never populated).

**Solution:** once you've narrowed by class descriptor (e.g. inside `if (classDef.type == CoreProduct)`), skip the fingerprint entirely and patch methods directly:

```kotlin
mutableClassDefBy(classDef).methods
    .filter { someCondition(it) }
    .forEach { it.addInstructions(0, REPLACEMENT) }
```

`mutableClassDefBy` returns a `MutableClassDef` whose `.methods` is `List<MutableMethod>` — the only type with `addInstructions(String)`. Never call `matchOrNull(method)` per-method in a loop.

### 2. `ApkMerger` is for App Bundles, not standalone APKs

`ApkMerger.merge(input, output)` calls `extractFile()` which filters ZIP entries by `.apk` extension. A standalone single-module APK has no such entries, so it throws `IOException("No *.apk files found on: $file")`.

**`PatcherResult.applyTo(apkFile)` already produces a valid patched APK in-place** via `ZFile.openReadWrite`. Just sign after that — don't call `ApkMerger`.

### 3. jadx naming traps

When reverse-engineering decompiled Java:
- jadx renames `com.p1` → `com.p335p1`. **Always use the real `com/p1/mobile/putong/...` descriptors in patches.**
- jadx renames obfuscated package `Ll/<obf>;` (single-letter `l` package) to `Lp001l/<obf>;` for readability. **Real DEX descriptors are `Ll/<obf>;`. Never use the `p001l` prefix in fingerprints.**

### 4. Class fingerprints resolve at the patcher-class level

A `classFingerprint = parentFingerprint { ... }` chain must live as a top-level `val` (or `companion object val`), not inside a function. Inside `execute { }`, the same `matchOrNull()` call MUST NOT be called per-classDef (see #1).

### 5. Performance: UnifiedClassResolver for single-pass iteration

`classDefForEach` iterates ALL ~50,000 classes in the APK. Multiple patches doing this independently causes O(n × patches) performance. The `UnifiedClassResolver` consolidates all class scanning into a single pass:

```kotlin
val resolver = UnifiedClassResolver(this)
resolver.resolve()  // Single O(n) pass through all classes

// Then retrieve pre-resolved classes:
val analyticsClass = resolver.getAnalyticsClass("foxStats")
val premiumClass = resolver.getPremiumClass("xma")
val gmsClasses = resolver.getGmsClasses()
val loveBuzzClasses = resolver.getLoveBuzzClasses()
val privacyClass = resolver.getPrivacyClass("jmd0")
```

**What's consolidated:** AnalyticsDisable, DialogCleanup, UiCleanup, PremiumUnlock, GmsCompatibility, Messaging (LoveBuzz), and PrivacyEnhancement all use the same resolver.

**When to use `classDefByOrNull`:** For stable CamelCase classes (e.g., `NavigationBarAdView`, `ChatPartnerConfig`), use `classDefByOrNull("Lcom/p1/mobile/putong/...;")` — it's O(1) via the class index.

**When to add to UnifiedClassResolver:** When you need to find obfuscated classes by behavioral anchors (strings, fields, methods). Add anchors to the resolver's maps and a resolution method.

### 6. Performance: cache instruction iteration with WeakHashMap

Methods' `implementation?.instructions` iterates the bytecode each time. If you call `accessesField()` or similar instruction-scanning helpers multiple times on the same method, cache the materialized instruction list:

```kotlin
private val instructionCache = java.util.WeakHashMap<Method, List<Instruction>>()
private fun Method.cachedInstructions(): List<Instruction> =
    instructionCache.getOrPut(this) { implementation?.instructions?.toList() ?: emptyList() }
```

This prevents redundant iteration when the same method is analyzed multiple times across different patch blocks.

### 7. Performance: avoid cross-patch redundancy

Before adding a patch, check if another patchset already covers the same class/method. Common overlaps:
- Ad removal: `AdRemovalPatch` vs `PremiumUnlockPatch` (both had NavigationBarAdView, NativeAdViewCard)
- Root detection: `AnalyticsDisablePatch` vs `PrivacyEnhancementPatch` (both had root detection classes)
- Package enumeration: `AnalyticsDisablePatch` vs `PrivacyEnhancementPatch` (identical bytecode)
- Dialog suppression: Individual fingerprint patches vs centralized OMS blocklist in `DialogCleanupPatch`

Duplicate patches waste time (redundant class lookups + method iteration) and can cause double-injection issues.

### 8. Never patch nullCheck() methods

The `nullCheck()` methods in data classes (CounterSecretCrushLimit, BoostLimit, CounterLikeLimit, ChatPartnerConfig, LoveBuzzData, PrologueConfig, ODiamondVisitorMessageGuideConfig, LiveChatLimit, BLiveCommonConfig, GreetingCounter, IntlUltraPremiumConfig, User) are either empty no-ops or simple validation methods. Attempting to patch them with `addInstructions(0, ...)` causes bytecode verification errors:

```
java.lang.VerifyError: Verifier rejected class com.p1.mobile.putong.data.CounterSecretCrushLimit: 
void com.p1.mobile.putong.data.CounterSecretCrushLimit.nullCheck() failed to verify: 
[0x5] instance field access on object that has non-reference type IntegerConstant
```

**Why it fails:**
- The methods don't have the expected register allocation for injected instructions
- Prepending instructions breaks jump target offsets in existing bytecode
- The bytecode verifier rejects modifications to these validation methods

**Solution:** Remove all nullCheck() patches entirely. These methods don't need patching — they're either empty or perform validation that doesn't interfere with patch goals. If a nullCheck() method needs to be bypassed, find the calling code and patch it there instead.

**Real-world impact:** This caused the app to crash on startup with VerifyError, forcing users back to the login screen. All nullCheck() patches have been removed from PremiumUnlockPatch.kt, MessagingPatch.kt, and PrivacyControlsPatch.kt.

### 9. Injected smali: high parameter registers are SILENTLY DROPPED (4-bit register fields)

`addInstructions` compiles your smali in a dummy method with the target's register count. Instructions whose register fields are 4-bit — `invoke-* {vN}` (35c), `iget/iput` destination (22c A-field), `filled-new-array` — only accept **v0–v15**. In a method with many registers, `p0/p1/p2` map to high numbers (e.g. `a7` has 23 registers → `p2 = v22`). Writing `iget-object v0, p2, ...` or `invoke-virtual {p2}, ...` there fails assembly with:

```
[7,0] Invalid register: v22. Must be between v0 and v15, inclusive.
```

**The killer:** Morphe logs this error but does NOT fail the patch — the offending instruction is silently dropped and the rest of the block is inserted. The build reports "OK". At runtime the truncated block fails verification:

```
java.lang.VerifyError: Verifier rejected class ...CoreSuggested: a7(boolean, l.ii70)
failed to verify: [0x0] type Undefined unexpected as arg to if-eqz/if-nez
```

(the `iget` that defined `v0` vanished, leaving `if-eqz v0` reading an undefined register). The app freezes/crashes on startup.

**Solution:** never pass `pN` directly to a 4-bit-field instruction. Shuttle it into a low register first with a `/from16` move (16-bit source field, always safe):

```smali
move-object/from16 v0, p2          # object param
iget-object v0, v0, Ll/ii70;->b:Ljava/lang/Object;
invoke-virtual {v0}, ...           # v0 is low → OK
```

Use `move/from16` for ints, `move-wide/from16` for long/double. Keep ALL injected working registers in v0–v15.

**Two more injection traps found alongside this:**
- **Internal labels only resolve at index 0.** `addInstructions(N, ...)` with `N > 0` mis-resolves internal branch targets by the insertion point's code offset (e.g. injecting at index 2 after two 2-unit iputs shifted every `if-eqz` target −4 code units, landing mid-instruction). Always inject at index 0; if you need state set by the original prologue, replicate those prologue instructions at the start of your block (idempotent stores are safe to re-run).
- **Methods with `registerCount == paramCount` have NO free scratch registers** (p0=v0, p1=v1, …). You cannot clobber a param and fall through to original code that still reads it. Either find a param the original redefines before reading (safe scratch), or save/restore a clobbered param from a field the prologue populates (e.g. `ConversationItemView.x0`: restore `Conv` from `hy6.a`). Morphe has no public register-expansion API, and expanding would shift all param registers anyway.

**Verification technique:** pull the patched APK from the device (`adb pull /data/app/.../base.apk`), extract `classes*.dex`, and disassemble the target method with dexlib2 (`DexFileFactory.loadDexFile`) to confirm every injected instruction is present. The local `:patches:patchApk` source APK (`tantan-tribe-extracted/`) is a DIFFERENT version than the decompiled 7.5.4 sources — its obfuscated methods differ, so device-DEX inspection is the authoritative check. You can also pre-flight any smali block via `InlineSmaliCompiler.Companion.compile(smali, params, registerCount, isStatic)` and assert the returned instruction count matches (labels are not instructions).

**Real-world impact:** The swipe-deck `CoreSuggested.a7` insertion filter froze the app on startup (Nov 2026). Fixed by prefixing `move-object/from16 v0, p2`. Same fix applied to the r7/l7 guards.

### 10. Messages list cells do NOT bind through `ConversationItemView.x0` — filter at the data level

The main Messages conversation list (view type 0) binds through `NewConversationItemView.e4 → f4 → w3 → O0(hy6)` (dispatched to child views). `ConversationItemView.x0(Conversation, User, hy6)` is only dispatched for the type-13 header/team cell path (`K3/L3` from `n4`). So a `setVisibility(GONE)` injected into `x0` is **dead code** for normal conversation rows — the cell still appears.

**To remove a promo conversation from the Messages list, filter the display data, not the view.** The display list is built by `ConversationsList.O2(List, Z)List` (obfuscated name varies — match by signature `(Ljava/util/List;Z)Ljava/util/List;` within stable `Lcom/p1/mobile/putong/core/newui/messages/ConversationsList;`, cardinality 1). Every return path returns the input list (or a `y4m` wrapper copied from it after entry), so rebuilding `p1` as a filtered `ArrayList` at index 0 covers all branches with no control-flow surgery. `O2` has 22 registers (`p1=v20`): read via `move-object/from16 v1, p1`, write back via `move-object/16 p1, v0`, keep working regs in v0–v5. Sole caller `Y1` feeds adapter `b0.L` → covers All list, sort tabs, and search.

**Predicate safety (CORRECTED Nov 2026):** drop ONLY the two pure like-guide promo cells by EXACT convType — `fakeReceiveLikeGuideSVip` and `fakeIntlReceiveLikeGuideSVip` (these are *replaced*, not converted, when a real conversation arrives, `q09.J`). **KEEP `fake_one_side` / `fake_one_side_no_match`** — these are REAL one-sided chats, NOT bots: PremiumUnlock forces `isSVIP()=true`, so the teaser gate `ht6.o()` (`!isSVIP && mm<=0`) is bypassed and they render as normal conversations (`MessagesAct:658` falls through to the real chat page; `fake_one_side_no_match` has no purchase gate at all). **KEEP `intlSeeChatRequest`** — a functional chat-request entry once the privilege is unlocked. The original `startsWith("fake")` + `intlSeeChatRequest` drop was UNSAFE: it emptied inboxes dominated by one-sided chats / chat requests (typical free intl account with likes but no mutual matches) → adapter `D()`=`wgc.J(c)` true (`ConversationsList:426`) → "It's quiet in here" empty state (`CORE_ACTION_KEEP_SWIPING_TITLE`). New-match placeholders (`g.uf`, `api/g.java:8952`) use `convType="default"` (kept); `isFake=true` is cleared at server merge (`q09:775`). **Do NOT filter on `isFake`/`fake_id_` alone, and do NOT use `startsWith("fake")`** — `fake_one_side*` are real. Real matched chats carry `default`/`group`/`quickchat`/`lovebuzz`/`heartbeatMatch` etc., never the two promo types. Keep working registers v0–v6 and pre-flight via `InlineSmaliCompiler` (gotcha #9) — a dropped high-register instruction re-introduces the startup VerifyError freeze.

## 11. Swipe-tab "99+ people liked you" promo popups — patch the dialog CREATOR, not the content view

The occasional "99+ people liked you" popup on the swipe tab is one of four likers promo dialogs, all built+shown by static void methods in one obfuscated class (7.5.4 `Ll/zw3;`, resolver key `hl3`), each anchored on its OMS popup-key string literal:

| Key literal | Method (7.5.4) | Dialog | Content view |
|---|---|---|---|
| `p_no_match_svip` | `H(Act,I,List)` | no-match likers alert | `LikersDialogView.c` |
| `p_offline_popup` | `J(Act,I,CoreLikers$a)` | offline "99+ people liked you while away" | `LikersDialogView.b` |
| `p_no_match_see_purchase_guide_view` | `I(Act,I,List)` | see-purchase guide | `VipItemDetailPage` |
| `p_see_popup_expired_svip` | `L(Act,I)` | SVIP expired recover | `SVipSeeRecoverDlg` |

The "99+" cap lives in `LikersDialogView.b` (`i > 99 ? "99+"`, title `SVIP_OFFLINE_POPUP_MINTITLE_PLURAL`) and `hkh0.f`→`g(i,99)` for `.c`. **Patch the creators to `return-void`** (match by the popup-key string literal in `cachedInstructions`, static+void filter — version-agnostic, not the obfuscated method name). Patching only `LikersDialogView.b/c` to `return-void` is NOT enough: the dialog frame still shows (empty), and `I`/`L` use other views entirely. `PremiumUnlockPatch` does this in the `resolved["hl3"]` block.

**Why the OMS `M()` blocklist alone fails here:** the trigger `g350.K7` only consults `cn60.j().f().M("p_offline_popup", false)` when `ern0.F()` is true; `ern0.F()` = `!"__control".equals(ABManager.i0("pop_platform_all"))` (an AB bucket). In the `__control` bucket it calls `bfe0.i0`→`zw3.J` directly, bypassing `M`. So creator-level `return-void` is the reliable fix. These are purchase nags, not the actual "see who liked you" feature (`LikersFrag`/`LikersAct`, `p_see_who_likes_me_view` — untouched).

## 12. Swipe-deck promo CARDS (not dialogs) — filter at the consumer `home/c.y`, not just the insert points

Some swipe-tab promos are swipeable **cards** in the deck, not modal dialogs — e.g. the "see churnback" card titled "X more people liked you" / subtitle "She is active" (server-driven `Active.cardTitle`/`cardDesc`), rendered by `SeeActiveCard` via holder `Ll/qpf0;` (`VirtualCardType.IntlSeeCard`, factory `home/b` case 20). Sibling promo cards: `IntlVipCard`(spn0), `MinBoostCard`(g910), `IntlFreeSpotlightCard`(u9h0), buzz cards(vy3), `IntlPartnerActiveCard`(jkp), `IntlRecallMembershipCard`(c3q), `LiveActiveCard`(tms). All are built in `CoreInserterHelper` (`Lcom/p1/mobile/putong/core/api/m;`) `x3` with `id="VirtualCard"`.

**The insert-point filters alone leak:** `AdRemovalPatch` strips `isVirtualCard()` at `CoreSuggested.a7` (merge SparseArray `ii70.b`), `r7` ("repeat suggested card"), `l7` (`INSERT_LOCAL_FINAL`) and the OMS `id0` batch. But cards that reach the **main loaded list** (server `intlInsertCardSets`) bypass those and still render.

**Robust backstop = consumer-side filter at `Lcom/p1/mobile/putong/core/newui/home/c;->y(Ljava/util/List;)Ljava/util/List;`** — the FINAL deck render transform (`g350.F6 → b.N.y → b.N.K`), downstream of every insertion path, sole caller. Match by the unique `(List)→List` signature (cardinality 1; `K(List)V` and `C(List,List,UserInfo)V` differ). Rebuild `p1` as a filtered `ArrayList` at index 0 dropping `UserInfo.isVirtualCard()` (real profiles carry real ids → never removed; no blank card since `c.K` does `clear()+addAll()` and adapter count = list size).

**Register trap:** `c.y` has only **5 registers** (instance: p0=this=v3, p1=list=v4) — NO free scratch beyond v0–v2. The filter must **save/restore `this`** (`move-object/from16 v1, p0` … `move-object/16 p0, v1`) and shuttle the list param (`/from16` read, `/16` write), keeping working regs in v0–v4. Recompute `List.size()` per iteration to avoid needing a 6th register. Clobbering v3 without restoring breaks the original prologue's `iget-object v2, v3, c.f` → crash. Pre-flight via `InlineSmaliCompiler` at regs=5 (gotcha #9). `fzn0.f()` is NOT a skip flag (it registers a swipe-out callback via `VirtualCard.J0`), and GONE-ing the holder view leaves a full-size invisible swipeable card — both rejected.

## 13. Top-of-swipe-screen likers-float banner ("X more people liked you" / "See who likes me") — kill the `O3` filter, and enum constants are FIELD accesses not strings

The occasional 2-line promo banner at the TOP of the Card tab (and its sibling SEE_ANIM avatar bubble) is driven by the home presenter (obfuscated; 7.5.4 `Ll/g350;`) pipeline:

`CoreLikers.P6()` → **`filter(O3)`** → throttleFirst(10s) → combineLatest → `filter(J7)` (Card tab + no dialog) → `filter(K7)` (offline-popup gate) → `L7(ii70)` → guard `A8(CoreLikers$a)Z` → `NewMainAct.k7()V` → emits `ayl0.a` onto subject `main/a.t` → banner view.

**Choke point = `O3`**: a **STATIC** method `O3(Lcom/p1/mobile/putong/core/api/CoreLikers$a;)Ljava/lang/Boolean;` returning true iff trigger == `home_total_liker_float` || `home_new_liker_float`. Force it to `Boolean.FALSE` (`const/4 v0,0x0; invoke-static {v0},Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean; move-result-object v0; return-object v0` — 4 instrs, v0 only, immediate return → register-safe at any count). This kills the whole pipeline upstream (banner + avatar bubble; all 3 `NewMainAct.k7()` callers are downstream of O3) without touching other likers features (`home_tab_msg` msg badge, `new_like_dialog`, `my_privilege_liker`, the `LikersAct` See-Who-Likes-Me page — different triggers/subscribers of `P6()`). `UiCleanupPatch` does this.

**Two fingerprint traps that made the first attempt a silent no-op:**
1. **Enum constants are `sget-object` FIELD accesses, NOT `const-string`.** `string("home_total_liker_float")` / `string("home_new_liker_float")` NEVER match `g350` (it reads `CoreLikers$LikersTriggerBy;->home_*_liker_float` via `sget-object`). Use `fieldAccess(name=...)` / `FieldReference` instruction checks for enum fields. To resolve the obfuscated presenter class, anchor on a **unique stable const-string** it actually contains — `"see_anim_show_times_after_launch"` (a pref key, g350-only) works; the enum-field anchor is ambiguous (CoreSuggested/CoreLikers also read those fields).
2. **`O3`/`J7`/`K7` return boxed `Ljava/lang/Boolean;`, not primitive `Z`.** A `returnType=="Z"` filter misses them (and instead hits `A8(CoreLikers$a)Z`, the suppress guard — patching that to false would *remove* suppression and show the banner MORE). Select O3 by `AccessFlags.STATIC` + `returnType=="Ljava/lang/Boolean;"` + single `CoreLikers$a` param + both enum-field accesses (cardinality 1; J7/K7 are instance methods with an `ii70` param).

**Verify in patched DEX** (`InspectDex Ll/g350; O3`): first 4 instructions must be the Boolean.FALSE block; `A8` must remain original. The banner view's `a.t` subscriber is not present in the 7.5.4 jadx dump (version skew), but cutting O3 upstream suppresses it regardless — no need to see the consumer.

## 14. UnifiedClassResolver early-exit cap silently dropped late-DEX classes (xma block was a no-op in 7.5.4)

`PatchUtils.resolve()` used to abort the `classDefForEach` scan once `resolvedClasses.size >= totalTargets` (a hardcoded 105). Classes late in DEX iteration order — e.g. the privilege class `Ll/o3b;` lives in **classes9.dex** — were never reached, so `resolved["xma"]` stayed empty and the **entire `xma` patch block silently did nothing** in that layout. It happened to work on the device APK (different DEX ordering resolved `xma` before the cap), which masked the bug. **Fix: remove the early-exit; always complete the single O(n) pass** (gotcha #5 design). After the fix, modified-class count rose 663→669 and `o3b.c4`/`f4`/`E3`/`J3` became patched.

**Lesson:** a resolver-based block doing nothing is invisible at build time (all patches report OK). ALWAYS verify a known method in the patched DEX (e.g. `InspectDex Ll/o3b; c4` must start `const/4 v0,0x0; return v0`). If a whole block is original, suspect resolver under-resolution, not the block logic.

**Picks like gates (added to the `xma` ()Z-no-arg `when`):**
- `E3()` = `!(Q3(svipPicksMembership) && Q3(picksMembership))` → anchor `containsString("picksMembership")` (exact) → `RETURN_TRUE`. Every `freePicks` paywall is guarded by `!E3` (`pq80.f:177/215/222`, `vq80.I:63`, `Ak:285`), so forcing E3 true also clears the freePicks-remaining gates — no separate `j0b.o3` patch needed.
- `J3()` = `(g5() || Lg()) && !c4()` (Top Picks AB-bucket gate) → anchor `callsCoreProviderAbFlag()` (invokes a no-arg `Z` method on stable `CoreProviderInterface`/`CoreProviderImpl`; unique among static ()Z gates — H3 is instance) → `RETURN_TRUE`. Unblocks Top Picks likes for control-bucket accounts.
- `CounterSuperlikeAndUndoLimit.remainToday/remainAll` already forced 200000 (stable class) — covers the superlike-button daily-count math.
- **`picksTagType==masking` deliberately NOT patched**: mid-method enum comparison in a 13-param method (register/branch surgery risk, gotcha #9) AND masked picks are server-locked, so bypassing the client gate would not make them match.

**Likes-screen like failure is SERVER-side** (not patchable): the like uses the identical `POST /users/me/relationships/{id}` endpoint as the working swipe deck; all client self-gates pass or are patched. The who-liked-me list is a masked teaser feed for non-subscribed accounts (placeholder names, possibly photo-less entries hitting the silent `x9p.E` pictures gate); match creation from it is server-authoritative.

## 15. `Fingerprint(filters=...)` anchors must co-occur in ONE method — multi-method anchors silently resolve nothing

A `Fingerprint(filters = listOf(string(...), methodCall(...), ...))` resolves a class only if **some single method satisfies ALL filters**. If the anchors live in *different* methods of the class, `matchOrNull()` returns null and the whole block is a **silent no-op** (build still reports OK). This is distinct from gotcha #14 (resolver under-resolution) but has the same invisible symptom.

**Real cases (Nov 2026, all DEX-confirmed original before fix):**
- `proximityBubbleClassFingerprint` = `string("distance")` (in `home/b.H6`) + `methodCall(n7)` (in a *different* `home/b` method) → never resolved `home/b`, so **H6 was unpatched** and the see_anim bubble pipeline B leaked despite gotcha #13's O3 cut. Fixed by resolving `home/b` class-wide via the resolver (`"distance" in foundStrings && methodCallFull.any { it.endsWith(".n7") }`, key `proximityBubble`) and voiding the Figure-param + "distance" method (H6).
- New live/visitor fingerprints combining a const-string in the ctor with a `methodCall` in the bind method failed the same way.

**Fix patterns:**
1. **Single unique anchor in one method** → resolves the class; then iterate `mutableClassDefBy(cd).methods` class-wide to patch the real target. Used for `hcj` (`string("ad_monetize_live_banner_switch")` lives in `s`; void both `s`/`t` by `containsString`), `rrn` (`methodCall(IntlLiveSquareActiveGiftDialogView.S)` lives in `d3`), `ciq0` (`methodCall(LiveVoicePayGuideBottomDialog.g)`).
2. **Class-wide resolver** when anchors span methods: add the string anchors to `premiumAnchorStrings` (so `foundStrings` collects them) and a `resolvePremium` condition combining `foundStrings` + `methodCallFull` (which captures ALL calls class-wide). Retrieve with `resolver.getPremiumClass(key)`. Used for `visitorsDiscountBanner` (`liq.f`) and `meetDiscountBanner` (`rcp.h`): analytics string (ctor) **AND** `IntlDiscountEntryBannerView;.<init>` call (bind method). The `<init>`-call requirement excludes `ysn$g`, which holds the identical analytics string but never constructs the banner.

**Substring trap:** `ciq0` pay-guide enqueue params are `VoicePayGuidePopUp`, `VoicePayGuideV2PopUp`, `VoiceAvatarFramePayGuidePopUp`. `contains("PayGuidePopUp")` MISSES the V2 variant — use `contains("PayGuide") && endsWith("PopUp;")`.

**RemoteConfig F/s no-scratch override:** `RemoteConfig.F(String)String` and `s(String)Z` have `registers==2` (p0=this=v0, p1=key=v1, NO free scratch) and read `this` immediately, so they cannot take a fall-through key comparison (gotcha #9). Both delegate to the provider returned by `u()` (7.5.4 `Ll/f96;->t(String)String` regs=4 / `f(String)Z` regs=5, free scratch v0/v1). Derive the provider descriptor + getter name dynamically from the stable `RemoteConfig.F`/`s` bodies (scan for the 1-String-param delegate `MethodReference` whose `definingClass != RemoteConfig`), then patch the provider getter with a `move-object/from16 v0, p1` key shuttle + `:not_matched` fall-through. `z`/`B` already return the caller default on both branches (all int/long remote configs neutered app-wide). F-key overrides: `popup_schedule_config→{}`, `mytab_see_red_dot_config`/`me_badge_icon_see_configs`/`private_custom_config`/`ttt_verification_guide_config` JSON; s-key: `bad_token_exprie_control`/`nearbyBanner_reddot→false`.

**New promo suppressions added (all DEX-verified `return-void`):** live-square ad holders `IntlLiveSquareSuggestedFrag.Y5/Z5(View,List)V` (stable CamelCase, cardinality 2 — also fixes the blank-gap defect of view-only ad patches); live ad preload Firebase switches `hcj.s/t` (stops AdMob load); active-gift popup creator `rrn.d3(LiveSquareActiveGiftBean)V`; voice-room pay-guide enqueue `ciq0.j4/k4/l4`; visitor affiliate discount-banner hosts `liq.f`/`rcp.h(FrameLayout)V`. The type-20 Messages head liker card (`ConversationHeadLikerItemLayout.w`) and `NewLikeView`/`y240` need NO new patch (data-starved / already voided). **Always DEX-verify every target method after building** — fingerprint and resolver blocks alike fail invisibly.

## 16. Patcher 2.4.0 / plugin 2.1.0 upgrade (Nov 2026) — API + perf notes

Upgraded from patcher 1.6.0 / plugin 1.3.3 to **patcher 2.4.0 / plugin 2.1.0** (smali `4220ae75f7`, KGP 2.4.21, AGP 9.1.0, Gradle 9.3.1 wrapper unchanged). Local verify build dropped from ~3m32s to **~1m49s (~50% faster)**: DEX now processed **in parallel (4 threads)** (was single-threaded), selective resource decoding, one-pass APK write. All 13 patches + 18 critical DEX targets + manifest signature spoofing re-verified under 2.4.0.

**Migration facts (the breaks were small and confined to infrastructure, NOT the patch DSL):**
- **`Patch` is non-generic now.** `PatchRegistry.allPatches` and `PatchListGenerator` use `Set<Patch>` (was `Set<Patch<*>>`). The metadata property names/types are UNCHANGED — the long list of "Unresolved reference name/description/..." errors were all *cascading* from the one invalid `Patch<*>` type argument. Removing the type param fixed everything; `patches-list.json` schema preserved byte-for-byte.
- **`PatcherConfig` signature changed:** no `aaptBinaryPath`/`frameworkFileDirectory`/`useArsclib`. New: `PatcherConfig(apkFile, temporaryFilesPath, keepArchitectures=emptySet(), useBytecodeMode=BytecodeMode.STRIP_FAST, verifier=NoOpDexVerifier, ...)`. `resourceMode` is internal and auto-set to FULL when any `ResourcePatch` is added (so GmsCompatibility resource edits still run). `applyTo`/`signApk`/`KeyStoreDetails`/`plusAssign`/`invoke`/`get` unchanged.
- **arsclib fork rename:** 2.4.0 bundles `com.github.MorpheApp:ARSCLib:50418a07a8` (not REAndroid). `ValueItem.setValueAsString(String)` → `setDataAsString(String)` (and `getValueAsString`→`getDataAsString`). `PatcherMain.setAttrString` tries `setDataAsString` first, falls back to `setValueAsString`. All other reflection targets (`AndroidManifestBlock`, `ResXmlElement`, `ResXmlAttribute`) verified present. Without this fix the signature-spoof manifest workaround silently no-ops.
- **Signing is v2-only library-side now:** 2.4.0 `ApkSigner.Signer` hardcodes `setV1/V3SigningEnabled(false)` (minSdk floor 26). The `"v3"` string passed to `signApk` is only the signer *name* (it was only a name in 1.6.0 too). Keystore format is PKCS12 now (was BKS) — recreated per run, harmless.
- **Build scripts:** add `implementation("com.google.guava:guava:33.6.0-jre")` (patcher/smali POMs expose guava at runtime only; needed for dexlib2-exposed signatures; auto-excluded from the `.mpp`). Use `testImplementation(kotlin("test"))` (KGP 2.4.21), not a pinned 2.2.21. `extensionsProjectPath` is inert (plugin reads it at apply time, default `:extensions`); extension wiring works via the default. Plugin 1.3.3→2.1.0 diff is bundle-signing only (signs `.mpp` if `morphe-signing.key`/`MORPHE_SIGNING_KEY` exists; none here → unsigned).
- **Deprecation warnings (not errors):** `bytecodePatch`/`resourcePatch`/`classDefByOrNull`/`mutableClassDefBy`/`document` are deprecated in favor of `patch()` + global functions. They still compile and run identically; migrating the patch files to the new API is optional future cleanup. `-Xcontext-parameters` is redundant on Kotlin 2.4 (harmless warning).
- **Windows STRIP_FAST is safe in 2.4.0:** `MappedFile`'s JDK<22 fallback calls `Unsafe.invokeCleaner` on close (the reflection-unmap fix the old morphe-cli Windows→FULL override awaited); current morphe-cli removed that override.

## Fable Method
Before any non-trivial backend task, apply the fable-method loop; for tasks that will run unattended or fan out subagents, use fable-loop. After completing substantive work, or whenever any agent/tool claims work is done, run a fable-judge pass before presenting it as finished.

## Using Subagents

When investigating complex issues or implementing multiple fixes, use subagents to parallelize work and get specialized focus.

### When to Use Subagents

**Use subagents for:**
- Investigating multiple unrelated issues in parallel
- Deep dives into specific features or code paths
- Implementing multiple independent fixes
- Code exploration and analysis tasks
- Build and deployment tasks after fixes are identified

**Don't use subagents for:**
- Simple single-file edits
- Quick investigations that take < 2 minutes
- Tasks that depend on each other's output

### How to Launch Subagents

Use the `task` tool with appropriate agent type:

```
task(
  description="Short description",
  subagent_type="general",  # or "explore" for read-only investigation
  prompt="Detailed task description..."
)
```

**Agent types:**
- `explore` - Read-only investigation, code search, analysis
- `general` - Implementation, file editing, build/deploy tasks

### Parallel Investigation Pattern

When multiple features are broken, launch parallel investigation subagents:

```
# Launch all investigations in parallel
task(description="Investigate feature A", subagent_type="explore", prompt="...")
task(description="Investigate feature B", subagent_type="explore", prompt="...")
task(description="Investigate feature C", subagent_type="explore", prompt="...")

# Wait for all to complete, then synthesize findings
# Launch single implementation subagent with all fixes
task(description="Fix all issues", subagent_type="general", prompt="...")
```

### Subagent Prompt Structure

Include in every subagent prompt:
1. **Context** - What's broken, what's been tried
2. **Specific investigation targets** - Files to check, methods to trace
3. **Expected deliverables** - What to report back
4. **Build/deploy instructions** - If implementing fixes
5. **Credentials** - GitHub token, release ID, etc.

### Example: Multi-Feature Investigation

```
# Investigate 6 broken features in parallel
task(description="Investigate badge display", subagent_type="explore", prompt="...")
task(description="Investigate blur issue", subagent_type="explore", prompt="...")
task(description="Investigate super likes", subagent_type="explore", prompt="...")
task(description="Investigate roaming", subagent_type="explore", prompt="...")
task(description="Investigate banner", subagent_type="explore", prompt="...")
task(description="Investigate payment dialogs", subagent_type="explore", prompt="...")

# Synthesize findings and launch comprehensive fix
task(description="Fix all issues", subagent_type="general", prompt="
  Fix 1: Change xma.e4() from RETURN_TRUE to RETURN_FALSE
  Fix 2: Remove isODiamond from true-returning set
  Fix 3: Change counter from MAX_VALUE to 200000
  ...
  Build and deploy to release 362723625
")
```

### Benefits

- **Parallelism** - Multiple investigations run simultaneously
- **Focus** - Each subagent has clear, narrow scope
- **Efficiency** - Reduces context switching for main agent
- **Completeness** - Ensures all angles are investigated
