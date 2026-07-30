package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.NetworkTrackInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes9.dex */
public class jl20 extends t4f {

    /* JADX INFO: renamed from: a */
    public rml f121463a;

    public jl20(rml rmlVar) {
        this.f121463a = rmlVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m145938b(ry3 ry3Var) {
        if (ry3Var.request() == null || TextUtils.isEmpty((CharSequence) ry3Var.request().m209025j(String.class))) {
            return;
        }
        TrackMediaUploadUtil.m81476Y((String) ry3Var.request().m209025j(String.class), (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class));
    }

    @Override // p153l.t4f
    public void callEnd(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m145938b(ry3Var);
    }

    @Override // p153l.t4f
    public void callFailed(ry3 ry3Var, IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setThrowable(iOException);
            networkTrackInfo.setCallEndTime(SystemClock.elapsedRealtime());
        }
        m145938b(ry3Var);
        this.f121463a.callFailed(ry3Var, iOException);
    }

    @Override // p153l.t4f
    public void callStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setCallStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void connectFailed(ry3 ry3Var, InetSocketAddress inetSocketAddress, @Nullable Proxy proxy, @Nullable Protocol protocol, @Nullable IOException iOException) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectEndTime(SystemClock.elapsedRealtime());
        }
        this.f121463a.connectFailed(ry3Var, inetSocketAddress, proxy, protocol, iOException);
    }

    @Override // p153l.t4f
    public void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnectStartTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setInetSocketAddress(inetSocketAddress);
        }
    }

    @Override // p153l.t4f
    public void connectionAcquired(ry3 ry3Var, bx5 bx5Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setConnection(bx5Var);
            networkTrackInfo.setConnectionAcquiredTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void dnsEnd(ry3 ry3Var, String str, @Nullable List<InetAddress> list) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
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
        this.f121463a.dnsEnd(ry3Var, str, list);
    }

    @Override // p153l.t4f
    public void dnsStart(ry3 ry3Var, String str) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setDnsStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void requestBodyEnd(ry3 ry3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setRequestBodyByteCount(j);
        }
    }

    @Override // p153l.t4f
    public void requestBodyStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void requestHeadersStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setRequestHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void responseBodyEnd(ry3 ry3Var, long j) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponseBodyByteCount(j);
        }
    }

    @Override // p153l.t4f
    public void responseBodyStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseBodyStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersEndTime(SystemClock.elapsedRealtime());
            networkTrackInfo.setResponse(i5d0Var);
        }
        this.f121463a.responseHeadersEnd(ry3Var, i5d0Var);
    }

    @Override // p153l.t4f
    public void responseHeadersStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setResponseHeadersStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void secureConnectEnd(ry3 ry3Var, @Nullable txk txkVar) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectEndTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void secureConnectStart(ry3 ry3Var) {
        NetworkTrackInfo networkTrackInfo = (NetworkTrackInfo) ry3Var.request().m209025j(NetworkTrackInfo.class);
        if (networkTrackInfo != null) {
            networkTrackInfo.setSecureConnectStartTime(SystemClock.elapsedRealtime());
        }
    }

    @Override // p153l.t4f
    public void connectionReleased(ry3 ry3Var, bx5 bx5Var) {
    }
}
