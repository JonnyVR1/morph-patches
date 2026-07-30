package p149l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jqg0 extends wfg0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference f119279b;

    public jqg0(k8g0 k8g0Var) {
        this.f119279b = new WeakReference(k8g0Var);
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: a */
    public final void mo135981a(slg0 slg0Var, int i, Exception exc) {
        k8g0 k8g0Var = (k8g0) this.f119279b.get();
        if (k8g0Var != null) {
            LogUtils.file("SudDownloadTask", "taskEnd:" + k8g0Var.f121819h + "  :mgId:" + k8g0Var.f121813b + "  cause:" + wbg0.m202535a(i) + "  cancelCause:" + tag0.m187722a(k8g0Var.f121817f) + "  realCause:" + LogUtils.getErrorInfo(exc));
            String str = k8g0.f121811u;
            StringBuilder sb = new StringBuilder("taskEnd:");
            sb.append(k8g0Var.f121819h);
            sb.append("  :mgId:");
            sb.append(k8g0Var.f121813b);
            sb.append("  cause:");
            sb.append(wbg0.m202535a(i));
            sb.append("  cancelCause:");
            sb.append(tag0.m187722a(k8g0Var.f121817f));
            SudLogger.m221565d(str, sb.toString());
            if (exc != null) {
                exc.printStackTrace();
            }
            String string = exc != null ? exc.toString() : null;
            if (string == null) {
                string = i == 3 ? "user cancel" : "EndCause:".concat(wbg0.m202535a(i));
            }
            if (i == 1) {
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE;
                k8g0Var.f121819h = pkgDownloadStatus;
                k8g0Var.f121829r = System.currentTimeMillis();
                k8g0Var.m144938d(pkgDownloadStatus);
                LogUtils.file("SudDownloadTask", "checkMd5:" + k8g0Var.f121819h + "  :mgId:" + k8g0Var.f121813b);
                SudLogger.m221565d(str, "checkMd5:" + k8g0Var.f121819h + "  :mgId:" + k8g0Var.f121813b);
                yng0.m215410b(slg0Var.m184802j(), k8g0Var.f121818g.f102898f, new hng0(k8g0Var));
            } else if (i == 3) {
                int iM132337a = hpg0.m132337a(k8g0Var.f121817f);
                if (iM132337a == 0) {
                    k8g0Var.f121830s++;
                    LogUtils.file("SudDownloadTask", "unknown cancel:" + k8g0Var.f121830s);
                    SudLogger.m221565d(str, "unknown cancel:" + k8g0Var.f121830s);
                    if (k8g0Var.f121830s >= k8g0Var.f121831t) {
                        LogUtils.file("SudDownloadTask", "unknown cancel callback fail");
                        SudLogger.m221565d(str, "unknown cancel callback fail");
                        k8g0Var.m144936b(-10101, "retry download fail. unknown cancel");
                    } else {
                        LogUtils.file("SudDownloadTask", "unknown cancel retry download");
                        SudLogger.m221565d(str, "unknown cancel retry download");
                        PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                        k8g0Var.f121819h = pkgDownloadStatus2;
                        k8g0Var.f121829r = System.currentTimeMillis();
                        k8g0Var.m144938d(pkgDownloadStatus2);
                    }
                } else if (iM132337a == 2) {
                    PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_PAUSE;
                    k8g0Var.f121819h = pkgDownloadStatus3;
                    k8g0Var.f121829r = System.currentTimeMillis();
                    k8g0Var.m144938d(pkgDownloadStatus3);
                } else if (iM132337a != 3) {
                    PkgDownloadStatus pkgDownloadStatus4 = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
                    k8g0Var.f121819h = pkgDownloadStatus4;
                    k8g0Var.f121829r = System.currentTimeMillis();
                    k8g0Var.m144938d(pkgDownloadStatus4);
                    k8g0Var.m144935a();
                } else {
                    PkgDownloadStatus pkgDownloadStatus5 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                    k8g0Var.f121819h = pkgDownloadStatus5;
                    k8g0Var.f121829r = System.currentTimeMillis();
                    k8g0Var.m144938d(pkgDownloadStatus5);
                }
            } else {
                k8g0Var.m144936b(g6g0.m124589a(exc), string);
            }
            c6g0 c6g0Var = (c6g0) k8g0Var.f121822k.get();
            if (c6g0Var != null) {
                ((vqg0) c6g0Var).f182648a.m187554c();
            }
        }
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: b */
    public final void mo135982b(tfg0 tfg0Var) {
        tfg0Var.m188707c();
        k8g0 k8g0Var = (k8g0) this.f119279b.get();
        if (k8g0Var != null) {
            k8g0Var.f121827p = tfg0Var.m188707c();
            k8g0Var.f121828q = tfg0Var.m188709e();
            PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING;
            k8g0Var.f121819h = pkgDownloadStatus;
            k8g0Var.f121829r = System.currentTimeMillis();
            k8g0Var.m144938d(pkgDownloadStatus);
            LogUtils.file("SudDownloadTask", "infoReady mgId:" + k8g0Var.f121813b);
        }
    }

    @Override // p149l.nbg0
    /* JADX INFO: renamed from: c */
    public final void mo127588c(slg0 slg0Var) {
        k8g0 k8g0Var = (k8g0) this.f119279b.get();
        if (k8g0Var != null) {
            ArrayList arrayList = k8g0Var.f121823l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o7g0) obj).mo111012a();
            }
            LogUtils.file("SudDownloadTask", "taskStart mgId:" + k8g0Var.f121813b);
        }
    }

    @Override // p149l.igg0
    /* JADX INFO: renamed from: d */
    public final void mo135983d(long j) {
        k8g0 k8g0Var = (k8g0) this.f119279b.get();
        if (k8g0Var != null) {
            k8g0Var.f121828q = j;
            long j2 = k8g0Var.f121827p;
            ArrayList arrayList = k8g0Var.f121823l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((o7g0) obj).mo111015d(j, j2);
            }
            PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING;
            k8g0Var.f121819h = pkgDownloadStatus;
            k8g0Var.f121829r = System.currentTimeMillis();
            k8g0Var.m144938d(pkgDownloadStatus);
            SudLogger.m221565d(k8g0.f121811u, "progress mgId:" + k8g0Var.f121813b + " 进度：" + j + "/" + k8g0Var.f121827p);
            LogUtils.file("SudDownloadTask", "progress mgId:" + k8g0Var.f121813b + " 进度：" + j + "/" + k8g0Var.f121827p);
        }
    }
}
