package p153l;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Protocol;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.network.detection.NetworkDetectionDetail;
import tech.sud.gip.core.network.detection.NetworkDetectionDetailType;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;

/* JADX INFO: loaded from: classes.dex */
public final class yng0 extends bpg0 {

    /* JADX INFO: renamed from: c */
    public final NetworkDetectionStep f200823c;

    public yng0(NetworkDetectionStep networkDetectionStep) {
        this.f200823c = networkDetectionStep;
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void callEnd(ry3 ry3Var) {
        super.callEnd(ry3Var);
        NetworkDetectionStep networkDetectionStep = this.f200823c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        }
        m216837d(NetworkDetectionDetailType.CALL_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void callFailed(ry3 ry3Var, IOException iOException) {
        super.callFailed(ry3Var, iOException);
        NetworkDetectionStep networkDetectionStep = this.f200823c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        }
        m216837d(NetworkDetectionDetailType.CALL_FAILED);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void callStart(ry3 ry3Var) {
        super.callStart(ry3Var);
        NetworkDetectionStep networkDetectionStep = this.f200823c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.CHECKING;
        }
        m216837d(NetworkDetectionDetailType.CALL_START);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void connectEnd(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(ry3Var, inetSocketAddress, proxy, protocol);
        m216837d(NetworkDetectionDetailType.CONNECT_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void connectStart(ry3 ry3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(ry3Var, inetSocketAddress, proxy);
        m216837d(NetworkDetectionDetailType.CONNECT_START);
    }

    /* JADX INFO: renamed from: d */
    public final void m216837d(final NetworkDetectionDetailType networkDetectionDetailType) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.gng0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105084a.m216838e(networkDetectionDetailType);
            }
        });
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void dnsEnd(ry3 ry3Var, String str, List list) {
        super.dnsEnd(ry3Var, str, list);
        m216837d(NetworkDetectionDetailType.DNS_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void dnsStart(ry3 ry3Var, String str) {
        super.dnsStart(ry3Var, str);
        m216837d(NetworkDetectionDetailType.DNS_START);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m216838e(NetworkDetectionDetailType networkDetectionDetailType) {
        if (this.f200823c != null) {
            NetworkDetectionDetail networkDetectionDetail = new NetworkDetectionDetail();
            networkDetectionDetail.timestamp = System.currentTimeMillis();
            networkDetectionDetail.type = networkDetectionDetailType;
            this.f200823c.detailList.add(networkDetectionDetail);
        }
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void requestBodyEnd(ry3 ry3Var, long j) {
        super.requestBodyEnd(ry3Var, j);
        m216837d(NetworkDetectionDetailType.REQUEST_BODY_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void requestBodyStart(ry3 ry3Var) {
        super.requestBodyStart(ry3Var);
        m216837d(NetworkDetectionDetailType.REQUEST_BODY_START);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void requestHeadersEnd(ry3 ry3Var, x1d0 x1d0Var) {
        super.requestHeadersEnd(ry3Var, x1d0Var);
        m216837d(NetworkDetectionDetailType.REQUEST_HEADERS_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void requestHeadersStart(ry3 ry3Var) {
        super.requestHeadersStart(ry3Var);
        m216837d(NetworkDetectionDetailType.REQUEST_HEADERS_START);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void responseBodyEnd(ry3 ry3Var, long j) {
        super.responseBodyEnd(ry3Var, j);
        m216837d(NetworkDetectionDetailType.RESPONSE_BODY_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void responseBodyStart(ry3 ry3Var) {
        super.responseBodyStart(ry3Var);
        m216837d(NetworkDetectionDetailType.RESPONSE_BODY_START);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void responseHeadersEnd(ry3 ry3Var, i5d0 i5d0Var) {
        super.responseHeadersEnd(ry3Var, i5d0Var);
        m216837d(NetworkDetectionDetailType.RESPONSE_HEADERS_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void responseHeadersStart(ry3 ry3Var) {
        super.responseHeadersStart(ry3Var);
        m216837d(NetworkDetectionDetailType.RESPONSE_HEADERS_START);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void secureConnectEnd(ry3 ry3Var, txk txkVar) {
        super.secureConnectEnd(ry3Var, txkVar);
        m216837d(NetworkDetectionDetailType.SECURE_CONNECT_END);
    }

    @Override // p153l.bpg0, p153l.t4f
    public final void secureConnectStart(ry3 ry3Var) {
        super.secureConnectStart(ry3Var);
        m216837d(NetworkDetectionDetailType.SECURE_CONNECT_START);
    }
}
