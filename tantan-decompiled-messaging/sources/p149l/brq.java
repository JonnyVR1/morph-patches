package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealNumContentLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class brq {
    /* JADX INFO: renamed from: a */
    public static void m103597a(JustRealHeadContentLayout justRealHeadContentLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealHeadContentLayout.f23085a = (VText_Default_Bold) viewGroup.getChildAt(0);
        justRealHeadContentLayout.f23086b = (VLinear) viewGroup.getChildAt(1);
        justRealHeadContentLayout.f23087c = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.f23088d = (JustRealNumContentLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.f23089e = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.f23090f = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.f23091g = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
