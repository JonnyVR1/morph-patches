package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import p147v.VRelative;
import p147v.VText;
import p149l.t100;
import p149l.txo;
import p149l.w1p;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeSubscriptionItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f37201a;

    /* JADX INFO: renamed from: b */
    public View f37202b;

    /* JADX INFO: renamed from: c */
    public View f37203c;

    /* JADX INFO: renamed from: d */
    public VText f37204d;

    /* JADX INFO: renamed from: e */
    public VText f37205e;

    /* JADX INFO: renamed from: f */
    public ImageView f37206f;

    /* JADX INFO: renamed from: g */
    public View f37207g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem$a */
    public static class C8956a implements txo {

        /* JADX INFO: renamed from: a */
        public String f37208a;

        /* JADX INFO: renamed from: b */
        public String f37209b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f37210c;

        public C8956a(String str, String str2, PurchaseType purchaseType) {
            this.f37208a = str;
            this.f37209b = str2;
            this.f37210c = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 6;
        }
    }

    public IntlPrivilegeSubscriptionItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56522a(View view) {
        w1p.m200948a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56523b(C8956a c8956a, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37204d.setVisibility(8);
        this.f37205e.setVisibility(8);
        this.f37206f.setVisibility(8);
        this.f37203c.setVisibility(8);
        this.f37207g.setVisibility(8);
        this.f37201a.setOnClickListener(null);
        this.f37201a.setClickable(false);
        setMinimumHeight(t100.m186890d(1.0f));
        xdl0.m208357U(this, t100.m186890d(80.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56522a(this);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
