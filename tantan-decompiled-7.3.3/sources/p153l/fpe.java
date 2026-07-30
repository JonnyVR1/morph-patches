package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fpe {
    /* JADX INFO: renamed from: a */
    public static void m126585a(epe epeVar, View view) {
        epeVar.f95233u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        epeVar.f95234v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        epeVar.f95235w = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        epeVar.f95236x = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        epeVar.f95237y = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        epeVar.f95238z = (LinearLayout) viewGroup.getChildAt(1);
        epeVar.f95225A = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        epeVar.f95226B = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        epeVar.f95227C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        epeVar.f95228D = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        epeVar.f95229E = (VLinear) viewGroup.getChildAt(2);
        epeVar.f95230F = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        epeVar.f95231G = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        epeVar.f95232H = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m126586b(epe epeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125619Sa, viewGroup, false);
        m126585a(epeVar, viewInflate);
        return viewInflate;
    }
}
