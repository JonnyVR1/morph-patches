package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class wzs0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f188760a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f188761b;

    public wzs0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f188760a = ehx0Var;
        this.f188761b = ehx0Var2;
    }

    @Override // p149l.ehx0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vzs0 zzb() {
        return new vzs0((Clock) this.f188760a.zzb(), (tzs0) this.f188761b.zzb());
    }
}
