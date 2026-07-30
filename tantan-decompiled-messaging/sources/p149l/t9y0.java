package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class t9y0 implements tyg0<aay0> {

    /* JADX INFO: renamed from: b */
    public static t9y0 f169081b = new t9y0();

    /* JADX INFO: renamed from: a */
    public final tyg0<aay0> f169082a = Suppliers.m15425b(new y9y0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m187687a() {
        return ((aay0) f169081b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m187688b() {
        return ((aay0) f169081b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m187689c() {
        return ((aay0) f169081b.get()).zzc();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: d */
    public static boolean m187690d() {
        return ((aay0) f169081b.get()).zzd();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: e */
    public static boolean m187691e() {
        return ((aay0) f169081b.get()).zze();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ aay0 get() {
        return this.f169082a.get();
    }
}
