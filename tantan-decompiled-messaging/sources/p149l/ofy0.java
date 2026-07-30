package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ofy0 implements tyg0<mfy0> {

    /* JADX INFO: renamed from: b */
    public static ofy0 f143791b = new ofy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<mfy0> f143792a = Suppliers.m15425b(new sfy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m164157a() {
        return ((mfy0) f143791b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m164158b() {
        return ((mfy0) f143791b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ mfy0 get() {
        return this.f143792a.get();
    }
}
