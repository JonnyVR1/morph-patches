package p153l;

import com.google.common.base.Suppliers;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: loaded from: classes6.dex */
public final class oly0 implements b7h0<lly0> {

    /* JADX INFO: renamed from: b */
    public static oly0 f147882b = new oly0();

    /* JADX INFO: renamed from: a */
    public final b7h0<lly0> f147883a = Suppliers.m15479b(new uly0());

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m168176a() {
        return ((lly0) f147882b.get()).zza();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: b */
    public static boolean m168177b() {
        return ((lly0) f147882b.get()).zzb();
    }

    @Override // p153l.b7h0
    public final /* synthetic */ lly0 get() {
        return this.f147883a.get();
    }
}
