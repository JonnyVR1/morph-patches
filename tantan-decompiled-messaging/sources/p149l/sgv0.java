package p149l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class sgv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f164486a = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final Clock f164487b;

    /* JADX INFO: renamed from: c */
    public final qlv0 f164488c;

    /* JADX INFO: renamed from: d */
    public final long f164489d;

    public sgv0(qlv0 qlv0Var, long j, Clock clock) {
        this.f164487b = clock;
        this.f164488c = qlv0Var;
        this.f164489d = j;
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 16;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        rgv0 rgv0Var = (rgv0) this.f164486a.get();
        if (rgv0Var == null || rgv0Var.m179265a()) {
            qlv0 qlv0Var = this.f164488c;
            rgv0 rgv0Var2 = new rgv0(qlv0Var.zzb(), this.f164489d, this.f164487b);
            this.f164486a.set(rgv0Var2);
            rgv0Var = rgv0Var2;
        }
        return rgv0Var.f159295a;
    }
}
