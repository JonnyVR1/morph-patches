package p149l;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.C2209o0;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class a1v0 implements g3w0 {

    /* JADX INFO: renamed from: a */
    public final o0v0 f67204a;

    /* JADX INFO: renamed from: b */
    public final s0v0 f67205b;

    public a1v0(o0v0 o0v0Var, s0v0 s0v0Var) {
        this.f67204a = o0v0Var;
        this.f67205b = s0v0Var;
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: D */
    public final void mo94578D(zzflg zzflgVar, String str, Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.f67204a.m162179c() != 0) {
            this.f67204a.m162182f(vny0.m199064b().elapsedRealtime() - this.f67204a.m162179c());
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: b */
    public final void mo94579b(zzflg zzflgVar, String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue()) {
            if (zzflg.RENDERER == zzflgVar) {
                this.f67204a.m162183g(vny0.m199064b().elapsedRealtime());
                return;
            }
            if (zzflg.PRELOADED_LOADER == zzflgVar || zzflg.SERVER_TRANSACTION == zzflgVar) {
                this.f67204a.m162184h(vny0.m199064b().elapsedRealtime());
                final s0v0 s0v0Var = this.f67205b;
                final long jM162180d = this.f67204a.m162180d();
                s0v0Var.f188997b.m119057a(new e2w0() { // from class: l.r0v0
                    @Override // p149l.e2w0
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (s0v0Var.m206653a()) {
                            return null;
                        }
                        long j = jM162180d;
                        f5s0 f5s0VarM13045T = C2209o0.m13045T();
                        f5s0VarM13045T.m119527x(j);
                        byte[] bArrM12744h = ((C2209o0) f5s0VarM13045T.m153521m()).m12744h();
                        z0v0.m216767g(sQLiteDatabase, false, false);
                        z0v0.m216764d(sQLiteDatabase, j, bArrM12744h);
                        return null;
                    }
                });
            }
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: k */
    public final void mo94580k(zzflg zzflgVar, String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.f67204a.m162179c() != 0) {
            this.f67204a.m162182f(vny0.m199064b().elapsedRealtime() - this.f67204a.m162179c());
        }
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: z */
    public final void mo94581z(zzflg zzflgVar, String str) {
    }
}
