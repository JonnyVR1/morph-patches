package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class rav0 implements gpv0 {

    /* JADX INFO: renamed from: a */
    public gpv0 f158563a;

    @Override // p149l.gpv0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo125035a(View view) {
        gpv0 gpv0Var = this.f158563a;
        if (gpv0Var != null) {
            gpv0Var.mo125035a(view);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m178537b(gpv0 gpv0Var) {
        this.f158563a = gpv0Var;
    }

    @Override // p149l.gpv0
    public final synchronized void zzb() {
        gpv0 gpv0Var = this.f158563a;
        if (gpv0Var != null) {
            gpv0Var.zzb();
        }
    }

    @Override // p149l.gpv0
    public final synchronized void zzc() {
        gpv0 gpv0Var = this.f158563a;
        if (gpv0Var != null) {
            gpv0Var.zzc();
        }
    }
}
