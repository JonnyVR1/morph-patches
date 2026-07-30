package p149l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class jey0 implements tyg0<pey0> {

    /* JADX INFO: renamed from: b */
    public static jey0 f117616b = new jey0();

    /* JADX INFO: renamed from: a */
    public final tyg0<pey0> f117617a = Suppliers.m15425b(new ney0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m141166a() {
        return ((pey0) f117616b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m141167b() {
        return ((pey0) f117616b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m141168c() {
        return ((pey0) f117616b.get()).zzc();
    }

    @Override // p149l.tyg0
    public final /* synthetic */ pey0 get() {
        return this.f117617a.get();
    }
}
