package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class one {
    /* JADX INFO: renamed from: a */
    public static void m165168a(nne nneVar, View view) {
        nneVar.f139720u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nneVar.f139721v = (VText) viewGroup.getChildAt(0);
        nneVar.f139722w = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        nneVar.f139723x = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nneVar.f139724y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nneVar.f139725z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        nneVar.f139709A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        nneVar.f139710B = (LinearLayout) viewGroup.getChildAt(2);
        nneVar.f139711C = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        nneVar.f139712D = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        nneVar.f139713E = (LinearLayout) viewGroup.getChildAt(3);
        nneVar.f139714F = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nneVar.f139715G = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nneVar.f139716H = (LinearLayout) viewGroup.getChildAt(4);
        nneVar.f139717I = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nneVar.f139718J = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nneVar.f139719K = (LinearLayout) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m165169b(nne nneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95981ra, viewGroup, false);
        m165168a(nneVar, viewInflate);
        return viewInflate;
    }
}
