package p149l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.active.LiveActiveCard;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class yor implements ool0 {

    /* JADX INFO: renamed from: a */
    public Active f199344a;

    /* JADX INFO: renamed from: b */
    public eyl f199345b;

    /* JADX INFO: renamed from: c */
    public final String f199346c = "e_suggest_luckytt_card";

    /* JADX INFO: renamed from: d */
    public LiveActiveCard f199347d;

    public yor(eyl eylVar, Active active) {
        this.f199345b = eylVar;
        this.f199344a = active;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111722q, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        LiveActiveCard liveActiveCard = this.f199347d;
        if (liveActiveCard == null || liveActiveCard != view) {
            LiveActiveCard liveActiveCard2 = (LiveActiveCard) view;
            this.f199347d = liveActiveCard2;
            liveActiveCard2.m44230c(this.f199345b, virtualCardType, this.f199344a, new d30() { // from class: l.xor
                @Override // p149l.d30
                public final void call() {
                    this.f193878a.m215544i();
                }
            });
        }
        if (i == 0) {
            o6j0.m162864h("e_suggest_luckytt_card", this.f199345b.mo36761u0(), new o6j0.C18854a[0]);
            this.f199347d.f28332d = false;
            this.f199345b.mo36742O3();
            this.f199345b.mo36740J0();
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
        if (swipeDirection.getValue() == SwipeDirection.RIGHT.getValue() || swipeDirection.getValue() == SwipeDirection.UP.getValue()) {
            o6j0.m162859c("e_suggest_luckytt_card", this.f199345b.mo36761u0(), new o6j0.C18854a[0]);
            Intent intentM80164Z1 = WebViewAct.m80164Z1(this.f199345b.mo36758q1(), "", this.f199344a.cardLandPageUrl);
            intentM80164Z1.putExtra("hideNavigationBar", true);
            this.f199345b.mo36758q1().startActivity(intentM80164Z1);
        }
        if (NullChecker.m81303a(this.f199347d)) {
            this.f199347d.f28332d = true;
        }
        this.f199345b.mo36739I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m215544i() {
        this.f199345b.mo36746V(SwipeDirection.RIGHT);
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
