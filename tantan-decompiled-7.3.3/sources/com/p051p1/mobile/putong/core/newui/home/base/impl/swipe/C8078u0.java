package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import p153l.pk50;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.u0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8078u0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        pk50.m172568j().m172574f().m181681s0(aVar.f22837b.act(), OmsDialog.p_alert_cheat_prevention__verify_required_popup.getIdentifier());
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return false;
    }
}
