package com.momo.xeengine.svgaplayer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.base.data.BLiveOpenStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006("}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/SVGADrawable;", "Landroid/graphics/drawable/Drawable;", "videoItem", "Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", "dynamicItem", "Lcom/momo/xeengine/svgaplayer/SVGADynamicEntity;", "(Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;Lcom/momo/xeengine/svgaplayer/SVGADynamicEntity;)V", "value", "", "cleared", "getCleared", "()Z", "setCleared$gift_player_release", "(Z)V", "", "currentFrame", "getCurrentFrame", "()I", "setCurrentFrame$gift_player_release", "(I)V", BLiveTraceServerLocation.drawer, "Lcom/momo/xeengine/svgaplayer/SVGACanvasDrawer;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getVideoItem", "()Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", BLiveOpenStatus.draw, "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
public final class SVGADrawable extends Drawable {
    private boolean cleared;
    private int currentFrame;
    private final SVGACanvasDrawer drawer;

    @NotNull
    private ImageView.ScaleType scaleType;

    @NotNull
    private final SVGAVideoEntity videoItem;

    public SVGADrawable(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull SVGADynamicEntity sVGADynamicEntity) {
        sVGAVideoEntity.getClass();
        sVGADynamicEntity.getClass();
        this.videoItem = sVGAVideoEntity;
        this.cleared = true;
        this.scaleType = ImageView.ScaleType.MATRIX;
        this.drawer = new SVGACanvasDrawer(sVGAVideoEntity, sVGADynamicEntity);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        if (this.cleared) {
            return;
        }
        this.drawer.drawFrame(canvas, this.currentFrame, this.scaleType);
    }

    public final boolean getCleared() {
        return this.cleared;
    }

    public final int getCurrentFrame() {
        return this.currentFrame;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @NotNull
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @NotNull
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    public final void setCleared$gift_player_release(boolean z) {
        if (this.cleared == z) {
            return;
        }
        this.cleared = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setCurrentFrame$gift_player_release(int i) {
        if (this.currentFrame == i) {
            return;
        }
        this.currentFrame = i;
        invalidateSelf();
    }

    public final void setScaleType(@NotNull ImageView.ScaleType scaleType) {
        scaleType.getClass();
        this.scaleType = scaleType;
    }
}
