package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.photon.push.service.PushService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveRandomMatchCouponDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAnchorCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAssets;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAttendeeCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatRandomMatch;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSquareSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatSummary;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatSquareBean;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class iuu {
    /* JADX INFO: renamed from: A */
    public static C22306c<BLiveRandomMatchCouponDetail> m138440A() {
        String string = UUID.randomUUID().toString();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("originalId", string);
        return LiveBaseApi.m67338w(LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/video-chat/random-match-coupon")).m107537d(), jsonObject.toString()).map(new w9j() { // from class: l.duu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.randomMatchCouponDetail;
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public static BLiveGiftExtraInfo m138441B(String str, int i, String str2) {
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
    public static C22306c<BLiveEnvelope> m138442C(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/users/me/video-chat-lives/" + str + "/missed-call-counter")).m107524p().m107537d());
    }

    /* JADX INFO: renamed from: D */
    public static C22306c<BLiveEnvelope> m138443D(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/users/me/video-chat-lives/" + str + "/missed-calls")).m107524p().m107537d());
    }

    /* JADX INFO: renamed from: E */
    public static C22306c<BLiveVideoChatLive> m138444E(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chat-lives/" + str), new mt0[0])).map(new w9j() { // from class: l.vtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static C22306c<BLiveVideoChat> m138445F(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chats/" + str), new mt0[0])).map(new w9j() { // from class: l.xtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<BLiveVideoChatAssets> m138446G(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/video-chat-assets"), mt0.m156174a("source", str))).map(new w9j() { // from class: l.euu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatAssets;
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22306c<BLiveVideoChatAttendeeCallInfo> m138447H(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67307m(ytr.m216073b("/video-chat-lives/" + str + "/attendee-call-info")).m107537d()).map(new w9j() { // from class: l.ptu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatAttendeeCallInfo;
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<BLiveVideoChatLive> m138448I(String str) {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67315u(ytr.m216073b("/users/" + str + "/latest-video-chat-live"), new mt0[0])).map(new w9j() { // from class: l.utu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static C22306c<BLiveEnvelope> m138449J() {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/videochat/square-menu-items")).m107524p().m107537d());
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<BLiveVideoChatSummary> m138450K(String str) {
        return LiveBaseApi.m67333r(cll.m107499l(ytr.m216073b("/users/" + l9s.m149093o0() + "/video-chats/" + str + "/summary"))).map(new w9j() { // from class: l.otu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatSummary;
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static C22306c<BLiveVideoChatSquareSummary> m138451L(String str) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/video-chat-square-summary"));
        c16188aM67307m.m107536c("source", str);
        return LiveBaseApi.m67333r(c16188aM67307m.m107537d()).map(new w9j() { // from class: l.fuu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatSquareSummary;
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public static C22306c<List<BLiveCampaign>> m138452M(String str, @NonNull String str2, String str3) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-campaigns")).m107524p().m107536c("source", "video-chat").m107536c("liveMode", "normal").m107536c("anchorUserID", str2).m107536c("audienceUserID", str3);
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("content", str);
        }
        return LiveBaseApi.m67333r(c16188aM107536c.m107537d()).map(new w9j() { // from class: l.buu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveCampaigns;
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<BLiveRoomTabGifts> m138453N(String str, String str2) {
        return LiveBaseApi.m67333r(cll.m107501r(ytr.m216073b("/tab_gift_items")).m107524p().m107536c("source", "videoChat").m107536c("liveMode", "normal").m107536c("roomId", str2).m107536c("anchorId", str).m107537d()).filter(new w9j() { // from class: l.qtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.liveRoomTabGifts.giftTabs));
            }
        }).map(new w9j() { // from class: l.rtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveRoomTabGifts;
            }
        }).flatMap(new w9j() { // from class: l.stu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iuu.m138466a((BLiveRoomTabGifts) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: O */
    public static C22306c<BLiveEnvelope> m138454O(String str, String str2) {
        return LiveBaseApi.m67338w(cll.m107499l(ytr.m216073b("/users/me/video-chat-anchor-calls/" + str + "/update?action=" + str2)).m107524p().m107537d(), "");
    }

    /* JADX INFO: renamed from: P */
    public static C22306c<BLiveRandomMatchCouponDetail> m138455P() {
        return LiveBaseApi.m67333r(LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/video-chat/random-match-coupon")).m107537d()).map(new w9j() { // from class: l.guu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.randomMatchCouponDetail;
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static C22306c<BLiveRtcToken> m138456Q(String str, String str2, String str3) {
        String strM216073b = ytr.m216073b("/rtc-tokens");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("channel", str);
        jsonObject.addProperty("usage", "video-chat");
        jsonObject.addProperty("rtcProvider", str2);
        jsonObject.addProperty("role", str3);
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b), jsonObject.toString()).map(new w9j() { // from class: l.ntu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.rtcTokens.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public static C22306c<LiveVideoChatSquareBean> m138457R() {
        return LiveBaseApi.m67334s(LiveApiBuilder.m67315u(ytr.m216073b("/video-chats"), new mt0[0]), g7t.m124729b(LiveVideoChatSquareBean.class));
    }

    /* JADX INFO: renamed from: S */
    public static C22306c<BLiveVideoChatAnchorCall> m138458S(String str, String str2) {
        String strM216073b = ytr.m216073b("/users/me/video-chat-anchor-calls");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userId", str);
        jsonObject.addProperty("liveId", str2);
        return LiveBaseApi.m67338w(cll.m107499l(strM216073b).m107524p().m107537d(), jsonObject.toString()).map(new w9j() { // from class: l.ztu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.anchorCall;
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public static C22306c<BLiveData> m138459T(pge0 pge0Var, BLiveVideoChat bLiveVideoChat) {
        final JSONObject jSONObjectM168678c = pge0Var.m168678c(bLiveVideoChat.f44474id);
        return LiveBaseApi.m67338w(LiveApiBuilder.m67307m(ytr.m216073b("/users/me/gifts/" + pge0Var.m168682h())).m107537d(), jSONObjectM168678c.toString()).map(new w9j() { // from class: l.wtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iuu.m138472f(jSONObjectM168678c, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public static C22306c<BLiveVideoChatRandomMatch> m138460U(String str) {
        return LiveBaseApi.m67338w(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chat-random-matches"), mt0.m156174a("source", str)), "").map(new w9j() { // from class: l.huu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatRandomMatch;
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static C22306c<BLiveVideoChat> m138461V(String str, String str2, String str3) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chats"), new mt0[0]);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("roomId", str);
        jsonObject.addProperty("source", str2);
        jsonObject.addProperty("action", PushService.COMMAND_CREATE);
        if (!TextUtils.isEmpty(str3)) {
            jsonObject.addProperty("anchorCallId", str3);
        }
        return LiveBaseApi.m67338w(cllVarM67315u, jsonObject.toString()).map(new w9j() { // from class: l.auu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static C22306c<BLiveVideoChatLive> m138462W() {
        return LiveBaseApi.m67338w(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chat-lives"), new mt0[0]), "").map(new w9j() { // from class: l.ktu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public static C22306c<BLiveVideoChatRandomMatch> m138463X(String str) {
        return LiveBaseApi.m67338w(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chat-random-matches/" + str + "/update"), mt0.m156174a("action", "cancel")), "").map(new w9j() { // from class: l.mtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatRandomMatch;
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public static C22306c<BLiveVideoChatLive> m138464Y(String str) {
        return LiveBaseApi.m67338w(LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chat-lives/" + str + "/update"), mt0.m156174a(FirebaseAnalytics.Param.METHOD, "patch")), "{\n\"status\":\"stopped\"\n}").map(new w9j() { // from class: l.cuu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChatLive;
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public static C22306c<BLiveVideoChat> m138465Z(String str, String str2, String str3) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/users/me/video-chats/" + str + "/update"));
        c16188aM67307m.m107536c("action", str2);
        c16188aM67307m.m107536c(FirebaseAnalytics.Param.METHOD, "patch");
        if (!TextUtils.isEmpty(str3)) {
            c16188aM67307m.m107536c("errorMessage", str3);
        }
        return LiveBaseApi.m67338w(c16188aM67307m.m107537d(), "").map(new w9j() { // from class: l.jtu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22306c m138466a(final BLiveRoomTabGifts bLiveRoomTabGifts) {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126007A(bLiveRoomTabGifts.currentCDNVersion, bLiveRoomTabGifts.region.toString()) ? zfv.m218544Z0(bLiveRoomTabGifts.region, "videoChat").map(new w9j() { // from class: l.ytu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iuu.m138486t(bLiveRoomTabGifts, (roj0) obj);
            }
        }) : C22306c.just(bLiveRoomTabGifts);
    }

    /* JADX INFO: renamed from: a0 */
    public static C22306c<BLiveData> m138467a0(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/users/me/gifts/" + str5));
        BLiveSendLiveGiftReq bLiveSendLiveGiftReqNew_ = BLiveSendLiveGiftReq.new_();
        bLiveSendLiveGiftReqNew_.scenario = "live";
        bLiveSendLiveGiftReqNew_.originalId = UUID.randomUUID().toString();
        bLiveSendLiveGiftReqNew_.roomId = str;
        bLiveSendLiveGiftReqNew_.liveId = str2;
        bLiveSendLiveGiftReqNew_.type = "videoChat";
        bLiveSendLiveGiftReqNew_.giftId = str3;
        bLiveSendLiveGiftReqNew_.giftNum = 1;
        bLiveSendLiveGiftReqNew_.extraInfo = m138441B(str4, i, str6);
        return LiveBaseApi.m67338w(c16188aM67307m.m107537d(), bLiveSendLiveGiftReqNew_.toJson()).map(new w9j() { // from class: l.ttu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ BLiveData m138472f(JSONObject jSONObject, BLiveEnvelope bLiveEnvelope) {
        fld0<bgv> fld0Var = fld0.f98151f;
        ((bgv) ypv.m215673l(fld0Var)).m101745y(true);
        ((bgv) ypv.m215673l(fld0Var)).m101746z();
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveEnvelope.data.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            try {
                bLiveSendLiveGiftResult.givenGiftBrief.sendGiftOriginalId = jSONObject.getString("originalId");
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        return bLiveEnvelope.data;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ BLiveRoomTabGifts m138486t(BLiveRoomTabGifts bLiveRoomTabGifts, roj0 roj0Var) {
        return bLiveRoomTabGifts;
    }

    /* JADX INFO: renamed from: z */
    public static C22306c<BLiveVideoChat> m138492z(String str) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216073b("/users/me/video-chats"), new mt0[0]);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("roomId", str);
        jsonObject.addProperty("action", "check");
        return LiveBaseApi.m67338w(cllVarM67315u, jsonObject.toString()).map(new w9j() { // from class: l.ltu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.videoChat;
            }
        });
    }
}
