package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class j8y0 implements tyg0<s8y0> {

    /* JADX INFO: renamed from: b */
    public static j8y0 f116828b = new j8y0();

    /* JADX INFO: renamed from: a */
    public final tyg0<s8y0> f116829a = Suppliers.m15425b(new p8y0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m140478a() {
        return ((s8y0) f116828b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ s8y0 get() {
        return this.f116829a.get();
    }
}
