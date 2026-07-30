package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8069q;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.Relationship;
import com.tantanapp.common.utils.NullChecker;
import p153l.gra;
import p153l.psd0;
import p153l.v60;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.q */
/* JADX INFO: loaded from: classes11.dex */
public class C8069q extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38725p(Relationship relationship) {
    }

    /* JADX INFO: renamed from: q */
    public final void m38726q(C8049j.a aVar) {
        CoreModule.f18264c.f20405m0.m32080Z7(true, false, null, aVar.f22838c.m140259d(), null, LikeFrom.get("greet"), true, null, 0, null, false).subscribe(psd0.m173597H(new y20() { // from class: l.cgh0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8069q.m38725p((Relationship) obj);
            }
        }, new v60()));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        m38726q(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (!gra.m131613P1() || !NullChecker.m82486a(aVar.f22838c.m140259d()) || TextUtils.isEmpty(CoreModule.f18264c.f20420r0.f20772k0) || !TextUtils.equals(CoreModule.f18264c.f20420r0.f20772k0, aVar.f22838c.m140262g())) {
            return false;
        }
        CoreModule.f18264c.f20420r0.f20772k0 = "";
        return true;
    }
}
