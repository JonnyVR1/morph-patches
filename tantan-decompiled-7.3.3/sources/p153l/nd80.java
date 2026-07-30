package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class nd80 {
    /* JADX INFO: renamed from: a */
    public static void m162640a(md80 md80Var, View view) {
        md80Var._svga = (SVGAnimationView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m162641b(md80 md80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162606t0, viewGroup, false);
        m162640a(md80Var, viewInflate);
        return viewInflate;
    }
}
