package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p149l.mqi0;
import p149l.upa;
import p149l.vwb;
import p149l.xe40;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7921r0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public boolean f22122g = false;

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (this.f22122g || !upa.m194811r3() || CoreModule.m29932K().me_().isFemale() || !mqi0.m155929D(CoreModule.f17545c.f19639e0.f149231O0.get().longValue()) || CoreModule.f17545c.f19639e0.f149238P0.get().longValue() < 2 || vwb.m200296J(CoreModule.f17545c.f19614V1.f83480S) || CoreModule.f17545c.f19614V1.f83480S.size() < 3) {
            return false;
        }
        if (mqi0.m155944o() <= CoreModule.f17545c.f19614V1.f83484W.get().longValue() + TimeUnit.DAYS.toMillis(upa.m194801p3())) {
            return false;
        }
        this.f22122g = true;
        NewMainAct newMainActAct = aVar.f22095b.act();
        if (!NullChecker.m81303a(newMainActAct) || newMainActAct.isFinishing()) {
            return false;
        }
        m37745r(newMainActAct);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m37745r(Act act) {
        CoreModule.f17545c.f19614V1.f83484W.put(Long.valueOf(mqi0.m155943n()));
        xe40.m208509f().m208514j(act, CoreModule.f17545c.f19614V1.f83480S);
    }
}
