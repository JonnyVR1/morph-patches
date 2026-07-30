package p153l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class scw0 {

    /* JADX INFO: renamed from: a */
    public final Executor f167354a;

    /* JADX INFO: renamed from: b */
    public final hct0 f167355b;

    public scw0(Executor executor, hct0 hct0Var) {
        this.f167354a = executor;
        this.f167355b = hct0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m185393a(String str) {
        this.f167355b.zza(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m185394b(final String str) {
        this.f167354a.execute(new Runnable() { // from class: l.rcw0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162259a.m185393a(str);
            }
        });
    }
}
