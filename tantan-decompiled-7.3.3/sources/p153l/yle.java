package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class yle {
    /* JADX INFO: renamed from: a */
    public static void m216568a(xle xleVar, View view) {
        xleVar.f194947u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        xleVar.f194948v = (VText) viewGroup.getChildAt(0);
        xleVar.f194949w = (LinearLayout) viewGroup.getChildAt(1);
        xleVar.f194950x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        xleVar.f194951y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m216569b(xle xleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125393E9, viewGroup, false);
        m216568a(xleVar, viewInflate);
        return viewInflate;
    }
}
