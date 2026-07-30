package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qcl {
    /* JADX INFO: renamed from: a */
    public static void m176124a(HomeThemeSlideErrorNetView homeThemeSlideErrorNetView, View view) {
        homeThemeSlideErrorNetView.f24107a = (HomeThemeSlideErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideErrorNetView.f24108b = (VImage) viewGroup.getChildAt(0);
        homeThemeSlideErrorNetView.f24109c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeThemeSlideErrorNetView.f24110d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
