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

Expected file size for `patches-0.0.1-dev1.mpp`: ~60-65 KB (includes DEX bytecode). If it's significantly smaller (~40 KB), the buildAndroid task was not run.

## Patch Architecture

The project uses a single consolidated `PremiumUnlockPatch` that handles:
- User tier status methods (isUltraPremium, isVIP, etc.)
- Privilege gates and expiration checks
- Subscription validation and regional gates
- Feature gates and display timestamps

All patches use `isMe()` guards to ensure they only affect the current user, not other users' profiles.
