package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.SvipResumePurchase;
import com.tantanapp.common.utils.NullChecker;
import l.g6a;
import l.ok3;
import l.qqi0;
import l.xma;
import l.zpd0;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0097x0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public String f921g = "svip_recover_dlg_show_key";

    /* JADX INFO: renamed from: h */
    public zpd0 f922h = new zpd0(this.f921g + CoreModule.H().userId(), 0L);

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        SvipResumePurchase svipResumePurchaseE;
        if (xma.h4() && !aVar.f878g && !mqi0.m18535D(((Long) this.f922h.get()).longValue()) && (svipResumePurchaseE = g6a.e()) != null) {
            int iC3 = CoreModule.c.o2.c3();
            int i = svipResumePurchaseE.no_match_swipe_limit;
            if (i < 1) {
                i = 10;
            }
            if (iC3 < i || CoreModule.c.o2.b3() > 0) {
                return false;
            }
            long jV3 = xma.v3(SummarizedPrivilegesId.get("svip"));
            if (jV3 > 0 && qqi0.g(mqi0.m18550o(), jV3, 7)) {
                int i2 = NullChecker.a(CoreModule.c.u0.r5()) ? CoreModule.c.u0.r5().b : 0;
                boolean z = i2 >= 5;
                NewMainAct newMainActAct = aVar.f873b.act();
                if (CoreModule.c.o2.c3() <= 30 && z && NullChecker.a(newMainActAct)) {
                    this.f922h.put(Long.valueOf(mqi0.m18550o()));
                    ok3.L(newMainActAct, i2);
                }
            }
        }
        return false;
    }
}
