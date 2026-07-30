package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.upstream.C2071b;
import com.google.android.exoplayer2.upstream.InterfaceC2072c;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p153l.b8j;
import p153l.bf80;
import p153l.bmk0;
import p153l.gyj0;
import p153l.kb00;
import p153l.kyv;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public class DefaultDrmSessionManager implements InterfaceC1878c {

    /* JADX INFO: renamed from: c */
    public final UUID f7451c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1882g.c f7452d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1885j f7453e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, String> f7454f;

    /* JADX INFO: renamed from: g */
    public final boolean f7455g;

    /* JADX INFO: renamed from: h */
    public final int[] f7456h;

    /* JADX INFO: renamed from: i */
    public final boolean f7457i;

    /* JADX INFO: renamed from: j */
    public final C1872f f7458j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2072c f7459k;

    /* JADX INFO: renamed from: l */
    public final C1873g f7460l;

    /* JADX INFO: renamed from: m */
    public final long f7461m;

    /* JADX INFO: renamed from: n */
    public final List<DefaultDrmSession> f7462n;

    /* JADX INFO: renamed from: o */
    public final Set<C1871e> f7463o;

    /* JADX INFO: renamed from: p */
    public final Set<DefaultDrmSession> f7464p;

    /* JADX INFO: renamed from: q */
    public int f7465q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC1882g f7466r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public DefaultDrmSession f7467s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public DefaultDrmSession f7468t;

    /* JADX INFO: renamed from: u */
    public Looper f7469u;

    /* JADX INFO: renamed from: v */
    public Handler f7470v;

    /* JADX INFO: renamed from: w */
    public int f7471w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public byte[] f7472x;

    /* JADX INFO: renamed from: y */
    public bf80 f7473y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public volatile HandlerC1870d f7474z;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    public static final class C1868b {

        /* JADX INFO: renamed from: d */
        public boolean f7478d;

        /* JADX INFO: renamed from: f */
        public boolean f7480f;

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f7475a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public UUID f7476b = zr3.f205732d;

        /* JADX INFO: renamed from: c */
        public InterfaceC1882g.c f7477c = C1883h.f7512d;

        /* JADX INFO: renamed from: g */
        public InterfaceC2072c f7481g = new C2071b();

        /* JADX INFO: renamed from: e */
        public int[] f7479e = new int[0];

        /* JADX INFO: renamed from: h */
        public long f7482h = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

        /* JADX INFO: renamed from: a */
        public DefaultDrmSessionManager m9938a(InterfaceC1885j interfaceC1885j) {
            return new DefaultDrmSessionManager(this.f7476b, this.f7477c, interfaceC1885j, this.f7475a, this.f7478d, this.f7479e, this.f7480f, this.f7481g, this.f7482h);
        }

        /* JADX INFO: renamed from: b */
        public C1868b m9939b(boolean z) {
            this.f7478d = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C1868b m9940c(boolean z) {
            this.f7480f = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C1868b m9941d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                w11.m204365a(z);
            }
            this.f7479e = (int[]) iArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1868b m9942e(UUID uuid, InterfaceC1882g.c cVar) {
            this.f7476b = (UUID) w11.m204369e(uuid);
            this.f7477c = (InterfaceC1882g.c) w11.m204369e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    public class C1869c implements InterfaceC1882g.b {
        public C1869c() {
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1882g.b
        /* JADX INFO: renamed from: a */
        public void mo9943a(InterfaceC1882g interfaceC1882g, @Nullable byte[] bArr, int i, int i2, @Nullable byte[] bArr2) {
            ((HandlerC1870d) w11.m204369e(DefaultDrmSessionManager.this.f7474z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1870d extends Handler {
        public HandlerC1870d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f7462n) {
                if (defaultDrmSession.m9891u(bArr)) {
                    defaultDrmSession.m9871A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    public class C1871e implements InterfaceC1878c.b {

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1877b.a f7485b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public DrmSession f7486c;

        /* JADX INFO: renamed from: d */
        public boolean f7487d;

        public C1871e(InterfaceC1877b.a aVar) {
            this.f7485b = aVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9944b(C1871e c1871e, C1894k c1894k) {
            if (DefaultDrmSessionManager.this.f7465q == 0 || c1871e.f7487d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            c1871e.f7486c = defaultDrmSessionManager.m9932s((Looper) w11.m204369e(defaultDrmSessionManager.f7469u), c1871e.f7485b, c1894k, false);
            DefaultDrmSessionManager.this.f7463o.add(c1871e);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m9945c(C1871e c1871e) {
            if (c1871e.f7487d) {
                return;
            }
            DrmSession drmSession = c1871e.f7486c;
            if (drmSession != null) {
                drmSession.mo9881b(c1871e.f7485b);
            }
            DefaultDrmSessionManager.this.f7463o.remove(c1871e);
            c1871e.f7487d = true;
        }

        /* JADX INFO: renamed from: d */
        public void m9946d(final C1894k c1894k) {
            ((Handler) w11.m204369e(DefaultDrmSessionManager.this.f7470v)).post(new Runnable() { // from class: l.god
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.C1871e.m9944b(this.f105281a, c1894k);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1878c.b
        public void release() {
            bmk0.m105102S0((Handler) w11.m204369e(DefaultDrmSessionManager.this.f7470v), new Runnable() { // from class: l.hod
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.C1871e.m9945c(this.f110887a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$f */
    public class C1872f implements DefaultDrmSession.InterfaceC1862a {

        /* JADX INFO: renamed from: a */
        public final Set<DefaultDrmSession> f7489a = new HashSet();

        /* JADX INFO: renamed from: b */
        @Nullable
        public DefaultDrmSession f7490b;

        public C1872f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1862a
        /* JADX INFO: renamed from: a */
        public void mo9897a(Exception exc, boolean z) {
            this.f7490b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f7489a);
            this.f7489a.clear();
            gyj0 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).m9873C(exc, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1862a
        /* JADX INFO: renamed from: b */
        public void mo9898b(DefaultDrmSession defaultDrmSession) {
            this.f7489a.add(defaultDrmSession);
            if (this.f7490b != null) {
                return;
            }
            this.f7490b = defaultDrmSession;
            defaultDrmSession.m9877G();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1862a
        /* JADX INFO: renamed from: c */
        public void mo9899c() {
            this.f7490b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f7489a);
            this.f7489a.clear();
            gyj0 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).m9872B();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9947d(DefaultDrmSession defaultDrmSession) {
            this.f7489a.remove(defaultDrmSession);
            if (this.f7490b == defaultDrmSession) {
                this.f7490b = null;
                if (this.f7489a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f7489a.iterator().next();
                this.f7490b = next;
                next.m9877G();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$g */
    public class C1873g implements DefaultDrmSession.InterfaceC1863b {
        public C1873g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1863b
        /* JADX INFO: renamed from: a */
        public void mo9900a(final DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.f7465q > 0 && DefaultDrmSessionManager.this.f7461m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f7464p.add(defaultDrmSession);
                ((Handler) w11.m204369e(DefaultDrmSessionManager.this.f7470v)).postAtTime(new Runnable() { // from class: l.iod
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.mo9881b(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f7461m);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.f7462n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f7467s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f7467s = null;
                }
                if (DefaultDrmSessionManager.this.f7468t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f7468t = null;
                }
                DefaultDrmSessionManager.this.f7458j.m9947d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f7461m != -9223372036854775807L) {
                    ((Handler) w11.m204369e(DefaultDrmSessionManager.this.f7470v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f7464p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.m9922B();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1863b
        /* JADX INFO: renamed from: b */
        public void mo9901b(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.f7461m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f7464p.remove(defaultDrmSession);
                ((Handler) w11.m204369e(DefaultDrmSessionManager.this.f7470v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    public DefaultDrmSessionManager(UUID uuid, InterfaceC1882g.c cVar, InterfaceC1885j interfaceC1885j, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, InterfaceC2072c interfaceC2072c, long j) {
        w11.m204369e(uuid);
        w11.m204366b(!zr3.f205730b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7451c = uuid;
        this.f7452d = cVar;
        this.f7453e = interfaceC1885j;
        this.f7454f = map;
        this.f7455g = z;
        this.f7456h = iArr;
        this.f7457i = z2;
        this.f7459k = interfaceC2072c;
        this.f7458j = new C1872f();
        this.f7460l = new C1873g();
        this.f7471w = 0;
        this.f7462n = new ArrayList();
        this.f7463o = Sets.m16177h();
        this.f7464p = Sets.m16177h();
        this.f7461m = j;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9919t(DrmSession drmSession) {
        if (drmSession.getState() == 1) {
            return bmk0.f77313a < 19 || (((DrmSession.DrmSessionException) w11.m204369e(drmSession.mo9880a())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static List<DrmInitData.SchemeData> m9920x(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeDataM9953e = drmInitData.m9953e(i);
            if ((schemeDataM9953e.m9958d(uuid) || (zr3.f205731c.equals(uuid) && schemeDataM9953e.m9958d(zr3.f205730b))) && (schemeDataM9953e.data != null || z)) {
                arrayList.add(schemeDataM9953e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public final void m9921A(Looper looper) {
        if (this.f7474z == null) {
            this.f7474z = new HandlerC1870d(looper);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9922B() {
        if (this.f7466r != null && this.f7465q == 0 && this.f7462n.isEmpty() && this.f7463o.isEmpty()) {
            ((InterfaceC1882g) w11.m204369e(this.f7466r)).release();
            this.f7466r = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m9923C() {
        gyj0 it = ImmutableSet.copyOf((Collection) this.f7464p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).mo9881b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m9924D() {
        gyj0 it = ImmutableSet.copyOf((Collection) this.f7463o).iterator();
        while (it.hasNext()) {
            ((C1871e) it.next()).release();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m9925E(int i, @Nullable byte[] bArr) {
        w11.m204371g(this.f7462n.isEmpty());
        if (i == 1 || i == 3) {
            w11.m204369e(bArr);
        }
        this.f7471w = i;
        this.f7472x = bArr;
    }

    /* JADX INFO: renamed from: F */
    public final void m9926F(DrmSession drmSession, @Nullable InterfaceC1877b.a aVar) {
        drmSession.mo9881b(aVar);
        if (this.f7461m != -9223372036854775807L) {
            drmSession.mo9881b(null);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m9927G(boolean z) {
        if (z && this.f7469u == null) {
            kyv.m152152j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) w11.m204369e(this.f7469u)).getThread()) {
            kyv.m152152j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7469u.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    @Nullable
    /* JADX INFO: renamed from: a */
    public DrmSession mo9928a(@Nullable InterfaceC1877b.a aVar, C1894k c1894k) {
        m9927G(false);
        w11.m204371g(this.f7465q > 0);
        w11.m204373i(this.f7469u);
        return m9932s(this.f7469u, aVar, c1894k, true);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    /* JADX INFO: renamed from: b */
    public InterfaceC1878c.b mo9929b(@Nullable InterfaceC1877b.a aVar, C1894k c1894k) {
        w11.m204371g(this.f7465q > 0);
        w11.m204373i(this.f7469u);
        C1871e c1871e = new C1871e(aVar);
        c1871e.m9946d(c1894k);
        return c1871e;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    /* JADX INFO: renamed from: c */
    public int mo9930c(C1894k c1894k) {
        m9927G(false);
        int iMo10002i = ((InterfaceC1882g) w11.m204369e(this.f7466r)).mo10002i();
        DrmInitData drmInitData = c1894k.f7788o;
        if (drmInitData == null) {
            if (bmk0.m105078G0(this.f7456h, kb00.m149010k(c1894k.f7785l)) == -1) {
                return 0;
            }
        } else if (!m9933u(drmInitData)) {
            return 1;
        }
        return iMo10002i;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    /* JADX INFO: renamed from: d */
    public void mo9931d(Looper looper, bf80 bf80Var) {
        m9936y(looper);
        this.f7473y = bf80Var;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    public final void prepare() {
        m9927G(true);
        int i = this.f7465q;
        this.f7465q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f7466r == null) {
            InterfaceC1882g interfaceC1882gMo10010a = this.f7452d.mo10010a(this.f7451c);
            this.f7466r = interfaceC1882gMo10010a;
            interfaceC1882gMo10010a.mo9999e(new C1869c());
        } else if (this.f7461m != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.f7462n.size(); i2++) {
                this.f7462n.get(i2).mo9885g(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1878c
    public final void release() {
        m9927G(true);
        int i = this.f7465q - 1;
        this.f7465q = i;
        if (i != 0) {
            return;
        }
        if (this.f7461m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f7462n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).mo9881b(null);
            }
        }
        m9924D();
        m9922B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final DrmSession m9932s(Looper looper, @Nullable InterfaceC1877b.a aVar, C1894k c1894k, boolean z) {
        List<DrmInitData.SchemeData> listM9920x;
        m9921A(looper);
        DrmInitData drmInitData = c1894k.f7788o;
        if (drmInitData == null) {
            return m9937z(kb00.m149010k(c1894k.f7785l), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f7472x == null) {
            listM9920x = m9920x((DrmInitData) w11.m204369e(drmInitData), this.f7451c, false);
            if (listM9920x.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f7451c);
                kyv.m152146d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.m9984l(missingSchemeDataException);
                }
                return new C1881f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listM9920x = null;
        }
        if (this.f7455g) {
            for (DefaultDrmSession defaultDrmSession2 : this.f7462n) {
                if (bmk0.m105123c(defaultDrmSession2.f7418a, listM9920x)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f7468t;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.mo9885g(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionM9935w = m9935w(listM9920x, false, aVar, z);
        if (!this.f7455g) {
            this.f7468t = defaultDrmSessionM9935w;
        }
        this.f7462n.add(defaultDrmSessionM9935w);
        return defaultDrmSessionM9935w;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9933u(DrmInitData drmInitData) {
        if (this.f7472x != null) {
            return true;
        }
        if (m9920x(drmInitData, this.f7451c, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.m9953e(0).m9958d(zr3.f205730b)) {
                return false;
            }
            kyv.m152151i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f7451c);
        }
        String str = drmInitData.schemeType;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return bmk0.f77313a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final DefaultDrmSession m9934v(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable InterfaceC1877b.a aVar) {
        w11.m204369e(this.f7466r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f7451c, this.f7466r, this.f7458j, this.f7460l, list, this.f7471w, this.f7457i | z, z, this.f7472x, this.f7454f, this.f7453e, (Looper) w11.m204369e(this.f7469u), this.f7459k, (bf80) w11.m204369e(this.f7473y));
        defaultDrmSession.mo9885g(aVar);
        if (this.f7461m != -9223372036854775807L) {
            defaultDrmSession.mo9885g(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: renamed from: w */
    public final DefaultDrmSession m9935w(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable InterfaceC1877b.a aVar, boolean z2) {
        DefaultDrmSession defaultDrmSessionM9934v = m9934v(list, z, aVar);
        if (m9919t(defaultDrmSessionM9934v) && !this.f7464p.isEmpty()) {
            m9923C();
            m9926F(defaultDrmSessionM9934v, aVar);
            defaultDrmSessionM9934v = m9934v(list, z, aVar);
        }
        if (!m9919t(defaultDrmSessionM9934v) || !z2 || this.f7463o.isEmpty()) {
            return defaultDrmSessionM9934v;
        }
        m9924D();
        if (!this.f7464p.isEmpty()) {
            m9923C();
        }
        m9926F(defaultDrmSessionM9934v, aVar);
        return m9934v(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* JADX INFO: renamed from: y */
    public final synchronized void m9936y(Looper looper) {
        try {
            Looper looper2 = this.f7469u;
            if (looper2 == null) {
                this.f7469u = looper;
                this.f7470v = new Handler(looper);
            } else {
                w11.m204371g(looper2 == looper);
                w11.m204369e(this.f7470v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final DrmSession m9937z(int i, boolean z) {
        InterfaceC1882g interfaceC1882g = (InterfaceC1882g) w11.m204369e(this.f7466r);
        if ((interfaceC1882g.mo10002i() == 2 && b8j.f75434d) || bmk0.m105078G0(this.f7456h, i) == -1 || interfaceC1882g.mo10002i() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f7467s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionM9935w = m9935w(ImmutableList.m15739of(), true, null, z);
            this.f7462n.add(defaultDrmSessionM9935w);
            this.f7467s = defaultDrmSessionM9935w;
        } else {
            defaultDrmSession.mo9885g(null);
        }
        return this.f7467s;
    }
}
