package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageStateNewView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cak {
    /* JADX INFO: renamed from: a */
    public static void m105927a(GreetMessageStateNewView greetMessageStateNewView, View view) {
        greetMessageStateNewView.f29398a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageStateNewView.f29399b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageStateNewView.f29400c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageStateNewView.f29401d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        greetMessageStateNewView.f29402e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m105928b(GreetMessageStateNewView greetMessageStateNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126407W, viewGroup, false);
        m105927a(greetMessageStateNewView, viewInflate);
        return viewInflate;
    }
}
