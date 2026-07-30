package p149l;

import android.text.TextUtils;
import com.tencent.could.component.common.p079ai.clipphoto.FileUtils;
import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ekg0 implements hjg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ngg0 f91977a;

    public ekg0(ngg0 ngg0Var) {
        this.f91977a = ngg0Var;
    }

    @Override // p149l.hjg0
    /* JADX INFO: renamed from: a */
    public final void mo116965a(final File file, long j, Object obj, final lhg0 lhg0Var) {
        if (file == null || !(obj instanceof mmg0)) {
            lhg0Var.m149841a(null);
            return;
        }
        LogUtils.file("RealSudGamePackageManager", "processor onDownloadSuccess");
        final mmg0 mmg0Var = (mmg0) obj;
        mmg0Var.f134667e = j;
        xbg0.f191949a.execute(new Runnable() { // from class: l.whg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f186434a.m116966b(file, mmg0Var, lhg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m116966b(File file, mmg0 mmg0Var, ybg0 ybg0Var) {
        LogUtils.file("RealSudGamePackageManager", "processor onDownloadSuccess 子线程start:" + file.getAbsolutePath());
        ngg0 ngg0Var = this.f91977a;
        long j = mmg0Var.f134663a;
        mmg0 mmg0VarM141028a = jdg0.m141028a(ngg0Var.f138874b.f102111a.getString(String.valueOf(j), ""));
        if (mmg0VarM141028a != null && !TextUtils.isEmpty(mmg0VarM141028a.f134666d)) {
            File file2 = new File(ngg0Var.mo126616j(mmg0VarM141028a.f134665c), mmg0VarM141028a.f134666d);
            if (!file2.equals(file)) {
                String absolutePath = file2.getAbsolutePath();
                LogUtils.file("RealSudGamePackageManager", "deleteOldPackage oldFile:" + absolutePath + " newFile:" + file.getAbsolutePath());
                String str = afg0.f69172a;
                LogUtils.file(FileUtils.TAG, "deleteFile result:" + new File(absolutePath).delete());
            }
        }
        ((lhg0) ybg0Var).m149841a(this.f91977a.mo121852b(mmg0Var, file));
    }
}
