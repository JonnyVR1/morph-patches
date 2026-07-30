package com.p046p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchDetail;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSuggestDetail;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceSquareSpecChannelPopupBean;
import java.util.List;
import p133rx.C22306c;
import p149l.cll;
import p149l.g7t;
import p149l.mt0;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalSquareApi {
    public static C22306c<BLiveEnvelope> doConversationAction(String str, String str2, long j, String str3) {
        cll.C16188a c16188aM107536c = LiveApiBuilder.m67315u(ytr.m216073b("/live-chat/message-cells/" + str), new mt0[0]).m107524p().m107536c("action", str2).m107536c("tailSeq", String.valueOf(j));
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("type", str3);
        }
        return LiveBaseApi.m67337v(c16188aM107536c.m107537d(), "");
    }

    public static C22306c<LiveVoiceSuggestDetail> getGuessLikeData(String str) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/suggested-detail?" + str), new mt0[0]).m107524p().m107536c("source", FirebaseAnalytics.Event.SEARCH).m107537d(), g7t.m124730c(LiveVoiceSuggestDetail.class, "suggestedDetail"));
    }

    public static C22306c<List<VirtualVoiceGroupConversationCell>> getLikedVoiceRooms(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/live-chat/message-cells"), new mt0[0]).m107524p().m107536c("source", str).m107537d()).map(new w9j() { // from class: l.s5v
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.cells;
            }
        });
    }

    public static C22306c<LiveVoiceSearchDetail> getNextPageSearchResult(String str) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/search-detail?" + str), new mt0[0]).m107524p().m107537d(), g7t.m124730c(LiveVoiceSearchDetail.class, "searchDetail"));
    }

    public static C22306c<LiveVoiceInternalSquareBean> getNextPageTabDetail(String str, String str2, String str3) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/refresh?source=" + str3 + "&tabId=" + str + "&" + str2), new mt0[0]), g7t.m124730c(LiveVoiceInternalSquareBean.class, "tabDetail"));
    }

    public static C22306c<LiveVoiceSearchDetail> getSearchResult(String str) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/search-detail"), new mt0[0]).m107524p().m107536c(BLivePkInviteSource.query, str).m107537d(), g7t.m124730c(LiveVoiceSearchDetail.class, "searchDetail"));
    }

    public static C22306c<LiveVoiceInternalSquareBean> getTabDetail(String str, String str2) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/tab-detail"), mt0.m156174a("tabId", str), mt0.m156174a("source", str2)), g7t.m124730c(LiveVoiceInternalSquareBean.class, "tabDetail"));
    }

    public static C22306c<LiveVoiceInternalEntryBean> getVoiceSummaryEntryData(String str) {
        return LiveBaseApi.m67334s(cll.m107499l(ytr.m216073b("/voice-distribution/summary")).m107524p().m107536c("source", str).m107537d(), g7t.m124730c(LiveVoiceInternalEntryBean.class, "summary"));
    }

    public static void notifyLeaveVoiceSquare() {
        LiveBaseApi.m67338w(LiveApiBuilder.m67307m(ytr.m216073b("/voice-distribution/leaveSquare")).m107537d(), "");
    }

    public static C22306c<BaseLiveBean> postClearSummaryEntryRedSpot() {
        return LiveBaseApi.m67339x(cll.m107499l(ytr.m216073b("/voice-distribution/live-counters")).m107524p().m107537d(), "", g7t.m124729b(BaseLiveBean.class));
    }

    public static C22306c<BaseLiveListBean<LiveQuickEntrySuggested>> requestEntrysSuggested(String str) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67307m(ytr.m216073b("/voice-distribution/voiceLives?search=suggested&source=" + str)).m107537d(), g7t.m124728a(LiveQuickEntrySuggested.class, "voiceLives"));
    }

    public static C22306c<LiveVoiceInternalSquareHeaderBean> requestHeaders() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/head-entrys"), new mt0[0]), g7t.m124729b(LiveVoiceInternalSquareHeaderBean.class));
    }

    public static C22306c<LiveVoiceInternalSquareSingleEntryBean> requestRandom(String str) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/random-entry"), mt0.m156174a("tabId", str)), g7t.m124730c(LiveVoiceInternalSquareSingleEntryBean.class, "randomEntry"));
    }

    public static C22306c<BaseLiveListBean<LiveQuickEntrySuggested>> requestSuggestVoiceLive(String str, String str2) {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67307m(ytr.m216073b("/voice-distribution/voiceLives")).m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str).m107536c("liveId", str2).m107537d(), g7t.m124728a(LiveQuickEntrySuggested.class, "voiceLives"));
    }

    public static C22306c<BaseLiveListBean<LiveVoiceInternalSquareTabBean>> requestTab() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/tab-list"), new mt0[0]), g7t.m124728a(LiveVoiceInternalSquareTabBean.class, "tabList"));
    }

    public static C22306c<LiveVoiceSquareSpecChannelPopupBean> squarePopup() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/voice-distribution/square-spec-channel-popup"), new mt0[0]), g7t.m124730c(LiveVoiceSquareSpecChannelPopupBean.class, "voiceSquareSpecChannelPopup"));
    }

    public static C22306c<LiveVoiceInternalEntryBean> getVoiceSummaryEntryData() {
        return LiveBaseApi.m67334s(cll.m107499l(ytr.m216073b("/voice-distribution/summary")).m107524p().m107537d(), g7t.m124730c(LiveVoiceInternalEntryBean.class, "summary"));
    }

    public static C22306c<LiveVoiceSuggestDetail> getGuessLikeData() {
        return getGuessLikeData("");
    }
}
