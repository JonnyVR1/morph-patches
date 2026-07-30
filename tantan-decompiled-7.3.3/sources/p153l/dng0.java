package p153l;

import Sudabstract.Sudfor;
import java.util.ArrayList;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class dng0 {

    /* JADX INFO: renamed from: i */
    public static final String f89798i = "SudGIP ".concat(dng0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final long f89799a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f89800b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f89801c = false;

    /* JADX INFO: renamed from: d */
    public final glg0 f89802d;

    /* JADX INFO: renamed from: e */
    public final cmg0 f89803e;

    /* JADX INFO: renamed from: f */
    public long f89804f;

    /* JADX INFO: renamed from: g */
    public long f89805g;

    /* JADX INFO: renamed from: h */
    public qxg0 f89806h;

    public dng0(long j) {
        this.f89799a = j;
        dlg0 dlg0Var = dlg0.f89532c;
        if (dlg0Var == null) {
            wtq0.m207906a("SudGameRuntime hasn't been initialized");
            throw null;
        }
        this.f89802d = dlg0Var.f89534b;
        this.f89803e = dlg0Var.f89533a;
    }

    /* JADX INFO: renamed from: a */
    public final void m117063a(int i, String str) {
        ArrayList arrayList = this.f89800b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ISudListenerPreloadMGPkg) obj).onPreloadFailure(this.f89799a, i, str);
        }
        this.f89801c = false;
        this.f89800b.clear();
        qxg0 qxg0Var = this.f89806h;
        if (qxg0Var != null) {
            qxg0Var.f160046a.f191491a.remove(Long.valueOf(this.f89799a));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m117064b(final GameInfo gameInfo) {
        cmg0 cmg0Var = this.f89803e;
        int i = gameInfo.engine;
        long j = gameInfo.mgId;
        String str = gameInfo.version;
        uog0 uog0Var = new uog0() { // from class: l.bng0
            @Override // p153l.uog0
            /* JADX INFO: renamed from: a */
            public final void mo105395a(boolean z, String str2, boolean z2) {
                this.f77477a.m117065c(gameInfo, z, str2, z2);
            }
        };
        if (1 == i) {
            cmg0Var.f82590a.m202120d(i, j, str, uog0Var);
        } else if (5 == i) {
            cmg0Var.f82591b.m202120d(i, j, str, uog0Var);
        } else {
            cmg0Var.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m117065c(GameInfo gameInfo, boolean z, String str, boolean z2) {
        if (this.f89801c) {
            String str2 = f89798i;
            SudLogger.m222811d(str2, "preload isGameInstalled isInstalled=" + z);
            if (z) {
                LogUtils.file("SudGamePkgPreloadTask", "preload gamepackage is installed");
                SudLogger.m222811d(str2, "preload gamepackage is installed");
                ArrayList arrayList = this.f89800b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ISudListenerPreloadMGPkg) obj).onPreloadSuccess(this.f89799a);
                }
                this.f89801c = false;
                this.f89800b.clear();
                qxg0 qxg0Var = this.f89806h;
                if (qxg0Var != null) {
                    qxg0Var.f160046a.f191491a.remove(Long.valueOf(this.f89799a));
                    return;
                }
                return;
            }
            String str3 = 1 == gameInfo.engine ? gameInfo.eUrl : "";
            if (str3 == null || str3.isEmpty()) {
                m117063a(-1, "null == gameInfo.eUrl || gameInfo.eUrl.isEmpty()");
                return;
            }
            oqg0 oqg0Var = new oqg0();
            oqg0Var.f148588a = gameInfo.engine;
            oqg0Var.f148589b = Sudfor.PreloadPackageGamePackage;
            oqg0Var.f148590c = gameInfo.mgId;
            oqg0Var.f148591d = str3;
            oqg0Var.f148592e = gameInfo.version;
            oqg0Var.f148593f = gameInfo.hash;
            ukg0 ukg0Var = new ukg0("checkoutGamePkg");
            ukg0Var.f179401j.put("engine", Integer.valueOf(gameInfo.engine));
            ukg0Var.f179401j.put("package_type", 4);
            ukg0Var.f179398g = String.valueOf(gameInfo.mgId);
            cmg0 cmg0Var = this.f89803e;
            vmg0 vmg0Var = new vmg0(this, ukg0Var);
            cmg0Var.getClass();
            int i2 = oqg0Var.f148588a;
            if (1 == i2) {
                cmg0Var.f82590a.m202119a(oqg0Var, vmg0Var);
            } else if (5 == i2) {
                cmg0Var.f82591b.m202119a(oqg0Var, vmg0Var);
            }
        }
    }
}
