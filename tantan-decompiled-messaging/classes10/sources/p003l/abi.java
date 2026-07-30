package p003l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
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
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.DeviceType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import l.aci;
import l.bt0;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.jci;
import l.qib0;
import l.rzb0;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.xdl0;
import l.zch0;
import l.zvf0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class abi {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f2753a;

    /* JADX INFO: renamed from: b */
    public static boolean f2754b;

    /* JADX INFO: renamed from: c */
    public static LinkedList<User> f2755c;

    /* JADX INFO: renamed from: d */
    public static User f2756d;

    /* JADX INFO: renamed from: e */
    public static long f2757e;

    /* JADX INFO: renamed from: f */
    public static ConstraintLayout f2758f;

    /* JADX INFO: renamed from: g */
    public static VDraweeView f2759g;

    /* JADX INFO: renamed from: h */
    public static VDraweeView f2760h;

    /* JADX INFO: renamed from: i */
    public static VDraweeView f2761i;

    /* JADX INFO: renamed from: j */
    public static TextView f2762j;

    /* JADX INFO: renamed from: k */
    public static TextView f2763k;

    /* JADX INFO: renamed from: l */
    public static FrameLayout f2764l;

    /* JADX INFO: renamed from: m */
    public static ImageView f2765m;

    /* JADX INFO: renamed from: n */
    public static ImageView f2766n;

    /* JADX INFO: renamed from: o */
    public static View f2767o;

    /* JADX INFO: renamed from: p */
    public static SVGAnimationView f2768p;

    /* JADX INFO: renamed from: q */
    public static GestureDetector f2769q;

    /* JADX INFO: renamed from: r */
    public static long f2770r;

    /* JADX INFO: renamed from: s */
    public static Runnable f2771s = new Runnable() { // from class: l.uai
        @Override // java.lang.Runnable
        public final void run() {
            abi.m5327a();
        }
    };

    /* JADX INFO: renamed from: l.abi$b */
    public class ViewOnTouchListenerC3280b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (abi.f2769q != null) {
                return abi.f2769q.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m5314A() {
        e51.J(f2771s);
        Animator animatorQ = bt0.q(f2753a.getContentView(), "translationY", new float[]{0.0f, -t100.d(150.0f)});
        animatorQ.setDuration(200L);
        animatorQ.setInterpolator(new AccelerateInterpolator());
        animatorQ.addListener(new C3281c(animatorQ));
        animatorQ.start();
    }

    /* JADX INFO: renamed from: B */
    public static int m5315B() {
        return f6c0.Z7;
    }

    /* JADX INFO: renamed from: C */
    public static void m5316C(Act act) {
        if (NullChecker.a(f2756d)) {
            act.startActivity(MessagesAct.k2(act, ((DbObject) f2756d).id, false, false, 2));
            zvf0.r("e_female_match_toast_hide", "p_suggest_users_home_view");
        }
        if (NullChecker.a(f2771s)) {
            e51.J(f2771s);
            f2771s.run();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m5317D() {
        return f2758f == null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m5318E() {
        return NullChecker.a(f2753a) && f2753a.isShowing();
    }

    /* JADX INFO: renamed from: F */
    public static void m5319F(final User user, final Act act) {
        if (m5317D()) {
            return;
        }
        m5322I(user, act);
        f2761i.setTranslationX(-t100.d(10.0f));
        SVGALoader.with(act).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(f2768p);
        e51.M(new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                abi.m5329c(user);
            }
        });
        f2756d = user;
        e51.H(act, new Runnable() { // from class: l.zai
            @Override // java.lang.Runnable
            public final void run() {
                abi.m5350x(act);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: G */
    public static void m5320G() {
        if (m5317D()) {
            return;
        }
        wqf0 wqf0Var = new wqf0(0.5f);
        VDraweeView vDraweeView = f2759g;
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(vDraweeView, property, 200L, 1500L, wqf0Var, new float[]{-t100.d(30.0f), t100.d(10.0f)});
        Animator animatorL2 = bt0.l(f2760h, property, 200L, 1500L, wqf0Var, new float[]{t100.d(30.0f), -t100.d(10.0f)});
        animatorL.addListener(new C3282d());
        VDraweeView vDraweeView2 = f2759g;
        Property property2 = View.ALPHA;
        bt0.z(new Animator[]{animatorL, animatorL2, bt0.l(vDraweeView2, property2, 200L, 100L, new LinearInterpolator(), new float[]{0.0f, 1.0f}), bt0.l(f2760h, property2, 200L, 100L, new LinearInterpolator(), new float[]{0.0f, 1.0f})}).start();
    }

    /* JADX INFO: renamed from: H */
    public static void m5321H(final Act act, User user, int i, boolean z) {
        if (f2769q == null) {
            f2769q = new GestureDetector((Context) act, (GestureDetector.OnGestureListener) new GestureDetectorOnGestureListenerC3279a(act));
        }
        PopupWindow popupWindow = f2753a;
        if (popupWindow == null || !popupWindow.isShowing() || z) {
            jci.l(true);
            e51.J(f2771s);
            if (f2753a == null) {
                f2757e = SystemClock.elapsedRealtime();
                zvf0.x("e_female_match_toast_hide", "p_suggest_users_home_view");
                PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(m5315B(), (ViewGroup) null), xdl0.y0(), t100.d(190.0f), false);
                f2753a = popupWindow2;
                ConstraintLayout constraintLayoutFindViewById = popupWindow2.getContentView().findViewById(u4c0.n0);
                f2758f = constraintLayoutFindViewById;
                constraintLayoutFindViewById.setClickable(true);
                f2758f.setOnTouchListener(new ViewOnTouchListenerC3280b());
                f2753a.setClippingEnabled(false);
                f2759g = f2753a.getContentView().findViewById(u4c0.X7);
                f2760h = f2753a.getContentView().findViewById(u4c0.Y7);
                f2761i = f2753a.getContentView().findViewById(u4c0.Z7);
                f2762j = (TextView) f2753a.getContentView().findViewById(u4c0.a8);
                f2763k = (TextView) f2753a.getContentView().findViewById(u4c0.W7);
                f2768p = f2753a.getContentView().findViewById(u4c0.sd);
                f2764l = (FrameLayout) f2753a.getContentView().findViewById(u4c0.J9);
                f2765m = (ImageView) f2753a.getContentView().findViewById(u4c0.L9);
                f2766n = (ImageView) f2753a.getContentView().findViewById(u4c0.K9);
                f2767o = f2753a.getContentView().findViewById(u4c0.Z8);
            }
            f2762j.setTypeface(eqh0.c(3), 1);
            if (f2753a.isShowing()) {
                if (f2755c == null) {
                    f2755c = new LinkedList<>();
                }
                f2755c.add(user);
                return;
            }
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", DeviceType.android);
            int dimensionPixelSize = identifier > 0 ? act.getApplicationContext().getResources().getDimensionPixelSize(identifier) : 0;
            xdl0.M0(f2753a.getContentView(), true);
            if (Build.VERSION.SDK_INT > 34) {
                f2753a.showAtLocation(act.getWindow().getDecorView(), 49, 0, xdl0.F0() - t100.d(60.0f));
            } else {
                f2753a.showAtLocation(act.getWindow().getDecorView(), 49, 0, -dimensionPixelSize);
            }
            m5322I(user, act);
            f2756d = user;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f2758f, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(f2758f, "translationY", -t100.d(192.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(500L);
            animatorSet.start();
            m5320G();
            if (z) {
                e51.H(act, new Runnable() { // from class: l.wai
                    @Override // java.lang.Runnable
                    public final void run() {
                        abi.m5350x(act);
                    }
                }, 3800L);
            } else {
                e51.H(act, new Runnable() { // from class: l.xai
                    @Override // java.lang.Runnable
                    public final void run() {
                        abi.m5351y(false);
                    }
                }, 4000L);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m5322I(User user, Act act) {
        if (TextUtils.isEmpty(user.name)) {
            return;
        }
        String strConcat = user.name;
        if (strConcat.length() > 5) {
            strConcat = user.name.substring(0, 5).concat("...");
        }
        f2763k.setText(strConcat + " " + act.getString(R.string.Gh));
    }

    /* JADX INFO: renamed from: J */
    public static void m5323J(Act act, User user) {
        m5324K(act, user, 0);
    }

    /* JADX INFO: renamed from: K */
    public static void m5324K(Act act, User user, int i) {
        m5325L(act, user, i, false);
    }

    /* JADX INFO: renamed from: L */
    public static void m5325L(final Act act, final User user, final int i, final boolean z) {
        if (upa.n3()) {
            aci.b0(act, user, false, "");
            return;
        }
        if (!NullChecker.a(act) || zch0.a().e()) {
            return;
        }
        View decorView = act.getWindow().getDecorView();
        if (NullChecker.a(decorView)) {
            decorView.post(new Runnable() { // from class: l.vai
                @Override // java.lang.Runnable
                public final void run() {
                    abi.m5321H(act, user, i, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m5326M(Picture.ImageUri imageUri) {
        if (System.currentTimeMillis() - f2770r >= 500 && !m5317D()) {
            f2770r = System.currentTimeMillis();
            f2761i.setVisibility(0);
            qib0.G.J0(f2761i, imageUri, false);
            VDraweeView vDraweeView = f2760h;
            Property property = View.TRANSLATION_Y;
            Animator animatorZ = bt0.z(new Animator[]{bt0.l(vDraweeView, property, 0L, 500L, new DecelerateInterpolator(), new float[]{0.0f, t100.d(60.0f)}), bt0.l(f2761i, property, 0L, 500L, new DecelerateInterpolator(), new float[]{-t100.d(60.0f), 0.0f})});
            animatorZ.addListener(new C3283e());
            animatorZ.start();
            VDraweeView vDraweeView2 = f2760h;
            Property property2 = View.ALPHA;
            bt0.z(new Animator[]{bt0.l(vDraweeView2, property2, 0L, 200L, new DecelerateInterpolator(), new float[]{1.0f, 0.0f}), bt0.l(f2761i, property2, 0L, 200L, new DecelerateInterpolator(), new float[]{0.0f, 1.0f})}).start();
            f2758f.bringChildToFront(f2760h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5327a() {
        if (f2753a != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(f2758f.getContext(), rzb0.f);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC3284f());
            f2758f.startAnimation(animationLoadAnimation);
        }
        f2755c = null;
        f2756d = null;
        f2754b = false;
        f2769q = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5329c(User user) {
        User userPeek = vwb.J(f2755c) ? null : f2755c.peek();
        if (userPeek != null) {
            qib0.G.x0(userPeek.fp().profileSmall().formatted());
        }
        m5326M(user.fp().profileSmall());
    }

    /* JADX INFO: renamed from: x */
    public static void m5350x(Act act) {
        PopupWindow popupWindow = f2753a;
        if (popupWindow == null || !popupWindow.isShowing() || vwb.J(f2755c)) {
            m5351y(false);
        } else {
            m5319F(f2755c.pop(), act);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m5351y(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f2757e >= 3800) {
            e51.J(f2771s);
            f2771s.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m5352z() {
        f2758f = null;
        f2759g = null;
        f2760h = null;
        f2761i = null;
        f2762j = null;
        f2763k = null;
        f2768p = null;
        f2764l = null;
        f2765m = null;
        f2766n = null;
        f2767o = null;
    }

    /* JADX INFO: renamed from: l.abi$a */
    public class GestureDetectorOnGestureListenerC3279a implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f2772a;

        public GestureDetectorOnGestureListenerC3279a(Act act) {
            this.f2772a = act;
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
            if (abi.f2754b) {
                return false;
            }
            abi.f2754b = true;
            if (f2 > 0.0f) {
                abi.m5314A();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            abi.m5316C(this.f2772a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (abi.f2754b) {
                return false;
            }
            abi.f2754b = true;
            abi.m5316C(this.f2772a);
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
    public class C3281c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f2773a;

        public C3281c(Animator animator) {
            this.f2773a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator animator2 = this.f2773a;
            if (animator2 != null) {
                animator2.removeAllListeners();
                this.f2773a.removeAllListeners();
            }
            if (abi.f2771s != null) {
                abi.f2771s.run();
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
    public class C3282d implements Animator.AnimatorListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m5353a() {
            if (abi.m5317D()) {
                return;
            }
            Conversation conversationXe = NullChecker.a(abi.f2756d) ? CoreModule.c.f0.Xe(((DbObject) abi.f2756d).id) : null;
            if (CoreModule.c.e0.p9() != null && CoreModule.c.e0.p9().fp() != null && CoreModule.c.e0.p9().fp().profileMiddle() != null) {
                if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
                    qib0.G.N0(abi.f2759g, CoreModule.c.e0.p9().getAnonymousUrl(), false);
                } else {
                    qib0.G.J0(abi.f2759g, CoreModule.c.e0.p9().fp().profileMiddle(), false);
                }
            }
            if (abi.f2756d == null || abi.f2756d.fp() == null || abi.f2756d.fp().profileMiddle() == null) {
                return;
            }
            if (NullChecker.a(conversationXe) && conversationXe.isAnonymous()) {
                qib0.G.N0(abi.f2760h, abi.f2756d.getAnonymousUrl(), false);
            } else {
                qib0.G.J0(abi.f2760h, abi.f2756d.fp().profileMiddle(), false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (abi.m5317D()) {
                return;
            }
            abi.f2764l.setVisibility(8);
            abi.f2767o.setVisibility(8);
            SVGALoader.with(abi.f2768p.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(abi.f2768p);
            e51.M(new Runnable() { // from class: l.bbi
                @Override // java.lang.Runnable
                public final void run() {
                    abi.C3282d.m5353a();
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
    public class C3283e implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (abi.m5317D()) {
                return;
            }
            VDraweeView vDraweeView = abi.f2760h;
            abi.f2760h = abi.f2761i;
            abi.f2761i = vDraweeView;
            abi.f2761i.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (abi.m5317D()) {
                return;
            }
            abi.f2764l.setVisibility(8);
            abi.f2767o.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.abi$f */
    public class AnimationAnimationListenerC3284f implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (abi.f2753a == null || !abi.f2753a.isShowing()) {
                return;
            }
            abi.f2753a.dismiss();
            abi.f2753a = null;
            abi.m5352z();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
