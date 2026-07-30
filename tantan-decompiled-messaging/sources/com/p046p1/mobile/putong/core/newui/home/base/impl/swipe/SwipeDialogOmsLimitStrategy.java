package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import p149l.ic50;
import p149l.ogl0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SwipeDialogOmsLimitStrategy extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public String f22050g;

    /* JADX INFO: renamed from: h */
    public boolean f22051h;

    /* JADX INFO: renamed from: i */
    public boolean f22052i = true;

    public enum HandleState {
        refuse,
        direct,
        proxy
    }

    public SwipeDialogOmsLimitStrategy(String str, boolean z) {
        this.f22050g = str;
        this.f22051h = z;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        VSwipeStack.OnCardSwipeResult onCardSwipeResultMo37500q = mo37500q(aVar);
        if (ogl0.m164227F() && this.f22052i) {
            ic50.m135327j().m135333f().m145241b0(this.f22050g, 0, this.f22051h);
        }
        return onCardSwipeResultMo37500q;
    }

    /* JADX INFO: renamed from: q */
    public abstract VSwipeStack.OnCardSwipeResult mo37500q(C7898j.a aVar);

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        HandleState handleStateMo37502s;
        if ((ogl0.m164227F() && !ic50.m135327j().m135333f().m145226M(this.f22050g, this.f22051h)) || (handleStateMo37502s = mo37502s(aVar)) == HandleState.refuse) {
            return false;
        }
        if (ogl0.m164227F() && handleStateMo37502s == HandleState.direct && this.f22052i) {
            ic50.m135327j().m135333f().m145241b0(this.f22050g, 0, this.f22051h);
        }
        return handleStateMo37502s == HandleState.proxy;
    }

    /* JADX INFO: renamed from: s */
    public abstract HandleState mo37502s(C7898j.a aVar);
}
