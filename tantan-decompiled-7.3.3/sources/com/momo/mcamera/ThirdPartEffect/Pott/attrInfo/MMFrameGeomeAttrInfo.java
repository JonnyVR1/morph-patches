package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import p153l.gam;
import p153l.lim;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class MMFrameGeomeAttrInfo extends lim implements ImageDelegate, gam {
    umw frameInfo;
    String framePath;
    int frameTexture;
    protected boolean needReload;
    int targetHeight;
    int targetWidth;

    public MMFrameGeomeAttrInfo(String str) {
        umw umwVar = new umw();
        this.frameInfo = umwVar;
        this.frameTexture = 0;
        this.needReload = false;
        this.targetWidth = 0;
        this.targetHeight = 0;
        this.framePath = str;
        if (str != null) {
            ImageUtils.decodeMMCVImage(umwVar, str);
            updateBitmapInfo(this.frameInfo.m196799e(), this.frameInfo.m196797c());
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public umw getFrame() {
        if (this.frameInfo.m196799e() <= 0 && this.framePath != null) {
            umw umwVar = new umw();
            this.frameInfo = umwVar;
            ImageUtils.decodeMMCVImage(umwVar, this.framePath);
        }
        return this.frameInfo;
    }

    public int getFrameHeight() {
        return this.bitmapHeight;
    }

    public int[] getFrameTexture() {
        if (this.frameInfo.m196799e() > 0) {
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

    @Override // p153l.lim
    public void recycleResourceInGlThread() {
        this.framePath = null;
        umw umwVar = this.frameInfo;
        if (umwVar != null) {
            umwVar.m196801g(null);
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
