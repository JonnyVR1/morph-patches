package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundConstraintLayout;
import p151v.VDraweeView;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class hwc0 {
    /* JADX INFO: renamed from: a */
    public static void m137471a(gwc0 gwc0Var, View view) {
        gwc0Var._root_layout = (RoundConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gwc0Var._bg_img = (VDraweeView) viewGroup.getChildAt(0);
        gwc0Var._list = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        gwc0Var._bt_close = (ImageView) viewGroup.getChildAt(2);
        gwc0Var._bottom_monolayer_1 = viewGroup.getChildAt(3);
        gwc0Var._bottom_monolayer_2 = viewGroup.getChildAt(4);
        gwc0Var._bottom_monolayer = (VDraweeView) viewGroup.getChildAt(5);
        gwc0Var._bt = (RoundButton) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m137472b(gwc0 gwc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125438H5, viewGroup, false);
        m137471a(gwc0Var, viewInflate);
        return viewInflate;
    }
}
