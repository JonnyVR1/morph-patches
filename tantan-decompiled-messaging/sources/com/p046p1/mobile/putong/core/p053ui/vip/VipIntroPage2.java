package com.p046p1.mobile.putong.core.p053ui.vip;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.biq;
import p149l.d3c0;
import p149l.hmb;
import p149l.mhl0;
import p149l.n3b0;
import p149l.nu0;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.ura;
import p149l.wx80;
import p149l.xdl0;
import p149l.z4c0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class VipIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37009a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37010b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37011c;

    /* JADX INFO: renamed from: d */
    public ViewStub f37012d;

    /* JADX INFO: renamed from: e */
    public ViewStub f37013e;

    /* JADX INFO: renamed from: f */
    public ViewStub f37014f;

    /* JADX INFO: renamed from: g */
    public ViewStub f37015g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37016h;

    /* JADX INFO: renamed from: i */
    public ViewStub f37017i;

    /* JADX INFO: renamed from: j */
    public VText f37018j;

    /* JADX INFO: renamed from: k */
    public VText f37019k;

    /* JADX INFO: renamed from: l */
    public boolean f37020l;

    /* JADX INFO: renamed from: m */
    public boolean f37021m;

    /* JADX INFO: renamed from: n */
    public float f37022n;

    /* JADX INFO: renamed from: o */
    public wx80 f37023o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage2$a */
    public static /* synthetic */ class C8944a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37024a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37024a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37024a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37024a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37024a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37024a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37024a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37024a[Privilege.privacy_membership.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37024a[Privilege.advanced_filter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37024a[Privilege.recover_unmatches.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37024a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public VipIntroPage2(Context context) {
        super(context);
        this.f37020l = hmb.m131712q1();
        this.f37021m = hmb.m131711p1();
        this.f37022n = this.f37020l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m56252a(View view) {
        mhl0.m154630a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56253b(wx80 wx80Var) {
        this.f37023o = wx80Var;
        if (wx80Var.m205960l() == null) {
            this.f37009a.setText(wx80Var.m205968t());
            boolean z = this.f37020l;
            if (z || this.f37021m) {
                this.f37009a.setTextSize(z ? 14.0f : 16.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37018j.getLayoutParams();
                marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37022n), 0, 0);
            }
            if (wx80Var.m205958j() > 0) {
                xdl0.m208344M(this.f37010b, true);
                VDraweeView vDraweeView = (VDraweeView) findViewById(z4c0.f201511a0);
                if (this.f37020l || this.f37021m) {
                    ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f37022n);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f37010b.getLayoutParams();
                    layoutParams3.topMargin = (int) (layoutParams3.topMargin * this.f37022n);
                }
                qib0.f154691G.m102354Y0(vDraweeView, wx80Var.m205958j());
            }
        } else {
            m56256e(wx80Var);
            m56257f(wx80Var);
        }
        m56254c(wx80Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m56254c(wx80 wx80Var) {
        if (this.f37020l || this.f37021m) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37019k.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37022n), 0, 0);
            this.f37019k.setLayoutParams(marginLayoutParams);
            this.f37019k.setTextSize(this.f37020l ? 11.0f : 12.0f);
        }
        xdl0.m208344M(this.f37019k, true);
        this.f37019k.setText(wx80Var.m205948d());
    }

    /* JADX INFO: renamed from: d */
    public final void m56255d() {
        xdl0.m208344M(this.f37016h, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(z4c0.f201523e0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(z4c0.f201502W);
        FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.f201488P);
        LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.f201559q0);
        TextView textView = (TextView) findViewById(z4c0.f201495S0);
        TextView textView2 = (TextView) findViewById(z4c0.f201499U0);
        TextView textView3 = (TextView) findViewById(z4c0.f201497T0);
        TextView textView4 = (TextView) findViewById(z4c0.f201501V0);
        boolean z = this.f37020l;
        if (z || this.f37021m) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f37020l ? 11.0f : 12.0f);
            xdl0.m208404u0(textView, this.f37022n);
            xdl0.m208404u0(textView3, this.f37022n);
            xdl0.m208404u0(textView2, this.f37022n);
            xdl0.m208404u0(textView4, this.f37022n);
            ViewGroup.LayoutParams layoutParams = this.f37016h.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37022n);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37016h.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f37022n);
            ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f37022n);
            ViewGroup.LayoutParams layoutParams4 = autoVDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f37022n);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f37022n);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f37022n);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37022n);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f37022n);
        }
        if (NullChecker.m81303a(n3b0.m157735j())) {
            if (sb90.m183207c(n3b0.m157735j())) {
                autoVDraweeView.m222888y(n3b0.m157735j().m60124fp().url, new biq(4, 15));
            } else {
                autoVDraweeView.setImageUrl(n3b0.m157735j().m60124fp().url);
            }
        } else if (zz6.m221004u0()) {
            qib0.f154691G.m102354Y0(autoVDraweeView, d3c0.f83788Vb);
        } else {
            qib0.f154691G.m102354Y0(autoVDraweeView, d3c0.f84162wc);
        }
        autoVDraweeView2.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().picture(0).url);
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
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
    public final void m56256e(wx80 wx80Var) {
        boolean z = this.f37020l;
        if (z || this.f37021m) {
            this.f37009a.setTextSize(z ? 14.0f : 15.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37018j.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37022n), 0, 0);
            this.f37018j.setLayoutParams(marginLayoutParams);
            this.f37018j.setTextSize(this.f37020l ? 16.0f : 17.0f);
        }
        xdl0.m208344M(this.f37009a, true);
        xdl0.m208344M(this.f37018j, false);
        if (xdl0.m208349O0(this.f37018j)) {
            this.f37018j.setText(wx80Var.m205968t());
        }
        int i = C8944a.f37024a[wx80Var.m205960l().ordinal()];
        if (i == 1) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired()) {
                this.f37009a.setText(getResources().getString(R$string.f27589r9));
                return;
            } else {
                this.f37009a.setText(getResources().getString(R$string.f27566p9));
                return;
            }
        }
        if (i != 2) {
            this.f37009a.setText(wx80Var.m205968t());
            return;
        }
        boolean zMo33734Oi = ura.m195053e().m195057d().mo33734Oi();
        VText vText = this.f37009a;
        if (zMo33734Oi) {
            vText.setText(wx80Var.m205968t());
        } else {
            vText.setText(getResources().getString(R$string.f27398b9, 5));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56257f(wx80 wx80Var) {
        switch (C8944a.f37024a[wx80Var.m205960l().ordinal()]) {
            case 1:
                ViewStub viewStub = this.f37011c;
                xdl0.m208344M(viewStub, true);
                AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(z4c0.f201519d);
                VText vText = (VText) findViewById(z4c0.f201545l1);
                VImage vImage = (VImage) findViewById(z4c0.f201508Z);
                vImage.setImageResource(CoreModule.m29935P().m94654e().mo34988ul());
                Drawable drawableM161424b = nu0.m161424b(getContext(), CoreModule.m29935P().m94654e().mo34979cc());
                drawableM161424b.setBounds(0, 0, drawableM161424b.getMinimumWidth(), drawableM161424b.getMinimumHeight());
                vText.setCompoundDrawables(null, null, drawableM161424b, null);
                boolean z = this.f37020l;
                if (z || this.f37021m) {
                    vText.setTextSize(z ? 14.0f : 16.0f);
                    FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.f201515b1);
                    FrameLayout frameLayout2 = (FrameLayout) findViewById(z4c0.f201525f);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
                    float f = layoutParams3.width;
                    float f2 = this.f37022n;
                    layoutParams3.width = (int) (f * f2);
                    layoutParams3.height = (int) (layoutParams3.height * f2);
                    autoVDraweeView.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                    float f3 = layoutParams4.width;
                    float f4 = this.f37022n;
                    layoutParams4.width = (int) (f3 * f4);
                    layoutParams4.height = (int) (layoutParams4.height * f4);
                    frameLayout2.setLayoutParams(layoutParams4);
                    xdl0.m208404u0(frameLayout2, this.f37022n);
                    ViewGroup.LayoutParams layoutParams5 = vImage.getLayoutParams();
                    layoutParams5.width = (int) (layoutParams5.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams6 = vImage.getLayoutParams();
                    layoutParams6.height = (int) (layoutParams6.height * this.f37022n);
                    RoundingParams roundingParamsM112069p = autoVDraweeView.getHierarchy().m112069p();
                    roundingParamsM112069p.m8263q(t100.m186890d(2.0f));
                    autoVDraweeView.getHierarchy().m112053H(roundingParamsM112069p);
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) viewStub.getLayoutParams();
                    layoutParams7.topMargin = (int) (layoutParams7.topMargin * this.f37022n);
                }
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                autoVDraweeView.setImageUrl(userM169527p9.m60124fp().url);
                vText.setText(userM169527p9.name);
                break;
            case 2:
                ViewStub viewStub2 = this.f37012d;
                xdl0.m208344M(viewStub2, true);
                AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(z4c0.f201528g);
                AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) findViewById(z4c0.f201534i);
                ImageView imageView = (ImageView) findViewById(z4c0.f201508Z);
                autoVDraweeView2.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
                if (!NullChecker.m81303a(n3b0.m157735j())) {
                    qib0.f154691G.m102354Y0(autoVDraweeView3, zz6.m221004u0() ? d3c0.f84176xc : d3c0.f84162wc);
                } else if (sb90.m183207c(n3b0.m157735j())) {
                    autoVDraweeView3.m222888y(n3b0.m157735j().m60124fp().url, new biq(4, 15));
                } else {
                    autoVDraweeView3.setImageUrl(n3b0.m157735j().m60124fp().url);
                }
                if (this.f37020l || this.f37021m) {
                    ViewGroup.LayoutParams layoutParams8 = viewStub2.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f37022n);
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) viewStub2.getLayoutParams();
                    layoutParams9.topMargin = (int) (layoutParams9.topMargin * this.f37022n);
                    ViewGroup.LayoutParams layoutParams10 = autoVDraweeView2.getLayoutParams();
                    layoutParams10.width = (int) (layoutParams10.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams11 = autoVDraweeView2.getLayoutParams();
                    layoutParams11.height = (int) (layoutParams11.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams12 = autoVDraweeView3.getLayoutParams();
                    layoutParams12.width = (int) (layoutParams12.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams13 = autoVDraweeView3.getLayoutParams();
                    layoutParams13.height = (int) (layoutParams13.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams14 = imageView.getLayoutParams();
                    layoutParams14.width = (int) (layoutParams14.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams15 = imageView.getLayoutParams();
                    layoutParams15.height = (int) (layoutParams15.height * this.f37022n);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) autoVDraweeView2.getLayoutParams();
                    layoutParams16.leftMargin = (int) (layoutParams16.leftMargin * this.f37022n);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) autoVDraweeView3.getLayoutParams();
                    layoutParams17.rightMargin = (int) (layoutParams17.rightMargin * this.f37022n);
                    FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f5 = layoutParams18.topMargin;
                    float f6 = this.f37022n;
                    layoutParams18.topMargin = (int) (f5 * f6);
                    xdl0.m208404u0(autoVDraweeView2, f6);
                    xdl0.m208404u0(autoVDraweeView3, this.f37022n);
                    RoundingParams roundingParamsM112069p2 = autoVDraweeView2.getHierarchy().m112069p();
                    roundingParamsM112069p2.m8263q(roundingParamsM112069p2.m8251e() * this.f37022n);
                    autoVDraweeView2.getHierarchy().m112053H(roundingParamsM112069p2);
                    RoundingParams roundingParamsM112069p3 = autoVDraweeView3.getHierarchy().m112069p();
                    roundingParamsM112069p3.m8263q(roundingParamsM112069p3.m8251e() * this.f37022n);
                    autoVDraweeView3.getHierarchy().m112053H(roundingParamsM112069p3);
                }
                break;
            case 3:
                ViewStub viewStub3 = this.f37013e;
                xdl0.m208344M(viewStub3, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(z4c0.f201562s);
                VImage vImage2 = (VImage) findViewById(z4c0.f201536i1);
                AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) findViewById(z4c0.f201528g);
                AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) findViewById(z4c0.f201534i);
                VImage vImage3 = (VImage) findViewById(z4c0.f201508Z);
                if (NullChecker.m81303a(n3b0.m157738m())) {
                    xdl0.m208344M(frameLayout3, true);
                    xdl0.m208344M(vImage2, false);
                    autoVDraweeView4.setImageUrl(n3b0.m157738m().m60124fp().url);
                    qib0.f154691G.m102354Y0(autoVDraweeView5, zz6.m221004u0() ? d3c0.f84204zc : d3c0.f84190yc);
                } else {
                    xdl0.m208344M(frameLayout3, false);
                    xdl0.m208344M(vImage2, true);
                    vImage2.setImageResource(zz6.m221004u0() ? d3c0.f83528Cc : d3c0.f83500Ac);
                }
                if (this.f37020l || this.f37021m) {
                    LinearLayout.LayoutParams layoutParams19 = (LinearLayout.LayoutParams) viewStub3.getLayoutParams();
                    layoutParams19.topMargin = (int) (layoutParams19.topMargin * this.f37022n);
                    ViewGroup.LayoutParams layoutParams20 = viewStub3.getLayoutParams();
                    float f7 = layoutParams20.height;
                    float f8 = this.f37022n;
                    layoutParams20.height = (int) (f7 * f8);
                    xdl0.m208404u0(frameLayout3, f8);
                    ViewGroup.LayoutParams layoutParams21 = autoVDraweeView4.getLayoutParams();
                    layoutParams21.width = (int) (layoutParams21.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams22 = autoVDraweeView4.getLayoutParams();
                    layoutParams22.height = (int) (layoutParams22.height * this.f37022n);
                    FrameLayout.LayoutParams layoutParams23 = (FrameLayout.LayoutParams) autoVDraweeView4.getLayoutParams();
                    float f9 = layoutParams23.leftMargin;
                    float f10 = this.f37022n;
                    layoutParams23.leftMargin = (int) (f9 * f10);
                    xdl0.m208404u0(autoVDraweeView4, f10);
                    ViewGroup.LayoutParams layoutParams24 = autoVDraweeView5.getLayoutParams();
                    layoutParams24.width = (int) (layoutParams24.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams25 = autoVDraweeView5.getLayoutParams();
                    layoutParams25.height = (int) (layoutParams25.height * this.f37022n);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) autoVDraweeView5.getLayoutParams();
                    float f11 = layoutParams26.rightMargin;
                    float f12 = this.f37022n;
                    layoutParams26.rightMargin = (int) (f11 * f12);
                    xdl0.m208404u0(autoVDraweeView5, f12);
                    ViewGroup.LayoutParams layoutParams27 = vImage3.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams28 = vImage3.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f37022n);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) vImage3.getLayoutParams();
                    layoutParams29.topMargin = (int) (layoutParams29.topMargin * this.f37022n);
                    ViewGroup.LayoutParams layoutParams30 = vImage2.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams31 = vImage2.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f37022n);
                }
                break;
            case 4:
                xdl0.m208344M(this.f37014f, true);
                if (this.f37020l || this.f37021m) {
                    VImage vImage4 = (VImage) findViewById(z4c0.f201508Z);
                    ViewGroup.LayoutParams layoutParams32 = vImage4.getLayoutParams();
                    layoutParams32.width = (int) (layoutParams32.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams33 = vImage4.getLayoutParams();
                    layoutParams33.height = (int) (layoutParams33.height * this.f37022n);
                    LinearLayout.LayoutParams layoutParams34 = (LinearLayout.LayoutParams) this.f37014f.getLayoutParams();
                    layoutParams34.topMargin = (int) (layoutParams34.topMargin * this.f37022n);
                }
                break;
            case 5:
                ViewStub viewStub4 = this.f37015g;
                xdl0.m208344M(viewStub4, true);
                FrameLayout frameLayout4 = (FrameLayout) findViewById(z4c0.f201562s);
                VImage vImage5 = (VImage) findViewById(z4c0.f201536i1);
                AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) findViewById(z4c0.f201528g);
                AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) findViewById(z4c0.f201534i);
                if (NullChecker.m81303a(n3b0.m157739n())) {
                    xdl0.m208344M(frameLayout4, true);
                    xdl0.m208344M(vImage5, false);
                    qib0.f154691G.m102354Y0(autoVDraweeView6, zz6.m221004u0() ? d3c0.f84204zc : d3c0.f84190yc);
                    autoVDraweeView7.setImageUrl(n3b0.m157739n().m60124fp().url);
                } else {
                    xdl0.m208344M(frameLayout4, false);
                    xdl0.m208344M(vImage5, true);
                    vImage5.setImageResource(zz6.m221004u0() ? d3c0.f83584Gc : d3c0.f83542Dc);
                }
                if (this.f37020l || this.f37021m) {
                    ViewGroup.LayoutParams layoutParams35 = viewStub4.getLayoutParams();
                    layoutParams35.height = (int) (layoutParams35.height * this.f37022n);
                    LinearLayout.LayoutParams layoutParams36 = (LinearLayout.LayoutParams) viewStub4.getLayoutParams();
                    layoutParams36.topMargin = (int) (layoutParams36.topMargin * this.f37022n);
                    ViewGroup.LayoutParams layoutParams37 = frameLayout4.getLayoutParams();
                    layoutParams37.width = (int) (layoutParams37.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams38 = vImage5.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams39 = vImage5.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams40 = autoVDraweeView6.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams41 = autoVDraweeView6.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams42 = autoVDraweeView7.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams43 = autoVDraweeView7.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f37022n);
                    VImage vImage6 = (VImage) findViewById(z4c0.f201508Z);
                    ViewGroup.LayoutParams layoutParams44 = vImage6.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams45 = vImage6.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f37022n);
                    FrameLayout.LayoutParams layoutParams46 = (FrameLayout.LayoutParams) autoVDraweeView6.getLayoutParams();
                    layoutParams46.leftMargin = (int) (layoutParams46.leftMargin * this.f37022n);
                    FrameLayout.LayoutParams layoutParams47 = (FrameLayout.LayoutParams) autoVDraweeView7.getLayoutParams();
                    layoutParams47.rightMargin = (int) (layoutParams47.rightMargin * this.f37022n);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) vImage6.getLayoutParams();
                    float f13 = layoutParams48.topMargin;
                    float f14 = this.f37022n;
                    layoutParams48.topMargin = (int) (f13 * f14);
                    xdl0.m208404u0(frameLayout4, f14);
                    xdl0.m208404u0(autoVDraweeView6, this.f37022n);
                    xdl0.m208404u0(autoVDraweeView7, this.f37022n);
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                xdl0.m208344M(this.f37017i, true);
                Privilege privilegeM205960l = wx80Var.m205960l();
                VImage vImage7 = (VImage) findViewById(z4c0.f201508Z);
                if (privilegeM205960l == Privilege.advanced_filter) {
                    vImage7.setImageResource(d3c0.f83896dc);
                } else if (privilegeM205960l == Privilege.message_read_state) {
                    vImage7.setImageResource(d3c0.f83938gc);
                } else if (privilegeM205960l == Privilege.privacy_membership) {
                    vImage7.setImageResource(zz6.m221004u0() ? d3c0.f83510B8 : d3c0.f83496A8);
                } else if (privilegeM205960l == Privilege.recover_unmatches) {
                    vImage7.setImageResource(zz6.m221004u0() ? d3c0.f83966ic : d3c0.f83952hc);
                }
                if (this.f37020l || this.f37021m) {
                    ViewGroup.LayoutParams layoutParams49 = vImage7.getLayoutParams();
                    layoutParams49.width = (int) (layoutParams49.width * this.f37022n);
                    ViewGroup.LayoutParams layoutParams50 = vImage7.getLayoutParams();
                    layoutParams50.height = (int) (layoutParams50.height * this.f37022n);
                    ViewGroup.LayoutParams layoutParams51 = this.f37017i.getLayoutParams();
                    layoutParams51.height = (int) (layoutParams51.height * this.f37022n);
                    LinearLayout.LayoutParams layoutParams52 = (LinearLayout.LayoutParams) this.f37017i.getLayoutParams();
                    layoutParams52.topMargin = (int) (layoutParams52.topMargin * this.f37022n);
                }
                break;
            case 10:
                m56255d();
                break;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56252a(this);
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37020l = hmb.m131712q1();
        this.f37021m = hmb.m131711p1();
        this.f37022n = this.f37020l ? 0.7f : 0.9f;
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37020l = hmb.m131712q1();
        this.f37021m = hmb.m131711p1();
        this.f37022n = this.f37020l ? 0.7f : 0.9f;
    }
}
