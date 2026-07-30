package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationNotification;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.FigureMessageArg;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageChatHeat;
import com.p051p1.mobile.putong.core.data.MessageRedPacketNotificationStatus;
import com.p051p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageCallToBuy;
import com.p051p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
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
import p151v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: classes6.dex */
public class e1b extends c17 {

    /* JADX INFO: renamed from: i */
    public static String[] f91577i = {"A", "B", c4s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f39576O, "P", "Q", "R", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "U", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: j */
    public static final DecimalFormat f91578j = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: k */
    public static final int[] f91579k = {-13651766, -2515646, -148921, -3184206, -5978302, -296416, -8078862, -6777170};

    /* JADX INFO: renamed from: l.e1b$a */
    public class C16678a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f91580a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f91581b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f91582c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f91583d;

        public C16678a(Act act, String str, String str2, int i) {
            this.f91580a = act;
            this.f91581b = str;
            this.f91582c = str2;
            this.f91583d = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Act act = this.f91580a;
            act.startActivity(WebViewAct.m81347a2(act, this.f91581b, this.f91582c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            try {
                int i = this.f91583d;
                if (i != 0) {
                    textPaint.setColor(i);
                } else {
                    textPaint.setColor(this.f91580a.getResources().getColor(c9c0.f80344I1));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.e1b$b */
    public class C16679b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f91584a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f91585b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f91586c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f91587d;

        public C16679b(Activity activity, String str, String str2, int i) {
            this.f91584a = activity;
            this.f91585b = str;
            this.f91586c = str2;
            this.f91587d = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Activity activity = this.f91584a;
            AccountTempApi accountTempApi = uqb0.f180380L;
            String str = this.f91585b;
            activity.startActivity(accountTempApi == null ? WebViewPreAct.m80585K0(activity, str, this.f91586c) : WebViewAct.m81347a2(activity, str, this.f91586c));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(this.f91584a.getResources().getColor(this.f91587d));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static SpannableStringBuilder m118943A0(Activity activity, String str, @ColorRes int i, String... strArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str2 = strArr[i2];
            String str3 = strArr[i2 + 1];
            if (str.indexOf(str2) > 0) {
                spannableStringBuilder.setSpan(new C16679b(activity, str2, str3, i), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: B0 */
    public static CharSequence m118944B0(Act act, int i, int i2, Figure figure) {
        int i3;
        float f;
        String strM175811p = figure.name;
        if (IntlCountryCodeController.m29109f()) {
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
                        strM175811p = q8g0.m175811p(i3, false);
                    }
                }
                i3 = (int) f;
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
            if (i3 > -1) {
                strM175811p = q8g0.m175811p(i3, false);
            }
        }
        if (i2 != 0) {
            if (CoreModule.m30933P().m143405a().mo34377N8()) {
                if (i2 == 1) {
                    return q8g0.m175800f0(String.format(act.getString(R$string.f19022Y5), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
                }
                String string = act.getString(R$string.f18992X5);
                String strM175775G = q8g0.m175775G(i2);
                return q8g0.m175800f0(String.format(string, strM175775G, strM175811p), jyb.m147507f0(strM175775G, strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            if (CoreModule.m30933P().m143405a().mo34494eg()) {
                if (i2 == 1) {
                    return q8g0.m175800f0(String.format(act.getString(R$string.f19083a6), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
                }
                String string2 = act.getString(R$string.f19052Z5);
                String strM175775G2 = q8g0.m175775G(i2);
                return q8g0.m175800f0(String.format(string2, strM175775G2, strM175811p), jyb.m147507f0(strM175775G2, strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            if (i2 == 1) {
                return q8g0.m175800f0(String.format(act.getString(R$string.f19145c6), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
            }
            String string3 = act.getString(R$string.f19114b6);
            String strM175775G3 = q8g0.m175775G(i2);
            return q8g0.m175800f0(String.format(string3, strM175775G3, strM175811p), jyb.m147507f0(String.valueOf(strM175775G3), strM175811p), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3));
        }
        if (CoreModule.m30933P().m143405a().mo34377N8()) {
            if (i == 1) {
                return q8g0.m175800f0(String.format(act.getString(R$string.f18842S5), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            int i4 = figure.total;
            if (i == i4) {
                String string4 = act.getString(R$string.f18752P5);
                String strM175775G4 = q8g0.m175775G(i);
                return q8g0.m175800f0(String.format(string4, strM175775G4, strM175811p), jyb.m147507f0(strM175775G4, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            if (i > 1 && i4 == 1) {
                String string5 = act.getString(R$string.f18782Q5);
                String strM175775G5 = q8g0.m175775G(i);
                return q8g0.m175800f0(String.format(string5, strM175775G5, strM175811p), jyb.m147507f0(strM175775G5, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            String string6 = act.getString(R$string.f18812R5);
            String strM175775G6 = q8g0.m175775G(i);
            String strM175775G7 = q8g0.m175775G(figure.total);
            return q8g0.m175800f0(String.format(string6, strM175775G6, strM175775G7, strM175811p), jyb.m147507f0(strM175775G6, strM175775G7, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (CoreModule.m30933P().m143405a().mo34494eg()) {
            if (i == 1) {
                return q8g0.m175800f0(String.format(act.getString(R$string.f18962W5), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            int i5 = figure.total;
            if (i == i5) {
                String string7 = act.getString(R$string.f18872T5);
                String strM175775G8 = q8g0.m175775G(i);
                return q8g0.m175800f0(String.format(string7, strM175775G8, strM175811p), jyb.m147507f0(strM175775G8, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            if (i > 1 && i5 == 1) {
                String string8 = act.getString(R$string.f18902U5);
                String strM175775G9 = q8g0.m175775G(i);
                return q8g0.m175800f0(String.format(string8, strM175775G9, strM175811p), jyb.m147507f0(strM175775G9, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
            }
            String string9 = act.getString(R$string.f18932V5);
            String strM175775G10 = q8g0.m175775G(i);
            String strM175775G11 = q8g0.m175775G(figure.total);
            return q8g0.m175800f0(String.format(string9, strM175775G10, strM175775G11, strM175811p), jyb.m147507f0(strM175775G10, strM175775G11, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (i == 1) {
            return q8g0.m175800f0(String.format(act.getString(R$string.f19268g6), strM175811p), jyb.m147507f0(strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        int i6 = figure.total;
        if (i == i6) {
            String string10 = act.getString(R$string.f19176d6);
            String strM175775G12 = q8g0.m175775G(i);
            return q8g0.m175800f0(String.format(string10, strM175775G12, strM175811p), jyb.m147507f0(strM175775G12, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        if (i > 1 && i6 == 1) {
            String string11 = act.getString(R$string.f19206e6);
            String strM175775G13 = q8g0.m175775G(i);
            return q8g0.m175800f0(String.format(string11, strM175775G13, strM175811p), jyb.m147507f0(strM175775G13, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
        }
        String string12 = act.getString(R$string.f19237f6);
        String strM175775G14 = q8g0.m175775G(i);
        String strM175775G15 = q8g0.m175775G(figure.total);
        return q8g0.m175800f0(String.format(string12, strM175775G14, strM175775G15, strM175811p), jyb.m147507f0(strM175775G14, strM175775G15, strM175811p), Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 3));
    }

    /* JADX INFO: renamed from: C0 */
    public static CharSequence m118945C0(Figure figure) {
        String str;
        String strReplaceAll = figure.message.template.replaceAll("%@", "%s");
        ArrayList arrayListM147522n = jyb.m147522n(figure.message.args, new qcj() { // from class: l.d1b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("highlight".equals(((FigureMessageArg) obj).displayType));
            }
        });
        ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
        if (arrayListM147522n.size() == 1) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM147522n.get(0)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(0)).value);
        } else if (arrayListM147522n.size() == 2) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM147522n.get(0)).value, ((FigureMessageArg) arrayListM147522n.get(1)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(0)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(1)).value);
        } else if (arrayListM147522n.size() == 3) {
            str = String.format(strReplaceAll, ((FigureMessageArg) arrayListM147522n.get(0)).value, ((FigureMessageArg) arrayListM147522n.get(1)).value, ((FigureMessageArg) arrayListM147522n.get(2)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(0)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(1)).value);
            arrayListM147507f0.add(((FigureMessageArg) arrayListM147522n.get(2)).value);
        } else {
            str = figure.message.template;
        }
        return arrayListM147507f0.size() == 0 ? m118957O0(str, Color.parseColor("#FE7E1D"), null) : q8g0.m175800f0(str, arrayListM147507f0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 1));
    }

    /* JADX INFO: renamed from: D0 */
    public static String m118946D0(Context context, User user) {
        if (user.location.isHideUpdateTime()) {
            return "";
        }
        if (!CoreModule.f18264c.f20303E0.m141088w3(user)) {
            if (CoreModule.f18264c.f20303E0.m141089x3(user)) {
                return "";
            }
            return d79.m114701r0(user) ? context.getString(R$string.f18857Sk, pzi0.m174444I(System.currentTimeMillis(), true)) : pzi0.m174445J(user.location.updatedTime, true);
        }
        if (!user.isHideActiveFromSVip()) {
            return "";
        }
        String string = context.getString(R$string.f18857Sk, pzi0.m174444I(wtd0.m207832d(user), true));
        if (!user.isMe()) {
            return string;
        }
        return string + context.getString(R$string.f19449m3);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m118947E0(Conversation conversation, Message message) {
        if (conversation != null && !TextUtils.isEmpty(conversation.otherReadUntil)) {
            if (Long.parseLong(message.f56859id) <= Long.parseLong(conversation.otherReadUntil)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F0 */
    public static boolean m118948F0(Message message, Conversation conversation) {
        if (NullChecker.m82486a(message) && NullChecker.m82486a(conversation) && conversation.unreadMessages <= 0 && NullChecker.m82486a(conversation.additional)) {
            NullChecker.m82486a(conversation.additional.localMomentInfo);
        }
        return false;
    }

    /* JADX INFO: renamed from: G0 */
    public static boolean m118949G0() {
        String language = Locale.getDefault().getLanguage();
        if (NullChecker.m82486a(language)) {
            return language.startsWith("zh");
        }
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public static CharSequence m118950H0(Message message) {
        return m118951I0(message, null);
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
    public static CharSequence m118951I0(Message message, Conversation conversation) throws IOException {
        CharSequence charSequenceM107521n0;
        String str;
        ?? Equals;
        int iM32818J6;
        if (message == null) {
            return "";
        }
        if (TEnum.equals(message.messageType, MessageType.hide_for_fake_user)) {
            return !h39.m133422K() ? CoreModule.f18263b.getResources().getString(R$string.f18743Oq) : "对方发来一条消息";
        }
        MessageChatHeat messageChatHeat = null;
        MessageCallToBuy messageCallToBuy = null;
        long j = 0;
        if (TEnum.equals(message.messageType, MessageType.exclusive_chat_invite)) {
            try {
                messageChatHeat = MessageChatHeat.JSON_ADAPTER.parse(message.msgData);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            if (!NullChecker.m82486a(messageChatHeat)) {
                return "1v1专属聊天邀请";
            }
            if (pzi0.m174454o() > ((long) messageChatHeat.exclusiveChatInviteExpireTime) && ((long) messageChatHeat.exclusiveChatStartTime) <= 0) {
                return "未及时接受，专属聊天邀请已失效";
            }
            if (pzi0.m174454o() <= ((long) messageChatHeat.exclusiveChatInviteTime) || pzi0.m174454o() >= ((long) messageChatHeat.exclusiveChatInviteExpireTime) || ((long) messageChatHeat.exclusiveChatStartTime) > 0) {
                return "1v1专属聊天邀请";
            }
            return "1v1专属聊天邀请 " + RunnableC4884c0.m32505l(((long) messageChatHeat.exclusiveChatInviteExpireTime) - pzi0.m174454o());
        }
        if (TEnum.equals(message.messageType, "voice_call_invitation")) {
            return rum0.m183206a(message, conversation);
        }
        if ((TEnum.equals(message.messageType(), MessageType.common_tip) || TEnum.equals(message.messageType(), MessageType.common_tip_list_show) || TEnum.equals(message.messageType(), MessageType.local_intl_prompt_message_type)) && !TextUtils.isEmpty(message.value)) {
            Spanned spannedFromHtml = Html.fromHtml(message.value);
            String[] strArrSplit = message.value.split("<a>");
            if (strArrSplit.length > 1) {
                String[] strArrSplit2 = strArrSplit[1].split("</a>");
                if (strArrSplit2.length > 0) {
                    return q8g0.m175796b0(spannedFromHtml.toString(), jyb.m147507f0(strArrSplit2[0]), -98787, lyh0.m156283c(2));
                }
            }
            return spannedFromHtml;
        }
        if (TEnum.equals(message.messageType, MessageType.conversation_notification)) {
            if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.conversationNotification)) {
                ConversationNotification conversationNotification = message.additionalData.conversationNotification;
                if (!TextUtils.isEmpty(conversationNotification.localeKey) && (iM32818J6 = CoreModule.f18264c.f20387g0.m32818J6(conversationNotification.localeKey)) > 0) {
                    try {
                        return !jyb.m147479J(conversationNotification.params) ? CoreModule.f18263b.getString(iM32818J6, conversationNotification.params.toArray()) : CoreModule.f18263b.getString(iM32818J6);
                    } catch (Exception e2) {
                        CrashHelper.m82479c(e2);
                    }
                }
            }
            return message.value;
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet)) {
            String string = CoreModule.f18263b.getResources().getString(R$string.f19633s1);
            if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    MessageRedPacketStatus messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
                    if (!TextUtils.isEmpty(messageRedPacketStatus.redPacketTitle)) {
                        string = messageRedPacketStatus.redPacketTitle;
                    }
                } catch (IOException e3) {
                    CrashHelper.m82479c(e3);
                }
            }
            return c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19633s1), string);
        }
        if (TEnum.equals(message.messageType, MessageType.red_packet_notification) && !TextUtils.isEmpty(message.msgData)) {
            try {
                return MessageRedPacketNotificationStatus.JSON_ADAPTER.parse(message.msgData).msg;
            } catch (IOException e4) {
                CrashHelper.m82479c(e4);
            }
        }
        if (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) {
            return (!NullChecker.m82486a(message.extData) || TextUtils.isEmpty(message.extData.recallText)) ? c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19127bj), "") : message.extData.recallText;
        }
        if (NullChecker.m82486a(message.location)) {
            charSequenceM107521n0 = NullChecker.m82486a(conversation) ? CoreModule.f18263b.getResources().getString(R$string.f19070Zn) : c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19040Yn), "");
        } else {
            if (TEnum.equals(message.messageType, "card")) {
                return message.value;
            }
            if (NullChecker.m82486a(message.question)) {
                Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(message.question);
                return questionM151465o3 == null ? "" : questionM151465o3.text;
            }
            if (NullChecker.m82486a(message.sticker)) {
                return k3d0.m148007c(R$string.f18326B9);
            }
            if (TEnum.equals(message.messageType(), MessageType.real_shot)) {
                if (NullChecker.m82486a(conversation) && dek0.m115423d(CoreModule.f18264c.f20381e0.m116503Pa(message.cid), conversation)) {
                    return TextUtils.isEmpty(message.value) ? CoreModule.f18263b.getResources().getString(R$string.f19683tk) : message.value;
                }
                return c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19683tk), message.value);
            }
            if (TEnum.equals(message.messageType, MessageType.group_invitation)) {
                return (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.groupInvitation)) ? message.additionalData.groupInvitation.title : CoreModule.f18263b.getResources().getString(R$string.f19509o1);
            }
            if (TEnum.equals(message.messageType, "picture_compliment")) {
                return message.value;
            }
            List<Media> list = message.media;
            if (list == null || list.isEmpty()) {
                if (NullChecker.m82486a(message.likeOfMoment)) {
                    return message.isMe() ? hmj0.m135867c(CoreModule.f18263b.getResources().getString(R$string.f19158cj)) : hmj0.m135867c(CoreModule.f18263b.getResources().getString(R$string.f19189dj));
                }
                if (message.messageType().isUnknownType()) {
                    return CoreModule.f18263b.getResources().getString(R$string.f18743Oq);
                }
                if (TEnum.equals(message.messageType, "voice_call")) {
                    return rum0.m183208c() ? c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19568pt), "") : CoreModule.f18263b.getResources().getString(R$string.f18743Oq);
                }
                if (TEnum.equals(message.messageType, "call_2_buy")) {
                    try {
                        messageCallToBuy = MessageCallToBuy.JSON_ADAPTER.parse(message.msgData);
                    } catch (IOException e5) {
                        CrashHelper.m82479c(e5);
                    }
                    charSequenceM107521n0 = NullChecker.m82486a(messageCallToBuy) ? messageCallToBuy.previewText : message.value;
                } else {
                    if (TEnum.equals(message.messageType, "tickle")) {
                        if (!message.isOtherUser()) {
                            return C8687b.m50239h(message);
                        }
                        long j2 = Long.MAX_VALUE;
                        long j3 = Long.MIN_VALUE;
                        try {
                            if (NullChecker.m82486a(conversation) && !TextUtils.isEmpty(conversation.readUntil)) {
                                j = Long.parseLong(conversation.readUntil);
                            }
                            try {
                                if (!TextUtils.isEmpty(message.f56859id) && !message.f56859id.startsWith("fake_id_")) {
                                    j3 = Long.parseLong(message.f56859id);
                                }
                            } catch (Exception e6) {
                                e = e6;
                                j2 = j;
                                CrashHelper.m82479c(e);
                                j = j2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                        if (j >= j3) {
                            return C8687b.m50239h(message);
                        }
                        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0(C8687b.m50239h(message), jyb.m147507f0(CoreModule.f18263b.getString(R$string.f18535I1)), -14606047, lyh0.m156283c(2));
                        int iIndexOf = spannableStringBuilderM175796b0.toString().indexOf(CoreModule.f18263b.getString(R$string.f18535I1));
                        int length = CoreModule.f18263b.getString(R$string.f18535I1).length() + iIndexOf;
                        if (iIndexOf >= 0) {
                            spannableStringBuilderM175796b0.setSpan(new StyleSpan(1), iIndexOf, length, 17);
                        }
                        return spannableStringBuilderM175796b0;
                    }
                    if (TEnum.equals(message.messageType, MessageType.oneweekcp_task)) {
                        return CoreModule.f18263b.getResources().getString(R$string.f18743Oq);
                    }
                    if ((TEnum.equals(message.messageType, MessageType.chat_gift) || TEnum.equals(message.messageType, MessageType.moment_gift)) && NullChecker.m82486a(message.additionalData)) {
                        boolean zEquals = TEnum.equals(message.messageType, MessageType.chat_gift);
                        MessageAdditionalData messageAdditionalData = message.additionalData;
                        if (zEquals) {
                            if (NullChecker.m82486a(messageAdditionalData.chatGiftInfo)) {
                                str = message.additionalData.chatGiftInfo.f21103id;
                            } else {
                                str = "";
                            }
                        } else if (NullChecker.m82486a(messageAdditionalData.momentGiftInfo)) {
                            str = message.additionalData.momentGiftInfo.f21103id;
                        } else {
                            str = "";
                        }
                        CoreGiftInfo coreGiftInfoM155892R3 = CoreModule.f18264c.f20385f1.m155892R3(str);
                        if (NullChecker.m82486a(coreGiftInfoM155892R3)) {
                            String str2 = coreGiftInfoM155892R3.name;
                            if (spl0.m187388n()) {
                                if (TextUtils.isEmpty(coreGiftInfoM155892R3.extra.blessingText)) {
                                    Equals = "hi，" + c7d0.m108298g0();
                                } else {
                                    Equals = "hi，" + coreGiftInfoM155892R3.extra.blessingText;
                                }
                            } else if (coreGiftInfoM155892R3.unitCoinPrice == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                Equals = "hi，送你一个 " + str2;
                            } else {
                                Equals = "hi，送你一个 " + str2;
                            }
                        } else {
                            Equals = "";
                        }
                        if (!NullChecker.m82486a(coreGiftInfoM155892R3) || coreGiftInfoM155892R3.unitCoinPrice != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            if (NullChecker.m82486a(conversation)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(CoreModule.f18263b.getResources().getString(R$string.f19385k1));
                                sb.append(TextUtils.isEmpty(Equals) ? "" : " · ".concat(Equals));
                                charSequenceM107521n0 = sb.toString();
                            } else {
                                charSequenceM107521n0 = c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19354j1), Equals);
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
                            charSequenceM107521n0 = new JSONObject(str3).optString(message.isMe() ? "senderSummary" : "receiverSummary");
                            Equals = str4;
                        } else {
                            if (!TEnum.equals(message.messageType, MessageType.zuju_offline)) {
                                if (TEnum.equals(message.messageType, MessageType.wooden_fish)) {
                                    return CoreModule.f18263b.getResources().getString(R$string.f18743Oq);
                                }
                                if (TEnum.equals(message.messageType, MessageType.chat_assistant_question) && !TextUtils.isEmpty(message.value)) {
                                    return message.value.replaceFirst("你好呀，问个问题～\n", "");
                                }
                                if (TEnum.equals(message.messageType, MessageType.two_sides_different_tip)) {
                                    if (message.isMe() && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip.selfShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.selfShown.value)) {
                                        message.value = message.additionalData.twoSidesDifferentTip.selfShown.value;
                                    } else if (NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip) && NullChecker.m82486a(message.additionalData.twoSidesDifferentTip.otherShown) && !TextUtils.isEmpty(message.additionalData.twoSidesDifferentTip.otherShown.value)) {
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
                                    return CoreModule.f18264c.f20381e0.m116503Pa(conversation.f56859id).getPronoun() + "已查看情书";
                                }
                                if (!TEnum.equals(conversation.additional.loveLetter.state, "default")) {
                                    return "";
                                }
                                if (!m118947E0(conversation, message)) {
                                    return "已为你送达";
                                }
                                return CoreModule.f18264c.f20381e0.m116503Pa(conversation.f56859id).getPronoun() + "已查看情书";
                            }
                            String str5 = message.msgData;
                            String str6 = "[活动卡片]";
                            if (TextUtils.isEmpty(str5)) {
                                return "[活动卡片]";
                            }
                            charSequenceM107521n0 = new JSONObject(str5).optString(message.isMe() ? "senderSummary" : "receiverSummary");
                            Equals = str6;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (message.media.get(0) instanceof Video) {
                charSequenceM107521n0 = NullChecker.m82486a(conversation) ? CoreModule.f18263b.getResources().getString(R$string.f19805xi) : c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19774wi), "");
            } else if (message.media.get(0) instanceof Picture) {
                charSequenceM107521n0 = NullChecker.m82486a(conversation) ? CoreModule.f18263b.getResources().getString(R$string.f19712ui) : c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19681ti), "");
            } else {
                if (!(message.media.get(0) instanceof Audio)) {
                    return "";
                }
                charSequenceM107521n0 = NullChecker.m82486a(conversation) ? CoreModule.f18263b.getResources().getString(R$string.f19280gi) : c17.m107521n0(CoreModule.f18263b.getResources().getString(R$string.f19249fi), "");
            }
        }
        return charSequenceM107521n0;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m118952J0(MutualContactsLocalLookups mutualContactsLocalLookups) {
        if (TextUtils.isEmpty(mutualContactsLocalLookups.next)) {
            return CoreModule.f18263b.getString(R$string.f18336Bj, Integer.valueOf(mutualContactsLocalLookups.lookups.size()));
        }
        return CoreModule.f18263b.getString(R$string.f18367Cj).replace("20", mutualContactsLocalLookups.batchSize + "");
    }

    /* JADX INFO: renamed from: K0 */
    public static String m118953K0(MutualContactsLocalLookups mutualContactsLocalLookups) {
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
    public static String m118954L0(MutualContactsLocalLookups mutualContactsLocalLookups) {
        if (TextUtils.isEmpty(mutualContactsLocalLookups.next)) {
            return CoreModule.f18263b.getString(R$string.f19715ul, Integer.valueOf(mutualContactsLocalLookups.lookups.size()));
        }
        return CoreModule.f18263b.getString(R$string.f19746vl).replace("20", mutualContactsLocalLookups.batchSize + "");
    }

    /* JADX INFO: renamed from: M0 */
    public static String m118955M0(Context context, User user) {
        CharSequence charSequenceM175814s;
        String strM118946D0 = m118946D0(context, user);
        if (CoreModule.f18264c.f20303E0.m141060B3(user) || user.isMe()) {
            charSequenceM175814s = "";
        } else if (d79.m114701r0(user) && NullChecker.m82486a(CoreModule.m30930K().me_()) && !TextUtils.isEmpty(CoreModule.m30930K().me_().location.region.city)) {
            charSequenceM175814s = user.f56859id.equals(CoreModule.m30929H().userId()) ? q8g0.m175814s(user.location.distance, true, false) : CoreModule.m30930K().me_().location.region.city;
        } else {
            boolean zEquals = user.f56859id.equals(CoreModule.m30929H().userId());
            Location location = user.location;
            charSequenceM175814s = zEquals ? q8g0.m175814s(location.distance, true, false) : q8g0.m175789U(location, false, null, false, true);
        }
        if (TextUtils.isEmpty(charSequenceM175814s)) {
            return strM118946D0;
        }
        if (TextUtils.isEmpty(strM118946D0)) {
            return String.valueOf(charSequenceM175814s);
        }
        return ((Object) charSequenceM175814s) + " · " + strM118946D0;
    }

    /* JADX INFO: renamed from: N0 */
    public static SpannableStringBuilder m118956N0(List<Tag> list, List<Tag> list2, int i, boolean z, int i2, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        if (NullChecker.m82486a(list)) {
            for (Tag tag : list) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag.category);
                    df00 df00Var = new df00(CoreModule.f18263b, tag.value, -1, -98787, i, 8, i2, 13.0f, true, qa00.m175859d(44.0f));
                    int i4 = i3 + 1;
                    spannableStringBuilder.setSpan(df00Var, i3, i4, 33);
                    i3 = i4;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        if (NullChecker.m82486a(list2)) {
            for (Tag tag2 : list2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) "1");
                    Profile.categoryToIndex(tag2.category);
                    int i5 = i3 + 1;
                    spannableStringBuilder.setSpan(new df00(CoreModule.f18263b, tag2.value, z2 ? -6710887 : -872415232, z2 ? -1 : 16777215, i, 8, i2, 13.0f, 117440512, qa00.m175859d(3.0f), true, qa00.m175859d(44.0f)), i3, i5, 33);
                    i3 = i5;
                } else {
                    spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: O0 */
    public static SpannableStringBuilder m118957O0(String str, int i, Typeface typeface) {
        return m118958P0(str, i, typeface, 0);
    }

    /* JADX INFO: renamed from: P0 */
    public static SpannableStringBuilder m118958P0(String str, int i, Typeface typeface, int i2) {
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
    public static void m118959Q0(final TextView textView, final int i) {
        textView.post(new Runnable() { // from class: l.c1b
            @Override // java.lang.Runnable
            public final void run() {
                e1b.m118965x0(textView, i);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX INFO: renamed from: R0 */
    public static String m118960R0(Message message) {
        String strConcat;
        if (message.recalled.booleanValue() && NullChecker.m82486a(message.extData) && !TextUtils.isEmpty(message.extData.recallText)) {
            return message.extData.recallText;
        }
        if (message.isMe()) {
            Application application = CoreModule.f18263b;
            return application.getString(R$string.f19219ej, application.getString(R$string.f19250fj));
        }
        if (gra.m131637V1() && message.isGroupMessage()) {
            ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(message.getHostId(), message.owner);
            if (NullChecker.m82486a(chatGroupMemberM32858W8)) {
                strConcat = chatGroupMemberM32858W8.groupMemberName();
            } else {
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.owner);
        if (TextUtils.isEmpty(strConcat) && NullChecker.m82486a(userM116503Pa)) {
            strConcat = userM116503Pa.name;
        }
        if (NullChecker.m82486a(userM116503Pa)) {
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(userM116503Pa.f56859id);
            if (!TextUtils.isEmpty(strM116634y7)) {
                strConcat = strM116634y7;
            }
        }
        if (gra.m131637V1() && message.isGroupMessage() && strConcat.length() > 8) {
            strConcat = strConcat.substring(0, 8).concat("…");
        }
        return CoreModule.f18263b.getString(R$string.f19219ej, strConcat);
    }

    /* JADX INFO: renamed from: S0 */
    public static CharSequence m118961S0(Act act, String str) {
        String str2 = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        SpannableString spannableString = new SpannableString(str2);
        Drawable drawable = act.getResources().getDrawable(dbc0.f86597Tc);
        drawable.setBounds(qa00.m175859d(8.0f), 0, drawable.getIntrinsicWidth() + qa00.m175859d(8.0f), drawable.getIntrinsicHeight());
        spannableString.setSpan(new v9l0(drawable), str2.length() - 1, str2.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: T0 */
    public static SpannableStringBuilder m118962T0(String str, String str2, int i, qcj<String, String> qcjVar) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            try {
                arrayList.add(matcher.group());
            } catch (IllegalStateException unused) {
            }
        }
        if (NullChecker.m82486a(qcjVar)) {
            str = qcjVar.call(str);
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
    public static String m118963U0(Spanned spanned) {
        return jyb.m147491V((s2i0[]) spanned.getSpans(0, spanned.length(), s2i0.class), ", ");
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m118965x0(TextView textView, int i) {
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
    public static SpannableStringBuilder m118966y0(Act act, SpannableStringBuilder spannableStringBuilder, @ColorInt int i, boolean z, boolean z2, @ColorInt int i2, String... strArr) {
        String string = z ? z2 ? act.getString(R$string.f18583Ji, act.string(R$string.f19361j8)) : act.getString(R$string.f19332i8, act.string(R$string.f19361j8)) : "\n \n" + act.getString(R$string.f19332i8, act.string(R$string.f19361j8));
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
            spannableStringBuilder2.setSpan(new C16678a(act, str2, strArr[i3 + 1], i2), str.indexOf(str2), str.indexOf(str2) + str2.length(), 33);
        }
        return spannableStringBuilder2;
    }

    /* JADX INFO: renamed from: z0 */
    public static int m118967z0(DoublePair doublePair) {
        com.p051p1.mobile.putong.location.Location locationM80048q = uqb0.f180370E.m80048q();
        if (doublePair == null || locationM80048q == null) {
            return 0;
        }
        com.p051p1.mobile.putong.location.Location location = new com.p051p1.mobile.putong.location.Location("me");
        location.m80008K(locationM80048q.m80014u());
        location.m80010M(locationM80048q.m80016x());
        com.p051p1.mobile.putong.location.Location location2 = new com.p051p1.mobile.putong.location.Location("other");
        location2.m80008K(doublePair.first);
        location2.m80010M(doublePair.second);
        return (int) location.m80011r(location2);
    }
}
