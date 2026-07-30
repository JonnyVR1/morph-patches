package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.messages.C0304a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.abi;
import l.upa;
import l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0075n0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        if (NullChecker.a(aVar) && NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17130d()) && !TextUtils.isEmpty(((DbObject) aVar.f874c.m17130d()).id)) {
            CoreModule.c.m0.O5();
            if (TextUtils.equals(((DbObject) aVar.f874c.m17130d()).id, CoreModule.c.f0.P1)) {
                m1669r(aVar);
            } else {
                aVar.f873b.m1310q2().w4(MatchAct.g2(aVar.f873b.act(), vwb.f0(new String[]{aVar.f874c.m17131e().id}), 0, new ArrayList(), upa.S1() ? "tmp_from_home_swipe" : null), new MatchAct.b());
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!NullChecker.a(aVar) || !NullChecker.a(aVar.f874c) || !NullChecker.a(aVar.f874c.m17131e()) || !C0304a.m5957p(aVar.f874c.m17131e().id)) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f875d;
        return swipeDirection == SwipeDirection.UP || swipeDirection == SwipeDirection.RIGHT;
    }

    /* JADX INFO: renamed from: r */
    public final void m1669r(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && NullChecker.a(aVar.f873b.act())) {
            abi.L(aVar.f873b.act(), aVar.f874c.m17130d(), 0, true);
        }
    }
}
