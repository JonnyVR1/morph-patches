package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class agy0 implements tyg0<yfy0> {

    /* JADX INFO: renamed from: b */
    public static agy0 f69535b = new agy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<yfy0> f69536a = Suppliers.m15425b(new egy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static double m96356a() {
        return ((yfy0) f69535b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static long m96357b() {
        return ((yfy0) f69535b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static long m96358c() {
        return ((yfy0) f69535b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static long m96359d() {
        return ((yfy0) f69535b.get()).zzd();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: e */
    public static String m96360e() {
        return ((yfy0) f69535b.get()).zze();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: f */
    public static boolean m96361f() {
        return ((yfy0) f69535b.get()).zzf();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ yfy0 get() {
        return this.f69536a.get();
    }
}
