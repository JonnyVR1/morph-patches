package p153l;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.MessageView;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.StateData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class kj6 {

    /* JADX INFO: renamed from: b */
    public static final kj6 f127074b = new kj6();

    /* JADX INFO: renamed from: a */
    public boolean f127075a = false;

    /* JADX INFO: renamed from: d */
    public static CharSequence m150008d(String str) {
        return new SpannableStringBuilder(Html.fromHtml(str));
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m150009e(CharSequence charSequence) {
        return m150010f(charSequence, gra.m131778z() ? Color.parseColor("#4d4d4d") : App.f16088e.getResources().getColor(c9c0.f80456s1));
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m150010f(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: g */
    public static kj6 m150011g() {
        return f127074b;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m150012k(sj6 sj6Var) {
        return "fake_conversation_local_summary_marriage_conversation".equals(sj6Var.f168926a.f56859id);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m150013m(sj6 sj6Var) {
        boolean zIsFemale = sj6Var.f168927b.isFemale();
        Act act = sj6Var.f168949x;
        return m150010f(zIsFemale ? act.getString(R$string.f18658M1) : act.getString(R$string.f18688N1), sj6Var.f168949x.getResources().getColor(c9c0.f80342I));
    }

    /* JADX INFO: renamed from: a */
    public final String m150014a(long j) {
        this.f127075a = true;
        return CoreModule.f18264c.f20427t1.m32510k(j);
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m150017h(sj6 sj6Var, Message message) throws IOException {
        Conversation conversation;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        StateData stateData;
        this.f127075a = false;
        CharSequence charSequenceM118951I0 = e1b.m118951I0(message, sj6Var.f168926a);
        if (NullChecker.m82486a(message) && NullChecker.m82486a(message.extData) && TEnum.equals(message.messageType, MessageType.moment_user_state) && (((bool3 = message.recalled) == null || !bool3.booleanValue()) && !message.isOtherUser())) {
            try {
                stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if ((stateData == null || !TextUtils.equals(stateData.sourceFlag, "chatPartners")) && (!NullChecker.m82486a(stateData) || sj6Var.f168926a.f21116mm < 1 || !NullChecker.m82486a(CoreModule.m30932N().mo61460Gc()) || !TextUtils.equals(CoreModule.m30932N().mo61460Gc().emotion.f39596id, stateData.emotionId))) {
                charSequenceM118951I0 = "";
            }
        }
        if (charSequenceM118951I0 instanceof String) {
            charSequenceM118951I0 = m150009e(charSequenceM118951I0);
        }
        CharSequence charSequenceM150015b = m150015b(charSequenceM118951I0, sj6Var, message);
        if (!TextUtils.isEmpty(charSequenceM150015b)) {
            charSequenceM118951I0 = m150009e(charSequenceM150015b);
        }
        CharSequence charSequenceM150016c = m150016c(charSequenceM118951I0, sj6Var, message);
        if (!TextUtils.isEmpty(charSequenceM150016c)) {
            charSequenceM118951I0 = m150009e(charSequenceM150016c);
        }
        if (NullChecker.m82486a(message) && User.isTeamAccount(message.owner) && !(charSequenceM118951I0 instanceof SpannableStringBuilder)) {
            charSequenceM118951I0 = m150009e(m150008d(charSequenceM118951I0.toString().replaceAll(SignParameters.NEW_LINE, "<br/>")));
        }
        if (NullChecker.m82486a(message) && message.isOtherUser() && message.createdTime == Math.abs(sj6Var.f168926a.localBotheringTime) && TEnum.equals(sj6Var.f168927b.gender, "male") && TEnum.equals(sj6Var.f168928c.gender, "female") && (TEnum.equals(message.messageType, "moment_comment") || (!TEnum.equals(message.messageType, "moment_comment") && TEnum.equals(sj6Var.f168927b.gender, "male") && TEnum.equals(sj6Var.f168928c.gender, "female")))) {
            StringBuilder sb = new StringBuilder("← ");
            sb.append(sj6Var.f168949x.getString(sj6Var.f168926a.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? R$string.f18705Ni : R$string.f18765Pi));
            charSequenceM118951I0 = m150009e(hmj0.m135867c(sb.toString()));
        }
        if (sj6Var.f168913D.m195720i0(sj6Var.f168926a)) {
            try {
                String str = CoreModule.f18264c.f20381e0.f89339u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(sj6Var.f168926a.f56859id, 0L);
                if (sj6Var.f168913D.m195714b0(sj6Var.f168926a.f56859id, str) && jOptLong != 0 && pzi0.m174454o() < jOptLong) {
                    CharSequence charSequenceM150018i = m150018i(sj6Var);
                    if (!jsi0.m146843b(charSequenceM150018i)) {
                        charSequenceM118951I0 = m150009e(charSequenceM150018i);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (sj6Var.f168913D.m195707X(sj6Var.f168926a)) {
            charSequenceM118951I0 = m150009e(m150020l(sj6Var, charSequenceM118951I0));
        }
        if (!NullChecker.m82486a(message) && r8n.m180219f().f161739m.get().contains(sj6Var.f168927b.f56859id) && !sj6Var.f168926a.localEverHasMessage) {
            boolean zIsFemale = sj6Var.f168927b.isFemale();
            Act act = sj6Var.f168949x;
            charSequenceM118951I0 = m150010f(zIsFemale ? act.getString(R$string.f18658M1) : act.getString(R$string.f18688N1), sj6Var.f168949x.getResources().getColor(c9c0.f80342I));
        }
        if (NullChecker.m82486a(message) && vb0.m200646h(message.owner)) {
            charSequenceM118951I0 = m150010f(sj6Var.f168949x.string(R$string.f18533I), sj6Var.f168949x.getResources().getColor(c9c0.f80342I));
        }
        if (NullChecker.m82486a(message) && NullChecker.m82486a(sj6Var.f168926a) && TextUtils.equals(sj6Var.f168926a.convType, ConversationType.fake_one_side_no_match) && !TextUtils.isEmpty(message.msgData)) {
            CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
            if (NullChecker.m82486a(commonDoubleTitleIconClickList) && !jyb.m147479J(commonDoubleTitleIconClickList.msgData)) {
                String str2 = commonDoubleTitleIconClickList.msgData.get(0).subtitle;
                if (!TextUtils.isEmpty(str2)) {
                    charSequenceM118951I0 = m150009e(str2);
                }
            }
        }
        if (o3z.m165898g().m165904i(sj6Var.f168927b, sj6Var.f168928c) && NullChecker.m82486a(sj6Var.f168926a) && TEnum.equals(sj6Var.f168926a.property.chatInterrupt.stage, "locked") && NullChecker.m82486a(message) && !TextUtils.equals(message.owner, CoreModule.m30929H().userId())) {
            charSequenceM118951I0 = m150010f(sj6Var.f168949x.getResources().getString(R$string.f19035Yi), sj6Var.f168949x.getResources().getColor(c9c0.f80342I));
        }
        if (NullChecker.m82486a(message) && ((TEnum.equals(message.messageType(), MessageType.picture_text_style) || TEnum.equals(message.messageType(), MessageType.moment_inspire) || TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2)) && (bool2 = message.recalled) != null && bool2 != Boolean.TRUE)) {
            if (TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2)) {
                charSequenceM118951I0 = m150009e(sj6Var.f168949x.getResources().getText(R$string.f18743Oq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    MessageView messageView = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData).view;
                    if (messageView != null) {
                        charSequenceM118951I0 = m150009e(messageView.text);
                    }
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
        if (NullChecker.m82486a(message) && TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance) && (bool = message.recalled) != null && bool != Boolean.TRUE) {
            if (TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance)) {
                charSequenceM118951I0 = m150009e(sj6Var.f168949x.getResources().getText(R$string.f18743Oq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    PendingPaymentGuidance pendingPaymentGuidance = PendingPaymentGuidance.JSON_ADAPTER.parse(message.msgData);
                    if (NullChecker.m82486a(pendingPaymentGuidance) && !TextUtils.isEmpty(pendingPaymentGuidance.paymentFailMsg)) {
                        charSequenceM118951I0 = m150009e(pendingPaymentGuidance.paymentFailMsg);
                    }
                } catch (Exception e2) {
                    CrashHelper.m82479c(e2);
                }
            }
        }
        if (NullChecker.m82486a(message) && TEnum.equals(message.messageType(), MessageType.chatroom_share) && !vb0.m200646h(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            if (uqb0.f180396b0.f170326c.mo68454lp()) {
                try {
                    String strOptString = new JSONObject(message.msgData).optString("title");
                    if (!TextUtils.isEmpty(strOptString)) {
                        charSequenceM118951I0 = m150009e(strOptString);
                    }
                } catch (Exception e3) {
                    CrashHelper.m82479c(e3);
                }
            } else {
                charSequenceM118951I0 = CoreModule.f18263b.getResources().getString(R$string.f18743Oq);
            }
        }
        if (NullChecker.m82486a(sj6Var.f168926a) && TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            return m150013m(sj6Var);
        }
        if (sj6Var.f168913D.m195680A0(sj6Var.f168926a)) {
            charSequenceM118951I0 = m150009e(m150014a(sj6Var.f168926a.property.loveScript.expireTime - pzi0.m174454o()) + " 后失效");
        }
        if (sj6Var.f168913D.m195691L0(sj6Var, message)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            if (sj6Var.f168913D.m195731s(message)) {
                spannableStringBuilder.append(m150009e("以图换图"));
            } else {
                spannableStringBuilder.append(m150009e("发来图片想和你交换"));
            }
            if (m150019j(charSequenceM118951I0)) {
                spannableStringBuilder.append((CharSequence) " · ").append(charSequenceM118951I0);
            }
            charSequenceM118951I0 = spannableStringBuilder;
        }
        if (sj6Var.f168913D.m195726o0(sj6Var, message)) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            if (message.isMe()) {
                spannableStringBuilder2.append(m150009e("限时快拍"));
            } else {
                spannableStringBuilder2.append(m150009e("限时内未查看将过期"));
            }
            if (m150019j(charSequenceM118951I0)) {
                spannableStringBuilder2.append((CharSequence) " · ").append(charSequenceM118951I0);
            }
            charSequenceM118951I0 = spannableStringBuilder2;
        }
        if ((TextUtils.isEmpty(charSequenceM118951I0) && sj6Var.f168913D.m195699S(sj6Var.f168926a)) || (NullChecker.m82486a(message) && message.isMe() && TEnum.equals(message.messageType(), "prologue") && sj6Var.f168913D.m195723l(sj6Var.f168926a))) {
            charSequenceM118951I0 = sj6Var.f168926a.property.conversationTag.guide;
        }
        if (m150012k(sj6Var) && message != null && !CoreModule.m30929H().userId().equals(message.owner)) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(sj6Var.f168927b.f56859id);
            charSequenceM118951I0 = TextUtils.isEmpty(strM116634y7) ? spannableStringBuilder3.append((CharSequence) sj6Var.f168927b.name).append((CharSequence) "：").append(charSequenceM118951I0) : spannableStringBuilder3.append((CharSequence) strM116634y7).append((CharSequence) "：").append(charSequenceM118951I0);
        }
        if (m150012k(sj6Var) && TextUtils.isEmpty(charSequenceM118951I0) && (conversation = sj6Var.f168924O) != null) {
            charSequenceM118951I0 = sj6Var.f168949x.getString(R$string.f18824Rh, pzi0.m174442G(conversation.createdTime));
        }
        if (CoreModule.m30933P().m143410g().mo36057d9() && !joa.m146361M3() && TextUtils.equals(sj6Var.f168926a.f56859id, C4891g.f20578Y2)) {
            charSequenceM118951I0 = m150009e(String.format("点击查看%s的近期活跃状态", sj6Var.f168927b.isFemale() ? "她" : "他"));
        }
        if (NullChecker.m82486a(message) && TEnum.equals(message.messageType(), MessageType.icebreak_qa) && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.iceBreakingQA)) {
            return (message.isMe() || LoveLetterMessageState.replied.equals(message.additionalData.iceBreakingQA.state)) ? message.additionalData.iceBreakingQA.answer : String.format("回答后揭晓%s的答案", sj6Var.f168927b.getPronoun());
        }
        return charSequenceM118951I0;
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m150018i(sj6 sj6Var) {
        String str;
        HashSet<String> hashSet = CoreModule.f18264c.f20381e0.f89304p3.get();
        HashSet<String> hashSet2 = CoreModule.f18264c.f20381e0.f89311q3.get();
        if (!hashSet.contains(sj6Var.f168926a.f56859id) || hashSet2.contains(sj6Var.f168926a.f56859id)) {
            return "";
        }
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(sj6Var.f168926a.f56859id);
        if (!NullChecker.m82486a(userM116597oa)) {
            return "";
        }
        if (pzi0.m174463x(6, 12)) {
            str = String.format("早上好 · %s", userM116597oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (pzi0.m174463x(12, 14)) {
            str = String.format("中午好 · %s", userM116597oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (pzi0.m174463x(14, 18)) {
            str = String.format("下午好 · %s", userM116597oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (pzi0.m174463x(18, 22)) {
            str = String.format("晚上好 · %s", userM116597oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (pzi0.m174463x(22, 6)) {
            str = String.format("夜深了 · %s", userM116597oa.isFemale() ? "提醒她早睡" : "提醒他早睡");
        } else {
            str = "早上好 · 跟他打个招呼";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(null, 1, qa00.m175859d(13.0f), ColorStateList.valueOf(sj6Var.f168949x.getResources().getColor(c9c0.f80461u0)), null), 0, 6, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public boolean m150019j(CharSequence charSequence) {
        return this.f127075a && !TextUtils.isEmpty(charSequence) && charSequence.toString().split(":").length >= 2;
    }

    /* JADX INFO: renamed from: l */
    public final SpannableStringBuilder m150020l(sj6 sj6Var, CharSequence charSequence) {
        long jM174454o = (long) (sj6Var.f168926a.additional.pinChat.expireTime - pzi0.m174454o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m150014a(jM174454o));
        spannableStringBuilder.append((CharSequence) "后失效 · ").append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m150015b(CharSequence charSequence, sj6 sj6Var, Message message) {
        return charSequence;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m150016c(CharSequence charSequence, sj6 sj6Var, Message message) {
        return charSequence;
    }
}
