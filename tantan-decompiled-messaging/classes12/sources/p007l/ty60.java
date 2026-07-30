package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ty60 {
    /* JADX INFO: renamed from: a */
    public static void m14684a(sy60 sy60Var, View view) {
        sy60Var.f13113a = view.findViewById(b5c0.f5946A1);
        sy60Var.f13114b = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f6024a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m14685b(sy60 sy60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11167Z1, viewGroup, false);
        m14684a(sy60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m14686c(sy60 sy60Var) {
        sy60Var.f13113a = null;
        sy60Var.f13114b = null;
    }
}
