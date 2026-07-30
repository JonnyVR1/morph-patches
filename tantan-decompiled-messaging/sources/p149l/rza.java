package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationNotification;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.FigureMessageArg;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageChatHeat;
import com.p046p1.mobile.putong.core.data.MessageRedPacketNotificationStatus;
import com.p046p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageCallToBuy;
import com.p046p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import p147v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes6.dex */
public class rza extends zz6 {

    /* JADX INFO: renamed from: i */
    public static String[] f161615i = {"A", "B", b2s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f38728O, "P", "Q", "R", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "U", j6f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: j */
    public static final DecimalFormat f161616j = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: k */
    public static final int[] f161617k = {-13651766, -2515646, -148921, -3184206, -5978302, -296416, -8078862, -6777170};

    /* JADX INFO: renamed from: l.rza$a */
    public class C19816a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f161618a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f161619b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f161620c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f161621d;

        public C19816a(Act act, String str, String str2, int i) {
            this.f161618a = act;
            this.f161619b = str;
            this.f161620c = str2;
            this.f161621d = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Act act = this.f161618a;
            act.startActivity(WebViewAct.m80164Z1(act, this.f161619b, this.f161620c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            try {
                int i = this.f161621d;
                if (i != 0) {
                    textPaint.setColor(i);
                } else {
                    textPaint.setColor(this.f161618a.getResources().getColor(w0c0.f183772H1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.rza$b */
    public class C19817b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f161622a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f161623b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f161624c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f161625d;

        public C19817b(Activity activity, String str, String str2, int i) {
            this.f161622a = activity;
            this.f161623b = str;
            this.f161624c = str2;
            this.f161625d = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f161622a;
            AccountTempApi accountTempApi = qib0.f154697L;
            String str = this.f161623b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m79402J0(activity, str, this.f161624c) : WebViewAct.m80164Z1(activity, str, this.f161624c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f161622a.getResources().getColor(this.f161625d));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static SpannableStringBuilder m181721A0(Activity activity, String str, @ColorRes int i, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            String str3 = strArr[i2 + 1];
            if (str.indexOf(str2) > 0) {
                spannableStringBuilder.setSpan(new C19817b(activity, str2, str3, i), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: B0 */
    public static CharSequence m181722B0(Act act, int i, int i2, Figure figure) {
        int i3;
        float f;
        String strM133876p = figure.name;
        if (IntlCountryCodeController.m28110f()) {
            try {
                boolean zContains = figure.name.contains("km");
                String str = figure.name;
                if (zContains) {
                    f = Float.parseFloat(str.replace("km", "")) * 1000.0f;
                } else {
                    if (str.contains("m")) {
                        f = Float.parseFloat(figure.name.replace("m", ""));
                    } else {
                        i3 = -1;
                    }
                    if (i3 > -1) {
                        strM133876p = i0g0.m133876p(i3, false);
                    }
                }
                i3 = (int) f;
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
            if (i3 > -1) {
                strM133876p = i0g0.m133876p(i3, false);
            }
        }
        if (i2 != 0) {
            if (CoreModule.m29935P().m94651a().mo33374N8()) {
                if (i2 == 1) {
                    return i0g0.m133865f0(String.format(act.getString(R$string.f18232W5), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
                }
                String string = act.getString(R$string.f18202V5);
                String strM133840G = i0g0.m133840G(i2);
                return i0g0.m133865f0(String.format(string, strM133840G, strM133876p), vwb.m200324f0(strM133840G, strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            if (CoreModule.m29935P().m94651a().mo33491eg()) {
                if (i2 == 1) {
                    return i0g0.m133865f0(String.format(act.getString(R$string.f18292Y5), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
                }
                String string2 = act.getString(R$string.f18262X5);
                String strM133840G2 = i0g0.m133840G(i2);
                return i0g0.m133865f0(String.format(string2, strM133840G2, strM133876p), vwb.m200324f0(strM133840G2, strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            if (i2 == 1) {
                return i0g0.m133865f0(String.format(act.getString(R$string.f18353a6), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            String string3 = act.getString(R$string.f18322Z5);
            String strM133840G3 = i0g0.m133840G(i2);
            return i0g0.m133865f0(String.format(string3, strM133840G3, strM133876p), vwb.m200324f0(String.valueOf(strM133840G3), strM133876p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
        }
        if (CoreModule.m29935P().m94651a().mo33374N8()) {
            if (i == 1) {
                return i0g0.m133865f0(String.format(act.getString(R$string.f18052Q5), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            int i4 = figure.total;
            if (i == i4) {
                String string4 = act.getString(R$string.f17962N5);
                String strM133840G4 = i0g0.m133840G(i);
                return i0g0.m133865f0(String.format(string4, strM133840G4, strM133876p), vwb.m200324f0(strM133840G4, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            if (i > 1 && i4 == 1) {
                String string5 = act.getString(R$string.f17992O5);
                String strM133840G5 = i0g0.m133840G(i);
                return i0g0.m133865f0(String.format(string5, strM133840G5, strM133876p), vwb.m200324f0(strM133840G5, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            String string6 = act.getString(R$string.f18022P5);
            String strM133840G6 = i0g0.m133840G(i);
            String strM133840G7 = i0g0.m133840G(figure.total);
            return i0g0.m133865f0(String.format(string6, strM133840G6, strM133840G7, strM133876p), vwb.m200324f0(strM133840G6, strM133840G7, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (CoreModule.m29935P().m94651a().mo33491eg()) {
            if (i == 1) {
                return i0g0.m133865f0(String.format(act.getString(R$string.f18172U5), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            int i5 = figure.total;
            if (i == i5) {
                String string7 = act.getString(R$string.f18082R5);
                String strM133840G8 = i0g0.m133840G(i);
                return i0g0.m133865f0(String.format(string7, strM133840G8, strM133876p), vwb.m200324f0(strM133840G8, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            if (i > 1 && i5 == 1) {
                String string8 = act.getString(R$string.f18112S5);
                String strM133840G9 = i0g0.m133840G(i);
                return i0g0.m133865f0(String.format(string8, strM133840G9, strM133876p), vwb.m200324f0(strM133840G9, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            String string9 = act.getString(R$string.f18142T5);
            String strM133840G10 = i0g0.m133840G(i);
            String strM133840G11 = i0g0.m133840G(figure.total);
            return i0g0.m133865f0(String.format(string9, strM133840G10, strM133840G11, strM133876p), vwb.m200324f0(strM133840G10, strM133840G11, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (i == 1) {
            return i0g0.m133865f0(String.format(act.getString(R$string.f18476e6), strM133876p), vwb.m200324f0(strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        int i6 = figure.total;
        if (i == i6) {
            String string10 = act.getString(R$string.f18384b6);
            String strM133840G12 = i0g0.m133840G(i);
            return i0g0.m133865f0(String.format(string10, strM133840G12, strM133876p), vwb.m200324f0(strM133840G12, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (i > 1 && i6 == 1) {
            String string11 = act.getString(R$string.f18415c6);
            String strM133840G13 = i0g0.m133840G(i);
            return i0g0.m133865f0(String.format(string11, strM133840G13, strM133876p), vwb.m200324f0(strM133840G13, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        String string12 = act.getString(R$string.f18446d6);
        String strM133840G14 = i0g0.m133840G(i);
        String strM133840G15 = i0g0.m133840G(figure.total);
        return i0g0.m133865f0(String.format(string12, strM133840G14, strM133840G15, strM133876p), vwb.m200324f0(strM133840G14, strM133840G15, strM133876p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
    }

    /* JADX INFO: renamed from: C0 */
    public static CharSequence m181723C0(Figure figure) {
        String str;
        String strReplaceAll = figure.message.template.replaceAll("%@", "%s");
        ArrayList arrayListM200339n = vwb.m200339n(figure.message.args, new w9j() { // from class: l.qza
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("highlight".equals(((FigureMessageArg) obj).displayType));
            }
        });
        ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
        if (arrayListM200339n.size() == 1) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM200339n.get(0)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(0)).value);
        } else if (arrayListM200339n.size() == 2) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM200339n.get(0)).value, ((FigureMessageArg) arrayListM200339n.get(1)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(0)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(1)).value);
        } else if (arrayListM200339n.size() == 3) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM200339n.get(0)).value, ((FigureMessageArg) arrayListM200339n.get(1)).value, ((FigureMessageArg) arrayListM200339n.get(2)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(0)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(1)).value);
            arrayListM200324f0.add(((FigureMessageArg) arrayListM200339n.get(2)).value);
        } else {
            str = figure.message.template;
        }
        return arrayListM200324f0.size() == 0 ? m181735O0(str, Color.parseColor("#FE7E1D"), null) : i0g0.m133865f0(str, arrayListM200324f0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 1));
    }

    /* JADX INFO: renamed from: D0 */
    public static String m181724D0(Context context, User user) {
        if (user.location.isHideUpdateTime()) {
            return "";
        }
        if (!CoreModule.f17545c.f19561E0.m203800w3(user)) {
            if (CoreModule.f17545c.f19561E0.m203801x3(user)) {
                return "";
            }
            return u59.m191843n0(user) ? context.getString(R$string.f19039wk, mqi0.m155934I(System.currentTimeMillis(), true)) : mqi0.m155935J(user.location.updatedTime, true);
        }
        if (!user.isHideActiveFromSVip()) {
            return "";
        }
        String string = context.getString(R$string.f19039wk, mqi0.m155934I(uld0.m194219d(user), true));
        if (!user.isMe()) {
            return string;
        }
        return string + context.getString(R$string.f18657k3);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m181725E0(Conversation conversation, Message message) {
        if (conversation != null && !TextUtils.isEmpty(conversation.otherReadUntil)) {
            if (Long.parseLong(message.f56011id) <= Long.parseLong(conversation.otherReadUntil)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m181726F0(Message message, Conversation conversation) {
        if (NullChecker.m81303a(message) && NullChecker.m81303a(conversation) && conversation.unreadMessages <= 0 && NullChecker.m81303a(conversation.additional)) {
            NullChecker.m81303a(conversation.additional.localMomentInfo);
        }
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m181727G0() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m81303a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public static CharSequence m181728H0(Message message) {
        return m181729I0(message, null);
    }

    /* JADX WARN: Code duplicated, block: B:242:0x053e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v132 */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v136 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX INFO: renamed from: I0 */
    public static CharSequence m181729I0(Message message, Conversation conversation) throws IOException {
        CharSequence charSequenceM220997n0;
        String str;
        ?? Equals;
        int iM31815J6;
        if (message == null) {
            return "";
        }
        if (TEnum.equals(message.messageType, MessageType.hide_for_fake_user)) {
            return !y19.m212151K() ? CoreModule.f17544b.getResources().getString(R$string.f18955tq) : "对方发来一条消息";
        }
        MessageChatHeat messageChatHeat = null;
        MessageCallToBuy messageCallToBuy = null;
        long j = 0;
        if (TEnum.equals(message.messageType, MessageType.exclusive_chat_invite)) {
            try {
                messageChatHeat = MessageChatHeat.JSON_ADAPTER.parse(message.msgData);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            if (!NullChecker.m81303a(messageChatHeat)) {
                return "1v1专属聊天邀请";
            }
            if (mqi0.m155944o() > ((long) messageChatHeat.exclusiveChatInviteExpireTime) && ((long) messageChatHeat.exclusiveChatStartTime) <= 0) {
                return "未及时接受，专属聊天邀请已失效";
            }
            if (mqi0.m155944o() <= ((long) messageChatHeat.exclusiveChatInviteTime) || mqi0.m155944o() >= ((long) messageChatHeat.exclusiveChatInviteExpireTime) || ((long) messageChatHeat.exclusiveChatStartTime) > 0) {
                return "1v1专属聊天邀请";
            }
            return "1v1专属聊天邀请 " + RunnableC4733c0.m31502l(((long) messageChatHeat.exclusiveChatInviteExpireTime) - mqi0.m155944o());
        }
        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
            return nlm0.m160068a(message, conversation);
        }
        if ((TEnum.equals(message.messageType(), MessageType.common_tip) || TEnum.equals(message.messageType(), MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.local_intl_prompt_message_type)) && !TextUtils.isEmpty(message.value)) {
            Spanned spannedFromHtml = Html.fromHtml(message.value);
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    return i0g0.m133861b0(spannedFromHtml.toString(), vwb.m200324f0(strArrSplit2[0]), -98787, eqh0.m117752c(2));
                }
            }
            return spannedFromHtml;
        }
        if (TEnum.equals(message.messageType, MessageType.conversation_notification)) {
            if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.conversationNotification)) {
                ConversationNotification conversationNotification = message.additionalData.conversationNotification;
                if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM31815J6 = CoreModule.f17545c.f19645g0.m31815J6(conversationNotification.localeKey)) > 0) {
                    try {
                        return !vwb.m200296J(conversationNotification.params) ? CoreModule.f17544b.getString(iM31815J6, conversationNotification.params.toArray()) : CoreModule.f17544b.getString(iM31815J6);
                    } catch (Exception e2) {
                        CrashHelper.m81296c(e2);
                    }
                }
            }
            return message.value;
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet)) {
            String string = CoreModule.f17544b.getResources().getString(R$string.f18900s1);
            if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    MessageRedPacketStatus messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
                    if (!TextUtils.isEmpty(messageRedPacketStatus.redPacketTitle)) {
                        string = messageRedPacketStatus.redPacketTitle;
                    }
                } catch (IOException e3) {
                    CrashHelper.m81296c(e3);
                }
            }
            return zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18900s1), string);
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet_notification) && !TextUtils.isEmpty(message.msgData)) {
            try {
                return MessageRedPacketNotificationStatus.JSON_ADAPTER.parse(message.msgData).msg;
            } catch (IOException e4) {
                CrashHelper.m81296c(e4);
            }
        }
        if (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) {
            return (!NullChecker.m81303a(message.extData) || TextUtils.isEmpty(message.extData.recallText)) ? zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f17735Fi), "") : message.extData.recallText;
        }
        if (NullChecker.m81303a(message.location)) {
            charSequenceM220997n0 = NullChecker.m81303a(conversation) ? CoreModule.f17544b.getResources().getString(R$string.f17680Dn) : zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f17650Cn), "");
        } else {
            if (TEnum.equals(message.messageType, "card")) {
                return message.value;
            }
            if (NullChecker.m81303a(message.question)) {
                Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(message.question);
                return questionM215900o3 == null ? "" : questionM215900o3.text;
            }
            if (NullChecker.m81303a(message.sticker)) {
                return hvc0.m133156c(R$string.f18998v9);
            }
            if (TEnum.equals(message.messageType(), MessageType.real_shot)) {
                if (NullChecker.m81303a(conversation) && x4k0.m206993d(CoreModule.f17545c.f19639e0.m169430Pa(message.cid), conversation)) {
                    return TextUtils.isEmpty(message.value) ? CoreModule.f17544b.getResources().getString(R$string.f18276Xj) : message.value;
                }
                return zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18276Xj), message.value);
            }
            if (TEnum.equals(message.messageType, MessageType.group_invitation)) {
                return (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.groupInvitation)) ? message.additionalData.groupInvitation.title : CoreModule.f17544b.getResources().getString(R$string.f18779o1);
            }
            if (TEnum.equals(message.messageType, "picture_compliment")) {
                return message.value;
            }
            List<Media> list = message.media;
            if (list == null || list.isEmpty()) {
                if (NullChecker.m81303a(message.likeOfMoment)) {
                    return message.isMe() ? ddj0.m111022c(CoreModule.f17544b.getResources().getString(R$string.f17765Gi)) : ddj0.m111022c(CoreModule.f17544b.getResources().getString(R$string.f17795Hi));
                }
                if (message.messageType().isUnknownType()) {
                    return CoreModule.f17544b.getResources().getString(R$string.f18955tq);
                }
                if (TEnum.equals(message.messageType, "voice_call")) {
                    return nlm0.m160070c() ? zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18135Ss), "") : CoreModule.f17544b.getResources().getString(R$string.f18955tq);
                }
                if (TEnum.equals(message.messageType, "call_2_buy")) {
                    try {
                        messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
                    } catch (IOException e5) {
                        CrashHelper.m81296c(e5);
                    }
                    charSequenceM220997n0 = NullChecker.m81303a(messageCallToBuy) ? messageCallToBuy.previewText : message.value;
                } else {
                    if (TEnum.equals(message.messageType, "tickle")) {
                        if (!message.isOtherUser()) {
                            return C8524b.m49056h(message);
                        }
                        long j2 = Long.MAX_VALUE;
                        long j3 = Long.MIN_VALUE;
                        try {
                            if (NullChecker.m81303a(conversation) && !TextUtils.isEmpty(conversation.readUntil)) {
                                j = Long.parseLong(conversation.readUntil);
                            }
                            try {
                                if (!TextUtils.isEmpty(message.f56011id) && !message.f56011id.startsWith("fake_id_")) {
                                    j3 = Long.parseLong(message.f56011id);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                j2 = j;
                                CrashHelper.m81296c(e);
                                j = j2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                        if (j >= j3) {
                            return C8524b.m49056h(message);
                        }
                        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0(C8524b.m49056h(message), vwb.m200324f0(CoreModule.f17544b.getString(R$string.f17808I1)), -14606047, eqh0.m117752c(2));
                        int iIndexOf = spannableStringBuilderM133861b0.toString().indexOf(CoreModule.f17544b.getString(R$string.f17808I1));
                        int length = CoreModule.f17544b.getString(R$string.f17808I1).length() + iIndexOf;
                        if (iIndexOf >= 0) {
                            spannableStringBuilderM133861b0.setSpan(new StyleSpan(1), iIndexOf, length, 17);
                        }
                        return spannableStringBuilderM133861b0;
                    }
                    if (TEnum.equals(message.messageType, MessageType.oneweekcp_task)) {
                        return CoreModule.f17544b.getResources().getString(R$string.f18955tq);
                    }
                    if ((TEnum.equals(message.messageType, MessageType.chat_gift) || TEnum.equals(message.messageType, MessageType.moment_gift)) && NullChecker.m81303a(message.additionalData)) {
                        boolean zEquals = TEnum.equals(message.messageType, MessageType.chat_gift);
                        MessageAdditionalData messageAdditionalData = message.additionalData;
                        if (zEquals) {
                            if (NullChecker.m81303a(messageAdditionalData.chatGiftInfo)) {
                                str = message.additionalData.chatGiftInfo.f20361id;
                            } else {
                                str = "";
                            }
                        } else if (NullChecker.m81303a(messageAdditionalData.momentGiftInfo)) {
                            str = message.additionalData.momentGiftInfo.f20361id;
                        } else {
                            str = "";
                        }
                        CoreGiftInfo coreGiftInfoM118054R3 = CoreModule.f17545c.f19643f1.m118054R3(str);
                        if (NullChecker.m81303a(coreGiftInfoM118054R3)) {
                            String str2 = coreGiftInfoM118054R3.name;
                            if (ogl0.m164261n()) {
                                if (TextUtils.isEmpty(coreGiftInfoM118054R3.extra.blessingText)) {
                                    Equals = "hi，" + zyc0.m220915g0();
                                } else {
                                    Equals = "hi，" + coreGiftInfoM118054R3.extra.blessingText;
                                }
                            } else if (coreGiftInfoM118054R3.unitCoinPrice == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                Equals = "hi，送你一个 " + str2;
                            } else {
                                Equals = "hi，送你一个 " + str2;
                            }
                        } else {
                            Equals = "";
                        }
                        if (!NullChecker.m81303a(coreGiftInfoM118054R3) || coreGiftInfoM118054R3.unitCoinPrice != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            if (NullChecker.m81303a(conversation)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(CoreModule.f17544b.getResources().getString(R$string.f18655k1));
                                sb.append(TextUtils.isEmpty(Equals) ? "" : " · ".concat(Equals));
                                charSequenceM220997n0 = sb.toString();
                            } else {
                                charSequenceM220997n0 = zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18624j1), Equals);
                            }
                        }
                        return Equals;
                    }
                    if (TEnum.equals(message.messageType, MessageType.state_like)) {
                        return "赞了你的状态";
                    }
                    Equals = TEnum.equals(message.messageType, MessageType.wanwan_invite);
                    try {
                        if (Equals != 0) {
                            String str3 = message.msgData;
                            String str4 = "[玩摇骰子游戏邀请]";
                            if (TextUtils.isEmpty(str3)) {
                                return "[玩摇骰子游戏邀请]";
                            }
                            charSequenceM220997n0 = new JSONObject(str3).optString(message.isMe() ? "senderSummary" : "receiverSummary");
                            Equals = str4;
                        } else {
                            if (!TEnum.equals(message.messageType, MessageType.zuju_offline)) {
                                if (TEnum.equals(message.messageType, MessageType.wooden_fish)) {
                                    return CoreModule.f17544b.getResources().getString(R$string.f18955tq);
                                }
                                if (TEnum.equals(message.messageType, MessageType.chat_assistant_question) && !TextUtils.isEmpty(message.value)) {
                                    return message.value.replaceFirst("你好呀，问个问题～\n", "");
                                }
                                if (TEnum.equals(message.messageType, MessageType.two_sides_different_tip)) {
                                    if (message.isMe() && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip.selfShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.selfShown.value)) {
                                        message.value = message.additionalData.twoSidesDifferentTip.selfShown.value;
                                    } else if (NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip) && NullChecker.m81303a(message.additionalData.twoSidesDifferentTip.otherShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.otherShown.value)) {
                                        message.value = message.additionalData.twoSidesDifferentTip.otherShown.value;
                                    }
                                    return message.value;
                                }
                                if (!TEnum.equals(message.messageType, MessageType.love_letter)) {
                                    return TEnum.equals(message.messageType, MessageType.ai_chat_analysis) ? "[对话分析]" : message.value;
                                }
                                if (!message.isMe()) {
                                    return "唯一的情书送给你";
                                }
                                if (TEnum.equals(conversation.additional.loveLetter.state, "opened")) {
                                    return CoreModule.f17545c.f19639e0.m169430Pa(conversation.f56011id).getPronoun() + "已查看情书";
                                }
                                if (!TEnum.equals(conversation.additional.loveLetter.state, "default")) {
                                    return "";
                                }
                                if (!m181725E0(conversation, message)) {
                                    return "已为你送达";
                                }
                                return CoreModule.f17545c.f19639e0.m169430Pa(conversation.f56011id).getPronoun() + "已查看情书";
                            }
                            String str5 = message.msgData;
                            String str6 = "[活动卡片]";
                            if (TextUtils.isEmpty(str5)) {
                                return "[活动卡片]";
                            }
                            charSequenceM220997n0 = new JSONObject(str5).optString(message.isMe() ? "senderSummary" : "receiverSummary");
                            Equals = str6;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (message.media.get(0) instanceof Video) {
                charSequenceM220997n0 = NullChecker.m81303a(conversation) ? CoreModule.f17544b.getResources().getString(R$string.f18427ci) : zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18396bi), "");
            } else if (message.media.get(0) instanceof Picture) {
                charSequenceM220997n0 = NullChecker.m81303a(conversation) ? CoreModule.f17544b.getResources().getString(R$string.f18334Zh) : zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f18304Yh), "");
            } else {
                if (!(message.media.get(0) instanceof Audio)) {
                    return "";
                }
                charSequenceM220997n0 = NullChecker.m81303a(conversation) ? CoreModule.f17544b.getResources().getString(R$string.f17914Lh) : zz6.m220997n0(CoreModule.f17544b.getResources().getString(R$string.f17884Kh), "");
            }
        }
        return charSequenceM220997n0;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m181730J0(MutualContactsLocalLookups mutualContactsLocalLookups) {
        if (TextUtils.isEmpty(mutualContactsLocalLookups.next)) {
            return CoreModule.f17544b.getString(R$string.f18520fj, Integer.valueOf(mutualContactsLocalLookups.lookups.size()));
        }
        return CoreModule.f17544b.getString(R$string.f18551gj).replace("20", mutualContactsLocalLookups.batchSize + "");
    }

    /* JADX INFO: renamed from: K0 */
    public static String m181731K0(MutualContactsLocalLookups mutualContactsLocalLookups) {
        StringBuilder sb;
        String str;
        if (TextUtils.isEmpty(mutualContactsLocalLookups.next)) {
            sb = new StringBuilder();
            sb.append(mutualContactsLocalLookups.lookups.size());
            str = "";
        } else {
            sb = new StringBuilder();
            sb.append(mutualContactsLocalLookups.batchSize);
            str = Marker.ANY_NON_NULL_MARKER;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: L0 */
    public static String m181732L0(MutualContactsLocalLookups mutualContactsLocalLookups) {
        if (TextUtils.isEmpty(mutualContactsLocalLookups.next)) {
            return CoreModule.f17544b.getString(R$string.f18307Yk, Integer.valueOf(mutualContactsLocalLookups.lookups.size()));
        }
        return CoreModule.f17544b.getString(R$string.f18337Zk).replace("20", mutualContactsLocalLookups.batchSize + "");
    }

    /* JADX INFO: renamed from: M0 */
    public static String m181733M0(Context context, User user) {
        CharSequence charSequenceM133879s;
        String strM181724D0 = m181724D0(context, user);
        if (CoreModule.f17545c.f19561E0.m203772B3(user) || user.isMe()) {
            charSequenceM133879s = "";
        } else if (u59.m191843n0(user) && NullChecker.m81303a(CoreModule.m29932K().me_()) && !TextUtils.isEmpty(CoreModule.m29932K().me_().location.region.city)) {
            charSequenceM133879s = user.f56011id.equals(CoreModule.m29931H().userId()) ? i0g0.m133879s(user.location.distance, true, false) : CoreModule.m29932K().me_().location.region.city;
        } else {
            boolean zEquals = user.f56011id.equals(CoreModule.m29931H().userId());
            Location location = user.location;
            charSequenceM133879s = zEquals ? i0g0.m133879s(location.distance, true, false) : i0g0.m133854U(location, false, null, false, true);
        }
        if (TextUtils.isEmpty(charSequenceM133879s)) {
            return strM181724D0;
        }
        if (TextUtils.isEmpty(strM181724D0)) {
            return String.valueOf(charSequenceM133879s);
        }
        return ((Object) charSequenceM133879s) + " · " + strM181724D0;
    }

    /* JADX INFO: renamed from: N0 */
    public static SpannableStringBuilder m181734N0(List<Tag> list, List<Tag> list2, int i, boolean z, int i2, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        if (NullChecker.m81303a(list)) {
            for (Tag tag : list) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag.category);
                    u600 u600Var = new u600(CoreModule.f17544b, tag.value, -1, -98787, i, 8, i2, 13.0f, true, t100.m186890d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(u600Var, i3, i4, 33);
                    i3 = i4;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        if (NullChecker.m81303a(list2)) {
            for (Tag tag2 : list2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag2.category);
                    int i5 = i3 + 1;
                    spannableStringBuilder.setSpan(new u600(CoreModule.f17544b, tag2.value, z2 ? -6710887 : -872415232, z2 ? -1 : 16777215, i, 8, i2, 13.0f, 117440512, t100.m186890d(3.0f), true, t100.m186890d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: O0 */
    public static SpannableStringBuilder m181735O0(String str, int i, Typeface typeface) {
        return m181736P0(str, i, typeface, 0);
    }

    /* JADX INFO: renamed from: P0 */
    public static SpannableStringBuilder m181736P0(String str, int i, Typeface typeface, int i2) {
        Matcher matcher = Pattern.compile("-?[0-9]\\d*").matcher(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i, i2), matcher.start(), matcher.end(), 33);
        }
        int iIndexOf = str.indexOf(Marker.ANY_NON_NULL_MARKER);
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", typeface, i, i2), iIndexOf, iIndexOf + 1, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: Q0 */
    public static void m181737Q0(final TextView textView, final int i) {
        textView.post(new Runnable() { // from class: l.pza
            @Override // java.lang.Runnable
            public final void run() {
                rza.m181743x0(textView, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX INFO: renamed from: R0 */
    public static String m181738R0(Message message) {
        String strConcat;
        if (message.recalled.booleanValue() && NullChecker.m81303a(message.extData) && !TextUtils.isEmpty(message.extData.recallText)) {
            return message.extData.recallText;
        }
        if (message.isMe()) {
            Application application = CoreModule.f17544b;
            return application.getString(R$string.f17825Ii, application.getString(R$string.f17855Ji));
        }
        if (upa.m194706V1() && message.isGroupMessage()) {
            ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(message.getHostId(), message.owner);
            if (NullChecker.m81303a(chatGroupMemberM31855W8)) {
                strConcat = chatGroupMemberM31855W8.groupMemberName();
            } else {
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.owner);
        if (TextUtils.isEmpty(strConcat) && NullChecker.m81303a(userM169430Pa)) {
            strConcat = userM169430Pa.name;
        }
        if (NullChecker.m81303a(userM169430Pa)) {
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(userM169430Pa.f56011id);
            if (!TextUtils.isEmpty(strM169561y7)) {
                strConcat = strM169561y7;
            }
        }
        if (upa.m194706V1() && message.isGroupMessage() && strConcat.length() > 8) {
            strConcat = strConcat.substring(0, 8).concat("…");
        }
        return CoreModule.f17544b.getString(R$string.f17825Ii, strConcat);
    }

    /* JADX INFO: renamed from: S0 */
    public static CharSequence m181739S0(Act act, String str) {
        String str2 = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        SpannableString spannableString = new SpannableString(str2);
        Drawable drawable = act.getResources().getDrawable(x2c0.f189730Sc);
        drawable.setBounds(t100.m186890d(8.0f), 0, drawable.getIntrinsicWidth() + t100.m186890d(8.0f), drawable.getIntrinsicHeight());
        spannableString.setSpan(new q0l0(drawable), str2.length() - 1, str2.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: T0 */
    public static SpannableStringBuilder m181740T0(String str, String str2, int i, w9j<String, String> w9jVar) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            try {
                arrayList.add(matcher.group());
            } catch (IllegalStateException unused) {
            }
        }
        if (NullChecker.m81303a(w9jVar)) {
            str = w9jVar.call(str);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (arrayList.size() > 0) {
            int iIndexOf = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String str3 = (String) arrayList.get(i2);
                iIndexOf = str.indexOf(str3, iIndexOf);
                if (iIndexOf != -1) {
                    spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT, i), iIndexOf, str3.length() + iIndexOf, 33);
                    spannableStringBuilder.setSpan(new StyleSpan(3), iIndexOf, str3.length() + iIndexOf, 33);
                    iIndexOf += str3.length();
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: U0 */
    public static String m181741U0(Spanned spanned) {
        return vwb.m200308V((kuh0[]) spanned.getSpans(0, spanned.length(), kuh0.class), ", ");
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m181743x0(TextView textView, int i) {
        String str;
        if (textView.getLineCount() < 4) {
            return;
        }
        int lineEnd = textView.getLayout().getLineEnd(2);
        String string = textView.getResources().getString(i);
        if (string.contains("%s")) {
            String strSubstring = string.substring(string.indexOf("%s") + 2, string.length());
            int length = (lineEnd - 3) - strSubstring.length();
            if (length < 0) {
                str = textView.getText().toString().substring(0, lineEnd - 1) + "..." + strSubstring;
            } else {
                str = textView.getText().toString().substring(0, length) + "..." + strSubstring;
            }
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static SpannableStringBuilder m181744y0(Act act, SpannableStringBuilder spannableStringBuilder, @ColorInt int i, boolean z, boolean z2, @ColorInt int i2, String... strArr) {
        String string = z ? z2 ? act.getString(R$string.f18796oi, act.string(R$string.f18571h8)) : act.getString(R$string.f18540g8, act.string(R$string.f18571h8)) : "\n \n" + act.getString(R$string.f18540g8, act.string(R$string.f18571h8));
        String str = ((Object) spannableStringBuilder) + string;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        int iIndexOf = str.indexOf(string);
        int length = string.length() + iIndexOf;
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(14, true), 0, iIndexOf, 34);
        spannableStringBuilder2.setSpan(foregroundColorSpan, iIndexOf, length, 33);
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(10, true), iIndexOf, length, 34);
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            String str2 = strArr[i3];
            spannableStringBuilder2.setSpan(new C19816a(act, str2, strArr[i3 + 1], i2), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder2;
    }

    /* JADX INFO: renamed from: z0 */
    public static int m181745z0(DoublePair doublePair) {
        com.p046p1.mobile.putong.location.Location locationM78865q = qib0.f154687E.m78865q();
        if (doublePair == null || locationM78865q == null) {
            return 0;
        }
        com.p046p1.mobile.putong.location.Location location = new com.p046p1.mobile.putong.location.Location("me");
        location.m78825K(locationM78865q.m78831u());
        location.m78827M(locationM78865q.m78833x());
        com.p046p1.mobile.putong.location.Location location2 = new com.p046p1.mobile.putong.location.Location("other");
        location2.m78825K(doublePair.first);
        location2.m78827M(doublePair.second);
        return (int) location.m78828r(location2);
    }
}
