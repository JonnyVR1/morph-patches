package com.p051p1.mobile.putong.core.p058ui.view.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class SnackbarBehavior extends CoordinatorLayout.AbstractC0227c<BaseCircleIndicator> {
    public SnackbarBehavior() {
    }

    /* JADX INFO: renamed from: a */
    public final float m57403a(CoordinatorLayout coordinatorLayout, BaseCircleIndicator baseCircleIndicator) {
        List<View> dependencies = coordinatorLayout.getDependencies(baseCircleIndicator);
        int size = dependencies.size();
        float fMin = 0.0f;
        for (int i = 0; i < size; i++) {
            View view = dependencies.get(i);
            if ((view instanceof Snackbar.SnackbarLayout) && coordinatorLayout.doViewsOverlap(baseCircleIndicator, view)) {
                fMin = Math.min(fMin, view.getTranslationY() - view.getHeight());
            }
        }
        return fMin;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BaseCircleIndicator baseCircleIndicator, @NonNull View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BaseCircleIndicator baseCircleIndicator, @NonNull View view) {
        baseCircleIndicator.setTranslationY(m57403a(coordinatorLayout, baseCircleIndicator));
        return true;
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
