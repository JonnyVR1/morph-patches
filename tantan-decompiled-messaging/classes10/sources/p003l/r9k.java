package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.greet.GreetMessageMomentNewView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r9k {
    /* JADX INFO: renamed from: a */
    public static void m9091a(GreetMessageMomentNewView greetMessageMomentNewView, View view) {
        greetMessageMomentNewView.f1760a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageMomentNewView.f1761b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageMomentNewView.f1762c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageMomentNewView.f1763d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9092b(GreetMessageMomentNewView greetMessageMomentNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5904U, viewGroup, false);
        m9091a(greetMessageMomentNewView, viewInflate);
        return viewInflate;
    }
}
