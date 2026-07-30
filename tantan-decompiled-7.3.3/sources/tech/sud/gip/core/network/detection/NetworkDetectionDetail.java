package tech.sud.gip.core.network.detection;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkDetectionDetail {
    public long timestamp;
    public NetworkDetectionDetailType type;

    public NetworkDetectionDetail deepCopy() {
        NetworkDetectionDetail networkDetectionDetail = new NetworkDetectionDetail();
        networkDetectionDetail.type = this.type;
        networkDetectionDetail.timestamp = this.timestamp;
        return networkDetectionDetail;
    }
}
