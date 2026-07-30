package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class upy0 implements b7h0<aqy0> {

    /* JADX INFO: renamed from: b */
    public static upy0 f180333b = new upy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<aqy0> f180334a = Suppliers.m15479b(new ypy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m197192a() {
        return ((aqy0) f180333b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m197193b() {
        return ((aqy0) f180333b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ aqy0 get() {
        return this.f180334a.get();
    }
}
