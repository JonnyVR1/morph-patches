# Infinite Loading Investigation Report

## Summary
The infinite loading on the match screen persists after the xmaWrapperX3Fingerprint fix (commit d4dc776b). The root cause is likely in the CoreProduct patches introduced in commit a6500ca.

## Timeline
1. **Before a6500ca**: Only A4() was patched to FALSE (due to matchOrNull cache trap)
2. **a6500ca**: Changed to patch ALL public no-arg Z methods (A4, B4, L4, O4, P4, Q4, R4, T4, y4, z4) to FALSE
3. **d4dc776b**: Fixed xmaWrapperX3Fingerprint to return FALSE instead of TRUE
4. **Current**: Infinite loading still occurs

## Root Cause Analysis

### CoreProduct Methods Patched to FALSE

The commit a6500ca changed the CoreProduct patch from:
```kotlin
// Before: Only A4 patched
method.parameterTypes.isEmpty() && method.returnType == "Z" -> {
    coreProductZ4Fingerprint.matchOrNull(method)?.let { match ->
        match.method.addInstructions(0, RETURN_FALSE)
    }
}
```

To:
```kotlin
// After: ALL public no-arg Z methods patched
method.parameterTypes.isEmpty() &&
    method.returnType == "Z" &&
    AccessFlags.PUBLIC.isSet(method.accessFlags) -> {
    method.addInstructions(0, RETURN_FALSE)
}
```

This patches 10 methods to FALSE:
- **A4()**: "should show seeWhoLikedMe upgrade" - UI gate ✓
- **B4()**: "should show VIP upgrade" - UI gate ✓
- **L4()**: "showcase horizontal enable cache" - UNKNOWN ⚠️
- **O4()**: "has premium upgrade to ultra merchandise" - UNKNOWN ⚠️
- **P4()**: "has upgrade merchandise" - UNKNOWN ⚠️
- **Q4()**: "should show ANY upgrade" - UI gate ✓
- **R4()**: "has remaining likers" - UNKNOWN ⚠️
- **T4()**: "premium promotion active" - UNKNOWN ⚠️
- **y4()**: "should show premium upgrade" - UI gate ✓
- **z4()**: "should show premium upgrade" - UI gate ✓

### Method Semantics

**UI Gates (should be FALSE):**
- A4(), B4(), Q4(), y4(), z4() - These control whether to show upgrade dialogs. Patching to FALSE suppresses the dialogs. ✓

**Unknown Methods (might need TRUE):**
- **L4()**: Returns cached SharedPreferences flag "showcase_horizontal_enable_cache_" + userId
  - Called in p2b0.z() for purchase dialog configs
  - Might control whether showcase/match screen is enabled
  
- **O4()**: Returns TRUE when Promo_premiumUpgradeToUltra merchandise list is NOT empty
  - Called in P4() and purchase-related code
  - Might control whether upgrade merchandise is available
  
- **P4()**: Returns TRUE when any upgrade merchandise exists
  - Called in purchase showcase views
  - Might control whether upgrade options are shown
  
- **R4()**: Returns TRUE when user has remaining likers (likersLimit.remaining > 0)
  - Called in A4(), y4(), z4(), S4()
  - Might control whether user can continue swiping
  
- **T4()**: Returns TRUE when premium promotion is active with correct offer type
  - Called in purchase views and privilege cards
  - Might control whether premium promotion UI is shown

### Hypothesis

One or more of the "UNKNOWN" methods (L4, O4, P4, R4, T4) are used in the match screen data loading flow and need to return TRUE for the screen to load properly. Patching them to FALSE blocks the data loading, causing infinite loading.

**Most suspicious candidates:**
1. **R4()** - "has remaining likers" - If the match screen checks this to determine if it should load more data, returning FALSE would block loading
2. **L4()** - "showcase horizontal enable cache" - If this controls whether the showcase/match screen is enabled, returning FALSE would block the screen
3. **T4()** - "premium promotion active" - If this is checked during data loading, returning FALSE might block the flow

## Additional Finding: xma Server Refresh

The xma server refresh methods (u4, x4) are patched to return NULL:
```kotlin
xmaServerRefreshFingerprint.matchAll(xmaClassDef, 1..2).forEach { match ->
    match.method.addInstructions(0, RETURN_NULL_OBJECT)
}
```

These methods fetch "/summarized-privileges" from the server. If they return NULL, the privilege data is never loaded. This could cause issues if the app expects privilege data to be present.

However, this is called from many places (CoreModule.c.C0.u4() appears 20+ times), and the app doesn't crash, so it might handle NULL gracefully.

## Proposed Fix

### Option 1: Selective CoreProduct Patching (Recommended)

Instead of patching ALL public no-arg Z methods to FALSE, only patch the UI gates:

```kotlin
if (classDef.type == "Lcom/p1/mobile/putong/core/api/CoreProduct;") {
    mutableClassDefBy(classDef).methods.forEach { method ->
        when {
            // u4(String) — the only public final Z(String) method
            method.parameterTypes.size == 1 &&
                method.parameterTypes[0] == "Ljava/lang/String;" &&
                method.returnType == "Z" &&
                AccessFlags.FINAL.isSet(method.accessFlags) -> {
                method.addInstructions(0, RETURN_TRUE)
            }
            // UI gates - patch to FALSE to suppress upgrade dialogs
            method.name in setOf("A4", "B4", "Q4", "y4", "z4") &&
                method.parameterTypes.isEmpty() &&
                method.returnType == "Z" &&
                AccessFlags.PUBLIC.isSet(method.accessFlags) -> {
                method.addInstructions(0, RETURN_FALSE)
            }
            // Feature gates - leave unpatched or patch to correct values
            // L4, O4, P4, R4, T4 - DO NOT PATCH
        }
    }
}
```

**Problem**: The methods are obfuscated, so we can't use method names directly.

### Option 2: Fingerprint-Based Selective Patching

Create specific fingerprints for each method based on their behavior:

```kotlin
// A4: calls u4("seeWhoLikedMe") and R4()
val coreProductA4Fingerprint = Fingerprint(
    classFingerprint = coreProductClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("seeWhoLikedMe")),
)

// B4: calls u4("vip") and checks isVIP/isSVIP
val coreProductB4Fingerprint = Fingerprint(
    classFingerprint = coreProductClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("vip")),
)

// Q4: calls B4(), A4(), y4()
val coreProductQ4Fingerprint = Fingerprint(
    classFingerprint = coreProductClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(
        methodCall(name = "B4"),
        methodCall(name = "A4"),
        methodCall(name = "y4"),
    ),
)

// y4: calls u4("premium") and u4("premium_sale")
val coreProductY4Fingerprint = Fingerprint(
    classFingerprint = coreProductClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("premium")),
)

// z4: similar to y4
val coreProductZ4Fingerprint = Fingerprint(
    classFingerprint = coreProductClassFingerprint,
    accessFlags = listOf(AccessFlags.PUBLIC),
    returnType = "Z",
    parameters = emptyList(),
    filters = listOf(string("premium_sale")),
)
```

Then patch only these specific methods:
```kotlin
listOf(
    coreProductA4Fingerprint,
    coreProductB4Fingerprint,
    coreProductQ4Fingerprint,
    coreProductY4Fingerprint,
    coreProductZ4Fingerprint,
).forEach { fingerprint ->
    fingerprint.matchOrNull(coreProductClassDef)?.let { match ->
        match.method.addInstructions(0, RETURN_FALSE)
    }
}
```

### Option 3: Test Each Method Individually

To identify which method(s) cause the infinite loading:
1. Revert to patching only A4() (pre-a6500ca behavior)
2. Test if infinite loading occurs
3. If not, add one method at a time (B4, then L4, then O4, etc.)
4. Test after each addition
5. The method that causes infinite loading is the culprit

## Recommended Action

**Immediate fix**: Use Option 2 (fingerprint-based selective patching) to patch only the UI gates (A4, B4, Q4, y4, z4) and leave the feature gates (L4, O4, P4, R4, T4) unpatched.

**Long-term fix**: Investigate the actual semantics of L4, O4, P4, R4, T4 by:
1. Adding logging to see when they're called
2. Checking what values they return in the original app
3. Determining the correct values for a premium user

## Files to Modify

- `patches/src/main/java/com/p1/mobile/putong/data/PremiumUnlockPatch.kt`
  - Add fingerprints for A4, B4, Q4, y4, z4
  - Change CoreProduct patch to use selective fingerprint-based patching
  - Remove the blanket "all public no-arg Z methods" patch

## Testing

After applying the fix:
1. Build the patch bundle: `./gradlew :patches:buildAndroid`
2. Generate patches list: `./gradlew :patches:generatePatchesList`
3. Test the patched APK on a device
4. Verify that the match screen loads without infinite loading
5. Verify that upgrade dialogs are still suppressed
6. Verify that premium features work correctly
