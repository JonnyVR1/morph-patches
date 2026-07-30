package com.p051p1.mobile.putong.core.p058ui.vip;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.a690;
import p153l.bkq;
import p153l.bnl0;
import p153l.c17;
import p153l.fdc0;
import p153l.gta;
import p153l.jbc0;
import p153l.qa00;
import p153l.qql0;
import p153l.rbb0;
import p153l.tu0;
import p153l.uqb0;
import p153l.vnb;
import p153l.wj90;

/* JADX INFO: loaded from: classes12.dex */
public class VipIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f37857a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37858b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37859c;

    /* JADX INFO: renamed from: d */
    public ViewStub f37860d;

    /* JADX INFO: renamed from: e */
    public ViewStub f37861e;

    /* JADX INFO: renamed from: f */
    public ViewStub f37862f;

    /* JADX INFO: renamed from: g */
    public ViewStub f37863g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37864h;

    /* JADX INFO: renamed from: i */
    public ViewStub f37865i;

    /* JADX INFO: renamed from: j */
    public VText f37866j;

    /* JADX INFO: renamed from: k */
    public VText f37867k;

    /* JADX INFO: renamed from: l */
    public boolean f37868l;

    /* JADX INFO: renamed from: m */
    public boolean f37869m;

    /* JADX INFO: renamed from: n */
    public float f37870n;

    /* JADX INFO: renamed from: o */
    public a690 f37871o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage2$a */
    public static /* synthetic */ class C9107a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37872a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37872a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37872a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37872a[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37872a[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37872a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37872a[Privilege.message_read_state.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37872a[Privilege.privacy_membership.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37872a[Privilege.advanced_filter.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37872a[Privilege.recover_unmatches.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37872a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public VipIntroPage2(Context context) {
        super(context);
        this.f37868l = vnb.m201957q1();
        this.f37869m = vnb.m201956p1();
        this.f37870n = this.f37868l ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m57435a(View view) {
        qql0.m177505a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57436b(a690 a690Var) {
        this.f37871o = a690Var;
        if (a690Var.m96306l() == null) {
            this.f37857a.setText(a690Var.m96314t());
            boolean z = this.f37868l;
            if (z || this.f37869m) {
                this.f37857a.setTextSize(z ? 14.0f : 16.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37866j.getLayoutParams();
                marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37870n), 0, 0);
            }
            if (a690Var.m96304j() > 0) {
                bnl0.m105524M(this.f37858b, true);
                VDraweeView vDraweeView = (VDraweeView) findViewById(fdc0.f98387a0);
                if (this.f37868l || this.f37869m) {
                    ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f37870n);
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f37858b.getLayoutParams();
                    layoutParams3.topMargin = (int) (layoutParams3.topMargin * this.f37870n);
                }
                uqb0.f180374G.m127138Y0(vDraweeView, a690Var.m96304j());
            }
        } else {
            m57439e(a690Var);
            m57440f(a690Var);
        }
        m57437c(a690Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m57437c(a690 a690Var) {
        if (this.f37868l || this.f37869m) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37867k.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37870n), 0, 0);
            this.f37867k.setLayoutParams(marginLayoutParams);
            this.f37867k.setTextSize(this.f37868l ? 11.0f : 12.0f);
        }
        bnl0.m105524M(this.f37867k, true);
        this.f37867k.setText(a690Var.m96294d());
    }

    /* JADX INFO: renamed from: d */
    public final void m57438d() {
        bnl0.m105524M(this.f37864h, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(fdc0.f98399e0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(fdc0.f98378W);
        FrameLayout frameLayout = (FrameLayout) findViewById(fdc0.f98364P);
        LinearLayout linearLayout = (LinearLayout) findViewById(fdc0.f98435q0);
        TextView textView = (TextView) findViewById(fdc0.f98371S0);
        TextView textView2 = (TextView) findViewById(fdc0.f98375U0);
        TextView textView3 = (TextView) findViewById(fdc0.f98373T0);
        TextView textView4 = (TextView) findViewById(fdc0.f98377V0);
        boolean z = this.f37868l;
        if (z || this.f37869m) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f37868l ? 11.0f : 12.0f);
            bnl0.m105584u0(textView, this.f37870n);
            bnl0.m105584u0(textView3, this.f37870n);
            bnl0.m105584u0(textView2, this.f37870n);
            bnl0.m105584u0(textView4, this.f37870n);
            ViewGroup.LayoutParams layoutParams = this.f37864h.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37870n);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37864h.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f37870n);
            ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f37870n);
            ViewGroup.LayoutParams layoutParams4 = autoVDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f37870n);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f37870n);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f37870n);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37870n);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f37870n);
        }
        if (NullChecker.m82486a(rbb0.m180737j())) {
            if (wj90.m206620c(rbb0.m180737j())) {
                autoVDraweeView.m224134y(rbb0.m180737j().m61308fp().url, new bkq(4, 15));
            } else {
                autoVDraweeView.setImageUrl(rbb0.m180737j().m61308fp().url);
            }
        } else if (c17.m107528u0()) {
            uqb0.f180374G.m127138Y0(autoVDraweeView, jbc0.f119443Vb);
        } else {
            uqb0.f180374G.m127138Y0(autoVDraweeView, jbc0.f119817wc);
        }
        autoVDraweeView2.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().picture(0).url);
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
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
    public final void m57439e(a690 a690Var) {
        boolean z = this.f37868l;
        if (z || this.f37869m) {
            this.f37857a.setTextSize(z ? 14.0f : 15.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37866j.getLayoutParams();
            marginLayoutParams.setMargins(0, (int) (marginLayoutParams.topMargin * this.f37870n), 0, 0);
            this.f37866j.setLayoutParams(marginLayoutParams);
            this.f37866j.setTextSize(this.f37868l ? 16.0f : 17.0f);
        }
        bnl0.m105524M(this.f37857a, true);
        bnl0.m105524M(this.f37866j, false);
        if (bnl0.m105529O0(this.f37866j)) {
            this.f37866j.setText(a690Var.m96314t());
        }
        int i = C9107a.f37872a[a690Var.m96306l().ordinal()];
        if (i == 1) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired()) {
                this.f37857a.setText(getResources().getString(R$string.f28437r9));
                return;
            } else {
                this.f37857a.setText(getResources().getString(R$string.f28414p9));
                return;
            }
        }
        if (i != 2) {
            this.f37857a.setText(a690Var.m96314t());
            return;
        }
        boolean zMo34737Oi = gta.m132210e().m132214d().mo34737Oi();
        VText vText = this.f37857a;
        if (zMo34737Oi) {
            vText.setText(a690Var.m96314t());
        } else {
            vText.setText(getResources().getString(R$string.f28246b9, 5));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m57440f(a690 a690Var) {
        switch (C9107a.f37872a[a690Var.m96306l().ordinal()]) {
            case 1:
                ViewStub viewStub = this.f37859c;
                bnl0.m105524M(viewStub, true);
                AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(fdc0.f98395d);
                VText vText = (VText) findViewById(fdc0.f98421l1);
                VImage vImage = (VImage) findViewById(fdc0.f98384Z);
                vImage.setImageResource(CoreModule.m30933P().m143408e().mo35991ul());
                Drawable drawableM192702b = tu0.m192702b(getContext(), CoreModule.m30933P().m143408e().mo35982cc());
                drawableM192702b.setBounds(0, 0, drawableM192702b.getMinimumWidth(), drawableM192702b.getMinimumHeight());
                vText.setCompoundDrawables(null, null, drawableM192702b, null);
                boolean z = this.f37868l;
                if (z || this.f37869m) {
                    vText.setTextSize(z ? 14.0f : 16.0f);
                    FrameLayout frameLayout = (FrameLayout) findViewById(fdc0.f98391b1);
                    FrameLayout frameLayout2 = (FrameLayout) findViewById(fdc0.f98401f);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = (int) (layoutParams.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                    layoutParams2.height = (int) (layoutParams2.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
                    float f = layoutParams3.width;
                    float f2 = this.f37870n;
                    layoutParams3.width = (int) (f * f2);
                    layoutParams3.height = (int) (layoutParams3.height * f2);
                    autoVDraweeView.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                    float f3 = layoutParams4.width;
                    float f4 = this.f37870n;
                    layoutParams4.width = (int) (f3 * f4);
                    layoutParams4.height = (int) (layoutParams4.height * f4);
                    frameLayout2.setLayoutParams(layoutParams4);
                    bnl0.m105584u0(frameLayout2, this.f37870n);
                    ViewGroup.LayoutParams layoutParams5 = vImage.getLayoutParams();
                    layoutParams5.width = (int) (layoutParams5.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams6 = vImage.getLayoutParams();
                    layoutParams6.height = (int) (layoutParams6.height * this.f37870n);
                    RoundingParams roundingParamsM207055p = autoVDraweeView.getHierarchy().m207055p();
                    roundingParamsM207055p.m8317q(qa00.m175859d(2.0f));
                    autoVDraweeView.getHierarchy().m207045H(roundingParamsM207055p);
                    LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) viewStub.getLayoutParams();
                    layoutParams7.topMargin = (int) (layoutParams7.topMargin * this.f37870n);
                }
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                autoVDraweeView.setImageUrl(userM116600p9.m61308fp().url);
                vText.setText(userM116600p9.name);
                break;
            case 2:
                ViewStub viewStub2 = this.f37860d;
                bnl0.m105524M(viewStub2, true);
                AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(fdc0.f98404g);
                AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) findViewById(fdc0.f98410i);
                ImageView imageView = (ImageView) findViewById(fdc0.f98384Z);
                autoVDraweeView2.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
                if (!NullChecker.m82486a(rbb0.m180737j())) {
                    uqb0.f180374G.m127138Y0(autoVDraweeView3, c17.m107528u0() ? jbc0.f119831xc : jbc0.f119817wc);
                } else if (wj90.m206620c(rbb0.m180737j())) {
                    autoVDraweeView3.m224134y(rbb0.m180737j().m61308fp().url, new bkq(4, 15));
                } else {
                    autoVDraweeView3.setImageUrl(rbb0.m180737j().m61308fp().url);
                }
                if (this.f37868l || this.f37869m) {
                    ViewGroup.LayoutParams layoutParams8 = viewStub2.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f37870n);
                    LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) viewStub2.getLayoutParams();
                    layoutParams9.topMargin = (int) (layoutParams9.topMargin * this.f37870n);
                    ViewGroup.LayoutParams layoutParams10 = autoVDraweeView2.getLayoutParams();
                    layoutParams10.width = (int) (layoutParams10.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams11 = autoVDraweeView2.getLayoutParams();
                    layoutParams11.height = (int) (layoutParams11.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams12 = autoVDraweeView3.getLayoutParams();
                    layoutParams12.width = (int) (layoutParams12.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams13 = autoVDraweeView3.getLayoutParams();
                    layoutParams13.height = (int) (layoutParams13.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams14 = imageView.getLayoutParams();
                    layoutParams14.width = (int) (layoutParams14.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams15 = imageView.getLayoutParams();
                    layoutParams15.height = (int) (layoutParams15.height * this.f37870n);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) autoVDraweeView2.getLayoutParams();
                    layoutParams16.leftMargin = (int) (layoutParams16.leftMargin * this.f37870n);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) autoVDraweeView3.getLayoutParams();
                    layoutParams17.rightMargin = (int) (layoutParams17.rightMargin * this.f37870n);
                    FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f5 = layoutParams18.topMargin;
                    float f6 = this.f37870n;
                    layoutParams18.topMargin = (int) (f5 * f6);
                    bnl0.m105584u0(autoVDraweeView2, f6);
                    bnl0.m105584u0(autoVDraweeView3, this.f37870n);
                    RoundingParams roundingParamsM207055p2 = autoVDraweeView2.getHierarchy().m207055p();
                    roundingParamsM207055p2.m8317q(roundingParamsM207055p2.m8305e() * this.f37870n);
                    autoVDraweeView2.getHierarchy().m207045H(roundingParamsM207055p2);
                    RoundingParams roundingParamsM207055p3 = autoVDraweeView3.getHierarchy().m207055p();
                    roundingParamsM207055p3.m8317q(roundingParamsM207055p3.m8305e() * this.f37870n);
                    autoVDraweeView3.getHierarchy().m207045H(roundingParamsM207055p3);
                }
                break;
            case 3:
                ViewStub viewStub3 = this.f37861e;
                bnl0.m105524M(viewStub3, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(fdc0.f98438s);
                VImage vImage2 = (VImage) findViewById(fdc0.f98412i1);
                AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) findViewById(fdc0.f98404g);
                AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) findViewById(fdc0.f98410i);
                VImage vImage3 = (VImage) findViewById(fdc0.f98384Z);
                if (NullChecker.m82486a(rbb0.m180740m())) {
                    bnl0.m105524M(frameLayout3, true);
                    bnl0.m105524M(vImage2, false);
                    autoVDraweeView4.setImageUrl(rbb0.m180740m().m61308fp().url);
                    uqb0.f180374G.m127138Y0(autoVDraweeView5, c17.m107528u0() ? jbc0.f119859zc : jbc0.f119845yc);
                } else {
                    bnl0.m105524M(frameLayout3, false);
                    bnl0.m105524M(vImage2, true);
                    vImage2.setImageResource(c17.m107528u0() ? jbc0.f119183Cc : jbc0.f119155Ac);
                }
                if (this.f37868l || this.f37869m) {
                    LinearLayout.LayoutParams layoutParams19 = (LinearLayout.LayoutParams) viewStub3.getLayoutParams();
                    layoutParams19.topMargin = (int) (layoutParams19.topMargin * this.f37870n);
                    ViewGroup.LayoutParams layoutParams20 = viewStub3.getLayoutParams();
                    float f7 = layoutParams20.height;
                    float f8 = this.f37870n;
                    layoutParams20.height = (int) (f7 * f8);
                    bnl0.m105584u0(frameLayout3, f8);
                    ViewGroup.LayoutParams layoutParams21 = autoVDraweeView4.getLayoutParams();
                    layoutParams21.width = (int) (layoutParams21.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams22 = autoVDraweeView4.getLayoutParams();
                    layoutParams22.height = (int) (layoutParams22.height * this.f37870n);
                    FrameLayout.LayoutParams layoutParams23 = (FrameLayout.LayoutParams) autoVDraweeView4.getLayoutParams();
                    float f9 = layoutParams23.leftMargin;
                    float f10 = this.f37870n;
                    layoutParams23.leftMargin = (int) (f9 * f10);
                    bnl0.m105584u0(autoVDraweeView4, f10);
                    ViewGroup.LayoutParams layoutParams24 = autoVDraweeView5.getLayoutParams();
                    layoutParams24.width = (int) (layoutParams24.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams25 = autoVDraweeView5.getLayoutParams();
                    layoutParams25.height = (int) (layoutParams25.height * this.f37870n);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) autoVDraweeView5.getLayoutParams();
                    float f11 = layoutParams26.rightMargin;
                    float f12 = this.f37870n;
                    layoutParams26.rightMargin = (int) (f11 * f12);
                    bnl0.m105584u0(autoVDraweeView5, f12);
                    ViewGroup.LayoutParams layoutParams27 = vImage3.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams28 = vImage3.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f37870n);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) vImage3.getLayoutParams();
                    layoutParams29.topMargin = (int) (layoutParams29.topMargin * this.f37870n);
                    ViewGroup.LayoutParams layoutParams30 = vImage2.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams31 = vImage2.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f37870n);
                }
                break;
            case 4:
                bnl0.m105524M(this.f37862f, true);
                if (this.f37868l || this.f37869m) {
                    VImage vImage4 = (VImage) findViewById(fdc0.f98384Z);
                    ViewGroup.LayoutParams layoutParams32 = vImage4.getLayoutParams();
                    layoutParams32.width = (int) (layoutParams32.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams33 = vImage4.getLayoutParams();
                    layoutParams33.height = (int) (layoutParams33.height * this.f37870n);
                    LinearLayout.LayoutParams layoutParams34 = (LinearLayout.LayoutParams) this.f37862f.getLayoutParams();
                    layoutParams34.topMargin = (int) (layoutParams34.topMargin * this.f37870n);
                }
                break;
            case 5:
                ViewStub viewStub4 = this.f37863g;
                bnl0.m105524M(viewStub4, true);
                FrameLayout frameLayout4 = (FrameLayout) findViewById(fdc0.f98438s);
                VImage vImage5 = (VImage) findViewById(fdc0.f98412i1);
                AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) findViewById(fdc0.f98404g);
                AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) findViewById(fdc0.f98410i);
                if (NullChecker.m82486a(rbb0.m180741n())) {
                    bnl0.m105524M(frameLayout4, true);
                    bnl0.m105524M(vImage5, false);
                    uqb0.f180374G.m127138Y0(autoVDraweeView6, c17.m107528u0() ? jbc0.f119859zc : jbc0.f119845yc);
                    autoVDraweeView7.setImageUrl(rbb0.m180741n().m61308fp().url);
                } else {
                    bnl0.m105524M(frameLayout4, false);
                    bnl0.m105524M(vImage5, true);
                    vImage5.setImageResource(c17.m107528u0() ? jbc0.f119239Gc : jbc0.f119197Dc);
                }
                if (this.f37868l || this.f37869m) {
                    ViewGroup.LayoutParams layoutParams35 = viewStub4.getLayoutParams();
                    layoutParams35.height = (int) (layoutParams35.height * this.f37870n);
                    LinearLayout.LayoutParams layoutParams36 = (LinearLayout.LayoutParams) viewStub4.getLayoutParams();
                    layoutParams36.topMargin = (int) (layoutParams36.topMargin * this.f37870n);
                    ViewGroup.LayoutParams layoutParams37 = frameLayout4.getLayoutParams();
                    layoutParams37.width = (int) (layoutParams37.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams38 = vImage5.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams39 = vImage5.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams40 = autoVDraweeView6.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams41 = autoVDraweeView6.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams42 = autoVDraweeView7.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams43 = autoVDraweeView7.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f37870n);
                    VImage vImage6 = (VImage) findViewById(fdc0.f98384Z);
                    ViewGroup.LayoutParams layoutParams44 = vImage6.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams45 = vImage6.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f37870n);
                    FrameLayout.LayoutParams layoutParams46 = (FrameLayout.LayoutParams) autoVDraweeView6.getLayoutParams();
                    layoutParams46.leftMargin = (int) (layoutParams46.leftMargin * this.f37870n);
                    FrameLayout.LayoutParams layoutParams47 = (FrameLayout.LayoutParams) autoVDraweeView7.getLayoutParams();
                    layoutParams47.rightMargin = (int) (layoutParams47.rightMargin * this.f37870n);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) vImage6.getLayoutParams();
                    float f13 = layoutParams48.topMargin;
                    float f14 = this.f37870n;
                    layoutParams48.topMargin = (int) (f13 * f14);
                    bnl0.m105584u0(frameLayout4, f14);
                    bnl0.m105584u0(autoVDraweeView6, this.f37870n);
                    bnl0.m105584u0(autoVDraweeView7, this.f37870n);
                }
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                bnl0.m105524M(this.f37865i, true);
                Privilege privilegeM96306l = a690Var.m96306l();
                VImage vImage7 = (VImage) findViewById(fdc0.f98384Z);
                if (privilegeM96306l == Privilege.advanced_filter) {
                    vImage7.setImageResource(jbc0.f119551dc);
                } else if (privilegeM96306l == Privilege.message_read_state) {
                    vImage7.setImageResource(jbc0.f119593gc);
                } else if (privilegeM96306l == Privilege.privacy_membership) {
                    vImage7.setImageResource(c17.m107528u0() ? jbc0.f119165B8 : jbc0.f119151A8);
                } else if (privilegeM96306l == Privilege.recover_unmatches) {
                    vImage7.setImageResource(c17.m107528u0() ? jbc0.f119621ic : jbc0.f119607hc);
                }
                if (this.f37868l || this.f37869m) {
                    ViewGroup.LayoutParams layoutParams49 = vImage7.getLayoutParams();
                    layoutParams49.width = (int) (layoutParams49.width * this.f37870n);
                    ViewGroup.LayoutParams layoutParams50 = vImage7.getLayoutParams();
                    layoutParams50.height = (int) (layoutParams50.height * this.f37870n);
                    ViewGroup.LayoutParams layoutParams51 = this.f37865i.getLayoutParams();
                    layoutParams51.height = (int) (layoutParams51.height * this.f37870n);
                    LinearLayout.LayoutParams layoutParams52 = (LinearLayout.LayoutParams) this.f37865i.getLayoutParams();
                    layoutParams52.topMargin = (int) (layoutParams52.topMargin * this.f37870n);
                }
                break;
            case 10:
                m57438d();
                break;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57435a(this);
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37868l = vnb.m201957q1();
        this.f37869m = vnb.m201956p1();
        this.f37870n = this.f37868l ? 0.7f : 0.9f;
    }

    public VipIntroPage2(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37868l = vnb.m201957q1();
        this.f37869m = vnb.m201956p1();
        this.f37870n = this.f37868l ? 0.7f : 0.9f;
    }
}
