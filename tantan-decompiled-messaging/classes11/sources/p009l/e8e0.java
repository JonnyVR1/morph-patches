package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.OMSAction;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e8e0 extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        CoreModule.P().a().l1(this.f23916a.f7827a, NullChecker.a(oMSAction.params) ? (String) oMSAction.params.get("from") : "");
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "see/buy";
    }
}
