package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f2x {
    /* JADX INFO: renamed from: a */
    public static void m119239a(e2x e2xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        e2xVar.f88949a = (VFrame) viewGroup.getChildAt(0);
        e2xVar.f88950b = (VFrame) viewGroup.getChildAt(1);
        e2xVar.f88951c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        e2xVar.f88952d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        e2xVar.f88953e = (VFrame_Shadow) viewGroup.getChildAt(2);
        e2xVar.f88954f = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        e2xVar.f88955g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119240b(e2x e2xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137359j0, viewGroup, false);
        m119239a(e2xVar, viewInflate);
        return viewInflate;
    }
}
