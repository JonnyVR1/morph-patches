package p153l;

import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class hlg0 implements prg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tog0 f110506a;

    public hlg0(tog0 tog0Var) {
        this.f110506a = tog0Var;
    }

    @Override // p153l.prg0
    /* JADX INFO: renamed from: a */
    public final void mo135739a(final File file, final long j, final Object obj, final tpg0 tpg0Var) {
        if (file == null || !this.f110506a.mo140626d(obj)) {
            tpg0Var.m192131a(null);
            return;
        }
        final String absolutePath = file.getAbsolutePath();
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess:" + absolutePath);
        fkg0.f99507a.execute(new Runnable() { // from class: l.mig0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f136968a.m135740b(absolutePath, file, j, obj, tpg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m135740b(String str, File file, long j, Object obj, gkg0 gkg0Var) throws Throwable {
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess beginUnzip file:");
        isg0 isg0Var = new isg0();
        vgg0 vgg0VarM141127a = ing0.m141127a(str, this.f110506a.f175406c);
        LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess unzipResult:" + vgg0VarM141127a + "  path:" + file.getAbsolutePath() + "  _sudPathCache:" + this.f110506a.f175406c);
        if (vgg0VarM141127a.f184033a == 0) {
            vgg0 vgg0VarMo140624a = this.f110506a.mo140624a();
            LogUtils.file("RealSudGameCoreManager", "processor onDownloadSuccess copyRuntimeResult:" + vgg0VarMo140624a);
            if (vgg0VarMo140624a.f184033a == 0) {
                this.f110506a.mo140625c(j, obj, isg0Var);
            }
        }
        ofg0.m167449b(this.f110506a.f175406c);
        ((tpg0) gkg0Var).m192131a(isg0Var);
    }
}
