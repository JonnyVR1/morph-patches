package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cvd {
    /* JADX INFO: renamed from: a */
    public static void m112794a(bvd bvdVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bvdVar.f78579a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        bvdVar.f78580b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        bvdVar.f78581c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        bvdVar.f78582d = (VButton_FakeShadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        bvdVar.f78583e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m112795b(bvd bvdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167584p, viewGroup, false);
        m112794a(bvdVar, viewInflate);
        return viewInflate;
    }
}
