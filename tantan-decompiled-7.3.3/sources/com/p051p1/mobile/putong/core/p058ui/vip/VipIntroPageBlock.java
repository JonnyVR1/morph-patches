package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.a690;
import p153l.sql0;
import p153l.uqb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class VipIntroPageBlock extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37891a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37892b;

    /* JADX INFO: renamed from: c */
    public VText f37893c;

    /* JADX INFO: renamed from: d */
    public VText f37894d;

    /* JADX INFO: renamed from: e */
    public boolean f37895e;

    /* JADX INFO: renamed from: f */
    public boolean f37896f;

    /* JADX INFO: renamed from: g */
    public float f37897g;

    public VipIntroPageBlock(Context context) {
        super(context);
        this.f37895e = vnb.m201957q1();
        this.f37896f = vnb.m201956p1();
        this.f37897g = this.f37895e ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m57447a(View view) {
        sql0.m187553a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m57448b() {
        this.f37893c.setTextSize(this.f37895e ? 18.0f : 19.0f);
        this.f37894d.setTextSize(this.f37895e ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37893c.getLayoutParams();
        marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin * this.f37897g);
        this.f37893c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f37894d.getLayoutParams();
        marginLayoutParams2.topMargin = (int) (marginLayoutParams2.topMargin * this.f37897g);
        this.f37894d.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: c */
    public void m57449c(Act act, a690 a690Var, PurchaseType purchaseType) {
        if (this.f37895e || this.f37896f) {
            m57448b();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            this.f37893c.setTextColor(-1521014);
            this.f37894d.setTextColor(1726532234);
        }
        this.f37893c.setText(R$string.f28110P6);
        this.f37894d.setText(R$string.f28099O6);
        if (NullChecker.m82486a(a690Var.m96305k())) {
            uqb0.f180374G.m127140Z0(this.f37892b, a690Var.m96305k());
        } else {
            uqb0.f180374G.m127138Y0(this.f37892b, a690Var.m96304j());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57447a(this);
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37895e = vnb.m201957q1();
        this.f37896f = vnb.m201956p1();
        this.f37897g = this.f37895e ? 0.7f : 0.9f;
    }

    public VipIntroPageBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37895e = vnb.m201957q1();
        this.f37896f = vnb.m201956p1();
        this.f37897g = this.f37895e ? 0.7f : 0.9f;
    }
}
