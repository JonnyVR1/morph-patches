package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ahe {
    /* JADX INFO: renamed from: a */
    public static void m96445a(DynamicGreetListItemView dynamicGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dynamicGreetListItemView.f21488a = (VFrame) viewGroup.getChildAt(0);
        dynamicGreetListItemView.f21489b = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f21490c = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f21491d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.f21492e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        dynamicGreetListItemView.f21493f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        dynamicGreetListItemView.f21494g = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.f21495h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        dynamicGreetListItemView.f21496i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        dynamicGreetListItemView.f21497j = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
