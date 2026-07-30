package com.p046p1.mobile.putong.live.livingroom.api;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.GiftAction;
import com.p046p1.mobile.putong.core.data.LoveLetterGroupState;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p046p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p046p1.mobile.putong.live.base.data.BLiveClarity;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveDailyTasks;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p046p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeIdRequestBody;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveIdentity;
import com.p046p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowList;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p046p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p046p1.mobile.putong.live.base.data.BLivePostEvent;
import com.p046p1.mobile.putong.live.base.data.BLivePush;
import com.p046p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p046p1.mobile.putong.live.base.data.MultiCallApplyRequestData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkFriendInfo;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.bgv;
import p149l.cll;
import p149l.e30;
import p149l.far;
import p149l.ffw;
import p149l.fld0;
import p149l.g7t;
import p149l.ggv;
import p149l.gkh0;
import p149l.gnv;
import p149l.h4t;
import p149l.ho2;
import p149l.ht70;
import p149l.i0s;
import p149l.i5u;
import p149l.idv;
import p149l.j760;
import p149l.jo0;
import p149l.k450;
import p149l.lsi0;
import p149l.m6g;
import p149l.mqi0;
import p149l.mt0;
import p149l.r610;
import p149l.r8d0;
import p149l.roj0;
import p149l.s410;
import p149l.t9u;
import p149l.u5t;
import p149l.upv;
import p149l.vnq;
import p149l.vwb;
import p149l.w220;
import p149l.w9j;
import p149l.wxp;
import p149l.yi10;
import p149l.ypv;
import p149l.ytr;

/* JADX INFO: loaded from: classes4.dex */
public class LivingNormalApiProvider {

    /* JADX INFO: renamed from: a */
    public static final Pattern f47684a = Pattern.compile("&limit=(\\d+)");

    /* JADX INFO: renamed from: b */
    public static int f47685b = 30;

    public enum ConnectType {
        VIDEO_TYPE,
        VOICE_TYPE
    }

    public enum SwitchType {
        NORMAL_TO_CALL,
        CALL_TO_NORMAL
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider$a */
    public static /* synthetic */ class C12609a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47686a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f47687b;

        static {
            int[] iArr = new int[SwitchType.values().length];
            f47687b = iArr;
            try {
                iArr[SwitchType.NORMAL_TO_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47687b[SwitchType.CALL_TO_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ConnectType.values().length];
            f47686a = iArr2;
            try {
                iArr2[ConnectType.VIDEO_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47686a[ConnectType.VOICE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ BLive m71172A1(BLiveEnvelope bLiveEnvelope) {
        return vwb.m200296J(bLiveEnvelope.data.lives) ? BLive.EMPTY : bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ BLiveRoom m71173A2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.rooms)) {
            return null;
        }
        return bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public static C22306c<BaseLiveBean> m71174A3(String str, String str2, boolean z) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216074c(str + "/audits/" + str2), new mt0[0]);
        if (!z) {
            cllVarM67315u = cllVarM67315u.m107524p().m107536c("reject", "1").m107537d();
        }
        return upv.m194924l(cllVarM67315u, "agreeApply", "", g7t.m124729b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: A4 */
    public static C22306c<BLiveMultiCallAsset> m71175A4(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216080i("/" + str + "/multi-call-asset")).m107524p().m107536c("liveId", str2).m107537d(), "getCallAssets").map(new w9j() { // from class: l.qov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        });
    }

    /* JADX INFO: renamed from: A5 */
    public static C22306c<BaseLiveListBean<FanbaseGroupAuditsItemBean>> m71176A5(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/fanbase-group-audits?");
        if (TextUtils.isEmpty("next")) {
            str2 = "page=1";
        }
        sb.append(str2);
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216072a(sb.toString()), new mt0[0]), "getNoticeList", g7t.m124728a(FanbaseGroupAuditsItemBean.class, "fanbaseGroupAudits"));
    }

    /* JADX INFO: renamed from: A6 */
    public static C22306c<BLiveEnvelope> m71177A6() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        StringBuilder sb = new StringBuilder("/");
        sb.append("anchors");
        sb.append("/me/verifications");
        String string = "";
        sb.append("");
        String strM216073b = ytr.m216073b(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", strM199309D0);
            jSONObject.put("user_id", strM199309D0);
            jSONObject.put("anchor", new JSONObject());
            jSONObject.put("type", "verification");
            jSONObject.put("anchorType", "video");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194917e(cll.m107499l(strM216073b), "patch_anchor" + strM199309D0, string);
    }

    /* JADX INFO: renamed from: A7 */
    public static C22306c<List<BLiveMultiCallInvite>> m71178A7(List<String> list, String str, String str2, String str3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("source", str3);
        final JsonArray jsonArray = new JsonArray();
        vwb.m200354z(list, new e30() { // from class: l.knv
            @Override // p149l.e30
            public final void call(Object obj) {
                jsonArray.add((String) obj);
            }
        });
        jsonObject.add("userIds", jsonArray);
        jsonObject.addProperty("type", str2);
        jsonObject.addProperty("ownerMultiCallOrder", str);
        return upv.m194928p(cll.m107499l(ytr.m216073b("/multi-call-invites")), "sendInvite", jsonObject.toString()).map(new w9j() { // from class: l.lnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallInvites;
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22306c m71179B(String str, String str2, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151580j(str);
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str2 + "/managers")), "updateManager");
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m71180B0(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101745y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        fld0<idv> fld0Var = fld0.f98147b;
        if (((idv) ypv.m215673l(fld0Var)).f112690b.m221515e() == null) {
            ((idv) ypv.m215673l(fld0Var)).f112690b.m132487l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static C22306c<BLiveCall> m71183B3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "anchor-voice-approved").m107537d(), "agreeVoiceCall", "").filter(new w9j() { // from class: l.tjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.ujv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static void m71184B4(String str) {
        m71175A4(ypv.f199493a.m199309D0(), str).map(new w9j() { // from class: l.lhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r610.m177972G((BLiveMultiCallAsset) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.mhv
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71226G1((BLiveMultiCallAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static C22306c<List<BLiveMultiCall>> m71185B5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-calls")).m107524p().m107536c("states", s410.f162248n + Constants.SEPARATOR_COMMA + s410.f162249o).m107536c("liveId", str).m107537d(), "getOnGoingCallList").map(new w9j() { // from class: l.sjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public static C22306c<roj0> m71186B6() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/users/" + strM199309D0 + "/verifications/" + strM199309D0)).m107524p().m107536c("process", ShareConstants.NEW_VERSION).m107537d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        return upv.m194914b(cllVarM107537d, "voiceLiveVerification" + strM199309D0, bLiveVerificationCenter.toJson()).map(new w9j() { // from class: l.oov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).onErrorReturn(new w9j() { // from class: l.pov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71308P2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public static C22306c<BLiveEnvelope> m71187B7(String str) {
        return upv.m194917e(cll.m107499l(ytr.m216073b("/live-gift/bullet-comments")), "liveSendDanmaku", str);
    }

    /* JADX INFO: renamed from: C3 */
    public static C22306c<roj0> m71192C3() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/" + ypv.f199493a.m199309D0() + "/anchor-verifications")), "anchorVerification").map(new w9j() { // from class: l.fkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static C22306c<List<BLiveMultiCallInvite>> m71193C4(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-call-invites")).m107524p().m107536c("type", str).m107536c("with", "followships").m107537d(), "getCallInvites" + str).map(new w9j() { // from class: l.okv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71417b3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public static C22306c<BLive> m71194C5(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/" + str + "/lives")).m107524p().m107536c("state", "ongoing,born").m107537d(), "onGoingLive").map(new w9j() { // from class: l.glv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71172A1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C6 */
    public static C22306c<roj0> m71195C6() {
        C22306c<BLiveEnvelope> c22306cM194917e;
        String strM199309D0 = ypv.f199493a.m199309D0();
        boolean zM195641H5 = ypv.m215672k().m195641H5();
        cll cllVarM107537d = cll.m107499l(zM195641H5 ? m71403Z7(strM199309D0) : m71201D3(strM199309D0)).m107524p().m107536c("process", ShareConstants.NEW_VERSION).m107537d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        if (!zM195641H5) {
            bLiveVerificationCenter.anchorType = "voice";
        }
        if (zM195641H5) {
            c22306cM194917e = upv.m194914b(cllVarM107537d, "voiceLiveVerification" + strM199309D0, bLiveVerificationCenter.toJson());
        } else {
            c22306cM194917e = upv.m194917e(cllVarM107537d, "voiceLiveVerification" + strM199309D0, bLiveVerificationCenter.toJson());
        }
        return c22306cM194917e.map(new w9j() { // from class: l.fiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).onErrorReturn(new w9j() { // from class: l.giv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71460g1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public static C22306c<BLiveEnvelope> m71196C7(String str, BLiveDanmakuListItem bLiveDanmakuListItem, String str2, String str3, String str4, String str5) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("fakeId", (Object) (w220.m201015b() ? w220.m201014a() : ""));
        jSONObject.put(MatchFrom.scenario, (Object) "live");
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("originalId", (Object) UUID.randomUUID().toString());
        jSONObject2.put("liveId", (Object) str2);
        jSONObject2.put("roomId", (Object) str3);
        jSONObject2.put("anchorId", (Object) str4);
        jSONObject2.put("content", (Object) str);
        jSONObject2.put("typeId", (Object) bLiveDanmakuListItem.f44355id);
        jSONObject2.put("type", (Object) bLiveDanmakuListItem.type);
        jSONObject2.put("subType", (Object) bLiveDanmakuListItem.subType);
        jSONObject.put("videoLiveBulletComment", (Object) jSONObject2);
        jSONObject.put("liveMode", (Object) str5);
        return m71187B7(jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: D3 */
    public static String m71201D3(String str) {
        return ytr.m216073b("/anchors/" + str + "/verifications");
    }

    /* JADX INFO: renamed from: D4 */
    public static C22306c<BLiveChatMangerSettings> m71202D4(@NonNull String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str + "/chat-settings")), "get_chat_settings_" + str).map(new w9j() { // from class: l.hlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public static C22306c<BLiveEnvelope> m71203D5(String str, int i) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/anchors")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-matched").m107536c("with", "lives,users").m107536c("until", str).m107536c(Constants.KEY_LIMIT, String.valueOf(i)).m107537d(), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: D6 */
    public static C22306c<BLiveEnvelope> m71204D6(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/anchor_leaderboard")).m107524p().m107536c("anchorId", str).m107536c("liveMode", str2).m107536c("type", str3).m107537d(), "dailyOrWeekLeaderBoards");
    }

    /* JADX INFO: renamed from: D7 */
    public static C22306c<BLiveEnvelope> m71205D7(String str, BLivePostEvent bLivePostEvent) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/users/me/live-event")), "sendLiveEvent" + str, bLivePostEvent.toJson());
    }

    /* JADX INFO: renamed from: E3 */
    public static C22306c<BLiveMultiCall> m71210E3(MultiCallApplyRequestData multiCallApplyRequestData) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/multi-calls")), "sendApplyCall", multiCallApplyRequestData.toJson()).filter(new w9j() { // from class: l.lpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.mpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static C22306c<FanbaseGroupCountBean> m71211E4(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216072a(str + "/audits-counter"), new mt0[0]), "getCount", g7t.m124730c(FanbaseGroupCountBean.class, "fanbaseGroupAuditCounter"));
    }

    /* JADX INFO: renamed from: E5 */
    public static C22306c<Integer> m71212E5() {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/pk-suggested-anchors"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, "matched"), mt0.m156174a(Constants.KEY_LIMIT, "50")), "getOnlineFriendsCount").filter(new w9j() { // from class: l.ilv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new w9j() { // from class: l.jlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveEnvelope) obj).data.pkSuggestedAnchors.get(0).anchors.size());
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public static C22306c<BLiveEnvelope> m71213E6(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/hour_leaderboard")).m107524p().m107536c("anchorId", str).m107536c("liveMode", str2).m107537d(), "hourLeaderBoards");
    }

    /* JADX INFO: renamed from: E7 */
    public static C22306c<BLiveEnvelope> m71214E7(String str) {
        return upv.m194917e(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-push")), "sendLivePush", "");
    }

    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ BLiveData m71218F2(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.anchorKnightInfos.size() > 0) {
            ((ggv) ypv.m215673l(fld0.f98148c)).f102545f.m132487l(bLiveEnvelope.data.anchorKnightInfos.get(0));
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: F3 */
    public static C22306c<BLiveCall> m71219F3(String str, String str2, String str3, int i) {
        String strM216073b = ytr.m216073b("/calls");
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.liveId = str;
        bLiveCall.source = str3;
        bLiveCall.inviteId = str2;
        bLiveCall.intendPosition = i;
        if (w220.m201015b()) {
            bLiveCall.fakeId = w220.m201014a();
        }
        return upv.m194928p(cll.m107499l(strM216073b), "applyCallInvite", bLiveCall.toJson()).filter(new w9j() { // from class: l.ikv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.jkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public static C22306c<BLiveDanmakuList> m71220F4(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-gift/bullet-comment-types")).m107524p().m107536c(MatchFrom.scenario, "live").m107536c("anchorId", str).m107536c("liveId", str2).m107536c("roomId", str3).m107536c("fakeId", w220.m201015b() ? w220.m201014a() : "").m107537d(), "DanmakuList").map(new w9j() { // from class: l.jiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoLiveBulletCommentTypes;
            }
        }).onErrorReturn(new w9j() { // from class: l.kiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71497k2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public static void m71221F5(String str, String str2, String str3) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rooms/" + str + "/members/" + str2));
        if (w220.m201015b()) {
            c16188aM67307m.m107536c("fakeId", w220.m201014a());
        }
        c16188aM67307m.m107536c("sessionId", str3);
        upv.m194913a(c16188aM67307m.m107537d(), "getOutRoom" + str, "");
    }

    /* JADX INFO: renamed from: F6 */
    public static C22306c<BLiveChatMangerSettings> m71222F6(@NonNull String str, BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/rooms/" + str + "/chat-settings"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jailedType", bLiveChatJailedType.toString());
            final JSONArray jSONArray = new JSONArray();
            vwb.m200354z(list, new e30() { // from class: l.tgv
                @Override // p149l.e30
                public final void call(Object obj) {
                    jSONArray.put((String) obj);
                }
            });
            jSONObject.put("shieldingWords", jSONArray);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194928p(cllVarM107499l, "get_chat_settings_" + str, jSONObject.toString()).map(new w9j() { // from class: l.alv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public static C22306c<BLiveEnvelope> m71223F7(BLiveSendMessageData bLiveSendMessageData) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/room/message"));
        if (w220.m201015b()) {
            bLiveSendMessageData.fakeId = w220.m201014a();
        }
        return upv.m194917e(c16188aM67307m.m107537d(), "live-send-message", bLiveSendMessageData.toJson());
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ BLivePkSummary m71225G0(BLiveEnvelope bLiveEnvelope) {
        List<BLivePkSummary> list = bLiveEnvelope.data.pkSummaries;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m71226G1(BLiveMultiCallAsset bLiveMultiCallAsset) {
    }

    /* JADX INFO: renamed from: G3 */
    public static C22306c<FanBaseGroupSummaryBean> m71228G3(String str, String str2) {
        return upv.m194931s(LiveApiBuilder.m67315u(ytr.m216074c(str + "/users/" + str2), new mt0[0]), "applyJoin", "", g7t.m124730c(FanBaseGroupSummaryBean.class, "fanbaseGroupSummary"));
    }

    /* JADX INFO: renamed from: G4 */
    public static C22306c<BLiveExtraResponse> m71229G4(String str) {
        return upv.m194921i(cll.m107499l(ytr.m216073b("/rooms/" + str + "/blacklist")).m107524p().m107537d(), "getDeFriendList", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G5 */
    public static C22306c<BLivePKCardShowList> m71230G5(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/pks/" + str + "/item-cards"), mt0.m156174a("anchorId", str2)), "getPkCardItems" + str + str2).map(new w9j() { // from class: l.bkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkItemCardsDetail;
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public static C22306c<BLiveMultiCall> m71231G6(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-calls/" + str)).m107524p().m107536c("action", str2).m107537d(), "processLeadRole" + str + "_" + str2, "").map(new w9j() { // from class: l.iiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public static C22306c<BLiveMultiPkAsset> m71232G7(String str, boolean z, int i) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/users/" + str + "/multi-pk-asset")).m107524p().m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("rejectInvite", Boolean.valueOf(z));
        jsonObject.addProperty(BLiveOperationTitleShowType.duration, Integer.valueOf(i));
        return upv.m194925m(cllVarM107537d, "getMultiPkSetting", jsonObject.toString()).map(new w9j() { // from class: l.nov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static C22306c<BLiveMultiCall> m71237H3(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-calls/" + str)).m107524p().m107536c("action", "approve").m107536c("approveSource", str2).m107537d(), "approve_" + str2 + str, "").filter(new w9j() { // from class: l.cpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.dpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public static C22306c<BLiveDownChestRewardInfo> m71238H4(String str, String str2, String str3, String str4, boolean z, String str5) {
        String str6 = z ? "chestGiftReward" : "chestGift";
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", (Object) str5);
        jSONObject.put("type", (Object) str6);
        jSONObject.put("liveId", (Object) str2);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("roomId", (Object) str3);
        return upv.m194928p(cll.m107499l(str), "chestReward", jSONObject.toString()).map(new w9j() { // from class: l.qiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71369W0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H5 */
    public static C22306c<BLivePkFirstKillGift> m71239H5() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/pk-assets")), "getPkFirstKillGift").filter(new w9j() { // from class: l.oiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.pkAssets.firstKillGifts.size() > 0);
            }
        }).map(new w9j() { // from class: l.piv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkAssets.firstKillGifts.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public static C22306c<BLiveMultiCallSwitchToLeadRoleInvite> m71240H6(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-call-switch-to-lead-role-invite/" + str)).m107524p().m107536c("action", str2).m107537d(), "processLeadRoleInvite_" + str + "_" + str2, "").map(new w9j() { // from class: l.khv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public static C22306c<List<BLiveCall>> m71241H7(String str, boolean z, boolean z2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", (z2 ? "anchor" : "user").concat(z ? "-mute" : "-unmute")).m107537d(), "setMuteDeputy", "").map(new w9j() { // from class: l.zmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ BLivePkInvite m71244I1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ j760 m71245I2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pks)) {
            return null;
        }
        ht70.m132853j("requestPk:" + bLiveEnvelope.data.pks.get(0).toString());
        return vwb.m200311Y(bLiveEnvelope.data.pks.get(0), bLiveEnvelope.data.users);
    }

    /* JADX INFO: renamed from: I3 */
    public static C22306c<String> m71246I3(String str, String str2, Boolean bool) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).m107524p().m107536c("action", bool.booleanValue() ? "approve" : "reject").m107537d(), "approveSettle", "").map(new w9j() { // from class: l.tnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush.message;
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public static C22306c<roj0> m71247I4() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live-video-qualities")).m107524p().m107536c(Device.TYPE, Build.MODEL).m107537d(), "live-video-qualities").map(new w9j() { // from class: l.xlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71603w0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public static C22306c<BLivePkInvite> m71248I5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/pk-invites/" + str)).m107524p().m107536c("with", "users,lives").m107537d(), "getPkInviteInfo").map(new w9j() { // from class: l.gkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71441e0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public static C22306c<List<i5u>> m71249I6(@NonNull List<String> list, boolean z) {
        String strM199044d = vnq.m199040h(Constants.SEPARATOR_COMMA).m199044d(list);
        return upv.m194920h(cll.m107499l(ytr.m216073b(z ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m107536c("ids", strM199044d).m107537d(), "ids" + strM199044d).map(new w9j() { // from class: l.uov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(((BLiveEnvelope) obj).data.suggestedLives, new w9j() { // from class: l.riv
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m71479i2((BLiveSuggestLive) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I7 */
    public static C22306c<BLiveAnchor> m71250I7(boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/anchors/" + ypv.f199493a.m199309D0() + "/live-settings")).m107524p().m107536c("fields", "unacceptPk").m107537d(), "setPkAcceptSetting", "{\n  \"unacceptPk\": " + (z ? "true" : "false") + "\n}").filter(new w9j() { // from class: l.tkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new w9j() { // from class: l.ukv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ BLiveRoom m71251J(BLiveEnvelope bLiveEnvelope) {
        ((idv) ypv.m215673l(fld0.f98147b)).m135631c();
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list != null && list.size() > 0) {
            for (BLiveAddStickerResult bLiveAddStickerResult : list) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135639k(bLiveAddStickerResult.f44329id, bLiveAddStickerResult);
            }
        }
        return vwb.m200296J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: J3 */
    public static r8d0 m71255J3(BLiveEnvelope bLiveEnvelope) {
        return new r8d0(vwb.m200296J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), vwb.m200296J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : bLiveEnvelope.data.rooms.get(0), bLiveEnvelope.data.lives.get(0), vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), vwb.m200296J(bLiveEnvelope.data.liveStickers) ? null : bLiveEnvelope.data.liveStickers.get(0)).m178246d(bLiveEnvelope);
    }

    /* JADX INFO: renamed from: J4 */
    public static C22306c<BLiveEnvelope> m71256J4(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216080i("/" + str2 + "/fanbases/" + str), mt0.m156174a("with", "hierarchies,medals")), "getFanBaseInfo" + str + str2);
    }

    /* JADX INFO: renamed from: J5 */
    public static C22306c<List<BLivePkSuggestAnchors>> m71257J5() {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/pk-suggested-anchors"), mt0.m156174a(Constants.KEY_LIMIT, "50")), "getPkSuggestAnchorList").map(new w9j() { // from class: l.wkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public static C22306c<BLiveEnvelope> m71258J6(String str) {
        return upv.m194928p(LiveApiBuilder.m67315u(ytr.m216073b("/official-show/quit"), mt0.m156174a("programId", str)), "quitOfficialShow" + str, "");
    }

    /* JADX INFO: renamed from: J7 */
    public static C22306c<BLiveEnvelope> m71259J7(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/tricks/sign-in")), "liveSignIn", str);
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ BLivePkInvite m71262K1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: K3 */
    public static C22306c<BLiveMultiCall> m71264K3(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-calls/" + str)).m107524p().m107536c("action", str2).m107537d(), "callAction" + str2 + str, "").filter(new w9j() { // from class: l.anv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.bnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public static C22306c<m6g> m71265K4(final BLiveJoinFanBaseContent bLiveJoinFanBaseContent) {
        String str = bLiveJoinFanBaseContent.anchorId;
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            CrashHelper.m81296c(new Exception("CoreLiveFanBases getAnchorFanbases"));
        }
        return m71580t4(bLiveJoinFanBaseContent.anchorId).map(new w9j() { // from class: l.qhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71543p3((BLiveEnvelope) obj);
            }
        }).filter(new w9j() { // from class: l.rhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).flatMap(new w9j() { // from class: l.shv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                String str2 = (String) obj;
                return LivingNormalApiProvider.m71256J4(str2, bLiveJoinFanBaseContent.userId).map(new w9j() { // from class: l.mkv
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m71278M(str2, (BLiveEnvelope) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: K5 */
    public static C22306c<List<BLivePkSuggestAnchors>> m71266K5(Pagination pagination) {
        String str = ytr.m216073b("/pk-suggested-anchors") + "?" + pagination.links.next;
        return upv.m194920h(cll.m107499l(str), "getPkSuggestLoadMore".concat(str)).map(new w9j() { // from class: l.rlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public static C22306c<roj0> m71267K6(String str, List<String> list) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/multi-pk-invites")).m107524p().m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return upv.m194928p(cllVarM107537d, "reStartMultiPk", jsonObject.toString()).map(new w9j() { // from class: l.ppv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public static C22306c<roj0> m71268K7(String str, List<String> list) {
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/multi-pk")).m107524p().m107537d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return upv.m194928p(cllVarM107537d, "startMultiPk", jsonObject.toString()).map(new w9j() { // from class: l.hov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public static C22306c<i0s> m71273L3(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/calls")).m107524p().m107536c("liveId", str).m107536c("with", "users").m107536c("state", "created,on-voice,on-video").m107537d(), "callApplyList").map(new w9j() { // from class: l.mov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71280M1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public static C22306c<BLiveEnvelope> m71274L4(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216075d(str + "/fanbase-medals-panel"), mt0.m156174a("anchorId", str2)), "getFanBaseMedalEditPanel" + str + str2).filter(new w9j() { // from class: l.mmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.fanbaseMedalPanel != null);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public static C22306c<Integer> m71275L5(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-video-qualities")).m107524p().m107536c("usage", "multi-call").m107536c("sizeType", str).m107536c("layout", str2).m107537d(), "getPushBitrate" + str + str2).filter(new w9j() { // from class: l.zgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.videoQualities));
            }
        }).map(new w9j() { // from class: l.ahv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveEnvelope) obj).data.videoQualities.get(0).pushBitrate);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public static C22306c<BLive> m71276L6(String str, String str2) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("state", (Object) "onlive");
        return upv.m194925m(cll.m107499l(ytr.m216077f("/" + str)).m107524p().m107536c("source", str2).m107536c("wait-stream-ready", "true").m107537d(), "recoverLive", jSONObject.toString()).filter(new w9j() { // from class: l.smv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.umv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71317Q2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public static C22306c<BLive> m71277L7(String str, boolean z) {
        yi10.m214879a("stopOrSuspendLive live id = " + str + " isStop = " + z);
        String str2 = z ? "\"stopped\"" : "\"suspended\"";
        return upv.m194925m(cll.m107499l(ytr.m216077f("/" + str)), z ? "stopLive" : "suspendLive", "{\"state\": " + str2 + " }").filter(new w9j() { // from class: l.pmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.qmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        }).map(new w9j() { // from class: l.rmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71487j1((BLive) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ m6g m71278M(String str, BLiveEnvelope bLiveEnvelope) {
        return new m6g(bLiveEnvelope, str);
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ i0s m71280M1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new i0s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: M3 */
    public static cll m71282M3(String str, String str2, String str3) {
        return cll.m107499l(ytr.m216080i("/" + str + "/multi-call-asset")).m107524p().m107536c("action", str2).m107536c("liveId", str3).m107537d();
    }

    /* JADX INFO: renamed from: M4 */
    public static C22306c<BLiveEnvelope> m71283M4(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216075d(str + "/tasks"), mt0.m156174a("source", str2)), "getFanBaseTasks" + str);
    }

    /* JADX INFO: renamed from: M5 */
    public static C22306c<LiveRoomSuggestBean> m71284M5(String str, String str2) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m107536c("source", str2).m107536c("action", "live-quit-popup").m107536c("currentAnchor", str).m107537d(), "getSuggestData" + str + str2).map(new w9j() { // from class: l.hhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71498k3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public static C22306c<BLive> m71285M6(String str, String str2) {
        gkh0.m126627j("refreshPlayerStreamAddress", "callback:" + str2);
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216077f("/" + str)).m107524p();
        c16188aM107524p.m107536c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(true));
        c16188aM107524p.m107536c("errcode", String.valueOf(0));
        c16188aM107524p.m107536c("callback", str2);
        c16188aM107524p.m107536c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        return upv.m194920h(c16188aM107524p.m107537d(), "refreshPlayerStreamAddress" + str).map(new w9j() { // from class: l.unv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public static C22306c<BLiveEnvelope> m71286M7(String str, String str2, String str3) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216075d(str + "/tasks/" + str2), mt0.m156174a("source", str3)), "submitFanBaseTasks" + str2, "");
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ BLiveSignInAchievementMedals m71287N(List list) {
        return (BLiveSignInAchievementMedals) list.get(0);
    }

    /* JADX INFO: renamed from: N3 */
    public static C22306c<i0s> m71291N3(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/calls")).m107524p().m107536c("liveId", str).m107536c("with", "users").m107536c("state", "on-voice,on-video").m107537d(), "callDeputyList").map(new w9j() { // from class: l.znv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71433d1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static C22306c<BLiveEnvelope> m71292N4(String str) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216075d(str + "/fanbase-medals"), new mt0[0]), "fanbaseMedals" + str);
    }

    /* JADX INFO: renamed from: N5 */
    public static C22306c<Boolean> m71293N5() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/" + strM199309D0 + "/verifications/" + strM199309D0)), "liveVerification").map(new w9j() { // from class: l.bhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new w9j() { // from class: l.chv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71568s1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public static C22306c<BLive> m71294N6(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "refresh-stream-address";
        }
        return upv.m194925m(LiveApiBuilder.m67315u(ytr.m216077f("/" + str), mt0.m156174a("type", str2), mt0.m156174a("errorcode", String.valueOf(i))), "refreshStreamAddress" + str, "").map(new w9j() { // from class: l.xmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public static C22306c<roj0> m71295N7(String str, String str2, String str3, String str4, String str5) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216075d(str + "/fanbase-medals"), mt0.m156174a("anchorId", str2));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("color", str3);
            jSONObject.put("icon", str4);
            jSONObject.put("text", str5);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194917e(cllVarM67315u, "submitMedalEditInfo" + str + str2, jSONObject.toString()).map(new w9j() { // from class: l.gpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ BLiveSignInDetail m71298O1(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public static C22306c<BLiveCallInvite> m71300O3(String str, String str2) {
        String strM216073b = ytr.m216073b("/call-invites");
        BLiveCallInvite bLiveCallInvite = new BLiveCallInvite();
        bLiveCallInvite.liveId = str;
        bLiveCallInvite.f44344to = str2;
        return upv.m194928p(cll.m107499l(strM216073b), "callInvite", bLiveCallInvite.toJson()).filter(new w9j() { // from class: l.slv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.callInvites));
            }
        }).map(new w9j() { // from class: l.tlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.callInvites.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static C22306c<Integer> m71301O4(String str) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216075d(str + "/redPacketEvents/counter"), new mt0[0]), "getFanbaseReddots").map(new w9j() { // from class: l.wgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71488j2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public static C22306c<BLiveEnvelope> m71302O5(String str, String str2, String str3) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3), new mt0[0]), "getRedPacketInfo" + str + str2 + str3).filter(new w9j() { // from class: l.hjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.grabRedPacketInfo != null);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public static C22306c<BLive> m71303O6(String str, SwitchType switchType) {
        String str2;
        int i = C12609a.f47687b[switchType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "call-stop-refresh-stream-address";
        } else {
            str2 = "call-start-refresh-stream-address";
        }
        return upv.m194925m(cll.m107499l(ytr.m216073b("/lives/" + str)).m107524p().m107536c("type", str2).m107537d(), "refreshStreamUrl" + str, "").filter(new w9j() { // from class: l.zkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.llv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public static C22306c<BLiveAnchor> m71304O7(boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/anchors/" + ypv.f199493a.m199309D0() + "/live-settings")).m107524p().m107536c("fields", "callSwitch").m107537d(), "switchCall", "{\n\"callSwitch\": {\n\"on\": " + z + "\n}\n}").map(new w9j() { // from class: l.thv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ roj0 m71308P2(Throwable th) {
        gkh0.m126627j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: P3 */
    public static C22306c<BLiveVoiceLivePush> m71309P3(String str, String str2, String str3) {
        String strM216073b = ytr.m216073b("/users/" + str + "/voice-live-push");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("type", (Object) BLiveVoiceVirtualRoomSettleItem.STATE_SETTLED);
        jSONObject.put("voiceLiveId", (Object) str3);
        if (!TextUtils.isEmpty(str2)) {
            com.alibaba.fastjson.JSONArray jSONArray = new com.alibaba.fastjson.JSONArray();
            jSONArray.add(str2);
            jSONObject.put("userIds", (Object) jSONArray);
        }
        return upv.m194928p(cll.m107499l(strM216073b), "voice-callInvite", jSONObject.toString()).map(new w9j() { // from class: l.whv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public static C22306c<FanbaseGroupsBean> m71310P4(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-groups"), new mt0[0]), "getFansGroupList", g7t.m124729b(FanbaseGroupsBean.class));
    }

    /* JADX INFO: renamed from: P5 */
    public static C22306c<List<BLiveVoiceSettle>> m71311P5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + str + "/settles")).m107524p().m107536c("states", "created").m107537d(), "getRequestSettleMembers" + str).map(new w9j() { // from class: l.rjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: P6 */
    public static C22306c<BLive> m71312P6(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/lives/" + str)).m107524p().m107536c("type", str2).m107537d(), "refreshStreamUrl" + str, "").filter(new w9j() { // from class: l.bov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.cov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public static C22306c<Boolean> m71313P7(String str, String str2, int i) {
        return upv.m194925m(cll.m107499l(ytr.m216080i("/" + str + "/multi-call-asset")).m107524p().m107536c("action", i == 6 ? "switch-6-max-call-num" : "switch-9-max-call-num").m107536c("liveId", str2).m107537d(), "switchDeputyCount_" + i, "").doOnNext(new e30() { // from class: l.eov
            @Override // p149l.e30
            public final void call(Object obj) {
                r610.m177972G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).map(new w9j() { // from class: l.fov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveEnvelope) obj));
            }
        }).onErrorReturn(new w9j() { // from class: l.gov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71396Z0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ BLivePkSeek m71316Q1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ BLive m71317Q2(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public static C22306c<wxp> m71318Q3(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/call-invites")).m107524p().m107536c("with", "users").m107536c("liveId", str).m107537d(), "callInviteList").map(new w9j() { // from class: l.bpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71522n0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public static C22306c<BLiveFirstRechargeDetail> m71319Q4(String str, String str2) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/campaigns/first_recharge/detail")).m107524p().m107536c("roomId", str).m107536c("anchorId", str2).m107537d(), "getFirstRechargeBoardDetails").map(new w9j() { // from class: l.ygv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: Q5 */
    public static C22306c<BLiveEnvelope> m71320Q5(String str) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/tricks/sign-in/receive-reward")), "getReward", str);
    }

    /* JADX INFO: renamed from: Q6 */
    public static void m71321Q6(String str) {
        upv.m194925m(cll.m107499l(ytr.m216073b("/multi-call-invites/" + str)).m107524p().m107536c("action", "reject").m107537d(), "rejectInvite", "");
    }

    /* JADX INFO: renamed from: Q7 */
    public static C22306c<BLiveMultiCall> m71322Q7(String str) {
        return m71231G6(str, "switchToLeadRole");
    }

    /* JADX INFO: renamed from: R3 */
    public static C22306c<BLiveCallSummary> m71327R3(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/calls/" + str + "/summaries")), "callSummary").map(new w9j() { // from class: l.pjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.callSummaries.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public static C22306c<List<BLiveMultiCallInvite>> m71328R4() {
        return m71193C4(s410.f162215E);
    }

    /* JADX INFO: renamed from: R5 */
    public static C22306c<BLiveRoom> m71329R5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str)), "getRoom" + str).map(new w9j() { // from class: l.wnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71485j((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R6 */
    public static C22306c<BLivePkInvite> m71330R6(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pk-invites/" + str)).m107524p().m107536c("auto-ignore", String.valueOf(z)).m107537d(), "rejectPkInvite" + str, "{\n  \"state\": \"rejected\"\n}").map(new w9j() { // from class: l.yjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71560r2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public static C22306c<BLiveMultiCall> m71331R7(String str) {
        return m71264K3(str, "switchToVideo");
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BFansBaseRecall m71332S(BLiveEnvelope bLiveEnvelope) {
        for (BFansRecallUser bFansRecallUser : bLiveEnvelope.data.fanbaseRecall.users) {
            bFansRecallUser.setGradleUrl(((ggv) ypv.m215673l(fld0.f98148c)).m126038x(bFansRecallUser.grade).wealthIconUrl);
        }
        return bLiveEnvelope.data.fanbaseRecall;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ List m71334S1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveStickerMetaDataItem> list = bLiveEnvelope.data.liveStickerTemplates;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: S3 */
    public static C22306c<BLiveMultiCall> m71336S3(String str) {
        return m71264K3(str, "cancel");
    }

    /* JADX INFO: renamed from: S4 */
    public static C22306c<BLiveGiftStarBoard> m71337S4() {
        return ((ggv) ypv.m215673l(fld0.f98148c)).f102547h.asObservable().onBackpressureLatest().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: S5 */
    public static C22306c<List<BLiveStickerMetaDataItem>> m71338S5(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-sticker-templates")), "liveRoomAvailableStickers" + str).map(new w9j() { // from class: l.tmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71334S1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public static C22306c<BLiveMultiCall> m71339S6(String str) {
        return m71264K3(str, "rejectSwitchToVideo");
    }

    /* JADX INFO: renamed from: S7 */
    public static C22306c<List<BLiveCall>> m71340S7(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", z ? "anchor-switch-to-voice" : "user-switch-to-voice").m107537d(), "switchToVoiceCall", "").map(new w9j() { // from class: l.zjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ BLiveSignInAchievementMedals m71342T0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m71343T1(String str, BLiveData bLiveData) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty) {
            j760<Boolean, BLiveData> j760VarM221515e = ((ggv) ypv.m215673l(fld0.f98148c)).f102544e.m221515e();
            if (NullChecker.m81303a(j760VarM221515e)) {
                bLiveData.users.addAll(0, j760VarM221515e.f116565b.users);
            }
        }
        ((ggv) ypv.m215673l(fld0.f98148c)).f102544e.m132487l(vwb.m200311Y(Boolean.valueOf(zIsEmpty), bLiveData));
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ k450 m71344T2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new k450(bLiveData.officialShowCurrentAnchorInfo, bLiveData.officialShowList);
    }

    /* JADX INFO: renamed from: T3 */
    public static C22306c<List<BLiveCall>> m71345T3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-voice-canceled").m107537d(), "cancelCallApply", "").map(new w9j() { // from class: l.div
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public static C22306c<List<BLiveStickerTemplatesGiftItem>> m71346T4() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live-sticker-templates-gifts")), "getSchemaStickerList").map(new w9j() { // from class: l.cmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71622y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public static C22306c<BLiveRoom> m71347T5(boolean z, String str) {
        StringBuilder sb = new StringBuilder("/users/");
        if (z) {
            str = "me";
        }
        sb.append(str);
        sb.append("/rooms");
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b(sb.toString())).m107524p();
        if (z) {
            c16188aM107524p.m107536c("with", "live-stickers");
        }
        return upv.m194920h(c16188aM107524p.m107537d(), "getRoomInfo").map(new w9j() { // from class: l.tov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71251J((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T6 */
    public static C22306c<List<BLiveCall>> m71348T6(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-switch-to-video-rejected").m107537d(), "rejectVideoCall", "").map(new w9j() { // from class: l.xjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public static C22306c<BLiveEnvelope> m71349T7(String str) {
        return upv.m194925m(m71282M3(ypv.f199493a.m199309D0(), "turn-off-turn-on-guide", str), "turnOffMultiCallGuide", "");
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ BLiveSignInDetail m71352U1(List list) {
        return (BLiveSignInDetail) list.get(0);
    }

    /* JADX INFO: renamed from: U3 */
    public static C22306c<List<BLiveCall>> m71354U3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "anchor-switch-to-video-canceled").m107537d(), "cancelInviteVideoCall", "").map(new w9j() { // from class: l.qjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: U4 */
    public static C22306c<BLiveData> m71355U4(String str, String str2) {
        return upv.m194920h(cll.m107499l(ytr.m216080i("/" + str + "/guard-user-leaderboards")).m107524p().m107536c("roomId", str2).m107537d(), "getGuardAnchorBoards").map(new w9j() { // from class: l.ekv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71218F2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public static C22306c<BLivePkSuggestAnchors> m71356U5(String str) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/pk-suggested-anchors"), mt0.m156174a(FirebaseAnalytics.Event.SEARCH, BLivePkInviteSource.query), mt0.m156174a(BLivePkInviteSource.query, str), mt0.m156174a(Constants.KEY_LIMIT, "50")), "getSearchResult" + str).filter(new w9j() { // from class: l.plv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new w9j() { // from class: l.qlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public static C22306c<BLiveEnvelope> m71357U6(String str, String str2) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/rooms/" + str + "/blacklist/" + str2)).m107524p().m107537d(), "cancelDeFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: U7 */
    public static C22306c<BLiveMultiCall> m71358U7(String str) {
        return m71264K3(str, "unmute");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ BLiveStormDanmaku m71360V0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ BLivePk m71362V2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: V3 */
    public static C22306c<BLiveMultiCall> m71363V3(String str) {
        return m71231G6(str, "cancelLeadRole");
    }

    /* JADX INFO: renamed from: V4 */
    public static C22306c<BLiveData> m71364V4(String str) {
        return upv.m194920h(cll.m107501r(ytr.m216080i("/" + str + "/guard-anchor-leaderboards")), "getGuardLeaderBoards").map(new w9j() { // from class: l.vkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public static C22306c<List<BLiveVoiceSettle>> m71365V5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + str + "/settles")).m107524p().m107536c("states", BLiveVoiceVirtualRoomSettleItem.STATE_SETTLED).m107537d(), "getSettledMembers" + str).map(new w9j() { // from class: l.siv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public static C22306c<BLiveEnvelope> m71366V6(String str) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216075d(str + "/redPacketEvents/counter"), new mt0[0]), "getFanbaseReddots", "");
    }

    /* JADX INFO: renamed from: V7 */
    public static C22306c<List<BLiveStickerMetaDataItem>> m71367V7(String... strArr) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-sticker-templates")).m107524p();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (i != strArr.length - 1) {
                sb.append(str);
                sb.append(Constants.SEPARATOR_COMMA);
            } else {
                sb.append(str);
            }
        }
        c16188aM107524p.m107536c("ids", sb.toString());
        return upv.m194920h(c16188aM107524p.m107537d(), "updateLiveStickerMetadata").map(new w9j() { // from class: l.nmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplates;
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ BLiveDownChestRewardInfo m71369W0(BLiveEnvelope bLiveEnvelope) {
        List<BLiveDownChestRewardInfo> list = bLiveEnvelope.data.chestRewardInfo;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return bLiveEnvelope.data.chestRewardInfo.get(0);
    }

    /* JADX INFO: renamed from: W3 */
    public static C22306c<BLivePkInvite> m71372W3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pk-invites/" + str)), "cancelPkInvite" + str, "{\n  \"state\": \"canceled\"\n}").map(new w9j() { // from class: l.xhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71244I1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public static C22306c<BLiveData> m71373W4(String str, String str2) {
        cll.C16188a c16188aM107536c = cll.m107501r(ytr.m216080i("/" + str + "/user-guard-infos")).m107524p().m107536c("roomId", str2);
        c16188aM107536c.m107536c("with", "users");
        return upv.m194920h(c16188aM107536c.m107537d(), "getGuardInfo").map(new w9j() { // from class: l.xkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public static C22306c<BLiveSignInDetail> m71374W5() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/tricks/sign-in/detail")), "SignInDetail").map(new w9j() { // from class: l.yiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInDetails;
            }
        }).filter(new w9j() { // from class: l.ziv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).map(new w9j() { // from class: l.ajv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71352U1((List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.bjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71298O1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public static C22306c<BLiveEnvelope> m71375W6(String str, String str2) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).m107524p().m107537d(), "removeSettle", "");
    }

    /* JADX INFO: renamed from: W7 */
    public static C22306c<BLiveCall> m71376W7(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-switch-to-video-canceled").m107537d(), "deputyGoBack", "").filter(new w9j() { // from class: l.gmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.imv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static C22306c<BLivePkSeek> m71381X3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pk-seeks/" + str)), "cancelPkSeek" + str, "{\n  \"state\": \"canceled\"\n}").map(new w9j() { // from class: l.civ
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71513m0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public static C22306c<r8d0> m71382X4(BLiveAbsData bLiveAbsData) {
        return upv.m194920h(cll.m107499l(ytr.m216077f("?" + bLiveAbsData.requestExtra)), "request_suggested_live" + bLiveAbsData.f44323id).flatMap(new w9j() { // from class: l.miv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return mkd0.m154984r(C22306c.just(bLiveEnvelope.data.lives.get(0).source), LivingNormalApiProvider.m71464g5(bLiveEnvelope.data.lives.get(0)), new x9j() { // from class: l.ykv
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return vwb.m200311Y((String) obj2, (r8d0) obj3);
                    }
                });
            }
        }).map(new w9j() { // from class: l.niv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71398Z2((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public static C22306c<BLiveStormDanmaku> m71383X5(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/gift/storm-comment/resources")).m107524p().m107536c("anchorId", str).m107536c("fakeId", w220.m201015b() ? w220.m201014a() : "").m107536c("liveId", str2).m107536c("roomId", str3).m107536c(MatchFrom.scenario, "live").m107537d(), "getStormDanmaku").map(new w9j() { // from class: l.uhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.stormComment;
            }
        }).onErrorReturn(new w9j() { // from class: l.vhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71360V0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X6 */
    public static C22306c<BLiveMultiCall> m71384X6(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-calls/" + str)).m107524p().m107536c("state", "success").m107537d(), "reportCallSuccess", "").filter(new w9j() { // from class: l.nlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.olv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: X7 */
    public static C22306c<BLivePush> m71385X7() {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/user-live-push")).m107524p().m107536c("type", "multi-call").m107537d(), "userLivePush", "").map(new w9j() { // from class: l.ckv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ far m71388Y1(BLiveEnvelope bLiveEnvelope) {
        return new far(bLiveEnvelope, true);
    }

    /* JADX INFO: renamed from: Y3 */
    public static C22306c<BLive> m71390Y3(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216077f("/" + str + (z ? "?type=pk-start-refresh-stream-address" : "?type=pk-stop-refresh-stream-address"))), "changePkStreamAddress" + str, "").map(new w9j() { // from class: l.biv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public static C22306c<BLiveEnvelope> m71391Y4(String str, String str2, String str3, String str4, String str5) {
        return m71400Z4(str, str2, str3, null, str4, str5);
    }

    /* JADX INFO: renamed from: Y5 */
    public static C22306c<PkFriendInfo> m71392Y5() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/anchors")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-unmatched").m107536c("with", "lives,users").m107537d(), "getSuggestPkAnchor").map(new w9j() { // from class: l.nkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71406a1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public static C22306c<BLiveCall> m71393Y6(String str, boolean z, ConnectType connectType) {
        String str2;
        int i = C12609a.f47686a[connectType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "voice-";
        } else {
            str2 = "video-";
        }
        String str3 = z ? "success" : "fail";
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("state", str2 + str3).m107537d(), "reportConnect", "").filter(new w9j() { // from class: l.klv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.mlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public static C22306c<BLiveCall> m71394Y7(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-switch-to-video-ready").m107537d(), "deputyGoBack", "").filter(new w9j() { // from class: l.jmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.kmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ roj0 m71395Z(List list) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126018L(list);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Boolean m71396Z0(Throwable th) {
        r610.m178005j(th);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m71397Z1(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftStarBoard bLiveGiftStarBoardNew_ = bLiveEnvelope.data.giftStar;
        if (bLiveGiftStarBoardNew_ == null) {
            bLiveGiftStarBoardNew_ = BLiveGiftStarBoard.new_();
        }
        ((ggv) ypv.m215673l(fld0.f98148c)).f102547h.m132487l(bLiveGiftStarBoardNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ r8d0 m71398Z2(j760 j760Var) {
        r8d0 r8d0Var = (r8d0) j760Var.f116565b;
        ((BLive) r8d0Var.f187610c).source = (String) j760Var.f116564a;
        return r8d0Var;
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m71399Z3(List<?> list) {
        return (list == null || list.size() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: Z4 */
    public static C22306c<BLiveEnvelope> m71400Z4(String str, String str2, String str3, @Nullable String str4, String str5, String str6) {
        String str7;
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/rooms/" + str + "/members/" + str2));
        c16188aM67307m.m107536c("source", str3);
        if (!TextUtils.isEmpty(str4)) {
            c16188aM67307m.m107536c("recommendInfo", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c16188aM67307m.m107536c("exposureType", str5);
        }
        if (w220.m201015b()) {
            str7 = "{\"fakeId\": \"" + w220.m201014a() + "\"}";
        } else {
            str7 = "";
        }
        c16188aM67307m.m107536c("sessionId", str6);
        return upv.m194932t(c16188aM67307m.m107537d(), "getInRoom" + str, str7);
    }

    /* JADX INFO: renamed from: Z5 */
    public static C22306c<BLive> m71401Z5(String str, String str2) {
        return upv.m194920h(cll.m107499l(ytr.m216077f("")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "swipe-in-room").m107536c("source", str).m107536c("recommend-category", str2).m107536c(Constants.KEY_LIMIT, "1").m107537d(), "getSuggestedLiveForFloatWindow").filter(new w9j() { // from class: l.dmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.emv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives;
            }
        }).map(new w9j() { // from class: l.fmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71593v((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public static C22306c<BLiveEnvelope> m71402Z6(BLiveChatReport bLiveChatReport, String str) {
        return upv.m194917e(cll.m107499l(ytr.m216080i("/" + str + "/livechat-reports")), "userReport", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: Z7 */
    public static String m71403Z7(String str) {
        return ytr.m216073b("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ PkFriendInfo m71406a1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
    }

    /* JADX INFO: renamed from: a4 */
    public static C22306c<BLiveFirstRechargeStatus> m71409a4(String str, String str2) {
        String strM201014a = w220.m201014a();
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/campaigns/first_recharge/status")).m107524p().m107536c("roomId", str2).m107536c("anchorId", str);
        if (TextUtils.isEmpty(strM201014a)) {
            strM201014a = "";
        }
        return upv.m194920h(c16188aM107536c.m107536c("fakeId", strM201014a).m107537d(), "checkHasFirstRecharge").map(new w9j() { // from class: l.rov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeStatus;
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public static C22306c<roj0> m71410a5() {
        fld0<ggv> fld0Var = fld0.f98148c;
        return (((ggv) ypv.m215673l(fld0Var)).m126025k() == null || ((ggv) ypv.m215673l(fld0Var)).m126025k().size() <= 0) ? upv.m194920h(cll.m107499l(ytr.m216073b("/family/family-medals")).m107524p().m107537d(), "getIntlFamilyMedals").map(new w9j() { // from class: l.qkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyMedals;
            }
        }).map(new w9j() { // from class: l.rkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71495k0((List) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: a6 */
    public static C22306c<BLiveTopChatMessage> m71411a6(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/topChat/rooms/" + str)), "getTopChatMessageDetail").map(new w9j() { // from class: l.mnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveTopChatMessage;
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public static C22306c<BLiveEnvelope> m71412a7(BLiveChatReport bLiveChatReport) {
        return upv.m194917e(cll.m107499l(ytr.m216073b("/anchor-reports")), "userReportForAnchor", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ List m71417b3(final BLiveEnvelope bLiveEnvelope) {
        vwb.m200354z(bLiveEnvelope.data.multiCallInvites, new e30() { // from class: l.sov
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveMultiCallInvite bLiveMultiCallInvite = (BLiveMultiCallInvite) obj;
                bLiveMultiCallInvite.followship = (Followship) vwb.m200346r(bLiveEnvelope.data.followships, new w9j() { // from class: l.ihv
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCallInvite.toUserId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCallInvites;
    }

    /* JADX INFO: renamed from: b4 */
    public static C22306c<roj0> m71418b4(boolean z) {
        String string = cll.m107501r(ytr.m216073b(z ? "/anchor-daily-task-counters" : "/user-daily-task-counters")).m107524p().m107536c("action", "clear-complete-task-red-dot").m107537d().toString();
        return upv.m194914b(cll.m107499l(string), string, "").map(new w9j() { // from class: l.cjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static C22306c<roj0> m71419b5() {
        fld0<ggv> fld0Var = fld0.f98148c;
        return (((ggv) ypv.m215673l(fld0Var)).m126029o() == null || ((ggv) ypv.m215673l(fld0Var)).m126029o().size() <= 0) ? upv.m194920h(cll.m107499l(ytr.m216073b("/voiceFanbase/medals")).m107524p().m107537d(), "getIntlVoiceFanBaseMedals").map(new w9j() { // from class: l.vjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseMedals;
            }
        }).map(new w9j() { // from class: l.wjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71395Z((List) obj);
            }
        }) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: b6 */
    public static C22306c<BLiveSuperChatDetail> m71420b6(boolean z, String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/superChat/" + (z ? "topChat" : "shoutingChat") + "/rooms/" + str)), "getTopChatPageDetail").map(new w9j() { // from class: l.ojv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.superChatDetail;
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public static C22306c<roj0> m71421b7(ho2 ho2Var, MotionType motionType, long j) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", UUID.randomUUID().toString());
            jSONObject.put("sessionId", ho2Var.m149826x());
            jSONObject.put("type", "bufferStop");
            jSONObject.put("roomId", ho2Var.m149818o());
            jSONObject.put("anchorId", ho2Var.m132140j0());
            jSONObject.put("liveId", ho2Var.m149814k());
            jSONObject.put("userId", ypv.f199493a.m199309D0());
            BLiveAbsData bLiveAbsDataMo149813j = ho2Var.mo149813j();
            if (bLiveAbsDataMo149813j != null) {
                String str = bLiveAbsDataMo149813j.liveMode;
                if (TextUtils.isEmpty(str)) {
                    str = "default";
                }
                jSONObject.put("liveMode", str);
            }
            jSONObject.put("isPk", motionType == MotionType.pk);
            jSONObject.put("isCall", motionType == MotionType.multi_connect);
            jSONObject.put("isMultiCall", motionType == MotionType.multi_call);
            jSONObject.put("timestamp", mqi0.m155944o());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bufferingTimeDuration", j);
            jSONObject.put("data", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        return upv.m194917e(cll.m107499l(ytr.m216073b("/live-stream-event")), "notifyPullStreamBufferingEnd" + mqi0.m155944o(), string).map(new w9j() { // from class: l.dkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public static C22306c<Boolean> m71427c4(String str) {
        return upv.m194925m(m71282M3(ypv.f199493a.m199309D0(), "turn-off-multi-call", str), "closeMultiCall", "").map(new w9j() { // from class: l.env
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71471h3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: c5 */
    public static C22306c<u5t> m71428c5(h4t<?, ?> h4tVar) {
        return h4tVar.m206027E2().m132160q1().m189068R().filter(new w9j() { // from class: l.vmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                u5t u5tVar = (u5t) obj;
                return Boolean.valueOf(s410.f162226P.equals(u5tVar.f174756c) && r610.m178007l(u5tVar.f174754a));
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public static C22306c<BLiveMultiCall> m71429c6(String str) {
        return m71264K3(str, "go-away");
    }

    /* JADX INFO: renamed from: c7 */
    public static C22306c<BLiveEnvelope> m71430c7(String str, String str2, String str3, String str4, String str5) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("liveId", str);
        jsonObject.addProperty("roomId", str2);
        jsonObject.addProperty("anchorId", str3);
        jsonObject.addProperty("errorType", str4);
        jsonObject.addProperty("message", str5);
        return upv.m194928p(cll.m107499l(ytr.m216073b("/video-stream-event")).m107524p().m107537d(), "reportStreamEvent" + str, jsonObject.toString());
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ i0s m71433d1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new i0s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ BLive m71435d3(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.m215673l(fld0.f98151f)).m101715C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: d4 */
    public static C22306c<BLiveMultiCall> m71436d4(String str) {
        return m71264K3(str, "come-back");
    }

    /* JADX INFO: renamed from: d5 */
    public static void m71437d5(String str, final String str2) {
        cll.C16188a c16188aM107536c = cll.m107501r(ytr.m216073b("/anchor/" + str + "/knights")).m107524p().m107536c("source", LoveLetterGroupState.entrance).m107536c("with", "users");
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107536c.m107536c("util", str2);
        }
        upv.m194920h(c16188aM107536c.m107537d(), "getKnightsEntry").map(new w9j() { // from class: l.vov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71514m1((BLiveEnvelope) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.xov
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71343T1(str2, (BLiveData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public static C22306c<BLiveEnvelope> m71438d6(String str, String str2, String str3, String str4) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216073b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3 + "?token=" + str4), new mt0[0]), "grabRedPacket" + str3 + str + str2, "").filter(new w9j() { // from class: l.eiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.redPacketGrabResult != null);
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public static C22306c<BLiveEnvelope> m71439d7(String str, String str2, String str3) {
        cll cllVarM107537d = LiveApiBuilder.m67307m(ytr.m216073b("/streaming-heartbeat")).m107537d();
        long jM155944o = mqi0.m155944o();
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jSONObject.put("liveId", (Object) str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        jSONObject.put("anchorId", (Object) str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        jSONObject.put("roomId", (Object) str3);
        jSONObject.put("uploadTime", (Object) Long.valueOf(jM155944o));
        return upv.m194917e(cllVarM107537d, "reportStreamingHeartBeat" + jM155944o, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ BLivePkInvite m71441e0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        final BLivePkInvite bLivePkInvite = bLiveEnvelope.data.pkInvites.get(0);
        bLivePkInvite.userInfo = (User) vwb.m200346r(bLiveEnvelope.data.users, new w9j() { // from class: l.ulv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((User) obj).f56011id));
            }
        });
        bLivePkInvite.live = (BLive) vwb.m200346r(bLiveEnvelope.data.lives, new w9j() { // from class: l.vlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((BLive) obj).anchor.f44419id));
            }
        });
        return bLivePkInvite;
    }

    /* JADX INFO: renamed from: e4 */
    public static C22306c<BaseLiveBean> m71445e4(String str) {
        return upv.m194927o(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-groups"), new mt0[0]), "createFansGroup", "", g7t.m124729b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: e5 */
    public static C22306c<BLiveEnvelope> m71446e5(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216080i("/me/leaderboards/" + str), mt0.m156174a("start", "0"), mt0.m156174a("end", "99"), mt0.m156174a("scopeId", str2), mt0.m156174a("withFollowship", "true"), mt0.m156174a("withLiveState", "true"), mt0.m156174a("withFanBaseMedal", "true"), mt0.m156174a("withHierarchy", "true")), "fanleaderboard" + str);
    }

    /* JADX INFO: renamed from: e6 */
    public static C22306c<BLiveMultiCall> m71447e6(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-calls/" + str)).m107524p().m107536c("action", "hang-up").m107536c("hangUpReason", str2).m107537d(), "hangUpCall", "").filter(new w9j() { // from class: l.pnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.aov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: e7 */
    public static C22306c<j760<BLivePk, List<User>>> m71448e7(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/pks/" + str)).m107524p().m107536c("with", "users").m107537d(), "requesetPk" + str).map(new w9j() { // from class: l.vgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71245I2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m71450f0(Throwable th) {
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ BLivePk m71453f3(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: f4 */
    public static C22306c<BLive> m71454f4(String str, boolean z, String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/rooms/" + str + "/lives")).m107524p().m107536c("push", String.valueOf(z)).m107536c("osVersion", Build.VERSION.RELEASE).m107536c("source", str3);
        if ("obs".equals(str2)) {
            c16188aM107536c.m107536c("mode", "start");
        } else {
            c16188aM107536c.m107536c("mode", "prepare");
        }
        c16188aM107536c.m107536c("liveMode", str2);
        return upv.m194917e(c16188aM107536c.m107537d(), "createLive", "").filter(new w9j() { // from class: l.ijv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.jjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71435d3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f5 */
    public static C22306c<BLiveEnvelope> m71455f5(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3) {
        String strConcat = (z ? "anchor" : "audience").concat(z2 ? "-caller" : "");
        if (z3 && (z || z2)) {
            strConcat = "multiUser";
        }
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-bottomMenu")).m107524p().m107536c("officialShowAnchorId", str3).m107536c("roomId", str).m107536c("userType", strConcat).m107536c("fakeId", w220.m201015b() ? w220.m201014a() : "").m107536c("liveMode", str2);
        if (z3) {
            if (z4) {
                if (z) {
                    c16188aM107536c.m107536c("multiCallRole", Owner.TYPE);
                } else {
                    c16188aM107536c.m107536c("multiCallRole", "audience");
                }
            } else if (z) {
                c16188aM107536c.m107536c("multiCallRole", "anchor");
            } else {
                c16188aM107536c.m107536c("multiCallRole", "audience");
            }
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "getLiveBottomButtonsAndBubblesConfig_" + c16188aM107536c.m107537d().toString() + str3);
    }

    /* JADX INFO: renamed from: f6 */
    public static C22306c<List<BLiveCall>> m71456f6(String str, boolean z, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", z ? "anchor-hang-up" : "user-hang-up").m107536c("hangupReason", str2).m107537d(), "hangUpVoiceCall", "").filter(new w9j() { // from class: l.liv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.wiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public static void m71457f7() {
        upv.m194920h(cll.m107499l(ytr.m216073b("/live-bubble-config")), "getBubbleConfig").subscribe(ffw.m121194e(new e30() { // from class: l.cnv
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71180B0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dnv
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71450f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m71458g(boolean z, BLiveEnvelope bLiveEnvelope) {
        return z ? bLiveEnvelope.data.anchorDailyTasks : bLiveEnvelope.data.userDailyTasks;
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ roj0 m71460g1(Throwable th) {
        gkh0.m126627j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ BLiveRoom m71461g2(List list) {
        return (BLiveRoom) list.get(0);
    }

    /* JADX INFO: renamed from: g4 */
    public static C22306c<BLivePkInvite> m71463g4(String str, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        String strM216073b = ytr.m216073b("/pk-invites");
        BLivePkInvite bLivePkInvite = new BLivePkInvite();
        bLivePkInvite.isOnceMore = z;
        bLivePkInvite.f44426to = str;
        bLivePkInvite.source = bLivePkInviteSource;
        return upv.m194928p(cll.m107499l(strM216073b), "inviteFriend", bLivePkInvite.toJson()).map(new w9j() { // from class: l.xgv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71469h1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public static C22306c<r8d0> m71464g5(BLiveAbsData bLiveAbsData) {
        return m71482i5(bLiveAbsData.f44323id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: g6 */
    public static C22306c<BLiveMultiCallSwitchToLeadRoleInvite> m71465g6(String str, String str2, String str3, String str4) {
        String strM216073b = ytr.m216073b("/multi-call-switch-to-lead-role-invite");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerUserId", str);
        jsonObject.addProperty("ownerCallId", str2);
        jsonObject.addProperty("toUserId", str3);
        jsonObject.addProperty("toCallId", str4);
        return upv.m194928p(cll.m107499l(strM216073b), "inviteUserToBeLeadRole", jsonObject.toString()).map(new w9j() { // from class: l.djv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: g7 */
    public static C22306c<BLiveEnvelope> m71466g7(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live/fake-user/" + str + "/profile")), "live/fake-user/" + str + "/profile");
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ BLivePkInvite m71469h1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Boolean m71471h3(BLiveEnvelope bLiveEnvelope) {
        BLiveMultiCallAsset bLiveMultiCallAsset = bLiveEnvelope.data.multiCallAsset;
        return Boolean.valueOf(bLiveMultiCallAsset != null && bLiveMultiCallAsset.multiCallSwitch);
    }

    /* JADX INFO: renamed from: h4 */
    public static C22306c<BLivePkSeek> m71472h4(int i) {
        String str;
        if (i == 3) {
            str = "{\n  \"category\": \"bounty\"\n}";
        } else {
            str = i == 4 ? "{\n  \"category\": \"rank\"\n}" : "";
        }
        return upv.m194928p(cll.m107499l(ytr.m216073b("/pk-seeks")), "createPkSeek", str).map(new w9j() { // from class: l.ejv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71316Q1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static C22306c<r8d0> m71473h5(String str) {
        return m71500k5(str);
    }

    /* JADX INFO: renamed from: h6 */
    public static C22306c<BLiveEnvelope> m71474h6(String str, String str2) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + str + "/users/" + str2 + "/invite-settle")).m107524p().m107537d(), "inviteSettle", "");
    }

    /* JADX INFO: renamed from: h7 */
    public static C22306c<BLiveEnvelope> m71475h7(String str, String str2) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216077f("/" + str + "/leaderboard"));
        c16188aM67307m.m107536c("roomId", str2);
        c16188aM67307m.m107536c("source", "live");
        if (w220.m201015b()) {
            c16188aM67307m.m107536c("fakeId", w220.m201014a());
        }
        return upv.m194935w(c16188aM67307m.m107537d(), "requestLeaderBoards").doOnNext(new e30() { // from class: l.wmv
            @Override // p149l.e30
            public final void call(Object obj) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135640l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ i5u m71479i2(BLiveSuggestLive bLiveSuggestLive) {
        return new i5u(bLiveSuggestLive.f44450id, BLiveState.get(bLiveSuggestLive.state));
    }

    /* JADX INFO: renamed from: i4 */
    public static C22306c<BLiveRoom> m71481i4(BLiveRoom bLiveRoom) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/rooms")), "createRoom", bLiveRoom.toJson()).map(new w9j() { // from class: l.jov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71173A2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public static C22306c<r8d0> m71482i5(String str, final boolean z, boolean z2, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            gkh0.m126627j("[live][trace_problem]", Log.getStackTraceString(new Throwable("liveId is Null")));
            return C22306c.error(new Exception("liveId can't be null"));
        }
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216077f("/" + str)).m107524p().m107536c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m107536c("errcode", String.valueOf(str2));
        if (z) {
            c16188aM107536c.m107536c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("callback", str3);
        }
        return upv.m194920h(c16188aM107536c.m107537d(), "getLiveInfo" + str).filter(new w9j() { // from class: l.rnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71569s2(z, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.snv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71255J3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public static C22306c<BLiveMultiCall> m71483i6(String str) {
        return m71264K3(str, "inviteSwitchToVideo");
    }

    /* JADX INFO: renamed from: i7 */
    public static C22306c<BLiveEnvelope> m71484i7(String str, int i) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str + "/members")).m107524p().m107536c("with", "users,followships").m107536c(Constants.KEY_LIMIT, String.valueOf(i)).m107537d(), "requestMembers").doOnNext(new e30() { // from class: l.kkv
            @Override // p149l.e30
            public final void call(Object obj) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135640l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BLiveRoom m71485j(BLiveEnvelope bLiveEnvelope) {
        List<BLiveRoom> list = bLiveEnvelope.data.rooms;
        return !vwb.m200296J(list) ? list.get(0) : BLiveRoom.new_();
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ BLive m71487j1(BLive bLive) {
        if (bLive.isMultiCall()) {
            r610.m177974I(bLive.multiCallInfo.role, bLive.f44323id);
        }
        return bLive;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Integer m71488j2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.fanbaseRedPacketEventCounters)) {
            return 0;
        }
        return Integer.valueOf(bLiveEnvelope.data.fanbaseRedPacketEventCounters.get(0).unreadCount);
    }

    /* JADX INFO: renamed from: j4 */
    public static C22306c<roj0> m71490j4(String str, String str2, boolean z) {
        return upv.m194922j(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-stickers/" + str2)).m107524p().m107536c("replace", String.valueOf(z)).m107537d(), "deleteSticker" + str, "").map(new w9j() { // from class: l.vnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public static C22306c<r8d0> m71491j5(BLive bLive, String str) {
        return m71482i5(bLive.f44323id, true, true, str, bLive.callback);
    }

    /* JADX INFO: renamed from: j6 */
    public static C22306c<List<BLiveCall>> m71492j6(String str) {
        return upv.m194925m(cll.m107499l(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "anchor-switch-to-video-invited").toString()), "inviteVideoCall", "").map(new w9j() { // from class: l.akv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public static C22306c<BLiveEnvelope> m71493j7(boolean z, String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/rooms/" + str2 + "/messages")).m107524p().m107536c("live", str).m107537d(), "requestMessages");
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ roj0 m71495k0(List list) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126017K(list);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ BLiveDanmakuList m71497k2(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ LiveRoomSuggestBean m71498k3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new LiveRoomSuggestBean(bLiveData.suggestedLives, bLiveData.liveQuitPopup);
    }

    /* JADX INFO: renamed from: k4 */
    public static C22306c<List<BLiveCall>> m71499k4(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-go-away").m107537d(), "deputyGoAway", "").map(new w9j() { // from class: l.ipv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public static C22306c<r8d0> m71500k5(String str) {
        return m71482i5(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: k6 */
    public static C22306c<BLiveEnvelope> m71501k6(String str, String str2) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216075d(str + "/users/" + str2), new mt0[0]), "joinFanBases" + str + str2, "");
    }

    /* JADX INFO: renamed from: k7 */
    public static C22306c<List<BLiveCommonViewConfig>> m71502k7() {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/campaigns/previews"), new mt0[0]), "requestPkPreviews").map(new w9j() { // from class: l.mjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.previews;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ t9u m71507l3(BLiveEnvelope bLiveEnvelope) {
        return new t9u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    /* JADX INFO: renamed from: l4 */
    public static C22306c<List<BLiveCall>> m71508l4(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-come-back").m107537d(), "deputyGoBack", "").map(new w9j() { // from class: l.hiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static C22306c<t9u> m71509l5(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
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
                strReplaceAll = f47684a.matcher(strReplaceAll).replaceAll("&limit=" + i);
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
        sb.append(cll.m107499l(ytr.m216073b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, str).m107536c("source", str2).m107536c("with", "rooms,users").toString());
        sb.append(strReplaceAll);
        return upv.m194920h(cll.m107499l(sb.toString()), "getLiveListV2" + str + str2 + strReplaceAll).map(new w9j() { // from class: l.wlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71507l3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public static C22306c<BLivePk> m71510l6(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pks/" + str)).m107524p().m107536c("action", "join").m107537d(), "joinPk" + str, "").map(new w9j() { // from class: l.yhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71453f3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public static C22306c<BLivePkSummary> m71511l7() {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216073b("/pk-summaries"), new mt0[0]), "requestPkSummaries").map(new w9j() { // from class: l.kjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71225G0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m71512m(String str, String str2, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 41027) {
                lsi0.m151580j(str);
                return;
            } else if (i == 41025) {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f47552u));
                return;
            }
        }
        lsi0.m151580j(str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ BLivePkSeek m71513m0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ BLiveData m71514m1(BLiveEnvelope bLiveEnvelope) {
        ((ggv) ypv.m215673l(fld0.f98148c)).f102546g = bLiveEnvelope.pagination;
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: m4 */
    public static C22306c<BLiveEnvelope> m71517m4(String str) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-recall"), new mt0[0]), "doInvitationRequest", "");
    }

    /* JADX INFO: renamed from: m5 */
    public static C22306c<BLiveEnvelope> m71518m5() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/tricks/sign-in/prizes")), "getLivePrizeList");
    }

    /* JADX INFO: renamed from: m6 */
    public static C22306c<roj0> m71519m6(String str, String str2, String str3) {
        return upv.m194913a(cll.m107499l(ytr.m216073b("/rooms/" + str + "/members/" + str2)).m107524p().m107536c("fakeId", str3).m107537d(), "kickOff", "").map(new w9j() { // from class: l.skv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public static C22306c<BLiveEnvelope> m71520m7(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-officialshow-user/" + str)), "requestOfficialShowRoom" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ wxp m71522n0(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new wxp(bLiveData.callInvites, bLiveData.users);
    }

    /* JADX INFO: renamed from: n4 */
    public static C22306c<BLiveEnvelope> m71526n4(String str, String str2, String str3) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-recall-message"), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray(str2));
            jSONObject.put("content", str3);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194917e(cllVarM67315u, "doRecallRequest", jSONObject.toString());
    }

    /* JADX INFO: renamed from: n5 */
    public static C22306c<BLivePushLimit> m71527n5(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/rooms/" + str + "/push-counters")), "pushCounters" + str).map(new w9j() { // from class: l.jhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).counters.livePushLimit;
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public static C22306c<BLivePk> m71528n6(String str, String str2) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pks/" + str)).m107524p().m107536c("action", str2).m107537d(), "joinPk" + str, "").map(new w9j() { // from class: l.zov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71362V2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public static C22306c<BLiveRtcToken> m71529n7(String str, String str2) {
        String strM216073b = ytr.m216073b("/rtc-tokens");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("channel", str);
        jsonObject.addProperty("usage", "multi-call");
        jsonObject.addProperty("rtcProvider", str2);
        return upv.m194928p(cll.m107499l(strM216073b), "requestSdkToken", jsonObject.toString()).filter(new w9j() { // from class: l.tiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m71399Z3(((BLiveEnvelope) obj).data.rtcTokens));
            }
        }).map(new w9j() { // from class: l.uiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ArrayList m71530o(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.m200303Q(bLiveEnvelope.data.managers, new w9j() { // from class: l.bmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public static C22306c<BFansBaseRecall> m71535o4(String str) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216072a(str + "/fanbase-recall"), new mt0[0]), "RequestFansRecall").map(new w9j() { // from class: l.lmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71332S((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public static C22306c<BLiveStickerMetaData> m71536o5() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live-sticker-templates-metadata")), "liveStickerMetaData").map(new w9j() { // from class: l.spv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplatesMetadata;
            }
        });
    }

    /* JADX INFO: renamed from: o6 */
    public static void m71537o6(String str) {
        upv.m194917e(cll.m107501r(ytr.m216073b("/live-reports")).m107524p().m107537d(), "live-reports", str).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: o7 */
    public static C22306c<BLiveRtcToken> m71538o7(String str, String str2, String str3) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/rtc-tokens")), "requestSdkToken", "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\"}").filter(new w9j() { // from class: l.inv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new w9j() { // from class: l.jnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveAddStickerResult m71539p(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ BLivePk m71540p0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ String m71543p3(BLiveEnvelope bLiveEnvelope) {
        return vwb.m200296J(bLiveEnvelope.data.fanbases) ? "" : bLiveEnvelope.data.fanbases.get(0).f44363id;
    }

    /* JADX INFO: renamed from: p4 */
    public static C22306c<List<BLiveDailyTasks>> m71544p4(final boolean z, String str, String str2, String str3, String str4) {
        String str5 = z ? "/anchor-daily-tasks" : "/user-daily-tasks";
        return upv.m194914b(cll.m107501r(ytr.m216073b("/users/" + ypv.f199493a.m199309D0() + str5)).m107524p().m107536c("action", str4).m107536c("taskId", str).m107536c("taskDate", str2).m107536c("delta", str3).m107537d(), ytr.m216073b("/users/" + ypv.f199493a.m199309D0() + str5), "").map(new w9j() { // from class: l.blv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71458g(z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public static C22306c<BLiveEnvelope> m71545p5(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216077f("/" + str + "/summaries")), "getLiveSummaries" + str);
    }

    /* JADX INFO: renamed from: p6 */
    public static C22306c<ArrayList<String>> m71546p6(final String str, String str2, boolean z) {
        C22306c<BLiveEnvelope> c22306cM194913a;
        final String string;
        final String string2;
        cll cllVarM107499l = cll.m107499l(ytr.m216073b("/rooms/" + str + "/managers/" + str2));
        if (z) {
            c22306cM194913a = upv.m194919g(cllVarM107499l, "manageRoomManager", "");
            string = ypv.f199497e.getString(R$string.f47224f0);
            string2 = ypv.f199497e.getString(R$string.f47246g0);
        } else {
            c22306cM194913a = upv.m194913a(cllVarM107499l, "manageRoomManager", "");
            string = ypv.f199497e.getString(R$string.f47062Xb);
            string2 = ypv.f199497e.getString(R$string.f47083Yb);
        }
        final String string3 = ypv.m215672k().m195854hb() > 0 ? String.format(ypv.f199497e.getString(R$string.f47499rc), Integer.valueOf(ypv.m215672k().m195854hb())) : ypv.f199497e.getString(R$string.f46563A6);
        return c22306cM194913a.doOnError(new e30() { // from class: l.ylv
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71512m(string3, string, (Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.zlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71179B(string2, str, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.amv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71530o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public static C22306c<BLiveRtcToken> m71547p7(String str, String str2, String str3, String str4, String str5) {
        String str6 = "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\" , \"eventType\":\"" + str4 + "\" , \"role\":\"" + str5 + "\"}";
        return upv.m194930r(cll.m107499l(ytr.m216073b("/rtc-tokens")), "requestRtcToken" + str, str6).filter(new w9j() { // from class: l.fjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new w9j() { // from class: l.gjv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public static C22306c<roj0> m71553q4(String str, String str2, String str3) {
        return upv.m194919g(cll.m107499l(ytr.m216073b("/rooms/" + str + "/jailedlist/" + str2)), "forbiddenWords" + str2, BLiveFakeIdRequestBody.getFakeIdBody(str3)).map(new w9j() { // from class: l.njv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: q5 */
    public static C22306c<User> m71554q5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-users/" + str)).m107524p().m107536c("with", "followships,relationships").m107537d(), "live-users/" + str).map(new w9j() { // from class: l.lov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71595v1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public static C22306c<roj0> m71555q6(String str, String str2, com.alibaba.fastjson.JSONObject jSONObject) {
        return upv.m194914b(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-stickers/" + str2)), "modifySticker" + str, jSONObject.toString()).map(new w9j() { // from class: l.qpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).onErrorReturn(new w9j() { // from class: l.rpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public static C22306c<k450> m71556q7(String str) {
        return upv.m194935w(LiveApiBuilder.m67315u(ytr.m216073b("/lives/" + str + "/official-shows"), new mt0[0]), "requestShowInfo" + str).map(new w9j() { // from class: l.ehv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71344T2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m71557r(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdentity bLiveIdentity;
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return Boolean.valueOf((bLiveIdCardVerificationInfo != null && TEnum.equals(bLiveIdCardVerificationInfo.status, "verified")) || ((bLiveIdentity = bLiveVerificationCenter.identity) != null && "idCard".equals(bLiveIdentity.certificate.type) && TEnum.equals(bLiveVerificationCenter.identity.status, "verified")));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m71558r0(final BLiveEnvelope bLiveEnvelope) {
        vwb.m200354z(bLiveEnvelope.data.multiCalls, new e30() { // from class: l.apv
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) obj;
                bLiveMultiCall.followship = (Followship) vwb.m200346r(bLiveEnvelope.data.followships, new w9j() { // from class: l.zhv
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCall.userId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCalls;
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ BLivePkInvite m71560r2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: r4 */
    public static C22306c<BLiveSignInAchievementMedals> m71562r4() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/tricks/sign-in/achievement-medals")), "getAchievementMedals").map(new w9j() { // from class: l.clv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInAchievementMedals;
            }
        }).filter(new w9j() { // from class: l.dlv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).map(new w9j() { // from class: l.elv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71287N((List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.flv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71342T0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r5 */
    public static C22306c<BLiveMultiPkLeaderboard> m71563r5(String str, String str2, String str3) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-pks/leaderboard?pkId=" + str + "&anchorId=" + str2 + "&fakeId=" + str3)).m107524p().m107537d(), "getMultiPkBoard").map(new w9j() { // from class: l.yov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkLeaderboard;
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public static C22306c<BLiveMultiCallSummary> m71564r6(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-calls/" + str + "/summary")).m107524p().m107537d(), "multiCallSummary_" + str).map(new w9j() { // from class: l.xiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSummary;
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public static void m71565r7(String str, String str2) {
        upv.m194935w(cll.m107499l(ytr.m216073b("/leaderboard/gift_star/current")).m107524p().m107536c("anchorId", str).m107536c("liveMode", str2).m107537d(), "requestStarBoard").subscribe(ffw.m121194e(new e30() { // from class: l.wov
            @Override // p149l.e30
            public final void call(Object obj) {
                LivingNormalApiProvider.m71397Z1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hpv
            @Override // p149l.e30
            public final void call(Object obj) {
                ((ggv) ypv.m215673l(fld0.f98148c)).f102547h.m132487l(BLiveGiftStarBoard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ Boolean m71568s1(List list) {
        if (vwb.m200296J(list)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        BLiveIdentity bLiveIdentity = ((BLiveVerificationCenter) list.get(0)).identity;
        if (bLiveIdentity != null && TEnum.equals(bLiveIdentity.status, "verified")) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ Boolean m71569s2(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((vwb.m200296J(bLiveEnvelope.data.lives) || vwb.m200296J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!vwb.m200296J(bLiveEnvelope.data.lives));
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Boolean m71570s3(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.verificationCenter)) {
            return Boolean.FALSE;
        }
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveEnvelope.data.verificationCenter.get(0).voiceAnchor;
        return bLiveVerificationAnchor == null ? Boolean.FALSE : Boolean.valueOf(TEnum.equals(bLiveVerificationAnchor.status, "verified"));
    }

    /* JADX INFO: renamed from: s4 */
    public static C22306c<BLiveAddStickerResult> m71571s4(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-stickers")), "getAddedSticker" + str).map(new w9j() { // from class: l.phv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71620y((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static C22306c<BLiveMultiPkPanel> m71572s5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-pk-panel?ownerLiveId=" + str)).m107524p().m107537d(), "getMultiPkPanel").map(new w9j() { // from class: l.kov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkPanel;
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public static C22306c<BLiveMultiPkDetail> m71573s6(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-pk/" + str)).m107524p().m107537d(), "multiPkDetail").map(new w9j() { // from class: l.nhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPk;
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public static C22306c<User> m71574s7(String str, @Nullable String str2) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-users/" + str)).m107524p().m107536c("with", "followships,relationships");
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107536c.m107536c("liveID", str2);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "live-users/" + str + str2).map(new w9j() { // from class: l.aiv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71576t0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ User m71576t0(BLiveEnvelope bLiveEnvelope) {
        User user = bLiveEnvelope.data.users.get(0);
        user.localFollowship = vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(user);
        return user;
    }

    /* JADX INFO: renamed from: t4 */
    public static C22306c<BLiveEnvelope> m71580t4(String str) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216072a("/" + str + "/fanbases"), new mt0[0]), "getFanbaseAnchor" + str);
    }

    /* JADX INFO: renamed from: t5 */
    public static C22306c<BLiveMultiPkAsset> m71581t5(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + str + "/multi-pk-asset")).m107524p().m107537d(), "getMultiPkSetting").map(new w9j() { // from class: l.iov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public static C22306c<BLiveMultiCall> m71582t6(String str) {
        return m71264K3(str, BLiveButtonType.mute);
    }

    /* JADX INFO: renamed from: t7 */
    public static C22306c<BLiveEnvelope> m71583t7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8) {
        return m71592u7(str, str2, str3, str4, str5, str6, str7, str8, null);
    }

    /* JADX INFO: renamed from: u3 */
    public static C22306c<Boolean> m71588u3(String str, Boolean bool, String str2) {
        return upv.m194925m(m71282M3(str, bool.booleanValue() ? "turn-on-reject-invite" : "turn-off-reject-invite", str2), "acceptInvite_" + bool, "").map(new w9j() { // from class: l.nnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r610.m177972G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new gnv()).map(new w9j() { // from class: l.onv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).rejectInvite);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public static C22306c<BLiveAnchor> m71589u4(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/anchors/" + str)), "anchorInfo" + str).filter(new w9j() { // from class: l.jpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new w9j() { // from class: l.kpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u5 */
    public static C22306c<List<BLiveVerificationCenter>> m71590u5() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/" + strM199309D0 + "/verifications/" + strM199309D0)), "liveVerification").map(new w9j() { // from class: l.hmv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public static C22306c<BLiveEnvelope> m71591u6(String str, String str2) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216075d(str + "/notify"), new mt0[0]), "notifyFanbase" + str, str2);
    }

    /* JADX INFO: renamed from: u7 */
    public static C22306c<BLiveEnvelope> m71592u7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-users2/" + str)).m107524p().m107536c("from", str3).m107536c("to", str4).m107536c("scene", str5).m107536c("source", str6).m107536c("liveId", str2).m107536c("roomId", str7);
        if (!TextUtils.isEmpty(str8)) {
            c16188aM107536c.m107536c("anchorId", str8);
        }
        if (NullChecker.m81303a(bLiveMultiCall)) {
            c16188aM107536c.m107536c("multiCallOwnerRoomId", bLiveMultiCall.ownerRoomId);
            c16188aM107536c.m107536c("multiCallOwnerLiveId", bLiveMultiCall.ownerLiveId);
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            CrashHelper.m81296c(new Exception("requestUserCardAndMedals userId is null   url = " + c16188aM107536c.toString()));
        }
        return upv.m194920h(c16188aM107536c.m107537d(), "live-users2/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ BLive m71593v(List list) {
        return (BLive) list.get(0);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ User m71595v1(BLiveEnvelope bLiveEnvelope) {
        User user = bLiveEnvelope.data.users.get(0);
        user.localFollowship = vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(user);
        return user;
    }

    /* JADX INFO: renamed from: v3 */
    public static C22306c<BLivePkInvite> m71597v3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pk-invites/" + str)), "acceptPkInvite" + str, "{\n  \"state\": \"accepted\"\n}").map(new w9j() { // from class: l.pkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71262K1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static C22306c<List<BLiveMultiCallInvite>> m71598v4() {
        return m71193C4(s410.f162213C);
    }

    /* JADX INFO: renamed from: v5 */
    public static C22306c<BLiveEnvelope> m71599v5(String str, String str2, int i, int i2, boolean z) {
        return m71608w5(str, str2, i, i2, z, null);
    }

    /* JADX INFO: renamed from: v6 */
    public static C22306c<roj0> m71600v6(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216077f("/" + str)), "notifyLiveStreamReady" + str, "{\n  \"state\": \"streamReady\"\n}").map(new w9j() { // from class: l.qnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public static C22306c<Boolean> m71601v7() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/" + strM199309D0 + "/verifications/" + strM199309D0)).m107524p().m107536c("process", ShareConstants.NEW_VERSION).m107537d(), "voiceLiveVerification").map(new w9j() { // from class: l.ohv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71570s3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ roj0 m71603w0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.videoQualities)) {
            ((idv) ypv.m215673l(fld0.f98147b)).f112691c = bLiveEnvelope.data.videoQualities.get(0);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: w3 */
    public static C22306c<roj0> m71606w3(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/multi-pk-invites/" + str)).m107524p().m107536c("action", z ? "accept" : "reject").m107537d(), "acceptReStartMultiPk", "").map(new w9j() { // from class: l.viv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public static C22306c<List<BLiveMultiCall>> m71607w4(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/multi-calls")).m107524p().m107536c("states", s410.f162247m).m107536c("liveId", str).m107536c("with", "followships").m107537d(), "getApplyList").map(new w9j() { // from class: l.omv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71558r0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static C22306c<BLiveEnvelope> m71608w5(String str, String str2, int i, int i2, boolean z, @Nullable String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216080i("/me/leaderboards/" + str)).m107524p().m107536c("start", String.valueOf(i)).m107536c("end", String.valueOf(i2)).m107536c("scopeId", str2).m107536c("withHierarchy", "true");
        if (z) {
            c16188aM107536c.m107536c("withVoiceUserMask", "true");
        }
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("roomId", str3);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "contributeRecords" + str2);
    }

    /* JADX INFO: renamed from: w6 */
    public static C22306c<BLivePk> m71609w6(String str, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pks/" + str + "?action=" + (z ? BLiveButtonType.mute : "unmute"))), "notifyPkAudioMute" + str, "").map(new w9j() { // from class: l.dov
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71540p0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public static C22306c<far> m71610w7(String str, String str2, String str3) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216077f("/" + str + "/week-leaderboard")).m107524p();
        c16188aM107524p.m107536c("source", "live");
        c16188aM107524p.m107536c("with", "users");
        c16188aM107524p.m107536c("roomId", str2);
        c16188aM107524p.m107536c("type", str3);
        if (w220.m201015b()) {
            c16188aM107524p.m107536c("fakeId", w220.m201014a());
        }
        return upv.m194935w(c16188aM107524p.m107537d(), "requestWeekLeaderBoard").doOnNext(new e30() { // from class: l.epv
            @Override // p149l.e30
            public final void call(Object obj) {
                ((idv) ypv.m215673l(fld0.f98147b)).m135640l(((BLiveEnvelope) obj).data.users);
            }
        }).map(new w9j() { // from class: l.fpv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71388Y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static C22306c<List<BLiveCall>> m71615x3(String str) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/calls/" + str)).m107524p().m107536c("action", "user-switch-to-video-accepted").m107537d(), "acceptVideoCall", "").map(new w9j() { // from class: l.hkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public static C22306c<List<BLiveClarity>> m71616x4(String str) {
        return upv.m194920h(LiveApiBuilder.m67307m(ytr.m216077f("/" + str + "/clarity-list")).m107537d(), "getArticulationList" + str).map(new w9j() { // from class: l.lkv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveClarityLevelInfos;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static void m71617x5(String str) {
        fld0<ggv> fld0Var = fld0.f98148c;
        if (!NullChecker.m81303a(((ggv) ypv.m215673l(fld0Var)).f102546g) || TextUtils.isEmpty(((ggv) ypv.m215673l(fld0Var)).f102546g.links.next)) {
            return;
        }
        m71437d5(str, ((ggv) ypv.m215673l(fld0Var)).f102546g.links.next);
    }

    /* JADX INFO: renamed from: x6 */
    public static C22306c<Boolean> m71618x6(String str, Boolean bool, String str2) {
        return upv.m194925m(m71282M3(str, bool.booleanValue() ? "turn-on-free-call" : "turn-off-free-call", str2), "openFreeCall_" + bool, "").map(new w9j() { // from class: l.fnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r610.m177972G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new gnv()).map(new w9j() { // from class: l.hnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).freeCall);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public static C22306c<Boolean> m71619x7() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        return upv.m194935w(cll.m107499l(ytr.m216073b("/users/" + strM199309D0 + "/verifications/" + strM199309D0)), "getCallVideoAuth").map(new w9j() { // from class: l.xnv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new w9j() { // from class: l.ynv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) vwb.m200346r((List) obj, new w9j() { // from class: l.ljv
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m71557r((BLiveVerificationCenter) obj2);
                    }
                })) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ BLiveAddStickerResult m71620y(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ List m71622y1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveStickerTemplatesGiftItem> list = bLiveEnvelope.data.liveStickerTemplatesGifts;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: y3 */
    public static C22306c<BLiveEnvelope> m71624y3(String str, String str2) {
        return upv.m194928p(cll.m107499l(ytr.m216073b("/rooms/" + str + "/blacklist/" + str2 + "?method=put")).m107524p().m107537d(), "deFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: y4 */
    public static C22306c<List<BLiveMultiCallInvite>> m71625y4() {
        return m71193C4(s410.f162214D);
    }

    /* JADX INFO: renamed from: y5 */
    public static C22306c<t9u> m71626y5(String str, String str2, String str3, int i, Pagination pagination, String str4, boolean z) {
        return m71509l5(str, str2, str3, i, pagination.links.next, false, str4, z);
    }

    /* JADX INFO: renamed from: y6 */
    public static C22306c<BLiveMultiCallAsset> m71627y6(String str) {
        return upv.m194925m(m71282M3(ypv.f199493a.m199309D0(), "turn-on-multi-call", str), "openMultiCall", "").map(new w9j() { // from class: l.npv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        }).filter(new w9j() { // from class: l.opv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y7 */
    public static C22306c<BLiveEnvelope> m71628y7(String str, int i) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216077f("/" + str + "/clarity-level-selected"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put(MatchFrom.selected, (Object) Integer.valueOf(i));
        jSONObject.put("liveId", (Object) str);
        return upv.m194917e(c16188aM67307m.m107537d(), "selectArticulation" + str + i, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: z3 */
    public static C22306c<BLiveAddStickerResult> m71633z3(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        return upv.m194917e(cll.m107499l(ytr.m216073b("/rooms/" + str + "/live-stickers")), "addSticker" + str, jSONObject.toString()).map(new w9j() { // from class: l.ymv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71539p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public static C22306c<BLiveEnvelope> m71634z4(String str, String str2) {
        return upv.m194920h(LiveApiBuilder.m67315u(ytr.m216080i("/" + str + "/fanbases/" + str2 + "/medals"), new mt0[0]), "getAudienceMedals" + str + str2);
    }

    /* JADX INFO: renamed from: z5 */
    public static C22306c<BLiveEnvelope> m71635z5(String str) {
        return upv.m194935w(cll.m107499l(cll.m107499l(ytr.m216073b("/anchors")).m107524p().m107536c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-matched").m107536c("with", "lives,users").toString() + "&" + str), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: z6 */
    public static C22306c<BLiveRoom> m71636z6(String str, BLiveRoom bLiveRoom) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/rooms/" + str)), "patchRoom", bLiveRoom.toJson()).filter(new w9j() { // from class: l.dhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.rooms));
            }
        }).map(new w9j() { // from class: l.fhv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rooms;
            }
        }).map(new w9j() { // from class: l.ghv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m71461g2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public static C22306c<roj0> m71637z7(String str, String str2, boolean z) {
        return upv.m194925m(cll.m107499l(ytr.m216073b("/pks/" + str)).m107524p().m107536c("action", "punish-select").m107536c("motionId", str2).m107536c("auto", String.valueOf(z)).m107537d(), "selectPkPunish", "").map(new w9j() { // from class: l.ugv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
