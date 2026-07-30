package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;

/* JADX INFO: loaded from: classes11.dex */
public class yhe0 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public SeeMyselfRootLayout f199960a;

    /* JADX INFO: renamed from: b */
    public NewNewHomeFrag f199961b;

    public yhe0(NewNewHomeFrag newNewHomeFrag) {
        this.f199961b = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        SeeMyselfRootLayout seeMyselfRootLayout = (SeeMyselfRootLayout) layoutInflater.inflate(kec0.f125636Tb, viewGroup, false);
        this.f199960a = seeMyselfRootLayout;
        seeMyselfRootLayout.setRenderType(0);
        return this.f199960a;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof SeeMyselfRootLayout) {
            ((SeeMyselfRootLayout) view).m39604O(this.f199961b.act());
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
