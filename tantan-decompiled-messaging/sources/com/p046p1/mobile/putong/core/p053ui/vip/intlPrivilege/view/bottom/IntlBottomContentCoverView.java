package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes9.dex */
public class IntlBottomContentCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f37225a;

    public IntlBottomContentCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m56540a(float f) {
        View view = this.f37225a;
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
