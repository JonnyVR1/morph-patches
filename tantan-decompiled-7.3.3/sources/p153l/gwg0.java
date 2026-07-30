package p153l;

import android.text.TextUtils;
import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
import java.io.File;
import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class gwg0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m132683a(final File file, final String str, final wtg0 wtg0Var) throws Throwable {
        final String strM132862a = gxg0.m132862a(file);
        final boolean zEqualsIgnoreCase = TextUtils.isEmpty(str) ? true : str.equalsIgnoreCase(strM132862a);
        ThreadUtils.postUITask(new Runnable() { // from class: l.yvg0
            @Override // java.lang.Runnable
            public final void run() {
                gwg0.m132685c(wtg0Var, file, str, zEqualsIgnoreCase, strM132862a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m132684b(final File file, final String str, final pvg0 pvg0Var) {
        fkg0.f99507a.execute(new Runnable() { // from class: l.wvg0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                gwg0.m132683a(file, str, pvg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m132685c(wtg0 wtg0Var, File file, String str, boolean z, String str2) {
        if (wtg0Var != null) {
            pvg0 pvg0Var = (pvg0) wtg0Var;
            String absolutePath = file == null ? "" : file.getAbsolutePath();
            LogUtils.file("SudDownloadTask", "checkMd5 onCompleted mdId:" + pvg0Var.f154299a.f167852b + "  path:" + absolutePath + "  checkMd5:" + str + "  fileMd5:" + str2 + "  isMatch:" + z);
            sgg0 sgg0Var = pvg0Var.f154299a;
            if (z) {
                LogUtils.file("SudDownloadTask", "checkMd5 match:" + sgg0Var.f167858h + "  :mgId:" + pvg0Var.f154299a.f167852b);
                SudLogger.m222811d(sgg0.f167850u, "checkMd5 match:" + pvg0Var.f154299a.f167858h + "  :mgId:" + pvg0Var.f154299a.f167852b);
                sgg0 sgg0Var2 = pvg0Var.f154299a;
                prg0 prg0Var = sgg0Var2.f167859i;
                if (prg0Var != null) {
                    prg0Var.mo135739a(file, sgg0Var2.f167866p, sgg0Var2.f167857g.f148594g, new tpg0(pvg0Var, absolutePath));
                    return;
                }
                PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
                sgg0Var2.f167858h = pkgDownloadStatus;
                sgg0Var2.f167868r = System.currentTimeMillis();
                sgg0Var2.m185776d(pkgDownloadStatus);
                sgg0 sgg0Var3 = pvg0Var.f154299a;
                ArrayList arrayList = sgg0Var3.f167862l;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((wfg0) obj).mo154723f(absolutePath, sgg0Var3.f167866p, null, sgg0Var3.f167865o);
                }
                sgg0Var3.m185773a();
                return;
            }
            LogUtils.file("SudDownloadTask", "checkMd5 error:" + sgg0Var.f167858h + "  :mgId:" + pvg0Var.f154299a.f167852b + "  checkMd5:" + str + "  fileMd5:" + str2);
            SudLogger.m222811d(sgg0.f167850u, "checkMd5 error:" + pvg0Var.f154299a.f167858h + "  :mgId:" + pvg0Var.f154299a.f167852b + "  checkMd5:" + str + "  fileMd5:" + str2);
            String str3 = ing0.f115953a;
            boolean zDelete = new File(absolutePath).delete();
            StringBuilder sb = new StringBuilder("deleteFile result:");
            sb.append(zDelete);
            LogUtils.file(FileUtils.TAG, sb.toString());
            sgg0 sgg0Var4 = pvg0Var.f154299a;
            PkgDownloadStatus pkgDownloadStatus2 = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
            sgg0Var4.f167858h = pkgDownloadStatus2;
            sgg0Var4.f167868r = System.currentTimeMillis();
            sgg0Var4.m185776d(pkgDownloadStatus2);
            pvg0Var.f154299a.m185774b(-10200, "package flaw");
        }
    }
}
