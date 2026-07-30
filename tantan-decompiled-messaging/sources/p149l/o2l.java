package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o2l {
    /* JADX INFO: renamed from: a */
    public static void m162301a(n2l n2lVar, View view) {
        n2lVar.f136840f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        n2lVar.f136841g = (VLinear) viewGroup.getChildAt(0);
        n2lVar.f136842h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n2lVar.f136843i = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        n2lVar.f136844j = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        n2lVar.f136845k = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        n2lVar.f136846l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m162302b(n2l n2lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95411J0, viewGroup, false);
        m162301a(n2lVar, viewInflate);
        return viewInflate;
    }
}
