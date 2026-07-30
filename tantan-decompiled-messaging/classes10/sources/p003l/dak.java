package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageUserHeaderLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dak {
    /* JADX INFO: renamed from: a */
    public static void m6095a(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, View view) {
        greetMessageUserHeaderLayout.f1797a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageUserHeaderLayout.f1798b = (LinearLayout) viewGroup.getChildAt(0);
        greetMessageUserHeaderLayout.f1799c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageUserHeaderLayout.f1800d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageUserHeaderLayout.f1801e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageUserHeaderLayout.f1802f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageUserHeaderLayout.f1803g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageUserHeaderLayout.f1804h = (LinearLayout) viewGroup.getChildAt(1);
        greetMessageUserHeaderLayout.f1805i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        greetMessageUserHeaderLayout.f1806j = (LinearLayout) viewGroup.getChildAt(2);
        greetMessageUserHeaderLayout.f1807k = view.findViewById(y4c0.f8856h2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        greetMessageUserHeaderLayout.f1808l = ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        greetMessageUserHeaderLayout.f1809m = (LinearLayout) viewGroup2.getChildAt(3);
        greetMessageUserHeaderLayout.f1810n = ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        greetMessageUserHeaderLayout.f1811o = (LinearLayout) viewGroup2.getChildAt(4);
        greetMessageUserHeaderLayout.f1812p = ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6096b(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5928Y, viewGroup, false);
        m6095a(greetMessageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
