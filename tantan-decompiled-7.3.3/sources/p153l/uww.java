package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VFrame_Anim;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uww {
    /* JADX INFO: renamed from: a */
    public static void m198393a(sww swwVar, View view) {
        swwVar.f171023c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        swwVar.f171024d = (VFrame_Anim) viewGroup.getChildAt(0);
        swwVar.f171025e = (VProgressBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        swwVar.f171026f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198394b(sww swwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125606Rd, viewGroup, false);
        m198393a(swwVar, viewInflate);
        return viewInflate;
    }
}
