package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class gmy0 implements b7h0<dmy0> {

    /* JADX INFO: renamed from: b */
    public static gmy0 f105044b = new gmy0();

    /* JADX INFO: renamed from: a */
    public final b7h0<dmy0> f105045a = Suppliers.m15479b(new mmy0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m130845a() {
        return ((dmy0) f105044b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ dmy0 get() {
        return this.f105045a.get();
    }
}
