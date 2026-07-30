package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class rzi0 {
    /* JADX INFO: renamed from: a */
    public static void m181755a(qzi0 qzi0Var, View view) {
        qzi0Var.f157050a = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        qzi0Var.f157051b = (VRecyclerView) view.findViewById(b5c0.f73540Z1);
        qzi0Var.f157052c = (CommonEmptyView) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181756b(qzi0 qzi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142192f4, viewGroup, false);
        m181755a(qzi0Var, viewInflate);
        return viewInflate;
    }
}
