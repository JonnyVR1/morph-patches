package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.OMSAction;

/* JADX INFO: loaded from: classes11.dex */
public class ir90 extends c4k0 {
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        Act act = this.f79710a.f55069a;
        act.startActivity(ProfileAct.m51922q2(act, CoreModule.m30929H().userId(), "photochange", false, true));
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "profile/edit";
    }
}
