package p153l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class tx3 implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final lzm f176490a;

    /* JADX INFO: renamed from: b */
    public final x4e f176491b;

    /* JADX INFO: renamed from: c */
    public int f176492c;

    /* JADX INFO: renamed from: d */
    public int f176493d;

    /* JADX INFO: renamed from: e */
    public int f176494e;

    /* JADX INFO: renamed from: f */
    public int f176495f;

    /* JADX INFO: renamed from: g */
    public int f176496g;

    /* JADX INFO: renamed from: l.tx3$a */
    public final class C20418a implements gy3 {

        /* JADX INFO: renamed from: a */
        public final x4e.C21249b f176497a;

        /* JADX INFO: renamed from: b */
        public Sink f176498b;

        /* JADX INFO: renamed from: c */
        public Sink f176499c;

        /* JADX INFO: renamed from: d */
        public boolean f176500d;

        /* JADX INFO: renamed from: l.tx3$a$a */
        public class a extends ForwardingSink {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ tx3 f176502a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ x4e.C21249b f176503b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Sink sink, tx3 tx3Var, x4e.C21249b c21249b) {
                super(sink);
                this.f176502a = tx3Var;
                this.f176503b = c21249b;
            }

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (tx3.this) {
                    try {
                        C20418a c20418a = C20418a.this;
                        if (c20418a.f176500d) {
                            return;
                        }
                        c20418a.f176500d = true;
                        tx3.this.f176492c++;
                        super.close();
                        this.f176503b.m209332b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C20418a(x4e.C21249b c21249b) {
            this.f176497a = c21249b;
            Sink sinkM209334d = c21249b.m209334d(1);
            this.f176498b = sinkM209334d;
            this.f176499c = new a(sinkM209334d, tx3.this, c21249b);
        }

        @Override // p153l.gy3
        /* JADX INFO: renamed from: a */
        public void mo132930a() {
            synchronized (tx3.this) {
                try {
                    if (this.f176500d) {
                        return;
                    }
                    this.f176500d = true;
                    tx3.this.f176493d++;
                    zlk0.m220245g(this.f176498b);
                    try {
                        this.f176497a.m209331a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p153l.gy3
        /* JADX INFO: renamed from: b */
        public Sink mo132931b() {
            return this.f176499c;
        }
    }

    /* JADX INFO: renamed from: l.tx3$b */
    public static class C20419b extends k5d0 {

        /* JADX INFO: renamed from: a */
        public final x4e.C21252e f176505a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f176506b;

        /* JADX INFO: renamed from: c */
        public final String f176507c;

        /* JADX INFO: renamed from: d */
        public final String f176508d;

        /* JADX INFO: renamed from: l.tx3$b$a */
        public class a extends ForwardingSource {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ x4e.C21252e f176509a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Source source, x4e.C21252e c21252e) {
                super(source);
                this.f176509a = c21252e;
            }

            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f176509a.close();
                super.close();
            }
        }

        public C20419b(x4e.C21252e c21252e, String str, String str2) {
            this.f176505a = c21252e;
            this.f176507c = str;
            this.f176508d = str2;
            this.f176506b = Okio.buffer(new a(c21252e.m209340m(1), c21252e));
        }

        @Override // p153l.k5d0
        public long contentLength() {
            try {
                String str = this.f176508d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p153l.k5d0
        public e7y contentType() {
            String str = this.f176507c;
            if (str != null) {
                return e7y.m119773d(str);
            }
            return null;
        }

        @Override // p153l.k5d0
        public BufferedSource source() {
            return this.f176506b;
        }
    }

    /* JADX INFO: renamed from: l.tx3$c */
    public class C20420c implements lzm {
        public C20420c() {
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: a */
        public gy3 mo156443a(i5d0 i5d0Var) throws IOException {
            return tx3.this.m193470g(i5d0Var);
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: b */
        public void mo156444b(x1d0 x1d0Var) throws IOException {
            tx3.this.m193471i(x1d0Var);
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: c */
        public void mo156445c(i5d0 i5d0Var, i5d0 i5d0Var2) {
            tx3.this.m193474n(i5d0Var, i5d0Var2);
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: d */
        public void mo156446d() {
            tx3.this.m193472k();
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: e */
        public i5d0 mo156447e(x1d0 x1d0Var) throws IOException {
            return tx3.this.m193469d(x1d0Var);
        }

        @Override // p153l.lzm
        /* JADX INFO: renamed from: f */
        public void mo156448f(iy3 iy3Var) {
            tx3.this.m193473m(iy3Var);
        }
    }

    public tx3(File file, long j, bki bkiVar) {
        this.f176490a = new C20420c();
        this.f176491b = x4e.m209313n(bkiVar, file, 201105, 2, j);
    }

    /* JADX INFO: renamed from: e */
    public static String m193466e(rnl rnlVar) {
        return ByteString.encodeUtf8(rnlVar.toString()).md5().hex();
    }

    /* JADX INFO: renamed from: h */
    public static int m193467h(BufferedSource bufferedSource) throws IOException {
        try {
            long decimalLong = bufferedSource.readDecimalLong();
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.isEmpty()) {
                return (int) decimalLong;
            }
            throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + "\"");
        } catch (NumberFormatException e) {
            zpg0.m220844a(e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m193468b(x4e.C21249b c21249b) {
        if (c21249b != null) {
            try {
                c21249b.m209331a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f176491b.close();
    }

    /* JADX INFO: renamed from: d */
    public i5d0 m193469d(x1d0 x1d0Var) {
        try {
            x4e.C21252e c21252eM209330v = this.f176491b.m209330v(m193466e(x1d0Var.m209026k()));
            if (c21252eM209330v == null) {
                return null;
            }
            try {
                C20421d c20421d = new C20421d(c21252eM209330v.m209340m(0));
                i5d0 i5d0VarM193478d = c20421d.m193478d(c21252eM209330v);
                if (c20421d.m193476b(x1d0Var, i5d0VarM193478d)) {
                    return i5d0VarM193478d;
                }
                zlk0.m220245g(i5d0VarM193478d.m138670k());
                return null;
            } catch (IOException unused) {
                zlk0.m220245g(c21252eM209330v);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f176491b.flush();
    }

    /* JADX INFO: renamed from: g */
    public gy3 m193470g(i5d0 i5d0Var) {
        x4e.C21249b c21249bM209328t;
        String strM209022g = i5d0Var.m138668Z().m209022g();
        if (zml.m220392a(i5d0Var.m138668Z().m209022g())) {
            try {
                m193471i(i5d0Var.m138668Z());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strM209022g.equals("GET") || yml.m216702e(i5d0Var)) {
            return null;
        }
        C20421d c20421d = new C20421d(i5d0Var);
        try {
            c21249bM209328t = this.f176491b.m209328t(m193466e(i5d0Var.m138668Z().m209026k()));
            if (c21249bM209328t == null) {
                return null;
            }
            try {
                c20421d.m193480f(c21249bM209328t);
                return new C20418a(c21249bM209328t);
            } catch (IOException unused2) {
                m193468b(c21249bM209328t);
                return null;
            }
        } catch (IOException unused3) {
            c21249bM209328t = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m193471i(x1d0 x1d0Var) throws IOException {
        this.f176491b.m209321Q(m193466e(x1d0Var.m209026k()));
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m193472k() {
        this.f176495f++;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m193473m(iy3 iy3Var) {
        try {
            this.f176496g++;
            if (iy3Var.f117497a != null) {
                this.f176494e++;
            } else if (iy3Var.f117498b != null) {
                this.f176495f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m193474n(i5d0 i5d0Var, i5d0 i5d0Var2) {
        x4e.C21249b c21249bM209339k;
        C20421d c20421d = new C20421d(i5d0Var2);
        try {
            c21249bM209339k = ((C20419b) i5d0Var.m138670k()).f176505a.m209339k();
            if (c21249bM209339k != null) {
                try {
                    c20421d.m193480f(c21249bM209339k);
                    c21249bM209339k.m209332b();
                } catch (IOException unused) {
                    m193468b(c21249bM209339k);
                }
            }
        } catch (IOException unused2) {
            c21249bM209339k = null;
        }
    }

    public tx3(File file, long j) {
        this(file, j, bki.f77078a);
    }

    /* JADX INFO: renamed from: l.tx3$d */
    public static final class C20421d {

        /* JADX INFO: renamed from: k */
        public static final String f176512k = Platform.get().getPrefix() + "-Sent-Millis";

        /* JADX INFO: renamed from: l */
        public static final String f176513l = Platform.get().getPrefix() + "-Received-Millis";

        /* JADX INFO: renamed from: a */
        public final String f176514a;

        /* JADX INFO: renamed from: b */
        public final e0l f176515b;

        /* JADX INFO: renamed from: c */
        public final String f176516c;

        /* JADX INFO: renamed from: d */
        public final Protocol f176517d;

        /* JADX INFO: renamed from: e */
        public final int f176518e;

        /* JADX INFO: renamed from: f */
        public final String f176519f;

        /* JADX INFO: renamed from: g */
        public final e0l f176520g;

        /* JADX INFO: renamed from: h */
        public final txk f176521h;

        /* JADX INFO: renamed from: i */
        public final long f176522i;

        /* JADX INFO: renamed from: j */
        public final long f176523j;

        public C20421d(Source source) throws IOException {
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(source);
                this.f176514a = bufferedSourceBuffer.readUtf8LineStrict();
                this.f176516c = bufferedSourceBuffer.readUtf8LineStrict();
                e0l.C16674a c16674a = new e0l.C16674a();
                int iM193467h = tx3.m193467h(bufferedSourceBuffer);
                for (int i = 0; i < iM193467h; i++) {
                    c16674a.m118883b(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.f176515b = c16674a.m118886e();
                r4g0 r4g0VarM179760a = r4g0.m179760a(bufferedSourceBuffer.readUtf8LineStrict());
                this.f176517d = r4g0VarM179760a.f161201a;
                this.f176518e = r4g0VarM179760a.f161202b;
                this.f176519f = r4g0VarM179760a.f161203c;
                e0l.C16674a c16674a2 = new e0l.C16674a();
                int iM193467h2 = tx3.m193467h(bufferedSourceBuffer);
                for (int i2 = 0; i2 < iM193467h2; i2++) {
                    c16674a2.m118883b(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = f176512k;
                String strM118887f = c16674a2.m118887f(str);
                String str2 = f176513l;
                String strM118887f2 = c16674a2.m118887f(str2);
                c16674a2.m118888g(str);
                c16674a2.m118888g(str2);
                this.f176522i = strM118887f != null ? Long.parseLong(strM118887f) : 0L;
                this.f176523j = strM118887f2 != null ? Long.parseLong(strM118887f2) : 0L;
                this.f176520g = c16674a2.m118886e();
                if (m193475a()) {
                    String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict + "\"");
                    }
                    this.f176521h = txk.m193502c(!bufferedSourceBuffer.exhausted() ? TlsVersion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, w45.m204819b(bufferedSourceBuffer.readUtf8LineStrict()), m193477c(bufferedSourceBuffer), m193477c(bufferedSourceBuffer));
                } else {
                    this.f176521h = null;
                }
                source.close();
            } catch (Throwable th) {
                source.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m193475a() {
            return this.f176514a.startsWith("https://");
        }

        /* JADX INFO: renamed from: b */
        public boolean m193476b(x1d0 x1d0Var, i5d0 i5d0Var) {
            return this.f176514a.equals(x1d0Var.m209026k().toString()) && this.f176516c.equals(x1d0Var.m209022g()) && yml.m216712o(i5d0Var, this.f176515b, x1d0Var);
        }

        /* JADX INFO: renamed from: c */
        public final List<Certificate> m193477c(BufferedSource bufferedSource) throws IOException {
            int iM193467h = tx3.m193467h(bufferedSource);
            if (iM193467h == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM193467h);
                for (int i = 0; i < iM193467h; i++) {
                    String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    buffer.write(ByteString.decodeBase64(utf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                zpg0.m220844a(e.getMessage());
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public i5d0 m193478d(x4e.C21252e c21252e) {
            String strM118874d = this.f176520g.m118874d("Content-Type");
            String strM118874d2 = this.f176520g.m118874d("Content-Length");
            return new i5d0.C17653a().m138693q(new x1d0.C21228a().m209043q(this.f176514a).m209036j(this.f176516c, null).m209035i(this.f176515b).m209028b()).m138691o(this.f176517d).m138683g(this.f176518e).m138688l(this.f176519f).m138686j(this.f176520g).m138678b(new C20419b(c21252e, strM118874d, strM118874d2)).m138684h(this.f176521h).m138694r(this.f176522i).m138692p(this.f176523j).m138679c();
        }

        /* JADX INFO: renamed from: e */
        public final void m193479e(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.m222317of(list.get(i).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                zpg0.m220844a(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: f */
        public void m193480f(x4e.C21249b c21249b) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(c21249b.m209334d(0));
            bufferedSinkBuffer.writeUtf8(this.f176514a).writeByte(10);
            bufferedSinkBuffer.writeUtf8(this.f176516c).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.f176515b.m118878k()).writeByte(10);
            int iM118878k = this.f176515b.m118878k();
            for (int i = 0; i < iM118878k; i++) {
                bufferedSinkBuffer.writeUtf8(this.f176515b.m118875f(i)).writeUtf8(": ").writeUtf8(this.f176515b.m118880m(i)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(new r4g0(this.f176517d, this.f176518e, this.f176519f).toString()).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.f176520g.m118878k() + 2).writeByte(10);
            int iM118878k2 = this.f176520g.m118878k();
            for (int i2 = 0; i2 < iM118878k2; i2++) {
                bufferedSinkBuffer.writeUtf8(this.f176520g.m118875f(i2)).writeUtf8(": ").writeUtf8(this.f176520g.m118880m(i2)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(f176512k).writeUtf8(": ").writeDecimalLong(this.f176522i).writeByte(10);
            bufferedSinkBuffer.writeUtf8(f176513l).writeUtf8(": ").writeDecimalLong(this.f176523j).writeByte(10);
            if (m193475a()) {
                bufferedSinkBuffer.writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.f176521h.m193503a().m204823e()).writeByte(10);
                m193479e(bufferedSinkBuffer, this.f176521h.m193506f());
                m193479e(bufferedSinkBuffer, this.f176521h.m193504d());
                bufferedSinkBuffer.writeUtf8(this.f176521h.m193507g().javaName()).writeByte(10);
            }
            bufferedSinkBuffer.close();
        }

        public C20421d(i5d0 i5d0Var) {
            this.f176514a = i5d0Var.m138668Z().m209026k().toString();
            this.f176515b = yml.m216711n(i5d0Var);
            this.f176516c = i5d0Var.m138668Z().m209022g();
            this.f176517d = i5d0Var.m138666S();
            this.f176518e = i5d0Var.m138673q();
            this.f176519f = i5d0Var.m138662J();
            this.f176520g = i5d0Var.m138659F();
            this.f176521h = i5d0Var.m138674t();
            this.f176522i = i5d0Var.m138669a0();
            this.f176523j = i5d0Var.m138667U();
        }
    }
}
