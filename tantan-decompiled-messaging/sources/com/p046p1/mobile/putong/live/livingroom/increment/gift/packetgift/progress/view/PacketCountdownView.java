package com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.progress.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLivePacketSystemCommentStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.t460;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/PacketCountdownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", BaseSei.INFO, "i0", "(Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;)V", "countdown", "", "progress", "k0", "(IF)V", "j0", "Landroid/view/View;", OMSTemplateModeType.view, "h0", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/CircleCountdownView;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/CircleCountdownView;", "get_circleCountdown", "()Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/CircleCountdownView;", "set_circleCountdown", "(Lcom/p1/mobile/putong/live/livingroom/increment/gift/packetgift/progress/view/CircleCountdownView;)V", "_circleCountdown", "Lv/VText;", "e", "Lv/VText;", "get_countdownText", "()Lv/VText;", "set_countdownText", "(Lv/VText;)V", "_countdownText", "f", "Lcom/p1/mobile/putong/live/base/data/BLivePacketSystemCommentStatus;", "bagStatus", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PacketCountdownView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public CircleCountdownView _circleCountdown;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _countdownText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public BLivePacketSystemCommentStatus bagStatus;

    public /* synthetic */ PacketCountdownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final CircleCountdownView get_circleCountdown() {
        CircleCountdownView circleCountdownView = this._circleCountdown;
        if (circleCountdownView != null) {
            return circleCountdownView;
        }
        Intrinsics.m87502r("_circleCountdown");
        return null;
    }

    @NotNull
    public final VText get_countdownText() {
        VText vText = this._countdownText;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_countdownText");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m73928h0(View view) {
        t460.m187148a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m73929i0(@NotNull BLivePacketSystemCommentStatus info) {
        info.getClass();
        this.bagStatus = info;
        get_countdownText().setText(info.getCountdownText());
        get_circleCountdown().m73927d(info.getCurrentCountdownProgress());
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public final void m73930j0() {
        get_circleCountdown().m73926c();
        BLivePacketSystemCommentStatus bLivePacketSystemCommentStatus = this.bagStatus;
        if (bLivePacketSystemCommentStatus != null) {
            get_countdownText().setText(bLivePacketSystemCommentStatus.getResetCountdownText());
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k0 */
    public final void m73931k0(int countdown, float progress) {
        get_countdownText().setText(countdown + BLiveStormDanmakuGiftResourceType.f44446s);
        get_circleCountdown().m73927d(progress);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73928h0(this);
    }

    public final void set_circleCountdown(@NotNull CircleCountdownView circleCountdownView) {
        circleCountdownView.getClass();
        this._circleCountdown = circleCountdownView;
    }

    public final void set_countdownText(@NotNull VText vText) {
        vText.getClass();
        this._countdownText = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketCountdownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PacketCountdownView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
