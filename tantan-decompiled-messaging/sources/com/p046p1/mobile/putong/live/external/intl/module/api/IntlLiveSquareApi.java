package com.p046p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.cll;
import p149l.fbn;
import p149l.g7t;
import p149l.gl3;
import p149l.gld0;
import p149l.jj3;
import p149l.mkd0;
import p149l.nj3;
import p149l.q5c;
import p149l.s9s;
import p149l.tzn;
import p149l.vnq;
import p149l.w9j;
import p149l.ytr;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareApi {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ LiveSquareSummaryInfo m70222c(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        LiveSquareSummaryInfo liveSquareSummaryInfo = new LiveSquareSummaryInfo(q5c.m172995a(bLiveData.lives), q5c.m172996b(bLiveData.rooms), bLiveData.users, bLiveData.liveSquareSummaries);
        liveSquareSummaryInfo.setFollowShips(bLiveData.followships);
        return liveSquareSummaryInfo;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ z6o m70223d(BLiveEnvelope bLiveEnvelope) {
        return new z6o(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    public static C22306c<BLiveEnvelope> getLiveActivityEntranceInfo() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(fbn.INSTANCE.m120382v() ? ytr.m216073b("/feed/live-square-entrance-summary") : ytr.m216073b("/live-square-entrance-summary")), "liveActivitySignInInfo");
    }

    public static C22306c<BLiveEnvelope> getLiveActivitySignInRecommendRoom(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/lives?" + str)), "liveActivitySignInRecommendRoom");
    }

    public static C22306c<BLiveEnvelope> getLiveActivitySummaryInSquare() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live-activity-summaries")).m107524p().m107536c("with", "live-feeds,voice-lives,live-feeds,users,voice-rooms").m107536c("source", "live-square-detail").m107537d(), "liveActivitySummaryInSquare");
    }

    public static C22306c<LiveSquareBannersBean> getLiveBanners(@NonNull String str, String str2, String str3) {
        return LiveExternalApi.buildLiveRead(cll.m107501r(ytr.m216078g("")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("bannerType", str2).m107536c("source", str3).m107537d(), Banners.TYPE + str, g7t.m124729b(LiveSquareBannersBean.class));
    }

    public static C22306c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo(String str) {
        if (str == null) {
            str = "";
        }
        fbn.Companion companion = fbn.INSTANCE;
        return (companion.m120382v() ? companion.m120379s(str) : loadLiveSquare(str)).map(new w9j() { // from class: l.uzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareApi.m70222c((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveEnvelope> getMultiLiveRandomJoin(String str) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-schemas")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(FirebaseAnalytics.Event.SEARCH, str);
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
                e.printStackTrace();
            }
            c16188aM107524p.m107536c(FirebaseAnalytics.Event.SEARCH, jSONObject.toString());
        }
        return LiveExternalApi.buildLiveReadReq(c16188aM107524p.m107537d(), "getMultiLiveRandomJoin" + str);
    }

    public static C22306c<List<BLiveMenuItem>> getSquareMenuItems() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/square-menu-items")).m107524p().m107536c("source", "live-square").m107537d(), "liveSquareMenulist").map(new w9j() { // from class: l.vzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    public static C22306c<List<BLiveMenuItem>> getVoiceSquareMenuItems() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/voice-room/square-menu-items")).m107524p().m107536c("source", "voice-square").m107537d(), "voiceSquareMenulist").map(new w9j() { // from class: l.qzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    private static C22306c<BLiveEnvelope> loadLiveSquare(String str) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-square-summaries")).m107524p().m107536c("with", "lives,rooms,users,followships,relationships");
        if (!((jj3) s9s.m182763m(gld0.f103314d)).f118220a.get().booleanValue()) {
            c16188aM107536c.m107536c("localDot", "init");
        } else if (needShowActivitiesRedDot(true)) {
            c16188aM107536c.m107536c("localDot", "video");
        }
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("source", str);
        }
        return LiveExternalApi.buildLiveReadReqIO(c16188aM107536c.m107537d(), "live-square-summaries").doOnNext(new tzn()).compose(mkd0.m154951C());
    }

    public static boolean needShowActivitiesRedDot(boolean z) {
        int iM195919q3;
        BLiveActivityCounter bLiveActivityCounter;
        BLiveCounter bLiveCounterM159627i = ((nj3) s9s.m182763m(gld0.f103312b)).m159627i();
        return (bLiveCounterM159627i == null || (bLiveActivityCounter = bLiveCounterM159627i.activity) == null || bLiveActivityCounter.total > 0) && (iM195919q3 = s9s.f163228b.m195919q3()) != 0 && System.currentTimeMillis() - ((gl3) s9s.m182763m(gld0.f103315e)).f103280a.get().longValue() >= ((long) iM195919q3) * 86400000;
    }

    public static C22306c<List<BLiveSuggestLive>> queryCurrentLivesInfo(@NonNull List<String> list, boolean z) {
        String strM199044d = vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list);
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b(z ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m107536c("ids", strM199044d).m107537d(), "ids" + strM199044d).map(new w9j() { // from class: l.szn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.suggestedLives;
            }
        });
    }

    public static C22306c<z6o> refreshStoppedLivesV2(@NonNull List<String> list, @NonNull List<String> list2, String str, boolean z) {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b(z ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "refresh-stopped").m107536c("oldIds", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list)).m107536c("recommend-categories", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list2)).m107536c("source", str).m107536c("action", "refresh-stopped").m107537d(), "refreshStoppedLive" + list + str).map(new w9j() { // from class: l.rzn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareApi.m70223d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo() {
        return getLiveSquareSummaryInfo("");
    }

    public static boolean needShowActivitiesRedDot() {
        return needShowActivitiesRedDot(false);
    }
}
