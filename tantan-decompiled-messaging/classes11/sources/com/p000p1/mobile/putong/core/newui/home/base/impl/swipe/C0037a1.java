package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.annotation.SuppressLint;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.hpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0037a1 extends SwipeDialogOmsLimitStrategy {

    /* JADX INFO: renamed from: j */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f837j;

    public C0037a1(String str, boolean z) {
        super(str, z);
        this.f837j = new hpd0("special_like_dlg_" + CoreModule.H().userId(), Boolean.FALSE);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo1471q(final C0062j.a aVar) {
        CoreDlg.d2(aVar.f874c.m17130d(), aVar.f873b.act(), new d30() { // from class: l.ddh0
            public final void call() {
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
            }
        }, new d30() { // from class: l.edh0
            public final void call() {
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.LEFT);
            }
        });
        this.f837j.put(Boolean.TRUE);
        aVar.f872a.m19348P8(aVar.f877f, "maleNewLikeReselect");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo1473s(C0062j.a aVar) {
        User userP9 = CoreModule.c.e0.p9();
        return (aVar.f875d == SwipeDirection.LEFT && NullChecker.a(userP9) && !userP9.isFemale() && NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17130d()) && NullChecker.a(aVar.f874c.m17131e()) && !((Boolean) this.f837j.get()).booleanValue() && aVar.f874c.m17131e().isSpecialLike() && !aVar.f874c.m17131e().isSpecialLikeShowStyle() && !aVar.f874c.m17131e().isRepeatUser()) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.refuse;
    }
}
