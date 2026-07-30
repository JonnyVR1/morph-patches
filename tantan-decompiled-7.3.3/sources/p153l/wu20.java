package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.greet.NewDynamicGreetListItemView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wu20 {
    /* JADX INFO: renamed from: a */
    public static void m207917a(NewDynamicGreetListItemView newDynamicGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newDynamicGreetListItemView.f22251a = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        newDynamicGreetListItemView.f22252b = viewGroup.getChildAt(1);
        newDynamicGreetListItemView.f22253c = (VText) viewGroup.getChildAt(2);
        newDynamicGreetListItemView.f22254d = (VText) viewGroup.getChildAt(3);
        newDynamicGreetListItemView.f22255e = (VText) viewGroup.getChildAt(4);
        newDynamicGreetListItemView.f22256f = (VFrame) viewGroup.getChildAt(5);
        newDynamicGreetListItemView.f22257g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        newDynamicGreetListItemView.f22258h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        newDynamicGreetListItemView.f22259i = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        newDynamicGreetListItemView.f22260j = (VText) viewGroup.getChildAt(6);
        newDynamicGreetListItemView.f22261k = (VLinear) viewGroup.getChildAt(7);
        newDynamicGreetListItemView.f22262l = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        newDynamicGreetListItemView.f22263m = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        newDynamicGreetListItemView.f22264n = (VText) viewGroup.getChildAt(8);
    }
}
