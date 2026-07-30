package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeLetterView;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeSeeLetterView;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.fdc0;
import p153l.gta;
import p153l.jbc0;
import p153l.jyb;
import p153l.p9r;
import p153l.qa00;
import p153l.rec0;
import p153l.tql0;
import p153l.uqb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class VipIntroPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37843a;

    /* JADX INFO: renamed from: b */
    public TextView f37844b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f37845c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f37846d;

    /* JADX INFO: renamed from: e */
    public VImage f37847e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f37848f;

    /* JADX INFO: renamed from: g */
    public ImageView f37849g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37850h;

    /* JADX INFO: renamed from: i */
    public ImageView f37851i;

    /* JADX INFO: renamed from: j */
    public VText f37852j;

    /* JADX INFO: renamed from: k */
    public VText f37853k;

    /* JADX INFO: renamed from: l */
    public boolean f37854l;

    /* JADX INFO: renamed from: m */
    public boolean f37855m;

    /* JADX INFO: renamed from: n */
    public float f37856n;

    public VipIntroPage(Context context) {
        super(context);
        this.f37854l = vnb.m201957q1();
        this.f37855m = vnb.m201956p1();
        this.f37856n = this.f37854l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m57431a(View view) {
        tql0.m192316a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m57432b() {
        this.f37852j.setTextSize(this.f37854l ? 18.0f : 19.0f);
        this.f37853k.setTextSize(this.f37854l ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37845c.getLayoutParams();
        marginLayoutParams.height = (int) (marginLayoutParams.height * this.f37856n);
        this.f37845c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f37846d.getLayoutParams();
        marginLayoutParams2.height = (int) (marginLayoutParams2.height * this.f37856n);
        this.f37846d.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f37848f.getLayoutParams();
        float f = marginLayoutParams3.height;
        float f2 = this.f37856n;
        marginLayoutParams3.height = (int) (f * f2);
        marginLayoutParams3.width = (int) (marginLayoutParams3.width * f2);
        this.f37848f.setLayoutParams(marginLayoutParams3);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f37849g.getLayoutParams();
        float f3 = marginLayoutParams4.height;
        float f4 = this.f37856n;
        marginLayoutParams4.height = (int) (f3 * f4);
        marginLayoutParams4.width = (int) (marginLayoutParams4.width * f4);
        this.f37849g.setLayoutParams(marginLayoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f37852j.getLayoutParams();
        marginLayoutParams5.topMargin = (int) (marginLayoutParams5.topMargin * this.f37856n);
        this.f37852j.setLayoutParams(marginLayoutParams5);
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f37853k.getLayoutParams();
        marginLayoutParams6.topMargin = (int) (marginLayoutParams6.topMargin * this.f37856n);
        this.f37853k.setLayoutParams(marginLayoutParams6);
    }

    /* JADX INFO: renamed from: c */
    public void m57433c(Act act, a690 a690Var) {
        m57434d(act, a690Var, true, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m57434d(Act act, a690 a690Var, boolean z, int i, int i2) {
        if (this.f37854l || this.f37855m) {
            m57432b();
        }
        if (a690Var.m96306l() == Privilege.vip_letter_gp) {
            this.f37845c.removeAllViews();
            PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) p9r.m171370a(getContext()).inflate(rec0.f162458K0, (ViewGroup) this.f37845c, false);
            privilegeLetterView.m55444b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f37845c.addView(privilegeLetterView, layoutParams);
        } else if (a690Var.m96306l() == Privilege.see_letter_gp) {
            this.f37845c.removeAllViews();
            PrivilegeSeeLetterView privilegeSeeLetterView = (PrivilegeSeeLetterView) p9r.m171370a(getContext()).inflate(rec0.f162474O0, (ViewGroup) this.f37845c, false);
            privilegeSeeLetterView.m55460b();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f37845c.addView(privilegeSeeLetterView, layoutParams2);
        } else if (!TextUtils.isEmpty(a690Var.m96305k())) {
            this.f37845c.setVisibility(0);
            this.f37848f.setVisibility(8);
            this.f37849g.setVisibility(8);
            this.f37846d.setVisibility(0);
            this.f37846d.setImageUrl(a690Var.m96305k());
        } else if (a690Var.m96298f() != 0 && a690Var.m96296e() != 0) {
            this.f37845c.setVisibility(0);
            this.f37846d.setVisibility(8);
            this.f37848f.setVisibility(0);
            this.f37848f.setButtonColorStart(act.color(a690Var.m96298f()));
            this.f37848f.setButtonColorEnd(act.color(a690Var.m96296e()));
            int iM96292c = a690Var.m96292c();
            ImageView imageView = this.f37849g;
            if (iM96292c != 0) {
                imageView.setVisibility(0);
                this.f37849g.setImageDrawable(act.drawable(a690Var.m96292c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (a690Var.m96304j() != 0) {
            if (a690Var.m96304j() == jbc0.f119579fc || a690Var.m96304j() == jbc0.f119482Yb) {
                this.f37846d.setPadding(0, qa00.m175859d(8.0f), 0, qa00.m175859d(8.0f));
                this.f37848f.setVisibility(8);
                this.f37846d.setVisibility(0);
                uqb0.f180374G.m127138Y0(this.f37846d, a690Var.m96304j());
            } else {
                this.f37848f.setVisibility(8);
                this.f37846d.setVisibility(0);
                uqb0.f180374G.m127138Y0(this.f37846d, a690Var.m96304j());
            }
            int iM96292c2 = a690Var.m96292c();
            ImageView imageView2 = this.f37849g;
            if (iM96292c2 != 0) {
                imageView2.setVisibility(0);
                this.f37849g.setImageDrawable(act.drawable(a690Var.m96292c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f37845c.setVisibility(8);
        }
        String strValueOf = (a690Var.m96306l() != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) ? String.valueOf(a690Var.m96314t()) : getResources().getString(R$string.f28246b9, 5);
        boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
        VText vText = this.f37852j;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(strValueOf);
            this.f37852j.setVisibility(0);
        }
        CharSequence charSequenceM96294d = a690Var.m96294d();
        if (TextUtils.isEmpty(charSequenceM96294d) || !a690Var.m96313s()) {
            this.f37853k.setVisibility(8);
        } else {
            this.f37853k.setText(charSequenceM96294d);
            this.f37853k.setVisibility(0);
        }
        int iM96303i = a690Var.m96303i();
        VImage vImage = this.f37847e;
        if (iM96303i != 0) {
            vImage.setVisibility(0);
            this.f37847e.setImageResource(a690Var.m96303i());
        } else {
            vImage.setVisibility(8);
        }
        int iM96307m = a690Var.m96307m();
        ImageView imageView3 = this.f37851i;
        if (iM96307m != 0) {
            imageView3.setVisibility(0);
            this.f37851i.setImageResource(a690Var.m96307m());
        } else {
            imageView3.setVisibility(8);
        }
        List<String> listM96288a = a690Var.m96288a();
        if (jyb.m147479J(listM96288a) || listM96288a.size() != 3) {
            return;
        }
        bnl0.m105524M(this.f37850h, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(fdc0.f98379W0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(fdc0.f98381X0);
        AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) findViewById(fdc0.f98383Y0);
        autoVDraweeView.setImageUrl(listM96288a.get(0));
        uqb0.f180374G.m127120O(autoVDraweeView2, listM96288a.get(1), 3, 18);
        uqb0.f180374G.m127120O(autoVDraweeView3, listM96288a.get(2), 3, 18);
        int color = Color.parseColor("#9affffff");
        Drawable drawableMo157973b = autoVDraweeView2.getHierarchy().mo157973b();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableMo157973b.setColorFilter(color, mode);
        autoVDraweeView3.getHierarchy().mo157973b().setColorFilter(color, mode);
        int iM96302h = a690Var.m96302h();
        if (iM96302h != 0) {
            ((VImage) findViewById(fdc0.f98380X)).setImageResource(iM96302h);
        } else {
            findViewById(fdc0.f98380X).setVisibility(8);
        }
        this.f37845c.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57431a(this);
    }

    public VipIntroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37854l = vnb.m201957q1();
        this.f37855m = vnb.m201956p1();
        this.f37856n = this.f37854l ? 0.7f : 0.9f;
    }

    public VipIntroPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37854l = vnb.m201957q1();
        this.f37855m = vnb.m201956p1();
        this.f37856n = this.f37854l ? 0.7f : 0.9f;
    }
}
