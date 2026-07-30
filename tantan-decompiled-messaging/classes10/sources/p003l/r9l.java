package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r9l {
    /* JADX INFO: renamed from: a */
    public static void m9093a(HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView, View view) {
        homeThemeSlideEmptyCardView.a = (HomeThemeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideEmptyCardView.b = viewGroup.getChildAt(1);
        homeThemeSlideEmptyCardView.c = viewGroup.getChildAt(2);
        homeThemeSlideEmptyCardView.d = viewGroup.getChildAt(3);
        homeThemeSlideEmptyCardView.e = viewGroup.getChildAt(4);
    }
}
