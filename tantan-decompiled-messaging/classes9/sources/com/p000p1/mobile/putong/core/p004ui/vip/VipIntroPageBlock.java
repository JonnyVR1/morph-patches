package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import l.hmb;
import l.ohl0;
import p006l.qib0;
import p006l.wx80;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipIntroPageBlock extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6824a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6825b;

    /* JADX INFO: renamed from: c */
    public VText f6826c;

    /* JADX INFO: renamed from: d */
    public VText f6827d;

    /* JADX INFO: renamed from: e */
    public boolean f6828e;

    /* JADX INFO: renamed from: f */
    public boolean f6829f;

    /* JADX INFO: renamed from: g */
    public float f6830g;

    public VipIntroPageBlock(Context context) {
        super(context);
        this.f6828e = hmb.q1();
        this.f6829f = hmb.p1();
        this.f6830g = this.f6828e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9698a(View view) {
        ohl0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m9699b() {
        this.f6826c.setTextSize(this.f6828e ? 18.0f : 19.0f);
        this.f6827d.setTextSize(this.f6828e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6826c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f6830g);
        this.f6826c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6827d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f6830g);
        this.f6827d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m9700c(Act act, wx80 wx80Var, PurchaseType purchaseType) {
        if (this.f6828e || this.f6829f) {
            m9699b();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f6826c.setTextColor(-1521014);
            this.f6827d.setTextColor(1726532234);
        }
        this.f6826c.setText(R.string.P6);
        this.f6827d.setText(R.string.O6);
        if (NullChecker.a(wx80Var.m26840k())) {
            qib0.f19782G.m12769Z0(this.f6825b, wx80Var.m26840k());
        } else {
            qib0.f19782G.m12767Y0(this.f6825b, wx80Var.m26839j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9698a(this);
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6828e = hmb.q1();
        this.f6829f = hmb.p1();
        this.f6830g = this.f6828e ? 0.7f : 0.9f;
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6828e = hmb.q1();
        this.f6829f = hmb.p1();
        this.f6830g = this.f6828e ? 0.7f : 0.9f;
    }
}
