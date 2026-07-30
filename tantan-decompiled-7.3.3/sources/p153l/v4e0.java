package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class v4e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m199691e(Act act, List list) {
        if (jyb.m147479J(list)) {
            act.startActivity(NewMainAct.m40697M5(act, NavigationIntent.get(NavigationIntent.menu)));
        } else {
            act.startActivity(MessagesAct.m50126k2(act, ((Conversation) list.get(0)).f56859id, false, false));
        }
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        final Act act = (Act) abe0Var.m96739b();
        if (NullChecker.m82486a(act) && TextUtils.equals("/latestMatchIM", abe0Var.m96744g())) {
            act.duringCreated(CoreModule.f18264c.f20384f0.m33819Tm()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.u4e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    v4e0.m199691e(act, (List) obj);
                }
            }));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
