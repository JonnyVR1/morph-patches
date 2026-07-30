package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class way0 implements tyg0<tay0> {

    /* JADX INFO: renamed from: b */
    public static way0 f185525b = new way0();

    /* JADX INFO: renamed from: a */
    public final tyg0<tay0> f185526a = Suppliers.m15425b(new cby0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m202481a() {
        return ((tay0) f185525b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m202482b() {
        return ((tay0) f185525b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m202483c() {
        return ((tay0) f185525b.get()).zzc();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ tay0 get() {
        return this.f185526a.get();
    }
}
