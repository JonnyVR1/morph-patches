package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetMessageStateNewView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tck {
    /* JADX INFO: renamed from: a */
    public static void m190449a(GreetMessageStateNewView greetMessageStateNewView, View view) {
        greetMessageStateNewView.f30246a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateNewView.f30247b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateNewView.f30248c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateNewView.f30249d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateNewView.f30250e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m190450b(GreetMessageStateNewView greetMessageStateNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156963W, viewGroup, false);
        m190449a(greetMessageStateNewView, viewInflate);
        return viewInflate;
    }
}
