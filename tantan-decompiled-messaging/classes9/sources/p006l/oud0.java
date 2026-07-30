package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.group.GroupSetAct;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.tbk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oud0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m20743e(Act act, w2e0 w2e0Var, String str, Conversation conversation) {
        if (NullChecker.a(conversation)) {
            if (TEnum.equals(conversation.status, "blocked")) {
                lsi0.w(R$string.f2949u1);
            } else {
                act.startActivity(GroupSetAct.Z1(w2e0Var.m26156b(), ((DbObject) conversation).id, str));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m20744f(Act act, Conversation conversation) {
        if (NullChecker.a(conversation)) {
            act.startActivity(MessagesAct.i2(act, ((DbObject) conversation).id, false, false));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(final w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!upa.m25404V1()) {
            return null;
        }
        String strReplaceFirst = !TextUtils.isEmpty(w2e0Var.m26161g()) ? w2e0Var.m26161g().replaceFirst("/", "") : null;
        if ("notification".equals(strReplaceFirst)) {
            return tbk.g(w2e0Var.m26156b());
        }
        if ("chat".equals(strReplaceFirst)) {
            String str = w2e0Var.m26160f().get("groupId");
            final Act actM26156b = w2e0Var.m26156b();
            actM26156b.duringCreated(CoreModule.f1534c.f3631f0.m4546Dg(str)).take(1).subscribe(mkd0.G(new e30() { // from class: l.mud0
                public final void call(Object obj) {
                    oud0.m20744f(actM26156b, (Conversation) obj);
                }
            }));
            return null;
        }
        if ("square".equals(strReplaceFirst)) {
            return NewMainAct.J5(w2e0Var.m26156b(), NavigationIntent.get("cards"), NavigationCardIntent.get("group_chat"));
        }
        if ("setting".equals(strReplaceFirst)) {
            final String str2 = w2e0Var.m26160f().get("groupId");
            ChatGroup chatGroupM3850s6 = CoreModule.f1534c.f3634g0.m3850s6(str2);
            if (NullChecker.a(chatGroupM3850s6) && TEnum.equals(chatGroupM3850s6.status, "disbanded")) {
                lsi0.w(R$string.f1557A1);
                return null;
            }
            final Act actM26156b2 = w2e0Var.m26156b();
            actM26156b2.duringCreated(CoreModule.f1534c.f3631f0.m4546Dg(str2)).take(1).subscribe(mkd0.G(new e30() { // from class: l.nud0
                public final void call(Object obj) {
                    oud0.m20743e(actM26156b2, w2e0Var, str2, (Conversation) obj);
                }
            }));
        }
        return null;
    }
}
