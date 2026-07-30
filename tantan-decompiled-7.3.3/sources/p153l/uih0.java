package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.core.newui.home.opt.BifrostLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideLeftView;
import com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.ProfileZodiac;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class uih0 {

    /* JADX INFO: renamed from: p */
    public static volatile uih0 f179097p = null;

    /* JADX INFO: renamed from: q */
    public static boolean f179098q = false;

    /* JADX INFO: renamed from: a */
    public C22508b<uxj0> f179099a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public final byd0 f179100b = new byd0("new_swipe_guide_swipe_" + m196280t1(), 0L);

    /* JADX INFO: renamed from: c */
    public final jxd0 f179101c;

    /* JADX INFO: renamed from: d */
    public final jxd0 f179102d;

    /* JADX INFO: renamed from: e */
    public final jxd0 f179103e;

    /* JADX INFO: renamed from: f */
    public final vxd0 f179104f;

    /* JADX INFO: renamed from: g */
    public final vxd0 f179105g;

    /* JADX INFO: renamed from: h */
    public final vxd0 f179106h;

    /* JADX INFO: renamed from: i */
    public final vxd0 f179107i;

    /* JADX INFO: renamed from: j */
    public final jxd0 f179108j;

    /* JADX INFO: renamed from: k */
    public long f179109k;

    /* JADX INFO: renamed from: l */
    public boolean f179110l;

    /* JADX INFO: renamed from: m */
    public final C22507a<uxj0> f179111m;

    /* JADX INFO: renamed from: n */
    public final C22508b<uxj0> f179112n;

    /* JADX INFO: renamed from: o */
    public boolean f179113o;

    /* JADX INFO: renamed from: l.uih0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC20579a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout f179114a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f179115b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f179116c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Runnable f179117d;

        public ViewTreeObserverOnGlobalLayoutListenerC20579a(FrameLayout frameLayout, AtomicBoolean atomicBoolean, View view, Runnable runnable) {
            this.f179114a = frameLayout;
            this.f179115b = atomicBoolean;
            this.f179116c = view;
            this.f179117d = runnable;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if ((this.f179114a.getMeasuredHeight() > 0 || this.f179114a.getHeight() > 0) && this.f179115b.compareAndSet(false, true)) {
                ViewTreeObserver viewTreeObserver = this.f179114a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                this.f179116c.post(this.f179117d);
            }
        }
    }

    /* JADX INFO: renamed from: l.uih0$b */
    public class C20580b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f179118a;

        public C20580b(View view) {
            this.f179118a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            uih0.m196208j0(this.f179118a, 0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            uih0.m196208j0(this.f179118a, 0.0f);
        }
    }

    /* JADX INFO: renamed from: l.uih0$c */
    public class RunnableC20581c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f179120a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UserProfileExpandedCardRoot f179121b;

        public RunnableC20581c(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
            this.f179120a = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f179121b = userProfileExpandedCardRoot;
        }

        @Override // java.lang.Runnable
        public void run() {
            uih0 uih0Var = uih0.this;
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f179120a;
            UserProfileExpandedCardRoot userProfileExpandedCardRoot = this.f179121b;
            uih0Var.m196277r1(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot, userProfileExpandedCardRoot.f23062R, userProfileExpandedCardRoot.mo37867Y());
        }
    }

    /* JADX INFO: renamed from: l.uih0$d */
    public class RunnableC20582d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f179123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ u7m f179124b;

        public RunnableC20582d(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, u7m u7mVar) {
            this.f179123a = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f179124b = u7mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            uih0 uih0Var = uih0.this;
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f179123a;
            u7m u7mVar = this.f179124b;
            uih0Var.m196257Z0(viewTreeObserverOnGlobalLayoutListenerC8017b, (View) u7mVar, u7mVar.mo37935t(), this.f179124b.mo37867Y());
        }
    }

    /* JADX INFO: renamed from: l.uih0$e */
    public class RunnableC20583e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC8017b f179126a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ u7m f179127b;

        public RunnableC20583e(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, u7m u7mVar) {
            this.f179126a = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f179127b = u7mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            uih0 uih0Var = uih0.this;
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = this.f179126a;
            u7m u7mVar = this.f179127b;
            uih0Var.m196257Z0(viewTreeObserverOnGlobalLayoutListenerC8017b, (View) u7mVar, u7mVar.mo37935t(), this.f179127b.mo37867Y());
        }
    }

    public uih0() {
        String str = "swipe_guide_right_guide_show_" + m196280t1();
        Boolean bool = Boolean.FALSE;
        this.f179101c = new jxd0(str, bool);
        this.f179102d = new jxd0("swipe_guide_left_guide_show_" + m196280t1(), bool);
        this.f179103e = new jxd0("swipe_guide_setting_guide_show_" + m196280t1(), bool);
        this.f179104f = new vxd0("swipe_guide_total_swipe_count_" + m196280t1(), 0);
        this.f179105g = new vxd0("swipe_guide_total_swipe_left_count_" + m196280t1(), 0);
        this.f179106h = new vxd0("swipe_guide_group_swipe_count_left_show_" + m196280t1(), -1);
        this.f179107i = new vxd0("swipe_guide_group_swipe_count_right_show_" + m196280t1(), -1);
        this.f179108j = new jxd0("guide_to_swipe_has_shown_first_like" + m196280t1(), bool);
        this.f179109k = 0L;
        this.f179110l = false;
        this.f179111m = C22507a.m222758b();
        this.f179112n = C22508b.m222767b();
        this.f179113o = false;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m196160A() {
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m196161B(View view) {
        bnl0.m105524M(view, false);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m196165F(Act act, NewNewProfileCard newNewProfileCard, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m196210k0(act, newNewProfileCard, view, pictureView, new rgh0(view), new x20() { // from class: l.lhh0
            @Override // p153l.x20
            public final void call() {
                view.setBackgroundResource(dbc0.f86195Gq);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m196167H(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot, final View view, PictureView pictureView) {
        Objects.requireNonNull(view);
        m196210k0(act, userProfileExpandedCardRoot, view, pictureView, new rgh0(view), new x20() { // from class: l.ohh0
            @Override // p153l.x20
            public final void call() {
                view.setBackgroundResource(dbc0.f86195Gq);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m196170K(PictureView pictureView, Act act, y20 y20Var, Pair pair) {
        if (((Boolean) pair.second).booleanValue() || !pictureView.f28893I0.m222761e().booleanValue()) {
            dnd0 dnd0VarM121524a = end0.m121524a(act.getResources(), (Bitmap) pair.first);
            dnd0VarM121524a.m117059e(qa00.f156328o);
            y20Var.call(dnd0VarM121524a);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m196171L(AtomicBoolean atomicBoolean, FrameLayout frameLayout, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, Runnable runnable) {
        if (atomicBoolean.compareAndSet(false, true)) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ Boolean m196172M(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m196173N(UserProfileExpandedCardRoot userProfileExpandedCardRoot, uxj0 uxj0Var) {
        if (NullChecker.m82486a(userProfileExpandedCardRoot.f23044E0) && userProfileExpandedCardRoot.f23044E0.isRunning()) {
            userProfileExpandedCardRoot.f23044E0.end();
        }
        psd0.m173633z(userProfileExpandedCardRoot.f23046F0);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m196176Q(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        View rootView = userProfileExpandedCardRoot.getRootView();
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f23069p0;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(newMainActAct, rootView, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.nhh0
            @Override // p153l.x20
            public final void call() {
                userProfileExpandedCardRoot.f23069p0.setBackgroundResource(dbc0.f86195Gq);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m196177R(SwipeGuideLeftView swipeGuideLeftView, Drawable drawable) {
        swipeGuideLeftView.setBackground(drawable);
        if (swipeGuideLeftView.getAlpha() == 0.0f) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(swipeGuideLeftView, (Property<SwipeGuideLeftView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m196180U(Act act, x20 x20Var, Pair pair) {
        if (pair.first != null) {
            return Boolean.TRUE;
        }
        Objects.requireNonNull(x20Var);
        act.post(new bri0(x20Var));
        return Boolean.FALSE;
    }

    @Nullable
    /* JADX INFO: renamed from: U0 */
    public static ViewTreeObserverOnGlobalLayoutListenerC8017b m196181U0(Act act) {
        if (act != null && (act instanceof NewMainAct)) {
            NewMainAct newMainAct = (NewMainAct) act;
            if (newMainAct.m40805Z5() == null) {
                return null;
            }
            ner nerVarM41440t6 = newMainAct.m40805Z5().m41440t6(TabName.Card);
            if (nerVarM41440t6 instanceof cvl) {
                nerVarM41440t6 = ((cvl) nerVarM41440t6).mo39563Y();
            }
            if (nerVarM41440t6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) nerVarM41440t6).f22420C;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X0 */
    public static void m196185X0() {
        String str;
        try {
            User userM196221r0 = m196221r0("-145");
            if (jyb.m147479J(userM196221r0.pictures)) {
                return;
            }
            Media media = userM196221r0.pictures.get(0);
            if ((media instanceof Picture) && (str = ((Picture) media).url) != null && !str.isEmpty()) {
                uqb0.f180374G.m127160x0(str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m196188a(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final NewNewProfileCard newNewProfileCard, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f22452K1;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(newMainActAct, newNewProfileCard, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.mhh0
            @Override // p153l.x20
            public final void call() {
                newNewProfileCard.f22452K1.setBackgroundResource(dbc0.f86195Gq);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m196190b(NewNewProfileCard newNewProfileCard, uxj0 uxj0Var) {
        if (NullChecker.m82486a(newNewProfileCard.f22455L1) && newNewProfileCard.f22455L1.isRunning()) {
            newNewProfileCard.f22455L1.end();
        }
        psd0.m173633z(newNewProfileCard.f22459M1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m196192c(View view, int i, int i2, View view2, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue > 1.0f) {
            float f = fFloatValue - 1.0f;
            view.setTranslationX(i * f);
            view.setRotation(f * i2);
        } else {
            view.setTranslationX(0.0f);
            view.setRotation(0.0f);
        }
        m196208j0(view2, (float) Math.hypot(view.getTranslationX(), view.getTranslationY()));
    }

    /* JADX INFO: renamed from: c1 */
    public static void m196194c1() {
        if (NullChecker.m82486a(f179097p)) {
            f179097p.f179112n.m137019l(uxj0.f181467a);
            f179097p.f179111m.onCompleted();
            f179097p.f179099a.onCompleted();
            f179097p = null;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m196196d0(Act act, x20 x20Var, Boolean bool) {
        Objects.requireNonNull(x20Var);
        act.post(new bri0(x20Var));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m196198e0(x20 x20Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, kcg0 kcg0Var, uxj0 uxj0Var) {
        x20Var.call();
        bnl0.m105524M(userProfileExpandedCardRoot.f23069p0, false);
        psd0.m173633z(userProfileExpandedCardRoot.f23046F0);
        psd0.m173633z(kcg0Var);
    }

    /* JADX INFO: renamed from: g1 */
    public static void m196203g1(NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        if (newNewProfileCard == null) {
            return;
        }
        newNewProfileCard.mo37855T(m196221r0(userInfo.f20214id), userInfo, i);
    }

    /* JADX INFO: renamed from: h1 */
    public static void m196205h1(UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        if (userProfileExpandedCardRoot == null) {
            return;
        }
        userProfileExpandedCardRoot.mo37855T(m196221r0(userInfo.f20214id), userInfo, i);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m196207j() {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m196208j0(@Nullable View view, float f) {
        if (view == null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof BifrostLayout) {
                ((BifrostLayout) parent).m39801z(Math.max(0.0f, f));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static void m196210k0(Act act, View view, View view2, PictureView pictureView, y20<Drawable> y20Var, x20 x20Var) {
        m196212l0(act, view, view2, pictureView, y20Var, x20Var, false);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m196211l(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, View view, final View view2, PictureView pictureView) {
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        Objects.requireNonNull(view2);
        m196210k0(newMainActAct, view, view2, pictureView, new rgh0(view2), new x20() { // from class: l.sgh0
            @Override // p153l.x20
            public final void call() {
                view2.setBackgroundResource(dbc0.f86195Gq);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public static void m196212l0(final Act act, final View view, final View view2, final PictureView pictureView, final y20<Drawable> y20Var, final x20 x20Var, boolean z) {
        if (view.getWidth() > 0) {
            act.duringCreated(C22421c.fromCallable(new Callable() { // from class: l.dih0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return uih0.m196228w(view, view2, pictureView, act, y20Var, x20Var);
                }
            }).compose(psd0.m173607R()).observeOn(Schedulers.computation()).filter(new qcj() { // from class: l.fih0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uih0.m196180U(act, x20Var, (Pair) obj);
                }
            }).flatMap(new qcj() { // from class: l.gih0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    View view3 = view;
                    Pair pair = (Pair) obj;
                    return C22421c.just(Pair.create(bsj0.m106280p((Bitmap) pair.first, view3.getWidth(), view3.getHeight(), 2097152000), (Boolean) pair.second));
                }
            }).compose(psd0.m173632y())).subscribe(psd0.m173597H(new y20() { // from class: l.hih0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uih0.m196170K(pictureView, act, y20Var, (Pair) obj);
                }
            }, new y20() { // from class: l.iih0
                @Override // p153l.y20
                public final void call(Object obj) {
                    uih0.m196220r((Throwable) obj);
                }
            }));
        } else {
            if (z) {
                return;
            }
            view.post(new Runnable() { // from class: l.cih0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196212l0(act, view, view2, pictureView, y20Var, x20Var, true);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m196213m(Act act, View view, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f23069p0;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(act, view, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.phh0
            @Override // p153l.x20
            public final void call() {
                userProfileExpandedCardRoot.f23069p0.setBackgroundResource(dbc0.f86195Gq);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m196214m0() {
        return d09.m113370g() && !f179098q;
    }

    /* JADX INFO: renamed from: m1 */
    public static void m196215m1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, View view, final Runnable runnable) {
        final FrameLayout frameLayout = viewTreeObserverOnGlobalLayoutListenerC8017b.f22668f;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            runnable.run();
            return;
        }
        VLinear vLinear = viewTreeObserverOnGlobalLayoutListenerC8017b.f22666e;
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
        final ViewTreeObserverOnGlobalLayoutListenerC20579a viewTreeObserverOnGlobalLayoutListenerC20579a = new ViewTreeObserverOnGlobalLayoutListenerC20579a(frameLayout, atomicBoolean, view, runnable);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC20579a);
        view.postDelayed(new Runnable() { // from class: l.qhh0
            @Override // java.lang.Runnable
            public final void run() {
                uih0.m196171L(atomicBoolean, frameLayout, viewTreeObserverOnGlobalLayoutListenerC20579a, runnable);
            }
        }, 400L);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m196218p(Act act, final NewNewProfileCard newNewProfileCard, PictureView pictureView, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f22452K1;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(act, newNewProfileCard, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.ugh0
            @Override // p153l.x20
            public final void call() {
                newNewProfileCard.f22452K1.setBackgroundResource(dbc0.f86195Gq);
            }
        });
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m196219q(boolean z, x20 x20Var, NewNewProfileCard newNewProfileCard, kcg0 kcg0Var, uxj0 uxj0Var) {
        if (z) {
            C21545y9.INSTANCE.m214800o(false);
        }
        x20Var.call();
        bnl0.m105524M(newNewProfileCard.f22452K1, false);
        psd0.m173633z(newNewProfileCard.f22459M1);
        psd0.m173633z(kcg0Var);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m196220r(Throwable th) {
    }

    /* JADX INFO: renamed from: r0 */
    public static User m196221r0(String str) {
        User userNew_ = User.new_();
        userNew_.f56859id = str;
        Picture pictureNew_ = Picture.new_();
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        Dimension dimension = pictureNew_.size;
        dimension.width = 600;
        dimension.height = 800;
        userNew_.pictures = jyb.m147482M(pictureNew_);
        userNew_.profile = Profile.new_();
        Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
        if (NullChecker.m82486a(settings) && (TEnum.equals(settings.getLookingFor(), "male") || (TEnum.equals(settings.getLookingFor(), "both") && TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "female")))) {
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
    public static uih0 m196223s0() {
        if (f179097p == null) {
            synchronized (uih0.class) {
                try {
                    if (f179097p == null) {
                        f179097p = new uih0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f179097p;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m196224t(View view, Act act, View view2, PictureView pictureView, y20 y20Var, x20 x20Var, Boolean bool) {
        if (view.getVisibility() == 8) {
            return;
        }
        m196210k0(act, view2, view, pictureView, y20Var, x20Var);
    }

    /* JADX INFO: renamed from: v0 */
    public static void m196227v0(final View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        gt0.m132160f(objectAnimatorOfFloat, new Runnable() { // from class: l.kih0
            @Override // java.lang.Runnable
            public final void run() {
                uih0.m196161B(view);
            }
        });
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Pair m196228w(final View view, final View view2, final PictureView pictureView, final Act act, final y20 y20Var, final x20 x20Var) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            if (NullChecker.m82486a(view2)) {
                bnl0.m105525M0(view2, false);
            }
            Boolean boolM222761e = pictureView.f28893I0.m222761e();
            boolean zBooleanValue = boolM222761e.booleanValue();
            view.draw(canvas);
            if (NullChecker.m82486a(view2)) {
                bnl0.m105525M0(view2, true);
            }
            if (!zBooleanValue) {
                act.duringCreated(pictureView.f28893I0.filter(new qcj() { // from class: l.lih0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return uih0.m196172M((Boolean) obj);
                    }
                }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.mih0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uih0.m196224t(view2, act, view, pictureView, y20Var, x20Var, (Boolean) obj);
                    }
                }));
                act.duringCreated(pictureView.f28893I0.skip(1).filter(new qcj() { // from class: l.nih0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((Boolean) obj).booleanValue());
                    }
                }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.oih0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        uih0.m196196d0(act, x20Var, (Boolean) obj);
                    }
                }));
            }
            return Pair.create(bitmapCreateBitmap, boolM222761e);
        } catch (OutOfMemoryError e) {
            CrashHelper.m82479c(e);
            return Pair.create(null, Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static void m196229w0() {
        if (m196223s0().f179108j.get().booleanValue() || (NullChecker.m82486a(f179097p) && f179097p.f179102d.get().booleanValue() && f179097p.f179103e.get().booleanValue() && f179097p.f179106h.get().intValue() != f179097p.f179104f.get().intValue())) {
            f179098q = true;
            f179097p = null;
        } else {
            f179098q = false;
            m196185X0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m196232y0(String str) {
        return "-145".equals(str);
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m196234A0() {
        return this.f179110l;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m196235B0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, float f, float f2) {
        this.f179110l = false;
        if (userProfileExpandedCardRoot.f23044E0.isRunning()) {
            userProfileExpandedCardRoot.f23044E0.end();
        }
        userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
        userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotX(f);
        userProfileExpandedCardRoot.getRootView().setPivotY(f2);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ Boolean m196236C0(uxj0 uxj0Var) {
        return Boolean.valueOf(this.f179100b.get().longValue() == 0 && NullChecker.m82486a(CoreModule.f18264c.f20405m0.m32143r6()));
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m196237D0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, uxj0 uxj0Var) {
        if (!"-145".equals(CoreModule.f18264c.f20405m0.m32143r6().f20214id) || this.f179110l) {
            return;
        }
        if (userProfileExpandedCardRoot.f23044E0.isRunning()) {
            this.f179110l = true;
            return;
        }
        userProfileExpandedCardRoot.getRootView().setPivotX(0.0f);
        userProfileExpandedCardRoot.getRootView().setPivotY(userProfileExpandedCardRoot.getRootView().getHeight() * 1.5f);
        userProfileExpandedCardRoot.f23044E0.start();
        this.f179110l = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ Boolean m196238E0(uxj0 uxj0Var) {
        return Boolean.valueOf(m196272o1());
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m196239F0(x20 x20Var, UserProfileExpandedCardRoot userProfileExpandedCardRoot, kcg0 kcg0Var) {
        x20Var.call();
        psd0.m173633z(userProfileExpandedCardRoot.f23046F0);
        psd0.m173633z(kcg0Var);
        if (this.f179100b.get().longValue() == 0) {
            this.f179100b.put(Long.valueOf(pzi0.m174454o()));
            m196271o0();
            i4g0.m138520r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m196240G0(NewNewProfileCard newNewProfileCard, float f, float f2) {
        this.f179110l = false;
        if (newNewProfileCard.f22455L1.isRunning()) {
            newNewProfileCard.f22455L1.end();
        }
        newNewProfileCard.setRotation(0.0f);
        newNewProfileCard.setTranslationX(0.0f);
        newNewProfileCard.setPivotX(f);
        newNewProfileCard.setPivotY(f2);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ Boolean m196241H0(uxj0 uxj0Var) {
        return Boolean.valueOf(this.f179100b.get().longValue() == 0 && NullChecker.m82486a(CoreModule.f18264c.f20405m0.m32143r6()));
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m196242I0(NewNewProfileCard newNewProfileCard, uxj0 uxj0Var) {
        if (!"-145".equals(CoreModule.f18264c.f20405m0.m32143r6().f20214id) || this.f179110l) {
            if (this.f179110l && newNewProfileCard.f22455L1.isRunning()) {
                this.f179110l = false;
                newNewProfileCard.f22455L1.end();
                return;
            }
            return;
        }
        if (newNewProfileCard.f22455L1.isRunning()) {
            this.f179110l = true;
            return;
        }
        newNewProfileCard.setPivotX(0.0f);
        newNewProfileCard.setPivotY(newNewProfileCard.getHeight() * 1.5f);
        newNewProfileCard.f22455L1.start();
        this.f179110l = true;
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ Boolean m196243J0(boolean z, uxj0 uxj0Var) {
        return Boolean.valueOf(m196272o1() || z);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m196244K0(x20 x20Var, NewNewProfileCard newNewProfileCard, kcg0 kcg0Var, boolean z) {
        x20Var.call();
        psd0.m173633z(newNewProfileCard.f22459M1);
        psd0.m173633z(kcg0Var);
        if (z) {
            C21545y9.INSTANCE.m214800o(false);
        } else if (this.f179100b.get().longValue() == 0) {
            this.f179100b.put(Long.valueOf(pzi0.m174454o()));
            m196271o0();
            i4g0.m138520r("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m196245L0(SwipeGuideLeftView swipeGuideLeftView, uxj0 uxj0Var) {
        if (m196270n1() && bnl0.m105529O0(swipeGuideLeftView)) {
            m196227v0(swipeGuideLeftView);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m196246M0(SwipeGuideLeftView swipeGuideLeftView, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, kcg0 kcg0Var) {
        if (bnl0.m105529O0(swipeGuideLeftView)) {
            m196227v0(swipeGuideLeftView);
        }
        m196269n0();
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38289e6();
        psd0.m173633z(kcg0Var);
        i4g0.m138520r("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m196247N0(View view, ViewStub viewStub, final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, PictureView pictureView) {
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).m37878b3();
        } else if (view instanceof UserProfileExpandedCardRoot) {
            ((UserProfileExpandedCardRoot) view).m38982u1();
        }
        i4g0.m138526x("e_new_user_guide_to_swipe_left", "p_suggest_users_home_view");
        final SwipeGuideLeftView swipeGuideLeftView = (SwipeGuideLeftView) view.findViewById(viewStub.getInflatedId());
        final kcg0 kcg0VarSubscribe = viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(this.f179099a).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.vgh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184036a.m196245L0(swipeGuideLeftView, (uxj0) obj);
            }
        }));
        swipeGuideLeftView.setViewTouchListener(new SwipeGuideLeftView.InterfaceC8526a() { // from class: l.wgh0
            @Override // com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideLeftView.InterfaceC8526a
            /* JADX INFO: renamed from: a */
            public final void mo47172a() {
                this.f188975a.m196246M0(swipeGuideLeftView, viewTreeObserverOnGlobalLayoutListenerC8017b, kcg0VarSubscribe);
            }
        });
        swipeGuideLeftView.setAlpha(0.0f);
        m196210k0(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), view, swipeGuideLeftView, pictureView, new y20() { // from class: l.ygh0
            @Override // p153l.y20
            public final void call(Object obj) {
                uih0.m196177R(swipeGuideLeftView, (Drawable) obj);
            }
        }, new x20() { // from class: l.zgh0
            @Override // p153l.x20
            public final void call() {
                swipeGuideLeftView.setBackgroundResource(dbc0.f86195Gq);
            }
        });
        this.f179113o = true;
        CoreModule.f18264c.f20405m0.f20171l2.m137019l("left guide");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m196248O0(NewNewProfileCard newNewProfileCard, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, PictureView pictureView, boolean z) {
        newNewProfileCard.m37878b3();
        m196275q0(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m196249P0(NewNewProfileCard newNewProfileCard, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, PictureView pictureView, boolean z) {
        newNewProfileCard.m37878b3();
        m196275q0(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, pictureView, z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m196250Q0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, PictureView pictureView) {
        userProfileExpandedCardRoot.m38982u1();
        m196273p0(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m196251R0(UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, PictureView pictureView) {
        userProfileExpandedCardRoot.m38982u1();
        m196273p0(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot, pictureView);
    }

    /* JADX INFO: renamed from: S0 */
    public long m196252S0() {
        return this.f179100b.get().longValue();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m196253T0() {
        return m196274p1() && this.f179100b.get().longValue() == 0;
    }

    /* JADX INFO: renamed from: V0 */
    public void m196254V0() {
        this.f179099a.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: W0 */
    public void m196255W0(boolean z) {
        vxd0 vxd0Var = this.f179104f;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        if (z) {
            return;
        }
        vxd0 vxd0Var2 = this.f179105g;
        vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m196256Y0() {
        this.f179102d.put(Boolean.TRUE);
        this.f179106h.put(this.f179104f.get());
    }

    /* JADX INFO: renamed from: Z0 */
    public void m196257Z0(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final View view, final ViewStub viewStub, final PictureView pictureView) {
        if (viewStub == null) {
            return;
        }
        final View viewFindViewById = view.findViewById(viewStub.getInflatedId());
        viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
        if (NullChecker.m82486a(viewFindViewById) && bnl0.m105529O0(viewFindViewById)) {
            m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.rih0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196211l(viewTreeObserverOnGlobalLayoutListenerC8017b, view, viewFindViewById, pictureView);
                }
            });
            return;
        }
        viewStub.setLayoutResource(kec0.f126173zc);
        bnl0.m105525M0(viewStub, true);
        m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, view instanceof UserProfileExpandedCardRoot ? ((UserProfileExpandedCardRoot) view).getRootView() : view, new Runnable() { // from class: l.sih0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168825a.m196247N0(view, viewStub, viewTreeObserverOnGlobalLayoutListenerC8017b, pictureView);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m196258a1(final Act act, final NewNewProfileCard newNewProfileCard) {
        final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0;
        final PictureView pictureViewMo37867Y;
        if (!m196214m0() || act == null || newNewProfileCard == null || (viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0 = m196181U0(act)) == null || (pictureViewMo37867Y = newNewProfileCard.mo37867Y()) == null) {
            return;
        }
        if (NullChecker.m82486a(newNewProfileCard.f22452K1) && bnl0.m105529O0(newNewProfileCard.f22452K1)) {
            m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0, newNewProfileCard, new Runnable() { // from class: l.mgh0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196218p(act, newNewProfileCard, pictureViewMo37867Y, viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0);
                }
            });
        }
        ViewStub viewStub = newNewProfileCard.f22541v1;
        if (!NullChecker.m82486a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = newNewProfileCard.findViewById(viewStub.getInflatedId());
        if (NullChecker.m82486a(viewFindViewById) && bnl0.m105529O0(viewFindViewById)) {
            m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0, newNewProfileCard, new Runnable() { // from class: l.xgh0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196165F(act, newNewProfileCard, viewFindViewById, pictureViewMo37867Y);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m196259b1(Act act, UserProfileExpandedCardRoot userProfileExpandedCardRoot) {
        final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0;
        final Act act2;
        final UserProfileExpandedCardRoot userProfileExpandedCardRoot2;
        if (!m196214m0() || act == null || userProfileExpandedCardRoot == null || (viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0 = m196181U0(act)) == null) {
            return;
        }
        final View rootView = userProfileExpandedCardRoot.getRootView();
        final PictureView pictureViewMo37867Y = userProfileExpandedCardRoot.mo37867Y();
        if (pictureViewMo37867Y == null) {
            return;
        }
        if (NullChecker.m82486a(userProfileExpandedCardRoot.f23069p0) && bnl0.m105529O0(userProfileExpandedCardRoot.f23069p0)) {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
            m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0, rootView, new Runnable() { // from class: l.tih0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196213m(act2, rootView, userProfileExpandedCardRoot2, pictureViewMo37867Y, viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0);
                }
            });
        } else {
            act2 = act;
            userProfileExpandedCardRoot2 = userProfileExpandedCardRoot;
        }
        ViewStub viewStub = userProfileExpandedCardRoot2.f23063S;
        if (!NullChecker.m82486a(viewStub) || viewStub.getInflatedId() == -1) {
            return;
        }
        final View viewFindViewById = userProfileExpandedCardRoot2.findViewById(viewStub.getInflatedId());
        if (NullChecker.m82486a(viewFindViewById) && bnl0.m105529O0(viewFindViewById)) {
            m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017bM196181U0, rootView, new Runnable() { // from class: l.ngh0
                @Override // java.lang.Runnable
                public final void run() {
                    uih0.m196167H(act2, userProfileExpandedCardRoot2, viewFindViewById, pictureViewMo37867Y);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void m196260d1(List<CoreSuggested.UserInfo> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if ("-145".equals(list.get(i).f20214id)) {
                list.remove(i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m196261e1(List<CoreSuggested.UserInfo> list) {
        if (this.f179100b.get().longValue() > 0) {
            return;
        }
        for (int i = 1; i < list.size(); i++) {
            if ("-145".equals(list.get(i).f20214id)) {
                list.remove(i);
                this.f179101c.put(Boolean.TRUE);
                this.f179100b.put(Long.valueOf(pzi0.m174454o()));
                m196254V0();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m196262f1() {
        this.f179110l = false;
    }

    /* JADX INFO: renamed from: h0 */
    public void m196263h0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, t7m t7mVar) {
        if (C21545y9.INSTANCE.m214798l()) {
            return;
        }
        if (NullChecker.m82486a(t7mVar.getUserInfoProxy()) && m196232y0(t7mVar.getUserInfoProxy().f20214id)) {
            this.f179101c.put(Boolean.TRUE);
            this.f179107i.put(0);
            m196278s1();
            if (spl0.m187375a0()) {
                p6d0.m170847d0().f150814g = true;
            }
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            return;
        }
        m196254V0();
        if (this.f179102d.get().booleanValue() && this.f179106h.get().intValue() >= 0 && this.f179106h.get().intValue() == this.f179104f.get().intValue()) {
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            m196257Z0(viewTreeObserverOnGlobalLayoutListenerC8017b, t7mVar.getCardView(), t7mVar.mo37935t(), t7mVar.mo37867Y());
            return;
        }
        if (this.f179105g.get().intValue() > 0 && !this.f179102d.get().booleanValue()) {
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            m196257Z0(viewTreeObserverOnGlobalLayoutListenerC8017b, t7mVar.getCardView(), t7mVar.mo37935t(), t7mVar.mo37867Y());
            this.f179102d.put(Boolean.TRUE);
            this.f179106h.put(this.f179104f.get());
            return;
        }
        if (!(this.f179104f.get().intValue() == 3 && this.f179105g.get().intValue() == 3 && !this.f179103e.get().booleanValue()) && (this.f179104f.get().intValue() < 15 || this.f179103e.get().booleanValue())) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.qih0
            @Override // java.lang.Runnable
            public final void run() {
                uih0.m196160A();
            }
        }, 800L);
        this.f179103e.put(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m196264i0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, u7m u7mVar) {
        if (NullChecker.m82486a(u7mVar.getUserInfoProxy()) && m196232y0(u7mVar.getUserInfoProxy().f20214id)) {
            this.f179101c.put(Boolean.TRUE);
            this.f179107i.put(0);
            m196278s1();
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            return;
        }
        m196254V0();
        if (this.f179102d.get().booleanValue() && this.f179106h.get().intValue() >= 0 && this.f179106h.get().intValue() == this.f179104f.get().intValue()) {
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            ((View) u7mVar).post(new RunnableC20582d(viewTreeObserverOnGlobalLayoutListenerC8017b, u7mVar));
            return;
        }
        if (this.f179105g.get().intValue() > 0 && !this.f179102d.get().booleanValue()) {
            if (spl0.m187375a0()) {
                p6d0.m170847d0().f150814g = true;
            }
            p6d0.m170847d0().f150815h = true;
            C8618a.m48771w().f31324b = true;
            ((View) u7mVar).post(new RunnableC20583e(viewTreeObserverOnGlobalLayoutListenerC8017b, u7mVar));
            this.f179102d.put(Boolean.TRUE);
            this.f179106h.put(this.f179104f.get());
            return;
        }
        if (!(this.f179104f.get().intValue() == 3 && this.f179105g.get().intValue() == 3 && !this.f179103e.get().booleanValue()) && (this.f179104f.get().intValue() < 15 || this.f179103e.get().booleanValue())) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().postDelayed(new Runnable() { // from class: l.ihh0
            @Override // java.lang.Runnable
            public final void run() {
                uih0.m196207j();
            }
        }, 800L);
        this.f179103e.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i1 */
    public void m196265i1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, NewNewProfileCard newNewProfileCard, CoreSuggested.UserInfo userInfo, int i) {
        m196203g1(newNewProfileCard, userInfo, i);
        if (i == 0) {
            m196276q1(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, newNewProfileCard.f22539u1, newNewProfileCard.f22479T, false);
            return;
        }
        this.f179110l = false;
        if (NullChecker.m82486a(newNewProfileCard.f22455L1) && newNewProfileCard.f22455L1.isRunning()) {
            newNewProfileCard.f22455L1.end();
            newNewProfileCard.setRotation(0.0f);
            newNewProfileCard.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m196266j1(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, UserProfileExpandedCardRoot userProfileExpandedCardRoot, CoreSuggested.UserInfo userInfo, int i) {
        m196205h1(userProfileExpandedCardRoot, userInfo, i);
        if (i == 0) {
            if (userProfileExpandedCardRoot.mo37867Y() != null) {
                m196277r1(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot, userProfileExpandedCardRoot.f23062R, userProfileExpandedCardRoot.mo37867Y());
                return;
            } else {
                userProfileExpandedCardRoot.postDelayed(new RunnableC20581c(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot), 50L);
                return;
            }
        }
        this.f179110l = false;
        if (NullChecker.m82486a(userProfileExpandedCardRoot.f23044E0) && userProfileExpandedCardRoot.f23044E0.isRunning()) {
            userProfileExpandedCardRoot.f23044E0.end();
            userProfileExpandedCardRoot.getRootView().setRotation(0.0f);
            userProfileExpandedCardRoot.getRootView().setTranslationX(0.0f);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m196267k1() {
        this.f179110l = false;
        this.f179109k = 0L;
    }

    /* JADX INFO: renamed from: l1 */
    public void m196268l1() {
        this.f179100b.put(0L);
        jxd0 jxd0Var = this.f179101c;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        this.f179102d.put(bool);
        this.f179103e.put(bool);
        this.f179104f.put(0);
        this.f179105g.put(0);
        this.f179106h.put(-1);
        this.f179107i.put(-1);
        this.f179108j.put(bool);
    }

    /* JADX INFO: renamed from: n0 */
    public void m196269n0() {
        this.f179106h.put(-1);
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m196270n1() {
        return (this.f179102d.get().booleanValue() && this.f179106h.get().intValue() >= 0 && this.f179106h.get().intValue() == this.f179104f.get().intValue()) ? false : true;
    }

    /* JADX INFO: renamed from: o0 */
    public void m196271o0() {
        this.f179107i.put(-1);
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m196272o1() {
        return (this.f179102d.get().booleanValue() && this.f179107i.get().intValue() >= 0 && this.f179104f.get().intValue() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m196273p0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, PictureView pictureView) {
        i4g0.m138526x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (userProfileExpandedCardRoot.f23044E0 == null) {
            userProfileExpandedCardRoot.f23044E0 = m196281u0(userProfileExpandedCardRoot.getRootView(), userProfileExpandedCardRoot);
        }
        final float pivotX = userProfileExpandedCardRoot.getRootView().getPivotX();
        final float pivotY = userProfileExpandedCardRoot.getRootView().getPivotY();
        final x20 x20Var = new x20() { // from class: l.rhh0
            @Override // p153l.x20
            public final void call() {
                this.f163171a.m196235B0(userProfileExpandedCardRoot, pivotX, pivotY);
            }
        };
        psd0.m173633z(userProfileExpandedCardRoot.f23046F0);
        userProfileExpandedCardRoot.f23046F0 = viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(this.f179111m).takeUntil(new qcj() { // from class: l.uhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!bnl0.m105529O0(userProfileExpandedCardRoot.f23069p0));
            }
        }).filter(new qcj() { // from class: l.vhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184166a.m196236C0((uxj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.whh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189151a.m196237D0(userProfileExpandedCardRoot, (uxj0) obj);
            }
        }));
        final kcg0 kcg0VarSubscribe = this.f179112n.take(1).subscribe(psd0.m173596G(new y20() { // from class: l.xhh0
            @Override // p153l.y20
            public final void call(Object obj) {
                uih0.m196173N(userProfileExpandedCardRoot, (uxj0) obj);
            }
        }));
        final long jM174454o = pzi0.m174454o();
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(this.f179099a).filter(new qcj() { // from class: l.yhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(pzi0.m174454o() - jM174454o > 800);
            }
        }).filter(new qcj() { // from class: l.zhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204417a.m196238E0((uxj0) obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.aih0
            @Override // p153l.y20
            public final void call(Object obj) {
                uih0.m196198e0(x20Var, userProfileExpandedCardRoot, kcg0VarSubscribe, (uxj0) obj);
            }
        }));
        userProfileExpandedCardRoot.f23069p0.setViewTouchListener(new SwipeGuideRightView.InterfaceC8528b() { // from class: l.bih0
            @Override // com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView.InterfaceC8528b
            /* JADX INFO: renamed from: a */
            public final void mo47177a() {
                this.f76878a.m196239F0(x20Var, userProfileExpandedCardRoot, kcg0VarSubscribe);
            }
        });
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        View rootView = userProfileExpandedCardRoot.getRootView();
        SwipeGuideRightView swipeGuideRightView = userProfileExpandedCardRoot.f23069p0;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(newMainActAct, rootView, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.shh0
            @Override // p153l.x20
            public final void call() {
                userProfileExpandedCardRoot.f23069p0.setBackgroundResource(dbc0.f86195Gq);
            }
        });
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m196274p1() {
        if (this.f179101c.get().booleanValue() && this.f179107i.get().intValue() == 0 && this.f179104f.get().intValue() == 0) {
            return true;
        }
        return this.f179104f.get().intValue() == 0 && this.f179105g.get().intValue() == 0 && !this.f179101c.get().booleanValue();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m196275q0(ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final NewNewProfileCard newNewProfileCard, PictureView pictureView, final boolean z) {
        i4g0.m138526x("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view");
        if (newNewProfileCard.f22455L1 == null) {
            newNewProfileCard.f22455L1 = m196279t0(newNewProfileCard);
        }
        final float pivotX = newNewProfileCard.getPivotX();
        final float pivotY = newNewProfileCard.getPivotY();
        final x20 x20Var = new x20() { // from class: l.ahh0
            @Override // p153l.x20
            public final void call() {
                this.f71360a.m196240G0(newNewProfileCard, pivotX, pivotY);
            }
        };
        psd0.m173633z(newNewProfileCard.f22459M1);
        newNewProfileCard.f22459M1 = viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(this.f179111m).takeUntil(new qcj() { // from class: l.chh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!bnl0.m105529O0(newNewProfileCard.f22452K1));
            }
        }).filter(new qcj() { // from class: l.dhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f88527a.m196241H0((uxj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ehh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94043a.m196242I0(newNewProfileCard, (uxj0) obj);
            }
        }));
        final kcg0 kcg0VarSubscribe = this.f179112n.take(1).subscribe(psd0.m173596G(new y20() { // from class: l.fhh0
            @Override // p153l.y20
            public final void call(Object obj) {
                uih0.m196190b(newNewProfileCard, (uxj0) obj);
            }
        }));
        final long jM174454o = pzi0.m174454o();
        viewTreeObserverOnGlobalLayoutListenerC8017b.act().duringCreated(this.f179099a).filter(new qcj() { // from class: l.ghh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(pzi0.m174454o() - jM174454o > 800);
            }
        }).filter(new qcj() { // from class: l.hhh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f109893a.m196243J0(z, (uxj0) obj);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.jhh0
            @Override // p153l.y20
            public final void call(Object obj) {
                uih0.m196219q(z, x20Var, newNewProfileCard, kcg0VarSubscribe, (uxj0) obj);
            }
        }));
        newNewProfileCard.f22452K1.setViewTouchListener(new SwipeGuideRightView.InterfaceC8528b() { // from class: l.khh0
            @Override // com.p051p1.mobile.putong.core.p058ui.growth.swipeguide.SwipeGuideRightView.InterfaceC8528b
            /* JADX INFO: renamed from: a */
            public final void mo47177a() {
                this.f126872a.m196244K0(x20Var, newNewProfileCard, kcg0VarSubscribe, z);
            }
        });
        NewMainAct newMainActAct = viewTreeObserverOnGlobalLayoutListenerC8017b.act();
        SwipeGuideRightView swipeGuideRightView = newNewProfileCard.f22452K1;
        Objects.requireNonNull(swipeGuideRightView);
        m196210k0(newMainActAct, newNewProfileCard, swipeGuideRightView, pictureView, new tgh0(swipeGuideRightView), new x20() { // from class: l.bhh0
            @Override // p153l.x20
            public final void call() {
                newNewProfileCard.f22452K1.setBackgroundResource(dbc0.f86195Gq);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public void m196276q1(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final NewNewProfileCard newNewProfileCard, ViewStub viewStub, final PictureView pictureView, final boolean z) {
        if (!this.f179110l && pzi0.m174454o() - this.f179109k >= 500) {
            this.f179109k = pzi0.m174454o();
            if (NullChecker.m82486a(newNewProfileCard.f22452K1) && bnl0.m105529O0(newNewProfileCard.f22452K1)) {
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, new Runnable() { // from class: l.ogh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        uih0.m196188a(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.m82486a(newNewProfileCard.f22452K1)) {
                bnl0.m105524M(newNewProfileCard.f22452K1, true);
                newNewProfileCard.f22452K1.m47176k0(z);
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, new Runnable() { // from class: l.pgh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f152290a.m196248O0(newNewProfileCard, viewTreeObserverOnGlobalLayoutListenerC8017b, pictureView, z);
                    }
                });
                return;
            }
            if (NullChecker.m82486a(viewStub)) {
                viewStub.setLayoutResource(kec0.f125328Ac);
                SwipeGuideRightView swipeGuideRightView = (SwipeGuideRightView) viewStub.inflate();
                newNewProfileCard.f22452K1 = swipeGuideRightView;
                swipeGuideRightView.m47176k0(z);
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, newNewProfileCard, new Runnable() { // from class: l.qgh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f157415a.m196249P0(newNewProfileCard, viewTreeObserverOnGlobalLayoutListenerC8017b, pictureView, z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m196277r1(final ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, final UserProfileExpandedCardRoot userProfileExpandedCardRoot, ViewStub viewStub, final PictureView pictureView) {
        if (!this.f179110l && pzi0.m174454o() - this.f179109k >= 500) {
            this.f179109k = pzi0.m174454o();
            View rootView = userProfileExpandedCardRoot.getRootView();
            if (NullChecker.m82486a(userProfileExpandedCardRoot.f23069p0) && bnl0.m105529O0(userProfileExpandedCardRoot.f23069p0)) {
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, rootView, new Runnable() { // from class: l.thh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        uih0.m196176Q(viewTreeObserverOnGlobalLayoutListenerC8017b, userProfileExpandedCardRoot, pictureView);
                    }
                });
                return;
            }
            if (NullChecker.m82486a(userProfileExpandedCardRoot.f23069p0)) {
                bnl0.m105524M(userProfileExpandedCardRoot.f23069p0, true);
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, rootView, new Runnable() { // from class: l.eih0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94149a.m196250Q0(userProfileExpandedCardRoot, viewTreeObserverOnGlobalLayoutListenerC8017b, pictureView);
                    }
                });
            } else if (NullChecker.m82486a(viewStub)) {
                viewStub.setLayoutResource(kec0.f125328Ac);
                userProfileExpandedCardRoot.f23069p0 = (SwipeGuideRightView) viewStub.inflate();
                viewTreeObserverOnGlobalLayoutListenerC8017b.m38207P2();
                m196215m1(viewTreeObserverOnGlobalLayoutListenerC8017b, rootView, new Runnable() { // from class: l.pih0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f152539a.m196251R0(userProfileExpandedCardRoot, viewTreeObserverOnGlobalLayoutListenerC8017b, pictureView);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: s1 */
    public void m196278s1() {
        this.f179111m.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: t0 */
    public final Animator m196279t0(View view) {
        return m196281u0(view, view);
    }

    /* JADX INFO: renamed from: t1 */
    public final String m196280t1() {
        return CoreModule.m30929H().userId();
    }

    /* JADX INFO: renamed from: u0 */
    public final Animator m196281u0(final View view, final View view2) {
        final int i = qa00.f156338y;
        final int i2 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 2.0f);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.setInterpolator(zi60.m219724a(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jih0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                uih0.m196192c(view, i, i2, view2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C20580b(view2));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: x0 */
    public void m196282x0(List<CoreSuggested.UserInfo> list) {
        if ("-145".equals(list.get(0).f20214id)) {
            return;
        }
        if (list.size() <= 1 || !"-145".equals(list.get(1).f20214id)) {
            this.f179110l = false;
            m196254V0();
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = "-145";
            if (list.get(0).isVirtualCard()) {
                list.add(1, userInfo);
            } else {
                list.add(0, userInfo);
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m196283z0() {
        if (this.f179102d.get().booleanValue() && this.f179106h.get().intValue() >= 0 && this.f179106h.get().intValue() == this.f179104f.get().intValue()) {
            return true;
        }
        return this.f179105g.get().intValue() > 0 && !this.f179102d.get().booleanValue();
    }
}
