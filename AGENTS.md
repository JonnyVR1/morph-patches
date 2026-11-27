# Morph - Tantan Android Patch Project

## Overview
This repository contains patches and tools for the Tantan Android APK (international version, v7.5.6.1 / versionCode 2756110). The project includes 16 patchsets covering premium feature unlocking, privacy protection, analytics disabling, messaging enhancements, dialog cleanup, ad removal, root/emulator detection bypass, live streaming features, UI cleanup, Google Maps compatibility, remote config overrides, A/B-test overrides, search/discovery enhancements, location enhancement, push-notification filtering, and opt-in experimental unlocks.

**Target:** International version only. China-specific features (WeChat Pay, Alipay, QQ login, Huawei services) are dead code in the international APK and should NOT be patched.

> **7.5.6.1 migration (Nov 2026):** the target was upgraded from 7.5.4 (2754010) to 7.5.6.1 (2756110). 7.5.4 is NO LONGER supported. 7.5.6.1 is a **mass-refactor release**, not ordinary obfuscation churn — see §20 for class renames, the `rx.c`→`Ll/vpf;` Observable obfuscation, the shared synthetic lambda-dispatcher hazard, and restored vs pending blocks. The signing certificate is UNCHANGED (SHA-256 `7c5d634c…`), so GMS signature spoofing constants remain valid.

## Files
- `patches/` - Individual bypass patch implementations
- `patches-list.json` - Auto-generated patch metadata
- `patches-bundle.json` - Bundle configuration
- `tantan-decompiled-7.5.6.1/` - Decompiled Tantan 7.5.6.1 APK source (authoritative RE reference; jadx keeps `com/p1/...` verbatim, obfuscated `Ll/` appears as `p002l/`)
- `tantan-7.5.6.1.apk` - The 7.5.6.1 target APK (versionCode 2756110) used by `patchApk` and tests
- `tantan-decompiled-7.5.4/` / `tantan-7.5.4.apk` - Retained ONLY as historical old-version reference for anchor mapping (obfuscated `Ll/` appears as `p001l/`); not a build target
- `tools/inspect.bat` - dexlib2 DEX inspector for local verification; `tools/gradle.bat` - gradle wrapper (creds + offline)

## Build and Release Commands

### Build Patches
```bash
# Build the patch bundle with DEX bytecode and metadata (RECOMMENDED)
./gradlew :patches:repackMppWithPatchList
```
**Important:** Always use `:patches:repackMppWithPatchList` — it ensures the .mpp contains both `classes.dex` and `patches-list.json`. `:patches:buildAndroid`/`:patches:build` alone produces an incomplete .mpp.

**Verification:** `unzip -l patches/build/libs/patches-0.0.1-dev2.mpp | grep -E "classes.dex|patches-list.json"` — should show both files.

**Build-order trap:** `:patches:patchApk` depends on `jar`, which REGENERATES the .mpp as a plain class jar. Always run `:patches:repackMppWithPatchList` LAST (after `patchApk`), with `--rerun-tasks` if needed.

### Local Patch Test
```bash
./gradlew :patches:patchApk
```
Output: `tantan-premium-unlocked.apk` in repo root (~55 MB, signed, installable). **Do NOT call `ApkMerger.merge()` after `applyTo()`** — see Gotcha #2.

### Upload to GitHub Release
**MANDATORY per release:** refresh `patches-bundle.json` `created_at` to current local time (`yyyy-MM-ddTHH:mm:ss`, no offset) and update `description`. Morph Manager flags stale `created_at` as outdated.
1. Edit `patches-bundle.json` (`created_at` = now, description current)
2. `tools\gradle.bat :patches:repackMppWithPatchList --rerun-tasks`
3. Re-upload the three files via `uploads.github.com` (not `api.github.com`):
```bash
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" -H "Content-Type: application/octet-stream" \
  --data-binary @patches/build/libs/patches-0.0.1-dev2.mpp \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/<RELEASE_ID>/assets?name=patches-0.0.1-dev2.mpp"
# Repeat for patches-list.json and patches-bundle.json (Content-Type: application/json)
```
Expected .mpp size: ~880 KB (~40 KB means `buildAndroid` was not run).

## Patch Architecture

10 patches registered in `PatchRegistry.kt`. All files in `patches/src/main/java/com/p1/mobile/putong/data/`:

| Patch | Key Targets | Resolver Keys |
|-------|-------------|---------------|
| PremiumUnlock | Tier status, privilege gates, subscription validation, daily limits, ad removal, boost count, search filters, VIP badge, O-Diamond, purchase gate, swipe rate limit | `xma`, `u59`, `src0`, `sb90`, `n3b0`, `sja`, `pib`, `gra` |
| PrivacyControls | `hide_me_from_nearby`, `visitor_hide_footprint`, `mysterious_mode`, `nearby_people` privileges | — |
| Messaging | Message limits, pin chat, voice/video calls, typing indicator, visitor limits, conversation entry, buzz toggles, telepathy reply-length, voice 60s cap | `telepathyReplyLimit`, `voiceRecord`, `voiceRecordInner` |
| AnalyticsDisable | FoxStatistics, Fox uploaders, OAID, GAID, OneID, GA4, FB auto-events, push tracking, xlog, Beatles/xlog, Firebase Sessions, AppsFlyer, CleverTap | `coreEventLogger`, `foxUploader`, `oaidHelper`, `ga4Collection`, `fbAutoEvents`, `pushTracker`, `xlogPull`, `beatles`, `xlogUploader` |
| DialogCleanup | OMS gate, creator-level backstops, recall-match popup, UX questionnaire, post-swipe suggesters | `recallMatchPopup`, `uxQuestionnaire` |
| GmsCompatibility | Signature spoofing via ContentProvider, Maps auth header injection, MicroG support, GMS availability bypass | — |
| AdRemoval | Nav bar banners, native feed ads, live streaming ads, live square ads, Town Tales casual-game promo | `casualGameManager` |
| PrivacyEnhancement | Root/emulator detection bypass, ShuMeng SDK block, package enumeration prevention, screenshot warning, contacts upload block, clipboard invite reads, MK bridge app enumeration, WebView mixed-content hardening | `screenshotWarning`, `contactsSync`, `clipboardInvite`, `mkBridge` |
| LocationEnhancement | Distance gate (500.0→1.0), GPS re-fetch throttle, mock-location flag zero | `mockLocationFlag` |
| PushNotificationFilter | Single posting choke point (d9l.f), keep/block lists by intent | `pushPoster` |
| ExperimentalUnlock (OPT-IN) | Voice-to-text flag, buzz prolong count, AI chat companion gate, fake-GPS blacklist | `buzzProlong` |
| UiCleanup | Guides, banners, stickers, decorations, AI prompts, superlike upsell bubbles | `superlikeBubble` |
| ABTestOverride | A/B bucket overrides via `q.t` (j0 map), single-scratch injection pattern | — |
| RemoteConfigOverride | Config overrides via provider hooks (ngi k/c/i/h + pq2.e) | — |

**Note:** nullCheck() methods are NOT patched (see Gotcha #8). All tier overrides MUST use `isMe()` guards.

### Region Detection
**Master Switch:** `IntlCountryCodeController.m29114k()` returns `TextUtils.equals("hms", "gms")` = **ALWAYS FALSE** in international APK → all China-only code is dead.

**DO NOT PATCH:** WeChat Pay/Alipay/Huabei/JD Pay, WeChat/QQ login, Weibo sharing, Huawei push/services, `nightclub_config`, `LiveRegionTag.mainland`, Chinese locale features.

**SAFE TO PATCH:** All `intl_` prefix features, Google Play Billing, Facebook/Google login, Firebase push, all premium features, all `d79` flags.

## Version-Agnostic Fingerprints

Patches MUST survive obfuscation churn. **Never match obfuscated names like `Lp001l/xma;`**. Use `string()`, `methodCall()`, `fieldAccess()`, `opcode()` filters anchored against stable product strings:

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
| `BoostRemainingCountView` | CamelCase stable |
| `HiddenNearByView` | CamelCase stable + `string("hide_me_from_nearby")` |
| `MyVisitorsItemView` | CamelCase stable + `string("visitor_hide_footprint")` |
| `PrivilegeContentDlgItemView` | CamelCase stable + `string("mysterious_mode")` |
| `ChatPartnerConfig` | `fieldAccess(messageLimit)` + `fieldAccess(perday)` |
| `PlatinumPinChat` | `fieldAccess(expireTime)` |
| `LoveBuzzData` | Consolidated single-pass: `fieldAccess(LoveBuzzData.remainingVoiceBuzz/TextBuzz/VideoBuzz/MemojiBuzz)` via `classDefForEach` pre-filter |
| Typing indicator | `fieldAccess(KeepConnection.chatTypingOpen)` + `fieldAccess(KeepConnection.chatTypingInterval)` + `methodCall(interval)` |
| FoxStatistics facade (`ofh0`) | `DefaultEnvironment.j()` call + ≥1 static-void method (resolver `coreEventLogger`) |
| Fox uploaders (`f970`/`g2f0`) | endpoint `report.tantanapp.com/v1/online/android` / `sc-report...` + static `(String,I)V` shape |
| AppsFlyer | `string("dmfeSDkpVxP8m6Ys6yJCpn")` (dev key) |
| CleverTap | `string("CleverTap SDK initialized with accountId")` |
| Facebook AppEvents | `string("facebook-core_release")` |
| Facebook auto-events (`k50`) | `string("com.facebook.appevents.internal.ActivityLifecycleTracker")` |
| Beatles APM | `string("com.tantanapp.beatles")` |
| OAID helper (`z810`) | `string("miit_oaid")` (resolver `oaidHelper`) |
| GAID (`AdvertisingIdClient`) | stable descriptor `getAdvertisingIdInfo(Context)` → empty Info |
| OneID (`ui30`/`ls60`) | createid endpoint + `(J,*)V` shape; storage via callers of `ui30.e` |
| GA4 collection (`iiu0`) | `string("firebase_analytics_collection_deactivated")` → `Q()Z` true |
| Ad-click substitution (`qm60`) | `string("ANDROIDID")` + `string("OAID")` + regex `\[(.*?)]` → `F(String)` passthrough |
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
| RemoteConfig | CamelCase stable — override `s()` (boolean), `y()`/`z()` (int), `A()`/`B()` (long), `F()` (string) for specific config keys |
| ItemMessageBase recall gate | stable CamelCase + `(Message,Z)Z` signature (cardinality 1) + class string `recall_config` |
| Telepathy reply gate (`o3k0`) | `fieldAccess(TpTelepathyConv.replyLengthLimit)` + static `(TpTelepathyConv)Z` carrying that field |
| Screenshot warning (`pnf0`) | `string("p_get_screenshoot_warning")` + static `()Z` shape |
| Recall-match popup (`ih9`) | `string("p_recall_match_popup")` + `string("p_match_invitation_popup")` in ONE `(Act,GrowthPushConfig,*)V` method |
| UX questionnaire (`ytb`) | `string("/experience-questionnaire?scene=")` in a `(QuestionnaireScene,QuestionnaireStrategy)Lrx/c;` method |
| Push poster (`c0j0`) | `string("bundle_from_notification")` + static `(PushMessage,PendingIntent,Intent,Action,Action)V` shape |
| Buzz prolong (`i4x`) | `string("buzzProlong")` in a `()I` method (INLINED constant — gotcha #18, not fieldAccess) |
| Mock-location flag (`nr5`) | UNIQUE `methodCall(Location.isFromMockProvider()Z)`; resolved pre-gate |
| Location upload gate | stable `core/api/c` `(Location)V` + `location/a.f(DDDDDD)D` call + `const-wide 500.0` |
| GPS throttle / fake-GPS blacklist | stable `location/a` `(J,Z)V`+`currentTimeMillis` / `(Location)Z`+`const-wide 30.0`+`104.0` |
| Voice-to-text flag | `ItemMessageBase` method w/ `e_chat_message_convert_to_text_hold_press_button` → `invokeinterface ()Z` names → const-false default in `CoreBusinessServiceIml.interfaces` |
| AI companion gate | reuse `xma` resolver; `string("aiChatCompanion")` in a public static `()Z` |
| Contacts sync (`zf6`) | `string("checkContacts")` + `string("contacts_new")` + `()Z` carrying READ_CONTACTS |
| Clipboard invite (`eev`/`zq4`) | regex `tantan:.*邀请码：[A-Z|1-9]{4,}` in a `()String` method; MULTI-CLASS collector |
| MK bridge (`zv3`) | `string("checkAppInstalled")` + `(JSONObject)V` shape (`pkg_android` is in inner `zv3$c`) |
| Push tracker (`rtc0`) | `string("https://client-monitor.tantanapp.com/push?")` + static `(PushTrackData)V` |
| Xlog pull handler (`u53$d`) | inlined `string("xlog.upload")` + `(String,String,PushMessage,PushTrackData)Z` shape |
| Superlike bubbles (`ihi0`) | `string("bubble_superlike_bubble")` + `string("superlike_promotion_config")` + J-shape |
| Voice recorder (`a310`) | `RecordAnimLayout.setRecordStartTime` call + `<init>(MessagesAct)` (excludes telepathy twin `mal0`) |
| Mixed-content WebViews | ALL `WebSettings.setMixedContentMode` callers collected pre-gate; const-0 feeds forced to 1 |
| Beatles facade (`h53`) | `string("[init] context of init() is null, check it.")` + 5-param static install shape |
| Xlog uploader (`luw`) | `string("marsxlog")` + instance `(Date,String,J,*)V` shape |
| Town Tales manager (`uu7`) | `string("/intl-live-casualGameMenu")` + static `(Z)V` shape |

For byte-identical overloaded methods, fingerprint as one cluster. Use **bounded** `matchAll(classDef, expectedRange)` to assert expected cardinalities.

## Morphe Patcher Gotchas

Critical behaviors of Morphe v2.4.0 + plugin v2.1.0.

### 1. Fingerprint caching — never resolve inside `classDefForEach`
`matchOrNull(classDef)` caches per classDef per instance; inside a loop it returns the first cached result every iteration. **Fix:** 2-pass structure — Pass 1 iterates stable CamelCase classes only; Pass 2 resolves obfuscated fingerprints once at top-level.

### 1b. `matchOrNull(method)` cache — same trap at method granularity
First call caches; subsequent calls return the cached Match for different methods. **Fix:** once narrowed by class descriptor, skip the fingerprint and patch methods directly via `mutableClassDefBy(classDef).methods.filter { ... }.forEach { it.addInstructions(0, ...) }`.

### 2. `ApkMerger` is for App Bundles, not standalone APKs
`ApkMerger.merge()` filters by `.apk` extension and throws on standalone APKs. `PatcherResult.applyTo(apkFile)` already produces a valid patched APK in-place. Just sign after that.

### 3. jadx naming traps
- jadx renames `com.p1` → `com.p335p1`. **Always use real `com/p1/mobile/putong/...` descriptors.**
- jadx renames `Ll/<obf>;` → `Lp001l/<obf>;`. **Real DEX descriptors are `Ll/<obf>;`. Never use `p001l`.**

### 4. Class fingerprints resolve at the patcher-class level
`classFingerprint = parentFingerprint { ... }` must be a top-level `val`, not inside a function.

### 5. Performance: UnifiedClassResolver for single-pass iteration
`classDefForEach` iterates ALL ~50,000 classes. `UnifiedClassResolver` consolidates scanning into one O(n) pass. Use `classDefByOrNull` for stable CamelCase classes (O(1) via class index).

### 6. Performance: cache instruction iteration with WeakHashMap
`implementation?.instructions` iterates bytecode each time. Cache with `WeakHashMap<Method, List<Instruction>>` to prevent redundant iteration.

### 7. Performance: avoid cross-patch redundancy
Before adding a patch, check if another patchset already covers the same class/method. Common overlaps: ad removal, root detection, package enumeration, dialog suppression.

### 8. Never patch nullCheck() methods
`nullCheck()` methods cause `VerifyError` when patched — no expected register allocation; prepending breaks jump targets. **Fix:** Remove all nullCheck() patches; patch the calling code instead.

### 9. Injected smali: high parameter registers are SILENTLY DROPPED
4-bit register fields (`invoke-* {vN}`, `iget/iput` destination) only accept v0–v15. `pN` maps to high numbers in methods with many registers; Morphe silently drops the instruction → VerifyError at runtime.

**Fix:** shuttle `pN` into a low register first:
```smali
move-object/from16 v0, p2          # object param
iget-object v0, v0, Ll/ii70;->b:Ljava/lang/Object;
invoke-virtual {v0}, ...           # v0 is low → OK
```
- Internal labels only resolve at index 0. Always inject at index 0.
- Methods with `registerCount == paramCount` have NO free scratch registers. Save/restore clobbered params from fields.
- **Verify:** disassemble target method in patched APK with `tools\inspect.bat`.

### 10. Messages list cells — filter at the data level, not the view
`ConversationItemView.x0` is only dispatched for type-13 header cells — injecting GONE there is dead code for normal rows. **Fix:** filter display data at `ConversationsList.O2(List, Z)List`. Drop ONLY `fakeReceiveLikeGuideSVip` and `fakeIntlReceiveChatRequest` by EXACT convType. KEEP `fake_one_side`/`fake_one_side_no_match` and `intlSeeChatRequest`. Do NOT filter on `isFake`/`fake_id_` alone or `startsWith("fake")`.

### 11. Swipe-tab promo popups — patch the dialog CREATOR, not the content view
Likers promo dialogs built by static void methods in one obfuscated class. **Fix:** patch creators to `return-void` (match by popup-key string literal, static+void filter). Patching only the content view leaves an empty dialog frame. OMS `M()` gate alone fails in `__control` AB bucket which bypasses it.

### 12. Swipe-deck promo CARDS — filter at the consumer, not just insert points
Insert-point filters leak cards from the server-loaded list. **Fix:** consumer-side filter at `home/c.y(List)List` — the FINAL deck render transform. Rebuild list dropping `UserInfo.isVirtualCard()`. Register trap: only 5 registers — save/restore `this` and shuttle params.

### 13. Top-of-swipe-screen likers-float banner — kill the `O3` filter
Banner pipeline: `CoreLikers.P6()` → `filter(O3)` → banner view. **Fix:** force `O3` (static, returns boxed `Boolean`) to `Boolean.FALSE`. Fingerprint traps: enum constants are `sget-object` FIELD accesses (use `fieldAccess(name=...)`); `O3`/`J7`/`K7` return boxed `Ljava/lang/Boolean;` — select by `AccessFlags.STATIC` + `returnType=="Ljava/lang/Boolean;"`.

### 14. UnifiedClassResolver early-exit cap silently dropped late-DEX classes
Early-exit at `resolvedClasses.size >= totalTargets` skipped classes late in DEX order. **Fix:** remove the early-exit; always complete the single O(n) pass. ALWAYS DEX-verify a known method in the patched APK.

### 15. `Fingerprint(filters=...)` anchors must co-occur in ONE method
Anchors in different methods → `matchOrNull()` returns null (silent no-op). **Fix:** single unique anchor → resolve class then iterate methods class-wide; or class-wide resolver combining `foundStrings` + `methodCallFull`. RemoteConfig F/s no-scratch override: delegate to provider returned by `u()` (has free scratch).

### 16. Patcher 2.4.0 / plugin 2.1.0 upgrade notes
- `Patch` is non-generic now (`Set<Patch>`, not `Set<Patch<*>>`)
- `PatcherConfig` signature changed (no `aaptBinaryPath`/`frameworkFileDirectory`/`useArsclib`)
- arsclib fork rename: `setValueAsString` → `setDataAsString`
- Signing is v2-only library-side; add `implementation("com.google.guava:guava:33.6.0-jre")`; Windows STRIP_FAST safe.

### 17. Resolver conditions must NOT embed obfuscated names
Stale obfuscated names in resolver `methodCallFull` checks = silent no-ops. **Rule:** never put an obfuscated class/method name in a resolver condition; anchor on stable strings/fields/shapes only.

**OMS "morph" server promos:** text absent from local resources = server-configured morph campaign; `M()` gate bypassed. **Fix:** void `OmsPageAct.b2()` AND `c2()` so fields stay null. Do NOT void `hn60.n` wholesale (routes verification).

### 18. Compatibility waves — APK versions, safe matching, inner-class hijacks
- `tantan-7.5.6.1.apk` = 7.5.6.1 (AUTHORITATIVE). `tantan-7.5.4.apk` = historical reference only.
- Apply-only test passes on silent no-ops. ALWAYS DEX-verify each target method's first instructions in the patched APK.
- `match.method` THROWS; use `matchAllOrNull(classDef).orEmpty().forEach`.
- Inner-class hijack: const-string lives in both outer class and inner Runnable. Pair string anchor with target-method SHAPE check. For inner-class prefix matching: `type.removeSuffix(";") + "$"`.
- Enum constants are FIELD accesses, not method calls; compile-time String constants are INLINED to `const-string`.
- `BuilderInstruction20t` takes a `Label`, not an Int offset. Read target `Label` from mutable builder instruction.
- Build needs GitHub creds + offline: `tools\gradle.bat <task>` with `GITHUB_ACTOR`/`GITHUB_TOKEN` and `--offline`.

### 19. InlineSmaliCompiler `pN` aliases mis-count WIDE parameters
`pN`→`vN` mapping ignores that `J`/`D` occupy 2 registers; bug bites `p1+` after a wide param. **Fix:** compute ABSOLUTE registers from `registerCount` and param signature for wide-parameter methods; `pN` safe ONLY when every parameter is single-word. `preflightSmali` count assertion does NOT catch this — only post-build DEX inspection reveals wrong source register.

## 20. 7.5.6.1 migration notes — mass-refactor release

7.5.6.1 (2756110) is NOT ordinary obfuscation churn. Three systemic changes:

### Systemic changes
1. **`rx.c` (RxJava Observable) was obfuscated to `Ll/vpf;`.** `rx/c.java` no longer exists. Use `Ll/vpf;->empty()Ll/vpf;` and `Ll/vpf;->just(Object)Ll/vpf;`.

2. **Previously-stable outer classes were obfuscated or deleted.** Key renames (7.5.4 → 7.5.6.1):

| old | new | note |
|-----|-----|------|
| `remote_config/RemoteConfig` | `Ll/ngi;` | getters F→k/c/s/i/h/y; long B → provider `Ll/pq2;.e(String,J)J` |
| `ab/ABManager` (api/) | `Ll/q;` | bucket read j0→`q.t(String)String` |
| `core/api/CoreProduct` | `Ll/is3;` | purchase gate Q4→`is3.S(PurchaseType)Z` static |
| `core/api/CoreLikers` | `Ll/lk3;` | `CoreLikers$a`→`Ll/kk3;`; `S6()` removed |
| `core/api/CoreSuggested` | `Ll/yom;` | only `CoreSuggested$UserInfo` keeps the name |
| `core/api/CoreIntlAffiliatePromotions` | `Ll/oh3;` | M3→`oh3.S(IntlAffiliateDiscountEntryTab)Z` |
| `home/b` | `Ll/naf;` | `home/c` gone (deck transform relocated) |
| Fox facade `ofh0` | `Ll/l7k;` | init `c(TantanApp,String)V` (exempt!) |
| Fox sender `m3m0.b` | `Ll/mmm.b(String,JsonArray,I)Z` | force true |
| GA4 `iiu0.Q()Z` | `Ll/dyq.g()I` | force 1 |
| Beatles `h53`/`luw` | `Ll/c41;` | upload `f(List,String,J,lmm)V` + push entry `a(J,String,String)V` |
| OAID `z810` | `Ll/f8e;` | init `b(TantanApp)V` |
| AppsFlyerLib | `com/appsflyer/internal/AFb1tSDK` | abstract base, concrete impl |
| FetchedAppSettingsManager | `Ll/ru6;` | fetch `a()JSONObject` static no-arg |
| AppEventsLogger | `Ll/na0;` | activateApp `b(Application,String)V` (not final) |
| AdvertisingIdClient$Info | `Ll/st;` | derive Info type from `getAdvertisingIdInfo` returnType dynamically |
| OMS gate `em60` | `Ll/ssf;` | M→`n(String,Z)Z` |
| morph router `hn60` | `Ll/btf;` | `c(Act,OMSDialogInfo)Z` |
| likers quota `gjc0` | `Ll/oth;` | quota `c()Z`, expiry `a()/b()J` |
| roaming gate `bun0` | `Ll/yan;` | `a(Act,String,String)Z` (param order changed) |
| location upload `core/api/c` | `Ll/a33;` | gate in `call(Object)V` lambda |
| location throttle `location/a.v(J,Z)V` | `location/a.h(J)V` | Z param removed |
| push poster `c0j0` | `Ll/d9l;` | `c(PushMessage,PendingIntent,Intent,Action,Action)V` |
| push tracker `rtc0` | `Ll/mb0;` | tracking Runnable `run()V` |
| telepathy gate `o3k0` | `Ll/x3r;` | `b(g6m)Z` reads TpTelepathyConv.replyLengthLimit |
| privilege `o3b` (xma) | `Ll/cs3;` | core gates survive; counts moved to `fv2.g(...)` |

3. **Method bodies extracted into shared synthetic lambda dispatchers** (`ej7`, `tq3`, `uu3`, `kbf`, `sga`, `c03`, `edf`, `lrd`, `c22`, `h0e`, `z31`, `zic`, `a14`, `z0`, `te3`, `m1`…). These multiplex UNRELATED features via `packed-switch`/`call(Object)` cases. **Never prepend-void a shared dispatcher** — it breaks other cases. Re-anchor on the dedicated downstream method or do case-level surgery.

### Name-reuse hazard
`zw3, ih9, ytb, o71, hcj, rrn, liq, rcp, uu7, zx6, j5k` STILL EXIST in 7.5.6.1 but are UNRELATED classes. Hardcoded `classDefByOrNull` on them silently no-ops. Always resolve by anchor + shape.

**Verified identity corrections:** `yom` is NOT CoreSuggested; real successor is **`ev3`** (`CoreModule.c.U`). `tbg` is NOT `ii70` — generic **Pair**. `ae9` is EMPTY (Ultra upgrade is **`zi3`**); `ysa` is Google **Tink protobuf** (dead upstream). `CoreSuggested$UserInfo` and `CoreLikers$LikersTriggerBy` enum are STABLE.

### Restored & pending (summary)
**Restored:** RemoteConfig, ABTest, Analytics, Location, Premium purchase gate, roaming gate, theme unlock, Privacy, Messaging telepathy gate, OMS morph router, Push Filter, Search Discovery, GMS, Live Streaming, Premium tier/privilege core, Settings, counters, fake-conversation filter, persistence choke, likers/banner/bubble, premium secondary, ad binds, typing, voice 60s cap, loveBuzz, buzzProlong/pinChat/aiChatAdvice, see-anim bubble, icebreak limit.

**Pending (deferred — shared-dispatcher case surgery HIGH risk or un-restorable upstream):**
- See-purchase-guide dialog (`rcf.call` case1, shared 29-case dispatcher): case-entry detection failed.
- Deck insert filters (`tq3`/`uu3` shared cases): case-entry detection failed; old consumer backstop GONE.
- aiChatCompanion (`j4e.o`): count branch targets TOAST/failure path; recipe inapplicable.
- Experimental voice-to-text 7a: anchor string GONE; no client-side gate found (server-gated).
- Already dead in 7.5.4: meetEntranceBanner, suggestedUsersBanner, meetNewLikersData, serverDataFlagSetter/newLikesFlagSetter, mb90, coreData, secretCrush; ChatPartnerConfig messageLimit + PlatinumPinChat getLevel removed upstream.

### In-place branch recipe correction
`if-gtz`/`if-lez` are SINGLE-register conditions = format **21t** (`BuilderInstruction21t`), NOT 22t. 22t is two-register `if-lt`/`if-gt`. Casting if-gtz to `BuilderInstruction22t` silently fails → 0 edits. Use `BuilderInstruction21t.target` + `replaceInstruction(i, BuilderInstruction20t(Opcode.GOTO_16, target))`.

### Update-resilient anchoring
Mass-refactor fragility is fixed by making anchors **relational** (follow call edges) not **co-locational**:
1. **Reverse-call-graph navigation** — index callee→callers, BFS from stable sink to gating method.
2. **Instruction-filter chains with OR + allowed gaps** — tolerates insertion/reordering.
3. **Framework-superclass / manifest / resource seeds** as stable entry points.
4. **CI zero-match reporting** — run resolver per new APK, flag anchors resolving 0 matches.
5. **Shared dispatchers:** anchor on unique downstream callee or call-site discriminator, never the shared class.

**Verification rule:** the apply-only test passes on silent no-ops. ALWAYS DEX-verify each target method's first instructions in `tantan-premium-unlocked.apk` (`tools\inspect.bat`). Modified-class count: **625** (final wave).

## Fable Method
Before any non-trivial backend task, apply the fable-method loop; for tasks that will run unattended or fan out subagents, use fable-loop. After completing substantive work, or whenever any agent/tool claims work is done, run a fable-judge pass before presenting it as finished.