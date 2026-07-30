package com.p000p1.mobile.putong.core.newui.home.base.impl;

import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l.vwb;
import p009l.a83;
import p009l.ic50;
import p009l.p3m;
import p009l.y5l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DialogStrategyQueue {

    /* JADX INFO: renamed from: a */
    public List<p3m> f768a = new ArrayList();

    public enum StrategyType {
        home,
        swipe
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m1375a(SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy, SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy2) {
        return ic50.m16316j().m16322f().m17403X(swipeDialogOmsLimitStrategy2.f828g) - ic50.m16316j().m16322f().m17403X(swipeDialogOmsLimitStrategy.f828g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m1376b(y5l y5lVar, y5l y5lVar2) {
        return ic50.m16316j().m16322f().m17403X(y5lVar2.f22902a) - ic50.m16316j().m16322f().m17403X(y5lVar.f22902a);
    }

    /* JADX INFO: renamed from: c */
    public void m1377c(p3m p3mVar) {
        this.f768a.add(p3mVar);
    }

    /* JADX INFO: renamed from: d */
    public List<p3m> m1378d() {
        return this.f768a;
    }

    /* JADX INFO: renamed from: e */
    public void m1379e(StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        for (p3m p3mVar : this.f768a) {
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
        this.f768a.clear();
        if (strategyType == StrategyType.home) {
            if (!vwb.J(arrayList2)) {
                Collections.sort(arrayList2, new Comparator() { // from class: l.f0e
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return DialogStrategyQueue.m1376b((y5l) obj, (y5l) obj2);
                    }
                });
                this.f768a.addAll(arrayList2);
            }
        } else if (strategyType == StrategyType.swipe && !vwb.J(arrayList3)) {
            Collections.sort(arrayList3, new Comparator() { // from class: l.g0e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DialogStrategyQueue.m1375a((SwipeDialogOmsLimitStrategy) obj, (SwipeDialogOmsLimitStrategy) obj2);
                }
            });
            this.f768a.addAll(arrayList3);
        }
        if (!vwb.J(arrayList)) {
            this.f768a.addAll(arrayList);
        }
        boolean zJ = vwb.J(this.f768a);
        List<p3m> list = this.f768a;
        if (zJ) {
            list.add(new a83());
        } else {
            list.add(0, new a83());
        }
    }
}
