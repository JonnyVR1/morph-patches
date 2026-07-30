package com.p000p1.mobile.putong.live.livingroom.api;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Pagination;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveAnchorKnightInfos;
import com.p1.mobile.putong.live.base.data.BLiveCall;
import com.p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p1.mobile.putong.live.base.data.BLiveClarity;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveDailyTasks;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveFakeIdRequestBody;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p1.mobile.putong.live.base.data.BLiveIdentity;
import com.p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p1.mobile.putong.live.base.data.BLivePKCardShowList;
import com.p1.mobile.putong.live.base.data.BLivePk;
import com.p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p1.mobile.putong.live.base.data.BLivePostEvent;
import com.p1.mobile.putong.live.base.data.BLivePush;
import com.p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p1.mobile.putong.live.base.data.BLiveVerificationStatus;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p1.mobile.putong.live.base.data.MultiCallApplyRequestData;
import com.p1.mobile.putong.live.livingroom.recreation.pk.bean.PkFriendInfo;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import l.bgv;
import l.cll;
import l.e30;
import l.ffw;
import l.fld0;
import l.g7t;
import l.ggv;
import l.gkh0;
import l.ht70;
import l.i0s;
import l.i5u;
import l.idv;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.mt0;
import l.r610;
import l.r8d0;
import l.roj0;
import l.s410;
import l.t9u;
import l.u5t;
import l.upv;
import l.vnq;
import l.vwb;
import l.w9j;
import l.wq2;
import l.wxp;
import l.x9j;
import l.yi10;
import l.ypv;
import l.ytr;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.far;
import p002l.gnv;
import p002l.h4t;
import p002l.ho2;
import p002l.k450;
import p002l.m6g;
import p002l.w220;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LivingNormalApiProvider {

    /* JADX INFO: renamed from: a */
    public static final Pattern f3726a = Pattern.compile("&limit=(\\d+)");

    /* JADX INFO: renamed from: b */
    public static int f3727b = 30;

    public enum ConnectType {
        VIDEO_TYPE,
        VOICE_TYPE
    }

    public enum SwitchType {
        NORMAL_TO_CALL,
        CALL_TO_NORMAL
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider$a */
    public static /* synthetic */ class C0198a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3728a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3729b;

        static {
            int[] iArr = new int[SwitchType.values().length];
            f3729b = iArr;
            try {
                iArr[SwitchType.NORMAL_TO_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3729b[SwitchType.CALL_TO_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ConnectType.values().length];
            f3728a = iArr2;
            try {
                iArr2[ConnectType.VIDEO_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3728a[ConnectType.VOICE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ BLive m4538A1(BLiveEnvelope bLiveEnvelope) {
        return vwb.J(bLiveEnvelope.data.lives) ? BLive.EMPTY : (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ BLiveRoom m4539A2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.rooms)) {
            return null;
        }
        return (BLiveRoom) bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public static c<BaseLiveBean> m4540A3(String str, String str2, boolean z) {
        cll cllVarU = LiveApiBuilder.u(ytr.c(str + "/audits/" + str2), new mt0[0]);
        if (!z) {
            cllVarU = cllVarU.p().c("reject", "1").d();
        }
        return upv.l(cllVarU, "agreeApply", "", g7t.b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: A4 */
    public static c<BLiveMultiCallAsset> m4541A4(String str, String str2) {
        return upv.w(cll.l(ytr.i("/" + str + "/multi-call-asset")).p().c("liveId", str2).d(), "getCallAssets").map(new w9j() { // from class: l.qov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        });
    }

    /* JADX INFO: renamed from: A5 */
    public static c<BaseLiveListBean<FanbaseGroupAuditsItemBean>> m4542A5(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/fanbase-group-audits?");
        if (TextUtils.isEmpty("next")) {
            str2 = "page=1";
        }
        sb.append(str2);
        return upv.v(LiveApiBuilder.u(ytr.a(sb.toString()), new mt0[0]), "getNoticeList", g7t.a(FanbaseGroupAuditsItemBean.class, "fanbaseGroupAudits"));
    }

    /* JADX INFO: renamed from: A6 */
    public static c<BLiveEnvelope> m4543A6() {
        String strD0 = ypv.a.D0();
        StringBuilder sb = new StringBuilder("/");
        sb.append("anchors");
        sb.append("/me/verifications");
        String string = "";
        sb.append("");
        String strB = ytr.b(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", strD0);
            jSONObject.put(SysnotifListener.KEY_USER_ID, strD0);
            jSONObject.put("anchor", new JSONObject());
            jSONObject.put("type", "verification");
            jSONObject.put("anchorType", "video");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.e(cll.l(strB), "patch_anchor" + strD0, string);
    }

    /* JADX INFO: renamed from: A7 */
    public static c<List<BLiveMultiCallInvite>> m4544A7(List<String> list, String str, String str2, String str3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("source", str3);
        final JsonArray jsonArray = new JsonArray();
        vwb.z(list, new e30() { // from class: l.knv
            public final void call(Object obj) {
                jsonArray.add((String) obj);
            }
        });
        jsonObject.add("userIds", jsonArray);
        jsonObject.addProperty("type", str2);
        jsonObject.addProperty("ownerMultiCallOrder", str);
        return upv.p(cll.l(ytr.b("/multi-call-invites")), "sendInvite", jsonObject.toString()).map(new w9j() { // from class: l.lnv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallInvites;
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ c m4545B(String str, String str2, BLiveEnvelope bLiveEnvelope) {
        lsi0.j(str);
        return upv.w(cll.l(ytr.b("/rooms/" + str2 + "/managers")), "updateManager");
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m4546B0(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.l(fld0.f)).y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        fld0 fld0Var = fld0.b;
        if (((idv) ypv.l(fld0Var)).b.e() == null) {
            ((idv) ypv.l(fld0Var)).b.onNext(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static c<BLiveCall> m4549B3(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "anchor-voice-approved").d(), "agreeVoiceCall", "").filter(new w9j() { // from class: l.tjv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.ujv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4788c((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static void m4550B4(String str) {
        m4541A4(ypv.a.D0(), str).map(new w9j() { // from class: l.lhv
            public final Object call(Object obj) {
                return r610.G((BLiveMultiCallAsset) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.mhv
            public final void call(Object obj) {
                LivingNormalApiProvider.m4592G1((BLiveMultiCallAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static c<List<BLiveMultiCall>> m4551B5(String str) {
        return upv.w(cll.l(ytr.b("/multi-calls")).p().c("states", s410.n + "," + s410.o).c("liveId", str).d(), "getOnGoingCallList").map(new w9j() { // from class: l.sjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public static c<roj0> m4552B6() {
        String strD0 = ypv.a.D0();
        cll cllVarD = cll.l(ytr.b("/users/" + strD0 + "/verifications/" + strD0)).p().c("process", "new").d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        return upv.b(cllVarD, "voiceLiveVerification" + strD0, bLiveVerificationCenter.toJson()).map(new w9j() { // from class: l.oov
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).onErrorReturn(new w9j() { // from class: l.pov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4674P2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public static c<BLiveEnvelope> m4553B7(String str) {
        return upv.e(cll.l(ytr.b("/live-gift/bullet-comments")), "liveSendDanmaku", str);
    }

    /* JADX INFO: renamed from: C3 */
    public static c<roj0> m4558C3() {
        return upv.h(cll.l(ytr.b("/users/" + ypv.a.D0() + "/anchor-verifications")), "anchorVerification").map(new w9j() { // from class: l.fkv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static c<List<BLiveMultiCallInvite>> m4559C4(String str) {
        return upv.w(cll.l(ytr.b("/multi-call-invites")).p().c("type", str).c("with", "followships").d(), "getCallInvites" + str).map(new w9j() { // from class: l.okv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4783b3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public static c<BLive> m4560C5(String str) {
        return upv.h(cll.l(ytr.b("/users/" + str + "/lives")).p().c("state", "ongoing,born").d(), "onGoingLive").map(new w9j() { // from class: l.glv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4538A1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C6 */
    public static c<roj0> m4561C6() {
        c cVarE;
        String strD0 = ypv.a.D0();
        boolean zH5 = ypv.k().H5();
        cll cllVarD = cll.l(zH5 ? m4769Z7(strD0) : m4567D3(strD0)).p().c("process", "new").d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        if (!zH5) {
            bLiveVerificationCenter.anchorType = "voice";
        }
        if (zH5) {
            cVarE = upv.b(cllVarD, "voiceLiveVerification" + strD0, bLiveVerificationCenter.toJson());
        } else {
            cVarE = upv.e(cllVarD, "voiceLiveVerification" + strD0, bLiveVerificationCenter.toJson());
        }
        return cVarE.map(new w9j() { // from class: l.fiv
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).onErrorReturn(new w9j() { // from class: l.giv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4826g1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public static c<BLiveEnvelope> m4562C7(String str, BLiveDanmakuListItem bLiveDanmakuListItem, String str2, String str3, String str4, String str5) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("fakeId", w220.m24291b() ? w220.m24290a() : "");
        jSONObject.put("scenario", "live");
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("originalId", UUID.randomUUID().toString());
        jSONObject2.put("liveId", str2);
        jSONObject2.put("roomId", str3);
        jSONObject2.put("anchorId", str4);
        jSONObject2.put("content", str);
        jSONObject2.put("typeId", bLiveDanmakuListItem.id);
        jSONObject2.put("type", bLiveDanmakuListItem.type);
        jSONObject2.put("subType", bLiveDanmakuListItem.subType);
        jSONObject.put("videoLiveBulletComment", jSONObject2);
        jSONObject.put("liveMode", str5);
        return m4553B7(jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: D3 */
    public static String m4567D3(String str) {
        return ytr.b("/anchors/" + str + "/verifications");
    }

    /* JADX INFO: renamed from: D4 */
    public static c<BLiveChatMangerSettings> m4568D4(@NonNull String str) {
        return upv.w(cll.l(ytr.b("/rooms/" + str + "/chat-settings")), "get_chat_settings_" + str).map(new w9j() { // from class: l.hlv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public static c<BLiveEnvelope> m4569D5(String str, int i) {
        return upv.w(cll.l(ytr.b("/anchors")).p().c("search", "pk-suggested-matched").c("with", "lives,users").c("until", str).c("limit", String.valueOf(i)).d(), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: D6 */
    public static c<BLiveEnvelope> m4570D6(String str, String str2, String str3) {
        return upv.w(cll.l(ytr.b("/anchor_leaderboard")).p().c("anchorId", str).c("liveMode", str2).c("type", str3).d(), "dailyOrWeekLeaderBoards");
    }

    /* JADX INFO: renamed from: D7 */
    public static c<BLiveEnvelope> m4571D7(String str, BLivePostEvent bLivePostEvent) {
        return upv.p(cll.l(ytr.b("/users/me/live-event")), "sendLiveEvent" + str, bLivePostEvent.toJson());
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ BLivePkFirstKillGift m4572E(BLiveEnvelope bLiveEnvelope) {
        return (BLivePkFirstKillGift) bLiveEnvelope.data.pkAssets.firstKillGifts.get(0);
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ BLiveRtcToken m4574E1(BLiveEnvelope bLiveEnvelope) {
        return (BLiveRtcToken) bLiveEnvelope.data.rtcTokens.get(0);
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ BLiveMultiCall m4575E2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: E3 */
    public static c<BLiveMultiCall> m4576E3(MultiCallApplyRequestData multiCallApplyRequestData) {
        return upv.p(cll.l(ytr.b("/multi-calls")), "sendApplyCall", multiCallApplyRequestData.toJson()).filter(new w9j() { // from class: l.lpv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.mpv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4852j0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static c<FanbaseGroupCountBean> m4577E4(String str) {
        return upv.v(LiveApiBuilder.u(ytr.a(str + "/audits-counter"), new mt0[0]), "getCount", g7t.c(FanbaseGroupCountBean.class, "fanbaseGroupAuditCounter"));
    }

    /* JADX INFO: renamed from: E5 */
    public static c<Integer> m4578E5() {
        return upv.h(LiveApiBuilder.u(ytr.b("/pk-suggested-anchors"), new mt0[]{mt0.a("search", "matched"), mt0.a("limit", "50")}), "getOnlineFriendsCount").filter(new w9j() { // from class: l.ilv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new w9j() { // from class: l.jlv
            public final Object call(Object obj) {
                return Integer.valueOf(((BLivePkSuggestAnchors) ((BLiveEnvelope) obj).data.pkSuggestedAnchors.get(0)).anchors.size());
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public static c<BLiveEnvelope> m4579E6(String str, String str2) {
        return upv.w(cll.l(ytr.b("/hour_leaderboard")).p().c("anchorId", str).c("liveMode", str2).d(), "hourLeaderBoards");
    }

    /* JADX INFO: renamed from: E7 */
    public static c<BLiveEnvelope> m4580E7(String str) {
        return upv.e(cll.l(ytr.b("/rooms/" + str + "/live-push")), "sendLivePush", "");
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ BLiveAnchor m4582F0(BLiveEnvelope bLiveEnvelope) {
        return (BLiveAnchor) bLiveEnvelope.data.anchors.get(0);
    }

    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ BLiveData m4584F2(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.anchorKnightInfos.size() > 0) {
            ((ggv) ypv.l(fld0.c)).f.onNext((BLiveAnchorKnightInfos) bLiveEnvelope.data.anchorKnightInfos.get(0));
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: F3 */
    public static c<BLiveCall> m4585F3(String str, String str2, String str3, int i) {
        String strB = ytr.b("/calls");
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.liveId = str;
        bLiveCall.source = str3;
        bLiveCall.inviteId = str2;
        bLiveCall.intendPosition = i;
        if (w220.m24291b()) {
            bLiveCall.fakeId = w220.m24290a();
        }
        return upv.p(cll.l(strB), "applyCallInvite", bLiveCall.toJson()).filter(new w9j() { // from class: l.ikv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.jkv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4917q2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public static c<BLiveDanmakuList> m4586F4(String str, String str2, String str3) {
        return upv.w(cll.l(ytr.b("/live-gift/bullet-comment-types")).p().c("scenario", "live").c("anchorId", str).c("liveId", str2).c("roomId", str3).c("fakeId", w220.m24291b() ? w220.m24290a() : "").d(), "DanmakuList").map(new w9j() { // from class: l.jiv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoLiveBulletCommentTypes;
            }
        }).onErrorReturn(new w9j() { // from class: l.kiv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4863k2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public static void m4587F5(String str, String str2, String str3) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/rooms/" + str + "/members/" + str2));
        if (w220.m24291b()) {
            aVarM.c("fakeId", w220.m24290a());
        }
        aVarM.c("sessionId", str3);
        upv.a(aVarM.d(), "getOutRoom" + str, "");
    }

    /* JADX INFO: renamed from: F6 */
    public static c<BLiveChatMangerSettings> m4588F6(@NonNull String str, BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        cll cllVarL = cll.l(ytr.b("/rooms/" + str + "/chat-settings"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jailedType", bLiveChatJailedType.toString());
            final JSONArray jSONArray = new JSONArray();
            vwb.z(list, new e30() { // from class: l.tgv
                public final void call(Object obj) {
                    jSONArray.put((String) obj);
                }
            });
            jSONObject.put("shieldingWords", jSONArray);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.p(cllVarL, "get_chat_settings_" + str, jSONObject.toString()).map(new w9j() { // from class: l.alv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public static c<BLiveEnvelope> m4589F7(BLiveSendMessageData bLiveSendMessageData) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/room/message"));
        if (w220.m24291b()) {
            bLiveSendMessageData.fakeId = w220.m24290a();
        }
        return upv.e(aVarM.d(), "live-send-message", bLiveSendMessageData.toJson());
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ BLivePkSummary m4591G0(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.pkSummaries;
        if (vwb.J(list)) {
            return null;
        }
        return (BLivePkSummary) list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m4592G1(BLiveMultiCallAsset bLiveMultiCallAsset) {
    }

    /* JADX INFO: renamed from: G3 */
    public static c<FanBaseGroupSummaryBean> m4594G3(String str, String str2) {
        return upv.s(LiveApiBuilder.u(ytr.c(str + "/users/" + str2), new mt0[0]), "applyJoin", "", g7t.c(FanBaseGroupSummaryBean.class, "fanbaseGroupSummary"));
    }

    /* JADX INFO: renamed from: G4 */
    public static c<BLiveExtraResponse> m4595G4(String str) {
        return upv.i(cll.l(ytr.b("/rooms/" + str + "/blacklist")).p().d(), "getDeFriendList", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G5 */
    public static c<BLivePKCardShowList> m4596G5(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.b("/pks/" + str + "/item-cards"), new mt0[]{mt0.a("anchorId", str2)}), "getPkCardItems" + str + str2).map(new w9j() { // from class: l.bkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkItemCardsDetail;
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public static c<BLiveMultiCall> m4597G6(String str, String str2) {
        return upv.m(cll.l(ytr.b("/multi-calls/" + str)).p().c("action", str2).d(), "processLeadRole" + str + "_" + str2, "").map(new w9j() { // from class: l.iiv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4689R((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public static c<BLiveMultiPkAsset> m4598G7(String str, boolean z, int i) {
        cll cllVarD = cll.l(ytr.b("/users/" + str + "/multi-pk-asset")).p().d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("rejectInvite", Boolean.valueOf(z));
        jsonObject.addProperty("duration", Integer.valueOf(i));
        return upv.m(cllVarD, "getMultiPkSetting", jsonObject.toString()).map(new w9j() { // from class: l.nov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ BLive m4600H0(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: H2 */
    public static /* synthetic */ BLiveAnchor m4602H2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveAnchor) bLiveEnvelope.data.anchors.get(0);
    }

    /* JADX INFO: renamed from: H3 */
    public static c<BLiveMultiCall> m4603H3(String str, String str2) {
        return upv.m(cll.l(ytr.b("/multi-calls/" + str)).p().c("action", "approve").c("approveSource", str2).d(), "approve_" + str2 + str, "").filter(new w9j() { // from class: l.cpv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.dpv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4680Q((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public static c<BLiveDownChestRewardInfo> m4604H4(String str, String str2, String str3, String str4, boolean z, String str5) {
        String str6 = z ? "chestGiftReward" : "chestGift";
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", str5);
        jSONObject.put("type", str6);
        jSONObject.put("liveId", str2);
        jSONObject.put("anchorId", str4);
        jSONObject.put("roomId", str3);
        return upv.p(cll.l(str), "chestReward", jSONObject.toString()).map(new w9j() { // from class: l.qiv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4735W0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H5 */
    public static c<BLivePkFirstKillGift> m4605H5() {
        return upv.h(cll.l(ytr.b("/pk-assets")), "getPkFirstKillGift").filter(new w9j() { // from class: l.oiv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.pkAssets.firstKillGifts.size() > 0);
            }
        }).map(new w9j() { // from class: l.piv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4572E((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public static c<BLiveMultiCallSwitchToLeadRoleInvite> m4606H6(String str, String str2) {
        return upv.m(cll.l(ytr.b("/multi-call-switch-to-lead-role-invite/" + str)).p().c("action", str2).d(), "processLeadRoleInvite_" + str + "_" + str2, "").map(new w9j() { // from class: l.khv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public static c<List<BLiveCall>> m4607H7(String str, boolean z, boolean z2) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", (z2 ? "anchor" : "user").concat(z ? "-mute" : "-unmute")).d(), "setMuteDeputy", "").map(new w9j() { // from class: l.zmv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ BLivePkInvite m4610I1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return (BLivePkInvite) bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ j760 m4611I2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pks)) {
            return null;
        }
        ht70.j("requestPk:" + ((BLivePk) bLiveEnvelope.data.pks.get(0)).toString());
        return vwb.Y((BLivePk) bLiveEnvelope.data.pks.get(0), bLiveEnvelope.data.users);
    }

    /* JADX INFO: renamed from: I3 */
    public static c<String> m4612I3(String str, String str2, Boolean bool) {
        return upv.m(cll.l(ytr.b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).p().c("action", bool.booleanValue() ? "approve" : "reject").d(), "approveSettle", "").map(new w9j() { // from class: l.tnv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush.message;
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public static c<roj0> m4613I4() {
        return upv.h(cll.l(ytr.b("/live-video-qualities")).p().c("device", Build.MODEL).d(), "live-video-qualities").map(new w9j() { // from class: l.xlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4969w0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public static c<BLivePkInvite> m4614I5(String str) {
        return upv.w(cll.l(ytr.b("/pk-invites/" + str)).p().c("with", "users,lives").d(), "getPkInviteInfo").map(new w9j() { // from class: l.gkv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4807e0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public static c<List<i5u>> m4615I6(@NonNull List<String> list, boolean z) {
        String strD = vnq.h(",").d(list);
        return upv.h(cll.l(ytr.b(z ? "/feed/recommend/lives" : "/tiny/lives")).p().c("search", "given").c("ids", strD).d(), "ids" + strD).map(new w9j() { // from class: l.uov
            public final Object call(Object obj) {
                return vwb.Q(((BLiveEnvelope) obj).data.suggestedLives, new w9j() { // from class: l.riv
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m4845i2((BLiveSuggestLive) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I7 */
    public static c<BLiveAnchor> m4616I7(boolean z) {
        return upv.m(cll.l(ytr.b("/anchors/" + ypv.a.D0() + "/live-settings")).p().c("fields", "unacceptPk").d(), "setPkAcceptSetting", "{\n  \"unacceptPk\": " + (z ? "true" : "false") + "\n}").filter(new w9j() { // from class: l.tkv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new w9j() { // from class: l.ukv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4582F0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ BLiveRoom m4617J(BLiveEnvelope bLiveEnvelope) {
        ((idv) ypv.l(fld0.b)).c();
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list != null && list.size() > 0) {
            for (BLiveAddStickerResult bLiveAddStickerResult : list) {
                ((idv) ypv.l(fld0.b)).k(bLiveAddStickerResult.id, bLiveAddStickerResult);
            }
        }
        return vwb.J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : (BLiveRoom) bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: J3 */
    public static r8d0 m4621J3(BLiveEnvelope bLiveEnvelope) {
        return new r8d0(vwb.J(bLiveEnvelope.data.users) ? null : (User) bLiveEnvelope.data.users.get(0), vwb.J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : (BLiveAbsRoom) bLiveEnvelope.data.rooms.get(0), (BLiveAbsData) bLiveEnvelope.data.lives.get(0), vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0), vwb.J(bLiveEnvelope.data.liveStickers) ? null : (BLiveAddStickerResult) bLiveEnvelope.data.liveStickers.get(0)).d(bLiveEnvelope);
    }

    /* JADX INFO: renamed from: J4 */
    public static c<BLiveEnvelope> m4622J4(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.i("/" + str2 + "/fanbases/" + str), new mt0[]{mt0.a("with", "hierarchies,medals")}), "getFanBaseInfo" + str + str2);
    }

    /* JADX INFO: renamed from: J5 */
    public static c<List<BLivePkSuggestAnchors>> m4623J5() {
        return upv.h(LiveApiBuilder.u(ytr.b("/pk-suggested-anchors"), new mt0[]{mt0.a("limit", "50")}), "getPkSuggestAnchorList").map(new w9j() { // from class: l.wkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public static c<BLiveEnvelope> m4624J6(String str) {
        return upv.p(LiveApiBuilder.u(ytr.b("/official-show/quit"), new mt0[]{mt0.a("programId", str)}), "quitOfficialShow" + str, "");
    }

    /* JADX INFO: renamed from: J7 */
    public static c<BLiveEnvelope> m4625J7(String str) {
        return upv.p(cll.l(ytr.b("/tricks/sign-in")), "liveSignIn", str);
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ BLivePkInvite m4628K1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return (BLivePkInvite) bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: K3 */
    public static c<BLiveMultiCall> m4630K3(String str, String str2) {
        return upv.m(cll.l(ytr.b("/multi-calls/" + str)).p().c("action", str2).d(), "callAction" + str2 + str, "").filter(new w9j() { // from class: l.anv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.bnv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4575E2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public static c<m6g> m4631K4(final BLiveJoinFanBaseContent bLiveJoinFanBaseContent) {
        String str = bLiveJoinFanBaseContent.anchorId;
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            CrashHelper.c(new Exception("CoreLiveFanBases getAnchorFanbases"));
        }
        return m4946t4(bLiveJoinFanBaseContent.anchorId).map(new w9j() { // from class: l.qhv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4909p3((BLiveEnvelope) obj);
            }
        }).filter(new w9j() { // from class: l.rhv
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).flatMap(new w9j() { // from class: l.shv
            public final Object call(Object obj) {
                String str2 = (String) obj;
                return LivingNormalApiProvider.m4622J4(str2, bLiveJoinFanBaseContent.userId).map(new w9j() { // from class: l.mkv
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m4644M(str2, (BLiveEnvelope) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: K5 */
    public static c<List<BLivePkSuggestAnchors>> m4632K5(Pagination pagination) {
        String str = ytr.b("/pk-suggested-anchors") + "?" + pagination.links.next;
        return upv.h(cll.l(str), "getPkSuggestLoadMore".concat(str)).map(new w9j() { // from class: l.rlv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public static c<roj0> m4633K6(String str, List<String> list) {
        cll cllVarD = cll.l(ytr.b("/multi-pk-invites")).p().d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return upv.p(cllVarD, "reStartMultiPk", jsonObject.toString()).map(new w9j() { // from class: l.ppv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public static c<roj0> m4634K7(String str, List<String> list) {
        cll cllVarD = cll.l(ytr.b("/multi-pk")).p().d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return upv.p(cllVarD, "startMultiPk", jsonObject.toString()).map(new w9j() { // from class: l.hov
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public static c<i0s> m4639L3(String str) {
        return upv.w(cll.l(ytr.b("/calls")).p().c("liveId", str).c("with", "users").c("state", "created,on-voice,on-video").d(), "callApplyList").map(new w9j() { // from class: l.mov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4646M1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public static c<BLiveEnvelope> m4640L4(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.d(str + "/fanbase-medals-panel"), new mt0[]{mt0.a("anchorId", str2)}), "getFanBaseMedalEditPanel" + str + str2).filter(new w9j() { // from class: l.mmv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.fanbaseMedalPanel != null);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public static c<Integer> m4641L5(String str, String str2) {
        return upv.w(cll.l(ytr.b("/live-video-qualities")).p().c("usage", "multi-call").c("sizeType", str).c("layout", str2).d(), "getPushBitrate" + str + str2).filter(new w9j() { // from class: l.zgv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.videoQualities));
            }
        }).map(new w9j() { // from class: l.ahv
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveVideoQuality) ((BLiveEnvelope) obj).data.videoQualities.get(0)).pushBitrate);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public static c<BLive> m4642L6(String str, String str2) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("state", "onlive");
        return upv.m(cll.l(ytr.f("/" + str)).p().c("source", str2).c("wait-stream-ready", "true").d(), "recoverLive", jSONObject.toString()).filter(new w9j() { // from class: l.smv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.umv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4683Q2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public static c<BLive> m4643L7(String str, boolean z) {
        yi10.a("stopOrSuspendLive live id = " + str + " isStop = " + z);
        String str2 = z ? "\"stopped\"" : "\"suspended\"";
        return upv.m(cll.l(ytr.f("/" + str)), z ? "stopLive" : "suspendLive", "{\"state\": " + str2 + " }").filter(new w9j() { // from class: l.pmv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.qmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4673P1((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.rmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4853j1((BLive) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ m6g m4644M(String str, BLiveEnvelope bLiveEnvelope) {
        return new m6g(bLiveEnvelope, str);
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ i0s m4646M1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new i0s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ BLiveAnchor m4647M2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveAnchor) bLiveEnvelope.data.anchors.get(0);
    }

    /* JADX INFO: renamed from: M3 */
    public static cll m4648M3(String str, String str2, String str3) {
        return cll.l(ytr.i("/" + str + "/multi-call-asset")).p().c("action", str2).c("liveId", str3).d();
    }

    /* JADX INFO: renamed from: M4 */
    public static c<BLiveEnvelope> m4649M4(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.d(str + "/tasks"), new mt0[]{mt0.a("source", str2)}), "getFanBaseTasks" + str);
    }

    /* JADX INFO: renamed from: M5 */
    public static c<LiveRoomSuggestBean> m4650M5(String str, String str2) {
        return upv.h(cll.l(ytr.b("/tiny/lives")).p().c("search", "suggested").c("source", str2).c("action", "live-quit-popup").c("currentAnchor", str).d(), "getSuggestData" + str + str2).map(new w9j() { // from class: l.hhv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4864k3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public static c<BLive> m4651M6(String str, String str2) {
        gkh0.j("refreshPlayerStreamAddress", "callback:" + str2);
        cll.a aVarP = cll.l(ytr.f("/" + str)).p();
        aVarP.c("refresh", String.valueOf(true));
        aVarP.c("errcode", String.valueOf(0));
        aVarP.c("callback", str2);
        aVarP.c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        return upv.h(aVarP.d(), "refreshPlayerStreamAddress" + str).map(new w9j() { // from class: l.unv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4600H0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public static c<BLiveEnvelope> m4652M7(String str, String str2, String str3) {
        return upv.e(LiveApiBuilder.u(ytr.d(str + "/tasks/" + str2), new mt0[]{mt0.a("source", str3)}), "submitFanBaseTasks" + str2, "");
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ BLiveSignInAchievementMedals m4653N(List list) {
        return (BLiveSignInAchievementMedals) list.get(0);
    }

    /* JADX INFO: renamed from: N3 */
    public static c<i0s> m4657N3(String str) {
        return upv.w(cll.l(ytr.b("/calls")).p().c("liveId", str).c("with", "users").c("state", "on-voice,on-video").d(), "callDeputyList").map(new w9j() { // from class: l.znv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4799d1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static c<BLiveEnvelope> m4658N4(String str) {
        return upv.h(LiveApiBuilder.u(ytr.d(str + "/fanbase-medals"), new mt0[0]), "fanbaseMedals" + str);
    }

    /* JADX INFO: renamed from: N5 */
    public static c<Boolean> m4659N5() {
        String strD0 = ypv.a.D0();
        return upv.h(cll.l(ytr.b("/users/" + strD0 + "/verifications/" + strD0)), "liveVerification").map(new w9j() { // from class: l.bhv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new w9j() { // from class: l.chv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4934s1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public static c<BLive> m4660N6(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "refresh-stream-address";
        }
        return upv.m(LiveApiBuilder.u(ytr.f("/" + str), new mt0[]{mt0.a("type", str2), mt0.a("errorcode", String.valueOf(i))}), "refreshStreamAddress" + str, "").map(new w9j() { // from class: l.xmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4889n1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public static c<roj0> m4661N7(String str, String str2, String str3, String str4, String str5) {
        cll cllVarU = LiveApiBuilder.u(ytr.d(str + "/fanbase-medals"), new mt0[]{mt0.a("anchorId", str2)});
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("color", str3);
            jSONObject.put("icon", str4);
            jSONObject.put("text", str5);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.e(cllVarU, "submitMedalEditInfo" + str + str2, jSONObject.toString()).map(new w9j() { // from class: l.gpv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ BLive m4662O(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ BLiveSignInDetail m4664O1(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public static c<BLiveCallInvite> m4666O3(String str, String str2) {
        String strB = ytr.b("/call-invites");
        BLiveCallInvite bLiveCallInvite = new BLiveCallInvite();
        bLiveCallInvite.liveId = str;
        bLiveCallInvite.to = str2;
        return upv.p(cll.l(strB), "callInvite", bLiveCallInvite.toJson()).filter(new w9j() { // from class: l.slv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.callInvites));
            }
        }).map(new w9j() { // from class: l.tlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4701S2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static c<Integer> m4667O4(String str) {
        return upv.h(LiveApiBuilder.u(ytr.d(str + "/redPacketEvents/counter"), new mt0[0]), "getFanbaseReddots").map(new w9j() { // from class: l.wgv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4854j2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public static c<BLiveEnvelope> m4668O5(String str, String str2, String str3) {
        return upv.h(LiveApiBuilder.u(ytr.b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3), new mt0[0]), "getRedPacketInfo" + str + str2 + str3).filter(new w9j() { // from class: l.hjv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.grabRedPacketInfo != null);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public static c<BLive> m4669O6(String str, SwitchType switchType) {
        String str2;
        int i = C0198a.f3729b[switchType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "call-stop-refresh-stream-address";
        } else {
            str2 = "call-start-refresh-stream-address";
        }
        return upv.m(cll.l(ytr.b("/lives/" + str)).p().c("type", str2).d(), "refreshStreamUrl" + str, "").filter(new w9j() { // from class: l.zkv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.llv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4890n2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public static c<BLiveAnchor> m4670O7(boolean z) {
        return upv.m(cll.l(ytr.b("/anchors/" + ypv.a.D0() + "/live-settings")).p().c("fields", "callSwitch").d(), "switchCall", "{\n\"callSwitch\": {\n\"on\": " + z + "\n}\n}").map(new w9j() { // from class: l.thv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4647M2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public static /* synthetic */ BLive m4673P1(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ roj0 m4674P2(Throwable th) {
        gkh0.j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return roj0.a;
    }

    /* JADX INFO: renamed from: P3 */
    public static c<BLiveVoiceLivePush> m4675P3(String str, String str2, String str3) {
        String strB = ytr.b("/users/" + str + "/voice-live-push");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("type", "settled");
        jSONObject.put("voiceLiveId", str3);
        if (!TextUtils.isEmpty(str2)) {
            com.alibaba.fastjson.JSONArray jSONArray = new com.alibaba.fastjson.JSONArray();
            jSONArray.add(str2);
            jSONObject.put("userIds", jSONArray);
        }
        return upv.p(cll.l(strB), "voice-callInvite", jSONObject.toString()).map(new w9j() { // from class: l.whv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public static c<FanbaseGroupsBean> m4676P4(String str) {
        return upv.v(LiveApiBuilder.u(ytr.a(str + "/fanbase-groups"), new mt0[0]), "getFansGroupList", g7t.b(FanbaseGroupsBean.class));
    }

    /* JADX INFO: renamed from: P5 */
    public static c<List<BLiveVoiceSettle>> m4677P5(String str) {
        return upv.w(cll.l(ytr.b("/live/voice-rooms/" + str + "/settles")).p().c("states", "created").d(), "getRequestSettleMembers" + str).map(new w9j() { // from class: l.rjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: P6 */
    public static c<BLive> m4678P6(String str, String str2) {
        return upv.m(cll.l(ytr.b("/lives/" + str)).p().c("type", str2).d(), "refreshStreamUrl" + str, "").filter(new w9j() { // from class: l.bov
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.cov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4662O((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public static c<Boolean> m4679P7(String str, String str2, int i) {
        return upv.m(cll.l(ytr.i("/" + str + "/multi-call-asset")).p().c("action", i == 6 ? "switch-6-max-call-num" : "switch-9-max-call-num").c("liveId", str2).d(), "switchDeputyCount_" + i, "").doOnNext(new e30() { // from class: l.eov
            public final void call(Object obj) {
                r610.G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).map(new w9j() { // from class: l.fov
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveEnvelope) obj));
            }
        }).onErrorReturn(new w9j() { // from class: l.gov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4762Z0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ BLiveMultiCall m4680Q(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ BLivePkSeek m4682Q1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return (BLivePkSeek) bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ BLive m4683Q2(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.l(fld0.f)).C(bLiveEnvelope.data.intlConfig.switchStar);
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public static c<wxp> m4684Q3(String str) {
        return upv.w(cll.l(ytr.b("/call-invites")).p().c("with", "users").c("liveId", str).d(), "callInviteList").map(new w9j() { // from class: l.bpv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4888n0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public static c<BLiveFirstRechargeDetail> m4685Q4(String str, String str2) {
        return upv.h(cll.l(ytr.b("/campaigns/first_recharge/detail")).p().c("roomId", str).c("anchorId", str2).d(), "getFirstRechargeBoardDetails").map(new w9j() { // from class: l.ygv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: Q5 */
    public static c<BLiveEnvelope> m4686Q5(String str) {
        return upv.p(cll.l(ytr.b("/tricks/sign-in/receive-reward")), "getReward", str);
    }

    /* JADX INFO: renamed from: Q6 */
    public static void m4687Q6(String str) {
        upv.m(cll.l(ytr.b("/multi-call-invites/" + str)).p().c("action", "reject").d(), "rejectInvite", "");
    }

    /* JADX INFO: renamed from: Q7 */
    public static c<BLiveMultiCall> m4688Q7(String str) {
        return m4597G6(str, "switchToLeadRole");
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ BLiveMultiCall m4689R(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: R2 */
    public static /* synthetic */ BLiveMultiCall m4692R2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: R3 */
    public static c<BLiveCallSummary> m4693R3(String str) {
        return upv.w(cll.l(ytr.b("/calls/" + str + "/summaries")), "callSummary").map(new w9j() { // from class: l.pjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4970w1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public static c<List<BLiveMultiCallInvite>> m4694R4() {
        return m4559C4(s410.E);
    }

    /* JADX INFO: renamed from: R5 */
    public static c<BLiveRoom> m4695R5(String str) {
        return upv.w(cll.l(ytr.b("/rooms/" + str)), "getRoom" + str).map(new w9j() { // from class: l.wnv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4851j((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R6 */
    public static c<BLivePkInvite> m4696R6(String str, boolean z) {
        return upv.m(cll.l(ytr.b("/pk-invites/" + str)).p().c("auto-ignore", String.valueOf(z)).d(), "rejectPkInvite" + str, "{\n  \"state\": \"rejected\"\n}").map(new w9j() { // from class: l.yjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4926r2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public static c<BLiveMultiCall> m4697R7(String str) {
        return m4630K3(str, "switchToVideo");
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BFansBaseRecall m4698S(BLiveEnvelope bLiveEnvelope) {
        for (BFansRecallUser bFansRecallUser : bLiveEnvelope.data.fanbaseRecall.users) {
            bFansRecallUser.setGradleUrl(((ggv) ypv.l(fld0.c)).x(bFansRecallUser.grade).wealthIconUrl);
        }
        return bLiveEnvelope.data.fanbaseRecall;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ List m4700S1(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.liveStickerTemplates;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ BLiveCallInvite m4701S2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCallInvite) bLiveEnvelope.data.callInvites.get(0);
    }

    /* JADX INFO: renamed from: S3 */
    public static c<BLiveMultiCall> m4702S3(String str) {
        return m4630K3(str, "cancel");
    }

    /* JADX INFO: renamed from: S4 */
    public static c<BLiveGiftStarBoard> m4703S4() {
        return ((ggv) ypv.l(fld0.c)).h.asObservable().onBackpressureLatest().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: S5 */
    public static c<List<BLiveStickerMetaDataItem>> m4704S5(String str) {
        return upv.h(cll.l(ytr.b("/rooms/" + str + "/live-sticker-templates")), "liveRoomAvailableStickers" + str).map(new w9j() { // from class: l.tmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4700S1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public static c<BLiveMultiCall> m4705S6(String str) {
        return m4630K3(str, "rejectSwitchToVideo");
    }

    /* JADX INFO: renamed from: S7 */
    public static c<List<BLiveCall>> m4706S7(String str, boolean z) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", z ? "anchor-switch-to-voice" : "user-switch-to-voice").d(), "switchToVoiceCall", "").map(new w9j() { // from class: l.zjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ BLiveSignInAchievementMedals m4708T0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m4709T1(String str, BLiveData bLiveData) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty) {
            j760 j760Var = (j760) ((ggv) ypv.l(fld0.c)).e.e();
            if (NullChecker.a(j760Var)) {
                bLiveData.users.addAll(0, ((BLiveData) j760Var.b).users);
            }
        }
        ((ggv) ypv.l(fld0.c)).e.onNext(vwb.Y(Boolean.valueOf(zIsEmpty), bLiveData));
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ k450 m4710T2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new k450(bLiveData.officialShowCurrentAnchorInfo, bLiveData.officialShowList);
    }

    /* JADX INFO: renamed from: T3 */
    public static c<List<BLiveCall>> m4711T3(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-voice-canceled").d(), "cancelCallApply", "").map(new w9j() { // from class: l.div
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public static c<List<BLiveStickerTemplatesGiftItem>> m4712T4() {
        return upv.h(cll.l(ytr.b("/live-sticker-templates-gifts")), "getSchemaStickerList").map(new w9j() { // from class: l.cmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4988y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public static c<BLiveRoom> m4713T5(boolean z, String str) {
        StringBuilder sb = new StringBuilder("/users/");
        if (z) {
            str = "me";
        }
        sb.append(str);
        sb.append("/rooms");
        cll.a aVarP = cll.l(ytr.b(sb.toString())).p();
        if (z) {
            aVarP.c("with", "live-stickers");
        }
        return upv.h(aVarP.d(), "getRoomInfo").map(new w9j() { // from class: l.tov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4617J((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T6 */
    public static c<List<BLiveCall>> m4714T6(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-switch-to-video-rejected").d(), "rejectVideoCall", "").map(new w9j() { // from class: l.xjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public static c<BLiveEnvelope> m4715T7(String str) {
        return upv.m(m4648M3(ypv.a.D0(), "turn-off-turn-on-guide", str), "turnOffMultiCallGuide", "");
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ BLiveRtcToken m4717U0(BLiveEnvelope bLiveEnvelope) {
        return (BLiveRtcToken) bLiveEnvelope.data.rtcTokens.get(0);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ BLiveSignInDetail m4718U1(List list) {
        return (BLiveSignInDetail) list.get(0);
    }

    /* JADX INFO: renamed from: U3 */
    public static c<List<BLiveCall>> m4720U3(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "anchor-switch-to-video-canceled").d(), "cancelInviteVideoCall", "").map(new w9j() { // from class: l.qjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: U4 */
    public static c<BLiveData> m4721U4(String str, String str2) {
        return upv.h(cll.l(ytr.i("/" + str + "/guard-user-leaderboards")).p().c("roomId", str2).d(), "getGuardAnchorBoards").map(new w9j() { // from class: l.ekv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4584F2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public static c<BLivePkSuggestAnchors> m4722U5(String str) {
        return upv.h(LiveApiBuilder.u(ytr.b("/pk-suggested-anchors"), new mt0[]{mt0.a("search", "query"), mt0.a("query", str), mt0.a("limit", "50")}), "getSearchResult" + str).filter(new w9j() { // from class: l.plv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new w9j() { // from class: l.qlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4792c3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public static c<BLiveEnvelope> m4723U6(String str, String str2) {
        return upv.j(cll.l(ytr.b("/rooms/" + str + "/blacklist/" + str2)).p().d(), "cancelDeFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: U7 */
    public static c<BLiveMultiCall> m4724U7(String str) {
        return m4630K3(str, "unmute");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ BLiveStormDanmaku m4726V0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ BLivePk m4728V2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return (BLivePk) bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: V3 */
    public static c<BLiveMultiCall> m4729V3(String str) {
        return m4597G6(str, "cancelLeadRole");
    }

    /* JADX INFO: renamed from: V4 */
    public static c<BLiveData> m4730V4(String str) {
        return upv.h(cll.r(ytr.i("/" + str + "/guard-anchor-leaderboards")), "getGuardLeaderBoards").map(new w9j() { // from class: l.vkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public static c<List<BLiveVoiceSettle>> m4731V5(String str) {
        return upv.w(cll.l(ytr.b("/live/voice-rooms/" + str + "/settles")).p().c("states", "settled").d(), "getSettledMembers" + str).map(new w9j() { // from class: l.siv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public static c<BLiveEnvelope> m4732V6(String str) {
        return upv.e(LiveApiBuilder.u(ytr.d(str + "/redPacketEvents/counter"), new mt0[0]), "getFanbaseReddots", "");
    }

    /* JADX INFO: renamed from: V7 */
    public static c<List<BLiveStickerMetaDataItem>> m4733V7(String... strArr) {
        cll.a aVarP = cll.l(ytr.b("/live-sticker-templates")).p();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (i != strArr.length - 1) {
                sb.append(str);
                sb.append(",");
            } else {
                sb.append(str);
            }
        }
        aVarP.c("ids", sb.toString());
        return upv.h(aVarP.d(), "updateLiveStickerMetadata").map(new w9j() { // from class: l.nmv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplates;
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ BLiveDownChestRewardInfo m4735W0(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.chestRewardInfo;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (BLiveDownChestRewardInfo) bLiveEnvelope.data.chestRewardInfo.get(0);
    }

    /* JADX INFO: renamed from: W3 */
    public static c<BLivePkInvite> m4738W3(String str) {
        return upv.m(cll.l(ytr.b("/pk-invites/" + str)), "cancelPkInvite" + str, "{\n  \"state\": \"canceled\"\n}").map(new w9j() { // from class: l.xhv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4610I1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public static c<BLiveData> m4739W4(String str, String str2) {
        cll.a aVarC = cll.r(ytr.i("/" + str + "/user-guard-infos")).p().c("roomId", str2);
        aVarC.c("with", "users");
        return upv.h(aVarC.d(), "getGuardInfo").map(new w9j() { // from class: l.xkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public static c<BLiveSignInDetail> m4740W5() {
        return upv.w(cll.l(ytr.b("/tricks/sign-in/detail")), "SignInDetail").map(new w9j() { // from class: l.yiv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInDetails;
            }
        }).filter(new w9j() { // from class: l.ziv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).map(new w9j() { // from class: l.ajv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4718U1((List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.bjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4664O1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public static c<BLiveEnvelope> m4741W6(String str, String str2) {
        return upv.j(cll.l(ytr.b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).p().d(), "removeSettle", "");
    }

    /* JADX INFO: renamed from: W7 */
    public static c<BLiveCall> m4742W7(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-switch-to-video-canceled").d(), "deputyGoBack", "").filter(new w9j() { // from class: l.gmv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.imv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4817f1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static c<BLivePkSeek> m4747X3(String str) {
        return upv.m(cll.l(ytr.b("/pk-seeks/" + str)), "cancelPkSeek" + str, "{\n  \"state\": \"canceled\"\n}").map(new w9j() { // from class: l.civ
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4879m0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public static c<r8d0> m4748X4(BLiveAbsData bLiveAbsData) {
        return upv.h(cll.l(ytr.f("?" + bLiveAbsData.requestExtra)), "request_suggested_live" + bLiveAbsData.id).flatMap(new w9j() { // from class: l.miv
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return mkd0.r(c.just(((BLive) bLiveEnvelope.data.lives.get(0)).source), LivingNormalApiProvider.m4830g5((BLiveAbsData) bLiveEnvelope.data.lives.get(0)), new x9j() { // from class: l.ykv
                    public final Object call(Object obj2, Object obj3) {
                        return vwb.Y((String) obj2, (r8d0) obj3);
                    }
                });
            }
        }).map(new w9j() { // from class: l.niv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4764Z2((j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public static c<BLiveStormDanmaku> m4749X5(String str, String str2, String str3) {
        return upv.w(cll.l(ytr.b("/gift/storm-comment/resources")).p().c("anchorId", str).c("fakeId", w220.m24291b() ? w220.m24290a() : "").c("liveId", str2).c("roomId", str3).c("scenario", "live").d(), "getStormDanmaku").map(new w9j() { // from class: l.uhv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.stormComment;
            }
        }).onErrorReturn(new w9j() { // from class: l.vhv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4726V0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X6 */
    public static c<BLiveMultiCall> m4750X6(String str) {
        return upv.m(cll.l(ytr.b("/multi-calls/" + str)).p().c("state", "success").d(), "reportCallSuccess", "").filter(new w9j() { // from class: l.nlv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.olv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4860k((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X7 */
    public static c<BLivePush> m4751X7() {
        return upv.p(cll.l(ytr.b("/user-live-push")).p().c("type", "multi-call").d(), "userLivePush", "").map(new w9j() { // from class: l.ckv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ far m4754Y1(BLiveEnvelope bLiveEnvelope) {
        return new far(bLiveEnvelope, true);
    }

    /* JADX INFO: renamed from: Y3 */
    public static c<BLive> m4756Y3(String str, boolean z) {
        return upv.m(cll.l(ytr.f("/" + str + (z ? "?type=pk-start-refresh-stream-address" : "?type=pk-stop-refresh-stream-address"))), "changePkStreamAddress" + str, "").map(new w9j() { // from class: l.biv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4773a2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public static c<BLiveEnvelope> m4757Y4(String str, String str2, String str3, String str4, String str5) {
        return m4766Z4(str, str2, str3, null, str4, str5);
    }

    /* JADX INFO: renamed from: Y5 */
    public static c<PkFriendInfo> m4758Y5() {
        return upv.w(cll.l(ytr.b("/anchors")).p().c("search", "pk-suggested-unmatched").c("with", "lives,users").d(), "getSuggestPkAnchor").map(new w9j() { // from class: l.nkv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4772a1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public static c<BLiveCall> m4759Y6(String str, boolean z, ConnectType connectType) {
        String str2;
        int i = C0198a.f3728a[connectType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "voice-";
        } else {
            str2 = "video-";
        }
        String str3 = z ? "success" : "fail";
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("state", str2 + str3).d(), "reportConnect", "").filter(new w9j() { // from class: l.klv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.mlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4950u((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public static c<BLiveCall> m4760Y7(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-switch-to-video-ready").d(), "deputyGoBack", "").filter(new w9j() { // from class: l.jmv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.kmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4908p2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ roj0 m4761Z(List list) {
        ((ggv) ypv.l(fld0.c)).L(list);
        return roj0.a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Boolean m4762Z0(Throwable th) {
        r610.j(th);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m4763Z1(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftStarBoard bLiveGiftStarBoardNew_ = bLiveEnvelope.data.giftStar;
        if (bLiveGiftStarBoardNew_ == null) {
            bLiveGiftStarBoardNew_ = BLiveGiftStarBoard.new_();
        }
        ((ggv) ypv.l(fld0.c)).h.onNext(bLiveGiftStarBoardNew_);
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ r8d0 m4764Z2(j760 j760Var) {
        r8d0 r8d0Var = (r8d0) j760Var.b;
        ((wq2) r8d0Var).c.source = (String) j760Var.a;
        return r8d0Var;
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m4765Z3(List<?> list) {
        return (list == null || list.size() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: Z4 */
    public static c<BLiveEnvelope> m4766Z4(String str, String str2, String str3, @Nullable String str4, String str5, String str6) {
        String str7;
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/rooms/" + str + "/members/" + str2));
        aVarM.c("source", str3);
        if (!TextUtils.isEmpty(str4)) {
            aVarM.c("recommendInfo", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVarM.c("exposureType", str5);
        }
        if (w220.m24291b()) {
            str7 = "{\"fakeId\": \"" + w220.m24290a() + "\"}";
        } else {
            str7 = "";
        }
        aVarM.c("sessionId", str6);
        return upv.t(aVarM.d(), "getInRoom" + str, str7);
    }

    /* JADX INFO: renamed from: Z5 */
    public static c<BLive> m4767Z5(String str, String str2) {
        return upv.h(cll.l(ytr.f("")).p().c("search", "swipe-in-room").c("source", str).c("recommend-category", str2).c("limit", "1").d(), "getSuggestedLiveForFloatWindow").filter(new w9j() { // from class: l.dmv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.emv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives;
            }
        }).map(new w9j() { // from class: l.fmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4959v((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public static c<BLiveEnvelope> m4768Z6(BLiveChatReport bLiveChatReport, String str) {
        return upv.e(cll.l(ytr.i("/" + str + "/livechat-reports")), "userReport", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: Z7 */
    public static String m4769Z7(String str) {
        return ytr.b("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ PkFriendInfo m4772a1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ BLive m4773a2(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: a4 */
    public static c<BLiveFirstRechargeStatus> m4775a4(String str, String str2) {
        String strM24290a = w220.m24290a();
        cll.a aVarC = cll.l(ytr.b("/campaigns/first_recharge/status")).p().c("roomId", str2).c("anchorId", str);
        if (TextUtils.isEmpty(strM24290a)) {
            strM24290a = "";
        }
        return upv.h(aVarC.c("fakeId", strM24290a).d(), "checkHasFirstRecharge").map(new w9j() { // from class: l.rov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeStatus;
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public static c<roj0> m4776a5() {
        fld0 fld0Var = fld0.c;
        return (((ggv) ypv.l(fld0Var)).k() == null || ((ggv) ypv.l(fld0Var)).k().size() <= 0) ? upv.h(cll.l(ytr.b("/family/family-medals")).p().d(), "getIntlFamilyMedals").map(new w9j() { // from class: l.qkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyMedals;
            }
        }).map(new w9j() { // from class: l.rkv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4861k0((List) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: a6 */
    public static c<BLiveTopChatMessage> m4777a6(String str) {
        return upv.h(cll.l(ytr.b("/live/topChat/rooms/" + str)), "getTopChatMessageDetail").map(new w9j() { // from class: l.mnv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveTopChatMessage;
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public static c<BLiveEnvelope> m4778a7(BLiveChatReport bLiveChatReport) {
        return upv.e(cll.l(ytr.b("/anchor-reports")), "userReportForAnchor", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ List m4783b3(final BLiveEnvelope bLiveEnvelope) {
        vwb.z(bLiveEnvelope.data.multiCallInvites, new e30() { // from class: l.sov
            public final void call(Object obj) {
                BLiveMultiCallInvite bLiveMultiCallInvite = (BLiveMultiCallInvite) obj;
                bLiveMultiCallInvite.followship = (Followship) vwb.r(bLiveEnvelope.data.followships, new w9j() { // from class: l.ihv
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCallInvite.toUserId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCallInvites;
    }

    /* JADX INFO: renamed from: b4 */
    public static c<roj0> m4784b4(boolean z) {
        String string = cll.r(ytr.b(z ? "/anchor-daily-task-counters" : "/user-daily-task-counters")).p().c("action", "clear-complete-task-red-dot").d().toString();
        return upv.b(cll.l(string), string, "").map(new w9j() { // from class: l.cjv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static c<roj0> m4785b5() {
        fld0 fld0Var = fld0.c;
        return (((ggv) ypv.l(fld0Var)).o() == null || ((ggv) ypv.l(fld0Var)).o().size() <= 0) ? upv.h(cll.l(ytr.b("/voiceFanbase/medals")).p().d(), "getIntlVoiceFanBaseMedals").map(new w9j() { // from class: l.vjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseMedals;
            }
        }).map(new w9j() { // from class: l.wjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4761Z((List) obj);
            }
        }) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: b6 */
    public static c<BLiveSuperChatDetail> m4786b6(boolean z, String str) {
        return upv.h(cll.l(ytr.b("/live/superChat/" + (z ? "topChat" : "shoutingChat") + "/rooms/" + str)), "getTopChatPageDetail").map(new w9j() { // from class: l.ojv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.superChatDetail;
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public static c<roj0> m4787b7(ho2 ho2Var, MotionType motionType, long j) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", UUID.randomUUID().toString());
            jSONObject.put("sessionId", ho2Var.m17247x());
            jSONObject.put("type", "bufferStop");
            jSONObject.put("roomId", ho2Var.m17239o());
            jSONObject.put("anchorId", ho2Var.m14576j0());
            jSONObject.put("liveId", ho2Var.m17235k());
            jSONObject.put("userId", ypv.a.D0());
            BLiveAbsData bLiveAbsDataM17234j = ho2Var.m17234j();
            if (bLiveAbsDataM17234j != null) {
                String str = bLiveAbsDataM17234j.liveMode;
                if (TextUtils.isEmpty(str)) {
                    str = "default";
                }
                jSONObject.put("liveMode", str);
            }
            jSONObject.put("isPk", motionType == MotionType.pk);
            jSONObject.put("isCall", motionType == MotionType.multi_connect);
            jSONObject.put("isMultiCall", motionType == MotionType.multi_call);
            jSONObject.put("timestamp", mqi0.o());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bufferingTimeDuration", j);
            jSONObject.put("data", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        return upv.e(cll.l(ytr.b("/live-stream-event")), "notifyPullStreamBufferingEnd" + mqi0.o(), string).map(new w9j() { // from class: l.dkv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ BLiveCall m4788c(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCall) bLiveEnvelope.data.calls.get(0);
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ BLivePkSuggestAnchors m4792c3(BLiveEnvelope bLiveEnvelope) {
        return (BLivePkSuggestAnchors) bLiveEnvelope.data.pkSuggestedAnchors.get(0);
    }

    /* JADX INFO: renamed from: c4 */
    public static c<Boolean> m4793c4(String str) {
        return upv.m(m4648M3(ypv.a.D0(), "turn-off-multi-call", str), "closeMultiCall", "").map(new w9j() { // from class: l.env
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4837h3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: c5 */
    public static c<u5t> m4794c5(h4t<?, ?> h4tVar) {
        return h4tVar.m25547E2().m14596q1().R().filter(new w9j() { // from class: l.vmv
            public final Object call(Object obj) {
                u5t u5tVar = (u5t) obj;
                return Boolean.valueOf(s410.P.equals(u5tVar.c) && r610.l(u5tVar.a));
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public static c<BLiveMultiCall> m4795c6(String str) {
        return m4630K3(str, "go-away");
    }

    /* JADX INFO: renamed from: c7 */
    public static c<BLiveEnvelope> m4796c7(String str, String str2, String str3, String str4, String str5) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("liveId", str);
        jsonObject.addProperty("roomId", str2);
        jsonObject.addProperty("anchorId", str3);
        jsonObject.addProperty("errorType", str4);
        jsonObject.addProperty("message", str5);
        return upv.p(cll.l(ytr.b("/video-stream-event")).p().d(), "reportStreamEvent" + str, jsonObject.toString());
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ i0s m4799d1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new i0s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ BLive m4801d3(BLiveEnvelope bLiveEnvelope) {
        ((bgv) ypv.l(fld0.f)).C(bLiveEnvelope.data.intlConfig.switchStar);
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: d4 */
    public static c<BLiveMultiCall> m4802d4(String str) {
        return m4630K3(str, "come-back");
    }

    /* JADX INFO: renamed from: d5 */
    public static void m4803d5(String str, final String str2) {
        cll.a aVarC = cll.r(ytr.b("/anchor/" + str + "/knights")).p().c("source", "entrance").c("with", "users");
        if (!TextUtils.isEmpty(str2)) {
            aVarC.c("util", str2);
        }
        upv.h(aVarC.d(), "getKnightsEntry").map(new w9j() { // from class: l.vov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4880m1((BLiveEnvelope) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.xov
            public final void call(Object obj) {
                LivingNormalApiProvider.m4709T1(str2, (BLiveData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public static c<BLiveEnvelope> m4804d6(String str, String str2, String str3, String str4) {
        return upv.e(LiveApiBuilder.u(ytr.b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3 + "?token=" + str4), new mt0[0]), "grabRedPacket" + str3 + str + str2, "").filter(new w9j() { // from class: l.eiv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.redPacketGrabResult != null);
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public static c<BLiveEnvelope> m4805d7(String str, String str2, String str3) {
        cll cllVarD = LiveApiBuilder.m(ytr.b("/streaming-heartbeat")).d();
        long jO = mqi0.o();
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        jSONObject.put("liveId", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        jSONObject.put("anchorId", str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        jSONObject.put("roomId", str3);
        jSONObject.put("uploadTime", Long.valueOf(jO));
        return upv.e(cllVarD, "reportStreamingHeartBeat" + jO, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ BLivePkInvite m4807e0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        final BLivePkInvite bLivePkInvite = (BLivePkInvite) bLiveEnvelope.data.pkInvites.get(0);
        bLivePkInvite.userInfo = (User) vwb.r(bLiveEnvelope.data.users, new w9j() { // from class: l.ulv
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((DbObject) ((User) obj)).id));
            }
        });
        bLivePkInvite.live = (BLive) vwb.r(bLiveEnvelope.data.lives, new w9j() { // from class: l.vlv
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((BLiveAbsData) ((BLive) obj)).anchor.id));
            }
        });
        return bLivePkInvite;
    }

    /* JADX INFO: renamed from: e4 */
    public static c<BaseLiveBean> m4811e4(String str) {
        return upv.o(LiveApiBuilder.u(ytr.a(str + "/fanbase-groups"), new mt0[0]), "createFansGroup", "", g7t.b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: e5 */
    public static c<BLiveEnvelope> m4812e5(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.i("/me/leaderboards/" + str), new mt0[]{mt0.a("start", "0"), mt0.a("end", "99"), mt0.a("scopeId", str2), mt0.a("withFollowship", "true"), mt0.a("withLiveState", "true"), mt0.a("withFanBaseMedal", "true"), mt0.a("withHierarchy", "true")}), "fanleaderboard" + str);
    }

    /* JADX INFO: renamed from: e6 */
    public static c<BLiveMultiCall> m4813e6(String str, String str2) {
        return upv.m(cll.l(ytr.b("/multi-calls/" + str)).p().c("action", "hang-up").c("hangUpReason", str2).d(), "hangUpCall", "").filter(new w9j() { // from class: l.pnv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new w9j() { // from class: l.aov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4692R2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e7 */
    public static c<j760<BLivePk, List<User>>> m4814e7(String str) {
        return upv.w(cll.l(ytr.b("/pks/" + str)).p().c("with", "users").d(), "requesetPk" + str).map(new w9j() { // from class: l.vgv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4611I2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m4816f0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ BLiveCall m4817f1(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCall) bLiveEnvelope.data.calls.get(0);
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ BLivePk m4819f3(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return (BLivePk) bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: f4 */
    public static c<BLive> m4820f4(String str, boolean z, String str2, String str3) {
        cll.a aVarC = cll.l(ytr.b("/rooms/" + str + "/lives")).p().c("push", String.valueOf(z)).c("osVersion", Build.VERSION.RELEASE).c("source", str3);
        if ("obs".equals(str2)) {
            aVarC.c("mode", "start");
        } else {
            aVarC.c("mode", "prepare");
        }
        aVarC.c("liveMode", str2);
        return upv.e(aVarC.d(), "createLive", "").filter(new w9j() { // from class: l.ijv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new w9j() { // from class: l.jjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4801d3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f5 */
    public static c<BLiveEnvelope> m4821f5(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3) {
        String strConcat = (z ? "anchor" : "audience").concat(z2 ? "-caller" : "");
        if (z3 && (z || z2)) {
            strConcat = "multiUser";
        }
        cll.a aVarC = cll.l(ytr.b("/live-bottomMenu")).p().c("officialShowAnchorId", str3).c("roomId", str).c("userType", strConcat).c("fakeId", w220.m24291b() ? w220.m24290a() : "").c("liveMode", str2);
        if (z3) {
            if (z4) {
                if (z) {
                    aVarC.c("multiCallRole", "owner");
                } else {
                    aVarC.c("multiCallRole", "audience");
                }
            } else if (z) {
                aVarC.c("multiCallRole", "anchor");
            } else {
                aVarC.c("multiCallRole", "audience");
            }
        }
        return upv.w(aVarC.d(), "getLiveBottomButtonsAndBubblesConfig_" + aVarC.d().toString() + str3);
    }

    /* JADX INFO: renamed from: f6 */
    public static c<List<BLiveCall>> m4822f6(String str, boolean z, String str2) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", z ? "anchor-hang-up" : "user-hang-up").c("hangupReason", str2).d(), "hangUpVoiceCall", "").filter(new w9j() { // from class: l.liv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new w9j() { // from class: l.wiv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public static void m4823f7() {
        upv.h(cll.l(ytr.b("/live-bubble-config")), "getBubbleConfig").subscribe(ffw.e(new e30() { // from class: l.cnv
            public final void call(Object obj) {
                LivingNormalApiProvider.m4546B0((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dnv
            public final void call(Object obj) {
                LivingNormalApiProvider.m4816f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m4824g(boolean z, BLiveEnvelope bLiveEnvelope) {
        return z ? bLiveEnvelope.data.anchorDailyTasks : bLiveEnvelope.data.userDailyTasks;
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ roj0 m4826g1(Throwable th) {
        gkh0.j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return roj0.a;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ BLiveRoom m4827g2(List list) {
        return (BLiveRoom) list.get(0);
    }

    /* JADX INFO: renamed from: g4 */
    public static c<BLivePkInvite> m4829g4(String str, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        String strB = ytr.b("/pk-invites");
        BLivePkInvite bLivePkInvite = new BLivePkInvite();
        bLivePkInvite.isOnceMore = z;
        bLivePkInvite.to = str;
        bLivePkInvite.source = bLivePkInviteSource;
        return upv.p(cll.l(strB), "inviteFriend", bLivePkInvite.toJson()).map(new w9j() { // from class: l.xgv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4835h1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public static c<r8d0> m4830g5(BLiveAbsData bLiveAbsData) {
        return m4848i5(bLiveAbsData.id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: g6 */
    public static c<BLiveMultiCallSwitchToLeadRoleInvite> m4831g6(String str, String str2, String str3, String str4) {
        String strB = ytr.b("/multi-call-switch-to-lead-role-invite");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerUserId", str);
        jsonObject.addProperty("ownerCallId", str2);
        jsonObject.addProperty("toUserId", str3);
        jsonObject.addProperty("toCallId", str4);
        return upv.p(cll.l(strB), "inviteUserToBeLeadRole", jsonObject.toString()).map(new w9j() { // from class: l.djv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: g7 */
    public static c<BLiveEnvelope> m4832g7(String str) {
        return upv.h(cll.l(ytr.b("/live/fake-user/" + str + "/profile")), "live/fake-user/" + str + "/profile");
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ BLivePkInvite m4835h1(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return (BLivePkInvite) bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ BLiveRtcToken m4836h2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveRtcToken) bLiveEnvelope.data.rtcTokens.get(0);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Boolean m4837h3(BLiveEnvelope bLiveEnvelope) {
        BLiveMultiCallAsset bLiveMultiCallAsset = bLiveEnvelope.data.multiCallAsset;
        return Boolean.valueOf(bLiveMultiCallAsset != null && bLiveMultiCallAsset.multiCallSwitch);
    }

    /* JADX INFO: renamed from: h4 */
    public static c<BLivePkSeek> m4838h4(int i) {
        String str;
        if (i == 3) {
            str = "{\n  \"category\": \"bounty\"\n}";
        } else {
            str = i == 4 ? "{\n  \"category\": \"rank\"\n}" : "";
        }
        return upv.p(cll.l(ytr.b("/pk-seeks")), "createPkSeek", str).map(new w9j() { // from class: l.ejv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4682Q1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static c<r8d0> m4839h5(String str) {
        return m4866k5(str);
    }

    /* JADX INFO: renamed from: h6 */
    public static c<BLiveEnvelope> m4840h6(String str, String str2) {
        return upv.p(cll.l(ytr.b("/live/voice-rooms/" + str + "/users/" + str2 + "/invite-settle")).p().d(), "inviteSettle", "");
    }

    /* JADX INFO: renamed from: h7 */
    public static c<BLiveEnvelope> m4841h7(String str, String str2) {
        cll.a aVarM = LiveApiBuilder.m(ytr.f("/" + str + "/leaderboard"));
        aVarM.c("roomId", str2);
        aVarM.c("source", "live");
        if (w220.m24291b()) {
            aVarM.c("fakeId", w220.m24290a());
        }
        return upv.w(aVarM.d(), "requestLeaderBoards").doOnNext(new e30() { // from class: l.wmv
            public final void call(Object obj) {
                ((idv) ypv.l(fld0.b)).l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ i5u m4845i2(BLiveSuggestLive bLiveSuggestLive) {
        return new i5u(bLiveSuggestLive.id, BLiveState.get(bLiveSuggestLive.state));
    }

    /* JADX INFO: renamed from: i4 */
    public static c<BLiveRoom> m4847i4(BLiveRoom bLiveRoom) {
        return upv.p(cll.l(ytr.b("/rooms")), "createRoom", bLiveRoom.toJson()).map(new w9j() { // from class: l.jov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4539A2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public static c<r8d0> m4848i5(String str, final boolean z, boolean z2, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            gkh0.j("[live][trace_problem]", Log.getStackTraceString(new Throwable("liveId is Null")));
            return c.error(new Exception("liveId can't be null"));
        }
        cll.a aVarC = cll.l(ytr.f("/" + str)).p().c("refresh", String.valueOf(z2)).c("errcode", String.valueOf(str2));
        if (z) {
            aVarC.c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            aVarC.c("callback", str3);
        }
        return upv.h(aVarC.d(), "getLiveInfo" + str).filter(new w9j() { // from class: l.rnv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4935s2(z, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.snv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4621J3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public static c<BLiveMultiCall> m4849i6(String str) {
        return m4630K3(str, "inviteSwitchToVideo");
    }

    /* JADX INFO: renamed from: i7 */
    public static c<BLiveEnvelope> m4850i7(String str, int i) {
        return upv.w(cll.l(ytr.b("/rooms/" + str + "/members")).p().c("with", "users,followships").c("limit", String.valueOf(i)).d(), "requestMembers").doOnNext(new e30() { // from class: l.kkv
            public final void call(Object obj) {
                ((idv) ypv.l(fld0.b)).l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BLiveRoom m4851j(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.rooms;
        return !vwb.J(list) ? (BLiveRoom) list.get(0) : BLiveRoom.new_();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ BLiveMultiCall m4852j0(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ BLive m4853j1(BLive bLive) {
        if (bLive.isMultiCall()) {
            r610.I(bLive.multiCallInfo.role, ((BLiveAbsData) bLive).id);
        }
        return bLive;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Integer m4854j2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.fanbaseRedPacketEventCounters)) {
            return 0;
        }
        return Integer.valueOf(((BLiveSquareDetailCounters) bLiveEnvelope.data.fanbaseRedPacketEventCounters.get(0)).unreadCount);
    }

    /* JADX INFO: renamed from: j4 */
    public static c<roj0> m4856j4(String str, String str2, boolean z) {
        return upv.j(cll.l(ytr.b("/rooms/" + str + "/live-stickers/" + str2)).p().c("replace", String.valueOf(z)).d(), "deleteSticker" + str, "").map(new w9j() { // from class: l.vnv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public static c<r8d0> m4857j5(BLive bLive, String str) {
        return m4848i5(((BLiveAbsData) bLive).id, true, true, str, ((BLiveAbsData) bLive).callback);
    }

    /* JADX INFO: renamed from: j6 */
    public static c<List<BLiveCall>> m4858j6(String str) {
        return upv.m(cll.l(cll.l(ytr.b("/calls/" + str)).p().c("action", "anchor-switch-to-video-invited").toString()), "inviteVideoCall", "").map(new w9j() { // from class: l.akv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public static c<BLiveEnvelope> m4859j7(boolean z, String str, String str2) {
        return upv.w(cll.l(ytr.b("/rooms/" + str2 + "/messages")).p().c("live", str).d(), "requestMessages");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ BLiveMultiCall m4860k(BLiveEnvelope bLiveEnvelope) {
        return (BLiveMultiCall) bLiveEnvelope.data.multiCalls.get(0);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ roj0 m4861k0(List list) {
        ((ggv) ypv.l(fld0.c)).K(list);
        return roj0.a;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ BLiveDanmakuList m4863k2(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ LiveRoomSuggestBean m4864k3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new LiveRoomSuggestBean(bLiveData.suggestedLives, bLiveData.liveQuitPopup);
    }

    /* JADX INFO: renamed from: k4 */
    public static c<List<BLiveCall>> m4865k4(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-go-away").d(), "deputyGoAway", "").map(new w9j() { // from class: l.ipv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public static c<r8d0> m4866k5(String str) {
        return m4848i5(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: k6 */
    public static c<BLiveEnvelope> m4867k6(String str, String str2) {
        return upv.e(LiveApiBuilder.u(ytr.d(str + "/users/" + str2), new mt0[0]), "joinFanBases" + str + str2, "");
    }

    /* JADX INFO: renamed from: k7 */
    public static c<List<BLiveCommonViewConfig>> m4868k7() {
        return upv.h(LiveApiBuilder.u(ytr.b("/campaigns/previews"), new mt0[0]), "requestPkPreviews").map(new w9j() { // from class: l.mjv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.previews;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ t9u m4873l3(BLiveEnvelope bLiveEnvelope) {
        return new t9u(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    /* JADX INFO: renamed from: l4 */
    public static c<List<BLiveCall>> m4874l4(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-come-back").d(), "deputyGoBack", "").map(new w9j() { // from class: l.hiv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static c<t9u> m4875l5(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
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
                strReplaceAll = f3726a.matcher(strReplaceAll).replaceAll("&limit=" + i);
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
        sb.append(cll.l(ytr.b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).p().c("search", str).c("source", str2).c("with", "rooms,users").toString());
        sb.append(strReplaceAll);
        return upv.h(cll.l(sb.toString()), "getLiveListV2" + str + str2 + strReplaceAll).map(new w9j() { // from class: l.wlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4873l3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public static c<BLivePk> m4876l6(String str) {
        return upv.m(cll.l(ytr.b("/pks/" + str)).p().c("action", "join").d(), "joinPk" + str, "").map(new w9j() { // from class: l.yhv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4819f3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public static c<BLivePkSummary> m4877l7() {
        return upv.h(LiveApiBuilder.u(ytr.b("/pk-summaries"), new mt0[0]), "requestPkSummaries").map(new w9j() { // from class: l.kjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4591G0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m4878m(String str, String str2, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 41027) {
                lsi0.j(str);
                return;
            } else if (i == 41025) {
                lsi0.j(ypv.e.getString(R$string.f3594u));
                return;
            }
        }
        lsi0.j(str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ BLivePkSeek m4879m0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return (BLivePkSeek) bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ BLiveData m4880m1(BLiveEnvelope bLiveEnvelope) {
        ((ggv) ypv.l(fld0.c)).g = bLiveEnvelope.pagination;
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: m4 */
    public static c<BLiveEnvelope> m4883m4(String str) {
        return upv.e(LiveApiBuilder.u(ytr.a(str + "/fanbase-recall"), new mt0[0]), "doInvitationRequest", "");
    }

    /* JADX INFO: renamed from: m5 */
    public static c<BLiveEnvelope> m4884m5() {
        return upv.w(cll.l(ytr.b("/tricks/sign-in/prizes")), "getLivePrizeList");
    }

    /* JADX INFO: renamed from: m6 */
    public static c<roj0> m4885m6(String str, String str2, String str3) {
        return upv.a(cll.l(ytr.b("/rooms/" + str + "/members/" + str2)).p().c("fakeId", str3).d(), "kickOff", "").map(new w9j() { // from class: l.skv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public static c<BLiveEnvelope> m4886m7(String str) {
        return upv.w(cll.l(ytr.b("/live-officialshow-user/" + str)), "requestOfficialShowRoom" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ wxp m4888n0(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new wxp(bLiveData.callInvites, bLiveData.users);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ BLive m4889n1(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ BLive m4890n2(BLiveEnvelope bLiveEnvelope) {
        return (BLive) bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: n4 */
    public static c<BLiveEnvelope> m4892n4(String str, String str2, String str3) {
        cll cllVarU = LiveApiBuilder.u(ytr.a(str + "/fanbase-recall-message"), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray(str2));
            jSONObject.put("content", str3);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.e(cllVarU, "doRecallRequest", jSONObject.toString());
    }

    /* JADX INFO: renamed from: n5 */
    public static c<BLivePushLimit> m4893n5(String str) {
        return upv.h(cll.l(ytr.b("/rooms/" + str + "/push-counters")), "pushCounters" + str).map(new w9j() { // from class: l.jhv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).counters.livePushLimit;
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public static c<BLivePk> m4894n6(String str, String str2) {
        return upv.m(cll.l(ytr.b("/pks/" + str)).p().c("action", str2).d(), "joinPk" + str, "").map(new w9j() { // from class: l.zov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4728V2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public static c<BLiveRtcToken> m4895n7(String str, String str2) {
        String strB = ytr.b("/rtc-tokens");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("channel", str);
        jsonObject.addProperty("usage", "multi-call");
        jsonObject.addProperty("rtcProvider", str2);
        return upv.p(cll.l(strB), "requestSdkToken", jsonObject.toString()).filter(new w9j() { // from class: l.tiv
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m4765Z3(((BLiveEnvelope) obj).data.rtcTokens));
            }
        }).map(new w9j() { // from class: l.uiv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4717U0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ArrayList m4896o(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(vwb.Q(bLiveEnvelope.data.managers, new w9j() { // from class: l.bmv
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public static c<BFansBaseRecall> m4901o4(String str) {
        return upv.h(LiveApiBuilder.u(ytr.a(str + "/fanbase-recall"), new mt0[0]), "RequestFansRecall").map(new w9j() { // from class: l.lmv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4698S((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public static c<BLiveStickerMetaData> m4902o5() {
        return upv.h(cll.l(ytr.b("/live-sticker-templates-metadata")), "liveStickerMetaData").map(new w9j() { // from class: l.spv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplatesMetadata;
            }
        });
    }

    /* JADX INFO: renamed from: o6 */
    public static void m4903o6(String str) {
        upv.e(cll.r(ytr.b("/live-reports")).p().d(), "live-reports", str).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: o7 */
    public static c<BLiveRtcToken> m4904o7(String str, String str2, String str3) {
        return upv.p(cll.l(ytr.b("/rtc-tokens")), "requestSdkToken", "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\"}").filter(new w9j() { // from class: l.inv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new w9j() { // from class: l.jnv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4574E1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveAddStickerResult m4905p(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (BLiveAddStickerResult) bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ BLivePk m4906p0(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return (BLivePk) bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: p2 */
    public static /* synthetic */ BLiveCall m4908p2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCall) bLiveEnvelope.data.calls.get(0);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ String m4909p3(BLiveEnvelope bLiveEnvelope) {
        return vwb.J(bLiveEnvelope.data.fanbases) ? "" : ((BLiveFanBase) bLiveEnvelope.data.fanbases.get(0)).id;
    }

    /* JADX INFO: renamed from: p4 */
    public static c<List<BLiveDailyTasks>> m4910p4(final boolean z, String str, String str2, String str3, String str4) {
        String str5 = z ? "/anchor-daily-tasks" : "/user-daily-tasks";
        return upv.b(cll.r(ytr.b("/users/" + ypv.a.D0() + str5)).p().c("action", str4).c("taskId", str).c("taskDate", str2).c("delta", str3).d(), ytr.b("/users/" + ypv.a.D0() + str5), "").map(new w9j() { // from class: l.blv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4824g(z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public static c<BLiveEnvelope> m4911p5(String str) {
        return upv.h(cll.l(ytr.f("/" + str + "/summaries")), "getLiveSummaries" + str);
    }

    /* JADX INFO: renamed from: p6 */
    public static c<ArrayList<String>> m4912p6(final String str, String str2, boolean z) {
        c cVarA;
        final String string;
        final String string2;
        cll cllVarL = cll.l(ytr.b("/rooms/" + str + "/managers/" + str2));
        if (z) {
            cVarA = upv.g(cllVarL, "manageRoomManager", "");
            string = ypv.e.getString(R$string.f3266f0);
            string2 = ypv.e.getString(R$string.f3288g0);
        } else {
            cVarA = upv.a(cllVarL, "manageRoomManager", "");
            string = ypv.e.getString(R$string.f3104Xb);
            string2 = ypv.e.getString(R$string.f3125Yb);
        }
        final String string3 = ypv.k().hb() > 0 ? String.format(ypv.e.getString(R$string.f3541rc), Integer.valueOf(ypv.k().hb())) : ypv.e.getString(R$string.f2605A6);
        return cVarA.doOnError(new e30() { // from class: l.ylv
            public final void call(Object obj) {
                LivingNormalApiProvider.m4878m(string3, string, (Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.zlv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4545B(string2, str, (BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.amv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4896o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public static c<BLiveRtcToken> m4913p7(String str, String str2, String str3, String str4, String str5) {
        String str6 = "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\" , \"eventType\":\"" + str4 + "\" , \"role\":\"" + str5 + "\"}";
        return upv.r(cll.l(ytr.b("/rtc-tokens")), "requestRtcToken" + str, str6).filter(new w9j() { // from class: l.fjv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new w9j() { // from class: l.gjv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4836h2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ BLiveCall m4917q2(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCall) bLiveEnvelope.data.calls.get(0);
    }

    /* JADX INFO: renamed from: q4 */
    public static c<roj0> m4919q4(String str, String str2, String str3) {
        return upv.g(cll.l(ytr.b("/rooms/" + str + "/jailedlist/" + str2)), "forbiddenWords" + str2, BLiveFakeIdRequestBody.getFakeIdBody(str3)).map(new w9j() { // from class: l.njv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: q5 */
    public static c<User> m4920q5(String str) {
        return upv.w(cll.l(ytr.b("/live-users/" + str)).p().c("with", "followships,relationships").d(), "live-users/" + str).map(new w9j() { // from class: l.lov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4961v1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public static c<roj0> m4921q6(String str, String str2, com.alibaba.fastjson.JSONObject jSONObject) {
        return upv.b(cll.l(ytr.b("/rooms/" + str + "/live-stickers/" + str2)), "modifySticker" + str, jSONObject.toString()).map(new w9j() { // from class: l.qpv
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).onErrorReturn(new w9j() { // from class: l.rpv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public static c<k450> m4922q7(String str) {
        return upv.w(LiveApiBuilder.u(ytr.b("/lives/" + str + "/official-shows"), new mt0[0]), "requestShowInfo" + str).map(new w9j() { // from class: l.ehv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4710T2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m4923r(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdentity bLiveIdentity;
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return Boolean.valueOf((bLiveIdCardVerificationInfo != null && TEnum.equals(bLiveIdCardVerificationInfo.status, "verified")) || ((bLiveIdentity = bLiveVerificationCenter.identity) != null && "idCard".equals(bLiveIdentity.certificate.type) && TEnum.equals(bLiveVerificationCenter.identity.status, "verified")));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m4924r0(final BLiveEnvelope bLiveEnvelope) {
        vwb.z(bLiveEnvelope.data.multiCalls, new e30() { // from class: l.apv
            public final void call(Object obj) {
                BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) obj;
                bLiveMultiCall.followship = (Followship) vwb.r(bLiveEnvelope.data.followships, new w9j() { // from class: l.zhv
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCall.userId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCalls;
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ BLivePkInvite m4926r2(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return (BLivePkInvite) bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: r4 */
    public static c<BLiveSignInAchievementMedals> m4928r4() {
        return upv.w(cll.l(ytr.b("/tricks/sign-in/achievement-medals")), "getAchievementMedals").map(new w9j() { // from class: l.clv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInAchievementMedals;
            }
        }).filter(new w9j() { // from class: l.dlv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).map(new w9j() { // from class: l.elv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4653N((List) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.flv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4708T0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r5 */
    public static c<BLiveMultiPkLeaderboard> m4929r5(String str, String str2, String str3) {
        return upv.w(cll.l(ytr.b("/multi-pks/leaderboard?pkId=" + str + "&anchorId=" + str2 + "&fakeId=" + str3)).p().d(), "getMultiPkBoard").map(new w9j() { // from class: l.yov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkLeaderboard;
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public static c<BLiveMultiCallSummary> m4930r6(String str) {
        return upv.w(cll.l(ytr.b("/multi-calls/" + str + "/summary")).p().d(), "multiCallSummary_" + str).map(new w9j() { // from class: l.xiv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSummary;
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public static void m4931r7(String str, String str2) {
        upv.w(cll.l(ytr.b("/leaderboard/gift_star/current")).p().c("anchorId", str).c("liveMode", str2).d(), "requestStarBoard").subscribe(ffw.e(new e30() { // from class: l.wov
            public final void call(Object obj) {
                LivingNormalApiProvider.m4763Z1((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.hpv
            public final void call(Object obj) {
                ((ggv) ypv.l(fld0.c)).h.onNext(BLiveGiftStarBoard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ Boolean m4934s1(List list) {
        if (vwb.J(list)) {
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
    public static /* synthetic */ Boolean m4935s2(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((vwb.J(bLiveEnvelope.data.lives) || vwb.J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!vwb.J(bLiveEnvelope.data.lives));
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Boolean m4936s3(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.verificationCenter)) {
            return Boolean.FALSE;
        }
        BLiveVerificationAnchor bLiveVerificationAnchor = ((BLiveVerificationCenter) bLiveEnvelope.data.verificationCenter.get(0)).voiceAnchor;
        return bLiveVerificationAnchor == null ? Boolean.FALSE : Boolean.valueOf(TEnum.equals(bLiveVerificationAnchor.status, "verified"));
    }

    /* JADX INFO: renamed from: s4 */
    public static c<BLiveAddStickerResult> m4937s4(String str) {
        return upv.h(cll.l(ytr.b("/rooms/" + str + "/live-stickers")), "getAddedSticker" + str).map(new w9j() { // from class: l.phv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4986y((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static c<BLiveMultiPkPanel> m4938s5(String str) {
        return upv.w(cll.l(ytr.b("/multi-pk-panel?ownerLiveId=" + str)).p().d(), "getMultiPkPanel").map(new w9j() { // from class: l.kov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkPanel;
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public static c<BLiveMultiPkDetail> m4939s6(String str) {
        return upv.w(cll.l(ytr.b("/multi-pk/" + str)).p().d(), "multiPkDetail").map(new w9j() { // from class: l.nhv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPk;
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public static c<User> m4940s7(String str, @Nullable String str2) {
        cll.a aVarC = cll.l(ytr.b("/live-users/" + str)).p().c("with", "followships,relationships");
        if (!TextUtils.isEmpty(str2)) {
            aVarC.c("liveID", str2);
        }
        return upv.w(aVarC.d(), "live-users/" + str + str2).map(new w9j() { // from class: l.aiv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4942t0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ User m4942t0(BLiveEnvelope bLiveEnvelope) {
        User user = (User) bLiveEnvelope.data.users.get(0);
        user.localFollowship = vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.l(fld0.b)).a(user);
        return user;
    }

    /* JADX INFO: renamed from: t4 */
    public static c<BLiveEnvelope> m4946t4(String str) {
        return upv.h(LiveApiBuilder.u(ytr.a("/" + str + "/fanbases"), new mt0[0]), "getFanbaseAnchor" + str);
    }

    /* JADX INFO: renamed from: t5 */
    public static c<BLiveMultiPkAsset> m4947t5(String str) {
        return upv.w(cll.l(ytr.b("/users/" + str + "/multi-pk-asset")).p().d(), "getMultiPkSetting").map(new w9j() { // from class: l.iov
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public static c<BLiveMultiCall> m4948t6(String str) {
        return m4630K3(str, "mute");
    }

    /* JADX INFO: renamed from: t7 */
    public static c<BLiveEnvelope> m4949t7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8) {
        return m4958u7(str, str2, str3, str4, str5, str6, str7, str8, null);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ BLiveCall m4950u(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCall) bLiveEnvelope.data.calls.get(0);
    }

    /* JADX INFO: renamed from: u3 */
    public static c<Boolean> m4954u3(String str, Boolean bool, String str2) {
        return upv.m(m4648M3(str, bool.booleanValue() ? "turn-on-reject-invite" : "turn-off-reject-invite", str2), "acceptInvite_" + bool, "").map(new w9j() { // from class: l.nnv
            public final Object call(Object obj) {
                return r610.G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new gnv()).map(new w9j() { // from class: l.onv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).rejectInvite);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public static c<BLiveAnchor> m4955u4(String str) {
        return upv.w(cll.l(ytr.b("/anchors/" + str)), "anchorInfo" + str).filter(new w9j() { // from class: l.jpv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new w9j() { // from class: l.kpv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4602H2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u5 */
    public static c<List<BLiveVerificationCenter>> m4956u5() {
        String strD0 = ypv.a.D0();
        return upv.h(cll.l(ytr.b("/users/" + strD0 + "/verifications/" + strD0)), "liveVerification").map(new w9j() { // from class: l.hmv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public static c<BLiveEnvelope> m4957u6(String str, String str2) {
        return upv.e(LiveApiBuilder.u(ytr.d(str + "/notify"), new mt0[0]), "notifyFanbase" + str, str2);
    }

    /* JADX INFO: renamed from: u7 */
    public static c<BLiveEnvelope> m4958u7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        cll.a aVarC = cll.l(ytr.b("/live-users2/" + str)).p().c("from", str3).c("to", str4).c("scene", str5).c("source", str6).c("liveId", str2).c("roomId", str7);
        if (!TextUtils.isEmpty(str8)) {
            aVarC.c("anchorId", str8);
        }
        if (NullChecker.a(bLiveMultiCall)) {
            aVarC.c("multiCallOwnerRoomId", bLiveMultiCall.ownerRoomId);
            aVarC.c("multiCallOwnerLiveId", bLiveMultiCall.ownerLiveId);
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            CrashHelper.c(new Exception("requestUserCardAndMedals userId is null   url = " + aVarC.toString()));
        }
        return upv.h(aVarC.d(), "live-users2/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ BLive m4959v(List list) {
        return (BLive) list.get(0);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ User m4961v1(BLiveEnvelope bLiveEnvelope) {
        User user = (User) bLiveEnvelope.data.users.get(0);
        user.localFollowship = vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.l(fld0.b)).a(user);
        return user;
    }

    /* JADX INFO: renamed from: v3 */
    public static c<BLivePkInvite> m4963v3(String str) {
        return upv.m(cll.l(ytr.b("/pk-invites/" + str)), "acceptPkInvite" + str, "{\n  \"state\": \"accepted\"\n}").map(new w9j() { // from class: l.pkv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4628K1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static c<List<BLiveMultiCallInvite>> m4964v4() {
        return m4559C4(s410.C);
    }

    /* JADX INFO: renamed from: v5 */
    public static c<BLiveEnvelope> m4965v5(String str, String str2, int i, int i2, boolean z) {
        return m4974w5(str, str2, i, i2, z, null);
    }

    /* JADX INFO: renamed from: v6 */
    public static c<roj0> m4966v6(String str) {
        return upv.m(cll.l(ytr.f("/" + str)), "notifyLiveStreamReady" + str, "{\n  \"state\": \"streamReady\"\n}").map(new w9j() { // from class: l.qnv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public static c<Boolean> m4967v7() {
        String strD0 = ypv.a.D0();
        return upv.h(cll.l(ytr.b("/users/" + strD0 + "/verifications/" + strD0)).p().c("process", "new").d(), "voiceLiveVerification").map(new w9j() { // from class: l.ohv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4936s3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ roj0 m4969w0(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.J(bLiveEnvelope.data.videoQualities)) {
            ((idv) ypv.l(fld0.b)).c = (BLiveVideoQuality) bLiveEnvelope.data.videoQualities.get(0);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ BLiveCallSummary m4970w1(BLiveEnvelope bLiveEnvelope) {
        return (BLiveCallSummary) bLiveEnvelope.data.callSummaries.get(0);
    }

    /* JADX INFO: renamed from: w3 */
    public static c<roj0> m4972w3(String str, boolean z) {
        return upv.m(cll.l(ytr.b("/multi-pk-invites/" + str)).p().c("action", z ? "accept" : "reject").d(), "acceptReStartMultiPk", "").map(new w9j() { // from class: l.viv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public static c<List<BLiveMultiCall>> m4973w4(String str) {
        return upv.w(cll.l(ytr.b("/multi-calls")).p().c("states", s410.m).c("liveId", str).c("with", "followships").d(), "getApplyList").map(new w9j() { // from class: l.omv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4924r0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static c<BLiveEnvelope> m4974w5(String str, String str2, int i, int i2, boolean z, @Nullable String str3) {
        cll.a aVarC = cll.l(ytr.i("/me/leaderboards/" + str)).p().c("start", String.valueOf(i)).c("end", String.valueOf(i2)).c("scopeId", str2).c("withHierarchy", "true");
        if (z) {
            aVarC.c("withVoiceUserMask", "true");
        }
        if (!TextUtils.isEmpty(str3)) {
            aVarC.c("roomId", str3);
        }
        return upv.w(aVarC.d(), "contributeRecords" + str2);
    }

    /* JADX INFO: renamed from: w6 */
    public static c<BLivePk> m4975w6(String str, boolean z) {
        return upv.m(cll.l(ytr.b("/pks/" + str + "?action=" + (z ? "mute" : "unmute"))), "notifyPkAudioMute" + str, "").map(new w9j() { // from class: l.dov
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4906p0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public static c<far> m4976w7(String str, String str2, String str3) {
        cll.a aVarP = cll.l(ytr.f("/" + str + "/week-leaderboard")).p();
        aVarP.c("source", "live");
        aVarP.c("with", "users");
        aVarP.c("roomId", str2);
        aVarP.c("type", str3);
        if (w220.m24291b()) {
            aVarP.c("fakeId", w220.m24290a());
        }
        return upv.w(aVarP.d(), "requestWeekLeaderBoard").doOnNext(new e30() { // from class: l.epv
            public final void call(Object obj) {
                ((idv) ypv.l(fld0.b)).l(((BLiveEnvelope) obj).data.users);
            }
        }).map(new w9j() { // from class: l.fpv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4754Y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static c<List<BLiveCall>> m4981x3(String str) {
        return upv.m(cll.l(ytr.b("/calls/" + str)).p().c("action", "user-switch-to-video-accepted").d(), "acceptVideoCall", "").map(new w9j() { // from class: l.hkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public static c<List<BLiveClarity>> m4982x4(String str) {
        return upv.h(LiveApiBuilder.m(ytr.f("/" + str + "/clarity-list")).d(), "getArticulationList" + str).map(new w9j() { // from class: l.lkv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveClarityLevelInfos;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static void m4983x5(String str) {
        fld0 fld0Var = fld0.c;
        if (!NullChecker.a(((ggv) ypv.l(fld0Var)).g) || TextUtils.isEmpty(((ggv) ypv.l(fld0Var)).g.links.next)) {
            return;
        }
        m4803d5(str, ((ggv) ypv.l(fld0Var)).g.links.next);
    }

    /* JADX INFO: renamed from: x6 */
    public static c<Boolean> m4984x6(String str, Boolean bool, String str2) {
        return upv.m(m4648M3(str, bool.booleanValue() ? "turn-on-free-call" : "turn-off-free-call", str2), "openFreeCall_" + bool, "").map(new w9j() { // from class: l.fnv
            public final Object call(Object obj) {
                return r610.G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new gnv()).map(new w9j() { // from class: l.hnv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).freeCall);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public static c<Boolean> m4985x7() {
        String strD0 = ypv.a.D0();
        return upv.w(cll.l(ytr.b("/users/" + strD0 + "/verifications/" + strD0)), "getCallVideoAuth").map(new w9j() { // from class: l.xnv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new w9j() { // from class: l.ynv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) vwb.r((List) obj, new w9j() { // from class: l.ljv
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m4923r((BLiveVerificationCenter) obj2);
                    }
                })) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ BLiveAddStickerResult m4986y(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (BLiveAddStickerResult) bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ List m4988y1(BLiveEnvelope bLiveEnvelope) {
        List list = bLiveEnvelope.data.liveStickerTemplatesGifts;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: y3 */
    public static c<BLiveEnvelope> m4990y3(String str, String str2) {
        return upv.p(cll.l(ytr.b("/rooms/" + str + "/blacklist/" + str2 + "?method=put")).p().d(), "deFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: y4 */
    public static c<List<BLiveMultiCallInvite>> m4991y4() {
        return m4559C4(s410.D);
    }

    /* JADX INFO: renamed from: y5 */
    public static c<t9u> m4992y5(String str, String str2, String str3, int i, Pagination pagination, String str4, boolean z) {
        return m4875l5(str, str2, str3, i, pagination.links.next, false, str4, z);
    }

    /* JADX INFO: renamed from: y6 */
    public static c<BLiveMultiCallAsset> m4993y6(String str) {
        return upv.m(m4648M3(ypv.a.D0(), "turn-on-multi-call", str), "openMultiCall", "").map(new w9j() { // from class: l.npv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        }).filter(new w9j() { // from class: l.opv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y7 */
    public static c<BLiveEnvelope> m4994y7(String str, int i) {
        cll.a aVarM = LiveApiBuilder.m(ytr.f("/" + str + "/clarity-level-selected"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("selected", Integer.valueOf(i));
        jSONObject.put("liveId", str);
        return upv.e(aVarM.d(), "selectArticulation" + str + i, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: z3 */
    public static c<BLiveAddStickerResult> m4999z3(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        return upv.e(cll.l(ytr.b("/rooms/" + str + "/live-stickers")), "addSticker" + str, jSONObject.toString()).map(new w9j() { // from class: l.ymv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4905p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public static c<BLiveEnvelope> m5000z4(String str, String str2) {
        return upv.h(LiveApiBuilder.u(ytr.i("/" + str + "/fanbases/" + str2 + "/medals"), new mt0[0]), "getAudienceMedals" + str + str2);
    }

    /* JADX INFO: renamed from: z5 */
    public static c<BLiveEnvelope> m5001z5(String str) {
        return upv.w(cll.l(cll.l(ytr.b("/anchors")).p().c("search", "pk-suggested-matched").c("with", "lives,users").toString() + "&" + str), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: z6 */
    public static c<BLiveRoom> m5002z6(String str, BLiveRoom bLiveRoom) {
        return upv.m(cll.l(ytr.b("/rooms/" + str)), "patchRoom", bLiveRoom.toJson()).filter(new w9j() { // from class: l.dhv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.rooms));
            }
        }).map(new w9j() { // from class: l.fhv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rooms;
            }
        }).map(new w9j() { // from class: l.ghv
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m4827g2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public static c<roj0> m5003z7(String str, String str2, boolean z) {
        return upv.m(cll.l(ytr.b("/pks/" + str)).p().c("action", "punish-select").c("motionId", str2).c("auto", String.valueOf(z)).d(), "selectPkPunish", "").map(new w9j() { // from class: l.ugv
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }
}
