package p153l;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class vku0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f184517a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f184518b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f184519c;

    /* JADX INFO: renamed from: d */
    public final kqx0 f184520d;

    public vku0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3, kqx0 kqx0Var4) {
        this.f184517a = kqx0Var;
        this.f184518b = kqx0Var2;
        this.f184519c = kqx0Var3;
        this.f184520d = kqx0Var4;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        v6s0 v6s0Var = (v6s0) this.f184517a.zzb();
        Executor executor = (Executor) this.f184518b.zzb();
        Context context = (Context) this.f184519c.zzb();
        return new rvt0(executor, new wut0(context, v6s0Var), (Clock) this.f184520d.zzb());
    }
}
