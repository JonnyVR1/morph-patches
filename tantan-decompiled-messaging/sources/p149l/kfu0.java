package p149l;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class kfu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final dfu0 f122974a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f122975b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f122976c;

    public kfu0(dfu0 dfu0Var, ehx0 ehx0Var, ehx0 ehx0Var2) {
        this.f122974a = dfu0Var;
        this.f122975b = ehx0Var;
        this.f122976c = ehx0Var2;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new s6u0(((aju0) this.f122975b).zzb(), (Executor) this.f122976c.zzb());
    }
}
