package com.p051p1.mobile.putong.live.external.module.api;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import p137rx.C22421c;
import p153l.rai0;
import p153l.rnl;
import p153l.st0;
import p153l.uqb0;
import p153l.wxr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveExternalApi {
    private static final RunnerProxy liveRunner;
    public static Network network;

    static {
        RunnerProxy runnerProxy = new RunnerProxy();
        liveRunner = runnerProxy;
        network = uqb0.f180376H;
        runnerProxy.setErrorHandler(new rai0());
    }

    public static <T extends BaseLiveBean> C22421c<T> buildLivePatch(@NonNull rnl rnlVar, @NonNull String str, String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68496s(network, LiveApiBuilder.ReqType.PATCH, rnlVar, str2, wxrVar));
    }

    public static <T> C22421c<T> buildLivePatchNetReqForAny(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68495r(network, LiveApiBuilder.ReqType.PATCH, rnlVar, jsonAdapter, str2, new st0[0]));
    }

    public static C22421c<BLiveEnvelope> buildLivePatchNetReqObs(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68494q(network, LiveApiBuilder.ReqType.PATCH, rnlVar, str2, new st0[0]));
    }

    public static <T> C22421c<T> buildLivePatchReqAny(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68495r(network, LiveApiBuilder.ReqType.PATCH, rnlVar, jsonAdapter, "", new st0[0]));
    }

    public static <T extends BaseLiveBean> C22421c<T> buildLivePost(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68496s(network, LiveApiBuilder.ReqType.POST, rnlVar, str2, wxrVar));
    }

    public static C22421c<BLiveEnvelope> buildLivePostNetReqObs(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68494q(network, LiveApiBuilder.ReqType.POST, rnlVar, str2, new st0[0]));
    }

    public static <T> C22421c<T> buildLivePostReqAny(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68495r(network, LiveApiBuilder.ReqType.POST, rnlVar, jsonAdapter, str2, new st0[0]));
    }

    public static <T extends BaseLiveBean> C22421c<T> buildLivePut(@NonNull rnl rnlVar, @NonNull String str, String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68496s(network, LiveApiBuilder.ReqType.PUT, rnlVar, str2, wxrVar));
    }

    public static C22421c<BLiveEnvelope> buildLivePutNetReqObs(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return getRunner().scheduled(str, -1, LiveApiBuilder.m68494q(network, LiveApiBuilder.ReqType.PUT, rnlVar, str2, new st0[0]));
    }

    public static <T extends BaseLiveBean> C22421c<T> buildLiveRead(@NonNull rnl rnlVar, @NonNull String str, wxr wxrVar) {
        wxrVar.m208440b(str);
        return getRunner().scheduled(str, 0, LiveApiBuilder.m68496s(network, LiveApiBuilder.ReqType.GET, rnlVar, "", wxrVar));
    }

    public static C22421c<BLiveEnvelope> buildLiveReadReq(@NonNull rnl rnlVar, @NonNull String str) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m68494q(network, LiveApiBuilder.ReqType.GET, rnlVar, "", new st0[0]));
    }

    public static <T> C22421c<T> buildLiveReadReqForAny(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m68495r(network, LiveApiBuilder.ReqType.GET, rnlVar, jsonAdapter, "", new st0[0]));
    }

    public static C22421c<BLiveEnvelope> buildLiveReadReqIO(@NonNull rnl rnlVar, @NonNull String str) {
        return getRunner().scheduled(str, 0, LiveApiBuilder.m68492o(network, LiveApiBuilder.ReqType.GET, rnlVar, "", new st0[0]));
    }

    private static RunnerProxy getRunner() {
        return liveRunner;
    }
}
