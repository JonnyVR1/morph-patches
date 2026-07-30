package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.byo;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f6954a;

    /* JADX INFO: renamed from: b */
    public VImage f6955b;

    /* JADX INFO: renamed from: c */
    public TextView f6956c;

    public IntlPrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9941a(View view) {
        byo.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9941a(this);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
