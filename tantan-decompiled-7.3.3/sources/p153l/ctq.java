package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealHeadContentLayout;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealNumContentLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ctq {
    /* JADX INFO: renamed from: a */
    public static void m112546a(JustRealHeadContentLayout justRealHeadContentLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealHeadContentLayout.f23827a = (VText_Default_Bold) viewGroup.getChildAt(0);
        justRealHeadContentLayout.f23828b = (VLinear) viewGroup.getChildAt(1);
        justRealHeadContentLayout.f23829c = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.f23830d = (JustRealNumContentLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.f23831e = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        justRealHeadContentLayout.f23832f = (VText_Default_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        justRealHeadContentLayout.f23833g = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
