package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public class IntlBottomContentCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f38073a;

    public IntlBottomContentCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m57723a(float f) {
        View view = this.f38073a;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public IntlBottomContentCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlBottomContentCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
