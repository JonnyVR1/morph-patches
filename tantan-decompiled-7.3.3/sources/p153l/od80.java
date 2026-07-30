package p153l;

import android.text.TextUtils;
import android.view.KeyEvent;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class od80 extends AbstractC18774n4 {

    /* JADX INFO: renamed from: a */
    public boolean f146855a = true;

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        CoreModule.f18264c.f20383e2.m172813m3();
        new md80.C18592a(c19323a.m171258a()).m157969a("").m157970b();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m167280d(t7m t7mVar) {
        return wj90.m206622e(t7mVar.getCardData().m140259d()) && NullChecker.m82486a(t7mVar.getCardData().m140260e()) && NullChecker.m82486a(t7mVar.getCardData().m140260e().cityCData) && !TextUtils.isEmpty(t7mVar.getCardData().m140260e().cityCData.userId);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        if (s7a.m184989r() && (c19323a.f151040a.getParentFragment() instanceof cvl) && ((cvl) c19323a.f151040a.getParentFragment()).mo39558T() == NewTanFragTag.HOME) {
            KeyEvent.Callback callbackMo39812d = c19323a.f151042c.m38128A2().mo39812d();
            if (callbackMo39812d instanceof t7m) {
                t7m t7mVar = (t7m) callbackMo39812d;
                if (!t7mVar.mo37925q0() && !c19323a.m171258a().isDialogShowing() && !v5b0.m199782h() && !m167280d(t7mVar)) {
                    int iM184973A = s7a.m184973A();
                    int iM172820t3 = CoreModule.f18264c.f20383e2.m172820t3();
                    boolean zM116567h8 = CoreModule.f18264c.f20381e0.m116567h8(24L);
                    if (!joa.m146359I3() && !zM116567h8 && iM172820t3 < iM184973A && this.f146855a) {
                        this.f146855a = false;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
