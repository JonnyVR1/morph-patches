package com.momo.mcamera.mask;

import android.content.Context;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.immomo.mmutil.task.C3804c;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class MmcvImageCacheLoader extends MmcvImageLoader {
    private volatile boolean cacheReady;
    private vjw mCacheImage;
    private int mCacheIndex;
    private Object waitSignal;

    public MmcvImageCacheLoader(Sticker sticker, Context context) {
        super(sticker);
        this.cacheReady = false;
        this.mCacheImage = new vjw();
        this.waitSignal = new Object();
        this.lastCurSticker = -1;
        executeStickerCacheThread(sticker, context);
    }

    private void executeStickerCacheThread(final Sticker sticker, final Context context) {
        C3804c.m18444d(2, new Runnable() { // from class: com.momo.mcamera.mask.MmcvImageCacheLoader.1
            @Override // java.lang.Runnable
            public void run() {
                String imagePathByIndex;
                synchronized (MmcvImageCacheLoader.this.waitSignal) {
                    try {
                        if (!MmcvImageCacheLoader.this.cacheReady && (imagePathByIndex = sticker.getImagePathByIndex(context, MmcvImageCacheLoader.this.mCacheIndex)) != null && !TextUtils.isEmpty(imagePathByIndex)) {
                            ImageUtils.decodeMMCVImage(MmcvImageCacheLoader.this.mCacheImage, imagePathByIndex);
                            if (MmcvImageCacheLoader.this.mCacheImage.m198689b() != null) {
                                MmcvImageCacheLoader.this.cacheReady = true;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    @Override // com.momo.mcamera.mask.MmcvImageLoader
    public vjw getMmcvImage(Context context) {
        long jCurrentTimeMillis = this.currentTime;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        try {
            synchronized (this.waitSignal) {
                try {
                    if (this.mMMCVImage == null) {
                        this.mMMCVImage = new vjw();
                    }
                    long j = this.mRenderTime;
                    if ((j == -1 ? jCurrentTimeMillis - this.lastFrameTime : j - this.lastFrameTime) > this.STICKER_MMTIME_PER_FRAME || this.lastCurSticker != this.sticker.curIndex) {
                        String imagePath = this.sticker.getImagePath(context);
                        this.imagePath = imagePath;
                        if (imagePath == null) {
                            return null;
                        }
                        int imageIndexByPath = getImageIndexByPath(imagePath);
                        if (imageIndexByPath == this.mCacheIndex && this.cacheReady) {
                            vjw vjwVar = this.mMMCVImage;
                            this.mMMCVImage = this.mCacheImage;
                            this.mCacheImage = vjwVar;
                        } else {
                            ImageUtils.decodeMMCVImage(this.mMMCVImage, this.imagePath);
                        }
                        this.mCacheIndex = this.sticker.curIndex;
                        this.cacheReady = false;
                        this.mCurrentIndex = imageIndexByPath;
                        this.lastCurSticker = this.sticker.curIndex;
                        long j2 = this.mRenderTime;
                        if (j2 != -1) {
                            jCurrentTimeMillis = j2;
                        }
                        this.lastFrameTime = jCurrentTimeMillis;
                    }
                    executeStickerCacheThread(this.sticker, context);
                    return this.mMMCVImage;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
