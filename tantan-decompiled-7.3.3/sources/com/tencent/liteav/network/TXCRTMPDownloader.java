package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class TXCRTMPDownloader extends TXIStreamDownloader {
    private final int MSG_EVENT;
    private final int MSG_RECONNECT;
    private final String TAG;
    private int mConnectCountQuic;
    private int mConnectCountTcp;
    private C14288a mCurrentThread;
    private boolean mEnableNearestIP;
    private Handler mHandler;
    private boolean mHasTcpPlayUrl;
    private boolean mIsPlayRtmpAccStream;
    private int mLastNetworkType;
    private String mPlayUrl;
    private boolean mQuicChannel;
    private Object mRTMPThreadLock;
    private String mServerIp;
    private HandlerThread mThread;
    private Vector<C14312e> mVecPlayUrls;

    public TXCRTMPDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCRTMPDownloader";
        this.MSG_RECONNECT = 101;
        this.MSG_EVENT = 102;
        this.mPlayUrl = "";
        this.mQuicChannel = false;
        this.mServerIp = "";
        this.mCurrentThread = null;
        this.mThread = null;
        this.mHandler = null;
        this.mIsPlayRtmpAccStream = false;
        this.mEnableNearestIP = false;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mLastNetworkType = 0;
        this.mRTMPThreadLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z) {
        Vector<C14312e> vector;
        if (this.mIsRunning) {
            if (this.mIsPlayRtmpAccStream && this.mLastNetworkType != C14215f.m84236e(this.mApplicationContext)) {
                this.mLastNetworkType = C14215f.m84236e(this.mApplicationContext);
                TXIStreamDownloader.InterfaceC14298a interfaceC14298a = this.mRestartListener;
                if (interfaceC14298a != null) {
                    interfaceC14298a.onRestartDownloader();
                    return;
                }
                return;
            }
            boolean z2 = this.mQuicChannel;
            if (this.mIsPlayRtmpAccStream) {
                if (!this.mEnableNearestIP) {
                    z = false;
                }
                if (z2) {
                    z = true;
                }
                if (z && (vector = this.mVecPlayUrls) != null && !vector.isEmpty()) {
                    C14312e c14312e = this.mVecPlayUrls.get(0);
                    this.mVecPlayUrls.remove(0);
                    this.mPlayUrl = c14312e.f60378a;
                    this.mQuicChannel = c14312e.f60379b;
                }
            }
            if (z2 && this.mHasTcpPlayUrl) {
                sendNotifyEvent(2103);
                startInternal();
                return;
            }
            int i = this.connectRetryTimes;
            if (i >= this.connectRetryLimit) {
                TXCLog.m84149e("network.TXCRTMPDownloader", "reconnect all times retried, send failed event ");
                sendNotifyEvent(-2301);
                return;
            }
            this.connectRetryTimes = i + 1;
            TXCLog.m84152i("network.TXCRTMPDownloader", "reconnect retry count:" + this.connectRetryTimes + " limit:" + this.connectRetryLimit);
            sendNotifyEvent(2103);
            startInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native TXCStreamDownloader.DownloadStats nativeGetStats(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpHandler(String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRequestKeyFrame(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStart(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeStop(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpHandler(long j);

    private void postReconnectMsg() {
        Message message = new Message();
        message.what = 101;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, this.connectRetryInterval * 1000);
        }
    }

    private void reconnect(final boolean z) {
        synchronized (this.mRTMPThreadLock) {
            try {
                C14288a c14288a = this.mCurrentThread;
                if (c14288a != null) {
                    c14288a.m84851a();
                    this.mCurrentThread = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCRTMPDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCRTMPDownloader.this.internalReconnect(z);
                }
            }, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternal() {
        if (this.mQuicChannel) {
            this.mConnectCountQuic++;
        } else {
            this.mConnectCountTcp++;
        }
        synchronized (this.mRTMPThreadLock) {
            C14288a c14288a = new C14288a(this.mPlayUrl, this.mQuicChannel);
            this.mCurrentThread = c14288a;
            c14288a.start();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountQuic() {
        return this.mConnectCountQuic;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public int getConnectCountTcp() {
        return this.mConnectCountTcp;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getCurrentStreamUrl() {
        return this.mPlayUrl;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        synchronized (this.mRTMPThreadLock) {
            try {
                C14288a c14288a = this.mCurrentThread;
                if (c14288a == null) {
                    return null;
                }
                return c14288a.m84853b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public boolean isQuicChannel() {
        return this.mQuicChannel;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void requestKeyFrame(String str) {
        synchronized (this.mRTMPThreadLock) {
            try {
                C14288a c14288a = this.mCurrentThread;
                if (c14288a != null) {
                    c14288a.m84852a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i, String str) {
        if (str.isEmpty()) {
            sendNotifyEvent(i);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        InterfaceC14170b interfaceC14170b = this.mNotifyListener;
        if (interfaceC14170b != null) {
            interfaceC14170b.onNotifyEvent(i, bundle);
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<C14312e> vector, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z3;
        this.mEnableMetaData = z4;
        this.mIsPlayRtmpAccStream = z;
        this.mEnableNearestIP = z2;
        this.mVecPlayUrls = vector;
        this.mHasTcpPlayUrl = false;
        for (int i = 0; i < this.mVecPlayUrls.size(); i++) {
            if (!this.mVecPlayUrls.elementAt(i).f60379b) {
                this.mHasTcpPlayUrl = true;
                break;
            }
        }
        C14312e c14312e = this.mVecPlayUrls.get(0);
        this.mVecPlayUrls.remove(0);
        this.mPlayUrl = c14312e.f60378a;
        this.mQuicChannel = c14312e.f60379b;
        this.mIsRunning = true;
        StringBuilder sb = new StringBuilder("start pull with url:");
        sb.append(this.mPlayUrl);
        sb.append(" quic:");
        sb.append(this.mQuicChannel ? "yes" : "no");
        TXCLog.m84152i("network.TXCRTMPDownloader", sb.toString());
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.connectRetryTimes = 0;
        if (this.mThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PULL");
            this.mThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mThread.getLooper()) { // from class: com.tencent.liteav.network.TXCRTMPDownloader.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 101) {
                    TXCRTMPDownloader.this.startInternal();
                }
            }
        };
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            this.mVecPlayUrls.removeAllElements();
            this.mVecPlayUrls = null;
            this.mIsPlayRtmpAccStream = false;
            this.mEnableNearestIP = false;
            TXCLog.m84152i("network.TXCRTMPDownloader", "stop pull");
            synchronized (this.mRTMPThreadLock) {
                try {
                    C14288a c14288a = this.mCurrentThread;
                    if (c14288a != null) {
                        c14288a.m84851a();
                        this.mCurrentThread = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            HandlerThread handlerThread = this.mThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.TXCRTMPDownloader$a */
    public class C14288a extends Thread {

        /* JADX INFO: renamed from: b */
        private long f60282b;

        /* JADX INFO: renamed from: c */
        private String f60283c;

        /* JADX INFO: renamed from: d */
        private boolean f60284d;

        public C14288a(String str, boolean z) {
            super("RTMPDownLoad");
            this.f60282b = 0L;
            this.f60283c = str;
            this.f60284d = z;
        }

        /* JADX INFO: renamed from: a */
        public void m84851a() {
            synchronized (this) {
                try {
                    long j = this.f60282b;
                    if (j != 0) {
                        TXCRTMPDownloader.this.nativeStop(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public TXCStreamDownloader.DownloadStats m84853b() {
            TXCStreamDownloader.DownloadStats downloadStatsNativeGetStats;
            synchronized (this) {
                try {
                    long j = this.f60282b;
                    downloadStatsNativeGetStats = j != 0 ? TXCRTMPDownloader.this.nativeGetStats(j) : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return downloadStatsNativeGetStats;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long jNativeInitRtmpHandler;
            synchronized (this) {
                TXCRTMPDownloader tXCRTMPDownloader = TXCRTMPDownloader.this;
                jNativeInitRtmpHandler = tXCRTMPDownloader.nativeInitRtmpHandler(tXCRTMPDownloader.mUserID, tXCRTMPDownloader.mOriginUrl, this.f60283c, this.f60284d, tXCRTMPDownloader.mEnableMessage, tXCRTMPDownloader.mEnableMetaData);
                this.f60282b = jNativeInitRtmpHandler;
            }
            TXCRTMPDownloader.this.nativeStart(jNativeInitRtmpHandler);
            synchronized (this) {
                TXCRTMPDownloader.this.nativeUninitRtmpHandler(this.f60282b);
                this.f60282b = 0L;
            }
        }

        /* JADX INFO: renamed from: a */
        public void m84852a(String str) {
            synchronized (this) {
                try {
                    long j = this.f60282b;
                    if (j != 0) {
                        TXCRTMPDownloader.this.nativeRequestKeyFrame(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void sendNotifyEvent(int i) {
        if (i != 0 && i != 1) {
            super.sendNotifyEvent(i);
        } else {
            reconnect(i == 1);
        }
    }
}
