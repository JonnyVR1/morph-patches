package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import p149l.bk0;
import p149l.psl;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k */
/* JADX INFO: loaded from: classes11.dex */
public class C7901k extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        NewMainAct newMainActAct = aVar.f22095b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || !TextUtils.equals(((psl) aVar.f22095b.m37341q2().getParentFragment()).mo38555T().getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            return false;
        }
        return bk0.m102255g(aVar.f22095b.act());
    }
}
