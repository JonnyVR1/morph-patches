package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class brq {
    /* JADX INFO: renamed from: a */
    public static void m5785a(JustRealHeadContentLayout justRealHeadContentLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealHeadContentLayout.a = viewGroup.getChildAt(0);
        justRealHeadContentLayout.b = viewGroup.getChildAt(1);
        justRealHeadContentLayout.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
