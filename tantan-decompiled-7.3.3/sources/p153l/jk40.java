package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.C9049a;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewUiHiddenNearByView;
import p151v.VLinear;
import p151v.VListCell;

/* JADX INFO: loaded from: classes10.dex */
public class jk40 {
    /* JADX INFO: renamed from: a */
    public static void m145152a(C9049a c9049a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c9049a.f37103n = (NewUiHiddenNearByView) viewGroup.getChildAt(0);
        c9049a.f37104o = viewGroup.getChildAt(1);
        c9049a.f37105p = (VListCell) viewGroup.getChildAt(2);
        c9049a.f37106q = (VListCell) viewGroup.getChildAt(4);
        c9049a.f37107r = (VListCell) viewGroup.getChildAt(6);
        c9049a.f37108s = (VListCell) viewGroup.getChildAt(8);
        c9049a.f37109t = (VLinear) viewGroup.getChildAt(9);
        c9049a.f37110u = (VListCell) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
    }
}
