package com.p051p1.mobile.putong.core.newui.home;

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
import androidx.lifecycle.InterfaceC0476e;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.DraweeView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.admob.C4866a;
import com.p051p1.mobile.putong.core.api.C4881b;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;
import com.p051p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.CardStackShadowView;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.C8438a;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.core.p058ui.campus.StudentInfoAct;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p051p1.mobile.putong.core.p058ui.likeminded.C8574a;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.HomeCardTopNameViewBar;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Squared;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.C21545y9;
import p153l.a5i0;
import p153l.adc0;
import p153l.ami0;
import p153l.as20;
import p153l.asj0;
import p153l.atl;
import p153l.avl;
import p153l.b240;
import p153l.b5c0;
import p153l.b5v;
import p153l.bnl0;
import p153l.bsj0;
import p153l.bvl;
import p153l.c8d0;
import p153l.c9c0;
import p153l.cb0;
import p153l.cf7;
import p153l.cl80;
import p153l.cvl;
import p153l.d5v;
import p153l.d6h0;
import p153l.d79;
import p153l.dbc0;
import p153l.dmk0;
import p153l.dn3;
import p153l.dvl;
import p153l.e1b;
import p153l.emf;
import p153l.ey6;
import p153l.f1g0;
import p153l.f4j;
import p153l.f5v;
import p153l.f760;
import p153l.f9c0;
import p153l.fb0;
import p153l.fcp;
import p153l.fmj;
import p153l.fo0;
import p153l.fp5;
import p153l.fph0;
import p153l.fqj0;
import p153l.fqr;
import p153l.fyw;
import p153l.g640;
import p153l.gbm;
import p153l.gfe0;
import p153l.gkc0;
import p153l.gol0;
import p153l.gp5;
import p153l.gra;
import p153l.gsl0;
import p153l.gt0;
import p153l.gta;
import p153l.h7d0;
import p153l.haw;
import p153l.hkl0;
import p153l.hni0;
import p153l.hqj0;
import p153l.hyf;
import p153l.i4g0;
import p153l.iam;
import p153l.ibl;
import p153l.ige0;
import p153l.ik4;
import p153l.ix60;
import p153l.iz40;
import p153l.j26;
import p153l.j2c;
import p153l.j6e;
import p153l.jfr;
import p153l.ji30;
import p153l.jj40;
import p153l.jje0;
import p153l.jl80;
import p153l.jyb;
import p153l.jz20;
import p153l.k3l;
import p153l.k6e;
import p153l.kec0;
import p153l.kl8;
import p153l.kql;
import p153l.l51;
import p153l.l6e;
import p153l.l83;
import p153l.llb0;
import p153l.ly5;
import p153l.m2t;
import p153l.map;
import p153l.na3;
import p153l.nmp;
import p153l.np5;
import p153l.nq40;
import p153l.o1j0;
import p153l.ob00;
import p153l.oli0;
import p153l.p6d0;
import p153l.p9r;
import p153l.pci;
import p153l.pcj;
import p153l.pei;
import p153l.pf60;
import p153l.pgj;
import p153l.pl50;
import p153l.pq50;
import p153l.pqn;
import p153l.psd0;
import p153l.pyf0;
import p153l.pzi0;
import p153l.q4h0;
import p153l.q7m;
import p153l.qa00;
import p153l.qap;
import p153l.qcj;
import p153l.qmj0;
import p153l.qnp0;
import p153l.quq;
import p153l.r1i0;
import p153l.rbb0;
import p153l.ric0;
import p153l.s7a;
import p153l.scj;
import p153l.sdp;
import p153l.sfj0;
import p153l.snm;
import p153l.sp0;
import p153l.spl0;
import p153l.sx20;
import p153l.sxl0;
import p153l.t7m;
import p153l.tq50;
import p153l.tu2;
import p153l.u7l;
import p153l.u7m;
import p153l.u8j;
import p153l.udo;
import p153l.uei;
import p153l.uih0;
import p153l.upp0;
import p153l.uqb0;
import p153l.uqi;
import p153l.uwb0;
import p153l.uxj0;
import p153l.uxl0;
import p153l.vcj;
import p153l.vd2;
import p153l.vfi;
import p153l.vi0;
import p153l.vnb;
import p153l.vo0;
import p153l.vql;
import p153l.vy5;
import p153l.wi5;
import p153l.wj90;
import p153l.wro;
import p153l.wvb0;
import p153l.x20;
import p153l.x95;
import p153l.xnf0;
import p153l.xql;
import p153l.xu10;
import p153l.y0i0;
import p153l.y20;
import p153l.yb5;
import p153l.yhe0;
import p153l.yhi0;
import p153l.z5h0;
import p153l.z80;
import p153l.zl4;
import p153l.zm4;
import p153l.zqr;
import p153l.zvk;
import p153l.zwk;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b */
/* JADX INFO: loaded from: classes11.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC8017b implements iam<b240>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: H1 */
    public static boolean f22601H1 = true;

    /* JADX INFO: renamed from: I1 */
    public static n f22602I1 = new n();

    /* JADX INFO: renamed from: A */
    public VDraweeView f22603A;

    /* JADX INFO: renamed from: B */
    public HomeEmptyCardView f22605B;

    /* JADX INFO: renamed from: B1 */
    public n f22606B1;

    /* JADX INFO: renamed from: C */
    public HomeErrorNetView f22607C;

    /* JADX INFO: renamed from: C1 */
    public n f22608C1;

    /* JADX INFO: renamed from: D */
    public HomeErrorNetView f22609D;

    /* JADX INFO: renamed from: E */
    public VImage f22611E;

    /* JADX INFO: renamed from: E0 */
    public f1g0 f22612E0;

    /* JADX INFO: renamed from: F */
    public VText f22614F;

    /* JADX INFO: renamed from: F1 */
    public String f22616F1;

    /* JADX INFO: renamed from: G */
    public VButton f22617G;

    /* JADX INFO: renamed from: G1 */
    public int f22619G1;

    /* JADX INFO: renamed from: H */
    public final Act f22620H;

    /* JADX INFO: renamed from: H0 */
    public vql f22621H0;

    /* JADX INFO: renamed from: I */
    public final NewNewHomeFrag f22622I;

    /* JADX INFO: renamed from: I0 */
    public ProfileCardStackOpt f22623I0;

    /* JADX INFO: renamed from: J */
    public b240 f22624J;

    /* JADX INFO: renamed from: J0 */
    public bvl f22625J0;

    /* JADX INFO: renamed from: K */
    @Nullable
    public pqn f22626K;

    /* JADX INFO: renamed from: K0 */
    public HomeViewUSLayout f22627K0;

    /* JADX INFO: renamed from: M */
    public C8094c f22630M;

    /* JADX INFO: renamed from: N */
    public String f22632N;

    /* JADX INFO: renamed from: N0 */
    public CardStackShadowView f22633N0;

    /* JADX INFO: renamed from: O */
    public int f22634O;

    /* JADX INFO: renamed from: O0 */
    public HomeCardTopNameViewBar f22635O0;

    /* JADX INFO: renamed from: T */
    public fqj0 f22644T;

    /* JADX INFO: renamed from: U */
    public dvl f22646U;

    /* JADX INFO: renamed from: V */
    public Animator f22648V;

    /* JADX INFO: renamed from: W */
    public Animator f22650W;

    /* JADX INFO: renamed from: W0 */
    public q4h0 f22651W0;

    /* JADX INFO: renamed from: X0 */
    public ExpandedFakeProfileTitle f22653X0;

    /* JADX INFO: renamed from: Y */
    public boolean f22654Y;

    /* JADX INFO: renamed from: Y0 */
    public qmj0 f22655Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f22656Z;

    /* JADX INFO: renamed from: Z0 */
    public y20 f22657Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f22658a;

    /* JADX INFO: renamed from: a1 */
    public int f22659a1;

    /* JADX INFO: renamed from: b */
    public View f22660b;

    /* JADX INFO: renamed from: b1 */
    public int f22661b1;

    /* JADX INFO: renamed from: c */
    public VFrame f22662c;

    /* JADX INFO: renamed from: c1 */
    public jje0 f22663c1;

    /* JADX INFO: renamed from: d */
    public VFrame f22664d;

    /* JADX INFO: renamed from: d1 */
    public pq50 f22665d1;

    /* JADX INFO: renamed from: e */
    public VLinear f22666e;

    /* JADX INFO: renamed from: e1 */
    public tq50 f22667e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f22668f;

    /* JADX INFO: renamed from: f1 */
    public d6h0 f22669f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f22670g;

    /* JADX INFO: renamed from: g1 */
    public u8j f22671g1;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f22672h;

    /* JADX INFO: renamed from: h1 */
    public zqr f22673h1;

    /* JADX INFO: renamed from: i */
    public AppCompatImageView f22674i;

    /* JADX INFO: renamed from: i1 */
    public snm f22675i1;

    /* JADX INFO: renamed from: j */
    public VFrame_Squared f22676j;

    /* JADX INFO: renamed from: j1 */
    public hyf f22677j1;

    /* JADX INFO: renamed from: k */
    public VDraweeView f22678k;

    /* JADX INFO: renamed from: k0 */
    public boolean f22679k0;

    /* JADX INFO: renamed from: k1 */
    public gol0 f22680k1;

    /* JADX INFO: renamed from: l */
    public HomeEmptyCardView f22681l;

    /* JADX INFO: renamed from: l1 */
    public gfe0 f22682l1;

    /* JADX INFO: renamed from: m */
    public HomeErrorNetView f22683m;

    /* JADX INFO: renamed from: m1 */
    public C4866a f22684m1;

    /* JADX INFO: renamed from: n */
    public HomeErrorNetView f22685n;

    /* JADX INFO: renamed from: n1 */
    public ob00 f22686n1;

    /* JADX INFO: renamed from: o */
    public VImage f22687o;

    /* JADX INFO: renamed from: o1 */
    public pyf0 f22688o1;

    /* JADX INFO: renamed from: p */
    public VText f22689p;

    /* JADX INFO: renamed from: p0 */
    public boolean f22690p0;

    /* JADX INFO: renamed from: p1 */
    public wvb0 f22691p1;

    /* JADX INFO: renamed from: q */
    public VButton f22692q;

    /* JADX INFO: renamed from: q1 */
    public ibl f22693q1;

    /* JADX INFO: renamed from: r */
    public SceneView f22694r;

    /* JADX INFO: renamed from: r1 */
    public l83 f22695r1;

    /* JADX INFO: renamed from: s */
    public VText f22696s;

    /* JADX INFO: renamed from: s1 */
    public gbm f22697s1;

    /* JADX INFO: renamed from: t */
    public ViewStub f22698t;

    /* JADX INFO: renamed from: t1 */
    public uei f22699t1;

    /* JADX INFO: renamed from: u */
    public ViewStub f22700u;

    /* JADX INFO: renamed from: u1 */
    public pei f22701u1;

    /* JADX INFO: renamed from: v */
    public FrameLayout f22702v;

    /* JADX INFO: renamed from: v1 */
    public yhe0 f22703v1;

    /* JADX INFO: renamed from: w */
    public HomeTitleLayout f22704w;

    /* JADX INFO: renamed from: w1 */
    public uwb0 f22705w1;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f22706x;

    /* JADX INFO: renamed from: y */
    public AppCompatImageView f22708y;

    /* JADX INFO: renamed from: y1 */
    public Animator f22709y1;

    /* JADX INFO: renamed from: z */
    public VFrame_Squared f22710z;

    /* JADX INFO: renamed from: L */
    public final Runnable f22628L = new e();

    /* JADX INFO: renamed from: P */
    public final Runnable f22636P = null;

    /* JADX INFO: renamed from: Q */
    public Runnable f22638Q = null;

    /* JADX INFO: renamed from: R */
    public boolean f22640R = true;

    /* JADX INFO: renamed from: S */
    public C22507a<Boolean> f22642S = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: X */
    public boolean f22652X = false;

    /* JADX INFO: renamed from: F0 */
    public long f22615F0 = -1;

    /* JADX INFO: renamed from: G0 */
    public String f22618G0 = "empty";

    /* JADX INFO: renamed from: L0 */
    public String f22629L0 = "@@";

    /* JADX INFO: renamed from: M0 */
    public boolean f22631M0 = false;

    /* JADX INFO: renamed from: P0 */
    public final int f22637P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    public final int f22639Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    public final int f22641R0 = 2;

    /* JADX INFO: renamed from: S0 */
    public final int f22643S0 = 3;

    /* JADX INFO: renamed from: T0 */
    public final int f22645T0 = 4;

    /* JADX INFO: renamed from: U0 */
    public final int f22647U0 = 5;

    /* JADX INFO: renamed from: V0 */
    public boolean f22649V0 = false;

    /* JADX INFO: renamed from: x1 */
    public boolean f22707x1 = true;

    /* JADX INFO: renamed from: z1 */
    public final Runnable f22711z1 = new j();

    /* JADX INFO: renamed from: A1 */
    public final k3l f22604A1 = new k();

    /* JADX INFO: renamed from: D1 */
    public final Runnable f22610D1 = new Runnable() { // from class: l.c240
        @Override // java.lang.Runnable
        public final void run() {
            ViewTreeObserverOnGlobalLayoutListenerC8017b.m38064c();
        }
    };

    /* JADX INFO: renamed from: E1 */
    public final zm4<kql> f22613E1 = new zm4() { // from class: l.v240
        @Override // p153l.zm4
        /* JADX INFO: renamed from: d */
        public final Object mo199122d() {
            return this.f182068a.m38209P4();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$a */
    public class a implements k6e {
        public a() {
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            vi0.f184206a = false;
            fph0.m126647R(fph0.f100175h);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            vi0.f184206a = false;
            if (!iz40.m142788y(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22624J.f74502G.m137019l(Boolean.TRUE);
            }
            fph0.m126648S(fph0.f100175h);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            vi0.f184206a = true;
            fph0.m126649T(fph0.f100175h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$b */
    public class b implements j6e {
        public b() {
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            vi0.f184206a = false;
            if (!iz40.m142788y(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22624J.f74502G.m137019l(Boolean.TRUE);
            }
            fph0.m126667f0(fph0.f100175h);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            vi0.f184206a = false;
            fph0.m126669g0(fph0.f100175h, z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            vi0.f184206a = true;
            fph0.m126671h0(fph0.f100175h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$c */
    public class c implements atl {
        public c() {
        }

        @Override // p153l.atl
        /* JADX INFO: renamed from: B */
        public void mo38399B(int i, int i2, int i3, String str, int i4) {
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = ViewTreeObserverOnGlobalLayoutListenerC8017b.this;
            if (i3 == 0) {
                viewTreeObserverOnGlobalLayoutListenerC8017b.f22651W0.mo56945a(true);
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC8017b.f22651W0.mo56945a(i == 0 && i4 == 0);
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b2 = ViewTreeObserverOnGlobalLayoutListenerC8017b.this;
            viewTreeObserverOnGlobalLayoutListenerC8017b2.m38145D5(i, i - viewTreeObserverOnGlobalLayoutListenerC8017b2.f22619G1, i2, i3, str);
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22619G1 = i;
            if (!TextUtils.equals(str, CoreSuggested.UserInfo.VIRTUAL_CARD) && !TextUtils.equals(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22616F1, str) && i > 10) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22616F1 = str;
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
                if (NullChecker.m82486a(userM116503Pa)) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22635O0.m54107h(userM116503Pa);
                }
            }
            if (!NullChecker.m82486a(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22625J0.getImmediatelyMatch()) || ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22625J0.getButtonScrolledDistance() <= 0) {
                return;
            }
            if (i > 5) {
                z5h0.m218680u();
                C4499d.m21895l().m21899k("bubble_odiamond_immediate_match_guide");
            }
            int iM175859d = qa00.m175859d(20.0f);
            if ((i >= 5 || Math.abs(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22625J0.getButtonRootLayout().getTranslationY()) < ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22625J0.getButtonScrolledDistance() - 5) && i <= iM175859d && i > 5) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38382x6();
            }
        }

        @Override // p153l.atl
        /* JADX INFO: renamed from: c0 */
        public void mo38400c0(int i, int i2, int i3, int i4, View view) {
            if (ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22653X0 == null || ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22653X0.f23324a == null) {
                return;
            }
            if (i > 0) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22653X0.f23324a.m54131f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22653X0.f23324a.m54131f(0.0f);
                return;
            }
            int iM175859d = qa00.m175859d(44.0f);
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = ViewTreeObserverOnGlobalLayoutListenerC8017b.this;
            if (i3 > iM175859d) {
                viewTreeObserverOnGlobalLayoutListenerC8017b.f22653X0.f23324a.m54131f(1.0f);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC8017b.f22653X0.f23324a.m54131f(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22715a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f22715a = iArr;
            try {
                iArr[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22715a[VirtualCardType.SuperlikeGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22715a[VirtualCardType.UndoGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22715a[VirtualCardType.OnlineMatchBroadcastPeiLiaoCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22715a[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22715a[VirtualCardType.QuickAudioBroadcastCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22715a[VirtualCardType.AdCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22715a[VirtualCardType.LiveLivingCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22715a[VirtualCardType.LiveVoiceCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22715a[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22715a[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22715a[VirtualCardType.LiveMultipleCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22715a[VirtualCardType.FreeTrialRealUser.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22715a[VirtualCardType.FreeTrialOnline.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f22715a[VirtualCardType.FreeTrialPopular.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22715a[VirtualCardType.LiveActiveCard.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22715a[VirtualCardType.ImpressSignalCard.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22715a[VirtualCardType.FakeCard.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22715a[VirtualCardType.IntlVipCard.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22715a[VirtualCardType.IntlSeeCard.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22715a[VirtualCardType.NativeAdViewCard.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22715a[VirtualCardType.MinBoostCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22715a[VirtualCardType.IntlFreeSpotlightCard.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22715a[VirtualCardType.IntlTextBuzzActiveCard.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f22715a[VirtualCardType.IntlVoiceBuzzActiveCard.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22715a[VirtualCardType.IntlVideoBuzzActiveCard.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22715a[VirtualCardType.IntlPartnerActiveCard.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22715a[VirtualCardType.IntlRecallMembershipCard.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22715a[VirtualCardType.SayHiADCard.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f22715a[VirtualCardType.BoostGuideCard.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f22715a[VirtualCardType.AudioQuickChatPartyInvitationCard.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f22715a[VirtualCardType.TextQuickChatPartyInvitationCard.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f22715a[VirtualCardType.MarryAdCard.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f22715a[VirtualCardType.ExpandedNewUserRightGuide.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f22715a[VirtualCardType.BarLoverGuideCard.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f22715a[VirtualCardType.FourSelectOneAdCard.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f22715a[VirtualCardType.DailySelectionAdCard.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f22715a[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f22715a[VirtualCardType.FemaleVipGuideCard.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f22715a[VirtualCardType.FemaleVerificationGuideCard.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f22715a[VirtualCardType.NewUserSeeMyself.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f22715a[VirtualCardType.QuestionOfNotVerify.ordinal()] = 42;
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
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = ViewTreeObserverOnGlobalLayoutListenerC8017b.this;
            if (viewTreeObserverOnGlobalLayoutListenerC8017b.f22623I0 != null && viewTreeObserverOnGlobalLayoutListenerC8017b.m38171I6() == null) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22623I0.m39807E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$f */
    public class f implements C8438a.d {

        /* JADX INFO: renamed from: a */
        public String f22717a;

        public f() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        /* JADX INFO: renamed from: a */
        public void mo38401a() {
            l51.m152890J(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1);
            this.f22717a = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38348q6(-1);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        public void release() {
            if (TextUtils.isEmpty(this.f22717a)) {
                return;
            }
            l51.m152888H(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$g */
    public class g implements VSwipeStack.InterfaceC4918c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f1g0 f22719a;

        public g(f1g0 f1g0Var) {
            this.f22719a = f1g0Var;
        }

        @Override // com.p051p1.mobile.putong.core.card.VSwipeStack.InterfaceC4918c
        /* JADX INFO: renamed from: b */
        public void mo36200b(boolean z, float f, CardProgressAction cardProgressAction) {
            if (NullChecker.m82486a(this.f22719a.mo39812d())) {
                if (f <= 0.0f) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38137C2().mo39425c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38350r2().mo39425c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38334o2().mo39424a(-f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22654Y = true;
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22656Z = false;
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22679k0 = false;
                    return;
                }
                ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = ViewTreeObserverOnGlobalLayoutListenerC8017b.this;
                if (z) {
                    viewTreeObserverOnGlobalLayoutListenerC8017b.m38137C2().mo39425c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38334o2().mo39425c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38350r2().mo39424a(f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22656Z = true;
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22654Y = false;
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22679k0 = false;
                    return;
                }
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38350r2().mo39425c(cardProgressAction);
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38334o2().mo39425c(cardProgressAction);
                if (!gra.m131740r1() || !NullChecker.m82486a(this.f22719a.mo39816j()) || !this.f22719a.mo39816j().meetAgain) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38137C2().mo39424a(f, cardProgressAction);
                }
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22654Y = false;
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22656Z = false;
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22679k0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$h */
    public class h implements C8438a.d {

        /* JADX INFO: renamed from: a */
        public String f22721a;

        public h() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        /* JADX INFO: renamed from: a */
        public void mo38401a() {
            l51.m152890J(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1);
            this.f22721a = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38348q6(-1);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        public void release() {
            if (TextUtils.isEmpty(this.f22721a)) {
                return;
            }
            l51.m152888H(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$i */
    public class i implements RequestCallback {
        public i() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22646U.mo118295l().stepToFrame(1.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22605B.m37670v();
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38176J6();
            if (NullChecker.m82486a(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22709y1) && ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22709y1.isRunning()) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22709y1.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$k */
    public class k extends k3l {
        public k() {
        }

        @Override // p153l.k3l, java.lang.Runnable
        public void run() {
            bnl0.m105525M0(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22706x, true);
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38176J6();
            bnl0.m105525M0(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22664d, true);
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38199N6(true);
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38194M6(false);
            if (!ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38362t5()) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38215Q5(false);
            }
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22709y1.start();
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22621H0.mo40116b();
            View viewFindViewWithTag = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38388z2().findViewWithTag(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38137C2().getRealView().getTag() + "child");
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38388z2().removeView(viewFindViewWithTag);
            }
            ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38189M1(false);
            if (IntlCountryCodeController.m29125v()) {
                if (NullChecker.m82486a(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38152F2())) {
                    bnl0.m105524M(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38152F2(), false);
                }
                if (NullChecker.m82486a(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38167I2())) {
                    bnl0.m105524M(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38167I2(), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$l */
    public class l implements CardOperationButton.InterfaceC8200b {

        /* JADX INFO: renamed from: a */
        public String f22726a;

        public l() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: a */
        public void mo38402a() {
            l51.m152890J(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1);
            ik4 ik4VarMo39821o = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22612E0.mo39821o();
            if (gra.m131740r1() && NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140260e()) && ik4VarMo39821o.m140260e().meetAgain) {
                return;
            }
            this.f22726a = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.m38348q6(-1);
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: b */
        public void mo38403b() {
            ik4 ik4VarMo39821o = ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22612E0.mo39821o();
            if ((gra.m131740r1() && NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140260e()) && ik4VarMo39821o.m140260e().meetAgain) || TextUtils.isEmpty(this.f22726a)) {
                return;
            }
            l51.m152888H(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22610D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$m */
    public class m implements l6e {
        public m() {
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            vi0.f184206a = false;
            if (!iz40.m142788y(ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22620H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.this.f22624J.f74502G.m137019l(Boolean.TRUE);
            }
            fph0.m126653X(fph0.f100175h);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            vi0.f184206a = false;
            fph0.m126654Y(fph0.f100175h);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            vi0.f184206a = true;
            fph0.m126655Z(fph0.f100175h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$n */
    public static class n implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f22729c = gkc0.m130573a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f22730a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22658a f22731b;

        public n() {
            VLinear.C22658a c22658a = new VLinear.C22658a();
            this.f22731b = c22658a;
            c22658a.m224310c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f22730a <= f22729c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f22730a + 1;
                    this.f22730a = i;
                    if (i > f22729c) {
                        pf60<Boolean, Boolean> pf60VarM224309b = this.f22731b.m224309b();
                        C4910y.f20880Q = pf60VarM224309b.f152156a.booleanValue();
                        C4910y.f20881R = pf60VarM224309b.f152157b.booleanValue();
                    }
                }
                this.f22731b.m224308a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                u7l.m194876c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                u7l.m194876c(false);
            }
            return false;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC8017b(Act act, NewNewHomeFrag newNewHomeFrag, qmj0 qmj0Var) {
        this.f22620H = act;
        this.f22622I = newNewHomeFrag;
        this.f22655Y0 = qmj0Var;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m38030M(f1g0 f1g0Var, View view) {
        f1g0Var.mo39804A(SwipeDirection.UP);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "superlike"));
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m38032N(View view) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Unit m38041R0(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m38046U(Throwable th) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m38056Y2() {
        m38305i2().setBackgroundResource(dbc0.f87333q);
        if (m38362t5()) {
            m38215Q5(true);
        }
        final BoostViewContainer boostViewContainerM38300h2 = m38300h2();
        boostViewContainerM38300h2.m44877b(new y20() { // from class: l.r440
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161141a.m38257Y3((View) obj);
            }
        }, new vcj() { // from class: l.s440
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f166154a.m38262Z3(boostViewContainerM38300h2, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM38300h2.setSceneView(this.f22694r);
        boostViewContainerM38300h2.setInterceptFunc(new pcj() { // from class: l.t440
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f171976a.m38234T6());
            }
        });
        boostViewContainerM38300h2.m44876a(new na3() { // from class: l.u440
            @Override // p153l.na3
            /* JADX INFO: renamed from: a */
            public final void mo115522a(int i2) {
                this.f177431a.m38272b4(boostViewContainerM38300h2, i2);
            }
        });
        m38305i2().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.v440
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f182331a.m38277c4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m38064c() {
        C4499d.m21895l().m21899k("bubble_superlike_bubble");
        z5h0.m218680u();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Picture m38069e(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m38074f1(f1g0 f1g0Var, View view) {
        f1g0Var.mo39804A(SwipeDirection.UP);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "superlike"));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ User m38081j(User user, User user2, Picture picture) {
        ArrayList arrayList = new ArrayList();
        picture.labels = arrayList;
        arrayList.add(ix60.INSTANCE.m142475h());
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            user2.pictures.add(it.next());
        }
        user2.pictures.add(1, picture);
        return user2;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m38087l(f1g0 f1g0Var, View view) {
        f1g0Var.mo39804A(SwipeDirection.RIGHT);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "like"));
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m38089l1(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m38093n(View view) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m38109t0(f1g0 f1g0Var, View view) {
        f1g0Var.mo39804A(SwipeDirection.RIGHT);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "like"));
        }
    }

    /* JADX INFO: renamed from: A2 */
    public f1g0 m38128A2() {
        return this.f22612E0;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ Boolean m38129A4(Boolean bool) {
        return Boolean.valueOf((bool.booleanValue() || this.f22631M0) ? false : true);
    }

    /* JADX INFO: renamed from: A5 */
    public void m38130A5() {
        this.f22624J.m102024i5();
        m38377w5();
        act().m40810d6().m41019n0();
        m38200O1();
    }

    /* JADX INFO: renamed from: A6 */
    public void m38131A6(boolean z) {
        bnl0.m105524M(this.f22646U.getPosition(), z);
        if (ric0.m181583m()) {
            if (z && C21545y9.INSTANCE.m214797k()) {
                bnl0.m105524M(this.f22646U.getPosition(), false);
            }
            ric0.m181581i().m181591p(z);
        }
        this.f22624J.f74549p.m137019l(Boolean.valueOf(z));
    }

    @Nullable
    /* JADX INFO: renamed from: B2 */
    public final View m38132B2() {
        if (!IntlCountryCodeController.m29125v()) {
            return this.f22625J0.getSuperLike().getRealView();
        }
        if (NullChecker.m82486a(this.f22627K0)) {
            return this.f22627K0.f23621B;
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m38133B3() {
        return NullChecker.m82486a(this.f22625J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m38134B4(pf60 pf60Var) {
        return Boolean.valueOf(!this.f22631M0);
    }

    /* JADX INFO: renamed from: B5 */
    public void m38135B5() {
        if (this.f22642S.m222761e().booleanValue()) {
            this.f22709y1.start();
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m38136B6(long j2) {
        if (m38157G2() != null && CoreModule.f18264c.m32487o3().undoLimit.remainToday() > 0) {
            String string = act().getString(R$string.f19812xp, String.valueOf(CoreModule.f18264c.m32487o3().undoLimit.remainToday()));
            C4496a c4496a = new C4496a(act());
            C4499d.m21895l().m21899k("bubble_undo_remaining");
            c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(string).m21869k(Color.parseColor("#ffbb00")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21881x(qa00.m175859d(-4.0f)).m21860b(j2).m21874q(C4496a.f16402Q);
            C4499d.m21895l().m21908u(c4496a, m38157G2().getRealView(), "bubble_undo_remaining");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f22620H;
    }

    /* JADX INFO: renamed from: C2 */
    public avl m38137C2() {
        return this.f22625J0.getSuperLike();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m38138C3() {
        return this.f22690p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m38139C4(pf60 pf60Var) {
        if (!((Boolean) pf60Var.f152156a).booleanValue() || ((Boolean) pf60Var.f152157b).booleanValue() || !NullChecker.m82486a(this.f22709y1) || this.f22709y1.isRunning()) {
            return;
        }
        this.f22631M0 = true;
        m38365u3();
        m38335o3();
        m38345q3(0);
        m38345q3(1);
        m38345q3(2);
        m38345q3(3);
        m38345q3(4);
        m38345q3(5);
    }

    /* JADX INFO: renamed from: C5 */
    public void m38140C5() {
        pci.m171689y(true);
        this.f22709y1.cancel();
        if (d79.m114675e0()) {
            haw.INSTANCE.m134320a().m134310r1();
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m38141C6() {
        act().dialog().m21529Z(17).m21532c0(dbc0.f86710Wt).m21502E0(R$string.f18410E0).m21499D(R$string.f18565J0).m21558v().m21550r(Color.parseColor("#00000000")).m21495B(false).m21563x0(act().getResources().getDrawable(dbc0.f87227mp)).m21559v0(act().getString(R$string.f18441F0), new Runnable() { // from class: l.e640
            @Override // java.lang.Runnable
            public final void run() {
                this.f92258a.m38353r5();
            }
        }).m21566z().show();
    }

    /* JADX INFO: renamed from: D2 */
    public View m38142D2() {
        return this.f22625J0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m38143D3() {
        return C8016a.INSTANCE.m37993c() && ix60.INSTANCE.m142485p(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m38144D4(Boolean bool) {
        return Boolean.valueOf(this.f22631M0 && m38148E3());
    }

    /* JADX INFO: renamed from: D5 */
    public void m38145D5(int i2, int i3, int i4, int i5, String str) {
    }

    /* JADX INFO: renamed from: D6 */
    public void m38146D6(Intent intent) {
        this.f22622I.startActivity(intent);
    }

    /* JADX INFO: renamed from: E2 */
    public VFrame_FlipContainer m38147E2() {
        return this.f22625J0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: E3 */
    public final boolean m38148E3() {
        return C8016a.INSTANCE.m37998h() && udo.INSTANCE.m195510j(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m38149E4(Boolean bool) {
        if (bool.booleanValue()) {
            bnl0.m105524M(this.f22646U.mo118295l(), false);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: E5 */
    public void m38150E5() {
        m38319l2().setVisibility(8);
        if (NullChecker.m82486a(this.f22633N0)) {
            bnl0.m105524M(this.f22633N0, false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E6 */
    public void m38151E6(String str, int i2) {
        if (m38128A2() == null || m38128A2().mo39812d() == null || m38128A2().mo39821o() == null || m38128A2().mo39821o().m140259d() == null) {
            return;
        }
        as20 as20Var = new as20(this.f22613E1);
        User userM140259d = m38128A2().mo39821o().m140259d();
        sdp.m185492i(userM140259d.f56859id);
        Intent intentM51905A2 = ProfileAct.m51905A2(act(), userM140259d.f56859id, str, true, false, false);
        if (TextUtils.equals(userM140259d.f56859id, CoreModule.f18264c.f20384f0.f20610J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM51905A2.putExtra("profile_create_data", profileCreateData);
        }
        if (m38168I3()) {
            intentM51905A2.putExtra("long_time_no_see", true);
        }
        if ("from_city_center_conv_banner".equals(str) && NullChecker.m82486a(m38128A2().mo39816j())) {
            intentM51905A2.putExtra("city_centre_data", m38128A2().mo39816j().cityCData);
        }
        if (m38128A2().mo39810b() || gra.m131606N3()) {
            this.f22622I.startActivityForResult(intentM51905A2, 18);
        } else {
            this.f22622I.m21601v4(intentM51905A2, 18, as20Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: F2 */
    public LinearLayout m38152F2() {
        HomeViewUSLayout homeViewUSLayout = this.f22627K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f23651z;
        }
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m38153F3() {
        return NullChecker.m82486a(this.f22625J0) && NullChecker.m82486a(this.f22625J0.getButtonsRightLayout()) && !bnl0.m105529O0(this.f22625J0.getButtonsRightLayout());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m38154F4(f1g0 f1g0Var, View view) {
        String str = (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0";
        sfj0.m185596c("e_suggest_like_button", this.f22622I.pageId(), sfj0.C20032a.m185615h("other_user_id", str), sfj0.C20032a.m185615h("from_top_tab", ""));
        sfj0.m185596c(MatchScData.ModuleId.mid_e_likeButton, this.f22622I.pageId(), sfj0.C20032a.m185615h("moments_user_id", str), sfj0.C20032a.m185615h("from_top_tab", ""));
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "like"));
        }
        m38223S1(f1g0Var, "like");
        if (m38234T6()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.RIGHT, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: F5 */
    public void m38155F5() {
        m38319l2().setVisibility(0);
        if (NullChecker.m82486a(this.f22625J0.getButtonsRightLayout()) && !bnl0.m105529O0(this.f22625J0.getButtonsRightLayout())) {
            bnl0.m105524M(this.f22625J0.getButtonsRightLayout(), true);
        }
        if (NullChecker.m82486a(this.f22633N0)) {
            bnl0.m105524M(this.f22633N0, true);
        }
        m38222R6();
        m38389z3();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: F6 */
    public void m38156F6(String str, User user) {
        if (m38128A2() == null || m38128A2().mo39812d() == null || m38128A2().mo39821o() == null || m38128A2().mo39821o().m140259d() == null || user == null) {
            return;
        }
        Intent intentM51905A2 = ProfileAct.m51905A2(act(), user.f56859id, str, true, false, false);
        if (TextUtils.equals(user.f56859id, CoreModule.f18264c.f20384f0.f20610J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM51905A2.putExtra("profile_create_data", profileCreateData);
        }
        this.f22622I.startActivity(intentM51905A2);
    }

    /* JADX INFO: renamed from: G2 */
    public avl m38157G2() {
        return this.f22625J0.getUndo();
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m38158G3() {
        bvl bvlVar;
        return spl0.m187355G() && (bvlVar = this.f22625J0) != null && (bvlVar instanceof emf);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m38159G4(f1g0 f1g0Var, View view) {
        String str = (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0";
        sfj0.m185596c("e_suggest_dislike_button", this.f22622I.pageId(), sfj0.C20032a.m185615h("other_user_id", str), sfj0.C20032a.m185615h("from_top_tab", ""));
        sfj0.m185596c("e_dislikeButton", this.f22622I.pageId(), sfj0.C20032a.m185615h("moments_user_id", str), sfj0.C20032a.m185615h("from_top_tab", ""));
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "dislike"));
        }
        m38223S1(f1g0Var, "dislike");
        if (m38234T6()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: G5 */
    public void m38160G5(boolean z) {
        this.f22625J0.setSuperLikeComboIsSlowly(z);
        bnl0.m105525M0(this.f22625J0.getSuperLikeComboSvga(), true);
    }

    /* JADX INFO: renamed from: G6 */
    public void m38161G6() {
        KeyEvent.Callback callbackMo39812d = m38128A2().mo39812d();
        if (NullChecker.m82486a(callbackMo39812d)) {
            if ((!(callbackMo39812d instanceof t7m) || ((t7m) callbackMo39812d).mo37905k0()) && !(callbackMo39812d instanceof u7m)) {
                return;
            }
            ((ViewGroup) this.f22620H.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            bnl0.m105525M0(this.f22651W0.getRenderView(), false);
            this.f22625J0.getSuperLikeComboSvga().stopAnimation(true);
            bnl0.m105525M0(this.f22625J0.getSuperLikeComboSvga(), false);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public View m38162H2() {
        return this.f22625J0.getUndoLayout();
    }

    /* JADX INFO: renamed from: H3 */
    public final boolean m38163H3() {
        if (!C8016a.INSTANCE.m37996f()) {
            return false;
        }
        ix60 ix60Var = ix60.INSTANCE;
        return ix60Var.m142480k() > 0 && ix60Var.m142485p(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: H5 */
    public void m38165H5() {
        if (this.f22623I0 == null) {
            return;
        }
        l51.m152890J(this.f22628L);
        l51.m152888H(act(), this.f22628L, 150L);
    }

    /* JADX INFO: renamed from: H6 */
    public final void m38166H6(boolean z) {
        if (gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3()) {
            o1j0.m165651y("只看认证用户试用期间无法使用超级喜欢功能");
            return;
        }
        if ((f760.INSTANCE.m124371r() || qap.INSTANCE.m175986x()) && NullChecker.m82486a(m38128A2().mo39816j()) && m38128A2().mo39816j().isUserLikeMe()) {
            m38128A2().mo39804A(SwipeDirection.RIGHT);
            return;
        }
        sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, this.f22622I.pageId(), sfj0.C20032a.m185615h("moments_user_id", (!NullChecker.m82486a(m38128A2().mo39816j()) || m38128A2().mo39816j().isVirtualCard()) ? "0" : m38128A2().mo39816j().f20214id), sfj0.C20032a.m185616i("is_privileged", !rbb0.m180747t()), sfj0.C20032a.m185615h("showfrom_superlike", "home"), sfj0.C20032a.m185615h("from_top_tab", ""));
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "superlike"));
        }
        if (m38128A2() != null) {
            m38223S1(m38128A2(), "superlike");
        }
        if (m38234T6()) {
            return;
        }
        this.f22624J.m102032j9(true, z);
    }

    @Nullable
    /* JADX INFO: renamed from: I2 */
    public ConstraintLayout m38167I2() {
        HomeViewUSLayout homeViewUSLayout = this.f22627K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f23626a;
        }
        return null;
    }

    /* JADX INFO: renamed from: I3 */
    public final boolean m38168I3() {
        return gra.m131740r1() && NullChecker.m82486a(this.f22612E0) && NullChecker.m82486a(this.f22612E0.mo39821o()) && NullChecker.m82486a(this.f22612E0.mo39821o().m140260e()) && this.f22612E0.mo39821o().m140260e().meetAgain;
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m38169I4(Object obj) {
        this.f22657Z0.call(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public void m38170I5() {
        this.f22630M = null;
        this.f22642S.m137019l(Boolean.FALSE);
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final String m38171I6() {
        NewNewHomeFrag newNewHomeFrag = this.f22622I;
        if (newNewHomeFrag == null) {
            return "homeFrag=null";
        }
        if (this.f22690p0) {
            return "vm.isHidden=true";
        }
        if (newNewHomeFrag.isHidden()) {
            return "homeFrag.isHidden()=true (eg other home sub-tab or not shown)";
        }
        if (ji30.m144964h() != TabName.Card) {
            return "bottomTab=" + ji30.m144964h() + " (need Card)";
        }
        if (!(this.f22622I.getParentFragment() instanceof cvl)) {
            return "parent not IHomeLayoutFrag";
        }
        NewTanFragTag newTanFragTagMo39558T = ((cvl) this.f22622I.getParentFragment()).mo39558T();
        if (newTanFragTagMo39558T == NewTanFragTag.HOME) {
            return null;
        }
        return "subTab=" + newTanFragTagMo39558T + " (need HOME)";
    }

    /* JADX INFO: renamed from: J1 */
    public View m38172J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g640.m129089b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m38173J3() {
        return this.f22640R;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m38174J4() {
        this.f22624J.m101887C8();
    }

    /* JADX INFO: renamed from: J5 */
    public void m38175J5() {
        VIcon vIconMo118287d = this.f22646U.mo118287d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM31245j3 = CoreModule.f18264c.f20446z2.m31245j3();
        bnl0.m105524M(vIconMo118287d, true);
        if (justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM31245j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo118287d.setImageResource(dbc0.f86921dd);
        } else {
            vIconMo118287d.setImageResource(dbc0.f86888cd);
        }
        bnl0.m105509E0(vIconMo118287d, new View.OnClickListener() { // from class: l.x440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192336a.m38226S4(view);
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public void m38176J6() {
        if (this.f22623I0 == null) {
            return;
        }
        this.f22623I0.m39808G((NullChecker.m82486a(this.f22706x) && this.f22706x.getVisibility() == 0) || (NullChecker.m82486a(this.f22605B) && this.f22605B.getVisibility() == 0) || (NullChecker.m82486a(this.f22607C) && this.f22607C.getVisibility() == 0));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public NewMainAct getAct() {
        return (NewMainAct) this.f22620H;
    }

    /* JADX INFO: renamed from: K2 */
    public final User m38178K2(NewNewHomeFrag newNewHomeFrag) {
        return (!m38235U1(newNewHomeFrag) && NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) ? m38128A2().mo39821o().m140259d() : m38328n2(newNewHomeFrag);
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m38179K3() {
        return this.f22642S.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m38180K4(f1g0 f1g0Var, View view) {
        if (gra.m131589K1() && CoreModule.f18264c.f20446z2.m31253r3()) {
            o1j0.m165651y("只看认证用户试用期间无法使用反悔功能");
            return;
        }
        sfj0.m185596c("e_undo_button", this.f22622I.pageId(), sfj0.C20032a.m185615h("moments_user_id", CoreModule.f18264c.f20405m0.m32145r8() == null ? "NA" : CoreModule.f18264c.f20405m0.m32145r8().f56859id), sfj0.C20032a.m185615h("from_top_tab", ""));
        m38223S1(f1g0Var, "undo");
        m38210P5();
        if (m38234T6()) {
            return;
        }
        if (!h7d0.m133774m0() || !CoreModule.m30930K().me_().isNewUserIn24H() || !h7d0.m133773i0().m133777f0()) {
            this.f22624J.m102027i9(false);
        } else {
            h7d0.m133773i0().m133781k0();
            h7d0.m133773i0().m133786r0(false);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m38181K5(boolean z) {
        if (z) {
            act().removeCallbacks(this.f22711z1);
            this.f22605B.setVisibility(8);
            this.f22605B.m37661m();
        } else {
            act().removeCallbacks(this.f22711z1);
            if (this.f22624J.m102039l6()) {
                this.f22624J.m102086w8();
            } else {
                act().postDelayed(this.f22711z1, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m38182K6(View view) {
        y20 y20Var = this.f22657Z0;
        if (y20Var != null) {
            y20Var.call(view);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m38183L1(boolean z) {
        if (z) {
            m38300h2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m38314k2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m38300h2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m38314k2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: renamed from: L2 */
    public sxl0 m38184L2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        switch (d.f22715a[virtualCardType.ordinal()]) {
            case 1:
                if (this.f22663c1 == null) {
                    this.f22663c1 = new jje0(this.f22622I);
                }
                return this.f22663c1;
            case 2:
            case 3:
                if (this.f22669f1 == null) {
                    this.f22669f1 = new d6h0(this.f22622I);
                }
                return this.f22669f1;
            case 4:
                if (this.f22667e1 == null) {
                    this.f22667e1 = new tq50(this.f22622I);
                }
                return this.f22667e1;
            case 5:
                if (this.f22665d1 == null) {
                    this.f22665d1 = new pq50(this.f22622I);
                }
                return this.f22665d1;
            case 6:
                if (this.f22691p1 == null) {
                    this.f22691p1 = new wvb0(this.f22622I);
                }
                return this.f22691p1;
            case 7:
                if (fb0.m124808g(userInfo)) {
                    return new r1i0(this.f22622I);
                }
                if (fb0.m124807f(userInfo)) {
                    return new y0i0(this.f22622I);
                }
                boolean zM124805d = fb0.m124805d(userInfo);
                NewNewHomeFrag newNewHomeFrag = this.f22622I;
                return zM124805d ? new fqr(newNewHomeFrag) : new cb0(newNewHomeFrag);
            case 8:
                return new m2t();
            case 9:
                return new b5v(this.f22622I, this.f22612E0);
            case 10:
                return new d5v(this.f22622I);
            case 11:
                return new f5v(this.f22622I);
            case 12:
                return new xu10();
            case 13:
            case 14:
            case 15:
                if (this.f22671g1 == null) {
                    this.f22671g1 = new u8j(this.f22622I);
                }
                return this.f22671g1;
            case 16:
                if (this.f22673h1 == null) {
                    this.f22673h1 = new zqr(this.f22622I, userInfo.active);
                }
                return this.f22673h1;
            case 17:
                if (this.f22675i1 == null) {
                    this.f22675i1 = new snm(this.f22622I);
                }
                return this.f22675i1;
            case 18:
                if (this.f22677j1 == null) {
                    this.f22677j1 = new hyf(this.f22622I);
                }
                return this.f22677j1;
            case 19:
                if (this.f22680k1 == null) {
                    this.f22680k1 = new gol0(this.f22622I, userInfo.active);
                }
                return this.f22680k1;
            case 20:
                if (this.f22682l1 == null) {
                    this.f22682l1 = new gfe0(this.f22622I, userInfo.active);
                }
                return this.f22682l1;
            case 21:
                if (!NullChecker.m82486a(this.f22684m1)) {
                    this.f22684m1 = new C4866a(this.f22622I);
                }
                return this.f22684m1;
            case 22:
                if (this.f22686n1 == null) {
                    this.f22686n1 = new ob00(this.f22622I, userInfo.active);
                }
                return this.f22686n1;
            case 23:
                if (this.f22688o1 == null) {
                    this.f22688o1 = new pyf0(this.f22622I, userInfo.active);
                }
                return this.f22688o1;
            case 24:
            case 25:
            case 26:
                return new dn3(this.f22622I, userInfo.active);
            case 27:
                return new wro(this.f22622I, userInfo.intlInsertCardData);
            case 28:
                return new map(this.f22622I, userInfo.intlInsertCardData);
            case 29:
                if (this.f22693q1 == null) {
                    this.f22693q1 = new ibl(this.f22622I);
                }
                return this.f22693q1;
            case 30:
                if (this.f22695r1 == null) {
                    this.f22695r1 = new l83(this.f22622I);
                }
                return this.f22695r1;
            case 31:
            case 32:
                return new b5c0(this.f22622I);
            case 33:
                return new fyw();
            case 34:
                return new nq40();
            case 35:
                return new vd2(new Runnable() { // from class: l.o440
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144925a.m38243V3();
                    }
                });
            case 36:
                return new f4j();
            case 37:
                return new j2c();
            case 38:
                if (this.f22697s1 == null) {
                    this.f22697s1 = new gbm();
                }
                return this.f22697s1;
            case 39:
                if (this.f22699t1 == null) {
                    this.f22699t1 = new uei(this.f22622I);
                }
                return this.f22699t1;
            case 40:
                if (this.f22701u1 == null) {
                    this.f22701u1 = new pei(this.f22622I);
                }
                return this.f22701u1;
            case 41:
                if (this.f22703v1 == null) {
                    this.f22703v1 = new yhe0(this.f22622I);
                }
                return this.f22703v1;
            case 42:
                if (this.f22705w1 == null) {
                    this.f22705w1 = new uwb0(this.f22622I);
                }
                return this.f22705w1;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final boolean m38185L3() {
        return C8016a.INSTANCE.m37997g() && ix60.INSTANCE.m142485p(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m38186L4(f1g0 f1g0Var, View view) {
        m38182K6(f1g0Var.mo39812d());
    }

    /* JADX INFO: renamed from: L5 */
    public void m38187L5(boolean z, boolean z2) {
        m38193M5(z, z2, false);
    }

    /* JADX INFO: renamed from: L6 */
    public final void m38188L6(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM174454o = this.f22615F0 > 0 ? pzi0.m174454o() - this.f22615F0 : -1L;
        this.f22615F0 = pzi0.m174454o();
        sfj0.m185596c("e_card_click_interval", "p_suggest_users_home_view", sfj0.C20032a.m185615h("current_operation", str2), sfj0.C20032a.m185614g("operation_interval", jM174454o), sfj0.C20032a.m185615h("last_operation", this.f22618G0));
        this.f22618G0 = str2;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m38189M1(boolean z) {
        View realView = m38350r2().getRealView();
        View realView2 = m38334o2().getRealView();
        View viewM38142D2 = m38142D2();
        View viewM38374w2 = m38374w2();
        BoostViewContainer boostViewContainerM38300h2 = m38300h2();
        View viewM38314k2 = m38314k2();
        View immediatelyMatch = this.f22625J0.getImmediatelyMatch();
        if (z) {
            realView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM38142D2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM38374w2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            realView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (s7a.m184983l() && !m38362t5()) {
                this.f22646U.mo118289f().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            z5h0.m218675j().f203044b.m137019l(uxj0.f181467a);
            boostViewContainerM38300h2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM38314k2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (d79.m114648G() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            bvl bvlVar = this.f22625J0;
            if (bvlVar instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons = (HomeCardBottomOptButtons) bvlVar;
                homeCardBottomOptButtons.f23457o.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
                homeCardBottomOptButtons.f23456n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
        } else {
            realView.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM38142D2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM38374w2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            realView2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            if (s7a.m184983l() && !m38362t5()) {
                this.f22646U.mo118289f().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            if (d79.m114648G() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            bvl bvlVar2 = this.f22625J0;
            if (bvlVar2 instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons2 = (HomeCardBottomOptButtons) bvlVar2;
                homeCardBottomOptButtons2.f23457o.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
                homeCardBottomOptButtons2.f23456n.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
        }
        if (m38362t5()) {
            return;
        }
        m38183L1(z);
    }

    /* JADX INFO: renamed from: M2 */
    public void m38190M2() {
        String str;
        if (gra.m131755u1() && CoreModule.f18264c.f20381e0.f89321r6.get().booleanValue()) {
            str = sx20.f171069n;
            CoreModule.f18264c.f20381e0.f89314q6.put(Long.valueOf(pzi0.m174454o()));
        } else {
            str = null;
        }
        CoreModule.f18264c.f20381e0.f89321r6.put(Boolean.FALSE);
        m38195N2(str);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m38191M3() {
        bnl0.m105524M(this.f22653X0, true);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m38192M4(f1g0 f1g0Var, View view) {
        m38182K6(f1g0Var.mo39812d());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x0120  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX INFO: renamed from: M5 */
    public void m38193M5(boolean z, boolean z2, boolean z3) {
        if (z) {
            b240.f74488V0 = "";
        }
        m38181K5(z2);
        if (this.f22642S.m222761e().booleanValue() && !z) {
            l51.m152890J(this.f22604A1);
            cf7 cf7Var = CoreModule.f18264c.f20404l2;
            if (cf7Var.f81480R == 0) {
                cf7Var.f81480R = pzi0.m174454o();
            }
            bnl0.m105525M0(this.f22664d, true);
            m38194M6(true);
            m38215Q5(true);
            this.f22709y1.cancel();
            if (NullChecker.m82486a(this.f22706x)) {
                bnl0.m105525M0(this.f22706x, false);
                m38199N6(false);
            }
            m38189M1(true);
            if (IntlCountryCodeController.m29125v()) {
                if (!jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded) && C4881b.m32411b(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0).virtualCardType)) {
                    if (NullChecker.m82486a(m38152F2())) {
                        bnl0.m105524M(m38152F2(), false);
                    }
                    if (NullChecker.m82486a(m38167I2())) {
                        bnl0.m105524M(m38167I2(), false);
                    }
                } else if (jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded)) {
                    if (NullChecker.m82486a(m38152F2())) {
                        bnl0.m105524M(m38152F2(), true);
                    }
                    if (NullChecker.m82486a(m38167I2())) {
                        bnl0.m105524M(m38167I2(), true);
                    }
                } else {
                    CoreMemberProviderInterface coreMemberProviderInterfaceM132212b = gta.m132210e().m132212b();
                    CoreSuggested.UserInfo userInfo = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0);
                    C4883c c4883c = CoreModule.f18264c;
                    if (coreMemberProviderInterfaceM132212b.mo34651h9(userInfo, c4883c.f20381e0.m116503Pa(c4883c.f20405m0.m32140q6()))) {
                        if (NullChecker.m82486a(m38152F2())) {
                            bnl0.m105524M(m38152F2(), true);
                        }
                        if (NullChecker.m82486a(m38167I2())) {
                            bnl0.m105524M(m38167I2(), false);
                        }
                    } else {
                        if (NullChecker.m82486a(m38152F2())) {
                            bnl0.m105524M(m38152F2(), true);
                        }
                        if (NullChecker.m82486a(m38167I2())) {
                            bnl0.m105524M(m38167I2(), true);
                        }
                    }
                }
            }
        } else if (!this.f22642S.m222761e().booleanValue() && z) {
            this.f22604A1.m148116a(z2, false, false);
            if (z3) {
                l51.m152888H(act(), this.f22604A1, vo0.f184959f);
            } else {
                this.f22604A1.run();
            }
        }
        if (gra.m131606N3()) {
            m38269a6(!z);
            if (gra.m131654Z2() && !m38362t5()) {
                m38215Q5(!z);
            }
        }
        if (CoreModule.m30933P().m143405a().mo34546m7() && !m38362t5()) {
            bnl0.m105525M0(this.f22646U.mo118289f(), !z);
        }
        if (gra.m131667c3()) {
            bnl0.m105525M0(this.f22646U.mo118287d(), !z);
        }
        this.f22642S.m137019l(Boolean.valueOf(z));
        this.f22624J.f74508J = z2;
        m38228S6();
        m38176J6();
    }

    /* JADX INFO: renamed from: M6 */
    public final void m38194M6(boolean z) {
        HomeStatisticsHelper.m37692C(this.f22622I.getUserVisibleHint() && !this.f22622I.isHidden());
        if (z) {
            HomeStatisticsHelper.m37718u();
        } else {
            HomeStatisticsHelper.m37717t();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m38195N2(String str) {
        m38210P5();
        CoreModule.f18264c.f20306F0.m118455r3();
        bnl0.m105524M(this.f22646U.mo118296m(), false);
        jz20.m147636d(act(), str);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m38196N3() {
        bnl0.m105524M(this.f22653X0, false);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m38197N4(View view) {
        m38128A2().mo39804A(SwipeDirection.LEFT);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "dislike"));
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final void m38198N5(DoublePair doublePair, String str, String str2, List<MessageLocation> list) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        RoamedLocationData roamedLocationDataNew_ = RoamedLocationData.new_();
        list.add(0, messageLocation);
        roamedLocationDataNew_.data.addAll(list);
        CoreModule.f18264c.f20399k0.f20830R.m159273A(roamedLocationDataNew_);
        gsl0.m132070C0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: N6 */
    public final void m38199N6(boolean z) {
        HomeStatisticsHelper.m37692C(this.f22622I.getUserVisibleHint() && !this.f22622I.isHidden());
        if (z) {
            HomeStatisticsHelper.m37720w();
        } else {
            HomeStatisticsHelper.m37719v();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m38200O1() {
        if (gra.m131606N3() && this.f22623I0 != null && m38171I6() == null) {
            m38176J6();
            m38165H5();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public void m38311j4() {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m38202O3(String str) {
        if (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) {
            final User userM140259d = m38128A2().mo39821o().m140259d();
            C8618a.m48771w().m48793p(this.f22620H, userM140259d, str, new x20() { // from class: l.q540
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20405m0.m31997E8(userM140259d.f56859id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m38203O4(View view) {
        m38216Q6();
    }

    /* JADX INFO: renamed from: O5 */
    public void m38204O5() {
        final f1g0 f1g0VarM38128A2 = m38128A2();
        bnl0.m105509E0(this.f22627K0.f23622C, new View.OnClickListener() { // from class: l.i540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.m38109t0(f1g0VarM38128A2, view);
            }
        });
        bnl0.m105509E0(this.f22627K0.f23621B, new View.OnClickListener() { // from class: l.k540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.m38030M(f1g0VarM38128A2, view);
            }
        });
        bnl0.m105509E0(this.f22627K0.f23623D, new View.OnClickListener() { // from class: l.l540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130066a.m38232T4(view);
            }
        });
        bnl0.m105509E0(this.f22627K0.f23624E, new View.OnClickListener() { // from class: l.m540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134863a.m38238U4(view);
            }
        });
        this.f22627K0.f23621B.setLongPressingListener(new h());
        bnl0.m105509E0(this.f22627K0.f23620A, new View.OnClickListener() { // from class: l.n540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140283a.m38249W4(view);
            }
        });
        m38276c3();
    }

    /* JADX INFO: renamed from: O6 */
    public final void m38205O6() {
        if (CoreModule.f18276o.m132212b().mo34652wf() && NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39812d()) && (m38128A2().mo39812d() instanceof t7m)) {
            t7m t7mVar = (t7m) m38128A2().mo39812d();
            if (t7mVar.mo37879c()) {
                t7mVar.getIntlCommercialCardBottomActionLayout().m40183T();
            }
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b240 b240Var) {
        this.f22624J = b240Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: P2 */
    public void m38207P2() {
        C4499d.m21895l().m21899k("bubble_superlike_bubble");
        z5h0.m218680u();
        if (m38236U2(" by hiddenBottomButtons s1 ")) {
            return;
        }
        m38150E5();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m38208P3(User user) {
        int showPictureIndexProxy = (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39812d()) && (m38128A2().mo39812d() instanceof xql)) ? ((xql) m38128A2().mo39812d()).getShowPictureIndexProxy() : 0;
        if (np5.m164215b(this.f22620H, NullChecker.m82486a(m38128A2()) ? m38128A2().mo39816j() : null, user, "home_card_compliment_btn")) {
            return;
        }
        fp5.m126531m(this.f22620H, user, "home_card_compliment_btn", Integer.valueOf(showPictureIndexProxy), null, fp5.m126527i());
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ kql m38209P4() {
        if (!NullChecker.m82486a(m38128A2())) {
            return null;
        }
        KeyEvent.Callback callbackMo39812d = m38128A2().mo39812d();
        if (callbackMo39812d instanceof kql) {
            return (kql) callbackMo39812d;
        }
        return null;
    }

    /* JADX INFO: renamed from: P5 */
    public void m38210P5() {
        if (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39812d()) && (m38128A2().mo39812d() instanceof t7m)) {
            ((t7m) m38128A2().mo39812d()).mo37920p(true, false);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m38211P6(boolean z) {
        bnl0.m105524M(this.f22696s, false);
        boolean z2 = this.f22652X;
        if (z) {
            if (z2) {
                this.f22652X = false;
                this.f22650W.start();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f22652X = true;
        this.f22648V.start();
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m38212Q1() {
        sfj0.m185601h("e_boost_button", this.f22622I.pageId(), sfj0.C20032a.m185616i("is_privileged", !a5i0.m96174v()));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m38213Q2() {
        if (NullChecker.m82486a(this.f22651W0) && bnl0.m105529O0(this.f22651W0.getRenderView())) {
            bnl0.m105524M(this.f22651W0.getRenderView(), false);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m38214Q4(uxj0 uxj0Var) {
        ix60 ix60Var = ix60.INSTANCE;
        ix60Var.m142478i0();
        this.f22620H.progressDismiss();
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(this.f22620H, p9r.m171370a(this.f22620H).inflate(kec0.f126013q5, (ViewGroup) null)).m22170u("" + System.currentTimeMillis()).m22163B(3).m22168s();
        simplePushBubbleM22168s.m126745x(CorePopLevel.INTL_PET);
        llb0.m154703c().m154710i(simplePushBubbleM22168s);
        ix60Var.m142493x().put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q5 */
    public void m38215Q5(boolean z) {
        if (!z || (!pgj.m172246c() && rbb0.m180742o())) {
            bnl0.m105524M(m38300h2(), true);
            return;
        }
        if (!bnl0.m105529O0(m38300h2())) {
            m38212Q1();
        }
        bnl0.m105524M(m38300h2(), true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m38216Q6() {
        if (m38234T6()) {
            return;
        }
        if (!h7d0.m133774m0() || !CoreModule.m30930K().me_().isNewUserIn24H() || !h7d0.m133773i0().m133777f0()) {
            this.f22624J.m102027i9(false);
        } else {
            h7d0.m133773i0().m133781k0();
            h7d0.m133773i0().m133786r0(false);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m38217R1() {
        l51.m152890J(this.f22628L);
    }

    /* JADX INFO: renamed from: R2 */
    public void m38218R2() {
        if (IntlCountryCodeController.m29125v() && NullChecker.m82487b(this.f22627K0)) {
            bnl0.m105525M0(this.f22627K0.f23651z, false);
            bnl0.m105525M0(this.f22627K0.f23626a, false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m38219R3() {
        bnl0.m105524M(this.f22696s, false);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m38220R4(Throwable th) {
        this.f22620H.progressDismiss();
    }

    /* JADX INFO: renamed from: R5 */
    public void m38221R5(boolean z) {
        act().m40819h7(z);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m38222R6() {
        try {
            if ((this.f22625J0 instanceof HomeCardBottomOptButtons) && NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) {
                ((HomeCardBottomOptButtons) this.f22625J0).m39384v(m38128A2().mo39821o().m140259d(), NullChecker.m82486a(this.f22622I) ? this.f22622I.pageId() : "p_suggest_users_home_view");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final void m38223S1(f1g0 f1g0Var, String str) {
        m38188L6(str);
        f1g0Var.m179540h(str);
    }

    /* JADX INFO: renamed from: S2 */
    public void m38224S2() {
        if (IntlCountryCodeController.m29125v() && NullChecker.m82487b(this.f22627K0)) {
            bnl0.m105525M0(this.f22627K0.f23626a, false);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m38225S3(View view) {
        m38166H6(false);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m38226S4(View view) {
        quq.m178181Q(this.f22620H, true);
    }

    /* JADX INFO: renamed from: S5 */
    public final void m38227S5(int i2) {
        final String strM142469e;
        final boolean zBooleanValue = false;
        if (i2 == 0) {
            strM142469e = "core_intl_constellation_entrance_anim.svga";
        } else if (i2 == 1) {
            ix60 ix60Var = ix60.INSTANCE;
            zBooleanValue = ix60Var.m142493x().get().booleanValue();
            strM142469e = ix60Var.m142469e();
        } else if (i2 == 2) {
            xnf0 xnf0Var = xnf0.INSTANCE;
            zBooleanValue = xnf0Var.m212195m().get().booleanValue();
            strM142469e = xnf0Var.m212188f();
        } else if (i2 == 3) {
            C8545b c8545b = C8545b.INSTANCE;
            zBooleanValue = c8545b.m47469h().get().booleanValue();
            strM142469e = c8545b.m47467f();
        } else if (i2 == 4) {
            udo udoVar = udo.INSTANCE;
            zBooleanValue = udoVar.m195512l();
            strM142469e = udoVar.m195507g();
        } else if (i2 != 5) {
            strM142469e = "";
        } else {
            sp0 sp0Var = sp0.INSTANCE;
            zBooleanValue = sp0Var.m187299m();
            strM142469e = sp0Var.m187294h();
        }
        if (TextUtils.isEmpty(strM142469e) || !NullChecker.m82486a(this.f22620H)) {
            return;
        }
        l51.m152886F(this.f22620H, new Runnable() { // from class: l.o540
            @Override // java.lang.Runnable
            public final void run() {
                this.f145032a.m38254X4(zBooleanValue, strM142469e);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public final void m38228S6() {
        if (this.f22642S.m222761e().booleanValue()) {
            m38350r2().getRealView().setOnTouchListener(null);
            m38334o2().getRealView().setOnTouchListener(null);
            m38350r2().getRealView().setClickable(false);
            m38334o2().getRealView().setClickable(false);
            m38374w2().setClickable(false);
            m38137C2().getRealView().setClickable(false);
            return;
        }
        m38350r2().getRealView().setOnTouchListener(this.f22606B1);
        m38334o2().getRealView().setOnTouchListener(this.f22608C1);
        m38350r2().getRealView().setClickable(true);
        m38334o2().getRealView().setClickable(true);
        m38374w2().setClickable(true);
        m38137C2().getRealView().setClickable(true);
    }

    /* JADX INFO: renamed from: T1 */
    public void m38229T1(boolean z) {
        this.f22625J0.mo39374b(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: T2 */
    public void m38230T2() {
        if (gra.m131606N3()) {
            m38269a6(true);
        }
        m38128A2().setAllowUpSwipe(true);
        if (m38236U2(" by hidenLiveCardBottomButtons s1")) {
            return;
        }
        m38155F5();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m38231T3(View view) {
        m38166H6(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m38232T4(View view) {
        m38128A2().mo39804A(SwipeDirection.LEFT);
        if (gra.m131606N3()) {
            sfj0.m185596c("e_clone_ui_swipe", "p_suggest_users_home_view", sfj0.C20032a.m185615h("clone_swipe_scene", ExpandedCardStyleHelper.m39093o().m39106s() ? "profile" : "card"), sfj0.C20032a.m185615h("actionname", "dislike"));
        }
    }

    /* JADX INFO: renamed from: T5 */
    public final void m38233T5(String str) {
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
        }
        SVGALoader.with(this.f22620H).from(str).loadCallback(new i()).into(this.f22646U.mo118295l());
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m38234T6() {
        return m38128A2().mo39812d() == null;
    }

    /* JADX INFO: renamed from: U1 */
    public final boolean m38235U1(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo39816j = newNewHomeFrag.f22420C.m38128A2().mo39816j();
        if (NullChecker.m82486a(userInfoMo39816j)) {
            return TextUtils.equals(userInfoMo39816j.f20214id, CoreSuggested.UserInfo.VIRTUAL_CARD);
        }
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public boolean m38236U2(String str) {
        if (IntlCountryCodeController.m29125v() && gta.m132210e().m132212b().mo34652wf() && m38128A2() != null && (m38128A2().mo39812d() instanceof q7m)) {
            if (gta.m132210e().m132212b().mo34651h9(((q7m) m38128A2().mo39812d()).getUserInfoProxy(), m38128A2().mo39821o().m140259d())) {
                CoreModule.f18264c.f20405m0.f20174m2.m137019l(uxj0.f181467a);
                return true;
            }
            if (!jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded) && !C4881b.m32411b(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.get(0).virtualCardType)) {
                CoreModule.f18264c.f20405m0.f20177n2.m137019l(uxj0.f181467a);
            }
        }
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM38284d6 = m38284d6();
        if (!TEnum.equals(cardButtonsShowAndHideTypeM38284d6, "show") && !TEnum.equals(cardButtonsShowAndHideTypeM38284d6, "hide") && !TEnum.equals(cardButtonsShowAndHideTypeM38284d6, CardButtonsShowAndHideType.only_hide_operation_btn)) {
            return false;
        }
        CoreModule.f18264c.f20405m0.f20171l2.m137019l(str + " by: highestPriorityHandleBottoms match " + cardButtonsShowAndHideTypeM38284d6 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return true;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m38237U3(View view) {
        m38216Q6();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m38238U4(View view) {
        m38216Q6();
    }

    /* JADX INFO: renamed from: U5 */
    public void m38239U5(boolean z) {
        m38310j3();
        pqn pqnVar = this.f22626K;
        if (pqnVar != null) {
            pqnVar.m173373n(z);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final void m38240U6() {
        this.f22706x = this.f22672h;
        this.f22708y = this.f22674i;
        this.f22710z = this.f22676j;
        this.f22603A = this.f22678k;
        this.f22605B = this.f22681l;
        this.f22607C = this.f22683m;
        this.f22609D = this.f22685n;
        this.f22611E = this.f22687o;
        this.f22614F = this.f22689p;
        this.f22617G = this.f22692q;
    }

    /* JADX INFO: renamed from: V1 */
    public void m38241V1(boolean z) {
        boolean zM81064b = PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        if (!this.f22707x1 && (zM81064b || z)) {
            this.f22624J.m101895E8(zM81064b);
        }
        bnl0.m105524M(this.f22662c, true);
        HomeStatisticsHelper.m37721x();
        this.f22707x1 = zM81064b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final bvl m38242V2(int i2) {
        bvl bvlVar = (bvl) LayoutInflater.from(act()).inflate(i2, (ViewGroup) this.f22664d, false);
        if (bvlVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) bvlVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return bvlVar;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m38243V3() {
        this.f22622I.mo37749V(SwipeDirection.fromValue(SwipeDirection.RIGHT.getValue()));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m38244V4() {
        if (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) {
            CoreModule.f18264c.f20405m0.m31997E8(m38128A2().mo39821o().m140259d().f56859id);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public void m38245V5(final int i2) {
        Act act = this.f22620H;
        if (act != null) {
            act.post(new Runnable() { // from class: l.r540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161287a.m38258Y4(i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m38246V6() {
        act().duringCreated(ji30.m144967k().distinctUntilChanged().filter(new qcj() { // from class: l.l240
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.m240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134497a.m38358s5((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public void m38247W2() {
        bnl0.m105524M(this.f22646U.mo118290g(), true);
        if (CoreModule.f18264c.f20306F0.m118446i3()) {
            bnl0.m105524M(this.f22646U.mo118296m(), true);
        }
        bnl0.m105509E0(this.f22646U.mo118290g(), new View.OnClickListener() { // from class: l.p440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150494a.m38248W3(view);
            }
        });
        if (gra.m131755u1() && CoreModule.f18264c.f20381e0.f89321r6.get().booleanValue()) {
            bnl0.m105524M(this.f22646U.mo118296m(), true);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m38248W3(View view) {
        m38190M2();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m38249W4(View view) {
        C8618a.m48771w().m48793p(this.f22620H, m38328n2(this.f22622I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new x20() { // from class: l.e240
            @Override // p153l.x20
            public final void call() {
                this.f91701a.m38244V4();
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m38250W5(final DoublePair doublePair, final List<MessageLocation> list) {
        if (doublePair == null) {
            m38264Z5(null);
            return;
        }
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m38251X1(doublePair);
            m38264Z5(null);
            return;
        }
        MessageLocation messageLocation = (MessageLocation) jyb.m147529r(list, new qcj() { // from class: l.h440
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(gsl0.m132072E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (NullChecker.m82486a(messageLocation)) {
            m38264Z5(TextUtils.isEmpty(messageLocation.name) ? act().string(R$string.f19439lo) : messageLocation.name);
        } else if (list.size() < 5) {
            fmj.m126236c(act(), true).m126239e(act(), doublePair.first, doublePair.second, new y20() { // from class: l.i440
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112829a.m38263Z4(doublePair, list, (z80) obj);
                }
            }, new y20() { // from class: l.j440
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118259a.m38268a5(doublePair, (Throwable) obj);
                }
            });
        } else {
            m38251X1(doublePair);
            m38264Z5(null);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m38251X1(DoublePair doublePair) {
        if (doublePair.equals(DoublePair.new_())) {
            return;
        }
        gsl0.m132071D0(act());
    }

    /* JADX INFO: renamed from: X2 */
    public final void m38252X2() {
        sp0.INSTANCE.m187290d();
        m38227S5(5);
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.l440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129929a.m38253X3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m38253X3(View view) {
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(false);
            m38233T5(sp0.INSTANCE.m187294h());
        }
        sp0 sp0Var = sp0.INSTANCE;
        sp0Var.m187289c();
        sp0Var.m187297k(this.f22620H);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m38254X4(boolean z, String str) {
        if (z) {
            m38233T5(str);
        } else {
            SVGALoader.with(this.f22620H).from(str).autoPlay(true).into(this.f22646U.mo118295l());
        }
    }

    /* JADX INFO: renamed from: X5 */
    public void m38255X5(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(this.f22644T)) {
            this.f22644T.m126771i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m38256Y1(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        this.f22625J0.mo39373a(z, user, userInfo);
        if (IntlCountryCodeController.m29125v() && gra.m131606N3() && NullChecker.m82486a(this.f22627K0)) {
            this.f22627K0.m39457s(z);
            m38204O5();
        }
        LinearLayout linearLayoutMo39554O = ((cvl) m38344q2().getParentFragment()).mo39554O();
        ExpandedFakeProfileTitle expandedFakeProfileTitle = this.f22653X0;
        if (!z) {
            if (expandedFakeProfileTitle == null) {
                return;
            }
            if (f22601H1) {
                gt0.m132160f(gt0.m132180z(gt0.m132171q(expandedFakeProfileTitle, "alpha", expandedFakeProfileTitle.getAlpha(), 0.0f), gt0.m132171q(linearLayoutMo39554O, "alpha", linearLayoutMo39554O.getAlpha(), 1.0f)).setDuration(200L), new Runnable() { // from class: l.d440
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84998a.m38196N3();
                    }
                }).start();
                return;
            } else {
                linearLayoutMo39554O.setAlpha(1.0f);
                bnl0.m105524M(this.f22653X0, false);
                return;
            }
        }
        if (expandedFakeProfileTitle == null) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle2 = (ExpandedFakeProfileTitle) this.f22646U.mo118299p().inflate();
            this.f22653X0 = expandedFakeProfileTitle2;
            bnl0.m105509E0(expandedFakeProfileTitle2, new View.OnClickListener() { // from class: l.a440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.m38032N(view);
                }
            });
            this.f22653X0.f23324a.m54132g(1.0f);
            this.f22653X0.f23324a.m54131f(0.0f);
        }
        if (f22601H1) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle3 = this.f22653X0;
            gt0.m132176v(gt0.m132180z(gt0.m132171q(expandedFakeProfileTitle3, "alpha", expandedFakeProfileTitle3.getAlpha(), 1.0f), gt0.m132171q(linearLayoutMo39554O, "alpha", linearLayoutMo39554O.getAlpha(), 0.0f)).setDuration(200L), new Runnable() { // from class: l.b440
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74859a.m38191M3();
                }
            }).start();
        } else {
            linearLayoutMo39554O.setAlpha(0.0f);
            bnl0.m105524M(this.f22653X0, true);
        }
        this.f22653X0.bringToFront();
        this.f22653X0.m39317h(user);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m38257Y3(View view) {
        this.f22658a.removeView(view);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m38258Y4(int i2) {
        String str;
        if (this.f22661b1 == i2) {
            return;
        }
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
        }
        if (i2 == 1) {
            str = "core_intl_like_minded_inactive.svga";
        } else {
            str = i2 == 2 ? "core_intl_like_minded_active.svga" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SVGALoader.with(this.f22620H).from(str).autoPlay(true).into(this.f22646U.mo118295l());
        this.f22661b1 = i2;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m38259Y5(int i2) {
        String str;
        int i3;
        if (this.f22659a1 == i2) {
            return;
        }
        if (this.f22646U.mo118291h().isAnimating()) {
            this.f22646U.mo118291h().stopAnimation(true);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = "https://auto.tancdn.com/v1/raw/8b1e71c6-ee21-497b-a4ab-9b2b3b4d475110.pdf";
                i3 = -1;
            } else {
                str = "";
            }
            SVGALoader.with(this.f22620H).from(str).repeatCount(i3).autoPlay(true).into(this.f22646U.mo118291h());
            this.f22659a1 = i2;
        }
        str = "https://auto.tancdn.com/v1/raw/f827c87e-ad44-45c3-a8c3-1df8825e618f11.pdf";
        i3 = 1;
        SVGALoader.with(this.f22620H).from(str).repeatCount(i3).autoPlay(true).into(this.f22646U.mo118291h());
        this.f22659a1 = i2;
    }

    /* JADX INFO: renamed from: Z1 */
    public avl m38260Z1(boolean z, boolean z2) {
        if (z) {
            return z2 ? m38137C2() : m38350r2();
        }
        return m38334o2();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m38261Z2() {
        bnl0.m105509E0(this.f22625J0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.x340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192219a.m38287e4(view);
            }
        });
        this.f22625J0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
        this.f22625J0.getDislikeBtn().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
        this.f22625J0.getDislikeBtn().setPressedStateLayerBackground(this.f22620H.drawable(this.f22625J0.getDislikePressBg()));
        this.f22625J0.getLikeBtn().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
        this.f22625J0.getLikeBtn().setPressedStateLayerBackground(this.f22620H.drawable(this.f22625J0.getLikePressBg()));
        m38269a6(!d79.m114649H());
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ View m38262Z3(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m38275c2(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m38263Z4(DoublePair doublePair, List list, z80 z80Var) {
        String strMo143670b = z80Var.mo143670b();
        String strMo143669a = z80Var.mo143669a();
        if (TextUtils.isEmpty(strMo143670b) || TextUtils.isEmpty(strMo143669a)) {
            m38251X1(doublePair);
            m38264Z5(null);
        } else {
            m38198N5(doublePair, strMo143670b, strMo143669a, list);
            m38264Z5(strMo143670b);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m38264Z5(String str) {
        this.f22632N = str;
        if (str == null || quq.m178174J(this.f22646U)) {
            m38131A6(false);
            return;
        }
        this.f22646U.getPosition().setText(str);
        m38131A6(true);
        i4g0.m138526x("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: a2 */
    public void m38265a2() {
        m38128A2().setAllowUpSwipe(false);
        bnl0.m105524M(m38142D2(), false);
        m38274b6(false);
        if (h7d0.m133774m0()) {
            h7d0.m133773i0().m133784p0(false);
            if (!gra.m131606N3()) {
                ViewGroup buttonRootLayout = this.f22625J0.getButtonRootLayout();
                int i2 = qa00.f156335v;
                buttonRootLayout.setPadding(i2, this.f22625J0.getButtonRootLayout().getPaddingTop(), i2, this.f22625J0.getButtonRootLayout().getPaddingBottom());
            }
        }
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f22627K0)) {
            bnl0.m105524M(this.f22627K0.f23621B, false);
            bnl0.m105524M(this.f22627K0.f23624E, false);
            m38274b6(false);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m38266a3() {
        bnl0.m105524M(this.f22627K0.f23620A, true);
        bnl0.m105509E0(this.f22627K0.f23620A, new View.OnClickListener() { // from class: l.m440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134747a.m38297g4(view);
            }
        });
        m38276c3();
        if (d79.m114651J()) {
            bnl0.m105524M(this.f22627K0.f23624E, true);
            m38269a6(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m38267a4() {
        return Boolean.valueOf(act().m40818h6());
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m38268a5(DoublePair doublePair, Throwable th) {
        m38251X1(doublePair);
        m38264Z5(null);
        App.f16087d.m21432k(th);
    }

    /* JADX INFO: renamed from: a6 */
    public void m38269a6(boolean z) {
        if (gra.m131606N3()) {
            bnl0.m105524M(this.f22646U.mo118285b(), false);
            bnl0.m105524M(this.f22646U.mo118293j(), false);
            return;
        }
        boolean zMo34436Vf = CoreModule.m30933P().m143405a().mo34436Vf();
        dvl dvlVar = this.f22646U;
        if (!zMo34436Vf) {
            bnl0.m105524M(dvlVar.mo118285b(), z);
            bnl0.m105524M(this.f22646U.mo118293j(), z);
        } else if (bnl0.m105529O0(dvlVar.mo118285b())) {
            bnl0.m105524M(this.f22646U.mo118285b(), false);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m38270b2(C8094c c8094c) {
        c8094c.m38908I(new c());
        bvl bvlVar = this.f22625J0;
        if (bvlVar instanceof emf) {
            ((emf) bvlVar).setImmediateleMatchClickListener(new Action1() { // from class: l.z440
                @Override // com.tantanapp.media.ttmediautils.download.Action1
                public final void call(Object obj) {
                    this.f202900a.m38202O3((String) obj);
                }
            });
        }
        bvl bvlVar2 = this.f22625J0;
        if (bvlVar2 instanceof HomeCardBottomOptButtons) {
            ((HomeCardBottomOptButtons) bvlVar2).setComplimentClickListener(new Action1() { // from class: l.a540
                @Override // com.tantanapp.media.ttmediautils.download.Action1
                public final void call(Object obj) {
                    this.f68499a.m38208P3((User) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m38271b3() {
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m38272b4(final BoostViewContainer boostViewContainer, int i2) {
        if (i2 == 2) {
            m38215Q5(true);
            boostViewContainer.m44880e(this.f22620H, new x20() { // from class: l.y540
                @Override // p153l.x20
                public final void call() {
                    boostViewContainer.m44882g(true);
                }
            }, new pcj() { // from class: l.z540
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f203004a.m38267a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m38273b5() {
        if (!(m38128A2().mo39812d() instanceof u7m) || ((u7m) m38128A2().mo39812d()).mo38926H() == null) {
            return;
        }
        bnl0.m105533Q0(((u7m) m38128A2().mo39812d()).mo38926H(), new y20() { // from class: l.d240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84750a.m38298g5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public void m38274b6(boolean z) {
        if (!gra.m131606N3()) {
            if (m38157G2() != null) {
                bnl0.m105524M(m38157G2().getRealView(), z);
                bnl0.m105524M(m38162H2(), z);
                return;
            }
            return;
        }
        m38269a6(z);
        if (m38157G2() != null) {
            bnl0.m105524M(m38157G2().getRealView(), z);
            bnl0.m105524M(m38162H2(), z);
        } else {
            bnl0.m105524M(m38157G2().getRealView(), false);
            bnl0.m105524M(m38162H2(), false);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public View m38275c2(View view, Drawable drawable, CharSequence charSequence, int i2, int i3, int i4, boolean z, x20 x20Var) {
        int i5;
        int i6;
        int iM175859d;
        int iM175859d2;
        if (view != m38300h2() && view != m38305i2()) {
            bnl0.m105524M(this.f22696s, false);
            if (z) {
                i5 = 0;
                i6 = 0;
                iM175859d = 0;
                iM175859d2 = 0;
            } else {
                int iM175859d3 = qa00.m175859d(18.0f);
                int iM175859d4 = qa00.m175859d(17.0f);
                iM175859d = qa00.m175859d(18.0f);
                i5 = iM175859d3;
                i6 = iM175859d4;
                iM175859d2 = qa00.m175859d(21.0f);
            }
            return qnp0.m177259b1(m38388z2(), view, drawable, charSequence, i2, i3, 17, i4, i5, i6, iM175859d, iM175859d2, bnl0.m105592y0() - qa00.m175859d(60.0f), 17, 0, false, x20Var);
        }
        VText vText = this.f22696s;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(dbc0.f87508va));
        ViewGroup.LayoutParams layoutParams = this.f22696s.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = qa00.m175859d(7.0f);
            marginLayoutParams.topMargin = qa00.m175859d(2.0f);
        }
        this.f22696s.setLayoutParams(layoutParams);
        this.f22696s.setPadding(qa00.m175859d(16.0f), qa00.m175859d(16.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f));
        this.f22696s.setTextSize(13.0f);
        this.f22696s.setText(charSequence);
        bnl0.m105524M(this.f22696s, true);
        if (i4 != -1) {
            if (this.f22638Q == null) {
                this.f22638Q = new Runnable() { // from class: l.p540
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f150599a.m38219R3();
                    }
                };
            }
            l51.m152888H(act(), this.f22638Q, i4);
        }
        return this.f22696s;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m38276c3() {
        bnl0.m105509E0(this.f22627K0.f23637l, new View.OnClickListener() { // from class: l.s540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166313a.m38302h4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ boolean m38277c4(View view) {
        if (ric0.m181583m()) {
            m38300h2().m44881f();
            return true;
        }
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            return true;
        }
        m38300h2().m44881f();
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m38278c5(int[] iArr) {
        C8618a.m48771w().m48789S(act(), this.f22658a, m38167I2(), 3000);
    }

    @Deprecated
    /* JADX INFO: renamed from: c6 */
    public boolean m38279c6() {
        if (m38128A2() != null && (m38128A2().mo39812d() instanceof q7m)) {
            q7m q7mVar = (q7m) m38128A2().mo39812d();
            t7m t7mVar = q7mVar instanceof t7m ? (t7m) q7mVar : null;
            User userM140259d = m38128A2().mo39821o().m140259d();
            if (q7mVar.mo37950y()) {
                if (t7mVar != null && t7mVar.mo37889f()) {
                    return false;
                }
                if (t7mVar != null && t7mVar.mo37839N()) {
                    return false;
                }
                if ((NullChecker.m82486a(userM140259d) && uih0.m196232y0(userM140259d.f56859id)) || uih0.m196223s0().m196283z0()) {
                    return false;
                }
                if (t7mVar == null || !t7mVar.mo37879c() || IntlCountryCodeController.m29125v()) {
                    return ((q7mVar instanceof UserProfileExpandedCardRoot) && ((UserProfileExpandedCardRoot) q7mVar).m38973l1()) ? false : true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d2 */
    public void m38280d2() {
        m38128A2().setAllowUpSwipe(true);
        if (IntlCountryCodeController.m29125v() && NullChecker.m82487b(this.f22627K0)) {
            bnl0.m105524M(this.f22627K0.f23621B, true);
            bnl0.m105524M(this.f22627K0.f23624E, true);
            m38274b6(true);
        }
        if (fcp.m125033y()) {
            this.f22640R = true;
        }
        m38142D2().setVisibility(0);
        m38274b6(true);
        m38142D2().setOnClickListener(new View.OnClickListener() { // from class: l.e440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92051a.m38225S3(view);
            }
        });
        m38137C2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.f440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97050a.m38231T3(view);
            }
        });
        m38137C2().setOnLongPressListener(new l());
        m38374w2().setOnClickListener(new View.OnClickListener() { // from class: l.g440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102132a.m38237U3(view);
            }
        });
        bnl0.m105564k0(m38319l2());
        if (d79.m114651J()) {
            m38266a3();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m38281d3() {
        if (s7a.m184994w()) {
            this.f22658a.bringChildToFront(this.f22662c);
            this.f22658a.bringChildToFront(this.f22651W0.getRenderView());
            this.f22662c.bringChildToFront(this.f22664d);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m38282d4() {
        if (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) {
            CoreModule.f18264c.f20405m0.m31997E8(m38128A2().mo39821o().m140259d().f56859id);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m38283d5() {
        bnl0.m105533Q0(m38167I2(), new y20() { // from class: l.x540
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192455a.m38278c5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public CardButtonsShowAndHideType m38284d6() {
        if (m38128A2() != null && (m38128A2().mo39812d() instanceof q7m)) {
            q7m q7mVar = (q7m) m38128A2().mo39812d();
            CoreSuggested.UserInfo userInfoMo39816j = m38128A2().mo39816j();
            User userM140259d = m38128A2().mo39821o().m140259d();
            t7m t7mVar = q7mVar instanceof t7m ? (t7m) q7mVar : null;
            u7m u7mVar = q7mVar instanceof u7m ? (u7m) q7mVar : null;
            if (q7mVar.mo37950y()) {
                if (t7mVar != null && t7mVar.mo37889f()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (t7mVar != null && gta.m132210e().m132212b().mo34651h9(t7mVar.getUserInfoProxy(), userM140259d)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (t7mVar != null && t7mVar.mo37839N()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (NullChecker.m82486a(userInfoMo39816j) && uih0.m196232y0(userInfoMo39816j.f20214id)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (gra.m131606N3()) {
                    if (uih0.m196223s0().f179113o) {
                        uih0.m196223s0().f179113o = false;
                        return CardButtonsShowAndHideType.get("hide");
                    }
                } else if (uih0.m196223s0().m196283z0()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (CoreModule.f18276o.m132212b().mo34652wf() && ((t7mVar != null && t7mVar.mo37879c()) || (u7mVar != null && u7mVar.mo38927c() && !ExpandedCardStyleHelper.m39093o().m39106s()))) {
                return CardButtonsShowAndHideType.get("hide");
            }
            if (wj90.m206622e(userM140259d) && NullChecker.m82486a(userInfoMo39816j) && NullChecker.m82486a(userInfoMo39816j.cityCData)) {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                if (NullChecker.m82486a(userM140259d) && !userM140259d.isMe() && userM116600p9.isFemale()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (s7a.m184994w() && NullChecker.m82486a(t7mVar) && q7mVar.mo37950y()) {
                if (t7mVar.mo37947x0() == 1) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                return t7mVar.mo37947x0() == -1 ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.unknow);
            }
            if (gra.m131606N3() && zl4.m220167c(userInfoMo39816j, userM140259d)) {
                return ExpandedCardStyleHelper.m39093o().m39106s() ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
            }
            if (zl4.m220167c(userInfoMo39816j, userM140259d)) {
                return CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.only_hide_operation_btn);
            }
            if (d79.m114648G() && NullChecker.m82486a(q7mVar) && !q7mVar.mo37925q0() && NullChecker.m82486a(userInfoMo39816j)) {
                IntlInsertCardData intlInsertCardData = userInfoMo39816j.intlInsertCardData;
                if (intlInsertCardData == null) {
                    return CardButtonsShowAndHideType.get("show");
                }
                switch (intlInsertCardData.cardType) {
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 13:
                        return (gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s()) ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
                    case 2:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return CardButtonsShowAndHideType.get("show");
                    case 5:
                    case 8:
                    case 9:
                    case 11:
                        return CardButtonsShowAndHideType.get("show");
                    case 10:
                    case 12:
                        return CardButtonsShowAndHideType.get(IntlCountryCodeController.m29125v() ? "show" : "hide");
                    default:
                        return CardButtonsShowAndHideType.get("show");
                }
            }
        }
        return gra.m131606N3() ? CardButtonsShowAndHideType.get("hide") : CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.unknow);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f22704w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pqn pqnVar = this.f22626K;
        if (pqnVar != null) {
            pqnVar.m173371l();
            this.f22626K = null;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public SpannableString m38285e2(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(c9c0.f80362O1)), str.indexOf(CoreModule.f18264c.f20338P2.get()), str.indexOf(CoreModule.f18264c.f20338P2.get()) + CoreModule.f18264c.f20338P2.get().length(), 34);
        return spannableString;
    }

    /* JADX INFO: renamed from: e3 */
    public void m38286e3() {
        this.f22607C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f22605B.m37664p(new x20() { // from class: l.l340
            @Override // p153l.x20
            public final void call() {
                this.f129838a.m38307i4();
            }
        }, new x20() { // from class: l.m340
            @Override // p153l.x20
            public final void call() {
                this.f134640a.m38311j4();
            }
        }, new x20() { // from class: l.n340
            @Override // p153l.x20
            public final void call() {
                this.f139933a.m38316k4();
            }
        }, this.f22624J);
        this.f22607C.m37683m(this.f22624J, new x20() { // from class: l.o340
            @Override // p153l.x20
            public final void call() {
                this.f144817a.m38320l4();
            }
        });
        this.f22607C.setShowCallback(new y20() { // from class: l.p340
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150353a.m38325m4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m38287e4(View view) {
        C8618a.m48771w().m48793p(this.f22620H, m38328n2(this.f22622I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new x20() { // from class: l.f540
            @Override // p153l.x20
            public final void call() {
                this.f97190a.m38282d4();
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m38288e5(int[] iArr) {
        if (m38128A2().mo39812d() instanceof NewNewProfileCard) {
            C8618a.m48771w().m48789S(act(), this.f22658a, ((NewNewProfileCard) m38128A2().mo39812d()).mo37860V(), 3000);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e6 */
    public void m38289e6() {
        if (m38236U2(" by showBottomButton s1 ")) {
            return;
        }
        m38155F5();
    }

    /* JADX INFO: renamed from: f2 */
    public void m38290f2() {
        m38215Q5(true);
        m38280d2();
        act().m40817g7();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m38291f3() {
        if (s7a.m184982k()) {
            bnl0.m105524M(this.f22646U.mo118288e(), false);
            bnl0.m105524M(this.f22646U.mo118289f(), true);
            bnl0.m105509E0(this.f22646U.mo118289f(), new View.OnClickListener() { // from class: l.q440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155519a.m38330n4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m38292f4() {
        if (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39821o()) && NullChecker.m82486a(m38128A2().mo39821o().m140259d())) {
            CoreModule.f18264c.f20405m0.m31997E8(m38128A2().mo39821o().m140259d().f56859id);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m38293f5() {
        if (m38128A2().mo39812d() instanceof NewNewProfileCard) {
            bnl0.m105533Q0(((NewNewProfileCard) m38128A2().mo39812d()).mo37860V(), new y20() { // from class: l.d640
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85253a.m38288e5((int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f6 */
    public void m38294f6() {
        C4499d.m21895l().m21899k("home_show_filter_tip");
        C4496a c4496a = new C4496a(this.f22646U.mo118290g().getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("推荐的人不喜欢？试试调整筛选条件").m21869k(CoreModule.f18263b.getResources().getColor(f9c0.f97859d)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21853I(228).m21880w(qa00.m175859d(6.0f)).m21881x(qa00.m175859d(6.0f)).m21856L(c9c0.f80434l0).m21847C(10).m21882y(true).m21874q(C4496a.f16399N);
        C4499d.m21895l().m21908u(c4496a, this.f22646U.mo118290g(), "home_show_filter_tip");
    }

    /* JADX INFO: renamed from: g2 */
    public View m38295g2() {
        return this.f22646U.mo118290g();
    }

    /* JADX INFO: renamed from: g3 */
    public void m38296g3(boolean z) {
        if (s7a.m184997z() || CoreModule.f18264c.f20443y2.m216799E3()) {
            return;
        }
        bnl0.m105524M(this.f22646U.mo118298o(), z);
        if (z) {
            i4g0.m138526x("e_find_partner_entrance", "p_suggest_users_home_view");
            bnl0.m105509E0(this.f22646U.mo118298o(), new View.OnClickListener() { // from class: l.e540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92181a.m38336o4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m38297g4(View view) {
        C8618a.m48771w().m48793p(this.f22620H, m38328n2(this.f22622I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new x20() { // from class: l.g540
            @Override // p153l.x20
            public final void call() {
                this.f102280a.m38292f4();
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m38298g5(int[] iArr) {
        if (!(m38128A2().mo39812d() instanceof u7m) || ((u7m) m38128A2().mo39812d()).mo38926H() == null) {
            return;
        }
        C8618a.m48771w().m48789S(act(), this.f22658a, ((u7m) m38128A2().mo39812d()).mo38926H(), 3000);
    }

    /* JADX INFO: renamed from: g6 */
    public void m38299g6() {
        if (NullChecker.m82486a(m38300h2()) && bnl0.m105529O0(m38300h2())) {
            CoreModule.f18264c.f20318J0.f134520j0.put(Boolean.valueOf(m38304h6(act().getString(R$string.f18996X9), m38300h2(), zvk.f206224A | zvk.f206228E, 4, 0)));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public BoostViewContainer m38300h2() {
        return this.f22646U.mo118292i();
    }

    /* JADX INFO: renamed from: h3 */
    public final void m38301h3() {
        CoreModule.f18264c.f20445z1.m157206o3(this.f22620H, new Function1() { // from class: l.s340
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        });
        m38227S5(3);
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.t340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171893a.m38341p4(view);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m38302h4(View view) {
        User userM38178K2 = m38178K2(this.f22622I);
        if (userM38178K2 == null) {
            return;
        }
        i4g0.m138520r("e_compliment_card_btn_click", "p_suggest_users_home_view");
        int showPictureIndexProxy = (NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39812d()) && (m38128A2().mo39812d() instanceof xql)) ? ((xql) m38128A2().mo39812d()).getShowPictureIndexProxy() : 0;
        if (np5.m164215b(this.f22620H, NullChecker.m82486a(m38128A2()) ? m38128A2().mo39816j() : null, userM38178K2, "home_card_us_compliment_btn")) {
            return;
        }
        fp5.m126531m(this.f22620H, userM38178K2, "home_card_us_compliment_btn", Integer.valueOf(showPictureIndexProxy), null, fp5.m126527i());
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m38303h5() {
        m38166H6(true);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m38304h6(String str, View view, int i2, int i3, int i4) {
        if (cl80.m110426e().m110433k()) {
            return false;
        }
        TextView textView = new TextView(this.f22620H);
        textView.setText(str);
        int i5 = qa00.f156326m;
        int i6 = qa00.f156322i;
        textView.setPadding(i5, i6, qa00.f156323j, i6);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        float f2 = i3;
        C4499d.m21895l().m21907t(new C4496a(act()).m21869k(j26.m143190c(act(), c9c0.f80370R0)).m21876s(textView).m21880w(qa00.m175859d(f2)).m21879v(qa00.m175859d(f2)).m21881x(i4).m21857M(true).m21874q(i2), view);
        return true;
    }

    /* JADX INFO: renamed from: i2 */
    public View m38305i2() {
        return this.f22646U.mo118292i().getBoostButton();
    }

    /* JADX INFO: renamed from: i3 */
    public final void m38306i3() {
        i4g0.m138526x("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        m38227S5(0);
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.b540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75021a.m38346q4(view);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m38307i4() {
        this.f22624J.m102028j5();
        Animator animator = this.f22709y1;
        if (animator != null && !animator.isRunning()) {
            this.f22709y1.start();
        }
        this.f22621H0.mo40116b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m38308i5(int i2) {
        if (TextUtils.isEmpty(m38343p6())) {
            m38348q6(i2);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m38309i6() {
        if (IntlCountryCodeController.m29125v()) {
            l51.m152889I(this.f22622I, new Runnable() { // from class: l.t540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172181a.m38283d5();
                }
            }, 500L);
        } else if (m38128A2().mo39812d() instanceof NewNewProfileCard) {
            l51.m152889I(this.f22622I, new Runnable() { // from class: l.v540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182476a.m38293f5();
                }
            }, 500L);
        } else if (m38128A2().mo39812d() instanceof u7m) {
            l51.m152889I(this.f22622I, new Runnable() { // from class: l.w540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187479a.m38273b5();
                }
            }, 500L);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        yhi0.m215967a("NewNewHomeViewModel inflateView");
        LaunchStep launchStep = LaunchStep.HomeTabInflate;
        uqi.m197339f(launchStep);
        View viewM38172J1 = m38172J1(layoutInflater, viewGroup);
        m38240U6();
        this.f22646U = new kl8(this.f22704w);
        tu2.m192703a("BifrostLayout", "开始使用优化布局");
        this.f22623I0 = new ProfileCardStackOpt(act(), new uxl0() { // from class: l.g340
            @Override // p153l.uxl0
            /* JADX INFO: renamed from: d2 */
            public final sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f101945a.m38184L2(virtualCardType, userInfo);
            }
        }, this);
        if (gra.m131596L3()) {
            int i2 = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = qa00.m175859d(44.0f);
            this.f22670g.addView(this.f22623I0, 0, layoutParams);
            bnl0.m105540X(this.f22662c, 0);
            this.f22651W0 = (SuperLikeComboAnimView) LayoutInflater.from(act()).inflate(kec0.f125986oc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f22702v.addView(this.f22651W0.getRenderView(), layoutParams2);
        } else {
            this.f22664d.setClipChildren(false);
            this.f22664d.setClipToPadding(false);
            this.f22623I0.setClipChildren(false);
            this.f22623I0.setClipToPadding(false);
            bnl0.m105524M(this.f22668f, true);
            this.f22670g.addView(this.f22623I0, 0, new FrameLayout.LayoutParams(-1, -1));
            this.f22651W0 = (SuperLikeComboAnimView) LayoutInflater.from(act()).inflate(kec0.f125986oc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            this.f22702v.addView(this.f22651W0.getRenderView(), layoutParams3);
        }
        bnl0.m105524M(this.f22651W0.getRenderView(), false);
        m38379x3();
        this.f22621H0 = new RadarRipple(act());
        this.f22710z.addView(this.f22621H0.getRippleView(), 0, new FrameLayout.LayoutParams(-1, -1));
        if (gra.m131606N3()) {
            this.f22664d.setPadding(0, 0, 0, 0);
        }
        if (gra.m131654Z2()) {
            quq.m178177M(this.f22620H, this.f22664d, this.f22646U, this.f22623I0);
        } else if (gra.m131667c3()) {
            quq.m178178N(this.f22620H, this.f22646U);
        }
        m38351r3();
        m38370v3();
        m38271b3();
        this.f22612E0 = this.f22623I0;
        bnl0.m105509E0(this.f22625J0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.r340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC8017b.m38093n(view);
            }
        });
        this.f22704w.getViewTreeObserver().addOnGlobalLayoutListener(this);
        uqi.m197337d(launchStep);
        m38281d3();
        yhi0.m215968b();
        return viewM38172J1;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m38310j3() {
        VFrame vFrame = this.f22664d;
        if (vFrame != null) {
            vFrame.setClipChildren(false);
            this.f22664d.setClipToPadding(false);
        }
        VLinear vLinear = this.f22666e;
        if (vLinear != null) {
            vLinear.setClipChildren(false);
            this.f22666e.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.f22670g;
        if (frameLayout != null) {
            frameLayout.setClipChildren(false);
            this.f22670g.setClipToPadding(false);
            this.f22670g.setClipToOutline(false);
        }
        ProfileCardStackOpt profileCardStackOpt = this.f22623I0;
        if (profileCardStackOpt != null) {
            profileCardStackOpt.setClipChildren(false);
            this.f22623I0.setClipToPadding(false);
        }
        if (this.f22626K != null) {
            return;
        }
        bnl0.m105524M(this.f22668f, true);
        pqn pqnVar = new pqn(this.f22622I, new y20() { // from class: l.f640
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97376a.m38352r4((Boolean) obj);
            }
        });
        this.f22626K = pqnVar;
        pqnVar.m173369i(this.f22668f);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m38312j5(y20 y20Var, x20 x20Var) {
        this.f22624J.m101971X4();
        Boolean bool = Boolean.TRUE;
        y20Var.call(bool);
        if (!iz40.m142788y(this.f22620H, true)) {
            this.f22624J.f74502G.m137019l(bool);
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m38313j6() {
        if (NullChecker.m82486a(m38132B2()) && bnl0.m105529O0(m38132B2())) {
            z5h0.m218675j().f203048f.put(Boolean.valueOf(m38304h6(act().getString(R$string.f18966W9), m38132B2(), zvk.f206227D | zvk.f206228E, 18, IntlCountryCodeController.m29125v() ? 0 : -26)));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public View m38314k2() {
        return this.f22646U.mo118292i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: k3 */
    public final void m38315k3() {
        m38227S5(4);
        udo.INSTANCE.m195505e();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = uqb0.f180400f0 + "";
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.k440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123827a.m38357s4(view);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m38316k4() {
        InterfaceC0476e interfaceC0476eM2558i0 = this.f22620H.fragmentManager().m2558i0(TabName.Card.toString());
        if (NullChecker.m82486a(interfaceC0476eM2558i0) && (interfaceC0476eM2558i0 instanceof cvl)) {
            ((cvl) interfaceC0476eM2558i0).mo39543C1(NewTanFragTag.HOME, null);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m38317k5(y20 y20Var, x20 x20Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        this.f22624J.m101971X4();
        y20Var.call(Boolean.FALSE);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m38318k6() {
        C4499d.m21895l().m21899k("home_show_just_look_verify_tip");
        C4496a c4496a = new C4496a(this.f22646U.mo118287d().getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21848D("开启后，只为你展示通过真实头像认证的用户").m21869k(CoreModule.f18263b.getResources().getColor(f9c0.f97859d)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21880w(qa00.m175859d(6.0f)).m21881x(qa00.m175859d(6.0f)).m21882y(true).m21874q(C4496a.f16399N).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        C4499d.m21895l().m21908u(c4496a, this.f22646U.mo118287d(), "home_show_just_look_verify_tip");
        sfj0.m185601h("e_only_show_verified_bubble", "p_suggest_users_home_view", new sfj0.C20032a[0]);
    }

    @Deprecated
    /* JADX INFO: renamed from: l2 */
    public View m38319l2() {
        return this.f22625J0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m38320l4() {
        this.f22624J.m101887C8();
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m38321l5(ViewGroup viewGroup, ViewGroup viewGroup2, jl80 jl80Var, final y20 y20Var, final x20 x20Var, View view) {
        boolean zM106285u = bsj0.m106285u(viewGroup);
        boolean zM106285u2 = bsj0.m106285u(viewGroup2);
        fph0.m126646Q(zM106285u, zM106285u2, upp0.m197170e().m197172g());
        jl80Var.dismiss();
        PermissionHelper.m81065c().m81083r("android.permission.READ_CONTACTS").m81088w(false).m81086u(zM106285u || zM106285u2).m81075j(true).m81078m(new x20() { // from class: l.j240
            @Override // p153l.x20
            public final void call() {
                this.f118032a.m38312j5(y20Var, x20Var);
            }
        }, new y20() { // from class: l.k240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123572a.m38317k5(y20Var, x20Var, (PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81081p(new b()).m81085t(new a()).m81087v(new m()).m81074i(this.f22620H);
    }

    @Deprecated
    /* JADX INFO: renamed from: l6 */
    public void m38322l6() {
        if (gra.m131606N3()) {
            m38269a6(false);
        }
        if (m38236U2(" by showLiveCardBottomButtons s1 ")) {
            return;
        }
        m38150E5();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m38323m2() {
        return bnl0.m105529O0(this.f22625J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: m3 */
    public final void m38324m3() {
        m38227S5(1);
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.w440
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187226a.m38361t4(view);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m38325m4(Boolean bool) {
        m38176J6();
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ View m38326m5() {
        View view = new View(act());
        view.setClickable(false);
        view.setBackgroundColor(520093696);
        view.setMinimumHeight(qa00.m175859d(2.0f));
        view.setLayoutParams(new LinearLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(2.0f)));
        bnl0.m105538V(view, qa00.m175859d(12.0f));
        bnl0.m105539W(view, qa00.m175859d(12.0f));
        return view;
    }

    /* JADX INFO: renamed from: m6 */
    public void m38327m6(int i2) {
        z5h0.m218661E(this.f22622I, m38142D2(), i2, new x20() { // from class: l.h540
            @Override // p153l.x20
            public final void call() {
                this.f107895a.m38303h5();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final User m38328n2(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo39816j = newNewHomeFrag.f22420C.m38128A2().mo39816j();
        if (!NullChecker.m82486a(userInfoMo39816j) || m38235U1(newNewHomeFrag)) {
            return null;
        }
        return userInfoMo39816j.getRenderUser();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m38329n3() {
        m38227S5(2);
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.k340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123681a.m38366u4(view);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m38330n4(View view) {
        i4g0.m138523u("e_femalevip_icon", "p_suggest_users_home_view", jyb.m147494Y("femalevip_is_on", Boolean.valueOf(this.f22649V0)));
        vfi.m201143u().get().m201152I(act());
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m38331n5(uxj0 uxj0Var) {
        this.f22622I.m21598s4();
    }

    @Deprecated
    /* JADX INFO: renamed from: n6 */
    public void m38332n6() {
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f22627K0)) {
            bnl0.m105525M0(this.f22627K0.f23651z, true);
            bnl0.m105525M0(this.f22627K0.f23626a, true);
            return;
        }
        if (gra.m131606N3()) {
            m38269a6(true);
        }
        if (m38236U2(" by showNewBottomButton s1 ")) {
            return;
        }
        m38222R6();
        m38155F5();
    }

    /* JADX INFO: renamed from: o */
    public boolean m38333o() {
        m38210P5();
        return false;
    }

    /* JADX INFO: renamed from: o2 */
    public avl m38334o2() {
        return this.f22625J0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m38335o3() {
        if (jfr.INSTANCE.m144710h() == -1 || !C8016a.INSTANCE.m37995e()) {
            return;
        }
        i4g0.m138526x("e_same_entrance", "p_suggest_users_home_view");
        bnl0.m105524M(this.f22646U.mo118295l(), true);
        bnl0.m105524M(this.f22646U.mo118291h(), false);
        bnl0.m105524M(this.f22646U.mo118294k(), false);
        this.f22624J.m102082v8();
        C8574a.INSTANCE.m48072j(this.f22620H, new Function1() { // from class: l.u340
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f177283a.m38371v4((Long) obj);
            }
        }, new Function0() { // from class: l.v340
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f182152a.m38376w4();
            }
        });
        bnl0.m105509E0(this.f22646U.mo118295l(), new View.OnClickListener() { // from class: l.w340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187081a.m38380x4(view);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m38336o4(View view) {
        i4g0.m138520r("e_find_partner_entrance", "p_suggest_users_home_view");
        Intent intentM81422e2 = MkWebViewAct.m81422e2(this.f22620H, "", zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/", true, true, true, null);
        intentM81422e2.putExtra("hideNotch", true);
        act().startActivity(intentM81422e2);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m38337o5(Throwable th) {
        this.f22622I.m21598s4();
        ey6.m123174b(th);
    }

    /* JADX INFO: renamed from: o6 */
    public void m38338o6(final int i2) {
        if (m38168I3()) {
            return;
        }
        l51.m152888H(act(), new Runnable() { // from class: l.y340
            @Override // java.lang.Runnable
            public final void run() {
                this.f197303a.m38308i5(i2);
            }
        }, 500L);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.f22704w.getChildAt(0);
        int childCount = linearLayoutCompat.getChildCount();
        int marginEnd = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            if (childAt.isShown() && childAt.getId() != adc0.f70512pf) {
                int measuredWidth = marginEnd + linearLayoutCompat.getChildAt(i2).getMeasuredWidth();
                LinearLayoutCompat.C0132a c0132a = (LinearLayoutCompat.C0132a) childAt.getLayoutParams();
                marginEnd = measuredWidth + ((ViewGroup.MarginLayoutParams) c0132a).leftMargin + ((ViewGroup.MarginLayoutParams) c0132a).rightMargin + c0132a.getMarginEnd() + c0132a.getMarginStart();
            }
        }
        jj40.m145005h(bnl0.m105592y0() - marginEnd);
    }

    /* JADX INFO: renamed from: p2 */
    public DraweeView m38339p2() {
        return this.f22605B.f22383c;
    }

    /* JADX INFO: renamed from: p3 */
    public void m38340p3() {
        bnl0.m105509E0(this.f22646U.getPosition(), new View.OnClickListener() { // from class: l.d540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85099a.m38385y4(view);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m38341p4(View view) {
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
            m38233T5(C8545b.INSTANCE.m47467f());
        }
        C8545b.INSTANCE.m47470i(this.f22620H, 2);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m38342p5() {
        this.f22624J.m102042l9(new y20() { // from class: l.h240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107522a.m38331n5((uxj0) obj);
            }
        }, new y20() { // from class: l.i240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112581a.m38337o5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public String m38343p6() {
        if (!m38168I3() && NullChecker.m82486a(m38142D2()) && m38142D2().getScaleY() == 1.0f && m38323m2()) {
            z5h0.m218675j().m218697v();
            if (c8d0.m108356f0() && this.f22622I.f22420C.m38173J3() && ((!(this.f22622I.getParentFragment() instanceof cvl) || ((cvl) this.f22622I.getParentFragment()).mo39558T() == NewTanFragTag.HOME) && ji30.m144964h() == TabName.Card && !m38158G3() && ((!gra.m131654Z2() || !CoreModule.f18264c.f20446z2.m31253r3()) && !m38153F3()))) {
                return z5h0.m218675j().m218686J(m38328n2(this.f22622I), this.f22622I, m38142D2(), 2000);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: q2 */
    public NewNewHomeFrag m38344q2() {
        return this.f22622I;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m38345q3(int i2) {
        boolean zM38163H3;
        if (!m38148E3() || i2 == 4) {
            if (i2 == 0) {
                zM38163H3 = C8016a.INSTANCE.m37994d() && vy5.INSTANCE.m203954d() != -1;
                if (zM38163H3) {
                    m38306i3();
                }
            } else if (i2 == 1) {
                zM38163H3 = m38163H3();
                if (zM38163H3) {
                    m38324m3();
                }
            } else if (i2 == 2) {
                zM38163H3 = m38185L3();
                if (zM38163H3) {
                    m38329n3();
                }
            } else if (i2 == 3) {
                zM38163H3 = m38143D3();
                if (zM38163H3) {
                    m38301h3();
                }
            } else if (i2 == 4) {
                zM38163H3 = m38148E3();
                if (zM38163H3) {
                    m38315k3();
                }
            } else if (i2 != 5) {
                zM38163H3 = false;
            } else {
                zM38163H3 = C8016a.INSTANCE.m37992b();
                if (zM38163H3) {
                    m38252X2();
                }
            }
            dvl dvlVar = this.f22646U;
            if (!zM38163H3) {
                bnl0.m105524M(dvlVar.mo118295l(), false);
                return;
            }
            bnl0.m105524M(dvlVar.mo118295l(), true);
            bnl0.m105524M(this.f22646U.mo118291h(), false);
            bnl0.m105524M(this.f22646U.mo118294k(), false);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m38346q4(View view) {
        i4g0.m138520r("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        ly5.m156256a(this.f22620H);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m38347q5(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        act().m40826l7();
    }

    /* JADX INFO: renamed from: q6 */
    public String m38348q6(int i2) {
        View viewM38142D2 = (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f22627K0)) ? this.f22627K0.f23621B : m38142D2();
        if (!IntlCountryCodeController.m29125v()) {
            if (CoreModule.f18264c.m32487o3() == null || !m38173J3() || CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() == 0) {
                return null;
            }
            boolean zM224277c = m38147E2().m224277c();
            bvl bvlVar = this.f22625J0;
            if (zM224277c) {
                bvlVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()));
                return "bubble_superlike_bubble";
            }
            bvlVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()));
            z5h0.m218663G(this.f22620H, m38147E2(), this.f22625J0.getSuperLikeRemaining());
            return "bubble_superlike_bubble";
        }
        if (!m38168I3() && NullChecker.m82486a(viewM38142D2) && NullChecker.m82486a(m38142D2()) && m38133B3() && bnl0.m105529O0(viewM38142D2) && m38142D2().getScaleY() == 1.0f && m38323m2() && !m38147E2().m224277c() && CoreModule.f18264c.m32487o3() != null && this.f22622I.f22420C.m38173J3() && this.f22620H != null && !(((this.f22622I.getParentFragment() instanceof cvl) && ((cvl) this.f22622I.getParentFragment()).mo39558T() != NewTanFragTag.HOME) || m38235U1(this.f22622I) || ji30.m144964h() != TabName.Card || m38158G3() || ((gra.m131654Z2() && CoreModule.f18264c.f20446z2.m31253r3()) || m38153F3()))) {
            return z5h0.m218675j().m218687K(this.f22622I, (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f22627K0)) ? this.f22627K0.f23621B : m38142D2(), i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m38349r() {
        m38384y3();
        m38360t3();
        m38310j3();
        m38246V6();
    }

    /* JADX INFO: renamed from: r2 */
    public avl m38350r2() {
        return this.f22625J0.getLikeBtn();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m38351r3() {
        if (gra.m131606N3()) {
            this.f22625J0 = m38242V2(kec0.f125692X3);
        } else if (d79.m114649H()) {
            this.f22625J0 = m38242V2(kec0.f125775c4);
        } else {
            this.f22625J0 = m38242V2(kec0.f125708Y3);
        }
        if (IntlCountryCodeController.m29125v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f22625J0.getButtonRootLayout();
        buttonRootLayout.setId(adc0.f70553s5);
        this.f22664d.addView(buttonRootLayout, this.f22625J0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m38352r4(Boolean bool) {
        act().m40810d6().m40968C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m38353r5() {
        m38146D6(StudentInfoAct.m45668X1(act(), "Chanel1.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: r6 */
    public void m38354r6() {
        if (m38163H3()) {
            Animator animatorM132168n = gt0.m132168n(this.f22646U.mo118295l(), gt0.f106354i, 1.2f, 1.0f);
            animatorM132168n.setDuration(800L);
            animatorM132168n.setStartDelay(300L);
            animatorM132168n.start();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public VDraweeView m38355s2() {
        return this.f22603A;
    }

    /* JADX INFO: renamed from: s3 */
    public void m38356s3(boolean z, boolean z2) {
        this.f22642S.m137019l(Boolean.valueOf(z));
        this.f22624J.f74508J = z2;
        float f2 = !z ? 1 : 0;
        m38350r2().getRealView().setScaleX(f2);
        m38350r2().getRealView().setScaleY(f2);
        m38334o2().getRealView().setScaleX(f2);
        m38334o2().getRealView().setScaleY(f2);
        m38142D2().setScaleX(f2);
        m38142D2().setScaleY(f2);
        m38157G2().getRealView().setScaleX(f2);
        m38157G2().getRealView().setScaleY(f2);
        if (!m38362t5()) {
            m38300h2().setScaleX(f2);
            m38300h2().setScaleY(f2);
            m38314k2().setScaleX(f2);
            m38314k2().setScaleY(f2);
        }
        m38228S6();
        m38364u2().setRadarColor(this.f22634O);
        this.f22709y1 = asj0.m99934c0(m38364u2(), m38355s2(), !gra.m131778z());
        bnl0.m105525M0(this.f22706x, z);
        m38176J6();
        bnl0.m105525M0(this.f22664d, true);
        m38199N6(z);
        m38194M6(!z);
        if (IntlCountryCodeController.m29125v()) {
            if (NullChecker.m82486a(m38152F2())) {
                bnl0.m105524M(m38152F2(), !z);
            }
            if (NullChecker.m82486a(m38167I2())) {
                bnl0.m105524M(m38167I2(), !z);
            }
        }
        if (!m38362t5()) {
            m38215Q5(!z);
        }
        if (gra.m131606N3()) {
            m38269a6(!z);
        }
        View immediatelyMatch = this.f22625J0.getImmediatelyMatch();
        if (!d79.m114648G() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.setScaleX(f2);
        immediatelyMatch.setScaleY(f2);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m38357s4(View view) {
        udo udoVar = udo.INSTANCE;
        udoVar.m195504d();
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
            m38233T5(udoVar.m195507g());
        }
        udoVar.m195514n(this.f22620H, 2);
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m38358s5(TabName tabName) {
        m38200O1();
    }

    /* JADX INFO: renamed from: s6 */
    public void m38359s6(final Settings settings, final y20<Boolean> y20Var, final x20 x20Var) {
        ViewGroup viewGroup = (ViewGroup) m38344q2().mo21577H2().inflate(kec0.f125617S8, (ViewGroup) null, false);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(adc0.f70536r5);
        final ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(adc0.f70458mc);
        View viewFindViewById = viewGroup.findViewById(adc0.f70660ya);
        viewFindViewById.setBackgroundResource(dbc0.f86616U);
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        final jl80 jl80VarM146020O = new jl80.C17971a(this.f22620H).m146023R(viewGroup).m146021P(false).m146020O();
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.a640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68665a.m38321l5(viewGroup2, viewGroup3, jl80VarM146020O, y20Var, x20Var, view);
            }
        });
        jl80VarM146020O.show();
        fph0.m126645P(false);
        bsj0.m106284t(viewGroup2, settings.hideContacts().booleanValue());
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: l.b640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(bsj0.m106262T(viewGroup2));
            }
        });
        bsj0.m106284t(viewGroup3, !settings.hideMutualContacts().booleanValue());
        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: l.c640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!bsj0.m106262T(viewGroup3));
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m38360t3() {
        if (s7a.m184994w()) {
            ViewGroup viewGroup = (ViewGroup) this.f22658a.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m38361t4(View view) {
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
            m38233T5(ix60.INSTANCE.m142469e());
        }
        ix60.INSTANCE.m142470e0(this.f22620H, 2);
    }

    /* JADX INFO: renamed from: t5 */
    public boolean m38362t5() {
        return spl0.m187349A() || spl0.m187350B();
    }

    /* JADX INFO: renamed from: t6 */
    public void m38363t6() {
        ViewGroup viewGroup = (ViewGroup) this.f22622I.mo21577H2().inflate(kec0.f125364Ce, (ViewGroup) null, false);
        bnl0.m105548c0(viewGroup, qa00.m175859d(32.0f));
        bnl0.m105554f0(viewGroup, qa00.m175859d(32.0f));
        Settings settings = new Settings();
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        pcj pcjVar = new pcj() { // from class: l.f240
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96854a.m38326m5();
            }
        };
        viewGroup.addView((View) pcjVar.call(), 0);
        viewGroup.addView((View) pcjVar.call());
        act().dialog().m21502E0(R$string.f19256fp).m21499D(R$string.f19194dp).m21518O(viewGroup).m21558v().m21555t0(R$string.f19225ep, new Runnable() { // from class: l.g240
            @Override // java.lang.Runnable
            public final void run() {
                this.f101809a.m38342p5();
            }
        }).m21495B(false).m21566z().show();
    }

    /* JADX INFO: renamed from: u2 */
    public vql m38364u2() {
        return this.f22621H0;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m38365u3() {
        if (C8016a.INSTANCE.m38000j()) {
            SVGAnimationView sVGAnimationViewMo118291h = this.f22646U.mo118291h();
            ami0 ami0Var = ami0.INSTANCE;
            bnl0.m105524M(sVGAnimationViewMo118291h, ami0Var.m98831e() != -1);
            bnl0.m105524M(this.f22646U.mo118294k(), ami0Var.m98831e() != -1);
            if (ami0Var.m98831e() != -1) {
                this.f22624J.m101956U4();
                bnl0.m105509E0(this.f22646U.mo118291h(), new View.OnClickListener() { // from class: l.q340
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f155422a.m38390z4(view);
                    }
                });
                i4g0.m138526x("e_suggest_tarot_entrance", "p_suggest_users_home_view");
                hni0.m136116a(this.f22620H, false);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m38366u4(View view) {
        if (this.f22646U.mo118295l().isAnimating()) {
            this.f22646U.mo118295l().stopAnimation(true);
            m38233T5(xnf0.INSTANCE.m212188f());
        }
        xnf0.INSTANCE.m212196n(this.f22620H, 2);
    }

    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public final void m38164H4(f1g0 f1g0Var, xql xqlVar) {
        if (f1g0Var.mo39812d() == null) {
            return;
        }
        if ((uih0.m196214m0() && NullChecker.m82486a(f1g0Var.mo39816j()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d()) && (uih0.m196232y0(f1g0Var.mo39821o().m140259d().f56859id) || f1g0Var.mo39816j() == null)) || f1g0Var.m179541q() || f1g0Var.m179539f()) {
            return;
        }
        if (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140260e()) && CoreModule.f18264c.f20405m0.f20150e2.m35222x3(f1g0Var.mo39821o().m140260e())) {
            return;
        }
        if (f1g0Var.mo39819m()) {
            f1g0Var.mo39820n();
            return;
        }
        if (f1g0Var.mo39812d() instanceof u7m) {
            ExpandedCardStyleHelper.m39093o().m39101m(f1g0Var.mo39821o().m140259d(), f1g0Var.mo39816j());
            return;
        }
        q7m q7mVar = f1g0Var.mo39812d() instanceof q7m ? (q7m) f1g0Var.mo39812d() : null;
        if (NullChecker.m82486a(q7mVar) && CoreModule.m30932N().mo61478M8()) {
            NewNewProfileCard.m37790Y1();
        }
        if (NullChecker.m82486a(q7mVar)) {
            q7mVar.mo37809C();
        }
        int i2 = (q7mVar == null || ((q7mVar instanceof t7m) && !((t7m) q7mVar).mo37845P())) ? 1 : 0;
        boolean z = NullChecker.m82486a(q7mVar) && NullChecker.m82486a(q7mVar.getCardData()) && NullChecker.m82486a(q7mVar.getCardData().m140260e()) && (q7mVar.getCardData().m140260e().isUserLikeMe() || (CoreModule.f18276o.m132212b().mo34652wf() && q7mVar.getCardData().m140260e().hasLikeMeSlideCardTop));
        String str = z ? "upper_right" : "null";
        if (NullChecker.m82486a(q7mVar) && q7mVar.mo37812D("female_like_flag_lower_left")) {
            str = "lower_left";
            z = true;
        }
        CoreSuggested.UserInfo userInfoMo39816j = m38128A2().mo39816j();
        CoreMomentInfo momentInfoProxy = xqlVar.getMomentInfoProxy();
        ArrayList arrayListM147507f0 = jyb.m147507f0(sfj0.C20032a.m185613f("IsWhiteBlock", i2), sfj0.C20032a.m185615h("moments_user_id", NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0"), sfj0.C20032a.m185616i("show_he_liked", z), sfj0.C20032a.m185615h("show_he_liked_position", str), sfj0.C20032a.m185616i("is_first_picture", this.f22624J.m102015g6(NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0") && xqlVar.getShowPictureIndexProxy() == 0), sfj0.C20032a.m185615h("swipe_scene", "default"), sfj0.C20032a.m185616i("theme_card_ornot", NullChecker.m82486a(userInfoMo39816j) && userInfoMo39816j.isThemeCard), sfj0.C20032a.m185615h("is_moment_card", xqlVar.mo37953z() ? "1" : "0"), sfj0.C20032a.m185615h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56856id : "0"), sfj0.C20032a.m185615h("is_show_longtimenosee_tag", (gra.m131740r1() && NullChecker.m82486a(userInfoMo39816j) && userInfoMo39816j.meetAgain) ? "1" : "0"));
        if (gra.m131606N3() && NullChecker.m82486a(userInfoMo39816j)) {
            for (Map.Entry<String, String> entry : userInfoMo39816j.trackMap.entrySet()) {
                arrayListM147507f0.add(sfj0.C20032a.m185615h(entry.getKey(), entry.getValue()));
            }
        }
        sfj0.m185596c(MatchScData.ModuleId.mid_e_card, this.f22622I.pageId(), (sfj0.C20032a[]) arrayListM147507f0.toArray(new sfj0.C20032a[0]));
        if (xqlVar.mo37953z()) {
            sfj0.m185596c("e_moment", this.f22622I.pageId(), sfj0.C20032a.m185615h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56856id : "0"), sfj0.C20032a.m185615h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0"));
        }
        pci.m171689y(true);
        m38151E6((wj90.m206622e(m38128A2().mo39821o().m140259d()) && NullChecker.m82486a(userInfoMo39816j) && NullChecker.m82486a(userInfoMo39816j.cityCData)) ? "from_city_center_conv_banner" : "home_card", act().color(c9c0.f80365P1));
        HashMap map = new HashMap();
        map.put("Action", "More user info");
        x95.INSTANCE.m209793m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u6 */
    public void m38368u6(String str, String str2, String str3, int i2, int i3, Figure figure, double d2, final x20 x20Var) {
        x20 x20Var2 = new x20() { // from class: l.z340
            @Override // p153l.x20
            public final void call() {
                this.f202782a.m38347q5(x20Var);
            }
        };
        if (!ige0.m139914a(CoreModule.f18264c.f20381e0.m116600p9()) || !NullChecker.m82486a(figure) || !TEnum.equals(figure.type, "distance") || figure.total <= 0) {
            act().m40827m7(str2, str, figure, str3, d2, x20Var2);
        } else {
            act().m40827m7(e1b.m118944B0(act(), i3, i2, figure), str, figure, str3, d2, x20Var2);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public b240 m38369v2() {
        return this.f22624J;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m38370v3() {
        if (gra.m131606N3()) {
            this.f22635O0 = new HomeCardTopNameViewBar(act());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            this.f22635O0.setLayoutParams(layoutParams);
            bnl0.m105524M(this.f22635O0, false);
            this.f22664d.addView(this.f22635O0);
            this.f22635O0.bringToFront();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Unit m38371v4(Long l2) {
        m38245V5(2);
        return null;
    }

    /* JADX INFO: renamed from: v5 */
    public void m38372v5(boolean z) {
        this.f22690p0 = z;
        if (z && NullChecker.m82486a(act())) {
            m38210P5();
            hkl0.m135638a(act().getWindow().getDecorView(), false);
        }
        if (!z && bnl0.m105529O0(m38300h2())) {
            m38212Q1();
        }
        if (this.f22690p0 && NullChecker.m82486a(m38128A2()) && NullChecker.m82486a(m38128A2().mo39812d()) && (m38128A2().mo39812d() instanceof q7m)) {
            ((q7m) m38128A2().mo39812d()).mo37809C();
        }
        if (this.f22690p0 && d79.m114675e0()) {
            haw.INSTANCE.m134320a().m134310r1();
        }
        if (!this.f22690p0) {
            CoreModule.f18264c.f20292A1.m102936t3(this.f22620H, new Function1() { // from class: l.c540
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC8017b.m38041R0((IntlMarketConfigEnvelope) obj);
                }
            });
        }
        if (z) {
            return;
        }
        m38205O6();
        m38200O1();
    }

    /* JADX INFO: renamed from: v6 */
    public void m38373v6() {
        if (m38168I3()) {
            return;
        }
        this.f22625J0.getSuperLikeRemaining().setText(String.valueOf(a5i0.m96175v0()));
        z5h0.m218675j();
        z5h0.m218663G(this.f22620H, m38147E2(), this.f22625J0.getSuperLikeRemaining());
    }

    /* JADX INFO: renamed from: w2 */
    public View m38374w2() {
        if (gra.m131606N3()) {
            return this.f22625J0.getUndo().getRealView();
        }
        if (wi5.m206550d().m206552e()) {
            wi5.m206550d().f189337b = false;
        }
        return this.f22625J0.getUndo().getRealView();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Unit m38376w4() {
        m38245V5(1);
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public void m38377w5() {
        m38310j3();
        pqn pqnVar = this.f22626K;
        if (pqnVar != null) {
            pqnVar.m173372m();
        }
    }

    /* JADX INFO: renamed from: w6 */
    public void m38378w6(boolean z) {
        if (m38142D2().getScaleY() == 1.0f && m38323m2()) {
            if (gra.m131654Z2() && CoreModule.f18264c.f20446z2.m31253r3()) {
                return;
            }
            z5h0.m218675j().m218697v();
            if (!m38158G3()) {
                z5h0.m218675j().m218700y(m38328n2(this.f22622I), this.f22622I, m38142D2(), z);
            }
            if (m38235U1(this.f22622I)) {
                return;
            }
            m38160G5(true);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m38379x3() {
        this.f22627K0 = (HomeViewUSLayout) this.f22700u.inflate();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m38380x4(View view) {
        i4g0.m138520r("e_same_entrance", "p_suggest_users_home_view");
        C8574a.INSTANCE.m48068f(this.f22620H, true);
    }

    /* JADX INFO: renamed from: x5 */
    public void m38381x5() {
        if (NullChecker.m82486a(this.f22625J0.getButtonsRightLayout())) {
            bnl0.m105524M(this.f22625J0.getButtonsRightLayout(), false);
            if (NullChecker.m82486a(this.f22633N0)) {
                bnl0.m105524M(this.f22633N0, false);
            }
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final void m38382x6() {
        if (!NullChecker.m82486a(m38128A2().mo39821o()) || !NullChecker.m82486a(m38128A2().mo39821o().m140259d()) || !spl0.m187375a0() || CoreModule.f18264c.f20381e0.m116549c8() || CoreModule.f18264c.f20381e0.m116593na().isJailed() || a5i0.m96175v0() <= 0 || p6d0.m170847d0().f150820m.contains(m38128A2().mo39821o().m140259d().f56859id) || !p6d0.m170847d0().m170852g0()) {
            return;
        }
        m38373v6();
        p6d0.m170847d0().f150820m.add(m38128A2().mo39821o().m140259d().f56859id);
        p6d0.m170847d0().m170857m0();
    }

    /* JADX INFO: renamed from: y2 */
    public Runnable m38383y2() {
        return this.f22636P;
    }

    /* JADX INFO: renamed from: y3 */
    public void m38384y3() {
        final f1g0 f1g0VarM38128A2 = m38128A2();
        m38286e3();
        m38375w3(f1g0VarM38128A2);
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f22627K0)) {
            this.f22627K0.f23627b.setOnClickListener(new View.OnClickListener() { // from class: l.n240
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139810a.m38186L4(f1g0VarM38128A2, view);
                }
            });
            this.f22627K0.f23628c.setOnClickListener(new View.OnClickListener() { // from class: l.z240
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202629a.m38192M4(f1g0VarM38128A2, view);
                }
            });
            bnl0.m105525M0(this.f22627K0.f23651z, true);
            bnl0.m105505C0(m38319l2(), 0);
            bnl0.m105558h0(this.f22664d, 0);
            bnl0.m105525M0(this.f22627K0.f23626a, true);
            if (gra.m131606N3()) {
                f1g0VarM38128A2.setUsHomeExpandCardAnimHelper(new hqj0(act(), f1g0VarM38128A2, this.f22662c));
            } else {
                fqj0 fqj0Var = new fqj0(act(), f1g0VarM38128A2, this.f22662c);
                this.f22644T = fqj0Var;
                f1g0VarM38128A2.setUsHomeCardAnimHelper(fqj0Var);
            }
            bnl0.m105509E0(this.f22627K0.f23622C, new View.OnClickListener() { // from class: l.b340
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.m38087l(f1g0VarM38128A2, view);
                }
            });
            bnl0.m105509E0(this.f22627K0.f23621B, new View.OnClickListener() { // from class: l.c340
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.m38074f1(f1g0VarM38128A2, view);
                }
            });
            bnl0.m105509E0(this.f22627K0.f23623D, new View.OnClickListener() { // from class: l.d340
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84851a.m38197N4(view);
                }
            });
            bnl0.m105509E0(this.f22627K0.f23624E, new View.OnClickListener() { // from class: l.e340
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91923a.m38203O4(view);
                }
            });
            this.f22627K0.f23621B.setLongPressingListener(new f());
        } else {
            this.f22625J0.getButtonRootLayout().setClipChildren(false);
            this.f22625J0.getButtonRootLayout().setClipToPadding(false);
        }
        if (!pgj.m172246c() && IntlCountryCodeController.m29118o()) {
            m38265a2();
            if (nmp.m163836e()) {
                m38280d2();
            }
        } else {
            m38280d2();
        }
        if (!IntlCountryCodeController.m29123t()) {
            act().duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20325L1.m105881d3().onBackpressureLatest().observeOn(fo0.m126432a()), CoreModule.f18264c.f20292A1.m102931l3().onBackpressureLatest().observeOn(fo0.m126432a()), this.f22642S.asObservable().filter(new qcj() { // from class: l.f340
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f96948a.m38129A4((Boolean) obj);
                }
            }), new scj() { // from class: l.h340
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return pf60.m172085a(Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue()), (Boolean) obj3);
                }
            })).filter(new qcj() { // from class: l.i340
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f112687a.m38134B4((pf60) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.j340
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118150a.m38139C4((pf60) obj);
                }
            }, new y20() { // from class: l.o240
                @Override // p153l.y20
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.m38089l1((Throwable) obj);
                }
            }));
            act().duringCreated(CoreModule.f18264c.f20292A1.m102929j3()).filter(new qcj() { // from class: l.p240
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f150240a.m38144D4((Boolean) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.q240
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155281a.m38149E4((Boolean) obj);
                }
            }, new y20() { // from class: l.r240
                @Override // p153l.y20
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC8017b.m38046U((Throwable) obj);
                }
            }));
        }
        m38056Y2();
        this.f22634O = act().color(c9c0.f80342I);
        this.f22630M = new C8094c(this.f22624J, this);
        if (gra.m131606N3()) {
            m38270b2(this.f22630M);
        }
        f1g0VarM38128A2.setAdapter(this.f22630M);
        m38350r2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.s240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165861a.m38154F4(f1g0VarM38128A2, view);
            }
        });
        m38334o2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.t240
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171717a.m38159G4(f1g0VarM38128A2, view);
            }
        });
        View realView = m38350r2().getRealView();
        n nVar = new n();
        this.f22606B1 = nVar;
        realView.setOnTouchListener(nVar);
        View realView2 = m38334o2().getRealView();
        n nVar2 = new n();
        this.f22608C1 = nVar2;
        realView2.setOnTouchListener(nVar2);
        this.f22657Z0 = dmk0.m116962a(500, new y20() { // from class: l.u240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177179a.m38164H4(f1g0VarM38128A2, (xql) obj);
            }
        });
        f1g0VarM38128A2.mo39815i(new y20() { // from class: l.w240
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186870a.m38169I4(obj);
            }
        });
        f1g0VarM38128A2.mo39822p(new g(f1g0VarM38128A2));
        final b240 b240Var = this.f22624J;
        Objects.requireNonNull(b240Var);
        f1g0VarM38128A2.mo39814g(new pl50() { // from class: l.x240
            @Override // p153l.pl50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo145869a(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
                return b240Var.m102094y8(xqlVar, swipeDirection, z);
            }
        });
        asj0.m99931Z(m38355s2(), new x20() { // from class: l.y240
            @Override // p153l.x20
            public final void call() {
                this.f197177a.m38174J4();
            }
        });
        f1g0VarM38128A2.setAllowUpSwipe(true);
        m38374w2().setOnClickListener(new View.OnClickListener() { // from class: l.a340
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68270a.m38180K4(f1g0VarM38128A2, view);
            }
        });
        bnl0.m105556g0(this.f22646U.mo118286c());
        bnl0.m105542Z(this.f22660b);
        bnl0.m105542Z(this.f22662c);
        m38247W2();
        CoreBusinessModule.m30906m0().mo122551k(this);
        if (gra.m131550C2()) {
            if (this.f22625J0.getUndo() != null) {
                this.f22625J0.getUndo().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
            }
            this.f22625J0.getDislikeBtn().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
            this.f22625J0.getLikeBtn().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
            this.f22625J0.getSuperLike().setNormalStateLayerBackground(this.f22620H.drawable(this.f22625J0.getOperationBtnBg()));
        }
        m38340p3();
        m38291f3();
        if (d79.m114649H()) {
            m38261Z2();
        } else if (d79.m114651J()) {
            m38266a3();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m38385y4(View view) {
        CoreModule.f18276o.m132214d().mo34741Pa(getContext());
        i4g0.m138520r("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y5 */
    public void m38386y5() {
        if (NullChecker.m82486a(m38128A2())) {
            m38128A2().mo39809a();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public void m38387y6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C4499d.m21895l().m21907t(new C4496a(act()).m21852H(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m21875r(str2).m21848D(str).m21881x(qa00.m175859d(8.0f)).m21869k(Color.parseColor(str3)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21872o(C4496a.f16401P, qa00.m175859d(1.0f)).m21860b(3500L).m21874q(C4496a.f16401P | C4496a.f16399N), this.f22704w.f24688t);
    }

    /* JADX INFO: renamed from: z2 */
    public FrameLayout m38388z2() {
        return this.f22658a;
    }

    /* JADX INFO: renamed from: z3 */
    public final void m38389z3() {
        User userM140259d;
        if (!d79.m114651J() || this.f22627K0 == null || m38128A2() == null || m38128A2().mo39821o() == null || (userM140259d = m38128A2().mo39821o().m140259d()) == null) {
            return;
        }
        if ((m38128A2().mo39812d() instanceof VirtualCard) && ((VirtualCard) m38128A2().mo39812d()).getCardType() == VirtualCardType.IntlRecallMembershipCard) {
            vnb.m201946M(this.f22627K0.f23636k, false);
            vnb.m201946M(this.f22627K0.f23637l, false);
            return;
        }
        boolean zM39372r = HomeCardBottomOptButtons.m39372r(userM140259d);
        if (zM39372r) {
            String strM131227a = gp5.m131227a("home_card_us_compliment_btn");
            if (!TextUtils.isEmpty(strM131227a)) {
                gp5.m131232f(NullChecker.m82486a(this.f22622I) ? this.f22622I.pageId() : "p_suggest_users_home_view", strM131227a);
            }
        }
        vnb.m201946M(this.f22627K0.f23636k, !zM39372r);
        vnb.m201946M(this.f22627K0.f23637l, zM39372r);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m38390z4(View view) {
        i4g0.m138520r("e_suggest_tarot_entrance", "p_suggest_users_home_view");
        oli0.m168122a(this.f22620H);
    }

    /* JADX INFO: renamed from: z5 */
    public void m38391z5(ArrayList<Media> arrayList) {
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82487b(userM116600p9)) {
            this.f22620H.progress(R$string.f18632L5);
            Media media = arrayList.get(0);
            final User user = new User();
            user.pictures = new ArrayList();
            this.f22620H.duringCreated((C22421c) yb5.m214980I(jyb.m147507f0(media), "petPhoto").compose(psd0.m173592C())).map(new qcj() { // from class: l.c440
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC8017b.m38069e((List) obj);
                }
            }).map(new qcj() { // from class: l.n440
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC8017b.m38081j(userM116600p9, user, (Picture) obj);
                }
            }).flatMap(new qcj() { // from class: l.y440
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116620u9((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.j540
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118366a.m38214Q4((uxj0) obj);
                }
            }, new y20() { // from class: l.u540
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177578a.m38220R4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z6 */
    public void m38392z6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C4499d.m21895l().m21907t(new C4496a(act()).m21852H(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m21875r(str2).m21848D(str).m21881x(qa00.m175859d(8.0f)).m21869k(Color.parseColor(str3)).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21872o(C4496a.f16401P, qa00.m175859d(1.0f)).m21860b(3500L).m21874q(C4496a.f16401P | C4496a.f16399N), this.f22704w.f24688t);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: w3 */
    public final void m38375w3(f1g0 f1g0Var) {
    }
}
