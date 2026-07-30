package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

/* JADX INFO: loaded from: classes6.dex */
public class TextureLottieGeomeAttrInfo extends LottieMMFrameGeomeAttrInfo {
    int[] inputTextures;

    public TextureLottieGeomeAttrInfo() {
        super(null);
        this.inputTextures = new int[1];
        this.alphaValue = 0.0f;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public int[] getFrameTexture() {
        int[] frameTexture = super.getFrameTexture();
        int[] iArr = this.inputTextures;
        if (frameTexture == null && iArr == null) {
            return null;
        }
        return iArr;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p149l.igm
    public void recycleResourceInGlThread() {
        super.recycleResourceInGlThread();
        this.inputTextures = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo
    public void resetStatus() {
        super.resetStatus();
        this.alphaValue = 0.0f;
    }

    public void updateInputeTexture(int[] iArr) {
        this.inputTextures = iArr;
    }
}
