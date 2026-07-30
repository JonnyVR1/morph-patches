package p153l;

import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import tech.sud.base.utils.SudCustomCountdownTimer;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class crg0 extends SudCustomCountdownTimer {

    /* JADX INFO: renamed from: a */
    public final WeakReference f83322a;

    public crg0(tng0 tng0Var) {
        super(60);
        this.f83322a = new WeakReference(tng0Var);
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onFinish() {
        tng0 tng0Var = (tng0) this.f83322a.get();
        if (tng0Var != null) {
            PkgDownloadStatus pkgDownloadStatus = tng0Var.f175253d;
            if (pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_STARTED || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
                if (Math.abs(System.currentTimeMillis() - tng0Var.f175260k) > Constants.ONE_MIN_IN_MILLIS) {
                    LogUtils.file("DownloadFileTask", "download timeout");
                    SudLogger.m222811d(tng0.f175249m, "download timeout");
                    tng0Var.m191885a(-10302, "download timeout");
                    rjg0 rjg0Var = tng0Var.f175255f;
                    if (rjg0Var != null) {
                        rjg0Var.f163454b.clear();
                    }
                    tng0Var.f175250a.m100399n();
                    return;
                }
                crg0 crg0Var = tng0Var.f175256g;
                if (crg0Var != null) {
                    crg0Var.f83322a.clear();
                    tng0Var.f175256g.cancel();
                    tng0Var.f175256g = null;
                }
                crg0 crg0Var2 = new crg0(tng0Var);
                tng0Var.f175256g = crg0Var2;
                crg0Var2.start();
            }
        }
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onTick(int i) {
    }
}
