package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.card.VSwipeStack;
import p009l.ic50;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.u0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0091u0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        ic50.m16316j().m16322f().m17424s0(aVar.f873b.act(), OmsDialog.p_alert_cheat_prevention__verify_required_popup.getIdentifier());
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return false;
    }
}
