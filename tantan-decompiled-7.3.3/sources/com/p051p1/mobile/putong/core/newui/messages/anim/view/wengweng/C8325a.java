package com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.C8325a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;
import p153l.p9r;
import p153l.vdq0;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "wengWengHeaderView", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "j", "()V", "", "speedDuration", "m", "(J)V", "o", "", "hideHeadView", "r", "(Z)V", "", "height", "h", "(I)V", "startValue", "endValue", "Ll/x20;", "endAction", "setDuration", "k", "(IILl/x20;J)V", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "getWengWengHeaderView", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "set_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;)V", "_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "scrollState", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8325a {

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
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26452a;

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
            f26452a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f26453a;

        public b(x20 x20Var) {
            this.f26453a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f26453a.call();
        }
    }

    public C8325a(@NotNull WengWengHeaderView wengWengHeaderView) {
        wengWengHeaderView.getClass();
        this.wengWengHeaderView = wengWengHeaderView;
        Act act = wengWengHeaderView.getAct();
        this.act = act;
        this.scrollState = WengWengHeaderView.State.NormalState;
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(act);
        layoutInflaterM171370a.getClass();
        m43287g(layoutInflaterM171370a, wengWengHeaderView);
        m43290j();
    }

    /* JADX INFO: renamed from: b */
    public static void m43277b(C8325a c8325a) {
        WengWengHeaderView.State state = c8325a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.TipState;
        if (state != state2) {
            return;
        }
        c8325a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: c */
    public static void m43278c(C8325a c8325a) {
        WengWengHeaderView.State state = c8325a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.NormalState;
        if (state != state2) {
            return;
        }
        c8325a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: d */
    public static void m43279d(final C8325a c8325a) {
        if (c8325a.scrollState != WengWengHeaderView.State.TipState) {
            return;
        }
        c8325a.wengWengHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.udq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8325a.m43285q(this.f178584a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m43281f(C8325a c8325a) {
        if (c8325a.scrollState != WengWengHeaderView.State.NormalState) {
            return;
        }
        c8325a.wengWengHeaderView.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m43282l(C8325a c8325a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c8325a.m43288h(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m43283n(C8325a c8325a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8325a.m43292m(j);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m43284p(C8325a c8325a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8325a.m43293o(j);
    }

    /* JADX INFO: renamed from: q */
    public static final void m43285q(C8325a c8325a, View view) {
        c8325a.wengWengHeaderView.m43249u();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m43286s(C8325a c8325a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c8325a.m43294r(z);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m43287g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM200991b = vdq0.m200991b(this, inflater, parent);
        viewM200991b.getClass();
        return viewM200991b;
    }

    /* JADX INFO: renamed from: h */
    public final void m43288h(int height) {
        int i = a.f26452a[this.wengWengHeaderView.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH()) {
                m43289i().m43271z0(false);
            } else {
                m43289i().m43268v0();
            }
            m43289i().setPullHeight(height);
        } else if (i != 2) {
            nbr.m162172a();
            return;
        } else {
            m43289i().m43268v0();
            m43289i().setPullHeight(height);
        }
        this.wengWengHeaderView.m43245o(height);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final WengwengPullHeadAnim m43289i() {
        WengwengPullHeadAnim wengwengPullHeadAnim = this._pullhead_anim;
        if (wengwengPullHeadAnim != null) {
            return wengwengPullHeadAnim;
        }
        Intrinsics.m88391r("_pullhead_anim");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m43290j() {
        m43289i().setData(this.wengWengHeaderView);
    }

    /* JADX INFO: renamed from: k */
    public final void m43291k(int startValue, int endValue, x20 endAction, long setDuration) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.scrollAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.scrollAnim) != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startValue, endValue);
        this.scrollAnim = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.setDuration(setDuration);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tdq0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    C8325a.m43282l(this.f173379a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m43292m(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        wengWengHeaderView.setHeaderState(state);
        if (this.wengWengHeaderView.m43247q()) {
            this.scrollState = state;
            m43291k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH(), new x20() { // from class: l.pdq0
                @Override // p153l.x20
                public final void call() {
                    C8325a.m43281f(this.f151824a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m43291k(this.wengWengHeaderView.getLayoutParams().height, 0, new x20() { // from class: l.qdq0
                @Override // p153l.x20
                public final void call() {
                    C8325a.m43278c(this.f156761a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m43293o(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.TipState;
        wengWengHeaderView.setHeaderState(state);
        m43289i().m43264r0();
        if (this.wengWengHeaderView.m43247q()) {
            this.scrollState = state;
            m43291k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_TIPS_HEIGH(), new x20() { // from class: l.rdq0
                @Override // p153l.x20
                public final void call() {
                    C8325a.m43279d(this.f162352a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m43291k(this.wengWengHeaderView.getLayoutParams().height, 0, new x20() { // from class: l.sdq0
                @Override // p153l.x20
                public final void call() {
                    C8325a.m43277b(this.f167455a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m43294r(boolean hideHeadView) {
        if (hideHeadView) {
            m43289i().m43264r0();
        }
        m43289i().m43271z0(false);
    }
}
