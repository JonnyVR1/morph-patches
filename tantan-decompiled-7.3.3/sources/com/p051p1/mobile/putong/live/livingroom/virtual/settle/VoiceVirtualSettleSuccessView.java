package com.p051p1.mobile.putong.live.livingroom.virtual.settle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bfp0;
import p153l.bnl0;
import p153l.dhw;
import p153l.gt0;
import p153l.ikp0;
import p153l.izs;
import p153l.qa00;
import p153l.rcu;
import p153l.wo0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u0001:\u0001_B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001b\u0010R\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0016R\u001b\u0010U\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010\u0016R\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "m0", "(Landroid/view/View;)V", "r", "()V", "v0", "z0", "s0", "Landroid/animation/Animator;", "w0", "()Landroid/animation/Animator;", "t0", "y0", "onFinishInflate", "Ll/bfp0;", "presenter", "B0", "(Ll/bfp0;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lv/VLinear;", "f", "Lv/VLinear;", "get_content_layout", "()Lv/VLinear;", "set_content_layout", "(Lv/VLinear;)V", "_content_layout", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "h", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", RXScreenCaptureService.KEY_INDEX, "get_summary", "set_summary", "_summary", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "j", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga", "k", "Lkotlin/Lazy;", "getShowAnim", "showAnim", BLiveStormDanmakuGiftResourceType.f45292l, "getHideAnim", "hideAnim", "", "m", "Z", "hasStartHideAnim", "", "n", "J", "svgaStartTime", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VoiceVirtualSettleSuccessView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VoiceVirtualSettleSuccessView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _content_layout;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _summary;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public AnimEffectPlayer _svga;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy showAnim;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy hideAnim;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean hasStartHideAnim;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long svgaStartTime;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13148b extends AnimatorListenerAdapter {
        public C13148b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            bnl0.m105524M(VoiceVirtualSettleSuccessView.this, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView$c", "Ll/wo0;", "", "g", "()V", "", Frame.TYPE, "", "percentage", "h", "(ID)V", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13149c extends wo0 {
        public C13149c() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            VoiceVirtualSettleSuccessView.this.hasStartHideAnim = false;
            bnl0.m105524M(VoiceVirtualSettleSuccessView.this, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            VoiceVirtualSettleSuccessView.this.svgaStartTime = System.currentTimeMillis();
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: h */
        public void mo77318h(int frame, double percentage) {
            super.mo77318h(frame, percentage);
            long jCurrentTimeMillis = System.currentTimeMillis() - VoiceVirtualSettleSuccessView.this.svgaStartTime;
            if (VoiceVirtualSettleSuccessView.this.hasStartHideAnim || jCurrentTimeMillis < 1667) {
                return;
            }
            VoiceVirtualSettleSuccessView.this.hasStartHideAnim = true;
            VoiceVirtualSettleSuccessView.this.getHideAnim().start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualSettleSuccessView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.showAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.dkp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualSettleSuccessView.m78719l0(this.f89425a);
            }
        });
        this.hideAnim = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.ekp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualSettleSuccessView.m78716i0(this.f94420a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Animator getHideAnim() {
        return (Animator) this.hideAnim.getValue();
    }

    private final Animator getShowAnim() {
        return (Animator) this.showAnim.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static Animator m78716i0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        return voiceVirtualSettleSuccessView.m78731t0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m78717j0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, List list) {
        if (list.isEmpty()) {
            return;
        }
        String str = ((User) list.get(0)).m61308fp().profileSmall().formatted();
        voiceVirtualSettleSuccessView.m78730s0();
        bnl0.m105524M(voiceVirtualSettleSuccessView, true);
        izs.m142870u("context_livingAct", voiceVirtualSettleSuccessView.get_avatar(), str, qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        voiceVirtualSettleSuccessView.getShowAnim().start();
        voiceVirtualSettleSuccessView.m78727y0();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m78718k0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        voiceVirtualSettleSuccessView.m78734z0();
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public static Animator m78719l0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        return voiceVirtualSettleSuccessView.m78733w0();
    }

    /* JADX INFO: renamed from: r */
    private final void m78724r() {
        bnl0.m105540X(get_content_layout(), (int) (bnl0.m105590x0(getContext()) * 0.35344827f));
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m78726u0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        voiceVirtualSettleSuccessView.get_content_layout().setAlpha(fFloatValue);
        voiceVirtualSettleSuccessView.get_bg().setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: y0 */
    private final void m78727y0() {
        this.svgaStartTime = System.currentTimeMillis();
        get_svga().m69686m("https://auto.tancdn.com/v1/raw/164db5fb-c9d0-4552-8719-923e1f060e2f12.pdf", 1, new C13149c(), false);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m78728B0(@NotNull bfp0 presenter) {
        presenter.getClass();
        presenter.duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceUserMe()).subscribe(dhw.m115829h(new y20() { // from class: l.gkp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualSettleSuccessView.m78717j0(this.f104756a, (List) obj);
            }
        }));
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    public final VLinear get_content_layout() {
        VLinear vLinear = this._content_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_content_layout");
        return null;
    }

    @NotNull
    public final VoiceVirtualSettleSuccessView get_root() {
        VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView = this._root;
        if (voiceVirtualSettleSuccessView != null) {
            return voiceVirtualSettleSuccessView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final VText get_summary() {
        VText vText = this._summary;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_summary");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga() {
        AnimEffectPlayer animEffectPlayer = this._svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_svga");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78729m0(View view) {
        ikp0.m140414a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78729m0(this);
        m78724r();
        m78732v0();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m78730s0() {
        get_content_layout().setAlpha(0.0f);
        get_bg().setAlpha(0.0f);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_bg(@NotNull View view) {
        view.getClass();
        this._bg = view;
    }

    public final void set_content_layout(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._content_layout = vLinear;
    }

    public final void set_root(@NotNull VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        voiceVirtualSettleSuccessView.getClass();
        this._root = voiceVirtualSettleSuccessView;
    }

    public final void set_summary(@NotNull VText vText) {
        vText.getClass();
        this._summary = vText;
    }

    public final void set_svga(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._svga = animEffectPlayer;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    @SuppressLint({"Recycle"})
    /* JADX INFO: renamed from: t0 */
    public final Animator m78731t0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hkp0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceVirtualSettleSuccessView.m78726u0(this.f110445a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C13148b());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m78732v0() {
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.fkp0
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return VoiceVirtualSettleSuccessView.m78718k0(this.f99549a);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final Animator m78733w0() {
        Animator animatorM132168n = gt0.m132168n(get_content_layout(), gt0.f106354i, 0.5f, 1.1f, 1.0f);
        animatorM132168n.setDuration(1000L);
        animatorM132168n.setInterpolator(new AccelerateDecelerateInterpolator());
        Property property = View.ALPHA;
        Animator animatorM132168n2 = gt0.m132168n(get_content_layout(), property, 0.5f, 1.0f);
        animatorM132168n2.setDuration(500L);
        animatorM132168n2.setInterpolator(new AccelerateDecelerateInterpolator());
        Animator animatorM132168n3 = gt0.m132168n(get_bg(), property, 0.5f, 1.0f);
        animatorM132168n3.setDuration(500L);
        animatorM132168n3.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM132168n, animatorM132168n2, animatorM132168n3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m78734z0() {
        Context context = getContext();
        context.getClass();
        rcu.m180827e(context, "https://auto.tancdn.com/v1/raw/164db5fb-c9d0-4552-8719-923e1f060e2f12.pdf", null, 4, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualSettleSuccessView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VoiceVirtualSettleSuccessView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ VoiceVirtualSettleSuccessView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
