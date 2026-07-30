package com.p000p1.mobile.putong.core.newui.home;

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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0033c;
import com.p000p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomDefaultLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlLiveLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomIntlVoiceLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentCardTwoView;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentGreetView;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomTagLayout;
import com.p000p1.mobile.putong.core.newui.home.views.CommercialCardBottomActionLayout;
import com.p000p1.mobile.putong.core.newui.home.views.IntlCommercialCardBottomActionLayout;
import com.p000p1.mobile.putong.core.newui.home.views.SuperLikeBanner;
import com.p000p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.IntlInsertCardData;
import com.p1.mobile.putong.core.data.LikeMindedItemStatusData;
import com.p1.mobile.putong.core.data.RiskOtherData;
import com.p1.mobile.putong.core.data.SamesCardData;
import com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.animalfacial.AnimalFacialCardView;
import com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.core.ui.intloperation.regularsticker.RegularStickerCardTabView;
import com.p1.mobile.putong.core.ui.likeminded.LikeMindedCardTabView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import l.bfd0;
import l.bt0;
import l.c4g0;
import l.cfd0;
import l.d30;
import l.da;
import l.e30;
import l.e51;
import l.e900;
import l.f6c0;
import l.fce;
import l.ffx;
import l.gwp;
import l.hpd0;
import l.idr;
import l.iz30;
import l.j760;
import l.j8w;
import l.lac0;
import l.mah0;
import l.mkd0;
import l.myc0;
import l.nvc0;
import l.o6j0;
import l.ogl0;
import l.p9w;
import l.q8p;
import l.qib0;
import l.qol0;
import l.rjj;
import l.roj0;
import l.rxg0;
import l.swh0;
import l.t100;
import l.tm90;
import l.u4c0;
import l.u59;
import l.ua60;
import l.uc80;
import l.upa;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wc80;
import l.wp0;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.xij0;
import l.xp5;
import l.ym2;
import l.zvf0;
import l.zzc0;
import p009l.a5m;
import p009l.bol;
import p009l.chj0;
import p009l.d5m;
import p009l.e5l;
import p009l.hol;
import p009l.ht20;
import p009l.jj4;
import p009l.l9j;
import p009l.lra0;
import p009l.mol;
import p009l.mqi0;
import p009l.njf0;
import p009l.o7r;
import p009l.oql;
import p009l.qff0;
import p009l.qm4;
import p009l.rk4;
import p009l.uy30;
import p009l.vtd;
import p009l.w85;
import p009l.znl;
import p009l.zub;
import rx.c;
import rx.schedulers.Schedulers;
import v.VDraweeView;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewNewProfileCard extends VSwipeCard implements znl, c0.c, mol, hol, d5m, qm4 {

    /* JADX INFO: renamed from: N2 */
    public static d f458N2;

    /* JADX INFO: renamed from: O2 */
    public static final int f459O2 = Color.parseColor("#2caae6");

    /* JADX INFO: renamed from: P2 */
    public static float f460P2 = xdl0.w0() * 1.5f;

    /* JADX INFO: renamed from: A1 */
    public LinearLayout f461A1;

    /* JADX INFO: renamed from: A2 */
    public View f462A2;

    /* JADX INFO: renamed from: B1 */
    public VText f463B1;

    /* JADX INFO: renamed from: B2 */
    public String f464B2;

    /* JADX INFO: renamed from: C1 */
    public VFrame f465C1;

    /* JADX INFO: renamed from: C2 */
    public boolean f466C2;

    /* JADX INFO: renamed from: D1 */
    public ViewStub f467D1;

    /* JADX INFO: renamed from: D2 */
    public c4g0 f468D2;

    /* JADX INFO: renamed from: E0 */
    public LinearMeasureOrderLayout f469E0;

    /* JADX INFO: renamed from: E1 */
    public CardType f470E1;

    /* JADX INFO: renamed from: E2 */
    public c4g0 f471E2;

    /* JADX INFO: renamed from: F0 */
    public VFrame f472F0;

    /* JADX INFO: renamed from: F1 */
    public VirtualCard f473F1;

    /* JADX INFO: renamed from: F2 */
    public boolean f474F2;

    /* JADX INFO: renamed from: G0 */
    public SVGAnimationView f475G0;

    /* JADX INFO: renamed from: G1 */
    public bol f476G1;

    /* JADX INFO: renamed from: G2 */
    public c4g0 f477G2;

    /* JADX INFO: renamed from: H0 */
    public VText f478H0;

    /* JADX INFO: renamed from: H1 */
    public int f479H1;

    /* JADX INFO: renamed from: H2 */
    public String f480H2;

    /* JADX INFO: renamed from: I0 */
    public TextView f481I0;

    /* JADX INFO: renamed from: I1 */
    public boolean f482I1;

    /* JADX INFO: renamed from: I2 */
    public float f483I2;

    /* JADX INFO: renamed from: J0 */
    public VText f484J0;

    /* JADX INFO: renamed from: J1 */
    public boolean f485J1;

    /* JADX INFO: renamed from: J2 */
    public float f486J2;

    /* JADX INFO: renamed from: K0 */
    public VText f487K0;

    /* JADX INFO: renamed from: K1 */
    public SwipeGuideRightView f488K1;

    /* JADX INFO: renamed from: K2 */
    public int f489K2;

    /* JADX INFO: renamed from: L0 */
    public VLinear f490L0;

    /* JADX INFO: renamed from: L1 */
    public Animator f491L1;

    /* JADX INFO: renamed from: L2 */
    public boolean f492L2;

    /* JADX INFO: renamed from: M */
    public NewNewProfileCard f493M;

    /* JADX INFO: renamed from: M0 */
    public ImageView f494M0;

    /* JADX INFO: renamed from: M1 */
    public c4g0 f495M1;

    /* JADX INFO: renamed from: M2 */
    public boolean f496M2;

    /* JADX INFO: renamed from: N */
    public LinearLayout f497N;

    /* JADX INFO: renamed from: N0 */
    public TextView f498N0;

    /* JADX INFO: renamed from: N1 */
    public View f499N1;

    /* JADX INFO: renamed from: O */
    public View f500O;

    /* JADX INFO: renamed from: O0 */
    public VText f501O0;

    /* JADX INFO: renamed from: O1 */
    public Animator f502O1;

    /* JADX INFO: renamed from: P */
    public VLinear f503P;

    /* JADX INFO: renamed from: P0 */
    public VText f504P0;

    /* JADX INFO: renamed from: P1 */
    public Animator f505P1;

    /* JADX INFO: renamed from: Q */
    public View f506Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f507Q0;

    /* JADX INFO: renamed from: Q1 */
    public View f508Q1;

    /* JADX INFO: renamed from: R */
    public CardBottomMomentCardTwoView f509R;

    /* JADX INFO: renamed from: R0 */
    public VDraweeView f510R0;

    /* JADX INFO: renamed from: R1 */
    public Animator f511R1;

    /* JADX INFO: renamed from: S */
    public View f512S;

    /* JADX INFO: renamed from: S0 */
    public VText f513S0;

    /* JADX INFO: renamed from: S1 */
    public jj4 f514S1;

    /* JADX INFO: renamed from: T */
    public PictureView f515T;

    /* JADX INFO: renamed from: T0 */
    public VText f516T0;

    /* JADX INFO: renamed from: T1 */
    public final boolean f517T1;

    /* JADX INFO: renamed from: U */
    public Space f518U;

    /* JADX INFO: renamed from: U0 */
    public VImage f519U0;

    /* JADX INFO: renamed from: U1 */
    public boolean f520U1;

    /* JADX INFO: renamed from: V */
    public View f521V;

    /* JADX INFO: renamed from: V0 */
    public FrameLayout f522V0;

    /* JADX INFO: renamed from: V1 */
    public boolean f523V1;

    /* JADX INFO: renamed from: W */
    public View f524W;

    /* JADX INFO: renamed from: W0 */
    public CardBottomLiveView f525W0;

    /* JADX INFO: renamed from: W1 */
    public boolean f526W1;

    /* JADX INFO: renamed from: X0 */
    public CardBottomMomentGreetView f527X0;

    /* JADX INFO: renamed from: X1 */
    public boolean f528X1;

    /* JADX INFO: renamed from: Y0 */
    public CardBottomDefaultLayout f529Y0;

    /* JADX INFO: renamed from: Y1 */
    public Runnable f530Y1;

    /* JADX INFO: renamed from: Z0 */
    public CardBottomIntlLiveLayout f531Z0;

    /* JADX INFO: renamed from: Z1 */
    public Runnable f532Z1;

    /* JADX INFO: renamed from: a1 */
    public CardBottomIntlVoiceLayout f533a1;

    /* JADX INFO: renamed from: a2 */
    public boolean f534a2;

    /* JADX INFO: renamed from: b1 */
    public CardBottomTagLayout f535b1;

    /* JADX INFO: renamed from: b2 */
    public int f536b2;

    /* JADX INFO: renamed from: c1 */
    public CardBottomMomentLayout f537c1;

    /* JADX INFO: renamed from: c2 */
    public boolean f538c2;

    /* JADX INFO: renamed from: d1 */
    public VLinear f539d1;

    /* JADX INFO: renamed from: d2 */
    public View f540d2;

    /* JADX INFO: renamed from: e1 */
    public VIcon f541e1;

    /* JADX INFO: renamed from: e2 */
    public VImage f542e2;

    /* JADX INFO: renamed from: f1 */
    public VImage f543f1;

    /* JADX INFO: renamed from: f2 */
    public VText f544f2;

    /* JADX INFO: renamed from: g1 */
    public VImage f545g1;

    /* JADX INFO: renamed from: g2 */
    public VDraweeView f546g2;

    /* JADX INFO: renamed from: h1 */
    public ViewStub f547h1;

    /* JADX INFO: renamed from: h2 */
    public AnimalFacialCardView f548h2;

    /* JADX INFO: renamed from: i1 */
    public ViewStub f549i1;

    /* JADX INFO: renamed from: i2 */
    public RegularStickerCardTabView f550i2;

    /* JADX INFO: renamed from: j1 */
    public LikeMindedCardTabView f551j1;

    /* JADX INFO: renamed from: j2 */
    public IntlCommercialCardBottomActionLayout f552j2;

    /* JADX INFO: renamed from: k0 */
    public View f553k0;

    /* JADX INFO: renamed from: k1 */
    public VLinear f554k1;

    /* JADX INFO: renamed from: k2 */
    public final rk4 f555k2;

    /* JADX INFO: renamed from: l1 */
    public VText f556l1;

    /* JADX INFO: renamed from: l2 */
    public hpd0 f557l2;

    /* JADX INFO: renamed from: m1 */
    public ViewStub f558m1;

    /* JADX INFO: renamed from: m2 */
    public boolean f559m2;

    /* JADX INFO: renamed from: n1 */
    public ViewStub f560n1;

    /* JADX INFO: renamed from: n2 */
    public CoreSuggested.UserInfo f561n2;

    /* JADX INFO: renamed from: o1 */
    public ViewStub f562o1;

    /* JADX INFO: renamed from: o2 */
    public CoreMomentInfo f563o2;

    /* JADX INFO: renamed from: p0 */
    public View f564p0;

    /* JADX INFO: renamed from: p1 */
    public SuperLikeBanner f565p1;

    /* JADX INFO: renamed from: p2 */
    public boolean f566p2;

    /* JADX INFO: renamed from: q1 */
    public SwipeLikeButton f567q1;

    /* JADX INFO: renamed from: q2 */
    public InterfaceC0027d f568q2;

    /* JADX INFO: renamed from: r1 */
    public SwipeLikeButton f569r1;

    /* JADX INFO: renamed from: r2 */
    public boolean f570r2;

    /* JADX INFO: renamed from: s1 */
    public NewPictureContainerIndicator f571s1;

    /* JADX INFO: renamed from: s2 */
    public boolean f572s2;

    /* JADX INFO: renamed from: t1 */
    public ViewStub f573t1;

    /* JADX INFO: renamed from: t2 */
    public String f574t2;

    /* JADX INFO: renamed from: u1 */
    public ViewStub f575u1;

    /* JADX INFO: renamed from: u2 */
    public chj0 f576u2;

    /* JADX INFO: renamed from: v1 */
    public ViewStub f577v1;

    /* JADX INFO: renamed from: v2 */
    public User f578v2;

    /* JADX INFO: renamed from: w1 */
    public ViewStub f579w1;

    /* JADX INFO: renamed from: w2 */
    public boolean f580w2;

    /* JADX INFO: renamed from: x1 */
    public ViewStub f581x1;

    /* JADX INFO: renamed from: x2 */
    public boolean f582x2;

    /* JADX INFO: renamed from: y1 */
    public LinearLayout f583y1;

    /* JADX INFO: renamed from: y2 */
    public boolean f584y2;

    /* JADX INFO: renamed from: z1 */
    public VText f585z1;

    /* JADX INFO: renamed from: z2 */
    public d30 f586z2;

    public enum CardType {
        unknown("unknown"),
        profile("profile"),
        virtual_card("VirtualCard");


        /* JADX INFO: renamed from: id */
        public String f587id;

        CardType(String str) {
            this.f587id = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$a */
    public class C0024a implements d30 {
        public C0024a() {
        }

        public void call() {
            NewNewProfileCard.this.f520U1 = false;
            NewNewProfileCard.this.f565p1.m3220i();
            xdl0.M0(NewNewProfileCard.this.f565p1, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$b */
    public static /* synthetic */ class C0025b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f589a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f589a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f589a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f589a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$c */
    public interface InterfaceC0026c {
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.NewNewProfileCard$d */
    public interface InterfaceC0027d {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewNewProfileCard(Context context) {
        super(context);
        this.f482I1 = false;
        this.f485J1 = false;
        this.f514S1 = null;
        this.f517T1 = upa.h3();
        this.f520U1 = false;
        this.f523V1 = false;
        this.f526W1 = false;
        this.f528X1 = false;
        this.f538c2 = false;
        this.f540d2 = null;
        this.f542e2 = null;
        this.f544f2 = null;
        this.f555k2 = new rk4();
        this.f557l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.H().userId(), Boolean.FALSE);
        this.f559m2 = false;
        this.f561n2 = null;
        this.f566p2 = false;
        this.f568q2 = new InterfaceC0027d() { // from class: l.ty30
        };
        this.f570r2 = false;
        this.f572s2 = false;
        this.f586z2 = new C0024a();
        this.f466C2 = false;
        this.f474F2 = false;
        this.f489K2 = t100.d(15.0f);
        this.f492L2 = false;
        ((VSwipeCard) this).d = true;
        addView(new View(m816V1()));
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m724C3() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            return true;
        }
        Counter counterO3 = CoreModule.c.o3();
        CounterLikeLimit counterLikeLimit = counterO3 == null ? null : counterO3.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && !userP9.isVIP();
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m728G1(Throwable th) {
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ Unit m730I1() {
        CoreModule.c.m0.i2.onNext(SwipeDirection.RIGHT);
        return null;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ void m740S1(Throwable th) {
    }

    /* JADX INFO: renamed from: W2 */
    private void m742W2(Media media) {
        if (!TEnum.equals(media.status, "raw")) {
            zub.m25974n(media);
        } else if (media instanceof Video) {
            qib0.G.x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m743Y1() {
        if (NullChecker.a(f458N2) && f458N2.x("user_state_bubble")) {
            f458N2.k("user_state_bubble");
        }
    }

    /* JADX INFO: renamed from: o3 */
    private void m744o3(int i) {
        List list;
        User user = this.f578v2;
        if (user == null || (list = user.pictures) == null || list.size() <= i) {
            return;
        }
        Media media = this.f578v2.media(i);
        this.f515T.setShowPetTag(true);
        this.f515T.setIsFemale(this.f578v2.isFemale());
        if (m885p2(this.f578v2, this.f561n2)) {
            this.f515T.a0(media, -1, false, true);
            return;
        }
        boolean zX3 = CoreModule.c.m0.e2.x3(this.f561n2);
        LinearLayout linearLayout = this.f583y1;
        if (zX3) {
            xdl0.M0(linearLayout, false);
            this.f515T.Y(media, 60);
        } else {
            xdl0.M0(linearLayout, false);
            this.f515T.X(media);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m747r1(View view, int i, int i2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m787L2(Drawable drawable) {
        this.f462A2 = o7r.m19649a(m816V1()).inflate(f6c0.B8, (ViewGroup) this, false);
        mkd0.z(this.f468D2);
        mkd0.z(this.f471E2);
        VImage vImageFindViewById = this.f462A2.findViewById(u4c0.c2);
        VText vTextFindViewById = this.f462A2.findViewById(u4c0.O6);
        VText vTextFindViewById2 = this.f462A2.findViewById(u4c0.Db);
        VText vTextFindViewById3 = this.f462A2.findViewById(u4c0.y1);
        if (NullChecker.a(this.f578v2)) {
            vTextFindViewById.setText(TEnum.equals(this.f578v2.gender, "female") ? m816V1().getString(R.string.d1) : m816V1().getString(R.string.e1));
            vTextFindViewById2.setText(TEnum.equals(this.f578v2.gender, "female") ? m816V1().getString(R.string.b1) : m816V1().getString(R.string.c1));
            vTextFindViewById3.setText(TEnum.equals(this.f578v2.gender, "female") ? m816V1().getString(R.string.f1) : m816V1().getString(R.string.g1));
        }
        View viewFindViewById = this.f462A2.findViewById(u4c0.d2);
        int paddingBottom = this.f503P.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = paddingBottom;
        viewFindViewById.setLayoutParams(layoutParams);
        hpd0 hpd0Var = CoreModule.c.m0.w0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        lra0.f16375w = true;
        vImageFindViewById.setBackground(drawable);
        addView(this.f462A2);
        xdl0.E0(this.f462A2, new View.OnClickListener() { // from class: l.ey30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12713a.m774G2(view);
            }
        });
        CoreModule.c.m0.J0.onNext(bool);
        this.f466C2 = true;
        lra0.f16374v = true;
        this.f464B2 = ((DbObject) this.f578v2).id;
        O0(false);
        m804Q2();
        m828Z2(this);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m751v1(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m755y2() {
        xdl0.Q0(this.f515T, new e30() { // from class: l.by30
            public final void call(Object obj) {
                this.f10354a.m912x2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m757A2() {
        xdl0.Q0(this.f515T, new e30() { // from class: l.cy30
            public final void call(Object obj) {
                this.f10816a.m919z2((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public void m758A3(int i, boolean z) {
        User user = this.f578v2;
        if (user == null || vwb.J(user.pictures) || i < 0 || i > this.f578v2.pictures.size() - 1) {
            this.f479H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f571s1;
            if (z) {
                newPictureContainerIndicator.m922b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f479H1 = i;
        if (CoreModule.c.m0.L6(((DbObject) this.f578v2).id)) {
            m820W1(0);
        }
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f571s1;
        if (z) {
            newPictureContainerIndicator2.m922b(this.f479H1);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(this.f479H1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.a5m
    /* JADX INFO: renamed from: B0 */
    public boolean mo759B0(ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, a5m a5mVar, CoreSuggested.UserInfo userInfo, int i) {
        if (!mah0.m0() || da.Companion.l()) {
            if (lac0.m() && NullChecker.a(this.f488K1) && xdl0.O0(this.f488K1)) {
                mah0.c1();
                this.f488K1.k0(false);
                xdl0.M0(this.f488K1, false);
            }
        } else {
            if (mah0.y0(userInfo.id)) {
                mah0.s0().i1(viewTreeObserverOnGlobalLayoutListenerC0030b, this, userInfo, i);
                return true;
            }
            mkd0.z(this.f495M1);
            if (NullChecker.a(this.f491L1) && this.f491L1.isRunning()) {
                this.f491L1.end();
                setRotation(0.0f);
                setTranslationX(0.0f);
                setPivotX(getWidth() / 2);
                setPivotY(getHeight() / 2);
            }
            SwipeGuideRightView swipeGuideRightView = this.f488K1;
            if (NullChecker.a(swipeGuideRightView) && xdl0.O0(swipeGuideRightView)) {
                xdl0.M(swipeGuideRightView, false);
            }
            mah0.s0().f1();
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1204U5(false);
        }
        return false;
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m760B2(boolean z, CoreSuggested.UserInfo userInfo, View view) {
        p9w p9wVar = p9w.INSTANCE;
        p9wVar.N(z, "click");
        j8w.Companion.a().W(m816V1(), userInfo.intlInsertCardData.buzzUser.buzzToken, userInfo.id, p9wVar.x(), new Function0() { // from class: l.ny30
            public final Object invoke() {
                return NewNewProfileCard.m730I1();
            }
        }, (Function0) null, (Function0) null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B3 */
    public final void m761B3(float f) {
        setPivotX(getWidth() / 2.0f);
        setPivotY(getHeight() / 2.0f);
        bt0.n(this, View.ROTATION_Y, new float[]{0.0f, f, 0.0f}).setDuration(200L).start();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: C */
    public void mo762C() {
        User user = this.f578v2;
        if (user == null || TextUtils.isEmpty(((DbObject) user).id) || TextUtils.equals(((DbObject) this.f578v2).id, "VirtualCard")) {
            return;
        }
        d.l().k("desc_click_bubble_tip");
        d.l().k("bubble_intl_instant_match_guide");
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: C0 */
    public void mo763C0() {
        if (NullChecker.a(this.f515T)) {
            this.f515T.o0();
        }
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m764C2() {
        m828Z2(this.f497N);
        mo884p0();
        m910w3();
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: D */
    public boolean mo765D(String str) {
        View view;
        if (TextUtils.equals("female_like_flag", str)) {
            return NullChecker.a(this.f561n2) && NullChecker.a(this.f578v2) && !this.f578v2.superLikedMe() && !this.f561n2.isSpecialLike() && (this.f561n2.isUserLikeMe() || (CoreModule.o.b().wf() && this.f561n2.hasLikeMeSlideCardTop));
        }
        if (TextUtils.equals("female_like_flag_lower_left", str)) {
            return NullChecker.a(this.f476G1) && this.f476G1.mo1411i();
        }
        return TextUtils.equals("superlike_guide", str) && (view = this.f540d2) != null && xdl0.O0(view);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m766D2(User user, CoreData coreData) {
        if (NullChecker.a(coreData) && NullChecker.a(coreData.userRisk)) {
            m901t3(user, coreData.userRisk);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m767D3(int i) {
        User user = this.f578v2;
        if (user == null) {
            return;
        }
        boolean z = false;
        lra0.m17993g("p_suggest_users_home_view", this.f479H1 + 1 <= user.pictures.size() - 1, false, this.f578v2, this.f476G1.mo1409g());
        if (this.f479H1 == i) {
            return;
        }
        this.f515T.x(true);
        m744o3(i);
        m758A3(i, true);
        this.f476G1.mo1412j(i);
        VImage vImage = this.f545g1;
        if (this.f572s2 && this.f479H1 == 0) {
            z = true;
        }
        xdl0.M0(vImage, z);
        m910w3();
        if (xij0.d0()) {
            e51.H(m816V1(), new uy30(this), 100L);
        }
        int i2 = i + 1;
        if (i2 < this.f578v2.pictures.size()) {
            m742W2(this.f578v2.media(i2));
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: E */
    public IntlLiveSmallWindow mo768E() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m769E2(SwipeLikeButton swipeLikeButton) {
        xdl0.M0(swipeLikeButton, false);
        this.f561n2.isUndo = false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX INFO: renamed from: E3 */
    public void m770E3() {
        String str;
        int size = this.f479H1 + 1;
        if (size > this.f563o2.media.size() - 1) {
            size = this.f563o2.media.size() - 1;
        }
        if (NullChecker.a(this.f561n2)) {
            CoreSuggested.UserInfo userInfo = this.f561n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m17993g(str, this.f479H1 + 1 <= this.f578v2.pictures.size() - 1, false, this.f578v2, this.f476G1.mo1409g());
        if (this.f479H1 == size) {
            m761B3(1.5f);
            return;
        }
        this.f515T.x(true);
        m875m3(size);
        xdl0.M0(this.f554k1, this.f526W1);
        m920z3(size, true);
        m910w3();
        if (xij0.d0()) {
            e51.H(m816V1(), new uy30(this), 100L);
        }
        int i = size + 1;
        if (i < this.f563o2.media.size()) {
            m823X2((Media) this.f563o2.media.get(i));
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m771F2(RiskOtherData riskOtherData, View view) {
        wc80.e().q(uc80.a(new gwp(m816V1())));
        zvf0.u("e_swipe_safety_notice", "p_suggest_users_home_view", new j760[]{vwb.Y("user_risk_type", riskOtherData.type)});
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: F3 */
    public void m772F3() {
        String str;
        int i = this.f479H1 - 1;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.a(this.f561n2)) {
            CoreSuggested.UserInfo userInfo = this.f561n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m17993g(str, this.f479H1 - 1 >= 0, true, this.f578v2, this.f476G1.mo1409g());
        if (this.f479H1 == i || i > this.f563o2.media.size() - 1) {
            m761B3(-1.5f);
            return;
        }
        this.f515T.x(true);
        m875m3(i);
        m920z3(i, true);
        xdl0.M0(this.f554k1, this.f526W1);
        m910w3();
        if (xij0.d0()) {
            e51.H(m816V1(), new uy30(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m823X2((Media) this.f563o2.media.get(i2));
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: G */
    public void mo773G() {
        if (xij0.d0() && NullChecker.b(this.f515T)) {
            PictureView pictureView = this.f515T;
            if (pictureView.G instanceof Video) {
                pictureView.V();
            }
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m774G2(View view) {
        mo883p(true, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX INFO: renamed from: G3 */
    public void m775G3() {
        String str;
        if (this.f578v2 == null) {
            return;
        }
        if (CoreModule.N().M8()) {
            m743Y1();
        }
        mo762C();
        int size = this.f479H1 + 1;
        if (size > this.f578v2.pictures.size() - 1) {
            size = this.f578v2.pictures.size() - 1;
        }
        if (NullChecker.a(this.f561n2)) {
            CoreSuggested.UserInfo userInfo = this.f561n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        boolean z = false;
        lra0.m17993g(str, this.f479H1 + 1 <= this.f578v2.pictures.size() - 1, false, this.f578v2, this.f476G1.mo1409g());
        if (this.f479H1 == size) {
            m761B3(1.5f);
            return;
        }
        if (upa.y1()) {
            zub.m25973m();
        }
        this.f515T.x(true);
        m744o3(size);
        m758A3(size, true);
        xdl0.M0(this.f554k1, this.f526W1);
        this.f476G1.mo1412j(size);
        VImage vImage = this.f545g1;
        if (this.f572s2 && this.f479H1 == 0) {
            z = true;
        }
        xdl0.M0(vImage, z);
        m867k2();
        m910w3();
        if (xij0.d0()) {
            e51.H(m816V1(), new uy30(this), 100L);
        }
        int i = size + 1;
        if (i < this.f578v2.pictures.size()) {
            m742W2(this.f578v2.media(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ Bitmap m776H2() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: H3 */
    public void m777H3() {
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: I */
    public void mo778I() {
        if (this.f515T.G instanceof Video) {
            if (NullChecker.a(this.f578v2)) {
                this.f515T.G0 = CoreModule.c.m0.a2.containsKey(((DbObject) this.f578v2).id);
            }
            if (mo847f() || m25877h()) {
                return;
            }
            this.f515T.V();
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ c m779I2() {
        return c.fromCallable(new Callable() { // from class: l.ay30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9767a.m776H2();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public void m780I3() {
        m783J3(true);
    }

    @Override // p009l.hol
    /* JADX INFO: renamed from: J */
    public View mo781J() {
        return this.f497N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ c m782J2(Bitmap bitmap) {
        return c.just(xij0.p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    public final void m783J3(boolean z) {
        View view;
        if (z) {
            o6j0.h("e_card_guide_overlay", "p_suggest_users_home_view", new o6j0.a[0]);
        }
        if ((this.f578v2.media(this.f479H1) instanceof Video) && xij0.d0() && NullChecker.a(this.f515T)) {
            this.f515T.U();
        }
        mkd0.z(this.f468D2);
        if (this.f466C2 && (view = this.f462A2) != null) {
            removeView(view);
            this.f462A2 = null;
            this.f466C2 = false;
            mkd0.z(this.f471E2);
        }
        this.f468D2 = m816V1().duringCreated(((c) new v9j() { // from class: l.vy30
            public final Object call() {
                return this.f21818a.m779I2();
            }
        }.call()).compose(mkd0.R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.wy30
            public final Object call(Object obj) {
                return this.f22365a.m782J2((Bitmap) obj);
            }
        }).compose(mkd0.y()).map(new w9j() { // from class: l.xy30
            public final Object call(Object obj) {
                return this.f22804a.m784K2((Bitmap) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.yy30
            public final void call(Object obj) {
                this.f23285a.m787L2((Drawable) obj);
            }
        }, new e30() { // from class: l.ux30
            public final void call(Object obj) {
                NewNewProfileCard.m728G1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ Drawable m784K2(Bitmap bitmap) {
        bfd0 bfd0VarA = cfd0.a(m816V1().getResources(), bitmap);
        bfd0VarA.e(t100.o);
        return bfd0VarA;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX INFO: renamed from: K3 */
    public void m785K3() {
        String str;
        if (this.f578v2 == null) {
            return;
        }
        if (CoreModule.N().M8()) {
            m743Y1();
        }
        mo762C();
        int i = this.f479H1 - 1;
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (NullChecker.a(this.f561n2)) {
            CoreSuggested.UserInfo userInfo = this.f561n2;
            if (userInfo.isCoreMomentThemeCard || userInfo.isCoreMomentCard) {
                str = "p_activity_momentcard_view";
            } else {
                str = "p_suggest_users_home_view";
            }
        } else {
            str = "p_suggest_users_home_view";
        }
        lra0.m17993g(str, this.f479H1 - 1 >= 0, true, this.f578v2, this.f476G1.mo1409g());
        if (this.f479H1 == i || i > this.f578v2.pictures.size() - 1) {
            m761B3(-1.5f);
            return;
        }
        this.f515T.x(true);
        m744o3(i);
        m758A3(i, true);
        xdl0.M0(this.f554k1, this.f526W1);
        this.f476G1.mo1412j(i);
        VImage vImage = this.f545g1;
        if (this.f572s2 && this.f479H1 == 0) {
            z = true;
        }
        xdl0.M0(vImage, z);
        m867k2();
        m910w3();
        if (xij0.d0()) {
            e51.H(m816V1(), new uy30(this), 100L);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            m742W2(this.f578v2.media(i2));
        }
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: L */
    public void mo786L() {
        if (NullChecker.a(this.f515T) && (this.f515T.G instanceof Video) && !mo847f()) {
            this.f515T.V();
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final void m788L3(boolean z) {
        if (z) {
            xdl0.M0(this.f565p1, true);
            if (this.f520U1) {
                return;
            }
            this.f520U1 = true;
            this.f565p1.m3222k();
            return;
        }
        boolean z2 = this.f520U1;
        SuperLikeBanner superLikeBanner = this.f565p1;
        if (z2) {
            superLikeBanner.m3223l(true, this.f586z2);
        } else {
            superLikeBanner.m3220i();
            xdl0.M0(this.f565p1, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.gol
    /* JADX INFO: renamed from: M */
    public void mo789M() {
        if (this.f578v2 == null) {
            return;
        }
        final d dVarL = d.l();
        if (!g() || mah0.y0(((DbObject) this.f578v2).id) || mah0.s0().z0() || !CoreModule.N().M8() || ((Boolean) this.f557l2.get()).booleanValue()) {
            return;
        }
        final a aVarQ = new a(getContext()).D(this.f578v2.isFemale() ? "轻触和她互动" : "轻触和他互动").J(13.0f).p(75).x(t100.d(6.0f)).o(a.P, t100.d(9.0f)).E(true).b(5000L).N(new a.d() { // from class: l.ky30
            /* JADX INFO: renamed from: a */
            public final void m17616a(View view) {
                this.f15876a.m791M2(view);
            }
        }).H(t100.d(16.0f), t100.d(10.5f), t100.d(16.0f), t100.d(10.5f)).d(new a.b() { // from class: l.ly30
            /* JADX INFO: renamed from: a */
            public final void m18075a(String str) {
                NewNewProfileCard.m743Y1();
            }
        }).q(a.P | a.N);
        this.f532Z1 = new Runnable() { // from class: l.my30
            @Override // java.lang.Runnable
            public final void run() {
                this.f17148a.m794N2(dVarL, aVarQ);
            }
        };
        e51.H(m816V1(), this.f532Z1, 500L);
    }

    /* JADX INFO: renamed from: M0 */
    public void m790M0(String str) {
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m791M2(View view) {
        this.f557l2.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: M3 */
    public void m792M3() {
        if (g()) {
            myc0.d0().h0();
        } else {
            zzc0.g0();
        }
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: N */
    public boolean mo793N() {
        return NullChecker.a(this.f540d2) && xdl0.O0(this.f540d2);
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m794N2(d dVar, a aVar) {
        dVar.u(aVar, mo826Z(), "user_state_bubble");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: N3 */
    public void m795N3(final String str) {
        e51.H(m816V1(), new Runnable() { // from class: l.oy30
            @Override // java.lang.Runnable
            public final void run() {
                this.f18295a.m800P2(str);
            }
        }, TextUtils.equals("backUser", str) ? 500L : 2000L);
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: O */
    public boolean mo796O() {
        return this.f485J1;
    }

    /* JADX INFO: renamed from: O2 */
    public final /* synthetic */ boolean m797O2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        m842d3();
        return false;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m798O3(String str) {
        if (str.equals(this.f480H2)) {
            return;
        }
        zvf0.x("e_special_card", "p_suggest_users_home_view");
        this.f480H2 = str;
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: P */
    public boolean mo799P() {
        if (NullChecker.a(this.f515T)) {
            return ((Boolean) this.f515T.I0.e()).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m800P2(String str) {
        if (!d1() || NullChecker.a(this.f495M1)) {
            return;
        }
        if (TextUtils.equals("newUser", str) && this.f523V1) {
            return;
        }
        if (this.f508Q1 == null) {
            View viewInflate = this.f581x1.inflate();
            this.f508Q1 = viewInflate;
            viewInflate.setOnTouchListener(new View.OnTouchListener() { // from class: l.qy30
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f19575a.m797O2(view, motionEvent);
                }
            });
            m836b3();
        }
        if (this.f511R1 == null) {
            this.f511R1 = m835b2(this);
        }
        if (this.f511R1.isRunning()) {
            return;
        }
        xdl0.M(this.f508Q1, true);
        if (TextUtils.equals("backUser", str)) {
            zvf0.x("e_reback_swipe_guide", "p_suggest_users_home_view");
        } else if (TextUtils.equals("newUser", str)) {
            CoreModule.c.e0.F2.put(Boolean.TRUE);
            zvf0.x("e_home_swipe_gesture", "p_suggest_users_home_view");
        }
        this.f511R1.start();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m801P3() {
        xdl0.X(this.f524W, this.f515T.getMeasuredHeight());
        xdl0.C0(this.f524W, this.f493M.getMeasuredHeight() - this.f515T.getMeasuredHeight());
        boolean zIsMe = this.f578v2.isMe();
        View view = this.f564p0;
        if (zIsMe) {
            xdl0.X(view, this.f515T.getMeasuredHeight() - t100.d(176.0f));
        } else {
            xdl0.X(view, this.f515T.getMeasuredHeight() - t100.d(103.0f));
        }
        m828Z2(this.f497N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.a5m
    /* JADX INFO: renamed from: Q */
    public void mo802Q(CoreSuggested.UserInfo userInfo, qol0 qol0Var, VirtualCardType virtualCardType, int i) {
        this.f561n2 = userInfo;
        m849f2(CardType.virtual_card);
        if (NullChecker.a(this.f540d2) && xdl0.O0(this.f540d2)) {
            xdl0.M(this.f540d2, false);
        }
        if (this.f473F1 == null) {
            VirtualCard virtualCardInflate = this.f467D1.inflate();
            this.f473F1 = virtualCardInflate;
            virtualCardInflate.F0(this);
        }
        xdl0.M0(this.f473F1, true);
        if (this.f473F1.getAdapter() == null || this.f473F1.getCardType() != virtualCardType || TextUtils.equals(virtualCardType.getId(), VirtualCardType.AdCard.getId())) {
            this.f473F1.setCardType(virtualCardType);
            this.f473F1.setAdapter(qol0Var.d2(virtualCardType, userInfo));
            this.f473F1.setClipChildren(false);
        }
        m817V2(this.f561n2);
        this.f473F1.J0(this, i, virtualCardType, userInfo);
        m828Z2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public void m803Q0() {
        if (!IntlCountryCodeController.v()) {
            super.Q0();
            return;
        }
        if (NullChecker.a(this.f576u2)) {
            this.f576u2.m12564k(this);
            CoreSuggested.UserInfo userInfo = this.f561n2;
            if (userInfo.isUndo) {
                userInfo.isUndo = false;
            }
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m804Q2() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f462A2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: Q3 */
    public boolean mo805Q3() {
        return false;
    }

    /* JADX INFO: renamed from: R2 */
    public boolean m806R2() {
        if (this.f474F2 || !this.f517T1 || this.f485J1 || ((Boolean) CoreModule.c.m0.w0.get()).booleanValue() || mo847f() || this.f578v2 == null || mo888q0()) {
            return false;
        }
        if (NullChecker.a(this.f499N1) && xdl0.O0(this.f499N1)) {
            return false;
        }
        return ((NullChecker.a(this.f542e2) && xdl0.O0(this.f542e2)) || this.f534a2 || m889q2(this.f561n2) || m874m2(this.f502O1) || m874m2(this.f505P1)) ? false : true;
    }

    /* JADX INFO: renamed from: R3 */
    public void m807R3() {
        xdl0.U(this.f541e1, this.f524W.getHeight() + t100.x);
        m820W1(this.f524W.getHeight() + t100.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.d5m
    /* JADX INFO: renamed from: S */
    public void mo808S(final d30 d30Var) {
        this.f485J1 = true;
        xdl0.E0(this, (View.OnClickListener) null);
        xdl0.E0(this.f497N, new View.OnClickListener() { // from class: l.gy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewNewProfileCard.m751v1(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public final boolean m809S2(User user) {
        if (this.f578v2 == null || user.isMe() || !this.f515T.a.getHierarchy().r()) {
            return true;
        }
        return !user.equals(this.f578v2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.a5m
    /* JADX INFO: renamed from: T */
    public void mo810T(final User user, final CoreSuggested.UserInfo userInfo, int i) {
        this.f536b2 = i;
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m862j2(user, null);
        xdl0.M0(this.f553k0, false);
        this.f561n2 = userInfo;
        this.f563o2 = null;
        User user2 = this.f578v2;
        if (user2 != null && TextUtils.equals(((DbObject) user2).id, ((DbObject) user).id) && user.pictures.size() == this.f479H1 && m885p2(user, userInfo)) {
            m870l2(user, userInfo);
            if (user.pictures.size() <= this.f479H1) {
                this.f479H1 = 0;
            }
        }
        User user3 = this.f578v2;
        if (user3 == null || !TextUtils.equals(((DbObject) user3).id, ((DbObject) user).id) || (NullChecker.a(user.pictures) && user.pictures.size() <= this.f479H1)) {
            this.f479H1 = 0;
        }
        if (this.f528X1 || upa.C2()) {
            xdl0.M0(this.f524W, true);
            xdl0.M0(this.f564p0, true);
            this.f515T.j0(false, userInfo.isThemeCard);
        } else {
            xdl0.M0(this.f524W, false);
            xdl0.M0(this.f564p0, false);
            this.f515T.j0(true, userInfo.isThemeCard);
        }
        if (IntlCountryCodeController.v()) {
            this.f515T.l0();
            xdl0.M0(this.f524W, true);
            this.f564p0.setBackground(m816V1().getDrawable(x2c0.Bj));
        }
        this.f559m2 = false;
        if (m809S2(user)) {
            this.f578v2 = user;
            m870l2(user, userInfo);
            CoreModule.c.m0.e2.n3(user, userInfo);
            this.f571s1.setIndicatorCount(user.pictures.size());
            xdl0.M0(this.f571s1, user.pictures.size() > 1);
            if (NullChecker.a(CoreModule.c.e0.B0) && i == 0) {
                int iIntValue = ((Integer) CoreModule.c.e0.B0.c).intValue();
                if (!((DbObject) user).id.equals(CoreModule.c.e0.B0.a) || user.pictures.size() <= iIntValue) {
                    if (this.f479H1 > user.pictures.size() - 1) {
                        this.f479H1 = 0;
                    }
                    m744o3(this.f479H1);
                    if (this.f479H1 == 0 && user.pictures.size() > 1) {
                        m742W2(user.media(1));
                    }
                } else {
                    this.f479H1 = iIntValue;
                    m744o3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m742W2(user.media(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < user.pictures.size()) {
                        m742W2(user.media(i3));
                    }
                }
            } else {
                if (this.f479H1 > user.pictures.size() - 1) {
                    this.f479H1 = 0;
                }
                m744o3(this.f479H1);
                if (this.f479H1 == 0 && user.pictures.size() > 1) {
                    m742W2(user.media(1));
                }
            }
            this.f559m2 = true;
        } else {
            m744o3(this.f479H1);
        }
        if (mo847f()) {
            if (TextUtils.equals(this.f464B2, ((DbObject) user).id)) {
                O0(false);
            } else {
                mo883p(false, true);
            }
        }
        m758A3(this.f479H1, false);
        m817V2(userInfo);
        m846e3(user, userInfo, i == 0);
        m871l3(user, i, userInfo);
        m890q3(user, userInfo);
        if (q8p.i()) {
            m850f3(user, userInfo, i);
        }
        m863j3(userInfo);
        m879n3(user);
        m859i3(i);
        m868k3(i);
        if (CoreModule.c.m0.L6(((DbObject) user).id)) {
            m820W1(0);
        } else if (m889q2(userInfo)) {
            m820W1(t100.d(16.0f));
        } else {
            m820W1(t100.d(80.0f));
        }
        m792M3();
        xdl0.M0(this.f469E0, m896s2() && !user.isMe());
        xdl0.e0(this.f469E0, !upa.F1() ? t100.m : 0);
        xdl0.X(this.f469E0, xdl0.O0(this.f571s1) ? t100.d(25.0f) : t100.m);
        xdl0.D0(this.f493M.getMeasuredWidth() - t100.d(90.0f), new View[]{this.f469E0});
        if (user.isMe()) {
            xdl0.M0(this.f524W, false);
            xdl0.M0(this.f518U, false);
            xdl0.C0(this.f564p0, t100.d(176.0f));
            this.f564p0.setBackground(m816V1().getDrawable(x2c0.Aj));
            this.f515T.j0(true, userInfo.isThemeCard);
        }
        m853g3(userInfo, i);
        m828Z2(this.f497N);
        post(new Runnable() { // from class: l.vx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f21812a.m909w2(userInfo, user);
            }
        });
        if (IntlCountryCodeController.v()) {
            xdl0.M0(this.f541e1, false);
            xdl0.M0(this.f521V, false);
            if (NullChecker.a(this.f529Y0)) {
                xdl0.U(this.f529Y0, vtd.m23720a(m816V1(), 10.0f));
                xdl0.V(this.f529Y0, vtd.m23720a(m816V1(), 20.0f));
                xdl0.W(this.f529Y0, vtd.m23720a(m816V1(), 90.0f));
            }
        }
        if (user.isMe()) {
            post(new Runnable() { // from class: l.wx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22351a.m755y2();
                }
            });
        } else {
            m801P3();
            post(new Runnable() { // from class: l.xx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22752a.m757A2();
                }
            });
        }
        if (i == 0 && NullChecker.a(userInfo) && userInfo.isIntlLikeLimitInsert) {
            zvf0.x("e_swipe_limit_pop1_insert_card", "p_suggest_users_home_view");
        }
        if (i == 0 && NullChecker.a(user) && !TextUtils.equals(CoreModule.c.t2.W, ((DbObject) user).id)) {
            m886p3(user);
            CoreModule.c.t2.W = ((DbObject) user).id;
        } else if (i != 0) {
            xdl0.M(this.f461A1, false);
        }
    }

    /* JADX INFO: renamed from: T2 */
    public void m811T2() {
        if (ogl0.Z()) {
            rxg0.j().i();
            rxg0.j().p = null;
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: U */
    public void mo812U() {
        if (NullChecker.a(this.f515T)) {
            this.f515T.i0();
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final void m813U1(View view) {
        iz30.a(this, view);
    }

    /* JADX INFO: renamed from: U2 */
    public final void m814U2() {
        setMinFlingSwipeX(l9j.m17780a());
        VSwipeCard.z = 350;
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: V */
    public View mo815V() {
        return this.f541e1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V1 */
    public Act m816V1() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public final void m817V2(CoreSuggested.UserInfo userInfo) {
        if (!c1() && NullChecker.a(userInfo.preSwipedDirection)) {
            boolean zV = IntlCountryCodeController.v();
            SwipeDirection swipeDirection = userInfo.preSwipedDirection;
            if (zV) {
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
                setTranslationY(-m851g1());
                m897s3(this.f569r1);
            } else if (swipeDirection == SwipeDirection.LEFT) {
                setTranslationX(-m848f1());
                m897s3(this.f567q1);
            } else if (swipeDirection == SwipeDirection.RIGHT) {
                setTranslationX(m848f1());
                m897s3(this.f569r1);
            }
            userInfo.preSwipedDirection = null;
            m803Q0();
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: W */
    public VText mo818W() {
        return this.f516T0;
    }

    /* JADX INFO: renamed from: W0 */
    public void m819W0(boolean z, float f) {
        super.W0(z, f);
        m827Z1(z, f);
    }

    /* JADX INFO: renamed from: W1 */
    public final void m820W1(int i) {
        xdl0.U(this.f522V0, i);
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m821X0() {
        if (c1()) {
            return false;
        }
        return super.X0();
    }

    /* JADX INFO: renamed from: X1 */
    public void m822X1() {
        this.f555k2.m21685b();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m823X2(Media media) {
        m742W2(media);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: Y */
    public PictureView mo824Y() {
        return this.f515T;
    }

    /* JADX INFO: renamed from: Y0 */
    public boolean m825Y0() {
        return true;
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: Z */
    public View mo826Z() {
        return this.f507Q0;
    }

    /* JADX INFO: renamed from: Z1 */
    public void m827Z1(boolean z, float f) {
        CoreSuggested.UserInfo userInfo = this.f561n2;
        if (userInfo == null || userInfo.isUndo || !mo914y()) {
            return;
        }
        if (CoreModule.N().M8()) {
            m743Y1();
        }
        mo762C();
        if (!z) {
            if (IntlCountryCodeController.v()) {
                return;
            }
            this.f569r1.setVisibility(4);
            this.f567q1.setVisibility(4);
            this.f569r1.setPressed(false);
            this.f567q1.setPressed(false);
            if (f <= 0.0f) {
                m788L3(false);
                return;
            }
            if (!a1()) {
                this.f580w2 = false;
                this.f582x2 = false;
                this.f584y2 = true;
            } else if (F()) {
                if (this.f520U1) {
                    m788L3(false);
                    return;
                }
                return;
            } else if (this.f580w2 || this.f582x2) {
                return;
            }
            if (this.f523V1) {
                return;
            }
            m788L3(true);
            return;
        }
        if (f > 0.0f && ((VSwipeCard) this).j != VSwipeCard.I) {
            if (!a1()) {
                this.f580w2 = false;
                this.f582x2 = true;
                this.f584y2 = false;
            } else if (this.f580w2 || this.f584y2) {
                return;
            }
            this.f569r1.m3232z(Math.min(1.0f, f * 2.0f));
            this.f569r1.setVisibility(0);
            this.f567q1.setVisibility(4);
            this.f569r1.setPressed(true);
            this.f567q1.setPressed(false);
        } else if (f >= 0.0f || ((VSwipeCard) this).j == VSwipeCard.H) {
            this.f569r1.setVisibility(4);
            this.f567q1.setVisibility(4);
            this.f569r1.setPressed(false);
            this.f567q1.setPressed(false);
        } else {
            if (!a1()) {
                this.f580w2 = true;
                this.f582x2 = false;
                this.f584y2 = false;
            } else if (this.f582x2 || this.f584y2) {
                return;
            }
            float fMax = Math.max(-1.0f, f * 2.0f);
            this.f569r1.setVisibility(4);
            this.f567q1.m3232z(-fMax);
            this.f567q1.setVisibility(0);
            this.f569r1.setPressed(false);
            this.f567q1.setPressed(true);
        }
        m788L3(false);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m828Z2(View view) {
        if (c1()) {
            return;
        }
        xdl0.k0(view);
    }

    @Override // p009l.b5m
    /* JADX INFO: renamed from: a */
    public void mo829a() {
        this.f515T.z();
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: a0 */
    public boolean mo830a0() {
        return (this.f561n2 == null || this.f563o2 == null) ? false : true;
    }

    /* JADX INFO: renamed from: a2 */
    public void m831a2() {
        Animator animator = this.f502O1;
        if (animator != null && animator.isRunning()) {
            this.f502O1.end();
            this.f502O1 = null;
        }
        Animator animator2 = this.f505P1;
        if (animator2 != null && animator2.isRunning()) {
            this.f505P1.end();
            this.f505P1 = null;
        }
        this.f523V1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a3 */
    public void m832a3() {
        if (!mo847f() || this.f462A2 == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        m783J3(false);
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: b */
    public boolean mo833b() {
        return (this.f561n2 == null || this.f563o2 == null) ? false : true;
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: b0 */
    public boolean mo834b0() {
        return this.f538c2;
    }

    /* JADX INFO: renamed from: b2 */
    public final Animator m835b2(final View view) {
        final int i = t100.y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(ua60.a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ry30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NewNewProfileCard.m747r1(view, i, i2, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b3 */
    public void m836b3() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(ffx.b(getWidth()), ffx.b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    @Override // p009l.hol
    /* JADX INFO: renamed from: c */
    public boolean mo837c() {
        return NullChecker.a(this.f552j2) && xdl0.O0(this.f552j2);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m838c2() {
        this.f526W1 = false;
        xdl0.M0(this.f554k1, false);
    }

    /* JADX INFO: renamed from: c3 */
    public void m839c3() {
        CoreModule.c.t1.t(this);
    }

    @Override // p009l.d5m, p009l.gol
    /* JADX INFO: renamed from: d */
    public boolean mo840d() {
        return this.f534a2;
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m827Z1(z, f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public final void m841d2() {
        if (this.f476G1 == null) {
            this.f476G1 = new C0033c(this.f485J1, getContext(), this.f522V0);
        }
        this.f476G1.mo1410h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d3 */
    public void m842d3() {
        if (NullChecker.a(this.f511R1) && this.f511R1.isRunning()) {
            if (NullChecker.a(this.f508Q1)) {
                xdl0.M(this.f508Q1, false);
            }
            this.f511R1.cancel();
            setRotation(0.0f);
            setTranslationX(0.0f);
            setPivotX(getWidth() / 2);
            setPivotY(getHeight() / 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!mo847f() || (motionEvent.getAction() != 1 && motionEvent.getAction() != 6 && motionEvent.getAction() != 3)) {
            return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        }
        mo883p(true, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchVisibilityChanged(View view, int i) {
        super/*android.view.View*/.dispatchVisibilityChanged(view, i);
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: e */
    public boolean mo843e() {
        CoreSuggested.UserInfo userInfo = this.f561n2;
        return (userInfo == null || this.f563o2 == null || !userInfo.isCoreMomentCard) ? false : true;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: e0 */
    public boolean mo844e0() {
        return mo914y();
    }

    /* JADX INFO: renamed from: e2 */
    public final void m845e2() {
        xdl0.M0(this.f583y1, false);
        xdl0.M0(this.f571s1, false);
        if (upa.C2()) {
            int i = t100.o;
            Drawable drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
            if (IntlCountryCodeController.v()) {
                drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f524W.setBackground(drawableC);
            xdl0.C0(this.f564p0, t100.d(108.0f));
            this.f564p0.setBackgroundResource(x2c0.X1);
        } else {
            int i2 = t100.o;
            Drawable drawableC2 = fce.c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
            if (IntlCountryCodeController.v()) {
                drawableC2 = fce.c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            }
            this.f524W.setBackground(drawableC2);
        }
        this.f569r1.m3229u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f567q1.m3229u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f565p1.m3219h(new int[]{x2c0.Z2, x2c0.a3, x2c0.b3, x2c0.c3, x2c0.d3, x2c0.e3, x2c0.f3, x2c0.g3, x2c0.h3, x2c0.i3, x2c0.j3, x2c0.k3, x2c0.l3, x2c0.m3, x2c0.n3, x2c0.o3}, 20L);
    }

    /* JADX INFO: renamed from: e3 */
    public void m846e3(User user, CoreSuggested.UserInfo userInfo, boolean z) {
        m841d2();
        this.f476G1.mo1407e(this, user, userInfo, z, this.f563o2);
        this.f476G1.mo1403a(this.f479H1, false);
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: f */
    public boolean mo847f() {
        return this.f466C2;
    }

    /* JADX INFO: renamed from: f1 */
    public float m848f1() {
        return l9j.m17780a();
    }

    /* JADX INFO: renamed from: f2 */
    public final void m849f2(CardType cardType) {
        this.f470E1 = cardType;
        xdl0.M(this.f497N, false);
        xdl0.M(this.f465C1, true);
        xdl0.M(this.f467D1, false);
        ((VSwipeCard) this).c = false;
        m913x3();
    }

    /* JADX INFO: renamed from: f3 */
    public void m850f3(User user, CoreSuggested.UserInfo userInfo, int i) {
        if (q8p.Companion.n(userInfo, user)) {
            if (this.f552j2 == null) {
                this.f552j2 = (IntlCommercialCardBottomActionLayout) this.f573t1.inflate();
            }
            boolean zV = IntlCountryCodeController.v();
            VLinear vLinear = this.f552j2;
            if (zV) {
                xdl0.W(vLinear, t100.d(80.0f));
                xdl0.U(this.f552j2, t100.d(25.0f));
            } else {
                xdl0.W(vLinear, 0);
                xdl0.U(this.f552j2, t100.d(16.0f));
            }
            xdl0.M(this.f552j2, true);
            this.f552j2.m3202Y(m816V1(), user, userInfo, i);
            if (this.f536b2 == 0) {
                if (IntlCountryCodeController.v()) {
                    CoreModule.c.m0.m2.onNext(roj0.a);
                } else {
                    CoreModule.c.m0.l2.onNext("renderCommercialCardBottomActionLayout");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public float m851g1() {
        return getHeight() * 0.25f;
    }

    /* JADX INFO: renamed from: g2 */
    public final void m852g2(Extensions extensions, int i, boolean z) {
        try {
            LikeMindedItemStatusData likeMindedItemStatusDataL = wp0.INSTANCE.l(extensions);
            if (likeMindedItemStatusDataL != null) {
                if (NullChecker.a(this.f548h2)) {
                    xdl0.M(this.f548h2, z);
                } else {
                    this.f548h2 = this.f549i1.inflate();
                }
                xdl0.U(this.f548h2, i);
                this.f548h2.b(likeMindedItemStatusDataL);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g3 */
    public final void m853g3(final CoreSuggested.UserInfo userInfo, int i) {
        if (u59.d0() && NullChecker.a(userInfo.intlInsertCardData) && NullChecker.a(userInfo.intlInsertCardData.buzzUser)) {
            IntlInsertCardData intlInsertCardData = userInfo.intlInsertCardData;
            if (intlInsertCardData.cardType == 10 && intlInsertCardData.showType == 1) {
                final boolean z = intlInsertCardData.buzzUser.isBlur;
                if (i == 0) {
                    CoreModule.c.m0.J0.onNext(Boolean.TRUE);
                    p9w.INSTANCE.O(z);
                }
                if (z) {
                    xdl0.M(this.f541e1, false);
                }
                if (NullChecker.a(this.f544f2)) {
                    xdl0.M(this.f544f2, i == 0);
                }
                if (NullChecker.a(this.f542e2) && xdl0.O0(this.f542e2)) {
                    return;
                }
                if (this.f542e2 == null) {
                    this.f542e2 = this.f560n1.inflate();
                }
                if (this.f544f2 == null) {
                    this.f544f2 = this.f562o1.inflate();
                }
                xdl0.M0(this.f542e2, true);
                xdl0.M0(this.f544f2, i == 0);
                this.f542e2.setBackgroundResource(x2c0.i9);
                xdl0.E0(this.f544f2, new View.OnClickListener() { // from class: l.fy30
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13219a.m760B2(z, userInfo, view);
                    }
                });
                return;
            }
        }
        if (NullChecker.a(this.f542e2)) {
            xdl0.M(this.f542e2, false);
        }
        if (NullChecker.a(this.f544f2)) {
            xdl0.M(this.f544f2, false);
        }
    }

    public View getBottomView() {
        return this.f476G1.mo1408f();
    }

    public bol getCardBottomChain() {
        return this.f476G1;
    }

    @Override // p009l.znl, p009l.a5m
    public jj4 getCardData() {
        if (this.f514S1 == null) {
            jj4 jj4Var = new jj4(this);
            this.f514S1 = jj4Var;
            jj4Var.m17134h(new jj4.C0976a());
        }
        this.f514S1.m17135i(this.f578v2);
        this.f514S1.m17136j(this.f561n2);
        this.f514S1.m17128b().f15205e = mo914y();
        if (NullChecker.a(this.f515T)) {
            this.f514S1.m17128b().f15201a = this.f515T.I0;
            this.f514S1.m17128b().f15202b = this.f515T.J0;
            this.f514S1.m17128b().f15204d = this.f515T.G;
        }
        if (NullChecker.a(this.f578v2)) {
            this.f514S1.m17128b().f15203c = this.f578v2.pictures;
        }
        return this.f514S1;
    }

    @Override // p009l.mol
    public jj4 getCardDataProxy() {
        return getCardData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.a5m, p009l.gol
    public View getCardView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getCardViewProxy() {
        return this;
    }

    @Override // p009l.hol
    public /* bridge */ /* synthetic */ CommercialCardBottomActionLayout getCommercialCardBottomActionLayout() {
        return super.getCommercialCardBottomActionLayout();
    }

    public String getCurrentTimeYYYYMMDD() {
        long jM18550o = mqi0.m18550o();
        Date date = new Date();
        date.setTime(jM18550o);
        return mqi0.f17028d.format(date);
    }

    @Override // p009l.hol
    public IntlCommercialCardBottomActionLayout getIntlCommercialCardBottomActionLayout() {
        return this.f552j2;
    }

    public CoreMomentInfo getMomentInfo() {
        CoreMomentInfo coreMomentInfo;
        if ((upa.I0().enabled || e900.b().f()) && (coreMomentInfo = this.f563o2) != null) {
            return coreMomentInfo;
        }
        return null;
    }

    @Override // p009l.mol
    public CoreMomentInfo getMomentInfoProxy() {
        return getMomentInfo();
    }

    @Override // p009l.d5m
    public CoreMomentInfo getMomentInfoThemeSlide() {
        CoreMomentInfo coreMomentInfo = this.f563o2;
        if (coreMomentInfo != null) {
            return coreMomentInfo;
        }
        return null;
    }

    public InterfaceC0026c getOnSwipeClickListener() {
        return null;
    }

    public View getRebackGuideView() {
        return this.f508Q1;
    }

    @Override // p009l.b5m
    public int getShowPictureIndex() {
        if (mo833b()) {
            return -1;
        }
        return this.f479H1;
    }

    @Override // p009l.mol
    public int getShowPictureIndexProxy() {
        return getShowPictureIndex();
    }

    @Override // p009l.aol
    public CoreSuggested.UserInfo getUserInfoProxy() {
        return this.f561n2;
    }

    @Override // p009l.mol
    public User getUserProxy() {
        return this.f578v2;
    }

    @Override // p009l.a5m
    public VirtualCard getVirtualCard() {
        return this.f473F1;
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: h0 */
    public VText mo854h0() {
        return this.f504P0;
    }

    /* JADX INFO: renamed from: h2 */
    public final void m855h2(CoreSuggested.UserInfo userInfo, boolean z, boolean z2) {
        try {
            if (NullChecker.a(this.f546g2)) {
                xdl0.M(this.f546g2, z);
            } else {
                this.f546g2 = this.f547h1.inflate();
            }
            String str = z2 ? userInfo.samesCardData.tag_url : userInfo.samesCardData.icon_url;
            if (this.f546g2.getTag() != str) {
                this.f546g2.setTag(str);
                qib0.G.O0(this.f546g2, str, true, false, (nvc0) null, (ym2) null);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final void m856h3(CoreSuggested.UserInfo userInfo, Extensions extensions, int i, boolean z) {
        LikeMindedItemStatusData likeMindedItemStatusDataD;
        SamesCardData samesCardData = userInfo.samesCardData;
        if (samesCardData == null) {
            if (C0029a.INSTANCE.m956b() && wp0.INSTANCE.j(extensions) && !this.f572s2 && !this.f526W1) {
                m852g2(extensions, i, z);
                return;
            }
            xdl0.M0(this.f551j1, false);
            if (NullChecker.a(this.f546g2)) {
                xdl0.M0(this.f546g2, false);
            }
            this.f570r2 = false;
            if (NullChecker.a(this.f550i2)) {
                xdl0.M0(this.f550i2, false);
            }
            if (NullChecker.a(this.f548h2)) {
                xdl0.M0(this.f548h2, false);
                return;
            }
            return;
        }
        String str = samesCardData.type;
        C0029a.Companion aVar = C0029a.INSTANCE;
        if (aVar.m962h()) {
            xdl0.M0(this.f551j1, false);
            this.f570r2 = false;
            if ("quiz".equals(str)) {
                m855h2(userInfo, z, false);
                return;
            }
            if (("regular".equals(str) || "flash".equals(str)) && !this.f526W1) {
                if (NullChecker.a(this.f550i2)) {
                    xdl0.M(this.f550i2, z);
                } else {
                    this.f550i2 = this.f558m1.inflate();
                }
                xdl0.U(this.f550i2, i);
                Object tag = this.f550i2.getTag();
                String str2 = userInfo.samesCardData.id;
                if (tag != str2) {
                    this.f550i2.setTag(str2);
                    this.f550i2.b(userInfo.samesCardData);
                    return;
                }
                return;
            }
            return;
        }
        if (aVar.m957c()) {
            m855h2(userInfo, z, true);
            return;
        }
        if (!aVar.m961g() || this.f526W1) {
            if (this.f526W1 || (likeMindedItemStatusDataD = idr.INSTANCE.d(str)) == null) {
                return;
            }
            xdl0.U(this.f551j1, i);
            this.f551j1.b(likeMindedItemStatusDataD);
            xdl0.M0(this.f551j1, z);
            this.f570r2 = true;
            return;
        }
        qff0 qff0Var = qff0.INSTANCE;
        SimilarInterestsItemSwipeData similarInterestsItemSwipeDataM20946k = qff0Var.m20946k(str);
        if (similarInterestsItemSwipeDataM20946k != null) {
            xdl0.U(this.f551j1, i);
            this.f551j1.c(similarInterestsItemSwipeDataM20946k, qff0Var.m20940e());
            xdl0.M0(this.f551j1, z);
            this.f570r2 = true;
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: i0 */
    public void mo857i0() {
        if (NullChecker.a(this.f530Y1)) {
            e51.J(this.f530Y1);
        }
        if (NullChecker.a(this.f532Z1)) {
            e51.J(this.f532Z1);
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m858i2() {
        this.f506Q.setOnClickListener(new View.OnClickListener() { // from class: l.py30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18965a.m900t2(view);
            }
        });
        this.f512S.setOnClickListener(new View.OnClickListener() { // from class: l.sy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20497a.m904u2(view);
            }
        });
        xdl0.M0(this.f503P, true);
    }

    /* JADX INFO: renamed from: i3 */
    public void m859i3(int i) {
        int iG;
        String str;
        if (CoreModule.c.m0.L6(this.f561n2.id) && NullChecker.a(this.f578v2) && i == 0) {
            if (this.f578v2.pictures.size() > 0) {
                if (this.f578v2.pictures.get(0) instanceof Video) {
                    str = CoreModule.c.m0.a2.containsKey(((DbObject) this.f578v2).id) ? "video_clear" : "video_old";
                } else {
                    str = "picture";
                }
                zvf0.A("e_suggest_live_room_card", "p_suggest_users_home_view", new j760[]{j760.a("other_user_id", ((DbObject) this.f578v2).id), j760.a("sequence", Integer.valueOf(CoreModule.c.m0.z6(((DbObject) this.f578v2).id))), j760.a("photos_number", Integer.valueOf(this.f578v2.pictures.size())), j760.a("intl_live_room_card_update", str)});
            }
            if (this.f534a2 || (iG = vwb.G(this.f578v2.pictures, new w9j() { // from class: l.dy30
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Media) obj) instanceof Video);
                }
            })) == -1) {
                return;
            }
            m767D3(iG);
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: j */
    public VText mo860j() {
        return this.f501O0;
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: j0 */
    public void mo861j0(SwipeDirection swipeDirection) {
        String str;
        if (mo843e()) {
            if ((swipeDirection == SwipeDirection.RIGHT && !m724C3()) || (swipeDirection == SwipeDirection.UP && m882o2())) {
                FeedService feedServiceN = CoreModule.N();
                CoreMomentInfo coreMomentInfo = this.f563o2;
                feedServiceN.Kn(coreMomentInfo.owner, ((CopyObject) coreMomentInfo).id, true, "other");
                o6j0.e("e_moment_like", "p_suggest_users_home_view", new j760[]{j760.a("is_moment_card", "1"), j760.a("moment_id", ((CopyObject) this.f563o2).id), j760.a("moments_user_id", this.f563o2.owner)});
            }
            boolean zIsEmpty = CoreModule.c.m0.c2.isEmpty();
            int i = C0025b.f589a[swipeDirection.ordinal()];
            if (i == 1) {
                str = "up";
            } else if (i != 2) {
                str = i != 3 ? "" : "left";
            } else {
                str = "right";
            }
            zvf0.w("e_card", "p_suggest_users_home_view", new j760[]{vwb.Y("card_name", "moment_card"), vwb.Y("swipe_directions", str), vwb.Y("card_order", ""), vwb.Y("is_guided_action", zIsEmpty ? "0" : "1")});
        }
        m811T2();
    }

    /* JADX INFO: renamed from: j2 */
    public final void m862j2(User user, String str) {
        this.f470E1 = CardType.profile;
        xdl0.M(this.f497N, true);
        xdl0.M(this.f465C1, false);
        xdl0.M(this.f469E0, false);
        xdl0.M(this.f501O0, false);
        xdl0.M(this.f504P0, false);
        xdl0.M(this.f516T0, false);
        xdl0.M(this.f472F0, false);
        xdl0.M(this.f487K0, false);
        xdl0.M(this.f481I0, false);
        xdl0.M(this.f519U0, false);
        xdl0.M(this.f484J0, false);
        xdl0.M(this.f507Q0, false);
        m913x3();
        if (NullChecker.a(this.f476G1)) {
            this.f476G1.mo1405c(user);
        }
        this.f478H0.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f541e1.setImageResource(x2c0.Hf);
        xdl0.M(this.f541e1, true);
        this.f472F0.setOnClickListener((View.OnClickListener) null);
        xdl0.M(this.f472F0, false);
        xdl0.M0(this.f567q1, false);
        xdl0.M0(this.f569r1, false);
        xdl0.M0(this.f565p1, false);
        xdl0.M0(this.f545g1, false);
        xdl0.M0(this.f543f1, false);
        this.f545g1.setImageDrawable((Drawable) null);
        ((VSwipeCard) this).c = true;
        if (NullChecker.a(user) && !TextUtils.equals(((DbObject) user).id, (CharSequence) CoreModule.c.f0.J0.get())) {
            CoreModule.c.t1.t(this);
        }
        int iA = tm90.d().a(user);
        PictureView pictureView = this.f515T;
        if (iA != -1) {
            pictureView.A.setVisibility(0);
            tm90.d().i(iA, this.f515T.C);
        } else {
            pictureView.A.setVisibility(8);
        }
        if (NullChecker.a(this.f552j2)) {
            xdl0.M(this.f552j2, false);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m863j3(CoreSuggested.UserInfo userInfo) {
        int i;
        if (!this.f526W1 && userInfo.id.equals(a0.j().d.get())) {
            String language = Locale.getDefault().getLanguage();
            if ("in".equals(language) || "id".equals(language)) {
                i = x2c0.U2;
            } else if ("ja".equals(language)) {
                i = x2c0.W2;
            } else if ("ko".equals(language)) {
                i = x2c0.X2;
            } else {
                i = "th".equals(language) ? x2c0.Y2 : x2c0.V2;
            }
            m798O3(userInfo.id);
            this.f543f1.setImageResource(i);
            xdl0.M0(this.f543f1, true);
        }
    }

    @Override // p009l.iol
    /* JADX INFO: renamed from: k */
    public void mo864k(boolean z) {
        m877n1();
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: k0 */
    public boolean mo865k0() {
        return (NullChecker.a(this.f561n2) && this.f561n2.isUndo) || b1();
    }

    /* JADX INFO: renamed from: k1 */
    public float m866k1(float f) {
        if (Float.isInfinite(f)) {
            return f460P2;
        }
        return f > 0.0f ? Math.min(f460P2, f) : Math.max(-f460P2, f);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m867k2() {
        xdl0.M0(this.f551j1, this.f570r2 && this.f479H1 == 0);
        if (NullChecker.a(this.f546g2)) {
            xdl0.M0(this.f546g2, this.f479H1 == 0);
        }
        if (NullChecker.a(this.f550i2)) {
            xdl0.M0(this.f550i2, this.f479H1 == 0);
        }
        if (NullChecker.a(this.f548h2)) {
            xdl0.M0(this.f548h2, this.f479H1 == 0);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m868k3(int i) {
        if (m889q2(this.f561n2) && NullChecker.a(this.f578v2) && i == 0) {
            zvf0.x("e_intl_card_audio", "p_suggest_users_home_view");
        }
    }

    @Override // p009l.hol
    /* JADX INFO: renamed from: l */
    public View mo869l() {
        return this.f522V0;
    }

    /* JADX INFO: renamed from: l2 */
    public void m870l2(User user, CoreSuggested.UserInfo userInfo) {
        if (m885p2(user, userInfo) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && user.pictures.get(0) != userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture) {
            user.pictures.add(0, userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public void m871l3(User user, int i, CoreSuggested.UserInfo userInfo) {
        int i2;
        boolean z = false;
        this.f572s2 = false;
        if (user.isMe()) {
            return;
        }
        if ((user.superLikedMe() || user.letter()) && !xp5.r(user, userInfo)) {
            this.f572s2 = true;
            if (user.superLikedMe()) {
                i2 = IntlCountryCodeController.v() ? x2c0.G2 : x2c0.E2;
            } else {
                i2 = x2c0.D2;
            }
            this.f545g1.setImageResource(i2);
            VImage vImage = this.f545g1;
            if (i == 0 && this.f479H1 == 0) {
                z = true;
            }
            xdl0.M0(vImage, z);
            if (i == 0 && this.f479H1 == 0 && !TextUtils.equals(this.f574t2, userInfo.id)) {
                this.f574t2 = userInfo.id;
                bt0.e(this.f545g1);
                bt0.z(new Animator[]{bt0.l(this.f545g1, bt0.i, 0L, 500L, (Interpolator) null, new float[]{1.2f, 1.0f}), bt0.l(this.f545g1, View.ALPHA, 0L, 500L, (Interpolator) null, new float[]{0.1f, 1.0f})}).start();
            }
        }
        if (!userInfo.hasLikeMeSlideCardBottom || xdl0.O0(this.f472F0)) {
            return;
        }
        this.f476G1.mo1406d(m816V1(), user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.a5m
    /* JADX INFO: renamed from: m */
    public void mo872m(User user, CoreSuggested.UserInfo userInfo, int i, View view) {
        userInfo.hasDescTagShow = false;
        userInfo.setRenderUser(user);
        m862j2(user, "p_activity_momentcard_view");
        xdl0.M(this.f541e1, false);
        CoreMomentInfo coreMomentInfo = userInfo.coreMomentInfo;
        this.f563o2 = coreMomentInfo;
        if (coreMomentInfo == null) {
            return;
        }
        xaj0 xaj0VarKa = CoreModule.N().Ka(((CopyObject) this.f563o2).id);
        if (NullChecker.a(xaj0VarKa)) {
            this.f563o2.likes.count = ((Integer) xaj0VarKa.a).intValue();
            CoreMomentInfo coreMomentInfo2 = this.f563o2;
            coreMomentInfo2.likes.ids = (List) xaj0VarKa.b;
            coreMomentInfo2.haveLiked = ((Boolean) xaj0VarKa.c).booleanValue();
        }
        this.f561n2 = userInfo;
        User user2 = this.f578v2;
        if (user2 == null || !TextUtils.equals(((DbObject) user2).id, ((DbObject) user).id)) {
            this.f479H1 = 0;
        }
        xdl0.M0(this.f524W, false);
        xdl0.M0(this.f553k0, true);
        xdl0.M0(this.f564p0, false);
        xdl0.M0(this.f518U, false);
        this.f559m2 = false;
        if (m809S2(user)) {
            this.f578v2 = user;
            this.f571s1.setIndicatorCount(this.f563o2.media.size());
            xdl0.M0(this.f571s1, this.f563o2.media.size() > 1);
            if (NullChecker.a(CoreModule.c.e0.B0) && i == 0) {
                int iIntValue = ((Integer) CoreModule.c.e0.B0.c).intValue();
                if (!((DbObject) user).id.equals(CoreModule.c.e0.B0.a) || this.f563o2.media.size() <= iIntValue) {
                    if (this.f479H1 > this.f563o2.media.size() - 1) {
                        this.f479H1 = 0;
                    }
                    m875m3(this.f479H1);
                    if (this.f479H1 == 0 && this.f563o2.media.size() > 1) {
                        m823X2((Media) this.f563o2.media.get(1));
                    }
                } else {
                    this.f479H1 = iIntValue;
                    m875m3(iIntValue);
                    int i2 = iIntValue - 1;
                    if (i2 >= 0) {
                        m823X2((Media) this.f563o2.media.get(i2));
                    }
                    int i3 = iIntValue + 1;
                    if (i3 < this.f563o2.media.size()) {
                        m823X2((Media) this.f563o2.media.get(i3));
                    }
                }
            } else {
                if (this.f479H1 > this.f563o2.media.size() - 1) {
                    this.f479H1 = 0;
                }
                m875m3(this.f479H1);
                if (this.f479H1 == 0 && this.f563o2.media.size() > 1) {
                    m823X2((Media) this.f563o2.media.get(1));
                }
            }
            this.f559m2 = true;
        } else {
            m875m3(this.f479H1);
        }
        m920z3(this.f479H1, false);
        m817V2(userInfo);
        m846e3(user, userInfo, i == 0);
        m894r3(user, userInfo);
        if (q8p.i()) {
            m850f3(user, userInfo, i);
        }
        xdl0.M0(this.f469E0, m896s2() && !user.isMe());
        xdl0.e0(this.f469E0, !upa.F1() ? t100.m : 0);
        xdl0.X(this.f469E0, xdl0.O0(this.f571s1) ? t100.d(25.0f) : t100.m);
        xdl0.D0(this.f493M.getMeasuredWidth() - t100.d(90.0f), new View[]{this.f469E0});
        m828Z2(this.f497N);
        if (i == 0) {
            xdl0.M(view, true);
        }
        post(new Runnable() { // from class: l.yx30
            @Override // java.lang.Runnable
            public final void run() {
                this.f23263a.m764C2();
            }
        });
        VLinear vLinear = this.f539d1;
        int i4 = t100.K;
        xdl0.U(vLinear, i4);
        m820W1(i4);
        m828Z2(this.f515T);
        xdl0.M0(this.f521V, false);
        m879n3(user);
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: m0 */
    public View mo873m0() {
        return this.f472F0;
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m874m2(Animator animator) {
        if (NullChecker.a(animator)) {
            return animator.isRunning();
        }
        return false;
    }

    /* JADX INFO: renamed from: m3 */
    public final void m875m3(int i) {
        xdl0.M0(this.f583y1, false);
        if (vwb.J(this.f563o2.media) || this.f563o2.media.size() <= i) {
            return;
        }
        this.f515T.d0((Media) this.f563o2.media.get(i), !((Boolean) ht20.f14244a.get()).booleanValue());
    }

    @Override // p009l.gol
    @Nullable
    /* JADX INFO: renamed from: n0 */
    public TextView mo876n0() {
        return this.f484J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public void m877n1() {
        super.n1();
        if (this.f470E1 == CardType.profile) {
            setAlpha(1.0f);
            this.f515T.x(false);
        }
        if (NullChecker.a(this.f476G1)) {
            this.f476G1.mo1404b();
        }
        if (NullChecker.a(this.f477G2)) {
            mkd0.z(this.f477G2);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public boolean m878n2() {
        if (!m806R2() || !this.f515T.a.getHierarchy().r()) {
            return false;
        }
        m780I3();
        return true;
    }

    /* JADX INFO: renamed from: n3 */
    public void m879n3(User user) {
        m838c2();
        if (this.f572s2) {
            return;
        }
        q8p.a aVar = q8p.Companion;
        if (aVar.n(this.f561n2, user) || aVar.m(this.f561n2)) {
            this.f526W1 = true;
            if (this.f561n2.getRenderUser() != null && this.f561n2.getRenderUser().isNonBinary()) {
                this.f556l1.setText(R.string.yf);
            }
            xdl0.M0(this.f554k1, true);
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: o0 */
    public View mo880o0() {
        return this.f490L0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    public void m881o1(long j) {
        super.o1(j);
        if (getContext() instanceof NewMainAct) {
            e5l.m13741b(j);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public boolean m882o2() {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null) {
            return false;
        }
        if (userP9.isVIP()) {
            return true;
        }
        Counter counterO3 = CoreModule.c.o3();
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = counterO3 == null ? null : counterO3.superLikeLimit;
        return NullChecker.a(counterSuperlikeAndUndoLimit) && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (ogl0.a0()) {
            m831a2();
        }
        m839c3();
        if (CoreModule.N().M8()) {
            m743Y1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        if (mo805Q3()) {
            mo905u3();
        } else {
            m813U1(this);
        }
        boolean zV = IntlCountryCodeController.v();
        PictureView pictureView = this.f515T;
        if (zV) {
            pictureView.K(true, false, true);
            this.f515T.E0 = true;
        } else {
            pictureView.L(true, false, true, true);
        }
        m814U2();
        m858i2();
        m845e2();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rjj rjjVar;
        if (this.f485J1) {
            return false;
        }
        if (!m821X0()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (a1() || !d1()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f492L2 = false;
            this.f483I2 = motionEvent.getX();
            this.f486J2 = motionEvent.getY();
        } else if (action == 2 && m893r2(motionEvent.getX(), motionEvent.getY()) && !this.f492L2 && (rjjVar = ((VSwipeCard) this).x) != null) {
            rjjVar.o(motionEvent.getX(), motionEvent.getY(), motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int iD = ffx.d(i2);
        if (iD > 0) {
            this.f528X1 = ((double) ((((float) ffx.d(i)) * 1.0f) / ((float) iD))) < zub.m25964d();
        }
        super/*android.view.View*/.onMeasure(ffx.b(ffx.d(i)), ffx.b(ffx.d(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4) && i > 0 && i2 > 0) {
            post(new Runnable() { // from class: l.tx30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20906a.m907v2();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m821X0()) {
            super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f492L2 = false;
        } else if (action == 2) {
            this.f492L2 = true;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0030b.f638I1.onTouch(this, motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.d5m
    /* JADX INFO: renamed from: p */
    public void mo883p(boolean z, boolean z2) {
        lra0.f16374v = false;
        View view = this.f462A2;
        if (view == null) {
            return;
        }
        removeView(view);
        this.f466C2 = false;
        CoreModule.c.m0.J0.onNext(Boolean.FALSE);
        if (lra0.f16375w) {
            lra0.f16375w = false;
            zvf0.D("e_user_guide_flash", "p_suggest_users_home_view", new j760[]{vwb.Y("play_status", z2 ? "01" : "02")});
        }
        invalidate();
        this.f462A2 = null;
        this.f464B2 = null;
        O0(true);
        if (z) {
            mo773G();
        }
        mkd0.z(this.f468D2);
        mkd0.z(this.f471E2);
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: p0 */
    public void mo884p0() {
        int iD;
        if (upa.n2()) {
            iD = t100.d(204.0f);
        } else {
            iD = !upa.n2() ? t100.d(137.0f) : 0;
        }
        int height = this.f476G1.mo1408f().getHeight() + t100.d(80.0f);
        if (this.f476G1.mo1408f() != null) {
            if (this.f561n2.hasLikeMeSlideCardReward && njf0.m18905h()) {
                xdl0.C0(this.f553k0, Math.max(iD, height - t100.d(26.0f)));
            } else {
                xdl0.C0(this.f553k0, Math.max(iD, height - t100.d(2.0f)));
            }
            xdl0.U(this.f554k1, (this.f497N.getMeasuredHeight() - xdl0.o0(this.f476G1.mo1408f(), this.f497N)) + t100.d(8.0f));
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m885p2(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.a(user) && NullChecker.a(userInfo)) {
            if (CoreModule.c.m0.L6(userInfo.id) && !mo888q0() && NullChecker.a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f534a2 = z;
        } else {
            this.f534a2 = false;
        }
        return this.f534a2;
    }

    /* JADX INFO: renamed from: p3 */
    public final void m886p3(final User user) {
        if (u59.w() && this.f470E1 == CardType.profile) {
            xdl0.M(this.f461A1, false);
            if (!NullChecker.a(CoreModule.c.t2.R) || !((Boolean) CoreModule.c.t2.R.get()).booleanValue()) {
                this.f477G2 = m816V1().duringCreated(CoreModule.c.t2.k3(((DbObject) user).id, "swipe", "user")).subscribe(mkd0.H(new e30() { // from class: l.hy30
                    public final void call(Object obj) {
                        this.f14300a.m766D2(user, (CoreData) obj);
                    }
                }, new e30() { // from class: l.iy30
                    public final void call(Object obj) {
                        NewNewProfileCard.m740S1((Throwable) obj);
                    }
                }));
                return;
            }
            RiskOtherData riskOtherDataNew_ = RiskOtherData.new_();
            riskOtherDataNew_.limited = false;
            riskOtherDataNew_.type = "test";
            riskOtherDataNew_.text = "近期發佈過疑似廣告信息";
            m901t3(user, riskOtherDataNew_);
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: q */
    public CoreMomentInfo mo887q() {
        return this.f563o2;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: q0 */
    public boolean mo888q0() {
        return this.f470E1 == CardType.virtual_card;
    }

    /* JADX INFO: renamed from: q2 */
    public final boolean m889q2(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && CoreModule.c.m0.M6(userInfo.id);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m890q3(User user, CoreSuggested.UserInfo userInfo) {
        this.f555k2.m21688e(this, user, userInfo);
        this.f555k2.m21686c(userInfo);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: r */
    public void mo891r() {
        if (mo793N()) {
            xdl0.M(this.f540d2, false);
        }
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: r0 */
    public SVGAnimationView mo892r0() {
        return this.f475G0;
    }

    /* JADX INFO: renamed from: r2 */
    public final boolean m893r2(float f, float f2) {
        float f3 = this.f483I2;
        float f4 = (f - f3) * (f - f3);
        float f5 = this.f486J2;
        float f6 = f4 + ((f2 - f5) * (f2 - f5));
        int i = this.f489K2;
        return f6 >= ((float) (i * i));
    }

    /* JADX INFO: renamed from: r3 */
    public final void m894r3(User user, CoreSuggested.UserInfo userInfo) {
        this.f555k2.m21687d(this, user, userInfo);
        this.f555k2.m21686c(userInfo);
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: s */
    public void mo895s() {
        if (NullChecker.b(this.f515T)) {
            PictureView pictureView = this.f515T;
            if (pictureView.G instanceof Video) {
                pictureView.U();
            }
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final boolean m896s2() {
        View[] viewArr = {this.f472F0, this.f481I0, this.f487K0, this.f501O0, this.f504P0, this.f507Q0, this.f516T0, this.f519U0, this.f484J0};
        boolean zO0 = false;
        for (int i = 0; i < 9; i++) {
            zO0 |= xdl0.O0(viewArr[i]);
        }
        return zO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s3 */
    public final void m897s3(final SwipeLikeButton swipeLikeButton) {
        if (this.f561n2.isUndo) {
            xdl0.M0(swipeLikeButton, true);
            swipeLikeButton.m3231w(new d30() { // from class: l.zx30
                public final void call() {
                    this.f24016a.m769E2(swipeLikeButton);
                }
            });
        }
    }

    @Override // p009l.gol
    public void setCloseSmallWindow(boolean z) {
        this.f538c2 = z;
    }

    public void setDisableShowBlurCover(boolean z) {
        this.f474F2 = z;
    }

    @Override // p009l.a5m
    public /* bridge */ /* synthetic */ void setExpandedScrollListener(oql oqlVar) {
        super.setExpandedScrollListener(oqlVar);
    }

    @Override // p009l.gol
    public void setMomentCardSilent(boolean z) {
        if (NullChecker.a(this.f515T)) {
            this.f515T.setMomentCardSilent(z);
        }
    }

    public void setOnSwipeClickListener(InterfaceC0026c interfaceC0026c) {
    }

    @Override // p009l.a5m
    public void setPageHelper(@NonNull InterfaceC0027d interfaceC0027d) {
        this.f568q2 = interfaceC0027d;
    }

    public void setShowPictureIndex(int i) {
        m758A3(i, false);
    }

    @Override // p009l.a5m
    public /* bridge */ /* synthetic */ void setUndoClickAction(d30 d30Var) {
        super.setUndoClickAction(d30Var);
    }

    @Override // p009l.a5m
    public void setUsHomeCardAnimHelper(chj0 chj0Var) {
        this.f576u2 = chj0Var;
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: t */
    public ViewStub mo898t() {
        return this.f577v1;
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: t0 */
    public VText mo899t0() {
        return this.f487K0;
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m900t2(View view) {
        if (mo847f()) {
            mo883p(true, false);
            return;
        }
        if (m878n2()) {
            return;
        }
        if (mo830a0() || mo843e()) {
            m772F3();
            return;
        }
        m785K3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        w85.INSTANCE.m24000m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m901t3(@NonNull User user, @NonNull final RiskOtherData riskOtherData) {
        if (TextUtils.isEmpty(riskOtherData.text)) {
            return;
        }
        this.f463B1.setText(riskOtherData.text);
        CoreModule.c.t2.o3();
        xdl0.M(this.f461A1, true);
        xdl0.E0(this.f461A1, new View.OnClickListener() { // from class: l.jy30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15360a.m771F2(riskOtherData, view);
            }
        });
        zvf0.A("e_swipe_safety_notice", "p_suggest_users_home_view", new j760[]{vwb.Y("user_risk_type", riskOtherData.type), vwb.Y("risk_userid", ((DbObject) user).id)});
    }

    /* JADX INFO: renamed from: u */
    public void m902u(String str, long j, long j2, long j3, long j4) {
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: u0 */
    public VText mo903u0() {
        return this.f478H0;
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m904u2(View view) {
        if (mo847f()) {
            mo883p(true, false);
            return;
        }
        if (m878n2()) {
            return;
        }
        if (mo830a0() || mo843e()) {
            m770E3();
            return;
        }
        m775G3();
        HashMap map = new HashMap();
        map.put("Action", "View other profile photos");
        w85.INSTANCE.m24000m("Action on Swipe page", map);
    }

    /* JADX INFO: renamed from: u3 */
    public void mo905u3() {
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: v */
    public TextView mo906v() {
        return this.f498N0;
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m907v2() {
        if (d1()) {
            mah0.s0().a1(m816V1(), this);
            m832a3();
        }
    }

    /* JADX INFO: renamed from: v3 */
    public void m908v3(Media media) {
        if (media == null || this.f578v2 == null) {
            return;
        }
        for (int i = 0; i < this.f578v2.pictures.size(); i++) {
            if (media.equals(this.f578v2.media(i))) {
                setShowPictureIndex(i);
                this.f476G1.mo1412j(i);
                m910w3();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final /* synthetic */ void m909w2(CoreSuggested.UserInfo userInfo, User user) {
        int measuredHeight = this.f497N.getMeasuredHeight() - xdl0.o0(this.f476G1.mo1408f(), this.f497N);
        xdl0.U(this.f545g1, measuredHeight);
        xdl0.U(this.f565p1, (xdl0.O0(this.f545g1) ? t100.d(108.0f) : t100.o) + measuredHeight);
        xdl0.U(this.f543f1, measuredHeight);
        m856h3(userInfo, user.profile.extensions, measuredHeight + t100.m, this.f479H1 == 0);
        m828Z2(this.f497N);
        m910w3();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m910w3() {
        if (this.f476G1.mo1408f() == null) {
            return;
        }
        xdl0.U(this.f554k1, (this.f497N.getMeasuredHeight() - xdl0.o0(this.f476G1.mo1408f(), this.f497N)) + t100.h);
    }

    @Override // p009l.d5m
    /* JADX INFO: renamed from: x0 */
    public int mo911x0() {
        return 0;
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m912x2(int[] iArr) {
        m801P3();
        m807R3();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m913x3() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f571s1.getLayoutParams();
        int i = marginLayoutParams.rightMargin;
        int i2 = t100.m;
        if (i != i2) {
            marginLayoutParams.rightMargin = i2;
            this.f571s1.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // p009l.a5m
    /* JADX INFO: renamed from: y */
    public boolean mo914y() {
        return this.f470E1 == CardType.profile;
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: y0 */
    public VImage mo915y0() {
        return this.f519U0;
    }

    /* JADX INFO: renamed from: y3 */
    public void m916y3(Media media) {
        if (media == null || this.f578v2 == null) {
            return;
        }
        for (int i = 0; i < this.f578v2.pictures.size(); i++) {
            if (media.equals(this.f578v2.media(i))) {
                setShowPictureIndex(i);
                return;
            }
        }
    }

    @Override // p009l.mol
    /* JADX INFO: renamed from: z */
    public boolean mo917z() {
        return mo833b();
    }

    @Override // p009l.gol
    /* JADX INFO: renamed from: z0 */
    public View mo918z0() {
        return this.f481I0;
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m919z2(int[] iArr) {
        m801P3();
    }

    /* JADX INFO: renamed from: z3 */
    public void m920z3(int i, boolean z) {
        CoreMomentInfo coreMomentInfo;
        CoreSuggested.UserInfo userInfo = this.f561n2;
        if (userInfo == null || (coreMomentInfo = userInfo.coreMomentInfo) == null || vwb.J(coreMomentInfo.media) || i < 0 || i > this.f561n2.coreMomentInfo.media.size() - 1) {
            this.f479H1 = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f571s1;
            if (z) {
                newPictureContainerIndicator.m922b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f479H1 = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f571s1;
        if (z) {
            newPictureContainerIndicator2.m922b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f482I1 = false;
        this.f485J1 = false;
        this.f514S1 = null;
        this.f517T1 = upa.h3();
        this.f520U1 = false;
        this.f523V1 = false;
        this.f526W1 = false;
        this.f528X1 = false;
        this.f538c2 = false;
        this.f540d2 = null;
        this.f542e2 = null;
        this.f544f2 = null;
        this.f555k2 = new rk4();
        this.f557l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.H().userId(), Boolean.FALSE);
        this.f559m2 = false;
        this.f561n2 = null;
        this.f566p2 = false;
        this.f568q2 = new InterfaceC0027d() { // from class: l.ty30
        };
        this.f570r2 = false;
        this.f572s2 = false;
        this.f586z2 = new C0024a();
        this.f466C2 = false;
        this.f474F2 = false;
        this.f489K2 = t100.d(15.0f);
        this.f492L2 = false;
    }

    public NewNewProfileCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f482I1 = false;
        this.f485J1 = false;
        this.f514S1 = null;
        this.f517T1 = upa.h3();
        this.f520U1 = false;
        this.f523V1 = false;
        this.f526W1 = false;
        this.f528X1 = false;
        this.f538c2 = false;
        this.f540d2 = null;
        this.f542e2 = null;
        this.f544f2 = null;
        this.f555k2 = new rk4();
        this.f557l2 = new hpd0("HAS_SHOW_USER_STATE_TIP" + CoreModule.H().userId(), Boolean.FALSE);
        this.f559m2 = false;
        this.f561n2 = null;
        this.f566p2 = false;
        this.f568q2 = new InterfaceC0027d() { // from class: l.ty30
        };
        this.f570r2 = false;
        this.f572s2 = false;
        this.f586z2 = new C0024a();
        this.f466C2 = false;
        this.f474F2 = false;
        this.f489K2 = t100.d(15.0f);
        this.f492L2 = false;
    }
}
