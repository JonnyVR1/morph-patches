package p153l;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.C2232o0;
import com.google.android.gms.internal.ads.zzflg;

/* JADX INFO: loaded from: classes6.dex */
public final class gav0 implements mcw0 {

    /* JADX INFO: renamed from: a */
    public final u9v0 f103026a;

    /* JADX INFO: renamed from: b */
    public final y9v0 f103027b;

    public gav0(u9v0 u9v0Var, y9v0 y9v0Var) {
        this.f103026a = u9v0Var;
        this.f103027b = y9v0Var;
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: D */
    public final void mo100841D(zzflg zzflgVar, String str, Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.f103026a.m195134c() != 0) {
            this.f103026a.m195137f(bxy0.m106918b().elapsedRealtime() - this.f103026a.m195134c());
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: b */
    public final void mo100843b(zzflg zzflgVar, String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue()) {
            if (zzflg.RENDERER == zzflgVar) {
                this.f103026a.m195138g(bxy0.m106918b().elapsedRealtime());
                return;
            }
            if (zzflg.PRELOADED_LOADER == zzflgVar || zzflg.SERVER_TRANSACTION == zzflgVar) {
                this.f103026a.m195139h(bxy0.m106918b().elapsedRealtime());
                final y9v0 y9v0Var = this.f103027b;
                final long jM195135d = this.f103026a.m195135d();
                y9v0Var.f85930b.m153463a(new kbw0() { // from class: l.x9v0
                    @Override // p153l.kbw0
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (y9v0Var.m115137a()) {
                            return null;
                        }
                        long j = jM195135d;
                        les0 les0VarM13099T = C2232o0.m13099T();
                        les0VarM13099T.m153950x(j);
                        byte[] bArrM12798h = ((C2232o0) les0VarM13099T.m185950m()).m12798h();
                        fav0.m124789g(sQLiteDatabase, false, false);
                        fav0.m124786d(sQLiteDatabase, j, bArrM12798h);
                        return null;
                    }
                });
            }
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: k */
    public final void mo100844k(zzflg zzflgVar, String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue() && zzflg.RENDERER == zzflgVar && this.f103026a.m195134c() != 0) {
            this.f103026a.m195137f(bxy0.m106918b().elapsedRealtime() - this.f103026a.m195134c());
        }
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: z */
    public final void mo100845z(zzflg zzflgVar, String str) {
    }
}
