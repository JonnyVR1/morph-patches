package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class dxf {
    /* JADX INFO: renamed from: a */
    public static void m118466a(cxf cxfVar, View view) {
        cxfVar.f84213a = (VDraweeView) view.findViewById(wcc0.f188463u);
        ViewGroup viewGroup = (ViewGroup) view;
        cxfVar.f84214b = (VText) viewGroup.getChildAt(2);
        cxfVar.f84215c = (VText) viewGroup.getChildAt(3);
        cxfVar.f84216d = (VLinear) viewGroup.getChildAt(5);
        cxfVar.f84217e = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        cxfVar.f84218f = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        cxfVar.f84219g = (VImage) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        cxfVar.f84220h = (VButton_FakeShadow) viewGroup.getChildAt(6);
        cxfVar.f84221i = (VText) viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m118467b(cxf cxfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109134t, viewGroup, false);
        m118466a(cxfVar, viewInflate);
        return viewInflate;
    }
}
