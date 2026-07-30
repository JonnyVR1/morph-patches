package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class gay0 implements tyg0<day0> {

    /* JADX INFO: renamed from: b */
    public static gay0 f101722b = new gay0();

    /* JADX INFO: renamed from: a */
    public final tyg0<day0> f101723a = Suppliers.m15425b(new may0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m125042a() {
        return ((day0) f101722b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m125043b() {
        return ((day0) f101722b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m125044c() {
        return ((day0) f101722b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m125045d() {
        return ((day0) f101722b.get()).zzd();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ day0 get() {
        return this.f101723a.get();
    }
}
