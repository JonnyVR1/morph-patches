package com.p046p1.mobile.putong.core.p053ui.pricerecall;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreProduct;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.b1c0;
import p149l.cwf0;
import p149l.d30;
import p149l.d3c0;
import p149l.e30;
import p149l.i0e;
import p149l.km80;
import p149l.m6c0;
import p149l.mkd0;
import p149l.roj0;
import p149l.szd;
import p149l.t100;
import p149l.vwb;
import p149l.xl80;
import p149l.y7c0;
import p149l.zl80;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallGetSurprise2Dialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32882a;

    /* JADX INFO: renamed from: b */
    public VImage f32883b;

    /* JADX INFO: renamed from: c */
    public VText f32884c;

    /* JADX INFO: renamed from: d */
    public VText f32885d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f32886e;

    /* JADX INFO: renamed from: f */
    public VText f32887f;

    /* JADX INFO: renamed from: g */
    public VImage f32888g;

    public PriceRecallGetSurprise2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m50481b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m50482c(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise.quantity - merchandise2.quantity;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m50484e(List list, d30 d30Var, Act act, View view) {
        zvf0.m220399u("e_got_discount", "p_got_discount", vwb.m200311Y("discountproduct", zl80.m219250c(((Merchandise) list.get(0)).category)), vwb.m200311Y("discountduration", zl80.m219254i(list)));
        d30Var.call();
        km80.m146459h0(act, null, zl80.m219252g().m219257d(false), "p_promotion,callback_other", null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m50485f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m50486g(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m50488i(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l */
    public static szd m50489l(Act act, List<Merchandise> list, boolean z) {
        if (vwb.m200296J(list)) {
            return null;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_got_discount", PriceRecallGetSurprise2Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("discountproduct", zl80.m219250c(list.get(0).category)), vwb.m200311Y("discountduration", zl80.m219254i(list)), vwb.m200311Y("p_discount_retain", "passive"), vwb.m200311Y("tooltips_trigger_module", null), vwb.m200311Y("tooltips_trigger_module", null), vwb.m200311Y("tooltips_trigger_reason", null), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_business_a"));
        Collections.sort(list, new Comparator() { // from class: l.ol80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PriceRecallGetSurprise2Dialog.m50482c((Merchandise) obj, (Merchandise) obj2);
            }
        });
        PriceRecallGetSurprise2Dialog priceRecallGetSurprise2Dialog = (PriceRecallGetSurprise2Dialog) act.inflater().inflate(m6c0.f131571c, (ViewGroup) null, false);
        final Dialog dialogM20567z = act.dialog().m20520P(priceRecallGetSurprise2Dialog, false).m20496B(false).m20516L(y7c0.f196699i).m20551r(act.color(b1c0.f72550g0)).m20498C(0, 0, 0, 130).m20567z();
        priceRecallGetSurprise2Dialog.m50491k(act, list, new d30() { // from class: l.pl80
            @Override // p149l.d30
            public final void call() {
                dialogM20567z.dismiss();
            }
        }, z);
        dialogM20567z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ql80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        dialogM20567z.show();
        return dialogM20567z;
    }

    /* JADX INFO: renamed from: j */
    public final void m50490j(View view) {
        xl80.m209867a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m50491k(final Act act, final List<Merchandise> list, final d30 d30Var, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            int iM186890d = (-i) * t100.m186890d(34.0f);
            PriceRecallGetSurpriseItem2 priceRecallGetSurpriseItem2 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(m6c0.f131581e, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, iM186890d, 0, 0);
            layoutParams.gravity = 1;
            this.f32886e.addView(priceRecallGetSurpriseItem2, layoutParams);
            priceRecallGetSurpriseItem2.m50495j0(list.get(i), true, z);
        }
        if (!z) {
            m50492m(list.get(0));
        }
        this.f32887f.setOnClickListener(new View.OnClickListener() { // from class: l.rl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceRecallGetSurprise2Dialog.m50484e(list, d30Var, act, view);
            }
        });
        this.f32883b.setOnClickListener(new View.OnClickListener() { // from class: l.sl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        boolean zEquals = TEnum.equals(list.get(0).category, ProductCategory.tttVip);
        VText vText = this.f32884c;
        if (zEquals) {
            vText.setText(CoreModule.f17544b.getText(R$string.f27624v0));
            this.f32888g.setImageResource(d3c0.f83782V5);
        } else {
            vText.setText(CoreModule.f17544b.getText(R$string.f27613u0));
            this.f32888g.setImageResource(d3c0.f83769U5);
        }
        this.f32885d.setText(CoreModule.f17544b.getText(R$string.f27602t0));
    }

    /* JADX INFO: renamed from: m */
    public final void m50492m(Merchandise merchandise) {
        if (CoreModule.m29935P().m94651a().mo33317F4()) {
            if (vwb.m200296J(merchandise.localCoupons)) {
                return;
            }
            CoreModule.f17545c.f19654j0.m30595L5(merchandise.localCoupons.get(0).localApplyPromotions.get(0)).subscribe(mkd0.m154956H(new e30() { // from class: l.tl80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m50486g((roj0) obj);
                }
            }, new e30() { // from class: l.ul80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m50485f((Throwable) obj);
                }
            }));
        } else if (NullChecker.m81303a(merchandise.category)) {
            CoreModule.f17545c.f19654j0.m30599N5(CoreProduct.f19278w0, merchandise.category.name(), null, false).subscribe(mkd0.m154956H(new e30() { // from class: l.vl80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m50488i((roj0) obj);
                }
            }, new e30() { // from class: l.wl80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m50481b((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50490j(this);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
