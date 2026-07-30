package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p149l.ew40;
import p149l.n3b0;
import p149l.ok3;
import p149l.u59;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x */
/* JADX INFO: loaded from: classes11.dex */
public class C7932x extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        CoreModule.f17545c.f19663m0.f19454u0.put(Boolean.TRUE);
        ok3.m164808G(aVar.f22095b.act(), true, aVar.f22096c.m141745d().name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", TEnum.equals(aVar.f22096c.m141745d().gender, "male"), new Runnable() { // from class: l.c8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.d8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22095b.m37125A2().mo38822y();
            }
        });
        aVar.f22094a.m161144P8(aVar.f22099f, "failFirstSwipe");
        aVar.f22094a.m161201c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (aVar.f22097d != SwipeDirection.UP || CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue() || n3b0.m157745t()) {
            return false;
        }
        return ((u59.m191827f0() && aVar.f22094a.m161235j6(aVar.f22096c.m141745d().f56011id)) || ew40.m118398j() || xma.m210040C3()) ? false : true;
    }
}
