package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class pjy0 implements b7h0<xjy0> {

    /* JADX INFO: renamed from: b */
    public static pjy0 f152761b = new pjy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<xjy0> f152762a = Suppliers.m15479b(new ujy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m172561a() {
        return ((xjy0) f152761b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m172562b() {
        return ((xjy0) f152761b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ xjy0 get() {
        return this.f152762a.get();
    }
}
