package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VImage;
import p153l.b0p;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListTitle extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextView f38021a;

    /* JADX INFO: renamed from: b */
    public VImage f38022b;

    /* JADX INFO: renamed from: c */
    public TextView f38023c;

    public IntlPrivilegeDescListTitle(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57683a(View view) {
        b0p.m101330a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57683a(this);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
