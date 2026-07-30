package p153l;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class i0w0 implements upx0 {
    /* JADX INFO: renamed from: a */
    public static zuv0 m138041a(Context context, jat0 jat0Var, tat0 tat0Var, Object obj, dwv0 dwv0Var, izv0 izv0Var, kpx0 kpx0Var, kpx0 kpx0Var2, kpx0 kpx0Var3, kpx0 kpx0Var4, kpx0 kpx0Var5, kpx0 kpx0Var6, kpx0 kpx0Var7, kpx0 kpx0Var8, kpx0 kpx0Var9, Executor executor, cew0 cew0Var, xwu0 xwu0Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((bzv0) obj);
        hashSet.add(dwv0Var);
        hashSet.add(izv0Var);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168041K5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168053L5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var2.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168065M5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var3.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168077N5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var4.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168125R5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var6.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168137S5)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var7.zzb());
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168014I2)).booleanValue()) {
            hashSet.add((wuv0) kpx0Var9.zzb());
        }
        return new zuv0(context, executor, hashSet, cew0Var, xwu0Var);
    }
}
