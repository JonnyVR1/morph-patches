package p153l;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class mqx0 extends xzb {

    /* JADX INFO: renamed from: b */
    public final WeakReference f138282b;

    public mqx0(bis0 bis0Var) {
        this.f138282b = new WeakReference(bis0Var);
    }

    @Override // p153l.xzb
    /* JADX INFO: renamed from: a */
    public final void mo159617a(ComponentName componentName, uzb uzbVar) {
        bis0 bis0Var = (bis0) this.f138282b.get();
        if (bis0Var != null) {
            bis0Var.m104512c(uzbVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        bis0 bis0Var = (bis0) this.f138282b.get();
        if (bis0Var != null) {
            bis0Var.m104513d();
        }
    }
}
