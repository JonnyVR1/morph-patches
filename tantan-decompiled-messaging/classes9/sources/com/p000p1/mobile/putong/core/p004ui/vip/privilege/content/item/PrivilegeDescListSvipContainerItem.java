package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.bx80;
import l.eqh0;
import l.o7r;
import l.sab0;
import l.t100;
import l.xdl0;
import p006l.f6c0;
import p006l.ff20;
import p006l.g6a;
import p006l.u640;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xe20;
import p006l.y640;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListSvipContainerItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7481a;

    /* JADX INFO: renamed from: b */
    public VIcon f7482b;

    /* JADX INFO: renamed from: c */
    public VText f7483c;

    /* JADX INFO: renamed from: d */
    public VText f7484d;

    /* JADX INFO: renamed from: e */
    public VIcon f7485e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7486f;

    /* JADX INFO: renamed from: g */
    public View f7487g;

    public PrivilegeDescListSvipContainerItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10742a(C0439a c0439a, View view) {
        if (c0439a.m10801c() != null) {
            c0439a.m10801c().mo10805a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10743b(View view) {
        bx80.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m10744c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m10745d(PurchaseType purchaseType) {
        this.f7486f.removeAllViews();
        View viewInflate = o7r.a(getContext()).inflate(f6c0.f12156d8, (ViewGroup) null);
        xe20 xe20Var = new xe20(m10744c());
        ff20 ff20Var = new ff20(getContext());
        xe20Var.C(ff20Var);
        ff20Var.m15334i1(xe20Var);
        ff20Var.m15341s(viewInflate);
        ff20Var.m15330F("p_privileges_view");
        xe20Var.m27221s0();
        xe20Var.m27216D0(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, t100.d(4.0f), 0, t100.d(10.0f));
        this.f7486f.addView(viewInflate, layoutParams);
        xdl0.M(this.f7487g, false);
        ff20Var.m15331G(m10744c().getResources().getColor(w0c0.f24699j1));
        ff20Var.m15332H(eqh0.c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            ff20Var.m15338n(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (sab0.o(purchaseType)) {
            ff20Var.m15338n(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            ff20Var.m15328A(null);
            ff20Var.m15331G(getResources().getColor(w0c0.f24681d1));
            ff20Var.m15338n(getResources().getColor(w0c0.f24677c1), getResources().getColor(w0c0.f24669a1));
            ff20Var.m15337m(getResources().getColor(w0c0.f24690g1));
            this.f7487g.setBackgroundResource(w0c0.f24687f1);
            return;
        }
        if (!sab0.u(purchaseType)) {
            ff20Var.m15338n(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        ff20Var.m15338n(getResources().getColor(w0c0.f24611H0), getResources().getColor(w0c0.f24668a0));
        ff20Var.m15328A(null);
        ff20Var.m15331G(getResources().getColor(w0c0.f24695i0));
        ff20Var.m15337m(getResources().getColor(w0c0.f24637Q));
        this.f7487g.setBackgroundResource(w0c0.f24646T);
    }

    /* JADX INFO: renamed from: e */
    public void m10746e(PurchaseType purchaseType) {
        this.f7486f.removeAllViews();
        View viewInflate = o7r.a(getContext()).inflate(f6c0.f12173e8, (ViewGroup) null);
        u640 u640Var = new u640(m10744c());
        y640 y640Var = new y640(getContext());
        u640Var.C(y640Var);
        y640Var.m28103i1(u640Var);
        y640Var.m28098F(purchaseType);
        y640Var.mo16747v(viewInflate);
        y640Var.m28097E("p_privileges_view");
        u640Var.m25068y0();
        u640Var.m25062a1(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, t100.d(10.0f), 0, t100.d(10.0f));
        this.f7486f.addView(viewInflate, layoutParams);
        y640Var.m28099G(m10744c().getResources().getColor(w0c0.f24699j1));
        y640Var.m28094B(eqh0.c(3));
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            y640Var.m28104j(Color.parseColor("#F27310"), Color.parseColor("#FFEFE5"));
            return;
        }
        if (sab0.o(purchaseType)) {
            y640Var.m28104j(Color.parseColor("#4F5F77"), Color.parseColor("#E3E5E9"));
            return;
        }
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            y640Var.m28115y(null);
            y640Var.m28099G(getResources().getColor(w0c0.f24681d1));
            y640Var.m28104j(getResources().getColor(w0c0.f24677c1), getResources().getColor(w0c0.f24669a1));
            y640Var.m28102i(getResources().getColor(w0c0.f24690g1));
            this.f7487g.setBackgroundResource(w0c0.f24687f1);
            return;
        }
        if (!sab0.u(purchaseType)) {
            y640Var.m28104j(Color.parseColor("#A06A20"), Color.parseColor("#F0E2CF"));
            return;
        }
        y640Var.m28104j(getResources().getColor(w0c0.f24611H0), getResources().getColor(w0c0.f24668a0));
        y640Var.m28115y(null);
        y640Var.m28099G(getResources().getColor(w0c0.f24695i0));
        y640Var.m28102i(getResources().getColor(w0c0.f24637Q));
        this.f7487g.setBackgroundResource(w0c0.f24646T);
    }

    /* JADX INFO: renamed from: f */
    public void m10747f(final C0439a c0439a, PurchaseType purchaseType) {
        this.f7482b.setImageResource(c0439a.m10800b());
        this.f7483c.setText(c0439a.m10802d());
        this.f7484d.setText(c0439a.m10799a());
        this.f7481a.setOnClickListener(new View.OnClickListener() { // from class: l.ax80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSvipContainerItem.m10742a(c0439a, view);
            }
        });
        String strM10803e = c0439a.m10803e();
        strM10803e.getClass();
        if (strM10803e.equals("advancing")) {
            m10745d(purchaseType);
        } else if (strM10803e.equals("privacy")) {
            m10746e(purchaseType);
        }
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            this.f7483c.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7484d.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7485e.setImageResource(x2c0.f26774ii);
        } else if (sab0.u(purchaseType)) {
            this.f7483c.setTextColor(getResources().getColor(w0c0.f24719q0));
            this.f7484d.setTextColor(getResources().getColor(w0c0.f24668a0));
            this.f7485e.setImageResource(x2c0.f26523al);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10743b(this);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSvipContainerItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
