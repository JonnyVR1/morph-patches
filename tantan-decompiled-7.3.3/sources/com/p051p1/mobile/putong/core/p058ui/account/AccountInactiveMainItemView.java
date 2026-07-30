package com.p051p1.mobile.putong.core.p058ui.account;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p151v.VText;
import p153l.C19625qq;

/* JADX INFO: loaded from: classes9.dex */
public class AccountInactiveMainItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f29055a;

    /* JADX INFO: renamed from: b */
    public ImageView f29056b;

    public AccountInactiveMainItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m45293a(View view) {
        C19625qq.m177475a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45293a(this);
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
