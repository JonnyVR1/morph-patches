package com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

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
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.wealth.GiftWealthLevelView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.civ;
import p153l.gt0;
import p153l.htd0;
import p153l.iam;
import p153l.ke60;
import p153l.le60;
import p153l.se60;
import p153l.zd60;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 Y2\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002:\u0001ZB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00132\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\u0013¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020!¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0015J\r\u0010/\u001a\u00020\u0013¢\u0006\u0004\b/\u0010\u0015J\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0015J\r\u00101\u001a\u00020!¢\u0006\u0004\b1\u0010-J\r\u00102\u001a\u00020\u0013¢\u0006\u0004\b2\u0010\u0015J\u0017\u00104\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0002¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010\u0015J\u000f\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\b8\u0010\u0015J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010\u0015J\u000f\u0010>\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010\u0015R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/iam;", "Ll/ke60;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "o0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "onFinishInflate", "()V", "presenter", "p0", "(Ll/ke60;)V", "inflateView", "destroy", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", BaseSei.INFO, "Ll/zd60;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "withAnim", "w0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Ll/zd60;Z)V", "countdown", "", "progress", "I0", "(IF)V", "y0", "z0", "v0", "()Z", "b", "G0", "E0", "q0", "B0", OMSTemplateModeType.view, "n0", "(Landroid/view/View;)V", "r", "D0", "u0", "Landroid/animation/AnimatorSet;", "s0", "()Landroid/animation/AnimatorSet;", "r0", "H0", "t0", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "get_countdownView", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "set_countdownView", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;)V", "_countdownView", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "e", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "get_progressBar", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "set_progressBar", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;)V", "_progressBar", "f", "Ll/ke60;", "g", "Landroid/animation/AnimatorSet;", "showAnimSet", "h", "hideAnimSet", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "currentInfo", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PacketProgressView extends ConstraintLayout implements iam<ke60<?>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PacketCountdownView _countdownView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PacketProgressBar _progressBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ke60<?> presenter;

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
    private final void m75127D0() {
        le60 le60Var = le60.INSTANCE;
        Context context = getContext();
        context.getClass();
        le60Var.m153880a(context, get_countdownView(), "LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: h0 */
    public static void m75128h0(PacketProgressView packetProgressView) {
        packetProgressView.m75139H0();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75129i0(PacketProgressView packetProgressView, View view) {
        packetProgressView.m75127D0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m75130j0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        bnl0.m105505C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: k0 */
    public static void m75131k0(PacketProgressView packetProgressView) {
        bnl0.m105524M(packetProgressView, false);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m75132l0(PacketProgressView packetProgressView) {
        bnl0.m105524M(packetProgressView, true);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m75133m0(PacketProgressView packetProgressView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        bnl0.m105505C0(packetProgressView, ((Integer) animatedValue).intValue());
    }

    /* JADX INFO: renamed from: r */
    private final void m75134r() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.me60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PacketProgressView.m75129i0(this.f136438a, view);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    private final void m75135u0() {
        this.showAnimSet = m75147s0();
        this.hideAnimSet = m75146r0();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m75136B0() {
        bnl0.m105524M(this, true);
        bnl0.m105505C0(this, GiftWealthLevelView.f51214G);
        setAlpha(1.0f);
        m75139H0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E0 */
    public final void m75137E0() {
        if (m75145q0()) {
            AnimatorSet animatorSet = this.hideAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.m88391r("hideAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.hideAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.m88391r("hideAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
            m75148t0();
            get_progressBar().m75118j0();
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m75138G0() {
        if (m75145q0()) {
            AnimatorSet animatorSet = this.showAnimSet;
            AnimatorSet animatorSet2 = null;
            if (animatorSet == null) {
                Intrinsics.m88391r("showAnimSet");
                animatorSet = null;
            }
            if (animatorSet.isRunning()) {
                return;
            }
            AnimatorSet animatorSet3 = this.showAnimSet;
            if (animatorSet3 == null) {
                Intrinsics.m88391r("showAnimSet");
            } else {
                animatorSet2 = animatorSet3;
            }
            animatorSet2.start();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m75139H0() {
        htd0<civ> htd0Var = htd0.f111524f;
        if (((civ) zrv.m221194l(htd0Var)).m109960d()) {
            m75127D0();
            ((civ) zrv.m221194l(htd0Var)).m109976t();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m75140I0(int countdown, float progress) {
        get_countdownView().m75114k0(countdown, progress);
    }

    /* JADX INFO: renamed from: b */
    public final void m75141b() {
        bnl0.m105505C0(this, 0);
        bnl0.m105524M(this, false);
        m75148t0();
        get_progressBar().m75118j0();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @NotNull
    public final PacketCountdownView get_countdownView() {
        PacketCountdownView packetCountdownView = this._countdownView;
        if (packetCountdownView != null) {
            return packetCountdownView;
        }
        Intrinsics.m88391r("_countdownView");
        return null;
    }

    @NotNull
    public final PacketProgressBar get_progressBar() {
        PacketProgressBar packetProgressBar = this._progressBar;
        if (packetProgressBar != null) {
            return packetProgressBar;
        }
        Intrinsics.m88391r("_progressBar");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m75143o0(inflater, parent);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75142n0(View view) {
        se60.m185520a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: o0 */
    public final View m75143o0(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185521b = se60.m185521b(this, inflater, parent);
        viewM185521b.getClass();
        return viewM185521b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75142n0(this);
        m75135u0();
        m75134r();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull ke60<?> presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m75145q0() {
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.currentInfo;
        if (bLivePacketSystemCommentStatus != null) {
            return bLivePacketSystemCommentStatus.show;
        }
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public final AnimatorSet m75146r0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(GiftWealthLevelView.f51214G, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.qe60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m75130j0(this.f156796a, valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, ViewGroup.ALPHA, 1.0f, 0.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.re60
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m75131k0(this.f162400a);
            }
        });
        return animatorSet;
    }

    /* JADX INFO: renamed from: s0 */
    public final AnimatorSet m75147s0() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, GiftWealthLevelView.f51214G);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ne60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PacketProgressView.m75133m0(this.f141575a, valueAnimator);
            }
        });
        Animator animatorM132168n = gt0.m132168n(this, ViewGroup.ALPHA, 0.0f, 1.0f);
        animatorM132168n.setDuration(100L);
        animatorSet.playTogether(valueAnimatorOfInt, animatorM132168n);
        gt0.m132176v(animatorSet, new Runnable() { // from class: l.oe60
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m75132l0(this.f146972a);
            }
        });
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.pe60
            @Override // java.lang.Runnable
            public final void run() {
                PacketProgressView.m75128h0(this.f151878a);
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
    public final void m75148t0() {
        C4499d.m21895l().m21899k("LIVE_GIFT_PACKET_PROGRESS_BAR");
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m75149v0() {
        return get_progressBar().m75119k0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m75150w0(@NotNull BLivePacketSystemCommentStatus info, @NotNull zd60 listener, boolean withAnim) {
        info.getClass();
        listener.getClass();
        boolean z = info.show;
        if (z) {
            this.currentInfo = info;
            bnl0.m105524M(this, z);
            get_countdownView().m75112i0(info);
            get_progressBar().m75123o0(info, listener, withAnim);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m75151y0() {
        get_countdownView().m75113j0();
        get_progressBar().m75124p0();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m75152z0() {
        get_progressBar().m75125q0();
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
