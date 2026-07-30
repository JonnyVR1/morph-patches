package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p147v.VMenuBar;
import p147v.VRecyclerView;
import p147v.VSearchBar;

/* JADX INFO: loaded from: classes12.dex */
public class h340 {
    /* JADX INFO: renamed from: a */
    public static void m129159a(g340 g340Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        g340Var.f100340a = (VMenuBar) viewGroup.getChildAt(0);
        g340Var.f100341b = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g340Var.f100342c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        g340Var.f100343d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m129160b(g340 g340Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142011C2, viewGroup, false);
        m129159a(g340Var, viewInflate);
        return viewInflate;
    }
}
