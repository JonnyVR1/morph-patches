package com.momo.mcamera.ThirdPartEffect.Pott.attrInfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.config.lottecfg.Layers;
import com.momo.mcamera.util.MDLogTag;
import com.sina.weibo.sdk.constant.WBConstants;

/* JADX INFO: loaded from: classes6.dex */
public class LottieBitmapGeomeAttrInfo extends LottieMMFrameGeomeAttrInfo {
    Bitmap bitmap;
    boolean bitmapFromeOutter;
    String bitmapPath;
    int maxHeight;
    int maxWidth;

    public LottieBitmapGeomeAttrInfo(String str) {
        super(null);
        this.bitmapFromeOutter = false;
        this.maxWidth = 1080;
        this.maxHeight = WBConstants.SDK_NEW_PAY_VERSION;
        this.bitmapPath = str;
    }

    private void decodeOneImage() {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int iRound = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.bitmapPath, options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        this.bitmap = BitmapFactory.decodeFile(this.bitmapPath);
        int i4 = this.maxWidth;
        int i5 = this.maxHeight;
        int i6 = this.targetWidth;
        if (i6 != 0 && (i = this.targetHeight) != 0) {
            i4 = i6;
            i5 = i;
        }
        if (i3 > i4 || i3 > i5) {
            iRound = i2 > i4 ? Math.round(i2 / i4) : Math.round(i3 / i5);
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = iRound;
        int bitmapDegree = ImageUtils.getBitmapDegree(this.bitmapPath);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.bitmapPath, options);
        this.bitmap = bitmapDecodeFile;
        if (bitmapDecodeFile == null || bitmapDegree == 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(bitmapDegree);
        Bitmap bitmap = this.bitmap;
        this.bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), this.bitmap.getHeight(), matrix, true);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.ImageDelegate
    public int[] getFrameTexture() {
        int i;
        if (this.bitmap == null && !this.bitmapFromeOutter) {
            decodeOneImage();
        }
        updateBitmapInfo(this.bitmap.getWidth(), this.bitmap.getHeight());
        if (this.frameTexture == 0) {
            this.frameTexture = TextureHelper.bitmapToTexture(this.bitmap);
        }
        super.getFrameTexture();
        if (getAlphaValue() < 0.0f || (i = this.frameTexture) == 0) {
            return null;
        }
        return new int[]{i};
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo
    public void recycleImageBuffers() {
        Bitmap bitmap;
        super.recycleImageBuffers();
        if (this.bitmapFromeOutter || (bitmap = this.bitmap) == null) {
            return;
        }
        bitmap.recycle();
        this.bitmap = null;
        MDLog.m7391e(MDLogTag.FILTER_TAG, "Recycle bitmap lottie info !");
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo, com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo, p149l.igm
    public void recycleResourceInGlThread() {
        super.recycleResourceInGlThread();
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
        this.bitmapPath = null;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmapFromeOutter = true;
        this.bitmap = bitmap;
    }

    public void setBitmapWithTarget(Bitmap bitmap, int i, int i2) {
        this.bitmap = bitmap;
        this.targetWidth = i;
        this.targetHeight = i2;
        this.bitmapFromeOutter = true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.LottieMMFrameGeomeAttrInfo
    public void setLottieConfig(Layers layers) {
        super.setLottieConfig(layers);
        if (this.bitmapPath != null) {
            decodeOneImage();
        }
    }

    @Override // p149l.igm
    public void updateBitmapInfo(int i, int i2) {
        int i3;
        float f;
        int i4 = this.targetWidth;
        if (i4 == 0 || (i3 = this.targetHeight) == 0) {
            int i5 = this.baseRenderWidth;
            int i6 = this.baseRenderHeight;
            float f2 = (i * 1.0f) / i2;
            if ((i5 * 1.0f) / i6 > f2) {
                this.bitmapWidth = (int) (i6 * f2);
                this.bitmapHeight = i6;
            } else {
                this.bitmapWidth = i5;
                this.bitmapHeight = (int) (i6 / f2);
            }
            super.updateBitmapInfo(this.bitmapWidth, this.bitmapHeight);
            return;
        }
        float f3 = (i4 * 1.0f) / i3;
        float f4 = i;
        float f5 = i2;
        float f6 = 0.0f;
        if (f3 > (f4 * 1.0f) / f5) {
            f = ((f5 - (f4 / f3)) / f5) / 2.0f;
        } else {
            float f7 = ((f4 - (f5 * f3)) / f4) / 2.0f;
            f = 0.0f;
            f6 = f7;
        }
        if (f6 != 1.0f && f != 1.0f) {
            cropWidthAndHeightInNormalTextureCoord(f6, f);
        }
        super.updateBitmapInfo(this.targetWidth, this.targetHeight);
    }
}
