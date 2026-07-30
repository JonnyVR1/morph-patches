package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class pci {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f151577a;

    /* JADX INFO: renamed from: b */
    public static boolean f151578b;

    /* JADX INFO: renamed from: c */
    public static LinkedList<User> f151579c;

    /* JADX INFO: renamed from: d */
    public static User f151580d;

    /* JADX INFO: renamed from: e */
    public static long f151581e;

    /* JADX INFO: renamed from: f */
    public static ConstraintLayout f151582f;

    /* JADX INFO: renamed from: g */
    public static VDraweeView f151583g;

    /* JADX INFO: renamed from: h */
    public static VDraweeView f151584h;

    /* JADX INFO: renamed from: i */
    public static VDraweeView f151585i;

    /* JADX INFO: renamed from: j */
    public static TextView f151586j;

    /* JADX INFO: renamed from: k */
    public static TextView f151587k;

    /* JADX INFO: renamed from: l */
    public static FrameLayout f151588l;

    /* JADX INFO: renamed from: m */
    public static ImageView f151589m;

    /* JADX INFO: renamed from: n */
    public static ImageView f151590n;

    /* JADX INFO: renamed from: o */
    public static View f151591o;

    /* JADX INFO: renamed from: p */
    public static SVGAnimationView f151592p;

    /* JADX INFO: renamed from: q */
    public static GestureDetector f151593q;

    /* JADX INFO: renamed from: r */
    public static long f151594r;

    /* JADX INFO: renamed from: s */
    public static Runnable f151595s = new Runnable() { // from class: l.jci
        @Override // java.lang.Runnable
        public final void run() {
            pci.m171665a();
        }
    };

    /* JADX INFO: renamed from: l.pci$b */
    public class ViewOnTouchListenerC19344b implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (pci.f151593q != null) {
                return pci.f151593q.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m171652A() {
        l51.m152890J(f151595s);
        Animator animatorM132171q = gt0.m132171q(f151577a.getContentView(), "translationY", 0.0f, -qa00.m175859d(150.0f));
        animatorM132171q.setDuration(200L);
        animatorM132171q.setInterpolator(new AccelerateInterpolator());
        animatorM132171q.addListener(new C19345c(animatorM132171q));
        animatorM132171q.start();
    }

    /* JADX INFO: renamed from: B */
    public static int m171653B() {
        return kec0.f125847g8;
    }

    /* JADX INFO: renamed from: C */
    public static void m171654C(Act act) {
        if (NullChecker.m82486a(f151580d)) {
            act.startActivity(MessagesAct.m50127l2(act, f151580d.f56859id, false, false, 2));
            i4g0.m138520r("e_female_match_toast_hide", "p_suggest_users_home_view");
        }
        if (NullChecker.m82486a(f151595s)) {
            l51.m152890J(f151595s);
            f151595s.run();
        }
    }

    /* JADX INFO: renamed from: D */
    public static boolean m171655D() {
        return f151582f == null;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m171656E() {
        return NullChecker.m82486a(f151577a) && f151577a.isShowing();
    }

    /* JADX INFO: renamed from: F */
    public static void m171657F(final User user, final Act act) {
        if (m171655D()) {
            return;
        }
        m171660I(user, act);
        f151585i.setTranslationX(-qa00.m175859d(10.0f));
        SVGALoader.with(act).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(f151592p);
        l51.m152893M(new Runnable() { // from class: l.nci
            @Override // java.lang.Runnable
            public final void run() {
                pci.m171667c(user);
            }
        });
        f151580d = user;
        l51.m152888H(act, new Runnable() { // from class: l.oci
            @Override // java.lang.Runnable
            public final void run() {
                pci.m171688x(act);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: G */
    public static void m171658G() {
        if (m171655D()) {
            return;
        }
        fzf0 fzf0Var = new fzf0(0.5f);
        VDraweeView vDraweeView = f151583g;
        Property property = View.TRANSLATION_X;
        Animator animatorM132166l = gt0.m132166l(vDraweeView, property, 200L, 1500L, fzf0Var, -qa00.m175859d(30.0f), qa00.m175859d(10.0f));
        Animator animatorM132166l2 = gt0.m132166l(f151584h, property, 200L, 1500L, fzf0Var, qa00.m175859d(30.0f), -qa00.m175859d(10.0f));
        animatorM132166l.addListener(new C19346d());
        VDraweeView vDraweeView2 = f151583g;
        Property property2 = View.ALPHA;
        gt0.m132180z(animatorM132166l, animatorM132166l2, gt0.m132166l(vDraweeView2, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f), gt0.m132166l(f151584h, property2, 200L, 100L, new LinearInterpolator(), 0.0f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: H */
    public static void m171659H(final Act act, User user, int i, boolean z) {
        if (f151593q == null) {
            f151593q = new GestureDetector(act, new GestureDetectorOnGestureListenerC19343a(act));
        }
        PopupWindow popupWindow = f151577a;
        if (popupWindow == null || !popupWindow.isShowing() || z) {
            ydi.m215229l(true);
            l51.m152890J(f151595s);
            if (f151577a == null) {
                f151581e = SystemClock.elapsedRealtime();
                i4g0.m138526x("e_female_match_toast_hide", "p_suggest_users_home_view");
                PopupWindow popupWindow2 = new PopupWindow(act.inflater().inflate(m171653B(), (ViewGroup) null), bnl0.m105592y0(), qa00.m175859d(190.0f), false);
                f151577a = popupWindow2;
                ConstraintLayout constraintLayout = (ConstraintLayout) popupWindow2.getContentView().findViewById(adc0.f70463n0);
                f151582f = constraintLayout;
                constraintLayout.setClickable(true);
                f151582f.setOnTouchListener(new ViewOnTouchListenerC19344b());
                f151577a.setClippingEnabled(false);
                f151583g = (VDraweeView) f151577a.getContentView().findViewById(adc0.f70234Z7);
                f151584h = (VDraweeView) f151577a.getContentView().findViewById(adc0.f70251a8);
                f151585i = (VDraweeView) f151577a.getContentView().findViewById(adc0.f70268b8);
                f151586j = (TextView) f151577a.getContentView().findViewById(adc0.f70285c8);
                f151587k = (TextView) f151577a.getContentView().findViewById(adc0.f70218Y7);
                f151592p = (SVGAnimationView) f151577a.getContentView().findViewById(adc0.f70595ud);
                f151588l = (FrameLayout) f151577a.getContentView().findViewById(adc0.f70001L9);
                f151589m = (ImageView) f151577a.getContentView().findViewById(adc0.f70035N9);
                f151590n = (ImageView) f151577a.getContentView().findViewById(adc0.f70018M9);
                f151591o = f151577a.getContentView().findViewById(adc0.f70269b9);
            }
            f151586j.setTypeface(lyh0.m156283c(3), 1);
            if (f151577a.isShowing()) {
                if (f151579c == null) {
                    f151579c = new LinkedList<>();
                }
                f151579c.add(user);
                return;
            }
            int identifier = act.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? act.getApplicationContext().getResources().getDimensionPixelSize(identifier) : 0;
            bnl0.m105525M0(f151577a.getContentView(), true);
            if (Build.VERSION.SDK_INT > 34) {
                f151577a.showAtLocation(act.getWindow().getDecorView(), 49, 0, bnl0.m105511F0() - qa00.m175859d(60.0f));
            } else {
                f151577a.showAtLocation(act.getWindow().getDecorView(), 49, 0, -dimensionPixelSize);
            }
            m171660I(user, act);
            f151580d = user;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(f151582f, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(f151582f, "translationY", -qa00.m175859d(192.0f), 0.0f);
            objectAnimatorOfFloat2.setInterpolator(new OvershootInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(500L);
            animatorSet.start();
            m171658G();
            if (z) {
                l51.m152888H(act, new Runnable() { // from class: l.lci
                    @Override // java.lang.Runnable
                    public final void run() {
                        pci.m171688x(act);
                    }
                }, 3800L);
            } else {
                l51.m152888H(act, new Runnable() { // from class: l.mci
                    @Override // java.lang.Runnable
                    public final void run() {
                        pci.m171689y(false);
                    }
                }, 4000L);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m171660I(User user, Act act) {
        if (TextUtils.isEmpty(user.name)) {
            return;
        }
        String strConcat = user.name;
        if (strConcat.length() > 5) {
            strConcat = user.name.substring(0, 5).concat("...");
        }
        f151587k.setText(strConcat + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(R$string.f19126bi));
    }

    /* JADX INFO: renamed from: J */
    public static void m171661J(Act act, User user) {
        m171662K(act, user, 0);
    }

    /* JADX INFO: renamed from: K */
    public static void m171662K(Act act, User user, int i) {
        m171663L(act, user, i, false);
    }

    /* JADX INFO: renamed from: L */
    public static void m171663L(final Act act, final User user, final int i, final boolean z) {
        if (gra.m131722n3()) {
            pdi.m171817b0(act, user, false, "");
            return;
        }
        if (!NullChecker.m82486a(act) || hlh0.m135741a().m135745e()) {
            return;
        }
        View decorView = act.getWindow().getDecorView();
        if (NullChecker.m82486a(decorView)) {
            decorView.post(new Runnable() { // from class: l.kci
                @Override // java.lang.Runnable
                public final void run() {
                    pci.m171659H(act, user, i, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m171664M(Picture.ImageUri imageUri) {
        if (System.currentTimeMillis() - f151594r >= 500 && !m171655D()) {
            f151594r = System.currentTimeMillis();
            f151585i.setVisibility(0);
            uqb0.f180374G.m127111J0(f151585i, imageUri, false);
            VDraweeView vDraweeView = f151584h;
            Property property = View.TRANSLATION_Y;
            Animator animatorM132180z = gt0.m132180z(gt0.m132166l(vDraweeView, property, 0L, 500L, new DecelerateInterpolator(), 0.0f, qa00.m175859d(60.0f)), gt0.m132166l(f151585i, property, 0L, 500L, new DecelerateInterpolator(), -qa00.m175859d(60.0f), 0.0f));
            animatorM132180z.addListener(new C19347e());
            animatorM132180z.start();
            VDraweeView vDraweeView2 = f151584h;
            Property property2 = View.ALPHA;
            gt0.m132180z(gt0.m132166l(vDraweeView2, property2, 0L, 200L, new DecelerateInterpolator(), 1.0f, 0.0f), gt0.m132166l(f151585i, property2, 0L, 200L, new DecelerateInterpolator(), 0.0f, 1.0f)).start();
            f151582f.bringChildToFront(f151584h);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m171665a() {
        if (f151577a != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(f151582f.getContext(), x7c0.f192691f);
            animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC19348f());
            f151582f.startAnimation(animationLoadAnimation);
        }
        f151579c = null;
        f151580d = null;
        f151578b = false;
        f151593q = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m171667c(User user) {
        User userPeek = jyb.m147479J(f151579c) ? null : f151579c.peek();
        if (userPeek != null) {
            uqb0.f180374G.m127160x0(userPeek.m61308fp().profileSmall().formatted());
        }
        m171664M(user.m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: x */
    public static void m171688x(Act act) {
        PopupWindow popupWindow = f151577a;
        if (popupWindow == null || !popupWindow.isShowing() || jyb.m147479J(f151579c)) {
            m171689y(false);
        } else {
            m171657F(f151579c.pop(), act);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m171689y(boolean z) {
        if (z || SystemClock.elapsedRealtime() - f151581e >= 3800) {
            l51.m152890J(f151595s);
            f151595s.run();
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m171690z() {
        f151582f = null;
        f151583g = null;
        f151584h = null;
        f151585i = null;
        f151586j = null;
        f151587k = null;
        f151592p = null;
        f151588l = null;
        f151589m = null;
        f151590n = null;
        f151591o = null;
    }

    /* JADX INFO: renamed from: l.pci$a */
    public class GestureDetectorOnGestureListenerC19343a implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f151596a;

        public GestureDetectorOnGestureListenerC19343a(Act act) {
            this.f151596a = act;
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
            if (pci.f151578b) {
                return false;
            }
            pci.f151578b = true;
            if (f2 > 0.0f) {
                pci.m171652A();
                return true;
            }
            if (f2 != 0.0f) {
                return false;
            }
            pci.m171654C(this.f151596a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (pci.f151578b) {
                return false;
            }
            pci.f151578b = true;
            pci.m171654C(this.f151596a);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }
    }

    /* JADX INFO: renamed from: l.pci$c */
    public class C19345c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f151597a;

        public C19345c(Animator animator) {
            this.f151597a = animator;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Animator animator2 = this.f151597a;
            if (animator2 != null) {
                animator2.removeAllListeners();
                this.f151597a.removeAllListeners();
            }
            if (pci.f151595s != null) {
                pci.f151595s.run();
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

    /* JADX INFO: renamed from: l.pci$d */
    public class C19346d implements Animator.AnimatorListener {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m171691a() {
            if (pci.m171655D()) {
                return;
            }
            Conversation conversationM33859Xe = NullChecker.m82486a(pci.f151580d) ? CoreModule.f18264c.f20384f0.m33859Xe(pci.f151580d.f56859id) : null;
            if (CoreModule.f18264c.f20381e0.m116600p9() != null && CoreModule.f18264c.f20381e0.m116600p9().m61308fp() != null && CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle() != null) {
                if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
                    uqb0.f180374G.m127119N0(pci.f151583g, CoreModule.f18264c.f20381e0.m116600p9().getAnonymousUrl(), false);
                } else {
                    uqb0.f180374G.m127111J0(pci.f151583g, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle(), false);
                }
            }
            if (pci.f151580d == null || pci.f151580d.m61308fp() == null || pci.f151580d.m61308fp().profileMiddle() == null) {
                return;
            }
            if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isAnonymous()) {
                uqb0.f180374G.m127119N0(pci.f151584h, pci.f151580d.getAnonymousUrl(), false);
            } else {
                uqb0.f180374G.m127111J0(pci.f151584h, pci.f151580d.m61308fp().profileMiddle(), false);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (pci.m171655D()) {
                return;
            }
            pci.f151588l.setVisibility(8);
            pci.f151591o.setVisibility(8);
            SVGALoader.with(pci.f151592p.getContext()).from("https://auto.tancdn.com/v1/raw/43f6acda-0599-43c7-95cb-4b2b00f758ba11.so").autoPlay(true).repeatCount(1).into(pci.f151592p);
            l51.m152893M(new Runnable() { // from class: l.qci
                @Override // java.lang.Runnable
                public final void run() {
                    pci.C19346d.m171691a();
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

    /* JADX INFO: renamed from: l.pci$e */
    public class C19347e implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (pci.m171655D()) {
                return;
            }
            VDraweeView vDraweeView = pci.f151584h;
            pci.f151584h = pci.f151585i;
            pci.f151585i = vDraweeView;
            pci.f151585i.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (pci.m171655D()) {
                return;
            }
            pci.f151588l.setVisibility(8);
            pci.f151591o.setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.pci$f */
    public class AnimationAnimationListenerC19348f implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (pci.f151577a == null || !pci.f151577a.isShowing()) {
                return;
            }
            pci.f151577a.dismiss();
            pci.f151577a = null;
            pci.m171690z();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
