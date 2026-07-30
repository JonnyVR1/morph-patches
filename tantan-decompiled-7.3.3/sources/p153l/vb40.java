package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p151v.VMenuBar;
import p151v.VRecyclerView;
import p151v.VSearchBar;

/* JADX INFO: loaded from: classes13.dex */
public class vb40 {
    /* JADX INFO: renamed from: a */
    public static void m200685a(ub40 ub40Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ub40Var.f178262a = (VMenuBar) viewGroup.getChildAt(0);
        ub40Var.f178263b = (VSearchBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ub40Var.f178264c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ub40Var.f178265d = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m200686b(ub40 ub40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173480C2, viewGroup, false);
        m200685a(ub40Var, viewInflate);
        return viewInflate;
    }
}
