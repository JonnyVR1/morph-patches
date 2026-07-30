package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ddy0 implements tyg0<mdy0> {

    /* JADX INFO: renamed from: b */
    public static ddy0 f85686b = new ddy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<mdy0> f85687a = Suppliers.m15425b(new jdy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m111087a() {
        return ((mdy0) f85686b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m111088b() {
        return ((mdy0) f85686b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ mdy0 get() {
        return this.f85687a.get();
    }
}
