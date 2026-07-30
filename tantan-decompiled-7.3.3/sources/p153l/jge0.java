package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.OMSAction;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class jge0 extends c4k0 {
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        CoreModule.m30933P().m143405a().mo34537l1(this.f79710a.f55069a, NullChecker.m82486a(oMSAction.params) ? oMSAction.params.get("from") : "");
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "see/buy";
    }
}
