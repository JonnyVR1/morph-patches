package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfxz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lzu0 {

    /* JADX INFO: renamed from: f */
    public final Context f134269f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f134270g;

    /* JADX INFO: renamed from: h */
    public final huu0 f134271h;

    /* JADX INFO: renamed from: i */
    public final Executor f134272i;

    /* JADX INFO: renamed from: j */
    public final Executor f134273j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f134274k;

    /* JADX INFO: renamed from: l */
    public final hxu0 f134275l;

    /* JADX INFO: renamed from: m */
    public final zzcei f134276m;

    /* JADX INFO: renamed from: o */
    public final yeu0 f134278o;

    /* JADX INFO: renamed from: p */
    public final hew0 f134279p;

    /* JADX INFO: renamed from: a */
    public boolean f134264a = false;

    /* JADX INFO: renamed from: b */
    public boolean f134265b = false;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f134266c = false;

    /* JADX INFO: renamed from: e */
    public final tct0 f134268e = new tct0();

    /* JADX INFO: renamed from: n */
    public final Map f134277n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public boolean f134280q = true;

    /* JADX INFO: renamed from: d */
    public final long f134267d = bxy0.m106918b().elapsedRealtime();

    public lzu0(Executor executor, Context context, WeakReference weakReference, Executor executor2, huu0 huu0Var, ScheduledExecutorService scheduledExecutorService, hxu0 hxu0Var, zzcei zzceiVar, yeu0 yeu0Var, hew0 hew0Var) {
        this.f134271h = huu0Var;
        this.f134269f = context;
        this.f134270g = weakReference;
        this.f134272i = executor2;
        this.f134274k = scheduledExecutorService;
        this.f134273j = executor;
        this.f134275l = hxu0Var;
        this.f134276m = zzceiVar;
        this.f134278o = yeu0Var;
        this.f134279p = hew0Var;
        m156498v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m156484j(final lzu0 lzu0Var, String str) {
        kzu0 kzu0Var;
        kzu0 kzu0Var2;
        int i = 5;
        final rdw0 rdw0VarM176209a = qdw0.m176209a(lzu0Var.f134269f, 5);
        rdw0VarM176209a.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(Constants.KEY_CONFIG);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final rdw0 rdw0VarM176209a2 = qdw0.m176209a(lzu0Var.f134269f, i);
                rdw0VarM176209a2.zzh();
                rdw0VarM176209a2.mo162915z(next);
                final Object obj = new Object();
                final tct0 tct0Var = new tct0();
                hpr hprVarM173988o = pvw0.m173988o(tct0Var, ((Long) jas0.m144075c().m176505a(sgs0.f168085O1)).longValue(), TimeUnit.SECONDS, lzu0Var.f134274k);
                lzu0Var.f134275l.m137654c(next);
                lzu0Var.f134278o.zzc(next);
                final long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
                hprVarM173988o.addListener(new Runnable() { // from class: l.xyu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196786a.m156493q(obj, tct0Var, next, jElapsedRealtime, rdw0VarM176209a2);
                    }
                }, lzu0Var.f134272i);
                arrayList.add(hprVarM173988o);
                kzu0 kzu0Var3 = new kzu0(lzu0Var, obj, next, jElapsedRealtime, rdw0VarM176209a2, tct0Var);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    kzu0Var = kzu0Var3;
                                    try {
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        kzu0Var3 = kzu0Var;
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            kzu0 kzu0Var4 = kzu0Var3;
                            arrayList2.add(new zzbpn(strOptString, bundle));
                            i2++;
                            kzu0Var3 = kzu0Var4;
                        }
                    } catch (JSONException unused2) {
                    }
                    kzu0Var = kzu0Var3;
                } else {
                    kzu0Var = kzu0Var3;
                }
                lzu0Var.m156498v(next, false, "", 0);
                try {
                    final r8w0 r8w0VarM137255c = lzu0Var.f134271h.m137255c(next, new JSONObject());
                    Executor executor = lzu0Var.f134273j;
                    final kzu0 kzu0Var5 = kzu0Var;
                    try {
                        Runnable runnable = new Runnable() { // from class: l.gzu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f107235a.m156490n(next, kzu0Var5, r8w0VarM137255c, arrayList2);
                            }
                        };
                        kzu0Var2 = kzu0Var5;
                        try {
                            executor.execute(runnable);
                        } catch (zzfho unused3) {
                            try {
                                kzu0Var2.mo132149c("Failed to create Adapter.");
                            } catch (RemoteException e) {
                                dct0.m115296e("", e);
                            }
                        }
                    } catch (zzfho unused4) {
                        kzu0Var2 = kzu0Var5;
                    }
                } catch (zzfho unused5) {
                    kzu0Var2 = kzu0Var;
                }
                i = 5;
            }
            pvw0.m173974a(arrayList).m169489a(new Callable() { // from class: l.dzu0
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f91382a.m156486f(rdw0VarM176209a);
                    return null;
                }
            }, lzu0Var.f134272i);
        } catch (JSONException e2) {
            d2v0.m113738l("Malformed CLD response", e2);
            lzu0Var.f134278o.zza("MalformedJson");
            lzu0Var.f134275l.m137652a("MalformedJson");
            lzu0Var.f134268e.m190495c(e2);
            bxy0.m106933q().m120275w(e2, "AdapterInitializer.updateAdapterStatus");
            hew0 hew0Var = lzu0Var.f134279p;
            rdw0VarM176209a.mo162912b(e2);
            rdw0VarM176209a.mo162910S(false);
            hew0Var.m134677b(rdw0VarM176209a.zzl());
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object m156486f(rdw0 rdw0Var) throws Exception {
        this.f134268e.m190494b(Boolean.TRUE);
        rdw0Var.mo162910S(true);
        this.f134279p.m134677b(rdw0Var.zzl());
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final List m156487g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f134277n.keySet()) {
            zzbpd zzbpdVar = (zzbpd) this.f134277n.get(str);
            arrayList.add(new zzbpd(str, zzbpdVar.zzb, zzbpdVar.zzc, zzbpdVar.zzd));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m156488l() {
        this.f134280q = false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m156489m() {
        synchronized (this) {
            try {
                if (this.f134266c) {
                    return;
                }
                m156498v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (bxy0.m106918b().elapsedRealtime() - this.f134267d));
                this.f134275l.m137653b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f134278o.mo97568b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f134268e.m190495c(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m156490n(String str, iss0 iss0Var, r8w0 r8w0Var, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    iss0Var.zzf();
                    return;
                }
                Context context = (Context) this.f134270g.get();
                if (context == null) {
                    context = this.f134269f;
                }
                r8w0Var.m180268n(context, iss0Var, list);
            } catch (RemoteException e) {
                dct0.m115296e("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfxz(e2);
        } catch (zzfho unused) {
            iss0Var.mo132149c("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m156491o(final tct0 tct0Var) {
        this.f134272i.execute(new Runnable() { // from class: l.wyu0
            @Override // java.lang.Runnable
            public final void run() {
                String strM214925c = bxy0.m106933q().m120264i().zzh().m214925c();
                boolean zIsEmpty = TextUtils.isEmpty(strM214925c);
                tct0 tct0Var2 = tct0Var;
                if (zIsEmpty) {
                    tct0Var2.m190495c(new Exception());
                } else {
                    tct0Var2.m190494b(strM214925c);
                }
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m156492p() {
        this.f134275l.m137656e();
        this.f134278o.zze();
        this.f134265b = true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m156493q(Object obj, tct0 tct0Var, String str, long j, rdw0 rdw0Var) {
        synchronized (obj) {
            try {
                if (!tct0Var.isDone()) {
                    m156498v(str, false, "Timeout.", (int) (bxy0.m106918b().elapsedRealtime() - j));
                    this.f134275l.m137653b(str, "timeout");
                    this.f134278o.mo97568b(str, "timeout");
                    hew0 hew0Var = this.f134279p;
                    rdw0Var.zzc("Timeout");
                    rdw0Var.mo162910S(false);
                    hew0Var.m134677b(rdw0Var.zzl());
                    tct0Var.m190494b(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m156494r() {
        if (!((Boolean) njs0.f142337a.m149974e()).booleanValue()) {
            if (this.f134276m.zzc >= ((Integer) jas0.m144075c().m176505a(sgs0.f168073N1)).intValue() && this.f134280q) {
                if (this.f134264a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f134264a) {
                            return;
                        }
                        this.f134275l.m137657f();
                        this.f134278o.zzf();
                        this.f134268e.addListener(new Runnable() { // from class: l.hzu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f112304a.m156492p();
                            }
                        }, this.f134272i);
                        this.f134264a = true;
                        hpr hprVarM156497u = m156497u();
                        this.f134274k.schedule(new Runnable() { // from class: l.vyu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f186424a.m156489m();
                            }
                        }, ((Long) jas0.m144075c().m176505a(sgs0.f168097P1)).longValue(), TimeUnit.SECONDS);
                        pvw0.m173991r(hprVarM156497u, new jzu0(this), this.f134272i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f134264a) {
            return;
        }
        m156498v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f134268e.m190494b(Boolean.FALSE);
        this.f134264a = true;
        this.f134265b = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m156495s(final lss0 lss0Var) {
        this.f134268e.addListener(new Runnable() { // from class: l.fzu0
            @Override // java.lang.Runnable
            public final void run() {
                lzu0 lzu0Var = this.f101548a;
                try {
                    lss0Var.mo115302m0(lzu0Var.m156487g());
                } catch (RemoteException e) {
                    dct0.m115296e("", e);
                }
            }
        }, this.f134273j);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m156496t() {
        return this.f134265b;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized hpr m156497u() {
        String strM214925c = bxy0.m106933q().m120264i().zzh().m214925c();
        if (!TextUtils.isEmpty(strM214925c)) {
            return pvw0.m173981h(strM214925c);
        }
        final tct0 tct0Var = new tct0();
        bxy0.m106933q().m120264i().mo131906p(new Runnable() { // from class: l.ezu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96625a.m156491o(tct0Var);
            }
        });
        return tct0Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m156498v(String str, boolean z, String str2, int i) {
        this.f134277n.put(str, new zzbpd(str, z, i, str2));
    }
}
