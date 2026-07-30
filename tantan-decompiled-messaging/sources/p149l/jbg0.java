package p149l;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jbg0 extends wfg0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference f117191b;

    public jbg0(lfg0 lfg0Var) {
        this.f117191b = new WeakReference(lfg0Var);
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: a */
    public final void mo135981a(slg0 slg0Var, int i, Exception exc) {
        lfg0 lfg0Var = (lfg0) this.f117191b.get();
        if (lfg0Var == null) {
            SudLogger.m221573w(lfg0.f127872m, "taskEnd error task is null");
            LogUtils.file("DownloadFileTask", "taskEnd error task is null");
            return;
        }
        LogUtils.file("DownloadFileTask", "taskEnd:" + lfg0Var.f127876d + "  cause:" + wbg0.m202535a(i) + "  cancelCause:" + tag0.m187722a(1) + "  realCause:" + LogUtils.getErrorInfo(exc));
        String str = lfg0.f127872m;
        StringBuilder sb = new StringBuilder("taskEnd:");
        sb.append(lfg0Var.f127876d);
        sb.append("  cause:");
        sb.append(wbg0.m202535a(i));
        sb.append("  cancelCause:");
        sb.append(tag0.m187722a(1));
        SudLogger.m221565d(str, sb.toString());
        if (exc != null) {
            exc.printStackTrace();
        }
        String string = exc != null ? exc.toString() : null;
        if (string == null) {
            string = i == 3 ? "user cancel" : "EndCause:".concat(wbg0.m202535a(i));
        }
        if (i == 1) {
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE);
            LogUtils.file("DownloadFileTask", "checkMd5:" + lfg0Var.f127876d);
            SudLogger.m221565d(str, "checkMd5:" + lfg0Var.f127876d);
            File fileM184802j = slg0Var.m184802j();
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED);
            String absolutePath = fileM184802j == null ? "" : fileM184802j.getAbsolutePath();
            ArrayList arrayList = lfg0Var.f127877e;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((o7g0) obj).mo111017f(absolutePath, lfg0Var.f127881i, null, lfg0Var.f127880h);
            }
            return;
        }
        if (i != 3) {
            lfg0Var.m149678a(g6g0.m124589a(exc), string);
            return;
        }
        int iM132337a = hpg0.m132337a(1);
        if (iM132337a == 0) {
            lfg0Var.m149678a(-10101, "retry download fail. unknown cancel");
            return;
        }
        if (iM132337a == 2) {
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_PAUSE);
            lfg0Var.m149678a(-1, "pause cancel");
        } else if (iM132337a != 3) {
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
            lfg0Var.m149678a(-1, "unknown cancel");
        } else {
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_WAITING);
            lfg0Var.m149678a(-1, "hang up cancel");
        }
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: b */
    public final void mo135982b(tfg0 tfg0Var) {
        tfg0Var.m188707c();
        lfg0 lfg0Var = (lfg0) this.f117191b.get();
        if (lfg0Var != null) {
            lfg0Var.f127881i = tfg0Var.m188707c();
            lfg0Var.f127882j = tfg0Var.m188709e();
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING);
            LogUtils.file("DownloadFileTask", "infoReady mgId:" + lfg0Var.f127884l);
        }
    }

    @Override // p149l.nbg0
    /* JADX INFO: renamed from: c */
    public final void mo127588c(slg0 slg0Var) {
        lfg0 lfg0Var = (lfg0) this.f117191b.get();
        if (lfg0Var != null) {
            ArrayList arrayList = lfg0Var.f127877e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o7g0) obj).mo111012a();
            }
            LogUtils.file("DownloadFileTask", "taskStart mgId:" + lfg0Var.f127884l);
        }
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: d */
    public final void mo135983d(long j) {
        lfg0 lfg0Var = (lfg0) this.f117191b.get();
        if (lfg0Var != null) {
            lfg0Var.f127882j = j;
            long j2 = lfg0Var.f127881i;
            ArrayList arrayList = lfg0Var.f127877e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o7g0) obj).mo111015d(j, j2);
            }
            lfg0Var.m149679b(PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING);
            SudLogger.m221565d(lfg0.f127872m, " 进度：" + j + "/" + lfg0Var.f127881i);
            LogUtils.file("DownloadFileTask", " 进度：" + j + "/" + lfg0Var.f127881i);
        }
    }
}
