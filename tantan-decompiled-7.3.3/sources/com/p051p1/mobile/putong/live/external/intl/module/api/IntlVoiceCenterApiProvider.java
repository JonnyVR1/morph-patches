package com.p051p1.mobile.putong.live.external.intl.module.api;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceLiveActivitiesCellBean;
import com.p051p1.mobile.putong.live.base.apibean.IntlVoiceSquareCampaignBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomFeed;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTab;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlVoiceCenterApiProvider;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.bkj0;
import p153l.h9t;
import p153l.jyb;
import p153l.kfn0;
import p153l.qcj;
import p153l.rnl;
import p153l.s2v;
import p153l.st0;
import p153l.txp;
import p153l.upq;
import p153l.y20;
import p153l.y6u;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlVoiceCenterApiProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ bkj0 m71413b(bkj0 bkj0Var, BLiveEnvelope bLiveEnvelope) {
        return new bkj0((List) bkj0Var.f77081a, new kfn0(bLiveEnvelope), (String) bkj0Var.f77083c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m71415d(List list, BLiveVoiceRoomFeed bLiveVoiceRoomFeed) {
        if (y6u.m214513q(bLiveVoiceRoomFeed.state)) {
            return;
        }
        list.add(bLiveVoiceRoomFeed.liveId);
    }

    public static C22421c<IntlVoiceLiveActivitiesCellBean> getVoiceActivitiesChatData() {
        return LiveExternalApi.buildLiveRead(LiveApiBuilder.m68498u(zvr.m221802b("/feed/voice-live-activities-cell"), new st0[0]), "getVoiceActivitiesChatData", h9t.m134086c(IntlVoiceLiveActivitiesCellBean.class, "intlVoiceLiveActivitiesCell"));
    }

    public static C22421c<List<BLiveVoiceTab>> getVoiceLiveTabs() {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b(txp.INSTANCE.m193527d() ? "/feed/voice-live-tabs" : "/voice-live-tabs"), new st0[0]), "getVoiceLiveTabs").map(new qcj() { // from class: l.asp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceTabs;
            }
        });
    }

    public static C22421c<IntlVoiceSquareCampaignBean> getVoiceSquareCampaignData(int i) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/voice-recommend-page-campaign")).m182288p();
        if (i > 0) {
            c19886aM182288p.m182300c("staySeconds", i + "");
        }
        return LiveExternalApi.buildLiveRead(c19886aM182288p.m182301d(), "getVoiceSquareCampaignData", h9t.m134085b(IntlVoiceSquareCampaignBean.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C22421c<bkj0<List<String>, kfn0, String>> refreshStoppedTopicVoiceRoom(final bkj0<List<String>, String, String> bkj0Var) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/feed/recommend/voice-lives"), st0.m187803a("with", "voice-rooms"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested), st0.m187803a("source", bkj0Var.f77083c), st0.m187803a("action", "refresh-stopped"), st0.m187803a("ids", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(bkj0Var.f77081a)), st0.m187803a("voice-room-topic", bkj0Var.f77082b)), "refreshStoppedTopicVoiceRoom").map(new qcj() { // from class: l.zrp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.m71413b(bkj0Var, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<bkj0<List<String>, kfn0, String>> refreshSwipTopicRooms(List<String> list, final String str, final String str2) {
        return requestTopicVoiceRooms(list, str2).map(new qcj() { // from class: l.xrp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.stoppedTopicVoiceIdList((kfn0) obj, str, str2);
            }
        }).flatMap(new qcj() { // from class: l.yrp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlVoiceCenterApiProvider.refreshStoppedTopicVoiceRoom((bkj0) obj);
            }
        });
    }

    private static C22421c<kfn0> requestTopicVoiceRooms(List<String> list, String str) {
        return LiveExternalApi.buildLiveReadReq(LiveApiBuilder.m68498u(zvr.m221802b("/feed/recommend/voice-lives"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, GiftAction.given), st0.m187803a("with", "voice-rooms"), st0.m187803a("source", str), st0.m187803a("ids", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list))), "requestTopicVoiceRooms").map(new s2v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static bkj0<List<String>, String, String> stoppedTopicVoiceIdList(kfn0 kfn0Var, String str, String str2) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(kfn0Var.f126460a, new y20() { // from class: l.bsp
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlVoiceCenterApiProvider.m71415d(arrayList, (BLiveVoiceRoomFeed) obj);
            }
        });
        return new bkj0<>(arrayList, str, str2);
    }
}
