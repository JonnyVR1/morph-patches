package p153l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class twt0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f176426a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f176427b;

    public twt0(kqx0 kqx0Var, kqx0 kqx0Var2) {
        this.f176426a = kqx0Var;
        this.f176427b = kqx0Var2;
    }

    @Override // p153l.kqx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r9u0 zzb() {
        return new r9u0((ScheduledExecutorService) this.f176426a.zzb(), (Clock) this.f176427b.zzb());
    }
}
