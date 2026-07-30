package com.tantanapp.media.proxy.api;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p149l.ald0;

/* JADX INFO: loaded from: classes13.dex */
public class TTMediaProxy {
    private static final String TAG = "TTMediaProxy";
    private static InterfaceC13660a mPreloadTaskCompleteListener = null;
    private static Context sAppContext = null;
    private static InterfaceC13661b sProxyServerResultListener = null;
    private static boolean soLoadStatus = false;
    public long mNativeContext;
    private HashMap<Integer, String> mTaskIdMap = new HashMap<>();
    public long m_bytes;
    public String m_completeTimePoint;
    public long m_connectUsedTime;
    public long m_downloadLimitRate;
    public long m_downloadRate;
    public long m_downloadedBytes;
    public long m_downloadedDuration;
    public int m_endReasonCode;
    public String m_endReasonStr;
    public String m_httpHeader;
    public String m_key;
    public long m_milliSeconds;
    public int m_priority;
    public long m_start;
    public int m_status;
    public int m_taskId;
    public String m_url;
    public long m_usedTime;
    public long m_waitTime;

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.TTMediaProxy$a */
    public interface InterfaceC13660a {
        /* JADX INFO: renamed from: a */
        void mo81357a(int i, int i2, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo);

        /* JADX INFO: renamed from: b */
        void mo81358b(int i, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo);
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.TTMediaProxy$b */
    public interface InterfaceC13661b {
        /* JADX INFO: renamed from: a */
        void mo81359a(String str);
    }

    static {
        try {
            System.loadLibrary("ttffmpeg");
            System.loadLibrary("ttproxy");
            soLoadStatus = true;
        } catch (Throwable th) {
            th.printStackTrace();
            soLoadStatus = false;
        }
        mPreloadTaskCompleteListener = null;
        sProxyServerResultListener = null;
    }

    public static String getDNS() {
        Network activeNetwork;
        LinkProperties linkProperties;
        ArrayList arrayList = new ArrayList();
        Context context = sAppContext;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                    Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                    while (it.hasNext()) {
                        String hostAddress = it.next().getHostAddress();
                        if (hostAddress != null && !hostAddress.isEmpty() && !arrayList.contains(hostAddress)) {
                            arrayList.add(hostAddress);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (arrayList.isEmpty()) {
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
                String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
                for (int i = 0; i < 4; i++) {
                    String str = (String) method.invoke(null, strArr[i]);
                    if (str != null && !str.isEmpty() && !arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(", ");
        }
        return sb.toString();
    }

    public static final String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private native long nativeClearCacheWithKey(String str);

    private native void nativeDumpMemoryData();

    private native int nativeProxyAddPreloadTaskWithPreloadDuration(String str, String str2, long j, long j2, long j3, String str3, int i, long j4, String str4);

    private native int nativeProxyAddPreloadTaskWithRangeSize(String str, String str2, long j, long j2, String str3, int i, long j3, String str4);

    private native int nativeProxyCheckCacheExist(String str);

    private native void nativeProxyClearAllCache();

    private native int nativeProxyClearAllPreloadTask();

    private native void nativeProxyClearCache();

    private native String nativeProxyGenerateSession();

    private native long nativeProxyGetAllDownloadedBytes();

    private native long nativeProxyGetCurAllDownloadRate();

    private native int nativeProxyGetTaskCount(int i);

    private native void nativeProxyHttpServerStart();

    private native long nativeProxyInit(String str, String str2, int i, int i2, int i3);

    private native int nativeProxyLimitRate(int i, long j);

    private native int nativeProxyPauseAllPreloadTask();

    private native int nativeProxyPausePreloadTaskWithFileKey(String str);

    private native int nativeProxyPausePreloadTaskWithId(int i);

    private native int nativeProxyRemovePreloadTaskWithFileKey(String str);

    private native int nativeProxyRemovePreloadTaskWithId(int i);

    private native int nativeProxyResumeAllPreloadTask();

    private native int nativeProxyResumePreloadTaskWithFileKey(String str);

    private native int nativeProxyResumePreloadTaskWithId(int i);

    private native void nativeProxySetConfig(String str);

    private native String nativeProxySwitchPlayURL(String str, String str2, String str3);

    private native void nativeProxyUnInit();

    private native Object[] nativeProxyUpdateAllTaskInfo();

    private native void nativeProxyUpdatePlayerPreloadSize(long j);

    private native Object[] nativeProxyUpdateTaskInfoForStatus(int i);

    public static void postEventFromNative(String str) {
        if (str == null) {
            return;
        }
        PreloadTaskInfo preloadTaskInfo = new PreloadTaskInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            preloadTaskInfo.mEventCode = jSONObject.getInt("mEventCode");
            preloadTaskInfo.mEventSubCode = jSONObject.getInt("mEventSubCode");
            preloadTaskInfo.mTaskId = jSONObject.getInt("mTaskId");
            preloadTaskInfo.mStatus = jSONObject.getInt("mStatus");
            preloadTaskInfo.mUrl = jSONObject.getString("mUrl");
            preloadTaskInfo.mKey = jSONObject.getString("mKey");
            preloadTaskInfo.mHttpHeader = jSONObject.getString("mHttpHeader");
            preloadTaskInfo.mPriority = jSONObject.getInt("mPriority");
            preloadTaskInfo.mRequireStart = jSONObject.getLong("mRequireStart");
            preloadTaskInfo.mRequireSize = jSONObject.getLong("mRequireSize");
            preloadTaskInfo.mRequireDuration = jSONObject.getLong("mRequireDuration");
            preloadTaskInfo.mDownloadedSize = jSONObject.getLong("mDownloadedSize");
            preloadTaskInfo.mDownloadedDuration = jSONObject.getLong("mDownloadedDuration");
            preloadTaskInfo.mConnectUsedTime = jSONObject.getLong("mConnectUsedTime");
            preloadTaskInfo.mUsedTime = jSONObject.getLong("mUsedTime");
            preloadTaskInfo.mCompleteTimestamp = jSONObject.getLong("mCompleteTimestamp");
            preloadTaskInfo.mDownloadRate = jSONObject.getLong("mDownloadRate");
            preloadTaskInfo.mDownloadLimitRate = jSONObject.getLong("mDownloadLimitRate");
            preloadTaskInfo.mAverageRate = jSONObject.getLong("mAverageRate");
            preloadTaskInfo.mWaitTime = jSONObject.getLong("mWaitTime");
            preloadTaskInfo.mEndReasonCode = jSONObject.getInt("mEndReasonCode");
            preloadTaskInfo.mEndReasonStr = jSONObject.getString("mEndReasonStr");
            preloadTaskInfo.mAddTimestamp = jSONObject.getLong("mAddTimestamp");
            preloadTaskInfo.mTcpConnectTime = jSONObject.getLong("mTcpConnectTime");
            preloadTaskInfo.mDnsUsedTime = jSONObject.getLong("mDnsUsedTime");
            preloadTaskInfo.mHttpHeaderTime = jSONObject.getLong("mHttpHeaderTime");
            preloadTaskInfo.mHttpBodyTime = jSONObject.getLong("mHttpBodyTime");
            preloadTaskInfo.mHttpCode = jSONObject.getInt("mHttpCode");
            preloadTaskInfo.mCdnIp = jSONObject.getString("mCdnIp");
            preloadTaskInfo.mSessionID = jSONObject.getString("mSessionID");
            preloadTaskInfo.mFirstWriteTimestamp = jSONObject.getLong("mFirstWriteTimestamp");
            preloadTaskInfo.mIsFirstNetworkPacket = Boolean.valueOf(jSONObject.getBoolean("mIsFirstNetworkPacket"));
            preloadTaskInfo.mPreloadThreadNumber = jSONObject.getInt("mPreloadThreadNumber");
            preloadTaskInfo.mDNSServers = getDNS();
            preloadTaskInfo.mGetFileSizeCost = jSONObject.getInt("mGetFileSizeCost");
            preloadTaskInfo.mTlsTime = jSONObject.getInt("mTlsTime");
            preloadTaskInfo.mFirstPacketTime = jSONObject.getInt("mFirstPacketTime");
            preloadTaskInfo.mHeaderSize = jSONObject.getInt("mHeaderSize");
            postEventFromNativeDeal(preloadTaskInfo.mEventCode, preloadTaskInfo.mEventSubCode, preloadTaskInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    private static void postEventFromNativeDeal(int i, int i2, Object obj) {
        int i3;
        PreloadTaskInfo preloadTaskInfo = (PreloadTaskInfo) obj;
        ald0.m97278a(TAG, "url: " + preloadTaskInfo.mUrl + "; offset: " + preloadTaskInfo.mRequireStart);
        if (i > 7 || i < 0) {
            ald0.m97279b(TAG, "EventCode illegal!!!  EventCode:" + i + " EventSubCode:" + i2);
            return;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
                InterfaceC13660a interfaceC13660a = mPreloadTaskCompleteListener;
                if (interfaceC13660a == null) {
                    i3 = i2;
                } else {
                    i3 = i2;
                    interfaceC13660a.mo81357a(i3, preloadTaskInfo.mTaskId, preloadTaskInfo.mUrl, preloadTaskInfo.mKey, preloadTaskInfo.mSessionID, preloadTaskInfo.mDownloadedSize, preloadTaskInfo);
                    preloadTaskInfo = preloadTaskInfo;
                }
                break;
            case 3:
                InterfaceC13660a interfaceC13660a2 = mPreloadTaskCompleteListener;
                if (interfaceC13660a2 != null) {
                    interfaceC13660a2.mo81358b(preloadTaskInfo.mTaskId, preloadTaskInfo.mUrl, preloadTaskInfo.mKey, preloadTaskInfo.mSessionID, preloadTaskInfo.mDownloadedSize, preloadTaskInfo);
                }
                i3 = i2;
                break;
            case 5:
            case 6:
                InterfaceC13660a interfaceC13660a3 = mPreloadTaskCompleteListener;
                if (interfaceC13660a3 != null) {
                    interfaceC13660a3.mo81358b(preloadTaskInfo.mTaskId, preloadTaskInfo.mUrl, preloadTaskInfo.mKey, preloadTaskInfo.mSessionID, preloadTaskInfo.mDownloadedSize, preloadTaskInfo);
                }
                i3 = i2;
                break;
            default:
                i3 = i2;
                break;
        }
        ald0.m97279b(TAG, "Event:" + PreloadTaskInfo.TaskEndReason.StrTaskEndReason[i] + " EventCode:" + i + " EventSubCode:" + i3 + " Task id " + preloadTaskInfo.mTaskId + " status:" + preloadTaskInfo.mStatus + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + PreloadTaskInfo.TaskStatus.StrTaskStatus[preloadTaskInfo.mStatus] + " url:" + preloadTaskInfo.mUrl + " key:" + preloadTaskInfo.mKey + " md5key:" + md5(preloadTaskInfo.mKey) + " httpHeader:" + preloadTaskInfo.mHttpHeader + " priority:" + preloadTaskInfo.mPriority + " start:" + preloadTaskInfo.mRequireStart + " size:" + preloadTaskInfo.mRequireSize + " duration:" + preloadTaskInfo.mRequireDuration + " downloaded Bytes:" + preloadTaskInfo.mDownloadedSize + " downloaded Duration:" + preloadTaskInfo.mDownloadedDuration + " connect UsedTime:" + preloadTaskInfo.mConnectUsedTime + " usedTime:" + preloadTaskInfo.mUsedTime + " completeTimestamp:" + preloadTaskInfo.mCompleteTimestamp + " downloadRate:" + preloadTaskInfo.mDownloadRate + " downloadLimitRate:" + preloadTaskInfo.mDownloadLimitRate + " averageRate:" + preloadTaskInfo.mAverageRate + " waitTime:" + preloadTaskInfo.mWaitTime + " endReasonCode:" + preloadTaskInfo.mEndReasonCode + " endReasonStr:" + preloadTaskInfo.mEndReasonStr + " addTimestamp:" + preloadTaskInfo.mAddTimestamp + " Ip:" + preloadTaskInfo.mCdnIp + " dnsUseTime:" + preloadTaskInfo.mDnsUsedTime + " tcpConnectTime:" + preloadTaskInfo.mTcpConnectTime + " httpHeaderTime:" + preloadTaskInfo.mHttpHeaderTime + " httpBodyTime:" + preloadTaskInfo.mHttpBodyTime + " httpCode:" + preloadTaskInfo.mHttpCode + " sessionID:" + preloadTaskInfo.mSessionID + " FirstWriteTimestamp:" + preloadTaskInfo.mFirstWriteTimestamp + " firstWrite-add:" + (preloadTaskInfo.mFirstWriteTimestamp - preloadTaskInfo.mAddTimestamp) + " waitTime+connctTime+useTime:" + (preloadTaskInfo.mWaitTime + preloadTaskInfo.mConnectUsedTime + preloadTaskInfo.mUsedTime) + " end-add:" + (preloadTaskInfo.mCompleteTimestamp - preloadTaskInfo.mAddTimestamp));
    }

    public static void postProxyServerResultFromNative(String str) {
        InterfaceC13661b interfaceC13661b = sProxyServerResultListener;
        if (interfaceC13661b != null) {
            interfaceC13661b.mo81359a(str);
        }
    }

    public static void setAppContext(Context context) {
        if (context != null) {
            sAppContext = context.getApplicationContext();
        }
    }

    public int proxyAddPreloadTaskWithPreloadDuration(String str, String str2, long j, long j2, long j3, String str3, int i, long j4, String str4) {
        int iNativeProxyAddPreloadTaskWithPreloadDuration = soLoadStatus ? nativeProxyAddPreloadTaskWithPreloadDuration(str, str2, j, j2, j3, str3, i, j4, str4) : 0;
        if (iNativeProxyAddPreloadTaskWithPreloadDuration > 0) {
            this.mTaskIdMap.put(Integer.valueOf(iNativeProxyAddPreloadTaskWithPreloadDuration), str);
        }
        return iNativeProxyAddPreloadTaskWithPreloadDuration;
    }

    public int proxyAddPreloadTaskWithRangeSize(String str, String str2, long j, long j2, String str3, int i, long j3, String str4) {
        int iNativeProxyAddPreloadTaskWithRangeSize = soLoadStatus ? nativeProxyAddPreloadTaskWithRangeSize(str, str2, j, j2, str3, i, j3, str4) : 0;
        if (iNativeProxyAddPreloadTaskWithRangeSize > 0) {
            this.mTaskIdMap.put(Integer.valueOf(iNativeProxyAddPreloadTaskWithRangeSize), str);
        }
        return iNativeProxyAddPreloadTaskWithRangeSize;
    }

    public int proxyCheckCacheExist(String str) {
        if (str == null || !soLoadStatus) {
            return 0;
        }
        return nativeProxyCheckCacheExist(str);
    }

    public void proxyClearAllCache() {
        if (soLoadStatus) {
            nativeProxyClearAllCache();
        }
    }

    public int proxyClearAllPreloadTask() {
        if (soLoadStatus) {
            return nativeProxyClearAllPreloadTask();
        }
        return -1;
    }

    public void proxyClearCache() {
        if (soLoadStatus) {
            nativeProxyClearCache();
        }
    }

    public long proxyClearCacheWithKey(String str) {
        if (str.isEmpty() || !soLoadStatus) {
            return -1L;
        }
        return nativeClearCacheWithKey(str);
    }

    public void proxyDumpMemoryData() {
        if (soLoadStatus) {
            nativeDumpMemoryData();
        }
    }

    public String proxyGenerateSession() {
        return soLoadStatus ? nativeProxyGenerateSession() : "";
    }

    public long proxyGetAllDownloadedBytes() {
        if (soLoadStatus) {
            return nativeProxyGetAllDownloadedBytes();
        }
        return -1L;
    }

    public long proxyGetCurAllDownloadRate() {
        if (soLoadStatus) {
            return nativeProxyGetCurAllDownloadRate();
        }
        return -1L;
    }

    public int proxyGetTaskCount(int i) {
        if (soLoadStatus) {
            return nativeProxyGetTaskCount(i);
        }
        return -1;
    }

    public void proxyHttpServerStart() {
        if (soLoadStatus) {
            nativeProxyHttpServerStart();
        }
    }

    public long proxyInit(String str, String str2, int i, int i2, int i3) {
        if (soLoadStatus) {
            return nativeProxyInit(str, str2, i, i2, i3);
        }
        return -1L;
    }

    public int proxyLimitRate(int i, long j) {
        if (soLoadStatus) {
            return nativeProxyLimitRate(i, j);
        }
        return -1;
    }

    public int proxyPauseAllPreloadTask() {
        if (soLoadStatus) {
            return nativeProxyPauseAllPreloadTask();
        }
        return -1;
    }

    public int proxyPausePreloadTaskWithFileKey(String str) {
        if (soLoadStatus) {
            return nativeProxyPausePreloadTaskWithFileKey(str);
        }
        return -1;
    }

    public int proxyPausePreloadTaskWithId(int i) {
        if (soLoadStatus) {
            return nativeProxyPausePreloadTaskWithId(i);
        }
        return -1;
    }

    public int proxyRemovePreloadTaskWithFileKey(String str) {
        if (soLoadStatus) {
            return nativeProxyRemovePreloadTaskWithFileKey(str);
        }
        return -1;
    }

    public int proxyRemovePreloadTaskWithId(int i) {
        if (soLoadStatus) {
            return nativeProxyRemovePreloadTaskWithId(i);
        }
        return -1;
    }

    public int proxyResumeAllPreloadTask() {
        if (soLoadStatus) {
            return nativeProxyResumeAllPreloadTask();
        }
        return -1;
    }

    public int proxyResumePreloadTaskWithFileKey(String str) {
        if (soLoadStatus) {
            return nativeProxyResumePreloadTaskWithFileKey(str);
        }
        return -1;
    }

    public int proxyResumePreloadTaskWithId(int i) {
        if (soLoadStatus) {
            return nativeProxyResumePreloadTaskWithId(i);
        }
        return -1;
    }

    public void proxySetConfig(String str) {
        if (str == null || !soLoadStatus) {
            return;
        }
        nativeProxySetConfig(str);
    }

    public String proxySwitchPlayURL(String str, String str2, String str3) {
        return soLoadStatus ? nativeProxySwitchPlayURL(str, str2, str3) : str;
    }

    public void proxyUninit() {
        if (soLoadStatus) {
            nativeProxyUnInit();
        }
    }

    public void proxyUpdateAllTaskInfo() {
        if (soLoadStatus) {
            nativeProxyUpdateAllTaskInfo();
        }
    }

    public void proxyUpdatePlayerPreloadSize(long j) {
        if (soLoadStatus) {
            nativeProxyUpdatePlayerPreloadSize(j);
        }
    }

    public Object[] proxyUpdateTaskInfoForStatus(int i) {
        return soLoadStatus ? nativeProxyUpdateTaskInfoForStatus(i) : new Object[0];
    }

    public void setOnPreloadTaskCompleteListener(InterfaceC13660a interfaceC13660a) {
        mPreloadTaskCompleteListener = interfaceC13660a;
    }

    public void setProxyServerResultListener(InterfaceC13661b interfaceC13661b) {
        sProxyServerResultListener = interfaceC13661b;
    }
}
