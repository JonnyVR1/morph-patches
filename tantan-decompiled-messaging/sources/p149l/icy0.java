package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class icy0 implements tyg0<fcy0> {

    /* JADX INFO: renamed from: b */
    public static icy0 f112494b = new icy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<fcy0> f112495a = Suppliers.m15425b(new ocy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m135372a() {
        return ((fcy0) f112494b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m135373b() {
        return ((fcy0) f112494b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ fcy0 get() {
        return this.f112495a.get();
    }
}
