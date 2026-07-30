package com.p000p1.mobile.putong.core.p004ui.vip;

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
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeLetterView;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeSeeLetterView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import java.util.List;
import l.d3c0;
import l.hmb;
import l.m6c0;
import l.o7r;
import l.t100;
import l.ugj;
import l.vwb;
import l.xdl0;
import l.z4c0;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class GPVipIntroPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6735a;

    /* JADX INFO: renamed from: b */
    public TextView f6736b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6737c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f6738d;

    /* JADX INFO: renamed from: e */
    public VImage f6739e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f6740f;

    /* JADX INFO: renamed from: g */
    public ImageView f6741g;

    /* JADX INFO: renamed from: h */
    public ViewStub f6742h;

    /* JADX INFO: renamed from: i */
    public ImageView f6743i;

    /* JADX INFO: renamed from: j */
    public VText f6744j;

    /* JADX INFO: renamed from: k */
    public VText f6745k;

    /* JADX INFO: renamed from: l */
    public boolean f6746l;

    /* JADX INFO: renamed from: m */
    public boolean f6747m;

    /* JADX INFO: renamed from: n */
    public boolean f6748n;

    /* JADX INFO: renamed from: o */
    public float f6749o;

    public GPVipIntroPage(Context context) {
        super(context);
        this.f6747m = hmb.q1();
        this.f6748n = hmb.p1();
        this.f6749o = this.f6747m ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9660a(View view) {
        ugj.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m9661b() {
        this.f6745k.setTextSize(13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6737c.getLayoutParams();
        marginLayoutParams.height = (int) (marginLayoutParams.height * this.f6749o);
        this.f6737c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6738d.getLayoutParams();
        marginLayoutParams2.height = (int) (marginLayoutParams2.height * this.f6749o);
        this.f6738d.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f6740f.getLayoutParams();
        float f = marginLayoutParams3.height;
        float f2 = this.f6749o;
        marginLayoutParams3.height = (int) (f * f2);
        marginLayoutParams3.width = (int) (marginLayoutParams3.width * f2);
        this.f6740f.setLayoutParams(marginLayoutParams3);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f6741g.getLayoutParams();
        float f3 = marginLayoutParams4.height;
        float f4 = this.f6749o;
        marginLayoutParams4.height = (int) (f3 * f4);
        marginLayoutParams4.width = (int) (marginLayoutParams4.width * f4);
        this.f6741g.setLayoutParams(marginLayoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f6744j.getLayoutParams();
        marginLayoutParams5.topMargin = (int) (marginLayoutParams5.topMargin * this.f6749o);
        this.f6744j.setLayoutParams(marginLayoutParams5);
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f6745k.getLayoutParams();
        marginLayoutParams6.topMargin = (int) (marginLayoutParams6.topMargin * this.f6749o);
        this.f6745k.setLayoutParams(marginLayoutParams6);
    }

    /* JADX INFO: renamed from: c */
    public void m9662c(Act act, wx80 wx80Var, boolean z, int i, int i2) {
        if (this.f6747m || this.f6748n) {
            m9661b();
        }
        if (wx80Var.m26841l() == Privilege.vip_letter_gp) {
            this.f6737c.removeAllViews();
            PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.a(getContext()).inflate(m6c0.K0, (ViewGroup) this.f6737c, false);
            privilegeLetterView.m7596b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f6737c.addView(privilegeLetterView, layoutParams);
        } else if (wx80Var.m26841l() == Privilege.see_letter_gp) {
            this.f6737c.removeAllViews();
            PrivilegeSeeLetterView privilegeSeeLetterView = (PrivilegeSeeLetterView) o7r.a(getContext()).inflate(m6c0.O0, (ViewGroup) this.f6737c, false);
            privilegeSeeLetterView.m7612b();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f6737c.addView(privilegeSeeLetterView, layoutParams2);
        } else if (!TextUtils.isEmpty(wx80Var.m26840k())) {
            this.f6737c.setVisibility(0);
            this.f6740f.setVisibility(8);
            this.f6741g.setVisibility(8);
            this.f6738d.setVisibility(0);
            this.f6738d.x(wx80Var.m26840k(), 1);
        } else if (wx80Var.m26833f() != 0 && wx80Var.m26831e() != 0) {
            this.f6737c.setVisibility(0);
            this.f6738d.setVisibility(8);
            this.f6740f.setVisibility(0);
            this.f6740f.setButtonColorStart(act.color(wx80Var.m26833f()));
            this.f6740f.setButtonColorEnd(act.color(wx80Var.m26831e()));
            int iM26827c = wx80Var.m26827c();
            ImageView imageView = this.f6741g;
            if (iM26827c != 0) {
                imageView.setVisibility(0);
                this.f6741g.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (wx80Var.m26839j() != 0) {
            if (wx80Var.m26839j() == d3c0.fc || wx80Var.m26839j() == d3c0.Yb) {
                this.f6738d.setPadding(0, t100.d(8.0f), 0, t100.d(8.0f));
                this.f6740f.setVisibility(8);
                this.f6738d.setVisibility(0);
                qib0.f19782G.m12767Y0(this.f6738d, wx80Var.m26839j());
            } else {
                this.f6740f.setVisibility(8);
                this.f6738d.setVisibility(0);
                qib0.f19782G.m12767Y0(this.f6738d, wx80Var.m26839j());
            }
            int iM26827c2 = wx80Var.m26827c();
            ImageView imageView2 = this.f6741g;
            if (iM26827c2 != 0) {
                imageView2.setVisibility(0);
                this.f6741g.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f6737c.setVisibility(8);
        }
        if (this.f6746l) {
            this.f6744j.setTextColor(-1521014);
            this.f6745k.setTextColor(1726532234);
        }
        String strValueOf = (wx80Var.m26841l() != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) ? String.valueOf(wx80Var.m26849t()) : getResources().getString(R.string.b9, 5);
        boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
        VText vText = this.f6744j;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(strValueOf);
            this.f6744j.setVisibility(0);
        }
        CharSequence charSequenceM26829d = wx80Var.m26829d();
        if (TextUtils.isEmpty(charSequenceM26829d) || !wx80Var.m26848s()) {
            this.f6745k.setVisibility(8);
        } else {
            this.f6745k.setText(charSequenceM26829d);
            this.f6745k.setVisibility(0);
        }
        int iM26838i = wx80Var.m26838i();
        VImage vImage = this.f6739e;
        if (iM26838i != 0) {
            vImage.setVisibility(0);
            this.f6739e.setImageResource(wx80Var.m26838i());
        } else {
            vImage.setVisibility(8);
        }
        int iM26842m = wx80Var.m26842m();
        ImageView imageView3 = this.f6743i;
        if (iM26842m != 0) {
            imageView3.setVisibility(0);
            this.f6743i.setImageResource(wx80Var.m26842m());
        } else {
            imageView3.setVisibility(8);
        }
        List<String> listM26823a = wx80Var.m26823a();
        if (vwb.J(listM26823a) || listM26823a.size() != 3) {
            return;
        }
        xdl0.M(this.f6742h, true);
        AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.W0);
        SimpleDraweeView simpleDraweeView = (VDraweeView) findViewById(z4c0.X0);
        SimpleDraweeView simpleDraweeView2 = (VDraweeView) findViewById(z4c0.Y0);
        autoVDraweeViewFindViewById.setImageUrl(listM26823a.get(0));
        qib0.f19782G.m12749O(simpleDraweeView, listM26823a.get(1), 3, 18);
        qib0.f19782G.m12749O(simpleDraweeView2, listM26823a.get(2), 3, 18);
        int color = Color.parseColor("#9affffff");
        Drawable drawableB = simpleDraweeView.getHierarchy().b();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableB.setColorFilter(color, mode);
        simpleDraweeView2.getHierarchy().b().setColorFilter(color, mode);
        int iM26837h = wx80Var.m26837h();
        if (iM26837h != 0) {
            findViewById(z4c0.X).setImageResource(iM26837h);
        } else {
            findViewById(z4c0.X).setVisibility(8);
        }
        this.f6737c.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m9663d(Act act, wx80 wx80Var, boolean z, int i, int i2, PurchaseType purchaseType) {
        this.f6746l = purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        m9662c(act, wx80Var, true, 0, 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9660a(this);
    }

    public GPVipIntroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6747m = hmb.q1();
        this.f6748n = hmb.p1();
        this.f6749o = this.f6747m ? 0.7f : 0.9f;
    }

    public GPVipIntroPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6747m = hmb.q1();
        this.f6748n = hmb.p1();
        this.f6749o = this.f6747m ? 0.7f : 0.9f;
    }
}
