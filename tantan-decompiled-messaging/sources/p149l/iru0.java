package p149l;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class iru0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f114684a;

    /* JADX INFO: renamed from: b */
    public final ehx0 f114685b;

    /* JADX INFO: renamed from: c */
    public final ehx0 f114686c;

    /* JADX INFO: renamed from: d */
    public final ehx0 f114687d;

    /* JADX INFO: renamed from: e */
    public final ehx0 f114688e;

    public iru0(ehx0 ehx0Var, ehx0 ehx0Var2, ehx0 ehx0Var3, ehx0 ehx0Var4, ehx0 ehx0Var5) {
        this.f114684a = ehx0Var;
        this.f114685b = ehx0Var2;
        this.f114686c = ehx0Var3;
        this.f114687d = ehx0Var4;
        this.f114688e = ehx0Var5;
    }

    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextM110876a = ((dct0) this.f114684a).m110876a();
        WeakReference weakReferenceM115752a = ((ect0) this.f114685b).m115752a();
        lru0 lru0Var = (lru0) this.f114686c.zzb();
        yru0 yru0Var = new yru0();
        rmw0 rmw0Var = i3t0.f111372a;
        wgx0.m203089b(rmw0Var);
        return new xru0(contextM110876a, weakReferenceM115752a, lru0Var, yru0Var, rmw0Var);
    }
}
