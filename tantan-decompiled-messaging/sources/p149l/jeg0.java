package p149l;

import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jeg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f117571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lhg0 f117572b;

    public jeg0(lhg0 lhg0Var, Object obj) {
        this.f117572b = lhg0Var;
        this.f117571a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("SudDownloadTask", "PKG_DOWNLOAD_COMPLETED onCompleted mgId:" + this.f117572b.f128100b.f108628a.f121813b);
        k8g0 k8g0Var = this.f117572b.f128100b.f108628a;
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
        k8g0Var.f121819h = pkgDownloadStatus;
        k8g0Var.f121829r = System.currentTimeMillis();
        k8g0Var.m144938d(pkgDownloadStatus);
        lhg0 lhg0Var = this.f117572b;
        k8g0 k8g0Var2 = lhg0Var.f128100b.f108628a;
        String str = lhg0Var.f128099a;
        Object obj = this.f117571a;
        ArrayList arrayList = k8g0Var2.f121823l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o7g0) arrayList.get(i)).mo111017f(str, k8g0Var2.f121827p, obj, k8g0Var2.f121826o);
        }
        k8g0Var2.m144935a();
    }
}
