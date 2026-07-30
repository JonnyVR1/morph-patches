package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageMomentNewView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ick {
    /* JADX INFO: renamed from: a */
    public static void m139442a(GreetMessageMomentNewView greetMessageMomentNewView, View view) {
        greetMessageMomentNewView.f30214a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageMomentNewView.f30215b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageMomentNewView.f30216c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageMomentNewView.f30217d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m139443b(GreetMessageMomentNewView greetMessageMomentNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156951U, viewGroup, false);
        m139442a(greetMessageMomentNewView, viewInflate);
        return viewInflate;
    }
}
