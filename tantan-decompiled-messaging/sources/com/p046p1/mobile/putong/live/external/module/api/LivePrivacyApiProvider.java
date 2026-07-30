package com.p046p1.mobile.putong.live.external.module.api;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p046p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSetPrivacyPrivilege;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.a0l;
import p149l.cll;
import p149l.soj0;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LivePrivacyApiProvider {
    public static final String WEALTH_TYPE_HIDE_CARD = "hideCard";
    public static final String WEALTH_TYPE_HIDE_FEED = "hideFeed";
    public static final String WEALTH_TYPE_HIDE_PROFILE = "hideProfile";

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

    public static C22306c<BLiveFakeUser> equipUserRight(String str) {
        return LiveBaseApi.m67340y(cll.m107499l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_EQUIP)), "").map(new w9j() { // from class: l.fbt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.fakeUser;
            }
        });
    }

    @NotNull
    private static String getHideAvatarActionUrl(String str, String str2) {
        return cll.m107501r(ytr.m216073b("/userRights/")).m107524p().m107535b(str).m107535b(Constants.KEY_ACTIONS).m107535b(str2).m107537d().toString();
    }

    public static C22306c<BLiveHideAvatarEnterConfig> getHideAvatarEnable() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/userRights/mysteryConfig/enter"))).map(new w9j() { // from class: l.ebt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.mysteryConfig;
            }
        });
    }

    public static C22306c<List<a0l>> getHideAvatarRight(final BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/rights/mystery/me"))).filter(new w9j() { // from class: l.ibt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new w9j() { // from class: l.jbt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zzk.m221020b(((BLiveEnvelope) obj).data.right, bLiveHideAvatarEnterConfig);
            }
        });
    }

    public static C22306c<BLiveHiddenConsumeRecordButton> getHideConsumeRecordEnable(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/live-users/" + str + "/privacy-privilege"))).map(new w9j() { // from class: l.kbt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.privacyPrivilege.get(0).hiddenConsumeRecordButton;
            }
        });
    }

    public static C22306c<BLiveExtraResponse> getHideWealthIconRight() {
        return LiveBaseApi.m67335t(cll.m107499l(ytr.m216073b("/users/me/wealth-logo")), BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22306c<soj0> setHideConsumeRecordEnable(String str, boolean z, boolean z2) {
        String strM216073b = ytr.m216073b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z2 ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = z ? "anchorHiddenConsumeRecord" : "userHiddenConsumeRecord";
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b), bLiveSetPrivacyPrivilege.toJson()).map(new w9j() { // from class: l.gbt
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
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b), bLiveSetPrivacyPrivilege.toJson()).map(new w9j() { // from class: l.hbt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return soj0.f165695a;
            }
        });
    }

    public static C22306c<BLiveEnvelope> unEquipUserRight(String str) {
        return LiveBaseApi.m67340y(cll.m107499l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_UN_EQUIP)), "");
    }
}
