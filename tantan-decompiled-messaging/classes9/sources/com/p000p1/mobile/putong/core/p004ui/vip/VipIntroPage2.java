package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.biq;
import l.d3c0;
import l.hmb;
import l.mhl0;
import l.n3b0;
import l.nu0;
import l.sb90;
import l.t100;
import l.xdl0;
import l.z4c0;
import l.zz6;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f6790a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6791b;

    /* JADX INFO: renamed from: c */
    public ViewStub f6792c;

    /* JADX INFO: renamed from: d */
    public ViewStub f6793d;

    /* JADX INFO: renamed from: e */
    public ViewStub f6794e;

    /* JADX INFO: renamed from: f */
    public ViewStub f6795f;

    /* JADX INFO: renamed from: g */
    public ViewStub f6796g;

    /* JADX INFO: renamed from: h */
    public ViewStub f6797h;

    /* JADX INFO: renamed from: i */
    public ViewStub f6798i;

    /* JADX INFO: renamed from: j */
    public VText f6799j;

    /* JADX INFO: renamed from: k */
    public VText f6800k;

    /* JADX INFO: renamed from: l */
    public boolean f6801l;

    /* JADX INFO: renamed from: m */
    public boolean f6802m;

    /* JADX INFO: renamed from: n */
    public float f6803n;

    /* JADX INFO: renamed from: o */
    public wx80 f6804o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage2$a */
    public static /* synthetic */ class C0380a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6805a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f6805a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6805a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6805a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6805a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6805a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6805a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6805a[Privilege.privacy_membership.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6805a[Privilege.advanced_filter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6805a[Privilege.recover_unmatches.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6805a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public VipIntroPage2(Context context) {
        super(context);
        this.f6801l = hmb.q1();
        this.f6802m = hmb.p1();
        this.f6803n = this.f6801l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9686a(View view) {
        mhl0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9687b(wx80 wx80Var) {
        this.f6804o = wx80Var;
        if (wx80Var.m26841l() == null) {
            this.f6790a.setText(wx80Var.m26849t());
            boolean z = this.f6801l;
            if (z || this.f6802m) {
                this.f6790a.setTextSize(z ? 14.0f : 16.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6799j.getLayoutParams();
                marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f6803n), 0, 0);
            }
            if (wx80Var.m26839j() > 0) {
                xdl0.M(this.f6791b, true);
                SimpleDraweeView simpleDraweeView = (VDraweeView) findViewById(z4c0.a0);
                if (this.f6801l || this.f6802m) {
                    ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f6803n);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f6791b.getLayoutParams();
                    layoutParams3.topMargin = (int) (layoutParams3.topMargin * this.f6803n);
                }
                qib0.f19782G.m12767Y0(simpleDraweeView, wx80Var.m26839j());
            }
        } else {
            m9690e(wx80Var);
            m9691f(wx80Var);
        }
        m9688c(wx80Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m9688c(wx80 wx80Var) {
        if (this.f6801l || this.f6802m) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6800k.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f6803n), 0, 0);
            this.f6800k.setLayoutParams(marginLayoutParams);
            this.f6800k.setTextSize(this.f6801l ? 11.0f : 12.0f);
        }
        xdl0.M(this.f6800k, true);
        this.f6800k.setText(wx80Var.m26829d());
    }

    /* JADX INFO: renamed from: d */
    public final void m9689d() {
        xdl0.M(this.f6797h, true);
        SimpleDraweeView simpleDraweeView = (AutoVDraweeView) findViewById(z4c0.e0);
        AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.W);
        FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.P);
        LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.q0);
        TextView textView = (TextView) findViewById(z4c0.S0);
        TextView textView2 = (TextView) findViewById(z4c0.U0);
        TextView textView3 = (TextView) findViewById(z4c0.T0);
        TextView textView4 = (TextView) findViewById(z4c0.V0);
        boolean z = this.f6801l;
        if (z || this.f6802m) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f6801l ? 11.0f : 12.0f);
            xdl0.u0(textView, this.f6803n);
            xdl0.u0(textView3, this.f6803n);
            xdl0.u0(textView2, this.f6803n);
            xdl0.u0(textView4, this.f6803n);
            ViewGroup.LayoutParams layoutParams = this.f6797h.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f6803n);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6797h.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f6803n);
            ViewGroup.LayoutParams layoutParams3 = simpleDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f6803n);
            ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f6803n);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f6803n);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f6803n);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f6803n);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f6803n);
        }
        if (NullChecker.a(n3b0.j())) {
            if (sb90.c(n3b0.j())) {
                simpleDraweeView.y(((Media) n3b0.j().fp()).url, new biq(4, 15));
            } else {
                simpleDraweeView.setImageUrl(((Media) n3b0.j().fp()).url);
            }
        } else if (zz6.u0()) {
            qib0.f19782G.m12767Y0(simpleDraweeView, d3c0.Vb);
        } else {
            qib0.f19782G.m12767Y0(simpleDraweeView, d3c0.wc);
        }
        autoVDraweeViewFindViewById.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().picture(0)).url);
        if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            textView3.setText("相信星座么？");
            textView4.setText("会做饭么？");
            textView2.setText("喜欢猫么？");
            textView.setText("遇见你很开心");
            return;
        }
        textView3.setText("你真可爱");
        textView4.setText("遇见你很开心");
        textView2.setText("好喜欢你~");
        textView.setText("你的眼睛真好看");
    }

    /* JADX INFO: renamed from: e */
    public final void m9690e(wx80 wx80Var) {
        boolean z = this.f6801l;
        if (z || this.f6802m) {
            this.f6790a.setTextSize(z ? 14.0f : 15.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6799j.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f6803n), 0, 0);
            this.f6799j.setLayoutParams(marginLayoutParams);
            this.f6799j.setTextSize(this.f6801l ? 16.0f : 17.0f);
        }
        xdl0.M(this.f6790a, true);
        xdl0.M(this.f6799j, false);
        if (xdl0.O0(this.f6799j)) {
            this.f6799j.setText(wx80Var.m26849t());
        }
        int i = C0380a.f6805a[wx80Var.m26841l().ordinal()];
        if (i == 1) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || CoreModule.f1534c.f3628e0.m21490p9().isVIPExpired()) {
                this.f6790a.setText(getResources().getString(R.string.r9));
                return;
            } else {
                this.f6790a.setText(getResources().getString(R.string.p9));
                return;
            }
        }
        if (i != 2) {
            this.f6790a.setText(wx80Var.m26849t());
            return;
        }
        boolean zM5671Oi = ura.m25555e().m25559d().m5671Oi();
        VText vText = this.f6790a;
        if (zM5671Oi) {
            vText.setText(wx80Var.m26849t());
        } else {
            vText.setText(getResources().getString(R.string.b9, 5));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9691f(wx80 wx80Var) {
        switch (C0380a.f6805a[wx80Var.m26841l().ordinal()]) {
            case 1:
                ViewStub viewStub = this.f6792c;
                xdl0.M(viewStub, true);
                AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.d);
                VText vTextFindViewById = findViewById(z4c0.l1);
                VImage vImageFindViewById = findViewById(z4c0.Z);
                vImageFindViewById.setImageResource(CoreModule.m1854P().m11709e().m6925ul());
                Drawable drawableB = nu0.b(getContext(), CoreModule.m1854P().m11709e().m6916cc());
                drawableB.setBounds(0, 0, drawableB.getMinimumWidth(), drawableB.getMinimumHeight());
                vTextFindViewById.setCompoundDrawables((Drawable) null, (Drawable) null, drawableB, (Drawable) null);
                boolean z = this.f6801l;
                if (z || this.f6802m) {
                    vTextFindViewById.setTextSize(z ? 14.0f : 16.0f);
                    FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.b1);
                    FrameLayout frameLayout2 = (FrameLayout) findViewById(z4c0.f);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams3 = autoVDraweeViewFindViewById.getLayoutParams();
                    float f = layoutParams3.width;
                    float f2 = this.f6803n;
                    layoutParams3.width = (int) (f * f2);
                    layoutParams3.height = (int) (layoutParams3.height * f2);
                    autoVDraweeViewFindViewById.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                    float f3 = layoutParams4.width;
                    float f4 = this.f6803n;
                    layoutParams4.width = (int) (f3 * f4);
                    layoutParams4.height = (int) (layoutParams4.height * f4);
                    frameLayout2.setLayoutParams(layoutParams4);
                    xdl0.u0(frameLayout2, this.f6803n);
                    ViewGroup.LayoutParams layoutParams5 = vImageFindViewById.getLayoutParams();
                    layoutParams5.width = (int) (layoutParams5.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams6 = vImageFindViewById.getLayoutParams();
                    layoutParams6.height = (int) (layoutParams6.height * this.f6803n);
                    RoundingParams roundingParamsP = autoVDraweeViewFindViewById.getHierarchy().p();
                    roundingParamsP.q(t100.d(2.0f));
                    autoVDraweeViewFindViewById.getHierarchy().H(roundingParamsP);
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) viewStub.getLayoutParams();
                    layoutParams7.topMargin = (int) (layoutParams7.topMargin * this.f6803n);
                }
                User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
                autoVDraweeViewFindViewById.setImageUrl(((Media) userM21490p9.fp()).url);
                vTextFindViewById.setText(userM21490p9.name);
                break;
            case 2:
                ViewStub viewStub2 = this.f6793d;
                xdl0.M(viewStub2, true);
                AutoVDraweeView autoVDraweeViewFindViewById2 = findViewById(z4c0.g);
                SimpleDraweeView simpleDraweeView = (AutoVDraweeView) findViewById(z4c0.i);
                ImageView imageView = (ImageView) findViewById(z4c0.Z);
                autoVDraweeViewFindViewById2.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
                if (!NullChecker.a(n3b0.j())) {
                    qib0.f19782G.m12767Y0(simpleDraweeView, zz6.u0() ? d3c0.xc : d3c0.wc);
                } else if (sb90.c(n3b0.j())) {
                    simpleDraweeView.y(((Media) n3b0.j().fp()).url, new biq(4, 15));
                } else {
                    simpleDraweeView.setImageUrl(((Media) n3b0.j().fp()).url);
                }
                if (this.f6801l || this.f6802m) {
                    ViewGroup.LayoutParams layoutParams8 = viewStub2.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f6803n);
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) viewStub2.getLayoutParams();
                    layoutParams9.topMargin = (int) (layoutParams9.topMargin * this.f6803n);
                    ViewGroup.LayoutParams layoutParams10 = autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams10.width = (int) (layoutParams10.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams11 = autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams11.height = (int) (layoutParams11.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams12 = simpleDraweeView.getLayoutParams();
                    layoutParams12.width = (int) (layoutParams12.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams13 = simpleDraweeView.getLayoutParams();
                    layoutParams13.height = (int) (layoutParams13.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams14 = imageView.getLayoutParams();
                    layoutParams14.width = (int) (layoutParams14.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams15 = imageView.getLayoutParams();
                    layoutParams15.height = (int) (layoutParams15.height * this.f6803n);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams16.leftMargin = (int) (layoutParams16.leftMargin * this.f6803n);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) simpleDraweeView.getLayoutParams();
                    layoutParams17.rightMargin = (int) (layoutParams17.rightMargin * this.f6803n);
                    FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f5 = layoutParams18.topMargin;
                    float f6 = this.f6803n;
                    layoutParams18.topMargin = (int) (f5 * f6);
                    xdl0.u0(autoVDraweeViewFindViewById2, f6);
                    xdl0.u0(simpleDraweeView, this.f6803n);
                    RoundingParams roundingParamsP2 = autoVDraweeViewFindViewById2.getHierarchy().p();
                    roundingParamsP2.q(roundingParamsP2.e() * this.f6803n);
                    autoVDraweeViewFindViewById2.getHierarchy().H(roundingParamsP2);
                    RoundingParams roundingParamsP3 = simpleDraweeView.getHierarchy().p();
                    roundingParamsP3.q(roundingParamsP3.e() * this.f6803n);
                    simpleDraweeView.getHierarchy().H(roundingParamsP3);
                }
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                ViewStub viewStub3 = this.f6794e;
                xdl0.M(viewStub3, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(z4c0.s);
                VImage vImageFindViewById2 = findViewById(z4c0.i1);
                AutoVDraweeView autoVDraweeViewFindViewById3 = findViewById(z4c0.g);
                SimpleDraweeView simpleDraweeView2 = (AutoVDraweeView) findViewById(z4c0.i);
                VImage vImageFindViewById3 = findViewById(z4c0.Z);
                if (NullChecker.a(n3b0.m())) {
                    xdl0.M(frameLayout3, true);
                    xdl0.M(vImageFindViewById2, false);
                    autoVDraweeViewFindViewById3.setImageUrl(((Media) n3b0.m().fp()).url);
                    qib0.f19782G.m12767Y0(simpleDraweeView2, zz6.u0() ? d3c0.zc : d3c0.yc);
                } else {
                    xdl0.M(frameLayout3, false);
                    xdl0.M(vImageFindViewById2, true);
                    vImageFindViewById2.setImageResource(zz6.u0() ? d3c0.Cc : d3c0.Ac);
                }
                if (this.f6801l || this.f6802m) {
                    LinearLayout.LayoutParams layoutParams19 = (LinearLayout.LayoutParams) viewStub3.getLayoutParams();
                    layoutParams19.topMargin = (int) (layoutParams19.topMargin * this.f6803n);
                    ViewGroup.LayoutParams layoutParams20 = viewStub3.getLayoutParams();
                    float f7 = layoutParams20.height;
                    float f8 = this.f6803n;
                    layoutParams20.height = (int) (f7 * f8);
                    xdl0.u0(frameLayout3, f8);
                    ViewGroup.LayoutParams layoutParams21 = autoVDraweeViewFindViewById3.getLayoutParams();
                    layoutParams21.width = (int) (layoutParams21.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams22 = autoVDraweeViewFindViewById3.getLayoutParams();
                    layoutParams22.height = (int) (layoutParams22.height * this.f6803n);
                    FrameLayout.LayoutParams layoutParams23 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById3.getLayoutParams();
                    float f9 = layoutParams23.leftMargin;
                    float f10 = this.f6803n;
                    layoutParams23.leftMargin = (int) (f9 * f10);
                    xdl0.u0(autoVDraweeViewFindViewById3, f10);
                    ViewGroup.LayoutParams layoutParams24 = simpleDraweeView2.getLayoutParams();
                    layoutParams24.width = (int) (layoutParams24.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams25 = simpleDraweeView2.getLayoutParams();
                    layoutParams25.height = (int) (layoutParams25.height * this.f6803n);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) simpleDraweeView2.getLayoutParams();
                    float f11 = layoutParams26.rightMargin;
                    float f12 = this.f6803n;
                    layoutParams26.rightMargin = (int) (f11 * f12);
                    xdl0.u0(simpleDraweeView2, f12);
                    ViewGroup.LayoutParams layoutParams27 = vImageFindViewById3.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams28 = vImageFindViewById3.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f6803n);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) vImageFindViewById3.getLayoutParams();
                    layoutParams29.topMargin = (int) (layoutParams29.topMargin * this.f6803n);
                    ViewGroup.LayoutParams layoutParams30 = vImageFindViewById2.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams31 = vImageFindViewById2.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f6803n);
                }
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                xdl0.M(this.f6795f, true);
                if (this.f6801l || this.f6802m) {
                    VImage vImageFindViewById4 = findViewById(z4c0.Z);
                    ViewGroup.LayoutParams layoutParams32 = vImageFindViewById4.getLayoutParams();
                    layoutParams32.width = (int) (layoutParams32.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams33 = vImageFindViewById4.getLayoutParams();
                    layoutParams33.height = (int) (layoutParams33.height * this.f6803n);
                    LinearLayout.LayoutParams layoutParams34 = (LinearLayout.LayoutParams) this.f6795f.getLayoutParams();
                    layoutParams34.topMargin = (int) (layoutParams34.topMargin * this.f6803n);
                }
                break;
            case 5:
                ViewStub viewStub4 = this.f6796g;
                xdl0.M(viewStub4, true);
                FrameLayout frameLayout4 = (FrameLayout) findViewById(z4c0.s);
                VImage vImageFindViewById5 = findViewById(z4c0.i1);
                SimpleDraweeView simpleDraweeView3 = (AutoVDraweeView) findViewById(z4c0.g);
                AutoVDraweeView autoVDraweeViewFindViewById4 = findViewById(z4c0.i);
                if (NullChecker.a(n3b0.n())) {
                    xdl0.M(frameLayout4, true);
                    xdl0.M(vImageFindViewById5, false);
                    qib0.f19782G.m12767Y0(simpleDraweeView3, zz6.u0() ? d3c0.zc : d3c0.yc);
                    autoVDraweeViewFindViewById4.setImageUrl(((Media) n3b0.n().fp()).url);
                } else {
                    xdl0.M(frameLayout4, false);
                    xdl0.M(vImageFindViewById5, true);
                    vImageFindViewById5.setImageResource(zz6.u0() ? d3c0.Gc : d3c0.Dc);
                }
                if (this.f6801l || this.f6802m) {
                    ViewGroup.LayoutParams layoutParams35 = viewStub4.getLayoutParams();
                    layoutParams35.height = (int) (layoutParams35.height * this.f6803n);
                    LinearLayout.LayoutParams layoutParams36 = (LinearLayout.LayoutParams) viewStub4.getLayoutParams();
                    layoutParams36.topMargin = (int) (layoutParams36.topMargin * this.f6803n);
                    ViewGroup.LayoutParams layoutParams37 = frameLayout4.getLayoutParams();
                    layoutParams37.width = (int) (layoutParams37.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams38 = vImageFindViewById5.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams39 = vImageFindViewById5.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams40 = simpleDraweeView3.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams41 = simpleDraweeView3.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams42 = autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams43 = autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f6803n);
                    VImage vImageFindViewById6 = findViewById(z4c0.Z);
                    ViewGroup.LayoutParams layoutParams44 = vImageFindViewById6.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams45 = vImageFindViewById6.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f6803n);
                    FrameLayout.LayoutParams layoutParams46 = (FrameLayout.LayoutParams) simpleDraweeView3.getLayoutParams();
                    layoutParams46.leftMargin = (int) (layoutParams46.leftMargin * this.f6803n);
                    FrameLayout.LayoutParams layoutParams47 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams47.rightMargin = (int) (layoutParams47.rightMargin * this.f6803n);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) vImageFindViewById6.getLayoutParams();
                    float f13 = layoutParams48.topMargin;
                    float f14 = this.f6803n;
                    layoutParams48.topMargin = (int) (f13 * f14);
                    xdl0.u0(frameLayout4, f14);
                    xdl0.u0(simpleDraweeView3, this.f6803n);
                    xdl0.u0(autoVDraweeViewFindViewById4, this.f6803n);
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                xdl0.M(this.f6798i, true);
                Privilege privilegeM26841l = wx80Var.m26841l();
                VImage vImageFindViewById7 = findViewById(z4c0.Z);
                if (privilegeM26841l == Privilege.advanced_filter) {
                    vImageFindViewById7.setImageResource(d3c0.dc);
                } else if (privilegeM26841l == Privilege.message_read_state) {
                    vImageFindViewById7.setImageResource(d3c0.gc);
                } else if (privilegeM26841l == Privilege.privacy_membership) {
                    vImageFindViewById7.setImageResource(zz6.u0() ? d3c0.B8 : d3c0.A8);
                } else if (privilegeM26841l == Privilege.recover_unmatches) {
                    vImageFindViewById7.setImageResource(zz6.u0() ? d3c0.ic : d3c0.hc);
                }
                if (this.f6801l || this.f6802m) {
                    ViewGroup.LayoutParams layoutParams49 = vImageFindViewById7.getLayoutParams();
                    layoutParams49.width = (int) (layoutParams49.width * this.f6803n);
                    ViewGroup.LayoutParams layoutParams50 = vImageFindViewById7.getLayoutParams();
                    layoutParams50.height = (int) (layoutParams50.height * this.f6803n);
                    ViewGroup.LayoutParams layoutParams51 = this.f6798i.getLayoutParams();
                    layoutParams51.height = (int) (layoutParams51.height * this.f6803n);
                    LinearLayout.LayoutParams layoutParams52 = (LinearLayout.LayoutParams) this.f6798i.getLayoutParams();
                    layoutParams52.topMargin = (int) (layoutParams52.topMargin * this.f6803n);
                }
                break;
            case 10:
                m9689d();
                break;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9686a(this);
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6801l = hmb.q1();
        this.f6802m = hmb.p1();
        this.f6803n = this.f6801l ? 0.7f : 0.9f;
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6801l = hmb.q1();
        this.f6802m = hmb.p1();
        this.f6803n = this.f6801l ? 0.7f : 0.9f;
    }
}
