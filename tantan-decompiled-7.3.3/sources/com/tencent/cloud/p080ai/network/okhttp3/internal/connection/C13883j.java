package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.C13937c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import p153l.aqg0;
import p153l.wpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j */
/* JADX INFO: loaded from: classes12.dex */
public final class C13883j {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ boolean f57391p = true;

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f57392a;

    /* JADX INFO: renamed from: b */
    public final C13879f f57393b;

    /* JADX INFO: renamed from: c */
    public final Call f57394c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13927m f57395d;

    /* JADX INFO: renamed from: e */
    public final C13937c f57396e;

    /* JADX INFO: renamed from: f */
    public Object f57397f;

    /* JADX INFO: renamed from: g */
    public Request f57398g;

    /* JADX INFO: renamed from: h */
    public C13876c f57399h;

    /* JADX INFO: renamed from: i */
    public C13878e f57400i;

    /* JADX INFO: renamed from: j */
    public C13875b f57401j;

    /* JADX INFO: renamed from: k */
    public boolean f57402k;

    /* JADX INFO: renamed from: l */
    public boolean f57403l;

    /* JADX INFO: renamed from: m */
    public boolean f57404m;

    /* JADX INFO: renamed from: n */
    public boolean f57405n;

    /* JADX INFO: renamed from: o */
    public boolean f57406o;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j$a */
    public class a extends C13937c {
        public a() {
        }

        @Override // com.tencent.cloud.p080ai.network.okio.C13937c
        /* JADX INFO: renamed from: j */
        public void mo82868j() {
            C13883j.this.m82862a();
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j$b */
    public static final class b extends WeakReference<C13883j> {

        /* JADX INFO: renamed from: a */
        public final Object f57408a;

        public b(C13883j c13883j, Object obj) {
            super(c13883j);
            this.f57408a = obj;
        }
    }

    public C13883j(OkHttpClient okHttpClient, Call call) {
        a aVar = new a();
        this.f57396e = aVar;
        this.f57392a = okHttpClient;
        this.f57393b = AbstractC13867a.f57301a.mo82766a(okHttpClient.connectionPool());
        this.f57394c = call;
        this.f57395d = okHttpClient.eventListenerFactory().mo83021a(call);
        aVar.mo83134a(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final IOException m82861a(IOException iOException, boolean z) {
        C13878e c13878e;
        Socket socketM82867e;
        boolean z2;
        synchronized (this.f57393b) {
            if (z) {
                try {
                    if (this.f57401j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c13878e = this.f57400i;
            socketM82867e = (c13878e != null && this.f57401j == null && (z || this.f57406o)) ? m82867e() : null;
            if (this.f57400i != null) {
                c13878e = null;
            }
            z2 = this.f57406o && this.f57401j == null;
        }
        C13869c.m82799a(socketM82867e);
        if (c13878e != null) {
            this.f57395d.getClass();
        }
        if (z2) {
            boolean z3 = iOException != null;
            if (!this.f57405n && this.f57396e.m83077i()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            AbstractC13927m abstractC13927m = this.f57395d;
            if (z3) {
                abstractC13927m.getClass();
                return iOException;
            }
            abstractC13927m.getClass();
        }
        return iOException;
    }

    /* JADX INFO: renamed from: b */
    public void m82864b() {
        synchronized (this.f57393b) {
            try {
                if (this.f57406o) {
                    throw new IllegalStateException();
                }
                this.f57401j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m82865c() {
        boolean z;
        synchronized (this.f57393b) {
            z = this.f57401j != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public boolean m82866d() {
        boolean z;
        synchronized (this.f57393b) {
            z = this.f57404m;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public Socket m82867e() {
        if (!f57391p && !Thread.holdsLock(this.f57393b)) {
            aqg0.m99478a();
            return null;
        }
        int size = this.f57400i.f57368p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f57400i.f57368p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            wpg0.m207458a();
            return null;
        }
        C13878e c13878e = this.f57400i;
        c13878e.f57368p.remove(i);
        this.f57400i = null;
        if (c13878e.f57368p.isEmpty()) {
            c13878e.f57369q = System.nanoTime();
            C13879f c13879f = this.f57393b;
            c13879f.getClass();
            if (!C13879f.f57371h && !Thread.holdsLock(c13879f)) {
                aqg0.m99478a();
                return null;
            }
            if (c13878e.f57363k || c13879f.f57372a == 0) {
                c13879f.f57375d.remove(c13878e);
                return c13878e.f57357e;
            }
            c13879f.notifyAll();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public IOException m82859a(C13875b c13875b, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f57393b) {
            try {
                C13875b c13875b2 = this.f57401j;
                if (c13875b != c13875b2) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.f57402k;
                    this.f57402k = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.f57403l) {
                        z3 = true;
                    }
                    this.f57403l = true;
                }
                if (this.f57402k && this.f57403l && z3) {
                    c13875b2.f57329e.connection().f57365m++;
                    this.f57401j = null;
                } else {
                    z4 = false;
                }
                return z4 ? m82861a(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public IOException m82860a(IOException iOException) {
        synchronized (this.f57393b) {
            this.f57406o = true;
        }
        return m82861a(iOException, false);
    }

    /* JADX INFO: renamed from: a */
    public void m82863a(C13878e c13878e) {
        if (!f57391p && !Thread.holdsLock(this.f57393b)) {
            aqg0.m99478a();
        } else if (this.f57400i == null) {
            this.f57400i = c13878e;
            c13878e.f57368p.add(new b(this, this.f57397f));
        } else {
            wpg0.m207458a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82862a() {
        C13875b c13875b;
        C13878e c13878eM82832a;
        synchronized (this.f57393b) {
            try {
                this.f57404m = true;
                c13875b = this.f57401j;
                C13876c c13876c = this.f57399h;
                if (c13876c != null && c13876c.m82832a() != null) {
                    c13878eM82832a = this.f57399h.m82832a();
                } else {
                    c13878eM82832a = this.f57400i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c13875b != null) {
            c13875b.f57329e.cancel();
        } else if (c13878eM82832a != null) {
            C13869c.m82799a(c13878eM82832a.f57356d);
        }
    }
}
