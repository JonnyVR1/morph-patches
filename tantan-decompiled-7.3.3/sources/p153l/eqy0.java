package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class eqy0 implements b7h0<cqy0> {

    /* JADX INFO: renamed from: b */
    public static eqy0 f95430b = new eqy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<cqy0> f95431a = Suppliers.m15479b(new iqy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m122090a() {
        return ((cqy0) f95430b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m122091b() {
        return ((cqy0) f95430b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ cqy0 get() {
        return this.f95431a.get();
    }
}
