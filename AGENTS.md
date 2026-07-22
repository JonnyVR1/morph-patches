# Morph - Tantam Android Premium Bypass Project

## Overview
This repository contains patches and tools for bypassing premium features in the Tantam Android APK.

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

## Build and Release Commands

### Build Patches
```bash
# Build the patch bundle with DEX bytecode (ESSENTIAL - do not skip)
./gradlew :patches:buildAndroid

# Generate patches-list.json metadata
./gradlew :patches:generatePatchesList

# Combined build (recommended)
./gradlew :patches:generatePatchesList :patches:buildAndroid
```

**Important:** Always use `:patches:buildAndroid` instead of just `:patches:build`. The `buildAndroid` task compiles the Kotlin code to DEX and packages it into the .mpp file. Without it, the .mpp file will be missing the actual patch bytecode.

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
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/357064625/assets" | \
  python3 -c "import json, sys; data = json.load(sys.stdin); [print(f'{a[\"id\"]} {a[\"name\"]}') for a in data]"

# Delete old assets (replace ASSET_ID with actual IDs from above)
curl -s -X DELETE -H "Authorization: token $GITHUB_TOKEN" \
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/assets/ASSET_ID"

# Upload new .mpp file
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/octet-stream" \
  --data-binary @patches/build/libs/patches-0.0.1-dev1.mpp \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/357064625/assets?name=patches-0.0.1-dev1.mpp" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'mpp: {d.get(\"name\", \"ERR\")}')"

# Upload patches-list.json
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  --data-binary @patches-list.json \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/357064625/assets?name=patches-list.json" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'json: {d.get(\"name\", \"ERR\")}')"

# Upload patches-bundle.json
curl -s -X POST -H "Authorization: token $GITHUB_TOKEN" \
  -H "Content-Type: application/json" \
  --data-binary @patches-bundle.json \
  "https://uploads.github.com/repos/JonnyVR1/morph-patches/releases/357064625/assets?name=patches-bundle.json" | \
  python3 -c "import json, sys; d = json.load(sys.stdin); print(f'bundle: {d.get(\"name\", \"ERR\")}')"
```

### Verify Upload
```bash
# Check uploaded file sizes
curl -s -H "Authorization: token $GITHUB_TOKEN" \
  "https://api.github.com/repos/JonnyVR1/morph-patches/releases/357064625/assets" | \
  python3 -c "import json, sys; assets = json.load(sys.stdin); [print(f'{a[\"name\"]}: {a[\"size\"]} bytes') for a in assets]"
```

Expected file size for `patches-0.0.1-dev1.mpp`: ~700 KB (includes DEX bytecode for all patches in `PremiumUnlockPatch.kt` + Google Maps + Signature Spoof). If it's significantly smaller (~40 KB), the buildAndroid task was not run.

## Patch Architecture

The project uses a single consolidated `PremiumUnlockPatch.kt` (`patches/src/main/java/com/p1/mobile/putong/data/`) that handles:
- User tier status methods (isUltraPremium, isVIP, etc.)
- Privilege gates and expiration checks (xma class)
- Subscription validation and regional gates (u59 class)
- Feature gates and display timestamps (CounterSuperlikeAndUndoLimit, CoreProduct, etc.)
- Auto-subscription dialog suppression (src0 class)
- Mystery/blur gating (sb90 Companion class)

Also in `patches/src/main/java/com/p1/mobile/putong/data/`:
- `SignatureSpoofPatch.kt` — patches signature verification for Google Maps
- `GoogleMapsPatch.kt` — enables GMS availability
- `Constants.kt` — shared constants (`TANTAN_PACKAGE_NAME`, `TANTAN_USER_CLASS`, `tantanCompatibility`)

All tier overrides MUST use `isMe()` guards to ensure they only affect the current user, not other users' profiles.

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

For groups of byte-identical overloaded methods (e.g. u59's U/S/O/F/Z/a0/D all return `!IntlCountryCodeController.k()`), fingerprint them as one cluster — they cannot be reliably separated.

Use **bounded** `matchAll(classDef, expectedRange)` to assert expected cardinalities (e.g. `1..2` not `0..N`).

## Morphe Patcher Gotchas

Critical non-obvious behaviors of Morphe v1.6.0 + plugin v1.3.3. **Read before touching patches or PatcherMain.**

### 1. Fingerprint caching: never resolve inside `classDefForEach`

`Fingerprint.matchOrNull(classDef)` caches its result per `classDef` **per Fingerprint instance** for the lifetime of the patcher. If you call it inside `classDefForEach { classDef -> ... matchOrNull(classDef) ... }`, it returns whatever the first classDef cached — usually the wrong class — and silently applies to every iteration, including non-matching classes. Prepending `addInstructions(0, ...)` to a loop function produces an **infinite hang at compile time** ("Stripping 275 modified classes" never finishes).

**Solution:** Restructure `execute { }` into 2 passes:
- **Pass 1** (`classDefForEach`): only iterate classes with stable identifiers (e.g. `User`, `CoreProduct` — known CamelCase names)
- **Pass 2** (top-level): resolve obfuscated class fingerprints once via `classFingerprint.matchOrNull()?.classDef?.let { ... }`

### 2. `ApkMerger` is for App Bundles, not standalone APKs

`ApkMerger.merge(input, output)` calls `extractFile()` which filters ZIP entries by `.apk` extension. A standalone single-module APK has no such entries, so it throws `IOException("No *.apk files found on: $file")`.

**`PatcherResult.applyTo(apkFile)` already produces a valid patched APK in-place** via `ZFile.openReadWrite`. Just sign after that — don't call `ApkMerger`.

### 3. jadx naming traps

When reverse-engineering decompiled Java:
- jadx renames `com.p1` → `com.p335p1`. **Always use the real `com/p1/mobile/putong/...` descriptors in patches.**
- jadx renames obfuscated package `Ll/<obf>;` (single-letter `l` package) to `Lp001l/<obf>;` for readability. **Real DEX descriptors are `Ll/<obf>;`. Never use the `p001l` prefix in fingerprints.**

### 4. Class fingerprints resolve at the patcher-class level

A `classFingerprint = parentFingerprint { ... }` chain must live as a top-level `val` (or `companion object val`), not inside a function. Inside `execute { }`, the same `matchOrNull()` call MUST NOT be called per-classDef (see #1).

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
  Build and deploy to release 357064625
")
```

### Benefits

- **Parallelism** - Multiple investigations run simultaneously
- **Focus** - Each subagent has clear, narrow scope
- **Efficiency** - Reduces context switching for main agent
- **Completeness** - Ensures all angles are investigated
