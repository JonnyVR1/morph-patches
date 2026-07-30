package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c770 {
    /* JADX INFO: renamed from: a */
    public static void m9103a(b770 b770Var, View view) {
        b770Var.f6137a = view.findViewById(b5c0.f5946A1);
        ViewGroup viewGroup = (ViewGroup) view;
        b770Var.f6138b = (RelativeLayout) viewGroup.getChildAt(0);
        b770Var.f6139c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        b770Var.f6140d = (MomentPostBar) viewGroup.getChildAt(1);
        b770Var.f6141e = (FeedDraftView) viewGroup.getChildAt(2);
        b770Var.f6142f = (FrameLayout) viewGroup.getChildAt(3);
        b770Var.f6143g = (FrameLayout) viewGroup.getChildAt(4);
        b770Var.f6144h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m9104b(b770 b770Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11324v5, viewGroup, false);
        m9103a(b770Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m9105c(b770 b770Var) {
        b770Var.f6137a = null;
        b770Var.f6138b = null;
        b770Var.f6139c = null;
        b770Var.f6140d = null;
        b770Var.f6141e = null;
        b770Var.f6142f = null;
        b770Var.f6143g = null;
        b770Var.f6144h = null;
    }
}
