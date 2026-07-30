package tech.sud.gip.core.network.detection;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class NetworkDetectionStep {
    public int identifier;
    public String method;
    public String protocol;
    public NetworkDetectionStepResult result;
    public NetworkDetectionStatus status = NetworkDetectionStatus.WAITING;
    public final List<NetworkDetectionDetail> detailList = new ArrayList();

    public NetworkDetectionStep deepCopy() {
        NetworkDetectionStep networkDetectionStep = new NetworkDetectionStep();
        networkDetectionStep.identifier = this.identifier;
        networkDetectionStep.protocol = this.protocol;
        networkDetectionStep.method = this.method;
        networkDetectionStep.status = this.status;
        for (NetworkDetectionDetail networkDetectionDetail : this.detailList) {
            if (networkDetectionDetail != null) {
                networkDetectionStep.detailList.add(networkDetectionDetail.deepCopy());
            }
        }
        NetworkDetectionStepResult networkDetectionStepResult = this.result;
        if (networkDetectionStepResult != null) {
            networkDetectionStep.result = networkDetectionStepResult.deepCopy();
        }
        return networkDetectionStep;
    }
}
