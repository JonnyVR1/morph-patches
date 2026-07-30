package p153l;

import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.appset.C2328a;

/* JADX INFO: loaded from: classes6.dex */
public final class ryx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2328a f165475a;

    public /* synthetic */ ryx0(C2328a c2328a, vtx0 vtx0Var) {
        this.f165475a = c2328a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jM13810b = this.f165475a.m13810b();
        if (jM13810b == -1 || DefaultClock.getInstance().currentTimeMillis() <= jM13810b) {
            return;
        }
        C2328a.m13806f(this.f165475a.f10271a);
    }
}
