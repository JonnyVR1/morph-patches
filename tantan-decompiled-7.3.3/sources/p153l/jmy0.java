package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class jmy0 implements b7h0<smy0> {

    /* JADX INFO: renamed from: b */
    public static jmy0 f121718b = new jmy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<smy0> f121719a = Suppliers.m15479b(new pmy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m146178a() {
        return ((smy0) f121718b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m146179b() {
        return ((smy0) f121718b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ smy0 get() {
        return this.f121719a.get();
    }
}
