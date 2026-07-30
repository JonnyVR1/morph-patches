package com.immomo.momosec.network;

import java.util.Locale;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.ggw;
import p149l.qkq0;
import p149l.rjw;

/* JADX INFO: loaded from: classes7.dex */
public class HttpBaseException extends Exception {
    private static final String DEFAULT_VALUE = rjw.m179664a(new byte[]{126, 73, 112});
    private static final String MESSAGE_FORMAT = rjw.m179664a(new byte[]{120, 50, 101, 103, 65, 52, 85, 23, 68, 82, 18, 18, Tnaf.POW_2_WIDTH, HttpTokens.SPACE, 80, 94, HttpTokens.CARRIAGE_RETURN, 3, 84, 92, HttpTokens.SEMI_COLON, 114, 19, 20, 95, 20, 17, 99, 24, 22, 85, 92, 17, 18, 18, 108, 125, 3, 66, 68, 0, 1, 85, 92, 17, 18, 18, 108, 101, 52, 125, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 108, 97, 86, 19, 7, 93, 21, 11, 23, 68, 21, HttpTokens.COLON, 53, 69, 86, 21, 19, 67, 70, 114, 88, 5, 3, 10, 70, 20, 83, 107, 52, 85, 18, 67, 78, 65, 37, 95, 19, 95, 67, 91, 70, 21, 2, HttpTokens.SEMI_COLON, 99, 14, 18, 81, 10, 17, 99, 8, 11, 85, 92, 17, 18, 79, 84, 86, 21, HttpTokens.SEMI_COLON, 101, 0, 17, Tnaf.POW_2_WIDTH, 52, 84, 68, 17, 9, 94, 21, 84, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 108, 98, 115, 42, 70, 102, 3, 67, 68, 8, 9, 94, 92, 17, 18, 18});
    private static final long serialVersionUID = 1;
    private final ErrorType errorType;
    private final String rawResponse;
    private final String requestParams;
    private final int retryCount;
    private final String sdkVersion;
    private final int statusCode;
    private final long totalTime;
    private final String url;

    public enum ErrorType {
        NETWORK(rjw.m179664a(new byte[]{126, 3, 69, 64, 14, 20, 91, 70, 116, 69, 19, 9, 66})),
        DECRYPTION(rjw.m179664a(new byte[]{116, 3, 82, 69, 24, 22, 68, 15, 94, 89, 65, 35, 66, 20, 94, 69})),
        JSON_PARSE(rjw.m179664a(new byte[]{122, 53, 126, 121, 65, 54, 81, 20, 66, 82, 65, 35, 66, 20, 94, 69})),
        SERVER_ERROR(rjw.m179664a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 35, 67, 69, 14, 20})),
        UNKNOWN(rjw.m179664a(new byte[]{101, 8, 90, 89, 14, 17, 94, 70, 116, 69, 19, 9, 66}));

        private final String description;

        ErrorType(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momosec.network.HttpBaseException$a */
    public static class C3916a {

        /* JADX INFO: renamed from: a */
        private String f13966a;

        /* JADX INFO: renamed from: b */
        private Throwable f13967b;

        /* JADX INFO: renamed from: c */
        private String f13968c;

        /* JADX INFO: renamed from: d */
        private String f13969d;

        /* JADX INFO: renamed from: f */
        private int f13971f;

        /* JADX INFO: renamed from: g */
        private long f13972g;

        /* JADX INFO: renamed from: h */
        private String f13973h;

        /* JADX INFO: renamed from: e */
        private int f13970e = -1;

        /* JADX INFO: renamed from: i */
        private ErrorType f13974i = ErrorType.UNKNOWN;

        /* JADX INFO: renamed from: t */
        private void m19308t() {
            if (this.f13966a == null) {
                qkq0.m175383a(rjw.m179664a(new byte[]{125, 3, 66, 68, 0, 1, 85, 70, 82, 86, 15, 8, 95, 18, 17, 85, 4, 70, 94, 19, 93, 91}));
                return;
            }
            if (this.f13968c == null) {
                this.f13968c = rjw.m179664a(new byte[]{126, 73, 112});
            }
            if (this.f13969d == null) {
                this.f13969d = rjw.m179664a(new byte[]{126, 73, 112});
            }
            if (this.f13973h == null) {
                this.f13973h = rjw.m179664a(new byte[]{126, 73, 112});
            }
            if (this.f13974i == null) {
                this.f13974i = ErrorType.UNKNOWN;
            }
        }

        /* JADX INFO: renamed from: j */
        public HttpBaseException m19309j() {
            m19308t();
            return new HttpBaseException(this);
        }

        /* JADX INFO: renamed from: k */
        public C3916a m19310k(Throwable th) {
            this.f13967b = th;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C3916a m19311l(ErrorType errorType) {
            this.f13974i = errorType;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C3916a m19312m(String str) {
            this.f13966a = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3916a m19313n(String str) {
            this.f13973h = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C3916a m19314o(String str) {
            this.f13969d = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C3916a m19315p(int i) {
            this.f13971f = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3916a m19316q(int i) {
            this.f13970e = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C3916a m19317r(long j) {
            this.f13972g = j;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C3916a m19318s(String str) {
            this.f13968c = str;
            return this;
        }
    }

    public HttpBaseException(C3916a c3916a) {
        super(c3916a.f13966a, c3916a.f13967b);
        this.url = c3916a.f13968c;
        this.requestParams = c3916a.f13969d;
        this.statusCode = c3916a.f13970e;
        this.retryCount = c3916a.f13971f;
        this.totalTime = c3916a.f13972g;
        this.rawResponse = c3916a.f13973h;
        this.sdkVersion = ggw.m126042b();
        this.errorType = c3916a.f13974i;
    }

    private static String buildFullMessage(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        while (th != null) {
            sb.append(rjw.m179664a(new byte[]{Tnaf.POW_2_WIDTH, 26, 17, 116, 0, 19, 67, 3, 85, 23, 3, 31, 10, 70}));
            sb.append(th.getClass().getSimpleName());
            sb.append(rjw.m179664a(new byte[]{10, 70}));
            sb.append(th.getMessage());
            th = th.getCause();
        }
        return sb.toString();
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public String getFormattedTotalTime() {
        return String.format(Locale.US, rjw.m179664a(new byte[]{21, 72, 3, 81, 18}), Double.valueOf(this.totalTime / 1000.0d));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format(Locale.US, MESSAGE_FORMAT, buildFullMessage(super.getMessage(), getCause()), super.getMessage(), this.url, this.requestParams, Integer.valueOf(this.statusCode), Integer.valueOf(this.retryCount), Double.valueOf(this.totalTime / 1000.0d), this.rawResponse, this.sdkVersion);
    }

    public String getRawResponse() {
        return this.rawResponse;
    }

    public String getRequestParams() {
        return this.requestParams;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getShortMessage() {
        return String.format(Locale.US, rjw.m179664a(new byte[]{107, 67, 66, 106, HttpTokens.COLON, 67, 67, HttpTokens.SEMI_COLON, 17, 18, 18, 70, 24, 53, 69, 86, 21, 19, 67, 92, 17, 18, 5, 74, Tnaf.POW_2_WIDTH, 50, 88, 90, 4, 92, Tnaf.POW_2_WIDTH, 67, 31, 5, 7, 21, 28, 70, 99, 82, 21, 20, 89, 3, 66, HttpTokens.CARRIAGE_RETURN, 65, 67, 84, 79}), this.sdkVersion, this.errorType.getDescription(), super.getMessage(), Integer.valueOf(this.statusCode), Double.valueOf(this.totalTime / 1000.0d), Integer.valueOf(this.retryCount));
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public long getTotalTimeMillis() {
        return this.totalTime;
    }

    public double getTotalTimeSeconds() {
        return this.totalTime / 1000.0d;
    }

    public String getUrl() {
        return this.url;
    }
}
