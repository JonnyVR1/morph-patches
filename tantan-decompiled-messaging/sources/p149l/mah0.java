package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideLeftView;
import com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.ProfileZodiac;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mah0 {

    /* JADX INFO: renamed from: p */
    public static volatile mah0 f132853p = null;

    /* JADX INFO: renamed from: q */
    public static boolean f132854q = false;

    /* JADX INFO: renamed from: a */
    public C22393b<roj0> f132855a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public final zpd0 f132856b = new zpd0("new_swipe_guide_swipe_" + m153786t1(), 0L);

    /* JADX INFO: renamed from: c */
    public final hpd0 f132857c;

    /* JADX INFO: renamed from: d */
    public final hpd0 f132858d;

    /* JADX INFO: renamed from: e */
    public final hpd0 f132859e;

    /* JADX INFO: renamed from: f */
    public final tpd0 f132860f;

    /* JADX INFO: renamed from: g */
    public final tpd0 f132861g;

    /* JADX INFO: renamed from: h */
    public final tpd0 f132862h;

    /* JADX INFO: renamed from: i */
    public final tpd0 f132863i;

    /* JADX INFO: renamed from: j */
    public final hpd0 f132864j;

    /* JADX INFO: renamed from: k */
    public long f132865k;

    /* JADX INFO: renamed from: l */
    public boolean f132866l;

    /* JADX INFO: renamed from: m */
    public final C22392a<roj0> f132867m;

    /* JADX INFO: renamed from: n */
    public final C22393b<roj0> f132868n;

    /* JADX INFO: renamed from: o */
    public boolean f132869o;

    /* JADX INFO: renamed from: l.mah0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC18423a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f132870a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f132871b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f132872c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f132873d;

        public ViewTreeObserverOnGlobalLayoutListenerC18423a(FrameLayout frameLayout, AtomicBoolean atomicBoolean, View view, Runnable runnable) {
            this.f132870a = frameLayout;
            this.f132871b = atomicBoolean;
            this.f132872c = view;
            this.f132873d = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((this.f132870a.getMeasuredHeight() > 0 || this.f132870a.getHeight() > 0) && this.f132871b.compareAndSet(false, true)) {
                ViewTreeObserver viewTreeObserver = this.f132870a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                this.f132872c.post(this.f132873d);
            }
        }
    }

    /* JADX INFO: renamed from: l.mah0$b */
    public class C18424b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f132874a;

        public C18424b(View view) {
            this.f132874a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            mah0.m153714j0(this.f132874a, 0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            mah0.m153714j0(this.f132874a, 0.0f);
        }
    }

    /* JADX INFO: renamed from: l.mah0$c */
    public class RunnableC18425c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f132876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserProfileExpandedCardRoot f132877b;

        public RunnableC18425c(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
            this.f132876a = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f132877b = userProfileExpandedCardRoot;
        }

        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f132876a;
            UserProfileExpandedCardRoot userProfileExpandedCardRoot = this.f132877b;
            mah0Var.m153783r1(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot, userProfileExpandedCardRoot.f22320R, userProfileExpandedCardRoot.mo36864Y());
        }
    }

    /* JADX INFO: renamed from: l.mah0$d */
    public class RunnableC18426d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f132879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e5m f132880b;

        public RunnableC18426d(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, e5m e5mVar) {
            this.f132879a = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f132880b = e5mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f132879a;
            e5m e5mVar = this.f132880b;
            mah0Var.m153763Z0(viewTreeObserverOnGlobalLayoutListenerC7866b, (View) e5mVar, e5mVar.mo36932t(), this.f132880b.mo36864Y());
        }
    }

    /* JADX INFO: renamed from: l.mah0$e */
    public class RunnableC18427e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7866b f132882a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e5m f132883b;

        public RunnableC18427e(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, e5m e5mVar) {
            this.f132882a = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f132883b = e5mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            mah0 mah0Var = mah0.this;
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = this.f132882a;
            e5m e5mVar = this.f132883b;
            mah0Var.m153763Z0(viewTreeObserverOnGlobalLayoutListenerC7866b, (View) e5mVar, e5mVar.mo36932t(), this.f132883b.mo36864Y());
        }
    }

    public mah0() {
        String str = "swipe_guide_right_guide_show_" + m153786t1();
        Boolean bool = Boolean.FALSE;
        this.f132857c = new hpd0(str, bool);
        this.f132858d = new hpd0("swipe_guide_left_guide_show_" + m153786t1(), bool);
        this.f132859e = new hpd0("swipe_guide_setting_guide_show_" + m153786t1(), bool);
        this.f132860f = new tpd0("swipe_guide_total_swipe_count_" + m153786t1(), 0);
        this.f132861g = new tpd0("swipe_guide_total_swipe_left_count_" + m153786t1(), 0);
        this.f132862h = new tpd0("swipe_guide_group_swipe_count_left_show_" + m153786t1(), -1);
        this.f132863i = new tpd0("swipe_guide_group_swipe_count_right_show_" + m153786t1(), -1);
        this.f132864j = new hpd0("guide_to_swipe_has_shown_first_like" + m153786t1(), bool);
        this.f132865k = 0L;
        this.f132866l = false;
        this.f132867m = C22392a.m221512b();
        this.f132868n = C22393b.m221521b();
        this.f132869o = false;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m153666A() {
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m153667B(View view) {
        xdl0.m208344M(view, false);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m153671F(Act act, NewNewProfileCard newNewProfileCard, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m153716k0(act, newNewProfileCard, view, pictureView, new j8h0(view), new d30() { // from class: l.d9h0
            @Override // p149l.d30
            public final void call() {
                view.setBackgroundResource(x2c0.f189743Sp);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m153673H(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m153716k0(act, userProfileExpandedCardRoot, view, pictureView, new j8h0(view), new d30() { // from class: l.g9h0
            @Override // p149l.d30
            public final void call() {
                view.setBackgroundResource(x2c0.f189743Sp);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m153676K(PictureView pictureView, Act act, e30 e30Var, Pair pair) {
        if (((Boolean) pair.second).booleanValue() || !pictureView.f28045I0.m221515e().booleanValue()) {
            bfd0 bfd0VarM106505a = cfd0.m106505a(act.getResources(), (Bitmap) pair.first);
            bfd0VarM106505a.m101528e(t100.f167266o);
            e30Var.call(bfd0VarM106505a);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m153677L(AtomicBoolean atomicBoolean, FrameLayout frameLayout, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, Runnable runnable) {
        if (atomicBoolean.compareAndSet(false, true)) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m153678M(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m153679N(UserProfileExpandedCardRoot userProfileExpandedCardRoot, roj0 roj0Var) {
        if (NullChecker.m81303a(userProfileExpandedCardRoot.f22302E0) && userProfileExpandedCardRoot.f22302E0.isRunning()) {
            userProfileExpandedCardRoot.f22302E0.end();
        }
        mkd0.m154992z(userProfileExpandedCardRoot.f22304F0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m153682Q(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        View rootView = userProfileExpandedCardRoot.getRootView();
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f22327p0;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(newMainActAct, rootView, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.f9h0
            @Override // p149l.d30
            public final void call() {
                userProfileExpandedCardRoot.f22327p0.setBackgroundResource(x2c0.f189743Sp);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m153683R(SwipeGuideLeftView swipeGuideLeftView, Drawable drawable) {
        swipeGuideLeftView.setBackground(drawable);
        if (swipeGuideLeftView.getAlpha() == 0.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(swipeGuideLeftView, (Property<SwipeGuideLeftView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m153686U(Act act, d30 d30Var, Pair pair) {
        if (pair.first != null) {
            return Boolean.TRUE;
        }
        Objects.requireNonNull(d30Var);
        act.post(new bii0(d30Var));
        return Boolean.FALSE;
    }

    @Nullable
    /* JADX INFO: renamed from: U0 */
    public static ViewTreeObserverOnGlobalLayoutListenerC7866b m153687U0(Act act) {
        if (act != null && (act instanceof NewMainAct)) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.m39794V5() == null) {
                return null;
            }
            pcl0 pcl0VarM40422r6 = newMainAct.m39794V5().m40422r6(TabName.Card);
            if (pcl0VarM40422r6 instanceof psl) {
                pcl0VarM40422r6 = ((psl) pcl0VarM40422r6).mo38560Y();
            }
            if (pcl0VarM40422r6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) pcl0VarM40422r6).f21678C;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public static void m153691X0() {
        String str;
        try {
            User userM153727r0 = m153727r0("-145");
            if (vwb.m200296J(userM153727r0.pictures)) {
                return;
            }
            Media media = userM153727r0.pictures.get(0);
            if ((media instanceof Picture) && (str = ((Picture) media).url) != null && !str.isEmpty()) {
                qib0.f154691G.m102377x0(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m153694a(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final NewNewProfileCard newNewProfileCard, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f21710K1;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(newMainActAct, newNewProfileCard, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.e9h0
            @Override // p149l.d30
            public final void call() {
                newNewProfileCard.f21710K1.setBackgroundResource(x2c0.f189743Sp);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m153696b(NewNewProfileCard newNewProfileCard, roj0 roj0Var) {
        if (NullChecker.m81303a(newNewProfileCard.f21713L1) && newNewProfileCard.f21713L1.isRunning()) {
            newNewProfileCard.f21713L1.end();
        }
        mkd0.m154992z(newNewProfileCard.f21717M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m153698c(View view, int i, int i2, View view2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        } else {
            view.setTranslationX(0.0f);
            view.setRotation(0.0f);
        }
        m153714j0(view2, (float) Math.hypot(view.getTranslationX(), view.getTranslationY()));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m153700c1() {
        if (NullChecker.m81303a(f132853p)) {
            f132853p.f132868n.m132487l(roj0.f160388a);
            f132853p.f132867m.onCompleted();
            f132853p.f132855a.onCompleted();
            f132853p = null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m153702d0(Act act, d30 d30Var, Boolean bool) {
        Objects.requireNonNull(d30Var);
        act.post(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m153704e0(d30 d30Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, c4g0 c4g0Var, roj0 roj0Var) {
        d30Var.call();
        xdl0.m208344M(userProfileExpandedCardRoot.f22327p0, false);
        mkd0.m154992z(userProfileExpandedCardRoot.f22304F0);
        mkd0.m154992z(c4g0Var);
    }

    /* JADX INFO: renamed from: g1 */
    public static void m153709g1(NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        if (newNewProfileCard == null) {
            return;
        }
        newNewProfileCard.mo36852T(m153727r0(userInfo.f19472id), userInfo, i);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m153711h1(UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        if (userProfileExpandedCardRoot == null) {
            return;
        }
        userProfileExpandedCardRoot.mo36852T(m153727r0(userInfo.f19472id), userInfo, i);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m153713j() {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m153714j0(@Nullable View view, float f) {
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof BifrostLayout) {
                ((BifrostLayout) parent).m38798z(Math.max(0.0f, f));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m153716k0(Act act, View view, View view2, PictureView pictureView, e30<Drawable> e30Var, d30 d30Var) {
        m153718l0(act, view, view2, pictureView, e30Var, d30Var, false);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m153717l(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, View view, final View view2, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        Objects.requireNonNull(view2);
        m153716k0(newMainActAct, view, view2, pictureView, new j8h0(view2), new d30() { // from class: l.k8h0
            @Override // p149l.d30
            public final void call() {
                view2.setBackgroundResource(x2c0.f189743Sp);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m153718l0(final Act act, final View view, final View view2, final PictureView pictureView, final e30<Drawable> e30Var, final d30 d30Var, boolean z) {
        if (view.getWidth() > 0) {
            act.duringCreated(C22306c.fromCallable(new Callable() { // from class: l.v9h0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return mah0.m153734w(view, view2, pictureView, act, e30Var, d30Var);
                }
            }).compose(mkd0.m154966R()).observeOn(Schedulers.computation()).filter(new w9j() { // from class: l.x9h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return mah0.m153686U(act, d30Var, (Pair) obj);
                }
            }).flatMap(new w9j() { // from class: l.y9h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    View view3 = view;
                    Pair pair = (Pair) obj;
                    return C22306c.just(Pair.create(yij0.m214960p((Bitmap) pair.first, view3.getWidth(), view3.getHeight(), 2097152000), (Boolean) pair.second));
                }
            }).compose(mkd0.m154991y())).subscribe(mkd0.m154956H(new e30() { // from class: l.z9h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mah0.m153676K(pictureView, act, e30Var, (Pair) obj);
                }
            }, new e30() { // from class: l.aah0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mah0.m153726r((Throwable) obj);
                }
            }));
        } else {
            if (z) {
                return;
            }
            view.post(new Runnable() { // from class: l.u9h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153718l0(act, view, view2, pictureView, e30Var, d30Var, true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m153719m(Act act, View view, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f22327p0;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(act, view, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.h9h0
            @Override // p149l.d30
            public final void call() {
                userProfileExpandedCardRoot.f22327p0.setBackgroundResource(x2c0.f189743Sp);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m153720m0() {
        return vy8.m200609g() && !f132854q;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m153721m1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, View view, final Runnable runnable) {
        final FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC7866b.f21926f;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            runnable.run();
            return;
        }
        VLinear vLinear = viewTreeObserverOnGlobalLayoutListenerC7866b.f21924e;
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
        final ViewTreeObserverOnGlobalLayoutListenerC18423a viewTreeObserverOnGlobalLayoutListenerC18423a = new ViewTreeObserverOnGlobalLayoutListenerC18423a(frameLayout, atomicBoolean, view, runnable);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC18423a);
        view.postDelayed(new Runnable() { // from class: l.i9h0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m153677L(atomicBoolean, frameLayout, viewTreeObserverOnGlobalLayoutListenerC18423a, runnable);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m153724p(Act act, final NewNewProfileCard newNewProfileCard, PictureView pictureView, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f21710K1;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(act, newNewProfileCard, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.m8h0
            @Override // p149l.d30
            public final void call() {
                newNewProfileCard.f21710K1.setBackgroundResource(x2c0.f189743Sp);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m153725q(boolean z, d30 d30Var, NewNewProfileCard newNewProfileCard, c4g0 c4g0Var, roj0 roj0Var) {
        if (z) {
            C16319da.INSTANCE.m110513o(false);
        }
        d30Var.call();
        xdl0.m208344M(newNewProfileCard.f21710K1, false);
        mkd0.m154992z(newNewProfileCard.f21717M1);
        mkd0.m154992z(c4g0Var);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m153726r(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static User m153727r0(String str) {
        User userNew_ = User.new_();
        userNew_.f56011id = str;
        Picture pictureNew_ = Picture.new_();
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        Dimension dimension = pictureNew_.size;
        dimension.width = 600;
        dimension.height = 800;
        userNew_.pictures = vwb.m200299M(pictureNew_);
        userNew_.profile = Profile.new_();
        Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
        if (NullChecker.m81303a(settings) && (TEnum.equals(settings.getLookingFor(), "male") || (TEnum.equals(settings.getLookingFor(), "both") && TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "female")))) {
            userNew_.gender = Gender.get("male");
            userNew_.name = "会飞的鱼";
            userNew_.profile.zodiac = ProfileZodiac.get("aquarius");
            userNew_.age = 23;
            pictureNew_.url = "https://auto.tancdn.com/v1/raw/7d782cb5-c7be-4b16-badc-8ed85093b37b07.jpg";
            return userNew_;
        }
        userNew_.gender = Gender.get("female");
        userNew_.name = "圆圆的杰妮";
        userNew_.profile.zodiac = ProfileZodiac.get("leo");
        userNew_.age = 25;
        pictureNew_.url = "https://auto.tancdn.com/v1/raw/5b106d80-616a-4d70-9c42-f3348090e0de07.jpg";
        return userNew_;
    }

    /* JADX INFO: renamed from: s0 */
    public static mah0 m153729s0() {
        if (f132853p == null) {
            synchronized (mah0.class) {
                try {
                    if (f132853p == null) {
                        f132853p = new mah0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f132853p;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m153730t(View view, Act act, View view2, PictureView pictureView, e30 e30Var, d30 d30Var, Boolean bool) {
        if (view.getVisibility() == 8) {
            return;
        }
        m153716k0(act, view2, view, pictureView, e30Var, d30Var);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m153733v0(final View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        bt0.m103733f(objectAnimatorOfFloat, new Runnable() { // from class: l.cah0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m153667B(view);
            }
        });
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Pair m153734w(final View view, final View view2, final PictureView pictureView, final Act act, final e30 e30Var, final d30 d30Var) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (NullChecker.m81303a(view2)) {
                xdl0.m208345M0(view2, false);
            }
            Boolean boolM221515e = pictureView.f28045I0.m221515e();
            boolean zBooleanValue = boolM221515e.booleanValue();
            view.draw(canvas);
            if (NullChecker.m81303a(view2)) {
                xdl0.m208345M0(view2, true);
            }
            if (!zBooleanValue) {
                act.duringCreated(pictureView.f28045I0.filter(new w9j() { // from class: l.dah0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return mah0.m153678M((Boolean) obj);
                    }
                }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.eah0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        mah0.m153730t(view2, act, view, pictureView, e30Var, d30Var, (Boolean) obj);
                    }
                }));
                act.duringCreated(pictureView.f28045I0.skip(1).filter(new w9j() { // from class: l.fah0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((Boolean) obj).booleanValue());
                    }
                }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.gah0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        mah0.m153702d0(act, d30Var, (Boolean) obj);
                    }
                }));
            }
            return Pair.create(bitmapCreateBitmap, boolM221515e);
        } catch (OutOfMemoryError e) {
            CrashHelper.m81296c(e);
            return Pair.create(null, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m153735w0() {
        if (m153729s0().f132864j.get().booleanValue() || (NullChecker.m81303a(f132853p) && f132853p.f132858d.get().booleanValue() && f132853p.f132859e.get().booleanValue() && f132853p.f132862h.get().intValue() != f132853p.f132860f.get().intValue())) {
            f132854q = true;
            f132853p = null;
        } else {
            f132854q = false;
            m153691X0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m153738y0(String str) {
        return "-145".equals(str);
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m153740A0() {
        return this.f132866l;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m153741B0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, float f, float f2) {
        this.f132866l = false;
        if (userProfileExpandedCardRoot.f22302E0.isRunning()) {
            userProfileExpandedCardRoot.f22302E0.end();
        }
        userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
        userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotX(f);
        userProfileExpandedCardRoot.getRootView().setPivotY(f2);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ Boolean m153742C0(roj0 roj0Var) {
        return Boolean.valueOf(this.f132856b.get().longValue() == 0 && NullChecker.m81303a(CoreModule.f17545c.f19663m0.m31140r6()));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m153743D0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, roj0 roj0Var) {
        if (!"-145".equals(CoreModule.f17545c.f19663m0.m31140r6().f19472id) || this.f132866l) {
            return;
        }
        if (userProfileExpandedCardRoot.f22302E0.isRunning()) {
            this.f132866l = true;
            return;
        }
        userProfileExpandedCardRoot.getRootView().setPivotX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotY(userProfileExpandedCardRoot.getRootView().getHeight() * 1.5f);
        userProfileExpandedCardRoot.f22302E0.start();
        this.f132866l = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m153744E0(roj0 roj0Var) {
        return Boolean.valueOf(m153778o1());
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m153745F0(d30 d30Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, c4g0 c4g0Var) {
        d30Var.call();
        mkd0.m154992z(userProfileExpandedCardRoot.f22304F0);
        mkd0.m154992z(c4g0Var);
        if (this.f132856b.get().longValue() == 0) {
            this.f132856b.put(Long.valueOf(mqi0.m155944o()));
            m153777o0();
            zvf0.m220396r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m153746G0(NewNewProfileCard newNewProfileCard, float f, float f2) {
        this.f132866l = false;
        if (newNewProfileCard.f21713L1.isRunning()) {
            newNewProfileCard.f21713L1.end();
        }
        newNewProfileCard.setRotation(0.0f);
        newNewProfileCard.setTranslationX(0.0f);
        newNewProfileCard.setPivotX(f);
        newNewProfileCard.setPivotY(f2);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ Boolean m153747H0(roj0 roj0Var) {
        return Boolean.valueOf(this.f132856b.get().longValue() == 0 && NullChecker.m81303a(CoreModule.f17545c.f19663m0.m31140r6()));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m153748I0(NewNewProfileCard newNewProfileCard, roj0 roj0Var) {
        if (!"-145".equals(CoreModule.f17545c.f19663m0.m31140r6().f19472id) || this.f132866l) {
            if (this.f132866l && newNewProfileCard.f21713L1.isRunning()) {
                this.f132866l = false;
                newNewProfileCard.f21713L1.end();
                return;
            }
            return;
        }
        if (newNewProfileCard.f21713L1.isRunning()) {
            this.f132866l = true;
            return;
        }
        newNewProfileCard.setPivotX(0.0f);
        newNewProfileCard.setPivotY(newNewProfileCard.getHeight() * 1.5f);
        newNewProfileCard.f21713L1.start();
        this.f132866l = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ Boolean m153749J0(boolean z, roj0 roj0Var) {
        return Boolean.valueOf(m153778o1() || z);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m153750K0(d30 d30Var, NewNewProfileCard newNewProfileCard, c4g0 c4g0Var, boolean z) {
        d30Var.call();
        mkd0.m154992z(newNewProfileCard.f21717M1);
        mkd0.m154992z(c4g0Var);
        if (z) {
            C16319da.INSTANCE.m110513o(false);
        } else if (this.f132856b.get().longValue() == 0) {
            this.f132856b.put(Long.valueOf(mqi0.m155944o()));
            m153777o0();
            zvf0.m220396r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m153751L0(SwipeGuideLeftView swipeGuideLeftView, roj0 roj0Var) {
        if (m153776n1() && xdl0.m208349O0(swipeGuideLeftView)) {
            m153733v0(swipeGuideLeftView);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m153752M0(SwipeGuideLeftView swipeGuideLeftView, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, c4g0 c4g0Var) {
        if (xdl0.m208349O0(swipeGuideLeftView)) {
            m153733v0(swipeGuideLeftView);
        }
        m153775n0();
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37286e6();
        mkd0.m154992z(c4g0Var);
        zvf0.m220396r("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m153753N0(View view, ViewStub viewStub, final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, PictureView pictureView) {
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).m36875b3();
        } else if (view instanceof UserProfileExpandedCardRoot) {
            ((UserProfileExpandedCardRoot) view).m37979u1();
        }
        zvf0.m220402x("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
        final SwipeGuideLeftView swipeGuideLeftView = (SwipeGuideLeftView) view.findViewById(viewStub.getInflatedId());
        final c4g0 c4g0VarSubscribe = viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(this.f132855a).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.n8h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137645a.m153751L0(swipeGuideLeftView, (roj0) obj);
            }
        }));
        swipeGuideLeftView.setViewTouchListener(new SwipeGuideLeftView.InterfaceC8363a() { // from class: l.o8h0
            @Override // com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideLeftView.InterfaceC8363a
            /* JADX INFO: renamed from: a */
            public final void mo45989a() {
                this.f142630a.m153752M0(swipeGuideLeftView, viewTreeObserverOnGlobalLayoutListenerC7866b, c4g0VarSubscribe);
            }
        });
        swipeGuideLeftView.setAlpha(0.0f);
        m153716k0(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), view, swipeGuideLeftView, pictureView, new e30() { // from class: l.q8h0
            @Override // p149l.e30
            public final void call(Object obj) {
                mah0.m153683R(swipeGuideLeftView, (Drawable) obj);
            }
        }, new d30() { // from class: l.r8h0
            @Override // p149l.d30
            public final void call() {
                swipeGuideLeftView.setBackgroundResource(x2c0.f189743Sp);
            }
        });
        this.f132869o = true;
        CoreModule.f17545c.f19663m0.f19429l2.m132487l("left guide");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m153754O0(NewNewProfileCard newNewProfileCard, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, PictureView pictureView, boolean z) {
        newNewProfileCard.m36875b3();
        m153781q0(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m153755P0(NewNewProfileCard newNewProfileCard, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, PictureView pictureView, boolean z) {
        newNewProfileCard.m36875b3();
        m153781q0(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m153756Q0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, PictureView pictureView) {
        userProfileExpandedCardRoot.m37979u1();
        m153779p0(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m153757R0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, PictureView pictureView) {
        userProfileExpandedCardRoot.m37979u1();
        m153779p0(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: S0 */
    public long m153758S0() {
        return this.f132856b.get().longValue();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m153759T0() {
        return m153780p1() && this.f132856b.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m153760V0() {
        this.f132855a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: W0 */
    public void m153761W0(boolean z) {
        tpd0 tpd0Var = this.f132860f;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        if (z) {
            return;
        }
        tpd0 tpd0Var2 = this.f132861g;
        tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m153762Y0() {
        this.f132858d.put(Boolean.TRUE);
        this.f132862h.put(this.f132860f.get());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m153763Z0(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final View view, final ViewStub viewStub, final PictureView pictureView) {
        if (viewStub == null) {
            return;
        }
        final View viewFindViewById = view.findViewById(viewStub.getInflatedId());
        viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
        if (NullChecker.m81303a(viewFindViewById) && xdl0.m208349O0(viewFindViewById)) {
            m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.jah0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153717l(viewTreeObserverOnGlobalLayoutListenerC7866b, view, viewFindViewById, pictureView);
                }
            });
            return;
        }
        viewStub.setLayoutResource(f6c0.f96000sc);
        xdl0.m208345M0(viewStub, true);
        m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.kah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122114a.m153753N0(view, viewStub, viewTreeObserverOnGlobalLayoutListenerC7866b, pictureView);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m153764a1(final Act act, final NewNewProfileCard newNewProfileCard) {
        final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0;
        final PictureView pictureViewMo36864Y;
        if (!m153720m0() || act == null || newNewProfileCard == null || (viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0 = m153687U0(act)) == null || (pictureViewMo36864Y = newNewProfileCard.mo36864Y()) == null) {
            return;
        }
        if (NullChecker.m81303a(newNewProfileCard.f21710K1) && xdl0.m208349O0(newNewProfileCard.f21710K1)) {
            m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0, newNewProfileCard, new Runnable() { // from class: l.e8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153724p(act, newNewProfileCard, pictureViewMo36864Y, viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0);
                }
            });
        }
        ViewStub viewStub = newNewProfileCard.f21799v1;
        if (!NullChecker.m81303a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = newNewProfileCard.findViewById(viewStub.getInflatedId());
        if (NullChecker.m81303a(viewFindViewById) && xdl0.m208349O0(viewFindViewById)) {
            m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0, newNewProfileCard, new Runnable() { // from class: l.p8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153671F(act, newNewProfileCard, viewFindViewById, pictureViewMo36864Y);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m153765b1(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
        final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0;
        final Act act2;
        final UserProfileExpandedCardRoot userProfileExpandedCardRoot2;
        if (!m153720m0() || act == null || userProfileExpandedCardRoot == null || (viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0 = m153687U0(act)) == null) {
            return;
        }
        final View rootView = userProfileExpandedCardRoot.getRootView();
        final PictureView pictureViewMo36864Y = userProfileExpandedCardRoot.mo36864Y();
        if (pictureViewMo36864Y == null) {
            return;
        }
        if (NullChecker.m81303a(userProfileExpandedCardRoot.f22327p0) && xdl0.m208349O0(userProfileExpandedCardRoot.f22327p0)) {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
            m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0, rootView, new Runnable() { // from class: l.lah0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153719m(act2, rootView, userProfileExpandedCardRoot2, pictureViewMo36864Y, viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0);
                }
            });
        } else {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
        }
        ViewStub viewStub = userProfileExpandedCardRoot2.f22321S;
        if (!NullChecker.m81303a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = userProfileExpandedCardRoot2.findViewById(viewStub.getInflatedId());
        if (NullChecker.m81303a(viewFindViewById) && xdl0.m208349O0(viewFindViewById)) {
            m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866bM153687U0, rootView, new Runnable() { // from class: l.f8h0
                @Override // java.lang.Runnable
                public final void run() {
                    mah0.m153673H(act2, userProfileExpandedCardRoot2, viewFindViewById, pictureViewMo36864Y);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m153766d1(List<CoreSuggested.UserInfo> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if ("-145".equals(list.get(i).f19472id)) {
                list.remove(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m153767e1(List<CoreSuggested.UserInfo> list) {
        if (this.f132856b.get().longValue() > 0) {
            return;
        }
        for (int i = 1; i < list.size(); i++) {
            if ("-145".equals(list.get(i).f19472id)) {
                list.remove(i);
                this.f132857c.put(Boolean.TRUE);
                this.f132856b.put(Long.valueOf(mqi0.m155944o()));
                m153760V0();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m153768f1() {
        this.f132866l = false;
    }

    /* JADX INFO: renamed from: h0 */
    public void m153769h0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, d5m d5mVar) {
        if (C16319da.INSTANCE.m110511l()) {
            return;
        }
        if (NullChecker.m81303a(d5mVar.getUserInfoProxy()) && m153738y0(d5mVar.getUserInfoProxy().f19472id)) {
            this.f132857c.put(Boolean.TRUE);
            this.f132863i.put(0);
            m153784s1();
            if (ogl0.m164248a0()) {
                myc0.m157001d0().f136282g = true;
            }
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            return;
        }
        m153760V0();
        if (this.f132858d.get().booleanValue() && this.f132862h.get().intValue() >= 0 && this.f132862h.get().intValue() == this.f132860f.get().intValue()) {
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            m153763Z0(viewTreeObserverOnGlobalLayoutListenerC7866b, d5mVar.getCardView(), d5mVar.mo36932t(), d5mVar.mo36864Y());
            return;
        }
        if (this.f132861g.get().intValue() > 0 && !this.f132858d.get().booleanValue()) {
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            m153763Z0(viewTreeObserverOnGlobalLayoutListenerC7866b, d5mVar.getCardView(), d5mVar.mo36932t(), d5mVar.mo36864Y());
            this.f132858d.put(Boolean.TRUE);
            this.f132862h.put(this.f132860f.get());
            return;
        }
        if (!(this.f132860f.get().intValue() == 3 && this.f132861g.get().intValue() == 3 && !this.f132859e.get().booleanValue()) && (this.f132860f.get().intValue() < 15 || this.f132859e.get().booleanValue())) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.iah0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m153666A();
            }
        }, 800L);
        this.f132859e.put(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m153770i0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, e5m e5mVar) {
        if (NullChecker.m81303a(e5mVar.getUserInfoProxy()) && m153738y0(e5mVar.getUserInfoProxy().f19472id)) {
            this.f132857c.put(Boolean.TRUE);
            this.f132863i.put(0);
            m153784s1();
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            return;
        }
        m153760V0();
        if (this.f132858d.get().booleanValue() && this.f132862h.get().intValue() >= 0 && this.f132862h.get().intValue() == this.f132860f.get().intValue()) {
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            ((View) e5mVar).post(new RunnableC18426d(viewTreeObserverOnGlobalLayoutListenerC7866b, e5mVar));
            return;
        }
        if (this.f132861g.get().intValue() > 0 && !this.f132858d.get().booleanValue()) {
            if (ogl0.m164248a0()) {
                myc0.m157001d0().f136282g = true;
            }
            myc0.m157001d0().f136283h = true;
            C8455a.m47588w().f30476b = true;
            ((View) e5mVar).post(new RunnableC18427e(viewTreeObserverOnGlobalLayoutListenerC7866b, e5mVar));
            this.f132858d.put(Boolean.TRUE);
            this.f132862h.put(this.f132860f.get());
            return;
        }
        if (!(this.f132860f.get().intValue() == 3 && this.f132861g.get().intValue() == 3 && !this.f132859e.get().booleanValue()) && (this.f132860f.get().intValue() < 15 || this.f132859e.get().booleanValue())) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().postDelayed(new Runnable() { // from class: l.a9h0
            @Override // java.lang.Runnable
            public final void run() {
                mah0.m153713j();
            }
        }, 800L);
        this.f132859e.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i1 */
    public void m153771i1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        m153709g1(newNewProfileCard, userInfo, i);
        if (i == 0) {
            m153782q1(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, newNewProfileCard.f21797u1, newNewProfileCard.f21737T, false);
            return;
        }
        this.f132866l = false;
        if (NullChecker.m81303a(newNewProfileCard.f21713L1) && newNewProfileCard.f21713L1.isRunning()) {
            newNewProfileCard.f21713L1.end();
            newNewProfileCard.setRotation(0.0f);
            newNewProfileCard.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m153772j1(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        m153711h1(userProfileExpandedCardRoot, userInfo, i);
        if (i == 0) {
            if (userProfileExpandedCardRoot.mo36864Y() != null) {
                m153783r1(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot, userProfileExpandedCardRoot.f22320R, userProfileExpandedCardRoot.mo36864Y());
                return;
            } else {
                userProfileExpandedCardRoot.postDelayed(new RunnableC18425c(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot), 50L);
                return;
            }
        }
        this.f132866l = false;
        if (NullChecker.m81303a(userProfileExpandedCardRoot.f22302E0) && userProfileExpandedCardRoot.f22302E0.isRunning()) {
            userProfileExpandedCardRoot.f22302E0.end();
            userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
            userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m153773k1() {
        this.f132866l = false;
        this.f132865k = 0L;
    }

    /* JADX INFO: renamed from: l1 */
    public void m153774l1() {
        this.f132856b.put(0L);
        hpd0 hpd0Var = this.f132857c;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        this.f132858d.put(bool);
        this.f132859e.put(bool);
        this.f132860f.put(0);
        this.f132861g.put(0);
        this.f132862h.put(-1);
        this.f132863i.put(-1);
        this.f132864j.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public void m153775n0() {
        this.f132862h.put(-1);
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m153776n1() {
        return (this.f132858d.get().booleanValue() && this.f132862h.get().intValue() >= 0 && this.f132862h.get().intValue() == this.f132860f.get().intValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m153777o0() {
        this.f132863i.put(-1);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m153778o1() {
        return (this.f132858d.get().booleanValue() && this.f132863i.get().intValue() >= 0 && this.f132860f.get().intValue() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m153779p0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        zvf0.m220402x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (userProfileExpandedCardRoot.f22302E0 == null) {
            userProfileExpandedCardRoot.f22302E0 = m153787u0(userProfileExpandedCardRoot.getRootView(), userProfileExpandedCardRoot);
        }
        final float pivotX = userProfileExpandedCardRoot.getRootView().getPivotX();
        final float pivotY = userProfileExpandedCardRoot.getRootView().getPivotY();
        final d30 d30Var = new d30() { // from class: l.j9h0
            @Override // p149l.d30
            public final void call() {
                this.f116925a.m153741B0(userProfileExpandedCardRoot, pivotX, pivotY);
            }
        };
        mkd0.m154992z(userProfileExpandedCardRoot.f22304F0);
        userProfileExpandedCardRoot.f22304F0 = viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(this.f132867m).takeUntil(new w9j() { // from class: l.m9h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xdl0.m208349O0(userProfileExpandedCardRoot.f22327p0));
            }
        }).filter(new w9j() { // from class: l.n9h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137807a.m153742C0((roj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.o9h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142718a.m153743D0(userProfileExpandedCardRoot, (roj0) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe = this.f132868n.take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.p9h0
            @Override // p149l.e30
            public final void call(Object obj) {
                mah0.m153679N(userProfileExpandedCardRoot, (roj0) obj);
            }
        }));
        final long jM155944o = mqi0.m155944o();
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(this.f132855a).filter(new w9j() { // from class: l.q9h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(mqi0.m155944o() - jM155944o > 800);
            }
        }).filter(new w9j() { // from class: l.r9h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158378a.m153744E0((roj0) obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.s9h0
            @Override // p149l.e30
            public final void call(Object obj) {
                mah0.m153704e0(d30Var, userProfileExpandedCardRoot, c4g0VarSubscribe, (roj0) obj);
            }
        }));
        userProfileExpandedCardRoot.f22327p0.setViewTouchListener(new SwipeGuideRightView.InterfaceC8365b() { // from class: l.t9h0
            @Override // com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView.InterfaceC8365b
            /* JADX INFO: renamed from: a */
            public final void mo45994a() {
                this.f169029a.m153745F0(d30Var, userProfileExpandedCardRoot, c4g0VarSubscribe);
            }
        });
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        View rootView = userProfileExpandedCardRoot.getRootView();
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f22327p0;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(newMainActAct, rootView, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.k9h0
            @Override // p149l.d30
            public final void call() {
                userProfileExpandedCardRoot.f22327p0.setBackgroundResource(x2c0.f189743Sp);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m153780p1() {
        if (this.f132857c.get().booleanValue() && this.f132863i.get().intValue() == 0 && this.f132860f.get().intValue() == 0) {
            return true;
        }
        return this.f132860f.get().intValue() == 0 && this.f132861g.get().intValue() == 0 && !this.f132857c.get().booleanValue();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m153781q0(ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final NewNewProfileCard newNewProfileCard, PictureView pictureView, final boolean z) {
        zvf0.m220402x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (newNewProfileCard.f21713L1 == null) {
            newNewProfileCard.f21713L1 = m153785t0(newNewProfileCard);
        }
        final float pivotX = newNewProfileCard.getPivotX();
        final float pivotY = newNewProfileCard.getPivotY();
        final d30 d30Var = new d30() { // from class: l.s8h0
            @Override // p149l.d30
            public final void call() {
                this.f163060a.m153746G0(newNewProfileCard, pivotX, pivotY);
            }
        };
        mkd0.m154992z(newNewProfileCard.f21717M1);
        newNewProfileCard.f21717M1 = viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(this.f132867m).takeUntil(new w9j() { // from class: l.u8h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!xdl0.m208349O0(newNewProfileCard.f21710K1));
            }
        }).filter(new w9j() { // from class: l.v8h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180534a.m153747H0((roj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.w8h0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185214a.m153748I0(newNewProfileCard, (roj0) obj);
            }
        }));
        final c4g0 c4g0VarSubscribe = this.f132868n.take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.x8h0
            @Override // p149l.e30
            public final void call(Object obj) {
                mah0.m153696b(newNewProfileCard, (roj0) obj);
            }
        }));
        final long jM155944o = mqi0.m155944o();
        viewTreeObserverOnGlobalLayoutListenerC7866b.act().duringCreated(this.f132855a).filter(new w9j() { // from class: l.y8h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(mqi0.m155944o() - jM155944o > 800);
            }
        }).filter(new w9j() { // from class: l.z8h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202165a.m153749J0(z, (roj0) obj);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.b9h0
            @Override // p149l.e30
            public final void call(Object obj) {
                mah0.m153725q(z, d30Var, newNewProfileCard, c4g0VarSubscribe, (roj0) obj);
            }
        }));
        newNewProfileCard.f21710K1.setViewTouchListener(new SwipeGuideRightView.InterfaceC8365b() { // from class: l.c9h0
            @Override // com.p046p1.mobile.putong.core.p053ui.growth.swipeguide.SwipeGuideRightView.InterfaceC8365b
            /* JADX INFO: renamed from: a */
            public final void mo45994a() {
                this.f79933a.m153750K0(d30Var, newNewProfileCard, c4g0VarSubscribe, z);
            }
        });
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC7866b.act();
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f21710K1;
        Objects.requireNonNull(swipeGuideRightView);
        m153716k0(newMainActAct, newNewProfileCard, swipeGuideRightView, pictureView, new l8h0(swipeGuideRightView), new d30() { // from class: l.t8h0
            @Override // p149l.d30
            public final void call() {
                newNewProfileCard.f21710K1.setBackgroundResource(x2c0.f189743Sp);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m153782q1(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final NewNewProfileCard newNewProfileCard, ViewStub viewStub, final PictureView pictureView, final boolean z) {
        if (!this.f132866l && mqi0.m155944o() - this.f132865k >= 500) {
            this.f132865k = mqi0.m155944o();
            if (NullChecker.m81303a(newNewProfileCard.f21710K1) && xdl0.m208349O0(newNewProfileCard.f21710K1)) {
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, new Runnable() { // from class: l.g8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mah0.m153694a(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.m81303a(newNewProfileCard.f21710K1)) {
                xdl0.m208344M(newNewProfileCard.f21710K1, true);
                newNewProfileCard.f21710K1.m45993k0(z);
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, new Runnable() { // from class: l.h8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f106437a.m153754O0(newNewProfileCard, viewTreeObserverOnGlobalLayoutListenerC7866b, pictureView, z);
                    }
                });
                return;
            }
            if (NullChecker.m81303a(viewStub)) {
                viewStub.setLayoutResource(f6c0.f96017tc);
                SwipeGuideRightView swipeGuideRightView = (SwipeGuideRightView) viewStub.inflate();
                newNewProfileCard.f21710K1 = swipeGuideRightView;
                swipeGuideRightView.m45993k0(z);
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, newNewProfileCard, new Runnable() { // from class: l.i8h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f112040a.m153755P0(newNewProfileCard, viewTreeObserverOnGlobalLayoutListenerC7866b, pictureView, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m153783r1(final ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewStub viewStub, final PictureView pictureView) {
        if (!this.f132866l && mqi0.m155944o() - this.f132865k >= 500) {
            this.f132865k = mqi0.m155944o();
            View rootView = userProfileExpandedCardRoot.getRootView();
            if (NullChecker.m81303a(userProfileExpandedCardRoot.f22327p0) && xdl0.m208349O0(userProfileExpandedCardRoot.f22327p0)) {
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, rootView, new Runnable() { // from class: l.l9h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mah0.m153682Q(viewTreeObserverOnGlobalLayoutListenerC7866b, userProfileExpandedCardRoot, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.m81303a(userProfileExpandedCardRoot.f22327p0)) {
                xdl0.m208344M(userProfileExpandedCardRoot.f22327p0, true);
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, rootView, new Runnable() { // from class: l.w9h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f185354a.m153756Q0(userProfileExpandedCardRoot, viewTreeObserverOnGlobalLayoutListenerC7866b, pictureView);
                    }
                });
            } else if (NullChecker.m81303a(viewStub)) {
                viewStub.setLayoutResource(f6c0.f96017tc);
                userProfileExpandedCardRoot.f22327p0 = (SwipeGuideRightView) viewStub.inflate();
                viewTreeObserverOnGlobalLayoutListenerC7866b.m37204P2();
                m153721m1(viewTreeObserverOnGlobalLayoutListenerC7866b, rootView, new Runnable() { // from class: l.hah0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f106740a.m153757R0(userProfileExpandedCardRoot, viewTreeObserverOnGlobalLayoutListenerC7866b, pictureView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m153784s1() {
        this.f132867m.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: t0 */
    public final Animator m153785t0(View view) {
        return m153787u0(view, view);
    }

    /* JADX INFO: renamed from: t1 */
    public final String m153786t1() {
        return CoreModule.m29931H().userId();
    }

    /* JADX INFO: renamed from: u0 */
    public final Animator m153787u0(final View view, final View view2) {
        final int i = t100.f167276y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(ua60.m192732a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bah0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                mah0.m153698c(view, i, i2, view2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C18424b(view2));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: x0 */
    public void m153788x0(List<CoreSuggested.UserInfo> list) {
        if ("-145".equals(list.get(0).f19472id)) {
            return;
        }
        if (list.size() <= 1 || !"-145".equals(list.get(1).f19472id)) {
            this.f132866l = false;
            m153760V0();
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = "-145";
            if (list.get(0).isVirtualCard()) {
                list.add(1, userInfo);
            } else {
                list.add(0, userInfo);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m153789z0() {
        if (this.f132858d.get().booleanValue() && this.f132862h.get().intValue() >= 0 && this.f132862h.get().intValue() == this.f132860f.get().intValue()) {
            return true;
        }
        return this.f132861g.get().intValue() > 0 && !this.f132858d.get().booleanValue();
    }
}
