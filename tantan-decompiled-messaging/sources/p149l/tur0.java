package p149l;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C2200n;

/* JADX INFO: loaded from: classes6.dex */
public final class tur0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vur0 f172215b;

    public tur0(vur0 vur0Var, int i, boolean z) {
        this.f172215b = vur0Var;
        this.f172214a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2200n c2200nM207457a;
        int i = this.f172214a;
        vur0 vur0Var = this.f172215b;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = vur0Var.f183102a.getPackageManager().getPackageInfo(vur0Var.f183102a.getPackageName(), 0);
            Context context = vur0Var.f183102a;
            c2200nM207457a = x8w0.m207457a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            c2200nM207457a = null;
        }
        this.f172215b.f183111j = c2200nM207457a;
        if (this.f172214a < 4) {
            if (c2200nM207457a != null && c2200nM207457a.m12998v0() && !c2200nM207457a.m12996K0().equals("0000000000000000000000000000000000000000000000000000000000000000") && c2200nM207457a.m12999w0() && c2200nM207457a.m12994I0().m13193O() && c2200nM207457a.m12994I0().m13192L() != -2) {
                return;
            }
            this.f172215b.m200111o(this.f172214a + 1, true);
        }
    }
}
