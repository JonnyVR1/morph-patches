package p149l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class gav0 implements gpv0 {

    /* JADX INFO: renamed from: a */
    public final axt0 f101707a;

    /* JADX INFO: renamed from: b */
    public final byt0 f101708b;

    /* JADX INFO: renamed from: c */
    public final c7u0 f101709c;

    /* JADX INFO: renamed from: d */
    public final u6u0 f101710d;

    /* JADX INFO: renamed from: e */
    public final bmt0 f101711e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f101712f = new AtomicBoolean(false);

    public gav0(axt0 axt0Var, byt0 byt0Var, c7u0 c7u0Var, u6u0 u6u0Var, bmt0 bmt0Var) {
        this.f101707a = axt0Var;
        this.f101708b = byt0Var;
        this.f101709c = c7u0Var;
        this.f101710d = u6u0Var;
        this.f101711e = bmt0Var;
    }

    @Override // p149l.gpv0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo125035a(View view) {
        if (this.f101712f.compareAndSet(false, true)) {
            this.f101711e.mo95459a();
            this.f101710d.m192029w0(view);
        }
    }

    @Override // p149l.gpv0
    public final void zzb() {
        if (this.f101712f.get()) {
            this.f101707a.onAdClicked();
        }
    }

    @Override // p149l.gpv0
    public final void zzc() {
        if (this.f101712f.get()) {
            this.f101708b.zza();
            this.f101709c.zza();
        }
    }
}
