package p153l;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class osv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f148906a;

    /* JADX INFO: renamed from: b */
    public final Context f148907b;

    /* JADX INFO: renamed from: c */
    public final Set f148908c;

    public osv0(xvw0 xvw0Var, Context context, Set set) {
        this.f148906a = xvw0Var;
        this.f148907b = context;
        this.f148908c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ psv0 m169062a() throws Exception {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168160U4)).booleanValue()) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168259c5)).booleanValue()) {
                Set set = this.f148908c;
                if (!set.contains("rewarded")) {
                    if (!set.contains("interstitial")) {
                        if (!set.contains("native")) {
                        }
                    }
                }
            }
            return new psv0(bxy0.m106917a().mo144393g(this.f148907b));
        }
        return new psv0(null);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 27;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f148906a.mo155969R(new Callable() { // from class: l.nsv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f143546a.m169062a();
            }
        });
    }
}
