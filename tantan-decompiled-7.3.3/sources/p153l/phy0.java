package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class phy0 implements b7h0<yhy0> {

    /* JADX INFO: renamed from: b */
    public static phy0 f152500b = new phy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<yhy0> f152501a = Suppliers.m15479b(new vhy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m172351a() {
        return ((yhy0) f152500b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ yhy0 get() {
        return this.f152501a.get();
    }
}
