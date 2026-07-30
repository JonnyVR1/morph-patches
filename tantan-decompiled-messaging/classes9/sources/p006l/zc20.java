package p006l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import l.dvk;
import l.exc0;
import l.o3f;
import l.stc0;
import l.sx3;
import l.wv5;
import okhttp3.Protocol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zc20 extends o3f {

    /* JADX INFO: renamed from: a */
    public dkl f28700a;

    public zc20(dkl dklVar) {
        this.f28700a = dklVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m28685b(sx3 sx3Var) {
        if (sx3Var.request() == null || TextUtils.isEmpty((CharSequence) sx3Var.request().j(String.class))) {
            return;
        }
        TrackMediaUploadUtil.Y((String) sx3Var.request().j(String.class), (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class));
    }

    public void callEnd(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m28685b(sx3Var);
    }

    public void callFailed(sx3 sx3Var, IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setThrowable(iOException);
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m28685b(sx3Var);
        this.f28700a.callFailed(sx3Var, iOException);
    }

    public void callStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
        this.f28700a.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
    }

    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectStartTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setInetSocketAddress(inetSocketAddress);
        }
    }

    public void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnection(wv5Var);
            networkTrackInfo.setConnectionAcquiredTime(SystemClock.elapsedRealtime());
        }
    }

    public void dnsEnd(sx3 sx3Var, String str, @Nullable List<InetAddress> list) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setDnsEndTime(SystemClock.elapsedRealtime());
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<InetAddress> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getHostAddress());
                    sb.append(",");
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                networkTrackInfo.setConnectIp(sb.toString());
            }
        }
        this.f28700a.dnsEnd(sx3Var, str, list);
    }

    public void dnsStart(sx3 sx3Var, String str) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setDnsStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void requestBodyEnd(sx3 sx3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setRequestBodyByteCount(j);
        }
    }

    public void requestBodyStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersEndTime(SystemClock.elapsedRealtime());
        }
    }

    public void requestHeadersStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void responseBodyEnd(sx3 sx3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponseBodyByteCount(j);
        }
    }

    public void responseBodyStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponse(exc0Var);
        }
        this.f28700a.responseHeadersEnd(sx3Var, exc0Var);
    }

    public void responseHeadersStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void secureConnectEnd(sx3 sx3Var, @Nullable dvk dvkVar) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    public void secureConnectStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectStartTime(SystemClock.elapsedRealtime());
        }
    }

    public void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
    }
}
