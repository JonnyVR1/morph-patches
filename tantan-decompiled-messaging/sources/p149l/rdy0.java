package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class rdy0 implements tyg0<ody0> {

    /* JADX INFO: renamed from: b */
    public static rdy0 f159018b = new rdy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ody0> f159019a = Suppliers.m15425b(new xdy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m179021a() {
        return ((ody0) f159018b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ody0 get() {
        return this.f159019a.get();
    }
}
