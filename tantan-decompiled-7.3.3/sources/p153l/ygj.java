package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.GPHomeMissMatchView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ygj {
    /* JADX INFO: renamed from: a */
    public static void m215843a(GPHomeMissMatchView gPHomeMissMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPHomeMissMatchView.f22372a = (VFrame) viewGroup.getChildAt(0);
        gPHomeMissMatchView.f22373b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPHomeMissMatchView.f22374c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPHomeMissMatchView.f22375d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
