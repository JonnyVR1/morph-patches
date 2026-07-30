package com.p046p1.mobile.putong.core.p053ui.pricerecall;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecall2Dialog;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.b1c0;
import p149l.cwf0;
import p149l.d30;
import p149l.eqh0;
import p149l.i0e;
import p149l.m6c0;
import p149l.mqi0;
import p149l.nl80;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y7c0;
import p149l.zl80;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecall2Dialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public PriceRecall2Dialog f32875a;

    /* JADX INFO: renamed from: b */
    public VImage f32876b;

    /* JADX INFO: renamed from: c */
    public VText f32877c;

    /* JADX INFO: renamed from: d */
    public VText f32878d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f32879e;

    /* JADX INFO: renamed from: f */
    public VText f32880f;

    /* JADX INFO: renamed from: g */
    public VText f32881g;

    public PriceRecall2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50471b(d30 d30Var, Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m50475f(Dialog dialog) {
        dialog.dismiss();
        zvf0.m220396r("e_discount_retain", "p_discount_retain");
    }

    /* JADX INFO: renamed from: j */
    public static Dialog m50477j(Act act, List<Merchandise> list, @NonNull final d30 d30Var) {
        PriceRecall2Dialog priceRecall2Dialog = (PriceRecall2Dialog) act.inflater().inflate(m6c0.f131576d, (ViewGroup) null);
        final Dialog dialogM20567z = act.dialog().m20520P(priceRecall2Dialog, false).m20557u().m20496B(false).m20516L(y7c0.f196699i).m20551r(act.color(b1c0.f72550g0)).m20498C(t100.m186890d(12.0f), 0, t100.m186890d(12.0f), 130).m20567z();
        priceRecall2Dialog.m50479i(zl80.m219253h(list), new d30() { // from class: l.gl80
            @Override // p149l.d30
            public final void call() {
                PriceRecall2Dialog.m50475f(dialogM20567z);
            }
        }, new d30() { // from class: l.hl80
            @Override // p149l.d30
            public final void call() {
                PriceRecall2Dialog.m50471b(d30Var, dialogM20567z);
            }
        });
        dialogM20567z.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.il80
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                d30Var.call();
            }
        });
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_discount_retain", PriceRecall2Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("p_discount_retain", "passive"), vwb.m200311Y("tooltips_trigger_module", null), vwb.m200311Y("tooltips_trigger_module", null), vwb.m200311Y("tooltips_trigger_reason", null), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_business_a"));
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.jl80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dialogM20567z.show();
        return dialogM20567z;
    }

    /* JADX INFO: renamed from: h */
    public final void m50478h(View view) {
        nl80.m160017a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m50479i(Merchandise merchandise, @NonNull final d30 d30Var, @NonNull final d30 d30Var2) {
        String str;
        xdl0.m208329E0(this.f32880f, new View.OnClickListener() { // from class: l.kl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        xdl0.m208329E0(this.f32876b, new View.OnClickListener() { // from class: l.ll80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.m208329E0(this.f32881g, new View.OnClickListener() { // from class: l.ml80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        this.f32877c.setText(R$string.f27557p0);
        this.f32877c.setTypeface(eqh0.m117752c(3));
        this.f32880f.setTypeface(eqh0.m117752c(3));
        this.f32881g.setTypeface(eqh0.m117752c(3));
        this.f32880f.setText(R$string.f27569q0);
        long jM155944o = !vwb.m200296J(merchandise.localCoupons) ? ((long) merchandise.localCoupons.get(0).endTime) - mqi0.m155944o() : 0L;
        if (jM155944o < 86400000) {
            str = "0";
        } else {
            List<String> listM155940k = mqi0.m155940k(jM155944o);
            if (listM155940k.size() == 4) {
                str = Integer.parseInt(listM155940k.get(0)) + "";
            } else {
                str = "1";
            }
        }
        Application application = CoreModule.f17544b;
        this.f32878d.setText(String.format(application.getString(R$string.f27580r0, application.getString(R$string.f27591s0, str)), CoreModule.f17544b.getString(R$string.f27591s0, str)));
        this.f32878d.setTextColor(getResources().getColor(b1c0.f72559l));
        PriceRecallGetSurpriseItem2 priceRecallGetSurpriseItem2 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(m6c0.f131581e, (ViewGroup) null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        this.f32879e.addView(priceRecallGetSurpriseItem2, layoutParams);
        priceRecallGetSurpriseItem2.m50494i0(merchandise, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50478h(this);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
