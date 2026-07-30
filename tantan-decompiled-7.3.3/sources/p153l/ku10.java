package p153l;

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
public final class ku10 extends z1d0 {

    /* JADX INFO: renamed from: f */
    public static final e7y f128782f = e7y.m119772c("multipart/mixed");

    /* JADX INFO: renamed from: g */
    public static final e7y f128783g = e7y.m119772c("multipart/alternative");

    /* JADX INFO: renamed from: h */
    public static final e7y f128784h = e7y.m119772c("multipart/digest");

    /* JADX INFO: renamed from: i */
    public static final e7y f128785i = e7y.m119772c("multipart/parallel");

    /* JADX INFO: renamed from: j */
    public static final e7y f128786j = e7y.m119772c("multipart/form-data");

    /* JADX INFO: renamed from: k */
    public static final byte[] f128787k = {HttpTokens.COLON, HttpTokens.SPACE};

    /* JADX INFO: renamed from: l */
    public static final byte[] f128788l = {HttpTokens.CARRIAGE_RETURN, 10};

    /* JADX INFO: renamed from: m */
    public static final byte[] f128789m = {45, 45};

    /* JADX INFO: renamed from: a */
    public final ByteString f128790a;

    /* JADX INFO: renamed from: b */
    public final e7y f128791b;

    /* JADX INFO: renamed from: c */
    public final e7y f128792c;

    /* JADX INFO: renamed from: d */
    public final List<C18261b> f128793d;

    /* JADX INFO: renamed from: e */
    public long f128794e = -1;

    /* JADX INFO: renamed from: l.ku10$b */
    public static final class C18261b {

        /* JADX INFO: renamed from: a */
        public final e0l f128798a;

        /* JADX INFO: renamed from: b */
        public final z1d0 f128799b;

        public C18261b(e0l e0lVar, z1d0 z1d0Var) {
            this.f128798a = e0lVar;
            this.f128799b = z1d0Var;
        }

        /* JADX INFO: renamed from: a */
        public static C18261b m151433a(e0l e0lVar, z1d0 z1d0Var) {
            if (z1d0Var == null) {
                mnd0.m159157a("body == null");
                return null;
            }
            if (e0lVar != null && e0lVar.m118874d("Content-Type") != null) {
                wg3.m206174a("Unexpected header: Content-Type");
                return null;
            }
            if (e0lVar == null || e0lVar.m118874d("Content-Length") == null) {
                return new C18261b(e0lVar, z1d0Var);
            }
            wg3.m206174a("Unexpected header: Content-Length");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public static C18261b m151434b(String str, String str2) {
            return m151435c(str, null, z1d0.create((e7y) null, str2));
        }

        /* JADX INFO: renamed from: c */
        public static C18261b m151435c(String str, String str2, z1d0 z1d0Var) {
            if (str == null) {
                mnd0.m159157a("name == null");
                return null;
            }
            StringBuilder sb = new StringBuilder("form-data; name=");
            ku10.m151425a(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                ku10.m151425a(sb, str2);
            }
            return m151433a(new e0l.C16674a().m118885d(HttpHeaders.CONTENT_DISPOSITION, sb.toString()).m118886e(), z1d0Var);
        }
    }

    public ku10(ByteString byteString, e7y e7yVar, List<C18261b> list) {
        this.f128790a = byteString;
        this.f128791b = e7yVar;
        this.f128792c = e7y.m119772c(e7yVar + "; boundary=" + byteString.utf8());
        this.f128793d = zlk0.m220258t(list);
    }

    /* JADX INFO: renamed from: a */
    public static void m151425a(StringBuilder sb, String str) {
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
    private long m151426b(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.f128793d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C18261b c18261b = this.f128793d.get(i);
            e0l e0lVar = c18261b.f128798a;
            z1d0 z1d0Var = c18261b.f128799b;
            bufferedSink.write(f128789m);
            bufferedSink.write(this.f128790a);
            bufferedSink.write(f128788l);
            if (e0lVar != null) {
                int iM118878k = e0lVar.m118878k();
                for (int i2 = 0; i2 < iM118878k; i2++) {
                    bufferedSink.writeUtf8(e0lVar.m118875f(i2)).write(f128787k).writeUtf8(e0lVar.m118880m(i2)).write(f128788l);
                }
            }
            e7y e7yVarContentType = z1d0Var.contentType();
            if (e7yVarContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(e7yVarContentType.toString()).write(f128788l);
            }
            long jContentLength = z1d0Var.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f128788l);
            } else if (z) {
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f128788l;
            bufferedSink.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                z1d0Var.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        byte[] bArr2 = f128789m;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.f128790a);
        bufferedSink.write(bArr2);
        bufferedSink.write(f128788l);
        if (!z) {
            return j;
        }
        long size2 = j + buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // p153l.z1d0
    public long contentLength() throws IOException {
        long j = this.f128794e;
        if (j != -1) {
            return j;
        }
        long jM151426b = m151426b(null, true);
        this.f128794e = jM151426b;
        return jM151426b;
    }

    @Override // p153l.z1d0
    public e7y contentType() {
        return this.f128792c;
    }

    @Override // p153l.z1d0
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        m151426b(bufferedSink, false);
    }

    /* JADX INFO: renamed from: l.ku10$a */
    public static final class C18260a {

        /* JADX INFO: renamed from: a */
        public final ByteString f128795a;

        /* JADX INFO: renamed from: b */
        public e7y f128796b;

        /* JADX INFO: renamed from: c */
        public final List<C18261b> f128797c;

        public C18260a(String str) {
            this.f128796b = ku10.f128782f;
            this.f128797c = new ArrayList();
            this.f128795a = ByteString.encodeUtf8(str);
        }

        /* JADX INFO: renamed from: a */
        public C18260a m151427a(String str, String str2) {
            return m151430d(C18261b.m151434b(str, str2));
        }

        /* JADX INFO: renamed from: b */
        public C18260a m151428b(String str, String str2, z1d0 z1d0Var) {
            return m151430d(C18261b.m151435c(str, str2, z1d0Var));
        }

        /* JADX INFO: renamed from: c */
        public C18260a m151429c(e0l e0lVar, z1d0 z1d0Var) {
            return m151430d(C18261b.m151433a(e0lVar, z1d0Var));
        }

        /* JADX INFO: renamed from: d */
        public C18260a m151430d(C18261b c18261b) {
            if (c18261b != null) {
                this.f128797c.add(c18261b);
                return this;
            }
            mnd0.m159157a("part == null");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public ku10 m151431e() {
            if (!this.f128797c.isEmpty()) {
                return new ku10(this.f128795a, this.f128796b, this.f128797c);
            }
            wtq0.m207906a("Multipart body must have at least one part.");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C18260a m151432f(e7y e7yVar) {
            if (e7yVar == null) {
                mnd0.m159157a("type == null");
                return null;
            }
            if (e7yVar.m119776e().equals("multipart")) {
                this.f128796b = e7yVar;
                return this;
            }
            ypg0.m217021a("multipart != ", e7yVar);
            return null;
        }

        public C18260a() {
            this(UUID.randomUUID().toString());
        }
    }
}
