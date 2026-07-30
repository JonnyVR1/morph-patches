package p149l;

import com.clevertap.android.sdk.Constants;
import java.lang.ref.WeakReference;
import tech.sud.base.utils.SudCustomCountdownTimer;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class uig0 extends SudCustomCountdownTimer {

    /* JADX INFO: renamed from: a */
    public final WeakReference f176653a;

    public uig0(lfg0 lfg0Var) {
        super(60);
        this.f176653a = new WeakReference(lfg0Var);
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onFinish() {
        lfg0 lfg0Var = (lfg0) this.f176653a.get();
        if (lfg0Var != null) {
            PkgDownloadStatus pkgDownloadStatus = lfg0Var.f127876d;
            if (pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_STARTED || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
                if (Math.abs(System.currentTimeMillis() - lfg0Var.f127883k) > Constants.ONE_MIN_IN_MILLIS) {
                    LogUtils.file("DownloadFileTask", "download timeout");
                    SudLogger.m221565d(lfg0.f127872m, "download timeout");
                    lfg0Var.m149678a(-10302, "download timeout");
                    jbg0 jbg0Var = lfg0Var.f127878f;
                    if (jbg0Var != null) {
                        jbg0Var.f117191b.clear();
                    }
                    lfg0Var.f127873a.m184804n();
                    return;
                }
                uig0 uig0Var = lfg0Var.f127879g;
                if (uig0Var != null) {
                    uig0Var.f176653a.clear();
                    lfg0Var.f127879g.cancel();
                    lfg0Var.f127879g = null;
                }
                uig0 uig0Var2 = new uig0(lfg0Var);
                lfg0Var.f127879g = uig0Var2;
                uig0Var2.start();
            }
        }
    }

    @Override // tech.sud.base.utils.SudCustomCountdownTimer
    public final void onTick(int i) {
    }
}
