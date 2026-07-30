package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import p153l.d09;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.v */
/* JADX INFO: loaded from: classes11.dex */
public class C8079v extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        CoreModule.f18264c.f20405m0.f20199v0.put(Boolean.TRUE);
        CoreDlg.m46301y1(aVar.f22837b.act(), aVar.f22838c.m140259d(), false, new Runnable() { // from class: l.ggh0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22837b.m38128A2().mo39825y();
            }
        }, new Runnable() { // from class: l.hgh0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.LEFT);
            }
        });
        aVar.f22836a.m101938P8(aVar.f22841f, "failFirstSwipe");
        aVar.f22836a.m101995c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return (m38514k(aVar) || d09.m113370g() || CoreModule.f18264c.f20405m0.f20199v0.get().booleanValue()) ? false : true;
    }
}
