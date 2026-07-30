package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.home.view.FourSelectOneAdCard;

/* JADX INFO: loaded from: classes10.dex */
public class k1j implements ool0 {
    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111731z, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof FourSelectOneAdCard) {
            ((FourSelectOneAdCard) view).m46103f(i);
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
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            CoreModule.m29935P().m94651a().mo33527jl(t7mVar.getIVirtualCardContext(), t7mVar.getIVirtualCardUserInfoProxy().fourSelectOneAdCardData.firstIds);
            CoreModule.f17545c.f19639e0.f149274T4.put(0);
        } else {
            tpd0 tpd0Var = CoreModule.f17545c.f19639e0.f149274T4;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
            if (CoreModule.f17545c.f19639e0.f149274T4.get().intValue() >= 3) {
                CoreModule.f17545c.f19639e0.f149266S4.put(Long.valueOf(mqi0.m155944o()));
                CoreModule.f17545c.f19639e0.f149274T4.put(0);
            }
        }
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
