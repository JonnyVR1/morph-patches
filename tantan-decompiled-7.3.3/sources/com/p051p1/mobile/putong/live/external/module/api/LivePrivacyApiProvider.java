package com.p051p1.mobile.putong.live.external.module.api;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUser;
import com.p051p1.mobile.putong.live.base.data.BLiveHiddenConsumeRecordButton;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSetPrivacyPrivilege;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.q2l;
import p153l.qcj;
import p153l.rnl;
import p153l.vxj0;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LivePrivacyApiProvider {
    public static final String WEALTH_TYPE_HIDE_CARD = "hideCard";
    public static final String WEALTH_TYPE_HIDE_FEED = "hideFeed";
    public static final String WEALTH_TYPE_HIDE_PROFILE = "hideProfile";

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

    public static C22421c<BLiveFakeUser> equipUserRight(String str) {
        return LiveBaseApi.m68523y(rnl.m182263l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_EQUIP)), "").map(new qcj() { // from class: l.gdt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.fakeUser;
            }
        });
    }

    @NotNull
    private static String getHideAvatarActionUrl(String str, String str2) {
        return rnl.m182265r(zvr.m221802b("/userRights/")).m182288p().m182299b(str).m182299b(Constants.KEY_ACTIONS).m182299b(str2).m182301d().toString();
    }

    public static C22421c<BLiveHideAvatarEnterConfig> getHideAvatarEnable() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/userRights/mysteryConfig/enter"))).map(new qcj() { // from class: l.fdt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.mysteryConfig;
            }
        });
    }

    public static C22421c<List<q2l>> getHideAvatarRight(final BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/rights/mystery/me"))).filter(new qcj() { // from class: l.jdt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.right != null);
            }
        }).map(new qcj() { // from class: l.kdt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return p2l.m170376b(((BLiveEnvelope) obj).data.right, bLiveHideAvatarEnterConfig);
            }
        });
    }

    public static C22421c<BLiveHiddenConsumeRecordButton> getHideConsumeRecordEnable(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/live-users/" + str + "/privacy-privilege"))).map(new qcj() { // from class: l.ldt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.privacyPrivilege.get(0).hiddenConsumeRecordButton;
            }
        });
    }

    public static C22421c<BLiveExtraResponse> getHideWealthIconRight() {
        return LiveBaseApi.m68518t(rnl.m182263l(zvr.m221802b("/users/me/wealth-logo")), BLiveExtraResponse.JSON_ADAPTER);
    }

    public static C22421c<vxj0> setHideConsumeRecordEnable(String str, boolean z, boolean z2) {
        String strM221802b = zvr.m221802b("/live-users/" + str + "/privacy-privilege");
        BLiveSetPrivacyPrivilege bLiveSetPrivacyPrivilege = new BLiveSetPrivacyPrivilege();
        bLiveSetPrivacyPrivilege.status = z2 ? "default" : "hidden";
        bLiveSetPrivacyPrivilege.type = z ? "anchorHiddenConsumeRecord" : "userHiddenConsumeRecord";
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b), bLiveSetPrivacyPrivilege.toJson()).map(new qcj() { // from class: l.hdt
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
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b), bLiveSetPrivacyPrivilege.toJson()).map(new qcj() { // from class: l.idt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vxj0.f186265a;
            }
        });
    }

    public static C22421c<BLiveEnvelope> unEquipUserRight(String str) {
        return LiveBaseApi.m68523y(rnl.m182263l(getHideAvatarActionUrl(str, BLiveRightItem.ACTION_UN_EQUIP)), "");
    }
}
