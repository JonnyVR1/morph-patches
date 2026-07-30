package com.effectsar.labcv.effectsdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class BefPetFaceInfo extends BefFaceInfo {
    private int faceCount = 0;

    public static class PetFace extends BefFaceInfo.Face106 {
        int type;

        public int getType() {
            return this.type;
        }

        @Override // com.effectsar.labcv.effectsdk.BefFaceInfo.Face106
        public String toString() {
            return "PetFace{rect=" + this.rect + ", score=" + this.score + ", points_array=" + Arrays.toString(this.points_array) + ", visibility_array=" + Arrays.toString(this.visibility_array) + ", yaw=" + this.yaw + ", pitch=" + this.pitch + ", roll=" + this.roll + ", eye_dist=" + this.eye_dist + ", action=" + this.action + ", type=" + this.type + ", ID=" + this.f5858ID + '}';
        }
    }

    public PetFace[] getFace90() {
        return (PetFace[]) getFace106s();
    }

    public int getFaceCount() {
        return this.faceCount;
    }

    @Override // com.effectsar.labcv.effectsdk.BefFaceInfo
    public String toString() {
        return "BefPetFaceInfo{faces=" + Arrays.toString(getFace106s()) + '}';
    }
}
