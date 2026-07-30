package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class r3u0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f161082a;

    /* JADX INFO: renamed from: b */
    public final kqx0 f161083b;

    /* JADX INFO: renamed from: c */
    public final kqx0 f161084c;

    public r3u0(kqx0 kqx0Var, kqx0 kqx0Var2, kqx0 kqx0Var3) {
        this.f161082a = kqx0Var;
        this.f161083b = kqx0Var2;
        this.f161084c = kqx0Var3;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f161082a.zzb();
        final zzcei zzceiVarM201659a = ((vlt0) this.f161083b).m201659a();
        final o7w0 o7w0VarM218742a = ((z5u0) this.f161084c).m218742a();
        return new eow0() { // from class: l.q3u0
            @Override // p153l.eow0
            public final Object apply(Object obj) {
                q6w0 q6w0Var = (q6w0) obj;
                c1s0 c1s0Var = new c1s0(context);
                c1s0Var.m107653p(q6w0Var.f155849C);
                c1s0Var.m107654q(q6w0Var.f155850D.toString());
                c1s0Var.m107652o(zzceiVarM201659a.zza);
                c1s0Var.m107651n(o7w0VarM218742a.f145320f);
                return c1s0Var;
            }
        };
    }
}
