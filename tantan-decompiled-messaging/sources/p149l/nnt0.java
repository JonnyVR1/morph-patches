package p149l;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class nnt0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f139783a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f139784b;

    public nnt0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f139783a = ehx0Var;
        this.f139784b = ehx0Var2;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l0u0 zzb() {
        return new l0u0((ScheduledExecutorService) this.f139783a.zzb(), (Clock) this.f139784b.zzb());
    }
}
