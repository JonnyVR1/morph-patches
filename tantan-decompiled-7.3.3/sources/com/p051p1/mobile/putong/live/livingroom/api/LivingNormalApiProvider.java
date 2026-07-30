package com.p051p1.mobile.putong.live.livingroom.api;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.GiftAction;
import com.p051p1.mobile.putong.core.data.LoveLetterGroupState;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupCountBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveRoomSuggestBean;
import com.p051p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveCallSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p051p1.mobile.putong.live.base.data.BLiveClarity;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyTasks;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuList;
import com.p051p1.mobile.putong.live.base.data.BLiveDanmakuListItem;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveDownChestRewardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeIdRequestBody;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstRechargeStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveJoinFanBaseContent;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallSwitchToLeadRoleInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowList;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p051p1.mobile.putong.live.base.data.BLivePkSummary;
import com.p051p1.mobile.putong.live.base.data.BLivePostEvent;
import com.p051p1.mobile.putong.live.base.data.BLivePush;
import com.p051p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveSendMessageData;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaData;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSettle;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p051p1.mobile.putong.live.base.data.MultiCallApplyRequestData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkFriendInfo;
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
import p137rx.C22421c;
import p153l.a8g;
import p153l.bf10;
import p153l.cd10;
import p153l.civ;
import p153l.dhw;
import p153l.eb20;
import p153l.fo0;
import p153l.h9t;
import p153l.hcr;
import p153l.hiv;
import p153l.hpv;
import p153l.htd0;
import p153l.i6t;
import p153l.ir10;
import p153l.j2s;
import p153l.j7u;
import p153l.jfv;
import p153l.jyb;
import p153l.n180;
import p153l.nsh0;
import p153l.o1j0;
import p153l.oo2;
import p153l.pf60;
import p153l.pzi0;
import p153l.qcj;
import p153l.rnl;
import p153l.st0;
import p153l.ubu;
import p153l.ugd0;
import p153l.upq;
import p153l.uxj0;
import p153l.v7t;
import p153l.vrv;
import p153l.wzp;
import p153l.y20;
import p153l.zc50;
import p153l.zrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes4.dex */
public class LivingNormalApiProvider {

    /* JADX INFO: renamed from: a */
    public static final Pattern f48532a = Pattern.compile("&limit=(\\d+)");

    /* JADX INFO: renamed from: b */
    public static int f48533b = 30;

    public enum ConnectType {
        VIDEO_TYPE,
        VOICE_TYPE
    }

    public enum SwitchType {
        NORMAL_TO_CALL,
        CALL_TO_NORMAL
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider$a */
    public static /* synthetic */ class C12772a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48534a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f48535b;

        static {
            int[] iArr = new int[SwitchType.values().length];
            f48535b = iArr;
            try {
                iArr[SwitchType.NORMAL_TO_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48535b[SwitchType.CALL_TO_NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ConnectType.values().length];
            f48534a = iArr2;
            try {
                iArr2[ConnectType.VIDEO_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48534a[ConnectType.VOICE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ BLive m72355A1(BLiveEnvelope bLiveEnvelope) {
        return jyb.m147479J(bLiveEnvelope.data.lives) ? BLive.EMPTY : bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ BLiveRoom m72356A2(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.rooms)) {
            return null;
        }
        return bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public static C22421c<BaseLiveBean> m72357A3(String str, String str2, boolean z) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221803c(str + "/audits/" + str2), new st0[0]);
        if (!z) {
            rnlVarM68498u = rnlVarM68498u.m182288p().m182300c("reject", "1").m182301d();
        }
        return vrv.m202551l(rnlVarM68498u, "agreeApply", "", h9t.m134085b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: A4 */
    public static C22421c<BLiveMultiCallAsset> m72358A4(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221809i("/" + str + "/multi-call-asset")).m182288p().m182300c("liveId", str2).m182301d(), "getCallAssets").map(new qcj() { // from class: l.rqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        });
    }

    /* JADX INFO: renamed from: A5 */
    public static C22421c<BaseLiveListBean<FanbaseGroupAuditsItemBean>> m72359A5(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/fanbase-group-audits?");
        if (TextUtils.isEmpty("next")) {
            str2 = "page=1";
        }
        sb.append(str2);
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221801a(sb.toString()), new st0[0]), "getNoticeList", h9t.m134084a(FanbaseGroupAuditsItemBean.class, "fanbaseGroupAudits"));
    }

    /* JADX INFO: renamed from: A6 */
    public static C22421c<BLiveEnvelope> m72360A6() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        StringBuilder sb = new StringBuilder("/");
        sb.append("anchors");
        sb.append("/me/verifications");
        String string = "";
        sb.append("");
        String strM221802b = zvr.m221802b(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", strM207631D0);
            jSONObject.put("user_id", strM207631D0);
            jSONObject.put("anchor", new JSONObject());
            jSONObject.put("type", "verification");
            jSONObject.put("anchorType", "video");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202544e(rnl.m182263l(strM221802b), "patch_anchor" + strM207631D0, string);
    }

    /* JADX INFO: renamed from: A7 */
    public static C22421c<List<BLiveMultiCallInvite>> m72361A7(List<String> list, String str, String str2, String str3) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("source", str3);
        final JsonArray jsonArray = new JsonArray();
        jyb.m147537z(list, new y20() { // from class: l.lpv
            @Override // p153l.y20
            public final void call(Object obj) {
                jsonArray.add((String) obj);
            }
        });
        jsonObject.add("userIds", jsonArray);
        jsonObject.addProperty("type", str2);
        jsonObject.addProperty("ownerMultiCallOrder", str);
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/multi-call-invites")), "sendInvite", jsonObject.toString()).map(new qcj() { // from class: l.mpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallInvites;
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22421c m72362B(String str, String str2, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165636j(str);
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str2 + "/managers")), "updateManager");
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m72363B0(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109981y(bLiveEnvelope.data.monetizationConfig.isPaidUser);
        htd0<jfv> htd0Var = htd0.f111520b;
        if (((jfv) zrv.m221194l(htd0Var)).f120641b.m222761e() == null) {
            ((jfv) zrv.m221194l(htd0Var)).f120641b.m137019l(bLiveEnvelope.data.monetizationConfig);
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static C22421c<BLiveCall> m72366B3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "anchor-voice-approved").m182301d(), "agreeVoiceCall", "").filter(new qcj() { // from class: l.ulv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.vlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: B4 */
    public static void m72367B4(String str) {
        m72358A4(zrv.f205799a.m207631D0(), str).map(new qcj() { // from class: l.mjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bf10.m103801G((BLiveMultiCallAsset) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.njv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72409G1((BLiveMultiCallAsset) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B5 */
    public static C22421c<List<BLiveMultiCall>> m72368B5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-calls")).m182288p().m182300c("states", cd10.f81086n + Constants.SEPARATOR_COMMA + cd10.f81087o).m182300c("liveId", str).m182301d(), "getOnGoingCallList").map(new qcj() { // from class: l.tlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls;
            }
        });
    }

    /* JADX INFO: renamed from: B6 */
    public static C22421c<uxj0> m72369B6() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/users/" + strM207631D0 + "/verifications/" + strM207631D0)).m182288p().m182300c("process", ShareConstants.NEW_VERSION).m182301d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        return vrv.m202541b(rnlVarM182301d, "voiceLiveVerification" + strM207631D0, bLiveVerificationCenter.toJson()).map(new qcj() { // from class: l.pqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).onErrorReturn(new qcj() { // from class: l.qqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72491P2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B7 */
    public static C22421c<BLiveEnvelope> m72370B7(String str) {
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/live-gift/bullet-comments")), "liveSendDanmaku", str);
    }

    /* JADX INFO: renamed from: C3 */
    public static C22421c<uxj0> m72375C3() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/" + zrv.f205799a.m207631D0() + "/anchor-verifications")), "anchorVerification").map(new qcj() { // from class: l.gmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static C22421c<List<BLiveMultiCallInvite>> m72376C4(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-call-invites")).m182288p().m182300c("type", str).m182300c("with", "followships").m182301d(), "getCallInvites" + str).map(new qcj() { // from class: l.pmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72600b3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public static C22421c<BLive> m72377C5(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/" + str + "/lives")).m182288p().m182300c("state", "ongoing,born").m182301d(), "onGoingLive").map(new qcj() { // from class: l.hnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72355A1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C6 */
    public static C22421c<uxj0> m72378C6() {
        C22421c<BLiveEnvelope> c22421cM202544e;
        String strM207631D0 = zrv.f205799a.m207631D0();
        boolean zM203428H5 = zrv.m221193k().m203428H5();
        rnl rnlVarM182301d = rnl.m182263l(zM203428H5 ? m72586Z7(strM207631D0) : m72384D3(strM207631D0)).m182288p().m182300c("process", ShareConstants.NEW_VERSION).m182301d();
        BLiveVerificationCenter bLiveVerificationCenter = new BLiveVerificationCenter();
        BLiveVerificationAnchor bLiveVerificationAnchor = new BLiveVerificationAnchor();
        bLiveVerificationCenter.voiceAnchor = bLiveVerificationAnchor;
        bLiveVerificationAnchor.status = BLiveVerificationStatus.get("verified");
        if (!zM203428H5) {
            bLiveVerificationCenter.anchorType = "voice";
        }
        if (zM203428H5) {
            c22421cM202544e = vrv.m202541b(rnlVarM182301d, "voiceLiveVerification" + strM207631D0, bLiveVerificationCenter.toJson());
        } else {
            c22421cM202544e = vrv.m202544e(rnlVarM182301d, "voiceLiveVerification" + strM207631D0, bLiveVerificationCenter.toJson());
        }
        return c22421cM202544e.map(new qcj() { // from class: l.gkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).onErrorReturn(new qcj() { // from class: l.hkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72643g1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C7 */
    public static C22421c<BLiveEnvelope> m72379C7(String str, BLiveDanmakuListItem bLiveDanmakuListItem, String str2, String str3, String str4, String str5) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("fakeId", (Object) (eb20.m120149b() ? eb20.m120148a() : ""));
        jSONObject.put(MatchFrom.scenario, (Object) "live");
        com.alibaba.fastjson.JSONObject jSONObject2 = new com.alibaba.fastjson.JSONObject();
        jSONObject2.put("originalId", (Object) UUID.randomUUID().toString());
        jSONObject2.put("liveId", (Object) str2);
        jSONObject2.put("roomId", (Object) str3);
        jSONObject2.put("anchorId", (Object) str4);
        jSONObject2.put("content", (Object) str);
        jSONObject2.put("typeId", (Object) bLiveDanmakuListItem.f45203id);
        jSONObject2.put("type", (Object) bLiveDanmakuListItem.type);
        jSONObject2.put("subType", (Object) bLiveDanmakuListItem.subType);
        jSONObject.put("videoLiveBulletComment", (Object) jSONObject2);
        jSONObject.put("liveMode", (Object) str5);
        return m72370B7(jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: D3 */
    public static String m72384D3(String str) {
        return zvr.m221802b("/anchors/" + str + "/verifications");
    }

    /* JADX INFO: renamed from: D4 */
    public static C22421c<BLiveChatMangerSettings> m72385D4(@NonNull String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/chat-settings")), "get_chat_settings_" + str).map(new qcj() { // from class: l.inv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: D5 */
    public static C22421c<BLiveEnvelope> m72386D5(String str, int i) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/anchors")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-matched").m182300c("with", "lives,users").m182300c("until", str).m182300c(Constants.KEY_LIMIT, String.valueOf(i)).m182301d(), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: D6 */
    public static C22421c<BLiveEnvelope> m72387D6(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/anchor_leaderboard")).m182288p().m182300c("anchorId", str).m182300c("liveMode", str2).m182300c("type", str3).m182301d(), "dailyOrWeekLeaderBoards");
    }

    /* JADX INFO: renamed from: D7 */
    public static C22421c<BLiveEnvelope> m72388D7(String str, BLivePostEvent bLivePostEvent) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/users/me/live-event")), "sendLiveEvent" + str, bLivePostEvent.toJson());
    }

    /* JADX INFO: renamed from: E3 */
    public static C22421c<BLiveMultiCall> m72393E3(MultiCallApplyRequestData multiCallApplyRequestData) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/multi-calls")), "sendApplyCall", multiCallApplyRequestData.toJson()).filter(new qcj() { // from class: l.mrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new qcj() { // from class: l.nrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static C22421c<FanbaseGroupCountBean> m72394E4(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221801a(str + "/audits-counter"), new st0[0]), "getCount", h9t.m134086c(FanbaseGroupCountBean.class, "fanbaseGroupAuditCounter"));
    }

    /* JADX INFO: renamed from: E5 */
    public static C22421c<Integer> m72395E5() {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/pk-suggested-anchors"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, "matched"), st0.m187803a(Constants.KEY_LIMIT, "50")), "getOnlineFriendsCount").filter(new qcj() { // from class: l.jnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new qcj() { // from class: l.knv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveEnvelope) obj).data.pkSuggestedAnchors.get(0).anchors.size());
            }
        });
    }

    /* JADX INFO: renamed from: E6 */
    public static C22421c<BLiveEnvelope> m72396E6(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/hour_leaderboard")).m182288p().m182300c("anchorId", str).m182300c("liveMode", str2).m182301d(), "hourLeaderBoards");
    }

    /* JADX INFO: renamed from: E7 */
    public static C22421c<BLiveEnvelope> m72397E7(String str) {
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-push")), "sendLivePush", "");
    }

    /* JADX INFO: renamed from: F2 */
    public static /* synthetic */ BLiveData m72401F2(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.anchorKnightInfos.size() > 0) {
            ((hiv) zrv.m221194l(htd0.f111521c)).f110075f.m137019l(bLiveEnvelope.data.anchorKnightInfos.get(0));
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: F3 */
    public static C22421c<BLiveCall> m72402F3(String str, String str2, String str3, int i) {
        String strM221802b = zvr.m221802b("/calls");
        BLiveCall bLiveCall = new BLiveCall();
        bLiveCall.liveId = str;
        bLiveCall.source = str3;
        bLiveCall.inviteId = str2;
        bLiveCall.intendPosition = i;
        if (eb20.m120149b()) {
            bLiveCall.fakeId = eb20.m120148a();
        }
        return vrv.m202555p(rnl.m182263l(strM221802b), "applyCallInvite", bLiveCall.toJson()).filter(new qcj() { // from class: l.jmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.kmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: F4 */
    public static C22421c<BLiveDanmakuList> m72403F4(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-gift/bullet-comment-types")).m182288p().m182300c(MatchFrom.scenario, "live").m182300c("anchorId", str).m182300c("liveId", str2).m182300c("roomId", str3).m182300c("fakeId", eb20.m120149b() ? eb20.m120148a() : "").m182301d(), "DanmakuList").map(new qcj() { // from class: l.kkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoLiveBulletCommentTypes;
            }
        }).onErrorReturn(new qcj() { // from class: l.lkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72680k2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F5 */
    public static void m72404F5(String str, String str2, String str3) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rooms/" + str + "/members/" + str2));
        if (eb20.m120149b()) {
            c19886aM68490m.m182300c("fakeId", eb20.m120148a());
        }
        c19886aM68490m.m182300c("sessionId", str3);
        vrv.m202540a(c19886aM68490m.m182301d(), "getOutRoom" + str, "");
    }

    /* JADX INFO: renamed from: F6 */
    public static C22421c<BLiveChatMangerSettings> m72405F6(@NonNull String str, BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/rooms/" + str + "/chat-settings"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jailedType", bLiveChatJailedType.toString());
            final JSONArray jSONArray = new JSONArray();
            jyb.m147537z(list, new y20() { // from class: l.uiv
                @Override // p153l.y20
                public final void call(Object obj) {
                    jSONArray.put((String) obj);
                }
            });
            jSONObject.put("shieldingWords", jSONArray);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202555p(rnlVarM182263l, "get_chat_settings_" + str, jSONObject.toString()).map(new qcj() { // from class: l.bnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.chatSettings;
            }
        });
    }

    /* JADX INFO: renamed from: F7 */
    public static C22421c<BLiveEnvelope> m72406F7(BLiveSendMessageData bLiveSendMessageData) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/room/message"));
        if (eb20.m120149b()) {
            bLiveSendMessageData.fakeId = eb20.m120148a();
        }
        return vrv.m202544e(c19886aM68490m.m182301d(), "live-send-message", bLiveSendMessageData.toJson());
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ BLivePkSummary m72408G0(BLiveEnvelope bLiveEnvelope) {
        List<BLivePkSummary> list = bLiveEnvelope.data.pkSummaries;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: G1 */
    public static /* synthetic */ void m72409G1(BLiveMultiCallAsset bLiveMultiCallAsset) {
    }

    /* JADX INFO: renamed from: G3 */
    public static C22421c<FanBaseGroupSummaryBean> m72411G3(String str, String str2) {
        return vrv.m202558s(LiveApiBuilder.m68498u(zvr.m221803c(str + "/users/" + str2), new st0[0]), "applyJoin", "", h9t.m134086c(FanBaseGroupSummaryBean.class, "fanbaseGroupSummary"));
    }

    /* JADX INFO: renamed from: G4 */
    public static C22421c<BLiveExtraResponse> m72412G4(String str) {
        return vrv.m202548i(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/blacklist")).m182288p().m182301d(), "getDeFriendList", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G5 */
    public static C22421c<BLivePKCardShowList> m72413G5(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/pks/" + str + "/item-cards"), st0.m187803a("anchorId", str2)), "getPkCardItems" + str + str2).map(new qcj() { // from class: l.cmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkItemCardsDetail;
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public static C22421c<BLiveMultiCall> m72414G6(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-calls/" + str)).m182288p().m182300c("action", str2).m182301d(), "processLeadRole" + str + "_" + str2, "").map(new qcj() { // from class: l.jkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: G7 */
    public static C22421c<BLiveMultiPkAsset> m72415G7(String str, boolean z, int i) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/users/" + str + "/multi-pk-asset")).m182288p().m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("rejectInvite", Boolean.valueOf(z));
        jsonObject.addProperty(BLiveOperationTitleShowType.duration, Integer.valueOf(i));
        return vrv.m202552m(rnlVarM182301d, "getMultiPkSetting", jsonObject.toString()).map(new qcj() { // from class: l.oqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static C22421c<BLiveMultiCall> m72420H3(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-calls/" + str)).m182288p().m182300c("action", "approve").m182300c("approveSource", str2).m182301d(), "approve_" + str2 + str, "").filter(new qcj() { // from class: l.drv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new qcj() { // from class: l.erv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: H4 */
    public static C22421c<BLiveDownChestRewardInfo> m72421H4(String str, String str2, String str3, String str4, boolean z, String str5) {
        String str6 = z ? "chestGiftReward" : "chestGift";
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", (Object) str5);
        jSONObject.put("type", (Object) str6);
        jSONObject.put("liveId", (Object) str2);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("roomId", (Object) str3);
        return vrv.m202555p(rnl.m182263l(str), "chestReward", jSONObject.toString()).map(new qcj() { // from class: l.rkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72552W0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: H5 */
    public static C22421c<BLivePkFirstKillGift> m72422H5() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/pk-assets")), "getPkFirstKillGift").filter(new qcj() { // from class: l.pkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.pkAssets.firstKillGifts.size() > 0);
            }
        }).map(new qcj() { // from class: l.qkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkAssets.firstKillGifts.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: H6 */
    public static C22421c<BLiveMultiCallSwitchToLeadRoleInvite> m72423H6(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-call-switch-to-lead-role-invite/" + str)).m182288p().m182300c("action", str2).m182301d(), "processLeadRoleInvite_" + str + "_" + str2, "").map(new qcj() { // from class: l.ljv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: H7 */
    public static C22421c<List<BLiveCall>> m72424H7(String str, boolean z, boolean z2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", (z2 ? "anchor" : "user").concat(z ? "-mute" : "-unmute")).m182301d(), "setMuteDeputy", "").map(new qcj() { // from class: l.apv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: I1 */
    public static /* synthetic */ BLivePkInvite m72427I1(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ pf60 m72428I2(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pks)) {
            return null;
        }
        n180.m161093j("requestPk:" + bLiveEnvelope.data.pks.get(0).toString());
        return jyb.m147494Y(bLiveEnvelope.data.pks.get(0), bLiveEnvelope.data.users);
    }

    /* JADX INFO: renamed from: I3 */
    public static C22421c<String> m72429I3(String str, String str2, Boolean bool) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).m182288p().m182300c("action", bool.booleanValue() ? "approve" : "reject").m182301d(), "approveSettle", "").map(new qcj() { // from class: l.upv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush.message;
            }
        });
    }

    /* JADX INFO: renamed from: I4 */
    public static C22421c<uxj0> m72430I4() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-video-qualities")).m182288p().m182300c(Device.TYPE, Build.MODEL).m182301d(), "live-video-qualities").map(new qcj() { // from class: l.ynv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72786w0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I5 */
    public static C22421c<BLivePkInvite> m72431I5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/pk-invites/" + str)).m182288p().m182300c("with", "users,lives").m182301d(), "getPkInviteInfo").map(new qcj() { // from class: l.hmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72624e0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public static C22421c<List<j7u>> m72432I6(@NonNull List<String> list, boolean z) {
        String strM197179d = upq.m197175h(Constants.SEPARATOR_COMMA).m197179d(list);
        return vrv.m202547h(rnl.m182263l(zvr.m221802b(z ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, GiftAction.given).m182300c("ids", strM197179d).m182301d(), "ids" + strM197179d).map(new qcj() { // from class: l.vqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(((BLiveEnvelope) obj).data.suggestedLives, new qcj() { // from class: l.skv
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m72662i2((BLiveSuggestLive) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: I7 */
    public static C22421c<BLiveAnchor> m72433I7(boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/anchors/" + zrv.f205799a.m207631D0() + "/live-settings")).m182288p().m182300c("fields", "unacceptPk").m182301d(), "setPkAcceptSetting", "{\n  \"unacceptPk\": " + (z ? "true" : "false") + "\n}").filter(new qcj() { // from class: l.umv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new qcj() { // from class: l.vmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ BLiveRoom m72434J(BLiveEnvelope bLiveEnvelope) {
        ((jfv) zrv.m221194l(htd0.f111520b)).m144716c();
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list != null && list.size() > 0) {
            for (BLiveAddStickerResult bLiveAddStickerResult : list) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144724k(bLiveAddStickerResult.f45177id, bLiveAddStickerResult);
            }
        }
        return jyb.m147479J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : bLiveEnvelope.data.rooms.get(0);
    }

    /* JADX INFO: renamed from: J3 */
    public static ugd0 m72438J3(BLiveEnvelope bLiveEnvelope) {
        return new ugd0(jyb.m147479J(bLiveEnvelope.data.users) ? null : bLiveEnvelope.data.users.get(0), jyb.m147479J(bLiveEnvelope.data.rooms) ? BLiveRoom.new_() : bLiveEnvelope.data.rooms.get(0), bLiveEnvelope.data.lives.get(0), jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0), jyb.m147479J(bLiveEnvelope.data.liveStickers) ? null : bLiveEnvelope.data.liveStickers.get(0)).m195901d(bLiveEnvelope);
    }

    /* JADX INFO: renamed from: J4 */
    public static C22421c<BLiveEnvelope> m72439J4(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221809i("/" + str2 + "/fanbases/" + str), st0.m187803a("with", "hierarchies,medals")), "getFanBaseInfo" + str + str2);
    }

    /* JADX INFO: renamed from: J5 */
    public static C22421c<List<BLivePkSuggestAnchors>> m72440J5() {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/pk-suggested-anchors"), st0.m187803a(Constants.KEY_LIMIT, "50")), "getPkSuggestAnchorList").map(new qcj() { // from class: l.xmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: J6 */
    public static C22421c<BLiveEnvelope> m72441J6(String str) {
        return vrv.m202555p(LiveApiBuilder.m68498u(zvr.m221802b("/official-show/quit"), st0.m187803a("programId", str)), "quitOfficialShow" + str, "");
    }

    /* JADX INFO: renamed from: J7 */
    public static C22421c<BLiveEnvelope> m72442J7(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/tricks/sign-in")), "liveSignIn", str);
    }

    /* JADX INFO: renamed from: K1 */
    public static /* synthetic */ BLivePkInvite m72445K1(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: K3 */
    public static C22421c<BLiveMultiCall> m72447K3(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-calls/" + str)).m182288p().m182300c("action", str2).m182301d(), "callAction" + str2 + str, "").filter(new qcj() { // from class: l.bpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new qcj() { // from class: l.cpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public static C22421c<a8g> m72448K4(final BLiveJoinFanBaseContent bLiveJoinFanBaseContent) {
        String str = bLiveJoinFanBaseContent.anchorId;
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            CrashHelper.m82479c(new Exception("CoreLiveFanBases getAnchorFanbases"));
        }
        return m72763t4(bLiveJoinFanBaseContent.anchorId).map(new qcj() { // from class: l.rjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72726p3((BLiveEnvelope) obj);
            }
        }).filter(new qcj() { // from class: l.sjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).flatMap(new qcj() { // from class: l.tjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                String str2 = (String) obj;
                return LivingNormalApiProvider.m72439J4(str2, bLiveJoinFanBaseContent.userId).map(new qcj() { // from class: l.nmv
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m72461M(str2, (BLiveEnvelope) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: K5 */
    public static C22421c<List<BLivePkSuggestAnchors>> m72449K5(Pagination pagination) {
        String str = zvr.m221802b("/pk-suggested-anchors") + "?" + pagination.links.next;
        return vrv.m202547h(rnl.m182263l(str), "getPkSuggestLoadMore".concat(str)).map(new qcj() { // from class: l.snv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors;
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public static C22421c<uxj0> m72450K6(String str, List<String> list) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/multi-pk-invites")).m182288p().m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return vrv.m202555p(rnlVarM182301d, "reStartMultiPk", jsonObject.toString()).map(new qcj() { // from class: l.qrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: K7 */
    public static C22421c<uxj0> m72451K7(String str, List<String> list) {
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/multi-pk")).m182288p().m182301d();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerLiveId", str);
        JsonArray jsonArray = new JsonArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        jsonObject.add("toUserIds", jsonArray);
        return vrv.m202555p(rnlVarM182301d, "startMultiPk", jsonObject.toString()).map(new qcj() { // from class: l.iqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public static C22421c<j2s> m72456L3(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/calls")).m182288p().m182300c("liveId", str).m182300c("with", "users").m182300c("state", "created,on-voice,on-video").m182301d(), "callApplyList").map(new qcj() { // from class: l.nqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72463M1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L4 */
    public static C22421c<BLiveEnvelope> m72457L4(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221804d(str + "/fanbase-medals-panel"), st0.m187803a("anchorId", str2)), "getFanBaseMedalEditPanel" + str + str2).filter(new qcj() { // from class: l.nov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.fanbaseMedalPanel != null);
            }
        });
    }

    /* JADX INFO: renamed from: L5 */
    public static C22421c<Integer> m72458L5(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-video-qualities")).m182288p().m182300c("usage", "multi-call").m182300c("sizeType", str).m182300c("layout", str2).m182301d(), "getPushBitrate" + str + str2).filter(new qcj() { // from class: l.ajv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.videoQualities));
            }
        }).map(new qcj() { // from class: l.bjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveEnvelope) obj).data.videoQualities.get(0).pushBitrate);
            }
        });
    }

    /* JADX INFO: renamed from: L6 */
    public static C22421c<BLive> m72459L6(String str, String str2) {
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("state", (Object) "onlive");
        return vrv.m202552m(rnl.m182263l(zvr.m221806f("/" + str)).m182288p().m182300c("source", str2).m182300c("wait-stream-ready", "true").m182301d(), "recoverLive", jSONObject.toString()).filter(new qcj() { // from class: l.tov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.vov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72500Q2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L7 */
    public static C22421c<BLive> m72460L7(String str, boolean z) {
        ir10.m141746a("stopOrSuspendLive live id = " + str + " isStop = " + z);
        String str2 = z ? "\"stopped\"" : "\"suspended\"";
        return vrv.m202552m(rnl.m182263l(zvr.m221806f("/" + str)), z ? "stopLive" : "suspendLive", "{\"state\": " + str2 + " }").filter(new qcj() { // from class: l.qov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.rov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        }).map(new qcj() { // from class: l.sov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72670j1((BLive) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ a8g m72461M(String str, BLiveEnvelope bLiveEnvelope) {
        return new a8g(bLiveEnvelope, str);
    }

    /* JADX INFO: renamed from: M1 */
    public static /* synthetic */ j2s m72463M1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new j2s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: M3 */
    public static rnl m72465M3(String str, String str2, String str3) {
        return rnl.m182263l(zvr.m221809i("/" + str + "/multi-call-asset")).m182288p().m182300c("action", str2).m182300c("liveId", str3).m182301d();
    }

    /* JADX INFO: renamed from: M4 */
    public static C22421c<BLiveEnvelope> m72466M4(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221804d(str + "/tasks"), st0.m187803a("source", str2)), "getFanBaseTasks" + str);
    }

    /* JADX INFO: renamed from: M5 */
    public static C22421c<LiveRoomSuggestBean> m72467M5(String str, String str2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, RelationshipStatus.suggested).m182300c("source", str2).m182300c("action", "live-quit-popup").m182300c("currentAnchor", str).m182301d(), "getSuggestData" + str + str2).map(new qcj() { // from class: l.ijv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72681k3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public static C22421c<BLive> m72468M6(String str, String str2) {
        nsh0.m164608j("refreshPlayerStreamAddress", "callback:" + str2);
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221806f("/" + str)).m182288p();
        c19886aM182288p.m182300c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(true));
        c19886aM182288p.m182300c("errcode", String.valueOf(0));
        c19886aM182288p.m182300c("callback", str2);
        c19886aM182288p.m182300c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        return vrv.m202547h(c19886aM182288p.m182301d(), "refreshPlayerStreamAddress" + str).map(new qcj() { // from class: l.vpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: M7 */
    public static C22421c<BLiveEnvelope> m72469M7(String str, String str2, String str3) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221804d(str + "/tasks/" + str2), st0.m187803a("source", str3)), "submitFanBaseTasks" + str2, "");
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ BLiveSignInAchievementMedals m72470N(List list) {
        return (BLiveSignInAchievementMedals) list.get(0);
    }

    /* JADX INFO: renamed from: N3 */
    public static C22421c<j2s> m72474N3(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/calls")).m182288p().m182300c("liveId", str).m182300c("with", "users").m182300c("state", "on-voice,on-video").m182301d(), "callDeputyList").map(new qcj() { // from class: l.aqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72616d1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static C22421c<BLiveEnvelope> m72475N4(String str) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221804d(str + "/fanbase-medals"), new st0[0]), "fanbaseMedals" + str);
    }

    /* JADX INFO: renamed from: N5 */
    public static C22421c<Boolean> m72476N5() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/" + strM207631D0 + "/verifications/" + strM207631D0)), "liveVerification").map(new qcj() { // from class: l.cjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new qcj() { // from class: l.djv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72751s1((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N6 */
    public static C22421c<BLive> m72477N6(String str, int i, String str2) {
        if (TextUtils.isEmpty(str2)) {
            str2 = "refresh-stream-address";
        }
        return vrv.m202552m(LiveApiBuilder.m68498u(zvr.m221806f("/" + str), st0.m187803a("type", str2), st0.m187803a("errorcode", String.valueOf(i))), "refreshStreamAddress" + str, "").map(new qcj() { // from class: l.yov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: N7 */
    public static C22421c<uxj0> m72478N7(String str, String str2, String str3, String str4, String str5) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221804d(str + "/fanbase-medals"), st0.m187803a("anchorId", str2));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("color", str3);
            jSONObject.put("icon", str4);
            jSONObject.put("text", str5);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202544e(rnlVarM68498u, "submitMedalEditInfo" + str + str2, jSONObject.toString()).map(new qcj() { // from class: l.hrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ BLiveSignInDetail m72481O1(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public static C22421c<BLiveCallInvite> m72483O3(String str, String str2) {
        String strM221802b = zvr.m221802b("/call-invites");
        BLiveCallInvite bLiveCallInvite = new BLiveCallInvite();
        bLiveCallInvite.liveId = str;
        bLiveCallInvite.f45192to = str2;
        return vrv.m202555p(rnl.m182263l(strM221802b), "callInvite", bLiveCallInvite.toJson()).filter(new qcj() { // from class: l.tnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.callInvites));
            }
        }).map(new qcj() { // from class: l.unv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.callInvites.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public static C22421c<Integer> m72484O4(String str) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221804d(str + "/redPacketEvents/counter"), new st0[0]), "getFanbaseReddots").map(new qcj() { // from class: l.xiv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72671j2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O5 */
    public static C22421c<BLiveEnvelope> m72485O5(String str, String str2, String str3) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3), new st0[0]), "getRedPacketInfo" + str + str2 + str3).filter(new qcj() { // from class: l.ilv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.grabRedPacketInfo != null);
            }
        });
    }

    /* JADX INFO: renamed from: O6 */
    public static C22421c<BLive> m72486O6(String str, SwitchType switchType) {
        String str2;
        int i = C12772a.f48535b[switchType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "call-stop-refresh-stream-address";
        } else {
            str2 = "call-start-refresh-stream-address";
        }
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/lives/" + str)).m182288p().m182300c("type", str2).m182301d(), "refreshStreamUrl" + str, "").filter(new qcj() { // from class: l.anv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.mnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: O7 */
    public static C22421c<BLiveAnchor> m72487O7(boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/anchors/" + zrv.f205799a.m207631D0() + "/live-settings")).m182288p().m182300c("fields", "callSwitch").m182301d(), "switchCall", "{\n\"callSwitch\": {\n\"on\": " + z + "\n}\n}").map(new qcj() { // from class: l.ujv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ uxj0 m72491P2(Throwable th) {
        nsh0.m164608j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: P3 */
    public static C22421c<BLiveVoiceLivePush> m72492P3(String str, String str2, String str3) {
        String strM221802b = zvr.m221802b("/users/" + str + "/voice-live-push");
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("type", (Object) BLiveVoiceVirtualRoomSettleItem.STATE_SETTLED);
        jSONObject.put("voiceLiveId", (Object) str3);
        if (!TextUtils.isEmpty(str2)) {
            com.alibaba.fastjson.JSONArray jSONArray = new com.alibaba.fastjson.JSONArray();
            jSONArray.add(str2);
            jSONObject.put("userIds", (Object) jSONArray);
        }
        return vrv.m202555p(rnl.m182263l(strM221802b), "voice-callInvite", jSONObject.toString()).map(new qcj() { // from class: l.xjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    public static C22421c<FanbaseGroupsBean> m72493P4(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-groups"), new st0[0]), "getFansGroupList", h9t.m134085b(FanbaseGroupsBean.class));
    }

    /* JADX INFO: renamed from: P5 */
    public static C22421c<List<BLiveVoiceSettle>> m72494P5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + str + "/settles")).m182288p().m182300c("states", "created").m182301d(), "getRequestSettleMembers" + str).map(new qcj() { // from class: l.slv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: P6 */
    public static C22421c<BLive> m72495P6(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/lives/" + str)).m182288p().m182300c("type", str2).m182301d(), "refreshStreamUrl" + str, "").filter(new qcj() { // from class: l.cqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.dqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: P7 */
    public static C22421c<Boolean> m72496P7(String str, String str2, int i) {
        return vrv.m202552m(rnl.m182263l(zvr.m221809i("/" + str + "/multi-call-asset")).m182288p().m182300c("action", i == 6 ? "switch-6-max-call-num" : "switch-9-max-call-num").m182300c("liveId", str2).m182301d(), "switchDeputyCount_" + i, "").doOnNext(new y20() { // from class: l.fqv
            @Override // p153l.y20
            public final void call(Object obj) {
                bf10.m103801G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).map(new qcj() { // from class: l.gqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveEnvelope) obj));
            }
        }).onErrorReturn(new qcj() { // from class: l.hqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72579Z0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public static /* synthetic */ BLivePkSeek m72499Q1(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: Q2 */
    public static /* synthetic */ BLive m72500Q2(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: Q3 */
    public static C22421c<wzp> m72501Q3(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/call-invites")).m182288p().m182300c("with", "users").m182300c("liveId", str).m182301d(), "callInviteList").map(new qcj() { // from class: l.crv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72705n0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public static C22421c<BLiveFirstRechargeDetail> m72502Q4(String str, String str2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/campaigns/first_recharge/detail")).m182288p().m182300c("roomId", str).m182300c("anchorId", str2).m182301d(), "getFirstRechargeBoardDetails").map(new qcj() { // from class: l.ziv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: Q5 */
    public static C22421c<BLiveEnvelope> m72503Q5(String str) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/tricks/sign-in/receive-reward")), "getReward", str);
    }

    /* JADX INFO: renamed from: Q6 */
    public static void m72504Q6(String str) {
        vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-call-invites/" + str)).m182288p().m182300c("action", "reject").m182301d(), "rejectInvite", "");
    }

    /* JADX INFO: renamed from: Q7 */
    public static C22421c<BLiveMultiCall> m72505Q7(String str) {
        return m72414G6(str, "switchToLeadRole");
    }

    /* JADX INFO: renamed from: R3 */
    public static C22421c<BLiveCallSummary> m72510R3(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/calls/" + str + "/summaries")), "callSummary").map(new qcj() { // from class: l.qlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.callSummaries.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: R4 */
    public static C22421c<List<BLiveMultiCallInvite>> m72511R4() {
        return m72376C4(cd10.f81053E);
    }

    /* JADX INFO: renamed from: R5 */
    public static C22421c<BLiveRoom> m72512R5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str)), "getRoom" + str).map(new qcj() { // from class: l.xpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72668j((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R6 */
    public static C22421c<BLivePkInvite> m72513R6(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pk-invites/" + str)).m182288p().m182300c("auto-ignore", String.valueOf(z)).m182301d(), "rejectPkInvite" + str, "{\n  \"state\": \"rejected\"\n}").map(new qcj() { // from class: l.zlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72743r2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R7 */
    public static C22421c<BLiveMultiCall> m72514R7(String str) {
        return m72447K3(str, "switchToVideo");
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BFansBaseRecall m72515S(BLiveEnvelope bLiveEnvelope) {
        for (BFansRecallUser bFansRecallUser : bLiveEnvelope.data.fanbaseRecall.users) {
            bFansRecallUser.setGradleUrl(((hiv) zrv.m221194l(htd0.f111521c)).m135172x(bFansRecallUser.grade).wealthIconUrl);
        }
        return bLiveEnvelope.data.fanbaseRecall;
    }

    /* JADX INFO: renamed from: S1 */
    public static /* synthetic */ List m72517S1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveStickerMetaDataItem> list = bLiveEnvelope.data.liveStickerTemplates;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: S3 */
    public static C22421c<BLiveMultiCall> m72519S3(String str) {
        return m72447K3(str, "cancel");
    }

    /* JADX INFO: renamed from: S4 */
    public static C22421c<BLiveGiftStarBoard> m72520S4() {
        return ((hiv) zrv.m221194l(htd0.f111521c)).f110077h.asObservable().onBackpressureLatest().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: S5 */
    public static C22421c<List<BLiveStickerMetaDataItem>> m72521S5(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-sticker-templates")), "liveRoomAvailableStickers" + str).map(new qcj() { // from class: l.uov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72517S1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: S6 */
    public static C22421c<BLiveMultiCall> m72522S6(String str) {
        return m72447K3(str, "rejectSwitchToVideo");
    }

    /* JADX INFO: renamed from: S7 */
    public static C22421c<List<BLiveCall>> m72523S7(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", z ? "anchor-switch-to-voice" : "user-switch-to-voice").m182301d(), "switchToVoiceCall", "").map(new qcj() { // from class: l.amv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ BLiveSignInAchievementMedals m72525T0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ void m72526T1(String str, BLiveData bLiveData) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty) {
            pf60<Boolean, BLiveData> pf60VarM222761e = ((hiv) zrv.m221194l(htd0.f111521c)).f110074e.m222761e();
            if (NullChecker.m82486a(pf60VarM222761e)) {
                bLiveData.users.addAll(0, pf60VarM222761e.f152157b.users);
            }
        }
        ((hiv) zrv.m221194l(htd0.f111521c)).f110074e.m137019l(jyb.m147494Y(Boolean.valueOf(zIsEmpty), bLiveData));
    }

    /* JADX INFO: renamed from: T2 */
    public static /* synthetic */ zc50 m72527T2(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new zc50(bLiveData.officialShowCurrentAnchorInfo, bLiveData.officialShowList);
    }

    /* JADX INFO: renamed from: T3 */
    public static C22421c<List<BLiveCall>> m72528T3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-voice-canceled").m182301d(), "cancelCallApply", "").map(new qcj() { // from class: l.ekv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public static C22421c<List<BLiveStickerTemplatesGiftItem>> m72529T4() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-sticker-templates-gifts")), "getSchemaStickerList").map(new qcj() { // from class: l.dov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72805y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T5 */
    public static C22421c<BLiveRoom> m72530T5(boolean z, String str) {
        StringBuilder sb = new StringBuilder("/users/");
        if (z) {
            str = "me";
        }
        sb.append(str);
        sb.append("/rooms");
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b(sb.toString())).m182288p();
        if (z) {
            c19886aM182288p.m182300c("with", "live-stickers");
        }
        return vrv.m202547h(c19886aM182288p.m182301d(), "getRoomInfo").map(new qcj() { // from class: l.uqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72434J((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T6 */
    public static C22421c<List<BLiveCall>> m72531T6(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-switch-to-video-rejected").m182301d(), "rejectVideoCall", "").map(new qcj() { // from class: l.ylv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    public static C22421c<BLiveEnvelope> m72532T7(String str) {
        return vrv.m202552m(m72465M3(zrv.f205799a.m207631D0(), "turn-off-turn-on-guide", str), "turnOffMultiCallGuide", "");
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ BLiveSignInDetail m72535U1(List list) {
        return (BLiveSignInDetail) list.get(0);
    }

    /* JADX INFO: renamed from: U3 */
    public static C22421c<List<BLiveCall>> m72537U3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "anchor-switch-to-video-canceled").m182301d(), "cancelInviteVideoCall", "").map(new qcj() { // from class: l.rlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: U4 */
    public static C22421c<BLiveData> m72538U4(String str, String str2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221809i("/" + str + "/guard-user-leaderboards")).m182288p().m182300c("roomId", str2).m182301d(), "getGuardAnchorBoards").map(new qcj() { // from class: l.fmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72401F2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U5 */
    public static C22421c<BLivePkSuggestAnchors> m72539U5(String str) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/pk-suggested-anchors"), st0.m187803a(FirebaseAnalytics.Event.SEARCH, BLivePkInviteSource.query), st0.m187803a(BLivePkInviteSource.query, str), st0.m187803a(Constants.KEY_LIMIT, "50")), "getSearchResult" + str).filter(new qcj() { // from class: l.qnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.pkSuggestedAnchors));
            }
        }).map(new qcj() { // from class: l.rnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.pkSuggestedAnchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: U6 */
    public static C22421c<BLiveEnvelope> m72540U6(String str, String str2) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/blacklist/" + str2)).m182288p().m182301d(), "cancelDeFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: U7 */
    public static C22421c<BLiveMultiCall> m72541U7(String str) {
        return m72447K3(str, "unmute");
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ BLiveStormDanmaku m72543V0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ BLivePk m72545V2(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: V3 */
    public static C22421c<BLiveMultiCall> m72546V3(String str) {
        return m72414G6(str, "cancelLeadRole");
    }

    /* JADX INFO: renamed from: V4 */
    public static C22421c<BLiveData> m72547V4(String str) {
        return vrv.m202547h(rnl.m182265r(zvr.m221809i("/" + str + "/guard-anchor-leaderboards")), "getGuardLeaderBoards").map(new qcj() { // from class: l.wmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: V5 */
    public static C22421c<List<BLiveVoiceSettle>> m72548V5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + str + "/settles")).m182288p().m182300c("states", BLiveVoiceVirtualRoomSettleItem.STATE_SETTLED).m182301d(), "getSettledMembers" + str).map(new qcj() { // from class: l.tkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceSettles;
            }
        });
    }

    /* JADX INFO: renamed from: V6 */
    public static C22421c<BLiveEnvelope> m72549V6(String str) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221804d(str + "/redPacketEvents/counter"), new st0[0]), "getFanbaseReddots", "");
    }

    /* JADX INFO: renamed from: V7 */
    public static C22421c<List<BLiveStickerMetaDataItem>> m72550V7(String... strArr) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-sticker-templates")).m182288p();
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
        c19886aM182288p.m182300c("ids", sb.toString());
        return vrv.m202547h(c19886aM182288p.m182301d(), "updateLiveStickerMetadata").map(new qcj() { // from class: l.oov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplates;
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ BLiveDownChestRewardInfo m72552W0(BLiveEnvelope bLiveEnvelope) {
        List<BLiveDownChestRewardInfo> list = bLiveEnvelope.data.chestRewardInfo;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return bLiveEnvelope.data.chestRewardInfo.get(0);
    }

    /* JADX INFO: renamed from: W3 */
    public static C22421c<BLivePkInvite> m72555W3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pk-invites/" + str)), "cancelPkInvite" + str, "{\n  \"state\": \"canceled\"\n}").map(new qcj() { // from class: l.yjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72427I1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W4 */
    public static C22421c<BLiveData> m72556W4(String str, String str2) {
        rnl.C19886a c19886aM182300c = rnl.m182265r(zvr.m221809i("/" + str + "/user-guard-infos")).m182288p().m182300c("roomId", str2);
        c19886aM182300c.m182300c("with", "users");
        return vrv.m202547h(c19886aM182300c.m182301d(), "getGuardInfo").map(new qcj() { // from class: l.ymv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: W5 */
    public static C22421c<BLiveSignInDetail> m72557W5() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/tricks/sign-in/detail")), "SignInDetail").map(new qcj() { // from class: l.zkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInDetails;
            }
        }).filter(new qcj() { // from class: l.alv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).map(new qcj() { // from class: l.blv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72535U1((List) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.clv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72481O1((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W6 */
    public static C22421c<BLiveEnvelope> m72558W6(String str, String str2) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + str + "/users/" + str2 + "/settle")).m182288p().m182301d(), "removeSettle", "");
    }

    /* JADX INFO: renamed from: W7 */
    public static C22421c<BLiveCall> m72559W7(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-switch-to-video-canceled").m182301d(), "deputyGoBack", "").filter(new qcj() { // from class: l.hov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.jov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: X3 */
    public static C22421c<BLivePkSeek> m72564X3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pk-seeks/" + str)), "cancelPkSeek" + str, "{\n  \"state\": \"canceled\"\n}").map(new qcj() { // from class: l.dkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72696m0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public static C22421c<ugd0> m72565X4(BLiveAbsData bLiveAbsData) {
        return vrv.m202547h(rnl.m182263l(zvr.m221806f("?" + bLiveAbsData.requestExtra)), "request_suggested_live" + bLiveAbsData.f45171id).flatMap(new qcj() { // from class: l.nkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveEnvelope bLiveEnvelope = (BLiveEnvelope) obj;
                return psd0.m173625r(C22421c.just(bLiveEnvelope.data.lives.get(0).source), LivingNormalApiProvider.m72647g5(bLiveEnvelope.data.lives.get(0)), new rcj() { // from class: l.zmv
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return jyb.m147494Y((String) obj2, (ugd0) obj3);
                    }
                });
            }
        }).map(new qcj() { // from class: l.okv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72581Z2((pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X5 */
    public static C22421c<BLiveStormDanmaku> m72566X5(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/gift/storm-comment/resources")).m182288p().m182300c("anchorId", str).m182300c("fakeId", eb20.m120149b() ? eb20.m120148a() : "").m182300c("liveId", str2).m182300c("roomId", str3).m182300c(MatchFrom.scenario, "live").m182301d(), "getStormDanmaku").map(new qcj() { // from class: l.vjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.stormComment;
            }
        }).onErrorReturn(new qcj() { // from class: l.wjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72543V0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X6 */
    public static C22421c<BLiveMultiCall> m72567X6(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-calls/" + str)).m182288p().m182300c("state", "success").m182301d(), "reportCallSuccess", "").filter(new qcj() { // from class: l.onv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new qcj() { // from class: l.pnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: X7 */
    public static C22421c<BLivePush> m72568X7() {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/user-live-push")).m182288p().m182300c("type", "multi-call").m182301d(), "userLivePush", "").map(new qcj() { // from class: l.dmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLivePush;
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ hcr m72571Y1(BLiveEnvelope bLiveEnvelope) {
        return new hcr(bLiveEnvelope, true);
    }

    /* JADX INFO: renamed from: Y3 */
    public static C22421c<BLive> m72573Y3(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221806f("/" + str + (z ? "?type=pk-start-refresh-stream-address" : "?type=pk-stop-refresh-stream-address"))), "changePkStreamAddress" + str, "").map(new qcj() { // from class: l.ckv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public static C22421c<BLiveEnvelope> m72574Y4(String str, String str2, String str3, String str4, String str5) {
        return m72583Z4(str, str2, str3, null, str4, str5);
    }

    /* JADX INFO: renamed from: Y5 */
    public static C22421c<PkFriendInfo> m72575Y5() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/anchors")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-unmatched").m182300c("with", "lives,users").m182301d(), "getSuggestPkAnchor").map(new qcj() { // from class: l.omv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72589a1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y6 */
    public static C22421c<BLiveCall> m72576Y6(String str, boolean z, ConnectType connectType) {
        String str2;
        int i = C12772a.f48534a[connectType.ordinal()];
        if (i != 1) {
            str2 = i != 2 ? null : "voice-";
        } else {
            str2 = "video-";
        }
        String str3 = z ? "success" : "fail";
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("state", str2 + str3).m182301d(), "reportConnect", "").filter(new qcj() { // from class: l.lnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.nnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Y7 */
    public static C22421c<BLiveCall> m72577Y7(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-switch-to-video-ready").m182301d(), "deputyGoBack", "").filter(new qcj() { // from class: l.kov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.lov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ uxj0 m72578Z(List list) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135152L(list);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ Boolean m72579Z0(Throwable th) {
        bf10.m103834j(th);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m72580Z1(BLiveEnvelope bLiveEnvelope) {
        BLiveGiftStarBoard bLiveGiftStarBoardNew_ = bLiveEnvelope.data.giftStar;
        if (bLiveGiftStarBoardNew_ == null) {
            bLiveGiftStarBoardNew_ = BLiveGiftStarBoard.new_();
        }
        ((hiv) zrv.m221194l(htd0.f111521c)).f110077h.m137019l(bLiveGiftStarBoardNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ ugd0 m72581Z2(pf60 pf60Var) {
        ugd0 ugd0Var = (ugd0) pf60Var.f152157b;
        ((BLive) ugd0Var.f138293c).source = (String) pf60Var.f152156a;
        return ugd0Var;
    }

    /* JADX INFO: renamed from: Z3 */
    public static boolean m72582Z3(List<?> list) {
        return (list == null || list.size() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: Z4 */
    public static C22421c<BLiveEnvelope> m72583Z4(String str, String str2, String str3, @Nullable String str4, String str5, String str6) {
        String str7;
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/rooms/" + str + "/members/" + str2));
        c19886aM68490m.m182300c("source", str3);
        if (!TextUtils.isEmpty(str4)) {
            c19886aM68490m.m182300c("recommendInfo", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            c19886aM68490m.m182300c("exposureType", str5);
        }
        if (eb20.m120149b()) {
            str7 = "{\"fakeId\": \"" + eb20.m120148a() + "\"}";
        } else {
            str7 = "";
        }
        c19886aM68490m.m182300c("sessionId", str6);
        return vrv.m202559t(c19886aM68490m.m182301d(), "getInRoom" + str, str7);
    }

    /* JADX INFO: renamed from: Z5 */
    public static C22421c<BLive> m72584Z5(String str, String str2) {
        return vrv.m202547h(rnl.m182263l(zvr.m221806f("")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "swipe-in-room").m182300c("source", str).m182300c("recommend-category", str2).m182300c(Constants.KEY_LIMIT, "1").m182301d(), "getSuggestedLiveForFloatWindow").filter(new qcj() { // from class: l.eov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.fov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.lives;
            }
        }).map(new qcj() { // from class: l.gov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72776v((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z6 */
    public static C22421c<BLiveEnvelope> m72585Z6(BLiveChatReport bLiveChatReport, String str) {
        return vrv.m202544e(rnl.m182263l(zvr.m221809i("/" + str + "/livechat-reports")), "userReport", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: Z7 */
    public static String m72586Z7(String str) {
        return zvr.m221802b("/users/" + str + "/verifications/" + str);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ PkFriendInfo m72589a1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new PkFriendInfo(bLiveData.users, bLiveData.lives, bLiveData.anchors);
    }

    /* JADX INFO: renamed from: a4 */
    public static C22421c<BLiveFirstRechargeStatus> m72592a4(String str, String str2) {
        String strM120148a = eb20.m120148a();
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/campaigns/first_recharge/status")).m182288p().m182300c("roomId", str2).m182300c("anchorId", str);
        if (TextUtils.isEmpty(strM120148a)) {
            strM120148a = "";
        }
        return vrv.m202547h(c19886aM182300c.m182300c("fakeId", strM120148a).m182301d(), "checkHasFirstRecharge").map(new qcj() { // from class: l.sqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.firstRechargeStatus;
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public static C22421c<uxj0> m72593a5() {
        htd0<hiv> htd0Var = htd0.f111521c;
        return (((hiv) zrv.m221194l(htd0Var)).m135159k() == null || ((hiv) zrv.m221194l(htd0Var)).m135159k().size() <= 0) ? vrv.m202547h(rnl.m182263l(zvr.m221802b("/family/family-medals")).m182288p().m182301d(), "getIntlFamilyMedals").map(new qcj() { // from class: l.rmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.familyMedals;
            }
        }).map(new qcj() { // from class: l.smv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72678k0((List) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: a6 */
    public static C22421c<BLiveTopChatMessage> m72594a6(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/topChat/rooms/" + str)), "getTopChatMessageDetail").map(new qcj() { // from class: l.npv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveTopChatMessage;
            }
        });
    }

    /* JADX INFO: renamed from: a7 */
    public static C22421c<BLiveEnvelope> m72595a7(BLiveChatReport bLiveChatReport) {
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/anchor-reports")), "userReportForAnchor", bLiveChatReport.toJson());
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ List m72600b3(final BLiveEnvelope bLiveEnvelope) {
        jyb.m147537z(bLiveEnvelope.data.multiCallInvites, new y20() { // from class: l.tqv
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveMultiCallInvite bLiveMultiCallInvite = (BLiveMultiCallInvite) obj;
                bLiveMultiCallInvite.followship = (Followship) jyb.m147529r(bLiveEnvelope.data.followships, new qcj() { // from class: l.jjv
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCallInvite.toUserId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCallInvites;
    }

    /* JADX INFO: renamed from: b4 */
    public static C22421c<uxj0> m72601b4(boolean z) {
        String string = rnl.m182265r(zvr.m221802b(z ? "/anchor-daily-task-counters" : "/user-daily-task-counters")).m182288p().m182300c("action", "clear-complete-task-red-dot").m182301d().toString();
        return vrv.m202541b(rnl.m182263l(string), string, "").map(new qcj() { // from class: l.dlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static C22421c<uxj0> m72602b5() {
        htd0<hiv> htd0Var = htd0.f111521c;
        return (((hiv) zrv.m221194l(htd0Var)).m135163o() == null || ((hiv) zrv.m221194l(htd0Var)).m135163o().size() <= 0) ? vrv.m202547h(rnl.m182263l(zvr.m221802b("/voiceFanbase/medals")).m182288p().m182301d(), "getIntlVoiceFanBaseMedals").map(new qcj() { // from class: l.wlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceFanbaseMedals;
            }
        }).map(new qcj() { // from class: l.xlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72578Z((List) obj);
            }
        }) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: b6 */
    public static C22421c<BLiveSuperChatDetail> m72603b6(boolean z, String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/superChat/" + (z ? "topChat" : "shoutingChat") + "/rooms/" + str)), "getTopChatPageDetail").map(new qcj() { // from class: l.plv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.superChatDetail;
            }
        });
    }

    /* JADX INFO: renamed from: b7 */
    public static C22421c<uxj0> m72604b7(oo2 oo2Var, MotionType motionType, long j) {
        String string;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", UUID.randomUUID().toString());
            jSONObject.put("sessionId", oo2Var.m202200x());
            jSONObject.put("type", "bufferStop");
            jSONObject.put("roomId", oo2Var.m202194o());
            jSONObject.put("anchorId", oo2Var.m168526j0());
            jSONObject.put("liveId", oo2Var.m202191k());
            jSONObject.put("userId", zrv.f205799a.m207631D0());
            BLiveAbsData bLiveAbsDataMo183435j = oo2Var.mo183435j();
            if (bLiveAbsDataMo183435j != null) {
                String str = bLiveAbsDataMo183435j.liveMode;
                if (TextUtils.isEmpty(str)) {
                    str = "default";
                }
                jSONObject.put("liveMode", str);
            }
            jSONObject.put("isPk", motionType == MotionType.pk);
            jSONObject.put("isCall", motionType == MotionType.multi_connect);
            jSONObject.put("isMultiCall", motionType == MotionType.multi_call);
            jSONObject.put("timestamp", pzi0.m174454o());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("bufferingTimeDuration", j);
            jSONObject.put("data", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/live-stream-event")), "notifyPullStreamBufferingEnd" + pzi0.m174454o(), string).map(new qcj() { // from class: l.emv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public static C22421c<Boolean> m72610c4(String str) {
        return vrv.m202552m(m72465M3(zrv.f205799a.m207631D0(), "turn-off-multi-call", str), "closeMultiCall", "").map(new qcj() { // from class: l.fpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72654h3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: c5 */
    public static C22421c<v7t> m72611c5(i6t<?, ?> i6tVar) {
        return i6tVar.m213810E2().m168545q1().m98250R().filter(new qcj() { // from class: l.wov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                v7t v7tVar = (v7t) obj;
                return Boolean.valueOf(cd10.f81064P.equals(v7tVar.f182819c) && bf10.m103836l(v7tVar.f182817a));
            }
        });
    }

    /* JADX INFO: renamed from: c6 */
    public static C22421c<BLiveMultiCall> m72612c6(String str) {
        return m72447K3(str, "go-away");
    }

    /* JADX INFO: renamed from: c7 */
    public static C22421c<BLiveEnvelope> m72613c7(String str, String str2, String str3, String str4, String str5) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("liveId", str);
        jsonObject.addProperty("roomId", str2);
        jsonObject.addProperty("anchorId", str3);
        jsonObject.addProperty("errorType", str4);
        jsonObject.addProperty("message", str5);
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/video-stream-event")).m182288p().m182301d(), "reportStreamEvent" + str, jsonObject.toString());
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ j2s m72616d1(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new j2s(bLiveData.calls, bLiveData.users);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ BLive m72618d3(BLiveEnvelope bLiveEnvelope) {
        ((civ) zrv.m221194l(htd0.f111524f)).m109951C(bLiveEnvelope.data.intlConfig.switchStar);
        return bLiveEnvelope.data.lives.get(0);
    }

    /* JADX INFO: renamed from: d4 */
    public static C22421c<BLiveMultiCall> m72619d4(String str) {
        return m72447K3(str, "come-back");
    }

    /* JADX INFO: renamed from: d5 */
    public static void m72620d5(String str, final String str2) {
        rnl.C19886a c19886aM182300c = rnl.m182265r(zvr.m221802b("/anchor/" + str + "/knights")).m182288p().m182300c("source", LoveLetterGroupState.entrance).m182300c("with", "users");
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182300c.m182300c("util", str2);
        }
        vrv.m202547h(c19886aM182300c.m182301d(), "getKnightsEntry").map(new qcj() { // from class: l.wqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72697m1((BLiveEnvelope) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.yqv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72526T1(str2, (BLiveData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d6 */
    public static C22421c<BLiveEnvelope> m72621d6(String str, String str2, String str3, String str4) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221802b("/users/" + str + "/grab-live-red-packets/" + str2 + "/fanbases/" + str3 + "?token=" + str4), new st0[0]), "grabRedPacket" + str3 + str + str2, "").filter(new qcj() { // from class: l.fkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.redPacketGrabResult != null);
            }
        });
    }

    /* JADX INFO: renamed from: d7 */
    public static C22421c<BLiveEnvelope> m72622d7(String str, String str2, String str3) {
        rnl rnlVarM182301d = LiveApiBuilder.m68490m(zvr.m221802b("/streaming-heartbeat")).m182301d();
        long jM174454o = pzi0.m174454o();
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
        jSONObject.put("uploadTime", (Object) Long.valueOf(jM174454o));
        return vrv.m202544e(rnlVarM182301d, "reportStreamingHeartBeat" + jM174454o, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ BLivePkInvite m72624e0(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        final BLivePkInvite bLivePkInvite = bLiveEnvelope.data.pkInvites.get(0);
        bLivePkInvite.userInfo = (User) jyb.m147529r(bLiveEnvelope.data.users, new qcj() { // from class: l.vnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((User) obj).f56859id));
            }
        });
        bLivePkInvite.live = (BLive) jyb.m147529r(bLiveEnvelope.data.lives, new qcj() { // from class: l.wnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLivePkInvite.owner, ((BLive) obj).anchor.f45267id));
            }
        });
        return bLivePkInvite;
    }

    /* JADX INFO: renamed from: e4 */
    public static C22421c<BaseLiveBean> m72628e4(String str) {
        return vrv.m202554o(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-groups"), new st0[0]), "createFansGroup", "", h9t.m134085b(BaseLiveBean.class));
    }

    /* JADX INFO: renamed from: e5 */
    public static C22421c<BLiveEnvelope> m72629e5(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221809i("/me/leaderboards/" + str), st0.m187803a("start", "0"), st0.m187803a("end", "99"), st0.m187803a("scopeId", str2), st0.m187803a("withFollowship", "true"), st0.m187803a("withLiveState", "true"), st0.m187803a("withFanBaseMedal", "true"), st0.m187803a("withHierarchy", "true")), "fanleaderboard" + str);
    }

    /* JADX INFO: renamed from: e6 */
    public static C22421c<BLiveMultiCall> m72630e6(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-calls/" + str)).m182288p().m182300c("action", "hang-up").m182300c("hangUpReason", str2).m182301d(), "hangUpCall", "").filter(new qcj() { // from class: l.qpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.multiCalls));
            }
        }).map(new qcj() { // from class: l.bqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCalls.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: e7 */
    public static C22421c<pf60<BLivePk, List<User>>> m72631e7(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/pks/" + str)).m182288p().m182300c("with", "users").m182301d(), "requesetPk" + str).map(new qcj() { // from class: l.wiv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72428I2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m72633f0(Throwable th) {
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ BLivePk m72636f3(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: f4 */
    public static C22421c<BLive> m72637f4(String str, boolean z, String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/rooms/" + str + "/lives")).m182288p().m182300c("push", String.valueOf(z)).m182300c("osVersion", Build.VERSION.RELEASE).m182300c("source", str3);
        if ("obs".equals(str2)) {
            c19886aM182300c.m182300c("mode", "start");
        } else {
            c19886aM182300c.m182300c("mode", "prepare");
        }
        c19886aM182300c.m182300c("liveMode", str2);
        return vrv.m202544e(c19886aM182300c.m182301d(), "createLive", "").filter(new qcj() { // from class: l.jlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.lives));
            }
        }).map(new qcj() { // from class: l.klv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72618d3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f5 */
    public static C22421c<BLiveEnvelope> m72638f5(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3) {
        String strConcat = (z ? "anchor" : "audience").concat(z2 ? "-caller" : "");
        if (z3 && (z || z2)) {
            strConcat = "multiUser";
        }
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-bottomMenu")).m182288p().m182300c("officialShowAnchorId", str3).m182300c("roomId", str).m182300c("userType", strConcat).m182300c("fakeId", eb20.m120149b() ? eb20.m120148a() : "").m182300c("liveMode", str2);
        if (z3) {
            if (z4) {
                if (z) {
                    c19886aM182300c.m182300c("multiCallRole", Owner.TYPE);
                } else {
                    c19886aM182300c.m182300c("multiCallRole", "audience");
                }
            } else if (z) {
                c19886aM182300c.m182300c("multiCallRole", "anchor");
            } else {
                c19886aM182300c.m182300c("multiCallRole", "audience");
            }
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "getLiveBottomButtonsAndBubblesConfig_" + c19886aM182300c.m182301d().toString() + str3);
    }

    /* JADX INFO: renamed from: f6 */
    public static C22421c<List<BLiveCall>> m72639f6(String str, boolean z, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", z ? "anchor-hang-up" : "user-hang-up").m182300c("hangupReason", str2).m182301d(), "hangUpVoiceCall", "").filter(new qcj() { // from class: l.mkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.calls));
            }
        }).map(new qcj() { // from class: l.xkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: f7 */
    public static void m72640f7() {
        vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-bubble-config")), "getBubbleConfig").subscribe(dhw.m115826e(new y20() { // from class: l.dpv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72363B0((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.epv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72633f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m72641g(boolean z, BLiveEnvelope bLiveEnvelope) {
        return z ? bLiveEnvelope.data.anchorDailyTasks : bLiveEnvelope.data.userDailyTasks;
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ uxj0 m72643g1(Throwable th) {
        nsh0.m164608j("[live]verification", "patchVoiceLiveVerification has error " + th.toString());
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ BLiveRoom m72644g2(List list) {
        return (BLiveRoom) list.get(0);
    }

    /* JADX INFO: renamed from: g4 */
    public static C22421c<BLivePkInvite> m72646g4(String str, BLivePkInviteSource bLivePkInviteSource, boolean z) {
        String strM221802b = zvr.m221802b("/pk-invites");
        BLivePkInvite bLivePkInvite = new BLivePkInvite();
        bLivePkInvite.isOnceMore = z;
        bLivePkInvite.f45274to = str;
        bLivePkInvite.source = bLivePkInviteSource;
        return vrv.m202555p(rnl.m182263l(strM221802b), "inviteFriend", bLivePkInvite.toJson()).map(new qcj() { // from class: l.yiv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72652h1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public static C22421c<ugd0> m72647g5(BLiveAbsData bLiveAbsData) {
        return m72665i5(bLiveAbsData.f45171id, true, true, "0", bLiveAbsData.callback);
    }

    /* JADX INFO: renamed from: g6 */
    public static C22421c<BLiveMultiCallSwitchToLeadRoleInvite> m72648g6(String str, String str2, String str3, String str4) {
        String strM221802b = zvr.m221802b("/multi-call-switch-to-lead-role-invite");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("ownerUserId", str);
        jsonObject.addProperty("ownerCallId", str2);
        jsonObject.addProperty("toUserId", str3);
        jsonObject.addProperty("toCallId", str4);
        return vrv.m202555p(rnl.m182263l(strM221802b), "inviteUserToBeLeadRole", jsonObject.toString()).map(new qcj() { // from class: l.elv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSwitchToLeadRoleInvite;
            }
        });
    }

    /* JADX INFO: renamed from: g7 */
    public static C22421c<BLiveEnvelope> m72649g7(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live/fake-user/" + str + "/profile")), "live/fake-user/" + str + "/profile");
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ BLivePkInvite m72652h1(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ Boolean m72654h3(BLiveEnvelope bLiveEnvelope) {
        BLiveMultiCallAsset bLiveMultiCallAsset = bLiveEnvelope.data.multiCallAsset;
        return Boolean.valueOf(bLiveMultiCallAsset != null && bLiveMultiCallAsset.multiCallSwitch);
    }

    /* JADX INFO: renamed from: h4 */
    public static C22421c<BLivePkSeek> m72655h4(int i) {
        String str;
        if (i == 3) {
            str = "{\n  \"category\": \"bounty\"\n}";
        } else {
            str = i == 4 ? "{\n  \"category\": \"rank\"\n}" : "";
        }
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/pk-seeks")), "createPkSeek", str).map(new qcj() { // from class: l.flv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72499Q1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h5 */
    public static C22421c<ugd0> m72656h5(String str) {
        return m72683k5(str);
    }

    /* JADX INFO: renamed from: h6 */
    public static C22421c<BLiveEnvelope> m72657h6(String str, String str2) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + str + "/users/" + str2 + "/invite-settle")).m182288p().m182301d(), "inviteSettle", "");
    }

    /* JADX INFO: renamed from: h7 */
    public static C22421c<BLiveEnvelope> m72658h7(String str, String str2) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221806f("/" + str + "/leaderboard"));
        c19886aM68490m.m182300c("roomId", str2);
        c19886aM68490m.m182300c("source", "live");
        if (eb20.m120149b()) {
            c19886aM68490m.m182300c("fakeId", eb20.m120148a());
        }
        return vrv.m202562w(c19886aM68490m.m182301d(), "requestLeaderBoards").doOnNext(new y20() { // from class: l.xov
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144725l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public static /* synthetic */ j7u m72662i2(BLiveSuggestLive bLiveSuggestLive) {
        return new j7u(bLiveSuggestLive.f45298id, BLiveState.get(bLiveSuggestLive.state));
    }

    /* JADX INFO: renamed from: i4 */
    public static C22421c<BLiveRoom> m72664i4(BLiveRoom bLiveRoom) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/rooms")), "createRoom", bLiveRoom.toJson()).map(new qcj() { // from class: l.kqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72356A2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i5 */
    public static C22421c<ugd0> m72665i5(String str, final boolean z, boolean z2, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            nsh0.m164608j("[live][trace_problem]", Log.getStackTraceString(new Throwable("liveId is Null")));
            return C22421c.error(new Exception("liveId can't be null"));
        }
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221806f("/" + str)).m182288p().m182300c(BLiveOperationActionAfterCountdown.refresh, String.valueOf(z2)).m182300c("errcode", String.valueOf(str2));
        if (z) {
            c19886aM182300c.m182300c("with", "rooms,users,followships,relationships,live-stickers,fanbases,fanbase-relations");
        }
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("callback", str3);
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), "getLiveInfo" + str).filter(new qcj() { // from class: l.spv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72752s2(z, (BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.tpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72438J3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i6 */
    public static C22421c<BLiveMultiCall> m72666i6(String str) {
        return m72447K3(str, "inviteSwitchToVideo");
    }

    /* JADX INFO: renamed from: i7 */
    public static C22421c<BLiveEnvelope> m72667i7(String str, int i) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/members")).m182288p().m182300c("with", "users,followships").m182300c(Constants.KEY_LIMIT, String.valueOf(i)).m182301d(), "requestMembers").doOnNext(new y20() { // from class: l.lmv
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144725l(((BLiveEnvelope) obj).data.users);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BLiveRoom m72668j(BLiveEnvelope bLiveEnvelope) {
        List<BLiveRoom> list = bLiveEnvelope.data.rooms;
        return !jyb.m147479J(list) ? list.get(0) : BLiveRoom.new_();
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ BLive m72670j1(BLive bLive) {
        if (bLive.isMultiCall()) {
            bf10.m103803I(bLive.multiCallInfo.role, bLive.f45171id);
        }
        return bLive;
    }

    /* JADX INFO: renamed from: j2 */
    public static /* synthetic */ Integer m72671j2(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.fanbaseRedPacketEventCounters)) {
            return 0;
        }
        return Integer.valueOf(bLiveEnvelope.data.fanbaseRedPacketEventCounters.get(0).unreadCount);
    }

    /* JADX INFO: renamed from: j4 */
    public static C22421c<uxj0> m72673j4(String str, String str2, boolean z) {
        return vrv.m202549j(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-stickers/" + str2)).m182288p().m182300c("replace", String.valueOf(z)).m182301d(), "deleteSticker" + str, "").map(new qcj() { // from class: l.wpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: j5 */
    public static C22421c<ugd0> m72674j5(BLive bLive, String str) {
        return m72665i5(bLive.f45171id, true, true, str, bLive.callback);
    }

    /* JADX INFO: renamed from: j6 */
    public static C22421c<List<BLiveCall>> m72675j6(String str) {
        return vrv.m202552m(rnl.m182263l(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "anchor-switch-to-video-invited").toString()), "inviteVideoCall", "").map(new qcj() { // from class: l.bmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: j7 */
    public static C22421c<BLiveEnvelope> m72676j7(boolean z, String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/rooms/" + str2 + "/messages")).m182288p().m182300c("live", str).m182301d(), "requestMessages");
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ uxj0 m72678k0(List list) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135151K(list);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: k2 */
    public static /* synthetic */ BLiveDanmakuList m72680k2(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ LiveRoomSuggestBean m72681k3(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new LiveRoomSuggestBean(bLiveData.suggestedLives, bLiveData.liveQuitPopup);
    }

    /* JADX INFO: renamed from: k4 */
    public static C22421c<List<BLiveCall>> m72682k4(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-go-away").m182301d(), "deputyGoAway", "").map(new qcj() { // from class: l.jrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: k5 */
    public static C22421c<ugd0> m72683k5(String str) {
        return m72665i5(str, true, true, "0", null);
    }

    /* JADX INFO: renamed from: k6 */
    public static C22421c<BLiveEnvelope> m72684k6(String str, String str2) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221804d(str + "/users/" + str2), new st0[0]), "joinFanBases" + str + str2, "");
    }

    /* JADX INFO: renamed from: k7 */
    public static C22421c<List<BLiveCommonViewConfig>> m72685k7() {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/campaigns/previews"), new st0[0]), "requestPkPreviews").map(new qcj() { // from class: l.nlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.previews;
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ ubu m72690l3(BLiveEnvelope bLiveEnvelope) {
        return new ubu(bLiveEnvelope.data.suggestedLives, bLiveEnvelope.pagination);
    }

    /* JADX INFO: renamed from: l4 */
    public static C22421c<List<BLiveCall>> m72691l4(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-come-back").m182301d(), "deputyGoBack", "").map(new qcj() { // from class: l.ikv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public static C22421c<ubu> m72692l5(String str, String str2, @Nullable String str3, int i, String str4, boolean z, @Nullable String str5, boolean z2) {
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
                strReplaceAll = f48532a.matcher(strReplaceAll).replaceAll("&limit=" + i);
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
        sb.append(rnl.m182263l(zvr.m221802b(z2 ? "/feed/recommend/lives" : "/tiny/lives")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, str).m182300c("source", str2).m182300c("with", "rooms,users").toString());
        sb.append(strReplaceAll);
        return vrv.m202547h(rnl.m182263l(sb.toString()), "getLiveListV2" + str + str2 + strReplaceAll).map(new qcj() { // from class: l.xnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72690l3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l6 */
    public static C22421c<BLivePk> m72693l6(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pks/" + str)).m182288p().m182300c("action", "join").m182301d(), "joinPk" + str, "").map(new qcj() { // from class: l.zjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72636f3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l7 */
    public static C22421c<BLivePkSummary> m72694l7() {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221802b("/pk-summaries"), new st0[0]), "requestPkSummaries").map(new qcj() { // from class: l.llv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72408G0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m72695m(String str, String str2, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 41027) {
                o1j0.m165636j(str);
                return;
            } else if (i == 41025) {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f48400u));
                return;
            }
        }
        o1j0.m165636j(str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ BLivePkSeek m72696m0(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkSeeks)) {
            return null;
        }
        return bLiveEnvelope.data.pkSeeks.get(0);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ BLiveData m72697m1(BLiveEnvelope bLiveEnvelope) {
        ((hiv) zrv.m221194l(htd0.f111521c)).f110076g = bLiveEnvelope.pagination;
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: m4 */
    public static C22421c<BLiveEnvelope> m72700m4(String str) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-recall"), new st0[0]), "doInvitationRequest", "");
    }

    /* JADX INFO: renamed from: m5 */
    public static C22421c<BLiveEnvelope> m72701m5() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/tricks/sign-in/prizes")), "getLivePrizeList");
    }

    /* JADX INFO: renamed from: m6 */
    public static C22421c<uxj0> m72702m6(String str, String str2, String str3) {
        return vrv.m202540a(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/members/" + str2)).m182288p().m182300c("fakeId", str3).m182301d(), "kickOff", "").map(new qcj() { // from class: l.tmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: m7 */
    public static C22421c<BLiveEnvelope> m72703m7(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-officialshow-user/" + str)), "requestOfficialShowRoom" + str);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ wzp m72705n0(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new wzp(bLiveData.callInvites, bLiveData.users);
    }

    /* JADX INFO: renamed from: n4 */
    public static C22421c<BLiveEnvelope> m72709n4(String str, String str2, String str3) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-recall-message"), new st0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userIds", new JSONArray(str2));
            jSONObject.put("content", str3);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202544e(rnlVarM68498u, "doRecallRequest", jSONObject.toString());
    }

    /* JADX INFO: renamed from: n5 */
    public static C22421c<BLivePushLimit> m72710n5(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/push-counters")), "pushCounters" + str).map(new qcj() { // from class: l.kjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).counters.livePushLimit;
            }
        });
    }

    /* JADX INFO: renamed from: n6 */
    public static C22421c<BLivePk> m72711n6(String str, String str2) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pks/" + str)).m182288p().m182300c("action", str2).m182301d(), "joinPk" + str, "").map(new qcj() { // from class: l.arv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72545V2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n7 */
    public static C22421c<BLiveRtcToken> m72712n7(String str, String str2) {
        String strM221802b = zvr.m221802b("/rtc-tokens");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("channel", str);
        jsonObject.addProperty("usage", "multi-call");
        jsonObject.addProperty("rtcProvider", str2);
        return vrv.m202555p(rnl.m182263l(strM221802b), "requestSdkToken", jsonObject.toString()).filter(new qcj() { // from class: l.ukv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(LivingNormalApiProvider.m72582Z3(((BLiveEnvelope) obj).data.rtcTokens));
            }
        }).map(new qcj() { // from class: l.vkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ ArrayList m72713o(BLiveEnvelope bLiveEnvelope) {
        return new ArrayList(jyb.m147486Q(bLiveEnvelope.data.managers, new qcj() { // from class: l.cov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveMember) obj).reference;
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public static C22421c<BFansBaseRecall> m72718o4(String str) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221801a(str + "/fanbase-recall"), new st0[0]), "RequestFansRecall").map(new qcj() { // from class: l.mov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72515S((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o5 */
    public static C22421c<BLiveStickerMetaData> m72719o5() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-sticker-templates-metadata")), "liveStickerMetaData").map(new qcj() { // from class: l.trv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveStickerTemplatesMetadata;
            }
        });
    }

    /* JADX INFO: renamed from: o6 */
    public static void m72720o6(String str) {
        vrv.m202544e(rnl.m182265r(zvr.m221802b("/live-reports")).m182288p().m182301d(), "live-reports", str).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: o7 */
    public static C22421c<BLiveRtcToken> m72721o7(String str, String str2, String str3) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/rtc-tokens")), "requestSdkToken", "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\"}").filter(new qcj() { // from class: l.jpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new qcj() { // from class: l.kpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveAddStickerResult m72722p(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ BLivePk m72723p0(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pks)) {
            return null;
        }
        return bLiveEnvelope.data.pks.get(0);
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ String m72726p3(BLiveEnvelope bLiveEnvelope) {
        return jyb.m147479J(bLiveEnvelope.data.fanbases) ? "" : bLiveEnvelope.data.fanbases.get(0).f45211id;
    }

    /* JADX INFO: renamed from: p4 */
    public static C22421c<List<BLiveDailyTasks>> m72727p4(final boolean z, String str, String str2, String str3, String str4) {
        String str5 = z ? "/anchor-daily-tasks" : "/user-daily-tasks";
        return vrv.m202541b(rnl.m182265r(zvr.m221802b("/users/" + zrv.f205799a.m207631D0() + str5)).m182288p().m182300c("action", str4).m182300c("taskId", str).m182300c("taskDate", str2).m182300c("delta", str3).m182301d(), zvr.m221802b("/users/" + zrv.f205799a.m207631D0() + str5), "").map(new qcj() { // from class: l.cnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72641g(z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p5 */
    public static C22421c<BLiveEnvelope> m72728p5(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221806f("/" + str + "/summaries")), "getLiveSummaries" + str);
    }

    /* JADX INFO: renamed from: p6 */
    public static C22421c<ArrayList<String>> m72729p6(final String str, String str2, boolean z) {
        C22421c<BLiveEnvelope> c22421cM202540a;
        final String string;
        final String string2;
        rnl rnlVarM182263l = rnl.m182263l(zvr.m221802b("/rooms/" + str + "/managers/" + str2));
        if (z) {
            c22421cM202540a = vrv.m202546g(rnlVarM182263l, "manageRoomManager", "");
            string = zrv.f205803e.getString(R$string.f48072f0);
            string2 = zrv.f205803e.getString(R$string.f48094g0);
        } else {
            c22421cM202540a = vrv.m202540a(rnlVarM182263l, "manageRoomManager", "");
            string = zrv.f205803e.getString(R$string.f47910Xb);
            string2 = zrv.f205803e.getString(R$string.f47931Yb);
        }
        final String string3 = zrv.m221193k().m203641hb() > 0 ? String.format(zrv.f205803e.getString(R$string.f48347rc), Integer.valueOf(zrv.m221193k().m203641hb())) : zrv.f205803e.getString(R$string.f47411A6);
        return c22421cM202540a.doOnError(new y20() { // from class: l.znv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72695m(string3, string, (Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.aov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72362B(string2, str, (BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.bov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72713o((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public static C22421c<BLiveRtcToken> m72730p7(String str, String str2, String str3, String str4, String str5) {
        String str6 = "{\"channel\": \"" + str + "\", \"usage\":\"" + str2 + "\" , \"rtcProvider\":\"" + str3 + "\" , \"eventType\":\"" + str4 + "\" , \"role\":\"" + str5 + "\"}";
        return vrv.m202557r(rnl.m182263l(zvr.m221802b("/rtc-tokens")), "requestRtcToken" + str, str6).filter(new qcj() { // from class: l.glv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.rtcTokens.size() > 0);
            }
        }).map(new qcj() { // from class: l.hlv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public static C22421c<uxj0> m72736q4(String str, String str2, String str3) {
        return vrv.m202546g(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/jailedlist/" + str2)), "forbiddenWords" + str2, BLiveFakeIdRequestBody.getFakeIdBody(str3)).map(new qcj() { // from class: l.olv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: q5 */
    public static C22421c<User> m72737q5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-users/" + str)).m182288p().m182300c("with", "followships,relationships").m182301d(), "live-users/" + str).map(new qcj() { // from class: l.mqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72778v1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q6 */
    public static C22421c<uxj0> m72738q6(String str, String str2, com.alibaba.fastjson.JSONObject jSONObject) {
        return vrv.m202541b(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-stickers/" + str2)), "modifySticker" + str, jSONObject.toString()).map(new qcj() { // from class: l.rrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).onErrorReturn(new qcj() { // from class: l.srv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: q7 */
    public static C22421c<zc50> m72739q7(String str) {
        return vrv.m202562w(LiveApiBuilder.m68498u(zvr.m221802b("/lives/" + str + "/official-shows"), new st0[0]), "requestShowInfo" + str).map(new qcj() { // from class: l.fjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72527T2((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m72740r(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdentity bLiveIdentity;
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return Boolean.valueOf((bLiveIdCardVerificationInfo != null && TEnum.equals(bLiveIdCardVerificationInfo.status, "verified")) || ((bLiveIdentity = bLiveVerificationCenter.identity) != null && "idCard".equals(bLiveIdentity.certificate.type) && TEnum.equals(bLiveVerificationCenter.identity.status, "verified")));
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ List m72741r0(final BLiveEnvelope bLiveEnvelope) {
        jyb.m147537z(bLiveEnvelope.data.multiCalls, new y20() { // from class: l.brv
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveMultiCall bLiveMultiCall = (BLiveMultiCall) obj;
                bLiveMultiCall.followship = (Followship) jyb.m147529r(bLiveEnvelope.data.followships, new qcj() { // from class: l.akv
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Followship) obj2).otherUser.equals(bLiveMultiCall.userId));
                    }
                });
            }
        });
        return bLiveEnvelope.data.multiCalls;
    }

    /* JADX INFO: renamed from: r2 */
    public static /* synthetic */ BLivePkInvite m72743r2(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.pkInvites)) {
            return null;
        }
        return bLiveEnvelope.data.pkInvites.get(0);
    }

    /* JADX INFO: renamed from: r4 */
    public static C22421c<BLiveSignInAchievementMedals> m72745r4() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/tricks/sign-in/achievement-medals")), "getAchievementMedals").map(new qcj() { // from class: l.dnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.signInAchievementMedals;
            }
        }).filter(new qcj() { // from class: l.env
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).map(new qcj() { // from class: l.fnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72470N((List) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.gnv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72525T0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r5 */
    public static C22421c<BLiveMultiPkLeaderboard> m72746r5(String str, String str2, String str3) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-pks/leaderboard?pkId=" + str + "&anchorId=" + str2 + "&fakeId=" + str3)).m182288p().m182301d(), "getMultiPkBoard").map(new qcj() { // from class: l.zqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkLeaderboard;
            }
        });
    }

    /* JADX INFO: renamed from: r6 */
    public static C22421c<BLiveMultiCallSummary> m72747r6(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-calls/" + str + "/summary")).m182288p().m182301d(), "multiCallSummary_" + str).map(new qcj() { // from class: l.ykv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallSummary;
            }
        });
    }

    /* JADX INFO: renamed from: r7 */
    public static void m72748r7(String str, String str2) {
        vrv.m202562w(rnl.m182263l(zvr.m221802b("/leaderboard/gift_star/current")).m182288p().m182300c("anchorId", str).m182300c("liveMode", str2).m182301d(), "requestStarBoard").subscribe(dhw.m115826e(new y20() { // from class: l.xqv
            @Override // p153l.y20
            public final void call(Object obj) {
                LivingNormalApiProvider.m72580Z1((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.irv
            @Override // p153l.y20
            public final void call(Object obj) {
                ((hiv) zrv.m221194l(htd0.f111521c)).f110077h.m137019l(BLiveGiftStarBoard.new_());
            }
        }));
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ Boolean m72751s1(List list) {
        if (jyb.m147479J(list)) {
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
    public static /* synthetic */ Boolean m72752s2(boolean z, BLiveEnvelope bLiveEnvelope) {
        if (z) {
            return Boolean.valueOf((jyb.m147479J(bLiveEnvelope.data.lives) || jyb.m147479J(bLiveEnvelope.data.users)) ? false : true);
        }
        return Boolean.valueOf(!jyb.m147479J(bLiveEnvelope.data.lives));
    }

    /* JADX INFO: renamed from: s3 */
    public static /* synthetic */ Boolean m72753s3(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.verificationCenter)) {
            return Boolean.FALSE;
        }
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveEnvelope.data.verificationCenter.get(0).voiceAnchor;
        return bLiveVerificationAnchor == null ? Boolean.FALSE : Boolean.valueOf(TEnum.equals(bLiveVerificationAnchor.status, "verified"));
    }

    /* JADX INFO: renamed from: s4 */
    public static C22421c<BLiveAddStickerResult> m72754s4(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-stickers")), "getAddedSticker" + str).map(new qcj() { // from class: l.qjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72803y((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static C22421c<BLiveMultiPkPanel> m72755s5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-pk-panel?ownerLiveId=" + str)).m182288p().m182301d(), "getMultiPkPanel").map(new qcj() { // from class: l.lqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkPanel;
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public static C22421c<BLiveMultiPkDetail> m72756s6(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-pk/" + str)).m182288p().m182301d(), "multiPkDetail").map(new qcj() { // from class: l.ojv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPk;
            }
        });
    }

    /* JADX INFO: renamed from: s7 */
    public static C22421c<User> m72757s7(String str, @Nullable String str2) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-users/" + str)).m182288p().m182300c("with", "followships,relationships");
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182300c.m182300c("liveID", str2);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "live-users/" + str + str2).map(new qcj() { // from class: l.bkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72759t0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ User m72759t0(BLiveEnvelope bLiveEnvelope) {
        User user = bLiveEnvelope.data.users.get(0);
        user.localFollowship = jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(user);
        return user;
    }

    /* JADX INFO: renamed from: t4 */
    public static C22421c<BLiveEnvelope> m72763t4(String str) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221801a("/" + str + "/fanbases"), new st0[0]), "getFanbaseAnchor" + str);
    }

    /* JADX INFO: renamed from: t5 */
    public static C22421c<BLiveMultiPkAsset> m72764t5(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + str + "/multi-pk-asset")).m182288p().m182301d(), "getMultiPkSetting").map(new qcj() { // from class: l.jqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiPkAsset;
            }
        });
    }

    /* JADX INFO: renamed from: t6 */
    public static C22421c<BLiveMultiCall> m72765t6(String str) {
        return m72447K3(str, BLiveButtonType.mute);
    }

    /* JADX INFO: renamed from: t7 */
    public static C22421c<BLiveEnvelope> m72766t7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8) {
        return m72775u7(str, str2, str3, str4, str5, str6, str7, str8, null);
    }

    /* JADX INFO: renamed from: u3 */
    public static C22421c<Boolean> m72771u3(String str, Boolean bool, String str2) {
        return vrv.m202552m(m72465M3(str, bool.booleanValue() ? "turn-on-reject-invite" : "turn-off-reject-invite", str2), "acceptInvite_" + bool, "").map(new qcj() { // from class: l.opv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bf10.m103801G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new hpv()).map(new qcj() { // from class: l.ppv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).rejectInvite);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public static C22421c<BLiveAnchor> m72772u4(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/anchors/" + str)), "anchorInfo" + str).filter(new qcj() { // from class: l.krv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.anchors));
            }
        }).map(new qcj() { // from class: l.lrv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchors.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: u5 */
    public static C22421c<List<BLiveVerificationCenter>> m72773u5() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/" + strM207631D0 + "/verifications/" + strM207631D0)), "liveVerification").map(new qcj() { // from class: l.iov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        });
    }

    /* JADX INFO: renamed from: u6 */
    public static C22421c<BLiveEnvelope> m72774u6(String str, String str2) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221804d(str + "/notify"), new st0[0]), "notifyFanbase" + str, str2);
    }

    /* JADX INFO: renamed from: u7 */
    public static C22421c<BLiveEnvelope> m72775u7(String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, @Nullable String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-users2/" + str)).m182288p().m182300c("from", str3).m182300c("to", str4).m182300c("scene", str5).m182300c("source", str6).m182300c("liveId", str2).m182300c("roomId", str7);
        if (!TextUtils.isEmpty(str8)) {
            c19886aM182300c.m182300c("anchorId", str8);
        }
        if (NullChecker.m82486a(bLiveMultiCall)) {
            c19886aM182300c.m182300c("multiCallOwnerRoomId", bLiveMultiCall.ownerRoomId);
            c19886aM182300c.m182300c("multiCallOwnerLiveId", bLiveMultiCall.ownerLiveId);
        }
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            CrashHelper.m82479c(new Exception("requestUserCardAndMedals userId is null   url = " + c19886aM182300c.toString()));
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), "live-users2/" + str + str2 + str3 + str4 + str5 + str6);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ BLive m72776v(List list) {
        return (BLive) list.get(0);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ User m72778v1(BLiveEnvelope bLiveEnvelope) {
        User user = bLiveEnvelope.data.users.get(0);
        user.localFollowship = jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(user);
        return user;
    }

    /* JADX INFO: renamed from: v3 */
    public static C22421c<BLivePkInvite> m72780v3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pk-invites/" + str)), "acceptPkInvite" + str, "{\n  \"state\": \"accepted\"\n}").map(new qcj() { // from class: l.qmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72445K1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v4 */
    public static C22421c<List<BLiveMultiCallInvite>> m72781v4() {
        return m72376C4(cd10.f81051C);
    }

    /* JADX INFO: renamed from: v5 */
    public static C22421c<BLiveEnvelope> m72782v5(String str, String str2, int i, int i2, boolean z) {
        return m72791w5(str, str2, i, i2, z, null);
    }

    /* JADX INFO: renamed from: v6 */
    public static C22421c<uxj0> m72783v6(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221806f("/" + str)), "notifyLiveStreamReady" + str, "{\n  \"state\": \"streamReady\"\n}").map(new qcj() { // from class: l.rpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: v7 */
    public static C22421c<Boolean> m72784v7() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/" + strM207631D0 + "/verifications/" + strM207631D0)).m182288p().m182300c("process", ShareConstants.NEW_VERSION).m182301d(), "voiceLiveVerification").map(new qcj() { // from class: l.pjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72753s3((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ uxj0 m72786w0(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.videoQualities)) {
            ((jfv) zrv.m221194l(htd0.f111520b)).f120642c = bLiveEnvelope.data.videoQualities.get(0);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: w3 */
    public static C22421c<uxj0> m72789w3(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/multi-pk-invites/" + str)).m182288p().m182300c("action", z ? "accept" : "reject").m182301d(), "acceptReStartMultiPk", "").map(new qcj() { // from class: l.wkv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: w4 */
    public static C22421c<List<BLiveMultiCall>> m72790w4(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/multi-calls")).m182288p().m182300c("states", cd10.f81085m).m182300c("liveId", str).m182300c("with", "followships").m182301d(), "getApplyList").map(new qcj() { // from class: l.pov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72741r0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w5 */
    public static C22421c<BLiveEnvelope> m72791w5(String str, String str2, int i, int i2, boolean z, @Nullable String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221809i("/me/leaderboards/" + str)).m182288p().m182300c("start", String.valueOf(i)).m182300c("end", String.valueOf(i2)).m182300c("scopeId", str2).m182300c("withHierarchy", "true");
        if (z) {
            c19886aM182300c.m182300c("withVoiceUserMask", "true");
        }
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("roomId", str3);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "contributeRecords" + str2);
    }

    /* JADX INFO: renamed from: w6 */
    public static C22421c<BLivePk> m72792w6(String str, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pks/" + str + "?action=" + (z ? BLiveButtonType.mute : "unmute"))), "notifyPkAudioMute" + str, "").map(new qcj() { // from class: l.eqv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72723p0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w7 */
    public static C22421c<hcr> m72793w7(String str, String str2, String str3) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221806f("/" + str + "/week-leaderboard")).m182288p();
        c19886aM182288p.m182300c("source", "live");
        c19886aM182288p.m182300c("with", "users");
        c19886aM182288p.m182300c("roomId", str2);
        c19886aM182288p.m182300c("type", str3);
        if (eb20.m120149b()) {
            c19886aM182288p.m182300c("fakeId", eb20.m120148a());
        }
        return vrv.m202562w(c19886aM182288p.m182301d(), "requestWeekLeaderBoard").doOnNext(new y20() { // from class: l.frv
            @Override // p153l.y20
            public final void call(Object obj) {
                ((jfv) zrv.m221194l(htd0.f111520b)).m144725l(((BLiveEnvelope) obj).data.users);
            }
        }).map(new qcj() { // from class: l.grv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72571Y1((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public static C22421c<List<BLiveCall>> m72798x3(String str) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/calls/" + str)).m182288p().m182300c("action", "user-switch-to-video-accepted").m182301d(), "acceptVideoCall", "").map(new qcj() { // from class: l.imv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.calls;
            }
        });
    }

    /* JADX INFO: renamed from: x4 */
    public static C22421c<List<BLiveClarity>> m72799x4(String str) {
        return vrv.m202547h(LiveApiBuilder.m68490m(zvr.m221806f("/" + str + "/clarity-list")).m182301d(), "getArticulationList" + str).map(new qcj() { // from class: l.mmv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveClarityLevelInfos;
            }
        });
    }

    /* JADX INFO: renamed from: x5 */
    public static void m72800x5(String str) {
        htd0<hiv> htd0Var = htd0.f111521c;
        if (!NullChecker.m82486a(((hiv) zrv.m221194l(htd0Var)).f110076g) || TextUtils.isEmpty(((hiv) zrv.m221194l(htd0Var)).f110076g.links.next)) {
            return;
        }
        m72620d5(str, ((hiv) zrv.m221194l(htd0Var)).f110076g.links.next);
    }

    /* JADX INFO: renamed from: x6 */
    public static C22421c<Boolean> m72801x6(String str, Boolean bool, String str2) {
        return vrv.m202552m(m72465M3(str, bool.booleanValue() ? "turn-on-free-call" : "turn-off-free-call", str2), "openFreeCall_" + bool, "").map(new qcj() { // from class: l.gpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bf10.m103801G(((BLiveEnvelope) obj).data.multiCallAsset);
            }
        }).filter(new hpv()).map(new qcj() { // from class: l.ipv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj).freeCall);
            }
        });
    }

    /* JADX INFO: renamed from: x7 */
    public static C22421c<Boolean> m72802x7() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/users/" + strM207631D0 + "/verifications/" + strM207631D0)), "getCallVideoAuth").map(new qcj() { // from class: l.ypv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.verificationCenter;
            }
        }).map(new qcj() { // from class: l.zpv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVerificationCenter) jyb.m147529r((List) obj, new qcj() { // from class: l.mlv
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return LivingNormalApiProvider.m72740r((BLiveVerificationCenter) obj2);
                    }
                })) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ BLiveAddStickerResult m72803y(BLiveEnvelope bLiveEnvelope) {
        List<BLiveAddStickerResult> list = bLiveEnvelope.data.liveStickers;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return bLiveEnvelope.data.liveStickers.get(0);
    }

    /* JADX INFO: renamed from: y1 */
    public static /* synthetic */ List m72805y1(BLiveEnvelope bLiveEnvelope) {
        List<BLiveStickerTemplatesGiftItem> list = bLiveEnvelope.data.liveStickerTemplatesGifts;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: y3 */
    public static C22421c<BLiveEnvelope> m72807y3(String str, String str2) {
        return vrv.m202555p(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/blacklist/" + str2 + "?method=put")).m182288p().m182301d(), "deFriendWithUserId", "");
    }

    /* JADX INFO: renamed from: y4 */
    public static C22421c<List<BLiveMultiCallInvite>> m72808y4() {
        return m72376C4(cd10.f81052D);
    }

    /* JADX INFO: renamed from: y5 */
    public static C22421c<ubu> m72809y5(String str, String str2, String str3, int i, Pagination pagination, String str4, boolean z) {
        return m72692l5(str, str2, str3, i, pagination.links.next, false, str4, z);
    }

    /* JADX INFO: renamed from: y6 */
    public static C22421c<BLiveMultiCallAsset> m72810y6(String str) {
        return vrv.m202552m(m72465M3(zrv.f205799a.m207631D0(), "turn-on-multi-call", str), "openMultiCall", "").map(new qcj() { // from class: l.orv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.multiCallAsset;
            }
        }).filter(new qcj() { // from class: l.prv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveMultiCallAsset) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: y7 */
    public static C22421c<BLiveEnvelope> m72811y7(String str, int i) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221806f("/" + str + "/clarity-level-selected"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put(MatchFrom.selected, (Object) Integer.valueOf(i));
        jSONObject.put("liveId", (Object) str);
        return vrv.m202544e(c19886aM68490m.m182301d(), "selectArticulation" + str + i, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: z3 */
    public static C22421c<BLiveAddStickerResult> m72816z3(String str, com.alibaba.fastjson.JSONObject jSONObject) {
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/rooms/" + str + "/live-stickers")), "addSticker" + str, jSONObject.toString()).map(new qcj() { // from class: l.zov
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72722p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public static C22421c<BLiveEnvelope> m72817z4(String str, String str2) {
        return vrv.m202547h(LiveApiBuilder.m68498u(zvr.m221809i("/" + str + "/fanbases/" + str2 + "/medals"), new st0[0]), "getAudienceMedals" + str + str2);
    }

    /* JADX INFO: renamed from: z5 */
    public static C22421c<BLiveEnvelope> m72818z5(String str) {
        return vrv.m202562w(rnl.m182263l(rnl.m182263l(zvr.m221802b("/anchors")).m182288p().m182300c(FirebaseAnalytics.Event.SEARCH, "pk-suggested-matched").m182300c("with", "lives,users").toString() + "&" + str), "getOnlineAnchorFriend");
    }

    /* JADX INFO: renamed from: z6 */
    public static C22421c<BLiveRoom> m72819z6(String str, BLiveRoom bLiveRoom) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/rooms/" + str)), "patchRoom", bLiveRoom.toJson()).filter(new qcj() { // from class: l.ejv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.rooms));
            }
        }).map(new qcj() { // from class: l.gjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rooms;
            }
        }).map(new qcj() { // from class: l.hjv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LivingNormalApiProvider.m72644g2((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z7 */
    public static C22421c<uxj0> m72820z7(String str, String str2, boolean z) {
        return vrv.m202552m(rnl.m182263l(zvr.m221802b("/pks/" + str)).m182288p().m182300c("action", "punish-select").m182300c("motionId", str2).m182300c("auto", String.valueOf(z)).m182301d(), "selectPkPunish", "").map(new qcj() { // from class: l.viv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
