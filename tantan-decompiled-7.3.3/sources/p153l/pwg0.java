package p153l;

import android.view.View;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class pwg0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bgg0 f154403a;

    public pwg0(bgg0 bgg0Var) {
        this.f154403a = bgg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aog0 aog0Var = this.f154403a.f189794a;
        aog0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onClickTimeoutContinueWait");
        iug0 iug0Var = aog0Var.f72452a.f88523w;
        iug0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "onClickTimeoutContinueWait");
        iug0Var.m142193e(true);
        this.f154403a.m104162a();
    }
}
