package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import l.vy8;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.w */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0094w extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        CoreModule.c.m0.t0.put(Boolean.TRUE);
        CoreDlg.y1(aVar.f873b.act(), aVar.f874c.m17130d(), true, new Runnable() { // from class: l.a8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f873b.m1092A2().mo2818y();
            }
        }, new Runnable() { // from class: l.b8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
            }
        });
        aVar.f872a.m19348P8(aVar.f877f, "failFirstSwipe");
        aVar.f872a.m19407c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return (aVar.f875d == SwipeDirection.UP || vy8.g() || !m1482k(aVar) || ((Boolean) CoreModule.c.m0.t0.get()).booleanValue()) ? false : true;
    }
}
