package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.home.view.FourSelectOneAdCard;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.i6c0;
import l.mqi0;
import l.tpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k1j implements ool0 {
    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.z, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, @Nullable View view2) {
        if (view instanceof FourSelectOneAdCard) {
            ((FourSelectOneAdCard) view).m3468f(i);
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        if (swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP) {
            CoreModule.P().a().jl(t7mVar.getIVirtualCardContext(), t7mVar.getIVirtualCardUserInfoProxy().fourSelectOneAdCardData.firstIds);
            CoreModule.c.e0.T4.put(0);
        } else {
            tpd0 tpd0Var = CoreModule.c.e0.T4;
            tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
            if (((Integer) CoreModule.c.e0.T4.get()).intValue() >= 3) {
                CoreModule.c.e0.S4.put(Long.valueOf(mqi0.o()));
                CoreModule.c.e0.T4.put(0);
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}
