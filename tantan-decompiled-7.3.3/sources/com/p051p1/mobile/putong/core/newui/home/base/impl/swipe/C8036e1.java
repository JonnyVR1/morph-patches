package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8036e1;
import com.tantanapp.common.utils.NullChecker;
import p153l.a5i0;
import p153l.joa;
import p153l.q7m;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8036e1 extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38608p(C8049j.a aVar) {
        aVar.f22836a.m101960U8(true);
        if (aVar.f22837b.m38344q2().isAdded()) {
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38609q(C8049j.a aVar) {
        aVar.f22836a.m101965V8(false);
        if (NullChecker.m82486a(aVar.f22837b.m38128A2().mo39812d()) && (aVar.f22837b.m38128A2().mo39812d() instanceof q7m)) {
            aVar.f22837b.m38128A2().mo39825y();
            aVar.f22836a.m101995c5();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        if (!aVar.f22836a.m102049n6()) {
            aVar.f22836a.m101965V8(true);
            a5i0.m96085B1(aVar.f22837b.act(), PurchaseType.TYPE_GET_SEE_LETTER_INTL, new x20() { // from class: l.xlh0
                @Override // p153l.x20
                public final void call() {
                    C8036e1.m38608p(aVar);
                }
            }, new x20() { // from class: l.ylh0
                @Override // p153l.x20
                public final void call() {
                    C8036e1.m38609q(aVar);
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return aVar.f22839d == SwipeDirection.UP && aVar.f22836a.m102029j6(aVar.f22838c.m140260e().f20214id) && !aVar.f22836a.m102044m6() && !joa.m146355E3() && a5i0.m96096G() && a5i0.m96160p0().m96220i1();
    }
}
