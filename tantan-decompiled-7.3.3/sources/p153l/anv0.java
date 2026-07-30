package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class anv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f72395a;

    public anv0(Context context) {
        this.f72395a = context;
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 2;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168026J2)).booleanValue()) {
            return pvw0.m173981h(new bnv0(j26.m143188a(this.f72395a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return pvw0.m173981h(null);
    }
}
