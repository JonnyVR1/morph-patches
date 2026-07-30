package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.hyo;
import l.sab0;
import l.t100;
import l.xdl0;
import p006l.sxo;
import p006l.w0c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f7715c;

    /* JADX INFO: renamed from: d */
    public TextView f7716d;

    /* JADX INFO: renamed from: e */
    public TextView f7717e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem$a */
    public static class C0459a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f7718a;

        /* JADX INFO: renamed from: b */
        public CharSequence f7719b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f7720c;

        public C0459a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f7718a = str;
            this.f7719b = charSequence;
            this.f7720c = purchaseType;
        }

        @Override // p006l.sxo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m11159P(View view) {
        hyo.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m11160Q(C0459a c0459a, PutongFrag putongFrag) {
        if (c0459a != null) {
            PurchaseType purchaseType = c0459a.f7720c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                xdl0.M(this.f7715c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c0459a.f7718a);
                TextView textView = this.f7716d;
                if (zIsEmpty) {
                    xdl0.M(textView, false);
                    xdl0.X(this.f7717e, t100.d(22.0f));
                } else {
                    xdl0.M(textView, true);
                    xdl0.X(this.f7716d, t100.d(35.0f));
                }
                this.f7716d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24683e0));
                this.f7717e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24683e0));
            } else if (sab0.v(purchaseType)) {
                xdl0.M(this.f7715c, false);
                xdl0.M(this.f7716d, false);
                xdl0.X(this.f7717e, t100.d(22.0f));
                this.f7717e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24689g0));
            } else {
                this.f7716d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
                this.f7717e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
            }
            this.f7716d.setText(c0459a.f7718a);
            this.f7717e.setText(c0459a.f7719b);
            this.f7717e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f7717e.setLineSpacing(0.0f, 1.2f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m11159P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
