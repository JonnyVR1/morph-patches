package p149l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class abi {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f68670a;

    /* JADX INFO: renamed from: b */
    public static boolean f68671b;

    /* JADX INFO: renamed from: c */
    public static LinkedList<User> f68672c;

    /* JADX INFO: renamed from: d */
    public static User f68673d;

    /* JADX INFO: renamed from: e */
    public static long f68674e;

    /* JADX INFO: renamed from: f */
    public static ConstraintLayout f68675f;

    /* JADX INFO: renamed from: g */
    public static VDraweeView f68676g;

    /* JADX INFO: renamed from: h */
    public static VDraweeView f68677h;

    /* JADX INFO: renamed from: i */
    public static VDraweeView f68678i;

    /* JADX INFO: renamed from: j */
    public static TextView f68679j;

    /* JADX INFO: renamed from: k */
    public static TextView f68680k;

    /* JADX INFO: renamed from: l */
    public static FrameLayout f68681l;

    /* JADX INFO: renamed from: m */
    public static ImageView f68682m;

    /* JADX INFO: renamed from: n */
    public static ImageView f68683n;

    /* JADX INFO: renamed from: o */
    public static View f68684o;

    /* JADX INFO: renamed from: p */
    public static SVGAnimationView f68685p;

    /* JADX INFO: renamed from: q */
    public static GestureDetector f68686q;

    /* JADX INFO: renamed from: r */
    public static long f68687r;

    /* JADX INFO: renamed from: s */
    public static Runnable f68688s = new Runnable() { // from class: l.uai
        @Override // java.lang.Runnable
        public final void run() {
            abi.m95626a();
        }
    };

    /* JADX INFO: renamed from: l.abi$b */
    public class ViewOnTouchListenerC15570b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (abi.f68686q != null) {
                return abi.f68686q.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m95613A() {
        e51.m114745J(f68688s);
        Animator animatorM103744q = bt0.m103744q(f68670a.getContentView(), "translationY", 0.0f, -t100.m186890d(150.0f));
        animatorM103744q.setDuration(200L);
        animatorM103744q.setInterpolator(new AccelerateInterpolator());
        animatorM103744q.addListener(new C15571c(animatorM103744q));
        animatorM103744q.start();
    }

    /* JADX INFO: renamed from: B */
    public static int m95614B() {
        return f6c0.f95674Z7;
    }

    /* JADX INFO: renamed from: C */
    public static void m95615C(Act act) {
        if (NullChecker.m81303a(f68673d)) {
            act.startActivity(MessagesAct.m48944k2(act, f68673d.f56011id, false, false, 2));
            zvf0.m220396r("e_female_match_toast_hide", "p_suggest_users_home_view");
        }
        if (NullChecker.m81303a(f68688s)) {
            e51.m114745J(f68688s);
            f68688s.run();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m95616D() {
        return f68675f == null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m95617E() {
        return NullChecker.m81303a(f68670a) && f68670a.isShowing();
    }

    /* JADX INFO: renamed from: F */
    public static void m95618F(final User user, final Act act) {
        if (m95616D()) {
            return;
        }
        m95621I(user, act);
        f68678i.setTranslationX(-t100.m186890d(10.0f));
        SVGALoader.with(act).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(f68685p);
        e51.m114748M(new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                abi.m95628c(user);
            }
        });
        f68673d = user;
        e51.m114743H(act, new Runnable() { // from class: l.zai
            @Override // java.lang.Runnable
            public final void run() {
                abi.m95649x(act);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: G */
    public static void m95619G() {
        if (m95616D()) {
            return;
        }
        wqf0 wqf0Var = new wqf0(0.5f);
        VDraweeView vDraweeView = f68676g;
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vDraweeView, property, 200L, 1500L, wqf0Var, -t100.m186890d(30.0f), t100.m186890d(10.0f));
        Animator animatorM103739l2 = bt0.m103739l(f68677h, property, 200L, 1500L, wqf0Var, t100.m186890d(30.0f), -t100.m186890d(10.0f));
        animatorM103739l.addListener(new C15572d());
        VDraweeView vDraweeView2 = f68676g;
        Property property2 = View.ALPHA;
        bt0.m103753z(animatorM103739l, animatorM103739l2, bt0.m103739l(vDraweeView2, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f), bt0.m103739l(f68677h, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: H */
    public static void m95620H(final Act act, User user, int i, boolean z) {
        if (f68686q == null) {
            f68686q = new GestureDetector(act, new GestureDetectorOnGestureListenerC15569a(act));
        }
        PopupWindow popupWindow = f68670a;
        if (popupWindow == null || !popupWindow.isShowing() || z) {
            jci.m140936l(true);
            e51.m114745J(f68688s);
            if (f68670a == null) {
                f68674e = SystemClock.elapsedRealtime();
                zvf0.m220402x("e_female_match_toast_hide", "p_suggest_users_home_view");
                PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(m95614B(), (ViewGroup) null), xdl0.m208412y0(), t100.m186890d(190.0f), false);
                f68670a = popupWindow2;
                ConstraintLayout constraintLayout = (ConstraintLayout) popupWindow2.getContentView().findViewById(u4c0.f174372n0);
                f68675f = constraintLayout;
                constraintLayout.setClickable(true);
                f68675f.setOnTouchListener(new ViewOnTouchListenerC15570b());
                f68670a.setClippingEnabled(false);
                f68676g = (VDraweeView) f68670a.getContentView().findViewById(u4c0.f174111X7);
                f68677h = (VDraweeView) f68670a.getContentView().findViewById(u4c0.f174127Y7);
                f68678i = (VDraweeView) f68670a.getContentView().findViewById(u4c0.f174143Z7);
                f68679j = (TextView) f68670a.getContentView().findViewById(u4c0.f174160a8);
                f68680k = (TextView) f68670a.getContentView().findViewById(u4c0.f174095W7);
                f68685p = (SVGAnimationView) f68670a.getContentView().findViewById(u4c0.f174470sd);
                f68681l = (FrameLayout) f68670a.getContentView().findViewById(u4c0.f173879J9);
                f68682m = (ImageView) f68670a.getContentView().findViewById(u4c0.f173913L9);
                f68683n = (ImageView) f68670a.getContentView().findViewById(u4c0.f173896K9);
                f68684o = f68670a.getContentView().findViewById(u4c0.f174144Z8);
            }
            f68679j.setTypeface(eqh0.m117752c(3), 1);
            if (f68670a.isShowing()) {
                if (f68672c == null) {
                    f68672c = new LinkedList<>();
                }
                f68672c.add(user);
                return;
            }
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? act.getApplicationContext().getResources().getDimensionPixelSize(identifier) : 0;
            xdl0.m208345M0(f68670a.getContentView(), true);
            if (Build.VERSION.SDK_INT > 34) {
                f68670a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdl0.m208331F0() - t100.m186890d(60.0f));
            } else {
                f68670a.showAtLocation(act.getWindow().getDecorView(), 49, 0, -dimensionPixelSize);
            }
            m95621I(user, act);
            f68673d = user;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f68675f, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(f68675f, "translationY", -t100.m186890d(192.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(500L);
            animatorSet.start();
            m95619G();
            if (z) {
                e51.m114743H(act, new Runnable() { // from class: l.wai
                    @Override // java.lang.Runnable
                    public final void run() {
                        abi.m95649x(act);
                    }
                }, 3800L);
            } else {
                e51.m114743H(act, new Runnable() { // from class: l.xai
                    @Override // java.lang.Runnable
                    public final void run() {
                        abi.m95650y(false);
                    }
                }, 4000L);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m95621I(User user, Act act) {
        if (TextUtils.isEmpty(user.name)) {
            return;
        }
        String strConcat = user.name;
        if (strConcat.length() > 5) {
            strConcat = user.name.substring(0, 5).concat("...");
        }
        f68680k.setText(strConcat + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f17764Gh));
    }

    /* JADX INFO: renamed from: J */
    public static void m95622J(Act act, User user) {
        m95623K(act, user, 0);
    }

    /* JADX INFO: renamed from: K */
    public static void m95623K(Act act, User user, int i) {
        m95624L(act, user, i, false);
    }

    /* JADX INFO: renamed from: L */
    public static void m95624L(final Act act, final User user, final int i, final boolean z) {
        if (upa.m194791n3()) {
            aci.m95751b0(act, user, false, "");
            return;
        }
        if (!NullChecker.m81303a(act) || zch0.m218024a().m218028e()) {
            return;
        }
        View decorView = act.getWindow().getDecorView();
        if (NullChecker.m81303a(decorView)) {
            decorView.post(new Runnable() { // from class: l.vai
                @Override // java.lang.Runnable
                public final void run() {
                    abi.m95620H(act, user, i, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m95625M(Picture.ImageUri imageUri) {
        if (System.currentTimeMillis() - f68687r >= 500 && !m95616D()) {
            f68687r = System.currentTimeMillis();
            f68678i.setVisibility(0);
            qib0.f154691G.m102327J0(f68678i, imageUri, false);
            VDraweeView vDraweeView = f68677h;
            Property property = View.TRANSLATION_Y;
            Animator animatorM103753z = bt0.m103753z(bt0.m103739l(vDraweeView, property, 0L, 500L, new DecelerateInterpolator(), 0.0f, t100.m186890d(60.0f)), bt0.m103739l(f68678i, property, 0L, 500L, new DecelerateInterpolator(), -t100.m186890d(60.0f), 0.0f));
            animatorM103753z.addListener(new C15573e());
            animatorM103753z.start();
            VDraweeView vDraweeView2 = f68677h;
            Property property2 = View.ALPHA;
            bt0.m103753z(bt0.m103739l(vDraweeView2, property2, 0L, 200L, new DecelerateInterpolator(), 1.0f, 0.0f), bt0.m103739l(f68678i, property2, 0L, 200L, new DecelerateInterpolator(), 0.0f, 1.0f)).start();
            f68675f.bringChildToFront(f68677h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m95626a() {
        if (f68670a != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(f68675f.getContext(), rzb0.f161634f);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC15574f());
            f68675f.startAnimation(animationLoadAnimation);
        }
        f68672c = null;
        f68673d = null;
        f68671b = false;
        f68686q = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m95628c(User user) {
        User userPeek = vwb.m200296J(f68672c) ? null : f68672c.peek();
        if (userPeek != null) {
            qib0.f154691G.m102377x0(userPeek.m60124fp().profileSmall().formatted());
        }
        m95625M(user.m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: x */
    public static void m95649x(Act act) {
        PopupWindow popupWindow = f68670a;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.m200296J(f68672c)) {
            m95650y(false);
        } else {
            m95618F(f68672c.pop(), act);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m95650y(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f68674e >= 3800) {
            e51.m114745J(f68688s);
            f68688s.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m95651z() {
        f68675f = null;
        f68676g = null;
        f68677h = null;
        f68678i = null;
        f68679j = null;
        f68680k = null;
        f68685p = null;
        f68681l = null;
        f68682m = null;
        f68683n = null;
        f68684o = null;
    }

    /* JADX INFO: renamed from: l.abi$a */
    public class GestureDetectorOnGestureListenerC15569a implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f68689a;

        public GestureDetectorOnGestureListenerC15569a(Act act) {
            this.f68689a = act;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (abi.f68671b) {
                return false;
            }
            abi.f68671b = true;
            if (f2 > 0.0f) {
                abi.m95613A();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            abi.m95615C(this.f68689a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (abi.f68671b) {
                return false;
            }
            abi.f68671b = true;
            abi.m95615C(this.f68689a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: renamed from: l.abi$c */
    public class C15571c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f68690a;

        public C15571c(Animator animator) {
            this.f68690a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator animator2 = this.f68690a;
            if (animator2 != null) {
                animator2.removeAllListeners();
                this.f68690a.removeAllListeners();
            }
            if (abi.f68688s != null) {
                abi.f68688s.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.abi$d */
    public class C15572d implements Animator.AnimatorListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m95652a() {
            if (abi.m95616D()) {
                return;
            }
            Conversation conversationM32856Xe = NullChecker.m81303a(abi.f68673d) ? CoreModule.f17545c.f19642f0.m32856Xe(abi.f68673d.f56011id) : null;
            if (CoreModule.f17545c.f19639e0.m169527p9() != null && CoreModule.f17545c.f19639e0.m169527p9().m60124fp() != null && CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle() != null) {
                if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
                    qib0.f154691G.m102335N0(abi.f68676g, CoreModule.f17545c.f19639e0.m169527p9().getAnonymousUrl(), false);
                } else {
                    qib0.f154691G.m102327J0(abi.f68676g, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle(), false);
                }
            }
            if (abi.f68673d == null || abi.f68673d.m60124fp() == null || abi.f68673d.m60124fp().profileMiddle() == null) {
                return;
            }
            if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isAnonymous()) {
                qib0.f154691G.m102335N0(abi.f68677h, abi.f68673d.getAnonymousUrl(), false);
            } else {
                qib0.f154691G.m102327J0(abi.f68677h, abi.f68673d.m60124fp().profileMiddle(), false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (abi.m95616D()) {
                return;
            }
            abi.f68681l.setVisibility(8);
            abi.f68684o.setVisibility(8);
            SVGALoader.with(abi.f68685p.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(abi.f68685p);
            e51.m114748M(new Runnable() { // from class: l.bbi
                @Override // java.lang.Runnable
                public final void run() {
                    abi.C15572d.m95652a();
                }
            });
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
    }

    /* JADX INFO: renamed from: l.abi$e */
    public class C15573e implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (abi.m95616D()) {
                return;
            }
            VDraweeView vDraweeView = abi.f68677h;
            abi.f68677h = abi.f68678i;
            abi.f68678i = vDraweeView;
            abi.f68678i.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (abi.m95616D()) {
                return;
            }
            abi.f68681l.setVisibility(8);
            abi.f68684o.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.abi$f */
    public class AnimationAnimationListenerC15574f implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (abi.f68670a == null || !abi.f68670a.isShowing()) {
                return;
            }
            abi.f68670a.dismiss();
            abi.f68670a = null;
            abi.m95651z();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
