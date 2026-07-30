package com.p051p1.mobile.android.p053ui.pushbubble;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.android.p053ui.poplevel.PopAction;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.abc0;
import p153l.al80;
import p153l.c3m;
import p153l.fqe0;
import p153l.gt0;
import p153l.l51;
import p153l.pcj;
import p153l.qa00;
import p153l.qcj;
import p153l.x20;
import p153l.z2m;

/* JADX INFO: loaded from: classes8.dex */
public class SimplePushBubble extends fqe0 {

    /* JADX INFO: renamed from: k */
    public static final int f16606k = qa00.m175859d(92.0f);

    /* JADX INFO: renamed from: l */
    public static final int f16607l = qa00.m175859d(76.0f);

    /* JADX INFO: renamed from: i */
    public final C4523a f16608i;

    /* JADX INFO: renamed from: j */
    public C4524b f16609j;

    public static class PushBubbleFrame extends VFrame {

        /* JADX INFO: renamed from: d */
        public static final int f16610d = qa00.f156319f;

        /* JADX INFO: renamed from: a */
        public float f16611a;

        /* JADX INFO: renamed from: b */
        public x20 f16612b;

        /* JADX INFO: renamed from: c */
        public boolean f16613c;

        public PushBubbleFrame(Context context) {
            super(context);
        }

        @Override // p151v.VFrame, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.f16613c) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f16611a = motionEvent.getRawY();
            } else if (action == 2 && this.f16611a - motionEvent.getRawY() > f16610d) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!this.f16613c) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f16612b == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if ((action != 1 && action != 3) || this.f16611a - motionEvent.getRawY() <= f16610d) {
                return super.onTouchEvent(motionEvent);
            }
            this.f16612b.call();
            this.f16612b = null;
            return true;
        }

        /* JADX INFO: renamed from: p */
        public void m22142p(x20 x20Var) {
            this.f16612b = x20Var;
        }

        /* JADX INFO: renamed from: s */
        public void m22143s(boolean z) {
            this.f16613c = z;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$a */
    public static class C4523a {

        /* JADX INFO: renamed from: o */
        public static final pcj<String> f16614o = new pcj() { // from class: l.opf0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return SimplePushBubble.C4523a.m22147d();
            }
        };

        /* JADX INFO: renamed from: p */
        public static final qcj<View, Animator> f16615p = new qcj() { // from class: l.ppf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SimplePushBubble.C4523a.m22144a((View) obj);
            }
        };

        /* JADX INFO: renamed from: q */
        public static final qcj<View, Animator> f16616q = new qcj() { // from class: l.qpf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SimplePushBubble.C4523a.m22145b((View) obj);
            }
        };

        /* JADX INFO: renamed from: r */
        public static final qcj<View, Animator> f16617r = new qcj() { // from class: l.rpf0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return SimplePushBubble.C4523a.m22146c((View) obj);
            }
        };

        /* JADX INFO: renamed from: s */
        public static final FrameLayout.LayoutParams f16618s = new FrameLayout.LayoutParams(-2, -2);

        /* JADX INFO: renamed from: a */
        public final Activity f16619a;

        /* JADX INFO: renamed from: b */
        public final View f16620b;

        /* JADX INFO: renamed from: l */
        public x20 f16630l;

        /* JADX INFO: renamed from: m */
        public c3m f16631m;

        /* JADX INFO: renamed from: c */
        public int f16621c = -1;

        /* JADX INFO: renamed from: d */
        public String f16622d = f16614o.call();

        /* JADX INFO: renamed from: e */
        public String f16623e = "default";

        /* JADX INFO: renamed from: f */
        public int f16624f = 3000;

        /* JADX INFO: renamed from: g */
        public qcj<View, Animator> f16625g = f16615p;

        /* JADX INFO: renamed from: h */
        public qcj<View, Animator> f16626h = f16616q;

        /* JADX INFO: renamed from: i */
        public qcj<View, Animator> f16627i = f16617r;

        /* JADX INFO: renamed from: j */
        public ViewGroup.LayoutParams f16628j = f16618s;

        /* JADX INFO: renamed from: k */
        public boolean f16629k = true;

        /* JADX INFO: renamed from: n */
        public int f16632n = 2;

        public C4523a(@NonNull Activity activity, @NonNull View view) {
            this.f16619a = activity;
            this.f16620b = view;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Animator m22144a(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -SimplePushBubble.f16606k, 0.0f);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Animator m22145b(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f16606k);
            objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            objectAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Animator m22146c(View view) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", 0.0f, -SimplePushBubble.f16606k));
            animatorSet.setDuration(300L);
            return animatorSet;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ String m22147d() {
            return "" + System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: A */
        public C4523a m22162A(int i) {
            this.f16632n = i;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C4523a m22163B(int i) {
            if (i == 1) {
                this.f16628j = new FrameLayout.LayoutParams(-2, qa00.m175859d(52.0f));
                return this;
            }
            if (i == 2) {
                this.f16628j = new FrameLayout.LayoutParams(-2, qa00.m175859d(72.0f));
                return this;
            }
            if (i != 3) {
                this.f16628j = f16618s;
                return this;
            }
            this.f16628j = new FrameLayout.LayoutParams(-2, qa00.m175859d(96.0f));
            return this;
        }

        /* JADX INFO: renamed from: C */
        public C4523a m22164C(@DrawableRes int i) {
            this.f16621c = i;
            return this;
        }

        /* JADX INFO: renamed from: D */
        public C4523a m22165D(@Nullable qcj<View, Animator> qcjVar) {
            this.f16625g = qcjVar;
            return this;
        }

        /* JADX INFO: renamed from: E */
        public C4523a m22166E(boolean z) {
            this.f16629k = z;
            return this;
        }

        /* JADX INFO: renamed from: F */
        public C4523a m22167F(x20 x20Var) {
            this.f16630l = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public SimplePushBubble m22168s() {
            return new SimplePushBubble(this);
        }

        /* JADX INFO: renamed from: t */
        public String m22169t() {
            c3m c3mVar = this.f16631m;
            return c3mVar != null ? c3mVar.getOnlyName() : "unknown";
        }

        /* JADX INFO: renamed from: u */
        public C4523a m22170u(@NonNull String str) {
            this.f16623e = str;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C4523a m22171v(@NonNull String str) {
            this.f16622d = str;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C4523a m22172w(int i) {
            this.f16624f = i;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C4523a m22173x(@Nullable qcj<View, Animator> qcjVar) {
            this.f16626h = qcjVar;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C4523a m22174y(@NonNull ViewGroup.LayoutParams layoutParams) {
            this.f16628j = layoutParams;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C4523a m22175z(@NonNull c3m c3mVar) {
            this.f16631m = c3mVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.pushbubble.SimplePushBubble$b */
    public static class C4524b extends PopupWindow {

        /* JADX INFO: renamed from: a */
        public final Animator f16633a;

        /* JADX INFO: renamed from: b */
        public final Animator f16634b;

        /* JADX INFO: renamed from: c */
        public final C4523a f16635c;

        public C4524b(@NonNull final C4523a c4523a) {
            this.f16635c = c4523a;
            final PushBubbleFrame pushBubbleFrame = new PushBubbleFrame(c4523a.f16619a);
            pushBubbleFrame.setClickable(true);
            if (c4523a.f16621c > 0) {
                pushBubbleFrame.setBackgroundResource(c4523a.f16621c);
            } else if (c4523a.f16621c != 0) {
                int i = qa00.f156321h;
                int i2 = qa00.f156323j;
                pushBubbleFrame.setPadding(i, i2, i, i2);
                pushBubbleFrame.setBackgroundResource(abc0.f69588y);
            }
            pushBubbleFrame.setMinimumWidth(SimplePushBubble.f16606k);
            pushBubbleFrame.setMinimumHeight(SimplePushBubble.f16607l);
            pushBubbleFrame.m22143s(c4523a.f16629k);
            pushBubbleFrame.m22142p(new x20() { // from class: com.p1.mobile.android.ui.pushbubble.a
                @Override // p153l.x20
                public final void call() {
                    this.f16636a.m22181f(c4523a, pushBubbleFrame);
                }
            });
            ViewParent parent = c4523a.f16620b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c4523a.f16620b);
            }
            pushBubbleFrame.addView(c4523a.f16620b, c4523a.f16628j);
            this.f16633a = c4523a.f16625g == null ? null : (Animator) c4523a.f16625g.call(pushBubbleFrame);
            this.f16634b = c4523a.f16626h != null ? (Animator) c4523a.f16626h.call(pushBubbleFrame) : null;
            if (c4523a.f16628j.width == -1) {
                setWidth(-1);
            } else {
                setWidth(-2);
            }
            setHeight(-2);
            setContentView(pushBubbleFrame);
        }

        /* JADX INFO: renamed from: d */
        public void m22179d(@Nullable Animator animator) {
            if (animator == null) {
                super.dismiss();
            } else {
                if (animator.isRunning()) {
                    return;
                }
                gt0.m132160f(animator, new Runnable() { // from class: l.spf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f170050a.m22180e();
                    }
                });
                animator.start();
            }
        }

        @Override // android.widget.PopupWindow
        public void dismiss() {
            m22179d(this.f16634b);
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m22180e() {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m22181f(C4523a c4523a, PushBubbleFrame pushBubbleFrame) {
            m22179d(c4523a.f16627i == null ? null : (Animator) c4523a.f16627i.call(pushBubbleFrame));
            if (NullChecker.m82486a(c4523a.f16630l)) {
                c4523a.f16630l.call();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m22182g() {
            Window window;
            Animator animator = this.f16633a;
            if ((animator != null && animator.isRunning()) || (window = this.f16635c.f16619a.getWindow()) == null || window.getDecorView() == null || window.getDecorView().getWindowToken() == null) {
                return;
            }
            Animator animator2 = this.f16633a;
            if (animator2 != null) {
                animator2.start();
            }
            showAtLocation(window.getDecorView(), 49, 0, 0);
        }
    }

    public SimplePushBubble(@NonNull C4523a c4523a) {
        this.f16608i = c4523a;
        this.f100282g = c4523a.f16631m;
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: A */
    public int mo22133A() {
        pcj<Boolean> pcjVar = this.f100279d;
        boolean z = pcjVar == null || pcjVar.call().booleanValue();
        Activity activity = this.f16608i.f16619a;
        if (!z || activity.isFinishing()) {
            if (NullChecker.m82486a(this.f121543b)) {
                this.f121543b.call();
            }
            return 0;
        }
        this.f16609j = new C4524b(this.f16608i);
        final Runnable runnable = new Runnable() { // from class: l.mpf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137917a.m22135J();
            }
        };
        this.f16609j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.npf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f143099a.m22136K(runnable);
            }
        });
        this.f16609j.m22182g();
        if (NullChecker.m82486a(this.f121542a)) {
            this.f121542a.call();
        }
        l51.m152888H(this.f16608i.f16619a, runnable, this.f16608i.f16624f);
        return this.f16608i.f16624f;
    }

    /* JADX INFO: renamed from: I */
    public void m22134I() {
        C4524b c4524b = this.f16609j;
        if (c4524b != null && c4524b.isShowing()) {
            this.f16609j.dismiss();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m22135J() {
        C4522a.m22099p().m22118o(this.f16608i.m22169t(), PopAction.AUTO_CLOSE);
        this.f16609j.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m22136K(Runnable runnable) {
        l51.m152890J(runnable);
        if (NullChecker.m82486a(this.f121543b)) {
            this.f121543b.call();
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        C4524b c4524b = this.f16609j;
        if (c4524b == null || !c4524b.isShowing()) {
            return;
        }
        C4524b c4524b2 = this.f16609j;
        if (z) {
            c4524b2.getContentView().setTranslationY(0.0f);
            this.f16609j.getContentView().setAlpha(1.0f);
        } else {
            c4524b2.getContentView().setTranslationY(-4000.0f);
            this.f16609j.getContentView().setAlpha(0.0f);
        }
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: g */
    public void mo21865g(al80 al80Var) {
        m22134I();
    }

    public int getPriority() {
        return this.f16608i.f16632n;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: j */
    public int mo22137j() {
        return this.f16608i.f16619a.hashCode();
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act mo22138m() {
        return (Act) this.f16608i.f16619a;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        C4524b c4524b = this.f16609j;
        if (c4524b != null && c4524b.isShowing()) {
            this.f16609j.dismiss();
            return;
        }
        z2m z2mVar = this.f100281f;
        if (z2mVar != null) {
            z2mVar.mo22108a(this);
        }
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: o */
    public String mo22139o() {
        return this.f16608i.f16623e;
    }

    @Override // p153l.jlb0
    /* JADX INFO: renamed from: p */
    public String mo22140p() {
        return this.f16608i.f16622d;
    }

    @Override // p153l.fqe0
    /* JADX INFO: renamed from: u */
    public int mo22141u() {
        return super.mo22141u() > 0 ? super.mo22141u() : C4522a.m22094F(this.f16608i.f16632n);
    }
}
