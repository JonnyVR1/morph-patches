package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.admob.GoogleAdAct;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class i6k {
    /* JADX INFO: renamed from: a */
    public static void m138825a(GoogleAdAct googleAdAct, View view) {
        googleAdAct.f22001c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        googleAdAct.f22002d = (VImage) viewGroup.getChildAt(0);
        googleAdAct.f22003e = (VFrame) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m138826b(GoogleAdAct googleAdAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125370D3, viewGroup, false);
        m138825a(googleAdAct, viewInflate);
        return viewInflate;
    }
}
