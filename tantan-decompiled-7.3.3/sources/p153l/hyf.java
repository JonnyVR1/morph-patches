package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.fakecard.FakeDailogCard;

/* JADX INFO: loaded from: classes3.dex */
public class hyf implements sxl0 {

    /* JADX INFO: renamed from: a */
    public final x0m f112111a;

    public hyf(x0m x0mVar) {
        this.f112111a = x0mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m137721k() {
        m137722j(this.f112111a.mo37761q1()).run();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141621f, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        ((FakeDailogCard) view).m46571f(new x20() { // from class: l.fyf
            @Override // p153l.x20
            public final void call() {
                this.f101370a.m137721k();
            }
        });
        if (i == 0) {
            sfj0.m185601h("e_fakeuser_update_photo_card", this.f112111a.mo37764u0(), new sfj0.C20032a[0]);
            this.f112111a.mo37745O3();
            this.f112111a.mo37743J0();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public final Runnable m137722j(final Act act) {
        return new Runnable() { // from class: l.gyf
            @Override // java.lang.Runnable
            public final void run() {
                this.f107046a.m137723l(act);
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m137723l(Act act) {
        sfj0.m185596c("e_fakeuser_update_photo_card", this.f112111a.mo37764u0(), new sfj0.C20032a[0]);
        CoreModule.m30933P().m143405a().mo34351Jl(act);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
