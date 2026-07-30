package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ogy0 implements tyg0<ugy0> {

    /* JADX INFO: renamed from: b */
    public static ogy0 f143930b = new ogy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ugy0> f143931a = Suppliers.m15425b(new sgy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m164303a() {
        return ((ugy0) f143930b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m164304b() {
        return ((ugy0) f143930b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ugy0 get() {
        return this.f143931a.get();
    }
}
