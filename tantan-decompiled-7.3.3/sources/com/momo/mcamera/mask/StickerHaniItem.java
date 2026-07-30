package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.core.glcore.util.ImageUtils;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class StickerHaniItem extends StickerItem {
    private int frameRate;
    private long haniStartTime;
    public FaceDetectFilter.FaceDetectParam mFaceParam;
    private int stickerCount;
    private int stickerIndex;

    public StickerHaniItem(Sticker sticker, Context context) {
        super(sticker, context);
        this.stickerIndex = 0;
        this.haniStartTime = 0L;
        this.stickerCount = this.sticker.getFrameNumber();
        this.frameRate = this.sticker.getFrameRate();
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public umw getMmcvImage(Context context) {
        String imagePathByIndex = this.sticker.getImagePathByIndex(context, this.stickerIndex);
        if (this.mmcvImage == null) {
            this.mmcvImage = new umw();
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(imagePathByIndex);
            if (this.mmcvImage.m196795a() == null) {
                this.mmcvImage.m196801g(new byte[bitmapDecodeFile.getHeight() * bitmapDecodeFile.getHeight() * 4]);
            }
            bitmapDecodeFile.recycle();
        }
        ImageUtils.decodeMMCVImage(this.mmcvImage, imagePathByIndex);
        return this.mmcvImage;
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        synchronized (this.maskLock) {
            try {
                setParamForMatrix(faceDetectParam.scaleW, faceDetectParam.scaleH, faceDetectParam.centerPoint, faceDetectParam.angle);
                this.isDraw = true;
                if (this.mFaceParam == null) {
                    this.mFaceParam = new FaceDetectFilter.FaceDetectParam();
                }
                this.mFaceParam = faceDetectParam;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.StickerItem
    public void setRenderTime(long j) {
        if (j < this.haniStartTime) {
            this.haniStartTime = j;
        }
        if (this.haniStartTime == 0) {
            this.haniStartTime = j;
        }
        this.stickerIndex = ((int) ((j - this.haniStartTime) / ((long) (1000 / this.frameRate)))) % this.stickerCount;
        clearPoints();
        setDetectParam(this.mFaceParam);
    }
}
