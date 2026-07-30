package com.p051p1.mobile.putong.core.p058ui.purchase.showcase;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.NewUiGPPurchaseUpgradeSectionView;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.a30;
import p153l.bmp;
import p153l.bnl0;
import p153l.fdc0;
import p153l.gta;
import p153l.jbc0;
import p153l.jyb;
import p153l.qa00;
import p153l.ql40;
import p153l.w20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public class NewUiGPPurchaseUpgradeSectionView extends AnimBorderSectionView {

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f36078b;

    /* JADX INFO: renamed from: c */
    public VText f36079c;

    /* JADX INFO: renamed from: d */
    public VText f36080d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f36081e;

    /* JADX INFO: renamed from: f */
    public VText_AutoFit f36082f;

    /* JADX INFO: renamed from: g */
    public View f36083g;

    /* JADX INFO: renamed from: h */
    public VText f36084h;

    /* JADX INFO: renamed from: i */
    public VImage f36085i;

    /* JADX INFO: renamed from: j */
    public VText f36086j;

    /* JADX INFO: renamed from: k */
    public List<C8928d> f36087k;

    /* JADX INFO: renamed from: l */
    public C8928d f36088l;

    /* JADX INFO: renamed from: m */
    public C8928d.a f36089m;

    /* JADX INFO: renamed from: n */
    public boolean f36090n;

    /* JADX INFO: renamed from: o */
    public bmp f36091o;

    /* JADX INFO: renamed from: p */
    public NumberFormat f36092p;

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context) {
        super(context);
        this.f36088l = null;
        this.f36089m = null;
        this.f36090n = false;
        this.f36092p = NumberFormat.getNumberInstance();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m55541d(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(bnl0.m105529O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m55544h() {
        return gta.m132210e().m132214d().mo34913qq();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView
    /* JADX INFO: renamed from: a */
    public void mo55507a(boolean z, boolean z2, C8928d.a aVar) {
    }

    /* JADX INFO: renamed from: g */
    public final void m55545g(View view) {
        ql40.m176995a(this, view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView
    public List<View> getAnimBackgroundList() {
        return jyb.m147507f0(this.f36078b, this.f36086j, this.f36083g);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m55546i(a30 a30Var, C8928d c8928d, Boolean bool) {
        this.f36091o.m105225j();
        this.f36088l = c8928d;
        if (c8928d.m54705d() != null) {
            this.f36089m = c8928d.m54705d();
        } else {
            this.f36089m = c8928d.m54703b();
        }
        m55549l(this.f36090n);
        a30Var.mo37058a(Boolean.valueOf(this.f36090n), c8928d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m55547j(final a30 a30Var, PurchaseType purchaseType, List list, View view) {
        boolean z = this.f36090n;
        if (z) {
            this.f36091o = new bmp.C16056f(w20.m204489d()).m105244c("p_knowmyself_purchase,e_knowmyself_test,click").m105247f(purchaseType).m105245d(true).m105246e(list).m105243b(new z20() { // from class: l.pl40
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f152993a.m55546i(a30Var, (C8928d) obj, (Boolean) obj2);
                }
            }).m105248g();
        } else {
            a30Var.mo37058a(Boolean.valueOf(z), this.f36088l, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m55548k(a30 a30Var, View view) {
        a30Var.mo37058a(Boolean.valueOf(this.f36090n), this.f36088l, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public void m55549l(boolean z) {
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
        if (this.f36089m == null) {
            return;
        }
        bnl0.m105524M(this.f36086j, false);
        if (this.f36087k.size() != 1) {
            bnl0.m105525M0(this.f36083g, false);
        }
        VText vText = this.f36079c;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f36080d.setTypeface(this.f36079c.getTypeface(), 1);
        this.f36081e.setTypeface(this.f36082f.getTypeface(), 1);
        if (z) {
            bnl0.m105524M(this.f36086j, true);
            if (this.f36087k.size() != 1) {
                bnl0.m105525M0(this.f36083g, true);
            }
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f36084h.getLayoutParams();
            c0221a.f1251h = fdc0.f98355K0;
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = 0;
            this.f36084h.setLayoutParams(c0221a);
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f36085i.getLayoutParams();
            c0221a2.f1251h = fdc0.f98355K0;
            ((ViewGroup.MarginLayoutParams) c0221a2).bottomMargin = 0;
            this.f36085i.setLayoutParams(c0221a2);
            String string = this.f36089m.m54762f().toString();
            string.getClass();
            switch (string) {
                case "Promo_premiumUpgradeToUltra":
                case "tttUltraPremium":
                case "tttPremiumUpgradeToUltra":
                    color6 = Color.parseColor("#F9E7FF");
                    color7 = Color.parseColor("#3D2747");
                    color8 = Color.parseColor("#3D2747");
                    color9 = Color.parseColor("#663D2747");
                    i5 = jbc0.f119355P2;
                    color10 = color7;
                    break;
                default:
                    if (m55544h()) {
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
                    i5 = jbc0.f119243H2;
                    break;
            }
            this.f36079c.setTextColor(color7);
            this.f36080d.setTextColor(color8);
            this.f36082f.setTextColor(color9);
            this.f36081e.setTextColor(color10);
            this.f36086j.setTextColor(color6);
            this.f36084h.setTextColor(color6);
            this.f36085i.setImageResource(i5);
        } else {
            ConstraintLayout.C0221a c0221a3 = (ConstraintLayout.C0221a) this.f36084h.getLayoutParams();
            c0221a3.f1251h = -1;
            int i6 = qa00.f156326m;
            ((ViewGroup.MarginLayoutParams) c0221a3).bottomMargin = i6;
            this.f36084h.setLayoutParams(c0221a3);
            ConstraintLayout.C0221a c0221a4 = (ConstraintLayout.C0221a) this.f36085i.getLayoutParams();
            c0221a4.f1251h = -1;
            ((ViewGroup.MarginLayoutParams) c0221a4).bottomMargin = i6;
            this.f36085i.setLayoutParams(c0221a4);
            String string2 = this.f36089m.m54762f().toString();
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
                    i = jbc0.f119369Q2;
                    color4 = color14;
                    color5 = color13;
                    break;
                default:
                    if (!m55544h()) {
                        color = Color.parseColor("#80FFE7AA");
                        color2 = Color.parseColor("#99FFE7AA");
                        color3 = Color.parseColor("#80FFE7AA");
                        color5 = Color.parseColor("#66EDD7A3");
                        color4 = Color.parseColor("#F5C663");
                        i = jbc0.f119257I2;
                        break;
                    } else {
                        color = Color.parseColor("#66000000");
                        color2 = Color.parseColor("#66000000");
                        color3 = Color.parseColor("#66000000");
                        color5 = Color.parseColor("#66000000");
                        color4 = Color.parseColor(Constants.BLACK);
                        i = jbc0.f119243H2;
                        break;
                    }
                    break;
            }
            this.f36079c.setTextColor(color2);
            this.f36080d.setTextColor(color3);
            this.f36082f.setTextColor(color5);
            this.f36081e.setTextColor(color2);
            this.f36086j.setTextColor(color);
            this.f36084h.setTextColor(color4);
            this.f36085i.setImageResource(i);
        }
        String string3 = this.f36089m.m54762f().toString();
        string3.getClass();
        switch (string3) {
            case "Promo_premiumUpgradeToUltra":
            case "tttUltraPremium":
            case "tttPremiumUpgradeToUltra":
                i2 = jbc0.f119569f2;
                i3 = jbc0.f119326N1;
                i4 = jbc0.f119446W1;
                break;
            default:
                if (!m55544h()) {
                    i2 = jbc0.f119527c2;
                    i3 = jbc0.f119284K1;
                    i4 = jbc0.f119394S1;
                    break;
                } else {
                    i2 = jbc0.f119541d2;
                    i3 = jbc0.f119298L1;
                    i4 = jbc0.f119420U1;
                    break;
                }
                break;
        }
        this.f36078b.setBackgroundResource(i3);
        this.f36086j.setBackgroundResource(i2);
        this.f36079c.setText(String.valueOf(this.f36089m.m54788w()));
        this.f36080d.setText(this.f36089m.m54789x());
        this.f36092p.setMaximumFractionDigits(2);
        this.f36082f.setText(String.format("%s %s", this.f36089m.m54766h(), this.f36092p.format(Double.parseDouble(this.f36089m.m54772k()) * ((double) this.f36089m.m54788w()))));
        VText_AutoFit vText_AutoFit = this.f36082f;
        vText_AutoFit.setPaintFlags(vText_AutoFit.getPaintFlags() | 16);
        this.f36081e.setText(this.f36089m.m54764g());
        this.f36083g.setBackgroundResource(i4);
        String string4 = this.f36089m.m54762f().toString();
        if ((ProductCategory.tttUltraPremium.equals(string4) || ProductCategory.tttPremiumUpgradeToUltra.equals(string4) || ProductCategory.Promo_premiumUpgradeToUltra.equals(string4)) && CoreModule.f18264c.f20311G2.m153652j3()) {
            this.f36086j.setText(getContext().getString(R$string.f27953B3));
        } else {
            this.f36086j.setText(getContext().getString(R$string.f28339j6));
        }
        if (z != this.f36090n) {
            m55551n();
        }
        this.f36090n = z;
    }

    /* JADX INFO: renamed from: m */
    public void m55550m(final PurchaseType purchaseType, boolean z, final List<C8928d> list, final a30<Boolean, C8928d, Boolean> a30Var) {
        bnl0.m105524M(this.f36086j, false);
        this.f36087k = list;
        for (C8928d c8928d : list) {
            if (c8928d.m54713l()) {
                this.f36088l = c8928d;
                if (c8928d.m54705d() != null) {
                    this.f36089m = c8928d.m54705d();
                } else {
                    this.f36089m = c8928d.m54703b();
                }
            }
        }
        if (this.f36089m == null) {
            return;
        }
        int size = list.size();
        VText vText = this.f36084h;
        if (size == 1) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f36085i, false);
            bnl0.m105524M(this.f36083g, false);
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f36082f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = qa00.m175859d(21.0f);
            this.f36082f.setLayoutParams(c0221a);
        } else {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f36085i, true);
            bnl0.m105524M(this.f36083g, true);
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f36082f.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0221a2).bottomMargin = qa00.m175859d(51.0f);
            this.f36082f.setLayoutParams(c0221a2);
            bnl0.m105509E0(this.f36083g, new View.OnClickListener() { // from class: l.ml40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137359a.m55547j(a30Var, purchaseType, list, view);
                }
            });
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.nl40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142506a.m55548k(a30Var, view);
            }
        });
        m55549l(z);
    }

    /* JADX INFO: renamed from: n */
    public final void m55551n() {
        jyb.m147537z(getAnimBackgroundList(), new y20() { // from class: l.ol40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewUiGPPurchaseUpgradeSectionView.m55541d((View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55545g(this);
    }

    public NewUiGPPurchaseUpgradeSectionView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36088l = null;
        this.f36089m = null;
        this.f36090n = false;
        this.f36092p = NumberFormat.getNumberInstance();
    }
}
