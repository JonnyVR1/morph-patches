package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p002l.rrs;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeItem f6488d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6489e;

    /* JADX INFO: renamed from: f */
    public VText f6490f;

    public LiveGuardPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8245h0(View view) {
        rrs.m22119a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8245h0(this);
    }

    public LiveGuardPrivilegeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
