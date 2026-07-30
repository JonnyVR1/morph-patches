package com.p046p1.mobile.putong.core.p053ui.vip;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.biq;
import p149l.c8e0;
import p149l.d3c0;
import p149l.hmb;
import p149l.n3b0;
import p149l.nhl0;
import p149l.nu0;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.wx80;
import p149l.xdl0;
import p149l.z4c0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class VipIntroPage3 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ViewStub f37025a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37026b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37027c;

    /* JADX INFO: renamed from: d */
    public ViewStub f37028d;

    /* JADX INFO: renamed from: e */
    public ViewStub f37029e;

    /* JADX INFO: renamed from: f */
    public ViewStub f37030f;

    /* JADX INFO: renamed from: g */
    public ViewStub f37031g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37032h;

    /* JADX INFO: renamed from: i */
    public ViewStub f37033i;

    /* JADX INFO: renamed from: j */
    public ViewStub f37034j;

    /* JADX INFO: renamed from: k */
    public VText f37035k;

    /* JADX INFO: renamed from: l */
    public VText f37036l;

    /* JADX INFO: renamed from: m */
    public boolean f37037m;

    /* JADX INFO: renamed from: n */
    public boolean f37038n;

    /* JADX INFO: renamed from: o */
    public float f37039o;

    /* JADX INFO: renamed from: p */
    public ExplodeLayout f37040p;

    /* JADX INFO: renamed from: q */
    public QuickChatPrivilegeAnimView f37041q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage3$a */
    public static /* synthetic */ class C8945a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37042a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37042a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37042a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37042a[Privilege.vip_independent_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37042a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37042a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37042a[Privilege.vip_unlimited_likes.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37042a[Privilege.message_read_state.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37042a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37042a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37042a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37042a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37042a[Privilege.see_who_likes_me.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37042a[Privilege.online_match_tickets.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public VipIntroPage3(Context context) {
        super(context);
        this.f37037m = hmb.m131712q1();
        this.f37038n = hmb.m131711p1();
        this.f37039o = this.f37037m ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m56258a(View view) {
        nhl0.m159416a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56259b(wx80 wx80Var) {
        this.f37036l.setMaxLines(CoreModule.m29935P().m94651a().mo33507h5() ? 2 : 1);
        boolean z = wx80Var.m205960l() == null;
        xdl0.m208344M(this.f37035k, !z);
        this.f37035k.setText(wx80Var.m205968t());
        this.f37036l.setText(wx80Var.m205948d());
        boolean z2 = this.f37037m;
        if (z2 || this.f37038n) {
            this.f37035k.setTextSize(z2 ? 16.0f : 17.0f);
            this.f37036l.setTextSize(this.f37037m ? 12.0f : 13.0f);
        }
        this.f37036l.getLayoutParams().height = CoreModule.m29935P().m94651a().mo33507h5() ? t100.m186890d(44.0f) : t100.f167271t;
        if (!z && CoreModule.m29935P().m94651a().mo33507h5()) {
            this.f37035k.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (z) {
            xdl0.m208344M(this.f37025a, true);
            VDraweeView vDraweeView = (VDraweeView) findViewById(z4c0.f201511a0);
            if (this.f37037m || this.f37038n) {
                ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                layoutParams.width = (int) (layoutParams.width * this.f37039o);
                ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
                layoutParams2.height = (int) (layoutParams2.height * this.f37039o);
                ((LinearLayout.LayoutParams) this.f37025a.getLayoutParams()).topMargin = t100.m186890d(this.f37037m ? 12.0f : 13.0f);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f37036l.getLayoutParams();
                layoutParams3.topMargin = (int) (layoutParams3.topMargin + (t100.f167270s * this.f37039o));
            } else {
                ((LinearLayout.LayoutParams) this.f37036l.getLayoutParams()).topMargin += t100.f167270s;
            }
            qib0.f154691G.m102354Y0(vDraweeView, wx80Var.m205958j());
        }
        switch (C8945a.f37042a[wx80Var.m205960l().ordinal()]) {
            case 1:
                xdl0.m208344M(this.f37026b, true);
                AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(z4c0.f201519d);
                VText vText = (VText) findViewById(z4c0.f201545l1);
                VImage vImage = (VImage) findViewById(z4c0.f201508Z);
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                autoVDraweeView.setImageUrl(userM169527p9.m60124fp().url);
                vText.setText(userM169527p9.name);
                vImage.setImageResource(CoreModule.m29935P().m94654e().mo34988ul());
                Drawable drawableM161424b = nu0.m161424b(getContext(), CoreModule.m29935P().m94654e().mo34979cc());
                drawableM161424b.setBounds(0, 0, drawableM161424b.getMinimumWidth(), drawableM161424b.getMinimumHeight());
                vText.setCompoundDrawables(null, null, drawableM161424b, null);
                VDraweeView vDraweeView2 = (VDraweeView) findViewById(z4c0.f201531h);
                xdl0.m208344M(vDraweeView2, CoreModule.m29935P().m94651a().mo33507h5());
                if (this.f37037m || this.f37038n) {
                    FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.f201522e);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams4.width = (int) (layoutParams4.width * this.f37039o);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams5.height = (int) (layoutParams5.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams6.topMargin = (int) (layoutParams6.topMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) vDraweeView2.getLayoutParams();
                    layoutParams7.width = (int) (layoutParams7.width * this.f37039o);
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) vDraweeView2.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) autoVDraweeView.getLayoutParams();
                    layoutParams9.width = (int) (layoutParams9.width * this.f37039o);
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) autoVDraweeView.getLayoutParams();
                    layoutParams10.height = (int) (layoutParams10.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams11.width = (int) (layoutParams11.width * this.f37039o);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams12.height = (int) (layoutParams12.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams14.rightMargin = (int) (layoutParams14.rightMargin * this.f37039o);
                    vText.setTextSize(this.f37037m ? 16.0f : 17.0f);
                    FrameLayout.LayoutParams layoutParams15 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams15.leftMargin = (int) (layoutParams15.leftMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams16.rightMargin = (int) (layoutParams16.rightMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams17.bottomMargin = (int) (layoutParams17.bottomMargin * this.f37039o);
                    RoundingParams roundingParamsM112069p = autoVDraweeView.getHierarchy().m112069p();
                    roundingParamsM112069p.m8263q(roundingParamsM112069p.m8251e() * this.f37039o);
                    autoVDraweeView.getHierarchy().m112053H(roundingParamsM112069p);
                }
                break;
            case 2:
            case 3:
                xdl0.m208344M(this.f37027c, true);
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
                if (this.f37037m || this.f37038n) {
                    ViewGroup.LayoutParams layoutParams18 = autoVDraweeView2.getLayoutParams();
                    layoutParams18.width = (int) (layoutParams18.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams19 = autoVDraweeView2.getLayoutParams();
                    layoutParams19.height = (int) (layoutParams19.height * this.f37039o);
                    ViewGroup.LayoutParams layoutParams20 = autoVDraweeView3.getLayoutParams();
                    layoutParams20.width = (int) (layoutParams20.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams21 = autoVDraweeView3.getLayoutParams();
                    layoutParams21.height = (int) (layoutParams21.height * this.f37039o);
                    ViewGroup.LayoutParams layoutParams22 = imageView.getLayoutParams();
                    layoutParams22.width = (int) (layoutParams22.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams23 = imageView.getLayoutParams();
                    layoutParams23.height = (int) (layoutParams23.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) autoVDraweeView2.getLayoutParams();
                    layoutParams24.leftMargin = (int) (layoutParams24.leftMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams25 = (FrameLayout.LayoutParams) autoVDraweeView3.getLayoutParams();
                    layoutParams25.rightMargin = (int) (layoutParams25.rightMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f = layoutParams26.topMargin;
                    float f2 = this.f37039o;
                    layoutParams26.topMargin = (int) (f * f2);
                    xdl0.m208404u0(autoVDraweeView2, f2);
                    xdl0.m208404u0(autoVDraweeView3, this.f37039o);
                    RoundingParams roundingParamsM112069p2 = autoVDraweeView2.getHierarchy().m112069p();
                    roundingParamsM112069p2.m8263q(roundingParamsM112069p2.m8251e() * this.f37039o);
                    autoVDraweeView2.getHierarchy().m112053H(roundingParamsM112069p2);
                    RoundingParams roundingParamsM112069p3 = autoVDraweeView3.getHierarchy().m112069p();
                    roundingParamsM112069p3.m8263q(roundingParamsM112069p3.m8251e() * this.f37039o);
                    autoVDraweeView3.getHierarchy().m112053H(roundingParamsM112069p3);
                }
                break;
            case 4:
                xdl0.m208344M(this.f37028d, true);
                FrameLayout frameLayout2 = (FrameLayout) findViewById(z4c0.f201562s);
                VImage vImage2 = (VImage) findViewById(z4c0.f201536i1);
                AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) findViewById(z4c0.f201528g);
                AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) findViewById(z4c0.f201534i);
                VImage vImage3 = (VImage) findViewById(z4c0.f201508Z);
                if (NullChecker.m81303a(n3b0.m157738m())) {
                    xdl0.m208344M(frameLayout2, true);
                    xdl0.m208344M(vImage2, false);
                    autoVDraweeView4.setImageUrl(n3b0.m157738m().m60124fp().url);
                    qib0.f154691G.m102354Y0(autoVDraweeView5, zz6.m221004u0() ? d3c0.f84204zc : d3c0.f84190yc);
                } else {
                    xdl0.m208344M(frameLayout2, false);
                    xdl0.m208344M(vImage2, true);
                    vImage2.setImageResource(zz6.m221004u0() ? d3c0.f83528Cc : d3c0.f83500Ac);
                }
                if (this.f37037m || this.f37038n) {
                    xdl0.m208404u0(frameLayout2, this.f37039o);
                    ViewGroup.LayoutParams layoutParams27 = autoVDraweeView4.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams28 = autoVDraweeView4.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) autoVDraweeView4.getLayoutParams();
                    float f3 = layoutParams29.leftMargin;
                    float f4 = this.f37039o;
                    layoutParams29.leftMargin = (int) (f3 * f4);
                    xdl0.m208404u0(autoVDraweeView4, f4);
                    ViewGroup.LayoutParams layoutParams30 = autoVDraweeView5.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams31 = autoVDraweeView5.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) autoVDraweeView5.getLayoutParams();
                    float f5 = layoutParams32.rightMargin;
                    float f6 = this.f37039o;
                    layoutParams32.rightMargin = (int) (f5 * f6);
                    xdl0.m208404u0(autoVDraweeView5, f6);
                    ViewGroup.LayoutParams layoutParams33 = vImage3.getLayoutParams();
                    layoutParams33.width = (int) (layoutParams33.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams34 = vImage3.getLayoutParams();
                    layoutParams34.height = (int) (layoutParams34.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams35 = (FrameLayout.LayoutParams) vImage3.getLayoutParams();
                    layoutParams35.topMargin = (int) (layoutParams35.topMargin * this.f37039o);
                    ViewGroup.LayoutParams layoutParams36 = vImage2.getLayoutParams();
                    layoutParams36.width = (int) (layoutParams36.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams37 = vImage2.getLayoutParams();
                    layoutParams37.height = (int) (layoutParams37.height * this.f37039o);
                }
                break;
            case 5:
                xdl0.m208344M(this.f37029e, true);
                VImage vImage4 = (VImage) findViewById(z4c0.f201508Z);
                if (this.f37037m || this.f37038n) {
                    ViewGroup.LayoutParams layoutParams38 = vImage4.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams39 = vImage4.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f37039o);
                }
                break;
            case 6:
                xdl0.m208344M(this.f37030f, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(z4c0.f201562s);
                VImage vImage5 = (VImage) findViewById(z4c0.f201536i1);
                AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) findViewById(z4c0.f201528g);
                AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) findViewById(z4c0.f201534i);
                if (NullChecker.m81303a(n3b0.m157739n())) {
                    xdl0.m208344M(frameLayout3, true);
                    xdl0.m208344M(vImage5, false);
                    qib0.f154691G.m102354Y0(autoVDraweeView6, zz6.m221004u0() ? d3c0.f84204zc : d3c0.f84190yc);
                    autoVDraweeView7.setImageUrl(n3b0.m157739n().m60124fp().url);
                } else {
                    xdl0.m208344M(frameLayout3, false);
                    xdl0.m208344M(vImage5, true);
                    vImage5.setImageResource(zz6.m221004u0() ? d3c0.f83584Gc : d3c0.f83542Dc);
                }
                if (this.f37037m || this.f37038n) {
                    ViewGroup.LayoutParams layoutParams40 = vImage5.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams41 = vImage5.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f37039o);
                    ViewGroup.LayoutParams layoutParams42 = autoVDraweeView6.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams43 = autoVDraweeView6.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f37039o);
                    ViewGroup.LayoutParams layoutParams44 = autoVDraweeView7.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams45 = autoVDraweeView7.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f37039o);
                    VImage vImage6 = (VImage) findViewById(z4c0.f201508Z);
                    ViewGroup.LayoutParams layoutParams46 = vImage6.getLayoutParams();
                    layoutParams46.width = (int) (layoutParams46.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams47 = vImage6.getLayoutParams();
                    layoutParams47.height = (int) (layoutParams47.height * this.f37039o);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) autoVDraweeView6.getLayoutParams();
                    layoutParams48.leftMargin = (int) (layoutParams48.leftMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams49 = (FrameLayout.LayoutParams) autoVDraweeView7.getLayoutParams();
                    layoutParams49.rightMargin = (int) (layoutParams49.rightMargin * this.f37039o);
                    FrameLayout.LayoutParams layoutParams50 = (FrameLayout.LayoutParams) vImage6.getLayoutParams();
                    float f7 = layoutParams50.topMargin;
                    float f8 = this.f37039o;
                    layoutParams50.topMargin = (int) (f7 * f8);
                    xdl0.m208404u0(frameLayout3, f8);
                    xdl0.m208404u0(autoVDraweeView6, this.f37039o);
                    xdl0.m208404u0(autoVDraweeView7, this.f37039o);
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                xdl0.m208344M(this.f37031g, true);
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
                if (this.f37037m || this.f37038n) {
                    ViewGroup.LayoutParams layoutParams51 = vImage7.getLayoutParams();
                    layoutParams51.width = (int) (layoutParams51.width * this.f37039o);
                    ViewGroup.LayoutParams layoutParams52 = vImage7.getLayoutParams();
                    layoutParams52.height = (int) (layoutParams52.height * this.f37039o);
                    LinearLayout.LayoutParams layoutParams53 = (LinearLayout.LayoutParams) this.f37031g.getLayoutParams();
                    layoutParams53.topMargin = (int) (layoutParams53.topMargin * this.f37039o);
                }
                break;
            case 11:
                m56260c();
                break;
            case 12:
                m56262e();
                break;
            case 13:
                m56261d();
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56260c() {
        xdl0.m208344M(this.f37034j, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(z4c0.f201523e0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(z4c0.f201502W);
        FrameLayout frameLayout = (FrameLayout) findViewById(z4c0.f201488P);
        LinearLayout linearLayout = (LinearLayout) findViewById(z4c0.f201559q0);
        TextView textView = (TextView) findViewById(z4c0.f201495S0);
        TextView textView2 = (TextView) findViewById(z4c0.f201499U0);
        TextView textView3 = (TextView) findViewById(z4c0.f201497T0);
        TextView textView4 = (TextView) findViewById(z4c0.f201501V0);
        boolean z = this.f37037m;
        if (z || this.f37038n) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f37037m ? 11.0f : 12.0f);
            xdl0.m208404u0(textView, this.f37039o);
            xdl0.m208404u0(textView3, this.f37039o);
            xdl0.m208404u0(textView2, this.f37039o);
            xdl0.m208404u0(textView4, this.f37039o);
            ViewGroup.LayoutParams layoutParams = this.f37034j.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37039o);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37034j.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f37039o);
            ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f37039o);
            ViewGroup.LayoutParams layoutParams4 = autoVDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f37039o);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f37039o);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f37039o);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37039o);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f37039o);
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

    /* JADX INFO: renamed from: d */
    public final void m56261d() {
        xdl0.m208344M(this.f37033i, true);
        QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = (QuickChatPrivilegeAnimView) findViewById(z4c0.f201465D0);
        this.f37041q = quickChatPrivilegeAnimView;
        if (this.f37037m || this.f37038n) {
            ViewGroup.LayoutParams layoutParams = quickChatPrivilegeAnimView.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37039o);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f37041q.getLayoutParams();
            float f = layoutParams2.topMargin;
            float f2 = this.f37039o;
            layoutParams2.topMargin = (int) (f * f2);
            this.f37041q.setScaleX(f2);
            this.f37041q.setScaleY(this.f37039o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56262e() {
        VipIntroPage3 vipIntroPage3;
        xdl0.m208344M(this.f37032h, true);
        this.f37040p = (ExplodeLayout) findViewById(z4c0.f201475I0);
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        User userM30483v5 = CoreModule.f17545c.f19687u0.m30483v5();
        boolean zMo33608vb = CoreModule.m29935P().m94651a().mo33608vb(userM30483v5, c4719aM30471r5);
        VText vText = this.f37036l;
        if (zMo33608vb) {
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            VText vText2 = this.f37036l;
            vipIntroPage3 = this;
            vText.setText(coreBusinessServiceM94651a.mo33476ca(userM30483v5, vipIntroPage3, vText2, (int) vText2.getTextSize(), (int) this.f37036l.getTextSize()));
        } else {
            vipIntroPage3 = this;
            vText.setText(c8e0.m105784e(c4719aM30471r5 == null ? 0 : c4719aM30471r5.f19270b));
        }
        vipIntroPage3.f37040p.setScale(0.72f);
        if (vipIntroPage3.f37037m || vipIntroPage3.f37038n) {
            ViewGroup.LayoutParams layoutParams = vipIntroPage3.f37040p.getLayoutParams();
            float f = layoutParams.height;
            float f2 = vipIntroPage3.f37039o;
            layoutParams.height = (int) (f * f2);
            vipIntroPage3.f37040p.setScale(f2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m56263f() {
        if (NullChecker.m81303a(this.f37040p)) {
            this.f37040p.m54228l(true);
        } else if (NullChecker.m81303a(this.f37041q)) {
            this.f37041q.m54310u0(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56258a(this);
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37037m = hmb.m131712q1();
        this.f37038n = hmb.m131711p1();
        this.f37039o = this.f37037m ? 0.7f : 0.9f;
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37037m = hmb.m131712q1();
        this.f37038n = hmb.m131711p1();
        this.f37039o = this.f37037m ? 0.7f : 0.9f;
    }
}
