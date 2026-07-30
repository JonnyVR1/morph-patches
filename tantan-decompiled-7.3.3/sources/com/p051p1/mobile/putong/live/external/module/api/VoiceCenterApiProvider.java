package com.p051p1.mobile.putong.live.external.module.api;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Action;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLiveActivityMoment;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.external.module.api.VoiceCenterApiProvider;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.bkj0;
import p153l.dhw;
import p153l.jyb;
import p153l.kfn0;
import p153l.qcj;
import p153l.s2v;
import p153l.st0;
import p153l.txp;
import p153l.upq;
import p153l.uxj0;
import p153l.y20;
import p153l.y6u;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceCenterApiProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ bkj0 m71670b(bkj0 bkj0Var, BLiveEnvelope bLiveEnvelope) {
        return new bkj0((List) bkj0Var.f77081a, new kfn0(bLiveEnvelope), (String) bkj0Var.f77083c);
    }

    public static C22421c<uxj0> cancelRelationships(String str, String str2) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherId", str);
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str2);
            jSONObject.put("operate", Action.remove);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m68498u(zvr.m221802b(txp.INSTANCE.m193527d() ? "/feed/voice-live-activity-moment/relation-status" : "/voice-live-activity-moment/relation-status"), new st0[0]), "cancelRelationships: ", string).map(new qcj() { // from class: l.b5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m71673e(Throwable th) {
    }

    public static C22421c<BLiveData> getDrawSuggestTopRoom(String str) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/voice-lives"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), st0.m187803a("source", "hot-room-shortcut"), st0.m187803a("action", str), st0.m187803a("with", "voice-rooms,users")), "getDrawSuggestTopRoom").map(new qcj() { // from class: l.e5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    public static C22421c<List<BLiveMemberActivityData>> getVoiceNoticeList() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b(txp.INSTANCE.m193527d() ? "/feed/voice-live-activity-moment/list" : "/voice-live-activity-moment/list"), new st0[0]), "getVoiceNoticeList").map(new qcj() { // from class: l.j5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.memberActivityList;
            }
        });
    }

    public static C22421c<BLiveVoiceLiveActivityMoment> getVoiceNoticeLivingList() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b(txp.INSTANCE.m193527d() ? "/feed/voice-live-activity-moment/previews" : "/voice-live-activity-moment/previews"), new st0[0]), "getVoiceLiveActivityMomentPreviews").map(new qcj() { // from class: l.h5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveActivityMoment;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m71678j(List list, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        if (y6u.m214513q(bLiveVoiceRoomFeed.state)) {
            return;
        }
        list.add(bLiveVoiceRoomFeed.liveId);
    }

    public static void postVoiceActivitiesToZero() {
        LiveExternalApi.buildLivePostNetReqObs(LiveApiBuilder.m68498u(zvr.m221802b(txp.INSTANCE.m193527d() ? "/feed/voice-live-activity-moment/clear" : "/voice-live-activity-moment/clear"), new st0[0]), "voiceActivitiesClear", "").subscribe(dhw.m115826e(new y20() { // from class: l.c5n0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gm3) tbs.m190077m(itd0.f116821c)).f104922l.m137019l(uxj0.f181467a);
            }
        }, new y20() { // from class: l.d5n0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceCenterApiProvider.m71673e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C22421c<bkj0<List<String>, kfn0, String>> refreshStoppedTopicVoiceRoom(final bkj0<List<String>, String, String> bkj0Var, boolean z) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b(z ? "/feed/recommend/voice-lives" : "/voice-lives"), st0.m187803a("with", "voice-rooms,users,voice-live-user-mask"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), st0.m187803a("source", bkj0Var.f77083c), st0.m187803a("action", "refresh-stopped"), st0.m187803a("ids", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(bkj0Var.f77081a)), st0.m187803a("voice-room-topic", bkj0Var.f77082b)), "refreshStoppedTopicVoiceRoom").map(new qcj() { // from class: l.i5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.m71670b(bkj0Var, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<bkj0<List<String>, kfn0, String>> refreshSwipTopicRooms(List<String> list, final String str, final String str2, final boolean z) {
        return requestTopicVoiceRooms(list, str2, z).map(new qcj() { // from class: l.f5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.stoppedTopicVoiceIdList((kfn0) obj, str, str2);
            }
        }).flatMap(new qcj() { // from class: l.g5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceCenterApiProvider.refreshStoppedTopicVoiceRoom((bkj0) obj, z);
            }
        });
    }

    private static C22421c<kfn0> requestTopicVoiceRooms(List<String> list, String str, boolean z) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b(z ? "/feed/recommend/voice-lives" : "/voice-lives"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, GiftAction.given), st0.m187803a("with", "voice-lives,voice-rooms,voice-live-user-mask,users"), st0.m187803a("source", str), st0.m187803a("ids", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list))), "requestTopicVoiceRooms").map(new s2v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bkj0<List<String>, String, String> stoppedTopicVoiceIdList(kfn0 kfn0Var, String str, String str2) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(kfn0Var.f126460a, new y20() { // from class: l.k5n0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceCenterApiProvider.m71678j(arrayList, (BLiveVoiceRoomFeed) obj);
            }
        });
        return new bkj0<>(arrayList, str, str2);
    }
}
