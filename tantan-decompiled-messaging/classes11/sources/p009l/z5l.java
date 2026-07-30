package p009l;

import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p1.mobile.android.app.Act;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class z5l implements p3m<C1346a, Boolean> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f23486a;

    /* JADX INFO: renamed from: l.z5l$a */
    public static class C1346a implements kzl {

        /* JADX INFO: renamed from: a */
        public NewNewHomeFrag f23487a;

        /* JADX INFO: renamed from: b */
        public nt30 f23488b;

        /* JADX INFO: renamed from: c */
        public ViewTreeObserverOnGlobalLayoutListenerC0030b f23489c;

        public C1346a(NewNewHomeFrag newNewHomeFrag, nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
            this.f23487a = newNewHomeFrag;
            this.f23488b = nt30Var;
            this.f23489c = viewTreeObserverOnGlobalLayoutListenerC0030b;
        }

        /* JADX INFO: renamed from: a */
        public Act m25611a() {
            return this.f23489c.act();
        }
    }

    public z5l() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f23486a = dialogStrategyQueue;
        n7l.m18803a(dialogStrategyQueue);
        dialogStrategyQueue.m1379e(DialogStrategyQueue.StrategyType.home);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(C1346a c1346a) {
        for (p3m p3mVar : this.f23486a.m1378d()) {
            if (p3mVar instanceof AbstractC1065o4) {
                AbstractC1065o4 abstractC1065o4 = (AbstractC1065o4) p3mVar;
                if (abstractC1065o4.mo1469b(c1346a)) {
                    return abstractC1065o4.mo1468a(c1346a);
                }
            }
        }
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C1346a c1346a) {
        return true;
    }
}
