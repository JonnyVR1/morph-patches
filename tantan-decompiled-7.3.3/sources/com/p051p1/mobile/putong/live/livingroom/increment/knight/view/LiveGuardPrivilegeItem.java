package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.sts;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveGuardPrivilegeItem f51294d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51295e;

    /* JADX INFO: renamed from: f */
    public VText f51296f;

    public LiveGuardPrivilegeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75835h0(View view) {
        sts.m187895a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75835h0(this);
    }

    public LiveGuardPrivilegeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
