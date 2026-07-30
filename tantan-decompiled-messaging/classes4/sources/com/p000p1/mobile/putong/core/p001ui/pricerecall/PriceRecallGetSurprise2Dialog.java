package com.p000p1.mobile.putong.core.p001ui.pricerecall;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreProduct;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.b1c0;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.i0e;
import l.j760;
import l.m6c0;
import l.mkd0;
import l.roj0;
import l.szd;
import l.t100;
import l.vwb;
import l.xl80;
import l.y7c0;
import l.zvf0;
import p002l.km80;
import p002l.zl80;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PriceRecallGetSurprise2Dialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f704a;

    /* JADX INFO: renamed from: b */
    public VImage f705b;

    /* JADX INFO: renamed from: c */
    public VText f706c;

    /* JADX INFO: renamed from: d */
    public VText f707d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f708e;

    /* JADX INFO: renamed from: f */
    public VText f709f;

    /* JADX INFO: renamed from: g */
    public VImage f710g;

    public PriceRecallGetSurprise2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m916b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m917c(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise.quantity - merchandise2.quantity;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m919e(List list, d30 d30Var, Act act, View view) {
        zvf0.u("e_got_discount", "p_got_discount", new j760[]{vwb.Y("discountproduct", zl80.m27410c(((Merchandise) list.get(0)).category)), vwb.Y("discountduration", zl80.m27414i(list))});
        d30Var.call();
        km80.m16681h0(act, null, zl80.m27412g().m27417d(false), "p_promotion,callback_other", null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m920f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m921g(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m923i(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: l */
    public static szd m924l(Act act, List<Merchandise> list, boolean z) {
        if (vwb.J(list)) {
            return null;
        }
        final cwf0 cwf0VarC = i0e.c("p_got_discount", PriceRecallGetSurprise2Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("discountproduct", zl80.m27410c(list.get(0).category)), vwb.Y("discountduration", zl80.m27414i(list)), vwb.Y("p_discount_retain", "passive"), vwb.Y("tooltips_trigger_module", (Object) null), vwb.Y("tooltips_trigger_module", (Object) null), vwb.Y("tooltips_trigger_reason", (Object) null), vwb.Y("tooltips_type_ui", "alert_self_definition_business_a")});
        Collections.sort(list, new Comparator() { // from class: l.ol80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PriceRecallGetSurprise2Dialog.m917c((Merchandise) obj, (Merchandise) obj2);
            }
        });
        PriceRecallGetSurprise2Dialog priceRecallGetSurprise2Dialog = (PriceRecallGetSurprise2Dialog) act.inflater().inflate(m6c0.c, (ViewGroup) null, false);
        final Dialog dialogZ = act.dialog().P(priceRecallGetSurprise2Dialog, false).B(false).L(y7c0.i).r(act.color(b1c0.g0)).C(0, 0, 0, 130).z();
        priceRecallGetSurprise2Dialog.m926k(act, list, new d30() { // from class: l.pl80
            public final void call() {
                dialogZ.dismiss();
            }
        }, z);
        dialogZ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ql80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
        dialogZ.show();
        return dialogZ;
    }

    /* JADX INFO: renamed from: j */
    public final void m925j(View view) {
        xl80.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.view.View, com.p1.mobile.putong.core.ui.pricerecall.PriceRecallGetSurpriseItem2] */
    /* JADX INFO: renamed from: k */
    public void m926k(final Act act, final List<Merchandise> list, final d30 d30Var, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            int iD = (-i) * t100.d(34.0f);
            ?? r3 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(m6c0.e, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, iD, 0, 0);
            layoutParams.gravity = 1;
            this.f708e.addView((View) r3, layoutParams);
            r3.m930j0(list.get(i), true, z);
        }
        if (!z) {
            m927m(list.get(0));
        }
        this.f709f.setOnClickListener(new View.OnClickListener() { // from class: l.rl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceRecallGetSurprise2Dialog.m919e(list, d30Var, act, view);
            }
        });
        this.f705b.setOnClickListener(new View.OnClickListener() { // from class: l.sl80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        boolean zEquals = TEnum.equals(list.get(0).category, "tttVip");
        VText vText = this.f706c;
        if (zEquals) {
            vText.setText(CoreModule.b.getText(R.string.v0));
            this.f710g.setImageResource(d3c0.V5);
        } else {
            vText.setText(CoreModule.b.getText(R.string.u0));
            this.f710g.setImageResource(d3c0.U5);
        }
        this.f707d.setText(CoreModule.b.getText(R.string.t0));
    }

    /* JADX INFO: renamed from: m */
    public final void m927m(Merchandise merchandise) {
        if (CoreModule.P().a().F4()) {
            if (vwb.J(merchandise.localCoupons)) {
                return;
            }
            CoreModule.c.j0.L5((String) ((Coupon) merchandise.localCoupons.get(0)).localApplyPromotions.get(0)).subscribe(mkd0.H(new e30() { // from class: l.tl80
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m921g((roj0) obj);
                }
            }, new e30() { // from class: l.ul80
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m920f((Throwable) obj);
                }
            }));
        } else if (NullChecker.a(merchandise.category)) {
            CoreModule.c.j0.N5(CoreProduct.w0, merchandise.category.name(), (String) null, false).subscribe(mkd0.H(new e30() { // from class: l.vl80
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m923i((roj0) obj);
                }
            }, new e30() { // from class: l.wl80
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m916b((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m925j(this);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
