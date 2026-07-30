package p153l;

import java.util.Locale;
import tech.sud.gip.C22511R;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class leg0 implements klg0 {

    /* JADX INFO: renamed from: a */
    public ukg0 f131747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ thg0 f131748b;

    public leg0(thg0 thg0Var) {
        this.f131748b = thg0Var;
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: a */
    public final void mo137227a() {
        LogUtils.file("SudGameLoadingStageLoadPackage", "PackageDownloadListener.onDownloadStart");
        SudLogger.m222811d(thg0.f174360j, "PackageDownloadListener.onDownloadStart");
        thg0 thg0Var = this.f131748b;
        if (thg0Var.f174366f) {
            return;
        }
        thg0Var.f174363c.m159700c(thg0Var.f174361a.getString(C22511R.string.f208445xbf60eac9));
        this.f131747a = new ukg0("checkoutGamePkg");
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: b */
    public final void mo150365b(String str, bxg0 bxg0Var) {
        SudLogger.m222817v(thg0.f174360j, "PackageDownloadListener.onSuccess");
        thg0 thg0Var = this.f131748b;
        if (thg0Var.f174366f) {
            return;
        }
        thg0Var.f174363c.m159700c(thg0Var.f174361a.getString(C22511R.string.f208444x15f8330c));
        thg0 thg0Var2 = this.f131748b;
        GameInfo gameInfo = thg0Var2.f174362b;
        gameInfo.gamePath = str;
        int i = gameInfo.engine;
        cmg0 cmg0Var = thg0Var2.f174364d;
        tgg0 tgg0Var = thg0Var2.f174369i;
        if (1 == i) {
            cmg0Var.f82590a.m202123i(tgg0Var);
        } else if (5 == i) {
            cmg0Var.f82591b.m202123i(tgg0Var);
        } else {
            cmg0Var.getClass();
        }
        ukg0 ukg0Var = this.f131747a;
        if (ukg0Var != null) {
            GameInfo gameInfo2 = this.f131748b.f174362b;
            if (gameInfo2 != null) {
                ukg0Var.f179401j.put("engine", Integer.valueOf(gameInfo2.engine));
            }
            this.f131747a.f179401j.put("package_type", 2);
            ukg0 ukg0Var2 = this.f131747a;
            ukg0Var2.f179396e = 0;
            ukg0Var2.f179397f = "success";
            ukg0Var2.f179398g = String.valueOf(this.f131748b.f174367g);
            ukg0 ukg0Var3 = this.f131747a;
            ukg0Var3.f179405n = bxg0Var;
            String str2 = fug0.f100911a;
            ThreadUtils.postUITask(new nog0(ukg0Var3.toString(), false, ukg0Var3.f179392a, ukg0Var3.f179396e));
        }
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: d */
    public final void mo137228d(long j, long j2) {
        bgg0 bgg0Var;
        SudLogger.m222817v(thg0.f174360j, "PackageDownloadListener.onDownloadProgress " + j + "/" + j2);
        thg0 thg0Var = this.f131748b;
        if (thg0Var.f174366f || (bgg0Var = thg0Var.f174363c.f138369a.f106507h) == null) {
            return;
        }
        bgg0Var.f76629k.setText(String.format(bgg0Var.f76623e.getString(C22511R.string.fsm_mgp_game_loading_view_download_update_progress), bgg0Var.f189795b, String.format(Locale.US, "%.2fKB/%.2fKB", Float.valueOf((j * 1.0f) / 1024.0f), Float.valueOf((j2 * 1.0f) / 1024.0f))));
        bgg0Var.m104165d(j, j2, 40, 80);
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: e */
    public final void mo150367e(int i, String str, bxg0 bxg0Var) {
        SudLogger.m222813e(thg0.f174360j, "PackageDownloadListener.onFailure:" + str);
        thg0 thg0Var = this.f131748b;
        if (thg0Var.f174366f) {
            return;
        }
        thg0Var.f174363c.m159700c(thg0Var.f174361a.getString(C22511R.string.f208443xcc57c7d7));
        this.f131748b.f174363c.m159699b(3, i, str);
        ukg0 ukg0Var = this.f131747a;
        if (ukg0Var != null) {
            GameInfo gameInfo = this.f131748b.f174362b;
            if (gameInfo != null) {
                ukg0Var.f179401j.put("engine", Integer.valueOf(gameInfo.engine));
            }
            this.f131747a.f179401j.put("package_type", 2);
            ukg0 ukg0Var2 = this.f131747a;
            ukg0Var2.f179396e = i;
            if (str != null) {
                ukg0Var2.f179397f = str;
            }
            ukg0Var2.f179398g = String.valueOf(this.f131748b.f174367g);
            ukg0 ukg0Var3 = this.f131747a;
            ukg0Var3.f179405n = bxg0Var;
            String str2 = fug0.f100911a;
            ThreadUtils.postUITask(new nog0(ukg0Var3.toString(), false, ukg0Var3.f179392a, ukg0Var3.f179396e));
        }
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: c */
    public final void mo150366c(long j, long j2, PkgDownloadStatus pkgDownloadStatus) {
    }
}
