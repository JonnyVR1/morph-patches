package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.fakecard.FakeDailogCard;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.d30;
import l.eyl;
import l.i6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class twf implements ool0 {

    /* JADX INFO: renamed from: a */
    public final eyl f7631a;

    public twf(eyl eylVar) {
        this.f7631a = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m9624k() {
        m9625j(this.f7631a.q1()).run();
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, View view2) {
        ((FakeDailogCard) view).m2715f(new d30() { // from class: l.rwf
            public final void call() {
                this.f7248a.m9624k();
            }
        });
        if (i == 0) {
            o6j0.m8408h("e_fakeuser_update_photo_card", this.f7631a.u0(), new o6j0.C3390a[0]);
            this.f7631a.O3();
            this.f7631a.J0();
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m9625j(final Act act) {
        return new Runnable() { // from class: l.swf
            @Override // java.lang.Runnable
            public final void run() {
                this.f7472a.m9626l(act);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9626l(Act act) {
        o6j0.m8403c("e_fakeuser_update_photo_card", this.f7631a.u0(), new o6j0.C3390a[0]);
        CoreModule.P().a().Jl(act);
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
