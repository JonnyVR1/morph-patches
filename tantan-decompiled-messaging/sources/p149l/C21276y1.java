package p149l;

import androidx.core.app.NotificationCompat;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.proxy.api.PreloadTaskInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: renamed from: l.y1 */
/* JADX INFO: loaded from: classes9.dex */
public class C21276y1 extends qq2 {
    /* JADX INFO: renamed from: g */
    public static NetworkTrackInfo m212127g(PreloadTaskInfo preloadTaskInfo) {
        NetworkTrackInfo networkTrackInfo = new NetworkTrackInfo();
        networkTrackInfo.setReportType(NetworkTrackInfo.ReportType.AV);
        networkTrackInfo.setCreateTime(preloadTaskInfo.mAddTimestamp);
        networkTrackInfo.setRequestTimestamp(preloadTaskInfo.mAddTimestamp);
        if (preloadTaskInfo.mEventSubCode != 0) {
            networkTrackInfo.setThrowable(new Exception(String.valueOf(preloadTaskInfo.mEventSubCode)));
        }
        networkTrackInfo.setUrl(preloadTaskInfo.mUrl);
        networkTrackInfo.setRangeStart(preloadTaskInfo.mRequireStart);
        networkTrackInfo.setRequestHeaderSize(String.valueOf(preloadTaskInfo.mHeaderSize));
        networkTrackInfo.setResponseCode(String.valueOf(preloadTaskInfo.mHttpCode));
        networkTrackInfo.setResponseBodyByteCount(preloadTaskInfo.mDownloadedSize);
        networkTrackInfo.setDnsStartTime(0L);
        networkTrackInfo.setDnsEndTime(preloadTaskInfo.mDnsUsedTime);
        networkTrackInfo.setConnectStartTime(0L);
        networkTrackInfo.setConnectEndTime(preloadTaskInfo.mConnectUsedTime);
        networkTrackInfo.setConnectIp(preloadTaskInfo.mCdnIp);
        networkTrackInfo.setSecureConnectStartTime(0L);
        networkTrackInfo.setSecureConnectEndTime(preloadTaskInfo.mTlsTime);
        networkTrackInfo.setRequestHeadersEndTime(0L);
        networkTrackInfo.setResponseHeadersEndTime(preloadTaskInfo.mFirstPacketTime);
        return networkTrackInfo;
    }

    @Override // p149l.qq2
    /* JADX INFO: renamed from: e */
    public HashMap<String, String> mo175876e(NetworkTrackInfo networkTrackInfo) {
        HashMap<String, String> mapMo175876e = super.mo175876e(networkTrackInfo);
        if (networkTrackInfo.getThrowable() != null) {
            mapMo175876e.put(NotificationCompat.CATEGORY_ERROR, networkTrackInfo.getThrowable().getMessage());
        }
        try {
            mapMo175876e.put("url", networkTrackInfo.getRequestUrl());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            mapMo175876e.put("parse_error", "exception happend: " + e.getMessage());
        }
        mapMo175876e.put("range_offset", String.valueOf(networkTrackInfo.getRangeStart()));
        mapMo175876e.put("uip", m212128f());
        return mapMo175876e;
    }

    /* JADX INFO: renamed from: f */
    public final String m212128f() {
        String hostAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if ((inetAddressNextElement instanceof Inet4Address) && (hostAddress = inetAddressNextElement.getHostAddress()) != null && !hostAddress.contains("127.0.0.1")) {
                        return hostAddress;
                    }
                }
            }
            return "";
        } catch (SocketException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }
}
