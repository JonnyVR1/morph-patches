package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.vip.VipItemDetailPage;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.a9g0;
import p153l.bnl0;
import p153l.f9c0;
import p153l.gbc0;
import p153l.joa;
import p153l.pec0;
import p153l.qa00;
import p153l.uqb0;
import p153l.wib0;
import p153l.x20;
import p153l.zql0;

/* JADX INFO: loaded from: classes12.dex */
public class VipItemDetailPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37898a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37899b;

    /* JADX INFO: renamed from: c */
    public VImage f37900c;

    /* JADX INFO: renamed from: d */
    public GradientBgButton f37901d;

    /* JADX INFO: renamed from: e */
    public ImageView f37902e;

    /* JADX INFO: renamed from: f */
    public Space f37903f;

    /* JADX INFO: renamed from: g */
    public VText f37904g;

    /* JADX INFO: renamed from: h */
    public VText f37905h;

    /* JADX INFO: renamed from: i */
    public VText f37906i;

    /* JADX INFO: renamed from: j */
    public Space f37907j;

    /* JADX INFO: renamed from: k */
    public VButton f37908k;

    /* JADX INFO: renamed from: l */
    public VText f37909l;

    public VipItemDetailPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57451b(x20 x20Var, x20 x20Var2, Act act, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        x20Var2.call();
        CoreModule.m30933P().m143405a().mo34594sp(act);
    }

    /* JADX INFO: renamed from: f */
    public final void m57455f(View view) {
        zql0.m221015a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m57456g(Act act, a690 a690Var, PurchaseType purchaseType, x20 x20Var, x20 x20Var2) {
        m57457h(act, a690Var, purchaseType, x20Var, x20Var2, null);
    }

    /* JADX INFO: renamed from: h */
    public void m57457h(final Act act, a690 a690Var, PurchaseType purchaseType, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        Privilege privilegeM96306l = a690Var.m96306l();
        Privilege privilege = Privilege.see_not_match_guide;
        if (privilegeM96306l == privilege) {
            this.f37899b.setVisibility(8);
            this.f37901d.setVisibility(8);
            this.f37902e.setVisibility(8);
            DynamicAvatarRoundView dynamicAvatarRoundView = (DynamicAvatarRoundView) act.inflater().inflate(pec0.f152016m2, (ViewGroup) null, false);
            dynamicAvatarRoundView.m57409s(CoreModule.m30933P().m143410g().mo36044Yi());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f37898a.addView(dynamicAvatarRoundView, layoutParams);
            String strValueOf = String.valueOf(a690Var.m96314t());
            int iMo36042Y4 = CoreModule.m30933P().m143410g().mo36042Y4();
            int iIndexOf = strValueOf.indexOf(a9g0.m96571f(iMo36042Y4));
            int length = a9g0.m96571f(iMo36042Y4).length() + iIndexOf;
            SpannableString spannableString = new SpannableString(strValueOf);
            spannableString.setSpan(new ForegroundColorSpan(act.color(f9c0.f97867l)), iIndexOf, length, 33);
            this.f37904g.setText(spannableString);
        } else if (!TextUtils.isEmpty(a690Var.m96305k())) {
            this.f37901d.setVisibility(8);
            this.f37899b.setVisibility(0);
            this.f37902e.setVisibility(8);
            uqb0.f180374G.m127115L0(this.f37899b, a690Var.m96305k());
        } else if (a690Var.m96298f() != 0 && a690Var.m96296e() != 0) {
            this.f37899b.setVisibility(8);
            this.f37901d.setVisibility(0);
            this.f37901d.setButtonColorStart(act.color(a690Var.m96298f()));
            this.f37901d.setButtonColorEnd(act.color(a690Var.m96296e()));
            int iM96292c = a690Var.m96292c();
            ImageView imageView = this.f37902e;
            if (iM96292c != 0) {
                imageView.setVisibility(0);
                this.f37902e.setImageDrawable(act.drawable(a690Var.m96292c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (a690Var.m96304j() != 0) {
            if (a690Var.m96304j() == gbc0.f103380p6) {
                this.f37899b.setPadding(0, qa00.m175859d(8.0f), 0, qa00.m175859d(8.0f));
            }
            this.f37901d.setVisibility(8);
            this.f37899b.setVisibility(0);
            uqb0.f180374G.m127138Y0(this.f37899b, a690Var.m96304j());
            int iM96292c2 = a690Var.m96292c();
            ImageView imageView2 = this.f37902e;
            if (iM96292c2 != 0) {
                imageView2.setVisibility(0);
                this.f37902e.setImageDrawable(act.drawable(a690Var.m96292c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f37899b.setVisibility(8);
            this.f37901d.setVisibility(8);
            this.f37902e.setVisibility(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(a690Var.m96314t());
        VText vText = this.f37904g;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(a690Var.m96314t());
            this.f37904g.setTextColor(a690Var.m96315u() != 0 ? act.color(a690Var.m96315u()) : act.color(f9c0.f97864i));
            this.f37904g.setVisibility(0);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(a690Var.m96311q());
        VText vText2 = this.f37905h;
        if (zIsEmpty2) {
            vText2.setVisibility(0);
        } else {
            vText2.setText(a690Var.m96311q());
            this.f37905h.setTextColor(a690Var.m96312r() > 0 ? act.color(a690Var.m96312r()) : act.color(f9c0.f97865j));
            this.f37905h.setVisibility(0);
        }
        if (TextUtils.isEmpty(a690Var.m96294d()) || TextUtils.equals(a690Var.m96294d(), a690Var.m96311q())) {
            this.f37907j.getLayoutParams().height = qa00.m175859d(40.0f);
            this.f37903f.getLayoutParams().height = qa00.m175859d(8.0f);
            this.f37906i.setVisibility(8);
        } else {
            this.f37906i.setText(a690Var.m96294d());
            this.f37907j.getLayoutParams().height = qa00.m175859d(22.0f);
            this.f37903f.getLayoutParams().height = qa00.m175859d(19.0f);
            this.f37906i.setVisibility(0);
        }
        Privilege privilegeM96306l2 = a690Var.m96306l();
        VButton vButton = this.f37908k;
        if (privilegeM96306l2 == privilege) {
            vButton.setBackgroundResource(gbc0.f103356m6);
        } else {
            vButton.setBackgroundResource(gbc0.f103364n6);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(a690Var.m96294d());
        VButton vButton2 = this.f37908k;
        if (zIsEmpty3) {
            vButton2.setText(R$string.f21322F1);
            this.f37909l.setText(R$string.f21378d);
        } else {
            vButton2.setText(R$string.f21328H1);
            this.f37909l.setText(R$string.f21325G1);
        }
        int iM96303i = a690Var.m96303i();
        VImage vImage = this.f37900c;
        if (iM96303i != 0) {
            vImage.setVisibility(0);
            this.f37900c.setImageResource(a690Var.m96303i());
        } else {
            vImage.setVisibility(8);
        }
        if (m57458i(purchaseType)) {
            this.f37908k.setOnClickListener(new View.OnClickListener() { // from class: l.uql0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var.call();
                }
            });
            this.f37909l.setOnClickListener(new View.OnClickListener() { // from class: l.vql0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var2.call();
                }
            });
            return;
        }
        boolean zM206561e = wib0.m206561e(purchaseType);
        VText vText3 = this.f37909l;
        if (!zM206561e) {
            bnl0.m105524M(vText3, false);
            this.f37908k.setText(R$string.f21378d);
            this.f37908k.setOnClickListener(new View.OnClickListener() { // from class: l.yql0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var2.call();
                }
            });
        } else {
            bnl0.m105524M(vText3, true);
            this.f37909l.setOnClickListener(new View.OnClickListener() { // from class: l.wql0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var2.call();
                }
            });
            this.f37908k.setText(R$string.f21434v1);
            this.f37908k.setOnClickListener(new View.OnClickListener() { // from class: l.xql0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VipItemDetailPage.m57451b(x20Var3, x20Var2, act, view);
                }
            });
            this.f37904g.setText(act.getString(R$string.f21396j));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m57458i(PurchaseType purchaseType) {
        if (wib0.m206561e(purchaseType)) {
            return CoreModule.m30933P().m143410g().mo36040Xa() <= 0;
        }
        if (wib0.m206579w(purchaseType)) {
            return !CoreModule.f18264c.f20381e0.m116600p9().isVIP();
        }
        if (wib0.m206575s(purchaseType)) {
            return CoreModule.m30933P().m143405a().mo34492e2();
        }
        if (CoreModule.m30933P().m143405a().mo34587s6() || CoreModule.m30933P().m143405a().mo34510h5()) {
            return joa.m146378b4(purchaseType);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57455f(this);
    }

    public void setGetBackgroundResource(@DrawableRes int i) {
        this.f37908k.setBackgroundResource(i);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
