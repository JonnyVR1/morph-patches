package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VPullUpRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class c3n {
    /* JADX INFO: renamed from: a */
    public static void m107804a(b3n b3nVar, View view) {
        b3nVar._root = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b3nVar._navigation_bar = (VNavigationBar) viewGroup.getChildAt(0);
        b3nVar._list = (VPullUpRecyclerView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107805b(b3n b3nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125693X4, viewGroup, false);
        m107804a(b3nVar, viewInflate);
        return viewInflate;
    }
}
