package p153l;

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
public final class ebt0 {

    /* JADX INFO: renamed from: a */
    public final Object f92972a = new Object();

    /* JADX INFO: renamed from: b */
    public final nyx0 f92973b;

    /* JADX INFO: renamed from: c */
    public final ibt0 f92974c;

    /* JADX INFO: renamed from: d */
    public boolean f92975d;

    /* JADX INFO: renamed from: e */
    public Context f92976e;

    /* JADX INFO: renamed from: f */
    public zzcei f92977f;

    /* JADX INFO: renamed from: g */
    public String f92978g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public ahs0 f92979h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Boolean f92980i;

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f92981j;

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f92982k;

    /* JADX INFO: renamed from: l */
    public final dbt0 f92983l;

    /* JADX INFO: renamed from: m */
    public final Object f92984m;

    /* JADX INFO: renamed from: n */
    @GuardedBy("grantedPermissionLock")
    public hpr f92985n;

    /* JADX INFO: renamed from: o */
    public final AtomicBoolean f92986o;

    public ebt0() {
        nyx0 nyx0Var = new nyx0();
        this.f92973b = nyx0Var;
        this.f92974c = new ibt0(k6s0.m148571d(), nyx0Var);
        this.f92975d = false;
        this.f92979h = null;
        this.f92980i = null;
        this.f92981j = new AtomicInteger(0);
        this.f92982k = new AtomicInteger(0);
        this.f92983l = new dbt0(null);
        this.f92984m = new Object();
        this.f92986o = new AtomicBoolean();
    }

    /* JADX INFO: renamed from: a */
    public final int m120258a() {
        return this.f92982k.get();
    }

    /* JADX INFO: renamed from: b */
    public final int m120259b() {
        return this.f92981j.get();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Context m120260d() {
        return this.f92976e;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Resources m120261e() {
        if (this.f92977f.zzd) {
            return this.f92976e.getResources();
        }
        try {
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168446qa)).booleanValue();
            Context context = this.f92976e;
            if (zBooleanValue) {
                return gct0.m129903a(context).getResources();
            }
            gct0.m129903a(context).getResources();
            return null;
        } catch (zzcef e) {
            dct0.m115299h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final ahs0 m120262g() {
        ahs0 ahs0Var;
        synchronized (this.f92972a) {
            ahs0Var = this.f92979h;
        }
        return ahs0Var;
    }

    /* JADX INFO: renamed from: h */
    public final ibt0 m120263h() {
        return this.f92974c;
    }

    /* JADX INFO: renamed from: i */
    public final grw0 m120264i() {
        nyx0 nyx0Var;
        synchronized (this.f92972a) {
            nyx0Var = this.f92973b;
        }
        return nyx0Var;
    }

    /* JADX INFO: renamed from: k */
    public final hpr m120265k() {
        if (this.f92976e != null) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167930B2)).booleanValue()) {
                synchronized (this.f92984m) {
                    try {
                        hpr hprVar = this.f92985n;
                        if (hprVar != null) {
                            return hprVar;
                        }
                        hpr hprVarMo155969R = oct0.f146733a.mo155969R(new Callable() { // from class: l.zat0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f203592a.m120268o();
                            }
                        });
                        this.f92985n = hprVarMo155969R;
                        return hprVarMo155969R;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return pvw0.m173981h(new ArrayList());
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m120266l() {
        Boolean bool;
        synchronized (this.f92972a) {
            bool = this.f92980i;
        }
        return bool;
    }

    /* JADX INFO: renamed from: n */
    public final String m120267n() {
        return this.f92978g;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ ArrayList m120268o() throws Exception {
        Context contextM114319a = d5t0.m114319a(this.f92976e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextM114319a).getPackageInfo(contextM114319a.getApplicationInfo().packageName, 4096);
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
    public final void m120269q() {
        this.f92983l.m115169a();
    }

    /* JADX INFO: renamed from: r */
    public final void m120270r() {
        this.f92981j.decrementAndGet();
    }

    /* JADX INFO: renamed from: s */
    public final void m120271s() {
        this.f92982k.incrementAndGet();
    }

    /* JADX INFO: renamed from: t */
    public final void m120272t() {
        this.f92981j.incrementAndGet();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: u */
    public final void m120273u(Context context, zzcei zzceiVar) {
        ahs0 ahs0Var;
        synchronized (this.f92972a) {
            try {
                if (!this.f92975d) {
                    this.f92976e = context.getApplicationContext();
                    this.f92977f = zzceiVar;
                    bxy0.m106920d().m96485c(this.f92974c);
                    this.f92973b.mo131901k(this.f92976e);
                    w2t0.m204593d(this.f92976e, this.f92977f);
                    bxy0.m106923g();
                    if (((Boolean) sis0.f168867c.m149974e()).booleanValue()) {
                        ahs0Var = new ahs0();
                    } else {
                        d2v0.m113737k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        ahs0Var = null;
                    }
                    this.f92979h = ahs0Var;
                    if (ahs0Var != null) {
                        rct0.m180821a(new abt0(this).mo96667b(), "AppState.registerCsiReporter");
                    }
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168392m8)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new bbt0(this));
                        }
                    }
                    this.f92975d = true;
                    m120265k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bxy0.m106934r().m12389E(context, zzceiVar.zza);
    }

    /* JADX INFO: renamed from: v */
    public final void m120274v(Throwable th, String str) {
        w2t0.m204593d(this.f92976e, this.f92977f).mo204597a(th, str, ((Double) qjs0.f158046g.m149974e()).floatValue());
    }

    /* JADX INFO: renamed from: w */
    public final void m120275w(Throwable th, String str) {
        w2t0.m204593d(this.f92976e, this.f92977f).mo204598b(th, str);
    }

    /* JADX INFO: renamed from: x */
    public final void m120276x(Boolean bool) {
        synchronized (this.f92972a) {
            this.f92980i = bool;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m120277y(String str) {
        this.f92978g = str;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m120278z(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168392m8)).booleanValue()) {
                return this.f92986o.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
