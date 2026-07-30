package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ziy0 implements b7h0<gjy0> {

    /* JADX INFO: renamed from: b */
    public static ziy0 f204630b = new ziy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<gjy0> f204631a = Suppliers.m15479b(new ejy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m219953a() {
        return ((gjy0) f204630b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m219954b() {
        return ((gjy0) f204630b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m219955c() {
        return ((gjy0) f204630b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m219956d() {
        return ((gjy0) f204630b.get()).zzd();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: e */
    public static boolean m219957e() {
        return ((gjy0) f204630b.get()).zze();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ gjy0 get() {
        return this.f204631a.get();
    }
}
