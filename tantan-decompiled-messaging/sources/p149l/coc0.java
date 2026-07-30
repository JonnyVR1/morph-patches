package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundConstraintLayout;
import p147v.VDraweeView;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class coc0 {
    /* JADX INFO: renamed from: a */
    public static void m108007a(boc0 boc0Var, View view) {
        boc0Var._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boc0Var._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        boc0Var._list = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        boc0Var._bt_close = (ImageView) viewGroup.getChildAt(2);
        boc0Var._bottom_monolayer_1 = viewGroup.getChildAt(3);
        boc0Var._bottom_monolayer_2 = viewGroup.getChildAt(4);
        boc0Var._bottom_monolayer = (VDraweeView) viewGroup.getChildAt(5);
        boc0Var._bt = (RoundButton) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m108008b(boc0 boc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95368G5, viewGroup, false);
        m108007a(boc0Var, viewInflate);
        return viewInflate;
    }
}
