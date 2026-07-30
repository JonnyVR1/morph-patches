package p153l;

import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zeg0 extends ksp0 {

    /* JADX INFO: renamed from: a */
    public boolean f204005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f204006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hrg0 f204007c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ chg0 f204008d;

    public zeg0(chg0 chg0Var, String str, hrg0 hrg0Var) {
        this.f204008d = chg0Var;
        this.f204006b = str;
        this.f204007c = hrg0Var;
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: a */
    public final void mo151272a(hsp0 hsp0Var, int i, String str) {
        super.mo151272a(hsp0Var, i, str);
        ThreadUtils.postUITask(new Runnable() { // from class: l.seg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167613a.m219464g();
            }
        });
        LogUtils.file("NetworkDetectionTask", "onClosed:" + this.f204006b);
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: c */
    public final void mo151274c(hsp0 hsp0Var, final Throwable th, i5d0 i5d0Var) {
        super.mo151274c(hsp0Var, th, i5d0Var);
        final String str = this.f204006b;
        final hrg0 hrg0Var = this.f204007c;
        ThreadUtils.postUITask(new Runnable() { // from class: l.qeg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157173a.m219465h(str, th, hrg0Var);
            }
        });
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: d */
    public final void mo151275d(hsp0 hsp0Var, String str) {
        super.mo151275d(hsp0Var, str);
        LogUtils.file("NetworkDetectionTask", "onMessage:" + this.f204006b + " text:" + str);
    }

    @Override // p153l.ksp0
    /* JADX INFO: renamed from: f */
    public final void mo151277f(hsp0 hsp0Var, final i5d0 i5d0Var) {
        super.mo151277f(hsp0Var, i5d0Var);
        final String str = this.f204006b;
        final hrg0 hrg0Var = this.f204007c;
        ThreadUtils.postUITask(new Runnable() { // from class: l.reg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162648a.m219466i(i5d0Var, str, hrg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m219464g() {
        if (this.f204005a) {
            return;
        }
        this.f204005a = true;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m219465h(String str, Throwable th, hrg0 hrg0Var) {
        if (this.f204005a) {
            return;
        }
        this.f204005a = true;
        LogUtils.file("NetworkDetectionTask", "onFailure:" + str + " error:" + LogUtils.getErrorInfo(th));
        int iM167366a = oeg0.m167366a(th);
        String string = th.toString();
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = iM167366a;
        networkDetectionStepResult.msg = string;
        NetworkDetectionStep networkDetectionStep = hrg0Var.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f204008d.m109776g(iM167366a, string);
    }

    /* JADX INFO: renamed from: i */
    public final void m219466i(i5d0 i5d0Var, String str, hrg0 hrg0Var) {
        if (this.f204005a) {
            return;
        }
        this.f204005a = true;
        LogUtils.file("NetworkDetectionTask", "onOpen:" + str + " body:" + ((i5d0Var == null || i5d0Var.m138670k() == null) ? null : i5d0Var.m138670k().toString()));
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = hrg0Var.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        chg0 chg0Var = this.f204008d;
        int i = chg0Var.f81809g + 1;
        chg0Var.f81809g = i;
        if (i == chg0Var.f81808f) {
            chg0Var.m109777h();
        }
    }
}
