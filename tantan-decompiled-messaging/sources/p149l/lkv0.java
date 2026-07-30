package p149l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzgad;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lkv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f128604a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f128605b;

    /* JADX INFO: renamed from: c */
    public final gbv0 f128606c;

    /* JADX INFO: renamed from: d */
    public final Context f128607d;

    /* JADX INFO: renamed from: e */
    public final iyv0 f128608e;

    /* JADX INFO: renamed from: f */
    public final xav0 f128609f;

    /* JADX INFO: renamed from: g */
    public final blu0 f128610g;

    /* JADX INFO: renamed from: h */
    public final hqu0 f128611h;

    /* JADX INFO: renamed from: i */
    public final String f128612i;

    public lkv0(rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, String str, gbv0 gbv0Var, Context context, iyv0 iyv0Var, xav0 xav0Var, blu0 blu0Var, hqu0 hqu0Var) {
        this.f128604a = rmw0Var;
        this.f128605b = scheduledExecutorService;
        this.f128612i = str;
        this.f128606c = gbv0Var;
        this.f128607d = context;
        this.f128608e = iyv0Var;
        this.f128609f = xav0Var;
        this.f128610g = blu0Var;
        this.f128611h = hqu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ gnr m150382a(lkv0 lkv0Var) {
        lkv0 lkv0Var2;
        String lowerCase = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132388ra)).booleanValue() ? lkv0Var.f128608e.f115496f.toLowerCase(Locale.ROOT) : lkv0Var.f128608e.f115496f;
        final Bundle bundleM132585a = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131882D1)).booleanValue() ? lkv0Var.f128611h.m132585a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131990M1)).booleanValue()) {
            lkv0Var2 = lkv0Var;
            lkv0Var2.m150388g(arrayList, lkv0Var2.f128606c.m125335a(lkv0Var2.f128612i, lowerCase));
        } else {
            for (Map.Entry entry : ((zzgad) lkv0Var.f128606c.m125336b(lkv0Var.f128612i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                lkv0 lkv0Var3 = lkv0Var;
                arrayList.add(lkv0Var3.m150386e(str, (List) entry.getValue(), lkv0Var.m150385d(str), true, true));
                lkv0Var = lkv0Var3;
            }
            lkv0Var2 = lkv0Var;
            lkv0Var2.m150388g(arrayList, lkv0Var2.f128606c.m125337c());
        }
        return jmw0.m142229b(arrayList).m137091a(new Callable() { // from class: l.gkv0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (gnr gnrVar : arrayList) {
                    if (((JSONObject) gnrVar.get()) != null) {
                        jSONArray.put(gnrVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new mkv0(jSONArray.toString(), bundleM132585a);
            }
        }, lkv0Var2.f128604a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gnr m150383b(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        final bqs0 bqs0Var;
        bqs0 bqs0VarM102562b;
        final n3t0 n3t0Var = new n3t0();
        if (z2) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131894E1)).booleanValue()) {
                try {
                    bqs0VarM102562b = this.f128610g.m102562b(str);
                } catch (RemoteException e) {
                    x2t0.m206867e("Couldn't create RTB adapter : ", e);
                    bqs0Var = null;
                }
            } else {
                this.f128609f.m207684b(str);
                bqs0VarM102562b = this.f128609f.m207683a(str);
            }
            bqs0Var = bqs0VarM102562b;
        } else {
            bqs0VarM102562b = this.f128610g.m102562b(str);
            bqs0Var = bqs0VarM102562b;
        }
        if (bqs0Var == null) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132416u1)).booleanValue()) {
                throw null;
            }
            jbv0.m140820o8(str, n3t0Var);
            return n3t0Var;
        }
        final jbv0 jbv0Var = new jbv0(str, bqs0Var, n3t0Var, vny0.m199064b().elapsedRealtime());
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132476z1)).booleanValue()) {
            this.f128605b.schedule(new Runnable() { // from class: l.kkv0
                @Override // java.lang.Runnable
                public final void run() {
                    jbv0Var.zzc();
                }
            }, ((Long) d1s0.m109677c().m144697a(m7s0.f132392s1)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z) {
            jbv0Var.zzd();
            return n3t0Var;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131918G1)).booleanValue()) {
            this.f128604a.mo122103a(new Runnable() { // from class: l.hkv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108280a.m150384c(bqs0Var, bundle, list, jbv0Var, n3t0Var);
                }
            });
            return n3t0Var;
        }
        m150387f(bqs0Var, bundle, list, jbv0Var);
        return n3t0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m150384c(bqs0 bqs0Var, Bundle bundle, List list, jbv0 jbv0Var, n3t0 n3t0Var) {
        try {
            m150387f(bqs0Var, bundle, list, jbv0Var);
        } catch (RemoteException e) {
            n3t0Var.m157775c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Bundle m150385d(String str) {
        Bundle bundle = this.f128608e.f115494d.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final amw0 m150386e(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        amw0 amw0VarM97696C = amw0.m97696C(jmw0.m142238k(new qlw0() { // from class: l.ikv0
            @Override // p149l.qlw0
            public final gnr zza() {
                return this.f113729a.m150383b(str, list, bundle, z, z2);
            }
        }, this.f128604a));
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132476z1)).booleanValue()) {
            amw0VarM97696C = (amw0) jmw0.m142242o(amw0VarM97696C, ((Long) d1s0.m109677c().m144697a(m7s0.f132392s1)).longValue(), TimeUnit.MILLISECONDS, this.f128605b);
        }
        return (amw0) jmw0.m142232e(amw0VarM97696C, Throwable.class, new yew0() { // from class: l.jkv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                x2t0.m206866d("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f128604a);
    }

    /* JADX INFO: renamed from: f */
    public final void m150387f(bqs0 bqs0Var, Bundle bundle, @NonNull List list, jbv0 jbv0Var) throws RemoteException {
        bqs0Var.mo103419s6(s050.m181848Y2(this.f128607d), this.f128612i, bundle, (Bundle) list.get(0), this.f128608e.f115495e, jbv0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m150388g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            kbv0 kbv0Var = (kbv0) ((Map.Entry) it.next()).getValue();
            String str = kbv0Var.f122265a;
            lkv0 lkv0Var = this;
            list.add(lkv0Var.m150386e(str, Collections.singletonList(kbv0Var.f122269e), this.m150385d(str), kbv0Var.f122266b, kbv0Var.f122267c));
            this = lkv0Var;
        }
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 32;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        iyv0 iyv0Var = this.f128608e;
        if (iyv0Var.f115507q) {
            if (!Arrays.asList(((String) d1s0.m109677c().m144697a(m7s0.f131906F1)).split(Constants.SEPARATOR_COMMA)).contains(kpv0.m146887a(kpv0.m146888b(iyv0Var.f115494d)))) {
                return jmw0.m142235h(new mkv0(new JSONArray().toString(), new Bundle()));
            }
        }
        return jmw0.m142238k(new qlw0() { // from class: l.fkv0
            @Override // p149l.qlw0
            public final gnr zza() {
                return lkv0.m150382a(this.f98109a);
            }
        }, this.f128604a);
    }
}
