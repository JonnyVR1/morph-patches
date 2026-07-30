package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13891a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13912v;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.EnumC13892b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws.RealWebSocket;
import com.tencent.cloud.p080ai.network.okio.AbstractC13942h;
import com.tencent.cloud.p080ai.network.okio.AbstractC13943i;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import p153l.aqg0;
import p153l.e7b0;
import p153l.wpg0;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b */
/* JADX INFO: loaded from: classes12.dex */
public final class C13875b {

    /* JADX INFO: renamed from: a */
    public final C13883j f57325a;

    /* JADX INFO: renamed from: b */
    public final Call f57326b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13927m f57327c;

    /* JADX INFO: renamed from: d */
    public final C13876c f57328d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC13885a f57329e;

    /* JADX INFO: renamed from: f */
    public boolean f57330f;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b$a */
    public final class a extends AbstractC13942h {

        /* JADX INFO: renamed from: b */
        public boolean f57331b;

        /* JADX INFO: renamed from: c */
        public long f57332c;

        /* JADX INFO: renamed from: d */
        public long f57333d;

        /* JADX INFO: renamed from: e */
        public boolean f57334e;

        public a(InterfaceC13956v interfaceC13956v, long j) {
            super(interfaceC13956v);
            this.f57332c = j;
        }

        /* JADX INFO: renamed from: a */
        public final IOException m82830a(IOException iOException) {
            if (this.f57331b) {
                return iOException;
            }
            this.f57331b = true;
            return C13875b.this.m82828a(this.f57333d, false, true, iOException);
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f57334e) {
                return;
            }
            this.f57334e = true;
            long j = this.f57332c;
            if (j != -1 && this.f57333d != j) {
                e7b0.m119688a("unexpected end of stream");
                return;
            }
            try {
                this.f57827a.close();
                m82830a(null);
            } catch (IOException e) {
                throw m82830a(e);
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
        public void flush() throws IOException {
            try {
                this.f57827a.flush();
            } catch (IOException e) {
                throw m82830a(e);
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public void write(C13939e c13939e, long j) throws IOException {
            if (this.f57334e) {
                wtq0.m207906a("closed");
                return;
            }
            long j2 = this.f57332c;
            if (j2 == -1 || this.f57333d + j <= j2) {
                try {
                    this.f57827a.write(c13939e, j);
                    this.f57333d += j;
                    return;
                } catch (IOException e) {
                    throw m82830a(e);
                }
            }
            throw new ProtocolException("expected " + this.f57332c + " bytes but received " + (this.f57333d + j));
        }
    }

    public C13875b(C13883j c13883j, Call call, AbstractC13927m abstractC13927m, C13876c c13876c, InterfaceC13885a interfaceC13885a) {
        this.f57325a = c13883j;
        this.f57326b = call;
        this.f57327c = abstractC13927m;
        this.f57328d = c13876c;
        this.f57329e = interfaceC13885a;
    }

    /* JADX INFO: renamed from: a */
    public void m82829a(IOException iOException) {
        this.f57328d.m82837d();
        C13878e c13878eConnection = this.f57329e.connection();
        if (!C13878e.f57353r && Thread.holdsLock(c13878eConnection.f57354b)) {
            aqg0.m99478a();
            return;
        }
        synchronized (c13878eConnection.f57354b) {
            try {
                if (iOException instanceof C13912v) {
                    EnumC13892b enumC13892b = ((C13912v) iOException).f57634a;
                    if (enumC13892b == EnumC13892b.REFUSED_STREAM) {
                        int i = c13878eConnection.f57366n + 1;
                        c13878eConnection.f57366n = i;
                        if (i > 1) {
                            c13878eConnection.f57363k = true;
                            c13878eConnection.f57364l++;
                        }
                    } else if (enumC13892b != EnumC13892b.CANCEL) {
                        c13878eConnection.f57363k = true;
                        c13878eConnection.f57364l++;
                    }
                } else if (!c13878eConnection.m82846a() || (iOException instanceof C13891a)) {
                    c13878eConnection.f57363k = true;
                    if (c13878eConnection.f57365m == 0) {
                        c13878eConnection.f57354b.m82853a(c13878eConnection.f57355c, iOException);
                        c13878eConnection.f57364l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b$b */
    public final class b extends AbstractC13943i {

        /* JADX INFO: renamed from: b */
        public final long f57336b;

        /* JADX INFO: renamed from: c */
        public long f57337c;

        /* JADX INFO: renamed from: d */
        public boolean f57338d;

        /* JADX INFO: renamed from: e */
        public boolean f57339e;

        public b(InterfaceC13957w interfaceC13957w, long j) {
            super(interfaceC13957w);
            this.f57336b = j;
            if (j == 0) {
                m82831a(null);
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws IOException {
            if (this.f57339e) {
                wtq0.m207906a("closed");
                return 0L;
            }
            try {
                long jMo82814a = this.f57828a.mo82814a(c13939e, j);
                if (jMo82814a == -1) {
                    m82831a(null);
                    return -1L;
                }
                long j2 = this.f57337c + jMo82814a;
                long j3 = this.f57336b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f57336b + " bytes but received " + j2);
                }
                this.f57337c = j2;
                if (j2 == j3) {
                    m82831a(null);
                }
                return jMo82814a;
            } catch (IOException e) {
                throw m82831a(e);
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f57339e) {
                return;
            }
            this.f57339e = true;
            try {
                this.f57828a.close();
                m82831a(null);
            } catch (IOException e) {
                throw m82831a(e);
            }
        }

        /* JADX INFO: renamed from: a */
        public IOException m82831a(IOException iOException) {
            if (this.f57338d) {
                return iOException;
            }
            this.f57338d = true;
            return C13875b.this.m82828a(this.f57337c, true, false, iOException);
        }
    }

    /* JADX INFO: renamed from: a */
    public Response.Builder m82825a(boolean z) throws IOException {
        try {
            Response.Builder builderMo82874a = this.f57329e.mo82874a(z);
            if (builderMo82874a == null) {
                return builderMo82874a;
            }
            if (((OkHttpClient.C13852a) AbstractC13867a.f57301a) == null) {
                throw null;
            }
            builderMo82874a.initExchange(this);
            return builderMo82874a;
        } catch (IOException e) {
            this.f57327c.getClass();
            m82829a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public RealWebSocket.Streams m82826a() throws SocketException {
        C13883j c13883j = this.f57325a;
        if (!c13883j.f57405n) {
            c13883j.f57405n = true;
            c13883j.f57396e.m83077i();
            C13878e c13878eConnection = this.f57329e.connection();
            c13878eConnection.f57357e.setSoTimeout(0);
            c13878eConnection.m82849b();
            return new C13877d(c13878eConnection, true, c13878eConnection.f57361i, c13878eConnection.f57362j, this);
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13956v m82827a(Request request, boolean z) {
        this.f57330f = z;
        long jContentLength = request.body().contentLength();
        this.f57327c.getClass();
        return new a(this.f57329e.mo82876a(request, jContentLength), jContentLength);
    }

    /* JADX INFO: renamed from: a */
    public IOException m82828a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m82829a(iOException);
        }
        if (z2) {
            AbstractC13927m abstractC13927m = this.f57327c;
            if (iOException != null) {
                abstractC13927m.getClass();
            } else {
                abstractC13927m.getClass();
            }
        }
        if (z) {
            AbstractC13927m abstractC13927m2 = this.f57327c;
            if (iOException != null) {
                abstractC13927m2.getClass();
            } else {
                abstractC13927m2.getClass();
            }
        }
        return this.f57325a.m82859a(this, z2, z, iOException);
    }
}
