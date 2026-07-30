package p153l;

import java.util.ArrayList;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class rmg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f163879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tpg0 f163880b;

    public rmg0(tpg0 tpg0Var, Object obj) {
        this.f163880b = tpg0Var;
        this.f163879a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LogUtils.file("SudDownloadTask", "PKG_DOWNLOAD_COMPLETED onCompleted mgId:" + this.f163880b.f175596b.f154299a.f167852b);
        sgg0 sgg0Var = this.f163880b.f175596b.f154299a;
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_COMPLETED;
        sgg0Var.f167858h = pkgDownloadStatus;
        sgg0Var.f167868r = System.currentTimeMillis();
        sgg0Var.m185776d(pkgDownloadStatus);
        tpg0 tpg0Var = this.f163880b;
        sgg0 sgg0Var2 = tpg0Var.f175596b.f154299a;
        String str = tpg0Var.f175595a;
        Object obj = this.f163879a;
        ArrayList arrayList = sgg0Var2.f167862l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wfg0) arrayList.get(i)).mo154723f(str, sgg0Var2.f167866p, obj, sgg0Var2.f167865o);
        }
        sgg0Var2.m185773a();
    }
}
