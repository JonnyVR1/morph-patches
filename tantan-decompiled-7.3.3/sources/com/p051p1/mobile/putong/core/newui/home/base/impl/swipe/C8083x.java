package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p153l.d79;
import p153l.hl3;
import p153l.joa;
import p153l.rbb0;
import p153l.t450;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x */
/* JADX INFO: loaded from: classes11.dex */
public class C8083x extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        CoreModule.f18264c.f20405m0.f20196u0.put(Boolean.TRUE);
        hl3.m135664G(aVar.f22837b.act(), true, aVar.f22838c.m140259d().name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", TEnum.equals(aVar.f22838c.m140259d().gender, "male"), new Runnable() { // from class: l.kgh0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.lgh0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f22837b.m38128A2().mo39825y();
            }
        });
        aVar.f22836a.m101938P8(aVar.f22841f, "failFirstSwipe");
        aVar.f22836a.m101995c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (aVar.f22839d != SwipeDirection.UP || CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue() || rbb0.m180747t()) {
            return false;
        }
        return ((d79.m114685j0() && aVar.f22836a.m102029j6(aVar.f22838c.m140259d().f56859id)) || t450.m189175j() || joa.m146354D3()) ? false : true;
    }
}
