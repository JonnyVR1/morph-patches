package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import p147v.VButton;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aal {
    /* JADX INFO: renamed from: a */
    public static void m95548a(HomeThemeSlideErrorNetView homeThemeSlideErrorNetView, View view) {
        homeThemeSlideErrorNetView.f23365a = (HomeThemeSlideErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeThemeSlideErrorNetView.f23366b = (VImage) viewGroup.getChildAt(0);
        homeThemeSlideErrorNetView.f23367c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeThemeSlideErrorNetView.f23368d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
