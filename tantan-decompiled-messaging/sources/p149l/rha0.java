package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class rha0 {
    /* JADX INFO: renamed from: a */
    public static void m179341a(qha0 qha0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qha0Var._first_title = (TextView) viewGroup.getChildAt(0);
        qha0Var._recycler_info = (VRecyclerView) viewGroup.getChildAt(1);
        qha0Var._action_view = (ProfileLoopActionLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m179342b(qha0 qha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137388y, viewGroup, false);
        m179341a(qha0Var, viewInflate);
        return viewInflate;
    }
}
