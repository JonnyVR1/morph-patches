package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.OMSAction;

/* JADX INFO: loaded from: classes11.dex */
public class jmi0 extends zuj0 {
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        Act act = this.f204856a.f54221a;
        act.startActivity(ProfileAct.m50738p2(act, CoreModule.m29931H().userId(), CoreStaticData.ProfileFromType.FROM_THIN_POPUP, false, true));
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "thin_profile";
    }
}
