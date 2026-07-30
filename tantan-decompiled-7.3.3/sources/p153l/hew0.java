package p153l;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.C2241p1;
import com.google.android.gms.internal.ads.C2249q1;
import com.google.android.gms.internal.ads.C2257r1;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class hew0 implements Runnable {

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public static final Object f109191k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Object f109192l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f109193m = new Object();

    /* JADX INFO: renamed from: n */
    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean f109194n;

    /* JADX INFO: renamed from: a */
    public final Context f109195a;

    /* JADX INFO: renamed from: b */
    public final zzcei f109196b;

    /* JADX INFO: renamed from: e */
    public int f109199e;

    /* JADX INFO: renamed from: f */
    public final xtu0 f109200f;

    /* JADX INFO: renamed from: g */
    public final List f109201g;

    /* JADX INFO: renamed from: i */
    public final o8v0 f109203i;

    /* JADX INFO: renamed from: j */
    public final b5t0 f109204j;

    /* JADX INFO: renamed from: c */
    @GuardedBy("protoLock")
    public final lew0 f109197c = C2257r1.m13273M();

    /* JADX INFO: renamed from: d */
    public String f109198d = "";

    /* JADX INFO: renamed from: h */
    @GuardedBy("initLock")
    public boolean f109202h = false;

    public hew0(Context context, zzcei zzceiVar, xtu0 xtu0Var, o8v0 o8v0Var, b5t0 b5t0Var) {
        this.f109195a = context;
        this.f109196b = zzceiVar;
        this.f109200f = xtu0Var;
        this.f109203i = o8v0Var;
        this.f109204j = b5t0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168032J8)).booleanValue()) {
            this.f109201g = C2098b.m12347F();
        } else {
            this.f109201g = zzgaa.zzl();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m134676a() {
        boolean zBooleanValue;
        synchronized (f109191k) {
            try {
                if (f109194n == null) {
                    if (((Boolean) ris0.f163390b.m149974e()).booleanValue()) {
                        f109194n = Boolean.valueOf(Math.random() < ((Double) ris0.f163389a.m149974e()).doubleValue());
                    } else {
                        f109194n = Boolean.FALSE;
                    }
                }
                zBooleanValue = f109194n.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m134677b(@Nullable final vdw0 vdw0Var) {
        oct0.f146733a.mo155970a(new Runnable() { // from class: l.gew0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103862a.m134678c(vdw0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m134678c(vdw0 vdw0Var) {
        synchronized (f109193m) {
            try {
                if (!this.f109202h) {
                    this.f109202h = true;
                    if (m134676a()) {
                        try {
                            bxy0.m106934r();
                            this.f109198d = C2098b.m12351R(this.f109195a);
                        } catch (RemoteException e) {
                            bxy0.m106933q().m120275w(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f109199e = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f109195a);
                        int iIntValue = ((Integer) jas0.m144075c().m176505a(sgs0.f167972E8)).intValue();
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168369kb)).booleanValue()) {
                            long j = iIntValue;
                            oct0.f146736d.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            oct0.f146736d.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m134676a() && vdw0Var != null) {
            synchronized (f109192l) {
                try {
                    if (this.f109197c.m153959q() >= ((Integer) jas0.m144075c().m176505a(sgs0.f167984F8)).intValue()) {
                        return;
                    }
                    jew0 jew0VarM13179L = C2241p1.m13179L();
                    jew0VarM13179L.m144615N(vdw0Var.m201018l());
                    jew0VarM13179L.m144611G(vdw0Var.m201017k());
                    jew0VarM13179L.m144624w(vdw0Var.m201008b());
                    jew0VarM13179L.m144617P(3);
                    jew0VarM13179L.m144608C(this.f109196b.zza);
                    jew0VarM13179L.m144619r(this.f109198d);
                    jew0VarM13179L.m144606A(Build.VERSION.RELEASE);
                    jew0VarM13179L.m144612K(Build.VERSION.SDK_INT);
                    jew0VarM13179L.m144616O(vdw0Var.m201020n());
                    jew0VarM13179L.m144627z(vdw0Var.m201007a());
                    jew0VarM13179L.m144622u(this.f109199e);
                    jew0VarM13179L.m144614M(vdw0Var.m201019m());
                    jew0VarM13179L.m144620s(vdw0Var.m201010d());
                    jew0VarM13179L.m144623v(vdw0Var.m201012f());
                    jew0VarM13179L.m144625x(vdw0Var.m201013g());
                    jew0VarM13179L.m144626y(this.f109200f.m213106c(vdw0Var.m201013g()));
                    jew0VarM13179L.m144607B(vdw0Var.m201014h());
                    jew0VarM13179L.m144621t(vdw0Var.m201011e());
                    jew0VarM13179L.m144613L(vdw0Var.m201016j());
                    jew0VarM13179L.m144609D(vdw0Var.m201015i());
                    jew0VarM13179L.m144610E(vdw0Var.m201009c());
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168032J8)).booleanValue()) {
                        jew0VarM13179L.m144618q(this.f109201g);
                    }
                    lew0 lew0Var = this.f109197c;
                    mew0 mew0VarM13249L = C2249q1.m13249L();
                    mew0VarM13249L.m158103q(jew0VarM13179L);
                    lew0Var.m153960r(mew0VarM13249L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrM12798h;
        if (m134676a()) {
            Object obj = f109192l;
            synchronized (obj) {
                try {
                    if (this.f109197c.m153959q() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrM12798h = ((C2257r1) this.f109197c.m185950m()).m12798h();
                            this.f109197c.m153961s();
                        }
                        new n8v0(this.f109195a, this.f109196b.zza, this.f109204j, Binder.getCallingUid()).zza(new g8v0((String) jas0.m144075c().m176505a(sgs0.f167960D8), HuiYanResultSender.TIMEOUT_MS, new HashMap(), bArrM12798h, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzead) && ((zzead) e).zza() == 3) {
                            return;
                        }
                        bxy0.m106933q().m120274v(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
