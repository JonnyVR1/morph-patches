package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.InterestLevel;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.advertisingcard.AdvertisPlayVideoView;
import com.p046p1.mobile.putong.data.Action;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OmsCard;
import com.p046p1.mobile.putong.data.OmsCardLiterature;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class gb0 implements ool0 {

    /* JADX INFO: renamed from: A */
    public ImageView f101725A;

    /* JADX INFO: renamed from: B */
    public TextView f101726B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f101727C;

    /* JADX INFO: renamed from: D */
    public ImageView f101728D;

    /* JADX INFO: renamed from: E */
    public ImageView f101729E;

    /* JADX INFO: renamed from: F */
    public TextView f101730F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f101731G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f101732H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f101733I;

    /* JADX INFO: renamed from: J */
    public TextView f101734J;

    /* JADX INFO: renamed from: K */
    public OMSAdCardInfo f101735K;

    /* JADX INFO: renamed from: M */
    public String f101737M;

    /* JADX INFO: renamed from: N */
    public List<Media> f101738N;

    /* JADX INFO: renamed from: P */
    public String f101740P;

    /* JADX INFO: renamed from: Q */
    public String f101741Q;

    /* JADX INFO: renamed from: R */
    public String f101742R;

    /* JADX INFO: renamed from: S */
    public List<String> f101743S;

    /* JADX INFO: renamed from: T */
    public List<String> f101744T;

    /* JADX INFO: renamed from: U */
    public List<Action> f101745U;

    /* JADX INFO: renamed from: V */
    public String f101746V;

    /* JADX INFO: renamed from: W */
    public String f101747W;

    /* JADX INFO: renamed from: Y */
    public eyl f101749Y;

    /* JADX INFO: renamed from: a */
    public AdvertisPlayVideoView f101751a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f101753b;

    /* JADX INFO: renamed from: c */
    public ImageButton f101755c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f101757d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f101758e;

    /* JADX INFO: renamed from: f */
    public NewPictureContainerIndicator f101759f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f101760g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f101761h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f101762i;

    /* JADX INFO: renamed from: j */
    public TextView f101763j;

    /* JADX INFO: renamed from: k */
    public TextView f101764k;

    /* JADX INFO: renamed from: l */
    public TextView f101765l;

    /* JADX INFO: renamed from: m */
    public TextView f101766m;

    /* JADX INFO: renamed from: n */
    public TextView f101767n;

    /* JADX INFO: renamed from: o */
    public View f101768o;

    /* JADX INFO: renamed from: p */
    public View f101769p;

    /* JADX INFO: renamed from: q */
    public View f101770q;

    /* JADX INFO: renamed from: r */
    public TextView f101771r;

    /* JADX INFO: renamed from: s */
    public TextView f101772s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f101773t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f101774u;

    /* JADX INFO: renamed from: v */
    public ImageView f101775v;

    /* JADX INFO: renamed from: w */
    public ImageView f101776w;

    /* JADX INFO: renamed from: x */
    public TextView f101777x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f101778y;

    /* JADX INFO: renamed from: z */
    public ImageView f101779z;

    /* JADX INFO: renamed from: L */
    public int f101736L = 0;

    /* JADX INFO: renamed from: O */
    public String f101739O = Constants.BLACK;

    /* JADX INFO: renamed from: X */
    public boolean f101748X = false;

    /* JADX INFO: renamed from: Z */
    public long f101750Z = 0;

    /* JADX INFO: renamed from: a0 */
    public Boolean f101752a0 = Boolean.FALSE;

    /* JADX INFO: renamed from: b0 */
    public boolean f101754b0 = false;

    /* JADX INFO: renamed from: c0 */
    public e30<SwipeDirection> f101756c0 = new e30() { // from class: l.la0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f127155a.m125082R((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: l.gb0$a */
    public class C17030a extends ym2 {
        public C17030a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            gb0.this.f101753b.setVisibility(4);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: f */
        public void mo102386f(String str) {
            super.mo102386f(str);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            gb0.this.f101753b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.gb0$b */
    public class C17031b extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Media f101781a;

        public C17031b(Media media) {
            this.f101781a = media;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
            gb0.this.f101753b.setVisibility(4);
            if (this.f101781a instanceof Video) {
                gb0.this.f101755c.setVisibility(4);
            }
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: f */
        public void mo102386f(String str) {
            super.mo102386f(str);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            gb0.this.f101753b.setVisibility(4);
            gb0.this.f101755c.setVisibility(0);
            gb0.this.f101751a.f28382e.m223298i(false);
            gb0.this.f101751a.f28382e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: l.gb0$e */
    public static /* synthetic */ class C17034e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101785a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f101785a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101785a[SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101785a[SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gb0(eyl eylVar) {
        this.f101749Y = eylVar;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m125064t(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        gradientDrawable.setColor(iIntValue);
        gradientDrawable2.setColor(iIntValue);
        gradientDrawable3.setColor(iIntValue);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m125066v(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = t100.f167252a;
        gradientDrawable.setStroke(i, iIntValue);
        gradientDrawable2.setStroke(i, iIntValue);
        gradientDrawable3.setStroke(i, iIntValue);
    }

    /* JADX INFO: renamed from: G */
    public void m125071G(View view, int i) {
        if (i == 0) {
            if (TextUtils.equals(this.f101735K.contentType, "omsCard")) {
                this.f101749Y.mo36739I();
                view.postDelayed(new Runnable() { // from class: l.eb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f90281a.m125078N();
                    }
                }, 1000L);
            } else if (TextUtils.equals(this.f101735K.contentType, "omsCardLiterature")) {
                this.f101749Y.mo36742O3();
                view.postDelayed(new Runnable() { // from class: l.fb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f96686a.m125079O();
                    }
                }, 1000L);
            }
            ic50.m135327j().m135333f().m145239Z(this.f101735K.identifier, 0, false);
            if (NullChecker.m81303a(this.f101735K)) {
                jb0.m140733k(this.f101735K);
            }
            if (TextUtils.equals(this.f101735K.contentType, "omsCard")) {
                zvf0.m220368A("e_oms_card", "p_suggest_users_home_view", vwb.m200311Y("card_name", this.f101737M));
            } else if (TextUtils.equals(this.f101735K.contentType, "omsCardLiterature")) {
                zvf0.m220368A("e_artwork_card", "p_suggest_users_home_view", vwb.m200311Y("artwork_title", this.f101740P), vwb.m200311Y("artwork_type", m125110t0(this.f101747W)));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m125072H() {
        this.f101756c0.call(SwipeDirection.RIGHT);
        zvf0.m220399u("e_oms_card", "p_suggest_users_home_view", vwb.m200311Y("card_name", this.f101737M));
        CoreModule.f17545c.f19663m0.f19402c2.add("e_oms_card");
    }

    /* JADX INFO: renamed from: I */
    public final void m125073I() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.f167260i);
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
                gradientDrawable.setStroke(t100.f167252a, ((Integer) valueAnimatorOfInt2.getAnimatedValue()).intValue());
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(500L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ra0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f158465a.m125080P(valueAnimatorOfInt3, gradientDrawable, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C17032c());
    }

    /* JADX INFO: renamed from: J */
    public final void m125074J() {
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = t100.f167261j;
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
                gb0.m125064t(valueAnimatorOfInt, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1308622847, 16777215);
        valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.na0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gb0.m125066v(valueAnimatorOfInt2, gradientDrawable, gradientDrawable2, gradientDrawable3, valueAnimator);
            }
        });
        final ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(-2130706433, -452984832);
        valueAnimatorOfInt3.setEvaluator(new ArgbEvaluator());
        valueAnimatorOfInt3.setDuration(800L);
        valueAnimatorOfInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.oa0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f142762a.m125081Q(valueAnimatorOfInt3, gradientDrawable3, gradientDrawable, gradientDrawable2, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
        valueAnimatorOfInt3.start();
        valueAnimatorOfInt3.addListener(new C17033d());
        if (NullChecker.m81303a(this.f101745U) && this.f101745U.size() == 3) {
            this.f101725A.setVisibility(0);
        } else {
            this.f101725A.setVisibility(8);
        }
        this.f101776w.setVisibility(0);
        this.f101729E.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        if (NullChecker.m81303a(this.f101745U) && this.f101745U.size() == 3) {
            this.f101725A.startAnimation(alphaAnimation);
        }
        this.f101776w.startAnimation(alphaAnimation);
        this.f101729E.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(800L);
        if (NullChecker.m81303a(this.f101745U) && this.f101745U.size() == 3) {
            this.f101779z.startAnimation(alphaAnimation2);
        }
        this.f101775v.startAnimation(alphaAnimation2);
        this.f101728D.startAnimation(alphaAnimation2);
    }

    /* JADX INFO: renamed from: K */
    public final void m125075K(View view) {
        this.f101757d = (FrameLayout) view.findViewById(w4c0.f184508O);
        this.f101759f = (NewPictureContainerIndicator) view.findViewById(w4c0.f184500G);
        this.f101732H = (LinearLayout) view.findViewById(w4c0.f184522b);
        this.f101760g = (VDraweeView) view.findViewById(w4c0.f184531j);
        this.f101751a = (AdvertisPlayVideoView) view.findViewById(w4c0.f184516W);
        this.f101758e = (RelativeLayout) view.findViewById(w4c0.f184524c);
        this.f101761h = (VDraweeView) view.findViewById(w4c0.f184527f);
        this.f101762i = (VDraweeView) view.findViewById(w4c0.f184528g);
        this.f101766m = (TextView) view.findViewById(w4c0.f184532k);
        this.f101767n = (TextView) view.findViewById(w4c0.f184526e);
        this.f101771r = (TextView) view.findViewById(w4c0.f184520a);
        this.f101763j = (TextView) view.findViewById(w4c0.f184511R);
        this.f101764k = (TextView) view.findViewById(w4c0.f184512S);
        this.f101765l = (TextView) view.findViewById(w4c0.f184513T);
        this.f101768o = view.findViewById(w4c0.f184519Z);
        this.f101769p = view.findViewById(w4c0.f184518Y);
        this.f101770q = view.findViewById(w4c0.f184494A);
        this.f101731G = (LinearLayout) view.findViewById(w4c0.f184495B);
        this.f101755c = this.f101751a.f28384g;
        this.f101753b = (VProgressBar) view.findViewById(w4c0.f184530i);
        this.f101772s = (TextView) view.findViewById(w4c0.f184525d);
        this.f101773t = (LinearLayout) view.findViewById(w4c0.f184542u);
        this.f101774u = (LinearLayout) view.findViewById(w4c0.f184533l);
        this.f101775v = (ImageView) view.findViewById(w4c0.f184539r);
        this.f101776w = (ImageView) view.findViewById(w4c0.f184536o);
        this.f101777x = (TextView) view.findViewById(w4c0.f184545x);
        this.f101778y = (LinearLayout) view.findViewById(w4c0.f184534m);
        this.f101779z = (ImageView) view.findViewById(w4c0.f184540s);
        this.f101725A = (ImageView) view.findViewById(w4c0.f184537p);
        this.f101726B = (TextView) view.findViewById(w4c0.f184546y);
        this.f101727C = (LinearLayout) view.findViewById(w4c0.f184535n);
        this.f101728D = (ImageView) view.findViewById(w4c0.f184541t);
        this.f101729E = (ImageView) view.findViewById(w4c0.f184538q);
        this.f101730F = (TextView) view.findViewById(w4c0.f184547z);
        this.f101733I = (LinearLayout) view.findViewById(w4c0.f184510Q);
        this.f101734J = (TextView) view.findViewById(w4c0.f184514U);
    }

    /* JADX INFO: renamed from: L */
    public OMSAdCardInfo m125076L(int i) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (vwb.m200296J(partialListOptM221515e.loaded)) {
            return null;
        }
        CoreSuggested.UserInfo userInfo = partialListOptM221515e.loaded.get(i);
        if (!NullChecker.m81303a(userInfo)) {
            return null;
        }
        Object obj = userInfo.extensionObject;
        if (!(obj instanceof OMSAdCardInfo)) {
            return null;
        }
        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj;
        this.f101735K = oMSAdCardInfo;
        this.f101737M = oMSAdCardInfo.identifier;
        this.f101752a0 = Boolean.valueOf(oMSAdCardInfo.showCartoon);
        boolean zEquals = TextUtils.equals(this.f101735K.contentType, "omsCard");
        OMSAdCardInfo oMSAdCardInfo2 = this.f101735K;
        if (zEquals) {
            OmsCard omsCard = oMSAdCardInfo2.content.omsCard;
            this.f101738N = omsCard.pictures;
            this.f101739O = omsCard.color;
            this.f101740P = omsCard.title;
            this.f101742R = omsCard.description;
            this.f101743S = omsCard.icons;
            this.f101744T = omsCard.topLeftTags;
        } else if (TextUtils.equals(oMSAdCardInfo2.contentType, "omsCardLiterature")) {
            OmsCardLiterature omsCardLiterature = this.f101735K.content.omsCardLiterature;
            this.f101738N = omsCardLiterature.pictures;
            this.f101739O = omsCardLiterature.color;
            this.f101740P = omsCardLiterature.name;
            this.f101741Q = omsCardLiterature.introduction;
            this.f101742R = omsCardLiterature.guidance;
            this.f101743S = omsCardLiterature.icons;
            this.f101744T = omsCardLiterature.topLeftTags;
            this.f101745U = omsCardLiterature.buttons;
            this.f101746V = omsCardLiterature.literatureID;
            this.f101747W = omsCardLiterature.type;
        }
        try {
            Color.parseColor(this.f101739O);
        } catch (Exception e) {
            this.f101739O = Constants.BLACK;
            CrashHelper.m81296c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
        }
        return this.f101735K;
    }

    /* JADX INFO: renamed from: M */
    public final float m125077M(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m125078N() {
        if (this.f101748X) {
            return;
        }
        this.f101748X = true;
        m125073I();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m125079O() {
        if (this.f101748X) {
            return;
        }
        this.f101748X = true;
        m125074J();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m125080P(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, ValueAnimator valueAnimator2) {
        this.f101771r.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f101771r.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m125081Q(ValueAnimator valueAnimator, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, ValueAnimator valueAnimator2) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (NullChecker.m81303a(this.f101745U) && this.f101745U.size() == 3) {
            this.f101778y.setBackground(gradientDrawable);
            this.f101726B.setTextColor(iIntValue);
        }
        this.f101774u.setBackground(gradientDrawable2);
        this.f101727C.setBackground(gradientDrawable3);
        this.f101777x.setTextColor(iIntValue);
        this.f101730F.setTextColor(iIntValue);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m125082R(SwipeDirection swipeDirection) {
        this.f101749Y.mo36746V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ C22306c m125083S(Action action, LiteraturesComments literaturesComments) {
        if (literaturesComments == null) {
            return CoreModule.f17545c.f19682s1.m34373w3(this.f101746V, action.f38719id);
        }
        j760 j760VarM200311Y = vwb.m200311Y(action.f38719id, "patch");
        return CoreModule.f17545c.f19682s1.m34366n3(this.f101746V, literaturesComments.f20434id, (String) j760VarM200311Y.f116564a, (String) j760VarM200311Y.f116565b);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m125084T(Boolean bool) {
        this.f101749Y.mo36763v0();
        if (bool.booleanValue()) {
            this.f101756c0.call(SwipeDirection.RIGHT);
            CoreModule.f17545c.f19663m0.f19402c2.add("e_artwork_card");
            osi0.m165783g("已添加");
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m125085U(Throwable th) {
        osi0.m165783g("保存失败，请再试一次");
        this.f101749Y.mo36763v0();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m125086V(View view) {
        int i = this.f101736L;
        if (i > 0) {
            m125106p0(i - 1);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m125087W(View view) {
        if (!NullChecker.m81303a(this.f101738N) || this.f101736L >= this.f101738N.size() - 1) {
            return;
        }
        m125106p0(this.f101736L + 1);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m125088X(Boolean bool) {
        this.f101749Y.mo36763v0();
        if (bool.booleanValue()) {
            this.f101756c0.call(SwipeDirection.RIGHT);
            osi0.m165783g("已添加");
            CoreModule.f17545c.f19663m0.f19402c2.add("e_artwork_card");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m125089Y(Throwable th) {
        osi0.m165783g("保存失败，请再试一次");
        this.f101749Y.mo36763v0();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m125090Z(View view) {
        m125072H();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m125091a0(Action action, View view) {
        m125098h0(action);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m125092b0(Action action, View view) {
        m125098h0(action);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m125093c0(Action action, View view) {
        m125098h0(action);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111706a, viewGroup, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m125094d0(Action action, View view) {
        m125098h0(action);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        OMSAdCardInfo oMSAdCardInfoM125076L = m125076L(i);
        if (NullChecker.m81303a(oMSAdCardInfoM125076L)) {
            m125075K(view);
            m125112v0(view, i);
            if (i == 0 && "omsCard".equals(oMSAdCardInfoM125076L.contentType)) {
                this.f101749Y.mo36742O3();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m125095e0(Media media, View view) {
        if (media instanceof Video) {
            this.f101751a.m44262k(media.url, m125077M((Video) media));
            this.f101751a.setVisibility(0);
            this.f101751a.f28383f.setVisibility(4);
            this.f101755c.setVisibility(4);
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m125096f0(int i) {
        int color;
        try {
            color = Color.parseColor(this.f101739O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f101739O);
        }
        int color2 = Color.parseColor(this.f101739O);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(t100.f167266o);
        gradientDrawable.setColor(color2);
        gradientDrawable.setStroke(t100.f167258g, Color.parseColor("#00000000"));
        this.f101757d.setPadding(0, 0, 0, 0);
        this.f101757d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        int i2 = t100.f167261j;
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        gradientDrawable2.setGradientType(0);
        this.f101732H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(t100.f167260i);
        if (this.f101748X) {
            gradientDrawable3.setColor(CoreModule.f17544b.getResources().getColor(y0c0.f195301m));
            gradientDrawable3.setStroke(t100.f167252a, CoreModule.f17544b.getResources().getColor(y0c0.f195300l));
            if (i == 2) {
                this.f101774u.setBackground(gradientDrawable3);
                this.f101727C.setBackground(gradientDrawable3);
                this.f101777x.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195299k));
                this.f101730F.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195299k));
                this.f101779z.setVisibility(8);
                this.f101725A.setVisibility(8);
            } else if (i == 3) {
                this.f101774u.setBackground(gradientDrawable3);
                this.f101778y.setBackground(gradientDrawable3);
                this.f101727C.setBackground(gradientDrawable3);
                this.f101777x.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195299k));
                this.f101726B.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195299k));
                this.f101730F.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195299k));
                this.f101779z.setVisibility(8);
                this.f101725A.setVisibility(0);
            }
            this.f101775v.setVisibility(8);
            this.f101776w.setVisibility(0);
            this.f101728D.setVisibility(8);
            this.f101729E.setVisibility(0);
            return;
        }
        gradientDrawable3.setColor(CoreModule.f17544b.getResources().getColor(y0c0.f195300l));
        gradientDrawable3.setStroke(t100.f167252a, CoreModule.f17544b.getResources().getColor(y0c0.f195295g));
        if (i == 2) {
            this.f101774u.setBackground(gradientDrawable3);
            this.f101727C.setBackground(gradientDrawable3);
            this.f101777x.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195297i));
            this.f101730F.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195297i));
            this.f101779z.setVisibility(8);
            this.f101725A.setVisibility(8);
        } else if (i == 3) {
            this.f101774u.setBackground(gradientDrawable3);
            this.f101778y.setBackground(gradientDrawable3);
            this.f101727C.setBackground(gradientDrawable3);
            this.f101777x.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195297i));
            this.f101726B.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195297i));
            this.f101730F.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195297i));
            this.f101779z.setVisibility(0);
            this.f101725A.setVisibility(4);
        }
        this.f101775v.setVisibility(0);
        this.f101776w.setVisibility(4);
        this.f101728D.setVisibility(0);
        this.f101729E.setVisibility(4);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        int i = C17034e.f101785a[swipeDirection.ordinal()];
        if (i == 1) {
            osi0.m165783g("不消耗超级喜欢");
            m125109s0();
            str = "up";
        } else if (i == 2) {
            if (NullChecker.m81303a(this.f101735K)) {
                TextUtils.equals(this.f101735K.contentType, "omsCard");
            }
            str = BLiveGiftBubblePopupTitlePosition.left;
        } else if (i != 3) {
            str = "";
        } else {
            m125109s0();
            str = "right";
        }
        if (NullChecker.m81303a(this.f101735K) && TextUtils.equals(this.f101735K.contentType, "omsCard")) {
            zvf0.m220401w("e_oms_card", "p_suggest_users_home_view", vwb.m200311Y("card_name", this.f101737M), vwb.m200311Y("swipe_type", str));
        } else if (NullChecker.m81303a(this.f101735K) && TextUtils.equals(this.f101735K.contentType, "omsCardLiterature")) {
            this.f101749Y.mo36739I();
            zvf0.m220401w("e_artwork_card", "p_suggest_users_home_view", vwb.m200311Y("artwork_title", this.f101740P), vwb.m200311Y("artwork_type", this.f101747W), vwb.m200311Y("swipe_type", str));
        }
        if (NullChecker.m81303a(this.f101735K) && TextUtils.equals(this.f101735K.contentType, "omsCard")) {
            hb0.m130254a(swipeDirection, this.f101735K);
        }
        this.f101735K = null;
        this.f101736L = 0;
        this.f101748X = false;
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m125097g0() {
        int color;
        int color2 = Color.parseColor(this.f101739O);
        try {
            color = Color.parseColor(this.f101739O.replace("#", "#00"));
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("配置平台颜色格式配置错误" + e.toString()));
            color = Color.parseColor(this.f101739O);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i = t100.f167266o;
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setStroke(t100.f167258g, color2);
        gradientDrawable.setColor(color2);
        FrameLayout frameLayout = this.f101757d;
        int i2 = t100.f167257f;
        frameLayout.setPadding(i2, i2, i2, i2);
        this.f101757d.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColors(new int[]{color, color2, color2});
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
        gradientDrawable2.setGradientType(0);
        this.f101732H.setBackground(gradientDrawable2);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(t100.f167260i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f101771r.getLayoutParams();
        if (NullChecker.m81303a(layoutParams)) {
            layoutParams.height = t100.f167226A;
            layoutParams.bottomMargin = t100.f167264m;
            layoutParams.topMargin = t100.f167261j;
            this.f101771r.setLayoutParams(layoutParams);
        }
        this.f101771r.setTextSize(16.0f);
        if (this.f101748X) {
            gradientDrawable3.setColor(CoreModule.f17544b.getResources().getColor(y0c0.f195301m));
            gradientDrawable3.setStroke(t100.f167252a, CoreModule.f17544b.getResources().getColor(y0c0.f195300l));
            this.f101771r.setBackground(gradientDrawable3);
            this.f101771r.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195289a));
            return;
        }
        gradientDrawable3.setColor(CoreModule.f17544b.getResources().getColor(y0c0.f195300l));
        gradientDrawable3.setStroke(t100.f167252a, CoreModule.f17544b.getResources().getColor(y0c0.f195296h));
        this.f101771r.setBackground(gradientDrawable3);
        this.f101771r.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195298j));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m125098h0(final Action action) {
        if (action == null || !CoreModule.f17545c.f19639e0.m169446U7()) {
            return;
        }
        if (le7.m149483e()) {
            this.f101749Y.mo36764z1(C22306c.just(CoreModule.m29935P().m94651a().mo33532kh(CoreModule.m29931H().userId(), this.f101746V))).first().flatMap(new w9j() { // from class: l.sa0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f163249a.m125083S(action, (LiteraturesComments) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.ta0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169084a.m125084T((Boolean) obj);
                }
            }, new e30() { // from class: l.ua0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f175542a.m125085U((Throwable) obj);
                }
            }));
        } else {
            m125100j0(action);
        }
        zvf0.m220399u("e_artwork_card", "p_suggest_users_home_view", vwb.m200311Y("artwork_card_button_name", m125111u0(action.f38719id)), vwb.m200311Y("artwork_title", this.f101740P), vwb.m200311Y("artwork_type", m125110t0(this.f101747W)));
    }

    /* JADX INFO: renamed from: i0 */
    public final void m125099i0() {
        this.f101768o.setOnClickListener(new View.OnClickListener() { // from class: l.bb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74752a.m125086V(view);
            }
        });
        this.f101769p.setOnClickListener(new View.OnClickListener() { // from class: l.cb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80089a.m125087W(view);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m125100j0(Action action) {
        if (CoreModule.f17545c.f19639e0.m169446U7()) {
            this.f101749Y.mo36745U1(R$string.f20270b);
            this.f101749Y.mo36764z1(CoreModule.f17545c.f19682s1.m34373w3(this.f101746V, action.f38719id)).subscribe(mkd0.m154956H(new e30() { // from class: l.wa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185417a.m125088X((Boolean) obj);
                }
            }, new e30() { // from class: l.xa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191672a.m125089Y((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m125101k0(List<String> list, VDraweeView vDraweeView, VDraweeView vDraweeView2) {
        if (vwb.m200296J(list)) {
            vDraweeView.setVisibility(8);
            vDraweeView2.setVisibility(8);
        } else if (list.size() == 1) {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(8);
            qib0.f154691G.m102331L0(vDraweeView, list.get(0));
        } else {
            vDraweeView.setVisibility(0);
            vDraweeView2.setVisibility(0);
            qib0.f154691G.m102331L0(vDraweeView, list.get(0));
            qib0.f154691G.m102331L0(vDraweeView2, list.get(1));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m125102l0(Action action, ImageView imageView, ImageView imageView2) {
        if (TextUtils.equals(action.f38719id, InterestLevel.to_watch)) {
            imageView.setImageResource(z2c0.f201198f);
            imageView2.setImageResource(z2c0.f201195c);
        } else if (TextUtils.equals(action.f38719id, InterestLevel.watching)) {
            imageView.setImageResource(z2c0.f201197e);
            imageView2.setImageResource(z2c0.f201194b);
        } else if (TextUtils.equals(action.f38719id, InterestLevel.watched)) {
            imageView.setImageResource(z2c0.f201196d);
            imageView2.setImageResource(z2c0.f201193a);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m125103m0(List<String> list, TextView textView, TextView textView2, TextView textView3) {
        if (vwb.m200296J(list)) {
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
    public final void m125104n0() {
        if (TextUtils.equals(this.f101735K.contentType, "omsCard")) {
            OmsCard omsCard = this.f101735K.content.omsCard;
            boolean zIsEmpty = TextUtils.isEmpty(omsCard.action.value);
            TextView textView = this.f101771r;
            if (zIsEmpty) {
                textView.setText("");
            } else {
                textView.setText(omsCard.action.value);
            }
        }
        this.f101766m.setText(this.f101740P);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f101742R);
        TextView textView2 = this.f101767n;
        if (zIsEmpty2) {
            textView2.setText("");
            xdl0.m208344M(this.f101767n, false);
        } else {
            textView2.setText(this.f101742R);
            xdl0.m208345M0(this.f101767n, true);
        }
        m125101k0(this.f101743S, this.f101761h, this.f101762i);
        m125103m0(this.f101744T, this.f101763j, this.f101764k, this.f101765l);
        if (vwb.m200296J(this.f101738N)) {
            this.f101731G.setVisibility(8);
            this.f101759f.setVisibility(8);
            return;
        }
        int size = this.f101738N.size();
        LinearLayout linearLayout = this.f101731G;
        if (size > 1) {
            linearLayout.setVisibility(0);
            this.f101759f.setVisibility(0);
            this.f101759f.setIndicatorCount(this.f101738N.size());
        } else {
            linearLayout.setVisibility(8);
            this.f101759f.setVisibility(8);
        }
        m125106p0(this.f101736L);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m125105o0() {
        if (TextUtils.equals(this.f101735K.contentType, "omsCard")) {
            this.f101772s.setVisibility(8);
            this.f101773t.setVisibility(8);
            this.f101771r.setVisibility(0);
            m125097g0();
            this.f101771r.setOnClickListener(new View.OnClickListener() { // from class: l.ka0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122083a.m125090Z(view);
                }
            });
            CoreModule.f17545c.f19639e0.m169527p9();
            xdl0.m208344M(this.f101733I, false);
            return;
        }
        if (TextUtils.equals(this.f101735K.contentType, "omsCardLiterature")) {
            this.f101771r.setVisibility(8);
            if (!NullChecker.m81303a(this.f101745U) || this.f101745U.isEmpty() || this.f101745U.size() < 2 || this.f101745U.size() > 3) {
                xdl0.m208344M(this.f101773t, false);
                return;
            }
            xdl0.m208345M0(this.f101773t, true);
            final Action action = this.f101745U.get(0);
            this.f101777x.setText(action.value);
            m125102l0(action, this.f101775v, this.f101776w);
            xdl0.m208329E0(this.f101774u, new View.OnClickListener() { // from class: l.va0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180692a.m125091a0(action, view);
                }
            });
            xdl0.m208345M0(this.f101775v, true);
            xdl0.m208345M0(this.f101776w, false);
            boolean zIsEmpty = TextUtils.isEmpty(this.f101741Q);
            TextView textView = this.f101772s;
            if (zIsEmpty) {
                textView.setText("");
                xdl0.m208344M(this.f101772s, false);
            } else {
                textView.setText(this.f101741Q);
                xdl0.m208345M0(this.f101772s, true);
            }
            if (this.f101745U.size() == 2) {
                xdl0.m208344M(this.f101778y, false);
                final Action action2 = this.f101745U.get(1);
                this.f101730F.setText(action2.value);
                m125102l0(action2, this.f101728D, this.f101729E);
                xdl0.m208329E0(this.f101727C, new View.OnClickListener() { // from class: l.ya0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f197096a.m125092b0(action2, view);
                    }
                });
                m125096f0(this.f101745U.size());
            } else if (this.f101745U.size() == 3) {
                xdl0.m208345M0(this.f101778y, true);
                final Action action3 = this.f101745U.get(1);
                final Action action4 = this.f101745U.get(2);
                this.f101726B.setText(action3.value);
                m125102l0(action3, this.f101779z, this.f101725A);
                xdl0.m208329E0(this.f101778y, new View.OnClickListener() { // from class: l.za0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f202319a.m125093c0(action3, view);
                    }
                });
                this.f101730F.setText(action4.value);
                m125102l0(action4, this.f101728D, this.f101729E);
                xdl0.m208329E0(this.f101727C, new View.OnClickListener() { // from class: l.ab0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f68614a.m125094d0(action4, view);
                    }
                });
            }
            m125096f0(this.f101745U.size());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m125106p0(int i) {
        this.f101736L = i;
        Media media = this.f101738N.get(i);
        if (this.f101759f.getVisibility() == 0) {
            this.f101759f.setSelectedIndex(i);
        }
        if (media instanceof Video) {
            m125108r0(media);
        } else {
            m125107q0(media);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m125107q0(Media media) {
        this.f101753b.setVisibility(0);
        this.f101751a.setVisibility(4);
        this.f101751a.f28383f.setVisibility(4);
        this.f101751a.f28382e.m223298i(false);
        this.f101760g.setVisibility(0);
        qib0.f154691G.m102333M0(this.f101760g, CoreModule.m29935P().m94651a().mo33427Ub(media), new C17030a());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m125108r0(final Media media) {
        this.f101753b.setVisibility(4);
        this.f101755c.setVisibility(4);
        this.f101755c.setOnClickListener(new View.OnClickListener() { // from class: l.db0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85277a.m125095e0(media, view);
            }
        });
        this.f101751a.setVisibility(0);
        this.f101751a.f28383f.setVisibility(0);
        this.f101760g.setVisibility(4);
        qib0.f154691G.m102333M0(this.f101751a.f28383f, CoreModule.m29935P().m94651a().mo33286Al(media), new C17031b(media));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m125109s0() {
        if (TextUtils.equals(this.f101735K.contentType, "omsCard")) {
            OmsCard omsCard = this.f101735K.content.omsCard;
            if (TextUtils.isEmpty(omsCard.action.deeplink)) {
                return;
            }
            if (le7.m149485g() && this.f101735K.identifier.contains("guideNewUserCompleteMaterial")) {
                CoreModule.m29935P().m94651a().mo33601ug(this.f101749Y.mo36758q1(), Uri.parse(omsCard.action.deeplink + "&from=app_suggest_card"));
            } else {
                StringBuilder sb = new StringBuilder(omsCard.action.deeplink);
                if (CoreModule.m29935P().m94656g().mo35035Wa() && this.f101735K.identifier.contains("blindbox")) {
                    sb.append("&from=youth_vip");
                }
                CoreModule.m29935P().m94651a().mo33601ug(this.f101749Y.mo36758q1(), Uri.parse(sb.toString()));
            }
            CoreModule.f17545c.f19663m0.f19402c2.add("e_oms_card");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final String m125110t0(String str) {
        return TextUtils.equals(str, "teleplay") ? "tv_show" : str;
    }

    /* JADX INFO: renamed from: u0 */
    public final String m125111u0(String str) {
        return TextUtils.equals(str, InterestLevel.to_watch) ? "wish" : str;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m125112v0(View view, int i) {
        m125071G(view, i);
        m125099i0();
        m125105o0();
        m125104n0();
        xdl0.m208384k0(this.f101757d);
    }

    /* JADX INFO: renamed from: l.gb0$c */
    public class C17032c implements Animator.AnimatorListener {
        public C17032c() {
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
    public class C17033d implements Animator.AnimatorListener {
        public C17033d() {
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

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
