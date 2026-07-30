package com.momo.xeengine.svgaplayer;

import com.momo.xeengine.svgaplayer.proto.FrameEntity;
import com.momo.xeengine.svgaplayer.proto.SpriteEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAVideoSpriteEntity;", "", "obj", "Lcom/momo/xeengine/svgaplayer/proto/SpriteEntity;", "(Lcom/momo/xeengine/svgaplayer/proto/SpriteEntity;)V", "frames", "", "Lcom/momo/xeengine/svgaplayer/SVGAVideoSpriteFrameEntity;", "getFrames", "()Ljava/util/List;", "imageKey", "", "getImageKey", "()Ljava/lang/String;", "gift_player_release"}, m87233k = 1, m87234mv = {1, 1, 15})
public final class SVGAVideoSpriteEntity {

    @NotNull
    private final List<SVGAVideoSpriteFrameEntity> frames;

    @Nullable
    private final String imageKey;

    public SVGAVideoSpriteEntity(@NotNull SpriteEntity spriteEntity) {
        spriteEntity.getClass();
        this.frames = new ArrayList();
        this.imageKey = spriteEntity.imageKey;
        SVGAVideoSpriteFrameEntity sVGAVideoSpriteFrameEntity = null;
        for (FrameEntity frameEntity : spriteEntity.frames) {
            frameEntity.getClass();
            SVGAVideoSpriteFrameEntity sVGAVideoSpriteFrameEntity2 = new SVGAVideoSpriteFrameEntity(frameEntity);
            if (!sVGAVideoSpriteFrameEntity2.getShapes().isEmpty() && ((SVGAVideoShapeEntity) CollectionsKt.first((List) sVGAVideoSpriteFrameEntity2.getShapes())).isKeep() && sVGAVideoSpriteFrameEntity != null) {
                sVGAVideoSpriteFrameEntity2.setShapes(sVGAVideoSpriteFrameEntity.getShapes());
            }
            this.frames.add(sVGAVideoSpriteFrameEntity2);
            sVGAVideoSpriteFrameEntity = sVGAVideoSpriteFrameEntity2;
        }
    }

    @NotNull
    public final List<SVGAVideoSpriteFrameEntity> getFrames() {
        return this.frames;
    }

    @Nullable
    public final String getImageKey() {
        return this.imageKey;
    }
}
