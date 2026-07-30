package p009l;

import com.p1.mobile.putong.core.ui.verification.national.IntroductionAct;
import com.p1.mobile.putong.data.OMSAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class opl extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        this.f23916a.f7827a.startActivity(IntroductionAct.V1(this.f23916a.f7827a, "tantan_verification"));
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "idverification";
    }
}
