package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p147v.VLinear;
import p149l.hyo;
import p149l.sab0;
import p149l.sxo;
import p149l.t100;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegePolicyItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f37934c;

    /* JADX INFO: renamed from: d */
    public TextView f37935d;

    /* JADX INFO: renamed from: e */
    public TextView f37936e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem$a */
    public static class C9023a implements sxo {

        /* JADX INFO: renamed from: a */
        public String f37937a;

        /* JADX INFO: renamed from: b */
        public CharSequence f37938b;

        /* JADX INFO: renamed from: c */
        public PurchaseType f37939c;

        public C9023a(String str, CharSequence charSequence, PurchaseType purchaseType) {
            this.f37937a = str;
            this.f37938b = charSequence;
            this.f37939c = purchaseType;
        }

        @Override // p149l.sxo
        public int getItemType() {
            return 5;
        }
    }

    public IntlPrivilegePolicyItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m57667P(View view) {
        hyo.m133617a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m57668Q(C9023a c9023a, PutongFrag putongFrag) {
        if (c9023a != null) {
            PurchaseType purchaseType = c9023a.f37939c;
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                xdl0.m208344M(this.f37934c, false);
                boolean zIsEmpty = TextUtils.isEmpty(c9023a.f37937a);
                TextView textView = this.f37935d;
                if (zIsEmpty) {
                    xdl0.m208344M(textView, false);
                    xdl0.m208360X(this.f37936e, t100.m186890d(22.0f));
                } else {
                    xdl0.m208344M(textView, true);
                    xdl0.m208360X(this.f37935d, t100.m186890d(35.0f));
                }
                this.f37935d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183843e0));
                this.f37936e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183843e0));
            } else if (sab0.m182904v(purchaseType)) {
                xdl0.m208344M(this.f37934c, false);
                xdl0.m208344M(this.f37935d, false);
                xdl0.m208360X(this.f37936e, t100.m186890d(22.0f));
                this.f37936e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183849g0));
            } else {
                this.f37935d.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
                this.f37936e.setTextColor(putongFrag.act().getResources().getColor(w0c0.f183840d0));
            }
            this.f37935d.setText(c9023a.f37937a);
            this.f37936e.setText(c9023a.f37938b);
            this.f37936e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f37936e.setLineSpacing(0.0f, 1.2f);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57667P(this);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegePolicyItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
