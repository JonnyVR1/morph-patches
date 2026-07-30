package com.p051p1.mobile.putong.live.external.internal.api;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserFeedInfos;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.bai;
import p153l.dhw;
import p153l.ftn0;
import p153l.jyb;
import p153l.kfn0;
import p153l.pbi;
import p153l.qcj;
import p153l.rcj;
import p153l.rnl;
import p153l.s2v;
import p153l.st0;
import p153l.udn0;
import p153l.y20;
import p153l.y6u;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceApi {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveCounter m70081b(BLiveCounter bLiveCounter, BLiveCounter bLiveCounter2) {
        bLiveCounter.liveTabUnread = bLiveCounter2.liveTabUnread;
        bLiveCounter.activity.squareDetailUnread = bLiveCounter2.activity.squareDetailUnread;
        return bLiveCounter;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ftn0.C17070a m70082c(BLiveEnvelope bLiveEnvelope) {
        List<BLiveVoiceRoomFeed> list = bLiveEnvelope.data.voiceRoomFeeds;
        return new ftn0.C17070a(new kfn0(bLiveEnvelope), list == null ? 0 : list.size());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ pbi m70083d(String str, BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList(bLiveEnvelope.data.users);
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        jyb.m147537z(bLiveEnvelope.data.voiceRooms, new y20() { // from class: l.v2v
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) obj;
                map.put(bLiveVoiceRoom.owner.f45267id, Double.valueOf(bLiveVoiceRoom.memberCount));
            }
        });
        jyb.m147537z(bLiveEnvelope.data.voiceRooms, new y20() { // from class: l.w2v
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) obj;
                map2.put(bLiveVoiceRoom.owner.f45267id, bLiveVoiceRoom.topics.get(0).name);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos : bLiveEnvelope.data.voiceUserFeedInfos) {
            bai baiVar = new bai();
            baiVar.m103158a(bLiveVoiceUserFeedInfos.doing);
            baiVar.m103159b(bLiveVoiceUserFeedInfos.doingIcon);
            arrayList2.add(baiVar);
        }
        final HashMap map3 = new HashMap();
        jyb.m147537z(bLiveEnvelope.data.voiceLives, new y20() { // from class: l.k2v
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoice bLiveVoice = (BLiveVoice) obj;
                map3.put(bLiveVoice.anchor.f45267id, bLiveVoice.f45171id);
            }
        });
        return new pbi(map, arrayList, arrayList2, map3, map2, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveVoiceRoom m70084e(BLiveEnvelope bLiveEnvelope) {
        return jyb.m147479J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.EMPTY_ROOM : bLiveEnvelope.data.voiceRooms.get(0);
    }

    public static C22421c<ftn0.C17070a> getFeedVoiceCardData(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/voice-lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c("with", "voice-rooms,users,voice-live-user-mask").m182301d(), "getFeedVoiceCardData" + str).map(new qcj() { // from class: l.l2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveVoiceApi.m70082c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<pbi> getFeedVoiceUserData(final String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/voice-lives-users")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c("with", "voice-rooms,voice-lives").m182301d(), "getFeedVoiceUserData" + str).map(new qcj() { // from class: l.m2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveVoiceApi.m70083d(str, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<kfn0> getLiveListInTopicInFeed(String str, String str2, long j, int i, String str3, String str4) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/voice-lives")).m182288p().m182300c("voice-room-topic", str2).m182300c("with", "voice-rooms,users").m182300c("keyword", str4).m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c(Constants.KEY_LIMIT, String.valueOf(i));
        if (j >= 0) {
            c19886aM182300c.m182300c("until", String.valueOf(j));
        }
        c19886aM182300c.m182300c("orderBy", str3);
        return LiveExternalApi.buildLiveReadReq(c19886aM182300c.m182301d(), "getLiveListInTopic" + str2).map(new s2v());
    }

    public static C22421c<BLiveVoiceRoom> getRoomInfo(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/users/" + str + "/voice-rooms")), "getRoomInfo").map(new qcj() { // from class: l.u2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveVoiceApi.m70084e((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<kfn0> getVoiceDataByChatAssistant(String str, String str2) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/voice-lives"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), st0.m187803a("with", "voice-rooms,users"), st0.m187803a("action", str2), st0.m187803a("source", str)), "getVoiceDataByAssistant").map(new s2v());
    }

    public static C22421c<udn0> getVoiceFeedEntryConfig() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/feed/voice-lives-summary")).m182288p().m182300c("with", "users").m182301d(), "getVoiceFeedEntryConfig").map(new qcj() { // from class: l.n2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveVoiceApi.m70088i((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ udn0 m70088i(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new udn0(bLiveData.users, bLiveData.voiceLivesSummary);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m70091l(Throwable th) {
    }

    public static void livePushPGCReport(String str, String str2) {
        rnl rnlVarM182301d = LiveApiBuilder.m68490m(zvr.m221802b("/voice-distribution/pgcReport")).m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", str);
        jsonObject.addProperty("source", str2);
        LiveExternalApi.buildLivePostNetReqObs(rnlVarM182301d, "pgcReport", jsonObject.toString());
    }

    public static void notifyRefreshVoiceActivitiesNum() {
        if (y6u.m214516t()) {
            C22421c.zip(requestVoiceRedDot(), LiveSquareApi.requestLiveCounter(), new rcj() { // from class: l.p2v
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return LiveVoiceApi.m70081b((BLiveCounter) obj, (BLiveCounter) obj2);
                }
            }).subscribe(dhw.m115829h(new y20() { // from class: l.q2v
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().onNext((BLiveCounter) obj);
                }
            }));
        } else {
            requestVoiceRedDot().subscribe(dhw.m115829h(new y20() { // from class: l.r2v
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().onNext((BLiveCounter) obj);
                }
            }));
        }
    }

    public static void postVoiceActivitiesToZero(String str) {
        LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m68498u(zvr.m221802b("/feed/voice-live-activities/counter"), st0.m187803a(FirebaseAnalytics.Param.METHOD, RequestParameters.SUBRESOURCE_DELETE), st0.m187803a("type", str)), "postVoiceActivitiesToZero" + str, "").subscribe(dhw.m115826e(new y20() { // from class: l.j2v
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gm3) tbs.m190077m(itd0.f116821c)).f104922l.onNext(uxj0.f181467a);
            }
        }, new y20() { // from class: l.o2v
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVoiceApi.m70091l((Throwable) obj);
            }
        }));
    }

    public static C22421c<BLiveEnvelope> reportCreateVoiceInfo(String str) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221805e("/voice-live/track-events"), new st0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventType", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return LiveExternalApi.buildLivePostNetReqObs(rnlVarM68498u, "reportCreateVoiceInfo", jSONObject.toString());
    }

    public static C22421c<BLiveCounter> requestVoiceRedDot() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/feed/voice-live-activities/counter"), new st0[0]), "notifyRefreshVoiceActivitiesNum").map(new qcj() { // from class: l.t2v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void postVoiceActivitiesToZero() {
        postVoiceActivitiesToZero("");
    }
}
