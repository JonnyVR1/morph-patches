package com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.bgv;
import l.bt0;
import l.fld0;
import l.s7m;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.e660;
import p002l.f660;
import p002l.m660;
import p002l.t560;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 Y2\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00132\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\u0013¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001a\u00020\u0013¢\u0006\u0004\b/\u0010\u0015J\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020!¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0013¢\u0006\u0004\b2\u0010\u0015J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0002¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010\u0015J\u000f\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\b8\u0010\u0015J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010\u0015J\u000f\u0010>\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010\u0015R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/s7m;", "Ll/e660;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "onFinishInflate", "()V", "presenter", "p0", "(Ll/e660;)V", "inflateView", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "info", "Ll/t560;", "listener", "", "withAnim", "w0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Ll/t560;Z)V", "countdown", "", "progress", "I0", "(IF)V", "y0", "z0", "v0", "()Z", "b", "G0", "E0", "q0", "B0", "view", "n0", "(Landroid/view/View;)V", "r", "D0", "u0", "Landroid/animation/AnimatorSet;", "s0", "()Landroid/animation/AnimatorSet;", "r0", "H0", "t0", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "d", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "get_countdownView", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "set_countdownView", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;)V", "_countdownView", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "get_progressBar", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "set_progressBar", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;)V", "_progressBar", "f", "Ll/e660;", "g", "Landroid/animation/AnimatorSet;", "showAnimSet", "h", "hideAnimSet", "i", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "currentInfo", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PacketProgressView extends ConstraintLayout implements s7m<e660<?>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PacketCountdownView _countdownView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PacketProgressBar _progressBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public e660<?> presenter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AnimatorSet showAnimSet;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public AnimatorSet hideAnimSet;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus currentInfo;

    public /* synthetic */ PacketProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D0 */
    private final void m7501D0() {
        f660 f660Var = f660.INSTANCE;
        Context context = getContext();
        context.getClass();
        f660Var.m12952a(context, get_countdownView(), "LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m7502h0(PacketProgressView packetProgressView) {
        packetProgressView.m7514H0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m7503i0(PacketProgressView packetProgressView, View view) {
        packetProgressView.m7501D0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static void m7504j0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        xdl0.C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static void m7505k0(PacketProgressView packetProgressView) {
        xdl0.M(packetProgressView, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public static void m7506l0(PacketProgressView packetProgressView) {
        xdl0.M(packetProgressView, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m0 */
    public static void m7507m0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        xdl0.C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final void m7508r() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.g660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PacketProgressView.m7503i0(this.f11281a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    private final void m7509u0() {
        this.showAnimSet = m7523s0();
        this.hideAnimSet = m7522r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final void m7510B0() {
        xdl0.M(this, true);
        xdl0.C0(this, GiftWealthLevelView.f6408G);
        setAlpha(1.0f);
        m7514H0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7511C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m7512E0() {
        if (m7521q0()) {
            AnimatorSet animatorSet = this.hideAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.r("hideAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.hideAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.r("hideAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
            m7524t0();
            get_progressBar().m7491j0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m7513G0() {
        if (m7521q0()) {
            AnimatorSet animatorSet = this.showAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.r("showAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.showAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.r("showAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m7514H0() {
        fld0 fld0Var = fld0.f;
        if (((bgv) ypv.l(fld0Var)).d()) {
            m7501D0();
            ((bgv) ypv.l(fld0Var)).t();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m7515I0(int countdown, float progress) {
        get_countdownView().m7487k0(countdown, progress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m7516b() {
        xdl0.C0(this, 0);
        xdl0.M(this, false);
        m7524t0();
        get_progressBar().m7491j0();
    }

    public void destroy() {
    }

    @NotNull
    public final PacketCountdownView get_countdownView() {
        PacketCountdownView packetCountdownView = this._countdownView;
        if (packetCountdownView != null) {
            return packetCountdownView;
        }
        Intrinsics.r("_countdownView");
        return null;
    }

    @NotNull
    public final PacketProgressBar get_progressBar() {
        PacketProgressBar packetProgressBar = this._progressBar;
        if (packetProgressBar != null) {
            return packetProgressBar;
        }
        Intrinsics.r("_progressBar");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m7519o0(inflater, parent);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m7518n0(View view) {
        m660.m17722a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m7519o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM17723b = m660.m17723b(this, inflater, parent);
        viewM17723b.getClass();
        return viewM17723b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7518n0(this);
        m7509u0();
        m7508r();
    }

    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void m7517i1(@NotNull e660<?> presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m7521q0() {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.currentInfo;
        if (bLivePacketSystemCommentStatus != null) {
            return bLivePacketSystemCommentStatus.show;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public final AnimatorSet m7522r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(GiftWealthLevelView.f6408G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k660
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m7504j0(this.f14217a, valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, ViewGroup.ALPHA, new float[]{1.0f, 0.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        bt0.f(animatorSet, new Runnable() { // from class: l.l660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m7505k0(this.f14686a);
            }
        });
        return animatorSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final AnimatorSet m7523s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, GiftWealthLevelView.f6408G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h660
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m7507m0(this.f11896a, valueAnimator);
            }
        });
        Animator animatorN = bt0.n(this, ViewGroup.ALPHA, new float[]{0.0f, 1.0f});
        animatorN.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorN);
        bt0.v(animatorSet, new Runnable() { // from class: l.i660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m7506l0(this.f13066a);
            }
        });
        bt0.f(animatorSet, new Runnable() { // from class: l.j660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m7502h0(this.f13600a);
            }
        });
        return animatorSet;
    }

    public final void set_countdownView(@NotNull PacketCountdownView packetCountdownView) {
        packetCountdownView.getClass();
        this._countdownView = packetCountdownView;
    }

    public final void set_progressBar(@NotNull PacketProgressBar packetProgressBar) {
        packetProgressBar.getClass();
        this._progressBar = packetProgressBar;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m7524t0() {
        d.l().k("LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m7525v0() {
        return get_progressBar().m7492k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m7526w0(@NotNull BLivePacketSystemCommentStatus info, @NotNull t560 listener, boolean withAnim) {
        info.getClass();
        listener.getClass();
        boolean z = info.show;
        if (z) {
            this.currentInfo = info;
            xdl0.M(this, z);
            get_countdownView().m7485i0(info);
            get_progressBar().m7496o0(info, listener, withAnim);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m7527y0() {
        get_countdownView().m7486j0();
        get_progressBar().m7497p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m7528z0() {
        get_progressBar().m7498q0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
