package com.p046p1.mobile.putong.core.p053ui.purchase.showcase;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.bkp;
import p149l.c30;
import p149l.cd40;
import p149l.d3c0;
import p149l.e30;
import p149l.f30;
import p149l.g30;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class NewUiGPPurchaseUpgradeSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f35230b;

    /* JADX INFO: renamed from: c */
    public VText f35231c;

    /* JADX INFO: renamed from: d */
    public VText f35232d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f35233e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f35234f;

    /* JADX INFO: renamed from: g */
    public View f35235g;

    /* JADX INFO: renamed from: h */
    public VText f35236h;

    /* JADX INFO: renamed from: i */
    public VImage f35237i;

    /* JADX INFO: renamed from: j */
    public VText f35238j;

    /* JADX INFO: renamed from: k */
    public List<C8765d> f35239k;

    /* JADX INFO: renamed from: l */
    public C8765d f35240l;

    /* JADX INFO: renamed from: m */
    public C8765d.a f35241m;

    /* JADX INFO: renamed from: n */
    public boolean f35242n;

    /* JADX INFO: renamed from: o */
    public bkp f35243o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f35244p;

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context) {
        super(context);
        this.f35240l = null;
        this.f35241m = null;
        this.f35242n = false;
        this.f35244p = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m54358d(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(xdl0.m208349O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m54361h() {
        return ura.m195053e().m195057d().mo33910qq();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo54324a(boolean z, boolean z2, C8765d.a aVar) {
    }

    /* JADX INFO: renamed from: g */
    public final void m54362g(View view) {
        cd40.m106214a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return vwb.m200324f0(this.f35230b, this.f35238j, this.f35235g);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m54363i(g30 g30Var, C8765d c8765d, Boolean bool) {
        this.f35243o.m102473j();
        this.f35240l = c8765d;
        if (c8765d.m53522d() != null) {
            this.f35241m = c8765d.m53522d();
        } else {
            this.f35241m = c8765d.m53520b();
        }
        m54366l(this.f35242n);
        g30Var.mo36055a(Boolean.valueOf(this.f35242n), c8765d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m54364j(final g30 g30Var, PurchaseType purchaseType, List list, View view) {
        boolean z = this.f35242n;
        if (z) {
            this.f35243o = new bkp.C15900f(c30.m104962d()).m102492c("p_knowmyself_purchase,e_knowmyself_test,click").m102495f(purchaseType).m102493d(true).m102494e(list).m102491b(new f30() { // from class: l.bd40
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f75003a.m54363i(g30Var, (C8765d) obj, (Boolean) obj2);
                }
            }).m102496g();
        } else {
            g30Var.mo36055a(Boolean.valueOf(z), this.f35240l, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m54365k(g30 g30Var, View view) {
        g30Var.mo36055a(Boolean.valueOf(this.f35242n), this.f35240l, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public void m54366l(boolean z) {
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
        if (this.f35241m == null) {
            return;
        }
        xdl0.m208344M(this.f35238j, false);
        if (this.f35239k.size() != 1) {
            xdl0.m208345M0(this.f35235g, false);
        }
        VText vText = this.f35231c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f35232d.setTypeface(this.f35231c.getTypeface(), 1);
        this.f35233e.setTypeface(this.f35234f.getTypeface(), 1);
        if (z) {
            xdl0.m208344M(this.f35238j, true);
            if (this.f35239k.size() != 1) {
                xdl0.m208345M0(this.f35235g, true);
            }
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f35236h.getLayoutParams();
            c0220a.f1251h = z4c0.f201479K0;
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = 0;
            this.f35236h.setLayoutParams(c0220a);
            ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f35237i.getLayoutParams();
            c0220a2.f1251h = z4c0.f201479K0;
            ((ViewGroup.MarginLayoutParams) c0220a2).bottomMargin = 0;
            this.f35237i.setLayoutParams(c0220a2);
            String string = this.f35241m.m53579f().toString();
            string.getClass();
            switch (string) {
                case "Promo_premiumUpgradeToUltra":
                case "tttUltraPremium":
                case "tttPremiumUpgradeToUltra":
                    color6 = Color.parseColor("#F9E7FF");
                    color7 = Color.parseColor("#3D2747");
                    color8 = Color.parseColor("#3D2747");
                    color9 = Color.parseColor("#663D2747");
                    i5 = d3c0.f83700P2;
                    color10 = color7;
                    break;
                default:
                    if (m54361h()) {
                        color6 = Color.parseColor(Constants.BLACK);
                        color7 = Color.parseColor(Constants.BLACK);
                        color8 = Color.parseColor(Constants.BLACK);
                        color9 = Color.parseColor("#66000000");
                        color10 = Color.parseColor(Constants.BLACK);
                    } else {
                        color6 = Color.parseColor(Constants.BLACK);
                        int color11 = Color.parseColor("#FFE7AA");
                        int color12 = Color.parseColor("#FFE7AA");
                        color9 = Color.parseColor("#80FFE7AA");
                        color10 = color11;
                        color8 = color12;
                        color7 = color10;
                    }
                    i5 = d3c0.f83588H2;
                    break;
            }
            this.f35231c.setTextColor(color7);
            this.f35232d.setTextColor(color8);
            this.f35234f.setTextColor(color9);
            this.f35233e.setTextColor(color10);
            this.f35238j.setTextColor(color6);
            this.f35236h.setTextColor(color6);
            this.f35237i.setImageResource(i5);
        } else {
            ConstraintLayout.C0220a c0220a3 = (ConstraintLayout.C0220a) this.f35236h.getLayoutParams();
            c0220a3.f1251h = -1;
            int i6 = t100.f167264m;
            ((ViewGroup.MarginLayoutParams) c0220a3).bottomMargin = i6;
            this.f35236h.setLayoutParams(c0220a3);
            ConstraintLayout.C0220a c0220a4 = (ConstraintLayout.C0220a) this.f35237i.getLayoutParams();
            c0220a4.f1251h = -1;
            ((ViewGroup.MarginLayoutParams) c0220a4).bottomMargin = i6;
            this.f35237i.setLayoutParams(c0220a4);
            String string2 = this.f35241m.m53579f().toString();
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
                    i = d3c0.f83714Q2;
                    color4 = color14;
                    color5 = color13;
                    break;
                default:
                    if (!m54361h()) {
                        color = Color.parseColor("#80FFE7AA");
                        color2 = Color.parseColor("#99FFE7AA");
                        color3 = Color.parseColor("#80FFE7AA");
                        color5 = Color.parseColor("#66EDD7A3");
                        color4 = Color.parseColor("#F5C663");
                        i = d3c0.f83602I2;
                        break;
                    } else {
                        color = Color.parseColor("#66000000");
                        color2 = Color.parseColor("#66000000");
                        color3 = Color.parseColor("#66000000");
                        color5 = Color.parseColor("#66000000");
                        color4 = Color.parseColor(Constants.BLACK);
                        i = d3c0.f83588H2;
                        break;
                    }
                    break;
            }
            this.f35231c.setTextColor(color2);
            this.f35232d.setTextColor(color3);
            this.f35234f.setTextColor(color5);
            this.f35233e.setTextColor(color2);
            this.f35238j.setTextColor(color);
            this.f35236h.setTextColor(color4);
            this.f35237i.setImageResource(i);
        }
        String string3 = this.f35241m.m53579f().toString();
        string3.getClass();
        switch (string3) {
            case "Promo_premiumUpgradeToUltra":
            case "tttUltraPremium":
            case "tttPremiumUpgradeToUltra":
                i2 = d3c0.f83914f2;
                i3 = d3c0.f83671N1;
                i4 = d3c0.f83791W1;
                break;
            default:
                if (!m54361h()) {
                    i2 = d3c0.f83872c2;
                    i3 = d3c0.f83629K1;
                    i4 = d3c0.f83739S1;
                    break;
                } else {
                    i2 = d3c0.f83886d2;
                    i3 = d3c0.f83643L1;
                    i4 = d3c0.f83765U1;
                    break;
                }
                break;
        }
        this.f35230b.setBackgroundResource(i3);
        this.f35238j.setBackgroundResource(i2);
        this.f35231c.setText(String.valueOf(this.f35241m.m53605w()));
        this.f35232d.setText(this.f35241m.m53606x());
        this.f35244p.setMaximumFractionDigits(2);
        this.f35234f.setText(String.format("%s %s", this.f35241m.m53583h(), this.f35244p.format(Double.parseDouble(this.f35241m.m53589k()) * ((double) this.f35241m.m53605w()))));
        VText_AutoFit vText_AutoFit = this.f35234f;
        vText_AutoFit.setPaintFlags(vText_AutoFit.getPaintFlags() | 16);
        this.f35233e.setText(this.f35241m.m53581g());
        this.f35235g.setBackgroundResource(i4);
        String string4 = this.f35241m.m53579f().toString();
        if ((ProductCategory.tttUltraPremium.equals(string4) || ProductCategory.tttPremiumUpgradeToUltra.equals(string4) || ProductCategory.Promo_premiumUpgradeToUltra.equals(string4)) && CoreModule.f17545c.f19569G2.m105982j3()) {
            this.f35238j.setText(getContext().getString(R$string.f27105B3));
        } else {
            this.f35238j.setText(getContext().getString(R$string.f27491j6));
        }
        if (z != this.f35242n) {
            m54368n();
        }
        this.f35242n = z;
    }

    /* JADX INFO: renamed from: m */
    public void m54367m(final PurchaseType purchaseType, boolean z, final List<C8765d> list, final g30<Boolean, C8765d, Boolean> g30Var) {
        xdl0.m208344M(this.f35238j, false);
        this.f35239k = list;
        for (C8765d c8765d : list) {
            if (c8765d.m53530l()) {
                this.f35240l = c8765d;
                if (c8765d.m53522d() != null) {
                    this.f35241m = c8765d.m53522d();
                } else {
                    this.f35241m = c8765d.m53520b();
                }
            }
        }
        if (this.f35241m == null) {
            return;
        }
        int size = list.size();
        VText vText = this.f35236h;
        if (size == 1) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f35237i, false);
            xdl0.m208344M(this.f35235g, false);
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f35234f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = t100.m186890d(21.0f);
            this.f35234f.setLayoutParams(c0220a);
        } else {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f35237i, true);
            xdl0.m208344M(this.f35235g, true);
            ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f35234f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0220a2).bottomMargin = t100.m186890d(51.0f);
            this.f35234f.setLayoutParams(c0220a2);
            xdl0.m208329E0(this.f35235g, new View.OnClickListener() { // from class: l.yc40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197410a.m54364j(g30Var, purchaseType, list, view);
                }
            });
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zc40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202512a.m54365k(g30Var, view);
            }
        });
        m54366l(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m54368n() {
        vwb.m200354z(getAnimBackgroundList(), new e30() { // from class: l.ad40
            @Override // p149l.e30
            public final void call(Object obj) {
                NewUiGPPurchaseUpgradeSectionView.m54358d((View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54362g(this);
    }

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35240l = null;
        this.f35241m = null;
        this.f35242n = false;
        this.f35244p = NumberFormat.getNumberInstance();
    }
}
