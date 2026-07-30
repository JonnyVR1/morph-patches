package com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.C8174a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.l9r;
import p149l.o7r;
import p149l.r4q0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a;", "", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "wengWengHeaderView", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "j", "()V", "", "speedDuration", "m", "(J)V", "o", "", "hideHeadView", "r", "(Z)V", "", "height", "h", "(I)V", "startValue", "endValue", "Ll/d30;", "endAction", "setDuration", "k", "(IILl/d30;J)V", "a", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "getWengWengHeaderView", "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView;", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "b", "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;", "set_pullhead_anim", "(Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengwengPullHeadAnim;)V", "_pullhead_anim", "Lcom/p1/mobile/android/app/Act;", "c", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/messages/anim/view/wengweng/WengWengHeaderView$State;", "scrollState", "Landroid/animation/ValueAnimator;", "e", "Landroid/animation/ValueAnimator;", "scrollAnim", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8174a {

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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25710a;

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
            f25710a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.anim.view.wengweng.a$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/newui/messages/anim/view/wengweng/a$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f25711a;

        public b(d30 d30Var) {
            this.f25711a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            this.f25711a.call();
        }
    }

    public C8174a(@NotNull WengWengHeaderView wengWengHeaderView) {
        wengWengHeaderView.getClass();
        this.wengWengHeaderView = wengWengHeaderView;
        Act act = wengWengHeaderView.getAct();
        this.act = act;
        this.scrollState = WengWengHeaderView.State.NormalState;
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(act);
        layoutInflaterM163037a.getClass();
        m42276g(layoutInflaterM163037a, wengWengHeaderView);
        m42279j();
    }

    /* JADX INFO: renamed from: b */
    public static void m42266b(C8174a c8174a) {
        WengWengHeaderView.State state = c8174a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.TipState;
        if (state != state2) {
            return;
        }
        c8174a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: c */
    public static void m42267c(C8174a c8174a) {
        WengWengHeaderView.State state = c8174a.scrollState;
        WengWengHeaderView.State state2 = WengWengHeaderView.State.NormalState;
        if (state != state2) {
            return;
        }
        c8174a.wengWengHeaderView.setHeaderState(state2);
    }

    /* JADX INFO: renamed from: d */
    public static void m42268d(final C8174a c8174a) {
        if (c8174a.scrollState != WengWengHeaderView.State.TipState) {
            return;
        }
        c8174a.wengWengHeaderView.setOnClickListener(new View.OnClickListener() { // from class: l.q4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8174a.m42274q(this.f152668a, view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m42270f(C8174a c8174a) {
        if (c8174a.scrollState != WengWengHeaderView.State.NormalState) {
            return;
        }
        c8174a.wengWengHeaderView.setOnClickListener(null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m42271l(C8174a c8174a, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        c8174a.m42277h(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m42272n(C8174a c8174a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8174a.m42281m(j);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m42273p(C8174a c8174a, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        c8174a.m42282o(j);
    }

    /* JADX INFO: renamed from: q */
    public static final void m42274q(C8174a c8174a, View view) {
        c8174a.wengWengHeaderView.m42238u();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m42275s(C8174a c8174a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c8174a.m42283r(z);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m42276g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM177822b = r4q0.m177822b(this, inflater, parent);
        viewM177822b.getClass();
        return viewM177822b;
    }

    /* JADX INFO: renamed from: h */
    public final void m42277h(int height) {
        int i = a.f25710a[this.wengWengHeaderView.getHeaderState().ordinal()];
        if (i == 1) {
            if (height == this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH()) {
                m42278i().m42260z0(false);
            } else {
                m42278i().m42257v0();
            }
            m42278i().setPullHeight(height);
        } else if (i != 2) {
            l9r.m149037a();
            return;
        } else {
            m42278i().m42257v0();
            m42278i().setPullHeight(height);
        }
        this.wengWengHeaderView.m42234o(height);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final WengwengPullHeadAnim m42278i() {
        WengwengPullHeadAnim wengwengPullHeadAnim = this._pullhead_anim;
        if (wengwengPullHeadAnim != null) {
            return wengwengPullHeadAnim;
        }
        Intrinsics.m87502r("_pullhead_anim");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m42279j() {
        m42278i().setData(this.wengWengHeaderView);
    }

    /* JADX INFO: renamed from: k */
    public final void m42280k(int startValue, int endValue, d30 endAction, long setDuration) {
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
                    C8174a.m42271l(this.f147201a, valueAnimator3);
                }
            });
            valueAnimatorOfInt.addListener(new b(endAction));
            valueAnimatorOfInt.start();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m42281m(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.NormalState;
        wengWengHeaderView.setHeaderState(state);
        if (this.wengWengHeaderView.m42236q()) {
            this.scrollState = state;
            m42280k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_NORMAL_HEIGH(), new d30() { // from class: l.l4q0
                @Override // p149l.d30
                public final void call() {
                    C8174a.m42270f(this.f126052a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m42280k(this.wengWengHeaderView.getLayoutParams().height, 0, new d30() { // from class: l.m4q0
                @Override // p149l.d30
                public final void call() {
                    C8174a.m42267c(this.f131318a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m42282o(long speedDuration) {
        WengWengHeaderView wengWengHeaderView = this.wengWengHeaderView;
        WengWengHeaderView.State state = WengWengHeaderView.State.TipState;
        wengWengHeaderView.setHeaderState(state);
        m42278i().m42253r0();
        if (this.wengWengHeaderView.m42236q()) {
            this.scrollState = state;
            m42280k(this.wengWengHeaderView.getLayoutParams().height, this.wengWengHeaderView.getDEFALUE_TIPS_HEIGH(), new d30() { // from class: l.n4q0
                @Override // p149l.d30
                public final void call() {
                    C8174a.m42268d(this.f137119a);
                }
            }, speedDuration);
        } else {
            this.scrollState = state;
            m42280k(this.wengWengHeaderView.getLayoutParams().height, 0, new d30() { // from class: l.o4q0
                @Override // p149l.d30
                public final void call() {
                    C8174a.m42266b(this.f141806a);
                }
            }, speedDuration);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m42283r(boolean hideHeadView) {
        if (hideHeadView) {
            m42278i().m42253r0();
        }
        m42278i().m42260z0(false);
    }
}
