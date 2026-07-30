package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;

/* JADX INFO: loaded from: classes11.dex */
public class t9e0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public SeeMyselfRootLayout f169020a;

    /* JADX INFO: renamed from: b */
    public NewNewHomeFrag f169021b;

    public t9e0(NewNewHomeFrag newNewHomeFrag) {
        this.f169021b = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        SeeMyselfRootLayout seeMyselfRootLayout = (SeeMyselfRootLayout) layoutInflater.inflate(f6c0.f95470Mb, viewGroup, false);
        this.f169020a = seeMyselfRootLayout;
        seeMyselfRootLayout.setRenderType(0);
        return this.f169020a;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof SeeMyselfRootLayout) {
            ((SeeMyselfRootLayout) view).m38601O(this.f169021b.act());
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
