package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class pny0 implements b7h0<vny0> {

    /* JADX INFO: renamed from: b */
    public static pny0 f153341b = new pny0();

    /* JADX INFO: renamed from: a */
    public final b7h0<vny0> f153342a = Suppliers.m15479b(new tny0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m173084a() {
        return ((vny0) f153341b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m173085b() {
        return ((vny0) f153341b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m173086c() {
        return ((vny0) f153341b.get()).zzc();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ vny0 get() {
        return this.f153342a.get();
    }
}
