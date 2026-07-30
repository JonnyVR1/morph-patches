package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.InterestLevel;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.advertisingcard.AdvertisPlayVideoView;
import com.p051p1.mobile.putong.data.Action;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OmsCard;
import com.p051p1.mobile.putong.data.OmsCardLiterature;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class cb0 implements sxl0 {

    /* JADX INFO: renamed from: A */
    public ImageView f80632A;

    /* JADX INFO: renamed from: B */
    public TextView f80633B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f80634C;

    /* JADX INFO: renamed from: D */
    public ImageView f80635D;

    /* JADX INFO: renamed from: E */
    public ImageView f80636E;

    /* JADX INFO: renamed from: F */
    public TextView f80637F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f80638G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f80639H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f80640I;

    /* JADX INFO: renamed from: J */
    public TextView f80641J;

    /* JADX INFO: renamed from: K */
    public OMSAdCardInfo f80642K;

    /* JADX INFO: renamed from: M */
    public String f80644M;

    /* JADX INFO: renamed from: N */
    public List<Media> f80645N;

    /* JADX INFO: renamed from: P */
    public String f80647P;

    /* JADX INFO: renamed from: Q */
    public String f80648Q;

    /* JADX INFO: renamed from: R */
    public String f80649R;

    /* JADX INFO: renamed from: S */
    public List<String> f80650S;

    /* JADX INFO: renamed from: T */
    public List<String> f80651T;

    /* JADX INFO: renamed from: U */
    public List<Action> f80652U;

    /* JADX INFO: renamed from: V */
    public String f80653V;

    /* JADX INFO: renamed from: W */
    public String f80654W;

    /* JADX INFO: renamed from: Y */
    public x0m f80656Y;

    /* JADX INFO: renamed from: a */
    public AdvertisPlayVideoView f80658a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f80660b;

    /* JADX INFO: renamed from: c */
    public ImageButton f80662c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f80664d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f80665e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f80666f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f80667g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f80668h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f80669i;

    /* JADX INFO: renamed from: j */
    public TextView f80670j;

    /* JADX INFO: renamed from: k */
    public TextView f80671k;

    /* JADX INFO: renamed from: l */
    public TextView f80672l;

    /* JADX INFO: renamed from: m */
    public TextView f80673m;

    /* JADX INFO: renamed from: n */
    public TextView f80674n;

    /* JADX INFO: renamed from: o */
    public View f80675o;

    /* JADX INFO: renamed from: p */
    public View f80676p;

    /* JADX INFO: renamed from: q */
    public View f80677q;

    /* JADX INFO: renamed from: r */
    public TextView f80678r;

    /* JADX INFO: renamed from: s */
    public TextView f80679s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f80680t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f80681u;

    /* JADX INFO: renamed from: v */
    public ImageView f80682v;

    /* JADX INFO: renamed from: w */
    public ImageView f80683w;

    /* JADX INFO: renamed from: x */
    public TextView f80684x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f80685y;

    /* JADX INFO: renamed from: z */
    public ImageView f80686z;

    /* JADX INFO: renamed from: L */
    public int f80643L = 0;

    /* JADX INFO: renamed from: O */
    public String f80646O = Constants.BLACK;

    /* JADX INFO: renamed from: X */
    public boolean f80655X = false;

    /* JADX INFO: renamed from: Z */
    public long f80657Z = 0;

    /* JADX INFO: renamed from: a0 */
    public Boolean f80659a0 = Boolean.FALSE;

    /* JADX INFO: renamed from: b0 */
    public boolean f80661b0 = false;

    /* JADX INFO: renamed from: c0 */
    public y20<SwipeDirection> f80663c0 = new y20() { // from class: l.ha0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f108449a.m108554R((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.cb0$a */
    public class C16218a extends fn2 {
        public C16218a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            cb0.this.f80660b.setVisibility(4);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: f */
        public void mo108585f(String str) {
            super.mo108585f(str);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            cb0.this.f80660b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.cb0$b */
    public class C16219b extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Media f80688a;

        public C16219b(Media media) {
            this.f80688a = media;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
            cb0.this.f80660b.setVisibility(4);
            if (this.f80688a instanceof Video) {
                cb0.this.f80662c.setVisibility(4);
            }
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: f */
        public void mo108585f(String str) {
            super.mo108585f(str);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            cb0.this.f80660b.setVisibility(4);
            cb0.this.f80662c.setVisibility(0);
            cb0.this.f80658a.f29230e.m224544i(false);
            cb0.this.f80658a.f29230e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.cb0$e */
    public static /* synthetic */ class C16222e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f80692a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f80692a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80692a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80692a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public cb0(x0m x0mVar) {
        this.f80656Y = x0mVar;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m108536t(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable2.setColor(iIntValue);
        gradientDrawable3.setColor(iIntValue);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m108538v(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = qa00.f156314a;
        gradientDrawable.setStroke(i, iIntValue);
        gradientDrawable2.setStroke(i, iIntValue);
        gradientDrawable3.setStroke(i, iIntValue);
    }

    /* JADX INFO: renamed from: G */
    public void m108543G(View view, int i) {
        if (i == 0) {
            if (TextUtils.equals(this.f80642K.contentType, "omsCard")) {
                this.f80656Y.mo37742I();
                view.postDelayed(new Runnable() { // from class: l.ab0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f69189a.m108550N();
                    }
                }, 1000L);
            } else if (TextUtils.equals(this.f80642K.contentType, "omsCardLiterature")) {
                this.f80656Y.mo37745O3();
                view.postDelayed(new Runnable() { // from class: l.bb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f75765a.m108551O();
                    }
                }, 1000L);
            }
            pk50.m172568j().m172574f().m181662Z(this.f80642K.identifier, 0, false);
            if (NullChecker.m82486a(this.f80642K)) {
                fb0.m124812k(this.f80642K);
            }
            if (TextUtils.equals(this.f80642K.contentType, "omsCard")) {
                i4g0.m138492A("e_oms_card", "p_suggest_users_home_view", jyb.m147494Y("card_name", this.f80644M));
            } else if (TextUtils.equals(this.f80642K.contentType, "omsCardLiterature")) {
                i4g0.m138492A("e_artwork_card", "p_suggest_users_home_view", jyb.m147494Y("artwork_title", this.f80647P), jyb.m147494Y("artwork_type", m108582t0(this.f80654W)));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m108544H() {
        this.f80663c0.call(SwipeDirection.RIGHT);
        i4g0.m138523u("e_oms_card", "p_suggest_users_home_view", jyb.m147494Y("card_name", this.f80644M));
        CoreModule.f18264c.f20405m0.f20144c2.add("e_oms_card");
    }

    /* JADX INFO: renamed from: I */
    public final void m108545I() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qa00.f156322i);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(16777215, -1);
        valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.la0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setColor(((Integer) valueAnimatorOfInt.getAnimatedValue()).intValue());
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1308622847, 16777215);
        valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt2.setDuration(500L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ma0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gradientDrawable.setStroke(qa00.f156314a, ((Integer) valueAnimatorOfInt2.getAnimatedValue()).intValue());
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(500L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.na0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f140965a.m108552P(valueAnimatorOfInt3, gradientDrawable, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C16220c());
    }

    /* JADX INFO: renamed from: J */
    public final void m108546J() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = qa00.f156323j;
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
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ia0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cb0.m108536t(valueAnimatorOfInt, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1308622847, 16777215);
        valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ja0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cb0.m108538v(valueAnimatorOfInt2, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(800L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ka0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124602a.m108553Q(valueAnimatorOfInt3, gradientDrawable3, gradientDrawable, gradientDrawable2, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C16221d());
        if (NullChecker.m82486a(this.f80652U) && this.f80652U.size() == 3) {
            this.f80632A.setVisibility(0);
        } else {
            this.f80632A.setVisibility(8);
        }
        this.f80683w.setVisibility(0);
        this.f80636E.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        if (NullChecker.m82486a(this.f80652U) && this.f80652U.size() == 3) {
            this.f80632A.startAnimation(alphaAnimation);
        }
        this.f80683w.startAnimation(alphaAnimation);
        this.f80636E.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(800L);
        if (NullChecker.m82486a(this.f80652U) && this.f80652U.size() == 3) {
            this.f80686z.startAnimation(alphaAnimation2);
        }
        this.f80682v.startAnimation(alphaAnimation2);
        this.f80635D.startAnimation(alphaAnimation2);
    }

    /* JADX INFO: renamed from: K */
    public final void m108547K(View view) {
        this.f80664d = (FrameLayout) view.findViewById(cdc0.f81137O);
        this.f80666f = (NewPictureContainerIndicator) view.findViewById(cdc0.f81129G);
        this.f80639H = (LinearLayout) view.findViewById(cdc0.f81151b);
        this.f80667g = (VDraweeView) view.findViewById(cdc0.f81160j);
        this.f80658a = (AdvertisPlayVideoView) view.findViewById(cdc0.f81145W);
        this.f80665e = (RelativeLayout) view.findViewById(cdc0.f81153c);
        this.f80668h = (VDraweeView) view.findViewById(cdc0.f81156f);
        this.f80669i = (VDraweeView) view.findViewById(cdc0.f81157g);
        this.f80673m = (TextView) view.findViewById(cdc0.f81161k);
        this.f80674n = (TextView) view.findViewById(cdc0.f81155e);
        this.f80678r = (TextView) view.findViewById(cdc0.f81149a);
        this.f80670j = (TextView) view.findViewById(cdc0.f81140R);
        this.f80671k = (TextView) view.findViewById(cdc0.f81141S);
        this.f80672l = (TextView) view.findViewById(cdc0.f81142T);
        this.f80675o = view.findViewById(cdc0.f81148Z);
        this.f80676p = view.findViewById(cdc0.f81147Y);
        this.f80677q = view.findViewById(cdc0.f81123A);
        this.f80638G = (LinearLayout) view.findViewById(cdc0.f81124B);
        this.f80662c = this.f80658a.f29232g;
        this.f80660b = (VProgressBar) view.findViewById(cdc0.f81159i);
        this.f80679s = (TextView) view.findViewById(cdc0.f81154d);
        this.f80680t = (LinearLayout) view.findViewById(cdc0.f81171u);
        this.f80681u = (LinearLayout) view.findViewById(cdc0.f81162l);
        this.f80682v = (ImageView) view.findViewById(cdc0.f81168r);
        this.f80683w = (ImageView) view.findViewById(cdc0.f81165o);
        this.f80684x = (TextView) view.findViewById(cdc0.f81174x);
        this.f80685y = (LinearLayout) view.findViewById(cdc0.f81163m);
        this.f80686z = (ImageView) view.findViewById(cdc0.f81169s);
        this.f80632A = (ImageView) view.findViewById(cdc0.f81166p);
        this.f80633B = (TextView) view.findViewById(cdc0.f81175y);
        this.f80634C = (LinearLayout) view.findViewById(cdc0.f81164n);
        this.f80635D = (ImageView) view.findViewById(cdc0.f81170t);
        this.f80636E = (ImageView) view.findViewById(cdc0.f81167q);
        this.f80637F = (TextView) view.findViewById(cdc0.f81176z);
        this.f80640I = (LinearLayout) view.findViewById(cdc0.f81139Q);
        this.f80641J = (TextView) view.findViewById(cdc0.f81143U);
    }

    /* JADX INFO: renamed from: L */
    public OMSAdCardInfo m108548L(int i) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (jyb.m147479J(partialListOptM222761e.loaded)) {
            return null;
        }
        CoreSuggested.UserInfo userInfo = partialListOptM222761e.loaded.get(i);
        if (!NullChecker.m82486a(userInfo)) {
            return null;
        }
        Object obj = userInfo.extensionObject;
        if (!(obj instanceof OMSAdCardInfo)) {
            return null;
        }
        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
        this.f80642K = oMSAdCardInfo;
        this.f80644M = oMSAdCardInfo.identifier;
        this.f80659a0 = Boolean.valueOf(oMSAdCardInfo.showCartoon);
        boolean zEquals = TextUtils.equals(this.f80642K.contentType, "omsCard");
        OMSAdCardInfo oMSAdCardInfo2 = this.f80642K;
        if (zEquals) {
            OmsCard omsCard = oMSAdCardInfo2.content.omsCard;
            this.f80645N = omsCard.pictures;
            this.f80646O = omsCard.color;
            this.f80647P = omsCard.title;
            this.f80649R = omsCard.description;
            this.f80650S = omsCard.icons;
            this.f80651T = omsCard.topLeftTags;
        } else if (TextUtils.equals(oMSAdCardInfo2.contentType, "omsCardLiterature")) {
            OmsCardLiterature omsCardLiterature = this.f80642K.content.omsCardLiterature;
            this.f80645N = omsCardLiterature.pictures;
            this.f80646O = omsCardLiterature.color;
            this.f80647P = omsCardLiterature.name;
            this.f80648Q = omsCardLiterature.introduction;
            this.f80649R = omsCardLiterature.guidance;
            this.f80650S = omsCardLiterature.icons;
            this.f80651T = omsCardLiterature.topLeftTags;
            this.f80652U = omsCardLiterature.buttons;
            this.f80653V = omsCardLiterature.literatureID;
            this.f80654W = omsCardLiterature.type;
        }
        try {
            Color.parseColor(this.f80646O);
        } catch (Exception e) {
            this.f80646O = Constants.BLACK;
            CrashHelper.m82479c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
        }
        return this.f80642K;
    }

    /* JADX INFO: renamed from: M */
    public final float m108549M(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m108550N() {
        if (this.f80655X) {
            return;
        }
        this.f80655X = true;
        m108545I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m108551O() {
        if (this.f80655X) {
            return;
        }
        this.f80655X = true;
        m108546J();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m108552P(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        this.f80678r.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f80678r.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m108553Q(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (NullChecker.m82486a(this.f80652U) && this.f80652U.size() == 3) {
            this.f80685y.setBackground(gradientDrawable);
            this.f80633B.setTextColor(iIntValue);
        }
        this.f80681u.setBackground(gradientDrawable2);
        this.f80634C.setBackground(gradientDrawable3);
        this.f80684x.setTextColor(iIntValue);
        this.f80637F.setTextColor(iIntValue);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m108554R(SwipeDirection swipeDirection) {
        this.f80656Y.mo37749V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ C22421c m108555S(Action action, LiteraturesComments literaturesComments) {
        if (literaturesComments == null) {
            return CoreModule.f18264c.f20424s1.m35376w3(this.f80653V, action.f39567id);
        }
        pf60 pf60VarM147494Y = jyb.m147494Y(action.f39567id, "patch");
        return CoreModule.f18264c.f20424s1.m35369n3(this.f80653V, literaturesComments.f21176id, (String) pf60VarM147494Y.f152156a, (String) pf60VarM147494Y.f152157b);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m108556T(Boolean bool) {
        this.f80656Y.mo37766v0();
        if (bool.booleanValue()) {
            this.f80663c0.call(SwipeDirection.RIGHT);
            CoreModule.f18264c.f20405m0.f20144c2.add("e_artwork_card");
            r1j0.m179420g("已添加");
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m108557U(Throwable th) {
        r1j0.m179420g("保存失败，请再试一次");
        this.f80656Y.mo37766v0();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m108558V(View view) {
        int i = this.f80643L;
        if (i > 0) {
            m108578p0(i - 1);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m108559W(View view) {
        if (!NullChecker.m82486a(this.f80645N) || this.f80643L >= this.f80645N.size() - 1) {
            return;
        }
        m108578p0(this.f80643L + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m108560X(Boolean bool) {
        this.f80656Y.mo37766v0();
        if (bool.booleanValue()) {
            this.f80663c0.call(SwipeDirection.RIGHT);
            r1j0.m179420g("已添加");
            CoreModule.f18264c.f20405m0.f20144c2.add("e_artwork_card");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m108561Y(Throwable th) {
        r1j0.m179420g("保存失败，请再试一次");
        this.f80656Y.mo37766v0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m108562Z(View view) {
        m108544H();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m108563a0(Action action, View view) {
        m108570h0(action);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m108564b0(Action action, View view) {
        m108570h0(action);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m108565c0(Action action, View view) {
        m108570h0(action);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141616a, viewGroup, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m108566d0(Action action, View view) {
        m108570h0(action);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        OMSAdCardInfo oMSAdCardInfoM108548L = m108548L(i);
        if (NullChecker.m82486a(oMSAdCardInfoM108548L)) {
            m108547K(view);
            m108584v0(view, i);
            if (i == 0 && "omsCard".equals(oMSAdCardInfoM108548L.contentType)) {
                this.f80656Y.mo37745O3();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m108567e0(Media media, View view) {
        if (media instanceof Video) {
            this.f80658a.m45445k(media.url, m108549M((Video) media));
            this.f80658a.setVisibility(0);
            this.f80658a.f29231f.setVisibility(4);
            this.f80662c.setVisibility(4);
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m108568f0(int i) {
        int color;
        try {
            color = Color.parseColor(this.f80646O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f80646O);
        }
        int color2 = Color.parseColor(this.f80646O);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qa00.f156328o);
        gradientDrawable.setColor(color2);
        gradientDrawable.setStroke(qa00.f156320g, Color.parseColor("#00000000"));
        this.f80664d.setPadding(0, 0, 0, 0);
        this.f80664d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        int i2 = qa00.f156323j;
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        gradientDrawable2.setGradientType(0);
        this.f80639H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(qa00.f156322i);
        if (this.f80655X) {
            gradientDrawable3.setColor(CoreModule.f18263b.getResources().getColor(e9c0.f92625m));
            gradientDrawable3.setStroke(qa00.f156314a, CoreModule.f18263b.getResources().getColor(e9c0.f92624l));
            if (i == 2) {
                this.f80681u.setBackground(gradientDrawable3);
                this.f80634C.setBackground(gradientDrawable3);
                this.f80684x.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92623k));
                this.f80637F.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92623k));
                this.f80686z.setVisibility(8);
                this.f80632A.setVisibility(8);
            } else if (i == 3) {
                this.f80681u.setBackground(gradientDrawable3);
                this.f80685y.setBackground(gradientDrawable3);
                this.f80634C.setBackground(gradientDrawable3);
                this.f80684x.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92623k));
                this.f80633B.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92623k));
                this.f80637F.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92623k));
                this.f80686z.setVisibility(8);
                this.f80632A.setVisibility(0);
            }
            this.f80682v.setVisibility(8);
            this.f80683w.setVisibility(0);
            this.f80635D.setVisibility(8);
            this.f80636E.setVisibility(0);
            return;
        }
        gradientDrawable3.setColor(CoreModule.f18263b.getResources().getColor(e9c0.f92624l));
        gradientDrawable3.setStroke(qa00.f156314a, CoreModule.f18263b.getResources().getColor(e9c0.f92619g));
        if (i == 2) {
            this.f80681u.setBackground(gradientDrawable3);
            this.f80634C.setBackground(gradientDrawable3);
            this.f80684x.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92621i));
            this.f80637F.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92621i));
            this.f80686z.setVisibility(8);
            this.f80632A.setVisibility(8);
        } else if (i == 3) {
            this.f80681u.setBackground(gradientDrawable3);
            this.f80685y.setBackground(gradientDrawable3);
            this.f80634C.setBackground(gradientDrawable3);
            this.f80684x.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92621i));
            this.f80633B.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92621i));
            this.f80637F.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92621i));
            this.f80686z.setVisibility(0);
            this.f80632A.setVisibility(4);
        }
        this.f80682v.setVisibility(0);
        this.f80683w.setVisibility(4);
        this.f80635D.setVisibility(0);
        this.f80636E.setVisibility(4);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        String str;
        int i = C16222e.f80692a[swipeDirection.ordinal()];
        if (i == 1) {
            r1j0.m179420g("不消耗超级喜欢");
            m108581s0();
            str = "up";
        } else if (i == 2) {
            if (NullChecker.m82486a(this.f80642K)) {
                TextUtils.equals(this.f80642K.contentType, "omsCard");
            }
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 3) {
            str = "";
        } else {
            m108581s0();
            str = "right";
        }
        if (NullChecker.m82486a(this.f80642K) && TextUtils.equals(this.f80642K.contentType, "omsCard")) {
            i4g0.m138525w("e_oms_card", "p_suggest_users_home_view", jyb.m147494Y("card_name", this.f80644M), jyb.m147494Y("swipe_type", str));
        } else if (NullChecker.m82486a(this.f80642K) && TextUtils.equals(this.f80642K.contentType, "omsCardLiterature")) {
            this.f80656Y.mo37742I();
            i4g0.m138525w("e_artwork_card", "p_suggest_users_home_view", jyb.m147494Y("artwork_title", this.f80647P), jyb.m147494Y("artwork_type", this.f80654W), jyb.m147494Y("swipe_type", str));
        }
        if (NullChecker.m82486a(this.f80642K) && TextUtils.equals(this.f80642K.contentType, "omsCard")) {
            db0.m115156a(swipeDirection, this.f80642K);
        }
        this.f80642K = null;
        this.f80643L = 0;
        this.f80655X = false;
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m108569g0() {
        int color;
        int color2 = Color.parseColor(this.f80646O);
        try {
            color = Color.parseColor(this.f80646O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f80646O);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = qa00.f156328o;
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(qa00.f156320g, color2);
        gradientDrawable.setColor(color2);
        FrameLayout frameLayout = this.f80664d;
        int i2 = qa00.f156319f;
        frameLayout.setPadding(i2, i2, i2, i2);
        this.f80664d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
        gradientDrawable2.setGradientType(0);
        this.f80639H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(qa00.f156322i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80678r.getLayoutParams();
        if (NullChecker.m82486a(layoutParams)) {
            layoutParams.height = qa00.f156288A;
            layoutParams.bottomMargin = qa00.f156326m;
            layoutParams.topMargin = qa00.f156323j;
            this.f80678r.setLayoutParams(layoutParams);
        }
        this.f80678r.setTextSize(16.0f);
        if (this.f80655X) {
            gradientDrawable3.setColor(CoreModule.f18263b.getResources().getColor(e9c0.f92625m));
            gradientDrawable3.setStroke(qa00.f156314a, CoreModule.f18263b.getResources().getColor(e9c0.f92624l));
            this.f80678r.setBackground(gradientDrawable3);
            this.f80678r.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92613a));
            return;
        }
        gradientDrawable3.setColor(CoreModule.f18263b.getResources().getColor(e9c0.f92624l));
        gradientDrawable3.setStroke(qa00.f156314a, CoreModule.f18263b.getResources().getColor(e9c0.f92620h));
        this.f80678r.setBackground(gradientDrawable3);
        this.f80678r.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92622j));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m108570h0(final Action action) {
        if (action == null || !CoreModule.f18264c.f20381e0.m116519U7()) {
            return;
        }
        if (pf7.m172090e()) {
            this.f80656Y.mo37767z1(C22421c.just(CoreModule.m30933P().m143405a().mo34535kh(CoreModule.m30929H().userId(), this.f80653V))).first().flatMap(new qcj() { // from class: l.oa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f145651a.m108555S(action, (LiteraturesComments) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.pa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151199a.m108556T((Boolean) obj);
                }
            }, new y20() { // from class: l.qa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156287a.m108557U((Throwable) obj);
                }
            }));
        } else {
            m108572j0(action);
        }
        i4g0.m138523u("e_artwork_card", "p_suggest_users_home_view", jyb.m147494Y("artwork_card_button_name", m108583u0(action.f39567id)), jyb.m147494Y("artwork_title", this.f80647P), jyb.m147494Y("artwork_type", m108582t0(this.f80654W)));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m108571i0() {
        this.f80675o.setOnClickListener(new View.OnClickListener() { // from class: l.xa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192981a.m108558V(view);
            }
        });
        this.f80676p.setOnClickListener(new View.OnClickListener() { // from class: l.ya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198145a.m108559W(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m108572j0(Action action) {
        if (CoreModule.f18264c.f20381e0.m116519U7()) {
            this.f80656Y.mo37748U1(R$string.f21012b);
            this.f80656Y.mo37767z1(CoreModule.f18264c.f20424s1.m35376w3(this.f80653V, action.f39567id)).subscribe(psd0.m173597H(new y20() { // from class: l.sa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166990a.m108560X((Boolean) obj);
                }
            }, new y20() { // from class: l.ta0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172681a.m108561Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m108573k0(List<String> list, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        if (jyb.m147479J(list)) {
            vDraweeView.setVisibility(8);
            vDraweeView2.setVisibility(8);
        } else if (list.size() == 1) {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(8);
            uqb0.f180374G.m127115L0(vDraweeView, list.get(0));
        } else {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(0);
            uqb0.f180374G.m127115L0(vDraweeView, list.get(0));
            uqb0.f180374G.m127115L0(vDraweeView2, list.get(1));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m108574l0(Action action, ImageView imageView, ImageView imageView2) {
        if (TextUtils.equals(action.f39567id, InterestLevel.to_watch)) {
            imageView.setImageResource(fbc0.f98067f);
            imageView2.setImageResource(fbc0.f98064c);
        } else if (TextUtils.equals(action.f39567id, InterestLevel.watching)) {
            imageView.setImageResource(fbc0.f98066e);
            imageView2.setImageResource(fbc0.f98063b);
        } else if (TextUtils.equals(action.f39567id, InterestLevel.watched)) {
            imageView.setImageResource(fbc0.f98065d);
            imageView2.setImageResource(fbc0.f98062a);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m108575m0(List<String> list, TextView textView, TextView textView2, TextView textView3) {
        if (jyb.m147479J(list)) {
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
    public final void m108576n0() {
        if (TextUtils.equals(this.f80642K.contentType, "omsCard")) {
            OmsCard omsCard = this.f80642K.content.omsCard;
            boolean zIsEmpty = TextUtils.isEmpty(omsCard.action.value);
            TextView textView = this.f80678r;
            if (zIsEmpty) {
                textView.setText("");
            } else {
                textView.setText(omsCard.action.value);
            }
        }
        this.f80673m.setText(this.f80647P);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f80649R);
        TextView textView2 = this.f80674n;
        if (zIsEmpty2) {
            textView2.setText("");
            bnl0.m105524M(this.f80674n, false);
        } else {
            textView2.setText(this.f80649R);
            bnl0.m105525M0(this.f80674n, true);
        }
        m108573k0(this.f80650S, this.f80668h, this.f80669i);
        m108575m0(this.f80651T, this.f80670j, this.f80671k, this.f80672l);
        if (jyb.m147479J(this.f80645N)) {
            this.f80638G.setVisibility(8);
            this.f80666f.setVisibility(8);
            return;
        }
        int size = this.f80645N.size();
        LinearLayout linearLayout = this.f80638G;
        if (size > 1) {
            linearLayout.setVisibility(0);
            this.f80666f.setVisibility(0);
            this.f80666f.setIndicatorCount(this.f80645N.size());
        } else {
            linearLayout.setVisibility(8);
            this.f80666f.setVisibility(8);
        }
        m108578p0(this.f80643L);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m108577o0() {
        if (TextUtils.equals(this.f80642K.contentType, "omsCard")) {
            this.f80679s.setVisibility(8);
            this.f80680t.setVisibility(8);
            this.f80678r.setVisibility(0);
            m108569g0();
            this.f80678r.setOnClickListener(new View.OnClickListener() { // from class: l.ga0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102947a.m108562Z(view);
                }
            });
            CoreModule.f18264c.f20381e0.m116600p9();
            bnl0.m105524M(this.f80640I, false);
            return;
        }
        if (TextUtils.equals(this.f80642K.contentType, "omsCardLiterature")) {
            this.f80678r.setVisibility(8);
            if (!NullChecker.m82486a(this.f80652U) || this.f80652U.isEmpty() || this.f80652U.size() < 2 || this.f80652U.size() > 3) {
                bnl0.m105524M(this.f80680t, false);
                return;
            }
            bnl0.m105525M0(this.f80680t, true);
            final Action action = this.f80652U.get(0);
            this.f80684x.setText(action.value);
            m108574l0(action, this.f80682v, this.f80683w);
            bnl0.m105509E0(this.f80681u, new View.OnClickListener() { // from class: l.ra0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161882a.m108563a0(action, view);
                }
            });
            bnl0.m105525M0(this.f80682v, true);
            bnl0.m105525M0(this.f80683w, false);
            boolean zIsEmpty = TextUtils.isEmpty(this.f80648Q);
            TextView textView = this.f80679s;
            if (zIsEmpty) {
                textView.setText("");
                bnl0.m105524M(this.f80679s, false);
            } else {
                textView.setText(this.f80648Q);
                bnl0.m105525M0(this.f80679s, true);
            }
            if (this.f80652U.size() == 2) {
                bnl0.m105524M(this.f80685y, false);
                final Action action2 = this.f80652U.get(1);
                this.f80637F.setText(action2.value);
                m108574l0(action2, this.f80635D, this.f80636E);
                bnl0.m105509E0(this.f80634C, new View.OnClickListener() { // from class: l.ua0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f178168a.m108564b0(action2, view);
                    }
                });
                m108568f0(this.f80652U.size());
            } else if (this.f80652U.size() == 3) {
                bnl0.m105525M0(this.f80685y, true);
                final Action action3 = this.f80652U.get(1);
                final Action action4 = this.f80652U.get(2);
                this.f80633B.setText(action3.value);
                m108574l0(action3, this.f80686z, this.f80632A);
                bnl0.m105509E0(this.f80685y, new View.OnClickListener() { // from class: l.va0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f183060a.m108565c0(action3, view);
                    }
                });
                this.f80637F.setText(action4.value);
                m108574l0(action4, this.f80635D, this.f80636E);
                bnl0.m105509E0(this.f80634C, new View.OnClickListener() { // from class: l.wa0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f188077a.m108566d0(action4, view);
                    }
                });
            }
            m108568f0(this.f80652U.size());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m108578p0(int i) {
        this.f80643L = i;
        Media media = this.f80645N.get(i);
        if (this.f80666f.getVisibility() == 0) {
            this.f80666f.setSelectedIndex(i);
        }
        if (media instanceof Video) {
            m108580r0(media);
        } else {
            m108579q0(media);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m108579q0(Media media) {
        this.f80660b.setVisibility(0);
        this.f80658a.setVisibility(4);
        this.f80658a.f29231f.setVisibility(4);
        this.f80658a.f29230e.m224544i(false);
        this.f80667g.setVisibility(0);
        uqb0.f180374G.m127117M0(this.f80667g, CoreModule.m30933P().m143405a().mo34430Ub(media), new C16218a());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m108580r0(final Media media) {
        this.f80660b.setVisibility(4);
        this.f80662c.setVisibility(4);
        this.f80662c.setOnClickListener(new View.OnClickListener() { // from class: l.za0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203530a.m108567e0(media, view);
            }
        });
        this.f80658a.setVisibility(0);
        this.f80658a.f29231f.setVisibility(0);
        this.f80667g.setVisibility(4);
        uqb0.f180374G.m127117M0(this.f80658a.f29231f, CoreModule.m30933P().m143405a().mo34289Al(media), new C16219b(media));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m108581s0() {
        if (TextUtils.equals(this.f80642K.contentType, "omsCard")) {
            OmsCard omsCard = this.f80642K.content.omsCard;
            if (TextUtils.isEmpty(omsCard.action.deeplink)) {
                return;
            }
            if (pf7.m172092g() && this.f80642K.identifier.contains("guideNewUserCompleteMaterial")) {
                CoreModule.m30933P().m143405a().mo34604ug(this.f80656Y.mo37761q1(), Uri.parse(omsCard.action.deeplink + "&from=app_suggest_card"));
            } else {
                StringBuilder sb = new StringBuilder(omsCard.action.deeplink);
                if (CoreModule.m30933P().m143410g().mo36038Wa() && this.f80642K.identifier.contains("blindbox")) {
                    sb.append("&from=youth_vip");
                }
                CoreModule.m30933P().m143405a().mo34604ug(this.f80656Y.mo37761q1(), Uri.parse(sb.toString()));
            }
            CoreModule.f18264c.f20405m0.f20144c2.add("e_oms_card");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final String m108582t0(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }

    /* JADX INFO: renamed from: u0 */
    public final String m108583u0(String str) {
        return TextUtils.equals(str, InterestLevel.to_watch) ? "wish" : str;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m108584v0(View view, int i) {
        m108543G(view, i);
        m108571i0();
        m108577o0();
        m108576n0();
        bnl0.m105564k0(this.f80664d);
    }

    /* JADX INFO: renamed from: l.cb0$c */
    public class C16220c implements Animator.AnimatorListener {
        public C16220c() {
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

    /* JADX INFO: renamed from: l.cb0$d */
    public class C16221d implements Animator.AnimatorListener {
        public C16221d() {
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

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
