package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
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
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p149l.aza0;
import p149l.rhg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.o */
/* JADX INFO: loaded from: classes13.dex */
public final class C13742o implements InterfaceC13722a {

    /* JADX INFO: renamed from: g */
    public static final List<String> f56723g = C13706c.m81610a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List<String> f56724h = Collections.unmodifiableList(Arrays.asList((Object[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"}.clone()));

    /* JADX INFO: renamed from: a */
    public final Interceptor.Chain f56725a;

    /* JADX INFO: renamed from: b */
    public final C13715e f56726b;

    /* JADX INFO: renamed from: c */
    public final C13733f f56727c;

    /* JADX INFO: renamed from: d */
    public volatile C13744q f56728d;

    /* JADX INFO: renamed from: e */
    public final EnumC13768q f56729e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f56730f;

    public C13742o(OkHttpClient okHttpClient, C13715e c13715e, Interceptor.Chain chain, C13733f c13733f) {
        this.f56726b = c13715e;
        this.f56725a = chain;
        this.f56727c = c13733f;
        List<EnumC13768q> listProtocols = okHttpClient.protocols();
        EnumC13768q enumC13768q = EnumC13768q.H2_PRIOR_KNOWLEDGE;
        this.f56729e = listProtocols.contains(enumC13768q) ? enumC13768q : EnumC13768q.HTTP_2;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public void mo81694a(Request request) throws IOException {
        int i;
        C13744q c13744q;
        boolean z;
        if (this.f56728d != null) {
            return;
        }
        boolean z2 = request.body() != null;
        C13766o c13766oHeaders = request.headers();
        ArrayList arrayList = new ArrayList(c13766oHeaders.m81845b() + 4);
        arrayList.add(new C13730c(C13730c.f56623f, ByteString.encodeUtf8(request.method())));
        arrayList.add(new C13730c(C13730c.f56624g, ByteString.encodeUtf8(C13721d.m81686a(request.url()))));
        String strHeader = request.header("Host");
        if (strHeader != null) {
            arrayList.add(new C13730c(C13730c.f56626i, ByteString.encodeUtf8(strHeader)));
        }
        arrayList.add(new C13730c(C13730c.f56625h, ByteString.encodeUtf8(request.url().f56909a)));
        int iM81845b = c13766oHeaders.m81845b();
        for (int i2 = 0; i2 < iM81845b; i2++) {
            String lowerCase = c13766oHeaders.m81844a(i2).toLowerCase(Locale.US);
            if (!f56723g.contains(lowerCase) || (lowerCase.equals("te") && c13766oHeaders.m81846b(i2).equals("trailers"))) {
                arrayList.add(new C13730c(lowerCase, c13766oHeaders.m81846b(i2)));
            }
        }
        C13733f c13733f = this.f56727c;
        boolean z3 = !z2;
        synchronized (c13733f.f56676v) {
            synchronized (c13733f) {
                try {
                    if (c13733f.f56660f > 1073741823) {
                        c13733f.m81738a(EnumC13729b.REFUSED_STREAM);
                    }
                    if (c13733f.f56661g) {
                        throw new C13728a();
                    }
                    i = c13733f.f56660f;
                    c13733f.f56660f = i + 2;
                    c13744q = new C13744q(i, c13733f, z3, false, null);
                    z = !z2 || c13733f.f56672r == 0 || c13744q.f56744b == 0;
                    if (c13744q.m81764e()) {
                        c13733f.f56657c.put(Integer.valueOf(i), c13744q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c13733f.f56676v.m81777a(z3, i, arrayList);
        }
        if (z) {
            C13745r c13745r = c13733f.f56676v;
            synchronized (c13745r) {
                if (c13745r.f56774e) {
                    throw new IOException("closed");
                }
                c13745r.f56770a.flush();
            }
        }
        this.f56728d = c13744q;
        boolean z4 = this.f56730f;
        C13744q c13744q2 = this.f56728d;
        if (z4) {
            c13744q2.m81757a(EnumC13729b.CANCEL);
            rhg0.m179353a("Canceled");
            return;
        }
        C13744q.c cVar = c13744q2.f56751i;
        long timeoutMillis = this.f56725a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.mo81951a(timeoutMillis, timeUnit);
        this.f56728d.f56752j.mo81951a(this.f56725a.writeTimeoutMillis(), timeUnit);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: b */
    public void mo81696b() {
        this.f56727c.flush();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: c */
    public void mo81697c() throws IOException {
        ((C13744q.a) this.f56728d.m81762c()).close();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    public void cancel() {
        this.f56730f = true;
        if (this.f56728d != null) {
            this.f56728d.m81757a(EnumC13729b.CANCEL);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    public C13715e connection() {
        return this.f56726b;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: b */
    public InterfaceC13794w mo81695b(Response response) {
        return this.f56728d.f56749g;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public InterfaceC13793v mo81693a(Request request, long j) {
        return this.f56728d.m81762c();
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public Response.Builder mo81691a(boolean z) throws IOException {
        C13766o c13766oRemoveFirst;
        C13744q c13744q = this.f56728d;
        synchronized (c13744q) {
            c13744q.f56751i.m81893h();
            while (c13744q.f56747e.isEmpty() && c13744q.f56753k == null) {
                try {
                    c13744q.m81765f();
                } catch (Throwable th) {
                    c13744q.f56751i.m81769k();
                    throw th;
                }
            }
            c13744q.f56751i.m81769k();
            if (!c13744q.f56747e.isEmpty()) {
                c13766oRemoveFirst = c13744q.f56747e.removeFirst();
            } else {
                IOException iOException = c13744q.f56754l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C13749v(c13744q.f56753k);
            }
        }
        EnumC13768q enumC13768q = this.f56729e;
        C13766o.a aVar = new C13766o.a();
        int iM81845b = c13766oRemoveFirst.m81845b();
        C13726e c13726eM81708a = null;
        for (int i = 0; i < iM81845b; i++) {
            String strM81844a = c13766oRemoveFirst.m81844a(i);
            String strM81846b = c13766oRemoveFirst.m81846b(i);
            if (strM81844a.equals(":status")) {
                c13726eM81708a = C13726e.m81708a("HTTP/1.1 " + strM81846b);
            } else if (!f56724h.contains(strM81844a)) {
                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                aVar.f56907a.add(strM81844a);
                aVar.f56907a.add(strM81846b.trim());
            }
        }
        if (c13726eM81708a != null) {
            Response.Builder builderHeaders = new Response.Builder().protocol(enumC13768q).code(c13726eM81708a.f56583b).message(c13726eM81708a.f56584c).headers(new C13766o(aVar));
            if (z) {
                ((OkHttpClient.C13689a) AbstractC13704a.f56453a).getClass();
                if (builderHeaders.code == 100) {
                    return null;
                }
            }
            return builderHeaders;
        }
        aza0.m99642a("Expected ':status' header not present");
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public long mo81690a(Response response) {
        return C13724c.m81702a(response);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a
    /* JADX INFO: renamed from: a */
    public C13766o mo81692a() throws IOException {
        C13766o c13766o;
        C13744q c13744q = this.f56728d;
        synchronized (c13744q) {
            try {
                EnumC13729b enumC13729b = c13744q.f56753k;
                if (enumC13729b != null) {
                    IOException iOException = c13744q.f56754l;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new C13749v(enumC13729b);
                }
                C13744q.b bVar = c13744q.f56749g;
                if (bVar.f56766f && bVar.f56761a.mo81935g() && c13744q.f56749g.f56762b.mo81935g()) {
                    c13766o = c13744q.f56749g.f56764d;
                    if (c13766o == null) {
                        c13766o = C13706c.f56456b;
                    }
                } else {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13766o;
    }
}
