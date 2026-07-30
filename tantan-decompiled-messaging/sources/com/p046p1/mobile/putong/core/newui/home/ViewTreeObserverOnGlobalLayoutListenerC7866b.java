package com.p046p1.mobile.putong.core.newui.home;

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
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.DraweeView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.admob.C4715a;
import com.p046p1.mobile.putong.core.api.C4730b;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreMemberProviderInterface;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedFakeProfileTitle;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardBottomOptButtons;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeViewUSLayout;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.opt.view.ProfileCardStackOpt;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.CardStackShadowView;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.C8275a;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.core.p053ui.campus.StudentInfoAct;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p046p1.mobile.putong.core.p053ui.likeminded.C8411a;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.HomeCardTopNameViewBar;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Squared;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.C16319da;
import p149l.a3v;
import p149l.a5m;
import p149l.a6j;
import p149l.abi;
import p149l.adi;
import p149l.adi0;
import p149l.al4;
import p149l.am4;
import p149l.az50;
import p149l.b7e0;
import p149l.baj;
import p149l.bo5;
import p149l.bt0;
import p149l.bx6;
import p149l.c3v;
import p149l.cfl0;
import p149l.chj0;
import p149l.cjl0;
import p149l.co5;
import p149l.cp60;
import p149l.d30;
import p149l.d5m;
import p149l.d8e0;
import p149l.d90;
import p149l.dbl0;
import p149l.dd80;
import p149l.dm3;
import p149l.du2;
import p149l.e16;
import p149l.e30;
import p149l.e3v;
import p149l.e51;
import p149l.e5l;
import p149l.e5m;
import p149l.ebe0;
import p149l.ehj0;
import p149l.eor;
import p149l.ezc0;
import p149l.f6c0;
import p149l.fap;
import p149l.fdi;
import p149l.g6a;
import p149l.gb0;
import p149l.gei;
import p149l.gk8;
import p149l.gqf0;
import p149l.gvw;
import p149l.gx5;
import p149l.hdb0;
import p149l.hei0;
import p149l.hmb;
import p149l.id50;
import p149l.idr;
import p149l.ip20;
import p149l.iwg0;
import p149l.j760;
import p149l.j8w;
import p149l.jb0;
import p149l.ji50;
import p149l.jj4;
import p149l.jo0;
import p149l.jo5;
import p149l.jth0;
import p149l.jtk;
import p149l.juk;
import p149l.k1j;
import p149l.kol;
import p149l.l0t;
import p149l.lac0;
import p149l.lsi0;
import p149l.m8p;
import p149l.mah0;
import p149l.mdj0;
import p149l.mep0;
import p149l.mjj;
import p149l.mkd0;
import p149l.mol;
import p149l.mqi0;
import p149l.myc0;
import p149l.n3b0;
import p149l.ni50;
import p149l.nkp;
import p149l.nsl;
import p149l.nt30;
import p149l.o6j0;
import p149l.o7r;
import p149l.oci0;
import p149l.od2;
import p149l.ogl0;
import p149l.ool0;
import p149l.oql;
import p149l.osl;
import p149l.pcl0;
import p149l.pm10;
import p149l.pon;
import p149l.psl;
import p149l.psq;
import p149l.q8m;
import p149l.q8p;
import p149l.qff0;
import p149l.qgp0;
import p149l.qib0;
import p149l.qj20;
import p149l.qlm;
import p149l.qob0;
import p149l.qol0;
import p149l.qsh0;
import p149l.qsl;
import p149l.qx5;
import p149l.r200;
import p149l.roj0;
import p149l.rxg0;
import p149l.rza;
import p149l.s7m;
import p149l.s8l;
import p149l.sb90;
import p149l.sbp;
import p149l.snb0;
import p149l.swh0;
import p149l.sx30;
import p149l.t100;
import p149l.t9e0;
import p149l.twf;
import p149l.u0l;
import p149l.u4c0;
import p149l.u59;
import p149l.ubo;
import p149l.upa;
import p149l.uq40;
import p149l.ura;
import p149l.v4e;
import p149l.v930;
import p149l.v9j;
import p149l.va40;
import p149l.vdj;
import p149l.vwb;
import p149l.vxg0;
import p149l.w0c;
import p149l.w0c0;
import p149l.w4e;
import p149l.w73;
import p149l.w85;
import p149l.w9j;
import p149l.wc80;
import p149l.wh5;
import p149l.wp0;
import p149l.wpo;
import p149l.wsf0;
import p149l.x2c0;
import p149l.x4e;
import p149l.xck0;
import p149l.xdl0;
import p149l.xij0;
import p149l.xwb0;
import p149l.y8i0;
import p149l.y93;
import p149l.y9j;
import p149l.ya5;
import p149l.yd7;
import p149l.ygh0;
import p149l.yij0;
import p149l.ykf;
import p149l.yni;
import p149l.yor;
import p149l.z0c0;
import p149l.zbc0;
import p149l.zh40;
import p149l.zi0;
import p149l.znl;
import p149l.zo0;
import p149l.zq20;
import p149l.zvf0;
import p149l.zzc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b */
/* JADX INFO: loaded from: classes11.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC7866b implements s7m<nt30>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: H1 */
    public static boolean f21859H1 = true;

    /* JADX INFO: renamed from: I1 */
    public static n f21860I1 = new n();

    /* JADX INFO: renamed from: A */
    public VDraweeView f21861A;

    /* JADX INFO: renamed from: B */
    public HomeEmptyCardView f21863B;

    /* JADX INFO: renamed from: B1 */
    public n f21864B1;

    /* JADX INFO: renamed from: C */
    public HomeErrorNetView f21865C;

    /* JADX INFO: renamed from: C1 */
    public n f21866C1;

    /* JADX INFO: renamed from: D */
    public HomeErrorNetView f21867D;

    /* JADX INFO: renamed from: E */
    public VImage f21869E;

    /* JADX INFO: renamed from: E0 */
    public wsf0 f21870E0;

    /* JADX INFO: renamed from: F */
    public VText f21872F;

    /* JADX INFO: renamed from: F1 */
    public String f21874F1;

    /* JADX INFO: renamed from: G */
    public VButton f21875G;

    /* JADX INFO: renamed from: G1 */
    public int f21877G1;

    /* JADX INFO: renamed from: H */
    public final Act f21878H;

    /* JADX INFO: renamed from: H0 */
    public kol f21879H0;

    /* JADX INFO: renamed from: I */
    public final NewNewHomeFrag f21880I;

    /* JADX INFO: renamed from: I0 */
    public ProfileCardStackOpt f21881I0;

    /* JADX INFO: renamed from: J */
    public nt30 f21882J;

    /* JADX INFO: renamed from: J0 */
    public osl f21883J0;

    /* JADX INFO: renamed from: K */
    @Nullable
    public pon f21884K;

    /* JADX INFO: renamed from: K0 */
    public HomeViewUSLayout f21885K0;

    /* JADX INFO: renamed from: M */
    public C7943c f21888M;

    /* JADX INFO: renamed from: N */
    public String f21890N;

    /* JADX INFO: renamed from: N0 */
    public CardStackShadowView f21891N0;

    /* JADX INFO: renamed from: O */
    public int f21892O;

    /* JADX INFO: renamed from: O0 */
    public HomeCardTopNameViewBar f21893O0;

    /* JADX INFO: renamed from: T */
    public chj0 f21902T;

    /* JADX INFO: renamed from: U */
    public qsl f21904U;

    /* JADX INFO: renamed from: V */
    public Animator f21906V;

    /* JADX INFO: renamed from: W */
    public Animator f21908W;

    /* JADX INFO: renamed from: W0 */
    public iwg0 f21909W0;

    /* JADX INFO: renamed from: X0 */
    public ExpandedFakeProfileTitle f21911X0;

    /* JADX INFO: renamed from: Y */
    public boolean f21912Y;

    /* JADX INFO: renamed from: Y0 */
    public mdj0 f21913Y0;

    /* JADX INFO: renamed from: Z */
    public boolean f21914Z;

    /* JADX INFO: renamed from: Z0 */
    public e30 f21915Z0;

    /* JADX INFO: renamed from: a */
    public FrameLayout f21916a;

    /* JADX INFO: renamed from: a1 */
    public int f21917a1;

    /* JADX INFO: renamed from: b */
    public View f21918b;

    /* JADX INFO: renamed from: b1 */
    public int f21919b1;

    /* JADX INFO: renamed from: c */
    public VFrame f21920c;

    /* JADX INFO: renamed from: c1 */
    public ebe0 f21921c1;

    /* JADX INFO: renamed from: d */
    public VFrame f21922d;

    /* JADX INFO: renamed from: d1 */
    public ji50 f21923d1;

    /* JADX INFO: renamed from: e */
    public VLinear f21924e;

    /* JADX INFO: renamed from: e1 */
    public ni50 f21925e1;

    /* JADX INFO: renamed from: f */
    public FrameLayout f21926f;

    /* JADX INFO: renamed from: f1 */
    public vxg0 f21927f1;

    /* JADX INFO: renamed from: g */
    public FrameLayout f21928g;

    /* JADX INFO: renamed from: g1 */
    public a6j f21929g1;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f21930h;

    /* JADX INFO: renamed from: h1 */
    public yor f21931h1;

    /* JADX INFO: renamed from: i */
    public AppCompatImageView f21932i;

    /* JADX INFO: renamed from: i1 */
    public qlm f21933i1;

    /* JADX INFO: renamed from: j */
    public VFrame_Squared f21934j;

    /* JADX INFO: renamed from: j1 */
    public twf f21935j1;

    /* JADX INFO: renamed from: k */
    public VDraweeView f21936k;

    /* JADX INFO: renamed from: k0 */
    public boolean f21937k0;

    /* JADX INFO: renamed from: k1 */
    public cfl0 f21938k1;

    /* JADX INFO: renamed from: l */
    public HomeEmptyCardView f21939l;

    /* JADX INFO: renamed from: l1 */
    public b7e0 f21940l1;

    /* JADX INFO: renamed from: m */
    public HomeErrorNetView f21941m;

    /* JADX INFO: renamed from: m1 */
    public C4715a f21942m1;

    /* JADX INFO: renamed from: n */
    public HomeErrorNetView f21943n;

    /* JADX INFO: renamed from: n1 */
    public r200 f21944n1;

    /* JADX INFO: renamed from: o */
    public VImage f21945o;

    /* JADX INFO: renamed from: o1 */
    public gqf0 f21946o1;

    /* JADX INFO: renamed from: p */
    public VText f21947p;

    /* JADX INFO: renamed from: p0 */
    public boolean f21948p0;

    /* JADX INFO: renamed from: p1 */
    public snb0 f21949p1;

    /* JADX INFO: renamed from: q */
    public VButton f21950q;

    /* JADX INFO: renamed from: q1 */
    public s8l f21951q1;

    /* JADX INFO: renamed from: r */
    public SceneView f21952r;

    /* JADX INFO: renamed from: r1 */
    public w73 f21953r1;

    /* JADX INFO: renamed from: s */
    public VText f21954s;

    /* JADX INFO: renamed from: s1 */
    public q8m f21955s1;

    /* JADX INFO: renamed from: t */
    public ViewStub f21956t;

    /* JADX INFO: renamed from: t1 */
    public fdi f21957t1;

    /* JADX INFO: renamed from: u */
    public ViewStub f21958u;

    /* JADX INFO: renamed from: u1 */
    public adi f21959u1;

    /* JADX INFO: renamed from: v */
    public FrameLayout f21960v;

    /* JADX INFO: renamed from: v1 */
    public t9e0 f21961v1;

    /* JADX INFO: renamed from: w */
    public HomeTitleLayout f21962w;

    /* JADX INFO: renamed from: w1 */
    public qob0 f21963w1;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f21964x;

    /* JADX INFO: renamed from: y */
    public AppCompatImageView f21966y;

    /* JADX INFO: renamed from: y1 */
    public Animator f21967y1;

    /* JADX INFO: renamed from: z */
    public VFrame_Squared f21968z;

    /* JADX INFO: renamed from: L */
    public final Runnable f21886L = new e();

    /* JADX INFO: renamed from: P */
    public final Runnable f21894P = null;

    /* JADX INFO: renamed from: Q */
    public Runnable f21896Q = null;

    /* JADX INFO: renamed from: R */
    public boolean f21898R = true;

    /* JADX INFO: renamed from: S */
    public C22392a<Boolean> f21900S = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: X */
    public boolean f21910X = false;

    /* JADX INFO: renamed from: F0 */
    public long f21873F0 = -1;

    /* JADX INFO: renamed from: G0 */
    public String f21876G0 = "empty";

    /* JADX INFO: renamed from: L0 */
    public String f21887L0 = "@@";

    /* JADX INFO: renamed from: M0 */
    public boolean f21889M0 = false;

    /* JADX INFO: renamed from: P0 */
    public final int f21895P0 = 0;

    /* JADX INFO: renamed from: Q0 */
    public final int f21897Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    public final int f21899R0 = 2;

    /* JADX INFO: renamed from: S0 */
    public final int f21901S0 = 3;

    /* JADX INFO: renamed from: T0 */
    public final int f21903T0 = 4;

    /* JADX INFO: renamed from: U0 */
    public final int f21905U0 = 5;

    /* JADX INFO: renamed from: V0 */
    public boolean f21907V0 = false;

    /* JADX INFO: renamed from: x1 */
    public boolean f21965x1 = true;

    /* JADX INFO: renamed from: z1 */
    public final Runnable f21969z1 = new j();

    /* JADX INFO: renamed from: A1 */
    public final u0l f21862A1 = new k();

    /* JADX INFO: renamed from: D1 */
    public final Runnable f21868D1 = new Runnable() { // from class: l.ot30
        @Override // java.lang.Runnable
        public final void run() {
            ViewTreeObserverOnGlobalLayoutListenerC7866b.m37061c();
        }
    };

    /* JADX INFO: renamed from: E1 */
    public final am4<znl> f21871E1 = new am4() { // from class: l.hu30
        @Override // p149l.am4
        /* JADX INFO: renamed from: d */
        public final Object mo97474d() {
            return this.f109511a.m37206P4();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$a */
    public class a implements w4e {
        public a() {
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            zi0.f203246a = false;
            ygh0.m214659R(ygh0.f198173h);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            zi0.f203246a = false;
            if (!uq40.m194983y(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21882J.f140350G.m132487l(Boolean.TRUE);
            }
            ygh0.m214660S(ygh0.f198173h);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            zi0.f203246a = true;
            ygh0.m214661T(ygh0.f198173h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$b */
    public class b implements v4e {
        public b() {
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            zi0.f203246a = false;
            if (!uq40.m194983y(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21882J.f140350G.m132487l(Boolean.TRUE);
            }
            ygh0.m214679f0(ygh0.f198173h);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            zi0.f203246a = false;
            ygh0.m214681g0(ygh0.f198173h, z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            zi0.f203246a = true;
            ygh0.m214683h0(ygh0.f198173h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$c */
    public class c implements oql {
        public c() {
        }

        @Override // p149l.oql
        /* JADX INFO: renamed from: B */
        public void mo37396B(int i, int i2, int i3, String str, int i4) {
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ViewTreeObserverOnGlobalLayoutListenerC7866b.this;
            if (i3 == 0) {
                viewTreeObserverOnGlobalLayoutListenerC7866b.f21909W0.mo55762a(true);
                return;
            }
            viewTreeObserverOnGlobalLayoutListenerC7866b.f21909W0.mo55762a(i == 0 && i4 == 0);
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b2 = ViewTreeObserverOnGlobalLayoutListenerC7866b.this;
            viewTreeObserverOnGlobalLayoutListenerC7866b2.m37142D5(i, i - viewTreeObserverOnGlobalLayoutListenerC7866b2.f21877G1, i2, i3, str);
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21877G1 = i;
            if (!TextUtils.equals(str, CoreSuggested.UserInfo.VIRTUAL_CARD) && !TextUtils.equals(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21874F1, str) && i > 10) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21874F1 = str;
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
                if (NullChecker.m81303a(userM169430Pa)) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21893O0.m52924h(userM169430Pa);
                }
            }
            if (!NullChecker.m81303a(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21883J0.getImmediatelyMatch()) || ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21883J0.getButtonScrolledDistance() <= 0) {
                return;
            }
            if (i > 5) {
                rxg0.m181577u();
                C4348d.m20896l().m20900k("bubble_odiamond_immediate_match_guide");
            }
            int iM186890d = t100.m186890d(20.0f);
            if ((i >= 5 || Math.abs(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21883J0.getButtonRootLayout().getTranslationY()) < ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21883J0.getButtonScrolledDistance() - 5) && i <= iM186890d && i > 5) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37379x6();
            }
        }

        @Override // p149l.oql
        /* JADX INFO: renamed from: c0 */
        public void mo37397c0(int i, int i2, int i3, int i4, View view) {
            if (ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21911X0 == null || ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21911X0.f22582a == null) {
                return;
            }
            if (i > 0) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21911X0.f22582a.m52948f(1.0f);
                return;
            }
            if (view == null || !view.isAttachedToWindow()) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21911X0.f22582a.m52948f(0.0f);
                return;
            }
            int iM186890d = t100.m186890d(44.0f);
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ViewTreeObserverOnGlobalLayoutListenerC7866b.this;
            if (i3 > iM186890d) {
                viewTreeObserverOnGlobalLayoutListenerC7866b.f21911X0.f22582a.m52948f(1.0f);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC7866b.f21911X0.f22582a.m52948f(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21973a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f21973a = iArr;
            try {
                iArr[VirtualCardType.BoostIntroCard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21973a[VirtualCardType.SuperlikeGuideCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21973a[VirtualCardType.UndoGuideCard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21973a[VirtualCardType.OnlineMatchBroadcastPeiLiaoCard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21973a[VirtualCardType.OnlineMatchBroadcastCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21973a[VirtualCardType.QuickAudioBroadcastCard.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21973a[VirtualCardType.AdCard.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21973a[VirtualCardType.LiveLivingCard.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21973a[VirtualCardType.LiveVoiceCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21973a[VirtualCardType.LiveVoiceNewCard.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21973a[VirtualCardType.LiveVoiceRoomCard.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21973a[VirtualCardType.LiveMultipleCard.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21973a[VirtualCardType.FreeTrialRealUser.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21973a[VirtualCardType.FreeTrialOnline.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21973a[VirtualCardType.FreeTrialPopular.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21973a[VirtualCardType.LiveActiveCard.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21973a[VirtualCardType.ImpressSignalCard.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21973a[VirtualCardType.FakeCard.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f21973a[VirtualCardType.IntlVipCard.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21973a[VirtualCardType.IntlSeeCard.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21973a[VirtualCardType.NativeAdViewCard.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21973a[VirtualCardType.MinBoostCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21973a[VirtualCardType.IntlFreeSpotlightCard.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21973a[VirtualCardType.IntlTextBuzzActiveCard.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f21973a[VirtualCardType.IntlVoiceBuzzActiveCard.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21973a[VirtualCardType.IntlVideoBuzzActiveCard.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21973a[VirtualCardType.IntlPartnerActiveCard.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f21973a[VirtualCardType.IntlRecallMembershipCard.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f21973a[VirtualCardType.SayHiADCard.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f21973a[VirtualCardType.BoostGuideCard.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f21973a[VirtualCardType.AudioQuickChatPartyInvitationCard.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f21973a[VirtualCardType.TextQuickChatPartyInvitationCard.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f21973a[VirtualCardType.MarryAdCard.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f21973a[VirtualCardType.ExpandedNewUserRightGuide.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f21973a[VirtualCardType.BarLoverGuideCard.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f21973a[VirtualCardType.FourSelectOneAdCard.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f21973a[VirtualCardType.DailySelectionAdCard.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f21973a[VirtualCardType.IceBreakQuestionOfflineCard.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f21973a[VirtualCardType.FemaleVipGuideCard.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f21973a[VirtualCardType.FemaleVerificationGuideCard.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f21973a[VirtualCardType.NewUserSeeMyself.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f21973a[VirtualCardType.QuestionOfNotVerify.ordinal()] = 42;
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
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ViewTreeObserverOnGlobalLayoutListenerC7866b.this;
            if (viewTreeObserverOnGlobalLayoutListenerC7866b.f21881I0 != null && viewTreeObserverOnGlobalLayoutListenerC7866b.m37168I6() == null) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21881I0.m38804E();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$f */
    public class f implements C8275a.d {

        /* JADX INFO: renamed from: a */
        public String f21975a;

        public f() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        /* JADX INFO: renamed from: a */
        public void mo37398a() {
            e51.m114745J(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1);
            this.f21975a = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37345q6(-1);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        public void release() {
            if (TextUtils.isEmpty(this.f21975a)) {
                return;
            }
            e51.m114743H(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$g */
    public class g implements VSwipeStack.InterfaceC4767c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ wsf0 f21977a;

        public g(wsf0 wsf0Var) {
            this.f21977a = wsf0Var;
        }

        @Override // com.p046p1.mobile.putong.core.card.VSwipeStack.InterfaceC4767c
        /* JADX INFO: renamed from: b */
        public void mo35197b(boolean z, float f, CardProgressAction cardProgressAction) {
            if (NullChecker.m81303a(this.f21977a.mo38809d())) {
                if (f <= 0.0f) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37134C2().mo38422c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37347r2().mo38422c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37331o2().mo38421a(-f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21912Y = true;
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21914Z = false;
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21937k0 = false;
                    return;
                }
                ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = ViewTreeObserverOnGlobalLayoutListenerC7866b.this;
                if (z) {
                    viewTreeObserverOnGlobalLayoutListenerC7866b.m37134C2().mo38422c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37331o2().mo38422c(cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37347r2().mo38421a(f, cardProgressAction);
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21914Z = true;
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21912Y = false;
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21937k0 = false;
                    return;
                }
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37347r2().mo38422c(cardProgressAction);
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37331o2().mo38422c(cardProgressAction);
                if (!upa.m194809r1() || !NullChecker.m81303a(this.f21977a.mo38813j()) || !this.f21977a.mo38813j().meetAgain) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37134C2().mo38421a(f, cardProgressAction);
                }
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21912Y = false;
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21914Z = false;
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21937k0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$h */
    public class h implements C8275a.d {

        /* JADX INFO: renamed from: a */
        public String f21979a;

        public h() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        /* JADX INFO: renamed from: a */
        public void mo37398a() {
            e51.m114745J(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1);
            this.f21979a = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37345q6(-1);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        public void release() {
            if (TextUtils.isEmpty(this.f21979a)) {
                return;
            }
            e51.m114743H(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1, 1000L);
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
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21904U.mo126601l().stepToFrame(1.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$j */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21863B.m36667v();
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37173J6();
            if (NullChecker.m81303a(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21967y1) && ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21967y1.isRunning()) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21967y1.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$k */
    public class k extends u0l {
        public k() {
        }

        @Override // p149l.u0l, java.lang.Runnable
        public void run() {
            xdl0.m208345M0(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21964x, true);
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37173J6();
            xdl0.m208345M0(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21922d, true);
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37196N6(true);
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37191M6(false);
            if (!ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37359t5()) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37212Q5(false);
            }
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21967y1.start();
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21879H0.mo39113b();
            View viewFindViewWithTag = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37385z2().findViewWithTag(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37134C2().getRealView().getTag() + "child");
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37385z2().removeView(viewFindViewWithTag);
            }
            ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37186M1(false);
            if (IntlCountryCodeController.m28126v()) {
                if (NullChecker.m81303a(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37149F2())) {
                    xdl0.m208344M(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37149F2(), false);
                }
                if (NullChecker.m81303a(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37164I2())) {
                    xdl0.m208344M(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37164I2(), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$l */
    public class l implements CardOperationButton.InterfaceC8049b {

        /* JADX INFO: renamed from: a */
        public String f21984a;

        public l() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: a */
        public void mo37399a() {
            e51.m114745J(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1);
            jj4 jj4VarMo38818o = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21870E0.mo38818o();
            if (upa.m194809r1() && NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141746e()) && jj4VarMo38818o.m141746e().meetAgain) {
                return;
            }
            this.f21984a = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.m37345q6(-1);
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: b */
        public void mo37400b() {
            jj4 jj4VarMo38818o = ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21870E0.mo38818o();
            if ((upa.m194809r1() && NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141746e()) && jj4VarMo38818o.m141746e().meetAgain) || TextUtils.isEmpty(this.f21984a)) {
                return;
            }
            e51.m114743H(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21868D1, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$m */
    public class m implements x4e {
        public m() {
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            zi0.f203246a = false;
            if (!uq40.m194983y(ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21878H, true)) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.this.f21882J.f140350G.m132487l(Boolean.TRUE);
            }
            ygh0.m214665X(ygh0.f198173h);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            zi0.f203246a = false;
            ygh0.m214666Y(ygh0.f198173h);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            zi0.f203246a = true;
            ygh0.m214667Z(ygh0.f198173h);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.b$n */
    public static class n implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f21987c = zbc0.m217835a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f21988a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22543a f21989b;

        public n() {
            VLinear.C22543a c22543a = new VLinear.C22543a();
            this.f21989b = c22543a;
            c22543a.m223064c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f21988a <= f21987c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f21988a + 1;
                    this.f21988a = i;
                    if (i > f21987c) {
                        j760<Boolean, Boolean> j760VarM223063b = this.f21989b.m223063b();
                        C4759y.f20138Q = j760VarM223063b.f116564a.booleanValue();
                        C4759y.f20139R = j760VarM223063b.f116565b.booleanValue();
                    }
                }
                this.f21989b.m223062a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m114834c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m114834c(false);
            }
            return false;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC7866b(Act act, NewNewHomeFrag newNewHomeFrag, mdj0 mdj0Var) {
        this.f21878H = act;
        this.f21880I = newNewHomeFrag;
        this.f21913Y0 = mdj0Var;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m37027M(wsf0 wsf0Var, View view) {
        wsf0Var.mo38801A(SwipeDirection.UP);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "superlike"));
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m37029N(View view) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Unit m37038R0(IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m37043U(Throwable th) {
    }

    /* JADX INFO: renamed from: Y2 */
    private void m37053Y2() {
        m37302i2().setBackgroundResource(x2c0.f190442p);
        if (m37359t5()) {
            m37212Q5(true);
        }
        final BoostViewContainer boostViewContainerM37297h2 = m37297h2();
        boostViewContainerM37297h2.m43691b(new e30() { // from class: l.dw30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88137a.m37254Y3((View) obj);
            }
        }, new baj() { // from class: l.ew30
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f93427a.m37259Z3(boostViewContainerM37297h2, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM37297h2.setSceneView(this.f21952r);
        boostViewContainerM37297h2.setInterceptFunc(new v9j() { // from class: l.fw30
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f99607a.m37231T6());
            }
        });
        boostViewContainerM37297h2.m43690a(new y93() { // from class: l.gw30
            @Override // p149l.y93
            /* JADX INFO: renamed from: a */
            public final void mo123970a(int i2) {
                this.f104657a.m37269b4(boostViewContainerM37297h2, i2);
            }
        });
        m37302i2().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hw30
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f109719a.m37274c4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37061c() {
        C4348d.m20896l().m20900k("bubble_superlike_bubble");
        rxg0.m181577u();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Picture m37066e(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ void m37071f1(wsf0 wsf0Var, View view) {
        wsf0Var.mo38801A(SwipeDirection.UP);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "superlike"));
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ User m37078j(User user, User user2, Picture picture) {
        ArrayList arrayList = new ArrayList();
        picture.labels = arrayList;
        arrayList.add(cp60.INSTANCE.m108092h());
        Iterator<Media> it = user.pictures.iterator();
        while (it.hasNext()) {
            user2.pictures.add(it.next());
        }
        user2.pictures.add(1, picture);
        return user2;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m37084l(wsf0 wsf0Var, View view) {
        wsf0Var.mo38801A(SwipeDirection.RIGHT);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "like"));
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m37086l1(Throwable th) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m37090n(View view) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m37106t0(wsf0 wsf0Var, View view) {
        wsf0Var.mo38801A(SwipeDirection.RIGHT);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "like"));
        }
    }

    /* JADX INFO: renamed from: A2 */
    public wsf0 m37125A2() {
        return this.f21870E0;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ Boolean m37126A4(Boolean bool) {
        return Boolean.valueOf((bool.booleanValue() || this.f21889M0) ? false : true);
    }

    /* JADX INFO: renamed from: A5 */
    public void m37127A5() {
        this.f21882J.m161230i5();
        m37374w5();
        act().m39801Z5().m40012n0();
        m37197O1();
    }

    /* JADX INFO: renamed from: A6 */
    public void m37128A6(boolean z) {
        xdl0.m208344M(this.f21904U.getPosition(), z);
        if (lac0.m149136m()) {
            if (z && C16319da.INSTANCE.m110510k()) {
                xdl0.m208344M(this.f21904U.getPosition(), false);
            }
            lac0.m149134i().m149144p(z);
        }
        this.f21882J.f140397p.m132487l(Boolean.valueOf(z));
    }

    @Nullable
    /* JADX INFO: renamed from: B2 */
    public final View m37129B2() {
        if (!IntlCountryCodeController.m28126v()) {
            return this.f21883J0.getSuperLike().getRealView();
        }
        if (NullChecker.m81303a(this.f21885K0)) {
            return this.f21885K0.f22879B;
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public boolean m37130B3() {
        return NullChecker.m81303a(this.f21883J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m37131B4(j760 j760Var) {
        return Boolean.valueOf(!this.f21889M0);
    }

    /* JADX INFO: renamed from: B5 */
    public void m37132B5() {
        if (this.f21900S.m221515e().booleanValue()) {
            this.f21967y1.start();
        }
    }

    /* JADX INFO: renamed from: B6 */
    public void m37133B6(long j2) {
        if (m37154G2() != null && CoreModule.f17545c.m31484o3().undoLimit.remainToday() > 0) {
            String string = act().getString(R$string.f18403bp, String.valueOf(CoreModule.f17545c.m31484o3().undoLimit.remainToday()));
            C4345a c4345a = new C4345a(act());
            C4348d.m20896l().m20900k("bubble_undo_remaining");
            c4345a.m20847B(t100.m186890d(2.0f)).m20849D(string).m20870k(Color.parseColor("#ffbb00")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20882x(t100.m186890d(-4.0f)).m20861b(j2).m20875q(C4345a.f15683Q);
            C4348d.m20896l().m20909u(c4345a, m37154G2().getRealView(), "bubble_undo_remaining");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f21878H;
    }

    /* JADX INFO: renamed from: C2 */
    public nsl m37134C2() {
        return this.f21883J0.getSuperLike();
    }

    /* JADX INFO: renamed from: C3 */
    public boolean m37135C3() {
        return this.f21948p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m37136C4(j760 j760Var) {
        if (!((Boolean) j760Var.f116564a).booleanValue() || ((Boolean) j760Var.f116565b).booleanValue() || !NullChecker.m81303a(this.f21967y1) || this.f21967y1.isRunning()) {
            return;
        }
        this.f21889M0 = true;
        m37362u3();
        m37332o3();
        m37342q3(0);
        m37342q3(1);
        m37342q3(2);
        m37342q3(3);
        m37342q3(4);
        m37342q3(5);
    }

    /* JADX INFO: renamed from: C5 */
    public void m37137C5() {
        abi.m95650y(true);
        this.f21967y1.cancel();
        if (u59.m191823d0()) {
            j8w.INSTANCE.m140473a().m140463r1();
        }
    }

    /* JADX INFO: renamed from: C6 */
    public void m37138C6() {
        act().dialog().m20530Z(17).m20533c0(x2c0.f190218ht).m20503E0(R$string.f17687E0).m20500D(R$string.f17837J0).m20559v().m20551r(Color.parseColor("#00000000")).m20496B(false).m20564x0(act().getResources().getDrawable(x2c0.f190755yo)).m20560v0(act().getString(R$string.f17717F0), new Runnable() { // from class: l.qx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f156805a.m37350r5();
            }
        }).m20567z().show();
    }

    /* JADX INFO: renamed from: D2 */
    public View m37139D2() {
        return this.f21883J0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: D3 */
    public final boolean m37140D3() {
        return C7865a.INSTANCE.m36990c() && cp60.INSTANCE.m108102p(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ Boolean m37141D4(Boolean bool) {
        return Boolean.valueOf(this.f21889M0 && m37145E3());
    }

    /* JADX INFO: renamed from: D5 */
    public void m37142D5(int i2, int i3, int i4, int i5, String str) {
    }

    /* JADX INFO: renamed from: D6 */
    public void m37143D6(Intent intent) {
        this.f21880I.startActivity(intent);
    }

    /* JADX INFO: renamed from: E2 */
    public VFrame_FlipContainer m37144E2() {
        return this.f21883J0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: E3 */
    public final boolean m37145E3() {
        return C7865a.INSTANCE.m36995h() && ubo.INSTANCE.m192889j(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m37146E4(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.m208344M(this.f21904U.mo126601l(), false);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: E5 */
    public void m37147E5() {
        m37316l2().setVisibility(8);
        if (NullChecker.m81303a(this.f21891N0)) {
            xdl0.m208344M(this.f21891N0, false);
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
    public void m37148E6(String str, int i2) {
        if (m37125A2() == null || m37125A2().mo38809d() == null || m37125A2().mo38818o() == null || m37125A2().mo38818o().m141745d() == null) {
            return;
        }
        qj20 qj20Var = new qj20(this.f21871E1);
        User userM141745d = m37125A2().mo38818o().m141745d();
        sbp.m183249i(userM141745d.f56011id);
        Intent intentM50746z2 = ProfileAct.m50746z2(act(), userM141745d.f56011id, str, true, false, false);
        if (TextUtils.equals(userM141745d.f56011id, CoreModule.f17545c.f19642f0.f19868J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM50746z2.putExtra("profile_create_data", profileCreateData);
        }
        if (m37165I3()) {
            intentM50746z2.putExtra("long_time_no_see", true);
        }
        if ("from_city_center_conv_banner".equals(str) && NullChecker.m81303a(m37125A2().mo38813j())) {
            intentM50746z2.putExtra("city_centre_data", m37125A2().mo38813j().cityCData);
        }
        if (m37125A2().mo38807b() || upa.m194675N3()) {
            this.f21880I.startActivityForResult(intentM50746z2, 18);
        } else {
            this.f21880I.m20602v4(intentM50746z2, 18, qj20Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: F2 */
    public LinearLayout m37149F2() {
        HomeViewUSLayout homeViewUSLayout = this.f21885K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f22909z;
        }
        return null;
    }

    /* JADX INFO: renamed from: F3 */
    public boolean m37150F3() {
        return NullChecker.m81303a(this.f21883J0) && NullChecker.m81303a(this.f21883J0.getButtonsRightLayout()) && !xdl0.m208349O0(this.f21883J0.getButtonsRightLayout());
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m37151F4(wsf0 wsf0Var, View view) {
        String str = (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0";
        o6j0.m162859c("e_suggest_like_button", this.f21880I.pageId(), o6j0.C18854a.m162878h("other_user_id", str), o6j0.C18854a.m162878h("from_top_tab", ""));
        o6j0.m162859c(MatchScData.ModuleId.mid_e_likeButton, this.f21880I.pageId(), o6j0.C18854a.m162878h("moments_user_id", str), o6j0.C18854a.m162878h("from_top_tab", ""));
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "like"));
        }
        m37220S1(wsf0Var, "like");
        if (m37231T6()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.RIGHT, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: F5 */
    public void m37152F5() {
        m37316l2().setVisibility(0);
        if (NullChecker.m81303a(this.f21883J0.getButtonsRightLayout()) && !xdl0.m208349O0(this.f21883J0.getButtonsRightLayout())) {
            xdl0.m208344M(this.f21883J0.getButtonsRightLayout(), true);
        }
        if (NullChecker.m81303a(this.f21891N0)) {
            xdl0.m208344M(this.f21891N0, true);
        }
        m37219R6();
        m37386z3();
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
    public void m37153F6(String str, User user) {
        if (m37125A2() == null || m37125A2().mo38809d() == null || m37125A2().mo38818o() == null || m37125A2().mo38818o().m141745d() == null || user == null) {
            return;
        }
        Intent intentM50746z2 = ProfileAct.m50746z2(act(), user.f56011id, str, true, false, false);
        if (TextUtils.equals(user.f56011id, CoreModule.f17545c.f19642f0.f19868J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM50746z2.putExtra("profile_create_data", profileCreateData);
        }
        this.f21880I.startActivity(intentM50746z2);
    }

    /* JADX INFO: renamed from: G2 */
    public nsl m37154G2() {
        return this.f21883J0.getUndo();
    }

    /* JADX INFO: renamed from: G3 */
    public boolean m37155G3() {
        osl oslVar;
        return ogl0.m164228G() && (oslVar = this.f21883J0) != null && (oslVar instanceof ykf);
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m37156G4(wsf0 wsf0Var, View view) {
        String str = (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0";
        o6j0.m162859c("e_suggest_dislike_button", this.f21880I.pageId(), o6j0.C18854a.m162878h("other_user_id", str), o6j0.C18854a.m162878h("from_top_tab", ""));
        o6j0.m162859c("e_dislikeButton", this.f21880I.pageId(), o6j0.C18854a.m162878h("moments_user_id", str), o6j0.C18854a.m162878h("from_top_tab", ""));
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "dislike"));
        }
        m37220S1(wsf0Var, "dislike");
        if (m37231T6()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: G5 */
    public void m37157G5(boolean z) {
        this.f21883J0.setSuperLikeComboIsSlowly(z);
        xdl0.m208345M0(this.f21883J0.getSuperLikeComboSvga(), true);
    }

    /* JADX INFO: renamed from: G6 */
    public void m37158G6() {
        KeyEvent.Callback callbackMo38809d = m37125A2().mo38809d();
        if (NullChecker.m81303a(callbackMo38809d)) {
            if ((!(callbackMo38809d instanceof d5m) || ((d5m) callbackMo38809d).mo36902k0()) && !(callbackMo38809d instanceof e5m)) {
                return;
            }
            ((ViewGroup) this.f21878H.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.m208345M0(this.f21909W0.getRenderView(), false);
            this.f21883J0.getSuperLikeComboSvga().stopAnimation(true);
            xdl0.m208345M0(this.f21883J0.getSuperLikeComboSvga(), false);
        }
    }

    /* JADX INFO: renamed from: H2 */
    public View m37159H2() {
        return this.f21883J0.getUndoLayout();
    }

    /* JADX INFO: renamed from: H3 */
    public final boolean m37160H3() {
        if (!C7865a.INSTANCE.m36993f()) {
            return false;
        }
        cp60 cp60Var = cp60.INSTANCE;
        return cp60Var.m108097k() > 0 && cp60Var.m108102p(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: H5 */
    public void m37162H5() {
        if (this.f21881I0 == null) {
            return;
        }
        e51.m114745J(this.f21886L);
        e51.m114743H(act(), this.f21886L, 150L);
    }

    /* JADX INFO: renamed from: H6 */
    public final void m37163H6(boolean z) {
        if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
            lsi0.m151595y("只看认证用户试用期间无法使用超级喜欢功能");
            return;
        }
        if ((az50.INSTANCE.m99638r() || q8p.INSTANCE.m173449x()) && NullChecker.m81303a(m37125A2().mo38813j()) && m37125A2().mo38813j().isUserLikeMe()) {
            m37125A2().mo38801A(SwipeDirection.RIGHT);
            return;
        }
        o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, this.f21880I.pageId(), o6j0.C18854a.m162878h("moments_user_id", (!NullChecker.m81303a(m37125A2().mo38813j()) || m37125A2().mo38813j().isVirtualCard()) ? "0" : m37125A2().mo38813j().f19472id), o6j0.C18854a.m162879i("is_privileged", !n3b0.m157745t()), o6j0.C18854a.m162878h("showfrom_superlike", "home"), o6j0.C18854a.m162878h("from_top_tab", ""));
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "superlike"));
        }
        if (m37125A2() != null) {
            m37220S1(m37125A2(), "superlike");
        }
        if (m37231T6()) {
            return;
        }
        this.f21882J.m161238j9(true, z);
    }

    @Nullable
    /* JADX INFO: renamed from: I2 */
    public ConstraintLayout m37164I2() {
        HomeViewUSLayout homeViewUSLayout = this.f21885K0;
        if (homeViewUSLayout != null) {
            return homeViewUSLayout.f22884a;
        }
        return null;
    }

    /* JADX INFO: renamed from: I3 */
    public final boolean m37165I3() {
        return upa.m194809r1() && NullChecker.m81303a(this.f21870E0) && NullChecker.m81303a(this.f21870E0.mo38818o()) && NullChecker.m81303a(this.f21870E0.mo38818o().m141746e()) && this.f21870E0.mo38818o().m141746e().meetAgain;
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m37166I4(Object obj) {
        this.f21915Z0.call(obj);
    }

    /* JADX INFO: renamed from: I5 */
    public void m37167I5() {
        this.f21888M = null;
        this.f21900S.m132487l(Boolean.FALSE);
    }

    @Nullable
    /* JADX INFO: renamed from: I6 */
    public final String m37168I6() {
        NewNewHomeFrag newNewHomeFrag = this.f21880I;
        if (newNewHomeFrag == null) {
            return "homeFrag=null";
        }
        if (this.f21948p0) {
            return "vm.isHidden=true";
        }
        if (newNewHomeFrag.isHidden()) {
            return "homeFrag.isHidden()=true (eg other home sub-tab or not shown)";
        }
        if (v930.m197534h() != TabName.Card) {
            return "bottomTab=" + v930.m197534h() + " (need Card)";
        }
        if (!(this.f21880I.getParentFragment() instanceof psl)) {
            return "parent not IHomeLayoutFrag";
        }
        NewTanFragTag newTanFragTagMo38555T = ((psl) this.f21880I.getParentFragment()).mo38555T();
        if (newTanFragTagMo38555T == NewTanFragTag.HOME) {
            return null;
        }
        return "subTab=" + newTanFragTagMo38555T + " (need HOME)";
    }

    /* JADX INFO: renamed from: J1 */
    public View m37169J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sx30.m186399b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m37170J3() {
        return this.f21898R;
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m37171J4() {
        this.f21882J.m161093C8();
    }

    /* JADX INFO: renamed from: J5 */
    public void m37172J5() {
        VIcon vIconMo126593d = this.f21904U.mo126593d();
        CoreJustVerificationCardApi.JustRealStatus justRealStatusM30247j3 = CoreModule.f17545c.f19704z2.m30247j3();
        xdl0.m208344M(vIconMo126593d, true);
        if (justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.RUNNING || justRealStatusM30247j3 == CoreJustVerificationCardApi.JustRealStatus.CLICK_RUNNING) {
            vIconMo126593d.setImageResource(x2c0.f190043cd);
        } else {
            vIconMo126593d.setImageResource(x2c0.f190011bd);
        }
        xdl0.m208329E0(vIconMo126593d, new View.OnClickListener() { // from class: l.jw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120017a.m37223S4(view);
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public void m37173J6() {
        if (this.f21881I0 == null) {
            return;
        }
        this.f21881I0.m38805G((NullChecker.m81303a(this.f21964x) && this.f21964x.getVisibility() == 0) || (NullChecker.m81303a(this.f21863B) && this.f21863B.getVisibility() == 0) || (NullChecker.m81303a(this.f21865C) && this.f21865C.getVisibility() == 0));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
    public NewMainAct getAct() {
        return (NewMainAct) this.f21878H;
    }

    /* JADX INFO: renamed from: K2 */
    public final User m37175K2(NewNewHomeFrag newNewHomeFrag) {
        return (!m37232U1(newNewHomeFrag) && NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) ? m37125A2().mo38818o().m141745d() : m37325n2(newNewHomeFrag);
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m37176K3() {
        return this.f21900S.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m37177K4(wsf0 wsf0Var, View view) {
        if (upa.m194658K1() && CoreModule.f17545c.f19704z2.m30255r3()) {
            lsi0.m151595y("只看认证用户试用期间无法使用反悔功能");
            return;
        }
        o6j0.m162859c("e_undo_button", this.f21880I.pageId(), o6j0.C18854a.m162878h("moments_user_id", CoreModule.f17545c.f19663m0.m31142r8() == null ? "NA" : CoreModule.f17545c.f19663m0.m31142r8().f56011id), o6j0.C18854a.m162878h("from_top_tab", ""));
        m37220S1(wsf0Var, "undo");
        m37207P5();
        if (m37231T6()) {
            return;
        }
        if (!ezc0.m118907m0() || !CoreModule.m29932K().me_().isNewUserIn24H() || !ezc0.m118906i0().m118910f0()) {
            this.f21882J.m161233i9(false);
        } else {
            ezc0.m118906i0().m118914k0();
            ezc0.m118906i0().m118919r0(false);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m37178K5(boolean z) {
        if (z) {
            act().removeCallbacks(this.f21969z1);
            this.f21863B.setVisibility(8);
            this.f21863B.m36658m();
        } else {
            act().removeCallbacks(this.f21969z1);
            if (this.f21882J.m161245l6()) {
                this.f21882J.m161292w8();
            } else {
                act().postDelayed(this.f21969z1, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: K6 */
    public void m37179K6(View view) {
        e30 e30Var = this.f21915Z0;
        if (e30Var != null) {
            e30Var.call(view);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final void m37180L1(boolean z) {
        if (z) {
            m37297h2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m37311k2().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m37297h2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m37311k2().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: renamed from: L2 */
    public ool0 m37181L2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        switch (d.f21973a[virtualCardType.ordinal()]) {
            case 1:
                if (this.f21921c1 == null) {
                    this.f21921c1 = new ebe0(this.f21880I);
                }
                return this.f21921c1;
            case 2:
            case 3:
                if (this.f21927f1 == null) {
                    this.f21927f1 = new vxg0(this.f21880I);
                }
                return this.f21927f1;
            case 4:
                if (this.f21925e1 == null) {
                    this.f21925e1 = new ni50(this.f21880I);
                }
                return this.f21925e1;
            case 5:
                if (this.f21923d1 == null) {
                    this.f21923d1 = new ji50(this.f21880I);
                }
                return this.f21923d1;
            case 6:
                if (this.f21949p1 == null) {
                    this.f21949p1 = new snb0(this.f21880I);
                }
                return this.f21949p1;
            case 7:
                if (jb0.m140729g(userInfo)) {
                    return new jth0(this.f21880I);
                }
                if (jb0.m140728f(userInfo)) {
                    return new qsh0(this.f21880I);
                }
                boolean zM140726d = jb0.m140726d(userInfo);
                NewNewHomeFrag newNewHomeFrag = this.f21880I;
                return zM140726d ? new eor(newNewHomeFrag) : new gb0(newNewHomeFrag);
            case 8:
                return new l0t();
            case 9:
                return new a3v(this.f21880I, this.f21870E0);
            case 10:
                return new c3v(this.f21880I);
            case 11:
                return new e3v(this.f21880I);
            case 12:
                return new pm10();
            case 13:
            case 14:
            case 15:
                if (this.f21929g1 == null) {
                    this.f21929g1 = new a6j(this.f21880I);
                }
                return this.f21929g1;
            case 16:
                if (this.f21931h1 == null) {
                    this.f21931h1 = new yor(this.f21880I, userInfo.active);
                }
                return this.f21931h1;
            case 17:
                if (this.f21933i1 == null) {
                    this.f21933i1 = new qlm(this.f21880I);
                }
                return this.f21933i1;
            case 18:
                if (this.f21935j1 == null) {
                    this.f21935j1 = new twf(this.f21880I);
                }
                return this.f21935j1;
            case 19:
                if (this.f21938k1 == null) {
                    this.f21938k1 = new cfl0(this.f21880I, userInfo.active);
                }
                return this.f21938k1;
            case 20:
                if (this.f21940l1 == null) {
                    this.f21940l1 = new b7e0(this.f21880I, userInfo.active);
                }
                return this.f21940l1;
            case 21:
                if (!NullChecker.m81303a(this.f21942m1)) {
                    this.f21942m1 = new C4715a(this.f21880I);
                }
                return this.f21942m1;
            case 22:
                if (this.f21944n1 == null) {
                    this.f21944n1 = new r200(this.f21880I, userInfo.active);
                }
                return this.f21944n1;
            case 23:
                if (this.f21946o1 == null) {
                    this.f21946o1 = new gqf0(this.f21880I, userInfo.active);
                }
                return this.f21946o1;
            case 24:
            case 25:
            case 26:
                return new dm3(this.f21880I, userInfo.active);
            case 27:
                return new wpo(this.f21880I, userInfo.intlInsertCardData);
            case 28:
                return new m8p(this.f21880I, userInfo.intlInsertCardData);
            case 29:
                if (this.f21951q1 == null) {
                    this.f21951q1 = new s8l(this.f21880I);
                }
                return this.f21951q1;
            case 30:
                if (this.f21953r1 == null) {
                    this.f21953r1 = new w73(this.f21880I);
                }
                return this.f21953r1;
            case 31:
            case 32:
                return new xwb0(this.f21880I);
            case 33:
                return new gvw();
            case 34:
                return new zh40();
            case 35:
                return new od2(new Runnable() { // from class: l.aw30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72009a.m37240V3();
                    }
                });
            case 36:
                return new k1j();
            case 37:
                return new w0c();
            case 38:
                if (this.f21955s1 == null) {
                    this.f21955s1 = new q8m();
                }
                return this.f21955s1;
            case 39:
                if (this.f21957t1 == null) {
                    this.f21957t1 = new fdi(this.f21880I);
                }
                return this.f21957t1;
            case 40:
                if (this.f21959u1 == null) {
                    this.f21959u1 = new adi(this.f21880I);
                }
                return this.f21959u1;
            case 41:
                if (this.f21961v1 == null) {
                    this.f21961v1 = new t9e0(this.f21880I);
                }
                return this.f21961v1;
            case 42:
                if (this.f21963w1 == null) {
                    this.f21963w1 = new qob0(this.f21880I);
                }
                return this.f21963w1;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final boolean m37182L3() {
        return C7865a.INSTANCE.m36994g() && cp60.INSTANCE.m108102p(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m37183L4(wsf0 wsf0Var, View view) {
        m37179K6(wsf0Var.mo38809d());
    }

    /* JADX INFO: renamed from: L5 */
    public void m37184L5(boolean z, boolean z2) {
        m37190M5(z, z2, false);
    }

    /* JADX INFO: renamed from: L6 */
    public final void m37185L6(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM155944o = this.f21873F0 > 0 ? mqi0.m155944o() - this.f21873F0 : -1L;
        this.f21873F0 = mqi0.m155944o();
        o6j0.m162859c("e_card_click_interval", "p_suggest_users_home_view", o6j0.C18854a.m162878h("current_operation", str2), o6j0.C18854a.m162877g("operation_interval", jM155944o), o6j0.C18854a.m162878h("last_operation", this.f21876G0));
        this.f21876G0 = str2;
    }

    /* JADX INFO: renamed from: M1 */
    public final void m37186M1(boolean z) {
        View realView = m37347r2().getRealView();
        View realView2 = m37331o2().getRealView();
        View viewM37139D2 = m37139D2();
        View viewM37371w2 = m37371w2();
        BoostViewContainer boostViewContainerM37297h2 = m37297h2();
        View viewM37311k2 = m37311k2();
        View immediatelyMatch = this.f21883J0.getImmediatelyMatch();
        if (z) {
            realView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM37139D2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM37371w2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            realView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (g6a.m124563l() && !m37359t5()) {
                this.f21904U.mo126595f().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            rxg0.m181572j().f161457b.m132487l(roj0.f160388a);
            boostViewContainerM37297h2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            viewM37311k2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (u59.m191797F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            osl oslVar = this.f21883J0;
            if (oslVar instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons = (HomeCardBottomOptButtons) oslVar;
                homeCardBottomOptButtons.f22715o.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
                homeCardBottomOptButtons.f22714n.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
        } else {
            realView.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM37139D2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            viewM37371w2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            realView2.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            if (g6a.m124563l() && !m37359t5()) {
                this.f21904U.mo126595f().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            if (u59.m191797F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
            osl oslVar2 = this.f21883J0;
            if (oslVar2 instanceof HomeCardBottomOptButtons) {
                HomeCardBottomOptButtons homeCardBottomOptButtons2 = (HomeCardBottomOptButtons) oslVar2;
                homeCardBottomOptButtons2.f22715o.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
                homeCardBottomOptButtons2.f22714n.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            }
        }
        if (m37359t5()) {
            return;
        }
        m37180L1(z);
    }

    /* JADX INFO: renamed from: M2 */
    public void m37187M2() {
        String str;
        if (upa.m194824u1() && CoreModule.f17545c.f19639e0.f149464r6.get().booleanValue()) {
            str = ip20.f114252n;
            CoreModule.f17545c.f19639e0.f149457q6.put(Long.valueOf(mqi0.m155944o()));
        } else {
            str = null;
        }
        CoreModule.f17545c.f19639e0.f149464r6.put(Boolean.FALSE);
        m37192N2(str);
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m37188M3() {
        xdl0.m208344M(this.f21911X0, true);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m37189M4(wsf0 wsf0Var, View view) {
        m37179K6(wsf0Var.mo38809d());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:37:0x0120  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX INFO: renamed from: M5 */
    public void m37190M5(boolean z, boolean z2, boolean z3) {
        if (z) {
            nt30.f140336V0 = "";
        }
        m37178K5(z2);
        if (this.f21900S.m221515e().booleanValue() && !z) {
            e51.m114745J(this.f21862A1);
            yd7 yd7Var = CoreModule.f17545c.f19662l2;
            if (yd7Var.f197521R == 0) {
                yd7Var.f197521R = mqi0.m155944o();
            }
            xdl0.m208345M0(this.f21922d, true);
            m37191M6(true);
            m37212Q5(true);
            this.f21967y1.cancel();
            if (NullChecker.m81303a(this.f21964x)) {
                xdl0.m208345M0(this.f21964x, false);
                m37196N6(false);
            }
            m37186M1(true);
            if (IntlCountryCodeController.m28126v()) {
                if (!vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded) && C4730b.m31408b(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0).virtualCardType)) {
                    if (NullChecker.m81303a(m37149F2())) {
                        xdl0.m208344M(m37149F2(), false);
                    }
                    if (NullChecker.m81303a(m37164I2())) {
                        xdl0.m208344M(m37164I2(), false);
                    }
                } else if (vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded)) {
                    if (NullChecker.m81303a(m37149F2())) {
                        xdl0.m208344M(m37149F2(), true);
                    }
                    if (NullChecker.m81303a(m37164I2())) {
                        xdl0.m208344M(m37164I2(), true);
                    }
                } else {
                    CoreMemberProviderInterface coreMemberProviderInterfaceM195055b = ura.m195053e().m195055b();
                    CoreSuggested.UserInfo userInfo = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0);
                    C4732c c4732c = CoreModule.f17545c;
                    if (coreMemberProviderInterfaceM195055b.mo33648h9(userInfo, c4732c.f19639e0.m169430Pa(c4732c.f19663m0.m31137q6()))) {
                        if (NullChecker.m81303a(m37149F2())) {
                            xdl0.m208344M(m37149F2(), true);
                        }
                        if (NullChecker.m81303a(m37164I2())) {
                            xdl0.m208344M(m37164I2(), false);
                        }
                    } else {
                        if (NullChecker.m81303a(m37149F2())) {
                            xdl0.m208344M(m37149F2(), true);
                        }
                        if (NullChecker.m81303a(m37164I2())) {
                            xdl0.m208344M(m37164I2(), true);
                        }
                    }
                }
            }
        } else if (!this.f21900S.m221515e().booleanValue() && z) {
            this.f21862A1.m191342a(z2, false, false);
            if (z3) {
                e51.m114743H(act(), this.f21862A1, zo0.f204053f);
            } else {
                this.f21862A1.run();
            }
        }
        if (upa.m194675N3()) {
            m37266a6(!z);
            if (upa.m194723Z2() && !m37359t5()) {
                m37212Q5(!z);
            }
        }
        if (CoreModule.m29935P().m94651a().mo33543m7() && !m37359t5()) {
            xdl0.m208345M0(this.f21904U.mo126595f(), !z);
        }
        if (upa.m194736c3()) {
            xdl0.m208345M0(this.f21904U.mo126593d(), !z);
        }
        this.f21900S.m132487l(Boolean.valueOf(z));
        this.f21882J.f140356J = z2;
        m37225S6();
        m37173J6();
    }

    /* JADX INFO: renamed from: M6 */
    public final void m37191M6(boolean z) {
        HomeStatisticsHelper.m36689C(this.f21880I.getUserVisibleHint() && !this.f21880I.isHidden());
        if (z) {
            HomeStatisticsHelper.m36715u();
        } else {
            HomeStatisticsHelper.m36714t();
        }
    }

    /* JADX INFO: renamed from: N2 */
    public void m37192N2(String str) {
        m37207P5();
        CoreModule.f17545c.f19564F0.m99251r3();
        xdl0.m208344M(this.f21904U.mo126602m(), false);
        zq20.m219839d(act(), str);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m37193N3() {
        xdl0.m208344M(this.f21911X0, false);
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m37194N4(View view) {
        m37125A2().mo38801A(SwipeDirection.LEFT);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "dislike"));
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final void m37195N5(DoublePair doublePair, String str, String str2, List<MessageLocation> list) {
        MessageLocation messageLocation = new MessageLocation();
        messageLocation.coordinates = doublePair;
        messageLocation.name = str;
        messageLocation.address = str2;
        RoamedLocationData roamedLocationDataNew_ = RoamedLocationData.new_();
        list.add(0, messageLocation);
        roamedLocationDataNew_.data.addAll(list);
        CoreModule.f17545c.f19657k0.f20088R.m121229A(roamedLocationDataNew_);
        cjl0.m107179C0(act(), messageLocation, null);
    }

    /* JADX INFO: renamed from: N6 */
    public final void m37196N6(boolean z) {
        HomeStatisticsHelper.m36689C(this.f21880I.getUserVisibleHint() && !this.f21880I.isHidden());
        if (z) {
            HomeStatisticsHelper.m36717w();
        } else {
            HomeStatisticsHelper.m36716v();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m37197O1() {
        if (upa.m194675N3() && this.f21881I0 != null && m37168I6() == null) {
            m37173J6();
            m37162H5();
        }
    }

    /* JADX INFO: renamed from: O2, reason: merged with bridge method [inline-methods] */
    public void m37308j4() {
        Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m37199O3(String str) {
        if (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) {
            final User userM141745d = m37125A2().mo38818o().m141745d();
            C8455a.m47588w().m47610p(this.f21878H, userM141745d, str, new d30() { // from class: l.cx30
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19663m0.m30994E8(userM141745d.f56011id);
                }
            });
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m37200O4(View view) {
        m37213Q6();
    }

    /* JADX INFO: renamed from: O5 */
    public void m37201O5() {
        final wsf0 wsf0VarM37125A2 = m37125A2();
        xdl0.m208329E0(this.f21885K0.f22880C, new View.OnClickListener() { // from class: l.uw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.m37106t0(wsf0VarM37125A2, view);
            }
        });
        xdl0.m208329E0(this.f21885K0.f22879B, new View.OnClickListener() { // from class: l.ww30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.m37027M(wsf0VarM37125A2, view);
            }
        });
        xdl0.m208329E0(this.f21885K0.f22881D, new View.OnClickListener() { // from class: l.xw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194692a.m37229T4(view);
            }
        });
        xdl0.m208329E0(this.f21885K0.f22882E, new View.OnClickListener() { // from class: l.yw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200364a.m37235U4(view);
            }
        });
        this.f21885K0.f22879B.setLongPressingListener(new h());
        xdl0.m208329E0(this.f21885K0.f22878A, new View.OnClickListener() { // from class: l.zw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205137a.m37246W4(view);
            }
        });
        m37273c3();
    }

    /* JADX INFO: renamed from: O6 */
    public final void m37202O6() {
        if (CoreModule.f17557o.m195055b().mo33649wf() && NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38809d()) && (m37125A2().mo38809d() instanceof d5m)) {
            d5m d5mVar = (d5m) m37125A2().mo38809d();
            if (d5mVar.mo36876c()) {
                d5mVar.getIntlCommercialCardBottomActionLayout().m39180T();
            }
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nt30 nt30Var) {
        this.f21882J = nt30Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: P2 */
    public void m37204P2() {
        C4348d.m20896l().m20900k("bubble_superlike_bubble");
        rxg0.m181577u();
        if (m37233U2(" by hiddenBottomButtons s1 ")) {
            return;
        }
        m37147E5();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m37205P3(User user) {
        int showPictureIndexProxy = (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38809d()) && (m37125A2().mo38809d() instanceof mol)) ? ((mol) m37125A2().mo38809d()).getShowPictureIndexProxy() : 0;
        if (jo5.m142416b(this.f21878H, NullChecker.m81303a(m37125A2()) ? m37125A2().mo38813j() : null, user, "home_card_compliment_btn")) {
            return;
        }
        bo5.m102902m(this.f21878H, user, "home_card_compliment_btn", Integer.valueOf(showPictureIndexProxy), null, bo5.m102898i());
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ znl m37206P4() {
        if (!NullChecker.m81303a(m37125A2())) {
            return null;
        }
        KeyEvent.Callback callbackMo38809d = m37125A2().mo38809d();
        if (callbackMo38809d instanceof znl) {
            return (znl) callbackMo38809d;
        }
        return null;
    }

    /* JADX INFO: renamed from: P5 */
    public void m37207P5() {
        if (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38809d()) && (m37125A2().mo38809d() instanceof d5m)) {
            ((d5m) m37125A2().mo38809d()).mo36917p(true, false);
        }
    }

    /* JADX INFO: renamed from: P6 */
    public void m37208P6(boolean z) {
        xdl0.m208344M(this.f21954s, false);
        boolean z2 = this.f21910X;
        if (z) {
            if (z2) {
                this.f21910X = false;
                this.f21908W.start();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f21910X = true;
        this.f21906V.start();
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m37209Q1() {
        o6j0.m162864h("e_boost_button", this.f21880I.pageId(), o6j0.C18854a.m162879i("is_privileged", !swh0.m186269v()));
    }

    /* JADX INFO: renamed from: Q2 */
    public void m37210Q2() {
        if (NullChecker.m81303a(this.f21909W0) && xdl0.m208349O0(this.f21909W0.getRenderView())) {
            xdl0.m208344M(this.f21909W0.getRenderView(), false);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m37211Q4(roj0 roj0Var) {
        cp60 cp60Var = cp60.INSTANCE;
        cp60Var.m108095i0();
        this.f21878H.progressDismiss();
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(this.f21878H, o7r.m163037a(this.f21878H).inflate(f6c0.f95942p5, (ViewGroup) null)).m21171u("" + System.currentTimeMillis()).m21164B(3).m21169s();
        simplePushBubbleM21169s.m96808x(CorePopLevel.INTL_PET);
        hdb0.m130575c().m130582i(simplePushBubbleM21169s);
        cp60Var.m108110x().put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Q5 */
    public void m37212Q5(boolean z) {
        if (!z || (!vdj.m198001c() && n3b0.m157740o())) {
            xdl0.m208344M(m37297h2(), true);
            return;
        }
        if (!xdl0.m208349O0(m37297h2())) {
            m37209Q1();
        }
        xdl0.m208344M(m37297h2(), true);
    }

    /* JADX INFO: renamed from: Q6 */
    public void m37213Q6() {
        if (m37231T6()) {
            return;
        }
        if (!ezc0.m118907m0() || !CoreModule.m29932K().me_().isNewUserIn24H() || !ezc0.m118906i0().m118910f0()) {
            this.f21882J.m161233i9(false);
        } else {
            ezc0.m118906i0().m118914k0();
            ezc0.m118906i0().m118919r0(false);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m37214R1() {
        e51.m114745J(this.f21886L);
    }

    /* JADX INFO: renamed from: R2 */
    public void m37215R2() {
        if (IntlCountryCodeController.m28126v() && NullChecker.m81304b(this.f21885K0)) {
            xdl0.m208345M0(this.f21885K0.f22909z, false);
            xdl0.m208345M0(this.f21885K0.f22884a, false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m37216R3() {
        xdl0.m208344M(this.f21954s, false);
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m37217R4(Throwable th) {
        this.f21878H.progressDismiss();
    }

    /* JADX INFO: renamed from: R5 */
    public void m37218R5(boolean z) {
        act().m39807b7(z);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m37219R6() {
        try {
            if ((this.f21883J0 instanceof HomeCardBottomOptButtons) && NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) {
                ((HomeCardBottomOptButtons) this.f21883J0).m38381v(m37125A2().mo38818o().m141745d(), NullChecker.m81303a(this.f21880I) ? this.f21880I.pageId() : "p_suggest_users_home_view");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final void m37220S1(wsf0 wsf0Var, String str) {
        m37185L6(str);
        wsf0Var.m161386h(str);
    }

    /* JADX INFO: renamed from: S2 */
    public void m37221S2() {
        if (IntlCountryCodeController.m28126v() && NullChecker.m81304b(this.f21885K0)) {
            xdl0.m208345M0(this.f21885K0.f22884a, false);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m37222S3(View view) {
        m37163H6(false);
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m37223S4(View view) {
        psq.m171201Q(this.f21878H, true);
    }

    /* JADX INFO: renamed from: S5 */
    public final void m37224S5(int i2) {
        final String strM108086e;
        final boolean zBooleanValue = false;
        if (i2 == 0) {
            strM108086e = "core_intl_constellation_entrance_anim.svga";
        } else if (i2 == 1) {
            cp60 cp60Var = cp60.INSTANCE;
            zBooleanValue = cp60Var.m108110x().get().booleanValue();
            strM108086e = cp60Var.m108086e();
        } else if (i2 == 2) {
            qff0 qff0Var = qff0.INSTANCE;
            zBooleanValue = qff0Var.m174301m().get().booleanValue();
            strM108086e = qff0Var.m174294f();
        } else if (i2 == 3) {
            C8382b c8382b = C8382b.INSTANCE;
            zBooleanValue = c8382b.m46286h().get().booleanValue();
            strM108086e = c8382b.m46284f();
        } else if (i2 == 4) {
            ubo uboVar = ubo.INSTANCE;
            zBooleanValue = uboVar.m192891l();
            strM108086e = uboVar.m192886g();
        } else if (i2 != 5) {
            strM108086e = "";
        } else {
            wp0 wp0Var = wp0.INSTANCE;
            zBooleanValue = wp0Var.m204891m();
            strM108086e = wp0Var.m204886h();
        }
        if (TextUtils.isEmpty(strM108086e) || !NullChecker.m81303a(this.f21878H)) {
            return;
        }
        e51.m114741F(this.f21878H, new Runnable() { // from class: l.ax30
            @Override // java.lang.Runnable
            public final void run() {
                this.f72108a.m37251X4(zBooleanValue, strM108086e);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public final void m37225S6() {
        if (this.f21900S.m221515e().booleanValue()) {
            m37347r2().getRealView().setOnTouchListener(null);
            m37331o2().getRealView().setOnTouchListener(null);
            m37347r2().getRealView().setClickable(false);
            m37331o2().getRealView().setClickable(false);
            m37371w2().setClickable(false);
            m37134C2().getRealView().setClickable(false);
            return;
        }
        m37347r2().getRealView().setOnTouchListener(this.f21864B1);
        m37331o2().getRealView().setOnTouchListener(this.f21866C1);
        m37347r2().getRealView().setClickable(true);
        m37331o2().getRealView().setClickable(true);
        m37371w2().setClickable(true);
        m37134C2().getRealView().setClickable(true);
    }

    /* JADX INFO: renamed from: T1 */
    public void m37226T1(boolean z) {
        this.f21883J0.mo38371b(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: T2 */
    public void m37227T2() {
        if (upa.m194675N3()) {
            m37266a6(true);
        }
        m37125A2().setAllowUpSwipe(true);
        if (m37233U2(" by hidenLiveCardBottomButtons s1")) {
            return;
        }
        m37152F5();
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m37228T3(View view) {
        m37163H6(false);
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m37229T4(View view) {
        m37125A2().mo38801A(SwipeDirection.LEFT);
        if (upa.m194675N3()) {
            o6j0.m162859c("e_clone_ui_swipe", "p_suggest_users_home_view", o6j0.C18854a.m162878h("clone_swipe_scene", ExpandedCardStyleHelper.m38090o().m38103s() ? "profile" : "card"), o6j0.C18854a.m162878h("actionname", "dislike"));
        }
    }

    /* JADX INFO: renamed from: T5 */
    public final void m37230T5(String str) {
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
        }
        SVGALoader.with(this.f21878H).from(str).loadCallback(new i()).into(this.f21904U.mo126601l());
    }

    /* JADX INFO: renamed from: T6 */
    public boolean m37231T6() {
        return m37125A2().mo38809d() == null;
    }

    /* JADX INFO: renamed from: U1 */
    public final boolean m37232U1(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo38813j = newNewHomeFrag.f21678C.m37125A2().mo38813j();
        if (NullChecker.m81303a(userInfoMo38813j)) {
            return TextUtils.equals(userInfoMo38813j.f19472id, CoreSuggested.UserInfo.VIRTUAL_CARD);
        }
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public boolean m37233U2(String str) {
        if (IntlCountryCodeController.m28126v() && ura.m195053e().m195055b().mo33649wf() && m37125A2() != null && (m37125A2().mo38809d() instanceof a5m)) {
            if (ura.m195053e().m195055b().mo33648h9(((a5m) m37125A2().mo38809d()).getUserInfoProxy(), m37125A2().mo38818o().m141745d())) {
                CoreModule.f17545c.f19663m0.f19432m2.m132487l(roj0.f160388a);
                return true;
            }
            if (!vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded) && !C4730b.m31408b(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.get(0).virtualCardType)) {
                CoreModule.f17545c.f19663m0.f19435n2.m132487l(roj0.f160388a);
            }
        }
        CardButtonsShowAndHideType cardButtonsShowAndHideTypeM37281d6 = m37281d6();
        if (!TEnum.equals(cardButtonsShowAndHideTypeM37281d6, "show") && !TEnum.equals(cardButtonsShowAndHideTypeM37281d6, "hide") && !TEnum.equals(cardButtonsShowAndHideTypeM37281d6, CardButtonsShowAndHideType.only_hide_operation_btn)) {
            return false;
        }
        CoreModule.f17545c.f19663m0.f19429l2.m132487l(str + " by: highestPriorityHandleBottoms match " + cardButtonsShowAndHideTypeM37281d6 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        return true;
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m37234U3(View view) {
        m37213Q6();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m37235U4(View view) {
        m37213Q6();
    }

    /* JADX INFO: renamed from: U5 */
    public void m37236U5(boolean z) {
        m37307j3();
        pon ponVar = this.f21884K;
        if (ponVar != null) {
            ponVar.m170631n(z);
        }
    }

    /* JADX INFO: renamed from: U6 */
    public final void m37237U6() {
        this.f21964x = this.f21930h;
        this.f21966y = this.f21932i;
        this.f21968z = this.f21934j;
        this.f21861A = this.f21936k;
        this.f21863B = this.f21939l;
        this.f21865C = this.f21941m;
        this.f21867D = this.f21943n;
        this.f21869E = this.f21945o;
        this.f21872F = this.f21947p;
        this.f21875G = this.f21950q;
    }

    /* JADX INFO: renamed from: V1 */
    public void m37238V1(boolean z) {
        boolean zM79881b = PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        if (!this.f21965x1 && (zM79881b || z)) {
            this.f21882J.m161101E8(zM79881b);
        }
        xdl0.m208344M(this.f21920c, true);
        HomeStatisticsHelper.m36718x();
        this.f21965x1 = zM79881b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final osl m37239V2(int i2) {
        osl oslVar = (osl) LayoutInflater.from(act()).inflate(i2, (ViewGroup) this.f21922d, false);
        if (oslVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) oslVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return oslVar;
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m37240V3() {
        this.f21880I.mo36746V(SwipeDirection.fromValue(SwipeDirection.RIGHT.getValue()));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m37241V4() {
        if (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) {
            CoreModule.f17545c.f19663m0.m30994E8(m37125A2().mo38818o().m141745d().f56011id);
        }
    }

    /* JADX INFO: renamed from: V5 */
    public void m37242V5(final int i2) {
        Act act = this.f21878H;
        if (act != null) {
            act.post(new Runnable() { // from class: l.dx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88232a.m37255Y4(i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V6 */
    public final void m37243V6() {
        act().duringCreated(v930.m197537k().distinctUntilChanged().filter(new w9j() { // from class: l.xt30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((TabName) obj) == TabName.Card);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.yt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199886a.m37355s5((TabName) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W2 */
    public void m37244W2() {
        xdl0.m208344M(this.f21904U.mo126596g(), true);
        if (CoreModule.f17545c.f19564F0.m99242i3()) {
            xdl0.m208344M(this.f21904U.mo126602m(), true);
        }
        xdl0.m208329E0(this.f21904U.mo126596g(), new View.OnClickListener() { // from class: l.bw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77579a.m37245W3(view);
            }
        });
        if (upa.m194824u1() && CoreModule.f17545c.f19639e0.f149464r6.get().booleanValue()) {
            xdl0.m208344M(this.f21904U.mo126602m(), true);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m37245W3(View view) {
        m37187M2();
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m37246W4(View view) {
        C8455a.m47588w().m47610p(this.f21878H, m37325n2(this.f21880I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.qt30
            @Override // p149l.d30
            public final void call() {
                this.f156294a.m37241V4();
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public void m37247W5(final DoublePair doublePair, final List<MessageLocation> list) {
        if (doublePair == null) {
            m37261Z5(null);
            return;
        }
        if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m37248X1(doublePair);
            m37261Z5(null);
            return;
        }
        MessageLocation messageLocation = (MessageLocation) vwb.m200346r(list, new w9j() { // from class: l.tv30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.m107181E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (NullChecker.m81303a(messageLocation)) {
            m37261Z5(TextUtils.isEmpty(messageLocation.name) ? act().string(R$string.f18010On) : messageLocation.name);
        } else if (list.size() < 5) {
            mjj.m154842c(act(), true).m154844e(act(), doublePair.first, doublePair.second, new e30() { // from class: l.uv30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178494a.m37260Z4(doublePair, list, (d90) obj);
                }
            }, new e30() { // from class: l.vv30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183146a.m37265a5(doublePair, (Throwable) obj);
                }
            });
        } else {
            m37248X1(doublePair);
            m37261Z5(null);
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final void m37248X1(DoublePair doublePair) {
        if (doublePair.equals(DoublePair.new_())) {
            return;
        }
        cjl0.m107180D0(act());
    }

    /* JADX INFO: renamed from: X2 */
    public final void m37249X2() {
        wp0.INSTANCE.m204882d();
        m37224S5(5);
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.xv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194575a.m37250X3(view);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m37250X3(View view) {
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(false);
            m37230T5(wp0.INSTANCE.m204886h());
        }
        wp0 wp0Var = wp0.INSTANCE;
        wp0Var.m204881c();
        wp0Var.m204889k(this.f21878H);
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m37251X4(boolean z, String str) {
        if (z) {
            m37230T5(str);
        } else {
            SVGALoader.with(this.f21878H).from(str).autoPlay(true).into(this.f21904U.mo126601l());
        }
    }

    /* JADX INFO: renamed from: X5 */
    public void m37252X5(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(this.f21902T)) {
            this.f21902T.m106896i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public void m37253Y1(boolean z, User user, CoreSuggested.UserInfo userInfo) {
        this.f21883J0.mo38370a(z, user, userInfo);
        if (IntlCountryCodeController.m28126v() && upa.m194675N3() && NullChecker.m81303a(this.f21885K0)) {
            this.f21885K0.m38454s(z);
            m37201O5();
        }
        LinearLayout linearLayoutMo38551O = ((psl) m37341q2().getParentFragment()).mo38551O();
        ExpandedFakeProfileTitle expandedFakeProfileTitle = this.f21911X0;
        if (!z) {
            if (expandedFakeProfileTitle == null) {
                return;
            }
            if (f21859H1) {
                bt0.m103733f(bt0.m103753z(bt0.m103744q(expandedFakeProfileTitle, "alpha", expandedFakeProfileTitle.getAlpha(), 0.0f), bt0.m103744q(linearLayoutMo38551O, "alpha", linearLayoutMo38551O.getAlpha(), 1.0f)).setDuration(200L), new Runnable() { // from class: l.pv30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f151395a.m37193N3();
                    }
                }).start();
                return;
            } else {
                linearLayoutMo38551O.setAlpha(1.0f);
                xdl0.m208344M(this.f21911X0, false);
                return;
            }
        }
        if (expandedFakeProfileTitle == null) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle2 = (ExpandedFakeProfileTitle) this.f21904U.mo126605p().inflate();
            this.f21911X0 = expandedFakeProfileTitle2;
            xdl0.m208329E0(expandedFakeProfileTitle2, new View.OnClickListener() { // from class: l.mv30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.m37029N(view);
                }
            });
            this.f21911X0.f22582a.m52949g(1.0f);
            this.f21911X0.f22582a.m52948f(0.0f);
        }
        if (f21859H1) {
            ExpandedFakeProfileTitle expandedFakeProfileTitle3 = this.f21911X0;
            bt0.m103749v(bt0.m103753z(bt0.m103744q(expandedFakeProfileTitle3, "alpha", expandedFakeProfileTitle3.getAlpha(), 1.0f), bt0.m103744q(linearLayoutMo38551O, "alpha", linearLayoutMo38551O.getAlpha(), 0.0f)).setDuration(200L), new Runnable() { // from class: l.nv30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f140666a.m37188M3();
                }
            }).start();
        } else {
            linearLayoutMo38551O.setAlpha(0.0f);
            xdl0.m208344M(this.f21911X0, true);
        }
        this.f21911X0.bringToFront();
        this.f21911X0.m38314h(user);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m37254Y3(View view) {
        this.f21916a.removeView(view);
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m37255Y4(int i2) {
        String str;
        if (this.f21919b1 == i2) {
            return;
        }
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
        }
        if (i2 == 1) {
            str = "core_intl_like_minded_inactive.svga";
        } else {
            str = i2 == 2 ? "core_intl_like_minded_active.svga" : "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SVGALoader.with(this.f21878H).from(str).autoPlay(true).into(this.f21904U.mo126601l());
        this.f21919b1 = i2;
    }

    /* JADX INFO: renamed from: Y5 */
    public void m37256Y5(int i2) {
        String str;
        int i3;
        if (this.f21917a1 == i2) {
            return;
        }
        if (this.f21904U.mo126597h().isAnimating()) {
            this.f21904U.mo126597h().stopAnimation(true);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = "https://auto.tancdn.com/v1/raw/8b1e71c6-ee21-497b-a4ab-9b2b3b4d475110.pdf";
                i3 = -1;
            } else {
                str = "";
            }
            SVGALoader.with(this.f21878H).from(str).repeatCount(i3).autoPlay(true).into(this.f21904U.mo126597h());
            this.f21917a1 = i2;
        }
        str = "https://auto.tancdn.com/v1/raw/f827c87e-ad44-45c3-a8c3-1df8825e618f11.pdf";
        i3 = 1;
        SVGALoader.with(this.f21878H).from(str).repeatCount(i3).autoPlay(true).into(this.f21904U.mo126597h());
        this.f21917a1 = i2;
    }

    /* JADX INFO: renamed from: Z1 */
    public nsl m37257Z1(boolean z, boolean z2) {
        if (z) {
            return z2 ? m37134C2() : m37347r2();
        }
        return m37331o2();
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m37258Z2() {
        xdl0.m208329E0(this.f21883J0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.jv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119853a.m37284e4(view);
            }
        });
        this.f21883J0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
        this.f21883J0.getDislikeBtn().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
        this.f21883J0.getDislikeBtn().setPressedStateLayerBackground(this.f21878H.drawable(this.f21883J0.getDislikePressBg()));
        this.f21883J0.getLikeBtn().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
        this.f21883J0.getLikeBtn().setPressedStateLayerBackground(this.f21878H.drawable(this.f21883J0.getLikePressBg()));
        m37266a6(!u59.m191798G());
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ View m37259Z3(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m37272c2(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m37260Z4(DoublePair doublePair, List list, d90 d90Var) {
        String strMo110405b = d90Var.mo110405b();
        String strMo110404a = d90Var.mo110404a();
        if (TextUtils.isEmpty(strMo110405b) || TextUtils.isEmpty(strMo110404a)) {
            m37248X1(doublePair);
            m37261Z5(null);
        } else {
            m37195N5(doublePair, strMo110405b, strMo110404a, list);
            m37261Z5(strMo110405b);
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public void m37261Z5(String str) {
        this.f21890N = str;
        if (str == null || psq.m171194J(this.f21904U)) {
            m37128A6(false);
            return;
        }
        this.f21904U.getPosition().setText(str);
        m37128A6(true);
        zvf0.m220402x("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: a2 */
    public void m37262a2() {
        m37125A2().setAllowUpSwipe(false);
        xdl0.m208344M(m37139D2(), false);
        m37271b6(false);
        if (ezc0.m118907m0()) {
            ezc0.m118906i0().m118917p0(false);
            if (!upa.m194675N3()) {
                ViewGroup buttonRootLayout = this.f21883J0.getButtonRootLayout();
                int i2 = t100.f167273v;
                buttonRootLayout.setPadding(i2, this.f21883J0.getButtonRootLayout().getPaddingTop(), i2, this.f21883J0.getButtonRootLayout().getPaddingBottom());
            }
        }
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f21885K0)) {
            xdl0.m208344M(this.f21885K0.f22879B, false);
            xdl0.m208344M(this.f21885K0.f22882E, false);
            m37271b6(false);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m37263a3() {
        xdl0.m208344M(this.f21885K0.f22878A, true);
        xdl0.m208329E0(this.f21885K0.f22878A, new View.OnClickListener() { // from class: l.yv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200218a.m37294g4(view);
            }
        });
        m37273c3();
        if (u59.m191800I()) {
            xdl0.m208344M(this.f21885K0.f22882E, true);
            m37266a6(false);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m37264a4() {
        return Boolean.valueOf(act().m39810d6());
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m37265a5(DoublePair doublePair, Throwable th) {
        m37248X1(doublePair);
        m37261Z5(null);
        App.f15368d.m20433k(th);
    }

    /* JADX INFO: renamed from: a6 */
    public void m37266a6(boolean z) {
        if (upa.m194675N3()) {
            xdl0.m208344M(this.f21904U.mo126591b(), false);
            xdl0.m208344M(this.f21904U.mo126599j(), false);
            return;
        }
        boolean zMo33433Vf = CoreModule.m29935P().m94651a().mo33433Vf();
        qsl qslVar = this.f21904U;
        if (!zMo33433Vf) {
            xdl0.m208344M(qslVar.mo126591b(), z);
            xdl0.m208344M(this.f21904U.mo126599j(), z);
        } else if (xdl0.m208349O0(qslVar.mo126591b())) {
            xdl0.m208344M(this.f21904U.mo126591b(), false);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public void m37267b2(C7943c c7943c) {
        c7943c.m37905I(new c());
        osl oslVar = this.f21883J0;
        if (oslVar instanceof ykf) {
            ((ykf) oslVar).setImmediateleMatchClickListener(new Action1() { // from class: l.lw30
                @Override // com.tantanapp.media.ttmediautils.download.Action1
                public final void call(Object obj) {
                    this.f130237a.m37199O3((String) obj);
                }
            });
        }
        osl oslVar2 = this.f21883J0;
        if (oslVar2 instanceof HomeCardBottomOptButtons) {
            ((HomeCardBottomOptButtons) oslVar2).setComplimentClickListener(new Action1() { // from class: l.mw30
                @Override // com.tantanapp.media.ttmediautils.download.Action1
                public final void call(Object obj) {
                    this.f136012a.m37205P3((User) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final void m37268b3() {
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m37269b4(final BoostViewContainer boostViewContainer, int i2) {
        if (i2 == 2) {
            m37212Q5(true);
            boostViewContainer.m43694e(this.f21878H, new d30() { // from class: l.kx30
                @Override // p149l.d30
                public final void call() {
                    boostViewContainer.m43696g(true);
                }
            }, new v9j() { // from class: l.lx30
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f130356a.m37264a4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m37270b5() {
        if (!(m37125A2().mo38809d() instanceof e5m) || ((e5m) m37125A2().mo38809d()).mo37923H() == null) {
            return;
        }
        xdl0.m208353Q0(((e5m) m37125A2().mo38809d()).mo37923H(), new e30() { // from class: l.pt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151112a.m37295g5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b6 */
    public void m37271b6(boolean z) {
        if (!upa.m194675N3()) {
            if (m37154G2() != null) {
                xdl0.m208344M(m37154G2().getRealView(), z);
                xdl0.m208344M(m37159H2(), z);
                return;
            }
            return;
        }
        m37266a6(z);
        if (m37154G2() != null) {
            xdl0.m208344M(m37154G2().getRealView(), z);
            xdl0.m208344M(m37159H2(), z);
        } else {
            xdl0.m208344M(m37154G2().getRealView(), false);
            xdl0.m208344M(m37159H2(), false);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public View m37272c2(View view, Drawable drawable, CharSequence charSequence, int i2, int i3, int i4, boolean z, d30 d30Var) {
        int i5;
        int i6;
        int iM186890d;
        int iM186890d2;
        if (view != m37297h2() && view != m37302i2()) {
            xdl0.m208344M(this.f21954s, false);
            if (z) {
                i5 = 0;
                i6 = 0;
                iM186890d = 0;
                iM186890d2 = 0;
            } else {
                int iM186890d3 = t100.m186890d(18.0f);
                int iM186890d4 = t100.m186890d(17.0f);
                iM186890d = t100.m186890d(18.0f);
                i5 = iM186890d3;
                i6 = iM186890d4;
                iM186890d2 = t100.m186890d(21.0f);
            }
            return mep0.m154300b1(m37385z2(), view, drawable, charSequence, i2, i3, 17, i4, i5, i6, iM186890d, iM186890d2, xdl0.m208412y0() - t100.m186890d(60.0f), 17, 0, false, d30Var);
        }
        VText vText = this.f21954s;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(x2c0.f190613ua));
        ViewGroup.LayoutParams layoutParams = this.f21954s.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = t100.m186890d(7.0f);
            marginLayoutParams.topMargin = t100.m186890d(2.0f);
        }
        this.f21954s.setLayoutParams(layoutParams);
        this.f21954s.setPadding(t100.m186890d(16.0f), t100.m186890d(16.0f), t100.m186890d(16.0f), t100.m186890d(10.0f));
        this.f21954s.setTextSize(13.0f);
        this.f21954s.setText(charSequence);
        xdl0.m208344M(this.f21954s, true);
        if (i4 != -1) {
            if (this.f21896Q == null) {
                this.f21896Q = new Runnable() { // from class: l.bx30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77737a.m37216R3();
                    }
                };
            }
            e51.m114743H(act(), this.f21896Q, i4);
        }
        return this.f21954s;
    }

    /* JADX INFO: renamed from: c3 */
    public final void m37273c3() {
        xdl0.m208329E0(this.f21885K0.f22895l, new View.OnClickListener() { // from class: l.ex30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93572a.m37299h4(view);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ boolean m37274c4(View view) {
        if (lac0.m149136m()) {
            m37297h2().m43695f();
            return true;
        }
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            return true;
        }
        m37297h2().m43695f();
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m37275c5(int[] iArr) {
        C8455a.m47588w().m47606S(act(), this.f21916a, m37164I2(), 3000);
    }

    @Deprecated
    /* JADX INFO: renamed from: c6 */
    public boolean m37276c6() {
        if (m37125A2() != null && (m37125A2().mo38809d() instanceof a5m)) {
            a5m a5mVar = (a5m) m37125A2().mo38809d();
            d5m d5mVar = a5mVar instanceof d5m ? (d5m) a5mVar : null;
            User userM141745d = m37125A2().mo38818o().m141745d();
            if (a5mVar.mo36947y()) {
                if (d5mVar != null && d5mVar.mo36886f()) {
                    return false;
                }
                if (d5mVar != null && d5mVar.mo36836N()) {
                    return false;
                }
                if ((NullChecker.m81303a(userM141745d) && mah0.m153738y0(userM141745d.f56011id)) || mah0.m153729s0().m153789z0()) {
                    return false;
                }
                if (d5mVar == null || !d5mVar.mo36876c() || IntlCountryCodeController.m28126v()) {
                    return ((a5mVar instanceof UserProfileExpandedCardRoot) && ((UserProfileExpandedCardRoot) a5mVar).m37970l1()) ? false : true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d2 */
    public void m37277d2() {
        m37125A2().setAllowUpSwipe(true);
        if (IntlCountryCodeController.m28126v() && NullChecker.m81304b(this.f21885K0)) {
            xdl0.m208344M(this.f21885K0.f22879B, true);
            xdl0.m208344M(this.f21885K0.f22882E, true);
            m37271b6(true);
        }
        if (fap.m120266y()) {
            this.f21898R = true;
        }
        m37139D2().setVisibility(0);
        m37271b6(true);
        m37139D2().setOnClickListener(new View.OnClickListener() { // from class: l.qv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156577a.m37222S3(view);
            }
        });
        m37134C2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.rv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161159a.m37228T3(view);
            }
        });
        m37134C2().setOnLongPressListener(new l());
        m37371w2().setOnClickListener(new View.OnClickListener() { // from class: l.sv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166520a.m37234U3(view);
            }
        });
        xdl0.m208384k0(m37316l2());
        if (u59.m191800I()) {
            m37263a3();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final void m37278d3() {
        if (g6a.m124574w()) {
            this.f21916a.bringChildToFront(this.f21920c);
            this.f21916a.bringChildToFront(this.f21909W0.getRenderView());
            this.f21920c.bringChildToFront(this.f21922d);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m37279d4() {
        if (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) {
            CoreModule.f17545c.f19663m0.m30994E8(m37125A2().mo38818o().m141745d().f56011id);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m37280d5() {
        xdl0.m208353Q0(m37164I2(), new e30() { // from class: l.jx30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120189a.m37275c5((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d6 */
    public CardButtonsShowAndHideType m37281d6() {
        if (m37125A2() != null && (m37125A2().mo38809d() instanceof a5m)) {
            a5m a5mVar = (a5m) m37125A2().mo38809d();
            CoreSuggested.UserInfo userInfoMo38813j = m37125A2().mo38813j();
            User userM141745d = m37125A2().mo38818o().m141745d();
            d5m d5mVar = a5mVar instanceof d5m ? (d5m) a5mVar : null;
            e5m e5mVar = a5mVar instanceof e5m ? (e5m) a5mVar : null;
            if (a5mVar.mo36947y()) {
                if (d5mVar != null && d5mVar.mo36886f()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (d5mVar != null && ura.m195053e().m195055b().mo33648h9(d5mVar.getUserInfoProxy(), userM141745d)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (d5mVar != null && d5mVar.mo36836N()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (NullChecker.m81303a(userInfoMo38813j) && mah0.m153738y0(userInfoMo38813j.f19472id)) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                if (upa.m194675N3()) {
                    if (mah0.m153729s0().f132869o) {
                        mah0.m153729s0().f132869o = false;
                        return CardButtonsShowAndHideType.get("hide");
                    }
                } else if (mah0.m153729s0().m153789z0()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (CoreModule.f17557o.m195055b().mo33649wf() && ((d5mVar != null && d5mVar.mo36876c()) || (e5mVar != null && e5mVar.mo37924c() && !ExpandedCardStyleHelper.m38090o().m38103s()))) {
                return CardButtonsShowAndHideType.get("hide");
            }
            if (sb90.m183209e(userM141745d) && NullChecker.m81303a(userInfoMo38813j) && NullChecker.m81303a(userInfoMo38813j.cityCData)) {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                if (NullChecker.m81303a(userM141745d) && !userM141745d.isMe() && userM169527p9.isFemale()) {
                    return CardButtonsShowAndHideType.get("hide");
                }
            }
            if (g6a.m124574w() && NullChecker.m81303a(d5mVar) && a5mVar.mo36947y()) {
                if (d5mVar.mo36944x0() == 1) {
                    return CardButtonsShowAndHideType.get("hide");
                }
                return d5mVar.mo36944x0() == -1 ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.unknow);
            }
            if (upa.m194675N3() && al4.m97266c(userInfoMo38813j, userM141745d)) {
                return ExpandedCardStyleHelper.m38090o().m38103s() ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
            }
            if (al4.m97266c(userInfoMo38813j, userM141745d)) {
                return CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.only_hide_operation_btn);
            }
            if (u59.m191797F() && NullChecker.m81303a(a5mVar) && !a5mVar.mo36922q0() && NullChecker.m81303a(userInfoMo38813j)) {
                IntlInsertCardData intlInsertCardData = userInfoMo38813j.intlInsertCardData;
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
                        return (upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s()) ? CardButtonsShowAndHideType.get("show") : CardButtonsShowAndHideType.get("hide");
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
                        return CardButtonsShowAndHideType.get(IntlCountryCodeController.m28126v() ? "show" : "hide");
                    default:
                        return CardButtonsShowAndHideType.get("show");
                }
            }
        }
        return upa.m194675N3() ? CardButtonsShowAndHideType.get("hide") : CardButtonsShowAndHideType.get(CardButtonsShowAndHideType.unknow);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f21962w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        pon ponVar = this.f21884K;
        if (ponVar != null) {
            ponVar.m170629l();
            this.f21884K = null;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public SpannableString m37282e2(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(act().getResources().getColor(w0c0.f183790N1)), str.indexOf(CoreModule.f17545c.f19596P2.get()), str.indexOf(CoreModule.f17545c.f19596P2.get()) + CoreModule.f17545c.f19596P2.get().length(), 34);
        return spannableString;
    }

    /* JADX INFO: renamed from: e3 */
    public void m37283e3() {
        this.f21865C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21863B.m36661p(new d30() { // from class: l.xu30
            @Override // p149l.d30
            public final void call() {
                this.f194471a.m37304i4();
            }
        }, new d30() { // from class: l.yu30
            @Override // p149l.d30
            public final void call() {
                this.f200041a.m37308j4();
            }
        }, new d30() { // from class: l.zu30
            @Override // p149l.d30
            public final void call() {
                this.f204808a.m37313k4();
            }
        }, this.f21882J);
        this.f21865C.m36680m(this.f21882J, new d30() { // from class: l.av30
            @Override // p149l.d30
            public final void call() {
                this.f71893a.m37317l4();
            }
        });
        this.f21865C.setShowCallback(new e30() { // from class: l.bv30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77391a.m37322m4((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m37284e4(View view) {
        C8455a.m47588w().m47610p(this.f21878H, m37325n2(this.f21880I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.rw30
            @Override // p149l.d30
            public final void call() {
                this.f161299a.m37279d4();
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m37285e5(int[] iArr) {
        if (m37125A2().mo38809d() instanceof NewNewProfileCard) {
            C8455a.m47588w().m47606S(act(), this.f21916a, ((NewNewProfileCard) m37125A2().mo38809d()).mo36857V(), 3000);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e6 */
    public void m37286e6() {
        if (m37233U2(" by showBottomButton s1 ")) {
            return;
        }
        m37152F5();
    }

    /* JADX INFO: renamed from: f2 */
    public void m37287f2() {
        m37212Q5(true);
        m37277d2();
        act().m39804a7();
    }

    /* JADX INFO: renamed from: f3 */
    public final void m37288f3() {
        if (g6a.m124562k()) {
            xdl0.m208344M(this.f21904U.mo126594e(), false);
            xdl0.m208344M(this.f21904U.mo126595f(), true);
            xdl0.m208329E0(this.f21904U.mo126595f(), new View.OnClickListener() { // from class: l.cw30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82743a.m37327n4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m37289f4() {
        if (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38818o()) && NullChecker.m81303a(m37125A2().mo38818o().m141745d())) {
            CoreModule.f17545c.f19663m0.m30994E8(m37125A2().mo38818o().m141745d().f56011id);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m37290f5() {
        if (m37125A2().mo38809d() instanceof NewNewProfileCard) {
            xdl0.m208353Q0(((NewNewProfileCard) m37125A2().mo38809d()).mo36857V(), new e30() { // from class: l.px30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151639a.m37285e5((int[]) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f6 */
    public void m37291f6() {
        C4348d.m20896l().m20900k("home_show_filter_tip");
        C4345a c4345a = new C4345a(this.f21904U.mo126596g().getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("推荐的人不喜欢？试试调整筛选条件").m20870k(CoreModule.f17544b.getResources().getColor(z0c0.f200976d)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20854I(228).m20881w(t100.m186890d(6.0f)).m20882x(t100.m186890d(6.0f)).m20857L(w0c0.f183861k0).m20848C(10).m20883y(true).m20875q(C4345a.f15680N);
        C4348d.m20896l().m20909u(c4345a, this.f21904U.mo126596g(), "home_show_filter_tip");
    }

    /* JADX INFO: renamed from: g2 */
    public View m37292g2() {
        return this.f21904U.mo126596g();
    }

    /* JADX INFO: renamed from: g3 */
    public void m37293g3(boolean z) {
        if (g6a.m124577z() || CoreModule.f17545c.f19701y2.m155330E3()) {
            return;
        }
        xdl0.m208344M(this.f21904U.mo126604o(), z);
        if (z) {
            zvf0.m220402x("e_find_partner_entrance", "p_suggest_users_home_view");
            xdl0.m208329E0(this.f21904U.mo126604o(), new View.OnClickListener() { // from class: l.qw30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156655a.m37333o4(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m37294g4(View view) {
        C8455a.m47588w().m47610p(this.f21878H, m37325n2(this.f21880I), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.sw30
            @Override // p149l.d30
            public final void call() {
                this.f166615a.m37289f4();
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m37295g5(int[] iArr) {
        if (!(m37125A2().mo38809d() instanceof e5m) || ((e5m) m37125A2().mo38809d()).mo37923H() == null) {
            return;
        }
        C8455a.m47588w().m47606S(act(), this.f21916a, ((e5m) m37125A2().mo38809d()).mo37923H(), 3000);
    }

    /* JADX INFO: renamed from: g6 */
    public void m37296g6() {
        if (NullChecker.m81303a(m37297h2()) && xdl0.m208349O0(m37297h2())) {
            CoreModule.f17545c.f19576J0.f115758j0.put(Boolean.valueOf(m37301h6(act().getString(R$string.f17966N9), m37297h2(), jtk.f119614A | jtk.f119618E, 4, 0)));
        }
    }

    /* JADX INFO: renamed from: h2 */
    public BoostViewContainer m37297h2() {
        return this.f21904U.mo126598i();
    }

    /* JADX INFO: renamed from: h3 */
    public final void m37298h3() {
        CoreModule.f17545c.f19703z1.m110036o3(this.f21878H, new Function1() { // from class: l.ev30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        });
        m37224S5(3);
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.fv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99401a.m37338p4(view);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m37299h4(View view) {
        User userM37175K2 = m37175K2(this.f21880I);
        if (userM37175K2 == null) {
            return;
        }
        zvf0.m220396r("e_compliment_card_btn_click", "p_suggest_users_home_view");
        int showPictureIndexProxy = (NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38809d()) && (m37125A2().mo38809d() instanceof mol)) ? ((mol) m37125A2().mo38809d()).getShowPictureIndexProxy() : 0;
        if (jo5.m142416b(this.f21878H, NullChecker.m81303a(m37125A2()) ? m37125A2().mo38813j() : null, userM37175K2, "home_card_us_compliment_btn")) {
            return;
        }
        bo5.m102902m(this.f21878H, userM37175K2, "home_card_us_compliment_btn", Integer.valueOf(showPictureIndexProxy), null, bo5.m102898i());
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m37300h5() {
        m37163H6(true);
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m37301h6(String str, View view, int i2, int i3, int i4) {
        if (wc80.m202636e().m202643k()) {
            return false;
        }
        TextView textView = new TextView(this.f21878H);
        textView.setText(str);
        int i5 = t100.f167264m;
        int i6 = t100.f167260i;
        textView.setPadding(i5, i6, t100.f167261j, i6);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        float f2 = i3;
        C4348d.m20896l().m20908t(new C4345a(act()).m20870k(e16.m114375c(act(), w0c0.f183798Q0)).m20877s(textView).m20881w(t100.m186890d(f2)).m20880v(t100.m186890d(f2)).m20882x(i4).m20858M(true).m20875q(i2), view);
        return true;
    }

    /* JADX INFO: renamed from: i2 */
    public View m37302i2() {
        return this.f21904U.mo126598i().getBoostButton();
    }

    /* JADX INFO: renamed from: i3 */
    public final void m37303i3() {
        zvf0.m220402x("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        m37224S5(0);
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.nw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140882a.m37343q4(view);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m37304i4() {
        this.f21882J.m161234j5();
        Animator animator = this.f21967y1;
        if (animator != null && !animator.isRunning()) {
            this.f21967y1.start();
        }
        this.f21879H0.mo39113b();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m37305i5(int i2) {
        if (TextUtils.isEmpty(m37340p6())) {
            m37345q6(i2);
        }
    }

    /* JADX INFO: renamed from: i6 */
    public void m37306i6() {
        if (IntlCountryCodeController.m28126v()) {
            e51.m114744I(this.f21880I, new Runnable() { // from class: l.fx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99721a.m37280d5();
                }
            }, 500L);
        } else if (m37125A2().mo38809d() instanceof NewNewProfileCard) {
            e51.m114744I(this.f21880I, new Runnable() { // from class: l.hx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109826a.m37290f5();
                }
            }, 500L);
        } else if (m37125A2().mo38809d() instanceof e5m) {
            e51.m114744I(this.f21880I, new Runnable() { // from class: l.ix30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115327a.m37270b5();
                }
            }, 500L);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        y8i0.m213379a("NewNewHomeViewModel inflateView");
        LaunchStep launchStep = LaunchStep.HomeTabInflate;
        yni.m215417f(launchStep);
        View viewM37169J1 = m37169J1(layoutInflater, viewGroup);
        m37237U6();
        this.f21904U = new gk8(this.f21962w);
        du2.m113670a("BifrostLayout", "开始使用优化布局");
        this.f21881I0 = new ProfileCardStackOpt(act(), new qol0() { // from class: l.su30
            @Override // p149l.qol0
            /* JADX INFO: renamed from: d2 */
            public final ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f166424a.m37181L2(virtualCardType, userInfo);
            }
        }, this);
        if (upa.m194665L3()) {
            int i2 = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.topMargin = t100.m186890d(44.0f);
            this.f21928g.addView(this.f21881I0, 0, layoutParams);
            xdl0.m208360X(this.f21920c, 0);
            this.f21909W0 = (SuperLikeComboAnimView) LayoutInflater.from(act()).inflate(f6c0.f95814hc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            this.f21960v.addView(this.f21909W0.getRenderView(), layoutParams2);
        } else {
            this.f21922d.setClipChildren(false);
            this.f21922d.setClipToPadding(false);
            this.f21881I0.setClipChildren(false);
            this.f21881I0.setClipToPadding(false);
            xdl0.m208344M(this.f21926f, true);
            this.f21928g.addView(this.f21881I0, 0, new FrameLayout.LayoutParams(-1, -1));
            this.f21909W0 = (SuperLikeComboAnimView) LayoutInflater.from(act()).inflate(f6c0.f95814hc, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 17;
            this.f21960v.addView(this.f21909W0.getRenderView(), layoutParams3);
        }
        xdl0.m208344M(this.f21909W0.getRenderView(), false);
        m37376x3();
        this.f21879H0 = new RadarRipple(act());
        this.f21968z.addView(this.f21879H0.getRippleView(), 0, new FrameLayout.LayoutParams(-1, -1));
        if (upa.m194675N3()) {
            this.f21922d.setPadding(0, 0, 0, 0);
        }
        if (upa.m194723Z2()) {
            psq.m171197M(this.f21878H, this.f21922d, this.f21904U, this.f21881I0);
        } else if (upa.m194736c3()) {
            psq.m171198N(this.f21878H, this.f21904U);
        }
        m37348r3();
        m37367v3();
        m37268b3();
        this.f21870E0 = this.f21881I0;
        xdl0.m208329E0(this.f21883J0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.dv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewTreeObserverOnGlobalLayoutListenerC7866b.m37090n(view);
            }
        });
        this.f21962w.getViewTreeObserver().addOnGlobalLayoutListener(this);
        yni.m215415d(launchStep);
        m37278d3();
        y8i0.m213380b();
        return viewM37169J1;
    }

    /* JADX INFO: renamed from: j3 */
    public final void m37307j3() {
        VFrame vFrame = this.f21922d;
        if (vFrame != null) {
            vFrame.setClipChildren(false);
            this.f21922d.setClipToPadding(false);
        }
        VLinear vLinear = this.f21924e;
        if (vLinear != null) {
            vLinear.setClipChildren(false);
            this.f21924e.setClipToPadding(false);
        }
        FrameLayout frameLayout = this.f21928g;
        if (frameLayout != null) {
            frameLayout.setClipChildren(false);
            this.f21928g.setClipToPadding(false);
            this.f21928g.setClipToOutline(false);
        }
        ProfileCardStackOpt profileCardStackOpt = this.f21881I0;
        if (profileCardStackOpt != null) {
            profileCardStackOpt.setClipChildren(false);
            this.f21881I0.setClipToPadding(false);
        }
        if (this.f21884K != null) {
            return;
        }
        xdl0.m208344M(this.f21926f, true);
        pon ponVar = new pon(this.f21880I, new e30() { // from class: l.rx30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161395a.m37349r4((Boolean) obj);
            }
        });
        this.f21884K = ponVar;
        ponVar.m170627i(this.f21926f);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m37309j5(e30 e30Var, d30 d30Var) {
        this.f21882J.m161177X4();
        Boolean bool = Boolean.TRUE;
        e30Var.call(bool);
        if (!uq40.m194983y(this.f21878H, true)) {
            this.f21882J.f140350G.m132487l(bool);
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m37310j6() {
        if (NullChecker.m81303a(m37129B2()) && xdl0.m208349O0(m37129B2())) {
            rxg0.m181572j().f161461f.put(Boolean.valueOf(m37301h6(act().getString(R$string.f17936M9), m37129B2(), jtk.f119617D | jtk.f119618E, 18, IntlCountryCodeController.m28126v() ? 0 : -26)));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public View m37311k2() {
        return this.f21904U.mo126598i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: k3 */
    public final void m37312k3() {
        m37224S5(4);
        ubo.INSTANCE.m192884e();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = qib0.f154717f0 + "";
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.wv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188213a.m37354s4(view);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m37313k4() {
        pcl0 pcl0VarM2557i0 = this.f21878H.fragmentManager().m2557i0(TabName.Card.toString());
        if (NullChecker.m81303a(pcl0VarM2557i0) && (pcl0VarM2557i0 instanceof psl)) {
            ((psl) pcl0VarM2557i0).mo38540C1(NewTanFragTag.HOME, null);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m37314k5(e30 e30Var, d30 d30Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        this.f21882J.m161177X4();
        e30Var.call(Boolean.FALSE);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public void m37315k6() {
        C4348d.m20896l().m20900k("home_show_just_look_verify_tip");
        C4345a c4345a = new C4345a(this.f21904U.mo126593d().getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20849D("开启后，只为你展示通过真实头像认证的用户").m20870k(CoreModule.f17544b.getResources().getColor(z0c0.f200976d)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20881w(t100.m186890d(6.0f)).m20882x(t100.m186890d(6.0f)).m20883y(true).m20875q(C4345a.f15680N).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        C4348d.m20896l().m20909u(c4345a, this.f21904U.mo126593d(), "home_show_just_look_verify_tip");
        o6j0.m162864h("e_only_show_verified_bubble", "p_suggest_users_home_view", new o6j0.C18854a[0]);
    }

    @Deprecated
    /* JADX INFO: renamed from: l2 */
    public View m37316l2() {
        return this.f21883J0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m37317l4() {
        this.f21882J.m161093C8();
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m37318l5(ViewGroup viewGroup, ViewGroup viewGroup2, dd80 dd80Var, final e30 e30Var, final d30 d30Var, View view) {
        boolean zM214965u = yij0.m214965u(viewGroup);
        boolean zM214965u2 = yij0.m214965u(viewGroup2);
        ygh0.m214658Q(zM214965u, zM214965u2, qgp0.m174450e().m174452g());
        dd80Var.dismiss();
        PermissionHelper.m79882c().m79900r("android.permission.READ_CONTACTS").m79905w(false).m79903u(zM214965u || zM214965u2).m79892j(true).m79895m(new d30() { // from class: l.vt30
            @Override // p149l.d30
            public final void call() {
                this.f182900a.m37309j5(e30Var, d30Var);
            }
        }, new e30() { // from class: l.wt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187992a.m37314k5(e30Var, d30Var, (PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79898p(new b()).m79902t(new a()).m79904v(new m()).m79891i(this.f21878H);
    }

    @Deprecated
    /* JADX INFO: renamed from: l6 */
    public void m37319l6() {
        if (upa.m194675N3()) {
            m37266a6(false);
        }
        if (m37233U2(" by showLiveCardBottomButtons s1 ")) {
            return;
        }
        m37147E5();
    }

    /* JADX INFO: renamed from: m2 */
    public boolean m37320m2() {
        return xdl0.m208349O0(this.f21883J0.getButtonRootLayout());
    }

    /* JADX INFO: renamed from: m3 */
    public final void m37321m3() {
        m37224S5(1);
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.iw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115222a.m37358t4(view);
            }
        });
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m37322m4(Boolean bool) {
        m37173J6();
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ View m37323m5() {
        View view = new View(act());
        view.setClickable(false);
        view.setBackgroundColor(520093696);
        view.setMinimumHeight(t100.m186890d(2.0f));
        view.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f192403e, t100.m186890d(2.0f)));
        xdl0.m208358V(view, t100.m186890d(12.0f));
        xdl0.m208359W(view, t100.m186890d(12.0f));
        return view;
    }

    /* JADX INFO: renamed from: m6 */
    public void m37324m6(int i2) {
        rxg0.m181558E(this.f21880I, m37139D2(), i2, new d30() { // from class: l.tw30
            @Override // p149l.d30
            public final void call() {
                this.f172359a.m37300h5();
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final User m37325n2(NewNewHomeFrag newNewHomeFrag) {
        CoreSuggested.UserInfo userInfoMo38813j = newNewHomeFrag.f21678C.m37125A2().mo38813j();
        if (!NullChecker.m81303a(userInfoMo38813j) || m37232U1(newNewHomeFrag)) {
            return null;
        }
        return userInfoMo38813j.getRenderUser();
    }

    /* JADX INFO: renamed from: n3 */
    public final void m37326n3() {
        m37224S5(2);
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.wu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188080a.m37363u4(view);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m37327n4(View view) {
        zvf0.m220399u("e_femalevip_icon", "p_suggest_users_home_view", vwb.m200311Y("femalevip_is_on", Boolean.valueOf(this.f21907V0)));
        gei.m125801u().get().m125810I(act());
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m37328n5(roj0 roj0Var) {
        this.f21880I.m20599s4();
    }

    @Deprecated
    /* JADX INFO: renamed from: n6 */
    public void m37329n6() {
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f21885K0)) {
            xdl0.m208345M0(this.f21885K0.f22909z, true);
            xdl0.m208345M0(this.f21885K0.f22884a, true);
            return;
        }
        if (upa.m194675N3()) {
            m37266a6(true);
        }
        if (m37233U2(" by showNewBottomButton s1 ")) {
            return;
        }
        m37219R6();
        m37152F5();
    }

    /* JADX INFO: renamed from: o */
    public boolean m37330o() {
        m37207P5();
        return false;
    }

    /* JADX INFO: renamed from: o2 */
    public nsl m37331o2() {
        return this.f21883J0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: o3 */
    public final void m37332o3() {
        if (idr.INSTANCE.m135623h() == -1 || !C7865a.INSTANCE.m36992e()) {
            return;
        }
        zvf0.m220402x("e_same_entrance", "p_suggest_users_home_view");
        xdl0.m208344M(this.f21904U.mo126601l(), true);
        xdl0.m208344M(this.f21904U.mo126597h(), false);
        xdl0.m208344M(this.f21904U.mo126600k(), false);
        this.f21882J.m161288v8();
        C8411a.INSTANCE.m46889j(this.f21878H, new Function1() { // from class: l.gv30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f104525a.m37368v4((Long) obj);
            }
        }, new Function0() { // from class: l.hv30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f109612a.m37373w4();
            }
        });
        xdl0.m208329E0(this.f21904U.mo126601l(), new View.OnClickListener() { // from class: l.iv30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115086a.m37377x4(view);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m37333o4(View view) {
        zvf0.m220396r("e_find_partner_entrance", "p_suggest_users_home_view");
        Intent intentM80239d2 = MkWebViewAct.m80239d2(this.f21878H, "", juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/find-partner/index.html?speed=true&_bid=1004357&hideNavigationBar=1&hideNotch=1#/", true, true, true, null);
        intentM80239d2.putExtra("hideNotch", true);
        act().startActivity(intentM80239d2);
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m37334o5(Throwable th) {
        this.f21880I.m20599s4();
        bx6.m104283b(th);
    }

    /* JADX INFO: renamed from: o6 */
    public void m37335o6(final int i2) {
        if (m37165I3()) {
            return;
        }
        e51.m114743H(act(), new Runnable() { // from class: l.kv30
            @Override // java.lang.Runnable
            public final void run() {
                this.f124742a.m37305i5(i2);
            }
        }, 500L);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.f21962w.getChildAt(0);
        int childCount = linearLayoutCompat.getChildCount();
        int marginEnd = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            if (childAt.isShown() && childAt.getId() != u4c0.f174370mf) {
                int measuredWidth = marginEnd + linearLayoutCompat.getChildAt(i2).getMeasuredWidth();
                LinearLayoutCompat.C0131a c0131a = (LinearLayoutCompat.C0131a) childAt.getLayoutParams();
                marginEnd = measuredWidth + ((ViewGroup.MarginLayoutParams) c0131a).leftMargin + ((ViewGroup.MarginLayoutParams) c0131a).rightMargin + c0131a.getMarginEnd() + c0131a.getMarginStart();
            }
        }
        va40.m197626h(xdl0.m208412y0() - marginEnd);
    }

    /* JADX INFO: renamed from: p2 */
    public DraweeView m37336p2() {
        return this.f21863B.f21641c;
    }

    /* JADX INFO: renamed from: p3 */
    public void m37337p3() {
        xdl0.m208329E0(this.f21904U.getPosition(), new View.OnClickListener() { // from class: l.pw30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151531a.m37382y4(view);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m37338p4(View view) {
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
            m37230T5(C8382b.INSTANCE.m46284f());
        }
        C8382b.INSTANCE.m46287i(this.f21878H, 2);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m37339p5() {
        this.f21882J.m161248l9(new e30() { // from class: l.tt30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171994a.m37328n5((roj0) obj);
            }
        }, new e30() { // from class: l.ut30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178235a.m37334o5((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p6 */
    public String m37340p6() {
        if (!m37165I3() && NullChecker.m81303a(m37139D2()) && m37139D2().getScaleY() == 1.0f && m37320m2()) {
            rxg0.m181572j().m181594v();
            if (zzc0.m221015f0() && this.f21880I.f21678C.m37170J3() && ((!(this.f21880I.getParentFragment() instanceof psl) || ((psl) this.f21880I.getParentFragment()).mo38555T() == NewTanFragTag.HOME) && v930.m197534h() == TabName.Card && !m37155G3() && ((!upa.m194723Z2() || !CoreModule.f17545c.f19704z2.m30255r3()) && !m37150F3()))) {
                return rxg0.m181572j().m181583J(m37325n2(this.f21880I), this.f21880I, m37139D2(), 2000);
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: renamed from: q2 */
    public NewNewHomeFrag m37341q2() {
        return this.f21880I;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m37342q3(int i2) {
        boolean zM37160H3;
        if (!m37145E3() || i2 == 4) {
            if (i2 == 0) {
                zM37160H3 = C7865a.INSTANCE.m36991d() && qx5.INSTANCE.m176942d() != -1;
                if (zM37160H3) {
                    m37303i3();
                }
            } else if (i2 == 1) {
                zM37160H3 = m37160H3();
                if (zM37160H3) {
                    m37321m3();
                }
            } else if (i2 == 2) {
                zM37160H3 = m37182L3();
                if (zM37160H3) {
                    m37326n3();
                }
            } else if (i2 == 3) {
                zM37160H3 = m37140D3();
                if (zM37160H3) {
                    m37298h3();
                }
            } else if (i2 == 4) {
                zM37160H3 = m37145E3();
                if (zM37160H3) {
                    m37312k3();
                }
            } else if (i2 != 5) {
                zM37160H3 = false;
            } else {
                zM37160H3 = C7865a.INSTANCE.m36989b();
                if (zM37160H3) {
                    m37249X2();
                }
            }
            qsl qslVar = this.f21904U;
            if (!zM37160H3) {
                xdl0.m208344M(qslVar.mo126601l(), false);
                return;
            }
            xdl0.m208344M(qslVar.mo126601l(), true);
            xdl0.m208344M(this.f21904U.mo126597h(), false);
            xdl0.m208344M(this.f21904U.mo126600k(), false);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m37343q4(View view) {
        zvf0.m220396r("e_intl_horoscope_match_entrance", "p_suggest_users_home_view");
        gx5.m128532a(this.f21878H);
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m37344q5(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        act().m39815f7();
    }

    /* JADX INFO: renamed from: q6 */
    public String m37345q6(int i2) {
        View viewM37139D2 = (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f21885K0)) ? this.f21885K0.f22879B : m37139D2();
        if (!IntlCountryCodeController.m28126v()) {
            if (CoreModule.f17545c.m31484o3() == null || !m37170J3() || CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() == 0) {
                return null;
            }
            boolean zM223031c = m37144E2().m223031c();
            osl oslVar = this.f21883J0;
            if (zM223031c) {
                oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()));
                return "bubble_superlike_bubble";
            }
            oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()));
            rxg0.m181560G(this.f21878H, m37144E2(), this.f21883J0.getSuperLikeRemaining());
            return "bubble_superlike_bubble";
        }
        if (!m37165I3() && NullChecker.m81303a(viewM37139D2) && NullChecker.m81303a(m37139D2()) && m37130B3() && xdl0.m208349O0(viewM37139D2) && m37139D2().getScaleY() == 1.0f && m37320m2() && !m37144E2().m223031c() && CoreModule.f17545c.m31484o3() != null && this.f21880I.f21678C.m37170J3() && this.f21878H != null && !(((this.f21880I.getParentFragment() instanceof psl) && ((psl) this.f21880I.getParentFragment()).mo38555T() != NewTanFragTag.HOME) || m37232U1(this.f21880I) || v930.m197534h() != TabName.Card || m37155G3() || ((upa.m194723Z2() && CoreModule.f17545c.f19704z2.m30255r3()) || m37150F3()))) {
            return rxg0.m181572j().m181584K(this.f21880I, (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f21885K0)) ? this.f21885K0.f22879B : m37139D2(), i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m37346r() {
        m37381y3();
        m37357t3();
        m37307j3();
        m37243V6();
    }

    /* JADX INFO: renamed from: r2 */
    public nsl m37347r2() {
        return this.f21883J0.getLikeBtn();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m37348r3() {
        if (upa.m194675N3()) {
            this.f21883J0 = m37239V2(f6c0.f95638X3);
        } else if (u59.m191798G()) {
            this.f21883J0 = m37239V2(f6c0.f95721c4);
        } else {
            this.f21883J0 = m37239V2(f6c0.f95654Y3);
        }
        if (IntlCountryCodeController.m28126v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f21883J0.getButtonRootLayout();
        buttonRootLayout.setId(u4c0.f174428q5);
        this.f21922d.addView(buttonRootLayout, this.f21883J0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m37349r4(Boolean bool) {
        act().m39801Z5().m39961C(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m37350r5() {
        m37143D6(StudentInfoAct.m44485V1(act(), "Chanel1.SchoolIdentifyPage.Shown", false));
    }

    /* JADX INFO: renamed from: r6 */
    public void m37351r6() {
        if (m37160H3()) {
            Animator animatorM103741n = bt0.m103741n(this.f21904U.mo126601l(), bt0.f77162i, 1.2f, 1.0f);
            animatorM103741n.setDuration(800L);
            animatorM103741n.setStartDelay(300L);
            animatorM103741n.start();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public VDraweeView m37352s2() {
        return this.f21861A;
    }

    /* JADX INFO: renamed from: s3 */
    public void m37353s3(boolean z, boolean z2) {
        this.f21900S.m132487l(Boolean.valueOf(z));
        this.f21882J.f140356J = z2;
        float f2 = !z ? 1 : 0;
        m37347r2().getRealView().setScaleX(f2);
        m37347r2().getRealView().setScaleY(f2);
        m37331o2().getRealView().setScaleX(f2);
        m37331o2().getRealView().setScaleY(f2);
        m37139D2().setScaleX(f2);
        m37139D2().setScaleY(f2);
        m37154G2().getRealView().setScaleX(f2);
        m37154G2().getRealView().setScaleY(f2);
        if (!m37359t5()) {
            m37297h2().setScaleX(f2);
            m37297h2().setScaleY(f2);
            m37311k2().setScaleX(f2);
            m37311k2().setScaleY(f2);
        }
        m37225S6();
        m37361u2().setRadarColor(this.f21892O);
        this.f21967y1 = xij0.m209660c0(m37361u2(), m37352s2(), !upa.m194847z());
        xdl0.m208345M0(this.f21964x, z);
        m37173J6();
        xdl0.m208345M0(this.f21922d, true);
        m37196N6(z);
        m37191M6(!z);
        if (IntlCountryCodeController.m28126v()) {
            if (NullChecker.m81303a(m37149F2())) {
                xdl0.m208344M(m37149F2(), !z);
            }
            if (NullChecker.m81303a(m37164I2())) {
                xdl0.m208344M(m37164I2(), !z);
            }
        }
        if (!m37359t5()) {
            m37212Q5(!z);
        }
        if (upa.m194675N3()) {
            m37266a6(!z);
        }
        View immediatelyMatch = this.f21883J0.getImmediatelyMatch();
        if (!u59.m191797F() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.setScaleX(f2);
        immediatelyMatch.setScaleY(f2);
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m37354s4(View view) {
        ubo uboVar = ubo.INSTANCE;
        uboVar.m192883d();
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
            m37230T5(uboVar.m192886g());
        }
        uboVar.m192893n(this.f21878H, 2);
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m37355s5(TabName tabName) {
        m37197O1();
    }

    /* JADX INFO: renamed from: s6 */
    public void m37356s6(final Settings settings, final e30<Boolean> e30Var, final d30 d30Var) {
        ViewGroup viewGroup = (ViewGroup) m37341q2().mo20578H2().inflate(f6c0.f95451L8, (ViewGroup) null, false);
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(u4c0.f174411p5);
        final ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(u4c0.f174333kc);
        View viewFindViewById = viewGroup.findViewById(u4c0.f174535wa);
        viewFindViewById.setBackgroundResource(x2c0.f189748T);
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        final dd80 dd80VarM110960O = new dd80.C16336a(this.f21878H).m110963R(viewGroup).m110961P(false).m110960O();
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.mx30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136120a.m37318l5(viewGroup2, viewGroup3, dd80VarM110960O, e30Var, d30Var, view);
            }
        });
        dd80VarM110960O.show();
        ygh0.m214657P(false);
        yij0.m214964t(viewGroup2, settings.hideContacts().booleanValue());
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: l.nx30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideContacts = Boolean.valueOf(yij0.m214942T(viewGroup2));
            }
        });
        yij0.m214964t(viewGroup3, !settings.hideMutualContacts().booleanValue());
        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: l.ox30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                settings.getSettingGroup().privacy.hideMutualContacts = Boolean.valueOf(!yij0.m214942T(viewGroup3));
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public final void m37357t3() {
        if (g6a.m124574w()) {
            ViewGroup viewGroup = (ViewGroup) this.f21916a.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m37358t4(View view) {
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
            m37230T5(cp60.INSTANCE.m108086e());
        }
        cp60.INSTANCE.m108087e0(this.f21878H, 2);
    }

    /* JADX INFO: renamed from: t5 */
    public boolean m37359t5() {
        return ogl0.m164222A() || ogl0.m164223B();
    }

    /* JADX INFO: renamed from: t6 */
    public void m37360t6() {
        ViewGroup viewGroup = (ViewGroup) this.f21880I.mo20578H2().inflate(f6c0.f96053ve, (ViewGroup) null, false);
        xdl0.m208368c0(viewGroup, t100.m186890d(32.0f));
        xdl0.m208374f0(viewGroup, t100.m186890d(32.0f));
        Settings settings = new Settings();
        settings.getSettingGroup().privacy.hideContacts = Boolean.TRUE;
        settings.getSettingGroup().privacy.hideMutualContacts = Boolean.FALSE;
        v9j v9jVar = new v9j() { // from class: l.rt30
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f160943a.m37323m5();
            }
        };
        viewGroup.addView((View) v9jVar.call(), 0);
        viewGroup.addView((View) v9jVar.call());
        act().dialog().m20503E0(R$string.f17861Jo).m20500D(R$string.f17801Ho).m20519O(viewGroup).m20559v().m20556t0(R$string.f17831Io, new Runnable() { // from class: l.st30
            @Override // java.lang.Runnable
            public final void run() {
                this.f166293a.m37339p5();
            }
        }).m20496B(false).m20567z().show();
    }

    /* JADX INFO: renamed from: u2 */
    public kol m37361u2() {
        return this.f21879H0;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m37362u3() {
        if (C7865a.INSTANCE.m36997j()) {
            SVGAnimationView sVGAnimationViewMo126597h = this.f21904U.mo126597h();
            adi0 adi0Var = adi0.INSTANCE;
            xdl0.m208344M(sVGAnimationViewMo126597h, adi0Var.m95900e() != -1);
            xdl0.m208344M(this.f21904U.mo126600k(), adi0Var.m95900e() != -1);
            if (adi0Var.m95900e() != -1) {
                this.f21882J.m161162U4();
                xdl0.m208329E0(this.f21904U.mo126597h(), new View.OnClickListener() { // from class: l.cv30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f82635a.m37387z4(view);
                    }
                });
                zvf0.m220402x("e_suggest_tarot_entrance", "p_suggest_users_home_view");
                hei0.m130636a(this.f21878H, false);
            }
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m37363u4(View view) {
        if (this.f21904U.mo126601l().isAnimating()) {
            this.f21904U.mo126601l().stopAnimation(true);
            m37230T5(qff0.INSTANCE.m174294f());
        }
        qff0.INSTANCE.m174302n(this.f21878H, 2);
    }

    /* JADX INFO: renamed from: u5, reason: merged with bridge method [inline-methods] */
    public final void m37161H4(wsf0 wsf0Var, mol molVar) {
        if (wsf0Var.mo38809d() == null) {
            return;
        }
        if ((mah0.m153720m0() && NullChecker.m81303a(wsf0Var.mo38813j()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d()) && (mah0.m153738y0(wsf0Var.mo38818o().m141745d().f56011id) || wsf0Var.mo38813j() == null)) || wsf0Var.m161387q() || wsf0Var.m161385f()) {
            return;
        }
        if (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141746e()) && CoreModule.f17545c.f19663m0.f19408e2.m34219x3(wsf0Var.mo38818o().m141746e())) {
            return;
        }
        if (wsf0Var.mo38816m()) {
            wsf0Var.mo38817n();
            return;
        }
        if (wsf0Var.mo38809d() instanceof e5m) {
            ExpandedCardStyleHelper.m38090o().m38098m(wsf0Var.mo38818o().m141745d(), wsf0Var.mo38813j());
            return;
        }
        a5m a5mVar = wsf0Var.mo38809d() instanceof a5m ? (a5m) wsf0Var.mo38809d() : null;
        if (NullChecker.m81303a(a5mVar) && CoreModule.m29934N().mo60294M8()) {
            NewNewProfileCard.m36787Y1();
        }
        if (NullChecker.m81303a(a5mVar)) {
            a5mVar.mo36806C();
        }
        int i2 = (a5mVar == null || ((a5mVar instanceof d5m) && !((d5m) a5mVar).mo36842P())) ? 1 : 0;
        boolean z = NullChecker.m81303a(a5mVar) && NullChecker.m81303a(a5mVar.getCardData()) && NullChecker.m81303a(a5mVar.getCardData().m141746e()) && (a5mVar.getCardData().m141746e().isUserLikeMe() || (CoreModule.f17557o.m195055b().mo33649wf() && a5mVar.getCardData().m141746e().hasLikeMeSlideCardTop));
        String str = z ? "upper_right" : "null";
        if (NullChecker.m81303a(a5mVar) && a5mVar.mo36809D("female_like_flag_lower_left")) {
            str = "lower_left";
            z = true;
        }
        CoreSuggested.UserInfo userInfoMo38813j = m37125A2().mo38813j();
        CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
        ArrayList arrayListM200324f0 = vwb.m200324f0(o6j0.C18854a.m162876f("IsWhiteBlock", i2), o6j0.C18854a.m162878h("moments_user_id", NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0"), o6j0.C18854a.m162879i("show_he_liked", z), o6j0.C18854a.m162878h("show_he_liked_position", str), o6j0.C18854a.m162879i("is_first_picture", this.f21882J.m161221g6(NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0") && molVar.getShowPictureIndexProxy() == 0), o6j0.C18854a.m162878h("swipe_scene", "default"), o6j0.C18854a.m162879i("theme_card_ornot", NullChecker.m81303a(userInfoMo38813j) && userInfoMo38813j.isThemeCard), o6j0.C18854a.m162878h("is_moment_card", molVar.mo36950z() ? "1" : "0"), o6j0.C18854a.m162878h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56008id : "0"), o6j0.C18854a.m162878h("is_show_longtimenosee_tag", (upa.m194809r1() && NullChecker.m81303a(userInfoMo38813j) && userInfoMo38813j.meetAgain) ? "1" : "0"));
        if (upa.m194675N3() && NullChecker.m81303a(userInfoMo38813j)) {
            for (Map.Entry<String, String> entry : userInfoMo38813j.trackMap.entrySet()) {
                arrayListM200324f0.add(o6j0.C18854a.m162878h(entry.getKey(), entry.getValue()));
            }
        }
        o6j0.m162859c(MatchScData.ModuleId.mid_e_card, this.f21880I.pageId(), (o6j0.C18854a[]) arrayListM200324f0.toArray(new o6j0.C18854a[0]));
        if (molVar.mo36950z()) {
            o6j0.m162859c("e_moment", this.f21880I.pageId(), o6j0.C18854a.m162878h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56008id : "0"), o6j0.C18854a.m162878h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0"));
        }
        abi.m95650y(true);
        m37148E6((sb90.m183209e(m37125A2().mo38818o().m141745d()) && NullChecker.m81303a(userInfoMo38813j) && NullChecker.m81303a(userInfoMo38813j.cityCData)) ? "from_city_center_conv_banner" : "home_card", act().color(w0c0.f183793O1));
        HashMap map = new HashMap();
        map.put("Action", "More user info");
        w85.INSTANCE.m202145m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u6 */
    public void m37365u6(String str, String str2, String str3, int i2, int i3, Figure figure, double d2, final d30 d30Var) {
        d30 d30Var2 = new d30() { // from class: l.lv30
            @Override // p149l.d30
            public final void call() {
                this.f130119a.m37344q5(d30Var);
            }
        };
        if (!d8e0.m110322a(CoreModule.f17545c.f19639e0.m169527p9()) || !NullChecker.m81303a(figure) || !TEnum.equals(figure.type, "distance") || figure.total <= 0) {
            act().m39817g7(str2, str, figure, str3, d2, d30Var2);
        } else {
            act().m39817g7(rza.m181722B0(act(), i3, i2, figure), str, figure, str3, d2, d30Var2);
        }
    }

    /* JADX INFO: renamed from: v2 */
    public nt30 m37366v2() {
        return this.f21882J;
    }

    /* JADX INFO: renamed from: v3 */
    public final void m37367v3() {
        if (upa.m194675N3()) {
            this.f21893O0 = new HomeCardTopNameViewBar(act());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            this.f21893O0.setLayoutParams(layoutParams);
            xdl0.m208344M(this.f21893O0, false);
            this.f21922d.addView(this.f21893O0);
            this.f21893O0.bringToFront();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Unit m37368v4(Long l2) {
        m37242V5(2);
        return null;
    }

    /* JADX INFO: renamed from: v5 */
    public void m37369v5(boolean z) {
        this.f21948p0 = z;
        if (z && NullChecker.m81303a(act())) {
            m37207P5();
            dbl0.m110646a(act().getWindow().getDecorView(), false);
        }
        if (!z && xdl0.m208349O0(m37297h2())) {
            m37209Q1();
        }
        if (this.f21948p0 && NullChecker.m81303a(m37125A2()) && NullChecker.m81303a(m37125A2().mo38809d()) && (m37125A2().mo38809d() instanceof a5m)) {
            ((a5m) m37125A2().mo38809d()).mo36806C();
        }
        if (this.f21948p0 && u59.m191823d0()) {
            j8w.INSTANCE.m140473a().m140463r1();
        }
        if (!this.f21948p0) {
            CoreModule.f17545c.f19550A1.m182440t3(this.f21878H, new Function1() { // from class: l.ow30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC7866b.m37038R0((IntlMarketConfigEnvelope) obj);
                }
            });
        }
        if (z) {
            return;
        }
        m37202O6();
        m37197O1();
    }

    /* JADX INFO: renamed from: v6 */
    public void m37370v6() {
        if (m37165I3()) {
            return;
        }
        this.f21883J0.getSuperLikeRemaining().setText(String.valueOf(swh0.m186270v0()));
        rxg0.m181572j();
        rxg0.m181560G(this.f21878H, m37144E2(), this.f21883J0.getSuperLikeRemaining());
    }

    /* JADX INFO: renamed from: w2 */
    public View m37371w2() {
        if (upa.m194675N3()) {
            return this.f21883J0.getUndo().getRealView();
        }
        if (wh5.m203106d().m203108e()) {
            wh5.m203106d().f186361b = false;
        }
        return this.f21883J0.getUndo().getRealView();
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ Unit m37373w4() {
        m37242V5(1);
        return null;
    }

    /* JADX INFO: renamed from: w5 */
    public void m37374w5() {
        m37307j3();
        pon ponVar = this.f21884K;
        if (ponVar != null) {
            ponVar.m170630m();
        }
    }

    /* JADX INFO: renamed from: w6 */
    public void m37375w6(boolean z) {
        if (m37139D2().getScaleY() == 1.0f && m37320m2()) {
            if (upa.m194723Z2() && CoreModule.f17545c.f19704z2.m30255r3()) {
                return;
            }
            rxg0.m181572j().m181594v();
            if (!m37155G3()) {
                rxg0.m181572j().m181597y(m37325n2(this.f21880I), this.f21880I, m37139D2(), z);
            }
            if (m37232U1(this.f21880I)) {
                return;
            }
            m37157G5(true);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m37376x3() {
        this.f21885K0 = (HomeViewUSLayout) this.f21958u.inflate();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m37377x4(View view) {
        zvf0.m220396r("e_same_entrance", "p_suggest_users_home_view");
        C8411a.INSTANCE.m46885f(this.f21878H, true);
    }

    /* JADX INFO: renamed from: x5 */
    public void m37378x5() {
        if (NullChecker.m81303a(this.f21883J0.getButtonsRightLayout())) {
            xdl0.m208344M(this.f21883J0.getButtonsRightLayout(), false);
            if (NullChecker.m81303a(this.f21891N0)) {
                xdl0.m208344M(this.f21891N0, false);
            }
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final void m37379x6() {
        if (!NullChecker.m81303a(m37125A2().mo38818o()) || !NullChecker.m81303a(m37125A2().mo38818o().m141745d()) || !ogl0.m164248a0() || CoreModule.f17545c.f19639e0.m169476c8() || CoreModule.f17545c.f19639e0.m169520na().isJailed() || swh0.m186270v0() <= 0 || myc0.m157001d0().f136288m.contains(m37125A2().mo38818o().m141745d().f56011id) || !myc0.m157001d0().m157006g0()) {
            return;
        }
        m37370v6();
        myc0.m157001d0().f136288m.add(m37125A2().mo38818o().m141745d().f56011id);
        myc0.m157001d0().m157011m0();
    }

    /* JADX INFO: renamed from: y2 */
    public Runnable m37380y2() {
        return this.f21894P;
    }

    /* JADX INFO: renamed from: y3 */
    public void m37381y3() {
        final wsf0 wsf0VarM37125A2 = m37125A2();
        m37283e3();
        m37372w3(wsf0VarM37125A2);
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f21885K0)) {
            this.f21885K0.f22885b.setOnClickListener(new View.OnClickListener() { // from class: l.zt30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204668a.m37183L4(wsf0VarM37125A2, view);
                }
            });
            this.f21885K0.f22886c.setOnClickListener(new View.OnClickListener() { // from class: l.lu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130030a.m37189M4(wsf0VarM37125A2, view);
                }
            });
            xdl0.m208345M0(this.f21885K0.f22909z, true);
            xdl0.m208325C0(m37316l2(), 0);
            xdl0.m208378h0(this.f21922d, 0);
            xdl0.m208345M0(this.f21885K0.f22884a, true);
            if (upa.m194675N3()) {
                wsf0VarM37125A2.setUsHomeExpandCardAnimHelper(new ehj0(act(), wsf0VarM37125A2, this.f21920c));
            } else {
                chj0 chj0Var = new chj0(act(), wsf0VarM37125A2, this.f21920c);
                this.f21902T = chj0Var;
                wsf0VarM37125A2.setUsHomeCardAnimHelper(chj0Var);
            }
            xdl0.m208329E0(this.f21885K0.f22880C, new View.OnClickListener() { // from class: l.nu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.m37084l(wsf0VarM37125A2, view);
                }
            });
            xdl0.m208329E0(this.f21885K0.f22879B, new View.OnClickListener() { // from class: l.ou30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.m37071f1(wsf0VarM37125A2, view);
                }
            });
            xdl0.m208329E0(this.f21885K0.f22881D, new View.OnClickListener() { // from class: l.pu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151242a.m37194N4(view);
                }
            });
            xdl0.m208329E0(this.f21885K0.f22882E, new View.OnClickListener() { // from class: l.qu30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156424a.m37200O4(view);
                }
            });
            this.f21885K0.f22879B.setLongPressingListener(new f());
        } else {
            this.f21883J0.getButtonRootLayout().setClipChildren(false);
            this.f21883J0.getButtonRootLayout().setClipToPadding(false);
        }
        if (!vdj.m198001c() && IntlCountryCodeController.m28119o()) {
            m37262a2();
            if (nkp.m159986e()) {
                m37277d2();
            }
        } else {
            m37277d2();
        }
        if (!IntlCountryCodeController.m28124t()) {
            act().duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19583L1.m210252d3().onBackpressureLatest().observeOn(jo0.m142408a()), CoreModule.f17545c.f19550A1.m182435l3().onBackpressureLatest().observeOn(jo0.m142408a()), this.f21900S.asObservable().filter(new w9j() { // from class: l.ru30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f161018a.m37126A4((Boolean) obj);
                }
            }), new y9j() { // from class: l.tu30
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return j760.m140076a(Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue()), (Boolean) obj3);
                }
            })).filter(new w9j() { // from class: l.uu30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f178313a.m37131B4((j760) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.vu30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183026a.m37136C4((j760) obj);
                }
            }, new e30() { // from class: l.au30
                @Override // p149l.e30
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.m37086l1((Throwable) obj);
                }
            }));
            act().duringCreated(CoreModule.f17545c.f19550A1.m182433j3()).filter(new w9j() { // from class: l.bu30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f77279a.m37141D4((Boolean) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.cu30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82526a.m37146E4((Boolean) obj);
                }
            }, new e30() { // from class: l.du30
                @Override // p149l.e30
                public final void call(Object obj) {
                    ViewTreeObserverOnGlobalLayoutListenerC7866b.m37043U((Throwable) obj);
                }
            }));
        }
        m37053Y2();
        this.f21892O = act().color(w0c0.f183773I);
        this.f21888M = new C7943c(this.f21882J, this);
        if (upa.m194675N3()) {
            m37267b2(this.f21888M);
        }
        wsf0VarM37125A2.setAdapter(this.f21888M);
        m37347r2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.eu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93214a.m37151F4(wsf0VarM37125A2, view);
            }
        });
        m37331o2().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.fu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99304a.m37156G4(wsf0VarM37125A2, view);
            }
        });
        View realView = m37347r2().getRealView();
        n nVar = new n();
        this.f21864B1 = nVar;
        realView.setOnTouchListener(nVar);
        View realView2 = m37331o2().getRealView();
        n nVar2 = new n();
        this.f21866C1 = nVar2;
        realView2.setOnTouchListener(nVar2);
        this.f21915Z0 = xck0.m208120a(500, new e30() { // from class: l.gu30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104375a.m37161H4(wsf0VarM37125A2, (mol) obj);
            }
        });
        wsf0VarM37125A2.mo38812i(new e30() { // from class: l.iu30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114968a.m37166I4(obj);
            }
        });
        wsf0VarM37125A2.mo38819p(new g(wsf0VarM37125A2));
        final nt30 nt30Var = this.f21882J;
        Objects.requireNonNull(nt30Var);
        wsf0VarM37125A2.mo38811g(new id50() { // from class: l.ju30
            @Override // p149l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo111028a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return nt30Var.m161300y8(molVar, swipeDirection, z);
            }
        });
        xij0.m209657Z(m37352s2(), new d30() { // from class: l.ku30
            @Override // p149l.d30
            public final void call() {
                this.f124643a.m37171J4();
            }
        });
        wsf0VarM37125A2.setAllowUpSwipe(true);
        m37371w2().setOnClickListener(new View.OnClickListener() { // from class: l.mu30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135722a.m37177K4(wsf0VarM37125A2, view);
            }
        });
        xdl0.m208376g0(this.f21904U.mo126592c());
        xdl0.m208362Z(this.f21918b);
        xdl0.m208362Z(this.f21920c);
        m37244W2();
        CoreBusinessModule.m29908m0().mo190524k(this);
        if (upa.m194619C2()) {
            if (this.f21883J0.getUndo() != null) {
                this.f21883J0.getUndo().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
            }
            this.f21883J0.getDislikeBtn().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
            this.f21883J0.getLikeBtn().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
            this.f21883J0.getSuperLike().setNormalStateLayerBackground(this.f21878H.drawable(this.f21883J0.getOperationBtnBg()));
        }
        m37337p3();
        m37288f3();
        if (u59.m191798G()) {
            m37258Z2();
        } else if (u59.m191800I()) {
            m37263a3();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m37382y4(View view) {
        CoreModule.f17557o.m195057d().mo33738Pa(getContext());
        zvf0.m220396r("e_suggest_users_home_location", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: y5 */
    public void m37383y5() {
        if (NullChecker.m81303a(m37125A2())) {
            m37125A2().mo38806a();
        }
    }

    /* JADX INFO: renamed from: y6 */
    public void m37384y6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C4348d.m20896l().m20908t(new C4345a(act()).m20853H(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m20876r(str2).m20849D(str).m20882x(t100.m186890d(8.0f)).m20870k(Color.parseColor(str3)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20873o(C4345a.f15682P, t100.m186890d(1.0f)).m20861b(3500L).m20875q(C4345a.f15682P | C4345a.f15680N), this.f21962w.f23946t);
    }

    /* JADX INFO: renamed from: z2 */
    public FrameLayout m37385z2() {
        return this.f21916a;
    }

    /* JADX INFO: renamed from: z3 */
    public final void m37386z3() {
        User userM141745d;
        if (!u59.m191800I() || this.f21885K0 == null || m37125A2() == null || m37125A2().mo38818o() == null || (userM141745d = m37125A2().mo38818o().m141745d()) == null) {
            return;
        }
        if ((m37125A2().mo38809d() instanceof VirtualCard) && ((VirtualCard) m37125A2().mo38809d()).getCardType() == VirtualCardType.IntlRecallMembershipCard) {
            hmb.m131701M(this.f21885K0.f22894k, false);
            hmb.m131701M(this.f21885K0.f22895l, false);
            return;
        }
        boolean zM38369r = HomeCardBottomOptButtons.m38369r(userM141745d);
        if (zM38369r) {
            String strM107929a = co5.m107929a("home_card_us_compliment_btn");
            if (!TextUtils.isEmpty(strM107929a)) {
                co5.m107934f(NullChecker.m81303a(this.f21880I) ? this.f21880I.pageId() : "p_suggest_users_home_view", strM107929a);
            }
        }
        hmb.m131701M(this.f21885K0.f22894k, !zM38369r);
        hmb.m131701M(this.f21885K0.f22895l, zM38369r);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m37387z4(View view) {
        zvf0.m220396r("e_suggest_tarot_entrance", "p_suggest_users_home_view");
        oci0.m163519a(this.f21878H);
    }

    /* JADX INFO: renamed from: z5 */
    public void m37388z5(ArrayList<Media> arrayList) {
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81304b(userM169527p9)) {
            this.f21878H.progress(R$string.f17842J5);
            Media media = arrayList.get(0);
            final User user = new User();
            user.pictures = new ArrayList();
            this.f21878H.duringCreated((C22306c) ya5.m213793I(vwb.m200324f0(media), "petPhoto").compose(mkd0.m154951C())).map(new w9j() { // from class: l.ov30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC7866b.m37066e((List) obj);
                }
            }).map(new w9j() { // from class: l.zv30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ViewTreeObserverOnGlobalLayoutListenerC7866b.m37078j(userM169527p9, user, (Picture) obj);
                }
            }).flatMap(new w9j() { // from class: l.kw30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169547u9((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.vw30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183300a.m37211Q4((roj0) obj);
                }
            }, new e30() { // from class: l.gx30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104825a.m37217R4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z6 */
    public void m37389z6(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        C4348d.m20896l().m20908t(new C4345a(act()).m20853H(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m20876r(str2).m20849D(str).m20882x(t100.m186890d(8.0f)).m20870k(Color.parseColor(str3)).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20873o(C4345a.f15682P, t100.m186890d(1.0f)).m20861b(3500L).m20875q(C4345a.f15682P | C4345a.f15680N), this.f21962w.f23946t);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: w3 */
    public final void m37372w3(wsf0 wsf0Var) {
    }
}
