package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.photon.push.service.PushService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAssets;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSquareSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatSquareBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class jwu {
    /* JADX INFO: renamed from: A */
    public static C22421c<BLiveRandomMatchCouponDetail> m147226A() {
        String string = UUID.randomUUID().toString();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("originalId", string);
        return LiveBaseApi.m68521w(LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/video-chat/random-match-coupon")).m182301d(), jsonObject.toString()).map(new qcj() { // from class: l.ewu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.randomMatchCouponDetail;
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static BLiveGiftExtraInfo m147227B(String str, int i, String str2) {
        BLiveGiftExtraInfo bLiveGiftExtraInfoNew_ = BLiveGiftExtraInfo.new_();
        BLiveGiftExtraVideoChat bLiveGiftExtraVideoChatNew_ = BLiveGiftExtraVideoChat.new_();
        bLiveGiftExtraVideoChatNew_.chatId = str;
        bLiveGiftExtraVideoChatNew_.sinceSec = i;
        bLiveGiftExtraVideoChatNew_.untilSec = i + 60;
        bLiveGiftExtraVideoChatNew_.category = str2;
        bLiveGiftExtraInfoNew_.videoChat = bLiveGiftExtraVideoChatNew_;
        return bLiveGiftExtraInfoNew_;
    }

    /* JADX INFO: renamed from: C */
    public static C22421c<BLiveEnvelope> m147228C(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/users/me/video-chat-lives/" + str + "/missed-call-counter")).m182288p().m182301d());
    }

    /* JADX INFO: renamed from: D */
    public static C22421c<BLiveEnvelope> m147229D(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/users/me/video-chat-lives/" + str + "/missed-calls")).m182288p().m182301d());
    }

    /* JADX INFO: renamed from: E */
    public static C22421c<BLiveVideoChatLive> m147230E(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chat-lives/" + str), new st0[0])).map(new qcj() { // from class: l.wvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static C22421c<BLiveVideoChat> m147231F(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chats/" + str), new st0[0])).map(new qcj() { // from class: l.yvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<BLiveVideoChatAssets> m147232G(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/video-chat-assets"), st0.m187803a("source", str))).map(new qcj() { // from class: l.fwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatAssets;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22421c<BLiveVideoChatAttendeeCallInfo> m147233H(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68490m(zvr.m221802b("/video-chat-lives/" + str + "/attendee-call-info")).m182301d()).map(new qcj() { // from class: l.qvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatAttendeeCallInfo;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<BLiveVideoChatLive> m147234I(String str) {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68498u(zvr.m221802b("/users/" + str + "/latest-video-chat-live"), new st0[0])).map(new qcj() { // from class: l.vvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static C22421c<BLiveEnvelope> m147235J() {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/videochat/square-menu-items")).m182288p().m182301d());
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<BLiveVideoChatSummary> m147236K(String str) {
        return LiveBaseApi.m68516r(rnl.m182263l(zvr.m221802b("/users/" + mbs.m157870o0() + "/video-chats/" + str + "/summary"))).map(new qcj() { // from class: l.pvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatSummary;
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static C22421c<BLiveVideoChatSquareSummary> m147237L(String str) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/video-chat-square-summary"));
        c19886aM68490m.m182300c("source", str);
        return LiveBaseApi.m68516r(c19886aM68490m.m182301d()).map(new qcj() { // from class: l.gwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatSquareSummary;
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22421c<List<BLiveCampaign>> m147238M(String str, @NonNull String str2, String str3) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-campaigns")).m182288p().m182300c("source", "video-chat").m182300c("liveMode", "normal").m182300c("anchorUserID", str2).m182300c("audienceUserID", str3);
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("content", str);
        }
        return LiveBaseApi.m68516r(c19886aM182300c.m182301d()).map(new qcj() { // from class: l.cwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveCampaigns;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<BLiveRoomTabGifts> m147239N(String str, String str2) {
        return LiveBaseApi.m68516r(rnl.m182265r(zvr.m221802b("/tab_gift_items")).m182288p().m182300c("source", "videoChat").m182300c("liveMode", "normal").m182300c("roomId", str2).m182300c("anchorId", str).m182301d()).filter(new qcj() { // from class: l.rvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.liveRoomTabGifts.giftTabs));
            }
        }).map(new qcj() { // from class: l.svu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveRoomTabGifts;
            }
        }).flatMap(new qcj() { // from class: l.tvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jwu.m147252a((BLiveRoomTabGifts) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: O */
    public static C22421c<BLiveEnvelope> m147240O(String str, String str2) {
        return LiveBaseApi.m68521w(rnl.m182263l(zvr.m221802b("/users/me/video-chat-anchor-calls/" + str + "/update?action=" + str2)).m182288p().m182301d(), "");
    }

    /* JADX INFO: renamed from: P */
    public static C22421c<BLiveRandomMatchCouponDetail> m147241P() {
        return LiveBaseApi.m68516r(LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/video-chat/random-match-coupon")).m182301d()).map(new qcj() { // from class: l.hwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.randomMatchCouponDetail;
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static C22421c<BLiveRtcToken> m147242Q(String str, String str2, String str3) {
        String strM221802b = zvr.m221802b("/rtc-tokens");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("channel", str);
        jsonObject.addProperty("usage", "video-chat");
        jsonObject.addProperty("rtcProvider", str2);
        jsonObject.addProperty("role", str3);
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b), jsonObject.toString()).map(new qcj() { // from class: l.ovu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static C22421c<LiveVideoChatSquareBean> m147243R() {
        return LiveBaseApi.m68517s(LiveApiBuilder.m68498u(zvr.m221802b("/video-chats"), new st0[0]), h9t.m134085b(LiveVideoChatSquareBean.class));
    }

    /* JADX INFO: renamed from: S */
    public static C22421c<BLiveVideoChatAnchorCall> m147244S(String str, String str2) {
        String strM221802b = zvr.m221802b("/users/me/video-chat-anchor-calls");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userId", str);
        jsonObject.addProperty("liveId", str2);
        return LiveBaseApi.m68521w(rnl.m182263l(strM221802b).m182288p().m182301d(), jsonObject.toString()).map(new qcj() { // from class: l.awu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchorCall;
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static C22421c<BLiveData> m147245T(uoe0 uoe0Var, BLiveVideoChat bLiveVideoChat) {
        final JSONObject jSONObjectM196977c = uoe0Var.m196977c(bLiveVideoChat.f45322id);
        return LiveBaseApi.m68521w(LiveApiBuilder.m68490m(zvr.m221802b("/users/me/gifts/" + uoe0Var.m196981h())).m182301d(), jSONObjectM196977c.toString()).map(new qcj() { // from class: l.xvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jwu.m147258f(jSONObjectM196977c, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static C22421c<BLiveVideoChatRandomMatch> m147246U(String str) {
        return LiveBaseApi.m68521w(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chat-random-matches"), st0.m187803a("source", str)), "").map(new qcj() { // from class: l.iwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatRandomMatch;
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static C22421c<BLiveVideoChat> m147247V(String str, String str2, String str3) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chats"), new st0[0]);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("roomId", str);
        jsonObject.addProperty("source", str2);
        jsonObject.addProperty("action", PushService.COMMAND_CREATE);
        if (!TextUtils.isEmpty(str3)) {
            jsonObject.addProperty("anchorCallId", str3);
        }
        return LiveBaseApi.m68521w(rnlVarM68498u, jsonObject.toString()).map(new qcj() { // from class: l.bwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static C22421c<BLiveVideoChatLive> m147248W() {
        return LiveBaseApi.m68521w(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chat-lives"), new st0[0]), "").map(new qcj() { // from class: l.lvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static C22421c<BLiveVideoChatRandomMatch> m147249X(String str) {
        return LiveBaseApi.m68521w(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chat-random-matches/" + str + "/update"), st0.m187803a("action", "cancel")), "").map(new qcj() { // from class: l.nvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatRandomMatch;
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static C22421c<BLiveVideoChatLive> m147250Y(String str) {
        return LiveBaseApi.m68521w(LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chat-lives/" + str + "/update"), st0.m187803a(FirebaseAnalytics.Param.METHOD, "patch")), "{\n\"status\":\"stopped\"\n}").map(new qcj() { // from class: l.dwu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static C22421c<BLiveVideoChat> m147251Z(String str, String str2, String str3) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/users/me/video-chats/" + str + "/update"));
        c19886aM68490m.m182300c("action", str2);
        c19886aM68490m.m182300c(FirebaseAnalytics.Param.METHOD, "patch");
        if (!TextUtils.isEmpty(str3)) {
            c19886aM68490m.m182300c("errorMessage", str3);
        }
        return LiveBaseApi.m68521w(c19886aM68490m.m182301d(), "").map(new qcj() { // from class: l.kvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22421c m147252a(final BLiveRoomTabGifts bLiveRoomTabGifts) {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135141A(bLiveRoomTabGifts.currentCDNVersion, bLiveRoomTabGifts.region.toString()) ? aiv.m98078Z0(bLiveRoomTabGifts.region, "videoChat").map(new qcj() { // from class: l.zvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jwu.m147272t(bLiveRoomTabGifts, (uxj0) obj);
            }
        }) : C22421c.just(bLiveRoomTabGifts);
    }

    /* JADX INFO: renamed from: a0 */
    public static C22421c<BLiveData> m147253a0(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/users/me/gifts/" + str5));
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        bLiveSendLiveGiftReqNew_.roomId = str;
        bLiveSendLiveGiftReqNew_.liveId = str2;
        bLiveSendLiveGiftReqNew_.type = "videoChat";
        bLiveSendLiveGiftReqNew_.giftId = str3;
        bLiveSendLiveGiftReqNew_.giftNum = 1;
        bLiveSendLiveGiftReqNew_.extraInfo = m147227B(str4, i, str6);
        return LiveBaseApi.m68521w(c19886aM68490m.m182301d(), bLiveSendLiveGiftReqNew_.toJson()).map(new qcj() { // from class: l.uvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ BLiveData m147258f(JSONObject jSONObject, BLiveEnvelope bLiveEnvelope) {
        htd0<civ> htd0Var = htd0.f111524f;
        ((civ) zrv.m221194l(htd0Var)).m109981y(true);
        ((civ) zrv.m221194l(htd0Var)).m109982z();
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveEnvelope.data.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            try {
                bLiveSendLiveGiftResult.givenGiftBrief.sendGiftOriginalId = jSONObject.getString("originalId");
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ BLiveRoomTabGifts m147272t(BLiveRoomTabGifts bLiveRoomTabGifts, uxj0 uxj0Var) {
        return bLiveRoomTabGifts;
    }

    /* JADX INFO: renamed from: z */
    public static C22421c<BLiveVideoChat> m147278z(String str) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221802b("/users/me/video-chats"), new st0[0]);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("roomId", str);
        jsonObject.addProperty("action", "check");
        return LiveBaseApi.m68521w(rnlVarM68498u, jsonObject.toString()).map(new qcj() { // from class: l.mvu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }
}
