package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p147v.VText;
import p149l.txo;
import p149l.xxo;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeDescListSeeItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f37166a;

    /* JADX INFO: renamed from: b */
    public VText f37167b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C8954a implements txo {

        /* JADX INFO: renamed from: a */
        public String f37168a;

        /* JADX INFO: renamed from: b */
        public CharSequence f37169b;

        /* JADX INFO: renamed from: c */
        public Privilege f37170c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f37171d;

        /* JADX INFO: renamed from: e */
        public CharSequence f37172e;

        public C8954a(String str, CharSequence charSequence, Privilege privilege, PurchaseType purchaseType) {
            this.f37168a = str;
            this.f37169b = charSequence;
            this.f37170c = privilege;
            this.f37171d = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56498a(View view) {
        xxo.m211532a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56499b(C8954a c8954a) {
        this.f37166a.setText(c8954a.f37168a);
        VText vText = this.f37166a;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f37167b.setText(c8954a.f37169b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56498a(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
