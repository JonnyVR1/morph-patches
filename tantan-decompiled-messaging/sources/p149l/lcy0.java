package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class lcy0 implements tyg0<ucy0> {

    /* JADX INFO: renamed from: b */
    public static lcy0 f127482b = new lcy0();

    /* JADX INFO: renamed from: a */
    public final tyg0<ucy0> f127483a = Suppliers.m15425b(new rcy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m149371a() {
        return ((ucy0) f127482b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m149372b() {
        return ((ucy0) f127482b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m149373c() {
        return ((ucy0) f127482b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m149374d() {
        return ((ucy0) f127482b.get()).zzd();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ ucy0 get() {
        return this.f127483a.get();
    }
}
