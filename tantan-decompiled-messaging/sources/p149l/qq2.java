package p149l;

import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.OMSResourceType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qq2 implements c2m<NetworkTrackInfo> {

    /* JADX INFO: renamed from: a */
    public WifiManager f155859a = (WifiManager) App.f15369e.getSystemService("wifi");

    /* JADX INFO: renamed from: l.qq2$a */
    public static /* synthetic */ class C19557a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f155860a;

        static {
            int[] iArr = new int[Protocol.values().length];
            f155860a = iArr;
            try {
                iArr[Protocol.QUIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f155860a[Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f155860a[Protocol.HTTP_1_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f155860a[Protocol.HTTP_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f155860a[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m175874b(Protocol protocol) {
        if (protocol == null) {
            return "-";
        }
        int i = C19557a.f155860a[protocol.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return protocol.toString();
        }
        return (i == 4 || i == 5) ? "http/2.0" : "unknown";
    }

    /* JADX INFO: renamed from: c */
    public final void m175875c(Map<String, String> map) {
        qib0.f154696K.m110172e(map);
    }

    @Override // p149l.c2m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95854a(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null || networkTrackInfo.isCancel() || !da20.m110537g().m110538d(networkTrackInfo)) {
            return;
        }
        m175875c(mo175876e(networkTrackInfo));
    }

    /* JADX INFO: renamed from: e */
    public HashMap<String, String> mo175876e(NetworkTrackInfo networkTrackInfo) {
        HashMap<String, String> map = new HashMap<>();
        if (qib0.f154714c0.signedIn_()) {
            map.put(Oauth2AccessToken.KEY_UID, qib0.f154714c0.userId());
        } else {
            map.put(Oauth2AccessToken.KEY_UID, "-");
        }
        map.put("os", "android");
        map.put("os_ver", Build.VERSION.RELEASE);
        map.put("ver", qib0.f154730s);
        map.put("http_client_state", Act.foreground_() != null ? "" : OMSResourceType.background);
        map.put("net", ConnectivityReceiver.m81281d());
        map.put("op", networkTrackInfo.getRequestMethod());
        map.put("url", networkTrackInfo.getRequestUrl());
        map.put("type", da20.m110537g().m110541h(networkTrackInfo.getRequest(), networkTrackInfo.getReportType().getTypeStr()));
        map.put("code", networkTrackInfo.getResponseCode());
        map.put(NotificationCompat.CATEGORY_ERROR, networkTrackInfo.getExceptionMessage());
        map.put("err_code", NetworkTrackInfo.getErrCode(networkTrackInfo.getThrowable()));
        map.put("s_up", networkTrackInfo.getRequestSize());
        map.put("s_reqlen", networkTrackInfo.getRequestBodySize());
        map.put("request_timestamp", String.valueOf(networkTrackInfo.getRequestTimestamp()));
        long jMax = Math.max(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime(), 0L);
        map.put("t_all", String.valueOf(jMax));
        map.put("rip", networkTrackInfo.getConnectIp());
        long jMax2 = Math.max(networkTrackInfo.getSecureConnectEndTime() - networkTrackInfo.getSecureConnectStartTime(), 0L);
        map.put("t_ssl", String.valueOf(jMax2));
        long jMax3 = Math.max(networkTrackInfo.getConnectEndTime() - networkTrackInfo.getConnectStartTime(), 0L);
        long jMax4 = Math.max(networkTrackInfo.getConnectionAcquiredTime() - networkTrackInfo.getCreateTime(), 0L);
        map.put("t_conn", String.valueOf(Math.max(jMax3 - jMax2, 0L)));
        map.put("t_conn_acquired", String.valueOf(jMax4));
        map.put("is_httpdns", String.valueOf(networkTrackInfo.isHttpDns()));
        map.put("t_dns", String.valueOf(Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L)));
        long jMax5 = Math.max(networkTrackInfo.getResponseHeadersEndTime() - networkTrackInfo.getRequestHeadersEndTime(), 0L);
        map.put("t_start", String.valueOf(jMax5));
        exc0 response = networkTrackInfo.getResponse();
        if (response != null) {
            map.put("http_ver", m175874b(response.m118602S()));
            String strM118611u = response.m118611u("X-B3-Traceid");
            if (TextUtils.isEmpty(strM118611u)) {
                strM118611u = "-";
            }
            map.put("x_id", strM118611u);
            map.put("s_down", String.valueOf(networkTrackInfo.getResponseBodyByteCount()));
            map.put("s_rsplen", String.valueOf(Math.max(networkTrackInfo.getResponseBodyByteCount() - response.m118595F().m166554a(), 0L)));
        } else {
            map.put("http_ver", "-");
            map.put("x_id", "-");
            map.put("s_down", "-");
            map.put("s_rsplen", "-");
        }
        if (networkTrackInfo.getTlsVersion() != null) {
            map.put("tls_ver", networkTrackInfo.getTlsVersion().javaName());
        } else {
            map.put("tls_ver", "-");
        }
        map.put("t_rsp", String.valueOf(Math.max(jMax - jMax5, 0L)));
        map.put("t_req", String.valueOf(Math.max(networkTrackInfo.getResponseBodyEndTime() - networkTrackInfo.getResponseBodyStartTime(), 0L)));
        map.put("is_proxy", String.valueOf(NetworkTrackInfo.ifProxyExist()));
        return map;
    }
}
