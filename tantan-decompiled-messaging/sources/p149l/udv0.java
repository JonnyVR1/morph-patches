package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class udv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f175972a;

    public udv0(Context context) {
        this.f175972a = context;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 2;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131955J2)).booleanValue()) {
            return jmw0.m142235h(new vdv0(e16.m114373a(this.f175972a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return jmw0.m142235h(null);
    }
}
