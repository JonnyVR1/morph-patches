package p149l;

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
public final class fqu0 {

    /* JADX INFO: renamed from: f */
    public final Context f98849f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f98850g;

    /* JADX INFO: renamed from: h */
    public final blu0 f98851h;

    /* JADX INFO: renamed from: i */
    public final Executor f98852i;

    /* JADX INFO: renamed from: j */
    public final Executor f98853j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f98854k;

    /* JADX INFO: renamed from: l */
    public final bou0 f98855l;

    /* JADX INFO: renamed from: m */
    public final zzcei f98856m;

    /* JADX INFO: renamed from: o */
    public final s5u0 f98858o;

    /* JADX INFO: renamed from: p */
    public final b5w0 f98859p;

    /* JADX INFO: renamed from: a */
    public boolean f98844a = false;

    /* JADX INFO: renamed from: b */
    public boolean f98845b = false;

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public boolean f98846c = false;

    /* JADX INFO: renamed from: e */
    public final n3t0 f98848e = new n3t0();

    /* JADX INFO: renamed from: n */
    public final Map f98857n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public boolean f98860q = true;

    /* JADX INFO: renamed from: d */
    public final long f98847d = vny0.m199064b().elapsedRealtime();

    public fqu0(Executor executor, Context context, WeakReference weakReference, Executor executor2, blu0 blu0Var, ScheduledExecutorService scheduledExecutorService, bou0 bou0Var, zzcei zzceiVar, s5u0 s5u0Var, b5w0 b5w0Var) {
        this.f98851h = blu0Var;
        this.f98849f = context;
        this.f98850g = weakReference;
        this.f98852i = executor2;
        this.f98854k = scheduledExecutorService;
        this.f98853j = executor;
        this.f98855l = bou0Var;
        this.f98856m = zzceiVar;
        this.f98858o = s5u0Var;
        this.f98859p = b5w0Var;
        m122767v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ void m122753j(final fqu0 fqu0Var, String str) {
        equ0 equ0Var;
        equ0 equ0Var2;
        int i = 5;
        final l4w0 l4w0VarM144514a = k4w0.m144514a(fqu0Var.f98849f, 5);
        l4w0VarM144514a.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject(Constants.KEY_CONFIG);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final l4w0 l4w0VarM144514a2 = k4w0.m144514a(fqu0Var.f98849f, i);
                l4w0VarM144514a2.zzh();
                l4w0VarM144514a2.mo129466z(next);
                final Object obj = new Object();
                final n3t0 n3t0Var = new n3t0();
                gnr gnrVarM142242o = jmw0.m142242o(n3t0Var, ((Long) d1s0.m109677c().m144697a(m7s0.f132014O1)).longValue(), TimeUnit.SECONDS, fqu0Var.f98854k);
                fqu0Var.f98855l.m102986c(next);
                fqu0Var.f98858o.zzc(next);
                final long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
                gnrVarM142242o.addListener(new Runnable() { // from class: l.rpu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f160563a.m122762q(obj, n3t0Var, next, jElapsedRealtime, l4w0VarM144514a2);
                    }
                }, fqu0Var.f98852i);
                arrayList.add(gnrVarM142242o);
                equ0 equ0Var3 = new equ0(fqu0Var, obj, next, jElapsedRealtime, l4w0VarM144514a2, n3t0Var);
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
                                    equ0Var = equ0Var3;
                                    try {
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        equ0Var3 = equ0Var;
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            equ0 equ0Var4 = equ0Var3;
                            arrayList2.add(new zzbpn(strOptString, bundle));
                            i2++;
                            equ0Var3 = equ0Var4;
                        }
                    } catch (JSONException unused2) {
                    }
                    equ0Var = equ0Var3;
                } else {
                    equ0Var = equ0Var3;
                }
                fqu0Var.m122767v(next, false, "", 0);
                try {
                    final lzv0 lzv0VarM102563c = fqu0Var.f98851h.m102563c(next, new JSONObject());
                    Executor executor = fqu0Var.f98853j;
                    final equ0 equ0Var5 = equ0Var;
                    try {
                        Runnable runnable = new Runnable() { // from class: l.aqu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f71205a.m122759n(next, equ0Var5, lzv0VarM102563c, arrayList2);
                            }
                        };
                        equ0Var2 = equ0Var5;
                        try {
                            executor.execute(runnable);
                        } catch (zzfho unused3) {
                            try {
                                equ0Var2.mo97009c("Failed to create Adapter.");
                            } catch (RemoteException e) {
                                x2t0.m206867e("", e);
                            }
                        }
                    } catch (zzfho unused4) {
                        equ0Var2 = equ0Var5;
                    }
                } catch (zzfho unused5) {
                    equ0Var2 = equ0Var;
                }
                i = 5;
            }
            jmw0.m142228a(arrayList).m137091a(new Callable() { // from class: l.xpu0
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.f193958a.m122755f(l4w0VarM144514a);
                    return null;
                }
            }, fqu0Var.f98852i);
        } catch (JSONException e2) {
            xsu0.m210835l("Malformed CLD response", e2);
            fqu0Var.f98858o.zza("MalformedJson");
            fqu0Var.f98855l.m102984a("MalformedJson");
            fqu0Var.f98848e.m157775c(e2);
            vny0.m199079q().m212290w(e2, "AdapterInitializer.updateAdapterStatus");
            b5w0 b5w0Var = fqu0Var.f98859p;
            l4w0VarM144514a.mo129463b(e2);
            l4w0VarM144514a.mo129461S(false);
            b5w0Var.m100344b(l4w0VarM144514a.zzl());
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object m122755f(l4w0 l4w0Var) throws Exception {
        this.f98848e.m157774b(Boolean.TRUE);
        l4w0Var.mo129461S(true);
        this.f98859p.m100344b(l4w0Var.zzl());
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final List m122756g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f98857n.keySet()) {
            zzbpd zzbpdVar = (zzbpd) this.f98857n.get(str);
            arrayList.add(new zzbpd(str, zzbpdVar.zzb, zzbpdVar.zzc, zzbpdVar.zzd));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final void m122757l() {
        this.f98860q = false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m122758m() {
        synchronized (this) {
            try {
                if (this.f98846c) {
                    return;
                }
                m122767v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (vny0.m199064b().elapsedRealtime() - this.f98847d));
                this.f98855l.m102985b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f98858o.mo132586b("com.google.android.gms.ads.MobileAds", "timeout");
                this.f98848e.m157775c(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m122759n(String str, cjs0 cjs0Var, lzv0 lzv0Var, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    cjs0Var.zzf();
                    return;
                }
                Context context = (Context) this.f98850g.get();
                if (context == null) {
                    context = this.f98849f;
                }
                lzv0Var.m152384n(context, cjs0Var, list);
            } catch (RemoteException e) {
                x2t0.m206867e("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfxz(e2);
        } catch (zzfho unused) {
            cjs0Var.mo97009c("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m122760o(final n3t0 n3t0Var) {
        this.f98852i.execute(new Runnable() { // from class: l.qpu0
            @Override // java.lang.Runnable
            public final void run() {
                String strM182044c = vny0.m199079q().m212279i().zzh().m182044c();
                boolean zIsEmpty = TextUtils.isEmpty(strM182044c);
                n3t0 n3t0Var2 = n3t0Var;
                if (zIsEmpty) {
                    n3t0Var2.m157775c(new Exception());
                } else {
                    n3t0Var2.m157774b(strM182044c);
                }
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m122761p() {
        this.f98855l.m102988e();
        this.f98858o.zze();
        this.f98845b = true;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m122762q(Object obj, n3t0 n3t0Var, String str, long j, l4w0 l4w0Var) {
        synchronized (obj) {
            try {
                if (!n3t0Var.isDone()) {
                    m122767v(str, false, "Timeout.", (int) (vny0.m199064b().elapsedRealtime() - j));
                    this.f98855l.m102985b(str, "timeout");
                    this.f98858o.mo132586b(str, "timeout");
                    b5w0 b5w0Var = this.f98859p;
                    l4w0Var.zzc("Timeout");
                    l4w0Var.mo129461S(false);
                    b5w0Var.m100344b(l4w0Var.zzl());
                    n3t0Var.m157774b(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m122763r() {
        if (!((Boolean) has0.f106823a.m115379e()).booleanValue()) {
            if (this.f98856m.zzc >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132002N1)).intValue() && this.f98860q) {
                if (this.f98844a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f98844a) {
                            return;
                        }
                        this.f98855l.m102989f();
                        this.f98858o.zzf();
                        this.f98848e.addListener(new Runnable() { // from class: l.bqu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f76817a.m122761p();
                            }
                        }, this.f98852i);
                        this.f98844a = true;
                        gnr gnrVarM122766u = m122766u();
                        this.f98854k.schedule(new Runnable() { // from class: l.ppu0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f150721a.m122758m();
                            }
                        }, ((Long) d1s0.m109677c().m144697a(m7s0.f132026P1)).longValue(), TimeUnit.SECONDS);
                        jmw0.m142245r(gnrVarM122766u, new dqu0(this), this.f98852i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f98844a) {
            return;
        }
        m122767v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.f98848e.m157774b(Boolean.FALSE);
        this.f98844a = true;
        this.f98845b = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m122764s(final fjs0 fjs0Var) {
        this.f98848e.addListener(new Runnable() { // from class: l.zpu0
            @Override // java.lang.Runnable
            public final void run() {
                fqu0 fqu0Var = this.f204311a;
                try {
                    fjs0Var.mo112111m0(fqu0Var.m122756g());
                } catch (RemoteException e) {
                    x2t0.m206867e("", e);
                }
            }
        }, this.f98853j);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m122765t() {
        return this.f98845b;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized gnr m122766u() {
        String strM182044c = vny0.m199079q().m212279i().zzh().m182044c();
        if (!TextUtils.isEmpty(strM182044c)) {
            return jmw0.m142235h(strM182044c);
        }
        final n3t0 n3t0Var = new n3t0();
        vny0.m199079q().m212279i().mo96957p(new Runnable() { // from class: l.ypu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199491a.m122760o(n3t0Var);
            }
        });
        return n3t0Var;
    }

    /* JADX INFO: renamed from: v */
    public final void m122767v(String str, boolean z, String str2, int i) {
        this.f98857n.put(str, new zzbpd(str, z, i, str2));
    }
}
