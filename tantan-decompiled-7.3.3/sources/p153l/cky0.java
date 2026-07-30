package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class cky0 implements b7h0<zjy0> {

    /* JADX INFO: renamed from: b */
    public static cky0 f82329b = new cky0();

    /* JADX INFO: renamed from: a */
    public final b7h0<zjy0> f82330a = Suppliers.m15479b(new iky0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m110408a() {
        return ((zjy0) f82329b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m110409b() {
        return ((zjy0) f82329b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m110410c() {
        return ((zjy0) f82329b.get()).zzc();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ zjy0 get() {
        return this.f82330a.get();
    }
}
