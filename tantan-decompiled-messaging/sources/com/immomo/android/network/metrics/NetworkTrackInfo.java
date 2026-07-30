package com.immomo.android.network.metrics;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15167a;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.cll;
import p149l.dvk;
import p149l.exc0;
import p149l.fc20;
import p149l.j6f;
import p149l.ru5;
import p149l.stc0;
import p149l.sx3;
import p149l.utc0;
import p149l.wv5;
import p149l.yc20;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010&\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0007\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010*\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\"\u0010.\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\"\u00101\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0007\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR\"\u00108\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\"\u0010:\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\b+\u0010\u001b\"\u0004\b9\u0010\u001dR\"\u0010<\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0007\u001a\u0004\b2\u0010\u001b\"\u0004\b;\u0010\u001dR\"\u0010@\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0007\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\"\u0010C\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0007\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR\"\u0010F\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR\"\u0010J\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0007\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR\"\u0010N\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0007\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR\"\u0010R\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0007\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR\"\u0010T\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0007\u001a\u0004\bO\u0010\u001b\"\u0004\bS\u0010\u001dR\"\u0010V\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0007\u001a\u0004\bK\u0010\u001b\"\u0004\bU\u0010\u001dR\"\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0007\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u0010\u001dR\"\u0010\\\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0007\u001a\u0004\b=\u0010\u001b\"\u0004\b[\u0010\u001dR$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010\u0016R$\u0010i\u001a\u00020f2\u0006\u0010g\u001a\u00020f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010h\u001a\u0004\bi\u0010jR.\u0010l\u001a\u0004\u0018\u00010k2\b\u0010l\u001a\u0004\u0018\u00010k8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010t\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\br\u0010\u001b\"\u0004\bs\u0010\u001dR\"\u0010w\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0007\u001a\u0004\bu\u0010\u001b\"\u0004\bv\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010xR$\u0010{\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0016\u001a\u0004\by\u0010\u000e\"\u0004\bz\u0010\fR\u0018\u0010|\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010}\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0016R\u0018\u0010~\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0016R4\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b[\u0010\u0081\u0001\u001a\u0005\bG\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0016R*\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010\u0087\u0001\u001a\u0005\bZ\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R-\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010g\u001a\u0005\u0018\u00010\u008c\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bI\u0010\u008d\u0001\u001a\u0005\b^\u0010\u008e\u0001¨\u0006\u0091\u0001"}, m87232d2 = {"Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "", "<init>", "()V", "Ll/stc0;", SocialConstants.TYPE_REQUEST, "", "J", "(Ll/stc0;)V", "", "connectIp", "A", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ll/sx3;", "call", "Y", "(Ll/sx3;)V", "w", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "", "b", RXScreenCaptureService.KEY_INDEX, "()J", "E", "(J)V", "createTime", "c", "n", BloodType.f38728O, "requestTimestamp", Constants.INAPP_DATA_TAG, "getCallStartTime", BaseSei.f13931Y, "callStartTime", "e", "k", "G", "dnsStartTime", "f", "j", "F", "dnsEndTime", "g", "B", "connectStartTime", "h", Constants.KEY_T, "W", "secureConnectStartTime", BLiveStormDanmakuGiftResourceType.f44446s, j6f.GPS_MEASUREMENT_INTERRUPTED, "secureConnectEndTime", BaseSei.f13932Z, "connectEndTime", "D", "connectionAcquiredTime", BLiveStormDanmakuGiftResourceType.f44444l, "getRequestHeadersStartTime", "N", "requestHeadersStartTime", "m", "M", "requestHeadersEndTime", "getRequestBodyStartTime", "L", "requestBodyStartTime", "o", "getRequestBodyEndTime", "K", "requestBodyEndTime", "p", "getResponseHeadersStartTime", "U", "responseHeadersStartTime", "q", "r", j6f.GPS_DIRECTION_TRUE, "responseHeadersEndTime", j6f.LATITUDE_SOUTH, "responseBodyStartTime", "R", "responseBodyEndTime", "getCallEndTime", BaseSei.f13930X, "callEndTime", "u", "H", "finishTime", "Ljava/net/InetSocketAddress;", ResourceDirection.f38808v, "Ljava/net/InetSocketAddress;", "getInetSocketAddress", "()Ljava/net/InetSocketAddress;", "I", "(Ljava/net/InetSocketAddress;)V", "inetSocketAddress", "clientIp", "", "<set-?>", "Z", "isHttpDns", "()Z", "Ll/wv5;", "connection", "Ll/wv5;", "getConnection", "()Ll/wv5;", b2s.C_ZONE, "(Ll/wv5;)V", "getRequestBodyByteCount", "setRequestBodyByteCount", "requestBodyByteCount", "getResponseBodyByteCount", "Q", "responseBodyByteCount", "Ll/stc0;", "getUrl", "setUrl", "url", "requestSize", "requestHeaderSize", "requestBodySize", "Ll/exc0;", "response", "Ll/exc0;", "()Ll/exc0;", "P", "(Ll/exc0;)V", "responseCode", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "X", "(Ljava/lang/Throwable;)V", "throwable", "Lokhttp3/TlsVersion;", "Lokhttp3/TlsVersion;", "()Lokhttp3/TlsVersion;", "tlsVersion", "Companion", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class NetworkTrackInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long requestBodyByteCount;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private long responseBodyByteCount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private stc0 request;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    private String url;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String requestSize;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String requestHeaderSize;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String requestBodySize;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    private exc0 response;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private String responseCode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    private Throwable throwable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    private TlsVersion tlsVersion;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "NetworkTrackInfo";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long createTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long requestTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long callStartTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long dnsStartTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long dnsEndTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long connectStartTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long secureConnectStartTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long secureConnectEndTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long connectEndTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long connectionAcquiredTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long requestHeadersStartTime;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long requestHeadersEndTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long requestBodyStartTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private long requestBodyEndTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long responseHeadersStartTime;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private long responseHeadersEndTime;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long responseBodyStartTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private long responseBodyEndTime;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private long callEndTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private long finishTime;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    private InetSocketAddress inetSocketAddress;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private String clientIp;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private String connectIp;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isHttpDns;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private wv5 connection;

    /* JADX INFO: renamed from: A */
    public final void m18188A(@Nullable String connectIp) {
        this.connectIp = connectIp;
    }

    /* JADX INFO: renamed from: B */
    public final void m18189B(long j) {
        this.connectStartTime = j;
    }

    /* JADX INFO: renamed from: C */
    public final void m18190C(@Nullable wv5 wv5Var) {
        cll cllVarM185881k;
        this.connection = wv5Var;
        if (wv5Var != null) {
            try {
                dvk dvkVarMo101331c = wv5Var.mo101331c();
                if (dvkVarMo101331c != null) {
                    this.tlsVersion = dvkVarMo101331c.m113788g();
                }
                InetSocketAddress inetSocketAddressM145834d = wv5Var.mo101330b().m145834d();
                inetSocketAddressM145834d.getClass();
                InetAddress address = inetSocketAddressM145834d.getAddress();
                address.getClass();
                this.connectIp = address.getHostAddress();
                Socket socketMo101332d = wv5Var.mo101332d();
                socketMo101332d.getClass();
                InetAddress localAddress = socketMo101332d.getLocalAddress();
                localAddress.getClass();
                this.clientIp = localAddress.getHostAddress();
                stc0 stc0Var = this.request;
                String strM107522m = (stc0Var == null || (cllVarM185881k = stc0Var.m185881k()) == null) ? null : cllVarM185881k.m107522m();
                InetSocketAddress inetSocketAddressM145834d2 = wv5Var.mo101330b().m145834d();
                inetSocketAddressM145834d2.getClass();
                this.isHttpDns = !Intrinsics.m87488d(strM107522m, inetSocketAddressM145834d2.getHostName());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m18191D(long j) {
        this.connectionAcquiredTime = j;
    }

    /* JADX INFO: renamed from: E */
    public final void m18192E(long j) {
        this.createTime = j;
    }

    /* JADX INFO: renamed from: F */
    public final void m18193F(long j) {
        this.dnsEndTime = j;
    }

    /* JADX INFO: renamed from: G */
    public final void m18194G(long j) {
        this.dnsStartTime = j;
    }

    /* JADX INFO: renamed from: H */
    public final void m18195H(long j) {
        this.finishTime = j;
    }

    /* JADX INFO: renamed from: I */
    public final void m18196I(@Nullable InetSocketAddress inetSocketAddress) {
        this.inetSocketAddress = inetSocketAddress;
    }

    /* JADX INFO: renamed from: J */
    public final void m18197J(@Nullable stc0 request) {
        this.request = request;
        if (request != null) {
            try {
                this.url = request.m185881k().m107522m() + request.m185881k().m107518h();
                long jM166554a = request.m185875e().m166554a();
                this.requestHeaderSize = String.valueOf(jM166554a);
                int length = request.m185881k().toString().length() + 1 + ((int) jM166554a);
                if (request.m185871a() != null) {
                    utc0 utc0VarM185871a = request.m185871a();
                    if (utc0VarM185871a == null) {
                        Intrinsics.m87497m();
                    }
                    length += (int) utc0VarM185871a.contentLength();
                }
                int i = length + 1;
                this.requestSize = String.valueOf(i);
                this.requestBodySize = String.valueOf(C15167a.m87597c(((long) i) - jM166554a, 0L));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m18198K(long j) {
        this.requestBodyEndTime = j;
    }

    /* JADX INFO: renamed from: L */
    public final void m18199L(long j) {
        this.requestBodyStartTime = j;
    }

    /* JADX INFO: renamed from: M */
    public final void m18200M(long j) {
        this.requestHeadersEndTime = j;
    }

    /* JADX INFO: renamed from: N */
    public final void m18201N(long j) {
        this.requestHeadersStartTime = j;
    }

    /* JADX INFO: renamed from: O */
    public final void m18202O(long j) {
        this.requestTimestamp = j;
    }

    /* JADX INFO: renamed from: P */
    public final void m18203P(@Nullable exc0 exc0Var) {
        this.response = exc0Var;
        if (exc0Var != null) {
            this.responseCode = String.valueOf(exc0Var.m118609q());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m18204Q(long j) {
        this.responseBodyByteCount = j;
    }

    /* JADX INFO: renamed from: R */
    public final void m18205R(long j) {
        this.responseBodyEndTime = j;
    }

    /* JADX INFO: renamed from: S */
    public final void m18206S(long j) {
        this.responseBodyStartTime = j;
    }

    /* JADX INFO: renamed from: T */
    public final void m18207T(long j) {
        this.responseHeadersEndTime = j;
    }

    /* JADX INFO: renamed from: U */
    public final void m18208U(long j) {
        this.responseHeadersStartTime = j;
    }

    /* JADX INFO: renamed from: V */
    public final void m18209V(long j) {
        this.secureConnectEndTime = j;
    }

    /* JADX INFO: renamed from: W */
    public final void m18210W(long j) {
        this.secureConnectStartTime = j;
    }

    /* JADX INFO: renamed from: X */
    public final void m18211X(@Nullable Throwable th) {
        this.throwable = th;
    }

    /* JADX INFO: renamed from: Y */
    public final void m18212Y(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkTrackInfo$submit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                stc0 stc0Var;
                cll cllVarM185881k;
                String strM107522m;
                Function1<sx3, Map<String, String>> function1M180853d;
                Map<String, String> mapInvoke;
                cll cllVarM185881k2;
                cll cllVarM185881k3;
                Set<String> setM107509C;
                Strategy strategy = StrategyFetcher.INSTANCE.m18265e().get();
                stc0 stc0Var2 = this.this$0.request;
                if ((stc0Var2 != null && (cllVarM185881k3 = stc0Var2.m185881k()) != null && (setM107509C = cllVarM185881k3.m107509C()) != null && setM107509C.contains("momo_net_metrics")) || (stc0Var = this.this$0.request) == null || (cllVarM185881k = stc0Var.m185881k()) == null || (strM107522m = cllVarM185881k.m107522m()) == null) {
                    return;
                }
                Pair<Boolean, String> pairM18253o = strategy.m18253o(strM107522m);
                if (pairM18253o.getFirst().booleanValue()) {
                    NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
                    Map<String, String> mapM120419b = fc20.m120419b(networkMetricsStatistics.m18176d());
                    String str = Build.VERSION.RELEASE;
                    str.getClass();
                    mapM120419b.put("os_ver", str);
                    NetworkTrackInfo.Companion companion = NetworkTrackInfo.INSTANCE;
                    mapM120419b.put(NotificationCompat.CATEGORY_ERROR, companion.m18237c(this.this$0.getThrowable()));
                    mapM120419b.put("err_code", companion.m18236b(this.this$0.getThrowable()));
                    long jM87597c = C15167a.m87597c(this.this$0.getResponseHeadersEndTime() - this.this$0.getRequestHeadersEndTime(), 0L);
                    long jM87597c2 = C15167a.m87597c(this.this$0.getFinishTime() - this.this$0.getCreateTime(), 0L);
                    long jM87597c3 = C15167a.m87597c(this.this$0.getSecureConnectEndTime() - this.this$0.getSecureConnectStartTime(), 0L);
                    long jM87597c4 = C15167a.m87597c(this.this$0.getConnectEndTime() - this.this$0.getConnectStartTime(), 0L);
                    long jM87597c5 = C15167a.m87597c(this.this$0.getConnectionAcquiredTime() - this.this$0.getCreateTime(), 0L);
                    mapM120419b.put(com.tencent.connect.common.Constants.f57189TS, String.valueOf(this.this$0.getRequestTimestamp()));
                    mapM120419b.put("t_conn_acquired", String.valueOf(jM87597c5));
                    mapM120419b.put("t_all", String.valueOf(jM87597c2));
                    mapM120419b.put("t_dns", String.valueOf(C15167a.m87597c(this.this$0.getDnsEndTime() - this.this$0.getDnsStartTime(), 0L)));
                    mapM120419b.put("t_conn", String.valueOf(C15167a.m87597c(jM87597c4 - jM87597c3, 0L)));
                    mapM120419b.put("t_ssl", String.valueOf(jM87597c3));
                    NetworkTrackInfo networkTrackInfo = this.this$0;
                    exc0 response = networkTrackInfo.getResponse();
                    mapM120419b.put("http_ver", networkTrackInfo.m18230w(companion.m18235d(response != null ? response.m118602S() : null)));
                    NetworkTrackInfo networkTrackInfo2 = this.this$0;
                    TlsVersion tlsVersion = networkTrackInfo2.getTlsVersion();
                    mapM120419b.put("tls_ver", networkTrackInfo2.m18230w(tlsVersion != null ? tlsVersion.javaName() : null));
                    mapM120419b.put("type", this.this$0.m18230w(pairM18253o.getSecond()));
                    stc0 stc0Var3 = this.this$0.request;
                    mapM120419b.put("url", String.valueOf(stc0Var3 != null ? stc0Var3.m185881k() : null));
                    NetworkTrackInfo networkTrackInfo3 = this.this$0;
                    stc0 stc0Var4 = networkTrackInfo3.request;
                    mapM120419b.put(BLiveOperationClickAction.scheme, networkTrackInfo3.m18230w((stc0Var4 == null || (cllVarM185881k2 = stc0Var4.m185881k()) == null) ? null : cllVarM185881k2.m107514I()));
                    NetworkTrackInfo networkTrackInfo4 = this.this$0;
                    stc0 stc0Var5 = networkTrackInfo4.request;
                    mapM120419b.put("op", networkTrackInfo4.m18230w(stc0Var5 != null ? stc0Var5.m185877g() : null));
                    if (this.this$0.getThrowable() instanceof ActiveCancelException) {
                        mapM120419b.put("code", "600");
                    } else {
                        NetworkTrackInfo networkTrackInfo5 = this.this$0;
                        mapM120419b.put("code", networkTrackInfo5.m18230w(networkTrackInfo5.responseCode));
                    }
                    NetworkTrackInfo networkTrackInfo6 = this.this$0;
                    mapM120419b.put("rip", networkTrackInfo6.m18230w(networkTrackInfo6.connectIp));
                    mapM120419b.put("t_req", String.valueOf(C15167a.m87597c(this.this$0.getResponseBodyEndTime() - this.this$0.getResponseBodyStartTime(), 0L)));
                    mapM120419b.put("t_start", String.valueOf(jM87597c));
                    mapM120419b.put("t_rsp", String.valueOf(C15167a.m87597c(jM87597c2 - jM87597c, 0L)));
                    NetworkTrackInfo networkTrackInfo7 = this.this$0;
                    mapM120419b.put("s_up", networkTrackInfo7.m18230w(networkTrackInfo7.requestSize));
                    NetworkTrackInfo networkTrackInfo8 = this.this$0;
                    mapM120419b.put("s_down", networkTrackInfo8.m18230w(networkTrackInfo8.requestBodySize));
                    mapM120419b.put("is_proxy", String.valueOf(companion.m18238e()));
                    mapM120419b.put("momo_net_metrics", "true");
                    try {
                        ru5 ru5VarM18176d = networkMetricsStatistics.m18176d();
                        if (ru5VarM18176d != null && (function1M180853d = ru5VarM18176d.m180853d()) != null && (mapInvoke = function1M180853d.invoke(call)) != null) {
                            for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (value != null) {
                                    mapM120419b.put("extra_" + key, value);
                                }
                            }
                        }
                    } catch (Exception unused) {
                        NetworkMetricsStatistics.INSTANCE.m18178f();
                    }
                    NetworkMetricsStatistics.INSTANCE.m18182j(jM87597c2 <= ((long) strategy.getErrorMaxTime()) ? this.this$0.getThrowable() == null : false, jM87597c2, mapM120419b);
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getConnectEndTime() {
        return this.connectEndTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getConnectStartTime() {
        return this.connectStartTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getConnectionAcquiredTime() {
        return this.connectionAcquiredTime;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getDnsEndTime() {
        return this.dnsEndTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getDnsStartTime() {
        return this.dnsStartTime;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getFinishTime() {
        return this.finishTime;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getRequestHeadersEndTime() {
        return this.requestHeadersEndTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final exc0 getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getResponseBodyEndTime() {
        return this.responseBodyEndTime;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getResponseBodyStartTime() {
        return this.responseBodyStartTime;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getResponseHeadersEndTime() {
        return this.responseHeadersEndTime;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getSecureConnectEndTime() {
        return this.secureConnectEndTime;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getSecureConnectStartTime() {
        return this.secureConnectStartTime;
    }

    @NotNull
    public String toString() {
        return "NetworkTrackInfo{requestTimestamp=" + this.requestTimestamp + "createTime=" + this.createTime + ", isHttpDns=" + this.isHttpDns + ", requestBodyByteCount=" + this.requestBodyByteCount + ", responseBodyByteCount=" + this.responseBodyByteCount + ", url='" + this.url + ", requestHeaderSize='" + this.requestHeaderSize + ", responseCode='" + this.responseCode + ", throwable=" + this.throwable + '}';
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public final TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final String m18230w(@Nullable String str) {
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: x */
    public final void m18231x(long j) {
        this.callEndTime = j;
    }

    /* JADX INFO: renamed from: y */
    public final void m18232y(long j) {
        this.callStartTime = j;
    }

    /* JADX INFO: renamed from: z */
    public final void m18233z(long j) {
        this.connectEndTime = j;
    }

    /* JADX INFO: renamed from: com.immomo.android.network.metrics.NetworkTrackInfo$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/immomo/android/network/metrics/NetworkTrackInfo$a;", "", "<init>", "()V", "Lokhttp3/Protocol;", "protocol", "", Constants.INAPP_DATA_TAG, "(Lokhttp3/Protocol;)Ljava/lang/String;", "", "throwable", "c", "(Ljava/lang/Throwable;)Ljava/lang/String;", "b", "", "e", "()Z", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final String m18235d(Protocol protocol) {
            if (protocol == null) {
                return "-";
            }
            int i = yc20.f197408a[protocol.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return protocol.toString();
            }
            return (i == 4 || i == 5) ? "http/2.0" : "unknown";
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m18236b(@Nullable Throwable throwable) {
            if (throwable == null) {
                return "0";
            }
            if (throwable instanceof UnknownHostException) {
                return "100000";
            }
            if (throwable instanceof InterruptedIOException) {
                return "102000";
            }
            if (throwable instanceof ConnectException) {
                return "101000";
            }
            if ((throwable instanceof SSLPeerUnverifiedException) || (throwable instanceof SSLException)) {
                return "105000";
            }
            if (throwable instanceof ActiveCancelException) {
                return "109000";
            }
            return throwable instanceof IOException ? "104000" : "101000";
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m18237c(@Nullable Throwable throwable) {
            if (throwable == null) {
                return "";
            }
            if (throwable instanceof StreamResetException) {
                return "StreamResetException";
            }
            return throwable instanceof ConnectionShutdownException ? "ConnectionShutdownException" : throwable.getClass().getSimpleName();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m18238e() {
            try {
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                if (property2 == null) {
                    property2 = User.ID_TEAM_ACCOUNT;
                }
                return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
            } catch (Exception unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
