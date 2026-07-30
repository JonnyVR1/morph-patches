package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageUserHeaderLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uck {
    /* JADX INFO: renamed from: a */
    public static void m195407a(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, View view) {
        greetMessageUserHeaderLayout.f30251a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageUserHeaderLayout.f30252b = (LinearLayout) viewGroup.getChildAt(0);
        greetMessageUserHeaderLayout.f30253c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageUserHeaderLayout.f30254d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageUserHeaderLayout.f30255e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageUserHeaderLayout.f30256f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageUserHeaderLayout.f30257g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageUserHeaderLayout.f30258h = (LinearLayout) viewGroup.getChildAt(1);
        greetMessageUserHeaderLayout.f30259i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        greetMessageUserHeaderLayout.f30260j = (LinearLayout) viewGroup.getChildAt(2);
        greetMessageUserHeaderLayout.f30261k = (VImage) view.findViewById(edc0.f93374h2);
        ViewGroup viewGroup2 = (ViewGroup) view;
        greetMessageUserHeaderLayout.f30262l = (VText) ((ViewGroup) viewGroup2.getChildAt(2)).getChildAt(1);
        greetMessageUserHeaderLayout.f30263m = (LinearLayout) viewGroup2.getChildAt(3);
        greetMessageUserHeaderLayout.f30264n = (VText) ((ViewGroup) viewGroup2.getChildAt(3)).getChildAt(1);
        greetMessageUserHeaderLayout.f30265o = (LinearLayout) viewGroup2.getChildAt(4);
        greetMessageUserHeaderLayout.f30266p = (VText) ((ViewGroup) viewGroup2.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m195408b(GreetMessageUserHeaderLayout greetMessageUserHeaderLayout, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156975Y, viewGroup, false);
        m195407a(greetMessageUserHeaderLayout, viewInflate);
        return viewInflate;
    }
}
