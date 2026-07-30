package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class zay0 implements tyg0<ccy0> {

    /* JADX INFO: renamed from: b */
    public static zay0 f202412b = new zay0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ccy0> f202413a = Suppliers.m15425b(new zby0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m217800a() {
        return ((ccy0) f202412b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m217801b() {
        return ((ccy0) f202412b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m217802c() {
        return ((ccy0) f202412b.get()).zzc();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ccy0 get() {
        return this.f202413a.get();
    }
}
