package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VIcon;
import p147v.VText;
import p149l.bx80;
import p149l.eqh0;
import p149l.f6c0;
import p149l.ff20;
import p149l.g6a;
import p149l.o7r;
import p149l.sab0;
import p149l.t100;
import p149l.u640;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xe20;
import p149l.y640;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListSvipContainerItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37700a;

    /* JADX INFO: renamed from: b */
    public VIcon f37701b;

    /* JADX INFO: renamed from: c */
    public VText f37702c;

    /* JADX INFO: renamed from: d */
    public VText f37703d;

    /* JADX INFO: renamed from: e */
    public VIcon f37704e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f37705f;

    /* JADX INFO: renamed from: g */
    public View f37706g;

    public PrivilegeDescListSvipContainerItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57262a(C9003a c9003a, View view) {
        if (c9003a.m57318c() != null) {
            c9003a.m57318c().mo57322a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m57263b(View view) {
        bx80.m104309a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m57264c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m57265d(PurchaseType purchaseType) {
        this.f37705f.removeAllViews();
        View viewInflate = o7r.m163037a(getContext()).inflate(f6c0.f95742d8, (ViewGroup) null);
        xe20 xe20Var = new xe20(m57264c());
        ff20 ff20Var = new ff20((Act) getContext());
        xe20Var.mo51532C(ff20Var);
        ff20Var.mo21065i1(xe20Var);
        ff20Var.m121093s(viewInflate);
        ff20Var.m121083F(OMSDialogPositon.p_privileges_view);
        xe20Var.m208500s0();
        xe20Var.m208495D0(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, t100.m186890d(4.0f), 0, t100.m186890d(10.0f));
        this.f37705f.addView(viewInflate, layoutParams);
        xdl0.m208344M(this.f37706g, false);
        ff20Var.m121084G(m57264c().getResources().getColor(w0c0.f183859j1));
        ff20Var.m121085H(eqh0.m117752c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            ff20Var.m121090n(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (sab0.m182897o(purchaseType)) {
            ff20Var.m121090n(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            ff20Var.m121082A(null);
            ff20Var.m121084G(getResources().getColor(w0c0.f183841d1));
            ff20Var.m121090n(getResources().getColor(w0c0.f183837c1), getResources().getColor(w0c0.f183829a1));
            ff20Var.m121089m(getResources().getColor(w0c0.f183850g1));
            this.f37706g.setBackgroundResource(w0c0.f183847f1);
            return;
        }
        if (!sab0.m182903u(purchaseType)) {
            ff20Var.m121090n(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        ff20Var.m121090n(getResources().getColor(w0c0.f183771H0), getResources().getColor(w0c0.f183828a0));
        ff20Var.m121082A(null);
        ff20Var.m121084G(getResources().getColor(w0c0.f183855i0));
        ff20Var.m121089m(getResources().getColor(w0c0.f183797Q));
        this.f37706g.setBackgroundResource(w0c0.f183806T);
    }

    /* JADX INFO: renamed from: e */
    public void m57266e(PurchaseType purchaseType) {
        this.f37705f.removeAllViews();
        View viewInflate = o7r.m163037a(getContext()).inflate(f6c0.f95759e8, (ViewGroup) null);
        u640 u640Var = new u640(m57264c());
        y640 y640Var = new y640((Act) getContext());
        u640Var.mo51532C(y640Var);
        y640Var.mo21065i1(u640Var);
        y640Var.m213076F(purchaseType);
        y640Var.mo137127v(viewInflate);
        y640Var.m213075E(OMSDialogPositon.p_privileges_view);
        u640Var.m191952y0();
        u640Var.m191946a1(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, t100.m186890d(10.0f), 0, t100.m186890d(10.0f));
        this.f37705f.addView(viewInflate, layoutParams);
        y640Var.m213077G(m57264c().getResources().getColor(w0c0.f183859j1));
        y640Var.m213073B(eqh0.m117752c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            y640Var.m213081j(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (sab0.m182897o(purchaseType)) {
            y640Var.m213081j(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            y640Var.m213092y(null);
            y640Var.m213077G(getResources().getColor(w0c0.f183841d1));
            y640Var.m213081j(getResources().getColor(w0c0.f183837c1), getResources().getColor(w0c0.f183829a1));
            y640Var.m213080i(getResources().getColor(w0c0.f183850g1));
            this.f37706g.setBackgroundResource(w0c0.f183847f1);
            return;
        }
        if (!sab0.m182903u(purchaseType)) {
            y640Var.m213081j(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        y640Var.m213081j(getResources().getColor(w0c0.f183771H0), getResources().getColor(w0c0.f183828a0));
        y640Var.m213092y(null);
        y640Var.m213077G(getResources().getColor(w0c0.f183855i0));
        y640Var.m213080i(getResources().getColor(w0c0.f183797Q));
        this.f37706g.setBackgroundResource(w0c0.f183806T);
    }

    /* JADX INFO: renamed from: f */
    public void m57267f(final C9003a c9003a, PurchaseType purchaseType) {
        this.f37701b.setImageResource(c9003a.m57317b());
        this.f37702c.setText(c9003a.m57319d());
        this.f37703d.setText(c9003a.m57316a());
        this.f37700a.setOnClickListener(new View.OnClickListener() { // from class: l.ax80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSvipContainerItem.m57262a(c9003a, view);
            }
        });
        String strM57320e = c9003a.m57320e();
        strM57320e.getClass();
        if (strM57320e.equals("advancing")) {
            m57265d(purchaseType);
        } else if (strM57320e.equals("privacy")) {
            m57266e(purchaseType);
        }
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            this.f37702c.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37703d.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37704e.setImageResource(x2c0.f190238ii);
        } else if (sab0.m182903u(purchaseType)) {
            this.f37702c.setTextColor(getResources().getColor(w0c0.f183879q0));
            this.f37703d.setTextColor(getResources().getColor(w0c0.f183828a0));
            this.f37704e.setImageResource(x2c0.f189987al);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57263b(this);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
