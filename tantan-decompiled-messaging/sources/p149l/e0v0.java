package p149l;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class e0v0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e2w0 f88683a;

    public e0v0(f0v0 f0v0Var, e2w0 e2w0Var) {
        this.f88683a = e2w0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        x2t0.m206866d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f88683a.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            x2t0.m206866d("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
