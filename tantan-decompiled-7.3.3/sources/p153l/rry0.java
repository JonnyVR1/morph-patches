package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class rry0 implements b7h0<pry0> {

    /* JADX INFO: renamed from: b */
    public static rry0 f164619b = new rry0();

    /* JADX INFO: renamed from: a */
    public final b7h0<pry0> f164620a = Suppliers.m15479b(new try0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m182831a() {
        return ((pry0) f164619b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ pry0 get() {
        return this.f164620a.get();
    }
}
