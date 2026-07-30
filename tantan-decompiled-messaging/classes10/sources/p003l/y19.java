package p003l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.AiPictureConfig;
import com.p000p1.mobile.putong.core.data.ChatInviteToVerifyConfig;
import com.p000p1.mobile.putong.core.data.ChatPhotoInteraction;
import com.p000p1.mobile.putong.core.data.CityCentreConfig;
import com.p000p1.mobile.putong.core.data.Content;
import com.p000p1.mobile.putong.core.data.GreetGuideData;
import com.p000p1.mobile.putong.core.data.IceBreakDlgConfig;
import com.p000p1.mobile.putong.core.data.LoveLetterConfig;
import com.p000p1.mobile.putong.core.data.MessageBreakIce;
import com.p000p1.mobile.putong.core.data.MessageIntegrationItem;
import com.p000p1.mobile.putong.core.data.MessageRedesignBreakIceGuide;
import com.p000p1.mobile.putong.core.data.MsgIcebreakConfig;
import com.p000p1.mobile.putong.core.data.MsgIcebreakConfigV2;
import com.p000p1.mobile.putong.core.data.OptimizeRecommendStickerConfig;
import com.p000p1.mobile.putong.core.data.PrologueConfig;
import com.p000p1.mobile.putong.core.data.SpryEmojiArgsConfig;
import com.p000p1.mobile.putong.core.message.inner.data.MsgIcebreakType;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.ura;
import l.vwb;
import l.zbc0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class y19 {
    /* JADX INFO: renamed from: A */
    public static int m11077A() {
        PrologueConfig prologueConfigM11099W = m11099W();
        if (prologueConfigM11099W != null) {
            return prologueConfigM11099W.enter_conv_limit;
        }
        return 1;
    }

    /* JADX INFO: renamed from: B */
    public static int m11078B(boolean z) {
        PrologueConfig prologueConfigM11099W = m11099W();
        if (prologueConfigM11099W != null) {
            return z ? prologueConfigM11099W.unreply_daily_show_count : prologueConfigM11099W.untalked_daily_show_count;
        }
        return 3;
    }

    /* JADX INFO: renamed from: C */
    public static String m11079C() {
        return "同意配对可无限聊天（当前最多发送20条消息）";
    }

    /* JADX INFO: renamed from: D */
    public static List<String> m11080D() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: E */
    public static int m11081E() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.x().v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.maxNum;
            }
            return 10;
        } catch (Exception unused) {
            return 10;
        }
    }

    /* JADX INFO: renamed from: F */
    public static int m11082F() {
        try {
            IceBreakDlgConfig iceBreakDlgConfig = (IceBreakDlgConfig) RemoteConfig.x().v("ice_break_dlg_config", IceBreakDlgConfig.JSON_ADAPTER);
            if (NullChecker.a(iceBreakDlgConfig)) {
                return iceBreakDlgConfig.timeInterval;
            }
            return 48;
        } catch (Exception unused) {
            return 48;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m11083G() {
        MsgIcebreakConfig msgIcebreakConfigM11121t = m11121t();
        if (NullChecker.a(msgIcebreakConfigM11121t) && msgIcebreakConfigM11121t.enable) {
            return true;
        }
        return TextUtils.equals(ABManager.i0("sticker_show_time"), "exp");
    }

    /* JADX INFO: renamed from: H */
    public static boolean m11084H() {
        return CoreModule.P().a().De();
    }

    /* JADX INFO: renamed from: I */
    public static boolean m11085I() {
        return CoreModule.P().i().o();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m11086J() {
        PrologueConfig prologueConfigM11099W = m11099W();
        if (prologueConfigM11099W != null) {
            return prologueConfigM11099W.enable;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static boolean m11087K() {
        return TextUtils.equals(ABManager.i0("fake_to_good"), "exp") && TextUtils.equals(RemoteConfig.x().F("register_channel"), "natural");
    }

    /* JADX INFO: renamed from: L */
    public static boolean m11088L() {
        return TextUtils.equals(ABManager.i0("groupchat"), "realname_3") || TextUtils.equals(ABManager.i0("groupchat"), "anonymous_3");
    }

    /* JADX INFO: renamed from: M */
    public static boolean m11089M() {
        return TextUtils.equals(ABManager.i0("batch_icebreak"), "exp1") || TextUtils.equals(ABManager.i0("batch_icebreak"), "exp2");
    }

    /* JADX INFO: renamed from: N */
    public static boolean m11090N() {
        try {
            LoveLetterConfig loveLetterConfigM11119r = m11119r();
            return (loveLetterConfigM11119r != null ? loveLetterConfigM11119r.enable : false) || CoreModule.P().a().a5();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: O */
    public static boolean m11091O() {
        return TextUtils.equals(ABManager.i0("male_heartbeat_unactive"), "exp2");
    }

    /* JADX INFO: renamed from: P */
    public static boolean m11092P() {
        return CoreModule.P().a().uh();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m11093Q() {
        return TextUtils.equals(ABManager.i0("quick_message"), "exp");
    }

    /* JADX INFO: renamed from: R */
    public static boolean m11094R() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return NullChecker.a(messageRedesignBreakIceGuideM11120s) && messageRedesignBreakIceGuideM11120s.mainSwitch && messageRedesignBreakIceGuideM11120s.exchangeAnswerSwitch && !vwb.J(m11080D());
    }

    /* JADX INFO: renamed from: S */
    public static boolean m11095S() {
        try {
            ChatPhotoInteraction chatPhotoInteraction = (ChatPhotoInteraction) RemoteConfig.x().v("chat_photo_interaction", ChatPhotoInteraction.JSON_ADAPTER);
            if (NullChecker.a(chatPhotoInteraction)) {
                return chatPhotoInteraction.enable;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m11096T() {
        return TextUtils.equals(ABManager.i0("verified_to_chat"), "exp");
    }

    /* JADX INFO: renamed from: U */
    public static boolean m11097U() {
        return CoreModule.P().a().cn();
    }

    /* JADX INFO: renamed from: V */
    public static String m11098V() {
        try {
            String strF = RemoteConfig.x().F("chat_new_match_config");
            return !TextUtils.isEmpty(strF) ? new JSONObject(strF).optString(Content.TYPE, "切换下一个") : "切换下一个";
        } catch (Exception unused) {
            return "切换下一个";
        }
    }

    /* JADX INFO: renamed from: W */
    public static PrologueConfig m11099W() {
        return null;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m11100X() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return NullChecker.a(messageRedesignBreakIceGuideM11120s) && messageRedesignBreakIceGuideM11120s.mainSwitch && messageRedesignBreakIceGuideM11120s.integration.enable;
    }

    /* JADX INFO: renamed from: Y */
    public static SpryEmojiArgsConfig m11101Y() {
        try {
            SpryEmojiArgsConfig spryEmojiArgsConfig = (SpryEmojiArgsConfig) RemoteConfig.x().v("spry_emoji_args_config", SpryEmojiArgsConfig.JSON_ADAPTER);
            if (NullChecker.a(spryEmojiArgsConfig)) {
                return spryEmojiArgsConfig;
            }
        } catch (Exception unused) {
        }
        return SpryEmojiArgsConfig.new_();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11102a() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return NullChecker.a(messageRedesignBreakIceGuideM11120s) && messageRedesignBreakIceGuideM11120s.mainSwitch && messageRedesignBreakIceGuideM11120s.breakIceGuide.enable;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11103b() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        if (!NullChecker.a(messageRedesignBreakIceGuideM11120s) || !messageRedesignBreakIceGuideM11120s.mainSwitch || !messageRedesignBreakIceGuideM11120s.exchangeAnswerSwitch) {
            return false;
        }
        MessageBreakIce messageBreakIce = messageRedesignBreakIceGuideM11120s.breakIceGuide;
        return messageBreakIce.enable && messageBreakIce.exchangeAnswerEnable && !vwb.J(m11080D());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11104c() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return NullChecker.a(messageRedesignBreakIceGuideM11120s) && messageRedesignBreakIceGuideM11120s.mainSwitch;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11105d() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return NullChecker.a(messageRedesignBreakIceGuideM11120s) && messageRedesignBreakIceGuideM11120s.mainSwitch && messageRedesignBreakIceGuideM11120s.directlyToPicLikeDialog;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11106e() {
        return ura.e().d().iq();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11107f() {
        return TextUtils.equals(ABManager.i0("friend_active_remind_female"), "exp");
    }

    /* JADX INFO: renamed from: g */
    public static AiPictureConfig m11108g() {
        AiPictureConfig aiPictureConfig;
        try {
            aiPictureConfig = (AiPictureConfig) RemoteConfig.x().v("ai_picture_config", AiPictureConfig.JSON_ADAPTER);
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
    public static ChatInviteToVerifyConfig m11109h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static CityCentreConfig m11110i() {
        try {
            return (CityCentreConfig) RemoteConfig.x().v("city_c_config", CityCentreConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m11111j(boolean z) {
        String str;
        String str2 = "";
        try {
            GreetGuideData greetGuideData = (GreetGuideData) RemoteConfig.x().v("moment_greeting_say_hi", GreetGuideData.JSON_ADAPTER);
            User userNa = CoreModule.c.e0.na();
            if (NullChecker.a(userNa) && NullChecker.a(greetGuideData) && !greetGuideData.male.isEmpty() && !greetGuideData.female.isEmpty()) {
                if (userNa.isFemale()) {
                    List<String> list = greetGuideData.female;
                    str = list.get(zbc0.b(list.size()));
                } else {
                    List<String> list2 = greetGuideData.male;
                    str = list2.get(zbc0.b(list2.size()));
                }
                str2 = str;
            }
            return str2.replace("{{gender}}", z ? "她" : "他");
        } catch (RemoteConfigException e) {
            CrashHelper.c(e);
            return str2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static MsgIcebreakType m11112k() {
        MsgIcebreakConfig msgIcebreakConfigM11121t = m11121t();
        if (NullChecker.a(msgIcebreakConfigM11121t) && msgIcebreakConfigM11121t.enable) {
            String str = CoreModule.c.e0.na().isFemale() ? msgIcebreakConfigM11121t.femaleType : msgIcebreakConfigM11121t.maleType;
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
    public static List<MessageIntegrationItem> m11113l() {
        MessageRedesignBreakIceGuide messageRedesignBreakIceGuideM11120s = m11120s();
        return (NullChecker.a(messageRedesignBreakIceGuideM11120s) && NullChecker.a(messageRedesignBreakIceGuideM11120s.integration)) ? messageRedesignBreakIceGuideM11120s.integration.items : new ArrayList();
    }

    /* JADX INFO: renamed from: m */
    public static int m11114m() {
        LoveLetterConfig loveLetterConfigM11119r = m11119r();
        if (loveLetterConfigM11119r != null) {
            return loveLetterConfigM11119r.chat_guide_interval;
        }
        return 2;
    }

    /* JADX INFO: renamed from: n */
    public static int m11115n() {
        LoveLetterConfig loveLetterConfigM11119r = m11119r();
        if (loveLetterConfigM11119r != null) {
            return loveLetterConfigM11119r.chat_guide_trigger_mm;
        }
        return 5;
    }

    /* JADX INFO: renamed from: o */
    public static int m11116o() {
        LoveLetterConfig loveLetterConfigM11119r = m11119r();
        if (loveLetterConfigM11119r != null) {
            return loveLetterConfigM11119r.chat_guide_trigger_message_count;
        }
        return 2;
    }

    /* JADX INFO: renamed from: p */
    public static int m11117p() {
        LoveLetterConfig loveLetterConfigM11119r = m11119r();
        if (loveLetterConfigM11119r != null) {
            return loveLetterConfigM11119r.chat_guide_trigger_time_no_response;
        }
        return 2;
    }

    /* JADX INFO: renamed from: q */
    public static int m11118q() {
        LoveLetterConfig loveLetterConfigM11119r = m11119r();
        if (loveLetterConfigM11119r != null) {
            return loveLetterConfigM11119r.chat_guide_trigger_time_window;
        }
        return 48;
    }

    /* JADX INFO: renamed from: r */
    public static LoveLetterConfig m11119r() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static MessageRedesignBreakIceGuide m11120s() {
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public static MsgIcebreakConfig m11121t() {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static MsgIcebreakConfigV2 m11122u() {
        MsgIcebreakConfigV2 msgIcebreakConfigV2;
        try {
            msgIcebreakConfigV2 = (MsgIcebreakConfigV2) RemoteConfig.x().v("msg_ice_break_config_v2", MsgIcebreakConfigV2.JSON_ADAPTER);
        } catch (Exception unused) {
            msgIcebreakConfigV2 = null;
        }
        if (NullChecker.a(msgIcebreakConfigV2)) {
            return msgIcebreakConfigV2;
        }
        MsgIcebreakConfigV2 msgIcebreakConfigV2New_ = MsgIcebreakConfigV2.new_();
        msgIcebreakConfigV2New_.enable = false;
        return msgIcebreakConfigV2New_;
    }

    /* JADX INFO: renamed from: v */
    public static OptimizeRecommendStickerConfig m11123v() {
        try {
            OptimizeRecommendStickerConfig optimizeRecommendStickerConfig = (OptimizeRecommendStickerConfig) RemoteConfig.x().v("optimize_recommend_sticker_config", OptimizeRecommendStickerConfig.JSON_ADAPTER);
            if (NullChecker.a(optimizeRecommendStickerConfig)) {
                return optimizeRecommendStickerConfig;
            }
        } catch (Exception unused) {
        }
        return OptimizeRecommendStickerConfig.new_();
    }

    /* JADX INFO: renamed from: w */
    public static int m11124w() {
        return RemoteConfig.x().z("vas_platinum_top_message_guide_max_show_per_conv", 2);
    }

    /* JADX INFO: renamed from: x */
    public static int m11125x() {
        return RemoteConfig.x().z("vas_platinum_top_message_guide_max_show", 20);
    }

    /* JADX INFO: renamed from: y */
    public static long m11126y() {
        return RemoteConfig.x().B("intl_premuim_match_tag_show_start_time", 1723564800000L);
    }

    /* JADX INFO: renamed from: z */
    public static int m11127z(boolean z) {
        PrologueConfig prologueConfigM11099W = m11099W();
        if (prologueConfigM11099W != null) {
            return z ? prologueConfigM11099W.unreply_show_days_count : prologueConfigM11099W.untalked_show_days_count;
        }
        return 3;
    }
}
