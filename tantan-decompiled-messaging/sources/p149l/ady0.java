package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ady0 implements tyg0<xcy0> {

    /* JADX INFO: renamed from: b */
    public static ady0 f68976b = new ady0();

    /* JADX INFO: renamed from: a */
    public final tyg0<xcy0> f68977a = Suppliers.m15425b(new gdy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m96014a() {
        return ((xcy0) f68976b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ xcy0 get() {
        return this.f68977a.get();
    }
}
