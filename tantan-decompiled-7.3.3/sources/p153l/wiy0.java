package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class wiy0 implements b7h0<tiy0> {

    /* JADX INFO: renamed from: b */
    public static wiy0 f189402b = new wiy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<tiy0> f189403a = Suppliers.m15479b(new bjy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static long m206615a() {
        return ((tiy0) f189402b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ tiy0 get() {
        return this.f189403a.get();
    }
}
