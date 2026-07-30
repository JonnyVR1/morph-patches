package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class iry0 implements b7h0<nry0> {

    /* JADX INFO: renamed from: b */
    public static iry0 f116612b = new iry0();

    /* JADX INFO: renamed from: a */
    public final b7h0<nry0> f116613a = Suppliers.m15479b(new lry0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m141852a() {
        return ((nry0) f116612b.get()).zza();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ nry0 get() {
        return this.f116613a.get();
    }
}
