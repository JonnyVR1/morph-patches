package com.p046p1.mobile.putong.live.external.internal.live.square.api;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.MultiFollowShipPlug;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.cll;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.mcr;
import p149l.vwb;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR2\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "getData", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "userIds", "Ljava/util/ArrayList;", "getUserIds", "()Ljava/util/ArrayList;", "setUserIds", "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "resultData", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "getResultData", "()Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "setResultData", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiFollowShipPlug extends BaseAsyncPlug {

    @Nullable
    private BLiveEnvelope resultData;

    @NotNull
    private ArrayList<String> userIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiFollowShipPlug(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
        this.userIds = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public static void m69023f(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m69024g(MultiFollowShipPlug multiFollowShipPlug, BLiveEnvelope bLiveEnvelope) {
        multiFollowShipPlug.resultData = bLiveEnvelope;
        multiFollowShipPlug.success();
    }

    /* JADX INFO: renamed from: h */
    public static void m69025h(MultiFollowShipPlug multiFollowShipPlug) {
        multiFollowShipPlug.complete();
    }

    /* JADX INFO: renamed from: i */
    public static void m69026i(MultiFollowShipPlug multiFollowShipPlug, Throwable th) {
        th.getClass();
        multiFollowShipPlug.error(th);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() throws JSONException {
        final JSONArray jSONArray = new JSONArray();
        vwb.m200354z(this.userIds, new e30() { // from class: l.mj10
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiFollowShipPlug.m69023f(jSONArray, (String) obj);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userIds", jSONArray);
        cll cllVarM107501r = cll.m107501r(ytr.m216073b("/live/multi-followship"));
        cllVarM107501r.getClass();
        C22306c<BLiveEnvelope> c22306cBuildLivePostNetReqObs = LiveExternalApi.buildLivePostNetReqObs(cllVarM107501r, "multi-followship", jSONObject.toString());
        c22306cBuildLivePostNetReqObs.getClass();
        duringCreated(c22306cBuildLivePostNetReqObs).observeOn(jo0.m142408a()).subscribe(ffw.m121195f(new e30() { // from class: l.nj10
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiFollowShipPlug.m69024g(this.f139171a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.oj10
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiFollowShipPlug.m69026i(this.f144219a, (Throwable) obj);
            }
        }, new d30() { // from class: l.pj10
            @Override // p149l.d30
            public final void call() {
                MultiFollowShipPlug.m69025h(this.f149708a);
            }
        }));
    }

    @Nullable
    public final BLiveEnvelope getResultData() {
        return this.resultData;
    }

    @NotNull
    public final ArrayList<String> getUserIds() {
        return this.userIds;
    }

    public final void setResultData(@Nullable BLiveEnvelope bLiveEnvelope) {
        this.resultData = bLiveEnvelope;
    }

    public final void setUserIds(@NotNull ArrayList<String> arrayList) {
        arrayList.getClass();
        this.userIds = arrayList;
    }
}
