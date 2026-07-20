# Tantam Premium Patching Plan

## Understanding the Target APK

The tantan-7-2-9.apk is a decompiled version of Tantam (a Chinese dating app similar to Tinder). The package structure shows:
- `com.p335p1.mobile.putong` - main app package with all core functionality
- `com.p335p1.mobile.putong.data` - data classes including Settings, MembershipType
- `com.p335p1.mobile.putong.baseverify` - verification logic  
- `com.dtf.face` - face verification modules

## Premium Features to Unlock

Based on the codebase analysis:

### Membership Types (MembershipType.java)
- `default_` (0) - free tier
- `vip` (1) - basic premium  
- `svip` (2) - super vip
- `boostVip` (3)
- `peeper` (4)

### Settings Classes (Settings.java, User.java)
Premium features controlled by:
- `settingGroup.spvip.isSpvip` - super vip flag  
- `settingGroup.upvip.isUpvip` - up vip flag
- `user.membership.vipBadgeType` - membership display badge

### Premium Features Likely Controlled:
1. Ad removal (adsSuggest setting, showAd() calls)
2. Unlimited swipes / boosts
3. See who liked you (vipSeen() method)
4. Advanced filters (svip_advancefilter privilege)
5. Unlimited likes/unlikes per day
6. See who viewed your profile
7. Priority positioning in search results
8. Roaming to see profiles outside local area (vipSearch.momentRoamingLatitude/Longitude)
9. Unlocking liked photos
10. Super like privileges

## Patching Approach

### Required Tools
- **Morphe Patcher** (https://github.com/MorpheApp/morphe-patcher) - modern Android patching library
- **Morphe Manager** (https://github.com/MorpheApp/morphe-manager) - applies patches
- **DeltaGen** or similar for creating .mpp patch bundles

### Steps:
1. Download Morphe tools and set up development environment
2. Analyze the APK bytecode to find premium check hooks:
   - `checkVerify()` or similar verification entry points
   - Ad display logic (showAd, adBlock settings)
   - Membership tier checks in UI components
3. Create patch bytecode modifications:
   - Force `isSpvip`/`isUpvip` to true in Settings getter methods
   - Remove or bypass ad display checks  
   - Set membership type to svip/vip in user data initialization
4. Build .mpp patch bundle with Morphe Patcher
5. Test by applying patch to a fresh APK install

## Next Actions

1. Download Morphe tools (morphe-patcher and morphe-manager)
2. Set up Java 21+ environment (required by Morphe)
3. Analyze APK bytecode for premium check locations using JADX decompiler output
4. Create initial patch targeting the most impactful features first (ads, membership tier)

## Notes
- The APK is already decompiled with JADX - the java source files are available
- Premium checks likely use simple boolean flags in Settings that can be overridden via bytecode patching
- Face verification (`baseverify` package) may require special handling if premium bypasses it
