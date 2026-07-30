package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.messages.C8291a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.gra;
import p153l.jyb;
import p153l.pci;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8062n0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar) && NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140259d()) && !TextUtils.isEmpty(aVar.f22838c.m140259d().f56859id)) {
            CoreModule.f18264c.f20405m0.m32034O5();
            if (TextUtils.equals(aVar.f22838c.m140259d().f56859id, CoreModule.f18264c.f20384f0.f20629P1)) {
                m38701r(aVar);
            } else {
                aVar.f22837b.m38344q2().m21602w4(MatchAct.m48747h2(aVar.f22837b.act(), jyb.m147507f0(aVar.f22838c.m140260e().f20214id), 0, new ArrayList(), gra.m131625S1() ? "tmp_from_home_swipe" : null), new MatchAct.C8617b());
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!NullChecker.m82486a(aVar) || !NullChecker.m82486a(aVar.f22838c) || !NullChecker.m82486a(aVar.f22838c.m140260e()) || !C8291a.m42842p(aVar.f22838c.m140260e().f20214id)) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22839d;
        return swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: r */
    public final void m38701r(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && NullChecker.m82486a(aVar.f22837b.act())) {
            pci.m171663L(aVar.f22837b.act(), aVar.f22838c.m140259d(), 0, true);
        }
    }
}
