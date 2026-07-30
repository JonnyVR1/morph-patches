package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.api.Api;
import com.meituan.robust.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class kjl implements k5f {

    /* JADX INFO: renamed from: a */
    public final k850 f123458a;

    /* JADX INFO: renamed from: b */
    public final bec0 f123459b;

    /* JADX INFO: renamed from: c */
    public final BufferedSource f123460c;

    /* JADX INFO: renamed from: d */
    public final BufferedSink f123461d;

    /* JADX INFO: renamed from: e */
    public int f123462e = 0;

    /* JADX INFO: renamed from: f */
    public long f123463f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: g */
    public oxk f123464g;

    /* JADX INFO: renamed from: l.kjl$b */
    public abstract class AbstractC18030b implements Source {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f123465a;

        /* JADX INFO: renamed from: b */
        public boolean f123466b;

        public AbstractC18030b() {
            this.f123465a = new ForwardingTimeout(kjl.this.f123460c.getTimeout());
        }

        /* JADX INFO: renamed from: k */
        public final void m146258k() {
            if (kjl.this.f123462e == 6) {
                return;
            }
            int i = kjl.this.f123462e;
            kjl kjlVar = kjl.this;
            if (i != 5) {
                dxc0.m114002a("state: ", kjlVar.f123462e);
            } else {
                kjlVar.m146249r(this.f123465a);
                kjl.this.f123462e = 6;
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            try {
                return kjl.this.f123460c.read(buffer, j);
            } catch (IOException e) {
                kjl.this.f123459b.m101348t();
                m146258k();
                throw e;
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f123465a;
        }
    }

    /* JADX INFO: renamed from: l.kjl$c */
    public final class C18031c implements Sink {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f123468a;

        /* JADX INFO: renamed from: b */
        public boolean f123469b;

        public C18031c() {
            this.f123468a = new ForwardingTimeout(kjl.this.f123461d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f123469b) {
                return;
            }
            this.f123469b = true;
            kjl.this.f123461d.writeUtf8("0\r\n\r\n");
            kjl.this.m146249r(this.f123468a);
            kjl.this.f123462e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f123469b) {
                return;
            }
            kjl.this.f123461d.flush();
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f123468a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f123469b) {
                qkq0.m175383a("closed");
            } else {
                if (j == 0) {
                    return;
                }
                kjl.this.f123461d.writeHexadecimalUnsignedLong(j);
                kjl.this.f123461d.writeUtf8("\r\n");
                kjl.this.f123461d.write(buffer, j);
                kjl.this.f123461d.writeUtf8("\r\n");
            }
        }
    }

    /* JADX INFO: renamed from: l.kjl$d */
    public class C18032d extends AbstractC18030b {

        /* JADX INFO: renamed from: d */
        public final cll f123471d;

        /* JADX INFO: renamed from: e */
        public long f123472e;

        /* JADX INFO: renamed from: f */
        public boolean f123473f;

        public C18032d(cll cllVar) {
            super();
            this.f123472e = -1L;
            this.f123473f = true;
            this.f123471d = cllVar;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f123466b) {
                return;
            }
            if (this.f123473f && !tck0.m188015p(this, 100, TimeUnit.MILLISECONDS)) {
                kjl.this.f123459b.m101348t();
                m146258k();
            }
            this.f123466b = true;
        }

        /* JADX INFO: renamed from: m */
        public final void m146259m() throws IOException {
            if (this.f123472e != -1) {
                kjl.this.f123460c.readUtf8LineStrict();
            }
            try {
                this.f123472e = kjl.this.f123460c.readHexadecimalUnsignedLong();
                String strTrim = kjl.this.f123460c.readUtf8LineStrict().trim();
                if (this.f123472e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Constants.PACKNAME_END))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f123472e + strTrim + "\"");
                }
                if (this.f123472e == 0) {
                    this.f123473f = false;
                    kjl kjlVar = kjl.this;
                    kjlVar.f123464g = kjlVar.m146256y();
                    kkl.m146339g(kjl.this.f123458a.m144857l(), this.f123471d, kjl.this.f123464g);
                    m146258k();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // p149l.kjl.AbstractC18030b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f123466b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            if (!this.f123473f) {
                return -1L;
            }
            long j2 = this.f123472e;
            if (j2 == 0 || j2 == -1) {
                m146259m();
                if (!this.f123473f) {
                    return -1L;
                }
            }
            long j3 = super.read(buffer, Math.min(j, this.f123472e));
            if (j3 != -1) {
                this.f123472e -= j3;
                return j3;
            }
            kjl.this.f123459b.m101348t();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m146258k();
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: l.kjl$e */
    public class C18033e extends AbstractC18030b {

        /* JADX INFO: renamed from: d */
        public long f123475d;

        public C18033e(long j) {
            super();
            this.f123475d = j;
            if (j == 0) {
                m146258k();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f123466b) {
                return;
            }
            if (this.f123475d != 0 && !tck0.m188015p(this, 100, TimeUnit.MILLISECONDS)) {
                kjl.this.f123459b.m101348t();
                m146258k();
            }
            this.f123466b = true;
        }

        @Override // p149l.kjl.AbstractC18030b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f123466b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            long j2 = this.f123475d;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(buffer, Math.min(j2, j));
            if (j3 == -1) {
                kjl.this.f123459b.m101348t();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m146258k();
                throw protocolException;
            }
            long j4 = this.f123475d - j3;
            this.f123475d = j4;
            if (j4 == 0) {
                m146258k();
            }
            return j3;
        }
    }

    /* JADX INFO: renamed from: l.kjl$f */
    public final class C18034f implements Sink {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f123477a;

        /* JADX INFO: renamed from: b */
        public boolean f123478b;

        public C18034f() {
            this.f123477a = new ForwardingTimeout(kjl.this.f123461d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f123478b) {
                return;
            }
            this.f123478b = true;
            kjl.this.m146249r(this.f123477a);
            kjl.this.f123462e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f123478b) {
                return;
            }
            kjl.this.f123461d.flush();
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f123477a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f123478b) {
                qkq0.m175383a("closed");
            } else {
                tck0.m188005f(buffer.size(), 0L, j);
                kjl.this.f123461d.write(buffer, j);
            }
        }
    }

    /* JADX INFO: renamed from: l.kjl$g */
    public class C18035g extends AbstractC18030b {

        /* JADX INFO: renamed from: d */
        public boolean f123480d;

        public C18035g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f123466b) {
                return;
            }
            if (!this.f123480d) {
                m146258k();
            }
            this.f123466b = true;
        }

        @Override // p149l.kjl.AbstractC18030b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f123466b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            if (this.f123480d) {
                return -1L;
            }
            long j2 = super.read(buffer, j);
            if (j2 != -1) {
                return j2;
            }
            this.f123480d = true;
            m146258k();
            return -1L;
        }
    }

    public kjl(k850 k850Var, bec0 bec0Var, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f123458a = k850Var;
        this.f123459b = bec0Var;
        this.f123460c = bufferedSource;
        this.f123461d = bufferedSink;
    }

    /* JADX INFO: renamed from: A */
    public void m146248A(oxk oxkVar, String str) throws IOException {
        if (this.f123462e != 0) {
            dxc0.m114002a("state: ", this.f123462e);
            return;
        }
        this.f123461d.writeUtf8(str).writeUtf8("\r\n");
        int iM166559k = oxkVar.m166559k();
        int i = 0;
        while (true) {
            BufferedSink bufferedSink = this.f123461d;
            if (i >= iM166559k) {
                bufferedSink.writeUtf8("\r\n");
                this.f123462e = 1;
                return;
            } else {
                bufferedSink.writeUtf8(oxkVar.m166556f(i)).writeUtf8(": ").writeUtf8(oxkVar.m166561m(i)).writeUtf8("\r\n");
                i++;
            }
        }
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: a */
    public long mo144532a(exc0 exc0Var) {
        if (!kkl.m146335c(exc0Var)) {
            return 0L;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(exc0Var.m118611u(HttpHeaders.TRANSFER_ENCODING))) {
            return -1L;
        }
        return kkl.m146334b(exc0Var);
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: b */
    public Sink mo144533b(stc0 stc0Var, long j) throws IOException {
        if (stc0Var.m185871a() != null && stc0Var.m185871a().isDuplex()) {
            aza0.m99642a("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(stc0Var.m185873c(HttpHeaders.TRANSFER_ENCODING))) {
            return m146250s();
        }
        if (j != -1) {
            return m146253v();
        }
        qkq0.m175383a("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: c */
    public void mo144534c() throws IOException {
        this.f123461d.flush();
    }

    @Override // p149l.k5f
    public void cancel() {
        bec0 bec0Var = this.f123459b;
        if (bec0Var != null) {
            bec0Var.m101335g();
        }
    }

    @Override // p149l.k5f
    public bec0 connection() {
        return this.f123459b;
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: d */
    public void mo144535d(stc0 stc0Var) throws IOException {
        m146248A(stc0Var.m185875e(), fuc0.m123184a(stc0Var, this.f123459b.mo101330b().m145832b().type()));
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: e */
    public void mo144536e() throws IOException {
        this.f123461d.flush();
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: f */
    public exc0.C16708a mo144537f(boolean z) throws IOException {
        int i = this.f123462e;
        if (i != 1 && i != 3) {
            dxc0.m114002a("state: ", this.f123462e);
            return null;
        }
        try {
            hwf0 hwf0VarM133243a = hwf0.m133243a(m146255x());
            exc0.C16708a c16708aM118622j = new exc0.C16708a().m118627o(hwf0VarM133243a.f109756a).m118619g(hwf0VarM133243a.f109757b).m118624l(hwf0VarM133243a.f109758c).m118622j(m146256y());
            if (z && hwf0VarM133243a.f109757b == 100) {
                return null;
            }
            if (hwf0VarM133243a.f109757b == 100) {
                this.f123462e = 3;
                return c16708aM118622j;
            }
            this.f123462e = 4;
            return c16708aM118622j;
        } catch (EOFException e) {
            bec0 bec0Var = this.f123459b;
            throw new IOException("unexpected end of stream on " + (bec0Var != null ? bec0Var.mo101330b().m145831a().m105837l().m107512G() : "unknown"), e);
        }
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: g */
    public Source mo144538g(exc0 exc0Var) {
        if (!kkl.m146335c(exc0Var)) {
            return m146252u(0L);
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(exc0Var.m118611u(HttpHeaders.TRANSFER_ENCODING))) {
            return m146251t(exc0Var.m118604Y().m185881k());
        }
        long jM146334b = kkl.m146334b(exc0Var);
        return jM146334b != -1 ? m146252u(jM146334b) : m146254w();
    }

    /* JADX INFO: renamed from: r */
    public final void m146249r(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* JADX INFO: renamed from: s */
    public final Sink m146250s() {
        if (this.f123462e == 1) {
            this.f123462e = 2;
            return new C18031c();
        }
        dxc0.m114002a("state: ", this.f123462e);
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final Source m146251t(cll cllVar) {
        if (this.f123462e == 4) {
            this.f123462e = 5;
            return new C18032d(cllVar);
        }
        dxc0.m114002a("state: ", this.f123462e);
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final Source m146252u(long j) {
        if (this.f123462e == 4) {
            this.f123462e = 5;
            return new C18033e(j);
        }
        dxc0.m114002a("state: ", this.f123462e);
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final Sink m146253v() {
        if (this.f123462e == 1) {
            this.f123462e = 2;
            return new C18034f();
        }
        dxc0.m114002a("state: ", this.f123462e);
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final Source m146254w() {
        if (this.f123462e != 4) {
            dxc0.m114002a("state: ", this.f123462e);
            return null;
        }
        this.f123462e = 5;
        this.f123459b.m101348t();
        return new C18035g();
    }

    /* JADX INFO: renamed from: x */
    public final String m146255x() throws IOException {
        String utf8LineStrict = this.f123460c.readUtf8LineStrict(this.f123463f);
        this.f123463f -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }

    /* JADX INFO: renamed from: y */
    public final oxk m146256y() throws IOException {
        oxk.C19066a c19066a = new oxk.C19066a();
        while (true) {
            String strM146255x = m146255x();
            if (strM146255x.length() == 0) {
                return c19066a.m166567e();
            }
            kxm.f125142a.mo144871a(c19066a, strM146255x);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m146257z(exc0 exc0Var) throws IOException {
        long jM146334b = kkl.m146334b(exc0Var);
        if (jM146334b == -1) {
            return;
        }
        Source sourceM146252u = m146252u(jM146334b);
        tck0.m187992E(sourceM146252u, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        sourceM146252u.close();
    }
}
