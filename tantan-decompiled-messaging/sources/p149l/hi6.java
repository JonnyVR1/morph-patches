package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.MessageView;
import com.p046p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p046p1.mobile.putong.core.data.StateData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class hi6 {

    /* JADX INFO: renamed from: b */
    public static final hi6 f107872b = new hi6();

    /* JADX INFO: renamed from: a */
    public boolean f107873a = false;

    /* JADX INFO: renamed from: d */
    public static CharSequence m131199d(String str) {
        return new SpannableStringBuilder(Html.fromHtml(str));
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m131200e(CharSequence charSequence) {
        return m131201f(charSequence, upa.m194847z() ? Color.parseColor("#4d4d4d") : App.f15369e.getResources().getColor(w0c0.f183883r1));
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m131201f(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: g */
    public static hi6 m131202g() {
        return f107872b;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m131203k(pi6 pi6Var) {
        return "fake_conversation_local_summary_marriage_conversation".equals(pi6Var.f149101a.f56011id);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m131204m(pi6 pi6Var) {
        boolean zIsFemale = pi6Var.f149102b.isFemale();
        Act act = pi6Var.f149124x;
        return m131201f(zIsFemale ? act.getString(R$string.f17928M1) : act.getString(R$string.f17958N1), pi6Var.f149124x.getResources().getColor(w0c0.f183773I));
    }

    /* JADX INFO: renamed from: a */
    public final String m131205a(long j) {
        this.f107873a = true;
        return CoreModule.f17545c.f19685t1.m31507k(j);
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m131208h(pi6 pi6Var, Message message) {
        Conversation conversation;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        StateData stateData;
        this.f107873a = false;
        CharSequence charSequenceM181729I0 = rza.m181729I0(message, pi6Var.f149101a);
        if (NullChecker.m81303a(message) && NullChecker.m81303a(message.extData) && TEnum.equals(message.messageType, MessageType.moment_user_state) && (((bool3 = message.recalled) == null || !bool3.booleanValue()) && !message.isOtherUser())) {
            try {
                stateData = StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if ((stateData == null || !TextUtils.equals(stateData.sourceFlag, "chatPartners")) && (!NullChecker.m81303a(stateData) || pi6Var.f149101a.f20374mm < 1 || !NullChecker.m81303a(CoreModule.m29934N().mo60276Gc()) || !TextUtils.equals(CoreModule.m29934N().mo60276Gc().emotion.f38748id, stateData.emotionId))) {
                charSequenceM181729I0 = "";
            }
        }
        if (charSequenceM181729I0 instanceof String) {
            charSequenceM181729I0 = m131200e(charSequenceM181729I0);
        }
        CharSequence charSequenceM131206b = m131206b(charSequenceM181729I0, pi6Var, message);
        if (!TextUtils.isEmpty(charSequenceM131206b)) {
            charSequenceM181729I0 = m131200e(charSequenceM131206b);
        }
        CharSequence charSequenceM131207c = m131207c(charSequenceM181729I0, pi6Var, message);
        if (!TextUtils.isEmpty(charSequenceM131207c)) {
            charSequenceM181729I0 = m131200e(charSequenceM131207c);
        }
        if (NullChecker.m81303a(message) && User.isTeamAccount(message.owner) && !(charSequenceM181729I0 instanceof SpannableStringBuilder)) {
            charSequenceM181729I0 = m131200e(m131199d(charSequenceM181729I0.toString().replaceAll(SignParameters.NEW_LINE, "<br/>")));
        }
        if (NullChecker.m81303a(message) && message.isOtherUser() && message.createdTime == Math.abs(pi6Var.f149101a.localBotheringTime) && TEnum.equals(pi6Var.f149102b.gender, "male") && TEnum.equals(pi6Var.f149103c.gender, "female") && (TEnum.equals(message.messageType, "moment_comment") || (!TEnum.equals(message.messageType, "moment_comment") && TEnum.equals(pi6Var.f149102b.gender, "male") && TEnum.equals(pi6Var.f149103c.gender, "female")))) {
            StringBuilder sb = new StringBuilder("← ");
            sb.append(pi6Var.f149124x.getString(pi6Var.f149101a.localBotheringTime < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? R$string.f18887ri : R$string.f18947ti));
            charSequenceM181729I0 = m131200e(ddj0.m111022c(sb.toString()));
        }
        if (pi6Var.f149088D.m178926i0(pi6Var.f149101a)) {
            try {
                String str = CoreModule.f17545c.f19639e0.f149482u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(pi6Var.f149101a.f56011id, 0L);
                if (pi6Var.f149088D.m178920b0(pi6Var.f149101a.f56011id, str) && jOptLong != 0 && mqi0.m155944o() < jOptLong) {
                    CharSequence charSequenceM131209i = m131209i(pi6Var);
                    if (!jji0.m141806b(charSequenceM131209i)) {
                        charSequenceM181729I0 = m131200e(charSequenceM131209i);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (pi6Var.f149088D.m178913X(pi6Var.f149101a)) {
            charSequenceM181729I0 = m131200e(m131211l(pi6Var, charSequenceM181729I0));
        }
        if (!NullChecker.m81303a(message) && r6n.m178067f().f157965m.get().contains(pi6Var.f149102b.f56011id) && !pi6Var.f149101a.localEverHasMessage) {
            boolean zIsFemale = pi6Var.f149102b.isFemale();
            Act act = pi6Var.f149124x;
            charSequenceM181729I0 = m131201f(zIsFemale ? act.getString(R$string.f17928M1) : act.getString(R$string.f17958N1), pi6Var.f149124x.getResources().getColor(w0c0.f183773I));
        }
        if (NullChecker.m81303a(message) && zb0.m217811h(message.owner)) {
            charSequenceM181729I0 = m131201f(pi6Var.f149124x.string(R$string.f17806I), pi6Var.f149124x.getResources().getColor(w0c0.f183773I));
        }
        if (NullChecker.m81303a(message) && NullChecker.m81303a(pi6Var.f149101a) && TextUtils.equals(pi6Var.f149101a.convType, ConversationType.fake_one_side_no_match) && !TextUtils.isEmpty(message.msgData)) {
            CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
            if (NullChecker.m81303a(commonDoubleTitleIconClickList) && !vwb.m200296J(commonDoubleTitleIconClickList.msgData)) {
                String str2 = commonDoubleTitleIconClickList.msgData.get(0).subtitle;
                if (!TextUtils.isEmpty(str2)) {
                    charSequenceM181729I0 = m131200e(str2);
                }
            }
        }
        if (ruy.m181215g().m181221i(pi6Var.f149102b, pi6Var.f149103c) && NullChecker.m81303a(pi6Var.f149101a) && TEnum.equals(pi6Var.f149101a.property.chatInterrupt.stage, "locked") && NullChecker.m81303a(message) && !TextUtils.equals(message.owner, CoreModule.m29931H().userId())) {
            charSequenceM181729I0 = m131201f(pi6Var.f149124x.getResources().getString(R$string.f17645Ci), pi6Var.f149124x.getResources().getColor(w0c0.f183773I));
        }
        if (NullChecker.m81303a(message) && ((TEnum.equals(message.messageType(), MessageType.picture_text_style) || TEnum.equals(message.messageType(), MessageType.moment_inspire) || TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2)) && (bool2 = message.recalled) != null && bool2 != Boolean.TRUE)) {
            if (TEnum.equals(message.messageType(), MessageType.monetization_buy) || TEnum.equals(message.messageType(), MessageType.monetization_buy_v2)) {
                charSequenceM181729I0 = m131200e(pi6Var.f149124x.getResources().getText(R$string.f18955tq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    MessageView messageView = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData).view;
                    if (messageView != null) {
                        charSequenceM181729I0 = m131200e(messageView.text);
                    }
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
        if (NullChecker.m81303a(message) && TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance) && (bool = message.recalled) != null && bool != Boolean.TRUE) {
            if (TEnum.equals(message.messageType(), MessageType.monetization_pending_payment_guidance)) {
                charSequenceM181729I0 = m131200e(pi6Var.f149124x.getResources().getText(R$string.f18955tq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    PendingPaymentGuidance pendingPaymentGuidance = PendingPaymentGuidance.JSON_ADAPTER.parse(message.msgData);
                    if (NullChecker.m81303a(pendingPaymentGuidance) && !TextUtils.isEmpty(pendingPaymentGuidance.paymentFailMsg)) {
                        charSequenceM181729I0 = m131200e(pendingPaymentGuidance.paymentFailMsg);
                    }
                } catch (Exception e2) {
                    CrashHelper.m81296c(e2);
                }
            }
        }
        if (NullChecker.m81303a(message) && TEnum.equals(message.messageType(), MessageType.chatroom_share) && !zb0.m217811h(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            if (qib0.f154713b0.f139232c.mo67271lp()) {
                try {
                    String strOptString = new JSONObject(message.msgData).optString("title");
                    if (!TextUtils.isEmpty(strOptString)) {
                        charSequenceM181729I0 = m131200e(strOptString);
                    }
                } catch (Exception e3) {
                    CrashHelper.m81296c(e3);
                }
            } else {
                charSequenceM181729I0 = CoreModule.f17544b.getResources().getString(R$string.f18955tq);
            }
        }
        if (NullChecker.m81303a(pi6Var.f149101a) && TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            return m131204m(pi6Var);
        }
        if (pi6Var.f149088D.m178886A0(pi6Var.f149101a)) {
            charSequenceM181729I0 = m131200e(m131205a(pi6Var.f149101a.property.loveScript.expireTime - mqi0.m155944o()) + " 后失效");
        }
        if (pi6Var.f149088D.m178897L0(pi6Var, message)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            if (pi6Var.f149088D.m178937s(message)) {
                spannableStringBuilder.append(m131200e("以图换图"));
            } else {
                spannableStringBuilder.append(m131200e("发来图片想和你交换"));
            }
            if (m131210j(charSequenceM181729I0)) {
                spannableStringBuilder.append((CharSequence) " · ").append(charSequenceM181729I0);
            }
            charSequenceM181729I0 = spannableStringBuilder;
        }
        if (pi6Var.f149088D.m178932o0(pi6Var, message)) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            if (message.isMe()) {
                spannableStringBuilder2.append(m131200e("限时快拍"));
            } else {
                spannableStringBuilder2.append(m131200e("限时内未查看将过期"));
            }
            if (m131210j(charSequenceM181729I0)) {
                spannableStringBuilder2.append((CharSequence) " · ").append(charSequenceM181729I0);
            }
            charSequenceM181729I0 = spannableStringBuilder2;
        }
        if ((TextUtils.isEmpty(charSequenceM181729I0) && pi6Var.f149088D.m178905S(pi6Var.f149101a)) || (NullChecker.m81303a(message) && message.isMe() && TEnum.equals(message.messageType(), "prologue") && pi6Var.f149088D.m178929l(pi6Var.f149101a))) {
            charSequenceM181729I0 = pi6Var.f149101a.property.conversationTag.guide;
        }
        if (m131203k(pi6Var) && message != null && !CoreModule.m29931H().userId().equals(message.owner)) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(pi6Var.f149102b.f56011id);
            charSequenceM181729I0 = TextUtils.isEmpty(strM169561y7) ? spannableStringBuilder3.append((CharSequence) pi6Var.f149102b.name).append((CharSequence) "：").append(charSequenceM181729I0) : spannableStringBuilder3.append((CharSequence) strM169561y7).append((CharSequence) "：").append(charSequenceM181729I0);
        }
        if (m131203k(pi6Var) && TextUtils.isEmpty(charSequenceM181729I0) && (conversation = pi6Var.f149099O) != null) {
            charSequenceM181729I0 = pi6Var.f149124x.getString(R$string.f19036wh, mqi0.m155932G(conversation.createdTime));
        }
        if (CoreModule.m29935P().m94656g().mo35054d9() && !xma.m210047L3() && TextUtils.equals(pi6Var.f149101a.f56011id, C4740g.f19836Y2)) {
            charSequenceM181729I0 = m131200e(String.format("点击查看%s的近期活跃状态", pi6Var.f149102b.isFemale() ? "她" : "他"));
        }
        if (NullChecker.m81303a(message) && TEnum.equals(message.messageType(), MessageType.icebreak_qa) && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.iceBreakingQA)) {
            return (message.isMe() || LoveLetterMessageState.replied.equals(message.additionalData.iceBreakingQA.state)) ? message.additionalData.iceBreakingQA.answer : String.format("回答后揭晓%s的答案", pi6Var.f149102b.getPronoun());
        }
        return charSequenceM181729I0;
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m131209i(pi6 pi6Var) {
        String str;
        HashSet<String> hashSet = CoreModule.f17545c.f19639e0.f149447p3.get();
        HashSet<String> hashSet2 = CoreModule.f17545c.f19639e0.f149454q3.get();
        if (!hashSet.contains(pi6Var.f149101a.f56011id) || hashSet2.contains(pi6Var.f149101a.f56011id)) {
            return "";
        }
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(pi6Var.f149101a.f56011id);
        if (!NullChecker.m81303a(userM169524oa)) {
            return "";
        }
        if (mqi0.m155953x(6, 12)) {
            str = String.format("早上好 · %s", userM169524oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m155953x(12, 14)) {
            str = String.format("中午好 · %s", userM169524oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m155953x(14, 18)) {
            str = String.format("下午好 · %s", userM169524oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m155953x(18, 22)) {
            str = String.format("晚上好 · %s", userM169524oa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m155953x(22, 6)) {
            str = String.format("夜深了 · %s", userM169524oa.isFemale() ? "提醒她早睡" : "提醒他早睡");
        } else {
            str = "早上好 · 跟他打个招呼";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(null, 1, t100.m186890d(13.0f), ColorStateList.valueOf(pi6Var.f149124x.getResources().getColor(w0c0.f183888t0)), null), 0, 6, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public boolean m131210j(CharSequence charSequence) {
        return this.f107873a && !TextUtils.isEmpty(charSequence) && charSequence.toString().split(":").length >= 2;
    }

    /* JADX INFO: renamed from: l */
    public final SpannableStringBuilder m131211l(pi6 pi6Var, CharSequence charSequence) {
        long jM155944o = (long) (pi6Var.f149101a.additional.pinChat.expireTime - mqi0.m155944o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m131205a(jM155944o));
        spannableStringBuilder.append((CharSequence) "后失效 · ").append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m131206b(CharSequence charSequence, pi6 pi6Var, Message message) {
        return charSequence;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m131207c(CharSequence charSequence, pi6 pi6Var, Message message) {
        return charSequence;
    }
}
