package p149l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class m3w0 {

    /* JADX INFO: renamed from: a */
    public final Executor f131189a;

    /* JADX INFO: renamed from: b */
    public final b3t0 f131190b;

    public m3w0(Executor executor, b3t0 b3t0Var) {
        this.f131189a = executor;
        this.f131190b = b3t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m152953a(String str) {
        this.f131190b.zza(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m152954b(final String str) {
        this.f131189a.execute(new Runnable() { // from class: l.l3w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f125948a.m152953a(str);
            }
        });
    }
}
