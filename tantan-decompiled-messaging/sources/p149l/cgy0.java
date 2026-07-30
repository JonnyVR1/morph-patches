package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class cgy0 implements tyg0<igy0> {

    /* JADX INFO: renamed from: b */
    public static cgy0 f80824b = new cgy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<igy0> f80825a = Suppliers.m15425b(new ggy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m106850a() {
        return ((igy0) f80824b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ igy0 get() {
        return this.f80825a.get();
    }
}
