package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.f590;
import p153l.hn20;
import p153l.if40;
import p153l.kec0;
import p153l.lyh0;
import p153l.mf40;
import p153l.p9r;
import p153l.pn20;
import p153l.qa00;
import p153l.s7a;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListSvipContainerItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38548a;

    /* JADX INFO: renamed from: b */
    public VIcon f38549b;

    /* JADX INFO: renamed from: c */
    public VText f38550c;

    /* JADX INFO: renamed from: d */
    public VText f38551d;

    /* JADX INFO: renamed from: e */
    public VIcon f38552e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f38553f;

    /* JADX INFO: renamed from: g */
    public View f38554g;

    public PrivilegeDescListSvipContainerItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58445a(C9166a c9166a, View view) {
        if (c9166a.m58501c() != null) {
            c9166a.m58501c().mo58505a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m58446b(View view) {
        f590.m124117a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m58447c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m58448d(PurchaseType purchaseType) {
        this.f38553f.removeAllViews();
        View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f125914k8, (ViewGroup) null);
        hn20 hn20Var = new hn20(m58447c());
        pn20 pn20Var = new pn20((Act) getContext());
        hn20Var.mo52715C(pn20Var);
        pn20Var.mo22064i1(hn20Var);
        pn20Var.m173023s(viewInflate);
        pn20Var.m173013F(OMSDialogPositon.p_privileges_view);
        hn20Var.m136037s0();
        hn20Var.m136032D0(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, qa00.m175859d(4.0f), 0, qa00.m175859d(10.0f));
        this.f38553f.addView(viewInflate, layoutParams);
        bnl0.m105524M(this.f38554g, false);
        pn20Var.m173014G(m58447c().getResources().getColor(c9c0.f80432k1));
        pn20Var.m173015H(lyh0.m156283c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            pn20Var.m173020n(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (wib0.m206571o(purchaseType)) {
            pn20Var.m173020n(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            pn20Var.m173012A(null);
            pn20Var.m173014G(getResources().getColor(c9c0.f80414e1));
            pn20Var.m173020n(getResources().getColor(c9c0.f80410d1), getResources().getColor(c9c0.f80402b1));
            pn20Var.m173019m(getResources().getColor(c9c0.f80423h1));
            this.f38554g.setBackgroundResource(c9c0.f80420g1);
            return;
        }
        if (!wib0.m206577u(purchaseType)) {
            pn20Var.m173020n(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        pn20Var.m173020n(getResources().getColor(c9c0.f80343I0), getResources().getColor(c9c0.f80401b0));
        pn20Var.m173012A(null);
        pn20Var.m173014G(getResources().getColor(c9c0.f80428j0));
        pn20Var.m173019m(getResources().getColor(c9c0.f80369R));
        this.f38554g.setBackgroundResource(c9c0.f80378U);
    }

    /* JADX INFO: renamed from: e */
    public void m58449e(PurchaseType purchaseType) {
        this.f38553f.removeAllViews();
        View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f125931l8, (ViewGroup) null);
        if40 if40Var = new if40(m58447c());
        mf40 mf40Var = new mf40((Act) getContext());
        if40Var.mo52715C(mf40Var);
        mf40Var.mo22064i1(if40Var);
        mf40Var.m158114F(purchaseType);
        mf40Var.mo158129v(viewInflate);
        mf40Var.m158113E(OMSDialogPositon.p_privileges_view);
        if40Var.m139720y0();
        if40Var.m139714a1(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, qa00.m175859d(10.0f), 0, qa00.m175859d(10.0f));
        this.f38553f.addView(viewInflate, layoutParams);
        mf40Var.m158115G(m58447c().getResources().getColor(c9c0.f80432k1));
        mf40Var.m158111B(lyh0.m156283c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            mf40Var.m158119j(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (wib0.m206571o(purchaseType)) {
            mf40Var.m158119j(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            mf40Var.m158132y(null);
            mf40Var.m158115G(getResources().getColor(c9c0.f80414e1));
            mf40Var.m158119j(getResources().getColor(c9c0.f80410d1), getResources().getColor(c9c0.f80402b1));
            mf40Var.m158118i(getResources().getColor(c9c0.f80423h1));
            this.f38554g.setBackgroundResource(c9c0.f80420g1);
            return;
        }
        if (!wib0.m206577u(purchaseType)) {
            mf40Var.m158119j(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        mf40Var.m158119j(getResources().getColor(c9c0.f80343I0), getResources().getColor(c9c0.f80401b0));
        mf40Var.m158132y(null);
        mf40Var.m158115G(getResources().getColor(c9c0.f80428j0));
        mf40Var.m158118i(getResources().getColor(c9c0.f80369R));
        this.f38554g.setBackgroundResource(c9c0.f80378U);
    }

    /* JADX INFO: renamed from: f */
    public void m58450f(final C9166a c9166a, PurchaseType purchaseType) {
        this.f38549b.setImageResource(c9166a.m58500b());
        this.f38550c.setText(c9166a.m58502d());
        this.f38551d.setText(c9166a.m58499a());
        this.f38548a.setOnClickListener(new View.OnClickListener() { // from class: l.e590
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSvipContainerItem.m58445a(c9166a, view);
            }
        });
        String strM58503e = c9166a.m58503e();
        strM58503e.getClass();
        if (strM58503e.equals("advancing")) {
            m58448d(purchaseType);
        } else if (strM58503e.equals("privacy")) {
            m58449e(purchaseType);
        }
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            this.f38550c.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38551d.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38552e.setImageResource(dbc0.f86699Wi);
        } else if (wib0.m206577u(purchaseType)) {
            this.f38550c.setTextColor(getResources().getColor(c9c0.f80452r0));
            this.f38551d.setTextColor(getResources().getColor(c9c0.f80401b0));
            this.f38552e.setImageResource(dbc0.f86446Ol);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58446b(this);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
