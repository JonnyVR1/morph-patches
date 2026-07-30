package p149l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class r6g0 extends gjp0 {

    /* JADX INFO: renamed from: a */
    public boolean f157934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f157935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zig0 f157936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u8g0 f157937d;

    public r6g0(u8g0 u8g0Var, String str, zig0 zig0Var) {
        this.f157937d = u8g0Var;
        this.f157935b = str;
        this.f157936c = zig0Var;
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: a */
    public final void mo126548a(cjp0 cjp0Var, int i, String str) {
        super.mo126548a(cjp0Var, i, str);
        ThreadUtils.postUITask(new Runnable() { // from class: l.k6g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121466a.m178063g();
            }
        });
        LogUtils.file("NetworkDetectionTask", "onClosed:" + this.f157935b);
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: c */
    public final void mo126550c(cjp0 cjp0Var, final Throwable th, exc0 exc0Var) {
        super.mo126550c(cjp0Var, th, exc0Var);
        final String str = this.f157935b;
        final zig0 zig0Var = this.f157936c;
        ThreadUtils.postUITask(new Runnable() { // from class: l.i6g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f111738a.m178064h(str, th, zig0Var);
            }
        });
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: d */
    public final void mo126551d(cjp0 cjp0Var, String str) {
        super.mo126551d(cjp0Var, str);
        LogUtils.file("NetworkDetectionTask", "onMessage:" + this.f157935b + " text:" + str);
    }

    @Override // p149l.gjp0
    /* JADX INFO: renamed from: f */
    public final void mo126553f(cjp0 cjp0Var, final exc0 exc0Var) {
        super.mo126553f(cjp0Var, exc0Var);
        final String str = this.f157935b;
        final zig0 zig0Var = this.f157936c;
        ThreadUtils.postUITask(new Runnable() { // from class: l.j6g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f116472a.m178065i(exc0Var, str, zig0Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m178063g() {
        if (this.f157934a) {
            return;
        }
        this.f157934a = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m178064h(String str, Throwable th, zig0 zig0Var) {
        if (this.f157934a) {
            return;
        }
        this.f157934a = true;
        LogUtils.file("NetworkDetectionTask", "onFailure:" + str + " error:" + LogUtils.getErrorInfo(th));
        int iM124589a = g6g0.m124589a(th);
        String string = th.toString();
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = iM124589a;
        networkDetectionStepResult.msg = string;
        NetworkDetectionStep networkDetectionStep = zig0Var.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f157937d.m192200g(iM124589a, string);
    }

    /* JADX INFO: renamed from: i */
    public final void m178065i(exc0 exc0Var, String str, zig0 zig0Var) {
        if (this.f157934a) {
            return;
        }
        this.f157934a = true;
        LogUtils.file("NetworkDetectionTask", "onOpen:" + str + " body:" + ((exc0Var == null || exc0Var.m118606k() == null) ? null : exc0Var.m118606k().toString()));
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = zig0Var.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        u8g0 u8g0Var = this.f157937d;
        int i = u8g0Var.f175133g + 1;
        u8g0Var.f175133g = i;
        if (i == u8g0Var.f175132f) {
            u8g0Var.m192201h();
        }
    }
}
