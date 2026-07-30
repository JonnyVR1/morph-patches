package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VPullUpRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class c1n {
    /* JADX INFO: renamed from: a */
    public static void m104868a(b1n b1nVar, View view) {
        b1nVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b1nVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        b1nVar._list = (VPullUpRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m104869b(b1n b1nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95623W4, viewGroup, false);
        m104868a(b1nVar, viewInflate);
        return viewInflate;
    }
}
