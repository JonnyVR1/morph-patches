package com.p051p1.mobile.putong.core.p058ui.pricerecall;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreProduct;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.pricerecall.PriceRecallGetSurprise2Dialog;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bu80;
import p153l.dgc0;
import p153l.du80;
import p153l.g1e;
import p153l.h9c0;
import p153l.i4g0;
import p153l.jbc0;
import p153l.jyb;
import p153l.l4g0;
import p153l.ou80;
import p153l.psd0;
import p153l.qa00;
import p153l.rec0;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class PriceRecallGetSurprise2Dialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f33730a;

    /* JADX INFO: renamed from: b */
    public VImage f33731b;

    /* JADX INFO: renamed from: c */
    public VText f33732c;

    /* JADX INFO: renamed from: d */
    public VText f33733d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f33734e;

    /* JADX INFO: renamed from: f */
    public VText f33735f;

    /* JADX INFO: renamed from: g */
    public VImage f33736g;

    public PriceRecallGetSurprise2Dialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m51664b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m51665c(Merchandise merchandise, Merchandise merchandise2) {
        return merchandise.quantity - merchandise2.quantity;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m51667e(List list, x20 x20Var, Act act, View view) {
        i4g0.m138523u("e_got_discount", "p_got_discount", jyb.m147494Y("discountproduct", du80.m118104c(((Merchandise) list.get(0)).category)), jyb.m147494Y("discountduration", du80.m118108i(list)));
        x20Var.call();
        ou80.m169253h0(act, null, du80.m118106g().m118111d(false), "p_promotion,callback_other", null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m51668f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m51669g(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m51671i(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: l */
    public static g1e m51672l(Act act, List<Merchandise> list, boolean z) {
        if (jyb.m147479J(list)) {
            return null;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_got_discount", PriceRecallGetSurprise2Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("discountproduct", du80.m118104c(list.get(0).category)), jyb.m147494Y("discountduration", du80.m118108i(list)), jyb.m147494Y("p_discount_retain", "passive"), jyb.m147494Y("tooltips_trigger_module", null), jyb.m147494Y("tooltips_trigger_module", null), jyb.m147494Y("tooltips_trigger_reason", null), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_business_a"));
        Collections.sort(list, new Comparator() { // from class: l.st80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PriceRecallGetSurprise2Dialog.m51665c((Merchandise) obj, (Merchandise) obj2);
            }
        });
        PriceRecallGetSurprise2Dialog priceRecallGetSurprise2Dialog = (PriceRecallGetSurprise2Dialog) act.inflater().inflate(rec0.f162531c, (ViewGroup) null, false);
        final Dialog dialogM21566z = act.dialog().m21519P(priceRecallGetSurprise2Dialog, false).m21495B(false).m21515L(dgc0.f88285j).m21550r(act.color(h9c0.f108370g0)).m21497C(0, 0, 0, 130).m21566z();
        priceRecallGetSurprise2Dialog.m51674k(act, list, new x20() { // from class: l.tt80
            @Override // p153l.x20
            public final void call() {
                dialogM21566z.dismiss();
            }
        }, z);
        dialogM21566z.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ut80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        dialogM21566z.show();
        return dialogM21566z;
    }

    /* JADX INFO: renamed from: j */
    public final void m51673j(View view) {
        bu80.m106430a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public void m51674k(final Act act, final List<Merchandise> list, final x20 x20Var, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            int iM175859d = (-i) * qa00.m175859d(34.0f);
            PriceRecallGetSurpriseItem2 priceRecallGetSurpriseItem2 = (PriceRecallGetSurpriseItem2) LayoutInflater.from(getContext()).inflate(rec0.f162541e, (ViewGroup) null, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, iM175859d, 0, 0);
            layoutParams.gravity = 1;
            this.f33734e.addView(priceRecallGetSurpriseItem2, layoutParams);
            priceRecallGetSurpriseItem2.m51678j0(list.get(i), true, z);
        }
        if (!z) {
            m51675m(list.get(0));
        }
        this.f33735f.setOnClickListener(new View.OnClickListener() { // from class: l.vt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PriceRecallGetSurprise2Dialog.m51667e(list, x20Var, act, view);
            }
        });
        this.f33731b.setOnClickListener(new View.OnClickListener() { // from class: l.wt80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        boolean zEquals = TEnum.equals(list.get(0).category, ProductCategory.tttVip);
        VText vText = this.f33732c;
        if (zEquals) {
            vText.setText(CoreModule.f18263b.getText(R$string.f28472v0));
            this.f33736g.setImageResource(jbc0.f119437V5);
        } else {
            vText.setText(CoreModule.f18263b.getText(R$string.f28461u0));
            this.f33736g.setImageResource(jbc0.f119424U5);
        }
        this.f33733d.setText(CoreModule.f18263b.getText(R$string.f28450t0));
    }

    /* JADX INFO: renamed from: m */
    public final void m51675m(Merchandise merchandise) {
        if (CoreModule.m30933P().m143405a().mo34320F4()) {
            if (jyb.m147479J(merchandise.localCoupons)) {
                return;
            }
            CoreModule.f18264c.f20396j0.m31598L5(merchandise.localCoupons.get(0).localApplyPromotions.get(0)).subscribe(psd0.m173597H(new y20() { // from class: l.xt80
                @Override // p153l.y20
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m51669g((uxj0) obj);
                }
            }, new y20() { // from class: l.yt80
                @Override // p153l.y20
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m51668f((Throwable) obj);
                }
            }));
        } else if (NullChecker.m82486a(merchandise.category)) {
            CoreModule.f18264c.f20396j0.m31602N5(CoreProduct.f20020w0, merchandise.category.name(), null, false).subscribe(psd0.m173597H(new y20() { // from class: l.zt80
                @Override // p153l.y20
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m51671i((uxj0) obj);
                }
            }, new y20() { // from class: l.au80
                @Override // p153l.y20
                public final void call(Object obj) {
                    PriceRecallGetSurprise2Dialog.m51664b((Throwable) obj);
                }
            }));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51673j(this);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PriceRecallGetSurprise2Dialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
