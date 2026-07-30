package com.p046p1.mobile.putong.core.p053ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p149l.d7e0;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/active/SeeActiveHeadItem;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "", "url", "", "isShowMoreView", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;Z)V", "Landroid/view/View;", OMSTemplateModeType.view, "p", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_vv_head", "()Lv/VDraweeView;", "set_vv_head", "(Lv/VDraweeView;)V", "_vv_head", "Lv/VImage;", "b", "Lv/VImage;", "get_iv_more", "()Lv/VImage;", "set_iv_more", "(Lv/VImage;)V", "_iv_more", "card_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SeeActiveHeadItem extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _vv_head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _iv_more;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeeActiveHeadItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    @NotNull
    public final VImage get_iv_more() {
        VImage vImage = this._iv_more;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_iv_more");
        return null;
    }

    @NotNull
    public final VDraweeView get_vv_head() {
        VDraweeView vDraweeView = this._vv_head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_vv_head");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44241p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m44241p(View view) {
        d7e0.m110225a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public final void m44242s(@NotNull String url, boolean isShowMoreView) {
        url.getClass();
        qib0.f154691G.m102336O(get_vv_head(), url, 2, 50);
        if (isShowMoreView) {
            xdl0.m208344M(get_iv_more(), true);
        } else {
            xdl0.m208344M(get_iv_more(), false);
        }
    }

    public final void set_iv_more(@NotNull VImage vImage) {
        vImage.getClass();
        this._iv_more = vImage;
    }

    public final void set_vv_head(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._vv_head = vDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeActiveHeadItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeeActiveHeadItem(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
