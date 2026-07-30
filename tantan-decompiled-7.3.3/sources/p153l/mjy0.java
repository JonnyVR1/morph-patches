package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class mjy0 implements b7h0<jjy0> {

    /* JADX INFO: renamed from: b */
    public static mjy0 f137183b = new mjy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<jjy0> f137184a = Suppliers.m15479b(new sjy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m158647a() {
        return ((jjy0) f137183b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m158648b() {
        return ((jjy0) f137183b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m158649c() {
        return ((jjy0) f137183b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m158650d() {
        return ((jjy0) f137183b.get()).zzd();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ jjy0 get() {
        return this.f137184a.get();
    }
}
