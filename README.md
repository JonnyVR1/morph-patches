# Morph - Tantan Premium Bypass Patches

## Overview
Morphe bytecode patches that unlock premium features in Tantan v7.2.9. Patches are bundled as `.mpp` files and applied directly to the APK.

## Version Compatibility
| App | Package | Version |
|-----|---------|---------|
| Tantan | `com.p335p1.mobile.putong` | 7.2.9 |

## Patches (13 total)

### Settings Patches (4)
| Patch | Method | Effect |
|-------|--------|--------|
| SettingsSupremePartner | `Settings.isSupremePartner()` | Returns `true` |
| SettingsPlatinum | `Settings.isPlatinum()` | Returns `true` |
| SettingsODiamond | `Settings.userIsODiamond()` | Returns `true` |
| SettingsDisableAds | `Settings.personalizeAdsSuggest()` | Returns `false` |

### User Patches (9)
| Patch | Method | Effect |
|-------|--------|--------|
| UserIsVip | `User.isVIP()` | Returns `true` |
| UserIsSVIP | `User.isSVIP()` | Returns `true` |
| UserIsUltraPremium | `User.isUltraPremium()` | Returns `true` |
| UserIsSupremePartner | `User.isSupremePartner()` | Returns `true` |
| UserIsPlatinum | `User.isPlatinum()` | Returns `true` |
| UserIsODiamond | `User.isODiamond()` | Returns `true` |
| UserIsMembership | `User.isMembership()` | Returns `true` |
| UserIsMembershipUsed | `User.isMembershipUsed()` | Returns `true` |
| UserIsVipExpired | `User.isVIPExpired()` | Returns `false` |

## Building

### Prerequisites
- Java 17+
- Android SDK with build-tools

### Build Commands
```bash
# Build the patch bundle
./gradlew :mpp-core:jar
# Output: mpp-core/build/libs/mpp-core-1.0.0.mpp

# Run tests
./gradlew :mpp-core:test

# Build and apply patches to APK
./gradlew :mpp-core:patchApk
# Output: tantan-premium-unlocked.apk
```

### Apply Patches Manually
```bash
# After building the bundle
java -cp "mpp-core/build/libs/mpp-core-1.0.0.mpp:mpp-core/build/libs/*" \
  app.morphe.PatcherMainKt <input.apk> <output.apk>
```

## Publishing to GitHub Packages

```bash
# Set credentials
export GITHUB_ACTOR=your-username
export GITHUB_TOKEN=your-token

# Publish
./gradlew :mpp-core:publish
```

## Project Structure
```
Morph/
├── mpp-core/
│   ├── src/main/java/
│   │   ├── app/morphe/
│   │   │   ├── PatcherMain.kt        # CLI entry point
│   │   │   └── PatchRegistry.kt      # Patch collection
│   │   └── com/p335p1/mobile/putong/data/
│   │       ├── SettingsPatches.kt    # 4 settings patches
│   │       └── UserPatches.kt        # 9 user patches
│   └── build.gradle.kts
└── README.md
```
