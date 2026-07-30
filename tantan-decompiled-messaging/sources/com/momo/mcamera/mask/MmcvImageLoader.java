package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class MmcvImageLoader {
    protected long currentTime;
    public String imagePath;
    protected int lastCurSticker;
    protected long lastFrameTime;
    protected int mCurrentIndex;
    private ImageDelegateProvider mImageDelegateProvider;
    protected vjw mMMCVImage;
    protected Sticker sticker;
    protected int STICKER_MMTIME_PER_FRAME = 50;
    long mRenderTime = -1;

    public MmcvImageLoader(Sticker sticker) {
        this.sticker = sticker;
        if (sticker != null) {
            this.mImageDelegateProvider = sticker.getImageProvider();
        }
    }

    public void cancel() {
        this.sticker.curIndex = 0;
        if (this.mMMCVImage != null) {
            this.mMMCVImage = null;
        }
    }

    public int getCurrentStickerImageIndex() {
        return this.mCurrentIndex;
    }

    public Bitmap getDelegateBitmap() {
        ImageDelegateProvider imageDelegateProvider = this.mImageDelegateProvider;
        if (imageDelegateProvider != null) {
            return imageDelegateProvider.getRealBitmap();
        }
        return null;
    }

    public int getImageIndexByPath(String str) {
        String[] strArrSplit = str.split("_");
        return Integer.parseInt(strArrSplit[strArrSplit.length - 1].replace(".png", ""));
    }

    public vjw getMmcvImage(Context context) {
        long jCurrentTimeMillis = this.currentTime;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (this.mMMCVImage == null) {
            String imagePath = this.sticker.getImagePath(context);
            this.imagePath = imagePath;
            if (imagePath == null) {
                return null;
            }
            vjw vjwVar = new vjw();
            this.mMMCVImage = vjwVar;
            ImageUtils.decodeMMCVImage(vjwVar, this.imagePath);
            long j = this.mRenderTime;
            if (j != -1) {
                jCurrentTimeMillis = j;
            }
            this.lastFrameTime = jCurrentTimeMillis;
        } else {
            long j2 = this.mRenderTime;
            long j3 = this.lastFrameTime;
            if ((j2 == -1 ? jCurrentTimeMillis - j3 : j2 - j3) > this.STICKER_MMTIME_PER_FRAME) {
                String imagePath2 = this.sticker.getImagePath(context);
                this.imagePath = imagePath2;
                if (imagePath2 == null) {
                    return null;
                }
                long j4 = this.mRenderTime;
                if (j4 != -1) {
                    jCurrentTimeMillis = j4;
                }
                this.lastFrameTime = jCurrentTimeMillis;
            }
            ImageUtils.decodeMMCVImage(this.mMMCVImage, this.imagePath);
        }
        return this.mMMCVImage;
    }

    public vjw getMmcvImageByIndex(int i) {
        String imagePathByIndex = this.sticker.getImagePathByIndex(null, i);
        if (imagePathByIndex == null) {
            return null;
        }
        vjw vjwVar = new vjw();
        ImageUtils.decodeMMCVImage(vjwVar, imagePathByIndex);
        return vjwVar;
    }

    public int getMmcvTexture(Context context, int i) {
        vjw mmcvImage = getMmcvImage(context);
        if (mmcvImage != null && mmcvImage.m198689b() != null) {
            return i == 0 ? TextureHelper.bitmapToTexture(mmcvImage) : TextureHelper.loadDataToTexture(i, mmcvImage);
        }
        Bitmap delegateBitmap = getDelegateBitmap();
        if (delegateBitmap != null) {
            return TextureHelper.bitmapToTexture(delegateBitmap);
        }
        return 0;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public void setFrameDuration(long j) {
        if (j > 0) {
            this.STICKER_MMTIME_PER_FRAME = (int) j;
        }
    }

    public void setRenderTime(long j) {
        this.mRenderTime = j;
    }
}
