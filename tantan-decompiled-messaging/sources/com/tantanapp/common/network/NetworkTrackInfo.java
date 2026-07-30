package com.tantanapp.common.network;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.p046p1.mobile.putong.data.User;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p149l.dvk;
import p149l.exc0;
import p149l.stc0;
import p149l.wv5;

/* JADX INFO: loaded from: classes13.dex */
public class NetworkTrackInfo {
    private long callEndTime;
    private long callStartTime;
    private String clientIp;
    private long connectEndTime;
    private String connectIp;
    private long connectStartTime;
    private wv5 connection;
    private long connectionAcquiredTime;
    private long createTime;
    private long dnsEndTime;
    private long dnsStartTime;
    private String domainName;
    private long finishTime;
    private dvk handshake;
    private InetSocketAddress inetSocketAddress;
    private boolean isCancel = false;
    private boolean isHttpDns = false;
    private Protocol protocol;
    private long rangeStart;
    private ReportType reportType;
    private stc0 request;
    private long requestBodyByteCount;
    private long requestBodyEndTime;
    private String requestBodySize;
    private long requestBodyStartTime;
    private String requestHeaderSize;
    private long requestHeadersEndTime;
    private long requestHeadersStartTime;
    private String requestSize;
    private long requestTimestamp;
    private exc0 response;
    private long responseBodyByteCount;
    private long responseBodyEndTime;
    private long responseBodyStartTime;
    private String responseCode;
    private long responseHeadersEndTime;
    private long responseHeadersStartTime;
    private long secureConnectEndTime;
    private long secureConnectStartTime;
    private Throwable throwable;
    private TlsVersion tlsVersion;
    private String url;

    public enum ReportType {
        MEDIA("media"),
        API("api"),
        PING("ping"),
        AV("media"),
        UNKNOWN("unknown");

        private String mMessage;

        ReportType(String str) {
            this.mMessage = str;
        }

        public String getTypeStr() {
            return this.mMessage;
        }
    }

    public static String getErrCode(Throwable th) {
        if (th == null) {
            return "0";
        }
        if (th instanceof UnknownHostException) {
            return "100000";
        }
        if (th instanceof InterruptedIOException) {
            return "102000";
        }
        if (th instanceof ConnectException) {
            return "101000";
        }
        if (th instanceof JsonProcessingException) {
            return "201200";
        }
        if (th instanceof ApiExcep.Client.Unauthorized) {
            return "202200";
        }
        return th instanceof ApiExcep.Client.TooManyRequests ? "203200" : "101000";
    }

    public static String getException(Throwable th) {
        if (th == null) {
            return "";
        }
        if (th instanceof StreamResetException) {
            return "StreamResetException";
        }
        if (th instanceof ConnectionShutdownException) {
            return "ConnectionShutdownException";
        }
        return th instanceof JsonParseException ? "JsonParseException" : th.getClass().getSimpleName();
    }

    public static boolean ifProxyExist() {
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

    public long getCallEndTime() {
        return this.callEndTime;
    }

    public long getCallStartTime() {
        return this.callStartTime;
    }

    public String getClientIp() {
        return this.clientIp != null ? this.connectIp : "";
    }

    public long getConnectEndTime() {
        return this.connectEndTime;
    }

    public String getConnectIp() {
        String str = this.connectIp;
        return str != null ? str : "";
    }

    public long getConnectStartTime() {
        return this.connectStartTime;
    }

    public wv5 getConnection() {
        return this.connection;
    }

    public long getConnectionAcquiredTime() {
        return this.connectionAcquiredTime;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public long getDnsEndTime() {
        return this.dnsEndTime;
    }

    public long getDnsStartTime() {
        return this.dnsStartTime;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public String getExceptionMessage() {
        return getException(this.throwable);
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public dvk getHandshake() {
        return this.handshake;
    }

    public InetSocketAddress getInetSocketAddress() {
        return this.inetSocketAddress;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    public long getRangeStart() {
        return this.rangeStart;
    }

    public ReportType getReportType() {
        return this.reportType;
    }

    public stc0 getRequest() {
        return this.request;
    }

    public long getRequestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public long getRequestBodyEndTime() {
        return this.requestBodyEndTime;
    }

    public String getRequestBodySize() {
        String str = this.requestBodySize;
        return str != null ? str : "0";
    }

    public long getRequestBodyStartTime() {
        return this.requestBodyStartTime;
    }

    public String getRequestHeaderSize() {
        String str = this.requestHeaderSize;
        return str != null ? str : "";
    }

    public long getRequestHeadersEndTime() {
        return this.requestHeadersEndTime;
    }

    public long getRequestHeadersStartTime() {
        return this.requestHeadersStartTime;
    }

    public String getRequestMethod() {
        stc0 stc0Var = this.request;
        return stc0Var != null ? stc0Var.m185877g() : "";
    }

    public String getRequestSize() {
        String str = this.requestSize;
        return str != null ? str : "";
    }

    public long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public String getRequestUrl() {
        String str = this.url;
        return str != null ? str : "";
    }

    public exc0 getResponse() {
        return this.response;
    }

    public long getResponseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public long getResponseBodyEndTime() {
        return this.responseBodyEndTime;
    }

    public long getResponseBodyStartTime() {
        return this.responseBodyStartTime;
    }

    public String getResponseCode() {
        String str = this.responseCode;
        return str != null ? str : "0";
    }

    public long getResponseHeadersEndTime() {
        return this.responseHeadersEndTime;
    }

    public long getResponseHeadersStartTime() {
        return this.responseHeadersStartTime;
    }

    public long getSecureConnectEndTime() {
        return this.secureConnectEndTime;
    }

    public long getSecureConnectStartTime() {
        return this.secureConnectStartTime;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isCancel() {
        return this.isCancel;
    }

    public boolean isHttpDns() {
        return this.isHttpDns;
    }

    public void setCallEndTime(long j) {
        this.callEndTime = j;
    }

    public void setCallStartTime(long j) {
        this.callStartTime = j;
    }

    public void setCancel(boolean z) {
        this.isCancel = z;
    }

    public void setClientIp(String str) {
        this.clientIp = str;
    }

    public void setConnectEndTime(long j) {
        this.connectEndTime = j;
    }

    public void setConnectIp(String str) {
        this.connectIp = str;
    }

    public void setConnectStartTime(long j) {
        this.connectStartTime = j;
    }

    public void setConnection(wv5 wv5Var) {
        this.connection = wv5Var;
        if (wv5Var != null) {
            try {
                dvk dvkVarMo101331c = wv5Var.mo101331c();
                if (dvkVarMo101331c != null) {
                    this.tlsVersion = dvkVarMo101331c.m113788g();
                }
                this.connectIp = wv5Var.mo101330b().m145834d().getAddress().getHostAddress();
                this.clientIp = wv5Var.mo101332d().getLocalAddress().getHostAddress();
                this.isHttpDns = !this.request.m185881k().m107522m().equals(wv5Var.mo101330b().m145834d().getHostName());
            } catch (Exception unused) {
            }
        }
    }

    public void setConnectionAcquiredTime(long j) {
        this.connectionAcquiredTime = j;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDnsEndTime(long j) {
        this.dnsEndTime = j;
    }

    public void setDnsStartTime(long j) {
        this.dnsStartTime = j;
    }

    public void setDomainName(String str) {
        this.domainName = str;
    }

    public void setFinishTime(long j) {
        this.finishTime = j;
    }

    public void setHandshake(dvk dvkVar) {
        this.handshake = dvkVar;
    }

    public void setInetSocketAddress(InetSocketAddress inetSocketAddress) {
        this.inetSocketAddress = inetSocketAddress;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public void setRangeStart(long j) {
        this.rangeStart = j;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public void setRequest(stc0 stc0Var) {
        this.request = stc0Var;
        if (stc0Var != null) {
            try {
                this.url = stc0Var.m185881k().m107522m() + stc0Var.m185881k().m107518h();
                long jM166554a = stc0Var.m185875e().m166554a();
                this.requestHeaderSize = String.valueOf(jM166554a);
                int length = (int) (((long) (stc0Var.m185881k().toString().length() + 1)) + jM166554a);
                if (stc0Var.m185871a() != null) {
                    length = (int) (((long) length) + stc0Var.m185871a().contentLength());
                }
                int i = length + 1;
                this.requestSize = String.valueOf(i);
                this.requestBodySize = String.valueOf(Math.max(((long) i) - jM166554a, 0L));
            } catch (Exception unused) {
            }
        }
    }

    public void setRequestBodyByteCount(long j) {
        this.requestBodyByteCount = j;
    }

    public void setRequestBodyEndTime(long j) {
        this.requestBodyEndTime = j;
    }

    public void setRequestBodyStartTime(long j) {
        this.requestBodyStartTime = j;
    }

    public void setRequestHeaderSize(String str) {
        this.requestHeaderSize = str;
    }

    public void setRequestHeadersEndTime(long j) {
        this.requestHeadersEndTime = j;
    }

    public void setRequestHeadersStartTime(long j) {
        this.requestHeadersStartTime = j;
    }

    public void setRequestSize(String str) {
        this.requestSize = str;
    }

    public void setRequestTimestamp(long j) {
        this.requestTimestamp = j;
    }

    public void setResponse(exc0 exc0Var) {
        this.response = exc0Var;
        if (exc0Var != null) {
            this.responseCode = String.valueOf(exc0Var.m118609q());
        }
    }

    public void setResponseBodyByteCount(long j) {
        this.responseBodyByteCount = j;
    }

    public void setResponseBodyEndTime(long j) {
        this.responseBodyEndTime = j;
    }

    public void setResponseBodyStartTime(long j) {
        this.responseBodyStartTime = j;
    }

    public void setResponseCode(String str) {
        this.responseCode = str;
    }

    public void setResponseHeadersEndTime(long j) {
        this.responseHeadersEndTime = j;
    }

    public void setResponseHeadersStartTime(long j) {
        this.responseHeadersStartTime = j;
    }

    public void setSecureConnectEndTime(long j) {
        this.secureConnectEndTime = j;
    }

    public void setSecureConnectStartTime(long j) {
        this.secureConnectStartTime = j;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "NetworkTrackInfo{requestTimestamp=" + this.requestTimestamp + "createTime=" + this.createTime + ", isHttpDns=" + this.isHttpDns + ", requestBodyByteCount=" + this.requestBodyByteCount + ", responseBodyByteCount=" + this.responseBodyByteCount + ", reportType=" + this.reportType + ", url='" + this.url + ", requestHeaderSize='" + this.requestHeaderSize + ", responseCode='" + this.responseCode + ", throwable=" + this.throwable + '}';
    }
}
