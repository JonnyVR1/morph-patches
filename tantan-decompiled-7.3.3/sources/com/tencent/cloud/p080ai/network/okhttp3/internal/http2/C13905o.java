package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
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
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpHeaderValues;
import p153l.e7b0;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.o */
/* JADX INFO: loaded from: classes12.dex */
public final class C13905o implements InterfaceC13885a {

    /* JADX INFO: renamed from: g */
    public static final List<String> f57571g = C13869c.m82793a("connection", "host", HttpHeaderValues.KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List<String> f57572h = Collections.unmodifiableList(Arrays.asList((Object[]) new String[]{"connection", "host", HttpHeaderValues.KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"}.clone()));

    /* JADX INFO: renamed from: a */
    public final Interceptor.Chain f57573a;

    /* JADX INFO: renamed from: b */
    public final C13878e f57574b;

    /* JADX INFO: renamed from: c */
    public final C13896f f57575c;

    /* JADX INFO: renamed from: d */
    public volatile C13907q f57576d;

    /* JADX INFO: renamed from: e */
    public final EnumC13931q f57577e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f57578f;

    public C13905o(OkHttpClient okHttpClient, C13878e c13878e, Interceptor.Chain chain, C13896f c13896f) {
        this.f57574b = c13878e;
        this.f57573a = chain;
        this.f57575c = c13896f;
        List<EnumC13931q> listProtocols = okHttpClient.protocols();
        EnumC13931q enumC13931q = EnumC13931q.H2_PRIOR_KNOWLEDGE;
        this.f57577e = listProtocols.contains(enumC13931q) ? enumC13931q : EnumC13931q.HTTP_2;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public void mo82877a(Request request) throws IOException {
        int i;
        C13907q c13907q;
        boolean z;
        if (this.f57576d != null) {
            return;
        }
        boolean z2 = request.body() != null;
        C13929o c13929oHeaders = request.headers();
        ArrayList arrayList = new ArrayList(c13929oHeaders.m83028b() + 4);
        arrayList.add(new C13893c(C13893c.f57471f, ByteString.encodeUtf8(request.method())));
        arrayList.add(new C13893c(C13893c.f57472g, ByteString.encodeUtf8(C13884d.m82869a(request.url()))));
        String strHeader = request.header("Host");
        if (strHeader != null) {
            arrayList.add(new C13893c(C13893c.f57474i, ByteString.encodeUtf8(strHeader)));
        }
        arrayList.add(new C13893c(C13893c.f57473h, ByteString.encodeUtf8(request.url().f57757a)));
        int iM83028b = c13929oHeaders.m83028b();
        for (int i2 = 0; i2 < iM83028b; i2++) {
            String lowerCase = c13929oHeaders.m83027a(i2).toLowerCase(Locale.US);
            if (!f57571g.contains(lowerCase) || (lowerCase.equals("te") && c13929oHeaders.m83029b(i2).equals("trailers"))) {
                arrayList.add(new C13893c(lowerCase, c13929oHeaders.m83029b(i2)));
            }
        }
        C13896f c13896f = this.f57575c;
        boolean z3 = !z2;
        synchronized (c13896f.f57524v) {
            synchronized (c13896f) {
                try {
                    if (c13896f.f57508f > 1073741823) {
                        c13896f.m82921a(EnumC13892b.REFUSED_STREAM);
                    }
                    if (c13896f.f57509g) {
                        throw new C13891a();
                    }
                    i = c13896f.f57508f;
                    c13896f.f57508f = i + 2;
                    c13907q = new C13907q(i, c13896f, z3, false, null);
                    z = !z2 || c13896f.f57520r == 0 || c13907q.f57592b == 0;
                    if (c13907q.m82947e()) {
                        c13896f.f57505c.put(Integer.valueOf(i), c13907q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c13896f.f57524v.m82960a(z3, i, arrayList);
        }
        if (z) {
            C13908r c13908r = c13896f.f57524v;
            synchronized (c13908r) {
                if (c13908r.f57622e) {
                    throw new IOException("closed");
                }
                c13908r.f57618a.flush();
            }
        }
        this.f57576d = c13907q;
        boolean z4 = this.f57578f;
        C13907q c13907q2 = this.f57576d;
        if (z4) {
            c13907q2.m82940a(EnumC13892b.CANCEL);
            zpg0.m220844a("Canceled");
            return;
        }
        C13907q.c cVar = c13907q2.f57599i;
        long timeoutMillis = this.f57573a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.mo83134a(timeoutMillis, timeUnit);
        this.f57576d.f57600j.mo83134a(this.f57573a.writeTimeoutMillis(), timeUnit);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: b */
    public void mo82879b() {
        this.f57575c.flush();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: c */
    public void mo82880c() throws IOException {
        ((C13907q.a) this.f57576d.m82945c()).close();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    public void cancel() {
        this.f57578f = true;
        if (this.f57576d != null) {
            this.f57576d.m82940a(EnumC13892b.CANCEL);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    public C13878e connection() {
        return this.f57574b;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: b */
    public InterfaceC13957w mo82878b(Response response) {
        return this.f57576d.f57597g;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public InterfaceC13956v mo82876a(Request request, long j) {
        return this.f57576d.m82945c();
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public Response.Builder mo82874a(boolean z) throws IOException {
        C13929o c13929oRemoveFirst;
        C13907q c13907q = this.f57576d;
        synchronized (c13907q) {
            c13907q.f57599i.m83076h();
            while (c13907q.f57595e.isEmpty() && c13907q.f57601k == null) {
                try {
                    c13907q.m82948f();
                } catch (Throwable th) {
                    c13907q.f57599i.m82952k();
                    throw th;
                }
            }
            c13907q.f57599i.m82952k();
            if (!c13907q.f57595e.isEmpty()) {
                c13929oRemoveFirst = c13907q.f57595e.removeFirst();
            } else {
                IOException iOException = c13907q.f57602l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new C13912v(c13907q.f57601k);
            }
        }
        EnumC13931q enumC13931q = this.f57577e;
        C13929o.a aVar = new C13929o.a();
        int iM83028b = c13929oRemoveFirst.m83028b();
        C13889e c13889eM82891a = null;
        for (int i = 0; i < iM83028b; i++) {
            String strM83027a = c13929oRemoveFirst.m83027a(i);
            String strM83029b = c13929oRemoveFirst.m83029b(i);
            if (strM83027a.equals(":status")) {
                c13889eM82891a = C13889e.m82891a("HTTP/1.1 " + strM83029b);
            } else if (!f57572h.contains(strM83027a)) {
                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                aVar.f57755a.add(strM83027a);
                aVar.f57755a.add(strM83029b.trim());
            }
        }
        if (c13889eM82891a != null) {
            Response.Builder builderHeaders = new Response.Builder().protocol(enumC13931q).code(c13889eM82891a.f57431b).message(c13889eM82891a.f57432c).headers(new C13929o(aVar));
            if (z) {
                ((OkHttpClient.C13852a) AbstractC13867a.f57301a).getClass();
                if (builderHeaders.code == 100) {
                    return null;
                }
            }
            return builderHeaders;
        }
        e7b0.m119688a("Expected ':status' header not present");
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public long mo82873a(Response response) {
        return C13887c.m82885a(response);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a
    /* JADX INFO: renamed from: a */
    public C13929o mo82875a() throws IOException {
        C13929o c13929o;
        C13907q c13907q = this.f57576d;
        synchronized (c13907q) {
            try {
                EnumC13892b enumC13892b = c13907q.f57601k;
                if (enumC13892b != null) {
                    IOException iOException = c13907q.f57602l;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new C13912v(enumC13892b);
                }
                C13907q.b bVar = c13907q.f57597g;
                if (bVar.f57614f && bVar.f57609a.mo83118g() && c13907q.f57597g.f57610b.mo83118g()) {
                    c13929o = c13907q.f57597g.f57612d;
                    if (c13929o == null) {
                        c13929o = C13869c.f57304b;
                    }
                } else {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c13929o;
    }
}
