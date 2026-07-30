package p149l;

import android.content.Context;
import java.io.File;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class fkg0 extends ngg0 {

    /* JADX INFO: renamed from: f */
    public static final String f98065f = "SudGIP ".concat(fkg0.class.getSimpleName());

    /* JADX INFO: renamed from: e */
    public final String f98066e;

    public fkg0(Context context, gdg0 gdg0Var) {
        super(gdg0Var);
        this.f138873a = 20;
        this.f98066e = new File(context.getFilesDir(), "sud/mgp/sudapp").getAbsolutePath();
    }

    @Override // p149l.ngg0
    /* JADX INFO: renamed from: b */
    public final Object mo121852b(mmg0 mmg0Var, File file) {
        LogUtils.file("SUDRealSudGamePackageManager", "processDownloadPackage");
        edg0 edg0Var = new edg0();
        mmg0Var.f134668f = System.currentTimeMillis();
        this.f138874b.m125554g(mmg0Var);
        m159332e(mmg0Var.f134663a);
        return edg0Var;
    }

    @Override // p149l.ngg0
    /* JADX INFO: renamed from: h */
    public final void mo121853h(String str, Object obj, tog0 tog0Var, cdg0 cdg0Var) {
        if (!(obj instanceof edg0)) {
            cdg0Var.mo106227e(-1, "extendInfo empty", tog0Var);
            return;
        }
        LogUtils.file("SUDRealSudGamePackageManager", "onDownloadSuccess path=" + str);
        SudLogger.m221565d(f98065f, "onDownloadSuccess path=" + str);
        cdg0Var.mo106224b(str, tog0Var);
    }

    @Override // p149l.ngg0
    /* JADX INFO: renamed from: k */
    public final String mo121854k(String str) {
        return this.f98066e;
    }
}
