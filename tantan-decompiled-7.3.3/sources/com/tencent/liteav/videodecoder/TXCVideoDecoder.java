package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.core.glcore.util.ErrorCode;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TXCVideoDecoder implements InterfaceC14170b, InterfaceC14485f {
    private static final boolean NEW_DECODER = true;
    private static final String TAG = "TXCVideoDecoder";
    private static long mDecodeFirstFrameTS;
    private int mDecoderCacheNum;
    private HandlerC14479a mDecoderHandler;
    InterfaceC14485f mDecoderListener;
    private long mNativeContext;
    private WeakReference<InterfaceC14170b> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    Surface mSurface;
    private String mUserId;
    InterfaceC14481b mVideoDecoder;
    private boolean mRestarting = false;
    private int mStreamType = 0;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private boolean mEnableDecoderChange = false;
    private boolean mEnableRestartDecoder = false;
    private boolean mEnableLimitDecCache = false;
    private JSONArray mDecFormat = null;
    private ArrayList<TXSNALPacket> mNALList = new ArrayList<>();
    boolean mHWDec = true;
    boolean mHevc = false;
    boolean mNeedSortFrame = true;
    boolean mRecvFirstFrame = false;

    static {
        C14215f.m84239f();
    }

    public TXCVideoDecoder() {
        mDecodeFirstFrameTS = 0L;
    }

    private void addOneNalToDecoder(TXSNALPacket tXSNALPacket) {
        boolean z = tXSNALPacket.nalType == 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("iframe", z);
        bundle.putByteArray("nal", tXSNALPacket.nalData);
        bundle.putLong("pts", tXSNALPacket.pts);
        bundle.putLong("dts", tXSNALPacket.dts);
        bundle.putInt("codecId", tXSNALPacket.codecId);
        Message message = new Message();
        message.what = 101;
        message.setData(bundle);
        HandlerC14479a handlerC14479a = this.mDecoderHandler;
        if (handlerC14479a != null) {
            handlerC14479a.sendMessage(message);
        }
        this.mDecoderCacheNum++;
    }

    private void decNALByNewWay(TXSNALPacket tXSNALPacket) {
        if (this.mHWDec) {
            decodeFrame(tXSNALPacket.nalData, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId, 0, 0, tXSNALPacket.nalType);
        } else {
            synchronized (this) {
                nativeDecodeFrame(this.mNativeContext, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.pts, tXSNALPacket.dts, tXSNALPacket.rotation, tXSNALPacket.codecId);
            }
        }
    }

    private void decNALByOldWay(TXSNALPacket tXSNALPacket) {
        try {
            boolean z = tXSNALPacket.nalType == 0;
            boolean z2 = this.mRecvFirstFrame;
            if (!z2 && !z) {
                TXCLog.m84152i(TAG, "play:decode: push nal ignore p frame when not got i frame");
                return;
            }
            if (!z2 && z) {
                TXCLog.m84156w(TAG, "play:decode: push first i frame");
                this.mRecvFirstFrame = true;
            }
            if (!this.mRestarting && tXSNALPacket.codecId == 1 && !this.mHWDec) {
                TXCLog.m84156w(TAG, "play:decode: hevc decode error  ");
                C14215f.m84219a(this.mNotifyListener, -2304, "h265 Decoding failed");
                this.mRestarting = true;
            }
            if (this.mDecoderHandler != null) {
                if (!this.mNALList.isEmpty()) {
                    Iterator<TXSNALPacket> it = this.mNALList.iterator();
                    while (it.hasNext()) {
                        addOneNalToDecoder(it.next());
                    }
                }
                this.mNALList.clear();
                addOneNalToDecoder(tXSNALPacket);
                return;
            }
            if (z && !this.mNALList.isEmpty()) {
                this.mNALList.clear();
            }
            this.mNALList.add(tXSNALPacket);
            if (this.mRestarting) {
                return;
            }
            start();
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "decode NAL By Old way failed.", e);
        }
    }

    private void decodeFrame(byte[] bArr, long j, long j2, int i, int i2, int i3, int i4, int i5) {
        TXSNALPacket tXSNALPacket = new TXSNALPacket();
        tXSNALPacket.nalData = bArr;
        tXSNALPacket.pts = j;
        tXSNALPacket.dts = j2;
        tXSNALPacket.rotation = i;
        tXSNALPacket.codecId = i2;
        tXSNALPacket.nalType = i5;
        synchronized (this) {
            try {
                if (this.mNativeContext != 0 && this.mVideoDecoder == null) {
                    C14484e c14484e = new C14484e();
                    c14484e.m85240a(i3, i4);
                    c14484e.setListener(this);
                    c14484e.setNotifyListener(new WeakReference<>(this));
                    c14484e.m85241a(this.mDecFormat);
                    c14484e.config(this.mSurface);
                    c14484e.enableLimitDecCache(this.mEnableLimitDecCache);
                    c14484e.start(this.mSps, this.mPps, this.mNeedSortFrame, this.mHevc);
                    notifyDecoderStartEvent(true);
                    this.mVideoDecoder = c14484e;
                }
                InterfaceC14481b interfaceC14481b = this.mVideoDecoder;
                if (interfaceC14481b != null) {
                    interfaceC14481b.decode(tXSNALPacket);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean hasSurface() {
        return this.mSurface != null;
    }

    private native long nativeCreateContext(boolean z);

    private native void nativeDecCache(long j);

    private native void nativeDecodeFrame(long j, byte[] bArr, int i, long j2, long j3, int i2, int i3);

    private native void nativeDestroyContext(long j);

    private native void nativeEnableDecodeChange(long j, boolean z);

    private native void nativeEnableRestartDecoder(long j, boolean z);

    private native void nativeNotifyHWDecoderError(long j);

    private native void nativeNotifyPts(long j, long j2, int i, int i2);

    private native void nativeReStart(long j, boolean z);

    private native void nativeSetID(long j, String str);

    private native void nativeSetStreamType(long j, int i);

    private void notifyDecoderStartEvent(boolean z) {
        TXCEventRecorderProxy.m84163a(this.mUserId, 4005, z ? 1L : 0L, -1L, "", this.mStreamType);
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2008);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, z ? "Enables hardware decoding" : "Enables software decoding");
        bundle.putInt("EVT_PARAM1", z ? 1 : 2);
        C14215f.m84220a(this.mNotifyListener, this.mUserId, 2008, bundle);
        TXCKeyPointReportProxy.m84170a(this.mUserId, TantanException.Client.AccountService.ACCOUNT_INVALID_ACCESS_TOKEN, z ? 1L : 2L, this.mStreamType);
    }

    private void onDecodeDone(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3, int i4) {
        if (mDecodeFirstFrameTS == 0) {
            long timeTick = TXCTimeUtil.getTimeTick();
            mDecodeFirstFrameTS = timeTick;
            TXCStatus.m84177a(this.mUserId, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED, this.mStreamType, Long.valueOf(timeTick));
            TXCStatus.m84177a(this.mUserId, ErrorCode.EDIT_AUDIOMIX_FAILED, this.mStreamType, Integer.valueOf(this.mHevc ? 2 : 0));
        }
        InterfaceC14485f interfaceC14485f = this.mDecoderListener;
        if (interfaceC14485f != null) {
            tXSVideoFrame.width = i;
            tXSVideoFrame.height = i2;
            tXSVideoFrame.rotation = i3;
            tXSVideoFrame.pts = j;
            tXSVideoFrame.frameType = i4;
            interfaceC14485f.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            interfaceC14485f.onVideoSizeChange(i, i2);
        }
    }

    private void onStartDecoder(boolean z) {
        notifyDecoderStartEvent(z);
    }

    private int startDecodeThread() throws Throwable {
        synchronized (this) {
            try {
                try {
                    if (this.mDecoderHandler != null) {
                        TXCLog.m84149e(TAG, "play:decode: start decoder error when decoder is started");
                        return -1;
                    }
                    this.mDecoderCacheNum = 0;
                    this.mRestarting = false;
                    HandlerThread handlerThread = new HandlerThread("VDecoder");
                    handlerThread.start();
                    if (this.mHWDec) {
                        handlerThread.setName("VideoWDec" + handlerThread.getId());
                    } else {
                        handlerThread.setName("VideoSWDec" + handlerThread.getId());
                    }
                    HandlerC14479a handlerC14479a = new HandlerC14479a(handlerThread.getLooper());
                    handlerC14479a.m85198a(this.mHevc, this.mHWDec, this.mSurface, this.mSps, this.mPps, this, this);
                    TXCLog.m84156w(TAG, "play:decode: start decode thread");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 100;
                    messageObtain.obj = Boolean.valueOf(this.mNeedSortFrame);
                    handlerC14479a.sendMessage(messageObtain);
                    this.mDecoderHandler = handlerC14479a;
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private void stopDecodeThread() {
        synchronized (this) {
            try {
                HandlerC14479a handlerC14479a = this.mDecoderHandler;
                if (handlerC14479a != null) {
                    handlerC14479a.sendEmptyMessage(102);
                }
                this.mDecoderHandler = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void stopHWDecoder() {
        InterfaceC14481b interfaceC14481b = this.mVideoDecoder;
        if (interfaceC14481b != null) {
            interfaceC14481b.stop();
            this.mVideoDecoder.setListener(null);
            this.mVideoDecoder.setNotifyListener(null);
            this.mVideoDecoder = null;
        }
    }

    public long GetDecodeFirstFrameTS() {
        return mDecodeFirstFrameTS;
    }

    public void config(JSONArray jSONArray) {
        this.mDecFormat = jSONArray;
    }

    public void enableChange(boolean z) {
        this.mEnableDecoderChange = z;
        synchronized (this) {
            nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        }
    }

    public void enableHWDec(boolean z) {
        this.mHWDec = z;
    }

    public void enableLimitDecCache(boolean z) {
        this.mEnableLimitDecCache = z;
        InterfaceC14481b interfaceC14481b = this.mVideoDecoder;
        if (interfaceC14481b != null) {
            interfaceC14481b.enableLimitDecCache(z);
        }
    }

    public void enableRestart(boolean z) {
        this.mEnableRestartDecoder = z;
    }

    public int getDecoderCacheNum() {
        return this.mDecoderCacheNum + this.mNALList.size();
    }

    public boolean isHardwareDecode() {
        return this.mVideoDecoder != null;
    }

    public boolean isHevc() {
        HandlerC14479a handlerC14479a = this.mDecoderHandler;
        if (handlerC14479a != null) {
            return handlerC14479a.m85199a();
        }
        return false;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onDecodeFailed(int i) {
        InterfaceC14485f interfaceC14485f = this.mDecoderListener;
        if (interfaceC14485f != null) {
            interfaceC14485f.onDecodeFailed(i);
        }
        synchronized (this) {
            nativeDecCache(this.mNativeContext);
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        if (mDecodeFirstFrameTS == 0) {
            long timeTick = TXCTimeUtil.getTimeTick();
            mDecodeFirstFrameTS = timeTick;
            TXCStatus.m84177a(this.mUserId, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED, this.mStreamType, Long.valueOf(timeTick));
            TXCStatus.m84177a(this.mUserId, ErrorCode.EDIT_AUDIOMIX_FAILED, this.mStreamType, Integer.valueOf(this.mHevc ? 3 : 1));
        }
        InterfaceC14485f interfaceC14485f = this.mDecoderListener;
        if (interfaceC14485f != null) {
            interfaceC14485f.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
        }
        int i4 = this.mDecoderCacheNum;
        if (i4 > 0) {
            this.mDecoderCacheNum = i4 - 1;
        }
        if (tXSVideoFrame == null) {
            synchronized (this) {
                nativeNotifyPts(this.mNativeContext, j, i, i2);
            }
        }
        int iGetDecodeCost = this.mVideoDecoder.GetDecodeCost();
        boolean z = this.mHWDec;
        String str = this.mUserId;
        if (z) {
            TXCStatus.m84177a(str, ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        } else {
            TXCStatus.m84177a(str, 8003, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        }
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            nativeNotifyHWDecoderError(this.mNativeContext);
        }
        C14215f.m84220a(this.mNotifyListener, this.mUserId, i, bundle);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14485f
    public void onVideoSizeChange(int i, int i2) {
        InterfaceC14485f interfaceC14485f = this.mDecoderListener;
        if (interfaceC14485f != null) {
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            interfaceC14485f.onVideoSizeChange(i, i2);
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        decNALByNewWay(tXSNALPacket);
    }

    public void restart(boolean z) {
        synchronized (this) {
            this.mHWDec = z;
            nativeReStart(this.mNativeContext, z);
        }
    }

    public void setListener(InterfaceC14485f interfaceC14485f) {
        this.mDecoderListener = interfaceC14485f;
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        this.mNotifyListener = new WeakReference<>(interfaceC14170b);
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
        synchronized (this) {
            nativeSetStreamType(this.mNativeContext, this.mStreamType);
        }
    }

    public void setUserId(String str) {
        this.mUserId = str;
        synchronized (this) {
            nativeSetID(this.mNativeContext, this.mUserId);
        }
    }

    public int setup(SurfaceTexture surfaceTexture, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        synchronized (this) {
            try {
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                    this.mSurface = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return setup(new Surface(surfaceTexture), byteBuffer, byteBuffer2, z);
    }

    public synchronized int start() {
        if (this.mHWDec && this.mSurface == null) {
            TXCLog.m84152i(TAG, "play:decode: start decoder error when not setup surface, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        if (this.mNativeContext != 0) {
            TXCLog.m84156w(TAG, "play:decode: start decoder error when decoder is started, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        TXCLog.m84156w(TAG, "play:decode: start decoder java id " + this.mUserId + "_" + this.mStreamType + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hashCode());
        long jNativeCreateContext = nativeCreateContext(this.mHWDec);
        this.mNativeContext = jNativeCreateContext;
        nativeSetID(jNativeCreateContext, this.mUserId);
        nativeSetStreamType(this.mNativeContext, this.mStreamType);
        nativeEnableDecodeChange(this.mNativeContext, this.mEnableDecoderChange);
        nativeEnableRestartDecoder(this.mNativeContext, this.mEnableRestartDecoder);
        return 0;
    }

    public synchronized void stop() {
        if (this.mNativeContext == 0) {
            TXCLog.m84156w(TAG, "play:decode: stop decoder ignore when decoder is stopped, id " + this.mUserId + "_" + this.mStreamType);
            return;
        }
        TXCLog.m84156w(TAG, "play:decode: stop decoder java id " + this.mUserId + "_" + this.mStreamType + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hashCode());
        nativeDestroyContext(this.mNativeContext);
        this.mNativeContext = 0L;
        this.mNALList.clear();
        this.mRecvFirstFrame = false;
        this.mDecoderCacheNum = 0;
        mDecodeFirstFrameTS = 0L;
        synchronized (this) {
            try {
                InterfaceC14481b interfaceC14481b = this.mVideoDecoder;
                if (interfaceC14481b != null) {
                    interfaceC14481b.stop();
                    this.mVideoDecoder.setListener(null);
                    this.mVideoDecoder.setNotifyListener(null);
                    this.mVideoDecoder = null;
                }
                Surface surface = this.mSurface;
                if (surface != null) {
                    surface.release();
                    this.mSurface = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int setup(Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z) {
        synchronized (this) {
            this.mSurface = surface;
        }
        this.mSps = byteBuffer;
        this.mPps = byteBuffer2;
        this.mNeedSortFrame = z;
        return 0;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videodecoder.TXCVideoDecoder$a */
    public static class HandlerC14479a extends Handler {

        /* JADX INFO: renamed from: a */
        InterfaceC14481b f60771a;

        /* JADX INFO: renamed from: b */
        InterfaceC14485f f60772b;

        /* JADX INFO: renamed from: c */
        WeakReference<InterfaceC14170b> f60773c;

        /* JADX INFO: renamed from: d */
        boolean f60774d;

        /* JADX INFO: renamed from: e */
        boolean f60775e;

        /* JADX INFO: renamed from: f */
        Surface f60776f;

        /* JADX INFO: renamed from: g */
        private ByteBuffer f60777g;

        /* JADX INFO: renamed from: h */
        private ByteBuffer f60778h;

        public HandlerC14479a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        private void m85194a(boolean z) {
            InterfaceC14481b interfaceC14481b = this.f60771a;
            boolean z2 = this.f60774d;
            if (interfaceC14481b != null) {
                TXCLog.m84152i(TXCVideoDecoder.TAG, "play:decode: start decode ignore hwdec: " + z2);
                return;
            }
            if (z2) {
                this.f60771a = new C14484e();
            } else {
                this.f60771a = new TXCVideoFfmpegDecoder();
            }
            this.f60771a.setListener(this.f60772b);
            this.f60771a.setNotifyListener(this.f60773c);
            this.f60771a.config(this.f60776f);
            this.f60771a.start(this.f60777g, this.f60778h, z, this.f60775e);
            TXCLog.m84156w(TXCVideoDecoder.TAG, "play:decode: start decode hwdec: " + this.f60774d + ", hevc: " + this.f60775e);
        }

        /* JADX INFO: renamed from: b */
        private void m85197b() {
            InterfaceC14481b interfaceC14481b = this.f60771a;
            if (interfaceC14481b != null) {
                interfaceC14481b.stop();
                this.f60771a.setListener(null);
                this.f60771a.setNotifyListener(null);
                this.f60771a = null;
            }
            Looper.myLooper().quit();
            TXCLog.m84156w(TXCVideoDecoder.TAG, "play:decode: stop decode hwdec: " + this.f60774d);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 100:
                    m85194a(((Boolean) message.obj).booleanValue());
                    break;
                case 101:
                    try {
                        Bundle data = message.getData();
                        m85196a(data.getByteArray("nal"), data.getLong("pts"), data.getLong("dts"), data.getInt("codecId"));
                    } catch (Exception e) {
                        TXCLog.m84149e(TXCVideoDecoder.TAG, "decode frame failed." + e.getMessage());
                        return;
                    }
                    break;
                case 102:
                    m85197b();
                    break;
                case 103:
                    m85195a(message.arg1 == 1, message.arg2 == 1);
                    break;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m85199a() {
            InterfaceC14481b interfaceC14481b = this.f60771a;
            if (interfaceC14481b != null) {
                return interfaceC14481b.isHevc();
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        private void m85196a(byte[] bArr, long j, long j2, int i) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.pts = j;
            tXSNALPacket.dts = j2;
            tXSNALPacket.codecId = i;
            InterfaceC14481b interfaceC14481b = this.f60771a;
            if (interfaceC14481b != null) {
                interfaceC14481b.decode(tXSNALPacket);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m85195a(boolean z, boolean z2) {
            this.f60774d = z;
            TXCLog.m84156w(TXCVideoDecoder.TAG, "play:decode: restart decode hwdec: " + this.f60774d);
            InterfaceC14481b interfaceC14481b = this.f60771a;
            if (interfaceC14481b != null) {
                interfaceC14481b.stop();
                this.f60771a.setListener(null);
                this.f60771a.setNotifyListener(null);
                this.f60771a = null;
            }
            m85194a(z2);
        }

        /* JADX INFO: renamed from: a */
        public void m85198a(boolean z, boolean z2, Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, InterfaceC14485f interfaceC14485f, InterfaceC14170b interfaceC14170b) {
            this.f60775e = z;
            this.f60774d = z2;
            this.f60776f = surface;
            this.f60777g = byteBuffer;
            this.f60778h = byteBuffer2;
            this.f60772b = interfaceC14485f;
            this.f60773c = new WeakReference<>(interfaceC14170b);
        }
    }
}
