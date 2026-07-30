package p153l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class mjv0 implements myv0 {

    /* JADX INFO: renamed from: a */
    public final g6u0 f137163a;

    /* JADX INFO: renamed from: b */
    public final h7u0 f137164b;

    /* JADX INFO: renamed from: c */
    public final igu0 f137165c;

    /* JADX INFO: renamed from: d */
    public final agu0 f137166d;

    /* JADX INFO: renamed from: e */
    public final hvt0 f137167e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f137168f = new AtomicBoolean(false);

    public mjv0(g6u0 g6u0Var, h7u0 h7u0Var, igu0 igu0Var, agu0 agu0Var, hvt0 hvt0Var) {
        this.f137163a = g6u0Var;
        this.f137164b = h7u0Var;
        this.f137165c = igu0Var;
        this.f137166d = agu0Var;
        this.f137167e = hvt0Var;
    }

    @Override // p153l.myv0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo98626a(View view) {
        if (this.f137168f.compareAndSet(false, true)) {
            this.f137167e.mo106809a();
            this.f137166d.m97733w0(view);
        }
    }

    @Override // p153l.myv0
    public final void zzb() {
        if (this.f137168f.get()) {
            this.f137163a.onAdClicked();
        }
    }

    @Override // p153l.myv0
    public final void zzc() {
        if (this.f137168f.get()) {
            this.f137164b.zza();
            this.f137165c.zza();
        }
    }
}
