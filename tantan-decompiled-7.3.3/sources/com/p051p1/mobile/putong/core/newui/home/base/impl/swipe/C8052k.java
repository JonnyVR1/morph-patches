package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import p153l.cvl;
import p153l.xj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k */
/* JADX INFO: loaded from: classes11.dex */
public class C8052k extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        NewMainAct newMainActAct = aVar.f22837b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || !TextUtils.equals(((cvl) aVar.f22837b.m38344q2().getParentFragment()).mo39558T().getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            return false;
        }
        return xj0.m211191g(aVar.f22837b.act());
    }
}
