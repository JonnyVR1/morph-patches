package p149l;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class i580 extends AbstractC18834o4 {

    /* JADX INFO: renamed from: a */
    public boolean f111535a = true;

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(z5l.C21640a c21640a) {
        CoreModule.f17545c.f19641e2.m112204m3();
        new g580.C17003a(c21640a.m217363a()).m124482a("").m124483b();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m134469d(d5m d5mVar) {
        return sb90.m183209e(d5mVar.getCardData().m141745d()) && NullChecker.m81303a(d5mVar.getCardData().m141746e()) && NullChecker.m81303a(d5mVar.getCardData().m141746e().cityCData) && !TextUtils.isEmpty(d5mVar.getCardData().m141746e().cityCData.userId);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        if (g6a.m124569r() && (c21640a.f201827a.getParentFragment() instanceof psl) && ((psl) c21640a.f201827a.getParentFragment()).mo38555T() == NewTanFragTag.HOME) {
            KeyEvent.Callback callbackMo38809d = c21640a.f201829c.m37125A2().mo38809d();
            if (callbackMo38809d instanceof d5m) {
                d5m d5mVar = (d5m) callbackMo38809d;
                if (!d5mVar.mo36922q0() && !c21640a.m217363a().isDialogShowing() && !rxa0.m181487h() && !m134469d(d5mVar)) {
                    int iM124553A = g6a.m124553A();
                    int iM112211t3 = CoreModule.f17545c.f19641e2.m112211t3();
                    boolean zM169494h8 = CoreModule.f17545c.f19639e0.m169494h8(24L);
                    if (!xma.m210045H3() && !zM169494h8 && iM112211t3 < iM124553A && this.f111535a) {
                        this.f111535a = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
