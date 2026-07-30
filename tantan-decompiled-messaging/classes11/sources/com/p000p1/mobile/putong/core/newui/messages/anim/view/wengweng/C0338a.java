package com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng.C0338a;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.l9r;
import l.r4q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.o7r;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "wengWengHeaderView", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "j", "()V", "", "speedDuration", "m", "(J)V", "o", "", "hideHeadView", "r", "(Z)V", "", "height", "h", "(I)V", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", "k", "(IILl/d30;J)V", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "getWengWengHeaderView", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "i", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "set_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;)V", "_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "d", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "scrollState", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0338a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WengWengHeaderView wengWengHeaderView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public WengwengPullHeadAnim _pullhead_anim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public WengWengHeaderView.State scrollState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator scrollAnim;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4488a;

        static {
            int[] iArr = new int[WengWengHeaderView.State.values().length];
            try {
                iArr[WengWengHeaderView.State.NormalState.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WengWengHeaderView.State.TipState.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4488a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f4489a;

        public b(d30 d30Var) {
            this.f4489a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f4489a.call();
        }
    }

    public C0338a(@NotNull WengWengHeaderView wengWengHeaderView) {
        wengWengHeaderView.getClass();
        this.wengWengHeaderView = wengWengHeaderView;
        Act act = wengWengHeaderView.getAct();
        this.act = act;
        this.scrollState = WengWengHeaderView.State.NormalState;
        LayoutInflater layoutInflaterM19649a = o7r.m19649a(act);
        layoutInflaterM19649a.getClass();
        m6425g(layoutInflaterM19649a, wengWengHeaderView);
        m6428j();
    }

    /* JADX INFO: renamed from: b */
    public static void m6415b(C0338a c0338a) {
        WengWengHeaderView.State state = c0338a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.TipState;
        if (state != state2) {
            return;
        }
        c0338a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: c */
    public static void m6416c(C0338a c0338a) {
        WengWengHeaderView.State state = c0338a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.NormalState;
        if (state != state2) {
            return;
        }
        c0338a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: d */
    public static void m6417d(final C0338a c0338a) {
        if (c0338a.scrollState != WengWengHeaderView.State.TipState) {
            return;
        }
        c0338a.wengWengHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.q4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0338a.m6423q(this.f19027a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m6419f(C0338a c0338a) {
        if (c0338a.scrollState != WengWengHeaderView.State.NormalState) {
            return;
        }
        c0338a.wengWengHeaderView.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m6420l(C0338a c0338a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c0338a.m6426h(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m6421n(C0338a c0338a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c0338a.m6430m(j);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6422p(C0338a c0338a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c0338a.m6431o(j);
    }

    /* JADX INFO: renamed from: q */
    public static final void m6423q(C0338a c0338a, View view) {
        c0338a.wengWengHeaderView.m6387u();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6424s(C0338a c0338a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c0338a.m6432r(z);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m6425g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = r4q0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: h */
    public final void m6426h(int height) {
        int i = a.f4488a[this.wengWengHeaderView.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH()) {
                m6427i().m6409z0(false);
            } else {
                m6427i().m6406v0();
            }
            m6427i().setPullHeight(height);
        } else if (i != 2) {
            l9r.a();
            return;
        } else {
            m6427i().m6406v0();
            m6427i().setPullHeight(height);
        }
        this.wengWengHeaderView.m6383o(height);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final WengwengPullHeadAnim m6427i() {
        WengwengPullHeadAnim wengwengPullHeadAnim = this._pullhead_anim;
        if (wengwengPullHeadAnim != null) {
            return wengwengPullHeadAnim;
        }
        Intrinsics.r("_pullhead_anim");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m6428j() {
        m6427i().setData(this.wengWengHeaderView);
    }

    /* JADX INFO: renamed from: k */
    public final void m6429k(int startValue, int endValue, d30 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p4q0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C0338a.m6420l(this.f18390a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6430m(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        wengWengHeaderView.setHeaderState(state);
        if (this.wengWengHeaderView.m6385q()) {
            this.scrollState = state;
            m6429k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.l4q0
                public final void call() {
                    C0338a.m6419f(this.f15940a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m6429k(this.wengWengHeaderView.getLayoutParams().height, 0, new d30() { // from class: l.m4q0
                public final void call() {
                    C0338a.m6416c(this.f16503a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6431o(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.TipState;
        wengWengHeaderView.setHeaderState(state);
        m6427i().m6402r0();
        if (this.wengWengHeaderView.m6385q()) {
            this.scrollState = state;
            m6429k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.n4q0
                public final void call() {
                    C0338a.m6417d(this.f17225a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m6429k(this.wengWengHeaderView.getLayoutParams().height, 0, new d30() { // from class: l.o4q0
                public final void call() {
                    C0338a.m6415b(this.f17832a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6432r(boolean hideHeadView) {
        if (hideHeadView) {
            m6427i().m6402r0();
        }
        m6427i().m6409z0(false);
    }
}
