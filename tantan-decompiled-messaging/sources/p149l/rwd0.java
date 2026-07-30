package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class rwd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m181389e(Act act, List list) {
        if (vwb.m200296J(list)) {
            act.startActivity(NewMainAct.m39685I5(act, NavigationIntent.get(NavigationIntent.menu)));
        } else {
            act.startActivity(MessagesAct.m48943i2(act, ((Conversation) list.get(0)).f56011id, false, false));
        }
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final Act act = (Act) w2e0Var.m201094b();
        if (NullChecker.m81303a(act) && TextUtils.equals("/latestMatchIM", w2e0Var.m201099g())) {
            act.duringCreated(CoreModule.f17545c.f19642f0.m32816Tm()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.qwd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    rwd0.m181389e(act, (List) obj);
                }
            }));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
