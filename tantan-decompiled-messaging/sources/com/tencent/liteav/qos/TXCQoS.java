package com.tencent.liteav.qos;

import android.os.Bundle;
import android.os.Handler;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p086a.EnumC14005c;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TXCQoS {
    public static final int AUTO_ADJUST_LIVEPUSH_RESOLUTION_STRATEGY = 1;
    public static final int AUTO_ADJUST_REALTIME_VIDEOCHAT_STRATEGY = 5;
    private static final Map<Integer, EnumC14005c> RESOLUTION_MAP;
    static final String TAG = "TXCQos";
    private long mInstance;
    private InterfaceC14158a mListener;
    private InterfaceC14007b mNotifyListener;
    private long mInterval = 1000;
    private String mUserID = "";
    private boolean mIsEnableDrop = false;
    private int mBitrate = 0;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mAutoStrategy = -1;
    private Handler mHandler = new Handler();
    private Runnable mRunnable = new Runnable() { // from class: com.tencent.liteav.qos.TXCQoS.1
        @Override // java.lang.Runnable
        public void run() {
            if (TXCQoS.this.mListener != null) {
                int iM83761a = TXCQoS.this.mListener.m83761a();
                int iM83764b = TXCQoS.this.mListener.m83764b();
                int iM83765c = TXCQoS.this.mListener.m83765c();
                int iM83766d = TXCQoS.this.mListener.m83766d();
                int iM83767e = TXCQoS.this.mListener.m83767e();
                int iM83768f = TXCQoS.this.mListener.m83768f();
                int iM83769g = TXCQoS.this.mListener.m83769g();
                TXCQoS tXCQoS = TXCQoS.this;
                tXCQoS.nativeSetVideoRealBitrate(tXCQoS.mInstance, iM83761a);
                TXCQoS tXCQoS2 = TXCQoS.this;
                tXCQoS2.nativeAdjustBitrate(tXCQoS2.mInstance, iM83766d, iM83767e, iM83768f, iM83765c, iM83764b, iM83769g);
                TXCQoS tXCQoS3 = TXCQoS.this;
                boolean zNativeIsEnableDrop = tXCQoS3.nativeIsEnableDrop(tXCQoS3.mInstance);
                if (TXCQoS.this.mIsEnableDrop != zNativeIsEnableDrop) {
                    TXCQoS.this.mIsEnableDrop = zNativeIsEnableDrop;
                    TXCQoS.this.mListener.m83763a(zNativeIsEnableDrop);
                }
                TXCQoS tXCQoS4 = TXCQoS.this;
                int iNativeGetBitrate = tXCQoS4.nativeGetBitrate(tXCQoS4.mInstance);
                TXCQoS tXCQoS5 = TXCQoS.this;
                int iNativeGetWidth = tXCQoS5.nativeGetWidth(tXCQoS5.mInstance);
                TXCQoS tXCQoS6 = TXCQoS.this;
                int iNativeGetHeight = tXCQoS6.nativeGetHeight(tXCQoS6.mInstance);
                if (iNativeGetWidth == TXCQoS.this.mWidth && iNativeGetHeight == TXCQoS.this.mHeight) {
                    if (iNativeGetBitrate != TXCQoS.this.mBitrate) {
                        TXCQoS.this.mListener.m83762a(iNativeGetBitrate, 0, 0);
                        if (TXCQoS.this.mNotifyListener != null) {
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Adjust encoding bitrate:new bitrate:" + iNativeGetBitrate);
                            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                            bundle.putString("EVT_USERID", TXCQoS.this.mUserID);
                            TXCQoS.this.mNotifyListener.onNotifyEvent(1006, bundle);
                        }
                    }
                } else if (TXCQoS.this.mAutoStrategy == 1 || TXCQoS.this.mAutoStrategy == 5) {
                    TXCQoS.this.mListener.m83762a(iNativeGetBitrate, iNativeGetWidth, iNativeGetHeight);
                    if (TXCQoS.this.mNotifyListener != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Adjust resolution:new bitrate:" + iNativeGetBitrate + " new resolution:" + iNativeGetWidth + "*" + iNativeGetHeight);
                        bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                        TXCQoS.this.mNotifyListener.onNotifyEvent(1005, bundle2);
                    }
                }
                TXCQoS.this.mBitrate = iNativeGetBitrate;
                TXCQoS.this.mWidth = iNativeGetWidth;
                TXCQoS.this.mHeight = iNativeGetHeight;
            }
            TXCQoS.this.mHandler.postDelayed(this, TXCQoS.this.mInterval);
        }
    };

    static {
        HashMap map = new HashMap();
        map.put(0, EnumC14005c.RESOLUTION_TYPE_360_640);
        map.put(1, EnumC14005c.RESOLUTION_TYPE_540_960);
        map.put(2, EnumC14005c.RESOLUTION_TYPE_720_1280);
        map.put(3, EnumC14005c.RESOLUTION_TYPE_640_360);
        map.put(4, EnumC14005c.RESOLUTION_TYPE_960_540);
        map.put(5, EnumC14005c.RESOLUTION_TYPE_1280_720);
        map.put(6, EnumC14005c.RESOLUTION_TYPE_320_480);
        map.put(7, EnumC14005c.RESOLUTION_TYPE_180_320);
        map.put(8, EnumC14005c.RESOLUTION_TYPE_270_480);
        map.put(9, EnumC14005c.RESOLUTION_TYPE_320_180);
        map.put(10, EnumC14005c.RESOLUTION_TYPE_480_270);
        map.put(11, EnumC14005c.RESOLUTION_TYPE_240_320);
        map.put(12, EnumC14005c.RESOLUTION_TYPE_360_480);
        map.put(13, EnumC14005c.RESOLUTION_TYPE_480_640);
        map.put(14, EnumC14005c.RESOLUTION_TYPE_320_240);
        map.put(15, EnumC14005c.RESOLUTION_TYPE_480_360);
        map.put(16, EnumC14005c.RESOLUTION_TYPE_640_480);
        map.put(17, EnumC14005c.RESOLUTION_TYPE_480_480);
        map.put(18, EnumC14005c.RESOLUTION_TYPE_270_270);
        map.put(19, EnumC14005c.RESOLUTION_TYPE_160_160);
        RESOLUTION_MAP = Collections.unmodifiableMap(map);
        C14052f.m83056f();
    }

    public TXCQoS(boolean z) {
        this.mInstance = nativeInit(z);
    }

    public static EnumC14005c getProperResolutionByVideoBitrate(boolean z, int i, int i2) {
        return RESOLUTION_MAP.get(Integer.valueOf(nativeGetProperResolutionByVideoBitrate(z, i, i2)));
    }

    private native void nativeAddQueueInputSize(long j, int i);

    private native void nativeAddQueueOutputSize(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAdjustBitrate(long j, int i, int i2, int i3, int i4, int i5, int i6);

    private native void nativeDeinit(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetBitrate(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetHeight(long j);

    private static native int nativeGetProperResolutionByVideoBitrate(boolean z, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeGetWidth(long j);

    private native long nativeInit(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean nativeIsEnableDrop(long j);

    private native void nativeReset(long j, boolean z);

    private native void nativeSetAutoAdjustBitrate(long j, boolean z);

    private native void nativeSetAutoAdjustStrategy(long j, int i);

    private native void nativeSetHasVideo(long j, boolean z);

    private native void nativeSetVideoDefaultResolution(long j, int i);

    private native void nativeSetVideoEncBitrate(long j, int i, int i2, int i3);

    private native void nativeSetVideoExpectBitrate(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoRealBitrate(long j, int i);

    public void finalize() throws Throwable {
        try {
            nativeDeinit(this.mInstance);
        } finally {
            super.finalize();
        }
    }

    public String getUserID() {
        return this.mUserID;
    }

    public boolean isEnableDrop() {
        return nativeIsEnableDrop(this.mInstance);
    }

    public void reset(boolean z) {
        nativeReset(this.mInstance, z);
    }

    public void setAutoAdjustBitrate(boolean z) {
        TXCLog.m82969i(TAG, "autoAdjustBitrate is ".concat(z ? "yes" : "no"));
        nativeSetAutoAdjustBitrate(this.mInstance, z);
    }

    public void setAutoAdjustStrategy(int i) {
        TXCLog.m82969i(TAG, "autoAdjustStrategy is " + i);
        nativeSetAutoAdjustStrategy(this.mInstance, i);
        this.mAutoStrategy = i;
    }

    public void setDefaultVideoResolution(EnumC14005c enumC14005c) {
        TXCLog.m82969i(TAG, "DefaultVideoResolution is " + enumC14005c);
        int iIntValue = 0;
        this.mWidth = 0;
        this.mHeight = 0;
        for (Map.Entry<Integer, EnumC14005c> entry : RESOLUTION_MAP.entrySet()) {
            if (entry.getValue() == enumC14005c) {
                iIntValue = entry.getKey().intValue();
            }
        }
        nativeSetVideoDefaultResolution(this.mInstance, iIntValue);
    }

    public void setHasVideo(boolean z) {
        nativeSetHasVideo(this.mInstance, z);
    }

    public void setListener(InterfaceC14158a interfaceC14158a) {
        this.mListener = interfaceC14158a;
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        this.mNotifyListener = interfaceC14007b;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public void setVideoEncBitrate(int i, int i2, int i3) {
        this.mBitrate = 0;
        nativeSetVideoEncBitrate(this.mInstance, i, i2, i3);
    }

    public void setVideoExpectBitrate(int i) {
        nativeSetVideoExpectBitrate(this.mInstance, i);
    }

    public void start(long j) {
        this.mInterval = j;
        this.mHandler.postDelayed(this.mRunnable, j);
    }

    public void stop() {
        this.mHandler.removeCallbacks(this.mRunnable);
        this.mAutoStrategy = -1;
    }
}
