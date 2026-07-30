package com.p051p1.mobile.putong.core.newui.home.base.impl;

import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p153l.g6m;
import p153l.jyb;
import p153l.o8l;
import p153l.p83;
import p153l.pk50;

/* JADX INFO: loaded from: classes11.dex */
public class DialogStrategyQueue {

    /* JADX INFO: renamed from: a */
    public List<g6m> f22732a = new ArrayList();

    public enum StrategyType {
        home,
        swipe
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m38407a(SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy, SwipeDialogOmsLimitStrategy swipeDialogOmsLimitStrategy2) {
        return pk50.m172568j().m172574f().m181660X(swipeDialogOmsLimitStrategy2.f22792g) - pk50.m172568j().m172574f().m181660X(swipeDialogOmsLimitStrategy.f22792g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m38408b(o8l o8lVar, o8l o8lVar2) {
        return pk50.m172568j().m172574f().m181660X(o8lVar2.f145424a) - pk50.m172568j().m172574f().m181660X(o8lVar.f145424a);
    }

    /* JADX INFO: renamed from: c */
    public void m38409c(g6m g6mVar) {
        this.f22732a.add(g6mVar);
    }

    /* JADX INFO: renamed from: d */
    public List<g6m> m38410d() {
        return this.f22732a;
    }

    /* JADX INFO: renamed from: e */
    public void m38411e(StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        for (g6m g6mVar : this.f22732a) {
            if (g6mVar instanceof o8l) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((o8l) g6mVar);
            } else if (g6mVar instanceof SwipeDialogOmsLimitStrategy) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                arrayList3.add((SwipeDialogOmsLimitStrategy) g6mVar);
            } else {
                arrayList.add(g6mVar);
            }
        }
        this.f22732a.clear();
        if (strategyType == StrategyType.home) {
            if (!jyb.m147479J(arrayList2)) {
                Collections.sort(arrayList2, new Comparator() { // from class: l.t1e
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return DialogStrategyQueue.m38408b((o8l) obj, (o8l) obj2);
                    }
                });
                this.f22732a.addAll(arrayList2);
            }
        } else if (strategyType == StrategyType.swipe && !jyb.m147479J(arrayList3)) {
            Collections.sort(arrayList3, new Comparator() { // from class: l.u1e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DialogStrategyQueue.m38407a((SwipeDialogOmsLimitStrategy) obj, (SwipeDialogOmsLimitStrategy) obj2);
                }
            });
            this.f22732a.addAll(arrayList3);
        }
        if (!jyb.m147479J(arrayList)) {
            this.f22732a.addAll(arrayList);
        }
        boolean zM147479J = jyb.m147479J(this.f22732a);
        List<g6m> list = this.f22732a;
        if (zM147479J) {
            list.add(new p83());
        } else {
            list.add(0, new p83());
        }
    }
}
