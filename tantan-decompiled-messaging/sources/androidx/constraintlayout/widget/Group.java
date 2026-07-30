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
    public void mo1131b(AttributeSet attributeSet) {
        super.mo1131b(attributeSet);
        this.f1209e = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: c */
    public void mo1134c(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) getLayoutParams();
        c0220a.f1260l0.m1053y0(0);
        c0220a.f1260l0.m1007b0(0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* JADX INFO: renamed from: e */
    public void mo1136e(ConstraintLayout constraintLayout) {
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
