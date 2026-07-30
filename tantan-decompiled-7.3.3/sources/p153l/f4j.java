package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.home.view.FourSelectOneAdCard;

/* JADX INFO: loaded from: classes3.dex */
public class f4j implements sxl0 {
    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141641z, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof FourSelectOneAdCard) {
            ((FourSelectOneAdCard) view).m47286f(i);
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
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            CoreModule.m30933P().m143405a().mo34530jl(jamVar.getIVirtualCardContext(), jamVar.getIVirtualCardUserInfoProxy().fourSelectOneAdCardData.firstIds);
            CoreModule.f18264c.f20381e0.f89131T4.put(0);
        } else {
            vxd0 vxd0Var = CoreModule.f18264c.f20381e0.f89131T4;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
            if (CoreModule.f18264c.f20381e0.f89131T4.get().intValue() >= 3) {
                CoreModule.f18264c.f20381e0.f89123S4.put(Long.valueOf(pzi0.m174454o()));
                CoreModule.f18264c.f20381e0.f89131T4.put(0);
            }
        }
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
