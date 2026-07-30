package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.Sticker;
import p149l.q7m;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class StickerSlidingGeomAttrInfo extends StickerItemGeomeAttrInfo implements q7m {
    private final int SLIDING_VERTICAL;
    private boolean animationEnd;
    int curStep;
    float[] durationArray;
    int frameCount;
    float horizoneRatio;
    long lastTimeStampInMs;
    vjw nextImage;
    vjw preImage;
    long slidingByOrder;
    private int slidingMode;
    long slidingTail;
    long slidingUpRandom;
    float[] speedArray;
    float speedOfSlidingPPs;
    int startIndex;
    int[] startIndexArray;
    float[] startPosArray;
    long startTimeStampInMs;
    int startingNumber;
    float tailOffset;
    int[] textures;
    private int totalCnt;
    float verticalRatio;

    public StickerSlidingGeomAttrInfo(Sticker sticker, int i) {
        super(sticker, null);
        this.verticalRatio = 1.0f;
        this.horizoneRatio = 0.0f;
        this.SLIDING_VERTICAL = 0;
        this.slidingMode = 0;
        this.animationEnd = false;
        this.totalCnt = 10;
        this.preImage = new vjw();
        this.nextImage = new vjw();
        this.textures = new int[2];
        this.startTimeStampInMs = -1L;
        this.lastTimeStampInMs = -1L;
        this.slidingTail = 3700L;
        this.slidingUpRandom = 800L;
        this.slidingByOrder = 2200L;
        this.startingNumber = 1;
        this.startIndex = 0;
        this.frameCount = 0;
        this.startIndexArray = new int[3];
        this.startPosArray = new float[3];
        this.speedArray = new float[]{0.5f, 0.125f, -0.01f};
        this.durationArray = new float[]{14.0f, 45.0f, 55.0f};
        this.tailOffset = 0.2f;
        this.curStep = 0;
        vjw mmcvImageByIndex = this.stickerLoader.getMmcvImageByIndex(0);
        this.nextImage = mmcvImageByIndex;
        updateBitmapInfo(mmcvImageByIndex.m198692e(), this.nextImage.m198690c());
        this.startingNumber = i;
        initInternalParameter();
    }

    private void initInternalParameter() {
        float[] fArr = this.speedArray;
        float f = -this.tailOffset;
        float[] fArr2 = this.durationArray;
        fArr[2] = f / (fArr2[2] - fArr2[1]);
        for (int i = 1; i < 3; i++) {
            float f2 = this.speedArray[i];
            float[] fArr3 = this.durationArray;
            double d = f2 * (fArr3[i] - fArr3[i - 1]);
            this.startPosArray[i] = (float) ((Math.ceil(d) + ((double) this.tailOffset)) - d);
            int[] iArr = this.startIndexArray;
            double dCeil = ((double) this.startingNumber) - Math.ceil(d);
            int i2 = this.totalCnt;
            iArr[i] = (int) (((dCeil + ((double) i2)) + 1.0d) % ((double) i2));
        }
    }

    private void updateInfoByframe(int i) {
        if (i == 0) {
            float f = (float) (((double) this.verticalRatio) + 0.5d);
            this.verticalRatio = f;
            if (f >= 1.0f) {
                this.startIndex = (int) ((this.startIndex + f) % this.totalCnt);
                this.needReload = true;
                this.verticalRatio = 0.0f;
                return;
            }
            return;
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            float f2 = this.verticalRatio + this.speedArray[2];
            this.verticalRatio = f2;
            if (f2 >= 1.0f) {
                this.startIndex = (int) ((this.startIndex + f2) % this.totalCnt);
                this.needReload = true;
                this.verticalRatio = -1.0f;
                return;
            } else {
                if (f2 < 0.0f) {
                    this.verticalRatio = 0.0f;
                    return;
                }
                return;
            }
        }
        if (this.curStep != 1) {
            this.curStep = 1;
            this.verticalRatio = this.startPosArray[1];
            this.startIndex = this.startIndexArray[1];
            this.needReload = true;
        }
        float f3 = this.verticalRatio + this.speedArray[1];
        this.verticalRatio = f3;
        if (f3 >= 1.0f) {
            this.startIndex = (int) ((this.startIndex + f3) % this.totalCnt);
            this.needReload = true;
            this.verticalRatio = f3 - 1.0f;
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public int[] getFrameTexture() {
        updateStatusByFrame();
        if (this.needReload) {
            this.needReload = false;
            if (this.nextImage.m198692e() > 0) {
                this.preImage = this.nextImage;
                this.nextImage = this.stickerLoader.getMmcvImageByIndex(this.startIndex);
            } else {
                this.preImage = this.stickerLoader.getMmcvImageByIndex(this.startIndex);
                this.nextImage = this.stickerLoader.getMmcvImageByIndex((this.startIndex + 1) % this.totalCnt);
            }
            int[] iArr = this.textures;
            int i = iArr[0];
            vjw vjwVar = this.preImage;
            if (i == 0) {
                iArr[0] = TextureHelper.bitmapToTexture(vjwVar);
                this.textures[1] = TextureHelper.bitmapToTexture(this.nextImage);
            } else {
                iArr[0] = TextureHelper.loadDataToTexture(i, vjwVar);
                int[] iArr2 = this.textures;
                iArr2[1] = TextureHelper.loadDataToTexture(iArr2[1], this.nextImage);
            }
            if (this.animationEnd) {
                int[] iArr3 = this.textures;
                iArr3[0] = iArr3[1];
            }
        }
        updateBitmapInfo(this.preImage.m198692e(), this.preImage.m198690c());
        return this.textures;
    }

    public float getHorizoneRatio() {
        return this.horizoneRatio;
    }

    public float getVerticalRatio() {
        return this.verticalRatio;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p149l.igm
    public void recycleResourceInGlThread() {
        super.recycleResourceInGlThread();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.StickerItemGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo
    public void resetStatus() {
        super.resetStatus();
        this.animationEnd = false;
        this.frameCount = 0;
        this.needReload = true;
        vjw vjwVar = this.nextImage;
        if (vjwVar != null) {
            vjwVar.m198700m(0);
            this.nextImage.m198697j(0);
        }
        this.startTimeStampInMs = -1L;
        this.lastTimeStampInMs = -1L;
        this.curStep = 0;
        this.verticalRatio = 1.0f;
        this.startIndex = 0;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p149l.q7m
    public void setTimeStamp(long j) {
        if (this.startTimeStampInMs < 0) {
            this.startTimeStampInMs = j;
        }
        this.lastTimeStampInMs = j;
    }

    public void updateAnimationRange(float[] fArr) {
        this.durationArray = fArr;
        initInternalParameter();
    }

    public void updateStatusByFrame() {
        int i = this.frameCount;
        float f = i;
        float[] fArr = this.durationArray;
        float f2 = fArr[0];
        if (f <= f2) {
            updateInfoByframe(0);
        } else if (i > f2 && i <= fArr[1]) {
            updateInfoByframe(1);
        } else if (i > fArr[1] && i <= fArr[2]) {
            updateInfoByframe(2);
        }
        this.frameCount++;
    }
}
