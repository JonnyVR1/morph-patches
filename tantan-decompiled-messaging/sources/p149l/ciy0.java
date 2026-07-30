package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ciy0 implements tyg0<hiy0> {

    /* JADX INFO: renamed from: b */
    public static ciy0 f81123b = new ciy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<hiy0> f81124a = Suppliers.m15425b(new fiy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m107101a() {
        return ((hiy0) f81123b.get()).zza();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ hiy0 get() {
        return this.f81124a.get();
    }
}
