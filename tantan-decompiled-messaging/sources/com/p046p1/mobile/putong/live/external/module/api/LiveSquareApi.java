package com.p046p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p046p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p046p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSetPrivacyPrivilege;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.a0l;
import p149l.a3d0;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.g7t;
import p149l.gld0;
import p149l.jo0;
import p149l.kxt;
import p149l.mkd0;
import p149l.mt0;
import p149l.nj3;
import p149l.o3u;
import p149l.q5c;
import p149l.qrr;
import p149l.s8k0;
import p149l.s9s;
import p149l.soj0;
import p149l.tzn;
import p149l.vb20;
import p149l.vnq;
import p149l.vwb;
import p149l.w0d0;
import p149l.w9j;
import p149l.wq2;
import p149l.x0d0;
import p149l.xh5;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareApi {
    public static final String WEALTH_TYPE_HIDE_CARD = "hideCard";
    public static final String WEALTH_TYPE_HIDE_FEED = "hideFeed";
    public static final String WEALTH_TYPE_HIDE_PROFILE = "hideProfile";
    private static final Pattern limitPattern = Pattern.compile("&limit=(\\d+)");
    private static final Gson gson = new Gson();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m70433A(BLiveEnvelope bLiveEnvelope) {
        gld0<nj3> gld0Var = gld0.f103312b;
        if (((nj3) s9s.m182763m(gld0Var)).f139193q.m221515e() == null) {
            ((nj3) s9s.m182763m(gld0Var)).f139193q.m132487l(Boolean.valueOf(bLiveEnvelope.data.exchangeTTCRedpoint));
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m70437E(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m70439G(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ x0d0 m70440H(boolean z, BLiveEnvelope bLiveEnvelope) {
        return new x0d0(bLiveEnvelope.data.rightBindAnchors, bLiveEnvelope.pagination, z);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ o3u m70441I(BLiveEnvelope bLiveEnvelope) {
        o3u o3uVar = new o3u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
        o3uVar.f141710d = bLiveEnvelope.data.bigTVLives;
        return o3uVar;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ LiveAnchorsInfo m70443K(String str, BLiveData bLiveData) {
        ArrayList arrayList = new ArrayList(bLiveData.voiceLives);
        List<BLive> list = bLiveData.lives;
        if (list != null) {
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = new ArrayList(bLiveData.voiceRooms);
        List<BLiveRoom> list2 = bLiveData.rooms;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        return new LiveAnchorsInfo(bLiveData.anchors, arrayList, arrayList2, bLiveData.users, str);
    }

    public static C22306c<BLiveEnvelope> activeUserRight(UserRightType userRightType, w0d0 w0d0Var) {
        return userRightActions(userRightType, w0d0Var, "activate");
    }

    public static C22306c<BLiveEnvelope> bindRightToAnchor(UserRightType userRightType, BLiveRightAnchorResultList bLiveRightAnchorResultList) {
        return LiveBaseApi.m67340y(cll.m107499l(ytr.m216073b(userRightType.getBindRightsToAnchorUrlStr())), bLiveRightAnchorResultList.toJson());
    }

    public static C22306c<BLiveEnvelope> changeWealthIconShowStatusNew(String str, boolean z) {
        String str2;
        str.getClass();
        String string = "";
        if (str.equals("hideCard")) {
            str2 = "swipe";
        } else {
            str2 = !str.equals("hideProfile") ? "" : "profile";
        }
        String strM216079h = ytr.m216079h("/wealth-logo/switch");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("switchType", str2);
            jSONObject.put("actionType", z ? "on" : BLiveOperationTitleShowType.off);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return LiveBaseApi.m67338w(cll.m107499l(strM216079h), string);
    }

    public static C22306c<BLiveEnvelope> craftScrapToItem(@NotNull String str, @NotNull BLiveScrapCraftReq bLiveScrapCraftReq) {
        return LiveBaseApi.m67338w(cll.m107499l(ytr.m216073b("/live-gift/scraps/" + str + "/craft")).m107524p().m107537d(), bLiveScrapCraftReq.toJson());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m70447d(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bLiveEnvelope.data.users.size(); i++) {
            final User user = bLiveEnvelope.data.users.get(i);
            ((nj3) s9s.m182763m(gld0.f103312b)).m159622d(user);
            wq2 wq2Var = new wq2(user, (BLiveAbsRoom) vwb.m200346r(bLiveEnvelope.data.rooms, new w9j() { // from class: l.vxt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveRoom) obj).owner.f44419id, user.f56011id));
                }
            }), (BLiveAbsData) vwb.m200346r(bLiveEnvelope.data.lives, new w9j() { // from class: l.wxt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLive) obj).anchor.f44419id, user.f56011id));
                }
            }), (Followship) vwb.m200346r(bLiveEnvelope.data.followships, new w9j() { // from class: l.xxt
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, user.f56011id));
                }
            }));
            wq2Var.toString();
            arrayList.add(wq2Var);
        }
        return arrayList;
    }

    public static C22306c<BLiveEnvelope> equipNiceNumber(String str, String str2) {
        cll cllVarM107537d = LiveApiBuilder.m67307m(xh5.m208761i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number")).m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("number", str2);
        return LiveBaseApi.m67338w(cllVarM107537d, jsonObject.toString());
    }

    public static C22306c<BLiveFakeUser> equipUserRight(String str) {
        return LiveBaseApi.m67340y(cll.m107499l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_EQUIP)), "").map(new w9j() { // from class: l.axt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.fakeUser;
            }
        });
    }

    public static void exchangeTTCRedpoint() {
        LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-wallet/intl/exchange-ttc-redpoint"))).subscribe(ffw.m121194e(new e30() { // from class: l.sxt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70433A((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.txt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70437E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m70450g(BLiveData bLiveData) {
        if (vwb.m200296J(bLiveData.users)) {
            return;
        }
        Iterator<User> it = bLiveData.users.iterator();
        while (it.hasNext()) {
            ((nj3) s9s.m182763m(gld0.f103312b)).m159622d(it.next());
        }
    }

    public static C22306c<LiveSquareActiveGiftBean> getActiveGiftRequest() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67307m(ytr.m216073b("/live/popup?source=activity-rewards")).m107537d(), g7t.m124730c(LiveSquareActiveGiftBean.class, "livePopup"));
    }

    public static C22306c<LiveAnchorsInfo> getAnchors(String str, @Nullable String str2, @Nullable final String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/anchors")).m107524p().m107536c("source", str).m107536c("with", "live-feeds,lives,voice-lives,rooms,voice-rooms,users,relationships,followships");
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107536c.m107536c(FirebaseAnalytics.Event.SEARCH, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c(BLivePkInviteSource.query, str3);
        }
        return LiveBaseApi.m67336u(c16188aM107536c.m107537d()).doOnNext(new tzn()).compose(mkd0.m154951C()).map(new w9j() { // from class: l.lxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        }).doOnNext(new e30() { // from class: l.mxt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70450g((BLiveData) obj);
            }
        }).map(new w9j() { // from class: l.nxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70443K(str3, (BLiveData) obj);
            }
        });
    }

    public static C22306c<List<wq2>> getBrowseHistory(String str) {
        cll.C16188a c16188aM107524p = cll.m107501r(ytr.m216073b("/liveroom-browse-history/" + str)).m107524p();
        c16188aM107524p.m107536c("with", "followships,rooms,users");
        return LiveBaseApi.m67333r(c16188aM107524p.m107537d()).filter(new w9j() { // from class: l.qwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.users));
            }
        }).map(new w9j() { // from class: l.rwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70447d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BaseLiveListBean<LivePushNoticeItemBean>> getFollowPushNoticeList() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/live-push-notice/list"), new mt0[0]), g7t.m124728a(LivePushNoticeItemBean.class, "livePushNoticeList"));
    }

    @NotNull
    private static String getHideAvatarActionUrl(String str, String str2) {
        return cll.m107501r(ytr.m216073b("/userRights/")).m107524p().m107535b(str).m107535b(Constants.KEY_ACTIONS).m107535b(str2).m107537d().toString();
    }

    public static C22306c<BLiveHideAvatarEnterConfig> getHideAvatarEnable() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/userRights/mysteryConfig/enter"))).map(new w9j() { // from class: l.qxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.mysteryConfig;
            }
        });
    }

    public static C22306c<List<a0l>> getHideAvatarRight(final BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/rights/mystery/me"))).filter(new w9j() { // from class: l.swt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new w9j() { // from class: l.twt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zzk.m221020b(((BLiveEnvelope) obj).data.right, bLiveHideAvatarEnterConfig);
            }
        });
    }

    public static C22306c<BLiveHiddenConsumeRecordButton> getHideConsumeRecordEnable(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-users/" + str + "/privacy-privilege"))).map(new w9j() { // from class: l.pwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.privacyPrivilege.get(0).hiddenConsumeRecordButton;
            }
        });
    }

    public static C22306c<BLiveExtraResponse> getHideWealthIconRight() {
        return LiveBaseApi.m67335t(cll.m107499l(ytr.m216073b("/users/me/wealth-logo")), BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22306c<qrr> getLiveActivitiesInfo() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-activities")).m107524p().m107536c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives").m107536c(Constants.KEY_LIMIT, String.valueOf(50)).m107537d()).map(new kxt()).flatMap(new w9j() { // from class: l.uxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                qrr qrrVar = (qrr) obj;
                return LiveSquareApi.getLiveActivitiesSuggests(qrrVar).onErrorReturn(new w9j() { // from class: l.ext
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return LiveSquareApi.m70466w(qrrVar, (Throwable) obj2);
                    }
                });
            }
        });
    }

    public static C22306c<BLiveEnvelope> getLiveActivitiesSuggests() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-activity-suggests")).m107524p().m107536c("with", "rooms,users,lives").m107537d());
    }

    public static C22306c<BLiveEnvelope> getLiveActivityEntranceInfo() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-square-entrance-summary")));
    }

    public static C22306c<BLiveEnvelope> getLiveActivitySignInRecommendRoom(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/lives?" + str)));
    }

    public static C22306c<BLiveEnvelope> getLiveActivitySummaryInSquare() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-activity-summaries")).m107524p().m107536c("source", "live-square-detail").m107537d());
    }

    public static C22306c<LiveSquareBannersBean> getLiveBanners(@NonNull String str, String str2, String str3) {
        return LiveBaseApi.m67334s(cll.m107501r(ytr.m216078g("")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("bannerType", str2).m107536c("source", str3).m107537d(), g7t.m124729b(LiveSquareBannersBean.class));
    }

    public static C22306c<o3u> getLiveListV2(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
        String strReplaceAll;
        if (TextUtils.isEmpty(str3)) {
            strReplaceAll = "";
        } else {
            strReplaceAll = "&action=" + str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            strReplaceAll = strReplaceAll + "&" + str4;
        }
        if (i >= 0) {
            if (strReplaceAll.contains("&limit=")) {
                strReplaceAll = limitPattern.matcher(strReplaceAll).replaceAll("&limit=" + i);
            } else {
                strReplaceAll = strReplaceAll + "&limit=" + i;
            }
        }
        if (z) {
            strReplaceAll = strReplaceAll + "&expand=true";
        }
        if (!TextUtils.isEmpty(str5)) {
            strReplaceAll = strReplaceAll + "&" + str5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cll.m107499l(ytr.m216073b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("source", str2).m107536c("with", "rooms,users,").toString());
        sb.append(strReplaceAll);
        return LiveBaseApi.m67333r(cll.m107499l(sb.toString())).map(new w9j() { // from class: l.rxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70441I((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveSchema> getLiveSchema(String str) {
        return LiveBaseApi.m67335t(cll.m107501r(ytr.m216073b("/live-schemas")).m107524p().m107534a(FirebaseAnalytics.Event.SEARCH, str).m107537d(), BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.xwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.liveSchemas.get(0);
            }
        }).observeOn(jo0.m142408a());
    }

    public static C22306c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo(String str) {
        if (str == null) {
            str = "";
        }
        return loadLiveSquare(str).map(new w9j() { // from class: l.ayt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70468y((BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BLiveEnvelope> getNextLiveActivities(@NonNull Pagination pagination, @Nullable String str) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-activities")).m107524p().m107536c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives");
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("source", str);
        }
        return LiveBaseApi.m67333r(cll.m107499l(c16188aM107536c.toString() + "&" + pagination.links.next));
    }

    public static C22306c<o3u> getNextLiveListV2(String str, String str2, String str3, int i, Pagination pagination, String str4) {
        return getLiveListV2(str, str2, str3, i, pagination.links.next, false, str4, false);
    }

    public static C22306c<qrr> getNextPage(@Nullable Pagination pagination) {
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? C22306c.create(new vb20()) : getNextLiveActivities(pagination, null).map(new kxt());
    }

    public static String getNiceNumberAdaptAnchor(String str) {
        return TextUtils.isEmpty(str) ? User.ID_TEAM_ACCOUNT : str;
    }

    public static C22306c<BLiveNiceNumberDetail> getNiceNumberDetails(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67307m(xh5.m208761i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number")).m107537d()).map(new w9j() { // from class: l.ywt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.nobleNiceNumberDetail;
            }
        });
    }

    public static C22306c<BLiveNiceNumberList> getNiceNumberList(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67307m(xh5.m208761i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number-list")).m107537d()).map(new w9j() { // from class: l.zwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.nobleNiceNumberList;
            }
        });
    }

    public static C22306c<LiveAnchorsInfo> getSearchResult(String str) {
        return getAnchors("anchor-search", BLivePkInviteSource.query, str);
    }

    public static C22306c<List<BLiveMenuItem>> getSquareMenuItems() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/square-menu-items")).m107524p().m107536c("source", "live-square").m107537d()).map(new w9j() { // from class: l.pxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    public static C22306c<BLiveRightInfo> getUserRightList(UserRightType userRightType, String str, final String str2, String str3, final String str4, String str5, @Nullable final a3d0 a3d0Var) {
        return LiveBaseApi.m67333r(cll.m107499l(userRightType.getRightListUrlStr(new s8k0(str, str2, str5, str3)))).filter(new w9j() { // from class: l.fxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new w9j() { // from class: l.gxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.right;
            }
        }).doOnNext(new e30() { // from class: l.hxt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70458o(str2, str4, a3d0Var, (BLiveRightInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ o3u m70452i(BLiveEnvelope bLiveEnvelope) {
        return new o3u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    public static void livePushShown(String str) {
        LiveBaseApi.m67337v(cll.m107501r(ytr.m216073b("/live-pushes-in-app")).m107524p().m107536c("liveId", str).m107537d(), "");
    }

    private static C22306c<BLiveEnvelope> loadLiveSquare(String str) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-square-summaries")).m107524p().m107536c("with", "lives,rooms,users,followships,relationships");
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("source", str);
        }
        return LiveBaseApi.m67336u(c16188aM107536c.m107537d()).doOnNext(new tzn()).compose(mkd0.m154951C());
    }

    public static void notifyEntryMainPager() {
        LiveBaseApi.m67338w(cll.m107499l(ytr.m216073b("/live-pushes-in-app")), "");
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m70458o(String str, String str2, a3d0 a3d0Var, BLiveRightInfo bLiveRightInfo) {
        bLiveRightInfo.setRoomId(str);
        bLiveRightInfo.setAnchorName(str2);
        bLiveRightInfo.setDisplayParam(a3d0Var);
    }

    public static C22306c<BLiveCounter> patchReddot(String str) {
        return LiveBaseApi.m67338w(cll.m107499l(ytr.m216073b("/live-counters")).m107524p().m107536c("intent", str).m107537d(), "").map(new w9j() { // from class: l.wwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static C22306c<List<BLiveSuggestLive>> queryCurrentLivesInfo(@NonNull List<String> list, boolean z) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b(z ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m107536c("ids", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list)).m107537d()).map(new w9j() { // from class: l.yxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.suggestedLives;
            }
        });
    }

    public static C22306c<o3u> refreshStoppedLivesV2(@NonNull List<String> list, @NonNull List<String> list2, String str, boolean z) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b(z ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c("with", "lives,rooms,users").m107536c(FirebaseAnalytics.Event.SEARCH, "refresh-stopped").m107536c("oldIds", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list)).m107536c("recommend-categories", vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list2)).m107536c("source", str).m107536c("action", "refresh-stopped").m107537d()).map(new w9j() { // from class: l.owt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70452i((BLiveEnvelope) obj);
            }
        });
    }

    public static void requestBubble() {
        LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-bubble-config"))).subscribe(ffw.m121194e(new e30() { // from class: l.cxt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70467x((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dxt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareApi.m70439G((Throwable) obj);
            }
        }));
    }

    public static C22306c<BLiveCounter> requestLiveCounter() {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/live-counters"), new mt0[0])).map(new w9j() { // from class: l.uwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void requestMyLiveHierarchy() {
        LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/users/me/hierarchy"))).map(new w9j() { // from class: l.ixt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchy;
            }
        }).doOnNext(new e30() { // from class: l.jxt
            @Override // p149l.e30
            public final void call(Object obj) {
                ((nj3) s9s.m182763m(gld0.f103312b)).f139200x = (BLiveUserLevel) obj;
            }
        });
    }

    public static C22306c<x0d0> requestRightBindAnchors(UserRightType userRightType, String str, String str2, final boolean z) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b(userRightType.getRightBindAnchorsUrlStr(str, str2)))).map(new w9j() { // from class: l.bxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveSquareApi.m70440H(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22306c<BaseLiveListBean<LiveSquareTabBean>> requestTab() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/live-tab-configs"), new mt0[0]), g7t.m124728a(LiveSquareTabBean.class, "liveTabConfigs"));
    }

    public static C22306c<soj0> setHideConsumeRecordEnable(String str, boolean z, boolean z2) {
        String strM216073b = ytr.m216073b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z2 ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = z ? "anchorHiddenConsumeRecord" : "userHiddenConsumeRecord";
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b), bLiveSetPrivacyPrivilege.toJson()).map(new w9j() { // from class: l.vwt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }

    public static C22306c<soj0> setHideLiveAnchorLevelEnable(String str, boolean z) {
        String strM216073b = ytr.m216073b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = "hiddenAnchorHierarchy";
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b), bLiveSetPrivacyPrivilege.toJson()).map(new w9j() { // from class: l.zxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }

    public static C22306c<BLiveEnvelope> unEquipUserRight(String str) {
        return LiveBaseApi.m67340y(cll.m107499l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_UN_EQUIP)), "");
    }

    public static C22306c<BaseLiveBean> updateAllFollowPushStatus(boolean z) {
        return updateFollowPushStatus(User.ID_TEAM_ACCOUNT, z);
    }

    public static C22306c<BaseLiveBean> updateFollowPushStatus(String str, boolean z) {
        return LiveBaseApi.m67339x(LiveApiBuilder.m67315u(ytr.m216073b("/live-push-notice/push-status"), new mt0[0]), gson.toJson(z ? LivePushNoticeItemBean.enable(str) : LivePushNoticeItemBean.disable(str)), g7t.m124729b(BaseLiveBean.class));
    }

    public static C22306c<BLiveEnvelope> userRightActions(UserRightType userRightType, w0d0 w0d0Var, String str) {
        return LiveBaseApi.m67340y(userRightType.getRightEquipUrlStr(w0d0Var, str), "");
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ qrr m70466w(qrr qrrVar, Throwable th) {
        return qrrVar;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m70467x(BLiveEnvelope bLiveEnvelope) {
        gld0<nj3> gld0Var = gld0.f103312b;
        if (((nj3) s9s.m182763m(gld0Var)).f139184h.m221515e() == null) {
            ((nj3) s9s.m182763m(gld0Var)).f139184h.m132487l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ LiveSquareSummaryInfo m70468y(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        LiveSquareSummaryInfo liveSquareSummaryInfo = new LiveSquareSummaryInfo(q5c.m172995a(bLiveData.lives), q5c.m172996b(bLiveData.rooms), bLiveData.users, bLiveData.liveSquareSummaries);
        liveSquareSummaryInfo.setFollowShips(bLiveData.followships);
        return liveSquareSummaryInfo;
    }

    public static C22306c<BLiveEnvelope> unEquipUserRight(UserRightType userRightType, w0d0 w0d0Var) {
        return userRightActions(userRightType, w0d0Var, BLiveRightItem.ACTION_UN_EQUIP);
    }

    public static C22306c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo() {
        return getLiveSquareSummaryInfo("");
    }

    public static C22306c<BLiveEnvelope> equipUserRight(UserRightType userRightType, w0d0 w0d0Var) {
        return userRightActions(userRightType, w0d0Var, BLiveRightItem.ACTION_EQUIP);
    }

    public static C22306c<qrr> getLiveActivitiesSuggests(final qrr qrrVar) {
        C22306c<BLiveEnvelope> liveActivitiesSuggests = getLiveActivitiesSuggests();
        Objects.requireNonNull(qrrVar);
        return liveActivitiesSuggests.map(new w9j() { // from class: l.oxt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qrrVar.m176125s((BLiveEnvelope) obj);
            }
        });
    }
}
