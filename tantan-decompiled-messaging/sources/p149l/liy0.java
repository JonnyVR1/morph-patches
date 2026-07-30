package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class liy0 implements tyg0<jiy0> {

    /* JADX INFO: renamed from: b */
    public static liy0 f128268b = new liy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<jiy0> f128269a = Suppliers.m15425b(new niy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m149952a() {
        return ((jiy0) f128268b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ jiy0 get() {
        return this.f128269a.get();
    }
}
