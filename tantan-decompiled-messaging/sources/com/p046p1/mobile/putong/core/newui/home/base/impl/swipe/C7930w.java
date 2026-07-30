package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import p149l.vy8;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.w */
/* JADX INFO: loaded from: classes11.dex */
public class C7930w extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        CoreModule.f17545c.f19663m0.f19451t0.put(Boolean.TRUE);
        CoreDlg.m45118y1(aVar.f22095b.act(), aVar.f22096c.m141745d(), true, new Runnable() { // from class: l.a8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38822y();
            }
        }, new Runnable() { // from class: l.b8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
            }
        });
        aVar.f22094a.m161144P8(aVar.f22099f, "failFirstSwipe");
        aVar.f22094a.m161201c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return (aVar.f22097d == SwipeDirection.UP || vy8.m200609g() || !m37511k(aVar) || CoreModule.f17545c.f19663m0.f19451t0.get().booleanValue()) ? false : true;
    }
}
