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
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import java.util.List;
import l.d3c0;
import l.hmb;
import l.m6c0;
import l.o7r;
import l.phl0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z4c0;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import v.AutoVDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipIntroPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6776a;

    /* JADX INFO: renamed from: b */
    public TextView f6777b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f6778c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f6779d;

    /* JADX INFO: renamed from: e */
    public VImage f6780e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f6781f;

    /* JADX INFO: renamed from: g */
    public ImageView f6782g;

    /* JADX INFO: renamed from: h */
    public ViewStub f6783h;

    /* JADX INFO: renamed from: i */
    public ImageView f6784i;

    /* JADX INFO: renamed from: j */
    public VText f6785j;

    /* JADX INFO: renamed from: k */
    public VText f6786k;

    /* JADX INFO: renamed from: l */
    public boolean f6787l;

    /* JADX INFO: renamed from: m */
    public boolean f6788m;

    /* JADX INFO: renamed from: n */
    public float f6789n;

    public VipIntroPage(Context context) {
        super(context);
        this.f6787l = hmb.q1();
        this.f6788m = hmb.p1();
        this.f6789n = this.f6787l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9682a(View view) {
        phl0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m9683b() {
        this.f6785j.setTextSize(this.f6787l ? 18.0f : 19.0f);
        this.f6786k.setTextSize(this.f6787l ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6778c.getLayoutParams();
        marginLayoutParams.height = (int) (marginLayoutParams.height * this.f6789n);
        this.f6778c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f6779d.getLayoutParams();
        marginLayoutParams2.height = (int) (marginLayoutParams2.height * this.f6789n);
        this.f6779d.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f6781f.getLayoutParams();
        float f = marginLayoutParams3.height;
        float f2 = this.f6789n;
        marginLayoutParams3.height = (int) (f * f2);
        marginLayoutParams3.width = (int) (marginLayoutParams3.width * f2);
        this.f6781f.setLayoutParams(marginLayoutParams3);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f6782g.getLayoutParams();
        float f3 = marginLayoutParams4.height;
        float f4 = this.f6789n;
        marginLayoutParams4.height = (int) (f3 * f4);
        marginLayoutParams4.width = (int) (marginLayoutParams4.width * f4);
        this.f6782g.setLayoutParams(marginLayoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f6785j.getLayoutParams();
        marginLayoutParams5.topMargin = (int) (marginLayoutParams5.topMargin * this.f6789n);
        this.f6785j.setLayoutParams(marginLayoutParams5);
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f6786k.getLayoutParams();
        marginLayoutParams6.topMargin = (int) (marginLayoutParams6.topMargin * this.f6789n);
        this.f6786k.setLayoutParams(marginLayoutParams6);
    }

    /* JADX INFO: renamed from: c */
    public void m9684c(Act act, wx80 wx80Var) {
        m9685d(act, wx80Var, true, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m9685d(Act act, wx80 wx80Var, boolean z, int i, int i2) {
        if (this.f6787l || this.f6788m) {
            m9683b();
        }
        if (wx80Var.m26841l() == Privilege.vip_letter_gp) {
            this.f6778c.removeAllViews();
            PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.a(getContext()).inflate(m6c0.K0, (ViewGroup) this.f6778c, false);
            privilegeLetterView.m7596b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f6778c.addView(privilegeLetterView, layoutParams);
        } else if (wx80Var.m26841l() == Privilege.see_letter_gp) {
            this.f6778c.removeAllViews();
            PrivilegeSeeLetterView privilegeSeeLetterView = (PrivilegeSeeLetterView) o7r.a(getContext()).inflate(m6c0.O0, (ViewGroup) this.f6778c, false);
            privilegeSeeLetterView.m7612b();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f6778c.addView(privilegeSeeLetterView, layoutParams2);
        } else if (!TextUtils.isEmpty(wx80Var.m26840k())) {
            this.f6778c.setVisibility(0);
            this.f6781f.setVisibility(8);
            this.f6782g.setVisibility(8);
            this.f6779d.setVisibility(0);
            this.f6779d.setImageUrl(wx80Var.m26840k());
        } else if (wx80Var.m26833f() != 0 && wx80Var.m26831e() != 0) {
            this.f6778c.setVisibility(0);
            this.f6779d.setVisibility(8);
            this.f6781f.setVisibility(0);
            this.f6781f.setButtonColorStart(act.color(wx80Var.m26833f()));
            this.f6781f.setButtonColorEnd(act.color(wx80Var.m26831e()));
            int iM26827c = wx80Var.m26827c();
            ImageView imageView = this.f6782g;
            if (iM26827c != 0) {
                imageView.setVisibility(0);
                this.f6782g.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (wx80Var.m26839j() != 0) {
            if (wx80Var.m26839j() == d3c0.fc || wx80Var.m26839j() == d3c0.Yb) {
                this.f6779d.setPadding(0, t100.d(8.0f), 0, t100.d(8.0f));
                this.f6781f.setVisibility(8);
                this.f6779d.setVisibility(0);
                qib0.f19782G.m12767Y0(this.f6779d, wx80Var.m26839j());
            } else {
                this.f6781f.setVisibility(8);
                this.f6779d.setVisibility(0);
                qib0.f19782G.m12767Y0(this.f6779d, wx80Var.m26839j());
            }
            int iM26827c2 = wx80Var.m26827c();
            ImageView imageView2 = this.f6782g;
            if (iM26827c2 != 0) {
                imageView2.setVisibility(0);
                this.f6782g.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f6778c.setVisibility(8);
        }
        String strValueOf = (wx80Var.m26841l() != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) ? String.valueOf(wx80Var.m26849t()) : getResources().getString(R.string.b9, 5);
        boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
        VText vText = this.f6785j;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(strValueOf);
            this.f6785j.setVisibility(0);
        }
        CharSequence charSequenceM26829d = wx80Var.m26829d();
        if (TextUtils.isEmpty(charSequenceM26829d) || !wx80Var.m26848s()) {
            this.f6786k.setVisibility(8);
        } else {
            this.f6786k.setText(charSequenceM26829d);
            this.f6786k.setVisibility(0);
        }
        int iM26838i = wx80Var.m26838i();
        VImage vImage = this.f6780e;
        if (iM26838i != 0) {
            vImage.setVisibility(0);
            this.f6780e.setImageResource(wx80Var.m26838i());
        } else {
            vImage.setVisibility(8);
        }
        int iM26842m = wx80Var.m26842m();
        ImageView imageView3 = this.f6784i;
        if (iM26842m != 0) {
            imageView3.setVisibility(0);
            this.f6784i.setImageResource(wx80Var.m26842m());
        } else {
            imageView3.setVisibility(8);
        }
        List<String> listM26823a = wx80Var.m26823a();
        if (vwb.J(listM26823a) || listM26823a.size() != 3) {
            return;
        }
        xdl0.M(this.f6783h, true);
        AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.W0);
        SimpleDraweeView simpleDraweeView = (AutoVDraweeView) findViewById(z4c0.X0);
        SimpleDraweeView simpleDraweeView2 = (AutoVDraweeView) findViewById(z4c0.Y0);
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
        this.f6778c.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9682a(this);
    }

    public VipIntroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6787l = hmb.q1();
        this.f6788m = hmb.p1();
        this.f6789n = this.f6787l ? 0.7f : 0.9f;
    }

    public VipIntroPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6787l = hmb.q1();
        this.f6788m = hmb.p1();
        this.f6789n = this.f6787l ? 0.7f : 0.9f;
    }
}
