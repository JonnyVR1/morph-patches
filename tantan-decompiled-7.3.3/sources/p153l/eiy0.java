package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class eiy0 implements b7h0<biy0> {

    /* JADX INFO: renamed from: b */
    public static eiy0 f94232b = new eiy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<biy0> f94233a = Suppliers.m15479b(new kiy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m120950a() {
        return ((biy0) f94232b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ biy0 get() {
        return this.f94233a.get();
    }
}
