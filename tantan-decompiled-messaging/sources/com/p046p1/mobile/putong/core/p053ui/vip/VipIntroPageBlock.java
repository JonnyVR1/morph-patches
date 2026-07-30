package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hmb;
import p149l.ohl0;
import p149l.qib0;
import p149l.wx80;

/* JADX INFO: loaded from: classes9.dex */
public class VipIntroPageBlock extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37043a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37044b;

    /* JADX INFO: renamed from: c */
    public VText f37045c;

    /* JADX INFO: renamed from: d */
    public VText f37046d;

    /* JADX INFO: renamed from: e */
    public boolean f37047e;

    /* JADX INFO: renamed from: f */
    public boolean f37048f;

    /* JADX INFO: renamed from: g */
    public float f37049g;

    public VipIntroPageBlock(Context context) {
        super(context);
        this.f37047e = hmb.m131712q1();
        this.f37048f = hmb.m131711p1();
        this.f37049g = this.f37047e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m56264a(View view) {
        ohl0.m164398a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m56265b() {
        this.f37045c.setTextSize(this.f37047e ? 18.0f : 19.0f);
        this.f37046d.setTextSize(this.f37047e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37045c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f37049g);
        this.f37045c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f37046d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f37049g);
        this.f37046d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m56266c(Act act, wx80 wx80Var, PurchaseType purchaseType) {
        if (this.f37047e || this.f37048f) {
            m56265b();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f37045c.setTextColor(-1521014);
            this.f37046d.setTextColor(1726532234);
        }
        this.f37045c.setText(R$string.f27262P6);
        this.f37046d.setText(R$string.f27251O6);
        if (NullChecker.m81303a(wx80Var.m205959k())) {
            qib0.f154691G.m102356Z0(this.f37044b, wx80Var.m205959k());
        } else {
            qib0.f154691G.m102354Y0(this.f37044b, wx80Var.m205958j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56264a(this);
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37047e = hmb.m131712q1();
        this.f37048f = hmb.m131711p1();
        this.f37049g = this.f37047e ? 0.7f : 0.9f;
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37047e = hmb.m131712q1();
        this.f37048f = hmb.m131711p1();
        this.f37049g = this.f37047e ? 0.7f : 0.9f;
    }
}
