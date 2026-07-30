package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.core.glcore.util.ErrorCode;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.UserId;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.open.SocialConstants;
import com.tencent.rtmp.TXLiveConstants;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TXCStreamUploader extends C14203a implements InterfaceC14309b {
    public static final int RTMPSENDSTRATEGY_LIVE = 1;
    public static final int RTMPSENDSTRATEGY_REALTIME_QUIC = 3;
    public static final int RTMPSENDSTRATEGY_REALTIME_TCP = 2;
    static final String TAG = "TXCStreamUploader";
    public static final int TXE_UPLOAD_MODE_AUDIO_ONLY = 1;
    public static final int TXE_UPLOAD_MODE_LINK_MIC = 2;
    public static final int TXE_UPLOAD_MODE_REAL_TIME = 0;
    public static final int TXE_UPLOAD_PROTOCOL_AV = 1;
    public static final int TXE_UPLOAD_PROTOCOL_RTMP = 0;
    private Context mContext;
    private int mCurrentRecordIdx;
    private HandlerThread mHandlerThread;
    private C14310c mIntelligentRoute;
    private ArrayList<C14299a> mIpList;
    private boolean mIsPushing;
    private int mLastNetworkType;
    HashMap<String, String> mMetaData;
    private C14315h mParam;
    private int mRetryCount;
    private String mRtmpUrl;
    private Thread mThread;
    private Object mThreadLock;
    private C14317j mUploadQualityReport;
    private long mUploaderInstance;
    private boolean mQuicChannel = false;
    private int mChannelType = 0;
    private boolean mEnableNearestIP = true;
    private WeakReference<InterfaceC14170b> mNotifyListener = null;
    private long mConnectSuccessTimeStamps = 0;
    private long mGoodPushTime = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    private Handler mHandler = null;
    private final int MSG_RECONNECT = 101;
    private final int MSG_EVENT = 102;
    private final int MSG_REPORT_STATUS = 103;
    private final int MSG_RTMPPROXY_HEARTBEAT = 104;
    private long mLastTimeStamp = 0;
    private UploadStats mLastUploadStats = null;
    private Vector<TXSNALPacket> mVecPendingNAL = new Vector<>();
    private int mConnectCountQuic = 0;
    private int mConnectCountTcp = 0;
    private boolean mRtmpProxyEnable = false;
    private boolean mAudioMuted = false;
    private C14296a mRtmpProxyParam = new C14296a();
    private Vector<String> mRtmpProxyIPList = new Vector<>();
    private int mRtmpProxyIPIndex = 0;
    private long mRtmpProxyInstance = 0;
    private long mRtmpMsgRecvThreadInstance = 0;
    private Object mRtmpProxyLock = new Object();
    private Object mRtmpMsgRecvThreadLock = new Object();

    public class RtmpProxyUserInfo {
        public String account = "";
        public String playUrl = "";
        public int stmType = 0;

        public RtmpProxyUserInfo() {
        }
    }

    public class UploadStats {
        public long audioCacheLen;
        public long audioDropCount;
        public long bandwidthEst;
        public long channelType;
        public long connTS;
        public long connectTimeCost;
        public String connectionID;
        public String connectionStats;
        public long dnsTS;
        public long dnsparseTimeCost;
        public long handshakeTimeCost;
        public long inAudioBytes;
        public long inVideoBytes;
        public long outAudioBytes;
        public long outVideoBytes;
        public String serverIP;
        public long startTS;
        public long videoCacheLen;
        public long videoDropCount;

        public UploadStats() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.TXCStreamUploader$a */
    public class C14296a {

        /* JADX INFO: renamed from: a */
        public long f60303a;

        /* JADX INFO: renamed from: b */
        public long f60304b;

        /* JADX INFO: renamed from: c */
        public String f60305c;

        /* JADX INFO: renamed from: d */
        public long f60306d;

        /* JADX INFO: renamed from: e */
        public String f60307e;

        /* JADX INFO: renamed from: f */
        public long f60308f;

        /* JADX INFO: renamed from: g */
        public long f60309g;

        /* JADX INFO: renamed from: h */
        public String f60310h;

        /* JADX INFO: renamed from: i */
        public boolean f60311i;

        /* JADX INFO: renamed from: j */
        public String f60312j;

        public C14296a() {
        }

        /* JADX INFO: renamed from: a */
        public void m84855a() {
            this.f60303a = 0L;
            this.f60304b = 0L;
            this.f60305c = "";
            this.f60306d = 0L;
            this.f60307e = "";
            this.f60308f = 0L;
            this.f60309g = 0L;
            this.f60311i = false;
            this.f60312j = "";
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.network.TXCStreamUploader$b */
    public class C14297b {

        /* JADX INFO: renamed from: a */
        public String f60314a;

        /* JADX INFO: renamed from: b */
        public boolean f60315b;

        public C14297b(String str, boolean z) {
            this.f60314a = str;
            this.f60315b = z;
        }
    }

    static {
        C14215f.m84239f();
    }

    public TXCStreamUploader(Context context, C14315h c14315h) {
        this.mUploaderInstance = 0L;
        this.mThread = null;
        this.mThreadLock = null;
        this.mIsPushing = false;
        this.mRtmpUrl = "";
        this.mIntelligentRoute = null;
        this.mLastNetworkType = 0;
        this.mContext = null;
        this.mIpList = null;
        this.mCurrentRecordIdx = 0;
        this.mRetryCount = 0;
        this.mHandlerThread = null;
        this.mParam = null;
        this.mUploadQualityReport = null;
        this.mContext = context;
        if (c14315h == null) {
            c14315h = new C14315h();
            c14315h.f60409a = 0;
            c14315h.f60414f = 3;
            c14315h.f60413e = 3;
            c14315h.f60415g = 40;
            c14315h.f60416h = 1000;
            c14315h.f60417i = true;
        }
        this.mParam = c14315h;
        this.mThreadLock = new Object();
        C14310c c14310c = new C14310c();
        this.mIntelligentRoute = c14310c;
        c14310c.f60342a = this;
        this.mUploaderInstance = 0L;
        this.mRetryCount = 0;
        this.mCurrentRecordIdx = 0;
        this.mIpList = null;
        this.mIsPushing = false;
        this.mThread = null;
        this.mRtmpUrl = null;
        this.mLastNetworkType = 0;
        this.mHandlerThread = null;
        this.mUploadQualityReport = new C14317j(context);
        C14316i.m84918a().m84923a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAddressFromUrl(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        return (str == null || (iIndexOf = str.indexOf("://")) == -1 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf + 3)).indexOf("/")) == -1) ? "" : strSubstring.substring(0, iIndexOf2);
    }

    private boolean getNextRtmpProxyIP() {
        C14296a c14296a = this.mRtmpProxyParam;
        c14296a.f60308f = 234L;
        c14296a.f60309g = 80L;
        Vector<String> vector = this.mRtmpProxyIPList;
        if (vector == null || vector.size() <= 0) {
            return false;
        }
        if (this.mRtmpProxyIPIndex >= this.mRtmpProxyIPList.size()) {
            this.mRtmpProxyIPIndex = 0;
            return false;
        }
        String[] strArrSplit = this.mRtmpUrl.split("://");
        if (strArrSplit.length < 2) {
            return false;
        }
        String str = strArrSplit[1];
        String strSubstring = str.substring(str.indexOf("/"));
        String str2 = this.mRtmpProxyIPList.get(this.mRtmpProxyIPIndex);
        this.mRtmpProxyParam.f60310h = str2;
        this.mRtmpUrl = "room://" + str2 + strSubstring;
        this.mQuicChannel = true;
        this.mRtmpProxyIPIndex = this.mRtmpProxyIPIndex + 1;
        return true;
    }

    private HashMap getParamsFromUrl(String str) {
        String str2;
        HashMap map = new HashMap();
        String[] strArrSplit = str.split("[?]");
        if (strArrSplit != null && strArrSplit.length >= 2 && (str2 = strArrSplit[1]) != null && str2.length() != 0) {
            for (String str3 : strArrSplit[1].split("[&]")) {
                if (str3.indexOf("=") != -1) {
                    String[] strArrSplit2 = str3.split("[=]");
                    if (strArrSplit2.length == 2) {
                        map.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            }
        }
        return map;
    }

    private C14297b getRtmpRealConnectInfo() {
        int i;
        if (!this.mEnableNearestIP) {
            return new C14297b(this.mRtmpUrl, false);
        }
        ArrayList<C14299a> arrayList = this.mIpList;
        if (arrayList == null) {
            return new C14297b(this.mRtmpUrl, false);
        }
        if (this.mCurrentRecordIdx >= arrayList.size() || (i = this.mCurrentRecordIdx) < 0) {
            return new C14297b(this.mRtmpUrl, false);
        }
        C14299a c14299a = this.mIpList.get(i);
        String[] strArrSplit = this.mRtmpUrl.split("://");
        if (strArrSplit.length < 2) {
            return new C14297b(this.mRtmpUrl, false);
        }
        String[] strArrSplit2 = strArrSplit[1].split("/");
        if (c14299a.f60317a.split(":").length <= 1 || c14299a.f60317a.startsWith("[")) {
            strArrSplit2[0] = c14299a.f60317a + ":" + c14299a.f60318b;
        } else {
            strArrSplit2[0] = "[" + c14299a.f60317a + "]:" + c14299a.f60318b;
        }
        StringBuilder sb = new StringBuilder(strArrSplit2[0]);
        for (int i2 = 1; i2 < strArrSplit2.length; i2++) {
            sb.append("/");
            sb.append(strArrSplit2[i2]);
        }
        return new C14297b(strArrSplit[0] + "://" + sb.toString(), c14299a.f60319c);
    }

    private Long getSpeed(long j, long j2, long j3) {
        if (j <= j2) {
            j2 -= j;
        }
        return Long.valueOf(j3 > 0 ? (j2 * 8000) / (j3 * 1024) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalReconnect(boolean z) {
        if (this.mIsPushing) {
            if (this.mRtmpProxyEnable) {
                if (this.mLastNetworkType != C14215f.m84236e(this.mContext)) {
                    TXCLog.m84149e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + C14215f.m84236e(this.mContext));
                    this.mLastNetworkType = C14215f.m84236e(this.mContext);
                    this.mRetryCount = 0;
                    Monitor.m84161a(2, "WebrtcRoom: need enter again by user", "", 0);
                    sendNotifyEvent(1021, String.format("Network type has changed. Need to re-enter the room", new Object[0]));
                    return;
                }
                int i = this.mRetryCount;
                if (i >= this.mParam.f60413e) {
                    if (!getNextRtmpProxyIP()) {
                        TXCEventRecorderProxy.m84163a(this.mRtmpUrl, 91002, -1L, -1L, "connect rtmp-proxy server failed(try all addresses)", 0);
                        sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                        return;
                    } else {
                        this.mRetryCount = 0;
                        Monitor.m84161a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f60310h, 0, Integer.valueOf(this.mParam.f60413e)), "", 0);
                        sendNotifyEvent(1102);
                        startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                        return;
                    }
                }
                int i2 = i + 1;
                this.mRetryCount = i2;
                Monitor.m84161a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]", this.mRtmpProxyParam.f60310h, Integer.valueOf(i2), Integer.valueOf(this.mParam.f60413e)), "", 0);
                TXCEventRecorderProxy.m84163a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect rtmp-proxy server(econnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f60413e + ")", 0);
                sendNotifyEvent(1102);
                startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
                return;
            }
            this.mUploadQualityReport.m84940c();
            if (this.mEnableNearestIP && this.mLastNetworkType != C14215f.m84236e(this.mContext)) {
                TXCLog.m84149e(TAG, "reconnect network switch from " + this.mLastNetworkType + " to " + C14215f.m84236e(this.mContext));
                this.mLastNetworkType = C14215f.m84236e(this.mContext);
                this.mIntelligentRoute.m84884a(this.mRtmpUrl, this.mChannelType);
                this.mRetryCount = 0;
                return;
            }
            boolean z2 = !this.mEnableNearestIP ? false : z;
            if (this.mQuicChannel) {
                z2 = true;
            }
            if (z2 && !nextRecordIdx(true)) {
                TXCLog.m84149e(TAG, "reconnect: try all addresses failed");
                TXCEventRecorderProxy.m84163a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all addresses failed)", 0);
            }
            C14297b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            String addressFromUrl = getAddressFromUrl(rtmpRealConnectInfo.f60314a);
            StringBuilder sb = new StringBuilder("reconnect change ip: ");
            sb.append(addressFromUrl);
            sb.append(" enableNearestIP: ");
            sb.append(this.mEnableNearestIP);
            sb.append(" last channel type: ");
            sb.append(this.mQuicChannel ? "Q Channel" : "TCP");
            TXCLog.m84149e(TAG, sb.toString());
            if (this.mQuicChannel) {
                TXCLog.m84149e(TAG, "reconnect last channel type is Q Channel，ignore retry limit");
                Monitor.m84161a(2, String.format("Network: reconnecting to upload server with quic.[addr:%s]", addressFromUrl), "", 0);
                startPushTask(rtmpRealConnectInfo.f60314a, rtmpRealConnectInfo.f60315b, 0);
                sendNotifyEvent(1102);
                return;
            }
            TXCLog.m84149e(TAG, "reconnect retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f60413e);
            int i3 = this.mRetryCount;
            if (i3 >= this.mParam.f60413e) {
                TXCLog.m84149e(TAG, "reconnect: try all times failed");
                TXCEventRecorderProxy.m84163a(this.mRtmpUrl, 91002, -1L, -1L, "connect upload server failed(try all times failed)", 0);
                sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NET_ALLADDRESS_FAIL);
                return;
            }
            int i4 = i3 + 1;
            this.mRetryCount = i4;
            Monitor.m84161a(2, String.format("Network: reconnecting to upload server with tcp.[addr:%s][retryCount:%d][retryLimit:%d]", addressFromUrl, Integer.valueOf(i4), Integer.valueOf(this.mParam.f60413e)), "", 0);
            TXCEventRecorderProxy.m84163a(this.mRtmpUrl, 91003, -1L, -1L, "reconnect upload server:(retry count:" + this.mRetryCount + " retry limit:" + this.mParam.f60413e + ")", 0);
            startPushTask(rtmpRealConnectInfo.f60314a, rtmpRealConnectInfo.f60315b, 0);
            sendNotifyEvent(1102);
        }
    }

    private boolean isQCloudStreamUrl(String str) {
        int iIndexOf;
        return (str == null || str.length() == 0 || (iIndexOf = str.indexOf("://")) == -1 || !str.substring(iIndexOf + 3).startsWith("cloud.tencent.com")) ? false : true;
    }

    private native void nativeCacheJNIParams();

    private native void nativeEnableDrop(long j, boolean z);

    private native UploadStats nativeGetStats(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpMsgRecvThreadInstance(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitRtmpProxyInstance(long j, long j2, String str, long j3, String str2, long j4, long j5, String str3, boolean z, String str4);

    /* JADX INFO: Access modifiers changed from: private */
    public native long nativeInitUploader(String str, String str2, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2, int i8, HashMap<String, String> map);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnThreadRun(long j);

    private native void nativePushAAC(long j, byte[] bArr, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativePushNAL(long j, byte[] bArr, int i, long j2, long j3, long j4);

    private native void nativeReleaseJNIParams();

    private native void nativeRtmpMsgRecvThreadStart(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRtmpMsgRecvThreadStop(long j);

    private native void nativeRtmpProxyEnterRoom(long j);

    private native void nativeRtmpProxyLeaveRoom(long j);

    private native void nativeRtmpProxySendHeartBeat(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11);

    private native void nativeSendRtmpProxyMsg(long j, byte[] bArr);

    private native void nativeSetSendStrategy(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetVideoDropParams(long j, boolean z, int i, int i2);

    private native void nativeStopPush(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpMsgRecvThreadInstance(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitRtmpProxyInstance(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUninitUploader(long j);

    private boolean nextRecordIdx(boolean z) {
        ArrayList<C14299a> arrayList = this.mIpList;
        if (arrayList != null && arrayList.size() != 0) {
            if (z) {
                this.mIpList.get(this.mCurrentRecordIdx).f60321e++;
            }
            if (this.mCurrentRecordIdx + 1 < this.mIpList.size()) {
                this.mCurrentRecordIdx++;
                return true;
            }
        }
        return false;
    }

    private void onRtmpProxyRoomEvent(int i, int i2) {
        if (i == 1) {
            sendNotifyEvent(1018, String.format("Already in room，[%d]", Integer.valueOf(i2)));
        } else if (i == 2) {
            sendNotifyEvent(1019, String.format("Not in the room，[%d]", Integer.valueOf(i2)));
        }
    }

    private void onRtmpProxyUserListPushed(RtmpProxyUserInfo[] rtmpProxyUserInfoArr) {
        if (rtmpProxyUserInfoArr != null && this.mIsPushing && this.mRtmpProxyEnable && this.mRtmpProxyParam != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < rtmpProxyUserInfoArr.length; i++) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(UserId.TYPE, rtmpProxyUserInfoArr[i].account);
                    jSONObject.put(SocialConstants.PARAM_PLAY_URL, rtmpProxyUserInfoArr[i].playUrl);
                    if (rtmpProxyUserInfoArr[i].stmType == 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray2.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("userlist", jSONArray);
                jSONObject2.put("userlist_aux", jSONArray2);
                sendNotifyEvent(1020, jSONObject2.toString());
            } catch (Exception e) {
                TXCLog.m84150e(TAG, "build json object failed.", e);
            }
        }
    }

    private void onSendRtmpProxyMsg(byte[] bArr) {
        synchronized (this.mThreadLock) {
            try {
                long j = this.mUploaderInstance;
                if (j != 0) {
                    nativeSendRtmpProxyMsg(j, bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void parseProxyInfo(String str) {
        if (str == null || str.length() == 0 || !str.startsWith("room")) {
            return;
        }
        this.mRtmpProxyParam.f60311i = isQCloudStreamUrl(str);
        HashMap paramsFromUrl = getParamsFromUrl(str);
        if (paramsFromUrl == null) {
            return;
        }
        if (paramsFromUrl.containsKey("sdkappid")) {
            this.mRtmpProxyParam.f60303a = Long.valueOf((String) paramsFromUrl.get("sdkappid")).longValue();
        }
        if (paramsFromUrl.containsKey("roomid") && paramsFromUrl.containsKey(UserId.TYPE) && paramsFromUrl.containsKey("roomsig")) {
            this.mRtmpProxyParam.f60306d = Long.valueOf((String) paramsFromUrl.get("roomid")).longValue();
            this.mRtmpProxyParam.f60305c = (String) paramsFromUrl.get(UserId.TYPE);
            if (paramsFromUrl.containsKey("bizbuf")) {
                try {
                    this.mRtmpProxyParam.f60312j = URLDecoder.decode((String) paramsFromUrl.get("bizbuf"), "UTF-8");
                } catch (Exception e) {
                    TXCLog.m84150e(TAG, "decode bizbuf failed.", e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((String) paramsFromUrl.get("roomsig"), "UTF-8"));
                this.mRtmpProxyParam.f60304b = 0L;
                if (jSONObject.has("Key")) {
                    this.mRtmpProxyParam.f60307e = jSONObject.optString("Key");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("RtmpProxy");
                    if (jSONObjectOptJSONObject == null || (jSONObjectOptJSONObject.has("Ip") && jSONObjectOptJSONObject.has("Port") && jSONObjectOptJSONObject.has("Type"))) {
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("AccessList");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                                if (jSONObject2 != null && jSONObject2.has("Ip") && jSONObject2.has("Port") && jSONObject2.has("Type")) {
                                    String strOptString = jSONObject2.optString("Ip");
                                    long jOptLong = jSONObject2.optLong("Port");
                                    if (jSONObject2.optLong("Type") == 2) {
                                        this.mRtmpProxyIPList.add(strOptString + ":" + jOptLong);
                                    }
                                }
                            }
                        }
                        if (!this.mRtmpProxyParam.f60311i) {
                            this.mRtmpUrl = str;
                            this.mQuicChannel = false;
                        } else {
                            if (jSONObjectOptJSONObject == null) {
                                return;
                            }
                            this.mRtmpUrl = str.substring(0, str.indexOf("?")) + "/webrtc/" + (this.mRtmpProxyParam.f60303a + "_" + this.mRtmpProxyParam.f60306d + "_" + this.mRtmpProxyParam.f60305c) + "?real_rtmp_ip=" + jSONObjectOptJSONObject.optString("Ip") + "&real_rtmp_port=" + jSONObjectOptJSONObject.optLong("Port") + "&tinyid=" + this.mRtmpProxyParam.f60304b + "&srctinyid=0";
                            getNextRtmpProxyIP();
                        }
                        this.mRtmpProxyEnable = true;
                    }
                }
            } catch (Exception e2) {
                TXCLog.m84150e(TAG, "parse proxy info failed.", e2);
            }
        }
    }

    private void postReconnectMsg(String str, boolean z, int i) {
        Message message = new Message();
        message.what = 101;
        message.obj = str;
        message.arg1 = z ? 2 : 1;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessageDelayed(message, i);
        }
    }

    private void reconnect(final boolean z) {
        stopPushTask();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.tencent.liteav.network.TXCStreamUploader.3
                @Override // java.lang.Runnable
                public void run() {
                    TXCStreamUploader.this.internalReconnect(z);
                }
            }, this.mParam.f60414f * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNetStatus() {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long timeTick = TXCTimeUtil.getTimeTick();
        long j = timeTick - this.mLastTimeStamp;
        UploadStats uploadStats = getUploadStats();
        long j2 = 0;
        if (uploadStats != null) {
            UploadStats uploadStats2 = this.mLastUploadStats;
            if (uploadStats2 != null) {
                long jLongValue4 = getSpeed(uploadStats2.inVideoBytes, uploadStats.inVideoBytes, j).longValue();
                jLongValue2 = getSpeed(this.mLastUploadStats.inAudioBytes, uploadStats.inAudioBytes, j).longValue();
                jLongValue3 = getSpeed(this.mLastUploadStats.outVideoBytes, uploadStats.outVideoBytes, j).longValue();
                jLongValue = getSpeed(this.mLastUploadStats.outAudioBytes, uploadStats.outAudioBytes, j).longValue();
                j2 = jLongValue4;
            } else {
                jLongValue = 0;
                jLongValue2 = 0;
                jLongValue3 = 0;
            }
            setStatusValue(7005, Long.valueOf(uploadStats.videoCacheLen));
            setStatusValue(7006, Long.valueOf(uploadStats.audioCacheLen));
            setStatusValue(7007, Long.valueOf(uploadStats.videoDropCount));
            setStatusValue(7008, Long.valueOf(uploadStats.audioDropCount));
            setStatusValue(7021, Long.valueOf(uploadStats.bandwidthEst));
            setStatusValue(7009, Long.valueOf(uploadStats.startTS));
            setStatusValue(7010, Long.valueOf(uploadStats.dnsTS));
            setStatusValue(7011, Long.valueOf(uploadStats.connTS));
            setStatusValue(7012, String.valueOf(uploadStats.serverIP));
            setStatusValue(7013, Long.valueOf(this.mQuicChannel ? 2L : 1L));
            setStatusValue(7014, uploadStats.connectionID);
            setStatusValue(7015, uploadStats.connectionStats);
            this.mUploadQualityReport.m84933a(uploadStats.videoDropCount, uploadStats.audioDropCount);
            this.mUploadQualityReport.m84939b(uploadStats.videoCacheLen, uploadStats.audioCacheLen);
        } else {
            setStatusValue(7005, 0L);
            setStatusValue(7006, 0L);
            setStatusValue(7007, 0L);
            setStatusValue(7008, 0L);
            jLongValue = 0;
            jLongValue2 = 0;
            jLongValue3 = 0;
        }
        setStatusValue(7001, Long.valueOf(j2));
        setStatusValue(ErrorCode.RENDER_TARGET_FAILED, Long.valueOf(jLongValue2));
        setStatusValue(7003, Long.valueOf(jLongValue3));
        setStatusValue(7004, Long.valueOf(jLongValue));
        this.mLastTimeStamp = timeTick;
        this.mLastUploadStats = uploadStats;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rtmpProxySendHeartBeat() {
        int[] iArrM84226a = C14215f.m84226a();
        long j = iArrM84226a[0] / 10;
        long j2 = iArrM84226a[1] / 10;
        long jM84182c = TXCStatus.m84182c(getID(), 7004);
        long jM84182c2 = TXCStatus.m84182c(getID(), 7003);
        long jM84182c3 = TXCStatus.m84182c(getID(), 1001);
        long jM84182c4 = TXCStatus.m84182c(getID(), 4001);
        long jM84182c5 = TXCStatus.m84182c(getID(), 7006);
        long jM84182c6 = TXCStatus.m84182c(getID(), 7005);
        long jM84182c7 = TXCStatus.m84182c(getID(), 7008);
        long jM84182c8 = TXCStatus.m84182c(getID(), 7007);
        synchronized (this.mRtmpProxyLock) {
            nativeRtmpProxySendHeartBeat(this.mRtmpProxyInstance, j, j2, jM84182c, jM84182c2, jM84182c3, jM84182c4, jM84182c5, jM84182c6, jM84182c7, jM84182c8);
        }
    }

    private void sendNotifyEvent(int i) {
        if (i == 0) {
            reconnect(false);
            return;
        }
        if (i == 1) {
            reconnect(true);
            return;
        }
        if (i == 1001) {
            this.mConnectSuccessTimeStamps = TXCTimeUtil.getTimeTick();
        }
        if (i == 1026) {
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpMsgRecvThreadLock) {
                    nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                }
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                }
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(104, 2000L);
                    return;
                }
                return;
            }
            return;
        }
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            if (i == -2308) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "The server rejects the connection request. It may be that the push URL has been occupied or expired, or the anti-leech link is wrong.");
            } else if (i == -1307) {
                bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "failed to connect server for several times, abort connection");
            } else {
                if (i == 1026) {
                    if (this.mRtmpProxyEnable) {
                        synchronized (this.mRtmpMsgRecvThreadLock) {
                            nativeRtmpMsgRecvThreadStart(this.mRtmpMsgRecvThreadInstance);
                        }
                        synchronized (this.mRtmpProxyLock) {
                            nativeRtmpProxyEnterRoom(this.mRtmpProxyInstance);
                        }
                        Handler handler2 = this.mHandler;
                        if (handler2 != null) {
                            handler2.sendEmptyMessageDelayed(104, 2000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 3003) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "RTMP servers handshake failed");
                } else if (i == -1325) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No internet. Please check if WiFi or mobile data is turned on");
                } else if (i == -1324) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect all IPs, abort connection.");
                } else if (i == 1001) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Already connected to rtmp server");
                } else if (i == 1002) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "rtmp start push stream");
                } else if (i == 1101) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Insufficient upstream bandwidth. Data transmission is not timely");
                } else if (i == 1102) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Enables network reconnection");
                } else if (i == 3008) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "No data is sent for more than 30s. Actively disconnect");
                } else if (i != 3009) {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "UNKNOWN");
                } else {
                    bundle.putString(TXLiveConstants.EVT_DESCRIPTION, "Failed to connect server");
                }
            }
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            C14215f.m84218a(this.mNotifyListener, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPushTask(final String str, final boolean z, int i) {
        TXCLog.m84152i(TAG, "start push task");
        boolean z2 = this.mQuicChannel;
        if (z2 != z && z2) {
            Monitor.m84161a(2, String.format("Network: switch push channel from quic to tcp.[retryCount:%d][retryLimit:%d]", Integer.valueOf(this.mRetryCount), Integer.valueOf(this.mParam.f60413e)), "", 0);
        }
        if (z) {
            int i2 = this.mConnectCountQuic + 1;
            this.mConnectCountQuic = i2;
            setStatusValue(7017, Long.valueOf(i2));
        } else {
            int i3 = this.mConnectCountTcp + 1;
            this.mConnectCountTcp = i3;
            setStatusValue(7018, Long.valueOf(i3));
        }
        Thread thread = new Thread("RTMPUpload") { // from class: com.tencent.liteav.network.TXCStreamUploader.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (TXCStreamUploader.this.mUploaderInstance != 0) {
                    try {
                        Thread.sleep(100L, 0);
                    } catch (InterruptedException unused) {
                    }
                }
                TXCStreamUploader.this.mUploadQualityReport.m84938b();
                TXCStreamUploader.this.mUploadQualityReport.m84936a(TXCStreamUploader.this.mParam.f60418j);
                TXCStreamUploader.this.mUploadQualityReport.m84935a(TXCStreamUploader.this.mRtmpUrl);
                TXCStreamUploader.this.mUploadQualityReport.m84937a(z, TXCStreamUploader.this.getAddressFromUrl(str));
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    try {
                        TXCStreamUploader.this.mQuicChannel = z;
                        int i4 = TXCStreamUploader.this.mParam.f60418j ? TXCStreamUploader.this.mQuicChannel ? 3 : 2 : 1;
                        boolean z3 = TXCStreamUploader.this.mRtmpProxyEnable;
                        TXCStreamUploader tXCStreamUploader = TXCStreamUploader.this;
                        if (z3) {
                            if (tXCStreamUploader.mAudioMuted) {
                                TXCStreamUploader.this.mParam.f60419k = false;
                            }
                        } else if (tXCStreamUploader.mIpList == null || TXCStreamUploader.this.mIpList.size() == 0) {
                            i4 = 1;
                        }
                        TXCStreamUploader.this.setStatusValue(7020, Long.valueOf(i4));
                        TXCStreamUploader tXCStreamUploader2 = TXCStreamUploader.this;
                        tXCStreamUploader2.mUploaderInstance = tXCStreamUploader2.nativeInitUploader(tXCStreamUploader2.mRtmpUrl, str, z, TXCStreamUploader.this.mParam.f60412d, TXCStreamUploader.this.mParam.f60411c, TXCStreamUploader.this.mParam.f60409a, TXCStreamUploader.this.mParam.f60410b, TXCStreamUploader.this.mParam.f60415g, 16, i4, TXCStreamUploader.this.mParam.f60419k, TXCStreamUploader.this.mParam.f60420l, TXCStreamUploader.this.mMetaData);
                        if (TXCStreamUploader.this.mUploaderInstance != 0) {
                            TXCStreamUploader tXCStreamUploader3 = TXCStreamUploader.this;
                            tXCStreamUploader3.nativeSetVideoDropParams(tXCStreamUploader3.mUploaderInstance, TXCStreamUploader.this.mParam.f60417i, TXCStreamUploader.this.mParam.f60415g, TXCStreamUploader.this.mParam.f60416h);
                            boolean z4 = false;
                            for (TXSNALPacket tXSNALPacket : TXCStreamUploader.this.mVecPendingNAL) {
                                if (!z4 && tXSNALPacket.nalType == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    TXCStreamUploader tXCStreamUploader4 = TXCStreamUploader.this;
                                    tXCStreamUploader4.nativePushNAL(tXCStreamUploader4.mUploaderInstance, tXSNALPacket.nalData, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                                }
                            }
                            TXCStreamUploader.this.mVecPendingNAL.removeAllElements();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader5 = TXCStreamUploader.this;
                        tXCStreamUploader5.mRtmpProxyInstance = tXCStreamUploader5.nativeInitRtmpProxyInstance(tXCStreamUploader5.mRtmpProxyParam.f60303a, TXCStreamUploader.this.mRtmpProxyParam.f60304b, TXCStreamUploader.this.mRtmpProxyParam.f60305c, TXCStreamUploader.this.mRtmpProxyParam.f60306d, TXCStreamUploader.this.mRtmpProxyParam.f60307e, TXCStreamUploader.this.mRtmpProxyParam.f60308f, TXCStreamUploader.this.mRtmpProxyParam.f60309g, TXCStreamUploader.this.mRtmpProxyParam.f60310h, TXCStreamUploader.this.mRtmpProxyParam.f60311i, TXCStreamUploader.this.mRtmpProxyParam.f60312j);
                    }
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader6 = TXCStreamUploader.this;
                        tXCStreamUploader6.mRtmpMsgRecvThreadInstance = tXCStreamUploader6.nativeInitRtmpMsgRecvThreadInstance(tXCStreamUploader6.mRtmpProxyInstance, TXCStreamUploader.this.mUploaderInstance);
                    }
                }
                TXCStreamUploader tXCStreamUploader7 = TXCStreamUploader.this;
                tXCStreamUploader7.nativeOnThreadRun(tXCStreamUploader7.mUploaderInstance);
                if (TXCStreamUploader.this.mRtmpProxyEnable) {
                    synchronized (TXCStreamUploader.this.mRtmpMsgRecvThreadLock) {
                        TXCStreamUploader tXCStreamUploader8 = TXCStreamUploader.this;
                        tXCStreamUploader8.nativeRtmpMsgRecvThreadStop(tXCStreamUploader8.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader tXCStreamUploader9 = TXCStreamUploader.this;
                        tXCStreamUploader9.nativeUninitRtmpMsgRecvThreadInstance(tXCStreamUploader9.mRtmpMsgRecvThreadInstance);
                        TXCStreamUploader.this.mRtmpMsgRecvThreadInstance = 0L;
                    }
                    synchronized (TXCStreamUploader.this.mRtmpProxyLock) {
                        TXCStreamUploader tXCStreamUploader10 = TXCStreamUploader.this;
                        tXCStreamUploader10.nativeUninitRtmpProxyInstance(tXCStreamUploader10.mRtmpProxyInstance);
                        TXCStreamUploader.this.mRtmpProxyInstance = 0L;
                    }
                }
                synchronized (TXCStreamUploader.this.mThreadLock) {
                    TXCStreamUploader tXCStreamUploader11 = TXCStreamUploader.this;
                    tXCStreamUploader11.nativeUninitUploader(tXCStreamUploader11.mUploaderInstance);
                    TXCStreamUploader.this.mUploaderInstance = 0L;
                }
            }
        };
        this.mThread = thread;
        thread.start();
    }

    private void stopPushTask() {
        TXCLog.m84152i(TAG, "stop push task");
        synchronized (this.mThreadLock) {
            this.mVecPendingNAL.removeAllElements();
            nativeStopPush(this.mUploaderInstance);
        }
    }

    private void tryResetRetryCount() {
        if (this.mConnectSuccessTimeStamps != 0) {
            long timeTick = TXCTimeUtil.getTimeTick() - this.mConnectSuccessTimeStamps;
            C14315h c14315h = this.mParam;
            if (timeTick > c14315h.f60413e * (c14315h.f60414f + 13) * 1000) {
                this.mRetryCount = 0;
                this.mConnectSuccessTimeStamps = 0L;
                TXCLog.m84152i(TAG, "reset retry count");
            }
        }
    }

    public String getConfusionIP(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        return (str == null || (iIndexOf = str.indexOf(".")) == -1 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf + 1)).indexOf(".")) == -1) ? str : "A.B.".concat(strSubstring.substring(iIndexOf2 + 1));
    }

    public UploadStats getUploadStats() {
        UploadStats uploadStatsNativeGetStats;
        synchronized (this.mThreadLock) {
            try {
                uploadStatsNativeGetStats = nativeGetStats(this.mUploaderInstance);
                if (uploadStatsNativeGetStats != null) {
                    uploadStatsNativeGetStats.channelType = this.mQuicChannel ? 2L : 1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uploadStatsNativeGetStats;
    }

    public int init() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    @Override // com.tencent.liteav.network.InterfaceC14309b
    public void onFetchDone(int i, ArrayList<C14299a> arrayList) {
        int size;
        String str;
        if (this.mIsPushing) {
            if (arrayList != null) {
                TXCLog.m84149e(TAG, "onFetchDone: code = " + i + " ip count = " + arrayList.size());
                if (i == 0) {
                    this.mIpList = arrayList;
                    size = arrayList.size();
                    this.mCurrentRecordIdx = 0;
                } else {
                    size = 0;
                }
            } else {
                size = 0;
            }
            if (size > 0) {
                String str2 = "";
                int i2 = 0;
                for (C14299a c14299a : this.mIpList) {
                    if (c14299a != null && c14299a.f60319c && (str = c14299a.f60317a) != null && str.length() > 0) {
                        i2++;
                    }
                    if (c14299a != null) {
                        str2 = str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getConfusionIP(c14299a.f60317a) + ":" + c14299a.f60318b;
                    }
                }
                setStatusValue(7016, Long.valueOf(i2));
                setStatusValue(7019, "{" + str2 + " }");
            }
            C14297b rtmpRealConnectInfo = getRtmpRealConnectInfo();
            postReconnectMsg(rtmpRealConnectInfo.f60314a, rtmpRealConnectInfo.f60315b, 0);
        }
    }

    public void pushAAC(byte[] bArr, long j) {
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                if (!this.mAudioMuted || !this.mRtmpProxyEnable) {
                    nativePushAAC(this.mUploaderInstance, bArr, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pushNAL(TXSNALPacket tXSNALPacket) {
        byte[] bArr;
        tryResetRetryCount();
        synchronized (this.mThreadLock) {
            try {
                long j = this.mUploaderInstance;
                if (j == 0) {
                    if (tXSNALPacket.nalType == 0) {
                        this.mVecPendingNAL.removeAllElements();
                    }
                    this.mVecPendingNAL.add(tXSNALPacket);
                } else if (tXSNALPacket != null && (bArr = tXSNALPacket.nalData) != null && bArr.length > 0) {
                    nativePushNAL(j, bArr, tXSNALPacket.nalType, tXSNALPacket.frameIndex, tXSNALPacket.pts, tXSNALPacket.dts);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setAudioInfo(int i, int i2) {
        C14315h c14315h = this.mParam;
        if (c14315h != null) {
            c14315h.f60411c = i2;
            c14315h.f60412d = i;
        }
    }

    public void setAudioMute(boolean z) {
        int i;
        synchronized (this.mThreadLock) {
            try {
                this.mAudioMuted = z;
                if (this.mRtmpProxyEnable) {
                    long j = this.mUploaderInstance;
                    if (j != 0) {
                        if (this.mParam.f60418j) {
                            i = this.mQuicChannel ? 3 : 2;
                        } else {
                            i = 1;
                        }
                        nativeSetSendStrategy(j, i, false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setDropEanble(boolean z) {
        TXCLog.m84152i(TAG, "drop enable ".concat(z ? "yes" : "no"));
        synchronized (this.mThreadLock) {
            nativeEnableDrop(this.mUploaderInstance, z);
        }
    }

    public void setMetaData(HashMap<String, String> map) {
        this.mMetaData = map;
    }

    public void setMode(int i) {
        C14315h c14315h = this.mParam;
        if (c14315h != null) {
            c14315h.f60409a = i;
        }
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        this.mNotifyListener = new WeakReference<>(interfaceC14170b);
    }

    public void setRetryInterval(int i) {
        C14315h c14315h = this.mParam;
        if (c14315h != null) {
            c14315h.f60414f = i;
        }
    }

    public void setRetryTimes(int i) {
        C14315h c14315h = this.mParam;
        if (c14315h != null) {
            c14315h.f60413e = i;
        }
    }

    public void setSendStrategy(boolean z, boolean z2) {
        int i;
        ArrayList<C14299a> arrayList;
        C14315h c14315h = this.mParam;
        c14315h.f60418j = z;
        c14315h.f60419k = z2;
        this.mUploadQualityReport.m84936a(z);
        int i2 = 1;
        if (z) {
            i = this.mQuicChannel ? 3 : 2;
        } else {
            i = 1;
        }
        if (this.mRtmpProxyEnable || ((arrayList = this.mIpList) != null && arrayList.size() != 0)) {
            i2 = i;
        }
        synchronized (this.mThreadLock) {
            try {
                long j = this.mUploaderInstance;
                if (j != 0) {
                    nativeSetSendStrategy(j, i2, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        setStatusValue(7020, Long.valueOf(i2));
    }

    public void setVideoDropParams(boolean z, int i, int i2) {
        StringBuilder sb = new StringBuilder("drop params wait i frame:");
        sb.append(z ? "yes" : "no");
        sb.append(" max video count:");
        sb.append(i);
        sb.append(" max video cache time: ");
        sb.append(i2);
        sb.append(" ms");
        TXCLog.m84152i(TAG, sb.toString());
        synchronized (this.mThreadLock) {
            try {
                C14315h c14315h = this.mParam;
                c14315h.f60417i = z;
                c14315h.f60415g = i;
                c14315h.f60416h = i2;
                long j = this.mUploaderInstance;
                if (j != 0) {
                    nativeSetVideoDropParams(j, z, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String start(String str, boolean z, int i) {
        if (this.mIsPushing) {
            return this.mRtmpUrl;
        }
        this.mIsPushing = true;
        this.mConnectSuccessTimeStamps = 0L;
        this.mRetryCount = 0;
        this.mRtmpUrl = str;
        this.mChannelType = i;
        this.mConnectCountQuic = 0;
        this.mConnectCountTcp = 0;
        this.mRtmpProxyEnable = false;
        this.mRtmpProxyParam.m84855a();
        this.mRtmpProxyIPList.clear();
        this.mRtmpProxyIPIndex = 0;
        this.mRtmpProxyInstance = 0L;
        this.mRtmpMsgRecvThreadInstance = 0L;
        setStatusValue(7016, 0L);
        setStatusValue(7017, 0L);
        setStatusValue(7018, 0L);
        this.mUploadQualityReport.m84932a();
        StringBuilder sb = new StringBuilder("start push with url:");
        sb.append(this.mRtmpUrl);
        sb.append(" enable nearest ip:");
        sb.append(z ? "yes" : "no");
        sb.append("channel type:");
        sb.append(i);
        TXCLog.m84152i(TAG, sb.toString());
        if (C14215f.m84236e(this.mContext) == 0) {
            sendNotifyEvent(TXLiteAVCode.ERR_RTMP_PUSH_NO_NETWORK);
            return this.mRtmpUrl;
        }
        this.mEnableNearestIP = z;
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread("RTMP_PUSH");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
        }
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.tencent.liteav.network.TXCStreamUploader.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i2 = message.what;
                if (i2 == 101) {
                    TXCStreamUploader.this.startPushTask((String) message.obj, message.arg1 == 2, 0);
                    return;
                }
                if (i2 == 103) {
                    TXCStreamUploader.this.reportNetStatus();
                } else {
                    if (i2 != 104) {
                        return;
                    }
                    TXCStreamUploader.this.rtmpProxySendHeartBeat();
                    if (TXCStreamUploader.this.mHandler != null) {
                        TXCStreamUploader.this.mHandler.sendEmptyMessageDelayed(104, 2000L);
                    }
                }
            }
        };
        parseProxyInfo(str);
        if (this.mRtmpProxyEnable) {
            this.mLastNetworkType = C14215f.m84236e(this.mContext);
            nativeCacheJNIParams();
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else if (!this.mEnableNearestIP || this.mLastNetworkType == C14215f.m84236e(this.mContext)) {
            startPushTask(this.mRtmpUrl, this.mQuicChannel, 0);
        } else {
            TXCLog.m84152i(TAG, "fetching nearest ip list");
            this.mLastNetworkType = C14215f.m84236e(this.mContext);
            this.mIntelligentRoute.m84884a(str, i);
        }
        this.mHandler.sendEmptyMessageDelayed(103, 2000L);
        return this.mRtmpUrl;
    }

    public void stop() {
        if (this.mIsPushing) {
            this.mIsPushing = false;
            TXCLog.m84152i(TAG, "stop push");
            if (this.mRtmpProxyEnable) {
                synchronized (this.mRtmpProxyLock) {
                    nativeRtmpProxyLeaveRoom(this.mRtmpProxyInstance);
                }
            }
            synchronized (this.mThreadLock) {
                nativeStopPush(this.mUploaderInstance);
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.getLooper().quit();
                this.mHandlerThread = null;
            }
            if (this.mHandler != null) {
                this.mHandler = null;
            }
            if (this.mRtmpProxyEnable) {
                nativeReleaseJNIParams();
            }
            this.mUploadQualityReport.m84940c();
            this.mUploadQualityReport.m84932a();
        }
    }

    private void sendNotifyEvent(int i, String str) {
        if (str != null && !str.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
            C14215f.m84218a(this.mNotifyListener, i, bundle);
        } else {
            sendNotifyEvent(i);
        }
        if (i != 1002) {
            if (i == 1101) {
                this.mUploadQualityReport.m84941d();
            }
        } else {
            UploadStats uploadStats = getUploadStats();
            if (uploadStats != null) {
                this.mUploadQualityReport.m84934a(uploadStats.dnsparseTimeCost, uploadStats.connectTimeCost, uploadStats.handshakeTimeCost);
            }
        }
    }
}
