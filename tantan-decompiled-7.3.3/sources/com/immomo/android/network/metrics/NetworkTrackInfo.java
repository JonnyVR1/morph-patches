package com.immomo.android.network.metrics;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bx5;
import p153l.c4s;
import p153l.i5d0;
import p153l.il20;
import p153l.ok20;
import p153l.p7f;
import p153l.rnl;
import p153l.ry3;
import p153l.txk;
import p153l.vv5;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bD\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010&\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0007\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\"\u0010*\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\"\u0010.\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\"\u00101\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0007\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0007\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001dR\"\u00108\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR\"\u0010:\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0007\u001a\u0004\b+\u0010\u001b\"\u0004\b9\u0010\u001dR\"\u0010<\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0007\u001a\u0004\b2\u0010\u001b\"\u0004\b;\u0010\u001dR\"\u0010@\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0007\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\"\u0010C\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0007\u001a\u0004\bA\u0010\u001b\"\u0004\bB\u0010\u001dR\"\u0010F\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\bD\u0010\u001b\"\u0004\bE\u0010\u001dR\"\u0010J\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\u0007\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR\"\u0010N\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0007\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR\"\u0010R\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0007\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR\"\u0010T\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010\u0007\u001a\u0004\bO\u0010\u001b\"\u0004\bS\u0010\u001dR\"\u0010V\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0007\u001a\u0004\bK\u0010\u001b\"\u0004\bU\u0010\u001dR\"\u0010Y\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0007\u001a\u0004\bW\u0010\u001b\"\u0004\bX\u0010\u001dR\"\u0010\\\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0007\u001a\u0004\b=\u0010\u001b\"\u0004\b[\u0010\u001dR$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010\u0016R$\u0010i\u001a\u00020f2\u0006\u0010g\u001a\u00020f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010h\u001a\u0004\bi\u0010jR.\u0010l\u001a\u0004\u0018\u00010k2\b\u0010l\u001a\u0004\u0018\u00010k8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010t\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0007\u001a\u0004\br\u0010\u001b\"\u0004\bs\u0010\u001dR\"\u0010w\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0007\u001a\u0004\bu\u0010\u001b\"\u0004\bv\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010xR$\u0010{\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0016\u001a\u0004\by\u0010\u000e\"\u0004\bz\u0010\fR\u0018\u0010|\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010}\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u0016R\u0018\u0010~\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0016R4\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@FX\u0086\u000e¢\u0006\u0016\n\u0005\b[\u0010\u0081\u0001\u001a\u0005\bG\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0016R*\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0007\u0010\u0087\u0001\u001a\u0005\bZ\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R-\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010g\u001a\u0005\u0018\u00010\u008c\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bI\u0010\u008d\u0001\u001a\u0005\b^\u0010\u008e\u0001¨\u0006\u0091\u0001"}, m88121d2 = {"Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "", "<init>", "()V", "Ll/x1d0;", SocialConstants.TYPE_REQUEST, "", "J", "(Ll/x1d0;)V", "", "connectIp", "A", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ll/ry3;", "call", "Y", "(Ll/ry3;)V", "w", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "", "b", RXScreenCaptureService.KEY_INDEX, "()J", "E", "(J)V", "createTime", "c", "n", BloodType.f39576O, "requestTimestamp", Constants.INAPP_DATA_TAG, "getCallStartTime", BaseSei.f14625Y, "callStartTime", "e", "k", "G", "dnsStartTime", "f", "j", "F", "dnsEndTime", "g", "B", "connectStartTime", "h", Constants.KEY_T, "W", "secureConnectStartTime", BLiveStormDanmakuGiftResourceType.f45294s, p7f.GPS_MEASUREMENT_INTERRUPTED, "secureConnectEndTime", BaseSei.f14626Z, "connectEndTime", "D", "connectionAcquiredTime", BLiveStormDanmakuGiftResourceType.f45292l, "getRequestHeadersStartTime", "N", "requestHeadersStartTime", "m", "M", "requestHeadersEndTime", "getRequestBodyStartTime", "L", "requestBodyStartTime", "o", "getRequestBodyEndTime", "K", "requestBodyEndTime", "p", "getResponseHeadersStartTime", "U", "responseHeadersStartTime", "q", "r", p7f.GPS_DIRECTION_TRUE, "responseHeadersEndTime", p7f.LATITUDE_SOUTH, "responseBodyStartTime", "R", "responseBodyEndTime", "getCallEndTime", BaseSei.f14624X, "callEndTime", "u", "H", "finishTime", "Ljava/net/InetSocketAddress;", ResourceDirection.f39656v, "Ljava/net/InetSocketAddress;", "getInetSocketAddress", "()Ljava/net/InetSocketAddress;", "I", "(Ljava/net/InetSocketAddress;)V", "inetSocketAddress", "clientIp", "", "<set-?>", "Z", "isHttpDns", "()Z", "Ll/bx5;", "connection", "Ll/bx5;", "getConnection", "()Ll/bx5;", c4s.C_ZONE, "(Ll/bx5;)V", "getRequestBodyByteCount", "setRequestBodyByteCount", "requestBodyByteCount", "getResponseBodyByteCount", "Q", "responseBodyByteCount", "Ll/x1d0;", "getUrl", "setUrl", "url", "requestSize", "requestHeaderSize", "requestBodySize", "Ll/i5d0;", "response", "Ll/i5d0;", "()Ll/i5d0;", "P", "(Ll/i5d0;)V", "responseCode", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "X", "(Ljava/lang/Throwable;)V", "throwable", "Lokhttp3/TlsVersion;", "Lokhttp3/TlsVersion;", "()Lokhttp3/TlsVersion;", "tlsVersion", "Companion", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class NetworkTrackInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long requestBodyByteCount;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private long responseBodyByteCount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private x1d0 request;

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
    private i5d0 response;

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
    private bx5 connection;

    /* JADX INFO: renamed from: A */
    public final void m19265A(@Nullable String connectIp) {
        this.connectIp = connectIp;
    }

    /* JADX INFO: renamed from: B */
    public final void m19266B(long j) {
        this.connectStartTime = j;
    }

    /* JADX INFO: renamed from: C */
    public final void m19267C(@Nullable bx5 bx5Var) {
        rnl rnlVarM209026k;
        this.connection = bx5Var;
        if (bx5Var != null) {
            try {
                txk txkVarMo106826c = bx5Var.mo106826c();
                if (txkVarMo106826c != null) {
                    this.tlsVersion = txkVarMo106826c.m193507g();
                }
                InetSocketAddress inetSocketAddressM163864d = bx5Var.mo106825b().m163864d();
                inetSocketAddressM163864d.getClass();
                InetAddress address = inetSocketAddressM163864d.getAddress();
                address.getClass();
                this.connectIp = address.getHostAddress();
                Socket socketMo106827d = bx5Var.mo106827d();
                socketMo106827d.getClass();
                InetAddress localAddress = socketMo106827d.getLocalAddress();
                localAddress.getClass();
                this.clientIp = localAddress.getHostAddress();
                x1d0 x1d0Var = this.request;
                String strM182286m = (x1d0Var == null || (rnlVarM209026k = x1d0Var.m209026k()) == null) ? null : rnlVarM209026k.m182286m();
                InetSocketAddress inetSocketAddressM163864d2 = bx5Var.mo106825b().m163864d();
                inetSocketAddressM163864d2.getClass();
                this.isHttpDns = !Intrinsics.m88377d(strM182286m, inetSocketAddressM163864d2.getHostName());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m19268D(long j) {
        this.connectionAcquiredTime = j;
    }

    /* JADX INFO: renamed from: E */
    public final void m19269E(long j) {
        this.createTime = j;
    }

    /* JADX INFO: renamed from: F */
    public final void m19270F(long j) {
        this.dnsEndTime = j;
    }

    /* JADX INFO: renamed from: G */
    public final void m19271G(long j) {
        this.dnsStartTime = j;
    }

    /* JADX INFO: renamed from: H */
    public final void m19272H(long j) {
        this.finishTime = j;
    }

    /* JADX INFO: renamed from: I */
    public final void m19273I(@Nullable InetSocketAddress inetSocketAddress) {
        this.inetSocketAddress = inetSocketAddress;
    }

    /* JADX INFO: renamed from: J */
    public final void m19274J(@Nullable x1d0 request) {
        this.request = request;
        if (request != null) {
            try {
                this.url = request.m209026k().m182286m() + request.m209026k().m182282h();
                long jM118873a = request.m209020e().m118873a();
                this.requestHeaderSize = String.valueOf(jM118873a);
                int length = request.m209026k().toString().length() + 1 + ((int) jM118873a);
                if (request.m209016a() != null) {
                    z1d0 z1d0VarM209016a = request.m209016a();
                    if (z1d0VarM209016a == null) {
                        Intrinsics.m88386m();
                    }
                    length += (int) z1d0VarM209016a.contentLength();
                }
                int i = length + 1;
                this.requestSize = String.valueOf(i);
                this.requestBodySize = String.valueOf(C15274a.m88487c(((long) i) - jM118873a, 0L));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m19275K(long j) {
        this.requestBodyEndTime = j;
    }

    /* JADX INFO: renamed from: L */
    public final void m19276L(long j) {
        this.requestBodyStartTime = j;
    }

    /* JADX INFO: renamed from: M */
    public final void m19277M(long j) {
        this.requestHeadersEndTime = j;
    }

    /* JADX INFO: renamed from: N */
    public final void m19278N(long j) {
        this.requestHeadersStartTime = j;
    }

    /* JADX INFO: renamed from: O */
    public final void m19279O(long j) {
        this.requestTimestamp = j;
    }

    /* JADX INFO: renamed from: P */
    public final void m19280P(@Nullable i5d0 i5d0Var) {
        this.response = i5d0Var;
        if (i5d0Var != null) {
            this.responseCode = String.valueOf(i5d0Var.m138673q());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m19281Q(long j) {
        this.responseBodyByteCount = j;
    }

    /* JADX INFO: renamed from: R */
    public final void m19282R(long j) {
        this.responseBodyEndTime = j;
    }

    /* JADX INFO: renamed from: S */
    public final void m19283S(long j) {
        this.responseBodyStartTime = j;
    }

    /* JADX INFO: renamed from: T */
    public final void m19284T(long j) {
        this.responseHeadersEndTime = j;
    }

    /* JADX INFO: renamed from: U */
    public final void m19285U(long j) {
        this.responseHeadersStartTime = j;
    }

    /* JADX INFO: renamed from: V */
    public final void m19286V(long j) {
        this.secureConnectEndTime = j;
    }

    /* JADX INFO: renamed from: W */
    public final void m19287W(long j) {
        this.secureConnectStartTime = j;
    }

    /* JADX INFO: renamed from: X */
    public final void m19288X(@Nullable Throwable th) {
        this.throwable = th;
    }

    /* JADX INFO: renamed from: Y */
    public final void m19289Y(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkTrackInfo$submit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                x1d0 x1d0Var;
                rnl rnlVarM209026k;
                String strM182286m;
                Function1<ry3, Map<String, String>> function1M202998d;
                Map<String, String> mapInvoke;
                rnl rnlVarM209026k2;
                rnl rnlVarM209026k3;
                Set<String> setM182273C;
                Strategy strategy = StrategyFetcher.INSTANCE.m19342e().get();
                x1d0 x1d0Var2 = this.this$0.request;
                if ((x1d0Var2 != null && (rnlVarM209026k3 = x1d0Var2.m209026k()) != null && (setM182273C = rnlVarM209026k3.m182273C()) != null && setM182273C.contains("momo_net_metrics")) || (x1d0Var = this.this$0.request) == null || (rnlVarM209026k = x1d0Var.m209026k()) == null || (strM182286m = rnlVarM209026k.m182286m()) == null) {
                    return;
                }
                Pair<Boolean, String> pairM19330o = strategy.m19330o(strM182286m);
                if (pairM19330o.getFirst().booleanValue()) {
                    NetworkMetricsStatistics networkMetricsStatistics = NetworkMetricsStatistics.INSTANCE;
                    Map<String, String> mapM167976b = ok20.m167976b(networkMetricsStatistics.m19253d());
                    String str = Build.VERSION.RELEASE;
                    str.getClass();
                    mapM167976b.put("os_ver", str);
                    NetworkTrackInfo.Companion companion = NetworkTrackInfo.INSTANCE;
                    mapM167976b.put(NotificationCompat.CATEGORY_ERROR, companion.m19314c(this.this$0.getThrowable()));
                    mapM167976b.put("err_code", companion.m19313b(this.this$0.getThrowable()));
                    long jM88487c = C15274a.m88487c(this.this$0.getResponseHeadersEndTime() - this.this$0.getRequestHeadersEndTime(), 0L);
                    long jM88487c2 = C15274a.m88487c(this.this$0.getFinishTime() - this.this$0.getCreateTime(), 0L);
                    long jM88487c3 = C15274a.m88487c(this.this$0.getSecureConnectEndTime() - this.this$0.getSecureConnectStartTime(), 0L);
                    long jM88487c4 = C15274a.m88487c(this.this$0.getConnectEndTime() - this.this$0.getConnectStartTime(), 0L);
                    long jM88487c5 = C15274a.m88487c(this.this$0.getConnectionAcquiredTime() - this.this$0.getCreateTime(), 0L);
                    mapM167976b.put(com.tencent.connect.common.Constants.f58037TS, String.valueOf(this.this$0.getRequestTimestamp()));
                    mapM167976b.put("t_conn_acquired", String.valueOf(jM88487c5));
                    mapM167976b.put("t_all", String.valueOf(jM88487c2));
                    mapM167976b.put("t_dns", String.valueOf(C15274a.m88487c(this.this$0.getDnsEndTime() - this.this$0.getDnsStartTime(), 0L)));
                    mapM167976b.put("t_conn", String.valueOf(C15274a.m88487c(jM88487c4 - jM88487c3, 0L)));
                    mapM167976b.put("t_ssl", String.valueOf(jM88487c3));
                    NetworkTrackInfo networkTrackInfo = this.this$0;
                    i5d0 response = networkTrackInfo.getResponse();
                    mapM167976b.put("http_ver", networkTrackInfo.m19307w(companion.m19312d(response != null ? response.m138666S() : null)));
                    NetworkTrackInfo networkTrackInfo2 = this.this$0;
                    TlsVersion tlsVersion = networkTrackInfo2.getTlsVersion();
                    mapM167976b.put("tls_ver", networkTrackInfo2.m19307w(tlsVersion != null ? tlsVersion.javaName() : null));
                    mapM167976b.put("type", this.this$0.m19307w(pairM19330o.getSecond()));
                    x1d0 x1d0Var3 = this.this$0.request;
                    mapM167976b.put("url", String.valueOf(x1d0Var3 != null ? x1d0Var3.m209026k() : null));
                    NetworkTrackInfo networkTrackInfo3 = this.this$0;
                    x1d0 x1d0Var4 = networkTrackInfo3.request;
                    mapM167976b.put(BLiveOperationClickAction.scheme, networkTrackInfo3.m19307w((x1d0Var4 == null || (rnlVarM209026k2 = x1d0Var4.m209026k()) == null) ? null : rnlVarM209026k2.m182278I()));
                    NetworkTrackInfo networkTrackInfo4 = this.this$0;
                    x1d0 x1d0Var5 = networkTrackInfo4.request;
                    mapM167976b.put("op", networkTrackInfo4.m19307w(x1d0Var5 != null ? x1d0Var5.m209022g() : null));
                    if (this.this$0.getThrowable() instanceof ActiveCancelException) {
                        mapM167976b.put("code", "600");
                    } else {
                        NetworkTrackInfo networkTrackInfo5 = this.this$0;
                        mapM167976b.put("code", networkTrackInfo5.m19307w(networkTrackInfo5.responseCode));
                    }
                    NetworkTrackInfo networkTrackInfo6 = this.this$0;
                    mapM167976b.put("rip", networkTrackInfo6.m19307w(networkTrackInfo6.connectIp));
                    mapM167976b.put("t_req", String.valueOf(C15274a.m88487c(this.this$0.getResponseBodyEndTime() - this.this$0.getResponseBodyStartTime(), 0L)));
                    mapM167976b.put("t_start", String.valueOf(jM88487c));
                    mapM167976b.put("t_rsp", String.valueOf(C15274a.m88487c(jM88487c2 - jM88487c, 0L)));
                    NetworkTrackInfo networkTrackInfo7 = this.this$0;
                    mapM167976b.put("s_up", networkTrackInfo7.m19307w(networkTrackInfo7.requestSize));
                    NetworkTrackInfo networkTrackInfo8 = this.this$0;
                    mapM167976b.put("s_down", networkTrackInfo8.m19307w(networkTrackInfo8.requestBodySize));
                    mapM167976b.put("is_proxy", String.valueOf(companion.m19315e()));
                    mapM167976b.put("momo_net_metrics", "true");
                    try {
                        vv5 vv5VarM19253d = networkMetricsStatistics.m19253d();
                        if (vv5VarM19253d != null && (function1M202998d = vv5VarM19253d.m202998d()) != null && (mapInvoke = function1M202998d.invoke(call)) != null) {
                            for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                                String key = entry.getKey();
                                String value = entry.getValue();
                                if (value != null) {
                                    mapM167976b.put("extra_" + key, value);
                                }
                            }
                        }
                    } catch (Exception unused) {
                        NetworkMetricsStatistics.INSTANCE.m19255f();
                    }
                    NetworkMetricsStatistics.INSTANCE.m19259j(jM88487c2 <= ((long) strategy.getErrorMaxTime()) ? this.this$0.getThrowable() == null : false, jM88487c2, mapM167976b);
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
    public final i5d0 getResponse() {
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
    public final String m19307w(@Nullable String str) {
        return str != null ? str : "";
    }

    /* JADX INFO: renamed from: x */
    public final void m19308x(long j) {
        this.callEndTime = j;
    }

    /* JADX INFO: renamed from: y */
    public final void m19309y(long j) {
        this.callStartTime = j;
    }

    /* JADX INFO: renamed from: z */
    public final void m19310z(long j) {
        this.connectEndTime = j;
    }

    /* JADX INFO: renamed from: com.immomo.android.network.metrics.NetworkTrackInfo$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/immomo/android/network/metrics/NetworkTrackInfo$a;", "", "<init>", "()V", "Lokhttp3/Protocol;", "protocol", "", Constants.INAPP_DATA_TAG, "(Lokhttp3/Protocol;)Ljava/lang/String;", "", "throwable", "c", "(Ljava/lang/Throwable;)Ljava/lang/String;", "b", "", "e", "()Z", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final String m19312d(Protocol protocol) {
            if (protocol == null) {
                return "-";
            }
            int i = il20.f115518a[protocol.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return protocol.toString();
            }
            return (i == 4 || i == 5) ? "http/2.0" : "unknown";
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final String m19313b(@Nullable Throwable throwable) {
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
        public final String m19314c(@Nullable Throwable throwable) {
            if (throwable == null) {
                return "";
            }
            if (throwable instanceof StreamResetException) {
                return "StreamResetException";
            }
            return throwable instanceof ConnectionShutdownException ? "ConnectionShutdownException" : throwable.getClass().getSimpleName();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m19315e() {
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
