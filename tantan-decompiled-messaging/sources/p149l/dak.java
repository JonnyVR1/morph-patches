package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageUserHeaderLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dak {
    /* JADX INFO: renamed from: a */
    public static void m110613a(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, View view) {
        greetMessageUserHeaderLayout.f29403a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageUserHeaderLayout.f29404b = (LinearLayout) viewGroup.getChildAt(0);
        greetMessageUserHeaderLayout.f29405c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageUserHeaderLayout.f29406d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageUserHeaderLayout.f29407e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageUserHeaderLayout.f29408f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageUserHeaderLayout.f29409g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageUserHeaderLayout.f29410h = (LinearLayout) viewGroup.getChildAt(1);
        greetMessageUserHeaderLayout.f29411i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        greetMessageUserHeaderLayout.f29412j = (LinearLayout) viewGroup.getChildAt(2);
        greetMessageUserHeaderLayout.f29413k = (VImage) view.findViewById(y4c0.f196139h2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        greetMessageUserHeaderLayout.f29414l = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        greetMessageUserHeaderLayout.f29415m = (LinearLayout) viewGroup2.getChildAt(3);
        greetMessageUserHeaderLayout.f29416n = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        greetMessageUserHeaderLayout.f29417o = (LinearLayout) viewGroup2.getChildAt(4);
        greetMessageUserHeaderLayout.f29418p = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m110614b(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126419Y, viewGroup, false);
        m110613a(greetMessageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
