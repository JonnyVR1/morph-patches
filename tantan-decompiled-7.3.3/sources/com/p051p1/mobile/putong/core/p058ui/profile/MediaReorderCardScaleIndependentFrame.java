package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.gdc0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCardScaleIndependentFrame extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f33848a;

    /* JADX INFO: renamed from: b */
    public View f33849b;

    public MediaReorderCardScaleIndependentFrame(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m51898a(float f, View view) {
        if (NullChecker.m82487b(view)) {
            view.setScaleX(1.0f / f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m51899b(float f, View view) {
        if (NullChecker.m82487b(view)) {
            view.setScaleY(1.0f / f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33848a = findViewById(gdc0.f103657P);
        this.f33849b = findViewById(gdc0.f103659R);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (bnl0.m105535S(f2)) {
            return;
        }
        if (NullChecker.m82487b(this.f33848a)) {
            this.f33848a.setPivotX(getWidth() - this.f33848a.getLeft());
            this.f33848a.setScaleX(f2);
        }
        m51898a(f, this.f33849b);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (bnl0.m105535S(f2)) {
            return;
        }
        if (NullChecker.m82487b(this.f33848a)) {
            View view = this.f33848a;
            view.setPivotY(view.getHeight() - this.f33848a.getBottom());
            this.f33848a.setScaleY(f2);
        }
        m51899b(f, this.f33849b);
        super.setScaleY(f);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
