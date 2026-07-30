package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class hey0 implements tyg0<fey0> {

    /* JADX INFO: renamed from: b */
    public static hey0 f107419b = new hey0();

    /* JADX INFO: renamed from: a */
    public final tyg0<fey0> f107420a = Suppliers.m15425b(new ley0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m130716a() {
        return ((fey0) f107419b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m130717b() {
        return ((fey0) f107419b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m130718c() {
        return ((fey0) f107419b.get()).zzc();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ fey0 get() {
        return this.f107420a.get();
    }
}
