package com.p046p1.mobile.putong.core.newui.myinterestpeople;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.data.User;
import p149l.kzl;
import p149l.p3m;
import p149l.u19;
import p149l.w39;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c */
/* JADX INFO: loaded from: classes11.dex */
public class C8192c implements p3m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f26083a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c$a */
    public static class a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f26084a;

        /* JADX INFO: renamed from: b */
        public View f26085b;

        /* JADX INFO: renamed from: c */
        public User f26086c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f26087d;

        /* JADX INFO: renamed from: e */
        public w39 f26088e;

        /* JADX INFO: renamed from: f */
        public boolean f26089f;

        /* JADX INFO: renamed from: g */
        public u19 f26090g;

        public a(Act act, w39 w39Var, View view, SwipeDirection swipeDirection, boolean z, u19 u19Var) {
            this.f26084a = act;
            this.f26086c = w39Var.f184317a;
            this.f26085b = view;
            this.f26087d = swipeDirection;
            this.f26088e = w39Var;
            this.f26089f = z;
            this.f26090g = u19Var;
        }
    }

    public C8192c() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f26083a = dialogStrategyQueue;
        dialogStrategyQueue.m37406c(new C8191b());
        this.f26083a.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(a aVar) {
        for (p3m p3mVar : this.f26083a.m37407d()) {
            if (p3mVar instanceof C8191b) {
                C8191b c8191b = (C8191b) p3mVar;
                if (c8191b.mo37498b(aVar)) {
                    return c8191b.mo37497a(aVar);
                }
            }
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(a aVar) {
        return true;
    }
}
