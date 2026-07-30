package p153l;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes6.dex */
public final class h4s0 implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j4s0 f107826a;

    public h4s0(j4s0 j4s0Var) {
        this.f107826a = j4s0Var;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        j4s0 j4s0Var = this.f107826a;
        if (z) {
            j4s0Var.f118323a = System.currentTimeMillis();
            this.f107826a.f118326d = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j4s0Var.f118324b > 0) {
            j4s0 j4s0Var2 = this.f107826a;
            if (jCurrentTimeMillis >= j4s0Var2.f118324b) {
                j4s0Var2.f118325c = jCurrentTimeMillis - j4s0Var2.f118324b;
            }
        }
        this.f107826a.f118326d = false;
    }
}
