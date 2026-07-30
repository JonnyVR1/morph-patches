package p149l;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class bhv0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f75673a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f75674b;

    public bhv0(ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f75673a = ehx0Var;
        this.f75674b = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new sgv0(((ngv0) this.f75673a).zzb(), 10000L, (Clock) this.f75674b.zzb());
    }
}
