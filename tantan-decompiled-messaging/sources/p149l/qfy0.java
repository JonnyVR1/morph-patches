package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class qfy0 implements tyg0<wfy0> {

    /* JADX INFO: renamed from: b */
    public static qfy0 f154299b = new qfy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<wfy0> f154300a = Suppliers.m15425b(new ufy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m174377a() {
        return ((wfy0) f154299b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ wfy0 get() {
        return this.f154300a.get();
    }
}
