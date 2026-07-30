package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hcl {
    /* JADX INFO: renamed from: a */
    public static void m134455a(HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView, View view) {
        homeThemeSlideEmptyCardView.f24099a = (HomeThemeSlideEmptyCardView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideEmptyCardView.f24100b = (VDraweeView) viewGroup.getChildAt(1);
        homeThemeSlideEmptyCardView.f24101c = (VText) viewGroup.getChildAt(2);
        homeThemeSlideEmptyCardView.f24102d = (VButton) viewGroup.getChildAt(3);
        homeThemeSlideEmptyCardView.f24103e = (VButton) viewGroup.getChildAt(4);
    }
}
