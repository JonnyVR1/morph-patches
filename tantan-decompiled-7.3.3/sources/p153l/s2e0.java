package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupStatus;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Square;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupSetAct;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class s2e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m184118e(Act act, abe0 abe0Var, String str, Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            if (TEnum.equals(conversation.status, "blocked")) {
                o1j0.m165649w(R$string.f19695u1);
            } else {
                act.startActivity(GroupSetAct.m50308a2(abe0Var.m96739b(), conversation.f56859id, str));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m184119f(Act act, Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            act.startActivity(MessagesAct.m50126k2(act, conversation.f56859id, false, false));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(final abe0 abe0Var, z20<String, String> z20Var) {
        if (!gra.m131637V1()) {
            return null;
        }
        String strReplaceFirst = !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : null;
        if ("notification".equals(strReplaceFirst)) {
            return jek.m144575g(abe0Var.m96739b());
        }
        if ("chat".equals(strReplaceFirst)) {
            String str = abe0Var.m96743f().get("groupId");
            final Act act = (Act) abe0Var.m96739b();
            act.duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(str)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.q2e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s2e0.m184119f(act, (Conversation) obj);
                }
            }));
            return null;
        }
        if (Square.TYPE.equals(strReplaceFirst)) {
            return NewMainAct.m40699N5(abe0Var.m96739b(), NavigationIntent.get("cards"), NavigationCardIntent.get("group_chat"));
        }
        if ("setting".equals(strReplaceFirst)) {
            final String str2 = abe0Var.m96743f().get("groupId");
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(str2);
            if (NullChecker.m82486a(chatGroupM32923s6) && TEnum.equals(chatGroupM32923s6.status, ChatGroupStatus.disbanded)) {
                o1j0.m165649w(R$string.f18287A1);
                return null;
            }
            final Act act2 = (Act) abe0Var.m96739b();
            act2.duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(str2)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.r2e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    s2e0.m184118e(act2, abe0Var, str2, (Conversation) obj);
                }
            }));
        }
        return null;
    }
}
