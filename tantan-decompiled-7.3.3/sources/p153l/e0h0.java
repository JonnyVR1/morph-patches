package p153l;

import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import tech.sud.base.utils.SudCustomCountdownTimer;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e0h0 extends SudCustomCountdownTimer {

    /* JADX INFO: renamed from: a */
    public final WeakReference f91463a;

    public e0h0(sgg0 sgg0Var) {
        super(60);
        this.f91463a = new WeakReference(sgg0Var);
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onFinish() {
        sgg0 sgg0Var = (sgg0) this.f91463a.get();
        if (sgg0Var == null || !sgg0Var.m185780h()) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - sgg0Var.f167868r) > Constants.ONE_MIN_IN_MILLIS) {
            LogUtils.file("SudDownloadTask", "download timeout");
            SudLogger.m222811d(sgg0.f167850u, "download timeout");
            sgg0Var.m185774b(-10302, "download timeout");
            ryg0 ryg0Var = sgg0Var.f167863m;
            if (ryg0Var != null) {
                ryg0Var.f165436b.clear();
            }
            sgg0Var.f167851a.m100399n();
            return;
        }
        e0h0 e0h0Var = sgg0Var.f167864n;
        if (e0h0Var != null) {
            e0h0Var.f91463a.clear();
            sgg0Var.f167864n.cancel();
            sgg0Var.f167864n = null;
        }
        e0h0 e0h0Var2 = new e0h0(sgg0Var);
        sgg0Var.f167864n = e0h0Var2;
        e0h0Var2.start();
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onTick(int i) {
    }
}
