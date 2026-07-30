package com.tantanapp.common.network;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.p051p1.mobile.putong.data.User;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p153l.bx5;
import p153l.i5d0;
import p153l.txk;
import p153l.x1d0;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkTrackInfo {
    private long callEndTime;
    private long callStartTime;
    private String clientIp;
    private long connectEndTime;
    private String connectIp;
    private long connectStartTime;
    private bx5 connection;
    private long connectionAcquiredTime;
    private long createTime;
    private long dnsEndTime;
    private long dnsStartTime;
    private String domainName;
    private long finishTime;
    private txk handshake;
    private InetSocketAddress inetSocketAddress;
    private boolean isCancel = false;
    private boolean isHttpDns = false;
    private Protocol protocol;
    private long rangeStart;
    private ReportType reportType;
    private x1d0 request;
    private long requestBodyByteCount;
    private long requestBodyEndTime;
    private String requestBodySize;
    private long requestBodyStartTime;
    private String requestHeaderSize;
    private long requestHeadersEndTime;
    private long requestHeadersStartTime;
    private String requestSize;
    private long requestTimestamp;
    private i5d0 response;
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

    public bx5 getConnection() {
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

    public txk getHandshake() {
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

    public x1d0 getRequest() {
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
        x1d0 x1d0Var = this.request;
        return x1d0Var != null ? x1d0Var.m209022g() : "";
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

    public i5d0 getResponse() {
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

    public void setConnection(bx5 bx5Var) {
        this.connection = bx5Var;
        if (bx5Var != null) {
            try {
                txk txkVarMo106826c = bx5Var.mo106826c();
                if (txkVarMo106826c != null) {
                    this.tlsVersion = txkVarMo106826c.m193507g();
                }
                this.connectIp = bx5Var.mo106825b().m163864d().getAddress().getHostAddress();
                this.clientIp = bx5Var.mo106827d().getLocalAddress().getHostAddress();
                this.isHttpDns = !this.request.m209026k().m182286m().equals(bx5Var.mo106825b().m163864d().getHostName());
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

    public void setHandshake(txk txkVar) {
        this.handshake = txkVar;
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

    public void setRequest(x1d0 x1d0Var) {
        this.request = x1d0Var;
        if (x1d0Var != null) {
            try {
                this.url = x1d0Var.m209026k().m182286m() + x1d0Var.m209026k().m182282h();
                long jM118873a = x1d0Var.m209020e().m118873a();
                this.requestHeaderSize = String.valueOf(jM118873a);
                int length = (int) (((long) (x1d0Var.m209026k().toString().length() + 1)) + jM118873a);
                if (x1d0Var.m209016a() != null) {
                    length = (int) (((long) length) + x1d0Var.m209016a().contentLength());
                }
                int i = length + 1;
                this.requestSize = String.valueOf(i);
                this.requestBodySize = String.valueOf(Math.max(((long) i) - jM118873a, 0L));
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

    public void setResponse(i5d0 i5d0Var) {
        this.response = i5d0Var;
        if (i5d0Var != null) {
            this.responseCode = String.valueOf(i5d0Var.m138673q());
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
