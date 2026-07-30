package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import l.vq;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountInactiveMainItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f1778a;

    /* JADX INFO: renamed from: b */
    public ImageView f1779b;

    public AccountInactiveMainItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m8452a(View view) {
        vq.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8452a(this);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AccountInactiveMainItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
