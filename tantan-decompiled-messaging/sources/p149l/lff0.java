package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundView;
import p147v.VDraweeView;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class lff0 {
    /* JADX INFO: renamed from: a */
    public static void m149676a(kff0 kff0Var, View view) {
        kff0Var._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kff0Var._top = (RoundView) viewGroup.getChildAt(0);
        kff0Var._bg_img = (VDraweeView) viewGroup.getChildAt(1);
        kff0Var._list = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        kff0Var._bottom_monolayer_1 = viewGroup.getChildAt(3);
        kff0Var._bottom_monolayer_2 = viewGroup.getChildAt(4);
        kff0Var._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m149677b(kff0 kff0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95447L4, viewGroup, false);
        m149676a(kff0Var, viewInflate);
        return viewInflate;
    }
}
