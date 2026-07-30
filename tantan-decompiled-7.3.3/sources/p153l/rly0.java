package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class rly0 implements b7h0<amy0> {

    /* JADX INFO: renamed from: b */
    public static rly0 f163812b = new rly0();

    /* JADX INFO: renamed from: a */
    public final b7h0<amy0> f163813a = Suppliers.m15479b(new xly0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m182036a() {
        return ((amy0) f163812b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m182037b() {
        return ((amy0) f163812b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m182038c() {
        return ((amy0) f163812b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m182039d() {
        return ((amy0) f163812b.get()).zzd();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ amy0 get() {
        return this.f163813a.get();
    }
}
