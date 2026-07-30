package p153l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.facebook.imagepipeline.common.Priority;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignNotifyData;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveDailyPayment;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveDragonScourgeDisplayChatMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoomEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveGameInfoReq;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupButtonJumpType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraVoiceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItemCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftsFromCdnWarpData;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftRemindStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveHierarchyProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveLiveMedalCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveModelsFromCdnWarpData;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkinListData;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomTabGifts;
import com.p051p1.mobile.putong.live.base.data.BLiveScrapCraftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftReq;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveGiftResult;
import com.p051p1.mobile.putong.live.base.data.BLiveSendLiveMultiGiftResultItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTabGiftExpiration;
import com.p051p1.mobile.putong.live.base.data.BLiveTouchMeDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftEquipInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
public class aiv {

    /* JADX INFO: renamed from: l.aiv$b */
    public static class C15717b {

        /* JADX INFO: renamed from: a */
        public String f71581a;

        /* JADX INFO: renamed from: b */
        public String f71582b;

        public C15717b(String str, String str2) {
            this.f71581a = str;
            this.f71582b = str2;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ BLiveCoin m98027A(BLiveExtraResponse bLiveExtraResponse) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135143C(Long.valueOf(bLiveExtraResponse.data.diamond.available));
        return bLiveExtraResponse.data.diamond;
    }

    /* JADX INFO: renamed from: A0 */
    public static C22421c<BLiveGiftSetInfo> m98028A0(String str, String str2) {
        return vrv.m202547h(rnl.m182265r(zvr.m221802b(String.format("/live-gift/users/me/rooms/%s/sets/%s", str2, str))).m182288p().m182301d(), "getLiveGiftSuitInfo").map(new qcj() { // from class: l.khv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSetInfo;
            }
        }).filter(new qcj() { // from class: l.lhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveGiftSetInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22421c m98029B(BLiveAbsData bLiveAbsData, final BLiveRoomTabGifts bLiveRoomTabGifts) {
        return ((hiv) zrv.m221194l(htd0.f111521c)).m135141A(bLiveRoomTabGifts.currentCDNVersion, bLiveRoomTabGifts.region.toString()) ? m98078Z0(bLiveRoomTabGifts.region, bLiveAbsData.type).map(new qcj() { // from class: l.kgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98063S(bLiveRoomTabGifts, (uxj0) obj);
            }
        }) : C22421c.just(bLiveRoomTabGifts);
    }

    /* JADX INFO: renamed from: B0 */
    public static C22421c<BLiveTouchMeDetail> m98030B0(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-campaigns/touchMe/anchors/" + str + "/details/status")), "getLiveGuideGiftSwitchConfig").map(new qcj() { // from class: l.qhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.touchMeDetail;
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public static C22421c<BLiveModelsFromCdnWarpData> m98032C0(BLiveEnvelope bLiveEnvelope) {
        final BLiveLiveMedalCDN bLiveLiveMedalCDN = bLiveEnvelope.data.liveMedalCDN;
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData = ((civ) zrv.m221194l(htd0.f111524f)).f82008o.get();
        return (cpj.m111798r(bLiveLiveMedalCDN, bLiveModelsFromCdnWarpData).booleanValue() ? qi20.m176656c(new pcj() { // from class: l.cgv
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.f185526c.auth().m209043q(bLiveLiveMedalCDN.cdnUrl).m209032f().m209028b();
            }
        }, BLiveMedals.JSON_ADAPTER) : C22421c.just(bLiveModelsFromCdnWarpData.liveModels)).map(new qcj() { // from class: l.dgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98059Q(bLiveLiveMedalCDN, (BLiveMedals) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static C22421c<BLiveOperation> m98034D0(@Nullable String str, String str2, String str3, String str4, String str5, String str6) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-operations")).m182288p().m182300c("anchorId", str2).m182300c("roomId", str3).m182300c("fakeId", eb20.m120149b() ? eb20.m120148a() : "").m182300c("liveMode", str5).m182300c("roomType", str4);
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("type", str);
        }
        if (!TextUtils.isEmpty(str6)) {
            c19886aM182300c.m182300c("hostId", str6);
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), "getLiveOperationPlace").map(new qcj() { // from class: l.igv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveOperation;
            }
        }).filter(new qcj() { // from class: l.jgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveOperation) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m98035E(ConcurrentHashMap concurrentHashMap, BLiveGiftItem bLiveGiftItem) {
        if (zrv.m221195m()) {
            concurrentHashMap.put(Integer.valueOf(bLiveGiftItem.f45225id), bLiveGiftItem);
            ((hiv) zrv.m221194l(htd0.f111521c)).f110080k.put(Integer.valueOf(bLiveGiftItem.f45225id), bLiveGiftItem);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static C22421c<BLivePageCampaign> m98036E0() {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/start-live-page-campaigns")), "getLivePageCampaigns").filter(new qcj() { // from class: l.tgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.startLivePageCampaigns));
            }
        }).map(new qcj() { // from class: l.ugv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.startLivePageCampaigns.get(0);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public static C22421c<BLiveExtraResponse> m98038F0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/detail")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("roomId", str2);
        }
        c19886aM182288p.m182300c("source", "live");
        return vrv.m202548i(c19886aM182288p.m182301d(), "getGiftWallDetailInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m98039G(Throwable th) {
    }

    /* JADX INFO: renamed from: G0 */
    public static C22421c<BLiveExtraResponse> m98040G0(String str, String str2, String str3, String str4, String str5, String str6) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/gift/detail")).m182288p();
        c19886aM182288p.m182300c("from", str2);
        c19886aM182288p.m182300c("to", str3);
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str4)) {
            c19886aM182288p.m182300c("roomId", str4);
        }
        c19886aM182288p.m182300c("source", "live");
        c19886aM182288p.m182300c("giftId", str5);
        c19886aM182288p.m182300c("fakeId", str6);
        return vrv.m202548i(c19886aM182288p.m182301d(), "getNewGiftWallGiftDetail" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: H0 */
    public static C22421c<BLiveExtraResponse> m98042H0(String str, String str2, String str3) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/gift/category/detail")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("roomId", str2);
        }
        c19886aM182288p.m182300c("source", "live");
        c19886aM182288p.m182300c("categoryId", str3);
        return vrv.m202548i(c19886aM182288p.m182301d(), "getNewGiftWallGiftTypeInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: I0 */
    public static C22421c<BLiveExtraResponse> m98044I0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/set/detail")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("roomId", str2);
        }
        c19886aM182288p.m182300c("source", "live");
        return vrv.m202548i(c19886aM182288p.m182301d(), "getNewGiftWallSet" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m98045J(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static C22421c<BLiveExtraResponse> m98046J0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/skin/detail")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("roomId", str2);
        }
        c19886aM182288p.m182300c("source", "live");
        return vrv.m202548i(c19886aM182288p.m182301d(), "getNewGiftWallSkin" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: K0 */
    public static C22421c<BLiveExtraResponse> m98048K0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-wall-v2/summary")).m182288p();
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("toUserId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            c19886aM182288p.m182300c("roomId", str2);
        }
        c19886aM182288p.m182300c("source", "live");
        return vrv.m202548i(c19886aM182288p.m182301d(), "getNewGiftWallSummaryInfo" + str, BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: L0 */
    public static String m98050L0(String str) {
        if (TextUtils.equals(str, BLiveAbsData.VOICE_LIVE)) {
            return BLiveType.voiceLive;
        }
        TextUtils.equals(str, "live");
        return "live";
    }

    /* JADX INFO: renamed from: M0 */
    public static C22421c<BLiveEnvelope> m98052M0(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/scrap-tabs")).m182288p();
        c19886aM182288p.m182300c(MatchFrom.scenario, str).m182300c("roomId", str2).m182300c("liveId", str3).m182300c("anchorId", str4);
        return vrv.m202547h(c19886aM182288p.m182301d(), "live-scrap");
    }

    /* JADX INFO: renamed from: N0 */
    public static C22421c<BLiveEnterRoomEffect> m98054N0(String str, String str2, String str3, String str4) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/users/me/enter_room_effect")).m182288p().m182300c("roomId", str).m182300c("liveId", str2).m182300c("liveMode", str4);
        if ("live".equals(str3)) {
            c19886aM182300c.m182300c("placeType", "videoRoom");
        } else if (BLiveAbsData.VOICE_LIVE.equals(str3)) {
            c19886aM182300c.m182300c("placeType", "voiceRoom").m182300c("templateType", "profit");
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "getSelfEnterRoomEffect").map(new qcj() { // from class: l.nhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98124p((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public static C22421c<BLiveData> m98056O0() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/campaigns/new-user-reward/users/" + zrv.f205799a.m207631D0() + "/treasure-box")), "get_treasure_box_config").map(new qcj() { // from class: l.uhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public static C22421c<BLiveTurboCardInfo> m98058P0(String str, String str2, String str3) {
        return vrv.m202547h(rnl.m182265r(zvr.m221802b("/live/turboCardInfo")).m182288p().m182300c("userType", str).m182300c("roomId", str2).m182300c("liveMode", str3).m182301d(), "getTurboCardInfo").map(new qcj() { // from class: l.wfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.turboCardInfo;
            }
        }).filter(new qcj() { // from class: l.xfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveTurboCardInfo) obj));
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ BLiveModelsFromCdnWarpData m98059Q(BLiveLiveMedalCDN bLiveLiveMedalCDN, BLiveMedals bLiveMedals) {
        if (bLiveMedals == null) {
            return null;
        }
        BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpDataNew_ = BLiveModelsFromCdnWarpData.new_();
        bLiveModelsFromCdnWarpDataNew_.liveModels = bLiveMedals;
        bLiveModelsFromCdnWarpDataNew_.version = bLiveLiveMedalCDN.version;
        ((civ) zrv.m221194l(htd0.f111524f)).f82008o.put(bLiveModelsFromCdnWarpDataNew_);
        return bLiveModelsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: Q0 */
    public static C22421c<BLiveUpgradeGiftInfo> m98060Q0(String str) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b(String.format("/live-gift/users/me/slots/%s", str))), "getUpgradeGiftInfo").map(new qcj() { // from class: l.ohv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.slotInfo;
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static C22421c<BLiveGivenGiftRemindStatus> m98062R0(String str, String str2, String str3, int i) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/gift/guide/recheck")).m182288p();
        c19886aM182288p.m182300c("source", m98050L0(str));
        c19886aM182288p.m182300c("roomID", str2);
        c19886aM182288p.m182300c("liveID", str3);
        c19886aM182288p.m182300c("remindID", String.valueOf(i));
        return vrv.m202547h(c19886aM182288p.m182301d(), "giftGuideRecheck").map(new qcj() { // from class: l.jhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindStatus;
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BLiveRoomTabGifts m98063S(BLiveRoomTabGifts bLiveRoomTabGifts, uxj0 uxj0Var) {
        return bLiveRoomTabGifts;
    }

    /* JADX INFO: renamed from: S0 */
    public static void m98064S0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq) {
        if (bLiveSendLiveGiftReq == null || zrv.f205804f.getHeader() == null || TextUtils.isEmpty(bLiveSendLiveGiftReq.extraInfo.voiceLive.mainUserId)) {
            return;
        }
        BLiveGiftExtraVoiceInfo bLiveGiftExtraVoiceInfo = bLiveSendLiveGiftReq.extraInfo.voiceLive;
        String str = zrv.f205804f.getHeader().get("X-TT-Live-AnchorID");
        if (TextUtils.isEmpty(str) || bLiveGiftExtraVoiceInfo.mainUserId.equals(str)) {
            return;
        }
        CrashHelper.m82481e(new IllegalStateException("send gift mainuserId is error : mainUserId = " + bLiveGiftExtraVoiceInfo.mainUserId + " , headerAnchorId = " + str), "国际化送礼参数错误", CrashHelper.ReportLevel.p9);
    }

    /* JADX INFO: renamed from: T0 */
    public static boolean m98066T0(BLiveEnvelope bLiveEnvelope) {
        return !TextUtils.isEmpty(bLiveEnvelope.data.liveMedalCDN.cdnUrl);
    }

    /* JADX INFO: renamed from: U0 */
    public static C22421c<List<BLiveCampaign>> m98068U0(@NonNull String str, String str2, String str3, String str4, String str5) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-campaigns")).m182288p().m182300c("anchorUserID", str).m182300c("source", str2).m182300c("liveMode", str4);
        if (!TextUtils.isEmpty(str3)) {
            c19886aM182300c.m182300c("content", str3);
        }
        if (!TextUtils.isEmpty(str5)) {
            c19886aM182300c.m182300c("hostId", str5);
        }
        return vrv.m202562w(c19886aM182300c.m182301d(), "live-campaign").map(new qcj() { // from class: l.vfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveCampaigns;
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public static void m98070V0(BLiveType bLiveType, Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        String string = bLiveType.toString();
        if (TextUtils.equals(string, "app")) {
            ere.m122146i().m122158p(pair);
        } else if (TextUtils.equals(string, "live") || TextUtils.equals(string, BLiveType.voiceLive)) {
            ((hiv) zrv.m221194l(htd0.f111521c)).m135145E((BLiveResourceInfo) pair.first);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static uxj0 m98072W0(BLiveModelsFromCdnWarpData bLiveModelsFromCdnWarpData) {
        if (bLiveModelsFromCdnWarpData != null) {
            ((hiv) zrv.m221194l(htd0.f111521c)).f110090u.put(bLiveModelsFromCdnWarpData.version, bLiveModelsFromCdnWarpData.liveModels);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: X0 */
    public static uxj0 m98074X0(BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData) {
        if (!jyb.m147479J(bLiveGiftsFromCdnWarpData.giftList)) {
            final ConcurrentHashMap<Integer, BLiveGiftItem> concurrentHashMap = new ConcurrentHashMap<>();
            cpj.m111776L(bLiveGiftsFromCdnWarpData.giftList, new y20() { // from class: l.egv
                @Override // p153l.y20
                public final void call(Object obj) {
                    aiv.m98035E(concurrentHashMap, (BLiveGiftItem) obj);
                }
            });
            if (zrv.m221195m()) {
                ((hiv) zrv.m221194l(htd0.f111521c)).f110081l.put(bLiveGiftsFromCdnWarpData.serverRegion, concurrentHashMap);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y0 */
    public static C22421c<uxj0> m98076Y0(LiveRegionTag liveRegionTag) {
        return m98078Z0(liveRegionTag, "");
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ BLiveCoin m98077Z(BLiveExtraResponse bLiveExtraResponse) {
        ((hiv) zrv.m221194l(htd0.f111521c)).m135143C(Long.valueOf(bLiveExtraResponse.data.coins.available));
        return bLiveExtraResponse.data.coins;
    }

    /* JADX INFO: renamed from: Z0 */
    public static C22421c<uxj0> m98078Z0(LiveRegionTag liveRegionTag, String str) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/gift_items_cdn")).m182288p();
        if (!TEnum.equals(liveRegionTag, "unknown_")) {
            c19886aM182288p.m182300c("region", liveRegionTag.toString());
        }
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("liveType", ifu.m139749a(str));
        }
        return vrv.m202547h(c19886aM182288p.m182301d(), "liveGiftItemsUrl").filter(new qcj() { // from class: l.ofv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(cpj.m111774J((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.pfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98145w0((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.qfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98074X0((BLiveGiftsFromCdnWarpData) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BLiveHierarchyProgress m98079a(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public static void m98081a1(final String str, final e4d0 e4d0Var, @Nullable final w8e w8eVar) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-resource/resources/" + str)).m182288p();
        if (i9n.m139128c()) {
            c19886aM182288p.m182300c("intlDegrade", "1");
        }
        vrv.m202547h(c19886aM182288p.m182301d(), "pollLiveEffectBean" + str).map(new qcj() { // from class: l.ggv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResources;
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.rgv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98133s(w8eVar, e4d0Var, (List) obj);
            }
        }, new y20() { // from class: l.chv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98139u(w8eVar, str, e4d0Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ BLiveResourceInfo m98083b0(BLiveResourceInfo bLiveResourceInfo) {
        ((civ) zrv.m221194l(htd0.f111524f)).f82006m.put(bLiveResourceInfo);
        ere.m122146i().m122150g(bLiveResourceInfo);
        muj.m160219u("更新资源version： " + bLiveResourceInfo.version);
        return bLiveResourceInfo;
    }

    /* JADX INFO: renamed from: b1 */
    public static void m98084b1(String str, String str2, final BLiveType bLiveType) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-resource/resources-cdn")).m182288p().m182300c("roomID", str).m182300c("anchorID", str2).m182300c("source", bLiveType.toString());
        if (i9n.m139128c()) {
            c19886aM182300c.m182300c("intlDegrade", "1");
        }
        vrv.m202547h(c19886aM182300c.m182301d(), "pollLiveEffectCDN").observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.lgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveResourcesCDN;
            }
        }).filter(new qcj() { // from class: l.mgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveResourceCDN) obj));
            }
        }).flatMap(new qcj() { // from class: l.ngv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98130r((BLiveResourceCDN) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ogv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98070V0(bLiveType, (Pair) obj);
            }
        }, new y20() { // from class: l.pgv
            @Override // p153l.y20
            public final void call(Object obj) {
                muj.m160219u("EffectManager pollLiveEffectList error:" + ((Throwable) obj).getMessage());
            }
        }));
    }

    /* JADX INFO: renamed from: c1 */
    public static C22421c<uxj0> m98087c1() {
        htd0<hiv> htd0Var = htd0.f111521c;
        return (((hiv) zrv.m221194l(htd0Var)).f110090u == null || ((hiv) zrv.m221194l(htd0Var)).f110090u.isEmpty()) ? vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-medals-cdn")).m182288p().m182301d(), "LiveMedalsFromCdn").filter(new qcj() { // from class: l.zhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(aiv.m98066T0((BLiveEnvelope) obj));
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.lfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98032C0((BLiveEnvelope) obj);
            }
        }).map(new qcj() { // from class: l.mfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98072W0((BLiveModelsFromCdnWarpData) obj);
            }
        }).observeOn(fo0.m126432a()) : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ uxj0 m98089d0(BLiveEnvelope bLiveEnvelope) {
        List<BLiveUserLevel> list = bLiveEnvelope.data.liveHierarchyGrades;
        ((hiv) zrv.m221194l(htd0.f111521c)).f110092w = bLiveEnvelope.data.momentConfig;
        if (list != null) {
            for (BLiveUserLevel bLiveUserLevel : list) {
                ((hiv) zrv.m221194l(htd0.f111521c)).f110091v.put(Long.valueOf(bLiveUserLevel.grade), bLiveUserLevel);
                izs.m142849B("context_livingAct", bLiveUserLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        List<BLiveAnchorLevel> list2 = bLiveEnvelope.data.anchorHierarchyGrades;
        if (list2 != null) {
            for (BLiveAnchorLevel bLiveAnchorLevel : list2) {
                ((hiv) zrv.m221194l(htd0.f111521c)).f110093x.put(Long.valueOf(bLiveAnchorLevel.grade), bLiveAnchorLevel);
                izs.m142849B("context_livingAct", bLiveAnchorLevel.backendUrl, Priority.MEDIUM, true);
            }
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: d1 */
    public static void m98090d1() {
        m98087c1().subscribe(dhw.m115826e(new y20() { // from class: l.qgv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98091e((uxj0) obj);
            }
        }, new y20() { // from class: l.sgv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98039G((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m98091e(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: e1 */
    public static C22421c<Pair<BLiveResourceInfo, BLiveResourceCDN>> m98093e1(final BLiveResourceCDN bLiveResourceCDN) {
        ((civ) zrv.m221194l(htd0.f111524f)).f82005l.put(bLiveResourceCDN);
        String str = bLiveResourceCDN.cdnUrl;
        return qi20.m176656c(new pcj() { // from class: l.fhv
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.f185526c.auth().m209043q(bLiveResourceCDN.cdnUrl).m209032f().m209028b();
            }
        }, BLiveResourceInfo.JSON_ADAPTER).filter(new qcj() { // from class: l.ghv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((BLiveResourceInfo) obj));
            }
        }).map(new qcj() { // from class: l.hhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98083b0((BLiveResourceInfo) obj);
            }
        }).flatMap(new qcj() { // from class: l.ihv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(new Pair((BLiveResourceInfo) obj, bLiveResourceCDN));
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static C22421c<BLiveRoomTabGifts> m98096f1(uxj uxjVar, final BLiveAbsData bLiveAbsData) {
        String str;
        rnl.C19886a c19886aM182300c = rnl.m182265r(zvr.m221802b("/tab_gift_items")).m182288p().m182300c("source", m98134s0(uxjVar)).m182300c("roomId", uxjVar.m198485c()).m182300c("liveMode", bLiveAbsData.liveMode).m182300c("anchorId", uxjVar.m198483a());
        if (eb20.m120149b()) {
            c19886aM182300c.m182300c("fakeId", eb20.m120148a());
        }
        if (TextUtils.isEmpty(uxjVar.m198486d())) {
            str = "tab_gift_items";
        } else {
            str = "tab_gift_items_" + uxjVar.m198486d();
        }
        return vrv.m202547h(c19886aM182300c.m182301d(), str).filter(new qcj() { // from class: l.whv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.liveRoomTabGifts.giftTabs));
            }
        }).map(new qcj() { // from class: l.xhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.liveRoomTabGifts;
            }
        }).flatMap(new qcj() { // from class: l.yhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98029B(bLiveAbsData, (BLiveRoomTabGifts) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ BLiveGiftsFromCdnWarpData m98097g(List list, String str, String str2) {
        final BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpDataNew_ = BLiveGiftsFromCdnWarpData.new_();
        bLiveGiftsFromCdnWarpDataNew_.giftList = list;
        bLiveGiftsFromCdnWarpDataNew_.serverRegion = str;
        bLiveGiftsFromCdnWarpDataNew_.version = str2;
        l51.m152919y(new Runnable() { // from class: l.dhv
            @Override // java.lang.Runnable
            public final void run() {
                ((civ) zrv.m221194l(htd0.f111524f)).f82007n.put(bLiveGiftsFromCdnWarpDataNew_);
            }
        });
        return bLiveGiftsFromCdnWarpDataNew_;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ BLiveData m98098g0(BLiveSendLiveGiftReq bLiveSendLiveGiftReq, BLiveEnvelope bLiveEnvelope) {
        htd0<civ> htd0Var = htd0.f111524f;
        ((civ) zrv.m221194l(htd0Var)).m109981y(true);
        ((civ) zrv.m221194l(htd0Var)).m109982z();
        BLiveData bLiveData = bLiveEnvelope.data;
        BLiveSendLiveGiftResult bLiveSendLiveGiftResult = bLiveData.givenGiftRes;
        if (bLiveSendLiveGiftResult != null) {
            bLiveSendLiveGiftResult.givenGiftBrief.sendGiftOriginalId = bLiveSendLiveGiftReq.originalId;
        }
        return bLiveData;
    }

    /* JADX INFO: renamed from: g1 */
    public static C22421c<uxj0> m98099g1() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-hierarchy")), "pollUserLevelConfig").map(new qcj() { // from class: l.vgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98089d0((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static C22421c<BLiveEnvelope> m98102h1(boolean z, String str) {
        return vrv.m202544e(LiveApiBuilder.m68498u(zvr.m221802b("/live-campaigns/dragon-scourge/anchors/" + str + "/details/records"), st0.m187803a("action", z ? "accept" : "reject")), "postDragonScourgeControl" + str, "");
    }

    /* JADX INFO: renamed from: i1 */
    public static C22421c<Boolean> m98105i1(String str, boolean z) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221802b("/live-campaigns/touchMe/anchors/" + str + "/details/changeStatus"), new st0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openStatus", z);
        } catch (JSONException unused) {
        }
        return vrv.m202544e(rnlVarM68498u, "postLiveGuideGiftSwitchConfig" + str, jSONObject.toString()).map(new qcj() { // from class: l.rhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        }).onErrorReturn(new qcj() { // from class: l.shv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public static void m98107j0(BLiveCampaignNotifyData bLiveCampaignNotifyData) {
        vrv.m202555p(rnl.m182263l(zvr.m221802b("/campaign/watch_live_ok")), "campaignCountdownNotify", bLiveCampaignNotifyData.toJson()).subscribe(dhw.m115826e(new y20() { // from class: l.agv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98109k((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.bgv
            @Override // p153l.y20
            public final void call(Object obj) {
                aiv.m98045J((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public static C22421c<BLiveData> m98108j1() {
        return vrv.m202546g(rnl.m182263l(zvr.m221802b("/campaigns/new-user-reward/users/" + zrv.f205799a.m207631D0() + "/treasure-box")).m182288p().m182300c(NotificationCompat.CATEGORY_STATUS, "completed").m182301d(), "patch_treasure_box_config", "").map(new qcj() { // from class: l.vhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data;
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m98109k(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: k0 */
    public static C22421c<BLiveExtraResponse> m98110k0(String str) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live/unjail-card/anchor-info")).m182288p();
        c19886aM182288p.m182300c("anchorId", str);
        return vrv.m202550k(c19886aM182288p.m182301d(), "checkAndGetAnchorNameById", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: k1 */
    public static C22421c<BLiveCoin> m98111k1() {
        return u8n.m195065a() ? m98114l1() : m98117m1();
    }

    /* JADX INFO: renamed from: l0 */
    public static C22421c<BLiveExtraResponse> m98113l0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live/can-give-naming-card")).m182288p();
        c19886aM182288p.m182300c("anchorId", str);
        c19886aM182288p.m182300c("roomId", str2);
        return vrv.m202550k(c19886aM182288p.m182301d(), "/live/can-give-naming-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: l1 */
    public static C22421c<BLiveCoin> m98114l1() {
        return vrv.m202548i(rnl.m182263l(zvr.m221802b("/users/" + zrv.f205799a.m207631D0() + "/diamond?agent=true")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.rfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98027A((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public static C22421c<BLiveExtraResponse> m98116m0(String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live/can-give-unjail-card")).m182288p();
        c19886aM182288p.m182300c("anchorId", str);
        c19886aM182288p.m182300c("roomId", str2);
        return vrv.m202550k(c19886aM182288p.m182301d(), "/live/can-give-unjail-card", BLiveExtraResponse.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: m1 */
    public static C22421c<BLiveCoin> m98117m1() {
        return vrv.m202548i(rnl.m182263l(zvr.m221808h("/coins")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.nfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98077Z((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static C22421c<BLiveEnvelope> m98119n0(@NotNull String str, @NotNull BLiveScrapCraftReq bLiveScrapCraftReq) {
        return vrv.m202544e(rnl.m182263l(zvr.m221802b("/live-gift/scraps/" + str + "/craft")).m182288p().m182301d(), "craftScrap", bLiveScrapCraftReq.toJson());
    }

    /* JADX INFO: renamed from: n1 */
    public static C22421c<List<BLiveGiftSkin>> m98120n1(dyj dyjVar) {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/live-gift/users/" + zrv.f205799a.m207631D0() + "/tab/skins")).m182288p().m182300c("anchorId", dyjVar.m118698a()).m182300c(MatchFrom.scenario, dyjVar.m118702e()).m182300c("liveId", dyjVar.m118700c()).m182300c("roomId", dyjVar.m118701d()).m182300c("fakeId", dyjVar.m118699b()).m182301d(), "getGiftSkinInfo").map(new qcj() { // from class: l.ahv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.skins;
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static C22421c<BLiveEnvelope> m98122o0(String str, String str2) {
        String string = UUID.randomUUID().toString();
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/gift-wall-v2/skin/equip"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("originalId", (Object) string);
        jSONObject.put("giftId", (Object) str);
        jSONObject.put("skinId", (Object) str2);
        return vrv.m202544e(c19886aM68490m.m182301d(), "equipGiftSkin" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: o1 */
    public static C22421c<BLiveHierarchyProgress> m98123o1(String str) {
        if (BLiveAbsData.VOICE_LIVE.equals(str)) {
            str = BLiveType.voiceLive;
        }
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/users/me/hierarchy-progress")).m182288p();
        if (eb20.m120149b()) {
            c19886aM182288p.m182300c("fakeId", eb20.m120148a());
        }
        if (!TextUtils.isEmpty(str)) {
            c19886aM182288p.m182300c("liveType", str);
        }
        return vrv.m202547h(c19886aM182288p.m182301d(), "requestLiveHierarchyProgress").map(new qcj() { // from class: l.xgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchyProgress;
            }
        }).onErrorReturn(new qcj() { // from class: l.ygv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98079a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ BLiveEnterRoomEffect m98124p(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.userEnterRoomEffects)) {
            return null;
        }
        return bLiveEnvelope.data.userEnterRoomEffects.get(0);
    }

    /* JADX INFO: renamed from: p0 */
    public static C22421c<BLiveEnvelope> m98125p0(boolean z, String str, String str2, String str3, String str4, String str5) {
        String string = UUID.randomUUID().toString();
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/live-gift/gift-skin/action/".concat(z ? BLiveRightItem.ACTION_EQUIP : BLiveRightItem.ACTION_UN_EQUIP)));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("source", (Object) "live");
        jSONObject.put("liveMode", (Object) str3);
        jSONObject.put("originalId", (Object) string);
        jSONObject.put("id", (Object) str);
        jSONObject.put("roomId", (Object) str2);
        jSONObject.put("anchorId", (Object) str4);
        jSONObject.put("fakeId", (Object) str5);
        return vrv.m202544e(c19886aM68490m.m182301d(), "equipGiftSkin2" + string, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: p1 */
    public static C22421c<BLiveUserLevel> m98126p1() {
        return vrv.m202547h(rnl.m182263l(zvr.m221802b("/users/me/hierarchy")), "getMyLiveHierarchy").map(new qcj() { // from class: l.zgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.userLiveHierarchy;
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static C22421c<BLiveGiftItem> m98128q0(String str, String str2, String str3, String str4) {
        BLiveUpgradeGiftEquipInfo bLiveUpgradeGiftEquipInfoNew_ = BLiveUpgradeGiftEquipInfo.new_();
        bLiveUpgradeGiftEquipInfoNew_.itemId = str2;
        bLiveUpgradeGiftEquipInfoNew_.roomId = str3;
        bLiveUpgradeGiftEquipInfoNew_.anchorId = str4;
        return vrv.m202544e(rnl.m182263l(zvr.m221802b(String.format("/live-gift/users/me/slots/%s/equip-gift", str))), "equipUpgradeGift", bLiveUpgradeGiftEquipInfoNew_.toJson()).map(new qcj() { // from class: l.kfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cpj.m111794n(((BLiveEnvelope) obj).data.equippedGift);
            }
        });
    }

    /* JADX INFO: renamed from: q1 */
    public static C22421c<BLiveData> m98129q1(uoe0 uoe0Var) {
        final BLiveSendLiveGiftReq bLiveSendLiveGiftReqM196976b = uoe0Var.m196976b();
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/users/me/gifts/" + uoe0Var.m196981h()));
        if (eb20.m120149b()) {
            bLiveSendLiveGiftReqM196976b.fakeId = eb20.m120148a();
        }
        if (!wft.m206159b(1)) {
            try {
                m98064S0(bLiveSendLiveGiftReqM196976b);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                e.getMessage();
            }
        }
        return vrv.m202544e(c19886aM68490m.m182301d(), "sendLiveGift", bLiveSendLiveGiftReqM196976b.toJson()).map(new qcj() { // from class: l.mhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98098g0(bLiveSendLiveGiftReqM196976b, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C22421c m98130r(BLiveResourceCDN bLiveResourceCDN) {
        htd0<civ> htd0Var = htd0.f111524f;
        BLiveResourceCDN bLiveResourceCDN2 = ((civ) zrv.m221194l(htd0Var)).f82005l.get();
        if (bLiveResourceCDN2 == null || !bLiveResourceCDN2.version.equals(bLiveResourceCDN.version) || !TEnum.equals(bLiveResourceCDN2.region, bLiveResourceCDN.region)) {
            return m98093e1(bLiveResourceCDN);
        }
        BLiveResourceInfo bLiveResourceInfo = ((civ) zrv.m221194l(htd0Var)).f82006m.get();
        if (bLiveResourceInfo == null) {
            return m98093e1(bLiveResourceCDN);
        }
        muj.m160219u("EffectManager pollLiveEffectList success local");
        return C22421c.just(new Pair(bLiveResourceInfo, bLiveResourceCDN));
    }

    /* JADX INFO: renamed from: r0 */
    public static String m98131r0(long j) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingSize(3);
        return decimalFormat.format(j);
    }

    /* JADX INFO: renamed from: r1 */
    public static C22421c<List<BLiveSendLiveMultiGiftResultItem>> m98132r1(uoe0 uoe0Var) {
        return vrv.m202545f(LiveApiBuilder.m68490m(zvr.m221802b("/users/me/batch-gifts")).m182301d(), "sendMultiLiveGiftWithBatch", BLiveExtraResponse.JSON_ADAPTER, new ume0(uoe0Var).m196661a().toJson()).map(new qcj() { // from class: l.phv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98148y((BLiveExtraResponse) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m98133s(w8e w8eVar, e4d0 e4d0Var, List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        if (w8eVar != null) {
            BLiveEffect bLiveEffect = (BLiveEffect) list.get(0);
            w8eVar.mo75432c(wqe.m207509d(bLiveEffect.type).mo144687d(bLiveEffect));
        }
        ere.m122146i().m122156n((BLiveEffect) list.get(0), null, e4d0Var, w8eVar);
    }

    /* JADX INFO: renamed from: s0 */
    public static String m98134s0(uxj uxjVar) {
        return cpj.m111801u(uxjVar.m198486d());
    }

    /* JADX INFO: renamed from: s1 */
    public static C22421c<BLiveEnvelope> m98135s1(String str, boolean z, int i) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/live-users/" + str + "/daily-payment"));
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, (Object) (z ? "enable" : "disable"));
        jSONObject.put("amount", (Object) Integer.valueOf(i));
        return vrv.m202544e(c19886aM68490m.m182301d(), "liveSetConsumeAlert", jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: t0 */
    public static C22421c<BLiveTabGiftExpiration> m98137t0(int i, String str, String str2) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-bagpack/item")).m182288p();
        rnl.C19886a c19886aM182300c = c19886aM182288p.m182300c("id", i + "").m182300c("roomId", str);
        if (TextUtils.equals(BLiveAbsData.VOICE_LIVE, str2)) {
            str2 = BLiveType.voiceLive;
        }
        c19886aM182300c.m182300c("liveType", str2);
        return vrv.m202547h(c19886aM182288p.m182301d(), "getBackTabGiftExpiration" + str + i).map(new qcj() { // from class: l.thv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.bagpackItem;
            }
        });
    }

    /* JADX INFO: renamed from: t1 */
    public static void m98138t1() {
        vrv.m202544e(rnl.m182263l(zvr.m221802b("/live/setTurboCardShown")), "setTurboCardShown", "");
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m98139u(w8e w8eVar, String str, e4d0 e4d0Var, Throwable th) {
        if (w8eVar != null) {
            w8eVar.mo76401d("pollEffectById Failed");
        }
        rre.m182728H(str, "", "", SocialConstants.TYPE_REQUEST);
        muj.m160219u("EffectManager pollLiveEffectBean error:" + th.getMessage());
        rre.m182752x(e4d0Var);
    }

    /* JADX INFO: renamed from: u0 */
    public static C22421c<BLiveDailyPayment> m98140u0(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live-users/" + str + "/daily-payment")).m182288p().m182301d(), "getConsumeAlertBoardInfo").map(new qcj() { // from class: l.wgv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dailyPayment;
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public static C22421c<BLiveEnvelope> m98141u1(String str, BLiveGameInfoReq bLiveGameInfoReq) {
        if (eb20.m120149b()) {
            bLiveGameInfoReq.fakeId = eb20.m120148a();
        }
        return vrv.m202546g(rnl.m182263l(zvr.m221802b("/live-gift/" + str)), "LiveGameGRequest", bLiveGameInfoReq.toJson());
    }

    /* JADX INFO: renamed from: v0 */
    public static C22421c<BLiveGiftBubbleConfig> m98143v0(String str, String str2, String str3, String str4) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/gift_bubble_config"));
        c19886aM68490m.m182300c("source", str);
        c19886aM68490m.m182300c("anchorID", str2);
        c19886aM68490m.m182300c("liveID", str3);
        c19886aM68490m.m182300c("roomID", str4);
        if (eb20.m120149b()) {
            c19886aM68490m.m182300c("fakeId", eb20.m120148a());
        }
        return vrv.m202547h(c19886aM68490m.m182301d(), "getGiftBubbleConfig").map(new qcj() { // from class: l.sfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.givenGiftRemindConfig;
            }
        }).filter(new qcj() { // from class: l.tfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveGiftBubbleConfig bLiveGiftBubbleConfig = (BLiveGiftBubbleConfig) obj;
                return Boolean.valueOf(bLiveGiftBubbleConfig != null && bLiveGiftBubbleConfig.isValid());
            }
        }).map(new qcj() { // from class: l.ufv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return aiv.m98144w((BLiveGiftBubbleConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ BLiveGiftBubbleConfig m98144w(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        if (!TextUtils.isEmpty(bLiveGiftBubbleConfig.schema)) {
            bLiveGiftBubbleConfig.button.jumpType = BLiveGiftBubblePopupButtonJumpType.get("schema");
        }
        bLiveGiftBubbleConfig.isCircle = true;
        bLiveGiftBubbleConfig.isFromLongLink = false;
        return bLiveGiftBubbleConfig;
    }

    /* JADX INFO: renamed from: w0 */
    public static C22421c<BLiveGiftsFromCdnWarpData> m98145w0(BLiveEnvelope bLiveEnvelope) {
        final BLiveGiftItemCDN bLiveGiftItemCDN = bLiveEnvelope.data.giftItemCDN;
        ((hiv) zrv.m221194l(htd0.f111521c)).f110079j.put(bLiveGiftItemCDN.region, Long.valueOf(Long.parseLong(bLiveGiftItemCDN.version)));
        BLiveGiftsFromCdnWarpData bLiveGiftsFromCdnWarpData = ((civ) zrv.m221194l(htd0.f111524f)).f82007n.get();
        return C22421c.zip(cpj.m111797q(bLiveGiftItemCDN, bLiveGiftsFromCdnWarpData).booleanValue() ? qi20.m176656c(new pcj() { // from class: l.fgv
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return vrv.f185526c.auth().m209043q(bLiveGiftItemCDN.giftItemsCDNUrl).m209032f().m209028b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveGiftItem.JSON_ADAPTER)) : C22421c.just(bLiveGiftsFromCdnWarpData.giftList), C22421c.just(bLiveGiftItemCDN.region), C22421c.just(bLiveGiftItemCDN.version), new scj() { // from class: l.hgv
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return aiv.m98097g((List) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static C22421c<BLiveNewGiftSkinListData> m98147x0(String str, String str2, String str3, String str4, String str5) {
        rnl.C19886a c19886aM182288p = rnl.m182263l(zvr.m221802b("/live-gift/gift-skin/panel")).m182288p();
        c19886aM182288p.m182300c("source", str);
        c19886aM182288p.m182300c("roomId", str2);
        c19886aM182288p.m182300c("liveMode", str3);
        c19886aM182288p.m182300c("anchorId", str4);
        c19886aM182288p.m182300c("fakeId", str5);
        return vrv.m202547h(c19886aM182288p.m182301d(), "getGiftSkinList" + str4).map(new qcj() { // from class: l.bhv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.giftSkinPanel;
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ List m98148y(BLiveExtraResponse bLiveExtraResponse) {
        htd0<civ> htd0Var = htd0.f111524f;
        ((civ) zrv.m221194l(htd0Var)).m109981y(true);
        ((civ) zrv.m221194l(htd0Var)).m109982z();
        return bLiveExtraResponse.data.batchGivenGiftRes;
    }

    /* JADX INFO: renamed from: y0 */
    public static C22421c<BLiveDragonScourgeDisplayChatMessage> m98149y0(String str) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b(String.format("/live-campaigns/dragon-scourge/anchors/%s/details/display-chat-message", str))), "getLiveDragonScourgeDisplayChatMessage" + str).map(new qcj() { // from class: l.ehv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.dragonScourgeDisplayChatMessage;
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: z0 */
    public static List<BLiveMedalColorTemplate> m98151z0(final int i, @Nullable String str) {
        BLiveFanBaseMedal bLiveFanBaseMedal;
        if (!TextUtils.isEmpty(str)) {
            htd0<hiv> htd0Var = htd0.f111521c;
            if (((hiv) zrv.m221194l(htd0Var)).f110090u.containsKey(str)) {
                BLiveFanBaseMedal bLiveFanBaseMedal2 = (BLiveFanBaseMedal) jyb.m147529r(((hiv) zrv.m221194l(htd0Var)).f110090u.get(str).fanbaseMedals, new qcj() { // from class: l.yfv
                    @Override // p153l.qcj
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
            m98090d1();
        }
        htd0<hiv> htd0Var2 = htd0.f111521c;
        if (((hiv) zrv.m221194l(htd0Var2)).f110090u.isEmpty() || (bLiveFanBaseMedal = (BLiveFanBaseMedal) jyb.m147529r(((hiv) zrv.m221194l(htd0Var2)).f110090u.lastEntry().getValue().fanbaseMedals, new qcj() { // from class: l.zfv
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveFanBaseMedal) obj).grade == i);
            }
        })) == null) {
            return null;
        }
        return bLiveFanBaseMedal.colorTemplates;
    }

    /* JADX INFO: renamed from: l.aiv$a */
    public static class C15716a {

        /* JADX INFO: renamed from: a */
        public String f71578a;

        /* JADX INFO: renamed from: b */
        public String f71579b;

        /* JADX INFO: renamed from: c */
        public a f71580c;

        public C15716a(String str, String str2, a aVar) {
            this.f71578a = str;
            this.f71579b = str2;
            this.f71580c = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m98152a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            a aVar = this.f71580c;
            if (aVar == null) {
                o1j0.m165644r(" 送礼结果回调为空，请检查业务是否需要");
            } else if (aVar instanceof b) {
                ((b) aVar).mo68349a(bLiveGivenGiftBrief);
            } else {
                aVar.mo68349a(bLiveGivenGiftBrief);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m98153b() {
            return TextUtils.equals(this.f71578a, "closeH5Skin");
        }

        /* JADX INFO: renamed from: c */
        public boolean m98154c() {
            return TextUtils.equals(this.f71578a, "refreshCoins");
        }

        /* JADX INFO: renamed from: d */
        public boolean m98155d() {
            return TextUtils.equals(this.f71578a, "sendGift");
        }

        /* JADX INFO: renamed from: e */
        public boolean m98156e() {
            return TextUtils.equals(this.f71578a, "showFastRecharge");
        }

        /* JADX INFO: renamed from: l.aiv$a$a */
        public interface a {
            /* JADX INFO: renamed from: b */
            default void mo68350b() {
            }

            /* JADX INFO: renamed from: c */
            default void mo68351c() {
            }

            /* JADX INFO: renamed from: a */
            default void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }

        /* JADX INFO: renamed from: l.aiv$a$b */
        public interface b extends a {
            @Override // p153l.aiv.C15716a.a
            /* JADX INFO: renamed from: a */
            default void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            }
        }
    }
}
