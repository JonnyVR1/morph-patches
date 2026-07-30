package com.p046p1.mobile.putong.live.external.module.api;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.e30;
import p149l.ffw;
import p149l.g6n0;
import p149l.mt0;
import p149l.r0v;
import p149l.roj0;
import p149l.tvp;
import p149l.vnq;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.xaj0;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceCenterApiProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xaj0 m70487b(xaj0 xaj0Var, BLiveEnvelope bLiveEnvelope) {
        return new xaj0((List) xaj0Var.f191751a, new g6n0(bLiveEnvelope), (String) xaj0Var.f191753c);
    }

    public static C22306c<roj0> cancelRelationships(String str, String str2) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherId", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str2);
            jSONObject.put("operate", Action.remove);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m67315u(ytr.m216073b(tvp.INSTANCE.m190774d() ? "/feed/voice-live-activity-moment/relation-status" : "/voice-live-activity-moment/relation-status"), new mt0[0]), "cancelRelationships: ", string).map(new w9j() { // from class: l.xvm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m70490e(Throwable th) {
    }

    public static C22306c<BLiveData> getDrawSuggestTopRoom(String str) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/voice-lives"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), mt0.m156174a("source", "hot-room-shortcut"), mt0.m156174a("action", str), mt0.m156174a("with", "voice-rooms,users")), "getDrawSuggestTopRoom").map(new w9j() { // from class: l.awm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    public static C22306c<List<BLiveMemberActivityData>> getVoiceNoticeList() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b(tvp.INSTANCE.m190774d() ? "/feed/voice-live-activity-moment/list" : "/voice-live-activity-moment/list"), new mt0[0]), "getVoiceNoticeList").map(new w9j() { // from class: l.fwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.memberActivityList;
            }
        });
    }

    public static C22306c<BLiveVoiceLiveActivityMoment> getVoiceNoticeLivingList() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b(tvp.INSTANCE.m190774d() ? "/feed/voice-live-activity-moment/previews" : "/voice-live-activity-moment/previews"), new mt0[0]), "getVoiceLiveActivityMomentPreviews").map(new w9j() { // from class: l.dwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveActivityMoment;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m70495j(List list, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        if (x4u.m207031q(bLiveVoiceRoomFeed.state)) {
            return;
        }
        list.add(bLiveVoiceRoomFeed.liveId);
    }

    public static void postVoiceActivitiesToZero() {
        LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m67315u(ytr.m216073b(tvp.INSTANCE.m190774d() ? "/feed/voice-live-activity-moment/clear" : "/voice-live-activity-moment/clear"), new mt0[0]), "voiceActivitiesClear", "").subscribe(ffw.m121194e(new e30() { // from class: l.yvm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((hl3) s9s.m182763m(gld0.f103313c)).f108319l.m132487l(roj0.f160388a);
            }
        }, new e30() { // from class: l.zvm0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceCenterApiProvider.m70490e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C22306c<xaj0<List<String>, g6n0, String>> refreshStoppedTopicVoiceRoom(final xaj0<List<String>, String, String> xaj0Var, boolean z) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b(z ? "/feed/recommend/voice-lives" : "/voice-lives"), mt0.m156174a("with", "voice-rooms,users,voice-live-user-mask"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), mt0.m156174a("source", xaj0Var.f191753c), mt0.m156174a("action", "refresh-stopped"), mt0.m156174a("ids", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(xaj0Var.f191751a)), mt0.m156174a("voice-room-topic", xaj0Var.f191752b)), "refreshStoppedTopicVoiceRoom").map(new w9j() { // from class: l.ewm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.m70487b(xaj0Var, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<xaj0<List<String>, g6n0, String>> refreshSwipTopicRooms(List<String> list, final String str, final String str2, final boolean z) {
        return requestTopicVoiceRooms(list, str2, z).map(new w9j() { // from class: l.bwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.stoppedTopicVoiceIdList((g6n0) obj, str, str2);
            }
        }).flatMap(new w9j() { // from class: l.cwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.refreshStoppedTopicVoiceRoom((xaj0) obj, z);
            }
        });
    }

    private static C22306c<g6n0> requestTopicVoiceRooms(List<String> list, String str, boolean z) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b(z ? "/feed/recommend/voice-lives" : "/voice-lives"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, GiftAction.given), mt0.m156174a("with", "voice-lives,voice-rooms,voice-live-user-mask,users"), mt0.m156174a("source", str), mt0.m156174a("ids", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list))), "requestTopicVoiceRooms").map(new r0v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static xaj0<List<String>, String, String> stoppedTopicVoiceIdList(g6n0 g6n0Var, String str, String str2) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(g6n0Var.f101294a, new e30() { // from class: l.gwm0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceCenterApiProvider.m70495j(arrayList, (BLiveVoiceRoomFeed) obj);
            }
        });
        return new xaj0<>(arrayList, str, str2);
    }
}
