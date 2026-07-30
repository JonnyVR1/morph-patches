package p009l;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.CommonDoubleTitleIconClick;
import com.p1.mobile.putong.core.data.CommonDoubleTitleIconClickList;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageView;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.StateData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashSet;
import l.ddj0;
import l.jji0;
import l.qib0;
import l.ruy;
import l.rza;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.xma;
import l.zb0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hi6 {

    /* JADX INFO: renamed from: b */
    public static final hi6 f14130b = new hi6();

    /* JADX INFO: renamed from: a */
    public boolean f14131a = false;

    /* JADX INFO: renamed from: d */
    public static CharSequence m15841d(String str) {
        return new SpannableStringBuilder(Html.fromHtml(str));
    }

    /* JADX INFO: renamed from: e */
    public static CharSequence m15842e(CharSequence charSequence) {
        return m15843f(charSequence, upa.z() ? Color.parseColor("#4d4d4d") : App.e.getResources().getColor(w0c0.r1));
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m15843f(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: g */
    public static hi6 m15844g() {
        return f14130b;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15845k(pi6 pi6Var) {
        return "fake_conversation_local_summary_marriage_conversation".equals(((DbObject) pi6Var.f18622a).id);
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m15846m(pi6 pi6Var) {
        boolean zIsFemale = pi6Var.f18623b.isFemale();
        Act act = pi6Var.f18645x;
        return m15843f(zIsFemale ? act.getString(R.string.M1) : act.getString(R.string.N1), pi6Var.f18645x.getResources().getColor(w0c0.I));
    }

    /* JADX INFO: renamed from: a */
    public final String m15847a(long j) {
        this.f14131a = true;
        return CoreModule.c.t1.k(j);
    }

    /* JADX INFO: renamed from: h */
    public CharSequence m15850h(pi6 pi6Var, Message message) {
        Conversation conversation;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        StateData stateData;
        this.f14131a = false;
        CharSequence charSequenceI0 = rza.I0(message, pi6Var.f18622a);
        if (NullChecker.a(message) && NullChecker.a(message.extData) && TEnum.equals(message.messageType, "moment_user_state") && (((bool3 = message.recalled) == null || !bool3.booleanValue()) && !message.isOtherUser())) {
            try {
                stateData = (StateData) StateData.JSON_ADAPTER.parse(message.extData.extra);
            } catch (IOException unused) {
                stateData = null;
            }
            if ((stateData == null || !TextUtils.equals(stateData.sourceFlag, "chatPartners")) && (!NullChecker.a(stateData) || pi6Var.f18622a.mm < 1 || !NullChecker.a(CoreModule.N().Gc()) || !TextUtils.equals(CoreModule.N().Gc().emotion.id, stateData.emotionId))) {
                charSequenceI0 = "";
            }
        }
        if (charSequenceI0 instanceof String) {
            charSequenceI0 = m15842e(charSequenceI0);
        }
        CharSequence charSequenceM15848b = m15848b(charSequenceI0, pi6Var, message);
        if (!TextUtils.isEmpty(charSequenceM15848b)) {
            charSequenceI0 = m15842e(charSequenceM15848b);
        }
        CharSequence charSequenceM15849c = m15849c(charSequenceI0, pi6Var, message);
        if (!TextUtils.isEmpty(charSequenceM15849c)) {
            charSequenceI0 = m15842e(charSequenceM15849c);
        }
        if (NullChecker.a(message) && User.isTeamAccount(message.owner) && !(charSequenceI0 instanceof SpannableStringBuilder)) {
            charSequenceI0 = m15842e(m15841d(charSequenceI0.toString().replaceAll("\n", "<br/>")));
        }
        if (NullChecker.a(message) && message.isOtherUser() && message.createdTime == Math.abs(pi6Var.f18622a.localBotheringTime) && TEnum.equals(pi6Var.f18623b.gender, "male") && TEnum.equals(pi6Var.f18624c.gender, "female") && (TEnum.equals(message.messageType, "moment_comment") || (!TEnum.equals(message.messageType, "moment_comment") && TEnum.equals(pi6Var.f18623b.gender, "male") && TEnum.equals(pi6Var.f18624c.gender, "female")))) {
            StringBuilder sb = new StringBuilder("← ");
            sb.append(pi6Var.f18645x.getString(pi6Var.f18622a.localBotheringTime < 0.0d ? R.string.ri : R.string.ti));
            charSequenceI0 = m15842e(ddj0.c(sb.toString()));
        }
        if (pi6Var.f18609D.m21567i0(pi6Var.f18622a)) {
            try {
                String str = (String) CoreModule.c.e0.u3.get();
                long jOptLong = (!TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject()).optLong(((DbObject) pi6Var.f18622a).id, 0L);
                if (pi6Var.f18609D.m21561b0(((DbObject) pi6Var.f18622a).id, str) && jOptLong != 0 && mqi0.m18550o() < jOptLong) {
                    CharSequence charSequenceM15851i = m15851i(pi6Var);
                    if (!jji0.b(charSequenceM15851i)) {
                        charSequenceI0 = m15842e(charSequenceM15851i);
                    }
                }
            } catch (Exception unused2) {
            }
        }
        if (pi6Var.f18609D.m21554X(pi6Var.f18622a)) {
            charSequenceI0 = m15842e(m15853l(pi6Var, charSequenceI0));
        }
        if (!NullChecker.a(message) && ((HashSet) r6n.m21419f().f19667m.get()).contains(((DbObject) pi6Var.f18623b).id) && !pi6Var.f18622a.localEverHasMessage) {
            boolean zIsFemale = pi6Var.f18623b.isFemale();
            Act act = pi6Var.f18645x;
            charSequenceI0 = m15843f(zIsFemale ? act.getString(R.string.M1) : act.getString(R.string.N1), pi6Var.f18645x.getResources().getColor(w0c0.I));
        }
        if (NullChecker.a(message) && zb0.h(message.owner)) {
            charSequenceI0 = m15843f(pi6Var.f18645x.string(R.string.I), pi6Var.f18645x.getResources().getColor(w0c0.I));
        }
        if (NullChecker.a(message) && NullChecker.a(pi6Var.f18622a) && TextUtils.equals(pi6Var.f18622a.convType, "fake_one_side_no_match") && !TextUtils.isEmpty(message.msgData)) {
            CommonDoubleTitleIconClickList commonDoubleTitleIconClickList = CommonDoubleTitleIconClickList.parse(message.msgData);
            if (NullChecker.a(commonDoubleTitleIconClickList) && !vwb.J(commonDoubleTitleIconClickList.msgData)) {
                String str2 = ((CommonDoubleTitleIconClick) commonDoubleTitleIconClickList.msgData.get(0)).subtitle;
                if (!TextUtils.isEmpty(str2)) {
                    charSequenceI0 = m15842e(str2);
                }
            }
        }
        if (ruy.g().i(pi6Var.f18623b, pi6Var.f18624c) && NullChecker.a(pi6Var.f18622a) && TEnum.equals(pi6Var.f18622a.property.chatInterrupt.stage, "locked") && NullChecker.a(message) && !TextUtils.equals(message.owner, CoreModule.H().userId())) {
            charSequenceI0 = m15843f(pi6Var.f18645x.getResources().getString(R.string.Ci), pi6Var.f18645x.getResources().getColor(w0c0.I));
        }
        if (NullChecker.a(message) && ((TEnum.equals(message.messageType(), "picture_text_style") || TEnum.equals(message.messageType(), "moment_inspire") || TEnum.equals(message.messageType(), "monetization_buy") || TEnum.equals(message.messageType(), "monetization_buy_v2")) && (bool2 = message.recalled) != null && bool2 != Boolean.TRUE)) {
            if (TEnum.equals(message.messageType(), "monetization_buy") || TEnum.equals(message.messageType(), "monetization_buy_v2")) {
                charSequenceI0 = m15842e(pi6Var.f18645x.getResources().getText(R.string.tq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    MessageView messageView = ((DynamicSchemaMsgData) DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData)).view;
                    if (messageView != null) {
                        charSequenceI0 = m15842e(messageView.text);
                    }
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            }
        }
        if (NullChecker.a(message) && TEnum.equals(message.messageType(), "monetization_pending_payment_guidance") && (bool = message.recalled) != null && bool != Boolean.TRUE) {
            if (TEnum.equals(message.messageType(), "monetization_pending_payment_guidance")) {
                charSequenceI0 = m15842e(pi6Var.f18645x.getResources().getText(R.string.tq));
            } else if (!TextUtils.isEmpty(message.msgData)) {
                try {
                    PendingPaymentGuidance pendingPaymentGuidance = (PendingPaymentGuidance) PendingPaymentGuidance.JSON_ADAPTER.parse(message.msgData);
                    if (NullChecker.a(pendingPaymentGuidance) && !TextUtils.isEmpty(pendingPaymentGuidance.paymentFailMsg)) {
                        charSequenceI0 = m15842e(pendingPaymentGuidance.paymentFailMsg);
                    }
                } catch (Exception e2) {
                    CrashHelper.c(e2);
                }
            }
        }
        if (NullChecker.a(message) && TEnum.equals(message.messageType(), "chatroom_share") && !zb0.h(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            if (qib0.b0.c.m9056lp()) {
                try {
                    String strOptString = new JSONObject(message.msgData).optString("title");
                    if (!TextUtils.isEmpty(strOptString)) {
                        charSequenceI0 = m15842e(strOptString);
                    }
                } catch (Exception e3) {
                    CrashHelper.c(e3);
                }
            } else {
                charSequenceI0 = CoreModule.b.getResources().getString(R.string.tq);
            }
        }
        if (NullChecker.a(pi6Var.f18622a) && TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            return m15846m(pi6Var);
        }
        if (pi6Var.f18609D.m21527A0(pi6Var.f18622a)) {
            charSequenceI0 = m15842e(m15847a(pi6Var.f18622a.property.loveScript.expireTime - mqi0.m18550o()) + " 后失效");
        }
        if (pi6Var.f18609D.m21538L0(pi6Var, message)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            if (pi6Var.f18609D.m21578s(message)) {
                spannableStringBuilder.append(m15842e("以图换图"));
            } else {
                spannableStringBuilder.append(m15842e("发来图片想和你交换"));
            }
            if (m15852j(charSequenceI0)) {
                spannableStringBuilder.append((CharSequence) " · ").append(charSequenceI0);
            }
            charSequenceI0 = spannableStringBuilder;
        }
        if (pi6Var.f18609D.m21573o0(pi6Var, message)) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            if (message.isMe()) {
                spannableStringBuilder2.append(m15842e("限时快拍"));
            } else {
                spannableStringBuilder2.append(m15842e("限时内未查看将过期"));
            }
            if (m15852j(charSequenceI0)) {
                spannableStringBuilder2.append((CharSequence) " · ").append(charSequenceI0);
            }
            charSequenceI0 = spannableStringBuilder2;
        }
        if ((TextUtils.isEmpty(charSequenceI0) && pi6Var.f18609D.m21546S(pi6Var.f18622a)) || (NullChecker.a(message) && message.isMe() && TEnum.equals(message.messageType(), "prologue") && pi6Var.f18609D.m21570l(pi6Var.f18622a))) {
            charSequenceI0 = pi6Var.f18622a.property.conversationTag.guide;
        }
        if (m15845k(pi6Var) && message != null && !CoreModule.H().userId().equals(message.owner)) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            String strY7 = CoreModule.c.e0.y7(((DbObject) pi6Var.f18623b).id);
            charSequenceI0 = TextUtils.isEmpty(strY7) ? spannableStringBuilder3.append((CharSequence) pi6Var.f18623b.name).append((CharSequence) "：").append(charSequenceI0) : spannableStringBuilder3.append((CharSequence) strY7).append((CharSequence) "：").append(charSequenceI0);
        }
        if (m15845k(pi6Var) && TextUtils.isEmpty(charSequenceI0) && (conversation = pi6Var.f18620O) != null) {
            charSequenceI0 = pi6Var.f18645x.getString(R.string.wh, mqi0.m18538G(conversation.createdTime));
        }
        if (CoreModule.P().g().d9() && !xma.L3() && TextUtils.equals(((DbObject) pi6Var.f18622a).id, g.Y2)) {
            charSequenceI0 = m15842e(String.format("点击查看%s的近期活跃状态", pi6Var.f18623b.isFemale() ? "她" : "他"));
        }
        if (NullChecker.a(message) && TEnum.equals(message.messageType(), "icebreak_qa") && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.iceBreakingQA)) {
            return (message.isMe() || "replied".equals(message.additionalData.iceBreakingQA.state)) ? message.additionalData.iceBreakingQA.answer : String.format("回答后揭晓%s的答案", pi6Var.f18623b.getPronoun());
        }
        return charSequenceI0;
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m15851i(pi6 pi6Var) {
        String str;
        HashSet hashSet = (HashSet) CoreModule.c.e0.p3.get();
        HashSet hashSet2 = (HashSet) CoreModule.c.e0.q3.get();
        if (!hashSet.contains(((DbObject) pi6Var.f18622a).id) || hashSet2.contains(((DbObject) pi6Var.f18622a).id)) {
            return "";
        }
        User userOa = CoreModule.c.e0.oa(((DbObject) pi6Var.f18622a).id);
        if (!NullChecker.a(userOa)) {
            return "";
        }
        if (mqi0.m18559x(6, 12)) {
            str = String.format("早上好 · %s", userOa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m18559x(12, 14)) {
            str = String.format("中午好 · %s", userOa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m18559x(14, 18)) {
            str = String.format("下午好 · %s", userOa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m18559x(18, 22)) {
            str = String.format("晚上好 · %s", userOa.isFemale() ? "跟她打个招呼" : "跟他打个招呼");
        } else if (mqi0.m18559x(22, 6)) {
            str = String.format("夜深了 · %s", userOa.isFemale() ? "提醒她早睡" : "提醒他早睡");
        } else {
            str = "早上好 · 跟他打个招呼";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TextAppearanceSpan(null, 1, t100.d(13.0f), ColorStateList.valueOf(pi6Var.f18645x.getResources().getColor(w0c0.t0)), null), 0, 6, 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: j */
    public boolean m15852j(CharSequence charSequence) {
        return this.f14131a && !TextUtils.isEmpty(charSequence) && charSequence.toString().split(":").length >= 2;
    }

    /* JADX INFO: renamed from: l */
    public final SpannableStringBuilder m15853l(pi6 pi6Var, CharSequence charSequence) {
        long jM18550o = (long) (pi6Var.f18622a.additional.pinChat.expireTime - mqi0.m18550o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) m15847a(jM18550o));
        spannableStringBuilder.append((CharSequence) "后失效 · ").append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m15848b(CharSequence charSequence, pi6 pi6Var, Message message) {
        return charSequence;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m15849c(CharSequence charSequence, pi6 pi6Var, Message message) {
        return charSequence;
    }
}
