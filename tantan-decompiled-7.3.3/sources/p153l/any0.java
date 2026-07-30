package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class any0 implements b7h0<jny0> {

    /* JADX INFO: renamed from: b */
    public static any0 f72401b = new any0();

    /* JADX INFO: renamed from: a */
    public final b7h0<jny0> f72402a = Suppliers.m15479b(new gny0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m99047a() {
        return ((jny0) f72401b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ jny0 get() {
        return this.f72402a.get();
    }
}
