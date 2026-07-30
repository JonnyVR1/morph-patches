package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class dcx {
    /* JADX INFO: renamed from: a */
    public static void m110886a(@NonNull Act act, @NonNull User user) {
        if (!CoreModule.m29932K().me_().isFemale()) {
            act.startActivityWithCustomTransition(MatchAct.m47564g2(act, vwb.m200324f0(user.f56011id), -1, null, null), new MatchAct.C8454b());
            return;
        }
        if (upa.m194791n3()) {
            aci.m95751b0(act, user, false, "");
        } else if (upa.m194770j2()) {
            xdx.m208433A().m208461K(act, user, false);
        } else {
            abi.m95623K(act, user, -1);
        }
    }
}
