package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageStateNewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cak {
    /* JADX INFO: renamed from: a */
    public static void m5873a(GreetMessageStateNewView greetMessageStateNewView, View view) {
        greetMessageStateNewView.f1792a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateNewView.f1793b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateNewView.f1794c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateNewView.f1795d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateNewView.f1796e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m5874b(GreetMessageStateNewView greetMessageStateNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5916W, viewGroup, false);
        m5873a(greetMessageStateNewView, viewInflate);
        return viewInflate;
    }
}
