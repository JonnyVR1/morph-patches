package p009l;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.g580;
import l.g6a;
import l.sb90;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class i580 extends AbstractC1065o4 {

    /* JADX INFO: renamed from: a */
    public boolean f14401a = true;

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(z5l.C1346a c1346a) {
        CoreModule.c.e2.m3();
        new g580.a(c1346a.m25611a()).a("").b();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16181d(d5m d5mVar) {
        return sb90.e(d5mVar.getCardData().m17130d()) && NullChecker.a(d5mVar.getCardData().m17131e()) && NullChecker.a(d5mVar.getCardData().m17131e().cityCData) && !TextUtils.isEmpty(d5mVar.getCardData().m17131e().cityCData.userId);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        if (g6a.r() && (c1346a.f23487a.getParentFragment() instanceof psl) && c1346a.f23487a.getParentFragment().mo2537T() == NewTanFragTag.HOME) {
            KeyEvent.Callback callbackMo2805d = c1346a.f23489c.m1092A2().mo2805d();
            if (callbackMo2805d instanceof d5m) {
                d5m d5mVar = (d5m) callbackMo2805d;
                if (!d5mVar.mo888q0() && !c1346a.m25611a().isDialogShowing() && !rxa0.m21871h() && !m16181d(d5mVar)) {
                    int iA = g6a.A();
                    int iT3 = CoreModule.c.e2.t3();
                    boolean zH8 = CoreModule.c.e0.h8(24L);
                    if (!xma.H3() && !zH8 && iT3 < iA && this.f14401a) {
                        this.f14401a = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
