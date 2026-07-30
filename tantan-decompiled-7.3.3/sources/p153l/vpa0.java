package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class vpa0 {
    /* JADX INFO: renamed from: a */
    public static void m202205a(upa0 upa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        upa0Var._first_title = (TextView) viewGroup.getChildAt(0);
        upa0Var._recycler_info = (VRecyclerView) viewGroup.getChildAt(1);
        upa0Var._action_view = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m202206b(upa0 upa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167602y, viewGroup, false);
        m202205a(upa0Var, viewInflate);
        return viewInflate;
    }
}
