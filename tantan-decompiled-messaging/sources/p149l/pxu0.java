package p149l;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class pxu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f151729a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f151730b;

    public pxu0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f151729a = ehx0Var;
        this.f151730b = ehx0Var2;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oxu0 zzb() {
        return new oxu0(((dct0) this.f151729a).m110876a(), (ScheduledExecutorService) this.f151730b.zzb());
    }
}
