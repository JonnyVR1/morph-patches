package com.immomo.moment.mediautils;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Set;
import p149l.epx;
import p149l.kwv;
import p149l.lq2;
import p149l.mow;
import p149l.qyx;
import p149l.u0m;
import p149l.zzf0;

/* JADX INFO: loaded from: classes7.dex */
public class VideoDataRetrieverBySoft extends qyx {
    public static final int AV_PIX_FMT_BGRA = 30;
    public static final int AV_PIX_FMT_NV12 = 25;
    public static final int AV_PIX_FMT_RGBA = 28;
    public static final int AV_PIX_FMT_YUV420P = 0;
    public static final int BITMAP_IMAGE = 1;
    public static final int BYTERAW_DATA = 4;
    public static final int BYTERAW_IMAGE = 3;
    public static final int GET_FRAME_TYPE_BY_BEST = 1;
    public static final int INTRAW_DATA = 5;
    public static final int INTRAW_IMAGE = 2;
    private OnThumbnailListComplete mCompleteListener;
    private long mDuration;
    private BestFrameFilter mFrameFilter;
    private long mHandler;
    private int mHeight;
    private ImageFrameFilterListener mImageFrameFilterListener;
    private u0m mProcessHelper;
    List<Node> mThumbnailList;
    private int mType;
    private int mWidth;
    private Set<String> tasks;
    private String TAG = "VideoDataRetriever";
    private Object mSync = new Object();
    private int[] mARGBData = null;
    private int[] mDstIntData = null;
    private byte[] mDstByteData = null;
    Bitmap mCurBmp = null;
    private int mIndex = 0;
    private final int ONE_MINIS_DURATION = 60000000;
    private final int THREE_MINIS_DURATION = 180000000;
    private final int GET_FRAME_TYPE_NORMAL = 0;
    private final int BEST_FRAME_NEED_CNT_FOR_ONE_MINS = 10;
    private final int BEST_FRAME_NEED_CNT_FOR_THREE_MINS = 20;
    private final int BEST_FRAME_NEED_CNT_FOR_FIVE_MINS = 30;
    private boolean mExit = false;
    private List<String> mFaceModeList = null;
    private long WAIT_TIME_US = 10000;

    public class BestFrameFilter {
        private int mInterval;
        private int mNeedFrameCnt;
        lq2 processInput;
        private byte[] yuv;
        private int mMaxCnt = 0;
        private long mPtsStep = 0;

        public BestFrameFilter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrameCnt(int i, int i2) {
            this.mNeedFrameCnt = i;
            if (i2 == 0) {
                if (i <= 10) {
                    this.mInterval = 3;
                } else if (i > 20 && i > 30) {
                    this.mInterval = 1;
                } else {
                    this.mInterval = 2;
                }
            } else if (this.mInterval > 0) {
                this.mInterval = i2;
            } else {
                this.mInterval = 1;
            }
            int i3 = this.mInterval;
            if (i3 == 1) {
                this.mPtsStep = 40000L;
                return;
            }
            this.mMaxCnt = i * i3;
            this.mPtsStep = VideoDataRetrieverBySoft.this.mDuration / ((long) this.mMaxCnt);
            kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "  setFrameCnt method,  mNeedFrameCnt:" + this.mNeedFrameCnt + ", mInterval:" + this.mInterval + ", mMaxCnt:" + this.mMaxCnt + ", mDuration:" + VideoDataRetrieverBySoft.this.mDuration + ",mPtsStep:" + this.mPtsStep);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setYuv(byte[] bArr) {
            this.yuv = bArr;
        }

        public void doFrameFilter() throws Exception {
            kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "doFrameFilter is called");
            VideoDataRetrieverBySoft.this.nativeSetYuvAndRgbOutFlag(true);
            int i = this.mInterval;
            VideoDataRetrieverBySoft videoDataRetrieverBySoft = VideoDataRetrieverBySoft.this;
            float f = -1.0f;
            if (i != 1) {
                kwv.m147653c(videoDataRetrieverBySoft.TAG, "doFrameFilter:mInterval != 1");
                int i2 = 0;
                long j = 0;
                float f2 = -1.0f;
                for (int i3 = 0; i3 < this.mMaxCnt; i3++) {
                    kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "  doFrameFilter:needPts " + j);
                    if (VideoDataRetrieverBySoft.this.mExit) {
                        break;
                    }
                    int iNativeDecodeOneFrame = VideoDataRetrieverBySoft.this.nativeDecodeOneFrame(j);
                    if (iNativeDecodeOneFrame < 0 || VideoDataRetrieverBySoft.this.mHandler == 0) {
                        kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "doFrameFilter nativeDecodeOneFrame or mHandler is error!");
                        kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "            mHandler:" + VideoDataRetrieverBySoft.this.mHandler);
                    } else {
                        VideoDataRetrieverBySoft.this.nativeGetYuvImage(this.yuv);
                        if (iNativeDecodeOneFrame >= 0) {
                            if (epx.m117686a()) {
                                float fDoMMCVFilter = doMMCVFilter(this.yuv);
                                if (fDoMMCVFilter > f2) {
                                    VideoDataRetrieverBySoft videoDataRetrieverBySoft2 = VideoDataRetrieverBySoft.this;
                                    videoDataRetrieverBySoft2.nativeGetRGBImage(videoDataRetrieverBySoft2.mARGBData);
                                    f2 = fDoMMCVFilter;
                                }
                            } else {
                                VideoDataRetrieverBySoft videoDataRetrieverBySoft3 = VideoDataRetrieverBySoft.this;
                                videoDataRetrieverBySoft3.nativeGetRGBImage(videoDataRetrieverBySoft3.mARGBData);
                            }
                            i2 = (i2 + 1) % this.mInterval;
                            if (i2 == 0) {
                                VideoDataRetrieverBySoft videoDataRetrieverBySoft4 = VideoDataRetrieverBySoft.this;
                                videoDataRetrieverBySoft4.mCurBmp = Bitmap.createBitmap(videoDataRetrieverBySoft4.mARGBData, 0, VideoDataRetrieverBySoft.this.mWidth, VideoDataRetrieverBySoft.this.mWidth, VideoDataRetrieverBySoft.this.mHeight, Bitmap.Config.ARGB_8888);
                                if (VideoDataRetrieverBySoft.this.mImageFrameFilterListener != null) {
                                    VideoDataRetrieverBySoft.this.mImageFrameFilterListener.doFilterFrame(VideoDataRetrieverBySoft.this.mCurBmp);
                                }
                                f2 = -1.0f;
                            }
                        }
                    }
                    j += this.mPtsStep;
                }
            } else {
                kwv.m147653c(videoDataRetrieverBySoft.TAG, "doFrameFilter:mInterval == 1");
                long autoStep = VideoDataRetrieverBySoft.this.getAutoStep();
                this.mPtsStep = autoStep;
                long autoMaxLength = VideoDataRetrieverBySoft.this.getAutoMaxLength(autoStep);
                long j2 = 0;
                while (j2 <= autoMaxLength && !VideoDataRetrieverBySoft.this.mExit) {
                    kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "  doFrameFilter:needPts " + j2);
                    int iNativeDecodeOneFrame2 = VideoDataRetrieverBySoft.this.nativeDecodeOneFrame(j2);
                    if (iNativeDecodeOneFrame2 > 0 && VideoDataRetrieverBySoft.this.mHandler != 0) {
                        VideoDataRetrieverBySoft.this.nativeGetYuvImage(this.yuv);
                        if (iNativeDecodeOneFrame2 < 0) {
                            kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "doFrameFilter nativeDecodeOneFrame or mHandler is error!");
                            kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "            mHandler:" + VideoDataRetrieverBySoft.this.mHandler);
                        } else if (epx.m117686a()) {
                            float fDoMMCVFilter2 = doMMCVFilter(this.yuv);
                            if (fDoMMCVFilter2 > f) {
                                VideoDataRetrieverBySoft videoDataRetrieverBySoft5 = VideoDataRetrieverBySoft.this;
                                videoDataRetrieverBySoft5.nativeGetRGBImage(videoDataRetrieverBySoft5.mARGBData);
                                f = fDoMMCVFilter2;
                            }
                        } else {
                            VideoDataRetrieverBySoft videoDataRetrieverBySoft6 = VideoDataRetrieverBySoft.this;
                            videoDataRetrieverBySoft6.nativeGetRGBImage(videoDataRetrieverBySoft6.mARGBData);
                        }
                    }
                    j2 += this.mPtsStep;
                }
                VideoDataRetrieverBySoft videoDataRetrieverBySoft7 = VideoDataRetrieverBySoft.this;
                videoDataRetrieverBySoft7.mCurBmp = Bitmap.createBitmap(videoDataRetrieverBySoft7.mARGBData, 0, VideoDataRetrieverBySoft.this.mWidth, VideoDataRetrieverBySoft.this.mWidth, VideoDataRetrieverBySoft.this.mHeight, Bitmap.Config.ARGB_8888);
                if (VideoDataRetrieverBySoft.this.mImageFrameFilterListener != null) {
                    VideoDataRetrieverBySoft.this.mImageFrameFilterListener.doFilterFrame(VideoDataRetrieverBySoft.this.mCurBmp);
                }
            }
            if (VideoDataRetrieverBySoft.this.mImageFrameFilterListener != null) {
                VideoDataRetrieverBySoft.this.mImageFrameFilterListener.doFilterComplete();
            }
            kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "doFrameFilter is complete, VideoDataRetrieverBySoft will be release!");
        }

        public float doMMCVFilter(byte[] bArr) {
            lq2 lq2Var = new lq2();
            this.processInput = lq2Var;
            lq2Var.f129274g = 17;
            lq2Var.f129272e = bArr;
            lq2Var.f129268a = VideoDataRetrieverBySoft.this.mWidth;
            this.processInput.f129269b = VideoDataRetrieverBySoft.this.mHeight;
            VideoDataRetrieverBySoft.access$200(VideoDataRetrieverBySoft.this);
            return 0.0f;
        }

        public void resetMMCV() {
        }
    }

    public interface ImageFrameFilterListener {
        void doFilterComplete();

        void doFilterError(Exception exc);

        void doFilterFrame(Bitmap bitmap);
    }

    public interface OnThumbnailListComplete {
        void onComplete();
    }

    public VideoDataRetrieverBySoft() {
        this.mHandler = 0L;
        mow.m155709j().m155717g();
        this.mHandler = nativeCreateVideoDataRetriver();
    }

    public static /* synthetic */ u0m access$200(VideoDataRetrieverBySoft videoDataRetrieverBySoft) {
        videoDataRetrieverBySoft.getClass();
        return null;
    }

    private boolean allocImagebuffer(int i) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        int width = getWidth() * getHeight();
        if (i == 0 || i == 25) {
            byte[] bArr = this.mDstByteData;
            if (bArr == null || bArr.length != (width * 3) / 2) {
                this.mDstByteData = new byte[((getWidth() * getHeight()) * 3) / 2];
            }
            int[] iArr = this.mDstIntData;
            if (iArr != null && iArr.length == width) {
                return true;
            }
            this.mDstIntData = new int[getWidth() * getHeight()];
            return true;
        }
        if (i != 28 && i != 30) {
            return false;
        }
        byte[] bArr2 = this.mDstByteData;
        if (bArr2 == null || bArr2.length != width * 4) {
            this.mDstByteData = new byte[getHeight() * getWidth() * 4];
        }
        int[] iArr2 = this.mDstIntData;
        if (iArr2 != null && iArr2.length == width) {
            return true;
        }
        this.mDstIntData = new int[getWidth() * getHeight()];
        return true;
    }

    private Bitmap decodecOneFrameToBmp(long j, int i, int i2) {
        nativeSetYuvAndRgbOutFlag(false);
        nativeSetDstPixFmt(30);
        if (i2 > 0 && i2 > 0) {
            setDstImageSize(i, i2);
        }
        int[] iArr = (int[]) decoderOneFrame(j, 5, 30);
        if (iArr == null) {
            return null;
        }
        if (i <= 0) {
            i = this.mWidth;
        }
        int i3 = i;
        if (i2 <= 0) {
            i2 = this.mHeight;
        }
        return Bitmap.createBitmap(iArr, 0, i3, i3, i2, Bitmap.Config.ARGB_8888);
    }

    private Object decoderOneFrame(long j, int i, int i2) {
        nativeSetYuvAndRgbOutFlag(false);
        nativeSetDstPixFmt(i2);
        if (nativeDecodeOneFrame(j) <= 0 || !allocImagebuffer(i2)) {
            return null;
        }
        if (i == 5) {
            if (nativeGetDstImage(this.mDstIntData) == 0) {
                return this.mDstIntData;
            }
            return null;
        }
        if (i == 4 && nativeGetDstImage(this.mDstByteData) == 0) {
            return this.mDstByteData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getAutoMaxLength(long j) {
        long j2 = 2000000 % j;
        if (j2 != 0) {
            return (j - j2) + 2000000;
        }
        return 2000000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getAutoStep() {
        return Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    private int initNativeRetriever(String str) {
        if (this.mHandler == 0 || str == null || str.length() == 0) {
            return -1;
        }
        return nativeInitVideoDataRetriver(this.mHandler, str);
    }

    private static native long nativeCreateVideoDataRetriver();

    /* JADX INFO: Access modifiers changed from: private */
    public int nativeDecodeOneFrame(long j) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            return -1;
        }
        return nativeDecodeOneFrame(j2, j);
    }

    private static native int nativeDecodeOneFrame(long j, long j2);

    private int nativeGetDstImage(byte[] bArr) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeMediaRetrieverGetDstFmtData(j, bArr);
        }
        return -1;
    }

    private long nativeGetDuration() {
        long j = this.mHandler;
        if (j == 0) {
            return -1L;
        }
        return nativeMediaRetrieverGetDuration(j);
    }

    private int nativeGetFps() {
        long j = this.mHandler;
        if (j == 0) {
            return 0;
        }
        return nativeMediaRetrieverGetFrameRate(j);
    }

    private int nativeGetHeight() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetHeight(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nativeGetRGBImage(int[] iArr) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetRGBImageData(j, iArr);
    }

    private int nativeGetRotation() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetRotation(j);
    }

    private int nativeGetWidth() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetWidth(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int nativeGetYuvImage(byte[] bArr) throws Exception {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetYUVImageData(j, bArr);
    }

    private static native int nativeInitVideoDataRetriver(long j, String str);

    private static native int nativeMediaRetrieverGetDstFmtData(long j, byte[] bArr);

    private static native int nativeMediaRetrieverGetDstFmtDataIntArray(long j, int[] iArr);

    private static native long nativeMediaRetrieverGetDuration(long j);

    private static native int nativeMediaRetrieverGetFrameRate(long j);

    private static native int nativeMediaRetrieverGetHeight(long j);

    private static native int nativeMediaRetrieverGetRGBByteImageData(long j, byte[] bArr);

    private static native int nativeMediaRetrieverGetRGBImageData(long j, int[] iArr);

    private static native int nativeMediaRetrieverGetRotation(long j);

    private static native int nativeMediaRetrieverGetWidth(long j);

    private static native int nativeMediaRetrieverGetYUVImageData(long j, byte[] bArr);

    private static native int nativeMediaRetrieverRelease(long j);

    private static native int nativeMediaRetrieverSeek(long j, long j2);

    private static native void nativeMediaRetrieverSetDstPixFmt(long j, int i);

    private static native void nativeMediaRetrieverSetYuvAndRgbOut(long j, int i);

    private int nativeRelease() {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        nativeMediaRetrieverRelease(j);
        this.mHandler = 0L;
        return 0;
    }

    private int nativeSeek(long j) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            return -1;
        }
        return nativeMediaRetrieverSeek(j2, j);
    }

    private void nativeSetDstPixFmt(int i) {
        long j = this.mHandler;
        if (j != 0) {
            nativeMediaRetrieverSetDstPixFmt(j, i);
        }
    }

    private static native void nativeSetDstPixSize(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public void nativeSetYuvAndRgbOutFlag(boolean z) {
        long j = this.mHandler;
        if (j != 0) {
            nativeMediaRetrieverSetYuvAndRgbOut(j, z ? 1 : 0);
        }
    }

    private void seek(long j) {
        nativeSeek(j);
    }

    private void setDstImageSize(int i, int i2) {
        long j = this.mHandler;
        if (j != 0) {
            nativeSetDstPixSize(j, i, i2);
        }
    }

    public void executeFrameFilter() {
        if (this.mFrameFilter != null) {
            new Thread(new Runnable() { // from class: com.immomo.moment.mediautils.VideoDataRetrieverBySoft.1
                @Override // java.lang.Runnable
                public void run() {
                    kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "executeFrameFilter is called，thread will run!");
                    if (epx.m117686a()) {
                        VideoDataRetrieverBySoft.access$200(VideoDataRetrieverBySoft.this);
                    }
                    try {
                        VideoDataRetrieverBySoft.this.mFrameFilter.setYuv(new byte[((VideoDataRetrieverBySoft.this.mWidth * VideoDataRetrieverBySoft.this.mHeight) * 3) / 2]);
                        synchronized (VideoDataRetrieverBySoft.this.mSync) {
                            try {
                                VideoDataRetrieverBySoft.this.mFrameFilter.doFrameFilter();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Exception e) {
                        kwv.m147653c(VideoDataRetrieverBySoft.this.TAG, "executeFrameFilter thread is exception, will release!");
                        e.printStackTrace();
                        VideoDataRetrieverBySoft.this.release();
                        if (VideoDataRetrieverBySoft.this.mImageFrameFilterListener != null) {
                            VideoDataRetrieverBySoft.this.mImageFrameFilterListener.doFilterError(e);
                        }
                    }
                    if (epx.m117686a()) {
                        VideoDataRetrieverBySoft.access$200(VideoDataRetrieverBySoft.this);
                    }
                }
            }, "DataRetriverBySoft" + zzf0.m221018b()).start();
        }
    }

    public Bitmap getBestImage() {
        return null;
    }

    public long getDuration() {
        return nativeGetDuration();
    }

    public Bitmap getFrameAbsTime(long j) {
        Bitmap bitmapDecodecOneFrameToBmp;
        synchronized (this.mSync) {
            bitmapDecodecOneFrameToBmp = decodecOneFrameToBmp(j * 1000, 0, 0);
        }
        return bitmapDecodecOneFrameToBmp;
    }

    public Bitmap getFrameAtTime(long j) {
        synchronized (this.mSync) {
            try {
                if (nativeSeek(j) < 0) {
                    return null;
                }
                return decodecOneFrameToBmp(j, 0, 0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFrameRate() {
        return nativeGetFps();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public void getImageByList(List<Node> list, int i, int i2) {
        Bitmap bitmap;
        if (this.mType == 1) {
            return;
        }
        synchronized (this.mSync) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.mThumbnailList = list;
                if (list.size() > 0) {
                    seek(list.get(0).pts);
                }
                this.mIndex = 0;
                while (this.mIndex < list.size() && !this.mExit) {
                    Node node = list.get(this.mIndex);
                    if (i == 1) {
                        Bitmap bitmapDecodecOneFrameToBmp = decodecOneFrameToBmp(node.pts, node.dstWidth, node.dstHeight);
                        if (bitmapDecodecOneFrameToBmp != null) {
                            node.bmp = bitmapDecodecOneFrameToBmp;
                            kwv.m147653c(this.TAG, "get cur frame cost " + (System.currentTimeMillis() - jCurrentTimeMillis));
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                    } else if (i == 2) {
                        node.intBuffer = (int[]) decoderOneFrame(node.pts, 5, i2);
                    } else if (i == 3) {
                        node.byteBuffer = (byte[]) decoderOneFrame(node.pts, 4, i2);
                    }
                    int i3 = this.mIndex + 1;
                    this.mIndex = i3;
                    if (i3 < list.size() && (list.get(this.mIndex).pts < node.pts || list.get(this.mIndex).pts - node.pts >= 1000000)) {
                        kwv.m147653c(this.TAG, "seek to new pos " + list.get(this.mIndex).pts);
                        seek(list.get(this.mIndex).pts);
                    }
                }
                if (this.mExit) {
                    for (Node node2 : list) {
                        if (node2 != null && (bitmap = node2.bmp) != null && !bitmap.isRecycled()) {
                            node2.bmp.recycle();
                        }
                    }
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getImageRotation() {
        return 0;
    }

    public int getRotation() {
        return nativeGetRotation();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean init(String str) {
        if (this.mHandler == 0 || str == null || str.length() == 0) {
            return false;
        }
        if (nativeInitVideoDataRetriver(this.mHandler, str) < 0) {
            release();
            this.mHandler = 0L;
            return false;
        }
        this.mWidth = nativeGetWidth();
        this.mHeight = nativeGetHeight();
        this.mDuration = nativeGetDuration();
        this.mARGBData = new int[this.mWidth * this.mHeight];
        return true;
    }

    public boolean initWithType(String str, int i, int i2, int i3) {
        if (!init(str)) {
            return false;
        }
        this.mType = i;
        if (i == 1) {
            this.mFrameFilter = new BestFrameFilter();
        }
        BestFrameFilter bestFrameFilter = this.mFrameFilter;
        if (bestFrameFilter != null) {
            bestFrameFilter.setFrameCnt(i2, i3);
        }
        return true;
    }

    public void release() {
        this.mExit = true;
        synchronized (this.mSync) {
            nativeRelease();
            this.mExit = false;
        }
    }

    public void setBestFrameCnt(int i, int i2) {
        BestFrameFilter bestFrameFilter = this.mFrameFilter;
        if (bestFrameFilter != null) {
            bestFrameFilter.setFrameCnt(i, i2);
        }
    }

    public void setImageFrameFilterListener(ImageFrameFilterListener imageFrameFilterListener) {
        this.mImageFrameFilterListener = imageFrameFilterListener;
    }

    public void setOnCompleteListener(OnThumbnailListComplete onThumbnailListComplete) {
        this.mCompleteListener = onThumbnailListComplete;
    }

    public void setmFaceModeList(List<String> list) {
        this.mFaceModeList = list;
    }

    public static class Node {
        public Bitmap bmp;
        public byte[] byteBuffer;
        public int dstHeight;
        public int dstWidth;
        public int[] intBuffer;
        public long pts;
        public int seqNum;

        public Node(long j, int i) {
            this.pts = j;
            this.seqNum = i;
            this.dstWidth = 0;
            this.dstHeight = 0;
        }

        public Node(long j, int i, int i2, int i3) {
            this.pts = j;
            this.seqNum = i;
            this.dstWidth = i2;
            this.dstHeight = i3;
        }
    }

    private int nativeGetDstImage(int[] iArr) {
        long j = this.mHandler;
        if (j != 0) {
            return nativeMediaRetrieverGetDstFmtDataIntArray(j, iArr);
        }
        return -1;
    }

    private int nativeGetRGBImage(byte[] bArr) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeMediaRetrieverGetRGBByteImageData(j, bArr);
    }

    public boolean initWithType(String str, int i, int i2) {
        return initWithType(str, i, i2, 0);
    }

    public void getImageByList(List<Node> list) {
        getImageByList(list, 1, 30);
        kwv.m147653c(this.TAG, "\n\n");
    }
}
