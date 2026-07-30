package p149l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lhg0 implements ybg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f128099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hng0 f128100b;

    public lhg0(hng0 hng0Var, String str) {
        this.f128100b = hng0Var;
        this.f128099a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m149841a(Object obj) {
        LogUtils.file("SudDownloadTask", "processor onCompleted mgId:" + this.f128100b.f108628a.f121813b);
        ThreadUtils.postUITask(new jeg0(this, obj));
    }
}
