package com.p046p1.mobile.putong.live.external.module.api;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import p133rx.C22306c;
import p149l.cll;
import p149l.i2i0;
import p149l.mt0;
import p149l.qib0;
import p149l.vvr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveExternalApi {
    private static final RunnerProxy liveRunner;
    public static Network network;

    static {
        RunnerProxy runnerProxy = new RunnerProxy();
        liveRunner = runnerProxy;
        network = qib0.f154693H;
        runnerProxy.setErrorHandler(new i2i0());
    }

    public static <T extends BaseLiveBean> C22306c<T> buildLivePatch(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67313s(network, LiveApiBuilder.ReqType.PATCH, cllVar, str2, vvrVar));
    }

    public static <T> C22306c<T> buildLivePatchNetReqForAny(@NonNull cll cllVar, @NonNull String str, @NonNull String str2, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67312r(network, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    public static C22306c<BLiveEnvelope> buildLivePatchNetReqObs(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67311q(network, LiveApiBuilder.ReqType.PATCH, cllVar, str2, new mt0[0]));
    }

    public static <T> C22306c<T> buildLivePatchReqAny(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67312r(network, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, "", new mt0[0]));
    }

    public static <T extends BaseLiveBean> C22306c<T> buildLivePost(@NonNull cll cllVar, @NonNull String str, @NonNull String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67313s(network, LiveApiBuilder.ReqType.POST, cllVar, str2, vvrVar));
    }

    public static C22306c<BLiveEnvelope> buildLivePostNetReqObs(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67311q(network, LiveApiBuilder.ReqType.POST, cllVar, str2, new mt0[0]));
    }

    public static <T> C22306c<T> buildLivePostReqAny(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67312r(network, LiveApiBuilder.ReqType.POST, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    public static <T extends BaseLiveBean> C22306c<T> buildLivePut(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67313s(network, LiveApiBuilder.ReqType.PUT, cllVar, str2, vvrVar));
    }

    public static C22306c<BLiveEnvelope> buildLivePutNetReqObs(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m67311q(network, LiveApiBuilder.ReqType.PUT, cllVar, str2, new mt0[0]));
    }

    public static <T extends BaseLiveBean> C22306c<T> buildLiveRead(@NonNull cll cllVar, @NonNull String str, vvr vvrVar) {
        vvrVar.m200206b(str);
        return getRunner().scheduled(str, 0, LiveApiBuilder.m67313s(network, LiveApiBuilder.ReqType.GET, cllVar, "", vvrVar));
    }

    public static C22306c<BLiveEnvelope> buildLiveReadReq(@NonNull cll cllVar, @NonNull String str) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m67311q(network, LiveApiBuilder.ReqType.GET, cllVar, "", new mt0[0]));
    }

    public static <T> C22306c<T> buildLiveReadReqForAny(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m67312r(network, LiveApiBuilder.ReqType.GET, cllVar, jsonAdapter, "", new mt0[0]));
    }

    public static C22306c<BLiveEnvelope> buildLiveReadReqIO(@NonNull cll cllVar, @NonNull String str) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m67309o(network, LiveApiBuilder.ReqType.GET, cllVar, "", new mt0[0]));
    }

    private static RunnerProxy getRunner() {
        return liveRunner;
    }
}
