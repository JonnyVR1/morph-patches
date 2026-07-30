package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: b */
    public void mo1132b(AttributeSet attributeSet) {
        super.mo1132b(attributeSet);
        this.f1209e = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: c */
    public void mo1135c(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) getLayoutParams();
        c0221a.f1260l0.m1054y0(0);
        c0221a.f1260l0.m1008b0(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: e */
    public void mo1137e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1206b; i++) {
            View viewById = constraintLayout.getViewById(this.f1205a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
