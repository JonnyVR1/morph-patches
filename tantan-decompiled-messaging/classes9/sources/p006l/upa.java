package p006l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.BoostOptConfig;
import com.p1.mobile.putong.core.data.BoostUserRefactorConfig;
import com.p1.mobile.putong.core.data.CardInvalidCheck;
import com.p1.mobile.putong.core.data.CardOptRemote;
import com.p1.mobile.putong.core.data.CertificationNewConfig;
import com.p1.mobile.putong.core.data.ChatPartnerConfig;
import com.p1.mobile.putong.core.data.ChatRealConfig;
import com.p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p1.mobile.putong.core.data.CollapsibleConversationConfig;
import com.p1.mobile.putong.core.data.ConversationChatGuideConfig;
import com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig;
import com.p1.mobile.putong.core.data.CoreExpandedCardConfig;
import com.p1.mobile.putong.core.data.DatingPurpose;
import com.p1.mobile.putong.core.data.FillUserInfoConfig;
import com.p1.mobile.putong.core.data.GameCpConfig;
import com.p1.mobile.putong.core.data.HomeHealConfig;
import com.p1.mobile.putong.core.data.HomeRealV2Config;
import com.p1.mobile.putong.core.data.HomeTopItemWebConfig;
import com.p1.mobile.putong.core.data.IdealTypeConfig;
import com.p1.mobile.putong.core.data.ImproveInformationConfig;
import com.p1.mobile.putong.core.data.LabelParams;
import com.p1.mobile.putong.core.data.MaleSuperLikeOptimise;
import com.p1.mobile.putong.core.data.MarryConfig;
import com.p1.mobile.putong.core.data.MarryGuideConfig;
import com.p1.mobile.putong.core.data.MessageFilterConfig;
import com.p1.mobile.putong.core.data.MessageRedDotGrayHour;
import com.p1.mobile.putong.core.data.MessageTabRevisionConfig;
import com.p1.mobile.putong.core.data.MomentThemeCardeConfig;
import com.p1.mobile.putong.core.data.MomentUserStateMessageType;
import com.p1.mobile.putong.core.data.MyTabOptConfig;
import com.p1.mobile.putong.core.data.MyTabOptV2Config;
import com.p1.mobile.putong.core.data.NewMatchConfig;
import com.p1.mobile.putong.core.data.NonExpansionCardSwipeVerifiedConfig;
import com.p1.mobile.putong.core.data.OOFEntrenceConfig;
import com.p1.mobile.putong.core.data.OldUserWelcome;
import com.p1.mobile.putong.core.data.PairedOnlineMessagesGuideConfig;
import com.p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p1.mobile.putong.core.data.PushGuideConfig;
import com.p1.mobile.putong.core.data.RealPicturesConfig;
import com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch;
import com.p1.mobile.putong.core.data.RecommendVoiceChatRoomConfig;
import com.p1.mobile.putong.core.data.RepeatNetPictureDlgConfig;
import com.p1.mobile.putong.core.data.SeeMyselfConfig;
import com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p1.mobile.putong.core.data.SwipeRateLimitConfig;
import com.p1.mobile.putong.core.data.SwipeVerifiedConfig;
import com.p1.mobile.putong.core.data.SwitchConvNextConfig;
import com.p1.mobile.putong.core.data.TTCMigrateGuideConfig;
import com.p1.mobile.putong.core.data.UserPicHideIndex;
import com.p1.mobile.putong.core.data.VerifyPremiumIsolationConfig;
import com.p1.mobile.putong.core.data.WarmingUpEmoResConfig;
import com.p1.mobile.putong.core.data.WarmingUpResConfig;
import com.p1.mobile.putong.core.data.WechatNotifyConfig;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l.hpd0;
import l.i36;
import l.lra0;
import l.lz4;
import l.och0;
import l.vwb;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class upa implements ABManager.InterfaceC0104d {

    /* JADX INFO: renamed from: a */
    public static hpd0 f23695a = new hpd0("join_then_leave_ban_or_logout_group_new" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public static boolean m25304A() {
        GameCpConfig gameCpConfigM25436d0 = m25436d0();
        return gameCpConfigM25436d0 != null && gameCpConfigM25436d0.dialogEnable;
    }

    /* JADX INFO: renamed from: A0 */
    public static int m25305A0() {
        try {
            String strF = RemoteConfig.x().F("conversation_exposure_sort");
            if (TextUtils.isEmpty(strF)) {
                return 0;
            }
            return new JSONObject(strF).optInt("req_interval");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static boolean m25306A1() {
        return TextUtils.equals(ABManager.m1256i0("chat_cell_active"), "exp");
    }

    /* JADX INFO: renamed from: A2 */
    public static boolean m25307A2() {
        RealPicturesConfig realPicturesConfigM25407W0 = m25407W0();
        return (realPicturesConfigM25407W0 == null || !realPicturesConfigM25407W0.enable || m25363L3()) ? false : true;
    }

    /* JADX INFO: renamed from: A3 */
    public static int m25308A3() {
        try {
            MessageRedDotGrayHour messageRedDotGrayHour = (MessageRedDotGrayHour) RemoteConfig.x().v("message_red_dot", MessageRedDotGrayHour.JSON_ADAPTER);
            if (NullChecker.a(messageRedDotGrayHour)) {
                return messageRedDotGrayHour.red_dot_gray_hour;
            }
            return 3;
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m25309B() {
        GameCpConfig gameCpConfigM25436d0 = m25436d0();
        return gameCpConfigM25436d0 != null && gameCpConfigM25436d0.enable;
    }

    /* JADX INFO: renamed from: B0 */
    public static int m25310B0() {
        try {
            String strF = RemoteConfig.x().F("message_display_time_info");
            if (TextUtils.isEmpty(strF)) {
                return Integer.MAX_VALUE;
            }
            return new JSONObject(strF).optInt("message_list_intimacy", Integer.MAX_VALUE);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m25311B1() {
        return m25316C1();
    }

    /* JADX INFO: renamed from: B2 */
    public static boolean m25312B2() {
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V == null) {
            return false;
        }
        return coreExpandedCardConfigM25402V.receiveProfileLikeEnable;
    }

    /* JADX INFO: renamed from: B3 */
    public static int m25313B3() {
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m25314C() {
        ImproveInformationConfig improveInformationConfigM25481m0 = m25481m0();
        if (NullChecker.a(improveInformationConfigM25481m0)) {
            return improveInformationConfigM25481m0.cardGuidanceEnable;
        }
        return false;
    }

    /* JADX INFO: renamed from: C0 */
    public static int m25315C0() {
        try {
            String strF = RemoteConfig.x().F("message_display_time_info");
            if (TextUtils.isEmpty(strF)) {
                return Integer.MAX_VALUE;
            }
            return new JSONObject(strF).optInt("message_list_time", Integer.MAX_VALUE);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: C1 */
    public static boolean m25316C1() {
        return TextUtils.equals(ABManager.m1256i0("chat_newmatch_continue"), "exp_strategy") || lz4.h().m();
    }

    /* JADX INFO: renamed from: C2 */
    public static boolean m25317C2() {
        try {
            return new JSONObject(RemoteConfig.x().F("profile_pic_optimization_card_ratio")).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static int m25318C3() {
        try {
            MessageRedDotGrayHour messageRedDotGrayHour = (MessageRedDotGrayHour) RemoteConfig.x().v("message_red_dot", MessageRedDotGrayHour.JSON_ADAPTER);
            if (NullChecker.a(messageRedDotGrayHour)) {
                return messageRedDotGrayHour.patch_max;
            }
            return 100;
        } catch (Exception unused) {
            return 100;
        }
    }

    /* JADX INFO: renamed from: D */
    public static BoostUserRefactorConfig m25319D() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public static List<String> m25320D0() {
        MessageTabRevisionConfig messageTabRevisionConfigM25325E0 = m25325E0();
        return (messageTabRevisionConfigM25325E0 == null || vwb.J(messageTabRevisionConfigM25325E0.animContents)) ? vwb.f0(new String[]{"开始聊天吧...", "输入新聊天...", "聊聊在干嘛...", "等你打招呼..."}) : messageTabRevisionConfigM25325E0.animContents;
    }

    /* JADX INFO: renamed from: D1 */
    public static boolean m25321D1() {
        return TextUtils.equals(ABManager.m1256i0("ChatViewOptimizationAndroid"), "_exp") || !TextUtils.equals(ABManager.m1256i0("ChatViewOptimizationV2"), "__control");
    }

    /* JADX INFO: renamed from: D2 */
    public static boolean m25322D2() {
        return TextUtils.equals(ABManager.m1256i0("push_msg"), "_test");
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m25323D3() {
        return TextUtils.equals(ABManager.m1256i0("message_red_dot"), "exp1");
    }

    /* JADX INFO: renamed from: E */
    public static int m25324E() {
        try {
            String strF = RemoteConfig.x().F("message_break_ice_mv_times");
            if (TextUtils.isEmpty(strF)) {
                return 2;
            }
            return new JSONObject(strF).getInt("maxTimes");
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static MessageTabRevisionConfig m25325E0() {
        return null;
    }

    /* JADX INFO: renamed from: E1 */
    public static boolean m25326E1() {
        String strM1256i0 = ABManager.m1256i0("city_cover_price");
        if (TextUtils.equals(ABManager.m1256i0("city_cover"), "_test")) {
            return true;
        }
        return !TextUtils.isEmpty(strM1256i0) && strM1256i0.contains("_test");
    }

    /* JADX INFO: renamed from: E2 */
    public static boolean m25327E2() {
        try {
            return new JSONObject(RemoteConfig.x().F("privacy_management")).optBoolean("enable", false) && m25363L3();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static boolean m25328E3() {
        return TextUtils.equals(ABManager.m1256i0("message_red_dot"), "exp2");
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static CardInvalidCheck m25329F() {
        try {
            return (CardInvalidCheck) RemoteConfig.x().v("card_invalid_check_config", CardInvalidCheck.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m25330F0() {
        MessageTabRevisionConfig messageTabRevisionConfigM25325E0 = m25325E0();
        return messageTabRevisionConfigM25325E0 != null && messageTabRevisionConfigM25325E0.enabled;
    }

    /* JADX INFO: renamed from: F1 */
    public static boolean m25331F1() {
        return CoreModule.m1853N().so() || CoreModule.m1853N().qn() || CoreModule.m1853N().Nj() || CoreModule.m1853N().Lj();
    }

    /* JADX INFO: renamed from: F2 */
    public static boolean m25332F2() {
        return RemoteConfig.x().z("reswipe_female_match_type", 1) == 1;
    }

    /* JADX INFO: renamed from: F3 */
    public static boolean m25333F3() {
        SeeMyselfConfig seeMyselfConfigM25423a1 = m25423a1();
        return NullChecker.a(seeMyselfConfigM25423a1) && seeMyselfConfigM25423a1.enable && m25363L3();
    }

    /* JADX INFO: renamed from: G */
    public static int m25334G() {
        int i;
        CardInvalidCheck cardInvalidCheckM25329F = m25329F();
        if (!NullChecker.a(cardInvalidCheckM25329F) || (i = cardInvalidCheckM25329F.checkInterval) <= 0) {
            return 10;
        }
        return i;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m25335G0() {
        return (NullChecker.a(m25541y0()) && m25541y0().messageFilterEnabled && m25330F0()) || m25439d3();
    }

    /* JADX INFO: renamed from: G1 */
    public static boolean m25336G1() {
        ConversationChatGuideConfig conversationChatGuideConfigM25359L = m25359L();
        if (conversationChatGuideConfigM25359L != null) {
            return conversationChatGuideConfigM25359L.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: G2 */
    public static boolean m25337G2() {
        RepeatNetPictureDlgConfig repeatNetPictureDlgConfigM25419Z0 = m25419Z0();
        if (repeatNetPictureDlgConfigM25419Z0 != null) {
            return repeatNetPictureDlgConfigM25419Z0.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: G3 */
    public static boolean m25338G3() {
        return m25544y3() || m25518t2();
    }

    /* JADX INFO: renamed from: H */
    public static CardOptRemote m25339H() {
        try {
            return (CardOptRemote) RemoteConfig.x().v("card_opt_config", CardOptRemote.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static double m25340H0() {
        return 0.67d;
    }

    /* JADX INFO: renamed from: H1 */
    public static boolean m25341H1() {
        try {
            return RemoteConfig.x().s("conv_load_op_switch");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H2 */
    public static boolean m25342H2() {
        return TextUtils.equals("repeat_exp", ABManager.m1256i0("real_avatar_identify"));
    }

    /* JADX INFO: renamed from: H3 */
    public static boolean m25343H3() {
        return TextUtils.equals(ABManager.m1256i0("chat_upgrade"), "exp");
    }

    /* JADX INFO: renamed from: I */
    public static int m25344I() {
        MyTabOptV2Config myTabOptV2ConfigM25370N0 = m25370N0();
        if (NullChecker.a(myTabOptV2ConfigM25370N0) && myTabOptV2ConfigM25370N0.enable) {
            return myTabOptV2ConfigM25370N0.cert_center_entry_red_dot_limit;
        }
        return 0;
    }

    /* JADX INFO: renamed from: I0 */
    public static MomentThemeCardeConfig m25345I0() {
        return MomentThemeCardeConfig.new_();
    }

    /* JADX INFO: renamed from: I1 */
    public static boolean m25346I1() {
        return TextUtils.equals(ABManager.m1256i0("group_one"), "group_chat") || TextUtils.equals(ABManager.m1256i0("groupchat"), "second_1") || TextUtils.equals(ABManager.m1256i0("groupchat"), "second_2") || TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_1") || TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_2") || TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_4") || TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_5") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_1") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_2") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_3") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_4") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_5") || m25408W1() || m25351J1();
    }

    /* JADX INFO: renamed from: I2 */
    public static boolean m25347I2() {
        return m25488n2();
    }

    /* JADX INFO: renamed from: I3 */
    public static boolean m25348I3() {
        return TextUtils.equals(ABManager.m1256i0("newuser_icebreak_lead"), "exp");
    }

    /* JADX INFO: renamed from: J */
    public static CertificationNewConfig m25349J() {
        CertificationNewConfig certificationNewConfig;
        try {
            certificationNewConfig = (CertificationNewConfig) RemoteConfig.x().v("new_verification", CertificationNewConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            certificationNewConfig = null;
        }
        if (NullChecker.a(certificationNewConfig)) {
            return certificationNewConfig;
        }
        CertificationNewConfig certificationNewConfigNew_ = CertificationNewConfig.new_();
        certificationNewConfigNew_.maleLimit = 5;
        certificationNewConfigNew_.femaleLimit = 10;
        return certificationNewConfigNew_;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m25350J0() {
        MomentUserStateMessageType momentUserStateMessageType;
        try {
            momentUserStateMessageType = (MomentUserStateMessageType) RemoteConfig.x().v("chat_state_send_type", MomentUserStateMessageType.JSON_ADAPTER);
        } catch (Exception unused) {
            momentUserStateMessageType = null;
        }
        return NullChecker.a(momentUserStateMessageType) ? momentUserStateMessageType.type : "";
    }

    /* JADX INFO: renamed from: J1 */
    public static boolean m25351J1() {
        return TextUtils.equals(ABManager.m1256i0("newgroupchat"), "exp_group");
    }

    /* JADX INFO: renamed from: J2 */
    public static boolean m25352J2() {
        RecommendVoiceChatRoomConfig recommendVoiceChatRoomConfig;
        try {
            recommendVoiceChatRoomConfig = (RecommendVoiceChatRoomConfig) RemoteConfig.x().v("recommend_chat_room_config", RecommendVoiceChatRoomConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            recommendVoiceChatRoomConfig = null;
        }
        if (NullChecker.a(recommendVoiceChatRoomConfig)) {
            return recommendVoiceChatRoomConfig.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: J3 */
    public static boolean m25353J3() {
        return TextUtils.equals(ABManager.m1256i0("swipe_avatar_verified"), "_test");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m25354K() {
        LiveService liveService;
        try {
            nje0 nje0Var = qib0.f19804b0;
            if (nje0Var == null || (liveService = nje0Var.f17708c) == null || liveService.M6() == null) {
                return false;
            }
            return qib0.f19804b0.f17708c.M6().q();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static String m25355K0() {
        try {
            String strF = RemoteConfig.x().F("my_recent_config");
            if (TextUtils.isEmpty(strF)) {
                return "";
            }
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("defaultStatement");
            return jSONArray.getString(new Random().nextInt(jSONArray.length()));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: K1 */
    public static boolean m25356K1() {
        return m25421Z2();
    }

    /* JADX INFO: renamed from: K2 */
    public static boolean m25357K2() {
        try {
            return RemoteConfig.x().s("show_business_license");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static boolean m25358K3() {
        return TextUtils.equals(ABManager.m1256i0("tantan_listview_opt"), "self_view");
    }

    /* JADX INFO: renamed from: L */
    public static ConversationChatGuideConfig m25359L() {
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public static int m25360L0() {
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V == null) {
            return 1;
        }
        return coreExpandedCardConfigM25402V.myTabFetchCoolTime;
    }

    /* JADX INFO: renamed from: L1 */
    public static boolean m25361L1() {
        CoreModule.f1534c.f3628e0.m21483na().isFemale();
        return false;
    }

    /* JADX INFO: renamed from: L2 */
    public static boolean m25362L2() {
        return RemoteConfig.x().s("startup_inflate_thread_priority");
    }

    /* JADX INFO: renamed from: L3 */
    public static boolean m25363L3() {
        m25413X2();
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static ChatPartnerConfig m25364M() {
        try {
            return (ChatPartnerConfig) RemoteConfig.x().v("chat_partner_config", ChatPartnerConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static MyTabOptConfig m25365M0() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("dating_my_tab_optimization"))) {
            return null;
        }
        try {
            return (MyTabOptConfig) RemoteConfig.x().v("dating_my_tab_optimization", MyTabOptConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static boolean m25366M1() {
        try {
            String strF = RemoteConfig.x().F("message_display_time_info");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("display_message_cell", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: M2 */
    public static boolean m25367M2() {
        return TextUtils.equals("exp", ABManager.m1256i0("e_surprisebox"));
    }

    /* JADX INFO: renamed from: M3 */
    public static boolean m25368M3() {
        return !RemoteConfig.x().s("ttt_new_ui_disabled");
    }

    /* JADX INFO: renamed from: N */
    public static ChatRealConfig m25369N() {
        return null;
    }

    /* JADX INFO: renamed from: N0 */
    public static MyTabOptV2Config m25370N0() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("my_tab_opt_v2_config"))) {
            return null;
        }
        try {
            return (MyTabOptV2Config) RemoteConfig.x().v("my_tab_opt_v2_config", MyTabOptV2Config.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: N1 */
    public static boolean m25371N1() {
        try {
            String strF = RemoteConfig.x().F("message_display_time_info");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("display_new_match", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: N2 */
    public static boolean m25372N2() {
        MaleSuperLikeOptimise maleSuperLikeOptimiseB = och0.b();
        return NullChecker.a(maleSuperLikeOptimiseB) && maleSuperLikeOptimiseB.enabled && maleSuperLikeOptimiseB.useSuggestRank;
    }

    /* JADX INFO: renamed from: N3 */
    public static boolean m25373N3() {
        return !RemoteConfig.x().s("ttt_new_ui_disabled");
    }

    /* JADX INFO: renamed from: O */
    public static boolean m25374O() {
        ChatRealConfig chatRealConfigM25369N = m25369N();
        return chatRealConfigM25369N != null && chatRealConfigM25369N.enable;
    }

    /* JADX INFO: renamed from: O0 */
    public static int m25375O0() {
        int i;
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V != null && (i = coreExpandedCardConfigM25402V.nextInfoHeight) > 0) {
            return i;
        }
        return 50;
    }

    /* JADX INFO: renamed from: O1 */
    public static boolean m25376O1() {
        try {
            return new JSONObject(RemoteConfig.x().F("hyper_profile_pic_double_check")).optBoolean("enable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: O2 */
    public static boolean m25377O2() {
        MaleSuperLikeOptimise maleSuperLikeOptimiseB = och0.b();
        return NullChecker.a(maleSuperLikeOptimiseB) && maleSuperLikeOptimiseB.enabled && maleSuperLikeOptimiseB.useCommercialRank;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public static ChatRoundsDisplayedExternallyConfig m25378P() {
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public static int m25379P0() {
        return m25375O0() + 56;
    }

    /* JADX INFO: renamed from: P1 */
    public static boolean m25380P1() {
        return CoreModule.m1853N().Co();
    }

    /* JADX INFO: renamed from: P2 */
    public static boolean m25381P2() {
        return m25385Q2() || m25389R2();
    }

    /* JADX INFO: renamed from: Q */
    public static int m25382Q() {
        return ABManager.m1221A("android_conv_load_opt", "check_mode", AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: Q0 */
    public static int m25383Q0() {
        if (NullChecker.a(m25462i1())) {
            return m25462i1().non_verified_matches_limit;
        }
        return 3;
    }

    /* JADX INFO: renamed from: Q1 */
    public static boolean m25384Q1() {
        try {
            return TextUtils.equals(ABManager.m1256i0("homepage_bottom_bar_reframe"), "exp") && !RemoteConfig.x().s("homepage_live_white");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public static boolean m25385Q2() {
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static int m25386R() {
        ConversationChatGuideConfig conversationChatGuideConfigM25359L = m25359L();
        if (conversationChatGuideConfigM25359L != null) {
            return conversationChatGuideConfigM25359L.dismiss_threshold;
        }
        return 100;
    }

    /* JADX INFO: renamed from: R0 */
    public static List<String> m25387R0() {
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(fillUserInfoConfigM25422a0)) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
                if (!vwb.J(fillUserInfoConfigM25422a0.female_other_tags)) {
                    return fillUserInfoConfigM25422a0.female_other_tags;
                }
            } else if (!vwb.J(fillUserInfoConfigM25422a0.male_other_tags)) {
                return fillUserInfoConfigM25422a0.male_other_tags;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R1 */
    public static boolean m25388R1() {
        try {
            String strF = RemoteConfig.x().F("leadtocommunity_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("exp");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: R2 */
    public static boolean m25389R2() {
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static String m25390S() {
        ConversationChatGuideConfig conversationChatGuideConfigM25359L = m25359L();
        return conversationChatGuideConfigM25359L != null ? conversationChatGuideConfigM25359L.guide_text : "去回复";
    }

    /* JADX INFO: renamed from: S0 */
    public static int m25391S0() {
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V == null) {
            return 3;
        }
        return coreExpandedCardConfigM25402V.maxDislikeGuideShowCount;
    }

    /* JADX INFO: renamed from: S1 */
    public static boolean m25392S1() {
        return TextUtils.equals(ABManager.m1256i0("femaleMatchPage_update"), "A1") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_update"), "A2") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_update"), "A3") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_update"), "A4") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_update"), "A5") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_plugin"), "B1") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_plugin"), "B2") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_plugin"), "B3") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_plugin"), "B4") || TextUtils.equals(ABManager.m1256i0("femaleMatchPage_plugin"), "B5");
    }

    /* JADX INFO: renamed from: S2 */
    public static boolean m25393S2() {
        return NullChecker.a(m25541y0()) && m25541y0().officAccCollectionEnabled;
    }

    /* JADX INFO: renamed from: T */
    public static int m25394T() {
        ConversationChatGuideConfig conversationChatGuideConfigM25359L = m25359L();
        if (conversationChatGuideConfigM25359L != null) {
            return conversationChatGuideConfigM25359L.work_time;
        }
        return 2;
    }

    /* JADX INFO: renamed from: T0 */
    public static int m25395T0() {
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V == null) {
            return 10;
        }
        return coreExpandedCardConfigM25402V.dislikeCountToTriggerGuide;
    }

    /* JADX INFO: renamed from: T1 */
    public static boolean m25396T1() {
        return TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_1") || TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_2") || TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_3") || TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_4") || TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_5") || TextUtils.equals(ABManager.m1256i0("show_if_he_liked"), "show_toast_6");
    }

    /* JADX INFO: renamed from: T2 */
    public static boolean m25397T2() {
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static int m25398U() {
        try {
            String strF = RemoteConfig.x().F("message_display_time_info");
            if (TextUtils.isEmpty(strF)) {
                return Integer.MAX_VALUE;
            }
            return new JSONObject(strF).optInt("display_distance", Integer.MAX_VALUE);
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static int m25399U0() {
        CoreExpandedCardConfig coreExpandedCardConfigM25402V = m25402V();
        if (coreExpandedCardConfigM25402V == null) {
            return 3;
        }
        return coreExpandedCardConfigM25402V.maxLikeGuideShowCount;
    }

    /* JADX INFO: renamed from: U1 */
    public static boolean m25400U1() {
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public static boolean m25401U2() {
        return false;
    }

    /* JADX INFO: renamed from: V */
    public static CoreExpandedCardConfig m25402V() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("expanded_card_config"))) {
            return null;
        }
        try {
            return (CoreExpandedCardConfig) RemoteConfig.x().v("expanded_card_config", CoreExpandedCardConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static int m25403V0() {
        RealPicturesConfig realPicturesConfigM25407W0 = m25407W0();
        if (realPicturesConfigM25407W0 != null) {
            return realPicturesConfigM25407W0.photo_reward_guide_limit;
        }
        return 3;
    }

    /* JADX INFO: renamed from: V1 */
    public static boolean m25404V1() {
        return m25346I1() || m25354K() || m25351J1() || m25460i();
    }

    /* JADX INFO: renamed from: V2 */
    public static boolean m25405V2() {
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static int m25406W() {
        try {
            String strF = RemoteConfig.x().F("leadtocommunity_config");
            if (TextUtils.isEmpty(strF)) {
                return 168;
            }
            return new JSONObject(strF).optInt("x");
        } catch (Exception unused) {
            return 168;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static RealPicturesConfig m25407W0() {
        return null;
    }

    /* JADX INFO: renamed from: W1 */
    public static boolean m25408W1() {
        return TextUtils.equals(ABManager.m1256i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m1256i0("groupchat"), "anonymous_3");
    }

    /* JADX INFO: renamed from: W2 */
    public static boolean m25409W2() {
        return TextUtils.equals(ABManager.m1256i0("anti_harass_customiza_set"), "_match_include") || TextUtils.equals(ABManager.m1256i0("anti_harass_customiza_set"), "_match_exact");
    }

    /* JADX INFO: renamed from: X */
    public static int m25410X() {
        try {
            String strF = RemoteConfig.x().F("leadtocommunity_config");
            if (TextUtils.isEmpty(strF)) {
                return 2;
            }
            return new JSONObject(strF).optInt("y");
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static String m25411X0() {
        return (NullChecker.a(mu5.f17252a) && NullChecker.a(mu5.f17252a.get()) && ((String) mu5.f17252a.get()).contains("staging")) ? "1450_1448_1446_0" : "100071_100064_100067_0";
    }

    /* JADX INFO: renamed from: X1 */
    public static boolean m25412X1() {
        try {
            return RemoteConfig.x().s("enable_white_black_style");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: X2 */
    public static boolean m25413X2() {
        HomeRealV2Config homeRealV2ConfigM25451g0 = m25451g0();
        return NullChecker.a(homeRealV2ConfigM25451g0) && homeRealV2ConfigM25451g0.marriageEnable;
    }

    /* JADX INFO: renamed from: Y */
    public static int m25414Y() {
        try {
            String strF = RemoteConfig.x().F("leadtocommunity_config");
            if (TextUtils.isEmpty(strF)) {
                return 720;
            }
            return new JSONObject(strF).optInt("z");
        } catch (Exception unused) {
            return 720;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static RealtimeRefreshNewMatch m25415Y0() {
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = null;
        try {
            String strF = RemoteConfig.x().F("realtime_refresh_new_match");
            if (!TextUtils.isEmpty(strF)) {
                realtimeRefreshNewMatch = (RealtimeRefreshNewMatch) RealtimeRefreshNewMatch.JSON_ADAPTER.parse(strF);
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
    public static boolean m25416Y1() {
        m25476l0();
        return false;
    }

    /* JADX INFO: renamed from: Y2 */
    public static boolean m25417Y2() {
        try {
            String strF = RemoteConfig.x().F("video_immersion");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("soundSwitch", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static String m25418Z(User user) {
        String str;
        if (!TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3631f0.f3885S0.get())) {
            return (String) CoreModule.f1534c.f3631f0.f3885S0.get();
        }
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        if (NullChecker.a(fillUserInfoConfigM25422a0)) {
            str = user.isFemale() ? fillUserInfoConfigM25422a0.male_avatar_url : fillUserInfoConfigM25422a0.female_avatar_url;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return user.isFemale() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjZZNk9PUVVJWFlGSTVGR0lYQTVZUVBQQ0k0RktSRzExIiwidyI6MzAwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDUyNDc4ODMwMzIzMDM3NDgxfQ" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjM2VUU2TFgyV01GSEs3TlJSSVBTVVBNVVM1UjJKVzEwIiwidyI6MzAwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI0OTkzOTI1MTc2NjYwMjczM30";
        }
        return str;
    }

    /* JADX INFO: renamed from: Z0 */
    public static RepeatNetPictureDlgConfig m25419Z0() {
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public static boolean m25420Z1() {
        return false;
    }

    /* JADX INFO: renamed from: Z2 */
    public static boolean m25421Z2() {
        SwipeVerifiedConfig swipeVerifiedConfig;
        try {
            swipeVerifiedConfig = (SwipeVerifiedConfig) RemoteConfig.x().v("swipe_verified_config", SwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            swipeVerifiedConfig = null;
        }
        return NullChecker.a(swipeVerifiedConfig) && swipeVerifiedConfig.enable && m25363L3();
    }

    /* JADX INFO: renamed from: a0 */
    public static FillUserInfoConfig m25422a0() {
        try {
            return (FillUserInfoConfig) RemoteConfig.x().v("fill_user_info_config", FillUserInfoConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static SeeMyselfConfig m25423a1() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("new_user_mirror_guide"))) {
            return null;
        }
        try {
            return (SeeMyselfConfig) RemoteConfig.x().v("new_user_mirror_guide", SeeMyselfConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static boolean m25424a2() {
        return qp8.m22318b();
    }

    /* JADX INFO: renamed from: a3 */
    public static SwipeVerifiedConfig m25425a3() {
        try {
            return (SwipeVerifiedConfig) RemoteConfig.x().v("swipe_verified_config", SwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m25426b0() {
        int i;
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        if (fillUserInfoConfigM25422a0 == null || (i = fillUserInfoConfigM25422a0.expire_days) <= 0) {
            return 2;
        }
        return i;
    }

    /* JADX INFO: renamed from: b1 */
    public static int m25427b1() {
        int iY = RemoteConfig.x().y("see_toast_limit_time");
        if (iY < 1) {
            return 30;
        }
        return iY;
    }

    /* JADX INFO: renamed from: b2 */
    public static boolean m25428b2() {
        try {
            return RemoteConfig.x().s("enableCountdownLike");
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b3 */
    public static NonExpansionCardSwipeVerifiedConfig m25429b3() {
        try {
            return (NonExpansionCardSwipeVerifiedConfig) RemoteConfig.x().v("non_expansion_card_swipe_verified_config", NonExpansionCardSwipeVerifiedConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static BoostOptConfig m25430c() {
        BoostOptConfig boostOptConfig;
        try {
            boostOptConfig = (BoostOptConfig) RemoteConfig.x().v("boost_opt_config", BoostOptConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            boostOptConfig = null;
        }
        if (NullChecker.a(boostOptConfig)) {
            return boostOptConfig;
        }
        BoostOptConfig boostOptConfigNew_ = BoostOptConfig.new_();
        boostOptConfigNew_.min_match_count = 1;
        return boostOptConfigNew_;
    }

    /* JADX INFO: renamed from: c0 */
    public static String m25431c0(User user) {
        String str;
        if (!TextUtils.isEmpty((CharSequence) CoreModule.f1534c.f3631f0.f3888T0.get())) {
            return (String) CoreModule.f1534c.f3631f0.f3888T0.get();
        }
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        if (NullChecker.a(fillUserInfoConfigM25422a0)) {
            str = user.isFemale() ? fillUserInfoConfigM25422a0.male_name : fillUserInfoConfigM25422a0.female_name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return user.isFemale() ? "郑翔杰" : "赵思思";
        }
        return str;
    }

    /* JADX INFO: renamed from: c1 */
    public static List<String> m25432c1() {
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(fillUserInfoConfigM25422a0)) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
                if (!vwb.J(fillUserInfoConfigM25422a0.female_self_intro_tags_1)) {
                    return fillUserInfoConfigM25422a0.female_self_intro_tags_1;
                }
            } else if (!vwb.J(fillUserInfoConfigM25422a0.male_self_intro_tags_1)) {
                return fillUserInfoConfigM25422a0.male_self_intro_tags_1;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c2 */
    public static boolean m25433c2() {
        return TextUtils.equals(ABManager.m1256i0("quickchat_male_ring"), "exp1");
    }

    /* JADX INFO: renamed from: c3 */
    public static boolean m25434c3() {
        NonExpansionCardSwipeVerifiedConfig nonExpansionCardSwipeVerifiedConfigM25429b3 = m25429b3();
        return NullChecker.a(nonExpansionCardSwipeVerifiedConfigM25429b3) && nonExpansionCardSwipeVerifiedConfigM25429b3.enable && !m25363L3();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25435d() {
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public static GameCpConfig m25436d0() {
        try {
            return (GameCpConfig) RemoteConfig.x().v("game_cp", GameCpConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static List<String> m25437d1() {
        FillUserInfoConfig fillUserInfoConfigM25422a0 = m25422a0();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(fillUserInfoConfigM25422a0)) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
                if (!vwb.J(fillUserInfoConfigM25422a0.female_self_intro_tags_2)) {
                    return fillUserInfoConfigM25422a0.female_self_intro_tags_2;
                }
            } else if (!vwb.J(fillUserInfoConfigM25422a0.male_self_intro_tags_2)) {
                return fillUserInfoConfigM25422a0.male_self_intro_tags_2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d2 */
    public static boolean m25438d2() {
        return TextUtils.equals(ABManager.m1256i0("quickchat_male_ring"), "exp2");
    }

    /* JADX INFO: renamed from: d3 */
    public static boolean m25439d3() {
        MessageFilterConfig messageFilterConfigM25541y0 = m25541y0();
        return NullChecker.a(messageFilterConfigM25541y0) && messageFilterConfigM25541y0.showRecommendBanner && !vwb.J(messageFilterConfigM25541y0.filterTabList);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25440e() {
        return NullChecker.a(m25462i1()) && m25462i1().restrict_non_verified_common && m25363L3();
    }

    /* JADX INFO: renamed from: e0 */
    public static int m25441e0() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        try {
            UserPicHideIndex userPicHideIndex = (UserPicHideIndex) RemoteConfig.x().v("profile_image_hide_info", UserPicHideIndex.JSON_ADAPTER);
            if (NullChecker.a(userPicHideIndex)) {
                return TEnum.equals(userM21483na.gender, "female") ? userPicHideIndex.female_hide_index : userPicHideIndex.male_hide_index;
            }
            return 1;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static String m25442e1() {
        return "目前最多可发送20条消息，若对方同意配对，才可以无限聊天";
    }

    /* JADX INFO: renamed from: e2 */
    public static boolean m25443e2() {
        m25413X2();
        return false;
    }

    /* JADX INFO: renamed from: e3 */
    public static boolean m25444e3() {
        MessageFilterConfig messageFilterConfigM25541y0 = m25541y0();
        return NullChecker.a(messageFilterConfigM25541y0) && messageFilterConfigM25541y0.showRecommendBanner && messageFilterConfigM25541y0.showRecommendBannerHasNewMatch && !vwb.J(messageFilterConfigM25541y0.filterTabList);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m25445f() {
        return NullChecker.a(m25462i1()) && m25462i1().restrict_non_verified_received_likes && m25363L3();
    }

    /* JADX INFO: renamed from: f0 */
    public static HomeHealConfig m25446f0() {
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public static SpringFestivalMarriageActivitiesConfig m25447f1() {
        if (m25443e2()) {
            try {
                return (SpringFestivalMarriageActivitiesConfig) RemoteConfig.x().v("spring_festival_marriage_activities_config", SpringFestivalMarriageActivitiesConfig.JSON_ADAPTER);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f2 */
    public static boolean m25448f2() {
        return TextUtils.equals(ABManager.m1256i0("chat_match"), "with_icebreak_text");
    }

    /* JADX INFO: renamed from: f3 */
    public static int m25449f3() {
        try {
            return RemoteConfig.x().z("match_icebereak_bubble_times", 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m25450g() {
        return NullChecker.a(m25462i1()) && m25462i1().restrict_non_verified_matches && m25363L3();
    }

    /* JADX INFO: renamed from: g0 */
    public static HomeRealV2Config m25451g0() {
        return null;
    }

    /* JADX INFO: renamed from: g1 */
    public static SwipeRateLimitConfig m25452g1() {
        SwipeRateLimitConfig swipeRateLimitConfig;
        int i;
        try {
            swipeRateLimitConfig = (SwipeRateLimitConfig) RemoteConfig.x().v("swipeRateLimit", SwipeRateLimitConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            swipeRateLimitConfig = null;
        }
        if (!NullChecker.a(swipeRateLimitConfig)) {
            SwipeRateLimitConfig swipeRateLimitConfigNew_ = SwipeRateLimitConfig.new_();
            swipeRateLimitConfigNew_.enable = false;
            return swipeRateLimitConfigNew_;
        }
        if (swipeRateLimitConfig.enable && ((i = swipeRateLimitConfig.countPerSecond) <= 0 || i >= 100)) {
            swipeRateLimitConfig.countPerSecond = 10;
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (swipeRateLimitConfig.enable) {
            if (swipeRateLimitConfig.vip && userM21490p9.isVIP()) {
                swipeRateLimitConfig.enable = false;
            } else if (swipeRateLimitConfig.svip && userM21490p9.isSVIP()) {
                swipeRateLimitConfig.enable = false;
            } else if (swipeRateLimitConfig.dimaond && xma.m27351F3()) {
                swipeRateLimitConfig.enable = false;
            } else if (NullChecker.a(userM21490p9.verifications) && NullChecker.a(userM21490p9.verifications.anchor) && userM21490p9.verifications.anchor.verified) {
                swipeRateLimitConfig.enable = false;
            }
            swipeRateLimitConfig.locaInterval = AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO / swipeRateLimitConfig.countPerSecond;
        }
        return swipeRateLimitConfig;
    }

    /* JADX INFO: renamed from: g2 */
    public static boolean m25453g2() {
        return TextUtils.equals(ABManager.m1256i0("match_page_message"), "all");
    }

    /* JADX INFO: renamed from: g3 */
    public static TTCMigrateGuideConfig m25454g3() {
        try {
            TTCMigrateGuideConfig tTCMigrateGuideConfig = (TTCMigrateGuideConfig) RemoteConfig.x().v("ttt_ttc_bind_phone", TTCMigrateGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(tTCMigrateGuideConfig)) {
                return tTCMigrateGuideConfig;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25455h() {
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static HomeTopItemWebConfig m25456h0() {
        HomeTopItemWebConfig homeTopItemWebConfig;
        try {
            homeTopItemWebConfig = (HomeTopItemWebConfig) RemoteConfig.x().v("home_top_item_web_config", HomeTopItemWebConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            homeTopItemWebConfig = null;
        }
        if (NullChecker.a(homeTopItemWebConfig)) {
            return homeTopItemWebConfig;
        }
        HomeTopItemWebConfig homeTopItemWebConfigNew_ = HomeTopItemWebConfig.new_();
        homeTopItemWebConfigNew_.enable = false;
        return homeTopItemWebConfigNew_;
    }

    /* JADX INFO: renamed from: h1 */
    public static SwitchConvNextConfig m25457h1() {
        SwitchConvNextConfig switchConvNextConfig;
        try {
            switchConvNextConfig = (SwitchConvNextConfig) RemoteConfig.x().v("switch_conv_next_config", SwitchConvNextConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            switchConvNextConfig = null;
        }
        if (NullChecker.a(switchConvNextConfig)) {
            return switchConvNextConfig;
        }
        SwitchConvNextConfig switchConvNextConfigNew_ = SwitchConvNextConfig.new_();
        switchConvNextConfigNew_.exp_limit_hours = m25385Q2() ? 72 : 48;
        switchConvNextConfigNew_.exp_limit_count = m25385Q2() ? 3 : 10;
        switchConvNextConfigNew_.exp_dismiss_count = 3;
        return switchConvNextConfigNew_;
    }

    /* JADX INFO: renamed from: h2 */
    public static boolean m25458h2() {
        return m25453g2() || m25463i2();
    }

    /* JADX INFO: renamed from: h3 */
    public static boolean m25459h3() {
        return !IntlCountryCodeController.m21v();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m25460i() {
        return TextUtils.equals(ABManager.m1256i0("uninstall_chat_clean"), "_exp");
    }

    /* JADX INFO: renamed from: i0 */
    public static int m25461i0() {
        IdealTypeConfig idealTypeConfigM25476l0 = m25476l0();
        if (idealTypeConfigM25476l0 == null) {
            return 3;
        }
        return idealTypeConfigM25476l0.ideal_chat_guide_not_send_message_limit;
    }

    /* JADX INFO: renamed from: i1 */
    public static VerifyPremiumIsolationConfig m25462i1() {
        return null;
    }

    /* JADX INFO: renamed from: i2 */
    public static boolean m25463i2() {
        return TextUtils.equals(ABManager.m1256i0("match_page_message"), "male");
    }

    /* JADX INFO: renamed from: i3 */
    public static int m25464i3() {
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m25465j() {
        return TextUtils.equals(ABManager.m1256i0("message_rank_sec"), "exp1") || TextUtils.equals(ABManager.m1256i0("message_rank_sec"), "exp2") || TextUtils.equals(ABManager.m1256i0("message_rank_sec"), "exp3");
    }

    /* JADX INFO: renamed from: j0 */
    public static int m25466j0() {
        IdealTypeConfig idealTypeConfigM25476l0 = m25476l0();
        if (idealTypeConfigM25476l0 == null) {
            return 3;
        }
        return idealTypeConfigM25476l0.ideal_chat_guide_limit;
    }

    /* JADX INFO: renamed from: j1 */
    public static int m25467j1() {
        if (NullChecker.a(m25462i1())) {
            return m25462i1().non_verified_received_likes_limit;
        }
        return 10;
    }

    /* JADX INFO: renamed from: j2 */
    public static boolean m25468j2() {
        try {
            String strF = RemoteConfig.x().F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static int m25469j3() {
        MyTabOptConfig myTabOptConfigM25365M0 = m25365M0();
        if (NullChecker.a(myTabOptConfigM25365M0)) {
            return myTabOptConfigM25365M0.mirror_guide_user_signup_days_count;
        }
        return 7;
    }

    /* JADX INFO: renamed from: k */
    public static CollapsibleConversationConfig m25470k() {
        CollapsibleConversationConfig collapsibleConversationConfigNew_;
        try {
            CollapsibleConversationConfig collapsibleConversationConfigM25475l = m25475l();
            if (m25475l().enabled) {
                return collapsibleConversationConfigM25475l;
            }
            collapsibleConversationConfigNew_ = (CollapsibleConversationConfig) RemoteConfig.x().v("collapsible_conversation_config", CollapsibleConversationConfig.JSON_ADAPTER);
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
    public static int m25471k0() {
        IdealTypeConfig idealTypeConfigM25476l0 = m25476l0();
        if (idealTypeConfigM25476l0 == null) {
            return 3;
        }
        return idealTypeConfigM25476l0.ideal_swipe_guide_limit;
    }

    /* JADX INFO: renamed from: k1 */
    public static WarmingUpEmoResConfig m25472k1() {
        WarmingUpEmoResConfig warmingUpEmoResConfig;
        try {
            warmingUpEmoResConfig = (WarmingUpEmoResConfig) RemoteConfig.x().v("chat_poke_sticker", WarmingUpEmoResConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            warmingUpEmoResConfig = null;
        }
        if (!NullChecker.a(warmingUpEmoResConfig)) {
            return WarmingUpEmoResConfig.new_();
        }
        warmingUpEmoResConfig.nullCheck();
        return warmingUpEmoResConfig;
    }

    /* JADX INFO: renamed from: k2 */
    public static boolean m25473k2() {
        return TextUtils.equals(ABManager.m1256i0("message_list"), "exp");
    }

    /* JADX INFO: renamed from: k3 */
    public static boolean m25474k3() {
        CardInvalidCheck cardInvalidCheckM25329F = m25329F();
        if (NullChecker.a(cardInvalidCheckM25329F)) {
            return cardInvalidCheckM25329F.checkCard;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static CollapsibleConversationConfig m25475l() {
        CollapsibleConversationConfig collapsibleConversationConfigNew_;
        try {
            collapsibleConversationConfigNew_ = (CollapsibleConversationConfig) RemoteConfig.x().v("collapsible_conversation_config_v2", CollapsibleConversationConfig.JSON_ADAPTER);
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
    public static IdealTypeConfig m25476l0() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("idealtype_config"))) {
            return null;
        }
        try {
            return (IdealTypeConfig) RemoteConfig.x().v("idealtype_config", IdealTypeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l1 */
    public static WarmingUpResConfig m25477l1() {
        WarmingUpResConfig warmingUpResConfig;
        try {
            warmingUpResConfig = (WarmingUpResConfig) RemoteConfig.x().v("chatheat_config", WarmingUpResConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            warmingUpResConfig = null;
        }
        if (!NullChecker.a(warmingUpResConfig)) {
            return WarmingUpResConfig.new_();
        }
        warmingUpResConfig.nullCheck();
        return warmingUpResConfig;
    }

    /* JADX INFO: renamed from: l2 */
    public static boolean m25478l2() {
        return TextUtils.equals(ABManager.m1256i0("explore"), "moment");
    }

    /* JADX INFO: renamed from: l3 */
    public static boolean m25479l3() {
        return TextUtils.equals(ABManager.m1256i0("android_conv_counter_sync"), "sync");
    }

    /* JADX INFO: renamed from: m */
    public static int m25480m() {
        return 0;
    }

    /* JADX INFO: renamed from: m0 */
    public static ImproveInformationConfig m25481m0() {
        return null;
    }

    /* JADX INFO: renamed from: m1 */
    public static WechatNotifyConfig m25482m1() {
        return null;
    }

    /* JADX INFO: renamed from: m2 */
    public static boolean m25483m2() {
        HomeRealV2Config homeRealV2ConfigM25451g0 = m25451g0();
        return NullChecker.a(homeRealV2ConfigM25451g0) && homeRealV2ConfigM25451g0.momentEnable;
    }

    /* JADX INFO: renamed from: m3 */
    public static String m25484m3() {
        try {
            String strF = RemoteConfig.x().F("flipped_match_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString("emoji", "[嘿哈]") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    public static ConversationRefreshIntervalConfig m25485n() {
        if (TextUtils.isEmpty(RemoteConfig.x().F("android_conversation_refresh_interval"))) {
            return null;
        }
        try {
            return (ConversationRefreshIntervalConfig) RemoteConfig.x().v("android_conversation_refresh_interval", ConversationRefreshIntervalConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static int m25486n0() {
        MarryGuideConfig marryGuideConfigM25511s0 = m25511s0();
        if (NullChecker.a(marryGuideConfigM25511s0)) {
            return marryGuideConfigM25511s0.guide_timeinterval;
        }
        return 1;
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m25487n1() {
        try {
            return new JSONObject(RemoteConfig.x().F("ignore_code_config")).optBoolean("ignore_code_basehomelayoutfrag_create", true);
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: n2 */
    public static boolean m25488n2() {
        return m25345I0().enableGreeting || e900.m14414b().m14417e();
    }

    /* JADX INFO: renamed from: n3 */
    public static boolean m25489n3() {
        return TextUtils.equals("exp", ABManager.m1256i0("new_matched_page")) || m25374O();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m25490o() {
        try {
            return RemoteConfig.x().s("del_or_hidden_server_switch");
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static int m25491o0() {
        MarryGuideConfig marryGuideConfigM25511s0 = m25511s0();
        if (NullChecker.a(marryGuideConfigM25511s0)) {
            return marryGuideConfigM25511s0.totoal_guide_limit;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o1 */
    public static boolean m25492o1() {
        return TextUtils.equals(ABManager.m1256i0("card_control_sec_live_core"), "exp") || TextUtils.equals(ABManager.m1256i0("card_control_sec_live"), "exp");
    }

    /* JADX INFO: renamed from: o2 */
    public static boolean m25493o2() {
        MyTabOptConfig myTabOptConfigM25365M0 = m25365M0();
        return NullChecker.a(myTabOptConfigM25365M0) && myTabOptConfigM25365M0.enable && m25363L3();
    }

    /* JADX INFO: renamed from: o3 */
    public static OOFEntrenceConfig m25494o3() {
        try {
            OOFEntrenceConfig oOFEntrenceConfig = (OOFEntrenceConfig) RemoteConfig.x().v("choose_config", OOFEntrenceConfig.JSON_ADAPTER);
            if (NullChecker.a(oOFEntrenceConfig)) {
                return oOFEntrenceConfig;
            }
        } catch (Exception unused) {
        }
        return OOFEntrenceConfig.new_();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX INFO: renamed from: p */
    public static ProfileCompletionConfig m25495p() {
        int i;
        ProfileCompletionConfig profileCompletionConfigNew_;
        int i2 = 0;
        try {
            String strF = RemoteConfig.x().F("profile_completion_config");
            if (TextUtils.isEmpty(strF)) {
                i = 0;
            } else {
                ProfileCompletionConfig profileCompletionConfig = (ProfileCompletionConfig) ProfileCompletionConfig.JSON_ADAPTER.parse(strF);
                if (NullChecker.a(profileCompletionConfig)) {
                    DatingPurpose datingPurpose = profileCompletionConfig.weight;
                    if (datingPurpose.picture.size() == 6) {
                        Iterator it = datingPurpose.picture.iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue += ((Integer) it.next()).intValue();
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
    public static int m25496p0() {
        MarryGuideConfig marryGuideConfigM25511s0 = m25511s0();
        if (NullChecker.a(marryGuideConfigM25511s0)) {
            return marryGuideConfigM25511s0.continuous_left;
        }
        return 5;
    }

    /* JADX INFO: renamed from: p1 */
    public static int m25497p1() {
        SeeMyselfConfig seeMyselfConfigM25423a1 = m25423a1();
        if (NullChecker.a(seeMyselfConfigM25423a1)) {
            return seeMyselfConfigM25423a1.mirror_guide_user_signup_days_count;
        }
        return 7;
    }

    /* JADX INFO: renamed from: p2 */
    public static boolean m25498p2() {
        MyTabOptV2Config myTabOptV2ConfigM25370N0 = m25370N0();
        return NullChecker.a(myTabOptV2ConfigM25370N0) && myTabOptV2ConfigM25370N0.enable && m25363L3();
    }

    /* JADX INFO: renamed from: p3 */
    public static int m25499p3() {
        OldUserWelcome oldUserWelcome;
        int i;
        try {
            oldUserWelcome = (OldUserWelcome) RemoteConfig.x().v("time_interval", OldUserWelcome.JSON_ADAPTER);
        } catch (Exception unused) {
            oldUserWelcome = null;
        }
        if (!NullChecker.a(oldUserWelcome) || (i = oldUserWelcome.time_interval) <= 0) {
            return 15;
        }
        return i;
    }

    /* JADX INFO: renamed from: q */
    public static int m25500q() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_first_close_count;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static int m25501q0() {
        MarryGuideConfig marryGuideConfigM25511s0 = m25511s0();
        if (NullChecker.a(marryGuideConfigM25511s0)) {
            return marryGuideConfigM25511s0.continuous_no_match;
        }
        return 10;
    }

    /* JADX INFO: renamed from: q1 */
    public static int m25502q1() {
        SeeMyselfConfig seeMyselfConfigM25423a1 = m25423a1();
        if (NullChecker.a(seeMyselfConfigM25423a1)) {
            return seeMyselfConfigM25423a1.mirror_guide_swipe_count;
        }
        return 3;
    }

    /* JADX INFO: renamed from: q2 */
    public static boolean m25503q2() {
        NewMatchConfig newMatchConfig;
        try {
            newMatchConfig = (NewMatchConfig) RemoteConfig.x().v("new_match_config", NewMatchConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            newMatchConfig = null;
        }
        return newMatchConfig != null && newMatchConfig.suggest;
    }

    /* JADX INFO: renamed from: q3 */
    public static boolean m25504q3() {
        return TextUtils.equals(ABManager.m1256i0("old_welcome_new"), "exp1");
    }

    /* JADX INFO: renamed from: r */
    public static int m25505r() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_first_close_freezing_time;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static MarryConfig m25506r0() {
        try {
            return (MarryConfig) RemoteConfig.x().v("marry_config", MarryConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public static boolean m25507r1() {
        return TextUtils.equals(ABManager.m1256i0("old_pair_make_active"), "exp") || i36.g().m();
    }

    /* JADX INFO: renamed from: r2 */
    public static boolean m25508r2() {
        try {
            String strF = RemoteConfig.x().F("optimize_tag_config");
            if (TextUtils.isEmpty(strF)) {
                return false;
            }
            return new JSONObject(strF).optBoolean("tagClickable", false);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: r3 */
    public static boolean m25509r3() {
        return TextUtils.equals(ABManager.m1256i0("old_welcome_new"), "exp2");
    }

    /* JADX INFO: renamed from: s */
    public static int m25510s() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_repeatly_close_count;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static MarryGuideConfig m25511s0() {
        try {
            return (MarryGuideConfig) RemoteConfig.x().v("marriage_config_v2", MarryGuideConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static boolean m25512s1() {
        return RemoteConfig.x().s("check_ai_avatar");
    }

    /* JADX INFO: renamed from: s2 */
    public static boolean m25513s2() {
        return RemoteConfig.x().s("oom_optimize");
    }

    /* JADX INFO: renamed from: s3 */
    public static LabelParams m25514s3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM25519t3 = m25519t3();
        if (!NullChecker.a(pairedOnlineMessagesGuideConfigM25519t3)) {
            return null;
        }
        if ((!pairedOnlineMessagesGuideConfigM25519t3.exp1 && !pairedOnlineMessagesGuideConfigM25519t3.exp2) || TextUtils.isEmpty(pairedOnlineMessagesGuideConfigM25519t3.key) || TextUtils.isEmpty(pairedOnlineMessagesGuideConfigM25519t3.value)) {
            return null;
        }
        LabelParams labelParamsNew_ = LabelParams.new_();
        labelParamsNew_.key = pairedOnlineMessagesGuideConfigM25519t3.key;
        labelParamsNew_.value = pairedOnlineMessagesGuideConfigM25519t3.value;
        return labelParamsNew_;
    }

    /* JADX INFO: renamed from: t */
    public static int m25515t() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_repeatly_close_freezing_time;
            }
            return 5;
        } catch (Exception unused) {
            return 5;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static String m25516t0() {
        String str;
        MarryGuideConfig marryGuideConfigM25511s0 = m25511s0();
        if (NullChecker.a(marryGuideConfigM25511s0)) {
            str = CoreModule.f1534c.f3628e0.m21483na().isFemale() ? marryGuideConfigM25511s0.female_action : marryGuideConfigM25511s0.male_action;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return CoreModule.f1534c.f3628e0.m21483na().isFemale() ? "想认识他" : "想认识她";
        }
        return str;
    }

    /* JADX INFO: renamed from: t1 */
    public static boolean m25517t1() {
        if (!((Boolean) f23695a.get()).booleanValue() && TextUtils.equals(ABManager.m1256i0("chat_new"), "all_users")) {
            f23695a.put(Boolean.TRUE);
        }
        return TextUtils.equals(ABManager.m1256i0("chat_new"), "all_users");
    }

    /* JADX INFO: renamed from: t2 */
    public static boolean m25518t2() {
        return "with_intimacy_topic".equals(ABManager.m1256i0("chat_intimacy_topic"));
    }

    /* JADX INFO: renamed from: t3 */
    public static PairedOnlineMessagesGuideConfig m25519t3() {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static int m25520u() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_second_close_count;
            }
            return 4;
        } catch (Exception unused) {
            return 4;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static List<String> m25521u0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("[嘿哈]");
        arrayList.add("[爱心]");
        arrayList.add("[啤酒]");
        arrayList.add("[暗中观察]");
        arrayList.add("[摆手]");
        ArrayList arrayList2 = new ArrayList();
        try {
            String strF = RemoteConfig.x().F("match_guide_chat_emoji");
            if (!TextUtils.isEmpty(strF)) {
                JSONArray jSONArrayOptJSONArray = new JSONObject(strF).optJSONArray("emoji_array");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList2.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                return vwb.J(arrayList2) ? arrayList : arrayList2;
            }
        } catch (Exception unused) {
        }
        return vwb.J(arrayList2) ? arrayList : arrayList2;
    }

    /* JADX INFO: renamed from: u1 */
    public static boolean m25522u1() {
        return NullChecker.a(m25319D()) && m25319D().enabled;
    }

    /* JADX INFO: renamed from: u2 */
    public static boolean m25523u2() {
        ((Boolean) lra0.n0.get()).booleanValue();
        return false;
    }

    /* JADX INFO: renamed from: u3 */
    public static boolean m25524u3() {
        return m25529v3() || m25534w3();
    }

    /* JADX INFO: renamed from: v */
    public static int m25525v() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.chat_guide_second_close_freezing_time;
            }
            return 10;
        } catch (Exception unused) {
            return 10;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static int m25526v0() {
        try {
            String strF = RemoteConfig.x().F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strF)) {
                return 3;
            }
            return new JSONObject(strF).optInt("count_limit");
        } catch (Exception unused) {
            return 3;
        }
    }

    /* JADX INFO: renamed from: v1 */
    public static boolean m25527v1() {
        return m25363L3() && RemoteConfig.x().s("boot_up_suggest_merge_flag");
    }

    /* JADX INFO: renamed from: v2 */
    public static boolean m25528v2() {
        return TextUtils.equals(ABManager.m1254h0("popup_unshow"), "exp");
    }

    /* JADX INFO: renamed from: v3 */
    public static boolean m25529v3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM25519t3 = m25519t3();
        return NullChecker.a(pairedOnlineMessagesGuideConfigM25519t3) && pairedOnlineMessagesGuideConfigM25519t3.exp1;
    }

    /* JADX INFO: renamed from: w */
    public static int m25530w() {
        try {
            PushGuideConfig pushGuideConfig = (PushGuideConfig) RemoteConfig.x().v("push_open_guide_config", PushGuideConfig.JSON_ADAPTER);
            if (NullChecker.a(pushGuideConfig)) {
                return pushGuideConfig.dialog_guide_single_close_freezing_time;
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static int m25531w0() {
        try {
            String strF = RemoteConfig.x().F("match_guide_chat_emoji");
            if (TextUtils.isEmpty(strF)) {
                return 48;
            }
            return new JSONObject(strF).optInt("time_limit");
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static boolean m25532w1() {
        return !TEnum.equals(qib0.f19810h0, "mainland");
    }

    /* JADX INFO: renamed from: w2 */
    public static boolean m25533w2() {
        return m25538x2() || m25548z2();
    }

    /* JADX INFO: renamed from: w3 */
    public static boolean m25534w3() {
        PairedOnlineMessagesGuideConfig pairedOnlineMessagesGuideConfigM25519t3 = m25519t3();
        return NullChecker.a(pairedOnlineMessagesGuideConfigM25519t3) && pairedOnlineMessagesGuideConfigM25519t3.exp2;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m25535x() {
        if (NullChecker.a(CoreModule.f1534c.f3628e0.f18965d4) && ((Boolean) CoreModule.f1534c.f3628e0.f18965d4.get()).booleanValue()) {
            return true;
        }
        return RemoteConfig.x().s("see_toast_cache_enable");
    }

    /* JADX INFO: renamed from: x0 */
    public static List<String> m25536x0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("最近在听什么好听的歌吗？求推荐");
        arrayList.add("不工作的时候都喜欢干点儿什么呀？");
        arrayList.add("你的家乡有什么好吃的吗？");
        ArrayList arrayList2 = new ArrayList();
        try {
            String strF = RemoteConfig.x().F("match_guide_chat_emoji");
            if (!TextUtils.isEmpty(strF)) {
                JSONArray jSONArrayOptJSONArray = new JSONObject(strF).optJSONArray("ice_breaking");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList2.add(jSONArrayOptJSONArray.optString(i));
                    }
                }
                return vwb.J(arrayList2) ? arrayList : arrayList2;
            }
        } catch (Exception unused) {
        }
        return vwb.J(arrayList2) ? arrayList : arrayList2;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m25537x1() {
        return TextUtils.equals(ABManager.m1256i0("card_live_video"), "exp");
    }

    /* JADX INFO: renamed from: x2 */
    public static boolean m25538x2() {
        return ("exp".equals(ABManager.m1256i0("photo_equality")) || RemoteConfig.x().s("photo_equality_enable")) && m25363L3() && !Media.isVideo(((Media) CoreModule.f1534c.f3628e0.m21483na().pictures.get(0)).mediaType);
    }

    /* JADX INFO: renamed from: x3 */
    public static boolean m25539x3() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m25540y() {
        return m25373N3();
    }

    /* JADX INFO: renamed from: y0 */
    public static MessageFilterConfig m25541y0() {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public static boolean m25542y1() {
        CardOptRemote cardOptRemoteM25339H = m25339H();
        if (NullChecker.a(cardOptRemoteM25339H)) {
            return cardOptRemoteM25339H.card_resolution_opt;
        }
        return false;
    }

    /* JADX INFO: renamed from: y2 */
    public static boolean m25543y2() {
        return RemoteConfig.x().s("photo_equality_enable");
    }

    /* JADX INFO: renamed from: y3 */
    public static boolean m25544y3() {
        return "with_topic_rec".equals(ABManager.m1256i0("chat_topic"));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m25545z() {
        return m25363L3() && RemoteConfig.x().s("exp_new_ui");
    }

    /* JADX INFO: renamed from: z0 */
    public static int m25546z0() {
        try {
            String strF = RemoteConfig.x().F("conversation_exposure_sort");
            if (TextUtils.isEmpty(strF)) {
                return 0;
            }
            return new JSONObject(strF).optInt("frequency_limit");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static boolean m25547z1() {
        return false;
    }

    /* JADX INFO: renamed from: z2 */
    public static boolean m25548z2() {
        RealPicturesConfig realPicturesConfigM25407W0 = m25407W0();
        return realPicturesConfigM25407W0 != null && realPicturesConfigM25407W0.enable && m25363L3() && !Media.isVideo(((Media) CoreModule.f1534c.f3628e0.m21483na().pictures.get(0)).mediaType);
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m25549z3() {
        return TextUtils.equals(ABManager.m1256i0("card_greet_shourtcut"), "exp");
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: a */
    public final void mo1299a() {
        if (m25408W1()) {
            lip0.m18785i().m18795q();
        }
    }

    @Override // com.p000p1.mobile.putong.api.ABManager.InterfaceC0104d
    /* JADX INFO: renamed from: b */
    public final void mo1300b() {
    }
}
