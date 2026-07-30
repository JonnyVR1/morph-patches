package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class ygy0 implements tyg0<wgy0> {

    /* JADX INFO: renamed from: b */
    public static ygy0 f198261b = new ygy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<wgy0> f198262a = Suppliers.m15425b(new chy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m214781a() {
        return ((wgy0) f198261b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m214782b() {
        return ((wgy0) f198261b.get()).zzb();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ wgy0 get() {
        return this.f198262a.get();
    }
}
