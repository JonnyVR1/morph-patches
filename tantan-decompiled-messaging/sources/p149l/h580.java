package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes10.dex */
public class h580 {
    /* JADX INFO: renamed from: a */
    public static void m129382a(g580 g580Var, View view) {
        g580Var._svga = (SVGAnimationView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m129383b(g580 g580Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131646t0, viewGroup, false);
        m129382a(g580Var, viewInflate);
        return viewInflate;
    }
}
