package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.t100;
import l.w1p;
import l.xdl0;
import p006l.txo;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeSubscriptionItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f6982a;

    /* JADX INFO: renamed from: b */
    public View f6983b;

    /* JADX INFO: renamed from: c */
    public View f6984c;

    /* JADX INFO: renamed from: d */
    public VText f6985d;

    /* JADX INFO: renamed from: e */
    public VText f6986e;

    /* JADX INFO: renamed from: f */
    public ImageView f6987f;

    /* JADX INFO: renamed from: g */
    public View f6988g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem$a */
    public static class C0392a implements txo {

        /* JADX INFO: renamed from: a */
        public String f6989a;

        /* JADX INFO: renamed from: b */
        public String f6990b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f6991c;

        public C0392a(String str, String str2, PurchaseType purchaseType) {
            this.f6989a = str;
            this.f6990b = str2;
            this.f6991c = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 6;
        }
    }

    public IntlPrivilegeSubscriptionItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9963a(View view) {
        w1p.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9964b(C0392a c0392a, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6985d.setVisibility(8);
        this.f6986e.setVisibility(8);
        this.f6987f.setVisibility(8);
        this.f6984c.setVisibility(8);
        this.f6988g.setVisibility(8);
        this.f6982a.setOnClickListener((View.OnClickListener) null);
        this.f6982a.setClickable(false);
        setMinimumHeight(t100.d(1.0f));
        xdl0.U(this, t100.d(80.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9963a(this);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
