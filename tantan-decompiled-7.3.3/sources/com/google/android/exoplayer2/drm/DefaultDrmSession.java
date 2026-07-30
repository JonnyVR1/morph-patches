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
import com.google.android.exoplayer2.drm.InterfaceC1877b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
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
import p153l.a16;
import p153l.bf80;
import p153l.bmk0;
import p153l.ifq0;
import p153l.ktx;
import p153l.kyv;
import p153l.mtv;
import p153l.ou6;
import p153l.vxb;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final List<DrmInitData.SchemeData> f7418a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1882g f7419b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1862a f7420c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1863b f7421d;

    /* JADX INFO: renamed from: e */
    public final int f7422e;

    /* JADX INFO: renamed from: f */
    public final boolean f7423f;

    /* JADX INFO: renamed from: g */
    public final boolean f7424g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> f7425h;

    /* JADX INFO: renamed from: i */
    public final ou6<InterfaceC1877b.a> f7426i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2072c f7427j;

    /* JADX INFO: renamed from: k */
    public final bf80 f7428k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC1885j f7429l;

    /* JADX INFO: renamed from: m */
    public final UUID f7430m;

    /* JADX INFO: renamed from: n */
    public final Looper f7431n;

    /* JADX INFO: renamed from: o */
    public final HandlerC1866e f7432o;

    /* JADX INFO: renamed from: p */
    public int f7433p;

    /* JADX INFO: renamed from: q */
    public int f7434q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public HandlerThread f7435r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public HandlerC1864c f7436s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public vxb f7437t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public DrmSession.DrmSessionException f7438u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public byte[] f7439v;

    /* JADX INFO: renamed from: w */
    public byte[] f7440w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public InterfaceC1882g.a f7441x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public InterfaceC1882g.d f7442y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    public interface InterfaceC1862a {
        /* JADX INFO: renamed from: a */
        void mo9897a(Exception exc, boolean z);

        /* JADX INFO: renamed from: b */
        void mo9898b(DefaultDrmSession defaultDrmSession);

        /* JADX INFO: renamed from: c */
        void mo9899c();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    public interface InterfaceC1863b {
        /* JADX INFO: renamed from: a */
        void mo9900a(DefaultDrmSession defaultDrmSession, int i);

        /* JADX INFO: renamed from: b */
        void mo9901b(DefaultDrmSession defaultDrmSession, int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$c */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1864c extends Handler {

        /* JADX INFO: renamed from: a */
        @GuardedBy("this")
        public boolean f7443a;

        public HandlerC1864c(Looper looper) {
            super(looper);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9902a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            C1865d c1865d = (C1865d) message.obj;
            if (!c1865d.f7446b) {
                return false;
            }
            int i = c1865d.f7449e + 1;
            c1865d.f7449e = i;
            if (i > DefaultDrmSession.this.f7427j.mo12174d(3)) {
                return false;
            }
            long jMo12172a = DefaultDrmSession.this.f7427j.mo12172a(new InterfaceC2072c.c(new mtv(c1865d.f7445a, mediaDrmCallbackException.dataSpec, mediaDrmCallbackException.uriAfterRedirects, mediaDrmCallbackException.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - c1865d.f7447c, mediaDrmCallbackException.bytesLoaded), new ktx(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), c1865d.f7449e));
            if (jMo12172a == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f7443a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jMo12172a);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9903b(int i, Object obj, boolean z) {
            obtainMessage(i, new C1865d(mtv.m160053a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m9904c() {
            removeCallbacksAndMessages(null);
            this.f7443a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objMo10032b;
            C1865d c1865d = (C1865d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    objMo10032b = DefaultDrmSession.this.f7429l.mo10032b(DefaultDrmSession.this.f7430m, (InterfaceC1882g.d) c1865d.f7448d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    objMo10032b = DefaultDrmSession.this.f7429l.mo10031a(DefaultDrmSession.this.f7430m, (InterfaceC1882g.a) c1865d.f7448d);
                }
            } catch (MediaDrmCallbackException e) {
                boolean zM9902a = m9902a(message, e);
                objMo10032b = e;
                if (zM9902a) {
                    return;
                }
            } catch (Exception e2) {
                kyv.m152152j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objMo10032b = e2;
            }
            DefaultDrmSession.this.f7427j.m12176c(c1865d.f7445a);
            synchronized (this) {
                try {
                    if (!this.f7443a) {
                        DefaultDrmSession.this.f7432o.obtainMessage(message.what, Pair.create(c1865d.f7448d, objMo10032b)).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$d */
    public static final class C1865d {

        /* JADX INFO: renamed from: a */
        public final long f7445a;

        /* JADX INFO: renamed from: b */
        public final boolean f7446b;

        /* JADX INFO: renamed from: c */
        public final long f7447c;

        /* JADX INFO: renamed from: d */
        public final Object f7448d;

        /* JADX INFO: renamed from: e */
        public int f7449e;

        public C1865d(long j, boolean z, long j2, Object obj) {
            this.f7445a = j;
            this.f7446b = z;
            this.f7447c = j2;
            this.f7448d = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$e */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1866e extends Handler {
        public HandlerC1866e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.m9874D(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.m9894x(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, InterfaceC1882g interfaceC1882g, InterfaceC1862a interfaceC1862a, InterfaceC1863b interfaceC1863b, @Nullable List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> map, InterfaceC1885j interfaceC1885j, Looper looper, InterfaceC2072c interfaceC2072c, bf80 bf80Var) {
        if (i == 1 || i == 3) {
            w11.m204369e(bArr);
        }
        this.f7430m = uuid;
        this.f7420c = interfaceC1862a;
        this.f7421d = interfaceC1863b;
        this.f7419b = interfaceC1882g;
        this.f7422e = i;
        this.f7423f = z;
        this.f7424g = z2;
        if (bArr != null) {
            this.f7440w = bArr;
            this.f7418a = null;
        } else {
            this.f7418a = Collections.unmodifiableList((List) w11.m204369e(list));
        }
        this.f7425h = map;
        this.f7429l = interfaceC1885j;
        this.f7426i = new ou6<>();
        this.f7427j = interfaceC2072c;
        this.f7428k = bf80Var;
        this.f7433p = 2;
        this.f7431n = looper;
        this.f7432o = new HandlerC1866e(looper);
    }

    /* JADX INFO: renamed from: A */
    public void m9871A(int i) {
        if (i != 2) {
            return;
        }
        m9896z();
    }

    /* JADX INFO: renamed from: B */
    public void m9872B() {
        if (m9875E()) {
            m9889s(true);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9873C(Exception exc, boolean z) {
        m9893w(exc, z ? 1 : 3);
    }

    /* JADX INFO: renamed from: D */
    public final void m9874D(Object obj, Object obj2) {
        if (obj == this.f7442y) {
            if (this.f7433p == 2 || m9892v()) {
                this.f7442y = null;
                if (obj2 instanceof Exception) {
                    this.f7420c.mo9897a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f7419b.mo10001h((byte[]) obj2);
                    this.f7420c.mo9899c();
                } catch (Exception e) {
                    this.f7420c.mo9897a(e, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: E */
    public final boolean m9875E() {
        if (m9892v()) {
            return true;
        }
        try {
            byte[] bArrMo9997c = this.f7419b.mo9997c();
            this.f7439v = bArrMo9997c;
            this.f7419b.mo10007g(bArrMo9997c, this.f7428k);
            this.f7437t = this.f7419b.mo10003j(this.f7439v);
            final int i = 3;
            this.f7433p = 3;
            m9888r(new a16() { // from class: l.bod
                @Override // p153l.a16
                public final void accept(Object obj) {
                    ((InterfaceC1877b.a) obj).m9983k(i);
                }
            });
            w11.m204369e(this.f7439v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f7420c.mo9898b(this);
            return false;
        } catch (Exception e) {
            m9893w(e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9876F(byte[] bArr, int i, boolean z) {
        try {
            this.f7441x = this.f7419b.mo10006m(bArr, this.f7418a, i, this.f7425h);
            ((HandlerC1864c) bmk0.m105144j(this.f7436s)).m9903b(1, w11.m204369e(this.f7441x), z);
        } catch (Exception e) {
            m9895y(e, true);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m9877G() {
        this.f7442y = this.f7419b.mo9996b();
        ((HandlerC1864c) bmk0.m105144j(this.f7436s)).m9903b(0, w11.m204369e(this.f7442y), true);
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    /* JADX INFO: renamed from: H */
    public final boolean m9878H() {
        try {
            this.f7419b.mo9998d(this.f7439v, this.f7440w);
            return true;
        } catch (Exception e) {
            m9893w(e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9879I() {
        if (Thread.currentThread() != this.f7431n.getThread()) {
            kyv.m152152j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7431n.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: a */
    public final DrmSession.DrmSessionException mo9880a() {
        m9879I();
        if (this.f7433p == 1) {
            return this.f7438u;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: b */
    public void mo9881b(@Nullable InterfaceC1877b.a aVar) {
        m9879I();
        int i = this.f7434q;
        if (i <= 0) {
            kyv.m152145c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.f7434q = i2;
        if (i2 == 0) {
            this.f7433p = 0;
            ((HandlerC1866e) bmk0.m105144j(this.f7432o)).removeCallbacksAndMessages(null);
            ((HandlerC1864c) bmk0.m105144j(this.f7436s)).m9904c();
            this.f7436s = null;
            ((HandlerThread) bmk0.m105144j(this.f7435r)).quit();
            this.f7435r = null;
            this.f7437t = null;
            this.f7438u = null;
            this.f7441x = null;
            this.f7442y = null;
            byte[] bArr = this.f7439v;
            if (bArr != null) {
                this.f7419b.mo10005l(bArr);
                this.f7439v = null;
            }
        }
        if (aVar != null) {
            this.f7426i.m169234c(aVar);
            if (this.f7426i.count(aVar) == 0) {
                aVar.m9985m();
            }
        }
        this.f7421d.mo9900a(this, this.f7434q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: c */
    public boolean mo9882c() {
        m9879I();
        return this.f7423f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: d */
    public final vxb mo9883d() {
        m9879I();
        return this.f7437t;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* JADX INFO: renamed from: f */
    public Map<String, String> mo9884f() {
        m9879I();
        byte[] bArr = this.f7439v;
        if (bArr == null) {
            return null;
        }
        return this.f7419b.mo9995a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public void mo9885g(@Nullable InterfaceC1877b.a aVar) {
        m9879I();
        if (this.f7434q < 0) {
            kyv.m152145c("DefaultDrmSession", "Session reference count less than zero: " + this.f7434q);
            this.f7434q = 0;
        }
        if (aVar != null) {
            this.f7426i.m169233a(aVar);
        }
        int i = this.f7434q + 1;
        this.f7434q = i;
        if (i == 1) {
            w11.m204371g(this.f7433p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f7435r = handlerThread;
            handlerThread.start();
            this.f7436s = new HandlerC1864c(this.f7435r.getLooper());
            if (m9875E()) {
                m9889s(true);
            }
        } else if (aVar != null && m9892v() && this.f7426i.count(aVar) == 1) {
            aVar.m9983k(this.f7433p);
        }
        this.f7421d.mo9901b(this, this.f7434q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        m9879I();
        return this.f7433p;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final UUID mo9886h() {
        m9879I();
        return this.f7430m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: i */
    public boolean mo9887i(String str) {
        m9879I();
        return this.f7419b.mo10004k((byte[]) w11.m204373i(this.f7439v), str);
    }

    /* JADX INFO: renamed from: r */
    public final void m9888r(a16<InterfaceC1877b.a> a16Var) {
        Iterator<InterfaceC1877b.a> it = this.f7426i.elementSet().iterator();
        while (it.hasNext()) {
            a16Var.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: s */
    public final void m9889s(boolean z) {
        if (this.f7424g) {
            return;
        }
        byte[] bArr = (byte[]) bmk0.m105144j(this.f7439v);
        int i = this.f7422e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.f7440w == null || m9878H()) {
                    m9876F(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            w11.m204369e(this.f7440w);
            w11.m204369e(this.f7439v);
            m9876F(this.f7440w, 3, z);
            return;
        }
        if (this.f7440w == null) {
            m9876F(bArr, 1, z);
            return;
        }
        if (this.f7433p == 4 || m9878H()) {
            long jM9890t = m9890t();
            if (this.f7422e == 0 && jM9890t <= 60) {
                kyv.m152144b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jM9890t);
                m9876F(bArr, 2, z);
                return;
            }
            if (jM9890t <= 0) {
                m9893w(new KeysExpiredException(), 2);
            } else {
                this.f7433p = 4;
                m9888r(new a16() { // from class: l.cod
                    @Override // p153l.a16
                    public final void accept(Object obj) {
                        ((InterfaceC1877b.a) obj).m9982j();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final long m9890t() {
        if (!zr3.f205732d.equals(this.f7430m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) w11.m204369e(ifq0.m139743b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    /* JADX INFO: renamed from: u */
    public boolean m9891u(byte[] bArr) {
        m9879I();
        return Arrays.equals(this.f7439v, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: v */
    public final boolean m9892v() {
        int i = this.f7433p;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: w */
    public final void m9893w(final Exception exc, int i) {
        this.f7438u = new DrmSession.DrmSessionException(exc, C1879d.m9989a(exc, i));
        kyv.m152146d("DefaultDrmSession", "DRM session error", exc);
        m9888r(new a16() { // from class: l.dod
            @Override // p153l.a16
            public final void accept(Object obj) {
                ((InterfaceC1877b.a) obj).m9984l(exc);
            }
        });
        if (this.f7433p != 4) {
            this.f7433p = 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m9894x(Object obj, Object obj2) {
        if (obj == this.f7441x && m9892v()) {
            this.f7441x = null;
            if (obj2 instanceof Exception) {
                m9895y((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                int i = this.f7422e;
                InterfaceC1882g interfaceC1882g = this.f7419b;
                if (i == 3) {
                    interfaceC1882g.mo10000f((byte[]) bmk0.m105144j(this.f7440w), bArr);
                    m9888r(new a16() { // from class: l.eod
                        @Override // p153l.a16
                        public final void accept(Object obj3) {
                            ((InterfaceC1877b.a) obj3).m9981i();
                        }
                    });
                    return;
                }
                byte[] bArrMo10000f = interfaceC1882g.mo10000f(this.f7439v, bArr);
                int i2 = this.f7422e;
                if ((i2 == 2 || (i2 == 0 && this.f7440w != null)) && bArrMo10000f != null && bArrMo10000f.length != 0) {
                    this.f7440w = bArrMo10000f;
                }
                this.f7433p = 4;
                m9888r(new a16() { // from class: l.fod
                    @Override // p153l.a16
                    public final void accept(Object obj3) {
                        ((InterfaceC1877b.a) obj3).m9980h();
                    }
                });
            } catch (Exception e) {
                m9895y(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m9895y(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.f7420c.mo9898b(this);
        } else {
            m9893w(exc, z ? 1 : 2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m9896z() {
        if (this.f7422e == 0 && this.f7433p == 4) {
            bmk0.m105144j(this.f7439v);
            m9889s(false);
        }
    }
}
