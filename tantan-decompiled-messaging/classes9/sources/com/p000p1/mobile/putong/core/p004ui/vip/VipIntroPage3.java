package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.graphics.Typeface;
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
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.biq;
import l.d3c0;
import l.hmb;
import l.n3b0;
import l.nhl0;
import l.nu0;
import l.sb90;
import l.t100;
import l.xdl0;
import l.z4c0;
import l.zz6;
import p006l.c8e0;
import p006l.qib0;
import p006l.wx80;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipIntroPage3 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ViewStub f6806a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6807b;

    /* JADX INFO: renamed from: c */
    public ViewStub f6808c;

    /* JADX INFO: renamed from: d */
    public ViewStub f6809d;

    /* JADX INFO: renamed from: e */
    public ViewStub f6810e;

    /* JADX INFO: renamed from: f */
    public ViewStub f6811f;

    /* JADX INFO: renamed from: g */
    public ViewStub f6812g;

    /* JADX INFO: renamed from: h */
    public ViewStub f6813h;

    /* JADX INFO: renamed from: i */
    public ViewStub f6814i;

    /* JADX INFO: renamed from: j */
    public ViewStub f6815j;

    /* JADX INFO: renamed from: k */
    public VText f6816k;

    /* JADX INFO: renamed from: l */
    public VText f6817l;

    /* JADX INFO: renamed from: m */
    public boolean f6818m;

    /* JADX INFO: renamed from: n */
    public boolean f6819n;

    /* JADX INFO: renamed from: o */
    public float f6820o;

    /* JADX INFO: renamed from: p */
    public ExplodeLayout f6821p;

    /* JADX INFO: renamed from: q */
    public QuickChatPrivilegeAnimView f6822q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage3$a */
    public static /* synthetic */ class C0381a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6823a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f6823a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6823a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6823a[Privilege.vip_independent_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6823a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6823a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6823a[Privilege.vip_unlimited_likes.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6823a[Privilege.message_read_state.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6823a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6823a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6823a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6823a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6823a[Privilege.see_who_likes_me.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6823a[Privilege.online_match_tickets.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public VipIntroPage3(Context context) {
        super(context);
        this.f6818m = hmb.q1();
        this.f6819n = hmb.p1();
        this.f6820o = this.f6818m ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m9692a(View view) {
        nhl0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9693b(wx80 wx80Var) {
        this.f6817l.setMaxLines(CoreModule.m1854P().m11706a().m5444h5() ? 2 : 1);
        boolean z = wx80Var.m26841l() == null;
        xdl0.M(this.f6816k, !z);
        this.f6816k.setText(wx80Var.m26849t());
        this.f6817l.setText(wx80Var.m26829d());
        boolean z2 = this.f6818m;
        if (z2 || this.f6819n) {
            this.f6816k.setTextSize(z2 ? 16.0f : 17.0f);
            this.f6817l.setTextSize(this.f6818m ? 12.0f : 13.0f);
        }
        this.f6817l.getLayoutParams().height = CoreModule.m1854P().m11706a().m5444h5() ? t100.d(44.0f) : t100.t;
        if (!z && CoreModule.m1854P().m11706a().m5444h5()) {
            this.f6816k.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (z) {
            xdl0.M(this.f6806a, true);
            SimpleDraweeView simpleDraweeView = (VDraweeView) findViewById(z4c0.a0);
            if (this.f6818m || this.f6819n) {
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                layoutParams.width = (int) (layoutParams.width * this.f6820o);
                ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
                layoutParams2.height = (int) (layoutParams2.height * this.f6820o);
                ((LinearLayout.LayoutParams) this.f6806a.getLayoutParams()).topMargin = t100.d(this.f6818m ? 12.0f : 13.0f);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f6817l.getLayoutParams();
                layoutParams3.topMargin = (int) (layoutParams3.topMargin + (t100.s * this.f6820o));
            } else {
                ((LinearLayout.LayoutParams) this.f6817l.getLayoutParams()).topMargin += t100.s;
            }
            qib0.f19782G.m12767Y0(simpleDraweeView, wx80Var.m26839j());
        }
        switch (C0381a.f6823a[wx80Var.m26841l().ordinal()]) {
            case 1:
                xdl0.M(this.f6807b, true);
                AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.d);
                VText vTextFindViewById = findViewById(z4c0.l1);
                VImage vImageFindViewById = findViewById(z4c0.Z);
                User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
                autoVDraweeViewFindViewById.setImageUrl(((Media) userM21490p9.fp()).url);
                vTextFindViewById.setText(userM21490p9.name);
                vImageFindViewById.setImageResource(CoreModule.m1854P().m11709e().m6925ul());
                Drawable drawableB = nu0.b(getContext(), CoreModule.m1854P().m11709e().m6916cc());
                drawableB.setBounds(0, 0, drawableB.getMinimumWidth(), drawableB.getMinimumHeight());
                vTextFindViewById.setCompoundDrawables((Drawable) null, (Drawable) null, drawableB, (Drawable) null);
                VDraweeView vDraweeViewFindViewById = findViewById(z4c0.h);
                xdl0.M(vDraweeViewFindViewById, CoreModule.m1854P().m11706a().m5444h5());
                if (this.f6818m || this.f6819n) {
                    FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.e);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams4.width = (int) (layoutParams4.width * this.f6820o);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams5.height = (int) (layoutParams5.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams6.topMargin = (int) (layoutParams6.topMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) vDraweeViewFindViewById.getLayoutParams();
                    layoutParams7.width = (int) (layoutParams7.width * this.f6820o);
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) vDraweeViewFindViewById.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById.getLayoutParams();
                    layoutParams9.width = (int) (layoutParams9.width * this.f6820o);
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById.getLayoutParams();
                    layoutParams10.height = (int) (layoutParams10.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) vImageFindViewById.getLayoutParams();
                    layoutParams11.width = (int) (layoutParams11.width * this.f6820o);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) vImageFindViewById.getLayoutParams();
                    layoutParams12.height = (int) (layoutParams12.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) vImageFindViewById.getLayoutParams();
                    layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) vImageFindViewById.getLayoutParams();
                    layoutParams14.rightMargin = (int) (layoutParams14.rightMargin * this.f6820o);
                    vTextFindViewById.setTextSize(this.f6818m ? 16.0f : 17.0f);
                    FrameLayout.LayoutParams layoutParams15 = (FrameLayout.LayoutParams) vTextFindViewById.getLayoutParams();
                    layoutParams15.leftMargin = (int) (layoutParams15.leftMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) vTextFindViewById.getLayoutParams();
                    layoutParams16.rightMargin = (int) (layoutParams16.rightMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) vTextFindViewById.getLayoutParams();
                    layoutParams17.bottomMargin = (int) (layoutParams17.bottomMargin * this.f6820o);
                    RoundingParams roundingParamsP = autoVDraweeViewFindViewById.getHierarchy().p();
                    roundingParamsP.q(roundingParamsP.e() * this.f6820o);
                    autoVDraweeViewFindViewById.getHierarchy().H(roundingParamsP);
                }
                break;
            case 2:
            case CameraSticker.STATE_COMPLETE /* 3 */:
                xdl0.M(this.f6808c, true);
                AutoVDraweeView autoVDraweeViewFindViewById2 = findViewById(z4c0.g);
                SimpleDraweeView simpleDraweeView2 = (AutoVDraweeView) findViewById(z4c0.i);
                ImageView imageView = (ImageView) findViewById(z4c0.Z);
                autoVDraweeViewFindViewById2.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
                if (!NullChecker.a(n3b0.j())) {
                    qib0.f19782G.m12767Y0(simpleDraweeView2, zz6.u0() ? d3c0.xc : d3c0.wc);
                } else if (sb90.c(n3b0.j())) {
                    simpleDraweeView2.y(((Media) n3b0.j().fp()).url, new biq(4, 15));
                } else {
                    simpleDraweeView2.setImageUrl(((Media) n3b0.j().fp()).url);
                }
                if (this.f6818m || this.f6819n) {
                    ViewGroup.LayoutParams layoutParams18 = autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams18.width = (int) (layoutParams18.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams19 = autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams19.height = (int) (layoutParams19.height * this.f6820o);
                    ViewGroup.LayoutParams layoutParams20 = simpleDraweeView2.getLayoutParams();
                    layoutParams20.width = (int) (layoutParams20.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams21 = simpleDraweeView2.getLayoutParams();
                    layoutParams21.height = (int) (layoutParams21.height * this.f6820o);
                    ViewGroup.LayoutParams layoutParams22 = imageView.getLayoutParams();
                    layoutParams22.width = (int) (layoutParams22.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams23 = imageView.getLayoutParams();
                    layoutParams23.height = (int) (layoutParams23.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById2.getLayoutParams();
                    layoutParams24.leftMargin = (int) (layoutParams24.leftMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams25 = (FrameLayout.LayoutParams) simpleDraweeView2.getLayoutParams();
                    layoutParams25.rightMargin = (int) (layoutParams25.rightMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f = layoutParams26.topMargin;
                    float f2 = this.f6820o;
                    layoutParams26.topMargin = (int) (f * f2);
                    xdl0.u0(autoVDraweeViewFindViewById2, f2);
                    xdl0.u0(simpleDraweeView2, this.f6820o);
                    RoundingParams roundingParamsP2 = autoVDraweeViewFindViewById2.getHierarchy().p();
                    roundingParamsP2.q(roundingParamsP2.e() * this.f6820o);
                    autoVDraweeViewFindViewById2.getHierarchy().H(roundingParamsP2);
                    RoundingParams roundingParamsP3 = simpleDraweeView2.getHierarchy().p();
                    roundingParamsP3.q(roundingParamsP3.e() * this.f6820o);
                    simpleDraweeView2.getHierarchy().H(roundingParamsP3);
                }
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                xdl0.M(this.f6809d, true);
                FrameLayout frameLayout2 = (FrameLayout) findViewById(z4c0.s);
                VImage vImageFindViewById2 = findViewById(z4c0.i1);
                AutoVDraweeView autoVDraweeViewFindViewById3 = findViewById(z4c0.g);
                SimpleDraweeView simpleDraweeView3 = (AutoVDraweeView) findViewById(z4c0.i);
                VImage vImageFindViewById3 = findViewById(z4c0.Z);
                if (NullChecker.a(n3b0.m())) {
                    xdl0.M(frameLayout2, true);
                    xdl0.M(vImageFindViewById2, false);
                    autoVDraweeViewFindViewById3.setImageUrl(((Media) n3b0.m().fp()).url);
                    qib0.f19782G.m12767Y0(simpleDraweeView3, zz6.u0() ? d3c0.zc : d3c0.yc);
                } else {
                    xdl0.M(frameLayout2, false);
                    xdl0.M(vImageFindViewById2, true);
                    vImageFindViewById2.setImageResource(zz6.u0() ? d3c0.Cc : d3c0.Ac);
                }
                if (this.f6818m || this.f6819n) {
                    xdl0.u0(frameLayout2, this.f6820o);
                    ViewGroup.LayoutParams layoutParams27 = autoVDraweeViewFindViewById3.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams28 = autoVDraweeViewFindViewById3.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById3.getLayoutParams();
                    float f3 = layoutParams29.leftMargin;
                    float f4 = this.f6820o;
                    layoutParams29.leftMargin = (int) (f3 * f4);
                    xdl0.u0(autoVDraweeViewFindViewById3, f4);
                    ViewGroup.LayoutParams layoutParams30 = simpleDraweeView3.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams31 = simpleDraweeView3.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) simpleDraweeView3.getLayoutParams();
                    float f5 = layoutParams32.rightMargin;
                    float f6 = this.f6820o;
                    layoutParams32.rightMargin = (int) (f5 * f6);
                    xdl0.u0(simpleDraweeView3, f6);
                    ViewGroup.LayoutParams layoutParams33 = vImageFindViewById3.getLayoutParams();
                    layoutParams33.width = (int) (layoutParams33.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams34 = vImageFindViewById3.getLayoutParams();
                    layoutParams34.height = (int) (layoutParams34.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams35 = (FrameLayout.LayoutParams) vImageFindViewById3.getLayoutParams();
                    layoutParams35.topMargin = (int) (layoutParams35.topMargin * this.f6820o);
                    ViewGroup.LayoutParams layoutParams36 = vImageFindViewById2.getLayoutParams();
                    layoutParams36.width = (int) (layoutParams36.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams37 = vImageFindViewById2.getLayoutParams();
                    layoutParams37.height = (int) (layoutParams37.height * this.f6820o);
                }
                break;
            case 5:
                xdl0.M(this.f6810e, true);
                VImage vImageFindViewById4 = findViewById(z4c0.Z);
                if (this.f6818m || this.f6819n) {
                    ViewGroup.LayoutParams layoutParams38 = vImageFindViewById4.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams39 = vImageFindViewById4.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f6820o);
                }
                break;
            case 6:
                xdl0.M(this.f6811f, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(z4c0.s);
                VImage vImageFindViewById5 = findViewById(z4c0.i1);
                SimpleDraweeView simpleDraweeView4 = (AutoVDraweeView) findViewById(z4c0.g);
                AutoVDraweeView autoVDraweeViewFindViewById4 = findViewById(z4c0.i);
                if (NullChecker.a(n3b0.n())) {
                    xdl0.M(frameLayout3, true);
                    xdl0.M(vImageFindViewById5, false);
                    qib0.f19782G.m12767Y0(simpleDraweeView4, zz6.u0() ? d3c0.zc : d3c0.yc);
                    autoVDraweeViewFindViewById4.setImageUrl(((Media) n3b0.n().fp()).url);
                } else {
                    xdl0.M(frameLayout3, false);
                    xdl0.M(vImageFindViewById5, true);
                    vImageFindViewById5.setImageResource(zz6.u0() ? d3c0.Gc : d3c0.Dc);
                }
                if (this.f6818m || this.f6819n) {
                    ViewGroup.LayoutParams layoutParams40 = vImageFindViewById5.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams41 = vImageFindViewById5.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f6820o);
                    ViewGroup.LayoutParams layoutParams42 = simpleDraweeView4.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams43 = simpleDraweeView4.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f6820o);
                    ViewGroup.LayoutParams layoutParams44 = autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams45 = autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f6820o);
                    VImage vImageFindViewById6 = findViewById(z4c0.Z);
                    ViewGroup.LayoutParams layoutParams46 = vImageFindViewById6.getLayoutParams();
                    layoutParams46.width = (int) (layoutParams46.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams47 = vImageFindViewById6.getLayoutParams();
                    layoutParams47.height = (int) (layoutParams47.height * this.f6820o);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) simpleDraweeView4.getLayoutParams();
                    layoutParams48.leftMargin = (int) (layoutParams48.leftMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams49 = (FrameLayout.LayoutParams) autoVDraweeViewFindViewById4.getLayoutParams();
                    layoutParams49.rightMargin = (int) (layoutParams49.rightMargin * this.f6820o);
                    FrameLayout.LayoutParams layoutParams50 = (FrameLayout.LayoutParams) vImageFindViewById6.getLayoutParams();
                    float f7 = layoutParams50.topMargin;
                    float f8 = this.f6820o;
                    layoutParams50.topMargin = (int) (f7 * f8);
                    xdl0.u0(frameLayout3, f8);
                    xdl0.u0(simpleDraweeView4, this.f6820o);
                    xdl0.u0(autoVDraweeViewFindViewById4, this.f6820o);
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                xdl0.M(this.f6812g, true);
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
                if (this.f6818m || this.f6819n) {
                    ViewGroup.LayoutParams layoutParams51 = vImageFindViewById7.getLayoutParams();
                    layoutParams51.width = (int) (layoutParams51.width * this.f6820o);
                    ViewGroup.LayoutParams layoutParams52 = vImageFindViewById7.getLayoutParams();
                    layoutParams52.height = (int) (layoutParams52.height * this.f6820o);
                    LinearLayout.LayoutParams layoutParams53 = (LinearLayout.LayoutParams) this.f6812g.getLayoutParams();
                    layoutParams53.topMargin = (int) (layoutParams53.topMargin * this.f6820o);
                }
                break;
            case 11:
                m9694c();
                break;
            case 12:
                m9696e();
                break;
            case 13:
                m9695d();
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9694c() {
        xdl0.M(this.f6815j, true);
        SimpleDraweeView simpleDraweeView = (AutoVDraweeView) findViewById(z4c0.e0);
        AutoVDraweeView autoVDraweeViewFindViewById = findViewById(z4c0.W);
        FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.P);
        LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.q0);
        TextView textView = (TextView) findViewById(z4c0.S0);
        TextView textView2 = (TextView) findViewById(z4c0.U0);
        TextView textView3 = (TextView) findViewById(z4c0.T0);
        TextView textView4 = (TextView) findViewById(z4c0.V0);
        boolean z = this.f6818m;
        if (z || this.f6819n) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f6818m ? 11.0f : 12.0f);
            xdl0.u0(textView, this.f6820o);
            xdl0.u0(textView3, this.f6820o);
            xdl0.u0(textView2, this.f6820o);
            xdl0.u0(textView4, this.f6820o);
            ViewGroup.LayoutParams layoutParams = this.f6815j.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f6820o);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f6815j.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f6820o);
            ViewGroup.LayoutParams layoutParams3 = simpleDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f6820o);
            ViewGroup.LayoutParams layoutParams4 = simpleDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f6820o);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f6820o);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f6820o);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f6820o);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f6820o);
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

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public final void m9695d() {
        xdl0.M(this.f6814i, true);
        ?? r0 = (QuickChatPrivilegeAnimView) findViewById(z4c0.D0);
        this.f6822q = r0;
        if (this.f6818m || this.f6819n) {
            ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f6820o);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f6822q.getLayoutParams();
            float f = layoutParams2.topMargin;
            float f2 = this.f6820o;
            layoutParams2.topMargin = (int) (f * f2);
            this.f6822q.setScaleX(f2);
            this.f6822q.setScaleY(this.f6820o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9696e() {
        VipIntroPage3 vipIntroPage3;
        xdl0.M(this.f6813h, true);
        this.f6821p = (ExplodeLayout) findViewById(z4c0.I0);
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
        boolean zM5545vb = CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5);
        VText vText = this.f6817l;
        if (zM5545vb) {
            CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
            VText vText2 = this.f6817l;
            vipIntroPage3 = this;
            vText.setText(coreBusinessServiceM11706a.m5413ca(userM2411v5, vipIntroPage3, vText2, (int) vText2.getTextSize(), (int) this.f6817l.getTextSize()));
        } else {
            vipIntroPage3 = this;
            vText.setText(c8e0.m13312e(c0145aM2399r5 == null ? 0 : c0145aM2399r5.f3259b));
        }
        vipIntroPage3.f6821p.setScale(0.72f);
        if (vipIntroPage3.f6818m || vipIntroPage3.f6819n) {
            ViewGroup.LayoutParams layoutParams = vipIntroPage3.f6821p.getLayoutParams();
            float f = layoutParams.height;
            float f2 = vipIntroPage3.f6820o;
            layoutParams.height = (int) (f * f2);
            vipIntroPage3.f6821p.setScale(f2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9697f() {
        if (NullChecker.a(this.f6821p)) {
            this.f6821p.m7563l(true);
        } else if (NullChecker.a(this.f6822q)) {
            this.f6822q.m7645u0(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9692a(this);
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6818m = hmb.q1();
        this.f6819n = hmb.p1();
        this.f6820o = this.f6818m ? 0.7f : 0.9f;
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6818m = hmb.q1();
        this.f6819n = hmb.p1();
        this.f6820o = this.f6818m ? 0.7f : 0.9f;
    }
}
