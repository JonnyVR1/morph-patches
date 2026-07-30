package com.p051p1.mobile.putong.core.newui.home;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.IntlInsertCardData;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p051p1.mobile.putong.core.data.RiskOtherData;
import com.p051p1.mobile.putong.core.data.SamesCardData;
import com.p051p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8020c;
import com.p051p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import com.p051p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p051p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.animalfacial.AnimalFacialCardView;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.core.p058ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p051p1.mobile.putong.core.p058ui.likeminded.LikeMindedCardTabView;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.Extensions;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.C21545y9;
import p153l.a5i0;
import p153l.adc0;
import p153l.al80;
import p153l.asj0;
import p153l.atl;
import p153l.bkj0;
import p153l.bnl0;
import p153l.br5;
import p153l.c8d0;
import p153l.cl80;
import p153l.d79;
import p153l.dbc0;
import p153l.dnd0;
import p153l.dox;
import p153l.end0;
import p153l.fcj;
import p153l.fqj0;
import p153l.gra;
import p153l.gt0;
import p153l.gyp;
import p153l.haw;
import p153l.i4g0;
import p153l.i740;
import p153l.ik4;
import p153l.jde;
import p153l.jfr;
import p153l.jvd;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.kmj;
import p153l.kql;
import p153l.l51;
import p153l.mql;
import p153l.nbw;
import p153l.nh00;
import p153l.nwb;
import p153l.p6d0;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.pn4;
import p153l.psd0;
import p153l.pza0;
import p153l.pzi0;
import p153l.q7m;
import p153l.qa00;
import p153l.qap;
import p153l.qcj;
import p153l.ql4;
import p153l.r130;
import p153l.ric0;
import p153l.sfj0;
import p153l.sp0;
import p153l.spl0;
import p153l.sql;
import p153l.t7m;
import p153l.u7l;
import p153l.uih0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.uxl0;
import p153l.w740;
import p153l.wrf0;
import p153l.x20;
import p153l.x95;
import p153l.xnf0;
import p153l.xql;
import p153l.xu90;
import p153l.y20;
import p153l.z5h0;
import p153l.zi60;

/* JADX INFO: loaded from: classes11.dex */
public class NewNewProfileCard extends VSwipeCard implements kql, RunnableC4884c0.c, xql, sql, t7m, pn4 {

    /* JADX INFO: renamed from: N2 */
    public static C4499d f22422N2;

    /* JADX INFO: renamed from: O2 */
    public static final int f22423O2 = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: P2 */
    public static float f22424P2 = bnl0.m105588w0() * 1.5f;

    /* JADX INFO: renamed from: A1 */
    public LinearLayout f22425A1;

    /* JADX INFO: renamed from: A2 */
    public View f22426A2;

    /* JADX INFO: renamed from: B1 */
    public VText f22427B1;

    /* JADX INFO: renamed from: B2 */
    public String f22428B2;

    /* JADX INFO: renamed from: C1 */
    public VFrame f22429C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f22430C2;

    /* JADX INFO: renamed from: D1 */
    public ViewStub f22431D1;

    /* JADX INFO: renamed from: D2 */
    public kcg0 f22432D2;

    /* JADX INFO: renamed from: E0 */
    public LinearMeasureOrderLayout f22433E0;

    /* JADX INFO: renamed from: E1 */
    public CardType f22434E1;

    /* JADX INFO: renamed from: E2 */
    public kcg0 f22435E2;

    /* JADX INFO: renamed from: F0 */
    public VFrame f22436F0;

    /* JADX INFO: renamed from: F1 */
    public VirtualCard f22437F1;

    /* JADX INFO: renamed from: F2 */
    public boolean f22438F2;

    /* JADX INFO: renamed from: G0 */
    public SVGAnimationView f22439G0;

    /* JADX INFO: renamed from: G1 */
    public mql f22440G1;

    /* JADX INFO: renamed from: G2 */
    public kcg0 f22441G2;

    /* JADX INFO: renamed from: H0 */
    public VText f22442H0;

    /* JADX INFO: renamed from: H1 */
    public int f22443H1;

    /* JADX INFO: renamed from: H2 */
    public String f22444H2;

    /* JADX INFO: renamed from: I0 */
    public TextView f22445I0;

    /* JADX INFO: renamed from: I1 */
    public boolean f22446I1;

    /* JADX INFO: renamed from: I2 */
    public float f22447I2;

    /* JADX INFO: renamed from: J0 */
    public VText f22448J0;

    /* JADX INFO: renamed from: J1 */
    public boolean f22449J1;

    /* JADX INFO: renamed from: J2 */
    public float f22450J2;

    /* JADX INFO: renamed from: K0 */
    public VText f22451K0;

    /* JADX INFO: renamed from: K1 */
    public SwipeGuideRightView f22452K1;

    /* JADX INFO: renamed from: K2 */
    public int f22453K2;

    /* JADX INFO: renamed from: L0 */
    public VLinear f22454L0;

    /* JADX INFO: renamed from: L1 */
    public Animator f22455L1;

    /* JADX INFO: renamed from: L2 */
    public boolean f22456L2;

    /* JADX INFO: renamed from: M */
    public NewNewProfileCard f22457M;

    /* JADX INFO: renamed from: M0 */
    public ImageView f22458M0;

    /* JADX INFO: renamed from: M1 */
    public kcg0 f22459M1;

    /* JADX INFO: renamed from: M2 */
    public boolean f22460M2;

    /* JADX INFO: renamed from: N */
    public LinearLayout f22461N;

    /* JADX INFO: renamed from: N0 */
    public TextView f22462N0;

    /* JADX INFO: renamed from: N1 */
    public View f22463N1;

    /* JADX INFO: renamed from: O */
    public View f22464O;

    /* JADX INFO: renamed from: O0 */
    public VText f22465O0;

    /* JADX INFO: renamed from: O1 */
    public Animator f22466O1;

    /* JADX INFO: renamed from: P */
    public VLinear f22467P;

    /* JADX INFO: renamed from: P0 */
    public VText f22468P0;

    /* JADX INFO: renamed from: P1 */
    public Animator f22469P1;

    /* JADX INFO: renamed from: Q */
    public View f22470Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f22471Q0;

    /* JADX INFO: renamed from: Q1 */
    public View f22472Q1;

    /* JADX INFO: renamed from: R */
    public CardBottomMomentCardTwoView f22473R;

    /* JADX INFO: renamed from: R0 */
    public VDraweeView f22474R0;

    /* JADX INFO: renamed from: R1 */
    public Animator f22475R1;

    /* JADX INFO: renamed from: S */
    public View f22476S;

    /* JADX INFO: renamed from: S0 */
    public VText f22477S0;

    /* JADX INFO: renamed from: S1 */
    public ik4 f22478S1;

    /* JADX INFO: renamed from: T */
    public PictureView f22479T;

    /* JADX INFO: renamed from: T0 */
    public VText f22480T0;

    /* JADX INFO: renamed from: T1 */
    public final boolean f22481T1;

    /* JADX INFO: renamed from: U */
    public Space f22482U;

    /* JADX INFO: renamed from: U0 */
    public VImage f22483U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f22484U1;

    /* JADX INFO: renamed from: V */
    public View f22485V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f22486V0;

    /* JADX INFO: renamed from: V1 */
    public boolean f22487V1;

    /* JADX INFO: renamed from: W */
    public View f22488W;

    /* JADX INFO: renamed from: W0 */
    public CardBottomLiveView f22489W0;

    /* JADX INFO: renamed from: W1 */
    public boolean f22490W1;

    /* JADX INFO: renamed from: X0 */
    public CardBottomMomentGreetView f22491X0;

    /* JADX INFO: renamed from: X1 */
    public boolean f22492X1;

    /* JADX INFO: renamed from: Y0 */
    public CardBottomDefaultLayout f22493Y0;

    /* JADX INFO: renamed from: Y1 */
    public Runnable f22494Y1;

    /* JADX INFO: renamed from: Z0 */
    public CardBottomIntlLiveLayout f22495Z0;

    /* JADX INFO: renamed from: Z1 */
    public Runnable f22496Z1;

    /* JADX INFO: renamed from: a1 */
    public CardBottomIntlVoiceLayout f22497a1;

    /* JADX INFO: renamed from: a2 */
    public boolean f22498a2;

    /* JADX INFO: renamed from: b1 */
    public CardBottomTagLayout f22499b1;

    /* JADX INFO: renamed from: b2 */
    public int f22500b2;

    /* JADX INFO: renamed from: c1 */
    public CardBottomMomentLayout f22501c1;

    /* JADX INFO: renamed from: c2 */
    public boolean f22502c2;

    /* JADX INFO: renamed from: d1 */
    public VLinear f22503d1;

    /* JADX INFO: renamed from: d2 */
    public View f22504d2;

    /* JADX INFO: renamed from: e1 */
    public VIcon f22505e1;

    /* JADX INFO: renamed from: e2 */
    public VImage f22506e2;

    /* JADX INFO: renamed from: f1 */
    public VImage f22507f1;

    /* JADX INFO: renamed from: f2 */
    public VText f22508f2;

    /* JADX INFO: renamed from: g1 */
    public VImage f22509g1;

    /* JADX INFO: renamed from: g2 */
    public VDraweeView f22510g2;

    /* JADX INFO: renamed from: h1 */
    public ViewStub f22511h1;

    /* JADX INFO: renamed from: h2 */
    public AnimalFacialCardView f22512h2;

    /* JADX INFO: renamed from: i1 */
    public ViewStub f22513i1;

    /* JADX INFO: renamed from: i2 */
    public RegularStickerCardTabView f22514i2;

    /* JADX INFO: renamed from: j1 */
    public LikeMindedCardTabView f22515j1;

    /* JADX INFO: renamed from: j2 */
    public IntlCommercialCardBottomActionLayout f22516j2;

    /* JADX INFO: renamed from: k0 */
    public View f22517k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f22518k1;

    /* JADX INFO: renamed from: k2 */
    public final ql4 f22519k2;

    /* JADX INFO: renamed from: l1 */
    public VText f22520l1;

    /* JADX INFO: renamed from: l2 */
    public jxd0 f22521l2;

    /* JADX INFO: renamed from: m1 */
    public ViewStub f22522m1;

    /* JADX INFO: renamed from: m2 */
    public boolean f22523m2;

    /* JADX INFO: renamed from: n1 */
    public ViewStub f22524n1;

    /* JADX INFO: renamed from: n2 */
    public CoreSuggested.UserInfo f22525n2;

    /* JADX INFO: renamed from: o1 */
    public ViewStub f22526o1;

    /* JADX INFO: renamed from: o2 */
    public CoreMomentInfo f22527o2;

    /* JADX INFO: renamed from: p0 */
    public View f22528p0;

    /* JADX INFO: renamed from: p1 */
    public SuperLikeBanner f22529p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f22530p2;

    /* JADX INFO: renamed from: q1 */
    public SwipeLikeButton f22531q1;

    /* JADX INFO: renamed from: q2 */
    public InterfaceC8014d f22532q2;

    /* JADX INFO: renamed from: r1 */
    public SwipeLikeButton f22533r1;

    /* JADX INFO: renamed from: r2 */
    public boolean f22534r2;

    /* JADX INFO: renamed from: s1 */
    public NewPictureContainerIndicator f22535s1;

    /* JADX INFO: renamed from: s2 */
    public boolean f22536s2;

    /* JADX INFO: renamed from: t1 */
    public ViewStub f22537t1;

    /* JADX INFO: renamed from: t2 */
    public String f22538t2;

    /* JADX INFO: renamed from: u1 */
    public ViewStub f22539u1;

    /* JADX INFO: renamed from: u2 */
    public fqj0 f22540u2;

    /* JADX INFO: renamed from: v1 */
    public ViewStub f22541v1;

    /* JADX INFO: renamed from: v2 */
    public User f22542v2;

    /* JADX INFO: renamed from: w1 */
    public ViewStub f22543w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f22544w2;

    /* JADX INFO: renamed from: x1 */
    public ViewStub f22545x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f22546x2;

    /* JADX INFO: renamed from: y1 */
    public LinearLayout f22547y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f22548y2;

    /* JADX INFO: renamed from: z1 */
    public VText f22549z1;

    /* JADX INFO: renamed from: z2 */
    public x20 f22550z2;

    public enum CardType {
        unknown("unknown"),
        profile("profile"),
        virtual_card(CoreSuggested.UserInfo.VIRTUAL_CARD);


        /* JADX INFO: renamed from: id */
        public String f22551id;

        CardType(String str) {
            this.f22551id = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$a */
    public class C8011a implements x20 {
        public C8011a() {
        }

        @Override // p153l.x20
        public void call() {
            NewNewProfileCard.this.f22484U1 = false;
            NewNewProfileCard.this.f22529p1.m40205i();
            bnl0.m105525M0(NewNewProfileCard.this.f22529p1, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$b */
    public static /* synthetic */ class C8012b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22553a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f22553a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22553a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22553a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$c */
    public interface InterfaceC8013c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$d */
    public interface InterfaceC8014d {
    }

    public NewNewProfileCard(Context context) {
        super(context);
        this.f22446I1 = false;
        this.f22449J1 = false;
        this.f22478S1 = null;
        this.f22481T1 = gra.m131692h3();
        this.f22484U1 = false;
        this.f22487V1 = false;
        this.f22490W1 = false;
        this.f22492X1 = false;
        this.f22502c2 = false;
        this.f22504d2 = null;
        this.f22506e2 = null;
        this.f22508f2 = null;
        this.f22519k2 = new ql4();
        this.f22521l2 = new jxd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f22523m2 = false;
        this.f22525n2 = null;
        this.f22530p2 = false;
        this.f22532q2 = new InterfaceC8014d() { // from class: l.h740
        };
        this.f22534r2 = false;
        this.f22536s2 = false;
        this.f22550z2 = new C8011a();
        this.f22430C2 = false;
        this.f22438F2 = false;
        this.f22453K2 = qa00.m175859d(15.0f);
        this.f22456L2 = false;
        this.f21033d = true;
        addView(new View(m37861V1()));
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m37771C3() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return true;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterLikeLimit counterLikeLimit = counterM32487o3 == null ? null : counterM32487o3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !userM116600p9.isVIP();
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m37775G1(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ Unit m37777I1() {
        CoreModule.f18264c.f20405m0.f20162i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m37787S1(Throwable th) {
    }

    /* JADX INFO: renamed from: W2 */
    private void m37789W2(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            nwb.m164976n(media);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127160x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m37790Y1() {
        if (NullChecker.m82486a(f22422N2) && f22422N2.m21911x("user_state_bubble")) {
            f22422N2.m21899k("user_state_bubble");
        }
    }

    /* JADX INFO: renamed from: o3 */
    private void m37791o3(int i) {
        List<Media> list;
        User user = this.f22542v2;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f22542v2.media(i);
        this.f22479T.setShowPetTag(true);
        this.f22479T.setIsFemale(this.f22542v2.isFemale());
        if (m37922p2(this.f22542v2, this.f22525n2)) {
            this.f22479T.m45179a0(media, -1, false, true);
            return;
        }
        boolean zM35222x3 = CoreModule.f18264c.f20405m0.f20150e2.m35222x3(this.f22525n2);
        LinearLayout linearLayout = this.f22547y1;
        if (zM35222x3) {
            bnl0.m105525M0(linearLayout, false);
            this.f22479T.m45177Y(media, 60);
        } else {
            bnl0.m105525M0(linearLayout, false);
            this.f22479T.m45176X(media);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m37794r1(View view, int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m37834L2(Drawable drawable) {
        this.f22426A2 = p9r.m171370a(m37861V1()).inflate(kec0.f125457I8, (ViewGroup) this, false);
        psd0.m173633z(this.f22432D2);
        psd0.m173633z(this.f22435E2);
        VImage vImage = (VImage) this.f22426A2.findViewById(adc0.f70313e2);
        VText vText = (VText) this.f22426A2.findViewById(adc0.f70083Q6);
        VText vText2 = (VText) this.f22426A2.findViewById(adc0.f69901Fb);
        VText vText3 = (VText) this.f22426A2.findViewById(adc0.f70651y1);
        if (NullChecker.m82486a(this.f22542v2)) {
            vText.setText(TEnum.equals(this.f22542v2.gender, "female") ? m37861V1().getString(R$string.f19171d1) : m37861V1().getString(R$string.f19201e1));
            vText2.setText(TEnum.equals(this.f22542v2.gender, "female") ? m37861V1().getString(R$string.f19109b1) : m37861V1().getString(R$string.f19140c1));
            vText3.setText(TEnum.equals(this.f22542v2.gender, "female") ? m37861V1().getString(R$string.f19232f1) : m37861V1().getString(R$string.f19263g1));
        }
        View viewFindViewById = this.f22426A2.findViewById(adc0.f70330f2);
        int paddingBottom = this.f22467P.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = paddingBottom;
        viewFindViewById.setLayoutParams(layoutParams);
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20202w0;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        pza0.f154796w = true;
        vImage.setBackground(drawable);
        addView(this.f22426A2);
        bnl0.m105509E0(this.f22426A2, new View.OnClickListener() { // from class: l.s640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166537a.m37821G2(view);
            }
        });
        CoreModule.f18264c.f20405m0.f20089J0.onNext(bool);
        this.f22430C2 = true;
        pza0.f154795v = true;
        this.f22428B2 = this.f22542v2.f56859id;
        m36150O0(false);
        m37849Q2();
        m37870Z2(this);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m37798v1(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m37802y2() {
        bnl0.m105533Q0(this.f22479T, new y20() { // from class: l.p640
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150735a.m37948x2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m37804A2() {
        bnl0.m105533Q0(this.f22479T, new y20() { // from class: l.q640
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155782a.m37955z2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public void m37805A3(int i, boolean z) {
        User user = this.f22542v2;
        if (user == null || jyb.m147479J(user.pictures) || i < 0 || i > this.f22542v2.pictures.size() - 1) {
            this.f22443H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f22535s1;
            if (z) {
                newPictureContainerIndicator.m37958b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f22443H1 = i;
        if (CoreModule.f18264c.f20405m0.m32023L6(this.f22542v2.f56859id)) {
            m37864W1(0);
        }
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f22535s1;
        if (z) {
            newPictureContainerIndicator2.m37958b(this.f22443H1);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(this.f22443H1);
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: B0 */
    public boolean mo37806B0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, q7m q7mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (!uih0.m196214m0() || C21545y9.INSTANCE.m214798l()) {
            if (ric0.m181583m() && NullChecker.m82486a(this.f22452K1) && bnl0.m105529O0(this.f22452K1)) {
                uih0.m196194c1();
                this.f22452K1.m47176k0(false);
                bnl0.m105525M0(this.f22452K1, false);
            }
        } else {
            if (uih0.m196232y0(userInfo.f20214id)) {
                uih0.m196223s0().m196265i1(viewTreeObserverOnGlobalLayoutListenerC8017b, this, userInfo, i);
                return true;
            }
            psd0.m173633z(this.f22459M1);
            if (NullChecker.m82486a(this.f22455L1) && this.f22455L1.isRunning()) {
                this.f22455L1.end();
                setRotation(0.0f);
                setTranslationX(0.0f);
                setPivotX(getWidth() / 2);
                setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f22452K1;
            if (NullChecker.m82486a(swipeGuideRightView) && bnl0.m105529O0(swipeGuideRightView)) {
                bnl0.m105524M(swipeGuideRightView, false);
            }
            uih0.m196223s0().m196262f1();
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38239U5(false);
        }
        return false;
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m37807B2(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        nbw nbwVar = nbw.INSTANCE;
        nbwVar.m162219N(z, "click");
        haw.INSTANCE.m134320a().m134280W(m37861V1(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.f20214id, nbwVar.m162266x(), new Function0() { // from class: l.b740
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewNewProfileCard.m37777I1();
            }
        }, null, null, true);
    }

    /* JADX INFO: renamed from: B3 */
    public final void m37808B3(float f) {
        setPivotX(getWidth() / 2.0f);
        setPivotY(getHeight() / 2.0f);
        gt0.m132168n(this, View.ROTATION_Y, 0.0f, f, 0.0f).setDuration(200L).start();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: C */
    public void mo37809C() {
        User user = this.f22542v2;
        if (user == null || TextUtils.isEmpty(user.f56859id) || TextUtils.equals(this.f22542v2.f56859id, CoreSuggested.UserInfo.VIRTUAL_CARD)) {
            return;
        }
        C4499d.m21895l().m21899k("desc_click_bubble_tip");
        C4499d.m21895l().m21899k("bubble_intl_instant_match_guide");
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: C0 */
    public void mo37810C0() {
        if (NullChecker.m82486a(this.f22479T)) {
            this.f22479T.m45192o0();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m37811C2() {
        m37870Z2(this.f22461N);
        mo37921p0();
        m37946w3();
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: D */
    public boolean mo37812D(String str) {
        View view;
        if (TextUtils.equals("female_like_flag", str)) {
            return NullChecker.m82486a(this.f22525n2) && NullChecker.m82486a(this.f22542v2) && !this.f22542v2.superLikedMe() && !this.f22525n2.isSpecialLike() && (this.f22525n2.isUserLikeMe() || (CoreModule.f18276o.m132212b().mo34652wf() && this.f22525n2.hasLikeMeSlideCardTop));
        }
        if (TextUtils.equals("female_like_flag_lower_left", str)) {
            return NullChecker.m82486a(this.f22440G1) && this.f22440G1.mo38443i();
        }
        return TextUtils.equals("superlike_guide", str) && (view = this.f22504d2) != null && bnl0.m105529O0(view);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m37813D2(User user, CoreData coreData) {
        if (NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.userRisk)) {
            m37938t3(user, coreData.userRisk);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m37814D3(int i) {
        User user = this.f22542v2;
        if (user == null) {
            return;
        }
        boolean z = false;
        pza0.m174355g("p_suggest_users_home_view", this.f22443H1 + 1 <= user.pictures.size() - 1, false, this.f22542v2, this.f22440G1.mo38441g());
        if (this.f22443H1 == i) {
            return;
        }
        this.f22479T.m45194x(true);
        m37791o3(i);
        m37805A3(i, true);
        this.f22440G1.mo38444j(i);
        VImage vImage = this.f22509g1;
        if (this.f22536s2 && this.f22443H1 == 0) {
            z = true;
        }
        bnl0.m105525M0(vImage, z);
        m37946w3();
        if (asj0.m99935d0()) {
            l51.m152888H(m37861V1(), new i740(this), 100L);
        }
        int i2 = i + 1;
        if (i2 < this.f22542v2.pictures.size()) {
            m37789W2(this.f22542v2.media(i2));
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: E */
    public IntlLiveSmallWindow mo37815E() {
        return null;
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m37816E2(SwipeLikeButton swipeLikeButton) {
        bnl0.m105525M0(swipeLikeButton, false);
        this.f22525n2.isUndo = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX INFO: renamed from: E3 */
    public void m37817E3() {
        String str;
        int size = this.f22443H1 + 1;
        if (size > this.f22527o2.media.size() - 1) {
            size = this.f22527o2.media.size() - 1;
        }
        if (NullChecker.m82486a(this.f22525n2)) {
            CoreSuggested.UserInfo userInfo = this.f22525n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        pza0.m174355g(str, this.f22443H1 + 1 <= this.f22542v2.pictures.size() - 1, false, this.f22542v2, this.f22440G1.mo38441g());
        if (this.f22443H1 == size) {
            m37808B3(1.5f);
            return;
        }
        this.f22479T.m45194x(true);
        m37914m3(size);
        bnl0.m105525M0(this.f22518k1, this.f22490W1);
        m37956z3(size, true);
        m37946w3();
        if (asj0.m99935d0()) {
            l51.m152888H(m37861V1(), new i740(this), 100L);
        }
        int i = size + 1;
        if (i < this.f22527o2.media.size()) {
            m37866X2(this.f22527o2.media.get(i));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m37818F2(RiskOtherData riskOtherData, View view) {
        cl80.m110426e().m110439q(al80.m98641a(new gyp(m37861V1())));
        i4g0.m138523u("e_swipe_safety_notice", "p_suggest_users_home_view", jyb.m147494Y("user_risk_type", riskOtherData.type));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: F3 */
    public void m37819F3() {
        String str;
        int i = this.f22443H1 - 1;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.m82486a(this.f22525n2)) {
            CoreSuggested.UserInfo userInfo = this.f22525n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        pza0.m174355g(str, this.f22443H1 - 1 >= 0, true, this.f22542v2, this.f22440G1.mo38441g());
        if (this.f22443H1 == i || i > this.f22527o2.media.size() - 1) {
            m37808B3(-1.5f);
            return;
        }
        this.f22479T.m45194x(true);
        m37914m3(i);
        m37956z3(i, true);
        bnl0.m105525M0(this.f22518k1, this.f22490W1);
        m37946w3();
        if (asj0.m99935d0()) {
            l51.m152888H(m37861V1(), new i740(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m37866X2(this.f22527o2.media.get(i2));
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: G */
    public void mo37820G() {
        if (asj0.m99935d0() && NullChecker.m82487b(this.f22479T)) {
            PictureView pictureView = this.f22479T;
            if (pictureView.f28888G instanceof Video) {
                pictureView.m45174V();
            }
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m37821G2(View view) {
        mo37920p(true, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX INFO: renamed from: G3 */
    public void m37822G3() {
        String str;
        if (this.f22542v2 == null) {
            return;
        }
        if (CoreModule.m30932N().mo61478M8()) {
            m37790Y1();
        }
        mo37809C();
        int size = this.f22443H1 + 1;
        if (size > this.f22542v2.pictures.size() - 1) {
            size = this.f22542v2.pictures.size() - 1;
        }
        if (NullChecker.m82486a(this.f22525n2)) {
            CoreSuggested.UserInfo userInfo = this.f22525n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        boolean z = false;
        pza0.m174355g(str, this.f22443H1 + 1 <= this.f22542v2.pictures.size() - 1, false, this.f22542v2, this.f22440G1.mo38441g());
        if (this.f22443H1 == size) {
            m37808B3(1.5f);
            return;
        }
        if (gra.m131775y1()) {
            nwb.m164975m();
        }
        this.f22479T.m45194x(true);
        m37791o3(size);
        m37805A3(size, true);
        bnl0.m105525M0(this.f22518k1, this.f22490W1);
        this.f22440G1.mo38444j(size);
        VImage vImage = this.f22509g1;
        if (this.f22536s2 && this.f22443H1 == 0) {
            z = true;
        }
        bnl0.m105525M0(vImage, z);
        m37906k2();
        m37946w3();
        if (asj0.m99935d0()) {
            l51.m152888H(m37861V1(), new i740(this), 100L);
        }
        int i = size + 1;
        if (i < this.f22542v2.pictures.size()) {
            m37789W2(this.f22542v2.media(i));
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ Bitmap m37823H2() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: H3 */
    public void m37824H3() {
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: I */
    public void mo37825I() {
        if (this.f22479T.f28888G instanceof Video) {
            if (NullChecker.m82486a(this.f22542v2)) {
                this.f22479T.f28889G0 = CoreModule.f18264c.f20405m0.f20138a2.containsKey(this.f22542v2.f56859id);
            }
            if (mo37889f() || m150923h()) {
                return;
            }
            this.f22479T.m45174V();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ C22421c m37826I2() {
        return C22421c.fromCallable(new Callable() { // from class: l.o640
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f145140a.m37823H2();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m37827I3() {
        m37830J3(true);
    }

    @Override // p153l.sql
    /* JADX INFO: renamed from: J */
    public View mo37828J() {
        return this.f22461N;
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ C22421c m37829J2(Bitmap bitmap) {
        return C22421c.just(asj0.m99938p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m37830J3(boolean z) {
        View view;
        if (z) {
            sfj0.m185601h("e_card_guide_overlay", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
        if ((this.f22542v2.media(this.f22443H1) instanceof Video) && asj0.m99935d0() && NullChecker.m82486a(this.f22479T)) {
            this.f22479T.m45173U();
        }
        psd0.m173633z(this.f22432D2);
        if (this.f22430C2 && (view = this.f22426A2) != null) {
            removeView(view);
            this.f22426A2 = null;
            this.f22430C2 = false;
            psd0.m173633z(this.f22435E2);
        }
        this.f22432D2 = m37861V1().duringCreated(((C22421c) new pcj() { // from class: l.j740
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f118628a.m37826I2();
            }
        }.call()).compose(psd0.m173607R()).observeOn(Schedulers.computation()).flatMap(new qcj() { // from class: l.k740
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124239a.m37829J2((Bitmap) obj);
            }
        }).compose(psd0.m173632y()).map(new qcj() { // from class: l.l740
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130321a.m37831K2((Bitmap) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.m740
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135056a.m37834L2((Drawable) obj);
            }
        }, new y20() { // from class: l.i640
            @Override // p153l.y20
            public final void call(Object obj) {
                NewNewProfileCard.m37775G1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ Drawable m37831K2(Bitmap bitmap) {
        dnd0 dnd0VarM121524a = end0.m121524a(m37861V1().getResources(), bitmap);
        dnd0VarM121524a.m117059e(qa00.f156328o);
        return dnd0VarM121524a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX INFO: renamed from: K3 */
    public void m37832K3() {
        String str;
        if (this.f22542v2 == null) {
            return;
        }
        if (CoreModule.m30932N().mo61478M8()) {
            m37790Y1();
        }
        mo37809C();
        int i = this.f22443H1 - 1;
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.m82486a(this.f22525n2)) {
            CoreSuggested.UserInfo userInfo = this.f22525n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        pza0.m174355g(str, this.f22443H1 - 1 >= 0, true, this.f22542v2, this.f22440G1.mo38441g());
        if (this.f22443H1 == i || i > this.f22542v2.pictures.size() - 1) {
            m37808B3(-1.5f);
            return;
        }
        this.f22479T.m45194x(true);
        m37791o3(i);
        m37805A3(i, true);
        bnl0.m105525M0(this.f22518k1, this.f22490W1);
        this.f22440G1.mo38444j(i);
        VImage vImage = this.f22509g1;
        if (this.f22536s2 && this.f22443H1 == 0) {
            z = true;
        }
        bnl0.m105525M0(vImage, z);
        m37906k2();
        m37946w3();
        if (asj0.m99935d0()) {
            l51.m152888H(m37861V1(), new i740(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m37789W2(this.f22542v2.media(i2));
        }
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: L */
    public void mo37833L() {
        if (NullChecker.m82486a(this.f22479T) && (this.f22479T.f28888G instanceof Video) && !mo37889f()) {
            this.f22479T.m45174V();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m37835L3(boolean z) {
        if (z) {
            bnl0.m105525M0(this.f22529p1, true);
            if (this.f22484U1) {
                return;
            }
            this.f22484U1 = true;
            this.f22529p1.m40207k();
            return;
        }
        boolean z2 = this.f22484U1;
        SuperLikeBanner superLikeBanner = this.f22529p1;
        if (z2) {
            superLikeBanner.m40208l(true, this.f22550z2);
        } else {
            superLikeBanner.m40205i();
            bnl0.m105525M0(this.f22529p1, false);
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: M */
    public void mo37836M() {
        if (this.f22542v2 == null) {
            return;
        }
        final C4499d c4499dM21895l = C4499d.m21895l();
        if (!m36169g() || uih0.m196232y0(this.f22542v2.f56859id) || uih0.m196223s0().m196283z0() || !CoreModule.m30932N().mo61478M8() || this.f22521l2.get().booleanValue()) {
            return;
        }
        final C4496a c4496aM21874q = new C4496a(getContext()).m21848D(this.f22542v2.isFemale() ? "轻触和她互动" : "轻触和他互动").m21854J(13.0f).m21873p(75).m21881x(qa00.m175859d(6.0f)).m21872o(C4496a.f16401P, qa00.m175859d(9.0f)).m21849E(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21858N(new C4496a.d() { // from class: l.y640
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.d
            /* JADX INFO: renamed from: a */
            public final void mo21886a(View view) {
                this.f197628a.m37837M2(view);
            }
        }).m21852H(qa00.m175859d(16.0f), qa00.m175859d(10.5f), qa00.m175859d(16.0f), qa00.m175859d(10.5f)).m21862d(new C4496a.b() { // from class: l.z640
            @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.b
            /* JADX INFO: renamed from: a */
            public final void mo21884a(String str) {
                NewNewProfileCard.m37790Y1();
            }
        }).m21874q(C4496a.f16401P | C4496a.f16399N);
        this.f22496Z1 = new Runnable() { // from class: l.a740
            @Override // java.lang.Runnable
            public final void run() {
                this.f68788a.m37840N2(c4499dM21895l, c4496aM21874q);
            }
        };
        l51.m152888H(m37861V1(), this.f22496Z1, 500L);
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: M0 */
    public void mo32529M0(String str) {
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m37837M2(View view) {
        this.f22521l2.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M3 */
    public void m37838M3() {
        if (m36169g()) {
            p6d0.m170847d0().m170853h0();
        } else {
            c8d0.m108357g0();
        }
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: N */
    public boolean mo37839N() {
        return NullChecker.m82486a(this.f22504d2) && bnl0.m105529O0(this.f22504d2);
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m37840N2(C4499d c4499d, C4496a c4496a) {
        c4499d.m21908u(c4496a, mo37868Z(), "user_state_bubble");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: N3 */
    public void m37841N3(final String str) {
        l51.m152888H(m37861V1(), new Runnable() { // from class: l.c740
            @Override // java.lang.Runnable
            public final void run() {
                this.f80081a.m37846P2(str);
            }
        }, TextUtils.equals("backUser", str) ? 500L : 2000L);
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: O */
    public boolean mo37842O() {
        return this.f22449J1;
    }

    /* JADX INFO: renamed from: O2 */
    public final /* synthetic */ boolean m37843O2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        m37884d3();
        return false;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m37844O3(String str) {
        if (str.equals(this.f22444H2)) {
            return;
        }
        i4g0.m138526x("e_special_card", "p_suggest_users_home_view");
        this.f22444H2 = str;
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: P */
    public boolean mo37845P() {
        if (NullChecker.m82486a(this.f22479T)) {
            return this.f22479T.f28893I0.m222761e().booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m37846P2(String str) {
        if (!m36166d1() || NullChecker.m82486a(this.f22459M1)) {
            return;
        }
        if (TextUtils.equals("newUser", str) && this.f22487V1) {
            return;
        }
        if (this.f22472Q1 == null) {
            View viewInflate = this.f22545x1.inflate();
            this.f22472Q1 = viewInflate;
            viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.e740
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f92401a.m37843O2(view, motionEvent);
                }
            });
            m37878b3();
        }
        if (this.f22475R1 == null) {
            this.f22475R1 = m37877b2(this);
        }
        if (this.f22475R1.isRunning()) {
            return;
        }
        bnl0.m105524M(this.f22472Q1, true);
        if (TextUtils.equals("backUser", str)) {
            i4g0.m138526x("e_reback_swipe_guide", "p_suggest_users_home_view");
        } else if (TextUtils.equals("newUser", str)) {
            CoreModule.f18264c.f20381e0.f89028F2.put(Boolean.TRUE);
            i4g0.m138526x("e_home_swipe_gesture", "p_suggest_users_home_view");
        }
        this.f22475R1.start();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m37847P3() {
        bnl0.m105540X(this.f22488W, this.f22479T.getMeasuredHeight());
        bnl0.m105505C0(this.f22488W, this.f22457M.getMeasuredHeight() - this.f22479T.getMeasuredHeight());
        boolean zIsMe = this.f22542v2.isMe();
        View view = this.f22528p0;
        if (zIsMe) {
            bnl0.m105540X(view, this.f22479T.getMeasuredHeight() - qa00.m175859d(176.0f));
        } else {
            bnl0.m105540X(view, this.f22479T.getMeasuredHeight() - qa00.m175859d(103.0f));
        }
        m37870Z2(this.f22461N);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: Q */
    public void mo37848Q(CoreSuggested.UserInfo userInfo, uxl0 uxl0Var, VirtualCardType virtualCardType, int i) {
        this.f22525n2 = userInfo;
        m37890f2(CardType.virtual_card);
        if (NullChecker.m82486a(this.f22504d2) && bnl0.m105529O0(this.f22504d2)) {
            bnl0.m105524M(this.f22504d2, false);
        }
        if (this.f22437F1 == null) {
            VirtualCard virtualCard = (VirtualCard) this.f22431D1.inflate();
            this.f22437F1 = virtualCard;
            virtualCard.m47264F0(this);
        }
        bnl0.m105525M0(this.f22437F1, true);
        if (this.f22437F1.getAdapter() == null || this.f22437F1.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
            this.f22437F1.setCardType(virtualCardType);
            this.f22437F1.setAdapter(uxl0Var.mo37757d2(virtualCardType, userInfo));
            this.f22437F1.setClipChildren(false);
        }
        m37862V2(this.f22525n2);
        this.f22437F1.m47267J0(this, i, virtualCardType, userInfo);
        m37870Z2(this);
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: Q0 */
    public void mo36152Q0() {
        if (!IntlCountryCodeController.m29125v()) {
            super.mo36152Q0();
            return;
        }
        if (NullChecker.m82486a(this.f22540u2)) {
            this.f22540u2.m126773k(this);
            CoreSuggested.UserInfo userInfo = this.f22525n2;
            if (userInfo.isUndo) {
                userInfo.isUndo = false;
            }
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m37849Q2() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22426A2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: Q3 */
    public boolean mo37850Q3() {
        return false;
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m37851R2() {
        if (this.f22438F2 || !this.f22481T1 || this.f22449J1 || CoreModule.f18264c.f20405m0.f20202w0.get().booleanValue() || mo37889f() || this.f22542v2 == null || mo37925q0()) {
            return false;
        }
        if (NullChecker.m82486a(this.f22463N1) && bnl0.m105529O0(this.f22463N1)) {
            return false;
        }
        return ((NullChecker.m82486a(this.f22506e2) && bnl0.m105529O0(this.f22506e2)) || this.f22498a2 || m37926q2(this.f22525n2) || m37913m2(this.f22466O1) || m37913m2(this.f22469P1)) ? false : true;
    }

    /* JADX INFO: renamed from: R3 */
    public void m37852R3() {
        bnl0.m105537U(this.f22505e1, this.f22488W.getHeight() + qa00.f156337x);
        m37864W1(this.f22488W.getHeight() + qa00.f156326m);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: S */
    public void mo37853S(final x20 x20Var) {
        this.f22449J1 = true;
        bnl0.m105509E0(this, null);
        bnl0.m105509E0(this.f22461N, new View.OnClickListener() { // from class: l.u640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewNewProfileCard.m37798v1(x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m37854S2(User user) {
        if (this.f22542v2 == null || user.isMe() || !this.f22479T.f28918a.getHierarchy().m207057r()) {
            return true;
        }
        return !user.equals(this.f22542v2);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: T */
    public void mo37855T(final User user, final CoreSuggested.UserInfo userInfo, int i) {
        this.f22500b2 = i;
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m37902j2(user, null);
        bnl0.m105525M0(this.f22517k0, false);
        this.f22525n2 = userInfo;
        this.f22527o2 = null;
        User user2 = this.f22542v2;
        if (user2 != null && TextUtils.equals(user2.f56859id, user.f56859id) && user.pictures.size() == this.f22443H1 && m37922p2(user, userInfo)) {
            m37909l2(user, userInfo);
            if (user.pictures.size() <= this.f22443H1) {
                this.f22443H1 = 0;
            }
        }
        User user3 = this.f22542v2;
        if (user3 == null || !TextUtils.equals(user3.f56859id, user.f56859id) || (NullChecker.m82486a(user.pictures) && user.pictures.size() <= this.f22443H1)) {
            this.f22443H1 = 0;
        }
        if (this.f22492X1 || gra.m131550C2()) {
            bnl0.m105525M0(this.f22488W, true);
            bnl0.m105525M0(this.f22528p0, true);
            this.f22479T.m45187j0(false, userInfo.isThemeCard);
        } else {
            bnl0.m105525M0(this.f22488W, false);
            bnl0.m105525M0(this.f22528p0, false);
            this.f22479T.m45187j0(true, userInfo.isThemeCard);
        }
        if (IntlCountryCodeController.m29125v()) {
            this.f22479T.m45189l0();
            bnl0.m105525M0(this.f22488W, true);
            this.f22528p0.setBackground(m37861V1().getDrawable(dbc0.f87321pk));
        }
        this.f22523m2 = false;
        if (m37854S2(user)) {
            this.f22542v2 = user;
            m37909l2(user, userInfo);
            CoreModule.f18264c.f20405m0.f20150e2.m35212n3(user, userInfo);
            this.f22535s1.setIndicatorCount(user.pictures.size());
            bnl0.m105525M0(this.f22535s1, user.pictures.size() > 1);
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f88998B0) && i == 0) {
                int iIntValue = CoreModule.f18264c.f20381e0.f88998B0.f77083c.intValue();
                if (!user.f56859id.equals(CoreModule.f18264c.f20381e0.f88998B0.f77081a) || user.pictures.size() <= iIntValue) {
                    if (this.f22443H1 > user.pictures.size() - 1) {
                        this.f22443H1 = 0;
                    }
                    m37791o3(this.f22443H1);
                    if (this.f22443H1 == 0 && user.pictures.size() > 1) {
                        m37789W2(user.media(1));
                    }
                } else {
                    this.f22443H1 = iIntValue;
                    m37791o3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m37789W2(user.media(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < user.pictures.size()) {
                        m37789W2(user.media(i3));
                    }
                }
            } else {
                if (this.f22443H1 > user.pictures.size() - 1) {
                    this.f22443H1 = 0;
                }
                m37791o3(this.f22443H1);
                if (this.f22443H1 == 0 && user.pictures.size() > 1) {
                    m37789W2(user.media(1));
                }
            }
            this.f22523m2 = true;
        } else {
            m37791o3(this.f22443H1);
        }
        if (mo37889f()) {
            if (TextUtils.equals(this.f22428B2, user.f56859id)) {
                m36150O0(false);
            } else {
                mo37920p(false, true);
            }
        }
        m37805A3(this.f22443H1, false);
        m37862V2(userInfo);
        m37888e3(user, userInfo, i == 0);
        m37910l3(user, i, userInfo);
        m37927q3(user, userInfo);
        if (qap.m175962i()) {
            m37891f3(user, userInfo, i);
        }
        m37903j3(userInfo);
        m37917n3(user);
        m37899i3(i);
        m37907k3(i);
        if (CoreModule.f18264c.f20405m0.m32023L6(user.f56859id)) {
            m37864W1(0);
        } else if (m37926q2(userInfo)) {
            m37864W1(qa00.m175859d(16.0f));
        } else {
            m37864W1(qa00.m175859d(80.0f));
        }
        m37838M3();
        bnl0.m105525M0(this.f22433E0, m37933s2() && !user.isMe());
        bnl0.m105552e0(this.f22433E0, !gra.m131564F1() ? qa00.f156326m : 0);
        bnl0.m105540X(this.f22433E0, bnl0.m105529O0(this.f22535s1) ? qa00.m175859d(25.0f) : qa00.f156326m);
        bnl0.m105507D0(this.f22457M.getMeasuredWidth() - qa00.m175859d(90.0f), this.f22433E0);
        if (user.isMe()) {
            bnl0.m105525M0(this.f22488W, false);
            bnl0.m105525M0(this.f22482U, false);
            bnl0.m105505C0(this.f22528p0, qa00.m175859d(176.0f));
            this.f22528p0.setBackground(m37861V1().getDrawable(dbc0.f87288ok));
            this.f22479T.m45187j0(true, userInfo.isThemeCard);
        }
        m37893g3(userInfo, i);
        m37870Z2(this.f22461N);
        post(new Runnable() { // from class: l.j640
            @Override // java.lang.Runnable
            public final void run() {
                this.f118517a.m37945w2(userInfo, user);
            }
        });
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105525M0(this.f22505e1, false);
            bnl0.m105525M0(this.f22485V, false);
            if (NullChecker.m82486a(this.f22493Y0)) {
                bnl0.m105537U(this.f22493Y0, jvd.m147011a(m37861V1(), 10.0f));
                bnl0.m105538V(this.f22493Y0, jvd.m147011a(m37861V1(), 20.0f));
                bnl0.m105539W(this.f22493Y0, jvd.m147011a(m37861V1(), 90.0f));
            }
        }
        if (user.isMe()) {
            post(new Runnable() { // from class: l.k640
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124154a.m37802y2();
                }
            });
        } else {
            m37847P3();
            post(new Runnable() { // from class: l.l640
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130227a.m37804A2();
                }
            });
        }
        if (i == 0 && NullChecker.m82486a(userInfo) && userInfo.isIntlLikeLimitInsert) {
            i4g0.m138526x("e_swipe_limit_pop1_insert_card", "p_suggest_users_home_view");
        }
        if (i == 0 && NullChecker.m82486a(user) && !TextUtils.equals(CoreModule.f18264c.f20428t2.f198583W, user.f56859id)) {
            m37923p3(user);
            CoreModule.f18264c.f20428t2.f198583W = user.f56859id;
        } else if (i != 0) {
            bnl0.m105524M(this.f22425A1, false);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m37856T2() {
        if (spl0.m187374Z()) {
            z5h0.m218675j().m218690i();
            z5h0.m218675j().f203058p = null;
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: U */
    public void mo37857U() {
        if (NullChecker.m82486a(this.f22479T)) {
            this.f22479T.m45186i0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m37858U1(View view) {
        w740.m205227a(this, view);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m37859U2() {
        setMinFlingSwipeX(fcj.m125014a());
        VSwipeCard.f21029z = 350;
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: V */
    public View mo37860V() {
        return this.f22505e1;
    }

    /* JADX INFO: renamed from: V1 */
    public Act m37861V1() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m37862V2(CoreSuggested.UserInfo userInfo) {
        if (!m36165c1() && NullChecker.m82486a(userInfo.preSwipedDirection)) {
            boolean zM29125v = IntlCountryCodeController.m29125v();
            SwipeDirection swipeDirection = userInfo.preSwipedDirection;
            if (zM29125v) {
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
                setTranslationY(-mo36170g1());
                m37934s3(this.f22533r1);
            } else if (swipeDirection == SwipeDirection.LEFT) {
                setTranslationX(-mo36168f1());
                m37934s3(this.f22531q1);
            } else if (swipeDirection == SwipeDirection.RIGHT) {
                setTranslationX(mo36168f1());
                m37934s3(this.f22533r1);
            }
            userInfo.preSwipedDirection = null;
            mo36152Q0();
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: W */
    public VText mo37863W() {
        return this.f22480T0;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: W0 */
    public void mo36159W0(boolean z, float f) {
        super.mo36159W0(z, f);
        m37869Z1(z, f);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m37864W1(int i) {
        bnl0.m105537U(this.f22486V0, i);
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: X0 */
    public boolean mo36160X0() {
        if (m36165c1()) {
            return false;
        }
        return super.mo36160X0();
    }

    /* JADX INFO: renamed from: X1 */
    public void m37865X1() {
        this.f22519k2.m176990b();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m37866X2(Media media) {
        m37789W2(media);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: Y */
    public PictureView mo37867Y() {
        return this.f22479T;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: Y0 */
    public boolean mo36161Y0() {
        return true;
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: Z */
    public View mo37868Z() {
        return this.f22471Q0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m37869Z1(boolean z, float f) {
        CoreSuggested.UserInfo userInfo = this.f22525n2;
        if (userInfo == null || userInfo.isUndo || !mo37950y()) {
            return;
        }
        if (CoreModule.m30932N().mo61478M8()) {
            m37790Y1();
        }
        mo37809C();
        if (!z) {
            if (IntlCountryCodeController.m29125v()) {
                return;
            }
            this.f22533r1.setVisibility(4);
            this.f22531q1.setVisibility(4);
            this.f22533r1.setPressed(false);
            this.f22531q1.setPressed(false);
            if (f <= 0.0f) {
                m37835L3(false);
                return;
            }
            if (!m36163a1()) {
                this.f22544w2 = false;
                this.f22546x2 = false;
                this.f22548y2 = true;
            } else if (m36149F()) {
                if (this.f22484U1) {
                    m37835L3(false);
                    return;
                }
                return;
            } else if (this.f22544w2 || this.f22546x2) {
                return;
            }
            if (this.f22487V1) {
                return;
            }
            m37835L3(true);
            return;
        }
        if (f > 0.0f && this.f21039j != VSwipeCard.f21024I) {
            if (!m36163a1()) {
                this.f22544w2 = false;
                this.f22546x2 = true;
                this.f22548y2 = false;
            } else if (this.f22544w2 || this.f22548y2) {
                return;
            }
            this.f22533r1.m40217z(Math.min(1.0f, f * 2.0f));
            this.f22533r1.setVisibility(0);
            this.f22531q1.setVisibility(4);
            this.f22533r1.setPressed(true);
            this.f22531q1.setPressed(false);
        } else if (f >= 0.0f || this.f21039j == VSwipeCard.f21023H) {
            this.f22533r1.setVisibility(4);
            this.f22531q1.setVisibility(4);
            this.f22533r1.setPressed(false);
            this.f22531q1.setPressed(false);
        } else {
            if (!m36163a1()) {
                this.f22544w2 = true;
                this.f22546x2 = false;
                this.f22548y2 = false;
            } else if (this.f22546x2 || this.f22548y2) {
                return;
            }
            float fMax = Math.max(-1.0f, f * 2.0f);
            this.f22533r1.setVisibility(4);
            this.f22531q1.m40217z(-fMax);
            this.f22531q1.setVisibility(0);
            this.f22533r1.setPressed(false);
            this.f22531q1.setPressed(true);
        }
        m37835L3(false);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m37870Z2(View view) {
        if (m36165c1()) {
            return;
        }
        bnl0.m105564k0(view);
    }

    @Override // p153l.r7m
    /* JADX INFO: renamed from: a */
    public void mo37871a() {
        this.f22479T.m45195z();
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: a0 */
    public boolean mo37872a0() {
        return (this.f22525n2 == null || this.f22527o2 == null) ? false : true;
    }

    /* JADX INFO: renamed from: a2 */
    public void m37873a2() {
        Animator animator = this.f22466O1;
        if (animator != null && animator.isRunning()) {
            this.f22466O1.end();
            this.f22466O1 = null;
        }
        Animator animator2 = this.f22469P1;
        if (animator2 != null && animator2.isRunning()) {
            this.f22469P1.end();
            this.f22469P1 = null;
        }
        this.f22487V1 = false;
    }

    /* JADX INFO: renamed from: a3 */
    public void m37874a3() {
        if (!mo37889f() || this.f22426A2 == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        m37830J3(false);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: b */
    public boolean mo37875b() {
        return (this.f22525n2 == null || this.f22527o2 == null) ? false : true;
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: b0 */
    public boolean mo37876b0() {
        return this.f22502c2;
    }

    /* JADX INFO: renamed from: b2 */
    public final Animator m37877b2(final View view) {
        final int i = qa00.f156338y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(zi60.m219724a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.f740
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewNewProfileCard.m37794r1(view, i, i2, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b3 */
    public void m37878b3() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(dox.m117364b(getWidth()), dox.m117364b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    @Override // p153l.sql
    /* JADX INFO: renamed from: c */
    public boolean mo37879c() {
        return NullChecker.m82486a(this.f22516j2) && bnl0.m105529O0(this.f22516j2);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m37880c2() {
        this.f22490W1 = false;
        bnl0.m105525M0(this.f22518k1, false);
    }

    /* JADX INFO: renamed from: c3 */
    public void m37881c3() {
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // p153l.t7m, p153l.rql
    /* JADX INFO: renamed from: d */
    public boolean mo37882d() {
        return this.f22498a2;
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m37869Z1(z, f3);
    }

    /* JADX INFO: renamed from: d2 */
    public final void m37883d2() {
        if (this.f22440G1 == null) {
            this.f22440G1 = new C8020c(this.f22449J1, getContext(), this.f22486V0);
        }
        this.f22440G1.mo38442h(this);
    }

    /* JADX INFO: renamed from: d3 */
    public void m37884d3() {
        if (NullChecker.m82486a(this.f22475R1) && this.f22475R1.isRunning()) {
            if (NullChecker.m82486a(this.f22472Q1)) {
                bnl0.m105524M(this.f22472Q1, false);
            }
            this.f22475R1.cancel();
            setRotation(0.0f);
            setTranslationX(0.0f);
            setPivotX(getWidth() / 2);
            setPivotY(getHeight() / 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!mo37889f() || (motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 3)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        mo37920p(true, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchVisibilityChanged(View view, int i) {
        super.dispatchVisibilityChanged(view, i);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: e */
    public boolean mo37885e() {
        CoreSuggested.UserInfo userInfo = this.f22525n2;
        return (userInfo == null || this.f22527o2 == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: e0 */
    public boolean mo37886e0() {
        return mo37950y();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m37887e2() {
        bnl0.m105525M0(this.f22547y1, false);
        bnl0.m105525M0(this.f22535s1, false);
        if (gra.m131550C2()) {
            int i = qa00.f156328o;
            Drawable drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
            if (IntlCountryCodeController.m29125v()) {
                drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f22488W.setBackground(drawableM144407c);
            bnl0.m105505C0(this.f22528p0, qa00.m175859d(108.0f));
            this.f22528p0.setBackgroundResource(dbc0.f86746Y1);
        } else {
            int i2 = qa00.f156328o;
            Drawable drawableM144407c2 = jde.m144407c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
            if (IntlCountryCodeController.m29125v()) {
                drawableM144407c2 = jde.m144407c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f22488W.setBackground(drawableM144407c2);
        }
        this.f22533r1.m40214u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f22531q1.m40214u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f22529p1.m40204h(new int[]{dbc0.f86812a3, dbc0.f86845b3, dbc0.f86878c3, dbc0.f86911d3, dbc0.f86943e3, dbc0.f86976f3, dbc0.f87009g3, dbc0.f87042h3, dbc0.f87075i3, dbc0.f87106j3, dbc0.f87139k3, dbc0.f87172l3, dbc0.f87205m3, dbc0.f87238n3, dbc0.f87271o3, dbc0.f87304p3}, 20L);
    }

    /* JADX INFO: renamed from: e3 */
    public void m37888e3(User user, CoreSuggested.UserInfo userInfo, boolean z) {
        m37883d2();
        this.f22440G1.mo38439e(this, user, userInfo, z, this.f22527o2);
        this.f22440G1.mo38435a(this.f22443H1, false);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: f */
    public boolean mo37889f() {
        return this.f22430C2;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: f1 */
    public float mo36168f1() {
        return fcj.m125014a();
    }

    /* JADX INFO: renamed from: f2 */
    public final void m37890f2(CardType cardType) {
        this.f22434E1 = cardType;
        bnl0.m105524M(this.f22461N, false);
        bnl0.m105524M(this.f22429C1, true);
        bnl0.m105524M(this.f22431D1, false);
        this.f21032c = false;
        m37949x3();
    }

    /* JADX INFO: renamed from: f3 */
    public void m37891f3(User user, CoreSuggested.UserInfo userInfo, int i) {
        if (qap.INSTANCE.m175976n(userInfo, user)) {
            if (this.f22516j2 == null) {
                this.f22516j2 = (IntlCommercialCardBottomActionLayout) this.f22537t1.inflate();
            }
            boolean zM29125v = IntlCountryCodeController.m29125v();
            IntlCommercialCardBottomActionLayout intlCommercialCardBottomActionLayout = this.f22516j2;
            if (zM29125v) {
                bnl0.m105539W(intlCommercialCardBottomActionLayout, qa00.m175859d(80.0f));
                bnl0.m105537U(this.f22516j2, qa00.m175859d(25.0f));
            } else {
                bnl0.m105539W(intlCommercialCardBottomActionLayout, 0);
                bnl0.m105537U(this.f22516j2, qa00.m175859d(16.0f));
            }
            bnl0.m105524M(this.f22516j2, true);
            this.f22516j2.m40187Y(m37861V1(), user, userInfo, i);
            if (this.f22500b2 == 0) {
                if (IntlCountryCodeController.m29125v()) {
                    CoreModule.f18264c.f20405m0.f20174m2.onNext(uxj0.f181467a);
                } else {
                    CoreModule.f18264c.f20405m0.f20171l2.onNext("renderCommercialCardBottomActionLayout");
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: g1 */
    public float mo36170g1() {
        return getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m37892g2(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataM187298l = sp0.INSTANCE.m187298l(extensions);
            if (likeMindedItemStatusDataM187298l != null) {
                if (NullChecker.m82486a(this.f22512h2)) {
                    bnl0.m105524M(this.f22512h2, z);
                } else {
                    this.f22512h2 = (AnimalFacialCardView) this.f22513i1.inflate();
                }
                bnl0.m105537U(this.f22512h2, i);
                this.f22512h2.m45506b(likeMindedItemStatusDataM187298l);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m37893g3(final CoreSuggested.UserInfo userInfo, int i) {
        if (d79.m114675e0() && NullChecker.m82486a(userInfo.intlInsertCardData) && NullChecker.m82486a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.f18264c.f20405m0.f20089J0.onNext(Boolean.TRUE);
                    nbw.INSTANCE.m162220O(z);
                }
                if (z) {
                    bnl0.m105524M(this.f22505e1, false);
                }
                if (NullChecker.m82486a(this.f22508f2)) {
                    bnl0.m105524M(this.f22508f2, i == 0);
                }
                if (NullChecker.m82486a(this.f22506e2) && bnl0.m105529O0(this.f22506e2)) {
                    return;
                }
                if (this.f22506e2 == null) {
                    this.f22506e2 = (VImage) this.f22524n1.inflate();
                }
                if (this.f22508f2 == null) {
                    this.f22508f2 = (VText) this.f22526o1.inflate();
                }
                bnl0.m105525M0(this.f22506e2, true);
                bnl0.m105525M0(this.f22508f2, i == 0);
                this.f22506e2.setBackgroundResource(dbc0.f87112j9);
                bnl0.m105509E0(this.f22508f2, new View.OnClickListener() { // from class: l.t640
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f172289a.m37807B2(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.m82486a(this.f22506e2)) {
            bnl0.m105524M(this.f22506e2, false);
        }
        if (NullChecker.m82486a(this.f22508f2)) {
            bnl0.m105524M(this.f22508f2, false);
        }
    }

    public View getBottomView() {
        return this.f22440G1.mo38440f();
    }

    public mql getCardBottomChain() {
        return this.f22440G1;
    }

    @Override // p153l.kql, p153l.q7m
    public ik4 getCardData() {
        if (this.f22478S1 == null) {
            ik4 ik4Var = new ik4(this);
            this.f22478S1 = ik4Var;
            ik4Var.m140263h(new ik4.C17729a());
        }
        this.f22478S1.m140264i(this.f22542v2);
        this.f22478S1.m140265j(this.f22525n2);
        this.f22478S1.m140257b().f115333e = mo37950y();
        if (NullChecker.m82486a(this.f22479T)) {
            this.f22478S1.m140257b().f115329a = this.f22479T.f28893I0;
            this.f22478S1.m140257b().f115330b = this.f22479T.f28895J0;
            this.f22478S1.m140257b().f115332d = this.f22479T.f28888G;
        }
        if (NullChecker.m82486a(this.f22542v2)) {
            this.f22478S1.m140257b().f115331c = this.f22542v2.pictures;
        }
        return this.f22478S1;
    }

    @Override // p153l.xql
    public ik4 getCardDataProxy() {
        return getCardData();
    }

    @Override // p153l.q7m, p153l.rql
    public View getCardView() {
        return this;
    }

    public View getCardViewProxy() {
        return this;
    }

    @Override // p153l.sql
    public /* bridge */ /* synthetic */ CommercialCardBottomActionLayout getCommercialCardBottomActionLayout() {
        return super.getCommercialCardBottomActionLayout();
    }

    public String getCurrentTimeYYYYMMDD() {
        long jM174454o = pzi0.m174454o();
        Date date = new Date();
        date.setTime(jM174454o);
        return pzi0.f154857d.format(date);
    }

    @Override // p153l.sql
    public IntlCommercialCardBottomActionLayout getIntlCommercialCardBottomActionLayout() {
        return this.f22516j2;
    }

    public CoreMomentInfo getMomentInfo() {
        CoreMomentInfo coreMomentInfo;
        if ((gra.m131578I0().enabled || nh00.m163018b().m163022f()) && (coreMomentInfo = this.f22527o2) != null) {
            return coreMomentInfo;
        }
        return null;
    }

    @Override // p153l.xql
    public CoreMomentInfo getMomentInfoProxy() {
        return getMomentInfo();
    }

    @Override // p153l.t7m
    public CoreMomentInfo getMomentInfoThemeSlide() {
        CoreMomentInfo coreMomentInfo = this.f22527o2;
        if (coreMomentInfo != null) {
            return coreMomentInfo;
        }
        return null;
    }

    public InterfaceC8013c getOnSwipeClickListener() {
        return null;
    }

    public View getRebackGuideView() {
        return this.f22472Q1;
    }

    @Override // p153l.r7m
    public int getShowPictureIndex() {
        if (mo37875b()) {
            return -1;
        }
        return this.f22443H1;
    }

    @Override // p153l.xql
    public int getShowPictureIndexProxy() {
        return getShowPictureIndex();
    }

    @Override // p153l.lql
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f22525n2;
    }

    @Override // p153l.xql
    public User getUserProxy() {
        return this.f22542v2;
    }

    @Override // p153l.q7m
    public VirtualCard getVirtualCard() {
        return this.f22437F1;
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: h0 */
    public VText mo37894h0() {
        return this.f22468P0;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m37895h2(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.m82486a(this.f22510g2)) {
                bnl0.m105524M(this.f22510g2, z);
            } else {
                this.f22510g2 = (VDraweeView) this.f22511h1.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f22510g2.getTag() != str) {
                this.f22510g2.setTag(str);
                uqb0.f180374G.m127121O0(this.f22510g2, str, true, false, null, null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m37896h3(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataM144706d;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C8016a.INSTANCE.m37992b() && sp0.INSTANCE.m187296j(extensions) && !this.f22536s2 && !this.f22490W1) {
                m37892g2(extensions, i, z);
                return;
            }
            bnl0.m105525M0(this.f22515j1, false);
            if (NullChecker.m82486a(this.f22510g2)) {
                bnl0.m105525M0(this.f22510g2, false);
            }
            this.f22534r2 = false;
            if (NullChecker.m82486a(this.f22514i2)) {
                bnl0.m105525M0(this.f22514i2, false);
            }
            if (NullChecker.m82486a(this.f22512h2)) {
                bnl0.m105525M0(this.f22512h2, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C8016a.Companion aVar = C8016a.INSTANCE;
        if (aVar.m37998h()) {
            bnl0.m105525M0(this.f22515j1, false);
            this.f22534r2 = false;
            if (IntlMarketToken.quiz.equals(str)) {
                m37895h2(userInfo, z, false);
                return;
            }
            if ((IntlMarketToken.regular.equals(str) || IntlMarketToken.flash.equals(str)) && !this.f22490W1) {
                if (NullChecker.m82486a(this.f22514i2)) {
                    bnl0.m105524M(this.f22514i2, z);
                } else {
                    this.f22514i2 = (RegularStickerCardTabView) this.f22522m1.inflate();
                }
                bnl0.m105537U(this.f22514i2, i);
                Object tag = this.f22514i2.getTag();
                String str2 = userInfo.samesCardData.f21239id;
                if (tag != str2) {
                    this.f22514i2.setTag(str2);
                    this.f22514i2.m47527b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.m37993c()) {
            m37895h2(userInfo, z, true);
            return;
        }
        if (!aVar.m37997g() || this.f22490W1) {
            if (this.f22490W1 || (likeMindedItemStatusDataM144706d = jfr.INSTANCE.m144706d(str)) == null) {
                return;
            }
            bnl0.m105537U(this.f22515j1, i);
            this.f22515j1.m48061b(likeMindedItemStatusDataM144706d);
            bnl0.m105525M0(this.f22515j1, z);
            this.f22534r2 = true;
            return;
        }
        xnf0 xnf0Var = xnf0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM212193k = xnf0Var.m212193k(str);
        if (similarInterestsItemSwipeDataM212193k != null) {
            bnl0.m105537U(this.f22515j1, i);
            this.f22515j1.m48062c(similarInterestsItemSwipeDataM212193k, xnf0Var.m212187e());
            bnl0.m105525M0(this.f22515j1, z);
            this.f22534r2 = true;
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: i0 */
    public void mo37897i0() {
        if (NullChecker.m82486a(this.f22494Y1)) {
            l51.m152890J(this.f22494Y1);
        }
        if (NullChecker.m82486a(this.f22496Z1)) {
            l51.m152890J(this.f22496Z1);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m37898i2() {
        this.f22470Q.setOnClickListener(new View.OnClickListener() { // from class: l.d740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85455a.m37937t2(view);
            }
        });
        this.f22476S.setOnClickListener(new View.OnClickListener() { // from class: l.g740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102508a.m37940u2(view);
            }
        });
        bnl0.m105525M0(this.f22467P, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m37899i3(int i) {
        int iM147476G;
        String str;
        if (CoreModule.f18264c.f20405m0.m32023L6(this.f22525n2.f20214id) && NullChecker.m82486a(this.f22542v2) && i == 0) {
            if (this.f22542v2.pictures.size() > 0) {
                if (this.f22542v2.pictures.get(0) instanceof Video) {
                    str = CoreModule.f18264c.f20405m0.f20138a2.containsKey(this.f22542v2.f56859id) ? "video_clear" : "video_old";
                } else {
                    str = "picture";
                }
                i4g0.m138492A("e_suggest_live_room_card", "p_suggest_users_home_view", pf60.m172085a("other_user_id", this.f22542v2.f56859id), pf60.m172085a("sequence", Integer.valueOf(CoreModule.f18264c.f20405m0.m32169z6(this.f22542v2.f56859id))), pf60.m172085a("photos_number", Integer.valueOf(this.f22542v2.pictures.size())), pf60.m172085a("intl_live_room_card_update", str));
            }
            if (this.f22498a2 || (iM147476G = jyb.m147476G(this.f22542v2.pictures, new qcj() { // from class: l.r640
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Video);
                }
            })) == -1) {
                return;
            }
            m37814D3(iM147476G);
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: j */
    public VText mo37900j() {
        return this.f22465O0;
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: j0 */
    public void mo37901j0(SwipeDirection swipeDirection) {
        String str;
        if (mo37885e()) {
            if ((swipeDirection == SwipeDirection.RIGHT && !m37771C3()) || (swipeDirection == SwipeDirection.UP && m37919o2())) {
                FeedService feedServiceM30932N = CoreModule.m30932N();
                CoreMomentInfo coreMomentInfo = this.f22527o2;
                feedServiceM30932N.mo61473Kn(coreMomentInfo.owner, coreMomentInfo.f56856id, true, "other");
                sfj0.m185598e("e_moment_like", "p_suggest_users_home_view", pf60.m172085a("is_moment_card", "1"), pf60.m172085a("moment_id", this.f22527o2.f56856id), pf60.m172085a("moments_user_id", this.f22527o2.owner));
            }
            boolean zIsEmpty = CoreModule.f18264c.f20405m0.f20144c2.isEmpty();
            int i = C8012b.f22553a[swipeDirection.ordinal()];
            if (i == 1) {
                str = "up";
            } else if (i != 2) {
                str = i != 3 ? "" : BLiveGiftBubblePopupTitlePosition.left;
            } else {
                str = "right";
            }
            i4g0.m138525w(MatchScData.ModuleId.mid_e_card, "p_suggest_users_home_view", jyb.m147494Y("card_name", "moment_card"), jyb.m147494Y("swipe_directions", str), jyb.m147494Y("card_order", ""), jyb.m147494Y("is_guided_action", zIsEmpty ? "0" : "1"));
        }
        m37856T2();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m37902j2(User user, String str) {
        this.f22434E1 = CardType.profile;
        bnl0.m105524M(this.f22461N, true);
        bnl0.m105524M(this.f22429C1, false);
        bnl0.m105524M(this.f22433E0, false);
        bnl0.m105524M(this.f22465O0, false);
        bnl0.m105524M(this.f22468P0, false);
        bnl0.m105524M(this.f22480T0, false);
        bnl0.m105524M(this.f22436F0, false);
        bnl0.m105524M(this.f22451K0, false);
        bnl0.m105524M(this.f22445I0, false);
        bnl0.m105524M(this.f22483U0, false);
        bnl0.m105524M(this.f22448J0, false);
        bnl0.m105524M(this.f22471Q0, false);
        m37949x3();
        if (NullChecker.m82486a(this.f22440G1)) {
            this.f22440G1.mo38437c(user);
        }
        this.f22442H0.setCompoundDrawables(null, null, null, null);
        this.f22505e1.setImageResource(dbc0.f87514vg);
        bnl0.m105524M(this.f22505e1, true);
        this.f22436F0.setOnClickListener(null);
        bnl0.m105524M(this.f22436F0, false);
        bnl0.m105525M0(this.f22531q1, false);
        bnl0.m105525M0(this.f22533r1, false);
        bnl0.m105525M0(this.f22529p1, false);
        bnl0.m105525M0(this.f22509g1, false);
        bnl0.m105525M0(this.f22507f1, false);
        this.f22509g1.setImageDrawable(null);
        this.f21032c = true;
        if (NullChecker.m82486a(user) && !TextUtils.equals(user.f56859id, CoreModule.f18264c.f20384f0.f20610J0.get())) {
            CoreModule.f18264c.f20427t1.m32518t(this);
        }
        int iM213123a = xu90.m213122d().m213123a(user);
        PictureView pictureView = this.f22479T;
        if (iM213123a != -1) {
            pictureView.f28880A.setVisibility(0);
            xu90.m213122d().m213130i(iM213123a, this.f22479T.f28882C);
        } else {
            pictureView.f28880A.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f22516j2)) {
            bnl0.m105524M(this.f22516j2, false);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m37903j3(CoreSuggested.UserInfo userInfo) {
        int i;
        if (!this.f22490W1 && userInfo.f20214id.equals(C4880a0.m32390j().f20267d.get())) {
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                i = dbc0.f86651V2;
            } else if ("ja".equals(language)) {
                i = dbc0.f86715X2;
            } else if ("ko".equals(language)) {
                i = dbc0.f86747Y2;
            } else {
                i = "th".equals(language) ? dbc0.f86779Z2 : dbc0.f86683W2;
            }
            m37844O3(userInfo.f20214id);
            this.f22507f1.setImageResource(i);
            bnl0.m105525M0(this.f22507f1, true);
        }
    }

    @Override // p153l.tql
    /* JADX INFO: renamed from: k */
    public void mo37904k(boolean z) {
        mo36177n1();
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: k0 */
    public boolean mo37905k0() {
        return (NullChecker.m82486a(this.f22525n2) && this.f22525n2.isUndo) || m36164b1();
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: k1 */
    public float mo36174k1(float f) {
        if (Float.isInfinite(f)) {
            return f22424P2;
        }
        return f > 0.0f ? Math.min(f22424P2, f) : Math.max(-f22424P2, f);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m37906k2() {
        bnl0.m105525M0(this.f22515j1, this.f22534r2 && this.f22443H1 == 0);
        if (NullChecker.m82486a(this.f22510g2)) {
            bnl0.m105525M0(this.f22510g2, this.f22443H1 == 0);
        }
        if (NullChecker.m82486a(this.f22514i2)) {
            bnl0.m105525M0(this.f22514i2, this.f22443H1 == 0);
        }
        if (NullChecker.m82486a(this.f22512h2)) {
            bnl0.m105525M0(this.f22512h2, this.f22443H1 == 0);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m37907k3(int i) {
        if (m37926q2(this.f22525n2) && NullChecker.m82486a(this.f22542v2) && i == 0) {
            i4g0.m138526x("e_intl_card_audio", "p_suggest_users_home_view");
        }
    }

    @Override // p153l.sql
    /* JADX INFO: renamed from: l */
    public View mo37908l() {
        return this.f22486V0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m37909l2(User user, CoreSuggested.UserInfo userInfo) {
        if (m37922p2(user, userInfo) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && user.pictures.get(0) != userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture) {
            user.pictures.add(0, userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m37910l3(User user, int i, CoreSuggested.UserInfo userInfo) {
        int i2;
        boolean z = false;
        this.f22536s2 = false;
        if (user.isMe()) {
            return;
        }
        if ((user.superLikedMe() || user.letter()) && !br5.m106047r(user, userInfo)) {
            this.f22536s2 = true;
            if (user.superLikedMe()) {
                i2 = IntlCountryCodeController.m29125v() ? dbc0.f86203H2 : dbc0.f86139F2;
            } else {
                i2 = dbc0.f86107E2;
            }
            this.f22509g1.setImageResource(i2);
            VImage vImage = this.f22509g1;
            if (i == 0 && this.f22443H1 == 0) {
                z = true;
            }
            bnl0.m105525M0(vImage, z);
            if (i == 0 && this.f22443H1 == 0 && !TextUtils.equals(this.f22538t2, userInfo.f20214id)) {
                this.f22538t2 = userInfo.f20214id;
                gt0.m132159e(this.f22509g1);
                gt0.m132180z(gt0.m132166l(this.f22509g1, gt0.f106354i, 0L, 500L, null, 1.2f, 1.0f), gt0.m132166l(this.f22509g1, View.ALPHA, 0L, 500L, null, 0.1f, 1.0f)).start();
            }
        }
        if (!userInfo.hasLikeMeSlideCardBottom || bnl0.m105529O0(this.f22436F0)) {
            return;
        }
        this.f22440G1.mo38438d(m37861V1(), user);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: m */
    public void mo37911m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m37902j2(user, "p_activity_momentcard_view");
        bnl0.m105524M(this.f22505e1, false);
        CoreMomentInfo coreMomentInfo = userInfo.coreMomentInfo;
        this.f22527o2 = coreMomentInfo;
        if (coreMomentInfo == null) {
            return;
        }
        bkj0<Integer, List<String>, Boolean> bkj0VarMo61470Ka = CoreModule.m30932N().mo61470Ka(this.f22527o2.f56856id);
        if (NullChecker.m82486a(bkj0VarMo61470Ka)) {
            this.f22527o2.likes.count = bkj0VarMo61470Ka.f77081a.intValue();
            CoreMomentInfo coreMomentInfo2 = this.f22527o2;
            coreMomentInfo2.likes.ids = bkj0VarMo61470Ka.f77082b;
            coreMomentInfo2.haveLiked = bkj0VarMo61470Ka.f77083c.booleanValue();
        }
        this.f22525n2 = userInfo;
        User user2 = this.f22542v2;
        if (user2 == null || !TextUtils.equals(user2.f56859id, user.f56859id)) {
            this.f22443H1 = 0;
        }
        bnl0.m105525M0(this.f22488W, false);
        bnl0.m105525M0(this.f22517k0, true);
        bnl0.m105525M0(this.f22528p0, false);
        bnl0.m105525M0(this.f22482U, false);
        this.f22523m2 = false;
        if (m37854S2(user)) {
            this.f22542v2 = user;
            this.f22535s1.setIndicatorCount(this.f22527o2.media.size());
            bnl0.m105525M0(this.f22535s1, this.f22527o2.media.size() > 1);
            if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.f88998B0) && i == 0) {
                int iIntValue = CoreModule.f18264c.f20381e0.f88998B0.f77083c.intValue();
                if (!user.f56859id.equals(CoreModule.f18264c.f20381e0.f88998B0.f77081a) || this.f22527o2.media.size() <= iIntValue) {
                    if (this.f22443H1 > this.f22527o2.media.size() - 1) {
                        this.f22443H1 = 0;
                    }
                    m37914m3(this.f22443H1);
                    if (this.f22443H1 == 0 && this.f22527o2.media.size() > 1) {
                        m37866X2(this.f22527o2.media.get(1));
                    }
                } else {
                    this.f22443H1 = iIntValue;
                    m37914m3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m37866X2(this.f22527o2.media.get(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < this.f22527o2.media.size()) {
                        m37866X2(this.f22527o2.media.get(i3));
                    }
                }
            } else {
                if (this.f22443H1 > this.f22527o2.media.size() - 1) {
                    this.f22443H1 = 0;
                }
                m37914m3(this.f22443H1);
                if (this.f22443H1 == 0 && this.f22527o2.media.size() > 1) {
                    m37866X2(this.f22527o2.media.get(1));
                }
            }
            this.f22523m2 = true;
        } else {
            m37914m3(this.f22443H1);
        }
        m37956z3(this.f22443H1, false);
        m37862V2(userInfo);
        m37888e3(user, userInfo, i == 0);
        m37931r3(user, userInfo);
        if (qap.m175962i()) {
            m37891f3(user, userInfo, i);
        }
        bnl0.m105525M0(this.f22433E0, m37933s2() && !user.isMe());
        bnl0.m105552e0(this.f22433E0, !gra.m131564F1() ? qa00.f156326m : 0);
        bnl0.m105540X(this.f22433E0, bnl0.m105529O0(this.f22535s1) ? qa00.m175859d(25.0f) : qa00.f156326m);
        bnl0.m105507D0(this.f22457M.getMeasuredWidth() - qa00.m175859d(90.0f), this.f22433E0);
        m37870Z2(this.f22461N);
        if (i == 0) {
            bnl0.m105524M(view, true);
        }
        post(new Runnable() { // from class: l.m640
            @Override // java.lang.Runnable
            public final void run() {
                this.f134967a.m37811C2();
            }
        });
        VLinear vLinear = this.f22503d1;
        int i4 = qa00.f156298K;
        bnl0.m105537U(vLinear, i4);
        m37864W1(i4);
        m37870Z2(this.f22479T);
        bnl0.m105525M0(this.f22485V, false);
        m37917n3(user);
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: m0 */
    public View mo37912m0() {
        return this.f22436F0;
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m37913m2(Animator animator) {
        if (NullChecker.m82486a(animator)) {
            return animator.isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m37914m3(int i) {
        bnl0.m105525M0(this.f22547y1, false);
        if (jyb.m147479J(this.f22527o2.media) || this.f22527o2.media.size() <= i) {
            return;
        }
        this.f22479T.m45182d0(this.f22527o2.media.get(i), !r130.f160753a.get().booleanValue());
    }

    @Override // p153l.rql
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public TextView mo37915n0() {
        return this.f22448J0;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: n1 */
    public void mo36177n1() {
        super.mo36177n1();
        if (this.f22434E1 == CardType.profile) {
            setAlpha(1.0f);
            this.f22479T.m45194x(false);
        }
        if (NullChecker.m82486a(this.f22440G1)) {
            this.f22440G1.mo38436b();
        }
        if (NullChecker.m82486a(this.f22441G2)) {
            psd0.m173633z(this.f22441G2);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public boolean m37916n2() {
        if (!m37851R2() || !this.f22479T.f28918a.getHierarchy().m207057r()) {
            return false;
        }
        m37827I3();
        return true;
    }

    /* JADX INFO: renamed from: n3 */
    public void m37917n3(User user) {
        m37880c2();
        if (this.f22536s2) {
            return;
        }
        qap.Companion companion = qap.INSTANCE;
        if (companion.m175976n(this.f22525n2, user) || companion.m175975m(this.f22525n2)) {
            this.f22490W1 = true;
            if (this.f22525n2.getRenderUser() != null && this.f22525n2.getRenderUser().isNonBinary()) {
                this.f22520l1.setText(R$string.f18792Qf);
            }
            bnl0.m105525M0(this.f22518k1, true);
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: o0 */
    public View mo37918o0() {
        return this.f22454L0;
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard
    /* JADX INFO: renamed from: o1 */
    public void mo36178o1(long j) {
        super.mo36178o1(j);
        if (getContext() instanceof NewMainAct) {
            u7l.m194875b(j);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public boolean m37919o2() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return false;
        }
        if (userM116600p9.isVIP()) {
            return true;
        }
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterM32487o3 == null ? null : counterM32487o3.superLikeLimit;
        return NullChecker.m82486a(counterSuperlikeAndUndoLimit) && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (spl0.m187375a0()) {
            m37873a2();
        }
        m37881c3();
        if (CoreModule.m30932N().mo61478M8()) {
            m37790Y1();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (mo37850Q3()) {
            mo37941u3();
        } else {
            m37858U1(this);
        }
        boolean zM29125v = IntlCountryCodeController.m29125v();
        PictureView pictureView = this.f22479T;
        if (zM29125v) {
            pictureView.m45166K(true, false, true);
            this.f22479T.f28885E0 = true;
        } else {
            pictureView.m45167L(true, false, true, true);
        }
        m37859U2();
        m37898i2();
        m37887e2();
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kmj kmjVar;
        if (this.f22449J1) {
            return false;
        }
        if (!mo36160X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (m36163a1() || !m36166d1()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22456L2 = false;
            this.f22447I2 = motionEvent.getX();
            this.f22450J2 = motionEvent.getY();
        } else if (action == 2 && m37930r2(motionEvent.getX(), motionEvent.getY()) && !this.f22456L2 && (kmjVar = this.f21053x) != null) {
            kmjVar.m150484o(motionEvent.getX(), motionEvent.getY(), motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i2);
        if (iM117366d > 0) {
            this.f22492X1 = ((double) ((((float) dox.m117366d(i)) * 1.0f) / ((float) iM117366d))) < nwb.m164966d();
        }
        super.onMeasure(dox.m117364b(dox.m117366d(i)), dox.m117364b(dox.m117366d(i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.h640
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108001a.m37943v2();
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.card.VSwipeCard, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo36160X0()) {
            super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22456L2 = false;
        } else if (action == 2) {
            this.f22456L2 = true;
        }
        ViewTreeObserverOnGlobalLayoutListenerC8017b.f22602I1.onTouch(this, motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: p */
    public void mo37920p(boolean z, boolean z2) {
        pza0.f154795v = false;
        View view = this.f22426A2;
        if (view == null) {
            return;
        }
        removeView(view);
        this.f22430C2 = false;
        CoreModule.f18264c.f20405m0.f20089J0.onNext(Boolean.FALSE);
        if (pza0.f154796w) {
            pza0.f154796w = false;
            i4g0.m138495D("e_user_guide_flash", "p_suggest_users_home_view", jyb.m147494Y("play_status", z2 ? "01" : "02"));
        }
        invalidate();
        this.f22426A2 = null;
        this.f22428B2 = null;
        m36150O0(true);
        if (z) {
            mo37820G();
        }
        psd0.m173633z(this.f22432D2);
        psd0.m173633z(this.f22435E2);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: p0 */
    public void mo37921p0() {
        int iM175859d;
        if (gra.m131721n2()) {
            iM175859d = qa00.m175859d(204.0f);
        } else {
            iM175859d = !gra.m131721n2() ? qa00.m175859d(137.0f) : 0;
        }
        int height = this.f22440G1.mo38440f().getHeight() + qa00.m175859d(80.0f);
        if (this.f22440G1.mo38440f() != null) {
            if (this.f22525n2.hasLikeMeSlideCardReward && wrf0.m207590h()) {
                bnl0.m105505C0(this.f22517k0, Math.max(iM175859d, height - qa00.m175859d(26.0f)));
            } else {
                bnl0.m105505C0(this.f22517k0, Math.max(iM175859d, height - qa00.m175859d(2.0f)));
            }
            bnl0.m105537U(this.f22518k1, (this.f22461N.getMeasuredHeight() - bnl0.m105572o0(this.f22440G1.mo38440f(), this.f22461N)) + qa00.m175859d(8.0f));
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m37922p2(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.m82486a(user) && NullChecker.m82486a(userInfo)) {
            if (CoreModule.f18264c.f20405m0.m32023L6(userInfo.f20214id) && !mo37925q0() && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f22498a2 = z;
        } else {
            this.f22498a2 = false;
        }
        return this.f22498a2;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m37923p3(final User user) {
        if (d79.m114706w() && this.f22434E1 == CardType.profile) {
            bnl0.m105524M(this.f22425A1, false);
            if (!NullChecker.m82486a(CoreModule.f18264c.f20428t2.f198578R) || !CoreModule.f18264c.f20428t2.f198578R.get().booleanValue()) {
                this.f22441G2 = m37861V1().duringCreated(CoreModule.f18264c.f20428t2.m215197k3(user.f56859id, "swipe", "user")).subscribe(psd0.m173597H(new y20() { // from class: l.v640
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f182601a.m37813D2(user, (CoreData) obj);
                    }
                }, new y20() { // from class: l.w640
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        NewNewProfileCard.m37787S1((Throwable) obj);
                    }
                }));
                return;
            }
            RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
            riskOtherDataNew_.limited = false;
            riskOtherDataNew_.type = "test";
            riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
            m37938t3(user, riskOtherDataNew_);
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: q */
    public CoreMomentInfo mo37924q() {
        return this.f22527o2;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: q0 */
    public boolean mo37925q0() {
        return this.f22434E1 == CardType.virtual_card;
    }

    /* JADX INFO: renamed from: q2 */
    public final boolean m37926q2(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m82486a(userInfo) && CoreModule.f18264c.f20405m0.m32027M6(userInfo.f20214id);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m37927q3(User user, CoreSuggested.UserInfo userInfo) {
        this.f22519k2.m176993e(this, user, userInfo);
        this.f22519k2.m176991c(userInfo);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: r */
    public void mo37928r() {
        if (mo37839N()) {
            bnl0.m105524M(this.f22504d2, false);
        }
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: r0 */
    public SVGAnimationView mo37929r0() {
        return this.f22439G0;
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m37930r2(float f, float f2) {
        float f3 = this.f22447I2;
        float f4 = (f - f3) * (f - f3);
        float f5 = this.f22450J2;
        float f6 = f4 + ((f2 - f5) * (f2 - f5));
        int i = this.f22453K2;
        return f6 >= ((float) (i * i));
    }

    /* JADX INFO: renamed from: r3 */
    public final void m37931r3(User user, CoreSuggested.UserInfo userInfo) {
        this.f22519k2.m176992d(this, user, userInfo);
        this.f22519k2.m176991c(userInfo);
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: s */
    public void mo37932s() {
        if (NullChecker.m82487b(this.f22479T)) {
            PictureView pictureView = this.f22479T;
            if (pictureView.f28888G instanceof Video) {
                pictureView.m45173U();
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m37933s2() {
        View[] viewArr = {this.f22436F0, this.f22445I0, this.f22451K0, this.f22465O0, this.f22468P0, this.f22471Q0, this.f22480T0, this.f22483U0, this.f22448J0};
        boolean zM105529O0 = false;
        for (int i = 0; i < 9; i++) {
            zM105529O0 |= bnl0.m105529O0(viewArr[i]);
        }
        return zM105529O0;
    }

    /* JADX INFO: renamed from: s3 */
    public final void m37934s3(final SwipeLikeButton swipeLikeButton) {
        if (this.f22525n2.isUndo) {
            bnl0.m105525M0(swipeLikeButton, true);
            swipeLikeButton.m40216w(new x20() { // from class: l.n640
                @Override // p153l.x20
                public final void call() {
                    this.f140428a.m37816E2(swipeLikeButton);
                }
            });
        }
    }

    @Override // p153l.rql
    public void setCloseSmallWindow(boolean z) {
        this.f22502c2 = z;
    }

    public void setDisableShowBlurCover(boolean z) {
        this.f22438F2 = z;
    }

    @Override // p153l.q7m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(atl atlVar) {
        super.setExpandedScrollListener(atlVar);
    }

    @Override // p153l.rql
    public void setMomentCardSilent(boolean z) {
        if (NullChecker.m82486a(this.f22479T)) {
            this.f22479T.setMomentCardSilent(z);
        }
    }

    public void setOnSwipeClickListener(InterfaceC8013c interfaceC8013c) {
    }

    @Override // p153l.q7m
    public void setPageHelper(@NonNull InterfaceC8014d interfaceC8014d) {
        this.f22532q2 = interfaceC8014d;
    }

    public void setShowPictureIndex(int i) {
        m37805A3(i, false);
    }

    @Override // p153l.q7m
    public /* bridge */ /* synthetic */ void setUndoClickAction(x20 x20Var) {
        super.setUndoClickAction(x20Var);
    }

    @Override // p153l.q7m
    public void setUsHomeCardAnimHelper(fqj0 fqj0Var) {
        this.f22540u2 = fqj0Var;
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: t */
    public ViewStub mo37935t() {
        return this.f22541v1;
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: t0 */
    public VText mo37936t0() {
        return this.f22451K0;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m37937t2(View view) {
        if (mo37889f()) {
            mo37920p(true, false);
            return;
        }
        if (m37916n2()) {
            return;
        }
        if (mo37872a0() || mo37885e()) {
            m37819F3();
            return;
        }
        m37832K3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        x95.INSTANCE.m209793m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m37938t3(@NonNull User user, @NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        this.f22427B1.setText(riskOtherData.text);
        CoreModule.f18264c.f20428t2.m215201o3();
        bnl0.m105524M(this.f22425A1, true);
        bnl0.m105509E0(this.f22425A1, new View.OnClickListener() { // from class: l.x640
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192556a.m37818F2(riskOtherData, view);
            }
        });
        i4g0.m138492A("e_swipe_safety_notice", "p_suggest_users_home_view", jyb.m147494Y("user_risk_type", riskOtherData.type), jyb.m147494Y("risk_userid", user.f56859id));
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: u0 */
    public VText mo37939u0() {
        return this.f22442H0;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m37940u2(View view) {
        if (mo37889f()) {
            mo37920p(true, false);
            return;
        }
        if (m37916n2()) {
            return;
        }
        if (mo37872a0() || mo37885e()) {
            m37817E3();
            return;
        }
        m37822G3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        x95.INSTANCE.m209793m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u3 */
    public void mo37941u3() {
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: v */
    public TextView mo37942v() {
        return this.f22462N0;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m37943v2() {
        if (m36166d1()) {
            uih0.m196223s0().m196258a1(m37861V1(), this);
            m37874a3();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m37944v3(Media media) {
        if (media == null || this.f22542v2 == null) {
            return;
        }
        for (int i = 0; i < this.f22542v2.pictures.size(); i++) {
            if (media.equals(this.f22542v2.media(i))) {
                setShowPictureIndex(i);
                this.f22440G1.mo38444j(i);
                m37946w3();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m37945w2(CoreSuggested.UserInfo userInfo, User user) {
        int measuredHeight = this.f22461N.getMeasuredHeight() - bnl0.m105572o0(this.f22440G1.mo38440f(), this.f22461N);
        bnl0.m105537U(this.f22509g1, measuredHeight);
        bnl0.m105537U(this.f22529p1, (bnl0.m105529O0(this.f22509g1) ? qa00.m175859d(108.0f) : qa00.f156328o) + measuredHeight);
        bnl0.m105537U(this.f22507f1, measuredHeight);
        m37896h3(userInfo, user.profile.extensions, measuredHeight + qa00.f156326m, this.f22443H1 == 0);
        m37870Z2(this.f22461N);
        m37946w3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m37946w3() {
        if (this.f22440G1.mo38440f() == null) {
            return;
        }
        bnl0.m105537U(this.f22518k1, (this.f22461N.getMeasuredHeight() - bnl0.m105572o0(this.f22440G1.mo38440f(), this.f22461N)) + qa00.f156321h);
    }

    @Override // p153l.t7m
    /* JADX INFO: renamed from: x0 */
    public int mo37947x0() {
        return 0;
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m37948x2(int[] iArr) {
        m37847P3();
        m37852R3();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m37949x3() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f22535s1.getLayoutParams();
        int i = marginLayoutParams.rightMargin;
        int i2 = qa00.f156326m;
        if (i != i2) {
            marginLayoutParams.rightMargin = i2;
            this.f22535s1.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p153l.q7m
    /* JADX INFO: renamed from: y */
    public boolean mo37950y() {
        return this.f22434E1 == CardType.profile;
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: y0 */
    public VImage mo37951y0() {
        return this.f22483U0;
    }

    /* JADX INFO: renamed from: y3 */
    public void m37952y3(Media media) {
        if (media == null || this.f22542v2 == null) {
            return;
        }
        for (int i = 0; i < this.f22542v2.pictures.size(); i++) {
            if (media.equals(this.f22542v2.media(i))) {
                setShowPictureIndex(i);
                return;
            }
        }
    }

    @Override // p153l.xql
    /* JADX INFO: renamed from: z */
    public boolean mo37953z() {
        return mo37875b();
    }

    @Override // p153l.rql
    /* JADX INFO: renamed from: z0 */
    public View mo37954z0() {
        return this.f22445I0;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m37955z2(int[] iArr) {
        m37847P3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m37956z3(int i, boolean z) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f22525n2;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || jyb.m147479J(coreMomentInfo.media) || i < 0 || i > this.f22525n2.coreMomentInfo.media.size() - 1) {
            this.f22443H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f22535s1;
            if (z) {
                newPictureContainerIndicator.m37958b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f22443H1 = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f22535s1;
        if (z) {
            newPictureContainerIndicator2.m37958b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22446I1 = false;
        this.f22449J1 = false;
        this.f22478S1 = null;
        this.f22481T1 = gra.m131692h3();
        this.f22484U1 = false;
        this.f22487V1 = false;
        this.f22490W1 = false;
        this.f22492X1 = false;
        this.f22502c2 = false;
        this.f22504d2 = null;
        this.f22506e2 = null;
        this.f22508f2 = null;
        this.f22519k2 = new ql4();
        this.f22521l2 = new jxd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f22523m2 = false;
        this.f22525n2 = null;
        this.f22530p2 = false;
        this.f22532q2 = new InterfaceC8014d() { // from class: l.h740
        };
        this.f22534r2 = false;
        this.f22536s2 = false;
        this.f22550z2 = new C8011a();
        this.f22430C2 = false;
        this.f22438F2 = false;
        this.f22453K2 = qa00.m175859d(15.0f);
        this.f22456L2 = false;
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22446I1 = false;
        this.f22449J1 = false;
        this.f22478S1 = null;
        this.f22481T1 = gra.m131692h3();
        this.f22484U1 = false;
        this.f22487V1 = false;
        this.f22490W1 = false;
        this.f22492X1 = false;
        this.f22502c2 = false;
        this.f22504d2 = null;
        this.f22506e2 = null;
        this.f22508f2 = null;
        this.f22519k2 = new ql4();
        this.f22521l2 = new jxd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f22523m2 = false;
        this.f22525n2 = null;
        this.f22530p2 = false;
        this.f22532q2 = new InterfaceC8014d() { // from class: l.h740
        };
        this.f22534r2 = false;
        this.f22536s2 = false;
        this.f22550z2 = new C8011a();
        this.f22430C2 = false;
        this.f22438F2 = false;
        this.f22453K2 = qa00.m175859d(15.0f);
        this.f22456L2 = false;
    }
}
