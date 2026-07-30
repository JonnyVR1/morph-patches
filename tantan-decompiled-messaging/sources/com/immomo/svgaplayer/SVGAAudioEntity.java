package com.immomo.svgaplayer;

import com.immomo.svgaplayer.proto.AudioEntity;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, m87232d2 = {"Lcom/immomo/svgaplayer/SVGAAudioEntity;", "", "audioItem", "Lcom/immomo/svgaplayer/proto/AudioEntity;", "(Lcom/immomo/svgaplayer/proto/AudioEntity;)V", "audioKey", "", "getAudioKey", "()Ljava/lang/String;", "endFrame", "", "getEndFrame", "()I", "playID", "getPlayID", "()Ljava/lang/Integer;", "setPlayID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "soundID", "getSoundID", "setSoundID", "startFrame", "getStartFrame", StudentVerRejectedReason.startTime, "getStartTime", "totalTime", "getTotalTime", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class SVGAAudioEntity {

    @Nullable
    private final String audioKey;
    private final int endFrame;

    @Nullable
    private Integer playID;

    @Nullable
    private Integer soundID;
    private final int startFrame;
    private final int startTime;
    private final int totalTime;

    public SVGAAudioEntity(@NotNull AudioEntity audioEntity) {
        audioEntity.getClass();
        this.audioKey = audioEntity.audioKey;
        Integer num = audioEntity.startFrame;
        this.startFrame = num != null ? num.intValue() : 0;
        Integer num2 = audioEntity.endFrame;
        this.endFrame = num2 != null ? num2.intValue() : 0;
        Integer num3 = audioEntity.startTime;
        this.startTime = num3 != null ? num3.intValue() : 0;
        Integer num4 = audioEntity.totalTime;
        this.totalTime = num4 != null ? num4.intValue() : 0;
    }

    @Nullable
    public final String getAudioKey() {
        return this.audioKey;
    }

    public final int getEndFrame() {
        return this.endFrame;
    }

    @Nullable
    public final Integer getPlayID() {
        return this.playID;
    }

    @Nullable
    public final Integer getSoundID() {
        return this.soundID;
    }

    public final int getStartFrame() {
        return this.startFrame;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public final void setPlayID(@Nullable Integer num) {
        this.playID = num;
    }

    public final void setSoundID(@Nullable Integer num) {
        this.soundID = num;
    }
}
