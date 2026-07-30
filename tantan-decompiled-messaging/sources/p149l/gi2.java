package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gi2 {
    /* JADX INFO: renamed from: a */
    public static void m126247a(fi2 fi2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fi2Var.f97606c = (VImage) viewGroup.getChildAt(0);
        fi2Var.f97607d = (VText) viewGroup.getChildAt(1);
        fi2Var.f97608e = (VText) viewGroup.getChildAt(2);
        fi2Var.f97609f = (VLinear) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m126248b(fi2 fi2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95936p, viewGroup, false);
        m126247a(fi2Var, viewInflate);
        return viewInflate;
    }
}
