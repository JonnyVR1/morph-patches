package p153l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class a3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f68328a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f68329b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f68330c;

    public a3v0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f68328a = kqx0Var;
        this.f68329b = kqx0Var2;
        this.f68330c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final v2s0 v2s0Var = (v2s0) this.f68328a.zzb();
        final Context contextM146114a = ((jlt0) this.f68329b).m146114a();
        xvw0 xvw0Var = oct0.f146733a;
        cqx0.m111999b(xvw0Var);
        hpr hprVarMo155969R = xvw0Var.mo155969R(new Callable() { // from class: l.x2v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return v2s0Var.m199147c().mo165754a(contextM146114a);
            }
        });
        cqx0.m111999b(hprVarMo155969R);
        return hprVarMo155969R;
    }
}
