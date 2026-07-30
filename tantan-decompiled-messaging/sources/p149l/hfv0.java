package p149l;

import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hfv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f107527a;

    /* JADX INFO: renamed from: b */
    public final iyv0 f107528b;

    /* JADX INFO: renamed from: c */
    public final zzcei f107529c;

    /* JADX INFO: renamed from: d */
    public final c2t0 f107530d;

    public hfv0(rmw0 rmw0Var, iyv0 iyv0Var, zzcei zzceiVar, c2t0 c2t0Var) {
        this.f107527a = rmw0Var;
        this.f107528b = iyv0Var;
        this.f107529c = zzceiVar;
        this.f107530d = c2t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ifv0 m130789a() throws Exception {
        return new ifv0(this.f107528b.f115500j, this.f107529c, this.f107530d.m104932m());
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 9;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f107527a.mo122102R(new Callable() { // from class: l.gfv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f102438a.m130789a();
            }
        });
    }
}
