package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C2223n;

/* JADX INFO: loaded from: classes6.dex */
public final class z3s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b4s0 f202858b;

    public z3s0(b4s0 b4s0Var, int i, boolean z) {
        this.f202858b = b4s0Var;
        this.f202857a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2223n c2223nM116005a;
        int i = this.f202857a;
        b4s0 b4s0Var = this.f202858b;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = b4s0Var.f74969a.getPackageManager().getPackageInfo(b4s0Var.f74969a.getPackageName(), 0);
            Context context = b4s0Var.f74969a;
            c2223nM116005a = diw0.m116005a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            c2223nM116005a = null;
        }
        this.f202858b.f74978j = c2223nM116005a;
        if (this.f202857a < 4) {
            if (c2223nM116005a != null && c2223nM116005a.m13052v0() && !c2223nM116005a.m13050K0().equals("0000000000000000000000000000000000000000000000000000000000000000") && c2223nM116005a.m13053w0() && c2223nM116005a.m13048I0().m13247O() && c2223nM116005a.m13048I0().m13246L() != -2) {
                return;
            }
            this.f202858b.m102527o(this.f202857a + 1, true);
        }
    }
}
