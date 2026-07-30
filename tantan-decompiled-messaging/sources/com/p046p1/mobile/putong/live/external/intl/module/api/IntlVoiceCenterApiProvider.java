package com.p046p1.mobile.putong.live.external.intl.module.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p046p1.mobile.putong.live.base.apibean.IntlVoiceSquareCampaignBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.cll;
import p149l.e30;
import p149l.g6n0;
import p149l.g7t;
import p149l.mt0;
import p149l.r0v;
import p149l.tvp;
import p149l.vnq;
import p149l.vwb;
import p149l.w9j;
import p149l.x4u;
import p149l.xaj0;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class IntlVoiceCenterApiProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xaj0 m70230b(xaj0 xaj0Var, BLiveEnvelope bLiveEnvelope) {
        return new xaj0((List) xaj0Var.f191751a, new g6n0(bLiveEnvelope), (String) xaj0Var.f191753c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m70232d(List list, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        if (x4u.m207031q(bLiveVoiceRoomFeed.state)) {
            return;
        }
        list.add(bLiveVoiceRoomFeed.liveId);
    }

    public static C22306c<IntlVoiceLiveActivitiesCellBean> getVoiceActivitiesChatData() {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m67315u(ytr.m216073b("/feed/voice-live-activities-cell"), new mt0[0]), "getVoiceActivitiesChatData", g7t.m124730c(IntlVoiceLiveActivitiesCellBean.class, "intlVoiceLiveActivitiesCell"));
    }

    public static C22306c<List<BLiveVoiceTab>> getVoiceLiveTabs() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b(tvp.INSTANCE.m190774d() ? "/feed/voice-live-tabs" : "/voice-live-tabs"), new mt0[0]), "getVoiceLiveTabs").map(new w9j() { // from class: l.aqp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceTabs;
            }
        });
    }

    public static C22306c<IntlVoiceSquareCampaignBean> getVoiceSquareCampaignData(int i) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/voice-recommend-page-campaign")).m107524p();
        if (i > 0) {
            c16188aM107524p.m107536c("staySeconds", i + "");
        }
        return LiveExternalApi.buildLiveRead(c16188aM107524p.m107537d(), "getVoiceSquareCampaignData", g7t.m124729b(IntlVoiceSquareCampaignBean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C22306c<xaj0<List<String>, g6n0, String>> refreshStoppedTopicVoiceRoom(final xaj0<List<String>, String, String> xaj0Var) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/feed/recommend/voice-lives"), mt0.m156174a("with", "voice-rooms"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), mt0.m156174a("source", xaj0Var.f191753c), mt0.m156174a("action", "refresh-stopped"), mt0.m156174a("ids", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(xaj0Var.f191751a)), mt0.m156174a("voice-room-topic", xaj0Var.f191752b)), "refreshStoppedTopicVoiceRoom").map(new w9j() { // from class: l.zpp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.m70230b(xaj0Var, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<xaj0<List<String>, g6n0, String>> refreshSwipTopicRooms(List<String> list, final String str, final String str2) {
        return requestTopicVoiceRooms(list, str2).map(new w9j() { // from class: l.xpp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.stoppedTopicVoiceIdList((g6n0) obj, str, str2);
            }
        }).flatMap(new w9j() { // from class: l.ypp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.refreshStoppedTopicVoiceRoom((xaj0) obj);
            }
        });
    }

    private static C22306c<g6n0> requestTopicVoiceRooms(List<String> list, String str) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m67315u(ytr.m216073b("/feed/recommend/voice-lives"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, GiftAction.given), mt0.m156174a("with", "voice-rooms"), mt0.m156174a("source", str), mt0.m156174a("ids", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list))), "requestTopicVoiceRooms").map(new r0v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static xaj0<List<String>, String, String> stoppedTopicVoiceIdList(g6n0 g6n0Var, String str, String str2) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(g6n0Var.f101294a, new e30() { // from class: l.bqp
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlVoiceCenterApiProvider.m70232d(arrayList, (BLiveVoiceRoomFeed) obj);
            }
        });
        return new xaj0<>(arrayList, str, str2);
    }
}
