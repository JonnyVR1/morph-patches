package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import l.jxo;
import p006l.qib0;
import p006l.txo;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6930a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C0387a implements txo {

        /* JADX INFO: renamed from: a */
        public String f6931a;

        public C0387a(String str) {
            this.f6931a = str;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9928a(View view) {
        jxo.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9929b(C0387a c0387a) {
        this.f6930a.setVisibility(0);
        qib0.f19782G.m12744L0(this.f6930a, c0387a.f6931a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9928a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
