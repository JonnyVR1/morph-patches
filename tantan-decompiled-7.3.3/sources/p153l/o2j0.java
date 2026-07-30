package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sunshine.engine.particle.SceneView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o2j0 {
    /* JADX INFO: renamed from: a */
    public static void m165728a(n2j0 n2j0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        n2j0Var.f139868a = (VImage) viewGroup.getChildAt(0);
        n2j0Var.f139869b = (VText) viewGroup.getChildAt(1);
        n2j0Var.f139870c = (SceneView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m165729b(n2j0 n2j0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151969b, viewGroup, true);
        m165728a(n2j0Var, viewInflate);
        return viewInflate;
    }
}
