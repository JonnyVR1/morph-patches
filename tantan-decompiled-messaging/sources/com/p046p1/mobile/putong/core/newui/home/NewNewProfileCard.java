package com.p046p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.IntlInsertCardData;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p046p1.mobile.putong.core.data.RiskOtherData;
import com.p046p1.mobile.putong.core.data.SamesCardData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7869c;
import com.p046p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import com.p046p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p046p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.animalfacial.AnimalFacialCardView;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.core.p053ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p046p1.mobile.putong.core.p053ui.likeminded.LikeMindedCardTabView;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.C16319da;
import p149l.a5m;
import p149l.bfd0;
import p149l.bol;
import p149l.bt0;
import p149l.c4g0;
import p149l.cfd0;
import p149l.chj0;
import p149l.d30;
import p149l.d5m;
import p149l.e30;
import p149l.e51;
import p149l.e5l;
import p149l.e900;
import p149l.f6c0;
import p149l.fce;
import p149l.ffx;
import p149l.gwp;
import p149l.hol;
import p149l.hpd0;
import p149l.ht20;
import p149l.idr;
import p149l.iz30;
import p149l.j760;
import p149l.j8w;
import p149l.jj4;
import p149l.l9j;
import p149l.lac0;
import p149l.lra0;
import p149l.mah0;
import p149l.mkd0;
import p149l.mol;
import p149l.mqi0;
import p149l.myc0;
import p149l.njf0;
import p149l.o6j0;
import p149l.o7r;
import p149l.ogl0;
import p149l.oql;
import p149l.p9w;
import p149l.q8p;
import p149l.qff0;
import p149l.qib0;
import p149l.qm4;
import p149l.qol0;
import p149l.rjj;
import p149l.rk4;
import p149l.roj0;
import p149l.rxg0;
import p149l.swh0;
import p149l.t100;
import p149l.tm90;
import p149l.u4c0;
import p149l.u59;
import p149l.ua60;
import p149l.uc80;
import p149l.upa;
import p149l.uy30;
import p149l.v9j;
import p149l.vtd;
import p149l.vwb;
import p149l.w85;
import p149l.w9j;
import p149l.wc80;
import p149l.wp0;
import p149l.x2c0;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xij0;
import p149l.xp5;
import p149l.znl;
import p149l.zub;
import p149l.zvf0;
import p149l.zzc0;

/* JADX INFO: loaded from: classes11.dex */
public class NewNewProfileCard extends VSwipeCard implements znl, RunnableC4733c0.c, mol, hol, d5m, qm4 {

    /* JADX INFO: renamed from: N2 */
    public static C4348d f21680N2;

    /* JADX INFO: renamed from: O2 */
    public static final int f21681O2 = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: P2 */
    public static float f21682P2 = xdl0.m208408w0() * 1.5f;

    /* JADX INFO: renamed from: A1 */
    public LinearLayout f21683A1;

    /* JADX INFO: renamed from: A2 */
    public View f21684A2;

    /* JADX INFO: renamed from: B1 */
    public VText f21685B1;

    /* JADX INFO: renamed from: B2 */
    public String f21686B2;

    /* JADX INFO: renamed from: C1 */
    public VFrame f21687C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f21688C2;

    /* JADX INFO: renamed from: D1 */
    public ViewStub f21689D1;

    /* JADX INFO: renamed from: D2 */
    public c4g0 f21690D2;

    /* JADX INFO: renamed from: E0 */
    public LinearMeasureOrderLayout f21691E0;

    /* JADX INFO: renamed from: E1 */
    public CardType f21692E1;

    /* JADX INFO: renamed from: E2 */
    public c4g0 f21693E2;

    /* JADX INFO: renamed from: F0 */
    public VFrame f21694F0;

    /* JADX INFO: renamed from: F1 */
    public VirtualCard f21695F1;

    /* JADX INFO: renamed from: F2 */
    public boolean f21696F2;

    /* JADX INFO: renamed from: G0 */
    public SVGAnimationView f21697G0;

    /* JADX INFO: renamed from: G1 */
    public bol f21698G1;

    /* JADX INFO: renamed from: G2 */
    public c4g0 f21699G2;

    /* JADX INFO: renamed from: H0 */
    public VText f21700H0;

    /* JADX INFO: renamed from: H1 */
    public int f21701H1;

    /* JADX INFO: renamed from: H2 */
    public String f21702H2;

    /* JADX INFO: renamed from: I0 */
    public TextView f21703I0;

    /* JADX INFO: renamed from: I1 */
    public boolean f21704I1;

    /* JADX INFO: renamed from: I2 */
    public float f21705I2;

    /* JADX INFO: renamed from: J0 */
    public VText f21706J0;

    /* JADX INFO: renamed from: J1 */
    public boolean f21707J1;

    /* JADX INFO: renamed from: J2 */
    public float f21708J2;

    /* JADX INFO: renamed from: K0 */
    public VText f21709K0;

    /* JADX INFO: renamed from: K1 */
    public SwipeGuideRightView f21710K1;

    /* JADX INFO: renamed from: K2 */
    public int f21711K2;

    /* JADX INFO: renamed from: L0 */
    public VLinear f21712L0;

    /* JADX INFO: renamed from: L1 */
    public Animator f21713L1;

    /* JADX INFO: renamed from: L2 */
    public boolean f21714L2;

    /* JADX INFO: renamed from: M */
    public NewNewProfileCard f21715M;

    /* JADX INFO: renamed from: M0 */
    public ImageView f21716M0;

    /* JADX INFO: renamed from: M1 */
    public c4g0 f21717M1;

    /* JADX INFO: renamed from: M2 */
    public boolean f21718M2;

    /* JADX INFO: renamed from: N */
    public LinearLayout f21719N;

    /* JADX INFO: renamed from: N0 */
    public TextView f21720N0;

    /* JADX INFO: renamed from: N1 */
    public View f21721N1;

    /* JADX INFO: renamed from: O */
    public View f21722O;

    /* JADX INFO: renamed from: O0 */
    public VText f21723O0;

    /* JADX INFO: renamed from: O1 */
    public Animator f21724O1;

    /* JADX INFO: renamed from: P */
    public VLinear f21725P;

    /* JADX INFO: renamed from: P0 */
    public VText f21726P0;

    /* JADX INFO: renamed from: P1 */
    public Animator f21727P1;

    /* JADX INFO: renamed from: Q */
    public View f21728Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f21729Q0;

    /* JADX INFO: renamed from: Q1 */
    public View f21730Q1;

    /* JADX INFO: renamed from: R */
    public CardBottomMomentCardTwoView f21731R;

    /* JADX INFO: renamed from: R0 */
    public VDraweeView f21732R0;

    /* JADX INFO: renamed from: R1 */
    public Animator f21733R1;

    /* JADX INFO: renamed from: S */
    public View f21734S;

    /* JADX INFO: renamed from: S0 */
    public VText f21735S0;

    /* JADX INFO: renamed from: S1 */
    public jj4 f21736S1;

    /* JADX INFO: renamed from: T */
    public PictureView f21737T;

    /* JADX INFO: renamed from: T0 */
    public VText f21738T0;

    /* JADX INFO: renamed from: T1 */
    public final boolean f21739T1;

    /* JADX INFO: renamed from: U */
    public Space f21740U;

    /* JADX INFO: renamed from: U0 */
    public VImage f21741U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f21742U1;

    /* JADX INFO: renamed from: V */
    public View f21743V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f21744V0;

    /* JADX INFO: renamed from: V1 */
    public boolean f21745V1;

    /* JADX INFO: renamed from: W */
    public View f21746W;

    /* JADX INFO: renamed from: W0 */
    public CardBottomLiveView f21747W0;

    /* JADX INFO: renamed from: W1 */
    public boolean f21748W1;

    /* JADX INFO: renamed from: X0 */
    public CardBottomMomentGreetView f21749X0;

    /* JADX INFO: renamed from: X1 */
    public boolean f21750X1;

    /* JADX INFO: renamed from: Y0 */
    public CardBottomDefaultLayout f21751Y0;

    /* JADX INFO: renamed from: Y1 */
    public Runnable f21752Y1;

    /* JADX INFO: renamed from: Z0 */
    public CardBottomIntlLiveLayout f21753Z0;

    /* JADX INFO: renamed from: Z1 */
    public Runnable f21754Z1;

    /* JADX INFO: renamed from: a1 */
    public CardBottomIntlVoiceLayout f21755a1;

    /* JADX INFO: renamed from: a2 */
    public boolean f21756a2;

    /* JADX INFO: renamed from: b1 */
    public CardBottomTagLayout f21757b1;

    /* JADX INFO: renamed from: b2 */
    public int f21758b2;

    /* JADX INFO: renamed from: c1 */
    public CardBottomMomentLayout f21759c1;

    /* JADX INFO: renamed from: c2 */
    public boolean f21760c2;

    /* JADX INFO: renamed from: d1 */
    public VLinear f21761d1;

    /* JADX INFO: renamed from: d2 */
    public View f21762d2;

    /* JADX INFO: renamed from: e1 */
    public VIcon f21763e1;

    /* JADX INFO: renamed from: e2 */
    public VImage f21764e2;

    /* JADX INFO: renamed from: f1 */
    public VImage f21765f1;

    /* JADX INFO: renamed from: f2 */
    public VText f21766f2;

    /* JADX INFO: renamed from: g1 */
    public VImage f21767g1;

    /* JADX INFO: renamed from: g2 */
    public VDraweeView f21768g2;

    /* JADX INFO: renamed from: h1 */
    public ViewStub f21769h1;

    /* JADX INFO: renamed from: h2 */
    public AnimalFacialCardView f21770h2;

    /* JADX INFO: renamed from: i1 */
    public ViewStub f21771i1;

    /* JADX INFO: renamed from: i2 */
    public RegularStickerCardTabView f21772i2;

    /* JADX INFO: renamed from: j1 */
    public LikeMindedCardTabView f21773j1;

    /* JADX INFO: renamed from: j2 */
    public IntlCommercialCardBottomActionLayout f21774j2;

    /* JADX INFO: renamed from: k0 */
    public View f21775k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f21776k1;

    /* JADX INFO: renamed from: k2 */
    public final rk4 f21777k2;

    /* JADX INFO: renamed from: l1 */
    public VText f21778l1;

    /* JADX INFO: renamed from: l2 */
    public hpd0 f21779l2;

    /* JADX INFO: renamed from: m1 */
    public ViewStub f21780m1;

    /* JADX INFO: renamed from: m2 */
    public boolean f21781m2;

    /* JADX INFO: renamed from: n1 */
    public ViewStub f21782n1;

    /* JADX INFO: renamed from: n2 */
    public CoreSuggested.UserInfo f21783n2;

    /* JADX INFO: renamed from: o1 */
    public ViewStub f21784o1;

    /* JADX INFO: renamed from: o2 */
    public CoreMomentInfo f21785o2;

    /* JADX INFO: renamed from: p0 */
    public View f21786p0;

    /* JADX INFO: renamed from: p1 */
    public SuperLikeBanner f21787p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f21788p2;

    /* JADX INFO: renamed from: q1 */
    public SwipeLikeButton f21789q1;

    /* JADX INFO: renamed from: q2 */
    public InterfaceC7863d f21790q2;

    /* JADX INFO: renamed from: r1 */
    public SwipeLikeButton f21791r1;

    /* JADX INFO: renamed from: r2 */
    public boolean f21792r2;

    /* JADX INFO: renamed from: s1 */
    public NewPictureContainerIndicator f21793s1;

    /* JADX INFO: renamed from: s2 */
    public boolean f21794s2;

    /* JADX INFO: renamed from: t1 */
    public ViewStub f21795t1;

    /* JADX INFO: renamed from: t2 */
    public String f21796t2;

    /* JADX INFO: renamed from: u1 */
    public ViewStub f21797u1;

    /* JADX INFO: renamed from: u2 */
    public chj0 f21798u2;

    /* JADX INFO: renamed from: v1 */
    public ViewStub f21799v1;

    /* JADX INFO: renamed from: v2 */
    public User f21800v2;

    /* JADX INFO: renamed from: w1 */
    public ViewStub f21801w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f21802w2;

    /* JADX INFO: renamed from: x1 */
    public ViewStub f21803x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f21804x2;

    /* JADX INFO: renamed from: y1 */
    public LinearLayout f21805y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f21806y2;

    /* JADX INFO: renamed from: z1 */
    public VText f21807z1;

    /* JADX INFO: renamed from: z2 */
    public d30 f21808z2;

    public enum CardType {
        unknown("unknown"),
        profile("profile"),
        virtual_card(CoreSuggested.UserInfo.VIRTUAL_CARD);


        /* JADX INFO: renamed from: id */
        public String f21809id;

        CardType(String str) {
            this.f21809id = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$a */
    public class C7860a implements d30 {
        public C7860a() {
        }

        @Override // p149l.d30
        public void call() {
            NewNewProfileCard.this.f21742U1 = false;
            NewNewProfileCard.this.f21787p1.m39202i();
            xdl0.m208345M0(NewNewProfileCard.this.f21787p1, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$b */
    public static /* synthetic */ class C7861b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21811a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f21811a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21811a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21811a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$c */
    public interface InterfaceC7862c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$d */
    public interface InterfaceC7863d {
    }

    public NewNewProfileCard(Context context) {
        super(context);
        this.f21704I1 = false;
        this.f21707J1 = false;
        this.f21736S1 = null;
        this.f21739T1 = upa.m194761h3();
        this.f21742U1 = false;
        this.f21745V1 = false;
        this.f21748W1 = false;
        this.f21750X1 = false;
        this.f21760c2 = false;
        this.f21762d2 = null;
        this.f21764e2 = null;
        this.f21766f2 = null;
        this.f21777k2 = new rk4();
        this.f21779l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f21781m2 = false;
        this.f21783n2 = null;
        this.f21788p2 = false;
        this.f21790q2 = new InterfaceC7863d() { // from class: l.ty30
        };
        this.f21792r2 = false;
        this.f21794s2 = false;
        this.f21808z2 = new C7860a();
        this.f21688C2 = false;
        this.f21696F2 = false;
        this.f21711K2 = t100.m186890d(15.0f);
        this.f21714L2 = false;
        this.f20291d = true;
        addView(new View(m36858V1()));
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m36768C3() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return true;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterLikeLimit counterLikeLimit = counterM31484o3 == null ? null : counterM31484o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !userM169527p9.isVIP();
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m36772G1(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ Unit m36774I1() {
        CoreModule.f17545c.f19663m0.f19420i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m36784S1(Throwable th) {
    }

    /* JADX INFO: renamed from: W2 */
    private void m36786W2(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m220215n(media);
        } else if (media instanceof Video) {
            qib0.f154691G.m102377x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m36787Y1() {
        if (NullChecker.m81303a(f21680N2) && f21680N2.m20912x("user_state_bubble")) {
            f21680N2.m20900k("user_state_bubble");
        }
    }

    /* JADX INFO: renamed from: o3 */
    private void m36788o3(int i) {
        List<Media> list;
        User user = this.f21800v2;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f21800v2.media(i);
        this.f21737T.setShowPetTag(true);
        this.f21737T.setIsFemale(this.f21800v2.isFemale());
        if (m36919p2(this.f21800v2, this.f21783n2)) {
            this.f21737T.m43996a0(media, -1, false, true);
            return;
        }
        boolean zM34219x3 = CoreModule.f17545c.f19663m0.f19408e2.m34219x3(this.f21783n2);
        LinearLayout linearLayout = this.f21805y1;
        if (zM34219x3) {
            xdl0.m208345M0(linearLayout, false);
            this.f21737T.m43994Y(media, 60);
        } else {
            xdl0.m208345M0(linearLayout, false);
            this.f21737T.m43993X(media);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m36791r1(View view, int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m36831L2(Drawable drawable) {
        this.f21684A2 = o7r.m163037a(m36858V1()).inflate(f6c0.f95291B8, (ViewGroup) this, false);
        mkd0.m154992z(this.f21690D2);
        mkd0.m154992z(this.f21693E2);
        VImage vImage = (VImage) this.f21684A2.findViewById(u4c0.f174188c2);
        VText vText = (VText) this.f21684A2.findViewById(u4c0.f173961O6);
        VText vText2 = (VText) this.f21684A2.findViewById(u4c0.f173779Db);
        VText vText3 = (VText) this.f21684A2.findViewById(u4c0.f174560y1);
        if (NullChecker.m81303a(this.f21800v2)) {
            vText.setText(TEnum.equals(this.f21800v2.gender, "female") ? m36858V1().getString(R$string.f18441d1) : m36858V1().getString(R$string.f18471e1));
            vText2.setText(TEnum.equals(this.f21800v2.gender, "female") ? m36858V1().getString(R$string.f18379b1) : m36858V1().getString(R$string.f18410c1));
            vText3.setText(TEnum.equals(this.f21800v2.gender, "female") ? m36858V1().getString(R$string.f18502f1) : m36858V1().getString(R$string.f18533g1));
        }
        View viewFindViewById = this.f21684A2.findViewById(u4c0.f174205d2);
        int paddingBottom = this.f21725P.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = paddingBottom;
        viewFindViewById.setLayoutParams(layoutParams);
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19460w0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        lra0.f129536w = true;
        vImage.setBackground(drawable);
        addView(this.f21684A2);
        xdl0.m208329E0(this.f21684A2, new View.OnClickListener() { // from class: l.ey30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93720a.m36818G2(view);
            }
        });
        CoreModule.f17545c.f19663m0.f19347J0.onNext(bool);
        this.f21688C2 = true;
        lra0.f129535v = true;
        this.f21686B2 = this.f21800v2.f56011id;
        m35147O0(false);
        m36846Q2();
        m36867Z2(this);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m36795v1(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m36799y2() {
        xdl0.m208353Q0(this.f21737T, new e30() { // from class: l.by30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77852a.m36945x2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m36801A2() {
        xdl0.m208353Q0(this.f21737T, new e30() { // from class: l.cy30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82920a.m36952z2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public void m36802A3(int i, boolean z) {
        User user = this.f21800v2;
        if (user == null || vwb.m200296J(user.pictures) || i < 0 || i > this.f21800v2.pictures.size() - 1) {
            this.f21701H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f21793s1;
            if (z) {
                newPictureContainerIndicator.m36955b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f21701H1 = i;
        if (CoreModule.f17545c.f19663m0.m31020L6(this.f21800v2.f56011id)) {
            m36861W1(0);
        }
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f21793s1;
        if (z) {
            newPictureContainerIndicator2.m36955b(this.f21701H1);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(this.f21701H1);
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo36803B0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (!mah0.m153720m0() || C16319da.INSTANCE.m110511l()) {
            if (lac0.m149136m() && NullChecker.m81303a(this.f21710K1) && xdl0.m208349O0(this.f21710K1)) {
                mah0.m153700c1();
                this.f21710K1.m45993k0(false);
                xdl0.m208345M0(this.f21710K1, false);
            }
        } else {
            if (mah0.m153738y0(userInfo.f19472id)) {
                mah0.m153729s0().m153771i1(viewTreeObserverOnGlobalLayoutListenerC7866b, this, userInfo, i);
                return true;
            }
            mkd0.m154992z(this.f21717M1);
            if (NullChecker.m81303a(this.f21713L1) && this.f21713L1.isRunning()) {
                this.f21713L1.end();
                setRotation(0.0f);
                setTranslationX(0.0f);
                setPivotX(getWidth() / 2);
                setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f21710K1;
            if (NullChecker.m81303a(swipeGuideRightView) && xdl0.m208349O0(swipeGuideRightView)) {
                xdl0.m208344M(swipeGuideRightView, false);
            }
            mah0.m153729s0().m153768f1();
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37236U5(false);
        }
        return false;
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m36804B2(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.m167915N(z, "click");
        j8w.INSTANCE.m140473a().m140433W(m36858V1(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.f19472id, p9wVar.m167962x(), new Function0() { // from class: l.ny30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewNewProfileCard.m36774I1();
            }
        }, null, null, true);
    }

    /* JADX INFO: renamed from: B3 */
    public final void m36805B3(float f) {
        setPivotX(getWidth() / 2.0f);
        setPivotY(getHeight() / 2.0f);
        bt0.m103741n(this, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: C */
    public void mo36806C() {
        User user = this.f21800v2;
        if (user == null || TextUtils.isEmpty(user.f56011id) || TextUtils.equals(this.f21800v2.f56011id, CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            return;
        }
        C4348d.m20896l().m20900k("desc_click_bubble_tip");
        C4348d.m20896l().m20900k("bubble_intl_instant_match_guide");
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: C0 */
    public void mo36807C0() {
        if (NullChecker.m81303a(this.f21737T)) {
            this.f21737T.m44009o0();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m36808C2() {
        m36867Z2(this.f21719N);
        mo36918p0();
        m36943w3();
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo36809D(String str) {
        View view;
        if (TextUtils.equals("female_like_flag", str)) {
            return NullChecker.m81303a(this.f21783n2) && NullChecker.m81303a(this.f21800v2) && !this.f21800v2.superLikedMe() && !this.f21783n2.isSpecialLike() && (this.f21783n2.isUserLikeMe() || (CoreModule.f17557o.m195055b().mo33649wf() && this.f21783n2.hasLikeMeSlideCardTop));
        }
        if (TextUtils.equals("female_like_flag_lower_left", str)) {
            return NullChecker.m81303a(this.f21698G1) && this.f21698G1.mo37440i();
        }
        return TextUtils.equals("superlike_guide", str) && (view = this.f21762d2) != null && xdl0.m208349O0(view);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m36810D2(User user, CoreData coreData) {
        if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.userRisk)) {
            m36935t3(user, coreData.userRisk);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m36811D3(int i) {
        User user = this.f21800v2;
        if (user == null) {
            return;
        }
        boolean z = false;
        lra0.m151148g("p_suggest_users_home_view", this.f21701H1 + 1 <= user.pictures.size() - 1, false, this.f21800v2, this.f21698G1.mo37438g());
        if (this.f21701H1 == i) {
            return;
        }
        this.f21737T.m44011x(true);
        m36788o3(i);
        m36802A3(i, true);
        this.f21698G1.mo37441j(i);
        VImage vImage = this.f21767g1;
        if (this.f21794s2 && this.f21701H1 == 0) {
            z = true;
        }
        xdl0.m208345M0(vImage, z);
        m36943w3();
        if (xij0.m209661d0()) {
            e51.m114743H(m36858V1(), new uy30(this), 100L);
        }
        int i2 = i + 1;
        if (i2 < this.f21800v2.pictures.size()) {
            m36786W2(this.f21800v2.media(i2));
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: E */
    public IntlLiveSmallWindow mo36812E() {
        return null;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m36813E2(SwipeLikeButton swipeLikeButton) {
        xdl0.m208345M0(swipeLikeButton, false);
        this.f21783n2.isUndo = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX INFO: renamed from: E3 */
    public void m36814E3() {
        String str;
        int size = this.f21701H1 + 1;
        if (size > this.f21785o2.media.size() - 1) {
            size = this.f21785o2.media.size() - 1;
        }
        if (NullChecker.m81303a(this.f21783n2)) {
            CoreSuggested.UserInfo userInfo = this.f21783n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m151148g(str, this.f21701H1 + 1 <= this.f21800v2.pictures.size() - 1, false, this.f21800v2, this.f21698G1.mo37438g());
        if (this.f21701H1 == size) {
            m36805B3(1.5f);
            return;
        }
        this.f21737T.m44011x(true);
        m36911m3(size);
        xdl0.m208345M0(this.f21776k1, this.f21748W1);
        m36953z3(size, true);
        m36943w3();
        if (xij0.m209661d0()) {
            e51.m114743H(m36858V1(), new uy30(this), 100L);
        }
        int i = size + 1;
        if (i < this.f21785o2.media.size()) {
            m36863X2(this.f21785o2.media.get(i));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m36815F2(RiskOtherData riskOtherData, View view) {
        wc80.m202636e().m202649q(uc80.m192995a(new gwp(m36858V1())));
        zvf0.m220399u("e_swipe_safety_notice", "p_suggest_users_home_view", vwb.m200311Y("user_risk_type", riskOtherData.type));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: F3 */
    public void m36816F3() {
        String str;
        int i = this.f21701H1 - 1;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.m81303a(this.f21783n2)) {
            CoreSuggested.UserInfo userInfo = this.f21783n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m151148g(str, this.f21701H1 - 1 >= 0, true, this.f21800v2, this.f21698G1.mo37438g());
        if (this.f21701H1 == i || i > this.f21785o2.media.size() - 1) {
            m36805B3(-1.5f);
            return;
        }
        this.f21737T.m44011x(true);
        m36911m3(i);
        m36953z3(i, true);
        xdl0.m208345M0(this.f21776k1, this.f21748W1);
        m36943w3();
        if (xij0.m209661d0()) {
            e51.m114743H(m36858V1(), new uy30(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m36863X2(this.f21785o2.media.get(i2));
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: G */
    public void mo36817G() {
        if (xij0.m209661d0() && NullChecker.m81304b(this.f21737T)) {
            PictureView pictureView = this.f21737T;
            if (pictureView.f28040G instanceof Video) {
                pictureView.m43991V();
            }
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m36818G2(View view) {
        mo36917p(true, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX INFO: renamed from: G3 */
    public void m36819G3() {
        String str;
        if (this.f21800v2 == null) {
            return;
        }
        if (CoreModule.m29934N().mo60294M8()) {
            m36787Y1();
        }
        mo36806C();
        int size = this.f21701H1 + 1;
        if (size > this.f21800v2.pictures.size() - 1) {
            size = this.f21800v2.pictures.size() - 1;
        }
        if (NullChecker.m81303a(this.f21783n2)) {
            CoreSuggested.UserInfo userInfo = this.f21783n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        boolean z = false;
        lra0.m151148g(str, this.f21701H1 + 1 <= this.f21800v2.pictures.size() - 1, false, this.f21800v2, this.f21698G1.mo37438g());
        if (this.f21701H1 == size) {
            m36805B3(1.5f);
            return;
        }
        if (upa.m194844y1()) {
            zub.m220214m();
        }
        this.f21737T.m44011x(true);
        m36788o3(size);
        m36802A3(size, true);
        xdl0.m208345M0(this.f21776k1, this.f21748W1);
        this.f21698G1.mo37441j(size);
        VImage vImage = this.f21767g1;
        if (this.f21794s2 && this.f21701H1 == 0) {
            z = true;
        }
        xdl0.m208345M0(vImage, z);
        m36903k2();
        m36943w3();
        if (xij0.m209661d0()) {
            e51.m114743H(m36858V1(), new uy30(this), 100L);
        }
        int i = size + 1;
        if (i < this.f21800v2.pictures.size()) {
            m36786W2(this.f21800v2.media(i));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ Bitmap m36820H2() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: H3 */
    public void m36821H3() {
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: I */
    public void mo36822I() {
        if (this.f21737T.f28040G instanceof Video) {
            if (NullChecker.m81303a(this.f21800v2)) {
                this.f21737T.f28041G0 = CoreModule.f17545c.f19663m0.f19396a2.containsKey(this.f21800v2.f56011id);
            }
            if (mo36886f() || m219460h()) {
                return;
            }
            this.f21737T.m43991V();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ C22306c m36823I2() {
        return C22306c.fromCallable(new Callable() { // from class: l.ay30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f72249a.m36820H2();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m36824I3() {
        m36827J3(true);
    }

    @Override // p149l.hol
    /* JADX INFO: renamed from: J */
    public View mo36825J() {
        return this.f21719N;
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ C22306c m36826J2(Bitmap bitmap) {
        return C22306c.just(xij0.m209664p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m36827J3(boolean z) {
        View view;
        if (z) {
            o6j0.m162864h("e_card_guide_overlay", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
        if ((this.f21800v2.media(this.f21701H1) instanceof Video) && xij0.m209661d0() && NullChecker.m81303a(this.f21737T)) {
            this.f21737T.m43990U();
        }
        mkd0.m154992z(this.f21690D2);
        if (this.f21688C2 && (view = this.f21684A2) != null) {
            removeView(view);
            this.f21684A2 = null;
            this.f21688C2 = false;
            mkd0.m154992z(this.f21693E2);
        }
        this.f21690D2 = m36858V1().duringCreated(((C22306c) new v9j() { // from class: l.vy30
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f183492a.m36823I2();
            }
        }.call()).compose(mkd0.m154966R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.wy30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188540a.m36826J2((Bitmap) obj);
            }
        }).compose(mkd0.m154991y()).map(new w9j() { // from class: l.xy30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f195021a.m36828K2((Bitmap) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.yy30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200708a.m36831L2((Drawable) obj);
            }
        }, new e30() { // from class: l.ux30
            @Override // p149l.e30
            public final void call(Object obj) {
                NewNewProfileCard.m36772G1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ Drawable m36828K2(Bitmap bitmap) {
        bfd0 bfd0VarM106505a = cfd0.m106505a(m36858V1().getResources(), bitmap);
        bfd0VarM106505a.m101528e(t100.f167266o);
        return bfd0VarM106505a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX INFO: renamed from: K3 */
    public void m36829K3() {
        String str;
        if (this.f21800v2 == null) {
            return;
        }
        if (CoreModule.m29934N().mo60294M8()) {
            m36787Y1();
        }
        mo36806C();
        int i = this.f21701H1 - 1;
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.m81303a(this.f21783n2)) {
            CoreSuggested.UserInfo userInfo = this.f21783n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m151148g(str, this.f21701H1 - 1 >= 0, true, this.f21800v2, this.f21698G1.mo37438g());
        if (this.f21701H1 == i || i > this.f21800v2.pictures.size() - 1) {
            m36805B3(-1.5f);
            return;
        }
        this.f21737T.m44011x(true);
        m36788o3(i);
        m36802A3(i, true);
        xdl0.m208345M0(this.f21776k1, this.f21748W1);
        this.f21698G1.mo37441j(i);
        VImage vImage = this.f21767g1;
        if (this.f21794s2 && this.f21701H1 == 0) {
            z = true;
        }
        xdl0.m208345M0(vImage, z);
        m36903k2();
        m36943w3();
        if (xij0.m209661d0()) {
            e51.m114743H(m36858V1(), new uy30(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m36786W2(this.f21800v2.media(i2));
        }
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: L */
    public void mo36830L() {
        if (NullChecker.m81303a(this.f21737T) && (this.f21737T.f28040G instanceof Video) && !mo36886f()) {
            this.f21737T.m43991V();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m36832L3(boolean z) {
        if (z) {
            xdl0.m208345M0(this.f21787p1, true);
            if (this.f21742U1) {
                return;
            }
            this.f21742U1 = true;
            this.f21787p1.m39204k();
            return;
        }
        boolean z2 = this.f21742U1;
        SuperLikeBanner superLikeBanner = this.f21787p1;
        if (z2) {
            superLikeBanner.m39205l(true, this.f21808z2);
        } else {
            superLikeBanner.m39202i();
            xdl0.m208345M0(this.f21787p1, false);
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: M */
    public void mo36833M() {
        if (this.f21800v2 == null) {
            return;
        }
        final C4348d c4348dM20896l = C4348d.m20896l();
        if (!m35166g() || mah0.m153738y0(this.f21800v2.f56011id) || mah0.m153729s0().m153789z0() || !CoreModule.m29934N().mo60294M8() || this.f21779l2.get().booleanValue()) {
            return;
        }
        final C4345a c4345aM20875q = new C4345a(getContext()).m20849D(this.f21800v2.isFemale() ? "轻触和她互动" : "轻触和他互动").m20855J(13.0f).m20874p(75).m20882x(t100.m186890d(6.0f)).m20873o(C4345a.f15682P, t100.m186890d(9.0f)).m20850E(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20859N(new C4345a.d() { // from class: l.ky30
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.d
            /* JADX INFO: renamed from: a */
            public final void mo20887a(View view) {
                this.f125241a.m36834M2(view);
            }
        }).m20853H(t100.m186890d(16.0f), t100.m186890d(10.5f), t100.m186890d(16.0f), t100.m186890d(10.5f)).m20863d(new C4345a.b() { // from class: l.ly30
            @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.b
            /* JADX INFO: renamed from: a */
            public final void mo20885a(String str) {
                NewNewProfileCard.m36787Y1();
            }
        }).m20875q(C4345a.f15682P | C4345a.f15680N);
        this.f21754Z1 = new Runnable() { // from class: l.my30
            @Override // java.lang.Runnable
            public final void run() {
                this.f136245a.m36837N2(c4348dM20896l, c4345aM20875q);
            }
        };
        e51.m114743H(m36858V1(), this.f21754Z1, 500L);
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: M0 */
    public void mo31526M0(String str) {
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m36834M2(View view) {
        this.f21779l2.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M3 */
    public void m36835M3() {
        if (m35166g()) {
            myc0.m157001d0().m157007h0();
        } else {
            zzc0.m221016g0();
        }
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: N */
    public boolean mo36836N() {
        return NullChecker.m81303a(this.f21762d2) && xdl0.m208349O0(this.f21762d2);
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m36837N2(C4348d c4348d, C4345a c4345a) {
        c4348d.m20909u(c4345a, mo36865Z(), "user_state_bubble");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: N3 */
    public void m36838N3(final String str) {
        e51.m114743H(m36858V1(), new Runnable() { // from class: l.oy30
            @Override // java.lang.Runnable
            public final void run() {
                this.f146277a.m36843P2(str);
            }
        }, TextUtils.equals("backUser", str) ? 500L : 2000L);
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: O */
    public boolean mo36839O() {
        return this.f21707J1;
    }

    /* JADX INFO: renamed from: O2 */
    public final /* synthetic */ boolean m36840O2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        m36881d3();
        return false;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m36841O3(String str) {
        if (str.equals(this.f21702H2)) {
            return;
        }
        zvf0.m220402x("e_special_card", "p_suggest_users_home_view");
        this.f21702H2 = str;
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: P */
    public boolean mo36842P() {
        if (NullChecker.m81303a(this.f21737T)) {
            return this.f21737T.f28045I0.m221515e().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m36843P2(String str) {
        if (!m35163d1() || NullChecker.m81303a(this.f21717M1)) {
            return;
        }
        if (TextUtils.equals("newUser", str) && this.f21745V1) {
            return;
        }
        if (this.f21730Q1 == null) {
            View viewInflate = this.f21803x1.inflate();
            this.f21730Q1 = viewInflate;
            viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.qy30
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f156899a.m36840O2(view, motionEvent);
                }
            });
            m36875b3();
        }
        if (this.f21733R1 == null) {
            this.f21733R1 = m36874b2(this);
        }
        if (this.f21733R1.isRunning()) {
            return;
        }
        xdl0.m208344M(this.f21730Q1, true);
        if (TextUtils.equals("backUser", str)) {
            zvf0.m220402x("e_reback_swipe_guide", "p_suggest_users_home_view");
        } else if (TextUtils.equals("newUser", str)) {
            CoreModule.f17545c.f19639e0.f149171F2.put(Boolean.TRUE);
            zvf0.m220402x("e_home_swipe_gesture", "p_suggest_users_home_view");
        }
        this.f21733R1.start();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m36844P3() {
        xdl0.m208360X(this.f21746W, this.f21737T.getMeasuredHeight());
        xdl0.m208325C0(this.f21746W, this.f21715M.getMeasuredHeight() - this.f21737T.getMeasuredHeight());
        boolean zIsMe = this.f21800v2.isMe();
        View view = this.f21786p0;
        if (zIsMe) {
            xdl0.m208360X(view, this.f21737T.getMeasuredHeight() - t100.m186890d(176.0f));
        } else {
            xdl0.m208360X(view, this.f21737T.getMeasuredHeight() - t100.m186890d(103.0f));
        }
        m36867Z2(this.f21719N);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: Q */
    public void mo36845Q(CoreSuggested.UserInfo userInfo, qol0 qol0Var, VirtualCardType virtualCardType, int i) {
        this.f21783n2 = userInfo;
        m36887f2(CardType.virtual_card);
        if (NullChecker.m81303a(this.f21762d2) && xdl0.m208349O0(this.f21762d2)) {
            xdl0.m208344M(this.f21762d2, false);
        }
        if (this.f21695F1 == null) {
            VirtualCard virtualCard = (VirtualCard) this.f21689D1.inflate();
            this.f21695F1 = virtualCard;
            virtualCard.m46081F0(this);
        }
        xdl0.m208345M0(this.f21695F1, true);
        if (this.f21695F1.getAdapter() == null || this.f21695F1.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
            this.f21695F1.setCardType(virtualCardType);
            this.f21695F1.setAdapter(qol0Var.mo36754d2(virtualCardType, userInfo));
            this.f21695F1.setClipChildren(false);
        }
        m36859V2(this.f21783n2);
        this.f21695F1.m46084J0(this, i, virtualCardType, userInfo);
        m36867Z2(this);
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: Q0 */
    public void mo35149Q0() {
        if (!IntlCountryCodeController.m28126v()) {
            super.mo35149Q0();
            return;
        }
        if (NullChecker.m81303a(this.f21798u2)) {
            this.f21798u2.m106898k(this);
            CoreSuggested.UserInfo userInfo = this.f21783n2;
            if (userInfo.isUndo) {
                userInfo.isUndo = false;
            }
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m36846Q2() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21684A2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: Q3 */
    public boolean mo36847Q3() {
        return false;
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m36848R2() {
        if (this.f21696F2 || !this.f21739T1 || this.f21707J1 || CoreModule.f17545c.f19663m0.f19460w0.get().booleanValue() || mo36886f() || this.f21800v2 == null || mo36922q0()) {
            return false;
        }
        if (NullChecker.m81303a(this.f21721N1) && xdl0.m208349O0(this.f21721N1)) {
            return false;
        }
        return ((NullChecker.m81303a(this.f21764e2) && xdl0.m208349O0(this.f21764e2)) || this.f21756a2 || m36923q2(this.f21783n2) || m36910m2(this.f21724O1) || m36910m2(this.f21727P1)) ? false : true;
    }

    /* JADX INFO: renamed from: R3 */
    public void m36849R3() {
        xdl0.m208357U(this.f21763e1, this.f21746W.getHeight() + t100.f167275x);
        m36861W1(this.f21746W.getHeight() + t100.f167264m);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: S */
    public void mo36850S(final d30 d30Var) {
        this.f21707J1 = true;
        xdl0.m208329E0(this, null);
        xdl0.m208329E0(this.f21719N, new View.OnClickListener() { // from class: l.gy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewNewProfileCard.m36795v1(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m36851S2(User user) {
        if (this.f21800v2 == null || user.isMe() || !this.f21737T.f28070a.getHierarchy().m112071r()) {
            return true;
        }
        return !user.equals(this.f21800v2);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: T */
    public void mo36852T(final User user, final CoreSuggested.UserInfo userInfo, int i) {
        this.f21758b2 = i;
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m36899j2(user, null);
        xdl0.m208345M0(this.f21775k0, false);
        this.f21783n2 = userInfo;
        this.f21785o2 = null;
        User user2 = this.f21800v2;
        if (user2 != null && TextUtils.equals(user2.f56011id, user.f56011id) && user.pictures.size() == this.f21701H1 && m36919p2(user, userInfo)) {
            m36906l2(user, userInfo);
            if (user.pictures.size() <= this.f21701H1) {
                this.f21701H1 = 0;
            }
        }
        User user3 = this.f21800v2;
        if (user3 == null || !TextUtils.equals(user3.f56011id, user.f56011id) || (NullChecker.m81303a(user.pictures) && user.pictures.size() <= this.f21701H1)) {
            this.f21701H1 = 0;
        }
        if (this.f21750X1 || upa.m194619C2()) {
            xdl0.m208345M0(this.f21746W, true);
            xdl0.m208345M0(this.f21786p0, true);
            this.f21737T.m44004j0(false, userInfo.isThemeCard);
        } else {
            xdl0.m208345M0(this.f21746W, false);
            xdl0.m208345M0(this.f21786p0, false);
            this.f21737T.m44004j0(true, userInfo.isThemeCard);
        }
        if (IntlCountryCodeController.m28126v()) {
            this.f21737T.m44006l0();
            xdl0.m208345M0(this.f21746W, true);
            this.f21786p0.setBackground(m36858V1().getDrawable(x2c0.f189205Bj));
        }
        this.f21781m2 = false;
        if (m36851S2(user)) {
            this.f21800v2 = user;
            m36906l2(user, userInfo);
            CoreModule.f17545c.f19663m0.f19408e2.m34209n3(user, userInfo);
            this.f21793s1.setIndicatorCount(user.pictures.size());
            xdl0.m208345M0(this.f21793s1, user.pictures.size() > 1);
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149141B0) && i == 0) {
                int iIntValue = CoreModule.f17545c.f19639e0.f149141B0.f191753c.intValue();
                if (!user.f56011id.equals(CoreModule.f17545c.f19639e0.f149141B0.f191751a) || user.pictures.size() <= iIntValue) {
                    if (this.f21701H1 > user.pictures.size() - 1) {
                        this.f21701H1 = 0;
                    }
                    m36788o3(this.f21701H1);
                    if (this.f21701H1 == 0 && user.pictures.size() > 1) {
                        m36786W2(user.media(1));
                    }
                } else {
                    this.f21701H1 = iIntValue;
                    m36788o3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m36786W2(user.media(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < user.pictures.size()) {
                        m36786W2(user.media(i3));
                    }
                }
            } else {
                if (this.f21701H1 > user.pictures.size() - 1) {
                    this.f21701H1 = 0;
                }
                m36788o3(this.f21701H1);
                if (this.f21701H1 == 0 && user.pictures.size() > 1) {
                    m36786W2(user.media(1));
                }
            }
            this.f21781m2 = true;
        } else {
            m36788o3(this.f21701H1);
        }
        if (mo36886f()) {
            if (TextUtils.equals(this.f21686B2, user.f56011id)) {
                m35147O0(false);
            } else {
                mo36917p(false, true);
            }
        }
        m36802A3(this.f21701H1, false);
        m36859V2(userInfo);
        m36885e3(user, userInfo, i == 0);
        m36907l3(user, i, userInfo);
        m36924q3(user, userInfo);
        if (q8p.m173425i()) {
            m36888f3(user, userInfo, i);
        }
        m36900j3(userInfo);
        m36914n3(user);
        m36896i3(i);
        m36904k3(i);
        if (CoreModule.f17545c.f19663m0.m31020L6(user.f56011id)) {
            m36861W1(0);
        } else if (m36923q2(userInfo)) {
            m36861W1(t100.m186890d(16.0f));
        } else {
            m36861W1(t100.m186890d(80.0f));
        }
        m36835M3();
        xdl0.m208345M0(this.f21691E0, m36930s2() && !user.isMe());
        xdl0.m208372e0(this.f21691E0, !upa.m194633F1() ? t100.f167264m : 0);
        xdl0.m208360X(this.f21691E0, xdl0.m208349O0(this.f21793s1) ? t100.m186890d(25.0f) : t100.f167264m);
        xdl0.m208327D0(this.f21715M.getMeasuredWidth() - t100.m186890d(90.0f), this.f21691E0);
        if (user.isMe()) {
            xdl0.m208345M0(this.f21746W, false);
            xdl0.m208345M0(this.f21740U, false);
            xdl0.m208325C0(this.f21786p0, t100.m186890d(176.0f));
            this.f21786p0.setBackground(m36858V1().getDrawable(x2c0.f189173Aj));
            this.f21737T.m44004j0(true, userInfo.isThemeCard);
        }
        m36890g3(userInfo, i);
        m36867Z2(this.f21719N);
        post(new Runnable() { // from class: l.vx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f183415a.m36942w2(userInfo, user);
            }
        });
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208345M0(this.f21763e1, false);
            xdl0.m208345M0(this.f21743V, false);
            if (NullChecker.m81303a(this.f21751Y0)) {
                xdl0.m208357U(this.f21751Y0, vtd.m199996a(m36858V1(), 10.0f));
                xdl0.m208358V(this.f21751Y0, vtd.m199996a(m36858V1(), 20.0f));
                xdl0.m208359W(this.f21751Y0, vtd.m199996a(m36858V1(), 90.0f));
            }
        }
        if (user.isMe()) {
            post(new Runnable() { // from class: l.wx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188429a.m36799y2();
                }
            });
        } else {
            m36844P3();
            post(new Runnable() { // from class: l.xx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194810a.m36801A2();
                }
            });
        }
        if (i == 0 && NullChecker.m81303a(userInfo) && userInfo.isIntlLikeLimitInsert) {
            zvf0.m220402x("e_swipe_limit_pop1_insert_card", "p_suggest_users_home_view");
        }
        if (i == 0 && NullChecker.m81303a(user) && !TextUtils.equals(CoreModule.f17545c.f19686t2.f148157W, user.f56011id)) {
            m36920p3(user);
            CoreModule.f17545c.f19686t2.f148157W = user.f56011id;
        } else if (i != 0) {
            xdl0.m208344M(this.f21683A1, false);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m36853T2() {
        if (ogl0.m164247Z()) {
            rxg0.m181572j().m181587i();
            rxg0.m181572j().f161471p = null;
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: U */
    public void mo36854U() {
        if (NullChecker.m81303a(this.f21737T)) {
            this.f21737T.m44003i0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m36855U1(View view) {
        iz30.m139025a(this, view);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m36856U2() {
        setMinFlingSwipeX(l9j.m149033a());
        VSwipeCard.f20287z = 350;
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: V */
    public View mo36857V() {
        return this.f21763e1;
    }

    /* JADX INFO: renamed from: V1 */
    public Act m36858V1() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m36859V2(CoreSuggested.UserInfo userInfo) {
        if (!m35162c1() && NullChecker.m81303a(userInfo.preSwipedDirection)) {
            boolean zM28126v = IntlCountryCodeController.m28126v();
            SwipeDirection swipeDirection = userInfo.preSwipedDirection;
            if (zM28126v) {
                if (swipeDirection == SwipeDirection.UP) {
                    setTranslationY(-getHeight());
                } else if (swipeDirection == SwipeDirection.LEFT) {
                    setTranslationY(getHeight());
                } else if (swipeDirection == SwipeDirection.RIGHT) {
                    setTranslationY(-getHeight());
                }
                setTranslationX(0.0f);
                setAlpha(0.0f);
            } else if (swipeDirection == SwipeDirection.UP) {
                setTranslationY(-mo35167g1());
                m36931s3(this.f21791r1);
            } else if (swipeDirection == SwipeDirection.LEFT) {
                setTranslationX(-mo35165f1());
                m36931s3(this.f21789q1);
            } else if (swipeDirection == SwipeDirection.RIGHT) {
                setTranslationX(mo35165f1());
                m36931s3(this.f21791r1);
            }
            userInfo.preSwipedDirection = null;
            mo35149Q0();
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: W */
    public VText mo36860W() {
        return this.f21738T0;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: W0 */
    public void mo35156W0(boolean z, float f) {
        super.mo35156W0(z, f);
        m36866Z1(z, f);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m36861W1(int i) {
        xdl0.m208357U(this.f21744V0, i);
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: X0 */
    public boolean mo35157X0() {
        if (m35162c1()) {
            return false;
        }
        return super.mo35157X0();
    }

    /* JADX INFO: renamed from: X1 */
    public void m36862X1() {
        this.f21777k2.m179669b();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m36863X2(Media media) {
        m36786W2(media);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo36864Y() {
        return this.f21737T;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: Y0 */
    public boolean mo35158Y0() {
        return true;
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: Z */
    public View mo36865Z() {
        return this.f21729Q0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m36866Z1(boolean z, float f) {
        CoreSuggested.UserInfo userInfo = this.f21783n2;
        if (userInfo == null || userInfo.isUndo || !mo36947y()) {
            return;
        }
        if (CoreModule.m29934N().mo60294M8()) {
            m36787Y1();
        }
        mo36806C();
        if (!z) {
            if (IntlCountryCodeController.m28126v()) {
                return;
            }
            this.f21791r1.setVisibility(4);
            this.f21789q1.setVisibility(4);
            this.f21791r1.setPressed(false);
            this.f21789q1.setPressed(false);
            if (f <= 0.0f) {
                m36832L3(false);
                return;
            }
            if (!m35160a1()) {
                this.f21802w2 = false;
                this.f21804x2 = false;
                this.f21806y2 = true;
            } else if (m35146F()) {
                if (this.f21742U1) {
                    m36832L3(false);
                    return;
                }
                return;
            } else if (this.f21802w2 || this.f21804x2) {
                return;
            }
            if (this.f21745V1) {
                return;
            }
            m36832L3(true);
            return;
        }
        if (f > 0.0f && this.f20297j != VSwipeCard.f20282I) {
            if (!m35160a1()) {
                this.f21802w2 = false;
                this.f21804x2 = true;
                this.f21806y2 = false;
            } else if (this.f21802w2 || this.f21806y2) {
                return;
            }
            this.f21791r1.m39214z(Math.min(1.0f, f * 2.0f));
            this.f21791r1.setVisibility(0);
            this.f21789q1.setVisibility(4);
            this.f21791r1.setPressed(true);
            this.f21789q1.setPressed(false);
        } else if (f >= 0.0f || this.f20297j == VSwipeCard.f20281H) {
            this.f21791r1.setVisibility(4);
            this.f21789q1.setVisibility(4);
            this.f21791r1.setPressed(false);
            this.f21789q1.setPressed(false);
        } else {
            if (!m35160a1()) {
                this.f21802w2 = true;
                this.f21804x2 = false;
                this.f21806y2 = false;
            } else if (this.f21804x2 || this.f21806y2) {
                return;
            }
            float fMax = Math.max(-1.0f, f * 2.0f);
            this.f21791r1.setVisibility(4);
            this.f21789q1.m39214z(-fMax);
            this.f21789q1.setVisibility(0);
            this.f21791r1.setPressed(false);
            this.f21789q1.setPressed(true);
        }
        m36832L3(false);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m36867Z2(View view) {
        if (m35162c1()) {
            return;
        }
        xdl0.m208384k0(view);
    }

    @Override // p149l.b5m
    /* JADX INFO: renamed from: a */
    public void mo36868a() {
        this.f21737T.m44012z();
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: a0 */
    public boolean mo36869a0() {
        return (this.f21783n2 == null || this.f21785o2 == null) ? false : true;
    }

    /* JADX INFO: renamed from: a2 */
    public void m36870a2() {
        Animator animator = this.f21724O1;
        if (animator != null && animator.isRunning()) {
            this.f21724O1.end();
            this.f21724O1 = null;
        }
        Animator animator2 = this.f21727P1;
        if (animator2 != null && animator2.isRunning()) {
            this.f21727P1.end();
            this.f21727P1 = null;
        }
        this.f21745V1 = false;
    }

    /* JADX INFO: renamed from: a3 */
    public void m36871a3() {
        if (!mo36886f() || this.f21684A2 == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        m36827J3(false);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: b */
    public boolean mo36872b() {
        return (this.f21783n2 == null || this.f21785o2 == null) ? false : true;
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: b0 */
    public boolean mo36873b0() {
        return this.f21760c2;
    }

    /* JADX INFO: renamed from: b2 */
    public final Animator m36874b2(final View view) {
        final int i = t100.f167276y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(ua60.m192732a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ry30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewNewProfileCard.m36791r1(view, i, i2, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b3 */
    public void m36875b3() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(ffx.m121199b(getWidth()), ffx.m121199b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    @Override // p149l.hol
    /* JADX INFO: renamed from: c */
    public boolean mo36876c() {
        return NullChecker.m81303a(this.f21774j2) && xdl0.m208349O0(this.f21774j2);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m36877c2() {
        this.f21748W1 = false;
        xdl0.m208345M0(this.f21776k1, false);
    }

    /* JADX INFO: renamed from: c3 */
    public void m36878c3() {
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // p149l.d5m, p149l.gol
    /* JADX INFO: renamed from: d */
    public boolean mo36879d() {
        return this.f21756a2;
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m36866Z1(z, f3);
    }

    /* JADX INFO: renamed from: d2 */
    public final void m36880d2() {
        if (this.f21698G1 == null) {
            this.f21698G1 = new C7869c(this.f21707J1, getContext(), this.f21744V0);
        }
        this.f21698G1.mo37439h(this);
    }

    /* JADX INFO: renamed from: d3 */
    public void m36881d3() {
        if (NullChecker.m81303a(this.f21733R1) && this.f21733R1.isRunning()) {
            if (NullChecker.m81303a(this.f21730Q1)) {
                xdl0.m208344M(this.f21730Q1, false);
            }
            this.f21733R1.cancel();
            setRotation(0.0f);
            setTranslationX(0.0f);
            setPivotX(getWidth() / 2);
            setPivotY(getHeight() / 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!mo36886f() || (motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 3)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        mo36917p(true, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchVisibilityChanged(View view, int i) {
        super.dispatchVisibilityChanged(view, i);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: e */
    public boolean mo36882e() {
        CoreSuggested.UserInfo userInfo = this.f21783n2;
        return (userInfo == null || this.f21785o2 == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo36883e0() {
        return mo36947y();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m36884e2() {
        xdl0.m208345M0(this.f21805y1, false);
        xdl0.m208345M0(this.f21793s1, false);
        if (upa.m194619C2()) {
            int i = t100.f167266o;
            Drawable drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
            if (IntlCountryCodeController.m28126v()) {
                drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f21746W.setBackground(drawableM120426c);
            xdl0.m208325C0(this.f21786p0, t100.m186890d(108.0f));
            this.f21786p0.setBackgroundResource(x2c0.f189874X1);
        } else {
            int i2 = t100.f167266o;
            Drawable drawableM120426c2 = fce.m120426c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
            if (IntlCountryCodeController.m28126v()) {
                drawableM120426c2 = fce.m120426c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f21746W.setBackground(drawableM120426c2);
        }
        this.f21791r1.m39211u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f21789q1.m39211u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f21787p1.m39201h(new int[]{x2c0.f189937Z2, x2c0.f189969a3, x2c0.f190001b3, x2c0.f190033c3, x2c0.f190065d3, x2c0.f190096e3, x2c0.f190128f3, x2c0.f190160g3, x2c0.f190192h3, x2c0.f190224i3, x2c0.f190254j3, x2c0.f190286k3, x2c0.f190318l3, x2c0.f190350m3, x2c0.f190382n3, x2c0.f190414o3}, 20L);
    }

    /* JADX INFO: renamed from: e3 */
    public void m36885e3(User user, CoreSuggested.UserInfo userInfo, boolean z) {
        m36880d2();
        this.f21698G1.mo37436e(this, user, userInfo, z, this.f21785o2);
        this.f21698G1.mo37432a(this.f21701H1, false);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: f */
    public boolean mo36886f() {
        return this.f21688C2;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: f1 */
    public float mo35165f1() {
        return l9j.m149033a();
    }

    /* JADX INFO: renamed from: f2 */
    public final void m36887f2(CardType cardType) {
        this.f21692E1 = cardType;
        xdl0.m208344M(this.f21719N, false);
        xdl0.m208344M(this.f21687C1, true);
        xdl0.m208344M(this.f21689D1, false);
        this.f20290c = false;
        m36946x3();
    }

    /* JADX INFO: renamed from: f3 */
    public void m36888f3(User user, CoreSuggested.UserInfo userInfo, int i) {
        if (q8p.INSTANCE.m173439n(userInfo, user)) {
            if (this.f21774j2 == null) {
                this.f21774j2 = (IntlCommercialCardBottomActionLayout) this.f21795t1.inflate();
            }
            boolean zM28126v = IntlCountryCodeController.m28126v();
            IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout = this.f21774j2;
            if (zM28126v) {
                xdl0.m208359W(intlCommercialCardBottomActionLayout, t100.m186890d(80.0f));
                xdl0.m208357U(this.f21774j2, t100.m186890d(25.0f));
            } else {
                xdl0.m208359W(intlCommercialCardBottomActionLayout, 0);
                xdl0.m208357U(this.f21774j2, t100.m186890d(16.0f));
            }
            xdl0.m208344M(this.f21774j2, true);
            this.f21774j2.m39184Y(m36858V1(), user, userInfo, i);
            if (this.f21758b2 == 0) {
                if (IntlCountryCodeController.m28126v()) {
                    CoreModule.f17545c.f19663m0.f19432m2.onNext(roj0.f160388a);
                } else {
                    CoreModule.f17545c.f19663m0.f19429l2.onNext("renderCommercialCardBottomActionLayout");
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: g1 */
    public float mo35167g1() {
        return getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m36889g2(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataM204890l = wp0.INSTANCE.m204890l(extensions);
            if (likeMindedItemStatusDataM204890l != null) {
                if (NullChecker.m81303a(this.f21770h2)) {
                    xdl0.m208344M(this.f21770h2, z);
                } else {
                    this.f21770h2 = (AnimalFacialCardView) this.f21771i1.inflate();
                }
                xdl0.m208357U(this.f21770h2, i);
                this.f21770h2.m44323b(likeMindedItemStatusDataM204890l);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m36890g3(final CoreSuggested.UserInfo userInfo, int i) {
        if (u59.m191823d0() && NullChecker.m81303a(userInfo.intlInsertCardData) && NullChecker.m81303a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.f17545c.f19663m0.f19347J0.onNext(Boolean.TRUE);
                    p9w.INSTANCE.m167916O(z);
                }
                if (z) {
                    xdl0.m208344M(this.f21763e1, false);
                }
                if (NullChecker.m81303a(this.f21766f2)) {
                    xdl0.m208344M(this.f21766f2, i == 0);
                }
                if (NullChecker.m81303a(this.f21764e2) && xdl0.m208349O0(this.f21764e2)) {
                    return;
                }
                if (this.f21764e2 == null) {
                    this.f21764e2 = (VImage) this.f21782n1.inflate();
                }
                if (this.f21766f2 == null) {
                    this.f21766f2 = (VText) this.f21784o1.inflate();
                }
                xdl0.m208345M0(this.f21764e2, true);
                xdl0.m208345M0(this.f21766f2, i == 0);
                this.f21764e2.setBackgroundResource(x2c0.f190230i9);
                xdl0.m208329E0(this.f21766f2, new View.OnClickListener() { // from class: l.fy30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f99828a.m36804B2(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.m81303a(this.f21764e2)) {
            xdl0.m208344M(this.f21764e2, false);
        }
        if (NullChecker.m81303a(this.f21766f2)) {
            xdl0.m208344M(this.f21766f2, false);
        }
    }

    public View getBottomView() {
        return this.f21698G1.mo37437f();
    }

    public bol getCardBottomChain() {
        return this.f21698G1;
    }

    @Override // p149l.znl, p149l.a5m
    public jj4 getCardData() {
        if (this.f21736S1 == null) {
            jj4 jj4Var = new jj4(this);
            this.f21736S1 = jj4Var;
            jj4Var.m141749h(new jj4.C17798a());
        }
        this.f21736S1.m141750i(this.f21800v2);
        this.f21736S1.m141751j(this.f21783n2);
        this.f21736S1.m141743b().f118237e = mo36947y();
        if (NullChecker.m81303a(this.f21737T)) {
            this.f21736S1.m141743b().f118233a = this.f21737T.f28045I0;
            this.f21736S1.m141743b().f118234b = this.f21737T.f28047J0;
            this.f21736S1.m141743b().f118236d = this.f21737T.f28040G;
        }
        if (NullChecker.m81303a(this.f21800v2)) {
            this.f21736S1.m141743b().f118235c = this.f21800v2.pictures;
        }
        return this.f21736S1;
    }

    @Override // p149l.mol
    public jj4 getCardDataProxy() {
        return getCardData();
    }

    @Override // p149l.a5m, p149l.gol
    public View getCardView() {
        return this;
    }

    public View getCardViewProxy() {
        return this;
    }

    @Override // p149l.hol
    public /* bridge */ /* synthetic */ CommercialCardBottomActionLayout getCommercialCardBottomActionLayout() {
        return super.getCommercialCardBottomActionLayout();
    }

    public String getCurrentTimeYYYYMMDD() {
        long jM155944o = mqi0.m155944o();
        Date date = new Date();
        date.setTime(jM155944o);
        return mqi0.f135252d.format(date);
    }

    @Override // p149l.hol
    public IntlCommercialCardBottomActionLayout getIntlCommercialCardBottomActionLayout() {
        return this.f21774j2;
    }

    public CoreMomentInfo getMomentInfo() {
        CoreMomentInfo coreMomentInfo;
        if ((upa.m194647I0().enabled || e900.m115330b().m115334f()) && (coreMomentInfo = this.f21785o2) != null) {
            return coreMomentInfo;
        }
        return null;
    }

    @Override // p149l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return getMomentInfo();
    }

    @Override // p149l.d5m
    public CoreMomentInfo getMomentInfoThemeSlide() {
        CoreMomentInfo coreMomentInfo = this.f21785o2;
        if (coreMomentInfo != null) {
            return coreMomentInfo;
        }
        return null;
    }

    public InterfaceC7862c getOnSwipeClickListener() {
        return null;
    }

    public View getRebackGuideView() {
        return this.f21730Q1;
    }

    @Override // p149l.b5m
    public int getShowPictureIndex() {
        if (mo36872b()) {
            return -1;
        }
        return this.f21701H1;
    }

    @Override // p149l.mol
    public int getShowPictureIndexProxy() {
        return getShowPictureIndex();
    }

    @Override // p149l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f21783n2;
    }

    @Override // p149l.mol
    public User getUserProxy() {
        return this.f21800v2;
    }

    @Override // p149l.a5m
    public VirtualCard getVirtualCard() {
        return this.f21695F1;
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: h0 */
    public VText mo36891h0() {
        return this.f21726P0;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m36892h2(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.m81303a(this.f21768g2)) {
                xdl0.m208344M(this.f21768g2, z);
            } else {
                this.f21768g2 = (VDraweeView) this.f21769h1.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f21768g2.getTag() != str) {
                this.f21768g2.setTag(str);
                qib0.f154691G.m102337O0(this.f21768g2, str, true, false, null, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m36893h3(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataM135619d;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C7865a.INSTANCE.m36989b() && wp0.INSTANCE.m204888j(extensions) && !this.f21794s2 && !this.f21748W1) {
                m36889g2(extensions, i, z);
                return;
            }
            xdl0.m208345M0(this.f21773j1, false);
            if (NullChecker.m81303a(this.f21768g2)) {
                xdl0.m208345M0(this.f21768g2, false);
            }
            this.f21792r2 = false;
            if (NullChecker.m81303a(this.f21772i2)) {
                xdl0.m208345M0(this.f21772i2, false);
            }
            if (NullChecker.m81303a(this.f21770h2)) {
                xdl0.m208345M0(this.f21770h2, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C7865a.Companion aVar = C7865a.INSTANCE;
        if (aVar.m36995h()) {
            xdl0.m208345M0(this.f21773j1, false);
            this.f21792r2 = false;
            if (IntlMarketToken.quiz.equals(str)) {
                m36892h2(userInfo, z, false);
                return;
            }
            if ((IntlMarketToken.regular.equals(str) || IntlMarketToken.flash.equals(str)) && !this.f21748W1) {
                if (NullChecker.m81303a(this.f21772i2)) {
                    xdl0.m208344M(this.f21772i2, z);
                } else {
                    this.f21772i2 = (RegularStickerCardTabView) this.f21780m1.inflate();
                }
                xdl0.m208357U(this.f21772i2, i);
                Object tag = this.f21772i2.getTag();
                String str2 = userInfo.samesCardData.f20497id;
                if (tag != str2) {
                    this.f21772i2.setTag(str2);
                    this.f21772i2.m46344b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.m36990c()) {
            m36892h2(userInfo, z, true);
            return;
        }
        if (!aVar.m36994g() || this.f21748W1) {
            if (this.f21748W1 || (likeMindedItemStatusDataM135619d = idr.INSTANCE.m135619d(str)) == null) {
                return;
            }
            xdl0.m208357U(this.f21773j1, i);
            this.f21773j1.m46878b(likeMindedItemStatusDataM135619d);
            xdl0.m208345M0(this.f21773j1, z);
            this.f21792r2 = true;
            return;
        }
        qff0 qff0Var = qff0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM174299k = qff0Var.m174299k(str);
        if (similarInterestsItemSwipeDataM174299k != null) {
            xdl0.m208357U(this.f21773j1, i);
            this.f21773j1.m46879c(similarInterestsItemSwipeDataM174299k, qff0Var.m174293e());
            xdl0.m208345M0(this.f21773j1, z);
            this.f21792r2 = true;
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: i0 */
    public void mo36894i0() {
        if (NullChecker.m81303a(this.f21752Y1)) {
            e51.m114745J(this.f21752Y1);
        }
        if (NullChecker.m81303a(this.f21754Z1)) {
            e51.m114745J(this.f21754Z1);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m36895i2() {
        this.f21728Q.setOnClickListener(new View.OnClickListener() { // from class: l.py30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151778a.m36934t2(view);
            }
        });
        this.f21734S.setOnClickListener(new View.OnClickListener() { // from class: l.sy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166886a.m36937u2(view);
            }
        });
        xdl0.m208345M0(this.f21725P, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m36896i3(int i) {
        int iM200293G;
        String str;
        if (CoreModule.f17545c.f19663m0.m31020L6(this.f21783n2.f19472id) && NullChecker.m81303a(this.f21800v2) && i == 0) {
            if (this.f21800v2.pictures.size() > 0) {
                if (this.f21800v2.pictures.get(0) instanceof Video) {
                    str = CoreModule.f17545c.f19663m0.f19396a2.containsKey(this.f21800v2.f56011id) ? "video_clear" : "video_old";
                } else {
                    str = "picture";
                }
                zvf0.m220368A("e_suggest_live_room_card", "p_suggest_users_home_view", j760.m140076a("other_user_id", this.f21800v2.f56011id), j760.m140076a("sequence", Integer.valueOf(CoreModule.f17545c.f19663m0.m31166z6(this.f21800v2.f56011id))), j760.m140076a("photos_number", Integer.valueOf(this.f21800v2.pictures.size())), j760.m140076a("intl_live_room_card_update", str));
            }
            if (this.f21756a2 || (iM200293G = vwb.m200293G(this.f21800v2.pictures, new w9j() { // from class: l.dy30
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Video);
                }
            })) == -1) {
                return;
            }
            m36811D3(iM200293G);
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: j */
    public VText mo36897j() {
        return this.f21723O0;
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo36898j0(SwipeDirection swipeDirection) {
        String str;
        if (mo36882e()) {
            if ((swipeDirection == SwipeDirection.RIGHT && !m36768C3()) || (swipeDirection == SwipeDirection.UP && m36916o2())) {
                FeedService feedServiceM29934N = CoreModule.m29934N();
                CoreMomentInfo coreMomentInfo = this.f21785o2;
                feedServiceM29934N.mo60289Kn(coreMomentInfo.owner, coreMomentInfo.f56008id, true, "other");
                o6j0.m162861e("e_moment_like", "p_suggest_users_home_view", j760.m140076a("is_moment_card", "1"), j760.m140076a("moment_id", this.f21785o2.f56008id), j760.m140076a("moments_user_id", this.f21785o2.owner));
            }
            boolean zIsEmpty = CoreModule.f17545c.f19663m0.f19402c2.isEmpty();
            int i = C7861b.f21811a[swipeDirection.ordinal()];
            if (i == 1) {
                str = "up";
            } else if (i != 2) {
                str = i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
            } else {
                str = "right";
            }
            zvf0.m220401w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", vwb.m200311Y("card_name", "moment_card"), vwb.m200311Y("swipe_directions", str), vwb.m200311Y("card_order", ""), vwb.m200311Y("is_guided_action", zIsEmpty ? "0" : "1"));
        }
        m36853T2();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m36899j2(User user, String str) {
        this.f21692E1 = CardType.profile;
        xdl0.m208344M(this.f21719N, true);
        xdl0.m208344M(this.f21687C1, false);
        xdl0.m208344M(this.f21691E0, false);
        xdl0.m208344M(this.f21723O0, false);
        xdl0.m208344M(this.f21726P0, false);
        xdl0.m208344M(this.f21738T0, false);
        xdl0.m208344M(this.f21694F0, false);
        xdl0.m208344M(this.f21709K0, false);
        xdl0.m208344M(this.f21703I0, false);
        xdl0.m208344M(this.f21741U0, false);
        xdl0.m208344M(this.f21706J0, false);
        xdl0.m208344M(this.f21729Q0, false);
        m36946x3();
        if (NullChecker.m81303a(this.f21698G1)) {
            this.f21698G1.mo37434c(user);
        }
        this.f21700H0.setCompoundDrawables(null, null, null, null);
        this.f21763e1.setImageResource(x2c0.f189392Hf);
        xdl0.m208344M(this.f21763e1, true);
        this.f21694F0.setOnClickListener(null);
        xdl0.m208344M(this.f21694F0, false);
        xdl0.m208345M0(this.f21789q1, false);
        xdl0.m208345M0(this.f21791r1, false);
        xdl0.m208345M0(this.f21787p1, false);
        xdl0.m208345M0(this.f21767g1, false);
        xdl0.m208345M0(this.f21765f1, false);
        this.f21767g1.setImageDrawable(null);
        this.f20290c = true;
        if (NullChecker.m81303a(user) && !TextUtils.equals(user.f56011id, CoreModule.f17545c.f19642f0.f19868J0.get())) {
            CoreModule.f17545c.f19685t1.m31515t(this);
        }
        int iM189644a = tm90.m189643d().m189644a(user);
        PictureView pictureView = this.f21737T;
        if (iM189644a != -1) {
            pictureView.f28032A.setVisibility(0);
            tm90.m189643d().m189651i(iM189644a, this.f21737T.f28034C);
        } else {
            pictureView.f28032A.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f21774j2)) {
            xdl0.m208344M(this.f21774j2, false);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m36900j3(CoreSuggested.UserInfo userInfo) {
        int i;
        if (!this.f21748W1 && userInfo.f19472id.equals(C4729a0.m31387j().f19525d.get())) {
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                i = x2c0.f189782U2;
            } else if ("ja".equals(language)) {
                i = x2c0.f189844W2;
            } else if ("ko".equals(language)) {
                i = x2c0.f189875X2;
            } else {
                i = "th".equals(language) ? x2c0.f189906Y2 : x2c0.f189813V2;
            }
            m36841O3(userInfo.f19472id);
            this.f21765f1.setImageResource(i);
            xdl0.m208345M0(this.f21765f1, true);
        }
    }

    @Override // p149l.iol
    /* JADX INFO: renamed from: k */
    public void mo36901k(boolean z) {
        mo35174n1();
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: k0 */
    public boolean mo36902k0() {
        return (NullChecker.m81303a(this.f21783n2) && this.f21783n2.isUndo) || m35161b1();
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: k1 */
    public float mo35171k1(float f) {
        if (Float.isInfinite(f)) {
            return f21682P2;
        }
        return f > 0.0f ? Math.min(f21682P2, f) : Math.max(-f21682P2, f);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m36903k2() {
        xdl0.m208345M0(this.f21773j1, this.f21792r2 && this.f21701H1 == 0);
        if (NullChecker.m81303a(this.f21768g2)) {
            xdl0.m208345M0(this.f21768g2, this.f21701H1 == 0);
        }
        if (NullChecker.m81303a(this.f21772i2)) {
            xdl0.m208345M0(this.f21772i2, this.f21701H1 == 0);
        }
        if (NullChecker.m81303a(this.f21770h2)) {
            xdl0.m208345M0(this.f21770h2, this.f21701H1 == 0);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m36904k3(int i) {
        if (m36923q2(this.f21783n2) && NullChecker.m81303a(this.f21800v2) && i == 0) {
            zvf0.m220402x("e_intl_card_audio", "p_suggest_users_home_view");
        }
    }

    @Override // p149l.hol
    /* JADX INFO: renamed from: l */
    public View mo36905l() {
        return this.f21744V0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m36906l2(User user, CoreSuggested.UserInfo userInfo) {
        if (m36919p2(user, userInfo) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && user.pictures.get(0) != userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture) {
            user.pictures.add(0, userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m36907l3(User user, int i, CoreSuggested.UserInfo userInfo) {
        int i2;
        boolean z = false;
        this.f21794s2 = false;
        if (user.isMe()) {
            return;
        }
        if ((user.superLikedMe() || user.letter()) && !xp5.m210478r(user, userInfo)) {
            this.f21794s2 = true;
            if (user.superLikedMe()) {
                i2 = IntlCountryCodeController.m28126v() ? x2c0.f189348G2 : x2c0.f189284E2;
            } else {
                i2 = x2c0.f189252D2;
            }
            this.f21767g1.setImageResource(i2);
            VImage vImage = this.f21767g1;
            if (i == 0 && this.f21701H1 == 0) {
                z = true;
            }
            xdl0.m208345M0(vImage, z);
            if (i == 0 && this.f21701H1 == 0 && !TextUtils.equals(this.f21796t2, userInfo.f19472id)) {
                this.f21796t2 = userInfo.f19472id;
                bt0.m103732e(this.f21767g1);
                bt0.m103753z(bt0.m103739l(this.f21767g1, bt0.f77162i, 0L, 500L, null, 1.2f, 1.0f), bt0.m103739l(this.f21767g1, View.ALPHA, 0L, 500L, null, 0.1f, 1.0f)).start();
            }
        }
        if (!userInfo.hasLikeMeSlideCardBottom || xdl0.m208349O0(this.f21694F0)) {
            return;
        }
        this.f21698G1.mo37435d(m36858V1(), user);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: m */
    public void mo36908m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m36899j2(user, "p_activity_momentcard_view");
        xdl0.m208344M(this.f21763e1, false);
        CoreMomentInfo coreMomentInfo = userInfo.coreMomentInfo;
        this.f21785o2 = coreMomentInfo;
        if (coreMomentInfo == null) {
            return;
        }
        xaj0<Integer, List<String>, Boolean> xaj0VarMo60286Ka = CoreModule.m29934N().mo60286Ka(this.f21785o2.f56008id);
        if (NullChecker.m81303a(xaj0VarMo60286Ka)) {
            this.f21785o2.likes.count = xaj0VarMo60286Ka.f191751a.intValue();
            CoreMomentInfo coreMomentInfo2 = this.f21785o2;
            coreMomentInfo2.likes.ids = xaj0VarMo60286Ka.f191752b;
            coreMomentInfo2.haveLiked = xaj0VarMo60286Ka.f191753c.booleanValue();
        }
        this.f21783n2 = userInfo;
        User user2 = this.f21800v2;
        if (user2 == null || !TextUtils.equals(user2.f56011id, user.f56011id)) {
            this.f21701H1 = 0;
        }
        xdl0.m208345M0(this.f21746W, false);
        xdl0.m208345M0(this.f21775k0, true);
        xdl0.m208345M0(this.f21786p0, false);
        xdl0.m208345M0(this.f21740U, false);
        this.f21781m2 = false;
        if (m36851S2(user)) {
            this.f21800v2 = user;
            this.f21793s1.setIndicatorCount(this.f21785o2.media.size());
            xdl0.m208345M0(this.f21793s1, this.f21785o2.media.size() > 1);
            if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149141B0) && i == 0) {
                int iIntValue = CoreModule.f17545c.f19639e0.f149141B0.f191753c.intValue();
                if (!user.f56011id.equals(CoreModule.f17545c.f19639e0.f149141B0.f191751a) || this.f21785o2.media.size() <= iIntValue) {
                    if (this.f21701H1 > this.f21785o2.media.size() - 1) {
                        this.f21701H1 = 0;
                    }
                    m36911m3(this.f21701H1);
                    if (this.f21701H1 == 0 && this.f21785o2.media.size() > 1) {
                        m36863X2(this.f21785o2.media.get(1));
                    }
                } else {
                    this.f21701H1 = iIntValue;
                    m36911m3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m36863X2(this.f21785o2.media.get(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < this.f21785o2.media.size()) {
                        m36863X2(this.f21785o2.media.get(i3));
                    }
                }
            } else {
                if (this.f21701H1 > this.f21785o2.media.size() - 1) {
                    this.f21701H1 = 0;
                }
                m36911m3(this.f21701H1);
                if (this.f21701H1 == 0 && this.f21785o2.media.size() > 1) {
                    m36863X2(this.f21785o2.media.get(1));
                }
            }
            this.f21781m2 = true;
        } else {
            m36911m3(this.f21701H1);
        }
        m36953z3(this.f21701H1, false);
        m36859V2(userInfo);
        m36885e3(user, userInfo, i == 0);
        m36928r3(user, userInfo);
        if (q8p.m173425i()) {
            m36888f3(user, userInfo, i);
        }
        xdl0.m208345M0(this.f21691E0, m36930s2() && !user.isMe());
        xdl0.m208372e0(this.f21691E0, !upa.m194633F1() ? t100.f167264m : 0);
        xdl0.m208360X(this.f21691E0, xdl0.m208349O0(this.f21793s1) ? t100.m186890d(25.0f) : t100.f167264m);
        xdl0.m208327D0(this.f21715M.getMeasuredWidth() - t100.m186890d(90.0f), this.f21691E0);
        m36867Z2(this.f21719N);
        if (i == 0) {
            xdl0.m208344M(view, true);
        }
        post(new Runnable() { // from class: l.yx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f200565a.m36808C2();
            }
        });
        VLinear vLinear = this.f21761d1;
        int i4 = t100.f167236K;
        xdl0.m208357U(vLinear, i4);
        m36861W1(i4);
        m36867Z2(this.f21737T);
        xdl0.m208345M0(this.f21743V, false);
        m36914n3(user);
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: m0 */
    public View mo36909m0() {
        return this.f21694F0;
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m36910m2(Animator animator) {
        if (NullChecker.m81303a(animator)) {
            return animator.isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m36911m3(int i) {
        xdl0.m208345M0(this.f21805y1, false);
        if (vwb.m200296J(this.f21785o2.media) || this.f21785o2.media.size() <= i) {
            return;
        }
        this.f21737T.m43999d0(this.f21785o2.media.get(i), !ht20.f109362a.get().booleanValue());
    }

    @Override // p149l.gol
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public TextView mo36912n0() {
        return this.f21706J0;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: n1 */
    public void mo35174n1() {
        super.mo35174n1();
        if (this.f21692E1 == CardType.profile) {
            setAlpha(1.0f);
            this.f21737T.m44011x(false);
        }
        if (NullChecker.m81303a(this.f21698G1)) {
            this.f21698G1.mo37433b();
        }
        if (NullChecker.m81303a(this.f21699G2)) {
            mkd0.m154992z(this.f21699G2);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public boolean m36913n2() {
        if (!m36848R2() || !this.f21737T.f28070a.getHierarchy().m112071r()) {
            return false;
        }
        m36824I3();
        return true;
    }

    /* JADX INFO: renamed from: n3 */
    public void m36914n3(User user) {
        m36877c2();
        if (this.f21794s2) {
            return;
        }
        q8p.Companion companion = q8p.INSTANCE;
        if (companion.m173439n(this.f21783n2, user) || companion.m173438m(this.f21783n2)) {
            this.f21748W1 = true;
            if (this.f21783n2.getRenderUser() != null && this.f21783n2.getRenderUser().isNonBinary()) {
                this.f21778l1.setText(R$string.f19094yf);
            }
            xdl0.m208345M0(this.f21776k1, true);
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: o0 */
    public View mo36915o0() {
        return this.f21712L0;
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: o1 */
    public void mo35175o1(long j) {
        super.mo35175o1(j);
        if (getContext() instanceof NewMainAct) {
            e5l.m114833b(j);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public boolean m36916o2() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return false;
        }
        if (userM169527p9.isVIP()) {
            return true;
        }
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM31484o3 == null ? null : counterM31484o3.superLikeLimit;
        return NullChecker.m81303a(counterSuperlikeAndUndoLimit) && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ogl0.m164248a0()) {
            m36870a2();
        }
        m36878c3();
        if (CoreModule.m29934N().mo60294M8()) {
            m36787Y1();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (mo36847Q3()) {
            mo36938u3();
        } else {
            m36855U1(this);
        }
        boolean zM28126v = IntlCountryCodeController.m28126v();
        PictureView pictureView = this.f21737T;
        if (zM28126v) {
            pictureView.m43983K(true, false, true);
            this.f21737T.f28037E0 = true;
        } else {
            pictureView.m43984L(true, false, true, true);
        }
        m36856U2();
        m36895i2();
        m36884e2();
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rjj rjjVar;
        if (this.f21707J1) {
            return false;
        }
        if (!mo35157X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m35160a1() || !m35163d1()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21714L2 = false;
            this.f21705I2 = motionEvent.getX();
            this.f21708J2 = motionEvent.getY();
        } else if (action == 2 && m36927r2(motionEvent.getX(), motionEvent.getY()) && !this.f21714L2 && (rjjVar = this.f20311x) != null) {
            rjjVar.m179606o(motionEvent.getX(), motionEvent.getY(), motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i2);
        if (iM121201d > 0) {
            this.f21750X1 = ((double) ((((float) ffx.m121201d(i)) * 1.0f) / ((float) iM121201d))) < zub.m220205d();
        }
        super.onMeasure(ffx.m121199b(ffx.m121201d(i)), ffx.m121199b(ffx.m121201d(i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.tx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172474a.m36940v2();
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.card.VSwipeCard, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo35157X0()) {
            super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21714L2 = false;
        } else if (action == 2) {
            this.f21714L2 = true;
        }
        ViewTreeObserverOnGlobalLayoutListenerC7866b.f21860I1.onTouch(this, motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: p */
    public void mo36917p(boolean z, boolean z2) {
        lra0.f129535v = false;
        View view = this.f21684A2;
        if (view == null) {
            return;
        }
        removeView(view);
        this.f21688C2 = false;
        CoreModule.f17545c.f19663m0.f19347J0.onNext(Boolean.FALSE);
        if (lra0.f129536w) {
            lra0.f129536w = false;
            zvf0.m220371D("e_user_guide_flash", "p_suggest_users_home_view", vwb.m200311Y("play_status", z2 ? "01" : "02"));
        }
        invalidate();
        this.f21684A2 = null;
        this.f21686B2 = null;
        m35147O0(true);
        if (z) {
            mo36817G();
        }
        mkd0.m154992z(this.f21690D2);
        mkd0.m154992z(this.f21693E2);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: p0 */
    public void mo36918p0() {
        int iM186890d;
        if (upa.m194790n2()) {
            iM186890d = t100.m186890d(204.0f);
        } else {
            iM186890d = !upa.m194790n2() ? t100.m186890d(137.0f) : 0;
        }
        int height = this.f21698G1.mo37437f().getHeight() + t100.m186890d(80.0f);
        if (this.f21698G1.mo37437f() != null) {
            if (this.f21783n2.hasLikeMeSlideCardReward && njf0.m159657h()) {
                xdl0.m208325C0(this.f21775k0, Math.max(iM186890d, height - t100.m186890d(26.0f)));
            } else {
                xdl0.m208325C0(this.f21775k0, Math.max(iM186890d, height - t100.m186890d(2.0f)));
            }
            xdl0.m208357U(this.f21776k1, (this.f21719N.getMeasuredHeight() - xdl0.m208392o0(this.f21698G1.mo37437f(), this.f21719N)) + t100.m186890d(8.0f));
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m36919p2(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(userInfo)) {
            if (CoreModule.f17545c.f19663m0.m31020L6(userInfo.f19472id) && !mo36922q0() && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f21756a2 = z;
        } else {
            this.f21756a2 = false;
        }
        return this.f21756a2;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m36920p3(final User user) {
        if (u59.m191852w() && this.f21692E1 == CardType.profile) {
            xdl0.m208344M(this.f21683A1, false);
            if (!NullChecker.m81303a(CoreModule.f17545c.f19686t2.f148152R) || !CoreModule.f17545c.f19686t2.f148152R.get().booleanValue()) {
                this.f21699G2 = m36858V1().duringCreated(CoreModule.f17545c.f19686t2.m168331k3(user.f56011id, "swipe", "user")).subscribe(mkd0.m154956H(new e30() { // from class: l.hy30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f110027a.m36810D2(user, (CoreData) obj);
                    }
                }, new e30() { // from class: l.iy30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        NewNewProfileCard.m36784S1((Throwable) obj);
                    }
                }));
                return;
            }
            RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
            riskOtherDataNew_.limited = false;
            riskOtherDataNew_.type = "test";
            riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
            m36935t3(user, riskOtherDataNew_);
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: q */
    public CoreMomentInfo mo36921q() {
        return this.f21785o2;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo36922q0() {
        return this.f21692E1 == CardType.virtual_card;
    }

    /* JADX INFO: renamed from: q2 */
    public final boolean m36923q2(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && CoreModule.f17545c.f19663m0.m31024M6(userInfo.f19472id);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m36924q3(User user, CoreSuggested.UserInfo userInfo) {
        this.f21777k2.m179672e(this, user, userInfo);
        this.f21777k2.m179670c(userInfo);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: r */
    public void mo36925r() {
        if (mo36836N()) {
            xdl0.m208344M(this.f21762d2, false);
        }
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: r0 */
    public SVGAnimationView mo36926r0() {
        return this.f21697G0;
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m36927r2(float f, float f2) {
        float f3 = this.f21705I2;
        float f4 = (f - f3) * (f - f3);
        float f5 = this.f21708J2;
        float f6 = f4 + ((f2 - f5) * (f2 - f5));
        int i = this.f21711K2;
        return f6 >= ((float) (i * i));
    }

    /* JADX INFO: renamed from: r3 */
    public final void m36928r3(User user, CoreSuggested.UserInfo userInfo) {
        this.f21777k2.m179671d(this, user, userInfo);
        this.f21777k2.m179670c(userInfo);
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: s */
    public void mo36929s() {
        if (NullChecker.m81304b(this.f21737T)) {
            PictureView pictureView = this.f21737T;
            if (pictureView.f28040G instanceof Video) {
                pictureView.m43990U();
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m36930s2() {
        View[] viewArr = {this.f21694F0, this.f21703I0, this.f21709K0, this.f21723O0, this.f21726P0, this.f21729Q0, this.f21738T0, this.f21741U0, this.f21706J0};
        boolean zM208349O0 = false;
        for (int i = 0; i < 9; i++) {
            zM208349O0 |= xdl0.m208349O0(viewArr[i]);
        }
        return zM208349O0;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m36931s3(final SwipeLikeButton swipeLikeButton) {
        if (this.f21783n2.isUndo) {
            xdl0.m208345M0(swipeLikeButton, true);
            swipeLikeButton.m39213w(new d30() { // from class: l.zx30
                @Override // p149l.d30
                public final void call() {
                    this.f205374a.m36813E2(swipeLikeButton);
                }
            });
        }
    }

    @Override // p149l.gol
    public void setCloseSmallWindow(boolean z) {
        this.f21760c2 = z;
    }

    public void setDisableShowBlurCover(boolean z) {
        this.f21696F2 = z;
    }

    @Override // p149l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // p149l.gol
    public void setMomentCardSilent(boolean z) {
        if (NullChecker.m81303a(this.f21737T)) {
            this.f21737T.setMomentCardSilent(z);
        }
    }

    public void setOnSwipeClickListener(InterfaceC7862c interfaceC7862c) {
    }

    @Override // p149l.a5m
    public void setPageHelper(@NonNull InterfaceC7863d interfaceC7863d) {
        this.f21790q2 = interfaceC7863d;
    }

    public void setShowPictureIndex(int i) {
        m36802A3(i, false);
    }

    @Override // p149l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p149l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
        this.f21798u2 = chj0Var;
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo36932t() {
        return this.f21799v1;
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: t0 */
    public VText mo36933t0() {
        return this.f21709K0;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m36934t2(View view) {
        if (mo36886f()) {
            mo36917p(true, false);
            return;
        }
        if (m36913n2()) {
            return;
        }
        if (mo36869a0() || mo36882e()) {
            m36816F3();
            return;
        }
        m36829K3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        w85.INSTANCE.m202145m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m36935t3(@NonNull User user, @NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        this.f21685B1.setText(riskOtherData.text);
        CoreModule.f17545c.f19686t2.m168335o3();
        xdl0.m208344M(this.f21683A1, true);
        xdl0.m208329E0(this.f21683A1, new View.OnClickListener() { // from class: l.jy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120280a.m36815F2(riskOtherData, view);
            }
        });
        zvf0.m220368A("e_swipe_safety_notice", "p_suggest_users_home_view", vwb.m200311Y("user_risk_type", riskOtherData.type), vwb.m200311Y("risk_userid", user.f56011id));
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: u0 */
    public VText mo36936u0() {
        return this.f21700H0;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m36937u2(View view) {
        if (mo36886f()) {
            mo36917p(true, false);
            return;
        }
        if (m36913n2()) {
            return;
        }
        if (mo36869a0() || mo36882e()) {
            m36814E3();
            return;
        }
        m36819G3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        w85.INSTANCE.m202145m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u3 */
    public void mo36938u3() {
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: v */
    public TextView mo36939v() {
        return this.f21720N0;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m36940v2() {
        if (m35163d1()) {
            mah0.m153729s0().m153764a1(m36858V1(), this);
            m36871a3();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m36941v3(Media media) {
        if (media == null || this.f21800v2 == null) {
            return;
        }
        for (int i = 0; i < this.f21800v2.pictures.size(); i++) {
            if (media.equals(this.f21800v2.media(i))) {
                setShowPictureIndex(i);
                this.f21698G1.mo37441j(i);
                m36943w3();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m36942w2(CoreSuggested.UserInfo userInfo, User user) {
        int measuredHeight = this.f21719N.getMeasuredHeight() - xdl0.m208392o0(this.f21698G1.mo37437f(), this.f21719N);
        xdl0.m208357U(this.f21767g1, measuredHeight);
        xdl0.m208357U(this.f21787p1, (xdl0.m208349O0(this.f21767g1) ? t100.m186890d(108.0f) : t100.f167266o) + measuredHeight);
        xdl0.m208357U(this.f21765f1, measuredHeight);
        m36893h3(userInfo, user.profile.extensions, measuredHeight + t100.f167264m, this.f21701H1 == 0);
        m36867Z2(this.f21719N);
        m36943w3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m36943w3() {
        if (this.f21698G1.mo37437f() == null) {
            return;
        }
        xdl0.m208357U(this.f21776k1, (this.f21719N.getMeasuredHeight() - xdl0.m208392o0(this.f21698G1.mo37437f(), this.f21719N)) + t100.f167259h);
    }

    @Override // p149l.d5m
    /* JADX INFO: renamed from: x0 */
    public int mo36944x0() {
        return 0;
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m36945x2(int[] iArr) {
        m36844P3();
        m36849R3();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m36946x3() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21793s1.getLayoutParams();
        int i = marginLayoutParams.rightMargin;
        int i2 = t100.f167264m;
        if (i != i2) {
            marginLayoutParams.rightMargin = i2;
            this.f21793s1.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p149l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo36947y() {
        return this.f21692E1 == CardType.profile;
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: y0 */
    public VImage mo36948y0() {
        return this.f21741U0;
    }

    /* JADX INFO: renamed from: y3 */
    public void m36949y3(Media media) {
        if (media == null || this.f21800v2 == null) {
            return;
        }
        for (int i = 0; i < this.f21800v2.pictures.size(); i++) {
            if (media.equals(this.f21800v2.media(i))) {
                setShowPictureIndex(i);
                return;
            }
        }
    }

    @Override // p149l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo36950z() {
        return mo36872b();
    }

    @Override // p149l.gol
    /* JADX INFO: renamed from: z0 */
    public View mo36951z0() {
        return this.f21703I0;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m36952z2(int[] iArr) {
        m36844P3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m36953z3(int i, boolean z) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f21783n2;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.m200296J(coreMomentInfo.media) || i < 0 || i > this.f21783n2.coreMomentInfo.media.size() - 1) {
            this.f21701H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f21793s1;
            if (z) {
                newPictureContainerIndicator.m36955b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f21701H1 = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f21793s1;
        if (z) {
            newPictureContainerIndicator2.m36955b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21704I1 = false;
        this.f21707J1 = false;
        this.f21736S1 = null;
        this.f21739T1 = upa.m194761h3();
        this.f21742U1 = false;
        this.f21745V1 = false;
        this.f21748W1 = false;
        this.f21750X1 = false;
        this.f21760c2 = false;
        this.f21762d2 = null;
        this.f21764e2 = null;
        this.f21766f2 = null;
        this.f21777k2 = new rk4();
        this.f21779l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f21781m2 = false;
        this.f21783n2 = null;
        this.f21788p2 = false;
        this.f21790q2 = new InterfaceC7863d() { // from class: l.ty30
        };
        this.f21792r2 = false;
        this.f21794s2 = false;
        this.f21808z2 = new C7860a();
        this.f21688C2 = false;
        this.f21696F2 = false;
        this.f21711K2 = t100.m186890d(15.0f);
        this.f21714L2 = false;
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21704I1 = false;
        this.f21707J1 = false;
        this.f21736S1 = null;
        this.f21739T1 = upa.m194761h3();
        this.f21742U1 = false;
        this.f21745V1 = false;
        this.f21748W1 = false;
        this.f21750X1 = false;
        this.f21760c2 = false;
        this.f21762d2 = null;
        this.f21764e2 = null;
        this.f21766f2 = null;
        this.f21777k2 = new rk4();
        this.f21779l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f21781m2 = false;
        this.f21783n2 = null;
        this.f21788p2 = false;
        this.f21790q2 = new InterfaceC7863d() { // from class: l.ty30
        };
        this.f21792r2 = false;
        this.f21794s2 = false;
        this.f21808z2 = new C7860a();
        this.f21688C2 = false;
        this.f21696F2 = false;
        this.f21711K2 = t100.m186890d(15.0f);
        this.f21714L2 = false;
    }
}
