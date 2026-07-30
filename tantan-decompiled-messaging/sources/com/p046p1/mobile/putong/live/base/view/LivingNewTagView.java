package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p149l.g3c0;
import p149l.kvc0;
import p149l.sgv;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/view/LivingNewTagView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveState;", "liveState", BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/putong/live/base/data/BLiveState;)V", "u", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", "Lcom/p1/mobile/putong/live/base/view/LiveMainlandTagView;", "a", "Lcom/p1/mobile/putong/live/base/view/LiveMainlandTagView;", "get_living", "()Lcom/p1/mobile/putong/live/base/view/LiveMainlandTagView;", "set_living", "(Lcom/p1/mobile/putong/live/base/view/LiveMainlandTagView;)V", "_living", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LivingNewTagView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public LiveMainlandTagView _living;

    public /* synthetic */ LivingNewTagView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final LiveMainlandTagView get_living() {
        LiveMainlandTagView liveMainlandTagView = this._living;
        if (liveMainlandTagView != null) {
            return liveMainlandTagView;
        }
        Intrinsics.m87502r("_living");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68784p(this);
        get_living().m68748c(-1, -1);
    }

    /* JADX INFO: renamed from: p */
    public final void m68784p(View view) {
        sgv.m184136a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final void m68785s(@NotNull BLiveState liveState) {
        liveState.getClass();
        xdl0.m208344M(this, TEnum.equals(liveState, "onlive"));
    }

    public final void set_living(@NotNull LiveMainlandTagView liveMainlandTagView) {
        liveMainlandTagView.getClass();
        this._living = liveMainlandTagView;
    }

    /* JADX INFO: renamed from: u */
    public final void m68786u() {
        setBackground(kvc0.m147353b(g3c0.f100380B));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivingNewTagView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivingNewTagView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LivingNewTagView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
