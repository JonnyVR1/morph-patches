package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.izs;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/view/widgets/IntlLiveNewLabelDView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;", "data", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/putong/live/base/data/BLiveCoverLabel;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "imageTop", "b", "imageBackground", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlLiveNewLabelDView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageTop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageBackground;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntlLiveNewLabelDView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX INFO: renamed from: p */
    private final void m71516p() {
        this.imageBackground = new VDraweeView(getContext());
        addView(this.imageBackground, new FrameLayout.LayoutParams(-1, -1));
        this.imageTop = new VDraweeView(getContext());
        int i = qa00.f156335v;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 5;
        int i2 = qa00.f156321h;
        layoutParams.topMargin = i2;
        layoutParams.setMarginEnd(i2);
        addView(this.imageTop, layoutParams);
    }

    /* JADX INFO: renamed from: s */
    public final void m71517s(@NotNull BLiveCoverLabel data) {
        data.getClass();
        removeAllViews();
        m71516p();
        izs.m142868s("context_square", this.imageTop, data.icon);
        izs.m142868s("context_square", this.imageBackground, data.bgImage);
    }
}
