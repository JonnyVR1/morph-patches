package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetMessageMomentNewView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class r9k {
    /* JADX INFO: renamed from: a */
    public static void m178376a(GreetMessageMomentNewView greetMessageMomentNewView, View view) {
        greetMessageMomentNewView.f29366a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        greetMessageMomentNewView.f29367b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        greetMessageMomentNewView.f29368c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        greetMessageMomentNewView.f29369d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m178377b(GreetMessageMomentNewView greetMessageMomentNewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126395U, viewGroup, false);
        m178376a(greetMessageMomentNewView, viewInflate);
        return viewInflate;
    }
}
