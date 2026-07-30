package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.ew40;
import l.n3b0;
import l.ok3;
import l.u59;
import l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.x */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0096x extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        CoreModule.c.m0.u0.put(Boolean.TRUE);
        ok3.G(aVar.f873b.act(), true, aVar.f874c.m17130d().name, CoreModule.c.o3().superLikeLimit.remainToday() + "", TEnum.equals(aVar.f874c.m17130d().gender, "male"), new Runnable() { // from class: l.c8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
            }
        }, new Runnable() { // from class: l.d8h0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f873b.m1092A2().mo2818y();
            }
        });
        aVar.f872a.m19348P8(aVar.f877f, "failFirstSwipe");
        aVar.f872a.m19407c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (aVar.f875d != SwipeDirection.UP || ((Boolean) CoreModule.c.m0.u0.get()).booleanValue() || n3b0.t()) {
            return false;
        }
        return ((u59.f0() && aVar.f872a.m19441j6(((DbObject) aVar.f874c.m17130d()).id)) || ew40.j() || xma.C3()) ? false : true;
    }
}
