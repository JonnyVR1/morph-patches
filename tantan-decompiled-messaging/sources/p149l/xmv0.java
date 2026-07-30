package p149l;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class xmv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Executor f193581a;

    /* JADX INFO: renamed from: b */
    public final String f193582b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final PackageInfo f193583c;

    /* JADX INFO: renamed from: d */
    public final p1t0 f193584d;

    public xmv0(p1t0 p1t0Var, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.f193584d = p1t0Var;
        this.f193581a = executor;
        this.f193582b = str;
        this.f193583c = packageInfo;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m210151a(Throwable th) throws Exception {
        return jmw0.m142235h(new ymv0(this.f193582b));
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 41;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return jmw0.m142233f(jmw0.m142240m(jmw0.m142235h(this.f193582b), new yew0() { // from class: l.vmv0
            @Override // p149l.yew0
            public final Object apply(Object obj) {
                return new ymv0((String) obj);
            }
        }, this.f193581a), Throwable.class, new rlw0() { // from class: l.wmv0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f187170a.m210151a((Throwable) obj);
            }
        }, this.f193581a);
    }
}
