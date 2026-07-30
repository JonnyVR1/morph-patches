package com.p046p1.mobile.putong.core.newui.home.base.impl;

import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p149l.a83;
import p149l.ic50;
import p149l.p3m;
import p149l.vwb;
import p149l.y5l;

/* JADX INFO: loaded from: classes11.dex */
public class DialogStrategyQueue {

    /* JADX INFO: renamed from: a */
    public List<p3m> f21990a = new ArrayList();

    public enum StrategyType {
        home,
        swipe
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m37404a(SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy, SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy2) {
        return ic50.m135327j().m135333f().m145237X(swipeDialogOmsLimitStrategy2.f22050g) - ic50.m135327j().m135333f().m145237X(swipeDialogOmsLimitStrategy.f22050g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m37405b(y5l y5lVar, y5l y5lVar2) {
        return ic50.m135327j().m135333f().m145237X(y5lVar2.f196450a) - ic50.m135327j().m135333f().m145237X(y5lVar.f196450a);
    }

    /* JADX INFO: renamed from: c */
    public void m37406c(p3m p3mVar) {
        this.f21990a.add(p3mVar);
    }

    /* JADX INFO: renamed from: d */
    public List<p3m> m37407d() {
        return this.f21990a;
    }

    /* JADX INFO: renamed from: e */
    public void m37408e(StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        for (p3m p3mVar : this.f21990a) {
            if (p3mVar instanceof y5l) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((y5l) p3mVar);
            } else if (p3mVar instanceof SwipeDialogOmsLimitStrategy) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add((SwipeDialogOmsLimitStrategy) p3mVar);
            } else {
                arrayList.add(p3mVar);
            }
        }
        this.f21990a.clear();
        if (strategyType == StrategyType.home) {
            if (!vwb.m200296J(arrayList2)) {
                Collections.sort(arrayList2, new Comparator() { // from class: l.f0e
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return DialogStrategyQueue.m37405b((y5l) obj, (y5l) obj2);
                    }
                });
                this.f21990a.addAll(arrayList2);
            }
        } else if (strategyType == StrategyType.swipe && !vwb.m200296J(arrayList3)) {
            Collections.sort(arrayList3, new Comparator() { // from class: l.g0e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DialogStrategyQueue.m37404a((SwipeDialogOmsLimitStrategy) obj, (SwipeDialogOmsLimitStrategy) obj2);
                }
            });
            this.f21990a.addAll(arrayList3);
        }
        if (!vwb.m200296J(arrayList)) {
            this.f21990a.addAll(arrayList);
        }
        boolean zM200296J = vwb.m200296J(this.f21990a);
        List<p3m> list = this.f21990a;
        if (zM200296J) {
            list.add(new a83());
        } else {
            list.add(0, new a83());
        }
    }
}
