package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p147v.VFrame;
import p147v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class g570 {
    /* JADX INFO: renamed from: a */
    public static void m124473a(f570 f570Var, View view) {
        f570Var.f94965n = (VFrame) view.findViewById(b5c0.f73465A1);
        f570Var.f94966o = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        f570Var.f94967p = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f73543a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124474b(f570 f570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142176d2, viewGroup, false);
        m124473a(f570Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m124475c(f570 f570Var) {
        f570Var.f94965n = null;
        f570Var.f94966o = null;
        f570Var.f94967p = null;
    }
}
