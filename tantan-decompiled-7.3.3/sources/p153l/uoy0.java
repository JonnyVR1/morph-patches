package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class uoy0 implements b7h0<soy0> {

    /* JADX INFO: renamed from: b */
    public static uoy0 f180195b = new uoy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<soy0> f180196a = Suppliers.m15479b(new yoy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m197028a() {
        return ((soy0) f180195b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m197029b() {
        return ((soy0) f180195b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ soy0 get() {
        return this.f180196a.get();
    }
}
