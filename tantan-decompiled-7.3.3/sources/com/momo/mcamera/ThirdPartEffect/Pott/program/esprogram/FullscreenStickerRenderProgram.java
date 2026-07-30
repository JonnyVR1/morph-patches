package com.momo.mcamera.ThirdPartEffect.Pott.program.esprogram;

import android.content.Context;
import android.opengl.GLES20;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.Sticker;
import com.momo.mcamera.mask.StickerItem;
import p153l.d33;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class FullscreenStickerRenderProgram extends d33 {
    Context context;
    int inputexture = 0;
    StickerItem stickerItem;

    public FullscreenStickerRenderProgram(Sticker sticker, Context context) {
        this.stickerItem = new StickerItem(sticker, context);
        this.context = context;
    }

    @Override // p153l.d33, p153l.pt2
    public String getSubFrameShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    @Override // p153l.d33, p153l.pt2
    public void initShaderHandles() {
        super.initShaderHandles();
        this.geometryAttrInfo.updateBitmapAspectRatio(this.stickerItem.getStickerAspectRatio());
    }

    @Override // p153l.d33, p153l.pt2
    public void passShaderValues(int[] iArr) {
        umw mmcvImage = this.stickerItem.getMmcvImage(this.context);
        this.geometryAttrInfo.updateBitmapInfo(mmcvImage.m196799e(), mmcvImage.m196797c());
        super.passShaderValues(iArr);
        int i = this.inputexture;
        if (i == 0) {
            this.inputexture = TextureHelper.bitmapToTexture(mmcvImage);
        } else {
            this.inputexture = TextureHelper.loadDataToTexture(i, mmcvImage);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.inputexture);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // p153l.d33, p153l.pt2
    public void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
        this.geometryAttrInfo.setBaseRenderSize(i, i2);
    }
}
