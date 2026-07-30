package p149l;

import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zcg0 implements hjg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lgg0 f202534a;

    public zcg0(lgg0 lgg0Var) {
        this.f202534a = lgg0Var;
    }

    @Override // p149l.hjg0
    /* JADX INFO: renamed from: a */
    public final void mo116965a(final File file, final long j, final Object obj, final lhg0 lhg0Var) {
        if (file == null || !this.f202534a.mo95868d(obj)) {
            lhg0Var.m149841a(null);
            return;
        }
        final String absolutePath = file.getAbsolutePath();
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess:" + absolutePath);
        xbg0.f191949a.execute(new Runnable() { // from class: l.eag0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f90194a.m218023b(absolutePath, file, j, obj, lhg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m218023b(String str, File file, long j, Object obj, ybg0 ybg0Var) throws Throwable {
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess beginUnzip file:");
        akg0 akg0Var = new akg0();
        n8g0 n8g0VarM96220a = afg0.m96220a(str, this.f202534a.f127985c);
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess unzipResult:" + n8g0VarM96220a + "  path:" + file.getAbsolutePath() + "  _sudPathCache:" + this.f202534a.f127985c);
        if (n8g0VarM96220a.f137642a == 0) {
            n8g0 n8g0VarMo95866a = this.f202534a.mo95866a();
            LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess copyRuntimeResult:" + n8g0VarMo95866a);
            if (n8g0VarMo95866a.f137642a == 0) {
                this.f202534a.mo95867c(j, obj, akg0Var);
            }
        }
        g7g0.m124691b(this.f202534a.f127985c);
        ((lhg0) ybg0Var).m149841a(akg0Var);
    }
}
