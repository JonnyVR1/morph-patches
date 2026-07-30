package p153l;

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
public final class bml implements o6f {

    /* JADX INFO: renamed from: a */
    public final rg50 f77328a;

    /* JADX INFO: renamed from: b */
    public final imc0 f77329b;

    /* JADX INFO: renamed from: c */
    public final BufferedSource f77330c;

    /* JADX INFO: renamed from: d */
    public final BufferedSink f77331d;

    /* JADX INFO: renamed from: e */
    public int f77332e = 0;

    /* JADX INFO: renamed from: f */
    public long f77333f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: g */
    public e0l f77334g;

    /* JADX INFO: renamed from: l.bml$b */
    public abstract class AbstractC16045b implements Source {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f77335a;

        /* JADX INFO: renamed from: b */
        public boolean f77336b;

        public AbstractC16045b() {
            this.f77335a = new ForwardingTimeout(bml.this.f77330c.getTimeout());
        }

        /* JADX INFO: renamed from: k */
        public final void m105210k() {
            if (bml.this.f77332e == 6) {
                return;
            }
            int i = bml.this.f77332e;
            bml bmlVar = bml.this;
            if (i != 5) {
                h5d0.m133654a("state: ", bmlVar.f77332e);
            } else {
                bmlVar.m105201r(this.f77335a);
                bml.this.f77332e = 6;
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            try {
                return bml.this.f77330c.read(buffer, j);
            } catch (IOException e) {
                bml.this.f77329b.m140916t();
                m105210k();
                throw e;
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f77335a;
        }
    }

    /* JADX INFO: renamed from: l.bml$c */
    public final class C16046c implements Sink {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f77338a;

        /* JADX INFO: renamed from: b */
        public boolean f77339b;

        public C16046c() {
            this.f77338a = new ForwardingTimeout(bml.this.f77331d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f77339b) {
                return;
            }
            this.f77339b = true;
            bml.this.f77331d.writeUtf8("0\r\n\r\n");
            bml.this.m105201r(this.f77338a);
            bml.this.f77332e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f77339b) {
                return;
            }
            bml.this.f77331d.flush();
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f77338a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f77339b) {
                wtq0.m207906a("closed");
            } else {
                if (j == 0) {
                    return;
                }
                bml.this.f77331d.writeHexadecimalUnsignedLong(j);
                bml.this.f77331d.writeUtf8("\r\n");
                bml.this.f77331d.write(buffer, j);
                bml.this.f77331d.writeUtf8("\r\n");
            }
        }
    }

    /* JADX INFO: renamed from: l.bml$d */
    public class C16047d extends AbstractC16045b {

        /* JADX INFO: renamed from: d */
        public final rnl f77341d;

        /* JADX INFO: renamed from: e */
        public long f77342e;

        /* JADX INFO: renamed from: f */
        public boolean f77343f;

        public C16047d(rnl rnlVar) {
            super();
            this.f77342e = -1L;
            this.f77343f = true;
            this.f77341d = rnlVar;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f77336b) {
                return;
            }
            if (this.f77343f && !zlk0.m220254p(this, 100, TimeUnit.MILLISECONDS)) {
                bml.this.f77329b.m140916t();
                m105210k();
            }
            this.f77336b = true;
        }

        /* JADX INFO: renamed from: m */
        public final void m105211m() throws IOException {
            if (this.f77342e != -1) {
                bml.this.f77330c.readUtf8LineStrict();
            }
            try {
                this.f77342e = bml.this.f77330c.readHexadecimalUnsignedLong();
                String strTrim = bml.this.f77330c.readUtf8LineStrict().trim();
                if (this.f77342e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Constants.PACKNAME_END))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f77342e + strTrim + "\"");
                }
                if (this.f77342e == 0) {
                    this.f77343f = false;
                    bml bmlVar = bml.this;
                    bmlVar.f77334g = bmlVar.m105208y();
                    yml.m216704g(bml.this.f77328a.m181349l(), this.f77341d, bml.this.f77334g);
                    m105210k();
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // p153l.bml.AbstractC16045b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f77336b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            if (!this.f77343f) {
                return -1L;
            }
            long j2 = this.f77342e;
            if (j2 == 0 || j2 == -1) {
                m105211m();
                if (!this.f77343f) {
                    return -1L;
                }
            }
            long j3 = super.read(buffer, Math.min(j, this.f77342e));
            if (j3 != -1) {
                this.f77342e -= j3;
                return j3;
            }
            bml.this.f77329b.m140916t();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m105210k();
            throw protocolException;
        }
    }

    /* JADX INFO: renamed from: l.bml$e */
    public class C16048e extends AbstractC16045b {

        /* JADX INFO: renamed from: d */
        public long f77345d;

        public C16048e(long j) {
            super();
            this.f77345d = j;
            if (j == 0) {
                m105210k();
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f77336b) {
                return;
            }
            if (this.f77345d != 0 && !zlk0.m220254p(this, 100, TimeUnit.MILLISECONDS)) {
                bml.this.f77329b.m140916t();
                m105210k();
            }
            this.f77336b = true;
        }

        @Override // p153l.bml.AbstractC16045b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f77336b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            long j2 = this.f77345d;
            if (j2 == 0) {
                return -1L;
            }
            long j3 = super.read(buffer, Math.min(j2, j));
            if (j3 == -1) {
                bml.this.f77329b.m140916t();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m105210k();
                throw protocolException;
            }
            long j4 = this.f77345d - j3;
            this.f77345d = j4;
            if (j4 == 0) {
                m105210k();
            }
            return j3;
        }
    }

    /* JADX INFO: renamed from: l.bml$f */
    public final class C16049f implements Sink {

        /* JADX INFO: renamed from: a */
        public final ForwardingTimeout f77347a;

        /* JADX INFO: renamed from: b */
        public boolean f77348b;

        public C16049f() {
            this.f77347a = new ForwardingTimeout(bml.this.f77331d.getTimeout());
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f77348b) {
                return;
            }
            this.f77348b = true;
            bml.this.m105201r(this.f77347a);
            bml.this.f77332e = 3;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (this.f77348b) {
                return;
            }
            bml.this.f77331d.flush();
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f77347a;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f77348b) {
                wtq0.m207906a("closed");
            } else {
                zlk0.m220244f(buffer.size(), 0L, j);
                bml.this.f77331d.write(buffer, j);
            }
        }
    }

    /* JADX INFO: renamed from: l.bml$g */
    public class C16050g extends AbstractC16045b {

        /* JADX INFO: renamed from: d */
        public boolean f77350d;

        public C16050g() {
            super();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f77336b) {
                return;
            }
            if (!this.f77350d) {
                m105210k();
            }
            this.f77336b = true;
        }

        @Override // p153l.bml.AbstractC16045b, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f77336b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            if (this.f77350d) {
                return -1L;
            }
            long j2 = super.read(buffer, j);
            if (j2 != -1) {
                return j2;
            }
            this.f77350d = true;
            m105210k();
            return -1L;
        }
    }

    public bml(rg50 rg50Var, imc0 imc0Var, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f77328a = rg50Var;
        this.f77329b = imc0Var;
        this.f77330c = bufferedSource;
        this.f77331d = bufferedSink;
    }

    /* JADX INFO: renamed from: A */
    public void m105193A(e0l e0lVar, String str) throws IOException {
        if (this.f77332e != 0) {
            h5d0.m133654a("state: ", this.f77332e);
            return;
        }
        this.f77331d.writeUtf8(str).writeUtf8("\r\n");
        int iM118878k = e0lVar.m118878k();
        int i = 0;
        while (true) {
            BufferedSink bufferedSink = this.f77331d;
            if (i >= iM118878k) {
                bufferedSink.writeUtf8("\r\n");
                this.f77332e = 1;
                return;
            } else {
                bufferedSink.writeUtf8(e0lVar.m118875f(i)).writeUtf8(": ").writeUtf8(e0lVar.m118880m(i)).writeUtf8("\r\n");
                i++;
            }
        }
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: a */
    public long mo105194a(i5d0 i5d0Var) {
        if (!yml.m216700c(i5d0Var)) {
            return 0L;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(i5d0Var.m138675u(HttpHeaders.TRANSFER_ENCODING))) {
            return -1L;
        }
        return yml.m216699b(i5d0Var);
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: b */
    public Sink mo105195b(x1d0 x1d0Var, long j) throws IOException {
        if (x1d0Var.m209016a() != null && x1d0Var.m209016a().isDuplex()) {
            e7b0.m119688a("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(x1d0Var.m209018c(HttpHeaders.TRANSFER_ENCODING))) {
            return m105202s();
        }
        if (j != -1) {
            return m105205v();
        }
        wtq0.m207906a("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: c */
    public void mo105196c() throws IOException {
        this.f77331d.flush();
    }

    @Override // p153l.o6f
    public void cancel() {
        imc0 imc0Var = this.f77329b;
        if (imc0Var != null) {
            imc0Var.m140903g();
        }
    }

    @Override // p153l.o6f
    public imc0 connection() {
        return this.f77329b;
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: d */
    public void mo105197d(x1d0 x1d0Var) throws IOException {
        m105193A(x1d0Var.m209020e(), i2d0.m138185a(x1d0Var, this.f77329b.mo106825b().m163862b().type()));
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: e */
    public void mo105198e() throws IOException {
        this.f77331d.flush();
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: f */
    public i5d0.C17653a mo105199f(boolean z) throws IOException {
        int i = this.f77332e;
        if (i != 1 && i != 3) {
            h5d0.m133654a("state: ", this.f77332e);
            return null;
        }
        try {
            r4g0 r4g0VarM179760a = r4g0.m179760a(m105207x());
            i5d0.C17653a c17653aM138686j = new i5d0.C17653a().m138691o(r4g0VarM179760a.f161201a).m138683g(r4g0VarM179760a.f161202b).m138688l(r4g0VarM179760a.f161203c).m138686j(m105208y());
            if (z && r4g0VarM179760a.f161202b == 100) {
                return null;
            }
            if (r4g0VarM179760a.f161202b == 100) {
                this.f77332e = 3;
                return c17653aM138686j;
            }
            this.f77332e = 4;
            return c17653aM138686j;
        } catch (EOFException e) {
            imc0 imc0Var = this.f77329b;
            throw new IOException("unexpected end of stream on " + (imc0Var != null ? imc0Var.mo106825b().m163861a().m214721l().m182276G() : "unknown"), e);
        }
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: g */
    public Source mo105200g(i5d0 i5d0Var) {
        if (!yml.m216700c(i5d0Var)) {
            return m105204u(0L);
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(i5d0Var.m138675u(HttpHeaders.TRANSFER_ENCODING))) {
            return m105203t(i5d0Var.m138668Z().m209026k());
        }
        long jM216699b = yml.m216699b(i5d0Var);
        return jM216699b != -1 ? m105204u(jM216699b) : m105206w();
    }

    /* JADX INFO: renamed from: r */
    public final void m105201r(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.getDelegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* JADX INFO: renamed from: s */
    public final Sink m105202s() {
        if (this.f77332e == 1) {
            this.f77332e = 2;
            return new C16046c();
        }
        h5d0.m133654a("state: ", this.f77332e);
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final Source m105203t(rnl rnlVar) {
        if (this.f77332e == 4) {
            this.f77332e = 5;
            return new C16047d(rnlVar);
        }
        h5d0.m133654a("state: ", this.f77332e);
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final Source m105204u(long j) {
        if (this.f77332e == 4) {
            this.f77332e = 5;
            return new C16048e(j);
        }
        h5d0.m133654a("state: ", this.f77332e);
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final Sink m105205v() {
        if (this.f77332e == 1) {
            this.f77332e = 2;
            return new C16049f();
        }
        h5d0.m133654a("state: ", this.f77332e);
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final Source m105206w() {
        if (this.f77332e != 4) {
            h5d0.m133654a("state: ", this.f77332e);
            return null;
        }
        this.f77332e = 5;
        this.f77329b.m140916t();
        return new C16050g();
    }

    /* JADX INFO: renamed from: x */
    public final String m105207x() throws IOException {
        String utf8LineStrict = this.f77330c.readUtf8LineStrict(this.f77333f);
        this.f77333f -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }

    /* JADX INFO: renamed from: y */
    public final e0l m105208y() throws IOException {
        e0l.C16674a c16674a = new e0l.C16674a();
        while (true) {
            String strM105207x = m105207x();
            if (strM105207x.length() == 0) {
                return c16674a.m118886e();
            }
            kzm.f129436a.mo152192a(c16674a, strM105207x);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m105209z(i5d0 i5d0Var) throws IOException {
        long jM216699b = yml.m216699b(i5d0Var);
        if (jM216699b == -1) {
            return;
        }
        Source sourceM105204u = m105204u(jM216699b);
        zlk0.m220231E(sourceM105204u, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        sourceM105204u.close();
    }
}
