package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.qa00;
import p153l.tzo;
import p153l.w3p;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeSubscriptionItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f38049a;

    /* JADX INFO: renamed from: b */
    public View f38050b;

    /* JADX INFO: renamed from: c */
    public View f38051c;

    /* JADX INFO: renamed from: d */
    public VText f38052d;

    /* JADX INFO: renamed from: e */
    public VText f38053e;

    /* JADX INFO: renamed from: f */
    public ImageView f38054f;

    /* JADX INFO: renamed from: g */
    public View f38055g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem$a */
    public static class C9119a implements tzo {

        /* JADX INFO: renamed from: a */
        public String f38056a;

        /* JADX INFO: renamed from: b */
        public String f38057b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f38058c;

        public C9119a(String str, String str2, PurchaseType purchaseType) {
            this.f38056a = str;
            this.f38057b = str2;
            this.f38058c = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 6;
        }
    }

    public IntlPrivilegeSubscriptionItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57705a(View view) {
        w3p.m204788a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57706b(C9119a c9119a, IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f38052d.setVisibility(8);
        this.f38053e.setVisibility(8);
        this.f38054f.setVisibility(8);
        this.f38051c.setVisibility(8);
        this.f38055g.setVisibility(8);
        this.f38049a.setOnClickListener(null);
        this.f38049a.setClickable(false);
        setMinimumHeight(qa00.m175859d(1.0f));
        bnl0.m105537U(this, qa00.m175859d(80.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57705a(this);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeSubscriptionItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
