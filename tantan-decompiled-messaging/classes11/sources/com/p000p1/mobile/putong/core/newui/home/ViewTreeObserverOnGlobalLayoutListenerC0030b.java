package com.p000p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.DraweeView;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p000p1.mobile.putong.core.newui.home.views.CardStackShadowView;
import com.p000p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.C0426b;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Figure;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.RadarRipple;
import com.p1.mobile.putong.core.ui.campus.StudentInfoAct;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.helpers.ProfileCreateData;
import com.p1.mobile.putong.core.ui.profile.views.HomeCardTopNameViewBar;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import l.a3v;
import l.a6j;
import l.abi;
import l.adi0;
import l.az50;
import l.b7e0;
import l.baj;
import l.bo5;
import l.bt0;
import l.bx6;
import l.c3v;
import l.cfl0;
import l.cjl0;
import l.co5;
import l.cp60;
import l.d30;
import l.d8e0;
import l.da;
import l.dbl0;
import l.dd80;
import l.dm3;
import l.du2;
import l.e16;
import l.e30;
import l.e3v;
import l.e51;
import l.ebe0;
import l.eor;
import l.ezc0;
import l.f6c0;
import l.fap;
import l.g6a;
import l.gb0;
import l.gqf0;
import l.gvw;
import l.gx5;
import l.hdb0;
import l.hei0;
import l.hmb;
import l.idr;
import l.ip20;
import l.iwg0;
import l.j760;
import l.j8w;
import l.jb0;
import l.ji50;
import l.jo0;
import l.jo5;
import l.jth0;
import l.k1j;
import l.l0t;
import l.lac0;
import l.lsi0;
import l.m8p;
import l.mah0;
import l.mep0;
import l.mkd0;
import l.myc0;
import l.n3b0;
import l.ni50;
import l.nkp;
import l.o6j0;
import l.oci0;
import l.od2;
import l.ogl0;
import l.ool0;
import l.pm10;
import l.q8p;
import l.qgp0;
import l.qib0;
import l.qlm;
import l.qob0;
import l.qol0;
import l.qsh0;
import l.qx5;
import l.r200;
import l.roj0;
import l.rxg0;
import l.rza;
import l.s7m;
import l.s8l;
import l.sb90;
import l.snb0;
import l.swh0;
import l.sx30;
import l.t100;
import l.twf;
import l.u4c0;
import l.u59;
import l.upa;
import l.uq40;
import l.ura;
import l.v930;
import l.v9j;
import l.vdj;
import l.vwb;
import l.vxg0;
import l.w0c;
import l.w0c0;
import l.w9j;
import l.wc80;
import l.wh5;
import l.wp0;
import l.wpo;
import l.x2c0;
import l.xck0;
import l.xdl0;
import l.xij0;
import l.xwb0;
import l.y9j;
import l.ya5;
import l.yd7;
import l.ygh0;
import l.yor;
import l.z0c0;
import l.zbc0;
import l.zh40;
import l.zq20;
import l.zvf0;
import l.zzc0;
import p009l.a5m;
import p009l.adi;
import p009l.al4;
import p009l.am4;
import p009l.chj0;
import p009l.d5m;
import p009l.d90;
import p009l.e5l;
import p009l.e5m;
import p009l.ehj0;
import p009l.fdi;
import p009l.gei;
import p009l.gk8;
import p009l.id50;
import p009l.jj4;
import p009l.jtk;
import p009l.juk;
import p009l.kol;
import p009l.mdj0;
import p009l.mjj;
import p009l.mol;
import p009l.mqi0;
import p009l.nsl;
import p009l.nt30;
import p009l.o7r;
import p009l.oql;
import p009l.osl;
import p009l.pon;
import p009l.psl;
import p009l.psq;
import p009l.q8m;
import p009l.qff0;
import p009l.qj20;
import p009l.qsl;
import p009l.sbp;
import p009l.t9e0;
import p009l.u0l;
import p009l.ubo;
import p009l.v4e;
import p009l.va40;
import p009l.w4e;
import p009l.w73;
import p009l.w85;
import p009l.wsf0;
import p009l.x4e;
import p009l.y8i0;
import p009l.y93;
import p009l.yij0;
import p009l.ykf;
import p009l.yni;
import p009l.zi0;
import p009l.znl;
import p009l.zo0;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VFrame_Squared;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC0030b implements s7m<nt30>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: H1 */
    public static boolean f637H1 = true;

    /* JADX INFO: renamed from: I1 */
    public static n f638I1 = new n();

    /* JADX INFO: renamed from: A */
    public VDraweeView f639A;

    /* JADX INFO: renamed from: B */
    public HomeEmptyCardView f641B;

    /* JADX INFO: renamed from: B1 */
    public n f642B1;

    /* JADX INFO: renamed from: C */
    public HomeErrorNetView f643C;

    /* JADX INFO: renamed from: C1 */
    public n f644C1;

    /* JADX INFO: renamed from: D */
    public HomeErrorNetView f645D;

    /* JADX INFO: renamed from: E */
    public VImage f647E;

    /* JADX INFO: renamed from: E0 */
    public wsf0 f648E0;

    /* JADX INFO: renamed from: F */
    public VText f650F;

    /* JADX INFO: renamed from: F1 */
    public String f652F1;

    /* JADX INFO: renamed from: G */
    public VButton f653G;

    /* JADX INFO: renamed from: G1 */
    public int f655G1;

    /* JADX INFO: renamed from: H */
    public final Act f656H;

    /* JADX INFO: renamed from: H0 */
    public kol f657H0;

    /* JADX INFO: renamed from: I */
    public final NewNewHomeFrag f658I;

    /* JADX INFO: renamed from: I0 */
    public ProfileCardStackOpt f659I0;

    /* JADX INFO: renamed from: J */
    public nt30 f660J;

    /* JADX INFO: renamed from: J0 */
    public osl f661J0;

    /* JADX INFO: renamed from: K */
    @Nullable
    public pon f662K;

    /* JADX INFO: renamed from: K0 */
    public HomeViewUSLayout f663K0;

    /* JADX INFO: renamed from: M */
    public C0107c f666M;

    /* JADX INFO: renamed from: N */
    public String f668N;

    /* JADX INFO: renamed from: N0 */
    public CardStackShadowView f669N0;

    /* JADX INFO: renamed from: O */
    public int f670O;

    /* JADX INFO: renamed from: O0 */
    public HomeCardTopNameViewBar f671O0;

    /* JADX INFO: renamed from: T */
    public chj0 f680T;

    /* JADX INFO: renamed from: U */
    public qsl f682U;

    /* JADX INFO: renamed from: V */
    public Animator f684V;

    /* JADX INFO: renamed from: W */
    public Animator f686W;

    /* JADX INFO: renamed from: W0 */
    public iwg0 f687W0;

    /* JADX INFO: renamed from: X0 */
    public ExpandedFakeProfileTitle f689X0;

    /* JADX INFO: renamed from: Y */
    public boolean f690Y;

    /* JADX INFO: renamed from: Y0 */
    public mdj0 f691Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f692Z;

    /* JADX INFO: renamed from: Z0 */
    public e30 f693Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f694a;

    /* JADX INFO: renamed from: a1 */
    public int f695a1;

    /* JADX INFO: renamed from: b */
    public View f696b;

    /* JADX INFO: renamed from: b1 */
    public int f697b1;

    /* JADX INFO: renamed from: c */
    public VFrame f698c;

    /* JADX INFO: renamed from: c1 */
    public ebe0 f699c1;

    /* JADX INFO: renamed from: d */
    public VFrame f700d;

    /* JADX INFO: renamed from: d1 */
    public ji50 f701d1;

    /* JADX INFO: renamed from: e */
    public VLinear f702e;

    /* JADX INFO: renamed from: e1 */
    public ni50 f703e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f704f;

    /* JADX INFO: renamed from: f1 */
    public vxg0 f705f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f706g;

    /* JADX INFO: renamed from: g1 */
    public a6j f707g1;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f708h;

    /* JADX INFO: renamed from: h1 */
    public yor f709h1;

    /* JADX INFO: renamed from: i */
    public AppCompatImageView f710i;

    /* JADX INFO: renamed from: i1 */
    public qlm f711i1;

    /* JADX INFO: renamed from: j */
    public VFrame_Squared f712j;

    /* JADX INFO: renamed from: j1 */
    public twf f713j1;

    /* JADX INFO: renamed from: k */
    public VDraweeView f714k;

    /* JADX INFO: renamed from: k0 */
    public boolean f715k0;

    /* JADX INFO: renamed from: k1 */
    public cfl0 f716k1;

    /* JADX INFO: renamed from: l */
    public HomeEmptyCardView f717l;

    /* JADX INFO: renamed from: l1 */
    public b7e0 f718l1;

    /* JADX INFO: renamed from: m */
    public HomeErrorNetView f719m;

    /* JADX INFO: renamed from: m1 */
    public com.p1.mobile.putong.core.admob.a f720m1;

    /* JADX INFO: renamed from: n */
    public HomeErrorNetView f721n;

    /* JADX INFO: renamed from: n1 */
    public r200 f722n1;

    /* JADX INFO: renamed from: o */
    public VImage f723o;

    /* JADX INFO: renamed from: o1 */
    public gqf0 f724o1;

    /* JADX INFO: renamed from: p */
    public VText f725p;

    /* JADX INFO: renamed from: p0 */
    public boolean f726p0;

    /* JADX INFO: renamed from: p1 */
    public snb0 f727p1;

    /* JADX INFO: renamed from: q */
    public VButton f728q;

    /* JADX INFO: renamed from: q1 */
    public s8l f729q1;

    /* JADX INFO: renamed from: r */
    public SceneView f730r;

    /* JADX INFO: renamed from: r1 */
    public w73 f731r1;

    /* JADX INFO: renamed from: s */
    public VText f732s;

    /* JADX INFO: renamed from: s1 */
    public q8m f733s1;

    /* JADX INFO: renamed from: t */
    public ViewStub f734t;

    /* JADX INFO: renamed from: t1 */
    public fdi f735t1;

    /* JADX INFO: renamed from: u */
    public ViewStub f736u;

    /* JADX INFO: renamed from: u1 */
    public adi f737u1;

    /* JADX INFO: renamed from: v */
    public FrameLayout f738v;

    /* JADX INFO: renamed from: v1 */
    public t9e0 f739v1;

    /* JADX INFO: renamed from: w */
    public HomeTitleLayout f740w;

    /* JADX INFO: renamed from: w1 */
    public qob0 f741w1;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f742x;

    /* JADX INFO: renamed from: y */
    public AppCompatImageView f744y;

    /* JADX INFO: renamed from: y1 */
    public Animator f745y1;

    /* JADX INFO: renamed from: z */
    public VFrame_Squared f746z;

    /* JADX INFO: renamed from: L */
    public final Runnable f664L = new e();

    /* JADX INFO: renamed from: P */
    public final Runnable f672P = null;

    /* JADX INFO: renamed from: Q */
    public Runnable f674Q = null;

    /* JADX INFO: renamed from: R */
    public boolean f676R = true;

    /* JADX INFO: renamed from: S */
    public rx.subjects.a<Boolean> f678S = rx.subjects.a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: X */
    public boolean f688X = false;

    /* JADX INFO: renamed from: F0 */
    public long f651F0 = -1;

    /* JADX INFO: renamed from: G0 */
    public String f654G0 = "empty";

    /* JADX INFO: renamed from: L0 */
    public String f665L0 = "@@";

    /* JADX INFO: renamed from: M0 */
    public boolean f667M0 = false;

    /* JADX INFO: renamed from: P0 */
    public final int f673P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    public final int f675Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    public final int f677R0 = 2;

    /* JADX INFO: renamed from: S0 */
    public final int f679S0 = 3;

    /* JADX INFO: renamed from: T0 */
    public final int f681T0 = 4;

    /* JADX INFO: renamed from: U0 */
    public final int f683U0 = 5;

    /* JADX INFO: renamed from: V0 */
    public boolean f685V0 = false;

    /* JADX INFO: renamed from: x1 */
    public boolean f743x1 = true;

    /* JADX INFO: renamed from: z1 */
    public final Runnable f747z1 = new j();

    /* JADX INFO: renamed from: A1 */
    public final u0l f640A1 = new k();

    /* JADX INFO: renamed from: D1 */
    public final Runnable f646D1 = new Runnable() { // from class: l.ot30
        @Override // java.lang.Runnable
        public final void run() {
            ViewTreeObserverOnGlobalLayoutListenerC0030b.m1028c();
        }
    };

    /* JADX INFO: renamed from: E1 */
    public final am4<znl> f649E1 = new am4() { // from class: l.hu30
        @Override // p009l.am4
        /* JADX INFO: renamed from: d */
        public final Object mo11522d() {
            return this.f14252a.m1174P4();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$a */
    public class a implements w4e {
        public a() {
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: a */
        public void mo1359a() {
            zi0.f23685a = false;
            ygh0.R(ygh0.h);
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: b */
        public void mo1360b() {
            zi0.f23685a = false;
            if (!uq40.y(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f660J.f17660G.onNext(Boolean.TRUE);
            }
            ygh0.S(ygh0.h);
        }

        @Override // p009l.w4e
        /* JADX INFO: renamed from: c */
        public void mo1361c() {
            zi0.f23685a = true;
            ygh0.T(ygh0.h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$b */
    public class b implements v4e {
        public b() {
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: a */
        public void mo1362a() {
            zi0.f23685a = false;
            if (!uq40.y(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f660J.f17660G.onNext(Boolean.TRUE);
            }
            ygh0.f0(ygh0.h);
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: b */
        public void mo1363b(boolean z) {
            zi0.f23685a = false;
            ygh0.g0(ygh0.h, z);
        }

        @Override // p009l.v4e
        /* JADX INFO: renamed from: c */
        public void mo1364c() {
            zi0.f23685a = true;
            ygh0.h0(ygh0.h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$c */
    public class c implements oql {
        public c() {
        }

        @Override // p009l.oql
        /* JADX INFO: renamed from: B */
        public void mo1365B(int i, int i2, int i3, String str, int i4) {
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ViewTreeObserverOnGlobalLayoutListenerC0030b.this;
            if (i3 == 0) {
                viewTreeObserverOnGlobalLayoutListenerC0030b.f687W0.a(true);
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC0030b.f687W0.a(i == 0 && i4 == 0);
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b2 = ViewTreeObserverOnGlobalLayoutListenerC0030b.this;
            viewTreeObserverOnGlobalLayoutListenerC0030b2.m1110D5(i, i - viewTreeObserverOnGlobalLayoutListenerC0030b2.f655G1, i2, i3, str);
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f655G1 = i;
            if (!TextUtils.equals(str, "VirtualCard") && !TextUtils.equals(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f652F1, str) && i > 10) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f652F1 = str;
                User userPa = CoreModule.c.e0.Pa(str);
                if (NullChecker.a(userPa)) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f671O0.h(userPa);
                }
            }
            if (!NullChecker.a(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f661J0.getImmediatelyMatch()) || ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f661J0.getButtonScrolledDistance() <= 0) {
                return;
            }
            if (i > 5) {
                rxg0.u();
                com.p1.mobile.android.ui.bubble.d.l().k("bubble_odiamond_immediate_match_guide");
            }
            int iD = t100.d(20.0f);
            if ((i >= 5 || Math.abs(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f661J0.getButtonRootLayout().getTranslationY()) < ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f661J0.getButtonScrolledDistance() - 5) && i <= iD && i > 5) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1348x6();
            }
        }

        @Override // p009l.oql
        /* JADX INFO: renamed from: c0 */
        public void mo1366c0(int i, int i2, int i3, int i4, View view) {
            if (ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f689X0 == null || ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f689X0.f1360a == null) {
                return;
            }
            if (i > 0) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f689X0.f1360a.f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f689X0.f1360a.f(0.0f);
                return;
            }
            int iD = t100.d(44.0f);
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ViewTreeObserverOnGlobalLayoutListenerC0030b.this;
            if (i3 > iD) {
                viewTreeObserverOnGlobalLayoutListenerC0030b.f689X0.f1360a.f(1.0f);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0030b.f689X0.f1360a.f(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f751a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f751a = iArr;
            try {
                iArr[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f751a[VirtualCardType.SuperlikeGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f751a[VirtualCardType.UndoGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f751a[VirtualCardType.OnlineMatchBroadcastPeiLiaoCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f751a[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f751a[VirtualCardType.QuickAudioBroadcastCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f751a[VirtualCardType.AdCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f751a[VirtualCardType.LiveLivingCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f751a[VirtualCardType.LiveVoiceCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f751a[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f751a[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f751a[VirtualCardType.LiveMultipleCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f751a[VirtualCardType.FreeTrialRealUser.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f751a[VirtualCardType.FreeTrialOnline.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f751a[VirtualCardType.FreeTrialPopular.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f751a[VirtualCardType.LiveActiveCard.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f751a[VirtualCardType.ImpressSignalCard.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f751a[VirtualCardType.FakeCard.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f751a[VirtualCardType.IntlVipCard.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f751a[VirtualCardType.IntlSeeCard.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f751a[VirtualCardType.NativeAdViewCard.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f751a[VirtualCardType.MinBoostCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f751a[VirtualCardType.IntlFreeSpotlightCard.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f751a[VirtualCardType.IntlTextBuzzActiveCard.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f751a[VirtualCardType.IntlVoiceBuzzActiveCard.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f751a[VirtualCardType.IntlVideoBuzzActiveCard.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f751a[VirtualCardType.IntlPartnerActiveCard.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f751a[VirtualCardType.IntlRecallMembershipCard.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f751a[VirtualCardType.SayHiADCard.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f751a[VirtualCardType.BoostGuideCard.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f751a[VirtualCardType.AudioQuickChatPartyInvitationCard.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f751a[VirtualCardType.TextQuickChatPartyInvitationCard.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f751a[VirtualCardType.MarryAdCard.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f751a[VirtualCardType.ExpandedNewUserRightGuide.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f751a[VirtualCardType.BarLoverGuideCard.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f751a[VirtualCardType.FourSelectOneAdCard.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f751a[VirtualCardType.DailySelectionAdCard.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f751a[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f751a[VirtualCardType.FemaleVipGuideCard.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f751a[VirtualCardType.FemaleVerificationGuideCard.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f751a[VirtualCardType.NewUserSeeMyself.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f751a[VirtualCardType.QuestionOfNotVerify.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ViewTreeObserverOnGlobalLayoutListenerC0030b.this;
            if (viewTreeObserverOnGlobalLayoutListenerC0030b.f659I0 != null && viewTreeObserverOnGlobalLayoutListenerC0030b.m1136I6() == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f659I0.m2800E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$f */
    public class f implements com.p1.mobile.putong.core.ui.a.d {

        /* JADX INFO: renamed from: a */
        public String f753a;

        public f() {
        }

        /* JADX INFO: renamed from: a */
        public void m1367a() {
            e51.J(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1);
            this.f753a = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1314q6(-1);
        }

        public void release() {
            if (TextUtils.isEmpty(this.f753a)) {
                return;
            }
            e51.H(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$g */
    public class g implements VSwipeStack.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsf0 f755a;

        public g(wsf0 wsf0Var) {
            this.f755a = wsf0Var;
        }

        /* JADX INFO: renamed from: b */
        public void m1368b(boolean z, float f, CardProgressAction cardProgressAction) {
            if (NullChecker.a(this.f755a.mo2805d())) {
                if (f <= 0.0f) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1102C2().mo2400c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1316r2().mo2400c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1300o2().mo2399a(-f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f690Y = true;
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f692Z = false;
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f715k0 = false;
                    return;
                }
                ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = ViewTreeObserverOnGlobalLayoutListenerC0030b.this;
                if (z) {
                    viewTreeObserverOnGlobalLayoutListenerC0030b.m1102C2().mo2400c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1300o2().mo2400c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1316r2().mo2399a(f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f692Z = true;
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f690Y = false;
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f715k0 = false;
                    return;
                }
                viewTreeObserverOnGlobalLayoutListenerC0030b.m1316r2().mo2400c(cardProgressAction);
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1300o2().mo2400c(cardProgressAction);
                if (!upa.r1() || !NullChecker.a(this.f755a.mo2809j()) || !this.f755a.mo2809j().meetAgain) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1102C2().mo2399a(f, cardProgressAction);
                }
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f690Y = false;
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f692Z = false;
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f715k0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$h */
    public class h implements com.p1.mobile.putong.core.ui.a.d {

        /* JADX INFO: renamed from: a */
        public String f757a;

        public h() {
        }

        /* JADX INFO: renamed from: a */
        public void m1369a() {
            e51.J(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1);
            this.f757a = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1314q6(-1);
        }

        public void release() {
            if (TextUtils.isEmpty(this.f757a)) {
                return;
            }
            e51.H(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$i */
    public class i implements RequestCallback {
        public i() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f682U.mo15098l().stepToFrame(1.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f641B.m616v();
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1141J6();
            if (NullChecker.a(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f745y1) && ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f745y1.isRunning()) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f745y1.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$k */
    public class k extends u0l {
        public k() {
        }

        @Override // p009l.u0l, java.lang.Runnable
        public void run() {
            xdl0.M0(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f742x, true);
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1141J6();
            xdl0.M0(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f700d, true);
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1164N6(true);
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1159M6(false);
            if (!ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1328t5()) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1180Q5(false);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f745y1.start();
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f657H0.mo3128b();
            View viewFindViewWithTag = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1354z2().findViewWithTag(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1102C2().getRealView().getTag() + "child");
            if (NullChecker.a(viewFindViewWithTag)) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1354z2().removeView(viewFindViewWithTag);
            }
            ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1154M1(false);
            if (IntlCountryCodeController.v()) {
                if (NullChecker.a(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1117F2())) {
                    xdl0.M(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1117F2(), false);
                }
                if (NullChecker.a(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1132I2())) {
                    xdl0.M(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1132I2(), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$l */
    public class l implements CardOperationButton.InterfaceC0213b {

        /* JADX INFO: renamed from: a */
        public String f762a;

        public l() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: a */
        public void mo1370a() {
            e51.J(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1);
            jj4 jj4VarMo2814o = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f648E0.mo2814o();
            if (upa.r1() && NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17131e()) && jj4VarMo2814o.m17131e().meetAgain) {
                return;
            }
            this.f762a = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.m1314q6(-1);
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: b */
        public void mo1371b() {
            jj4 jj4VarMo2814o = ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f648E0.mo2814o();
            if ((upa.r1() && NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17131e()) && jj4VarMo2814o.m17131e().meetAgain) || TextUtils.isEmpty(this.f762a)) {
                return;
            }
            e51.H(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f646D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$m */
    public class m implements x4e {
        public m() {
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: a */
        public void mo1372a() {
            zi0.f23685a = false;
            if (!uq40.y(ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f656H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.this.f660J.f17660G.onNext(Boolean.TRUE);
            }
            ygh0.X(ygh0.h);
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: b */
        public void mo1373b() {
            zi0.f23685a = false;
            ygh0.Y(ygh0.h);
        }

        @Override // p009l.x4e
        /* JADX INFO: renamed from: c */
        public void mo1374c() {
            zi0.f23685a = true;
            ygh0.Z(ygh0.h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$n */
    public static class n implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f765c = zbc0.a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f766a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.a f767b;

        public n() {
            VLinear.a aVar = new VLinear.a();
            this.f767b = aVar;
            aVar.c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f766a <= f765c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f766a + 1;
                    this.f766a = i;
                    if (i > f765c) {
                        j760 j760VarB = this.f767b.b();
                        y.Q = ((Boolean) j760VarB.a).booleanValue();
                        y.R = ((Boolean) j760VarB.b).booleanValue();
                    }
                }
                this.f767b.a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m13742c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m13742c(false);
            }
            return false;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0030b(Act act, NewNewHomeFrag newNewHomeFrag, mdj0 mdj0Var) {
        this.f656H = act;
        this.f658I = newNewHomeFrag;
        this.f691Y0 = mdj0Var;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m994M(wsf0 wsf0Var, View view) {
        wsf0Var.mo2797A(SwipeDirection.UP);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "superlike")});
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m996N(View view) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Unit m1005R0(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m1010U(Throwable th) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m1020Y2() {
        m1271i2().setBackgroundResource(x2c0.p);
        if (m1328t5()) {
            m1180Q5(true);
        }
        final BoostViewContainer boostViewContainerM1265h2 = m1265h2();
        boostViewContainerM1265h2.m7955b(new e30() { // from class: l.dw30
            public final void call(Object obj) {
                this.f12015a.m1222Y3((View) obj);
            }
        }, new baj() { // from class: l.ew30
            /* JADX INFO: renamed from: a */
            public final Object m14114a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f12703a.m1227Z3(boostViewContainerM1265h2, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM1265h2.setSceneView(this.f730r);
        boostViewContainerM1265h2.setInterceptFunc(new v9j() { // from class: l.fw30
            public final Object call() {
                return Boolean.valueOf(this.f13185a.m1199T6());
            }
        });
        boostViewContainerM1265h2.m7954a(new y93() { // from class: l.gw30
            @Override // p009l.y93
            /* JADX INFO: renamed from: a */
            public final void mo15344a(int i2) {
                this.f13795a.m1237b4(boostViewContainerM1265h2, i2);
            }
        });
        m1271i2().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hw30
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f14263a.m1242c4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1028c() {
        com.p1.mobile.android.ui.bubble.d.l().k("bubble_superlike_bubble");
        rxg0.u();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Picture m1033e(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m1038f1(wsf0 wsf0Var, View view) {
        wsf0Var.mo2797A(SwipeDirection.UP);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "superlike")});
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ User m1045j(User user, User user2, Picture picture) {
        ArrayList arrayList = new ArrayList();
        ((Media) picture).labels = arrayList;
        arrayList.add(cp60.INSTANCE.h());
        Iterator it = user.pictures.iterator();
        while (it.hasNext()) {
            user2.pictures.add((Media) it.next());
        }
        user2.pictures.add(1, picture);
        return user2;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m1051l(wsf0 wsf0Var, View view) {
        wsf0Var.mo2797A(SwipeDirection.RIGHT);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "like")});
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m1053l1(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m1057n(View view) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m1073t0(wsf0 wsf0Var, View view) {
        wsf0Var.mo2797A(SwipeDirection.RIGHT);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "like")});
        }
    }

    /* JADX INFO: renamed from: A2 */
    public wsf0 m1092A2() {
        return this.f648E0;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ Boolean m1093A4(Boolean bool) {
        return Boolean.valueOf((bool.booleanValue() || this.f667M0) ? false : true);
    }

    /* JADX INFO: renamed from: A5 */
    public void m1094A5() {
        this.f660J.m19436i5();
        m1343w5();
        act().m3877Z5().m4091n0();
        m1165O1();
    }

    /* JADX INFO: renamed from: A6 */
    public void m1095A6(boolean z) {
        xdl0.M(this.f682U.getPosition(), z);
        if (lac0.m()) {
            if (z && da.Companion.k()) {
                xdl0.M(this.f682U.getPosition(), false);
            }
            lac0.i().p(z);
        }
        this.f660J.f17707p.onNext(Boolean.valueOf(z));
    }

    @Nullable
    /* JADX INFO: renamed from: B2 */
    public final View m1096B2() {
        if (!IntlCountryCodeController.v()) {
            return this.f661J0.getSuperLike().getRealView();
        }
        if (NullChecker.a(this.f663K0)) {
            return this.f663K0.f1657B;
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m1097B3() {
        return NullChecker.a(this.f661J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m1098B4(j760 j760Var) {
        return Boolean.valueOf(!this.f667M0);
    }

    /* JADX INFO: renamed from: B5 */
    public void m1099B5() {
        if (((Boolean) this.f678S.e()).booleanValue()) {
            this.f745y1.start();
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m1100B6(long j2) {
        if (m1122G2() != null && CoreModule.c.o3().undoLimit.remainToday() > 0) {
            String string = act().getString(R.string.bp, String.valueOf(CoreModule.c.o3().undoLimit.remainToday()));
            com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(act());
            com.p1.mobile.android.ui.bubble.d.l().k("bubble_undo_remaining");
            aVar.B(t100.d(2.0f)).D(string).k(new int[]{Color.parseColor("#ffbb00")}).l(t100.d(7.0f)).p(75).J(13.0f).x(t100.d(-4.0f)).b(j2).q(com.p1.mobile.android.ui.bubble.a.Q);
            com.p1.mobile.android.ui.bubble.d.l().u(aVar, m1122G2().getRealView(), "bubble_undo_remaining");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m1101C0() {
        return this.f656H;
    }

    /* JADX INFO: renamed from: C2 */
    public nsl m1102C2() {
        return this.f661J0.getSuperLike();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m1103C3() {
        return this.f726p0;
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m1104C4(j760 j760Var) {
        if (!((Boolean) j760Var.a).booleanValue() || ((Boolean) j760Var.b).booleanValue() || !NullChecker.a(this.f745y1) || this.f745y1.isRunning()) {
            return;
        }
        this.f667M0 = true;
        m1331u3();
        m1301o3();
        m1311q3(0);
        m1311q3(1);
        m1311q3(2);
        m1311q3(3);
        m1311q3(4);
        m1311q3(5);
    }

    /* JADX INFO: renamed from: C5 */
    public void m1105C5() {
        abi.y(true);
        this.f745y1.cancel();
        if (u59.d0()) {
            j8w.Companion.a().r1();
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m1106C6() {
        act().dialog().Z(17).c0(x2c0.ht).E0(R.string.E0).D(R.string.J0).v().r(Color.parseColor("#00000000")).B(false).x0(act().getResources().getDrawable(x2c0.yo)).v0(act().getString(R.string.F0), new Runnable() { // from class: l.qx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f19572a.m1319r5();
            }
        }).z().show();
    }

    /* JADX INFO: renamed from: D2 */
    public View m1107D2() {
        return this.f661J0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m1108D3() {
        return C0029a.INSTANCE.m957c() && cp60.INSTANCE.p(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m1109D4(Boolean bool) {
        return Boolean.valueOf(this.f667M0 && m1113E3());
    }

    /* JADX INFO: renamed from: D5 */
    public void m1110D5(int i2, int i3, int i4, int i5, String str) {
    }

    /* JADX INFO: renamed from: D6 */
    public void m1111D6(Intent intent) {
        this.f658I.startActivity(intent);
    }

    /* JADX INFO: renamed from: E2 */
    public VFrame_FlipContainer m1112E2() {
        return this.f661J0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: E3 */
    public final boolean m1113E3() {
        return C0029a.INSTANCE.m962h() && ubo.INSTANCE.m22780j(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m1114E4(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.M(this.f682U.mo15098l(), false);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: E5 */
    public void m1115E5() {
        m1285l2().setVisibility(8);
        if (NullChecker.a(this.f669N0)) {
            xdl0.M(this.f669N0, false);
        }
    }

    /* JADX INFO: renamed from: E6 */
    public void m1116E6(String str, int i2) {
        if (m1092A2() == null || m1092A2().mo2805d() == null || m1092A2().mo2814o() == null || m1092A2().mo2814o().m17130d() == null) {
            return;
        }
        qj20 qj20Var = new qj20(this.f649E1);
        User userM17130d = m1092A2().mo2814o().m17130d();
        sbp.m22052i(((DbObject) userM17130d).id);
        Intent intentZ2 = ProfileAct.z2(act(), ((DbObject) userM17130d).id, str, true, false, false);
        if (TextUtils.equals(((DbObject) userM17130d).id, (CharSequence) CoreModule.c.f0.J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentZ2.putExtra("profile_create_data", (Serializable) profileCreateData);
        }
        if (m1133I3()) {
            intentZ2.putExtra("long_time_no_see", true);
        }
        if ("from_city_center_conv_banner".equals(str) && NullChecker.a(m1092A2().mo2809j())) {
            intentZ2.putExtra("city_centre_data", (Serializable) m1092A2().mo2809j().cityCData);
        }
        if (m1092A2().mo2803b() || upa.N3()) {
            this.f658I.startActivityForResult(intentZ2, 18);
        } else {
            this.f658I.v4(intentZ2, 18, qj20Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: F2 */
    public LinearLayout m1117F2() {
        HomeViewUSLayout homeViewUSLayout = this.f663K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f1687z;
        }
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m1118F3() {
        return NullChecker.a(this.f661J0) && NullChecker.a(this.f661J0.getButtonsRightLayout()) && !xdl0.O0(this.f661J0.getButtonsRightLayout());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m1119F4(wsf0 wsf0Var, View view) {
        String str = (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0";
        o6j0.c("e_suggest_like_button", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("other_user_id", str), o6j0.a.h("from_top_tab", "")});
        o6j0.c("e_likeButton", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", str), o6j0.a.h("from_top_tab", "")});
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "like")});
        }
        m1188S1(wsf0Var, "like");
        if (m1199T6()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.RIGHT, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: F5 */
    public void m1120F5() {
        m1285l2().setVisibility(0);
        if (NullChecker.a(this.f661J0.getButtonsRightLayout()) && !xdl0.O0(this.f661J0.getButtonsRightLayout())) {
            xdl0.M(this.f661J0.getButtonsRightLayout(), true);
        }
        if (NullChecker.a(this.f669N0)) {
            xdl0.M(this.f669N0, true);
        }
        m1187R6();
        m1355z3();
    }

    /* JADX INFO: renamed from: F6 */
    public void m1121F6(String str, User user) {
        if (m1092A2() == null || m1092A2().mo2805d() == null || m1092A2().mo2814o() == null || m1092A2().mo2814o().m17130d() == null || user == null) {
            return;
        }
        Intent intentZ2 = ProfileAct.z2(act(), ((DbObject) user).id, str, true, false, false);
        if (TextUtils.equals(((DbObject) user).id, (CharSequence) CoreModule.c.f0.J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentZ2.putExtra("profile_create_data", (Serializable) profileCreateData);
        }
        this.f658I.startActivity(intentZ2);
    }

    /* JADX INFO: renamed from: G2 */
    public nsl m1122G2() {
        return this.f661J0.getUndo();
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m1123G3() {
        osl oslVar;
        return ogl0.G() && (oslVar = this.f661J0) != null && (oslVar instanceof ykf);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m1124G4(wsf0 wsf0Var, View view) {
        String str = (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0";
        o6j0.c("e_suggest_dislike_button", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("other_user_id", str), o6j0.a.h("from_top_tab", "")});
        o6j0.c("e_dislikeButton", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", str), o6j0.a.h("from_top_tab", "")});
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "dislike")});
        }
        m1188S1(wsf0Var, "dislike");
        if (m1199T6()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: G5 */
    public void m1125G5(boolean z) {
        this.f661J0.setSuperLikeComboIsSlowly(z);
        xdl0.M0(this.f661J0.getSuperLikeComboSvga(), true);
    }

    /* JADX INFO: renamed from: G6 */
    public void m1126G6() {
        KeyEvent.Callback callbackMo2805d = m1092A2().mo2805d();
        if (NullChecker.a(callbackMo2805d)) {
            if ((!(callbackMo2805d instanceof d5m) || ((d5m) callbackMo2805d).mo865k0()) && !(callbackMo2805d instanceof e5m)) {
                return;
            }
            ((ViewGroup) this.f656H.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.M0(this.f687W0.getRenderView(), false);
            this.f661J0.getSuperLikeComboSvga().stopAnimation(true);
            xdl0.M0(this.f661J0.getSuperLikeComboSvga(), false);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public View m1127H2() {
        return this.f661J0.getUndoLayout();
    }

    /* JADX INFO: renamed from: H3 */
    public final boolean m1128H3() {
        if (!C0029a.INSTANCE.m960f()) {
            return false;
        }
        cp60 cp60Var = cp60.INSTANCE;
        return cp60Var.k() > 0 && cp60Var.p(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: H5 */
    public void m1130H5() {
        if (this.f659I0 == null) {
            return;
        }
        e51.J(this.f664L);
        e51.H(act(), this.f664L, 150L);
    }

    /* JADX INFO: renamed from: H6 */
    public final void m1131H6(boolean z) {
        if (upa.K1() && CoreModule.c.z2.r3()) {
            lsi0.y("只看认证用户试用期间无法使用超级喜欢功能");
            return;
        }
        if ((az50.Companion.r() || q8p.Companion.x()) && NullChecker.a(m1092A2().mo2809j()) && m1092A2().mo2809j().isUserLikeMe()) {
            m1092A2().mo2797A(SwipeDirection.RIGHT);
            return;
        }
        o6j0.c("e_superlikeButton", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", (!NullChecker.a(m1092A2().mo2809j()) || m1092A2().mo2809j().isVirtualCard()) ? "0" : m1092A2().mo2809j().id), o6j0.a.i("is_privileged", !n3b0.t()), o6j0.a.h("showfrom_superlike", "home"), o6j0.a.h("from_top_tab", "")});
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "superlike")});
        }
        if (m1092A2() != null) {
            m1188S1(m1092A2(), "superlike");
        }
        if (m1199T6()) {
            return;
        }
        this.f660J.m19444j9(true, z);
    }

    @Nullable
    /* JADX INFO: renamed from: I2 */
    public ConstraintLayout m1132I2() {
        HomeViewUSLayout homeViewUSLayout = this.f663K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f1662a;
        }
        return null;
    }

    /* JADX INFO: renamed from: I3 */
    public final boolean m1133I3() {
        return upa.r1() && NullChecker.a(this.f648E0) && NullChecker.a(this.f648E0.mo2814o()) && NullChecker.a(this.f648E0.mo2814o().m17131e()) && this.f648E0.mo2814o().m17131e().meetAgain;
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m1134I4(Object obj) {
        this.f693Z0.call(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public void m1135I5() {
        this.f666M = null;
        this.f678S.onNext(Boolean.FALSE);
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final String m1136I6() {
        NewNewHomeFrag newNewHomeFrag = this.f658I;
        if (newNewHomeFrag == null) {
            return "homeFrag=null";
        }
        if (this.f726p0) {
            return "vm.isHidden=true";
        }
        if (newNewHomeFrag.isHidden()) {
            return "homeFrag.isHidden()=true (eg other home sub-tab or not shown)";
        }
        if (v930.h() != TabName.Card) {
            return "bottomTab=" + v930.h() + " (need Card)";
        }
        if (!(this.f658I.getParentFragment() instanceof psl)) {
            return "parent not IHomeLayoutFrag";
        }
        NewTanFragTag newTanFragTagMo2537T = this.f658I.getParentFragment().mo2537T();
        if (newTanFragTagMo2537T == NewTanFragTag.HOME) {
            return null;
        }
        return "subTab=" + newTanFragTagMo2537T + " (need HOME)";
    }

    /* JADX INFO: renamed from: J1 */
    public View m1137J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sx30.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m1138J3() {
        return this.f676R;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m1139J4() {
        this.f660J.m19297C8();
    }

    /* JADX INFO: renamed from: J5 */
    public void m1140J5() {
        VIcon vIconMo15090d = this.f682U.mo15090d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusJ3 = CoreModule.c.z2.j3();
        xdl0.M(vIconMo15090d, true);
        if (justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusJ3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo15090d.setImageResource(x2c0.cd);
        } else {
            vIconMo15090d.setImageResource(x2c0.bd);
        }
        xdl0.E0(vIconMo15090d, new View.OnClickListener() { // from class: l.jw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15342a.m1191S4(view);
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public void m1141J6() {
        if (this.f659I0 == null) {
            return;
        }
        this.f659I0.m2801G((NullChecker.a(this.f742x) && this.f742x.getVisibility() == 0) || (NullChecker.a(this.f641B) && this.f641B.getVisibility() == 0) || (NullChecker.a(this.f643C) && this.f643C.getVisibility() == 0));
    }

    @Nullable
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return this.f656H;
    }

    /* JADX INFO: renamed from: K2 */
    public final User m1143K2(NewNewHomeFrag newNewHomeFrag) {
        return (!m1200U1(newNewHomeFrag) && NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) ? m1092A2().mo2814o().m17130d() : m1294n2(newNewHomeFrag);
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m1144K3() {
        return ((Boolean) this.f678S.e()).booleanValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m1145K4(wsf0 wsf0Var, View view) {
        if (upa.K1() && CoreModule.c.z2.r3()) {
            lsi0.y("只看认证用户试用期间无法使用反悔功能");
            return;
        }
        o6j0.c("e_undo_button", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", CoreModule.c.m0.r8() == null ? "NA" : ((DbObject) CoreModule.c.m0.r8()).id), o6j0.a.h("from_top_tab", "")});
        m1188S1(wsf0Var, "undo");
        m1175P5();
        if (m1199T6()) {
            return;
        }
        if (!ezc0.m0() || !CoreModule.K().me_().isNewUserIn24H() || !ezc0.i0().f0()) {
            this.f660J.m19439i9(false);
        } else {
            ezc0.i0().k0();
            ezc0.i0().r0(false);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m1146K5(boolean z) {
        if (z) {
            act().removeCallbacks(this.f747z1);
            this.f641B.setVisibility(8);
            this.f641B.m607m();
        } else {
            act().removeCallbacks(this.f747z1);
            if (this.f660J.m19451l6()) {
                this.f660J.m19498w8();
            } else {
                act().postDelayed(this.f747z1, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m1147K6(View view) {
        e30 e30Var = this.f693Z0;
        if (e30Var != null) {
            e30Var.call(view);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m1148L1(boolean z) {
        if (z) {
            m1265h2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m1280k2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m1265h2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m1280k2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: renamed from: L2 */
    public ool0 m1149L2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        switch (d.f751a[virtualCardType.ordinal()]) {
            case 1:
                if (this.f699c1 == null) {
                    this.f699c1 = new ebe0(this.f658I);
                }
                return this.f699c1;
            case 2:
            case 3:
                if (this.f705f1 == null) {
                    this.f705f1 = new vxg0(this.f658I);
                }
                return this.f705f1;
            case 4:
                if (this.f703e1 == null) {
                    this.f703e1 = new ni50(this.f658I);
                }
                return this.f703e1;
            case 5:
                if (this.f701d1 == null) {
                    this.f701d1 = new ji50(this.f658I);
                }
                return this.f701d1;
            case 6:
                if (this.f727p1 == null) {
                    this.f727p1 = new snb0(this.f658I);
                }
                return this.f727p1;
            case 7:
                if (jb0.g(userInfo)) {
                    return new jth0(this.f658I);
                }
                if (jb0.f(userInfo)) {
                    return new qsh0(this.f658I);
                }
                boolean zD = jb0.d(userInfo);
                NewNewHomeFrag newNewHomeFrag = this.f658I;
                return zD ? new eor(newNewHomeFrag) : new gb0(newNewHomeFrag);
            case 8:
                return new l0t();
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return new a3v(this.f658I, this.f648E0);
            case 10:
                return new c3v(this.f658I);
            case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                return new e3v(this.f658I);
            case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                return new pm10();
            case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
            case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
            case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                if (this.f707g1 == null) {
                    this.f707g1 = new a6j(this.f658I);
                }
                return this.f707g1;
            case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                if (this.f709h1 == null) {
                    this.f709h1 = new yor(this.f658I, userInfo.active);
                }
                return this.f709h1;
            case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                if (this.f711i1 == null) {
                    this.f711i1 = new qlm(this.f658I);
                }
                return this.f711i1;
            case 18:
                if (this.f713j1 == null) {
                    this.f713j1 = new twf(this.f658I);
                }
                return this.f713j1;
            case 19:
                if (this.f716k1 == null) {
                    this.f716k1 = new cfl0(this.f658I, userInfo.active);
                }
                return this.f716k1;
            case 20:
                if (this.f718l1 == null) {
                    this.f718l1 = new b7e0(this.f658I, userInfo.active);
                }
                return this.f718l1;
            case 21:
                if (!NullChecker.a(this.f720m1)) {
                    this.f720m1 = new com.p1.mobile.putong.core.admob.a(this.f658I);
                }
                return this.f720m1;
            case 22:
                if (this.f722n1 == null) {
                    this.f722n1 = new r200(this.f658I, userInfo.active);
                }
                return this.f722n1;
            case 23:
                if (this.f724o1 == null) {
                    this.f724o1 = new gqf0(this.f658I, userInfo.active);
                }
                return this.f724o1;
            case 24:
            case 25:
            case 26:
                return new dm3(this.f658I, userInfo.active);
            case 27:
                return new wpo(this.f658I, userInfo.intlInsertCardData);
            case 28:
                return new m8p(this.f658I, userInfo.intlInsertCardData);
            case 29:
                if (this.f729q1 == null) {
                    this.f729q1 = new s8l(this.f658I);
                }
                return this.f729q1;
            case 30:
                if (this.f731r1 == null) {
                    this.f731r1 = new w73(this.f658I);
                }
                return this.f731r1;
            case 31:
            case 32:
                return new xwb0(this.f658I);
            case 33:
                return new gvw();
            case 34:
                return new zh40();
            case 35:
                return new od2(new Runnable() { // from class: l.aw30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9716a.m1208V3();
                    }
                });
            case 36:
                return new k1j();
            case 37:
                return new w0c();
            case 38:
                if (this.f733s1 == null) {
                    this.f733s1 = new q8m();
                }
                return this.f733s1;
            case 39:
                if (this.f735t1 == null) {
                    this.f735t1 = new fdi(this.f658I);
                }
                return this.f735t1;
            case 40:
                if (this.f737u1 == null) {
                    this.f737u1 = new adi(this.f658I);
                }
                return this.f737u1;
            case 41:
                if (this.f739v1 == null) {
                    this.f739v1 = new t9e0(this.f658I);
                }
                return this.f739v1;
            case 42:
                if (this.f741w1 == null) {
                    this.f741w1 = new qob0(this.f658I);
                }
                return this.f741w1;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final boolean m1150L3() {
        return C0029a.INSTANCE.m961g() && cp60.INSTANCE.p(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m1151L4(wsf0 wsf0Var, View view) {
        m1147K6(wsf0Var.mo2805d());
    }

    /* JADX INFO: renamed from: L5 */
    public void m1152L5(boolean z, boolean z2) {
        m1158M5(z, z2, false);
    }

    /* JADX INFO: renamed from: L6 */
    public final void m1153L6(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : "left";
        }
        long jM18550o = this.f651F0 > 0 ? mqi0.m18550o() - this.f651F0 : -1L;
        this.f651F0 = mqi0.m18550o();
        o6j0.c("e_card_click_interval", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("current_operation", str2), o6j0.a.g("operation_interval", jM18550o), o6j0.a.h("last_operation", this.f654G0)});
        this.f654G0 = str2;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m1154M1(boolean z) {
        View realView = m1316r2().getRealView();
        View realView2 = m1300o2().getRealView();
        View viewM1107D2 = m1107D2();
        View viewM1340w2 = m1340w2();
        BoostViewContainer boostViewContainerM1265h2 = m1265h2();
        View viewM1280k2 = m1280k2();
        View immediatelyMatch = this.f661J0.getImmediatelyMatch();
        if (z) {
            realView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM1107D2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM1340w2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            realView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (g6a.l() && !m1328t5()) {
                this.f682U.mo15092f().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            rxg0.j().b.onNext(roj0.a);
            boostViewContainerM1265h2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM1280k2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (u59.F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            osl oslVar = this.f661J0;
            if (oslVar instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons = (HomeCardBottomOptButtons) oslVar;
                homeCardBottomOptButtons.f1493o.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
                homeCardBottomOptButtons.f1492n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
        } else {
            realView.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM1107D2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM1340w2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            realView2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            if (g6a.l() && !m1328t5()) {
                this.f682U.mo15092f().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            if (u59.F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            osl oslVar2 = this.f661J0;
            if (oslVar2 instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons2 = (HomeCardBottomOptButtons) oslVar2;
                homeCardBottomOptButtons2.f1493o.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
                homeCardBottomOptButtons2.f1492n.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
        }
        if (m1328t5()) {
            return;
        }
        m1148L1(z);
    }

    /* JADX INFO: renamed from: M2 */
    public void m1155M2() {
        String str;
        if (upa.u1() && ((Boolean) CoreModule.c.e0.r6.get()).booleanValue()) {
            str = ip20.n;
            CoreModule.c.e0.q6.put(Long.valueOf(mqi0.m18550o()));
        } else {
            str = null;
        }
        CoreModule.c.e0.r6.put(Boolean.FALSE);
        m1160N2(str);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m1156M3() {
        xdl0.M(this.f689X0, true);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m1157M4(wsf0 wsf0Var, View view) {
        m1147K6(wsf0Var.mo2805d());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x0120  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX INFO: renamed from: M5 */
    public void m1158M5(boolean z, boolean z2, boolean z3) {
        if (z) {
            nt30.f17646V0 = "";
        }
        m1146K5(z2);
        if (((Boolean) this.f678S.e()).booleanValue() && !z) {
            e51.J(this.f640A1);
            yd7 yd7Var = CoreModule.c.l2;
            if (yd7Var.R == 0) {
                yd7Var.R = mqi0.m18550o();
            }
            xdl0.M0(this.f700d, true);
            m1159M6(true);
            m1180Q5(true);
            this.f745y1.cancel();
            if (NullChecker.a(this.f742x)) {
                xdl0.M0(this.f742x, false);
                m1164N6(false);
            }
            m1154M1(true);
            if (IntlCountryCodeController.v()) {
                if (!vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded) && com.p1.mobile.putong.core.api.b.b(((CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0)).virtualCardType)) {
                    if (NullChecker.a(m1117F2())) {
                        xdl0.M(m1117F2(), false);
                    }
                    if (NullChecker.a(m1132I2())) {
                        xdl0.M(m1132I2(), false);
                    }
                } else if (vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded)) {
                    if (NullChecker.a(m1117F2())) {
                        xdl0.M(m1117F2(), true);
                    }
                    if (NullChecker.a(m1132I2())) {
                        xdl0.M(m1132I2(), true);
                    }
                } else {
                    CoreMemberProviderInterface coreMemberProviderInterfaceB = ura.e().b();
                    CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0);
                    com.p1.mobile.putong.core.api.c cVar = CoreModule.c;
                    if (coreMemberProviderInterfaceB.h9(userInfo, cVar.e0.Pa(cVar.m0.q6()))) {
                        if (NullChecker.a(m1117F2())) {
                            xdl0.M(m1117F2(), true);
                        }
                        if (NullChecker.a(m1132I2())) {
                            xdl0.M(m1132I2(), false);
                        }
                    } else {
                        if (NullChecker.a(m1117F2())) {
                            xdl0.M(m1117F2(), true);
                        }
                        if (NullChecker.a(m1132I2())) {
                            xdl0.M(m1132I2(), true);
                        }
                    }
                }
            }
        } else if (!((Boolean) this.f678S.e()).booleanValue() && z) {
            this.f640A1.m22715a(z2, false, false);
            if (z3) {
                e51.H(act(), this.f640A1, zo0.f23777f);
            } else {
                this.f640A1.run();
            }
        }
        if (upa.N3()) {
            m1234a6(!z);
            if (upa.Z2() && !m1328t5()) {
                m1180Q5(!z);
            }
        }
        if (CoreModule.P().a().m7() && !m1328t5()) {
            xdl0.M0(this.f682U.mo15092f(), !z);
        }
        if (upa.c3()) {
            xdl0.M0(this.f682U.mo15090d(), !z);
        }
        this.f678S.onNext(Boolean.valueOf(z));
        this.f660J.f17666J = z2;
        m1193S6();
        m1141J6();
    }

    /* JADX INFO: renamed from: M6 */
    public final void m1159M6(boolean z) {
        HomeStatisticsHelper.m638C(this.f658I.getUserVisibleHint() && !this.f658I.isHidden());
        if (z) {
            HomeStatisticsHelper.m664u();
        } else {
            HomeStatisticsHelper.m663t();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m1160N2(String str) {
        m1175P5();
        CoreModule.c.F0.r3();
        xdl0.M(this.f682U.mo15099m(), false);
        zq20.d(act(), str);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m1161N3() {
        xdl0.M(this.f689X0, false);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m1162N4(View view) {
        m1092A2().mo2797A(SwipeDirection.LEFT);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "dislike")});
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final void m1163N5(DoublePair doublePair, String str, String str2, List<MessageLocation> list) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        RoamedLocationData roamedLocationDataNew_ = RoamedLocationData.new_();
        list.add(0, messageLocation);
        roamedLocationDataNew_.data.addAll(list);
        CoreModule.c.k0.R.A(roamedLocationDataNew_);
        cjl0.C0(act(), messageLocation, (d30) null);
    }

    /* JADX INFO: renamed from: N6 */
    public final void m1164N6(boolean z) {
        HomeStatisticsHelper.m638C(this.f658I.getUserVisibleHint() && !this.f658I.isHidden());
        if (z) {
            HomeStatisticsHelper.m666w();
        } else {
            HomeStatisticsHelper.m665v();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m1165O1() {
        if (upa.N3() && this.f659I0 != null && m1136I6() == null) {
            m1141J6();
            m1130H5();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public void m1277j4() {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m1167O3(String str) {
        if (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) {
            final User userM17130d = m1092A2().mo2814o().m17130d();
            com.p1.mobile.putong.core.ui.match.a.w().p(this.f656H, userM17130d, str, new d30() { // from class: l.cx30
                public final void call() {
                    CoreModule.c.m0.E8(((DbObject) userM17130d).id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m1168O4(View view) {
        m1181Q6();
    }

    /* JADX INFO: renamed from: O5 */
    public void m1169O5() {
        final wsf0 wsf0VarM1092A2 = m1092A2();
        xdl0.E0(this.f663K0.f1658C, new View.OnClickListener() { // from class: l.uw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.m1073t0(wsf0VarM1092A2, view);
            }
        });
        xdl0.E0(this.f663K0.f1657B, new View.OnClickListener() { // from class: l.ww30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.m994M(wsf0VarM1092A2, view);
            }
        });
        xdl0.E0(this.f663K0.f1659D, new View.OnClickListener() { // from class: l.xw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22739a.m1197T4(view);
            }
        });
        xdl0.E0(this.f663K0.f1660E, new View.OnClickListener() { // from class: l.yw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23256a.m1203U4(view);
            }
        });
        this.f663K0.f1657B.setLongPressingListener(new h());
        xdl0.E0(this.f663K0.f1656A, new View.OnClickListener() { // from class: l.zw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23951a.m1214W4(view);
            }
        });
        m1241c3();
    }

    /* JADX INFO: renamed from: O6 */
    public final void m1170O6() {
        if (CoreModule.o.b().wf() && NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2805d()) && (m1092A2().mo2805d() instanceof d5m)) {
            d5m d5mVar = (d5m) m1092A2().mo2805d();
            if (d5mVar.mo837c()) {
                d5mVar.getIntlCommercialCardBottomActionLayout().m3198T();
            }
        }
    }

    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void m1270i1(nt30 nt30Var) {
        this.f660J = nt30Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: P2 */
    public void m1172P2() {
        com.p1.mobile.android.ui.bubble.d.l().k("bubble_superlike_bubble");
        rxg0.u();
        if (m1201U2(" by hiddenBottomButtons s1 ")) {
            return;
        }
        m1115E5();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m1173P3(User user) {
        int showPictureIndexProxy = (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2805d()) && (m1092A2().mo2805d() instanceof mol)) ? ((mol) m1092A2().mo2805d()).getShowPictureIndexProxy() : 0;
        if (jo5.b(this.f656H, NullChecker.a(m1092A2()) ? m1092A2().mo2809j() : null, user, "home_card_compliment_btn")) {
            return;
        }
        bo5.m(this.f656H, user, "home_card_compliment_btn", Integer.valueOf(showPictureIndexProxy), (d30) null, bo5.i());
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ znl m1174P4() {
        if (!NullChecker.a(m1092A2())) {
            return null;
        }
        KeyEvent.Callback callbackMo2805d = m1092A2().mo2805d();
        if (callbackMo2805d instanceof znl) {
            return (znl) callbackMo2805d;
        }
        return null;
    }

    /* JADX INFO: renamed from: P5 */
    public void m1175P5() {
        if (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2805d()) && (m1092A2().mo2805d() instanceof d5m)) {
            ((d5m) m1092A2().mo2805d()).mo883p(true, false);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m1176P6(boolean z) {
        xdl0.M(this.f732s, false);
        boolean z2 = this.f688X;
        if (z) {
            if (z2) {
                this.f688X = false;
                this.f686W.start();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f688X = true;
        this.f684V.start();
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m1177Q1() {
        o6j0.h("e_boost_button", this.f658I.pageId(), new o6j0.a[]{o6j0.a.i("is_privileged", !swh0.v())});
    }

    /* JADX INFO: renamed from: Q2 */
    public void m1178Q2() {
        if (NullChecker.a(this.f687W0) && xdl0.O0(this.f687W0.getRenderView())) {
            xdl0.M(this.f687W0.getRenderView(), false);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m1179Q4(roj0 roj0Var) {
        cp60 cp60Var = cp60.INSTANCE;
        cp60Var.i0();
        this.f656H.progressDismiss();
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(this.f656H, o7r.m19649a(this.f656H).inflate(f6c0.p5, (ViewGroup) null)).u("" + System.currentTimeMillis()).B(3).s();
        simplePushBubbleS.x(CorePopLevel.INTL_PET);
        hdb0.c().i(simplePushBubbleS);
        cp60Var.x().put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q5 */
    public void m1180Q5(boolean z) {
        if (!z || (!vdj.c() && n3b0.o())) {
            xdl0.M(m1265h2(), true);
            return;
        }
        if (!xdl0.O0(m1265h2())) {
            m1177Q1();
        }
        xdl0.M(m1265h2(), true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m1181Q6() {
        if (m1199T6()) {
            return;
        }
        if (!ezc0.m0() || !CoreModule.K().me_().isNewUserIn24H() || !ezc0.i0().f0()) {
            this.f660J.m19439i9(false);
        } else {
            ezc0.i0().k0();
            ezc0.i0().r0(false);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m1182R1() {
        e51.J(this.f664L);
    }

    /* JADX INFO: renamed from: R2 */
    public void m1183R2() {
        if (IntlCountryCodeController.v() && NullChecker.b(this.f663K0)) {
            xdl0.M0(this.f663K0.f1687z, false);
            xdl0.M0(this.f663K0.f1662a, false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m1184R3() {
        xdl0.M(this.f732s, false);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m1185R4(Throwable th) {
        this.f656H.progressDismiss();
    }

    /* JADX INFO: renamed from: R5 */
    public void m1186R5(boolean z) {
        act().m3883b7(z);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m1187R6() {
        try {
            if ((this.f661J0 instanceof HomeCardBottomOptButtons) && NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) {
                ((HomeCardBottomOptButtons) this.f661J0).m2359v(m1092A2().mo2814o().m17130d(), NullChecker.a(this.f658I) ? this.f658I.pageId() : "p_suggest_users_home_view");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final void m1188S1(wsf0 wsf0Var, String str) {
        m1153L6(str);
        wsf0Var.m19514h(str);
    }

    /* JADX INFO: renamed from: S2 */
    public void m1189S2() {
        if (IntlCountryCodeController.v() && NullChecker.b(this.f663K0)) {
            xdl0.M0(this.f663K0.f1662a, false);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m1190S3(View view) {
        m1131H6(false);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m1191S4(View view) {
        psq.m20646Q(this.f656H, true);
    }

    /* JADX INFO: renamed from: S5 */
    public final void m1192S5(int i2) {
        final String strE;
        final boolean zBooleanValue = false;
        if (i2 == 0) {
            strE = "core_intl_constellation_entrance_anim.svga";
        } else if (i2 == 1) {
            cp60 cp60Var = cp60.INSTANCE;
            zBooleanValue = ((Boolean) cp60Var.x().get()).booleanValue();
            strE = cp60Var.e();
        } else if (i2 == 2) {
            qff0 qff0Var = qff0.INSTANCE;
            zBooleanValue = ((Boolean) qff0Var.m20948m().get()).booleanValue();
            strE = qff0Var.m20941f();
        } else if (i2 == 3) {
            C0426b c0426b = C0426b.INSTANCE;
            zBooleanValue = ((Boolean) c0426b.m8374h().get()).booleanValue();
            strE = c0426b.m8372f();
        } else if (i2 == 4) {
            ubo uboVar = ubo.INSTANCE;
            zBooleanValue = uboVar.m22782l();
            strE = uboVar.m22777g();
        } else if (i2 != 5) {
            strE = "";
        } else {
            wp0 wp0Var = wp0.INSTANCE;
            zBooleanValue = wp0Var.m();
            strE = wp0Var.h();
        }
        if (TextUtils.isEmpty(strE) || !NullChecker.a(this.f656H)) {
            return;
        }
        e51.F(this.f656H, new Runnable() { // from class: l.ax30
            @Override // java.lang.Runnable
            public final void run() {
                this.f9724a.m1219X4(zBooleanValue, strE);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public final void m1193S6() {
        if (((Boolean) this.f678S.e()).booleanValue()) {
            m1316r2().getRealView().setOnTouchListener(null);
            m1300o2().getRealView().setOnTouchListener(null);
            m1316r2().getRealView().setClickable(false);
            m1300o2().getRealView().setClickable(false);
            m1340w2().setClickable(false);
            m1102C2().getRealView().setClickable(false);
            return;
        }
        m1316r2().getRealView().setOnTouchListener(this.f642B1);
        m1300o2().getRealView().setOnTouchListener(this.f644C1);
        m1316r2().getRealView().setClickable(true);
        m1300o2().getRealView().setClickable(true);
        m1340w2().setClickable(true);
        m1102C2().getRealView().setClickable(true);
    }

    /* JADX INFO: renamed from: T1 */
    public void m1194T1(boolean z) {
        this.f661J0.mo2349b(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: T2 */
    public void m1195T2() {
        if (upa.N3()) {
            m1234a6(true);
        }
        m1092A2().setAllowUpSwipe(true);
        if (m1201U2(" by hidenLiveCardBottomButtons s1")) {
            return;
        }
        m1120F5();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m1196T3(View view) {
        m1131H6(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m1197T4(View view) {
        m1092A2().mo2797A(SwipeDirection.LEFT);
        if (upa.N3()) {
            o6j0.c("e_clone_ui_swipe", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("clone_swipe_scene", ExpandedCardStyleHelper.m2064o().m2077s() ? "profile" : "card"), o6j0.a.h("actionname", "dislike")});
        }
    }

    /* JADX INFO: renamed from: T5 */
    public final void m1198T5(String str) {
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
        }
        SVGALoader.with(this.f656H).from(str).loadCallback(new i()).into(this.f682U.mo15098l());
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m1199T6() {
        return m1092A2().mo2805d() == null;
    }

    /* JADX INFO: renamed from: U1 */
    public final boolean m1200U1(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo2809j = newNewHomeFrag.f456C.m1092A2().mo2809j();
        if (NullChecker.a(userInfoMo2809j)) {
            return TextUtils.equals(userInfoMo2809j.id, "VirtualCard");
        }
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public boolean m1201U2(String str) {
        if (IntlCountryCodeController.v() && ura.e().b().wf() && m1092A2() != null && (m1092A2().mo2805d() instanceof a5m)) {
            if (ura.e().b().h9(((a5m) m1092A2().mo2805d()).getUserInfoProxy(), m1092A2().mo2814o().m17130d())) {
                CoreModule.c.m0.m2.onNext(roj0.a);
                return true;
            }
            if (!vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded) && !com.p1.mobile.putong.core.api.b.b(((CoreSuggested.UserInfo) ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.get(0)).virtualCardType)) {
                CoreModule.c.m0.n2.onNext(roj0.a);
            }
        }
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM1249d6 = m1249d6();
        if (!TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "show") && !TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "hide") && !TEnum.equals(cardButtonsShowAndHideTypeM1249d6, "only_hide_operation_btn")) {
            return false;
        }
        CoreModule.c.m0.l2.onNext(str + " by: highestPriorityHandleBottoms match " + cardButtonsShowAndHideTypeM1249d6 + " ");
        return true;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m1202U3(View view) {
        m1181Q6();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m1203U4(View view) {
        m1181Q6();
    }

    /* JADX INFO: renamed from: U5 */
    public void m1204U5(boolean z) {
        m1276j3();
        pon ponVar = this.f662K;
        if (ponVar != null) {
            ponVar.m20539n(z);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final void m1205U6() {
        this.f742x = this.f708h;
        this.f744y = this.f710i;
        this.f746z = this.f712j;
        this.f639A = this.f714k;
        this.f641B = this.f717l;
        this.f643C = this.f719m;
        this.f645D = this.f721n;
        this.f647E = this.f723o;
        this.f650F = this.f725p;
        this.f653G = this.f728q;
    }

    /* JADX INFO: renamed from: V1 */
    public void m1206V1(boolean z) {
        boolean zM10210b = PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        if (!this.f743x1 && (zM10210b || z)) {
            this.f660J.m19305E8(zM10210b);
        }
        xdl0.M(this.f698c, true);
        HomeStatisticsHelper.m667x();
        this.f743x1 = zM10210b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final osl m1207V2(int i2) {
        osl oslVar = (osl) LayoutInflater.from(act()).inflate(i2, (ViewGroup) this.f700d, false);
        if (oslVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) oslVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return oslVar;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m1208V3() {
        this.f658I.mo698V(SwipeDirection.fromValue(SwipeDirection.RIGHT.getValue()));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m1209V4() {
        if (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) {
            CoreModule.c.m0.E8(((DbObject) m1092A2().mo2814o().m17130d()).id);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public void m1210V5(final int i2) {
        Act act = this.f656H;
        if (act != null) {
            act.post(new Runnable() { // from class: l.dx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12019a.m1223Y4(i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m1211V6() {
        act().duringCreated(v930.k().distinctUntilChanged().filter(new w9j() { // from class: l.xt30
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.yt30
            public final void call(Object obj) {
                this.f23224a.m1324s5((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public void m1212W2() {
        xdl0.M(this.f682U.mo15093g(), true);
        if (CoreModule.c.F0.i3()) {
            xdl0.M(this.f682U.mo15099m(), true);
        }
        xdl0.E0(this.f682U.mo15093g(), new View.OnClickListener() { // from class: l.bw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10338a.m1213W3(view);
            }
        });
        if (upa.u1() && ((Boolean) CoreModule.c.e0.r6.get()).booleanValue()) {
            xdl0.M(this.f682U.mo15099m(), true);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m1213W3(View view) {
        m1155M2();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m1214W4(View view) {
        com.p1.mobile.putong.core.ui.match.a.w().p(this.f656H, m1294n2(this.f658I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.qt30
            public final void call() {
                this.f19522a.m1209V4();
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m1215W5(final DoublePair doublePair, final List<MessageLocation> list) {
        if (doublePair == null) {
            m1229Z5(null);
            return;
        }
        if (doublePair.first == 0.0d || doublePair.second == 0.0d) {
            m1216X1(doublePair);
            m1229Z5(null);
            return;
        }
        MessageLocation messageLocation = (MessageLocation) vwb.r(list, new w9j() { // from class: l.tv30
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (NullChecker.a(messageLocation)) {
            m1229Z5(TextUtils.isEmpty(messageLocation.name) ? act().string(R.string.On) : messageLocation.name);
        } else if (list.size() < 5) {
            mjj.m18515c(act(), true).m18517e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.uv30
                public final void call(Object obj) {
                    this.f21346a.m1228Z4(doublePair, list, (d90) obj);
                }
            }, new e30() { // from class: l.vv30
                public final void call(Object obj) {
                    this.f21802a.m1233a5(doublePair, (Throwable) obj);
                }
            });
        } else {
            m1216X1(doublePair);
            m1229Z5(null);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m1216X1(DoublePair doublePair) {
        if (doublePair.equals(DoublePair.new_())) {
            return;
        }
        cjl0.D0(act());
    }

    /* JADX INFO: renamed from: X2 */
    public final void m1217X2() {
        wp0.INSTANCE.d();
        m1192S5(5);
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.xv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22736a.m1218X3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m1218X3(View view) {
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(false);
            m1198T5(wp0.INSTANCE.h());
        }
        wp0 wp0Var = wp0.INSTANCE;
        wp0Var.c();
        wp0Var.k(this.f656H);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m1219X4(boolean z, String str) {
        if (z) {
            m1198T5(str);
        } else {
            SVGALoader.with(this.f656H).from(str).autoPlay(true).into(this.f682U.mo15098l());
        }
    }

    /* JADX INFO: renamed from: X5 */
    public void m1220X5(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.a(this.f680T)) {
            this.f680T.m12562i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m1221Y1(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        this.f661J0.mo2348a(z, user, userInfo);
        if (IntlCountryCodeController.v() && upa.N3() && NullChecker.a(this.f663K0)) {
            this.f663K0.m2432s(z);
            m1169O5();
        }
        LinearLayout linearLayoutMo2533O = m1310q2().getParentFragment().mo2533O();
        ExpandedFakeProfileTitle expandedFakeProfileTitle = this.f689X0;
        if (!z) {
            if (expandedFakeProfileTitle == null) {
                return;
            }
            if (f637H1) {
                bt0.f(bt0.z(new Animator[]{bt0.q(expandedFakeProfileTitle, "alpha", new float[]{expandedFakeProfileTitle.getAlpha(), 0.0f}), bt0.q(linearLayoutMo2533O, "alpha", new float[]{linearLayoutMo2533O.getAlpha(), 1.0f})}).setDuration(200L), new Runnable() { // from class: l.pv30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18933a.m1161N3();
                    }
                }).start();
                return;
            } else {
                linearLayoutMo2533O.setAlpha(1.0f);
                xdl0.M(this.f689X0, false);
                return;
            }
        }
        if (expandedFakeProfileTitle == null) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle2 = (ExpandedFakeProfileTitle) this.f682U.mo15102p().inflate();
            this.f689X0 = expandedFakeProfileTitle2;
            xdl0.E0(expandedFakeProfileTitle2, new View.OnClickListener() { // from class: l.mv30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.m996N(view);
                }
            });
            this.f689X0.f1360a.g(1.0f);
            this.f689X0.f1360a.f(0.0f);
        }
        if (f637H1) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle3 = this.f689X0;
            bt0.v(bt0.z(new Animator[]{bt0.q(expandedFakeProfileTitle3, "alpha", new float[]{expandedFakeProfileTitle3.getAlpha(), 1.0f}), bt0.q(linearLayoutMo2533O, "alpha", new float[]{linearLayoutMo2533O.getAlpha(), 0.0f})}).setDuration(200L), new Runnable() { // from class: l.nv30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17749a.m1156M3();
                }
            }).start();
        } else {
            linearLayoutMo2533O.setAlpha(0.0f);
            xdl0.M(this.f689X0, true);
        }
        this.f689X0.bringToFront();
        this.f689X0.m2292h(user);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m1222Y3(View view) {
        this.f694a.removeView(view);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m1223Y4(int i2) {
        String str;
        if (this.f697b1 == i2) {
            return;
        }
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
        }
        if (i2 == 1) {
            str = "core_intl_like_minded_inactive.svga";
        } else {
            str = i2 == 2 ? "core_intl_like_minded_active.svga" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SVGALoader.with(this.f656H).from(str).autoPlay(true).into(this.f682U.mo15098l());
        this.f697b1 = i2;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m1224Y5(int i2) {
        String str;
        int i3;
        if (this.f695a1 == i2) {
            return;
        }
        if (this.f682U.mo15094h().isAnimating()) {
            this.f682U.mo15094h().stopAnimation(true);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = "https://auto.tancdn.com/v1/raw/8b1e71c6-ee21-497b-a4ab-9b2b3b4d475110.pdf";
                i3 = -1;
            } else {
                str = "";
            }
            SVGALoader.with(this.f656H).from(str).repeatCount(i3).autoPlay(true).into(this.f682U.mo15094h());
            this.f695a1 = i2;
        }
        str = "https://auto.tancdn.com/v1/raw/f827c87e-ad44-45c3-a8c3-1df8825e618f11.pdf";
        i3 = 1;
        SVGALoader.with(this.f656H).from(str).repeatCount(i3).autoPlay(true).into(this.f682U.mo15094h());
        this.f695a1 = i2;
    }

    /* JADX INFO: renamed from: Z1 */
    public nsl m1225Z1(boolean z, boolean z2) {
        if (z) {
            return z2 ? m1102C2() : m1316r2();
        }
        return m1300o2();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m1226Z2() {
        xdl0.E0(this.f661J0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.jv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15338a.m1252e4(view);
            }
        });
        this.f661J0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
        this.f661J0.getDislikeBtn().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
        this.f661J0.getDislikeBtn().setPressedStateLayerBackground(this.f656H.drawable(this.f661J0.getDislikePressBg()));
        this.f661J0.getLikeBtn().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
        this.f661J0.getLikeBtn().setPressedStateLayerBackground(this.f656H.drawable(this.f661J0.getLikePressBg()));
        m1234a6(!u59.G());
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ View m1227Z3(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m1240c2(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m1228Z4(DoublePair doublePair, List list, d90 d90Var) {
        String strMo13016b = d90Var.mo13016b();
        String strMo13015a = d90Var.mo13015a();
        if (TextUtils.isEmpty(strMo13016b) || TextUtils.isEmpty(strMo13015a)) {
            m1216X1(doublePair);
            m1229Z5(null);
        } else {
            m1163N5(doublePair, strMo13016b, strMo13015a, list);
            m1229Z5(strMo13016b);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m1229Z5(String str) {
        this.f668N = str;
        if (str == null || psq.m20639J(this.f682U)) {
            m1095A6(false);
            return;
        }
        this.f682U.getPosition().setText(str);
        m1095A6(true);
        zvf0.x("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: a2 */
    public void m1230a2() {
        m1092A2().setAllowUpSwipe(false);
        xdl0.M(m1107D2(), false);
        m1239b6(false);
        if (ezc0.m0()) {
            ezc0.i0().p0(false);
            if (!upa.N3()) {
                ViewGroup buttonRootLayout = this.f661J0.getButtonRootLayout();
                int i2 = t100.v;
                buttonRootLayout.setPadding(i2, this.f661J0.getButtonRootLayout().getPaddingTop(), i2, this.f661J0.getButtonRootLayout().getPaddingBottom());
            }
        }
        if (IntlCountryCodeController.v() && NullChecker.a(this.f663K0)) {
            xdl0.M(this.f663K0.f1657B, false);
            xdl0.M(this.f663K0.f1660E, false);
            m1239b6(false);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m1231a3() {
        xdl0.M(this.f663K0.f1656A, true);
        xdl0.E0(this.f663K0.f1656A, new View.OnClickListener() { // from class: l.yv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23253a.m1262g4(view);
            }
        });
        m1241c3();
        if (u59.I()) {
            xdl0.M(this.f663K0.f1660E, true);
            m1234a6(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m1232a4() {
        return Boolean.valueOf(act().m3886d6());
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m1233a5(DoublePair doublePair, Throwable th) {
        m1216X1(doublePair);
        m1229Z5(null);
        App.d.k(th);
    }

    /* JADX INFO: renamed from: a6 */
    public void m1234a6(boolean z) {
        if (upa.N3()) {
            xdl0.M(this.f682U.mo15088b(), false);
            xdl0.M(this.f682U.mo15096j(), false);
            return;
        }
        boolean zVf = CoreModule.P().a().Vf();
        qsl qslVar = this.f682U;
        if (!zVf) {
            xdl0.M(qslVar.mo15088b(), z);
            xdl0.M(this.f682U.mo15096j(), z);
        } else if (xdl0.O0(qslVar.mo15088b())) {
            xdl0.M(this.f682U.mo15088b(), false);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m1235b2(C0107c c0107c) {
        c0107c.m1876I(new c());
        osl oslVar = this.f661J0;
        if (oslVar instanceof ykf) {
            ((ykf) oslVar).setImmediateleMatchClickListener(new Action1() { // from class: l.lw30
                public final void call(Object obj) {
                    this.f16429a.m1167O3((String) obj);
                }
            });
        }
        osl oslVar2 = this.f661J0;
        if (oslVar2 instanceof HomeCardBottomOptButtons) {
            ((HomeCardBottomOptButtons) oslVar2).setComplimentClickListener(new Action1() { // from class: l.mw30
                public final void call(Object obj) {
                    this.f17125a.m1173P3((User) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m1236b3() {
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m1237b4(final BoostViewContainer boostViewContainer, int i2) {
        if (i2 == 2) {
            m1180Q5(true);
            boostViewContainer.m7958e(this.f656H, new d30() { // from class: l.kx30
                public final void call() {
                    boostViewContainer.m7960g(true);
                }
            }, new v9j() { // from class: l.lx30
                public final Object call() {
                    return this.f16438a.m1232a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m1238b5() {
        if (!(m1092A2().mo2805d() instanceof e5m) || ((e5m) m1092A2().mo2805d()).mo1897H() == null) {
            return;
        }
        xdl0.Q0(((e5m) m1092A2().mo2805d()).mo1897H(), new e30() { // from class: l.pt30
            public final void call(Object obj) {
                this.f18899a.m1263g5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public void m1239b6(boolean z) {
        if (!upa.N3()) {
            if (m1122G2() != null) {
                xdl0.M(m1122G2().getRealView(), z);
                xdl0.M(m1127H2(), z);
                return;
            }
            return;
        }
        m1234a6(z);
        if (m1122G2() != null) {
            xdl0.M(m1122G2().getRealView(), z);
            xdl0.M(m1127H2(), z);
        } else {
            xdl0.M(m1122G2().getRealView(), false);
            xdl0.M(m1127H2(), false);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public View m1240c2(View view, Drawable drawable, CharSequence charSequence, int i2, int i3, int i4, boolean z, d30 d30Var) {
        int i5;
        int i6;
        int iD;
        int iD2;
        if (view != m1265h2() && view != m1271i2()) {
            xdl0.M(this.f732s, false);
            if (z) {
                i5 = 0;
                i6 = 0;
                iD = 0;
                iD2 = 0;
            } else {
                int iD3 = t100.d(18.0f);
                int iD4 = t100.d(17.0f);
                iD = t100.d(18.0f);
                i5 = iD3;
                i6 = iD4;
                iD2 = t100.d(21.0f);
            }
            return mep0.b1(m1354z2(), view, drawable, charSequence, i2, i3, 17, i4, i5, i6, iD, iD2, xdl0.y0() - t100.d(60.0f), 17, 0, false, d30Var);
        }
        VText vText = this.f732s;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(x2c0.ua));
        ViewGroup.LayoutParams layoutParams = this.f732s.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = t100.d(7.0f);
            marginLayoutParams.topMargin = t100.d(2.0f);
        }
        this.f732s.setLayoutParams(layoutParams);
        this.f732s.setPadding(t100.d(16.0f), t100.d(16.0f), t100.d(16.0f), t100.d(10.0f));
        this.f732s.setTextSize(13.0f);
        this.f732s.setText(charSequence);
        xdl0.M(this.f732s, true);
        if (i4 != -1) {
            if (this.f674Q == null) {
                this.f674Q = new Runnable() { // from class: l.bx30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10347a.m1184R3();
                    }
                };
            }
            e51.H(act(), this.f674Q, i4);
        }
        return this.f732s;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m1241c3() {
        xdl0.E0(this.f663K0.f1673l, new View.OnClickListener() { // from class: l.ex30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12708a.m1267h4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ boolean m1242c4(View view) {
        if (lac0.m()) {
            m1265h2().m7959f();
            return true;
        }
        if (CoreModule.c.J0.F3()) {
            return true;
        }
        m1265h2().m7959f();
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m1243c5(int[] iArr) {
        com.p1.mobile.putong.core.ui.match.a.w().S(act(), this.f694a, m1132I2(), 3000);
    }

    @Deprecated
    /* JADX INFO: renamed from: c6 */
    public boolean m1244c6() {
        if (m1092A2() != null && (m1092A2().mo2805d() instanceof a5m)) {
            a5m a5mVar = (a5m) m1092A2().mo2805d();
            d5m d5mVar = a5mVar instanceof d5m ? (d5m) a5mVar : null;
            User userM17130d = m1092A2().mo2814o().m17130d();
            if (a5mVar.mo914y()) {
                if (d5mVar != null && d5mVar.mo847f()) {
                    return false;
                }
                if (d5mVar != null && d5mVar.mo793N()) {
                    return false;
                }
                if ((NullChecker.a(userM17130d) && mah0.y0(((DbObject) userM17130d).id)) || mah0.s0().z0()) {
                    return false;
                }
                if (d5mVar == null || !d5mVar.mo837c() || IntlCountryCodeController.v()) {
                    return ((a5mVar instanceof UserProfileExpandedCardRoot) && ((UserProfileExpandedCardRoot) a5mVar).m1944l1()) ? false : true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d2 */
    public void m1245d2() {
        m1092A2().setAllowUpSwipe(true);
        if (IntlCountryCodeController.v() && NullChecker.b(this.f663K0)) {
            xdl0.M(this.f663K0.f1657B, true);
            xdl0.M(this.f663K0.f1660E, true);
            m1239b6(true);
        }
        if (fap.y()) {
            this.f676R = true;
        }
        m1107D2().setVisibility(0);
        m1239b6(true);
        m1107D2().setOnClickListener(new View.OnClickListener() { // from class: l.qv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19559a.m1190S3(view);
            }
        });
        m1102C2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.rv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19990a.m1196T3(view);
            }
        });
        m1102C2().setOnLongPressListener(new l());
        m1340w2().setOnClickListener(new View.OnClickListener() { // from class: l.sv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20479a.m1202U3(view);
            }
        });
        xdl0.k0(m1285l2());
        if (u59.I()) {
            m1231a3();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m1246d3() {
        if (g6a.w()) {
            this.f694a.bringChildToFront(this.f698c);
            this.f694a.bringChildToFront(this.f687W0.getRenderView());
            this.f698c.bringChildToFront(this.f700d);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m1247d4() {
        if (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) {
            CoreModule.c.m0.E8(((DbObject) m1092A2().mo2814o().m17130d()).id);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m1248d5() {
        xdl0.Q0(m1132I2(), new e30() { // from class: l.jx30
            public final void call(Object obj) {
                this.f15351a.m1243c5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public CardButtonsShowAndHideType m1249d6() {
        if (m1092A2() != null && (m1092A2().mo2805d() instanceof a5m)) {
            a5m a5mVar = (a5m) m1092A2().mo2805d();
            CoreSuggested.UserInfo userInfoMo2809j = m1092A2().mo2809j();
            User userM17130d = m1092A2().mo2814o().m17130d();
            d5m d5mVar = a5mVar instanceof d5m ? (d5m) a5mVar : null;
            e5m e5mVar = a5mVar instanceof e5m ? (e5m) a5mVar : null;
            if (a5mVar.mo914y()) {
                if (d5mVar != null && d5mVar.mo847f()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (d5mVar != null && ura.e().b().h9(d5mVar.getUserInfoProxy(), userM17130d)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (d5mVar != null && d5mVar.mo793N()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (NullChecker.a(userInfoMo2809j) && mah0.y0(userInfoMo2809j.id)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (upa.N3()) {
                    if (mah0.s0().o) {
                        mah0.s0().o = false;
                        return CardButtonsShowAndHideType.get("hide");
                    }
                } else if (mah0.s0().z0()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (CoreModule.o.b().wf() && ((d5mVar != null && d5mVar.mo837c()) || (e5mVar != null && e5mVar.mo1898c() && !ExpandedCardStyleHelper.m2064o().m2077s()))) {
                return CardButtonsShowAndHideType.get("hide");
            }
            if (sb90.e(userM17130d) && NullChecker.a(userInfoMo2809j) && NullChecker.a(userInfoMo2809j.cityCData)) {
                User userP9 = CoreModule.c.e0.p9();
                if (NullChecker.a(userM17130d) && !userM17130d.isMe() && userP9.isFemale()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (g6a.w() && NullChecker.a(d5mVar) && a5mVar.mo914y()) {
                if (d5mVar.mo911x0() == 1) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                return d5mVar.mo911x0() == -1 ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("unknow");
            }
            if (upa.N3() && al4.m11502c(userInfoMo2809j, userM17130d)) {
                return ExpandedCardStyleHelper.m2064o().m2077s() ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
            }
            if (al4.m11502c(userInfoMo2809j, userM17130d)) {
                return CardButtonsShowAndHideType.get("only_hide_operation_btn");
            }
            if (u59.F() && NullChecker.a(a5mVar) && !a5mVar.mo888q0() && NullChecker.a(userInfoMo2809j)) {
                IntlInsertCardData intlInsertCardData = userInfoMo2809j.intlInsertCardData;
                if (intlInsertCardData == null) {
                    return CardButtonsShowAndHideType.get("show");
                }
                switch (intlInsertCardData.cardType) {
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case MediaPickerParamsObject.FROM_CHAT_LIMIT_SHOOT_PIC /* 13 */:
                        return (upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s()) ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
                    case 2:
                    case MediaPickerParamsObject.FROM_CITY_CENTER_UPLOAD_PIC /* 14 */:
                    case MediaPickerParamsObject.FROM_PROFILE_GAME /* 15 */:
                    case MediaPickerParamsObject.FROM_DEFAULT /* 16 */:
                    case MediaPickerParamsObject.FROM_PROFILE_PET /* 17 */:
                    case 18:
                        return CardButtonsShowAndHideType.get("show");
                    case 5:
                    case 8:
                    case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                    case MediaPickerParamsObject.FROM_CHAT_SWITCH_BACK_PIC /* 11 */:
                        return CardButtonsShowAndHideType.get("show");
                    case 10:
                    case MediaPickerParamsObject.FROM_PROFILE_WEALTH /* 12 */:
                        return CardButtonsShowAndHideType.get(IntlCountryCodeController.v() ? "show" : "hide");
                    default:
                        return CardButtonsShowAndHideType.get("show");
                }
            }
        }
        return upa.N3() ? CardButtonsShowAndHideType.get("hide") : CardButtonsShowAndHideType.get("unknow");
    }

    public void destroy() {
        this.f740w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pon ponVar = this.f662K;
        if (ponVar != null) {
            ponVar.m20537l();
            this.f662K = null;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public SpannableString m1250e2(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(w0c0.N1)), str.indexOf((String) CoreModule.c.P2.get()), str.indexOf((String) CoreModule.c.P2.get()) + ((String) CoreModule.c.P2.get()).length(), 34);
        return spannableString;
    }

    /* JADX INFO: renamed from: e3 */
    public void m1251e3() {
        this.f643C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f641B.m610p(new d30() { // from class: l.xu30
            public final void call() {
                this.f22727a.m1273i4();
            }
        }, new d30() { // from class: l.yu30
            public final void call() {
                this.f23232a.m1277j4();
            }
        }, new d30() { // from class: l.zu30
            public final void call() {
                this.f23905a.m1282k4();
            }
        }, this.f660J);
        this.f643C.m629m(this.f660J, new d30() { // from class: l.av30
            public final void call() {
                this.f9706a.m1286l4();
            }
        });
        this.f643C.setShowCallback(new e30() { // from class: l.bv30
            public final void call(Object obj) {
                this.f10322a.m1291m4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m1252e4(View view) {
        com.p1.mobile.putong.core.ui.match.a.w().p(this.f656H, m1294n2(this.f658I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.rw30
            public final void call() {
                this.f20005a.m1247d4();
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m1253e5(int[] iArr) {
        if (m1092A2().mo2805d() instanceof NewNewProfileCard) {
            com.p1.mobile.putong.core.ui.match.a.w().S(act(), this.f694a, ((NewNewProfileCard) m1092A2().mo2805d()).mo815V(), 3000);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e6 */
    public void m1254e6() {
        if (m1201U2(" by showBottomButton s1 ")) {
            return;
        }
        m1120F5();
    }

    /* JADX INFO: renamed from: f2 */
    public void m1255f2() {
        m1180Q5(true);
        m1245d2();
        act().m3880a7();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m1256f3() {
        if (g6a.k()) {
            xdl0.M(this.f682U.mo15091e(), false);
            xdl0.M(this.f682U.mo15092f(), true);
            xdl0.E0(this.f682U.mo15092f(), new View.OnClickListener() { // from class: l.cw30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10801a.m1296n4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m1257f4() {
        if (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2814o()) && NullChecker.a(m1092A2().mo2814o().m17130d())) {
            CoreModule.c.m0.E8(((DbObject) m1092A2().mo2814o().m17130d()).id);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m1258f5() {
        if (m1092A2().mo2805d() instanceof NewNewProfileCard) {
            xdl0.Q0(((NewNewProfileCard) m1092A2().mo2805d()).mo815V(), new e30() { // from class: l.px30
                public final void call(Object obj) {
                    this.f18948a.m1253e5((int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f6 */
    public void m1259f6() {
        com.p1.mobile.android.ui.bubble.d.l().k("home_show_filter_tip");
        com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(this.f682U.mo15093g().getContext());
        aVar.B(t100.d(2.0f)).D("推荐的人不喜欢？试试调整筛选条件").k(new int[]{CoreModule.b.getResources().getColor(z0c0.d)}).l(t100.d(7.0f)).p(75).J(13.0f).I(228).w(t100.d(6.0f)).x(t100.d(6.0f)).L(w0c0.k0).C(10).y(true).q(com.p1.mobile.android.ui.bubble.a.N);
        com.p1.mobile.android.ui.bubble.d.l().u(aVar, this.f682U.mo15093g(), "home_show_filter_tip");
    }

    /* JADX INFO: renamed from: g2 */
    public View m1260g2() {
        return this.f682U.mo15093g();
    }

    /* JADX INFO: renamed from: g3 */
    public void m1261g3(boolean z) {
        if (g6a.z() || CoreModule.c.y2.E3()) {
            return;
        }
        xdl0.M(this.f682U.mo15101o(), z);
        if (z) {
            zvf0.x("e_find_partner_entrance", "p_suggest_users_home_view");
            xdl0.E0(this.f682U.mo15101o(), new View.OnClickListener() { // from class: l.qw30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19562a.m1302o4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m1262g4(View view) {
        com.p1.mobile.putong.core.ui.match.a.w().p(this.f656H, m1294n2(this.f658I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.sw30
            public final void call() {
                this.f20485a.m1257f4();
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m1263g5(int[] iArr) {
        if (!(m1092A2().mo2805d() instanceof e5m) || ((e5m) m1092A2().mo2805d()).mo1897H() == null) {
            return;
        }
        com.p1.mobile.putong.core.ui.match.a.w().S(act(), this.f694a, ((e5m) m1092A2().mo2805d()).mo1897H(), 3000);
    }

    /* JADX INFO: renamed from: g6 */
    public void m1264g6() {
        if (NullChecker.a(m1265h2()) && xdl0.O0(m1265h2())) {
            CoreModule.c.J0.j0.put(Boolean.valueOf(m1269h6(act().getString(R.string.N9), m1265h2(), jtk.f15293A | jtk.f15297E, 4, 0)));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public BoostViewContainer m1265h2() {
        return this.f682U.mo15095i();
    }

    /* JADX INFO: renamed from: h3 */
    public final void m1266h3() {
        CoreModule.c.z1.o3(this.f656H, new Function1() { // from class: l.ev30
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        });
        m1192S5(3);
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.fv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13181a.m1307p4(view);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m1267h4(View view) {
        User userM1143K2 = m1143K2(this.f658I);
        if (userM1143K2 == null) {
            return;
        }
        zvf0.r("e_compliment_card_btn_click", "p_suggest_users_home_view");
        int showPictureIndexProxy = (NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2805d()) && (m1092A2().mo2805d() instanceof mol)) ? ((mol) m1092A2().mo2805d()).getShowPictureIndexProxy() : 0;
        if (jo5.b(this.f656H, NullChecker.a(m1092A2()) ? m1092A2().mo2809j() : null, userM1143K2, "home_card_us_compliment_btn")) {
            return;
        }
        bo5.m(this.f656H, userM1143K2, "home_card_us_compliment_btn", Integer.valueOf(showPictureIndexProxy), (d30) null, bo5.i());
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m1268h5() {
        m1131H6(true);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m1269h6(String str, View view, int i2, int i3, int i4) {
        if (wc80.e().k()) {
            return false;
        }
        TextView textView = new TextView(this.f656H);
        textView.setText(str);
        int i5 = t100.m;
        int i6 = t100.i;
        textView.setPadding(i5, i6, t100.j, i6);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        float f2 = i3;
        com.p1.mobile.android.ui.bubble.d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).k(new int[]{e16.c(act(), w0c0.Q0)}).s(textView).w(t100.d(f2)).v(t100.d(f2)).x(i4).M(true).q(i2), view);
        return true;
    }

    /* JADX INFO: renamed from: i2 */
    public View m1271i2() {
        return this.f682U.mo15095i().getBoostButton();
    }

    /* JADX INFO: renamed from: i3 */
    public final void m1272i3() {
        zvf0.x("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        m1192S5(0);
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.nw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17750a.m1312q4(view);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m1273i4() {
        this.f660J.m19440j5();
        Animator animator = this.f745y1;
        if (animator != null && !animator.isRunning()) {
            this.f745y1.start();
        }
        this.f657H0.mo3128b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m1274i5(int i2) {
        if (TextUtils.isEmpty(m1309p6())) {
            m1314q6(i2);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m1275i6() {
        if (IntlCountryCodeController.v()) {
            e51.I(this.f658I, new Runnable() { // from class: l.fx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13190a.m1248d5();
                }
            }, 500L);
        } else if (m1092A2().mo2805d() instanceof NewNewProfileCard) {
            e51.I(this.f658I, new Runnable() { // from class: l.hx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14275a.m1258f5();
                }
            }, 500L);
        } else if (m1092A2().mo2805d() instanceof e5m) {
            e51.I(this.f658I, new Runnable() { // from class: l.ix30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14848a.m1238b5();
                }
            }, 500L);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        y8i0.m25203a("NewNewHomeViewModel inflateView");
        LaunchStep launchStep = LaunchStep.HomeTabInflate;
        yni.m25474f(launchStep);
        View viewM1137J1 = m1137J1(layoutInflater, viewGroup);
        m1205U6();
        this.f682U = new gk8(this.f740w);
        du2.a("BifrostLayout", "开始使用优化布局");
        this.f659I0 = new ProfileCardStackOpt((Context) act(), new qol0() { // from class: l.su30
            /* JADX INFO: renamed from: d2 */
            public final ool0 m22394d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f20471a.m1149L2(virtualCardType, userInfo);
            }
        }, this);
        if (upa.L3()) {
            int i2 = xdl0.e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = t100.d(44.0f);
            this.f706g.addView(this.f659I0, 0, layoutParams);
            xdl0.X(this.f698c, 0);
            this.f687W0 = LayoutInflater.from(act()).inflate(f6c0.hc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f738v.addView(this.f687W0.getRenderView(), layoutParams2);
        } else {
            this.f700d.setClipChildren(false);
            this.f700d.setClipToPadding(false);
            this.f659I0.setClipChildren(false);
            this.f659I0.setClipToPadding(false);
            xdl0.M(this.f704f, true);
            this.f706g.addView(this.f659I0, 0, new FrameLayout.LayoutParams(-1, -1));
            this.f687W0 = LayoutInflater.from(act()).inflate(f6c0.hc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            this.f738v.addView(this.f687W0.getRenderView(), layoutParams3);
        }
        xdl0.M(this.f687W0.getRenderView(), false);
        m1345x3();
        this.f657H0 = new RadarRipple(act());
        this.f746z.addView(this.f657H0.getRippleView(), 0, new FrameLayout.LayoutParams(-1, -1));
        if (upa.N3()) {
            this.f700d.setPadding(0, 0, 0, 0);
        }
        if (upa.Z2()) {
            psq.m20642M(this.f656H, this.f700d, this.f682U, this.f659I0);
        } else if (upa.c3()) {
            psq.m20643N(this.f656H, this.f682U);
        }
        m1317r3();
        m1336v3();
        m1236b3();
        this.f648E0 = this.f659I0;
        xdl0.E0(this.f661J0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.dv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC0030b.m1057n(view);
            }
        });
        this.f740w.getViewTreeObserver().addOnGlobalLayoutListener(this);
        yni.m25472d(launchStep);
        m1246d3();
        y8i0.m25204b();
        return viewM1137J1;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m1276j3() {
        VFrame vFrame = this.f700d;
        if (vFrame != null) {
            vFrame.setClipChildren(false);
            this.f700d.setClipToPadding(false);
        }
        VLinear vLinear = this.f702e;
        if (vLinear != null) {
            vLinear.setClipChildren(false);
            this.f702e.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.f706g;
        if (frameLayout != null) {
            frameLayout.setClipChildren(false);
            this.f706g.setClipToPadding(false);
            this.f706g.setClipToOutline(false);
        }
        ProfileCardStackOpt profileCardStackOpt = this.f659I0;
        if (profileCardStackOpt != null) {
            profileCardStackOpt.setClipChildren(false);
            this.f659I0.setClipToPadding(false);
        }
        if (this.f662K != null) {
            return;
        }
        xdl0.M(this.f704f, true);
        pon ponVar = new pon(this.f658I, new e30() { // from class: l.rx30
            public final void call(Object obj) {
                this.f20017a.m1318r4((Boolean) obj);
            }
        });
        this.f662K = ponVar;
        ponVar.m20535i(this.f704f);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m1278j5(e30 e30Var, d30 d30Var) {
        this.f660J.m19381X4();
        Boolean bool = Boolean.TRUE;
        e30Var.call(bool);
        if (!uq40.y(this.f656H, true)) {
            this.f660J.f17660G.onNext(bool);
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m1279j6() {
        if (NullChecker.a(m1096B2()) && xdl0.O0(m1096B2())) {
            rxg0.j().f.put(Boolean.valueOf(m1269h6(act().getString(R.string.M9), m1096B2(), jtk.f15296D | jtk.f15297E, 18, IntlCountryCodeController.v() ? 0 : -26)));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public View m1280k2() {
        return this.f682U.mo15095i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: k3 */
    public final void m1281k3() {
        m1192S5(4);
        ubo.INSTANCE.m22775e();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = qib0.f0 + "";
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.wv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22336a.m1323s4(view);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m1282k4() {
        psl pslVarI0 = this.f656H.fragmentManager().i0(TabName.Card.toString());
        if (NullChecker.a(pslVarI0) && (pslVarI0 instanceof psl)) {
            pslVarI0.mo2520C1(NewTanFragTag.HOME, null);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m1283k5(e30 e30Var, d30 d30Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        this.f660J.m19381X4();
        e30Var.call(Boolean.FALSE);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m1284k6() {
        com.p1.mobile.android.ui.bubble.d.l().k("home_show_just_look_verify_tip");
        com.p1.mobile.android.ui.bubble.a aVar = new com.p1.mobile.android.ui.bubble.a(this.f682U.mo15090d().getContext());
        aVar.B(t100.d(2.0f)).D("开启后，只为你展示通过真实头像认证的用户").k(new int[]{CoreModule.b.getResources().getColor(z0c0.d)}).l(t100.d(7.0f)).p(75).J(13.0f).w(t100.d(6.0f)).x(t100.d(6.0f)).y(true).q(com.p1.mobile.android.ui.bubble.a.N).b(5000L);
        com.p1.mobile.android.ui.bubble.d.l().u(aVar, this.f682U.mo15090d(), "home_show_just_look_verify_tip");
        o6j0.h("e_only_show_verified_bubble", "p_suggest_users_home_view", new o6j0.a[0]);
    }

    @Deprecated
    /* JADX INFO: renamed from: l2 */
    public View m1285l2() {
        return this.f661J0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m1286l4() {
        this.f660J.m19297C8();
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m1287l5(ViewGroup viewGroup, ViewGroup viewGroup2, dd80 dd80Var, final e30 e30Var, final d30 d30Var, View view) {
        boolean zM25421u = yij0.m25421u(viewGroup);
        boolean zM25421u2 = yij0.m25421u(viewGroup2);
        ygh0.Q(zM25421u, zM25421u2, qgp0.e().g());
        dd80Var.dismiss();
        PermissionHelper.m10211c().m10229r("android.permission.READ_CONTACTS").m10234w(false).m10232u(zM25421u || zM25421u2).m10221j(true).m10224m(new d30() { // from class: l.vt30
            public final void call() {
                this.f21772a.m1278j5(e30Var, d30Var);
            }
        }, new e30() { // from class: l.wt30
            public final void call(Object obj) {
                this.f22305a.m1283k5(e30Var, d30Var, (PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m10227p(new b()).m10231t(new a()).m10233v(new m()).m10220i(this.f656H);
    }

    @Deprecated
    /* JADX INFO: renamed from: l6 */
    public void m1288l6() {
        if (upa.N3()) {
            m1234a6(false);
        }
        if (m1201U2(" by showLiveCardBottomButtons s1 ")) {
            return;
        }
        m1115E5();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m1289m2() {
        return xdl0.O0(this.f661J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: m3 */
    public final void m1290m3() {
        m1192S5(1);
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.iw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14839a.m1327t4(view);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m1291m4(Boolean bool) {
        m1141J6();
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ View m1292m5() {
        View view = new View(act());
        view.setClickable(false);
        view.setBackgroundColor(520093696);
        view.setMinimumHeight(t100.d(2.0f));
        view.setLayoutParams(new LinearLayout.LayoutParams(xdl0.e, t100.d(2.0f)));
        xdl0.V(view, t100.d(12.0f));
        xdl0.W(view, t100.d(12.0f));
        return view;
    }

    /* JADX INFO: renamed from: m6 */
    public void m1293m6(int i2) {
        rxg0.E(this.f658I, m1107D2(), i2, new d30() { // from class: l.tw30
            public final void call() {
                this.f20888a.m1268h5();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final User m1294n2(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo2809j = newNewHomeFrag.f456C.m1092A2().mo2809j();
        if (!NullChecker.a(userInfoMo2809j) || m1200U1(newNewHomeFrag)) {
            return null;
        }
        return userInfoMo2809j.getRenderUser();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m1295n3() {
        m1192S5(2);
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.wu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22329a.m1332u4(view);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m1296n4(View view) {
        zvf0.u("e_femalevip_icon", "p_suggest_users_home_view", new j760[]{vwb.Y("femalevip_is_on", Boolean.valueOf(this.f685V0))});
        gei.m14948u().get().m14957I(act());
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m1297n5(roj0 roj0Var) {
        this.f658I.s4();
    }

    @Deprecated
    /* JADX INFO: renamed from: n6 */
    public void m1298n6() {
        if (IntlCountryCodeController.v() && NullChecker.a(this.f663K0)) {
            xdl0.M0(this.f663K0.f1687z, true);
            xdl0.M0(this.f663K0.f1662a, true);
            return;
        }
        if (upa.N3()) {
            m1234a6(true);
        }
        if (m1201U2(" by showNewBottomButton s1 ")) {
            return;
        }
        m1187R6();
        m1120F5();
    }

    /* JADX INFO: renamed from: o */
    public boolean m1299o() {
        m1175P5();
        return false;
    }

    /* JADX INFO: renamed from: o2 */
    public nsl m1300o2() {
        return this.f661J0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m1301o3() {
        if (idr.INSTANCE.h() == -1 || !C0029a.INSTANCE.m959e()) {
            return;
        }
        zvf0.x("e_same_entrance", "p_suggest_users_home_view");
        xdl0.M(this.f682U.mo15098l(), true);
        xdl0.M(this.f682U.mo15094h(), false);
        xdl0.M(this.f682U.mo15097k(), false);
        this.f660J.m19494v8();
        com.p1.mobile.putong.core.ui.likeminded.a.INSTANCE.j(this.f656H, new Function1() { // from class: l.gv30
            public final Object invoke(Object obj) {
                return this.f13778a.m1337v4((Long) obj);
            }
        }, new Function0() { // from class: l.hv30
            public final Object invoke() {
                return this.f14262a.m1342w4();
            }
        });
        xdl0.E0(this.f682U.mo15098l(), new View.OnClickListener() { // from class: l.iv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14828a.m1346x4(view);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m1302o4(View view) {
        zvf0.r("e_find_partner_entrance", "p_suggest_users_home_view");
        Intent intentM10586d2 = MkWebViewAct.m10586d2(this.f656H, "", juk.m17221e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/", true, true, true, null);
        intentM10586d2.putExtra("hideNotch", true);
        act().startActivity(intentM10586d2);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m1303o5(Throwable th) {
        this.f658I.s4();
        bx6.b(th);
    }

    /* JADX INFO: renamed from: o6 */
    public void m1304o6(final int i2) {
        if (m1133I3()) {
            return;
        }
        e51.H(act(), new Runnable() { // from class: l.kv30
            @Override // java.lang.Runnable
            public final void run() {
                this.f15864a.m1274i5(i2);
            }
        }, 500L);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat childAt = this.f740w.getChildAt(0);
        int childCount = childAt.getChildCount();
        int marginEnd = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = childAt.getChildAt(i2);
            if (childAt2.isShown() && childAt2.getId() != u4c0.mf) {
                int measuredWidth = marginEnd + childAt.getChildAt(i2).getMeasuredWidth();
                LinearLayoutCompat.a layoutParams = childAt2.getLayoutParams();
                marginEnd = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + layoutParams.getMarginEnd() + layoutParams.getMarginStart();
            }
        }
        va40.m23337h(xdl0.y0() - marginEnd);
    }

    /* JADX INFO: renamed from: p2 */
    public DraweeView m1305p2() {
        return this.f641B.f419c;
    }

    /* JADX INFO: renamed from: p3 */
    public void m1306p3() {
        xdl0.E0(this.f682U.getPosition(), new View.OnClickListener() { // from class: l.pw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18936a.m1351y4(view);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m1307p4(View view) {
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
            m1198T5(C0426b.INSTANCE.m8372f());
        }
        C0426b.INSTANCE.m8375i(this.f656H, 2);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m1308p5() {
        this.f660J.m19454l9(new e30() { // from class: l.tt30
            public final void call(Object obj) {
                this.f20860a.m1297n5((roj0) obj);
            }
        }, new e30() { // from class: l.ut30
            public final void call(Object obj) {
                this.f21331a.m1303o5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public String m1309p6() {
        if (!m1133I3() && NullChecker.a(m1107D2()) && m1107D2().getScaleY() == 1.0f && m1289m2()) {
            rxg0.j().v();
            if (zzc0.f0() && this.f658I.f456C.m1138J3() && ((!(this.f658I.getParentFragment() instanceof psl) || this.f658I.getParentFragment().mo2537T() == NewTanFragTag.HOME) && v930.h() == TabName.Card && !m1123G3() && ((!upa.Z2() || !CoreModule.c.z2.r3()) && !m1118F3()))) {
                return rxg0.j().J(m1294n2(this.f658I), this.f658I, m1107D2(), 2000);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: q2 */
    public NewNewHomeFrag m1310q2() {
        return this.f658I;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m1311q3(int i2) {
        boolean zM1128H3;
        if (!m1113E3() || i2 == 4) {
            if (i2 == 0) {
                zM1128H3 = C0029a.INSTANCE.m958d() && qx5.INSTANCE.d() != -1;
                if (zM1128H3) {
                    m1272i3();
                }
            } else if (i2 == 1) {
                zM1128H3 = m1128H3();
                if (zM1128H3) {
                    m1290m3();
                }
            } else if (i2 == 2) {
                zM1128H3 = m1150L3();
                if (zM1128H3) {
                    m1295n3();
                }
            } else if (i2 == 3) {
                zM1128H3 = m1108D3();
                if (zM1128H3) {
                    m1266h3();
                }
            } else if (i2 == 4) {
                zM1128H3 = m1113E3();
                if (zM1128H3) {
                    m1281k3();
                }
            } else if (i2 != 5) {
                zM1128H3 = false;
            } else {
                zM1128H3 = C0029a.INSTANCE.m956b();
                if (zM1128H3) {
                    m1217X2();
                }
            }
            qsl qslVar = this.f682U;
            if (!zM1128H3) {
                xdl0.M(qslVar.mo15098l(), false);
                return;
            }
            xdl0.M(qslVar.mo15098l(), true);
            xdl0.M(this.f682U.mo15094h(), false);
            xdl0.M(this.f682U.mo15097k(), false);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m1312q4(View view) {
        zvf0.r("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        gx5.a(this.f656H);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m1313q5(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        act().m3891f7();
    }

    /* JADX INFO: renamed from: q6 */
    public String m1314q6(int i2) {
        GradientBgButton gradientBgButtonM1107D2 = (IntlCountryCodeController.v() && NullChecker.a(this.f663K0)) ? this.f663K0.f1657B : m1107D2();
        if (!IntlCountryCodeController.v()) {
            if (CoreModule.c.o3() == null || !m1138J3() || CoreModule.c.o3().superLikeLimit.remainToday() == 0) {
                return null;
            }
            boolean zC = m1112E2().c();
            osl oslVar = this.f661J0;
            if (zC) {
                oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.c.o3().superLikeLimit.remainToday()));
                return "bubble_superlike_bubble";
            }
            oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.c.o3().superLikeLimit.remainToday()));
            rxg0.G(this.f656H, m1112E2(), this.f661J0.getSuperLikeRemaining());
            return "bubble_superlike_bubble";
        }
        if (!m1133I3() && NullChecker.a(gradientBgButtonM1107D2) && NullChecker.a(m1107D2()) && m1097B3() && xdl0.O0(gradientBgButtonM1107D2) && m1107D2().getScaleY() == 1.0f && m1289m2() && !m1112E2().c() && CoreModule.c.o3() != null && this.f658I.f456C.m1138J3() && this.f656H != null && !(((this.f658I.getParentFragment() instanceof psl) && this.f658I.getParentFragment().mo2537T() != NewTanFragTag.HOME) || m1200U1(this.f658I) || v930.h() != TabName.Card || m1123G3() || ((upa.Z2() && CoreModule.c.z2.r3()) || m1118F3()))) {
            return rxg0.j().K(this.f658I, (IntlCountryCodeController.v() && NullChecker.a(this.f663K0)) ? this.f663K0.f1657B : m1107D2(), i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m1315r() {
        m1350y3();
        m1326t3();
        m1276j3();
        m1211V6();
    }

    /* JADX INFO: renamed from: r2 */
    public nsl m1316r2() {
        return this.f661J0.getLikeBtn();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m1317r3() {
        if (upa.N3()) {
            this.f661J0 = m1207V2(f6c0.X3);
        } else if (u59.G()) {
            this.f661J0 = m1207V2(f6c0.c4);
        } else {
            this.f661J0 = m1207V2(f6c0.Y3);
        }
        if (IntlCountryCodeController.v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f661J0.getButtonRootLayout();
        buttonRootLayout.setId(u4c0.q5);
        this.f700d.addView(buttonRootLayout, this.f661J0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m1318r4(Boolean bool) {
        act().m3877Z5().m4038C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m1319r5() {
        m1111D6(StudentInfoAct.V1(act(), "Chanel1.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: r6 */
    public void m1320r6() {
        if (m1128H3()) {
            Animator animatorN = bt0.n(this.f682U.mo15098l(), bt0.i, new float[]{1.2f, 1.0f});
            animatorN.setDuration(800L);
            animatorN.setStartDelay(300L);
            animatorN.start();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public VDraweeView m1321s2() {
        return this.f639A;
    }

    /* JADX INFO: renamed from: s3 */
    public void m1322s3(boolean z, boolean z2) {
        this.f678S.onNext(Boolean.valueOf(z));
        this.f660J.f17666J = z2;
        float f2 = !z ? 1 : 0;
        m1316r2().getRealView().setScaleX(f2);
        m1316r2().getRealView().setScaleY(f2);
        m1300o2().getRealView().setScaleX(f2);
        m1300o2().getRealView().setScaleY(f2);
        m1107D2().setScaleX(f2);
        m1107D2().setScaleY(f2);
        m1122G2().getRealView().setScaleX(f2);
        m1122G2().getRealView().setScaleY(f2);
        if (!m1328t5()) {
            m1265h2().setScaleX(f2);
            m1265h2().setScaleY(f2);
            m1280k2().setScaleX(f2);
            m1280k2().setScaleY(f2);
        }
        m1193S6();
        m1330u2().setRadarColor(this.f670O);
        this.f745y1 = xij0.c0(m1330u2(), m1321s2(), !upa.z());
        xdl0.M0(this.f742x, z);
        m1141J6();
        xdl0.M0(this.f700d, true);
        m1164N6(z);
        m1159M6(!z);
        if (IntlCountryCodeController.v()) {
            if (NullChecker.a(m1117F2())) {
                xdl0.M(m1117F2(), !z);
            }
            if (NullChecker.a(m1132I2())) {
                xdl0.M(m1132I2(), !z);
            }
        }
        if (!m1328t5()) {
            m1180Q5(!z);
        }
        if (upa.N3()) {
            m1234a6(!z);
        }
        View immediatelyMatch = this.f661J0.getImmediatelyMatch();
        if (!u59.F() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.setScaleX(f2);
        immediatelyMatch.setScaleY(f2);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m1323s4(View view) {
        ubo uboVar = ubo.INSTANCE;
        uboVar.m22774d();
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
            m1198T5(uboVar.m22777g());
        }
        uboVar.m22784n(this.f656H, 2);
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m1324s5(TabName tabName) {
        m1165O1();
    }

    /* JADX INFO: renamed from: s6 */
    public void m1325s6(final Settings settings, final e30<Boolean> e30Var, final d30 d30Var) {
        ViewGroup viewGroup = (ViewGroup) m1310q2().H2().inflate(f6c0.L8, (ViewGroup) null, false);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(u4c0.p5);
        final ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(u4c0.kc);
        View viewFindViewById = viewGroup.findViewById(u4c0.wa);
        viewFindViewById.setBackgroundResource(x2c0.T);
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        final dd80 dd80VarO = new dd80.a(this.f656H).R(viewGroup).P(false).O();
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.mx30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17135a.m1287l5(viewGroup2, viewGroup3, dd80VarO, e30Var, d30Var, view);
            }
        });
        dd80VarO.show();
        ygh0.P(false);
        yij0.m25420t(viewGroup2, settings.hideContacts().booleanValue());
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: l.nx30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m25398T(viewGroup2));
            }
        });
        yij0.m25420t(viewGroup3, !settings.hideMutualContacts().booleanValue());
        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: l.ox30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!yij0.m25398T(viewGroup3));
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m1326t3() {
        if (g6a.w()) {
            ViewGroup viewGroup = (ViewGroup) this.f694a.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m1327t4(View view) {
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
            m1198T5(cp60.INSTANCE.e());
        }
        cp60.INSTANCE.e0(this.f656H, 2);
    }

    /* JADX INFO: renamed from: t5 */
    public boolean m1328t5() {
        return ogl0.A() || ogl0.B();
    }

    /* JADX INFO: renamed from: t6 */
    public void m1329t6() {
        ViewGroup viewGroup = (ViewGroup) this.f658I.H2().inflate(f6c0.ve, (ViewGroup) null, false);
        xdl0.c0(viewGroup, t100.d(32.0f));
        xdl0.f0(viewGroup, t100.d(32.0f));
        Settings settings = new Settings();
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        v9j v9jVar = new v9j() { // from class: l.rt30
            public final Object call() {
                return this.f19974a.m1292m5();
            }
        };
        viewGroup.addView((View) v9jVar.call(), 0);
        viewGroup.addView((View) v9jVar.call());
        act().dialog().E0(R.string.Jo).D(R.string.Ho).O(viewGroup).v().t0(R.string.Io, new Runnable() { // from class: l.st30
            @Override // java.lang.Runnable
            public final void run() {
                this.f20456a.m1308p5();
            }
        }).B(false).z().show();
    }

    /* JADX INFO: renamed from: u2 */
    public kol m1330u2() {
        return this.f657H0;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m1331u3() {
        if (C0029a.INSTANCE.m964j()) {
            SVGAnimationView sVGAnimationViewMo15094h = this.f682U.mo15094h();
            adi0 adi0Var = adi0.INSTANCE;
            xdl0.M(sVGAnimationViewMo15094h, adi0Var.e() != -1);
            xdl0.M(this.f682U.mo15097k(), adi0Var.e() != -1);
            if (adi0Var.e() != -1) {
                this.f660J.m19366U4();
                xdl0.E0(this.f682U.mo15094h(), new View.OnClickListener() { // from class: l.cv30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f10782a.m1356z4(view);
                    }
                });
                zvf0.x("e_suggest_tarot_entrance", "p_suggest_users_home_view");
                hei0.a(this.f656H, false);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m1332u4(View view) {
        if (this.f682U.mo15098l().isAnimating()) {
            this.f682U.mo15098l().stopAnimation(true);
            m1198T5(qff0.INSTANCE.m20941f());
        }
        qff0.INSTANCE.m20949n(this.f656H, 2);
    }

    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public final void m1129H4(wsf0 wsf0Var, mol molVar) {
        if (wsf0Var.mo2805d() == null) {
            return;
        }
        if ((mah0.m0() && NullChecker.a(wsf0Var.mo2809j()) && NullChecker.a(wsf0Var.mo2814o().m17130d()) && (mah0.y0(((DbObject) wsf0Var.mo2814o().m17130d()).id) || wsf0Var.mo2809j() == null)) || wsf0Var.m19515q() || wsf0Var.m19513f()) {
            return;
        }
        if (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17131e()) && CoreModule.c.m0.e2.x3(wsf0Var.mo2814o().m17131e())) {
            return;
        }
        if (wsf0Var.mo2812m()) {
            wsf0Var.mo2813n();
            return;
        }
        if (wsf0Var.mo2805d() instanceof e5m) {
            ExpandedCardStyleHelper.m2064o().m2072m(wsf0Var.mo2814o().m17130d(), wsf0Var.mo2809j());
            return;
        }
        a5m a5mVar = wsf0Var.mo2805d() instanceof a5m ? (a5m) wsf0Var.mo2805d() : null;
        if (NullChecker.a(a5mVar) && CoreModule.N().M8()) {
            NewNewProfileCard.m743Y1();
        }
        if (NullChecker.a(a5mVar)) {
            a5mVar.mo762C();
        }
        int i2 = (a5mVar == null || ((a5mVar instanceof d5m) && !((d5m) a5mVar).mo799P())) ? 1 : 0;
        boolean z = NullChecker.a(a5mVar) && NullChecker.a(a5mVar.getCardData()) && NullChecker.a(a5mVar.getCardData().m17131e()) && (a5mVar.getCardData().m17131e().isUserLikeMe() || (CoreModule.o.b().wf() && a5mVar.getCardData().m17131e().hasLikeMeSlideCardTop));
        String str = z ? "upper_right" : "null";
        if (NullChecker.a(a5mVar) && a5mVar.mo765D("female_like_flag_lower_left")) {
            str = "lower_left";
            z = true;
        }
        CoreSuggested.UserInfo userInfoMo2809j = m1092A2().mo2809j();
        CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
        ArrayList arrayListF0 = vwb.f0(new o6j0.a[]{o6j0.a.f("IsWhiteBlock", i2), o6j0.a.h("moments_user_id", NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0"), o6j0.a.i("show_he_liked", z), o6j0.a.h("show_he_liked_position", str), o6j0.a.i("is_first_picture", this.f660J.m19427g6(NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0") && molVar.getShowPictureIndexProxy() == 0), o6j0.a.h("swipe_scene", "default"), o6j0.a.i("theme_card_ornot", NullChecker.a(userInfoMo2809j) && userInfoMo2809j.isThemeCard), o6j0.a.h("is_moment_card", molVar.mo917z() ? "1" : "0"), o6j0.a.h("moment_id", momentInfoProxy != null ? ((CopyObject) momentInfoProxy).id : "0"), o6j0.a.h("is_show_longtimenosee_tag", (upa.r1() && NullChecker.a(userInfoMo2809j) && userInfoMo2809j.meetAgain) ? "1" : "0")});
        if (upa.N3() && NullChecker.a(userInfoMo2809j)) {
            for (Map.Entry entry : userInfoMo2809j.trackMap.entrySet()) {
                arrayListF0.add(o6j0.a.h((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        o6j0.c("e_card", this.f658I.pageId(), (o6j0.a[]) arrayListF0.toArray(new o6j0.a[0]));
        if (molVar.mo917z()) {
            o6j0.c("e_moment", this.f658I.pageId(), new o6j0.a[]{o6j0.a.h("moment_id", momentInfoProxy != null ? ((CopyObject) momentInfoProxy).id : "0"), o6j0.a.h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0")});
        }
        abi.y(true);
        m1116E6((sb90.e(m1092A2().mo2814o().m17130d()) && NullChecker.a(userInfoMo2809j) && NullChecker.a(userInfoMo2809j.cityCData)) ? "from_city_center_conv_banner" : "home_card", act().color(w0c0.O1));
        HashMap map = new HashMap();
        map.put("Action", "More user info");
        w85.INSTANCE.m24000m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u6 */
    public void m1334u6(String str, String str2, String str3, int i2, int i3, Figure figure, double d2, final d30 d30Var) {
        d30 d30Var2 = new d30() { // from class: l.lv30
            public final void call() {
                this.f16423a.m1313q5(d30Var);
            }
        };
        if (!d8e0.a(CoreModule.c.e0.p9()) || !NullChecker.a(figure) || !TEnum.equals(figure.type, "distance") || figure.total <= 0) {
            act().m3893g7(str2, str, figure, str3, d2, d30Var2);
        } else {
            act().m3893g7(rza.B0(act(), i3, i2, figure), str, figure, str3, d2, d30Var2);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public nt30 m1335v2() {
        return this.f660J;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m1336v3() {
        if (upa.N3()) {
            this.f671O0 = new HomeCardTopNameViewBar(act());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            this.f671O0.setLayoutParams(layoutParams);
            xdl0.M(this.f671O0, false);
            this.f700d.addView(this.f671O0);
            this.f671O0.bringToFront();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Unit m1337v4(Long l2) {
        m1210V5(2);
        return null;
    }

    /* JADX INFO: renamed from: v5 */
    public void m1338v5(boolean z) {
        this.f726p0 = z;
        if (z && NullChecker.a(act())) {
            m1175P5();
            dbl0.a(act().getWindow().getDecorView(), false);
        }
        if (!z && xdl0.O0(m1265h2())) {
            m1177Q1();
        }
        if (this.f726p0 && NullChecker.a(m1092A2()) && NullChecker.a(m1092A2().mo2805d()) && (m1092A2().mo2805d() instanceof a5m)) {
            ((a5m) m1092A2().mo2805d()).mo762C();
        }
        if (this.f726p0 && u59.d0()) {
            j8w.Companion.a().r1();
        }
        if (!this.f726p0) {
            CoreModule.c.A1.t3(this.f656H, new Function1() { // from class: l.ow30
                public final Object invoke(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC0030b.m1005R0((IntlMarketConfigEnvelope) obj);
                }
            });
        }
        if (z) {
            return;
        }
        m1170O6();
        m1165O1();
    }

    /* JADX INFO: renamed from: v6 */
    public void m1339v6() {
        if (m1133I3()) {
            return;
        }
        this.f661J0.getSuperLikeRemaining().setText(String.valueOf(swh0.v0()));
        rxg0.j();
        rxg0.G(this.f656H, m1112E2(), this.f661J0.getSuperLikeRemaining());
    }

    /* JADX INFO: renamed from: w2 */
    public View m1340w2() {
        if (upa.N3()) {
            return this.f661J0.getUndo().getRealView();
        }
        if (wh5.d().e()) {
            wh5.d().b = false;
        }
        return this.f661J0.getUndo().getRealView();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Unit m1342w4() {
        m1210V5(1);
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public void m1343w5() {
        m1276j3();
        pon ponVar = this.f662K;
        if (ponVar != null) {
            ponVar.m20538m();
        }
    }

    /* JADX INFO: renamed from: w6 */
    public void m1344w6(boolean z) {
        if (m1107D2().getScaleY() == 1.0f && m1289m2()) {
            if (upa.Z2() && CoreModule.c.z2.r3()) {
                return;
            }
            rxg0.j().v();
            if (!m1123G3()) {
                rxg0.j().y(m1294n2(this.f658I), this.f658I, m1107D2(), z);
            }
            if (m1200U1(this.f658I)) {
                return;
            }
            m1125G5(true);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m1345x3() {
        this.f663K0 = (HomeViewUSLayout) this.f736u.inflate();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m1346x4(View view) {
        zvf0.r("e_same_entrance", "p_suggest_users_home_view");
        com.p1.mobile.putong.core.ui.likeminded.a.INSTANCE.f(this.f656H, true);
    }

    /* JADX INFO: renamed from: x5 */
    public void m1347x5() {
        if (NullChecker.a(this.f661J0.getButtonsRightLayout())) {
            xdl0.M(this.f661J0.getButtonsRightLayout(), false);
            if (NullChecker.a(this.f669N0)) {
                xdl0.M(this.f669N0, false);
            }
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final void m1348x6() {
        if (!NullChecker.a(m1092A2().mo2814o()) || !NullChecker.a(m1092A2().mo2814o().m17130d()) || !ogl0.a0() || CoreModule.c.e0.c8() || CoreModule.c.e0.na().isJailed() || swh0.v0() <= 0 || myc0.d0().m.contains(((DbObject) m1092A2().mo2814o().m17130d()).id) || !myc0.d0().g0()) {
            return;
        }
        m1339v6();
        myc0.d0().m.add(((DbObject) m1092A2().mo2814o().m17130d()).id);
        myc0.d0().m0();
    }

    /* JADX INFO: renamed from: y2 */
    public Runnable m1349y2() {
        return this.f672P;
    }

    /* JADX INFO: renamed from: y3 */
    public void m1350y3() {
        final wsf0 wsf0VarM1092A2 = m1092A2();
        m1251e3();
        m1341w3(wsf0VarM1092A2);
        if (IntlCountryCodeController.v() && NullChecker.a(this.f663K0)) {
            this.f663K0.f1663b.setOnClickListener(new View.OnClickListener() { // from class: l.zt30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23873a.m1151L4(wsf0VarM1092A2, view);
                }
            });
            this.f663K0.f1664c.setOnClickListener(new View.OnClickListener() { // from class: l.lu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16415a.m1157M4(wsf0VarM1092A2, view);
                }
            });
            xdl0.M0(this.f663K0.f1687z, true);
            xdl0.C0(m1285l2(), 0);
            xdl0.h0(this.f700d, 0);
            xdl0.M0(this.f663K0.f1662a, true);
            if (upa.N3()) {
                wsf0VarM1092A2.setUsHomeExpandCardAnimHelper(new ehj0(act(), wsf0VarM1092A2, this.f698c));
            } else {
                chj0 chj0Var = new chj0(act(), wsf0VarM1092A2, this.f698c);
                this.f680T = chj0Var;
                wsf0VarM1092A2.setUsHomeCardAnimHelper(chj0Var);
            }
            xdl0.E0(this.f663K0.f1658C, new View.OnClickListener() { // from class: l.nu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.m1051l(wsf0VarM1092A2, view);
                }
            });
            xdl0.E0(this.f663K0.f1657B, new View.OnClickListener() { // from class: l.ou30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.m1038f1(wsf0VarM1092A2, view);
                }
            });
            xdl0.E0(this.f663K0.f1659D, new View.OnClickListener() { // from class: l.pu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18920a.m1162N4(view);
                }
            });
            xdl0.E0(this.f663K0.f1660E, new View.OnClickListener() { // from class: l.qu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19528a.m1168O4(view);
                }
            });
            this.f663K0.f1657B.setLongPressingListener(new f());
        } else {
            this.f661J0.getButtonRootLayout().setClipChildren(false);
            this.f661J0.getButtonRootLayout().setClipToPadding(false);
        }
        if (!vdj.c() && IntlCountryCodeController.o()) {
            m1230a2();
            if (nkp.e()) {
                m1245d2();
            }
        } else {
            m1245d2();
        }
        if (!IntlCountryCodeController.t()) {
            act().duringCreated(rx.c.combineLatest(CoreModule.c.L1.d3().onBackpressureLatest().observeOn(jo0.a()), CoreModule.c.A1.l3().onBackpressureLatest().observeOn(jo0.a()), this.f678S.asObservable().filter(new w9j() { // from class: l.ru30
                public final Object call(Object obj) {
                    return this.f19981a.m1093A4((Boolean) obj);
                }
            }), new y9j() { // from class: l.tu30
                /* JADX INFO: renamed from: a */
                public final Object m22673a(Object obj, Object obj2, Object obj3) {
                    return j760.a(Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue()), (Boolean) obj3);
                }
            })).filter(new w9j() { // from class: l.uu30
                public final Object call(Object obj) {
                    return this.f21337a.m1098B4((j760) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.vu30
                public final void call(Object obj) {
                    this.f21790a.m1104C4((j760) obj);
                }
            }, new e30() { // from class: l.au30
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.m1053l1((Throwable) obj);
                }
            }));
            act().duringCreated(CoreModule.c.A1.j3()).filter(new w9j() { // from class: l.bu30
                public final Object call(Object obj) {
                    return this.f10311a.m1109D4((Boolean) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.cu30
                public final void call(Object obj) {
                    this.f10768a.m1114E4((Boolean) obj);
                }
            }, new e30() { // from class: l.du30
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC0030b.m1010U((Throwable) obj);
                }
            }));
        }
        m1020Y2();
        this.f670O = act().color(w0c0.I);
        this.f666M = new C0107c(this.f660J, this);
        if (upa.N3()) {
            m1235b2(this.f666M);
        }
        wsf0VarM1092A2.setAdapter(this.f666M);
        m1316r2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.eu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12687a.m1119F4(wsf0VarM1092A2, view);
            }
        });
        m1300o2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.fu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13166a.m1124G4(wsf0VarM1092A2, view);
            }
        });
        View realView = m1316r2().getRealView();
        n nVar = new n();
        this.f642B1 = nVar;
        realView.setOnTouchListener(nVar);
        View realView2 = m1300o2().getRealView();
        n nVar2 = new n();
        this.f644C1 = nVar2;
        realView2.setOnTouchListener(nVar2);
        this.f693Z0 = xck0.a(500, new e30() { // from class: l.gu30
            public final void call(Object obj) {
                this.f13752a.m1129H4(wsf0VarM1092A2, (mol) obj);
            }
        });
        wsf0VarM1092A2.mo2808i(new e30() { // from class: l.iu30
            public final void call(Object obj) {
                this.f14813a.m1134I4(obj);
            }
        });
        wsf0VarM1092A2.mo2815p(new g(wsf0VarM1092A2));
        final nt30 nt30Var = this.f660J;
        Objects.requireNonNull(nt30Var);
        wsf0VarM1092A2.mo2807g(new id50() { // from class: l.ju30
            @Override // p009l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo13174a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return nt30Var.m19506y8(molVar, swipeDirection, z);
            }
        });
        xij0.Z(m1321s2(), new d30() { // from class: l.ku30
            public final void call() {
                this.f15857a.m1139J4();
            }
        });
        wsf0VarM1092A2.setAllowUpSwipe(true);
        m1340w2().setOnClickListener(new View.OnClickListener() { // from class: l.mu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17110a.m1145K4(wsf0VarM1092A2, view);
            }
        });
        xdl0.g0(new View[]{this.f682U.mo15089c()});
        xdl0.Z(new View[]{this.f696b});
        xdl0.Z(new View[]{this.f698c});
        m1212W2();
        CoreBusinessModule.m0().k(this);
        if (upa.C2()) {
            if (this.f661J0.getUndo() != null) {
                this.f661J0.getUndo().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
            }
            this.f661J0.getDislikeBtn().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
            this.f661J0.getLikeBtn().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
            this.f661J0.getSuperLike().setNormalStateLayerBackground(this.f656H.drawable(this.f661J0.getOperationBtnBg()));
        }
        m1306p3();
        m1256f3();
        if (u59.G()) {
            m1226Z2();
        } else if (u59.I()) {
            m1231a3();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m1351y4(View view) {
        CoreModule.o.d().Pa(m1101C0());
        zvf0.r("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y5 */
    public void m1352y5() {
        if (NullChecker.a(m1092A2())) {
            m1092A2().mo2802a();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public void m1353y6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        com.p1.mobile.android.ui.bubble.d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).H(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).r(str2).D(str).x(t100.d(8.0f)).k(new int[]{Color.parseColor(str3)}).l(t100.d(7.0f)).p(75).J(13.0f).o(com.p1.mobile.android.ui.bubble.a.P, t100.d(1.0f)).b(3500L).q(com.p1.mobile.android.ui.bubble.a.P | com.p1.mobile.android.ui.bubble.a.N), this.f740w.f2724t);
    }

    /* JADX INFO: renamed from: z2 */
    public FrameLayout m1354z2() {
        return this.f694a;
    }

    /* JADX INFO: renamed from: z3 */
    public final void m1355z3() {
        User userM17130d;
        if (!u59.I() || this.f663K0 == null || m1092A2() == null || m1092A2().mo2814o() == null || (userM17130d = m1092A2().mo2814o().m17130d()) == null) {
            return;
        }
        if ((m1092A2().mo2805d() instanceof VirtualCard) && m1092A2().mo2805d().getCardType() == VirtualCardType.IntlRecallMembershipCard) {
            hmb.M(this.f663K0.f1672k, false);
            hmb.M(this.f663K0.f1673l, false);
            return;
        }
        boolean zM2347r = HomeCardBottomOptButtons.m2347r(userM17130d);
        if (zM2347r) {
            String strA = co5.a("home_card_us_compliment_btn");
            if (!TextUtils.isEmpty(strA)) {
                co5.f(NullChecker.a(this.f658I) ? this.f658I.pageId() : "p_suggest_users_home_view", strA);
            }
        }
        hmb.M(this.f663K0.f1672k, !zM2347r);
        hmb.M(this.f663K0.f1673l, zM2347r);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m1356z4(View view) {
        zvf0.r("e_suggest_tarot_entrance", "p_suggest_users_home_view");
        oci0.a(this.f656H);
    }

    /* JADX INFO: renamed from: z5 */
    public void m1357z5(ArrayList<Media> arrayList) {
        final User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.b(userP9)) {
            this.f656H.progress(R.string.J5);
            Media media = arrayList.get(0);
            final User user = new User();
            user.pictures = new ArrayList();
            this.f656H.duringCreated(ya5.I(vwb.f0(new Media[]{media}), "petPhoto").compose(mkd0.C())).map(new w9j() { // from class: l.ov30
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC0030b.m1033e((List) obj);
                }
            }).map(new w9j() { // from class: l.zv30
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC0030b.m1045j(userP9, user, (Picture) obj);
                }
            }).flatMap(new w9j() { // from class: l.kw30
                public final Object call(Object obj) {
                    return CoreModule.c.e0.u9((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.vw30
                public final void call(Object obj) {
                    this.f21807a.m1179Q4((roj0) obj);
                }
            }, new e30() { // from class: l.gx30
                public final void call(Object obj) {
                    this.f13802a.m1185R4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z6 */
    public void m1358z6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        com.p1.mobile.android.ui.bubble.d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).H(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).r(str2).D(str).x(t100.d(8.0f)).k(new int[]{Color.parseColor(str3)}).l(t100.d(7.0f)).p(75).J(13.0f).o(com.p1.mobile.android.ui.bubble.a.P, t100.d(1.0f)).b(3500L).q(com.p1.mobile.android.ui.bubble.a.P | com.p1.mobile.android.ui.bubble.a.N), this.f740w.f2724t);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: w3 */
    public final void m1341w3(wsf0 wsf0Var) {
    }
}
