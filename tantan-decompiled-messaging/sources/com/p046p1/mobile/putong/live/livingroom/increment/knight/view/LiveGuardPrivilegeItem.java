package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.rrs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeItem f50446d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50447e;

    /* JADX INFO: renamed from: f */
    public VText f50448f;

    public LiveGuardPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74652h0(View view) {
        rrs.m180570a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74652h0(this);
    }

    public LiveGuardPrivilegeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
