package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eie {
    /* JADX INFO: renamed from: a */
    public static void m120890a(DynamicGreetListItemView dynamicGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dynamicGreetListItemView.f22230a = (VFrame) viewGroup.getChildAt(0);
        dynamicGreetListItemView.f22231b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f22232c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f22233d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.f22234e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f22235f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.f22236g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.f22237h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.f22238i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        dynamicGreetListItemView.f22239j = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
