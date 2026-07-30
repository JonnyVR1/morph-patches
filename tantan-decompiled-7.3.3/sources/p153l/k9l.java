package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import p151v.VButton;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k9l {
    /* JADX INFO: renamed from: a */
    public static void m148869a(HomeErrorNetView homeErrorNetView, View view) {
        homeErrorNetView.f22391a = (HomeErrorNetView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeErrorNetView.f22392b = (VImage) viewGroup.getChildAt(0);
        homeErrorNetView.f22393c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        homeErrorNetView.f22394d = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
