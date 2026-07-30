package com.tencent.cloud.p075ai.network.okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.meituan.robust.Constants;
import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13721d;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13715e;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13724c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13726e;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13781j;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import p149l.aza0;
import p149l.dxc0;
import p149l.qkq0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a */
/* JADX INFO: loaded from: classes13.dex */
public final class C13727a implements InterfaceC13722a {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f56585a;

    /* JADX INFO: renamed from: b */
    public final C13715e f56586b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13778g f56587c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13777f f56588d;

    /* JADX INFO: renamed from: e */
    public int f56589e = 0;

    /* JADX INFO: renamed from: f */
    public long f56590f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: g */
    public C13766o f56591g;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$b */
    public abstract class b implements InterfaceC13794w {

        /* JADX INFO: renamed from: a */
        public final C13781j f56592a;

        /* JADX INFO: renamed from: b */
        public boolean f56593b;

        public b() {
            this.f56592a = new C13781j(C13727a.this.f56587c.timeout());
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            try {
                return C13727a.this.f56587c.mo81631a(c13776e, j);
            } catch (IOException e) {
                C13727a.this.f56586b.m81666b();
                m81715k();
                throw e;
            }
        }

        /* JADX INFO: renamed from: k */
        public final void m81715k() {
            C13727a c13727a = C13727a.this;
            int i = c13727a.f56589e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                dxc0.m114002a("state: ", C13727a.this.f56589e);
            } else {
                C13727a.m81710a(c13727a, this.f56592a);
                C13727a.this.f56589e = 6;
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        public C13795x timeout() {
            return this.f56592a;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$c */
    public final class c implements InterfaceC13793v {

        /* JADX INFO: renamed from: a */
        public final C13781j f56595a;

        /* JADX INFO: renamed from: b */
        public boolean f56596b;

        public c() {
            this.f56595a = new C13781j(C13727a.this.f56588d.timeout());
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f56596b) {
                return;
            }
            this.f56596b = true;
            C13727a.this.f56588d.mo81909a("0\r\n\r\n");
            C13727a.m81710a(C13727a.this, this.f56595a);
            C13727a.this.f56589e = 3;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
        public synchronized void flush() {
            if (this.f56596b) {
                return;
            }
            C13727a.this.f56588d.flush();
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public C13795x timeout() {
            return this.f56595a;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public void write(C13776e c13776e, long j) {
            if (this.f56596b) {
                qkq0.m175383a("closed");
            } else {
                if (j == 0) {
                    return;
                }
                C13727a.this.f56588d.mo81929e(j);
                C13727a.this.f56588d.mo81909a("\r\n");
                C13727a.this.f56588d.write(c13776e, j);
                C13727a.this.f56588d.mo81909a("\r\n");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$d */
    public class d extends b {

        /* JADX INFO: renamed from: d */
        public final C13767p f56598d;

        /* JADX INFO: renamed from: e */
        public long f56599e;

        /* JADX INFO: renamed from: f */
        public boolean f56600f;

        public d(C13767p c13767p) {
            super();
            this.f56599e = -1L;
            this.f56600f = true;
            this.f56598d = c13767p;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http1.C13727a.b, com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f56593b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            if (!this.f56600f) {
                return -1L;
            }
            long j2 = this.f56599e;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    C13727a.this.f56587c.mo81930e();
                }
                try {
                    this.f56599e = C13727a.this.f56587c.mo81922c();
                    String strTrim = C13727a.this.f56587c.mo81930e().trim();
                    if (this.f56599e < 0 || !(strTrim.isEmpty() || strTrim.startsWith(Constants.PACKNAME_END))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f56599e + strTrim + "\"");
                    }
                    if (this.f56599e == 0) {
                        this.f56600f = false;
                        C13727a c13727a = C13727a.this;
                        c13727a.f56591g = c13727a.m81714d();
                        C13724c.m81705a(C13727a.this.f56585a.cookieJar(), this.f56598d, C13727a.this.f56591g);
                        m81715k();
                    }
                    if (!this.f56600f) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jMo81631a = super.mo81631a(c13776e, Math.min(j, this.f56599e));
            if (jMo81631a != -1) {
                this.f56599e -= jMo81631a;
                return jMo81631a;
            }
            C13727a.this.f56586b.m81666b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m81715k();
            throw protocolException;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56593b) {
                return;
            }
            if (this.f56600f && !C13706c.m81618a(this, 100, TimeUnit.MILLISECONDS)) {
                C13727a.this.f56586b.m81666b();
                m81715k();
            }
            this.f56593b = true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$e */
    public class e extends b {

        /* JADX INFO: renamed from: d */
        public long f56602d;

        public e(long j) {
            super();
            this.f56602d = j;
            if (j == 0) {
                m81715k();
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http1.C13727a.b, com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f56593b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            long j2 = this.f56602d;
            if (j2 == 0) {
                return -1L;
            }
            long jMo81631a = super.mo81631a(c13776e, Math.min(j2, j));
            if (jMo81631a == -1) {
                C13727a.this.f56586b.m81666b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m81715k();
                throw protocolException;
            }
            long j3 = this.f56602d - jMo81631a;
            this.f56602d = j3;
            if (j3 == 0) {
                m81715k();
            }
            return jMo81631a;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56593b) {
                return;
            }
            if (this.f56602d != 0 && !C13706c.m81618a(this, 100, TimeUnit.MILLISECONDS)) {
                C13727a.this.f56586b.m81666b();
                m81715k();
            }
            this.f56593b = true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$f */
    public final class f implements InterfaceC13793v {

        /* JADX INFO: renamed from: a */
        public final C13781j f56604a;

        /* JADX INFO: renamed from: b */
        public boolean f56605b;

        public f() {
            this.f56604a = new C13781j(C13727a.this.f56588d.timeout());
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56605b) {
                return;
            }
            this.f56605b = true;
            C13727a.m81710a(C13727a.this, this.f56604a);
            C13727a.this.f56589e = 3;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
        public void flush() {
            if (this.f56605b) {
                return;
            }
            C13727a.this.f56588d.flush();
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public C13795x timeout() {
            return this.f56604a;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public void write(C13776e c13776e, long j) {
            if (this.f56605b) {
                qkq0.m175383a("closed");
            } else {
                C13706c.m81614a(c13776e.f56970b, 0L, j);
                C13727a.this.f56588d.write(c13776e, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http1.a$g */
    public class g extends b {

        /* JADX INFO: renamed from: d */
        public boolean f56607d;

        public g(C13727a c13727a) {
            super();
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http1.C13727a.b, com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            if (this.f56593b) {
                qkq0.m175383a("closed");
                return 0L;
            }
            if (this.f56607d) {
                return -1L;
            }
            long jMo81631a = super.mo81631a(c13776e, j);
            if (jMo81631a != -1) {
                return jMo81631a;
            }
            this.f56607d = true;
            m81715k();
            return -1L;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f56593b) {
                return;
            }
            if (!this.f56607d) {
                m81715k();
            }
            this.f56593b = true;
        }
    }

    public C13727a(OkHttpClient okHttpClient, C13715e c13715e, InterfaceC13778g interfaceC13778g, InterfaceC13777f interfaceC13777f) {
        this.f56585a = okHttpClient;
        this.f56586b = c13715e;
        this.f56587c = interfaceC13778g;
        this.f56588d = interfaceC13777f;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public Response.Builder mo81691a(boolean z) throws IOException {
        int i = this.f56589e;
        if (i != 1 && i != 3) {
            dxc0.m114002a("state: ", this.f56589e);
            return null;
        }
        try {
            String strMo81924c = this.f56587c.mo81924c(this.f56590f);
            this.f56590f -= (long) strMo81924c.length();
            C13726e c13726eM81708a = C13726e.m81708a(strMo81924c);
            Response.Builder builderHeaders = new Response.Builder().protocol(c13726eM81708a.f56582a).code(c13726eM81708a.f56583b).message(c13726eM81708a.f56584c).headers(m81714d());
            if (z && c13726eM81708a.f56583b == 100) {
                return null;
            }
            if (c13726eM81708a.f56583b == 100) {
                this.f56589e = 3;
                return builderHeaders;
            }
            this.f56589e = 4;
            return builderHeaders;
        } catch (EOFException e2) {
            C13715e c13715e = this.f56586b;
            throw new IOException("unexpected end of stream on " + (c13715e != null ? c13715e.f56507c.f56942a.f56395a.m81866f() : "unknown"), e2);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: b */
    public InterfaceC13794w mo81695b(Response response) {
        if (!C13724c.m81706b(response)) {
            return m81712a(0L);
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) {
            C13767p c13767pUrl = response.request().url();
            if (this.f56589e == 4) {
                this.f56589e = 5;
                return new d(c13767pUrl);
            }
            dxc0.m114002a("state: ", this.f56589e);
            return null;
        }
        long jM81702a = C13724c.m81702a(response);
        if (jM81702a != -1) {
            return m81712a(jM81702a);
        }
        if (this.f56589e != 4) {
            dxc0.m114002a("state: ", this.f56589e);
            return null;
        }
        this.f56589e = 5;
        this.f56586b.m81666b();
        return new g(this);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: c */
    public void mo81697c() {
        this.f56588d.flush();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    public void cancel() {
        C13715e c13715e = this.f56586b;
        if (c13715e != null) {
            C13706c.m81616a(c13715e.f56508d);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    public C13715e connection() {
        return this.f56586b;
    }

    /* JADX INFO: renamed from: d */
    public final C13766o m81714d() {
        C13766o.a aVar = new C13766o.a();
        while (true) {
            String strMo81924c = this.f56587c.mo81924c(this.f56590f);
            this.f56590f -= (long) strMo81924c.length();
            if (strMo81924c.length() == 0) {
                return new C13766o(aVar);
            }
            ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
            int iIndexOf = strMo81924c.indexOf(":", 1);
            if (iIndexOf != -1) {
                aVar.m81850a(strMo81924c.substring(0, iIndexOf), strMo81924c.substring(iIndexOf + 1));
            } else if (strMo81924c.startsWith(":")) {
                String strSubstring = strMo81924c.substring(1);
                aVar.f56907a.add("");
                aVar.f56907a.add(strSubstring.trim());
            } else {
                aVar.f56907a.add("");
                aVar.f56907a.add(strMo81924c.trim());
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: b */
    public void mo81696b() {
        this.f56588d.flush();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public InterfaceC13793v mo81693a(Request request, long j) throws ProtocolException {
        if (request.body() != null && request.body().isDuplex()) {
            aza0.m99642a("Duplex connections are not supported for HTTP/1");
            return null;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(request.header(HttpHeaders.TRANSFER_ENCODING))) {
            if (this.f56589e == 1) {
                this.f56589e = 2;
                return new c();
            }
            dxc0.m114002a("state: ", this.f56589e);
            return null;
        }
        if (j != -1) {
            if (this.f56589e == 1) {
                this.f56589e = 2;
                return new f();
            }
            dxc0.m114002a("state: ", this.f56589e);
            return null;
        }
        qkq0.m175383a("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public void mo81694a(Request request) {
        Proxy.Type type = this.f56586b.f56507c.f56943b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            sb.append(request.url());
        } else {
            sb.append(C13721d.m81686a(request.url()));
        }
        sb.append(" HTTP/1.1");
        m81713a(request.headers(), sb.toString());
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public long mo81690a(Response response) {
        if (!C13724c.m81706b(response)) {
            return 0L;
        }
        if (HttpHeaderValues.CHUNKED.equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) {
            return -1L;
        }
        return C13724c.m81702a(response);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public C13766o mo81692a() {
        if (this.f56589e == 6) {
            C13766o c13766o = this.f56591g;
            return c13766o != null ? c13766o : C13706c.f56456b;
        }
        qkq0.m175383a("too early; can't read the trailers yet");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m81713a(C13766o c13766o, String str) {
        if (this.f56589e == 0) {
            this.f56588d.mo81909a(str).mo81909a("\r\n");
            int iM81845b = c13766o.m81845b();
            int i = 0;
            while (true) {
                InterfaceC13777f interfaceC13777f = this.f56588d;
                if (i < iM81845b) {
                    interfaceC13777f.mo81909a(c13766o.m81844a(i)).mo81909a(": ").mo81909a(c13766o.m81846b(i)).mo81909a("\r\n");
                    i++;
                } else {
                    interfaceC13777f.mo81909a("\r\n");
                    this.f56589e = 1;
                    return;
                }
            }
        } else {
            dxc0.m114002a("state: ", this.f56589e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m81710a(C13727a c13727a, C13781j c13781j) {
        c13727a.getClass();
        C13795x c13795x = c13781j.f56981e;
        c13781j.f56981e = C13795x.f57016d;
        c13795x.mo81949a();
        c13795x.mo81952b();
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13794w m81712a(long j) {
        if (this.f56589e == 4) {
            this.f56589e = 5;
            return new e(j);
        }
        dxc0.m114002a("state: ", this.f56589e);
        return null;
    }
}
