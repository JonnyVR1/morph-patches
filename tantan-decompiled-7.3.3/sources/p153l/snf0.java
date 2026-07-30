package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundView;
import p151v.VDraweeView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class snf0 {
    /* JADX INFO: renamed from: a */
    public static void m186914a(rnf0 rnf0Var, View view) {
        rnf0Var._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rnf0Var._top = (RoundView) viewGroup.getChildAt(0);
        rnf0Var._bg_img = (VDraweeView) viewGroup.getChildAt(1);
        rnf0Var._list = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        rnf0Var._bottom_monolayer_1 = viewGroup.getChildAt(3);
        rnf0Var._bottom_monolayer_2 = viewGroup.getChildAt(4);
        rnf0Var._bt = (RoundButton) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m186915b(rnf0 rnf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125501L4, viewGroup, false);
        m186914a(rnf0Var, viewInflate);
        return viewInflate;
    }
}
