package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class xgn {
    /* JADX INFO: renamed from: a */
    public static void m210926a(wgn wgnVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wgnVar._page_title_bar = (VNavigationBar) viewGroup.getChildAt(0);
        wgnVar._question_list = (VRecyclerView) viewGroup.getChildAt(1);
        wgnVar._vipService = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m210927b(wgn wgnVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193775E, viewGroup, false);
        m210926a(wgnVar, viewInflate);
        return viewInflate;
    }
}
