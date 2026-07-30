package com.p046p1.mobile.putong.live.livingroom.virtual.settle;

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
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.Frame;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.ap0;
import p149l.bt0;
import p149l.e30;
import p149l.ebp0;
import p149l.ffw;
import p149l.hxs;
import p149l.qau;
import p149l.t100;
import p149l.x5p0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u0001:\u0001_B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000eR\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001b\u0010R\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010\u0016R\u001b\u0010U\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010\u0016R\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006`"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "m0", "(Landroid/view/View;)V", "r", "()V", "v0", "z0", "s0", "Landroid/animation/Animator;", "w0", "()Landroid/animation/Animator;", "t0", "y0", "onFinishInflate", "Ll/x5p0;", "presenter", "B0", "(Ll/x5p0;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView;)V", "_root", "e", "Landroid/view/View;", "get_bg", "()Landroid/view/View;", "set_bg", "_bg", "Lv/VLinear;", "f", "Lv/VLinear;", "get_content_layout", "()Lv/VLinear;", "set_content_layout", "(Lv/VLinear;)V", "_content_layout", "Lv/VDraweeView;", "g", "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "h", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", RXScreenCaptureService.KEY_INDEX, "get_summary", "set_summary", "_summary", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "j", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga", "k", "Lkotlin/Lazy;", "getShowAnim", "showAnim", BLiveStormDanmakuGiftResourceType.f44444l, "getHideAnim", "hideAnim", "", "m", "Z", "hasStartHideAnim", "", "n", "J", "svgaStartTime", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "(Landroid/animation/Animator;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12985b extends AnimatorListenerAdapter {
        public C12985b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            animation.getClass();
            xdl0.m208344M(VoiceVirtualSettleSuccessView.this, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004¨\u0006\f"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/settle/VoiceVirtualSettleSuccessView$c", "Ll/ap0;", "", "g", "()V", "", Frame.TYPE, "", "percentage", "h", "(ID)V", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12986c extends ap0 {
        public C12986c() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            VoiceVirtualSettleSuccessView.this.hasStartHideAnim = false;
            xdl0.m208344M(VoiceVirtualSettleSuccessView.this, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            VoiceVirtualSettleSuccessView.this.svgaStartTime = System.currentTimeMillis();
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: h */
        public void mo76135h(int frame, double percentage) {
            super.mo76135h(frame, percentage);
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
        this.showAnim = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.zap0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualSettleSuccessView.m77536l0(this.f202385a);
            }
        });
        this.hideAnim = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.abp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceVirtualSettleSuccessView.m77533i0(this.f68740a);
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
    public static Animator m77533i0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        return voiceVirtualSettleSuccessView.m77548t0();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m77534j0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, List list) {
        if (list.isEmpty()) {
            return;
        }
        String str = ((User) list.get(0)).m60124fp().profileSmall().formatted();
        voiceVirtualSettleSuccessView.m77547s0();
        xdl0.m208344M(voiceVirtualSettleSuccessView, true);
        hxs.m133408u("context_livingAct", voiceVirtualSettleSuccessView.get_avatar(), str, t100.m186890d(110.0f), t100.m186890d(110.0f));
        voiceVirtualSettleSuccessView.getShowAnim().start();
        voiceVirtualSettleSuccessView.m77544y0();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m77535k0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        voiceVirtualSettleSuccessView.m77551z0();
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public static Animator m77536l0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView) {
        return voiceVirtualSettleSuccessView.m77550w0();
    }

    /* JADX INFO: renamed from: r */
    private final void m77541r() {
        xdl0.m208360X(get_content_layout(), (int) (xdl0.m208410x0(getContext()) * 0.35344827f));
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m77543u0(VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        voiceVirtualSettleSuccessView.get_content_layout().setAlpha(fFloatValue);
        voiceVirtualSettleSuccessView.get_bg().setAlpha(fFloatValue);
    }

    /* JADX INFO: renamed from: y0 */
    private final void m77544y0() {
        this.svgaStartTime = System.currentTimeMillis();
        get_svga().m68503m("https://auto.tancdn.com/v1/raw/164db5fb-c9d0-4552-8719-923e1f060e2f12.pdf", 1, new C12986c(), false);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m77545B0(@NotNull x5p0 presenter) {
        presenter.getClass();
        presenter.duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceUserMe()).subscribe(ffw.m121197h(new e30() { // from class: l.cbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualSettleSuccessView.m77534j0(this.f80176a, (List) obj);
            }
        }));
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    public final View get_bg() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_bg");
        return null;
    }

    @NotNull
    public final VLinear get_content_layout() {
        VLinear vLinear = this._content_layout;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_content_layout");
        return null;
    }

    @NotNull
    public final VoiceVirtualSettleSuccessView get_root() {
        VoiceVirtualSettleSuccessView voiceVirtualSettleSuccessView = this._root;
        if (voiceVirtualSettleSuccessView != null) {
            return voiceVirtualSettleSuccessView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_summary() {
        VText vText = this._summary;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_summary");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga() {
        AnimEffectPlayer animEffectPlayer = this._svga;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_svga");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77546m0(View view) {
        ebp0.m115524a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77546m0(this);
        m77541r();
        m77549v0();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m77547s0() {
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
    public final Animator m77548t0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(333L);
        valueAnimatorOfFloat.setInterpolator(null);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dbp0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VoiceVirtualSettleSuccessView.m77543u0(this.f85334a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C12985b());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m77549v0() {
        Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.bbp0
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return VoiceVirtualSettleSuccessView.m77535k0(this.f74870a);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final Animator m77550w0() {
        Animator animatorM103741n = bt0.m103741n(get_content_layout(), bt0.f77162i, 0.5f, 1.1f, 1.0f);
        animatorM103741n.setDuration(1000L);
        animatorM103741n.setInterpolator(new AccelerateDecelerateInterpolator());
        Property property = View.ALPHA;
        Animator animatorM103741n2 = bt0.m103741n(get_content_layout(), property, 0.5f, 1.0f);
        animatorM103741n2.setDuration(500L);
        animatorM103741n2.setInterpolator(new AccelerateDecelerateInterpolator());
        Animator animatorM103741n3 = bt0.m103741n(get_bg(), property, 0.5f, 1.0f);
        animatorM103741n3.setDuration(500L);
        animatorM103741n3.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorM103741n, animatorM103741n2, animatorM103741n3);
        return animatorSet;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m77551z0() {
        Context context = getContext();
        context.getClass();
        qau.m173780e(context, "https://auto.tancdn.com/v1/raw/164db5fb-c9d0-4552-8719-923e1f060e2f12.pdf", null, 4, null);
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
