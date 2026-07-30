package com.p051p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchDetail;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSuggestDetail;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareHeaderBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareTabBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceSquareSpecChannelPopupBean;
import java.util.List;
import p137rx.C22421c;
import p153l.h9t;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalSquareApi {
    public static C22421c<BLiveEnvelope> doConversationAction(String str, String str2, long j, String str3) {
        rnl.C19886a c19886aM182300c = LiveApiBuilder.m68498u(zvr.m221802b("/live-chat/message-cells/" + str), new st0[0]).m182288p().m182300c("action", str2).m182300c("tailSeq", String.valueOf(j));
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("type", str3);
        }
        return LiveBaseApi.m68520v(c19886aM182300c.m182301d(), "");
    }

    public static C22421c<LiveVoiceSuggestDetail> getGuessLikeData(String str) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/suggested-detail?" + str), new st0[0]).m182288p().m182300c("source", FirebaseAnalytics.Event.SEARCH).m182301d(), h9t.m134086c(LiveVoiceSuggestDetail.class, "suggestedDetail"));
    }

    public static C22421c<List<VirtualVoiceGroupConversationCell>> getLikedVoiceRooms(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/live-chat/message-cells"), new st0[0]).m182288p().m182300c("source", str).m182301d()).map(new qcj() { // from class: l.t7v
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.cells;
            }
        });
    }

    public static C22421c<LiveVoiceSearchDetail> getNextPageSearchResult(String str) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/search-detail?" + str), new st0[0]).m182288p().m182301d(), h9t.m134086c(LiveVoiceSearchDetail.class, "searchDetail"));
    }

    public static C22421c<LiveVoiceInternalSquareBean> getNextPageTabDetail(String str, String str2, String str3) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/refresh?source=" + str3 + "&tabId=" + str + "&" + str2), new st0[0]), h9t.m134086c(LiveVoiceInternalSquareBean.class, "tabDetail"));
    }

    public static C22421c<LiveVoiceSearchDetail> getSearchResult(String str) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/search-detail"), new st0[0]).m182288p().m182300c(BLivePkInviteSource.query, str).m182301d(), h9t.m134086c(LiveVoiceSearchDetail.class, "searchDetail"));
    }

    public static C22421c<LiveVoiceInternalSquareBean> getTabDetail(String str, String str2) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/tab-detail"), st0.m187803a("tabId", str), st0.m187803a("source", str2)), h9t.m134086c(LiveVoiceInternalSquareBean.class, "tabDetail"));
    }

    public static C22421c<LiveVoiceInternalEntryBean> getVoiceSummaryEntryData(String str) {
        return LiveBaseApi.m68517s(rnl.m182263l(zvr.m221802b("/voice-distribution/summary")).m182288p().m182300c("source", str).m182301d(), h9t.m134086c(LiveVoiceInternalEntryBean.class, "summary"));
    }

    public static void notifyLeaveVoiceSquare() {
        LiveBaseApi.m68521w(LiveApiBuilder.m68490m(zvr.m221802b("/voice-distribution/leaveSquare")).m182301d(), "");
    }

    public static C22421c<BaseLiveBean> postClearSummaryEntryRedSpot() {
        return LiveBaseApi.m68522x(rnl.m182263l(zvr.m221802b("/voice-distribution/live-counters")).m182288p().m182301d(), "", h9t.m134085b(BaseLiveBean.class));
    }

    public static C22421c<BaseLiveListBean<LiveQuickEntrySuggested>> requestEntrysSuggested(String str) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68490m(zvr.m221802b("/voice-distribution/voiceLives?search=suggested&source=" + str)).m182301d(), h9t.m134084a(LiveQuickEntrySuggested.class, "voiceLives"));
    }

    public static C22421c<LiveVoiceInternalSquareHeaderBean> requestHeaders() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/head-entrys"), new st0[0]), h9t.m134085b(LiveVoiceInternalSquareHeaderBean.class));
    }

    public static C22421c<LiveVoiceInternalSquareSingleEntryBean> requestRandom(String str) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/random-entry"), st0.m187803a("tabId", str)), h9t.m134086c(LiveVoiceInternalSquareSingleEntryBean.class, "randomEntry"));
    }

    public static C22421c<BaseLiveListBean<LiveQuickEntrySuggested>> requestSuggestVoiceLive(String str, String str2) {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68490m(zvr.m221802b("/voice-distribution/voiceLives")).m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str).m182300c("liveId", str2).m182301d(), h9t.m134084a(LiveQuickEntrySuggested.class, "voiceLives"));
    }

    public static C22421c<BaseLiveListBean<LiveVoiceInternalSquareTabBean>> requestTab() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/tab-list"), new st0[0]), h9t.m134084a(LiveVoiceInternalSquareTabBean.class, "tabList"));
    }

    public static C22421c<LiveVoiceSquareSpecChannelPopupBean> squarePopup() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/voice-distribution/square-spec-channel-popup"), new st0[0]), h9t.m134086c(LiveVoiceSquareSpecChannelPopupBean.class, "voiceSquareSpecChannelPopup"));
    }

    public static C22421c<LiveVoiceInternalEntryBean> getVoiceSummaryEntryData() {
        return LiveBaseApi.m68517s(rnl.m182263l(zvr.m221802b("/voice-distribution/summary")).m182288p().m182301d(), h9t.m134086c(LiveVoiceInternalEntryBean.class, "summary"));
    }

    public static C22421c<LiveVoiceSuggestDetail> getGuessLikeData() {
        return getGuessLikeData("");
    }
}
