package p153l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class ihk {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m140009b(TextView textView, Message message, Conversation conversation, boolean z, Act act, x20 x20Var, pf60 pf60Var) {
        int i;
        int i2;
        textView.setText("");
        ChatGroupMember chatGroupMember = (ChatGroupMember) pf60Var.f152157b;
        boolean z2 = false;
        boolean zBooleanValue = NullChecker.m82486a(message.recalled) ? message.recalled.booleanValue() : false;
        boolean z3 = message.isMe() || zBooleanValue;
        if (!TextUtils.isEmpty(conversation.group.latestNotificationMsgId) && NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33762Oo(conversation.group.latestNotificationMsgId)) && !zBooleanValue) {
            z2 = true;
        }
        if (NullChecker.m82486a(chatGroupMember)) {
            if (!z || (i2 = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(z3 ? m140014g(message, conversation) : String.format("%1$s: %2$s", jek.m144583o(chatGroupMember.groupMemberName()), m140014g(message, conversation)));
            } else {
                textView.setText(String.format(z3 ? "[%1$s]%2$s%3$s" : "[%1$s]%2$s: %3$s", act.getString(R$string.f21621V2, a9g0.m96571f(i2)), z3 ? "" : jek.m144583o(chatGroupMember.groupMemberName()), m140014g(message, conversation)));
            }
            m140013f(textView, conversation, null);
        } else {
            if (!z || (i = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(m140014g(message, conversation));
            } else {
                textView.setText(String.format("[%1$s] %2$s", act.getString(R$string.f21621V2, a9g0.m96571f(i)), m140014g(message, conversation)));
            }
            m140013f(textView, conversation, null);
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m140011d(TextView textView, bkj0 bkj0Var, Message message, Conversation conversation, boolean z, Act act, x20 x20Var, bkj0 bkj0Var2) {
        SpannableStringBuilder spannableStringBuilderM175796b0;
        textView.setText("");
        CharSequence charSequenceM50238g = C8687b.m50238g((User) bkj0Var2.f77081a, (ChatGroupMember) bkj0Var2.f77082b, (ChatGroupMember) bkj0Var2.f77083c, (String) bkj0Var.f77083c);
        CharSequence charSequence = charSequenceM50238g;
        if (message.isOtherUser() && ((ChatGroupMember) bkj0Var2.f77083c).isMe() && !conversation.muted) {
            charSequence = charSequenceM50238g;
            charSequence = charSequenceM50238g;
            long j = Long.MAX_VALUE;
            long j2 = Long.MIN_VALUE;
            try {
                j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
                if (!TextUtils.isEmpty(message.f56859id) && !message.f56859id.startsWith("fake_id_")) {
                    j2 = Long.parseLong(message.f56859id);
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            charSequence = charSequenceM50238g;
            if (j < j2) {
                spannableStringBuilderM175796b0 = q8g0.m175796b0(charSequenceM50238g.toString(), jyb.m147507f0(CoreModule.f18263b.getString(R$string.f21660a1)), -14606047, lyh0.m156283c(2));
                int iIndexOf = spannableStringBuilderM175796b0.toString().indexOf(CoreModule.f18263b.getString(R$string.f21660a1));
                int length = CoreModule.f18263b.getString(R$string.f21660a1).length() + iIndexOf;
                if (iIndexOf >= 0) {
                    charSequence = spannableStringBuilderM175796b0;
                    spannableStringBuilderM175796b0.setSpan(new StyleSpan(1), iIndexOf, length, 17);
                    charSequence = spannableStringBuilderM175796b0;
                }
            }
        }
        if (z && conversation.unreadMessages > 0 && TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            textView.setText(String.format("[%1$s] %2$s", act.getString(R$string.f21621V2, a9g0.m96571f(conversation.unreadMessages)), charSequence));
        } else {
            textView.setText(charSequence);
        }
        m140013f(textView, conversation, null);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ pf60 m140012e(ChatGroupMember chatGroupMember) {
        return new pf60(Boolean.FALSE, chatGroupMember);
    }

    /* JADX INFO: renamed from: f */
    public static void m140013f(TextView textView, Conversation conversation, Message message) {
        String string;
        if (NullChecker.m82486a(message) && !message.isMe() && !message.recalled.booleanValue()) {
            ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(message.getHostId(), message.owner);
            if (NullChecker.m82486a(chatGroupMemberM32858W8)) {
                String strGroupMemberName = chatGroupMemberM32858W8.groupMemberName();
                if (!TextUtils.isEmpty(strGroupMemberName)) {
                    textView.setText(jek.m144583o(strGroupMemberName) + ": " + ((Object) textView.getText()));
                }
            }
        }
        if (!NullChecker.m82486a(conversation.group) || TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            return;
        }
        Message messageM33762Oo = CoreModule.f18264c.f20384f0.m33762Oo(conversation.group.latestNotificationMsgId);
        if (!NullChecker.m82486a(messageM33762Oo) || messageM33762Oo.recalled.booleanValue()) {
            return;
        }
        List<String> list = messageM33762Oo.notifiedUsers;
        if (jyb.m147479J(list)) {
            return;
        }
        if (jyb.m147520m(list, new qcj() { // from class: l.ghk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, CoreModule.m30929H().userId()));
            }
        })) {
            string = CoreModule.f18263b.getString(R$string.f21613U2);
        } else {
            string = jyb.m147520m(list, new qcj() { // from class: l.hhk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "0"));
                }
            }) ? CoreModule.f18263b.getString(R$string.f21533K2) : null;
        }
        if (NullChecker.m82486a(string)) {
            textView.setText(c17.m107521n0(string.replace("[", "").replace(Constants.AES_SUFFIX, ""), textView.getText()));
        }
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m140014g(Message message, Conversation conversation) {
        return (NullChecker.m82486a(message.recalled) && message.recalled.booleanValue()) ? CoreModule.m30933P().m143412i().mo180378P5(message) : CoreModule.m30933P().m143412i().mo180359M0(message, conversation);
    }

    /* JADX INFO: renamed from: h */
    public static void m140015h(final TextView textView, Message message, final Conversation conversation, final boolean z, pol polVar, final Act act, @NonNull kcg0[] kcg0VarArr, final x20 x20Var) {
        final Message message2;
        Message message3 = Message.new_().equals(message) ? null : message;
        if (NullChecker.m82486a(kcg0VarArr[0]) && !kcg0VarArr[0].isUnsubscribed()) {
            psd0.m173633z(kcg0VarArr[0]);
        }
        if (!TextUtils.isEmpty(conversation.localDraft)) {
            textView.setText(c17.m107521n0(act.getString(R$string.f21879z4), conversation.localDraft));
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
            message2 = message3;
        } else if (NullChecker.m82486a(message3)) {
            String str = conversation.otherUser;
            if (TEnum.equals(message3.messageType, "tickle")) {
                message2 = message3;
                final bkj0<String, String, String> bkj0VarM50246o = C8687b.m50246o(message2);
                if (NullChecker.m82486a(bkj0VarM50246o)) {
                    kcg0VarArr[0] = polVar.mo68557c(act, psd0.m173626s(CoreModule.f18264c.f20381e0.m116491Ma(bkj0VarM50246o.f77081a).filter(new C20291td()), CoreModule.f18264c.f20387g0.m32847T6(str, bkj0VarM50246o.f77081a).filter(new hh7()), CoreModule.f18264c.f20387g0.m32847T6(str, bkj0VarM50246o.f77082b).filter(new hh7()), new ijq())).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.dhk
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            ihk.m140011d(textView, bkj0VarM50246o, message2, conversation, z, act, x20Var, (bkj0) obj);
                        }
                    }));
                } else {
                    textView.setText("");
                    m140013f(textView, conversation, message2);
                    if (NullChecker.m82486a(x20Var)) {
                        x20Var.call();
                    }
                }
            } else {
                final Message message4 = message3;
                C22421c c22421cMo68557c = polVar.mo68557c(act, TextUtils.equals("0", message4.owner) ? C22421c.just(new pf60(Boolean.FALSE, null)) : CoreModule.f18264c.f20387g0.m32847T6(str, message4.owner).map(new qcj() { // from class: l.ehk
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ihk.m140012e((ChatGroupMember) obj);
                    }
                }));
                y20 y20Var = new y20() { // from class: l.fhk
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ihk.m140009b(textView, message4, conversation, z, act, x20Var, (pf60) obj);
                    }
                };
                message2 = message4;
                kcg0VarArr[0] = c22421cMo68557c.subscribe(psd0.m173596G(y20Var));
            }
        } else {
            message2 = message3;
            textView.setText("");
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        }
        if (!NullChecker.m82486a(message2) || !TEnum.equals(message2.status(), "failed")) {
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = act.getResources().getDrawable(ibc0.f113977b0);
        drawable.setBounds(0, 0, qa00.m175859d(13.0f), qa00.m175859d(13.0f));
        textView.setCompoundDrawables(null, null, drawable, null);
    }
}
