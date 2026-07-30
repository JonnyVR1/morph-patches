package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.feed.data.Frame;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchSticker implements Serializable {

    @SerializedName("filename")
    private String filename;

    @SerializedName(Frame.TYPE)
    private BatchFrame frame;

    @SerializedName("pivot")
    private FramePivot pivot;

    @SerializedName("rotated")
    private Boolean rotated;

    @SerializedName("sourceSize")
    private SourceSize sourceSize;

    @SerializedName("spriteSourceSize")
    private SpriteSourceSize spriteSourceSize;

    @SerializedName("trimmed")
    private Boolean trimmed;

    public String getFilename() {
        return this.filename;
    }

    public BatchFrame getFrame() {
        return this.frame;
    }

    public FramePivot getPivot() {
        return this.pivot;
    }

    public Boolean getRotated() {
        return this.rotated;
    }

    public SourceSize getSourceSize() {
        return this.sourceSize;
    }

    public SpriteSourceSize getSpriteSourceSize() {
        return this.spriteSourceSize;
    }

    public Boolean getTrimmed() {
        return this.trimmed;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setFrame(BatchFrame batchFrame) {
        this.frame = batchFrame;
    }

    public void setPivot(FramePivot framePivot) {
        this.pivot = framePivot;
    }

    public void setRotated(Boolean bool) {
        this.rotated = bool;
    }

    public void setSourceSize(SourceSize sourceSize) {
        this.sourceSize = sourceSize;
    }

    public void setSpriteSourceSize(SpriteSourceSize spriteSourceSize) {
        this.spriteSourceSize = spriteSourceSize;
    }

    public void setTrimmed(Boolean bool) {
        this.trimmed = bool;
    }
}
