package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p153l.gra;
import p153l.jyb;
import p153l.ln40;
import p153l.pzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8072r0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public boolean f22864g = false;

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (this.f22864g || !gra.m131742r3() || CoreModule.m30930K().me_().isFemale() || !pzi0.m174439D(CoreModule.f18264c.f20381e0.f89088O0.get().longValue()) || CoreModule.f18264c.f20381e0.f89095P0.get().longValue() < 2 || jyb.m147479J(CoreModule.f18264c.f20356V1.f150516S) || CoreModule.f18264c.f20356V1.f150516S.size() < 3) {
            return false;
        }
        if (pzi0.m174454o() <= CoreModule.f18264c.f20356V1.f150520W.get().longValue() + TimeUnit.DAYS.toMillis(gra.m131732p3())) {
            return false;
        }
        this.f22864g = true;
        NewMainAct newMainActAct = aVar.f22837b.act();
        if (!NullChecker.m82486a(newMainActAct) || newMainActAct.isFinishing()) {
            return false;
        }
        m38748r(newMainActAct);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m38748r(Act act) {
        CoreModule.f18264c.f20356V1.f150520W.put(Long.valueOf(pzi0.m174453n()));
        ln40.m154956f().m154961j(act, CoreModule.f18264c.f20356V1.f150516S);
    }
}
