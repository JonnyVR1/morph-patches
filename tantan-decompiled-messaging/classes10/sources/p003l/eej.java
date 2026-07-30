package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.GPHomeMissMatchView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class eej {
    /* JADX INFO: renamed from: a */
    public static void m6289a(GPHomeMissMatchView gPHomeMissMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPHomeMissMatchView.a = viewGroup.getChildAt(0);
        gPHomeMissMatchView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPHomeMissMatchView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPHomeMissMatchView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
