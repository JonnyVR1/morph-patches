package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.OMSAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jmi0 extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        Act act = this.f23916a.f7827a;
        act.startActivity(ProfileAct.p2(act, CoreModule.H().userId(), "thin_popup", false, true));
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "thin_profile";
    }
}
