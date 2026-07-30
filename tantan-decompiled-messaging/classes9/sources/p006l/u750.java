package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.oms.OmsDialog;
import l.ic50;
import l.y5l;
import l.z5l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class u750 extends y5l {
    public u750(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: d */
    public boolean m25071d(z5l.a aVar) {
        gzc0.m16027h0(aVar.b);
        return true;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean m25070b(z5l.a aVar) {
        boolean zM16025f0 = gzc0.m16025f0();
        if (CoreModule.f1534c.f3628e0.m21490p9().isBanned()) {
            return false;
        }
        if (!ogl0.m20617F() || ic50.j().f().M(OmsDialog.p_offline_popup.getIdentifier(), false)) {
            return zM16025f0;
        }
        gzc0.m16022c0().f13609f = true;
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25073f(z5l.a aVar) {
        return false;
    }
}
