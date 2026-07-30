package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import com.google.android.gms.measurement.internal.zzon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class hcy0 extends kix0 {

    /* JADX INFO: renamed from: c */
    public final xfy0 f108758c;

    /* JADX INFO: renamed from: d */
    public isw0 f108759d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f108760e;

    /* JADX INFO: renamed from: f */
    public final l2s0 f108761f;

    /* JADX INFO: renamed from: g */
    public final xiy0 f108762g;

    /* JADX INFO: renamed from: h */
    public final List<Runnable> f108763h;

    /* JADX INFO: renamed from: i */
    public final l2s0 f108764i;

    public hcy0(atx0 atx0Var) {
        super(atx0Var);
        this.f108763h = new ArrayList();
        this.f108762g = new xiy0(atx0Var.zzb());
        this.f108758c = new xfy0(this);
        this.f108761f = new mcy0(this, atx0Var);
        this.f108764i = new xey0(this, atx0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    private final void m134523A(Runnable runnable) throws IllegalStateException {
        mo15146h();
        if (m134556a0()) {
            runnable.run();
        } else {
            if (this.f108763h.size() >= 1000) {
                zzj().m114558A().m153300a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f108763h.add(runnable);
            this.f108764i.m152633b(Constants.ONE_MIN_IN_MILLIS);
            m134549T();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m134524M(hcy0 hcy0Var, ComponentName componentName) {
        hcy0Var.mo15146h();
        if (hcy0Var.f108759d != null) {
            hcy0Var.f108759d = null;
            hcy0Var.zzj().m114562E().m153301b("Disconnected from device MeasurementService", componentName);
            hcy0Var.mo15146h();
            hcy0Var.m134549T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: f0 */
    public final void m134526f0() {
        mo15146h();
        zzj().m114562E().m153301b("Processing queued up service tasks", Integer.valueOf(this.f108763h.size()));
        Iterator<Runnable> it = this.f108763h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e) {
                zzj().m114558A().m153301b("Task exception while flushing queue", e);
            }
        }
        this.f108763h.clear();
        this.f108764i.m152632a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: g0 */
    public final void m134527g0() {
        mo15146h();
        this.f108762g.m211182c();
        this.f108761f.m152633b(whs0.f189216M.m220931a(null).longValue());
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m134530l0(hcy0 hcy0Var) {
        hcy0Var.mo15146h();
        if (hcy0Var.m134556a0()) {
            hcy0Var.zzj().m114562E().m153300a("Inactivity, disconnecting from the service");
            hcy0Var.m134550U();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m134533B(AtomicReference<String> atomicReference) {
        mo15146h();
        m149988p();
        m134523A(new gdy0(this, atomicReference, m134562j0(false)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m134534C(AtomicReference<List<zzno>> atomicReference, Bundle bundle) {
        mo15146h();
        m149988p();
        m134523A(new ddy0(this, atomicReference, m134562j0(false), bundle));
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final void m134535D(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        mo15146h();
        m149988p();
        m134523A(new lfy0(this, atomicReference, str, str2, str3, m134562j0(false)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final void m134536E(AtomicReference<List<zzon>> atomicReference, String str, String str2, String str3, boolean z) {
        mo15146h();
        m149988p();
        m134523A(new qfy0(this, atomicReference, str, str2, str3, m134562j0(false), z));
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final void m134537F(wmu0 wmu0Var) {
        mo15146h();
        m149988p();
        m134523A(new ley0(this, m134562j0(false), wmu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final void m134538G(wmu0 wmu0Var, zzbf zzbfVar, String str) {
        mo15146h();
        m149988p();
        if (mo15143e().m136358o(12451000) == 0) {
            m134523A(new cfy0(this, zzbfVar, str, wmu0Var));
        } else {
            zzj().m114563F().m153300a("Not bundling data. Service unavailable or out of date");
            mo15143e().m136343Q(wmu0Var, new byte[0]);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m134539H(wmu0 wmu0Var, String str, String str2) {
        mo15146h();
        m149988p();
        m134523A(new tfy0(this, str, str2, m134562j0(false), wmu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m134540I(wmu0 wmu0Var, String str, String str2, boolean z) {
        mo15146h();
        m149988p();
        m134523A(new xcy0(this, str, str2, m134562j0(false), z, wmu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final void m134541J(isw0 isw0Var) {
        mo15146h();
        Preconditions.checkNotNull(isw0Var);
        this.f108759d = isw0Var;
        m134527g0();
        m134526f0();
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m134542K(isw0 isw0Var, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int size;
        long j;
        long jElapsedRealtime;
        mo15146h();
        m149988p();
        int i = 100;
        int i2 = 0;
        for (int i3 = 100; i2 < 1001 && i == i3; i3 = 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> listM221822w = mo15149k().m221822w(i3);
            if (listM221822w != null) {
                arrayList.addAll(listM221822w);
                size = listM221822w.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i3) {
                arrayList.add(abstractSafeParcelable);
            }
            boolean zM98440n = mo15139a().m98440n(whs0.f189203F0);
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzbf) {
                    if (zM98440n) {
                        try {
                            long jCurrentTimeMillis = this.f202159a.zzb().currentTimeMillis();
                            try {
                                jElapsedRealtime = this.f202159a.zzb().elapsedRealtime();
                                j = jCurrentTimeMillis;
                            } catch (RemoteException e) {
                                e = e;
                                jElapsedRealtime = 0;
                                j = jCurrentTimeMillis;
                                zzj().m114558A().m153301b("Failed to send event to the service", e);
                                if (!zM98440n && j != 0) {
                                    v3x0.m199632a(this.f202159a).m199633b(36301, 13, j, this.f202159a.zzb().currentTimeMillis(), (int) (this.f202159a.zzb().elapsedRealtime() - jElapsedRealtime));
                                }
                                i4 = i5;
                            }
                        } catch (RemoteException e2) {
                            e = e2;
                            j = 0;
                            jElapsedRealtime = 0;
                        }
                    } else {
                        j = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        isw0Var.mo112721r4((zzbf) abstractSafeParcelable2, zzoVar);
                        if (zM98440n) {
                            zzj().m114562E().m153300a("Logging telemetry for logEvent from database");
                            v3x0.m199632a(this.f202159a).m199633b(36301, 0, j, this.f202159a.zzb().currentTimeMillis(), (int) (this.f202159a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        zzj().m114558A().m153301b("Failed to send event to the service", e);
                        if (!zM98440n) {
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzon) {
                    try {
                        isw0Var.mo112710Q4((zzon) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e4) {
                        zzj().m114558A().m153301b("Failed to send user property to the service", e4);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        isw0Var.mo112716g3((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e5) {
                        zzj().m114558A().m153301b("Failed to send conditional user property to the service", e5);
                    }
                } else {
                    zzj().m114558A().m153300a("Discarding data. Unrecognized parcel type.");
                }
                i4 = i5;
            }
            i2++;
            i = size;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final void m134543L(way0 way0Var) {
        mo15146h();
        m149988p();
        m134523A(new oey0(this, way0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m134544O(boolean z) {
        mo15146h();
        m149988p();
        if ((!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189241Y0)) && z) {
            mo15149k().m221818B();
        }
        if (m134558c0()) {
            m134523A(new ify0(this, m134562j0(false)));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final zzaj m134545P() {
        mo15146h();
        m149988p();
        isw0 isw0Var = this.f108759d;
        if (isw0Var == null) {
            m134549T();
            zzj().m114570z().m153300a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzoVarM134562j0 = m134562j0(false);
        Preconditions.checkNotNull(zzoVarM134562j0);
        try {
            zzaj zzajVarMo112707L5 = isw0Var.mo112707L5(zzoVarM134562j0);
            m134527g0();
            return zzajVarMo112707L5;
        } catch (RemoteException e) {
            zzj().m114558A().m153301b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final Boolean m134546Q() {
        return this.f108760e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m134547R() {
        mo15146h();
        m149988p();
        m134523A(new rey0(this, m134562j0(true)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m134548S() {
        mo15146h();
        m149988p();
        zzo zzoVarM134562j0 = m134562j0(true);
        mo15149k().m221819C();
        m134523A(new iey0(this, zzoVarM134562j0));
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m134549T() {
        mo15146h();
        m149988p();
        if (m134556a0()) {
            return;
        }
        if (m134560e0()) {
            this.f108758c.m210867a();
            return;
        }
        if (mo15139a().m98433R()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzj().m114558A().m153300a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f108758c.m210868b(intent);
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final void m134550U() {
        mo15146h();
        m149988p();
        this.f108758c.m210869d();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.f108758c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f108759d = null;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m134551V() {
        isw0 isw0Var = this.f108759d;
        if (isw0Var == null) {
            zzj().m114558A().m153300a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzo zzoVarM134562j0 = m134562j0(false);
            Preconditions.checkNotNull(zzoVarM134562j0);
            isw0Var.mo112712U7(zzoVarM134562j0);
            m134527g0();
        } catch (RemoteException e) {
            zzj().m114558A().m153301b("Failed to send Dma consent settings to the service", e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m134552W() {
        isw0 isw0Var = this.f108759d;
        if (isw0Var == null) {
            zzj().m114558A().m153300a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzo zzoVarM134562j0 = m134562j0(false);
            Preconditions.checkNotNull(zzoVarM134562j0);
            isw0Var.mo112723x7(zzoVarM134562j0);
            m134527g0();
        } catch (RemoteException e) {
            zzj().m114558A().m153301b("Failed to send storage consent settings to the service", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final void m134553X() {
        mo15146h();
        m149988p();
        zzo zzoVarM134562j0 = m134562j0(false);
        mo15149k().m221818B();
        m134523A(new fey0(this, zzoVarM134562j0));
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final void m134554Y() {
        mo15146h();
        m149988p();
        m134523A(new Runnable() { // from class: l.qcy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156636a.m134551V();
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m134555Z() {
        mo15146h();
        m149988p();
        m134523A(new zey0(this, m134562j0(true)));
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final boolean m134556a0() {
        mo15146h();
        m149988p();
        return this.f108759d != null;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final boolean m134557b0() {
        mo15146h();
        m149988p();
        return !m134560e0() || mo15143e().m136324C0() >= 200900;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final boolean m134558c0() {
        mo15146h();
        m149988p();
        return !m134560e0() || mo15143e().m136324C0() >= whs0.f189298u0.m220931a(null).intValue();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final boolean m134559d0() {
        mo15146h();
        m149988p();
        return !m134560e0() || mo15143e().m136324C0() >= 241200;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final boolean m134560e0() {
        boolean z;
        mo15146h();
        m149988p();
        if (this.f108760e == null) {
            mo15146h();
            m149988p();
            Boolean boolM98511H = mo15142d().m98511H();
            boolean z2 = true;
            if (boolM98511H == null || !boolM98511H.booleanValue()) {
                boolean z3 = false;
                if (mo15148j().m15157w() == 1) {
                    z = true;
                } else {
                    zzj().m114562E().m153300a("Checking service availability");
                    int iM136358o = mo15143e().m136358o(12451000);
                    if (iM136358o != 0) {
                        if (iM136358o == 1) {
                            zzj().m114562E().m153300a("Service missing");
                        } else if (iM136358o != 2) {
                            if (iM136358o == 3) {
                                zzj().m114563F().m153300a("Service disabled");
                            } else if (iM136358o == 9) {
                                zzj().m114563F().m153300a("Service invalid");
                            } else if (iM136358o != 18) {
                                zzj().m114563F().m153301b("Unexpected service status", Integer.valueOf(iM136358o));
                            } else {
                                zzj().m114563F().m153300a("Service updating");
                            }
                            z = false;
                            z2 = false;
                        } else {
                            zzj().m114570z().m153300a("Service container out of date");
                            if (mo15143e().m136324C0() >= 17443) {
                                z2 = boolM98511H == null;
                                z = false;
                            }
                        }
                        z = true;
                        z2 = false;
                    } else {
                        zzj().m114562E().m153300a("Service available");
                    }
                    z = true;
                }
                if (z2 || !mo15139a().m98433R()) {
                    z3 = z;
                } else {
                    zzj().m114558A().m153300a("No way to upload. Consider using the full version of Analytics");
                }
                if (z3) {
                    mo15142d().m98523r(z2);
                }
            }
            this.f108760e = Boolean.valueOf(z2);
        }
        return this.f108760e.booleanValue();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ n9s0 mo15147i() {
        return super.mo15147i();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m134561i0(boolean z) {
        mo15146h();
        m149988p();
        if ((!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189241Y0)) && z) {
            mo15149k().m221818B();
        }
        m134523A(new Runnable() { // from class: l.ccy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81042a.m134552W();
            }
        });
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2477c mo15148j() {
        return super.mo15148j();
    }

    @WorkerThread
    /* JADX INFO: renamed from: j0 */
    public final zzo m134562j0(boolean z) {
        return mo15148j().m15156v(z ? zzj().m114566I() : null);
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ zvw0 mo15149k() {
        return super.mo15149k();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2481g mo15150l() {
        return super.mo15150l();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ say0 mo15151m() {
        return super.mo15151m();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ hcy0 mo15152n() {
        return super.mo15152n();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ thy0 mo15153o() {
        return super.mo15153o();
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final void m134563w(Bundle bundle) {
        mo15146h();
        m149988p();
        m134523A(new uey0(this, m134562j0(false), bundle));
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m134564x(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        mo15146h();
        m149988p();
        m134523A(new nfy0(this, true, m134562j0(true), mo15149k().m221824y(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m134565y(zzbf zzbfVar, String str) {
        Preconditions.checkNotNull(zzbfVar);
        mo15146h();
        m149988p();
        m134523A(new ffy0(this, true, m134562j0(true), mo15149k().m221825z(zzbfVar), zzbfVar, str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m134566z(zzon zzonVar) {
        mo15146h();
        m149988p();
        m134523A(new ady0(this, m134562j0(true), mo15149k().m221817A(zzonVar), zzonVar));
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
