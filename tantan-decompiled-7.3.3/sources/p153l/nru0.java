package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class nru0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final far0 f143432a;

    /* JADX INFO: renamed from: b */
    public final jjt0 f143433b;

    /* JADX INFO: renamed from: c */
    public final Context f143434c;

    /* JADX INFO: renamed from: d */
    public final xwu0 f143435d;

    /* JADX INFO: renamed from: e */
    public final vcw0 f143436e;

    /* JADX INFO: renamed from: f */
    public final fbv0 f143437f;

    /* JADX INFO: renamed from: g */
    public final Executor f143438g;

    /* JADX INFO: renamed from: h */
    public final v2s0 f143439h;

    /* JADX INFO: renamed from: i */
    public final zzcei f143440i;

    /* JADX INFO: renamed from: j */
    public final yew0 f143441j;

    /* JADX INFO: renamed from: k */
    public final qbv0 f143442k;

    /* JADX INFO: renamed from: l */
    public final s7w0 f143443l;

    public nru0(Context context, Executor executor, v2s0 v2s0Var, zzcei zzceiVar, far0 far0Var, jjt0 jjt0Var, fbv0 fbv0Var, yew0 yew0Var, xwu0 xwu0Var, vcw0 vcw0Var, qbv0 qbv0Var, s7w0 s7w0Var) {
        this.f143434c = context;
        this.f143438g = executor;
        this.f143439h = v2s0Var;
        this.f143440i = zzceiVar;
        this.f143432a = far0Var;
        this.f143433b = jjt0Var;
        this.f143437f = fbv0Var;
        this.f143441j = yew0Var;
        this.f143435d = xwu0Var;
        this.f143436e = vcw0Var;
        this.f143442k = qbv0Var;
        this.f143443l = s7w0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        qru0 qru0Var = new qru0(this);
        qru0Var.m177706h();
        return qru0Var;
    }
}
