package com.p051p1.mobile.putong.core.newui.myinterestpeople;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.data.User;
import p153l.d39;
import p153l.e2m;
import p153l.f59;
import p153l.g6m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c */
/* JADX INFO: loaded from: classes11.dex */
public class C8343c implements g6m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public DialogStrategyQueue f26825a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.c$a */
    public static class a implements e2m {

        /* JADX INFO: renamed from: a */
        public Act f26826a;

        /* JADX INFO: renamed from: b */
        public View f26827b;

        /* JADX INFO: renamed from: c */
        public User f26828c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f26829d;

        /* JADX INFO: renamed from: e */
        public f59 f26830e;

        /* JADX INFO: renamed from: f */
        public boolean f26831f;

        /* JADX INFO: renamed from: g */
        public d39 f26832g;

        public a(Act act, f59 f59Var, View view, SwipeDirection swipeDirection, boolean z, d39 d39Var) {
            this.f26826a = act;
            this.f26828c = f59Var.f97205a;
            this.f26827b = view;
            this.f26829d = swipeDirection;
            this.f26830e = f59Var;
            this.f26831f = z;
            this.f26832g = d39Var;
        }
    }

    public C8343c() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f26825a = dialogStrategyQueue;
        dialogStrategyQueue.m38409c(new C8342b());
        this.f26825a.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(a aVar) {
        for (g6m g6mVar : this.f26825a.m38410d()) {
            if (g6mVar instanceof C8342b) {
                C8342b c8342b = (C8342b) g6mVar;
                if (c8342b.mo38501b(aVar)) {
                    return c8342b.mo38500a(aVar);
                }
            }
        }
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(a aVar) {
        return true;
    }
}
