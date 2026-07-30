package p149l;

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
public final class qfg0 extends tgg0 {

    /* JADX INFO: renamed from: c */
    public final NetworkDetectionStep f154109c;

    public qfg0(NetworkDetectionStep networkDetectionStep) {
        this.f154109c = networkDetectionStep;
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void callEnd(sx3 sx3Var) {
        super.callEnd(sx3Var);
        NetworkDetectionStep networkDetectionStep = this.f154109c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        }
        m174309d(NetworkDetectionDetailType.CALL_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void callFailed(sx3 sx3Var, IOException iOException) {
        super.callFailed(sx3Var, iOException);
        NetworkDetectionStep networkDetectionStep = this.f154109c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        }
        m174309d(NetworkDetectionDetailType.CALL_FAILED);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void callStart(sx3 sx3Var) {
        super.callStart(sx3Var);
        NetworkDetectionStep networkDetectionStep = this.f154109c;
        if (networkDetectionStep != null) {
            networkDetectionStep.status = NetworkDetectionStatus.CHECKING;
        }
        m174309d(NetworkDetectionDetailType.CALL_START);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void connectEnd(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(sx3Var, inetSocketAddress, proxy, protocol);
        m174309d(NetworkDetectionDetailType.CONNECT_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void connectStart(sx3 sx3Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(sx3Var, inetSocketAddress, proxy);
        m174309d(NetworkDetectionDetailType.CONNECT_START);
    }

    /* JADX INFO: renamed from: d */
    public final void m174309d(final NetworkDetectionDetailType networkDetectionDetailType) {
        ThreadUtils.postUITask(new Runnable() { // from class: l.yeg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f197686a.m174310e(networkDetectionDetailType);
            }
        });
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void dnsEnd(sx3 sx3Var, String str, List list) {
        super.dnsEnd(sx3Var, str, list);
        m174309d(NetworkDetectionDetailType.DNS_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void dnsStart(sx3 sx3Var, String str) {
        super.dnsStart(sx3Var, str);
        m174309d(NetworkDetectionDetailType.DNS_START);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m174310e(NetworkDetectionDetailType networkDetectionDetailType) {
        if (this.f154109c != null) {
            NetworkDetectionDetail networkDetectionDetail = new NetworkDetectionDetail();
            networkDetectionDetail.timestamp = System.currentTimeMillis();
            networkDetectionDetail.type = networkDetectionDetailType;
            this.f154109c.detailList.add(networkDetectionDetail);
        }
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void requestBodyEnd(sx3 sx3Var, long j) {
        super.requestBodyEnd(sx3Var, j);
        m174309d(NetworkDetectionDetailType.REQUEST_BODY_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void requestBodyStart(sx3 sx3Var) {
        super.requestBodyStart(sx3Var);
        m174309d(NetworkDetectionDetailType.REQUEST_BODY_START);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void requestHeadersEnd(sx3 sx3Var, stc0 stc0Var) {
        super.requestHeadersEnd(sx3Var, stc0Var);
        m174309d(NetworkDetectionDetailType.REQUEST_HEADERS_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void requestHeadersStart(sx3 sx3Var) {
        super.requestHeadersStart(sx3Var);
        m174309d(NetworkDetectionDetailType.REQUEST_HEADERS_START);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void responseBodyEnd(sx3 sx3Var, long j) {
        super.responseBodyEnd(sx3Var, j);
        m174309d(NetworkDetectionDetailType.RESPONSE_BODY_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void responseBodyStart(sx3 sx3Var) {
        super.responseBodyStart(sx3Var);
        m174309d(NetworkDetectionDetailType.RESPONSE_BODY_START);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void responseHeadersEnd(sx3 sx3Var, exc0 exc0Var) {
        super.responseHeadersEnd(sx3Var, exc0Var);
        m174309d(NetworkDetectionDetailType.RESPONSE_HEADERS_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void responseHeadersStart(sx3 sx3Var) {
        super.responseHeadersStart(sx3Var);
        m174309d(NetworkDetectionDetailType.RESPONSE_HEADERS_START);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void secureConnectEnd(sx3 sx3Var, dvk dvkVar) {
        super.secureConnectEnd(sx3Var, dvkVar);
        m174309d(NetworkDetectionDetailType.SECURE_CONNECT_END);
    }

    @Override // p149l.tgg0, p149l.o3f
    public final void secureConnectStart(sx3 sx3Var) {
        super.secureConnectStart(sx3Var);
        m174309d(NetworkDetectionDetailType.SECURE_CONNECT_START);
    }
}
