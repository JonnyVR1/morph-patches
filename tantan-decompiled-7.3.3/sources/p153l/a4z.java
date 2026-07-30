package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class a4z {
    /* JADX INFO: renamed from: a */
    public static void m96006a(z3z z3zVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        z3zVar.f202870a = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        z3zVar.f202871b = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        z3zVar.f202872c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        z3zVar.f202873d = (FrameLayout) viewGroup.getChildAt(1);
        z3zVar.f202874e = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        z3zVar.f202875f = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        z3zVar.f202876g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m96007b(z3z z3zVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157087o1, viewGroup, false);
        m96006a(z3zVar, viewInflate);
        return viewInflate;
    }
}
