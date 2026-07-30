package p149l;

import android.text.TextUtils;
import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.File;
import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class yng0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m215409a(final File file, final String str, final olg0 olg0Var) throws Throwable {
        final String strM215498a = yog0.m215498a(file);
        final boolean zEqualsIgnoreCase = TextUtils.isEmpty(str) ? true : str.equalsIgnoreCase(strM215498a);
        ThreadUtils.postUITask(new Runnable() { // from class: l.qng0
            @Override // java.lang.Runnable
            public final void run() {
                yng0.m215411c(olg0Var, file, str, zEqualsIgnoreCase, strM215498a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m215410b(final File file, final String str, final hng0 hng0Var) {
        xbg0.f191949a.execute(new Runnable() { // from class: l.ong0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                yng0.m215409a(file, str, hng0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m215411c(olg0 olg0Var, File file, String str, boolean z, String str2) {
        if (olg0Var != null) {
            hng0 hng0Var = (hng0) olg0Var;
            String absolutePath = file == null ? "" : file.getAbsolutePath();
            LogUtils.file("SudDownloadTask", "checkMd5 onCompleted mdId:" + hng0Var.f108628a.f121813b + "  path:" + absolutePath + "  checkMd5:" + str + "  fileMd5:" + str2 + "  isMatch:" + z);
            k8g0 k8g0Var = hng0Var.f108628a;
            if (z) {
                LogUtils.file("SudDownloadTask", "checkMd5 match:" + k8g0Var.f121819h + "  :mgId:" + hng0Var.f108628a.f121813b);
                SudLogger.m221565d(k8g0.f121811u, "checkMd5 match:" + hng0Var.f108628a.f121819h + "  :mgId:" + hng0Var.f108628a.f121813b);
                k8g0 k8g0Var2 = hng0Var.f108628a;
                hjg0 hjg0Var = k8g0Var2.f121820i;
                if (hjg0Var != null) {
                    hjg0Var.mo116965a(file, k8g0Var2.f121827p, k8g0Var2.f121818g.f102899g, new lhg0(hng0Var, absolutePath));
                    return;
                }
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
                k8g0Var2.f121819h = pkgDownloadStatus;
                k8g0Var2.f121829r = System.currentTimeMillis();
                k8g0Var2.m144938d(pkgDownloadStatus);
                k8g0 k8g0Var3 = hng0Var.f108628a;
                ArrayList arrayList = k8g0Var3.f121823l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((o7g0) obj).mo111017f(absolutePath, k8g0Var3.f121827p, null, k8g0Var3.f121826o);
                }
                k8g0Var3.m144935a();
                return;
            }
            LogUtils.file("SudDownloadTask", "checkMd5 error:" + k8g0Var.f121819h + "  :mgId:" + hng0Var.f108628a.f121813b + "  checkMd5:" + str + "  fileMd5:" + str2);
            SudLogger.m221565d(k8g0.f121811u, "checkMd5 error:" + hng0Var.f108628a.f121819h + "  :mgId:" + hng0Var.f108628a.f121813b + "  checkMd5:" + str + "  fileMd5:" + str2);
            String str3 = afg0.f69172a;
            boolean zDelete = new File(absolutePath).delete();
            StringBuilder sb = new StringBuilder("deleteFile result:");
            sb.append(zDelete);
            LogUtils.file(FileUtils.TAG, sb.toString());
            k8g0 k8g0Var4 = hng0Var.f108628a;
            PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
            k8g0Var4.f121819h = pkgDownloadStatus2;
            k8g0Var4.f121829r = System.currentTimeMillis();
            k8g0Var4.m144938d(pkgDownloadStatus2);
            hng0Var.f108628a.m144936b(-10200, "package flaw");
        }
    }
}
