package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ni50 implements ool0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f139061a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f139062b;

    /* JADX INFO: renamed from: c */
    public User f139063c;

    /* JADX INFO: renamed from: d */
    public boolean f139064d = false;

    /* JADX INFO: renamed from: e */
    public boolean f139065e = false;

    public ni50(NewNewHomeFrag newNewHomeFrag) {
        this.f139061a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    private void m159491k() {
        this.f139061a.f21678C.m37286e6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m159492l() {
        CoreModule.f17545c.f19663m0.m30982B8(this.f139063c.f56011id);
        qyb0.m177031I(this.f139063c.f56011id);
        m159491k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m159493m(Boolean bool, String str) {
        this.f139061a.f21678C.m37125A2().mo38809d();
        if (this.f139064d) {
            return;
        }
        this.f139064d = true;
        ui50.m193863i(this.f139063c.f56011id);
        ui50.m193861g(this.f139061a.act(), this.f139063c.f56011id);
        e51.m114744I(this.f139061a, new Runnable() { // from class: l.mi50
            @Override // java.lang.Runnable
            public final void run() {
                this.f133942a.m159492l();
            }
        }, 200L);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95982rb, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        this.f139064d = false;
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m35147O0(false);
            view2.postDelayed(new Runnable() { // from class: l.ki50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m35147O0(true);
                }
            }, 1000L);
        }
        OnlineMatchBaseCardView onlineMatchBaseCardView = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (!vwb.m200296J(partialListOptM221515e.loaded)) {
            this.f139062b = partialListOptM221515e.loaded.get(i);
        }
        User user = this.f139062b.quickChatCardWrapper.getUser();
        this.f139063c = user;
        if (NullChecker.m81304b(user)) {
            onlineMatchBaseCardView.mo50306f(this.f139062b.quickChatCardWrapper, new f30() { // from class: l.li50
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f128168a.m159493m((Boolean) obj, (String) obj2);
                }
            });
        }
        if (this.f139065e) {
            return;
        }
        this.f139065e = true;
        ui50.m193864j(this.f139063c.f56011id);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return true;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f17545c.f19663m0.m31031O5();
        if (swipeDirection == swipeDirection2) {
            ui50.m193862h(this.f139063c.f56011id);
        } else if (!this.f139064d) {
            this.f139064d = true;
            ui50.m193863i(this.f139063c.f56011id);
            ui50.m193861g(this.f139061a.act(), this.f139063c.f56011id);
        }
        qyb0.m177031I(this.f139063c.f56011id);
        return VSwipeStack.OnCardSwipeResult.pass;
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
