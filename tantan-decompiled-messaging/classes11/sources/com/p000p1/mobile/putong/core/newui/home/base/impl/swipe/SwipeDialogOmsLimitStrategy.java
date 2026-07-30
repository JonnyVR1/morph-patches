package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.card.VSwipeStack;
import l.ogl0;
import p009l.ic50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class SwipeDialogOmsLimitStrategy extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public String f828g;

    /* JADX INFO: renamed from: h */
    public boolean f829h;

    /* JADX INFO: renamed from: i */
    public boolean f830i = true;

    public enum HandleState {
        refuse,
        direct,
        proxy
    }

    public SwipeDialogOmsLimitStrategy(String str, boolean z) {
        this.f828g = str;
        this.f829h = z;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo1471q = mo1471q(aVar);
        if (ogl0.F() && this.f830i) {
            ic50.m16316j().m16322f().m17407b0(this.f828g, 0, this.f829h);
        }
        return onCardSwipeResultMo1471q;
    }

    /* JADX INFO: renamed from: q */
    public abstract VSwipeStack.OnCardSwipeResult mo1471q(C0062j.a aVar);

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        HandleState handleStateMo1473s;
        if ((ogl0.F() && !ic50.m16316j().m16322f().m17392M(this.f828g, this.f829h)) || (handleStateMo1473s = mo1473s(aVar)) == HandleState.refuse) {
            return false;
        }
        if (ogl0.F() && handleStateMo1473s == HandleState.direct && this.f830i) {
            ic50.m16316j().m16322f().m17407b0(this.f828g, 0, this.f829h);
        }
        return handleStateMo1473s == HandleState.proxy;
    }

    /* JADX INFO: renamed from: s */
    public abstract HandleState mo1473s(C0062j.a aVar);
}
