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
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TXCVideoDecoder implements InterfaceC14007b, InterfaceC14322f {
    private static final boolean NEW_DECODER = true;
    private static final String TAG = "TXCVideoDecoder";
    private static long mDecodeFirstFrameTS;
    private int mDecoderCacheNum;
    private HandlerC14316a mDecoderHandler;
    InterfaceC14322f mDecoderListener;
    private long mNativeContext;
    private WeakReference<InterfaceC14007b> mNotifyListener;
    private ByteBuffer mPps;
    private ByteBuffer mSps;
    Surface mSurface;
    private String mUserId;
    InterfaceC14318b mVideoDecoder;
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
        C14052f.m83056f();
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
        HandlerC14316a handlerC14316a = this.mDecoderHandler;
        if (handlerC14316a != null) {
            handlerC14316a.sendMessage(message);
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
                TXCLog.m82969i(TAG, "play:decode: push nal ignore p frame when not got i frame");
                return;
            }
            if (!z2 && z) {
                TXCLog.m82973w(TAG, "play:decode: push first i frame");
                this.mRecvFirstFrame = true;
            }
            if (!this.mRestarting && tXSNALPacket.codecId == 1 && !this.mHWDec) {
                TXCLog.m82973w(TAG, "play:decode: hevc decode error  ");
                C14052f.m83036a(this.mNotifyListener, -2304, "h265 Decoding failed");
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
            TXCLog.m82967e(TAG, "decode NAL By Old way failed.", e);
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
                    C14321e c14321e = new C14321e();
                    c14321e.m84057a(i3, i4);
                    c14321e.setListener(this);
                    c14321e.setNotifyListener(new WeakReference<>(this));
                    c14321e.m84058a(this.mDecFormat);
                    c14321e.config(this.mSurface);
                    c14321e.enableLimitDecCache(this.mEnableLimitDecCache);
                    c14321e.start(this.mSps, this.mPps, this.mNeedSortFrame, this.mHevc);
                    notifyDecoderStartEvent(true);
                    this.mVideoDecoder = c14321e;
                }
                InterfaceC14318b interfaceC14318b = this.mVideoDecoder;
                if (interfaceC14318b != null) {
                    interfaceC14318b.decode(tXSNALPacket);
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
        TXCEventRecorderProxy.m82980a(this.mUserId, 4005, z ? 1L : 0L, -1L, "", this.mStreamType);
        Bundle bundle = new Bundle();
        bundle.putInt("EVT_ID", 2008);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, z ? "Enables hardware decoding" : "Enables software decoding");
        bundle.putInt("EVT_PARAM1", z ? 1 : 2);
        C14052f.m83037a(this.mNotifyListener, this.mUserId, 2008, bundle);
        TXCKeyPointReportProxy.m82987a(this.mUserId, TantanException.Client.AccountService.ACCOUNT_INVALID_ACCESS_TOKEN, z ? 1L : 2L, this.mStreamType);
    }

    private void onDecodeDone(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3, int i4) {
        if (mDecodeFirstFrameTS == 0) {
            long timeTick = TXCTimeUtil.getTimeTick();
            mDecodeFirstFrameTS = timeTick;
            TXCStatus.m82994a(this.mUserId, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED, this.mStreamType, Long.valueOf(timeTick));
            TXCStatus.m82994a(this.mUserId, ErrorCode.EDIT_AUDIOMIX_FAILED, this.mStreamType, Integer.valueOf(this.mHevc ? 2 : 0));
        }
        InterfaceC14322f interfaceC14322f = this.mDecoderListener;
        if (interfaceC14322f != null) {
            tXSVideoFrame.width = i;
            tXSVideoFrame.height = i2;
            tXSVideoFrame.rotation = i3;
            tXSVideoFrame.pts = j;
            tXSVideoFrame.frameType = i4;
            interfaceC14322f.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            interfaceC14322f.onVideoSizeChange(i, i2);
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
                        TXCLog.m82966e(TAG, "play:decode: start decoder error when decoder is started");
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
                    HandlerC14316a handlerC14316a = new HandlerC14316a(handlerThread.getLooper());
                    handlerC14316a.m84015a(this.mHevc, this.mHWDec, this.mSurface, this.mSps, this.mPps, this, this);
                    TXCLog.m82973w(TAG, "play:decode: start decode thread");
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 100;
                    messageObtain.obj = Boolean.valueOf(this.mNeedSortFrame);
                    handlerC14316a.sendMessage(messageObtain);
                    this.mDecoderHandler = handlerC14316a;
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
                HandlerC14316a handlerC14316a = this.mDecoderHandler;
                if (handlerC14316a != null) {
                    handlerC14316a.sendEmptyMessage(102);
                }
                this.mDecoderHandler = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void stopHWDecoder() {
        InterfaceC14318b interfaceC14318b = this.mVideoDecoder;
        if (interfaceC14318b != null) {
            interfaceC14318b.stop();
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
        InterfaceC14318b interfaceC14318b = this.mVideoDecoder;
        if (interfaceC14318b != null) {
            interfaceC14318b.enableLimitDecCache(z);
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
        HandlerC14316a handlerC14316a = this.mDecoderHandler;
        if (handlerC14316a != null) {
            return handlerC14316a.m84016a();
        }
        return false;
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onDecodeFailed(int i) {
        InterfaceC14322f interfaceC14322f = this.mDecoderListener;
        if (interfaceC14322f != null) {
            interfaceC14322f.onDecodeFailed(i);
        }
        synchronized (this) {
            nativeDecCache(this.mNativeContext);
        }
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onDecodeFrame(TXSVideoFrame tXSVideoFrame, int i, int i2, long j, long j2, int i3) {
        if (mDecodeFirstFrameTS == 0) {
            long timeTick = TXCTimeUtil.getTimeTick();
            mDecodeFirstFrameTS = timeTick;
            TXCStatus.m82994a(this.mUserId, ErrorCode.EDIT_VOICECHANGE_INIT_FAILED, this.mStreamType, Long.valueOf(timeTick));
            TXCStatus.m82994a(this.mUserId, ErrorCode.EDIT_AUDIOMIX_FAILED, this.mStreamType, Integer.valueOf(this.mHevc ? 3 : 1));
        }
        InterfaceC14322f interfaceC14322f = this.mDecoderListener;
        if (interfaceC14322f != null) {
            interfaceC14322f.onDecodeFrame(tXSVideoFrame, i, i2, j, j2, i3);
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
            TXCStatus.m82994a(str, ErrorCode.BGMIX_INIT_AUDIOSOURCE_FAILED, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        } else {
            TXCStatus.m82994a(str, 8003, this.mStreamType, Integer.valueOf(iGetDecodeCost));
        }
    }

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (i == 2106) {
            nativeNotifyHWDecoderError(this.mNativeContext);
        }
        C14052f.m83037a(this.mNotifyListener, this.mUserId, i, bundle);
    }

    @Override // com.tencent.liteav.videodecoder.InterfaceC14322f
    public void onVideoSizeChange(int i, int i2) {
        InterfaceC14322f interfaceC14322f = this.mDecoderListener;
        if (interfaceC14322f != null) {
            if (this.mVideoWidth == i && this.mVideoHeight == i2) {
                return;
            }
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            interfaceC14322f.onVideoSizeChange(i, i2);
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

    public void setListener(InterfaceC14322f interfaceC14322f) {
        this.mDecoderListener = interfaceC14322f;
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        this.mNotifyListener = new WeakReference<>(interfaceC14007b);
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
            TXCLog.m82969i(TAG, "play:decode: start decoder error when not setup surface, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        if (this.mNativeContext != 0) {
            TXCLog.m82973w(TAG, "play:decode: start decoder error when decoder is started, id " + this.mUserId + "_" + this.mStreamType);
            return -1;
        }
        TXCLog.m82973w(TAG, "play:decode: start decoder java id " + this.mUserId + "_" + this.mStreamType + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hashCode());
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
            TXCLog.m82973w(TAG, "play:decode: stop decoder ignore when decoder is stopped, id " + this.mUserId + "_" + this.mStreamType);
            return;
        }
        TXCLog.m82973w(TAG, "play:decode: stop decoder java id " + this.mUserId + "_" + this.mStreamType + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + hashCode());
        nativeDestroyContext(this.mNativeContext);
        this.mNativeContext = 0L;
        this.mNALList.clear();
        this.mRecvFirstFrame = false;
        this.mDecoderCacheNum = 0;
        mDecodeFirstFrameTS = 0L;
        synchronized (this) {
            try {
                InterfaceC14318b interfaceC14318b = this.mVideoDecoder;
                if (interfaceC14318b != null) {
                    interfaceC14318b.stop();
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
    public static class HandlerC14316a extends Handler {

        /* JADX INFO: renamed from: a */
        InterfaceC14318b f59923a;

        /* JADX INFO: renamed from: b */
        InterfaceC14322f f59924b;

        /* JADX INFO: renamed from: c */
        WeakReference<InterfaceC14007b> f59925c;

        /* JADX INFO: renamed from: d */
        boolean f59926d;

        /* JADX INFO: renamed from: e */
        boolean f59927e;

        /* JADX INFO: renamed from: f */
        Surface f59928f;

        /* JADX INFO: renamed from: g */
        private ByteBuffer f59929g;

        /* JADX INFO: renamed from: h */
        private ByteBuffer f59930h;

        public HandlerC14316a(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        private void m84011a(boolean z) {
            InterfaceC14318b interfaceC14318b = this.f59923a;
            boolean z2 = this.f59926d;
            if (interfaceC14318b != null) {
                TXCLog.m82969i(TXCVideoDecoder.TAG, "play:decode: start decode ignore hwdec: " + z2);
                return;
            }
            if (z2) {
                this.f59923a = new C14321e();
            } else {
                this.f59923a = new TXCVideoFfmpegDecoder();
            }
            this.f59923a.setListener(this.f59924b);
            this.f59923a.setNotifyListener(this.f59925c);
            this.f59923a.config(this.f59928f);
            this.f59923a.start(this.f59929g, this.f59930h, z, this.f59927e);
            TXCLog.m82973w(TXCVideoDecoder.TAG, "play:decode: start decode hwdec: " + this.f59926d + ", hevc: " + this.f59927e);
        }

        /* JADX INFO: renamed from: b */
        private void m84014b() {
            InterfaceC14318b interfaceC14318b = this.f59923a;
            if (interfaceC14318b != null) {
                interfaceC14318b.stop();
                this.f59923a.setListener(null);
                this.f59923a.setNotifyListener(null);
                this.f59923a = null;
            }
            Looper.myLooper().quit();
            TXCLog.m82973w(TXCVideoDecoder.TAG, "play:decode: stop decode hwdec: " + this.f59926d);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 100:
                    m84011a(((Boolean) message.obj).booleanValue());
                    break;
                case 101:
                    try {
                        Bundle data = message.getData();
                        m84013a(data.getByteArray("nal"), data.getLong("pts"), data.getLong("dts"), data.getInt("codecId"));
                    } catch (Exception e) {
                        TXCLog.m82966e(TXCVideoDecoder.TAG, "decode frame failed." + e.getMessage());
                        return;
                    }
                    break;
                case 102:
                    m84014b();
                    break;
                case 103:
                    m84012a(message.arg1 == 1, message.arg2 == 1);
                    break;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m84016a() {
            InterfaceC14318b interfaceC14318b = this.f59923a;
            if (interfaceC14318b != null) {
                return interfaceC14318b.isHevc();
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        private void m84013a(byte[] bArr, long j, long j2, int i) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.pts = j;
            tXSNALPacket.dts = j2;
            tXSNALPacket.codecId = i;
            InterfaceC14318b interfaceC14318b = this.f59923a;
            if (interfaceC14318b != null) {
                interfaceC14318b.decode(tXSNALPacket);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m84012a(boolean z, boolean z2) {
            this.f59926d = z;
            TXCLog.m82973w(TXCVideoDecoder.TAG, "play:decode: restart decode hwdec: " + this.f59926d);
            InterfaceC14318b interfaceC14318b = this.f59923a;
            if (interfaceC14318b != null) {
                interfaceC14318b.stop();
                this.f59923a.setListener(null);
                this.f59923a.setNotifyListener(null);
                this.f59923a = null;
            }
            m84011a(z2);
        }

        /* JADX INFO: renamed from: a */
        public void m84015a(boolean z, boolean z2, Surface surface, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, InterfaceC14322f interfaceC14322f, InterfaceC14007b interfaceC14007b) {
            this.f59927e = z;
            this.f59926d = z2;
            this.f59928f = surface;
            this.f59929g = byteBuffer;
            this.f59930h = byteBuffer2;
            this.f59924b = interfaceC14322f;
            this.f59925c = new WeakReference<>(interfaceC14007b);
        }
    }
}
