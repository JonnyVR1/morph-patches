package p149l;

import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xqg0 implements ndg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zig0 f194010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u8g0 f194011b;

    public xqg0(u8g0 u8g0Var, zig0 zig0Var) {
        this.f194011b = u8g0Var;
        this.f194010a = zig0Var;
    }

    @Override // p149l.ndg0
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "networkdetection failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        NetworkDetectionStep networkDetectionStep = this.f194010a.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f194011b.m192200g(i, str);
    }

    @Override // p149l.ndg0
    public final void onSuccess(String str) {
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = this.f194010a.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        u8g0 u8g0Var = this.f194011b;
        int i = u8g0Var.f175133g + 1;
        u8g0Var.f175133g = i;
        if (i == u8g0Var.f175132f) {
            u8g0Var.m192201h();
        }
    }
}
