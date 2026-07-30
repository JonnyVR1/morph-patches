package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.upa;
import l.vwb;
import p009l.mqi0;
import p009l.xe40;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0085r0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public boolean f900g = false;

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (this.f900g || !upa.r3() || CoreModule.K().me_().isFemale() || !mqi0.m18535D(((Long) CoreModule.c.e0.O0.get()).longValue()) || ((Long) CoreModule.c.e0.P0.get()).longValue() < 2 || vwb.J(CoreModule.c.V1.S) || CoreModule.c.V1.S.size() < 3) {
            return false;
        }
        if (mqi0.m18550o() <= ((Long) CoreModule.c.V1.W.get()).longValue() + TimeUnit.DAYS.toMillis(upa.p3())) {
            return false;
        }
        this.f900g = true;
        NewMainAct newMainActAct = aVar.f873b.act();
        if (!NullChecker.a(newMainActAct) || newMainActAct.isFinishing()) {
            return false;
        }
        m1716r(newMainActAct);
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m1716r(Act act) {
        CoreModule.c.V1.W.put(Long.valueOf(mqi0.m18549n()));
        xe40.m24830f().m24835j(act, CoreModule.c.V1.S);
    }
}
