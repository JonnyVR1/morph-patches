package p149l;

import com.tencent.connect.common.Constants;
import org.json.JSONObject;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.gip.core.network.detection.SudNetworkDetectionParamModel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class tlg0 implements ISudListenerInitSDK {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zig0 f171019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qfg0 f171020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zig0 f171021c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qfg0 f171022d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u8g0 f171023e;

    public tlg0(u8g0 u8g0Var, zig0 zig0Var, qfg0 qfg0Var, zig0 zig0Var2, qfg0 qfg0Var2) {
        this.f171023e = u8g0Var;
        this.f171019a = zig0Var;
        this.f171020b = qfg0Var;
        this.f171021c = zig0Var2;
        this.f171022d = qfg0Var2;
    }

    @Override // tech.sud.gip.core.ISudListenerInitSDK
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "initSDK failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        zig0 zig0Var = this.f171019a;
        zig0Var.f203329c = this.f171020b.f170096b;
        NetworkDetectionStep networkDetectionStep = zig0Var.f203327a;
        NetworkDetectionStatus networkDetectionStatus = networkDetectionStep.status;
        NetworkDetectionStatus networkDetectionStatus2 = NetworkDetectionStatus.WAITING;
        if (networkDetectionStatus != networkDetectionStatus2) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
            networkDetectionStep.result = networkDetectionStepResult;
        }
        zig0 zig0Var2 = this.f171021c;
        zig0Var2.f203329c = this.f171022d.f170096b;
        NetworkDetectionStep networkDetectionStep2 = zig0Var2.f203327a;
        if (networkDetectionStep2.status != networkDetectionStatus2) {
            networkDetectionStep2.status = NetworkDetectionStatus.COMPLETED;
            networkDetectionStep2.result = networkDetectionStepResult;
        }
        this.f171023e.m192200g(i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerInitSDK
    public final void onSuccess() {
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        zig0 zig0Var = this.f171019a;
        zig0Var.f203329c = this.f171020b.f170096b;
        NetworkDetectionStep networkDetectionStep = zig0Var.f203327a;
        NetworkDetectionStatus networkDetectionStatus = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.status = networkDetectionStatus;
        networkDetectionStep.result = networkDetectionStepResult;
        zig0 zig0Var2 = this.f171021c;
        zig0Var2.f203329c = this.f171022d.f170096b;
        NetworkDetectionStep networkDetectionStep2 = zig0Var2.f203327a;
        networkDetectionStep2.status = networkDetectionStatus;
        networkDetectionStep2.result = networkDetectionStepResult;
        u8g0 u8g0Var = this.f171023e;
        if (u8g0Var.f175130d) {
            return;
        }
        mqg0 mqg0Var = mlg0.f134427b;
        String str = mqg0Var.f135226c;
        zig0 zig0Var3 = new zig0();
        zig0Var3.f203328b = "getCheckerUrlConfig";
        zig0Var3.f203329c = str;
        NetworkDetectionStep networkDetectionStep3 = zig0Var3.f203327a;
        int i = u8g0Var.f175135i + 1;
        u8g0Var.f175135i = i;
        networkDetectionStep3.identifier = i;
        networkDetectionStep3.protocol = "https";
        networkDetectionStep3.method = "POST";
        u8g0Var.f175131e.add(zig0Var3);
        qfg0 qfg0Var = new qfg0(zig0Var3.f203327a);
        JSONObject jSONObject = new JSONObject();
        try {
            SudNetworkDetectionParamModel sudNetworkDetectionParamModel = u8g0Var.f175127a;
            if (sudNetworkDetectionParamModel != null) {
                jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, sudNetworkDetectionParamModel.appId);
            }
        } catch (Exception e) {
            LogUtils.file("NetworkDetectionTask", "getCheckerUrlConfig error:" + LogUtils.getErrorInfo(e));
        }
        String string = jSONObject.toString();
        cog0 cog0Var = new cog0(u8g0Var, zig0Var3);
        f6g0 f6g0Var = new f6g0();
        u8g0Var.f175134h.add(f6g0Var);
        mqg0Var.m155908l(str, string, qfg0Var, cog0Var, f6g0Var);
    }
}
