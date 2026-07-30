package p153l;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class x2w0 implements gaw0 {

    /* JADX INFO: renamed from: a */
    public final x3w0 f192200a;

    /* JADX INFO: renamed from: b */
    public final z3w0 f192201b;

    /* JADX INFO: renamed from: c */
    public final zzl f192202c;

    /* JADX INFO: renamed from: d */
    public final String f192203d;

    /* JADX INFO: renamed from: e */
    public final Executor f192204e;

    /* JADX INFO: renamed from: f */
    public final zzw f192205f;

    /* JADX INFO: renamed from: g */
    public final v9w0 f192206g;

    public x2w0(x3w0 x3w0Var, z3w0 z3w0Var, zzl zzlVar, String str, Executor executor, zzw zzwVar, v9w0 v9w0Var) {
        this.f192200a = x3w0Var;
        this.f192201b = z3w0Var;
        this.f192202c = zzlVar;
        this.f192203d = str;
        this.f192204e = executor;
        this.f192205f = zzwVar;
        this.f192206g = v9w0Var;
    }

    @Override // p153l.gaw0
    public final v9w0 zza() {
        return this.f192206g;
    }

    @Override // p153l.gaw0
    public final Executor zzb() {
        return this.f192204e;
    }
}
