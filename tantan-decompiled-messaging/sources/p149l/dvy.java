package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dvy {
    /* JADX INFO: renamed from: a */
    public static void m113856a(cvy cvyVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cvyVar.f82705a = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cvyVar.f82706b = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cvyVar.f82707c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        cvyVar.f82708d = (FrameLayout) viewGroup.getChildAt(1);
        cvyVar.f82709e = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cvyVar.f82710f = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        cvyVar.f82711g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m113857b(cvy cvyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126531o1, viewGroup, false);
        m113856a(cvyVar, viewInflate);
        return viewInflate;
    }
}
