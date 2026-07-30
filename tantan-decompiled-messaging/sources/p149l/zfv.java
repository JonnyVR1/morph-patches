package p149l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.imagepipeline.common.Priority;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveGameInfoReq;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p046p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p046p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import com.p046p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftEquipInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class zfv {

    /* JADX INFO: renamed from: l.zfv$b */
    public static class C21688b {

        /* JADX INFO: renamed from: a */
        public String f202985a;

        /* JADX INFO: renamed from: b */
        public String f202986b;

        public C21688b(String str, String str2) {
            this.f202985a = str;
            this.f202986b = str2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ BLiveCoin m218493A(BLiveExtraResponse bLiveExtraResponse) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126009C(Long.valueOf(bLiveExtraResponse.data.diamond.available));
        return bLiveExtraResponse.data.diamond;
    }

    /* JADX INFO: renamed from: A0 */
    public static C22306c<BLiveGiftSetInfo> m218494A0(String str, String str2) {
        return upv.m194920h(cll.m107501r(ytr.m216073b(String.format("/live-gift/users/me/rooms/%s/sets/%s", str2, str))).m107524p().m107537d(), "getLiveGiftSuitInfo").map(new w9j() { // from class: l.jfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSetInfo;
            }
        }).filter(new w9j() { // from class: l.kfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveGiftSetInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22306c m218495B(BLiveAbsData bLiveAbsData, final BLiveRoomTabGifts bLiveRoomTabGifts) {
        return ((ggv) ypv.m215673l(fld0.f98148c)).m126007A(bLiveRoomTabGifts.currentCDNVersion, bLiveRoomTabGifts.region.toString()) ? m218544Z0(bLiveRoomTabGifts.region, bLiveAbsData.type).map(new w9j() { // from class: l.jev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218529S(bLiveRoomTabGifts, (roj0) obj);
            }
        }) : C22306c.just(bLiveRoomTabGifts);
    }

    /* JADX INFO: renamed from: B0 */
    public static C22306c<BLiveTouchMeDetail> m218496B0(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-campaigns/touchMe/anchors/" + str + "/details/status")), "getLiveGuideGiftSwitchConfig").map(new w9j() { // from class: l.pfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.touchMeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public static C22306c<BLiveModelsFromCdnWarpData> m218498C0(BLiveEnvelope bLiveEnvelope) {
        final BLiveLiveMedalCDN bLiveLiveMedalCDN = bLiveEnvelope.data.liveMedalCDN;
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = ((bgv) ypv.m215673l(fld0.f98151f)).f75515o.get();
        return (mmj.m155431r(bLiveLiveMedalCDN, bLiveModelsFromCdnWarpData).booleanValue() ? ia20.m135119c(new v9j() { // from class: l.bev
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.f177677c.auth().m185898q(bLiveLiveMedalCDN.cdnUrl).m185887f().m185883b();
            }
        }, BLiveMedals.JSON_ADAPTER) : C22306c.just(bLiveModelsFromCdnWarpData.liveModels)).map(new w9j() { // from class: l.cev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218525Q(bLiveLiveMedalCDN, (BLiveMedals) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static C22306c<BLiveOperation> m218500D0(@Nullable String str, String str2, String str3, String str4, String str5, String str6) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-operations")).m107524p().m107536c("anchorId", str2).m107536c("roomId", str3).m107536c("fakeId", w220.m201015b() ? w220.m201014a() : "").m107536c("liveMode", str5).m107536c("roomType", str4);
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("type", str);
        }
        if (!TextUtils.isEmpty(str6)) {
            c16188aM107536c.m107536c("hostId", str6);
        }
        return upv.m194920h(c16188aM107536c.m107537d(), "getLiveOperationPlace").map(new w9j() { // from class: l.hev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveOperation;
            }
        }).filter(new w9j() { // from class: l.iev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveOperation) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m218501E(ConcurrentHashMap concurrentHashMap, BLiveGiftItem bLiveGiftItem) {
        if (ypv.m215674m()) {
            concurrentHashMap.put(Integer.valueOf(bLiveGiftItem.f44377id), bLiveGiftItem);
            ((ggv) ypv.m215673l(fld0.f98148c)).f102550k.put(Integer.valueOf(bLiveGiftItem.f44377id), bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static C22306c<BLivePageCampaign> m218502E0() {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/start-live-page-campaigns")), "getLivePageCampaigns").filter(new w9j() { // from class: l.sev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.startLivePageCampaigns));
            }
        }).map(new w9j() { // from class: l.tev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.startLivePageCampaigns.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static C22306c<BLiveExtraResponse> m218504F0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/detail")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("roomId", str2);
        }
        c16188aM107524p.m107536c("source", "live");
        return upv.m194921i(c16188aM107524p.m107537d(), "getGiftWallDetailInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m218505G(Throwable th) {
    }

    /* JADX INFO: renamed from: G0 */
    public static C22306c<BLiveExtraResponse> m218506G0(String str, String str2, String str3, String str4, String str5, String str6) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/gift/detail")).m107524p();
        c16188aM107524p.m107536c("from", str2);
        c16188aM107524p.m107536c("to", str3);
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str4)) {
            c16188aM107524p.m107536c("roomId", str4);
        }
        c16188aM107524p.m107536c("source", "live");
        c16188aM107524p.m107536c("giftId", str5);
        c16188aM107524p.m107536c("fakeId", str6);
        return upv.m194921i(c16188aM107524p.m107537d(), "getNewGiftWallGiftDetail" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: H0 */
    public static C22306c<BLiveExtraResponse> m218508H0(String str, String str2, String str3) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/gift/category/detail")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("roomId", str2);
        }
        c16188aM107524p.m107536c("source", "live");
        c16188aM107524p.m107536c("categoryId", str3);
        return upv.m194921i(c16188aM107524p.m107537d(), "getNewGiftWallGiftTypeInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: I0 */
    public static C22306c<BLiveExtraResponse> m218510I0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/set/detail")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("roomId", str2);
        }
        c16188aM107524p.m107536c("source", "live");
        return upv.m194921i(c16188aM107524p.m107537d(), "getNewGiftWallSet" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m218511J(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static C22306c<BLiveExtraResponse> m218512J0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/skin/detail")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("roomId", str2);
        }
        c16188aM107524p.m107536c("source", "live");
        return upv.m194921i(c16188aM107524p.m107537d(), "getNewGiftWallSkin" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: K0 */
    public static C22306c<BLiveExtraResponse> m218514K0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-wall-v2/summary")).m107524p();
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c16188aM107524p.m107536c("roomId", str2);
        }
        c16188aM107524p.m107536c("source", "live");
        return upv.m194921i(c16188aM107524p.m107537d(), "getNewGiftWallSummaryInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: L0 */
    public static String m218516L0(String str) {
        if (TextUtils.equals(str, BLiveAbsData.VOICE_LIVE)) {
            return BLiveType.voiceLive;
        }
        TextUtils.equals(str, "live");
        return "live";
    }

    /* JADX INFO: renamed from: M0 */
    public static C22306c<BLiveEnvelope> m218518M0(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/scrap-tabs")).m107524p();
        c16188aM107524p.m107536c(MatchFrom.scenario, str).m107536c("roomId", str2).m107536c("liveId", str3).m107536c("anchorId", str4);
        return upv.m194920h(c16188aM107524p.m107537d(), "live-scrap");
    }

    /* JADX INFO: renamed from: N0 */
    public static C22306c<BLiveEnterRoomEffect> m218520N0(String str, String str2, String str3, String str4) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/users/me/enter_room_effect")).m107524p().m107536c("roomId", str).m107536c("liveId", str2).m107536c("liveMode", str4);
        if ("live".equals(str3)) {
            c16188aM107536c.m107536c("placeType", "videoRoom");
        } else if (BLiveAbsData.VOICE_LIVE.equals(str3)) {
            c16188aM107536c.m107536c("placeType", "voiceRoom").m107536c("templateType", "profit");
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "getSelfEnterRoomEffect").map(new w9j() { // from class: l.mfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218590p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public static C22306c<BLiveData> m218522O0() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/campaigns/new-user-reward/users/" + ypv.f199493a.m199309D0() + "/treasure-box")), "get_treasure_box_config").map(new w9j() { // from class: l.tfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public static C22306c<BLiveTurboCardInfo> m218524P0(String str, String str2, String str3) {
        return upv.m194920h(cll.m107501r(ytr.m216073b("/live/turboCardInfo")).m107524p().m107536c("userType", str).m107536c("roomId", str2).m107536c("liveMode", str3).m107537d(), "getTurboCardInfo").map(new w9j() { // from class: l.vdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.turboCardInfo;
            }
        }).filter(new w9j() { // from class: l.wdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveTurboCardInfo) obj));
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ BLiveModelsFromCdnWarpData m218525Q(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveMedals bLiveMedals) {
        if (bLiveMedals == null) {
            return null;
        }
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpDataNew_ = BLiveModelsFromCdnWarpData.new_();
        bLiveModelsFromCdnWarpDataNew_.liveModels = bLiveMedals;
        bLiveModelsFromCdnWarpDataNew_.version = bLiveLiveMedalCDN.version;
        ((bgv) ypv.m215673l(fld0.f98151f)).f75515o.put(bLiveModelsFromCdnWarpDataNew_);
        return bLiveModelsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: Q0 */
    public static C22306c<BLiveUpgradeGiftInfo> m218526Q0(String str) {
        return upv.m194920h(cll.m107499l(ytr.m216073b(String.format("/live-gift/users/me/slots/%s", str))), "getUpgradeGiftInfo").map(new w9j() { // from class: l.nfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.slotInfo;
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static C22306c<BLiveGivenGiftRemindStatus> m218528R0(String str, String str2, String str3, int i) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/gift/guide/recheck")).m107524p();
        c16188aM107524p.m107536c("source", m218516L0(str));
        c16188aM107524p.m107536c("roomID", str2);
        c16188aM107524p.m107536c("liveID", str3);
        c16188aM107524p.m107536c("remindID", String.valueOf(i));
        return upv.m194920h(c16188aM107524p.m107537d(), "giftGuideRecheck").map(new w9j() { // from class: l.ifv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindStatus;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BLiveRoomTabGifts m218529S(BLiveRoomTabGifts bLiveRoomTabGifts, roj0 roj0Var) {
        return bLiveRoomTabGifts;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m218530S0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq) {
        if (bLiveSendLiveGiftReq == null || ypv.f199498f.getHeader() == null || TextUtils.isEmpty(bLiveSendLiveGiftReq.extraInfo.voiceLive.mainUserId)) {
            return;
        }
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = bLiveSendLiveGiftReq.extraInfo.voiceLive;
        String str = ypv.f199498f.getHeader().get("X-TT-Live-AnchorID");
        if (TextUtils.isEmpty(str) || bLiveGiftExtraVoiceInfo.mainUserId.equals(str)) {
            return;
        }
        CrashHelper.m81298e(new IllegalStateException("send gift mainuserId is error : mainUserId = " + bLiveGiftExtraVoiceInfo.mainUserId + " , headerAnchorId = " + str), "国际化送礼参数错误", CrashHelper.ReportLevel.p9);
    }

    /* JADX INFO: renamed from: T0 */
    public static boolean m218532T0(BLiveEnvelope bLiveEnvelope) {
        return !TextUtils.isEmpty(bLiveEnvelope.data.liveMedalCDN.cdnUrl);
    }

    /* JADX INFO: renamed from: U0 */
    public static C22306c<List<BLiveCampaign>> m218534U0(@NonNull String str, String str2, String str3, String str4, String str5) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-campaigns")).m107524p().m107536c("anchorUserID", str).m107536c("source", str2).m107536c("liveMode", str4);
        if (!TextUtils.isEmpty(str3)) {
            c16188aM107536c.m107536c("content", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            c16188aM107536c.m107536c("hostId", str5);
        }
        return upv.m194935w(c16188aM107536c.m107537d(), "live-campaign").map(new w9j() { // from class: l.udv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveCampaigns;
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public static void m218536V0(BLiveType bLiveType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        String string = bLiveType.toString();
        if (TextUtils.equals(string, "app")) {
            aqe.m98261i().m98273p(pair);
        } else if (TextUtils.equals(string, "live") || TextUtils.equals(string, BLiveType.voiceLive)) {
            ((ggv) ypv.m215673l(fld0.f98148c)).m126011E((BLiveResourceInfo) pair.first);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static roj0 m218538W0(BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        if (bLiveModelsFromCdnWarpData != null) {
            ((ggv) ypv.m215673l(fld0.f98148c)).f102560u.put(bLiveModelsFromCdnWarpData.version, bLiveModelsFromCdnWarpData.liveModels);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: X0 */
    public static roj0 m218540X0(BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        if (!vwb.m200296J(bLiveGiftsFromCdnWarpData.giftList)) {
            final ConcurrentHashMap<Integer, BLiveGiftItem> concurrentHashMap = new ConcurrentHashMap<>();
            mmj.m155409L(bLiveGiftsFromCdnWarpData.giftList, new e30() { // from class: l.dev
                @Override // p149l.e30
                public final void call(Object obj) {
                    zfv.m218501E(concurrentHashMap, (BLiveGiftItem) obj);
                }
            });
            if (ypv.m215674m()) {
                ((ggv) ypv.m215673l(fld0.f98148c)).f102551l.put(bLiveGiftsFromCdnWarpData.serverRegion, concurrentHashMap);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static C22306c<roj0> m218542Y0(LiveRegionTag liveRegionTag) {
        return m218544Z0(liveRegionTag, "");
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ BLiveCoin m218543Z(BLiveExtraResponse bLiveExtraResponse) {
        ((ggv) ypv.m215673l(fld0.f98148c)).m126009C(Long.valueOf(bLiveExtraResponse.data.coins.available));
        return bLiveExtraResponse.data.coins;
    }

    /* JADX INFO: renamed from: Z0 */
    public static C22306c<roj0> m218544Z0(LiveRegionTag liveRegionTag, String str) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/gift_items_cdn")).m107524p();
        if (!TEnum.equals(liveRegionTag, "unknown_")) {
            c16188aM107524p.m107536c("region", liveRegionTag.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("liveType", hdu.m130613a(str));
        }
        return upv.m194920h(c16188aM107524p.m107537d(), "liveGiftItemsUrl").filter(new w9j() { // from class: l.ndv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(mmj.m155407J((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.odv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218611w0((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.pdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218540X0((BLiveGiftsFromCdnWarpData) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveHierarchyProgress m218545a(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public static void m218547a1(final String str, final bwc0 bwc0Var, @Nullable final h7e h7eVar) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-resource/resources/" + str)).m107524p();
        if (i7n.m134917c()) {
            c16188aM107524p.m107536c("intlDegrade", "1");
        }
        upv.m194920h(c16188aM107524p.m107537d(), "pollLiveEffectBean" + str).map(new w9j() { // from class: l.fev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResources;
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.qev
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218599s(h7eVar, bwc0Var, (List) obj);
            }
        }, new e30() { // from class: l.bfv
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218605u(h7eVar, str, bwc0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ BLiveResourceInfo m218549b0(BLiveResourceInfo bLiveResourceInfo) {
        ((bgv) ypv.m215673l(fld0.f98151f)).f75513m.put(bLiveResourceInfo);
        aqe.m98261i().m98265g(bLiveResourceInfo);
        wrj.m205255u("更新资源version： " + bLiveResourceInfo.version);
        return bLiveResourceInfo;
    }

    /* JADX INFO: renamed from: b1 */
    public static void m218550b1(String str, String str2, final BLiveType bLiveType) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-resource/resources-cdn")).m107524p().m107536c("roomID", str).m107536c("anchorID", str2).m107536c("source", bLiveType.toString());
        if (i7n.m134917c()) {
            c16188aM107536c.m107536c("intlDegrade", "1");
        }
        upv.m194920h(c16188aM107536c.m107537d(), "pollLiveEffectCDN").observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.kev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResourcesCDN;
            }
        }).filter(new w9j() { // from class: l.lev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveResourceCDN) obj));
            }
        }).flatMap(new w9j() { // from class: l.mev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218596r((BLiveResourceCDN) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.nev
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218536V0(bLiveType, (Pair) obj);
            }
        }, new e30() { // from class: l.oev
            @Override // p149l.e30
            public final void call(Object obj) {
                wrj.m205255u("EffectManager pollLiveEffectList error:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public static C22306c<roj0> m218553c1() {
        fld0<ggv> fld0Var = fld0.f98148c;
        return (((ggv) ypv.m215673l(fld0Var)).f102560u == null || ((ggv) ypv.m215673l(fld0Var)).f102560u.isEmpty()) ? upv.m194920h(cll.m107499l(ytr.m216073b("/live-medals-cdn")).m107524p().m107537d(), "LiveMedalsFromCdn").filter(new w9j() { // from class: l.yfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(zfv.m218532T0((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.kdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218498C0((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.ldv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218538W0((BLiveModelsFromCdnWarpData) obj);
            }
        }).observeOn(jo0.m142408a()) : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ roj0 m218555d0(BLiveEnvelope bLiveEnvelope) {
        List<BLiveUserLevel> list = bLiveEnvelope.data.liveHierarchyGrades;
        ((ggv) ypv.m215673l(fld0.f98148c)).f102562w = bLiveEnvelope.data.momentConfig;
        if (list != null) {
            for (BLiveUserLevel bLiveUserLevel : list) {
                ((ggv) ypv.m215673l(fld0.f98148c)).f102561v.put(Long.valueOf(bLiveUserLevel.grade), bLiveUserLevel);
                hxs.m133387B("context_livingAct", bLiveUserLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        List<BLiveAnchorLevel> list2 = bLiveEnvelope.data.anchorHierarchyGrades;
        if (list2 != null) {
            for (BLiveAnchorLevel bLiveAnchorLevel : list2) {
                ((ggv) ypv.m215673l(fld0.f98148c)).f102563x.put(Long.valueOf(bLiveAnchorLevel.grade), bLiveAnchorLevel);
                hxs.m133387B("context_livingAct", bLiveAnchorLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: d1 */
    public static void m218556d1() {
        m218553c1().subscribe(ffw.m121194e(new e30() { // from class: l.pev
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218557e((roj0) obj);
            }
        }, new e30() { // from class: l.rev
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218505G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m218557e(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e1 */
    public static C22306c<Pair<BLiveResourceInfo, BLiveResourceCDN>> m218559e1(final BLiveResourceCDN bLiveResourceCDN) {
        ((bgv) ypv.m215673l(fld0.f98151f)).f75512l.put(bLiveResourceCDN);
        String str = bLiveResourceCDN.cdnUrl;
        return ia20.m135119c(new v9j() { // from class: l.efv
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.f177677c.auth().m185898q(bLiveResourceCDN.cdnUrl).m185887f().m185883b();
            }
        }, BLiveResourceInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.ffv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((BLiveResourceInfo) obj));
            }
        }).map(new w9j() { // from class: l.gfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218549b0((BLiveResourceInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.hfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(new Pair((BLiveResourceInfo) obj, bLiveResourceCDN));
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static C22306c<BLiveRoomTabGifts> m218562f1(evj evjVar, final BLiveAbsData bLiveAbsData) {
        String str;
        cll.C16188a c16188aM107536c = cll.m107501r(ytr.m216073b("/tab_gift_items")).m107524p().m107536c("source", m218600s0(evjVar)).m107536c("roomId", evjVar.m118268c()).m107536c("liveMode", bLiveAbsData.liveMode).m107536c("anchorId", evjVar.m118266a());
        if (w220.m201015b()) {
            c16188aM107536c.m107536c("fakeId", w220.m201014a());
        }
        if (TextUtils.isEmpty(evjVar.m118269d())) {
            str = "tab_gift_items";
        } else {
            str = "tab_gift_items_" + evjVar.m118269d();
        }
        return upv.m194920h(c16188aM107536c.m107537d(), str).filter(new w9j() { // from class: l.vfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.liveRoomTabGifts.giftTabs));
            }
        }).map(new w9j() { // from class: l.wfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveRoomTabGifts;
            }
        }).flatMap(new w9j() { // from class: l.xfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218495B(bLiveAbsData, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ BLiveGiftsFromCdnWarpData m218563g(List list, String str, String str2) {
        final BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpDataNew_ = BLiveGiftsFromCdnWarpData.new_();
        bLiveGiftsFromCdnWarpDataNew_.giftList = list;
        bLiveGiftsFromCdnWarpDataNew_.serverRegion = str;
        bLiveGiftsFromCdnWarpDataNew_.version = str2;
        e51.m114774y(new Runnable() { // from class: l.cfv
            @Override // java.lang.Runnable
            public final void run() {
                ((bgv) ypv.m215673l(fld0.f98151f)).f75514n.put(bLiveGiftsFromCdnWarpDataNew_);
            }
        });
        return bLiveGiftsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ BLiveData m218564g0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq, BLiveEnvelope bLiveEnvelope) {
        fld0<bgv> fld0Var = fld0.f98151f;
        ((bgv) ypv.m215673l(fld0Var)).m101745y(true);
        ((bgv) ypv.m215673l(fld0Var)).m101746z();
        BLiveData bLiveData = bLiveEnvelope.data;
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveData.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            bLiveSendLiveGiftResult.givenGiftBrief.sendGiftOriginalId = bLiveSendLiveGiftReq.originalId;
        }
        return bLiveData;
    }

    /* JADX INFO: renamed from: g1 */
    public static C22306c<roj0> m218565g1() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live-hierarchy")), "pollUserLevelConfig").map(new w9j() { // from class: l.uev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218555d0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static C22306c<BLiveEnvelope> m218568h1(boolean z, String str) {
        return upv.m194917e(LiveApiBuilder.m67315u(ytr.m216073b("/live-campaigns/dragon-scourge/anchors/" + str + "/details/records"), mt0.m156174a("action", z ? "accept" : "reject")), "postDragonScourgeControl" + str, "");
    }

    /* JADX INFO: renamed from: i1 */
    public static C22306c<Boolean> m218571i1(String str, boolean z) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216073b("/live-campaigns/touchMe/anchors/" + str + "/details/changeStatus"), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openStatus", z);
        } catch (JSONException unused) {
        }
        return upv.m194917e(cllVarM67315u, "postLiveGuideGiftSwitchConfig" + str, jSONObject.toString()).map(new w9j() { // from class: l.qfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }).onErrorReturn(new w9j() { // from class: l.rfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public static void m218573j0(BLiveCampaignNotifyData bLiveCampaignNotifyData) {
        upv.m194928p(cll.m107499l(ytr.m216073b("/campaign/watch_live_ok")), "campaignCountdownNotify", bLiveCampaignNotifyData.toJson()).subscribe(ffw.m121194e(new e30() { // from class: l.zdv
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218575k((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.aev
            @Override // p149l.e30
            public final void call(Object obj) {
                zfv.m218511J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public static C22306c<BLiveData> m218574j1() {
        return upv.m194919g(cll.m107499l(ytr.m216073b("/campaigns/new-user-reward/users/" + ypv.f199493a.m199309D0() + "/treasure-box")).m107524p().m107536c(NotificationCompat.CATEGORY_STATUS, "completed").m107537d(), "patch_treasure_box_config", "").map(new w9j() { // from class: l.ufv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m218575k(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: k0 */
    public static C22306c<BLiveExtraResponse> m218576k0(String str) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live/unjail-card/anchor-info")).m107524p();
        c16188aM107524p.m107536c("anchorId", str);
        return upv.m194923k(c16188aM107524p.m107537d(), "checkAndGetAnchorNameById", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: k1 */
    public static C22306c<BLiveCoin> m218577k1() {
        return u6n.m192015a() ? m218580l1() : m218583m1();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22306c<BLiveExtraResponse> m218579l0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live/can-give-naming-card")).m107524p();
        c16188aM107524p.m107536c("anchorId", str);
        c16188aM107524p.m107536c("roomId", str2);
        return upv.m194923k(c16188aM107524p.m107537d(), "/live/can-give-naming-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: l1 */
    public static C22306c<BLiveCoin> m218580l1() {
        return upv.m194921i(cll.m107499l(ytr.m216073b("/users/" + ypv.f199493a.m199309D0() + "/diamond?agent=true")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.qdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218493A((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static C22306c<BLiveExtraResponse> m218582m0(String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live/can-give-unjail-card")).m107524p();
        c16188aM107524p.m107536c("anchorId", str);
        c16188aM107524p.m107536c("roomId", str2);
        return upv.m194923k(c16188aM107524p.m107537d(), "/live/can-give-unjail-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: m1 */
    public static C22306c<BLiveCoin> m218583m1() {
        return upv.m194921i(cll.m107499l(ytr.m216079h("/coins")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.mdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218543Z((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static C22306c<BLiveEnvelope> m218585n0(@NotNull String str, @NotNull BLiveScrapCraftReq bLiveScrapCraftReq) {
        return upv.m194917e(cll.m107499l(ytr.m216073b("/live-gift/scraps/" + str + "/craft")).m107524p().m107537d(), "craftScrap", bLiveScrapCraftReq.toJson());
    }

    /* JADX INFO: renamed from: n1 */
    public static C22306c<List<BLiveGiftSkin>> m218586n1(nvj nvjVar) {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/live-gift/users/" + ypv.f199493a.m199309D0() + "/tab/skins")).m107524p().m107536c("anchorId", nvjVar.m161693a()).m107536c(MatchFrom.scenario, nvjVar.m161697e()).m107536c("liveId", nvjVar.m161695c()).m107536c("roomId", nvjVar.m161696d()).m107536c("fakeId", nvjVar.m161694b()).m107537d(), "getGiftSkinInfo").map(new w9j() { // from class: l.zev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skins;
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static C22306c<BLiveEnvelope> m218588o0(String str, String str2) {
        String string = UUID.randomUUID().toString();
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/gift-wall-v2/skin/equip"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("originalId", (Object) string);
        jSONObject.put("giftId", (Object) str);
        jSONObject.put("skinId", (Object) str2);
        return upv.m194917e(c16188aM67307m.m107537d(), "equipGiftSkin" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: o1 */
    public static C22306c<BLiveHierarchyProgress> m218589o1(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(str)) {
            str = BLiveType.voiceLive;
        }
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/users/me/hierarchy-progress")).m107524p();
        if (w220.m201015b()) {
            c16188aM107524p.m107536c("fakeId", w220.m201014a());
        }
        if (!TextUtils.isEmpty(str)) {
            c16188aM107524p.m107536c("liveType", str);
        }
        return upv.m194920h(c16188aM107524p.m107537d(), "requestLiveHierarchyProgress").map(new w9j() { // from class: l.wev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchyProgress;
            }
        }).onErrorReturn(new w9j() { // from class: l.xev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218545a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveEnterRoomEffect m218590p(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.userEnterRoomEffects)) {
            return null;
        }
        return bLiveEnvelope.data.userEnterRoomEffects.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static C22306c<BLiveEnvelope> m218591p0(boolean z, String str, String str2, String str3, String str4, String str5) {
        String string = UUID.randomUUID().toString();
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/live-gift/gift-skin/action/".concat(z ? BLiveRightItem.ACTION_EQUIP : BLiveRightItem.ACTION_UN_EQUIP)));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", (Object) "live");
        jSONObject.put("liveMode", (Object) str3);
        jSONObject.put("originalId", (Object) string);
        jSONObject.put("id", (Object) str);
        jSONObject.put("roomId", (Object) str2);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("fakeId", (Object) str5);
        return upv.m194917e(c16188aM67307m.m107537d(), "equipGiftSkin2" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: p1 */
    public static C22306c<BLiveUserLevel> m218592p1() {
        return upv.m194920h(cll.m107499l(ytr.m216073b("/users/me/hierarchy")), "getMyLiveHierarchy").map(new w9j() { // from class: l.yev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchy;
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static C22306c<BLiveGiftItem> m218594q0(String str, String str2, String str3, String str4) {
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfoNew_ = BLiveUpgradeGiftEquipInfo.new_();
        bLiveUpgradeGiftEquipInfoNew_.itemId = str2;
        bLiveUpgradeGiftEquipInfoNew_.roomId = str3;
        bLiveUpgradeGiftEquipInfoNew_.anchorId = str4;
        return upv.m194917e(cll.m107499l(ytr.m216073b(String.format("/live-gift/users/me/slots/%s/equip-gift", str))), "equipUpgradeGift", bLiveUpgradeGiftEquipInfoNew_.toJson()).map(new w9j() { // from class: l.jdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mmj.m155427n(((BLiveEnvelope) obj).data.equippedGift);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public static C22306c<BLiveData> m218595q1(pge0 pge0Var) {
        final BLiveSendLiveGiftReq bLiveSendLiveGiftReqM168677b = pge0Var.m168677b();
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/users/me/gifts/" + pge0Var.m168682h()));
        if (w220.m201015b()) {
            bLiveSendLiveGiftReqM168677b.fakeId = w220.m201014a();
        }
        if (!vdt.m198092b(1)) {
            try {
                m218530S0(bLiveSendLiveGiftReqM168677b);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                e.getMessage();
            }
        }
        return upv.m194917e(c16188aM67307m.m107537d(), "sendLiveGift", bLiveSendLiveGiftReqM168677b.toJson()).map(new w9j() { // from class: l.lfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218564g0(bLiveSendLiveGiftReqM168677b, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C22306c m218596r(BLiveResourceCDN bLiveResourceCDN) {
        fld0<bgv> fld0Var = fld0.f98151f;
        BLiveResourceCDN bLiveResourceCDN2 = ((bgv) ypv.m215673l(fld0Var)).f75512l.get();
        if (bLiveResourceCDN2 == null || !bLiveResourceCDN2.version.equals(bLiveResourceCDN.version) || !TEnum.equals(bLiveResourceCDN2.region, bLiveResourceCDN.region)) {
            return m218559e1(bLiveResourceCDN);
        }
        BLiveResourceInfo bLiveResourceInfo = ((bgv) ypv.m215673l(fld0Var)).f75513m.get();
        if (bLiveResourceInfo == null) {
            return m218559e1(bLiveResourceCDN);
        }
        wrj.m205255u("EffectManager pollLiveEffectList success local");
        return C22306c.just(new Pair(bLiveResourceInfo, bLiveResourceCDN));
    }

    /* JADX INFO: renamed from: r0 */
    public static String m218597r0(long j) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        return decimalFormat.format(j);
    }

    /* JADX INFO: renamed from: r1 */
    public static C22306c<List<BLiveSendLiveMultiGiftResultItem>> m218598r1(pge0 pge0Var) {
        return upv.m194918f(LiveApiBuilder.m67307m(ytr.m216073b("/users/me/batch-gifts")).m107537d(), "sendMultiLiveGiftWithBatch", BLiveExtraResponse.JSON_ADAPTER, new pee0(pge0Var).m168511a().toJson()).map(new w9j() { // from class: l.ofv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218614y((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m218599s(h7e h7eVar, bwc0 bwc0Var, List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        if (h7eVar != null) {
            BLiveEffect bLiveEffect = (BLiveEffect) list.get(0);
            h7eVar.mo74249c(spe.m185365d(bLiveEffect.type).mo107444d(bLiveEffect));
        }
        aqe.m98261i().m98271n((BLiveEffect) list.get(0), null, bwc0Var, h7eVar);
    }

    /* JADX INFO: renamed from: s0 */
    public static String m218600s0(evj evjVar) {
        return mmj.m155434u(evjVar.m118269d());
    }

    /* JADX INFO: renamed from: s1 */
    public static C22306c<BLiveEnvelope> m218601s1(String str, boolean z, int i) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/live-users/" + str + "/daily-payment"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, (Object) (z ? "enable" : "disable"));
        jSONObject.put("amount", (Object) Integer.valueOf(i));
        return upv.m194917e(c16188aM67307m.m107537d(), "liveSetConsumeAlert", jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: t0 */
    public static C22306c<BLiveTabGiftExpiration> m218603t0(int i, String str, String str2) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-bagpack/item")).m107524p();
        cll.C16188a c16188aM107536c = c16188aM107524p.m107536c("id", i + "").m107536c("roomId", str);
        if (TextUtils.equals(BLiveAbsData.VOICE_LIVE, str2)) {
            str2 = BLiveType.voiceLive;
        }
        c16188aM107536c.m107536c("liveType", str2);
        return upv.m194920h(c16188aM107524p.m107537d(), "getBackTabGiftExpiration" + str + i).map(new w9j() { // from class: l.sfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bagpackItem;
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    public static void m218604t1() {
        upv.m194917e(cll.m107499l(ytr.m216073b("/live/setTurboCardShown")), "setTurboCardShown", "");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m218605u(h7e h7eVar, String str, bwc0 bwc0Var, Throwable th) {
        if (h7eVar != null) {
            h7eVar.mo75218d("pollEffectById Failed");
        }
        nqe.m160594H(str, "", "", SocialConstants.TYPE_REQUEST);
        wrj.m205255u("EffectManager pollLiveEffectBean error:" + th.getMessage());
        nqe.m160618x(bwc0Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static C22306c<BLiveDailyPayment> m218606u0(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live-users/" + str + "/daily-payment")).m107524p().m107537d(), "getConsumeAlertBoardInfo").map(new w9j() { // from class: l.vev
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dailyPayment;
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public static C22306c<BLiveEnvelope> m218607u1(String str, BLiveGameInfoReq bLiveGameInfoReq) {
        if (w220.m201015b()) {
            bLiveGameInfoReq.fakeId = w220.m201014a();
        }
        return upv.m194919g(cll.m107499l(ytr.m216073b("/live-gift/" + str)), "LiveGameGRequest", bLiveGameInfoReq.toJson());
    }

    /* JADX INFO: renamed from: v0 */
    public static C22306c<BLiveGiftBubbleConfig> m218609v0(String str, String str2, String str3, String str4) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/gift_bubble_config"));
        c16188aM67307m.m107536c("source", str);
        c16188aM67307m.m107536c("anchorID", str2);
        c16188aM67307m.m107536c("liveID", str3);
        c16188aM67307m.m107536c("roomID", str4);
        if (w220.m201015b()) {
            c16188aM67307m.m107536c("fakeId", w220.m201014a());
        }
        return upv.m194920h(c16188aM67307m.m107537d(), "getGiftBubbleConfig").map(new w9j() { // from class: l.rdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindConfig;
            }
        }).filter(new w9j() { // from class: l.sdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveGiftBubbleConfig bLiveGiftBubbleConfig = (BLiveGiftBubbleConfig) obj;
                return Boolean.valueOf(bLiveGiftBubbleConfig != null && bLiveGiftBubbleConfig.isValid());
            }
        }).map(new w9j() { // from class: l.tdv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zfv.m218610w((BLiveGiftBubbleConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ BLiveGiftBubbleConfig m218610w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.schema)) {
            bLiveGiftBubbleConfig.button.jumpType = BLiveGiftBubblePopupButtonJumpType.get("schema");
        }
        bLiveGiftBubbleConfig.isCircle = true;
        bLiveGiftBubbleConfig.isFromLongLink = false;
        return bLiveGiftBubbleConfig;
    }

    /* JADX INFO: renamed from: w0 */
    public static C22306c<BLiveGiftsFromCdnWarpData> m218611w0(BLiveEnvelope bLiveEnvelope) {
        final BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        ((ggv) ypv.m215673l(fld0.f98148c)).f102549j.put(bLiveGiftItemCDN.region, Long.valueOf(Long.parseLong(bLiveGiftItemCDN.version)));
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = ((bgv) ypv.m215673l(fld0.f98151f)).f75514n.get();
        return C22306c.zip(mmj.m155430q(bLiveGiftItemCDN, bLiveGiftsFromCdnWarpData).booleanValue() ? ia20.m135119c(new v9j() { // from class: l.eev
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return upv.f177677c.auth().m185898q(bLiveGiftItemCDN.giftItemsCDNUrl).m185887f().m185883b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveGiftItem.JSON_ADAPTER)) : C22306c.just(bLiveGiftsFromCdnWarpData.giftList), C22306c.just(bLiveGiftItemCDN.region), C22306c.just(bLiveGiftItemCDN.version), new y9j() { // from class: l.gev
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return zfv.m218563g((List) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static C22306c<BLiveNewGiftSkinListData> m218613x0(String str, String str2, String str3, String str4, String str5) {
        cll.C16188a c16188aM107524p = cll.m107499l(ytr.m216073b("/live-gift/gift-skin/panel")).m107524p();
        c16188aM107524p.m107536c("source", str);
        c16188aM107524p.m107536c("roomId", str2);
        c16188aM107524p.m107536c("liveMode", str3);
        c16188aM107524p.m107536c("anchorId", str4);
        c16188aM107524p.m107536c("fakeId", str5);
        return upv.m194920h(c16188aM107524p.m107537d(), "getGiftSkinList" + str4).map(new w9j() { // from class: l.afv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSkinPanel;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m218614y(BLiveExtraResponse bLiveExtraResponse) {
        fld0<bgv> fld0Var = fld0.f98151f;
        ((bgv) ypv.m215673l(fld0Var)).m101745y(true);
        ((bgv) ypv.m215673l(fld0Var)).m101746z();
        return bLiveExtraResponse.data.batchGivenGiftRes;
    }

    /* JADX INFO: renamed from: y0 */
    public static C22306c<BLiveDragonScourgeDisplayChatMessage> m218615y0(String str) {
        return upv.m194935w(cll.m107499l(ytr.m216073b(String.format("/live-campaigns/dragon-scourge/anchors/%s/details/display-chat-message", str))), "getLiveDragonScourgeDisplayChatMessage" + str).map(new w9j() { // from class: l.dfv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dragonScourgeDisplayChatMessage;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public static List<BLiveMedalColorTemplate> m218617z0(final int i, @Nullable String str) {
        BLiveFanBaseMedal bLiveFanBaseMedal;
        if (!TextUtils.isEmpty(str)) {
            fld0<ggv> fld0Var = fld0.f98148c;
            if (((ggv) ypv.m215673l(fld0Var)).f102560u.containsKey(str)) {
                BLiveFanBaseMedal bLiveFanBaseMedal2 = (BLiveFanBaseMedal) vwb.m200346r(((ggv) ypv.m215673l(fld0Var)).f102560u.get(str).fanbaseMedals, new w9j() { // from class: l.xdv
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((BLiveFanBaseMedal) obj).grade == i);
                    }
                });
                if (bLiveFanBaseMedal2 == null) {
                    return null;
                }
                return bLiveFanBaseMedal2.colorTemplates;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            m218556d1();
        }
        fld0<ggv> fld0Var2 = fld0.f98148c;
        if (((ggv) ypv.m215673l(fld0Var2)).f102560u.isEmpty() || (bLiveFanBaseMedal = (BLiveFanBaseMedal) vwb.m200346r(((ggv) ypv.m215673l(fld0Var2)).f102560u.lastEntry().getValue().fanbaseMedals, new w9j() { // from class: l.ydv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseMedal) obj).grade == i);
            }
        })) == null) {
            return null;
        }
        return bLiveFanBaseMedal.colorTemplates;
    }

    /* JADX INFO: renamed from: l.zfv$a */
    public static class C21687a {

        /* JADX INFO: renamed from: a */
        public String f202982a;

        /* JADX INFO: renamed from: b */
        public String f202983b;

        /* JADX INFO: renamed from: c */
        public a f202984c;

        public C21687a(String str, String str2, a aVar) {
            this.f202982a = str;
            this.f202983b = str2;
            this.f202984c = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m218618a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            a aVar = this.f202984c;
            if (aVar == null) {
                lsi0.m151588r(" 送礼结果回调为空，请检查业务是否需要");
            } else if (aVar instanceof b) {
                ((b) aVar).mo67166a(bLiveGivenGiftBrief);
            } else {
                aVar.mo67166a(bLiveGivenGiftBrief);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m218619b() {
            return TextUtils.equals(this.f202982a, "closeH5Skin");
        }

        /* JADX INFO: renamed from: c */
        public boolean m218620c() {
            return TextUtils.equals(this.f202982a, "refreshCoins");
        }

        /* JADX INFO: renamed from: d */
        public boolean m218621d() {
            return TextUtils.equals(this.f202982a, "sendGift");
        }

        /* JADX INFO: renamed from: e */
        public boolean m218622e() {
            return TextUtils.equals(this.f202982a, "showFastRecharge");
        }

        /* JADX INFO: renamed from: l.zfv$a$a */
        public interface a {
            /* JADX INFO: renamed from: b */
            default void mo67167b() {
            }

            /* JADX INFO: renamed from: c */
            default void mo67168c() {
            }

            /* JADX INFO: renamed from: a */
            default void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }

        /* JADX INFO: renamed from: l.zfv$a$b */
        public interface b extends a {
            @Override // p149l.zfv.C21687a.a
            /* JADX INFO: renamed from: a */
            default void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }
    }
}
