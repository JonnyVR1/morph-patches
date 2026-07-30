package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.d30;
import l.e9n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wgj extends y5l {
    public wgj(String str, boolean z) {
        super(str, z);
    }

    @Override // p009l.y5l
    /* JADX INFO: renamed from: d */
    public boolean mo14564d(final z5l.C1346a c1346a) {
        e9n.z(c1346a.m25611a(), CoreModule.c.e0.p9(), new d30() { // from class: l.vgj
            public final void call() {
                c.I1(c1346a.m25611a(), "vip_upgrade_popup");
            }
        });
        return true;
    }

    @Override // p009l.y5l
    /* JADX INFO: renamed from: f */
    public boolean mo14565f(z5l.C1346a c1346a) {
        return false;
    }
}
