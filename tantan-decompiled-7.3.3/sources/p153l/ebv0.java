package p153l;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class ebv0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kbw0 f92990a;

    public ebv0(fbv0 fbv0Var, kbw0 kbw0Var) {
        this.f92990a = kbw0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        dct0.m115295d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f92990a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            dct0.m115295d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
