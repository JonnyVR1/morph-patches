package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class gcw {
    /* JADX INFO: renamed from: a */
    public static void m129906a(fcw fcwVar, View view) {
        fcwVar.f98294j = (FrameLayout) view;
        fcwVar.f98295k = (SVGAnimationView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m129907b(fcw fcwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125929l6, viewGroup, false);
        m129906a(fcwVar, viewInflate);
        return viewInflate;
    }
}
