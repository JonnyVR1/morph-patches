package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class y8y0 implements tyg0<v8y0> {

    /* JADX INFO: renamed from: b */
    public static y8y0 f196900b = new y8y0();

    /* JADX INFO: renamed from: a */
    public final tyg0<v8y0> f196901a = Suppliers.m15425b(new e9y0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m213518a() {
        return ((v8y0) f196900b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ v8y0 get() {
        return this.f196901a.get();
    }
}
