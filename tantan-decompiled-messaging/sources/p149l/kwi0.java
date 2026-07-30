package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksAct;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class kwi0 {
    /* JADX INFO: renamed from: a */
    public static void m147546a(TopPicksAct topPicksAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topPicksAct._picks_content__layout = (FrameLayout) viewGroup.getChildAt(0);
        topPicksAct._navigation_bar = (VNavigationBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m147547b(TopPicksAct topPicksAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95959q5, viewGroup, false);
        m147546a(topPicksAct, viewInflate);
        return viewInflate;
    }
}
