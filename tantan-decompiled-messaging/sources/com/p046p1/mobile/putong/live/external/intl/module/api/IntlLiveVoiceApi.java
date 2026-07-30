package com.p046p1.mobile.putong.live.external.intl.module.api;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignTemplateDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserRealVoiceLive;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.List;
import p133rx.C22306c;
import p149l.cll;
import p149l.g6n0;
import p149l.g7t;
import p149l.r0v;
import p149l.rgn0;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveVoiceApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ rgn0 m70225a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new rgn0(false, bLiveData.voiceLiveUserFeedList, bLiveData.users);
    }

    public static C22306c<LiveCampaignTemplateDetail> getCampaignTemplate() {
        return LiveExternalApi.buildLiveRead(cll.m107499l(ytr.m216073b("/voiceCampaignTemplate/showWindow")).m107524p().m107537d(), "/voiceCampaignTemplate/showWindow", g7t.m124730c(LiveCampaignTemplateDetail.class, ""));
    }

    public static C22306c<List<BLiveVoiceFeedBanners>> getIntlVoiceRoomSquareBanners() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/feed/voice-live-banners")).m107524p().m107537d(), "getIntlVoiceRoomSquareBanners").map(new w9j() { // from class: l.w8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveBanners;
            }
        });
    }

    public static C22306c<BLiveVoiceUserRealVoiceLive> getIntlVoiceRoomSquareRealShipLinkInfo(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/feed/anchor-user/" + str + "/voice-lives")).m107524p().m107537d(), "getIntlVoiceRoomSquareRealShipLinkInfo").map(new w9j() { // from class: l.y8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userRealVoiceLive;
            }
        });
    }

    public static C22306c<rgn0> getIntlVoiceRoomSquareShipLinks() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/feed/voice-lives-recommend-users")).m107524p().m107537d(), "getIntlVoiceRoomSquareShipLinks").map(new w9j() { // from class: l.x8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveVoiceApi.m70225a((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<g6n0> getLiveListInTopic(String str, String str2, long j, int i, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/feed/recommend/voice-lives")).m107524p().m107536c("voice-room-topic", str2).m107536c("with", "voice-rooms").m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c(Constants.KEY_LIMIT, String.valueOf(i));
        if (j >= 0) {
            c16188aM107536c.m107536c("until", String.valueOf(j));
        }
        c16188aM107536c.m107536c("orderBy", str3);
        return LiveExternalApi.buildLiveReadReq(c16188aM107536c.m107537d(), "getLiveListInTopic" + str2).map(new r0v());
    }

    public static C22306c<g6n0> getLiveListInTopicNextPage(@NonNull Pagination pagination, String str, String str2, String str3) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(cll.m107499l(ytr.m216073b("/feed/recommend/voice-lives")).m107524p().m107536c("voice-room-topic", str2).m107536c("with", "voice-rooms").m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c("orderBy", str3).toString() + "&" + pagination.links.next), "getLiveListInTopic" + str2).filter(new w9j() { // from class: l.v8o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj) != null);
            }
        }).map(new r0v());
    }
}
