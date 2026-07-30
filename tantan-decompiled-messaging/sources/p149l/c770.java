package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.MomentPostBar;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class c770 {
    /* JADX INFO: renamed from: a */
    public static void m105527a(b770 b770Var, View view) {
        b770Var.f73923a = (VLinear) view.findViewById(b5c0.f73465A1);
        ViewGroup viewGroup = (ViewGroup) view;
        b770Var.f73924b = (RelativeLayout) viewGroup.getChildAt(0);
        b770Var.f73925c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        b770Var.f73926d = (MomentPostBar) viewGroup.getChildAt(1);
        b770Var.f73927e = (FeedDraftView) viewGroup.getChildAt(2);
        b770Var.f73928f = (FrameLayout) viewGroup.getChildAt(3);
        b770Var.f73929g = (FrameLayout) viewGroup.getChildAt(4);
        b770Var.f73930h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m105528b(b770 b770Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142305v5, viewGroup, false);
        m105527a(b770Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m105529c(b770 b770Var) {
        b770Var.f73923a = null;
        b770Var.f73924b = null;
        b770Var.f73925c = null;
        b770Var.f73926d = null;
        b770Var.f73927e = null;
        b770Var.f73928f = null;
        b770Var.f73929g = null;
        b770Var.f73930h = null;
    }
}
