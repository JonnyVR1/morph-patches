package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SvipResumePurchase;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.byd0;
import p153l.hl3;
import p153l.joa;
import p153l.pzi0;
import p153l.s7a;
import p153l.tzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8084x0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public String f22885g = "svip_recover_dlg_show_key";

    /* JADX INFO: renamed from: h */
    public byd0 f22886h = new byd0(this.f22885g + CoreModule.m30929H().userId(), 0L);

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        SvipResumePurchase svipResumePurchaseM184976e;
        if (joa.m146392i4() && !aVar.f22842g && !pzi0.m174439D(this.f22886h.get().longValue()) && (svipResumePurchaseM184976e = s7a.m184976e()) != null) {
            int iM176350c3 = CoreModule.f18264c.f20413o2.m176350c3();
            int i = svipResumePurchaseM184976e.no_match_swipe_limit;
            if (i < 1) {
                i = 10;
            }
            if (iM176350c3 < i || CoreModule.f18264c.f20413o2.m176349b3() > 0) {
                return false;
            }
            long jM146409w3 = joa.m146409w3(SummarizedPrivilegesId.get("svip"));
            if (jM146409w3 > 0 && tzi0.m193669g(pzi0.m174454o(), jM146409w3, 7)) {
                int i2 = NullChecker.m82486a(CoreModule.f18264c.f20429u0.m31479t5()) ? CoreModule.f18264c.f20429u0.m31479t5().f20012b : 0;
                boolean z = i2 >= 5;
                NewMainAct newMainActAct = aVar.f22837b.act();
                if (CoreModule.f18264c.f20413o2.m176350c3() <= 30 && z && NullChecker.m82486a(newMainActAct)) {
                    this.f22886h.put(Long.valueOf(pzi0.m174454o()));
                    hl3.m135669L(newMainActAct, i2);
                }
            }
        }
        return false;
    }
}
