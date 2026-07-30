package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class sxu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f166828a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f166829b;

    public sxu0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f166828a = ehx0Var;
        this.f166829b = ehx0Var2;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rxu0 zzb() {
        return new rxu0(((dct0) this.f166828a).m110876a(), (ScheduledExecutorService) this.f166829b.zzb());
    }
}
