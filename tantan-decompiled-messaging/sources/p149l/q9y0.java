package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class q9y0 implements tyg0<n9y0> {

    /* JADX INFO: renamed from: b */
    public static q9y0 f153488b = new q9y0();

    /* JADX INFO: renamed from: a */
    public final tyg0<n9y0> f153489a = Suppliers.m15425b(new v9y0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static long m173676a() {
        return ((n9y0) f153488b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ n9y0 get() {
        return this.f153489a.get();
    }
}
