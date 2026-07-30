package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AiPictureConfig;
import com.p051p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p051p1.mobile.putong.core.data.ChatPhotoInteraction;
import com.p051p1.mobile.putong.core.data.CityCentreConfig;
import com.p051p1.mobile.putong.core.data.GreetGuideData;
import com.p051p1.mobile.putong.core.data.IceBreakDlgConfig;
import com.p051p1.mobile.putong.core.data.LoveLetterConfig;
import com.p051p1.mobile.putong.core.data.MessageBreakIce;
import com.p051p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p051p1.mobile.putong.core.data.MessageRedesignBreakIceGuide;
import com.p051p1.mobile.putong.core.data.MsgIcebreakConfig;
import com.p051p1.mobile.putong.core.data.MsgIcebreakConfigV2;
import com.p051p1.mobile.putong.core.data.OptimizeRecommendStickerConfig;
import com.p051p1.mobile.putong.core.data.PrologueConfig;
import com.p051p1.mobile.putong.core.data.SpryEmojiArgsConfig;
import com.p051p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class h39 {
    /* JADX INFO: renamed from: A */
    public static int m133412A() {
        PrologueConfig prologueConfigM133434W = m133434W();
        if (prologueConfigM133434W != null) {
            return prologueConfigM133434W.enter_conv_limit;
        }
        return 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m133413B(boolean z) {
        PrologueConfig prologueConfigM133434W = m133434W();
        if (prologueConfigM133434W != null) {
            return z ? prologueConfigM133434W.unreply_daily_show_count : prologueConfigM133434W.untalked_daily_show_count;
        }
        return 3;
    }

    /* JADX INFO: renamed from: C */
    public static String m133414C() {
        return "同意配对可无限聊天（当前最多发送20条消息）";
    }

    /* JADX INFO: renamed from: D */
    public static List<String> m133415D() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public static int m133416E() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.m80481x().m80516v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.maxNum;
            }
            return 10;
        } catch (Exception unused) {
            return 10;
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m133417F() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.m80481x().m80516v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.timeInterval;
            }
            return 48;
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m133418G() {
        MsgIcebreakConfig msgIcebreakConfigM133456t = m133456t();
        if (NullChecker.m82486a(msgIcebreakConfigM133456t) && msgIcebreakConfigM133456t.enable) {
            return true;
        }
        return TextUtils.equals(ABManager.m30348i0("sticker_show_time"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m133419H() {
        return CoreModule.m30933P().m143405a().mo34307De();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m133420I() {
        return CoreModule.m30933P().m143412i().mo180510o();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m133421J() {
        PrologueConfig prologueConfigM133434W = m133434W();
        if (prologueConfigM133434W != null) {
            return prologueConfigM133434W.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m133422K() {
        return TextUtils.equals(ABManager.m30348i0("fake_to_good"), AuthenticationTokenClaims.JSON_KEY_EXP) && TextUtils.equals(RemoteConfig.m80481x().m80485F("register_channel"), "natural");
    }

    /* JADX INFO: renamed from: L */
    public static boolean m133423L() {
        return TextUtils.equals(ABManager.m30348i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.m30348i0("groupchat"), "anonymous_3");
    }

    /* JADX INFO: renamed from: M */
    public static boolean m133424M() {
        return TextUtils.equals(ABManager.m30348i0("batch_icebreak"), "exp1") || TextUtils.equals(ABManager.m30348i0("batch_icebreak"), "exp2");
    }

    /* JADX INFO: renamed from: N */
    public static boolean m133425N() {
        try {
            LoveLetterConfig loveLetterConfigM133454r = m133454r();
            return (loveLetterConfigM133454r != null ? loveLetterConfigM133454r.enable : false) || CoreModule.m30933P().m143405a().mo180439a5();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m133426O() {
        return TextUtils.equals(ABManager.m30348i0("male_heartbeat_unactive"), "exp2");
    }

    /* JADX INFO: renamed from: P */
    public static boolean m133427P() {
        return CoreModule.m30933P().m143405a().mo34605uh();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m133428Q() {
        return TextUtils.equals(ABManager.m30348i0("quick_message"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m133429R() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && messageRedesignBreakIceGuideM133455s.mainSwitch && messageRedesignBreakIceGuideM133455s.exchangeAnswerSwitch && !jyb.m147479J(m133415D());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m133430S() {
        try {
            ChatPhotoInteraction chatPhotoInteraction = (ChatPhotoInteraction) RemoteConfig.m80481x().m80516v("chat_photo_interaction", ChatPhotoInteraction.JSON_ADAPTER);
            if (NullChecker.m82486a(chatPhotoInteraction)) {
                return chatPhotoInteraction.enable;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m133431T() {
        return TextUtils.equals(ABManager.m30348i0("verified_to_chat"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: U */
    public static boolean m133432U() {
        return CoreModule.m30933P().m143405a().mo34482cn();
    }

    /* JADX INFO: renamed from: V */
    public static String m133433V() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("chat_new_match_config");
            return !TextUtils.isEmpty(strM80485F) ? new JSONObject(strM80485F).optString("content", "切换下一个") : "切换下一个";
        } catch (Exception unused) {
            return "切换下一个";
        }
    }

    /* JADX INFO: renamed from: W */
    public static PrologueConfig m133434W() {
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m133435X() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && messageRedesignBreakIceGuideM133455s.mainSwitch && messageRedesignBreakIceGuideM133455s.integration.enable;
    }

    /* JADX INFO: renamed from: Y */
    public static SpryEmojiArgsConfig m133436Y() {
        try {
            SpryEmojiArgsConfig spryEmojiArgsConfig = (SpryEmojiArgsConfig) RemoteConfig.m80481x().m80516v("spry_emoji_args_config", SpryEmojiArgsConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(spryEmojiArgsConfig)) {
                return spryEmojiArgsConfig;
            }
        } catch (Exception unused) {
        }
        return SpryEmojiArgsConfig.new_();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m133437a() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && messageRedesignBreakIceGuideM133455s.mainSwitch && messageRedesignBreakIceGuideM133455s.breakIceGuide.enable;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m133438b() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        if (!NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) || !messageRedesignBreakIceGuideM133455s.mainSwitch || !messageRedesignBreakIceGuideM133455s.exchangeAnswerSwitch) {
            return false;
        }
        MessageBreakIce messageBreakIce = messageRedesignBreakIceGuideM133455s.breakIceGuide;
        return messageBreakIce.enable && messageBreakIce.exchangeAnswerEnable && !jyb.m147479J(m133415D());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m133439c() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && messageRedesignBreakIceGuideM133455s.mainSwitch;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m133440d() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && messageRedesignBreakIceGuideM133455s.mainSwitch && messageRedesignBreakIceGuideM133455s.directlyToPicLikeDialog;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m133441e() {
        return gta.m132210e().m132214d().mo34856iq();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m133442f() {
        return TextUtils.equals(ABManager.m30348i0("friend_active_remind_female"), AuthenticationTokenClaims.JSON_KEY_EXP);
    }

    /* JADX INFO: renamed from: g */
    public static AiPictureConfig m133443g() {
        AiPictureConfig aiPictureConfig;
        try {
            aiPictureConfig = (AiPictureConfig) RemoteConfig.m80481x().m80516v("ai_picture_config", AiPictureConfig.JSON_ADAPTER);
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
    public static ChatInviteToVerifyConfig m133444h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static CityCentreConfig m133445i() {
        try {
            return (CityCentreConfig) RemoteConfig.m80481x().m80516v("city_c_config", CityCentreConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m133446j(boolean z) {
        String str;
        String str2 = "";
        try {
            GreetGuideData greetGuideData = (GreetGuideData) RemoteConfig.m80481x().m80516v("moment_greeting_say_hi", GreetGuideData.JSON_ADAPTER);
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            if (NullChecker.m82486a(userM116593na) && NullChecker.m82486a(greetGuideData) && !greetGuideData.male.isEmpty() && !greetGuideData.female.isEmpty()) {
                if (userM116593na.isFemale()) {
                    List<String> list = greetGuideData.female;
                    str = list.get(gkc0.m130574b(list.size()));
                } else {
                    List<String> list2 = greetGuideData.male;
                    str = list2.get(gkc0.m130574b(list2.size()));
                }
                str2 = str;
            }
            return str2.replace("{{gender}}", z ? "她" : "他");
        } catch (RemoteConfigException e) {
            CrashHelper.m82479c(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static MsgIcebreakType m133447k() {
        MsgIcebreakConfig msgIcebreakConfigM133456t = m133456t();
        if (NullChecker.m82486a(msgIcebreakConfigM133456t) && msgIcebreakConfigM133456t.enable) {
            String str = CoreModule.f18264c.f20381e0.m116593na().isFemale() ? msgIcebreakConfigM133456t.femaleType : msgIcebreakConfigM133456t.maleType;
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
    public static List<MessageIntegrationItem> m133448l() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM133455s = m133455s();
        return (NullChecker.m82486a(messageRedesignBreakIceGuideM133455s) && NullChecker.m82486a(messageRedesignBreakIceGuideM133455s.integration)) ? messageRedesignBreakIceGuideM133455s.integration.items : new ArrayList();
    }

    /* JADX INFO: renamed from: m */
    public static int m133449m() {
        LoveLetterConfig loveLetterConfigM133454r = m133454r();
        if (loveLetterConfigM133454r != null) {
            return loveLetterConfigM133454r.chat_guide_interval;
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public static int m133450n() {
        LoveLetterConfig loveLetterConfigM133454r = m133454r();
        if (loveLetterConfigM133454r != null) {
            return loveLetterConfigM133454r.chat_guide_trigger_mm;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public static int m133451o() {
        LoveLetterConfig loveLetterConfigM133454r = m133454r();
        if (loveLetterConfigM133454r != null) {
            return loveLetterConfigM133454r.chat_guide_trigger_message_count;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public static int m133452p() {
        LoveLetterConfig loveLetterConfigM133454r = m133454r();
        if (loveLetterConfigM133454r != null) {
            return loveLetterConfigM133454r.chat_guide_trigger_time_no_response;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public static int m133453q() {
        LoveLetterConfig loveLetterConfigM133454r = m133454r();
        if (loveLetterConfigM133454r != null) {
            return loveLetterConfigM133454r.chat_guide_trigger_time_window;
        }
        return 48;
    }

    /* JADX INFO: renamed from: r */
    public static LoveLetterConfig m133454r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static MessageRedesignBreakIceGuide m133455s() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static MsgIcebreakConfig m133456t() {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static MsgIcebreakConfigV2 m133457u() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2;
        try {
            msgIcebreakConfigV2 = (MsgIcebreakConfigV2) RemoteConfig.m80481x().m80516v("msg_ice_break_config_v2", MsgIcebreakConfigV2.JSON_ADAPTER);
        } catch (Exception unused) {
            msgIcebreakConfigV2 = null;
        }
        if (NullChecker.m82486a(msgIcebreakConfigV2)) {
            return msgIcebreakConfigV2;
        }
        MsgIcebreakConfigV2 msgIcebreakConfigV2New_ = MsgIcebreakConfigV2.new_();
        msgIcebreakConfigV2New_.enable = false;
        return msgIcebreakConfigV2New_;
    }

    /* JADX INFO: renamed from: v */
    public static OptimizeRecommendStickerConfig m133458v() {
        try {
            OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = (OptimizeRecommendStickerConfig) RemoteConfig.m80481x().m80516v("optimize_recommend_sticker_config", OptimizeRecommendStickerConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(optimizeRecommendStickerConfig)) {
                return optimizeRecommendStickerConfig;
            }
        } catch (Exception unused) {
        }
        return OptimizeRecommendStickerConfig.new_();
    }

    /* JADX INFO: renamed from: w */
    public static int m133459w() {
        return RemoteConfig.m80481x().m80519z("vas_platinum_top_message_guide_max_show_per_conv", 2);
    }

    /* JADX INFO: renamed from: x */
    public static int m133460x() {
        return RemoteConfig.m80481x().m80519z("vas_platinum_top_message_guide_max_show", 20);
    }

    /* JADX INFO: renamed from: y */
    public static long m133461y() {
        return RemoteConfig.m80481x().m80483B("intl_premuim_match_tag_show_start_time", 1723564800000L);
    }

    /* JADX INFO: renamed from: z */
    public static int m133462z(boolean z) {
        PrologueConfig prologueConfigM133434W = m133434W();
        if (prologueConfigM133434W != null) {
            return z ? prologueConfigM133434W.unreply_show_days_count : prologueConfigM133434W.untalked_show_days_count;
        }
        return 3;
    }
}
