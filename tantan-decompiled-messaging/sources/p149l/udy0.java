package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class udy0 implements tyg0<dey0> {

    /* JADX INFO: renamed from: b */
    public static udy0 f175977b = new udy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<dey0> f175978a = Suppliers.m15425b(new aey0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m193168a() {
        return ((dey0) f175977b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ dey0 get() {
        return this.f175978a.get();
    }
}
