package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p151v.VText;
import p153l.tzo;
import p153l.xzo;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeDescListSeeItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VText f38014a;

    /* JADX INFO: renamed from: b */
    public VText f38015b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem$a */
    public static class C9117a implements tzo {

        /* JADX INFO: renamed from: a */
        public String f38016a;

        /* JADX INFO: renamed from: b */
        public CharSequence f38017b;

        /* JADX INFO: renamed from: c */
        public Privilege f38018c;

        /* JADX INFO: renamed from: d */
        public PurchaseType f38019d;

        /* JADX INFO: renamed from: e */
        public CharSequence f38020e;

        public C9117a(String str, CharSequence charSequence, Privilege privilege, PurchaseType purchaseType) {
            this.f38016a = str;
            this.f38017b = charSequence;
            this.f38018c = privilege;
            this.f38019d = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 3;
        }
    }

    public IntlPrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57681a(View view) {
        xzo.m213783a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57682b(C9117a c9117a) {
        this.f38014a.setText(c9117a.f38016a);
        VText vText = this.f38014a;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f38015b.setText(c9117a.f38017b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57681a(this);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
