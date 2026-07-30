package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class cfx {
    /* JADX INFO: renamed from: a */
    public static void m109657a(@NonNull Act act, @NonNull User user) {
        if (!CoreModule.m30930K().me_().isFemale()) {
            act.startActivityWithCustomTransition(MatchAct.m48747h2(act, jyb.m147507f0(user.f56859id), -1, null, null), new MatchAct.C8617b());
            return;
        }
        if (gra.m131722n3()) {
            pdi.m171817b0(act, user, false, "");
        } else if (gra.m131701j2()) {
            wgx.m206283A().m206311K(act, user, false);
        } else {
            pci.m171662K(act, user, -1);
        }
    }
}
