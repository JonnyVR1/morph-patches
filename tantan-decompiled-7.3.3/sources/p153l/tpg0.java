package p153l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class tpg0 implements gkg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f175595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pvg0 f175596b;

    public tpg0(pvg0 pvg0Var, String str) {
        this.f175596b = pvg0Var;
        this.f175595a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m192131a(Object obj) {
        LogUtils.file("SudDownloadTask", "processor onCompleted mgId:" + this.f175596b.f154299a.f167852b);
        ThreadUtils.postUITask(new rmg0(this, obj));
    }
}
