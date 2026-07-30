package p153l;

import android.content.Context;
import java.io.File;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class nsg0 extends vog0 {

    /* JADX INFO: renamed from: f */
    public static final String f143501f = "SudGIP ".concat(nsg0.class.getSimpleName());

    /* JADX INFO: renamed from: e */
    public final String f143502e;

    public nsg0(Context context, olg0 olg0Var) {
        super(olg0Var);
        this.f185042a = 20;
        this.f143502e = new File(context.getFilesDir(), "sud/mgp/sudapp").getAbsolutePath();
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: b */
    public final Object mo164596b(uug0 uug0Var, File file) {
        LogUtils.file("SUDRealSudGamePackageManager", "processDownloadPackage");
        mlg0 mlg0Var = new mlg0();
        uug0Var.f181078f = System.currentTimeMillis();
        this.f185043b.m168115g(uug0Var);
        m202121e(uug0Var.f181073a);
        return mlg0Var;
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: h */
    public final void mo164597h(String str, Object obj, bxg0 bxg0Var, klg0 klg0Var) {
        if (!(obj instanceof mlg0)) {
            klg0Var.mo150367e(-1, "extendInfo empty", bxg0Var);
            return;
        }
        LogUtils.file("SUDRealSudGamePackageManager", "onDownloadSuccess path=" + str);
        SudLogger.m222811d(f143501f, "onDownloadSuccess path=" + str);
        klg0Var.mo150365b(str, bxg0Var);
    }

    @Override // p153l.vog0
    /* JADX INFO: renamed from: k */
    public final String mo164598k(String str) {
        return this.f143502e;
    }
}
