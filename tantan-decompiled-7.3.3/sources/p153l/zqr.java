package p153l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.active.LiveActiveCard;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class zqr implements sxl0 {

    /* JADX INFO: renamed from: a */
    public Active f205649a;

    /* JADX INFO: renamed from: b */
    public x0m f205650b;

    /* JADX INFO: renamed from: c */
    public final String f205651c = "e_suggest_luckytt_card";

    /* JADX INFO: renamed from: d */
    public LiveActiveCard f205652d;

    public zqr(x0m x0mVar, Active active) {
        this.f205650b = x0mVar;
        this.f205649a = active;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141632q, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        LiveActiveCard liveActiveCard = this.f205652d;
        if (liveActiveCard == null || liveActiveCard != view) {
            LiveActiveCard liveActiveCard2 = (LiveActiveCard) view;
            this.f205652d = liveActiveCard2;
            liveActiveCard2.m45413c(this.f205650b, virtualCardType, this.f205649a, new x20() { // from class: l.yqr
                @Override // p153l.x20
                public final void call() {
                    this.f201236a.m221048i();
                }
            });
        }
        if (i == 0) {
            sfj0.m185601h("e_suggest_luckytt_card", this.f205650b.mo37764u0(), new sfj0.C20032a[0]);
            this.f205652d.f29180d = false;
            this.f205650b.mo37745O3();
            this.f205650b.mo37743J0();
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
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            sfj0.m185596c("e_suggest_luckytt_card", this.f205650b.mo37764u0(), new sfj0.C20032a[0]);
            Intent intentM81347a2 = WebViewAct.m81347a2(this.f205650b.mo37761q1(), "", this.f205649a.cardLandPageUrl);
            intentM81347a2.putExtra("hideNavigationBar", true);
            this.f205650b.mo37761q1().startActivity(intentM81347a2);
        }
        if (NullChecker.m82486a(this.f205652d)) {
            this.f205652d.f29180d = true;
        }
        this.f205650b.mo37742I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m221048i() {
        this.f205650b.mo37749V(SwipeDirection.RIGHT);
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
