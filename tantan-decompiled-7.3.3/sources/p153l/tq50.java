package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class tq50 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f175677a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f175678b;

    /* JADX INFO: renamed from: c */
    public User f175679c;

    /* JADX INFO: renamed from: d */
    public boolean f175680d = false;

    /* JADX INFO: renamed from: e */
    public boolean f175681e = false;

    public tq50(NewNewHomeFrag newNewHomeFrag) {
        this.f175677a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    private void m192237k() {
        this.f175677a.f22420C.m38289e6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m192238l() {
        CoreModule.f18264c.f20405m0.m31985B8(this.f175679c.f56859id);
        u6c0.m194664I(this.f175679c.f56859id);
        m192237k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m192239m(Boolean bool, String str) {
        this.f175677a.f22420C.m38128A2().mo39812d();
        if (this.f175680d) {
            return;
        }
        this.f175680d = true;
        ar50.m99654i(this.f175679c.f56859id);
        ar50.m99652g(this.f175677a.act(), this.f175679c.f56859id);
        l51.m152889I(this.f175677a, new Runnable() { // from class: l.sq50
            @Override // java.lang.Runnable
            public final void run() {
                this.f170146a.m192238l();
            }
        }, 200L);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f126155yb, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        this.f175680d = false;
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m36150O0(false);
            view2.postDelayed(new Runnable() { // from class: l.qq50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m36150O0(true);
                }
            }, 1000L);
        }
        OnlineMatchBaseCardView onlineMatchBaseCardView = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (!jyb.m147479J(partialListOptM222761e.loaded)) {
            this.f175678b = partialListOptM222761e.loaded.get(i);
        }
        User user = this.f175678b.quickChatCardWrapper.getUser();
        this.f175679c = user;
        if (NullChecker.m82487b(user)) {
            onlineMatchBaseCardView.mo51489f(this.f175678b.quickChatCardWrapper, new z20() { // from class: l.rq50
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f164432a.m192239m((Boolean) obj, (String) obj2);
                }
            });
        }
        if (this.f175681e) {
            return;
        }
        this.f175681e = true;
        ar50.m99655j(this.f175679c.f56859id);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f18264c.f20405m0.m32034O5();
        if (swipeDirection == swipeDirection2) {
            ar50.m99653h(this.f175679c.f56859id);
        } else if (!this.f175680d) {
            this.f175680d = true;
            ar50.m99654i(this.f175679c.f56859id);
            ar50.m99652g(this.f175677a.act(), this.f175679c.f56859id);
        }
        u6c0.m194664I(this.f175679c.f56859id);
        return VSwipeStack.OnCardSwipeResult.pass;
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
