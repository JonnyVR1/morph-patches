package p153l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ryg0 extends eog0 {

    /* JADX INFO: renamed from: b */
    public final WeakReference f165436b;

    public ryg0(sgg0 sgg0Var) {
        this.f165436b = new WeakReference(sgg0Var);
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: a */
    public final void mo177302a(aug0 aug0Var, int i, Exception exc) {
        sgg0 sgg0Var = (sgg0) this.f165436b.get();
        if (sgg0Var != null) {
            LogUtils.file("SudDownloadTask", "taskEnd:" + sgg0Var.f167858h + "  :mgId:" + sgg0Var.f167852b + "  cause:" + ekg0.m121046a(i) + "  cancelCause:" + bjg0.m104623a(sgg0Var.f167856f) + "  realCause:" + LogUtils.getErrorInfo(exc));
            String str = sgg0.f167850u;
            StringBuilder sb = new StringBuilder("taskEnd:");
            sb.append(sgg0Var.f167858h);
            sb.append("  :mgId:");
            sb.append(sgg0Var.f167852b);
            sb.append("  cause:");
            sb.append(ekg0.m121046a(i));
            sb.append("  cancelCause:");
            sb.append(bjg0.m104623a(sgg0Var.f167856f));
            SudLogger.m222811d(str, sb.toString());
            if (exc != null) {
                exc.printStackTrace();
            }
            String string = exc != null ? exc.toString() : null;
            if (string == null) {
                string = i == 3 ? "user cancel" : "EndCause:".concat(ekg0.m121046a(i));
            }
            if (i == 1) {
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE;
                sgg0Var.f167858h = pkgDownloadStatus;
                sgg0Var.f167868r = System.currentTimeMillis();
                sgg0Var.m185776d(pkgDownloadStatus);
                LogUtils.file("SudDownloadTask", "checkMd5:" + sgg0Var.f167858h + "  :mgId:" + sgg0Var.f167852b);
                SudLogger.m222811d(str, "checkMd5:" + sgg0Var.f167858h + "  :mgId:" + sgg0Var.f167852b);
                gwg0.m132684b(aug0Var.m100397j(), sgg0Var.f167857g.f148593f, new pvg0(sgg0Var));
            } else if (i == 3) {
                int iM174221a = pxg0.m174221a(sgg0Var.f167856f);
                if (iM174221a == 0) {
                    sgg0Var.f167869s++;
                    LogUtils.file("SudDownloadTask", "unknown cancel:" + sgg0Var.f167869s);
                    SudLogger.m222811d(str, "unknown cancel:" + sgg0Var.f167869s);
                    if (sgg0Var.f167869s >= sgg0Var.f167870t) {
                        LogUtils.file("SudDownloadTask", "unknown cancel callback fail");
                        SudLogger.m222811d(str, "unknown cancel callback fail");
                        sgg0Var.m185774b(-10101, "retry download fail. unknown cancel");
                    } else {
                        LogUtils.file("SudDownloadTask", "unknown cancel retry download");
                        SudLogger.m222811d(str, "unknown cancel retry download");
                        PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                        sgg0Var.f167858h = pkgDownloadStatus2;
                        sgg0Var.f167868r = System.currentTimeMillis();
                        sgg0Var.m185776d(pkgDownloadStatus2);
                    }
                } else if (iM174221a == 2) {
                    PkgDownloadStatus pkgDownloadStatus3 = PkgDownloadStatus.PKG_DOWNLOAD_PAUSE;
                    sgg0Var.f167858h = pkgDownloadStatus3;
                    sgg0Var.f167868r = System.currentTimeMillis();
                    sgg0Var.m185776d(pkgDownloadStatus3);
                } else if (iM174221a != 3) {
                    PkgDownloadStatus pkgDownloadStatus4 = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
                    sgg0Var.f167858h = pkgDownloadStatus4;
                    sgg0Var.f167868r = System.currentTimeMillis();
                    sgg0Var.m185776d(pkgDownloadStatus4);
                    sgg0Var.m185773a();
                } else {
                    PkgDownloadStatus pkgDownloadStatus5 = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;
                    sgg0Var.f167858h = pkgDownloadStatus5;
                    sgg0Var.f167868r = System.currentTimeMillis();
                    sgg0Var.m185776d(pkgDownloadStatus5);
                }
            } else {
                sgg0Var.m185774b(oeg0.m167366a(exc), string);
            }
            keg0 keg0Var = (keg0) sgg0Var.f167861k.get();
            if (keg0Var != null) {
                ((dzg0) keg0Var).f91357a.m104343c();
            }
        }
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: b */
    public final void mo177303b(bog0 bog0Var) {
        bog0Var.m105679c();
        sgg0 sgg0Var = (sgg0) this.f165436b.get();
        if (sgg0Var != null) {
            sgg0Var.f167866p = bog0Var.m105679c();
            sgg0Var.f167867q = bog0Var.m105681e();
            PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING;
            sgg0Var.f167858h = pkgDownloadStatus;
            sgg0Var.f167868r = System.currentTimeMillis();
            sgg0Var.m185776d(pkgDownloadStatus);
            LogUtils.file("SudDownloadTask", "infoReady mgId:" + sgg0Var.f167852b);
        }
    }

    @Override // p153l.vjg0
    /* JADX INFO: renamed from: c */
    public final void mo169860c(aug0 aug0Var) {
        sgg0 sgg0Var = (sgg0) this.f165436b.get();
        if (sgg0Var != null) {
            ArrayList arrayList = sgg0Var.f167862l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wfg0) obj).mo154718a();
            }
            LogUtils.file("SudDownloadTask", "taskStart mgId:" + sgg0Var.f167852b);
        }
    }

    @Override // p153l.qog0
    /* JADX INFO: renamed from: d */
    public final void mo177304d(long j) {
        sgg0 sgg0Var = (sgg0) this.f165436b.get();
        if (sgg0Var != null) {
            sgg0Var.f167867q = j;
            long j2 = sgg0Var.f167866p;
            ArrayList arrayList = sgg0Var.f167862l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((wfg0) obj).mo154721d(j, j2);
            }
            PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING;
            sgg0Var.f167858h = pkgDownloadStatus;
            sgg0Var.f167868r = System.currentTimeMillis();
            sgg0Var.m185776d(pkgDownloadStatus);
            SudLogger.m222811d(sgg0.f167850u, "progress mgId:" + sgg0Var.f167852b + " 进度：" + j + "/" + sgg0Var.f167866p);
            LogUtils.file("SudDownloadTask", "progress mgId:" + sgg0Var.f167852b + " 进度：" + j + "/" + sgg0Var.f167866p);
        }
    }
}
