package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.f6c0;
import l.ool0;
import l.t7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class t9e0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public SeeMyselfRootLayout f20581a;

    /* JADX INFO: renamed from: b */
    public NewNewHomeFrag f20582b;

    public t9e0(NewNewHomeFrag newNewHomeFrag) {
        this.f20582b = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: d */
    public View m22469d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        SeeMyselfRootLayout seeMyselfRootLayout = (SeeMyselfRootLayout) layoutInflater.inflate(f6c0.Mb, viewGroup, false);
        this.f20581a = seeMyselfRootLayout;
        seeMyselfRootLayout.setRenderType(0);
        return this.f20581a;
    }

    /* JADX INFO: renamed from: e */
    public void m22470e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof SeeMyselfRootLayout) {
            ((SeeMyselfRootLayout) view).m2586O(this.f20582b.act());
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m22471f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m22472g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m22467b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m22468c(View view) {
    }
}
