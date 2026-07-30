package com.p051p1.mobile.putong.core.p058ui.vip;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.QuickChatPrivilegeAnimView;
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
import p153l.hge0;
import p153l.jbc0;
import p153l.qa00;
import p153l.rbb0;
import p153l.rql0;
import p153l.tu0;
import p153l.uqb0;
import p153l.vnb;
import p153l.wj90;

/* JADX INFO: loaded from: classes12.dex */
public class VipIntroPage3 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ViewStub f37873a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37874b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37875c;

    /* JADX INFO: renamed from: d */
    public ViewStub f37876d;

    /* JADX INFO: renamed from: e */
    public ViewStub f37877e;

    /* JADX INFO: renamed from: f */
    public ViewStub f37878f;

    /* JADX INFO: renamed from: g */
    public ViewStub f37879g;

    /* JADX INFO: renamed from: h */
    public ViewStub f37880h;

    /* JADX INFO: renamed from: i */
    public ViewStub f37881i;

    /* JADX INFO: renamed from: j */
    public ViewStub f37882j;

    /* JADX INFO: renamed from: k */
    public VText f37883k;

    /* JADX INFO: renamed from: l */
    public VText f37884l;

    /* JADX INFO: renamed from: m */
    public boolean f37885m;

    /* JADX INFO: renamed from: n */
    public boolean f37886n;

    /* JADX INFO: renamed from: o */
    public float f37887o;

    /* JADX INFO: renamed from: p */
    public ExplodeLayout f37888p;

    /* JADX INFO: renamed from: q */
    public QuickChatPrivilegeAnimView f37889q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.VipIntroPage3$a */
    public static /* synthetic */ class C9108a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37890a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37890a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37890a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37890a[Privilege.vip_independent_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37890a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37890a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37890a[Privilege.vip_unlimited_likes.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37890a[Privilege.message_read_state.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37890a[Privilege.privacy_membership.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37890a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37890a[Privilege.recover_unmatches.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37890a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37890a[Privilege.see_who_likes_me.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37890a[Privilege.online_match_tickets.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public VipIntroPage3(Context context) {
        super(context);
        this.f37885m = vnb.m201957q1();
        this.f37886n = vnb.m201956p1();
        this.f37887o = this.f37885m ? 0.7f : 0.9f;
    }

    /* JADX INFO: renamed from: a */
    public final void m57441a(View view) {
        rql0.m182646a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57442b(a690 a690Var) {
        this.f37884l.setMaxLines(CoreModule.m30933P().m143405a().mo34510h5() ? 2 : 1);
        boolean z = a690Var.m96306l() == null;
        bnl0.m105524M(this.f37883k, !z);
        this.f37883k.setText(a690Var.m96314t());
        this.f37884l.setText(a690Var.m96294d());
        boolean z2 = this.f37885m;
        if (z2 || this.f37886n) {
            this.f37883k.setTextSize(z2 ? 16.0f : 17.0f);
            this.f37884l.setTextSize(this.f37885m ? 12.0f : 13.0f);
        }
        this.f37884l.getLayoutParams().height = CoreModule.m30933P().m143405a().mo34510h5() ? qa00.m175859d(44.0f) : qa00.f156333t;
        if (!z && CoreModule.m30933P().m143405a().mo34510h5()) {
            this.f37883k.setTypeface(Typeface.DEFAULT_BOLD);
        }
        if (z) {
            bnl0.m105524M(this.f37873a, true);
            VDraweeView vDraweeView = (VDraweeView) findViewById(fdc0.f98387a0);
            if (this.f37885m || this.f37886n) {
                ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                layoutParams.width = (int) (layoutParams.width * this.f37887o);
                ViewGroup.LayoutParams layoutParams2 = vDraweeView.getLayoutParams();
                layoutParams2.height = (int) (layoutParams2.height * this.f37887o);
                ((LinearLayout.LayoutParams) this.f37873a.getLayoutParams()).topMargin = qa00.m175859d(this.f37885m ? 12.0f : 13.0f);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f37884l.getLayoutParams();
                layoutParams3.topMargin = (int) (layoutParams3.topMargin + (qa00.f156332s * this.f37887o));
            } else {
                ((LinearLayout.LayoutParams) this.f37884l.getLayoutParams()).topMargin += qa00.f156332s;
            }
            uqb0.f180374G.m127138Y0(vDraweeView, a690Var.m96304j());
        }
        switch (C9108a.f37890a[a690Var.m96306l().ordinal()]) {
            case 1:
                bnl0.m105524M(this.f37874b, true);
                AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(fdc0.f98395d);
                VText vText = (VText) findViewById(fdc0.f98421l1);
                VImage vImage = (VImage) findViewById(fdc0.f98384Z);
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                autoVDraweeView.setImageUrl(userM116600p9.m61308fp().url);
                vText.setText(userM116600p9.name);
                vImage.setImageResource(CoreModule.m30933P().m143408e().mo35991ul());
                Drawable drawableM192702b = tu0.m192702b(getContext(), CoreModule.m30933P().m143408e().mo35982cc());
                drawableM192702b.setBounds(0, 0, drawableM192702b.getMinimumWidth(), drawableM192702b.getMinimumHeight());
                vText.setCompoundDrawables(null, null, drawableM192702b, null);
                VDraweeView vDraweeView2 = (VDraweeView) findViewById(fdc0.f98407h);
                bnl0.m105524M(vDraweeView2, CoreModule.m30933P().m143405a().mo34510h5());
                if (this.f37885m || this.f37886n) {
                    FrameLayout frameLayout = (FrameLayout) findViewById(fdc0.f98398e);
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams4.width = (int) (layoutParams4.width * this.f37887o);
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams5.height = (int) (layoutParams5.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams6.topMargin = (int) (layoutParams6.topMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) vDraweeView2.getLayoutParams();
                    layoutParams7.width = (int) (layoutParams7.width * this.f37887o);
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) vDraweeView2.getLayoutParams();
                    layoutParams8.height = (int) (layoutParams8.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) autoVDraweeView.getLayoutParams();
                    layoutParams9.width = (int) (layoutParams9.width * this.f37887o);
                    FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) autoVDraweeView.getLayoutParams();
                    layoutParams10.height = (int) (layoutParams10.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams11.width = (int) (layoutParams11.width * this.f37887o);
                    FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams12.height = (int) (layoutParams12.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) vImage.getLayoutParams();
                    layoutParams14.rightMargin = (int) (layoutParams14.rightMargin * this.f37887o);
                    vText.setTextSize(this.f37885m ? 16.0f : 17.0f);
                    FrameLayout.LayoutParams layoutParams15 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams15.leftMargin = (int) (layoutParams15.leftMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams16 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams16.rightMargin = (int) (layoutParams16.rightMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams17 = (FrameLayout.LayoutParams) vText.getLayoutParams();
                    layoutParams17.bottomMargin = (int) (layoutParams17.bottomMargin * this.f37887o);
                    RoundingParams roundingParamsM207055p = autoVDraweeView.getHierarchy().m207055p();
                    roundingParamsM207055p.m8317q(roundingParamsM207055p.m8305e() * this.f37887o);
                    autoVDraweeView.getHierarchy().m207045H(roundingParamsM207055p);
                }
                break;
            case 2:
            case 3:
                bnl0.m105524M(this.f37875c, true);
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
                if (this.f37885m || this.f37886n) {
                    ViewGroup.LayoutParams layoutParams18 = autoVDraweeView2.getLayoutParams();
                    layoutParams18.width = (int) (layoutParams18.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams19 = autoVDraweeView2.getLayoutParams();
                    layoutParams19.height = (int) (layoutParams19.height * this.f37887o);
                    ViewGroup.LayoutParams layoutParams20 = autoVDraweeView3.getLayoutParams();
                    layoutParams20.width = (int) (layoutParams20.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams21 = autoVDraweeView3.getLayoutParams();
                    layoutParams21.height = (int) (layoutParams21.height * this.f37887o);
                    ViewGroup.LayoutParams layoutParams22 = imageView.getLayoutParams();
                    layoutParams22.width = (int) (layoutParams22.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams23 = imageView.getLayoutParams();
                    layoutParams23.height = (int) (layoutParams23.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams24 = (FrameLayout.LayoutParams) autoVDraweeView2.getLayoutParams();
                    layoutParams24.leftMargin = (int) (layoutParams24.leftMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams25 = (FrameLayout.LayoutParams) autoVDraweeView3.getLayoutParams();
                    layoutParams25.rightMargin = (int) (layoutParams25.rightMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams26 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    float f = layoutParams26.topMargin;
                    float f2 = this.f37887o;
                    layoutParams26.topMargin = (int) (f * f2);
                    bnl0.m105584u0(autoVDraweeView2, f2);
                    bnl0.m105584u0(autoVDraweeView3, this.f37887o);
                    RoundingParams roundingParamsM207055p2 = autoVDraweeView2.getHierarchy().m207055p();
                    roundingParamsM207055p2.m8317q(roundingParamsM207055p2.m8305e() * this.f37887o);
                    autoVDraweeView2.getHierarchy().m207045H(roundingParamsM207055p2);
                    RoundingParams roundingParamsM207055p3 = autoVDraweeView3.getHierarchy().m207055p();
                    roundingParamsM207055p3.m8317q(roundingParamsM207055p3.m8305e() * this.f37887o);
                    autoVDraweeView3.getHierarchy().m207045H(roundingParamsM207055p3);
                }
                break;
            case 4:
                bnl0.m105524M(this.f37876d, true);
                FrameLayout frameLayout2 = (FrameLayout) findViewById(fdc0.f98438s);
                VImage vImage2 = (VImage) findViewById(fdc0.f98412i1);
                AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) findViewById(fdc0.f98404g);
                AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) findViewById(fdc0.f98410i);
                VImage vImage3 = (VImage) findViewById(fdc0.f98384Z);
                if (NullChecker.m82486a(rbb0.m180740m())) {
                    bnl0.m105524M(frameLayout2, true);
                    bnl0.m105524M(vImage2, false);
                    autoVDraweeView4.setImageUrl(rbb0.m180740m().m61308fp().url);
                    uqb0.f180374G.m127138Y0(autoVDraweeView5, c17.m107528u0() ? jbc0.f119859zc : jbc0.f119845yc);
                } else {
                    bnl0.m105524M(frameLayout2, false);
                    bnl0.m105524M(vImage2, true);
                    vImage2.setImageResource(c17.m107528u0() ? jbc0.f119183Cc : jbc0.f119155Ac);
                }
                if (this.f37885m || this.f37886n) {
                    bnl0.m105584u0(frameLayout2, this.f37887o);
                    ViewGroup.LayoutParams layoutParams27 = autoVDraweeView4.getLayoutParams();
                    layoutParams27.width = (int) (layoutParams27.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams28 = autoVDraweeView4.getLayoutParams();
                    layoutParams28.height = (int) (layoutParams28.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams29 = (FrameLayout.LayoutParams) autoVDraweeView4.getLayoutParams();
                    float f3 = layoutParams29.leftMargin;
                    float f4 = this.f37887o;
                    layoutParams29.leftMargin = (int) (f3 * f4);
                    bnl0.m105584u0(autoVDraweeView4, f4);
                    ViewGroup.LayoutParams layoutParams30 = autoVDraweeView5.getLayoutParams();
                    layoutParams30.width = (int) (layoutParams30.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams31 = autoVDraweeView5.getLayoutParams();
                    layoutParams31.height = (int) (layoutParams31.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams32 = (FrameLayout.LayoutParams) autoVDraweeView5.getLayoutParams();
                    float f5 = layoutParams32.rightMargin;
                    float f6 = this.f37887o;
                    layoutParams32.rightMargin = (int) (f5 * f6);
                    bnl0.m105584u0(autoVDraweeView5, f6);
                    ViewGroup.LayoutParams layoutParams33 = vImage3.getLayoutParams();
                    layoutParams33.width = (int) (layoutParams33.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams34 = vImage3.getLayoutParams();
                    layoutParams34.height = (int) (layoutParams34.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams35 = (FrameLayout.LayoutParams) vImage3.getLayoutParams();
                    layoutParams35.topMargin = (int) (layoutParams35.topMargin * this.f37887o);
                    ViewGroup.LayoutParams layoutParams36 = vImage2.getLayoutParams();
                    layoutParams36.width = (int) (layoutParams36.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams37 = vImage2.getLayoutParams();
                    layoutParams37.height = (int) (layoutParams37.height * this.f37887o);
                }
                break;
            case 5:
                bnl0.m105524M(this.f37877e, true);
                VImage vImage4 = (VImage) findViewById(fdc0.f98384Z);
                if (this.f37885m || this.f37886n) {
                    ViewGroup.LayoutParams layoutParams38 = vImage4.getLayoutParams();
                    layoutParams38.width = (int) (layoutParams38.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams39 = vImage4.getLayoutParams();
                    layoutParams39.height = (int) (layoutParams39.height * this.f37887o);
                }
                break;
            case 6:
                bnl0.m105524M(this.f37878f, true);
                FrameLayout frameLayout3 = (FrameLayout) findViewById(fdc0.f98438s);
                VImage vImage5 = (VImage) findViewById(fdc0.f98412i1);
                AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) findViewById(fdc0.f98404g);
                AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) findViewById(fdc0.f98410i);
                if (NullChecker.m82486a(rbb0.m180741n())) {
                    bnl0.m105524M(frameLayout3, true);
                    bnl0.m105524M(vImage5, false);
                    uqb0.f180374G.m127138Y0(autoVDraweeView6, c17.m107528u0() ? jbc0.f119859zc : jbc0.f119845yc);
                    autoVDraweeView7.setImageUrl(rbb0.m180741n().m61308fp().url);
                } else {
                    bnl0.m105524M(frameLayout3, false);
                    bnl0.m105524M(vImage5, true);
                    vImage5.setImageResource(c17.m107528u0() ? jbc0.f119239Gc : jbc0.f119197Dc);
                }
                if (this.f37885m || this.f37886n) {
                    ViewGroup.LayoutParams layoutParams40 = vImage5.getLayoutParams();
                    layoutParams40.width = (int) (layoutParams40.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams41 = vImage5.getLayoutParams();
                    layoutParams41.height = (int) (layoutParams41.height * this.f37887o);
                    ViewGroup.LayoutParams layoutParams42 = autoVDraweeView6.getLayoutParams();
                    layoutParams42.width = (int) (layoutParams42.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams43 = autoVDraweeView6.getLayoutParams();
                    layoutParams43.height = (int) (layoutParams43.height * this.f37887o);
                    ViewGroup.LayoutParams layoutParams44 = autoVDraweeView7.getLayoutParams();
                    layoutParams44.width = (int) (layoutParams44.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams45 = autoVDraweeView7.getLayoutParams();
                    layoutParams45.height = (int) (layoutParams45.height * this.f37887o);
                    VImage vImage6 = (VImage) findViewById(fdc0.f98384Z);
                    ViewGroup.LayoutParams layoutParams46 = vImage6.getLayoutParams();
                    layoutParams46.width = (int) (layoutParams46.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams47 = vImage6.getLayoutParams();
                    layoutParams47.height = (int) (layoutParams47.height * this.f37887o);
                    FrameLayout.LayoutParams layoutParams48 = (FrameLayout.LayoutParams) autoVDraweeView6.getLayoutParams();
                    layoutParams48.leftMargin = (int) (layoutParams48.leftMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams49 = (FrameLayout.LayoutParams) autoVDraweeView7.getLayoutParams();
                    layoutParams49.rightMargin = (int) (layoutParams49.rightMargin * this.f37887o);
                    FrameLayout.LayoutParams layoutParams50 = (FrameLayout.LayoutParams) vImage6.getLayoutParams();
                    float f7 = layoutParams50.topMargin;
                    float f8 = this.f37887o;
                    layoutParams50.topMargin = (int) (f7 * f8);
                    bnl0.m105584u0(frameLayout3, f8);
                    bnl0.m105584u0(autoVDraweeView6, this.f37887o);
                    bnl0.m105584u0(autoVDraweeView7, this.f37887o);
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                bnl0.m105524M(this.f37879g, true);
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
                if (this.f37885m || this.f37886n) {
                    ViewGroup.LayoutParams layoutParams51 = vImage7.getLayoutParams();
                    layoutParams51.width = (int) (layoutParams51.width * this.f37887o);
                    ViewGroup.LayoutParams layoutParams52 = vImage7.getLayoutParams();
                    layoutParams52.height = (int) (layoutParams52.height * this.f37887o);
                    LinearLayout.LayoutParams layoutParams53 = (LinearLayout.LayoutParams) this.f37879g.getLayoutParams();
                    layoutParams53.topMargin = (int) (layoutParams53.topMargin * this.f37887o);
                }
                break;
            case 11:
                m57443c();
                break;
            case 12:
                m57445e();
                break;
            case 13:
                m57444d();
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m57443c() {
        bnl0.m105524M(this.f37882j, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(fdc0.f98399e0);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) findViewById(fdc0.f98378W);
        FrameLayout frameLayout = (FrameLayout) findViewById(fdc0.f98364P);
        LinearLayout linearLayout = (LinearLayout) findViewById(fdc0.f98435q0);
        TextView textView = (TextView) findViewById(fdc0.f98371S0);
        TextView textView2 = (TextView) findViewById(fdc0.f98375U0);
        TextView textView3 = (TextView) findViewById(fdc0.f98373T0);
        TextView textView4 = (TextView) findViewById(fdc0.f98377V0);
        boolean z = this.f37885m;
        if (z || this.f37886n) {
            textView2.setTextSize(z ? 12.0f : 13.0f);
            textView4.setTextSize(this.f37885m ? 11.0f : 12.0f);
            bnl0.m105584u0(textView, this.f37887o);
            bnl0.m105584u0(textView3, this.f37887o);
            bnl0.m105584u0(textView2, this.f37887o);
            bnl0.m105584u0(textView4, this.f37887o);
            ViewGroup.LayoutParams layoutParams = this.f37882j.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37887o);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f37882j.getLayoutParams();
            layoutParams2.topMargin = (int) (layoutParams2.topMargin * this.f37887o);
            ViewGroup.LayoutParams layoutParams3 = autoVDraweeView.getLayoutParams();
            layoutParams3.width = (int) (layoutParams3.width * this.f37887o);
            ViewGroup.LayoutParams layoutParams4 = autoVDraweeView.getLayoutParams();
            layoutParams4.height = (int) (layoutParams4.height * this.f37887o);
            ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
            layoutParams5.width = (int) (layoutParams5.width * this.f37887o);
            ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
            layoutParams6.height = (int) (layoutParams6.height * this.f37887o);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams7.leftMargin = (int) (layoutParams7.leftMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams8.bottomMargin = (int) (layoutParams8.bottomMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams9.rightMargin = (int) (layoutParams9.rightMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams10.bottomMargin = (int) (layoutParams10.bottomMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams11.topMargin = (int) (layoutParams11.topMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams12 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams12.rightMargin = (int) (layoutParams12.rightMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams13 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams13.topMargin = (int) (layoutParams13.topMargin * this.f37887o);
            FrameLayout.LayoutParams layoutParams14 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams14.bottomMargin = (int) (layoutParams14.bottomMargin * this.f37887o);
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

    /* JADX INFO: renamed from: d */
    public final void m57444d() {
        bnl0.m105524M(this.f37881i, true);
        QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = (QuickChatPrivilegeAnimView) findViewById(fdc0.f98341D0);
        this.f37889q = quickChatPrivilegeAnimView;
        if (this.f37885m || this.f37886n) {
            ViewGroup.LayoutParams layoutParams = quickChatPrivilegeAnimView.getLayoutParams();
            layoutParams.height = (int) (layoutParams.height * this.f37887o);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f37889q.getLayoutParams();
            float f = layoutParams2.topMargin;
            float f2 = this.f37887o;
            layoutParams2.topMargin = (int) (f * f2);
            this.f37889q.setScaleX(f2);
            this.f37889q.setScaleY(this.f37887o);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m57445e() {
        VipIntroPage3 vipIntroPage3;
        bnl0.m105524M(this.f37880h, true);
        this.f37888p = (ExplodeLayout) findViewById(fdc0.f98351I0);
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
        boolean zMo34611vb = CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5);
        VText vText = this.f37884l;
        if (zMo34611vb) {
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            VText vText2 = this.f37884l;
            vipIntroPage3 = this;
            vText.setText(coreBusinessServiceM143405a.mo34479ca(userM31491x5, vipIntroPage3, vText2, (int) vText2.getTextSize(), (int) this.f37884l.getTextSize()));
        } else {
            vipIntroPage3 = this;
            vText.setText(hge0.m134921e(c4870aM31479t5 == null ? 0 : c4870aM31479t5.f20012b));
        }
        vipIntroPage3.f37888p.setScale(0.72f);
        if (vipIntroPage3.f37885m || vipIntroPage3.f37886n) {
            ViewGroup.LayoutParams layoutParams = vipIntroPage3.f37888p.getLayoutParams();
            float f = layoutParams.height;
            float f2 = vipIntroPage3.f37887o;
            layoutParams.height = (int) (f * f2);
            vipIntroPage3.f37888p.setScale(f2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m57446f() {
        if (NullChecker.m82486a(this.f37888p)) {
            this.f37888p.m55411l(true);
        } else if (NullChecker.m82486a(this.f37889q)) {
            this.f37889q.m55493u0(0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57441a(this);
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37885m = vnb.m201957q1();
        this.f37886n = vnb.m201956p1();
        this.f37887o = this.f37885m ? 0.7f : 0.9f;
    }

    public VipIntroPage3(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37885m = vnb.m201957q1();
        this.f37886n = vnb.m201956p1();
        this.f37887o = this.f37885m ? 0.7f : 0.9f;
    }
}
