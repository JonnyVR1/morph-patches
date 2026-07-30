package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class xen {
    /* JADX INFO: renamed from: a */
    public static void m208584a(wen wenVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wenVar._page_title_bar = (VNavigationBar) viewGroup.getChildAt(0);
        wenVar._question_list = (VRecyclerView) viewGroup.getChildAt(1);
        wenVar._vipService = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m208585b(wen wenVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162661E, viewGroup, false);
        m208584a(wenVar, viewInflate);
        return viewInflate;
    }
}
