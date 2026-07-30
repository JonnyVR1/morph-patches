package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.gyo;
import l.sab0;
import l.t100;
import l.xdl0;
import p006l.txo;
import p006l.w0c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f6972c;

    /* JADX INFO: renamed from: d */
    public TextView f6973d;

    /* JADX INFO: renamed from: e */
    public TextView f6974e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem$a */
    public static class C0391a implements txo {

        /* JADX INFO: renamed from: a */
        public String f6975a;

        /* JADX INFO: renamed from: b */
        public CharSequence f6976b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f6977c;

        public C0391a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f6975a = str;
            this.f6976b = charSequence;
            this.f6977c = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m9958P(View view) {
        gyo.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m9959Q(C0391a c0391a, PutongFrag putongFrag) {
        if (c0391a != null) {
            PurchaseType purchaseType = c0391a.f6977c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                xdl0.M(this.f6972c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c0391a.f6975a);
                TextView textView = this.f6973d;
                if (zIsEmpty) {
                    xdl0.M(textView, false);
                    xdl0.X(this.f6974e, t100.d(22.0f));
                } else {
                    xdl0.M(textView, true);
                    xdl0.X(this.f6973d, t100.d(35.0f));
                }
                this.f6973d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
                this.f6974e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
            } else if (sab0.v(purchaseType)) {
                xdl0.M(this.f6972c, false);
                xdl0.M(this.f6973d, false);
                xdl0.X(this.f6974e, t100.d(22.0f));
                this.f6974e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24689g0));
            } else {
                this.f6973d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
                this.f6974e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f24680d0));
            }
            this.f6973d.setText(c0391a.f6975a);
            this.f6974e.setText(c0391a.f6976b);
            this.f6974e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f6974e.setLineSpacing(0.0f, 1.2f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9958P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
