package p149l;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes2.dex */
public final class cm10 extends utc0 {

    /* JADX INFO: renamed from: f */
    public static final hyx f81488f = hyx.m133627c("multipart/mixed");

    /* JADX INFO: renamed from: g */
    public static final hyx f81489g = hyx.m133627c("multipart/alternative");

    /* JADX INFO: renamed from: h */
    public static final hyx f81490h = hyx.m133627c("multipart/digest");

    /* JADX INFO: renamed from: i */
    public static final hyx f81491i = hyx.m133627c("multipart/parallel");

    /* JADX INFO: renamed from: j */
    public static final hyx f81492j = hyx.m133627c("multipart/form-data");

    /* JADX INFO: renamed from: k */
    public static final byte[] f81493k = {HttpTokens.COLON, HttpTokens.SPACE};

    /* JADX INFO: renamed from: l */
    public static final byte[] f81494l = {HttpTokens.CARRIAGE_RETURN, 10};

    /* JADX INFO: renamed from: m */
    public static final byte[] f81495m = {45, 45};

    /* JADX INFO: renamed from: a */
    public final ByteString f81496a;

    /* JADX INFO: renamed from: b */
    public final hyx f81497b;

    /* JADX INFO: renamed from: c */
    public final hyx f81498c;

    /* JADX INFO: renamed from: d */
    public final List<C16192b> f81499d;

    /* JADX INFO: renamed from: e */
    public long f81500e = -1;

    /* JADX INFO: renamed from: l.cm10$b */
    public static final class C16192b {

        /* JADX INFO: renamed from: a */
        public final oxk f81504a;

        /* JADX INFO: renamed from: b */
        public final utc0 f81505b;

        public C16192b(oxk oxkVar, utc0 utc0Var) {
            this.f81504a = oxkVar;
            this.f81505b = utc0Var;
        }

        /* JADX INFO: renamed from: a */
        public static C16192b m107601a(oxk oxkVar, utc0 utc0Var) {
            if (utc0Var == null) {
                jfd0.m141176a("body == null");
                return null;
            }
            if (oxkVar != null && oxkVar.m166555d("Content-Type") != null) {
                ig3.m135964a("Unexpected header: Content-Type");
                return null;
            }
            if (oxkVar == null || oxkVar.m166555d("Content-Length") == null) {
                return new C16192b(oxkVar, utc0Var);
            }
            ig3.m135964a("Unexpected header: Content-Length");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public static C16192b m107602b(String str, String str2) {
            return m107603c(str, null, utc0.create((hyx) null, str2));
        }

        /* JADX INFO: renamed from: c */
        public static C16192b m107603c(String str, String str2, utc0 utc0Var) {
            if (str == null) {
                jfd0.m141176a("name == null");
                return null;
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            cm10.m107593a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                cm10.m107593a(sb, str2);
            }
            return m107601a(new oxk.C19066a().m166566d(HttpHeaders.CONTENT_DISPOSITION, sb.toString()).m166567e(), utc0Var);
        }
    }

    public cm10(ByteString byteString, hyx hyxVar, List<C16192b> list) {
        this.f81496a = byteString;
        this.f81497b = hyxVar;
        this.f81498c = hyx.m133627c(hyxVar + "; boundary=" + byteString.utf8());
        this.f81499d = tck0.m188019t(list);
    }

    /* JADX INFO: renamed from: a */
    public static void m107593a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private long m107594b(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f81499d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C16192b c16192b = this.f81499d.get(i);
            oxk oxkVar = c16192b.f81504a;
            utc0 utc0Var = c16192b.f81505b;
            bufferedSink.write(f81495m);
            bufferedSink.write(this.f81496a);
            bufferedSink.write(f81494l);
            if (oxkVar != null) {
                int iM166559k = oxkVar.m166559k();
                for (int i2 = 0; i2 < iM166559k; i2++) {
                    bufferedSink.writeUtf8(oxkVar.m166556f(i2)).write(f81493k).writeUtf8(oxkVar.m166561m(i2)).write(f81494l);
                }
            }
            hyx hyxVarContentType = utc0Var.contentType();
            if (hyxVarContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(hyxVarContentType.toString()).write(f81494l);
            }
            long jContentLength = utc0Var.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f81494l);
            } else if (z) {
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f81494l;
            bufferedSink.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                utc0Var.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        byte[] bArr2 = f81495m;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f81496a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f81494l);
        if (!z) {
            return j;
        }
        long size2 = j + buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p149l.utc0
    public long contentLength() throws IOException {
        long j = this.f81500e;
        if (j != -1) {
            return j;
        }
        long jM107594b = m107594b(null, true);
        this.f81500e = jM107594b;
        return jM107594b;
    }

    @Override // p149l.utc0
    public hyx contentType() {
        return this.f81498c;
    }

    @Override // p149l.utc0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m107594b(bufferedSink, false);
    }

    /* JADX INFO: renamed from: l.cm10$a */
    public static final class C16191a {

        /* JADX INFO: renamed from: a */
        public final ByteString f81501a;

        /* JADX INFO: renamed from: b */
        public hyx f81502b;

        /* JADX INFO: renamed from: c */
        public final List<C16192b> f81503c;

        public C16191a(String str) {
            this.f81502b = cm10.f81488f;
            this.f81503c = new ArrayList();
            this.f81501a = ByteString.encodeUtf8(str);
        }

        /* JADX INFO: renamed from: a */
        public C16191a m107595a(String str, String str2) {
            return m107598d(C16192b.m107602b(str, str2));
        }

        /* JADX INFO: renamed from: b */
        public C16191a m107596b(String str, String str2, utc0 utc0Var) {
            return m107598d(C16192b.m107603c(str, str2, utc0Var));
        }

        /* JADX INFO: renamed from: c */
        public C16191a m107597c(oxk oxkVar, utc0 utc0Var) {
            return m107598d(C16192b.m107601a(oxkVar, utc0Var));
        }

        /* JADX INFO: renamed from: d */
        public C16191a m107598d(C16192b c16192b) {
            if (c16192b != null) {
                this.f81503c.add(c16192b);
                return this;
            }
            jfd0.m141176a("part == null");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public cm10 m107599e() {
            if (!this.f81503c.isEmpty()) {
                return new cm10(this.f81501a, this.f81502b, this.f81503c);
            }
            qkq0.m175383a("Multipart body must have at least one part.");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C16191a m107600f(hyx hyxVar) {
            if (hyxVar == null) {
                jfd0.m141176a("type == null");
                return null;
            }
            if (hyxVar.m133631e().equals("multipart")) {
                this.f81502b = hyxVar;
                return this;
            }
            qhg0.m174539a("multipart != ", hyxVar);
            return null;
        }

        public C16191a() {
            this(UUID.randomUUID().toString());
        }
    }
}
