package p149l;

import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import tech.sud.base.utils.SudCustomCountdownTimer;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class wrg0 extends SudCustomCountdownTimer {

    /* JADX INFO: renamed from: a */
    public final WeakReference f187795a;

    public wrg0(k8g0 k8g0Var) {
        super(60);
        this.f187795a = new WeakReference(k8g0Var);
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onFinish() {
        k8g0 k8g0Var = (k8g0) this.f187795a.get();
        if (k8g0Var == null || !k8g0Var.m144942h()) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - k8g0Var.f121829r) > Constants.ONE_MIN_IN_MILLIS) {
            LogUtils.file("SudDownloadTask", "download timeout");
            SudLogger.m221565d(k8g0.f121811u, "download timeout");
            k8g0Var.m144936b(-10302, "download timeout");
            jqg0 jqg0Var = k8g0Var.f121824m;
            if (jqg0Var != null) {
                jqg0Var.f119279b.clear();
            }
            k8g0Var.f121812a.m184804n();
            return;
        }
        wrg0 wrg0Var = k8g0Var.f121825n;
        if (wrg0Var != null) {
            wrg0Var.f187795a.clear();
            k8g0Var.f121825n.cancel();
            k8g0Var.f121825n = null;
        }
        wrg0 wrg0Var2 = new wrg0(k8g0Var);
        k8g0Var.f121825n = wrg0Var2;
        wrg0Var2.start();
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onTick(int i) {
    }
}
