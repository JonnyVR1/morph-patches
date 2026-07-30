package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aal {
    /* JADX INFO: renamed from: a */
    public static void m5312a(HomeThemeSlideErrorNetView homeThemeSlideErrorNetView, View view) {
        homeThemeSlideErrorNetView.a = (HomeThemeSlideErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideErrorNetView.b = viewGroup.getChildAt(0);
        homeThemeSlideErrorNetView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeThemeSlideErrorNetView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
