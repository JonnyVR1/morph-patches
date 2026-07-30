package p153l;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2479e;

/* JADX INFO: loaded from: classes6.dex */
public final class prx0 extends xgw<String, g9s0> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2479e f153858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prx0(C2479e c2479e, int i) {
        super(20);
        this.f153858i = c2479e;
    }

    @Override // p153l.xgw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g9s0 mo173578a(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return C2479e.m15164y(this.f153858i, str2);
    }
}
