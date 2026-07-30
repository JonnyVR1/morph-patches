package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p149l.jxo;
import p149l.qib0;
import p149l.txo;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListImageItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37149a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem$a */
    public static class C8951a implements txo {

        /* JADX INFO: renamed from: a */
        public String f37150a;

        public C8951a(String str) {
            this.f37150a = str;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 2;
        }
    }

    public IntlPrivilegeDescListImageItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56487a(View view) {
        jxo.m143818a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56488b(C8951a c8951a) {
        this.f37149a.setVisibility(0);
        qib0.f154691G.m102331L0(this.f37149a, c8951a.f37150a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56487a(this);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListImageItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
