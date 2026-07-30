package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;

/* JADX INFO: loaded from: classes11.dex */
public class p8l implements g6m<C19323a, Boolean> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f151039a;

    /* JADX INFO: renamed from: l.p8l$a */
    public static class C19323a implements e2m {

        /* JADX INFO: renamed from: a */
        public NewNewHomeFrag f151040a;

        /* JADX INFO: renamed from: b */
        public b240 f151041b;

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnGlobalLayoutListenerC8017b f151042c;

        public C19323a(NewNewHomeFrag newNewHomeFrag, b240 b240Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
            this.f151040a = newNewHomeFrag;
            this.f151041b = b240Var;
            this.f151042c = viewTreeObserverOnGlobalLayoutListenerC8017b;
        }

        /* JADX INFO: renamed from: a */
        public Act m171258a() {
            return this.f151042c.act();
        }
    }

    public p8l() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f151039a = dialogStrategyQueue;
        dal.m115123a(dialogStrategyQueue);
        dialogStrategyQueue.m38411e(DialogStrategyQueue.StrategyType.home);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(C19323a c19323a) {
        for (g6m g6mVar : this.f151039a.m38410d()) {
            if (g6mVar instanceof AbstractC18774n4) {
                AbstractC18774n4 abstractC18774n4 = (AbstractC18774n4) g6mVar;
                if (abstractC18774n4.mo38501b(c19323a)) {
                    return abstractC18774n4.mo38500a(c19323a);
                }
            }
        }
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C19323a c19323a) {
        return true;
    }
}
