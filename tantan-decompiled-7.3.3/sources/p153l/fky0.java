package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class fky0 implements b7h0<ily0> {

    /* JADX INFO: renamed from: b */
    public static fky0 f99573b = new fky0();

    /* JADX INFO: renamed from: a */
    public final b7h0<ily0> f99574a = Suppliers.m15479b(new fly0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m126062a() {
        return ((ily0) f99573b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m126063b() {
        return ((ily0) f99573b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m126064c() {
        return ((ily0) f99573b.get()).zzc();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ ily0 get() {
        return this.f99574a.get();
    }
}
