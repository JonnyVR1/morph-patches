package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p147v.VCheckBox;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ozi {
    /* JADX INFO: renamed from: a */
    public static void m166841a(nzi nziVar, View view) {
        nziVar.f141221a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nziVar.f141222b = (CoordinatorLayout) viewGroup.getChildAt(0);
        nziVar.f141223c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nziVar.f141224d = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        nziVar.f141225e = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        nziVar.f141226f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        nziVar.f141227g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m166842b(nzi nziVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142017D2, viewGroup, false);
        m166841a(nziVar, viewInflate);
        return viewInflate;
    }
}
