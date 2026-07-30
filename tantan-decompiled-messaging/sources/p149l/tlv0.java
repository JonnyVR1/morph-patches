package p149l;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class tlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f171050a;

    /* JADX INFO: renamed from: b */
    public final Set f171051b;

    /* JADX INFO: renamed from: c */
    public final Executor f171052c;

    /* JADX INFO: renamed from: d */
    public final w4w0 f171053d;

    /* JADX INFO: renamed from: e */
    public final rnu0 f171054e;

    /* JADX INFO: renamed from: f */
    public long f171055f = 0;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public int f171056g = 0;

    public tlv0(Context context, Executor executor, Set set, w4w0 w4w0Var, rnu0 rnu0Var) {
        this.f171050a = context;
        this.f171052c = executor;
        this.f171051b = set;
        this.f171053d = w4w0Var;
        this.f171054e = rnu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final gnr m189627a(final Object obj) {
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f171050a, 8);
        l4w0VarM144514a.zzh();
        final ArrayList arrayList = new ArrayList(this.f171051b.size());
        List arrayList2 = new ArrayList();
        x6s0 x6s0Var = m7s0.f132259hb;
        if (!((String) d1s0.m109677c().m144697a(x6s0Var)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) d1s0.m109677c().m144697a(x6s0Var)).split(Constants.SEPARATOR_COMMA));
        }
        this.f171055f = vny0.m199064b().elapsedRealtime();
        for (final qlv0 qlv0Var : this.f171051b) {
            if (!arrayList2.contains(String.valueOf(qlv0Var.zza()))) {
                final long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
                gnr gnrVarZzb = qlv0Var.zzb();
                gnrVarZzb.addListener(new Runnable() { // from class: l.rlv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f160007a.m189628b(jElapsedRealtime, qlv0Var);
                    }
                }, i3t0.f111377f);
                arrayList.add(gnrVarZzb);
            }
        }
        gnr gnrVarM137091a = jmw0.m142229b(arrayList).m137091a(new Callable() { // from class: l.slv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    plv0 plv0Var = (plv0) ((gnr) it.next()).get();
                    if (plv0Var != null) {
                        plv0Var.mo96132a(obj2);
                    }
                }
            }
        }, this.f171052c);
        if (b5w0.m100343a()) {
            v4w0.m197065a(gnrVarM137091a, this.f171053d, l4w0VarM144514a);
        }
        return gnrVarM137091a;
    }

    /* JADX INFO: renamed from: b */
    public final void m189628b(long j, qlv0 qlv0Var) {
        long jElapsedRealtime = vny0.m199064b().elapsedRealtime() - j;
        if (((Boolean) eas0.f90242a.m115379e()).booleanValue()) {
            xsu0.m210834k("Signal runtime (ms) : " + yfw0.m214595c(qlv0Var.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132159a2)).booleanValue()) {
            qnu0 qnu0VarM180208a = this.f171054e.m180208a();
            qnu0VarM180208a.m175693b("action", "lat_ms");
            qnu0VarM180208a.m175693b("lat_grp", "sig_lat_grp");
            qnu0VarM180208a.m175693b("lat_id", String.valueOf(qlv0Var.zza()));
            qnu0VarM180208a.m175693b("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132172b2)).booleanValue()) {
                synchronized (this) {
                    this.f171056g++;
                }
                qnu0VarM180208a.m175693b("seq_num", vny0.m199079q().m212278h().m104923d());
                synchronized (this) {
                    try {
                        if (this.f171056g == this.f171051b.size() && this.f171055f != 0) {
                            this.f171056g = 0;
                            String strValueOf = String.valueOf(vny0.m199064b().elapsedRealtime() - this.f171055f);
                            if (qlv0Var.zza() <= 39 || qlv0Var.zza() >= 52) {
                                qnu0VarM180208a.m175693b("lat_clsg", strValueOf);
                            } else {
                                qnu0VarM180208a.m175693b("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            qnu0VarM180208a.m175699h();
        }
    }
}
