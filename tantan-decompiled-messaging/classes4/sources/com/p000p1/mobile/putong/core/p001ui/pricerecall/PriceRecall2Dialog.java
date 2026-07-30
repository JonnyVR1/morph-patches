package com.p000p1.mobile.putong.core.p001ui.pricerecall;

import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.pricerecall.PriceRecall2Dialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.pay.R;
import java.util.List;
import l.b1c0;
import l.cwf0;
import l.d30;
import l.eqh0;
import l.i0e;
import l.j760;
import l.m6c0;
import l.mqi0;
import l.nl80;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import p002l.zl80;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PriceRecall2Dialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public PriceRecall2Dialog f697a;

    /* JADX INFO: renamed from: b */
    public VImage f698b;

    /* JADX INFO: renamed from: c */
    public VText f699c;

    /* JADX INFO: renamed from: d */
    public VText f700d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f701e;

    /* JADX INFO: renamed from: f */
    public VText f702f;

    /* JADX INFO: renamed from: g */
    public VText f703g;

    public PriceRecall2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m906b(d30 d30Var, Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m910f(Dialog dialog) {
        dialog.dismiss();
        zvf0.r("e_discount_retain", "p_discount_retain");
    }

    /* JADX INFO: renamed from: j */
    public static Dialog m912j(Act act, List<Merchandise> list, @NonNull final d30 d30Var) {
        PriceRecall2Dialog priceRecall2Dialog = (PriceRecall2Dialog) act.inflater().inflate(m6c0.d, (ViewGroup) null);
        final Dialog dialogZ = act.dialog().P(priceRecall2Dialog, false).u().B(false).L(y7c0.i).r(act.color(b1c0.g0)).C(t100.d(12.0f), 0, t100.d(12.0f), 130).z();
        priceRecall2Dialog.m914i(zl80.m27413h(list), new d30() { // from class: l.gl80
            public final void call() {
                PriceRecall2Dialog.m910f(dialogZ);
            }
        }, new d30() { // from class: l.hl80
            public final void call() {
                PriceRecall2Dialog.m906b(d30Var, dialogZ);
            }
        });
        dialogZ.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.il80
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                d30Var.call();
            }
        });
        final cwf0 cwf0VarC = i0e.c("p_discount_retain", PriceRecall2Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("p_discount_retain", "passive"), vwb.Y("tooltips_trigger_module", (Object) null), vwb.Y("tooltips_trigger_module", (Object) null), vwb.Y("tooltips_trigger_reason", (Object) null), vwb.Y("tooltips_type_ui", "alert_self_definition_business_a")});
        i0e.f(cwf0VarC);
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jl80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dialogZ.show();
        return dialogZ;
    }

    /* JADX INFO: renamed from: h */
    public final void m913h(View view) {
        nl80.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27, types: [android.view.View, com.p1.mobile.putong.core.ui.pricerecall.PriceRecallGetSurpriseItem2] */
    /* JADX INFO: renamed from: i */
    public void m914i(Merchandise merchandise, @NonNull final d30 d30Var, @NonNull final d30 d30Var2) {
        String str;
        xdl0.E0(this.f702f, new View.OnClickListener() { // from class: l.kl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.E0(this.f698b, new View.OnClickListener() { // from class: l.ll80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.E0(this.f703g, new View.OnClickListener() { // from class: l.ml80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        this.f699c.setText(R.string.p0);
        this.f699c.setTypeface(eqh0.c(3));
        this.f702f.setTypeface(eqh0.c(3));
        this.f703g.setTypeface(eqh0.c(3));
        this.f702f.setText(R.string.q0);
        long jO = !vwb.J(merchandise.localCoupons) ? ((long) ((Coupon) merchandise.localCoupons.get(0)).endTime) - mqi0.o() : 0L;
        if (jO < 86400000) {
            str = "0";
        } else {
            List listK = mqi0.k(jO);
            if (listK.size() == 4) {
                str = Integer.parseInt((String) listK.get(0)) + "";
            } else {
                str = "1";
            }
        }
        Application application = CoreModule.b;
        this.f700d.setText(String.format(application.getString(R.string.r0, application.getString(R.string.s0, str)), CoreModule.b.getString(R.string.s0, str)));
        this.f700d.setTextColor(getResources().getColor(b1c0.l));
        ?? r6 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(m6c0.e, (ViewGroup) null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        this.f701e.addView((View) r6, layoutParams);
        r6.m929i0(merchandise, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m913h(this);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
