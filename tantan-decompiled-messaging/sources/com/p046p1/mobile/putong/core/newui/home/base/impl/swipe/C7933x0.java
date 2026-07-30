package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SvipResumePurchase;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.g6a;
import p149l.mqi0;
import p149l.ok3;
import p149l.qqi0;
import p149l.xma;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7933x0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public String f22143g = "svip_recover_dlg_show_key";

    /* JADX INFO: renamed from: h */
    public zpd0 f22144h = new zpd0(this.f22143g + CoreModule.m29931H().userId(), 0L);

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        SvipResumePurchase svipResumePurchaseM124556e;
        if (xma.m210077h4() && !aVar.f22100g && !mqi0.m155929D(this.f22144h.get().longValue()) && (svipResumePurchaseM124556e = g6a.m124556e()) != null) {
            int iM154143c3 = CoreModule.f17545c.f19671o2.m154143c3();
            int i = svipResumePurchaseM124556e.no_match_swipe_limit;
            if (i < 1) {
                i = 10;
            }
            if (iM154143c3 < i || CoreModule.f17545c.f19671o2.m154142b3() > 0) {
                return false;
            }
            long jM210094v3 = xma.m210094v3(SummarizedPrivilegesId.get("svip"));
            if (jM210094v3 > 0 && qqi0.m175939g(mqi0.m155944o(), jM210094v3, 7)) {
                int i2 = NullChecker.m81303a(CoreModule.f17545c.f19687u0.m30471r5()) ? CoreModule.f17545c.f19687u0.m30471r5().f19270b : 0;
                boolean z = i2 >= 5;
                NewMainAct newMainActAct = aVar.f22095b.act();
                if (CoreModule.f17545c.f19671o2.m154143c3() <= 30 && z && NullChecker.m81303a(newMainActAct)) {
                    this.f22144h.put(Long.valueOf(mqi0.m155944o()));
                    ok3.m164813L(newMainActAct, i2);
                }
            }
        }
        return false;
    }
}
