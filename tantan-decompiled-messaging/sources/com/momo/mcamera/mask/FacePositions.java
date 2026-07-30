package com.momo.mcamera.mask;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FacePositions {

    @SerializedName("stickerFacePosition")
    List<StickerFacePosition> stickerFacePositions;

    public List<StickerFacePosition> getStickerFacePositions() {
        return this.stickerFacePositions;
    }

    public void setStickerFacePositions(List<StickerFacePosition> list) {
        this.stickerFacePositions = list;
    }
}
