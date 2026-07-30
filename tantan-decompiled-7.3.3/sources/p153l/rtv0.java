package p153l;

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
public final class rtv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f164864a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f164865b;

    /* JADX INFO: renamed from: c */
    public final mkv0 f164866c;

    /* JADX INFO: renamed from: d */
    public final Context f164867d;

    /* JADX INFO: renamed from: e */
    public final o7w0 f164868e;

    /* JADX INFO: renamed from: f */
    public final dkv0 f164869f;

    /* JADX INFO: renamed from: g */
    public final huu0 f164870g;

    /* JADX INFO: renamed from: h */
    public final nzu0 f164871h;

    /* JADX INFO: renamed from: i */
    public final String f164872i;

    public rtv0(xvw0 xvw0Var, ScheduledExecutorService scheduledExecutorService, String str, mkv0 mkv0Var, Context context, o7w0 o7w0Var, dkv0 dkv0Var, huu0 huu0Var, nzu0 nzu0Var) {
        this.f164864a = xvw0Var;
        this.f164865b = scheduledExecutorService;
        this.f164872i = str;
        this.f164866c = mkv0Var;
        this.f164867d = context;
        this.f164868e = o7w0Var;
        this.f164869f = dkv0Var;
        this.f164870g = huu0Var;
        this.f164871h = nzu0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ hpr m183167a(rtv0 rtv0Var) {
        rtv0 rtv0Var2;
        String lowerCase = ((Boolean) jas0.m144075c().m176505a(sgs0.f168459ra)).booleanValue() ? rtv0Var.f164868e.f145320f.toLowerCase(Locale.ROOT) : rtv0Var.f164868e.f145320f;
        final Bundle bundleM165397a = ((Boolean) jas0.m144075c().m176505a(sgs0.f167953D1)).booleanValue() ? rtv0Var.f164871h.m165397a() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168061M1)).booleanValue()) {
            rtv0Var2 = rtv0Var;
            rtv0Var2.m183173g(arrayList, rtv0Var2.f164866c.m158825a(rtv0Var2.f164872i, lowerCase));
        } else {
            for (Map.Entry entry : ((zzgad) rtv0Var.f164866c.m158826b(rtv0Var.f164872i, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                rtv0 rtv0Var3 = rtv0Var;
                arrayList.add(rtv0Var3.m183171e(str, (List) entry.getValue(), rtv0Var.m183170d(str), true, true));
                rtv0Var = rtv0Var3;
            }
            rtv0Var2 = rtv0Var;
            rtv0Var2.m183173g(arrayList, rtv0Var2.f164866c.m158827c());
        }
        return pvw0.m173975b(arrayList).m169489a(new Callable() { // from class: l.mtv0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (hpr hprVar : arrayList) {
                    if (((JSONObject) hprVar.get()) != null) {
                        jSONArray.put(hprVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new stv0(jSONArray.toString(), bundleM165397a);
            }
        }, rtv0Var2.f164864a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpr m183168b(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        final hzs0 hzs0Var;
        hzs0 hzs0VarM137254b;
        final tct0 tct0Var = new tct0();
        if (z2) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167965E1)).booleanValue()) {
                try {
                    hzs0VarM137254b = this.f164870g.m137254b(str);
                } catch (RemoteException e) {
                    dct0.m115296e("Couldn't create RTB adapter : ", e);
                    hzs0Var = null;
                }
            } else {
                this.f164869f.m116687b(str);
                hzs0VarM137254b = this.f164869f.m116686a(str);
            }
            hzs0Var = hzs0VarM137254b;
        } else {
            hzs0VarM137254b = this.f164870g.m137254b(str);
            hzs0Var = hzs0VarM137254b;
        }
        if (hzs0Var == null) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168487u1)).booleanValue()) {
                throw null;
            }
            pkv0.m172766o8(str, tct0Var);
            return tct0Var;
        }
        final pkv0 pkv0Var = new pkv0(str, hzs0Var, tct0Var, bxy0.m106918b().elapsedRealtime());
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168547z1)).booleanValue()) {
            this.f164865b.schedule(new Runnable() { // from class: l.qtv0
                @Override // java.lang.Runnable
                public final void run() {
                    pkv0Var.zzc();
                }
            }, ((Long) jas0.m144075c().m176505a(sgs0.f168463s1)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z) {
            pkv0Var.zzd();
            return tct0Var;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167989G1)).booleanValue()) {
            this.f164864a.mo155970a(new Runnable() { // from class: l.ntv0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143651a.m183169c(hzs0Var, bundle, list, pkv0Var, tct0Var);
                }
            });
            return tct0Var;
        }
        m183172f(hzs0Var, bundle, list, pkv0Var);
        return tct0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m183169c(hzs0 hzs0Var, Bundle bundle, List list, pkv0 pkv0Var, tct0 tct0Var) {
        try {
            m183172f(hzs0Var, bundle, list, pkv0Var);
        } catch (RemoteException e) {
            tct0Var.m190495c(e);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Bundle m183170d(String str) {
        Bundle bundle = this.f164868e.f145318d.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final gvw0 m183171e(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        gvw0 gvw0VarM132580C = gvw0.m132580C(pvw0.m173984k(new wuw0() { // from class: l.otv0
            @Override // p153l.wuw0
            public final hpr zza() {
                return this.f149012a.m183168b(str, list, bundle, z, z2);
            }
        }, this.f164864a));
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168547z1)).booleanValue()) {
            gvw0VarM132580C = (gvw0) pvw0.m173988o(gvw0VarM132580C, ((Long) jas0.m144075c().m176505a(sgs0.f168463s1)).longValue(), TimeUnit.MILLISECONDS, this.f164865b);
        }
        return (gvw0) pvw0.m173978e(gvw0VarM132580C, Throwable.class, new eow0() { // from class: l.ptv0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                dct0.m115295d("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.f164864a);
    }

    /* JADX INFO: renamed from: f */
    public final void m183172f(hzs0 hzs0Var, Bundle bundle, @NonNull List list, pkv0 pkv0Var) throws RemoteException {
        hzs0Var.mo113453s6(h950.m134038Y2(this.f164867d), this.f164872i, bundle, (Bundle) list.get(0), this.f164868e.f145319e, pkv0Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m183173g(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            qkv0 qkv0Var = (qkv0) ((Map.Entry) it.next()).getValue();
            String str = qkv0Var.f158175a;
            rtv0 rtv0Var = this;
            list.add(rtv0Var.m183171e(str, Collections.singletonList(qkv0Var.f158179e), this.m183170d(str), qkv0Var.f158176b, qkv0Var.f158177c));
            this = rtv0Var;
        }
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 32;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        o7w0 o7w0Var = this.f164868e;
        if (o7w0Var.f145331q) {
            if (!Arrays.asList(((String) jas0.m144075c().m176505a(sgs0.f167977F1)).split(Constants.SEPARATOR_COMMA)).contains(qyv0.m178750a(qyv0.m178751b(o7w0Var.f145318d)))) {
                return pvw0.m173981h(new stv0(new JSONArray().toString(), new Bundle()));
            }
        }
        return pvw0.m173984k(new wuw0() { // from class: l.ltv0
            @Override // p153l.wuw0
            public final hpr zza() {
                return rtv0.m183167a(this.f133578a);
            }
        }, this.f164864a);
    }
}
