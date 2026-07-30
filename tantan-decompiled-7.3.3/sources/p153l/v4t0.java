package p153l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class v4t0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f182424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x4t0 f182425b;

    public v4t0(x4t0 x4t0Var, Context context) {
        this.f182424a = context;
        this.f182425b = x4t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        u4t0 u4t0VarM189308a;
        w4t0 w4t0Var = (w4t0) this.f182425b.f192431a.get(this.f182424a);
        if (w4t0Var != null) {
            if (w4t0Var.f187435a + ((Long) ois0.f147579a.m149974e()).longValue() < bxy0.m106918b().currentTimeMillis()) {
                u4t0VarM189308a = new t4t0(this.f182424a).m189308a();
            } else {
                u4t0VarM189308a = new t4t0(this.f182424a, w4t0Var.f187436b).m189308a();
            }
        } else {
            u4t0VarM189308a = new t4t0(this.f182424a).m189308a();
        }
        x4t0 x4t0Var = this.f182425b;
        x4t0Var.f192431a.put(this.f182424a, new w4t0(x4t0Var, u4t0VarM189308a));
        return u4t0VarM189308a;
    }
}
