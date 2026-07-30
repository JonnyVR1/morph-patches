package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.f30;
import l.mkd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rwd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23339e(Act act, List list) {
        if (vwb.J(list)) {
            act.startActivity(NewMainAct.I5(act, NavigationIntent.get("menu")));
        } else {
            act.startActivity(MessagesAct.i2(act, ((DbObject) ((Conversation) list.get(0))).id, false, false));
        }
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final Act actM26156b = w2e0Var.m26156b();
        if (NullChecker.a(actM26156b) && TextUtils.equals("/latestMatchIM", w2e0Var.m26161g())) {
            actM26156b.duringCreated(CoreModule.f1534c.f3631f0.m4746Tm()).take(1).subscribe(mkd0.G(new e30() { // from class: l.qwd0
                public final void call(Object obj) {
                    rwd0.m23339e(actM26156b, (List) obj);
                }
            }));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
