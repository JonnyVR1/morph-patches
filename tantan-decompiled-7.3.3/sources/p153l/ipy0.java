package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ipy0 implements b7h0<opy0> {

    /* JADX INFO: renamed from: b */
    public static ipy0 f116313b = new ipy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<opy0> f116314a = Suppliers.m15479b(new mpy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m141545a() {
        return ((opy0) f116313b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ opy0 get() {
        return this.f116314a.get();
    }
}
