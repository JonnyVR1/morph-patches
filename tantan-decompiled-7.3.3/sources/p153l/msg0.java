package p153l;

import android.text.TextUtils;
import com.tencent.could.component.common.p084ai.clipphoto.FileUtils;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class msg0 implements prg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vog0 f138478a;

    public msg0(vog0 vog0Var) {
        this.f138478a = vog0Var;
    }

    @Override // p153l.prg0
    /* JADX INFO: renamed from: a */
    public final void mo135739a(final File file, long j, Object obj, final tpg0 tpg0Var) {
        if (file == null || !(obj instanceof uug0)) {
            tpg0Var.m192131a(null);
            return;
        }
        LogUtils.file("RealSudGamePackageManager", "processor onDownloadSuccess");
        final uug0 uug0Var = (uug0) obj;
        uug0Var.f181077e = j;
        fkg0.f99507a.execute(new Runnable() { // from class: l.eqg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f95339a.m159785b(file, uug0Var, tpg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m159785b(File file, uug0 uug0Var, gkg0 gkg0Var) {
        LogUtils.file("RealSudGamePackageManager", "processor onDownloadSuccess 子线程start:" + file.getAbsolutePath());
        vog0 vog0Var = this.f138478a;
        long j = uug0Var.f181073a;
        uug0 uug0VarM181992a = rlg0.m181992a(vog0Var.f185043b.f147834a.getString(String.valueOf(j), ""));
        if (uug0VarM181992a != null && !TextUtils.isEmpty(uug0VarM181992a.f181076d)) {
            File file2 = new File(vog0Var.mo168989j(uug0VarM181992a.f181075c), uug0VarM181992a.f181076d);
            if (!file2.equals(file)) {
                String absolutePath = file2.getAbsolutePath();
                LogUtils.file("RealSudGamePackageManager", "deleteOldPackage oldFile:" + absolutePath + " newFile:" + file.getAbsolutePath());
                String str = ing0.f115953a;
                LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(absolutePath).delete());
            }
        }
        ((tpg0) gkg0Var).m192131a(this.f138478a.mo164596b(uug0Var, file));
    }
}
