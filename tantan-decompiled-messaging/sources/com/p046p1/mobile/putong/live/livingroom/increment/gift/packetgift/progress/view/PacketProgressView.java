package com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bgv;
import p149l.bt0;
import p149l.e660;
import p149l.f660;
import p149l.fld0;
import p149l.m660;
import p149l.s7m;
import p149l.t560;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 Y2\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00132\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\u0013¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001a\u00020\u0013¢\u0006\u0004\b/\u0010\u0015J\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020!¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0013¢\u0006\u0004\b2\u0010\u0015J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0002¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010\u0015J\u000f\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\b8\u0010\u0015J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010\u0015J\u000f\u0010>\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010\u0015R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/s7m;", "Ll/e660;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "onFinishInflate", "()V", "presenter", "p0", "(Ll/e660;)V", "inflateView", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", BaseSei.INFO, "Ll/t560;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "withAnim", "w0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Ll/t560;Z)V", "countdown", "", "progress", "I0", "(IF)V", "y0", "z0", "v0", "()Z", "b", "G0", "E0", "q0", "B0", OMSTemplateModeType.view, "n0", "(Landroid/view/View;)V", "r", "D0", "u0", "Landroid/animation/AnimatorSet;", "s0", "()Landroid/animation/AnimatorSet;", "r0", "H0", "t0", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "get_countdownView", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "set_countdownView", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;)V", "_countdownView", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "get_progressBar", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "set_progressBar", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;)V", "_progressBar", "f", "Ll/e660;", "g", "Landroid/animation/AnimatorSet;", "showAnimSet", "h", "hideAnimSet", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "currentInfo", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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

    /* JADX INFO: renamed from: D0 */
    private final void m73944D0() {
        f660 f660Var = f660.INSTANCE;
        Context context = getContext();
        context.getClass();
        f660Var.m119583a(context, get_countdownView(), "LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m73945h0(PacketProgressView packetProgressView) {
        packetProgressView.m73956H0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m73946i0(PacketProgressView packetProgressView, View view) {
        packetProgressView.m73944D0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m73947j0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        xdl0.m208325C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: k0 */
    public static void m73948k0(PacketProgressView packetProgressView) {
        xdl0.m208344M(packetProgressView, false);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m73949l0(PacketProgressView packetProgressView) {
        xdl0.m208344M(packetProgressView, true);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m73950m0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        xdl0.m208325C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: r */
    private final void m73951r() {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.g660
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PacketProgressView.m73946i0(this.f101230a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    private final void m73952u0() {
        this.showAnimSet = m73964s0();
        this.hideAnimSet = m73963r0();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m73953B0() {
        xdl0.m208344M(this, true);
        xdl0.m208325C0(this, GiftWealthLevelView.f50366G);
        setAlpha(1.0f);
        m73956H0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m73954E0() {
        if (m73962q0()) {
            AnimatorSet animatorSet = this.hideAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.m87502r("hideAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.hideAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.m87502r("hideAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
            m73965t0();
            get_progressBar().m73935j0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m73955G0() {
        if (m73962q0()) {
            AnimatorSet animatorSet = this.showAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.m87502r("showAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.showAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.m87502r("showAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m73956H0() {
        fld0<bgv> fld0Var = fld0.f98151f;
        if (((bgv) ypv.m215673l(fld0Var)).m101724d()) {
            m73944D0();
            ((bgv) ypv.m215673l(fld0Var)).m101740t();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m73957I0(int countdown, float progress) {
        get_countdownView().m73931k0(countdown, progress);
    }

    /* JADX INFO: renamed from: b */
    public final void m73958b() {
        xdl0.m208325C0(this, 0);
        xdl0.m208344M(this, false);
        m73965t0();
        get_progressBar().m73935j0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @NotNull
    public final PacketCountdownView get_countdownView() {
        PacketCountdownView packetCountdownView = this._countdownView;
        if (packetCountdownView != null) {
            return packetCountdownView;
        }
        Intrinsics.m87502r("_countdownView");
        return null;
    }

    @NotNull
    public final PacketProgressBar get_progressBar() {
        PacketProgressBar packetProgressBar = this._progressBar;
        if (packetProgressBar != null) {
            return packetProgressBar;
        }
        Intrinsics.m87502r("_progressBar");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m73960o0(inflater, parent);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m73959n0(View view) {
        m660.m153184a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m73960o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM153185b = m660.m153185b(this, inflater, parent);
        viewM153185b.getClass();
        return viewM153185b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73959n0(this);
        m73952u0();
        m73951r();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull e660<?> presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m73962q0() {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.currentInfo;
        if (bLivePacketSystemCommentStatus != null) {
            return bLivePacketSystemCommentStatus.show;
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final AnimatorSet m73963r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(GiftWealthLevelView.f50366G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.k660
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m73947j0(this.f121264a, valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, ViewGroup.ALPHA, 1.0f, 0.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.l660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m73948k0(this.f126231a);
            }
        });
        return animatorSet;
    }

    /* JADX INFO: renamed from: s0 */
    public final AnimatorSet m73964s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, GiftWealthLevelView.f50366G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h660
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m73950m0(this.f106009a, valueAnimator);
            }
        });
        Animator animatorM103741n = bt0.m103741n(this, ViewGroup.ALPHA, 0.0f, 1.0f);
        animatorM103741n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM103741n);
        bt0.m103749v(animatorSet, new Runnable() { // from class: l.i660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m73949l0(this.f111678a);
            }
        });
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.j660
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m73945h0(this.f116390a);
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
    public final void m73965t0() {
        C4348d.m20896l().m20900k("LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m73966v0() {
        return get_progressBar().m73936k0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m73967w0(@NotNull BLivePacketSystemCommentStatus info, @NotNull t560 listener, boolean withAnim) {
        info.getClass();
        listener.getClass();
        boolean z = info.show;
        if (z) {
            this.currentInfo = info;
            xdl0.m208344M(this, z);
            get_countdownView().m73929i0(info);
            get_progressBar().m73940o0(info, listener, withAnim);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m73968y0() {
        get_countdownView().m73930j0();
        get_progressBar().m73941p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m73969z0() {
        get_progressBar().m73942q0();
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
