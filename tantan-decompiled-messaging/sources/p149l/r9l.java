package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r9l {
    /* JADX INFO: renamed from: a */
    public static void m178378a(HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView, View view) {
        homeThemeSlideEmptyCardView.f23357a = (HomeThemeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideEmptyCardView.f23358b = (VDraweeView) viewGroup.getChildAt(1);
        homeThemeSlideEmptyCardView.f23359c = (VText) viewGroup.getChildAt(2);
        homeThemeSlideEmptyCardView.f23360d = (VButton) viewGroup.getChildAt(3);
        homeThemeSlideEmptyCardView.f23361e = (VButton) viewGroup.getChildAt(4);
    }
}
