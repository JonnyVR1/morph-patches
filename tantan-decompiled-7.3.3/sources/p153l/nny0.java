package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class nny0 implements b7h0<lny0> {

    /* JADX INFO: renamed from: b */
    public static nny0 f142900b = new nny0();

    /* JADX INFO: renamed from: a */
    public final b7h0<lny0> f142901a = Suppliers.m15479b(new rny0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m164006a() {
        return ((lny0) f142900b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m164007b() {
        return ((lny0) f142900b.get()).zzb();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m164008c() {
        return ((lny0) f142900b.get()).zzc();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ lny0 get() {
        return this.f142901a.get();
    }
}
