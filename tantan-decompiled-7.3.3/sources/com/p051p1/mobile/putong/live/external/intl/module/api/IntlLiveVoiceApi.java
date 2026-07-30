package com.p051p1.mobile.putong.live.external.intl.module.api;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignTemplateDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFeedBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserRealVoiceLive;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveVoiceApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.List;
import p137rx.C22421c;
import p153l.h9t;
import p153l.kfn0;
import p153l.qcj;
import p153l.rnl;
import p153l.s2v;
import p153l.vpn0;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveVoiceApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ vpn0 m71408a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new vpn0(false, bLiveData.voiceLiveUserFeedList, bLiveData.users);
    }

    public static C22421c<LiveCampaignTemplateDetail> getCampaignTemplate() {
        return LiveExternalApi.buildLiveRead(rnl.m182263l(zvr.m221802b("/voiceCampaignTemplate/showWindow")).m182288p().m182301d(), "/voiceCampaignTemplate/showWindow", h9t.m134086c(LiveCampaignTemplateDetail.class, ""));
    }

    public static C22421c<List<BLiveVoiceFeedBanners>> getIntlVoiceRoomSquareBanners() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/feed/voice-live-banners")).m182288p().m182301d(), "getIntlVoiceRoomSquareBanners").map(new qcj() { // from class: l.wao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLiveBanners;
            }
        });
    }

    public static C22421c<BLiveVoiceUserRealVoiceLive> getIntlVoiceRoomSquareRealShipLinkInfo(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/feed/anchor-user/" + str + "/voice-lives")).m182288p().m182301d(), "getIntlVoiceRoomSquareRealShipLinkInfo").map(new qcj() { // from class: l.yao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userRealVoiceLive;
            }
        });
    }

    public static C22421c<vpn0> getIntlVoiceRoomSquareShipLinks() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/feed/voice-lives-recommend-users")).m182288p().m182301d(), "getIntlVoiceRoomSquareShipLinks").map(new qcj() { // from class: l.xao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveVoiceApi.m71408a((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<kfn0> getLiveListInTopic(String str, String str2, long j, int i, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/feed/recommend/voice-lives")).m182288p().m182300c("voice-room-topic", str2).m182300c("with", "voice-rooms").m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c(Constants.KEY_LIMIT, String.valueOf(i));
        if (j >= 0) {
            c19886aM182300c.m182300c("until", String.valueOf(j));
        }
        c19886aM182300c.m182300c("orderBy", str3);
        return LiveExternalApi.buildLiveReadReq(c19886aM182300c.m182301d(), "getLiveListInTopic" + str2).map(new s2v());
    }

    public static C22421c<kfn0> getLiveListInTopicNextPage(@NonNull Pagination pagination, String str, String str2, String str3) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(rnl.m182263l(zvr.m221802b("/feed/recommend/voice-lives")).m182288p().m182300c("voice-room-topic", str2).m182300c("with", "voice-rooms").m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c("orderBy", str3).toString() + "&" + pagination.links.next), "getLiveListInTopic" + str2).filter(new qcj() { // from class: l.vao
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj) != null);
            }
        }).map(new s2v());
    }
}
