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
