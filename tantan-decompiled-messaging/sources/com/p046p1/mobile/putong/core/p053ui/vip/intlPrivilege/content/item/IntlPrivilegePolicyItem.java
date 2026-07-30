package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p147v.VLinear;
import p149l.gyo;
import p149l.sab0;
import p149l.t100;
import p149l.txo;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f37191c;

    /* JADX INFO: renamed from: d */
    public TextView f37192d;

    /* JADX INFO: renamed from: e */
    public TextView f37193e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem$a */
    public static class C8955a implements txo {

        /* JADX INFO: renamed from: a */
        public String f37194a;

        /* JADX INFO: renamed from: b */
        public CharSequence f37195b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f37196c;

        public C8955a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f37194a = str;
            this.f37195b = charSequence;
            this.f37196c = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m56517P(View view) {
        gyo.m128717a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m56518Q(C8955a c8955a, PutongFrag putongFrag) {
        if (c8955a != null) {
            PurchaseType purchaseType = c8955a.f37196c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                xdl0.m208344M(this.f37191c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c8955a.f37194a);
                TextView textView = this.f37192d;
                if (zIsEmpty) {
                    xdl0.m208344M(textView, false);
                    xdl0.m208360X(this.f37193e, t100.m186890d(22.0f));
                } else {
                    xdl0.m208344M(textView, true);
                    xdl0.m208360X(this.f37192d, t100.m186890d(35.0f));
                }
                this.f37192d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
                this.f37193e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
            } else if (sab0.m182904v(purchaseType)) {
                xdl0.m208344M(this.f37191c, false);
                xdl0.m208344M(this.f37192d, false);
                xdl0.m208360X(this.f37193e, t100.m186890d(22.0f));
                this.f37193e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183849g0));
            } else {
                this.f37192d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
                this.f37193e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
            }
            this.f37192d.setText(c8955a.f37194a);
            this.f37193e.setText(c8955a.f37195b);
            this.f37193e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f37193e.setLineSpacing(0.0f, 1.2f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56517P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
