package p153l;

import com.google.android.gms.internal.measurement.C2366r0;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class y2z0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public final Callable<Object> f197292c;

    public y2z0(String str, Callable<Object> callable) {
        super(str);
        this.f197292c = callable;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        try {
            return C2366r0.m14333b(this.f197292c.call());
        } catch (Exception unused) {
            return ewr0.f96187w0;
        }
    }
}
