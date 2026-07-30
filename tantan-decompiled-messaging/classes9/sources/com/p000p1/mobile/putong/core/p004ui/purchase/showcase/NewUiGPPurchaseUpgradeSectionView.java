package com.p000p1.mobile.putong.core.p004ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import java.text.NumberFormat;
import java.util.List;
import l.bkp;
import l.c30;
import l.cd40;
import l.d3c0;
import l.e30;
import l.f30;
import l.g30;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z4c0;
import p006l.ura;
import v.VImage;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewUiGPPurchaseUpgradeSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f5011b;

    /* JADX INFO: renamed from: c */
    public VText f5012c;

    /* JADX INFO: renamed from: d */
    public VText f5013d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f5014e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f5015f;

    /* JADX INFO: renamed from: g */
    public View f5016g;

    /* JADX INFO: renamed from: h */
    public VText f5017h;

    /* JADX INFO: renamed from: i */
    public VImage f5018i;

    /* JADX INFO: renamed from: j */
    public VText f5019j;

    /* JADX INFO: renamed from: k */
    public List<d> f5020k;

    /* JADX INFO: renamed from: l */
    public d f5021l;

    /* JADX INFO: renamed from: m */
    public d.a f5022m;

    /* JADX INFO: renamed from: n */
    public boolean f5023n;

    /* JADX INFO: renamed from: o */
    public bkp f5024o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f5025p;

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context) {
        super(context);
        this.f5021l = null;
        this.f5022m = null;
        this.f5023n = false;
        this.f5025p = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7693d(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(xdl0.O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m7696h() {
        return ura.m25555e().m25559d().m5847qq();
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo7659a(boolean z, boolean z2, d.a aVar) {
    }

    /* JADX INFO: renamed from: g */
    public final void m7697g(View view) {
        cd40.a(this, view);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.f0(new View[]{this.f5011b, this.f5019j, this.f5016g});
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7698i(g30 g30Var, d dVar, Boolean bool) {
        this.f5024o.j();
        this.f5021l = dVar;
        if (dVar.d() != null) {
            this.f5022m = dVar.d();
        } else {
            this.f5022m = dVar.b();
        }
        m7701l(this.f5023n);
        g30Var.a(Boolean.valueOf(this.f5023n), dVar, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7699j(final g30 g30Var, PurchaseType purchaseType, List list, View view) {
        boolean z = this.f5023n;
        if (z) {
            this.f5024o = new bkp.f(c30.d()).c("p_knowmyself_purchase,e_knowmyself_test,click").f(purchaseType).d(true).e(list).b(new f30() { // from class: l.bd40
                public final void call(Object obj, Object obj2) {
                    this.f8821a.m7698i(g30Var, (d) obj, (Boolean) obj2);
                }
            }).g();
        } else {
            g30Var.a(Boolean.valueOf(z), this.f5021l, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7700k(g30 g30Var, View view) {
        g30Var.a(Boolean.valueOf(this.f5023n), this.f5021l, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public void m7701l(boolean z) {
        int color;
        int color2;
        int color3;
        int i;
        int color4;
        int color5;
        int i2;
        int i3;
        int i4;
        int color6;
        int color7;
        int color8;
        int color9;
        int i5;
        int color10;
        if (this.f5022m == null) {
            return;
        }
        xdl0.M(this.f5019j, false);
        if (this.f5020k.size() != 1) {
            xdl0.M0(this.f5016g, false);
        }
        VText vText = this.f5012c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f5013d.setTypeface(this.f5012c.getTypeface(), 1);
        this.f5014e.setTypeface(this.f5015f.getTypeface(), 1);
        if (z) {
            xdl0.M(this.f5019j, true);
            if (this.f5020k.size() != 1) {
                xdl0.M0(this.f5016g, true);
            }
            ConstraintLayout.a layoutParams = this.f5017h.getLayoutParams();
            layoutParams.h = z4c0.K0;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            this.f5017h.setLayoutParams(layoutParams);
            ConstraintLayout.a layoutParams2 = this.f5018i.getLayoutParams();
            layoutParams2.h = z4c0.K0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
            this.f5018i.setLayoutParams(layoutParams2);
            String string = this.f5022m.f().toString();
            string.getClass();
            switch (string) {
                case "Promo_premiumUpgradeToUltra":
                case "tttUltraPremium":
                case "tttPremiumUpgradeToUltra":
                    color6 = Color.parseColor("#F9E7FF");
                    color7 = Color.parseColor("#3D2747");
                    color8 = Color.parseColor("#3D2747");
                    color9 = Color.parseColor("#663D2747");
                    i5 = d3c0.P2;
                    color10 = color7;
                    break;
                default:
                    if (m7696h()) {
                        color6 = Color.parseColor("#000000");
                        color7 = Color.parseColor("#000000");
                        color8 = Color.parseColor("#000000");
                        color9 = Color.parseColor("#66000000");
                        color10 = Color.parseColor("#000000");
                    } else {
                        color6 = Color.parseColor("#000000");
                        int color11 = Color.parseColor("#FFE7AA");
                        int color12 = Color.parseColor("#FFE7AA");
                        color9 = Color.parseColor("#80FFE7AA");
                        color10 = color11;
                        color8 = color12;
                        color7 = color10;
                    }
                    i5 = d3c0.H2;
                    break;
            }
            this.f5012c.setTextColor(color7);
            this.f5013d.setTextColor(color8);
            this.f5015f.setTextColor(color9);
            this.f5014e.setTextColor(color10);
            this.f5019j.setTextColor(color6);
            this.f5017h.setTextColor(color6);
            this.f5018i.setImageResource(i5);
        } else {
            ConstraintLayout.a layoutParams3 = this.f5017h.getLayoutParams();
            layoutParams3.h = -1;
            int i6 = t100.m;
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i6;
            this.f5017h.setLayoutParams(layoutParams3);
            ConstraintLayout.a layoutParams4 = this.f5018i.getLayoutParams();
            layoutParams4.h = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = i6;
            this.f5018i.setLayoutParams(layoutParams4);
            String string2 = this.f5022m.f().toString();
            string2.getClass();
            switch (string2) {
                case "Promo_premiumUpgradeToUltra":
                case "tttUltraPremium":
                case "tttPremiumUpgradeToUltra":
                    color = Color.parseColor("#F9E7FF");
                    color2 = Color.parseColor("#663D2747");
                    color3 = Color.parseColor("#663D2747");
                    int color13 = Color.parseColor("#663D2747");
                    int color14 = Color.parseColor("#3D2747");
                    i = d3c0.Q2;
                    color4 = color14;
                    color5 = color13;
                    break;
                default:
                    if (!m7696h()) {
                        color = Color.parseColor("#80FFE7AA");
                        color2 = Color.parseColor("#99FFE7AA");
                        color3 = Color.parseColor("#80FFE7AA");
                        color5 = Color.parseColor("#66EDD7A3");
                        color4 = Color.parseColor("#F5C663");
                        i = d3c0.I2;
                        break;
                    } else {
                        color = Color.parseColor("#66000000");
                        color2 = Color.parseColor("#66000000");
                        color3 = Color.parseColor("#66000000");
                        color5 = Color.parseColor("#66000000");
                        color4 = Color.parseColor("#000000");
                        i = d3c0.H2;
                        break;
                    }
                    break;
            }
            this.f5012c.setTextColor(color2);
            this.f5013d.setTextColor(color3);
            this.f5015f.setTextColor(color5);
            this.f5014e.setTextColor(color2);
            this.f5019j.setTextColor(color);
            this.f5017h.setTextColor(color4);
            this.f5018i.setImageResource(i);
        }
        String string3 = this.f5022m.f().toString();
        string3.getClass();
        switch (string3) {
            case "Promo_premiumUpgradeToUltra":
            case "tttUltraPremium":
            case "tttPremiumUpgradeToUltra":
                i2 = d3c0.f2;
                i3 = d3c0.N1;
                i4 = d3c0.W1;
                break;
            default:
                if (!m7696h()) {
                    i2 = d3c0.c2;
                    i3 = d3c0.K1;
                    i4 = d3c0.S1;
                    break;
                } else {
                    i2 = d3c0.d2;
                    i3 = d3c0.L1;
                    i4 = d3c0.U1;
                    break;
                }
                break;
        }
        this.f5011b.setBackgroundResource(i3);
        this.f5019j.setBackgroundResource(i2);
        this.f5012c.setText(String.valueOf(this.f5022m.w()));
        this.f5013d.setText(this.f5022m.x());
        this.f5025p.setMaximumFractionDigits(2);
        this.f5015f.setText(String.format("%s %s", this.f5022m.h(), this.f5025p.format(Double.parseDouble(this.f5022m.k()) * ((double) this.f5022m.w()))));
        VText_AutoFit vText_AutoFit = this.f5015f;
        vText_AutoFit.setPaintFlags(vText_AutoFit.getPaintFlags() | 16);
        this.f5014e.setText(this.f5022m.g());
        this.f5016g.setBackgroundResource(i4);
        String string4 = this.f5022m.f().toString();
        if (("tttUltraPremium".equals(string4) || "tttPremiumUpgradeToUltra".equals(string4) || "Promo_premiumUpgradeToUltra".equals(string4)) && CoreModule.f1534c.f3558G2.m13327j3()) {
            this.f5019j.setText(getContext().getString(R.string.B3));
        } else {
            this.f5019j.setText(getContext().getString(R.string.j6));
        }
        if (z != this.f5023n) {
            m7703n();
        }
        this.f5023n = z;
    }

    /* JADX INFO: renamed from: m */
    public void m7702m(final PurchaseType purchaseType, boolean z, final List<d> list, final g30<Boolean, d, Boolean> g30Var) {
        xdl0.M(this.f5019j, false);
        this.f5020k = list;
        for (d dVar : list) {
            if (dVar.l()) {
                this.f5021l = dVar;
                if (dVar.d() != null) {
                    this.f5022m = dVar.d();
                } else {
                    this.f5022m = dVar.b();
                }
            }
        }
        if (this.f5022m == null) {
            return;
        }
        int size = list.size();
        VText vText = this.f5017h;
        if (size == 1) {
            xdl0.M(vText, false);
            xdl0.M(this.f5018i, false);
            xdl0.M(this.f5016g, false);
            ConstraintLayout.a layoutParams = this.f5015f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = t100.d(21.0f);
            this.f5015f.setLayoutParams(layoutParams);
        } else {
            xdl0.M(vText, true);
            xdl0.M(this.f5018i, true);
            xdl0.M(this.f5016g, true);
            ConstraintLayout.a layoutParams2 = this.f5015f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = t100.d(51.0f);
            this.f5015f.setLayoutParams(layoutParams2);
            xdl0.E0(this.f5016g, new View.OnClickListener() { // from class: l.yc40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28112a.m7699j(g30Var, purchaseType, list, view);
                }
            });
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zc40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28701a.m7700k(g30Var, view);
            }
        });
        m7701l(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m7703n() {
        vwb.z(getAnimBackgroundList(), new e30() { // from class: l.ad40
            public final void call(Object obj) {
                NewUiGPPurchaseUpgradeSectionView.m7693d((View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7697g(this);
    }

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5021l = null;
        this.f5022m = null;
        this.f5023n = false;
        this.f5025p = NumberFormat.getNumberInstance();
    }
}
