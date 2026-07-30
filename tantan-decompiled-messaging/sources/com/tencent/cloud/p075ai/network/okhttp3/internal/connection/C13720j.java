package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.C13774c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import p149l.ohg0;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j */
/* JADX INFO: loaded from: classes13.dex */
public final class C13720j {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ boolean f56543p = true;

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f56544a;

    /* JADX INFO: renamed from: b */
    public final C13716f f56545b;

    /* JADX INFO: renamed from: c */
    public final Call f56546c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13764m f56547d;

    /* JADX INFO: renamed from: e */
    public final C13774c f56548e;

    /* JADX INFO: renamed from: f */
    public Object f56549f;

    /* JADX INFO: renamed from: g */
    public Request f56550g;

    /* JADX INFO: renamed from: h */
    public C13713c f56551h;

    /* JADX INFO: renamed from: i */
    public C13715e f56552i;

    /* JADX INFO: renamed from: j */
    public C13712b f56553j;

    /* JADX INFO: renamed from: k */
    public boolean f56554k;

    /* JADX INFO: renamed from: l */
    public boolean f56555l;

    /* JADX INFO: renamed from: m */
    public boolean f56556m;

    /* JADX INFO: renamed from: n */
    public boolean f56557n;

    /* JADX INFO: renamed from: o */
    public boolean f56558o;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j$a */
    public class a extends C13774c {
        public a() {
        }

        @Override // com.tencent.cloud.p075ai.network.okio.C13774c
        /* JADX INFO: renamed from: j */
        public void mo81685j() {
            C13720j.this.m81679a();
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.j$b */
    public static final class b extends WeakReference<C13720j> {

        /* JADX INFO: renamed from: a */
        public final Object f56560a;

        public b(C13720j c13720j, Object obj) {
            super(c13720j);
            this.f56560a = obj;
        }
    }

    public C13720j(OkHttpClient okHttpClient, Call call) {
        a aVar = new a();
        this.f56548e = aVar;
        this.f56544a = okHttpClient;
        this.f56545b = AbstractC13704a.f56453a.mo81583a(okHttpClient.connectionPool());
        this.f56546c = call;
        this.f56547d = okHttpClient.eventListenerFactory().mo81838a(call);
        aVar.mo81951a(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public final IOException m81678a(IOException iOException, boolean z) {
        C13715e c13715e;
        Socket socketM81684e;
        boolean z2;
        synchronized (this.f56545b) {
            if (z) {
                try {
                    if (this.f56553j != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c13715e = this.f56552i;
            socketM81684e = (c13715e != null && this.f56553j == null && (z || this.f56558o)) ? m81684e() : null;
            if (this.f56552i != null) {
                c13715e = null;
            }
            z2 = this.f56558o && this.f56553j == null;
        }
        C13706c.m81616a(socketM81684e);
        if (c13715e != null) {
            this.f56547d.getClass();
        }
        if (z2) {
            boolean z3 = iOException != null;
            if (!this.f56557n && this.f56548e.m81894i()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            AbstractC13764m abstractC13764m = this.f56547d;
            if (z3) {
                abstractC13764m.getClass();
                return iOException;
            }
            abstractC13764m.getClass();
        }
        return iOException;
    }

    /* JADX INFO: renamed from: b */
    public void m81681b() {
        synchronized (this.f56545b) {
            try {
                if (this.f56558o) {
                    throw new IllegalStateException();
                }
                this.f56553j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m81682c() {
        boolean z;
        synchronized (this.f56545b) {
            z = this.f56553j != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: d */
    public boolean m81683d() {
        boolean z;
        synchronized (this.f56545b) {
            z = this.f56556m;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public Socket m81684e() {
        if (!f56543p && !Thread.holdsLock(this.f56545b)) {
            shg0.m184191a();
            return null;
        }
        int size = this.f56552i.f56520p.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.f56552i.f56520p.get(i).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ohg0.m164364a();
            return null;
        }
        C13715e c13715e = this.f56552i;
        c13715e.f56520p.remove(i);
        this.f56552i = null;
        if (c13715e.f56520p.isEmpty()) {
            c13715e.f56521q = System.nanoTime();
            C13716f c13716f = this.f56545b;
            c13716f.getClass();
            if (!C13716f.f56523h && !Thread.holdsLock(c13716f)) {
                shg0.m184191a();
                return null;
            }
            if (c13715e.f56515k || c13716f.f56524a == 0) {
                c13716f.f56527d.remove(c13715e);
                return c13715e.f56509e;
            }
            c13716f.notifyAll();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public IOException m81676a(C13712b c13712b, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.f56545b) {
            try {
                C13712b c13712b2 = this.f56553j;
                if (c13712b != c13712b2) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.f56554k;
                    this.f56554k = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.f56555l) {
                        z3 = true;
                    }
                    this.f56555l = true;
                }
                if (this.f56554k && this.f56555l && z3) {
                    c13712b2.f56481e.connection().f56517m++;
                    this.f56553j = null;
                } else {
                    z4 = false;
                }
                return z4 ? m81678a(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public IOException m81677a(IOException iOException) {
        synchronized (this.f56545b) {
            this.f56558o = true;
        }
        return m81678a(iOException, false);
    }

    /* JADX INFO: renamed from: a */
    public void m81680a(C13715e c13715e) {
        if (!f56543p && !Thread.holdsLock(this.f56545b)) {
            shg0.m184191a();
        } else if (this.f56552i == null) {
            this.f56552i = c13715e;
            c13715e.f56520p.add(new b(this, this.f56549f));
        } else {
            ohg0.m164364a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81679a() {
        C13712b c13712b;
        C13715e c13715eM81649a;
        synchronized (this.f56545b) {
            try {
                this.f56556m = true;
                c13712b = this.f56553j;
                C13713c c13713c = this.f56551h;
                if (c13713c != null && c13713c.m81649a() != null) {
                    c13715eM81649a = this.f56551h.m81649a();
                } else {
                    c13715eM81649a = this.f56552i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c13712b != null) {
            c13712b.f56481e.cancel();
        } else if (c13715eM81649a != null) {
            C13706c.m81616a(c13715eM81649a.f56508d);
        }
    }
}
