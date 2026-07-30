package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.toppicks.TopPicksItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rwi0 {
    /* JADX INFO: renamed from: a */
    public static void m9197a(TopPicksItemView topPicksItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topPicksItemView.b = viewGroup.getChildAt(0);
        topPicksItemView.c = viewGroup.getChildAt(1);
        topPicksItemView.d = viewGroup.getChildAt(2);
        topPicksItemView.e = viewGroup.getChildAt(3);
        topPicksItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        topPicksItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        topPicksItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        topPicksItemView.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        topPicksItemView.j = viewGroup.getChildAt(4);
        topPicksItemView.k = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        topPicksItemView.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        topPicksItemView.m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }
}
