package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.greet.NewDynamicGreetListItemView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mm20 {
    /* JADX INFO: renamed from: a */
    public static void m155296a(NewDynamicGreetListItemView newDynamicGreetListItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newDynamicGreetListItemView.f21509a = (HeaderFrameWrapper) viewGroup.getChildAt(0);
        newDynamicGreetListItemView.f21510b = viewGroup.getChildAt(1);
        newDynamicGreetListItemView.f21511c = (VText) viewGroup.getChildAt(2);
        newDynamicGreetListItemView.f21512d = (VText) viewGroup.getChildAt(3);
        newDynamicGreetListItemView.f21513e = (VText) viewGroup.getChildAt(4);
        newDynamicGreetListItemView.f21514f = (VFrame) viewGroup.getChildAt(5);
        newDynamicGreetListItemView.f21515g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        newDynamicGreetListItemView.f21516h = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        newDynamicGreetListItemView.f21517i = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(2);
        newDynamicGreetListItemView.f21518j = (VText) viewGroup.getChildAt(6);
        newDynamicGreetListItemView.f21519k = (VLinear) viewGroup.getChildAt(7);
        newDynamicGreetListItemView.f21520l = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        newDynamicGreetListItemView.f21521m = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        newDynamicGreetListItemView.f21522n = (VText) viewGroup.getChildAt(8);
    }
}
