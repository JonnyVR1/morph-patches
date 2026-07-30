package p149l;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class blv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final m0t0 f76222a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f76223b;

    /* JADX INFO: renamed from: c */
    public final Context f76224c;

    public blv0(m0t0 m0t0Var, rmw0 rmw0Var, Context context) {
        this.f76222a = m0t0Var;
        this.f76223b = rmw0Var;
        this.f76224c = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ clv0 m102565a() throws Exception {
        if (!this.f76222a.m152537p(this.f76224c)) {
            return new clv0(null, null, null, null, null);
        }
        String strM152525d = this.f76222a.m152525d(this.f76224c);
        String str = strM152525d == null ? "" : strM152525d;
        String strM152523b = this.f76222a.m152523b(this.f76224c);
        String str2 = strM152523b == null ? "" : strM152523b;
        String strM152522a = this.f76222a.m152522a(this.f76224c);
        String str3 = strM152522a == null ? "" : strM152522a;
        Long l2 = null;
        String str4 = true != this.f76222a.m152537p(this.f76224c) ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l2 = (Long) d1s0.m109677c().m144697a(m7s0.f132222f0);
        }
        return new clv0(str, str2, str3, str4 == null ? "" : str4, l2);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 34;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f76223b.mo122102R(new Callable() { // from class: l.alv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f70521a.m102565a();
            }
        });
    }
}
