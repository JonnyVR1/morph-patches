package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.MbtiLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wne {
    /* JADX INFO: renamed from: a */
    public static void m204678a(vne vneVar, View view) {
        vneVar.f182235u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vneVar.f182236v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vneVar.f182237w = (ProfileIntegrityOptView) viewGroup.getChildAt(1);
        vneVar.f182238x = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vneVar.f182239y = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vneVar.f182240z = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vneVar.f182228A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vneVar.f182229B = (LinearLayout) viewGroup.getChildAt(2);
        vneVar.f182230C = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vneVar.f182231D = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vneVar.f182232E = (MbtiLayout) viewGroup.getChildAt(3);
        vneVar.f182233F = (VLinear) viewGroup.getChildAt(4);
        vneVar.f182234G = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m204679b(vne vneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95309Ca, viewGroup, false);
        m204678a(vneVar, viewInflate);
        return viewInflate;
    }
}
