package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.card.VSwipeStack;
import p009l.bk0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0065k extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        NewMainAct newMainActAct = aVar.f873b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || !TextUtils.equals(aVar.f873b.m1310q2().getParentFragment().mo2537T().getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            return false;
        }
        return bk0.m12062g(aVar.f873b.act());
    }
}
