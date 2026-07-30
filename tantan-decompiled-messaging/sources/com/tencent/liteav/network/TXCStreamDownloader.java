package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.C14041a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.rtmp.TXLiveConstants;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class TXCStreamDownloader extends C14040a implements InterfaceC14007b, TXIStreamDownloader.InterfaceC14135a, C14148d.a, InterfaceC14150f {
    public static final String TAG = "TXCStreamDownloader";
    private C14151g mAccUrlFetcher;
    private Context mApplicationContext;
    private int mDownloadFormat;
    private TXIStreamDownloader mDownloader;
    private Handler mHandler;
    protected Map<String, String> mHeaders;
    private InterfaceC14150f mListener = null;
    private byte[] mListenerLock = new byte[0];
    private InterfaceC14007b mNotifyListener = null;
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
    private C14148d mStreamSwitcher = null;
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
    public static class C14129a {

        /* JADX INFO: renamed from: a */
        public String f59443a;

        /* JADX INFO: renamed from: b */
        public String f59444b;

        /* JADX INFO: renamed from: c */
        public String f59445c;

        /* JADX INFO: renamed from: d */
        public int f59446d;

        /* JADX INFO: renamed from: e */
        public String f59447e;

        /* JADX INFO: renamed from: f */
        public boolean f59448f;
    }

    static {
        C14052f.m83056f();
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
        this.mAccUrlFetcher = new C14151g(context);
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

    private C14129a getRealTimeStreamInfo() {
        C14129a c14129a;
        C14151g c14151g = this.mAccUrlFetcher;
        if (c14151g == null || TextUtils.isEmpty(c14151g.m83730a())) {
            c14129a = null;
        } else {
            c14129a = new C14129a();
            c14129a.f59444b = this.mAccUrlFetcher.m83730a();
            c14129a.f59445c = this.mAccUrlFetcher.m83731b();
            c14129a.f59446d = this.mAccUrlFetcher.m83732c();
            c14129a.f59447e = this.mAccUrlFetcher.m83733d();
        }
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null && c14129a != null) {
            c14129a.f59443a = tXIStreamDownloader.getCurrentStreamUrl();
            c14129a.f59448f = this.mDownloader.isQuicChannel();
        }
        return c14129a;
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
            Vector<C14149e> vector = new Vector<>();
            vector.add(new C14149e(str, false));
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
        C14129a realTimeStreamInfo = getRealTimeStreamInfo();
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
                tXCStreamDownloader.setStatusValue(7105, Long.valueOf(realTimeStreamInfo.f59446d));
                tXCStreamDownloader.setStatusValue(7106, realTimeStreamInfo.f59447e);
                tXCStreamDownloader.setStatusValue(7111, Long.valueOf(realTimeStreamInfo.f59448f ? 2L : 1L));
                tXCStreamDownloader.setStatusValue(7116, realTimeStreamInfo.f59443a);
                tXCStreamDownloader.setStatusValue(7117, realTimeStreamInfo.f59444b);
                tXCStreamDownloader.setStatusValue(7118, realTimeStreamInfo.f59445c);
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

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
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

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC14135a
    public void onOldStreamStop() {
        synchronized (this.mListenerLock) {
            try {
                C14148d c14148d = this.mStreamSwitcher;
                if (c14148d != null) {
                    c14148d.m83708b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
    public void onPullAudio(C14041a c14041a) {
        tryResetRetryCount();
        synchronized (this.mListenerLock) {
            try {
                InterfaceC14150f interfaceC14150f = this.mListener;
                if (interfaceC14150f != null) {
                    interfaceC14150f.onPullAudio(c14041a);
                }
                TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
                if (tXIStreamDownloader != null) {
                    tXIStreamDownloader.PushAudioFrame(c14041a.f58459f, c14041a.f58461h, c14041a.f58458e, c14041a.f58460g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.network.InterfaceC14150f
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
                InterfaceC14150f interfaceC14150f = this.mListener;
                if (interfaceC14150f != null) {
                    interfaceC14150f.onPullNAL(tXSNALPacket);
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

    @Override // com.tencent.liteav.network.TXIStreamDownloader.InterfaceC14135a
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

    @Override // com.tencent.liteav.network.C14148d.a
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
                    InterfaceC14007b interfaceC14007b = this.mNotifyListener;
                    if (interfaceC14007b != null) {
                        interfaceC14007b.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C14026a.f58378bw, iCurrentTimeMillis, "");
                } else {
                    bundle.putInt("EVT_ID", 2015);
                    bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Failed to switch resolution");
                    InterfaceC14007b interfaceC14007b2 = this.mNotifyListener;
                    if (interfaceC14007b2 != null) {
                        interfaceC14007b2.onNotifyEvent(2015, bundle);
                    }
                    TXCDRApi.txReportDAU(this.mApplicationContext, C14026a.f58379bx);
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

    @Override // com.tencent.liteav.basic.module.C14040a
    public void setID(String str) {
        super.setID(str);
        TXIStreamDownloader tXIStreamDownloader = this.mDownloader;
        if (tXIStreamDownloader != null) {
            tXIStreamDownloader.setUserID(str);
        }
    }

    public void setListener(InterfaceC14150f interfaceC14150f) {
        synchronized (this.mListenerLock) {
            this.mListener = interfaceC14150f;
        }
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        synchronized (this.mListenerLock) {
            this.mNotifyListener = interfaceC14007b;
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
                Vector<C14149e> vector = new Vector<>();
                vector.add(new C14149e(str, true));
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
                Vector<C14149e> vector2 = new Vector<>();
                vector2.add(new C14149e(str, false));
                this.mDownloader.setOriginUrl(str);
                this.mDownloader.startDownload(vector2, this.mDownloadFormat == 4, z, z2, z3);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.postDelayed(this.mReportNetStatusRunnalbe, 2000L);
                }
            }
            return 0;
        }
        int iM83729a = this.mAccUrlFetcher.m83729a(str, i, new C14151g.a() { // from class: com.tencent.liteav.network.TXCStreamDownloader.2
            @Override // com.tencent.liteav.network.C14151g.a
            /* JADX INFO: renamed from: a */
            public void mo83671a(int i2, String str2, Vector<C14149e> vector3) {
                String str3;
                if (i2 != 0 || vector3 == null || vector3.isEmpty()) {
                    TXCStreamDownloader.this.onNotifyEvent(-2302, null);
                    TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C14026a.f58339at, i2, str2);
                    TXCLog.m82966e(TXCStreamDownloader.TAG, "getAccelerateStreamPlayUrl failed, play stream with raw url");
                    if (TXCStreamDownloader.this.mDownloaderRunning) {
                        TXCStreamDownloader.this.onNotifyEvent(-2301, null);
                        return;
                    }
                    return;
                }
                boolean z4 = TXCStreamDownloader.this.mDownloaderRunning;
                TXCStreamDownloader tXCStreamDownloader = TXCStreamDownloader.this;
                if (!z4) {
                    TXCDRApi.txReportDAU(tXCStreamDownloader.mApplicationContext, C14026a.f58339at, -4, "livePlayer have been stopped");
                    return;
                }
                if (tXCStreamDownloader.mDownloader != null) {
                    int i3 = 0;
                    for (C14149e c14149e : vector3) {
                        if (c14149e != null && c14149e.f59531b && (str3 = c14149e.f59530a) != null && str3.length() > 0) {
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
                TXCDRApi.txReportDAU(TXCStreamDownloader.this.mApplicationContext, C14026a.f58339at, i2, TXCStreamDownloader.this.mAccUrlFetcher.m83731b());
            }
        });
        if (iM83729a != 0) {
            if (iM83729a == -1) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14026a.f58339at, iM83729a, "invalid playUrl");
            } else if (iM83729a == -2) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14026a.f58339at, iM83729a, "invalid streamID");
            } else if (iM83729a == -3) {
                TXCDRApi.txReportDAU(this.mApplicationContext, C14026a.f58339at, iM83729a, "invalid signature");
            }
            TXCLog.m82966e(TAG, "getAccelerateStreamPlayUrl failed, result = " + iM83729a + ", play stream with raw url");
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
                C14148d c14148d = this.mStreamSwitcher;
                if (c14148d != null) {
                    c14148d.m83707a((InterfaceC14150f) null);
                    this.mStreamSwitcher.m83704a();
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
                    C14148d c14148d = new C14148d(this);
                    this.mStreamSwitcher = c14148d;
                    c14148d.m83707a(this);
                    this.mStreamSwitcher.m83705a(this.mDownloader, tXCFLVDownloader, this.mCurrentNalTs, this.mLastIFramelTs, str);
                    this.mSwitchStartTime = System.currentTimeMillis();
                    return true;
                }
                TXCLog.m82973w(TAG, "stream_switch stream is changing ignore this change");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
