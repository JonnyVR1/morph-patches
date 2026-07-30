package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlBottomContentCoverView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f7006a;

    public IntlBottomContentCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m9982a(float f) {
        View view = this.f7006a;
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
