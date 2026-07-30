package p153l;

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
public final class zuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f206161a;

    /* JADX INFO: renamed from: b */
    public final Set f206162b;

    /* JADX INFO: renamed from: c */
    public final Executor f206163c;

    /* JADX INFO: renamed from: d */
    public final cew0 f206164d;

    /* JADX INFO: renamed from: e */
    public final xwu0 f206165e;

    /* JADX INFO: renamed from: f */
    public long f206166f = 0;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public int f206167g = 0;

    public zuv0(Context context, Executor executor, Set set, cew0 cew0Var, xwu0 xwu0Var) {
        this.f206161a = context;
        this.f206163c = executor;
        this.f206162b = set;
        this.f206164d = cew0Var;
        this.f206165e = xwu0Var;
    }

    /* JADX INFO: renamed from: a */
    public final hpr m221730a(final Object obj) {
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f206161a, 8);
        rdw0VarM176209a.zzh();
        final ArrayList arrayList = new ArrayList(this.f206162b.size());
        List arrayList2 = new ArrayList();
        dgs0 dgs0Var = sgs0.f168330hb;
        if (!((String) jas0.m144075c().m176505a(dgs0Var)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) jas0.m144075c().m176505a(dgs0Var)).split(Constants.SEPARATOR_COMMA));
        }
        this.f206166f = bxy0.m106918b().elapsedRealtime();
        for (final wuv0 wuv0Var : this.f206162b) {
            if (!arrayList2.contains(String.valueOf(wuv0Var.zza()))) {
                final long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
                hpr hprVarZzb = wuv0Var.zzb();
                hprVarZzb.addListener(new Runnable() { // from class: l.xuv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196327a.m221731b(jElapsedRealtime, wuv0Var);
                    }
                }, oct0.f146738f);
                arrayList.add(hprVarZzb);
            }
        }
        hpr hprVarM169489a = pvw0.m173975b(arrayList).m169489a(new Callable() { // from class: l.yuv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Iterator it = arrayList.iterator();
                while (true) {
                    Object obj2 = obj;
                    if (!it.hasNext()) {
                        return obj2;
                    }
                    vuv0 vuv0Var = (vuv0) ((hpr) it.next()).get();
                    if (vuv0Var != null) {
                        vuv0Var.mo99378a(obj2);
                    }
                }
            }
        }, this.f206163c);
        if (hew0.m134676a()) {
            bew0.m103785a(hprVarM169489a, this.f206164d, rdw0VarM176209a);
        }
        return hprVarM169489a;
    }

    /* JADX INFO: renamed from: b */
    public final void m221731b(long j, wuv0 wuv0Var) {
        long jElapsedRealtime = bxy0.m106918b().elapsedRealtime() - j;
        if (((Boolean) kjs0.f127139a.m149974e()).booleanValue()) {
            d2v0.m113737k("Signal runtime (ms) : " + epw0.m121874c(wuv0Var.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168230a2)).booleanValue()) {
            wwu0 wwu0VarM213443a = this.f206165e.m213443a();
            wwu0VarM213443a.m208307b("action", "lat_ms");
            wwu0VarM213443a.m208307b("lat_grp", "sig_lat_grp");
            wwu0VarM213443a.m208307b("lat_id", String.valueOf(wuv0Var.zza()));
            wwu0VarM213443a.m208307b("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168243b2)).booleanValue()) {
                synchronized (this) {
                    this.f206167g++;
                }
                wwu0VarM213443a.m208307b("seq_num", bxy0.m106933q().m120263h().m139403d());
                synchronized (this) {
                    try {
                        if (this.f206167g == this.f206162b.size() && this.f206166f != 0) {
                            this.f206167g = 0;
                            String strValueOf = String.valueOf(bxy0.m106918b().elapsedRealtime() - this.f206166f);
                            if (wuv0Var.zza() <= 39 || wuv0Var.zza() >= 52) {
                                wwu0VarM213443a.m208307b("lat_clsg", strValueOf);
                            } else {
                                wwu0VarM213443a.m208307b("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            wwu0VarM213443a.m208313h();
        }
    }
}
