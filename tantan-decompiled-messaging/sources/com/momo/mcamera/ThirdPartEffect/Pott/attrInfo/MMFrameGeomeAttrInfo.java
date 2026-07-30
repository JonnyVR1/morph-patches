package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import p149l.igm;
import p149l.q7m;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class MMFrameGeomeAttrInfo extends igm implements ImageDelegate, q7m {
    vjw frameInfo;
    String framePath;
    int frameTexture;
    protected boolean needReload;
    int targetHeight;
    int targetWidth;

    public MMFrameGeomeAttrInfo(String str) {
        vjw vjwVar = new vjw();
        this.frameInfo = vjwVar;
        this.frameTexture = 0;
        this.needReload = false;
        this.targetWidth = 0;
        this.targetHeight = 0;
        this.framePath = str;
        if (str != null) {
            ImageUtils.decodeMMCVImage(vjwVar, str);
            updateBitmapInfo(this.frameInfo.m198692e(), this.frameInfo.m198690c());
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public vjw getFrame() {
        if (this.frameInfo.m198692e() <= 0 && this.framePath != null) {
            vjw vjwVar = new vjw();
            this.frameInfo = vjwVar;
            ImageUtils.decodeMMCVImage(vjwVar, this.framePath);
        }
        return this.frameInfo;
    }

    public int getFrameHeight() {
        return this.bitmapHeight;
    }

    public int[] getFrameTexture() {
        if (this.frameInfo.m198692e() > 0) {
            int i = this.frameTexture;
            if (i == 0) {
                this.frameTexture = TextureHelper.bitmapToTexture(this.frameInfo);
            } else if (this.needReload) {
                this.frameTexture = TextureHelper.loadDataToTexture(i, this.frameInfo);
                this.needReload = false;
            }
        }
        int i2 = this.frameTexture;
        if (i2 != 0) {
            return new int[]{i2};
        }
        return null;
    }

    public int getFrameWidth() {
        return this.bitmapWidth;
    }

    public void recycleImageBuffers() {
    }

    @Override // p149l.igm
    public void recycleResourceInGlThread() {
        this.framePath = null;
        vjw vjwVar = this.frameInfo;
        if (vjwVar != null) {
            vjwVar.m198694g(null);
        }
        this.frameInfo = null;
        int i = this.frameTexture;
        if (i != 0) {
            TextureHelper.destroyTexture(new int[]{i});
        }
        this.frameTexture = 0;
    }

    public void resetStatus() {
    }

    public void setTargetWidthAndHeight(int i, int i2) {
        this.targetHeight = i2;
        this.targetWidth = i;
    }

    public void setTimeStamp(long j) {
    }
}
