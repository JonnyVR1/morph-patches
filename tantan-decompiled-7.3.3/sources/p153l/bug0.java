package p153l;

import com.tencent.connect.common.Constants;
import org.json.JSONObject;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.gip.core.network.detection.SudNetworkDetectionParamModel;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bug0 implements ISudListenerInitSDK {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hrg0 f78505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yng0 f78506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hrg0 f78507c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yng0 f78508d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ chg0 f78509e;

    public bug0(chg0 chg0Var, hrg0 hrg0Var, yng0 yng0Var, hrg0 hrg0Var2, yng0 yng0Var2) {
        this.f78509e = chg0Var;
        this.f78505a = hrg0Var;
        this.f78506b = yng0Var;
        this.f78507c = hrg0Var2;
        this.f78508d = yng0Var2;
    }

    @Override // tech.sud.gip.core.ISudListenerInitSDK
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "initSDK failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        hrg0 hrg0Var = this.f78505a;
        hrg0Var.f111343c = this.f78506b.f77780b;
        NetworkDetectionStep networkDetectionStep = hrg0Var.f111341a;
        NetworkDetectionStatus networkDetectionStatus = networkDetectionStep.status;
        NetworkDetectionStatus networkDetectionStatus2 = NetworkDetectionStatus.WAITING;
        if (networkDetectionStatus != networkDetectionStatus2) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
            networkDetectionStep.result = networkDetectionStepResult;
        }
        hrg0 hrg0Var2 = this.f78507c;
        hrg0Var2.f111343c = this.f78508d.f77780b;
        NetworkDetectionStep networkDetectionStep2 = hrg0Var2.f111341a;
        if (networkDetectionStep2.status != networkDetectionStatus2) {
            networkDetectionStep2.status = NetworkDetectionStatus.COMPLETED;
            networkDetectionStep2.result = networkDetectionStepResult;
        }
        this.f78509e.m109776g(i, str);
    }

    @Override // tech.sud.gip.core.ISudListenerInitSDK
    public final void onSuccess() {
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        hrg0 hrg0Var = this.f78505a;
        hrg0Var.f111343c = this.f78506b.f77780b;
        NetworkDetectionStep networkDetectionStep = hrg0Var.f111341a;
        NetworkDetectionStatus networkDetectionStatus = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.status = networkDetectionStatus;
        networkDetectionStep.result = networkDetectionStepResult;
        hrg0 hrg0Var2 = this.f78507c;
        hrg0Var2.f111343c = this.f78508d.f77780b;
        NetworkDetectionStep networkDetectionStep2 = hrg0Var2.f111341a;
        networkDetectionStep2.status = networkDetectionStatus;
        networkDetectionStep2.result = networkDetectionStepResult;
        chg0 chg0Var = this.f78509e;
        if (chg0Var.f81806d) {
            return;
        }
        uyg0 uyg0Var = utg0.f180947b;
        String str = uyg0Var.f181603c;
        hrg0 hrg0Var3 = new hrg0();
        hrg0Var3.f111342b = "getCheckerUrlConfig";
        hrg0Var3.f111343c = str;
        NetworkDetectionStep networkDetectionStep3 = hrg0Var3.f111341a;
        int i = chg0Var.f81811i + 1;
        chg0Var.f81811i = i;
        networkDetectionStep3.identifier = i;
        networkDetectionStep3.protocol = "https";
        networkDetectionStep3.method = "POST";
        chg0Var.f81807e.add(hrg0Var3);
        yng0 yng0Var = new yng0(hrg0Var3.f111341a);
        JSONObject jSONObject = new JSONObject();
        try {
            SudNetworkDetectionParamModel sudNetworkDetectionParamModel = chg0Var.f81803a;
            if (sudNetworkDetectionParamModel != null) {
                jSONObject.put(Constants.JumpUrlConstants.URL_KEY_APPID, sudNetworkDetectionParamModel.appId);
            }
        } catch (Exception e) {
            LogUtils.file("NetworkDetectionTask", "getCheckerUrlConfig error:" + LogUtils.getErrorInfo(e));
        }
        String string = jSONObject.toString();
        kwg0 kwg0Var = new kwg0(chg0Var, hrg0Var3);
        neg0 neg0Var = new neg0();
        chg0Var.f81810h.add(neg0Var);
        uyg0Var.m198641l(str, string, yng0Var, kwg0Var, neg0Var);
    }
}
