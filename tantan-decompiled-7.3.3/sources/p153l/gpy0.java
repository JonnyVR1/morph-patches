package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class gpy0 implements b7h0<epy0> {

    /* JADX INFO: renamed from: b */
    public static gpy0 f105634b = new gpy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<epy0> f105635a = Suppliers.m15479b(new kpy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static double m131332a() {
        return ((epy0) f105634b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static long m131333b() {
        return ((epy0) f105634b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static long m131334c() {
        return ((epy0) f105634b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static long m131335d() {
        return ((epy0) f105634b.get()).zzd();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: e */
    public static String m131336e() {
        return ((epy0) f105634b.get()).zze();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: f */
    public static boolean m131337f() {
        return ((epy0) f105634b.get()).zzf();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ epy0 get() {
        return this.f105635a.get();
    }
}
