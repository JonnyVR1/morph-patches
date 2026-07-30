package com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar;
import com.p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.ap0;
import l.e51;
import l.mep0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.s560;
import p002l.t560;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\fJ\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\fJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\fJ\u000f\u0010\"\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\fR\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010>\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'\"\u0004\b=\u0010)R\"\u0010B\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u00105\u001a\u0004\b@\u00107\"\u0004\bA\u00109R\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "r", "()V", "onFinishInflate", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "info", "Ll/t560;", "listener", "", "withAnim", "o0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;Ll/t560;Z)V", "k0", "()Z", "p0", "q0", "j0", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "l0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;)V", "n0", "m0", "Lv/VFrame;", "d", "Lv/VFrame;", "get_progressBarParent", "()Lv/VFrame;", "set_progressBarParent", "(Lv/VFrame;)V", "_progressBarParent", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "get_progressBar", "()Landroid/widget/ProgressBar;", "set_progressBar", "(Landroid/widget/ProgressBar;)V", "_progressBar", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga_progress", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_progress", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_progress", "g", "get_complete_layout", "set_complete_layout", "_complete_layout", "h", "get_svga_complete", "set_svga_complete", "_svga_complete", "Lv/VText;", "i", "Lv/VText;", "get_progressText", "()Lv/VText;", "set_progressText", "(Lv/VText;)V", "_progressText", "j", "Ll/t560;", "k", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "lastStatus", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class PacketProgressBar extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VFrame _progressBarParent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ProgressBar _progressBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_progress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VFrame _complete_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_complete;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _progressText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public t560 listener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus lastStatus;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view.PacketProgressBar$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketProgressBar$a", "Ll/ap0;", "", "b", "()V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0405a extends ap0 {
        public C0405a() {
        }

        /* JADX INFO: renamed from: i */
        public static void m7499i(PacketProgressBar packetProgressBar) {
            t560 t560Var = packetProgressBar.listener;
            if (t560Var != null) {
                t560Var.mo12245a();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m7500b() {
            super.b();
            xdl0.M(PacketProgressBar.this.get_complete_layout(), false);
            Context context = PacketProgressBar.this.getContext();
            final PacketProgressBar packetProgressBar = PacketProgressBar.this;
            e51.H(context, new Runnable() { // from class: l.r560
                @Override // java.lang.Runnable
                public final void run() {
                    PacketProgressBar.C0405a.m7499i(packetProgressBar);
                }
            }, 200L);
        }
    }

    public /* synthetic */ PacketProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: r */
    private final void m7489r() {
        mep0.d1(get_complete_layout(), t100.d(6.0f));
        mep0.d1(get_progressBarParent(), t100.d(6.0f));
    }

    @NotNull
    public final VFrame get_complete_layout() {
        VFrame vFrame = this._complete_layout;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_complete_layout");
        return null;
    }

    @NotNull
    public final ProgressBar get_progressBar() {
        ProgressBar progressBar = this._progressBar;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.r("_progressBar");
        return null;
    }

    @NotNull
    public final VFrame get_progressBarParent() {
        VFrame vFrame = this._progressBarParent;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_progressBarParent");
        return null;
    }

    @NotNull
    public final VText get_progressText() {
        VText vText = this._progressText;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_progressText");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga_complete() {
        AnimEffectPlayer animEffectPlayer = this._svga_complete;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga_complete");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga_progress() {
        AnimEffectPlayer animEffectPlayer = this._svga_progress;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga_progress");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7490h0(View view) {
        s560.m22208a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7491j0() {
        if (xdl0.O0(get_svga_progress())) {
            get_svga_progress().o();
            xdl0.M(get_svga_progress(), false);
        }
        if (xdl0.O0(get_complete_layout())) {
            get_svga_complete().o();
            xdl0.M(get_complete_layout(), false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m7492k0() {
        return get_complete_layout().getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7493l0(BLivePacketSystemCommentStatus info) {
        if (info.isReachRewards()) {
            m7494m0();
        } else {
            m7495n0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7494m0() {
        xdl0.M(get_svga_progress(), false);
        xdl0.M(get_complete_layout(), true);
        xdl0.M(get_progressText(), false);
        get_svga_complete().l("https://auto.tancdn.com/v1/raw/6f04e2cd-0667-4478-a19f-63256f192d3a10.pdf", 1, new C0405a());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m7495n0() {
        xdl0.M(get_complete_layout(), false);
        xdl0.M(get_svga_progress(), true);
        xdl0.V(get_svga_progress(), ((get_progressBar().getWidth() * get_progressBar().getProgress()) / 100) - get_svga_progress().getWidth());
        get_svga_progress().o();
        get_svga_progress().l("https://auto.tancdn.com/v1/raw/f7d46515-3729-4143-881b-8824479c347c10.pdf", 1, (ap0) null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7496o0(@NotNull BLivePacketSystemCommentStatus info, @NotNull t560 listener, boolean withAnim) {
        info.getClass();
        listener.getClass();
        this.listener = listener;
        this.lastStatus = info;
        get_progressText().setText(info.getCurrentScoreString());
        get_progressBar().setProgress((int) (info.getCurrentScoreProgress() * 100.0f), true);
        xdl0.M(get_progressText(), true);
        if (withAnim) {
            m7493l0(info);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7490h0(this);
        m7489r();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7497p0() {
        get_progressBar().setProgress(0);
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.lastStatus;
        if (bLivePacketSystemCommentStatus != null) {
            get_progressText().setText(bLivePacketSystemCommentStatus.getResetScoreString());
        }
        xdl0.M(get_progressText(), true);
        xdl0.M(get_complete_layout(), false);
        xdl0.M(get_svga_progress(), false);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m7498q0() {
        m7497p0();
    }

    public final void set_complete_layout(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._complete_layout = vFrame;
    }

    public final void set_progressBar(@NotNull ProgressBar progressBar) {
        progressBar.getClass();
        this._progressBar = progressBar;
    }

    public final void set_progressBarParent(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._progressBarParent = vFrame;
    }

    public final void set_progressText(@NotNull VText vText) {
        vText.getClass();
        this._progressText = vText;
    }

    public final void set_svga_complete(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._svga_complete = animEffectPlayer;
    }

    public final void set_svga_progress(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._svga_progress = animEffectPlayer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
