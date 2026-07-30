package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import com.core.glcore.util.ImageUtils;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import java.util.LinkedList;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class StickerBitmapCache {
    private static final int MAX_CACHE = 5;
    private Context context;
    int count;
    private String imagePath;
    ImageDelegateProvider imageProvider;
    private long lastFrameTime;
    private int lastIndex;
    long now;
    long oldnow;
    vjw oneImage;
    private boolean pauseCache;
    private int readIndex;
    Bitmap realBitmap;
    private boolean running;
    private long startTime;
    private Sticker sticker;

    /* JADX INFO: renamed from: t */
    int f14248t;
    public boolean isLoadNew = false;
    protected Object imageQueenLock = new Object();
    private int loopCount = 0;
    private boolean startLoop = false;
    private long renderTime = -1;

    /* JADX INFO: renamed from: i */
    int f14247i = 0;
    int mRenderFRate = 20;
    long mRenderTime = -1;
    private final int STICKER_MMTIME_PER_FRAME = 66;
    private int lastFrameIndex = 0;
    private Object waitSignal = new Object();
    private LinkedList<vjw> linkedBlockingDeque = new LinkedList<>();
    MMCVImageCacheManager cacheManager = new MMCVImageCacheManager();

    public class MMCVImageCacheManager {
        int mmcvImageDataSize = 0;
        int curIndex = 0;
        int totalSize = 5;
        vjw[] cacheArray = new vjw[5];

        public MMCVImageCacheManager() {
            updateImageArray();
        }

        private void updateImageArray() {
            for (int i = 0; i < this.totalSize; i++) {
                this.cacheArray[i] = new vjw();
                vjw vjwVar = this.cacheArray[i];
            }
        }

        public void clear() {
            if (this.cacheArray != null) {
                for (int i = 0; i < this.totalSize; i++) {
                    vjw vjwVar = this.cacheArray[i];
                }
                this.mmcvImageDataSize = 0;
            }
        }

        public vjw getOneImageBuffer() {
            vjw[] vjwVarArr = this.cacheArray;
            int i = this.curIndex;
            vjw vjwVar = vjwVarArr[i];
            this.curIndex = (i + 1) % this.totalSize;
            return vjwVar;
        }

        public void setMmcvImageDataSize(int i) {
            this.mmcvImageDataSize = i;
            updateImageArray();
        }
    }

    public final class ReadBitmapThread extends Thread {
        private boolean reading;

        private ReadBitmapThread() {
            this.reading = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            StickerBitmapCache.this.running = true;
            try {
                try {
                    synchronized (StickerBitmapCache.this.waitSignal) {
                        while (this.reading && StickerBitmapCache.this.running) {
                            try {
                                StickerBitmapCache.this.waitSignal.wait();
                                if (StickerBitmapCache.this.running) {
                                    StickerBitmapCache stickerBitmapCache = StickerBitmapCache.this;
                                    stickerBitmapCache.readNewBitMaps(stickerBitmapCache.context);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    StickerBitmapCache.this.linkedBlockingDeque.clear();
                } catch (Throwable th2) {
                    StickerBitmapCache.this.linkedBlockingDeque.clear();
                    StickerBitmapCache.this.linkedBlockingDeque = null;
                    throw th2;
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.reading = false;
            }
            StickerBitmapCache.this.linkedBlockingDeque.clear();
            StickerBitmapCache.this.linkedBlockingDeque = null;
        }
    }

    public StickerBitmapCache(Sticker sticker, Context context, ImageDelegateProvider imageDelegateProvider) {
        this.running = false;
        this.startTime = -1L;
        this.sticker = sticker;
        this.context = context;
        this.imageProvider = imageDelegateProvider;
        for (int i = 0; i < getMaxIndex(); i++) {
            addNewIndex(context, i);
            this.readIndex = i;
        }
        this.readIndex = 5;
        new ReadBitmapThread().start();
        this.running = true;
        this.startTime = System.currentTimeMillis();
    }

    public void addNewIndex(Context context, int i) {
        if (this.imageProvider != null) {
            return;
        }
        vjw oneImageBuffer = this.cacheManager.getOneImageBuffer();
        if (oneImageBuffer != null) {
            ImageUtils.decodeMMCVImage(oneImageBuffer, this.imagePath);
        } else {
            oneImageBuffer = new vjw();
            oneImageBuffer.m198694g(null);
        }
        this.linkedBlockingDeque.add(oneImageBuffer);
    }

    public void cancel() {
        synchronized (this.waitSignal) {
            this.running = false;
            this.waitSignal.notifyAll();
        }
    }

    public vjw getBitmap() {
        if (this.imageProvider != null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.startTime == -1) {
            this.startTime = jCurrentTimeMillis;
        }
        if (this.pauseCache) {
            return null;
        }
        if (this.oneImage == null) {
            String imagePath = this.sticker.getImagePath(this.context);
            this.imagePath = imagePath;
            ImageUtils.decodeMMCVImage(null, imagePath);
            long j = this.mRenderTime;
            if (j != -1) {
                jCurrentTimeMillis = j;
            }
            this.lastFrameTime = jCurrentTimeMillis;
        } else {
            long j2 = this.mRenderTime;
            long j3 = this.lastFrameTime;
            if ((j2 == -1 ? jCurrentTimeMillis - j3 : j2 - j3) > 66) {
                this.imagePath = this.sticker.getImagePath(this.context);
                long j4 = this.mRenderTime;
                if (j4 != -1) {
                    jCurrentTimeMillis = j4;
                }
                this.lastFrameTime = jCurrentTimeMillis;
            }
            ImageUtils.decodeMMCVImage(null, this.imagePath);
        }
        return this.oneImage;
    }

    public int getMaxIndex() {
        return Math.min(5, this.sticker.getFrameNumber());
    }

    public Bitmap getRealBitmap() {
        ImageDelegateProvider imageDelegateProvider = this.imageProvider;
        if (imageDelegateProvider == null) {
            return null;
        }
        if (this.realBitmap == null) {
            this.realBitmap = imageDelegateProvider.getRealBitmap();
        }
        return this.realBitmap;
    }

    public void pauseCache() {
        if (this.pauseCache) {
            return;
        }
        synchronized (this.imageQueenLock) {
            this.pauseCache = true;
            this.linkedBlockingDeque.clear();
            this.realBitmap = null;
        }
    }

    public void readNewBitMaps(Context context) {
        synchronized (this.imageQueenLock) {
            try {
                this.isLoadNew = true;
                int i = this.readIndex + 2;
                int frameNumber = this.sticker.getFrameNumber() - 1;
                int i2 = this.readIndex;
                if (i < frameNumber) {
                    int i3 = 0;
                    while (i2 <= this.readIndex + (getMaxIndex() / 2)) {
                        addNewIndex(context, i2);
                        int i4 = i2;
                        i2++;
                        i3 = i4;
                    }
                    this.readIndex = i3 + 1;
                } else {
                    while (i2 < this.sticker.getFrameNumber()) {
                        addNewIndex(context, i2);
                        i2++;
                    }
                    int i5 = 0;
                    for (int i6 = 0; i6 < 5; i6++) {
                        addNewIndex(context, i6);
                        i5 = i6;
                    }
                    this.readIndex = i5 + 1;
                }
                this.isLoadNew = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        MMCVImageCacheManager mMCVImageCacheManager = this.cacheManager;
        if (mMCVImageCacheManager != null) {
            mMCVImageCacheManager.clear();
        }
        if (this.oneImage != null) {
            this.oneImage = null;
        }
    }

    public void resetCache() {
        synchronized (this.imageQueenLock) {
            this.startTime = -1L;
            this.startLoop = false;
            this.sticker.curIndex = 0;
            this.linkedBlockingDeque.clear();
            this.realBitmap = null;
        }
    }

    public void resetStickers(Sticker sticker) {
        synchronized (this.imageQueenLock) {
            this.startLoop = false;
            this.startTime = System.currentTimeMillis();
            this.linkedBlockingDeque.clear();
            this.sticker = sticker;
        }
    }

    public void resumeCache() {
        this.pauseCache = false;
    }

    public void setRenderTime(long j) {
        this.mRenderTime = j;
    }
}
