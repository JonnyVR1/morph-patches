package p149l;

import java.util.Locale;
import tech.sud.gip.C22396R;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class d6g0 implements cdg0 {

    /* JADX INFO: renamed from: a */
    public mcg0 f84623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l9g0 f84624b;

    public d6g0(l9g0 l9g0Var) {
        this.f84624b = l9g0Var;
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: a */
    public final void mo106223a() {
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageDownloadListener.onDownloadStart");
        SudLogger.m221565d(l9g0.f127108j, "PackageDownloadListener.onDownloadStart");
        l9g0 l9g0Var = this.f84624b;
        if (l9g0Var.f127114f) {
            return;
        }
        l9g0Var.f127111c.m116843c(l9g0Var.f127109a.getString(C22396R.string.f207523xbf60eac9));
        this.f84623a = new mcg0("checkoutGamePkg");
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: b */
    public final void mo106224b(String str, tog0 tog0Var) {
        SudLogger.m221571v(l9g0.f127108j, "PackageDownloadListener.onSuccess");
        l9g0 l9g0Var = this.f84624b;
        if (l9g0Var.f127114f) {
            return;
        }
        l9g0Var.f127111c.m116843c(l9g0Var.f127109a.getString(C22396R.string.f207522x15f8330c));
        l9g0 l9g0Var2 = this.f84624b;
        GameInfo gameInfo = l9g0Var2.f127110b;
        gameInfo.gamePath = str;
        int i = gameInfo.engine;
        udg0 udg0Var = l9g0Var2.f127112d;
        l8g0 l8g0Var = l9g0Var2.f127117i;
        if (1 == i) {
            udg0Var.f175919a.m159334i(l8g0Var);
        } else if (5 == i) {
            udg0Var.f175920b.m159334i(l8g0Var);
        } else {
            udg0Var.getClass();
        }
        mcg0 mcg0Var = this.f84623a;
        if (mcg0Var != null) {
            GameInfo gameInfo2 = this.f84624b.f127110b;
            if (gameInfo2 != null) {
                mcg0Var.f133120j.put("engine", Integer.valueOf(gameInfo2.engine));
            }
            this.f84623a.f133120j.put("package_type", 2);
            mcg0 mcg0Var2 = this.f84623a;
            mcg0Var2.f133115e = 0;
            mcg0Var2.f133116f = "success";
            mcg0Var2.f133117g = String.valueOf(this.f84624b.f127115g);
            mcg0 mcg0Var3 = this.f84623a;
            mcg0Var3.f133124n = tog0Var;
            String str2 = xlg0.f193417a;
            ThreadUtils.postUITask(new fgg0(mcg0Var3.toString(), false, mcg0Var3.f133111a, mcg0Var3.f133115e));
        }
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: d */
    public final void mo106226d(long j, long j2) {
        t7g0 t7g0Var;
        SudLogger.m221571v(l9g0.f127108j, "PackageDownloadListener.onDownloadProgress " + j + "/" + j2);
        l9g0 l9g0Var = this.f84624b;
        if (l9g0Var.f127114f || (t7g0Var = l9g0Var.f127111c.f91721a.f198892h) == null) {
            return;
        }
        t7g0Var.f168725k.setText(String.format(t7g0Var.f168719e.getString(C22396R.string.fsm_mgp_game_loading_view_download_update_progress), t7g0Var.f143312b, String.format(Locale.US, "%.2fKB/%.2fKB", Float.valueOf((j * 1.0f) / 1024.0f), Float.valueOf((j2 * 1.0f) / 1024.0f))));
        t7g0Var.m187459d(j, j2, 40, 80);
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: e */
    public final void mo106227e(int i, String str, tog0 tog0Var) {
        SudLogger.m221567e(l9g0.f127108j, "PackageDownloadListener.onFailure:" + str);
        l9g0 l9g0Var = this.f84624b;
        if (l9g0Var.f127114f) {
            return;
        }
        l9g0Var.f127111c.m116843c(l9g0Var.f127109a.getString(C22396R.string.f207521xcc57c7d7));
        this.f84624b.f127111c.m116842b(3, i, str);
        mcg0 mcg0Var = this.f84623a;
        if (mcg0Var != null) {
            GameInfo gameInfo = this.f84624b.f127110b;
            if (gameInfo != null) {
                mcg0Var.f133120j.put("engine", Integer.valueOf(gameInfo.engine));
            }
            this.f84623a.f133120j.put("package_type", 2);
            mcg0 mcg0Var2 = this.f84623a;
            mcg0Var2.f133115e = i;
            if (str != null) {
                mcg0Var2.f133116f = str;
            }
            mcg0Var2.f133117g = String.valueOf(this.f84624b.f127115g);
            mcg0 mcg0Var3 = this.f84623a;
            mcg0Var3.f133124n = tog0Var;
            String str2 = xlg0.f193417a;
            ThreadUtils.postUITask(new fgg0(mcg0Var3.toString(), false, mcg0Var3.f133111a, mcg0Var3.f133115e));
        }
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: c */
    public final void mo106225c(long j, long j2, PkgDownloadStatus pkgDownloadStatus) {
    }
}
