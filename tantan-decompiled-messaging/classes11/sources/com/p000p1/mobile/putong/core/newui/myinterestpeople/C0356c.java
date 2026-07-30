package com.p000p1.mobile.putong.core.newui.myinterestpeople;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import p009l.kzl;
import p009l.p3m;
import p009l.u19;
import p009l.w39;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0356c implements p3m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f4861a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c$a */
    public static class a implements kzl {

        /* JADX INFO: renamed from: a */
        public Act f4862a;

        /* JADX INFO: renamed from: b */
        public View f4863b;

        /* JADX INFO: renamed from: c */
        public User f4864c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f4865d;

        /* JADX INFO: renamed from: e */
        public w39 f4866e;

        /* JADX INFO: renamed from: f */
        public boolean f4867f;

        /* JADX INFO: renamed from: g */
        public u19 f4868g;

        public a(Act act, w39 w39Var, View view, SwipeDirection swipeDirection, boolean z, u19 u19Var) {
            this.f4862a = act;
            this.f4864c = w39Var.f21867a;
            this.f4863b = view;
            this.f4865d = swipeDirection;
            this.f4866e = w39Var;
            this.f4867f = z;
            this.f4868g = u19Var;
        }
    }

    public C0356c() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f4861a = dialogStrategyQueue;
        dialogStrategyQueue.m1377c(new C0355b());
        this.f4861a.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(a aVar) {
        for (p3m p3mVar : this.f4861a.m1378d()) {
            if (p3mVar instanceof C0355b) {
                C0355b c0355b = (C0355b) p3mVar;
                if (c0355b.mo1469b(aVar)) {
                    return c0355b.mo1468a(aVar);
                }
            }
        }
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(a aVar) {
        return true;
    }
}
