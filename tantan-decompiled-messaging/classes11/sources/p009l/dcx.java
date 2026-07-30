package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import l.abi;
import l.aci;
import l.upa;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dcx {
    /* JADX INFO: renamed from: a */
    public static void m13173a(@NonNull Act act, @NonNull User user) {
        if (!CoreModule.K().me_().isFemale()) {
            act.startActivityWithCustomTransition(MatchAct.g2(act, vwb.f0(new String[]{((DbObject) user).id}), -1, (ArrayList) null, (String) null), new MatchAct.b());
            return;
        }
        if (upa.n3()) {
            aci.b0(act, user, false, "");
        } else if (upa.j2()) {
            xdx.m24778A().m24806K(act, user, false);
        } else {
            abi.K(act, user, -1);
        }
    }
}
