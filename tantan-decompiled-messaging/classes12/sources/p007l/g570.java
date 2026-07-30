package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g570 {
    /* JADX INFO: renamed from: a */
    public static void m10416a(f570 f570Var, View view) {
        f570Var.f7988n = view.findViewById(b5c0.f5946A1);
        f570Var.f7989o = ((ViewGroup) view).getChildAt(0);
        f570Var.f7990p = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f6024a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10417b(f570 f570Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11195d2, viewGroup, false);
        m10416a(f570Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m10418c(f570 f570Var) {
        f570Var.f7988n = null;
        f570Var.f7989o = null;
        f570Var.f7990p = null;
    }
}
