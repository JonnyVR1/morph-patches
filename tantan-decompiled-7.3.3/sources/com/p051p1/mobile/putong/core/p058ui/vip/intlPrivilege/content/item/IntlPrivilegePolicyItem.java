package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

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
import p153l.g0p;
import p153l.qa00;
import p153l.tzo;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f38039c;

    /* JADX INFO: renamed from: d */
    public TextView f38040d;

    /* JADX INFO: renamed from: e */
    public TextView f38041e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem$a */
    public static class C9118a implements tzo {

        /* JADX INFO: renamed from: a */
        public String f38042a;

        /* JADX INFO: renamed from: b */
        public CharSequence f38043b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f38044c;

        public C9118a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f38042a = str;
            this.f38043b = charSequence;
            this.f38044c = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m57700P(View view) {
        g0p.m128445a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m57701Q(C9118a c9118a, PutongFrag putongFrag) {
        if (c9118a != null) {
            PurchaseType purchaseType = c9118a.f38044c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                bnl0.m105524M(this.f38039c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c9118a.f38042a);
                TextView textView = this.f38040d;
                if (zIsEmpty) {
                    bnl0.m105524M(textView, false);
                    bnl0.m105540X(this.f38041e, qa00.m175859d(22.0f));
                } else {
                    bnl0.m105524M(textView, true);
                    bnl0.m105540X(this.f38040d, qa00.m175859d(35.0f));
                }
                this.f38040d.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
                this.f38041e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
            } else if (wib0.m206578v(purchaseType)) {
                bnl0.m105524M(this.f38039c, false);
                bnl0.m105524M(this.f38040d, false);
                bnl0.m105540X(this.f38041e, qa00.m175859d(22.0f));
                this.f38041e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80422h0));
            } else {
                this.f38040d.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
                this.f38041e.setTextColor(putongFrag.act().getResources().getColor(c9c0.f80413e0));
            }
            this.f38040d.setText(c9118a.f38042a);
            this.f38041e.setText(c9118a.f38043b);
            this.f38041e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f38041e.setLineSpacing(0.0f, 1.2f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57700P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
