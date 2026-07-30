package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupStatus;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Square;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupSetAct;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class oud0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m165984e(Act act, w2e0 w2e0Var, String str, Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            if (TEnum.equals(conversation.status, "blocked")) {
                lsi0.m151593w(R$string.f18960u1);
            } else {
                act.startActivity(GroupSetAct.m49125Z1(w2e0Var.m201094b(), conversation.f56011id, str));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m165985f(Act act, Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            act.startActivity(MessagesAct.m48943i2(act, conversation.f56011id, false, false));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(final w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!upa.m194706V1()) {
            return null;
        }
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : null;
        if ("notification".equals(strReplaceFirst)) {
            return tbk.m187860g(w2e0Var.m201094b());
        }
        if ("chat".equals(strReplaceFirst)) {
            String str = w2e0Var.m201098f().get("groupId");
            final Act act = (Act) w2e0Var.m201094b();
            act.duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(str)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.mud0
                @Override // p149l.e30
                public final void call(Object obj) {
                    oud0.m165985f(act, (Conversation) obj);
                }
            }));
            return null;
        }
        if (Square.TYPE.equals(strReplaceFirst)) {
            return NewMainAct.m39687J5(w2e0Var.m201094b(), NavigationIntent.get("cards"), NavigationCardIntent.get("group_chat"));
        }
        if ("setting".equals(strReplaceFirst)) {
            final String str2 = w2e0Var.m201098f().get("groupId");
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(str2);
            if (NullChecker.m81303a(chatGroupM31920s6) && TEnum.equals(chatGroupM31920s6.status, ChatGroupStatus.disbanded)) {
                lsi0.m151593w(R$string.f17568A1);
                return null;
            }
            final Act act2 = (Act) w2e0Var.m201094b();
            act2.duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(str2)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.nud0
                @Override // p149l.e30
                public final void call(Object obj) {
                    oud0.m165984e(act2, w2e0Var, str2, (Conversation) obj);
                }
            }));
        }
        return null;
    }
}
