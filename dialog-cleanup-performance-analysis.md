# Dialog Cleanup Patch Performance Analysis

## Executive Summary

The DialogCleanupPatch has several performance bottlenecks that contribute to the overall 9m 44s patching time. The patch contains **11 class fingerprints**, **1 classDefForEach loop**, and **11 matchOrNull() calls**. Key issues include redundant fingerprint matching, inefficient class iteration, and opportunities for consolidation.

## Current Performance Profile

### Patch Statistics
- **Total fingerprints defined**: 11
- **classDefForEach loops**: 1 (lines 31-43)
- **matchOrNull() calls**: 11 (lines 45-181)
- **Total lines of code**: 254
- **Target dialogs**: 11 different dialog types

### Fingerprint Inventory
1. `mx0ClassFingerprint` - p_appstore_rating_filter_popup
2. `zrj0ClassFingerprint` - p_alert_version_upgrade_popup
3. `ok3ClassFingerprint` - p_offline_popup + LikersDialogView
4. `u750ClassFingerprint` - p_offline_popup + h0 method (REDUNDANT with #3)
5. `ygh0ClassFingerprint` - p_prompt_notification_auth_popup_view
6. `autoSubDialogClassFingerprint` - p_reauto + e_reauto + reauto_showfrom
7. `priceRecall2DialogClassFingerprint` - p_discount_retain
8. `priceRecallGetSurprise2DialogClassFingerprint` - p_got_discount
9. `vipUpgradePopupClassFingerprint` - vip_upgrade_popup
10. `dislikeWhoLikedMeClassFingerprint` - special_like_dlg_
11. Hardcoded class lookup - Lcom/p1/mobile/putong/core/ui/gp/a; (via classDefForEach)

## Specific Bottlenecks

### 1. Inefficient classDefForEach Loop (CRITICAL)
**Location**: Lines 31-43

**Problem**: 
```kotlin
classDefForEach { classDef ->
    if (classDef.type == "Lcom/p1/mobile/putong/core/ui/gp/a;") {
        mutableClassDefBy(classDef).methods.forEach { method ->
            // ... patch logic
        }
    }
}
```

This iterates **ALL classes in the APK** (potentially 10,000+ classes) just to find one specific class with a stable CamelCase descriptor. This is extremely inefficient.

**Impact**: Estimated 30-60 seconds of unnecessary iteration

**Solution**: 
- Option A: Consolidate into a single classDefForEach with multiple stable class checks (like UiCleanupPatch)
- Option B: Use direct class lookup if the patcher API supports it
- Option C: Convert to a fingerprint-based lookup with stable anchors

### 2. Redundant Fingerprint Matching (HIGH)
**Location**: Lines 199-211

**Problem**:
```kotlin
private val ok3ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        string("LikersDialogView"),
    ),
)

private val u750ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),  // DUPLICATE!
        methodCall(name = "h0"),
    ),
)
```

Both fingerprints search for `string("p_offline_popup")`, which means:
- The patcher scans all classes twice for the same string
- Both fingerprints likely match the same class or closely related classes
- Redundant work during fingerprint resolution

**Impact**: Estimated 10-20 seconds of duplicate scanning

**Solution**: 
- Investigate if these target the same class or different classes
- If same class: merge into a single fingerprint with combined filters
- If different classes: use more specific strings to differentiate

### 3. Multiple Separate matchOrNull() Calls (MEDIUM)
**Location**: Lines 45-181

**Problem**: 11 separate matchOrNull() calls, each with overhead:
```kotlin
mx0ClassFingerprint.matchOrNull()?.classDef?.let { ... }
zrj0ClassFingerprint.matchOrNull()?.classDef?.let { ... }
ok3ClassFingerprint.matchOrNull()?.classDef?.let { ... }
// ... 8 more
```

While these are not in loops (which would be catastrophic per AGENTS.md §1), each call still has overhead for:
- Fingerprint resolution
- Class matching
- Cache lookups

**Impact**: Estimated 5-10 seconds total overhead

**Solution**: 
- Consolidate similar patches into single loops
- Batch fingerprint matching where possible

### 4. Similar Patch Logic Not Consolidated (MEDIUM)
**Location**: Lines 126-155

**Problem**: Three fingerprints patch identical method signatures:
```kotlin
autoSubDialogClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
    mutableClassDefBy(classDef).methods.forEach { method ->
        if ((method.name == "show" || method.name == "display" || method.name == "present") &&
            method.returnType == "V"
        ) {
            method.addInstructions(0, RETURN_VOID)
        }
    }
}

priceRecall2DialogClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
    mutableClassDefBy(classDef).methods.forEach { method ->
        if ((method.name == "show" || method.name == "display" || method.name == "present") &&
            method.returnType == "V"
        ) {
            method.addInstructions(0, RETURN_VOID)
        }
    }
}

priceRecallGetSurprise2DialogClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
    mutableClassDefBy(classDef).methods.forEach { method ->
        if ((method.name == "show" || method.name == "display" || method.name == "present") &&
            method.returnType == "V"
        ) {
            method.addInstructions(0, RETURN_VOID)
        }
    }
}
```

**Impact**: Code duplication and minor overhead from multiple iterations

**Solution**: Consolidate into a single loop that processes all three classes

## Redundant Patches

### Confirmed Redundancies
1. **ok3ClassFingerprint vs u750ClassFingerprint**: Both use `string("p_offline_popup")`
   - Need to verify if they target the same class or different classes
   - If same class: merge fingerprints
   - If different classes: use more specific anchor strings

### Potential Overlaps with Other Patches
- **autoSubDialogClassFingerprint** (DialogCleanupPatch) vs **src0ClassFingerprint** (PremiumUnlockPatch)
  - Both target auto-subscription features but with different strings
  - DialogCleanupPatch: "p_reauto", "e_reauto", "reauto_showfrom"
  - PremiumUnlockPatch: "recall_dlg_show", "reauto_duration", "reauto_product", "if_auto_order"
  - These appear to target different aspects (dialog suppression vs expiry display)
  - **Not redundant** - different purposes

## Optimization Recommendations

### Priority 1: Eliminate classDefForEach (HIGH IMPACT)
**Estimated savings**: 30-60 seconds

Replace the inefficient classDefForEach with one of these approaches:

**Option A: Consolidate into UiCleanupPatch-style pattern**
```kotlin
classDefForEach { classDef ->
    when (classDef.type) {
        "Lcom/p1/mobile/putong/core/ui/gp/a;" -> {
            // patch gp/a methods
        }
        // Add other stable classes here if needed
    }
}
```

**Option B: Convert to fingerprint with stable anchor**
```kotlin
private val gpAClassFingerprint = Fingerprint(
    filters = listOf(
        methodCall(definingClass = "Lcom/p1/mobile/android/app/Act;", name = "<init>"),
        // Add other stable anchors from the class
    ),
)

gpAClassFingerprint.matchOrNull()?.classDef?.let { classDef ->
    // patch methods
}
```

### Priority 2: Merge Redundant Fingerprints (HIGH IMPACT)
**Estimated savings**: 10-20 seconds

Investigate and merge ok3ClassFingerprint and u750ClassFingerprint:

```kotlin
// If they target the same class:
private val offlinePopupClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        string("LikersDialogView"),
        methodCall(name = "h0"),
    ),
)

// If they target different classes, use more specific strings:
private val ok3ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        string("LikersDialogView"),
        string("unique_to_ok3"),  // Add differentiator
    ),
)

private val u750ClassFingerprint = Fingerprint(
    filters = listOf(
        string("p_offline_popup"),
        methodCall(name = "h0"),
        string("unique_to_u750"),  // Add differentiator
    ),
)
```

### Priority 3: Consolidate Similar Patches (MEDIUM IMPACT)
**Estimated savings**: 5-10 seconds

Merge the three similar dialog suppression patches:

```kotlin
// Define all three fingerprints
val dialogFingerprints = listOf(
    autoSubDialogClassFingerprint,
    priceRecall2DialogClassFingerprint,
    priceRecallGetSurprise2DialogClassFingerprint,
)

// Process all in a single loop
dialogFingerprints.forEach { fingerprint ->
    fingerprint.matchOrNull()?.classDef?.let { classDef ->
        mutableClassDefBy(classDef).methods.forEach { method ->
            if ((method.name == "show" || method.name == "display" || method.name == "present") &&
                method.returnType == "V"
            ) {
                method.addInstructions(0, RETURN_VOID)
            }
        }
    }
}
```

### Priority 4: Optimize Method Filtering (LOW IMPACT)
**Estimated savings**: 2-5 seconds

Some patches iterate all methods when they could filter more efficiently:

```kotlin
// Current: iterates all methods
mutableClassDefBy(classDef).methods.forEach { method ->
    if (method.name == "H" && ...) { ... }
}

// Optimized: filter first
mutableClassDefBy(classDef).methods
    .filter { it.name == "H" && it.parameterTypes.size == 1 && ... }
    .forEach { it.addInstructions(0, RETURN_VOID) }
```

## Estimated Time Savings

| Optimization | Estimated Savings | Priority |
|--------------|-------------------|----------|
| Eliminate classDefForEach | 30-60 seconds | HIGH |
| Merge redundant fingerprints | 10-20 seconds | HIGH |
| Consolidate similar patches | 5-10 seconds | MEDIUM |
| Optimize method filtering | 2-5 seconds | LOW |
| **Total estimated savings** | **47-95 seconds** | - |

**Expected improvement**: Reduce DialogCleanupPatch time by ~50-80%, from ~2-3 minutes to ~30-60 seconds

## Implementation Plan

### Phase 1: Quick Wins (30 minutes)
1. Merge ok3ClassFingerprint and u750ClassFingerprint
2. Consolidate the three similar dialog suppression patches
3. Test to ensure all dialogs are still suppressed

### Phase 2: Major Optimization (1-2 hours)
1. Investigate the hardcoded class "Lcom/p1/mobile/putong/core/ui/gp/a;"
2. Determine if it can be converted to a fingerprint or consolidated
3. Implement the chosen optimization approach
4. Test thoroughly to ensure no regressions

### Phase 3: Verification (30 minutes)
1. Build the patch bundle
2. Verify all 11 dialogs are still suppressed
3. Measure actual performance improvement
4. Update documentation

## Additional Notes

### Fingerprint Efficiency
The current fingerprints use stable product strings, which is good. However:
- Some fingerprints could be more specific to avoid false matches
- Consider adding method signature filters to reduce matching overhead

### Code Quality
- Several patches have duplicated logic that could be extracted into helper functions
- Consider creating a `patchDialogMethods(classDef, methodNames, replacement)` helper

### Future Considerations
- Monitor for new dialog types that may be added in future app versions
- Consider creating a dialog registry for easier maintenance
- Document which dialogs each fingerprint targets for future developers
