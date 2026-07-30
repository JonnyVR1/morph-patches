package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class y1t0 {

    /* JADX INFO: renamed from: a */
    public final Object f195447a = new Object();

    /* JADX INFO: renamed from: b */
    public final hpx0 f195448b;

    /* JADX INFO: renamed from: c */
    public final c2t0 f195449c;

    /* JADX INFO: renamed from: d */
    public boolean f195450d;

    /* JADX INFO: renamed from: e */
    public Context f195451e;

    /* JADX INFO: renamed from: f */
    public zzcei f195452f;

    /* JADX INFO: renamed from: g */
    public String f195453g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public u7s0 f195454h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Boolean f195455i;

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f195456j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f195457k;

    /* JADX INFO: renamed from: l */
    public final x1t0 f195458l;

    /* JADX INFO: renamed from: m */
    public final Object f195459m;

    /* JADX INFO: renamed from: n */
    @GuardedBy("grantedPermissionLock")
    public gnr f195460n;

    /* JADX INFO: renamed from: o */
    public final AtomicBoolean f195461o;

    public y1t0() {
        hpx0 hpx0Var = new hpx0();
        this.f195448b = hpx0Var;
        this.f195449c = new c2t0(exr0.m118705d(), hpx0Var);
        this.f195450d = false;
        this.f195454h = null;
        this.f195455i = null;
        this.f195456j = new AtomicInteger(0);
        this.f195457k = new AtomicInteger(0);
        this.f195458l = new x1t0(null);
        this.f195459m = new Object();
        this.f195461o = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: a */
    public final int m212273a() {
        return this.f195457k.get();
    }

    /* JADX INFO: renamed from: b */
    public final int m212274b() {
        return this.f195456j.get();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Context m212275d() {
        return this.f195451e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Resources m212276e() {
        if (this.f195452f.zzd) {
            return this.f195451e.getResources();
        }
        try {
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132375qa)).booleanValue();
            Context context = this.f195451e;
            if (zBooleanValue) {
                return a3t0.m94732a(context).getResources();
            }
            a3t0.m94732a(context).getResources();
            return null;
        } catch (zzcef e) {
            x2t0.m206870h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final u7s0 m212277g() {
        u7s0 u7s0Var;
        synchronized (this.f195447a) {
            u7s0Var = this.f195454h;
        }
        return u7s0Var;
    }

    /* JADX INFO: renamed from: h */
    public final c2t0 m212278h() {
        return this.f195449c;
    }

    /* JADX INFO: renamed from: i */
    public final aiw0 m212279i() {
        hpx0 hpx0Var;
        synchronized (this.f195447a) {
            hpx0Var = this.f195448b;
        }
        return hpx0Var;
    }

    /* JADX INFO: renamed from: k */
    public final gnr m212280k() {
        if (this.f195451e != null) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131859B2)).booleanValue()) {
                synchronized (this.f195459m) {
                    try {
                        gnr gnrVar = this.f195460n;
                        if (gnrVar != null) {
                            return gnrVar;
                        }
                        gnr gnrVarMo122102R = i3t0.f111372a.mo122102R(new Callable() { // from class: l.t1t0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f167370a.m212283o();
                            }
                        });
                        this.f195460n = gnrVarMo122102R;
                        return gnrVarMo122102R;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return jmw0.m142235h(new ArrayList());
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m212281l() {
        Boolean bool;
        synchronized (this.f195447a) {
            bool = this.f195455i;
        }
        return bool;
    }

    /* JADX INFO: renamed from: n */
    public final String m212282n() {
        return this.f195453g;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ArrayList m212283o() throws Exception {
        Context contextM211305a = xvs0.m211305a(this.f195451e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextM211305a).getPackageInfo(contextM211305a.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public final void m212284q() {
        this.f195458l.m206763a();
    }

    /* JADX INFO: renamed from: r */
    public final void m212285r() {
        this.f195456j.decrementAndGet();
    }

    /* JADX INFO: renamed from: s */
    public final void m212286s() {
        this.f195457k.incrementAndGet();
    }

    /* JADX INFO: renamed from: t */
    public final void m212287t() {
        this.f195456j.incrementAndGet();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: u */
    public final void m212288u(Context context, zzcei zzceiVar) {
        u7s0 u7s0Var;
        synchronized (this.f195447a) {
            try {
                if (!this.f195450d) {
                    this.f195451e = context.getApplicationContext();
                    this.f195452f = zzceiVar;
                    vny0.m199066d().m196345c(this.f195449c);
                    this.f195448b.mo96952k(this.f195451e);
                    qts0.m176478d(this.f195451e, this.f195452f);
                    vny0.m199069g();
                    if (((Boolean) m9s0.f132799c.m115379e()).booleanValue()) {
                        u7s0Var = new u7s0();
                    } else {
                        xsu0.m210834k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        u7s0Var = null;
                    }
                    this.f195454h = u7s0Var;
                    if (u7s0Var != null) {
                        l3t0.m148407a(new u1t0(this).mo124731b(), "AppState.registerCsiReporter");
                    }
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132321m8)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new v1t0(this));
                        }
                    }
                    this.f195450d = true;
                    m212280k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vny0.m199080r().m12335E(context, zzceiVar.zza);
    }

    /* JADX INFO: renamed from: v */
    public final void m212289v(Throwable th, String str) {
        qts0.m176478d(this.f195451e, this.f195452f).mo176482a(th, str, ((Double) kas0.f122151g.m115379e()).floatValue());
    }

    /* JADX INFO: renamed from: w */
    public final void m212290w(Throwable th, String str) {
        qts0.m176478d(this.f195451e, this.f195452f).mo176483b(th, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m212291x(Boolean bool) {
        synchronized (this.f195447a) {
            this.f195455i = bool;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m212292y(String str) {
        this.f195453g = str;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m212293z(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132321m8)).booleanValue()) {
                return this.f195461o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
