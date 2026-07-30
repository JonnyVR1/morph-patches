package com.p051p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.bk3;
import p153l.fdn;
import p153l.fk3;
import p153l.fm3;
import p153l.h9t;
import p153l.itd0;
import p153l.psd0;
import p153l.qcj;
import p153l.rnl;
import p153l.t1o;
import p153l.tbs;
import p153l.upq;
import p153l.w6c;
import p153l.z8o;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareApi {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ LiveSquareSummaryInfo m71405c(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        LiveSquareSummaryInfo liveSquareSummaryInfo = new LiveSquareSummaryInfo(w6c.m205088a(bLiveData.lives), w6c.m205089b(bLiveData.rooms), bLiveData.users, bLiveData.liveSquareSummaries);
        liveSquareSummaryInfo.setFollowShips(bLiveData.followships);
        return liveSquareSummaryInfo;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ z8o m71406d(BLiveEnvelope bLiveEnvelope) {
        return new z8o(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    public static C22421c<BLiveEnvelope> getLiveActivityEntranceInfo() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(fdn.INSTANCE.m125126v() ? zvr.m221802b("/feed/live-square-entrance-summary") : zvr.m221802b("/live-square-entrance-summary")), "liveActivitySignInInfo");
    }

    public static C22421c<BLiveEnvelope> getLiveActivitySignInRecommendRoom(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/lives?" + str)), "liveActivitySignInRecommendRoom");
    }

    public static C22421c<BLiveEnvelope> getLiveActivitySummaryInSquare() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live-activity-summaries")).m182288p().m182300c("with", "live-feeds,voice-lives,live-feeds,users,voice-rooms").m182300c("source", "live-square-detail").m182301d(), "liveActivitySummaryInSquare");
    }

    public static C22421c<LiveSquareBannersBean> getLiveBanners(@NonNull String str, String str2, String str3) {
        return LiveExternalApi.buildLiveRead(rnl.m182265r(zvr.m221807g("")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("bannerType", str2).m182300c("source", str3).m182301d(), Banners.TYPE + str, h9t.m134085b(LiveSquareBannersBean.class));
    }

    public static C22421c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo(String str) {
        if (str == null) {
            str = "";
        }
        fdn.Companion companion = fdn.INSTANCE;
        return (companion.m125126v() ? companion.m125123s(str) : loadLiveSquare(str)).map(new qcj() { // from class: l.u1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareApi.m71405c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveEnvelope> getMultiLiveRandomJoin(String str) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-schemas")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(FirebaseAnalytics.Event.SEARCH, str);
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
                e.printStackTrace();
            }
            c19886aM182288p.m182300c(FirebaseAnalytics.Event.SEARCH, jSONObject.toString());
        }
        return LiveExternalApi.buildLiveReadReq(c19886aM182288p.m182301d(), "getMultiLiveRandomJoin" + str);
    }

    public static C22421c<List<BLiveMenuItem>> getSquareMenuItems() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/square-menu-items")).m182288p().m182300c("source", "live-square").m182301d(), "liveSquareMenulist").map(new qcj() { // from class: l.v1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    public static C22421c<List<BLiveMenuItem>> getVoiceSquareMenuItems() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/voice-room/square-menu-items")).m182288p().m182300c("source", "voice-square").m182301d(), "voiceSquareMenulist").map(new qcj() { // from class: l.q1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    private static C22421c<BLiveEnvelope> loadLiveSquare(String str) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-square-summaries")).m182288p().m182300c("with", "lives,rooms,users,followships,relationships");
        if (!((bk3) tbs.m190077m(itd0.f116822d)).f77038a.get().booleanValue()) {
            c19886aM182300c.m182300c("localDot", "init");
        } else if (needShowActivitiesRedDot(true)) {
            c19886aM182300c.m182300c("localDot", "video");
        }
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("source", str);
        }
        return LiveExternalApi.buildLiveReadReqIO(c19886aM182300c.m182301d(), "live-square-summaries").doOnNext(new t1o()).compose(psd0.m173592C());
    }

    public static boolean needShowActivitiesRedDot(boolean z) {
        int iM203706q3;
        BLiveActivityCounter bLiveActivityCounter;
        BLiveCounter bLiveCounterM125958i = ((fk3) tbs.m190077m(itd0.f116820b)).m125958i();
        return (bLiveCounterM125958i == null || (bLiveActivityCounter = bLiveCounterM125958i.activity) == null || bLiveActivityCounter.total > 0) && (iM203706q3 = tbs.f172989b.m203706q3()) != 0 && System.currentTimeMillis() - ((fm3) tbs.m190077m(itd0.f116823e)).f99711a.get().longValue() >= ((long) iM203706q3) * 86400000;
    }

    public static C22421c<List<BLiveSuggestLive>> queryCurrentLivesInfo(@NonNull List<String> list, boolean z) {
        String strM197179d = upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list);
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b(z ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m182300c("ids", strM197179d).m182301d(), "ids" + strM197179d).map(new qcj() { // from class: l.s1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.suggestedLives;
            }
        });
    }

    public static C22421c<z8o> refreshStoppedLivesV2(@NonNull List<String> list, @NonNull List<String> list2, String str, boolean z) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b(z ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "refresh-stopped").m182300c("oldIds", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list)).m182300c("recommend-categories", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list2)).m182300c("source", str).m182300c("action", "refresh-stopped").m182301d(), "refreshStoppedLive" + list + str).map(new qcj() { // from class: l.r1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareApi.m71406d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo() {
        return getLiveSquareSummaryInfo("");
    }

    public static boolean needShowActivitiesRedDot() {
        return needShowActivitiesRedDot(false);
    }
}
