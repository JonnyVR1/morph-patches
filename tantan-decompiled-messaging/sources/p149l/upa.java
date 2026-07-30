package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BoostOptConfig;
import com.p046p1.mobile.putong.core.data.BoostUserRefactorConfig;
import com.p046p1.mobile.putong.core.data.CardInvalidCheck;
import com.p046p1.mobile.putong.core.data.CardOptRemote;
import com.p046p1.mobile.putong.core.data.CertificationNewConfig;
import com.p046p1.mobile.putong.core.data.ChatPartnerConfig;
import com.p046p1.mobile.putong.core.data.ChatRealConfig;
import com.p046p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p046p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p046p1.mobile.putong.core.data.ConversationChatGuideConfig;
import com.p046p1.mobile.putong.core.data.ConversationRefreshIntervalConfig;
import com.p046p1.mobile.putong.core.data.CoreExpandedCardConfig;
import com.p046p1.mobile.putong.core.data.DatingPurpose;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.FillUserInfoConfig;
import com.p046p1.mobile.putong.core.data.GameCpConfig;
import com.p046p1.mobile.putong.core.data.HomeHealConfig;
import com.p046p1.mobile.putong.core.data.HomeRealV2Config;
import com.p046p1.mobile.putong.core.data.HomeTopItemWebConfig;
import com.p046p1.mobile.putong.core.data.IdealTypeConfig;
import com.p046p1.mobile.putong.core.data.ImproveInformationConfig;
import com.p046p1.mobile.putong.core.data.LabelParams;
import com.p046p1.mobile.putong.core.data.MaleSuperLikeOptimise;
import com.p046p1.mobile.putong.core.data.MarryConfig;
import com.p046p1.mobile.putong.core.data.MarryGuideConfig;
import com.p046p1.mobile.putong.core.data.MessageFilterConfig;
import com.p046p1.mobile.putong.core.data.MessageRedDotGrayHour;
import com.p046p1.mobile.putong.core.data.MessageTabRevisionConfig;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MomentThemeCardeConfig;
import com.p046p1.mobile.putong.core.data.MomentUserStateMessageType;
import com.p046p1.mobile.putong.core.data.MyTabOptConfig;
import com.p046p1.mobile.putong.core.data.MyTabOptV2Config;
import com.p046p1.mobile.putong.core.data.NewMatchConfig;
import com.p046p1.mobile.putong.core.data.NonExpansionCardSwipeVerifiedConfig;
import com.p046p1.mobile.putong.core.data.OOFEntrenceConfig;
import com.p046p1.mobile.putong.core.data.OldUserWelcome;
import com.p046p1.mobile.putong.core.data.PairedOnlineMessagesGuideConfig;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.PushGuideConfig;
import com.p046p1.mobile.putong.core.data.RealPicturesConfig;
import com.p046p1.mobile.putong.core.data.RealtimeRefreshNewMatch;
import com.p046p1.mobile.putong.core.data.RecommendVoiceChatRoomConfig;
import com.p046p1.mobile.putong.core.data.RepeatNetPictureDlgConfig;
import com.p046p1.mobile.putong.core.data.SeeMyselfConfig;
import com.p046p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p046p1.mobile.putong.core.data.SwipeRateLimitConfig;
import com.p046p1.mobile.putong.core.data.SwipeVerifiedConfig;
import com.p046p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p046p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p046p1.mobile.putong.core.data.UserPicHideIndex;
import com.p046p1.mobile.putong.core.data.VerifyPremiumIsolationConfig;
import com.p046p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p046p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p046p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
public class upa implements ABManager.InterfaceC4678d {

    /* JADX INFO: renamed from: a */
    public static hpd0 f177582a = new hpd0("join_then_leave_ban_or_logout_group_new" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public static boolean m194606A() {
        GameCpConfig gameCpConfigM194738d0 = m194738d0();
        return gameCpConfigM194738d0 != null && gameCpConfigM194738d0.dialogEnable;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m194607A0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("conversation_exposure_sort");
            if (TextUtils.isEmpty(strM79302F)) {
                return 0;
            }
            return new JSONObject(strM79302F).optInt("req_interval");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static boolean m194608A1() {
        return TextUtils.equals(ABManager.m29350i0("chat_cell_active"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: A2 */
    public static boolean m194609A2() {
        RealPicturesConfig realPicturesConfigM194709W0 = m194709W0();
        return (realPicturesConfigM194709W0 == null || !realPicturesConfigM194709W0.enable || m194665L3()) ? false : true;
    }

    /* JADX INFO: renamed from: A3 */
    public static int m194610A3() {
        try {
            MessageRedDotGrayHour messageRedDotGrayHour = (MessageRedDotGrayHour) RemoteConfig.m79298x().m79333v("message_red_dot", MessageRedDotGrayHour.JSON_ADAPTER);
            if (NullChecker.m81303a(messageRedDotGrayHour)) {
                return messageRedDotGrayHour.red_dot_gray_hour;
            }
            return 3;
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m194611B() {
        GameCpConfig gameCpConfigM194738d0 = m194738d0();
        return gameCpConfigM194738d0 != null && gameCpConfigM194738d0.enable;
    }

    /* JADX INFO: renamed from: B0 */
    public static int m194612B0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_display_time_info");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optInt("message_list_intimacy", Api.BaseClientBuilder.API_PRIORITY_OTHER) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } catch (Exception unused) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m194613B1() {
        return m194618C1();
    }

    /* JADX INFO: renamed from: B2 */
    public static boolean m194614B2() {
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V == null) {
            return false;
        }
        return coreExpandedCardConfigM194704V.receiveProfileLikeEnable;
    }

    /* JADX INFO: renamed from: B3 */
    public static int m194615B3() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m194616C() {
        ImproveInformationConfig improveInformationConfigM194783m0 = m194783m0();
        if (NullChecker.m81303a(improveInformationConfigM194783m0)) {
            return improveInformationConfigM194783m0.cardGuidanceEnable;
        }
        return false;
    }

    /* JADX INFO: renamed from: C0 */
    public static int m194617C0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_display_time_info");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optInt("message_list_time", Api.BaseClientBuilder.API_PRIORITY_OTHER) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } catch (Exception unused) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: C1 */
    public static boolean m194618C1() {
        return TextUtils.equals(ABManager.m29350i0("chat_newmatch_continue"), "exp_strategy") || lz4.m152319h().m152330m();
    }

    /* JADX INFO: renamed from: C2 */
    public static boolean m194619C2() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F("profile_pic_optimization_card_ratio")).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static int m194620C3() {
        try {
            MessageRedDotGrayHour messageRedDotGrayHour = (MessageRedDotGrayHour) RemoteConfig.m79298x().m79333v("message_red_dot", MessageRedDotGrayHour.JSON_ADAPTER);
            if (NullChecker.m81303a(messageRedDotGrayHour)) {
                return messageRedDotGrayHour.patch_max;
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: D */
    public static BoostUserRefactorConfig m194621D() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static List<String> m194622D0() {
        MessageTabRevisionConfig messageTabRevisionConfigM194627E0 = m194627E0();
        return (messageTabRevisionConfigM194627E0 == null || vwb.m200296J(messageTabRevisionConfigM194627E0.animContents)) ? vwb.m200324f0("开始聊天吧...", "输入新聊天...", "聊聊在干嘛...", "等你打招呼...") : messageTabRevisionConfigM194627E0.animContents;
    }

    /* JADX INFO: renamed from: D1 */
    public static boolean m194623D1() {
        return TextUtils.equals(ABManager.m29350i0("ChatViewOptimizationAndroid"), "_exp") || !TextUtils.equals(ABManager.m29350i0("ChatViewOptimizationV2"), "__control");
    }

    /* JADX INFO: renamed from: D2 */
    public static boolean m194624D2() {
        return TextUtils.equals(ABManager.m29350i0("push_msg"), "_test");
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m194625D3() {
        return TextUtils.equals(ABManager.m29350i0("message_red_dot"), "exp1");
    }

    /* JADX INFO: renamed from: E */
    public static int m194626E() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_break_ice_mv_times");
            if (TextUtils.isEmpty(strM79302F)) {
                return 2;
            }
            return new JSONObject(strM79302F).getInt("maxTimes");
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static MessageTabRevisionConfig m194627E0() {
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    public static boolean m194628E1() {
        String strM29350i0 = ABManager.m29350i0("city_cover_price");
        if (TextUtils.equals(ABManager.m29350i0("city_cover"), "_test")) {
            return true;
        }
        return !TextUtils.isEmpty(strM29350i0) && strM29350i0.contains("_test");
    }

    /* JADX INFO: renamed from: E2 */
    public static boolean m194629E2() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F(SchemeKey.privacy_management)).optBoolean("enable", false) && m194665L3();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static boolean m194630E3() {
        return TextUtils.equals(ABManager.m29350i0("message_red_dot"), "exp2");
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static CardInvalidCheck m194631F() {
        try {
            return (CardInvalidCheck) RemoteConfig.m79298x().m79333v("card_invalid_check_config", CardInvalidCheck.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m194632F0() {
        MessageTabRevisionConfig messageTabRevisionConfigM194627E0 = m194627E0();
        return messageTabRevisionConfigM194627E0 != null && messageTabRevisionConfigM194627E0.enabled;
    }

    /* JADX INFO: renamed from: F1 */
    public static boolean m194633F1() {
        return CoreModule.m29934N().mo60389so() || CoreModule.m29934N().mo60385qn() || CoreModule.m29934N().mo60297Nj() || CoreModule.m29934N().mo60291Lj();
    }

    /* JADX INFO: renamed from: F2 */
    public static boolean m194634F2() {
        return RemoteConfig.m79298x().m79336z("reswipe_female_match_type", 1) == 1;
    }

    /* JADX INFO: renamed from: F3 */
    public static boolean m194635F3() {
        SeeMyselfConfig seeMyselfConfigM194725a1 = m194725a1();
        return NullChecker.m81303a(seeMyselfConfigM194725a1) && seeMyselfConfigM194725a1.enable && m194665L3();
    }

    /* JADX INFO: renamed from: G */
    public static int m194636G() {
        int i;
        CardInvalidCheck cardInvalidCheckM194631F = m194631F();
        if (!NullChecker.m81303a(cardInvalidCheckM194631F) || (i = cardInvalidCheckM194631F.checkInterval) <= 0) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m194637G0() {
        return (NullChecker.m81303a(m194843y0()) && m194843y0().messageFilterEnabled && m194632F0()) || m194741d3();
    }

    /* JADX INFO: renamed from: G1 */
    public static boolean m194638G1() {
        ConversationChatGuideConfig conversationChatGuideConfigM194661L = m194661L();
        if (conversationChatGuideConfigM194661L != null) {
            return conversationChatGuideConfigM194661L.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: G2 */
    public static boolean m194639G2() {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfigM194721Z0 = m194721Z0();
        if (repeatNetPictureDlgConfigM194721Z0 != null) {
            return repeatNetPictureDlgConfigM194721Z0.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m194640G3() {
        return m194846y3() || m194820t2();
    }

    /* JADX INFO: renamed from: H */
    public static CardOptRemote m194641H() {
        try {
            return (CardOptRemote) RemoteConfig.m79298x().m79333v("card_opt_config", CardOptRemote.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static double m194642H0() {
        return 0.67d;
    }

    /* JADX INFO: renamed from: H1 */
    public static boolean m194643H1() {
        try {
            return RemoteConfig.m79298x().m79330s("conv_load_op_switch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H2 */
    public static boolean m194644H2() {
        return TextUtils.equals("repeat_exp", ABManager.m29350i0("real_avatar_identify"));
    }

    /* JADX INFO: renamed from: H3 */
    public static boolean m194645H3() {
        return TextUtils.equals(ABManager.m29350i0("chat_upgrade"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: I */
    public static int m194646I() {
        MyTabOptV2Config myTabOptV2ConfigM194672N0 = m194672N0();
        if (NullChecker.m81303a(myTabOptV2ConfigM194672N0) && myTabOptV2ConfigM194672N0.enable) {
            return myTabOptV2ConfigM194672N0.cert_center_entry_red_dot_limit;
        }
        return 0;
    }

    /* JADX INFO: renamed from: I0 */
    public static MomentThemeCardeConfig m194647I0() {
        return MomentThemeCardeConfig.new_();
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m194648I1() {
        return TextUtils.equals(ABManager.m29350i0("group_one"), "group_chat") || TextUtils.equals(ABManager.m29350i0("groupchat"), "second_1") || TextUtils.equals(ABManager.m29350i0("groupchat"), "second_2") || TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_1") || TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_2") || TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_4") || TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_5") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_1") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_2") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_3") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_4") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_5") || m194710W1() || m194653J1();
    }

    /* JADX INFO: renamed from: I2 */
    public static boolean m194649I2() {
        return m194790n2();
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m194650I3() {
        return TextUtils.equals(ABManager.m29350i0("newuser_icebreak_lead"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: J */
    public static CertificationNewConfig m194651J() {
        CertificationNewConfig certificationNewConfig;
        try {
            certificationNewConfig = (CertificationNewConfig) RemoteConfig.m79298x().m79333v("new_verification", CertificationNewConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            certificationNewConfig = null;
        }
        if (NullChecker.m81303a(certificationNewConfig)) {
            return certificationNewConfig;
        }
        CertificationNewConfig certificationNewConfigNew_ = CertificationNewConfig.new_();
        certificationNewConfigNew_.maleLimit = 5;
        certificationNewConfigNew_.femaleLimit = 10;
        return certificationNewConfigNew_;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m194652J0() {
        MomentUserStateMessageType momentUserStateMessageType;
        try {
            momentUserStateMessageType = (MomentUserStateMessageType) RemoteConfig.m79298x().m79333v("chat_state_send_type", MomentUserStateMessageType.JSON_ADAPTER);
        } catch (Exception unused) {
            momentUserStateMessageType = null;
        }
        return NullChecker.m81303a(momentUserStateMessageType) ? momentUserStateMessageType.type : "";
    }

    /* JADX INFO: renamed from: J1 */
    public static boolean m194653J1() {
        return TextUtils.equals(ABManager.m29350i0("newgroupchat"), "exp_group");
    }

    /* JADX INFO: renamed from: J2 */
    public static boolean m194654J2() {
        RecommendVoiceChatRoomConfig recommendVoiceChatRoomConfig;
        try {
            recommendVoiceChatRoomConfig = (RecommendVoiceChatRoomConfig) RemoteConfig.m79298x().m79333v("recommend_chat_room_config", RecommendVoiceChatRoomConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            recommendVoiceChatRoomConfig = null;
        }
        if (NullChecker.m81303a(recommendVoiceChatRoomConfig)) {
            return recommendVoiceChatRoomConfig.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: J3 */
    public static boolean m194655J3() {
        return TextUtils.equals(ABManager.m29350i0("swipe_avatar_verified"), "_test");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m194656K() {
        LiveService liveService;
        try {
            nje0 nje0Var = qib0.f154713b0;
            if (nje0Var == null || (liveService = nje0Var.f139232c) == null || liveService.mo67229M6() == null) {
                return false;
            }
            return qib0.f154713b0.f139232c.mo67229M6().mo102432q();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static String m194657K0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("my_recent_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return "";
            }
            JSONArray jSONArray = new JSONObject(strM79302F).getJSONArray("defaultStatement");
            return jSONArray.getString(new Random().nextInt(jSONArray.length()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: K1 */
    public static boolean m194658K1() {
        return m194723Z2();
    }

    /* JADX INFO: renamed from: K2 */
    public static boolean m194659K2() {
        try {
            return RemoteConfig.m79298x().m79330s("show_business_license");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static boolean m194660K3() {
        return TextUtils.equals(ABManager.m29350i0("tantan_listview_opt"), "self_view");
    }

    /* JADX INFO: renamed from: L */
    public static ConversationChatGuideConfig m194661L() {
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static int m194662L0() {
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V == null) {
            return 1;
        }
        return coreExpandedCardConfigM194704V.myTabFetchCoolTime;
    }

    /* JADX INFO: renamed from: L1 */
    public static boolean m194663L1() {
        CoreModule.f17545c.f19639e0.m169520na().isFemale();
        return false;
    }

    /* JADX INFO: renamed from: L2 */
    public static boolean m194664L2() {
        return RemoteConfig.m79298x().m79330s("startup_inflate_thread_priority");
    }

    /* JADX INFO: renamed from: L3 */
    public static boolean m194665L3() {
        m194715X2();
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static ChatPartnerConfig m194666M() {
        try {
            return (ChatPartnerConfig) RemoteConfig.m79298x().m79333v("chat_partner_config", ChatPartnerConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static MyTabOptConfig m194667M0() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("dating_my_tab_optimization"))) {
            return null;
        }
        try {
            return (MyTabOptConfig) RemoteConfig.m79298x().m79333v("dating_my_tab_optimization", MyTabOptConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static boolean m194668M1() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_display_time_info");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("display_message_cell", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: M2 */
    public static boolean m194669M2() {
        return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m29350i0("e_surprisebox"));
    }

    /* JADX INFO: renamed from: M3 */
    public static boolean m194670M3() {
        return !RemoteConfig.m79298x().m79330s("ttt_new_ui_disabled");
    }

    /* JADX INFO: renamed from: N */
    public static ChatRealConfig m194671N() {
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static MyTabOptV2Config m194672N0() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("my_tab_opt_v2_config"))) {
            return null;
        }
        try {
            return (MyTabOptV2Config) RemoteConfig.m79298x().m79333v("my_tab_opt_v2_config", MyTabOptV2Config.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N1 */
    public static boolean m194673N1() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_display_time_info");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("display_new_match", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N2 */
    public static boolean m194674N2() {
        MaleSuperLikeOptimise maleSuperLikeOptimiseM163514b = och0.m163514b();
        return NullChecker.m81303a(maleSuperLikeOptimiseM163514b) && maleSuperLikeOptimiseM163514b.enabled && maleSuperLikeOptimiseM163514b.useSuggestRank;
    }

    /* JADX INFO: renamed from: N3 */
    public static boolean m194675N3() {
        return !RemoteConfig.m79298x().m79330s("ttt_new_ui_disabled");
    }

    /* JADX INFO: renamed from: O */
    public static boolean m194676O() {
        ChatRealConfig chatRealConfigM194671N = m194671N();
        return chatRealConfigM194671N != null && chatRealConfigM194671N.enable;
    }

    /* JADX INFO: renamed from: O0 */
    public static int m194677O0() {
        int i;
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V != null && (i = coreExpandedCardConfigM194704V.nextInfoHeight) > 0) {
            return i;
        }
        return 50;
    }

    /* JADX INFO: renamed from: O1 */
    public static boolean m194678O1() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F("hyper_profile_pic_double_check")).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: O2 */
    public static boolean m194679O2() {
        MaleSuperLikeOptimise maleSuperLikeOptimiseM163514b = och0.m163514b();
        return NullChecker.m81303a(maleSuperLikeOptimiseM163514b) && maleSuperLikeOptimiseM163514b.enabled && maleSuperLikeOptimiseM163514b.useCommercialRank;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static ChatRoundsDisplayedExternallyConfig m194680P() {
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public static int m194681P0() {
        return m194677O0() + 56;
    }

    /* JADX INFO: renamed from: P1 */
    public static boolean m194682P1() {
        return CoreModule.m29934N().mo60267Co();
    }

    /* JADX INFO: renamed from: P2 */
    public static boolean m194683P2() {
        return m194687Q2() || m194691R2();
    }

    /* JADX INFO: renamed from: Q */
    public static int m194684Q() {
        return ABManager.m29315A("android_conv_load_opt", "check_mode", 1000);
    }

    /* JADX INFO: renamed from: Q0 */
    public static int m194685Q0() {
        if (NullChecker.m81303a(m194764i1())) {
            return m194764i1().non_verified_matches_limit;
        }
        return 3;
    }

    /* JADX INFO: renamed from: Q1 */
    public static boolean m194686Q1() {
        try {
            return TextUtils.equals(ABManager.m29350i0("homepage_bottom_bar_reframe"), AuthenticationTokenClaims.JSON_KEY_EXP) && !RemoteConfig.m79298x().m79330s("homepage_live_white");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public static boolean m194687Q2() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static int m194688R() {
        ConversationChatGuideConfig conversationChatGuideConfigM194661L = m194661L();
        if (conversationChatGuideConfigM194661L != null) {
            return conversationChatGuideConfigM194661L.dismiss_threshold;
        }
        return 100;
    }

    /* JADX INFO: renamed from: R0 */
    public static List<String> m194689R0() {
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(fillUserInfoConfigM194724a0)) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
                if (!vwb.m200296J(fillUserInfoConfigM194724a0.female_other_tags)) {
                    return fillUserInfoConfigM194724a0.female_other_tags;
                }
            } else if (!vwb.m200296J(fillUserInfoConfigM194724a0.male_other_tags)) {
                return fillUserInfoConfigM194724a0.male_other_tags;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R1 */
    public static boolean m194690R1() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("leadtocommunity_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean(AuthenticationTokenClaims.JSON_KEY_EXP);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static boolean m194691R2() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static String m194692S() {
        ConversationChatGuideConfig conversationChatGuideConfigM194661L = m194661L();
        return conversationChatGuideConfigM194661L != null ? conversationChatGuideConfigM194661L.guide_text : "去回复";
    }

    /* JADX INFO: renamed from: S0 */
    public static int m194693S0() {
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V == null) {
            return 3;
        }
        return coreExpandedCardConfigM194704V.maxDislikeGuideShowCount;
    }

    /* JADX INFO: renamed from: S1 */
    public static boolean m194694S1() {
        return TextUtils.equals(ABManager.m29350i0("femaleMatchPage_update"), "A1") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_update"), "A2") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_update"), "A3") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_update"), "A4") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_update"), "A5") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_plugin"), "B1") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_plugin"), "B2") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_plugin"), "B3") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_plugin"), "B4") || TextUtils.equals(ABManager.m29350i0("femaleMatchPage_plugin"), "B5");
    }

    /* JADX INFO: renamed from: S2 */
    public static boolean m194695S2() {
        return NullChecker.m81303a(m194843y0()) && m194843y0().officAccCollectionEnabled;
    }

    /* JADX INFO: renamed from: T */
    public static int m194696T() {
        ConversationChatGuideConfig conversationChatGuideConfigM194661L = m194661L();
        if (conversationChatGuideConfigM194661L != null) {
            return conversationChatGuideConfigM194661L.work_time;
        }
        return 2;
    }

    /* JADX INFO: renamed from: T0 */
    public static int m194697T0() {
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V == null) {
            return 10;
        }
        return coreExpandedCardConfigM194704V.dislikeCountToTriggerGuide;
    }

    /* JADX INFO: renamed from: T1 */
    public static boolean m194698T1() {
        return TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_1") || TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_2") || TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_3") || TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_4") || TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_5") || TextUtils.equals(ABManager.m29350i0("show_if_he_liked"), "show_toast_6");
    }

    /* JADX INFO: renamed from: T2 */
    public static boolean m194699T2() {
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static int m194700U() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("message_display_time_info");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optInt("display_distance", Api.BaseClientBuilder.API_PRIORITY_OTHER) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } catch (Exception unused) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static int m194701U0() {
        CoreExpandedCardConfig coreExpandedCardConfigM194704V = m194704V();
        if (coreExpandedCardConfigM194704V == null) {
            return 3;
        }
        return coreExpandedCardConfigM194704V.maxLikeGuideShowCount;
    }

    /* JADX INFO: renamed from: U1 */
    public static boolean m194702U1() {
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public static boolean m194703U2() {
        return false;
    }

    /* JADX INFO: renamed from: V */
    public static CoreExpandedCardConfig m194704V() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("expanded_card_config"))) {
            return null;
        }
        try {
            return (CoreExpandedCardConfig) RemoteConfig.m79298x().m79333v("expanded_card_config", CoreExpandedCardConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static int m194705V0() {
        RealPicturesConfig realPicturesConfigM194709W0 = m194709W0();
        if (realPicturesConfigM194709W0 != null) {
            return realPicturesConfigM194709W0.photo_reward_guide_limit;
        }
        return 3;
    }

    /* JADX INFO: renamed from: V1 */
    public static boolean m194706V1() {
        return m194648I1() || m194656K() || m194653J1() || m194762i();
    }

    /* JADX INFO: renamed from: V2 */
    public static boolean m194707V2() {
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static int m194708W() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("leadtocommunity_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optInt(BaseSei.f13930X) : CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
        } catch (Exception unused) {
            return CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static RealPicturesConfig m194709W0() {
        return null;
    }

    /* JADX INFO: renamed from: W1 */
    public static boolean m194710W1() {
        return TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_3");
    }

    /* JADX INFO: renamed from: W2 */
    public static boolean m194711W2() {
        return TextUtils.equals(ABManager.m29350i0("anti_harass_customiza_set"), "_match_include") || TextUtils.equals(ABManager.m29350i0("anti_harass_customiza_set"), "_match_exact");
    }

    /* JADX INFO: renamed from: X */
    public static int m194712X() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("leadtocommunity_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 2;
            }
            return new JSONObject(strM79302F).optInt(BaseSei.f13931Y);
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static String m194713X0() {
        return (NullChecker.m81303a(mu5.f135733a) && NullChecker.m81303a(mu5.f135733a.get()) && mu5.f135733a.get().contains("staging")) ? "1450_1448_1446_0" : "100071_100064_100067_0";
    }

    /* JADX INFO: renamed from: X1 */
    public static boolean m194714X1() {
        try {
            return RemoteConfig.m79298x().m79330s("enable_white_black_style");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static boolean m194715X2() {
        HomeRealV2Config homeRealV2ConfigM194753g0 = m194753g0();
        return NullChecker.m81303a(homeRealV2ConfigM194753g0) && homeRealV2ConfigM194753g0.marriageEnable;
    }

    /* JADX INFO: renamed from: Y */
    public static int m194716Y() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("leadtocommunity_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return 720;
            }
            return new JSONObject(strM79302F).optInt(BaseSei.f13932Z);
        } catch (Exception unused) {
            return 720;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static RealtimeRefreshNewMatch m194717Y0() throws IOException {
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = null;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("realtime_refresh_new_match");
            if (!TextUtils.isEmpty(strM79302F)) {
                realtimeRefreshNewMatch = RealtimeRefreshNewMatch.JSON_ADAPTER.parse(strM79302F);
            }
        } catch (Exception unused) {
        }
        if (realtimeRefreshNewMatch != null) {
            return realtimeRefreshNewMatch;
        }
        RealtimeRefreshNewMatch realtimeRefreshNewMatchNew_ = RealtimeRefreshNewMatch.new_();
        realtimeRefreshNewMatchNew_.function_switch = false;
        return realtimeRefreshNewMatchNew_;
    }

    /* JADX INFO: renamed from: Y1 */
    public static boolean m194718Y1() {
        m194778l0();
        return false;
    }

    /* JADX INFO: renamed from: Y2 */
    public static boolean m194719Y2() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("video_immersion");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("soundSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static String m194720Z(User user) {
        String str;
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19642f0.f19896S0.get())) {
            return CoreModule.f17545c.f19642f0.f19896S0.get();
        }
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        if (NullChecker.m81303a(fillUserInfoConfigM194724a0)) {
            str = user.isFemale() ? fillUserInfoConfigM194724a0.male_avatar_url : fillUserInfoConfigM194724a0.female_avatar_url;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return user.isFemale() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZNk9PUVVJWFlGSTVGR0lYQTVZUVBQQ0k0RktSRzExIiwidyI6MzAwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDUyNDc4ODMwMzIzMDM3NDgxfQ" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjM2VUU2TFgyV01GSEs3TlJSSVBTVVBNVVM1UjJKVzEwIiwidyI6MzAwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI0OTkzOTI1MTc2NjYwMjczM30";
        }
        return str;
    }

    /* JADX INFO: renamed from: Z0 */
    public static RepeatNetPictureDlgConfig m194721Z0() {
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public static boolean m194722Z1() {
        return false;
    }

    /* JADX INFO: renamed from: Z2 */
    public static boolean m194723Z2() {
        SwipeVerifiedConfig swipeVerifiedConfig;
        try {
            swipeVerifiedConfig = (SwipeVerifiedConfig) RemoteConfig.m79298x().m79333v("swipe_verified_config", SwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            swipeVerifiedConfig = null;
        }
        return NullChecker.m81303a(swipeVerifiedConfig) && swipeVerifiedConfig.enable && m194665L3();
    }

    /* JADX INFO: renamed from: a0 */
    public static FillUserInfoConfig m194724a0() {
        try {
            return (FillUserInfoConfig) RemoteConfig.m79298x().m79333v("fill_user_info_config", FillUserInfoConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static SeeMyselfConfig m194725a1() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("new_user_mirror_guide"))) {
            return null;
        }
        try {
            return (SeeMyselfConfig) RemoteConfig.m79298x().m79333v("new_user_mirror_guide", SeeMyselfConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static boolean m194726a2() {
        return qp8.m175817b();
    }

    /* JADX INFO: renamed from: a3 */
    public static SwipeVerifiedConfig m194727a3() {
        try {
            return (SwipeVerifiedConfig) RemoteConfig.m79298x().m79333v("swipe_verified_config", SwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m194728b0() {
        int i;
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        if (fillUserInfoConfigM194724a0 == null || (i = fillUserInfoConfigM194724a0.expire_days) <= 0) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: renamed from: b1 */
    public static int m194729b1() {
        int iM79335y = RemoteConfig.m79298x().m79335y("see_toast_limit_time");
        if (iM79335y < 1) {
            return 30;
        }
        return iM79335y;
    }

    /* JADX INFO: renamed from: b2 */
    public static boolean m194730b2() {
        try {
            return RemoteConfig.m79298x().m79330s("enableCountdownLike");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b3 */
    public static NonExpansionCardSwipeVerifiedConfig m194731b3() {
        try {
            return (NonExpansionCardSwipeVerifiedConfig) RemoteConfig.m79298x().m79333v("non_expansion_card_swipe_verified_config", NonExpansionCardSwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static BoostOptConfig m194732c() {
        BoostOptConfig boostOptConfig;
        try {
            boostOptConfig = (BoostOptConfig) RemoteConfig.m79298x().m79333v("boost_opt_config", BoostOptConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            boostOptConfig = null;
        }
        if (NullChecker.m81303a(boostOptConfig)) {
            return boostOptConfig;
        }
        BoostOptConfig boostOptConfigNew_ = BoostOptConfig.new_();
        boostOptConfigNew_.min_match_count = 1;
        return boostOptConfigNew_;
    }

    /* JADX INFO: renamed from: c0 */
    public static String m194733c0(User user) {
        String str;
        if (!TextUtils.isEmpty(CoreModule.f17545c.f19642f0.f19899T0.get())) {
            return CoreModule.f17545c.f19642f0.f19899T0.get();
        }
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        if (NullChecker.m81303a(fillUserInfoConfigM194724a0)) {
            str = user.isFemale() ? fillUserInfoConfigM194724a0.male_name : fillUserInfoConfigM194724a0.female_name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return user.isFemale() ? "郑翔杰" : "赵思思";
        }
        return str;
    }

    /* JADX INFO: renamed from: c1 */
    public static List<String> m194734c1() {
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(fillUserInfoConfigM194724a0)) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
                if (!vwb.m200296J(fillUserInfoConfigM194724a0.female_self_intro_tags_1)) {
                    return fillUserInfoConfigM194724a0.female_self_intro_tags_1;
                }
            } else if (!vwb.m200296J(fillUserInfoConfigM194724a0.male_self_intro_tags_1)) {
                return fillUserInfoConfigM194724a0.male_self_intro_tags_1;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c2 */
    public static boolean m194735c2() {
        return TextUtils.equals(ABManager.m29350i0("quickchat_male_ring"), "exp1");
    }

    /* JADX INFO: renamed from: c3 */
    public static boolean m194736c3() {
        NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfigM194731b3 = m194731b3();
        return NullChecker.m81303a(nonExpansionCardSwipeVerifiedConfigM194731b3) && nonExpansionCardSwipeVerifiedConfigM194731b3.enable && !m194665L3();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m194737d() {
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static GameCpConfig m194738d0() {
        try {
            return (GameCpConfig) RemoteConfig.m79298x().m79333v("game_cp", GameCpConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static List<String> m194739d1() {
        FillUserInfoConfig fillUserInfoConfigM194724a0 = m194724a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(fillUserInfoConfigM194724a0)) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
                if (!vwb.m200296J(fillUserInfoConfigM194724a0.female_self_intro_tags_2)) {
                    return fillUserInfoConfigM194724a0.female_self_intro_tags_2;
                }
            } else if (!vwb.m200296J(fillUserInfoConfigM194724a0.male_self_intro_tags_2)) {
                return fillUserInfoConfigM194724a0.male_self_intro_tags_2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d2 */
    public static boolean m194740d2() {
        return TextUtils.equals(ABManager.m29350i0("quickchat_male_ring"), "exp2");
    }

    /* JADX INFO: renamed from: d3 */
    public static boolean m194741d3() {
        MessageFilterConfig messageFilterConfigM194843y0 = m194843y0();
        return NullChecker.m81303a(messageFilterConfigM194843y0) && messageFilterConfigM194843y0.showRecommendBanner && !vwb.m200296J(messageFilterConfigM194843y0.filterTabList);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m194742e() {
        return NullChecker.m81303a(m194764i1()) && m194764i1().restrict_non_verified_common && m194665L3();
    }

    /* JADX INFO: renamed from: e0 */
    public static int m194743e0() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        try {
            UserPicHideIndex userPicHideIndex = (UserPicHideIndex) RemoteConfig.m79298x().m79333v("profile_image_hide_info", UserPicHideIndex.JSON_ADAPTER);
            if (NullChecker.m81303a(userPicHideIndex)) {
                return TEnum.equals(userM169520na.gender, "female") ? userPicHideIndex.female_hide_index : userPicHideIndex.male_hide_index;
            }
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static String m194744e1() {
        return "目前最多可发送20条消息，若对方同意配对，才可以无限聊天";
    }

    /* JADX INFO: renamed from: e2 */
    public static boolean m194745e2() {
        m194715X2();
        return false;
    }

    /* JADX INFO: renamed from: e3 */
    public static boolean m194746e3() {
        MessageFilterConfig messageFilterConfigM194843y0 = m194843y0();
        return NullChecker.m81303a(messageFilterConfigM194843y0) && messageFilterConfigM194843y0.showRecommendBanner && messageFilterConfigM194843y0.showRecommendBannerHasNewMatch && !vwb.m200296J(messageFilterConfigM194843y0.filterTabList);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m194747f() {
        return NullChecker.m81303a(m194764i1()) && m194764i1().restrict_non_verified_received_likes && m194665L3();
    }

    /* JADX INFO: renamed from: f0 */
    public static HomeHealConfig m194748f0() {
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public static SpringFestivalMarriageActivitiesConfig m194749f1() {
        if (m194745e2()) {
            try {
                return (SpringFestivalMarriageActivitiesConfig) RemoteConfig.m79298x().m79333v("spring_festival_marriage_activities_config", SpringFestivalMarriageActivitiesConfig.JSON_ADAPTER);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f2 */
    public static boolean m194750f2() {
        return TextUtils.equals(ABManager.m29350i0("chat_match"), "with_icebreak_text");
    }

    /* JADX INFO: renamed from: f3 */
    public static int m194751f3() {
        try {
            return RemoteConfig.m79298x().m79336z("match_icebereak_bubble_times", 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m194752g() {
        return NullChecker.m81303a(m194764i1()) && m194764i1().restrict_non_verified_matches && m194665L3();
    }

    /* JADX INFO: renamed from: g0 */
    public static HomeRealV2Config m194753g0() {
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public static SwipeRateLimitConfig m194754g1() {
        SwipeRateLimitConfig swipeRateLimitConfig;
        int i;
        try {
            swipeRateLimitConfig = (SwipeRateLimitConfig) RemoteConfig.m79298x().m79333v("swipeRateLimit", SwipeRateLimitConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            swipeRateLimitConfig = null;
        }
        if (!NullChecker.m81303a(swipeRateLimitConfig)) {
            SwipeRateLimitConfig swipeRateLimitConfigNew_ = SwipeRateLimitConfig.new_();
            swipeRateLimitConfigNew_.enable = false;
            return swipeRateLimitConfigNew_;
        }
        if (swipeRateLimitConfig.enable && ((i = swipeRateLimitConfig.countPerSecond) <= 0 || i >= 100)) {
            swipeRateLimitConfig.countPerSecond = 10;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (swipeRateLimitConfig.enable) {
            if (swipeRateLimitConfig.vip && userM169527p9.isVIP()) {
                swipeRateLimitConfig.enable = false;
            } else if (swipeRateLimitConfig.svip && userM169527p9.isSVIP()) {
                swipeRateLimitConfig.enable = false;
            } else if (swipeRateLimitConfig.dimaond && xma.m210043F3()) {
                swipeRateLimitConfig.enable = false;
            } else if (NullChecker.m81303a(userM169527p9.verifications) && NullChecker.m81303a(userM169527p9.verifications.anchor) && userM169527p9.verifications.anchor.verified) {
                swipeRateLimitConfig.enable = false;
            }
            swipeRateLimitConfig.locaInterval = 1000 / swipeRateLimitConfig.countPerSecond;
        }
        return swipeRateLimitConfig;
    }

    /* JADX INFO: renamed from: g2 */
    public static boolean m194755g2() {
        return TextUtils.equals(ABManager.m29350i0("match_page_message"), "all");
    }

    /* JADX INFO: renamed from: g3 */
    public static TTCMigrateGuideConfig m194756g3() {
        try {
            TTCMigrateGuideConfig tTCMigrateGuideConfig = (TTCMigrateGuideConfig) RemoteConfig.m79298x().m79333v("ttt_ttc_bind_phone", TTCMigrateGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(tTCMigrateGuideConfig)) {
                return tTCMigrateGuideConfig;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m194757h() {
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static HomeTopItemWebConfig m194758h0() {
        HomeTopItemWebConfig homeTopItemWebConfig;
        try {
            homeTopItemWebConfig = (HomeTopItemWebConfig) RemoteConfig.m79298x().m79333v("home_top_item_web_config", HomeTopItemWebConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            homeTopItemWebConfig = null;
        }
        if (NullChecker.m81303a(homeTopItemWebConfig)) {
            return homeTopItemWebConfig;
        }
        HomeTopItemWebConfig homeTopItemWebConfigNew_ = HomeTopItemWebConfig.new_();
        homeTopItemWebConfigNew_.enable = false;
        return homeTopItemWebConfigNew_;
    }

    /* JADX INFO: renamed from: h1 */
    public static SwitchConvNextConfig m194759h1() {
        SwitchConvNextConfig switchConvNextConfig;
        try {
            switchConvNextConfig = (SwitchConvNextConfig) RemoteConfig.m79298x().m79333v("switch_conv_next_config", SwitchConvNextConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            switchConvNextConfig = null;
        }
        if (NullChecker.m81303a(switchConvNextConfig)) {
            return switchConvNextConfig;
        }
        SwitchConvNextConfig switchConvNextConfigNew_ = SwitchConvNextConfig.new_();
        switchConvNextConfigNew_.exp_limit_hours = m194687Q2() ? 72 : 48;
        switchConvNextConfigNew_.exp_limit_count = m194687Q2() ? 3 : 10;
        switchConvNextConfigNew_.exp_dismiss_count = 3;
        return switchConvNextConfigNew_;
    }

    /* JADX INFO: renamed from: h2 */
    public static boolean m194760h2() {
        return m194755g2() || m194765i2();
    }

    /* JADX INFO: renamed from: h3 */
    public static boolean m194761h3() {
        return !IntlCountryCodeController.m28126v();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m194762i() {
        return TextUtils.equals(ABManager.m29350i0("uninstall_chat_clean"), "_exp");
    }

    /* JADX INFO: renamed from: i0 */
    public static int m194763i0() {
        IdealTypeConfig idealTypeConfigM194778l0 = m194778l0();
        if (idealTypeConfigM194778l0 == null) {
            return 3;
        }
        return idealTypeConfigM194778l0.ideal_chat_guide_not_send_message_limit;
    }

    /* JADX INFO: renamed from: i1 */
    public static VerifyPremiumIsolationConfig m194764i1() {
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public static boolean m194765i2() {
        return TextUtils.equals(ABManager.m29350i0("match_page_message"), "male");
    }

    /* JADX INFO: renamed from: i3 */
    public static int m194766i3() {
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m194767j() {
        return TextUtils.equals(ABManager.m29350i0("message_rank_sec"), "exp1") || TextUtils.equals(ABManager.m29350i0("message_rank_sec"), "exp2") || TextUtils.equals(ABManager.m29350i0("message_rank_sec"), "exp3");
    }

    /* JADX INFO: renamed from: j0 */
    public static int m194768j0() {
        IdealTypeConfig idealTypeConfigM194778l0 = m194778l0();
        if (idealTypeConfigM194778l0 == null) {
            return 3;
        }
        return idealTypeConfigM194778l0.ideal_chat_guide_limit;
    }

    /* JADX INFO: renamed from: j1 */
    public static int m194769j1() {
        if (NullChecker.m81303a(m194764i1())) {
            return m194764i1().non_verified_received_likes_limit;
        }
        return 10;
    }

    /* JADX INFO: renamed from: j2 */
    public static boolean m194770j2() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static int m194771j3() {
        MyTabOptConfig myTabOptConfigM194667M0 = m194667M0();
        if (NullChecker.m81303a(myTabOptConfigM194667M0)) {
            return myTabOptConfigM194667M0.mirror_guide_user_signup_days_count;
        }
        return 7;
    }

    /* JADX INFO: renamed from: k */
    public static CollapsibleConversationConfig m194772k() {
        CollapsibleConversationConfig collapsibleConversationConfigNew_;
        try {
            CollapsibleConversationConfig collapsibleConversationConfigM194777l = m194777l();
            if (m194777l().enabled) {
                return collapsibleConversationConfigM194777l;
            }
            collapsibleConversationConfigNew_ = (CollapsibleConversationConfig) RemoteConfig.m79298x().m79333v("collapsible_conversation_config", CollapsibleConversationConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            collapsibleConversationConfigNew_ = null;
        }
        if (collapsibleConversationConfigNew_ == null) {
            collapsibleConversationConfigNew_ = CollapsibleConversationConfig.new_();
            collapsibleConversationConfigNew_.ignorable_unread_msg_days = 7;
            collapsibleConversationConfigNew_.enabled = false;
            collapsibleConversationConfigNew_.ignore_old_unread_msg = false;
        }
        if (collapsibleConversationConfigNew_.ignore_msg_days == 0) {
            collapsibleConversationConfigNew_.ignore_msg_days = 7;
            collapsibleConversationConfigNew_.ignore_tip_expose_threshold = 5;
        }
        return collapsibleConversationConfigNew_;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m194773k0() {
        IdealTypeConfig idealTypeConfigM194778l0 = m194778l0();
        if (idealTypeConfigM194778l0 == null) {
            return 3;
        }
        return idealTypeConfigM194778l0.ideal_swipe_guide_limit;
    }

    /* JADX INFO: renamed from: k1 */
    public static WarmingUpEmoResConfig m194774k1() {
        WarmingUpEmoResConfig warmingUpEmoResConfig;
        try {
            warmingUpEmoResConfig = (WarmingUpEmoResConfig) RemoteConfig.m79298x().m79333v("chat_poke_sticker", WarmingUpEmoResConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            warmingUpEmoResConfig = null;
        }
        if (!NullChecker.m81303a(warmingUpEmoResConfig)) {
            return WarmingUpEmoResConfig.new_();
        }
        warmingUpEmoResConfig.nullCheck();
        return warmingUpEmoResConfig;
    }

    /* JADX INFO: renamed from: k2 */
    public static boolean m194775k2() {
        return TextUtils.equals(ABManager.m29350i0("message_list"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: k3 */
    public static boolean m194776k3() {
        CardInvalidCheck cardInvalidCheckM194631F = m194631F();
        if (NullChecker.m81303a(cardInvalidCheckM194631F)) {
            return cardInvalidCheckM194631F.checkCard;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static CollapsibleConversationConfig m194777l() {
        CollapsibleConversationConfig collapsibleConversationConfigNew_;
        try {
            collapsibleConversationConfigNew_ = (CollapsibleConversationConfig) RemoteConfig.m79298x().m79333v("collapsible_conversation_config_v2", CollapsibleConversationConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            collapsibleConversationConfigNew_ = null;
        }
        if (collapsibleConversationConfigNew_ == null) {
            collapsibleConversationConfigNew_ = CollapsibleConversationConfig.new_();
            collapsibleConversationConfigNew_.ignorable_unread_msg_days = 7;
            collapsibleConversationConfigNew_.enabled = false;
            collapsibleConversationConfigNew_.ignore_old_unread_msg = false;
            collapsibleConversationConfigNew_.last_conversation_not_participating = 10;
        }
        if (collapsibleConversationConfigNew_.ignore_msg_days == 0) {
            collapsibleConversationConfigNew_.ignore_msg_days = 7;
            collapsibleConversationConfigNew_.ignore_tip_expose_threshold = 5;
        }
        return collapsibleConversationConfigNew_;
    }

    /* JADX INFO: renamed from: l0 */
    public static IdealTypeConfig m194778l0() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("idealtype_config"))) {
            return null;
        }
        try {
            return (IdealTypeConfig) RemoteConfig.m79298x().m79333v("idealtype_config", IdealTypeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static WarmingUpResConfig m194779l1() {
        WarmingUpResConfig warmingUpResConfig;
        try {
            warmingUpResConfig = (WarmingUpResConfig) RemoteConfig.m79298x().m79333v("chatheat_config", WarmingUpResConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            warmingUpResConfig = null;
        }
        if (!NullChecker.m81303a(warmingUpResConfig)) {
            return WarmingUpResConfig.new_();
        }
        warmingUpResConfig.nullCheck();
        return warmingUpResConfig;
    }

    /* JADX INFO: renamed from: l2 */
    public static boolean m194780l2() {
        return TextUtils.equals(ABManager.m29350i0(Explore.TYPE), "moment");
    }

    /* JADX INFO: renamed from: l3 */
    public static boolean m194781l3() {
        return TextUtils.equals(ABManager.m29350i0("android_conv_counter_sync"), "sync");
    }

    /* JADX INFO: renamed from: m */
    public static int m194782m() {
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    public static ImproveInformationConfig m194783m0() {
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public static WechatNotifyConfig m194784m1() {
        return null;
    }

    /* JADX INFO: renamed from: m2 */
    public static boolean m194785m2() {
        HomeRealV2Config homeRealV2ConfigM194753g0 = m194753g0();
        return NullChecker.m81303a(homeRealV2ConfigM194753g0) && homeRealV2ConfigM194753g0.momentEnable;
    }

    /* JADX INFO: renamed from: m3 */
    public static String m194786m3() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("flipped_match_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("emoji", "[嘿哈]") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static ConversationRefreshIntervalConfig m194787n() {
        if (TextUtils.isEmpty(RemoteConfig.m79298x().m79302F("android_conversation_refresh_interval"))) {
            return null;
        }
        try {
            return (ConversationRefreshIntervalConfig) RemoteConfig.m79298x().m79333v("android_conversation_refresh_interval", ConversationRefreshIntervalConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static int m194788n0() {
        MarryGuideConfig marryGuideConfigM194813s0 = m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            return marryGuideConfigM194813s0.guide_timeinterval;
        }
        return 1;
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m194789n1() {
        try {
            return new JSONObject(RemoteConfig.m79298x().m79302F("ignore_code_config")).optBoolean("ignore_code_basehomelayoutfrag_create", true);
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: n2 */
    public static boolean m194790n2() {
        return m194647I0().enableGreeting || e900.m115330b().m115333e();
    }

    /* JADX INFO: renamed from: n3 */
    public static boolean m194791n3() {
        return TextUtils.equals(AuthenticationTokenClaims.JSON_KEY_EXP, ABManager.m29350i0("new_matched_page")) || m194676O();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m194792o() {
        try {
            return RemoteConfig.m79298x().m79330s("del_or_hidden_server_switch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static int m194793o0() {
        MarryGuideConfig marryGuideConfigM194813s0 = m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            return marryGuideConfigM194813s0.totoal_guide_limit;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o1 */
    public static boolean m194794o1() {
        return TextUtils.equals(ABManager.m29350i0("card_control_sec_live_core"), AuthenticationTokenClaims.JSON_KEY_EXP) || TextUtils.equals(ABManager.m29350i0("card_control_sec_live"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: o2 */
    public static boolean m194795o2() {
        MyTabOptConfig myTabOptConfigM194667M0 = m194667M0();
        return NullChecker.m81303a(myTabOptConfigM194667M0) && myTabOptConfigM194667M0.enable && m194665L3();
    }

    /* JADX INFO: renamed from: o3 */
    public static OOFEntrenceConfig m194796o3() {
        try {
            OOFEntrenceConfig oOFEntrenceConfig = (OOFEntrenceConfig) RemoteConfig.m79298x().m79333v("choose_config", OOFEntrenceConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(oOFEntrenceConfig)) {
                return oOFEntrenceConfig;
            }
        } catch (Exception unused) {
        }
        return OOFEntrenceConfig.new_();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX INFO: renamed from: p */
    public static ProfileCompletionConfig m194797p() {
        int i;
        ProfileCompletionConfig profileCompletionConfigNew_;
        int i2 = 0;
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("profile_completion_config");
            if (TextUtils.isEmpty(strM79302F)) {
                i = 0;
            } else {
                ProfileCompletionConfig profileCompletionConfig = ProfileCompletionConfig.JSON_ADAPTER.parse(strM79302F);
                if (NullChecker.m81303a(profileCompletionConfig)) {
                    DatingPurpose datingPurpose = profileCompletionConfig.weight;
                    if (datingPurpose.picture.size() == 6) {
                        Iterator<Integer> it = datingPurpose.picture.iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue += it.next().intValue();
                        }
                        if (iIntValue + datingPurpose.introduction + datingPurpose.information + datingPurpose.extension + datingPurpose.question + datingPurpose.interest + datingPurpose.personality == 100) {
                            return profileCompletionConfig;
                        }
                    }
                    i = profileCompletionConfig.self_introduction_picture_num;
                } else {
                    i = 0;
                }
            }
            while (true) {
                DatingPurpose datingPurpose2 = profileCompletionConfigNew_.weight;
                if (i2 >= 5) {
                    datingPurpose2.introduction = 15;
                    datingPurpose2.information = 10;
                    datingPurpose2.extension = 5;
                    datingPurpose2.question = 5;
                    datingPurpose2.personality = 5;
                    datingPurpose2.interest = 5;
                    profileCompletionConfigNew_.self_introduction_picture_num = i;
                    return profileCompletionConfigNew_;
                }
                datingPurpose2.picture.add(8);
                i2++;
            }
        } catch (Exception unused) {
        }
        profileCompletionConfigNew_ = ProfileCompletionConfig.new_();
        DatingPurpose datingPurposeNew_ = DatingPurpose.new_();
        profileCompletionConfigNew_.weight = datingPurposeNew_;
        datingPurposeNew_.picture = new ArrayList();
        profileCompletionConfigNew_.weight.picture.add(15);
    }

    /* JADX INFO: renamed from: p0 */
    public static int m194798p0() {
        MarryGuideConfig marryGuideConfigM194813s0 = m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            return marryGuideConfigM194813s0.continuous_left;
        }
        return 5;
    }

    /* JADX INFO: renamed from: p1 */
    public static int m194799p1() {
        SeeMyselfConfig seeMyselfConfigM194725a1 = m194725a1();
        if (NullChecker.m81303a(seeMyselfConfigM194725a1)) {
            return seeMyselfConfigM194725a1.mirror_guide_user_signup_days_count;
        }
        return 7;
    }

    /* JADX INFO: renamed from: p2 */
    public static boolean m194800p2() {
        MyTabOptV2Config myTabOptV2ConfigM194672N0 = m194672N0();
        return NullChecker.m81303a(myTabOptV2ConfigM194672N0) && myTabOptV2ConfigM194672N0.enable && m194665L3();
    }

    /* JADX INFO: renamed from: p3 */
    public static int m194801p3() {
        OldUserWelcome oldUserWelcome;
        int i;
        try {
            oldUserWelcome = (OldUserWelcome) RemoteConfig.m79298x().m79333v("time_interval", OldUserWelcome.JSON_ADAPTER);
        } catch (Exception unused) {
            oldUserWelcome = null;
        }
        if (!NullChecker.m81303a(oldUserWelcome) || (i = oldUserWelcome.time_interval) <= 0) {
            return 15;
        }
        return i;
    }

    /* JADX INFO: renamed from: q */
    public static int m194802q() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_first_close_count;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static int m194803q0() {
        MarryGuideConfig marryGuideConfigM194813s0 = m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            return marryGuideConfigM194813s0.continuous_no_match;
        }
        return 10;
    }

    /* JADX INFO: renamed from: q1 */
    public static int m194804q1() {
        SeeMyselfConfig seeMyselfConfigM194725a1 = m194725a1();
        if (NullChecker.m81303a(seeMyselfConfigM194725a1)) {
            return seeMyselfConfigM194725a1.mirror_guide_swipe_count;
        }
        return 3;
    }

    /* JADX INFO: renamed from: q2 */
    public static boolean m194805q2() {
        NewMatchConfig newMatchConfig;
        try {
            newMatchConfig = (NewMatchConfig) RemoteConfig.m79298x().m79333v("new_match_config", NewMatchConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            newMatchConfig = null;
        }
        return newMatchConfig != null && newMatchConfig.suggest;
    }

    /* JADX INFO: renamed from: q3 */
    public static boolean m194806q3() {
        return TextUtils.equals(ABManager.m29350i0("old_welcome_new"), "exp1");
    }

    /* JADX INFO: renamed from: r */
    public static int m194807r() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_first_close_freezing_time;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static MarryConfig m194808r0() {
        try {
            return (MarryConfig) RemoteConfig.m79298x().m79333v("marry_config", MarryConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static boolean m194809r1() {
        return TextUtils.equals(ABManager.m29350i0("old_pair_make_active"), AuthenticationTokenClaims.JSON_KEY_EXP) || i36.m134149g().m134158m();
    }

    /* JADX INFO: renamed from: r2 */
    public static boolean m194810r2() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("optimize_tag_config");
            if (TextUtils.isEmpty(strM79302F)) {
                return false;
            }
            return new JSONObject(strM79302F).optBoolean("tagClickable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static boolean m194811r3() {
        return TextUtils.equals(ABManager.m29350i0("old_welcome_new"), "exp2");
    }

    /* JADX INFO: renamed from: s */
    public static int m194812s() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_repeatly_close_count;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static MarryGuideConfig m194813s0() {
        try {
            return (MarryGuideConfig) RemoteConfig.m79298x().m79333v("marriage_config_v2", MarryGuideConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static boolean m194814s1() {
        return RemoteConfig.m79298x().m79330s("check_ai_avatar");
    }

    /* JADX INFO: renamed from: s2 */
    public static boolean m194815s2() {
        return RemoteConfig.m79298x().m79330s("oom_optimize");
    }

    /* JADX INFO: renamed from: s3 */
    public static LabelParams m194816s3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM194821t3 = m194821t3();
        if (!NullChecker.m81303a(pairedOnlineMessagesGuideConfigM194821t3)) {
            return null;
        }
        if ((!pairedOnlineMessagesGuideConfigM194821t3.exp1 && !pairedOnlineMessagesGuideConfigM194821t3.exp2) || TextUtils.isEmpty(pairedOnlineMessagesGuideConfigM194821t3.key) || TextUtils.isEmpty(pairedOnlineMessagesGuideConfigM194821t3.value)) {
            return null;
        }
        LabelParams labelParamsNew_ = LabelParams.new_();
        labelParamsNew_.key = pairedOnlineMessagesGuideConfigM194821t3.key;
        labelParamsNew_.value = pairedOnlineMessagesGuideConfigM194821t3.value;
        return labelParamsNew_;
    }

    /* JADX INFO: renamed from: t */
    public static int m194817t() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_repeatly_close_freezing_time;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static String m194818t0() {
        String str;
        MarryGuideConfig marryGuideConfigM194813s0 = m194813s0();
        if (NullChecker.m81303a(marryGuideConfigM194813s0)) {
            str = CoreModule.f17545c.f19639e0.m169520na().isFemale() ? marryGuideConfigM194813s0.female_action : marryGuideConfigM194813s0.male_action;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return CoreModule.f17545c.f19639e0.m169520na().isFemale() ? "想认识他" : "想认识她";
        }
        return str;
    }

    /* JADX INFO: renamed from: t1 */
    public static boolean m194819t1() {
        if (!f177582a.get().booleanValue() && TextUtils.equals(ABManager.m29350i0("chat_new"), "all_users")) {
            f177582a.put(Boolean.TRUE);
        }
        return TextUtils.equals(ABManager.m29350i0("chat_new"), "all_users");
    }

    /* JADX INFO: renamed from: t2 */
    public static boolean m194820t2() {
        return "with_intimacy_topic".equals(ABManager.m29350i0("chat_intimacy_topic"));
    }

    /* JADX INFO: renamed from: t3 */
    public static PairedOnlineMessagesGuideConfig m194821t3() {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static int m194822u() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_second_close_count;
            }
            return 4;
        } catch (Exception unused) {
            return 4;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static List<String> m194823u0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("[嘿哈]");
        arrayList.add("[爱心]");
        arrayList.add("[啤酒]");
        arrayList.add("[暗中观察]");
        arrayList.add("[摆手]");
        ArrayList arrayList2 = new ArrayList();
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("match_guide_chat_emoji");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONArray jSONArrayOptJSONArray = new JSONObject(strM79302F).optJSONArray("emoji_array");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList2.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                return vwb.m200296J(arrayList2) ? arrayList : arrayList2;
            }
        } catch (Exception unused) {
        }
        return vwb.m200296J(arrayList2) ? arrayList : arrayList2;
    }

    /* JADX INFO: renamed from: u1 */
    public static boolean m194824u1() {
        return NullChecker.m81303a(m194621D()) && m194621D().enabled;
    }

    /* JADX INFO: renamed from: u2 */
    public static boolean m194825u2() {
        lra0.f129526n0.get().booleanValue();
        return false;
    }

    /* JADX INFO: renamed from: u3 */
    public static boolean m194826u3() {
        return m194831v3() || m194836w3();
    }

    /* JADX INFO: renamed from: v */
    public static int m194827v() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_second_close_freezing_time;
            }
            return 10;
        } catch (Exception unused) {
            return 10;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static int m194828v0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strM79302F)) {
                return 3;
            }
            return new JSONObject(strM79302F).optInt("count_limit");
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: v1 */
    public static boolean m194829v1() {
        return m194665L3() && RemoteConfig.m79298x().m79330s("boot_up_suggest_merge_flag");
    }

    /* JADX INFO: renamed from: v2 */
    public static boolean m194830v2() {
        return TextUtils.equals(ABManager.m29348h0("popup_unshow"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m194831v3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM194821t3 = m194821t3();
        return NullChecker.m81303a(pairedOnlineMessagesGuideConfigM194821t3) && pairedOnlineMessagesGuideConfigM194821t3.exp1;
    }

    /* JADX INFO: renamed from: w */
    public static int m194832w() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.m79298x().m79333v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_single_close_freezing_time;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static int m194833w0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strM79302F)) {
                return 48;
            }
            return new JSONObject(strM79302F).optInt("time_limit");
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static boolean m194834w1() {
        return !TEnum.equals(qib0.f154719h0, LiveRegionTag.mainland);
    }

    /* JADX INFO: renamed from: w2 */
    public static boolean m194835w2() {
        return m194840x2() || m194850z2();
    }

    /* JADX INFO: renamed from: w3 */
    public static boolean m194836w3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM194821t3 = m194821t3();
        return NullChecker.m81303a(pairedOnlineMessagesGuideConfigM194821t3) && pairedOnlineMessagesGuideConfigM194821t3.exp2;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m194837x() {
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149353d4) && CoreModule.f17545c.f19639e0.f149353d4.get().booleanValue()) {
            return true;
        }
        return RemoteConfig.m79298x().m79330s("see_toast_cache_enable");
    }

    /* JADX INFO: renamed from: x0 */
    public static List<String> m194838x0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("最近在听什么好听的歌吗？求推荐");
        arrayList.add("不工作的时候都喜欢干点儿什么呀？");
        arrayList.add("你的家乡有什么好吃的吗？");
        ArrayList arrayList2 = new ArrayList();
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("match_guide_chat_emoji");
            if (!TextUtils.isEmpty(strM79302F)) {
                JSONArray jSONArrayOptJSONArray = new JSONObject(strM79302F).optJSONArray(MessageType.ice_breaking);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList2.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                return vwb.m200296J(arrayList2) ? arrayList : arrayList2;
            }
        } catch (Exception unused) {
        }
        return vwb.m200296J(arrayList2) ? arrayList : arrayList2;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m194839x1() {
        return TextUtils.equals(ABManager.m29350i0("card_live_video"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: x2 */
    public static boolean m194840x2() {
        return (AuthenticationTokenClaims.JSON_KEY_EXP.equals(ABManager.m29350i0("photo_equality")) || RemoteConfig.m79298x().m79330s("photo_equality_enable")) && m194665L3() && !Media.isVideo(CoreModule.f17545c.f19639e0.m169520na().pictures.get(0).mediaType);
    }

    /* JADX INFO: renamed from: x3 */
    public static boolean m194841x3() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m194842y() {
        return m194675N3();
    }

    /* JADX INFO: renamed from: y0 */
    public static MessageFilterConfig m194843y0() {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public static boolean m194844y1() {
        CardOptRemote cardOptRemoteM194641H = m194641H();
        if (NullChecker.m81303a(cardOptRemoteM194641H)) {
            return cardOptRemoteM194641H.card_resolution_opt;
        }
        return false;
    }

    /* JADX INFO: renamed from: y2 */
    public static boolean m194845y2() {
        return RemoteConfig.m79298x().m79330s("photo_equality_enable");
    }

    /* JADX INFO: renamed from: y3 */
    public static boolean m194846y3() {
        return "with_topic_rec".equals(ABManager.m29350i0("chat_topic"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m194847z() {
        return m194665L3() && RemoteConfig.m79298x().m79330s("exp_new_ui");
    }

    /* JADX INFO: renamed from: z0 */
    public static int m194848z0() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("conversation_exposure_sort");
            if (TextUtils.isEmpty(strM79302F)) {
                return 0;
            }
            return new JSONObject(strM79302F).optInt("frequency_limit");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static boolean m194849z1() {
        return false;
    }

    /* JADX INFO: renamed from: z2 */
    public static boolean m194850z2() {
        RealPicturesConfig realPicturesConfigM194709W0 = m194709W0();
        return realPicturesConfigM194709W0 != null && realPicturesConfigM194709W0.enable && m194665L3() && !Media.isVideo(CoreModule.f17545c.f19639e0.m169520na().pictures.get(0).mediaType);
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m194851z3() {
        return TextUtils.equals(ABManager.m29350i0("card_greet_shourtcut"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public final void mo29393a() {
        if (m194710W1()) {
            lip0.m149927i().m149937q();
        }
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public final void mo29394b() {
    }
}
