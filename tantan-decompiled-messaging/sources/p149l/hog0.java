package p149l;

import android.view.View;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class hog0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t7g0 f108824a;

    public hog0(t7g0 t7g0Var) {
        this.f108824a = t7g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sfg0 sfg0Var = this.f108824a.f143311a;
        sfg0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onClickTimeoutContinueWait");
        amg0 amg0Var = sfg0Var.f164291a.f180521w;
        amg0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "onClickTimeoutContinueWait");
        amg0Var.m97558e(true);
        this.f108824a.m187456a();
    }
}
