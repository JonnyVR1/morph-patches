package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class z670 {
    /* JADX INFO: renamed from: a */
    public static void m218772a(y670 y670Var, View view) {
        y670Var.f197637a = (VFrame) view.findViewById(hdc0.f108818A1);
        y670Var.f197638b = (FeedMaxHeightRecyclerView) view.findViewById(hdc0.f108896a1);
    }

    /* JADX INFO: renamed from: b */
    public static View m218773b(y670 y670Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173617Z1, viewGroup, false);
        m218772a(y670Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m218774c(y670 y670Var) {
        y670Var.f197637a = null;
        y670Var.f197638b = null;
    }
}
