package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p151v.VLinear;
import p153l.bnl0;
import p153l.c9c0;
import p153l.h0p;
import p153l.qa00;
import p153l.szo;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f38782c;

    /* JADX INFO: renamed from: d */
    public TextView f38783d;

    /* JADX INFO: renamed from: e */
    public TextView f38784e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem$a */
    public static class C9186a implements szo {

        /* JADX INFO: renamed from: a */
        public String f38785a;

        /* JADX INFO: renamed from: b */
        public CharSequence f38786b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f38787c;

        public C9186a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f38785a = str;
            this.f38786b = charSequence;
            this.f38787c = purchaseType;
        }

        @Override // p153l.szo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m58850P(View view) {
        h0p.m133186a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m58851Q(C9186a c9186a, PutongFrag putongFrag) {
        if (c9186a != null) {
            PurchaseType purchaseType = c9186a.f38787c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                bnl0.m105524M(this.f38782c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c9186a.f38785a);
                TextView textView = this.f38783d;
                if (zIsEmpty) {
                    bnl0.m105524M(textView, false);
                    bnl0.m105540X(this.f38784e, qa00.m175859d(22.0f));
                } else {
                    bnl0.m105524M(textView, true);
                    bnl0.m105540X(this.f38783d, qa00.m175859d(35.0f));
                }
                this.f38783d.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80416f0));
                this.f38784e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80416f0));
            } else if (wib0.m206578v(purchaseType)) {
                bnl0.m105524M(this.f38782c, false);
                bnl0.m105524M(this.f38783d, false);
                bnl0.m105540X(this.f38784e, qa00.m175859d(22.0f));
                this.f38784e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80422h0));
            } else {
                this.f38783d.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
                this.f38784e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
            }
            this.f38783d.setText(c9186a.f38785a);
            this.f38784e.setText(c9186a.f38786b);
            this.f38784e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f38784e.setLineSpacing(0.0f, 1.2f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58850P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
