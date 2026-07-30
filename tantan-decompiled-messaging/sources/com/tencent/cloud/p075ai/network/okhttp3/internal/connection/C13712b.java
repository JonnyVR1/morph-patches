package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13728a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13749v;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.EnumC13729b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws.RealWebSocket;
import com.tencent.cloud.p075ai.network.okio.AbstractC13779h;
import com.tencent.cloud.p075ai.network.okio.AbstractC13780i;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import p149l.aza0;
import p149l.ohg0;
import p149l.qkq0;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b */
/* JADX INFO: loaded from: classes13.dex */
public final class C13712b {

    /* JADX INFO: renamed from: a */
    public final C13720j f56477a;

    /* JADX INFO: renamed from: b */
    public final Call f56478b;

    /* JADX INFO: renamed from: c */
    public final AbstractC13764m f56479c;

    /* JADX INFO: renamed from: d */
    public final C13713c f56480d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC13722a f56481e;

    /* JADX INFO: renamed from: f */
    public boolean f56482f;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b$a */
    public final class a extends AbstractC13779h {

        /* JADX INFO: renamed from: b */
        public boolean f56483b;

        /* JADX INFO: renamed from: c */
        public long f56484c;

        /* JADX INFO: renamed from: d */
        public long f56485d;

        /* JADX INFO: renamed from: e */
        public boolean f56486e;

        public a(InterfaceC13793v interfaceC13793v, long j) {
            super(interfaceC13793v);
            this.f56484c = j;
        }

        /* JADX INFO: renamed from: a */
        public final IOException m81647a(IOException iOException) {
            if (this.f56483b) {
                return iOException;
            }
            this.f56483b = true;
            return C13712b.this.m81645a(this.f56485d, false, true, iOException);
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56486e) {
                return;
            }
            this.f56486e = true;
            long j = this.f56484c;
            if (j != -1 && this.f56485d != j) {
                aza0.m99642a("unexpected end of stream");
                return;
            }
            try {
                this.f56979a.close();
                m81647a(null);
            } catch (IOException e) {
                throw m81647a(e);
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
        public void flush() throws IOException {
            try {
                this.f56979a.flush();
            } catch (IOException e) {
                throw m81647a(e);
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public void write(C13776e c13776e, long j) throws IOException {
            if (this.f56486e) {
                qkq0.m175383a("closed");
                return;
            }
            long j2 = this.f56484c;
            if (j2 == -1 || this.f56485d + j <= j2) {
                try {
                    this.f56979a.write(c13776e, j);
                    this.f56485d += j;
                    return;
                } catch (IOException e) {
                    throw m81647a(e);
                }
            }
            throw new ProtocolException("expected " + this.f56484c + " bytes but received " + (this.f56485d + j));
        }
    }

    public C13712b(C13720j c13720j, Call call, AbstractC13764m abstractC13764m, C13713c c13713c, InterfaceC13722a interfaceC13722a) {
        this.f56477a = c13720j;
        this.f56478b = call;
        this.f56479c = abstractC13764m;
        this.f56480d = c13713c;
        this.f56481e = interfaceC13722a;
    }

    /* JADX INFO: renamed from: a */
    public void m81646a(IOException iOException) {
        this.f56480d.m81654d();
        C13715e c13715eConnection = this.f56481e.connection();
        if (!C13715e.f56505r && Thread.holdsLock(c13715eConnection.f56506b)) {
            shg0.m184191a();
            return;
        }
        synchronized (c13715eConnection.f56506b) {
            try {
                if (iOException instanceof C13749v) {
                    EnumC13729b enumC13729b = ((C13749v) iOException).f56786a;
                    if (enumC13729b == EnumC13729b.REFUSED_STREAM) {
                        int i = c13715eConnection.f56518n + 1;
                        c13715eConnection.f56518n = i;
                        if (i > 1) {
                            c13715eConnection.f56515k = true;
                            c13715eConnection.f56516l++;
                        }
                    } else if (enumC13729b != EnumC13729b.CANCEL) {
                        c13715eConnection.f56515k = true;
                        c13715eConnection.f56516l++;
                    }
                } else if (!c13715eConnection.m81663a() || (iOException instanceof C13728a)) {
                    c13715eConnection.f56515k = true;
                    if (c13715eConnection.f56517m == 0) {
                        c13715eConnection.f56506b.m81670a(c13715eConnection.f56507c, iOException);
                        c13715eConnection.f56516l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.b$b */
    public final class b extends AbstractC13780i {

        /* JADX INFO: renamed from: b */
        public final long f56488b;

        /* JADX INFO: renamed from: c */
        public long f56489c;

        /* JADX INFO: renamed from: d */
        public boolean f56490d;

        /* JADX INFO: renamed from: e */
        public boolean f56491e;

        public b(InterfaceC13794w interfaceC13794w, long j) {
            super(interfaceC13794w);
            this.f56488b = j;
            if (j == 0) {
                m81648a(null);
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws IOException {
            if (this.f56491e) {
                qkq0.m175383a("closed");
                return 0L;
            }
            try {
                long jMo81631a = this.f56980a.mo81631a(c13776e, j);
                if (jMo81631a == -1) {
                    m81648a(null);
                    return -1L;
                }
                long j2 = this.f56489c + jMo81631a;
                long j3 = this.f56488b;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + this.f56488b + " bytes but received " + j2);
                }
                this.f56489c = j2;
                if (j2 == j3) {
                    m81648a(null);
                }
                return jMo81631a;
            } catch (IOException e) {
                throw m81648a(e);
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56491e) {
                return;
            }
            this.f56491e = true;
            try {
                this.f56980a.close();
                m81648a(null);
            } catch (IOException e) {
                throw m81648a(e);
            }
        }

        /* JADX INFO: renamed from: a */
        public IOException m81648a(IOException iOException) {
            if (this.f56490d) {
                return iOException;
            }
            this.f56490d = true;
            return C13712b.this.m81645a(this.f56489c, true, false, iOException);
        }
    }

    /* JADX INFO: renamed from: a */
    public Response.Builder m81642a(boolean z) throws IOException {
        try {
            Response.Builder builderMo81691a = this.f56481e.mo81691a(z);
            if (builderMo81691a == null) {
                return builderMo81691a;
            }
            if (((OkHttpClient.C13689a) AbstractC13704a.f56453a) == null) {
                throw null;
            }
            builderMo81691a.initExchange(this);
            return builderMo81691a;
        } catch (IOException e) {
            this.f56479c.getClass();
            m81646a(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public RealWebSocket.Streams m81643a() throws SocketException {
        C13720j c13720j = this.f56477a;
        if (!c13720j.f56557n) {
            c13720j.f56557n = true;
            c13720j.f56548e.m81894i();
            C13715e c13715eConnection = this.f56481e.connection();
            c13715eConnection.f56509e.setSoTimeout(0);
            c13715eConnection.m81666b();
            return new C13714d(c13715eConnection, true, c13715eConnection.f56513i, c13715eConnection.f56514j, this);
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13793v m81644a(Request request, boolean z) {
        this.f56482f = z;
        long jContentLength = request.body().contentLength();
        this.f56479c.getClass();
        return new a(this.f56481e.mo81693a(request, jContentLength), jContentLength);
    }

    /* JADX INFO: renamed from: a */
    public IOException m81645a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m81646a(iOException);
        }
        if (z2) {
            AbstractC13764m abstractC13764m = this.f56479c;
            if (iOException != null) {
                abstractC13764m.getClass();
            } else {
                abstractC13764m.getClass();
            }
        }
        if (z) {
            AbstractC13764m abstractC13764m2 = this.f56479c;
            if (iOException != null) {
                abstractC13764m2.getClass();
            } else {
                abstractC13764m2.getClass();
            }
        }
        return this.f56477a.m81676a(this, z2, z, iOException);
    }
}
