package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.oms.OmsDialog;

/* JADX INFO: loaded from: classes9.dex */
public class u750 extends y5l {
    public u750(String str, boolean z) {
        super(str, z);
    }

    @Override // p149l.y5l
    /* JADX INFO: renamed from: d */
    public boolean mo122878d(z5l.C21640a c21640a) {
        gzc0.m128842h0(c21640a.f201828b);
        return true;
    }

    @Override // p149l.y5l, p149l.p3m
    /* JADX INFO: renamed from: e */
    public boolean mo37498b(z5l.C21640a c21640a) {
        boolean zM128840f0 = gzc0.m128840f0();
        if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
            return false;
        }
        if (!ogl0.m164227F() || ic50.m135327j().m135333f().m145226M(OmsDialog.p_offline_popup.getIdentifier(), false)) {
            return zM128840f0;
        }
        gzc0.m128837c0().f105122f = true;
        return false;
    }

    @Override // p149l.y5l
    /* JADX INFO: renamed from: f */
    public boolean mo122879f(z5l.C21640a c21640a) {
        return false;
    }
}
