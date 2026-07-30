package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import p149l.vy8;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.v */
/* JADX INFO: loaded from: classes11.dex */
public class C7928v extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        CoreModule.f17545c.f19663m0.f19457v0.put(Boolean.TRUE);
        CoreDlg.m45118y1(aVar.f22095b.act(), aVar.f22096c.m141745d(), false, new Runnable() { // from class: l.y7h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38822y();
            }
        }, new Runnable() { // from class: l.z7h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.LEFT);
            }
        });
        aVar.f22094a.m161144P8(aVar.f22099f, "failFirstSwipe");
        aVar.f22094a.m161201c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return (m37511k(aVar) || vy8.m200609g() || CoreModule.f17545c.f19663m0.f19457v0.get().booleanValue()) ? false : true;
    }
}
