package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class xmy0 implements b7h0<umy0> {

    /* JADX INFO: renamed from: b */
    public static xmy0 f195336b = new xmy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<umy0> f195337a = Suppliers.m15479b(new dny0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m212072a() {
        return ((umy0) f195336b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ umy0 get() {
        return this.f195337a.get();
    }
}
