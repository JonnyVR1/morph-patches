# Performance Optimization Summary

## Changes Implemented

### 1. Shared Resolver Cache (PatchUtils.kt)
Added a shared resolver cache to eliminate redundant class resolution across patches:

```kotlin
private val sharedResolverCache = WeakHashMap<BytecodePatchContext, UnifiedClassResolver>()

fun BytecodePatchContext.getSharedResolver(): UnifiedClassResolver {
    return sharedResolverCache.getOrPut(this) {
        UnifiedClassResolver(this).also { it.resolve() }
    }
}
```

### 2. Updated All Patches
Modified all 7 patches to use the shared resolver:
- AnalyticsDisablePatch.kt
- DialogCleanupPatch.kt
- GmsCompatibilityPatch.kt
- MessagingPatch.kt
- PremiumUnlockPatch.kt
- PrivacyEnhancementPatch.kt
- UiCleanupPatch.kt

**Before:**
```kotlin
val resolver = UnifiedClassResolver(this)
resolver.resolve()
```

**After:**
```kotlin
val resolver = getSharedResolver()
```

### Expected Performance Improvement
- **Before**: Each patch created its own resolver and iterated through all classes
- **After**: Single resolver instance shared across all patches
- **Expected Speedup**: 40-60% reduction in class resolution time

## INSTALL_FAILED_MISSING_SPLIT Issue

### Root Cause
This error occurs when:
1. The original Tantan app was installed from Play Store as a **split APK set** (App Bundle)
2. We're patching a **universal APK** (single file)
3. Android's package manager expects split APK updates to also be split APKs
4. The signature mismatch (we re-sign) compounds the issue

### Solution
**Uninstall the existing app first, then install the patched universal APK.**

This is a known limitation when updating apps originally installed from Play Store as splits. The Android package manager maintains metadata about the original installation format and expects updates to match.

### Alternative Solutions
1. **Use a split APK for patching**: Extract the full split set from the Play Store and patch the base APK along with required splits
2. **Use root installation**: With root access, you can force-install universal APKs over split installations
3. **Wait for Morphe Manager update**: Future versions may handle this scenario automatically

### References
- [Morphe Manager Issue #70](https://github.com/MorpheApp/morphe-manager/issues/70)
- [Morphe Manager Issue #127](https://github.com/MorpheApp/morphe-manager/issues/127)
- [Android INSTALL_FAILED_MISSING_SPLIT Documentation](https://risusan.net/en-android-install-failed-missing-split/)

## Build Instructions

```bash
# Set environment variables
$env:ANDROID_HOME = "D:\Android\Sdk"
$env:GITHUB_ACTOR = "JonnyVR1"
$env:GITHUB_TOKEN = "<your-github-token>"

# Build patches (skip lint for signature extension)
./gradlew :patches:build -x lint

# Build full APK
./gradlew :patches:patchApk
```

## Lint Warnings (Pre-existing)
The signature extension uses reflection to access private Android APIs, which triggers lint warnings:
- `BlockedPrivateApi`: Reflective access to `sPackageInfoCache` and `mPackageInfoCache`
- These are necessary for signature spoofing functionality
- Suppress with `-x lint` flag or add baseline file

## Next Steps
1. Test the performance improvement with the new shared resolver
2. Document the installation workaround for users
3. Consider adding a pre-flight check in Morphe Manager to detect split APK installations
4. Investigate further optimizations from the subagent research (Fingerprint.matchAll(), extension modules)
