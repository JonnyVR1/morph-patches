package com.momo.mcamera.mask.bean;

import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.FacePositions;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class StickerAdditionalInfo {

    @SerializedName("face3DGame")
    private boolean face3DGame;

    @SerializedName("facePosition")
    List<FacePositions> facePositions;

    @SerializedName("gameScore")
    private int gameScore;

    @SerializedName("soundPitchShift")
    private int soundPitchShift;

    @SerializedName("triggerPlayStatus")
    private int triggerPlayStatus = -1;

    public List<FacePositions> getFacePositions() {
        return this.facePositions;
    }

    public int getGameScore() {
        return this.gameScore;
    }

    public int getSoundPitchShift() {
        return this.soundPitchShift;
    }

    public int getTriggerPlayStatus() {
        return this.triggerPlayStatus;
    }

    public boolean isFace3DGame() {
        return this.face3DGame;
    }

    public void setFace3DGame(boolean z) {
        this.face3DGame = z;
    }

    public void setFacePositions(List<FacePositions> list) {
        this.facePositions = list;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setSoundPitchShift(int i) {
        this.soundPitchShift = i;
    }

    public void setTriggerPlayStatus(int i) {
        this.triggerPlayStatus = i;
    }
}
