package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MediaReorderCardScaleIndependentFrame extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f822a;

    /* JADX INFO: renamed from: b */
    public View f823b;

    public MediaReorderCardScaleIndependentFrame(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1151a(float f, View view) {
        if (NullChecker.b(view)) {
            view.setScaleX(1.0f / f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1152b(float f, View view) {
        if (NullChecker.b(view)) {
            view.setScaleY(1.0f / f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f822a = findViewById(a5c0.P);
        this.f823b = findViewById(a5c0.R);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (xdl0.S(f2)) {
            return;
        }
        if (NullChecker.b(this.f822a)) {
            this.f822a.setPivotX(getWidth() - this.f822a.getLeft());
            this.f822a.setScaleX(f2);
        }
        m1151a(f, this.f823b);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (xdl0.S(f2)) {
            return;
        }
        if (NullChecker.b(this.f822a)) {
            View view = this.f822a;
            view.setPivotY(view.getHeight() - this.f822a.getBottom());
            this.f822a.setScaleY(f2);
        }
        m1152b(f, this.f823b);
        super.setScaleY(f);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
