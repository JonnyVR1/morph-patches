package p006l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.active.LiveActiveCard;
import com.p1.mobile.putong.core.data.Active;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.eyl;
import l.o6j0;
import l.ool0;
import l.t7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yor implements ool0 {

    /* JADX INFO: renamed from: a */
    public Active f28327a;

    /* JADX INFO: renamed from: b */
    public eyl f28328b;

    /* JADX INFO: renamed from: c */
    public final String f28329c = "e_suggest_luckytt_card";

    /* JADX INFO: renamed from: d */
    public LiveActiveCard f28330d;

    public yor(eyl eylVar, Active active) {
        this.f28328b = eylVar;
        this.f28327a = active;
    }

    /* JADX INFO: renamed from: d */
    public View m28318d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f14256q, viewGroup, false);
    }

    /* JADX INFO: renamed from: e */
    public void m28319e(View view, int i, VirtualCardType virtualCardType, View view2) {
        LiveActiveCard liveActiveCard = this.f28330d;
        if (liveActiveCard == null || liveActiveCard != view) {
            LiveActiveCard liveActiveCard2 = (LiveActiveCard) view;
            this.f28330d = liveActiveCard2;
            liveActiveCard2.m7178c(this.f28328b, virtualCardType, this.f28327a, new d30() { // from class: l.xor
                public final void call() {
                    this.f27668a.m28322i();
                }
            });
        }
        if (i == 0) {
            o6j0.h("e_suggest_luckytt_card", this.f28328b.u0(), new o6j0.a[0]);
            this.f28330d.f4399d = false;
            this.f28328b.O3();
            this.f28328b.J0();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m28320f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m28321g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            o6j0.c("e_suggest_luckytt_card", this.f28328b.u0(), new o6j0.a[0]);
            Intent intentZ1 = WebViewAct.Z1(this.f28328b.q1(), "", this.f28327a.cardLandPageUrl);
            intentZ1.putExtra("hideNavigationBar", true);
            this.f28328b.q1().startActivity(intentZ1);
        }
        if (NullChecker.a(this.f28330d)) {
            this.f28330d.f4399d = true;
        }
        this.f28328b.I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m28322i() {
        this.f28328b.V(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: b */
    public void m28316b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m28317c(View view) {
    }
}
