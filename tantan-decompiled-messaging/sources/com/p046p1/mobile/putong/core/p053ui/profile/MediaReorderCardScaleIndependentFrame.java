package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.a5c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MediaReorderCardScaleIndependentFrame extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f33000a;

    /* JADX INFO: renamed from: b */
    public View f33001b;

    public MediaReorderCardScaleIndependentFrame(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50715a(float f, View view) {
        if (NullChecker.m81304b(view)) {
            view.setScaleX(1.0f / f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m50716b(float f, View view) {
        if (NullChecker.m81304b(view)) {
            view.setScaleY(1.0f / f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33000a = findViewById(a5c0.f67662P);
        this.f33001b = findViewById(a5c0.f67664R);
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (xdl0.m208355S(f2)) {
            return;
        }
        if (NullChecker.m81304b(this.f33000a)) {
            this.f33000a.setPivotX(getWidth() - this.f33000a.getLeft());
            this.f33000a.setScaleX(f2);
        }
        m50715a(f, this.f33001b);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        float f2 = 1.0f / f;
        if (xdl0.m208355S(f2)) {
            return;
        }
        if (NullChecker.m81304b(this.f33000a)) {
            View view = this.f33000a;
            view.setPivotY(view.getHeight() - this.f33000a.getBottom());
            this.f33000a.setScaleY(f2);
        }
        m50716b(f, this.f33001b);
        super.setScaleY(f);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaReorderCardScaleIndependentFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
