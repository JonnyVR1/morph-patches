package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g6s0 {

    /* JADX INFO: renamed from: a */
    public final List<zzbv> f102479a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final ewr0 m129267a(String str) {
        if (!this.f102479a.contains(tqw0.m192369c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    /* JADX INFO: renamed from: b */
    public abstract ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list);
}
