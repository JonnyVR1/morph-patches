package com.tencent.cloud.p080ai.network.okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.meituan.robust.Constants;
import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13884d;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13878e;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13887c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13889e;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13944j;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import p153l.e7b0;
import p153l.fcg0;
import p153l.h5d0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a */
/* JADX INFO: loaded from: classes12.dex */
public final class C13890a implements InterfaceC13885a {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f57433a;

    /* JADX INFO: renamed from: b */
    public final C13878e f57434b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13941g f57435c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13940f f57436d;

    /* JADX INFO: renamed from: e */
    public int f57437e = 0;

    /* JADX INFO: renamed from: f */
    public long f57438f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: g */
    public C13929o f57439g;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$b */
    public abstract class b implements InterfaceC13957w {

        /* JADX INFO: renamed from: a */
        public final C13944j f57440a;

        /* JADX INFO: renamed from: b */
        public boolean f57441b;

        public b() {
            this.f57440a = new C13944j(C13890a.this.f57435c.timeout());
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            try {
                return C13890a.this.f57435c.mo82814a(c13939e, j);
            } catch (IOException e) {
                C13890a.this.f57434b.m82849b();
                m82898k();
                throw e;
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m82898k() {
            C13890a c13890a = C13890a.this;
            int i = c13890a.f57437e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                h5d0.m133654a("state: ", C13890a.this.f57437e);
            } else {
                C13890a.m82893a(c13890a, this.f57440a);
                C13890a.this.f57437e = 6;
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        public C13958x timeout() {
            return this.f57440a;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$c */
    public final class c implements InterfaceC13956v {

        /* JADX INFO: renamed from: a */
        public final C13944j f57443a;

        /* JADX INFO: renamed from: b */
        public boolean f57444b;

        public c() {
            this.f57443a = new C13944j(C13890a.this.f57436d.timeout());
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f57444b) {
                return;
            }
            this.f57444b = true;
            C13890a.this.f57436d.mo83092a("0\r\n\r\n");
            C13890a.m82893a(C13890a.this, this.f57443a);
            C13890a.this.f57437e = 3;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
        public synchronized void flush() {
            if (this.f57444b) {
                return;
            }
            C13890a.this.f57436d.flush();
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public C13958x timeout() {
            return this.f57443a;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public void write(C13939e c13939e, long j) {
            if (this.f57444b) {
                wtq0.m207906a("closed");
            } else {
                if (j == 0) {
                    return;
                }
                C13890a.this.f57436d.mo83112e(j);
                C13890a.this.f57436d.mo83092a("\r\n");
                C13890a.this.f57436d.write(c13939e, j);
                C13890a.this.f57436d.mo83092a("\r\n");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$d */
    public class d extends b {

        /* JADX INFO: renamed from: d */
        public final C13930p f57446d;

        /* JADX INFO: renamed from: e */
        public long f57447e;

        /* JADX INFO: renamed from: f */
        public boolean f57448f;

        public d(C13930p c13930p) {
            super();
            this.f57447e = -1L;
            this.f57448f = true;
            this.f57446d = c13930p;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http1.C13890a.b, com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f57441b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            if (!this.f57448f) {
                return -1L;
            }
            long j2 = this.f57447e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    C13890a.this.f57435c.mo83113e();
                }
                try {
                    this.f57447e = C13890a.this.f57435c.mo83105c();
                    String strTrim = C13890a.this.f57435c.mo83113e().trim();
                    if (this.f57447e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Constants.PACKNAME_END))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f57447e + strTrim + "\"");
                    }
                    if (this.f57447e == 0) {
                        this.f57448f = false;
                        C13890a c13890a = C13890a.this;
                        c13890a.f57439g = c13890a.m82897d();
                        C13887c.m82888a(C13890a.this.f57433a.cookieJar(), this.f57446d, C13890a.this.f57439g);
                        m82898k();
                    }
                    if (!this.f57448f) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo82814a = super.mo82814a(c13939e, Math.min(j, this.f57447e));
            if (jMo82814a != -1) {
                this.f57447e -= jMo82814a;
                return jMo82814a;
            }
            C13890a.this.f57434b.m82849b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m82898k();
            throw protocolException;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f57441b) {
                return;
            }
            if (this.f57448f && !C13869c.m82801a(this, 100, TimeUnit.MILLISECONDS)) {
                C13890a.this.f57434b.m82849b();
                m82898k();
            }
            this.f57441b = true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$e */
    public class e extends b {

        /* JADX INFO: renamed from: d */
        public long f57450d;

        public e(long j) {
            super();
            this.f57450d = j;
            if (j == 0) {
                m82898k();
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http1.C13890a.b, com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f57441b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            long j2 = this.f57450d;
            if (j2 == 0) {
                return -1L;
            }
            long jMo82814a = super.mo82814a(c13939e, Math.min(j2, j));
            if (jMo82814a == -1) {
                C13890a.this.f57434b.m82849b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m82898k();
                throw protocolException;
            }
            long j3 = this.f57450d - jMo82814a;
            this.f57450d = j3;
            if (j3 == 0) {
                m82898k();
            }
            return jMo82814a;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f57441b) {
                return;
            }
            if (this.f57450d != 0 && !C13869c.m82801a(this, 100, TimeUnit.MILLISECONDS)) {
                C13890a.this.f57434b.m82849b();
                m82898k();
            }
            this.f57441b = true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$f */
    public final class f implements InterfaceC13956v {

        /* JADX INFO: renamed from: a */
        public final C13944j f57452a;

        /* JADX INFO: renamed from: b */
        public boolean f57453b;

        public f() {
            this.f57452a = new C13944j(C13890a.this.f57436d.timeout());
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f57453b) {
                return;
            }
            this.f57453b = true;
            C13890a.m82893a(C13890a.this, this.f57452a);
            C13890a.this.f57437e = 3;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
        public void flush() {
            if (this.f57453b) {
                return;
            }
            C13890a.this.f57436d.flush();
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public C13958x timeout() {
            return this.f57452a;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public void write(C13939e c13939e, long j) {
            if (this.f57453b) {
                wtq0.m207906a("closed");
            } else {
                C13869c.m82797a(c13939e.f57818b, 0L, j);
                C13890a.this.f57436d.write(c13939e, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$g */
    public class g extends b {

        /* JADX INFO: renamed from: d */
        public boolean f57455d;

        public g(C13890a c13890a) {
            super();
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http1.C13890a.b, com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f57441b) {
                wtq0.m207906a("closed");
                return 0L;
            }
            if (this.f57455d) {
                return -1L;
            }
            long jMo82814a = super.mo82814a(c13939e, j);
            if (jMo82814a != -1) {
                return jMo82814a;
            }
            this.f57455d = true;
            m82898k();
            return -1L;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f57441b) {
                return;
            }
            if (!this.f57455d) {
                m82898k();
            }
            this.f57441b = true;
        }
    }

    public C13890a(OkHttpClient okHttpClient, C13878e c13878e, InterfaceC13941g interfaceC13941g, InterfaceC13940f interfaceC13940f) {
        this.f57433a = okHttpClient;
        this.f57434b = c13878e;
        this.f57435c = interfaceC13941g;
        this.f57436d = interfaceC13940f;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public Response.Builder mo82874a(boolean z) throws IOException {
        int i = this.f57437e;
        if (i != 1 && i != 3) {
            h5d0.m133654a("state: ", this.f57437e);
            return null;
        }
        try {
            String strMo83107c = this.f57435c.mo83107c(this.f57438f);
            this.f57438f -= (long) strMo83107c.length();
            C13889e c13889eM82891a = C13889e.m82891a(strMo83107c);
            Response.Builder builderHeaders = new Response.Builder().protocol(c13889eM82891a.f57430a).code(c13889eM82891a.f57431b).message(c13889eM82891a.f57432c).headers(m82897d());
            if (z && c13889eM82891a.f57431b == 100) {
                return null;
            }
            if (c13889eM82891a.f57431b == 100) {
                this.f57437e = 3;
                return builderHeaders;
            }
            this.f57437e = 4;
            return builderHeaders;
        } catch (EOFException e2) {
            C13878e c13878e = this.f57434b;
            throw new IOException("unexpected end of stream on " + (c13878e != null ? c13878e.f57355c.f57790a.f57243a.m83049f() : "unknown"), e2);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: b */
    public InterfaceC13957w mo82878b(Response response) {
        if (!C13887c.m82889b(response)) {
            return m82895a(0L);
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) {
            C13930p c13930pUrl = response.request().url();
            if (this.f57437e == 4) {
                this.f57437e = 5;
                return new d(c13930pUrl);
            }
            h5d0.m133654a("state: ", this.f57437e);
            return null;
        }
        long jM82885a = C13887c.m82885a(response);
        if (jM82885a != -1) {
            return m82895a(jM82885a);
        }
        if (this.f57437e != 4) {
            h5d0.m133654a("state: ", this.f57437e);
            return null;
        }
        this.f57437e = 5;
        this.f57434b.m82849b();
        return new g(this);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: c */
    public void mo82880c() {
        this.f57436d.flush();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    public void cancel() {
        C13878e c13878e = this.f57434b;
        if (c13878e != null) {
            C13869c.m82799a(c13878e.f57356d);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    public C13878e connection() {
        return this.f57434b;
    }

    /* JADX INFO: renamed from: d */
    public final C13929o m82897d() {
        C13929o.a aVar = new C13929o.a();
        while (true) {
            String strMo83107c = this.f57435c.mo83107c(this.f57438f);
            this.f57438f -= (long) strMo83107c.length();
            if (strMo83107c.length() == 0) {
                return new C13929o(aVar);
            }
            ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
            int iIndexOf = strMo83107c.indexOf(":", 1);
            if (iIndexOf != -1) {
                aVar.m83033a(strMo83107c.substring(0, iIndexOf), strMo83107c.substring(iIndexOf + 1));
            } else if (strMo83107c.startsWith(":")) {
                String strSubstring = strMo83107c.substring(1);
                aVar.f57755a.add("");
                aVar.f57755a.add(strSubstring.trim());
            } else {
                aVar.f57755a.add("");
                aVar.f57755a.add(strMo83107c.trim());
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: b */
    public void mo82879b() {
        this.f57436d.flush();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public InterfaceC13956v mo82876a(Request request, long j) throws ProtocolException {
        if (request.body() != null && request.body().isDuplex()) {
            e7b0.m119688a("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(request.header(HttpHeaders.TRANSFER_ENCODING))) {
            if (this.f57437e == 1) {
                this.f57437e = 2;
                return new c();
            }
            h5d0.m133654a("state: ", this.f57437e);
            return null;
        }
        if (j != -1) {
            if (this.f57437e == 1) {
                this.f57437e = 2;
                return new f();
            }
            h5d0.m133654a("state: ", this.f57437e);
            return null;
        }
        wtq0.m207906a("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public void mo82877a(Request request) {
        Proxy.Type type = this.f57434b.f57355c.f57791b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(C13884d.m82869a(request.url()));
        }
        sb.append(" HTTP/1.1");
        m82896a(request.headers(), sb.toString());
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public long mo82873a(Response response) {
        if (!C13887c.m82889b(response)) {
            return 0L;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) {
            return -1L;
        }
        return C13887c.m82885a(response);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public C13929o mo82875a() {
        if (this.f57437e == 6) {
            C13929o c13929o = this.f57439g;
            return c13929o != null ? c13929o : C13869c.f57304b;
        }
        wtq0.m207906a("too early; can't read the trailers yet");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m82896a(C13929o c13929o, String str) {
        if (this.f57437e == 0) {
            this.f57436d.mo83092a(str).mo83092a("\r\n");
            int iM83028b = c13929o.m83028b();
            int i = 0;
            while (true) {
                InterfaceC13940f interfaceC13940f = this.f57436d;
                if (i < iM83028b) {
                    interfaceC13940f.mo83092a(c13929o.m83027a(i)).mo83092a(": ").mo83092a(c13929o.m83029b(i)).mo83092a("\r\n");
                    i++;
                } else {
                    interfaceC13940f.mo83092a("\r\n");
                    this.f57437e = 1;
                    return;
                }
            }
        } else {
            h5d0.m133654a("state: ", this.f57437e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82893a(C13890a c13890a, C13944j c13944j) {
        c13890a.getClass();
        C13958x c13958x = c13944j.f57829e;
        c13944j.f57829e = C13958x.f57864d;
        c13958x.mo83132a();
        c13958x.mo83135b();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13957w m82895a(long j) {
        if (this.f57437e == 4) {
            this.f57437e = 5;
            return new e(j);
        }
        h5d0.m133654a("state: ", this.f57437e);
        return null;
    }
}
