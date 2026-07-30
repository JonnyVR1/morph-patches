package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.InterfaceC1854b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149l.ar3;
import p149l.d6q0;
import p149l.hwb;
import p149l.jwv;
import p149l.lrv;
import p149l.lt6;
import p149l.nkx;
import p149l.p11;
import p149l.v680;
import p149l.vck0;
import p149l.vz5;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<DrmInitData.SchemeData> f7381a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1859g f7382b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1839a f7383c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1840b f7384d;

    /* JADX INFO: renamed from: e */
    public final int f7385e;

    /* JADX INFO: renamed from: f */
    public final boolean f7386f;

    /* JADX INFO: renamed from: g */
    public final boolean f7387g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> f7388h;

    /* JADX INFO: renamed from: i */
    public final lt6<InterfaceC1854b.a> f7389i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2049c f7390j;

    /* JADX INFO: renamed from: k */
    public final v680 f7391k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1862j f7392l;

    /* JADX INFO: renamed from: m */
    public final UUID f7393m;

    /* JADX INFO: renamed from: n */
    public final Looper f7394n;

    /* JADX INFO: renamed from: o */
    public final HandlerC1843e f7395o;

    /* JADX INFO: renamed from: p */
    public int f7396p;

    /* JADX INFO: renamed from: q */
    public int f7397q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public HandlerThread f7398r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public HandlerC1841c f7399s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public hwb f7400t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public DrmSession.DrmSessionException f7401u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public byte[] f7402v;

    /* JADX INFO: renamed from: w */
    public byte[] f7403w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public InterfaceC1859g.a f7404x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public InterfaceC1859g.d f7405y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    public interface InterfaceC1839a {
        /* JADX INFO: renamed from: a */
        void mo9843a(Exception exc, boolean z);

        /* JADX INFO: renamed from: b */
        void mo9844b(DefaultDrmSession defaultDrmSession);

        /* JADX INFO: renamed from: c */
        void mo9845c();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    public interface InterfaceC1840b {
        /* JADX INFO: renamed from: a */
        void mo9846a(DefaultDrmSession defaultDrmSession, int i);

        /* JADX INFO: renamed from: b */
        void mo9847b(DefaultDrmSession defaultDrmSession, int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$c */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1841c extends Handler {

        /* JADX INFO: renamed from: a */
        @GuardedBy("this")
        public boolean f7406a;

        public HandlerC1841c(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9848a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            C1842d c1842d = (C1842d) message.obj;
            if (!c1842d.f7409b) {
                return false;
            }
            int i = c1842d.f7412e + 1;
            c1842d.f7412e = i;
            if (i > DefaultDrmSession.this.f7390j.mo12120d(3)) {
                return false;
            }
            long jMo12118a = DefaultDrmSession.this.f7390j.mo12118a(new InterfaceC2049c.c(new lrv(c1842d.f7408a, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c1842d.f7410c, mediaDrmCallbackException.bytesLoaded), new nkx(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), c1842d.f7412e));
            if (jMo12118a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f7406a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jMo12118a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9849b(int i, Object obj, boolean z) {
            obtainMessage(i, new C1842d(lrv.m151512a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m9850c() {
            removeCallbacksAndMessages(null);
            this.f7406a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objMo9978b;
            C1842d c1842d = (C1842d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objMo9978b = DefaultDrmSession.this.f7392l.mo9978b(DefaultDrmSession.this.f7393m, (InterfaceC1859g.d) c1842d.f7411d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    objMo9978b = DefaultDrmSession.this.f7392l.mo9977a(DefaultDrmSession.this.f7393m, (InterfaceC1859g.a) c1842d.f7411d);
                }
            } catch (MediaDrmCallbackException e) {
                boolean zM9848a = m9848a(message, e);
                objMo9978b = e;
                if (zM9848a) {
                    return;
                }
            } catch (Exception e2) {
                jwv.m143690j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objMo9978b = e2;
            }
            DefaultDrmSession.this.f7390j.m12122c(c1842d.f7408a);
            synchronized (this) {
                try {
                    if (!this.f7406a) {
                        DefaultDrmSession.this.f7395o.obtainMessage(message.what, Pair.create(c1842d.f7411d, objMo9978b)).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$d */
    public static final class C1842d {

        /* JADX INFO: renamed from: a */
        public final long f7408a;

        /* JADX INFO: renamed from: b */
        public final boolean f7409b;

        /* JADX INFO: renamed from: c */
        public final long f7410c;

        /* JADX INFO: renamed from: d */
        public final Object f7411d;

        /* JADX INFO: renamed from: e */
        public int f7412e;

        public C1842d(long j, boolean z, long j2, Object obj) {
            this.f7408a = j;
            this.f7409b = z;
            this.f7410c = j2;
            this.f7411d = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$e */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1843e extends Handler {
        public HandlerC1843e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.m9820D(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.m9840x(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, InterfaceC1859g interfaceC1859g, InterfaceC1839a interfaceC1839a, InterfaceC1840b interfaceC1840b, @Nullable List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> map, InterfaceC1862j interfaceC1862j, Looper looper, InterfaceC2049c interfaceC2049c, v680 v680Var) {
        if (i == 1 || i == 3) {
            p11.m167011e(bArr);
        }
        this.f7393m = uuid;
        this.f7383c = interfaceC1839a;
        this.f7384d = interfaceC1840b;
        this.f7382b = interfaceC1859g;
        this.f7385e = i;
        this.f7386f = z;
        this.f7387g = z2;
        if (bArr != null) {
            this.f7403w = bArr;
            this.f7381a = null;
        } else {
            this.f7381a = Collections.unmodifiableList((List) p11.m167011e(list));
        }
        this.f7388h = map;
        this.f7392l = interfaceC1862j;
        this.f7389i = new lt6<>();
        this.f7390j = interfaceC2049c;
        this.f7391k = v680Var;
        this.f7396p = 2;
        this.f7394n = looper;
        this.f7395o = new HandlerC1843e(looper);
    }

    /* JADX INFO: renamed from: A */
    public void m9817A(int i) {
        if (i != 2) {
            return;
        }
        m9842z();
    }

    /* JADX INFO: renamed from: B */
    public void m9818B() {
        if (m9821E()) {
            m9835s(true);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9819C(Exception exc, boolean z) {
        m9839w(exc, z ? 1 : 3);
    }

    /* JADX INFO: renamed from: D */
    public final void m9820D(Object obj, Object obj2) {
        if (obj == this.f7405y) {
            if (this.f7396p == 2 || m9838v()) {
                this.f7405y = null;
                if (obj2 instanceof Exception) {
                    this.f7383c.mo9843a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f7382b.mo9947h((byte[]) obj2);
                    this.f7383c.mo9845c();
                } catch (Exception e) {
                    this.f7383c.mo9843a(e, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: E */
    public final boolean m9821E() {
        if (m9838v()) {
            return true;
        }
        try {
            byte[] bArrMo9943c = this.f7382b.mo9943c();
            this.f7402v = bArrMo9943c;
            this.f7382b.mo9953g(bArrMo9943c, this.f7391k);
            this.f7400t = this.f7382b.mo9949j(this.f7402v);
            final int i = 3;
            this.f7396p = 3;
            m9834r(new vz5() { // from class: l.wmd
                @Override // p149l.vz5
                public final void accept(Object obj) {
                    ((InterfaceC1854b.a) obj).m9929k(i);
                }
            });
            p11.m167011e(this.f7402v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f7383c.mo9844b(this);
            return false;
        } catch (Exception e) {
            m9839w(e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9822F(byte[] bArr, int i, boolean z) {
        try {
            this.f7404x = this.f7382b.mo9952m(bArr, this.f7381a, i, this.f7388h);
            ((HandlerC1841c) vck0.m197866j(this.f7399s)).m9849b(1, p11.m167011e(this.f7404x), z);
        } catch (Exception e) {
            m9841y(e, true);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m9823G() {
        this.f7405y = this.f7382b.mo9942b();
        ((HandlerC1841c) vck0.m197866j(this.f7399s)).m9849b(0, p11.m167011e(this.f7405y), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* JADX INFO: renamed from: H */
    public final boolean m9824H() {
        try {
            this.f7382b.mo9944d(this.f7402v, this.f7403w);
            return true;
        } catch (Exception e) {
            m9839w(e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9825I() {
        if (Thread.currentThread() != this.f7394n.getThread()) {
            jwv.m143690j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7394n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException mo9826a() {
        m9825I();
        if (this.f7396p == 1) {
            return this.f7401u;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo9827b(@Nullable InterfaceC1854b.a aVar) {
        m9825I();
        int i = this.f7397q;
        if (i <= 0) {
            jwv.m143683c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f7397q = i2;
        if (i2 == 0) {
            this.f7396p = 0;
            ((HandlerC1843e) vck0.m197866j(this.f7395o)).removeCallbacksAndMessages(null);
            ((HandlerC1841c) vck0.m197866j(this.f7399s)).m9850c();
            this.f7399s = null;
            ((HandlerThread) vck0.m197866j(this.f7398r)).quit();
            this.f7398r = null;
            this.f7400t = null;
            this.f7401u = null;
            this.f7404x = null;
            this.f7405y = null;
            byte[] bArr = this.f7402v;
            if (bArr != null) {
                this.f7382b.mo9951l(bArr);
                this.f7402v = null;
            }
        }
        if (aVar != null) {
            this.f7389i.m151671c(aVar);
            if (this.f7389i.count(aVar) == 0) {
                aVar.m9931m();
            }
        }
        this.f7384d.mo9846a(this, this.f7397q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: c */
    public boolean mo9828c() {
        m9825I();
        return this.f7386f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: d */
    public final hwb mo9829d() {
        m9825I();
        return this.f7400t;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo9830f() {
        m9825I();
        byte[] bArr = this.f7402v;
        if (bArr == null) {
            return null;
        }
        return this.f7382b.mo9941a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public void mo9831g(@Nullable InterfaceC1854b.a aVar) {
        m9825I();
        if (this.f7397q < 0) {
            jwv.m143683c("DefaultDrmSession", "Session reference count less than zero: " + this.f7397q);
            this.f7397q = 0;
        }
        if (aVar != null) {
            this.f7389i.m151670a(aVar);
        }
        int i = this.f7397q + 1;
        this.f7397q = i;
        if (i == 1) {
            p11.m167013g(this.f7396p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f7398r = handlerThread;
            handlerThread.start();
            this.f7399s = new HandlerC1841c(this.f7398r.getLooper());
            if (m9821E()) {
                m9835s(true);
            }
        } else if (aVar != null && m9838v() && this.f7389i.count(aVar) == 1) {
            aVar.m9929k(this.f7396p);
        }
        this.f7384d.mo9847b(this, this.f7397q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        m9825I();
        return this.f7396p;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final UUID mo9832h() {
        m9825I();
        return this.f7393m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: i */
    public boolean mo9833i(String str) {
        m9825I();
        return this.f7382b.mo9950k((byte[]) p11.m167015i(this.f7402v), str);
    }

    /* JADX INFO: renamed from: r */
    public final void m9834r(vz5<InterfaceC1854b.a> vz5Var) {
        Iterator<InterfaceC1854b.a> it = this.f7389i.elementSet().iterator();
        while (it.hasNext()) {
            vz5Var.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: s */
    public final void m9835s(boolean z) {
        if (this.f7387g) {
            return;
        }
        byte[] bArr = (byte[]) vck0.m197866j(this.f7402v);
        int i = this.f7385e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f7403w == null || m9824H()) {
                    m9822F(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            p11.m167011e(this.f7403w);
            p11.m167011e(this.f7402v);
            m9822F(this.f7403w, 3, z);
            return;
        }
        if (this.f7403w == null) {
            m9822F(bArr, 1, z);
            return;
        }
        if (this.f7396p == 4 || m9824H()) {
            long jM9836t = m9836t();
            if (this.f7385e == 0 && jM9836t <= 60) {
                jwv.m143682b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jM9836t);
                m9822F(bArr, 2, z);
                return;
            }
            if (jM9836t <= 0) {
                m9839w(new KeysExpiredException(), 2);
            } else {
                this.f7396p = 4;
                m9834r(new vz5() { // from class: l.xmd
                    @Override // p149l.vz5
                    public final void accept(Object obj) {
                        ((InterfaceC1854b.a) obj).m9928j();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m9836t() {
        if (!ar3.f71231d.equals(this.f7393m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) p11.m167011e(d6q0.m110190b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* JADX INFO: renamed from: u */
    public boolean m9837u(byte[] bArr) {
        m9825I();
        return Arrays.equals(this.f7402v, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: v */
    public final boolean m9838v() {
        int i = this.f7396p;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: w */
    public final void m9839w(final Exception exc, int i) {
        this.f7401u = new DrmSession.DrmSessionException(exc, C1856d.m9935a(exc, i));
        jwv.m143684d("DefaultDrmSession", "DRM session error", exc);
        m9834r(new vz5() { // from class: l.ymd
            @Override // p149l.vz5
            public final void accept(Object obj) {
                ((InterfaceC1854b.a) obj).m9930l(exc);
            }
        });
        if (this.f7396p != 4) {
            this.f7396p = 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9840x(Object obj, Object obj2) {
        if (obj == this.f7404x && m9838v()) {
            this.f7404x = null;
            if (obj2 instanceof Exception) {
                m9841y((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                int i = this.f7385e;
                InterfaceC1859g interfaceC1859g = this.f7382b;
                if (i == 3) {
                    interfaceC1859g.mo9946f((byte[]) vck0.m197866j(this.f7403w), bArr);
                    m9834r(new vz5() { // from class: l.zmd
                        @Override // p149l.vz5
                        public final void accept(Object obj3) {
                            ((InterfaceC1854b.a) obj3).m9927i();
                        }
                    });
                    return;
                }
                byte[] bArrMo9946f = interfaceC1859g.mo9946f(this.f7402v, bArr);
                int i2 = this.f7385e;
                if ((i2 == 2 || (i2 == 0 && this.f7403w != null)) && bArrMo9946f != null && bArrMo9946f.length != 0) {
                    this.f7403w = bArrMo9946f;
                }
                this.f7396p = 4;
                m9834r(new vz5() { // from class: l.and
                    @Override // p149l.vz5
                    public final void accept(Object obj3) {
                        ((InterfaceC1854b.a) obj3).m9926h();
                    }
                });
            } catch (Exception e) {
                m9841y(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9841y(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f7383c.mo9844b(this);
        } else {
            m9839w(exc, z ? 1 : 2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9842z() {
        if (this.f7385e == 0 && this.f7396p == 4) {
            vck0.m197866j(this.f7402v);
            m9835s(false);
        }
    }
}
