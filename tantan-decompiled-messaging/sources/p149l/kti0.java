package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sunshine.engine.particle.SceneView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kti0 {
    /* JADX INFO: renamed from: a */
    public static void m147208a(jti0 jti0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jti0Var.f119609a = (VImage) viewGroup.getChildAt(0);
        jti0Var.f119610b = (VText) viewGroup.getChildAt(1);
        jti0Var.f119611c = (SceneView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m147209b(jti0 jti0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121361b, viewGroup, true);
        m147208a(jti0Var, viewInflate);
        return viewInflate;
    }
}
