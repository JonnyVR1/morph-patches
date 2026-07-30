package com.p046p1.mobile.putong.live.external.internal.api;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserFeedInfos;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.aai;
import p149l.bkn0;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.g6n0;
import p149l.m8i;
import p149l.mt0;
import p149l.q4n0;
import p149l.r0v;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.x9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceApi {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveCounter m68898b(BLiveCounter bLiveCounter, BLiveCounter bLiveCounter2) {
        bLiveCounter.liveTabUnread = bLiveCounter2.liveTabUnread;
        bLiveCounter.activity.squareDetailUnread = bLiveCounter2.activity.squareDetailUnread;
        return bLiveCounter;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ bkn0.C15894a m68899c(BLiveEnvelope bLiveEnvelope) {
        List<BLiveVoiceRoomFeed> list = bLiveEnvelope.data.voiceRoomFeeds;
        return new bkn0.C15894a(new g6n0(bLiveEnvelope), list == null ? 0 : list.size());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ aai m68900d(String str, BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList(bLiveEnvelope.data.users);
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        vwb.m200354z(bLiveEnvelope.data.voiceRooms, new e30() { // from class: l.u0v
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) obj;
                map.put(bLiveVoiceRoom.owner.f44419id, Double.valueOf(bLiveVoiceRoom.memberCount));
            }
        });
        vwb.m200354z(bLiveEnvelope.data.voiceRooms, new e30() { // from class: l.v0v
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) obj;
                map2.put(bLiveVoiceRoom.owner.f44419id, bLiveVoiceRoom.topics.get(0).name);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (BLiveVoiceUserFeedInfos bLiveVoiceUserFeedInfos : bLiveEnvelope.data.voiceUserFeedInfos) {
            m8i m8iVar = new m8i();
            m8iVar.m153483a(bLiveVoiceUserFeedInfos.doing);
            m8iVar.m153484b(bLiveVoiceUserFeedInfos.doingIcon);
            arrayList2.add(m8iVar);
        }
        final HashMap map3 = new HashMap();
        vwb.m200354z(bLiveEnvelope.data.voiceLives, new e30() { // from class: l.j0v
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoice bLiveVoice = (BLiveVoice) obj;
                map3.put(bLiveVoice.anchor.f44419id, bLiveVoice.f44323id);
            }
        });
        return new aai(map, arrayList, arrayList2, map3, map2, str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveVoiceRoom m68901e(BLiveEnvelope bLiveEnvelope) {
        return vwb.m200296J(bLiveEnvelope.data.voiceRooms) ? BLiveVoiceRoom.EMPTY_ROOM : bLiveEnvelope.data.voiceRooms.get(0);
    }

    public static C22306c<bkn0.C15894a> getFeedVoiceCardData(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/voice-lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c("with", "voice-rooms,users,voice-live-user-mask").m107537d(), "getFeedVoiceCardData" + str).map(new w9j() { // from class: l.k0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveVoiceApi.m68899c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<aai> getFeedVoiceUserData(final String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/voice-lives-users")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c("with", "voice-rooms,voice-lives").m107537d(), "getFeedVoiceUserData" + str).map(new w9j() { // from class: l.l0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveVoiceApi.m68900d(str, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<g6n0> getLiveListInTopicInFeed(String str, String str2, long j, int i, String str3, String str4) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/voice-lives")).m107524p().m107536c("voice-room-topic", str2).m107536c("with", "voice-rooms,users").m107536c("keyword", str4).m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c(Constants.KEY_LIMIT, String.valueOf(i));
        if (j >= 0) {
            c16188aM107536c.m107536c("until", String.valueOf(j));
        }
        c16188aM107536c.m107536c("orderBy", str3);
        return LiveExternalApi.buildLiveReadReq(c16188aM107536c.m107537d(), "getLiveListInTopic" + str2).map(new r0v());
    }

    public static C22306c<BLiveVoiceRoom> getRoomInfo(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/users/" + str + "/voice-rooms")), "getRoomInfo").map(new w9j() { // from class: l.t0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveVoiceApi.m68901e((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<g6n0> getVoiceDataByChatAssistant(String str, String str2) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/voice-lives"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), mt0.m156174a("with", "voice-rooms,users"), mt0.m156174a("action", str2), mt0.m156174a("source", str)), "getVoiceDataByAssistant").map(new r0v());
    }

    public static C22306c<q4n0> getVoiceFeedEntryConfig() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/feed/voice-lives-summary")).m107524p().m107536c("with", "users").m107537d(), "getVoiceFeedEntryConfig").map(new w9j() { // from class: l.m0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveVoiceApi.m68905i((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ q4n0 m68905i(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new q4n0(bLiveData.users, bLiveData.voiceLivesSummary);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m68908l(Throwable th) {
    }

    public static void livePushPGCReport(String str, String str2) {
        cll cllVarM107537d = LiveApiBuilder.m67307m(ytr.m216073b("/voice-distribution/pgcReport")).m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", str);
        jsonObject.addProperty("source", str2);
        LiveExternalApi.buildLivePostNetReqObs(cllVarM107537d, "pgcReport", jsonObject.toString());
    }

    public static void notifyRefreshVoiceActivitiesNum() {
        if (x4u.m207034t()) {
            C22306c.zip(requestVoiceRedDot(), LiveSquareApi.requestLiveCounter(), new x9j() { // from class: l.o0v
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return LiveVoiceApi.m68898b((BLiveCounter) obj, (BLiveCounter) obj2);
                }
            }).subscribe(ffw.m121197h(new e30() { // from class: l.p0v
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().onNext((BLiveCounter) obj);
                }
            }));
        } else {
            requestVoiceRedDot().subscribe(ffw.m121197h(new e30() { // from class: l.q0v
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().onNext((BLiveCounter) obj);
                }
            }));
        }
    }

    public static void postVoiceActivitiesToZero(String str) {
        LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m67315u(ytr.m216073b("/feed/voice-live-activities/counter"), mt0.m156174a(FirebaseAnalytics.Param.METHOD, RequestParameters.SUBRESOURCE_DELETE), mt0.m156174a("type", str)), "postVoiceActivitiesToZero" + str, "").subscribe(ffw.m121194e(new e30() { // from class: l.i0v
            @Override // p149l.e30
            public final void call(Object obj) {
                ((hl3) s9s.m182763m(gld0.f103313c)).f108319l.onNext(roj0.f160388a);
            }
        }, new e30() { // from class: l.n0v
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVoiceApi.m68908l((Throwable) obj);
            }
        }));
    }

    public static C22306c<BLiveEnvelope> reportCreateVoiceInfo(String str) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216076e("/voice-live/track-events"), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventType", str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return LiveExternalApi.buildLivePostNetReqObs(cllVarM67315u, "reportCreateVoiceInfo", jSONObject.toString());
    }

    public static C22306c<BLiveCounter> requestVoiceRedDot() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/feed/voice-live-activities/counter"), new mt0[0]), "notifyRefreshVoiceActivitiesNum").map(new w9j() { // from class: l.s0v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void postVoiceActivitiesToZero() {
        postVoiceActivitiesToZero("");
    }
}
