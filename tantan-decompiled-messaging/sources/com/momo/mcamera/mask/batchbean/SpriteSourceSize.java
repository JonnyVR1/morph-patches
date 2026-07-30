package com.momo.mcamera.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class SpriteSourceSize implements Serializable {

    @SerializedName("h")
    private int spriteSourceSizeHight;

    @SerializedName("w")
    private int spriteSourceSizeWidth;

    @SerializedName(BaseSei.f13930X)
    private int spriteSourceSizeX;

    @SerializedName(BaseSei.f13931Y)
    private int spriteSourceSizeY;

    public int getSpriteSourceSizeHight() {
        return this.spriteSourceSizeHight;
    }

    public int getSpriteSourceSizeWidth() {
        return this.spriteSourceSizeWidth;
    }

    public int getSpriteSourceSizeX() {
        return this.spriteSourceSizeX;
    }

    public int getSpriteSourceSizeY() {
        return this.spriteSourceSizeY;
    }

    public void setSpriteSourceSizeHight(int i) {
        this.spriteSourceSizeHight = i;
    }

    public void setSpriteSourceSizeWidth(int i) {
        this.spriteSourceSizeWidth = i;
    }

    public void setSpriteSourceSizeX(int i) {
        this.spriteSourceSizeX = i;
    }

    public void setSpriteSourceSizeY(int i) {
        this.spriteSourceSizeY = i;
    }
}
