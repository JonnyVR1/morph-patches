package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ahe {
    /* JADX INFO: renamed from: a */
    public static void m5382a(DynamicGreetListItemView dynamicGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dynamicGreetListItemView.a = viewGroup.getChildAt(0);
        dynamicGreetListItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        dynamicGreetListItemView.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
