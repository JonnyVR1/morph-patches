package com.p046p1.mobile.putong.core.p053ui.vip;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeLetterView;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeSeeLetterView;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.d3c0;
import p149l.hmb;
import p149l.m6c0;
import p149l.o7r;
import p149l.phl0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.wx80;
import p149l.xdl0;
import p149l.z4c0;

/* JADX INFO: loaded from: classes9.dex */
public class VipIntroPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f36995a;

    /* JADX INFO: renamed from: b */
    public TextView f36996b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f36997c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f36998d;

    /* JADX INFO: renamed from: e */
    public VImage f36999e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f37000f;

    /* JADX INFO: renamed from: g */
    public ImageView f37001g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37002h;

    /* JADX INFO: renamed from: i */
    public ImageView f37003i;

    /* JADX INFO: renamed from: j */
    public VText f37004j;

    /* JADX INFO: renamed from: k */
    public VText f37005k;

    /* JADX INFO: renamed from: l */
    public boolean f37006l;

    /* JADX INFO: renamed from: m */
    public boolean f37007m;

    /* JADX INFO: renamed from: n */
    public float f37008n;

    public VipIntroPage(Context context) {
        super(context);
        this.f37006l = hmb.m131712q1();
        this.f37007m = hmb.m131711p1();
        this.f37008n = this.f37006l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m56248a(View view) {
        phl0.m168976a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m56249b() {
        this.f37004j.setTextSize(this.f37006l ? 18.0f : 19.0f);
        this.f37005k.setTextSize(this.f37006l ? 12.0f : 13.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36997c.getLayoutParams();
        marginLayoutParams.height = (int) (marginLayoutParams.height * this.f37008n);
        this.f36997c.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f36998d.getLayoutParams();
        marginLayoutParams2.height = (int) (marginLayoutParams2.height * this.f37008n);
        this.f36998d.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f37000f.getLayoutParams();
        float f = marginLayoutParams3.height;
        float f2 = this.f37008n;
        marginLayoutParams3.height = (int) (f * f2);
        marginLayoutParams3.width = (int) (marginLayoutParams3.width * f2);
        this.f37000f.setLayoutParams(marginLayoutParams3);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f37001g.getLayoutParams();
        float f3 = marginLayoutParams4.height;
        float f4 = this.f37008n;
        marginLayoutParams4.height = (int) (f3 * f4);
        marginLayoutParams4.width = (int) (marginLayoutParams4.width * f4);
        this.f37001g.setLayoutParams(marginLayoutParams4);
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f37004j.getLayoutParams();
        marginLayoutParams5.topMargin = (int) (marginLayoutParams5.topMargin * this.f37008n);
        this.f37004j.setLayoutParams(marginLayoutParams5);
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f37005k.getLayoutParams();
        marginLayoutParams6.topMargin = (int) (marginLayoutParams6.topMargin * this.f37008n);
        this.f37005k.setLayoutParams(marginLayoutParams6);
    }

    /* JADX INFO: renamed from: c */
    public void m56250c(Act act, wx80 wx80Var) {
        m56251d(act, wx80Var, true, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public void m56251d(Act act, wx80 wx80Var, boolean z, int i, int i2) {
        if (this.f37006l || this.f37007m) {
            m56249b();
        }
        if (wx80Var.m205960l() == Privilege.vip_letter_gp) {
            this.f36997c.removeAllViews();
            PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.m163037a(getContext()).inflate(m6c0.f131498K0, (ViewGroup) this.f36997c, false);
            privilegeLetterView.m54261b();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f36997c.addView(privilegeLetterView, layoutParams);
        } else if (wx80Var.m205960l() == Privilege.see_letter_gp) {
            this.f36997c.removeAllViews();
            PrivilegeSeeLetterView privilegeSeeLetterView = (PrivilegeSeeLetterView) o7r.m163037a(getContext()).inflate(m6c0.f131514O0, (ViewGroup) this.f36997c, false);
            privilegeSeeLetterView.m54277b();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f36997c.addView(privilegeSeeLetterView, layoutParams2);
        } else if (!TextUtils.isEmpty(wx80Var.m205959k())) {
            this.f36997c.setVisibility(0);
            this.f37000f.setVisibility(8);
            this.f37001g.setVisibility(8);
            this.f36998d.setVisibility(0);
            this.f36998d.setImageUrl(wx80Var.m205959k());
        } else if (wx80Var.m205952f() != 0 && wx80Var.m205950e() != 0) {
            this.f36997c.setVisibility(0);
            this.f36998d.setVisibility(8);
            this.f37000f.setVisibility(0);
            this.f37000f.setButtonColorStart(act.color(wx80Var.m205952f()));
            this.f37000f.setButtonColorEnd(act.color(wx80Var.m205950e()));
            int iM205946c = wx80Var.m205946c();
            ImageView imageView = this.f37001g;
            if (iM205946c != 0) {
                imageView.setVisibility(0);
                this.f37001g.setImageDrawable(act.drawable(wx80Var.m205946c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (wx80Var.m205958j() != 0) {
            if (wx80Var.m205958j() == d3c0.f83924fc || wx80Var.m205958j() == d3c0.f83827Yb) {
                this.f36998d.setPadding(0, t100.m186890d(8.0f), 0, t100.m186890d(8.0f));
                this.f37000f.setVisibility(8);
                this.f36998d.setVisibility(0);
                qib0.f154691G.m102354Y0(this.f36998d, wx80Var.m205958j());
            } else {
                this.f37000f.setVisibility(8);
                this.f36998d.setVisibility(0);
                qib0.f154691G.m102354Y0(this.f36998d, wx80Var.m205958j());
            }
            int iM205946c2 = wx80Var.m205946c();
            ImageView imageView2 = this.f37001g;
            if (iM205946c2 != 0) {
                imageView2.setVisibility(0);
                this.f37001g.setImageDrawable(act.drawable(wx80Var.m205946c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f36997c.setVisibility(8);
        }
        String strValueOf = (wx80Var.m205960l() != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) ? String.valueOf(wx80Var.m205968t()) : getResources().getString(R$string.f27398b9, 5);
        boolean zIsEmpty = TextUtils.isEmpty(strValueOf);
        VText vText = this.f37004j;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(strValueOf);
            this.f37004j.setVisibility(0);
        }
        CharSequence charSequenceM205948d = wx80Var.m205948d();
        if (TextUtils.isEmpty(charSequenceM205948d) || !wx80Var.m205967s()) {
            this.f37005k.setVisibility(8);
        } else {
            this.f37005k.setText(charSequenceM205948d);
            this.f37005k.setVisibility(0);
        }
        int iM205957i = wx80Var.m205957i();
        VImage vImage = this.f36999e;
        if (iM205957i != 0) {
            vImage.setVisibility(0);
            this.f36999e.setImageResource(wx80Var.m205957i());
        } else {
            vImage.setVisibility(8);
        }
        int iM205961m = wx80Var.m205961m();
        ImageView imageView3 = this.f37003i;
        if (iM205961m != 0) {
            imageView3.setVisibility(0);
            this.f37003i.setImageResource(wx80Var.m205961m());
        } else {
            imageView3.setVisibility(8);
        }
        List<String> listM205942a = wx80Var.m205942a();
        if (vwb.m200296J(listM205942a) || listM205942a.size() != 3) {
            return;
        }
        xdl0.m208344M(this.f37002h, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(z4c0.f201503W0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(z4c0.f201505X0);
        AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) findViewById(z4c0.f201507Y0);
        autoVDraweeView.setImageUrl(listM205942a.get(0));
        qib0.f154691G.m102336O(autoVDraweeView2, listM205942a.get(1), 3, 18);
        qib0.f154691G.m102336O(autoVDraweeView3, listM205942a.get(2), 3, 18);
        int color = Color.parseColor("#9affffff");
        Drawable drawableMo112055b = autoVDraweeView2.getHierarchy().mo112055b();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawableMo112055b.setColorFilter(color, mode);
        autoVDraweeView3.getHierarchy().mo112055b().setColorFilter(color, mode);
        int iM205956h = wx80Var.m205956h();
        if (iM205956h != 0) {
            ((VImage) findViewById(z4c0.f201504X)).setImageResource(iM205956h);
        } else {
            findViewById(z4c0.f201504X).setVisibility(8);
        }
        this.f36997c.setVisibility(8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56248a(this);
    }

    public VipIntroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37006l = hmb.m131712q1();
        this.f37007m = hmb.m131711p1();
        this.f37008n = this.f37006l ? 0.7f : 0.9f;
    }

    public VipIntroPage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37006l = hmb.m131712q1();
        this.f37007m = hmb.m131711p1();
        this.f37008n = this.f37006l ? 0.7f : 0.9f;
    }
}
