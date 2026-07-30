package com.p051p1.mobile.putong.core.p058ui.pricerecall;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecall2Dialog;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dgc0;
import p153l.du80;
import p153l.h9c0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l4g0;
import p153l.lyh0;
import p153l.pzi0;
import p153l.qa00;
import p153l.rec0;
import p153l.rt80;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecall2Dialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public PriceRecall2Dialog f33723a;

    /* JADX INFO: renamed from: b */
    public VImage f33724b;

    /* JADX INFO: renamed from: c */
    public VText f33725c;

    /* JADX INFO: renamed from: d */
    public VText f33726d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f33727e;

    /* JADX INFO: renamed from: f */
    public VText f33728f;

    /* JADX INFO: renamed from: g */
    public VText f33729g;

    public PriceRecall2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51654b(x20 x20Var, Dialog dialog) {
        x20Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m51658f(Dialog dialog) {
        dialog.dismiss();
        i4g0.m138520r("e_discount_retain", "p_discount_retain");
    }

    /* JADX INFO: renamed from: j */
    public static Dialog m51660j(Act act, List<Merchandise> list, @NonNull final x20 x20Var) {
        PriceRecall2Dialog priceRecall2Dialog = (PriceRecall2Dialog) act.inflater().inflate(rec0.f162536d, (ViewGroup) null);
        final Dialog dialogM21566z = act.dialog().m21519P(priceRecall2Dialog, false).m21556u().m21495B(false).m21515L(dgc0.f88285j).m21550r(act.color(h9c0.f108370g0)).m21497C(qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 130).m21566z();
        priceRecall2Dialog.m51662i(du80.m118107h(list), new x20() { // from class: l.kt80
            @Override // p153l.x20
            public final void call() {
                PriceRecall2Dialog.m51658f(dialogM21566z);
            }
        }, new x20() { // from class: l.lt80
            @Override // p153l.x20
            public final void call() {
                PriceRecall2Dialog.m51654b(x20Var, dialogM21566z);
            }
        });
        dialogM21566z.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.mt80
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                x20Var.call();
            }
        });
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_discount_retain", PriceRecall2Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("p_discount_retain", "passive"), jyb.m147494Y("tooltips_trigger_module", null), jyb.m147494Y("tooltips_trigger_module", null), jyb.m147494Y("tooltips_trigger_reason", null), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_business_a"));
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nt80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        dialogM21566z.show();
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: h */
    public final void m51661h(View view) {
        rt80.m183100a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m51662i(Merchandise merchandise, @NonNull final x20 x20Var, @NonNull final x20 x20Var2) {
        String str;
        bnl0.m105509E0(this.f33728f, new View.OnClickListener() { // from class: l.ot80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        bnl0.m105509E0(this.f33724b, new View.OnClickListener() { // from class: l.pt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        bnl0.m105509E0(this.f33729g, new View.OnClickListener() { // from class: l.qt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        this.f33725c.setText(R$string.f28405p0);
        this.f33725c.setTypeface(lyh0.m156283c(3));
        this.f33728f.setTypeface(lyh0.m156283c(3));
        this.f33729g.setTypeface(lyh0.m156283c(3));
        this.f33728f.setText(R$string.f28417q0);
        long jM174454o = !jyb.m147479J(merchandise.localCoupons) ? ((long) merchandise.localCoupons.get(0).endTime) - pzi0.m174454o() : 0L;
        if (jM174454o < 86400000) {
            str = "0";
        } else {
            List<String> listM174450k = pzi0.m174450k(jM174454o);
            if (listM174450k.size() == 4) {
                str = Integer.parseInt(listM174450k.get(0)) + "";
            } else {
                str = "1";
            }
        }
        Application application = CoreModule.f18263b;
        this.f33726d.setText(String.format(application.getString(R$string.f28428r0, application.getString(R$string.f28439s0, str)), CoreModule.f18263b.getString(R$string.f28439s0, str)));
        this.f33726d.setTextColor(getResources().getColor(h9c0.f108379l));
        PriceRecallGetSurpriseItem2 priceRecallGetSurpriseItem2 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(rec0.f162541e, (ViewGroup) null, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        this.f33727e.addView(priceRecallGetSurpriseItem2, layoutParams);
        priceRecallGetSurpriseItem2.m51677i0(merchandise, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51661h(this);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecall2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
