package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0082q;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.e30;
import l.mkd0;
import l.upa;
import l.z60;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0082q extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1693p(Relationship relationship) {
    }

    /* JADX INFO: renamed from: q */
    public final void m1694q(C0062j.a aVar) {
        CoreModule.c.m0.Z7(true, false, (Map) null, aVar.f874c.m17130d(), (String) null, LikeFrom.get("greet"), true, (LikeExtraData) null, 0, (String) null, false).subscribe(mkd0.H(new e30() { // from class: l.u7h0
            public final void call(Object obj) {
                C0082q.m1693p((Relationship) obj);
            }
        }, new z60()));
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        m1694q(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (!upa.P1() || !NullChecker.a(aVar.f874c.m17130d()) || TextUtils.isEmpty(CoreModule.c.r0.k0) || !TextUtils.equals(CoreModule.c.r0.k0, aVar.f874c.m17133g())) {
            return false;
        }
        CoreModule.c.r0.k0 = "";
        return true;
    }
}
