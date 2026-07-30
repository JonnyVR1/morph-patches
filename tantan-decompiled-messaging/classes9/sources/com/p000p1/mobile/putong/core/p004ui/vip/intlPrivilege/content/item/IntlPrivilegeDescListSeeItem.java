package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.xxo;
import p006l.txo;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeDescListSeeItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f6947a;

    /* JADX INFO: renamed from: b */
    public VText f6948b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C0390a implements txo {

        /* JADX INFO: renamed from: a */
        public String f6949a;

        /* JADX INFO: renamed from: b */
        public CharSequence f6950b;

        /* JADX INFO: renamed from: c */
        public Privilege f6951c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f6952d;

        /* JADX INFO: renamed from: e */
        public CharSequence f6953e;

        public C0390a(String str, CharSequence charSequence, Privilege privilege, PurchaseType purchaseType) {
            this.f6949a = str;
            this.f6950b = charSequence;
            this.f6951c = privilege;
            this.f6952d = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9939a(View view) {
        xxo.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9940b(C0390a c0390a) {
        this.f6947a.setText(c0390a.f6949a);
        VText vText = this.f6947a;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f6948b.setText(c0390a.f6950b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9939a(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
