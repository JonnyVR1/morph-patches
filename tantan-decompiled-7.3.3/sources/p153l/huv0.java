package p153l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class huv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final s9t0 f111713a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f111714b;

    /* JADX INFO: renamed from: c */
    public final Context f111715c;

    public huv0(s9t0 s9t0Var, xvw0 xvw0Var, Context context) {
        this.f111713a = s9t0Var;
        this.f111714b = xvw0Var;
        this.f111715c = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iuv0 m137257a() throws Exception {
        if (!this.f111713a.m185241p(this.f111715c)) {
            return new iuv0(null, null, null, null, null);
        }
        String strM185229d = this.f111713a.m185229d(this.f111715c);
        String str = strM185229d == null ? "" : strM185229d;
        String strM185227b = this.f111713a.m185227b(this.f111715c);
        String str2 = strM185227b == null ? "" : strM185227b;
        String strM185226a = this.f111713a.m185226a(this.f111715c);
        String str3 = strM185226a == null ? "" : strM185226a;
        Long l2 = null;
        String str4 = true != this.f111713a.m185241p(this.f111715c) ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l2 = (Long) jas0.m144075c().m176505a(sgs0.f168293f0);
        }
        return new iuv0(str, str2, str3, str4 == null ? "" : str4, l2);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 34;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f111714b.mo155969R(new Callable() { // from class: l.guv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f106588a.m137257a();
            }
        });
    }
}
