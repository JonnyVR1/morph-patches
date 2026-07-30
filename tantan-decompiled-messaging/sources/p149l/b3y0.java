package p149l;

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
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
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
public final class b3y0 extends e9x0 {

    /* JADX INFO: renamed from: c */
    public final r6y0 f73267c;

    /* JADX INFO: renamed from: d */
    public cjw0 f73268d;

    /* JADX INFO: renamed from: e */
    public volatile Boolean f73269e;

    /* JADX INFO: renamed from: f */
    public final ftr0 f73270f;

    /* JADX INFO: renamed from: g */
    public final r9y0 f73271g;

    /* JADX INFO: renamed from: h */
    public final List<Runnable> f73272h;

    /* JADX INFO: renamed from: i */
    public final ftr0 f73273i;

    public b3y0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f73272h = new ArrayList();
        this.f73271g = new r9y0(ujx0Var.zzb());
        this.f73267c = new r6y0(this);
        this.f73270f = new g3y0(this, ujx0Var);
        this.f73273i = new r5y0(this, ujx0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    private final void m100123A(Runnable runnable) throws IllegalStateException {
        mo15092h();
        if (m100156a0()) {
            runnable.run();
        } else {
            if (this.f73272h.size() >= 1000) {
                zzj().m211412A().m123936a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f73272h.add(runnable);
            this.f73273i.m123085b(Constants.ONE_MIN_IN_MILLIS);
            m100149T();
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m100124M(b3y0 b3y0Var, ComponentName componentName) {
        b3y0Var.mo15092h();
        if (b3y0Var.f73268d != null) {
            b3y0Var.f73268d = null;
            b3y0Var.zzj().m211416E().m123937b("Disconnected from device MeasurementService", componentName);
            b3y0Var.mo15092h();
            b3y0Var.m100149T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: f0 */
    public final void m100126f0() {
        mo15092h();
        zzj().m211416E().m123937b("Processing queued up service tasks", Integer.valueOf(this.f73272h.size()));
        Iterator<Runnable> it = this.f73272h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e) {
                zzj().m211412A().m123937b("Task exception while flushing queue", e);
            }
        }
        this.f73272h.clear();
        this.f73273i.m123084a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: g0 */
    public final void m100127g0() {
        mo15092h();
        this.f73271g.m178468c();
        this.f73270f.m123085b(q8s0.f153240M.m188827a(null).longValue());
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m100130l0(b3y0 b3y0Var) {
        b3y0Var.mo15092h();
        if (b3y0Var.m100156a0()) {
            b3y0Var.zzj().m211416E().m123936a("Inactivity, disconnecting from the service");
            b3y0Var.m100150U();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m100133B(AtomicReference<String> atomicReference) {
        mo15092h();
        m115400p();
        m100123A(new a4y0(this, atomicReference, m100162j0(false)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m100134C(AtomicReference<List<zzno>> atomicReference, Bundle bundle) {
        mo15092h();
        m115400p();
        m100123A(new x3y0(this, atomicReference, m100162j0(false), bundle));
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final void m100135D(AtomicReference<List<zzae>> atomicReference, String str, String str2, String str3) {
        mo15092h();
        m115400p();
        m100123A(new f6y0(this, atomicReference, str, str2, str3, m100162j0(false)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final void m100136E(AtomicReference<List<zzon>> atomicReference, String str, String str2, String str3, boolean z) {
        mo15092h();
        m115400p();
        m100123A(new k6y0(this, atomicReference, str, str2, str3, m100162j0(false), z));
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final void m100137F(qdu0 qdu0Var) {
        mo15092h();
        m115400p();
        m100123A(new f5y0(this, m100162j0(false), qdu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final void m100138G(qdu0 qdu0Var, zzbf zzbfVar, String str) {
        mo15092h();
        m115400p();
        if (mo15089e().m101493o(12451000) == 0) {
            m100123A(new w5y0(this, zzbfVar, str, qdu0Var));
        } else {
            zzj().m211417F().m123936a("Not bundling data. Service unavailable or out of date");
            mo15089e().m101476Q(qdu0Var, new byte[0]);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m100139H(qdu0 qdu0Var, String str, String str2) {
        mo15092h();
        m115400p();
        m100123A(new n6y0(this, str, str2, m100162j0(false), qdu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m100140I(qdu0 qdu0Var, String str, String str2, boolean z) {
        mo15092h();
        m115400p();
        m100123A(new r3y0(this, str, str2, m100162j0(false), z, qdu0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final void m100141J(cjw0 cjw0Var) {
        mo15092h();
        Preconditions.checkNotNull(cjw0Var);
        this.f73268d = cjw0Var;
        m100127g0();
        m100126f0();
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m100142K(cjw0 cjw0Var, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int size;
        long j;
        long jElapsedRealtime;
        mo15092h();
        m115400p();
        int i = 100;
        int i2 = 0;
        for (int i3 = 100; i2 < 1001 && i == i3; i3 = 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> listM189729w = mo15095k().m189729w(i3);
            if (listM189729w != null) {
                arrayList.addAll(listM189729w);
                size = listM189729w.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i3) {
                arrayList.add(abstractSafeParcelable);
            }
            boolean zM192648n = mo15085a().m192648n(q8s0.f153227F0);
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzbf) {
                    if (zM192648n) {
                        try {
                            long jCurrentTimeMillis = this.f165891a.zzb().currentTimeMillis();
                            try {
                                jElapsedRealtime = this.f165891a.zzb().elapsedRealtime();
                                j = jCurrentTimeMillis;
                            } catch (RemoteException e) {
                                e = e;
                                jElapsedRealtime = 0;
                                j = jCurrentTimeMillis;
                                zzj().m211412A().m123937b("Failed to send event to the service", e);
                                if (!zM192648n && j != 0) {
                                    puw0.m171484a(this.f165891a).m171485b(36301, 13, j, this.f165891a.zzb().currentTimeMillis(), (int) (this.f165891a.zzb().elapsedRealtime() - jElapsedRealtime));
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
                        cjw0Var.mo107278r4((zzbf) abstractSafeParcelable2, zzoVar);
                        if (zM192648n) {
                            zzj().m211416E().m123936a("Logging telemetry for logEvent from database");
                            puw0.m171484a(this.f165891a).m171485b(36301, 0, j, this.f165891a.zzb().currentTimeMillis(), (int) (this.f165891a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e3) {
                        e = e3;
                        zzj().m211412A().m123937b("Failed to send event to the service", e);
                        if (!zM192648n) {
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof zzon) {
                    try {
                        cjw0Var.mo107265Q4((zzon) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e4) {
                        zzj().m211412A().m123937b("Failed to send user property to the service", e4);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        cjw0Var.mo107272g3((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e5) {
                        zzj().m211412A().m123937b("Failed to send conditional user property to the service", e5);
                    }
                } else {
                    zzj().m211412A().m123936a("Discarding data. Unrecognized parcel type.");
                }
                i4 = i5;
            }
            i2++;
            i = size;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final void m100143L(q1y0 q1y0Var) {
        mo15092h();
        m115400p();
        m100123A(new i5y0(this, q1y0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m100144O(boolean z) {
        mo15092h();
        m115400p();
        if ((!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153265Y0)) && z) {
            mo15095k().m189725B();
        }
        if (m100158c0()) {
            m100123A(new c6y0(this, m100162j0(false)));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final zzaj m100145P() {
        mo15092h();
        m115400p();
        cjw0 cjw0Var = this.f73268d;
        if (cjw0Var == null) {
            m100149T();
            zzj().m211424z().m123936a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzo zzoVarM100162j0 = m100162j0(false);
        Preconditions.checkNotNull(zzoVarM100162j0);
        try {
            zzaj zzajVarMo107262L5 = cjw0Var.mo107262L5(zzoVarM100162j0);
            m100127g0();
            return zzajVarMo107262L5;
        } catch (RemoteException e) {
            zzj().m211412A().m123937b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final Boolean m100146Q() {
        return this.f73269e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m100147R() {
        mo15092h();
        m115400p();
        m100123A(new l5y0(this, m100162j0(true)));
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m100148S() {
        mo15092h();
        m115400p();
        zzo zzoVarM100162j0 = m100162j0(true);
        mo15095k().m189726C();
        m100123A(new c5y0(this, zzoVarM100162j0));
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m100149T() {
        mo15092h();
        m115400p();
        if (m100156a0()) {
            return;
        }
        if (m100160e0()) {
            this.f73267c.m178107a();
            return;
        }
        if (mo15085a().m192641R()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzj().m211412A().m123936a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f73267c.m178108b(intent);
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final void m100150U() {
        mo15092h();
        m115400p();
        this.f73267c.m178109d();
        try {
            ConnectionTracker.getInstance().unbindService(zza(), this.f73267c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f73268d = null;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m100151V() {
        cjw0 cjw0Var = this.f73268d;
        if (cjw0Var == null) {
            zzj().m211412A().m123936a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzo zzoVarM100162j0 = m100162j0(false);
            Preconditions.checkNotNull(zzoVarM100162j0);
            cjw0Var.mo107267U7(zzoVarM100162j0);
            m100127g0();
        } catch (RemoteException e) {
            zzj().m211412A().m123937b("Failed to send Dma consent settings to the service", e);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m100152W() {
        cjw0 cjw0Var = this.f73268d;
        if (cjw0Var == null) {
            zzj().m211412A().m123936a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzo zzoVarM100162j0 = m100162j0(false);
            Preconditions.checkNotNull(zzoVarM100162j0);
            cjw0Var.mo107280x7(zzoVarM100162j0);
            m100127g0();
        } catch (RemoteException e) {
            zzj().m211412A().m123937b("Failed to send storage consent settings to the service", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final void m100153X() {
        mo15092h();
        m115400p();
        zzo zzoVarM100162j0 = m100162j0(false);
        mo15095k().m189725B();
        m100123A(new z4y0(this, zzoVarM100162j0));
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final void m100154Y() {
        mo15092h();
        m115400p();
        m100123A(new Runnable() { // from class: l.k3y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120910a.m100151V();
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m100155Z() {
        mo15092h();
        m115400p();
        m100123A(new t5y0(this, m100162j0(true)));
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final boolean m100156a0() {
        mo15092h();
        m115400p();
        return this.f73268d != null;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final boolean m100157b0() {
        mo15092h();
        m115400p();
        return !m100160e0() || mo15089e().m101457C0() >= 200900;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final boolean m100158c0() {
        mo15092h();
        m115400p();
        return !m100160e0() || mo15089e().m101457C0() >= q8s0.f153322u0.m188827a(null).intValue();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final boolean m100159d0() {
        mo15092h();
        m115400p();
        return !m100160e0() || mo15089e().m101457C0() >= 241200;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final boolean m100160e0() {
        boolean z;
        mo15092h();
        m115400p();
        if (this.f73269e == null) {
            mo15092h();
            m115400p();
            Boolean boolM192696H = mo15088d().m192696H();
            boolean z2 = true;
            if (boolM192696H == null || !boolM192696H.booleanValue()) {
                boolean z3 = false;
                if (mo15094j().m15103w() == 1) {
                    z = true;
                } else {
                    zzj().m211416E().m123936a("Checking service availability");
                    int iM101493o = mo15089e().m101493o(12451000);
                    if (iM101493o != 0) {
                        if (iM101493o == 1) {
                            zzj().m211416E().m123936a("Service missing");
                        } else if (iM101493o != 2) {
                            if (iM101493o == 3) {
                                zzj().m211417F().m123936a("Service disabled");
                            } else if (iM101493o == 9) {
                                zzj().m211417F().m123936a("Service invalid");
                            } else if (iM101493o != 18) {
                                zzj().m211417F().m123937b("Unexpected service status", Integer.valueOf(iM101493o));
                            } else {
                                zzj().m211417F().m123936a("Service updating");
                            }
                            z = false;
                            z2 = false;
                        } else {
                            zzj().m211424z().m123936a("Service container out of date");
                            if (mo15089e().m101457C0() >= 17443) {
                                z2 = boolM192696H == null;
                                z = false;
                            }
                        }
                        z = true;
                        z2 = false;
                    } else {
                        zzj().m211416E().m123936a("Service available");
                    }
                    z = true;
                }
                if (z2 || !mo15085a().m192641R()) {
                    z3 = z;
                } else {
                    zzj().m211412A().m123936a("No way to upload. Consider using the full version of Analytics");
                }
                if (z3) {
                    mo15088d().m192706r(z2);
                }
            }
            this.f73269e = Boolean.valueOf(z2);
        }
        return this.f73269e.booleanValue();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ h0s0 mo15093i() {
        return super.mo15093i();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m100161i0(boolean z) {
        mo15092h();
        m115400p();
        if ((!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153265Y0)) && z) {
            mo15095k().m189725B();
        }
        m100123A(new Runnable() { // from class: l.w2y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184295a.m100152W();
            }
        });
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2454c mo15094j() {
        return super.mo15094j();
    }

    @WorkerThread
    /* JADX INFO: renamed from: j0 */
    public final zzo m100162j0(boolean z) {
        return mo15094j().m15102v(z ? zzj().m211420I() : null);
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ tmw0 mo15095k() {
        return super.mo15095k();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2458g mo15096l() {
        return super.mo15096l();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ m1y0 mo15097m() {
        return super.mo15097m();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ b3y0 mo15098n() {
        return super.mo15098n();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ n8y0 mo15099o() {
        return super.mo15099o();
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final void m100163w(Bundle bundle) {
        mo15092h();
        m115400p();
        m100123A(new o5y0(this, m100162j0(false), bundle));
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m100164x(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        mo15092h();
        m115400p();
        m100123A(new h6y0(this, true, m100162j0(true), mo15095k().m189731y(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m100165y(zzbf zzbfVar, String str) {
        Preconditions.checkNotNull(zzbfVar);
        mo15092h();
        m115400p();
        m100123A(new z5y0(this, true, m100162j0(true), mo15095k().m189732z(zzbfVar), zzbfVar, str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m100166z(zzon zzonVar) {
        mo15092h();
        m115400p();
        m100123A(new u3y0(this, m100162j0(true), mo15095k().m189724A(zzonVar), zzonVar));
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
