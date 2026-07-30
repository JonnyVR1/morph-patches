package p153l;

import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class fzg0 implements vlg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hrg0 f101480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ chg0 f101481b;

    public fzg0(chg0 chg0Var, hrg0 hrg0Var) {
        this.f101481b = chg0Var;
        this.f101480a = hrg0Var;
    }

    @Override // p153l.vlg0
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "networkdetection failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        NetworkDetectionStep networkDetectionStep = this.f101480a.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f101481b.m109776g(i, str);
    }

    @Override // p153l.vlg0
    public final void onSuccess(String str) {
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = this.f101480a.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        chg0 chg0Var = this.f101481b;
        int i = chg0Var.f81809g + 1;
        chg0Var.f81809g = i;
        if (i == chg0Var.f81808f) {
            chg0Var.m109777h();
        }
    }
}
