package com.p003p1.mobile.android.p005ui.pushbubble;

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
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.p005ui.poplevel.C0283a;
import com.p003p1.mobile.android.p005ui.poplevel.PopAction;
import com.p003p1.mobile.android.p005ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.t100;
import l.v9j;
import l.w9j;
import p007l.aie0;
import p007l.bt0;
import p007l.e51;
import p007l.f0m;
import p007l.i0m;
import p007l.u2c0;
import p007l.uc80;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SimplePushBubble extends aie0 {

    /* JADX INFO: renamed from: k */
    public static final int f1586k = t100.d(92.0f);

    /* JADX INFO: renamed from: l */
    public static final int f1587l = t100.d(76.0f);

    /* JADX INFO: renamed from: i */
    public final C0284a f1588i;

    /* JADX INFO: renamed from: j */
    public C0285b f1589j;

    public static class PushBubbleFrame extends VFrame {

        /* JADX INFO: renamed from: d */
        public static final int f1590d = t100.f;

        /* JADX INFO: renamed from: a */
        public float f1591a;

        /* JADX INFO: renamed from: b */
        public d30 f1592b;

        /* JADX INFO: renamed from: c */
        public boolean f1593c;

        public PushBubbleFrame(Context context) {
            super(context);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.f1593c) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f1591a = motionEvent.getRawY();
            } else if (action == 2 && this.f1591a - motionEvent.getRawY() > f1590d) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.f1593c) {
                return super/*android.view.View*/.onTouchEvent(motionEvent);
            }
            if (this.f1592b == null) {
                return super/*android.view.View*/.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if ((action != 1 && action != 3) || this.f1591a - motionEvent.getRawY() <= f1590d) {
                return super/*android.view.View*/.onTouchEvent(motionEvent);
            }
            this.f1592b.call();
            this.f1592b = null;
            return true;
        }

        /* JADX INFO: renamed from: p */
        public void m1415p(d30 d30Var) {
            this.f1592b = d30Var;
        }

        /* JADX INFO: renamed from: s */
        public void m1416s(boolean z) {
            this.f1593c = z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$a */
    public static class C0284a {

        /* JADX INFO: renamed from: o */
        public static final v9j<String> f1594o = new v9j() { // from class: l.ghf0
            public final Object call() {
                return SimplePushBubble.C0284a.m1420d();
            }
        };

        /* JADX INFO: renamed from: p */
        public static final w9j<View, Animator> f1595p = new w9j() { // from class: l.hhf0
            public final Object call(Object obj) {
                return SimplePushBubble.C0284a.m1417a((View) obj);
            }
        };

        /* JADX INFO: renamed from: q */
        public static final w9j<View, Animator> f1596q = new w9j() { // from class: l.ihf0
            public final Object call(Object obj) {
                return SimplePushBubble.C0284a.m1418b((View) obj);
            }
        };

        /* JADX INFO: renamed from: r */
        public static final w9j<View, Animator> f1597r = new w9j() { // from class: l.jhf0
            public final Object call(Object obj) {
                return SimplePushBubble.C0284a.m1419c((View) obj);
            }
        };

        /* JADX INFO: renamed from: s */
        public static final FrameLayout.LayoutParams f1598s = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f1599a;

        /* JADX INFO: renamed from: b */
        public final View f1600b;

        /* JADX INFO: renamed from: l */
        public d30 f1610l;

        /* JADX INFO: renamed from: m */
        public i0m f1611m;

        /* JADX INFO: renamed from: c */
        public int f1601c = -1;

        /* JADX INFO: renamed from: d */
        public String f1602d = (String) f1594o.call();

        /* JADX INFO: renamed from: e */
        public String f1603e = "default";

        /* JADX INFO: renamed from: f */
        public int f1604f = 3000;

        /* JADX INFO: renamed from: g */
        public w9j<View, Animator> f1605g = f1595p;

        /* JADX INFO: renamed from: h */
        public w9j<View, Animator> f1606h = f1596q;

        /* JADX INFO: renamed from: i */
        public w9j<View, Animator> f1607i = f1597r;

        /* JADX INFO: renamed from: j */
        public ViewGroup.LayoutParams f1608j = f1598s;

        /* JADX INFO: renamed from: k */
        public boolean f1609k = true;

        /* JADX INFO: renamed from: n */
        public int f1612n = 2;

        public C0284a(@NonNull Activity activity, @NonNull View view) {
            this.f1599a = activity;
            this.f1600b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m1417a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -SimplePushBubble.f1586k, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m1418b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f1586k);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Animator m1419c(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f1586k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ String m1420d() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: A */
        public C0284a m1435A(int i) {
            this.f1612n = i;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C0284a m1436B(int i) {
            if (i == 1) {
                this.f1608j = new FrameLayout.LayoutParams(-2, t100.d(52.0f));
                return this;
            }
            if (i == 2) {
                this.f1608j = new FrameLayout.LayoutParams(-2, t100.d(72.0f));
                return this;
            }
            if (i != 3) {
                this.f1608j = f1598s;
                return this;
            }
            this.f1608j = new FrameLayout.LayoutParams(-2, t100.d(96.0f));
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C0284a m1437C(@DrawableRes int i) {
            this.f1601c = i;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C0284a m1438D(@Nullable w9j<View, Animator> w9jVar) {
            this.f1605g = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C0284a m1439E(boolean z) {
            this.f1609k = z;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C0284a m1440F(d30 d30Var) {
            this.f1610l = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public SimplePushBubble m1441s() {
            return new SimplePushBubble(this);
        }

        /* JADX INFO: renamed from: t */
        public String m1442t() {
            i0m i0mVar = this.f1611m;
            return i0mVar != null ? i0mVar.getOnlyName() : "unknown";
        }

        /* JADX INFO: renamed from: u */
        public C0284a m1443u(@NonNull String str) {
            this.f1603e = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0284a m1444v(@NonNull String str) {
            this.f1602d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0284a m1445w(int i) {
            this.f1604f = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C0284a m1446x(@Nullable w9j<View, Animator> w9jVar) {
            this.f1606h = w9jVar;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C0284a m1447y(@NonNull ViewGroup.LayoutParams layoutParams) {
            this.f1608j = layoutParams;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C0284a m1448z(@NonNull i0m i0mVar) {
            this.f1611m = i0mVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$b */
    public static class C0285b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f1613a;

        /* JADX INFO: renamed from: b */
        public final Animator f1614b;

        /* JADX INFO: renamed from: c */
        public final C0284a f1615c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, android.view.ViewGroup, com.p1.mobile.android.ui.pushbubble.SimplePushBubble$PushBubbleFrame, java.lang.Object] */
        public C0285b(@NonNull final C0284a c0284a) {
            this.f1615c = c0284a;
            final ?? pushBubbleFrame = new PushBubbleFrame(c0284a.f1599a);
            pushBubbleFrame.setClickable(true);
            if (c0284a.f1601c > 0) {
                pushBubbleFrame.setBackgroundResource(c0284a.f1601c);
            } else if (c0284a.f1601c != 0) {
                int i = t100.h;
                int i2 = t100.j;
                pushBubbleFrame.setPadding(i, i2, i, i2);
                pushBubbleFrame.setBackgroundResource(u2c0.f4836y);
            }
            pushBubbleFrame.setMinimumWidth(SimplePushBubble.f1586k);
            pushBubbleFrame.setMinimumHeight(SimplePushBubble.f1587l);
            pushBubbleFrame.m1416s(c0284a.f1609k);
            pushBubbleFrame.m1415p(new d30() { // from class: com.p1.mobile.android.ui.pushbubble.a
                public final void call() {
                    this.f1616a.m1454f(c0284a, pushBubbleFrame);
                }
            });
            ViewParent parent = c0284a.f1600b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0284a.f1600b);
            }
            pushBubbleFrame.addView(c0284a.f1600b, c0284a.f1608j);
            this.f1613a = c0284a.f1605g == null ? null : (Animator) c0284a.f1605g.call((Object) pushBubbleFrame);
            this.f1614b = c0284a.f1606h != null ? (Animator) c0284a.f1606h.call((Object) pushBubbleFrame) : null;
            if (c0284a.f1608j.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(pushBubbleFrame);
        }

        /* JADX INFO: renamed from: d */
        public void m1452d(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                bt0.m8651f(animator, new Runnable() { // from class: l.khf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3071a.m1453e();
                    }
                });
                animator.start();
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m1452d(this.f1614b);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m1453e() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m1454f(C0284a c0284a, PushBubbleFrame pushBubbleFrame) {
            m1452d(c0284a.f1607i == null ? null : (Animator) c0284a.f1607i.call(pushBubbleFrame));
            if (NullChecker.a(c0284a.f1610l)) {
                c0284a.f1610l.call();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m1455g() {
            Window window;
            Animator animator = this.f1613a;
            if ((animator != null && animator.isRunning()) || (window = this.f1615c.f1599a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f1613a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public SimplePushBubble(@NonNull C0284a c0284a) {
        this.f1588i = c0284a;
        this.f1857g = c0284a.f1611m;
    }

    @Override // p007l.aie0
    /* JADX INFO: renamed from: A */
    public int mo1406A() {
        v9j<Boolean> v9jVar = this.f1854d;
        boolean z = v9jVar == null || ((Boolean) v9jVar.call()).booleanValue();
        Activity activity = this.f1588i.f1599a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.a(this.f2673b)) {
                this.f2673b.call();
            }
            return 0;
        }
        this.f1589j = new C0285b(this.f1588i);
        final Runnable runnable = new Runnable() { // from class: l.ehf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f2623a.m1408J();
            }
        };
        this.f1589j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.fhf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f2688a.m1409K(runnable);
            }
        });
        this.f1589j.m1455g();
        if (NullChecker.a(this.f2672a)) {
            this.f2672a.call();
        }
        e51.m9025H(this.f1588i.f1599a, runnable, this.f1588i.f1604f);
        return this.f1588i.f1604f;
    }

    /* JADX INFO: renamed from: I */
    public void m1407I() {
        C0285b c0285b = this.f1589j;
        if (c0285b != null && c0285b.isShowing()) {
            this.f1589j.dismiss();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m1408J() {
        C0283a.m1372p().m1391o(this.f1588i.m1442t(), PopAction.AUTO_CLOSE);
        this.f1589j.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m1409K(Runnable runnable) {
        e51.m9027J(runnable);
        if (NullChecker.a(this.f2673b)) {
            this.f2673b.call();
        }
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: f */
    public void mo1136f(boolean z) {
        C0285b c0285b = this.f1589j;
        if (c0285b == null || !c0285b.isShowing()) {
            return;
        }
        C0285b c0285b2 = this.f1589j;
        if (z) {
            c0285b2.getContentView().setTranslationY(0.0f);
            this.f1589j.getContentView().setAlpha(1.0f);
        } else {
            c0285b2.getContentView().setTranslationY(-4000.0f);
            this.f1589j.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: g */
    public void mo1137g(uc80 uc80Var) {
        m1407I();
    }

    public int getPriority() {
        return this.f1588i.f1612n;
    }

    @Override // p007l.fdb0
    /* JADX INFO: renamed from: j */
    public int mo1410j() {
        return this.f1588i.f1599a.hashCode();
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: m */
    public Act mo1411m() {
        return (Act) this.f1588i.f1599a;
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: n */
    public void mo1143n(boolean z) {
        C0285b c0285b = this.f1589j;
        if (c0285b != null && c0285b.isShowing()) {
            this.f1589j.dismiss();
            return;
        }
        f0m f0mVar = this.f1856f;
        if (f0mVar != null) {
            f0mVar.mo1381a(this);
        }
    }

    @Override // p007l.fdb0
    /* JADX INFO: renamed from: o */
    public String mo1412o() {
        return this.f1588i.f1603e;
    }

    @Override // p007l.fdb0
    /* JADX INFO: renamed from: p */
    public String mo1413p() {
        return this.f1588i.f1602d;
    }

    @Override // p007l.aie0
    /* JADX INFO: renamed from: u */
    public int mo1414u() {
        return super.mo1414u() > 0 ? super.mo1414u() : C0283a.m1367F(this.f1588i.f1612n);
    }
}
