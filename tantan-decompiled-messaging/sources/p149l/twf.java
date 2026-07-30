package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.fakecard.FakeDailogCard;

/* JADX INFO: loaded from: classes10.dex */
public class twf implements ool0 {

    /* JADX INFO: renamed from: a */
    public final eyl f172389a;

    public twf(eyl eylVar) {
        this.f172389a = eylVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m190856k() {
        m190857j(this.f172389a.mo36758q1()).run();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111711f, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        ((FakeDailogCard) view).m45388f(new d30() { // from class: l.rwf
            @Override // p149l.d30
            public final void call() {
                this.f161330a.m190856k();
            }
        });
        if (i == 0) {
            o6j0.m162864h("e_fakeuser_update_photo_card", this.f172389a.mo36761u0(), new o6j0.C18854a[0]);
            this.f172389a.mo36742O3();
            this.f172389a.mo36740J0();
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m190857j(final Act act) {
        return new Runnable() { // from class: l.swf
            @Override // java.lang.Runnable
            public final void run() {
                this.f166659a.m190858l(act);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m190858l(Act act) {
        o6j0.m162859c("e_fakeuser_update_photo_card", this.f172389a.mo36761u0(), new o6j0.C18854a[0]);
        CoreModule.m29935P().m94651a().mo33348Jl(act);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
