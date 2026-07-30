package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import p153l.pk50;
import p153l.spl0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SwipeDialogOmsLimitStrategy extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public String f22792g;

    /* JADX INFO: renamed from: h */
    public boolean f22793h;

    /* JADX INFO: renamed from: i */
    public boolean f22794i = true;

    public enum HandleState {
        refuse,
        direct,
        proxy
    }

    public SwipeDialogOmsLimitStrategy(String str, boolean z) {
        this.f22792g = str;
        this.f22793h = z;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo38503q = mo38503q(aVar);
        if (spl0.m187354F() && this.f22794i) {
            pk50.m172568j().m172574f().m181664b0(this.f22792g, 0, this.f22793h);
        }
        return onCardSwipeResultMo38503q;
    }

    /* JADX INFO: renamed from: q */
    public abstract VSwipeStack.OnCardSwipeResult mo38503q(C8049j.a aVar);

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        HandleState handleStateMo38505s;
        if ((spl0.m187354F() && !pk50.m172568j().m172574f().m181649M(this.f22792g, this.f22793h)) || (handleStateMo38505s = mo38505s(aVar)) == HandleState.refuse) {
            return false;
        }
        if (spl0.m187354F() && handleStateMo38505s == HandleState.direct && this.f22794i) {
            pk50.m172568j().m172574f().m181664b0(this.f22792g, 0, this.f22793h);
        }
        return handleStateMo38505s == HandleState.proxy;
    }

    /* JADX INFO: renamed from: s */
    public abstract HandleState mo38505s(C8049j.a aVar);
}
