package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.ugc.TXRecordCommon;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import java.util.Vector;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public class TXCFLVDownloader extends TXIStreamDownloader {
    private final int CONNECT_TIMEOUT;
    private final int FLV_HEAD_SIZE;
    private final int MAX_FRAME_SIZE;
    private final int MSG_CONNECT;
    private final int MSG_DISCONNECT;
    private final int MSG_QUIT;
    private final int MSG_RECONNECT;
    private final int MSG_RECV_DATA;
    private final int MSG_RESUME;
    private final int MSG_SEEK;
    private final int READ_STREAM_SIZE;
    public final String TAG;
    private HttpURLConnection mConnection;
    private long mContentLength;
    private long mCurrentNalTs;
    private long mDownloadedSize;
    private long mFLVParser;
    private Handler mFlvHandler;
    private HandlerThread mFlvThread;
    private boolean mHandleDataInJava;
    private boolean mHasReceivedFirstAudio;
    private boolean mHasReceivedFirstVideo;
    private InputStream mInputStream;
    private long mLastIFramelTs;
    private byte[] mPacketBytes;
    private String mPlayUrl;
    private boolean mRecvData;
    private long mRefFLVParser;
    private TXCStreamDownloader.DownloadStats mStats;
    private boolean mStopJitter;

    public TXCFLVDownloader(Context context, TXCFLVDownloader tXCFLVDownloader) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mRefFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        if (tXCFLVDownloader != null) {
            this.mRefFLVParser = tXCFLVDownloader.mFLVParser;
            tXCFLVDownloader.mStopJitter = false;
        }
        TXCLog.m82969i("network.TXCFLVDownloader", "new multi flv download " + this);
    }

    private void connect() throws Exception {
        String headerField;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        this.mConnection = (HttpURLConnection) new URL(this.mPlayUrl).openConnection();
        this.mStats.dnsTS = TXCTimeUtil.getTimeTick();
        this.mConnection.setConnectTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
        this.mConnection.setReadTimeout(TXRecordCommon.AUDIO_SAMPLERATE_8000);
        this.mConnection.setRequestProperty("Accept-Encoding", "identity");
        this.mConnection.setInstanceFollowRedirects(true);
        Map<String, String> map = this.mHeaders;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.mConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        this.mConnection.connect();
        int responseCode = this.mConnection.getResponseCode();
        TXCStreamDownloader.DownloadStats downloadStats = this.mStats;
        if (200 == responseCode) {
            downloadStats.connTS = TXCTimeUtil.getTimeTick();
        } else {
            downloadStats.errorCode = this.mConnection.getResponseCode();
        }
        this.mInputStream = this.mConnection.getInputStream();
        this.mPacketBytes = new byte[1388];
        this.mRecvData = false;
        this.mContentLength = this.mConnection.getContentLength();
        this.mDownloadedSize = 0L;
        this.mStats.serverIP = InetAddress.getByName(this.mConnection.getURL().getHost()).getHostAddress();
        sendNotifyEvent(2001);
        this.mStats.flvSessionKey = this.mConnection.getHeaderField("X-Tlive-SpanId");
        if (TextUtils.isEmpty(this.mFlvSessionKey) || (headerField = this.mConnection.getHeaderField(this.mFlvSessionKey)) == null) {
            return;
        }
        TXCLog.m82969i("network.TXCFLVDownloader", "receive flvSessionKey ".concat(headerField));
        sendNotifyEvent(2031, headerField);
    }

    private void disconnect() throws Exception {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            inputStream.close();
            this.mInputStream = null;
        }
    }

    private native void nativeCleanData(long j);

    private native int nativeGetAudioBytes(long j);

    private native int nativeGetVideoBytes(long j);

    private native int nativeGetVideoGop(long j);

    private native long nativeInitFlvHander(String str, int i, boolean z, boolean z2);

    private native long nativeInitFlvHanderByRef(long j);

    private native int nativeParseData(long j, byte[] bArr, int i);

    private native void nativeUninitFlvhander(long j, boolean z);

    private void onRecvFirstAudioData() {
        if (this.mHasReceivedFirstAudio) {
            return;
        }
        this.mHasReceivedFirstAudio = true;
        this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
        TXCLog.m82969i("network.TXCFLVDownloader", "onRecvData: receive first audio with ts " + this.mStats.firstAudioTS);
    }

    private void onRecvFirstVideoData() {
        if (this.mHasReceivedFirstVideo) {
            return;
        }
        this.mHasReceivedFirstVideo = true;
        this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
        TXCLog.m82969i("network.TXCFLVDownloader", "onRecvData: receive first video with ts " + this.mStats.firstVideoTS);
    }

    private void postConnectMsg() {
        this.mInputStream = null;
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mConnection = null;
        }
        Message message = new Message();
        message.what = 100;
        message.arg1 = 0;
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    private void postDisconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessage(102);
        }
    }

    private void postReconnectMsg() {
        Handler handler = this.mFlvHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, this.connectRetryInterval * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgConnect() {
        try {
            connect();
            if (this.mFLVParser == 0) {
                long j = this.mRefFLVParser;
                if (j != 0) {
                    this.mFLVParser = nativeInitFlvHanderByRef(j);
                    this.mRefFLVParser = 0L;
                } else {
                    this.mFLVParser = nativeInitFlvHander(this.mUserID, 0, this.mEnableMessage, this.mEnableMetaData);
                }
            }
            Handler handler = this.mFlvHandler;
            if (handler != null) {
                handler.sendEmptyMessage(101);
            }
        } catch (FileNotFoundException e) {
            TXCLog.m82966e("network.TXCFLVDownloader", "file not found, reconnect");
            e.printStackTrace();
            postReconnectMsg();
        } catch (Error e2) {
            TXCLog.m82966e("network.TXCFLVDownloader", "error, reconnect");
            e2.printStackTrace();
            postReconnectMsg();
        } catch (SocketTimeoutException unused) {
            TXCLog.m82966e("network.TXCFLVDownloader", "socket timeout, reconnect");
            postReconnectMsg();
        } catch (Exception e3) {
            TXCLog.m82966e("network.TXCFLVDownloader", "exception, reconnect");
            e3.printStackTrace();
            postReconnectMsg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgDisConnect() {
        try {
            disconnect();
        } catch (Exception e) {
            TXCLog.m82967e("network.TXCFLVDownloader", "disconnect failed.", e);
        }
        long j = this.mFLVParser;
        if (j != 0) {
            nativeUninitFlvhander(j, this.mStopJitter);
            this.mFLVParser = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgReconnect() {
        if (this.mStopJitter) {
            reconnect();
            return;
        }
        TXCLog.m82969i("network.TXCFLVDownloader", "ignore processMsgReconnect when start multi stream switch" + this);
        TXIStreamDownloader.InterfaceC14135a interfaceC14135a = this.mRestartListener;
        if (interfaceC14135a != null) {
            interfaceC14135a.onOldStreamStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMsgRecvData() {
        InputStream inputStream = this.mInputStream;
        if (inputStream != null) {
            try {
                int iNativeParseData = 0;
                int i = inputStream.read(this.mPacketBytes, 0, 1388);
                if (i > 0) {
                    long j = i;
                    this.mDownloadedSize += j;
                    if (!this.mRecvData) {
                        TXCLog.m82973w("network.TXCFLVDownloader", "flv play receive first data " + this);
                        this.mRecvData = true;
                    }
                    long j2 = this.mFLVParser;
                    if (j2 != 0) {
                        this.mStats.beforeParseVideoBytes += j;
                        iNativeParseData = nativeParseData(j2, this.mPacketBytes, i);
                        this.mStats.afterParseVideoBytes = nativeGetVideoBytes(this.mFLVParser);
                        this.mStats.afterParseAudioBytes = nativeGetAudioBytes(this.mFLVParser);
                        this.mStats.videoGop = nativeGetVideoGop(this.mFLVParser);
                    }
                    if (iNativeParseData > 1048576) {
                        TXCLog.m82966e("network.TXCFLVDownloader", "flv play parse frame: " + iNativeParseData + " > 1048576,sart reconnect");
                        postReconnectMsg();
                        return;
                    }
                } else if (i < 0) {
                    TXCLog.m82973w("network.TXCFLVDownloader", "http read: " + i + " < 0, start reconnect");
                    postReconnectMsg();
                    return;
                }
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(101);
                }
            } catch (EOFException unused) {
                TXCLog.m82973w("network.TXCFLVDownloader", "eof exception start reconnect");
                postReconnectMsg();
            } catch (Error e) {
                TXCLog.m82966e("network.TXCFLVDownloader", "error");
                e.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            } catch (SocketException unused2) {
                TXCLog.m82973w("network.TXCFLVDownloader", "socket exception start reconnect");
                postReconnectMsg();
            } catch (SocketTimeoutException unused3) {
                TXCLog.m82973w("network.TXCFLVDownloader", "socket timeout start reconnect");
                postReconnectMsg();
            } catch (SSLException unused4) {
                TXCLog.m82973w("network.TXCFLVDownloader", "ssl exception start reconnect");
                postReconnectMsg();
            } catch (Exception e2) {
                TXCLog.m82966e("network.TXCFLVDownloader", "exception");
                e2.printStackTrace();
                this.mInputStream = null;
                this.mConnection = null;
            }
        }
    }

    private void reconnect() {
        processMsgDisConnect();
        int i = this.connectRetryTimes;
        if (i >= this.connectRetryLimit) {
            TXCLog.m82966e("network.TXCFLVDownloader", "reconnect all times retried, send failed event ");
            sendNotifyEvent(-2301);
            return;
        }
        this.connectRetryTimes = i + 1;
        TXCLog.m82969i("network.TXCFLVDownloader", "reconnect retry time:" + this.connectRetryTimes + ", limit:" + this.connectRetryLimit);
        processMsgConnect();
        sendNotifyEvent(2103);
    }

    private void startInternal() {
        if (this.mFlvThread == null) {
            HandlerThread handlerThread = new HandlerThread("FlvThread");
            this.mFlvThread = handlerThread;
            handlerThread.start();
        }
        if (this.mFlvHandler == null) {
            this.mFlvHandler = new Handler(this.mFlvThread.getLooper()) { // from class: com.tencent.liteav.network.TXCFLVDownloader.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 106) {
                        try {
                            Looper.myLooper().quit();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    switch (i) {
                        case 100:
                            TXCFLVDownloader.this.processMsgConnect();
                            break;
                        case 101:
                            TXCFLVDownloader.this.processMsgRecvData();
                            break;
                        case 102:
                            TXCFLVDownloader.this.processMsgDisConnect();
                            break;
                        case 103:
                            TXCFLVDownloader.this.processMsgReconnect();
                            break;
                    }
                }
            };
        }
        postConnectMsg();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushAudioFrame(byte[] bArr, int i, long j, int i2) {
        nativePushAudioFrame(this.mFLVParser, bArr, i, j, i2);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void PushVideoFrame(byte[] bArr, int i, long j, long j2, int i2) {
        nativePushVideoFrame(this.mFLVParser, bArr, i, j, j2, i2);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getCurrentTS() {
        return this.mCurrentNalTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        TXCStreamDownloader.DownloadStats downloadStats2 = this.mStats;
        downloadStats.afterParseAudioBytes = downloadStats2.afterParseAudioBytes;
        downloadStats.afterParseVideoBytes = downloadStats2.afterParseVideoBytes;
        downloadStats.beforeParseVideoBytes = downloadStats2.beforeParseVideoBytes;
        downloadStats.beforeParseAudioBytes = downloadStats2.beforeParseAudioBytes;
        downloadStats.videoGop = downloadStats2.videoGop;
        downloadStats.startTS = downloadStats2.startTS;
        downloadStats.dnsTS = downloadStats2.dnsTS;
        downloadStats.connTS = downloadStats2.connTS;
        downloadStats.firstAudioTS = downloadStats2.firstAudioTS;
        downloadStats.firstVideoTS = downloadStats2.firstVideoTS;
        downloadStats.serverIP = downloadStats2.serverIP;
        downloadStats.flvSessionKey = downloadStats2.flvSessionKey;
        downloadStats.errorCode = downloadStats2.errorCode;
        downloadStats.errorInfo = downloadStats2.errorInfo;
        return downloadStats;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public long getLastIFrameTS() {
        return this.mLastIFramelTs;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public String getRealStreamUrl() {
        HttpURLConnection httpURLConnection = this.mConnection;
        if (httpURLConnection != null) {
            return httpURLConnection.getURL().toString();
        }
        return null;
    }

    public native void nativePushAudioFrame(long j, byte[] bArr, int i, long j2, int i2);

    public native void nativePushVideoFrame(long j, byte[] bArr, int i, long j2, long j3, int i2);

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvAudioData(byte[] bArr, int i, int i2, int i3) {
        if (!this.mHasReceivedFirstAudio) {
            this.mHasReceivedFirstAudio = true;
            this.mStats.firstAudioTS = TXCTimeUtil.getTimeTick();
            TXCLog.m82969i("network.TXCFLVDownloader", "receive first audio with ts " + this.mStats.firstAudioTS);
        }
        this.mStats.afterParseAudioBytes += (long) bArr.length;
        super.onRecvAudioData(bArr, i, i2, i3);
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void onRecvVideoData(byte[] bArr, int i, long j, long j2, int i2) {
        if (!this.mHasReceivedFirstVideo) {
            this.mHasReceivedFirstVideo = true;
            this.mStats.firstVideoTS = TXCTimeUtil.getTimeTick();
            TXCLog.m82969i("network.TXCFLVDownloader", "receive first video with ts " + this.mStats.firstVideoTS);
        }
        this.mStats.afterParseVideoBytes += (long) bArr.length;
        super.onRecvVideoData(bArr, i, j, j2, i2);
    }

    public void recvData(boolean z) {
        this.mHandleDataInJava = z;
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void startDownload(Vector<C14149e> vector, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mIsRunning || vector == null || vector.isEmpty()) {
            return;
        }
        this.mEnableMessage = z3;
        this.mEnableMetaData = z4;
        this.mIsRunning = true;
        this.mPlayUrl = vector.get(0).f59530a;
        TXCLog.m82969i("network.TXCFLVDownloader", "start pull with url " + this.mPlayUrl);
        startInternal();
    }

    @Override // com.tencent.liteav.network.TXIStreamDownloader
    public void stopDownload() {
        if (this.mIsRunning) {
            this.mIsRunning = false;
            TXCLog.m82969i("network.TXCFLVDownloader", "stop pull");
            try {
                Handler handler = this.mFlvHandler;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.mFlvHandler.sendEmptyMessage(102);
                    this.mFlvHandler.sendEmptyMessage(106);
                    this.mFlvHandler = null;
                }
            } catch (Exception e) {
                TXCLog.m82967e("network.TXCFLVDownloader", "stop download failed.", e);
            }
        }
    }

    public TXCFLVDownloader(Context context) {
        super(context);
        this.TAG = "network.TXCFLVDownloader";
        this.FLV_HEAD_SIZE = 9;
        this.MAX_FRAME_SIZE = 1048576;
        this.MSG_CONNECT = 100;
        this.MSG_RECV_DATA = 101;
        this.MSG_DISCONNECT = 102;
        this.MSG_RECONNECT = 103;
        this.MSG_SEEK = 104;
        this.MSG_RESUME = 105;
        this.MSG_QUIT = 106;
        this.CONNECT_TIMEOUT = TXRecordCommon.AUDIO_SAMPLERATE_8000;
        this.READ_STREAM_SIZE = 1388;
        this.mFlvThread = null;
        this.mFlvHandler = null;
        this.mInputStream = null;
        this.mConnection = null;
        this.mPacketBytes = null;
        this.mRecvData = false;
        this.mContentLength = 0L;
        this.mDownloadedSize = 0L;
        this.mHandleDataInJava = false;
        this.mFLVParser = 0L;
        this.mRefFLVParser = 0L;
        this.mCurrentNalTs = 0L;
        this.mLastIFramelTs = 0L;
        this.mStopJitter = true;
        this.mPlayUrl = "";
        this.mHasReceivedFirstVideo = false;
        this.mHasReceivedFirstAudio = false;
        this.mStats = null;
        TXCStreamDownloader.DownloadStats downloadStats = new TXCStreamDownloader.DownloadStats();
        this.mStats = downloadStats;
        downloadStats.afterParseAudioBytes = 0L;
        downloadStats.dnsTS = 0L;
        downloadStats.startTS = TXCTimeUtil.getTimeTick();
        TXCLog.m82969i("network.TXCFLVDownloader", "new flv download " + this);
    }
}
