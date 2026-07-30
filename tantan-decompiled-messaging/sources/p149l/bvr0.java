package p149l;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes6.dex */
public final class bvr0 implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dvr0 f77488a;

    public bvr0(dvr0 dvr0Var) {
        this.f77488a = dvr0Var;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        dvr0 dvr0Var = this.f77488a;
        if (z) {
            dvr0Var.f88095a = System.currentTimeMillis();
            this.f77488a.f88098d = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (dvr0Var.f88096b > 0) {
            dvr0 dvr0Var2 = this.f77488a;
            if (jCurrentTimeMillis >= dvr0Var2.f88096b) {
                dvr0Var2.f88097c = jCurrentTimeMillis - dvr0Var2.f88096b;
            }
        }
        this.f77488a.f88098d = false;
    }
}
