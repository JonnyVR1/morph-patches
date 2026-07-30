package p153l;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class rjg0 extends eog0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference f163454b;

    public rjg0(tng0 tng0Var) {
        this.f163454b = new WeakReference(tng0Var);
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: a */
    public final void mo177302a(aug0 aug0Var, int i, Exception exc) {
        tng0 tng0Var = (tng0) this.f163454b.get();
        if (tng0Var == null) {
            SudLogger.m222819w(tng0.f175249m, "taskEnd error task is null");
            LogUtils.file("DownloadFileTask", "taskEnd error task is null");
            return;
        }
        LogUtils.file("DownloadFileTask", "taskEnd:" + tng0Var.f175253d + "  cause:" + ekg0.m121046a(i) + "  cancelCause:" + bjg0.m104623a(1) + "  realCause:" + LogUtils.getErrorInfo(exc));
        String str = tng0.f175249m;
        StringBuilder sb = new StringBuilder("taskEnd:");
        sb.append(tng0Var.f175253d);
        sb.append("  cause:");
        sb.append(ekg0.m121046a(i));
        sb.append("  cancelCause:");
        sb.append(bjg0.m104623a(1));
        SudLogger.m222811d(str, sb.toString());
        if (exc != null) {
            exc.printStackTrace();
        }
        String string = exc != null ? exc.toString() : null;
        if (string == null) {
            string = i == 3 ? "user cancel" : "EndCause:".concat(ekg0.m121046a(i));
        }
        if (i == 1) {
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE);
            LogUtils.file("DownloadFileTask", "checkMd5:" + tng0Var.f175253d);
            SudLogger.m222811d(str, "checkMd5:" + tng0Var.f175253d);
            File fileM100397j = aug0Var.m100397j();
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED);
            String absolutePath = fileM100397j == null ? "" : fileM100397j.getAbsolutePath();
            ArrayList arrayList = tng0Var.f175254e;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((wfg0) obj).mo154723f(absolutePath, tng0Var.f175258i, null, tng0Var.f175257h);
            }
            return;
        }
        if (i != 3) {
            tng0Var.m191885a(oeg0.m167366a(exc), string);
            return;
        }
        int iM174221a = pxg0.m174221a(1);
        if (iM174221a == 0) {
            tng0Var.m191885a(-10101, "retry download fail. unknown cancel");
            return;
        }
        if (iM174221a == 2) {
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_PAUSE);
            tng0Var.m191885a(-1, "pause cancel");
        } else if (iM174221a != 3) {
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
            tng0Var.m191885a(-1, "unknown cancel");
        } else {
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_WAITING);
            tng0Var.m191885a(-1, "hang up cancel");
        }
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: b */
    public final void mo177303b(bog0 bog0Var) {
        bog0Var.m105679c();
        tng0 tng0Var = (tng0) this.f163454b.get();
        if (tng0Var != null) {
            tng0Var.f175258i = bog0Var.m105679c();
            tng0Var.f175259j = bog0Var.m105681e();
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING);
            LogUtils.file("DownloadFileTask", "infoReady mgId:" + tng0Var.f175261l);
        }
    }

    @Override // p153l.vjg0
    /* JADX INFO: renamed from: c */
    public final void mo169860c(aug0 aug0Var) {
        tng0 tng0Var = (tng0) this.f163454b.get();
        if (tng0Var != null) {
            ArrayList arrayList = tng0Var.f175254e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wfg0) obj).mo154718a();
            }
            LogUtils.file("DownloadFileTask", "taskStart mgId:" + tng0Var.f175261l);
        }
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: d */
    public final void mo177304d(long j) {
        tng0 tng0Var = (tng0) this.f163454b.get();
        if (tng0Var != null) {
            tng0Var.f175259j = j;
            long j2 = tng0Var.f175258i;
            ArrayList arrayList = tng0Var.f175254e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wfg0) obj).mo154721d(j, j2);
            }
            tng0Var.m191886b(PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING);
            SudLogger.m222811d(tng0.f175249m, " 进度：" + j + "/" + tng0Var.f175258i);
            LogUtils.file("DownloadFileTask", " 进度：" + j + "/" + tng0Var.f175258i);
        }
    }
}
