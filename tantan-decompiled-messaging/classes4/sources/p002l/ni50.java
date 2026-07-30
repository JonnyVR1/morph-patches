package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.f30;
import l.f6c0;
import l.ool0;
import l.qyb0;
import l.t7m;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ni50 implements ool0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f16043a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f16044b;

    /* JADX INFO: renamed from: c */
    public User f16045c;

    /* JADX INFO: renamed from: d */
    public boolean f16046d = false;

    /* JADX INFO: renamed from: e */
    public boolean f16047e = false;

    public ni50(NewNewHomeFrag newNewHomeFrag) {
        this.f16043a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    private void m18765k() {
        this.f16043a.C.e6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m18766l() {
        CoreModule.c.m0.B8(((DbObject) this.f16045c).id);
        qyb0.I(((DbObject) this.f16045c).id);
        m18765k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m18767m(Boolean bool, String str) {
        this.f16043a.C.A2().d();
        if (this.f16046d) {
            return;
        }
        this.f16046d = true;
        ui50.m23478i(((DbObject) this.f16045c).id);
        ui50.m23476g(this.f16043a.Y4(), ((DbObject) this.f16045c).id);
        e51.I(this.f16043a, new Runnable() { // from class: l.mi50
            @Override // java.lang.Runnable
            public final void run() {
                this.f15391a.m18766l();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: d */
    public View m18770d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.rb, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m18771e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        this.f16046d = false;
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).O0(false);
            view2.postDelayed(new Runnable() { // from class: l.ki50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).O0(true);
                }
            }, 1000L);
        }
        OnlineMatchBaseCardView onlineMatchBaseCardView = (OnlineMatchBaseCardView) view;
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (!vwb.J(partialListOpt.loaded)) {
            this.f16044b = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
        }
        User user = this.f16044b.quickChatCardWrapper.getUser();
        this.f16045c = user;
        if (NullChecker.b(user)) {
            onlineMatchBaseCardView.mo737f(this.f16044b.quickChatCardWrapper, new f30() { // from class: l.li50
                public final void call(Object obj, Object obj2) {
                    this.f14881a.m18767m((Boolean) obj, (String) obj2);
                }
            });
        }
        if (this.f16047e) {
            return;
        }
        this.f16047e = true;
        ui50.m23479j(((DbObject) this.f16045c).id);
    }

    /* JADX INFO: renamed from: f */
    public boolean m18772f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m18773g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.c.m0.O5();
        if (swipeDirection == swipeDirection2) {
            ui50.m23477h(((DbObject) this.f16045c).id);
        } else if (!this.f16046d) {
            this.f16046d = true;
            ui50.m23478i(((DbObject) this.f16045c).id);
            ui50.m23476g(this.f16043a.Y4(), ((DbObject) this.f16045c).id);
        }
        qyb0.I(((DbObject) this.f16045c).id);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m18768b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m18769c(View view) {
    }
}
