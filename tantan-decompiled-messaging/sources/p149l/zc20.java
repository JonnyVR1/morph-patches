package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes9.dex */
public class zc20 extends o3f {

    /* JADX INFO: renamed from: a */
    public dkl f202508a;

    public zc20(dkl dklVar) {
        this.f202508a = dklVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m218012b(sx3 sx3Var) {
        if (sx3Var.request() == null || TextUtils.isEmpty((CharSequence) sx3Var.request().m185880j(String.class))) {
            return;
        }
        TrackMediaUploadUtil.m80293Y((String) sx3Var.request().m185880j(String.class), (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class));
    }

    @Override // p149l.o3f
    public void callEnd(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m218012b(sx3Var);
    }

    @Override // p149l.o3f
    public void callFailed(sx3 sx3Var, IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setThrowable(iOException);
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m218012b(sx3Var);
        this.f202508a.callFailed(sx3Var, iOException);
    }

    @Override // p149l.o3f
    public void callStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void connectFailed(sx3 sx3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
        this.f202508a.connectFailed(sx3Var, inetSocketAddress, proxy, protocol, iOException);
    }

    @Override // p149l.o3f
    public void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectStartTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setInetSocketAddress(inetSocketAddress);
        }
    }

    @Override // p149l.o3f
    public void connectionAcquired(sx3 sx3Var, wv5 wv5Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnection(wv5Var);
            networkTrackInfo.setConnectionAcquiredTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void dnsEnd(sx3 sx3Var, String str, @Nullable List<InetAddress> list) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setDnsEndTime(SystemClock.elapsedRealtime());
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<InetAddress> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getHostAddress());
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                networkTrackInfo.setConnectIp(sb.toString());
            }
        }
        this.f202508a.dnsEnd(sx3Var, str, list);
    }

    @Override // p149l.o3f
    public void dnsStart(sx3 sx3Var, String str) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setDnsStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void requestBodyEnd(sx3 sx3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setRequestBodyByteCount(j);
        }
    }

    @Override // p149l.o3f
    public void requestBodyStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void requestHeadersStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void responseBodyEnd(sx3 sx3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponseBodyByteCount(j);
        }
    }

    @Override // p149l.o3f
    public void responseBodyStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponse(exc0Var);
        }
        this.f202508a.responseHeadersEnd(sx3Var, exc0Var);
    }

    @Override // p149l.o3f
    public void responseHeadersStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void secureConnectEnd(sx3 sx3Var, @Nullable dvk dvkVar) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void secureConnectStart(sx3 sx3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) sx3Var.request().m185880j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p149l.o3f
    public void connectionReleased(sx3 sx3Var, wv5 wv5Var) {
    }
}
