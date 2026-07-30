package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class z5l implements p3m<C21640a, Boolean> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f201826a;

    /* JADX INFO: renamed from: l.z5l$a */
    public static class C21640a implements kzl {

        /* JADX INFO: renamed from: a */
        public NewNewHomeFrag f201827a;

        /* JADX INFO: renamed from: b */
        public nt30 f201828b;

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnGlobalLayoutListenerC7866b f201829c;

        public C21640a(NewNewHomeFrag newNewHomeFrag, nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
            this.f201827a = newNewHomeFrag;
            this.f201828b = nt30Var;
            this.f201829c = viewTreeObserverOnGlobalLayoutListenerC7866b;
        }

        /* JADX INFO: renamed from: a */
        public Act m217363a() {
            return this.f201829c.act();
        }
    }

    public z5l() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f201826a = dialogStrategyQueue;
        n7l.m158147a(dialogStrategyQueue);
        dialogStrategyQueue.m37408e(DialogStrategyQueue.StrategyType.home);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(C21640a c21640a) {
        for (p3m p3mVar : this.f201826a.m37407d()) {
            if (p3mVar instanceof AbstractC18834o4) {
                AbstractC18834o4 abstractC18834o4 = (AbstractC18834o4) p3mVar;
                if (abstractC18834o4.mo37498b(c21640a)) {
                    return abstractC18834o4.mo37497a(c21640a);
                }
            }
        }
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C21640a c21640a) {
        return true;
    }
}
