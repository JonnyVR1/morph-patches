package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class ru10 {
    /* JADX INFO: renamed from: a */
    public static void m180848a(qu10 qu10Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qu10Var.f156414a = (VNavigationBar) viewGroup.getChildAt(0);
        qu10Var.f156415b = (RecyclerView) viewGroup.getChildAt(1);
        qu10Var.f156416c = (VText) viewGroup.getChildAt(2);
        qu10Var.f156417d = (VText) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m180849b(qu10 qu10Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96049va, viewGroup, false);
        m180848a(qu10Var, viewInflate);
        return viewInflate;
    }
}
