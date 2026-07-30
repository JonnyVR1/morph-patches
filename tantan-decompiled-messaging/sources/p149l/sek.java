package p149l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class sek {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m183664b(TextView textView, Message message, Conversation conversation, boolean z, Act act, d30 d30Var, j760 j760Var) {
        int i;
        int i2;
        textView.setText("");
        ChatGroupMember chatGroupMember = (ChatGroupMember) j760Var.f116565b;
        boolean z2 = false;
        boolean zBooleanValue = NullChecker.m81303a(message.recalled) ? message.recalled.booleanValue() : false;
        boolean z3 = message.isMe() || zBooleanValue;
        if (!TextUtils.isEmpty(conversation.group.latestNotificationMsgId) && NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32759Oo(conversation.group.latestNotificationMsgId)) && !zBooleanValue) {
            z2 = true;
        }
        if (NullChecker.m81303a(chatGroupMember)) {
            if (!z || (i2 = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(z3 ? m183669g(message, conversation) : String.format("%1$s: %2$s", tbk.m187868o(chatGroupMember.groupMemberName()), m183669g(message, conversation)));
            } else {
                textView.setText(String.format(z3 ? "[%1$s]%2$s%3$s" : "[%1$s]%2$s: %3$s", act.getString(R$string.f20879V2, t0g0.m186865f(i2)), z3 ? "" : tbk.m187868o(chatGroupMember.groupMemberName()), m183669g(message, conversation)));
            }
            m183668f(textView, conversation, null);
        } else {
            if (!z || (i = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(m183669g(message, conversation));
            } else {
                textView.setText(String.format("[%1$s] %2$s", act.getString(R$string.f20879V2, t0g0.m186865f(i)), m183669g(message, conversation)));
            }
            m183668f(textView, conversation, null);
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m183666d(TextView textView, xaj0 xaj0Var, Message message, Conversation conversation, boolean z, Act act, d30 d30Var, xaj0 xaj0Var2) {
        SpannableStringBuilder spannableStringBuilderM133861b0;
        textView.setText("");
        CharSequence charSequenceM49055g = C8524b.m49055g((User) xaj0Var2.f191751a, (ChatGroupMember) xaj0Var2.f191752b, (ChatGroupMember) xaj0Var2.f191753c, (String) xaj0Var.f191753c);
        CharSequence charSequence = charSequenceM49055g;
        if (message.isOtherUser() && ((ChatGroupMember) xaj0Var2.f191753c).isMe() && !conversation.muted) {
            charSequence = charSequenceM49055g;
            charSequence = charSequenceM49055g;
            long j = Long.MAX_VALUE;
            long j2 = Long.MIN_VALUE;
            try {
                j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
                if (!TextUtils.isEmpty(message.f56011id) && !message.f56011id.startsWith("fake_id_")) {
                    j2 = Long.parseLong(message.f56011id);
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
            charSequence = charSequenceM49055g;
            if (j < j2) {
                spannableStringBuilderM133861b0 = i0g0.m133861b0(charSequenceM49055g.toString(), vwb.m200324f0(CoreModule.f17544b.getString(R$string.f20918a1)), -14606047, eqh0.m117752c(2));
                int iIndexOf = spannableStringBuilderM133861b0.toString().indexOf(CoreModule.f17544b.getString(R$string.f20918a1));
                int length = CoreModule.f17544b.getString(R$string.f20918a1).length() + iIndexOf;
                if (iIndexOf >= 0) {
                    charSequence = spannableStringBuilderM133861b0;
                    spannableStringBuilderM133861b0.setSpan(new StyleSpan(1), iIndexOf, length, 17);
                    charSequence = spannableStringBuilderM133861b0;
                }
            }
        }
        if (z && conversation.unreadMessages > 0 && TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            textView.setText(String.format("[%1$s] %2$s", act.getString(R$string.f20879V2, t0g0.m186865f(conversation.unreadMessages)), charSequence));
        } else {
            textView.setText(charSequence);
        }
        m183668f(textView, conversation, null);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ j760 m183667e(ChatGroupMember chatGroupMember) {
        return new j760(Boolean.FALSE, chatGroupMember);
    }

    /* JADX INFO: renamed from: f */
    public static void m183668f(TextView textView, Conversation conversation, Message message) {
        String string;
        if (NullChecker.m81303a(message) && !message.isMe() && !message.recalled.booleanValue()) {
            ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(message.getHostId(), message.owner);
            if (NullChecker.m81303a(chatGroupMemberM31855W8)) {
                String strGroupMemberName = chatGroupMemberM31855W8.groupMemberName();
                if (!TextUtils.isEmpty(strGroupMemberName)) {
                    textView.setText(tbk.m187868o(strGroupMemberName) + ": " + ((Object) textView.getText()));
                }
            }
        }
        if (!NullChecker.m81303a(conversation.group) || TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            return;
        }
        Message messageM32759Oo = CoreModule.f17545c.f19642f0.m32759Oo(conversation.group.latestNotificationMsgId);
        if (!NullChecker.m81303a(messageM32759Oo) || messageM32759Oo.recalled.booleanValue()) {
            return;
        }
        List<String> list = messageM32759Oo.notifiedUsers;
        if (vwb.m200296J(list)) {
            return;
        }
        if (vwb.m200337m(list, new w9j() { // from class: l.qek
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, CoreModule.m29931H().userId()));
            }
        })) {
            string = CoreModule.f17544b.getString(R$string.f20871U2);
        } else {
            string = vwb.m200337m(list, new w9j() { // from class: l.rek
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "0"));
                }
            }) ? CoreModule.f17544b.getString(R$string.f20791K2) : null;
        }
        if (NullChecker.m81303a(string)) {
            textView.setText(zz6.m220997n0(string.replace("[", "").replace(Constants.AES_SUFFIX, ""), textView.getText()));
        }
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m183669g(Message message, Conversation conversation) {
        return (NullChecker.m81303a(message.recalled) && message.recalled.booleanValue()) ? CoreModule.m29935P().m94658i().mo158286P5(message) : CoreModule.m29935P().m94658i().mo158267M0(message, conversation);
    }

    /* JADX INFO: renamed from: h */
    public static void m183670h(final TextView textView, Message message, final Conversation conversation, final boolean z, dml dmlVar, final Act act, @NonNull c4g0[] c4g0VarArr, final d30 d30Var) {
        final Message message2;
        Message message3 = Message.new_().equals(message) ? null : message;
        if (NullChecker.m81303a(c4g0VarArr[0]) && !c4g0VarArr[0].isUnsubscribed()) {
            mkd0.m154992z(c4g0VarArr[0]);
        }
        if (!TextUtils.isEmpty(conversation.localDraft)) {
            textView.setText(zz6.m220997n0(act.getString(R$string.f21137z4), conversation.localDraft));
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
            message2 = message3;
        } else if (NullChecker.m81303a(message3)) {
            String str = conversation.otherUser;
            if (TEnum.equals(message3.messageType, "tickle")) {
                message2 = message3;
                final xaj0<String, String, String> xaj0VarM49063o = C8524b.m49063o(message2);
                if (NullChecker.m81303a(xaj0VarM49063o)) {
                    c4g0VarArr[0] = dmlVar.mo67374c(act, mkd0.m154985s(CoreModule.f17545c.f19639e0.m169418Ma(xaj0VarM49063o.f191751a).filter(new C21368yd()), CoreModule.f17545c.f19645g0.m31844T6(str, xaj0VarM49063o.f191751a).filter(new dg7()), CoreModule.f17545c.f19645g0.m31844T6(str, xaj0VarM49063o.f191752b).filter(new dg7()), new ihq())).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.nek
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            sek.m183666d(textView, xaj0VarM49063o, message2, conversation, z, act, d30Var, (xaj0) obj);
                        }
                    }));
                } else {
                    textView.setText("");
                    m183668f(textView, conversation, message2);
                    if (NullChecker.m81303a(d30Var)) {
                        d30Var.call();
                    }
                }
            } else {
                final Message message4 = message3;
                C22306c c22306cMo67374c = dmlVar.mo67374c(act, TextUtils.equals("0", message4.owner) ? C22306c.just(new j760(Boolean.FALSE, null)) : CoreModule.f17545c.f19645g0.m31844T6(str, message4.owner).map(new w9j() { // from class: l.oek
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return sek.m183667e((ChatGroupMember) obj);
                    }
                }));
                e30 e30Var = new e30() { // from class: l.pek
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        sek.m183664b(textView, message4, conversation, z, act, d30Var, (j760) obj);
                    }
                };
                message2 = message4;
                c4g0VarArr[0] = c22306cMo67374c.subscribe(mkd0.m154955G(e30Var));
            }
        } else {
            message2 = message3;
            textView.setText("");
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        }
        if (!NullChecker.m81303a(message2) || !TEnum.equals(message2.status(), "failed")) {
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = act.getResources().getDrawable(c3c0.f78702b0);
        drawable.setBounds(0, 0, t100.m186890d(13.0f), t100.m186890d(13.0f));
        textView.setCompoundDrawables(null, null, drawable, null);
    }
}
