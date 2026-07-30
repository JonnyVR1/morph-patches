package com.immomo.svgaplayer;

import android.graphics.Canvas;
import android.widget.ImageView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001f\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0016R\u00020\u00000\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, m88121d2 = {"Lcom/immomo/svgaplayer/SGVADrawer;", "", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "(Lcom/immomo/svgaplayer/SVGAVideoEntity;)V", "scaleEntity", "Lcom/immomo/svgaplayer/ScaleEntity;", "getScaleEntity", "()Lcom/immomo/svgaplayer/ScaleEntity;", "getVideoItem", "()Lcom/immomo/svgaplayer/SVGAVideoEntity;", "drawFrame", "", "canvas", "Landroid/graphics/Canvas;", "frameIndex", "", "scaleType", "Landroid/widget/ImageView$ScaleType;", "performScaleType", "requestFrameSprites", "", "Lcom/immomo/svgaplayer/SGVADrawer$SVGADrawerSprite;", "requestFrameSprites$svgalibrary_release", "SVGADrawerSprite", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public class SGVADrawer {

    @NotNull
    private final ScaleEntity scaleEntity;

    @NotNull
    private final SVGAVideoEntity videoItem;

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/immomo/svgaplayer/SGVADrawer$SVGADrawerSprite;", "", "imageKey", "", "frameEntity", "Lcom/immomo/svgaplayer/SVGAVideoSpriteFrameEntity;", "(Lcom/immomo/svgaplayer/SGVADrawer;Ljava/lang/String;Lcom/immomo/svgaplayer/SVGAVideoSpriteFrameEntity;)V", "getFrameEntity", "()Lcom/immomo/svgaplayer/SVGAVideoSpriteFrameEntity;", "getImageKey", "()Ljava/lang/String;", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public final class SVGADrawerSprite {

        @NotNull
        private final SVGAVideoSpriteFrameEntity frameEntity;

        @Nullable
        private final String imageKey;
        final /* synthetic */ SGVADrawer this$0;

        public SVGADrawerSprite(@Nullable SGVADrawer sGVADrawer, @NotNull String str, SVGAVideoSpriteFrameEntity sVGAVideoSpriteFrameEntity) {
            sVGAVideoSpriteFrameEntity.getClass();
            this.this$0 = sGVADrawer;
            this.imageKey = str;
            this.frameEntity = sVGAVideoSpriteFrameEntity;
        }

        @NotNull
        public final SVGAVideoSpriteFrameEntity getFrameEntity() {
            return this.frameEntity;
        }

        @Nullable
        public final String getImageKey() {
            return this.imageKey;
        }
    }

    public SGVADrawer(@NotNull SVGAVideoEntity sVGAVideoEntity) {
        sVGAVideoEntity.getClass();
        this.videoItem = sVGAVideoEntity;
        this.scaleEntity = new ScaleEntity();
    }

    public void drawFrame(@NotNull Canvas canvas, int frameIndex, @NotNull ImageView.ScaleType scaleType) {
        canvas.getClass();
        scaleType.getClass();
        performScaleType(canvas, scaleType);
    }

    @NotNull
    public final ScaleEntity getScaleEntity() {
        return this.scaleEntity;
    }

    @NotNull
    public final SVGAVideoEntity getVideoItem() {
        return this.videoItem;
    }

    public void performScaleType(@NotNull Canvas canvas, @NotNull ImageView.ScaleType scaleType) {
        canvas.getClass();
        scaleType.getClass();
        this.scaleEntity.performScaleType(canvas.getWidth(), canvas.getHeight(), (float) this.videoItem.getVideoSize().getWidth(), (float) this.videoItem.getVideoSize().getHeight(), scaleType);
    }

    @NotNull
    public final List<SVGADrawerSprite> requestFrameSprites$svgalibrary_release(int frameIndex) {
        List<SVGAVideoSpriteEntity> sprites = this.videoItem.getSprites();
        ArrayList arrayList = new ArrayList();
        for (SVGAVideoSpriteEntity sVGAVideoSpriteEntity : sprites) {
            SVGADrawerSprite sVGADrawerSprite = null;
            if (frameIndex >= 0 && frameIndex < sVGAVideoSpriteEntity.getFrames().size() && sVGAVideoSpriteEntity.getFrames().get(frameIndex).getAlpha() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                sVGADrawerSprite = new SVGADrawerSprite(this, sVGAVideoSpriteEntity.getImageKey(), sVGAVideoSpriteEntity.getFrames().get(frameIndex));
            }
            if (sVGADrawerSprite != null) {
                arrayList.add(sVGADrawerSprite);
            }
        }
        return arrayList;
    }
}
