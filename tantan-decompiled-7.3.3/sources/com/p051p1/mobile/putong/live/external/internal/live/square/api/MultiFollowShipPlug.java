package com.p051p1.mobile.putong.live.external.internal.live.square.api;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.MultiFollowShipPlug;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fo0;
import p153l.jyb;
import p153l.ner;
import p153l.rnl;
import p153l.x20;
import p153l.y20;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR2\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/internal/live/square/api/MultiFollowShipPlug;", "Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "getData", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "userIds", "Ljava/util/ArrayList;", "getUserIds", "()Ljava/util/ArrayList;", "setUserIds", "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "resultData", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "getResultData", "()Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "setResultData", "(Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiFollowShipPlug extends BaseAsyncPlug {

    @Nullable
    private BLiveEnvelope resultData;

    @NotNull
    private ArrayList<String> userIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiFollowShipPlug(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
        this.userIds = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public static void m70206f(JSONArray jSONArray, String str) {
        jSONArray.put(str);
    }

    /* JADX INFO: renamed from: g */
    public static void m70207g(MultiFollowShipPlug multiFollowShipPlug, BLiveEnvelope bLiveEnvelope) {
        multiFollowShipPlug.resultData = bLiveEnvelope;
        multiFollowShipPlug.success();
    }

    /* JADX INFO: renamed from: h */
    public static void m70208h(MultiFollowShipPlug multiFollowShipPlug) {
        multiFollowShipPlug.complete();
    }

    /* JADX INFO: renamed from: i */
    public static void m70209i(MultiFollowShipPlug multiFollowShipPlug, Throwable th) {
        th.getClass();
        multiFollowShipPlug.error(th);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.api.BaseAsyncPlug
    public void getData() throws JSONException {
        final JSONArray jSONArray = new JSONArray();
        jyb.m147537z(this.userIds, new y20() { // from class: l.wr10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiFollowShipPlug.m70206f(jSONArray, (String) obj);
            }
        });
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userIds", jSONArray);
        rnl rnlVarM182265r = rnl.m182265r(zvr.m221802b("/live/multi-followship"));
        rnlVarM182265r.getClass();
        C22421c<BLiveEnvelope> c22421cBuildLivePostNetReqObs = LiveExternalApi.buildLivePostNetReqObs(rnlVarM182265r, "multi-followship", jSONObject.toString());
        c22421cBuildLivePostNetReqObs.getClass();
        duringCreated(c22421cBuildLivePostNetReqObs).observeOn(fo0.m126432a()).subscribe(dhw.m115827f(new y20() { // from class: l.xr10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiFollowShipPlug.m70207g(this.f195873a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.yr10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiFollowShipPlug.m70209i(this.f201268a, (Throwable) obj);
            }
        }, new x20() { // from class: l.zr10
            @Override // p153l.x20
            public final void call() {
                MultiFollowShipPlug.m70208h(this.f205725a);
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
