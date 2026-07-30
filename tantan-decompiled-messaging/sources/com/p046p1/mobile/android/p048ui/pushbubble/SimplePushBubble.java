package com.p046p1.mobile.android.p048ui.pushbubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.android.p048ui.poplevel.PopAction;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.aie0;
import p149l.bt0;
import p149l.d30;
import p149l.e51;
import p149l.f0m;
import p149l.i0m;
import p149l.t100;
import p149l.u2c0;
import p149l.uc80;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: loaded from: classes8.dex */
public class SimplePushBubble extends aie0 {

    /* JADX INFO: renamed from: k */
    public static final int f15887k = t100.m186890d(92.0f);

    /* JADX INFO: renamed from: l */
    public static final int f15888l = t100.m186890d(76.0f);

    /* JADX INFO: renamed from: i */
    public final C4372a f15889i;

    /* JADX INFO: renamed from: j */
    public C4373b f15890j;

    public static class PushBubbleFrame extends VFrame {

        /* JADX INFO: renamed from: d */
        public static final int f15891d = t100.f167257f;

        /* JADX INFO: renamed from: a */
        public float f15892a;

        /* JADX INFO: renamed from: b */
        public d30 f15893b;

        /* JADX INFO: renamed from: c */
        public boolean f15894c;

        public PushBubbleFrame(Context context) {
            super(context);
        }

        @Override // p147v.VFrame, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.f15894c) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f15892a = motionEvent.getRawY();
            } else if (action == 2 && this.f15892a - motionEvent.getRawY() > f15891d) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.f15894c) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f15893b == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if ((action != 1 && action != 3) || this.f15892a - motionEvent.getRawY() <= f15891d) {
                return super.onTouchEvent(motionEvent);
            }
            this.f15893b.call();
            this.f15893b = null;
            return true;
        }

        /* JADX INFO: renamed from: p */
        public void m21143p(d30 d30Var) {
            this.f15893b = d30Var;
        }

        /* JADX INFO: renamed from: s */
        public void m21144s(boolean z) {
            this.f15894c = z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$a */
    public static class C4372a {

        /* JADX INFO: renamed from: o */
        public static final v9j<String> f15895o = new v9j() { // from class: l.ghf0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return SimplePushBubble.C4372a.m21148d();
            }
        };

        /* JADX INFO: renamed from: p */
        public static final w9j<View, Animator> f15896p = new w9j() { // from class: l.hhf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SimplePushBubble.C4372a.m21145a((View) obj);
            }
        };

        /* JADX INFO: renamed from: q */
        public static final w9j<View, Animator> f15897q = new w9j() { // from class: l.ihf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SimplePushBubble.C4372a.m21146b((View) obj);
            }
        };

        /* JADX INFO: renamed from: r */
        public static final w9j<View, Animator> f15898r = new w9j() { // from class: l.jhf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return SimplePushBubble.C4372a.m21147c((View) obj);
            }
        };

        /* JADX INFO: renamed from: s */
        public static final FrameLayout.LayoutParams f15899s = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f15900a;

        /* JADX INFO: renamed from: b */
        public final View f15901b;

        /* JADX INFO: renamed from: l */
        public d30 f15911l;

        /* JADX INFO: renamed from: m */
        public i0m f15912m;

        /* JADX INFO: renamed from: c */
        public int f15902c = -1;

        /* JADX INFO: renamed from: d */
        public String f15903d = f15895o.call();

        /* JADX INFO: renamed from: e */
        public String f15904e = "default";

        /* JADX INFO: renamed from: f */
        public int f15905f = 3000;

        /* JADX INFO: renamed from: g */
        public w9j<View, Animator> f15906g = f15896p;

        /* JADX INFO: renamed from: h */
        public w9j<View, Animator> f15907h = f15897q;

        /* JADX INFO: renamed from: i */
        public w9j<View, Animator> f15908i = f15898r;

        /* JADX INFO: renamed from: j */
        public ViewGroup.LayoutParams f15909j = f15899s;

        /* JADX INFO: renamed from: k */
        public boolean f15910k = true;

        /* JADX INFO: renamed from: n */
        public int f15913n = 2;

        public C4372a(@NonNull Activity activity, @NonNull View view) {
            this.f15900a = activity;
            this.f15901b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m21145a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -SimplePushBubble.f15887k, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m21146b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f15887k);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Animator m21147c(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f15887k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ String m21148d() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: A */
        public C4372a m21163A(int i) {
            this.f15913n = i;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C4372a m21164B(int i) {
            if (i == 1) {
                this.f15909j = new FrameLayout.LayoutParams(-2, t100.m186890d(52.0f));
                return this;
            }
            if (i == 2) {
                this.f15909j = new FrameLayout.LayoutParams(-2, t100.m186890d(72.0f));
                return this;
            }
            if (i != 3) {
                this.f15909j = f15899s;
                return this;
            }
            this.f15909j = new FrameLayout.LayoutParams(-2, t100.m186890d(96.0f));
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C4372a m21165C(@DrawableRes int i) {
            this.f15902c = i;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C4372a m21166D(@Nullable w9j<View, Animator> w9jVar) {
            this.f15906g = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C4372a m21167E(boolean z) {
            this.f15910k = z;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C4372a m21168F(d30 d30Var) {
            this.f15911l = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public SimplePushBubble m21169s() {
            return new SimplePushBubble(this);
        }

        /* JADX INFO: renamed from: t */
        public String m21170t() {
            i0m i0mVar = this.f15912m;
            return i0mVar != null ? i0mVar.getOnlyName() : "unknown";
        }

        /* JADX INFO: renamed from: u */
        public C4372a m21171u(@NonNull String str) {
            this.f15904e = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C4372a m21172v(@NonNull String str) {
            this.f15903d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C4372a m21173w(int i) {
            this.f15905f = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C4372a m21174x(@Nullable w9j<View, Animator> w9jVar) {
            this.f15907h = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C4372a m21175y(@NonNull ViewGroup.LayoutParams layoutParams) {
            this.f15909j = layoutParams;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C4372a m21176z(@NonNull i0m i0mVar) {
            this.f15912m = i0mVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$b */
    public static class C4373b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f15914a;

        /* JADX INFO: renamed from: b */
        public final Animator f15915b;

        /* JADX INFO: renamed from: c */
        public final C4372a f15916c;

        public C4373b(@NonNull final C4372a c4372a) {
            this.f15916c = c4372a;
            final PushBubbleFrame pushBubbleFrame = new PushBubbleFrame(c4372a.f15900a);
            pushBubbleFrame.setClickable(true);
            if (c4372a.f15902c > 0) {
                pushBubbleFrame.setBackgroundResource(c4372a.f15902c);
            } else if (c4372a.f15902c != 0) {
                int i = t100.f167259h;
                int i2 = t100.f167261j;
                pushBubbleFrame.setPadding(i, i2, i, i2);
                pushBubbleFrame.setBackgroundResource(u2c0.f173468y);
            }
            pushBubbleFrame.setMinimumWidth(SimplePushBubble.f15887k);
            pushBubbleFrame.setMinimumHeight(SimplePushBubble.f15888l);
            pushBubbleFrame.m21144s(c4372a.f15910k);
            pushBubbleFrame.m21143p(new d30() { // from class: com.p1.mobile.android.ui.pushbubble.a
                @Override // p149l.d30
                public final void call() {
                    this.f15917a.m21182f(c4372a, pushBubbleFrame);
                }
            });
            ViewParent parent = c4372a.f15901b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c4372a.f15901b);
            }
            pushBubbleFrame.addView(c4372a.f15901b, c4372a.f15909j);
            this.f15914a = c4372a.f15906g == null ? null : (Animator) c4372a.f15906g.call(pushBubbleFrame);
            this.f15915b = c4372a.f15907h != null ? (Animator) c4372a.f15907h.call(pushBubbleFrame) : null;
            if (c4372a.f15909j.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(pushBubbleFrame);
        }

        /* JADX INFO: renamed from: d */
        public void m21180d(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                bt0.m103733f(animator, new Runnable() { // from class: l.khf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123145a.m21181e();
                    }
                });
                animator.start();
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m21180d(this.f15915b);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m21181e() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m21182f(C4372a c4372a, PushBubbleFrame pushBubbleFrame) {
            m21180d(c4372a.f15908i == null ? null : (Animator) c4372a.f15908i.call(pushBubbleFrame));
            if (NullChecker.m81303a(c4372a.f15911l)) {
                c4372a.f15911l.call();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m21183g() {
            Window window;
            Animator animator = this.f15914a;
            if ((animator != null && animator.isRunning()) || (window = this.f15916c.f15900a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f15914a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public SimplePushBubble(@NonNull C4372a c4372a) {
        this.f15889i = c4372a;
        this.f69978g = c4372a.f15912m;
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: A */
    public int mo21134A() {
        v9j<Boolean> v9jVar = this.f69975d;
        boolean z = v9jVar == null || v9jVar.call().booleanValue();
        Activity activity = this.f15889i.f15900a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.m81303a(this.f97025b)) {
                this.f97025b.call();
            }
            return 0;
        }
        this.f15890j = new C4373b(this.f15889i);
        final Runnable runnable = new Runnable() { // from class: l.ehf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91323a.m21136J();
            }
        };
        this.f15890j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.fhf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f97503a.m21137K(runnable);
            }
        });
        this.f15890j.m21183g();
        if (NullChecker.m81303a(this.f97024a)) {
            this.f97024a.call();
        }
        e51.m114743H(this.f15889i.f15900a, runnable, this.f15889i.f15905f);
        return this.f15889i.f15905f;
    }

    /* JADX INFO: renamed from: I */
    public void m21135I() {
        C4373b c4373b = this.f15890j;
        if (c4373b != null && c4373b.isShowing()) {
            this.f15890j.dismiss();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21136J() {
        C4371a.m21100p().m21119o(this.f15889i.m21170t(), PopAction.AUTO_CLOSE);
        this.f15890j.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m21137K(Runnable runnable) {
        e51.m114745J(runnable);
        if (NullChecker.m81303a(this.f97025b)) {
            this.f97025b.call();
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        C4373b c4373b = this.f15890j;
        if (c4373b == null || !c4373b.isShowing()) {
            return;
        }
        C4373b c4373b2 = this.f15890j;
        if (z) {
            c4373b2.getContentView().setTranslationY(0.0f);
            this.f15890j.getContentView().setAlpha(1.0f);
        } else {
            c4373b2.getContentView().setTranslationY(-4000.0f);
            this.f15890j.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: g */
    public void mo20866g(uc80 uc80Var) {
        m21135I();
    }

    public int getPriority() {
        return this.f15889i.f15913n;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo21138j() {
        return this.f15889i.f15900a.hashCode();
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act mo21139m() {
        return (Act) this.f15889i.f15900a;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        C4373b c4373b = this.f15890j;
        if (c4373b != null && c4373b.isShowing()) {
            this.f15890j.dismiss();
            return;
        }
        f0m f0mVar = this.f69977f;
        if (f0mVar != null) {
            f0mVar.mo21109a(this);
        }
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo21140o() {
        return this.f15889i.f15904e;
    }

    @Override // p149l.fdb0
    /* JADX INFO: renamed from: p */
    public String mo21141p() {
        return this.f15889i.f15903d;
    }

    @Override // p149l.aie0
    /* JADX INFO: renamed from: u */
    public int mo21142u() {
        return super.mo21142u() > 0 ? super.mo21142u() : C4371a.m21095F(this.f15889i.f15913n);
    }
}
