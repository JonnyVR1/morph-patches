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
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.upstream.C2048b;
import com.google.android.exoplayer2.upstream.InterfaceC2049c;
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
import p149l.ar3;
import p149l.dpj0;
import p149l.g5j;
import p149l.jwv;
import p149l.n200;
import p149l.p11;
import p149l.v680;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public class DefaultDrmSessionManager implements InterfaceC1855c {

    /* JADX INFO: renamed from: c */
    public final UUID f7414c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1859g.c f7415d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1862j f7416e;

    /* JADX INFO: renamed from: f */
    public final HashMap<String, String> f7417f;

    /* JADX INFO: renamed from: g */
    public final boolean f7418g;

    /* JADX INFO: renamed from: h */
    public final int[] f7419h;

    /* JADX INFO: renamed from: i */
    public final boolean f7420i;

    /* JADX INFO: renamed from: j */
    public final C1849f f7421j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2049c f7422k;

    /* JADX INFO: renamed from: l */
    public final C1850g f7423l;

    /* JADX INFO: renamed from: m */
    public final long f7424m;

    /* JADX INFO: renamed from: n */
    public final List<DefaultDrmSession> f7425n;

    /* JADX INFO: renamed from: o */
    public final Set<C1848e> f7426o;

    /* JADX INFO: renamed from: p */
    public final Set<DefaultDrmSession> f7427p;

    /* JADX INFO: renamed from: q */
    public int f7428q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public InterfaceC1859g f7429r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public DefaultDrmSession f7430s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public DefaultDrmSession f7431t;

    /* JADX INFO: renamed from: u */
    public Looper f7432u;

    /* JADX INFO: renamed from: v */
    public Handler f7433v;

    /* JADX INFO: renamed from: w */
    public int f7434w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public byte[] f7435x;

    /* JADX INFO: renamed from: y */
    public v680 f7436y;

    /* JADX INFO: renamed from: z */
    @Nullable
    public volatile HandlerC1847d f7437z;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    public static final class C1845b {

        /* JADX INFO: renamed from: d */
        public boolean f7441d;

        /* JADX INFO: renamed from: f */
        public boolean f7443f;

        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> f7438a = new HashMap<>();

        /* JADX INFO: renamed from: b */
        public UUID f7439b = ar3.f71231d;

        /* JADX INFO: renamed from: c */
        public InterfaceC1859g.c f7440c = C1860h.f7475d;

        /* JADX INFO: renamed from: g */
        public InterfaceC2049c f7444g = new C2048b();

        /* JADX INFO: renamed from: e */
        public int[] f7442e = new int[0];

        /* JADX INFO: renamed from: h */
        public long f7445h = Constants.INBOX_V2_THROTTLE_WINDOW_MS;

        /* JADX INFO: renamed from: a */
        public DefaultDrmSessionManager m9884a(InterfaceC1862j interfaceC1862j) {
            return new DefaultDrmSessionManager(this.f7439b, this.f7440c, interfaceC1862j, this.f7438a, this.f7441d, this.f7442e, this.f7443f, this.f7444g, this.f7445h);
        }

        /* JADX INFO: renamed from: b */
        public C1845b m9885b(boolean z) {
            this.f7441d = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C1845b m9886c(boolean z) {
            this.f7443f = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C1845b m9887d(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                p11.m167007a(z);
            }
            this.f7442e = (int[]) iArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1845b m9888e(UUID uuid, InterfaceC1859g.c cVar) {
            this.f7439b = (UUID) p11.m167011e(uuid);
            this.f7440c = (InterfaceC1859g.c) p11.m167011e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    public class C1846c implements InterfaceC1859g.b {
        public C1846c() {
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1859g.b
        /* JADX INFO: renamed from: a */
        public void mo9889a(InterfaceC1859g interfaceC1859g, @Nullable byte[] bArr, int i, int i2, @Nullable byte[] bArr2) {
            ((HandlerC1847d) p11.m167011e(DefaultDrmSessionManager.this.f7437z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC1847d extends Handler {
        public HandlerC1847d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f7425n) {
                if (defaultDrmSession.m9837u(bArr)) {
                    defaultDrmSession.m9817A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    public class C1848e implements InterfaceC1855c.b {

        /* JADX INFO: renamed from: b */
        @Nullable
        public final InterfaceC1854b.a f7448b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public DrmSession f7449c;

        /* JADX INFO: renamed from: d */
        public boolean f7450d;

        public C1848e(InterfaceC1854b.a aVar) {
            this.f7448b = aVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m9890b(C1848e c1848e, C1871k c1871k) {
            if (DefaultDrmSessionManager.this.f7428q == 0 || c1848e.f7450d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            c1848e.f7449c = defaultDrmSessionManager.m9878s((Looper) p11.m167011e(defaultDrmSessionManager.f7432u), c1848e.f7448b, c1871k, false);
            DefaultDrmSessionManager.this.f7426o.add(c1848e);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m9891c(C1848e c1848e) {
            if (c1848e.f7450d) {
                return;
            }
            DrmSession drmSession = c1848e.f7449c;
            if (drmSession != null) {
                drmSession.mo9827b(c1848e.f7448b);
            }
            DefaultDrmSessionManager.this.f7426o.remove(c1848e);
            c1848e.f7450d = true;
        }

        /* JADX INFO: renamed from: d */
        public void m9892d(final C1871k c1871k) {
            ((Handler) p11.m167011e(DefaultDrmSessionManager.this.f7433v)).post(new Runnable() { // from class: l.bnd
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.C1848e.m9890b(this.f76390a, c1871k);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC1855c.b
        public void release() {
            vck0.m197824S0((Handler) p11.m167011e(DefaultDrmSessionManager.this.f7433v), new Runnable() { // from class: l.cnd
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.C1848e.m9891c(this.f81660a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$f */
    public class C1849f implements DefaultDrmSession.InterfaceC1839a {

        /* JADX INFO: renamed from: a */
        public final Set<DefaultDrmSession> f7452a = new HashSet();

        /* JADX INFO: renamed from: b */
        @Nullable
        public DefaultDrmSession f7453b;

        public C1849f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1839a
        /* JADX INFO: renamed from: a */
        public void mo9843a(Exception exc, boolean z) {
            this.f7453b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f7452a);
            this.f7452a.clear();
            dpj0 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).m9819C(exc, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1839a
        /* JADX INFO: renamed from: b */
        public void mo9844b(DefaultDrmSession defaultDrmSession) {
            this.f7452a.add(defaultDrmSession);
            if (this.f7453b != null) {
                return;
            }
            this.f7453b = defaultDrmSession;
            defaultDrmSession.m9823G();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1839a
        /* JADX INFO: renamed from: c */
        public void mo9845c() {
            this.f7453b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.f7452a);
            this.f7452a.clear();
            dpj0 it = immutableListCopyOf.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).m9818B();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9893d(DefaultDrmSession defaultDrmSession) {
            this.f7452a.remove(defaultDrmSession);
            if (this.f7453b == defaultDrmSession) {
                this.f7453b = null;
                if (this.f7452a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f7452a.iterator().next();
                this.f7453b = next;
                next.m9823G();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$g */
    public class C1850g implements DefaultDrmSession.InterfaceC1840b {
        public C1850g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1840b
        /* JADX INFO: renamed from: a */
        public void mo9846a(final DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.f7428q > 0 && DefaultDrmSessionManager.this.f7424m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f7427p.add(defaultDrmSession);
                ((Handler) p11.m167011e(DefaultDrmSessionManager.this.f7433v)).postAtTime(new Runnable() { // from class: l.dnd
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.mo9827b(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f7424m);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.f7425n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f7430s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f7430s = null;
                }
                if (DefaultDrmSessionManager.this.f7431t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f7431t = null;
                }
                DefaultDrmSessionManager.this.f7421j.m9893d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f7424m != -9223372036854775807L) {
                    ((Handler) p11.m167011e(DefaultDrmSessionManager.this.f7433v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f7427p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.m9868B();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.InterfaceC1840b
        /* JADX INFO: renamed from: b */
        public void mo9847b(DefaultDrmSession defaultDrmSession, int i) {
            if (DefaultDrmSessionManager.this.f7424m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f7427p.remove(defaultDrmSession);
                ((Handler) p11.m167011e(DefaultDrmSessionManager.this.f7433v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    public DefaultDrmSessionManager(UUID uuid, InterfaceC1859g.c cVar, InterfaceC1862j interfaceC1862j, HashMap<String, String> map, boolean z, int[] iArr, boolean z2, InterfaceC2049c interfaceC2049c, long j) {
        p11.m167011e(uuid);
        p11.m167008b(!ar3.f71229b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7414c = uuid;
        this.f7415d = cVar;
        this.f7416e = interfaceC1862j;
        this.f7417f = map;
        this.f7418g = z;
        this.f7419h = iArr;
        this.f7420i = z2;
        this.f7422k = interfaceC2049c;
        this.f7421j = new C1849f();
        this.f7423l = new C1850g();
        this.f7434w = 0;
        this.f7425n = new ArrayList();
        this.f7426o = Sets.m16123h();
        this.f7427p = Sets.m16123h();
        this.f7424m = j;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9865t(DrmSession drmSession) {
        if (drmSession.getState() == 1) {
            return vck0.f180948a < 19 || (((DrmSession.DrmSessionException) p11.m167011e(drmSession.mo9826a())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static List<DrmInitData.SchemeData> m9866x(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeDataM9899e = drmInitData.m9899e(i);
            if ((schemeDataM9899e.m9904d(uuid) || (ar3.f71230c.equals(uuid) && schemeDataM9899e.m9904d(ar3.f71229b))) && (schemeDataM9899e.data != null || z)) {
                arrayList.add(schemeDataM9899e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public final void m9867A(Looper looper) {
        if (this.f7437z == null) {
            this.f7437z = new HandlerC1847d(looper);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9868B() {
        if (this.f7429r != null && this.f7428q == 0 && this.f7425n.isEmpty() && this.f7426o.isEmpty()) {
            ((InterfaceC1859g) p11.m167011e(this.f7429r)).release();
            this.f7429r = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m9869C() {
        dpj0 it = ImmutableSet.copyOf((Collection) this.f7427p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).mo9827b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m9870D() {
        dpj0 it = ImmutableSet.copyOf((Collection) this.f7426o).iterator();
        while (it.hasNext()) {
            ((C1848e) it.next()).release();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m9871E(int i, @Nullable byte[] bArr) {
        p11.m167013g(this.f7425n.isEmpty());
        if (i == 1 || i == 3) {
            p11.m167011e(bArr);
        }
        this.f7434w = i;
        this.f7435x = bArr;
    }

    /* JADX INFO: renamed from: F */
    public final void m9872F(DrmSession drmSession, @Nullable InterfaceC1854b.a aVar) {
        drmSession.mo9827b(aVar);
        if (this.f7424m != -9223372036854775807L) {
            drmSession.mo9827b(null);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m9873G(boolean z) {
        if (z && this.f7432u == null) {
            jwv.m143690j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) p11.m167011e(this.f7432u)).getThread()) {
            jwv.m143690j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7432u.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    @Nullable
    /* JADX INFO: renamed from: a */
    public DrmSession mo9874a(@Nullable InterfaceC1854b.a aVar, C1871k c1871k) {
        m9873G(false);
        p11.m167013g(this.f7428q > 0);
        p11.m167015i(this.f7432u);
        return m9878s(this.f7432u, aVar, c1871k, true);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    /* JADX INFO: renamed from: b */
    public InterfaceC1855c.b mo9875b(@Nullable InterfaceC1854b.a aVar, C1871k c1871k) {
        p11.m167013g(this.f7428q > 0);
        p11.m167015i(this.f7432u);
        C1848e c1848e = new C1848e(aVar);
        c1848e.m9892d(c1871k);
        return c1848e;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    /* JADX INFO: renamed from: c */
    public int mo9876c(C1871k c1871k) {
        m9873G(false);
        int iMo9948i = ((InterfaceC1859g) p11.m167011e(this.f7429r)).mo9948i();
        DrmInitData drmInitData = c1871k.f7751o;
        if (drmInitData == null) {
            if (vck0.m197800G0(this.f7419h, n200.m157529k(c1871k.f7748l)) == -1) {
                return 0;
            }
        } else if (!m9879u(drmInitData)) {
            return 1;
        }
        return iMo9948i;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    /* JADX INFO: renamed from: d */
    public void mo9877d(Looper looper, v680 v680Var) {
        m9882y(looper);
        this.f7436y = v680Var;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    public final void prepare() {
        m9873G(true);
        int i = this.f7428q;
        this.f7428q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f7429r == null) {
            InterfaceC1859g interfaceC1859gMo9956a = this.f7415d.mo9956a(this.f7414c);
            this.f7429r = interfaceC1859gMo9956a;
            interfaceC1859gMo9956a.mo9945e(new C1846c());
        } else if (this.f7424m != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.f7425n.size(); i2++) {
                this.f7425n.get(i2).mo9831g(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1855c
    public final void release() {
        m9873G(true);
        int i = this.f7428q - 1;
        this.f7428q = i;
        if (i != 0) {
            return;
        }
        if (this.f7424m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f7425n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).mo9827b(null);
            }
        }
        m9870D();
        m9868B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final DrmSession m9878s(Looper looper, @Nullable InterfaceC1854b.a aVar, C1871k c1871k, boolean z) {
        List<DrmInitData.SchemeData> listM9866x;
        m9867A(looper);
        DrmInitData drmInitData = c1871k.f7751o;
        if (drmInitData == null) {
            return m9883z(n200.m157529k(c1871k.f7748l), z);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f7435x == null) {
            listM9866x = m9866x((DrmInitData) p11.m167011e(drmInitData), this.f7414c, false);
            if (listM9866x.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f7414c);
                jwv.m143684d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.m9930l(missingSchemeDataException);
                }
                return new C1858f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listM9866x = null;
        }
        if (this.f7418g) {
            for (DefaultDrmSession defaultDrmSession2 : this.f7425n) {
                if (vck0.m197845c(defaultDrmSession2.f7381a, listM9866x)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f7431t;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.mo9831g(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionM9881w = m9881w(listM9866x, false, aVar, z);
        if (!this.f7418g) {
            this.f7431t = defaultDrmSessionM9881w;
        }
        this.f7425n.add(defaultDrmSessionM9881w);
        return defaultDrmSessionM9881w;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9879u(DrmInitData drmInitData) {
        if (this.f7435x != null) {
            return true;
        }
        if (m9866x(drmInitData, this.f7414c, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.m9899e(0).m9904d(ar3.f71229b)) {
                return false;
            }
            jwv.m143689i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f7414c);
        }
        String str = drmInitData.schemeType;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return vck0.f180948a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final DefaultDrmSession m9880v(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable InterfaceC1854b.a aVar) {
        p11.m167011e(this.f7429r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f7414c, this.f7429r, this.f7421j, this.f7423l, list, this.f7434w, this.f7420i | z, z, this.f7435x, this.f7417f, this.f7416e, (Looper) p11.m167011e(this.f7432u), this.f7422k, (v680) p11.m167011e(this.f7436y));
        defaultDrmSession.mo9831g(aVar);
        if (this.f7424m != -9223372036854775807L) {
            defaultDrmSession.mo9831g(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: renamed from: w */
    public final DefaultDrmSession m9881w(@Nullable List<DrmInitData.SchemeData> list, boolean z, @Nullable InterfaceC1854b.a aVar, boolean z2) {
        DefaultDrmSession defaultDrmSessionM9880v = m9880v(list, z, aVar);
        if (m9865t(defaultDrmSessionM9880v) && !this.f7427p.isEmpty()) {
            m9869C();
            m9872F(defaultDrmSessionM9880v, aVar);
            defaultDrmSessionM9880v = m9880v(list, z, aVar);
        }
        if (!m9865t(defaultDrmSessionM9880v) || !z2 || this.f7426o.isEmpty()) {
            return defaultDrmSessionM9880v;
        }
        m9870D();
        if (!this.f7427p.isEmpty()) {
            m9869C();
        }
        m9872F(defaultDrmSessionM9880v, aVar);
        return m9880v(list, z, aVar);
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* JADX INFO: renamed from: y */
    public final synchronized void m9882y(Looper looper) {
        try {
            Looper looper2 = this.f7432u;
            if (looper2 == null) {
                this.f7432u = looper;
                this.f7433v = new Handler(looper);
            } else {
                p11.m167013g(looper2 == looper);
                p11.m167011e(this.f7433v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final DrmSession m9883z(int i, boolean z) {
        InterfaceC1859g interfaceC1859g = (InterfaceC1859g) p11.m167011e(this.f7429r);
        if ((interfaceC1859g.mo9948i() == 2 && g5j.f101162d) || vck0.m197800G0(this.f7419h, i) == -1 || interfaceC1859g.mo9948i() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f7430s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionM9881w = m9881w(ImmutableList.m15685of(), true, null, z);
            this.f7425n.add(defaultDrmSessionM9881w);
            this.f7430s = defaultDrmSessionM9881w;
        } else {
            defaultDrmSession.mo9831g(null);
        }
        return this.f7430s;
    }
}
