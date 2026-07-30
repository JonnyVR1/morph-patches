package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.ui.poplevel.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.tantanapp.common.utils.NullChecker;
import l.uc80;
import l.upa;
import l.wc80;
import p009l.mqi0;
import p009l.tqf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.i */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0059i extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public boolean f867g = false;

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfigF1;
        if (CoreModule.c.e0.p9().age.intValue() < 40 && !CoreModule.c.e0.p9().isBannedNew() && !CoreModule.c.e0.p9().isBanned() && !CoreModule.c.e0.p9().isFakeUser() && (springFestivalMarriageActivitiesConfigF1 = upa.f1()) != null && ((Integer) CoreModule.c.e0.q4.get()).intValue() != springFestivalMarriageActivitiesConfigF1.version && !this.f867g && CoreModule.c.l2.a3(mqi0.m18550o()) >= 5000) {
            NewMainAct newMainActAct = aVar.f873b.act();
            if (NullChecker.a(newMainActAct)) {
                tqf0 tqf0Var = new tqf0(newMainActAct);
                if (a.p().I()) {
                    a.p().C(CorePopLevel.MARRYSPRINGFESTIVAL, newMainActAct, tqf0Var, 20000);
                } else {
                    wc80.e().q(uc80.a(tqf0Var));
                }
                this.f867g = true;
            }
        }
        return false;
    }
}
