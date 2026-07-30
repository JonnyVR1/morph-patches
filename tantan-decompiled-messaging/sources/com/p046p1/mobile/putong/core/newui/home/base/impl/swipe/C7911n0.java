package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.messages.C8140a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.abi;
import p149l.upa;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7911n0 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar) && NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141745d()) && !TextUtils.isEmpty(aVar.f22096c.m141745d().f56011id)) {
            CoreModule.f17545c.f19663m0.m31031O5();
            if (TextUtils.equals(aVar.f22096c.m141745d().f56011id, CoreModule.f17545c.f19642f0.f19887P1)) {
                m37698r(aVar);
            } else {
                aVar.f22095b.m37341q2().m20603w4(MatchAct.m47564g2(aVar.f22095b.act(), vwb.m200324f0(aVar.f22096c.m141746e().f19472id), 0, new ArrayList(), upa.m194694S1() ? "tmp_from_home_swipe" : null), new MatchAct.C8454b());
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!NullChecker.m81303a(aVar) || !NullChecker.m81303a(aVar.f22096c) || !NullChecker.m81303a(aVar.f22096c.m141746e()) || !C8140a.m41831p(aVar.f22096c.m141746e().f19472id)) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22097d;
        return swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: r */
    public final void m37698r(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && NullChecker.m81303a(aVar.f22095b.act())) {
            abi.m95624L(aVar.f22095b.act(), aVar.f22096c.m141745d(), 0, true);
        }
    }
}
