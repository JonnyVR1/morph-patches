package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class ty60 {
    /* JADX INFO: renamed from: a */
    public static void m191003a(sy60 sy60Var, View view) {
        sy60Var.f166898a = (VFrame) view.findViewById(b5c0.f73465A1);
        sy60Var.f166899b = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f73543a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191004b(sy60 sy60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142148Z1, viewGroup, false);
        m191003a(sy60Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m191005c(sy60 sy60Var) {
        sy60Var.f166898a = null;
        sy60Var.f166899b = null;
    }
}
