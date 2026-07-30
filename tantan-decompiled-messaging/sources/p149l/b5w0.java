package p149l;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.ads.C2218p1;
import com.google.android.gms.internal.ads.C2226q1;
import com.google.android.gms.internal.ads.C2234r1;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class b5w0 implements Runnable {

    /* JADX INFO: renamed from: k */
    @VisibleForTesting
    public static final Object f73707k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Object f73708l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f73709m = new Object();

    /* JADX INFO: renamed from: n */
    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean f73710n;

    /* JADX INFO: renamed from: a */
    public final Context f73711a;

    /* JADX INFO: renamed from: b */
    public final zzcei f73712b;

    /* JADX INFO: renamed from: e */
    public int f73715e;

    /* JADX INFO: renamed from: f */
    public final rku0 f73716f;

    /* JADX INFO: renamed from: g */
    public final List f73717g;

    /* JADX INFO: renamed from: i */
    public final izu0 f73719i;

    /* JADX INFO: renamed from: j */
    public final vvs0 f73720j;

    /* JADX INFO: renamed from: c */
    @GuardedBy("protoLock")
    public final f5w0 f73713c = C2234r1.m13219M();

    /* JADX INFO: renamed from: d */
    public String f73714d = "";

    /* JADX INFO: renamed from: h */
    @GuardedBy("initLock")
    public boolean f73718h = false;

    public b5w0(Context context, zzcei zzceiVar, rku0 rku0Var, izu0 izu0Var, vvs0 vvs0Var) {
        this.f73711a = context;
        this.f73712b = zzceiVar;
        this.f73716f = rku0Var;
        this.f73719i = izu0Var;
        this.f73720j = vvs0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131961J8)).booleanValue()) {
            this.f73717g = C2075b.m12293F();
        } else {
            this.f73717g = zzgaa.zzl();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m100343a() {
        boolean zBooleanValue;
        synchronized (f73707k) {
            try {
                if (f73710n == null) {
                    if (((Boolean) l9s0.f127141b.m115379e()).booleanValue()) {
                        f73710n = Boolean.valueOf(Math.random() < ((Double) l9s0.f127140a.m115379e()).doubleValue());
                    } else {
                        f73710n = Boolean.FALSE;
                    }
                }
                zBooleanValue = f73710n.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public final void m100344b(@Nullable final p4w0 p4w0Var) {
        i3t0.f111372a.mo122103a(new Runnable() { // from class: l.a5w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f67729a.m100345c(p4w0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m100345c(p4w0 p4w0Var) {
        synchronized (f73709m) {
            try {
                if (!this.f73718h) {
                    this.f73718h = true;
                    if (m100343a()) {
                        try {
                            vny0.m199080r();
                            this.f73714d = C2075b.m12297R(this.f73711a);
                        } catch (RemoteException e) {
                            vny0.m199079q().m212290w(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.f73715e = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f73711a);
                        int iIntValue = ((Integer) d1s0.m109677c().m144697a(m7s0.f131901E8)).intValue();
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132298kb)).booleanValue()) {
                            long j = iIntValue;
                            i3t0.f111375d.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            i3t0.f111375d.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m100343a() && p4w0Var != null) {
            synchronized (f73708l) {
                try {
                    if (this.f73713c.m119536q() >= ((Integer) d1s0.m109677c().m144697a(m7s0.f131913F8)).intValue()) {
                        return;
                    }
                    d5w0 d5w0VarM13125L = C2218p1.m13125L();
                    d5w0VarM13125L.m110081N(p4w0Var.m167437l());
                    d5w0VarM13125L.m110077G(p4w0Var.m167436k());
                    d5w0VarM13125L.m110090w(p4w0Var.m167427b());
                    d5w0VarM13125L.m110083P(3);
                    d5w0VarM13125L.m110074C(this.f73712b.zza);
                    d5w0VarM13125L.m110085r(this.f73714d);
                    d5w0VarM13125L.m110072A(Build.VERSION.RELEASE);
                    d5w0VarM13125L.m110078K(Build.VERSION.SDK_INT);
                    d5w0VarM13125L.m110082O(p4w0Var.m167439n());
                    d5w0VarM13125L.m110093z(p4w0Var.m167426a());
                    d5w0VarM13125L.m110088u(this.f73715e);
                    d5w0VarM13125L.m110080M(p4w0Var.m167438m());
                    d5w0VarM13125L.m110086s(p4w0Var.m167429d());
                    d5w0VarM13125L.m110089v(p4w0Var.m167431f());
                    d5w0VarM13125L.m110091x(p4w0Var.m167432g());
                    d5w0VarM13125L.m110092y(this.f73716f.m179767c(p4w0Var.m167432g()));
                    d5w0VarM13125L.m110073B(p4w0Var.m167433h());
                    d5w0VarM13125L.m110087t(p4w0Var.m167430e());
                    d5w0VarM13125L.m110079L(p4w0Var.m167435j());
                    d5w0VarM13125L.m110075D(p4w0Var.m167434i());
                    d5w0VarM13125L.m110076E(p4w0Var.m167428c());
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131961J8)).booleanValue()) {
                        d5w0VarM13125L.m110084q(this.f73717g);
                    }
                    f5w0 f5w0Var = this.f73713c;
                    g5w0 g5w0VarM13195L = C2226q1.m13195L();
                    g5w0VarM13195L.m124545q(d5w0VarM13125L);
                    f5w0Var.m119537r(g5w0VarM13195L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrM12744h;
        if (m100343a()) {
            Object obj = f73708l;
            synchronized (obj) {
                try {
                    if (this.f73713c.m119536q() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrM12744h = ((C2234r1) this.f73713c.m153521m()).m12744h();
                            this.f73713c.m119538s();
                        }
                        new hzu0(this.f73711a, this.f73712b.zza, this.f73720j, Binder.getCallingUid()).zza(new azu0((String) d1s0.m109677c().m144697a(m7s0.f131889D8), HuiYanResultSender.TIMEOUT_MS, new HashMap(), bArrM12744h, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzead) && ((zzead) e).zza() == 3) {
                            return;
                        }
                        vny0.m199079q().m212289v(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
