package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.OMSAction;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class e8e0 extends zuj0 {
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        CoreModule.m29935P().m94651a().mo33534l1(this.f204856a.f54221a, NullChecker.m81303a(oMSAction.params) ? oMSAction.params.get("from") : "");
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "see/buy";
    }
}
