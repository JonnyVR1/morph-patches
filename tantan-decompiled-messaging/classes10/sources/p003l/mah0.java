package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideLeftView;
import com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideRightView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.ProfileZodiac;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import l.bfd0;
import l.bii0;
import l.bt0;
import l.c4g0;
import l.cfd0;
import l.d30;
import l.d5m;
import l.da;
import l.e30;
import l.e5m;
import l.f6c0;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.myc0;
import l.ogl0;
import l.psl;
import l.qib0;
import l.roj0;
import l.t100;
import l.tpd0;
import l.ua60;
import l.vwb;
import l.vy8;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.yij0;
import l.zpd0;
import l.zvf0;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mah0 {

    /* JADX INFO: renamed from: p */
    public static volatile mah0 f6291p = null;

    /* JADX INFO: renamed from: q */
    public static boolean f6292q = false;

    /* JADX INFO: renamed from: a */
    public b<roj0> f6293a = b.b();

    /* JADX INFO: renamed from: b */
    public final zpd0 f6294b = new zpd0("new_swipe_guide_swipe_" + m8130t1(), 0L);

    /* JADX INFO: renamed from: c */
    public final hpd0 f6295c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f6296d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f6297e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f6298f;

    /* JADX INFO: renamed from: g */
    public final tpd0 f6299g;

    /* JADX INFO: renamed from: h */
    public final tpd0 f6300h;

    /* JADX INFO: renamed from: i */
    public final tpd0 f6301i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f6302j;

    /* JADX INFO: renamed from: k */
    public long f6303k;

    /* JADX INFO: renamed from: l */
    public boolean f6304l;

    /* JADX INFO: renamed from: m */
    public final a<roj0> f6305m;

    /* JADX INFO: renamed from: n */
    public final b<roj0> f6306n;

    /* JADX INFO: renamed from: o */
    public boolean f6307o;

    /* JADX INFO: renamed from: l.mah0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC3374a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f6308a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f6309b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f6310c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f6311d;

        public ViewTreeObserverOnGlobalLayoutListenerC3374a(FrameLayout frameLayout, AtomicBoolean atomicBoolean, View view, Runnable runnable) {
            this.f6308a = frameLayout;
            this.f6309b = atomicBoolean;
            this.f6310c = view;
            this.f6311d = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((this.f6308a.getMeasuredHeight() > 0 || this.f6308a.getHeight() > 0) && this.f6309b.compareAndSet(false, true)) {
                ViewTreeObserver viewTreeObserver = this.f6308a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                this.f6310c.post(this.f6311d);
            }
        }
    }

    /* JADX INFO: renamed from: l.mah0$b */
    public class C3375b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f6312a;

        public C3375b(View view) {
            this.f6312a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            mah0.m8058j0(this.f6312a, 0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            mah0.m8058j0(this.f6312a, 0.0f);
        }
    }

    /* JADX INFO: renamed from: l.mah0$c */
    public class RunnableC3376c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f6314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserProfileExpandedCardRoot f6315b;

        public RunnableC3376c(com.p1.mobile.putong.core.newui.home.b bVar, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
            this.f6314a = bVar;
            this.f6315b = userProfileExpandedCardRoot;
        }

        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            com.p1.mobile.putong.core.newui.home.b bVar = this.f6314a;
            UserProfileExpandedCardRoot userProfileExpandedCardRoot = this.f6315b;
            mah0Var.m8127r1(bVar, userProfileExpandedCardRoot, userProfileExpandedCardRoot.R, userProfileExpandedCardRoot.Y());
        }
    }

    /* JADX INFO: renamed from: l.mah0$d */
    public class RunnableC3377d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f6317a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e5m f6318b;

        public RunnableC3377d(com.p1.mobile.putong.core.newui.home.b bVar, e5m e5mVar) {
            this.f6317a = bVar;
            this.f6318b = e5mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            com.p1.mobile.putong.core.newui.home.b bVar = this.f6317a;
            e5m e5mVar = this.f6318b;
            mah0Var.m8107Z0(bVar, (View) e5mVar, e5mVar.t(), this.f6318b.Y());
        }
    }

    /* JADX INFO: renamed from: l.mah0$e */
    public class RunnableC3378e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ com.p1.mobile.putong.core.newui.home.b f6320a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e5m f6321b;

        public RunnableC3378e(com.p1.mobile.putong.core.newui.home.b bVar, e5m e5mVar) {
            this.f6320a = bVar;
            this.f6321b = e5mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            com.p1.mobile.putong.core.newui.home.b bVar = this.f6320a;
            e5m e5mVar = this.f6321b;
            mah0Var.m8107Z0(bVar, (View) e5mVar, e5mVar.t(), this.f6321b.Y());
        }
    }

    public mah0() {
        String str = "swipe_guide_right_guide_show_" + m8130t1();
        Boolean bool = Boolean.FALSE;
        this.f6295c = new hpd0(str, bool);
        this.f6296d = new hpd0("swipe_guide_left_guide_show_" + m8130t1(), bool);
        this.f6297e = new hpd0("swipe_guide_setting_guide_show_" + m8130t1(), bool);
        this.f6298f = new tpd0("swipe_guide_total_swipe_count_" + m8130t1(), 0);
        this.f6299g = new tpd0("swipe_guide_total_swipe_left_count_" + m8130t1(), 0);
        this.f6300h = new tpd0("swipe_guide_group_swipe_count_left_show_" + m8130t1(), -1);
        this.f6301i = new tpd0("swipe_guide_group_swipe_count_right_show_" + m8130t1(), -1);
        this.f6302j = new hpd0("guide_to_swipe_has_shown_first_like" + m8130t1(), bool);
        this.f6303k = 0L;
        this.f6304l = false;
        this.f6305m = a.b();
        this.f6306n = b.b();
        this.f6307o = false;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8010A() {
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8011B(View view) {
        xdl0.M(view, false);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m8015F(Act act, NewNewProfileCard newNewProfileCard, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m8060k0(act, newNewProfileCard, view, pictureView, new j8h0(view), new d30() { // from class: l.d9h0
            public final void call() {
                view.setBackgroundResource(x2c0.Sp);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m8017H(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m8060k0(act, userProfileExpandedCardRoot, view, pictureView, new j8h0(view), new d30() { // from class: l.g9h0
            public final void call() {
                view.setBackgroundResource(x2c0.Sp);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m8020K(PictureView pictureView, Act act, e30 e30Var, Pair pair) {
        if (((Boolean) pair.second).booleanValue() || !((Boolean) pictureView.I0.e()).booleanValue()) {
            bfd0 bfd0VarA = cfd0.a(act.getResources(), (Bitmap) pair.first);
            bfd0VarA.e(t100.o);
            e30Var.call(bfd0VarA);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m8021L(AtomicBoolean atomicBoolean, FrameLayout frameLayout, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, Runnable runnable) {
        if (atomicBoolean.compareAndSet(false, true)) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m8022M(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m8023N(UserProfileExpandedCardRoot userProfileExpandedCardRoot, roj0 roj0Var) {
        if (NullChecker.a(userProfileExpandedCardRoot.E0) && userProfileExpandedCardRoot.E0.isRunning()) {
            userProfileExpandedCardRoot.E0.end();
        }
        mkd0.z(userProfileExpandedCardRoot.F0);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m8026Q(com.p1.mobile.putong.core.newui.home.b bVar, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        NewMainAct newMainActK1 = bVar.K1();
        View rootView = userProfileExpandedCardRoot.getRootView();
        ?? r2 = userProfileExpandedCardRoot.p0;
        Objects.requireNonNull(r2);
        m8060k0(newMainActK1, rootView, r2, pictureView, new l8h0(r2), new d30() { // from class: l.f9h0
            public final void call() {
                userProfileExpandedCardRoot.p0.setBackgroundResource(x2c0.Sp);
            }
        });
        bVar.P2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m8027R(SwipeGuideLeftView swipeGuideLeftView, Drawable drawable) {
        swipeGuideLeftView.setBackground(drawable);
        if (swipeGuideLeftView.getAlpha() == 0.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(swipeGuideLeftView, (Property<SwipeGuideLeftView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m8030U(Act act, d30 d30Var, Pair pair) {
        if (pair.first != null) {
            return Boolean.TRUE;
        }
        Objects.requireNonNull(d30Var);
        act.post(new bii0(d30Var));
        return Boolean.FALSE;
    }

    @Nullable
    /* JADX INFO: renamed from: U0 */
    public static com.p1.mobile.putong.core.newui.home.b m8031U0(Act act) {
        if (act != null && (act instanceof NewMainAct)) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.V5() == null) {
                return null;
            }
            Frag fragR6 = newMainAct.V5().r6(TabName.Card);
            if (fragR6 instanceof psl) {
                fragR6 = ((psl) fragR6).Y();
            }
            if (fragR6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) fragR6).C;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public static void m8035X0() {
        String str;
        try {
            User userM8071r0 = m8071r0("-145");
            if (vwb.J(userM8071r0.pictures)) {
                return;
            }
            Object obj = userM8071r0.pictures.get(0);
            if ((obj instanceof Picture) && (str = ((Media) ((Picture) obj)).url) != null && !str.isEmpty()) {
                qib0.G.x0(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8038a(com.p1.mobile.putong.core.newui.home.b bVar, final NewNewProfileCard newNewProfileCard, PictureView pictureView) {
        NewMainAct newMainActK1 = bVar.K1();
        ?? r2 = newNewProfileCard.K1;
        Objects.requireNonNull(r2);
        m8060k0(newMainActK1, newNewProfileCard, r2, pictureView, new l8h0(r2), new d30() { // from class: l.e9h0
            public final void call() {
                newNewProfileCard.K1.setBackgroundResource(x2c0.Sp);
            }
        });
        bVar.P2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8040b(NewNewProfileCard newNewProfileCard, roj0 roj0Var) {
        if (NullChecker.a(newNewProfileCard.L1) && newNewProfileCard.L1.isRunning()) {
            newNewProfileCard.L1.end();
        }
        mkd0.z(newNewProfileCard.M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8042c(View view, int i, int i2, View view2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        } else {
            view.setTranslationX(0.0f);
            view.setRotation(0.0f);
        }
        m8058j0(view2, (float) Math.hypot(view.getTranslationX(), view.getTranslationY()));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m8044c1() {
        if (NullChecker.a(f6291p)) {
            f6291p.f6306n.onNext(roj0.a);
            f6291p.f6305m.onCompleted();
            f6291p.f6293a.onCompleted();
            f6291p = null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m8046d0(Act act, d30 d30Var, Boolean bool) {
        Objects.requireNonNull(d30Var);
        act.post(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m8048e0(d30 d30Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, c4g0 c4g0Var, roj0 roj0Var) {
        d30Var.call();
        xdl0.M(userProfileExpandedCardRoot.p0, false);
        mkd0.z(userProfileExpandedCardRoot.F0);
        mkd0.z(c4g0Var);
    }

    /* JADX INFO: renamed from: g1 */
    public static void m8053g1(NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        if (newNewProfileCard == null) {
            return;
        }
        newNewProfileCard.T(m8071r0(userInfo.id), userInfo, i);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m8055h1(UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        if (userProfileExpandedCardRoot == null) {
            return;
        }
        userProfileExpandedCardRoot.T(m8071r0(userInfo.id), userInfo, i);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8057j() {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m8058j0(@Nullable View view, float f) {
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof BifrostLayout) {
                ((BifrostLayout) parent).z(Math.max(0.0f, f));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m8060k0(Act act, View view, View view2, PictureView pictureView, e30<Drawable> e30Var, d30 d30Var) {
        m8062l0(act, view, view2, pictureView, e30Var, d30Var, false);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m8061l(com.p1.mobile.putong.core.newui.home.b bVar, View view, final View view2, PictureView pictureView) {
        NewMainAct newMainActK1 = bVar.K1();
        Objects.requireNonNull(view2);
        m8060k0(newMainActK1, view, view2, pictureView, new j8h0(view2), new d30() { // from class: l.k8h0
            public final void call() {
                view2.setBackgroundResource(x2c0.Sp);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m8062l0(final Act act, final View view, final View view2, final PictureView pictureView, final e30<Drawable> e30Var, final d30 d30Var, boolean z) {
        if (view.getWidth() > 0) {
            act.duringCreated(c.fromCallable(new Callable() { // from class: l.v9h0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return mah0.m8078w(view, view2, pictureView, act, e30Var, d30Var);
                }
            }).compose(mkd0.R()).observeOn(Schedulers.computation()).filter(new w9j() { // from class: l.x9h0
                public final Object call(Object obj) {
                    return mah0.m8030U(act, d30Var, (Pair) obj);
                }
            }).flatMap(new w9j() { // from class: l.y9h0
                public final Object call(Object obj) {
                    View view3 = view;
                    Pair pair = (Pair) obj;
                    return c.just(Pair.create(yij0.p((Bitmap) pair.first, view3.getWidth(), view3.getHeight(), 2097152000), (Boolean) pair.second));
                }
            }).compose(mkd0.y())).subscribe(mkd0.H(new e30() { // from class: l.z9h0
                public final void call(Object obj) {
                    mah0.m8020K(pictureView, act, e30Var, (Pair) obj);
                }
            }, new e30() { // from class: l.aah0
                public final void call(Object obj) {
                    mah0.m8070r((Throwable) obj);
                }
            }));
        } else {
            if (z) {
                return;
            }
            view.post(new Runnable() { // from class: l.u9h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8062l0(act, view, view2, pictureView, e30Var, d30Var, true);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m8063m(Act act, View view, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView, com.p1.mobile.putong.core.newui.home.b bVar) {
        ?? r2 = userProfileExpandedCardRoot.p0;
        Objects.requireNonNull(r2);
        m8060k0(act, view, r2, pictureView, new l8h0(r2), new d30() { // from class: l.h9h0
            public final void call() {
                userProfileExpandedCardRoot.p0.setBackgroundResource(x2c0.Sp);
            }
        });
        bVar.P2();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m8064m0() {
        return vy8.g() && !f6292q;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m8065m1(com.p1.mobile.putong.core.newui.home.b bVar, View view, final Runnable runnable) {
        final FrameLayout frameLayout = bVar.f;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            runnable.run();
            return;
        }
        VLinear vLinear = bVar.e;
        if (vLinear != null) {
            vLinear.requestLayout();
        }
        if (frameLayout.getMeasuredHeight() > 0 || frameLayout.getHeight() > 0) {
            view.post(runnable);
            return;
        }
        ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            view.post(runnable);
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ViewTreeObserverOnGlobalLayoutListenerC3374a viewTreeObserverOnGlobalLayoutListenerC3374a = new ViewTreeObserverOnGlobalLayoutListenerC3374a(frameLayout, atomicBoolean, view, runnable);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3374a);
        view.postDelayed(new Runnable() { // from class: l.i9h0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m8021L(atomicBoolean, frameLayout, viewTreeObserverOnGlobalLayoutListenerC3374a, runnable);
            }
        }, 400L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8068p(Act act, final NewNewProfileCard newNewProfileCard, PictureView pictureView, com.p1.mobile.putong.core.newui.home.b bVar) {
        ?? r2 = newNewProfileCard.K1;
        Objects.requireNonNull(r2);
        m8060k0(act, newNewProfileCard, r2, pictureView, new l8h0(r2), new d30() { // from class: l.m8h0
            public final void call() {
                newNewProfileCard.K1.setBackgroundResource(x2c0.Sp);
            }
        });
        bVar.P2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8069q(boolean z, d30 d30Var, NewNewProfileCard newNewProfileCard, c4g0 c4g0Var, roj0 roj0Var) {
        if (z) {
            da.Companion.o(false);
        }
        d30Var.call();
        xdl0.M(newNewProfileCard.K1, false);
        mkd0.z(newNewProfileCard.M1);
        mkd0.z(c4g0Var);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m8070r(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static User m8071r0(String str) {
        User userNew_ = User.new_();
        ((DbObject) userNew_).id = str;
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).mediaType = "image/jpeg";
        Dimension dimension = pictureNew_.size;
        dimension.width = 600;
        dimension.height = 800;
        userNew_.pictures = vwb.M(pictureNew_);
        userNew_.profile = Profile.new_();
        Settings settings = CoreModule.c.e0.p9().settings;
        if (NullChecker.a(settings) && (TEnum.equals(settings.getLookingFor(), "male") || (TEnum.equals(settings.getLookingFor(), "both") && TEnum.equals(CoreModule.c.e0.p9().gender, "female")))) {
            userNew_.gender = Gender.get("male");
            userNew_.name = "会飞的鱼";
            userNew_.profile.zodiac = ProfileZodiac.get(com.p000p1.mobile.putong.core.data.ProfileZodiac.aquarius);
            userNew_.age = 23;
            ((Media) pictureNew_).url = "https://auto.tancdn.com/v1/raw/7d782cb5-c7be-4b16-badc-8ed85093b37b07.jpg";
            return userNew_;
        }
        userNew_.gender = Gender.get("female");
        userNew_.name = "圆圆的杰妮";
        userNew_.profile.zodiac = ProfileZodiac.get(com.p000p1.mobile.putong.core.data.ProfileZodiac.leo);
        userNew_.age = 25;
        ((Media) pictureNew_).url = "https://auto.tancdn.com/v1/raw/5b106d80-616a-4d70-9c42-f3348090e0de07.jpg";
        return userNew_;
    }

    /* JADX INFO: renamed from: s0 */
    public static mah0 m8073s0() {
        if (f6291p == null) {
            synchronized (mah0.class) {
                try {
                    if (f6291p == null) {
                        f6291p = new mah0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6291p;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m8074t(View view, Act act, View view2, PictureView pictureView, e30 e30Var, d30 d30Var, Boolean bool) {
        if (view.getVisibility() == 8) {
            return;
        }
        m8060k0(act, view2, view, pictureView, e30Var, d30Var);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m8077v0(final View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        bt0.f(objectAnimatorOfFloat, new Runnable() { // from class: l.cah0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m8011B(view);
            }
        });
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Pair m8078w(final View view, final View view2, final PictureView pictureView, final Act act, final e30 e30Var, final d30 d30Var) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (NullChecker.a(view2)) {
                xdl0.M0(view2, false);
            }
            Boolean bool = (Boolean) pictureView.I0.e();
            boolean zBooleanValue = bool.booleanValue();
            view.draw(canvas);
            if (NullChecker.a(view2)) {
                xdl0.M0(view2, true);
            }
            if (!zBooleanValue) {
                act.duringCreated(pictureView.I0.filter(new w9j() { // from class: l.dah0
                    public final Object call(Object obj) {
                        return mah0.m8022M((Boolean) obj);
                    }
                }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.eah0
                    public final void call(Object obj) {
                        mah0.m8074t(view2, act, view, pictureView, e30Var, d30Var, (Boolean) obj);
                    }
                }));
                act.duringCreated(pictureView.I0.skip(1).filter(new w9j() { // from class: l.fah0
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((Boolean) obj).booleanValue());
                    }
                }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.gah0
                    public final void call(Object obj) {
                        mah0.m8046d0(act, d30Var, (Boolean) obj);
                    }
                }));
            }
            return Pair.create(bitmapCreateBitmap, bool);
        } catch (OutOfMemoryError e) {
            CrashHelper.c(e);
            return Pair.create(null, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m8079w0() {
        if (((Boolean) m8073s0().f6302j.get()).booleanValue() || (NullChecker.a(f6291p) && ((Boolean) f6291p.f6296d.get()).booleanValue() && ((Boolean) f6291p.f6297e.get()).booleanValue() && ((Integer) f6291p.f6300h.get()).intValue() != ((Integer) f6291p.f6298f.get()).intValue())) {
            f6292q = true;
            f6291p = null;
        } else {
            f6292q = false;
            m8035X0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m8082y0(String str) {
        return "-145".equals(str);
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m8084A0() {
        return this.f6304l;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8085B0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, float f, float f2) {
        this.f6304l = false;
        if (userProfileExpandedCardRoot.E0.isRunning()) {
            userProfileExpandedCardRoot.E0.end();
        }
        userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
        userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotX(f);
        userProfileExpandedCardRoot.getRootView().setPivotY(f2);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ Boolean m8086C0(roj0 roj0Var) {
        return Boolean.valueOf(((Long) this.f6294b.get()).longValue() == 0 && NullChecker.a(CoreModule.c.m0.r6()));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8087D0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, roj0 roj0Var) {
        if (!"-145".equals(CoreModule.c.m0.r6().id) || this.f6304l) {
            return;
        }
        if (userProfileExpandedCardRoot.E0.isRunning()) {
            this.f6304l = true;
            return;
        }
        userProfileExpandedCardRoot.getRootView().setPivotX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotY(userProfileExpandedCardRoot.getRootView().getHeight() * 1.5f);
        userProfileExpandedCardRoot.E0.start();
        this.f6304l = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m8088E0(roj0 roj0Var) {
        return Boolean.valueOf(m8122o1());
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m8089F0(d30 d30Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, c4g0 c4g0Var) {
        d30Var.call();
        mkd0.z(userProfileExpandedCardRoot.F0);
        mkd0.z(c4g0Var);
        if (((Long) this.f6294b.get()).longValue() == 0) {
            this.f6294b.put(Long.valueOf(mqi0.o()));
            m8121o0();
            zvf0.r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m8090G0(NewNewProfileCard newNewProfileCard, float f, float f2) {
        this.f6304l = false;
        if (newNewProfileCard.L1.isRunning()) {
            newNewProfileCard.L1.end();
        }
        newNewProfileCard.setRotation(0.0f);
        newNewProfileCard.setTranslationX(0.0f);
        newNewProfileCard.setPivotX(f);
        newNewProfileCard.setPivotY(f2);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ Boolean m8091H0(roj0 roj0Var) {
        return Boolean.valueOf(((Long) this.f6294b.get()).longValue() == 0 && NullChecker.a(CoreModule.c.m0.r6()));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8092I0(NewNewProfileCard newNewProfileCard, roj0 roj0Var) {
        if (!"-145".equals(CoreModule.c.m0.r6().id) || this.f6304l) {
            if (this.f6304l && newNewProfileCard.L1.isRunning()) {
                this.f6304l = false;
                newNewProfileCard.L1.end();
                return;
            }
            return;
        }
        if (newNewProfileCard.L1.isRunning()) {
            this.f6304l = true;
            return;
        }
        newNewProfileCard.setPivotX(0.0f);
        newNewProfileCard.setPivotY(newNewProfileCard.getHeight() * 1.5f);
        newNewProfileCard.L1.start();
        this.f6304l = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ Boolean m8093J0(boolean z, roj0 roj0Var) {
        return Boolean.valueOf(m8122o1() || z);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m8094K0(d30 d30Var, NewNewProfileCard newNewProfileCard, c4g0 c4g0Var, boolean z) {
        d30Var.call();
        mkd0.z(newNewProfileCard.M1);
        mkd0.z(c4g0Var);
        if (z) {
            da.Companion.o(false);
        } else if (((Long) this.f6294b.get()).longValue() == 0) {
            this.f6294b.put(Long.valueOf(mqi0.o()));
            m8121o0();
            zvf0.r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8095L0(SwipeGuideLeftView swipeGuideLeftView, roj0 roj0Var) {
        if (m8120n1() && xdl0.O0(swipeGuideLeftView)) {
            m8077v0(swipeGuideLeftView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m8096M0(SwipeGuideLeftView swipeGuideLeftView, com.p1.mobile.putong.core.newui.home.b bVar, c4g0 c4g0Var) {
        if (xdl0.O0(swipeGuideLeftView)) {
            m8077v0(swipeGuideLeftView);
        }
        m8119n0();
        bVar.e6();
        mkd0.z(c4g0Var);
        zvf0.r("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideLeftView] */
    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8097N0(View view, ViewStub viewStub, final com.p1.mobile.putong.core.newui.home.b bVar, PictureView pictureView) {
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).b3();
        } else if (view instanceof UserProfileExpandedCardRoot) {
            ((UserProfileExpandedCardRoot) view).u1();
        }
        zvf0.x("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
        final ?? r2 = (SwipeGuideLeftView) view.findViewById(viewStub.getInflatedId());
        final c4g0 c4g0VarSubscribe = bVar.K1().duringCreated(this.f6293a).take(1).subscribe(mkd0.G(new e30() { // from class: l.n8h0
            public final void call(Object obj) {
                this.f6490a.m8095L0(r2, (roj0) obj);
            }
        }));
        r2.setViewTouchListener(new SwipeGuideLeftView.InterfaceC3138a() { // from class: l.o8h0
            @Override // com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideLeftView.InterfaceC3138a
            /* JADX INFO: renamed from: a */
            public final void mo3344a() {
                this.f6625a.m8096M0(r2, bVar, c4g0VarSubscribe);
            }
        });
        r2.setAlpha(0.0f);
        m8060k0(bVar.K1(), view, r2, pictureView, new e30() { // from class: l.q8h0
            public final void call(Object obj) {
                mah0.m8027R(r2, (Drawable) obj);
            }
        }, new d30() { // from class: l.r8h0
            public final void call() {
                r2.setBackgroundResource(x2c0.Sp);
            }
        });
        this.f6307o = true;
        CoreModule.c.m0.l2.onNext("left guide");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m8098O0(NewNewProfileCard newNewProfileCard, com.p1.mobile.putong.core.newui.home.b bVar, PictureView pictureView, boolean z) {
        newNewProfileCard.b3();
        m8125q0(bVar, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m8099P0(NewNewProfileCard newNewProfileCard, com.p1.mobile.putong.core.newui.home.b bVar, PictureView pictureView, boolean z) {
        newNewProfileCard.b3();
        m8125q0(bVar, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m8100Q0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, com.p1.mobile.putong.core.newui.home.b bVar, PictureView pictureView) {
        userProfileExpandedCardRoot.u1();
        m8123p0(bVar, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m8101R0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, com.p1.mobile.putong.core.newui.home.b bVar, PictureView pictureView) {
        userProfileExpandedCardRoot.u1();
        m8123p0(bVar, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: S0 */
    public long m8102S0() {
        return ((Long) this.f6294b.get()).longValue();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m8103T0() {
        return m8124p1() && ((Long) this.f6294b.get()).longValue() == 0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m8104V0() {
        this.f6293a.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: W0 */
    public void m8105W0(boolean z) {
        tpd0 tpd0Var = this.f6298f;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        if (z) {
            return;
        }
        tpd0 tpd0Var2 = this.f6299g;
        tpd0Var2.put(Integer.valueOf(((Integer) tpd0Var2.get()).intValue() + 1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m8106Y0() {
        this.f6296d.put(Boolean.TRUE);
        this.f6300h.put((Integer) this.f6298f.get());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m8107Z0(final com.p1.mobile.putong.core.newui.home.b bVar, final View view, final ViewStub viewStub, final PictureView pictureView) {
        if (viewStub == null) {
            return;
        }
        final View viewFindViewById = view.findViewById(viewStub.getInflatedId());
        bVar.P2();
        if (NullChecker.a(viewFindViewById) && xdl0.O0(viewFindViewById)) {
            m8065m1(bVar, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.jah0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8061l(bVar, view, viewFindViewById, pictureView);
                }
            });
            return;
        }
        viewStub.setLayoutResource(f6c0.sc);
        xdl0.M0(viewStub, true);
        m8065m1(bVar, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.kah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f5630a.m8097N0(view, viewStub, bVar, pictureView);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m8108a1(final Act act, final NewNewProfileCard newNewProfileCard) {
        final com.p1.mobile.putong.core.newui.home.b bVarM8031U0;
        final PictureView pictureViewY;
        if (!m8064m0() || act == null || newNewProfileCard == null || (bVarM8031U0 = m8031U0(act)) == null || (pictureViewY = newNewProfileCard.Y()) == null) {
            return;
        }
        if (NullChecker.a(newNewProfileCard.K1) && xdl0.O0(newNewProfileCard.K1)) {
            m8065m1(bVarM8031U0, newNewProfileCard, new Runnable() { // from class: l.e8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8068p(act, newNewProfileCard, pictureViewY, bVarM8031U0);
                }
            });
        }
        ViewStub viewStub = newNewProfileCard.v1;
        if (!NullChecker.a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = newNewProfileCard.findViewById(viewStub.getInflatedId());
        if (NullChecker.a(viewFindViewById) && xdl0.O0(viewFindViewById)) {
            m8065m1(bVarM8031U0, newNewProfileCard, new Runnable() { // from class: l.p8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8015F(act, newNewProfileCard, viewFindViewById, pictureViewY);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m8109b1(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
        final com.p1.mobile.putong.core.newui.home.b bVarM8031U0;
        final Act act2;
        final UserProfileExpandedCardRoot userProfileExpandedCardRoot2;
        if (!m8064m0() || act == null || userProfileExpandedCardRoot == null || (bVarM8031U0 = m8031U0(act)) == null) {
            return;
        }
        final View rootView = userProfileExpandedCardRoot.getRootView();
        final PictureView pictureViewY = userProfileExpandedCardRoot.Y();
        if (pictureViewY == null) {
            return;
        }
        if (NullChecker.a(userProfileExpandedCardRoot.p0) && xdl0.O0(userProfileExpandedCardRoot.p0)) {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
            m8065m1(bVarM8031U0, rootView, new Runnable() { // from class: l.lah0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8063m(act2, rootView, userProfileExpandedCardRoot2, pictureViewY, bVarM8031U0);
                }
            });
        } else {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
        }
        ViewStub viewStub = userProfileExpandedCardRoot2.S;
        if (!NullChecker.a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = userProfileExpandedCardRoot2.findViewById(viewStub.getInflatedId());
        if (NullChecker.a(viewFindViewById) && xdl0.O0(viewFindViewById)) {
            m8065m1(bVarM8031U0, rootView, new Runnable() { // from class: l.f8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m8017H(act2, userProfileExpandedCardRoot2, viewFindViewById, pictureViewY);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m8110d1(List<CoreSuggested.UserInfo> list) {
        if (vwb.J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if ("-145".equals(list.get(i).id)) {
                list.remove(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m8111e1(List<CoreSuggested.UserInfo> list) {
        if (((Long) this.f6294b.get()).longValue() > 0) {
            return;
        }
        for (int i = 1; i < list.size(); i++) {
            if ("-145".equals(list.get(i).id)) {
                list.remove(i);
                this.f6295c.put(Boolean.TRUE);
                this.f6294b.put(Long.valueOf(mqi0.o()));
                m8104V0();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m8112f1() {
        this.f6304l = false;
    }

    /* JADX INFO: renamed from: h0 */
    public void m8113h0(com.p1.mobile.putong.core.newui.home.b bVar, d5m d5mVar) {
        if (da.Companion.l()) {
            return;
        }
        if (NullChecker.a(d5mVar.getUserInfoProxy()) && m8082y0(d5mVar.getUserInfoProxy().id)) {
            this.f6295c.put(Boolean.TRUE);
            this.f6301i.put(0);
            m8128s1();
            if (ogl0.a0()) {
                myc0.d0().g = true;
            }
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            return;
        }
        m8104V0();
        if (((Boolean) this.f6296d.get()).booleanValue() && ((Integer) this.f6300h.get()).intValue() >= 0 && ((Integer) this.f6300h.get()).intValue() == ((Integer) this.f6298f.get()).intValue()) {
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            m8107Z0(bVar, d5mVar.getCardView(), d5mVar.t(), d5mVar.Y());
            return;
        }
        if (((Integer) this.f6299g.get()).intValue() > 0 && !((Boolean) this.f6296d.get()).booleanValue()) {
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            m8107Z0(bVar, d5mVar.getCardView(), d5mVar.t(), d5mVar.Y());
            this.f6296d.put(Boolean.TRUE);
            this.f6300h.put((Integer) this.f6298f.get());
            return;
        }
        if (!(((Integer) this.f6298f.get()).intValue() == 3 && ((Integer) this.f6299g.get()).intValue() == 3 && !((Boolean) this.f6297e.get()).booleanValue()) && (((Integer) this.f6298f.get()).intValue() < 15 || ((Boolean) this.f6297e.get()).booleanValue())) {
            return;
        }
        bVar.K1().postDelayed(new Runnable() { // from class: l.iah0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m8010A();
            }
        }, 800L);
        this.f6297e.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8114i0(com.p1.mobile.putong.core.newui.home.b bVar, e5m e5mVar) {
        if (NullChecker.a(e5mVar.getUserInfoProxy()) && m8082y0(e5mVar.getUserInfoProxy().id)) {
            this.f6295c.put(Boolean.TRUE);
            this.f6301i.put(0);
            m8128s1();
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            return;
        }
        m8104V0();
        if (((Boolean) this.f6296d.get()).booleanValue() && ((Integer) this.f6300h.get()).intValue() >= 0 && ((Integer) this.f6300h.get()).intValue() == ((Integer) this.f6298f.get()).intValue()) {
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            ((View) e5mVar).post(new RunnableC3377d(bVar, e5mVar));
            return;
        }
        if (((Integer) this.f6299g.get()).intValue() > 0 && !((Boolean) this.f6296d.get()).booleanValue()) {
            if (ogl0.a0()) {
                myc0.d0().g = true;
            }
            myc0.d0().h = true;
            com.p1.mobile.putong.core.ui.match.a.w().b = true;
            ((View) e5mVar).post(new RunnableC3378e(bVar, e5mVar));
            this.f6296d.put(Boolean.TRUE);
            this.f6300h.put((Integer) this.f6298f.get());
            return;
        }
        if (!(((Integer) this.f6298f.get()).intValue() == 3 && ((Integer) this.f6299g.get()).intValue() == 3 && !((Boolean) this.f6297e.get()).booleanValue()) && (((Integer) this.f6298f.get()).intValue() < 15 || ((Boolean) this.f6297e.get()).booleanValue())) {
            return;
        }
        bVar.K1().postDelayed(new Runnable() { // from class: l.a9h0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m8057j();
            }
        }, 800L);
        this.f6297e.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i1 */
    public void m8115i1(com.p1.mobile.putong.core.newui.home.b bVar, NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        m8053g1(newNewProfileCard, userInfo, i);
        if (i == 0) {
            m8126q1(bVar, newNewProfileCard, newNewProfileCard.u1, newNewProfileCard.T, false);
            return;
        }
        this.f6304l = false;
        if (NullChecker.a(newNewProfileCard.L1) && newNewProfileCard.L1.isRunning()) {
            newNewProfileCard.L1.end();
            newNewProfileCard.setRotation(0.0f);
            newNewProfileCard.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m8116j1(com.p1.mobile.putong.core.newui.home.b bVar, UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        m8055h1(userProfileExpandedCardRoot, userInfo, i);
        if (i == 0) {
            if (userProfileExpandedCardRoot.Y() != null) {
                m8127r1(bVar, userProfileExpandedCardRoot, userProfileExpandedCardRoot.R, userProfileExpandedCardRoot.Y());
                return;
            } else {
                userProfileExpandedCardRoot.postDelayed(new RunnableC3376c(bVar, userProfileExpandedCardRoot), 50L);
                return;
            }
        }
        this.f6304l = false;
        if (NullChecker.a(userProfileExpandedCardRoot.E0) && userProfileExpandedCardRoot.E0.isRunning()) {
            userProfileExpandedCardRoot.E0.end();
            userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
            userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m8117k1() {
        this.f6304l = false;
        this.f6303k = 0L;
    }

    /* JADX INFO: renamed from: l1 */
    public void m8118l1() {
        this.f6294b.put(0L);
        hpd0 hpd0Var = this.f6295c;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f6296d.put(bool);
        this.f6297e.put(bool);
        this.f6298f.put(0);
        this.f6299g.put(0);
        this.f6300h.put(-1);
        this.f6301i.put(-1);
        this.f6302j.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public void m8119n0() {
        this.f6300h.put(-1);
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m8120n1() {
        return (((Boolean) this.f6296d.get()).booleanValue() && ((Integer) this.f6300h.get()).intValue() >= 0 && ((Integer) this.f6300h.get()).intValue() == ((Integer) this.f6298f.get()).intValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m8121o0() {
        this.f6301i.put(-1);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m8122o1() {
        return (((Boolean) this.f6296d.get()).booleanValue() && ((Integer) this.f6301i.get()).intValue() >= 0 && ((Integer) this.f6298f.get()).intValue() == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: p0 */
    public final void m8123p0(com.p1.mobile.putong.core.newui.home.b bVar, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        zvf0.x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (userProfileExpandedCardRoot.E0 == null) {
            userProfileExpandedCardRoot.E0 = m8131u0(userProfileExpandedCardRoot.getRootView(), userProfileExpandedCardRoot);
        }
        final float pivotX = userProfileExpandedCardRoot.getRootView().getPivotX();
        final float pivotY = userProfileExpandedCardRoot.getRootView().getPivotY();
        final d30 d30Var = new d30() { // from class: l.j9h0
            public final void call() {
                this.f5278a.m8085B0(userProfileExpandedCardRoot, pivotX, pivotY);
            }
        };
        mkd0.z(userProfileExpandedCardRoot.F0);
        userProfileExpandedCardRoot.F0 = bVar.K1().duringCreated(this.f6305m).takeUntil(new w9j() { // from class: l.m9h0
            public final Object call(Object obj) {
                return Boolean.valueOf(!xdl0.O0(userProfileExpandedCardRoot.p0));
            }
        }).filter(new w9j() { // from class: l.n9h0
            public final Object call(Object obj) {
                return this.f6495a.m8086C0((roj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.o9h0
            public final void call(Object obj) {
                this.f6633a.m8087D0(userProfileExpandedCardRoot, (roj0) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe = this.f6306n.take(1).subscribe(mkd0.G(new e30() { // from class: l.p9h0
            public final void call(Object obj) {
                mah0.m8023N(userProfileExpandedCardRoot, (roj0) obj);
            }
        }));
        final long jO = mqi0.o();
        bVar.K1().duringCreated(this.f6293a).filter(new w9j() { // from class: l.q9h0
            public final Object call(Object obj) {
                return Boolean.valueOf(mqi0.o() - jO > 800);
            }
        }).filter(new w9j() { // from class: l.r9h0
            public final Object call(Object obj) {
                return this.f7149a.m8088E0((roj0) obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.s9h0
            public final void call(Object obj) {
                mah0.m8048e0(d30Var, userProfileExpandedCardRoot, c4g0VarSubscribe, (roj0) obj);
            }
        }));
        userProfileExpandedCardRoot.p0.setViewTouchListener(new SwipeGuideRightView.InterfaceC3140b() { // from class: l.t9h0
            @Override // com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideRightView.InterfaceC3140b
            /* JADX INFO: renamed from: a */
            public final void mo3349a() {
                this.f7541a.m8089F0(d30Var, userProfileExpandedCardRoot, c4g0VarSubscribe);
            }
        });
        NewMainAct newMainActK1 = bVar.K1();
        View rootView = userProfileExpandedCardRoot.getRootView();
        ?? r6 = userProfileExpandedCardRoot.p0;
        Objects.requireNonNull(r6);
        m8060k0(newMainActK1, rootView, r6, pictureView, new l8h0(r6), new d30() { // from class: l.k9h0
            public final void call() {
                userProfileExpandedCardRoot.p0.setBackgroundResource(x2c0.Sp);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m8124p1() {
        if (((Boolean) this.f6295c.get()).booleanValue() && ((Integer) this.f6301i.get()).intValue() == 0 && ((Integer) this.f6298f.get()).intValue() == 0) {
            return true;
        }
        return ((Integer) this.f6298f.get()).intValue() == 0 && ((Integer) this.f6299g.get()).intValue() == 0 && !((Boolean) this.f6295c.get()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.swipeguide.SwipeGuideRightView, java.lang.Object] */
    /* JADX INFO: renamed from: q0 */
    public final void m8125q0(com.p1.mobile.putong.core.newui.home.b bVar, final NewNewProfileCard newNewProfileCard, PictureView pictureView, final boolean z) {
        zvf0.x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (newNewProfileCard.L1 == null) {
            newNewProfileCard.L1 = m8129t0(newNewProfileCard);
        }
        final float pivotX = newNewProfileCard.getPivotX();
        final float pivotY = newNewProfileCard.getPivotY();
        final d30 d30Var = new d30() { // from class: l.s8h0
            public final void call() {
                this.f7299a.m8090G0(newNewProfileCard, pivotX, pivotY);
            }
        };
        mkd0.z(newNewProfileCard.M1);
        newNewProfileCard.M1 = bVar.K1().duringCreated(this.f6305m).takeUntil(new w9j() { // from class: l.u8h0
            public final Object call(Object obj) {
                return Boolean.valueOf(!xdl0.O0(newNewProfileCard.K1));
            }
        }).filter(new w9j() { // from class: l.v8h0
            public final Object call(Object obj) {
                return this.f7936a.m8091H0((roj0) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.w8h0
            public final void call(Object obj) {
                this.f8135a.m8092I0(newNewProfileCard, (roj0) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe = this.f6306n.take(1).subscribe(mkd0.G(new e30() { // from class: l.x8h0
            public final void call(Object obj) {
                mah0.m8040b(newNewProfileCard, (roj0) obj);
            }
        }));
        final long jO = mqi0.o();
        bVar.K1().duringCreated(this.f6293a).filter(new w9j() { // from class: l.y8h0
            public final Object call(Object obj) {
                return Boolean.valueOf(mqi0.o() - jO > 800);
            }
        }).filter(new w9j() { // from class: l.z8h0
            public final Object call(Object obj) {
                return this.f9200a.m8093J0(z, (roj0) obj);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.b9h0
            public final void call(Object obj) {
                mah0.m8069q(z, d30Var, newNewProfileCard, c4g0VarSubscribe, (roj0) obj);
            }
        }));
        newNewProfileCard.K1.setViewTouchListener(new SwipeGuideRightView.InterfaceC3140b() { // from class: l.c9h0
            @Override // com.p000p1.mobile.putong.core.p001ui.growth.swipeguide.SwipeGuideRightView.InterfaceC3140b
            /* JADX INFO: renamed from: a */
            public final void mo3349a() {
                this.f3991a.m8094K0(d30Var, newNewProfileCard, c4g0VarSubscribe, z);
            }
        });
        NewMainAct newMainActK1 = bVar.K1();
        ?? r2 = newNewProfileCard.K1;
        Objects.requireNonNull(r2);
        m8060k0(newMainActK1, newNewProfileCard, r2, pictureView, new l8h0(r2), new d30() { // from class: l.t8h0
            public final void call() {
                newNewProfileCard.K1.setBackgroundResource(x2c0.Sp);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m8126q1(final com.p1.mobile.putong.core.newui.home.b bVar, final NewNewProfileCard newNewProfileCard, ViewStub viewStub, final PictureView pictureView, final boolean z) {
        if (!this.f6304l && mqi0.o() - this.f6303k >= 500) {
            this.f6303k = mqi0.o();
            if (NullChecker.a(newNewProfileCard.K1) && xdl0.O0(newNewProfileCard.K1)) {
                m8065m1(bVar, newNewProfileCard, new Runnable() { // from class: l.g8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mah0.m8038a(bVar, newNewProfileCard, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.a(newNewProfileCard.K1)) {
                xdl0.M(newNewProfileCard.K1, true);
                newNewProfileCard.K1.m3348k0(z);
                bVar.P2();
                m8065m1(bVar, newNewProfileCard, new Runnable() { // from class: l.h8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4804a.m8098O0(newNewProfileCard, bVar, pictureView, z);
                    }
                });
                return;
            }
            if (NullChecker.a(viewStub)) {
                viewStub.setLayoutResource(f6c0.tc);
                SwipeGuideRightView swipeGuideRightView = (SwipeGuideRightView) viewStub.inflate();
                newNewProfileCard.K1 = swipeGuideRightView;
                swipeGuideRightView.m3348k0(z);
                bVar.P2();
                m8065m1(bVar, newNewProfileCard, new Runnable() { // from class: l.i8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5009a.m8099P0(newNewProfileCard, bVar, pictureView, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m8127r1(final com.p1.mobile.putong.core.newui.home.b bVar, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewStub viewStub, final PictureView pictureView) {
        if (!this.f6304l && mqi0.o() - this.f6303k >= 500) {
            this.f6303k = mqi0.o();
            View rootView = userProfileExpandedCardRoot.getRootView();
            if (NullChecker.a(userProfileExpandedCardRoot.p0) && xdl0.O0(userProfileExpandedCardRoot.p0)) {
                m8065m1(bVar, rootView, new Runnable() { // from class: l.l9h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mah0.m8026Q(bVar, userProfileExpandedCardRoot, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.a(userProfileExpandedCardRoot.p0)) {
                xdl0.M(userProfileExpandedCardRoot.p0, true);
                bVar.P2();
                m8065m1(bVar, rootView, new Runnable() { // from class: l.w9h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8142a.m8100Q0(userProfileExpandedCardRoot, bVar, pictureView);
                    }
                });
            } else if (NullChecker.a(viewStub)) {
                viewStub.setLayoutResource(f6c0.tc);
                userProfileExpandedCardRoot.p0 = (SwipeGuideRightView) viewStub.inflate();
                bVar.P2();
                m8065m1(bVar, rootView, new Runnable() { // from class: l.hah0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f4852a.m8101R0(userProfileExpandedCardRoot, bVar, pictureView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m8128s1() {
        this.f6305m.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: t0 */
    public final Animator m8129t0(View view) {
        return m8131u0(view, view);
    }

    /* JADX INFO: renamed from: t1 */
    public final String m8130t1() {
        return CoreModule.H().userId();
    }

    /* JADX INFO: renamed from: u0 */
    public final Animator m8131u0(final View view, final View view2) {
        final int i = t100.y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(ua60.a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bah0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                mah0.m8042c(view, i, i2, view2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C3375b(view2));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: x0 */
    public void m8132x0(List<CoreSuggested.UserInfo> list) {
        if ("-145".equals(list.get(0).id)) {
            return;
        }
        if (list.size() <= 1 || !"-145".equals(list.get(1).id)) {
            this.f6304l = false;
            m8104V0();
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.id = "-145";
            if (list.get(0).isVirtualCard()) {
                list.add(1, userInfo);
            } else {
                list.add(0, userInfo);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m8133z0() {
        if (((Boolean) this.f6296d.get()).booleanValue() && ((Integer) this.f6300h.get()).intValue() >= 0 && ((Integer) this.f6300h.get()).intValue() == ((Integer) this.f6298f.get()).intValue()) {
            return true;
        }
        return ((Integer) this.f6299g.get()).intValue() > 0 && !((Boolean) this.f6296d.get()).booleanValue();
    }
}
