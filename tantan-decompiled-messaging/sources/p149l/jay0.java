package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class jay0 implements tyg0<ray0> {

    /* JADX INFO: renamed from: b */
    public static jay0 f117142b = new jay0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ray0> f117143a = Suppliers.m15425b(new oay0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m140721a() {
        return ((ray0) f117142b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m140722b() {
        return ((ray0) f117142b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ray0 get() {
        return this.f117143a.get();
    }
}
