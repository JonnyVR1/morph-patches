package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.jxd0;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8024a1 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public jxd0 f22801j;

    public C8024a1(String str, boolean z) {
        super(str, z);
        this.f22801j = new jxd0("special_like_dlg_" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo38503q(final C8049j.a aVar) {
        CoreDlg.m46240d2(aVar.f22838c.m140259d(), aVar.f22837b.act(), new x20() { // from class: l.llh0
            @Override // p153l.x20
            public final void call() {
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
            }
        }, new x20() { // from class: l.mlh0
            @Override // p153l.x20
            public final void call() {
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.LEFT);
            }
        });
        this.f22801j.put(Boolean.TRUE);
        aVar.f22836a.m101938P8(aVar.f22841f, "maleNewLikeReselect");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo38505s(C8049j.a aVar) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (aVar.f22839d == SwipeDirection.LEFT && NullChecker.m82486a(userM116600p9) && !userM116600p9.isFemale() && NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140259d()) && NullChecker.m82486a(aVar.f22838c.m140260e()) && !this.f22801j.get().booleanValue() && aVar.f22838c.m140260e().isSpecialLike() && !aVar.f22838c.m140260e().isSpecialLikeShowStyle() && !aVar.f22838c.m140260e().isRepeatUser()) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }
}
