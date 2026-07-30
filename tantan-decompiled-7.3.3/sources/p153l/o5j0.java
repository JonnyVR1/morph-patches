package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksAct;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class o5j0 {
    /* JADX INFO: renamed from: a */
    public static void m166153a(TopPicksAct topPicksAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topPicksAct._picks_content__layout = (FrameLayout) viewGroup.getChildAt(0);
        topPicksAct._navigation_bar = (VNavigationBar) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m166154b(TopPicksAct topPicksAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126030r5, viewGroup, false);
        m166153a(topPicksAct, viewInflate);
        return viewInflate;
    }
}
