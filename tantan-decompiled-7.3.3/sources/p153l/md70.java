package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p151v.VFrame;
import p151v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class md70 {
    /* JADX INFO: renamed from: a */
    public static void m157960a(ld70 ld70Var, View view) {
        ld70Var.f131418n = (VFrame) view.findViewById(hdc0.f108818A1);
        ld70Var.f131419o = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        ld70Var.f131420p = (FeedMaxHeightRecyclerView) view.findViewById(hdc0.f108896a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m157961b(ld70 ld70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173645d2, viewGroup, false);
        m157960a(ld70Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m157962c(ld70 ld70Var) {
        ld70Var.f131418n = null;
        ld70Var.f131419o = null;
        ld70Var.f131420p = null;
    }
}
