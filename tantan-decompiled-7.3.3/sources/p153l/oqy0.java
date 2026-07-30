package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class oqy0 implements b7h0<mqy0> {

    /* JADX INFO: renamed from: b */
    public static oqy0 f148657b = new oqy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<mqy0> f148658a = Suppliers.m15479b(new jry0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m168850a() {
        return ((mqy0) f148657b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m168851b() {
        return ((mqy0) f148657b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ mqy0 get() {
        return this.f148658a.get();
    }
}
