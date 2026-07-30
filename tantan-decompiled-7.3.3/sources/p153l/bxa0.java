package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bxa0 {
    /* JADX INFO: renamed from: a */
    public static void m106870a(axa0 axa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        axa0Var.f73829u = (FrameLayout) viewGroup.getChildAt(0);
        axa0Var.f73830v = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        axa0Var.f73831w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        axa0Var.f73832x = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        axa0Var.f73833y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        axa0Var.f73834z = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m106871b(axa0 axa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125950ma, viewGroup, false);
        m106870a(axa0Var, viewInflate);
        return viewInflate;
    }
}
