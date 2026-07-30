package com.immomo.svgaplayer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.base.data.BLiveOpenStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u000fH\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0012\u0010(\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGADrawable;", "Landroid/graphics/drawable/Drawable;", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "(Lcom/immomo/svgaplayer/SVGAVideoEntity;)V", "dynamicItem", "Lcom/immomo/svgaplayer/SVGADynamicEntity;", "(Lcom/immomo/svgaplayer/SVGAVideoEntity;Lcom/immomo/svgaplayer/SVGADynamicEntity;)V", "value", "", "cleared", "getCleared", "()Z", "setCleared$svgalibrary_release", "(Z)V", "", "currentFrame", "getCurrentFrame", "()I", "setCurrentFrame$svgalibrary_release", "(I)V", BLiveTraceServerLocation.drawer, "Lcom/immomo/svgaplayer/SVGACanvasDrawer;", "getDynamicItem", "()Lcom/immomo/svgaplayer/SVGADynamicEntity;", "scaleType", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "getVideoItem", "()Lcom/immomo/svgaplayer/SVGAVideoEntity;", BLiveOpenStatus.draw, "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGADrawable extends Drawable {
    private boolean cleared;
    private int currentFrame;
    private final SVGACanvasDrawer drawer;

    @NotNull
    private final SVGADynamicEntity dynamicItem;

    @NotNull
    private ImageView.ScaleType scaleType;

    @NotNull
    private final SVGAVideoEntity videoItem;

    public SVGADrawable(@NotNull SVGAVideoEntity sVGAVideoEntity, @NotNull SVGADynamicEntity sVGADynamicEntity) {
        sVGAVideoEntity.getClass();
        sVGADynamicEntity.getClass();
        this.videoItem = sVGAVideoEntity;
        this.dynamicItem = sVGADynamicEntity;
        this.cleared = true;
        this.scaleType = ImageView.ScaleType.MATRIX;
        this.drawer = new SVGACanvasDrawer(sVGAVideoEntity, sVGADynamicEntity);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Nullable Canvas canvas) {
        if (this.cleared || canvas == null) {
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

    @NotNull
    public final SVGADynamicEntity getDynamicItem() {
        return this.dynamicItem;
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

    public final void setCleared$svgalibrary_release(boolean z) {
        if (this.cleared == z) {
            return;
        }
        this.cleared = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setCurrentFrame$svgalibrary_release(int i) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SVGADrawable(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        this(sVGAVideoEntity, new SVGADynamicEntity());
        sVGAVideoEntity.getClass();
    }
}
