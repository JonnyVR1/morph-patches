package p153l;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class k9v0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kbw0 f124587a;

    public k9v0(l9v0 l9v0Var, kbw0 kbw0Var) {
        this.f124587a = kbw0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        dct0.m115295d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f124587a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            dct0.m115295d("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
