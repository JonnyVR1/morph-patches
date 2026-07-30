package p002l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imagepipeline.common.Priority;
import com.p1.mobile.putong.data.LiveRegionTag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p1.mobile.putong.live.base.data.BLiveCoin;
import com.p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p1.mobile.putong.live.base.data.BLiveGameInfoReq;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p1.mobile.putong.live.base.data.BLiveMedals;
import com.p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import com.p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import com.p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.p1.mobile.putong.live.base.data.BLiveType;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftEquipInfo;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import l.bgv;
import l.cll;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hdu;
import l.hxs;
import l.i7n;
import l.ia20;
import l.jo0;
import l.lsi0;
import l.mt0;
import l.nvj;
import l.roj0;
import l.u6n;
import l.upv;
import l.v9j;
import l.vdt;
import l.vwb;
import l.w9j;
import l.y9j;
import l.ypv;
import l.ytr;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zfv {

    /* JADX INFO: renamed from: l.zfv$b */
    public static class C0941b {

        /* JADX INFO: renamed from: a */
        public String f23387a;

        /* JADX INFO: renamed from: b */
        public String f23388b;

        public C0941b(String str, String str2) {
            this.f23387a = str;
            this.f23388b = str2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ BLiveCoin m27196A(BLiveExtraResponse bLiveExtraResponse) {
        ((ggv) ypv.l(fld0.c)).C(Long.valueOf(bLiveExtraResponse.data.diamond.available));
        return bLiveExtraResponse.data.diamond;
    }

    /* JADX INFO: renamed from: A0 */
    public static c<BLiveGiftSetInfo> m27197A0(String str, String str2) {
        return upv.h(cll.r(ytr.b(String.format("/live-gift/users/me/rooms/%s/sets/%s", str2, str))).p().d(), "getLiveGiftSuitInfo").map(new w9j() { // from class: l.jfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSetInfo;
            }
        }).filter(new w9j() { // from class: l.kfv
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveGiftSetInfo) obj));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ c m27198B(BLiveAbsData bLiveAbsData, final BLiveRoomTabGifts bLiveRoomTabGifts) {
        return ((ggv) ypv.l(fld0.c)).A(bLiveRoomTabGifts.currentCDNVersion, bLiveRoomTabGifts.region.toString()) ? m27247Z0(bLiveRoomTabGifts.region, bLiveAbsData.type).map(new w9j() { // from class: l.jev
            public final Object call(Object obj) {
                return zfv.m27232S(bLiveRoomTabGifts, (roj0) obj);
            }
        }) : c.just(bLiveRoomTabGifts);
    }

    /* JADX INFO: renamed from: B0 */
    public static c<BLiveTouchMeDetail> m27199B0(String str) {
        return upv.w(cll.l(ytr.b("/live-campaigns/touchMe/anchors/" + str + "/details/status")), "getLiveGuideGiftSwitchConfig").map(new w9j() { // from class: l.pfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.touchMeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public static c<BLiveModelsFromCdnWarpData> m27201C0(BLiveEnvelope bLiveEnvelope) {
        final BLiveLiveMedalCDN bLiveLiveMedalCDN = bLiveEnvelope.data.liveMedalCDN;
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = (BLiveModelsFromCdnWarpData) ((bgv) ypv.l(fld0.f)).o.get();
        return (mmj.m18073r(bLiveLiveMedalCDN, bLiveModelsFromCdnWarpData).booleanValue() ? ia20.c(new v9j() { // from class: l.bev
            public final Object call() {
                return upv.c.auth().q(bLiveLiveMedalCDN.cdnUrl).f().b();
            }
        }, BLiveMedals.JSON_ADAPTER) : c.just(bLiveModelsFromCdnWarpData.liveModels)).map(new w9j() { // from class: l.cev
            public final Object call(Object obj) {
                return zfv.m27228Q(bLiveLiveMedalCDN, (BLiveMedals) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static c<BLiveOperation> m27203D0(@Nullable String str, String str2, String str3, String str4, String str5, String str6) {
        cll.a aVarC = cll.l(ytr.b("/live-operations")).p().c("anchorId", str2).c("roomId", str3).c("fakeId", w220.m24291b() ? w220.m24290a() : "").c("liveMode", str5).c("roomType", str4);
        if (!TextUtils.isEmpty(str)) {
            aVarC.c("type", str);
        }
        if (!TextUtils.isEmpty(str6)) {
            aVarC.c("hostId", str6);
        }
        return upv.h(aVarC.d(), "getLiveOperationPlace").map(new w9j() { // from class: l.hev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveOperation;
            }
        }).filter(new w9j() { // from class: l.iev
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveOperation) obj));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m27204E(ConcurrentHashMap concurrentHashMap, BLiveGiftItem bLiveGiftItem) {
        if (ypv.m()) {
            concurrentHashMap.put(Integer.valueOf(bLiveGiftItem.id), bLiveGiftItem);
            ((ggv) ypv.l(fld0.c)).k.put(Integer.valueOf(bLiveGiftItem.id), bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static c<BLivePageCampaign> m27205E0() {
        return upv.w(cll.l(ytr.b("/start-live-page-campaigns")), "getLivePageCampaigns").filter(new w9j() { // from class: l.sev
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.startLivePageCampaigns));
            }
        }).map(new w9j() { // from class: l.tev
            public final Object call(Object obj) {
                return zfv.m27220M((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static c<BLiveExtraResponse> m27207F0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/detail")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVarP.c("roomId", str2);
        }
        aVarP.c("source", "live");
        return upv.i(aVarP.d(), "getGiftWallDetailInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m27208G(Throwable th) {
    }

    /* JADX INFO: renamed from: G0 */
    public static c<BLiveExtraResponse> m27209G0(String str, String str2, String str3, String str4, String str5, String str6) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/gift/detail")).p();
        aVarP.c("from", str2);
        aVarP.c("to", str3);
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str4)) {
            aVarP.c("roomId", str4);
        }
        aVarP.c("source", "live");
        aVarP.c("giftId", str5);
        aVarP.c("fakeId", str6);
        return upv.i(aVarP.d(), "getNewGiftWallGiftDetail" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: H0 */
    public static c<BLiveExtraResponse> m27211H0(String str, String str2, String str3) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/gift/category/detail")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVarP.c("roomId", str2);
        }
        aVarP.c("source", "live");
        aVarP.c("categoryId", str3);
        return upv.i(aVarP.d(), "getNewGiftWallGiftTypeInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: I0 */
    public static c<BLiveExtraResponse> m27213I0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/set/detail")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVarP.c("roomId", str2);
        }
        aVarP.c("source", "live");
        return upv.i(aVarP.d(), "getNewGiftWallSet" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m27214J(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static c<BLiveExtraResponse> m27215J0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/skin/detail")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVarP.c("roomId", str2);
        }
        aVarP.c("source", "live");
        return upv.i(aVarP.d(), "getNewGiftWallSkin" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: K0 */
    public static c<BLiveExtraResponse> m27217K0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-wall-v2/summary")).p();
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            aVarP.c("roomId", str2);
        }
        aVarP.c("source", "live");
        return upv.i(aVarP.d(), "getNewGiftWallSummaryInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: L0 */
    public static String m27219L0(String str) {
        if (TextUtils.equals(str, "voice-live")) {
            return "voiceLive";
        }
        TextUtils.equals(str, "live");
        return "live";
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ BLivePageCampaign m27220M(BLiveEnvelope bLiveEnvelope) {
        return (BLivePageCampaign) bLiveEnvelope.data.startLivePageCampaigns.get(0);
    }

    /* JADX INFO: renamed from: M0 */
    public static c<BLiveEnvelope> m27221M0(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/scrap-tabs")).p();
        aVarP.c("scenario", str).c("roomId", str2).c("liveId", str3).c("anchorId", str4);
        return upv.h(aVarP.d(), "live-scrap");
    }

    /* JADX INFO: renamed from: N0 */
    public static c<BLiveEnterRoomEffect> m27223N0(String str, String str2, String str3, String str4) {
        cll.a aVarC = cll.l(ytr.b("/users/me/enter_room_effect")).p().c("roomId", str).c("liveId", str2).c("liveMode", str4);
        if ("live".equals(str3)) {
            aVarC.c("placeType", "videoRoom");
        } else if ("voice-live".equals(str3)) {
            aVarC.c("placeType", "voiceRoom").c("templateType", "profit");
        }
        return upv.w(aVarC.d(), "getSelfEnterRoomEffect").map(new w9j() { // from class: l.mfv
            public final Object call(Object obj) {
                return zfv.m27293p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public static c<BLiveData> m27225O0() {
        return upv.h(cll.l(ytr.b("/campaigns/new-user-reward/users/" + ypv.a.D0() + "/treasure-box")), "get_treasure_box_config").map(new w9j() { // from class: l.tfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public static c<BLiveTurboCardInfo> m27227P0(String str, String str2, String str3) {
        return upv.h(cll.r(ytr.b("/live/turboCardInfo")).p().c("userType", str).c("roomId", str2).c("liveMode", str3).d(), "getTurboCardInfo").map(new w9j() { // from class: l.vdv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.turboCardInfo;
            }
        }).filter(new w9j() { // from class: l.wdv
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveTurboCardInfo) obj));
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ BLiveModelsFromCdnWarpData m27228Q(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveMedals bLiveMedals) {
        if (bLiveMedals == null) {
            return null;
        }
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpDataNew_ = BLiveModelsFromCdnWarpData.new_();
        bLiveModelsFromCdnWarpDataNew_.liveModels = bLiveMedals;
        bLiveModelsFromCdnWarpDataNew_.version = bLiveLiveMedalCDN.version;
        ((bgv) ypv.l(fld0.f)).o.put(bLiveModelsFromCdnWarpDataNew_);
        return bLiveModelsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: Q0 */
    public static c<BLiveUpgradeGiftInfo> m27229Q0(String str) {
        return upv.h(cll.l(ytr.b(String.format("/live-gift/users/me/slots/%s", str))), "getUpgradeGiftInfo").map(new w9j() { // from class: l.nfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.slotInfo;
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static c<BLiveGivenGiftRemindStatus> m27231R0(String str, String str2, String str3, int i) {
        cll.a aVarP = cll.l(ytr.b("/gift/guide/recheck")).p();
        aVarP.c("source", m27219L0(str));
        aVarP.c("roomID", str2);
        aVarP.c("liveID", str3);
        aVarP.c("remindID", String.valueOf(i));
        return upv.h(aVarP.d(), "giftGuideRecheck").map(new w9j() { // from class: l.ifv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindStatus;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BLiveRoomTabGifts m27232S(BLiveRoomTabGifts bLiveRoomTabGifts, roj0 roj0Var) {
        return bLiveRoomTabGifts;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m27233S0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq) {
        if (bLiveSendLiveGiftReq == null || ypv.f.getHeader() == null || TextUtils.isEmpty(bLiveSendLiveGiftReq.extraInfo.voiceLive.mainUserId)) {
            return;
        }
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = bLiveSendLiveGiftReq.extraInfo.voiceLive;
        String str = (String) ypv.f.getHeader().get("X-TT-Live-AnchorID");
        if (TextUtils.isEmpty(str) || bLiveGiftExtraVoiceInfo.mainUserId.equals(str)) {
            return;
        }
        CrashHelper.e(new IllegalStateException("send gift mainuserId is error : mainUserId = " + bLiveGiftExtraVoiceInfo.mainUserId + " , headerAnchorId = " + str), "国际化送礼参数错误", CrashHelper.ReportLevel.p9);
    }

    /* JADX INFO: renamed from: T0 */
    public static boolean m27235T0(BLiveEnvelope bLiveEnvelope) {
        return !TextUtils.isEmpty(bLiveEnvelope.data.liveMedalCDN.cdnUrl);
    }

    /* JADX INFO: renamed from: U0 */
    public static c<List<BLiveCampaign>> m27237U0(@NonNull String str, String str2, String str3, String str4, String str5) {
        cll.a aVarC = cll.l(ytr.b("/live-campaigns")).p().c("anchorUserID", str).c("source", str2).c("liveMode", str4);
        if (!TextUtils.isEmpty(str3)) {
            aVarC.c("content", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVarC.c("hostId", str5);
        }
        return upv.w(aVarC.d(), "live-campaign").map(new w9j() { // from class: l.udv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveCampaigns;
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public static void m27239V0(BLiveType bLiveType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        String string = bLiveType.toString();
        if (TextUtils.equals(string, "app")) {
            aqe.m10039i().m10051p(pair);
        } else if (TextUtils.equals(string, "live") || TextUtils.equals(string, "voiceLive")) {
            ((ggv) ypv.l(fld0.c)).E((BLiveResourceInfo) pair.first);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static roj0 m27241W0(BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        if (bLiveModelsFromCdnWarpData != null) {
            ((ggv) ypv.l(fld0.c)).u.put(bLiveModelsFromCdnWarpData.version, bLiveModelsFromCdnWarpData.liveModels);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: X0 */
    public static roj0 m27243X0(BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        if (!vwb.J(bLiveGiftsFromCdnWarpData.giftList)) {
            final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            mmj.m18051L(bLiveGiftsFromCdnWarpData.giftList, new e30() { // from class: l.dev
                public final void call(Object obj) {
                    zfv.m27204E(concurrentHashMap, (BLiveGiftItem) obj);
                }
            });
            if (ypv.m()) {
                ((ggv) ypv.l(fld0.c)).l.put(bLiveGiftsFromCdnWarpData.serverRegion, concurrentHashMap);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static c<roj0> m27245Y0(LiveRegionTag liveRegionTag) {
        return m27247Z0(liveRegionTag, "");
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ BLiveCoin m27246Z(BLiveExtraResponse bLiveExtraResponse) {
        ((ggv) ypv.l(fld0.c)).C(Long.valueOf(bLiveExtraResponse.data.coins.available));
        return bLiveExtraResponse.data.coins;
    }

    /* JADX INFO: renamed from: Z0 */
    public static c<roj0> m27247Z0(LiveRegionTag liveRegionTag, String str) {
        cll.a aVarP = cll.l(ytr.b("/gift_items_cdn")).p();
        if (!TEnum.equals(liveRegionTag, "unknown_")) {
            aVarP.c("region", liveRegionTag.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("liveType", hdu.a(str));
        }
        return upv.h(aVarP.d(), "liveGiftItemsUrl").filter(new w9j() { // from class: l.ndv
            public final Object call(Object obj) {
                return Boolean.valueOf(mmj.m18049J((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.odv
            public final Object call(Object obj) {
                return zfv.m27314w0((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.pdv
            public final Object call(Object obj) {
                return zfv.m27243X0((BLiveGiftsFromCdnWarpData) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveHierarchyProgress m27248a(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public static void m27250a1(final String str, final bwc0 bwc0Var, @Nullable final h7e h7eVar) {
        cll.a aVarP = cll.l(ytr.b("/live-resource/resources/" + str)).p();
        if (i7n.c()) {
            aVarP.c("intlDegrade", "1");
        }
        upv.h(aVarP.d(), "pollLiveEffectBean" + str).map(new w9j() { // from class: l.fev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResources;
            }
        }).subscribe(ffw.e(new e30() { // from class: l.qev
            public final void call(Object obj) {
                zfv.m27302s(h7eVar, bwc0Var, (List) obj);
            }
        }, new e30() { // from class: l.bfv
            public final void call(Object obj) {
                zfv.m27308u(h7eVar, str, bwc0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ BLiveResourceInfo m27252b0(BLiveResourceInfo bLiveResourceInfo) {
        ((bgv) ypv.l(fld0.f)).m.put(bLiveResourceInfo);
        aqe.m10039i().m10043g(bLiveResourceInfo);
        wrj.m25427u("更新资源version： " + bLiveResourceInfo.version);
        return bLiveResourceInfo;
    }

    /* JADX INFO: renamed from: b1 */
    public static void m27253b1(String str, String str2, final BLiveType bLiveType) {
        cll.a aVarC = cll.l(ytr.b("/live-resource/resources-cdn")).p().c("roomID", str).c("anchorID", str2).c("source", bLiveType.toString());
        if (i7n.c()) {
            aVarC.c("intlDegrade", "1");
        }
        upv.h(aVarC.d(), "pollLiveEffectCDN").observeOn(Schedulers.io()).map(new w9j() { // from class: l.kev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResourcesCDN;
            }
        }).filter(new w9j() { // from class: l.lev
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveResourceCDN) obj));
            }
        }).flatMap(new w9j() { // from class: l.mev
            public final Object call(Object obj) {
                return zfv.m27299r((BLiveResourceCDN) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.nev
            public final void call(Object obj) {
                zfv.m27239V0(bLiveType, (Pair) obj);
            }
        }, new e30() { // from class: l.oev
            public final void call(Object obj) {
                wrj.m25427u("EffectManager pollLiveEffectList error:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public static c<roj0> m27256c1() {
        fld0 fld0Var = fld0.c;
        return (((ggv) ypv.l(fld0Var)).u == null || ((ggv) ypv.l(fld0Var)).u.isEmpty()) ? upv.h(cll.l(ytr.b("/live-medals-cdn")).p().d(), "LiveMedalsFromCdn").filter(new w9j() { // from class: l.yfv
            public final Object call(Object obj) {
                return Boolean.valueOf(zfv.m27235T0((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.kdv
            public final Object call(Object obj) {
                return zfv.m27201C0((BLiveEnvelope) obj);
            }
        }).map(new w9j() { // from class: l.ldv
            public final Object call(Object obj) {
                return zfv.m27241W0((BLiveModelsFromCdnWarpData) obj);
            }
        }).observeOn(jo0.a()) : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ roj0 m27258d0(BLiveEnvelope bLiveEnvelope) {
        List<BLiveUserLevel> list = bLiveEnvelope.data.liveHierarchyGrades;
        ((ggv) ypv.l(fld0.c)).w = bLiveEnvelope.data.momentConfig;
        if (list != null) {
            for (BLiveUserLevel bLiveUserLevel : list) {
                ((ggv) ypv.l(fld0.c)).v.put(Long.valueOf(bLiveUserLevel.grade), bLiveUserLevel);
                hxs.B("context_livingAct", bLiveUserLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        List<BLiveAnchorLevel> list2 = bLiveEnvelope.data.anchorHierarchyGrades;
        if (list2 != null) {
            for (BLiveAnchorLevel bLiveAnchorLevel : list2) {
                ((ggv) ypv.l(fld0.c)).x.put(Long.valueOf(bLiveAnchorLevel.grade), bLiveAnchorLevel);
                hxs.B("context_livingAct", bLiveAnchorLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: d1 */
    public static void m27259d1() {
        m27256c1().subscribe(ffw.e(new e30() { // from class: l.pev
            public final void call(Object obj) {
                zfv.m27260e((roj0) obj);
            }
        }, new e30() { // from class: l.rev
            public final void call(Object obj) {
                zfv.m27208G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m27260e(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: e1 */
    public static c<Pair<BLiveResourceInfo, BLiveResourceCDN>> m27262e1(final BLiveResourceCDN bLiveResourceCDN) {
        ((bgv) ypv.l(fld0.f)).l.put(bLiveResourceCDN);
        String str = bLiveResourceCDN.cdnUrl;
        return ia20.c(new v9j() { // from class: l.efv
            public final Object call() {
                return upv.c.auth().q(bLiveResourceCDN.cdnUrl).f().b();
            }
        }, BLiveResourceInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.ffv
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((BLiveResourceInfo) obj));
            }
        }).map(new w9j() { // from class: l.gfv
            public final Object call(Object obj) {
                return zfv.m27252b0((BLiveResourceInfo) obj);
            }
        }).flatMap(new w9j() { // from class: l.hfv
            public final Object call(Object obj) {
                return c.just(new Pair((BLiveResourceInfo) obj, bLiveResourceCDN));
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static c<BLiveRoomTabGifts> m27265f1(evj evjVar, final BLiveAbsData bLiveAbsData) {
        String str;
        cll.a aVarC = cll.r(ytr.b("/tab_gift_items")).p().c("source", m27303s0(evjVar)).c("roomId", evjVar.m12708c()).c("liveMode", bLiveAbsData.liveMode).c("anchorId", evjVar.m12706a());
        if (w220.m24291b()) {
            aVarC.c("fakeId", w220.m24290a());
        }
        if (TextUtils.isEmpty(evjVar.m12709d())) {
            str = "tab_gift_items";
        } else {
            str = "tab_gift_items_" + evjVar.m12709d();
        }
        return upv.h(aVarC.d(), str).filter(new w9j() { // from class: l.vfv
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J(((BLiveEnvelope) obj).data.liveRoomTabGifts.giftTabs));
            }
        }).map(new w9j() { // from class: l.wfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveRoomTabGifts;
            }
        }).flatMap(new w9j() { // from class: l.xfv
            public final Object call(Object obj) {
                return zfv.m27198B(bLiveAbsData, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ BLiveGiftsFromCdnWarpData m27266g(List list, String str, String str2) {
        final BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpDataNew_ = BLiveGiftsFromCdnWarpData.new_();
        bLiveGiftsFromCdnWarpDataNew_.giftList = list;
        bLiveGiftsFromCdnWarpDataNew_.serverRegion = str;
        bLiveGiftsFromCdnWarpDataNew_.version = str2;
        e51.y(new Runnable() { // from class: l.cfv
            @Override // java.lang.Runnable
            public final void run() {
                ((bgv) ypv.l(fld0.f)).n.put(bLiveGiftsFromCdnWarpDataNew_);
            }
        });
        return bLiveGiftsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ BLiveData m27267g0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq, BLiveEnvelope bLiveEnvelope) {
        fld0 fld0Var = fld0.f;
        ((bgv) ypv.l(fld0Var)).y(true);
        ((bgv) ypv.l(fld0Var)).z();
        BLiveData bLiveData = bLiveEnvelope.data;
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveData.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            bLiveSendLiveGiftResult.givenGiftBrief.sendGiftOriginalId = bLiveSendLiveGiftReq.originalId;
        }
        return bLiveData;
    }

    /* JADX INFO: renamed from: g1 */
    public static c<roj0> m27268g1() {
        return upv.h(cll.l(ytr.b("/live-hierarchy")), "pollUserLevelConfig").map(new w9j() { // from class: l.uev
            public final Object call(Object obj) {
                return zfv.m27258d0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static c<BLiveEnvelope> m27271h1(boolean z, String str) {
        return upv.e(LiveApiBuilder.u(ytr.b("/live-campaigns/dragon-scourge/anchors/" + str + "/details/records"), new mt0[]{mt0.a("action", z ? "accept" : "reject")}), "postDragonScourgeControl" + str, "");
    }

    /* JADX INFO: renamed from: i1 */
    public static c<Boolean> m27274i1(String str, boolean z) {
        cll cllVarU = LiveApiBuilder.u(ytr.b("/live-campaigns/touchMe/anchors/" + str + "/details/changeStatus"), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openStatus", z);
        } catch (JSONException unused) {
        }
        return upv.e(cllVarU, "postLiveGuideGiftSwitchConfig" + str, jSONObject.toString()).map(new w9j() { // from class: l.qfv
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }).onErrorReturn(new w9j() { // from class: l.rfv
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public static void m27276j0(BLiveCampaignNotifyData bLiveCampaignNotifyData) {
        upv.p(cll.l(ytr.b("/campaign/watch_live_ok")), "campaignCountdownNotify", bLiveCampaignNotifyData.toJson()).subscribe(ffw.e(new e30() { // from class: l.zdv
            public final void call(Object obj) {
                zfv.m27278k((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.aev
            public final void call(Object obj) {
                zfv.m27214J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public static c<BLiveData> m27277j1() {
        return upv.g(cll.l(ytr.b("/campaigns/new-user-reward/users/" + ypv.a.D0() + "/treasure-box")).p().c("status", "completed").d(), "patch_treasure_box_config", "").map(new w9j() { // from class: l.ufv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m27278k(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: k0 */
    public static c<BLiveExtraResponse> m27279k0(String str) {
        cll.a aVarP = cll.l(ytr.b("/live/unjail-card/anchor-info")).p();
        aVarP.c("anchorId", str);
        return upv.k(aVarP.d(), "checkAndGetAnchorNameById", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: k1 */
    public static c<BLiveCoin> m27280k1() {
        return u6n.a() ? m27283l1() : m27286m1();
    }

    /* JADX INFO: renamed from: l0 */
    public static c<BLiveExtraResponse> m27282l0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live/can-give-naming-card")).p();
        aVarP.c("anchorId", str);
        aVarP.c("roomId", str2);
        return upv.k(aVarP.d(), "/live/can-give-naming-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: l1 */
    public static c<BLiveCoin> m27283l1() {
        return upv.i(cll.l(ytr.b("/users/" + ypv.a.D0() + "/diamond?agent=true")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.qdv
            public final Object call(Object obj) {
                return zfv.m27196A((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static c<BLiveExtraResponse> m27285m0(String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live/can-give-unjail-card")).p();
        aVarP.c("anchorId", str);
        aVarP.c("roomId", str2);
        return upv.k(aVarP.d(), "/live/can-give-unjail-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: m1 */
    public static c<BLiveCoin> m27286m1() {
        return upv.i(cll.l(ytr.h("/coins")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.mdv
            public final Object call(Object obj) {
                return zfv.m27246Z((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static c<BLiveEnvelope> m27288n0(@NotNull String str, @NotNull BLiveScrapCraftReq bLiveScrapCraftReq) {
        return upv.e(cll.l(ytr.b("/live-gift/scraps/" + str + "/craft")).p().d(), "craftScrap", bLiveScrapCraftReq.toJson());
    }

    /* JADX INFO: renamed from: n1 */
    public static c<List<BLiveGiftSkin>> m27289n1(nvj nvjVar) {
        return upv.h(cll.l(ytr.b("/live-gift/users/" + ypv.a.D0() + "/tab/skins")).p().c("anchorId", nvjVar.a()).c("scenario", nvjVar.e()).c("liveId", nvjVar.c()).c("roomId", nvjVar.d()).c("fakeId", nvjVar.b()).d(), "getGiftSkinInfo").map(new w9j() { // from class: l.zev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skins;
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static c<BLiveEnvelope> m27291o0(String str, String str2) {
        String string = UUID.randomUUID().toString();
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/live-gift/gift-wall-v2/skin/equip"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("originalId", string);
        jSONObject.put("giftId", str);
        jSONObject.put("skinId", str2);
        return upv.e(aVarM.d(), "equipGiftSkin" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: o1 */
    public static c<BLiveHierarchyProgress> m27292o1(String str) {
        if ("voice-live".equals(str)) {
            str = "voiceLive";
        }
        cll.a aVarP = cll.l(ytr.b("/users/me/hierarchy-progress")).p();
        if (w220.m24291b()) {
            aVarP.c("fakeId", w220.m24290a());
        }
        if (!TextUtils.isEmpty(str)) {
            aVarP.c("liveType", str);
        }
        return upv.h(aVarP.d(), "requestLiveHierarchyProgress").map(new w9j() { // from class: l.wev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchyProgress;
            }
        }).onErrorReturn(new w9j() { // from class: l.xev
            public final Object call(Object obj) {
                return zfv.m27248a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveEnterRoomEffect m27293p(BLiveEnvelope bLiveEnvelope) {
        if (vwb.J(bLiveEnvelope.data.userEnterRoomEffects)) {
            return null;
        }
        return (BLiveEnterRoomEffect) bLiveEnvelope.data.userEnterRoomEffects.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static c<BLiveEnvelope> m27294p0(boolean z, String str, String str2, String str3, String str4, String str5) {
        String string = UUID.randomUUID().toString();
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/live-gift/gift-skin/action/".concat(z ? "equip" : "unequip")));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", "live");
        jSONObject.put("liveMode", str3);
        jSONObject.put("originalId", string);
        jSONObject.put("id", str);
        jSONObject.put("roomId", str2);
        jSONObject.put("anchorId", str4);
        jSONObject.put("fakeId", str5);
        return upv.e(aVarM.d(), "equipGiftSkin2" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: p1 */
    public static c<BLiveUserLevel> m27295p1() {
        return upv.h(cll.l(ytr.b("/users/me/hierarchy")), "getMyLiveHierarchy").map(new w9j() { // from class: l.yev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchy;
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static c<BLiveGiftItem> m27297q0(String str, String str2, String str3, String str4) {
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfoNew_ = BLiveUpgradeGiftEquipInfo.new_();
        bLiveUpgradeGiftEquipInfoNew_.itemId = str2;
        bLiveUpgradeGiftEquipInfoNew_.roomId = str3;
        bLiveUpgradeGiftEquipInfoNew_.anchorId = str4;
        return upv.e(cll.l(ytr.b(String.format("/live-gift/users/me/slots/%s/equip-gift", str))), "equipUpgradeGift", bLiveUpgradeGiftEquipInfoNew_.toJson()).map(new w9j() { // from class: l.jdv
            public final Object call(Object obj) {
                return mmj.m18069n(((BLiveEnvelope) obj).data.equippedGift);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public static c<BLiveData> m27298q1(pge0 pge0Var) {
        final BLiveSendLiveGiftReq bLiveSendLiveGiftReqM20242b = pge0Var.m20242b();
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/users/me/gifts/" + pge0Var.m20247h()));
        if (w220.m24291b()) {
            bLiveSendLiveGiftReqM20242b.fakeId = w220.m24290a();
        }
        if (!vdt.b(1)) {
            try {
                m27233S0(bLiveSendLiveGiftReqM20242b);
            } catch (Exception e) {
                CrashHelper.c(e);
                e.getMessage();
            }
        }
        return upv.e(aVarM.d(), "sendLiveGift", bLiveSendLiveGiftReqM20242b.toJson()).map(new w9j() { // from class: l.lfv
            public final Object call(Object obj) {
                return zfv.m27267g0(bLiveSendLiveGiftReqM20242b, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ c m27299r(BLiveResourceCDN bLiveResourceCDN) {
        fld0 fld0Var = fld0.f;
        BLiveResourceCDN bLiveResourceCDN2 = (BLiveResourceCDN) ((bgv) ypv.l(fld0Var)).l.get();
        if (bLiveResourceCDN2 == null || !bLiveResourceCDN2.version.equals(bLiveResourceCDN.version) || !TEnum.equals(bLiveResourceCDN2.region, bLiveResourceCDN.region)) {
            return m27262e1(bLiveResourceCDN);
        }
        BLiveResourceInfo bLiveResourceInfo = (BLiveResourceInfo) ((bgv) ypv.l(fld0Var)).m.get();
        if (bLiveResourceInfo == null) {
            return m27262e1(bLiveResourceCDN);
        }
        wrj.m25427u("EffectManager pollLiveEffectList success local");
        return c.just(new Pair(bLiveResourceInfo, bLiveResourceCDN));
    }

    /* JADX INFO: renamed from: r0 */
    public static String m27300r0(long j) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        return decimalFormat.format(j);
    }

    /* JADX INFO: renamed from: r1 */
    public static c<List<BLiveSendLiveMultiGiftResultItem>> m27301r1(pge0 pge0Var) {
        return upv.f(LiveApiBuilder.m(ytr.b("/users/me/batch-gifts")).d(), "sendMultiLiveGiftWithBatch", BLiveExtraResponse.JSON_ADAPTER, new pee0(pge0Var).m20192a().toJson()).map(new w9j() { // from class: l.ofv
            public final Object call(Object obj) {
                return zfv.m27317y((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m27302s(h7e h7eVar, bwc0 bwc0Var, List list) {
        if (vwb.J(list)) {
            return;
        }
        if (h7eVar != null) {
            BLiveEffect bLiveEffect = (BLiveEffect) list.get(0);
            h7eVar.mo7820c(spe.m22604d(bLiveEffect.type).mo11106d(bLiveEffect));
        }
        aqe.m10039i().m10049n((BLiveEffect) list.get(0), null, bwc0Var, h7eVar);
    }

    /* JADX INFO: renamed from: s0 */
    public static String m27303s0(evj evjVar) {
        return mmj.m18076u(evjVar.m12709d());
    }

    /* JADX INFO: renamed from: s1 */
    public static c<BLiveEnvelope> m27304s1(String str, boolean z, int i) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/live-users/" + str + "/daily-payment"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("status", z ? "enable" : "disable");
        jSONObject.put("amount", Integer.valueOf(i));
        return upv.e(aVarM.d(), "liveSetConsumeAlert", jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: t0 */
    public static c<BLiveTabGiftExpiration> m27306t0(int i, String str, String str2) {
        cll.a aVarP = cll.l(ytr.b("/live-bagpack/item")).p();
        cll.a aVarC = aVarP.c("id", i + "").c("roomId", str);
        if (TextUtils.equals("voice-live", str2)) {
            str2 = "voiceLive";
        }
        aVarC.c("liveType", str2);
        return upv.h(aVarP.d(), "getBackTabGiftExpiration" + str + i).map(new w9j() { // from class: l.sfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bagpackItem;
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    public static void m27307t1() {
        upv.e(cll.l(ytr.b("/live/setTurboCardShown")), "setTurboCardShown", "");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m27308u(h7e h7eVar, String str, bwc0 bwc0Var, Throwable th) {
        if (h7eVar != null) {
            h7eVar.mo8834d("pollEffectById Failed");
        }
        nqe.m18945H(str, "", "", "request");
        wrj.m25427u("EffectManager pollLiveEffectBean error:" + th.getMessage());
        nqe.m18969x(bwc0Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static c<BLiveDailyPayment> m27309u0(String str) {
        return upv.w(cll.l(ytr.b("/live-users/" + str + "/daily-payment")).p().d(), "getConsumeAlertBoardInfo").map(new w9j() { // from class: l.vev
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dailyPayment;
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public static c<BLiveEnvelope> m27310u1(String str, BLiveGameInfoReq bLiveGameInfoReq) {
        if (w220.m24291b()) {
            bLiveGameInfoReq.fakeId = w220.m24290a();
        }
        return upv.g(cll.l(ytr.b("/live-gift/" + str)), "LiveGameGRequest", bLiveGameInfoReq.toJson());
    }

    /* JADX INFO: renamed from: v0 */
    public static c<BLiveGiftBubbleConfig> m27312v0(String str, String str2, String str3, String str4) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/gift_bubble_config"));
        aVarM.c("source", str);
        aVarM.c("anchorID", str2);
        aVarM.c("liveID", str3);
        aVarM.c("roomID", str4);
        if (w220.m24291b()) {
            aVarM.c("fakeId", w220.m24290a());
        }
        return upv.h(aVarM.d(), "getGiftBubbleConfig").map(new w9j() { // from class: l.rdv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindConfig;
            }
        }).filter(new w9j() { // from class: l.sdv
            public final Object call(Object obj) {
                BLiveGiftBubbleConfig bLiveGiftBubbleConfig = (BLiveGiftBubbleConfig) obj;
                return Boolean.valueOf(bLiveGiftBubbleConfig != null && bLiveGiftBubbleConfig.isValid());
            }
        }).map(new w9j() { // from class: l.tdv
            public final Object call(Object obj) {
                return zfv.m27313w((BLiveGiftBubbleConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ BLiveGiftBubbleConfig m27313w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.schema)) {
            bLiveGiftBubbleConfig.button.jumpType = BLiveGiftBubblePopupButtonJumpType.get("schema");
        }
        bLiveGiftBubbleConfig.isCircle = true;
        bLiveGiftBubbleConfig.isFromLongLink = false;
        return bLiveGiftBubbleConfig;
    }

    /* JADX INFO: renamed from: w0 */
    public static c<BLiveGiftsFromCdnWarpData> m27314w0(BLiveEnvelope bLiveEnvelope) {
        final BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        ((ggv) ypv.l(fld0.c)).j.put(bLiveGiftItemCDN.region, Long.valueOf(Long.parseLong(bLiveGiftItemCDN.version)));
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = (BLiveGiftsFromCdnWarpData) ((bgv) ypv.l(fld0.f)).n.get();
        return c.zip(mmj.m18072q(bLiveGiftItemCDN, bLiveGiftsFromCdnWarpData).booleanValue() ? ia20.c(new v9j() { // from class: l.eev
            public final Object call() {
                return upv.c.auth().q(bLiveGiftItemCDN.giftItemsCDNUrl).f().b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveGiftItem.JSON_ADAPTER)) : c.just(bLiveGiftsFromCdnWarpData.giftList), c.just(bLiveGiftItemCDN.region), c.just(bLiveGiftItemCDN.version), new y9j() { // from class: l.gev
            /* JADX INFO: renamed from: a */
            public final Object m13772a(Object obj, Object obj2, Object obj3) {
                return zfv.m27266g((List) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static c<BLiveNewGiftSkinListData> m27316x0(String str, String str2, String str3, String str4, String str5) {
        cll.a aVarP = cll.l(ytr.b("/live-gift/gift-skin/panel")).p();
        aVarP.c("source", str);
        aVarP.c("roomId", str2);
        aVarP.c("liveMode", str3);
        aVarP.c("anchorId", str4);
        aVarP.c("fakeId", str5);
        return upv.h(aVarP.d(), "getGiftSkinList" + str4).map(new w9j() { // from class: l.afv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSkinPanel;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m27317y(BLiveExtraResponse bLiveExtraResponse) {
        fld0 fld0Var = fld0.f;
        ((bgv) ypv.l(fld0Var)).y(true);
        ((bgv) ypv.l(fld0Var)).z();
        return bLiveExtraResponse.data.batchGivenGiftRes;
    }

    /* JADX INFO: renamed from: y0 */
    public static c<BLiveDragonScourgeDisplayChatMessage> m27318y0(String str) {
        return upv.w(cll.l(ytr.b(String.format("/live-campaigns/dragon-scourge/anchors/%s/details/display-chat-message", str))), "getLiveDragonScourgeDisplayChatMessage" + str).map(new w9j() { // from class: l.dfv
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dragonScourgeDisplayChatMessage;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public static List<BLiveMedalColorTemplate> m27320z0(final int i, @Nullable String str) {
        BLiveFanBaseMedal bLiveFanBaseMedal;
        if (!TextUtils.isEmpty(str)) {
            fld0 fld0Var = fld0.c;
            if (((ggv) ypv.l(fld0Var)).u.containsKey(str)) {
                BLiveFanBaseMedal bLiveFanBaseMedal2 = (BLiveFanBaseMedal) vwb.r(((BLiveMedals) ((ggv) ypv.l(fld0Var)).u.get(str)).fanbaseMedals, new w9j() { // from class: l.xdv
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
            m27259d1();
        }
        fld0 fld0Var2 = fld0.c;
        if (((ggv) ypv.l(fld0Var2)).u.isEmpty() || (bLiveFanBaseMedal = (BLiveFanBaseMedal) vwb.r(((BLiveMedals) ((ggv) ypv.l(fld0Var2)).u.lastEntry().getValue()).fanbaseMedals, new w9j() { // from class: l.ydv
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseMedal) obj).grade == i);
            }
        })) == null) {
            return null;
        }
        return bLiveFanBaseMedal.colorTemplates;
    }

    /* JADX INFO: renamed from: l.zfv$a */
    public static class C0940a {

        /* JADX INFO: renamed from: a */
        public String f23384a;

        /* JADX INFO: renamed from: b */
        public String f23385b;

        /* JADX INFO: renamed from: c */
        public a f23386c;

        public C0940a(String str, String str2, a aVar) {
            this.f23384a = str;
            this.f23385b = str2;
            this.f23386c = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m27321a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            a aVar = this.f23386c;
            if (aVar == null) {
                lsi0.r(" 送礼结果回调为空，请检查业务是否需要");
            } else if (aVar instanceof b) {
                ((b) aVar).mo5855a(bLiveGivenGiftBrief);
            } else {
                aVar.mo5855a(bLiveGivenGiftBrief);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m27322b() {
            return TextUtils.equals(this.f23384a, "closeH5Skin");
        }

        /* JADX INFO: renamed from: c */
        public boolean m27323c() {
            return TextUtils.equals(this.f23384a, "refreshCoins");
        }

        /* JADX INFO: renamed from: d */
        public boolean m27324d() {
            return TextUtils.equals(this.f23384a, "sendGift");
        }

        /* JADX INFO: renamed from: e */
        public boolean m27325e() {
            return TextUtils.equals(this.f23384a, "showFastRecharge");
        }

        /* JADX INFO: renamed from: l.zfv$a$a */
        public interface a {
            /* JADX INFO: renamed from: b */
            default void mo5856b() {
            }

            /* JADX INFO: renamed from: c */
            default void mo5857c() {
            }

            /* JADX INFO: renamed from: a */
            default void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }

        /* JADX INFO: renamed from: l.zfv$a$b */
        public interface b extends a {
            @Override // p002l.zfv.C0940a.a
            /* JADX INFO: renamed from: a */
            default void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }
    }
}
