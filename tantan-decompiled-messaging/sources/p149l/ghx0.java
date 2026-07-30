package p149l;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ghx0 extends jyb {

    /* JADX INFO: renamed from: b */
    public final WeakReference f102828b;

    public ghx0(v8s0 v8s0Var) {
        this.f102828b = new WeakReference(v8s0Var);
    }

    @Override // p149l.jyb
    /* JADX INFO: renamed from: a */
    public final void mo114048a(ComponentName componentName, gyb gybVar) {
        v8s0 v8s0Var = (v8s0) this.f102828b.get();
        if (v8s0Var != null) {
            v8s0Var.m197517c(gybVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v8s0 v8s0Var = (v8s0) this.f102828b.get();
        if (v8s0Var != null) {
            v8s0Var.m197518d();
        }
    }
}
