package p149l;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ijv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f113613a;

    /* JADX INFO: renamed from: b */
    public final Context f113614b;

    /* JADX INFO: renamed from: c */
    public final Set f113615c;

    public ijv0(rmw0 rmw0Var, Context context, Set set) {
        this.f113613a = rmw0Var;
        this.f113614b = context;
        this.f113615c = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L16;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ p149l.jjv0 m136752a() throws java.lang.Exception {
        /*
            r2 = this;
            l.x6s0 r0 = p149l.m7s0.f132089U4
            l.k7s0 r1 = p149l.d1s0.m109677c()
            java.lang.Object r0 = r1.m144697a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            l.x6s0 r0 = p149l.m7s0.f132188c5
            l.k7s0 r1 = p149l.d1s0.m109677c()
            java.lang.Object r0 = r1.m144697a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r2.f113615c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L56
        L46:
            android.content.Context r2 = r2.f113614b
            l.jjv0 r0 = new l.jjv0
            l.e3v0 r1 = p149l.vny0.m199063a()
            java.lang.String r2 = r1.mo109958g(r2)
            r0.<init>(r2)
            return r0
        L56:
            l.jjv0 r2 = new l.jjv0
            r0 = 0
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ijv0.m136752a():l.jjv0");
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 27;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f113613a.mo122102R(new Callable() { // from class: l.hjv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f108127a.m136752a();
            }
        });
    }
}
