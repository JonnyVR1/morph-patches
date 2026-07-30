package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.OMSAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w5h0 extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        CoreModule.P().a().wr(this.f23916a.f7827a, "NA,NA,noMatchGuidePage", Privilege.see_who_likes_me);
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "svip_dialog";
    }
}
