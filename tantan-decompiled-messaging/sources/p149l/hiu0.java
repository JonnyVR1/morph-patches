package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class hiu0 implements Callable {

    /* JADX INFO: renamed from: a */
    public final z0r0 f107971a;

    /* JADX INFO: renamed from: b */
    public final dat0 f107972b;

    /* JADX INFO: renamed from: c */
    public final Context f107973c;

    /* JADX INFO: renamed from: d */
    public final rnu0 f107974d;

    /* JADX INFO: renamed from: e */
    public final p3w0 f107975e;

    /* JADX INFO: renamed from: f */
    public final z1v0 f107976f;

    /* JADX INFO: renamed from: g */
    public final Executor f107977g;

    /* JADX INFO: renamed from: h */
    public final ptr0 f107978h;

    /* JADX INFO: renamed from: i */
    public final zzcei f107979i;

    /* JADX INFO: renamed from: j */
    public final s5w0 f107980j;

    /* JADX INFO: renamed from: k */
    public final k2v0 f107981k;

    /* JADX INFO: renamed from: l */
    public final myv0 f107982l;

    public hiu0(Context context, Executor executor, ptr0 ptr0Var, zzcei zzceiVar, z0r0 z0r0Var, dat0 dat0Var, z1v0 z1v0Var, s5w0 s5w0Var, rnu0 rnu0Var, p3w0 p3w0Var, k2v0 k2v0Var, myv0 myv0Var) {
        this.f107973c = context;
        this.f107977g = executor;
        this.f107978h = ptr0Var;
        this.f107979i = zzceiVar;
        this.f107971a = z0r0Var;
        this.f107972b = dat0Var;
        this.f107976f = z1v0Var;
        this.f107980j = s5w0Var;
        this.f107974d = rnu0Var;
        this.f107975e = p3w0Var;
        this.f107981k = k2v0Var;
        this.f107982l = myv0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        kiu0 kiu0Var = new kiu0(this);
        kiu0Var.m146143h();
        return kiu0Var;
    }
}
