package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AiPictureConfig;
import com.p046p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p046p1.mobile.putong.core.data.ChatPhotoInteraction;
import com.p046p1.mobile.putong.core.data.CityCentreConfig;
import com.p046p1.mobile.putong.core.data.GreetGuideData;
import com.p046p1.mobile.putong.core.data.IceBreakDlgConfig;
import com.p046p1.mobile.putong.core.data.LoveLetterConfig;
import com.p046p1.mobile.putong.core.data.MessageBreakIce;
import com.p046p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p046p1.mobile.putong.core.data.MessageRedesignBreakIceGuide;
import com.p046p1.mobile.putong.core.data.MsgIcebreakConfig;
import com.p046p1.mobile.putong.core.data.MsgIcebreakConfigV2;
import com.p046p1.mobile.putong.core.data.OptimizeRecommendStickerConfig;
import com.p046p1.mobile.putong.core.data.PrologueConfig;
import com.p046p1.mobile.putong.core.data.SpryEmojiArgsConfig;
import com.p046p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class y19 {
    /* JADX INFO: renamed from: A */
    public static int m212141A() {
        PrologueConfig prologueConfigM212163W = m212163W();
        if (prologueConfigM212163W != null) {
            return prologueConfigM212163W.enter_conv_limit;
        }
        return 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m212142B(boolean z) {
        PrologueConfig prologueConfigM212163W = m212163W();
        if (prologueConfigM212163W != null) {
            return z ? prologueConfigM212163W.unreply_daily_show_count : prologueConfigM212163W.untalked_daily_show_count;
        }
        return 3;
    }

    /* JADX INFO: renamed from: C */
    public static String m212143C() {
        return "同意配对可无限聊天（当前最多发送20条消息）";
    }

    /* JADX INFO: renamed from: D */
    public static List<String> m212144D() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public static int m212145E() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.m79298x().m79333v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.maxNum;
            }
            return 10;
        } catch (Exception unused) {
            return 10;
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m212146F() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.m79298x().m79333v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.timeInterval;
            }
            return 48;
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m212147G() {
        MsgIcebreakConfig msgIcebreakConfigM212185t = m212185t();
        if (NullChecker.m81303a(msgIcebreakConfigM212185t) && msgIcebreakConfigM212185t.enable) {
            return true;
        }
        return TextUtils.equals(ABManager.m29350i0("sticker_show_time"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m212148H() {
        return CoreModule.m29935P().m94651a().mo33304De();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m212149I() {
        return CoreModule.m29935P().m94658i().mo158418o();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m212150J() {
        PrologueConfig prologueConfigM212163W = m212163W();
        if (prologueConfigM212163W != null) {
            return prologueConfigM212163W.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m212151K() {
        return TextUtils.equals(ABManager.m29350i0("fake_to_good"), AuthenticationTokenClaims.JSON_KEY_EXP) && TextUtils.equals(RemoteConfig.m79298x().m79302F("register_channel"), "natural");
    }

    /* JADX INFO: renamed from: L */
    public static boolean m212152L() {
        return TextUtils.equals(ABManager.m29350i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m29350i0("groupchat"), "anonymous_3");
    }

    /* JADX INFO: renamed from: M */
    public static boolean m212153M() {
        return TextUtils.equals(ABManager.m29350i0("batch_icebreak"), "exp1") || TextUtils.equals(ABManager.m29350i0("batch_icebreak"), "exp2");
    }

    /* JADX INFO: renamed from: N */
    public static boolean m212154N() {
        try {
            LoveLetterConfig loveLetterConfigM212183r = m212183r();
            return (loveLetterConfigM212183r != null ? loveLetterConfigM212183r.enable : false) || CoreModule.m29935P().m94651a().mo158347a5();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m212155O() {
        return TextUtils.equals(ABManager.m29350i0("male_heartbeat_unactive"), "exp2");
    }

    /* JADX INFO: renamed from: P */
    public static boolean m212156P() {
        return CoreModule.m29935P().m94651a().mo33602uh();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m212157Q() {
        return TextUtils.equals(ABManager.m29350i0("quick_message"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m212158R() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && messageRedesignBreakIceGuideM212184s.mainSwitch && messageRedesignBreakIceGuideM212184s.exchangeAnswerSwitch && !vwb.m200296J(m212144D());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m212159S() {
        try {
            ChatPhotoInteraction chatPhotoInteraction = (ChatPhotoInteraction) RemoteConfig.m79298x().m79333v("chat_photo_interaction", ChatPhotoInteraction.JSON_ADAPTER);
            if (NullChecker.m81303a(chatPhotoInteraction)) {
                return chatPhotoInteraction.enable;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m212160T() {
        return TextUtils.equals(ABManager.m29350i0("verified_to_chat"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m212161U() {
        return CoreModule.m29935P().m94651a().mo33479cn();
    }

    /* JADX INFO: renamed from: V */
    public static String m212162V() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("chat_new_match_config");
            return !TextUtils.isEmpty(strM79302F) ? new JSONObject(strM79302F).optString("content", "切换下一个") : "切换下一个";
        } catch (Exception unused) {
            return "切换下一个";
        }
    }

    /* JADX INFO: renamed from: W */
    public static PrologueConfig m212163W() {
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m212164X() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && messageRedesignBreakIceGuideM212184s.mainSwitch && messageRedesignBreakIceGuideM212184s.integration.enable;
    }

    /* JADX INFO: renamed from: Y */
    public static SpryEmojiArgsConfig m212165Y() {
        try {
            SpryEmojiArgsConfig spryEmojiArgsConfig = (SpryEmojiArgsConfig) RemoteConfig.m79298x().m79333v("spry_emoji_args_config", SpryEmojiArgsConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(spryEmojiArgsConfig)) {
                return spryEmojiArgsConfig;
            }
        } catch (Exception unused) {
        }
        return SpryEmojiArgsConfig.new_();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m212166a() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && messageRedesignBreakIceGuideM212184s.mainSwitch && messageRedesignBreakIceGuideM212184s.breakIceGuide.enable;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m212167b() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        if (!NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) || !messageRedesignBreakIceGuideM212184s.mainSwitch || !messageRedesignBreakIceGuideM212184s.exchangeAnswerSwitch) {
            return false;
        }
        MessageBreakIce messageBreakIce = messageRedesignBreakIceGuideM212184s.breakIceGuide;
        return messageBreakIce.enable && messageBreakIce.exchangeAnswerEnable && !vwb.m200296J(m212144D());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m212168c() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && messageRedesignBreakIceGuideM212184s.mainSwitch;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m212169d() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && messageRedesignBreakIceGuideM212184s.mainSwitch && messageRedesignBreakIceGuideM212184s.directlyToPicLikeDialog;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m212170e() {
        return ura.m195053e().m195057d().mo33853iq();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m212171f() {
        return TextUtils.equals(ABManager.m29350i0("friend_active_remind_female"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: g */
    public static AiPictureConfig m212172g() {
        AiPictureConfig aiPictureConfig;
        try {
            aiPictureConfig = (AiPictureConfig) RemoteConfig.m79298x().m79333v("ai_picture_config", AiPictureConfig.JSON_ADAPTER);
        } catch (RemoteConfigException unused) {
            aiPictureConfig = null;
        }
        if (aiPictureConfig != null) {
            return aiPictureConfig;
        }
        AiPictureConfig aiPictureConfigNew_ = AiPictureConfig.new_();
        aiPictureConfigNew_.exp = false;
        aiPictureConfigNew_.timeout = 7;
        aiPictureConfigNew_.quick_access_limit = 5;
        return aiPictureConfigNew_;
    }

    /* JADX INFO: renamed from: h */
    public static ChatInviteToVerifyConfig m212173h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static CityCentreConfig m212174i() {
        try {
            return (CityCentreConfig) RemoteConfig.m79298x().m79333v("city_c_config", CityCentreConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m212175j(boolean z) {
        String str;
        String str2 = "";
        try {
            GreetGuideData greetGuideData = (GreetGuideData) RemoteConfig.m79298x().m79333v("moment_greeting_say_hi", GreetGuideData.JSON_ADAPTER);
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            if (NullChecker.m81303a(userM169520na) && NullChecker.m81303a(greetGuideData) && !greetGuideData.male.isEmpty() && !greetGuideData.female.isEmpty()) {
                if (userM169520na.isFemale()) {
                    List<String> list = greetGuideData.female;
                    str = list.get(zbc0.m217836b(list.size()));
                } else {
                    List<String> list2 = greetGuideData.male;
                    str = list2.get(zbc0.m217836b(list2.size()));
                }
                str2 = str;
            }
            return str2.replace("{{gender}}", z ? "她" : "他");
        } catch (RemoteConfigException e) {
            CrashHelper.m81296c(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static MsgIcebreakType m212176k() {
        MsgIcebreakConfig msgIcebreakConfigM212185t = m212185t();
        if (NullChecker.m81303a(msgIcebreakConfigM212185t) && msgIcebreakConfigM212185t.enable) {
            String str = CoreModule.f17545c.f19639e0.m169520na().isFemale() ? msgIcebreakConfigM212185t.femaleType : msgIcebreakConfigM212185t.maleType;
            MsgIcebreakType msgIcebreakType = MsgIcebreakType.ALL;
            if (TextUtils.equals(str, msgIcebreakType.getValue())) {
                return msgIcebreakType;
            }
            MsgIcebreakType msgIcebreakType2 = MsgIcebreakType.NONE;
            if (TextUtils.equals(str, msgIcebreakType2.getValue())) {
                return msgIcebreakType2;
            }
            MsgIcebreakType msgIcebreakType3 = MsgIcebreakType.TEXT_BREAK;
            if (TextUtils.equals(str, msgIcebreakType3.getValue())) {
                return msgIcebreakType3;
            }
            MsgIcebreakType msgIcebreakType4 = MsgIcebreakType.STICKER_BREAK;
            if (TextUtils.equals(str, msgIcebreakType4.getValue())) {
                return msgIcebreakType4;
            }
        }
        return MsgIcebreakType.ALL;
    }

    /* JADX INFO: renamed from: l */
    public static List<MessageIntegrationItem> m212177l() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM212184s = m212184s();
        return (NullChecker.m81303a(messageRedesignBreakIceGuideM212184s) && NullChecker.m81303a(messageRedesignBreakIceGuideM212184s.integration)) ? messageRedesignBreakIceGuideM212184s.integration.items : new ArrayList();
    }

    /* JADX INFO: renamed from: m */
    public static int m212178m() {
        LoveLetterConfig loveLetterConfigM212183r = m212183r();
        if (loveLetterConfigM212183r != null) {
            return loveLetterConfigM212183r.chat_guide_interval;
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public static int m212179n() {
        LoveLetterConfig loveLetterConfigM212183r = m212183r();
        if (loveLetterConfigM212183r != null) {
            return loveLetterConfigM212183r.chat_guide_trigger_mm;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public static int m212180o() {
        LoveLetterConfig loveLetterConfigM212183r = m212183r();
        if (loveLetterConfigM212183r != null) {
            return loveLetterConfigM212183r.chat_guide_trigger_message_count;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public static int m212181p() {
        LoveLetterConfig loveLetterConfigM212183r = m212183r();
        if (loveLetterConfigM212183r != null) {
            return loveLetterConfigM212183r.chat_guide_trigger_time_no_response;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public static int m212182q() {
        LoveLetterConfig loveLetterConfigM212183r = m212183r();
        if (loveLetterConfigM212183r != null) {
            return loveLetterConfigM212183r.chat_guide_trigger_time_window;
        }
        return 48;
    }

    /* JADX INFO: renamed from: r */
    public static LoveLetterConfig m212183r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static MessageRedesignBreakIceGuide m212184s() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static MsgIcebreakConfig m212185t() {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static MsgIcebreakConfigV2 m212186u() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2;
        try {
            msgIcebreakConfigV2 = (MsgIcebreakConfigV2) RemoteConfig.m79298x().m79333v("msg_ice_break_config_v2", MsgIcebreakConfigV2.JSON_ADAPTER);
        } catch (Exception unused) {
            msgIcebreakConfigV2 = null;
        }
        if (NullChecker.m81303a(msgIcebreakConfigV2)) {
            return msgIcebreakConfigV2;
        }
        MsgIcebreakConfigV2 msgIcebreakConfigV2New_ = MsgIcebreakConfigV2.new_();
        msgIcebreakConfigV2New_.enable = false;
        return msgIcebreakConfigV2New_;
    }

    /* JADX INFO: renamed from: v */
    public static OptimizeRecommendStickerConfig m212187v() {
        try {
            OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = (OptimizeRecommendStickerConfig) RemoteConfig.m79298x().m79333v("optimize_recommend_sticker_config", OptimizeRecommendStickerConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(optimizeRecommendStickerConfig)) {
                return optimizeRecommendStickerConfig;
            }
        } catch (Exception unused) {
        }
        return OptimizeRecommendStickerConfig.new_();
    }

    /* JADX INFO: renamed from: w */
    public static int m212188w() {
        return RemoteConfig.m79298x().m79336z("vas_platinum_top_message_guide_max_show_per_conv", 2);
    }

    /* JADX INFO: renamed from: x */
    public static int m212189x() {
        return RemoteConfig.m79298x().m79336z("vas_platinum_top_message_guide_max_show", 20);
    }

    /* JADX INFO: renamed from: y */
    public static long m212190y() {
        return RemoteConfig.m79298x().m79300B("intl_premuim_match_tag_show_start_time", 1723564800000L);
    }

    /* JADX INFO: renamed from: z */
    public static int m212191z(boolean z) {
        PrologueConfig prologueConfigM212163W = m212163W();
        if (prologueConfigM212163W != null) {
            return z ? prologueConfigM212163W.unreply_show_days_count : prologueConfigM212163W.untalked_show_days_count;
        }
        return 3;
    }
}
