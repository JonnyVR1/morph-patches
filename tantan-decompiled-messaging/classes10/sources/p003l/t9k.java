package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageStateFourView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class t9k {
    /* JADX INFO: renamed from: a */
    public static void m9552a(GreetMessageStateFourView greetMessageStateFourView, View view) {
        greetMessageStateFourView.f1766a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateFourView.f1767b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f1768c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f1769d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateFourView.f1770e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        greetMessageStateFourView.f1771f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        greetMessageStateFourView.f1772g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        greetMessageStateFourView.f1773h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        greetMessageStateFourView.f1774i = viewGroup.getChildAt(1);
        greetMessageStateFourView.f1775j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f1776k = viewGroup.getChildAt(2);
        greetMessageStateFourView.f1777l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f1778m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        greetMessageStateFourView.f1779n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        greetMessageStateFourView.f1780o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f1781p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        greetMessageStateFourView.f1782q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        greetMessageStateFourView.f1783r = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f1784s = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        greetMessageStateFourView.f1785t = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
        greetMessageStateFourView.f1786u = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(2);
        greetMessageStateFourView.f1787v = viewGroup.getChildAt(3);
        greetMessageStateFourView.f1788w = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        greetMessageStateFourView.f1789x = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9553b(GreetMessageStateFourView greetMessageStateFourView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5922X, viewGroup, false);
        m9552a(greetMessageStateFourView, viewInflate);
        return viewInflate;
    }
}
