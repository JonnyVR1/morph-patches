package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.freetrial.FreeTrialCard;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.d30;
import l.e30;
import l.eyl;
import l.i6c0;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class a6j implements ool0 {

    /* JADX INFO: renamed from: a */
    public VirtualCardType f2734a;

    /* JADX INFO: renamed from: b */
    public eyl f2735b;

    public a6j(eyl eylVar) {
        this.f2735b = eylVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m5282i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m5283j(Boolean bool, FreeTrialOperateResult freeTrialOperateResult) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m5285m() {
        this.f2735b.V(SwipeDirection.RIGHT);
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.g, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f2734a = virtualCardType;
        ((FreeTrialCard) view).m2740f(virtualCardType, new d30() { // from class: l.w5j
            public final void call() {
                this.f8123a.m5285m();
            }
        });
        this.f2735b.O3();
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT;
        String strUn = CoreModule.P().a().Un(this.f2734a);
        m5292l(strUn, Boolean.valueOf(z));
        if (z) {
            CoreModule.P().a().ei(strUn);
        }
        this.f2735b.I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m5292l(final String str, final Boolean bool) {
        this.f2735b.z1(CoreModule.c.v1.j3(str, bool)).take(1).filter(new w9j() { // from class: l.x5j
            public final Object call(Object obj) {
                return a6j.m5283j(bool, (FreeTrialOperateResult) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.y5j
            public final void call(Object obj) {
                this.f8994a.m5293n(str, (FreeTrialOperateResult) obj);
            }
        }, new e30() { // from class: l.z5j
            public final void call(Object obj) {
                a6j.m5282i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m5293n(String str, FreeTrialOperateResult freeTrialOperateResult) {
        CoreModule.P().a().vs(this.f2735b, str, freeTrialOperateResult);
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}
