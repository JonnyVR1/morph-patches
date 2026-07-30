package p006l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.R$string;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.advertisingcard.AdvertisPlayVideoView;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.data.Action;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OmsCard;
import com.p1.mobile.putong.data.OmsCardLiterature;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.eyl;
import l.ic50;
import l.j760;
import l.le7;
import l.mkd0;
import l.ngm;
import l.ool0;
import l.osi0;
import l.t100;
import l.t7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ym2;
import l.zvf0;
import rx.c;
import v.VDraweeView;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gb0 implements ool0 {

    /* JADX INFO: renamed from: A */
    public ImageView f13136A;

    /* JADX INFO: renamed from: B */
    public TextView f13137B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f13138C;

    /* JADX INFO: renamed from: D */
    public ImageView f13139D;

    /* JADX INFO: renamed from: E */
    public ImageView f13140E;

    /* JADX INFO: renamed from: F */
    public TextView f13141F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f13142G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f13143H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f13144I;

    /* JADX INFO: renamed from: J */
    public TextView f13145J;

    /* JADX INFO: renamed from: K */
    public OMSAdCardInfo f13146K;

    /* JADX INFO: renamed from: M */
    public String f13148M;

    /* JADX INFO: renamed from: N */
    public List<Media> f13149N;

    /* JADX INFO: renamed from: P */
    public String f13151P;

    /* JADX INFO: renamed from: Q */
    public String f13152Q;

    /* JADX INFO: renamed from: R */
    public String f13153R;

    /* JADX INFO: renamed from: S */
    public List<String> f13154S;

    /* JADX INFO: renamed from: T */
    public List<String> f13155T;

    /* JADX INFO: renamed from: U */
    public List<Action> f13156U;

    /* JADX INFO: renamed from: V */
    public String f13157V;

    /* JADX INFO: renamed from: W */
    public String f13158W;

    /* JADX INFO: renamed from: Y */
    public eyl f13160Y;

    /* JADX INFO: renamed from: a */
    public AdvertisPlayVideoView f13162a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f13164b;

    /* JADX INFO: renamed from: c */
    public ImageButton f13166c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f13168d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f13169e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f13170f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f13171g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f13172h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f13173i;

    /* JADX INFO: renamed from: j */
    public TextView f13174j;

    /* JADX INFO: renamed from: k */
    public TextView f13175k;

    /* JADX INFO: renamed from: l */
    public TextView f13176l;

    /* JADX INFO: renamed from: m */
    public TextView f13177m;

    /* JADX INFO: renamed from: n */
    public TextView f13178n;

    /* JADX INFO: renamed from: o */
    public View f13179o;

    /* JADX INFO: renamed from: p */
    public View f13180p;

    /* JADX INFO: renamed from: q */
    public View f13181q;

    /* JADX INFO: renamed from: r */
    public TextView f13182r;

    /* JADX INFO: renamed from: s */
    public TextView f13183s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f13184t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f13185u;

    /* JADX INFO: renamed from: v */
    public ImageView f13186v;

    /* JADX INFO: renamed from: w */
    public ImageView f13187w;

    /* JADX INFO: renamed from: x */
    public TextView f13188x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f13189y;

    /* JADX INFO: renamed from: z */
    public ImageView f13190z;

    /* JADX INFO: renamed from: L */
    public int f13147L = 0;

    /* JADX INFO: renamed from: O */
    public String f13150O = "#000000";

    /* JADX INFO: renamed from: X */
    public boolean f13159X = false;

    /* JADX INFO: renamed from: Z */
    public long f13161Z = 0;

    /* JADX INFO: renamed from: a0 */
    public Boolean f13163a0 = Boolean.FALSE;

    /* JADX INFO: renamed from: b0 */
    public boolean f13165b0 = false;

    /* JADX INFO: renamed from: c0 */
    public e30<SwipeDirection> f13167c0 = new e30() { // from class: l.la0
        public final void call(Object obj) {
            this.f16295a.m15668R((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.gb0$a */
    public class C0752a extends ym2 {
        public C0752a() {
        }

        /* JADX INFO: renamed from: c */
        public void m15705c(String str, Throwable th) {
            super.c(str, th);
            gb0.this.f13164b.setVisibility(4);
        }

        /* JADX INFO: renamed from: f */
        public void m15706f(String str) {
            super.f(str);
        }

        /* JADX INFO: renamed from: h */
        public void m15707h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            gb0.this.f13164b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.gb0$b */
    public class C0753b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Media f13192a;

        public C0753b(Media media) {
            this.f13192a = media;
        }

        /* JADX INFO: renamed from: c */
        public void m15708c(String str, Throwable th) {
            super.c(str, th);
            gb0.this.f13164b.setVisibility(4);
            if (this.f13192a instanceof Video) {
                gb0.this.f13166c.setVisibility(4);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m15709f(String str) {
            super.f(str);
        }

        /* JADX INFO: renamed from: h */
        public void m15710h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            gb0.this.f13164b.setVisibility(4);
            gb0.this.f13166c.setVisibility(0);
            gb0.this.f13162a.f4449e.i(false);
            gb0.this.f13162a.f4449e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.gb0$e */
    public static /* synthetic */ class C0756e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13196a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f13196a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13196a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13196a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gb0(eyl eylVar) {
        this.f13160Y = eylVar;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m15650t(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable2.setColor(iIntValue);
        gradientDrawable3.setColor(iIntValue);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m15652v(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = t100.a;
        gradientDrawable.setStroke(i, iIntValue);
        gradientDrawable2.setStroke(i, iIntValue);
        gradientDrawable3.setStroke(i, iIntValue);
    }

    /* JADX INFO: renamed from: G */
    public void m15657G(View view, int i) {
        if (i == 0) {
            if (TextUtils.equals(this.f13146K.contentType, "omsCard")) {
                this.f13160Y.I();
                view.postDelayed(new Runnable() { // from class: l.eb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11036a.m15664N();
                    }
                }, 1000L);
            } else if (TextUtils.equals(this.f13146K.contentType, "omsCardLiterature")) {
                this.f13160Y.O3();
                view.postDelayed(new Runnable() { // from class: l.fb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12631a.m15665O();
                    }
                }, 1000L);
            }
            ic50.j().f().Z(this.f13146K.identifier, 0, false);
            if (NullChecker.a(this.f13146K)) {
                jb0.m17424k(this.f13146K);
            }
            if (TextUtils.equals(this.f13146K.contentType, "omsCard")) {
                zvf0.A("e_oms_card", "p_suggest_users_home_view", new j760[]{vwb.Y("card_name", this.f13148M)});
            } else if (TextUtils.equals(this.f13146K.contentType, "omsCardLiterature")) {
                zvf0.A("e_artwork_card", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_title", this.f13151P), vwb.Y("artwork_type", m15702t0(this.f13158W))});
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m15658H() {
        this.f13167c0.call(SwipeDirection.RIGHT);
        zvf0.u("e_oms_card", "p_suggest_users_home_view", new j760[]{vwb.Y("card_name", this.f13148M)});
        CoreModule.f1534c.f3652m0.f3391c2.add("e_oms_card");
    }

    /* JADX INFO: renamed from: I */
    public final void m15659I() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.i);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(16777215, -1);
        valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pa0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setColor(((Integer) valueAnimatorOfInt.getAnimatedValue()).intValue());
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1308622847, 16777215);
        valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt2.setDuration(500L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qa0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setStroke(t100.a, ((Integer) valueAnimatorOfInt2.getAnimatedValue()).intValue());
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(500L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ra0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f20451a.m15666P(valueAnimatorOfInt3, gradientDrawable, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C0754c());
    }

    /* JADX INFO: renamed from: J */
    public final void m15660J() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = t100.j;
        gradientDrawable.setCornerRadius(i);
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(i);
        final GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(i);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(16777215, -1);
        valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt.setDuration(800L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ma0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gb0.m15650t(valueAnimatorOfInt, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1308622847, 16777215);
        valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.na0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gb0.m15652v(valueAnimatorOfInt2, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(800L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oa0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f18089a.m15667Q(valueAnimatorOfInt3, gradientDrawable3, gradientDrawable, gradientDrawable2, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C0755d());
        if (NullChecker.a(this.f13156U) && this.f13156U.size() == 3) {
            this.f13136A.setVisibility(0);
        } else {
            this.f13136A.setVisibility(8);
        }
        this.f13187w.setVisibility(0);
        this.f13140E.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        if (NullChecker.a(this.f13156U) && this.f13156U.size() == 3) {
            this.f13136A.startAnimation(alphaAnimation);
        }
        this.f13187w.startAnimation(alphaAnimation);
        this.f13140E.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(800L);
        if (NullChecker.a(this.f13156U) && this.f13156U.size() == 3) {
            this.f13190z.startAnimation(alphaAnimation2);
        }
        this.f13186v.startAnimation(alphaAnimation2);
        this.f13139D.startAnimation(alphaAnimation2);
    }

    /* JADX INFO: renamed from: K */
    public final void m15661K(View view) {
        this.f13168d = (FrameLayout) view.findViewById(w4c0.f24934O);
        this.f13170f = view.findViewById(w4c0.f24926G);
        this.f13143H = (LinearLayout) view.findViewById(w4c0.f24948b);
        this.f13171g = view.findViewById(w4c0.f24957j);
        this.f13162a = (AdvertisPlayVideoView) view.findViewById(w4c0.f24942W);
        this.f13169e = (RelativeLayout) view.findViewById(w4c0.f24950c);
        this.f13172h = view.findViewById(w4c0.f24953f);
        this.f13173i = view.findViewById(w4c0.f24954g);
        this.f13177m = (TextView) view.findViewById(w4c0.f24958k);
        this.f13178n = (TextView) view.findViewById(w4c0.f24952e);
        this.f13182r = (TextView) view.findViewById(w4c0.f24946a);
        this.f13174j = (TextView) view.findViewById(w4c0.f24937R);
        this.f13175k = (TextView) view.findViewById(w4c0.f24938S);
        this.f13176l = (TextView) view.findViewById(w4c0.f24939T);
        this.f13179o = view.findViewById(w4c0.f24945Z);
        this.f13180p = view.findViewById(w4c0.f24944Y);
        this.f13181q = view.findViewById(w4c0.f24920A);
        this.f13142G = (LinearLayout) view.findViewById(w4c0.f24921B);
        this.f13166c = this.f13162a.f4451g;
        this.f13164b = view.findViewById(w4c0.f24956i);
        this.f13183s = (TextView) view.findViewById(w4c0.f24951d);
        this.f13184t = (LinearLayout) view.findViewById(w4c0.f24968u);
        this.f13185u = (LinearLayout) view.findViewById(w4c0.f24959l);
        this.f13186v = (ImageView) view.findViewById(w4c0.f24965r);
        this.f13187w = (ImageView) view.findViewById(w4c0.f24962o);
        this.f13188x = (TextView) view.findViewById(w4c0.f24971x);
        this.f13189y = (LinearLayout) view.findViewById(w4c0.f24960m);
        this.f13190z = (ImageView) view.findViewById(w4c0.f24966s);
        this.f13136A = (ImageView) view.findViewById(w4c0.f24963p);
        this.f13137B = (TextView) view.findViewById(w4c0.f24972y);
        this.f13138C = (LinearLayout) view.findViewById(w4c0.f24961n);
        this.f13139D = (ImageView) view.findViewById(w4c0.f24967t);
        this.f13140E = (ImageView) view.findViewById(w4c0.f24964q);
        this.f13141F = (TextView) view.findViewById(w4c0.f24973z);
        this.f13144I = (LinearLayout) view.findViewById(w4c0.f24936Q);
        this.f13145J = (TextView) view.findViewById(w4c0.f24940U);
    }

    /* JADX INFO: renamed from: L */
    public OMSAdCardInfo m15662L(int i) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (vwb.J(partialListOpt.loaded)) {
            return null;
        }
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
        if (!NullChecker.a(userInfo)) {
            return null;
        }
        Object obj = userInfo.extensionObject;
        if (!(obj instanceof OMSAdCardInfo)) {
            return null;
        }
        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
        this.f13146K = oMSAdCardInfo;
        this.f13148M = oMSAdCardInfo.identifier;
        this.f13163a0 = Boolean.valueOf(oMSAdCardInfo.showCartoon);
        boolean zEquals = TextUtils.equals(this.f13146K.contentType, "omsCard");
        OMSAdCardInfo oMSAdCardInfo2 = this.f13146K;
        if (zEquals) {
            OmsCard omsCard = oMSAdCardInfo2.content.omsCard;
            this.f13149N = omsCard.pictures;
            this.f13150O = omsCard.color;
            this.f13151P = omsCard.title;
            this.f13153R = omsCard.description;
            this.f13154S = omsCard.icons;
            this.f13155T = omsCard.topLeftTags;
        } else if (TextUtils.equals(oMSAdCardInfo2.contentType, "omsCardLiterature")) {
            OmsCardLiterature omsCardLiterature = this.f13146K.content.omsCardLiterature;
            this.f13149N = omsCardLiterature.pictures;
            this.f13150O = omsCardLiterature.color;
            this.f13151P = omsCardLiterature.name;
            this.f13152Q = omsCardLiterature.introduction;
            this.f13153R = omsCardLiterature.guidance;
            this.f13154S = omsCardLiterature.icons;
            this.f13155T = omsCardLiterature.topLeftTags;
            this.f13156U = omsCardLiterature.buttons;
            this.f13157V = omsCardLiterature.literatureID;
            this.f13158W = omsCardLiterature.type;
        }
        try {
            Color.parseColor(this.f13150O);
        } catch (Exception e) {
            this.f13150O = "#000000";
            CrashHelper.c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
        }
        return this.f13146K;
    }

    /* JADX INFO: renamed from: M */
    public final float m15663M(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m15664N() {
        if (this.f13159X) {
            return;
        }
        this.f13159X = true;
        m15659I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m15665O() {
        if (this.f13159X) {
            return;
        }
        this.f13159X = true;
        m15660J();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m15666P(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        this.f13182r.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f13182r.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15667Q(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (NullChecker.a(this.f13156U) && this.f13156U.size() == 3) {
            this.f13189y.setBackground(gradientDrawable);
            this.f13137B.setTextColor(iIntValue);
        }
        this.f13185u.setBackground(gradientDrawable2);
        this.f13138C.setBackground(gradientDrawable3);
        this.f13188x.setTextColor(iIntValue);
        this.f13141F.setTextColor(iIntValue);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m15668R(SwipeDirection swipeDirection) {
        this.f13160Y.V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ c m15669S(Action action, LiteraturesComments literaturesComments) {
        if (literaturesComments == null) {
            return CoreModule.f1534c.f3671s1.m6310w3(this.f13157V, action.id);
        }
        j760 j760VarY = vwb.Y(action.id, "patch");
        return CoreModule.f1534c.f3671s1.m6303n3(this.f13157V, literaturesComments.id, (String) j760VarY.a, (String) j760VarY.b);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m15670T(Boolean bool) {
        this.f13160Y.v0();
        if (bool.booleanValue()) {
            this.f13167c0.call(SwipeDirection.RIGHT);
            CoreModule.f1534c.f3652m0.f3391c2.add("e_artwork_card");
            osi0.g("已添加");
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m15671U(Throwable th) {
        osi0.g("保存失败，请再试一次");
        this.f13160Y.v0();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15672V(View view) {
        int i = this.f13147L;
        if (i > 0) {
            m15698p0(i - 1);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m15673W(View view) {
        if (!NullChecker.a(this.f13149N) || this.f13147L >= this.f13149N.size() - 1) {
            return;
        }
        m15698p0(this.f13147L + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m15674X(Boolean bool) {
        this.f13160Y.v0();
        if (bool.booleanValue()) {
            this.f13167c0.call(SwipeDirection.RIGHT);
            osi0.g("已添加");
            CoreModule.f1534c.f3652m0.f3391c2.add("e_artwork_card");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m15675Y(Throwable th) {
        osi0.g("保存失败，请再试一次");
        this.f13160Y.v0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m15676Z(View view) {
        m15658H();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m15677a0(Action action, View view) {
        m15690h0(action);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m15679b0(Action action, View view) {
        m15690h0(action);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m15681c0(Action action, View view) {
        m15690h0(action);
    }

    /* JADX INFO: renamed from: d */
    public View m15682d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f14240a, viewGroup, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m15683d0(Action action, View view) {
        m15690h0(action);
    }

    /* JADX INFO: renamed from: e */
    public void m15684e(View view, int i, VirtualCardType virtualCardType, View view2) {
        OMSAdCardInfo oMSAdCardInfoM15662L = m15662L(i);
        if (NullChecker.a(oMSAdCardInfoM15662L)) {
            m15661K(view);
            m15704v0(view, i);
            if (i == 0 && "omsCard".equals(oMSAdCardInfoM15662L.contentType)) {
                this.f13160Y.O3();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15685e0(Media media, View view) {
        if (media instanceof Video) {
            this.f13162a.m7211k(media.url, m15663M((Video) media));
            this.f13162a.setVisibility(0);
            this.f13162a.f4450f.setVisibility(4);
            this.f13166c.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m15686f() {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m15687f0(int i) {
        int color;
        try {
            color = Color.parseColor(this.f13150O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f13150O);
        }
        int color2 = Color.parseColor(this.f13150O);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.o);
        gradientDrawable.setColor(color2);
        gradientDrawable.setStroke(t100.g, Color.parseColor("#00000000"));
        this.f13168d.setPadding(0, 0, 0, 0);
        this.f13168d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        int i2 = t100.j;
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        gradientDrawable2.setGradientType(0);
        this.f13143H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(t100.i);
        if (this.f13159X) {
            gradientDrawable3.setColor(CoreModule.f1533b.getResources().getColor(y0c0.f27849m));
            gradientDrawable3.setStroke(t100.a, CoreModule.f1533b.getResources().getColor(y0c0.f27848l));
            if (i == 2) {
                this.f13185u.setBackground(gradientDrawable3);
                this.f13138C.setBackground(gradientDrawable3);
                this.f13188x.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27847k));
                this.f13141F.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27847k));
                this.f13190z.setVisibility(8);
                this.f13136A.setVisibility(8);
            } else if (i == 3) {
                this.f13185u.setBackground(gradientDrawable3);
                this.f13189y.setBackground(gradientDrawable3);
                this.f13138C.setBackground(gradientDrawable3);
                this.f13188x.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27847k));
                this.f13137B.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27847k));
                this.f13141F.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27847k));
                this.f13190z.setVisibility(8);
                this.f13136A.setVisibility(0);
            }
            this.f13186v.setVisibility(8);
            this.f13187w.setVisibility(0);
            this.f13139D.setVisibility(8);
            this.f13140E.setVisibility(0);
            return;
        }
        gradientDrawable3.setColor(CoreModule.f1533b.getResources().getColor(y0c0.f27848l));
        gradientDrawable3.setStroke(t100.a, CoreModule.f1533b.getResources().getColor(y0c0.f27843g));
        if (i == 2) {
            this.f13185u.setBackground(gradientDrawable3);
            this.f13138C.setBackground(gradientDrawable3);
            this.f13188x.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27845i));
            this.f13141F.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27845i));
            this.f13190z.setVisibility(8);
            this.f13136A.setVisibility(8);
        } else if (i == 3) {
            this.f13185u.setBackground(gradientDrawable3);
            this.f13189y.setBackground(gradientDrawable3);
            this.f13138C.setBackground(gradientDrawable3);
            this.f13188x.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27845i));
            this.f13137B.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27845i));
            this.f13141F.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27845i));
            this.f13190z.setVisibility(0);
            this.f13136A.setVisibility(4);
        }
        this.f13186v.setVisibility(0);
        this.f13187w.setVisibility(4);
        this.f13139D.setVisibility(0);
        this.f13140E.setVisibility(4);
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m15688g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        int i = C0756e.f13196a[swipeDirection.ordinal()];
        if (i == 1) {
            osi0.g("不消耗超级喜欢");
            m15701s0();
            str = "up";
        } else if (i == 2) {
            if (NullChecker.a(this.f13146K)) {
                TextUtils.equals(this.f13146K.contentType, "omsCard");
            }
            str = "left";
        } else if (i != 3) {
            str = "";
        } else {
            m15701s0();
            str = "right";
        }
        if (NullChecker.a(this.f13146K) && TextUtils.equals(this.f13146K.contentType, "omsCard")) {
            zvf0.w("e_oms_card", "p_suggest_users_home_view", new j760[]{vwb.Y("card_name", this.f13148M), vwb.Y("swipe_type", str)});
        } else if (NullChecker.a(this.f13146K) && TextUtils.equals(this.f13146K.contentType, "omsCardLiterature")) {
            this.f13160Y.I();
            zvf0.w("e_artwork_card", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_title", this.f13151P), vwb.Y("artwork_type", this.f13158W), vwb.Y("swipe_type", str)});
        }
        if (NullChecker.a(this.f13146K) && TextUtils.equals(this.f13146K.contentType, "omsCard")) {
            hb0.m16141a(swipeDirection, this.f13146K);
        }
        this.f13146K = null;
        this.f13147L = 0;
        this.f13159X = false;
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15689g0() {
        int color;
        int color2 = Color.parseColor(this.f13150O);
        try {
            color = Color.parseColor(this.f13150O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f13150O);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = t100.o;
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(t100.g, color2);
        gradientDrawable.setColor(color2);
        FrameLayout frameLayout = this.f13168d;
        int i2 = t100.f;
        frameLayout.setPadding(i2, i2, i2, i2);
        this.f13168d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
        gradientDrawable2.setGradientType(0);
        this.f13143H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(t100.i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13182r.getLayoutParams();
        if (NullChecker.a(layoutParams)) {
            layoutParams.height = t100.A;
            layoutParams.bottomMargin = t100.m;
            layoutParams.topMargin = t100.j;
            this.f13182r.setLayoutParams(layoutParams);
        }
        this.f13182r.setTextSize(16.0f);
        if (this.f13159X) {
            gradientDrawable3.setColor(CoreModule.f1533b.getResources().getColor(y0c0.f27849m));
            gradientDrawable3.setStroke(t100.a, CoreModule.f1533b.getResources().getColor(y0c0.f27848l));
            this.f13182r.setBackground(gradientDrawable3);
            this.f13182r.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27837a));
            return;
        }
        gradientDrawable3.setColor(CoreModule.f1533b.getResources().getColor(y0c0.f27848l));
        gradientDrawable3.setStroke(t100.a, CoreModule.f1533b.getResources().getColor(y0c0.f27844h));
        this.f13182r.setBackground(gradientDrawable3);
        this.f13182r.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27846j));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m15690h0(final Action action) {
        if (action == null || !CoreModule.f1534c.f3628e0.m21409U7()) {
            return;
        }
        if (le7.e()) {
            this.f13160Y.z1(c.just(CoreModule.m1854P().m11706a().m5469kh(CoreModule.m1850H().userId(), this.f13157V))).first().flatMap(new w9j() { // from class: l.sa0
                public final Object call(Object obj) {
                    return this.f21163a.m15669S(action, (LiteraturesComments) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.ta0
                public final void call(Object obj) {
                    this.f21970a.m15670T((Boolean) obj);
                }
            }, new e30() { // from class: l.ua0
                public final void call(Object obj) {
                    this.f23462a.m15671U((Throwable) obj);
                }
            }));
        } else {
            m15692j0(action);
        }
        zvf0.u("e_artwork_card", "p_suggest_users_home_view", new j760[]{vwb.Y("artwork_card_button_name", m15703u0(action.id)), vwb.Y("artwork_title", this.f13151P), vwb.Y("artwork_type", m15702t0(this.f13158W))});
    }

    /* JADX INFO: renamed from: i0 */
    public final void m15691i0() {
        this.f13179o.setOnClickListener(new View.OnClickListener() { // from class: l.bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8795a.m15672V(view);
            }
        });
        this.f13180p.setOnClickListener(new View.OnClickListener() { // from class: l.cb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9565a.m15673W(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m15692j0(Action action) {
        if (CoreModule.f1534c.f3628e0.m21409U7()) {
            this.f13160Y.U1(R$string.f4259b);
            this.f13160Y.z1(CoreModule.f1534c.f3671s1.m6310w3(this.f13157V, action.id)).subscribe(mkd0.H(new e30() { // from class: l.wa0
                public final void call(Object obj) {
                    this.f25055a.m15674X((Boolean) obj);
                }
            }, new e30() { // from class: l.xa0
                public final void call(Object obj) {
                    this.f27401a.m15675Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m15693k0(List<String> list, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        if (vwb.J(list)) {
            vDraweeView.setVisibility(8);
            vDraweeView2.setVisibility(8);
        } else if (list.size() == 1) {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(8);
            qib0.f19782G.m12744L0(vDraweeView, list.get(0));
        } else {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(0);
            qib0.f19782G.m12744L0(vDraweeView, list.get(0));
            qib0.f19782G.m12744L0(vDraweeView2, list.get(1));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m15694l0(Action action, ImageView imageView, ImageView imageView2) {
        if (TextUtils.equals(action.id, "to_watch")) {
            imageView.setImageResource(z2c0.f28574f);
            imageView2.setImageResource(z2c0.f28571c);
        } else if (TextUtils.equals(action.id, "watching")) {
            imageView.setImageResource(z2c0.f28573e);
            imageView2.setImageResource(z2c0.f28570b);
        } else if (TextUtils.equals(action.id, "watched")) {
            imageView.setImageResource(z2c0.f28572d);
            imageView2.setImageResource(z2c0.f28569a);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15695m0(List<String> list, TextView textView, TextView textView2, TextView textView3) {
        if (vwb.J(list)) {
            textView.setVisibility(8);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        int size = list.size();
        if (size == 1) {
            textView.setVisibility(0);
            textView2.setVisibility(8);
            textView3.setVisibility(8);
            textView.setText(list.get(0));
            return;
        }
        if (size == 2) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setVisibility(8);
            textView.setText(list.get(0));
            textView2.setText(list.get(1));
            return;
        }
        if (size == 3) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
            textView.setText(list.get(0));
            textView2.setText(list.get(1));
            textView3.setText(list.get(2));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m15696n0() {
        if (TextUtils.equals(this.f13146K.contentType, "omsCard")) {
            OmsCard omsCard = this.f13146K.content.omsCard;
            boolean zIsEmpty = TextUtils.isEmpty(omsCard.action.value);
            TextView textView = this.f13182r;
            if (zIsEmpty) {
                textView.setText("");
            } else {
                textView.setText(omsCard.action.value);
            }
        }
        this.f13177m.setText(this.f13151P);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f13153R);
        TextView textView2 = this.f13178n;
        if (zIsEmpty2) {
            textView2.setText("");
            xdl0.M(this.f13178n, false);
        } else {
            textView2.setText(this.f13153R);
            xdl0.M0(this.f13178n, true);
        }
        m15693k0(this.f13154S, this.f13172h, this.f13173i);
        m15695m0(this.f13155T, this.f13174j, this.f13175k, this.f13176l);
        if (vwb.J(this.f13149N)) {
            this.f13142G.setVisibility(8);
            this.f13170f.setVisibility(8);
            return;
        }
        int size = this.f13149N.size();
        LinearLayout linearLayout = this.f13142G;
        if (size > 1) {
            linearLayout.setVisibility(0);
            this.f13170f.setVisibility(0);
            this.f13170f.setIndicatorCount(this.f13149N.size());
        } else {
            linearLayout.setVisibility(8);
            this.f13170f.setVisibility(8);
        }
        m15698p0(this.f13147L);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m15697o0() {
        if (TextUtils.equals(this.f13146K.contentType, "omsCard")) {
            this.f13183s.setVisibility(8);
            this.f13184t.setVisibility(8);
            this.f13182r.setVisibility(0);
            m15689g0();
            this.f13182r.setOnClickListener(new View.OnClickListener() { // from class: l.ka0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15676a.m15676Z(view);
                }
            });
            CoreModule.f1534c.f3628e0.m21490p9();
            xdl0.M(this.f13144I, false);
            return;
        }
        if (TextUtils.equals(this.f13146K.contentType, "omsCardLiterature")) {
            this.f13182r.setVisibility(8);
            if (!NullChecker.a(this.f13156U) || this.f13156U.isEmpty() || this.f13156U.size() < 2 || this.f13156U.size() > 3) {
                xdl0.M(this.f13184t, false);
                return;
            }
            xdl0.M0(this.f13184t, true);
            final Action action = this.f13156U.get(0);
            this.f13188x.setText(action.value);
            m15694l0(action, this.f13186v, this.f13187w);
            xdl0.E0(this.f13185u, new View.OnClickListener() { // from class: l.va0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24230a.m15677a0(action, view);
                }
            });
            xdl0.M0(this.f13186v, true);
            xdl0.M0(this.f13187w, false);
            boolean zIsEmpty = TextUtils.isEmpty(this.f13152Q);
            TextView textView = this.f13183s;
            if (zIsEmpty) {
                textView.setText("");
                xdl0.M(this.f13183s, false);
            } else {
                textView.setText(this.f13152Q);
                xdl0.M0(this.f13183s, true);
            }
            if (this.f13156U.size() == 2) {
                xdl0.M(this.f13189y, false);
                final Action action2 = this.f13156U.get(1);
                this.f13141F.setText(action2.value);
                m15694l0(action2, this.f13139D, this.f13140E);
                xdl0.E0(this.f13138C, new View.OnClickListener() { // from class: l.ya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28088a.m15679b0(action2, view);
                    }
                });
                m15687f0(this.f13156U.size());
            } else if (this.f13156U.size() == 3) {
                xdl0.M0(this.f13189y, true);
                final Action action3 = this.f13156U.get(1);
                final Action action4 = this.f13156U.get(2);
                this.f13137B.setText(action3.value);
                m15694l0(action3, this.f13190z, this.f13136A);
                xdl0.E0(this.f13189y, new View.OnClickListener() { // from class: l.za0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28680a.m15681c0(action3, view);
                    }
                });
                this.f13141F.setText(action4.value);
                m15694l0(action4, this.f13139D, this.f13140E);
                xdl0.E0(this.f13138C, new View.OnClickListener() { // from class: l.ab0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f8186a.m15683d0(action4, view);
                    }
                });
            }
            m15687f0(this.f13156U.size());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m15698p0(int i) {
        this.f13147L = i;
        Media media = this.f13149N.get(i);
        if (this.f13170f.getVisibility() == 0) {
            this.f13170f.setSelectedIndex(i);
        }
        if (media instanceof Video) {
            m15700r0(media);
        } else {
            m15699q0(media);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m15699q0(Media media) {
        this.f13164b.setVisibility(0);
        this.f13162a.setVisibility(4);
        this.f13162a.f4450f.setVisibility(4);
        this.f13162a.f4449e.i(false);
        this.f13171g.setVisibility(0);
        qib0.f19782G.m12746M0(this.f13171g, CoreModule.m1854P().m11706a().m5364Ub(media), new C0752a());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m15700r0(final Media media) {
        this.f13164b.setVisibility(4);
        this.f13166c.setVisibility(4);
        this.f13166c.setOnClickListener(new View.OnClickListener() { // from class: l.db0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10269a.m15685e0(media, view);
            }
        });
        this.f13162a.setVisibility(0);
        this.f13162a.f4450f.setVisibility(0);
        this.f13171g.setVisibility(4);
        qib0.f19782G.m12746M0(this.f13162a.f4450f, CoreModule.m1854P().m11706a().m5223Al(media), new C0753b(media));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m15701s0() {
        if (TextUtils.equals(this.f13146K.contentType, "omsCard")) {
            OmsCard omsCard = this.f13146K.content.omsCard;
            if (TextUtils.isEmpty(omsCard.action.deeplink)) {
                return;
            }
            if (le7.g() && this.f13146K.identifier.contains("guideNewUserCompleteMaterial")) {
                CoreModule.m1854P().m11706a().m5538ug(this.f13160Y.q1(), Uri.parse(omsCard.action.deeplink + "&from=app_suggest_card"));
            } else {
                StringBuilder sb = new StringBuilder(omsCard.action.deeplink);
                if (CoreModule.m1854P().m11711g().m6972Wa() && this.f13146K.identifier.contains("blindbox")) {
                    sb.append("&from=youth_vip");
                }
                CoreModule.m1854P().m11706a().m5538ug(this.f13160Y.q1(), Uri.parse(sb.toString()));
            }
            CoreModule.f1534c.f3652m0.f3391c2.add("e_oms_card");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final String m15702t0(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }

    /* JADX INFO: renamed from: u0 */
    public final String m15703u0(String str) {
        return TextUtils.equals(str, "to_watch") ? "wish" : str;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m15704v0(View view, int i) {
        m15657G(view, i);
        m15691i0();
        m15697o0();
        m15696n0();
        xdl0.k0(this.f13168d);
    }

    /* JADX INFO: renamed from: l.gb0$c */
    public class C0754c implements Animator.AnimatorListener {
        public C0754c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.gb0$d */
    public class C0755d implements Animator.AnimatorListener {
        public C0755d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15678b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m15680c(View view) {
    }
}
