package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ihy0 implements tyg0<ghy0> {

    /* JADX INFO: renamed from: b */
    public static ihy0 f113355b = new ihy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ghy0> f113356a = Suppliers.m15425b(new diy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m136327a() {
        return ((ghy0) f113355b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m136328b() {
        return ((ghy0) f113355b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ghy0 get() {
        return this.f113356a.get();
    }
}
