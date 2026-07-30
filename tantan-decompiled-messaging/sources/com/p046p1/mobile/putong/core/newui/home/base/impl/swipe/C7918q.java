package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7918q;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.mkd0;
import p149l.upa;
import p149l.z60;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q */
/* JADX INFO: loaded from: classes11.dex */
public class C7918q extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37722p(Relationship relationship) {
    }

    /* JADX INFO: renamed from: q */
    public final void m37723q(C7898j.a aVar) {
        CoreModule.f17545c.f19663m0.m31077Z7(true, false, null, aVar.f22096c.m141745d(), null, LikeFrom.get("greet"), true, null, 0, null, false).subscribe(mkd0.m154956H(new e30() { // from class: l.u7h0
            @Override // p149l.e30
            public final void call(Object obj) {
                C7918q.m37722p((Relationship) obj);
            }
        }, new z60()));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        m37723q(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (!upa.m194682P1() || !NullChecker.m81303a(aVar.f22096c.m141745d()) || TextUtils.isEmpty(CoreModule.f17545c.f19678r0.f20030k0) || !TextUtils.equals(CoreModule.f17545c.f19678r0.f20030k0, aVar.f22096c.m141748g())) {
            return false;
        }
        CoreModule.f17545c.f19678r0.f20030k0 = "";
        return true;
    }
}
