package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.hpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7873a1 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f22059j;

    public C7873a1(String str, boolean z) {
        super(str, z);
        this.f22059j = new hpd0("special_like_dlg_" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo37500q(final C7898j.a aVar) {
        CoreDlg.m45057d2(aVar.f22096c.m141745d(), aVar.f22095b.act(), new d30() { // from class: l.ddh0
            @Override // p149l.d30
            public final void call() {
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
            }
        }, new d30() { // from class: l.edh0
            @Override // p149l.d30
            public final void call() {
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.LEFT);
            }
        });
        this.f22059j.put(Boolean.TRUE);
        aVar.f22094a.m161144P8(aVar.f22099f, "maleNewLikeReselect");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo37502s(C7898j.a aVar) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (aVar.f22097d == SwipeDirection.LEFT && NullChecker.m81303a(userM169527p9) && !userM169527p9.isFemale() && NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141745d()) && NullChecker.m81303a(aVar.f22096c.m141746e()) && !this.f22059j.get().booleanValue() && aVar.f22096c.m141746e().isSpecialLike() && !aVar.f22096c.m141746e().isSpecialLikeShowStyle() && !aVar.f22096c.m141746e().isRepeatUser()) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }
}
