package p149l;

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
public final class uw3 implements Closeable, Flushable {

    /* JADX INFO: renamed from: a */
    public final lxm f178583a;

    /* JADX INFO: renamed from: b */
    public final j3e f178584b;

    /* JADX INFO: renamed from: c */
    public int f178585c;

    /* JADX INFO: renamed from: d */
    public int f178586d;

    /* JADX INFO: renamed from: e */
    public int f178587e;

    /* JADX INFO: renamed from: f */
    public int f178588f;

    /* JADX INFO: renamed from: g */
    public int f178589g;

    /* JADX INFO: renamed from: l.uw3$a */
    public final class C20526a implements hx3 {

        /* JADX INFO: renamed from: a */
        public final j3e.C17679b f178590a;

        /* JADX INFO: renamed from: b */
        public Sink f178591b;

        /* JADX INFO: renamed from: c */
        public Sink f178592c;

        /* JADX INFO: renamed from: d */
        public boolean f178593d;

        /* JADX INFO: renamed from: l.uw3$a$a */
        public class a extends ForwardingSink {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ uw3 f178595a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ j3e.C17679b f178596b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Sink sink, uw3 uw3Var, j3e.C17679b c17679b) {
                super(sink);
                this.f178595a = uw3Var;
                this.f178596b = c17679b;
            }

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (uw3.this) {
                    try {
                        C20526a c20526a = C20526a.this;
                        if (c20526a.f178593d) {
                            return;
                        }
                        c20526a.f178593d = true;
                        uw3.this.f178585c++;
                        super.close();
                        this.f178596b.m139561b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public C20526a(j3e.C17679b c17679b) {
            this.f178590a = c17679b;
            Sink sinkM139563d = c17679b.m139563d(1);
            this.f178591b = sinkM139563d;
            this.f178592c = new a(sinkM139563d, uw3.this, c17679b);
        }

        @Override // p149l.hx3
        /* JADX INFO: renamed from: a */
        public void mo133295a() {
            synchronized (uw3.this) {
                try {
                    if (this.f178593d) {
                        return;
                    }
                    this.f178593d = true;
                    uw3.this.f178586d++;
                    tck0.m188006g(this.f178591b);
                    try {
                        this.f178590a.m139560a();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p149l.hx3
        /* JADX INFO: renamed from: b */
        public Sink mo133296b() {
            return this.f178592c;
        }
    }

    /* JADX INFO: renamed from: l.uw3$b */
    public static class C20527b extends gxc0 {

        /* JADX INFO: renamed from: a */
        public final j3e.C17682e f178598a;

        /* JADX INFO: renamed from: b */
        public final BufferedSource f178599b;

        /* JADX INFO: renamed from: c */
        public final String f178600c;

        /* JADX INFO: renamed from: d */
        public final String f178601d;

        /* JADX INFO: renamed from: l.uw3$b$a */
        public class a extends ForwardingSource {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ j3e.C17682e f178602a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Source source, j3e.C17682e c17682e) {
                super(source);
                this.f178602a = c17682e;
            }

            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f178602a.close();
                super.close();
            }
        }

        public C20527b(j3e.C17682e c17682e, String str, String str2) {
            this.f178598a = c17682e;
            this.f178600c = str;
            this.f178601d = str2;
            this.f178599b = Okio.buffer(new a(c17682e.m139569m(1), c17682e));
        }

        @Override // p149l.gxc0
        public long contentLength() {
            try {
                String str = this.f178601d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // p149l.gxc0
        public hyx contentType() {
            String str = this.f178600c;
            if (str != null) {
                return hyx.m133628d(str);
            }
            return null;
        }

        @Override // p149l.gxc0
        public BufferedSource source() {
            return this.f178599b;
        }
    }

    /* JADX INFO: renamed from: l.uw3$c */
    public class C20528c implements lxm {
        public C20528c() {
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: a */
        public hx3 mo152067a(exc0 exc0Var) throws IOException {
            return uw3.this.m196104g(exc0Var);
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: b */
        public void mo152068b(stc0 stc0Var) throws IOException {
            uw3.this.m196105i(stc0Var);
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: c */
        public void mo152069c(exc0 exc0Var, exc0 exc0Var2) {
            uw3.this.m196108n(exc0Var, exc0Var2);
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: d */
        public void mo152070d() {
            uw3.this.m196106k();
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: e */
        public exc0 mo152071e(stc0 stc0Var) throws IOException {
            return uw3.this.m196103d(stc0Var);
        }

        @Override // p149l.lxm
        /* JADX INFO: renamed from: f */
        public void mo152072f(jx3 jx3Var) {
            uw3.this.m196107m(jx3Var);
        }
    }

    public uw3(File file, long j, ehi ehiVar) {
        this.f178583a = new C20528c();
        this.f178584b = j3e.m139541n(ehiVar, file, 201105, 2, j);
    }

    /* JADX INFO: renamed from: e */
    public static String m196100e(cll cllVar) {
        return ByteString.encodeUtf8(cllVar.toString()).md5().hex();
    }

    /* JADX INFO: renamed from: h */
    public static int m196101h(BufferedSource bufferedSource) throws IOException {
        try {
            long decimalLong = bufferedSource.readDecimalLong();
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (decimalLong >= 0 && decimalLong <= 2147483647L && utf8LineStrict.isEmpty()) {
                return (int) decimalLong;
            }
            throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + "\"");
        } catch (NumberFormatException e) {
            rhg0.m179353a(e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m196102b(j3e.C17679b c17679b) {
        if (c17679b != null) {
            try {
                c17679b.m139560a();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f178584b.close();
    }

    /* JADX INFO: renamed from: d */
    public exc0 m196103d(stc0 stc0Var) {
        try {
            j3e.C17682e c17682eM139558v = this.f178584b.m139558v(m196100e(stc0Var.m185881k()));
            if (c17682eM139558v == null) {
                return null;
            }
            try {
                C20529d c20529d = new C20529d(c17682eM139558v.m139569m(0));
                exc0 exc0VarM196112d = c20529d.m196112d(c17682eM139558v);
                if (c20529d.m196110b(stc0Var, exc0VarM196112d)) {
                    return exc0VarM196112d;
                }
                tck0.m188006g(exc0VarM196112d.m118606k());
                return null;
            } catch (IOException unused) {
                tck0.m188006g(c17682eM139558v);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f178584b.flush();
    }

    /* JADX INFO: renamed from: g */
    public hx3 m196104g(exc0 exc0Var) {
        j3e.C17679b c17679bM139556t;
        String strM185877g = exc0Var.m118604Y().m185877g();
        if (lkl.m150369a(exc0Var.m118604Y().m185877g())) {
            try {
                m196105i(exc0Var.m118604Y());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!strM185877g.equals("GET") || kkl.m146337e(exc0Var)) {
            return null;
        }
        C20529d c20529d = new C20529d(exc0Var);
        try {
            c17679bM139556t = this.f178584b.m139556t(m196100e(exc0Var.m118604Y().m185881k()));
            if (c17679bM139556t == null) {
                return null;
            }
            try {
                c20529d.m196114f(c17679bM139556t);
                return new C20526a(c17679bM139556t);
            } catch (IOException unused2) {
                m196102b(c17679bM139556t);
                return null;
            }
        } catch (IOException unused3) {
            c17679bM139556t = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m196105i(stc0 stc0Var) throws IOException {
        this.f178584b.m139549Q(m196100e(stc0Var.m185881k()));
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m196106k() {
        this.f178588f++;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m196107m(jx3 jx3Var) {
        try {
            this.f178589g++;
            if (jx3Var.f120175a != null) {
                this.f178587e++;
            } else if (jx3Var.f120176b != null) {
                this.f178588f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m196108n(exc0 exc0Var, exc0 exc0Var2) {
        j3e.C17679b c17679bM139568k;
        C20529d c20529d = new C20529d(exc0Var2);
        try {
            c17679bM139568k = ((C20527b) exc0Var.m118606k()).f178598a.m139568k();
            if (c17679bM139568k != null) {
                try {
                    c20529d.m196114f(c17679bM139568k);
                    c17679bM139568k.m139561b();
                } catch (IOException unused) {
                    m196102b(c17679bM139568k);
                }
            }
        } catch (IOException unused2) {
            c17679bM139568k = null;
        }
    }

    public uw3(File file, long j) {
        this(file, j, ehi.f91328a);
    }

    /* JADX INFO: renamed from: l.uw3$d */
    public static final class C20529d {

        /* JADX INFO: renamed from: k */
        public static final String f178605k = Platform.get().getPrefix() + "-Sent-Millis";

        /* JADX INFO: renamed from: l */
        public static final String f178606l = Platform.get().getPrefix() + "-Received-Millis";

        /* JADX INFO: renamed from: a */
        public final String f178607a;

        /* JADX INFO: renamed from: b */
        public final oxk f178608b;

        /* JADX INFO: renamed from: c */
        public final String f178609c;

        /* JADX INFO: renamed from: d */
        public final Protocol f178610d;

        /* JADX INFO: renamed from: e */
        public final int f178611e;

        /* JADX INFO: renamed from: f */
        public final String f178612f;

        /* JADX INFO: renamed from: g */
        public final oxk f178613g;

        /* JADX INFO: renamed from: h */
        public final dvk f178614h;

        /* JADX INFO: renamed from: i */
        public final long f178615i;

        /* JADX INFO: renamed from: j */
        public final long f178616j;

        public C20529d(Source source) throws IOException {
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(source);
                this.f178607a = bufferedSourceBuffer.readUtf8LineStrict();
                this.f178609c = bufferedSourceBuffer.readUtf8LineStrict();
                oxk.C19066a c19066a = new oxk.C19066a();
                int iM196101h = uw3.m196101h(bufferedSourceBuffer);
                for (int i = 0; i < iM196101h; i++) {
                    c19066a.m166564b(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.f178608b = c19066a.m166567e();
                hwf0 hwf0VarM133243a = hwf0.m133243a(bufferedSourceBuffer.readUtf8LineStrict());
                this.f178610d = hwf0VarM133243a.f109756a;
                this.f178611e = hwf0VarM133243a.f109757b;
                this.f178612f = hwf0VarM133243a.f109758c;
                oxk.C19066a c19066a2 = new oxk.C19066a();
                int iM196101h2 = uw3.m196101h(bufferedSourceBuffer);
                for (int i2 = 0; i2 < iM196101h2; i2++) {
                    c19066a2.m166564b(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = f178605k;
                String strM166568f = c19066a2.m166568f(str);
                String str2 = f178606l;
                String strM166568f2 = c19066a2.m166568f(str2);
                c19066a2.m166569g(str);
                c19066a2.m166569g(str2);
                this.f178615i = strM166568f != null ? Long.parseLong(strM166568f) : 0L;
                this.f178616j = strM166568f2 != null ? Long.parseLong(strM166568f2) : 0L;
                this.f178613g = c19066a2.m166567e();
                if (m196109a()) {
                    String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict + "\"");
                    }
                    this.f178614h = dvk.m113783c(!bufferedSourceBuffer.exhausted() ? TlsVersion.forJavaName(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, v35.m196826b(bufferedSourceBuffer.readUtf8LineStrict()), m196111c(bufferedSourceBuffer), m196111c(bufferedSourceBuffer));
                } else {
                    this.f178614h = null;
                }
                source.close();
            } catch (Throwable th) {
                source.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m196109a() {
            return this.f178607a.startsWith("https://");
        }

        /* JADX INFO: renamed from: b */
        public boolean m196110b(stc0 stc0Var, exc0 exc0Var) {
            return this.f178607a.equals(stc0Var.m185881k().toString()) && this.f178609c.equals(stc0Var.m185877g()) && kkl.m146347o(exc0Var, this.f178608b, stc0Var);
        }

        /* JADX INFO: renamed from: c */
        public final List<Certificate> m196111c(BufferedSource bufferedSource) throws IOException {
            int iM196101h = uw3.m196101h(bufferedSource);
            if (iM196101h == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iM196101h);
                for (int i = 0; i < iM196101h; i++) {
                    String utf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    buffer.write(ByteString.decodeBase64(utf8LineStrict));
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                rhg0.m179353a(e.getMessage());
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public exc0 m196112d(j3e.C17682e c17682e) {
            String strM166555d = this.f178613g.m166555d("Content-Type");
            String strM166555d2 = this.f178613g.m166555d("Content-Length");
            return new exc0.C16708a().m118629q(new stc0.C20027a().m185898q(this.f178607a).m185891j(this.f178609c, null).m185890i(this.f178608b).m185883b()).m118627o(this.f178610d).m118619g(this.f178611e).m118624l(this.f178612f).m118622j(this.f178613g).m118614b(new C20527b(c17682e, strM166555d, strM166555d2)).m118620h(this.f178614h).m118630r(this.f178615i).m118628p(this.f178616j).m118615c();
        }

        /* JADX INFO: renamed from: e */
        public final void m196113e(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.m221050of(list.get(i).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                rhg0.m179353a(e.getMessage());
            }
        }

        /* JADX INFO: renamed from: f */
        public void m196114f(j3e.C17679b c17679b) throws IOException {
            BufferedSink bufferedSinkBuffer = Okio.buffer(c17679b.m139563d(0));
            bufferedSinkBuffer.writeUtf8(this.f178607a).writeByte(10);
            bufferedSinkBuffer.writeUtf8(this.f178609c).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.f178608b.m166559k()).writeByte(10);
            int iM166559k = this.f178608b.m166559k();
            for (int i = 0; i < iM166559k; i++) {
                bufferedSinkBuffer.writeUtf8(this.f178608b.m166556f(i)).writeUtf8(": ").writeUtf8(this.f178608b.m166561m(i)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(new hwf0(this.f178610d, this.f178611e, this.f178612f).toString()).writeByte(10);
            bufferedSinkBuffer.writeDecimalLong(this.f178613g.m166559k() + 2).writeByte(10);
            int iM166559k2 = this.f178613g.m166559k();
            for (int i2 = 0; i2 < iM166559k2; i2++) {
                bufferedSinkBuffer.writeUtf8(this.f178613g.m166556f(i2)).writeUtf8(": ").writeUtf8(this.f178613g.m166561m(i2)).writeByte(10);
            }
            bufferedSinkBuffer.writeUtf8(f178605k).writeUtf8(": ").writeDecimalLong(this.f178615i).writeByte(10);
            bufferedSinkBuffer.writeUtf8(f178606l).writeUtf8(": ").writeDecimalLong(this.f178616j).writeByte(10);
            if (m196109a()) {
                bufferedSinkBuffer.writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.f178614h.m113784a().m196830e()).writeByte(10);
                m196113e(bufferedSinkBuffer, this.f178614h.m113787f());
                m196113e(bufferedSinkBuffer, this.f178614h.m113785d());
                bufferedSinkBuffer.writeUtf8(this.f178614h.m113788g().javaName()).writeByte(10);
            }
            bufferedSinkBuffer.close();
        }

        public C20529d(exc0 exc0Var) {
            this.f178607a = exc0Var.m118604Y().m185881k().toString();
            this.f178608b = kkl.m146346n(exc0Var);
            this.f178609c = exc0Var.m118604Y().m185877g();
            this.f178610d = exc0Var.m118602S();
            this.f178611e = exc0Var.m118609q();
            this.f178612f = exc0Var.m118598J();
            this.f178613g = exc0Var.m118595F();
            this.f178614h = exc0Var.m118610t();
            this.f178615i = exc0Var.m118605Z();
            this.f178616j = exc0Var.m118603T();
        }
    }
}
