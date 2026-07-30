package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class TXCStreamDownloader extends C14203a implements InterfaceC14170b, TXIStreamDownloader.InterfaceC14298a, C14311d.a, InterfaceC14313f {
    public static final String TAG = "TXCStreamDownloader";
    private C14314g mAccUrlFetcher;
    private Context mApplicationContext;
    private int mDownloadFormat;
    private TXIStreamDownloader mDownloader;
    private Handler mHandler;
    protected Map<String, String> mHeaders;
    private InterfaceC14313f mListener = null;
    private byte[] mListenerLock = new byte[0];
    private InterfaceC14170b mNotifyListener = null;
    private boolean mDownloaderRunning = false;
    private String mOriginPlayUrl = "";
    private boolean mEnableNearestIP = false;
    private int mChannelType = 0;
    private boolean mEnableMessage = false;
    private boolean mEnableMetaData = false;
    private String mFlvSessionKey = "";
    private long mLastTimeStamp = 0;
    private DownloadStats mLastDownloadStats = null;
    private boolean mRecvFirstNal = false;
    private long mSwitchStartTime = 0;
    private long mCurrentNalTs = 0;
    private long mLastIFramelTs = 0;
    private C14311d mStreamSwitcher = null;
    private Runnable mReportNetStatusRunnalbe = new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.3
        @Override // java.lang.Runnable
        public void run() {
            TXCStreamDownloader.this.reportNetStatus();
        }
    };

    public static class DownloadStats {
        public long afterParseAudioBytes;
        public long afterParseVideoBytes;
        public long beforeParseAudioBytes;
        public long beforeParseVideoBytes;
        public long connTS;
        public long dnsTS;
        public int errorCode;
        public String errorInfo;
        public long firstAudioTS;
        public long firstVideoTS;
        public String flvSessionKey;
        public String serverIP;
        public long startTS;
        public long videoGop;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.TXCStreamDownloader$a */
    public static class C14292a {

        /* JADX INFO: renamed from: a */
        public String f60291a;

        /* JADX INFO: renamed from: b */
        public String f60292b;

        /* JADX INFO: renamed from: c */
        public String f60293c;

        /* JADX INFO: renamed from: d */
        public int f60294d;

        /* JADX INFO: renamed from: e */
        public String f60295e;

        /* JADX INFO: renamed from: f */
        public boolean f60296f;
    }

    static {
        C14215f.m84239f();
    }

    public TXCStreamDownloader(Context context, int i) {
        this.mDownloader = null;
        this.mDownloadFormat = 1;
        this.mHandler = null;
        if (i == 0) {
            TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(context);
            this.mDownloader = tXCFLVDownloader;
            tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
        } else if (i == 1 || i == 4) {
            this.mDownloader = new TXCRTMPDownloader(context);
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setListener(this);
            this.mDownloader.setNotifyListener(this);
            this.mDownloader.setRestartListener(this);
        }
        this.mDownloadFormat = i;
        this.mAccUrlFetcher = new C14314g(context);
        this.mApplicationContext = context;
        if (context != null) {
            this.mHandler = new Handler(this.mApplicationContext.getMainLooper());
        }
    }

    private DownloadStats getDownloadStats() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            return tXIStreamDownloader.getDownloadStats();
        }
        return null;
    }

    private C14292a getRealTimeStreamInfo() {
        C14292a c14292a;
        C14314g c14314g = this.mAccUrlFetcher;
        if (c14314g == null || TextUtils.isEmpty(c14314g.m84913a())) {
            c14292a = null;
        } else {
            c14292a = new C14292a();
            c14292a.f60292b = this.mAccUrlFetcher.m84913a();
            c14292a.f60293c = this.mAccUrlFetcher.m84914b();
            c14292a.f60294d = this.mAccUrlFetcher.m84915c();
            c14292a.f60295e = this.mAccUrlFetcher.m84916d();
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null && c14292a != null) {
            c14292a.f60291a = tXIStreamDownloader.getCurrentStreamUrl();
            c14292a.f60296f = this.mDownloader.isQuicChannel();
        }
        return c14292a;
    }

    private Long getSpeed(long j, long j2, long j3) {
        if (j <= j2) {
            j2 -= j;
        }
        return Long.valueOf(j3 > 0 ? (j2 * 8000) / (j3 * 1024) : 0L);
    }

    private native String nativeGetRTMPProxyUserId();

    private void playStreamWithRawUrl(String str, boolean z) {
        if (this.mDownloader != null) {
            if (str != null && ((str.startsWith("http://") || str.startsWith("https://")) && str.contains(".flv"))) {
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                int i = tXIStreamDownloader.connectRetryLimit;
                int i2 = tXIStreamDownloader.connectRetryInterval;
                this.mDownloader = null;
                TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext);
                this.mDownloader = tXCFLVDownloader;
                tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                this.mDownloader.setListener(this);
                this.mDownloader.setNotifyListener(this);
                this.mDownloader.setRestartListener(this);
                TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                tXIStreamDownloader2.connectRetryLimit = i;
                tXIStreamDownloader2.connectRetryInterval = i2;
                tXIStreamDownloader2.setHeaders(this.mHeaders);
                this.mDownloader.setUserID(getID());
            }
            setStatusValue(7112, 1L);
            Vector<C14312e> vector = new Vector<>();
            vector.add(new C14312e(str, false));
            this.mDownloader.setOriginUrl(str);
            this.mDownloader.startDownload(vector, false, false, z, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        reportNetStatusInternal();
        this.mHandler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
    }

    private void reportNetStatusInternal() {
        TXCStreamDownloader tXCStreamDownloader;
        long jLongValue;
        long jLongValue2;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j = timeTick - this.mLastTimeStamp;
        DownloadStats downloadStats = getDownloadStats();
        C14292a realTimeStreamInfo = getRealTimeStreamInfo();
        if (downloadStats != null) {
            DownloadStats downloadStats2 = this.mLastDownloadStats;
            if (downloadStats2 != null) {
                tXCStreamDownloader = this;
                jLongValue2 = tXCStreamDownloader.getSpeed(downloadStats2.afterParseVideoBytes, downloadStats.afterParseVideoBytes, j).longValue();
                jLongValue = tXCStreamDownloader.getSpeed(tXCStreamDownloader.mLastDownloadStats.afterParseAudioBytes, downloadStats.afterParseAudioBytes, j).longValue();
            } else {
                tXCStreamDownloader = this;
                jLongValue = 0;
                jLongValue2 = 0;
            }
            if (jLongValue2 > 0 || jLongValue > 0) {
                tXCStreamDownloader.mDownloader.connectRetryTimes = 0;
            }
            tXCStreamDownloader.setStatusValue(7101, Long.valueOf(jLongValue2));
            tXCStreamDownloader.setStatusValue(7102, Long.valueOf(jLongValue));
            tXCStreamDownloader.setStatusValue(7103, Long.valueOf(downloadStats.firstVideoTS));
            tXCStreamDownloader.setStatusValue(7104, Long.valueOf(downloadStats.firstAudioTS));
            tXCStreamDownloader.setStatusValue(7120, Long.valueOf(downloadStats.videoGop));
            if (realTimeStreamInfo != null) {
                tXCStreamDownloader.setStatusValue(7105, Long.valueOf(realTimeStreamInfo.f60294d));
                tXCStreamDownloader.setStatusValue(7106, realTimeStreamInfo.f60295e);
                tXCStreamDownloader.setStatusValue(7111, Long.valueOf(realTimeStreamInfo.f60296f ? 2L : 1L));
                tXCStreamDownloader.setStatusValue(7116, realTimeStreamInfo.f60291a);
                tXCStreamDownloader.setStatusValue(7117, realTimeStreamInfo.f60292b);
                tXCStreamDownloader.setStatusValue(7118, realTimeStreamInfo.f60293c);
            } else {
                tXCStreamDownloader.setStatusValue(7105, Long.valueOf(downloadStats.errorCode));
                tXCStreamDownloader.setStatusValue(7106, downloadStats.errorInfo);
                tXCStreamDownloader.setStatusValue(7111, 1L);
            }
            tXCStreamDownloader.setStatusValue(7107, Long.valueOf(downloadStats.startTS));
            tXCStreamDownloader.setStatusValue(7108, Long.valueOf(downloadStats.dnsTS));
            tXCStreamDownloader.setStatusValue(7109, Long.valueOf(downloadStats.connTS));
            tXCStreamDownloader.setStatusValue(7110, String.valueOf(downloadStats.serverIP));
        } else {
            tXCStreamDownloader = this;
        }
        TXIStreamDownloader tXIStreamDownloader = tXCStreamDownloader.mDownloader;
        if (tXIStreamDownloader != null) {
            int connectCountQuic = tXIStreamDownloader.getConnectCountQuic();
            int connectCountTcp = tXCStreamDownloader.mDownloader.getConnectCountTcp();
            tXCStreamDownloader.setStatusValue(7114, Long.valueOf(connectCountQuic + 1));
            tXCStreamDownloader.setStatusValue(7115, Long.valueOf(connectCountTcp + 1));
            tXCStreamDownloader.setStatusValue(7119, tXCStreamDownloader.mDownloader.getRealStreamUrl());
            tXCStreamDownloader.setStatusValue(7121, String.valueOf(tXCStreamDownloader.mDownloader.getFlvSessionKey()));
        }
        tXCStreamDownloader.mLastTimeStamp = timeTick;
        tXCStreamDownloader.mLastDownloadStats = downloadStats;
    }

    private void tryResetRetryCount() {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryTimes = 0;
        }
    }

    public String getRTMPProxyUserId() {
        return nativeGetRTMPProxyUserId();
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        synchronized (this.mListenerLock) {
            try {
                if (this.mNotifyListener != null) {
                    Bundle bundle2 = new Bundle();
                    if (i == -2308) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejected the connection request");
                    } else if (i == 2012) {
                        byte[] byteArray = bundle.getByteArray(TXLiveConstants.EVT_GET_MSG);
                        if (byteArray != null && byteArray.length > 0) {
                            bundle2.putByteArray(TXLiveConstants.EVT_GET_MSG, byteArray);
                        }
                    } else if (i == 2028 || i == 2031) {
                        bundle2 = bundle;
                    } else if (i == 2103) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "retry connecting stream server");
                    } else if (i == 3010) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "No video at this stream address");
                    } else if (i == -2302) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to get accelerated pull address");
                    } else if (i == -2301) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
                    } else if (i == 2001) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "connection SUCCESS");
                    } else if (i == 2002) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "begine receiving stream");
                    } else if (i == 3002) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
                    } else if (i == 3003) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP handshake failed");
                    } else if (i == 3006) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Write data error");
                    } else if (i != 3007) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN event = " + i);
                    } else {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, "Read data error");
                    }
                    String string = bundle != null ? bundle.getString(TXLiveConstants.EVT_DESCRIPTION, "") : "";
                    if (string != null && !string.isEmpty()) {
                        bundle2.putString(TXLiveConstants.EVT_DESCRIPTION, string);
                    }
                    bundle2.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                    this.mNotifyListener.onNotifyEvent(i, bundle2);
                    if (i == 3001 || i == 3002 || i == 3003 || i == 3004 || i == 3005 || i == 3006 || i == 3007 || i == 3008 || i == 3009 || i == 3010 || i == 2101 || i == 2102 || i == 2109 || i == 2110 || i == -2301 || i == -2304 || i == -2308 || i == -2309) {
                        setStatusValue(7105, Integer.valueOf(i));
                        setStatusValue(7106, bundle2.getString(TXLiveConstants.EVT_DESCRIPTION));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i == 2001) {
            reportNetStatusInternal();
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC14298a
    public void onOldStreamStop() {
        synchronized (this.mListenerLock) {
            try {
                C14311d c14311d = this.mStreamSwitcher;
                if (c14311d != null) {
                    c14311d.m84891b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullAudio(C14204a c14204a) {
        tryResetRetryCount();
        synchronized (this.mListenerLock) {
            try {
                InterfaceC14313f interfaceC14313f = this.mListener;
                if (interfaceC14313f != null) {
                    interfaceC14313f.onPullAudio(c14204a);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushAudioFrame(c14204a.f59307f, c14204a.f59309h, c14204a.f59306e, c14204a.f59308g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14313f
    public void onPullNAL(TXSNALPacket tXSNALPacket) {
        tryResetRetryCount();
        if (!this.mRecvFirstNal) {
            reportNetStatusInternal();
            this.mRecvFirstNal = true;
        }
        synchronized (this.mListenerLock) {
            try {
                long j = tXSNALPacket.pts;
                this.mCurrentNalTs = j;
                if (tXSNALPacket.nalType == 0) {
                    this.mLastIFramelTs = j;
                }
                InterfaceC14313f interfaceC14313f = this.mListener;
                if (interfaceC14313f != null) {
                    interfaceC14313f.onPullNAL(tXSNALPacket);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushVideoFrame(tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.dts, tXSNALPacket.pts, tXSNALPacket.codecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC14298a
    public void onRestartDownloader() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamDownloader.1
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamDownloader.this.stop();
                    TXCStreamDownloader tXCStreamDownloader = TXCStreamDownloader.this;
                    tXCStreamDownloader.start(tXCStreamDownloader.mOriginPlayUrl, TXCStreamDownloader.this.mEnableNearestIP, TXCStreamDownloader.this.mChannelType, TXCStreamDownloader.this.mEnableMessage, TXCStreamDownloader.this.mEnableMetaData);
                }
            });
        }
    }

    @Override // com.tencent.liteav.network.C14311d.a
    public void onSwitchFinish(TXIStreamDownloader tXIStreamDownloader, boolean z) {
        synchronized (this.mListenerLock) {
            try {
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.mSwitchStartTime);
                this.mSwitchStartTime = 0L;
                Bundle bundle = new Bundle();
                bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
                if (z) {
                    this.mDownloader = tXIStreamDownloader;
                    tXIStreamDownloader.setListener(this);
                    this.mDownloader.setNotifyListener(this);
                    this.mDownloader.setRestartListener(this);
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Switched resolution successfully");
                    InterfaceC14170b interfaceC14170b = this.mNotifyListener;
                    if (interfaceC14170b != null) {
                        interfaceC14170b.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C14189a.f59226bw, iCurrentTimeMillis, "");
                } else {
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to switch resolution");
                    InterfaceC14170b interfaceC14170b2 = this.mNotifyListener;
                    if (interfaceC14170b2 != null) {
                        interfaceC14170b2.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C14189a.f59227bx);
                }
                this.mStreamSwitcher = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void requestKeyFrame(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        if (!this.mDownloaderRunning || str == null || !str.startsWith("room") || (tXIStreamDownloader = this.mDownloader) == null) {
            return;
        }
        tXIStreamDownloader.requestKeyFrame(str);
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setFlvSessionKey(str);
        }
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setHeaders(map);
        }
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setUserID(str);
        }
    }

    public void setListener(InterfaceC14313f interfaceC14313f) {
        synchronized (this.mListenerLock) {
            this.mListener = interfaceC14313f;
        }
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        synchronized (this.mListenerLock) {
            this.mNotifyListener = interfaceC14170b;
        }
    }

    public void setRetryInterval(int i) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryInterval = i;
        }
    }

    public void setRetryTimes(int i) {
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.connectRetryLimit = i;
        }
    }

    public int start(final String str, boolean z, int i, final boolean z2, final boolean z3) {
        this.mDownloaderRunning = true;
        this.mRecvFirstNal = false;
        this.mOriginPlayUrl = str;
        this.mEnableNearestIP = z;
        this.mChannelType = i;
        this.mEnableMessage = z2;
        this.mEnableMetaData = z3;
        setStatusValue(7113, 0L);
        setStatusValue(7114, 0L);
        setStatusValue(7115, 0L);
        if (str.startsWith("room")) {
            setStatusValue(7113, 1L);
            setStatusValue(7112, 2L);
            if (this.mDownloader != null) {
                Vector<C14312e> vector = new Vector<>();
                vector.add(new C14312e(str, true));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.setUserID(getID());
                this.mDownloader.startDownload(vector, false, false, z2, z3);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
            }
            return 0;
        }
        if (!z || this.mDownloadFormat != 4) {
            if (this.mDownloader != null) {
                setStatusValue(7112, 1L);
                Vector<C14312e> vector2 = new Vector<>();
                vector2.add(new C14312e(str, false));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.startDownload(vector2, this.mDownloadFormat == 4, z, z2, z3);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
                }
            }
            return 0;
        }
        int iM84912a = this.mAccUrlFetcher.m84912a(str, i, new C14314g.a() { // from class: com.tencent.liteav.network.TXCStreamDownloader.2
            @Override // com.tencent.liteav.network.C14314g.a
            /* JADX INFO: renamed from: a */
            public void mo84854a(int i2, String str2, Vector<C14312e> vector3) {
                String str3;
                if (i2 != 0 || vector3 == null || vector3.isEmpty()) {
                    TXCStreamDownloader.this.onNotifyEvent(-2302, null);
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C14189a.f59187at, i2, str2);
                    TXCLog.m84149e(TXCStreamDownloader.TAG, "getAccelerateStreamPlayUrl failed, play stream with raw url");
                    if (TXCStreamDownloader.this.mDownloaderRunning) {
                        TXCStreamDownloader.this.onNotifyEvent(-2301, null);
                        return;
                    }
                    return;
                }
                boolean z4 = TXCStreamDownloader.this.mDownloaderRunning;
                TXCStreamDownloader tXCStreamDownloader = TXCStreamDownloader.this;
                if (!z4) {
                    TXCDRApi.txReportDAU(tXCStreamDownloader.mApplicationContext, C14189a.f59187at, -4, "livePlayer have been stopped");
                    return;
                }
                if (tXCStreamDownloader.mDownloader != null) {
                    int i3 = 0;
                    for (C14312e c14312e : vector3) {
                        if (c14312e != null && c14312e.f60379b && (str3 = c14312e.f60378a) != null && str3.length() > 0) {
                            i3++;
                        }
                    }
                    TXCStreamDownloader.this.setStatusValue(7113, Long.valueOf(i3));
                    TXCStreamDownloader.this.setStatusValue(7112, 2L);
                    TXCStreamDownloader.this.mDownloader.setOriginUrl(str);
                    TXCStreamDownloader.this.mDownloader.startDownload(vector3, true, true, z2, z3);
                }
                if (TXCStreamDownloader.this.mHandler != null) {
                    TXCStreamDownloader.this.mHandler.postDelayed(TXCStreamDownloader.this.mReportNetStatusRunnalbe, 2000L);
                }
                TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C14189a.f59187at, i2, TXCStreamDownloader.this.mAccUrlFetcher.m84914b());
            }
        });
        if (iM84912a != 0) {
            if (iM84912a == -1) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14189a.f59187at, iM84912a, "invalid playUrl");
            } else if (iM84912a == -2) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14189a.f59187at, iM84912a, "invalid streamID");
            } else if (iM84912a == -3) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14189a.f59187at, iM84912a, "invalid signature");
            }
            TXCLog.m84149e(TAG, "getAccelerateStreamPlayUrl failed, result = " + iM84912a + ", play stream with raw url");
            onNotifyEvent(-2302, null);
            onNotifyEvent(-2301, null);
        }
        return 0;
    }

    public void stop() {
        this.mDownloaderRunning = false;
        this.mRecvFirstNal = false;
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.stopDownload();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mReportNetStatusRunnalbe);
        }
        synchronized (this.mListenerLock) {
            try {
                C14311d c14311d = this.mStreamSwitcher;
                if (c14311d != null) {
                    c14311d.m84890a((InterfaceC14313f) null);
                    this.mStreamSwitcher.m84887a();
                    this.mStreamSwitcher = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean switchStream(String str) {
        TXIStreamDownloader tXIStreamDownloader;
        synchronized (this.mListenerLock) {
            try {
                if (this.mStreamSwitcher == null && (tXIStreamDownloader = this.mDownloader) != null && (tXIStreamDownloader instanceof TXCFLVDownloader)) {
                    TXCFLVDownloader tXCFLVDownloader = new TXCFLVDownloader(this.mApplicationContext, (TXCFLVDownloader) tXIStreamDownloader);
                    TXIStreamDownloader tXIStreamDownloader2 = this.mDownloader;
                    tXCFLVDownloader.connectRetryLimit = tXIStreamDownloader2.connectRetryLimit;
                    tXCFLVDownloader.connectRetryInterval = tXIStreamDownloader2.connectRetryInterval;
                    tXCFLVDownloader.setHeaders(this.mHeaders);
                    tXCFLVDownloader.setUserID(getID());
                    tXCFLVDownloader.setFlvSessionKey(this.mFlvSessionKey);
                    C14311d c14311d = new C14311d(this);
                    this.mStreamSwitcher = c14311d;
                    c14311d.m84890a(this);
                    this.mStreamSwitcher.m84888a(this.mDownloader, tXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, str);
                    this.mSwitchStartTime = System.currentTimeMillis();
                    return true;
                }
                TXCLog.m84156w(TAG, "stream_switch stream is changing ignore this change");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
