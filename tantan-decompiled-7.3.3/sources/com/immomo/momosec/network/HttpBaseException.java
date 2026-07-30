package com.immomo.momosec.network;

import java.util.Locale;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.eiw;
import p153l.qmw;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public class HttpBaseException extends Exception {
    private static final String DEFAULT_VALUE = qmw.m177151a(new byte[]{126, 73, 112});
    private static final String MESSAGE_FORMAT = qmw.m177151a(new byte[]{120, 50, 101, 103, 65, 52, 85, 23, 68, 82, 18, 18, Tnaf.POW_2_WIDTH, HttpTokens.SPACE, 80, 94, HttpTokens.CARRIAGE_RETURN, 3, 84, 92, HttpTokens.SEMI_COLON, 114, 19, 20, 95, 20, 17, 99, 24, 22, 85, 92, 17, 18, 18, 108, 125, 3, 66, 68, 0, 1, 85, 92, 17, 18, 18, 108, 101, 52, 125, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 108, 97, 86, 19, 7, 93, 21, 11, 23, 68, 21, HttpTokens.COLON, 53, 69, 86, 21, 19, 67, 70, 114, 88, 5, 3, 10, 70, 20, 83, 107, 52, 85, 18, 67, 78, 65, 37, 95, 19, 95, 67, 91, 70, 21, 2, HttpTokens.SEMI_COLON, 99, 14, 18, 81, 10, 17, 99, 8, 11, 85, 92, 17, 18, 79, 84, 86, 21, HttpTokens.SEMI_COLON, 101, 0, 17, Tnaf.POW_2_WIDTH, 52, 84, 68, 17, 9, 94, 21, 84, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 108, 98, 115, 42, 70, 102, 3, 67, 68, 8, 9, 94, 92, 17, 18, 18});
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
        NETWORK(qmw.m177151a(new byte[]{126, 3, 69, 64, 14, 20, 91, 70, 116, 69, 19, 9, 66})),
        DECRYPTION(qmw.m177151a(new byte[]{116, 3, 82, 69, 24, 22, 68, 15, 94, 89, 65, 35, 66, 20, 94, 69})),
        JSON_PARSE(qmw.m177151a(new byte[]{122, 53, 126, 121, 65, 54, 81, 20, 66, 82, 65, 35, 66, 20, 94, 69})),
        SERVER_ERROR(qmw.m177151a(new byte[]{99, 3, 67, 65, 4, 20, Tnaf.POW_2_WIDTH, 35, 67, 69, 14, 20})),
        UNKNOWN(qmw.m177151a(new byte[]{101, 8, 90, 89, 14, 17, 94, 70, 116, 69, 19, 9, 66}));

        private final String description;

        ErrorType(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    /* JADX INFO: renamed from: com.immomo.momosec.network.HttpBaseException$a */
    public static class C4059a {

        /* JADX INFO: renamed from: a */
        private String f14660a;

        /* JADX INFO: renamed from: b */
        private Throwable f14661b;

        /* JADX INFO: renamed from: c */
        private String f14662c;

        /* JADX INFO: renamed from: d */
        private String f14663d;

        /* JADX INFO: renamed from: f */
        private int f14665f;

        /* JADX INFO: renamed from: g */
        private long f14666g;

        /* JADX INFO: renamed from: h */
        private String f14667h;

        /* JADX INFO: renamed from: e */
        private int f14664e = -1;

        /* JADX INFO: renamed from: i */
        private ErrorType f14668i = ErrorType.UNKNOWN;

        /* JADX INFO: renamed from: t */
        private void m20288t() {
            if (this.f14660a == null) {
                wtq0.m207906a(qmw.m177151a(new byte[]{125, 3, 66, 68, 0, 1, 85, 70, 82, 86, 15, 8, 95, 18, 17, 85, 4, 70, 94, 19, 93, 91}));
                return;
            }
            if (this.f14662c == null) {
                this.f14662c = qmw.m177151a(new byte[]{126, 73, 112});
            }
            if (this.f14663d == null) {
                this.f14663d = qmw.m177151a(new byte[]{126, 73, 112});
            }
            if (this.f14667h == null) {
                this.f14667h = qmw.m177151a(new byte[]{126, 73, 112});
            }
            if (this.f14668i == null) {
                this.f14668i = ErrorType.UNKNOWN;
            }
        }

        /* JADX INFO: renamed from: j */
        public HttpBaseException m20289j() {
            m20288t();
            return new HttpBaseException(this);
        }

        /* JADX INFO: renamed from: k */
        public C4059a m20290k(Throwable th) {
            this.f14661b = th;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C4059a m20291l(ErrorType errorType) {
            this.f14668i = errorType;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C4059a m20292m(String str) {
            this.f14660a = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C4059a m20293n(String str) {
            this.f14667h = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C4059a m20294o(String str) {
            this.f14663d = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C4059a m20295p(int i) {
            this.f14665f = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C4059a m20296q(int i) {
            this.f14664e = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C4059a m20297r(long j) {
            this.f14666g = j;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C4059a m20298s(String str) {
            this.f14662c = str;
            return this;
        }
    }

    public HttpBaseException(C4059a c4059a) {
        super(c4059a.f14660a, c4059a.f14661b);
        this.url = c4059a.f14662c;
        this.requestParams = c4059a.f14663d;
        this.statusCode = c4059a.f14664e;
        this.retryCount = c4059a.f14665f;
        this.totalTime = c4059a.f14666g;
        this.rawResponse = c4059a.f14667h;
        this.sdkVersion = eiw.m120946b();
        this.errorType = c4059a.f14668i;
    }

    private static String buildFullMessage(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        while (th != null) {
            sb.append(qmw.m177151a(new byte[]{Tnaf.POW_2_WIDTH, 26, 17, 116, 0, 19, 67, 3, 85, 23, 3, 31, 10, 70}));
            sb.append(th.getClass().getSimpleName());
            sb.append(qmw.m177151a(new byte[]{10, 70}));
            sb.append(th.getMessage());
            th = th.getCause();
        }
        return sb.toString();
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public String getFormattedTotalTime() {
        return String.format(Locale.US, qmw.m177151a(new byte[]{21, 72, 3, 81, 18}), Double.valueOf(this.totalTime / 1000.0d));
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
        return String.format(Locale.US, qmw.m177151a(new byte[]{107, 67, 66, 106, HttpTokens.COLON, 67, 67, HttpTokens.SEMI_COLON, 17, 18, 18, 70, 24, 53, 69, 86, 21, 19, 67, 92, 17, 18, 5, 74, Tnaf.POW_2_WIDTH, 50, 88, 90, 4, 92, Tnaf.POW_2_WIDTH, 67, 31, 5, 7, 21, 28, 70, 99, 82, 21, 20, 89, 3, 66, HttpTokens.CARRIAGE_RETURN, 65, 67, 84, 79}), this.sdkVersion, this.errorType.getDescription(), super.getMessage(), Integer.valueOf(this.statusCode), Double.valueOf(this.totalTime / 1000.0d), Integer.valueOf(this.retryCount));
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
