package p003l;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.messages.C0107b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c3c0;
import l.dg7;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.t0g0;
import l.t100;
import l.vwb;
import l.xaj0;
import l.yd;
import l.zz6;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sek {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7561b(TextView textView, Message message, Conversation conversation, boolean z, Act act, d30 d30Var, j760 j760Var) {
        int i;
        int i2;
        textView.setText("");
        ChatGroupMember chatGroupMember = (ChatGroupMember) j760Var.b;
        boolean z2 = false;
        boolean zBooleanValue = NullChecker.a(message.recalled) ? message.recalled.booleanValue() : false;
        boolean z3 = message.isMe() || zBooleanValue;
        if (!TextUtils.isEmpty(conversation.group.latestNotificationMsgId) && NullChecker.a(CoreModule.c.f0.Oo(conversation.group.latestNotificationMsgId)) && !zBooleanValue) {
            z2 = true;
        }
        if (NullChecker.a(chatGroupMember)) {
            if (!z || (i2 = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(z3 ? m7566g(message, conversation) : String.format("%1$s: %2$s", tbk.m7721o(chatGroupMember.groupMemberName()), m7566g(message, conversation)));
            } else {
                textView.setText(String.format(z3 ? "[%1$s]%2$s%3$s" : "[%1$s]%2$s: %3$s", act.getString(R.string.V2, t0g0.f(i2)), z3 ? "" : tbk.m7721o(chatGroupMember.groupMemberName()), m7566g(message, conversation)));
            }
            m7565f(textView, conversation, null);
        } else {
            if (!z || (i = conversation.unreadMessages) <= 0 || z2) {
                textView.setText(m7566g(message, conversation));
            } else {
                textView.setText(String.format("[%1$s] %2$s", act.getString(R.string.V2, t0g0.f(i)), m7566g(message, conversation)));
            }
            m7565f(textView, conversation, null);
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7563d(TextView textView, xaj0 xaj0Var, Message message, Conversation conversation, boolean z, Act act, d30 d30Var, xaj0 xaj0Var2) {
        SpannableStringBuilder spannableStringBuilderB0;
        textView.setText("");
        CharSequence charSequenceM2153g = C0107b.m2153g((User) xaj0Var2.a, (ChatGroupMember) xaj0Var2.b, (ChatGroupMember) xaj0Var2.c, (String) xaj0Var.c);
        CharSequence charSequence = charSequenceM2153g;
        if (message.isOtherUser() && ((ChatGroupMember) xaj0Var2.c).isMe() && !conversation.muted) {
            charSequence = charSequenceM2153g;
            charSequence = charSequenceM2153g;
            long j = Long.MAX_VALUE;
            long j2 = Long.MIN_VALUE;
            try {
                j = !TextUtils.isEmpty(conversation.readUntil) ? Long.parseLong(conversation.readUntil) : 0L;
                if (!TextUtils.isEmpty(((DbObject) message).id) && !((DbObject) message).id.startsWith("fake_id_")) {
                    j2 = Long.parseLong(((DbObject) message).id);
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            charSequence = charSequenceM2153g;
            if (j < j2) {
                spannableStringBuilderB0 = i0g0.b0(charSequenceM2153g.toString(), vwb.f0(new String[]{CoreModule.b.getString(R.string.a1)}), -14606047, eqh0.m3924c(2));
                int iIndexOf = spannableStringBuilderB0.toString().indexOf(CoreModule.b.getString(R.string.a1));
                int length = CoreModule.b.getString(R.string.a1).length() + iIndexOf;
                if (iIndexOf >= 0) {
                    charSequence = spannableStringBuilderB0;
                    spannableStringBuilderB0.setSpan(new StyleSpan(1), iIndexOf, length, 17);
                    charSequence = spannableStringBuilderB0;
                }
            }
        }
        if (z && conversation.unreadMessages > 0 && TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            textView.setText(String.format("[%1$s] %2$s", act.getString(R.string.V2, t0g0.f(conversation.unreadMessages)), charSequence));
        } else {
            textView.setText(charSequence);
        }
        m7565f(textView, conversation, null);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ j760 m7564e(ChatGroupMember chatGroupMember) {
        return new j760(Boolean.FALSE, chatGroupMember);
    }

    /* JADX INFO: renamed from: f */
    public static void m7565f(TextView textView, Conversation conversation, Message message) {
        String string;
        if (NullChecker.a(message) && !message.isMe() && !message.recalled.booleanValue()) {
            ChatGroupMember chatGroupMemberW8 = CoreModule.c.g0.W8(message.getHostId(), message.owner);
            if (NullChecker.a(chatGroupMemberW8)) {
                String strGroupMemberName = chatGroupMemberW8.groupMemberName();
                if (!TextUtils.isEmpty(strGroupMemberName)) {
                    textView.setText(tbk.m7721o(strGroupMemberName) + ": " + ((Object) textView.getText()));
                }
            }
        }
        if (!NullChecker.a(conversation.group) || TextUtils.isEmpty(conversation.group.latestNotificationMsgId)) {
            return;
        }
        Message messageOo = CoreModule.c.f0.Oo(conversation.group.latestNotificationMsgId);
        if (!NullChecker.a(messageOo) || messageOo.recalled.booleanValue()) {
            return;
        }
        List list = messageOo.notifiedUsers;
        if (vwb.J(list)) {
            return;
        }
        if (vwb.m(list, new w9j() { // from class: l.qek
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals((String) obj, CoreModule.H().userId()));
            }
        })) {
            string = CoreModule.b.getString(R.string.U2);
        } else {
            string = vwb.m(list, new w9j() { // from class: l.rek
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals((String) obj, "0"));
                }
            }) ? CoreModule.b.getString(R.string.K2) : null;
        }
        if (NullChecker.a(string)) {
            textView.setText(zz6.n0(string.replace("[", "").replace("]", ""), textView.getText()));
        }
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m7566g(Message message, Conversation conversation) {
        return (NullChecker.a(message.recalled) && message.recalled.booleanValue()) ? CoreModule.P().i().P5(message) : CoreModule.P().i().M0(message, conversation);
    }

    /* JADX INFO: renamed from: h */
    public static void m7567h(final TextView textView, Message message, final Conversation conversation, final boolean z, dml dmlVar, final Act act, @NonNull c4g0[] c4g0VarArr, final d30 d30Var) {
        final Message message2;
        Message message3 = Message.new_().equals(message) ? null : message;
        if (NullChecker.a(c4g0VarArr[0]) && !c4g0VarArr[0].isUnsubscribed()) {
            mkd0.z(c4g0VarArr[0]);
        }
        if (!TextUtils.isEmpty(conversation.localDraft)) {
            textView.setText(zz6.n0(act.getString(R.string.z4), conversation.localDraft));
            if (NullChecker.a(d30Var)) {
                d30Var.call();
            }
            message2 = message3;
        } else if (NullChecker.a(message3)) {
            String str = conversation.otherUser;
            if (TEnum.equals(message3.messageType, "tickle")) {
                message2 = message3;
                final xaj0<String, String, String> xaj0VarM2161o = C0107b.m2161o(message2);
                if (NullChecker.a(xaj0VarM2161o)) {
                    c4g0VarArr[0] = dmlVar.mo3522c(act, mkd0.s(CoreModule.c.e0.Ma((String) xaj0VarM2161o.a).filter(new yd()), CoreModule.c.g0.T6(str, (String) xaj0VarM2161o.a).filter(new dg7()), CoreModule.c.g0.T6(str, (String) xaj0VarM2161o.b).filter(new dg7()), new ihq())).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.nek
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            sek.m7563d(textView, xaj0VarM2161o, message2, conversation, z, act, d30Var, (xaj0) obj);
                        }
                    }));
                } else {
                    textView.setText("");
                    m7565f(textView, conversation, message2);
                    if (NullChecker.a(d30Var)) {
                        d30Var.call();
                    }
                }
            } else {
                final Message message4 = message3;
                C1099c c1099cMo3522c = dmlVar.mo3522c(act, TextUtils.equals("0", message4.owner) ? C1099c.just(new j760(Boolean.FALSE, (Object) null)) : CoreModule.c.g0.T6(str, message4.owner).map(new w9j() { // from class: l.oek
                    @Override // p003l.w9j
                    public final Object call(Object obj) {
                        return sek.m7564e((ChatGroupMember) obj);
                    }
                }));
                e30 e30Var = new e30() { // from class: l.pek
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        sek.m7561b(textView, message4, conversation, z, act, d30Var, (j760) obj);
                    }
                };
                message2 = message4;
                c4g0VarArr[0] = c1099cMo3522c.subscribe((m250) mkd0.G(e30Var));
            }
        } else {
            message2 = message3;
            textView.setText("");
            if (NullChecker.a(d30Var)) {
                d30Var.call();
            }
        }
        if (!NullChecker.a(message2) || !TEnum.equals(message2.status(), "failed")) {
            textView.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = act.getResources().getDrawable(c3c0.b0);
        drawable.setBounds(0, 0, t100.d(13.0f), t100.d(13.0f));
        textView.setCompoundDrawables(null, null, drawable, null);
    }
}
