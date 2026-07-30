package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C2489R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import java.util.HashMap;
import java.util.Map;
import p153l.kkl0;

/* JADX INFO: loaded from: classes7.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    @Nullable
    private Map<View, Integer> importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
    }

    private void updateImportantForAccessibility(@NonNull View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0230f) && (((CoordinatorLayout.C0230f) childAt.getLayoutParams()).m1182f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    Map<View, Integer> map = this.importantForAccessibilityMap;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        kkl0.m150184t0(childAt, 4);
                    } else if (map != null && map.containsKey(childAt)) {
                        kkl0.m150184t0(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (z) {
                return;
            }
            this.importantForAccessibilityMap = null;
        }
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(Context context, boolean z) {
        int i = z ? C2489R.animator.mtrl_fab_transformation_sheet_expand_spec : C2489R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.FabTransformationSpec fabTransformationSpec = new FabTransformationBehavior.FabTransformationSpec();
        fabTransformationSpec.timings = MotionSpec.createFromResource(context, i);
        fabTransformationSpec.positioning = new Positioning(17, 0.0f, 0.0f);
        return fabTransformationSpec;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean onExpandedStateChange(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        updateImportantForAccessibility(view2, z);
        return super.onExpandedStateChange(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
