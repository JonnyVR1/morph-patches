package com.p051p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.LivePushNoticeItemBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveSquareActiveGiftBean;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p051p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorResultList;
import com.p051p1.mobile.putong.live.base.data.BLiveRightInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSetPrivacyPrivilege;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.page.search.base.LiveAnchorsInfo;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannersBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.a9d0;
import p153l.dbd0;
import p153l.dhw;
import p153l.ek20;
import p153l.fk3;
import p153l.fo0;
import p153l.h9t;
import p153l.itd0;
import p153l.jyb;
import p153l.lzt;
import p153l.mr2;
import p153l.p5u;
import p153l.psd0;
import p153l.q2l;
import p153l.qcj;
import p153l.rnl;
import p153l.rtr;
import p153l.st0;
import p153l.t1o;
import p153l.tbs;
import p153l.upq;
import p153l.vxj0;
import p153l.w6c;
import p153l.xi5;
import p153l.y20;
import p153l.yhk0;
import p153l.z8d0;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareApi {
    public static final String WEALTH_TYPE_HIDE_CARD = "hideCard";
    public static final String WEALTH_TYPE_HIDE_FEED = "hideFeed";
    public static final String WEALTH_TYPE_HIDE_PROFILE = "hideProfile";
    private static final Pattern limitPattern = Pattern.compile("&limit=(\\d+)");
    private static final Gson gson = new Gson();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m71616A(BLiveEnvelope bLiveEnvelope) {
        itd0<fk3> itd0Var = itd0.f116820b;
        if (((fk3) tbs.m190077m(itd0Var)).f99466q.m222761e() == null) {
            ((fk3) tbs.m190077m(itd0Var)).f99466q.m137019l(Boolean.valueOf(bLiveEnvelope.data.exchangeTTCRedpoint));
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m71620E(Throwable th) {
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m71622G(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ a9d0 m71623H(boolean z, BLiveEnvelope bLiveEnvelope) {
        return new a9d0(bLiveEnvelope.data.rightBindAnchors, bLiveEnvelope.pagination, z);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ p5u m71624I(BLiveEnvelope bLiveEnvelope) {
        p5u p5uVar = new p5u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
        p5uVar.f150694d = bLiveEnvelope.data.bigTVLives;
        return p5uVar;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ LiveAnchorsInfo m71626K(String str, BLiveData bLiveData) {
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

    public static C22421c<BLiveEnvelope> activeUserRight(UserRightType userRightType, z8d0 z8d0Var) {
        return userRightActions(userRightType, z8d0Var, "activate");
    }

    public static C22421c<BLiveEnvelope> bindRightToAnchor(UserRightType userRightType, BLiveRightAnchorResultList bLiveRightAnchorResultList) {
        return LiveBaseApi.m68523y(rnl.m182263l(zvr.m221802b(userRightType.getBindRightsToAnchorUrlStr())), bLiveRightAnchorResultList.toJson());
    }

    public static C22421c<BLiveEnvelope> changeWealthIconShowStatusNew(String str, boolean z) {
        String str2;
        str.getClass();
        String string = "";
        if (str.equals("hideCard")) {
            str2 = "swipe";
        } else {
            str2 = !str.equals("hideProfile") ? "" : "profile";
        }
        String strM221808h = zvr.m221808h("/wealth-logo/switch");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("switchType", str2);
            jSONObject.put("actionType", z ? "on" : BLiveOperationTitleShowType.off);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return LiveBaseApi.m68521w(rnl.m182263l(strM221808h), string);
    }

    public static C22421c<BLiveEnvelope> craftScrapToItem(@NotNull String str, @NotNull BLiveScrapCraftReq bLiveScrapCraftReq) {
        return LiveBaseApi.m68521w(rnl.m182263l(zvr.m221802b("/live-gift/scraps/" + str + "/craft")).m182288p().m182301d(), bLiveScrapCraftReq.toJson());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ List m71630d(BLiveEnvelope bLiveEnvelope) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bLiveEnvelope.data.users.size(); i++) {
            final User user = bLiveEnvelope.data.users.get(i);
            ((fk3) tbs.m190077m(itd0.f116820b)).m125953d(user);
            mr2 mr2Var = new mr2(user, (BLiveAbsRoom) jyb.m147529r(bLiveEnvelope.data.rooms, new qcj() { // from class: l.wzt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveRoom) obj).owner.f45267id, user.f56859id));
                }
            }), (BLiveAbsData) jyb.m147529r(bLiveEnvelope.data.lives, new qcj() { // from class: l.xzt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLive) obj).anchor.f45267id, user.f56859id));
                }
            }), (Followship) jyb.m147529r(bLiveEnvelope.data.followships, new qcj() { // from class: l.yzt
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, user.f56859id));
                }
            }));
            mr2Var.toString();
            arrayList.add(mr2Var);
        }
        return arrayList;
    }

    public static C22421c<BLiveEnvelope> equipNiceNumber(String str, String str2) {
        rnl rnlVarM182301d = LiveApiBuilder.m68490m(xi5.m211107i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number")).m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("number", str2);
        return LiveBaseApi.m68521w(rnlVarM182301d, jsonObject.toString());
    }

    public static C22421c<BLiveFakeUser> equipUserRight(String str) {
        return LiveBaseApi.m68523y(rnl.m182263l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_EQUIP)), "").map(new qcj() { // from class: l.bzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.fakeUser;
            }
        });
    }

    public static void exchangeTTCRedpoint() {
        LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-wallet/intl/exchange-ttc-redpoint"))).subscribe(dhw.m115826e(new y20() { // from class: l.tzt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71616A((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.uzt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71620E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m71633g(BLiveData bLiveData) {
        if (jyb.m147479J(bLiveData.users)) {
            return;
        }
        Iterator<User> it = bLiveData.users.iterator();
        while (it.hasNext()) {
            ((fk3) tbs.m190077m(itd0.f116820b)).m125953d(it.next());
        }
    }

    public static C22421c<LiveSquareActiveGiftBean> getActiveGiftRequest() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68490m(zvr.m221802b("/live/popup?source=activity-rewards")).m182301d(), h9t.m134086c(LiveSquareActiveGiftBean.class, "livePopup"));
    }

    public static C22421c<LiveAnchorsInfo> getAnchors(String str, @Nullable String str2, @Nullable final String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/anchors")).m182288p().m182300c("source", str).m182300c("with", "live-feeds,lives,voice-lives,rooms,voice-rooms,users,relationships,followships");
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182300c.m182300c(FirebaseAnalytics.Event.SEARCH, str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c(BLivePkInviteSource.query, str3);
        }
        return LiveBaseApi.m68519u(c19886aM182300c.m182301d()).doOnNext(new t1o()).compose(psd0.m173592C()).map(new qcj() { // from class: l.mzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        }).doOnNext(new y20() { // from class: l.nzt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71633g((BLiveData) obj);
            }
        }).map(new qcj() { // from class: l.ozt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71626K(str3, (BLiveData) obj);
            }
        });
    }

    public static C22421c<List<mr2>> getBrowseHistory(String str) {
        rnl.C19886a c19886aM182288p = rnl.m182265r(zvr.m221802b("/liveroom-browse-history/" + str)).m182288p();
        c19886aM182288p.m182300c("with", "followships,rooms,users");
        return LiveBaseApi.m68516r(c19886aM182288p.m182301d()).filter(new qcj() { // from class: l.ryt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.users));
            }
        }).map(new qcj() { // from class: l.syt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71630d((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BaseLiveListBean<LivePushNoticeItemBean>> getFollowPushNoticeList() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/live-push-notice/list"), new st0[0]), h9t.m134084a(LivePushNoticeItemBean.class, "livePushNoticeList"));
    }

    @NotNull
    private static String getHideAvatarActionUrl(String str, String str2) {
        return rnl.m182265r(zvr.m221802b("/userRights/")).m182288p().m182299b(str).m182299b(Constants.KEY_ACTIONS).m182299b(str2).m182301d().toString();
    }

    public static C22421c<BLiveHideAvatarEnterConfig> getHideAvatarEnable() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/userRights/mysteryConfig/enter"))).map(new qcj() { // from class: l.rzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.mysteryConfig;
            }
        });
    }

    public static C22421c<List<q2l>> getHideAvatarRight(final BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/rights/mystery/me"))).filter(new qcj() { // from class: l.tyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new qcj() { // from class: l.uyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p2l.m170376b(((BLiveEnvelope) obj).data.right, bLiveHideAvatarEnterConfig);
            }
        });
    }

    public static C22421c<BLiveHiddenConsumeRecordButton> getHideConsumeRecordEnable(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-users/" + str + "/privacy-privilege"))).map(new qcj() { // from class: l.qyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.privacyPrivilege.get(0).hiddenConsumeRecordButton;
            }
        });
    }

    public static C22421c<BLiveExtraResponse> getHideWealthIconRight() {
        return LiveBaseApi.m68518t(rnl.m182263l(zvr.m221802b("/users/me/wealth-logo")), BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22421c<rtr> getLiveActivitiesInfo() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-activities")).m182288p().m182300c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives").m182300c(Constants.KEY_LIMIT, String.valueOf(50)).m182301d()).map(new lzt()).flatMap(new qcj() { // from class: l.vzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                rtr rtrVar = (rtr) obj;
                return LiveSquareApi.getLiveActivitiesSuggests(rtrVar).onErrorReturn(new qcj() { // from class: l.fzt
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return LiveSquareApi.m71649w(rtrVar, (Throwable) obj2);
                    }
                });
            }
        });
    }

    public static C22421c<BLiveEnvelope> getLiveActivitiesSuggests() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-activity-suggests")).m182288p().m182300c("with", "rooms,users,lives").m182301d());
    }

    public static C22421c<BLiveEnvelope> getLiveActivityEntranceInfo() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-square-entrance-summary")));
    }

    public static C22421c<BLiveEnvelope> getLiveActivitySignInRecommendRoom(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/lives?" + str)));
    }

    public static C22421c<BLiveEnvelope> getLiveActivitySummaryInSquare() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-activity-summaries")).m182288p().m182300c("source", "live-square-detail").m182301d());
    }

    public static C22421c<LiveSquareBannersBean> getLiveBanners(@NonNull String str, String str2, String str3) {
        return LiveBaseApi.m68517s(rnl.m182265r(zvr.m221807g("")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("bannerType", str2).m182300c("source", str3).m182301d(), h9t.m134085b(LiveSquareBannersBean.class));
    }

    public static C22421c<p5u> getLiveListV2(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
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
        sb.append(rnl.m182263l(zvr.m221802b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("source", str2).m182300c("with", "rooms,users,").toString());
        sb.append(strReplaceAll);
        return LiveBaseApi.m68516r(rnl.m182263l(sb.toString())).map(new qcj() { // from class: l.szt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71624I((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveSchema> getLiveSchema(String str) {
        return LiveBaseApi.m68518t(rnl.m182265r(zvr.m221802b("/live-schemas")).m182288p().m182298a(FirebaseAnalytics.Event.SEARCH, str).m182301d(), BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.yyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.liveSchemas.get(0);
            }
        }).observeOn(fo0.m126432a());
    }

    public static C22421c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo(String str) {
        if (str == null) {
            str = "";
        }
        return loadLiveSquare(str).map(new qcj() { // from class: l.b0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71651y((BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BLiveEnvelope> getNextLiveActivities(@NonNull Pagination pagination, @Nullable String str) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-activities")).m182288p().m182300c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives");
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("source", str);
        }
        return LiveBaseApi.m68516r(rnl.m182263l(c19886aM182300c.toString() + "&" + pagination.links.next));
    }

    public static C22421c<p5u> getNextLiveListV2(String str, String str2, String str3, int i, Pagination pagination, String str4) {
        return getLiveListV2(str, str2, str3, i, pagination.links.next, false, str4, false);
    }

    public static C22421c<rtr> getNextPage(@Nullable Pagination pagination) {
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? C22421c.create(new ek20()) : getNextLiveActivities(pagination, null).map(new lzt());
    }

    public static String getNiceNumberAdaptAnchor(String str) {
        return TextUtils.isEmpty(str) ? User.ID_TEAM_ACCOUNT : str;
    }

    public static C22421c<BLiveNiceNumberDetail> getNiceNumberDetails(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68490m(xi5.m211107i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number")).m182301d()).map(new qcj() { // from class: l.zyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.nobleNiceNumberDetail;
            }
        });
    }

    public static C22421c<BLiveNiceNumberList> getNiceNumberList(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68490m(xi5.m211107i("/live-campaigns/noble/anchors/" + getNiceNumberAdaptAnchor(str) + "/details/nice-number-list")).m182301d()).map(new qcj() { // from class: l.azt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.nobleNiceNumberList;
            }
        });
    }

    public static C22421c<LiveAnchorsInfo> getSearchResult(String str) {
        return getAnchors("anchor-search", BLivePkInviteSource.query, str);
    }

    public static C22421c<List<BLiveMenuItem>> getSquareMenuItems() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/square-menu-items")).m182288p().m182300c("source", "live-square").m182301d()).map(new qcj() { // from class: l.qzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.menuItems;
            }
        });
    }

    public static C22421c<BLiveRightInfo> getUserRightList(UserRightType userRightType, String str, final String str2, String str3, final String str4, String str5, @Nullable final dbd0 dbd0Var) {
        return LiveBaseApi.m68516r(rnl.m182263l(userRightType.getRightListUrlStr(new yhk0(str, str2, str5, str3)))).filter(new qcj() { // from class: l.gzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new qcj() { // from class: l.hzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.right;
            }
        }).doOnNext(new y20() { // from class: l.izt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71641o(str2, str4, dbd0Var, (BLiveRightInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ p5u m71635i(BLiveEnvelope bLiveEnvelope) {
        return new p5u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    public static void livePushShown(String str) {
        LiveBaseApi.m68520v(rnl.m182265r(zvr.m221802b("/live-pushes-in-app")).m182288p().m182300c("liveId", str).m182301d(), "");
    }

    private static C22421c<BLiveEnvelope> loadLiveSquare(String str) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-square-summaries")).m182288p().m182300c("with", "lives,rooms,users,followships,relationships");
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("source", str);
        }
        return LiveBaseApi.m68519u(c19886aM182300c.m182301d()).doOnNext(new t1o()).compose(psd0.m173592C());
    }

    public static void notifyEntryMainPager() {
        LiveBaseApi.m68521w(rnl.m182263l(zvr.m221802b("/live-pushes-in-app")), "");
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m71641o(String str, String str2, dbd0 dbd0Var, BLiveRightInfo bLiveRightInfo) {
        bLiveRightInfo.setRoomId(str);
        bLiveRightInfo.setAnchorName(str2);
        bLiveRightInfo.setDisplayParam(dbd0Var);
    }

    public static C22421c<BLiveCounter> patchReddot(String str) {
        return LiveBaseApi.m68521w(rnl.m182263l(zvr.m221802b("/live-counters")).m182288p().m182300c("intent", str).m182301d(), "").map(new qcj() { // from class: l.xyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static C22421c<List<BLiveSuggestLive>> queryCurrentLivesInfo(@NonNull List<String> list, boolean z) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b(z ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m182300c("ids", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list)).m182301d()).map(new qcj() { // from class: l.zzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.suggestedLives;
            }
        });
    }

    public static C22421c<p5u> refreshStoppedLivesV2(@NonNull List<String> list, @NonNull List<String> list2, String str, boolean z) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b(z ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c("with", "lives,rooms,users").m182300c(FirebaseAnalytics.Event.SEARCH, "refresh-stopped").m182300c("oldIds", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list)).m182300c("recommend-categories", upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list2)).m182300c("source", str).m182300c("action", "refresh-stopped").m182301d()).map(new qcj() { // from class: l.pyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71635i((BLiveEnvelope) obj);
            }
        });
    }

    public static void requestBubble() {
        LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-bubble-config"))).subscribe(dhw.m115826e(new y20() { // from class: l.dzt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71650x((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ezt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareApi.m71622G((Throwable) obj);
            }
        }));
    }

    public static C22421c<BLiveCounter> requestLiveCounter() {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/live-counters"), new st0[0])).map(new qcj() { // from class: l.vyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).liveCounters;
            }
        });
    }

    public static void requestMyLiveHierarchy() {
        LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/users/me/hierarchy"))).map(new qcj() { // from class: l.jzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchy;
            }
        }).doOnNext(new y20() { // from class: l.kzt
            @Override // p153l.y20
            public final void call(Object obj) {
                ((fk3) tbs.m190077m(itd0.f116820b)).f99473x = (BLiveUserLevel) obj;
            }
        });
    }

    public static C22421c<a9d0> requestRightBindAnchors(UserRightType userRightType, String str, String str2, final boolean z) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b(userRightType.getRightBindAnchorsUrlStr(str, str2)))).map(new qcj() { // from class: l.czt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveSquareApi.m71623H(z, (BLiveEnvelope) obj);
            }
        });
    }

    public static C22421c<BaseLiveListBean<LiveSquareTabBean>> requestTab() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/live-tab-configs"), new st0[0]), h9t.m134084a(LiveSquareTabBean.class, "liveTabConfigs"));
    }

    public static C22421c<vxj0> setHideConsumeRecordEnable(String str, boolean z, boolean z2) {
        String strM221802b = zvr.m221802b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z2 ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = z ? "anchorHiddenConsumeRecord" : "userHiddenConsumeRecord";
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b), bLiveSetPrivacyPrivilege.toJson()).map(new qcj() { // from class: l.wyt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }

    public static C22421c<vxj0> setHideLiveAnchorLevelEnable(String str, boolean z) {
        String strM221802b = zvr.m221802b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = "hiddenAnchorHierarchy";
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b), bLiveSetPrivacyPrivilege.toJson()).map(new qcj() { // from class: l.a0u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }

    public static C22421c<BLiveEnvelope> unEquipUserRight(String str) {
        return LiveBaseApi.m68523y(rnl.m182263l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_UN_EQUIP)), "");
    }

    public static C22421c<BaseLiveBean> updateAllFollowPushStatus(boolean z) {
        return updateFollowPushStatus(User.ID_TEAM_ACCOUNT, z);
    }

    public static C22421c<BaseLiveBean> updateFollowPushStatus(String str, boolean z) {
        return LiveBaseApi.m68522x(LiveApiBuilder.m68498u(zvr.m221802b("/live-push-notice/push-status"), new st0[0]), gson.toJson(z ? LivePushNoticeItemBean.enable(str) : LivePushNoticeItemBean.disable(str)), h9t.m134085b(BaseLiveBean.class));
    }

    public static C22421c<BLiveEnvelope> userRightActions(UserRightType userRightType, z8d0 z8d0Var, String str) {
        return LiveBaseApi.m68523y(userRightType.getRightEquipUrlStr(z8d0Var, str), "");
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ rtr m71649w(rtr rtrVar, Throwable th) {
        return rtrVar;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m71650x(BLiveEnvelope bLiveEnvelope) {
        itd0<fk3> itd0Var = itd0.f116820b;
        if (((fk3) tbs.m190077m(itd0Var)).f99457h.m222761e() == null) {
            ((fk3) tbs.m190077m(itd0Var)).f99457h.m137019l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ LiveSquareSummaryInfo m71651y(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        LiveSquareSummaryInfo liveSquareSummaryInfo = new LiveSquareSummaryInfo(w6c.m205088a(bLiveData.lives), w6c.m205089b(bLiveData.rooms), bLiveData.users, bLiveData.liveSquareSummaries);
        liveSquareSummaryInfo.setFollowShips(bLiveData.followships);
        return liveSquareSummaryInfo;
    }

    public static C22421c<BLiveEnvelope> unEquipUserRight(UserRightType userRightType, z8d0 z8d0Var) {
        return userRightActions(userRightType, z8d0Var, BLiveRightItem.ACTION_UN_EQUIP);
    }

    public static C22421c<LiveSquareSummaryInfo> getLiveSquareSummaryInfo() {
        return getLiveSquareSummaryInfo("");
    }

    public static C22421c<BLiveEnvelope> equipUserRight(UserRightType userRightType, z8d0 z8d0Var) {
        return userRightActions(userRightType, z8d0Var, BLiveRightItem.ACTION_EQUIP);
    }

    public static C22421c<rtr> getLiveActivitiesSuggests(final rtr rtrVar) {
        C22421c<BLiveEnvelope> liveActivitiesSuggests = getLiveActivitiesSuggests();
        Objects.requireNonNull(rtrVar);
        return liveActivitiesSuggests.map(new qcj() { // from class: l.pzt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return rtrVar.m183159s((BLiveEnvelope) obj);
            }
        });
    }
}
